// default package

import android.content.Context;
import android.os.SystemClock;
import android.text.Layout;
import android.text.TextPaint;
import android.view.View;
import android.widget.FrameLayout;
import j$.util.Objects;
import java.io.File;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class gc1 {
    public final fc1 a;
    public final r7b b;
    public gd4 c;
    public Runnable d;
    public bc1 e;
    public kc1 f;
    public float i;
    public final float[] g = new float[2];
    public final float[] h = new float[3];
    public final p1 j = new p1(this, 13);

    public gc1(File file, fc1 fc1Var) {
        this.a = fc1Var;
        this.b = new r7b(new k7b(file.getAbsolutePath(), file, (byte) 0), fc1Var.J(), fc1Var.G(), new fv0(this, (byte) 20));
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

    public static void g(kc1 kc1Var, float[] fArr) {
        Layout layout = kc1Var.getEditText().getLayout();
        float extendedPaddingTop = (layout == null || layout.getLineCount() <= 0) ? r0.getExtendedPaddingTop() : r0.getBaseline() - layout.getLineBaseline(0);
        fArr[0] = ((r0.getCompoundPaddingLeft() + r0.getLeft()) - r0.getScrollX()) - (kc1Var.getWidth() / 2.0f);
        fArr[1] = (r0.getTop() + extendedPaddingTop) - (kc1Var.getHeight() / 2.0f);
        fArr[2] = (r0.getWidth() - r0.getCompoundPaddingLeft()) - r0.getCompoundPaddingRight();
    }

    public final void a() {
        if (c()) {
            fc1 fc1Var = this.a;
            kc1 t = fc1Var.t();
            t.setLoading(true);
            r7b r7bVar = this.b;
            Objects.requireNonNull(r7bVar);
            t.setPendingProvider(new tg0(r7bVar, (byte) 29));
            fc1Var.K(t);
            r7bVar.i();
            r7bVar.n = new dc1(fc1Var, (byte) 0);
            ec1 ec1Var = new ec1(new TextPaint(t.getEditText().getPaint()), (byte) 0);
            float lineWidth = t.getLineWidth() * 0.96f;
            r7bVar.u = ec1Var;
            r7bVar.v = lineWidth;
            gd4 gd4Var = this.c;
            if (gd4Var != null) {
                gd4Var.f = null;
                v21 v21Var = (v21) gd4Var.g;
                if (v21Var != null) {
                    v21Var.b();
                    gd4Var.g = null;
                }
                this.c = null;
            }
            Context context = t.getContext();
            FrameLayout m = fc1Var.m();
            vnb r = fc1Var.r();
            pm3 pm3Var = r7bVar.f;
            gd4 gd4Var2 = new gd4(context, m, r, pm3Var == null ? "" : bn3.t(pm3Var.t()), new z21(this, t, (byte) 15));
            this.c = gd4Var2;
            this.b.h(fc1Var.J(), fc1Var.G(), new rx6(this, gd4Var2, t, (byte) 14));
        }
    }

    public final void b(kc1 kc1Var) {
        fc1 fc1Var = this.a;
        kc1Var.setPositionProvider(new dc1(fc1Var, (byte) 1));
        kc1Var.setOnEditing(new y0(this, kc1Var, (byte) 12));
        kc1Var.setOnSeek(new te2(fc1Var, (byte) 13));
        kc1Var.setRangeProvider(new z8d(this, (byte) 16));
    }

    public final boolean c() {
        return this.b.f != null && this.a.w() == null;
    }

    public final float d(kc1 kc1Var, float f, float f2) {
        float[] fArr = this.g;
        fArr[1] = 0.0f;
        fArr[0] = 0.0f;
        e(this.e, fArr);
        float f3 = fArr[0];
        float f4 = fArr[1];
        fArr[0] = f;
        fArr[1] = f2;
        e(kc1Var, fArr);
        fArr[1] = fArr[1] - f4;
        float f5 = fArr[0] - f3;
        fArr[0] = f5;
        return f5;
    }

    public final void f(kc1 kc1Var) {
        bc1 bc1Var = this.e;
        p1 p1Var = this.j;
        if (bc1Var != null) {
            bc1Var.b();
            this.e.removeCallbacks(p1Var);
        }
        this.f = kc1Var;
        bc1 bc1Var2 = this.e;
        if (kc1Var == null) {
            if (bc1Var2 != null) {
                bc1Var2.e(null, null);
                this.e.setVisibility(8);
                return;
            }
            return;
        }
        final byte b = 0;
        if (bc1Var2 == null) {
            bc1 bc1Var3 = new bc1(kc1Var.getContext());
            this.e = bc1Var3;
            bc1Var3.setOnClick(new pcc(this) { // from class: cc1
                public final /* synthetic */ gc1 b;

                {
                    this.b = this;
                }

                @Override // pcc
                public final void a(Object obj) {
                    byte b2 = b;
                    gc1 gc1Var = this.b;
                    switch (b2) {
                        case 0:
                            int intValue = ((Integer) obj).intValue();
                            kc1 kc1Var2 = gc1Var.f;
                            if (kc1Var2 != null && gc1Var.e != null && kc1Var2.x(intValue) != null) {
                                gc1Var.e.b();
                                String charSequence = kc1Var2.getText().toString();
                                gc1Var.i = kc1Var2.getMeasuredWidth();
                                float[] fArr = new float[3];
                                gc1.g(kc1Var2, fArr);
                                o7b w = kc1Var2.G0 ? kc1Var2.w(intValue) : null;
                                if (w != null) {
                                    kc1Var2.E0 = w;
                                    kc1Var2.H0 = true;
                                    CharSequence charSequence2 = w.c;
                                    if (charSequence2 == null) {
                                        charSequence2 = "";
                                    }
                                    kc1Var2.setText(charSequence2);
                                    kc1Var2.H0 = false;
                                    kc1Var2.getEditText().setSelection(kc1Var2.getEditText().length());
                                    pcc pccVar = kc1Var2.M0;
                                    if (pccVar != null) {
                                        jc1 jc1Var = kc1Var2.O0;
                                        long j = w.a;
                                        if (jc1Var != null) {
                                            j = Math.max(j, ((gc1) ((z8d) jc1Var).b).a.J());
                                        }
                                        pccVar.a(Long.valueOf(j));
                                    }
                                    bc1 bc1Var4 = gc1Var.e;
                                    float f = fArr[0];
                                    float f2 = fArr[1];
                                    float f3 = fArr[2];
                                    CharSequence x = kc1Var2.x(-1);
                                    CharSequence x2 = kc1Var2.x(1);
                                    bc1Var4.b();
                                    bc1Var4.K = f;
                                    bc1Var4.L = f2;
                                    bc1Var4.M = f3;
                                    ac1[] ac1VarArr = bc1Var4.a;
                                    ac1 ac1Var = ac1VarArr[intValue < 0 ? (char) 0 : (char) 1];
                                    for (ac1 ac1Var2 : ac1VarArr) {
                                        pkb pkbVar = ac1Var2.h;
                                        ac1Var2.i = pkbVar;
                                        ac1Var2.k = pkbVar != null;
                                        ac1Var2.j = ac1Var2.e.c;
                                    }
                                    bc1Var4.S = ac1Var.g;
                                    bc1Var4.T = charSequence != null ? charSequence.toString() : "";
                                    ac1VarArr[0].b(x == null ? null : x.toString());
                                    ac1VarArr[1].b(x2 != null ? x2.toString() : null);
                                    bc1Var4.R = ac1Var;
                                    bc1Var4.Q = SystemClock.elapsedRealtime();
                                    bc1Var4.invalidate();
                                    kc1Var2.getEditText().setAlpha(0.0f);
                                    kc1Var2.setSelectionWidth(gc1Var.i);
                                    break;
                                }
                            }
                            break;
                        default:
                            Float f4 = (Float) obj;
                            kc1 kc1Var3 = gc1Var.f;
                            if (kc1Var3 != null) {
                                if (f4.floatValue() >= 1.0f) {
                                    kc1Var3.getEditText().setAlpha(1.0f);
                                    kc1Var3.setSelectionWidth(-1.0f);
                                    break;
                                } else {
                                    kc1Var3.setSelectionWidth(hl.R1(gc1Var.i, kc1Var3.getMeasuredWidth(), f4.floatValue()));
                                    break;
                                }
                            }
                            break;
                    }
                }
            });
            final byte b2 = 1;
            this.e.setOnSwitchProgress(new pcc(this) { // from class: cc1
                public final /* synthetic */ gc1 b;

                {
                    this.b = this;
                }

                @Override // pcc
                public final void a(Object obj) {
                    byte b22 = b2;
                    gc1 gc1Var = this.b;
                    switch (b22) {
                        case 0:
                            int intValue = ((Integer) obj).intValue();
                            kc1 kc1Var2 = gc1Var.f;
                            if (kc1Var2 != null && gc1Var.e != null && kc1Var2.x(intValue) != null) {
                                gc1Var.e.b();
                                String charSequence = kc1Var2.getText().toString();
                                gc1Var.i = kc1Var2.getMeasuredWidth();
                                float[] fArr = new float[3];
                                gc1.g(kc1Var2, fArr);
                                o7b w = kc1Var2.G0 ? kc1Var2.w(intValue) : null;
                                if (w != null) {
                                    kc1Var2.E0 = w;
                                    kc1Var2.H0 = true;
                                    CharSequence charSequence2 = w.c;
                                    if (charSequence2 == null) {
                                        charSequence2 = "";
                                    }
                                    kc1Var2.setText(charSequence2);
                                    kc1Var2.H0 = false;
                                    kc1Var2.getEditText().setSelection(kc1Var2.getEditText().length());
                                    pcc pccVar = kc1Var2.M0;
                                    if (pccVar != null) {
                                        jc1 jc1Var = kc1Var2.O0;
                                        long j = w.a;
                                        if (jc1Var != null) {
                                            j = Math.max(j, ((gc1) ((z8d) jc1Var).b).a.J());
                                        }
                                        pccVar.a(Long.valueOf(j));
                                    }
                                    bc1 bc1Var4 = gc1Var.e;
                                    float f = fArr[0];
                                    float f2 = fArr[1];
                                    float f3 = fArr[2];
                                    CharSequence x = kc1Var2.x(-1);
                                    CharSequence x2 = kc1Var2.x(1);
                                    bc1Var4.b();
                                    bc1Var4.K = f;
                                    bc1Var4.L = f2;
                                    bc1Var4.M = f3;
                                    ac1[] ac1VarArr = bc1Var4.a;
                                    ac1 ac1Var = ac1VarArr[intValue < 0 ? (char) 0 : (char) 1];
                                    for (ac1 ac1Var2 : ac1VarArr) {
                                        pkb pkbVar = ac1Var2.h;
                                        ac1Var2.i = pkbVar;
                                        ac1Var2.k = pkbVar != null;
                                        ac1Var2.j = ac1Var2.e.c;
                                    }
                                    bc1Var4.S = ac1Var.g;
                                    bc1Var4.T = charSequence != null ? charSequence.toString() : "";
                                    ac1VarArr[0].b(x == null ? null : x.toString());
                                    ac1VarArr[1].b(x2 != null ? x2.toString() : null);
                                    bc1Var4.R = ac1Var;
                                    bc1Var4.Q = SystemClock.elapsedRealtime();
                                    bc1Var4.invalidate();
                                    kc1Var2.getEditText().setAlpha(0.0f);
                                    kc1Var2.setSelectionWidth(gc1Var.i);
                                    break;
                                }
                            }
                            break;
                        default:
                            Float f4 = (Float) obj;
                            kc1 kc1Var3 = gc1Var.f;
                            if (kc1Var3 != null) {
                                if (f4.floatValue() >= 1.0f) {
                                    kc1Var3.getEditText().setAlpha(1.0f);
                                    kc1Var3.setSelectionWidth(-1.0f);
                                    break;
                                } else {
                                    kc1Var3.setSelectionWidth(hl.R1(gc1Var.i, kc1Var3.getMeasuredWidth(), f4.floatValue()));
                                    break;
                                }
                            }
                            break;
                    }
                }
            });
            this.a.D().addView(this.e, tre.c(-1.0f, -1));
        }
        this.e.setVisibility(0);
        p1Var.run();
    }
}
