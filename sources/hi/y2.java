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
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Components.ij0;
import org.telegram.ui.Components.kj0;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes4.dex */
public final class y2 extends ij0 {
    public final /* synthetic */ e3 c;

    public y2(e3 e3Var) {
        this.c = e3Var;
    }

    @Override // org.telegram.ui.Components.bk0
    public final boolean D(v4.f1 f1Var) {
        return f1Var.f == 2;
    }

    @Override // org.telegram.ui.Components.ij0
    public final String F(int i7) {
        ef efVar;
        int i10 = i7 - 2;
        e3 e3Var = this.c;
        if (e3Var.d0) {
            if (i10 == 0) {
                return null;
            }
            i10 = i7 - 3;
        } else if (e3Var.e0) {
            if (i10 >= 0 && i10 < e3Var.c0.size()) {
                return gd.e0(((d7) e3Var.c0.get(i10)).d / 1000, true);
            }
            i10 -= e3Var.c0.size();
        }
        ArrayList arrayList = e3Var.g0;
        if (arrayList == null || i10 < 0 || i10 >= arrayList.size() || (efVar = (ef) e3Var.g0.get(i10)) == null) {
            return null;
        }
        long j3 = efVar.D;
        if (Build.VERSION.SDK_INT <= 28) {
            j3 /= 1000;
        }
        return gd.e0(j3, true);
    }

    @Override // org.telegram.ui.Components.ij0
    public final void G(ck0 ck0Var, float f10, int[] iArr) {
        int e10 = e();
        float width = (ck0Var.getWidth() - ck0Var.getPaddingLeft()) - ck0Var.getPaddingRight();
        e3 e3Var = this.c;
        gi.g gVar = e3Var.e;
        float f11 = gVar.J;
        int i7 = (int) (((int) (width / f11)) * e3Var.P);
        int ceil = (int) Math.ceil(e10 / f11);
        float W1 = (org.telegram.messenger.g0.W1(f10, 0, Math.max(0, r2 - ((org.telegram.messenger.g0.q.y - ck0Var.getPaddingTop()) - ck0Var.getPaddingBottom()))) / (ceil * i7)) * ceil;
        int round = Math.round(W1);
        iArr[0] = Math.max(0, gVar.J * round) + 2;
        iArr[1] = ck0Var.getPaddingTop() + ((int) ((W1 - round) * i7));
    }

    @Override // org.telegram.ui.Components.ij0
    public final float H(ck0 ck0Var) {
        int e10 = e();
        float width = (ck0Var.getWidth() - ck0Var.getPaddingLeft()) - ck0Var.getPaddingRight();
        float f10 = this.c.e.J;
        return (Math.max(0, ck0Var.computeVerticalScrollOffset() - r2.getPadding()) - ck0Var.getPaddingTop()) / ((((int) Math.ceil(e10 / f10)) * ((int) (((int) (width / f10)) * r2.P))) - (org.telegram.messenger.g0.q.y - ck0Var.getPaddingTop()));
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
        e3 e3Var = this.c;
        ArrayList arrayList = e3Var.g0;
        int size = arrayList == null ? 0 : arrayList.size();
        return e3Var.d0 ? size + 1 : e3Var.e0 ? e3Var.c0.size() + size : size;
    }

    @Override // v4.i0
    public final void t(v4.f1 f1Var, int i7) {
        e3 e3Var = this.c;
        ArrayList arrayList = e3Var.i0;
        ArrayList arrayList2 = e3Var.c0;
        int i10 = f1Var.f;
        View view = f1Var.a;
        if (i10 == 0) {
            ((b3) view).a = i7 == 0 ? e3Var.getPadding() : -1;
            return;
        }
        if (i10 == 2) {
            a3 a3Var = (a3) view;
            char c10 = 1;
            int i11 = 0;
            boolean z10 = i7 == 2;
            boolean z11 = i7 == 4;
            a3Var.V = z10;
            a3Var.W = z11;
            a3Var.N = new x2(this, a3Var, i11);
            a3Var.O = new x2(this, a3Var, c10 == true ? 1 : 0);
            int i12 = i7 - 2;
            if (e3Var.d0) {
                if (i12 == 0) {
                    a3Var.f(-1, false, false);
                    a3Var.e(arrayList2.size(), (d7) arrayList2.get(0));
                    return;
                }
                i12 = i7 - 3;
            } else if (e3Var.e0) {
                if (i12 >= 0 && i12 < arrayList2.size()) {
                    a3Var.f(-1, false, false);
                    a3Var.e(0, (d7) arrayList2.get(i12));
                    return;
                }
                i12 -= arrayList2.size();
            }
            ArrayList arrayList3 = e3Var.g0;
            if (arrayList3 == null || i12 < 0 || i12 >= arrayList3.size()) {
                return;
            }
            ef efVar = (ef) e3Var.g0.get(i12);
            a3Var.f(arrayList.indexOf(efVar), !arrayList.isEmpty() || e3Var.R, a3Var.T == efVar);
            a3Var.T = efVar;
            a3Var.g((efVar == null || !efVar.b || efVar.d()) ? null : org.telegram.messenger.g0.g0(efVar.E, false, false));
            a3Var.G = null;
            if (efVar == null) {
                a3Var.P = null;
            } else if (efVar.b) {
                StringBuilder sb2 = new StringBuilder();
                org.telegram.ui.Cells.c0.u(null, 2131753931, sb2, ", ");
                sb2.append(gd.z(efVar.E));
                a3Var.P = sb2.toString();
            } else {
                a3Var.P = gd.M0(2131753946, null);
            }
            a3Var.b(efVar);
            a3Var.invalidate();
            if (e3Var.N) {
                a3Var.J.setOnClickListener(new ah.h(this, efVar, a3Var, 14));
            }
        }
    }

    @Override // v4.i0
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        View view;
        e3 e3Var = this.c;
        if (i7 == 0) {
            view = new b3(e3Var, e3Var.getContext());
        } else if (i7 == 1) {
            Context context = e3Var.getContext();
            boolean z10 = e3Var.M;
            bi.p2 p2Var = new bi.p2(context, 3);
            p2Var.setPadding(org.telegram.messenger.g0.L(z10 ? 14.0f : 16.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(10.0f));
            TextView textView = new TextView(context);
            textView.setTextSize(1, 16.0f);
            textView.setTextColor(-1);
            textView.setTypeface(org.telegram.messenger.g0.o());
            textView.setText(e3Var.getTitle());
            p2Var.addView(textView, c8.ma.d(-1, -1.0f, ks.E1, 0.0f, 0.0f, z10 ? 32.0f : 0.0f, 0.0f));
            e3Var.j0 = p2Var;
            view = p2Var;
        } else {
            view = new a3(e3Var.getContext(), e3Var.b, e3Var.P, e3Var.N);
        }
        return new kj0(view);
    }

    @Override // v4.i0
    public final void y(v4.f1 f1Var) {
        e3 e3Var = this.c;
        ArrayList arrayList = e3Var.i0;
        if (f1Var.f == 2) {
            a3 a3Var = (a3) f1Var.a;
            Object obj = a3Var.T;
            if (!(obj instanceof ef)) {
                a3Var.f(-1, false, false);
            } else {
                a3Var.f(arrayList.indexOf((ef) obj), !arrayList.isEmpty() || e3Var.R, false);
            }
        }
    }
}
