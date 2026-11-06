package fi;

import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.gf;
import org.telegram.messenger.hd;
import org.telegram.messenger.qs;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.vi0;
import org.telegram.ui.Components.xi0;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class z2 extends vi0 {
    public final /* synthetic */ f3 c;

    public z2(f3 f3Var) {
        this.c = f3Var;
    }

    @Override // org.telegram.ui.Components.oj0
    public final boolean D(v4.d1 d1Var) {
        return d1Var.f == 2;
    }

    @Override // org.telegram.ui.Components.vi0
    public final String F(int i7) {
        gf gfVar;
        int i10 = i7 - 2;
        f3 f3Var = this.c;
        if (f3Var.c0) {
            if (i10 == 0) {
                return null;
            }
            i10 = i7 - 3;
        } else if (f3Var.d0) {
            if (i10 >= 0 && i10 < f3Var.b0.size()) {
                return hd.e0(((e7) f3Var.b0.get(i10)).d / 1000, true);
            }
            i10 -= f3Var.b0.size();
        }
        ArrayList arrayList = f3Var.f0;
        if (arrayList == null || i10 < 0 || i10 >= arrayList.size() || (gfVar = (gf) f3Var.f0.get(i10)) == null) {
            return null;
        }
        long j3 = gfVar.D;
        if (Build.VERSION.SDK_INT <= 28) {
            j3 /= 1000;
        }
        return hd.e0(j3, true);
    }

    @Override // org.telegram.ui.Components.vi0
    public final void G(pj0 pj0Var, float f10, int[] iArr) {
        int e10 = e();
        float width = (pj0Var.getWidth() - pj0Var.getPaddingLeft()) - pj0Var.getPaddingRight();
        f3 f3Var = this.c;
        ei.h hVar = f3Var.e;
        float f11 = hVar.J;
        int i7 = (int) (((int) (width / f11)) * f3Var.O);
        int ceil = (int) Math.ceil(e10 / f11);
        float W1 = (org.telegram.messenger.g0.W1(f10, 0, Math.max(0, r2 - ((org.telegram.messenger.g0.q.y - pj0Var.getPaddingTop()) - pj0Var.getPaddingBottom()))) / (ceil * i7)) * ceil;
        int round = Math.round(W1);
        iArr[0] = Math.max(0, hVar.J * round) + 2;
        iArr[1] = pj0Var.getPaddingTop() + ((int) ((W1 - round) * i7));
    }

    @Override // org.telegram.ui.Components.vi0
    public final float H(pj0 pj0Var) {
        int e10 = e();
        float width = (pj0Var.getWidth() - pj0Var.getPaddingLeft()) - pj0Var.getPaddingRight();
        float f10 = this.c.e.J;
        return (Math.max(0, pj0Var.computeVerticalScrollOffset() - r2.getPadding()) - pj0Var.getPaddingTop()) / ((((int) Math.ceil(e10 / f10)) * ((int) (((int) (width / f10)) * r2.O))) - (org.telegram.messenger.g0.q.y - pj0Var.getPaddingTop()));
    }

    @Override // v4.g0
    public final int b() {
        return e() + 3;
    }

    @Override // v4.g0
    public final int d(int i7) {
        if (i7 == 0 || i7 == b() - 1) {
            return 0;
        }
        return i7 == 1 ? 1 : 2;
    }

    @Override // v4.g0
    public final int e() {
        f3 f3Var = this.c;
        ArrayList arrayList = f3Var.f0;
        int size = arrayList == null ? 0 : arrayList.size();
        return f3Var.c0 ? size + 1 : f3Var.d0 ? f3Var.b0.size() + size : size;
    }

    @Override // v4.g0
    public final void t(v4.d1 d1Var, int i7) {
        f3 f3Var = this.c;
        ArrayList arrayList = f3Var.h0;
        ArrayList arrayList2 = f3Var.b0;
        int i10 = d1Var.f;
        View view = d1Var.a;
        if (i10 == 0) {
            ((c3) view).a = i7 == 0 ? f3Var.getPadding() : -1;
            return;
        }
        if (i10 == 2) {
            b3 b3Var = (b3) view;
            char c10 = 1;
            int i11 = 0;
            boolean z9 = i7 == 2;
            boolean z10 = i7 == 4;
            b3Var.U = z9;
            b3Var.V = z10;
            b3Var.M = new y2(this, b3Var, i11);
            b3Var.N = new y2(this, b3Var, c10 == true ? 1 : 0);
            int i12 = i7 - 2;
            if (f3Var.c0) {
                if (i12 == 0) {
                    b3Var.f(-1, false, false);
                    b3Var.e(arrayList2.size(), (e7) arrayList2.get(0));
                    return;
                }
                i12 = i7 - 3;
            } else if (f3Var.d0) {
                if (i12 >= 0 && i12 < arrayList2.size()) {
                    b3Var.f(-1, false, false);
                    b3Var.e(0, (e7) arrayList2.get(i12));
                    return;
                }
                i12 -= arrayList2.size();
            }
            ArrayList arrayList3 = f3Var.f0;
            if (arrayList3 == null || i12 < 0 || i12 >= arrayList3.size()) {
                return;
            }
            gf gfVar = (gf) f3Var.f0.get(i12);
            b3Var.f(arrayList.indexOf(gfVar), !arrayList.isEmpty() || f3Var.Q, b3Var.S == gfVar);
            b3Var.S = gfVar;
            b3Var.g((gfVar == null || !gfVar.b || gfVar.d()) ? null : org.telegram.messenger.g0.g0(gfVar.E, false, false));
            b3Var.F = null;
            if (gfVar == null) {
                b3Var.O = null;
            } else if (gfVar.b) {
                StringBuilder sb2 = new StringBuilder();
                org.telegram.messenger.camera.q.q(null, 2131753933, sb2, ", ");
                sb2.append(hd.z(gfVar.E));
                b3Var.O = sb2.toString();
            } else {
                b3Var.O = hd.M0(2131753948, null);
            }
            b3Var.b(gfVar);
            b3Var.invalidate();
            if (f3Var.M) {
                b3Var.I.setOnClickListener(new ah.g(this, gfVar, b3Var, 9));
            }
        }
    }

    @Override // v4.g0
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        View view;
        f3 f3Var = this.c;
        if (i7 == 0) {
            view = new c3(f3Var, f3Var.getContext());
        } else if (i7 == 1) {
            Context context = f3Var.getContext();
            boolean z9 = f3Var.L;
            di.a4 a4Var = new di.a4(context, 1);
            a4Var.setPadding(org.telegram.messenger.g0.L(z9 ? 14.0f : 16.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(10.0f));
            TextView textView = new TextView(context);
            textView.setTextSize(1, 16.0f);
            textView.setTextColor(-1);
            textView.setTypeface(org.telegram.messenger.g0.o());
            textView.setText(f3Var.getTitle());
            a4Var.addView(textView, c8.ha.d(-1, -1.0f, qs.E1, 0.0f, 0.0f, z9 ? 32.0f : 0.0f, 0.0f));
            f3Var.i0 = a4Var;
            view = a4Var;
        } else {
            view = new b3(f3Var.getContext(), f3Var.b, f3Var.O, f3Var.M);
        }
        return new xi0(view);
    }

    @Override // v4.g0
    public final void y(v4.d1 d1Var) {
        f3 f3Var = this.c;
        ArrayList arrayList = f3Var.h0;
        if (d1Var.f == 2) {
            b3 b3Var = (b3) d1Var.a;
            Object obj = b3Var.S;
            if (!(obj instanceof gf)) {
                b3Var.f(-1, false, false);
            } else {
                b3Var.f(arrayList.indexOf((gf) obj), !arrayList.isEmpty() || f3Var.Q, false);
            }
        }
    }
}
