// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.RenderNode;
import android.os.Build;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes3.dex */
public final class lq9 extends View {
    public boolean E;
    public kq9 F;
    public h7b G;
    public Object H;
    public t79 I;
    public String J;
    public final int[] K;
    public final int[] L;
    public boolean M;
    public final int a;
    public final d6b b;
    public e6b c;
    public final lm d;
    public final RectF e;
    public final RectF f;
    public final ImageReceiver h;
    public boolean n;
    public tgb r;
    public tgb s;
    public final Path w;
    public final Paint x;
    public final n41 y;

    public lq9(Context context, int i, d6b d6bVar) {
        super(context);
        this.d = new lm(this, 0L, 320L, s33.h);
        this.e = new RectF();
        this.f = new RectF();
        this.h = new ImageReceiver(this);
        this.w = new Path();
        this.x = new Paint(1);
        this.y = new n41(this);
        this.K = new int[2];
        this.L = new int[2];
        this.a = i;
        this.b = d6bVar;
    }

    public final void a() {
        kq9 kq9Var = this.F;
        if (kq9Var == null) {
            return;
        }
        this.r = new tgb(kq9Var.b(), 16.0f, gl.o());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.F.a());
        if (spannableStringBuilder.toString().contains(">")) {
            spannableStringBuilder.clear();
            spannableStringBuilder.append((CharSequence) gl.E2(this.F.a(), false));
        } else {
            spannableStringBuilder.append((CharSequence) " ");
            spannableStringBuilder.append((CharSequence) ">");
            cm2 cm2Var = new cm2(R.drawable.settings_arrow, 0);
            cm2Var.I = 1.25f;
            cm2Var.J = 1.25f;
            spannableStringBuilder.setSpan(cm2Var, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
        }
        this.s = new tgb(spannableStringBuilder, 14.0f, null);
        this.F.d(this.h);
        this.n = true;
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float f;
        float f2;
        Object obj;
        float d = this.d.d(this.E);
        tgb tgbVar = this.r;
        if (tgbVar == null || this.s == null || d <= 0.0f) {
            return;
        }
        tgbVar.p = getWidth() * 0.7f;
        this.s.p = getWidth() * 0.7f;
        float L = gl.L(5.0f);
        float L2 = gl.L(10.0f);
        float L3 = gl.L(32.0f);
        float L4 = gl.L(2.0f);
        float L5 = gl.L(11.0f);
        float max = Math.max(Math.min(gl.L(200.0f), getWidth() * 0.8f), Math.max(this.r.c, this.s.c) + (this.n ? L5 + L3 + L5 : 0.0f) + L + gl.L(15.0f) + L);
        float max2 = Math.max(this.n ? L3 : 0.0f, this.s.h() + this.r.h() + L4) + L2 + L2;
        float R1 = gl.R1(0.6f, 1.0f, d) * this.y.a(0.05f);
        float L6 = (1.0f - d) * gl.L(15.0f);
        float width = (getWidth() - max) / 2.0f;
        float height = (getHeight() - max2) / 2.0f;
        float width2 = (getWidth() + max) / 2.0f;
        float height2 = (getHeight() + max2) / 2.0f;
        RectF rectF = this.e;
        rectF.set(width, height, width2, height2);
        RectF rectF2 = this.f;
        rectF2.set(rectF);
        gl.f3(rectF2, R1, rectF2.centerX(), rectF2.centerY());
        rectF2.offset(0.0f, L6);
        int i = Build.VERSION.SDK_INT;
        Paint paint = this.x;
        if (i < 29 || (obj = this.H) == null || this.G == null) {
            f = L;
            f2 = 2.0f;
            paint.setColor(bkb.p1(d, -587202560));
            canvas.drawRoundRect(rectF2, gl.L(12.0f), gl.L(12.0f), paint);
        } else {
            RenderNode e = qm0.e(obj);
            Path path = this.w;
            path.rewind();
            f2 = 2.0f;
            f = L;
            path.addRoundRect(rectF2, gl.L(12.0f), gl.L(12.0f), Path.Direction.CW);
            getLocationOnScreen(this.K);
            this.G.getLocationOnScreen(this.L);
            canvas.saveLayerAlpha(rectF2, (int) (255.0f * d), 31);
            canvas.clipPath(path);
            canvas.translate(r10[0] - r7[0], r10[1] - r7[1]);
            float max3 = Math.max(this.G.getWidth() / e.getWidth(), this.G.getHeight() / e.getHeight());
            canvas.scale(max3, max3);
            canvas.drawRenderNode(e);
            canvas.restore();
            paint.setColor(bkb.p1(d, 1879048192));
            canvas.drawRoundRect(rectF2, gl.L(12.0f), gl.L(12.0f), paint);
        }
        canvas.save();
        canvas.translate(0.0f, L6);
        canvas.scale(R1, R1, rectF.centerX(), rectF.centerY());
        if (this.n) {
            float f3 = L3 / f2;
            ImageReceiver imageReceiver = this.h;
            imageReceiver.q0((int) f3);
            imageReceiver.i0(rectF.left + f + L5, rectF.centerY() - f3, L3, L3);
            imageReceiver.setAlpha(d);
            imageReceiver.h(canvas, null);
        }
        float centerY = rectF.centerY() - ((this.s.h() + (this.r.h() + L4)) / f2);
        tgb tgbVar2 = this.r;
        tgbVar2.c(rectF.left + (this.n ? L5 + L3 + L5 : 0.0f) + f, (tgbVar2.h() / f2) + centerY, d, -1, canvas);
        this.s.c(rectF.left + (this.n ? L3 + L5 + L5 : 0.0f) + f, (this.s.h() / f2) + this.r.h() + centerY + L4, d, bkb.v(-16777216, -1610612737), canvas);
        canvas.restore();
    }

    @Override // android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        e6b e6bVar;
        boolean z = this.E;
        n41 n41Var = this.y;
        if (!z || this.F == null) {
            this.M = false;
            n41Var.c(false);
            return false;
        }
        int action = motionEvent.getAction();
        RectF rectF = this.e;
        byte b = 1;
        if (action == 0) {
            if (rectF.contains(motionEvent.getX(), motionEvent.getY())) {
                this.M = true;
                n41Var.c(true);
            }
        } else if (motionEvent.getAction() == 2) {
            if (n41Var.i && !rectF.contains(motionEvent.getX(), motionEvent.getY())) {
                n41Var.c(false);
            }
        } else if (motionEvent.getAction() == 1) {
            if (n41Var.i && (e6bVar = this.c) != null && this.F != null) {
                e6bVar.a(new hq9(this, b));
            }
            n41Var.c(false);
            this.M = false;
        } else if (motionEvent.getAction() == 3) {
            n41Var.c(false);
            this.M = false;
        }
        return this.M || n41Var.i;
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.h.I();
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.h.K();
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x003f, code lost:
    
        r0 = r9.I;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0041, code lost:
    
        if (r0 == null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0043, code lost:
    
        r0.run();
        r9.I = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0048, code lost:
    
        r9.F = null;
        r9.J = r10;
        r0 = r9.a;
        r1 = new hq9(r9, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0053, code lost:
    
        r0 = na7.q1(r0);
        r5 = r0.N2;
        r6 = android.net.Uri.parse(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0065, code lost:
    
        if (android.text.TextUtils.equals(r6.getHost(), r5) == false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0067, code lost:
    
        r5 = r6.getPathSegments();
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006f, code lost:
    
        if (r5.isEmpty() != false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0071, code lost:
    
        r2 = r5.get(0);
        r5 = r6.getQueryParameter("ref");
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0081, code lost:
    
        if (android.text.TextUtils.isEmpty(r5) == false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0083, code lost:
    
        r6 = r0.a2(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0089, code lost:
    
        if ((r6 instanceof org.telegram.tgnet.TLRPC.User) == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x008b, code lost:
    
        r1.a(new iq9(r10, (org.telegram.tgnet.TLRPC.User) r6));
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0098, code lost:
    
        if ((r6 instanceof org.telegram.tgnet.TLRPC.Chat) == false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x009a, code lost:
    
        r1.a(new jq9(r10, (org.telegram.tgnet.TLRPC.Chat) r6));
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00a5, code lost:
    
        r3 = r0.Y1().a(r2, r5, new f28((java.lang.Object) r1, (java.lang.Object) r0, (java.lang.Object) r10, (byte) 4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00b4, code lost:
    
        r10 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00b5, code lost:
    
        fa4.g(r10, true);
        r1.a(r3);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void setLink(String str) {
        kq9 kq9Var;
        boolean isEmpty = TextUtils.isEmpty(str);
        d6b d6bVar = this.b;
        byte b = 0;
        t79 t79Var = null;
        if (isEmpty) {
            t79 t79Var2 = this.I;
            if (t79Var2 != null) {
                t79Var2.run();
                this.I = null;
            }
            if (this.E) {
                invalidate();
            }
            this.E = false;
            this.J = null;
            if (d6bVar != null) {
                d6bVar.run();
                return;
            }
            return;
        }
        if ((r0 = this.F) != null) {
            kq9Var = this.F;
            if (kq9Var == null) {
                return;
            } else {
                return;
            }
        }
        kq9Var = this.F;
        if (kq9Var == null && !this.E && TextUtils.equals(kq9Var.a, str)) {
            this.E = true;
            a();
            invalidate();
            if (d6bVar != null) {
                d6bVar.run();
                return;
            }
            return;
        }
        return;
        this.I = t79Var;
    }
}
