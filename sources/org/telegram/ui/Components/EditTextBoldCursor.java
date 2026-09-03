package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;
import android.os.Build;
import android.os.Looper;
import android.os.SystemClock;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import j$.util.Objects;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.XiaomiUtilities;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public class EditTextBoldCursor extends zt {
    private static final String BLINK_CLASS = "android.widget.Editor$Blink";
    public static final /* synthetic */ int a = 0;
    private static Class editorClass;
    private static Method getVerticalOffsetMethod;
    private static Field mCursorDrawableResField;
    private static Field mEditor;
    private static Method mEditorInvalidateDisplayList;
    private static Field mScrollYField;
    private static boolean mScrollYGet;
    private static Field mShowCursorField;
    private int activeLineColor;
    private Paint activeLinePaint;
    private float activeLineWidth;
    private boolean allowDrawCursor;
    private View attachedToWindow;
    og.a blurredBackgroundDrawableViewFactory;
    private boolean currentDrawHintAsHeader;
    ShapeDrawable cursorDrawable;
    private boolean cursorDrawn;
    private int cursorSize;
    private float cursorWidth;
    public Utilities.Callback2<Canvas, Runnable> drawHint;
    boolean drawInMaim;
    private Object editor;
    public boolean ellipsizeByGradient;
    private LinearGradient ellipsizeGradient;
    private Matrix ellipsizeMatrix;
    private Paint ellipsizePaint;
    private int ellipsizeWidth;
    private StaticLayout errorLayout;
    private int errorLineColor;
    private TextPaint errorPaint;
    private CharSequence errorText;
    private boolean fixed;
    public org.telegram.ui.ActionBar.k4 floatingActionMode;
    private org.telegram.ui.ActionBar.z4 floatingToolbar;
    private ViewTreeObserver.OnPreDrawListener floatingToolbarPreDrawListener;
    private boolean forceCursorEnd;
    private GradientDrawable gradientDrawable;
    private float headerAnimationProgress;
    private int headerHintColor;
    private AnimatorSet headerTransformAnimation;
    private CharSequence hint;
    private float hintAlpha;
    private j6 hintAnimatedDrawable;
    private j6 hintAnimatedDrawable2;
    private iy0 hintAnimator;
    private int hintColor;
    private long hintLastUpdateTime;
    private StaticLayout hintLayout;
    public int hintLayoutOffset;
    public float hintLayoutX;
    public float hintLayoutY;
    public boolean hintLayoutYFix;
    private boolean hintVisible;
    private int ignoreBottomCount;
    public boolean ignoreClipTop;
    private int ignoreTopCount;
    private final lf.i invalidateCallback;
    private boolean isTextWatchersSuppressed;
    private float lastLineActiveness;
    int lastOffset;
    private int lastSize;
    CharSequence lastText;
    private int lastTouchX;
    private boolean lineActive;
    private float lineActiveness;
    private int lineColor;
    private long lineLastUpdateTime;
    private Paint linePaint;
    private float lineSpacingExtra;
    private boolean lineVisible;
    private float lineY;
    public boolean lineYFix;
    private ViewTreeObserver.OnPreDrawListener listenerFixer;
    private Drawable mCursorDrawable;
    private int mHandlesColor;
    private ColorFilter mHandlesColorFilter;
    private Rect mTempRect;
    private Drawable mTextSelectHandle;
    private Drawable mTextSelectHandleLeft;
    private Drawable mTextSelectHandleRight;
    private boolean nextSetTextAnimated;
    private Runnable onPremiumMenuLockClickListener;
    private Rect padding;
    private Rect rect;
    private List<TextWatcher> registeredTextWatchers;
    float rightHintOffset;
    private int scrollY;
    private boolean supportRtlHint;
    private boolean transformHintToHeader;
    private boolean transformHintToHeaderOnFocus;
    private View windowView;

    public EditTextBoldCursor(Context context) {
        super(context);
        this.invalidateCallback = new x5(this, 1);
        this.rect = new Rect();
        this.hintVisible = true;
        this.hintAlpha = 1.0f;
        this.allowDrawCursor = true;
        this.forceCursorEnd = false;
        this.cursorWidth = 2.0f;
        this.lineVisible = false;
        this.lineActive = false;
        this.lineActiveness = 0.0f;
        this.lastLineActiveness = 0.0f;
        this.activeLineWidth = 0.0f;
        this.transformHintToHeaderOnFocus = true;
        this.lastOffset = -1;
        this.registeredTextWatchers = new ArrayList();
        this.isTextWatchersSuppressed = false;
        this.padding = new Rect();
        this.lastTouchX = -1;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 26) {
            setImportantForAutofill(2);
        }
        this.linePaint = new Paint();
        this.activeLinePaint = new Paint();
        TextPaint textPaint = new TextPaint(1);
        this.errorPaint = textPaint;
        textPaint.setTextSize(AndroidUtilities.dp(11.0f));
        if (i10 >= 26) {
            setImportantForAutofill(2);
        }
        if (i10 >= 29) {
            rt rtVar = new rt(this);
            this.cursorDrawable = rtVar;
            rtVar.setShape(new RectShape());
            this.gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{-11230757, -11230757});
            setTextCursorDrawable(this.cursorDrawable);
        }
        try {
            if (!mScrollYGet && mScrollYField == null) {
                mScrollYGet = true;
                Field declaredField = View.class.getDeclaredField("mScrollY");
                mScrollYField = declaredField;
                declaredField.setAccessible(true);
            }
        } catch (Throwable unused) {
        }
        try {
            if (editorClass == null) {
                Field declaredField2 = TextView.class.getDeclaredField("mEditor");
                mEditor = declaredField2;
                declaredField2.setAccessible(true);
                Class<?> cls = Class.forName("android.widget.Editor");
                editorClass = cls;
                try {
                    Field declaredField3 = cls.getDeclaredField("mShowCursor");
                    mShowCursorField = declaredField3;
                    declaredField3.setAccessible(true);
                } catch (Exception unused2) {
                }
                try {
                    Method declaredMethod = editorClass.getDeclaredMethod("invalidateTextDisplayList", null);
                    mEditorInvalidateDisplayList = declaredMethod;
                    declaredMethod.setAccessible(true);
                } catch (Exception unused3) {
                }
                Method declaredMethod2 = TextView.class.getDeclaredMethod("getVerticalOffset", Boolean.TYPE);
                getVerticalOffsetMethod = declaredMethod2;
                declaredMethod2.setAccessible(true);
            }
        } catch (Throwable th2) {
            FileLog.e(th2);
        }
        if (this.cursorDrawable == null) {
            try {
                GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{-11230757, -11230757});
                this.gradientDrawable = gradientDrawable;
                if (Build.VERSION.SDK_INT >= 29) {
                    setTextCursorDrawable(gradientDrawable);
                }
                this.editor = mEditor.get(this);
            } catch (Throwable unused4) {
            }
            try {
                if (mCursorDrawableResField == null) {
                    Field declaredField4 = TextView.class.getDeclaredField("mCursorDrawableRes");
                    mCursorDrawableResField = declaredField4;
                    declaredField4.setAccessible(true);
                }
                Field field = mCursorDrawableResField;
                if (field != null) {
                    field.set(this, Integer.valueOf(R.drawable.field_carret_empty));
                }
            } catch (Throwable unused5) {
            }
        }
        this.cursorSize = AndroidUtilities.dp(24.0f);
    }

    @Override // android.widget.TextView
    public void addTextChangedListener(TextWatcher textWatcher) {
        this.registeredTextWatchers.add(textWatcher);
        if (this.isTextWatchersSuppressed) {
            return;
        }
        super.addTextChangedListener(textWatcher);
    }

    public void dispatchTextWatchersTextChanged() {
        for (TextWatcher textWatcher : this.registeredTextWatchers) {
            textWatcher.beforeTextChanged("", 0, length(), length());
            textWatcher.onTextChanged(getText(), 0, length(), length());
            textWatcher.afterTextChanged(getText());
        }
    }

    public final void e(boolean z4) {
        boolean z10 = this.transformHintToHeader && (getText().length() > 0 || (this.transformHintToHeaderOnFocus && isFocused()));
        if (this.currentDrawHintAsHeader != z10) {
            AnimatorSet animatorSet = this.headerTransformAnimation;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.headerTransformAnimation = null;
            }
            this.currentDrawHintAsHeader = z10;
            if (z4) {
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.headerTransformAnimation = animatorSet2;
                animatorSet2.playTogether(ObjectAnimator.ofFloat(this, "headerAnimationProgress", z10 ? 1.0f : 0.0f));
                this.headerTransformAnimation.setDuration(200L);
                this.headerTransformAnimation.setInterpolator(pr.h);
                this.headerTransformAnimation.start();
            } else {
                this.headerAnimationProgress = z10 ? 1.0f : 0.0f;
            }
            invalidate();
        }
    }

    public final void f() {
        org.telegram.ui.ActionBar.z4 z4Var = this.floatingToolbar;
        if (z4Var != null) {
            z4Var.a.removeOnLayoutChangeListener(z4Var.l);
            org.telegram.ui.ActionBar.x4 x4Var = z4Var.b;
            if (!x4Var.F) {
                x4Var.G = false;
                x4Var.F = true;
                x4Var.x.cancel();
                x4Var.w.start();
                x4Var.D.setEmpty();
            }
            this.floatingToolbar = null;
        }
        if (this.floatingToolbarPreDrawListener != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.floatingToolbarPreDrawListener);
            this.floatingToolbarPreDrawListener = null;
        }
    }

    public void fixHandleView(boolean z4) {
        if (z4) {
            this.fixed = false;
            return;
        }
        if (this.fixed) {
            return;
        }
        try {
            if (editorClass == null) {
                editorClass = Class.forName("android.widget.Editor");
                Field declaredField = TextView.class.getDeclaredField("mEditor");
                mEditor = declaredField;
                declaredField.setAccessible(true);
                this.editor = mEditor.get(this);
            }
            if (this.listenerFixer == null) {
                Method declaredMethod = editorClass.getDeclaredMethod("getPositionListener", null);
                declaredMethod.setAccessible(true);
                this.listenerFixer = (ViewTreeObserver.OnPreDrawListener) declaredMethod.invoke(this.editor, null);
            }
            ViewTreeObserver.OnPreDrawListener onPreDrawListener = this.listenerFixer;
            Objects.requireNonNull(onPreDrawListener);
            AndroidUtilities.runOnUIThread(new xp(onPreDrawListener, 8), 500L);
        } catch (Throwable unused) {
        }
        this.fixed = true;
    }

    public final void g() {
        int i10;
        Layout layout = getLayout();
        int length = this.forceCursorEnd ? layout.getText().length() : getSelectionStart();
        int lineForOffset = layout.getLineForOffset(length);
        int lineTop = layout.getLineTop(lineForOffset);
        int lineTop2 = layout.getLineTop(lineForOffset + 1);
        float primaryHorizontal = layout.getPrimaryHorizontal(length);
        GradientDrawable gradientDrawable = this.gradientDrawable;
        float max = Math.max(0.5f, primaryHorizontal - 0.5f);
        if (this.mTempRect == null) {
            this.mTempRect = new Rect();
        }
        if (gradientDrawable != null) {
            gradientDrawable.getPadding(this.mTempRect);
            i10 = gradientDrawable.getIntrinsicWidth();
        } else {
            this.mTempRect.setEmpty();
            i10 = 0;
        }
        int scrollX = getScrollX();
        float f10 = max - scrollX;
        int width = (getWidth() - getCompoundPaddingLeft()) - getCompoundPaddingRight();
        float f11 = width;
        int i11 = f10 >= f11 - 1.0f ? (width + scrollX) - (i10 - this.mTempRect.right) : (Math.abs(f10) <= 1.0f || (TextUtils.isEmpty(getText()) && ((float) (1048576 - scrollX)) <= f11 + 1.0f && max <= 1.0f)) ? scrollX - this.mTempRect.left : ((int) max) - this.mTempRect.left;
        int dp = AndroidUtilities.dp(this.cursorWidth);
        GradientDrawable gradientDrawable2 = this.gradientDrawable;
        Rect rect = this.mTempRect;
        gradientDrawable2.setBounds(i11, lineTop - rect.top, dp + i11, lineTop2 + rect.bottom);
        this.lastText = layout.getText();
        this.lastOffset = length;
    }

    public int getActionModeStyle() {
        return 1;
    }

    @Override // android.widget.TextView, android.view.View
    public int getAutofillType() {
        return 0;
    }

    public StaticLayout getErrorLayout(int i10) {
        if (TextUtils.isEmpty(this.errorText)) {
            return null;
        }
        return new StaticLayout(this.errorText, this.errorPaint, i10, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
    }

    @Override // android.widget.TextView
    public int getExtendedPaddingBottom() {
        int i10 = this.ignoreBottomCount;
        if (i10 == 0) {
            return super.getExtendedPaddingBottom();
        }
        this.ignoreBottomCount = i10 - 1;
        int i11 = this.scrollY;
        if (i11 != Integer.MAX_VALUE) {
            return -i11;
        }
        return 0;
    }

    @Override // android.widget.TextView
    public int getExtendedPaddingTop() {
        int i10 = this.ignoreTopCount;
        if (i10 == 0) {
            return super.getExtendedPaddingTop();
        }
        this.ignoreTopCount = i10 - 1;
        return 0;
    }

    public float getHeaderAnimationProgress() {
        return this.headerAnimationProgress;
    }

    public Layout getHintLayoutEx() {
        return this.hintLayout;
    }

    @Override // android.widget.TextView
    public float getLineSpacingExtra() {
        return super.getLineSpacingExtra();
    }

    public float getLineY() {
        return this.lineY;
    }

    public Runnable getOnPremiumMenuLockClickListener() {
        return this.onPremiumMenuLockClickListener;
    }

    public org.telegram.ui.ActionBar.g6 getResourcesProvider() {
        return null;
    }

    @Override // android.widget.TextView
    public Drawable getTextCursorDrawable() {
        if (this.cursorDrawable != null) {
            return super.getTextCursorDrawable();
        }
        rt rtVar = new rt(this, new RectShape());
        rtVar.getPaint().setColor(0);
        return rtVar;
    }

    @Override // android.widget.TextView
    public Drawable getTextSelectHandle() {
        if (this.mTextSelectHandle == null) {
            this.mTextSelectHandle = h(super.getTextSelectHandle(), true);
        }
        return this.mTextSelectHandle;
    }

    @Override // android.widget.TextView
    public Drawable getTextSelectHandleLeft() {
        if (this.mTextSelectHandleLeft == null) {
            this.mTextSelectHandleLeft = h(super.getTextSelectHandleLeft(), true);
        }
        return this.mTextSelectHandleLeft;
    }

    @Override // android.widget.TextView
    public Drawable getTextSelectHandleRight() {
        if (this.mTextSelectHandleRight == null) {
            this.mTextSelectHandleRight = h(super.getTextSelectHandleRight(), true);
        }
        return this.mTextSelectHandleRight;
    }

    public final Drawable h(Drawable drawable, boolean z4) {
        if (drawable != null) {
            if (z4) {
                drawable = drawable.mutate();
            }
            ColorFilter colorFilter = this.mHandlesColorFilter;
            if (colorFilter != null) {
                drawable.setColorFilter(colorFilter);
            }
        }
        return drawable;
    }

    public boolean hasErrorText() {
        return !TextUtils.isEmpty(this.errorText);
    }

    public void hideActionMode() {
        f();
    }

    public void invalidateForce() {
        invalidate();
        if (isHardwareAccelerated()) {
            try {
                if (mEditorInvalidateDisplayList != null) {
                    if (this.editor == null) {
                        this.editor = mEditor.get(this);
                    }
                    Object obj = this.editor;
                    if (obj != null) {
                        mEditorInvalidateDisplayList.invoke(obj, null);
                    }
                }
            } catch (Exception unused) {
            }
        }
    }

    public boolean isTextWatchersSuppressed() {
        return this.isTextWatchersSuppressed;
    }

    @Override // org.telegram.ui.Components.zt, android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        try {
            super.onAttachedToWindow();
        } catch (Exception e6) {
            FileLog.e(e6);
        }
        this.attachedToWindow = getRootView();
        if (Build.VERSION.SDK_INT < 29) {
            lf.j.d().b(this.invalidateCallback, 2);
        }
    }

    @Override // org.telegram.ui.Components.zt, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.attachedToWindow = null;
        if (Build.VERSION.SDK_INT < 29) {
            lf.j.d().g(this.invalidateCallback);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(22:0|1|(4:170|(5:174|(1:276)|178|(2:180|(1:182))(2:273|(1:275))|183)|184|(2:200|(27:206|(1:208)(1:272)|209|(1:271)(1:213)|214|(3:216|(1:(1:269))(1:220)|221)(1:270)|222|(2:264|(1:266)(1:267))(4:226|(8:228|(1:230)(1:262)|231|(1:233)|234|(5:236|(1:238)(1:260)|239|(1:241)|242)(1:261)|243|(8:245|(1:247)(1:258)|248|(1:250)(1:257)|251|(1:253)|254|255))(1:263)|259|255)|256|6|(1:8)|9|10|11|(1:13)(1:163)|14|15|16|17|18|(2:22|23)|31|(5:119|120|(1:149)(2:124|(1:148)(1:128))|129|(2:132|(6:134|(4:136|137|(1:141)|142)|144|137|(2:139|141)|142)(6:145|(4:147|137|(0)|142)|144|137|(0)|142)))(2:33|(3:37|38|(6:40|(4:42|43|(1:47)|48)|50|43|(2:45|47)|48)(6:51|(4:53|43|(0)|48)|50|43|(0)|48)))|60|(17:64|(1:66)(2:110|(1:112)(1:113))|67|(1:69)|70|(4:103|(1:105)(1:109)|106|(1:108))|79|(1:81)(1:102)|82|(1:84)(1:101)|85|86|(1:88)|89|(1:91)|92|(4:94|(1:96)|(1:98)|99)(1:100))|114|(2:116|117)(1:118)))(3:192|(2:194|(1:196)(1:198))(1:199)|197))|5|6|(0)|9|10|11|(0)(0)|14|15|16|17|18|(3:20|22|23)|31|(0)(0)|60|(22:62|64|(0)(0)|67|(0)|70|(2:72|74)|103|(0)(0)|106|(0)|79|(0)(0)|82|(0)(0)|85|86|(0)|89|(0)|92|(0)(0))|114|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x0377, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x037a, code lost:
    
        if (org.telegram.messenger.BuildVars.DEBUG_PRIVATE_VERSION != false) goto L273;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x072b, code lost:
    
        throw new java.lang.RuntimeException(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x0356, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x0731, code lost:
    
        throw new java.lang.RuntimeException(r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0694  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x05f0  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x05ca  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x05ab  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x05bf  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x05ae  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0565  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x069a  */
    /* JADX WARN: Removed duplicated region for block: B:118:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:119:0x03a1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:139:0x044f A[Catch: all -> 0x03c3, TryCatch #0 {all -> 0x03c3, blocks: (B:120:0x03a1, B:122:0x03a5, B:124:0x03a9, B:126:0x03bb, B:129:0x03cc, B:132:0x03d2, B:134:0x03d9, B:136:0x03e1, B:137:0x0407, B:139:0x044f, B:141:0x0452, B:142:0x0457, B:145:0x03f4, B:147:0x03fc, B:149:0x03c8), top: B:119:0x03a1 }] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0346 A[Catch: Exception -> 0x0356, TryCatch #3 {Exception -> 0x0356, blocks: (B:11:0x0342, B:13:0x0346, B:163:0x0358), top: B:10:0x0342 }] */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0358 A[Catch: Exception -> 0x0356, TRY_LEAVE, TryCatch #3 {Exception -> 0x0356, blocks: (B:11:0x0342, B:13:0x0346, B:163:0x0358), top: B:10:0x0342 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0484  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x050c A[Catch: all -> 0x04ae, TryCatch #4 {all -> 0x04ae, blocks: (B:38:0x048c, B:40:0x0493, B:42:0x049b, B:43:0x04c4, B:45:0x050c, B:47:0x050f, B:48:0x0514, B:51:0x04b1, B:53:0x04b9), top: B:37:0x048c }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0557  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x057b  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x05c8  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x05e5  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x060f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0627  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0645  */
    @Override // org.telegram.ui.Components.zt, android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onDraw(Canvas canvas) {
        float f10;
        float f11;
        Field field;
        boolean z4;
        int totalPaddingTop;
        Rect rect;
        int i10;
        float f12;
        Object obj;
        boolean z10;
        float elapsedRealtime;
        int i11;
        float f13;
        boolean z11;
        int totalPaddingTop2;
        Rect rect2;
        int i12;
        float f14;
        int i13;
        Field field2;
        Canvas canvas2 = canvas;
        if (length() == 0 || this.transformHintToHeader) {
            boolean z12 = this.hintVisible;
            if ((z12 && this.hintAlpha != 1.0f) || (!z12 && this.hintAlpha != 0.0f)) {
                long currentTimeMillis = System.currentTimeMillis();
                long j10 = currentTimeMillis - this.hintLastUpdateTime;
                if (j10 < 0 || j10 > 17) {
                    j10 = 17;
                }
                this.hintLastUpdateTime = currentTimeMillis;
                if (this.hintVisible) {
                    float f15 = (j10 / 150.0f) + this.hintAlpha;
                    this.hintAlpha = f15;
                    if (f15 > 1.0f) {
                        this.hintAlpha = 1.0f;
                    }
                } else {
                    float f16 = this.hintAlpha - (j10 / 150.0f);
                    this.hintAlpha = f16;
                    if (f16 < 0.0f) {
                        this.hintAlpha = 0.0f;
                    }
                }
                invalidate();
            }
            j6 j6Var = this.hintAnimatedDrawable;
            if (j6Var != null && !TextUtils.isEmpty(j6Var.g) && (this.hintVisible || this.hintAlpha != 0.0f)) {
                if (this.hintAnimatedDrawable2 == null) {
                    j6 j6Var2 = this.hintAnimatedDrawable;
                    j6Var2.H = 0.0f;
                    j6Var2.invalidateSelf();
                } else if (this.hintAnimatedDrawable2.d() + this.hintAnimatedDrawable.d() < getMeasuredWidth()) {
                    canvas2.save();
                    canvas2.translate(this.hintAnimatedDrawable.d() + (this.hintAnimatedDrawable2.d() - getMeasuredWidth()), 0.0f);
                    this.hintAnimatedDrawable2.w = (int) (Color.alpha(this.hintColor) * this.hintAlpha);
                    this.hintAnimatedDrawable2.draw(canvas2);
                    canvas2.restore();
                    j6 j6Var3 = this.hintAnimatedDrawable;
                    j6Var3.H = 0.0f;
                    j6Var3.invalidateSelf();
                } else {
                    canvas2.save();
                    canvas2.translate(this.rightHintOffset, 0.0f);
                    this.hintAnimatedDrawable2.w = (int) (Color.alpha(this.hintColor) * this.hintAlpha);
                    this.hintAnimatedDrawable2.draw(canvas2);
                    canvas2.restore();
                    j6 j6Var4 = this.hintAnimatedDrawable;
                    j6Var4.H = (this.hintAnimatedDrawable2.d() + AndroidUtilities.dp(2.0f)) - this.rightHintOffset;
                    j6Var4.invalidateSelf();
                }
                this.hintAnimatedDrawable.w = (int) (Color.alpha(this.hintColor) * this.hintAlpha);
                this.hintAnimatedDrawable.draw(canvas2);
            } else if (this.hintLayout != null && (this.hintVisible || this.hintAlpha != 0.0f)) {
                int color = getPaint().getColor();
                canvas2.save();
                float lineLeft = this.hintLayout.getLineLeft(0);
                float lineWidth = this.hintLayout.getLineWidth(0);
                int i14 = lineLeft != 0.0f ? (int) (0 - lineLeft) : 0;
                if (this.supportRtlHint && LocaleController.isRTL) {
                    float scrollX = getScrollX() + i14 + (getMeasuredWidth() - lineWidth);
                    this.hintLayoutX = scrollX;
                    float height = (this.lineY - this.hintLayout.getHeight()) - AndroidUtilities.dp(7.0f);
                    this.hintLayoutY = height;
                    canvas2.translate(scrollX, height);
                } else {
                    float scrollX2 = getScrollX() + i14 + this.hintLayoutOffset;
                    this.hintLayoutX = scrollX2;
                    float height2 = (this.lineY - this.hintLayout.getHeight()) - AndroidUtilities.dp2(7.0f);
                    this.hintLayoutY = height2;
                    canvas2.translate(scrollX2, height2);
                }
                if (this.transformHintToHeader) {
                    float f17 = 1.0f - (this.headerAnimationProgress * 0.3f);
                    if (this.supportRtlHint && LocaleController.isRTL) {
                        float f18 = lineWidth + lineLeft;
                        canvas2.translate(f18 - (f18 * f17), 0.0f);
                    } else if (lineLeft != 0.0f) {
                        canvas2.translate((1.0f - f17) * lineLeft, 0.0f);
                    }
                    canvas2.scale(f17, f17);
                    canvas2.translate(0.0f, (-AndroidUtilities.dp(22.0f)) * this.headerAnimationProgress);
                    getPaint().setColor(i0.a.d(this.headerAnimationProgress, this.hintColor, this.headerHintColor));
                } else {
                    getPaint().setColor(this.hintColor);
                    getPaint().setAlpha((int) ((Color.alpha(this.hintColor) / 255.0f) * this.hintAlpha * 255.0f));
                }
                iy0 iy0Var = this.hintAnimator;
                if (iy0Var == null || !iy0Var.e) {
                    f10 = 2.0f;
                    f11 = 150.0f;
                    Utilities.Callback2<Canvas, Runnable> callback2 = this.drawHint;
                    if (callback2 != null) {
                        callback2.run(canvas2, new eo(9, this, canvas2));
                    } else {
                        this.hintLayout.draw(canvas2);
                    }
                } else {
                    canvas2.save();
                    canvas2.clipRect(0, 0, getMeasuredWidth(), getMeasuredHeight());
                    iy0 iy0Var2 = this.hintAnimator;
                    TextPaint paint = getPaint();
                    EditTextBoldCursor editTextBoldCursor = iy0Var2.a;
                    if (iy0Var2.e) {
                        float f19 = iy0Var2.h * (iy0Var2.f ? iy0Var2.i : 1.0f - iy0Var2.i);
                        int alpha = paint.getAlpha();
                        if (iy0Var2.d != null) {
                            canvas2.save();
                            canvas2.translate(f19, 0.0f);
                            iy0Var2.d.draw(canvas2);
                            canvas2.restore();
                        }
                        if (iy0Var2.b != null) {
                            float f20 = iy0Var2.f ? 1.0f - iy0Var2.i : iy0Var2.i;
                            canvas2.save();
                            f10 = 2.0f;
                            paint.setAlpha((int) (alpha * f20));
                            canvas2.translate(f19, 0.0f);
                            if (iy0Var2.g) {
                                float f21 = (f20 * 0.1f) + 0.9f;
                                canvas2.scale(f21, f21, f19, editTextBoldCursor.getMeasuredHeight() / 2.0f);
                            }
                            iy0Var2.b.draw(canvas2);
                            canvas2.restore();
                            paint.setAlpha(alpha);
                        } else {
                            f10 = 2.0f;
                        }
                        if (iy0Var2.c != null) {
                            float f22 = iy0Var2.f ? iy0Var2.i : 1.0f - iy0Var2.i;
                            canvas2.save();
                            f11 = 150.0f;
                            paint.setAlpha((int) (alpha * (iy0Var2.f ? iy0Var2.i : 1.0f - iy0Var2.i)));
                            canvas2.translate(f19, 0.0f);
                            if (iy0Var2.g) {
                                float f23 = (f22 * 0.1f) + 0.9f;
                                canvas2.scale(f23, f23, f19, editTextBoldCursor.getMeasuredHeight() / f10);
                            }
                            iy0Var2.c.draw(canvas2);
                            canvas2.restore();
                            paint.setAlpha(alpha);
                            canvas2.restore();
                        }
                    } else {
                        f10 = 2.0f;
                    }
                    f11 = 150.0f;
                    canvas2.restore();
                }
                getPaint().setColor(color);
                canvas2.restore();
                if (this.ellipsizeByGradient) {
                    canvas2.saveLayerAlpha((getPaddingLeft() + getScrollX()) - this.ellipsizeWidth, 0.0f, ((getWidth() + getScrollX()) - getPaddingRight()) + this.ellipsizeWidth, getHeight(), 255, 31);
                }
                int extendedPaddingTop = getExtendedPaddingTop();
                this.scrollY = ConnectionsManager.DEFAULT_DATACENTER_ID;
                field2 = mScrollYField;
                if (field2 == null) {
                    this.scrollY = field2.getInt(this);
                    mScrollYField.set(this, 0);
                } else {
                    this.scrollY = getScrollX();
                }
                this.ignoreTopCount = 1;
                this.ignoreBottomCount = 1;
                canvas2.save();
                canvas2.translate(0.0f, extendedPaddingTop);
                this.drawInMaim = true;
                super.onDraw(canvas);
                this.drawInMaim = false;
                field = mScrollYField;
                if (field != null && (i13 = this.scrollY) != Integer.MAX_VALUE) {
                    try {
                        field.set(this, Integer.valueOf(i13));
                    } catch (Exception e6) {
                        if (BuildVars.DEBUG_PRIVATE_VERSION) {
                            throw new RuntimeException(e6);
                        }
                    }
                }
                canvas2.restore();
                if (this.cursorDrawable != null) {
                    try {
                        Field field3 = mShowCursorField;
                        if (field3 == null || (obj = this.editor) == null) {
                            z4 = this.cursorDrawn;
                            this.cursorDrawn = false;
                        } else {
                            z4 = (SystemClock.uptimeMillis() - field3.getLong(obj)) % 1000 < 500 && isFocused();
                        }
                        if (this.allowDrawCursor && z4) {
                            canvas2.save();
                            if (getVerticalOffsetMethod != null) {
                                if ((getGravity() & 112) != 48) {
                                    totalPaddingTop = ((Integer) getVerticalOffsetMethod.invoke(this, Boolean.TRUE)).intValue();
                                    canvas2.translate(getPaddingLeft(), getExtendedPaddingTop() + totalPaddingTop);
                                    Layout layout = getLayout();
                                    int lineForOffset = layout.getLineForOffset(getSelectionStart());
                                    int lineCount = layout.getLineCount();
                                    g();
                                    Rect bounds = this.gradientDrawable.getBounds();
                                    Rect rect3 = this.rect;
                                    rect3.left = bounds.left;
                                    rect3.right = bounds.left + AndroidUtilities.dp(this.cursorWidth);
                                    rect = this.rect;
                                    i10 = bounds.bottom;
                                    rect.bottom = i10;
                                    rect.top = bounds.top;
                                    f12 = this.lineSpacingExtra;
                                    if (f12 != 0.0f && lineForOffset < lineCount - 1) {
                                        rect.bottom = (int) (i10 - f12);
                                    }
                                    int centerY = rect.centerY();
                                    int i15 = this.cursorSize;
                                    rect.top = centerY - (i15 / 2);
                                    Rect rect4 = this.rect;
                                    rect4.bottom = rect4.top + i15;
                                    this.gradientDrawable.setBounds(rect4);
                                    this.gradientDrawable.draw(canvas2);
                                    canvas2.restore();
                                }
                                totalPaddingTop = 0;
                                canvas2.translate(getPaddingLeft(), getExtendedPaddingTop() + totalPaddingTop);
                                Layout layout2 = getLayout();
                                int lineForOffset2 = layout2.getLineForOffset(getSelectionStart());
                                int lineCount2 = layout2.getLineCount();
                                g();
                                Rect bounds2 = this.gradientDrawable.getBounds();
                                Rect rect32 = this.rect;
                                rect32.left = bounds2.left;
                                rect32.right = bounds2.left + AndroidUtilities.dp(this.cursorWidth);
                                rect = this.rect;
                                i10 = bounds2.bottom;
                                rect.bottom = i10;
                                rect.top = bounds2.top;
                                f12 = this.lineSpacingExtra;
                                if (f12 != 0.0f) {
                                    rect.bottom = (int) (i10 - f12);
                                }
                                int centerY2 = rect.centerY();
                                int i152 = this.cursorSize;
                                rect.top = centerY2 - (i152 / 2);
                                Rect rect42 = this.rect;
                                rect42.bottom = rect42.top + i152;
                                this.gradientDrawable.setBounds(rect42);
                                this.gradientDrawable.draw(canvas2);
                                canvas2.restore();
                            } else {
                                if ((getGravity() & 112) != 48) {
                                    totalPaddingTop = getTotalPaddingTop() - getExtendedPaddingTop();
                                    canvas2.translate(getPaddingLeft(), getExtendedPaddingTop() + totalPaddingTop);
                                    Layout layout22 = getLayout();
                                    int lineForOffset22 = layout22.getLineForOffset(getSelectionStart());
                                    int lineCount22 = layout22.getLineCount();
                                    g();
                                    Rect bounds22 = this.gradientDrawable.getBounds();
                                    Rect rect322 = this.rect;
                                    rect322.left = bounds22.left;
                                    rect322.right = bounds22.left + AndroidUtilities.dp(this.cursorWidth);
                                    rect = this.rect;
                                    i10 = bounds22.bottom;
                                    rect.bottom = i10;
                                    rect.top = bounds22.top;
                                    f12 = this.lineSpacingExtra;
                                    if (f12 != 0.0f) {
                                    }
                                    int centerY22 = rect.centerY();
                                    int i1522 = this.cursorSize;
                                    rect.top = centerY22 - (i1522 / 2);
                                    Rect rect422 = this.rect;
                                    rect422.bottom = rect422.top + i1522;
                                    this.gradientDrawable.setBounds(rect422);
                                    this.gradientDrawable.draw(canvas2);
                                    canvas2.restore();
                                }
                                totalPaddingTop = 0;
                                canvas2.translate(getPaddingLeft(), getExtendedPaddingTop() + totalPaddingTop);
                                Layout layout222 = getLayout();
                                int lineForOffset222 = layout222.getLineForOffset(getSelectionStart());
                                int lineCount222 = layout222.getLineCount();
                                g();
                                Rect bounds222 = this.gradientDrawable.getBounds();
                                Rect rect3222 = this.rect;
                                rect3222.left = bounds222.left;
                                rect3222.right = bounds222.left + AndroidUtilities.dp(this.cursorWidth);
                                rect = this.rect;
                                i10 = bounds222.bottom;
                                rect.bottom = i10;
                                rect.top = bounds222.top;
                                f12 = this.lineSpacingExtra;
                                if (f12 != 0.0f) {
                                }
                                int centerY222 = rect.centerY();
                                int i15222 = this.cursorSize;
                                rect.top = centerY222 - (i15222 / 2);
                                Rect rect4222 = this.rect;
                                rect4222.bottom = rect4222.top + i15222;
                                this.gradientDrawable.setBounds(rect4222);
                                this.gradientDrawable.draw(canvas2);
                                canvas2.restore();
                            }
                        }
                    } finally {
                        if (BuildVars.DEBUG_PRIVATE_VERSION) {
                            RuntimeException runtimeException = new RuntimeException(th);
                        }
                    }
                } else if (this.cursorDrawn && this.allowDrawCursor) {
                    try {
                        canvas2.save();
                        if (getVerticalOffsetMethod != null) {
                            if ((getGravity() & 112) != 48) {
                                totalPaddingTop2 = ((Integer) getVerticalOffsetMethod.invoke(this, Boolean.TRUE)).intValue();
                                canvas2.translate(getPaddingLeft(), getExtendedPaddingTop() + totalPaddingTop2);
                                Layout layout3 = getLayout();
                                int lineForOffset3 = layout3.getLineForOffset(getSelectionStart());
                                int lineCount3 = layout3.getLineCount();
                                g();
                                Rect bounds3 = this.gradientDrawable.getBounds();
                                Rect rect5 = this.rect;
                                rect5.left = bounds3.left;
                                rect5.right = bounds3.left + AndroidUtilities.dp(this.cursorWidth);
                                rect2 = this.rect;
                                i12 = bounds3.bottom;
                                rect2.bottom = i12;
                                rect2.top = bounds3.top;
                                f14 = this.lineSpacingExtra;
                                if (f14 != 0.0f && lineForOffset3 < lineCount3 - 1) {
                                    rect2.bottom = (int) (i12 - f14);
                                }
                                int centerY3 = rect2.centerY();
                                int i16 = this.cursorSize;
                                rect2.top = centerY3 - (i16 / 2);
                                Rect rect6 = this.rect;
                                rect6.bottom = rect6.top + i16;
                                this.gradientDrawable.setBounds(rect6);
                                this.gradientDrawable.draw(canvas2);
                                canvas2.restore();
                                this.cursorDrawn = false;
                            }
                            totalPaddingTop2 = 0;
                            canvas2.translate(getPaddingLeft(), getExtendedPaddingTop() + totalPaddingTop2);
                            Layout layout32 = getLayout();
                            int lineForOffset32 = layout32.getLineForOffset(getSelectionStart());
                            int lineCount32 = layout32.getLineCount();
                            g();
                            Rect bounds32 = this.gradientDrawable.getBounds();
                            Rect rect52 = this.rect;
                            rect52.left = bounds32.left;
                            rect52.right = bounds32.left + AndroidUtilities.dp(this.cursorWidth);
                            rect2 = this.rect;
                            i12 = bounds32.bottom;
                            rect2.bottom = i12;
                            rect2.top = bounds32.top;
                            f14 = this.lineSpacingExtra;
                            if (f14 != 0.0f) {
                                rect2.bottom = (int) (i12 - f14);
                            }
                            int centerY32 = rect2.centerY();
                            int i162 = this.cursorSize;
                            rect2.top = centerY32 - (i162 / 2);
                            Rect rect62 = this.rect;
                            rect62.bottom = rect62.top + i162;
                            this.gradientDrawable.setBounds(rect62);
                            this.gradientDrawable.draw(canvas2);
                            canvas2.restore();
                            this.cursorDrawn = false;
                        } else {
                            if ((getGravity() & 112) != 48) {
                                totalPaddingTop2 = getTotalPaddingTop() - getExtendedPaddingTop();
                                canvas2.translate(getPaddingLeft(), getExtendedPaddingTop() + totalPaddingTop2);
                                Layout layout322 = getLayout();
                                int lineForOffset322 = layout322.getLineForOffset(getSelectionStart());
                                int lineCount322 = layout322.getLineCount();
                                g();
                                Rect bounds322 = this.gradientDrawable.getBounds();
                                Rect rect522 = this.rect;
                                rect522.left = bounds322.left;
                                rect522.right = bounds322.left + AndroidUtilities.dp(this.cursorWidth);
                                rect2 = this.rect;
                                i12 = bounds322.bottom;
                                rect2.bottom = i12;
                                rect2.top = bounds322.top;
                                f14 = this.lineSpacingExtra;
                                if (f14 != 0.0f) {
                                }
                                int centerY322 = rect2.centerY();
                                int i1622 = this.cursorSize;
                                rect2.top = centerY322 - (i1622 / 2);
                                Rect rect622 = this.rect;
                                rect622.bottom = rect622.top + i1622;
                                this.gradientDrawable.setBounds(rect622);
                                this.gradientDrawable.draw(canvas2);
                                canvas2.restore();
                                this.cursorDrawn = false;
                            }
                            totalPaddingTop2 = 0;
                            canvas2.translate(getPaddingLeft(), getExtendedPaddingTop() + totalPaddingTop2);
                            Layout layout3222 = getLayout();
                            int lineForOffset3222 = layout3222.getLineForOffset(getSelectionStart());
                            int lineCount3222 = layout3222.getLineCount();
                            g();
                            Rect bounds3222 = this.gradientDrawable.getBounds();
                            Rect rect5222 = this.rect;
                            rect5222.left = bounds3222.left;
                            rect5222.right = bounds3222.left + AndroidUtilities.dp(this.cursorWidth);
                            rect2 = this.rect;
                            i12 = bounds3222.bottom;
                            rect2.bottom = i12;
                            rect2.top = bounds3222.top;
                            f14 = this.lineSpacingExtra;
                            if (f14 != 0.0f) {
                            }
                            int centerY3222 = rect2.centerY();
                            int i16222 = this.cursorSize;
                            rect2.top = centerY3222 - (i16222 / 2);
                            Rect rect6222 = this.rect;
                            rect6222.bottom = rect6222.top + i16222;
                            this.gradientDrawable.setBounds(rect6222);
                            this.gradientDrawable.draw(canvas2);
                            canvas2.restore();
                            this.cursorDrawn = false;
                        }
                    } finally {
                        if (BuildVars.DEBUG_PRIVATE_VERSION) {
                            RuntimeException runtimeException2 = new RuntimeException(th);
                        }
                    }
                }
                if (this.lineVisible && this.lineColor != 0) {
                    int dp = AndroidUtilities.dp(1.0f);
                    z10 = this.lineActive;
                    if (TextUtils.isEmpty(this.errorText)) {
                        this.linePaint.setColor(this.errorLineColor);
                        dp = AndroidUtilities.dp(f10);
                        this.lineActive = false;
                    } else if (isFocused()) {
                        this.lineActive = true;
                    } else {
                        this.linePaint.setColor(this.lineColor);
                        this.lineActive = false;
                    }
                    if (this.lineActive != z10) {
                        this.lineLastUpdateTime = SystemClock.elapsedRealtime();
                        this.lastLineActiveness = this.lineActiveness;
                    }
                    elapsedRealtime = (SystemClock.elapsedRealtime() - this.lineLastUpdateTime) / f11;
                    if (elapsedRealtime >= 1.0f || (((z11 = this.lineActive) && this.lineActiveness != 1.0f) || (!z11 && this.lineActiveness != 0.0f))) {
                        this.lineActiveness = AndroidUtilities.lerp(this.lastLineActiveness, !this.lineActive ? 1.0f : 0.0f, Math.max(0.0f, Math.min(1.0f, elapsedRealtime)));
                        if (elapsedRealtime < 1.0f) {
                            invalidate();
                        }
                    }
                    int measuredHeight = !this.lineYFix ? getMeasuredHeight() - AndroidUtilities.dp(f10) : Math.min(Math.max(0, (getPaddingTop() + (getPaddingBottom() + ((getLayout() != null ? 0 : getLayout().getHeight()) - getMeasuredHeight()))) - getScrollY()), AndroidUtilities.dp(f10)) + getScrollY() + ((int) this.lineY);
                    i11 = this.lastTouchX;
                    if (i11 < 0) {
                        i11 = getMeasuredWidth() / 2;
                    }
                    int i17 = i11;
                    int max = Math.max(i17, getMeasuredWidth() - i17) * 2;
                    if (this.lineActiveness < 1.0f) {
                        canvas2.drawRect(getScrollX(), measuredHeight - dp, getMeasuredWidth() + getScrollX(), measuredHeight, this.linePaint);
                    }
                    f13 = this.lineActiveness;
                    if (f13 <= 0.0f) {
                        float interpolation = pr.j.getInterpolation(f13);
                        boolean z13 = this.lineActive;
                        if (z13) {
                            this.activeLineWidth = max * interpolation;
                        }
                        if (z13) {
                            interpolation = 1.0f;
                        }
                        float f24 = i17;
                        canvas2 = canvas;
                        canvas2.drawRect(Math.max(0.0f, f24 - (this.activeLineWidth / f10)) + getScrollX(), measuredHeight - ((int) (interpolation * AndroidUtilities.dp(f10))), Math.min((this.activeLineWidth / f10) + f24, getMeasuredWidth()) + getScrollX(), measuredHeight, this.activeLinePaint);
                    } else {
                        canvas2 = canvas;
                    }
                }
                if (this.ellipsizeByGradient) {
                    return;
                }
                canvas2.save();
                canvas2.translate(getScrollX(), 0.0f);
                this.ellipsizePaint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                this.ellipsizeMatrix.reset();
                this.ellipsizeGradient.setLocalMatrix(this.ellipsizeMatrix);
                canvas2.drawRect(getPaddingLeft() - this.ellipsizeWidth, 0.0f, getPaddingLeft(), getHeight(), this.ellipsizePaint);
                this.ellipsizeMatrix.reset();
                this.ellipsizeMatrix.postScale(-1.0f, 1.0f, this.ellipsizeWidth / f10, 0.0f);
                this.ellipsizeMatrix.postTranslate(getWidth() - getPaddingRight(), 0.0f);
                this.ellipsizeGradient.setLocalMatrix(this.ellipsizeMatrix);
                canvas.drawRect(getWidth() - getPaddingRight(), 0.0f, (getWidth() - getPaddingRight()) + this.ellipsizeWidth, getHeight(), this.ellipsizePaint);
                canvas.restore();
                canvas.restore();
                return;
            }
        }
        f10 = 2.0f;
        f11 = 150.0f;
        if (this.ellipsizeByGradient) {
        }
        int extendedPaddingTop2 = getExtendedPaddingTop();
        this.scrollY = ConnectionsManager.DEFAULT_DATACENTER_ID;
        field2 = mScrollYField;
        if (field2 == null) {
        }
        this.ignoreTopCount = 1;
        this.ignoreBottomCount = 1;
        canvas2.save();
        canvas2.translate(0.0f, extendedPaddingTop2);
        this.drawInMaim = true;
        super.onDraw(canvas);
        this.drawInMaim = false;
        field = mScrollYField;
        if (field != null) {
            field.set(this, Integer.valueOf(i13));
        }
        canvas2.restore();
        if (this.cursorDrawable != null) {
        }
        if (this.lineVisible) {
            int dp2 = AndroidUtilities.dp(1.0f);
            z10 = this.lineActive;
            if (TextUtils.isEmpty(this.errorText)) {
            }
            if (this.lineActive != z10) {
            }
            elapsedRealtime = (SystemClock.elapsedRealtime() - this.lineLastUpdateTime) / f11;
            if (elapsedRealtime >= 1.0f) {
            }
            this.lineActiveness = AndroidUtilities.lerp(this.lastLineActiveness, !this.lineActive ? 1.0f : 0.0f, Math.max(0.0f, Math.min(1.0f, elapsedRealtime)));
            if (elapsedRealtime < 1.0f) {
            }
            int measuredHeight2 = !this.lineYFix ? getMeasuredHeight() - AndroidUtilities.dp(f10) : Math.min(Math.max(0, (getPaddingTop() + (getPaddingBottom() + ((getLayout() != null ? 0 : getLayout().getHeight()) - getMeasuredHeight()))) - getScrollY()), AndroidUtilities.dp(f10)) + getScrollY() + ((int) this.lineY);
            i11 = this.lastTouchX;
            if (i11 < 0) {
            }
            int i172 = i11;
            int max2 = Math.max(i172, getMeasuredWidth() - i172) * 2;
            if (this.lineActiveness < 1.0f) {
            }
            f13 = this.lineActiveness;
            if (f13 <= 0.0f) {
            }
        }
        if (this.ellipsizeByGradient) {
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onFocusChanged(boolean z4, int i10, Rect rect) {
        try {
            super.onFocusChanged(z4, i10, rect);
        } catch (Exception e6) {
            FileLog.e(e6);
        }
        e(true);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.EditText");
        if (this.hintLayout != null) {
            if (getText().length() <= 0) {
                accessibilityNodeInfo.setText(this.hintLayout.getText());
            } else {
                new s0.d(accessibilityNodeInfo).l(this.hintLayout.getText());
            }
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int measuredHeight = getMeasuredHeight() + (getMeasuredWidth() << 16);
        j6 j6Var = this.hintAnimatedDrawable;
        if (j6Var != null) {
            j6Var.setBounds(getPaddingLeft(), getPaddingTop(), getMeasuredWidth() - getPaddingRight(), getMeasuredHeight() - getPaddingBottom());
        }
        j6 j6Var2 = this.hintAnimatedDrawable2;
        if (j6Var2 != null) {
            j6Var2.setBounds(getPaddingLeft(), getPaddingTop(), getMeasuredWidth() - getPaddingRight(), getMeasuredHeight() - getPaddingBottom());
        }
        StaticLayout staticLayout = this.hintLayout;
        if (staticLayout == null || this.hintAnimatedDrawable != null) {
            this.lineY = getMeasuredHeight() - AndroidUtilities.dp(2.0f);
        } else {
            if (this.lastSize != measuredHeight) {
                setHintText(this.hint, false, staticLayout.getPaint());
            }
            if (this.hintLayoutYFix) {
                this.lineY = ((((((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - this.hintLayout.getHeight()) / 2.0f) + (getPaddingTop() + getExtendedPaddingTop())) + this.hintLayout.getHeight()) - AndroidUtilities.dp(1.0f);
            } else {
                this.lineY = ((getMeasuredHeight() - this.hintLayout.getHeight()) / 2.0f) + this.hintLayout.getHeight() + AndroidUtilities.dp(6.0f);
            }
        }
        this.lastSize = measuredHeight;
    }

    @Override // android.widget.TextView, android.view.View
    public void onScrollChanged(int i10, int i11, int i12, int i13) {
        super.onScrollChanged(i10, i11, i12, i13);
        if (i10 != i12) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
    }

    @Override // org.telegram.ui.Components.zt, android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        super.onTextChanged(charSequence, i10, i11, i12);
        if (!this.transformHintToHeader || this.transformHintToHeaderOnFocus) {
            return;
        }
        e(true);
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.lastTouchX = (int) motionEvent.getX();
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public boolean postDelayed(Runnable runnable, long j10) {
        if (Build.VERSION.SDK_INT < 29 || runnable == null || j10 != 500 || !BLINK_CLASS.equals(runnable.getClass().getName()) || Looper.myLooper() != Looper.getMainLooper()) {
            return super.postDelayed(runnable, j10);
        }
        lf.j d = lf.j.d();
        d.getClass();
        lf.j.c();
        int max = Math.max(1, Math.min(2, 60));
        d.h(runnable);
        lf.h e6 = d.e(max);
        if (e6.f == null) {
            e6.f = new be.b(true);
        }
        e6.f.add(runnable);
        return true;
    }

    @Override // android.view.View
    public boolean removeCallbacks(Runnable runnable) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            lf.j.d().h(runnable);
        }
        return super.removeCallbacks(runnable);
    }

    @Override // android.widget.TextView
    public void removeTextChangedListener(TextWatcher textWatcher) {
        this.registeredTextWatchers.remove(textWatcher);
        if (this.isTextWatchersSuppressed) {
            return;
        }
        super.removeTextChangedListener(textWatcher);
    }

    public void setAllowDrawCursor(boolean z4) {
        this.allowDrawCursor = z4;
        invalidate();
    }

    public void setBlurredBackgroundDrawableViewFactory(og.a aVar) {
        this.blurredBackgroundDrawableViewFactory = aVar;
    }

    public void setCursorColor(int i10) {
        ShapeDrawable shapeDrawable = this.cursorDrawable;
        if (shapeDrawable != null) {
            shapeDrawable.getPaint().setColor(i10);
        }
        GradientDrawable gradientDrawable = this.gradientDrawable;
        if (gradientDrawable != null) {
            gradientDrawable.setColor(i10);
        }
        invalidate();
    }

    public void setCursorSize(int i10) {
        this.cursorSize = i10;
    }

    public void setCursorWidth(float f10) {
        this.cursorWidth = f10;
    }

    public void setEllipsizeByGradient(boolean z4) {
        this.ellipsizeByGradient = z4;
        if (z4) {
            this.ellipsizeWidth = AndroidUtilities.dp(12.0f);
            this.ellipsizePaint = new Paint(1);
            LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, this.ellipsizeWidth, 0.0f, new int[]{-1, 16777215}, new float[]{0.4f, 1.0f}, Shader.TileMode.CLAMP);
            this.ellipsizeGradient = linearGradient;
            this.ellipsizePaint.setShader(linearGradient);
            this.ellipsizeMatrix = new Matrix();
        }
    }

    public void setErrorLineColor(int i10) {
        this.errorLineColor = i10;
        this.errorPaint.setColor(i10);
        invalidate();
    }

    public void setErrorText(CharSequence charSequence) {
        if (TextUtils.equals(charSequence, this.errorText)) {
            return;
        }
        this.errorText = charSequence;
        requestLayout();
    }

    public void setForceCursorEnd(boolean z4) {
        this.forceCursorEnd = z4;
        invalidate();
    }

    public void setHandlesColor(int i10) {
        if (Build.VERSION.SDK_INT < 29 || XiaomiUtilities.isMIUI() || this.mHandlesColor == i10) {
            return;
        }
        this.mHandlesColor = i10;
        this.mHandlesColorFilter = new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN);
        h(this.mTextSelectHandleLeft, false);
        h(this.mTextSelectHandleRight, false);
        h(this.mTextSelectHandle, false);
    }

    public void setHeaderAnimationProgress(float f10) {
        this.headerAnimationProgress = f10;
        invalidate();
    }

    public void setHeaderHintColor(int i10) {
        this.headerHintColor = i10;
        invalidate();
    }

    public void setHintColor(int i10) {
        this.hintColor = i10;
        j6 j6Var = this.hintAnimatedDrawable;
        if (j6Var != null) {
            j6Var.r(i10);
        }
        j6 j6Var2 = this.hintAnimatedDrawable2;
        if (j6Var2 != null) {
            j6Var2.r(this.hintColor);
        }
        invalidate();
    }

    public void setHintRightOffset(int i10) {
        float f10 = i10;
        if (this.rightHintOffset == f10) {
            return;
        }
        this.rightHintOffset = f10;
        invalidate();
    }

    public void setHintText(CharSequence charSequence) {
        setHintText(charSequence, false, getPaint());
    }

    public void setHintText2(CharSequence charSequence, boolean z4) {
        j6 j6Var = this.hintAnimatedDrawable2;
        if (j6Var != null) {
            j6Var.q(charSequence, !LocaleController.isRTL && z4, true);
        }
    }

    public void setHintVisible(boolean z4, boolean z10) {
        if (this.hintVisible == z4) {
            return;
        }
        this.hintLastUpdateTime = System.currentTimeMillis();
        this.hintVisible = z4;
        if (!z10) {
            this.hintAlpha = z4 ? 1.0f : 0.0f;
        }
        invalidate();
    }

    public void setLineColors(int i10, int i11, int i12) {
        this.lineVisible = true;
        getContext().getResources().getDrawable(R.drawable.search_dark).getPadding(this.padding);
        Rect rect = this.padding;
        setPadding(rect.left, rect.top, rect.right, rect.bottom);
        this.lineColor = i10;
        this.activeLineColor = i11;
        this.activeLinePaint.setColor(i11);
        this.errorLineColor = i12;
        this.errorPaint.setColor(i12);
        invalidate();
    }

    @Override // android.widget.TextView
    public void setLineSpacing(float f10, float f11) {
        super.setLineSpacing(f10, f11);
        this.lineSpacingExtra = f10;
    }

    public void setNextSetTextAnimated(boolean z4) {
        this.nextSetTextAnimated = z4;
    }

    public void setOnPremiumMenuLockClickListener(Runnable runnable) {
        this.onPremiumMenuLockClickListener = runnable;
    }

    @Override // android.widget.EditText
    public void setSelection(int i10, int i11) {
        try {
            super.setSelection(i10, i11);
        } catch (Exception e6) {
            FileLog.e(e6);
        }
    }

    public void setSupportRtlHint(boolean z4) {
        this.supportRtlHint = z4;
    }

    @Override // org.telegram.ui.Components.zt, android.widget.EditText, android.widget.TextView
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        super.setText(charSequence, bufferType);
        e(this.nextSetTextAnimated);
        this.nextSetTextAnimated = false;
    }

    @Override // android.widget.TextView
    public void setTextSelectHandle(Drawable drawable) {
        Drawable h = h(drawable, true);
        this.mTextSelectHandle = h;
        super.setTextSelectHandle(h);
    }

    @Override // android.widget.TextView
    public void setTextSelectHandleLeft(Drawable drawable) {
        Drawable h = h(drawable, true);
        this.mTextSelectHandleLeft = h;
        super.setTextSelectHandleLeft(h);
    }

    @Override // android.widget.TextView
    public void setTextSelectHandleRight(Drawable drawable) {
        Drawable h = h(drawable, true);
        this.mTextSelectHandleRight = h;
        super.setTextSelectHandleRight(h);
    }

    @Override // android.widget.TextView
    public void setTextSize(int i10, float f10) {
        j6 j6Var = this.hintAnimatedDrawable;
        if (j6Var != null) {
            j6Var.t(AndroidUtilities.dp(f10));
        }
        j6 j6Var2 = this.hintAnimatedDrawable2;
        if (j6Var2 != null) {
            j6Var2.t(AndroidUtilities.dp(f10));
        }
        super.setTextSize(i10, f10);
    }

    public void setTextWatchersSuppressed(boolean z4, boolean z10) {
        if (this.isTextWatchersSuppressed == z4) {
            return;
        }
        this.isTextWatchersSuppressed = z4;
        if (z4) {
            Iterator<TextWatcher> it = this.registeredTextWatchers.iterator();
            while (it.hasNext()) {
                super.removeTextChangedListener(it.next());
            }
            return;
        }
        for (TextWatcher textWatcher : this.registeredTextWatchers) {
            super.addTextChangedListener(textWatcher);
            if (z10) {
                textWatcher.beforeTextChanged("", 0, length(), length());
                textWatcher.onTextChanged(getText(), 0, length(), length());
                textWatcher.afterTextChanged(getText());
            }
        }
    }

    public void setTransformHintToHeader(boolean z4) {
        if (this.transformHintToHeader == z4) {
            return;
        }
        this.transformHintToHeader = z4;
        AnimatorSet animatorSet = this.headerTransformAnimation;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.headerTransformAnimation = null;
        }
    }

    public void setTransformHintToHeaderOnFocus(boolean z4) {
        if (this.transformHintToHeaderOnFocus == z4) {
            return;
        }
        this.transformHintToHeaderOnFocus = z4;
        e(false);
    }

    public void setWindowView(View view) {
        this.windowView = view;
    }

    @Override // android.view.View
    public ActionMode startActionMode(ActionMode.Callback callback) {
        if (Build.VERSION.SDK_INT < 23 || (this.windowView == null && this.attachedToWindow == null)) {
            return super.startActionMode(callback);
        }
        org.telegram.ui.ActionBar.k4 k4Var = this.floatingActionMode;
        if (k4Var != null) {
            k4Var.finish();
        }
        f();
        Context context = getContext();
        View view = this.windowView;
        if (view == null) {
            view = this.attachedToWindow;
        }
        org.telegram.ui.ActionBar.z4 z4Var = new org.telegram.ui.ActionBar.z4(context, view, getActionModeStyle(), getResourcesProvider(), this.blurredBackgroundDrawableViewFactory);
        this.floatingToolbar = z4Var;
        z4Var.j = this.onPremiumMenuLockClickListener;
        z4Var.k = new ot(this, 0);
        org.telegram.ui.ActionBar.k4 k4Var2 = new org.telegram.ui.ActionBar.k4(getContext(), new org.telegram.ui.Cells.k9(this, callback), this, this.floatingToolbar);
        this.floatingActionMode = k4Var2;
        this.floatingToolbarPreDrawListener = new pt(0, this);
        callback.onCreateActionMode(k4Var2, k4Var2.c);
        org.telegram.ui.ActionBar.k4 k4Var3 = this.floatingActionMode;
        extendActionMode(k4Var3, k4Var3.c);
        this.floatingActionMode.invalidate();
        getViewTreeObserver().addOnPreDrawListener(this.floatingToolbarPreDrawListener);
        invalidate();
        return this.floatingActionMode;
    }

    public void useAnimatedTextDrawable() {
        qt qtVar = new qt(0, this);
        this.hintAnimatedDrawable = qtVar;
        qtVar.n(true);
        this.hintAnimatedDrawable.r(this.hintColor);
        this.hintAnimatedDrawable.t(getPaint().getTextSize());
        qt qtVar2 = new qt(1, this);
        this.hintAnimatedDrawable2 = qtVar2;
        qtVar2.b = 5;
        qtVar2.r(this.hintColor);
        this.hintAnimatedDrawable2.t(getPaint().getTextSize());
    }

    public void setHintText(CharSequence charSequence, boolean z4) {
        setHintText(charSequence, z4, getPaint());
    }

    public void setHintText(CharSequence charSequence, boolean z4, TextPaint textPaint) {
        TextPaint textPaint2;
        String charSequence2;
        String charSequence3;
        boolean z10;
        CharSequence charSequence4 = charSequence;
        j6 j6Var = this.hintAnimatedDrawable;
        if (j6Var != null) {
            j6Var.q(charSequence4, !LocaleController.isRTL, true);
            return;
        }
        if (charSequence4 == null) {
            charSequence4 = "";
        }
        CharSequence charSequence5 = charSequence4;
        boolean z11 = false;
        if (getMeasuredWidth() == 0 ? false : z4) {
            if (this.hintAnimator == null) {
                this.hintAnimator = new iy0(this);
            }
            iy0 iy0Var = this.hintAnimator;
            StaticLayout staticLayout = this.hintLayout;
            CharSequence charSequence6 = this.hint;
            iy0Var.getClass();
            if (staticLayout != null && !charSequence6.equals(charSequence5)) {
                ValueAnimator valueAnimator = iy0Var.j;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                if (charSequence6.length() > charSequence5.length()) {
                    charSequence2 = charSequence6.toString();
                    charSequence3 = charSequence5.toString();
                    z10 = true;
                } else {
                    charSequence2 = charSequence5.toString();
                    charSequence3 = charSequence6.toString();
                    z10 = false;
                }
                int indexOf = charSequence2.indexOf(charSequence3);
                if (indexOf >= 0) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence2);
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(charSequence2);
                    if (indexOf != 0) {
                        spannableStringBuilder2.setSpan(new nz(z11), 0, indexOf, 0);
                    }
                    if (charSequence3.length() + indexOf != charSequence2.length()) {
                        spannableStringBuilder2.setSpan(new nz(z11), charSequence3.length() + indexOf, charSequence2.length(), 0);
                    }
                    spannableStringBuilder.setSpan(new nz(z11), indexOf, charSequence3.length() + indexOf, 0);
                    int dp = AndroidUtilities.dp(400.0f);
                    Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
                    iy0Var.b = new StaticLayout(spannableStringBuilder, textPaint, dp, alignment, 1.0f, 0.0f, false);
                    StaticLayout staticLayout2 = new StaticLayout(spannableStringBuilder2, textPaint, AndroidUtilities.dp(400.0f), alignment, 1.0f, 0.0f, false);
                    iy0Var.d = staticLayout2;
                    iy0Var.e = true;
                    iy0Var.f = z10;
                    iy0Var.h = indexOf == 0 ? 0.0f : -staticLayout2.getPrimaryHorizontal(indexOf);
                    iy0Var.c = null;
                    iy0Var.g = false;
                } else {
                    int dp2 = AndroidUtilities.dp(400.0f);
                    Layout.Alignment alignment2 = Layout.Alignment.ALIGN_NORMAL;
                    iy0Var.b = new StaticLayout(charSequence5, textPaint, dp2, alignment2, 1.0f, 0.0f, false);
                    iy0Var.c = new StaticLayout(charSequence6, textPaint, AndroidUtilities.dp(400.0f), alignment2, 1.0f, 0.0f, false);
                    iy0Var.d = null;
                    iy0Var.e = true;
                    iy0Var.g = true;
                    iy0Var.h = 0.0f;
                }
                iy0Var.i = 0.0f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                iy0Var.j = ofFloat;
                ofFloat.addUpdateListener(new k70(iy0Var, 26));
                iy0Var.j.addListener(new pd0(iy0Var, 19));
                iy0Var.j.setDuration(150L);
                iy0Var.j.setInterpolator(pr.f);
                iy0Var.j.start();
            }
        } else {
            iy0 iy0Var2 = this.hintAnimator;
            if (iy0Var2 != null) {
                ValueAnimator valueAnimator2 = iy0Var2.j;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
                iy0Var2.e = false;
            }
        }
        this.hint = charSequence5;
        if (getMeasuredWidth() != 0) {
            textPaint2 = textPaint;
            charSequence5 = TextUtils.ellipsize(charSequence5, textPaint2, getMeasuredWidth(), TextUtils.TruncateAt.END);
            StaticLayout staticLayout3 = this.hintLayout;
            if (staticLayout3 != null && TextUtils.equals(staticLayout3.getText(), charSequence5)) {
                return;
            }
        } else {
            textPaint2 = textPaint;
        }
        this.hintLayout = new StaticLayout(charSequence5, textPaint2, AndroidUtilities.dp(1000.0f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        invalidate();
    }

    @Override // android.widget.EditText
    public void setSelection(int i10) {
        try {
            super.setSelection(i10);
        } catch (Exception e6) {
            FileLog.e(e6);
        }
    }

    @Override // android.view.View
    public ActionMode startActionMode(ActionMode.Callback callback, int i10) {
        if (Build.VERSION.SDK_INT >= 23 && (this.windowView != null || this.attachedToWindow != null)) {
            return startActionMode(callback);
        }
        return super.startActionMode(callback, i10);
    }

    public void extendActionMode(ActionMode actionMode, Menu menu) {
    }
}
