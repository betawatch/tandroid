// default package

import android.content.Context;
import android.os.SystemClock;
import android.text.Layout;
import android.text.TextPaint;
import android.view.View;
import android.widget.FrameLayout;
import j$.util.Objects;
import java.io.File;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class gd1 {
    public final fd1 a;
    public final v5b b;
    public jd4 c;
    public Runnable d;
    public ad1 e;
    public kd1 f;
    public float i;
    public final float[] g = new float[2];
    public final float[] h = new float[3];
    public final o1 j = new o1(this, 13);

    public gd1(File file, fd1 fd1Var) {
        this.a = fd1Var;
        this.b = new v5b(new wm4(file.getAbsolutePath(), file, (byte) 29), fd1Var.N(), fd1Var.K(), new yt0(this, (byte) 20));
    }

    public static void e(View view, float[] fArr) {
        while (view != null) {
            view.getMatrix().mapPoints(fArr);
            fArr[0] = fArr[0] + view.getLeft();
            fArr[1] = fArr[1] + view.getTop();
            if (!(view.getParent() instanceof View)) {
                return;
            }
            view = (View) view.getParent();
            fArr[0] = fArr[0] - view.getScrollX();
            fArr[1] = fArr[1] - view.getScrollY();
        }
    }

    public static void g(kd1 kd1Var, float[] fArr) {
        Layout layout = kd1Var.getEditText().getLayout();
        float extendedPaddingTop = (layout == null || layout.getLineCount() <= 0) ? r0.getExtendedPaddingTop() : r0.getBaseline() - layout.getLineBaseline(0);
        fArr[0] = ((r0.getCompoundPaddingLeft() + r0.getLeft()) - r0.getScrollX()) - (kd1Var.getWidth() / 2.0f);
        fArr[1] = (r0.getTop() + extendedPaddingTop) - (kd1Var.getHeight() / 2.0f);
        fArr[2] = (r0.getWidth() - r0.getCompoundPaddingLeft()) - r0.getCompoundPaddingRight();
    }

    public final void a() {
        if (c()) {
            fd1 fd1Var = this.a;
            kd1 u = fd1Var.u();
            u.setLoading(true);
            v5b v5bVar = this.b;
            Objects.requireNonNull(v5bVar);
            u.setPendingProvider(new cd1(v5bVar, (byte) 0));
            fd1Var.P(u);
            v5bVar.i();
            v5bVar.n = new dd1(fd1Var, (byte) 0);
            ed1 ed1Var = new ed1(new TextPaint(u.getEditText().getPaint()), (byte) 0);
            float lineWidth = u.getLineWidth() * 0.96f;
            v5bVar.u = ed1Var;
            v5bVar.v = lineWidth;
            jd4 jd4Var = this.c;
            if (jd4Var != null) {
                jd4Var.f = null;
                u31 u31Var = (u31) jd4Var.g;
                if (u31Var != null) {
                    u31Var.b();
                    jd4Var.g = null;
                }
                this.c = null;
            }
            Context context = u.getContext();
            FrameLayout q = fd1Var.q();
            ylb t = fd1Var.t();
            in3 in3Var = v5bVar.f;
            jd4 jd4Var2 = new jd4(context, q, t, in3Var == null ? "" : un3.r(in3Var.t()), new y31(this, u, (byte) 16));
            this.c = jd4Var2;
            this.b.h(fd1Var.N(), fd1Var.K(), new mx6(this, jd4Var2, u, (byte) 14));
        }
    }

    public final void b(kd1 kd1Var) {
        fd1 fd1Var = this.a;
        kd1Var.setPositionProvider(new dd1(fd1Var, (byte) 1));
        byte b = 13;
        kd1Var.setOnEditing(new x0(this, kd1Var, b));
        kd1Var.setOnSeek(new mf2(fd1Var, b));
        kd1Var.setRangeProvider(new k6d(this, (byte) 16));
    }

    public final boolean c() {
        return this.b.f != null && this.a.A() == null;
    }

    public final float d(kd1 kd1Var, float f, float f2) {
        float[] fArr = this.g;
        fArr[1] = 0.0f;
        fArr[0] = 0.0f;
        e(this.e, fArr);
        float f3 = fArr[0];
        float f4 = fArr[1];
        fArr[0] = f;
        fArr[1] = f2;
        e(kd1Var, fArr);
        fArr[1] = fArr[1] - f4;
        float f5 = fArr[0] - f3;
        fArr[0] = f5;
        return f5;
    }

    public final void f(kd1 kd1Var) {
        ad1 ad1Var = this.e;
        o1 o1Var = this.j;
        if (ad1Var != null) {
            ad1Var.b();
            this.e.removeCallbacks(o1Var);
        }
        this.f = kd1Var;
        ad1 ad1Var2 = this.e;
        if (kd1Var == null) {
            if (ad1Var2 != null) {
                ad1Var2.e(null, null);
                this.e.setVisibility(8);
                return;
            }
            return;
        }
        final byte b = 0;
        if (ad1Var2 == null) {
            ad1 ad1Var3 = new ad1(kd1Var.getContext());
            this.e = ad1Var3;
            ad1Var3.setOnClick(new qac(this) { // from class: bd1
                public final /* synthetic */ gd1 b;

                {
                    this.b = this;
                }

                @Override // qac
                public final void a(Object obj) {
                    byte b2 = b;
                    gd1 gd1Var = this.b;
                    switch (b2) {
                        case 0:
                            int intValue = ((Integer) obj).intValue();
                            kd1 kd1Var2 = gd1Var.f;
                            if (kd1Var2 != null && gd1Var.e != null && kd1Var2.x(intValue) != null) {
                                gd1Var.e.b();
                                String charSequence = kd1Var2.getText().toString();
                                gd1Var.i = kd1Var2.getMeasuredWidth();
                                float[] fArr = new float[3];
                                gd1.g(kd1Var2, fArr);
                                s5b w = kd1Var2.G0 ? kd1Var2.w(intValue) : null;
                                if (w != null) {
                                    kd1Var2.E0 = w;
                                    kd1Var2.H0 = true;
                                    CharSequence charSequence2 = w.c;
                                    if (charSequence2 == null) {
                                        charSequence2 = "";
                                    }
                                    kd1Var2.setText(charSequence2);
                                    kd1Var2.H0 = false;
                                    kd1Var2.getEditText().setSelection(kd1Var2.getEditText().length());
                                    qac qacVar = kd1Var2.M0;
                                    if (qacVar != null) {
                                        jd1 jd1Var = kd1Var2.O0;
                                        long j = w.a;
                                        if (jd1Var != null) {
                                            j = Math.max(j, ((gd1) ((k6d) jd1Var).b).a.N());
                                        }
                                        qacVar.a(Long.valueOf(j));
                                    }
                                    ad1 ad1Var4 = gd1Var.e;
                                    float f = fArr[0];
                                    float f2 = fArr[1];
                                    float f3 = fArr[2];
                                    CharSequence x = kd1Var2.x(-1);
                                    CharSequence x2 = kd1Var2.x(1);
                                    ad1Var4.b();
                                    ad1Var4.K = f;
                                    ad1Var4.L = f2;
                                    ad1Var4.M = f3;
                                    zc1[] zc1VarArr = ad1Var4.a;
                                    zc1 zc1Var = zc1VarArr[intValue < 0 ? (char) 0 : (char) 1];
                                    for (zc1 zc1Var2 : zc1VarArr) {
                                        uib uibVar = zc1Var2.h;
                                        zc1Var2.i = uibVar;
                                        zc1Var2.k = uibVar != null;
                                        zc1Var2.j = zc1Var2.e.c;
                                    }
                                    ad1Var4.S = zc1Var.g;
                                    ad1Var4.T = charSequence != null ? charSequence.toString() : "";
                                    zc1VarArr[0].b(x == null ? null : x.toString());
                                    zc1VarArr[1].b(x2 != null ? x2.toString() : null);
                                    ad1Var4.R = zc1Var;
                                    ad1Var4.Q = SystemClock.elapsedRealtime();
                                    ad1Var4.invalidate();
                                    kd1Var2.getEditText().setAlpha(0.0f);
                                    kd1Var2.setSelectionWidth(gd1Var.i);
                                    break;
                                }
                            }
                            break;
                        default:
                            Float f4 = (Float) obj;
                            kd1 kd1Var3 = gd1Var.f;
                            if (kd1Var3 != null) {
                                if (f4.floatValue() >= 1.0f) {
                                    kd1Var3.getEditText().setAlpha(1.0f);
                                    kd1Var3.setSelectionWidth(-1.0f);
                                    break;
                                } else {
                                    kd1Var3.setSelectionWidth(gm.R1(gd1Var.i, kd1Var3.getMeasuredWidth(), f4.floatValue()));
                                    break;
                                }
                            }
                            break;
                    }
                }
            });
            final byte b2 = 1;
            this.e.setOnSwitchProgress(new qac(this) { // from class: bd1
                public final /* synthetic */ gd1 b;

                {
                    this.b = this;
                }

                @Override // qac
                public final void a(Object obj) {
                    byte b22 = b2;
                    gd1 gd1Var = this.b;
                    switch (b22) {
                        case 0:
                            int intValue = ((Integer) obj).intValue();
                            kd1 kd1Var2 = gd1Var.f;
                            if (kd1Var2 != null && gd1Var.e != null && kd1Var2.x(intValue) != null) {
                                gd1Var.e.b();
                                String charSequence = kd1Var2.getText().toString();
                                gd1Var.i = kd1Var2.getMeasuredWidth();
                                float[] fArr = new float[3];
                                gd1.g(kd1Var2, fArr);
                                s5b w = kd1Var2.G0 ? kd1Var2.w(intValue) : null;
                                if (w != null) {
                                    kd1Var2.E0 = w;
                                    kd1Var2.H0 = true;
                                    CharSequence charSequence2 = w.c;
                                    if (charSequence2 == null) {
                                        charSequence2 = "";
                                    }
                                    kd1Var2.setText(charSequence2);
                                    kd1Var2.H0 = false;
                                    kd1Var2.getEditText().setSelection(kd1Var2.getEditText().length());
                                    qac qacVar = kd1Var2.M0;
                                    if (qacVar != null) {
                                        jd1 jd1Var = kd1Var2.O0;
                                        long j = w.a;
                                        if (jd1Var != null) {
                                            j = Math.max(j, ((gd1) ((k6d) jd1Var).b).a.N());
                                        }
                                        qacVar.a(Long.valueOf(j));
                                    }
                                    ad1 ad1Var4 = gd1Var.e;
                                    float f = fArr[0];
                                    float f2 = fArr[1];
                                    float f3 = fArr[2];
                                    CharSequence x = kd1Var2.x(-1);
                                    CharSequence x2 = kd1Var2.x(1);
                                    ad1Var4.b();
                                    ad1Var4.K = f;
                                    ad1Var4.L = f2;
                                    ad1Var4.M = f3;
                                    zc1[] zc1VarArr = ad1Var4.a;
                                    zc1 zc1Var = zc1VarArr[intValue < 0 ? (char) 0 : (char) 1];
                                    for (zc1 zc1Var2 : zc1VarArr) {
                                        uib uibVar = zc1Var2.h;
                                        zc1Var2.i = uibVar;
                                        zc1Var2.k = uibVar != null;
                                        zc1Var2.j = zc1Var2.e.c;
                                    }
                                    ad1Var4.S = zc1Var.g;
                                    ad1Var4.T = charSequence != null ? charSequence.toString() : "";
                                    zc1VarArr[0].b(x == null ? null : x.toString());
                                    zc1VarArr[1].b(x2 != null ? x2.toString() : null);
                                    ad1Var4.R = zc1Var;
                                    ad1Var4.Q = SystemClock.elapsedRealtime();
                                    ad1Var4.invalidate();
                                    kd1Var2.getEditText().setAlpha(0.0f);
                                    kd1Var2.setSelectionWidth(gd1Var.i);
                                    break;
                                }
                            }
                            break;
                        default:
                            Float f4 = (Float) obj;
                            kd1 kd1Var3 = gd1Var.f;
                            if (kd1Var3 != null) {
                                if (f4.floatValue() >= 1.0f) {
                                    kd1Var3.getEditText().setAlpha(1.0f);
                                    kd1Var3.setSelectionWidth(-1.0f);
                                    break;
                                } else {
                                    kd1Var3.setSelectionWidth(gm.R1(gd1Var.i, kd1Var3.getMeasuredWidth(), f4.floatValue()));
                                    break;
                                }
                            }
                            break;
                    }
                }
            });
            this.a.G().addView(this.e, qoe.c(-1.0f, -1));
        }
        this.e.setVisibility(0);
        o1Var.run();
    }
}
