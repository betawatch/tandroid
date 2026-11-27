// default package

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
import android.text.SpannableString;
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

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class mu9 extends Dialog {
    public static final /* synthetic */ int P = 0;
    public ViewGroup E;
    public Drawable F;
    public jl0 G;
    public float H;
    public float I;
    public float J;
    public float K;
    public float L;
    public boolean M;
    public boolean N;
    public ValueAnimator O;
    public final Context a;
    public final vnb b;
    public Bitmap c;
    public BitmapShader d;
    public Paint e;
    public Matrix f;
    public final nz4 h;
    public final ll0 n;
    public float r;
    public final d26 s;
    public final wma w;
    public fu5 x;
    public FrameLayout y;

    public mu9(Context context, vnb vnbVar) {
        super(context, R.style.TransparentDialog);
        this.K = 1.0f;
        this.L = 1.0f;
        this.N = false;
        this.a = context;
        this.b = vnbVar;
        d26 d26Var = new d26((byte) 18, context, this);
        this.s = d26Var;
        d26Var.setOnClickListener(new jn8(this, (byte) 14));
        wma wmaVar = new wma(context, null);
        this.w = wmaVar;
        wmaVar.setClipToPadding(false);
        d26Var.addView(wmaVar, tre.e(-1, -1, jn7.D1));
        nz4 nz4Var = new nz4();
        this.h = nz4Var;
        ll0 ll0Var = new ll0(nz4Var, nz4Var, nz4Var);
        this.n = ll0Var;
        ll0Var.h = new yic(d26Var);
        ll0Var.i = d26Var;
        ve9 ve9Var = new ve9((Object) this, (byte) 5);
        WeakHashMap weakHashMap = ihc.a;
        ahc.i(d26Var, ve9Var);
    }

    public static void d(icc iccVar) {
        hl.j2(new sh9(iccVar, (byte) 2), 15.0f);
    }

    public final void a(Runnable runnable, boolean z) {
        ValueAnimator valueAnimator = this.O;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.r, z ? 1.0f : 0.0f);
        this.O = ofFloat;
        ofFloat.addUpdateListener(new b49(this, (byte) 9));
        this.O.addListener(new rw((Object) this, z, (Object) runnable, (byte) 11));
        this.O.setInterpolator(k43.h);
        this.O.setDuration(350L);
        this.O.start();
    }

    public final /* synthetic */ void b() {
        super.dismiss();
    }

    public final /* synthetic */ void c() {
        super.dismiss();
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        if (this.N) {
            return;
        }
        this.N = true;
        a(new dm1(this, (byte) 3), false);
        this.s.invalidate();
    }

    public final void e(fu5 fu5Var) {
        int i = aob.E8;
        vnb vnbVar = this.b;
        fu5Var.U(aob.p1(0.06f, aob.v0(i, vnbVar)));
        fu5Var.R(this.n, dtd.k(vnbVar), false);
        this.x = fu5Var;
        this.E = fu5Var.A;
        FrameLayout frameLayout = new FrameLayout(this.a);
        this.y = frameLayout;
        frameLayout.addView(this.E, tre.c(-2.0f, -2));
        this.w.addView(this.y, tre.c(-2.0f, -2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x03b3  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x03c4  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x03d5  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x043f  */
    /* JADX WARN: Removed duplicated region for block: B:151:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:152:0x03bd  */
    /* JADX WARN: Removed duplicated region for block: B:158:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0145 A[EDGE_INSN: B:52:0x0145->B:53:0x0145 BREAK  A[LOOP:2: B:45:0x0119->B:49:0x0142], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01d7  */
    /* JADX WARN: Type inference failed for: r13v8, types: [android.graphics.Canvas] */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v11 */
    /* JADX WARN: Type inference failed for: r15v12 */
    /* JADX WARN: Type inference failed for: r15v13 */
    /* JADX WARN: Type inference failed for: r15v15 */
    /* JADX WARN: Type inference failed for: r15v16 */
    /* JADX WARN: Type inference failed for: r15v17 */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r15v3 */
    /* JADX WARN: Type inference failed for: r15v4, types: [android.text.Layout, android.text.StaticLayout] */
    /* JADX WARN: Type inference failed for: r15v8, types: [android.text.StaticLayout] */
    /* JADX WARN: Type inference failed for: r15v9 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11, types: [android.text.Layout] */
    /* JADX WARN: Type inference failed for: r5v51 */
    /* JADX WARN: Type inference failed for: r6v37, types: [android.graphics.Path, f66] */
    /* JADX WARN: Type inference failed for: r7v16, types: [android.graphics.Path, f66, jx2] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f(wb2 wb2Var, CharacterStyle characterStyle, SpannableString spannableString, boolean z) {
        float f;
        float f2;
        ArrayList arrayList;
        float f3;
        boolean z2;
        int i;
        int i2;
        int i3;
        ?? r15;
        float f4;
        int i4;
        float f5;
        ?? r5;
        RectF rectF;
        Layout layout;
        Paint paint;
        float f6;
        Bitmap bitmap;
        SpannableStringBuilder spannableStringBuilder;
        int i5;
        hl9 hl9Var;
        vj9 vj9Var;
        ArrayList<vb2> pollButtons;
        int i6;
        float f7;
        float f8;
        StaticLayout descriptionlayout;
        CharacterStyle[] characterStyleArr;
        int i7;
        if (wb2Var == null) {
            return;
        }
        wb2Var.getCurrentMessagesGroup();
        r47 messageObject = wb2Var.getMessageObject();
        int i8 = 0;
        boolean z3 = wb2Var.getExplanationLayout() != null && messageObject.L0;
        if (z3 && z) {
            f = wb2Var.getExplanationX();
            f2 = wb2Var.getExplanationY();
            arrayList = wb2Var.getExplanationLayout().e;
            f3 = wb2Var.getExplanationLayout().d;
        } else if (wb2Var.getCaptionLayout() != null) {
            f = wb2Var.getCaptionX();
            f2 = wb2Var.getCaptionY();
            arrayList = wb2Var.getCaptionLayout().e;
            f3 = wb2Var.getCaptionLayout().d;
        } else {
            f = 0.0f;
            f2 = 0.0f;
            arrayList = null;
            f3 = 0.0f;
        }
        if (arrayList == null) {
            f = wb2Var.getTextX();
            f2 = wb2Var.getTextY() + wb2Var.Uc;
            arrayList = messageObject.B2;
            f3 = messageObject.x2;
        }
        if (arrayList != null) {
            int i9 = 0;
            while (i9 < arrayList.size()) {
                o47 o47Var = (o47) arrayList.get(i9);
                StaticLayout staticLayout = o47Var.e;
                if (staticLayout == null || !(staticLayout.getText() instanceof Spanned)) {
                    z2 = z3;
                } else {
                    z2 = z3;
                    CharacterStyle[] characterStyleArr2 = (CharacterStyle[]) ((Spanned) staticLayout.getText()).getSpans(i8, staticLayout.getText().length(), CharacterStyle.class);
                    if (characterStyleArr2 != null) {
                        for (int i10 = i8; i10 < characterStyleArr2.length; i10++) {
                            if (characterStyleArr2[i10] == characterStyle) {
                                i = ((Spanned) staticLayout.getText()).getSpanStart(characterStyle);
                                i3 = ((Spanned) staticLayout.getText()).getSpanEnd(characterStyle);
                                f += o47Var.l() ? (int) Math.ceil(f3) : 0;
                                f2 += o47Var.p(arrayList, wb2Var.ub) + o47Var.f;
                                i2 = o47Var.s;
                                r15 = staticLayout;
                                if (r15 == 0 && wb2Var.getDescriptionlayout() != null && (descriptionlayout = wb2Var.getDescriptionlayout()) != null && (descriptionlayout.getText() instanceof Spanned) && (characterStyleArr = (CharacterStyle[]) ((Spanned) descriptionlayout.getText()).getSpans(0, descriptionlayout.getText().length(), CharacterStyle.class)) != null) {
                                    i7 = 0;
                                    while (true) {
                                        if (i7 >= characterStyleArr.length) {
                                            break;
                                        }
                                        if (characterStyleArr[i7] == characterStyle) {
                                            i = ((Spanned) descriptionlayout.getText()).getSpanStart(characterStyle);
                                            i3 = ((Spanned) descriptionlayout.getText()).getSpanEnd(characterStyle);
                                            f = wb2Var.getDescriptionLayoutX();
                                            f2 = wb2Var.getDescriptionLayoutY();
                                            i2 = descriptionlayout.getWidth();
                                            r15 = descriptionlayout;
                                            break;
                                        }
                                        i7++;
                                    }
                                }
                                if (r15 == 0 && ((messageObject.C4() || messageObject.S3()) && (pollButtons = wb2Var.getPollButtons()) != null)) {
                                    i6 = 0;
                                    r15 = r15;
                                    while (i6 < pollButtons.size()) {
                                        vb2 vb2Var = pollButtons.get(i6);
                                        StaticLayout staticLayout2 = vb2Var.p;
                                        int i11 = i;
                                        if (staticLayout2 != null && (staticLayout2.getText() instanceof Spanned)) {
                                            f7 = f;
                                            f8 = f2;
                                            CharacterStyle[] characterStyleArr3 = (CharacterStyle[]) ((Spanned) staticLayout2.getText()).getSpans(0, staticLayout2.getText().length(), CharacterStyle.class);
                                            if (characterStyleArr3 != null) {
                                                for (CharacterStyle characterStyle2 : characterStyleArr3) {
                                                    if (characterStyle2 == characterStyle) {
                                                        i = ((Spanned) staticLayout2.getText()).getSpanStart(characterStyle);
                                                        i3 = ((Spanned) staticLayout2.getText()).getSpanEnd(characterStyle);
                                                        f = vb2Var.m;
                                                        f2 = vb2Var.n;
                                                        i2 = staticLayout2.getWidth();
                                                        r15 = staticLayout2;
                                                        break;
                                                    }
                                                }
                                            }
                                        } else {
                                            f7 = f;
                                            f8 = f2;
                                        }
                                        i = i11;
                                        f2 = f8;
                                        f = f7;
                                        i6++;
                                        r15 = r15;
                                    }
                                }
                                if (r15 == 0 && messageObject != null && (hl9Var = messageObject.y2) != null) {
                                    ArrayList arrayList2 = hl9Var.g;
                                    if (characterStyle != null) {
                                        vj9Var = new vj9();
                                        int i12 = 0;
                                        for (int i13 = 0; i13 < arrayList2.size(); i13++) {
                                            dk9 dk9Var = (dk9) arrayList2.get(i13);
                                            if (dk9Var.R()) {
                                                if (dk9Var.t(characterStyle, i12, vj9Var)) {
                                                    break;
                                                } else {
                                                    i12 = dk9Var.H() + i12;
                                                }
                                            }
                                        }
                                    }
                                    vj9Var = null;
                                    if (vj9Var != null) {
                                        r15 = vj9Var.a;
                                        i = vj9Var.b;
                                        i3 = vj9Var.c;
                                        i2 = vj9Var.d;
                                        f = wb2Var.getTextX() + vj9Var.e;
                                        f2 = wb2Var.getTextY() + vj9Var.f;
                                    }
                                }
                                float f9 = f;
                                int i14 = i;
                                int i15 = i2;
                                if (r15 != 0 && z2 && !z) {
                                    f(wb2Var, characterStyle, spannableString, true);
                                    return;
                                }
                                if (r15 != 0) {
                                    return;
                                }
                                if (spannableString != null) {
                                    int lineForOffset = r15.getLineForOffset(i14);
                                    float lineTop = f2 + r15.getLineTop(lineForOffset);
                                    float primaryHorizontal = r15.getPrimaryHorizontal(i14);
                                    float lineWidth = r15.getLineWidth(lineForOffset);
                                    ?? f66Var = new f66(0);
                                    f66Var.d(r15, i14, 0.0f);
                                    r15.getSelectionPath(i14, i3, f66Var);
                                    RectF rectF2 = new RectF();
                                    f66Var.computeBounds(rectF2, true);
                                    TextPaint paint2 = r15.getPaint();
                                    rectF = rectF2;
                                    StaticLayout f52 = r47.f5(1.0f, 0.0f, r15.getWidth(), Layout.Alignment.ALIGN_NORMAL, paint2, spannableString, false);
                                    i3 = spannableString.length();
                                    float width = f52.getWidth();
                                    float f10 = 0.0f;
                                    for (int i16 = 0; i16 < f52.getLineCount(); i16++) {
                                        width = Math.min(width, f52.getLineLeft(i16));
                                        f10 = Math.max(f10, f52.getLineRight(i16));
                                    }
                                    f4 = f9 + Math.max(0.0f, Math.min(primaryHorizontal, lineWidth - Math.max(0.0f, f10 - width)));
                                    f5 = lineTop;
                                    i4 = 0;
                                    r5 = f52;
                                } else {
                                    f4 = f9;
                                    i4 = i14;
                                    f5 = f2;
                                    r5 = r15;
                                    rectF = null;
                                }
                                Paint paint3 = new Paint(1);
                                paint3.setColor(aob.v0(messageObject.O3() ? aob.rb : aob.ra, this.b));
                                paint3.setPathEffect(new CornerPathEffect(hl.L(5.0f)));
                                ?? f66Var2 = new f66(0);
                                f66Var2.c = true;
                                f66Var2.d(r5, i4, 0.0f);
                                r5.getSelectionPath(i4, i3, f66Var2);
                                f66Var2.a();
                                RectF rectF3 = new RectF();
                                f66Var2.computeBounds(rectF3, true);
                                int width2 = (int) (rectF3.width() + hl.L(5.0f));
                                if (!wb2Var.L0() || width2 <= 0) {
                                    layout = r5;
                                    paint = paint3;
                                    f6 = 0.0f;
                                } else {
                                    f6 = 0.0f;
                                    if (rectF3.height() > 0.0f) {
                                        Bitmap createBitmap = Bitmap.createBitmap(width2, (int) rectF3.height(), Bitmap.Config.ALPHA_8);
                                        ?? canvas = new Canvas(createBitmap);
                                        layout = r5;
                                        paint = paint3;
                                        Paint paint4 = new Paint(1);
                                        paint4.setColor(-1);
                                        canvas.drawRect(0.0f, 0.0f, width2, rectF3.height(), paint4);
                                        Paint paint5 = new Paint(1);
                                        paint5.setColor(-1);
                                        paint5.setPathEffect(new CornerPathEffect(hl.L(5.0f)));
                                        paint5.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                                        canvas.translate(-rectF3.left, -rectF3.top);
                                        canvas.drawPath(f66Var2, paint5);
                                        bitmap = createBitmap;
                                        Paint paint6 = new Paint(3);
                                        paint6.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                                        wb2Var.F3();
                                        TextPaint textPaint = new TextPaint(layout.getPaint());
                                        textPaint.set(layout.getPaint());
                                        Bitmap bitmap2 = bitmap;
                                        spannableStringBuilder = new SpannableStringBuilder(hm.cloneSpans(layout.getText(), -1, textPaint.getFontMetricsInt()));
                                        if (i4 <= 0) {
                                            i5 = 0;
                                            spannableStringBuilder.setSpan(new ForegroundColorSpan(0), 0, i4, 33);
                                        } else {
                                            i5 = 0;
                                        }
                                        if (i3 < spannableStringBuilder.length()) {
                                            spannableStringBuilder.setSpan(new ForegroundColorSpan(i5), i3, spannableStringBuilder.length(), 33);
                                        }
                                        if (messageObject.R1 >= 4) {
                                            f6 = -1.0f;
                                        }
                                        StaticLayout f53 = r47.f5(1.0f, f6, i15, Layout.Alignment.ALIGN_NORMAL, textPaint, spannableStringBuilder, false);
                                        int[] iArr = new int[2];
                                        wb2Var.getLocationOnScreen(iArr);
                                        float f11 = f5;
                                        this.F = new lu9(f66Var2, new int[]{iArr[0] + ((int) f4), iArr[1] + ((int) f5)}, wb2Var, iArr, bitmap2, rectF3, paint6, paint, f53);
                                        int L = (int) ((hl.L(5.0f) / 2.0f) + iArr[0] + f4 + rectF3.left);
                                        int i17 = (int) (iArr[1] + f11 + rectF3.top);
                                        this.F.setBounds(L, i17, ((int) rectF3.width()) + L, ((int) rectF3.height()) + i17);
                                        if (spannableString == null) {
                                            float f12 = L;
                                            float width3 = rectF3.width() + f12;
                                            Point point = hl.q;
                                            if (width3 > point.x - hl.L(8.0f)) {
                                                this.I -= (rectF3.width() + f12) - (point.x - hl.L(8.0f));
                                            }
                                            float f13 = i17;
                                            if (rectF3.height() + f13 > ((point.y - hl.m) - hl.n) - hl.L(8.0f)) {
                                                this.J -= (rectF3.height() + f13) - (((point.y - hl.m) - hl.n) - hl.L(8.0f));
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
                                    layout = r5;
                                    paint = paint3;
                                }
                                bitmap = null;
                                Paint paint62 = new Paint(3);
                                paint62.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                                wb2Var.F3();
                                TextPaint textPaint2 = new TextPaint(layout.getPaint());
                                textPaint2.set(layout.getPaint());
                                Bitmap bitmap22 = bitmap;
                                spannableStringBuilder = new SpannableStringBuilder(hm.cloneSpans(layout.getText(), -1, textPaint2.getFontMetricsInt()));
                                if (i4 <= 0) {
                                }
                                if (i3 < spannableStringBuilder.length()) {
                                }
                                if (messageObject.R1 >= 4) {
                                }
                                StaticLayout f532 = r47.f5(1.0f, f6, i15, Layout.Alignment.ALIGN_NORMAL, textPaint2, spannableStringBuilder, false);
                                int[] iArr2 = new int[2];
                                wb2Var.getLocationOnScreen(iArr2);
                                float f112 = f5;
                                this.F = new lu9(f66Var2, new int[]{iArr2[0] + ((int) f4), iArr2[1] + ((int) f5)}, wb2Var, iArr2, bitmap22, rectF3, paint62, paint, f532);
                                int L2 = (int) ((hl.L(5.0f) / 2.0f) + iArr2[0] + f4 + rectF3.left);
                                int i172 = (int) (iArr2[1] + f112 + rectF3.top);
                                this.F.setBounds(L2, i172, ((int) rectF3.width()) + L2, ((int) rectF3.height()) + i172);
                                if (spannableString == null) {
                                }
                            }
                        }
                    } else {
                        continue;
                    }
                }
                i9++;
                z3 = z2;
                i8 = 0;
            }
        }
        z2 = z3;
        i = 0;
        i2 = 0;
        i3 = 0;
        r15 = 0;
        if (r15 == 0) {
            i7 = 0;
            while (true) {
                if (i7 >= characterStyleArr.length) {
                }
                i7++;
            }
        }
        if (r15 == 0) {
            i6 = 0;
            r15 = r15;
            while (i6 < pollButtons.size()) {
            }
        }
        if (r15 == 0) {
            ArrayList arrayList22 = hl9Var.g;
            if (characterStyle != null) {
            }
            vj9Var = null;
            if (vj9Var != null) {
            }
        }
        float f92 = f;
        int i142 = i;
        int i152 = i2;
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
        d26 d26Var = this.s;
        setContentView(d26Var, layoutParams);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.height = -1;
        attributes.gravity = jn7.D1;
        attributes.dimAmount = 0.0f;
        int i = attributes.flags & (-3);
        attributes.softInputMode = 16;
        attributes.flags = i | (-1945959040);
        hl.m(attributes);
        window.setAttributes(attributes);
        d26Var.setSystemUiVisibility(256);
        hl.j3(d26Var, !aob.I.o());
    }

    @Override // android.app.Dialog
    public final void show() {
        if (hl.K1(getContext())) {
            super.show();
            d(new hj8(this, (byte) 14));
            a(null, true);
        }
    }
}
