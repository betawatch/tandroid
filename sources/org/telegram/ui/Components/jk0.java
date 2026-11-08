package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.app.Dialog;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.CornerPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.ForegroundColorSpan;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.WeakHashMap;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class jk0 extends Dialog {
    public static final /* synthetic */ int O = 0;
    public ViewGroup D;
    public Drawable E;
    public fh.g F;
    public float G;
    public float H;
    public float I;
    public float J;
    public float K;
    public boolean L;
    public boolean M;
    public ValueAnimator N;
    public final Context a;
    public final org.telegram.ui.ActionBar.f6 b;
    public Bitmap c;
    public BitmapShader d;
    public Paint e;
    public Matrix f;
    public final ri.b h;
    public final dh.c n;
    public float r;
    public final bi.e5 s;
    public final rt0 w;
    public k60 x;
    public FrameLayout y;

    public jk0(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, R.style.TransparentDialog);
        this.J = 1.0f;
        this.K = 1.0f;
        this.M = false;
        this.a = context;
        this.b = f6Var;
        bi.e5 e5Var = new bi.e5(23, context, this);
        this.s = e5Var;
        e5Var.setOnClickListener(new la0(this, 6));
        rt0 rt0Var = new rt0(context, null);
        this.w = rt0Var;
        rt0Var.setClipToPadding(false);
        e5Var.addView(rt0Var, c8.ha.e(-1, -1, org.telegram.messenger.qs.E1));
        ri.b bVar = new ri.b();
        this.h = bVar;
        dh.c cVar = new dh.c(bVar, bVar, bVar);
        this.n = cVar;
        cVar.h = new jh.k(e5Var);
        cVar.i = e5Var;
        rt rtVar = new rt(this, 3);
        WeakHashMap weakHashMap = r0.i0.a;
        r0.a0.i(e5Var, rtVar);
    }

    public static void d(org.telegram.messenger.v10 v10Var) {
        org.telegram.messenger.g0.l2(new s2(v10Var, 10), 15.0f);
    }

    public final void c(Runnable runnable, boolean z9) {
        ValueAnimator valueAnimator = this.N;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.r, z9 ? 1.0f : 0.0f);
        this.N = ofFloat;
        ofFloat.addUpdateListener(new c60(this, 10));
        this.N.addListener(new ai.g0(this, z9, runnable, 8));
        this.N.setInterpolator(xq.h);
        this.N.setDuration(350L);
        this.N.start();
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        if (this.M) {
            return;
        }
        this.M = true;
        c(new hk0(this, 1), false);
        this.s.invalidate();
    }

    public final void e(k60 k60Var) {
        int i7 = org.telegram.ui.ActionBar.k6.E8;
        org.telegram.ui.ActionBar.f6 f6Var = this.b;
        k60Var.T(org.telegram.ui.ActionBar.k6.r1(0.06f, org.telegram.ui.ActionBar.k6.w0(i7, f6Var)));
        k60Var.Q(this.n, c8.g0.k(f6Var), false);
        this.x = k60Var;
        this.D = k60Var.A;
        FrameLayout frameLayout = new FrameLayout(this.a);
        this.y = frameLayout;
        frameLayout.addView(this.D, c8.ha.c(-2.0f, -2));
        this.w.addView(this.y, c8.ha.c(-2.0f, -2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x03de  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x03ef  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0400  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0465  */
    /* JADX WARN: Removed duplicated region for block: B:164:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:165:0x03e8  */
    /* JADX WARN: Removed duplicated region for block: B:171:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x017a  */
    /* JADX WARN: Type inference failed for: r10v14, types: [android.graphics.Canvas] */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v10 */
    /* JADX WARN: Type inference failed for: r15v12 */
    /* JADX WARN: Type inference failed for: r15v13 */
    /* JADX WARN: Type inference failed for: r15v14 */
    /* JADX WARN: Type inference failed for: r15v16 */
    /* JADX WARN: Type inference failed for: r15v17 */
    /* JADX WARN: Type inference failed for: r15v19 */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r15v20 */
    /* JADX WARN: Type inference failed for: r15v21 */
    /* JADX WARN: Type inference failed for: r15v22 */
    /* JADX WARN: Type inference failed for: r15v23 */
    /* JADX WARN: Type inference failed for: r15v3 */
    /* JADX WARN: Type inference failed for: r15v4, types: [android.text.Layout, android.text.StaticLayout] */
    /* JADX WARN: Type inference failed for: r15v9, types: [android.text.StaticLayout] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11, types: [android.text.Layout] */
    /* JADX WARN: Type inference failed for: r6v59 */
    /* JADX WARN: Type inference failed for: r7v13, types: [android.graphics.Path, org.telegram.ui.Components.aq, org.telegram.ui.Components.r70] */
    /* JADX WARN: Type inference failed for: r7v17, types: [android.graphics.Path, org.telegram.ui.Components.r70] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f(org.telegram.ui.Cells.q1 q1Var, CharacterStyle characterStyle, CharSequence charSequence, boolean z9) {
        float f10;
        float f11;
        ArrayList arrayList;
        float f12;
        boolean z10;
        int i7;
        int i10;
        int i11;
        ?? r15;
        float f13;
        int i12;
        ?? r62;
        float f14;
        RectF rectF;
        Paint paint;
        Layout layout;
        float f15;
        Bitmap bitmap;
        SpannableStringBuilder spannableStringBuilder;
        int i13;
        org.telegram.messenger.kv kvVar;
        org.telegram.messenger.wt wtVar;
        ArrayList<org.telegram.ui.Cells.p1> pollButtons;
        int i14;
        int i15;
        float f16;
        float f17;
        int i16;
        int i17;
        if (q1Var == null) {
            return;
        }
        q1Var.getCurrentMessagesGroup();
        org.telegram.messenger.ij messageObject = q1Var.getMessageObject();
        int i18 = 0;
        boolean z11 = q1Var.getExplanationLayout() != null && messageObject.J0;
        if (z11 && z9) {
            f10 = q1Var.getExplanationX();
            f11 = q1Var.getExplanationY();
            arrayList = q1Var.getExplanationLayout().e;
            f12 = q1Var.getExplanationLayout().d;
        } else if (q1Var.getCaptionLayout() != null) {
            f10 = q1Var.getCaptionX();
            f11 = q1Var.getCaptionY();
            arrayList = q1Var.getCaptionLayout().e;
            f12 = q1Var.getCaptionLayout().d;
        } else {
            f10 = 0.0f;
            f11 = 0.0f;
            arrayList = null;
            f12 = 0.0f;
        }
        if (arrayList == null) {
            f10 = q1Var.getTextX();
            f11 = q1Var.getTextY() + q1Var.Hc;
            arrayList = messageObject.z2;
            f12 = messageObject.v2;
        }
        if (arrayList != null) {
            int i19 = 0;
            while (i19 < arrayList.size()) {
                org.telegram.messenger.fj fjVar = (org.telegram.messenger.fj) arrayList.get(i19);
                StaticLayout staticLayout = fjVar.e;
                if (staticLayout != null && (staticLayout.getText() instanceof Spanned)) {
                    z10 = z11;
                    CharacterStyle[] characterStyleArr = (CharacterStyle[]) ((Spanned) staticLayout.getText()).getSpans(i18, staticLayout.getText().length(), CharacterStyle.class);
                    if (characterStyleArr == null) {
                        continue;
                    } else {
                        for (int i20 = i18; i20 < characterStyleArr.length; i20++) {
                            if (characterStyleArr[i20] == characterStyle) {
                                i7 = ((Spanned) staticLayout.getText()).getSpanStart(characterStyle);
                                i11 = ((Spanned) staticLayout.getText()).getSpanEnd(characterStyle);
                                f10 += fjVar.l() ? (int) Math.ceil(f12) : 0;
                                f11 += fjVar.p(arrayList, q1Var.hb) + fjVar.f;
                                i10 = fjVar.s;
                                r15 = staticLayout;
                                if (r15 == 0 && q1Var.getDescriptionlayout() != null) {
                                    StaticLayout descriptionlayout = q1Var.getDescriptionlayout();
                                    i16 = 0;
                                    r15 = r15;
                                    while (i16 == 0) {
                                        if (descriptionlayout != null && (descriptionlayout.getText() instanceof Spanned)) {
                                            i17 = i7;
                                            CharacterStyle[] characterStyleArr2 = (CharacterStyle[]) ((Spanned) descriptionlayout.getText()).getSpans(0, descriptionlayout.getText().length(), CharacterStyle.class);
                                            if (characterStyleArr2 != null) {
                                                for (CharacterStyle characterStyle2 : characterStyleArr2) {
                                                    if (characterStyle2 == characterStyle) {
                                                        i7 = ((Spanned) descriptionlayout.getText()).getSpanStart(characterStyle);
                                                        i11 = ((Spanned) descriptionlayout.getText()).getSpanEnd(characterStyle);
                                                        f10 = q1Var.getDescriptionLayoutX();
                                                        f11 = q1Var.getDescriptionLayoutY();
                                                        i10 = descriptionlayout.getWidth();
                                                        r15 = descriptionlayout;
                                                        break;
                                                    }
                                                }
                                            }
                                        } else {
                                            i17 = i7;
                                        }
                                        i7 = i17;
                                        i16++;
                                        r15 = r15;
                                    }
                                }
                                if (r15 == 0 && ((messageObject.E4() || messageObject.U3()) && (pollButtons = q1Var.getPollButtons()) != null)) {
                                    i14 = 0;
                                    r15 = r15;
                                    while (i14 < pollButtons.size()) {
                                        org.telegram.ui.Cells.p1 p1Var = pollButtons.get(i14);
                                        StaticLayout staticLayout2 = p1Var.p;
                                        if (staticLayout2 == null) {
                                            i15 = i7;
                                        } else {
                                            i15 = i7;
                                            if (staticLayout2.getText() instanceof Spanned) {
                                                f16 = f10;
                                                f17 = f11;
                                                CharacterStyle[] characterStyleArr3 = (CharacterStyle[]) ((Spanned) staticLayout2.getText()).getSpans(0, staticLayout2.getText().length(), CharacterStyle.class);
                                                if (characterStyleArr3 != null) {
                                                    for (CharacterStyle characterStyle3 : characterStyleArr3) {
                                                        if (characterStyle3 == characterStyle) {
                                                            i7 = ((Spanned) staticLayout2.getText()).getSpanStart(characterStyle);
                                                            i11 = ((Spanned) staticLayout2.getText()).getSpanEnd(characterStyle);
                                                            f10 = p1Var.m;
                                                            f11 = p1Var.n;
                                                            i10 = staticLayout2.getWidth();
                                                            r15 = staticLayout2;
                                                            break;
                                                        }
                                                    }
                                                }
                                                i7 = i15;
                                                f11 = f17;
                                                f10 = f16;
                                                i14++;
                                                r15 = r15;
                                            }
                                        }
                                        f16 = f10;
                                        f17 = f11;
                                        i7 = i15;
                                        f11 = f17;
                                        f10 = f16;
                                        i14++;
                                        r15 = r15;
                                    }
                                }
                                if (r15 == 0 && messageObject != null && (kvVar = messageObject.w2) != null) {
                                    ArrayList arrayList2 = kvVar.g;
                                    if (characterStyle != null) {
                                        wtVar = new org.telegram.messenger.wt();
                                        int i21 = 0;
                                        for (int i22 = 0; i22 < arrayList2.size(); i22++) {
                                            org.telegram.messenger.fu fuVar = (org.telegram.messenger.fu) arrayList2.get(i22);
                                            if (fuVar.S()) {
                                                if (fuVar.u(characterStyle, i21, wtVar)) {
                                                    break;
                                                } else {
                                                    i21 = fuVar.I() + i21;
                                                }
                                            }
                                        }
                                    }
                                    wtVar = null;
                                    if (wtVar != null) {
                                        r15 = wtVar.a;
                                        i7 = wtVar.b;
                                        i11 = wtVar.c;
                                        i10 = wtVar.d;
                                        f10 = q1Var.getTextX() + wtVar.e;
                                        f11 = q1Var.getTextY() + wtVar.f;
                                    }
                                }
                                float f18 = f10;
                                int i23 = i7;
                                int i24 = i10;
                                if (r15 != 0 && z10 && !z9) {
                                    f(q1Var, characterStyle, charSequence, true);
                                    return;
                                }
                                if (r15 != 0) {
                                    return;
                                }
                                if (charSequence != null) {
                                    int lineForOffset = r15.getLineForOffset(i23);
                                    float lineTop = f11 + r15.getLineTop(lineForOffset);
                                    float primaryHorizontal = r15.getPrimaryHorizontal(i23);
                                    float lineWidth = r15.getLineWidth(lineForOffset);
                                    ?? r70Var = new r70(0);
                                    r70Var.d(r15, i23, 0.0f);
                                    r15.getSelectionPath(i23, i11, r70Var);
                                    RectF rectF2 = new RectF();
                                    r70Var.computeBounds(rectF2, true);
                                    StaticLayout h52 = org.telegram.messenger.ij.h5(charSequence, r15.getPaint(), r15.getWidth(), 1.0f, 0.0f, false, Layout.Alignment.ALIGN_NORMAL);
                                    i11 = charSequence.length();
                                    float width = h52.getWidth();
                                    float f19 = 0.0f;
                                    for (int i25 = 0; i25 < h52.getLineCount(); i25++) {
                                        width = Math.min(width, h52.getLineLeft(i25));
                                        f19 = Math.max(f19, h52.getLineRight(i25));
                                    }
                                    float max = f18 + Math.max(0.0f, Math.min(primaryHorizontal, lineWidth - Math.max(0.0f, f19 - width)));
                                    f14 = lineTop;
                                    rectF = rectF2;
                                    f13 = max;
                                    i12 = 0;
                                    r62 = h52;
                                } else {
                                    Object obj = r15;
                                    f13 = f18;
                                    i12 = i23;
                                    r62 = obj;
                                    f14 = f11;
                                    rectF = null;
                                }
                                Paint paint2 = new Paint(1);
                                paint2.setColor(org.telegram.ui.ActionBar.k6.w0(messageObject.Q3() ? org.telegram.ui.ActionBar.k6.ob : org.telegram.ui.ActionBar.k6.ra, this.b));
                                paint2.setPathEffect(new CornerPathEffect(org.telegram.messenger.g0.L(5.0f)));
                                ?? r70Var2 = new r70(0);
                                r70Var2.c = true;
                                r70Var2.d(r62, i12, 0.0f);
                                r62.getSelectionPath(i12, i11, r70Var2);
                                r70Var2.a();
                                RectF rectF3 = new RectF();
                                r70Var2.computeBounds(rectF3, true);
                                int width2 = (int) (rectF3.width() + org.telegram.messenger.g0.L(5.0f));
                                if (!q1Var.L0() || width2 <= 0) {
                                    paint = paint2;
                                    layout = r62;
                                    f15 = 0.0f;
                                } else {
                                    f15 = 0.0f;
                                    if (rectF3.height() > 0.0f) {
                                        Bitmap createBitmap = Bitmap.createBitmap(width2, (int) rectF3.height(), Bitmap.Config.ALPHA_8);
                                        ?? canvas = new Canvas(createBitmap);
                                        paint = paint2;
                                        layout = r62;
                                        Paint paint3 = new Paint(1);
                                        paint3.setColor(-1);
                                        canvas.drawRect(0.0f, 0.0f, width2, rectF3.height(), paint3);
                                        Paint paint4 = new Paint(1);
                                        paint4.setColor(-1);
                                        paint4.setPathEffect(new CornerPathEffect(org.telegram.messenger.g0.L(5.0f)));
                                        paint4.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                                        canvas.translate(-rectF3.left, -rectF3.top);
                                        canvas.drawPath(r70Var2, paint4);
                                        bitmap = createBitmap;
                                        Paint paint5 = new Paint(3);
                                        paint5.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                                        q1Var.C3();
                                        TextPaint textPaint = new TextPaint(layout.getPaint());
                                        textPaint.set(layout.getPaint());
                                        spannableStringBuilder = new SpannableStringBuilder(r5.cloneSpans(layout.getText(), -1, textPaint.getFontMetricsInt()));
                                        if (i12 <= 0) {
                                            i13 = 0;
                                            spannableStringBuilder.setSpan(new ForegroundColorSpan(0), 0, i12, 33);
                                        } else {
                                            i13 = 0;
                                        }
                                        if (i11 < spannableStringBuilder.length()) {
                                            spannableStringBuilder.setSpan(new ForegroundColorSpan(i13), i11, spannableStringBuilder.length(), 33);
                                        }
                                        if (messageObject.P1 >= 4) {
                                            f15 = -1.0f;
                                        }
                                        StaticLayout h53 = org.telegram.messenger.ij.h5(spannableStringBuilder, textPaint, i24, 1.0f, f15, false, Layout.Alignment.ALIGN_NORMAL);
                                        int[] iArr = new int[2];
                                        q1Var.getLocationOnScreen(iArr);
                                        float f20 = f14;
                                        this.E = new ik0(r70Var2, new int[]{iArr[0] + ((int) f13), iArr[1] + ((int) f14)}, q1Var, iArr, bitmap, rectF3, paint5, paint, h53);
                                        int L = (int) ((org.telegram.messenger.g0.L(5.0f) / 2.0f) + iArr[0] + f13 + rectF3.left);
                                        int i26 = (int) (iArr[1] + f20 + rectF3.top);
                                        this.E.setBounds(L, i26, ((int) rectF3.width()) + L, ((int) rectF3.height()) + i26);
                                        if (charSequence == null) {
                                            float f21 = L;
                                            float width3 = rectF3.width() + f21;
                                            Point point = org.telegram.messenger.g0.q;
                                            if (width3 > point.x - org.telegram.messenger.g0.L(8.0f)) {
                                                this.H -= (rectF3.width() + f21) - (point.x - org.telegram.messenger.g0.L(8.0f));
                                            }
                                            float f22 = i26;
                                            if (rectF3.height() + f22 > ((point.y - org.telegram.messenger.g0.m) - org.telegram.messenger.g0.n) - org.telegram.messenger.g0.L(8.0f)) {
                                                this.I -= (rectF3.height() + f22) - (((point.y - org.telegram.messenger.g0.m) - org.telegram.messenger.g0.n) - org.telegram.messenger.g0.L(8.0f));
                                            }
                                            if (rectF != null) {
                                                this.J = rectF.width() / rectF3.width();
                                                this.K = rectF.height() / rectF3.height();
                                                return;
                                            }
                                            return;
                                        }
                                        return;
                                    }
                                    paint = paint2;
                                    layout = r62;
                                }
                                bitmap = null;
                                Paint paint52 = new Paint(3);
                                paint52.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                                q1Var.C3();
                                TextPaint textPaint2 = new TextPaint(layout.getPaint());
                                textPaint2.set(layout.getPaint());
                                spannableStringBuilder = new SpannableStringBuilder(r5.cloneSpans(layout.getText(), -1, textPaint2.getFontMetricsInt()));
                                if (i12 <= 0) {
                                }
                                if (i11 < spannableStringBuilder.length()) {
                                }
                                if (messageObject.P1 >= 4) {
                                }
                                StaticLayout h532 = org.telegram.messenger.ij.h5(spannableStringBuilder, textPaint2, i24, 1.0f, f15, false, Layout.Alignment.ALIGN_NORMAL);
                                int[] iArr2 = new int[2];
                                q1Var.getLocationOnScreen(iArr2);
                                float f202 = f14;
                                this.E = new ik0(r70Var2, new int[]{iArr2[0] + ((int) f13), iArr2[1] + ((int) f14)}, q1Var, iArr2, bitmap, rectF3, paint52, paint, h532);
                                int L2 = (int) ((org.telegram.messenger.g0.L(5.0f) / 2.0f) + iArr2[0] + f13 + rectF3.left);
                                int i262 = (int) (iArr2[1] + f202 + rectF3.top);
                                this.E.setBounds(L2, i262, ((int) rectF3.width()) + L2, ((int) rectF3.height()) + i262);
                                if (charSequence == null) {
                                }
                            }
                        }
                    }
                } else {
                    z10 = z11;
                }
                i19++;
                z11 = z10;
                i18 = 0;
            }
        }
        z10 = z11;
        i7 = 0;
        i10 = 0;
        i11 = 0;
        r15 = 0;
        if (r15 == 0) {
            StaticLayout descriptionlayout2 = q1Var.getDescriptionlayout();
            i16 = 0;
            r15 = r15;
            while (i16 == 0) {
            }
        }
        if (r15 == 0) {
            i14 = 0;
            r15 = r15;
            while (i14 < pollButtons.size()) {
            }
        }
        if (r15 == 0) {
            ArrayList arrayList22 = kvVar.g;
            if (characterStyle != null) {
            }
            wtVar = null;
            if (wtVar != null) {
            }
        }
        float f182 = f10;
        int i232 = i7;
        int i242 = i10;
        if (r15 != 0) {
        }
        if (r15 != 0) {
        }
    }

    @Override // android.app.Dialog
    public final boolean isShowing() {
        return !this.M;
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        window.setWindowAnimations(R.style.DialogNoAnimation);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        bi.e5 e5Var = this.s;
        setContentView(e5Var, layoutParams);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.height = -1;
        attributes.gravity = org.telegram.messenger.qs.E1;
        attributes.dimAmount = 0.0f;
        int i7 = attributes.flags & (-3);
        attributes.softInputMode = 16;
        attributes.flags = i7 | (-1945959040);
        org.telegram.messenger.g0.m(attributes);
        window.setAttributes(attributes);
        e5Var.setSystemUiVisibility(256);
        org.telegram.messenger.g0.o3(e5Var, !org.telegram.ui.ActionBar.k6.I.q());
    }

    @Override // android.app.Dialog
    public final void show() {
        if (org.telegram.messenger.g0.M1(getContext())) {
            super.show();
            d(new d(this, 19));
            c(null, true);
        }
    }
}
