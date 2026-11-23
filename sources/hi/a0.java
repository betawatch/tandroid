package hi;

import android.content.Context;
import android.os.SystemClock;
import android.text.Layout;
import android.text.TextPaint;
import android.view.View;
import android.widget.FrameLayout;
import j$.util.Objects;
import java.io.File;
import org.telegram.messenger.w10;
import org.telegram.ui.Components.wy0;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final class a0 {
    public final z a;
    public final r7 b;
    public m.o3 c;
    public Runnable d;
    public u e;
    public tg.d f;
    public float i;
    public final float[] g = new float[2];
    public final float[] h = new float[3];
    public final a8.sa j = new a8.sa(this, 27);

    public a0(File file, z zVar) {
        this.a = zVar;
        this.b = new r7(new wf.b(25, file.getAbsolutePath(), file), zVar.N1(), zVar.Z0(), new w(this, 0));
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

    public static void g(tg.d dVar, float[] fArr) {
        Layout layout = dVar.getEditText().getLayout();
        float extendedPaddingTop = (layout == null || layout.getLineCount() <= 0) ? r0.getExtendedPaddingTop() : r0.getBaseline() - layout.getLineBaseline(0);
        fArr[0] = ((r0.getCompoundPaddingLeft() + r0.getLeft()) - r0.getScrollX()) - (dVar.getWidth() / 2.0f);
        fArr[1] = (r0.getTop() + extendedPaddingTop) - (dVar.getHeight() / 2.0f);
        fArr[2] = (r0.getWidth() - r0.getCompoundPaddingLeft()) - r0.getCompoundPaddingRight();
    }

    public final void a() {
        if (c()) {
            z zVar = this.a;
            tg.d S = zVar.S();
            S.setLoading(true);
            r7 r7Var = this.b;
            Objects.requireNonNull(r7Var);
            S.setPendingProvider(new di.v6(r7Var, 18));
            zVar.M1(S);
            r7Var.i();
            r7Var.n = new x(zVar, 0);
            di.v6 v6Var = new di.v6(new TextPaint(S.getEditText().getPaint()), 19);
            float lineWidth = S.getLineWidth() * 0.96f;
            r7Var.u = v6Var;
            r7Var.v = lineWidth;
            m.o3 o3Var = this.c;
            if (o3Var != null) {
                o3Var.f = null;
                org.telegram.ui.Components.fc fcVar = (org.telegram.ui.Components.fc) o3Var.h;
                if (fcVar != null) {
                    fcVar.b();
                    o3Var.h = null;
                }
                this.c = null;
            }
            Context context = S.getContext();
            FrameLayout N = zVar.N();
            org.telegram.ui.ActionBar.i6 Q = zVar.Q();
            android.support.v4.media.session.a0 a0Var = r7Var.f;
            m.o3 o3Var2 = new m.o3(context, N, Q, a0Var == null ? "" : ai.l0.o(a0Var.i()), new c(1, this, S));
            this.c = o3Var2;
            this.b.h(zVar.N1(), zVar.Z0(), new h6.m(this, o3Var2, S, 1));
        }
    }

    public final void b(tg.d dVar) {
        z zVar = this.a;
        dVar.setPositionProvider(new x(zVar, 1));
        dVar.setOnEditing(new ai.s1(15, this, dVar));
        dVar.setOnSeek(new y(zVar, 0));
        dVar.setRangeProvider(new ob.c(this, 27));
    }

    public final boolean c() {
        return this.b.f != null && this.a.i0() == null;
    }

    public final float d(tg.d dVar, float f10, float f11) {
        float[] fArr = this.g;
        fArr[1] = 0.0f;
        fArr[0] = 0.0f;
        e(this.e, fArr);
        float f12 = fArr[0];
        float f13 = fArr[1];
        fArr[0] = f10;
        fArr[1] = f11;
        e(dVar, fArr);
        fArr[1] = fArr[1] - f13;
        float f14 = fArr[0] - f12;
        fArr[0] = f14;
        return f14;
    }

    public final void f(tg.d dVar) {
        u uVar = this.e;
        a8.sa saVar = this.j;
        if (uVar != null) {
            uVar.b();
            this.e.removeCallbacks(saVar);
        }
        this.f = dVar;
        if (dVar == null) {
            u uVar2 = this.e;
            if (uVar2 != null) {
                uVar2.e(null, null);
                this.e.setVisibility(8);
                return;
            }
            return;
        }
        if (this.e == null) {
            u uVar3 = new u(dVar.getContext());
            this.e = uVar3;
            final int i7 = 0;
            uVar3.setOnClick(new w10(this) { // from class: hi.v
                public final /* synthetic */ a0 b;

                {
                    this.b = this;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // org.telegram.messenger.w10
                public final void a(Object obj) {
                    int i10;
                    String str;
                    long j3;
                    switch (i7) {
                        case 0:
                            int intValue = ((Integer) obj).intValue();
                            a0 a0Var = this.b;
                            tg.d dVar2 = a0Var.f;
                            if (dVar2 != null && a0Var.e != null && dVar2.x(intValue) != null) {
                                a0Var.e.b();
                                String charSequence = dVar2.getText().toString();
                                a0Var.i = dVar2.getMeasuredWidth();
                                float[] fArr = new float[3];
                                a0.g(dVar2, fArr);
                                o7 w10 = dVar2.G0 ? dVar2.w(intValue) : null;
                                if (w10 != null) {
                                    dVar2.E0 = w10;
                                    dVar2.H0 = true;
                                    CharSequence charSequence2 = w10.c;
                                    if (charSequence2 == null) {
                                        charSequence2 = "";
                                    }
                                    dVar2.setText(charSequence2);
                                    dVar2.H0 = false;
                                    dVar2.getEditText().setSelection(dVar2.getEditText().length());
                                    w10 w10Var = dVar2.M0;
                                    if (w10Var != null) {
                                        tg.c cVar = dVar2.O0;
                                        if (cVar != null) {
                                            long j10 = w10.a;
                                            z zVar = ((a0) ((ob.c) cVar).b).a;
                                            i10 = 0;
                                            str = "";
                                            j3 = Math.max(j10, zVar.N1());
                                        } else {
                                            i10 = 0;
                                            str = "";
                                            j3 = w10.a;
                                        }
                                        w10Var.a(Long.valueOf(j3));
                                    } else {
                                        i10 = 0;
                                        str = "";
                                    }
                                    u uVar4 = a0Var.e;
                                    float f10 = fArr[i10];
                                    float f11 = fArr[1];
                                    float f12 = fArr[2];
                                    CharSequence x10 = dVar2.x(-1);
                                    CharSequence x11 = dVar2.x(1);
                                    uVar4.b();
                                    uVar4.K = f10;
                                    uVar4.L = f11;
                                    uVar4.M = f12;
                                    t[] tVarArr = uVar4.a;
                                    t tVar = tVarArr[intValue < 0 ? i10 : 1];
                                    int length = tVarArr.length;
                                    for (int i11 = i10; i11 < length; i11++) {
                                        t tVar2 = tVarArr[i11];
                                        wy0 wy0Var = tVar2.h;
                                        tVar2.i = wy0Var;
                                        tVar2.k = wy0Var != null ? 1 : i10;
                                        tVar2.j = tVar2.e.c;
                                    }
                                    uVar4.S = tVar.g;
                                    uVar4.T = charSequence == null ? str : charSequence.toString();
                                    tVarArr[i10].b(x10 == null ? null : x10.toString());
                                    tVarArr[1].b(x11 != null ? x11.toString() : null);
                                    uVar4.R = tVar;
                                    uVar4.Q = SystemClock.elapsedRealtime();
                                    uVar4.invalidate();
                                    dVar2.getEditText().setAlpha(0.0f);
                                    dVar2.setSelectionWidth(a0Var.i);
                                    break;
                                }
                            }
                            break;
                        default:
                            Float f13 = (Float) obj;
                            a0 a0Var2 = this.b;
                            tg.d dVar3 = a0Var2.f;
                            if (dVar3 != null) {
                                if (f13.floatValue() >= 1.0f) {
                                    dVar3.getEditText().setAlpha(1.0f);
                                    dVar3.setSelectionWidth(-1.0f);
                                    break;
                                } else {
                                    dVar3.setSelectionWidth(org.telegram.messenger.g0.T1(a0Var2.i, dVar3.getMeasuredWidth(), f13.floatValue()));
                                    break;
                                }
                            }
                            break;
                    }
                }
            });
            final int i10 = 1;
            this.e.setOnSwitchProgress(new w10(this) { // from class: hi.v
                public final /* synthetic */ a0 b;

                {
                    this.b = this;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // org.telegram.messenger.w10
                public final void a(Object obj) {
                    int i102;
                    String str;
                    long j3;
                    switch (i10) {
                        case 0:
                            int intValue = ((Integer) obj).intValue();
                            a0 a0Var = this.b;
                            tg.d dVar2 = a0Var.f;
                            if (dVar2 != null && a0Var.e != null && dVar2.x(intValue) != null) {
                                a0Var.e.b();
                                String charSequence = dVar2.getText().toString();
                                a0Var.i = dVar2.getMeasuredWidth();
                                float[] fArr = new float[3];
                                a0.g(dVar2, fArr);
                                o7 w10 = dVar2.G0 ? dVar2.w(intValue) : null;
                                if (w10 != null) {
                                    dVar2.E0 = w10;
                                    dVar2.H0 = true;
                                    CharSequence charSequence2 = w10.c;
                                    if (charSequence2 == null) {
                                        charSequence2 = "";
                                    }
                                    dVar2.setText(charSequence2);
                                    dVar2.H0 = false;
                                    dVar2.getEditText().setSelection(dVar2.getEditText().length());
                                    w10 w10Var = dVar2.M0;
                                    if (w10Var != null) {
                                        tg.c cVar = dVar2.O0;
                                        if (cVar != null) {
                                            long j10 = w10.a;
                                            z zVar = ((a0) ((ob.c) cVar).b).a;
                                            i102 = 0;
                                            str = "";
                                            j3 = Math.max(j10, zVar.N1());
                                        } else {
                                            i102 = 0;
                                            str = "";
                                            j3 = w10.a;
                                        }
                                        w10Var.a(Long.valueOf(j3));
                                    } else {
                                        i102 = 0;
                                        str = "";
                                    }
                                    u uVar4 = a0Var.e;
                                    float f10 = fArr[i102];
                                    float f11 = fArr[1];
                                    float f12 = fArr[2];
                                    CharSequence x10 = dVar2.x(-1);
                                    CharSequence x11 = dVar2.x(1);
                                    uVar4.b();
                                    uVar4.K = f10;
                                    uVar4.L = f11;
                                    uVar4.M = f12;
                                    t[] tVarArr = uVar4.a;
                                    t tVar = tVarArr[intValue < 0 ? i102 : 1];
                                    int length = tVarArr.length;
                                    for (int i11 = i102; i11 < length; i11++) {
                                        t tVar2 = tVarArr[i11];
                                        wy0 wy0Var = tVar2.h;
                                        tVar2.i = wy0Var;
                                        tVar2.k = wy0Var != null ? 1 : i102;
                                        tVar2.j = tVar2.e.c;
                                    }
                                    uVar4.S = tVar.g;
                                    uVar4.T = charSequence == null ? str : charSequence.toString();
                                    tVarArr[i102].b(x10 == null ? null : x10.toString());
                                    tVarArr[1].b(x11 != null ? x11.toString() : null);
                                    uVar4.R = tVar;
                                    uVar4.Q = SystemClock.elapsedRealtime();
                                    uVar4.invalidate();
                                    dVar2.getEditText().setAlpha(0.0f);
                                    dVar2.setSelectionWidth(a0Var.i);
                                    break;
                                }
                            }
                            break;
                        default:
                            Float f13 = (Float) obj;
                            a0 a0Var2 = this.b;
                            tg.d dVar3 = a0Var2.f;
                            if (dVar3 != null) {
                                if (f13.floatValue() >= 1.0f) {
                                    dVar3.getEditText().setAlpha(1.0f);
                                    dVar3.setSelectionWidth(-1.0f);
                                    break;
                                } else {
                                    dVar3.setSelectionWidth(org.telegram.messenger.g0.T1(a0Var2.i, dVar3.getMeasuredWidth(), f13.floatValue()));
                                    break;
                                }
                            }
                            break;
                    }
                }
            });
            this.a.Q0().addView(this.e, c8.na.c(-1.0f, -1));
        }
        this.e.setVisibility(0);
        saVar.run();
    }
}
