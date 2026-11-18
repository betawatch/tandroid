package hi;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.RenderNode;
import android.net.Uri;
import android.os.Build;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import java.util.List;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.mp;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.lq;
import org.telegram.ui.Components.lr;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.vy0;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes4.dex */
public final class o6 extends View {
    public boolean E;
    public n6 F;
    public View G;
    public Object H;
    public org.telegram.messenger.l7 I;
    public String J;
    public final int[] K;
    public final int[] L;
    public boolean M;
    public final int a;
    public final s8 b;
    public t8 c;
    public final org.telegram.ui.Components.c6 d;
    public final RectF e;
    public final RectF f;
    public final ImageReceiver h;
    public boolean n;
    public vy0 r;
    public vy0 s;
    public final Path w;
    public final Paint x;
    public final mc y;

    public o6(Activity activity, int i7, s8 s8Var) {
        super(activity);
        this.d = new org.telegram.ui.Components.c6(this, 0L, 320L, lr.h);
        this.e = new RectF();
        this.f = new RectF();
        this.h = new ImageReceiver(this);
        this.w = new Path();
        this.x = new Paint(1);
        this.y = new mc(this);
        this.K = new int[2];
        this.L = new int[2];
        this.a = i7;
        this.b = s8Var;
    }

    public final void a() {
        n6 n6Var = this.F;
        if (n6Var == null) {
            return;
        }
        this.r = new vy0(n6Var.b(), 16.0f, org.telegram.messenger.g0.o());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.F.a());
        if (spannableStringBuilder.toString().contains(">")) {
            spannableStringBuilder.clear();
            spannableStringBuilder.append((CharSequence) org.telegram.messenger.g0.H2(this.F.a(), false));
        } else {
            spannableStringBuilder.append((CharSequence) " ");
            spannableStringBuilder.append((CharSequence) ">");
            lq lqVar = new lq(R.drawable.settings_arrow, 0);
            lqVar.I = 1.25f;
            lqVar.J = 1.25f;
            spannableStringBuilder.setSpan(lqVar, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
        }
        this.s = new vy0(spannableStringBuilder, 14.0f, null);
        this.F.d(this.h);
        this.n = true;
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        float f11;
        Object obj;
        float d = this.d.d(this.E);
        vy0 vy0Var = this.r;
        if (vy0Var == null || this.s == null || d <= 0.0f) {
            return;
        }
        vy0Var.p = getWidth() * 0.7f;
        this.s.p = getWidth() * 0.7f;
        float L = org.telegram.messenger.g0.L(5.0f);
        float L2 = org.telegram.messenger.g0.L(10.0f);
        float L3 = org.telegram.messenger.g0.L(32.0f);
        float L4 = org.telegram.messenger.g0.L(2.0f);
        float L5 = org.telegram.messenger.g0.L(11.0f);
        float max = Math.max(Math.min(org.telegram.messenger.g0.L(200.0f), getWidth() * 0.8f), Math.max(this.r.c, this.s.c) + (this.n ? L5 + L3 + L5 : 0.0f) + L + org.telegram.messenger.g0.L(15.0f) + L);
        float max2 = Math.max(this.n ? L3 : 0.0f, this.s.i() + this.r.i() + L4) + L2 + L2;
        float T1 = org.telegram.messenger.g0.T1(0.6f, 1.0f, d) * this.y.a(0.05f);
        float L6 = (1.0f - d) * org.telegram.messenger.g0.L(15.0f);
        float width = (getWidth() - max) / 2.0f;
        float height = (getHeight() - max2) / 2.0f;
        float width2 = (getWidth() + max) / 2.0f;
        float height2 = (getHeight() + max2) / 2.0f;
        RectF rectF = this.e;
        rectF.set(width, height, width2, height2);
        RectF rectF2 = this.f;
        rectF2.set(rectF);
        org.telegram.messenger.g0.i3(rectF2, T1, rectF2.centerX(), rectF2.centerY());
        rectF2.offset(0.0f, L6);
        int i7 = Build.VERSION.SDK_INT;
        Paint paint = this.x;
        if (i7 < 29 || (obj = this.H) == null || this.G == null) {
            f10 = L;
            f11 = 2.0f;
            paint.setColor(org.telegram.ui.ActionBar.n6.r1(d, -587202560));
            canvas.drawRoundRect(rectF2, org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f), paint);
        } else {
            RenderNode d2 = n2.a0.d(obj);
            Path path = this.w;
            path.rewind();
            f11 = 2.0f;
            f10 = L;
            path.addRoundRect(rectF2, org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f), Path.Direction.CW);
            getLocationOnScreen(this.K);
            this.G.getLocationOnScreen(this.L);
            canvas.saveLayerAlpha(rectF2, (int) (255.0f * d), 31);
            canvas.clipPath(path);
            canvas.translate(r10[0] - r7[0], r10[1] - r7[1]);
            float max3 = Math.max(this.G.getWidth() / d2.getWidth(), this.G.getHeight() / d2.getHeight());
            canvas.scale(max3, max3);
            canvas.drawRenderNode(d2);
            canvas.restore();
            paint.setColor(org.telegram.ui.ActionBar.n6.r1(d, 1879048192));
            canvas.drawRoundRect(rectF2, org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f), paint);
        }
        canvas.save();
        canvas.translate(0.0f, L6);
        canvas.scale(T1, T1, rectF.centerX(), rectF.centerY());
        if (this.n) {
            float f12 = L3 / f11;
            ImageReceiver imageReceiver = this.h;
            imageReceiver.J0((int) f12);
            imageReceiver.y0(rectF.left + f10 + L5, rectF.centerY() - f12, L3, L3);
            imageReceiver.setAlpha(d);
            imageReceiver.h(canvas, null);
        }
        float centerY = rectF.centerY() - ((this.s.i() + (this.r.i() + L4)) / f11);
        vy0 vy0Var2 = this.r;
        vy0Var2.c(rectF.left + (this.n ? L5 + L3 + L5 : 0.0f) + f10, (vy0Var2.i() / f11) + centerY, d, -1, canvas);
        this.s.c(rectF.left + (this.n ? L3 + L5 + L5 : 0.0f) + f10, this.r.i() + centerY + L4 + (this.s.i() / f11), d, org.telegram.ui.ActionBar.n6.w(-16777216, -1610612737), canvas);
        canvas.restore();
    }

    @Override // android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        t8 t8Var;
        boolean z10 = this.E;
        mc mcVar = this.y;
        if (!z10 || this.F == null) {
            this.M = false;
            mcVar.c(false);
            return false;
        }
        int action = motionEvent.getAction();
        RectF rectF = this.e;
        if (action == 0) {
            if (rectF.contains(motionEvent.getX(), motionEvent.getY())) {
                this.M = true;
                mcVar.c(true);
            }
        } else if (motionEvent.getAction() == 2) {
            if (mcVar.i && !rectF.contains(motionEvent.getX(), motionEvent.getY())) {
                mcVar.c(false);
            }
        } else if (motionEvent.getAction() == 1) {
            if (mcVar.i && (t8Var = this.c) != null && this.F != null) {
                t8Var.a(new k6(this, 1));
            }
            mcVar.c(false);
            this.M = false;
        } else if (motionEvent.getAction() == 3) {
            mcVar.c(false);
            this.M = false;
        }
        return this.M || mcVar.i;
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.h.P();
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.h.R();
    }

    public void setLink(String str) {
        boolean isEmpty = TextUtils.isEmpty(str);
        s8 s8Var = this.b;
        org.telegram.messenger.l7 l7Var = null;
        if (isEmpty) {
            org.telegram.messenger.l7 l7Var2 = this.I;
            if (l7Var2 != null) {
                l7Var2.run();
                this.I = null;
            }
            if (this.E) {
                invalidate();
            }
            this.E = false;
            this.J = null;
            if (s8Var != null) {
                s8Var.run();
                return;
            }
            return;
        }
        n6 n6Var = this.F;
        if (!(n6Var == null && this.I == null) && (n6Var == null || TextUtils.equals(n6Var.a, str) || TextUtils.equals(this.J, str))) {
            n6 n6Var2 = this.F;
            if (n6Var2 == null || this.E || !TextUtils.equals(n6Var2.a, str)) {
                return;
            }
            this.E = true;
            a();
            invalidate();
            if (s8Var != null) {
                s8Var.run();
                return;
            }
            return;
        }
        org.telegram.messenger.l7 l7Var3 = this.I;
        if (l7Var3 != null) {
            l7Var3.run();
            this.I = null;
        }
        this.F = null;
        this.J = str;
        int i7 = this.a;
        k6 k6Var = new k6(this, 0);
        try {
            mp u12 = mp.u1(i7);
            String str2 = u12.X2;
            Uri parse = Uri.parse(str);
            if (TextUtils.equals(parse.getHost(), str2)) {
                List<String> pathSegments = parse.getPathSegments();
                if (!pathSegments.isEmpty()) {
                    String str3 = pathSegments.get(0);
                    String queryParameter = parse.getQueryParameter("ref");
                    if (TextUtils.isEmpty(queryParameter)) {
                        TLObject h22 = u12.h2(str3);
                        if (h22 instanceof TLRPC.User) {
                            k6Var.a(new l6(str, (TLRPC.User) h22));
                        } else if (h22 instanceof TLRPC.Chat) {
                            k6Var.a(new m6(str, (TLRPC.Chat) h22));
                        }
                    }
                    l7Var = u12.f2().a(str3, queryParameter, new bi.j(k6Var, u12, str, 9));
                }
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
            k6Var.a(l7Var);
        }
        this.I = l7Var;
    }
}
