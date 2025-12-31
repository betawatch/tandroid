package org.telegram.ui;

import android.content.Context;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import java.util.ArrayList;
import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.ViewPagerFixed;

/* loaded from: classes4.dex */
public abstract class ViewPagerActivity extends BaseFragment {
    protected FrameLayout contentView;
    private boolean isFullyVisible;
    private boolean isResumed;
    private String titleOverlay;
    private Runnable titleOverlayAction;
    private int titleOverlayId;
    protected ViewPagerFixed viewPager;
    private final SparseArray fragmentsArr = new SparseArray();
    private int initialFragmentPosition = -1;
    private float visibilityByParent = 0.0f;
    protected final Iterable fragments = new Iterable() { // from class: org.telegram.ui.ViewPagerActivity$$ExternalSyntheticLambda0
        @Override // java.lang.Iterable
        public final Iterator iterator() {
            Iterator fragmentsIterator;
            fragmentsIterator = ViewPagerActivity.this.getFragmentsIterator();
            return fragmentsIterator;
        }
    };

    protected abstract boolean canScrollBackward(MotionEvent motionEvent);

    protected abstract boolean canScrollForward(MotionEvent motionEvent);

    @Override // org.telegram.ui.ActionBar.BaseFragment
    public ActionBar createActionBar(Context context) {
        return null;
    }

    protected abstract BaseFragment createBaseFragmentAt(int i);

    protected abstract FrameLayout createContentView(Context context);

    protected abstract int getFragmentsCount();

    protected abstract int getStartPosition();

    @Override // org.telegram.ui.ActionBar.BaseFragment
    public boolean isSupportEdgeToEdge() {
        return true;
    }

    protected abstract void onViewPagerScrollEnd();

    protected abstract void onViewPagerTabAnimationUpdate(boolean z);

    @Override // org.telegram.ui.ActionBar.BaseFragment
    public View createView(final Context context) {
        this.contentView = createContentView(context);
        this.viewPager = new ViewPagerFixed(context) { // from class: org.telegram.ui.ViewPagerActivity.1
            @Override // org.telegram.ui.Components.ViewPagerFixed
            protected void onScrollEnd() {
                super.onScrollEnd();
                ViewPagerActivity.this.onViewPagerScrollEnd();
                ViewPagerActivity.this.checkFragmentsVisibility();
            }

            @Override // org.telegram.ui.Components.ViewPagerFixed
            protected float getAvailableTranslationX() {
                return getMeasuredWidth();
            }

            @Override // org.telegram.ui.Components.ViewPagerFixed
            protected void onItemSelected(View view, View view2, int i, int i2) {
                super.onItemSelected(view, view2, i, i2);
                ViewPagerActivity.this.checkFragmentsVisibility();
            }

            @Override // org.telegram.ui.Components.ViewPagerFixed
            public void onTabAnimationUpdate(boolean z) {
                super.onTabAnimationUpdate(z);
                ViewPagerActivity.this.onViewPagerTabAnimationUpdate(z);
                ViewPagerActivity.this.checkFragmentsVisibility();
                ViewPagerActivity.this.checkSystemBarColors();
            }

            @Override // org.telegram.ui.Components.ViewPagerFixed
            protected boolean canScrollBackward(MotionEvent motionEvent) {
                return ViewPagerActivity.this.canScrollBackward(motionEvent);
            }

            @Override // org.telegram.ui.Components.ViewPagerFixed
            protected boolean canScrollForward(MotionEvent motionEvent) {
                return ViewPagerActivity.this.canScrollForward(motionEvent);
            }
        };
        if (this.initialFragmentPosition == -1) {
            this.initialFragmentPosition = getStartPosition();
        }
        this.viewPager.setPosition(this.initialFragmentPosition);
        this.viewPager.setAdapter(new ViewPagerFixed.Adapter() { // from class: org.telegram.ui.ViewPagerActivity.2
            @Override // org.telegram.ui.Components.ViewPagerFixed.Adapter
            public int getItemCount() {
                return ViewPagerActivity.this.getFragmentsCount();
            }

            @Override // org.telegram.ui.Components.ViewPagerFixed.Adapter
            public View createView(int i) {
                return new FrameLayout(context);
            }

            @Override // org.telegram.ui.Components.ViewPagerFixed.Adapter
            public void bindView(View view, int i, int i2) {
                BaseFragment baseFragment;
                FragmentState fragmentState = (FragmentState) ViewPagerActivity.this.fragmentsArr.get(i);
                if (fragmentState != null) {
                    baseFragment = fragmentState.fragment;
                } else {
                    BaseFragment createBaseFragmentAt = ViewPagerActivity.this.createBaseFragmentAt(i);
                    FragmentState fragmentState2 = new FragmentState(createBaseFragmentAt);
                    ViewPagerActivity.this.fragmentsArr.put(i, fragmentState2);
                    baseFragment = createBaseFragmentAt;
                    fragmentState = fragmentState2;
                }
                if (!fragmentState.onCreateCalled) {
                    baseFragment.onFragmentCreate();
                    fragmentState.onCreateCalled = true;
                }
                baseFragment.setParentLayout(ViewPagerActivity.this.getParentLayout());
                if (baseFragment.getFragmentView() == null) {
                    baseFragment.createView(context);
                    baseFragment.setTitleOverlayText(ViewPagerActivity.this.titleOverlay, ViewPagerActivity.this.titleOverlayId, ViewPagerActivity.this.titleOverlayAction);
                }
                FrameLayout frameLayout = (FrameLayout) view;
                frameLayout.removeAllViews();
                AndroidUtilities.removeFromParent(baseFragment.getFragmentView());
                frameLayout.addView(baseFragment.getFragmentView(), LayoutHelper.createFrame(-1, -1.0f));
                if (baseFragment.getActionBar() != null && baseFragment.getActionBar().shouldAddToContainer()) {
                    AndroidUtilities.removeFromParent(baseFragment.getActionBar());
                    frameLayout.addView(baseFragment.getActionBar());
                }
                ViewCompat.requestApplyInsets(frameLayout);
                ViewPagerActivity.this.checkSystemBarColors();
                ViewPagerActivity.this.checkFragmentsVisibility();
            }
        });
        this.contentView.addView(this.viewPager, LayoutHelper.createFrame(-1, -1.0f));
        FrameLayout frameLayout = this.contentView;
        this.fragmentView = frameLayout;
        ViewCompat.setOnApplyWindowInsetsListener(frameLayout, new OnApplyWindowInsetsListener() { // from class: org.telegram.ui.ViewPagerActivity$$ExternalSyntheticLambda1
            @Override // androidx.core.view.OnApplyWindowInsetsListener
            public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
                return ViewPagerActivity.this.onApplyWindowInsets(view, windowInsetsCompat);
            }
        });
        return this.fragmentView;
    }

    protected void putFragmentAtPosition(int i, BaseFragment baseFragment) {
        this.fragmentsArr.put(i, new FragmentState(baseFragment));
    }

    protected WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
        View fragmentView;
        int size = this.fragmentsArr.size();
        for (int i = 0; i < size; i++) {
            FragmentState fragmentState = (FragmentState) this.fragmentsArr.valueAt(i);
            if (fragmentState != null && (fragmentView = fragmentState.fragment.getFragmentView()) != null) {
                ViewCompat.dispatchApplyWindowInsets(fragmentView, windowInsetsCompat);
            }
        }
        return WindowInsetsCompat.CONSUMED;
    }

    public BaseFragment getCurrentVisibleFragment() {
        ViewPagerFixed viewPagerFixed = this.viewPager;
        if (viewPagerFixed == null) {
            return null;
        }
        FragmentState fragmentState = (FragmentState) this.fragmentsArr.get(viewPagerFixed.getCurrentPosition());
        if (fragmentState != null) {
            return fragmentState.fragment;
        }
        return null;
    }

    @Override // org.telegram.ui.ActionBar.BaseFragment
    public void clearViews() {
        ViewPagerFixed viewPagerFixed = this.viewPager;
        if (viewPagerFixed != null) {
            this.initialFragmentPosition = viewPagerFixed.getCurrentPosition();
        }
        int size = this.fragmentsArr.size();
        for (int i = 0; i < size; i++) {
            FragmentState fragmentState = (FragmentState) this.fragmentsArr.valueAt(i);
            if (fragmentState != null) {
                fragmentState.fragment.clearViews();
            }
        }
        super.clearViews();
    }

    @Override // org.telegram.ui.ActionBar.BaseFragment
    public boolean isLightStatusBar() {
        BaseFragment currentVisibleFragment = getCurrentVisibleFragment();
        return (currentVisibleFragment == null || currentVisibleFragment.fragmentView == null) ? super.isLightStatusBar() : currentVisibleFragment.isLightStatusBar();
    }

    @Override // org.telegram.ui.ActionBar.BaseFragment
    public boolean onBackPressed(boolean z) {
        if (hasShownSheet()) {
            if (z) {
                closeSheet();
            }
            return false;
        }
        BaseFragment currentVisibleFragment = getCurrentVisibleFragment();
        if (currentVisibleFragment == null || currentVisibleFragment.onBackPressed(z)) {
            return super.onBackPressed(z);
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.BaseFragment
    public ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        int size = this.fragmentsArr.size();
        for (int i = 0; i < size; i++) {
            FragmentState fragmentState = (FragmentState) this.fragmentsArr.valueAt(i);
            if (fragmentState != null) {
                BaseFragment baseFragment = fragmentState.fragment;
                if (baseFragment.fragmentView != null) {
                    arrayList.addAll(baseFragment.getThemeDescriptions());
                }
            }
        }
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.BaseFragment
    public void onPause() {
        super.onPause();
        this.isResumed = false;
        checkFragmentsVisibility();
    }

    @Override // org.telegram.ui.ActionBar.BaseFragment
    public void onResume() {
        super.onResume();
        this.isResumed = true;
        checkSystemBarColors();
        checkFragmentsVisibility();
    }

    @Override // org.telegram.ui.ActionBar.BaseFragment
    public void onTransitionAnimationProgress(boolean z, float f) {
        super.onTransitionAnimationProgress(z, f);
        if (!z) {
            f = 1.0f - f;
        }
        this.visibilityByParent = f;
        checkFragmentsVisibility();
    }

    @Override // org.telegram.ui.ActionBar.BaseFragment
    public void onBecomeFullyHidden() {
        super.onBecomeFullyHidden();
        this.visibilityByParent = 0.0f;
        this.isFullyVisible = false;
        checkFragmentsVisibility();
    }

    @Override // org.telegram.ui.ActionBar.BaseFragment
    public void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        this.visibilityByParent = 1.0f;
        this.isFullyVisible = true;
        checkFragmentsVisibility();
        checkSystemBarColors();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void checkFragmentsVisibility() {
        int size = this.fragmentsArr.size();
        for (int i = 0; i < size; i++) {
            FragmentState fragmentState = (FragmentState) this.fragmentsArr.valueAt(i);
            int keyAt = this.fragmentsArr.keyAt(i);
            if (fragmentState != null && fragmentState.fragment.fragmentView != null) {
                float positionVisibility = this.viewPager.getPositionVisibility(keyAt);
                boolean z = this.isResumed;
                fragmentState.setVisibility(positionVisibility, z ? this.visibilityByParent : 0.0f, this.isFullyVisible, z);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.BaseFragment
    public void setTitleOverlayTextIfActionBarAttached(String str, int i, Runnable runnable) {
        setTitleOverlayText(str, i, runnable);
    }

    @Override // org.telegram.ui.ActionBar.BaseFragment
    public void setTitleOverlayText(String str, int i, Runnable runnable) {
        super.setTitleOverlayText(str, i, runnable);
        this.titleOverlay = str;
        this.titleOverlayId = i;
        this.titleOverlayAction = runnable;
        int size = this.fragmentsArr.size();
        for (int i2 = 0; i2 < size; i2++) {
            FragmentState fragmentState = (FragmentState) this.fragmentsArr.valueAt(i2);
            if (fragmentState != null) {
                fragmentState.fragment.setTitleOverlayText(str, i, runnable);
            }
        }
    }

    private static class FragmentState {
        public final BaseFragment fragment;
        private boolean isFullyVisible;
        private boolean isInAnimation;
        private boolean isResumed;
        private float lastVisibility;
        private boolean onCreateCalled;

        public void setVisibility(float f, float f2, boolean z, boolean z2) {
            float f3 = this.lastVisibility;
            float f4 = f2 * f;
            this.lastVisibility = f4;
            boolean z3 = f4 > f3;
            if (!this.isResumed && f4 > 0.0f) {
                this.fragment.onResume();
                this.isResumed = true;
            }
            if (!this.isInAnimation && ((f3 == 0.0f || f3 == 1.0f) && f3 != f4 && Math.abs(f3 - f4) != 1.0f)) {
                this.fragment.onTransitionAnimationStart(z3, false);
                this.isInAnimation = true;
            }
            if (this.isInAnimation && f3 != f4) {
                this.fragment.onTransitionAnimationProgress(z3, z3 ? f4 : 1.0f - f4);
            }
            if (this.isInAnimation && (f4 == 0.0f || f4 == 1.0f)) {
                this.fragment.onTransitionAnimationEnd(z3, false);
                this.isInAnimation = false;
            }
            if (!this.isFullyVisible && f4 >= 1.0f) {
                this.fragment.onBecomeFullyVisible();
                this.isFullyVisible = true;
            }
            if (this.isFullyVisible && ((f4 == 0.0f && !z) || f == 0.0f)) {
                this.fragment.onBecomeFullyHidden();
                this.isFullyVisible = false;
            }
            if (this.isResumed) {
                if ((f4 != 0.0f || z2) && f != 0.0f) {
                    return;
                }
                this.fragment.onPause();
                this.isResumed = false;
            }
        }

        private FragmentState(BaseFragment baseFragment) {
            this.fragment = baseFragment;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int findNext(int i) {
        int size = this.fragmentsArr.size();
        while (i < size) {
            if (((FragmentState) this.fragmentsArr.valueAt(i)) != null) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Iterator getFragmentsIterator() {
        return new Iterator() { // from class: org.telegram.ui.ViewPagerActivity.3
            int nextIndex;

            {
                this.nextIndex = ViewPagerActivity.this.findNext(0);
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.nextIndex != -1;
            }

            @Override // java.util.Iterator
            public BaseFragment next() {
                BaseFragment baseFragment = ((FragmentState) ViewPagerActivity.this.fragmentsArr.valueAt(this.nextIndex)).fragment;
                this.nextIndex = ViewPagerActivity.this.findNext(this.nextIndex + 1);
                return baseFragment;
            }
        };
    }
}
