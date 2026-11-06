package fi;

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
import org.telegram.messenger.qp;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ic;
import org.telegram.ui.Components.my0;
import org.telegram.ui.Components.wp;
import org.telegram.ui.Components.xq;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class q6 extends View {
    public boolean D;
    public p6 E;
    public View F;
    public Object G;
    public org.telegram.messenger.k7 H;
    public String I;
    public final int[] J;
    public final int[] K;
    public boolean L;
    public final int a;
    public final u8 b;
    public v8 c;
    public final org.telegram.ui.Components.w5 d;
    public final RectF e;
    public final RectF f;
    public final ImageReceiver h;
    public boolean n;
    public my0 r;
    public my0 s;
    public final Path w;
    public final Paint x;
    public final ic y;

    public q6(Activity activity, int i7, u8 u8Var) {
        super(activity);
        this.d = new org.telegram.ui.Components.w5(this, 0L, 320L, xq.h);
        this.e = new RectF();
        this.f = new RectF();
        this.h = new ImageReceiver(this);
        this.w = new Path();
        this.x = new Paint(1);
        this.y = new ic(this);
        this.J = new int[2];
        this.K = new int[2];
        this.a = i7;
        this.b = u8Var;
    }

    public final void a() {
        p6 p6Var = this.E;
        if (p6Var == null) {
            return;
        }
        this.r = new my0(p6Var.b(), 16.0f, org.telegram.messenger.g0.o());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.E.a());
        if (spannableStringBuilder.toString().contains(">")) {
            spannableStringBuilder.clear();
            spannableStringBuilder.append((CharSequence) org.telegram.messenger.g0.H2(this.E.a(), false));
        } else {
            spannableStringBuilder.append((CharSequence) " ");
            spannableStringBuilder.append((CharSequence) ">");
            wp wpVar = new wp(R.drawable.settings_arrow, 0);
            wpVar.H = 1.25f;
            wpVar.I = 1.25f;
            spannableStringBuilder.setSpan(wpVar, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
        }
        this.s = new my0(spannableStringBuilder, 14.0f, null);
        this.E.d(this.h);
        this.n = true;
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        float f11;
        Object obj;
        float d = this.d.d(this.D);
        my0 my0Var = this.r;
        if (my0Var == null || this.s == null || d <= 0.0f) {
            return;
        }
        my0Var.p = getWidth() * 0.7f;
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
        org.telegram.messenger.g0.j3(rectF2, T1, rectF2.centerX(), rectF2.centerY());
        rectF2.offset(0.0f, L6);
        int i7 = Build.VERSION.SDK_INT;
        Paint paint = this.x;
        if (i7 < 29 || (obj = this.G) == null || this.F == null) {
            f10 = L;
            f11 = 2.0f;
            paint.setColor(org.telegram.ui.ActionBar.k6.r1(d, -587202560));
            canvas.drawRoundRect(rectF2, org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f), paint);
        } else {
            RenderNode e10 = ni.a.e(obj);
            Path path = this.w;
            path.rewind();
            f11 = 2.0f;
            f10 = L;
            path.addRoundRect(rectF2, org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f), Path.Direction.CW);
            getLocationOnScreen(this.J);
            this.F.getLocationOnScreen(this.K);
            canvas.saveLayerAlpha(rectF2, (int) (255.0f * d), 31);
            canvas.clipPath(path);
            canvas.translate(r10[0] - r7[0], r10[1] - r7[1]);
            float max3 = Math.max(this.F.getWidth() / e10.getWidth(), this.F.getHeight() / e10.getHeight());
            canvas.scale(max3, max3);
            canvas.drawRenderNode(e10);
            canvas.restore();
            paint.setColor(org.telegram.ui.ActionBar.k6.r1(d, 1879048192));
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
        my0 my0Var2 = this.r;
        my0Var2.c(rectF.left + (this.n ? L5 + L3 + L5 : 0.0f) + f10, (my0Var2.i() / f11) + centerY, d, -1, canvas);
        this.s.c(rectF.left + (this.n ? L3 + L5 + L5 : 0.0f) + f10, this.r.i() + centerY + L4 + (this.s.i() / f11), d, org.telegram.ui.ActionBar.k6.w(-16777216, -1610612737), canvas);
        canvas.restore();
    }

    @Override // android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        v8 v8Var;
        boolean z9 = this.D;
        ic icVar = this.y;
        if (!z9 || this.E == null) {
            this.L = false;
            icVar.c(false);
            return false;
        }
        int action = motionEvent.getAction();
        RectF rectF = this.e;
        if (action == 0) {
            if (rectF.contains(motionEvent.getX(), motionEvent.getY())) {
                this.L = true;
                icVar.c(true);
            }
        } else if (motionEvent.getAction() == 2) {
            if (icVar.i && !rectF.contains(motionEvent.getX(), motionEvent.getY())) {
                icVar.c(false);
            }
        } else if (motionEvent.getAction() == 1) {
            if (icVar.i && (v8Var = this.c) != null && this.E != null) {
                v8Var.a(new m6(this, 1));
            }
            icVar.c(false);
            this.L = false;
        } else if (motionEvent.getAction() == 3) {
            icVar.c(false);
            this.L = false;
        }
        return this.L || icVar.i;
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
        u8 u8Var = this.b;
        org.telegram.messenger.k7 k7Var = null;
        if (isEmpty) {
            org.telegram.messenger.k7 k7Var2 = this.H;
            if (k7Var2 != null) {
                k7Var2.run();
                this.H = null;
            }
            if (this.D) {
                invalidate();
            }
            this.D = false;
            this.I = null;
            if (u8Var != null) {
                u8Var.run();
                return;
            }
            return;
        }
        p6 p6Var = this.E;
        if (!(p6Var == null && this.H == null) && (p6Var == null || TextUtils.equals(p6Var.a, str) || TextUtils.equals(this.I, str))) {
            p6 p6Var2 = this.E;
            if (p6Var2 == null || this.D || !TextUtils.equals(p6Var2.a, str)) {
                return;
            }
            this.D = true;
            a();
            invalidate();
            if (u8Var != null) {
                u8Var.run();
                return;
            }
            return;
        }
        org.telegram.messenger.k7 k7Var3 = this.H;
        if (k7Var3 != null) {
            k7Var3.run();
            this.H = null;
        }
        this.E = null;
        this.I = str;
        int i7 = this.a;
        m6 m6Var = new m6(this, 0);
        try {
            qp s12 = qp.s1(i7);
            String str2 = s12.U2;
            Uri parse = Uri.parse(str);
            if (TextUtils.equals(parse.getHost(), str2)) {
                List<String> pathSegments = parse.getPathSegments();
                if (!pathSegments.isEmpty()) {
                    String str3 = pathSegments.get(0);
                    String queryParameter = parse.getQueryParameter("ref");
                    if (TextUtils.isEmpty(queryParameter)) {
                        TLObject f22 = s12.f2(str3);
                        if (f22 instanceof TLRPC.User) {
                            m6Var.a(new n6(str, (TLRPC.User) f22));
                        } else if (f22 instanceof TLRPC.Chat) {
                            m6Var.a(new o6(str, (TLRPC.Chat) f22));
                        }
                    }
                    k7Var = s12.d2().a(str3, queryParameter, new bi.v3(m6Var, s12, str, 4));
                }
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
            m6Var.a(k7Var);
        }
        this.H = k7Var;
    }
}
