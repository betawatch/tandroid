package gi;

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
import org.telegram.messenger.hp;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.ly0;
import org.telegram.ui.Components.wp;
import org.telegram.ui.Components.xq;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class r6 extends View {
    public boolean E;
    public q6 F;
    public View G;
    public Object H;
    public org.telegram.messenger.k7 I;
    public String J;
    public final int[] K;
    public final int[] L;
    public boolean M;
    public final int a;
    public final v8 b;
    public w8 c;
    public final org.telegram.ui.Components.u5 d;
    public final RectF e;
    public final RectF f;
    public final ImageReceiver h;
    public boolean n;
    public ly0 r;
    public ly0 s;
    public final Path w;
    public final Paint x;
    public final gc y;

    public r6(Activity activity, int i3, v8 v8Var) {
        super(activity);
        this.d = new org.telegram.ui.Components.u5(this, 0L, 320L, xq.h);
        this.e = new RectF();
        this.f = new RectF();
        this.h = new ImageReceiver(this);
        this.w = new Path();
        this.x = new Paint(1);
        this.y = new gc(this);
        this.K = new int[2];
        this.L = new int[2];
        this.a = i3;
        this.b = v8Var;
    }

    public final void a() {
        q6 q6Var = this.F;
        if (q6Var == null) {
            return;
        }
        this.r = new ly0(q6Var.b(), 16.0f, org.telegram.messenger.g0.o());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.F.a());
        if (spannableStringBuilder.toString().contains(">")) {
            spannableStringBuilder.clear();
            spannableStringBuilder.append((CharSequence) org.telegram.messenger.g0.H2(this.F.a(), false));
        } else {
            spannableStringBuilder.append((CharSequence) " ");
            spannableStringBuilder.append((CharSequence) ">");
            wp wpVar = new wp(R.drawable.settings_arrow, 0);
            wpVar.I = 1.25f;
            wpVar.J = 1.25f;
            spannableStringBuilder.setSpan(wpVar, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
        }
        this.s = new ly0(spannableStringBuilder, 14.0f, null);
        this.F.d(this.h);
        this.n = true;
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        float f11;
        Object obj;
        float d = this.d.d(this.E);
        ly0 ly0Var = this.r;
        if (ly0Var == null || this.s == null || d <= 0.0f) {
            return;
        }
        ly0Var.p = getWidth() * 0.7f;
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
        int i3 = Build.VERSION.SDK_INT;
        Paint paint = this.x;
        if (i3 < 29 || (obj = this.H) == null || this.G == null) {
            f10 = L;
            f11 = 2.0f;
            paint.setColor(org.telegram.ui.ActionBar.k6.r1(d, -587202560));
            canvas.drawRoundRect(rectF2, org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f), paint);
        } else {
            RenderNode d10 = o4.v0.d(obj);
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
            float max3 = Math.max(this.G.getWidth() / d10.getWidth(), this.G.getHeight() / d10.getHeight());
            canvas.scale(max3, max3);
            canvas.drawRenderNode(d10);
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
        ly0 ly0Var2 = this.r;
        ly0Var2.c(rectF.left + (this.n ? L5 + L3 + L5 : 0.0f) + f10, (ly0Var2.i() / f11) + centerY, d, -1, canvas);
        this.s.c(rectF.left + (this.n ? L3 + L5 + L5 : 0.0f) + f10, this.r.i() + centerY + L4 + (this.s.i() / f11), d, org.telegram.ui.ActionBar.k6.w(-16777216, -1610612737), canvas);
        canvas.restore();
    }

    @Override // android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        w8 w8Var;
        boolean z10 = this.E;
        gc gcVar = this.y;
        if (!z10 || this.F == null) {
            this.M = false;
            gcVar.c(false);
            return false;
        }
        int action = motionEvent.getAction();
        RectF rectF = this.e;
        if (action == 0) {
            if (rectF.contains(motionEvent.getX(), motionEvent.getY())) {
                this.M = true;
                gcVar.c(true);
            }
        } else if (motionEvent.getAction() == 2) {
            if (gcVar.i && !rectF.contains(motionEvent.getX(), motionEvent.getY())) {
                gcVar.c(false);
            }
        } else if (motionEvent.getAction() == 1) {
            if (gcVar.i && (w8Var = this.c) != null && this.F != null) {
                w8Var.a(new n6(this, 1));
            }
            gcVar.c(false);
            this.M = false;
        } else if (motionEvent.getAction() == 3) {
            gcVar.c(false);
            this.M = false;
        }
        return this.M || gcVar.i;
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
        v8 v8Var = this.b;
        org.telegram.messenger.k7 k7Var = null;
        if (isEmpty) {
            org.telegram.messenger.k7 k7Var2 = this.I;
            if (k7Var2 != null) {
                k7Var2.run();
                this.I = null;
            }
            if (this.E) {
                invalidate();
            }
            this.E = false;
            this.J = null;
            if (v8Var != null) {
                v8Var.run();
                return;
            }
            return;
        }
        q6 q6Var = this.F;
        if (!(q6Var == null && this.I == null) && (q6Var == null || TextUtils.equals(q6Var.a, str) || TextUtils.equals(this.J, str))) {
            q6 q6Var2 = this.F;
            if (q6Var2 == null || this.E || !TextUtils.equals(q6Var2.a, str)) {
                return;
            }
            this.E = true;
            a();
            invalidate();
            if (v8Var != null) {
                v8Var.run();
                return;
            }
            return;
        }
        org.telegram.messenger.k7 k7Var3 = this.I;
        if (k7Var3 != null) {
            k7Var3.run();
            this.I = null;
        }
        this.F = null;
        this.J = str;
        int i3 = this.a;
        n6 n6Var = new n6(this, 0);
        try {
            hp s12 = hp.s1(i3);
            String str2 = s12.V2;
            Uri parse = Uri.parse(str);
            if (TextUtils.equals(parse.getHost(), str2)) {
                List<String> pathSegments = parse.getPathSegments();
                if (!pathSegments.isEmpty()) {
                    String str3 = pathSegments.get(0);
                    String queryParameter = parse.getQueryParameter("ref");
                    if (TextUtils.isEmpty(queryParameter)) {
                        TLObject f22 = s12.f2(str3);
                        if (f22 instanceof TLRPC.User) {
                            n6Var.a(new o6(str, (TLRPC.User) f22));
                        } else if (f22 instanceof TLRPC.Chat) {
                            n6Var.a(new p6(str, (TLRPC.Chat) f22));
                        }
                    }
                    k7Var = s12.d2().a(str3, queryParameter, new ai.m(n6Var, s12, str, 6));
                }
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
            n6Var.a(k7Var);
        }
        this.I = k7Var;
    }
}
