package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.SurfaceTexture;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import android.os.Build;
import android.os.Looper;
import android.os.Parcelable;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.core.graphics.ColorUtils;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import java.util.ArrayList;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.EmuDetector;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.GenericProvider;
import org.telegram.messenger.Intro;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$LangPackString;
import org.telegram.tgnet.TLRPC$TL_error;
import org.telegram.tgnet.TLRPC$TL_langPackString;
import org.telegram.tgnet.TLRPC$TL_langpack_getStrings;
import org.telegram.tgnet.TLRPC$Vector;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ActionBar.ThemeDescription;
import org.telegram.ui.Cells.DrawerProfileCell;
import org.telegram.ui.Components.BottomPagesView;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.RLottieDrawable;
import org.telegram.ui.Components.RLottieImageView;
import org.telegram.ui.Components.SimpleThemeDescription;
import org.telegram.ui.Components.voip.CellFlickerDrawable;
/* loaded from: classes3.dex */
public class IntroActivity extends BaseFragment implements NotificationCenter.NotificationCenterDelegate {
    private BottomPagesView bottomPages;
    private long currentDate;
    private int currentViewPagerPage;
    private RLottieDrawable darkThemeDrawable;
    private boolean destroyed;
    private boolean dragging;
    private EGLThread eglThread;
    private FrameLayout frameContainerView;
    private FrameLayout frameLayout2;
    private boolean isOnLogout;
    private boolean justEndDragging;
    private LocaleController.LocaleInfo localeInfo;
    private String[] messages;
    private int startDragX;
    private TextView startMessagingButton;
    private TextView switchLanguageTextView;
    private String[] titles;
    private ViewPager viewPager;
    private final Object pagerHeaderTag = new Object();
    private final Object pagerMessageTag = new Object();
    private int currentAccount = UserConfig.selectedAccount;
    private int lastPage = 0;
    private boolean justCreated = false;
    private boolean startPressed = false;

    @Override // org.telegram.ui.ActionBar.BaseFragment
    public boolean hasForceLightStatusBar() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.BaseFragment
    public boolean onFragmentCreate() {
        MessagesController.getGlobalMainSettings().edit().putLong("intro_crashed_time", System.currentTimeMillis()).apply();
        this.titles = new String[]{LocaleController.getString("Page1Title", 2131627187), LocaleController.getString("Page2Title", 2131627189), LocaleController.getString("Page3Title", 2131627191), LocaleController.getString("Page5Title", 2131627195), LocaleController.getString("Page4Title", 2131627193), LocaleController.getString("Page6Title", 2131627197)};
        this.messages = new String[]{LocaleController.getString("Page1Message", 2131627186), LocaleController.getString("Page2Message", 2131627188), LocaleController.getString("Page3Message", 2131627190), LocaleController.getString("Page5Message", 2131627194), LocaleController.getString("Page4Message", 2131627192), LocaleController.getString("Page6Message", 2131627196)};
        return true;
    }

    @Override // org.telegram.ui.ActionBar.BaseFragment
    public View createView(Context context) {
        this.actionBar.setAddToContainer(false);
        ScrollView scrollView = new ScrollView(context);
        scrollView.setFillViewport(true);
        RLottieImageView rLottieImageView = new RLottieImageView(context);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.addView(rLottieImageView, LayoutHelper.createFrame(28, 28, 17));
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(context, frameLayout, 4);
        this.frameContainerView = anonymousClass1;
        scrollView.addView(anonymousClass1, LayoutHelper.createScroll(-1, -2, 51));
        RLottieDrawable rLottieDrawable = new RLottieDrawable(2131558561, String.valueOf(2131558561), AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), true, null);
        this.darkThemeDrawable = rLottieDrawable;
        rLottieDrawable.setPlayInDirectionOfCustomEndFrame(true);
        this.darkThemeDrawable.beginApplyLayerColors();
        this.darkThemeDrawable.commitApplyLayerColors();
        this.darkThemeDrawable.setCustomEndFrame(Theme.getCurrentTheme().isDark() ? this.darkThemeDrawable.getFramesCount() - 1 : 0);
        this.darkThemeDrawable.setCurrentFrame(Theme.getCurrentTheme().isDark() ? this.darkThemeDrawable.getFramesCount() - 1 : 0, false);
        Theme.getCurrentTheme().isDark();
        rLottieImageView.setContentDescription(LocaleController.getString(2131624092));
        rLottieImageView.setAnimation(this.darkThemeDrawable);
        frameLayout.setOnClickListener(new IntroActivity$$ExternalSyntheticLambda2(this, rLottieImageView));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.frameLayout2 = frameLayout2;
        this.frameContainerView.addView(frameLayout2, LayoutHelper.createFrame(-1, -2.0f, 51, 0.0f, 78.0f, 0.0f, 0.0f));
        TextureView textureView = new TextureView(context);
        this.frameLayout2.addView(textureView, LayoutHelper.createFrame(200, 150, 17));
        textureView.setSurfaceTextureListener(new AnonymousClass2());
        ViewPager viewPager = new ViewPager(context);
        this.viewPager = viewPager;
        viewPager.setAdapter(new IntroAdapter(this, null));
        this.viewPager.setPageMargin(0);
        this.viewPager.setOffscreenPageLimit(1);
        this.frameContainerView.addView(this.viewPager, LayoutHelper.createFrame(-1, -1.0f));
        this.viewPager.addOnPageChangeListener(new AnonymousClass3());
        AnonymousClass4 anonymousClass4 = new AnonymousClass4(this, context);
        this.startMessagingButton = anonymousClass4;
        anonymousClass4.setText(LocaleController.getString("StartMessaging", 2131628481));
        this.startMessagingButton.setGravity(17);
        this.startMessagingButton.setTypeface(AndroidUtilities.getTypeface("fonts/rmedium.ttf"));
        this.startMessagingButton.setTextSize(1, 15.0f);
        this.startMessagingButton.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
        this.frameContainerView.addView(this.startMessagingButton, LayoutHelper.createFrame(-1, 50.0f, 81, 16.0f, 0.0f, 16.0f, 76.0f));
        this.startMessagingButton.setOnClickListener(new IntroActivity$$ExternalSyntheticLambda1(this));
        BottomPagesView bottomPagesView = new BottomPagesView(context, this.viewPager, 6);
        this.bottomPages = bottomPagesView;
        this.frameContainerView.addView(bottomPagesView, LayoutHelper.createFrame(66, 5.0f, 49, 0.0f, 350.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.switchLanguageTextView = textView;
        textView.setGravity(17);
        this.switchLanguageTextView.setTextSize(1, 16.0f);
        this.frameContainerView.addView(this.switchLanguageTextView, LayoutHelper.createFrame(-2, 30.0f, 81, 0.0f, 0.0f, 0.0f, 20.0f));
        this.switchLanguageTextView.setOnClickListener(new IntroActivity$$ExternalSyntheticLambda0(this));
        float f = 4;
        this.frameContainerView.addView(frameLayout, LayoutHelper.createFrame(64, 64.0f, 53, 0.0f, f, f, 0.0f));
        this.fragmentView = scrollView;
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.suggestedLangpack);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.configLoaded);
        ConnectionsManager.getInstance(this.currentAccount).updateDcSettings();
        LocaleController.getInstance().loadRemoteLanguages(this.currentAccount);
        checkContinueText();
        this.justCreated = true;
        updateColors(false);
        return this.fragmentView;
    }

    /* renamed from: org.telegram.ui.IntroActivity$1 */
    /* loaded from: classes3.dex */
    class AnonymousClass1 extends FrameLayout {
        final /* synthetic */ FrameLayout val$themeFrameLayout;
        final /* synthetic */ int val$themeMargin;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Context context, FrameLayout frameLayout, int i) {
            super(context);
            IntroActivity.this = r1;
            this.val$themeFrameLayout = frameLayout;
            this.val$themeMargin = i;
        }

        @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
        protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
            super.onLayout(z, i, i2, i3, i4);
            int i5 = (i4 - i2) / 4;
            int i6 = i5 * 3;
            int dp = (i6 - AndroidUtilities.dp(275.0f)) / 2;
            int i7 = 0;
            IntroActivity.this.frameLayout2.layout(0, dp, IntroActivity.this.frameLayout2.getMeasuredWidth(), IntroActivity.this.frameLayout2.getMeasuredHeight() + dp);
            int dp2 = dp + AndroidUtilities.dp(150.0f) + AndroidUtilities.dp(122.0f);
            int measuredWidth = (getMeasuredWidth() - IntroActivity.this.bottomPages.getMeasuredWidth()) / 2;
            IntroActivity.this.bottomPages.layout(measuredWidth, dp2, IntroActivity.this.bottomPages.getMeasuredWidth() + measuredWidth, IntroActivity.this.bottomPages.getMeasuredHeight() + dp2);
            IntroActivity.this.viewPager.layout(0, 0, IntroActivity.this.viewPager.getMeasuredWidth(), IntroActivity.this.viewPager.getMeasuredHeight());
            int measuredHeight = i6 + ((i5 - IntroActivity.this.startMessagingButton.getMeasuredHeight()) / 2);
            int measuredWidth2 = (getMeasuredWidth() - IntroActivity.this.startMessagingButton.getMeasuredWidth()) / 2;
            IntroActivity.this.startMessagingButton.layout(measuredWidth2, measuredHeight, IntroActivity.this.startMessagingButton.getMeasuredWidth() + measuredWidth2, IntroActivity.this.startMessagingButton.getMeasuredHeight() + measuredHeight);
            int dp3 = measuredHeight - AndroidUtilities.dp(30.0f);
            int measuredWidth3 = (getMeasuredWidth() - IntroActivity.this.switchLanguageTextView.getMeasuredWidth()) / 2;
            IntroActivity.this.switchLanguageTextView.layout(measuredWidth3, dp3 - IntroActivity.this.switchLanguageTextView.getMeasuredHeight(), IntroActivity.this.switchLanguageTextView.getMeasuredWidth() + measuredWidth3, dp3);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.val$themeFrameLayout.getLayoutParams();
            int dp4 = AndroidUtilities.dp(this.val$themeMargin);
            if (!AndroidUtilities.isTablet()) {
                i7 = AndroidUtilities.statusBarHeight;
            }
            int i8 = dp4 + i7;
            if (marginLayoutParams.topMargin != i8) {
                marginLayoutParams.topMargin = i8;
                this.val$themeFrameLayout.requestLayout();
            }
        }
    }

    public /* synthetic */ void lambda$createView$0(RLottieImageView rLottieImageView, View view) {
        Theme.ThemeInfo themeInfo;
        if (DrawerProfileCell.switchingTheme) {
            return;
        }
        DrawerProfileCell.switchingTheme = true;
        boolean z = !Theme.isCurrentThemeDark();
        if (z) {
            themeInfo = Theme.getTheme("Night");
        } else {
            themeInfo = Theme.getTheme("Blue");
        }
        Theme.selectedAutoNightType = 0;
        Theme.saveAutoNightThemeConfig();
        Theme.cancelAutoNightThemeCallbacks();
        RLottieDrawable rLottieDrawable = this.darkThemeDrawable;
        rLottieDrawable.setCustomEndFrame(z ? rLottieDrawable.getFramesCount() - 1 : 0);
        rLottieImageView.playAnimation();
        rLottieImageView.getLocationInWindow(r4);
        int[] iArr = {iArr[0] + (rLottieImageView.getMeasuredWidth() / 2), iArr[1] + (rLottieImageView.getMeasuredHeight() / 2)};
        NotificationCenter.getGlobalInstance().postNotificationName(NotificationCenter.needSetDayNightTheme, themeInfo, Boolean.FALSE, iArr, -1, Boolean.valueOf(z), rLottieImageView);
        rLottieImageView.setContentDescription(LocaleController.getString(2131624092));
    }

    /* renamed from: org.telegram.ui.IntroActivity$2 */
    /* loaded from: classes3.dex */
    public class AnonymousClass2 implements TextureView.SurfaceTextureListener {
        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }

        AnonymousClass2() {
            IntroActivity.this = r1;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
            if (IntroActivity.this.eglThread != null || surfaceTexture == null) {
                return;
            }
            IntroActivity.this.eglThread = new EGLThread(surfaceTexture);
            IntroActivity.this.eglThread.setSurfaceTextureSize(i, i2);
            IntroActivity.this.eglThread.postRunnable(new IntroActivity$2$$ExternalSyntheticLambda0(this));
            IntroActivity.this.eglThread.postRunnable(IntroActivity.this.eglThread.drawRunnable);
        }

        public /* synthetic */ void lambda$onSurfaceTextureAvailable$0() {
            Intro.setPage(IntroActivity.this.currentViewPagerPage);
            Intro.setDate(((float) (System.currentTimeMillis() - IntroActivity.this.currentDate)) / 1000.0f);
            Intro.onDrawFrame(0);
            if (IntroActivity.this.eglThread == null || !IntroActivity.this.eglThread.isAlive() || IntroActivity.this.eglThread.eglDisplay == null || IntroActivity.this.eglThread.eglSurface == null) {
                return;
            }
            try {
                IntroActivity.this.eglThread.egl10.eglSwapBuffers(IntroActivity.this.eglThread.eglDisplay, IntroActivity.this.eglThread.eglSurface);
            } catch (Exception unused) {
            }
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
            if (IntroActivity.this.eglThread != null) {
                IntroActivity.this.eglThread.setSurfaceTextureSize(i, i2);
            }
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            if (IntroActivity.this.eglThread != null) {
                IntroActivity.this.eglThread.shutdown();
                IntroActivity.this.eglThread = null;
                return true;
            }
            return true;
        }
    }

    /* renamed from: org.telegram.ui.IntroActivity$3 */
    /* loaded from: classes3.dex */
    class AnonymousClass3 implements ViewPager.OnPageChangeListener {
        AnonymousClass3() {
            IntroActivity.this = r1;
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrolled(int i, float f, int i2) {
            IntroActivity.this.bottomPages.setPageOffset(i, f);
            float measuredWidth = IntroActivity.this.viewPager.getMeasuredWidth();
            if (measuredWidth == 0.0f) {
                return;
            }
            Intro.setScrollOffset((((i * measuredWidth) + i2) - (IntroActivity.this.currentViewPagerPage * measuredWidth)) / measuredWidth);
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageSelected(int i) {
            IntroActivity.this.currentViewPagerPage = i;
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrollStateChanged(int i) {
            if (i == 1) {
                IntroActivity.this.dragging = true;
                IntroActivity introActivity = IntroActivity.this;
                introActivity.startDragX = introActivity.viewPager.getCurrentItem() * IntroActivity.this.viewPager.getMeasuredWidth();
            } else if (i != 0 && i != 2) {
            } else {
                if (IntroActivity.this.dragging) {
                    IntroActivity.this.justEndDragging = true;
                    IntroActivity.this.dragging = false;
                }
                if (IntroActivity.this.lastPage == IntroActivity.this.viewPager.getCurrentItem()) {
                    return;
                }
                IntroActivity introActivity2 = IntroActivity.this;
                introActivity2.lastPage = introActivity2.viewPager.getCurrentItem();
            }
        }
    }

    /* renamed from: org.telegram.ui.IntroActivity$4 */
    /* loaded from: classes3.dex */
    class AnonymousClass4 extends TextView {
        CellFlickerDrawable cellFlickerDrawable;

        AnonymousClass4(IntroActivity introActivity, Context context) {
            super(context);
        }

        @Override // android.widget.TextView, android.view.View
        protected void onDraw(Canvas canvas) {
            super.onDraw(canvas);
            if (this.cellFlickerDrawable == null) {
                CellFlickerDrawable cellFlickerDrawable = new CellFlickerDrawable();
                this.cellFlickerDrawable = cellFlickerDrawable;
                cellFlickerDrawable.drawFrame = false;
                cellFlickerDrawable.repeatProgress = 2.0f;
            }
            this.cellFlickerDrawable.setParentWidth(getMeasuredWidth());
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
            this.cellFlickerDrawable.draw(canvas, rectF, AndroidUtilities.dp(4.0f), null);
            invalidate();
        }

        @Override // android.widget.TextView, android.view.View
        protected void onMeasure(int i, int i2) {
            if (View.MeasureSpec.getSize(i) > AndroidUtilities.dp(260.0f)) {
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(320.0f), 1073741824), i2);
            } else {
                super.onMeasure(i, i2);
            }
        }
    }

    public /* synthetic */ void lambda$createView$1(View view) {
        if (this.startPressed) {
            return;
        }
        this.startPressed = true;
        presentFragment(new LoginActivity().setIntroView(this.frameContainerView, this.startMessagingButton), true);
        this.destroyed = true;
    }

    public /* synthetic */ void lambda$createView$2(View view) {
        if (this.startPressed || this.localeInfo == null) {
            return;
        }
        this.startPressed = true;
        AlertDialog alertDialog = new AlertDialog(view.getContext(), 3);
        alertDialog.setCanCancel(false);
        alertDialog.showDelayed(1000L);
        NotificationCenter.getGlobalInstance().addObserver(new AnonymousClass5(alertDialog), NotificationCenter.reloadInterface);
        LocaleController.getInstance().applyLanguage(this.localeInfo, true, false, this.currentAccount);
    }

    /* renamed from: org.telegram.ui.IntroActivity$5 */
    /* loaded from: classes3.dex */
    public class AnonymousClass5 implements NotificationCenter.NotificationCenterDelegate {
        final /* synthetic */ AlertDialog val$loaderDialog;

        AnonymousClass5(AlertDialog alertDialog) {
            IntroActivity.this = r1;
            this.val$loaderDialog = alertDialog;
        }

        @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
        public void didReceivedNotification(int i, int i2, Object... objArr) {
            if (i == NotificationCenter.reloadInterface) {
                this.val$loaderDialog.dismiss();
                NotificationCenter.getGlobalInstance().removeObserver(this, i);
                AndroidUtilities.runOnUIThread(new IntroActivity$5$$ExternalSyntheticLambda0(this), 100L);
            }
        }

        public /* synthetic */ void lambda$didReceivedNotification$0() {
            IntroActivity.this.presentFragment(new LoginActivity().setIntroView(IntroActivity.this.frameContainerView, IntroActivity.this.startMessagingButton), true);
            IntroActivity.this.destroyed = true;
        }
    }

    @Override // org.telegram.ui.ActionBar.BaseFragment
    @SuppressLint({"SourceLockedOrientationActivity"})
    public void onResume() {
        Activity parentActivity;
        super.onResume();
        if (this.justCreated) {
            if (LocaleController.isRTL) {
                this.viewPager.setCurrentItem(6);
                this.lastPage = 6;
            } else {
                this.viewPager.setCurrentItem(0);
                this.lastPage = 0;
            }
            this.justCreated = false;
        }
        if (AndroidUtilities.isTablet() || (parentActivity = getParentActivity()) == null) {
            return;
        }
        parentActivity.setRequestedOrientation(1);
    }

    @Override // org.telegram.ui.ActionBar.BaseFragment
    public void onPause() {
        Activity parentActivity;
        super.onPause();
        if (AndroidUtilities.isTablet() || (parentActivity = getParentActivity()) == null) {
            return;
        }
        parentActivity.setRequestedOrientation(-1);
    }

    @Override // org.telegram.ui.ActionBar.BaseFragment
    public void onFragmentDestroy() {
        super.onFragmentDestroy();
        this.destroyed = true;
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.suggestedLangpack);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.configLoaded);
        MessagesController.getGlobalMainSettings().edit().putLong("intro_crashed_time", 0L).apply();
    }

    private void checkContinueText() {
        LocaleController.LocaleInfo currentLocaleInfo = LocaleController.getInstance().getCurrentLocaleInfo();
        String str = MessagesController.getInstance(this.currentAccount).suggestedLangCode;
        if ((str == null || (str.equals("en") && LocaleController.getInstance().getSystemDefaultLocale().getLanguage() != null && !LocaleController.getInstance().getSystemDefaultLocale().getLanguage().equals("en"))) && (str = LocaleController.getInstance().getSystemDefaultLocale().getLanguage()) == null) {
            str = "en";
        }
        String str2 = str.contains("-") ? str.split("-")[0] : str;
        String localeAlias = LocaleController.getLocaleAlias(str2);
        LocaleController.LocaleInfo localeInfo = null;
        LocaleController.LocaleInfo localeInfo2 = null;
        for (int i = 0; i < LocaleController.getInstance().languages.size(); i++) {
            LocaleController.LocaleInfo localeInfo3 = LocaleController.getInstance().languages.get(i);
            if (localeInfo3.shortName.equals("en")) {
                localeInfo = localeInfo3;
            }
            if (localeInfo3.shortName.replace("_", "-").equals(str) || localeInfo3.shortName.equals(str2) || localeInfo3.shortName.equals(localeAlias)) {
                localeInfo2 = localeInfo3;
            }
            if (localeInfo != null && localeInfo2 != null) {
                break;
            }
        }
        if (localeInfo == null || localeInfo2 == null || localeInfo == localeInfo2) {
            return;
        }
        TLRPC$TL_langpack_getStrings tLRPC$TL_langpack_getStrings = new TLRPC$TL_langpack_getStrings();
        if (localeInfo2 != currentLocaleInfo) {
            tLRPC$TL_langpack_getStrings.lang_code = localeInfo2.getLangCode();
            this.localeInfo = localeInfo2;
        } else {
            tLRPC$TL_langpack_getStrings.lang_code = localeInfo.getLangCode();
            this.localeInfo = localeInfo;
        }
        tLRPC$TL_langpack_getStrings.keys.add("ContinueOnThisLanguage");
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tLRPC$TL_langpack_getStrings, new IntroActivity$$ExternalSyntheticLambda5(this, str), 8);
    }

    public /* synthetic */ void lambda$checkContinueText$4(String str, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        if (tLObject != null) {
            TLRPC$Vector tLRPC$Vector = (TLRPC$Vector) tLObject;
            if (tLRPC$Vector.objects.isEmpty()) {
                return;
            }
            TLRPC$LangPackString tLRPC$LangPackString = (TLRPC$LangPackString) tLRPC$Vector.objects.get(0);
            if (!(tLRPC$LangPackString instanceof TLRPC$TL_langPackString)) {
                return;
            }
            AndroidUtilities.runOnUIThread(new IntroActivity$$ExternalSyntheticLambda4(this, tLRPC$LangPackString, str));
        }
    }

    public /* synthetic */ void lambda$checkContinueText$3(TLRPC$LangPackString tLRPC$LangPackString, String str) {
        if (!this.destroyed) {
            this.switchLanguageTextView.setText(tLRPC$LangPackString.value);
            MessagesController.getGlobalMainSettings().edit().putString("language_showed2", str.toLowerCase()).apply();
        }
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == NotificationCenter.suggestedLangpack || i == NotificationCenter.configLoaded) {
            checkContinueText();
        }
    }

    public IntroActivity setOnLogout() {
        this.isOnLogout = true;
        return this;
    }

    @Override // org.telegram.ui.ActionBar.BaseFragment
    public AnimatorSet onCustomTransitionAnimation(boolean z, Runnable runnable) {
        if (this.isOnLogout) {
            AnimatorSet duration = new AnimatorSet().setDuration(50L);
            duration.playTogether(ValueAnimator.ofFloat(new float[0]));
            return duration;
        }
        return null;
    }

    /* loaded from: classes3.dex */
    private class IntroAdapter extends PagerAdapter {
        @Override // androidx.viewpager.widget.PagerAdapter
        public void restoreState(Parcelable parcelable, ClassLoader classLoader) {
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public Parcelable saveState() {
            return null;
        }

        private IntroAdapter() {
            IntroActivity.this = r1;
        }

        /* synthetic */ IntroAdapter(IntroActivity introActivity, AnonymousClass1 anonymousClass1) {
            this();
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public int getCount() {
            return IntroActivity.this.titles.length;
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public Object instantiateItem(ViewGroup viewGroup, int i) {
            TextView textView = new TextView(viewGroup.getContext());
            textView.setTag(IntroActivity.this.pagerHeaderTag);
            TextView textView2 = new TextView(viewGroup.getContext());
            textView2.setTag(IntroActivity.this.pagerMessageTag);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this, viewGroup.getContext(), textView, textView2);
            textView.setTextColor(Theme.getColor("windowBackgroundWhiteBlackText"));
            textView.setTextSize(1, 26.0f);
            textView.setGravity(17);
            anonymousClass1.addView(textView, LayoutHelper.createFrame(-1, -2.0f, 51, 18.0f, 244.0f, 18.0f, 0.0f));
            textView2.setTextColor(Theme.getColor("windowBackgroundWhiteGrayText3"));
            textView2.setTextSize(1, 15.0f);
            textView2.setGravity(17);
            anonymousClass1.addView(textView2, LayoutHelper.createFrame(-1, -2.0f, 51, 16.0f, 286.0f, 16.0f, 0.0f));
            viewGroup.addView(anonymousClass1, 0);
            textView.setText(IntroActivity.this.titles[i]);
            textView2.setText(AndroidUtilities.replaceTags(IntroActivity.this.messages[i]));
            return anonymousClass1;
        }

        /* renamed from: org.telegram.ui.IntroActivity$IntroAdapter$1 */
        /* loaded from: classes3.dex */
        class AnonymousClass1 extends FrameLayout {
            final /* synthetic */ TextView val$headerTextView;
            final /* synthetic */ TextView val$messageTextView;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(IntroAdapter introAdapter, Context context, TextView textView, TextView textView2) {
                super(context);
                this.val$headerTextView = textView;
                this.val$messageTextView = textView2;
            }

            @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
            protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
                int dp = (((((i4 - i2) / 4) * 3) - AndroidUtilities.dp(275.0f)) / 2) + AndroidUtilities.dp(150.0f) + AndroidUtilities.dp(16.0f);
                int dp2 = AndroidUtilities.dp(18.0f);
                TextView textView = this.val$headerTextView;
                textView.layout(dp2, dp, textView.getMeasuredWidth() + dp2, this.val$headerTextView.getMeasuredHeight() + dp);
                int textSize = ((int) (dp + this.val$headerTextView.getTextSize())) + AndroidUtilities.dp(16.0f);
                int dp3 = AndroidUtilities.dp(16.0f);
                TextView textView2 = this.val$messageTextView;
                textView2.layout(dp3, textSize, textView2.getMeasuredWidth() + dp3, this.val$messageTextView.getMeasuredHeight() + textSize);
            }
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
            viewGroup.removeView((View) obj);
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public void setPrimaryItem(ViewGroup viewGroup, int i, Object obj) {
            super.setPrimaryItem(viewGroup, i, obj);
            IntroActivity.this.bottomPages.setCurrentPage(i);
            IntroActivity.this.currentViewPagerPage = i;
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public boolean isViewFromObject(View view, Object obj) {
            return view.equals(obj);
        }
    }

    /* loaded from: classes3.dex */
    public class EGLThread extends DispatchQueue {
        private EGL10 egl10;
        private EGLConfig eglConfig;
        private EGLContext eglContext;
        private EGLDisplay eglDisplay;
        private EGLSurface eglSurface;
        private boolean initied;
        private long lastDrawFrame;
        private float maxRefreshRate;
        private SurfaceTexture surfaceTexture;
        private int[] textures = new int[24];
        private GenericProvider<Void, Bitmap> telegramMaskProvider = IntroActivity$EGLThread$$ExternalSyntheticLambda2.INSTANCE;
        private Runnable drawRunnable = new AnonymousClass1();

        public static /* synthetic */ Bitmap lambda$new$0(Void r6) {
            int dp = AndroidUtilities.dp(150.0f);
            Bitmap createBitmap = Bitmap.createBitmap(AndroidUtilities.dp(200.0f), dp, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            canvas.drawColor(Theme.getColor("windowBackgroundWhite"));
            Paint paint = new Paint(1);
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
            canvas.drawCircle(createBitmap.getWidth() / 2.0f, createBitmap.getHeight() / 2.0f, dp / 2.0f, paint);
            return createBitmap;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public EGLThread(SurfaceTexture surfaceTexture) {
            super("EGLThread");
            IntroActivity.this = r1;
            this.surfaceTexture = surfaceTexture;
        }

        private boolean initGL() {
            EGL10 egl10 = (EGL10) EGLContext.getEGL();
            this.egl10 = egl10;
            EGLDisplay eglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
            this.eglDisplay = eglGetDisplay;
            if (eglGetDisplay == EGL10.EGL_NO_DISPLAY) {
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.e("eglGetDisplay failed " + GLUtils.getEGLErrorString(this.egl10.eglGetError()));
                }
                finish();
                return false;
            }
            if (!this.egl10.eglInitialize(eglGetDisplay, new int[2])) {
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.e("eglInitialize failed " + GLUtils.getEGLErrorString(this.egl10.eglGetError()));
                }
                finish();
                return false;
            }
            int[] iArr = new int[1];
            EGLConfig[] eGLConfigArr = new EGLConfig[1];
            if (!this.egl10.eglChooseConfig(this.eglDisplay, EmuDetector.with(IntroActivity.this.getParentActivity()).detect() ? new int[]{12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 24, 12344} : new int[]{12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 24, 12326, 0, 12338, 1, 12337, 2, 12344}, eGLConfigArr, 1, iArr)) {
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.e("eglChooseConfig failed " + GLUtils.getEGLErrorString(this.egl10.eglGetError()));
                }
                finish();
                return false;
            } else if (iArr[0] > 0) {
                EGLConfig eGLConfig = eGLConfigArr[0];
                this.eglConfig = eGLConfig;
                EGLContext eglCreateContext = this.egl10.eglCreateContext(this.eglDisplay, eGLConfig, EGL10.EGL_NO_CONTEXT, new int[]{12440, 2, 12344});
                this.eglContext = eglCreateContext;
                if (eglCreateContext == null) {
                    if (BuildVars.LOGS_ENABLED) {
                        FileLog.e("eglCreateContext failed " + GLUtils.getEGLErrorString(this.egl10.eglGetError()));
                    }
                    finish();
                    return false;
                }
                SurfaceTexture surfaceTexture = this.surfaceTexture;
                if (surfaceTexture instanceof SurfaceTexture) {
                    EGLSurface eglCreateWindowSurface = this.egl10.eglCreateWindowSurface(this.eglDisplay, this.eglConfig, surfaceTexture, null);
                    this.eglSurface = eglCreateWindowSurface;
                    if (eglCreateWindowSurface == null || eglCreateWindowSurface == EGL10.EGL_NO_SURFACE) {
                        if (BuildVars.LOGS_ENABLED) {
                            FileLog.e("createWindowSurface failed " + GLUtils.getEGLErrorString(this.egl10.eglGetError()));
                        }
                        finish();
                        return false;
                    } else if (!this.egl10.eglMakeCurrent(this.eglDisplay, eglCreateWindowSurface, eglCreateWindowSurface, this.eglContext)) {
                        if (BuildVars.LOGS_ENABLED) {
                            FileLog.e("eglMakeCurrent failed " + GLUtils.getEGLErrorString(this.egl10.eglGetError()));
                        }
                        finish();
                        return false;
                    } else {
                        GLES20.glGenTextures(23, this.textures, 0);
                        loadTexture(2131165549, 0);
                        loadTexture(2131165548, 1);
                        loadTexture(2131165550, 2);
                        loadTexture(2131165551, 3);
                        loadTexture(2131165553, 4);
                        loadTexture(2131165552, 5);
                        loadTexture(2131165555, 6);
                        loadTexture(2131165554, 7);
                        loadTexture(2131165556, 8);
                        loadTexture(2131165557, 9);
                        loadTexture(2131165559, 10);
                        loadTexture(2131165558, 11);
                        loadTexture(2131165560, 12);
                        loadTexture(2131165561, 13);
                        loadTexture(2131165562, 14);
                        loadTexture(2131165564, 15);
                        loadTexture(2131165563, 16);
                        loadTexture(2131165565, 17, Theme.getColor("windowBackgroundWhite"), false);
                        loadTexture(2131165566, 18);
                        loadTexture(2131165567, 19);
                        loadTexture(2131165568, 20);
                        loadTexture(2131165569, 21);
                        loadTexture(IntroActivity$EGLThread$$ExternalSyntheticLambda1.INSTANCE, 22);
                        loadTexture(this.telegramMaskProvider, 23);
                        updateTelegramTextures();
                        updatePowerfulTextures();
                        int[] iArr2 = this.textures;
                        Intro.setPrivateTextures(iArr2[19], iArr2[20]);
                        int[] iArr3 = this.textures;
                        Intro.setFreeTextures(iArr3[14], iArr3[13]);
                        int[] iArr4 = this.textures;
                        Intro.setFastTextures(iArr4[2], iArr4[3], iArr4[1], iArr4[0]);
                        int[] iArr5 = this.textures;
                        Intro.setIcTextures(iArr5[4], iArr5[5], iArr5[6], iArr5[7], iArr5[8], iArr5[9], iArr5[10], iArr5[11], iArr5[12]);
                        Intro.onSurfaceCreated();
                        IntroActivity.this.currentDate = System.currentTimeMillis() - 1000;
                        return true;
                    }
                }
                finish();
                return false;
            } else {
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.e("eglConfig not initialized");
                }
                finish();
                return false;
            }
        }

        public static /* synthetic */ Bitmap lambda$initGL$1(Void r4) {
            Paint paint = new Paint(1);
            paint.setColor(-13851168);
            int dp = AndroidUtilities.dp(150.0f);
            Bitmap createBitmap = Bitmap.createBitmap(dp, dp, Bitmap.Config.ARGB_8888);
            float f = dp / 2.0f;
            new Canvas(createBitmap).drawCircle(f, f, f, paint);
            return createBitmap;
        }

        public void updateTelegramTextures() {
            int[] iArr = this.textures;
            Intro.setTelegramTextures(iArr[22], iArr[21], iArr[23]);
        }

        public void updatePowerfulTextures() {
            int[] iArr = this.textures;
            Intro.setPowerfulTextures(iArr[17], iArr[18], iArr[16], iArr[15]);
        }

        public void finish() {
            if (this.eglSurface != null) {
                EGL10 egl10 = this.egl10;
                EGLDisplay eGLDisplay = this.eglDisplay;
                EGLSurface eGLSurface = EGL10.EGL_NO_SURFACE;
                egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL10.EGL_NO_CONTEXT);
                this.egl10.eglDestroySurface(this.eglDisplay, this.eglSurface);
                this.eglSurface = null;
            }
            EGLContext eGLContext = this.eglContext;
            if (eGLContext != null) {
                this.egl10.eglDestroyContext(this.eglDisplay, eGLContext);
                this.eglContext = null;
            }
            EGLDisplay eGLDisplay2 = this.eglDisplay;
            if (eGLDisplay2 != null) {
                this.egl10.eglTerminate(eGLDisplay2);
                this.eglDisplay = null;
            }
        }

        /* renamed from: org.telegram.ui.IntroActivity$EGLThread$1 */
        /* loaded from: classes3.dex */
        public class AnonymousClass1 implements Runnable {
            AnonymousClass1() {
                EGLThread.this = r1;
            }

            @Override // java.lang.Runnable
            public void run() {
                float[] supportedRefreshRates;
                if (!EGLThread.this.initied) {
                    return;
                }
                long currentTimeMillis = System.currentTimeMillis();
                if ((EGLThread.this.eglContext.equals(EGLThread.this.egl10.eglGetCurrentContext()) && EGLThread.this.eglSurface.equals(EGLThread.this.egl10.eglGetCurrentSurface(12377))) || EGLThread.this.egl10.eglMakeCurrent(EGLThread.this.eglDisplay, EGLThread.this.eglSurface, EGLThread.this.eglSurface, EGLThread.this.eglContext)) {
                    int min = (int) Math.min(currentTimeMillis - EGLThread.this.lastDrawFrame, 16L);
                    Intro.setPage(IntroActivity.this.currentViewPagerPage);
                    Intro.setDate(((float) (currentTimeMillis - IntroActivity.this.currentDate)) / 1000.0f);
                    Intro.onDrawFrame(min);
                    EGLThread.this.egl10.eglSwapBuffers(EGLThread.this.eglDisplay, EGLThread.this.eglSurface);
                    EGLThread.this.lastDrawFrame = currentTimeMillis;
                    float f = 0.0f;
                    if (EGLThread.this.maxRefreshRate == 0.0f) {
                        if (Build.VERSION.SDK_INT < 21) {
                            EGLThread.this.maxRefreshRate = 60.0f;
                        } else {
                            for (float f2 : ((WindowManager) ApplicationLoader.applicationContext.getSystemService("window")).getDefaultDisplay().getSupportedRefreshRates()) {
                                if (f2 > f) {
                                    f = f2;
                                }
                            }
                            EGLThread.this.maxRefreshRate = f;
                        }
                    }
                    long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
                    EGLThread eGLThread = EGLThread.this;
                    eGLThread.postRunnable(eGLThread.drawRunnable, Math.max((1000.0f / EGLThread.this.maxRefreshRate) - currentTimeMillis2, 0L));
                } else if (BuildVars.LOGS_ENABLED) {
                    FileLog.e("eglMakeCurrent failed " + GLUtils.getEGLErrorString(EGLThread.this.egl10.eglGetError()));
                }
            }
        }

        private void loadTexture(GenericProvider<Void, Bitmap> genericProvider, int i) {
            loadTexture(genericProvider, i, false);
        }

        public void loadTexture(GenericProvider<Void, Bitmap> genericProvider, int i, boolean z) {
            if (z) {
                GLES20.glDeleteTextures(1, this.textures, i);
                GLES20.glGenTextures(1, this.textures, i);
            }
            Bitmap provide = genericProvider.provide(null);
            GLES20.glBindTexture(3553, this.textures[i]);
            GLES20.glTexParameteri(3553, 10241, 9729);
            GLES20.glTexParameteri(3553, 10240, 9729);
            GLES20.glTexParameteri(3553, 10242, 33071);
            GLES20.glTexParameteri(3553, 10243, 33071);
            GLUtils.texImage2D(3553, 0, provide, 0);
            provide.recycle();
        }

        private void loadTexture(int i, int i2) {
            loadTexture(i, i2, 0, false);
        }

        public void loadTexture(int i, int i2, int i3, boolean z) {
            Drawable drawable = IntroActivity.this.getParentActivity().getResources().getDrawable(i);
            if (drawable instanceof BitmapDrawable) {
                if (z) {
                    GLES20.glDeleteTextures(1, this.textures, i2);
                    GLES20.glGenTextures(1, this.textures, i2);
                }
                Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
                GLES20.glBindTexture(3553, this.textures[i2]);
                GLES20.glTexParameteri(3553, 10241, 9729);
                GLES20.glTexParameteri(3553, 10240, 9729);
                GLES20.glTexParameteri(3553, 10242, 33071);
                GLES20.glTexParameteri(3553, 10243, 33071);
                if (i3 != 0) {
                    Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(createBitmap);
                    Paint paint = new Paint(5);
                    paint.setColorFilter(new PorterDuffColorFilter(i3, PorterDuff.Mode.SRC_IN));
                    canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
                    GLUtils.texImage2D(3553, 0, createBitmap, 0);
                    createBitmap.recycle();
                    return;
                }
                GLUtils.texImage2D(3553, 0, bitmap, 0);
            }
        }

        public void shutdown() {
            postRunnable(new IntroActivity$EGLThread$$ExternalSyntheticLambda0(this));
        }

        public /* synthetic */ void lambda$shutdown$2() {
            finish();
            Looper myLooper = Looper.myLooper();
            if (myLooper != null) {
                myLooper.quit();
            }
        }

        public void setSurfaceTextureSize(int i, int i2) {
            Intro.onSurfaceChanged(i, i2, Math.min(i / 150.0f, i2 / 150.0f), 0);
        }

        @Override // org.telegram.messenger.DispatchQueue, java.lang.Thread, java.lang.Runnable
        public void run() {
            this.initied = initGL();
            super.run();
        }
    }

    public /* synthetic */ void lambda$getThemeDescriptions$5() {
        updateColors(true);
    }

    @Override // org.telegram.ui.ActionBar.BaseFragment
    public ArrayList<ThemeDescription> getThemeDescriptions() {
        return SimpleThemeDescription.createThemeDescriptions(new IntroActivity$$ExternalSyntheticLambda6(this), "windowBackgroundWhite", "windowBackgroundWhiteBlueText4", "chats_actionBackground", "chats_actionPressedBackground", "featuredStickers_buttonText", "windowBackgroundWhiteBlackText", "windowBackgroundWhiteGrayText3");
    }

    private void updateColors(boolean z) {
        this.fragmentView.setBackgroundColor(Theme.getColor("windowBackgroundWhite"));
        this.switchLanguageTextView.setTextColor(Theme.getColor("windowBackgroundWhiteBlueText4"));
        this.startMessagingButton.setTextColor(Theme.getColor("featuredStickers_buttonText"));
        this.startMessagingButton.setBackground(Theme.createSimpleSelectorRoundRectDrawable(AndroidUtilities.dp(6.0f), Theme.getColor("changephoneinfo_image2"), Theme.getColor("chats_actionPressedBackground")));
        this.darkThemeDrawable.setColorFilter(new PorterDuffColorFilter(Theme.getColor("changephoneinfo_image2"), PorterDuff.Mode.SRC_IN));
        this.bottomPages.invalidate();
        if (z) {
            EGLThread eGLThread = this.eglThread;
            if (eGLThread != null) {
                eGLThread.postRunnable(new IntroActivity$$ExternalSyntheticLambda3(this));
            }
            for (int i = 0; i < this.viewPager.getChildCount(); i++) {
                View childAt = this.viewPager.getChildAt(i);
                ((TextView) childAt.findViewWithTag(this.pagerHeaderTag)).setTextColor(Theme.getColor("windowBackgroundWhiteBlackText"));
                ((TextView) childAt.findViewWithTag(this.pagerMessageTag)).setTextColor(Theme.getColor("windowBackgroundWhiteGrayText3"));
            }
            return;
        }
        Intro.setBackgroundColor(Theme.getColor("windowBackgroundWhite"));
    }

    public /* synthetic */ void lambda$updateColors$6() {
        this.eglThread.loadTexture(2131165565, 17, Theme.getColor("windowBackgroundWhite"), true);
        this.eglThread.updatePowerfulTextures();
        EGLThread eGLThread = this.eglThread;
        eGLThread.loadTexture(eGLThread.telegramMaskProvider, 23, true);
        this.eglThread.updateTelegramTextures();
        Intro.setBackgroundColor(Theme.getColor("windowBackgroundWhite"));
    }

    @Override // org.telegram.ui.ActionBar.BaseFragment
    public boolean isLightStatusBar() {
        return ColorUtils.calculateLuminance(Theme.getColor("windowBackgroundWhite", null, true)) > 0.699999988079071d;
    }
}
