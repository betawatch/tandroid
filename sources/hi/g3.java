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

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final class g3 extends kj0 {
    public final /* synthetic */ m3 c;

    public g3(m3 m3Var) {
        this.c = m3Var;
    }

    @Override // org.telegram.ui.Components.dk0
    public final boolean D(v4.f1 f1Var) {
        return f1Var.f == 2;
    }

    @Override // org.telegram.ui.Components.kj0
    public final String F(int i7) {
        ef efVar;
        int i10 = i7 - 2;
        m3 m3Var = this.c;
        if (m3Var.d0) {
            if (i10 == 0) {
                return null;
            }
            i10 = i7 - 3;
        } else if (m3Var.e0) {
            if (i10 >= 0 && i10 < m3Var.c0.size()) {
                return gd.e0(((x7) m3Var.c0.get(i10)).d / 1000, true);
            }
            i10 -= m3Var.c0.size();
        }
        ArrayList arrayList = m3Var.g0;
        if (arrayList == null || i10 < 0 || i10 >= arrayList.size() || (efVar = (ef) m3Var.g0.get(i10)) == null) {
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
        m3 m3Var = this.c;
        gi.g gVar = m3Var.e;
        float f11 = gVar.J;
        int i7 = (int) (((int) (width / f11)) * m3Var.P);
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
        m3 m3Var = this.c;
        ArrayList arrayList = m3Var.g0;
        int size = arrayList == null ? 0 : arrayList.size();
        return m3Var.d0 ? size + 1 : m3Var.e0 ? m3Var.c0.size() + size : size;
    }

    @Override // v4.i0
    public final void t(v4.f1 f1Var, int i7) {
        m3 m3Var = this.c;
        ArrayList arrayList = m3Var.i0;
        ArrayList arrayList2 = m3Var.c0;
        int i10 = f1Var.f;
        View view = f1Var.a;
        if (i10 == 0) {
            ((j3) view).a = i7 == 0 ? m3Var.getPadding() : -1;
            return;
        }
        if (i10 == 2) {
            i3 i3Var = (i3) view;
            char c10 = 1;
            int i11 = 0;
            boolean z10 = i7 == 2;
            boolean z11 = i7 == 4;
            i3Var.V = z10;
            i3Var.W = z11;
            i3Var.N = new f3(this, i3Var, i11);
            i3Var.O = new f3(this, i3Var, c10 == true ? 1 : 0);
            int i12 = i7 - 2;
            if (m3Var.d0) {
                if (i12 == 0) {
                    i3Var.f(-1, false, false);
                    i3Var.e(arrayList2.size(), (x7) arrayList2.get(0));
                    return;
                }
                i12 = i7 - 3;
            } else if (m3Var.e0) {
                if (i12 >= 0 && i12 < arrayList2.size()) {
                    i3Var.f(-1, false, false);
                    i3Var.e(0, (x7) arrayList2.get(i12));
                    return;
                }
                i12 -= arrayList2.size();
            }
            ArrayList arrayList3 = m3Var.g0;
            if (arrayList3 == null || i12 < 0 || i12 >= arrayList3.size()) {
                return;
            }
            ef efVar = (ef) m3Var.g0.get(i12);
            i3Var.f(arrayList.indexOf(efVar), !arrayList.isEmpty() || m3Var.R, i3Var.T == efVar);
            i3Var.T = efVar;
            i3Var.g((efVar == null || !efVar.b || efVar.d()) ? null : org.telegram.messenger.g0.g0(efVar.E, false, false));
            i3Var.G = null;
            if (efVar == null) {
                i3Var.P = null;
            } else if (efVar.b) {
                StringBuilder sb2 = new StringBuilder();
                org.telegram.ui.Cells.c0.u(null, 2131753930, sb2, ", ");
                sb2.append(gd.z(efVar.E));
                i3Var.P = sb2.toString();
            } else {
                i3Var.P = gd.N0(2131753945, null);
            }
            i3Var.b(efVar);
            i3Var.invalidate();
            if (m3Var.N) {
                i3Var.J.setOnClickListener(new ah.h(this, efVar, i3Var, 14));
            }
        }
    }

    @Override // v4.i0
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        View view;
        m3 m3Var = this.c;
        if (i7 == 0) {
            view = new j3(m3Var, m3Var.getContext());
        } else if (i7 == 1) {
            Context context = m3Var.getContext();
            boolean z10 = m3Var.M;
            bi.v2 v2Var = new bi.v2(context, 3);
            v2Var.setPadding(org.telegram.messenger.g0.L(z10 ? 14.0f : 16.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(10.0f));
            TextView textView = new TextView(context);
            textView.setTextSize(1, 16.0f);
            textView.setTextColor(-1);
            textView.setTypeface(org.telegram.messenger.g0.o());
            textView.setText(m3Var.getTitle());
            v2Var.addView(textView, c8.na.d(-1, -1.0f, ks.E1, 0.0f, 0.0f, z10 ? 32.0f : 0.0f, 0.0f));
            m3Var.j0 = v2Var;
            view = v2Var;
        } else {
            view = new i3(m3Var.getContext(), m3Var.b, m3Var.P, m3Var.N);
        }
        return new mj0(view);
    }

    @Override // v4.i0
    public final void y(v4.f1 f1Var) {
        m3 m3Var = this.c;
        ArrayList arrayList = m3Var.i0;
        if (f1Var.f == 2) {
            i3 i3Var = (i3) f1Var.a;
            Object obj = i3Var.T;
            if (!(obj instanceof ef)) {
                i3Var.f(-1, false, false);
            } else {
                i3Var.f(arrayList.indexOf((ef) obj), !arrayList.isEmpty() || m3Var.R, false);
            }
        }
    }
}
