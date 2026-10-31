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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class nl0 extends Dialog {
    public static final /* synthetic */ int O = 0;
    public ViewGroup D;
    public Drawable E;
    public vg.f F;
    public float G;
    public float H;
    public float I;
    public float J;
    public float K;
    public boolean L;
    public boolean M;
    public ValueAnimator N;
    public final Context a;
    public final org.telegram.ui.ActionBar.p6 b;
    public Bitmap c;
    public BitmapShader d;
    public Paint e;
    public Matrix f;
    public final hi.b h;
    public final tg.b n;
    public float r;
    public final jg.l0 s;
    public final uu0 w;
    public z60 x;
    public FrameLayout y;

    public nl0(Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context, R.style.TransparentDialog);
        this.J = 1.0f;
        this.K = 1.0f;
        this.M = false;
        this.a = context;
        this.b = p6Var;
        jg.l0 l0Var = new jg.l0(this, context, 22);
        this.s = l0Var;
        l0Var.setOnClickListener(new db0(this, 7));
        uu0 uu0Var = new uu0(context, null);
        this.w = uu0Var;
        uu0Var.setClipToPadding(false);
        l0Var.addView(uu0Var, w7.b6.e(-1, -1, org.telegram.messenger.zs.E1));
        hi.b bVar = new hi.b();
        this.h = bVar;
        tg.b bVar2 = new tg.b(bVar);
        this.n = bVar2;
        bVar2.f = new zg.h(l0Var);
        bVar2.g = l0Var;
        k2.m0 m0Var = new k2.m0(this);
        WeakHashMap weakHashMap = r0.h0.a;
        r0.z.i(l0Var, m0Var);
    }

    public static void d(org.telegram.messenger.j20 j20Var) {
        org.telegram.messenger.i0.l2(new r2(j20Var, 10), 15.0f);
    }

    public final void c(Runnable runnable, boolean z10) {
        ValueAnimator valueAnimator = this.N;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.r, z10 ? 1.0f : 0.0f);
        this.N = ofFloat;
        ofFloat.addUpdateListener(new r60(this, 11));
        this.N.addListener(new androidx.fragment.app.g(this, z10, runnable, 5));
        this.N.setInterpolator(gr.h);
        this.N.setDuration(350L);
        this.N.start();
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        if (this.M) {
            return;
        }
        this.M = true;
        c(new ll0(this, 1), false);
        this.s.invalidate();
    }

    public final void e(z60 z60Var) {
        int i10 = org.telegram.ui.ActionBar.t6.E8;
        org.telegram.ui.ActionBar.p6 p6Var = this.b;
        z60Var.T(org.telegram.ui.ActionBar.t6.r1(0.06f, org.telegram.ui.ActionBar.t6.w0(i10, p6Var)));
        z60Var.R(this.n, w7.b9.k(p6Var), false);
        this.x = z60Var;
        this.D = z60Var.A;
        FrameLayout frameLayout = new FrameLayout(this.a);
        this.y = frameLayout;
        frameLayout.addView(this.D, w7.b6.c(-2.0f, -2));
        this.w.addView(this.y, w7.b6.c(-2.0f, -2));
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
    /* JADX WARN: Type inference failed for: r7v13, types: [android.graphics.Path, org.telegram.ui.Components.jq, org.telegram.ui.Components.k80] */
    /* JADX WARN: Type inference failed for: r7v17, types: [android.graphics.Path, org.telegram.ui.Components.k80] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f(org.telegram.ui.Cells.q1 q1Var, CharacterStyle characterStyle, CharSequence charSequence, boolean z10) {
        float f7;
        float f10;
        ArrayList arrayList;
        float f11;
        boolean z11;
        int i10;
        int i11;
        int i12;
        ?? r15;
        float f12;
        int i13;
        ?? r62;
        float f13;
        RectF rectF;
        Paint paint;
        Layout layout;
        float f14;
        Bitmap bitmap;
        SpannableStringBuilder spannableStringBuilder;
        int i14;
        org.telegram.messenger.vv vvVar;
        org.telegram.messenger.hu huVar;
        ArrayList<org.telegram.ui.Cells.p1> pollButtons;
        int i15;
        int i16;
        float f15;
        float f16;
        int i17;
        int i18;
        if (q1Var == null) {
            return;
        }
        q1Var.getCurrentMessagesGroup();
        org.telegram.messenger.jj messageObject = q1Var.getMessageObject();
        int i19 = 0;
        boolean z12 = q1Var.getExplanationLayout() != null && messageObject.J0;
        if (z12 && z10) {
            f7 = q1Var.getExplanationX();
            f10 = q1Var.getExplanationY();
            arrayList = q1Var.getExplanationLayout().e;
            f11 = q1Var.getExplanationLayout().d;
        } else if (q1Var.getCaptionLayout() != null) {
            f7 = q1Var.getCaptionX();
            f10 = q1Var.getCaptionY();
            arrayList = q1Var.getCaptionLayout().e;
            f11 = q1Var.getCaptionLayout().d;
        } else {
            f7 = 0.0f;
            f10 = 0.0f;
            arrayList = null;
            f11 = 0.0f;
        }
        if (arrayList == null) {
            f7 = q1Var.getTextX();
            f10 = q1Var.getTextY() + q1Var.Fc;
            arrayList = messageObject.z2;
            f11 = messageObject.v2;
        }
        if (arrayList != null) {
            int i20 = 0;
            while (i20 < arrayList.size()) {
                org.telegram.messenger.gj gjVar = (org.telegram.messenger.gj) arrayList.get(i20);
                StaticLayout staticLayout = gjVar.e;
                if (staticLayout != null && (staticLayout.getText() instanceof Spanned)) {
                    z11 = z12;
                    CharacterStyle[] characterStyleArr = (CharacterStyle[]) ((Spanned) staticLayout.getText()).getSpans(i19, staticLayout.getText().length(), CharacterStyle.class);
                    if (characterStyleArr == null) {
                        continue;
                    } else {
                        for (int i21 = i19; i21 < characterStyleArr.length; i21++) {
                            if (characterStyleArr[i21] == characterStyle) {
                                i10 = ((Spanned) staticLayout.getText()).getSpanStart(characterStyle);
                                i12 = ((Spanned) staticLayout.getText()).getSpanEnd(characterStyle);
                                f7 += gjVar.l() ? (int) Math.ceil(f11) : 0;
                                f10 += gjVar.p(arrayList, q1Var.gb) + gjVar.f;
                                i11 = gjVar.s;
                                r15 = staticLayout;
                                if (r15 == 0 && q1Var.getDescriptionlayout() != null) {
                                    StaticLayout descriptionlayout = q1Var.getDescriptionlayout();
                                    i17 = 0;
                                    r15 = r15;
                                    while (i17 == 0) {
                                        if (descriptionlayout != null && (descriptionlayout.getText() instanceof Spanned)) {
                                            i18 = i10;
                                            CharacterStyle[] characterStyleArr2 = (CharacterStyle[]) ((Spanned) descriptionlayout.getText()).getSpans(0, descriptionlayout.getText().length(), CharacterStyle.class);
                                            if (characterStyleArr2 != null) {
                                                for (CharacterStyle characterStyle2 : characterStyleArr2) {
                                                    if (characterStyle2 == characterStyle) {
                                                        i10 = ((Spanned) descriptionlayout.getText()).getSpanStart(characterStyle);
                                                        i12 = ((Spanned) descriptionlayout.getText()).getSpanEnd(characterStyle);
                                                        f7 = q1Var.getDescriptionLayoutX();
                                                        f10 = q1Var.getDescriptionLayoutY();
                                                        i11 = descriptionlayout.getWidth();
                                                        r15 = descriptionlayout;
                                                        break;
                                                    }
                                                }
                                            }
                                        } else {
                                            i18 = i10;
                                        }
                                        i10 = i18;
                                        i17++;
                                        r15 = r15;
                                    }
                                }
                                if (r15 == 0 && ((messageObject.D4() || messageObject.T3()) && (pollButtons = q1Var.getPollButtons()) != null)) {
                                    i15 = 0;
                                    r15 = r15;
                                    while (i15 < pollButtons.size()) {
                                        org.telegram.ui.Cells.p1 p1Var = pollButtons.get(i15);
                                        StaticLayout staticLayout2 = p1Var.p;
                                        if (staticLayout2 == null) {
                                            i16 = i10;
                                        } else {
                                            i16 = i10;
                                            if (staticLayout2.getText() instanceof Spanned) {
                                                f15 = f7;
                                                f16 = f10;
                                                CharacterStyle[] characterStyleArr3 = (CharacterStyle[]) ((Spanned) staticLayout2.getText()).getSpans(0, staticLayout2.getText().length(), CharacterStyle.class);
                                                if (characterStyleArr3 != null) {
                                                    for (CharacterStyle characterStyle3 : characterStyleArr3) {
                                                        if (characterStyle3 == characterStyle) {
                                                            i10 = ((Spanned) staticLayout2.getText()).getSpanStart(characterStyle);
                                                            i12 = ((Spanned) staticLayout2.getText()).getSpanEnd(characterStyle);
                                                            f7 = p1Var.m;
                                                            f10 = p1Var.n;
                                                            i11 = staticLayout2.getWidth();
                                                            r15 = staticLayout2;
                                                            break;
                                                        }
                                                    }
                                                }
                                                i10 = i16;
                                                f10 = f16;
                                                f7 = f15;
                                                i15++;
                                                r15 = r15;
                                            }
                                        }
                                        f15 = f7;
                                        f16 = f10;
                                        i10 = i16;
                                        f10 = f16;
                                        f7 = f15;
                                        i15++;
                                        r15 = r15;
                                    }
                                }
                                if (r15 == 0 && messageObject != null && (vvVar = messageObject.w2) != null) {
                                    ArrayList arrayList2 = vvVar.g;
                                    if (characterStyle != null) {
                                        huVar = new org.telegram.messenger.hu();
                                        int i22 = 0;
                                        for (int i23 = 0; i23 < arrayList2.size(); i23++) {
                                            org.telegram.messenger.qu quVar = (org.telegram.messenger.qu) arrayList2.get(i23);
                                            if (quVar.R()) {
                                                if (quVar.u(characterStyle, i22, huVar)) {
                                                    break;
                                                } else {
                                                    i22 = quVar.H() + i22;
                                                }
                                            }
                                        }
                                    }
                                    huVar = null;
                                    if (huVar != null) {
                                        r15 = huVar.a;
                                        i10 = huVar.b;
                                        i12 = huVar.c;
                                        i11 = huVar.d;
                                        f7 = q1Var.getTextX() + huVar.e;
                                        f10 = q1Var.getTextY() + huVar.f;
                                    }
                                }
                                float f17 = f7;
                                int i24 = i10;
                                int i25 = i11;
                                if (r15 != 0 && z11 && !z10) {
                                    f(q1Var, characterStyle, charSequence, true);
                                    return;
                                }
                                if (r15 != 0) {
                                    return;
                                }
                                if (charSequence != null) {
                                    int lineForOffset = r15.getLineForOffset(i24);
                                    float lineTop = f10 + r15.getLineTop(lineForOffset);
                                    float primaryHorizontal = r15.getPrimaryHorizontal(i24);
                                    float lineWidth = r15.getLineWidth(lineForOffset);
                                    ?? k80Var = new k80(0);
                                    k80Var.d(r15, i24, 0.0f);
                                    r15.getSelectionPath(i24, i12, k80Var);
                                    RectF rectF2 = new RectF();
                                    k80Var.computeBounds(rectF2, true);
                                    StaticLayout g52 = org.telegram.messenger.jj.g5(charSequence, r15.getPaint(), r15.getWidth(), 1.0f, 0.0f, false, Layout.Alignment.ALIGN_NORMAL);
                                    i12 = charSequence.length();
                                    float width = g52.getWidth();
                                    float f18 = 0.0f;
                                    for (int i26 = 0; i26 < g52.getLineCount(); i26++) {
                                        width = Math.min(width, g52.getLineLeft(i26));
                                        f18 = Math.max(f18, g52.getLineRight(i26));
                                    }
                                    float max = f17 + Math.max(0.0f, Math.min(primaryHorizontal, lineWidth - Math.max(0.0f, f18 - width)));
                                    f13 = lineTop;
                                    rectF = rectF2;
                                    f12 = max;
                                    i13 = 0;
                                    r62 = g52;
                                } else {
                                    Object obj = r15;
                                    f12 = f17;
                                    i13 = i24;
                                    r62 = obj;
                                    f13 = f10;
                                    rectF = null;
                                }
                                Paint paint2 = new Paint(1);
                                paint2.setColor(org.telegram.ui.ActionBar.t6.w0(messageObject.P3() ? org.telegram.ui.ActionBar.t6.ob : org.telegram.ui.ActionBar.t6.ra, this.b));
                                paint2.setPathEffect(new CornerPathEffect(org.telegram.messenger.i0.L(5.0f)));
                                ?? k80Var2 = new k80(0);
                                k80Var2.c = true;
                                k80Var2.d(r62, i13, 0.0f);
                                r62.getSelectionPath(i13, i12, k80Var2);
                                k80Var2.a();
                                RectF rectF3 = new RectF();
                                k80Var2.computeBounds(rectF3, true);
                                int width2 = (int) (rectF3.width() + org.telegram.messenger.i0.L(5.0f));
                                if (!q1Var.J0() || width2 <= 0) {
                                    paint = paint2;
                                    layout = r62;
                                    f14 = 0.0f;
                                } else {
                                    f14 = 0.0f;
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
                                        paint4.setPathEffect(new CornerPathEffect(org.telegram.messenger.i0.L(5.0f)));
                                        paint4.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                                        canvas.translate(-rectF3.left, -rectF3.top);
                                        canvas.drawPath(k80Var2, paint4);
                                        bitmap = createBitmap;
                                        Paint paint5 = new Paint(3);
                                        paint5.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                                        q1Var.y3();
                                        TextPaint textPaint = new TextPaint(layout.getPaint());
                                        textPaint.set(layout.getPaint());
                                        spannableStringBuilder = new SpannableStringBuilder(o5.cloneSpans(layout.getText(), -1, textPaint.getFontMetricsInt()));
                                        if (i13 <= 0) {
                                            i14 = 0;
                                            spannableStringBuilder.setSpan(new ForegroundColorSpan(0), 0, i13, 33);
                                        } else {
                                            i14 = 0;
                                        }
                                        if (i12 < spannableStringBuilder.length()) {
                                            spannableStringBuilder.setSpan(new ForegroundColorSpan(i14), i12, spannableStringBuilder.length(), 33);
                                        }
                                        if (messageObject.P1 >= 4) {
                                            f14 = -1.0f;
                                        }
                                        StaticLayout g53 = org.telegram.messenger.jj.g5(spannableStringBuilder, textPaint, i25, 1.0f, f14, false, Layout.Alignment.ALIGN_NORMAL);
                                        int[] iArr = new int[2];
                                        q1Var.getLocationOnScreen(iArr);
                                        float f19 = f13;
                                        this.E = new ml0(k80Var2, new int[]{iArr[0] + ((int) f12), iArr[1] + ((int) f13)}, q1Var, iArr, bitmap, rectF3, paint5, paint, g53);
                                        int L = (int) ((org.telegram.messenger.i0.L(5.0f) / 2.0f) + iArr[0] + f12 + rectF3.left);
                                        int i27 = (int) (iArr[1] + f19 + rectF3.top);
                                        this.E.setBounds(L, i27, ((int) rectF3.width()) + L, ((int) rectF3.height()) + i27);
                                        if (charSequence == null) {
                                            float f20 = L;
                                            float width3 = rectF3.width() + f20;
                                            Point point = org.telegram.messenger.i0.q;
                                            if (width3 > point.x - org.telegram.messenger.i0.L(8.0f)) {
                                                this.H -= (rectF3.width() + f20) - (point.x - org.telegram.messenger.i0.L(8.0f));
                                            }
                                            float f21 = i27;
                                            if (rectF3.height() + f21 > ((point.y - org.telegram.messenger.i0.m) - org.telegram.messenger.i0.n) - org.telegram.messenger.i0.L(8.0f)) {
                                                this.I -= (rectF3.height() + f21) - (((point.y - org.telegram.messenger.i0.m) - org.telegram.messenger.i0.n) - org.telegram.messenger.i0.L(8.0f));
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
                                q1Var.y3();
                                TextPaint textPaint2 = new TextPaint(layout.getPaint());
                                textPaint2.set(layout.getPaint());
                                spannableStringBuilder = new SpannableStringBuilder(o5.cloneSpans(layout.getText(), -1, textPaint2.getFontMetricsInt()));
                                if (i13 <= 0) {
                                }
                                if (i12 < spannableStringBuilder.length()) {
                                }
                                if (messageObject.P1 >= 4) {
                                }
                                StaticLayout g532 = org.telegram.messenger.jj.g5(spannableStringBuilder, textPaint2, i25, 1.0f, f14, false, Layout.Alignment.ALIGN_NORMAL);
                                int[] iArr2 = new int[2];
                                q1Var.getLocationOnScreen(iArr2);
                                float f192 = f13;
                                this.E = new ml0(k80Var2, new int[]{iArr2[0] + ((int) f12), iArr2[1] + ((int) f13)}, q1Var, iArr2, bitmap, rectF3, paint52, paint, g532);
                                int L2 = (int) ((org.telegram.messenger.i0.L(5.0f) / 2.0f) + iArr2[0] + f12 + rectF3.left);
                                int i272 = (int) (iArr2[1] + f192 + rectF3.top);
                                this.E.setBounds(L2, i272, ((int) rectF3.width()) + L2, ((int) rectF3.height()) + i272);
                                if (charSequence == null) {
                                }
                            }
                        }
                    }
                } else {
                    z11 = z12;
                }
                i20++;
                z12 = z11;
                i19 = 0;
            }
        }
        z11 = z12;
        i10 = 0;
        i11 = 0;
        i12 = 0;
        r15 = 0;
        if (r15 == 0) {
            StaticLayout descriptionlayout2 = q1Var.getDescriptionlayout();
            i17 = 0;
            r15 = r15;
            while (i17 == 0) {
            }
        }
        if (r15 == 0) {
            i15 = 0;
            r15 = r15;
            while (i15 < pollButtons.size()) {
            }
        }
        if (r15 == 0) {
            ArrayList arrayList22 = vvVar.g;
            if (characterStyle != null) {
            }
            huVar = null;
            if (huVar != null) {
            }
        }
        float f172 = f7;
        int i242 = i10;
        int i252 = i11;
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
        jg.l0 l0Var = this.s;
        setContentView(l0Var, layoutParams);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.height = -1;
        attributes.gravity = org.telegram.messenger.zs.E1;
        attributes.dimAmount = 0.0f;
        int i10 = attributes.flags & (-3);
        attributes.softInputMode = 16;
        attributes.flags = i10 | (-1945959040);
        org.telegram.messenger.i0.m(attributes);
        window.setAttributes(attributes);
        l0Var.setSystemUiVisibility(256);
        org.telegram.messenger.i0.n3(l0Var, !org.telegram.ui.ActionBar.t6.I.q());
    }

    @Override // android.app.Dialog
    public final void show() {
        if (org.telegram.messenger.i0.M1(getContext())) {
            super.show();
            d(new d(this, 19));
            c(null, true);
        }
    }
}
