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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class nk0 extends Dialog {
    public static final /* synthetic */ int P = 0;
    public ViewGroup E;
    public Drawable F;
    public gh.g G;
    public float H;
    public float I;
    public float J;
    public float K;
    public float L;
    public boolean M;
    public boolean N;
    public ValueAnimator O;
    public final Context a;
    public final org.telegram.ui.ActionBar.e6 b;
    public Bitmap c;
    public BitmapShader d;
    public Paint e;
    public Matrix f;
    public final si.b h;
    public final eh.c n;
    public float r;
    public final ai.o2 s;
    public final qt0 w;
    public f60 x;
    public FrameLayout y;

    public nk0(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, R.style.TransparentDialog);
        this.K = 1.0f;
        this.L = 1.0f;
        this.N = false;
        this.a = context;
        this.b = e6Var;
        ai.o2 o2Var = new ai.o2(25, context, this);
        this.s = o2Var;
        o2Var.setOnClickListener(new ga0(this, 7));
        qt0 qt0Var = new qt0(context, null);
        this.w = qt0Var;
        qt0Var.setClipToPadding(false);
        o2Var.addView(qt0Var, b8.mf.e(-1, -1, org.telegram.messenger.hs.E1));
        si.b bVar = new si.b();
        this.h = bVar;
        eh.c cVar = new eh.c(bVar, bVar, bVar);
        this.n = cVar;
        cVar.h = new kh.k(o2Var);
        cVar.i = o2Var;
        i9 i9Var = new i9(this, 6);
        WeakHashMap weakHashMap = r0.i0.a;
        r0.a0.i(o2Var, i9Var);
    }

    public static void d(org.telegram.messenger.n10 n10Var) {
        org.telegram.messenger.g0.l2(new p2(n10Var, 10), 15.0f);
    }

    public final void c(Runnable runnable, boolean z10) {
        ValueAnimator valueAnimator = this.O;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.r, z10 ? 1.0f : 0.0f);
        this.O = ofFloat;
        ofFloat.addUpdateListener(new y50(this, 11));
        this.O.addListener(new androidx.fragment.app.g(this, z10, runnable, 8));
        this.O.setInterpolator(xq.h);
        this.O.setDuration(350L);
        this.O.start();
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        if (this.N) {
            return;
        }
        this.N = true;
        c(new lk0(this, 1), false);
        this.s.invalidate();
    }

    public final void e(f60 f60Var) {
        int i3 = org.telegram.ui.ActionBar.k6.E8;
        org.telegram.ui.ActionBar.e6 e6Var = this.b;
        f60Var.T(org.telegram.ui.ActionBar.k6.r1(0.06f, org.telegram.ui.ActionBar.k6.w0(i3, e6Var)));
        f60Var.Q(this.n, b8.cd.k(e6Var), false);
        this.x = f60Var;
        this.E = f60Var.A;
        FrameLayout frameLayout = new FrameLayout(this.a);
        this.y = frameLayout;
        frameLayout.addView(this.E, b8.mf.c(-2.0f, -2));
        this.w.addView(this.y, b8.mf.c(-2.0f, -2));
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
    /* JADX WARN: Type inference failed for: r7v13, types: [android.graphics.Path, org.telegram.ui.Components.bq, org.telegram.ui.Components.n70] */
    /* JADX WARN: Type inference failed for: r7v17, types: [android.graphics.Path, org.telegram.ui.Components.n70] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f(org.telegram.ui.Cells.q1 q1Var, CharacterStyle characterStyle, CharSequence charSequence, boolean z10) {
        float f10;
        float f11;
        ArrayList arrayList;
        float f12;
        boolean z11;
        int i3;
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
        org.telegram.messenger.cv cvVar;
        org.telegram.messenger.ot otVar;
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
        org.telegram.messenger.zi messageObject = q1Var.getMessageObject();
        int i18 = 0;
        boolean z12 = q1Var.getExplanationLayout() != null && messageObject.J0;
        if (z12 && z10) {
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
            f11 = q1Var.getTextY() + q1Var.Gc;
            arrayList = messageObject.z2;
            f12 = messageObject.v2;
        }
        if (arrayList != null) {
            int i19 = 0;
            while (i19 < arrayList.size()) {
                org.telegram.messenger.wi wiVar = (org.telegram.messenger.wi) arrayList.get(i19);
                StaticLayout staticLayout = wiVar.e;
                if (staticLayout != null && (staticLayout.getText() instanceof Spanned)) {
                    z11 = z12;
                    CharacterStyle[] characterStyleArr = (CharacterStyle[]) ((Spanned) staticLayout.getText()).getSpans(i18, staticLayout.getText().length(), CharacterStyle.class);
                    if (characterStyleArr == null) {
                        continue;
                    } else {
                        for (int i20 = i18; i20 < characterStyleArr.length; i20++) {
                            if (characterStyleArr[i20] == characterStyle) {
                                i3 = ((Spanned) staticLayout.getText()).getSpanStart(characterStyle);
                                i11 = ((Spanned) staticLayout.getText()).getSpanEnd(characterStyle);
                                f10 += wiVar.l() ? (int) Math.ceil(f12) : 0;
                                f11 += wiVar.p(arrayList, q1Var.hb) + wiVar.f;
                                i10 = wiVar.s;
                                r15 = staticLayout;
                                if (r15 == 0 && q1Var.getDescriptionlayout() != null) {
                                    StaticLayout descriptionlayout = q1Var.getDescriptionlayout();
                                    i16 = 0;
                                    r15 = r15;
                                    while (i16 == 0) {
                                        if (descriptionlayout != null && (descriptionlayout.getText() instanceof Spanned)) {
                                            i17 = i3;
                                            CharacterStyle[] characterStyleArr2 = (CharacterStyle[]) ((Spanned) descriptionlayout.getText()).getSpans(0, descriptionlayout.getText().length(), CharacterStyle.class);
                                            if (characterStyleArr2 != null) {
                                                for (CharacterStyle characterStyle2 : characterStyleArr2) {
                                                    if (characterStyle2 == characterStyle) {
                                                        i3 = ((Spanned) descriptionlayout.getText()).getSpanStart(characterStyle);
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
                                            i17 = i3;
                                        }
                                        i3 = i17;
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
                                            i15 = i3;
                                        } else {
                                            i15 = i3;
                                            if (staticLayout2.getText() instanceof Spanned) {
                                                f16 = f10;
                                                f17 = f11;
                                                CharacterStyle[] characterStyleArr3 = (CharacterStyle[]) ((Spanned) staticLayout2.getText()).getSpans(0, staticLayout2.getText().length(), CharacterStyle.class);
                                                if (characterStyleArr3 != null) {
                                                    for (CharacterStyle characterStyle3 : characterStyleArr3) {
                                                        if (characterStyle3 == characterStyle) {
                                                            i3 = ((Spanned) staticLayout2.getText()).getSpanStart(characterStyle);
                                                            i11 = ((Spanned) staticLayout2.getText()).getSpanEnd(characterStyle);
                                                            f10 = p1Var.m;
                                                            f11 = p1Var.n;
                                                            i10 = staticLayout2.getWidth();
                                                            r15 = staticLayout2;
                                                            break;
                                                        }
                                                    }
                                                }
                                                i3 = i15;
                                                f11 = f17;
                                                f10 = f16;
                                                i14++;
                                                r15 = r15;
                                            }
                                        }
                                        f16 = f10;
                                        f17 = f11;
                                        i3 = i15;
                                        f11 = f17;
                                        f10 = f16;
                                        i14++;
                                        r15 = r15;
                                    }
                                }
                                if (r15 == 0 && messageObject != null && (cvVar = messageObject.w2) != null) {
                                    ArrayList arrayList2 = cvVar.g;
                                    if (characterStyle != null) {
                                        otVar = new org.telegram.messenger.ot();
                                        int i21 = 0;
                                        for (int i22 = 0; i22 < arrayList2.size(); i22++) {
                                            org.telegram.messenger.xt xtVar = (org.telegram.messenger.xt) arrayList2.get(i22);
                                            if (xtVar.S()) {
                                                if (xtVar.u(characterStyle, i21, otVar)) {
                                                    break;
                                                } else {
                                                    i21 = xtVar.I() + i21;
                                                }
                                            }
                                        }
                                    }
                                    otVar = null;
                                    if (otVar != null) {
                                        r15 = otVar.a;
                                        i3 = otVar.b;
                                        i11 = otVar.c;
                                        i10 = otVar.d;
                                        f10 = q1Var.getTextX() + otVar.e;
                                        f11 = q1Var.getTextY() + otVar.f;
                                    }
                                }
                                float f18 = f10;
                                int i23 = i3;
                                int i24 = i10;
                                if (r15 != 0 && z11 && !z10) {
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
                                    ?? n70Var = new n70(0);
                                    n70Var.d(r15, i23, 0.0f);
                                    r15.getSelectionPath(i23, i11, n70Var);
                                    RectF rectF2 = new RectF();
                                    n70Var.computeBounds(rectF2, true);
                                    StaticLayout h52 = org.telegram.messenger.zi.h5(charSequence, r15.getPaint(), r15.getWidth(), 1.0f, 0.0f, false, Layout.Alignment.ALIGN_NORMAL);
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
                                ?? n70Var2 = new n70(0);
                                n70Var2.c = true;
                                n70Var2.d(r62, i12, 0.0f);
                                r62.getSelectionPath(i12, i11, n70Var2);
                                n70Var2.a();
                                RectF rectF3 = new RectF();
                                n70Var2.computeBounds(rectF3, true);
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
                                        canvas.drawPath(n70Var2, paint4);
                                        bitmap = createBitmap;
                                        Paint paint5 = new Paint(3);
                                        paint5.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                                        q1Var.A3();
                                        TextPaint textPaint = new TextPaint(layout.getPaint());
                                        textPaint.set(layout.getPaint());
                                        spannableStringBuilder = new SpannableStringBuilder(p5.cloneSpans(layout.getText(), -1, textPaint.getFontMetricsInt()));
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
                                        StaticLayout h53 = org.telegram.messenger.zi.h5(spannableStringBuilder, textPaint, i24, 1.0f, f15, false, Layout.Alignment.ALIGN_NORMAL);
                                        int[] iArr = new int[2];
                                        q1Var.getLocationOnScreen(iArr);
                                        float f20 = f14;
                                        this.F = new mk0(n70Var2, new int[]{iArr[0] + ((int) f13), iArr[1] + ((int) f14)}, q1Var, iArr, bitmap, rectF3, paint5, paint, h53);
                                        int L = (int) ((org.telegram.messenger.g0.L(5.0f) / 2.0f) + iArr[0] + f13 + rectF3.left);
                                        int i26 = (int) (iArr[1] + f20 + rectF3.top);
                                        this.F.setBounds(L, i26, ((int) rectF3.width()) + L, ((int) rectF3.height()) + i26);
                                        if (charSequence == null) {
                                            float f21 = L;
                                            float width3 = rectF3.width() + f21;
                                            Point point = org.telegram.messenger.g0.q;
                                            if (width3 > point.x - org.telegram.messenger.g0.L(8.0f)) {
                                                this.I -= (rectF3.width() + f21) - (point.x - org.telegram.messenger.g0.L(8.0f));
                                            }
                                            float f22 = i26;
                                            if (rectF3.height() + f22 > ((point.y - org.telegram.messenger.g0.m) - org.telegram.messenger.g0.n) - org.telegram.messenger.g0.L(8.0f)) {
                                                this.J -= (rectF3.height() + f22) - (((point.y - org.telegram.messenger.g0.m) - org.telegram.messenger.g0.n) - org.telegram.messenger.g0.L(8.0f));
                                            }
                                            if (rectF != null) {
                                                this.K = rectF.width() / rectF3.width();
                                                this.L = rectF.height() / rectF3.height();
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
                                q1Var.A3();
                                TextPaint textPaint2 = new TextPaint(layout.getPaint());
                                textPaint2.set(layout.getPaint());
                                spannableStringBuilder = new SpannableStringBuilder(p5.cloneSpans(layout.getText(), -1, textPaint2.getFontMetricsInt()));
                                if (i12 <= 0) {
                                }
                                if (i11 < spannableStringBuilder.length()) {
                                }
                                if (messageObject.P1 >= 4) {
                                }
                                StaticLayout h532 = org.telegram.messenger.zi.h5(spannableStringBuilder, textPaint2, i24, 1.0f, f15, false, Layout.Alignment.ALIGN_NORMAL);
                                int[] iArr2 = new int[2];
                                q1Var.getLocationOnScreen(iArr2);
                                float f202 = f14;
                                this.F = new mk0(n70Var2, new int[]{iArr2[0] + ((int) f13), iArr2[1] + ((int) f14)}, q1Var, iArr2, bitmap, rectF3, paint52, paint, h532);
                                int L2 = (int) ((org.telegram.messenger.g0.L(5.0f) / 2.0f) + iArr2[0] + f13 + rectF3.left);
                                int i262 = (int) (iArr2[1] + f202 + rectF3.top);
                                this.F.setBounds(L2, i262, ((int) rectF3.width()) + L2, ((int) rectF3.height()) + i262);
                                if (charSequence == null) {
                                }
                            }
                        }
                    }
                } else {
                    z11 = z12;
                }
                i19++;
                z12 = z11;
                i18 = 0;
            }
        }
        z11 = z12;
        i3 = 0;
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
            ArrayList arrayList22 = cvVar.g;
            if (characterStyle != null) {
            }
            otVar = null;
            if (otVar != null) {
            }
        }
        float f182 = f10;
        int i232 = i3;
        int i242 = i10;
        if (r15 != 0) {
        }
        if (r15 != 0) {
        }
    }

    @Override // android.app.Dialog
    public final boolean isShowing() {
        return !this.N;
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        window.setWindowAnimations(R.style.DialogNoAnimation);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        ai.o2 o2Var = this.s;
        setContentView(o2Var, layoutParams);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.height = -1;
        attributes.gravity = org.telegram.messenger.hs.E1;
        attributes.dimAmount = 0.0f;
        int i3 = attributes.flags & (-3);
        attributes.softInputMode = 16;
        attributes.flags = i3 | (-1945959040);
        org.telegram.messenger.g0.m(attributes);
        window.setAttributes(attributes);
        o2Var.setSystemUiVisibility(256);
        org.telegram.messenger.g0.o3(o2Var, !org.telegram.ui.ActionBar.k6.I.q());
    }

    @Override // android.app.Dialog
    public final void show() {
        if (org.telegram.messenger.g0.M1(getContext())) {
            super.show();
            d(new e(this, 19));
            c(null, true);
        }
    }
}
