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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public class EditTextBoldCursor extends ot {
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
    ig.a blurredBackgroundDrawableViewFactory;
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
    public org.telegram.ui.ActionBar.g4 floatingActionMode;
    private org.telegram.ui.ActionBar.v4 floatingToolbar;
    private ViewTreeObserver.OnPreDrawListener floatingToolbarPreDrawListener;
    private boolean forceCursorEnd;
    private GradientDrawable gradientDrawable;
    private float headerAnimationProgress;
    private int headerHintColor;
    private AnimatorSet headerTransformAnimation;
    private CharSequence hint;
    private float hintAlpha;
    private i6 hintAnimatedDrawable;
    private i6 hintAnimatedDrawable2;
    private nx0 hintAnimator;
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
    private final ff.j invalidateCallback;
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
        this.invalidateCallback = new w5(this, 1);
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
        int i9 = Build.VERSION.SDK_INT;
        if (i9 >= 26) {
            setImportantForAutofill(2);
        }
        this.linePaint = new Paint();
        this.activeLinePaint = new Paint();
        TextPaint textPaint = new TextPaint(1);
        this.errorPaint = textPaint;
        textPaint.setTextSize(AndroidUtilities.dp(11.0f));
        if (i9 >= 26) {
            setImportantForAutofill(2);
        }
        if (i9 >= 29) {
            ft ftVar = new ft(this);
            this.cursorDrawable = ftVar;
            ftVar.setShape(new RectShape());
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
        } catch (Throwable th) {
            FileLog.e(th);
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

    public final void e(boolean z10) {
        boolean z11 = this.transformHintToHeader && (getText().length() > 0 || (this.transformHintToHeaderOnFocus && isFocused()));
        if (this.currentDrawHintAsHeader != z11) {
            AnimatorSet animatorSet = this.headerTransformAnimation;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.headerTransformAnimation = null;
            }
            this.currentDrawHintAsHeader = z11;
            if (z10) {
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.headerTransformAnimation = animatorSet2;
                animatorSet2.playTogether(ObjectAnimator.ofFloat(this, "headerAnimationProgress", z11 ? 1.0f : 0.0f));
                this.headerTransformAnimation.setDuration(200L);
                this.headerTransformAnimation.setInterpolator(gr.h);
                this.headerTransformAnimation.start();
            } else {
                this.headerAnimationProgress = z11 ? 1.0f : 0.0f;
            }
            invalidate();
        }
    }

    public final void f() {
        org.telegram.ui.ActionBar.v4 v4Var = this.floatingToolbar;
        if (v4Var != null) {
            v4Var.a.removeOnLayoutChangeListener(v4Var.l);
            org.telegram.ui.ActionBar.t4 t4Var = v4Var.b;
            if (!t4Var.F) {
                t4Var.G = false;
                t4Var.F = true;
                t4Var.x.cancel();
                t4Var.w.start();
                t4Var.D.setEmpty();
            }
            this.floatingToolbar = null;
        }
        if (this.floatingToolbarPreDrawListener != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.floatingToolbarPreDrawListener);
            this.floatingToolbarPreDrawListener = null;
        }
    }

    public void fixHandleView(boolean z10) {
        if (z10) {
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
            AndroidUtilities.runOnUIThread(new np(onPreDrawListener, 8), 500L);
        } catch (Throwable unused) {
        }
        this.fixed = true;
    }

    public final void g() {
        int i9;
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
            i9 = gradientDrawable.getIntrinsicWidth();
        } else {
            this.mTempRect.setEmpty();
            i9 = 0;
        }
        int scrollX = getScrollX();
        float f10 = max - scrollX;
        int width = (getWidth() - getCompoundPaddingLeft()) - getCompoundPaddingRight();
        float f11 = width;
        int i10 = f10 >= f11 - 1.0f ? (width + scrollX) - (i9 - this.mTempRect.right) : (Math.abs(f10) <= 1.0f || (TextUtils.isEmpty(getText()) && ((float) (1048576 - scrollX)) <= f11 + 1.0f && max <= 1.0f)) ? scrollX - this.mTempRect.left : ((int) max) - this.mTempRect.left;
        int dp = AndroidUtilities.dp(this.cursorWidth);
        GradientDrawable gradientDrawable2 = this.gradientDrawable;
        Rect rect = this.mTempRect;
        gradientDrawable2.setBounds(i10, lineTop - rect.top, dp + i10, lineTop2 + rect.bottom);
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

    public StaticLayout getErrorLayout(int i9) {
        if (TextUtils.isEmpty(this.errorText)) {
            return null;
        }
        return new StaticLayout(this.errorText, this.errorPaint, i9, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
    }

    @Override // android.widget.TextView
    public int getExtendedPaddingBottom() {
        int i9 = this.ignoreBottomCount;
        if (i9 == 0) {
            return super.getExtendedPaddingBottom();
        }
        this.ignoreBottomCount = i9 - 1;
        int i10 = this.scrollY;
        if (i10 != Integer.MAX_VALUE) {
            return -i10;
        }
        return 0;
    }

    @Override // android.widget.TextView
    public int getExtendedPaddingTop() {
        int i9 = this.ignoreTopCount;
        if (i9 == 0) {
            return super.getExtendedPaddingTop();
        }
        this.ignoreTopCount = i9 - 1;
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

    public org.telegram.ui.ActionBar.b6 getResourcesProvider() {
        return null;
    }

    @Override // android.widget.TextView
    public Drawable getTextCursorDrawable() {
        if (this.cursorDrawable != null) {
            return super.getTextCursorDrawable();
        }
        ft ftVar = new ft(this, new RectShape());
        ftVar.getPaint().setColor(0);
        return ftVar;
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

    public final Drawable h(Drawable drawable, boolean z10) {
        if (drawable != null) {
            if (z10) {
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

    @Override // org.telegram.ui.Components.ot, android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        try {
            super.onAttachedToWindow();
        } catch (Exception e10) {
            FileLog.e(e10);
        }
        this.attachedToWindow = getRootView();
        if (Build.VERSION.SDK_INT < 29) {
            ff.k.d().b(this.invalidateCallback, 2);
        }
    }

    @Override // org.telegram.ui.Components.ot, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.attachedToWindow = null;
        if (Build.VERSION.SDK_INT < 29) {
            ff.k.d().f(this.invalidateCallback);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(22:0|1|(4:170|(5:174|(1:276)|178|(2:180|(1:182))(2:273|(1:275))|183)|184|(2:200|(27:206|(1:208)(1:272)|209|(1:271)(1:213)|214|(3:216|(1:(1:269))(1:220)|221)(1:270)|222|(2:264|(1:266)(1:267))(4:226|(8:228|(1:230)(1:262)|231|(1:233)|234|(5:236|(1:238)(1:260)|239|(1:241)|242)(1:261)|243|(8:245|(1:247)(1:258)|248|(1:250)(1:257)|251|(1:253)|254|255))(1:263)|259|255)|256|6|(1:8)|9|10|11|(1:13)(1:163)|14|15|16|17|18|(2:22|23)|31|(5:119|120|(1:149)(2:124|(1:148)(1:128))|129|(2:132|(6:134|(4:136|137|(1:141)|142)|144|137|(2:139|141)|142)(6:145|(4:147|137|(0)|142)|144|137|(0)|142)))(2:33|(3:37|38|(6:40|(4:42|43|(1:47)|48)|50|43|(2:45|47)|48)(6:51|(4:53|43|(0)|48)|50|43|(0)|48)))|60|(17:64|(1:66)(2:110|(1:112)(1:113))|67|(1:69)|70|(4:103|(1:105)(1:109)|106|(1:108))|79|(1:81)(1:102)|82|(1:84)(1:101)|85|86|(1:88)|89|(1:91)|92|(4:94|(1:96)|(1:98)|99)(1:100))|114|(2:116|117)(1:118)))(3:192|(2:194|(1:196)(1:198))(1:199)|197))|5|6|(0)|9|10|11|(0)(0)|14|15|16|17|18|(3:20|22|23)|31|(0)(0)|60|(22:62|64|(0)(0)|67|(0)|70|(2:72|74)|103|(0)(0)|106|(0)|79|(0)(0)|82|(0)(0)|85|86|(0)|89|(0)|92|(0)(0))|114|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x0376, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x0379, code lost:
    
        if (org.telegram.messenger.BuildVars.DEBUG_PRIVATE_VERSION != false) goto L273;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x072a, code lost:
    
        throw new java.lang.RuntimeException(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x0355, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x0730, code lost:
    
        throw new java.lang.RuntimeException(r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0693  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x05ef  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x05c9  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x05aa  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x05be  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x05ad  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0564  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0699  */
    /* JADX WARN: Removed duplicated region for block: B:118:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:119:0x03a0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:139:0x044e A[Catch: all -> 0x03c2, TryCatch #0 {all -> 0x03c2, blocks: (B:120:0x03a0, B:122:0x03a4, B:124:0x03a8, B:126:0x03ba, B:129:0x03cb, B:132:0x03d1, B:134:0x03d8, B:136:0x03e0, B:137:0x0406, B:139:0x044e, B:141:0x0451, B:142:0x0456, B:145:0x03f3, B:147:0x03fb, B:149:0x03c7), top: B:119:0x03a0 }] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0345 A[Catch: Exception -> 0x0355, TryCatch #3 {Exception -> 0x0355, blocks: (B:11:0x0341, B:13:0x0345, B:163:0x0357), top: B:10:0x0341 }] */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0357 A[Catch: Exception -> 0x0355, TRY_LEAVE, TryCatch #3 {Exception -> 0x0355, blocks: (B:11:0x0341, B:13:0x0345, B:163:0x0357), top: B:10:0x0341 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0483  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x050b A[Catch: all -> 0x04ad, TryCatch #4 {all -> 0x04ad, blocks: (B:38:0x048b, B:40:0x0492, B:42:0x049a, B:43:0x04c3, B:45:0x050b, B:47:0x050e, B:48:0x0513, B:51:0x04b0, B:53:0x04b8), top: B:37:0x048b }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0556  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x057a  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x05c7  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x05e4  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x060e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0626  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0644  */
    @Override // org.telegram.ui.Components.ot, android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onDraw(Canvas canvas) {
        float f10;
        float f11;
        Field field;
        boolean z10;
        int totalPaddingTop;
        Rect rect;
        int i9;
        float f12;
        Object obj;
        boolean z11;
        float elapsedRealtime;
        int i10;
        float f13;
        boolean z12;
        int totalPaddingTop2;
        Rect rect2;
        int i11;
        float f14;
        int i12;
        Field field2;
        Canvas canvas2 = canvas;
        if (length() == 0 || this.transformHintToHeader) {
            boolean z13 = this.hintVisible;
            if ((z13 && this.hintAlpha != 1.0f) || (!z13 && this.hintAlpha != 0.0f)) {
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
            i6 i6Var = this.hintAnimatedDrawable;
            if (i6Var != null && !TextUtils.isEmpty(i6Var.g) && (this.hintVisible || this.hintAlpha != 0.0f)) {
                if (this.hintAnimatedDrawable2 == null) {
                    i6 i6Var2 = this.hintAnimatedDrawable;
                    i6Var2.H = 0.0f;
                    i6Var2.invalidateSelf();
                } else if (this.hintAnimatedDrawable2.d() + this.hintAnimatedDrawable.d() < getMeasuredWidth()) {
                    canvas2.save();
                    canvas2.translate(this.hintAnimatedDrawable.d() + (this.hintAnimatedDrawable2.d() - getMeasuredWidth()), 0.0f);
                    this.hintAnimatedDrawable2.w = (int) (Color.alpha(this.hintColor) * this.hintAlpha);
                    this.hintAnimatedDrawable2.draw(canvas2);
                    canvas2.restore();
                    i6 i6Var3 = this.hintAnimatedDrawable;
                    i6Var3.H = 0.0f;
                    i6Var3.invalidateSelf();
                } else {
                    canvas2.save();
                    canvas2.translate(this.rightHintOffset, 0.0f);
                    this.hintAnimatedDrawable2.w = (int) (Color.alpha(this.hintColor) * this.hintAlpha);
                    this.hintAnimatedDrawable2.draw(canvas2);
                    canvas2.restore();
                    i6 i6Var4 = this.hintAnimatedDrawable;
                    i6Var4.H = (this.hintAnimatedDrawable2.d() + AndroidUtilities.dp(2.0f)) - this.rightHintOffset;
                    i6Var4.invalidateSelf();
                }
                this.hintAnimatedDrawable.w = (int) (Color.alpha(this.hintColor) * this.hintAlpha);
                this.hintAnimatedDrawable.draw(canvas2);
            } else if (this.hintLayout != null && (this.hintVisible || this.hintAlpha != 0.0f)) {
                int color = getPaint().getColor();
                canvas2.save();
                float lineLeft = this.hintLayout.getLineLeft(0);
                float lineWidth = this.hintLayout.getLineWidth(0);
                int i13 = lineLeft != 0.0f ? (int) (0 - lineLeft) : 0;
                if (this.supportRtlHint && LocaleController.isRTL) {
                    float scrollX = getScrollX() + i13 + (getMeasuredWidth() - lineWidth);
                    this.hintLayoutX = scrollX;
                    float height = (this.lineY - this.hintLayout.getHeight()) - AndroidUtilities.dp(7.0f);
                    this.hintLayoutY = height;
                    canvas2.translate(scrollX, height);
                } else {
                    float scrollX2 = getScrollX() + i13 + this.hintLayoutOffset;
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
                nx0 nx0Var = this.hintAnimator;
                if (nx0Var == null || !nx0Var.e) {
                    f10 = 2.0f;
                    f11 = 150.0f;
                    Utilities.Callback2<Canvas, Runnable> callback2 = this.drawHint;
                    if (callback2 != null) {
                        callback2.run(canvas2, new zq(5, this, canvas2));
                    } else {
                        this.hintLayout.draw(canvas2);
                    }
                } else {
                    canvas2.save();
                    canvas2.clipRect(0, 0, getMeasuredWidth(), getMeasuredHeight());
                    nx0 nx0Var2 = this.hintAnimator;
                    TextPaint paint = getPaint();
                    EditTextBoldCursor editTextBoldCursor = nx0Var2.a;
                    if (nx0Var2.e) {
                        float f19 = nx0Var2.h * (nx0Var2.f ? nx0Var2.i : 1.0f - nx0Var2.i);
                        int alpha = paint.getAlpha();
                        if (nx0Var2.d != null) {
                            canvas2.save();
                            canvas2.translate(f19, 0.0f);
                            nx0Var2.d.draw(canvas2);
                            canvas2.restore();
                        }
                        if (nx0Var2.b != null) {
                            float f20 = nx0Var2.f ? 1.0f - nx0Var2.i : nx0Var2.i;
                            canvas2.save();
                            f10 = 2.0f;
                            paint.setAlpha((int) (alpha * f20));
                            canvas2.translate(f19, 0.0f);
                            if (nx0Var2.g) {
                                float f21 = (f20 * 0.1f) + 0.9f;
                                canvas2.scale(f21, f21, f19, editTextBoldCursor.getMeasuredHeight() / 2.0f);
                            }
                            nx0Var2.b.draw(canvas2);
                            canvas2.restore();
                            paint.setAlpha(alpha);
                        } else {
                            f10 = 2.0f;
                        }
                        if (nx0Var2.c != null) {
                            float f22 = nx0Var2.f ? nx0Var2.i : 1.0f - nx0Var2.i;
                            canvas2.save();
                            f11 = 150.0f;
                            paint.setAlpha((int) (alpha * (nx0Var2.f ? nx0Var2.i : 1.0f - nx0Var2.i)));
                            canvas2.translate(f19, 0.0f);
                            if (nx0Var2.g) {
                                float f23 = (f22 * 0.1f) + 0.9f;
                                canvas2.scale(f23, f23, f19, editTextBoldCursor.getMeasuredHeight() / f10);
                            }
                            nx0Var2.c.draw(canvas2);
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
                if (field != null && (i12 = this.scrollY) != Integer.MAX_VALUE) {
                    try {
                        field.set(this, Integer.valueOf(i12));
                    } catch (Exception e10) {
                        if (BuildVars.DEBUG_PRIVATE_VERSION) {
                            throw new RuntimeException(e10);
                        }
                    }
                }
                canvas2.restore();
                if (this.cursorDrawable != null) {
                    try {
                        Field field3 = mShowCursorField;
                        if (field3 == null || (obj = this.editor) == null) {
                            z10 = this.cursorDrawn;
                            this.cursorDrawn = false;
                        } else {
                            z10 = (SystemClock.uptimeMillis() - field3.getLong(obj)) % 1000 < 500 && isFocused();
                        }
                        if (this.allowDrawCursor && z10) {
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
                                    i9 = bounds.bottom;
                                    rect.bottom = i9;
                                    rect.top = bounds.top;
                                    f12 = this.lineSpacingExtra;
                                    if (f12 != 0.0f && lineForOffset < lineCount - 1) {
                                        rect.bottom = (int) (i9 - f12);
                                    }
                                    int centerY = rect.centerY();
                                    int i14 = this.cursorSize;
                                    rect.top = centerY - (i14 / 2);
                                    Rect rect4 = this.rect;
                                    rect4.bottom = rect4.top + i14;
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
                                i9 = bounds2.bottom;
                                rect.bottom = i9;
                                rect.top = bounds2.top;
                                f12 = this.lineSpacingExtra;
                                if (f12 != 0.0f) {
                                    rect.bottom = (int) (i9 - f12);
                                }
                                int centerY2 = rect.centerY();
                                int i142 = this.cursorSize;
                                rect.top = centerY2 - (i142 / 2);
                                Rect rect42 = this.rect;
                                rect42.bottom = rect42.top + i142;
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
                                    i9 = bounds22.bottom;
                                    rect.bottom = i9;
                                    rect.top = bounds22.top;
                                    f12 = this.lineSpacingExtra;
                                    if (f12 != 0.0f) {
                                    }
                                    int centerY22 = rect.centerY();
                                    int i1422 = this.cursorSize;
                                    rect.top = centerY22 - (i1422 / 2);
                                    Rect rect422 = this.rect;
                                    rect422.bottom = rect422.top + i1422;
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
                                i9 = bounds222.bottom;
                                rect.bottom = i9;
                                rect.top = bounds222.top;
                                f12 = this.lineSpacingExtra;
                                if (f12 != 0.0f) {
                                }
                                int centerY222 = rect.centerY();
                                int i14222 = this.cursorSize;
                                rect.top = centerY222 - (i14222 / 2);
                                Rect rect4222 = this.rect;
                                rect4222.bottom = rect4222.top + i14222;
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
                                i11 = bounds3.bottom;
                                rect2.bottom = i11;
                                rect2.top = bounds3.top;
                                f14 = this.lineSpacingExtra;
                                if (f14 != 0.0f && lineForOffset3 < lineCount3 - 1) {
                                    rect2.bottom = (int) (i11 - f14);
                                }
                                int centerY3 = rect2.centerY();
                                int i15 = this.cursorSize;
                                rect2.top = centerY3 - (i15 / 2);
                                Rect rect6 = this.rect;
                                rect6.bottom = rect6.top + i15;
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
                            i11 = bounds32.bottom;
                            rect2.bottom = i11;
                            rect2.top = bounds32.top;
                            f14 = this.lineSpacingExtra;
                            if (f14 != 0.0f) {
                                rect2.bottom = (int) (i11 - f14);
                            }
                            int centerY32 = rect2.centerY();
                            int i152 = this.cursorSize;
                            rect2.top = centerY32 - (i152 / 2);
                            Rect rect62 = this.rect;
                            rect62.bottom = rect62.top + i152;
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
                                i11 = bounds322.bottom;
                                rect2.bottom = i11;
                                rect2.top = bounds322.top;
                                f14 = this.lineSpacingExtra;
                                if (f14 != 0.0f) {
                                }
                                int centerY322 = rect2.centerY();
                                int i1522 = this.cursorSize;
                                rect2.top = centerY322 - (i1522 / 2);
                                Rect rect622 = this.rect;
                                rect622.bottom = rect622.top + i1522;
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
                            i11 = bounds3222.bottom;
                            rect2.bottom = i11;
                            rect2.top = bounds3222.top;
                            f14 = this.lineSpacingExtra;
                            if (f14 != 0.0f) {
                            }
                            int centerY3222 = rect2.centerY();
                            int i15222 = this.cursorSize;
                            rect2.top = centerY3222 - (i15222 / 2);
                            Rect rect6222 = this.rect;
                            rect6222.bottom = rect6222.top + i15222;
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
                    z11 = this.lineActive;
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
                    if (this.lineActive != z11) {
                        this.lineLastUpdateTime = SystemClock.elapsedRealtime();
                        this.lastLineActiveness = this.lineActiveness;
                    }
                    elapsedRealtime = (SystemClock.elapsedRealtime() - this.lineLastUpdateTime) / f11;
                    if (elapsedRealtime >= 1.0f || (((z12 = this.lineActive) && this.lineActiveness != 1.0f) || (!z12 && this.lineActiveness != 0.0f))) {
                        this.lineActiveness = AndroidUtilities.lerp(this.lastLineActiveness, !this.lineActive ? 1.0f : 0.0f, Math.max(0.0f, Math.min(1.0f, elapsedRealtime)));
                        if (elapsedRealtime < 1.0f) {
                            invalidate();
                        }
                    }
                    int measuredHeight = !this.lineYFix ? getMeasuredHeight() - AndroidUtilities.dp(f10) : Math.min(Math.max(0, (getPaddingTop() + (getPaddingBottom() + ((getLayout() != null ? 0 : getLayout().getHeight()) - getMeasuredHeight()))) - getScrollY()), AndroidUtilities.dp(f10)) + getScrollY() + ((int) this.lineY);
                    i10 = this.lastTouchX;
                    if (i10 < 0) {
                        i10 = getMeasuredWidth() / 2;
                    }
                    int i16 = i10;
                    int max = Math.max(i16, getMeasuredWidth() - i16) * 2;
                    if (this.lineActiveness < 1.0f) {
                        canvas2.drawRect(getScrollX(), measuredHeight - dp, getMeasuredWidth() + getScrollX(), measuredHeight, this.linePaint);
                    }
                    f13 = this.lineActiveness;
                    if (f13 <= 0.0f) {
                        float interpolation = gr.j.getInterpolation(f13);
                        boolean z14 = this.lineActive;
                        if (z14) {
                            this.activeLineWidth = max * interpolation;
                        }
                        if (z14) {
                            interpolation = 1.0f;
                        }
                        float f24 = i16;
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
            field.set(this, Integer.valueOf(i12));
        }
        canvas2.restore();
        if (this.cursorDrawable != null) {
        }
        if (this.lineVisible) {
            int dp2 = AndroidUtilities.dp(1.0f);
            z11 = this.lineActive;
            if (TextUtils.isEmpty(this.errorText)) {
            }
            if (this.lineActive != z11) {
            }
            elapsedRealtime = (SystemClock.elapsedRealtime() - this.lineLastUpdateTime) / f11;
            if (elapsedRealtime >= 1.0f) {
            }
            this.lineActiveness = AndroidUtilities.lerp(this.lastLineActiveness, !this.lineActive ? 1.0f : 0.0f, Math.max(0.0f, Math.min(1.0f, elapsedRealtime)));
            if (elapsedRealtime < 1.0f) {
            }
            int measuredHeight2 = !this.lineYFix ? getMeasuredHeight() - AndroidUtilities.dp(f10) : Math.min(Math.max(0, (getPaddingTop() + (getPaddingBottom() + ((getLayout() != null ? 0 : getLayout().getHeight()) - getMeasuredHeight()))) - getScrollY()), AndroidUtilities.dp(f10)) + getScrollY() + ((int) this.lineY);
            i10 = this.lastTouchX;
            if (i10 < 0) {
            }
            int i162 = i10;
            int max2 = Math.max(i162, getMeasuredWidth() - i162) * 2;
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
    public void onFocusChanged(boolean z10, int i9, Rect rect) {
        try {
            super.onFocusChanged(z10, i9, rect);
        } catch (Exception e10) {
            FileLog.e(e10);
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
    public void onMeasure(int i9, int i10) {
        super.onMeasure(i9, i10);
        int measuredHeight = getMeasuredHeight() + (getMeasuredWidth() << 16);
        i6 i6Var = this.hintAnimatedDrawable;
        if (i6Var != null) {
            i6Var.setBounds(getPaddingLeft(), getPaddingTop(), getMeasuredWidth() - getPaddingRight(), getMeasuredHeight() - getPaddingBottom());
        }
        i6 i6Var2 = this.hintAnimatedDrawable2;
        if (i6Var2 != null) {
            i6Var2.setBounds(getPaddingLeft(), getPaddingTop(), getMeasuredWidth() - getPaddingRight(), getMeasuredHeight() - getPaddingBottom());
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
    public void onScrollChanged(int i9, int i10, int i11, int i12) {
        super.onScrollChanged(i9, i10, i11, i12);
        if (i9 != i11) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
    }

    @Override // org.telegram.ui.Components.ot, android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
        super.onTextChanged(charSequence, i9, i10, i11);
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
        ff.k d = ff.k.d();
        d.getClass();
        ff.k.c();
        int max = Math.max(1, Math.min(2, 60));
        d.h(runnable);
        ff.i e10 = d.e(max);
        if (e10.f == null) {
            e10.f = new xd.b(true);
        }
        e10.f.add(runnable);
        return true;
    }

    @Override // android.view.View
    public boolean removeCallbacks(Runnable runnable) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            ff.k.d().h(runnable);
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

    public void setAllowDrawCursor(boolean z10) {
        this.allowDrawCursor = z10;
        invalidate();
    }

    public void setBlurredBackgroundDrawableViewFactory(ig.a aVar) {
        this.blurredBackgroundDrawableViewFactory = aVar;
    }

    public void setCursorColor(int i9) {
        ShapeDrawable shapeDrawable = this.cursorDrawable;
        if (shapeDrawable != null) {
            shapeDrawable.getPaint().setColor(i9);
        }
        GradientDrawable gradientDrawable = this.gradientDrawable;
        if (gradientDrawable != null) {
            gradientDrawable.setColor(i9);
        }
        invalidate();
    }

    public void setCursorSize(int i9) {
        this.cursorSize = i9;
    }

    public void setCursorWidth(float f10) {
        this.cursorWidth = f10;
    }

    public void setEllipsizeByGradient(boolean z10) {
        this.ellipsizeByGradient = z10;
        if (z10) {
            this.ellipsizeWidth = AndroidUtilities.dp(12.0f);
            this.ellipsizePaint = new Paint(1);
            LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, this.ellipsizeWidth, 0.0f, new int[]{-1, 16777215}, new float[]{0.4f, 1.0f}, Shader.TileMode.CLAMP);
            this.ellipsizeGradient = linearGradient;
            this.ellipsizePaint.setShader(linearGradient);
            this.ellipsizeMatrix = new Matrix();
        }
    }

    public void setErrorLineColor(int i9) {
        this.errorLineColor = i9;
        this.errorPaint.setColor(i9);
        invalidate();
    }

    public void setErrorText(CharSequence charSequence) {
        if (TextUtils.equals(charSequence, this.errorText)) {
            return;
        }
        this.errorText = charSequence;
        requestLayout();
    }

    public void setForceCursorEnd(boolean z10) {
        this.forceCursorEnd = z10;
        invalidate();
    }

    public void setHandlesColor(int i9) {
        if (Build.VERSION.SDK_INT < 29 || XiaomiUtilities.isMIUI() || this.mHandlesColor == i9) {
            return;
        }
        this.mHandlesColor = i9;
        this.mHandlesColorFilter = new PorterDuffColorFilter(i9, PorterDuff.Mode.SRC_IN);
        h(this.mTextSelectHandleLeft, false);
        h(this.mTextSelectHandleRight, false);
        h(this.mTextSelectHandle, false);
    }

    public void setHeaderAnimationProgress(float f10) {
        this.headerAnimationProgress = f10;
        invalidate();
    }

    public void setHeaderHintColor(int i9) {
        this.headerHintColor = i9;
        invalidate();
    }

    public void setHintColor(int i9) {
        this.hintColor = i9;
        i6 i6Var = this.hintAnimatedDrawable;
        if (i6Var != null) {
            i6Var.r(i9);
        }
        i6 i6Var2 = this.hintAnimatedDrawable2;
        if (i6Var2 != null) {
            i6Var2.r(this.hintColor);
        }
        invalidate();
    }

    public void setHintRightOffset(int i9) {
        float f10 = i9;
        if (this.rightHintOffset == f10) {
            return;
        }
        this.rightHintOffset = f10;
        invalidate();
    }

    public void setHintText(CharSequence charSequence) {
        setHintText(charSequence, false, getPaint());
    }

    public void setHintText2(CharSequence charSequence, boolean z10) {
        i6 i6Var = this.hintAnimatedDrawable2;
        if (i6Var != null) {
            i6Var.q(charSequence, !LocaleController.isRTL && z10, true);
        }
    }

    public void setHintVisible(boolean z10, boolean z11) {
        if (this.hintVisible == z10) {
            return;
        }
        this.hintLastUpdateTime = System.currentTimeMillis();
        this.hintVisible = z10;
        if (!z11) {
            this.hintAlpha = z10 ? 1.0f : 0.0f;
        }
        invalidate();
    }

    public void setLineColors(int i9, int i10, int i11) {
        this.lineVisible = true;
        getContext().getResources().getDrawable(R.drawable.search_dark).getPadding(this.padding);
        Rect rect = this.padding;
        setPadding(rect.left, rect.top, rect.right, rect.bottom);
        this.lineColor = i9;
        this.activeLineColor = i10;
        this.activeLinePaint.setColor(i10);
        this.errorLineColor = i11;
        this.errorPaint.setColor(i11);
        invalidate();
    }

    @Override // android.widget.TextView
    public void setLineSpacing(float f10, float f11) {
        super.setLineSpacing(f10, f11);
        this.lineSpacingExtra = f10;
    }

    public void setNextSetTextAnimated(boolean z10) {
        this.nextSetTextAnimated = z10;
    }

    public void setOnPremiumMenuLockClickListener(Runnable runnable) {
        this.onPremiumMenuLockClickListener = runnable;
    }

    @Override // android.widget.EditText
    public void setSelection(int i9, int i10) {
        try {
            super.setSelection(i9, i10);
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    public void setSupportRtlHint(boolean z10) {
        this.supportRtlHint = z10;
    }

    @Override // org.telegram.ui.Components.ot, android.widget.EditText, android.widget.TextView
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
    public void setTextSize(int i9, float f10) {
        i6 i6Var = this.hintAnimatedDrawable;
        if (i6Var != null) {
            i6Var.t(AndroidUtilities.dp(f10));
        }
        i6 i6Var2 = this.hintAnimatedDrawable2;
        if (i6Var2 != null) {
            i6Var2.t(AndroidUtilities.dp(f10));
        }
        super.setTextSize(i9, f10);
    }

    public void setTextWatchersSuppressed(boolean z10, boolean z11) {
        if (this.isTextWatchersSuppressed == z10) {
            return;
        }
        this.isTextWatchersSuppressed = z10;
        if (z10) {
            Iterator<TextWatcher> it = this.registeredTextWatchers.iterator();
            while (it.hasNext()) {
                super.removeTextChangedListener(it.next());
            }
            return;
        }
        for (TextWatcher textWatcher : this.registeredTextWatchers) {
            super.addTextChangedListener(textWatcher);
            if (z11) {
                textWatcher.beforeTextChanged("", 0, length(), length());
                textWatcher.onTextChanged(getText(), 0, length(), length());
                textWatcher.afterTextChanged(getText());
            }
        }
    }

    public void setTransformHintToHeader(boolean z10) {
        if (this.transformHintToHeader == z10) {
            return;
        }
        this.transformHintToHeader = z10;
        AnimatorSet animatorSet = this.headerTransformAnimation;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.headerTransformAnimation = null;
        }
    }

    public void setTransformHintToHeaderOnFocus(boolean z10) {
        if (this.transformHintToHeaderOnFocus == z10) {
            return;
        }
        this.transformHintToHeaderOnFocus = z10;
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
        org.telegram.ui.ActionBar.g4 g4Var = this.floatingActionMode;
        if (g4Var != null) {
            g4Var.finish();
        }
        f();
        Context context = getContext();
        View view = this.windowView;
        if (view == null) {
            view = this.attachedToWindow;
        }
        org.telegram.ui.ActionBar.v4 v4Var = new org.telegram.ui.ActionBar.v4(context, view, getActionModeStyle(), getResourcesProvider(), this.blurredBackgroundDrawableViewFactory);
        this.floatingToolbar = v4Var;
        v4Var.j = this.onPremiumMenuLockClickListener;
        v4Var.k = new ct(this, 0);
        org.telegram.ui.ActionBar.g4 g4Var2 = new org.telegram.ui.ActionBar.g4(getContext(), new org.telegram.ui.Cells.l9(this, callback), this, this.floatingToolbar);
        this.floatingActionMode = g4Var2;
        this.floatingToolbarPreDrawListener = new dt(0, this);
        callback.onCreateActionMode(g4Var2, g4Var2.c);
        org.telegram.ui.ActionBar.g4 g4Var3 = this.floatingActionMode;
        extendActionMode(g4Var3, g4Var3.c);
        this.floatingActionMode.invalidate();
        getViewTreeObserver().addOnPreDrawListener(this.floatingToolbarPreDrawListener);
        invalidate();
        return this.floatingActionMode;
    }

    public void useAnimatedTextDrawable() {
        et etVar = new et(0, this);
        this.hintAnimatedDrawable = etVar;
        etVar.n(true);
        this.hintAnimatedDrawable.r(this.hintColor);
        this.hintAnimatedDrawable.t(getPaint().getTextSize());
        et etVar2 = new et(1, this);
        this.hintAnimatedDrawable2 = etVar2;
        etVar2.b = 5;
        etVar2.r(this.hintColor);
        this.hintAnimatedDrawable2.t(getPaint().getTextSize());
    }

    public void setHintText(CharSequence charSequence, boolean z10) {
        setHintText(charSequence, z10, getPaint());
    }

    public void setHintText(CharSequence charSequence, boolean z10, TextPaint textPaint) {
        TextPaint textPaint2;
        String charSequence2;
        String charSequence3;
        boolean z11;
        CharSequence charSequence4 = charSequence;
        i6 i6Var = this.hintAnimatedDrawable;
        if (i6Var != null) {
            i6Var.q(charSequence4, !LocaleController.isRTL, true);
            return;
        }
        if (charSequence4 == null) {
            charSequence4 = "";
        }
        CharSequence charSequence5 = charSequence4;
        boolean z12 = false;
        if (getMeasuredWidth() == 0 ? false : z10) {
            if (this.hintAnimator == null) {
                this.hintAnimator = new nx0(this);
            }
            nx0 nx0Var = this.hintAnimator;
            StaticLayout staticLayout = this.hintLayout;
            CharSequence charSequence6 = this.hint;
            nx0Var.getClass();
            if (staticLayout != null && !charSequence6.equals(charSequence5)) {
                ValueAnimator valueAnimator = nx0Var.j;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                if (charSequence6.length() > charSequence5.length()) {
                    charSequence2 = charSequence6.toString();
                    charSequence3 = charSequence5.toString();
                    z11 = true;
                } else {
                    charSequence2 = charSequence5.toString();
                    charSequence3 = charSequence6.toString();
                    z11 = false;
                }
                int indexOf = charSequence2.indexOf(charSequence3);
                if (indexOf >= 0) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence2);
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(charSequence2);
                    if (indexOf != 0) {
                        spannableStringBuilder2.setSpan(new xy(z12), 0, indexOf, 0);
                    }
                    if (charSequence3.length() + indexOf != charSequence2.length()) {
                        spannableStringBuilder2.setSpan(new xy(z12), charSequence3.length() + indexOf, charSequence2.length(), 0);
                    }
                    spannableStringBuilder.setSpan(new xy(z12), indexOf, charSequence3.length() + indexOf, 0);
                    int dp = AndroidUtilities.dp(400.0f);
                    Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
                    nx0Var.b = new StaticLayout(spannableStringBuilder, textPaint, dp, alignment, 1.0f, 0.0f, false);
                    StaticLayout staticLayout2 = new StaticLayout(spannableStringBuilder2, textPaint, AndroidUtilities.dp(400.0f), alignment, 1.0f, 0.0f, false);
                    nx0Var.d = staticLayout2;
                    nx0Var.e = true;
                    nx0Var.f = z11;
                    nx0Var.h = indexOf == 0 ? 0.0f : -staticLayout2.getPrimaryHorizontal(indexOf);
                    nx0Var.c = null;
                    nx0Var.g = false;
                } else {
                    int dp2 = AndroidUtilities.dp(400.0f);
                    Layout.Alignment alignment2 = Layout.Alignment.ALIGN_NORMAL;
                    nx0Var.b = new StaticLayout(charSequence5, textPaint, dp2, alignment2, 1.0f, 0.0f, false);
                    nx0Var.c = new StaticLayout(charSequence6, textPaint, AndroidUtilities.dp(400.0f), alignment2, 1.0f, 0.0f, false);
                    nx0Var.d = null;
                    nx0Var.e = true;
                    nx0Var.g = true;
                    nx0Var.h = 0.0f;
                }
                nx0Var.i = 0.0f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                nx0Var.j = ofFloat;
                int i9 = 26;
                ofFloat.addUpdateListener(new q60(nx0Var, i9));
                nx0Var.j.addListener(new r60(nx0Var, i9));
                nx0Var.j.setDuration(150L);
                nx0Var.j.setInterpolator(gr.f);
                nx0Var.j.start();
            }
        } else {
            nx0 nx0Var2 = this.hintAnimator;
            if (nx0Var2 != null) {
                ValueAnimator valueAnimator2 = nx0Var2.j;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
                nx0Var2.e = false;
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
    public void setSelection(int i9) {
        try {
            super.setSelection(i9);
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    @Override // android.view.View
    public ActionMode startActionMode(ActionMode.Callback callback, int i9) {
        if (Build.VERSION.SDK_INT >= 23 && (this.windowView != null || this.attachedToWindow != null)) {
            return startActionMode(callback);
        }
        return super.startActionMode(callback, i9);
    }

    public void extendActionMode(ActionMode actionMode, Menu menu) {
    }
}
