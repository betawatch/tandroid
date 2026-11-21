package hi;

import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.ef;
import org.telegram.messenger.gd;
import org.telegram.messenger.ks;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.kj0;
import org.telegram.ui.Components.mj0;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes4.dex */
public final class x2 extends kj0 {
    public final /* synthetic */ d3 c;

    public x2(d3 d3Var) {
        this.c = d3Var;
    }

    @Override // org.telegram.ui.Components.dk0
    public final boolean D(v4.f1 f1Var) {
        return f1Var.f == 2;
    }

    @Override // org.telegram.ui.Components.kj0
    public final String F(int i7) {
        ef efVar;
        int i10 = i7 - 2;
        d3 d3Var = this.c;
        if (d3Var.d0) {
            if (i10 == 0) {
                return null;
            }
            i10 = i7 - 3;
        } else if (d3Var.e0) {
            if (i10 >= 0 && i10 < d3Var.c0.size()) {
                return gd.e0(((c7) d3Var.c0.get(i10)).d / 1000, true);
            }
            i10 -= d3Var.c0.size();
        }
        ArrayList arrayList = d3Var.g0;
        if (arrayList == null || i10 < 0 || i10 >= arrayList.size() || (efVar = (ef) d3Var.g0.get(i10)) == null) {
            return null;
        }
        long j3 = efVar.D;
        if (Build.VERSION.SDK_INT <= 28) {
            j3 /= 1000;
        }
        return gd.e0(j3, true);
    }

    @Override // org.telegram.ui.Components.kj0
    public final void G(ek0 ek0Var, float f10, int[] iArr) {
        int e10 = e();
        float width = (ek0Var.getWidth() - ek0Var.getPaddingLeft()) - ek0Var.getPaddingRight();
        d3 d3Var = this.c;
        gi.g gVar = d3Var.e;
        float f11 = gVar.J;
        int i7 = (int) (((int) (width / f11)) * d3Var.P);
        int ceil = (int) Math.ceil(e10 / f11);
        float W1 = (org.telegram.messenger.g0.W1(f10, 0, Math.max(0, r2 - ((org.telegram.messenger.g0.q.y - ek0Var.getPaddingTop()) - ek0Var.getPaddingBottom()))) / (ceil * i7)) * ceil;
        int round = Math.round(W1);
        iArr[0] = Math.max(0, gVar.J * round) + 2;
        iArr[1] = ek0Var.getPaddingTop() + ((int) ((W1 - round) * i7));
    }

    @Override // org.telegram.ui.Components.kj0
    public final float H(ek0 ek0Var) {
        int e10 = e();
        float width = (ek0Var.getWidth() - ek0Var.getPaddingLeft()) - ek0Var.getPaddingRight();
        float f10 = this.c.e.J;
        return (Math.max(0, ek0Var.computeVerticalScrollOffset() - r2.getPadding()) - ek0Var.getPaddingTop()) / ((((int) Math.ceil(e10 / f10)) * ((int) (((int) (width / f10)) * r2.P))) - (org.telegram.messenger.g0.q.y - ek0Var.getPaddingTop()));
    }

    @Override // v4.i0
    public final int b() {
        return e() + 3;
    }

    @Override // v4.i0
    public final int d(int i7) {
        if (i7 == 0 || i7 == b() - 1) {
            return 0;
        }
        return i7 == 1 ? 1 : 2;
    }

    @Override // v4.i0
    public final int e() {
        d3 d3Var = this.c;
        ArrayList arrayList = d3Var.g0;
        int size = arrayList == null ? 0 : arrayList.size();
        return d3Var.d0 ? size + 1 : d3Var.e0 ? d3Var.c0.size() + size : size;
    }

    @Override // v4.i0
    public final void t(v4.f1 f1Var, int i7) {
        d3 d3Var = this.c;
        ArrayList arrayList = d3Var.i0;
        ArrayList arrayList2 = d3Var.c0;
        int i10 = f1Var.f;
        View view = f1Var.a;
        if (i10 == 0) {
            ((a3) view).a = i7 == 0 ? d3Var.getPadding() : -1;
            return;
        }
        if (i10 == 2) {
            z2 z2Var = (z2) view;
            char c10 = 1;
            int i11 = 0;
            boolean z10 = i7 == 2;
            boolean z11 = i7 == 4;
            z2Var.V = z10;
            z2Var.W = z11;
            z2Var.N = new w2(this, z2Var, i11);
            z2Var.O = new w2(this, z2Var, c10 == true ? 1 : 0);
            int i12 = i7 - 2;
            if (d3Var.d0) {
                if (i12 == 0) {
                    z2Var.f(-1, false, false);
                    z2Var.e(arrayList2.size(), (c7) arrayList2.get(0));
                    return;
                }
                i12 = i7 - 3;
            } else if (d3Var.e0) {
                if (i12 >= 0 && i12 < arrayList2.size()) {
                    z2Var.f(-1, false, false);
                    z2Var.e(0, (c7) arrayList2.get(i12));
                    return;
                }
                i12 -= arrayList2.size();
            }
            ArrayList arrayList3 = d3Var.g0;
            if (arrayList3 == null || i12 < 0 || i12 >= arrayList3.size()) {
                return;
            }
            ef efVar = (ef) d3Var.g0.get(i12);
            z2Var.f(arrayList.indexOf(efVar), !arrayList.isEmpty() || d3Var.R, z2Var.T == efVar);
            z2Var.T = efVar;
            z2Var.g((efVar == null || !efVar.b || efVar.d()) ? null : org.telegram.messenger.g0.g0(efVar.E, false, false));
            z2Var.G = null;
            if (efVar == null) {
                z2Var.P = null;
            } else if (efVar.b) {
                StringBuilder sb2 = new StringBuilder();
                org.telegram.ui.Cells.c0.u(null, 2131753930, sb2, ", ");
                sb2.append(gd.z(efVar.E));
                z2Var.P = sb2.toString();
            } else {
                z2Var.P = gd.N0(2131753945, null);
            }
            z2Var.b(efVar);
            z2Var.invalidate();
            if (d3Var.N) {
                z2Var.J.setOnClickListener(new ah.h(this, efVar, z2Var, 14));
            }
        }
    }

    @Override // v4.i0
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        View view;
        d3 d3Var = this.c;
        if (i7 == 0) {
            view = new a3(d3Var, d3Var.getContext());
        } else if (i7 == 1) {
            Context context = d3Var.getContext();
            boolean z10 = d3Var.M;
            bi.t2 t2Var = new bi.t2(context, 3);
            t2Var.setPadding(org.telegram.messenger.g0.L(z10 ? 14.0f : 16.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(10.0f));
            TextView textView = new TextView(context);
            textView.setTextSize(1, 16.0f);
            textView.setTextColor(-1);
            textView.setTypeface(org.telegram.messenger.g0.o());
            textView.setText(d3Var.getTitle());
            t2Var.addView(textView, c8.ma.d(-1, -1.0f, ks.E1, 0.0f, 0.0f, z10 ? 32.0f : 0.0f, 0.0f));
            d3Var.j0 = t2Var;
            view = t2Var;
        } else {
            view = new z2(d3Var.getContext(), d3Var.b, d3Var.P, d3Var.N);
        }
        return new mj0(view);
    }

    @Override // v4.i0
    public final void y(v4.f1 f1Var) {
        d3 d3Var = this.c;
        ArrayList arrayList = d3Var.i0;
        if (f1Var.f == 2) {
            z2 z2Var = (z2) f1Var.a;
            Object obj = z2Var.T;
            if (!(obj instanceof ef)) {
                z2Var.f(-1, false, false);
            } else {
                z2Var.f(arrayList.indexOf((ef) obj), !arrayList.isEmpty() || d3Var.R, false);
            }
        }
    }
}
