package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.text.SpannableStringBuilder;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.Components.ColoredImageSpan;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.ViewPagerFixed;
import org.telegram.ui.Stories.StoriesController;

/* loaded from: classes4.dex */
public abstract class ProfileStoriesCollectionTabs extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    private final Adapter adapter;
    private final StoriesController.StoriesCollections collections;
    int initialAlbumId;
    private boolean reorderingCollections;
    private final Runnable sendCollectionsOrder;
    private final ViewPagerFixed.TabsView tabsView;
    private final ViewPagerFixed viewPager;
    private ValueAnimator visibilityAnimator;
    private float visibilityFactor;
    private boolean visibilityValue;

    public interface Delegate {
        void onTabAlbumAnimationUpdate(float f);

        void onTabAlbumCreateCollection();

        void onTabAlbumLongClick(View view, int i);

        void onTabAlbumScrollEnd(int i);

        void onTabAlbumSelected(int i, boolean z);
    }

    protected abstract void updatedReordering(boolean z);

    public ProfileStoriesCollectionTabs(Context context, final StoriesController.StoriesCollections storiesCollections, final Delegate delegate) {
        super(context);
        this.collections = storiesCollections;
        Objects.requireNonNull(storiesCollections);
        this.sendCollectionsOrder = new Runnable() { // from class: org.telegram.ui.ProfileStoriesCollectionTabs$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                StoriesController.StoriesCollections.this.sendOrder();
            }
        };
        ViewPagerFixed viewPagerFixed = new ViewPagerFixed(context) { // from class: org.telegram.ui.ProfileStoriesCollectionTabs.1
            @Override // org.telegram.ui.Components.ViewPagerFixed
            public void onTabAnimationUpdate(boolean z) {
                super.onTabAnimationUpdate(z);
                Delegate delegate2 = delegate;
                if (delegate2 != null) {
                    delegate2.onTabAlbumAnimationUpdate(ProfileStoriesCollectionTabs.this.tabsView.getAnimatingIndicatorProgress());
                }
            }

            @Override // org.telegram.ui.Components.ViewPagerFixed
            protected void onTabScrollEnd(int i) {
                super.onTabScrollEnd(i);
                Delegate delegate2 = delegate;
                if (delegate2 != null) {
                    delegate2.onTabAlbumScrollEnd(ProfileStoriesCollectionTabs.this.getAlbumIdByPosition(i));
                }
            }

            @Override // org.telegram.ui.Components.ViewPagerFixed
            protected void onTabPageSelected(int i, boolean z) {
                Delegate delegate2 = delegate;
                if (delegate2 != null) {
                    delegate2.onTabAlbumSelected(ProfileStoriesCollectionTabs.this.getAlbumIdByPosition(i), z);
                }
            }
        };
        this.viewPager = viewPagerFixed;
        viewPagerFixed.setAllowDisallowInterceptTouch(true);
        Adapter adapter = new Adapter();
        this.adapter = adapter;
        adapter.canCreateNewAlbum = storiesCollections.canCreateNewAlbum();
        viewPagerFixed.setAdapter(adapter);
        viewPagerFixed.setTranslationY(AndroidUtilities.dp(42.0f));
        ViewPagerFixed.TabsView createTabsView = viewPagerFixed.createTabsView(true, 9);
        this.tabsView = createTabsView;
        createTabsView.tabMarginDp = 12;
        createTabsView.setPreTabClick(new Utilities.Callback2Return() { // from class: org.telegram.ui.ProfileStoriesCollectionTabs$$ExternalSyntheticLambda1
            @Override // org.telegram.messenger.Utilities.Callback2Return
            public final Object run(Object obj, Object obj2) {
                Boolean lambda$new$0;
                lambda$new$0 = ProfileStoriesCollectionTabs.this.lambda$new$0(delegate, (Integer) obj, (Integer) obj2);
                return lambda$new$0;
            }
        });
        createTabsView.setOnTabLongClick(new Utilities.Callback2Return() { // from class: org.telegram.ui.ProfileStoriesCollectionTabs$$ExternalSyntheticLambda2
            @Override // org.telegram.messenger.Utilities.Callback2Return
            public final Object run(Object obj, Object obj2) {
                Boolean lambda$new$1;
                lambda$new$1 = ProfileStoriesCollectionTabs.this.lambda$new$1(delegate, (Integer) obj, (View) obj2);
                return lambda$new$1;
            }
        });
        addView(createTabsView, LayoutHelper.createFrame(-1, 42, 48));
        setVisibility(!storiesCollections.collections.isEmpty(), false, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Boolean lambda$new$0(Delegate delegate, Integer num, Integer num2) {
        if (this.reorderingCollections) {
            return Boolean.TRUE;
        }
        if (num.intValue() == -1) {
            if (delegate != null) {
                delegate.onTabAlbumCreateCollection();
            }
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Boolean lambda$new$1(Delegate delegate, Integer num, View view) {
        if (num.intValue() == -1 || num.intValue() == 0 || this.reorderingCollections) {
            return Boolean.FALSE;
        }
        if (delegate != null) {
            delegate.onTabAlbumLongClick(view, num.intValue());
        }
        return Boolean.TRUE;
    }

    public void setInitialTabId(final int i) {
        if (this.adapter.getItemPosition(i) != -1) {
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.ProfileStoriesCollectionTabs$$ExternalSyntheticLambda3
                @Override // java.lang.Runnable
                public final void run() {
                    ProfileStoriesCollectionTabs.this.lambda$setInitialTabId$2(i);
                }
            }, 500L);
        } else {
            this.initialAlbumId = i;
        }
    }

    public int getCurrentAlbumId() {
        return this.adapter.getItemId(this.tabsView.getCurrentPosition());
    }

    public int getNextAlbumId(boolean z) {
        return this.tabsView.getNextPageId(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getAlbumIdByPosition(int i) {
        return this.tabsView.getPageIdByPosition(i);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getInstance(this.collections.currentAccount).addObserver(this, NotificationCenter.storyAlbumsCollectionsUpdate);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.collections.currentAccount).addObserver(this, NotificationCenter.storyAlbumsCollectionsUpdate);
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == NotificationCenter.storyAlbumsCollectionsUpdate && ((Long) objArr[0]).longValue() == this.collections.dialogId) {
            ViewPagerFixed.TabsView tabsView = this.tabsView;
            int currentTabId = tabsView != null ? tabsView.getCurrentTabId() : 0;
            this.adapter.canCreateNewAlbum = this.collections.canCreateNewAlbum();
            this.viewPager.fillTabs(true);
            setVisibility(!this.collections.collections.isEmpty(), true, false);
            int i3 = this.initialAlbumId;
            if (i3 > 0) {
                if (this.adapter.getItemPosition(i3) != -1) {
                    final int i4 = this.initialAlbumId;
                    AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.ProfileStoriesCollectionTabs$$ExternalSyntheticLambda5
                        @Override // java.lang.Runnable
                        public final void run() {
                            ProfileStoriesCollectionTabs.this.lambda$didReceivedNotification$3(i4);
                        }
                    }, 500L);
                    this.initialAlbumId = 0;
                    return;
                }
                return;
            }
            if (this.tabsView == null || currentTabId <= 0 || this.collections.findById(currentTabId) != null) {
                return;
            }
            this.tabsView.scrollToTab(0, 0);
        }
    }

    public void selectTabWithId(int i, float f) {
        this.tabsView.selectTabWithId(i, f);
    }

    /* renamed from: scrollToAlbumId, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public void lambda$setInitialTabId$2(int i) {
        this.tabsView.scrollToTab(i, this.adapter.getItemPosition(i));
    }

    public boolean isReordering() {
        return this.reorderingCollections;
    }

    public void resetReordering() {
        setReorderingAlbums(false);
    }

    public void setReorderingAlbums(boolean z) {
        if (this.reorderingCollections == z) {
            return;
        }
        this.reorderingCollections = z;
        this.tabsView.setReordering(z);
        updatedReordering(isReordering());
        if (z) {
            final BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
            if (safeLastFragment instanceof ProfileActivity) {
                ((ProfileActivity) safeLastFragment).scrollToSharedMedia(false);
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.ProfileStoriesCollectionTabs$$ExternalSyntheticLambda4
                    @Override // java.lang.Runnable
                    public final void run() {
                        ProfileStoriesCollectionTabs.lambda$setReorderingAlbums$4(BaseFragment.this);
                    }
                });
            }
        }
        if (z) {
            return;
        }
        AndroidUtilities.cancelRunOnUIThread(this.sendCollectionsOrder);
        this.collections.reorderComplete(false);
        int itemId = this.adapter.getItemId(this.tabsView.getCurrentPosition());
        this.viewPager.fillTabs(true);
        int itemPosition = this.adapter.getItemPosition(itemId);
        this.tabsView.selectTab(itemPosition, itemPosition, 0.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$setReorderingAlbums$4(BaseFragment baseFragment) {
        ((ProfileActivity) baseFragment).scrollToSharedMedia(true);
    }

    private void setVisibility(boolean z, boolean z2, boolean z3) {
        if (this.visibilityValue != z || z3) {
            this.visibilityValue = z;
            setEnabled(z);
            ValueAnimator valueAnimator = this.visibilityAnimator;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.visibilityAnimator = null;
            }
            if (!z2) {
                float f = z ? 1.0f : 0.0f;
                this.visibilityFactor = f;
                onVisibilityChange(f);
            } else {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.visibilityFactor, z ? 1.0f : 0.0f);
                this.visibilityAnimator = ofFloat;
                ofFloat.setDuration(480L);
                this.visibilityAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
                this.visibilityAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.ProfileStoriesCollectionTabs$$ExternalSyntheticLambda6
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                        ProfileStoriesCollectionTabs.this.lambda$setVisibility$5(valueAnimator2);
                    }
                });
                this.visibilityAnimator.start();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setVisibility$5(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.visibilityFactor = floatValue;
        onVisibilityChange(floatValue);
    }

    protected void onVisibilityChange(float f) {
        invalidate();
    }

    public float getVisibilityFactor() {
        return this.visibilityFactor;
    }

    public float getVisualHeight() {
        return getMeasuredHeight() * this.visibilityFactor;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.visibilityValue && super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        if (this.visibilityFactor == 0.0f) {
            return;
        }
        canvas.save();
        canvas.clipRect(0.0f, 0.0f, getMeasuredWidth(), getVisualHeight());
        super.draw(canvas);
        canvas.restore();
    }

    private class Adapter extends ViewPagerFixed.Adapter {
        private boolean canCreateNewAlbum;

        @Override // org.telegram.ui.Components.ViewPagerFixed.Adapter
        public void bindView(View view, int i, int i2) {
        }

        private Adapter() {
        }

        @Override // org.telegram.ui.Components.ViewPagerFixed.Adapter
        public int getItemCount() {
            return ProfileStoriesCollectionTabs.this.collections.collections.size() + 1 + (this.canCreateNewAlbum ? 1 : 0);
        }

        @Override // org.telegram.ui.Components.ViewPagerFixed.Adapter
        public View createView(int i) {
            if (i == -1) {
                return null;
            }
            return new View(ProfileStoriesCollectionTabs.this.getContext());
        }

        @Override // org.telegram.ui.Components.ViewPagerFixed.Adapter
        public boolean canReorder(int i) {
            if (i == 0) {
                return false;
            }
            return (this.canCreateNewAlbum && i == getItemCount() - 1) ? false : true;
        }

        @Override // org.telegram.ui.Components.ViewPagerFixed.Adapter
        public void applyReorder(ArrayList arrayList) {
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Integer num = (Integer) it.next();
                int intValue = num.intValue();
                if (intValue != -1 && intValue != -2 && intValue != 0) {
                    arrayList2.add(num);
                }
            }
            int itemId = getItemId(ProfileStoriesCollectionTabs.this.tabsView.getCurrentPosition());
            ProfileStoriesCollectionTabs.this.collections.reorderStep(arrayList2);
            Log.i("WTF_DEBUG", "" + ProfileStoriesCollectionTabs.this.tabsView.getCurrentPosition() + " " + itemId);
            if (itemId >= 0) {
                int itemPosition = getItemPosition(itemId);
                ProfileStoriesCollectionTabs.this.tabsView.selectTab(itemPosition, itemPosition, 0.0f);
            }
            AndroidUtilities.cancelRunOnUIThread(ProfileStoriesCollectionTabs.this.sendCollectionsOrder);
            AndroidUtilities.runOnUIThread(ProfileStoriesCollectionTabs.this.sendCollectionsOrder, 1000L);
        }

        public int getItemPosition(int i) {
            if (i == 0) {
                return 0;
            }
            int indexOf = ProfileStoriesCollectionTabs.this.collections.indexOf(i);
            if (indexOf == -1) {
                return -1;
            }
            return indexOf + 1;
        }

        @Override // org.telegram.ui.Components.ViewPagerFixed.Adapter
        public int getItemId(int i) {
            if (i == 0) {
                return 0;
            }
            if (this.canCreateNewAlbum && i == getItemCount() - 1) {
                return -1;
            }
            return ((StoriesController.StoryAlbum) ProfileStoriesCollectionTabs.this.collections.collections.get(i - 1)).album_id;
        }

        @Override // org.telegram.ui.Components.ViewPagerFixed.Adapter
        public int getItemViewType(int i) {
            if (this.canCreateNewAlbum && i == getItemCount() - 1) {
                return -1;
            }
            return i;
        }

        @Override // org.telegram.ui.Components.ViewPagerFixed.Adapter
        public CharSequence getItemTitle(int i) {
            if (i == 0) {
                return LocaleController.getString(R.string.StoriesAlbumNameAllStories);
            }
            if (this.canCreateNewAlbum && i == getItemCount() - 1) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("+ ");
                spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.StoriesAlbumAddAlbum));
                ColoredImageSpan coloredImageSpan = new ColoredImageSpan(R.drawable.poll_add_plus);
                coloredImageSpan.spaceScaleX = 0.8f;
                spannableStringBuilder.setSpan(coloredImageSpan, 0, 1, 33);
                return spannableStringBuilder;
            }
            return ((StoriesController.StoryAlbum) ProfileStoriesCollectionTabs.this.collections.collections.get(i - 1)).title;
        }
    }
}
