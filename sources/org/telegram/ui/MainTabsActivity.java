package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RecordingCanvas;
import android.graphics.RectF;
import android.graphics.drawable.ShapeDrawable;
import android.os.Build;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.math.MathUtils;
import androidx.core.view.WindowInsetsCompat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import me.vkryl.android.AnimatorUtils;
import me.vkryl.android.animator.BoolAnimator;
import me.vkryl.android.animator.FactorAnimator;
import me.vkryl.android.util.ClickHelper;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.utils.ViewOutlineProviderImpl;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ActionBar.ThemeDescription;
import org.telegram.ui.Components.AvatarDrawable;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.ItemOptions;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.Premium.LimitReachedBottomSheet;
import org.telegram.ui.Components.ScaleStateListAnimator;
import org.telegram.ui.Components.ViewPagerFixed;
import org.telegram.ui.Components.blur3.BlurredBackgroundDrawableViewFactory;
import org.telegram.ui.Components.blur3.BlurredBackgroundWithFadeDrawable;
import org.telegram.ui.Components.blur3.drawable.BlurredBackgroundDrawable;
import org.telegram.ui.Components.blur3.drawable.color.BlurredBackgroundColorProviderThemed;
import org.telegram.ui.Components.blur3.source.BlurredBackgroundSource;
import org.telegram.ui.Components.blur3.source.BlurredBackgroundSourceColor;
import org.telegram.ui.Components.blur3.source.BlurredBackgroundSourceRenderNode;
import org.telegram.ui.Components.chat.ViewPositionWatcher;
import org.telegram.ui.Components.glass.GlassTabView;
import org.telegram.ui.Components.glass.GlassTabsView;

/* loaded from: classes4.dex */
public class MainTabsActivity extends ViewPagerActivity implements NotificationCenter.NotificationCenterDelegate, FactorAnimator.Target {
    private DialogsActivity dialogsActivity;
    private View fadeView;
    private final BlurredBackgroundColorProviderThemed iBlur3ColorProviderTabs;
    private final BlurredBackgroundColorProviderThemed iBlur3ColorProviderWhite;
    private final BlurredBackgroundSourceColor iBlur3SourceColor;
    private final BlurredBackgroundSourceRenderNode iBlur3SourceTabGlass;
    private int navigationBarHeight;
    private TabsSelectorView tabsView;
    private BlurredBackgroundDrawable tabsViewBackground;
    private IUpdateLayout updateLayout;
    private UpdateLayoutWrapper updateLayoutWrapper;
    private final BoolAnimator animatorTabsVisible = new BoolAnimator(0, this, CubicBezierInterpolator.EASE_OUT_QUINT, 380, true);
    private final RectF fragmentPosition = new RectF();

    public interface TabFragmentDelegate {

        public abstract /* synthetic */ class -CC {
            public static boolean $default$canParentTabsSlide(TabFragmentDelegate tabFragmentDelegate, MotionEvent motionEvent, boolean z) {
                return false;
            }
        }

        boolean canParentTabsSlide(MotionEvent motionEvent, boolean z);

        BlurredBackgroundSourceRenderNode getGlassSource();

        void onParentScrollToTop();
    }

    @Override // org.telegram.ui.ViewPagerActivity
    protected int getFragmentsCount() {
        return 4;
    }

    @Override // org.telegram.ui.ViewPagerActivity
    protected int getStartPosition() {
        return 2;
    }

    @Override // me.vkryl.android.animator.FactorAnimator.Target
    public /* synthetic */ void onFactorChangeFinished(int i, float f, FactorAnimator factorAnimator) {
        FactorAnimator.Target.-CC.$default$onFactorChangeFinished(this, i, f, factorAnimator);
    }

    public MainTabsActivity() {
        if (Build.VERSION.SDK_INT >= 31) {
            this.iBlur3SourceTabGlass = new BlurredBackgroundSourceRenderNode(null);
        } else {
            this.iBlur3SourceTabGlass = null;
        }
        this.iBlur3ColorProviderWhite = new BlurredBackgroundColorProviderThemed(null, Theme.key_windowBackgroundWhite);
        this.iBlur3ColorProviderTabs = new BlurredBackgroundColorProviderThemed(null, Theme.key_dialogBackground).setBackgroundOnly();
        this.iBlur3SourceColor = new BlurredBackgroundSourceColor();
    }

    @Override // org.telegram.ui.ViewPagerActivity
    protected FrameLayout createContentView(Context context) {
        return new FrameLayout(context) { // from class: org.telegram.ui.MainTabsActivity.1
            @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
            protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
                super.onLayout(z, i, i2, i3, i4);
                MainTabsActivity.this.checkUi_tabsPosition();
                MainTabsActivity.this.checkUi_fadeView();
            }

            @Override // android.view.ViewGroup, android.view.View
            protected void dispatchDraw(Canvas canvas) {
                super.dispatchDraw(canvas);
                MainTabsActivity.this.blur3_invalidateBlur();
            }
        };
    }

    @Override // org.telegram.ui.ViewPagerActivity, org.telegram.ui.ActionBar.BaseFragment
    public void onResume() {
        super.onResume();
        blur3_updateColors();
    }

    @Override // org.telegram.ui.ViewPagerActivity, org.telegram.ui.ActionBar.BaseFragment
    public View createView(Context context) {
        super.createView(context);
        TabsSelectorView tabsSelectorView = new TabsSelectorView(context, this.resourceProvider, null);
        this.tabsView = tabsSelectorView;
        tabsSelectorView.setOutlineProvider(ViewOutlineProviderImpl.boundsWithPaddingRoundRect(AndroidUtilities.dp(8.0f)));
        this.tabsView.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f));
        this.tabsView.tabs = new GlassTabView[]{GlassTabView.createLottie(context, this.resourceProvider, R.raw.tab_contacts, R.string.MainTabsContacts), GlassTabView.createLottie(context, this.resourceProvider, R.raw.tab_calls, R.string.MainTabsCalls), GlassTabView.createLottie(context, this.resourceProvider, R.raw.tab_chats, R.string.MainTabsChats), GlassTabView.createAvatar(context, this.resourceProvider, this.currentAccount, R.string.MainTabsProfile)};
        for (final int i = 0; i < this.tabsView.tabs.length; i++) {
            final GlassTabView glassTabView = this.tabsView.tabs[i];
            ScaleStateListAnimator.apply(glassTabView);
            this.tabsView.tabs[i].setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.MainTabsActivity$$ExternalSyntheticLambda0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    MainTabsActivity.this.lambda$createView$0(i, glassTabView, view);
                }
            });
            if (i == 3) {
                this.tabsView.tabs[i].setOnLongClickListener(new View.OnLongClickListener() { // from class: org.telegram.ui.MainTabsActivity$$ExternalSyntheticLambda1
                    @Override // android.view.View.OnLongClickListener
                    public final boolean onLongClick(View view) {
                        boolean lambda$createView$1;
                        lambda$createView$1 = MainTabsActivity.this.lambda$createView$1(view);
                        return lambda$createView$1;
                    }
                });
            }
        }
        int currentPosition = this.viewPager.getCurrentPosition();
        if (currentPosition >= 0 && currentPosition < this.tabsView.tabs.length) {
            this.tabsView.animator.forceFactor(currentPosition);
            this.tabsView.tabs[currentPosition].setSelected(true, false);
        }
        TabsSelectorView tabsSelectorView2 = this.tabsView;
        tabsSelectorView2.linearLayout.addView(tabsSelectorView2.tabs[0], LayoutHelper.createLinear(0, -1, 1.0f));
        TabsSelectorView tabsSelectorView3 = this.tabsView;
        tabsSelectorView3.linearLayout.addView(tabsSelectorView3.tabs[1], LayoutHelper.createLinear(0, -1, 1.0f));
        TabsSelectorView tabsSelectorView4 = this.tabsView;
        tabsSelectorView4.linearLayout.addView(tabsSelectorView4.tabs[2], LayoutHelper.createLinear(0, -1, 1.0f));
        TabsSelectorView tabsSelectorView5 = this.tabsView;
        tabsSelectorView5.linearLayout.addView(tabsSelectorView5.tabs[3], LayoutHelper.createLinear(0, -1, 1.0f));
        this.iBlur3SourceColor.setColor(getThemedColor(Theme.key_windowBackgroundWhite));
        ViewPositionWatcher viewPositionWatcher = new ViewPositionWatcher(this.contentView);
        BlurredBackgroundSource blurredBackgroundSource = this.iBlur3SourceTabGlass;
        if (blurredBackgroundSource == null) {
            blurredBackgroundSource = this.iBlur3SourceColor;
        }
        BlurredBackgroundDrawableViewFactory blurredBackgroundDrawableViewFactory = new BlurredBackgroundDrawableViewFactory(blurredBackgroundSource);
        blurredBackgroundDrawableViewFactory.setSourceRootView(viewPositionWatcher, this.contentView);
        blurredBackgroundDrawableViewFactory.setLiquidGlassEffectAllowed(LiteMode.isEnabled(262144));
        BlurredBackgroundDrawable create = blurredBackgroundDrawableViewFactory.create(this.tabsView, this.iBlur3ColorProviderTabs);
        this.tabsViewBackground = create;
        create.setRadius(AndroidUtilities.dp(28.0f));
        this.tabsViewBackground.setPadding(AndroidUtilities.dp(8.0f));
        this.tabsView.setBackground(this.tabsViewBackground);
        BlurredBackgroundDrawableViewFactory blurredBackgroundDrawableViewFactory2 = new BlurredBackgroundDrawableViewFactory(this.iBlur3SourceColor);
        blurredBackgroundDrawableViewFactory2.setSourceRootView(viewPositionWatcher, this.contentView);
        this.fadeView = new View(context);
        BlurredBackgroundWithFadeDrawable blurredBackgroundWithFadeDrawable = new BlurredBackgroundWithFadeDrawable(blurredBackgroundDrawableViewFactory2.create(this.fadeView, null));
        blurredBackgroundWithFadeDrawable.setFadeHeight(AndroidUtilities.dp(60.0f), true);
        this.fadeView.setBackground(blurredBackgroundWithFadeDrawable);
        this.contentView.addView(this.fadeView, LayoutHelper.createFrame(-1, 0, 80));
        this.contentView.addView(this.tabsView, LayoutHelper.createFrame(344, 72, 81));
        UpdateLayoutWrapper updateLayoutWrapper = new UpdateLayoutWrapper(context);
        this.updateLayoutWrapper = updateLayoutWrapper;
        this.contentView.addView(updateLayoutWrapper, LayoutHelper.createFrame(-1, -2, 80));
        IUpdateLayout takeUpdateLayout = ApplicationLoader.applicationLoaderInstance.takeUpdateLayout(getParentActivity(), this.updateLayoutWrapper);
        this.updateLayout = takeUpdateLayout;
        if (takeUpdateLayout != null) {
            takeUpdateLayout.updateAppUpdateViews(this.currentAccount, false);
        }
        return this.contentView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$createView$0(int i, GlassTabView glassTabView, View view) {
        if (this.viewPager.getCurrentPosition() == i) {
            Object currentVisibleFragment = getCurrentVisibleFragment();
            if (currentVisibleFragment instanceof TabFragmentDelegate) {
                ((TabFragmentDelegate) currentVisibleFragment).onParentScrollToTop();
                return;
            }
            return;
        }
        this.tabsView.selectTab(i, true);
        glassTabView.playAnimationOnce();
        this.viewPager.scrollToPosition(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean lambda$createView$1(View view) {
        openAccountSelector(view);
        return true;
    }

    public void openAccountSelector(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.clear();
        for (int i = 0; i < 4; i++) {
            if (UserConfig.getInstance(i).isClientActivated()) {
                arrayList.add(Integer.valueOf(i));
            }
        }
        Collections.sort(arrayList, new Comparator() { // from class: org.telegram.ui.MainTabsActivity$$ExternalSyntheticLambda3
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int lambda$openAccountSelector$2;
                lambda$openAccountSelector$2 = MainTabsActivity.lambda$openAccountSelector$2((Integer) obj, (Integer) obj2);
                return lambda$openAccountSelector$2;
            }
        });
        final ItemOptions makeOptions = ItemOptions.makeOptions(this, view);
        if (UserConfig.getActivatedAccountsCount() < 4) {
            makeOptions.add(R.drawable.msg_addbot, LocaleController.getString(R.string.AddAccount), new Runnable() { // from class: org.telegram.ui.MainTabsActivity$$ExternalSyntheticLambda4
                @Override // java.lang.Runnable
                public final void run() {
                    MainTabsActivity.this.lambda$openAccountSelector$3();
                }
            });
        }
        if (arrayList.size() > 0) {
            if (makeOptions.getItemsCount() > 0) {
                makeOptions.addGap();
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                final int intValue = ((Integer) it.next()).intValue();
                LinearLayout accountView = accountView(intValue, this.currentAccount == intValue);
                accountView.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.MainTabsActivity$$ExternalSyntheticLambda5
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        MainTabsActivity.this.lambda$openAccountSelector$4(intValue, makeOptions, view2);
                    }
                });
                makeOptions.addView(accountView, LayoutHelper.createLinear(NotificationCenter.starUserGiftsLoaded, 48));
            }
        }
        makeOptions.setBlur(true);
        makeOptions.translate(0.0f, -AndroidUtilities.dp(4.0f));
        ShapeDrawable createRoundRectDrawable = Theme.createRoundRectDrawable(AndroidUtilities.dp(28.0f), getThemedColor(Theme.key_windowBackgroundWhite));
        createRoundRectDrawable.getPaint().setShadowLayer(AndroidUtilities.dp(6.0f), 0.0f, AndroidUtilities.dp(1.0f), Theme.multAlpha(-16777216, 0.15f));
        makeOptions.setScrimViewBackground(createRoundRectDrawable);
        makeOptions.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$openAccountSelector$2(Integer num, Integer num2) {
        long j = UserConfig.getInstance(num.intValue()).loginTime;
        long j2 = UserConfig.getInstance(num2.intValue()).loginTime;
        if (j > j2) {
            return 1;
        }
        return j < j2 ? -1 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$openAccountSelector$3() {
        int i = 0;
        Integer num = null;
        for (int i2 = 3; i2 >= 0; i2--) {
            if (!UserConfig.getInstance(i2).isClientActivated()) {
                i++;
                if (num == null) {
                    num = Integer.valueOf(i2);
                }
            }
        }
        if (!UserConfig.hasPremiumOnAccounts()) {
            i--;
        }
        if (i > 0 && num != null) {
            presentFragment(new LoginActivity(num.intValue()));
        } else {
            if (UserConfig.hasPremiumOnAccounts()) {
                return;
            }
            showDialog(new LimitReachedBottomSheet(this, getContext(), 7, this.currentAccount, null));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$openAccountSelector$4(int i, ItemOptions itemOptions, View view) {
        if (this.currentAccount == i) {
            return;
        }
        itemOptions.dismiss();
        LaunchActivity launchActivity = LaunchActivity.instance;
        if (launchActivity != null) {
            launchActivity.switchToAccount(i, true);
        }
    }

    public LinearLayout accountView(int i, final boolean z) {
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(0);
        linearLayout.setBackground(Theme.createRadSelectorDrawable(getThemedColor(Theme.key_listSelector), 0, 0));
        TLRPC.User currentUser = UserConfig.getInstance(i).getCurrentUser();
        AvatarDrawable avatarDrawable = new AvatarDrawable();
        avatarDrawable.setInfo(currentUser);
        FrameLayout frameLayout = new FrameLayout(getContext()) { // from class: org.telegram.ui.MainTabsActivity.2
            private final Paint selectedPaint = new Paint(1);

            @Override // android.view.ViewGroup, android.view.View
            protected void dispatchDraw(Canvas canvas) {
                if (z) {
                    this.selectedPaint.setStyle(Paint.Style.STROKE);
                    this.selectedPaint.setStrokeWidth(AndroidUtilities.dp(1.33f));
                    this.selectedPaint.setColor(MainTabsActivity.this.getThemedColor(Theme.key_featuredStickers_addButton));
                    canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, AndroidUtilities.dp(16.0f), this.selectedPaint);
                }
                super.dispatchDraw(canvas);
            }
        };
        linearLayout.addView(frameLayout, LayoutHelper.createLinear(34, 34, 16, 12, 0, 0, 0));
        BackupImageView backupImageView = new BackupImageView(getContext());
        if (z) {
            backupImageView.setScaleX(0.833f);
            backupImageView.setScaleY(0.833f);
        }
        backupImageView.setRoundRadius(AndroidUtilities.dp(16.0f));
        backupImageView.getImageReceiver().setCurrentAccount(i);
        backupImageView.setForUserOrChat(currentUser, avatarDrawable);
        frameLayout.addView(backupImageView, LayoutHelper.createLinear(32, 32, 17, 1, 1, 1, 1));
        TextView textView = new TextView(getContext());
        textView.setTextSize(1, 16.0f);
        textView.setTextColor(getThemedColor(Theme.key_dialogTextBlack));
        textView.setText(UserObject.getUserName(currentUser));
        linearLayout.addView(textView, LayoutHelper.createLinear(0, -2, 1.0f, 16, 13, 0, 14, 0));
        return linearLayout;
    }

    @Override // org.telegram.ui.ViewPagerActivity
    protected void onViewPagerScrollEnd() {
        TabsSelectorView tabsSelectorView = this.tabsView;
        if (tabsSelectorView != null) {
            tabsSelectorView.lensVisibilityByDrag.setInterpolator(AnimatorUtils.DECELERATE_INTERPOLATOR);
            this.tabsView.lensVisibilityByDrag.setValue(false, true);
        }
        blur3_invalidateBlur();
    }

    @Override // org.telegram.ui.ViewPagerActivity
    protected void onViewPagerTabAnimationUpdate(boolean z) {
        if (this.tabsView != null) {
            float positionAnimated = this.viewPager.getPositionAnimated();
            this.tabsView.lensVisibilityByDrag.setInterpolator(AnimatorUtils.OVERSHOOT_INTERPOLATOR);
            this.tabsView.lensVisibilityByDrag.setValue(true, true);
            this.tabsView.animator.forceFactor(positionAnimated);
            this.tabsView.selectTab(Math.round(positionAnimated), false);
        }
        checkUi_fadeView();
        blur3_invalidateBlur();
    }

    private static class TabsSelectorView extends GlassTabsView implements FactorAnimator.Target {
        public final FactorAnimator animator;
        private final ClickHelper clickHelper;
        public final BoolAnimator lensVisibilityByDrag;
        public final BoolAnimator lensVisibilityByLongClick;
        public final BoolAnimator lensVisibilityByMove;
        private int selectedTab;
        private GlassTabView[] tabs;

        @Override // me.vkryl.android.animator.FactorAnimator.Target
        public /* synthetic */ void onFactorChangeFinished(int i, float f, FactorAnimator factorAnimator) {
            FactorAnimator.Target.-CC.$default$onFactorChangeFinished(this, i, f, factorAnimator);
        }

        public TabsSelectorView(Context context, Theme.ResourcesProvider resourcesProvider, Utilities.Callback callback) {
            super(context);
            CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
            this.animator = new FactorAnimator(0, this, cubicBezierInterpolator, 0L);
            this.lensVisibilityByMove = new BoolAnimator(2, this, AnimatorUtils.LINEAR_INTERPOLATOR, 0L);
            this.lensVisibilityByDrag = new BoolAnimator(3, this, AnimatorUtils.OVERSHOOT_INTERPOLATOR, 320L);
            this.lensVisibilityByLongClick = new BoolAnimator(1, this, cubicBezierInterpolator, 380L);
            this.selectedTab = -1;
            int i = Theme.key_telegram_color;
            setLensColor(Theme.multAlpha(Theme.getColor(i, resourcesProvider), 0.09411765f), Theme.multAlpha(Theme.getColor(i, resourcesProvider), 0.1254902f));
            setLensVisibility(0.0f);
            this.clickHelper = new ClickHelper(new ClickHelper.Delegate() { // from class: org.telegram.ui.MainTabsActivity.TabsSelectorView.1
                @Override // me.vkryl.android.util.ClickHelper.Delegate
                public /* synthetic */ boolean forceEnableVibration() {
                    return ClickHelper.Delegate.-CC.$default$forceEnableVibration(this);
                }

                /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
                    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 long, still in use, count: 1, list:
                      (r0v0 long) from 0x0004: RETURN (r0v0 long)
                    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
                    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
                    	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
                    	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:57)
                    	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:452)
                    	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
                    */
                @Override // me.vkryl.android.util.ClickHelper.Delegate
                public /* synthetic */ long getLongPressDuration() {
                    /*
                        r2 = this;
                        long r0 = me.vkryl.android.util.ClickHelper.Delegate.-CC.$default$getLongPressDuration(r2)
                        return r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.MainTabsActivity.TabsSelectorView.1.getLongPressDuration():long");
                }

                @Override // me.vkryl.android.util.ClickHelper.Delegate
                public /* synthetic */ boolean ignoreHapticFeedbackSettings(float f, float f2) {
                    return ClickHelper.Delegate.-CC.$default$ignoreHapticFeedbackSettings(this, f, f2);
                }

                @Override // me.vkryl.android.util.ClickHelper.Delegate
                public boolean needClickAt(View view, float f, float f2) {
                    return true;
                }

                @Override // me.vkryl.android.util.ClickHelper.Delegate
                public boolean needLongPress(float f, float f2) {
                    return true;
                }

                @Override // me.vkryl.android.util.ClickHelper.Delegate
                public void onClickAt(View view, float f, float f2) {
                }

                @Override // me.vkryl.android.util.ClickHelper.Delegate
                public /* synthetic */ void onClickTouchDown(View view, float f, float f2) {
                    ClickHelper.Delegate.-CC.$default$onClickTouchDown(this, view, f, f2);
                }

                @Override // me.vkryl.android.util.ClickHelper.Delegate
                public /* synthetic */ void onClickTouchMove(View view, float f, float f2) {
                    ClickHelper.Delegate.-CC.$default$onClickTouchMove(this, view, f, f2);
                }

                @Override // me.vkryl.android.util.ClickHelper.Delegate
                public /* synthetic */ void onClickTouchUp(View view, float f, float f2) {
                    ClickHelper.Delegate.-CC.$default$onClickTouchUp(this, view, f, f2);
                }

                @Override // me.vkryl.android.util.ClickHelper.Delegate
                public /* synthetic */ void onLongPressFinish(View view, float f, float f2) {
                    ClickHelper.Delegate.-CC.$default$onLongPressFinish(this, view, f, f2);
                }

                @Override // me.vkryl.android.util.ClickHelper.Delegate
                public /* synthetic */ void onLongPressMove(View view, MotionEvent motionEvent, float f, float f2, float f3, float f4) {
                    ClickHelper.Delegate.-CC.$default$onLongPressMove(this, view, motionEvent, f, f2, f3, f4);
                }

                @Override // me.vkryl.android.util.ClickHelper.Delegate
                public boolean onLongPressRequestedAt(View view, float f, float f2) {
                    TabsSelectorView.this.lensVisibilityByLongClick.setInterpolator(AnimatorUtils.OVERSHOOT_INTERPOLATOR);
                    TabsSelectorView.this.lensVisibilityByLongClick.setValue(true, true);
                    return false;
                }

                @Override // me.vkryl.android.util.ClickHelper.Delegate
                public void onLongPressCancelled(View view, float f, float f2) {
                    TabsSelectorView.this.lensVisibilityByLongClick.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
                    TabsSelectorView.this.lensVisibilityByLongClick.setValue(false, true);
                }
            });
        }

        @Override // android.view.ViewGroup, android.view.View
        public boolean dispatchTouchEvent(MotionEvent motionEvent) {
            this.clickHelper.onTouchEvent(this, motionEvent);
            return super.dispatchTouchEvent(motionEvent);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void selectTab(int i, boolean z) {
            int i2 = this.selectedTab;
            if (i2 != i) {
                if (i2 >= 0) {
                    GlassTabView[] glassTabViewArr = this.tabs;
                    if (i2 < glassTabViewArr.length) {
                        glassTabViewArr[i2].setSelected(false, true);
                    }
                }
                this.tabs[i].setSelected(true, true);
                long abs = (Math.abs(this.selectedTab - i) * 100) + 320;
                this.selectedTab = i;
                if (z) {
                    this.animator.setDuration(abs);
                    this.animator.animateTo(i);
                }
                this.lensVisibilityByMove.setDuration(abs);
                if (!this.lensVisibilityByMove.isAnimating()) {
                    this.lensVisibilityByMove.setValue(false, false);
                }
                this.lensVisibilityByMove.setValue(true, true);
            }
        }

        private void updateLens() {
            float factor = this.animator.getFactor();
            setLensBounds(AndroidUtilities.lerp(AndroidUtilities.dp(12.0f), getMeasuredWidth() - AndroidUtilities.dp(12.0f), factor / 4.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.lerp(AndroidUtilities.dp(12.0f), getMeasuredWidth() - AndroidUtilities.dp(12.0f), (factor + 1.0f) / 4.0f), getMeasuredHeight() - AndroidUtilities.dp(12.0f));
            this.lensVisibilityByLongClick.getFloatValue();
            this.lensVisibilityByDrag.getFloatValue();
            float floatValue = this.lensVisibilityByMove.getFloatValue() * 2.0f;
            if (floatValue < 1.0f) {
                CubicBezierInterpolator.DEFAULT.getInterpolation(floatValue);
            } else {
                CubicBezierInterpolator.DEFAULT.getInterpolation(1.0f - (1.0f - (floatValue - 1.0f)));
            }
        }

        @Override // android.view.View
        protected void onSizeChanged(int i, int i2, int i3, int i4) {
            super.onSizeChanged(i, i2, i3, i4);
            updateLens();
        }

        @Override // me.vkryl.android.animator.FactorAnimator.Target
        public void onFactorChanged(int i, float f, float f2, FactorAnimator factorAnimator) {
            if (i == 0) {
                updateLens();
                invalidate();
                return;
            }
            if (i == 1) {
                updateLens();
                invalidate();
            } else if (i == 2) {
                updateLens();
                invalidate();
            } else if (i == 3) {
                updateLens();
                invalidate();
            }
        }
    }

    @Override // org.telegram.ui.ViewPagerActivity, org.telegram.ui.ActionBar.BaseFragment
    public boolean onBackPressed(boolean z) {
        int startPosition;
        boolean onBackPressed = super.onBackPressed(z);
        if (!onBackPressed || this.viewPager.getCurrentPosition() == (startPosition = getStartPosition())) {
            return onBackPressed;
        }
        if (!z) {
            return false;
        }
        this.viewPager.scrollToPosition(startPosition);
        return false;
    }

    public DialogsActivity prepareDialogsActivity(Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
            bundle.putBoolean("hasMainTabs", true);
        }
        DialogsActivity dialogsActivity = new DialogsActivity(bundle);
        this.dialogsActivity = dialogsActivity;
        dialogsActivity.setMainTabsActivityController(new MainTabsActivityControllerImpl());
        putFragmentAtPosition(2, this.dialogsActivity);
        return this.dialogsActivity;
    }

    @Override // org.telegram.ui.ViewPagerActivity
    protected BaseFragment createBaseFragmentAt(int i) {
        if (i == 0) {
            Bundle bundle = new Bundle();
            bundle.putBoolean("needPhonebook", true);
            bundle.putBoolean("needFinishFragment", false);
            bundle.putBoolean("hasMainTabs", true);
            return new ContactsActivity(bundle);
        }
        if (i == 1) {
            Bundle bundle2 = new Bundle();
            bundle2.putBoolean("needFinishFragment", false);
            bundle2.putBoolean("hasMainTabs", true);
            return new CallLogActivity(bundle2);
        }
        if (i == 2) {
            Bundle bundle3 = new Bundle();
            bundle3.putBoolean("hasMainTabs", true);
            DialogsActivity dialogsActivity = new DialogsActivity(bundle3);
            this.dialogsActivity = dialogsActivity;
            dialogsActivity.setMainTabsActivityController(new MainTabsActivityControllerImpl());
            return this.dialogsActivity;
        }
        if (i != 3) {
            return null;
        }
        Bundle bundle4 = new Bundle();
        bundle4.putLong("user_id", UserConfig.getInstance(this.currentAccount).getClientUserId());
        bundle4.putBoolean("my_profile", true);
        bundle4.putBoolean("hasMainTabs", true);
        return new ProfileActivity(bundle4);
    }

    public DialogsActivity getDialogsActivity() {
        return this.dialogsActivity;
    }

    @Override // org.telegram.ui.ViewPagerActivity
    protected boolean canScrollForward(MotionEvent motionEvent) {
        return canScrollInternal(motionEvent, true);
    }

    @Override // org.telegram.ui.ViewPagerActivity
    protected boolean canScrollBackward(MotionEvent motionEvent) {
        return canScrollInternal(motionEvent, false);
    }

    private boolean canScrollInternal(MotionEvent motionEvent, boolean z) {
        Object currentVisibleFragment = getCurrentVisibleFragment();
        if (currentVisibleFragment instanceof TabFragmentDelegate) {
            return ((TabFragmentDelegate) currentVisibleFragment).canParentTabsSlide(motionEvent, z);
        }
        return false;
    }

    @Override // org.telegram.ui.ViewPagerActivity
    protected WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
        this.navigationBarHeight = windowInsetsCompat.getInsets(WindowInsetsCompat.Type.systemBars()).bottom;
        boolean isUpdateLayoutVisible = this.updateLayoutWrapper.isUpdateLayoutVisible();
        int dp = isUpdateLayoutVisible ? AndroidUtilities.dp(44.0f) : 0;
        this.updateLayoutWrapper.setPadding(0, 0, 0, this.navigationBarHeight);
        int dp2 = this.navigationBarHeight + dp + AndroidUtilities.dp(72.0f);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.fadeView.getLayoutParams();
        if (marginLayoutParams.height != dp2) {
            marginLayoutParams.height = dp2;
            this.fadeView.setLayoutParams(marginLayoutParams);
        }
        int i = isUpdateLayoutVisible ? this.navigationBarHeight + dp : 0;
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.viewPager.getLayoutParams();
        if (marginLayoutParams2.bottomMargin != i) {
            marginLayoutParams2.bottomMargin = i;
            this.viewPager.setLayoutParams(marginLayoutParams2);
        }
        if (isUpdateLayoutVisible) {
            windowInsetsCompat = windowInsetsCompat.inset(0, 0, 0, this.navigationBarHeight);
        }
        checkUi_tabsPosition();
        checkUi_fadeView();
        return super.onApplyWindowInsets(view, windowInsetsCompat);
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        IUpdateLayout iUpdateLayout;
        IUpdateLayout iUpdateLayout2;
        IUpdateLayout iUpdateLayout3;
        if (i == NotificationCenter.appUpdateLoading) {
            IUpdateLayout iUpdateLayout4 = this.updateLayout;
            if (iUpdateLayout4 != null) {
                iUpdateLayout4.updateFileProgress(null);
                this.updateLayout.updateAppUpdateViews(this.currentAccount, true);
                return;
            }
            return;
        }
        if (i == NotificationCenter.fileLoaded) {
            String str = (String) objArr[0];
            if (SharedConfig.isAppUpdateAvailable() && FileLoader.getAttachFileName(SharedConfig.pendingAppUpdate.document).equals(str) && (iUpdateLayout3 = this.updateLayout) != null) {
                iUpdateLayout3.updateAppUpdateViews(this.currentAccount, true);
                return;
            }
            return;
        }
        if (i == NotificationCenter.fileLoadFailed) {
            String str2 = (String) objArr[0];
            if (SharedConfig.isAppUpdateAvailable() && FileLoader.getAttachFileName(SharedConfig.pendingAppUpdate.document).equals(str2) && (iUpdateLayout2 = this.updateLayout) != null) {
                iUpdateLayout2.updateAppUpdateViews(this.currentAccount, true);
                return;
            }
            return;
        }
        if (i == NotificationCenter.fileLoadProgressChanged) {
            IUpdateLayout iUpdateLayout5 = this.updateLayout;
            if (iUpdateLayout5 != null) {
                iUpdateLayout5.updateFileProgress(objArr);
                return;
            }
            return;
        }
        if (i != NotificationCenter.appUpdateAvailable || (iUpdateLayout = this.updateLayout) == null) {
            return;
        }
        iUpdateLayout.updateAppUpdateViews(this.currentAccount, LaunchActivity.getMainFragmentsStackSize() == 1);
    }

    @Override // org.telegram.ui.ActionBar.BaseFragment
    public boolean onFragmentCreate() {
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.fileLoaded);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.fileLoadProgressChanged);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.fileLoadFailed);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.appUpdateAvailable);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.appUpdateLoading);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.BaseFragment
    public void onFragmentDestroy() {
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.fileLoaded);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.fileLoadProgressChanged);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.fileLoadFailed);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.appUpdateAvailable);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.appUpdateLoading);
        super.onFragmentDestroy();
    }

    @Override // me.vkryl.android.animator.FactorAnimator.Target
    public void onFactorChanged(int i, float f, float f2, FactorAnimator factorAnimator) {
        if (i == 0) {
            checkUi_tabsPosition();
            checkUi_fadeView();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void checkUi_fadeView() {
        ViewPagerFixed viewPagerFixed = this.viewPager;
        if (viewPagerFixed == null || this.fadeView == null) {
            return;
        }
        float clamp = 1.0f - MathUtils.clamp(Math.abs(3.0f - viewPagerFixed.getPositionAnimated()), 0.0f, 1.0f);
        float navigationBarThirdButtonsFactor = (1.0f - ((1.0f - AndroidUtilities.getNavigationBarThirdButtonsFactor(0.0f, 1.0f, this.navigationBarHeight)) * clamp)) * this.animatorTabsVisible.getFloatValue();
        this.fadeView.setAlpha(navigationBarThirdButtonsFactor);
        this.fadeView.setTranslationY(clamp * AndroidUtilities.dp(48.0f));
        this.fadeView.setVisibility(navigationBarThirdButtonsFactor > 0.0f ? 0 : 8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void checkUi_tabsPosition() {
        int dp = AndroidUtilities.dp(40.0f) + (-(this.navigationBarHeight + (this.updateLayoutWrapper.isUpdateLayoutVisible() ? AndroidUtilities.dp(44.0f) : 0)));
        float floatValue = this.animatorTabsVisible.getFloatValue();
        float lerp = AndroidUtilities.lerp(0.85f, 1.0f, floatValue);
        this.tabsView.setTranslationY(AndroidUtilities.lerp(dp, r0, floatValue));
        this.tabsView.setScaleX(lerp);
        this.tabsView.setScaleY(lerp);
        this.tabsView.setClickable(floatValue > 1.0f);
        this.tabsView.setEnabled(floatValue > 1.0f);
        this.tabsView.setTranslationZ(AndroidUtilities.dpf2(floatValue));
        this.tabsView.setAlpha(floatValue);
        this.tabsView.setVisibility(floatValue <= 0.0f ? 8 : 0);
    }

    @Override // org.telegram.ui.ViewPagerActivity, org.telegram.ui.ActionBar.BaseFragment
    public ArrayList getThemeDescriptions() {
        ArrayList themeDescriptions = super.getThemeDescriptions();
        ThemeDescription.ThemeDescriptionDelegate themeDescriptionDelegate = new ThemeDescription.ThemeDescriptionDelegate() { // from class: org.telegram.ui.MainTabsActivity$$ExternalSyntheticLambda2
            @Override // org.telegram.ui.ActionBar.ThemeDescription.ThemeDescriptionDelegate
            public final void didSetColor() {
                MainTabsActivity.this.blur3_updateColors();
            }

            @Override // org.telegram.ui.ActionBar.ThemeDescription.ThemeDescriptionDelegate
            public /* synthetic */ void onAnimationProgress(float f) {
                ThemeDescription.ThemeDescriptionDelegate.-CC.$default$onAnimationProgress(this, f);
            }
        };
        View view = this.fragmentView;
        int i = ThemeDescription.FLAG_BACKGROUND;
        int i2 = Theme.key_windowBackgroundWhite;
        themeDescriptions.add(new ThemeDescription(view, i, null, null, null, null, i2));
        themeDescriptions.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, i2));
        themeDescriptions.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, Theme.key_dialogBackground));
        return themeDescriptions;
    }

    private class MainTabsActivityControllerImpl implements MainTabsActivityController {
        private MainTabsActivityControllerImpl() {
        }

        @Override // org.telegram.ui.MainTabsActivityController
        public void setTabsVisible(boolean z) {
            MainTabsActivity.this.animatorTabsVisible.setValue(z, true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public void blur3_invalidateBlur() {
        View view;
        View view2;
        BlurredBackgroundSourceRenderNode glassSource;
        if (Build.VERSION.SDK_INT < 31 || this.iBlur3SourceTabGlass == null || (view = this.fragmentView) == null) {
            return;
        }
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = this.fragmentView.getMeasuredHeight();
        RecordingCanvas beginRecording = this.iBlur3SourceTabGlass.beginRecording(measuredWidth, measuredHeight);
        beginRecording.drawColor(getThemedColor(Theme.key_windowBackgroundWhite));
        for (BaseFragment baseFragment : this.fragments) {
            if (baseFragment != 0 && (view2 = baseFragment.fragmentView) != null && ViewPositionWatcher.computeRectInParent(view2, this.contentView, this.fragmentPosition)) {
                RectF rectF = this.fragmentPosition;
                if (rectF.right > 0.0f && rectF.left < this.fragmentView.getMeasuredWidth() && (baseFragment instanceof TabFragmentDelegate) && (glassSource = ((TabFragmentDelegate) baseFragment).getGlassSource()) != null) {
                    beginRecording.save();
                    RectF rectF2 = this.fragmentPosition;
                    beginRecording.translate(rectF2.left, rectF2.top);
                    glassSource.draw(beginRecording, 0.0f, 0.0f, measuredWidth, measuredHeight);
                    beginRecording.restore();
                }
            }
        }
        this.iBlur3SourceTabGlass.endRecording();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void blur3_updateColors() {
        this.iBlur3ColorProviderWhite.updateColors();
        this.iBlur3ColorProviderTabs.updateColors();
        this.iBlur3SourceColor.setColor(getThemedColor(Theme.key_windowBackgroundWhite));
        this.tabsViewBackground.updateColors();
        blur3_invalidateBlur();
        this.fadeView.invalidate();
        this.tabsView.invalidate();
        for (GlassTabView glassTabView : this.tabsView.tabs) {
            glassTabView.updateColorsLottie();
        }
    }
}
