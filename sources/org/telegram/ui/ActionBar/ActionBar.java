package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.TextUtils;
import android.transition.ChangeBounds;
import android.transition.Fade;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.transition.TransitionValues;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.core.graphics.ColorUtils;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.INavigationLayout;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Adapters.FiltersView;
import org.telegram.ui.Components.AnimatedEmojiDrawable;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.EllipsizeSpanAnimator;
import org.telegram.ui.Components.FireworksEffect;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.SizeNotifierFrameLayout;
import org.telegram.ui.Components.SnowflakesEffect;

/* loaded from: classes4.dex */
public class ActionBar extends FrameLayout {
    private int actionBarColor;
    public ActionBarMenuOnItemClick actionBarMenuOnItemClick;
    private ActionBarMenu actionMode;
    private AnimatorSet actionModeAnimation;
    private int actionModeColor;
    private View actionModeExtraView;
    private View[] actionModeHidingViews;
    private View actionModeShowingView;
    private String actionModeTag;
    private View actionModeTop;
    private View actionModeTranslationView;
    protected boolean actionModeVisible;
    private boolean addToContainer;
    private SimpleTextView additionalSubtitleTextView;
    private boolean allowOverlayTitle;
    private boolean attachState;
    private boolean attached;
    private BackupImageView avatarSearchImageView;
    private Drawable backButtonDrawable;
    public ImageView backButtonImageView;
    private INavigationLayout.BackButtonState backButtonState;
    Runnable backgroundUpdateListener;
    public Paint blurScrimPaint;
    boolean blurredBackground;
    private boolean castShadows;
    private boolean centerScale;
    private boolean clipContent;
    SizeNotifierFrameLayout contentView;
    private boolean drawBackButton;
    EllipsizeSpanAnimator ellipsizeSpanAnimator;
    private int extraHeight;
    private FireworksEffect fireworksEffect;
    private Paint.FontMetricsInt fontMetricsInt;
    private boolean forceSkipTouches;
    private boolean fromBottom;
    private boolean ignoreLayoutRequest;
    private View.OnTouchListener interceptTouchEventListener;
    private boolean interceptTouches;
    private boolean isMenuOffsetSuppressed;
    protected boolean isSearchFieldVisible;
    protected int itemsActionModeBackgroundColor;
    protected int itemsActionModeColor;
    protected int itemsBackgroundColor;
    protected int itemsColor;
    private CharSequence lastOverlayTitle;
    private Drawable lastRightDrawable;
    private Runnable lastRunnable;
    private CharSequence lastTitle;
    private boolean manualStart;
    public ActionBarMenu menu;
    protected boolean occupyStatusBar;
    private boolean overlayTitleAnimation;
    boolean overlayTitleAnimationInProgress;
    private Object[] overlayTitleToSet;
    protected BaseFragment parentFragment;
    private Rect rect;
    Rect rectTmp;
    private final Theme.ResourcesProvider resourcesProvider;
    private boolean resumed;
    private View.OnClickListener rightDrawableOnClickListener;
    public float searchFieldVisibleAlpha;
    AnimatorSet searchVisibleAnimator;
    private SnowflakesEffect snowflakesEffect;
    private CharSequence subtitle;
    private SimpleTextView subtitleTextView;
    private boolean supportsHolidayImage;
    private Runnable titleActionRunnable;
    private boolean titleAnimationRunning;
    private int titleColorToSet;
    private boolean titleOverlayShown;
    private int titleRightMargin;
    private SimpleTextView[] titleTextView;
    private FrameLayout titlesContainer;
    private boolean useContainerForTitles;

    /* loaded from: classes4.dex */
    public static class ActionBarMenuOnItemClick {
        public boolean canOpenMenu() {
            return true;
        }

        public void onItemClick(int i) {
        }
    }

    public ActionBar(Context context) {
        this(context, null);
    }

    public ActionBar(Context context, Theme.ResourcesProvider resourcesProvider) {
        super(context);
        this.backButtonState = INavigationLayout.BackButtonState.BACK;
        this.titleTextView = new SimpleTextView[2];
        this.occupyStatusBar = Build.VERSION.SDK_INT >= 21;
        this.addToContainer = true;
        this.interceptTouches = true;
        this.overlayTitleToSet = new Object[3];
        this.castShadows = true;
        this.titleColorToSet = 0;
        this.blurScrimPaint = new Paint();
        this.rectTmp = new Rect();
        this.ellipsizeSpanAnimator = new EllipsizeSpanAnimator(this);
        this.resourcesProvider = resourcesProvider;
        setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.ActionBar.ActionBar$$ExternalSyntheticLambda2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ActionBar.this.lambda$new$0(view);
            }
        });
    }

    private void createBackButtonImage() {
        if (this.backButtonImageView != null) {
            return;
        }
        ImageView imageView = new ImageView(getContext());
        this.backButtonImageView = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        this.backButtonImageView.setBackgroundDrawable(Theme.createSelectorDrawable(this.itemsBackgroundColor));
        this.backButtonImageView.setPadding(AndroidUtilities.dp(1.0f), 0, 0, 0);
        addView(this.backButtonImageView, LayoutHelper.createFrame(54, 54, 51));
        this.backButtonImageView.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.ActionBar.ActionBar$$ExternalSyntheticLambda3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ActionBar.this.lambda$createBackButtonImage$1(view);
            }
        });
        this.backButtonImageView.setContentDescription(LocaleController.getString(R.string.AccDescrGoBack));
    }

    private void createSubtitleTextView() {
        if (this.subtitleTextView != null) {
            return;
        }
        SimpleTextView simpleTextView = new SimpleTextView(getContext());
        this.subtitleTextView = simpleTextView;
        simpleTextView.setGravity(3);
        this.subtitleTextView.setVisibility(8);
        this.subtitleTextView.setTextColor(getThemedColor(Theme.key_actionBarDefaultSubtitle));
        addView(this.subtitleTextView, 0, LayoutHelper.createFrame(-2, -2, 51));
    }

    private void createTitleTextView(int i) {
        SimpleTextView[] simpleTextViewArr = this.titleTextView;
        if (simpleTextViewArr[i] != null) {
            return;
        }
        simpleTextViewArr[i] = new SimpleTextView(getContext());
        this.titleTextView[i].setGravity(19);
        int i2 = this.titleColorToSet;
        if (i2 != 0) {
            this.titleTextView[i].setTextColor(i2);
        } else {
            this.titleTextView[i].setTextColor(getThemedColor(Theme.key_actionBarDefaultTitle));
        }
        this.titleTextView[i].setTypeface(AndroidUtilities.bold());
        this.titleTextView[i].setDrawablePadding(AndroidUtilities.dp(4.0f));
        this.titleTextView[i].setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        this.titleTextView[i].setRightDrawableTopPadding(-AndroidUtilities.dp(1.0f));
        if (this.useContainerForTitles) {
            this.titlesContainer.addView(this.titleTextView[i], 0, LayoutHelper.createFrame(-2, -2, 51));
        } else {
            addView(this.titleTextView[i], 0, LayoutHelper.createFrame(-2, -2, 51));
        }
    }

    public static int getCurrentActionBarHeight() {
        float f;
        if (AndroidUtilities.isTablet()) {
            f = 64.0f;
        } else {
            Point point = AndroidUtilities.displaySize;
            f = point.x > point.y ? 48.0f : 56.0f;
        }
        return AndroidUtilities.dp(f);
    }

    private int getThemedColor(int i) {
        return Theme.getColor(i, this.resourcesProvider);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$createBackButtonImage$1(View view) {
        if (!this.actionModeVisible && this.isSearchFieldVisible) {
            closeSearchField();
            return;
        }
        ActionBarMenuOnItemClick actionBarMenuOnItemClick = this.actionBarMenuOnItemClick;
        if (actionBarMenuOnItemClick != null) {
            actionBarMenuOnItemClick.onItemClick(-1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$hideActionMode$3(ValueAnimator valueAnimator) {
        Runnable runnable = this.backgroundUpdateListener;
        if (runnable != null) {
            runnable.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0(View view) {
        Runnable runnable;
        if (isSearchFieldVisible() || (runnable = this.titleActionRunnable) == null) {
            return;
        }
        runnable.run();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onSearchFieldVisibilityChanged$4(ValueAnimator valueAnimator) {
        this.searchFieldVisibleAlpha = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        Runnable runnable = this.backgroundUpdateListener;
        if (runnable != null) {
            runnable.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showActionMode$2(ValueAnimator valueAnimator) {
        Runnable runnable = this.backgroundUpdateListener;
        if (runnable != null) {
            runnable.run();
        }
    }

    private void updateAttachState() {
        boolean z = this.attached && this.resumed;
        if (this.attachState != z) {
            this.attachState = z;
            if (z) {
                this.ellipsizeSpanAnimator.onAttachedToWindow();
            } else {
                this.ellipsizeSpanAnimator.onDetachedFromWindow();
            }
        }
    }

    public boolean actionModeIsExist(String str) {
        if (this.actionMode == null) {
            return false;
        }
        String str2 = this.actionModeTag;
        if (str2 == null && str == null) {
            return true;
        }
        return str2 != null && str2.equals(str);
    }

    public void beginDelayedTransition() {
        if (LocaleController.isRTL) {
            return;
        }
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.setOrdering(0);
        transitionSet.addTransition(new Fade());
        transitionSet.addTransition(new ChangeBounds() { // from class: org.telegram.ui.ActionBar.ActionBar.7
            @Override // android.transition.ChangeBounds, android.transition.Transition
            public void captureEndValues(TransitionValues transitionValues) {
                super.captureEndValues(transitionValues);
                View view = transitionValues.view;
                if (view instanceof SimpleTextView) {
                    transitionValues.values.put("text_size", Float.valueOf(((SimpleTextView) view).getTextPaint().getTextSize()));
                }
            }

            @Override // android.transition.ChangeBounds, android.transition.Transition
            public void captureStartValues(TransitionValues transitionValues) {
                super.captureStartValues(transitionValues);
                View view = transitionValues.view;
                if (view instanceof SimpleTextView) {
                    transitionValues.values.put("text_size", Float.valueOf(((SimpleTextView) view).getTextPaint().getTextSize()));
                }
            }

            @Override // android.transition.ChangeBounds, android.transition.Transition
            public Animator createAnimator(ViewGroup viewGroup, final TransitionValues transitionValues, TransitionValues transitionValues2) {
                if (transitionValues == null || !(transitionValues.view instanceof SimpleTextView)) {
                    return super.createAnimator(viewGroup, transitionValues, transitionValues2);
                }
                AnimatorSet animatorSet = new AnimatorSet();
                if (transitionValues2 != null) {
                    Animator createAnimator = super.createAnimator(viewGroup, transitionValues, transitionValues2);
                    float floatValue = ((Float) transitionValues.values.get("text_size")).floatValue() / ((Float) transitionValues2.values.get("text_size")).floatValue();
                    transitionValues.view.setScaleX(floatValue);
                    transitionValues.view.setScaleY(floatValue);
                    if (createAnimator != null) {
                        animatorSet.playTogether(createAnimator);
                    }
                }
                animatorSet.playTogether(ObjectAnimator.ofFloat(transitionValues.view, (Property<View, Float>) View.SCALE_X, 1.0f));
                animatorSet.playTogether(ObjectAnimator.ofFloat(transitionValues.view, (Property<View, Float>) View.SCALE_Y, 1.0f));
                animatorSet.addListener(new AnimatorListenerAdapter() { // from class: org.telegram.ui.ActionBar.ActionBar.7.1
                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public void onAnimationEnd(Animator animator) {
                        super.onAnimationEnd(animator);
                        transitionValues.view.setLayerType(0, null);
                    }

                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public void onAnimationStart(Animator animator) {
                        super.onAnimationStart(animator);
                        transitionValues.view.setLayerType(2, null);
                    }
                });
                return animatorSet;
            }
        });
        this.centerScale = false;
        transitionSet.setDuration(220L);
        transitionSet.setInterpolator((TimeInterpolator) CubicBezierInterpolator.DEFAULT);
        TransitionManager.beginDelayedTransition(this, transitionSet);
    }

    public void closeSearchField() {
        closeSearchField(true);
    }

    public void closeSearchField(boolean z) {
        ActionBarMenu actionBarMenu;
        if (!this.isSearchFieldVisible || (actionBarMenu = this.menu) == null) {
            return;
        }
        actionBarMenu.closeSearchField(z);
    }

    public ActionBarMenu createActionMode() {
        return createActionMode(true, null);
    }

    public ActionBarMenu createActionMode(boolean z, String str) {
        if (actionModeIsExist(str)) {
            return this.actionMode;
        }
        ActionBarMenu actionBarMenu = this.actionMode;
        if (actionBarMenu != null) {
            removeView(actionBarMenu);
            this.actionMode = null;
        }
        this.actionModeTag = str;
        ActionBarMenu actionBarMenu2 = new ActionBarMenu(getContext(), this) { // from class: org.telegram.ui.ActionBar.ActionBar.1
            @Override // android.view.ViewGroup, android.view.View
            protected void dispatchDraw(Canvas canvas) {
                ActionBar actionBar = ActionBar.this;
                if (actionBar.blurredBackground && this.drawBlur) {
                    actionBar.rectTmp.set(0, 0, getMeasuredWidth(), getMeasuredHeight());
                    ActionBar actionBar2 = ActionBar.this;
                    actionBar2.blurScrimPaint.setColor(actionBar2.actionModeColor);
                    ActionBar actionBar3 = ActionBar.this;
                    actionBar3.contentView.drawBlurRect(canvas, 0.0f, actionBar3.rectTmp, actionBar3.blurScrimPaint, true);
                }
                super.dispatchDraw(canvas);
            }

            @Override // android.view.ViewGroup, android.view.View
            protected void onAttachedToWindow() {
                super.onAttachedToWindow();
                SizeNotifierFrameLayout sizeNotifierFrameLayout = ActionBar.this.contentView;
                if (sizeNotifierFrameLayout != null) {
                    sizeNotifierFrameLayout.blurBehindViews.add(this);
                }
            }

            @Override // android.view.ViewGroup, android.view.View
            protected void onDetachedFromWindow() {
                super.onDetachedFromWindow();
                SizeNotifierFrameLayout sizeNotifierFrameLayout = ActionBar.this.contentView;
                if (sizeNotifierFrameLayout != null) {
                    sizeNotifierFrameLayout.blurBehindViews.remove(this);
                }
            }

            @Override // android.view.View
            public void setBackgroundColor(int i) {
                ActionBar.this.actionModeColor = i;
                ActionBar actionBar = ActionBar.this;
                if (actionBar.blurredBackground) {
                    return;
                }
                super.setBackgroundColor(actionBar.actionModeColor);
            }
        };
        this.actionMode = actionBarMenu2;
        actionBarMenu2.isActionMode = true;
        actionBarMenu2.setClickable(true);
        this.actionMode.setBackgroundColor(getThemedColor(Theme.key_actionBarActionModeDefault));
        addView(this.actionMode, indexOfChild(this.backButtonImageView));
        this.actionMode.setPadding(0, this.occupyStatusBar ? AndroidUtilities.statusBarHeight : 0, 0, 0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.actionMode.getLayoutParams();
        layoutParams.height = -1;
        layoutParams.width = -1;
        layoutParams.bottomMargin = this.extraHeight;
        layoutParams.gravity = 5;
        this.actionMode.setLayoutParams(layoutParams);
        this.actionMode.setVisibility(4);
        return this.actionMode;
    }

    public void createAdditionalSubtitleTextView() {
        if (this.additionalSubtitleTextView != null) {
            return;
        }
        SimpleTextView simpleTextView = new SimpleTextView(getContext());
        this.additionalSubtitleTextView = simpleTextView;
        simpleTextView.setGravity(3);
        this.additionalSubtitleTextView.setVisibility(8);
        this.additionalSubtitleTextView.setTextColor(getThemedColor(Theme.key_actionBarDefaultSubtitle));
        addView(this.additionalSubtitleTextView, 0, LayoutHelper.createFrame(-2, -2, 51));
    }

    public ActionBarMenu createMenu() {
        ActionBarMenu actionBarMenu = this.menu;
        if (actionBarMenu != null) {
            return actionBarMenu;
        }
        ActionBarMenu actionBarMenu2 = new ActionBarMenu(getContext(), this);
        this.menu = actionBarMenu2;
        addView(actionBarMenu2, 0, LayoutHelper.createFrame(-2, -1, 5));
        return this.menu;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        if (this.blurredBackground && this.actionBarColor != 0) {
            this.rectTmp.set(0, 0, getMeasuredWidth(), getMeasuredHeight());
            this.blurScrimPaint.setColor(this.actionBarColor);
            this.contentView.drawBlurRect(canvas, getY(), this.rectTmp, this.blurScrimPaint, true);
        }
        super.dispatchDraw(canvas);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Removed duplicated region for block: B:56:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0142  */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean drawChild(Canvas canvas, View view, long j) {
        Drawable currentHolidayDrawable;
        SnowflakesEffect snowflakesEffect;
        SnowflakesEffect snowflakesEffect2;
        BaseFragment baseFragment = this.parentFragment;
        if (baseFragment != null && baseFragment.getParentLayout() != null && this.parentFragment.getParentLayout().isActionBarInCrossfade()) {
            return false;
        }
        if (this.drawBackButton && view == this.backButtonImageView) {
            return true;
        }
        boolean shouldClipChild = shouldClipChild(view);
        if (shouldClipChild) {
            canvas.save();
            canvas.clipRect(0.0f, (-getTranslationY()) + (this.occupyStatusBar ? AndroidUtilities.statusBarHeight : 0), getMeasuredWidth(), getMeasuredHeight());
        }
        boolean drawChild = super.drawChild(canvas, view, j);
        if (this.supportsHolidayImage && !this.titleOverlayShown && !LocaleController.isRTL) {
            SimpleTextView[] simpleTextViewArr = this.titleTextView;
            if ((view == simpleTextViewArr[0] || view == simpleTextViewArr[1] || (view == this.titlesContainer && this.useContainerForTitles)) && (currentHolidayDrawable = Theme.getCurrentHolidayDrawable()) != null) {
                SimpleTextView simpleTextView = view == this.titlesContainer ? this.titleTextView[0] : (SimpleTextView) view;
                if (simpleTextView != null && simpleTextView.getVisibility() == 0 && (simpleTextView.getText() instanceof String)) {
                    TextPaint textPaint = simpleTextView.getTextPaint();
                    textPaint.getFontMetricsInt(this.fontMetricsInt);
                    textPaint.getTextBounds((String) simpleTextView.getText(), 0, 1, this.rect);
                    int textStartX = simpleTextView.getTextStartX() + Theme.getCurrentHolidayDrawableXOffset() + ((this.rect.width() - (currentHolidayDrawable.getIntrinsicWidth() + Theme.getCurrentHolidayDrawableXOffset())) / 2);
                    int textStartY = simpleTextView.getTextStartY() + Theme.getCurrentHolidayDrawableYOffset() + ((int) Math.ceil((simpleTextView.getTextHeight() - this.rect.height()) / 2.0f)) + ((int) (AndroidUtilities.dp(8.0f) * (1.0f - this.titlesContainer.getScaleY())));
                    currentHolidayDrawable.setBounds(textStartX, textStartY - currentHolidayDrawable.getIntrinsicHeight(), currentHolidayDrawable.getIntrinsicWidth() + textStartX, textStartY);
                    currentHolidayDrawable.setAlpha((int) (this.titlesContainer.getAlpha() * 255.0f * simpleTextView.getAlpha()));
                    currentHolidayDrawable.draw(canvas);
                    if (this.overlayTitleAnimationInProgress) {
                        view.invalidate();
                        invalidate();
                    }
                }
                if (Theme.canStartHolidayAnimation()) {
                    if (this.snowflakesEffect == null) {
                        snowflakesEffect = new SnowflakesEffect(0);
                        this.snowflakesEffect = snowflakesEffect;
                    }
                    snowflakesEffect2 = this.snowflakesEffect;
                    if (snowflakesEffect2 == null) {
                        snowflakesEffect2.onDraw(this, canvas);
                    } else {
                        FireworksEffect fireworksEffect = this.fireworksEffect;
                        if (fireworksEffect != null) {
                            fireworksEffect.onDraw(this, canvas);
                        }
                    }
                } else {
                    if (!this.manualStart && this.snowflakesEffect != null) {
                        snowflakesEffect = null;
                        this.snowflakesEffect = snowflakesEffect;
                    }
                    snowflakesEffect2 = this.snowflakesEffect;
                    if (snowflakesEffect2 == null) {
                    }
                }
            }
        }
        if (shouldClipChild) {
            canvas.restore();
        }
        return drawChild;
    }

    public ActionBarMenuOnItemClick getActionBarMenuOnItemClick() {
        return this.actionBarMenuOnItemClick;
    }

    public ActionBarMenu getActionMode() {
        return this.actionMode;
    }

    public SimpleTextView getAdditionalSubtitleTextView() {
        return this.additionalSubtitleTextView;
    }

    public ImageView getBackButton() {
        return this.backButtonImageView;
    }

    public Drawable getBackButtonDrawable() {
        return this.backButtonDrawable;
    }

    public INavigationLayout.BackButtonState getBackButtonState() {
        return this.backButtonState;
    }

    public int getBackgroundColor() {
        return this.actionBarColor;
    }

    public boolean getCastShadows() {
        return this.castShadows;
    }

    public boolean getOccupyStatusBar() {
        return this.occupyStatusBar;
    }

    public BackupImageView getSearchAvatarImageView() {
        return this.avatarSearchImageView;
    }

    public String getSubtitle() {
        CharSequence charSequence;
        if (this.subtitleTextView == null || (charSequence = this.subtitle) == null) {
            return null;
        }
        return charSequence.toString();
    }

    public SimpleTextView getSubtitleTextView() {
        return this.subtitleTextView;
    }

    public String getTitle() {
        SimpleTextView simpleTextView = this.titleTextView[0];
        if (simpleTextView == null) {
            return null;
        }
        return simpleTextView.getText().toString();
    }

    public SimpleTextView getTitleTextView() {
        return this.titleTextView[0];
    }

    public SimpleTextView getTitleTextView2() {
        return this.titleTextView[1];
    }

    public FrameLayout getTitlesContainer() {
        return this.titlesContainer;
    }

    @Override // android.view.View
    public boolean hasOverlappingRendering() {
        return false;
    }

    public void hideActionMode() {
        ActionBarMenu actionBarMenu = this.actionMode;
        if (actionBarMenu == null || !this.actionModeVisible) {
            return;
        }
        actionBarMenu.hideAllPopupMenus();
        this.actionModeVisible = false;
        ArrayList arrayList = new ArrayList();
        arrayList.add(ObjectAnimator.ofFloat(this.actionMode, (Property<ActionBarMenu, Float>) View.ALPHA, 0.0f));
        if (this.actionModeHidingViews != null) {
            int i = 0;
            while (true) {
                View[] viewArr = this.actionModeHidingViews;
                if (i >= viewArr.length) {
                    break;
                }
                View view = viewArr[i];
                if (view != null) {
                    view.setVisibility(0);
                    arrayList.add(ObjectAnimator.ofFloat(this.actionModeHidingViews[i], (Property<View, Float>) View.ALPHA, 1.0f));
                }
                i++;
            }
        }
        View view2 = this.actionModeTranslationView;
        if (view2 != null) {
            arrayList.add(ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Y, 0.0f));
            this.actionModeTranslationView = null;
        }
        View view3 = this.actionModeShowingView;
        if (view3 != null) {
            arrayList.add(ObjectAnimator.ofFloat(view3, (Property<View, Float>) View.ALPHA, 0.0f));
        }
        View view4 = this.actionModeExtraView;
        if (view4 != null) {
            arrayList.add(ObjectAnimator.ofFloat(view4, (Property<View, Float>) View.TRANSLATION_Y, view4.getMeasuredHeight()));
        }
        int i2 = this.actionBarColor;
        if (i2 == 0) {
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
        } else {
            double calculateLuminance = ColorUtils.calculateLuminance(i2);
            Window window = ((Activity) getContext()).getWindow();
            if (calculateLuminance < 0.699999988079071d) {
                AndroidUtilities.setLightStatusBar(window, false);
            } else {
                AndroidUtilities.setLightStatusBar(window, true);
            }
        }
        AnimatorSet animatorSet = this.actionModeAnimation;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.actionModeAnimation = animatorSet2;
        animatorSet2.playTogether(arrayList);
        if (this.backgroundUpdateListener != null) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.ActionBar.ActionBar$$ExternalSyntheticLambda0
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    ActionBar.this.lambda$hideActionMode$3(valueAnimator);
                }
            });
            this.actionModeAnimation.playTogether(ofFloat);
        }
        this.actionModeAnimation.setDuration(200L);
        this.actionModeAnimation.addListener(new AnimatorListenerAdapter() { // from class: org.telegram.ui.ActionBar.ActionBar.3
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
                if (ActionBar.this.actionModeAnimation == null || !ActionBar.this.actionModeAnimation.equals(animator)) {
                    return;
                }
                ActionBar.this.actionModeAnimation = null;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                if (ActionBar.this.actionModeAnimation == null || !ActionBar.this.actionModeAnimation.equals(animator)) {
                    return;
                }
                ActionBar.this.actionModeAnimation = null;
                ActionBar.this.actionMode.setVisibility(4);
                ActionBar actionBar = ActionBar.this;
                if (actionBar.occupyStatusBar) {
                    View unused = actionBar.actionModeTop;
                }
                if (ActionBar.this.actionModeExtraView != null) {
                    ActionBar.this.actionModeExtraView.setVisibility(4);
                }
            }
        });
        this.actionModeAnimation.start();
        if (!this.isSearchFieldVisible) {
            SimpleTextView simpleTextView = this.titleTextView[0];
            if (simpleTextView != null) {
                simpleTextView.setVisibility(0);
            }
            if (this.subtitleTextView != null && !TextUtils.isEmpty(this.subtitle)) {
                this.subtitleTextView.setVisibility(0);
            }
        }
        ActionBarMenu actionBarMenu2 = this.menu;
        if (actionBarMenu2 != null) {
            actionBarMenu2.setVisibility(0);
        }
        ImageView imageView = this.backButtonImageView;
        if (imageView != null) {
            Drawable drawable = imageView.getDrawable();
            if (drawable instanceof BackDrawable) {
                ((BackDrawable) drawable).setRotation(0.0f, true);
            }
            this.backButtonImageView.setBackgroundDrawable(Theme.createSelectorDrawable(this.itemsBackgroundColor));
        }
    }

    public boolean isActionModeShowed() {
        return this.actionMode != null && this.actionModeVisible;
    }

    public boolean isActionModeShowed(String str) {
        String str2;
        return this.actionMode != null && this.actionModeVisible && (((str2 = this.actionModeTag) == null && str == null) || (str2 != null && str2.equals(str)));
    }

    public boolean isSearchFieldVisible() {
        return this.isSearchFieldVisible;
    }

    public void listenToBackgroundUpdate(Runnable runnable) {
        this.backgroundUpdateListener = runnable;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.attached = true;
        updateAttachState();
        if (this.actionModeVisible) {
            if (ColorUtils.calculateLuminance(this.actionModeColor) < 0.699999988079071d) {
                AndroidUtilities.setLightStatusBar(((Activity) getContext()).getWindow(), false);
            } else {
                AndroidUtilities.setLightStatusBar(((Activity) getContext()).getWindow(), true);
            }
        }
        Drawable drawable = this.lastRightDrawable;
        if (drawable instanceof AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable) {
            ((AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable) drawable).setParentView(this.titleTextView[0]);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.attached = false;
        updateAttachState();
        if (this.actionModeVisible) {
            int i = this.actionBarColor;
            if (i == 0) {
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
            } else if (ColorUtils.calculateLuminance(i) < 0.699999988079071d) {
                AndroidUtilities.setLightStatusBar(((Activity) getContext()).getWindow(), false);
            } else {
                AndroidUtilities.setLightStatusBar(((Activity) getContext()).getWindow(), true);
            }
        }
        Drawable drawable = this.lastRightDrawable;
        if (drawable instanceof AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable) {
            ((AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable) drawable).setParentView(null);
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        Drawable currentHolidayDrawable;
        SimpleTextView simpleTextView;
        if (this.supportsHolidayImage && !this.titleOverlayShown && !LocaleController.isRTL && motionEvent.getAction() == 0 && (currentHolidayDrawable = Theme.getCurrentHolidayDrawable()) != null && currentHolidayDrawable.getBounds().contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
            this.manualStart = true;
            if (this.snowflakesEffect == null) {
                this.fireworksEffect = null;
                this.snowflakesEffect = new SnowflakesEffect(0);
                simpleTextView = this.titleTextView[0];
            } else {
                this.snowflakesEffect = null;
                this.fireworksEffect = new FireworksEffect();
                simpleTextView = this.titleTextView[0];
            }
            simpleTextView.invalidate();
            invalidate();
        }
        View.OnTouchListener onTouchListener = this.interceptTouchEventListener;
        return (onTouchListener != null && onTouchListener.onTouch(this, motionEvent)) || super.onInterceptTouchEvent(motionEvent);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0253  */
    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        float f;
        int i5;
        int i6;
        int i7;
        int i8;
        int currentActionBarHeight;
        SimpleTextView simpleTextView;
        int currentActionBarHeight2;
        int i9 = this.occupyStatusBar ? AndroidUtilities.statusBarHeight : 0;
        ImageView imageView = this.backButtonImageView;
        if (imageView == null || imageView.getVisibility() == 8) {
            f = AndroidUtilities.isTablet() ? 26.0f : 18.0f;
        } else {
            ImageView imageView2 = this.backButtonImageView;
            imageView2.layout(0, i9, imageView2.getMeasuredWidth(), this.backButtonImageView.getMeasuredHeight() + i9);
            f = AndroidUtilities.isTablet() ? 80.0f : 72.0f;
        }
        int dp = AndroidUtilities.dp(f);
        ActionBarMenu actionBarMenu = this.menu;
        if (actionBarMenu != null && actionBarMenu.getVisibility() != 8) {
            int dp2 = this.menu.searchFieldVisible() ? AndroidUtilities.dp(AndroidUtilities.isTablet() ? 74.0f : 66.0f) : (i3 - i) - this.menu.getMeasuredWidth();
            ActionBarMenu actionBarMenu2 = this.menu;
            actionBarMenu2.layout(dp2, i9, actionBarMenu2.getMeasuredWidth() + dp2, this.menu.getMeasuredHeight() + i9);
        }
        for (int i10 = 0; i10 < 2; i10++) {
            SimpleTextView simpleTextView2 = this.titleTextView[i10];
            if (simpleTextView2 != null && simpleTextView2.getVisibility() != 8) {
                boolean z2 = this.fromBottom;
                if (((z2 && i10 == 0) || (!z2 && i10 == 1)) && this.overlayTitleAnimation && this.titleAnimationRunning) {
                    currentActionBarHeight = getCurrentActionBarHeight();
                    simpleTextView = this.titleTextView[i10];
                } else {
                    SimpleTextView simpleTextView3 = this.subtitleTextView;
                    if (simpleTextView3 == null || simpleTextView3.getVisibility() == 8) {
                        currentActionBarHeight = getCurrentActionBarHeight();
                        simpleTextView = this.titleTextView[i10];
                    } else {
                        currentActionBarHeight2 = (((getCurrentActionBarHeight() / 2) - this.titleTextView[i10].getTextHeight()) / 2) + AndroidUtilities.dp((AndroidUtilities.isTablet() || getResources().getConfiguration().orientation != 2) ? 3.0f : 2.0f);
                        SimpleTextView simpleTextView4 = this.titleTextView[i10];
                        int i11 = currentActionBarHeight2 + i9;
                        simpleTextView4.layout(dp, i11 - simpleTextView4.getPaddingTop(), this.titleTextView[i10].getMeasuredWidth() + dp, ((i11 + this.titleTextView[i10].getTextHeight()) - this.titleTextView[i10].getPaddingTop()) + this.titleTextView[i10].getPaddingBottom());
                    }
                }
                currentActionBarHeight2 = (currentActionBarHeight - simpleTextView.getTextHeight()) / 2;
                SimpleTextView simpleTextView42 = this.titleTextView[i10];
                int i112 = currentActionBarHeight2 + i9;
                simpleTextView42.layout(dp, i112 - simpleTextView42.getPaddingTop(), this.titleTextView[i10].getMeasuredWidth() + dp, ((i112 + this.titleTextView[i10].getTextHeight()) - this.titleTextView[i10].getPaddingTop()) + this.titleTextView[i10].getPaddingBottom());
            }
        }
        SimpleTextView simpleTextView5 = this.subtitleTextView;
        if (simpleTextView5 != null && simpleTextView5.getVisibility() != 8) {
            int currentActionBarHeight3 = (getCurrentActionBarHeight() / 2) + (((getCurrentActionBarHeight() / 2) - this.subtitleTextView.getTextHeight()) / 2);
            if (!AndroidUtilities.isTablet()) {
                int i12 = getResources().getConfiguration().orientation;
            }
            int dp3 = currentActionBarHeight3 - AndroidUtilities.dp(1.0f);
            SimpleTextView simpleTextView6 = this.subtitleTextView;
            int i13 = dp3 + i9;
            simpleTextView6.layout(dp, i13, simpleTextView6.getMeasuredWidth() + dp, this.subtitleTextView.getTextHeight() + i13);
        }
        SimpleTextView simpleTextView7 = this.additionalSubtitleTextView;
        if (simpleTextView7 != null && simpleTextView7.getVisibility() != 8) {
            int currentActionBarHeight4 = (getCurrentActionBarHeight() / 2) + (((getCurrentActionBarHeight() / 2) - this.additionalSubtitleTextView.getTextHeight()) / 2);
            if (!AndroidUtilities.isTablet()) {
                int i14 = getResources().getConfiguration().orientation;
            }
            int dp4 = currentActionBarHeight4 - AndroidUtilities.dp(1.0f);
            SimpleTextView simpleTextView8 = this.additionalSubtitleTextView;
            int i15 = dp4 + i9;
            simpleTextView8.layout(dp, i15, simpleTextView8.getMeasuredWidth() + dp, this.additionalSubtitleTextView.getTextHeight() + i15);
        }
        BackupImageView backupImageView = this.avatarSearchImageView;
        if (backupImageView != null) {
            backupImageView.layout(AndroidUtilities.dp(64.0f), ((getCurrentActionBarHeight() - this.avatarSearchImageView.getMeasuredHeight()) / 2) + i9, AndroidUtilities.dp(64.0f) + this.avatarSearchImageView.getMeasuredWidth(), i9 + ((getCurrentActionBarHeight() + this.avatarSearchImageView.getMeasuredHeight()) / 2));
        }
        int childCount = getChildCount();
        for (int i16 = 0; i16 < childCount; i16++) {
            View childAt = getChildAt(i16);
            if (childAt.getVisibility() != 8) {
                SimpleTextView[] simpleTextViewArr = this.titleTextView;
                if (childAt != simpleTextViewArr[0] && childAt != simpleTextViewArr[1] && childAt != this.subtitleTextView && childAt != this.menu && childAt != this.backButtonImageView && childAt != this.additionalSubtitleTextView && childAt != this.avatarSearchImageView) {
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight = childAt.getMeasuredHeight();
                    int i17 = layoutParams.gravity;
                    if (i17 == -1) {
                        i17 = 51;
                    }
                    int i18 = i17 & 112;
                    int i19 = i17 & 7;
                    if (i19 == 1) {
                        i5 = (((i3 - i) - measuredWidth) / 2) + layoutParams.leftMargin;
                    } else if (i19 != 5) {
                        i6 = layoutParams.leftMargin;
                        if (i18 != 16) {
                            i7 = (((i4 - i2) - measuredHeight) / 2) + layoutParams.topMargin;
                        } else if (i18 != 80) {
                            i8 = layoutParams.topMargin;
                            childAt.layout(i6, i8, measuredWidth + i6, measuredHeight + i8);
                        } else {
                            i7 = (i4 - i2) - measuredHeight;
                        }
                        i8 = i7 - layoutParams.bottomMargin;
                        childAt.layout(i6, i8, measuredWidth + i6, measuredHeight + i8);
                    } else {
                        i5 = i3 - measuredWidth;
                    }
                    i6 = i5 - layoutParams.rightMargin;
                    if (i18 != 16) {
                    }
                    i8 = i7 - layoutParams.bottomMargin;
                    childAt.layout(i6, i8, measuredWidth + i6, measuredHeight + i8);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x020e, code lost:
    
        if (getResources().getConfiguration().orientation == 2) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00e5, code lost:
    
        if (r18.isMenuOffsetSuppressed == false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00f0, code lost:
    
        r18.menu.translateXItems(0.0f);
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00ee, code lost:
    
        if (r18.isMenuOffsetSuppressed == false) goto L53;
     */
    /* JADX WARN: Removed duplicated region for block: B:76:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x027b  */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onMeasure(int i, int i2) {
        float f;
        SimpleTextView simpleTextView;
        SimpleTextView simpleTextView2;
        int i3;
        SimpleTextView simpleTextView3;
        SimpleTextView simpleTextView4;
        SimpleTextView simpleTextView5;
        SimpleTextView simpleTextView6;
        int makeMeasureSpec;
        int size = View.MeasureSpec.getSize(i);
        View.MeasureSpec.getSize(i2);
        int currentActionBarHeight = getCurrentActionBarHeight();
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(currentActionBarHeight, 1073741824);
        this.ignoreLayoutRequest = true;
        View view = this.actionModeTop;
        if (view != null) {
            ((FrameLayout.LayoutParams) view.getLayoutParams()).height = AndroidUtilities.statusBarHeight;
        }
        ActionBarMenu actionBarMenu = this.actionMode;
        if (actionBarMenu != null) {
            actionBarMenu.setPadding(0, this.occupyStatusBar ? AndroidUtilities.statusBarHeight : 0, 0, 0);
        }
        this.ignoreLayoutRequest = false;
        setMeasuredDimension(size, currentActionBarHeight + (this.occupyStatusBar ? AndroidUtilities.statusBarHeight : 0) + this.extraHeight);
        ImageView imageView = this.backButtonImageView;
        if (imageView == null || imageView.getVisibility() == 8) {
            f = AndroidUtilities.isTablet() ? 26.0f : 18.0f;
        } else {
            this.backButtonImageView.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(54.0f), 1073741824), makeMeasureSpec2);
            f = AndroidUtilities.isTablet() ? 80.0f : 72.0f;
        }
        int dp = AndroidUtilities.dp(f);
        ActionBarMenu actionBarMenu2 = this.menu;
        if (actionBarMenu2 != null && actionBarMenu2.getVisibility() != 8) {
            if (this.menu.searchFieldVisible() && !this.isSearchFieldVisible) {
                this.menu.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), makeMeasureSpec2);
                int itemsMeasuredWidth = this.menu.getItemsMeasuredWidth(true);
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec((size - AndroidUtilities.dp(AndroidUtilities.isTablet() ? 74.0f : 66.0f)) + this.menu.getItemsMeasuredWidth(true), 1073741824);
                if (!this.isMenuOffsetSuppressed) {
                    this.menu.translateXItems(-itemsMeasuredWidth);
                }
            } else if (this.isSearchFieldVisible) {
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size - AndroidUtilities.dp(AndroidUtilities.isTablet() ? 74.0f : 66.0f), 1073741824);
            } else {
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE);
            }
            this.menu.measure(makeMeasureSpec, makeMeasureSpec2);
        }
        for (int i4 = 0; i4 < 2; i4++) {
            SimpleTextView simpleTextView7 = this.titleTextView[0];
            if ((simpleTextView7 != null && simpleTextView7.getVisibility() != 8) || ((simpleTextView = this.subtitleTextView) != null && simpleTextView.getVisibility() != 8)) {
                ActionBarMenu actionBarMenu3 = this.menu;
                int measuredWidth = (((size - (actionBarMenu3 != null ? actionBarMenu3.getMeasuredWidth() : 0)) - AndroidUtilities.dp(16.0f)) - dp) - this.titleRightMargin;
                boolean z = this.fromBottom;
                if (((z && i4 == 0) || (!z && i4 == 1)) && this.overlayTitleAnimation && this.titleAnimationRunning) {
                    simpleTextView2 = this.titleTextView[i4];
                    i3 = (AndroidUtilities.isTablet() || getResources().getConfiguration().orientation != 2) ? 20 : 18;
                } else {
                    SimpleTextView simpleTextView8 = this.titleTextView[0];
                    if (simpleTextView8 == null || simpleTextView8.getVisibility() == 8 || (simpleTextView3 = this.subtitleTextView) == null || simpleTextView3.getVisibility() == 8) {
                        SimpleTextView simpleTextView9 = this.titleTextView[i4];
                        if (simpleTextView9 != null && simpleTextView9.getVisibility() != 8) {
                            this.titleTextView[i4].setTextSize((AndroidUtilities.isTablet() || getResources().getConfiguration().orientation != 2) ? 20 : 18);
                        }
                        SimpleTextView simpleTextView10 = this.subtitleTextView;
                        if (simpleTextView10 != null && simpleTextView10.getVisibility() != 8) {
                            this.subtitleTextView.setTextSize((AndroidUtilities.isTablet() || getResources().getConfiguration().orientation != 2) ? 16 : 14);
                        }
                        simpleTextView2 = this.additionalSubtitleTextView;
                        if (simpleTextView2 != null) {
                            if (!AndroidUtilities.isTablet()) {
                            }
                            i3 = 16;
                        }
                    } else {
                        SimpleTextView simpleTextView11 = this.titleTextView[i4];
                        if (simpleTextView11 != null) {
                            simpleTextView11.setTextSize(AndroidUtilities.isTablet() ? 20 : 18);
                        }
                        this.subtitleTextView.setTextSize(AndroidUtilities.isTablet() ? 16 : 14);
                        SimpleTextView simpleTextView12 = this.additionalSubtitleTextView;
                        if (simpleTextView12 != null) {
                            if (AndroidUtilities.isTablet()) {
                                simpleTextView2 = simpleTextView12;
                                i3 = 16;
                            } else {
                                simpleTextView2 = simpleTextView12;
                                i3 = 14;
                            }
                        }
                    }
                    simpleTextView4 = this.titleTextView[i4];
                    if (simpleTextView4 != null && simpleTextView4.getVisibility() != 8) {
                        this.titleTextView[i4].measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(24.0f) + this.titleTextView[i4].getPaddingTop() + this.titleTextView[i4].getPaddingBottom(), Integer.MIN_VALUE));
                        if (this.centerScale) {
                            this.titleTextView[i4].setPivotX(0.0f);
                            this.titleTextView[i4].setPivotY(0.0f);
                        } else {
                            CharSequence text = this.titleTextView[i4].getText();
                            SimpleTextView simpleTextView13 = this.titleTextView[i4];
                            simpleTextView13.setPivotX(simpleTextView13.getTextPaint().measureText(text, 0, text.length()) / 2.0f);
                            this.titleTextView[i4].setPivotY(AndroidUtilities.dp(24.0f) >> 1);
                        }
                    }
                    simpleTextView5 = this.subtitleTextView;
                    if (simpleTextView5 != null && simpleTextView5.getVisibility() != 8) {
                        this.subtitleTextView.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), Integer.MIN_VALUE));
                    }
                    simpleTextView6 = this.additionalSubtitleTextView;
                    if (simpleTextView6 != null && simpleTextView6.getVisibility() != 8) {
                        this.additionalSubtitleTextView.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), Integer.MIN_VALUE));
                    }
                }
                simpleTextView2.setTextSize(i3);
                simpleTextView4 = this.titleTextView[i4];
                if (simpleTextView4 != null) {
                    this.titleTextView[i4].measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(24.0f) + this.titleTextView[i4].getPaddingTop() + this.titleTextView[i4].getPaddingBottom(), Integer.MIN_VALUE));
                    if (this.centerScale) {
                    }
                }
                simpleTextView5 = this.subtitleTextView;
                if (simpleTextView5 != null) {
                    this.subtitleTextView.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), Integer.MIN_VALUE));
                }
                simpleTextView6 = this.additionalSubtitleTextView;
                if (simpleTextView6 != null) {
                    this.additionalSubtitleTextView.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), Integer.MIN_VALUE));
                }
            }
        }
        BackupImageView backupImageView = this.avatarSearchImageView;
        if (backupImageView != null) {
            backupImageView.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(42.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(42.0f), 1073741824));
        }
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                SimpleTextView[] simpleTextViewArr = this.titleTextView;
                if (childAt != simpleTextViewArr[0] && childAt != simpleTextViewArr[1] && childAt != this.subtitleTextView && childAt != this.menu && childAt != this.backButtonImageView && childAt != this.additionalSubtitleTextView && childAt != this.avatarSearchImageView) {
                    measureChildWithMargins(childAt, i, 0, View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824), 0);
                }
            }
        }
    }

    public void onMenuButtonPressed() {
        ActionBarMenu actionBarMenu;
        if (isActionModeShowed() || (actionBarMenu = this.menu) == null) {
            return;
        }
        actionBarMenu.onMenuButtonPressed();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void onPause() {
        this.resumed = false;
        updateAttachState();
        ActionBarMenu actionBarMenu = this.menu;
        if (actionBarMenu != null) {
            actionBarMenu.hideAllPopupMenus();
        }
    }

    public void onResume() {
        this.resumed = true;
        updateAttachState();
    }

    protected boolean onSearchChangedIgnoreTitles() {
        return false;
    }

    public void onSearchFieldVisibilityChanged(final boolean z) {
        this.isSearchFieldVisible = z;
        AnimatorSet animatorSet = this.searchVisibleAnimator;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.searchVisibleAnimator = new AnimatorSet();
        final ArrayList arrayList = new ArrayList();
        final boolean onSearchChangedIgnoreTitles = onSearchChangedIgnoreTitles();
        if (!onSearchChangedIgnoreTitles) {
            SimpleTextView simpleTextView = this.titleTextView[0];
            if (simpleTextView != null) {
                arrayList.add(simpleTextView);
            }
            if (this.subtitleTextView != null && !TextUtils.isEmpty(this.subtitle)) {
                arrayList.add(this.subtitleTextView);
                this.subtitleTextView.setVisibility(z ? 4 : 0);
            }
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.searchFieldVisibleAlpha, z ? 1.0f : 0.0f);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.ActionBar.ActionBar$$ExternalSyntheticLambda1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                ActionBar.this.lambda$onSearchFieldVisibilityChanged$4(valueAnimator);
            }
        });
        this.searchVisibleAnimator.playTogether(ofFloat);
        for (int i = 0; i < arrayList.size(); i++) {
            View view = (View) arrayList.get(i);
            float f = 0.95f;
            if (!z) {
                view.setVisibility(0);
                view.setAlpha(0.0f);
                view.setScaleX(0.95f);
                view.setScaleY(0.95f);
            }
            this.searchVisibleAnimator.playTogether(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, z ? 0.0f : 1.0f));
            this.searchVisibleAnimator.playTogether(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_Y, z ? 0.95f : 1.0f));
            AnimatorSet animatorSet2 = this.searchVisibleAnimator;
            Property property = View.SCALE_X;
            if (!z) {
                f = 1.0f;
            }
            animatorSet2.playTogether(ObjectAnimator.ofFloat(view, (Property<View, Float>) property, f));
        }
        BackupImageView backupImageView = this.avatarSearchImageView;
        if (backupImageView != null) {
            backupImageView.setVisibility(0);
            this.searchVisibleAnimator.playTogether(ObjectAnimator.ofFloat(this.avatarSearchImageView, (Property<BackupImageView, Float>) View.ALPHA, z ? 1.0f : 0.0f));
        }
        this.centerScale = true;
        requestLayout();
        this.searchVisibleAnimator.addListener(new AnimatorListenerAdapter() { // from class: org.telegram.ui.ActionBar.ActionBar.4
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                float f2;
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    View view2 = (View) arrayList.get(i2);
                    if (z) {
                        view2.setVisibility(4);
                        f2 = 0.0f;
                    } else {
                        f2 = 1.0f;
                    }
                    view2.setAlpha(f2);
                }
                if (z && !onSearchChangedIgnoreTitles) {
                    if (ActionBar.this.titleTextView[0] != null) {
                        ActionBar.this.titleTextView[0].setVisibility(8);
                    }
                    if (ActionBar.this.titleTextView[1] != null) {
                        ActionBar.this.titleTextView[1].setVisibility(8);
                    }
                }
                if (ActionBar.this.avatarSearchImageView == null || z) {
                    return;
                }
                ActionBar.this.avatarSearchImageView.setVisibility(8);
            }
        });
        this.searchVisibleAnimator.setDuration(150L).start();
        ImageView imageView = this.backButtonImageView;
        if (imageView != null) {
            Drawable drawable = imageView.getDrawable();
            if (drawable instanceof MenuDrawable) {
                MenuDrawable menuDrawable = (MenuDrawable) drawable;
                menuDrawable.setRotateToBack(true);
                menuDrawable.setRotation(z ? 1.0f : 0.0f, true);
            }
        }
    }

    public void onSearchPressed() {
        this.menu.onSearchPressed();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.forceSkipTouches) {
            return false;
        }
        return super.onTouchEvent(motionEvent) || this.interceptTouches;
    }

    public void openSearchField(String str, boolean z) {
        ActionBarMenu actionBarMenu = this.menu;
        if (actionBarMenu == null || str == null) {
            return;
        }
        boolean z2 = !this.isSearchFieldVisible;
        actionBarMenu.openSearchField(z2, z2, str, z);
    }

    public void openSearchField(boolean z) {
        ActionBarMenu actionBarMenu = this.menu;
        if (actionBarMenu == null) {
            return;
        }
        actionBarMenu.openSearchField(!this.isSearchFieldVisible, false, "", z);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (this.ignoreLayoutRequest) {
            return;
        }
        super.requestLayout();
    }

    public void setActionBarMenuOnItemClick(ActionBarMenuOnItemClick actionBarMenuOnItemClick) {
        this.actionBarMenuOnItemClick = actionBarMenuOnItemClick;
    }

    public void setActionModeColor(int i) {
        ActionBarMenu actionBarMenu = this.actionMode;
        if (actionBarMenu != null) {
            actionBarMenu.setBackgroundColor(i);
        }
    }

    public void setActionModeOverrideColor(int i) {
        this.actionModeColor = i;
    }

    public void setActionModeTopColor(int i) {
        View view = this.actionModeTop;
        if (view != null) {
            view.setBackgroundColor(i);
        }
    }

    public void setAddToContainer(boolean z) {
        this.addToContainer = z;
    }

    public void setAllowOverlayTitle(boolean z) {
        this.allowOverlayTitle = z;
    }

    public void setBackButtonContentDescription(CharSequence charSequence) {
        ImageView imageView = this.backButtonImageView;
        if (imageView != null) {
            imageView.setContentDescription(charSequence);
        }
    }

    public void setBackButtonDrawable(Drawable drawable) {
        if (this.backButtonImageView == null) {
            createBackButtonImage();
        }
        this.backButtonImageView.setVisibility(drawable == null ? 8 : 0);
        ImageView imageView = this.backButtonImageView;
        this.backButtonDrawable = drawable;
        imageView.setImageDrawable(drawable);
        if (drawable instanceof BackDrawable) {
            BackDrawable backDrawable = (BackDrawable) drawable;
            backDrawable.setRotation(isActionModeShowed() ? 1.0f : 0.0f, false);
            backDrawable.setRotatedColor(this.itemsActionModeColor);
            backDrawable.setColor(this.itemsColor);
            return;
        }
        if (drawable instanceof MenuDrawable) {
            MenuDrawable menuDrawable = (MenuDrawable) drawable;
            menuDrawable.setBackColor(this.actionBarColor);
            menuDrawable.setIconColor(this.itemsColor);
        } else if (drawable instanceof BitmapDrawable) {
            this.backButtonImageView.setColorFilter(new PorterDuffColorFilter(this.itemsColor, PorterDuff.Mode.SRC_IN));
        }
    }

    public void setBackButtonImage(int i) {
        if (this.backButtonImageView == null) {
            createBackButtonImage();
        }
        this.backButtonImageView.setVisibility(i == 0 ? 8 : 0);
        this.backButtonImageView.setImageResource(i);
        this.backButtonImageView.setColorFilter(new PorterDuffColorFilter(this.itemsColor, PorterDuff.Mode.SRC_IN));
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        this.actionBarColor = i;
        super.setBackgroundColor(i);
        ImageView imageView = this.backButtonImageView;
        if (imageView != null) {
            Drawable drawable = imageView.getDrawable();
            if (drawable instanceof MenuDrawable) {
                ((MenuDrawable) drawable).setBackColor(i);
            }
        }
    }

    public void setCastShadows(boolean z) {
        if (this.castShadows != z && (getParent() instanceof View)) {
            ((View) getParent()).invalidate();
            invalidate();
        }
        this.castShadows = z;
    }

    public void setClipContent(boolean z) {
        this.clipContent = z;
    }

    public void setDrawBackButton(boolean z) {
        this.drawBackButton = z;
        ImageView imageView = this.backButtonImageView;
        if (imageView != null) {
            imageView.invalidate();
        }
    }

    public void setDrawBlurBackground(SizeNotifierFrameLayout sizeNotifierFrameLayout) {
        this.blurredBackground = true;
        this.contentView = sizeNotifierFrameLayout;
        sizeNotifierFrameLayout.blurBehindViews.add(this);
        setBackground(null);
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        ImageView imageView = this.backButtonImageView;
        if (imageView != null) {
            imageView.setEnabled(z);
        }
        ActionBarMenu actionBarMenu = this.menu;
        if (actionBarMenu != null) {
            actionBarMenu.setEnabled(z);
        }
        ActionBarMenu actionBarMenu2 = this.actionMode;
        if (actionBarMenu2 != null) {
            actionBarMenu2.setEnabled(z);
        }
    }

    public void setExtraHeight(int i) {
        this.extraHeight = i;
        ActionBarMenu actionBarMenu = this.actionMode;
        if (actionBarMenu != null) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) actionBarMenu.getLayoutParams();
            layoutParams.bottomMargin = this.extraHeight;
            this.actionMode.setLayoutParams(layoutParams);
        }
    }

    public void setForceSkipTouches(boolean z) {
        this.forceSkipTouches = z;
    }

    public void setInterceptTouchEventListener(View.OnTouchListener onTouchListener) {
        this.interceptTouchEventListener = onTouchListener;
    }

    public void setInterceptTouches(boolean z) {
        this.interceptTouches = z;
    }

    public void setItemsBackgroundColor(int i, boolean z) {
        ActionBarMenu actionBarMenu;
        ImageView imageView;
        if (z) {
            this.itemsActionModeBackgroundColor = i;
            if (this.actionModeVisible && (imageView = this.backButtonImageView) != null) {
                imageView.setBackgroundDrawable(Theme.createSelectorDrawable(i));
            }
            actionBarMenu = this.actionMode;
            if (actionBarMenu == null) {
                return;
            }
        } else {
            this.itemsBackgroundColor = i;
            ImageView imageView2 = this.backButtonImageView;
            if (imageView2 != null) {
                imageView2.setBackgroundDrawable(Theme.createSelectorDrawable(i));
            }
            actionBarMenu = this.menu;
            if (actionBarMenu == null) {
                return;
            }
        }
        actionBarMenu.updateItemsBackgroundColor();
    }

    public void setItemsColor(int i, boolean z) {
        if (z) {
            this.itemsActionModeColor = i;
            ActionBarMenu actionBarMenu = this.actionMode;
            if (actionBarMenu != null) {
                actionBarMenu.updateItemsColor();
            }
            ImageView imageView = this.backButtonImageView;
            if (imageView != null) {
                Drawable drawable = imageView.getDrawable();
                if (drawable instanceof BackDrawable) {
                    ((BackDrawable) drawable).setRotatedColor(i);
                    return;
                } else {
                    if (drawable instanceof BitmapDrawable) {
                        this.backButtonImageView.setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_IN));
                        return;
                    }
                    return;
                }
            }
            return;
        }
        this.itemsColor = i;
        ImageView imageView2 = this.backButtonImageView;
        if (imageView2 != null && i != 0) {
            Drawable drawable2 = imageView2.getDrawable();
            if (drawable2 instanceof BackDrawable) {
                ((BackDrawable) drawable2).setColor(i);
            } else if (drawable2 instanceof MenuDrawable) {
                ((MenuDrawable) drawable2).setIconColor(i);
            } else if (drawable2 instanceof BitmapDrawable) {
                this.backButtonImageView.setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_IN));
            }
        }
        ActionBarMenu actionBarMenu2 = this.menu;
        if (actionBarMenu2 != null) {
            actionBarMenu2.updateItemsColor();
        }
    }

    public void setMenuOffsetSuppressed(boolean z) {
        this.isMenuOffsetSuppressed = z;
    }

    public void setOccupyStatusBar(boolean z) {
        this.occupyStatusBar = z;
        ActionBarMenu actionBarMenu = this.actionMode;
        if (actionBarMenu != null) {
            actionBarMenu.setPadding(0, z ? AndroidUtilities.statusBarHeight : 0, 0, 0);
        }
    }

    public void setOverlayTitleAnimation(boolean z) {
        this.overlayTitleAnimation = z;
    }

    public void setPopupBackgroundColor(int i, boolean z) {
        ActionBarMenu actionBarMenu;
        ActionBarMenu actionBarMenu2;
        if (z && (actionBarMenu2 = this.actionMode) != null) {
            actionBarMenu2.redrawPopup(i);
        } else {
            if (z || (actionBarMenu = this.menu) == null) {
                return;
            }
            actionBarMenu.redrawPopup(i);
        }
    }

    public void setPopupItemsColor(int i, boolean z, boolean z2) {
        ActionBarMenu actionBarMenu;
        ActionBarMenu actionBarMenu2;
        if (z2 && (actionBarMenu2 = this.actionMode) != null) {
            actionBarMenu2.setPopupItemsColor(i, z);
        } else {
            if (z2 || (actionBarMenu = this.menu) == null) {
                return;
            }
            actionBarMenu.setPopupItemsColor(i, z);
        }
    }

    public void setPopupItemsSelectorColor(int i, boolean z) {
        ActionBarMenu actionBarMenu;
        ActionBarMenu actionBarMenu2;
        if (z && (actionBarMenu2 = this.actionMode) != null) {
            actionBarMenu2.setPopupItemsSelectorColor(i);
        } else {
            if (z || (actionBarMenu = this.menu) == null) {
                return;
            }
            actionBarMenu.setPopupItemsSelectorColor(i);
        }
    }

    public void setRightDrawableOnClick(View.OnClickListener onClickListener) {
        this.rightDrawableOnClickListener = onClickListener;
        SimpleTextView simpleTextView = this.titleTextView[0];
        if (simpleTextView != null) {
            simpleTextView.setRightDrawableOnClick(onClickListener);
        }
        SimpleTextView simpleTextView2 = this.titleTextView[1];
        if (simpleTextView2 != null) {
            simpleTextView2.setRightDrawableOnClick(this.rightDrawableOnClickListener);
        }
    }

    public void setSearchAvatarImageView(BackupImageView backupImageView) {
        BackupImageView backupImageView2 = this.avatarSearchImageView;
        if (backupImageView2 == backupImageView) {
            return;
        }
        if (backupImageView2 != null) {
            removeView(backupImageView2);
        }
        this.avatarSearchImageView = backupImageView;
        if (backupImageView != null) {
            addView(backupImageView);
        }
    }

    public void setSearchCursorColor(int i) {
        ActionBarMenu actionBarMenu = this.menu;
        if (actionBarMenu != null) {
            actionBarMenu.setSearchCursorColor(i);
        }
    }

    public void setSearchFieldText(String str) {
        this.menu.setSearchFieldText(str);
    }

    public void setSearchFilter(FiltersView.MediaFilterData mediaFilterData) {
        ActionBarMenu actionBarMenu = this.menu;
        if (actionBarMenu != null) {
            actionBarMenu.setFilter(mediaFilterData);
        }
    }

    public void setSearchTextColor(int i, boolean z) {
        ActionBarMenu actionBarMenu = this.menu;
        if (actionBarMenu != null) {
            actionBarMenu.setSearchTextColor(i, z);
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        if (charSequence != null && this.subtitleTextView == null) {
            createSubtitleTextView();
        }
        if (this.subtitleTextView != null) {
            boolean isEmpty = TextUtils.isEmpty(charSequence);
            this.subtitleTextView.setVisibility((isEmpty || this.isSearchFieldVisible) ? 8 : 0);
            this.subtitleTextView.setAlpha(1.0f);
            if (!isEmpty) {
                this.subtitleTextView.setText(charSequence);
            }
            this.subtitle = charSequence;
        }
    }

    public void setSubtitleColor(int i) {
        if (this.subtitleTextView == null) {
            createSubtitleTextView();
        }
        this.subtitleTextView.setTextColor(i);
    }

    public void setSupportsHolidayImage(boolean z) {
        this.supportsHolidayImage = z;
        if (z) {
            this.fontMetricsInt = new Paint.FontMetricsInt();
            this.rect = new Rect();
        }
        invalidate();
    }

    public void setTitle(CharSequence charSequence) {
        setTitle(charSequence, null);
    }

    public void setTitle(CharSequence charSequence, Drawable drawable) {
        if (charSequence != null && this.titleTextView[0] == null) {
            createTitleTextView(0);
        }
        SimpleTextView simpleTextView = this.titleTextView[0];
        if (simpleTextView != null) {
            simpleTextView.setVisibility((charSequence == null || this.isSearchFieldVisible) ? 4 : 0);
            SimpleTextView simpleTextView2 = this.titleTextView[0];
            this.lastTitle = charSequence;
            simpleTextView2.setText(charSequence);
            if (this.attached) {
                Drawable drawable2 = this.lastRightDrawable;
                if (drawable2 instanceof AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable) {
                    ((AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable) drawable2).setParentView(null);
                }
            }
            SimpleTextView simpleTextView3 = this.titleTextView[0];
            this.lastRightDrawable = drawable;
            simpleTextView3.setRightDrawable(drawable);
            if (this.attached) {
                Drawable drawable3 = this.lastRightDrawable;
                if (drawable3 instanceof AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable) {
                    ((AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable) drawable3).setParentView(this.titleTextView[0]);
                }
            }
            this.titleTextView[0].setRightDrawableOnClick(this.rightDrawableOnClickListener);
        }
        this.fromBottom = false;
    }

    public void setTitleActionRunnable(Runnable runnable) {
        this.titleActionRunnable = runnable;
        this.lastRunnable = runnable;
    }

    public void setTitleAnimated(CharSequence charSequence, boolean z, long j) {
        setTitleAnimated(charSequence, z, j, null);
    }

    public void setTitleAnimated(CharSequence charSequence, final boolean z, long j, Interpolator interpolator) {
        if (this.titleTextView[0] == null || charSequence == null) {
            setTitle(charSequence);
            return;
        }
        final boolean z2 = this.overlayTitleAnimation && !TextUtils.isEmpty(this.subtitle);
        if (z2) {
            if (this.subtitleTextView.getVisibility() != 0) {
                this.subtitleTextView.setVisibility(0);
                this.subtitleTextView.setAlpha(0.0f);
            }
            this.subtitleTextView.animate().alpha(z ? 0.0f : 1.0f).setDuration(220L).start();
        }
        SimpleTextView simpleTextView = this.titleTextView[1];
        if (simpleTextView != null) {
            if (simpleTextView.getParent() != null) {
                ((ViewGroup) this.titleTextView[1].getParent()).removeView(this.titleTextView[1]);
            }
            this.titleTextView[1] = null;
        }
        SimpleTextView[] simpleTextViewArr = this.titleTextView;
        simpleTextViewArr[1] = simpleTextViewArr[0];
        simpleTextViewArr[0] = null;
        setTitle(charSequence);
        this.fromBottom = z;
        this.titleTextView[0].setAlpha(0.0f);
        if (!z2) {
            SimpleTextView simpleTextView2 = this.titleTextView[0];
            int dp = AndroidUtilities.dp(20.0f);
            if (!z) {
                dp = -dp;
            }
            simpleTextView2.setTranslationY(dp);
        }
        ViewPropertyAnimator duration = this.titleTextView[0].animate().alpha(1.0f).translationY(0.0f).setDuration(j);
        if (interpolator != null) {
            duration.setInterpolator(interpolator);
        }
        duration.start();
        this.titleAnimationRunning = true;
        ViewPropertyAnimator alpha = this.titleTextView[1].animate().alpha(0.0f);
        if (!z2) {
            int dp2 = AndroidUtilities.dp(20.0f);
            if (z) {
                dp2 = -dp2;
            }
            alpha.translationY(dp2);
        }
        if (interpolator != null) {
            alpha.setInterpolator(interpolator);
        }
        alpha.setDuration(j).setListener(new AnimatorListenerAdapter() { // from class: org.telegram.ui.ActionBar.ActionBar.6
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                if (ActionBar.this.titleTextView[1] != null && ActionBar.this.titleTextView[1].getParent() != null) {
                    ((ViewGroup) ActionBar.this.titleTextView[1].getParent()).removeView(ActionBar.this.titleTextView[1]);
                }
                ActionBar.this.titleTextView[1] = null;
                ActionBar.this.titleAnimationRunning = false;
                if (z2 && z) {
                    ActionBar.this.subtitleTextView.setVisibility(8);
                }
                ActionBar.this.requestLayout();
            }
        }).start();
        requestLayout();
    }

    public void setTitleColor(int i) {
        if (this.titleTextView[0] == null) {
            createTitleTextView(0);
        }
        this.titleColorToSet = i;
        this.titleTextView[0].setTextColor(i);
        SimpleTextView simpleTextView = this.titleTextView[1];
        if (simpleTextView != null) {
            simpleTextView.setTextColor(i);
        }
    }

    public void setTitleOverlayText(String str, int i, Runnable runnable) {
        boolean z;
        CharSequence charSequence;
        SimpleTextView simpleTextView;
        int indexOf;
        if (!this.allowOverlayTitle || this.parentFragment.parentLayout == null) {
            return;
        }
        Object[] objArr = this.overlayTitleToSet;
        objArr[0] = str;
        objArr[1] = Integer.valueOf(i);
        this.overlayTitleToSet[2] = runnable;
        if (this.overlayTitleAnimationInProgress) {
            return;
        }
        CharSequence charSequence2 = this.lastOverlayTitle;
        if (charSequence2 == null && str == null) {
            return;
        }
        if (charSequence2 == null || !charSequence2.equals(str)) {
            this.lastOverlayTitle = str;
            CharSequence string = str != null ? LocaleController.getString(str, i) : this.lastTitle;
            Drawable drawable = str != null ? null : this.lastRightDrawable;
            if (str == null || (indexOf = TextUtils.indexOf(string, "...")) < 0) {
                z = false;
                charSequence = string;
            } else {
                SpannableString valueOf = SpannableString.valueOf(string);
                this.ellipsizeSpanAnimator.wrap(valueOf, indexOf);
                z = true;
                charSequence = valueOf;
            }
            this.titleOverlayShown = str != null;
            if ((charSequence == null || this.titleTextView[0] != null) && getMeasuredWidth() != 0 && ((simpleTextView = this.titleTextView[0]) == null || simpleTextView.getVisibility() == 0)) {
                SimpleTextView simpleTextView2 = this.titleTextView[0];
                if (simpleTextView2 != null) {
                    simpleTextView2.animate().cancel();
                    SimpleTextView simpleTextView3 = this.titleTextView[1];
                    if (simpleTextView3 != null) {
                        simpleTextView3.animate().cancel();
                    }
                    if (this.titleTextView[1] == null) {
                        createTitleTextView(1);
                    }
                    this.titleTextView[1].setText(charSequence);
                    this.titleTextView[1].setDrawablePadding(AndroidUtilities.dp(4.0f));
                    this.titleTextView[1].setRightDrawable(drawable);
                    this.titleTextView[1].setRightDrawableOnClick(this.rightDrawableOnClickListener);
                    if (drawable instanceof AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable) {
                        ((AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable) drawable).setParentView(this.titleTextView[1]);
                    }
                    if (z) {
                        this.ellipsizeSpanAnimator.addView(this.titleTextView[1]);
                    }
                    this.overlayTitleAnimationInProgress = true;
                    SimpleTextView[] simpleTextViewArr = this.titleTextView;
                    SimpleTextView simpleTextView4 = simpleTextViewArr[1];
                    simpleTextViewArr[1] = simpleTextViewArr[0];
                    simpleTextViewArr[0] = simpleTextView4;
                    simpleTextView4.setAlpha(0.0f);
                    this.titleTextView[0].setTranslationY(-AndroidUtilities.dp(20.0f));
                    this.titleTextView[0].animate().alpha(1.0f).translationY(0.0f).setDuration(220L).start();
                    ViewPropertyAnimator alpha = this.titleTextView[1].animate().alpha(0.0f);
                    if (this.subtitleTextView == null) {
                        alpha.translationY(AndroidUtilities.dp(20.0f));
                    } else {
                        alpha.scaleY(0.7f).scaleX(0.7f);
                    }
                    requestLayout();
                    this.centerScale = true;
                    alpha.setDuration(220L).setListener(new AnimatorListenerAdapter() { // from class: org.telegram.ui.ActionBar.ActionBar.5
                        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                        public void onAnimationEnd(Animator animator) {
                            if (ActionBar.this.titleTextView[1] != null && ActionBar.this.titleTextView[1].getParent() != null) {
                                ((ViewGroup) ActionBar.this.titleTextView[1].getParent()).removeView(ActionBar.this.titleTextView[1]);
                            }
                            ActionBar actionBar = ActionBar.this;
                            actionBar.ellipsizeSpanAnimator.removeView(actionBar.titleTextView[1]);
                            ActionBar.this.titleTextView[1] = null;
                            ActionBar actionBar2 = ActionBar.this;
                            actionBar2.overlayTitleAnimationInProgress = false;
                            actionBar2.setTitleOverlayText((String) actionBar2.overlayTitleToSet[0], ((Integer) ActionBar.this.overlayTitleToSet[1]).intValue(), (Runnable) ActionBar.this.overlayTitleToSet[2]);
                        }
                    }).start();
                }
            } else {
                createTitleTextView(0);
                if (this.supportsHolidayImage) {
                    this.titleTextView[0].invalidate();
                    invalidate();
                }
                this.titleTextView[0].setText(charSequence);
                this.titleTextView[0].setDrawablePadding(AndroidUtilities.dp(4.0f));
                this.titleTextView[0].setRightDrawable(drawable);
                this.titleTextView[0].setRightDrawableOnClick(this.rightDrawableOnClickListener);
                if (drawable instanceof AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable) {
                    ((AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable) drawable).setParentView(this.titleTextView[0]);
                }
                EllipsizeSpanAnimator ellipsizeSpanAnimator = this.ellipsizeSpanAnimator;
                SimpleTextView[] simpleTextViewArr2 = this.titleTextView;
                if (z) {
                    ellipsizeSpanAnimator.addView(simpleTextViewArr2[0]);
                } else {
                    ellipsizeSpanAnimator.removeView(simpleTextViewArr2[0]);
                }
            }
            if (runnable == null) {
                runnable = this.lastRunnable;
            }
            this.titleActionRunnable = runnable;
        }
    }

    public void setTitleRightMargin(int i) {
        this.titleRightMargin = i;
    }

    public void setTitleScrollNonFitText(boolean z) {
        this.titleTextView[0].setScrollNonFitText(z);
    }

    @Override // android.view.View
    public void setTranslationY(float f) {
        super.setTranslationY(f);
        if (this.clipContent) {
            invalidate();
        }
    }

    public void setUseContainerForTitles() {
        this.useContainerForTitles = true;
        if (this.titlesContainer == null) {
            FrameLayout frameLayout = new FrameLayout(getContext()) { // from class: org.telegram.ui.ActionBar.ActionBar.8
                @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
                protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
                }

                @Override // android.widget.FrameLayout, android.view.View
                protected void onMeasure(int i, int i2) {
                    setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
                }
            };
            this.titlesContainer = frameLayout;
            addView(frameLayout);
        }
    }

    public boolean shouldAddToContainer() {
        return this.addToContainer;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean shouldClipChild(View view) {
        if (!this.clipContent) {
            return false;
        }
        SimpleTextView[] simpleTextViewArr = this.titleTextView;
        return view == simpleTextViewArr[0] || view == simpleTextViewArr[1] || view == this.subtitleTextView || view == this.menu || view == this.backButtonImageView || view == this.additionalSubtitleTextView || view == this.titlesContainer;
    }

    public void showActionMode() {
        showActionMode(true, null, null, null, null, null, 0);
    }

    public void showActionMode(boolean z) {
        showActionMode(z, null, null, null, null, null, 0);
    }

    public void showActionMode(boolean z, View view, View view2, View[] viewArr, final boolean[] zArr, View view3, int i) {
        ActionBarMenu actionBarMenu = this.actionMode;
        if (actionBarMenu == null || this.actionModeVisible) {
            return;
        }
        this.actionModeVisible = true;
        if (z) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(ObjectAnimator.ofFloat(this.actionMode, (Property<ActionBarMenu, Float>) View.ALPHA, 0.0f, 1.0f));
            if (viewArr != null) {
                for (View view4 : viewArr) {
                    if (view4 != null) {
                        arrayList.add(ObjectAnimator.ofFloat(view4, (Property<View, Float>) View.ALPHA, 1.0f, 0.0f));
                    }
                }
            }
            if (view2 != null) {
                arrayList.add(ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.ALPHA, 0.0f, 1.0f));
            }
            if (view3 != null) {
                arrayList.add(ObjectAnimator.ofFloat(view3, (Property<View, Float>) View.TRANSLATION_Y, i));
                this.actionModeTranslationView = view3;
            }
            this.actionModeExtraView = view;
            this.actionModeShowingView = view2;
            this.actionModeHidingViews = viewArr;
            if (view != null) {
                arrayList.add(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.TRANSLATION_Y, 0.0f));
            }
            double calculateLuminance = ColorUtils.calculateLuminance(this.actionModeColor);
            Window window = ((Activity) getContext()).getWindow();
            if (calculateLuminance < 0.699999988079071d) {
                AndroidUtilities.setLightStatusBar(window, false);
            } else {
                AndroidUtilities.setLightStatusBar(window, true);
            }
            AnimatorSet animatorSet = this.actionModeAnimation;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.actionModeAnimation = animatorSet2;
            animatorSet2.playTogether(arrayList);
            if (this.backgroundUpdateListener != null) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.ActionBar.ActionBar$$ExternalSyntheticLambda4
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        ActionBar.this.lambda$showActionMode$2(valueAnimator);
                    }
                });
                this.actionModeAnimation.playTogether(ofFloat);
            }
            this.actionModeAnimation.setDuration(200L);
            this.actionModeAnimation.addListener(new AnimatorListenerAdapter() { // from class: org.telegram.ui.ActionBar.ActionBar.2
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationCancel(Animator animator) {
                    if (ActionBar.this.actionModeAnimation == null || !ActionBar.this.actionModeAnimation.equals(animator)) {
                        return;
                    }
                    ActionBar.this.actionModeAnimation = null;
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    boolean[] zArr2;
                    if (ActionBar.this.actionModeAnimation == null || !ActionBar.this.actionModeAnimation.equals(animator)) {
                        return;
                    }
                    ActionBar.this.actionModeAnimation = null;
                    if (ActionBar.this.titleTextView[0] != null) {
                        ActionBar.this.titleTextView[0].setVisibility(4);
                    }
                    if (ActionBar.this.subtitleTextView != null && !TextUtils.isEmpty(ActionBar.this.subtitle)) {
                        ActionBar.this.subtitleTextView.setVisibility(4);
                    }
                    ActionBarMenu actionBarMenu2 = ActionBar.this.menu;
                    if (actionBarMenu2 != null) {
                        actionBarMenu2.setVisibility(4);
                    }
                    if (ActionBar.this.actionModeHidingViews != null) {
                        for (int i2 = 0; i2 < ActionBar.this.actionModeHidingViews.length; i2++) {
                            if (ActionBar.this.actionModeHidingViews[i2] != null && ((zArr2 = zArr) == null || i2 >= zArr2.length || zArr2[i2])) {
                                ActionBar.this.actionModeHidingViews[i2].setVisibility(4);
                            }
                        }
                    }
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationStart(Animator animator) {
                    ActionBar.this.actionMode.setVisibility(0);
                    ActionBar actionBar = ActionBar.this;
                    if (actionBar.occupyStatusBar) {
                        View unused = actionBar.actionModeTop;
                    }
                }
            });
            this.actionModeAnimation.start();
            ImageView imageView = this.backButtonImageView;
            if (imageView == null) {
                return;
            }
            Drawable drawable = imageView.getDrawable();
            if (drawable instanceof BackDrawable) {
                ((BackDrawable) drawable).setRotation(1.0f, true);
            }
        } else {
            actionBarMenu.setAlpha(1.0f);
            if (viewArr != null) {
                for (View view5 : viewArr) {
                    if (view5 != null) {
                        view5.setAlpha(0.0f);
                    }
                }
            }
            if (view2 != null) {
                view2.setAlpha(1.0f);
            }
            if (view3 != null) {
                view3.setTranslationY(i);
                this.actionModeTranslationView = view3;
            }
            this.actionModeExtraView = view;
            if (view != null) {
                view.setTranslationY(0.0f);
            }
            this.actionModeShowingView = view2;
            this.actionModeHidingViews = viewArr;
            double calculateLuminance2 = ColorUtils.calculateLuminance(this.actionModeColor);
            Window window2 = ((Activity) getContext()).getWindow();
            if (calculateLuminance2 < 0.699999988079071d) {
                AndroidUtilities.setLightStatusBar(window2, false);
            } else {
                AndroidUtilities.setLightStatusBar(window2, true);
            }
            this.actionMode.setVisibility(0);
            SimpleTextView simpleTextView = this.titleTextView[0];
            if (simpleTextView != null) {
                simpleTextView.setVisibility(4);
            }
            if (this.subtitleTextView != null && !TextUtils.isEmpty(this.subtitle)) {
                this.subtitleTextView.setVisibility(4);
            }
            ActionBarMenu actionBarMenu2 = this.menu;
            if (actionBarMenu2 != null) {
                actionBarMenu2.setVisibility(4);
            }
            if (this.actionModeHidingViews != null) {
                int i2 = 0;
                while (true) {
                    View[] viewArr2 = this.actionModeHidingViews;
                    if (i2 >= viewArr2.length) {
                        break;
                    }
                    View view6 = viewArr2[i2];
                    if (view6 != null && (zArr == null || i2 >= zArr.length || zArr[i2])) {
                        view6.setVisibility(4);
                    }
                    i2++;
                }
            }
            ImageView imageView2 = this.backButtonImageView;
            if (imageView2 == null) {
                return;
            }
            Drawable drawable2 = imageView2.getDrawable();
            if (drawable2 instanceof BackDrawable) {
                ((BackDrawable) drawable2).setRotation(1.0f, false);
            }
        }
        this.backButtonImageView.setBackgroundDrawable(Theme.createSelectorDrawable(this.itemsActionModeBackgroundColor));
    }

    public void showActionModeTop() {
        if (this.occupyStatusBar && this.actionModeTop == null) {
            View view = new View(getContext());
            this.actionModeTop = view;
            view.setBackgroundColor(getThemedColor(Theme.key_actionBarActionModeDefaultTop));
            addView(this.actionModeTop);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.actionModeTop.getLayoutParams();
            layoutParams.height = AndroidUtilities.statusBarHeight;
            layoutParams.width = -1;
            layoutParams.gravity = 51;
            this.actionModeTop.setLayoutParams(layoutParams);
        }
    }
}
