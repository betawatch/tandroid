package hi;

import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.ff;
import org.telegram.messenger.hd;
import org.telegram.messenger.ns;
import org.telegram.ui.Components.aj0;
import org.telegram.ui.Components.cj0;
import org.telegram.ui.Components.uj0;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class x2 extends aj0 {
    public final /* synthetic */ d3 c;

    public x2(d3 d3Var) {
        this.c = d3Var;
    }

    @Override // org.telegram.ui.Components.tj0
    public final boolean D(v4.e1 e1Var) {
        return e1Var.f == 2;
    }

    @Override // org.telegram.ui.Components.aj0
    public final String F(int i7) {
        ff ffVar;
        int i10 = i7 - 2;
        d3 d3Var = this.c;
        if (d3Var.d0) {
            if (i10 == 0) {
                return null;
            }
            i10 = i7 - 3;
        } else if (d3Var.e0) {
            if (i10 >= 0 && i10 < d3Var.c0.size()) {
                return hd.e0(((d7) d3Var.c0.get(i10)).d / 1000, true);
            }
            i10 -= d3Var.c0.size();
        }
        ArrayList arrayList = d3Var.g0;
        if (arrayList == null || i10 < 0 || i10 >= arrayList.size() || (ffVar = (ff) d3Var.g0.get(i10)) == null) {
            return null;
        }
        long j3 = ffVar.D;
        if (Build.VERSION.SDK_INT <= 28) {
            j3 /= 1000;
        }
        return hd.e0(j3, true);
    }

    @Override // org.telegram.ui.Components.aj0
    public final void G(uj0 uj0Var, float f10, int[] iArr) {
        int e10 = e();
        float width = (uj0Var.getWidth() - uj0Var.getPaddingLeft()) - uj0Var.getPaddingRight();
        d3 d3Var = this.c;
        gi.g gVar = d3Var.e;
        float f11 = gVar.J;
        int i7 = (int) (((int) (width / f11)) * d3Var.P);
        int ceil = (int) Math.ceil(e10 / f11);
        float W1 = (org.telegram.messenger.g0.W1(f10, 0, Math.max(0, r2 - ((org.telegram.messenger.g0.q.y - uj0Var.getPaddingTop()) - uj0Var.getPaddingBottom()))) / (ceil * i7)) * ceil;
        int round = Math.round(W1);
        iArr[0] = Math.max(0, gVar.J * round) + 2;
        iArr[1] = uj0Var.getPaddingTop() + ((int) ((W1 - round) * i7));
    }

    @Override // org.telegram.ui.Components.aj0
    public final float H(uj0 uj0Var) {
        int e10 = e();
        float width = (uj0Var.getWidth() - uj0Var.getPaddingLeft()) - uj0Var.getPaddingRight();
        float f10 = this.c.e.J;
        return (Math.max(0, uj0Var.computeVerticalScrollOffset() - r2.getPadding()) - uj0Var.getPaddingTop()) / ((((int) Math.ceil(e10 / f10)) * ((int) (((int) (width / f10)) * r2.P))) - (org.telegram.messenger.g0.q.y - uj0Var.getPaddingTop()));
    }

    @Override // v4.h0
    public final int b() {
        return e() + 3;
    }

    @Override // v4.h0
    public final int d(int i7) {
        if (i7 == 0 || i7 == b() - 1) {
            return 0;
        }
        return i7 == 1 ? 1 : 2;
    }

    @Override // v4.h0
    public final int e() {
        d3 d3Var = this.c;
        ArrayList arrayList = d3Var.g0;
        int size = arrayList == null ? 0 : arrayList.size();
        return d3Var.d0 ? size + 1 : d3Var.e0 ? d3Var.c0.size() + size : size;
    }

    @Override // v4.h0
    public final void t(v4.e1 e1Var, int i7) {
        d3 d3Var = this.c;
        ArrayList arrayList = d3Var.i0;
        ArrayList arrayList2 = d3Var.c0;
        int i10 = e1Var.f;
        View view = e1Var.a;
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
                    z2Var.e(arrayList2.size(), (d7) arrayList2.get(0));
                    return;
                }
                i12 = i7 - 3;
            } else if (d3Var.e0) {
                if (i12 >= 0 && i12 < arrayList2.size()) {
                    z2Var.f(-1, false, false);
                    z2Var.e(0, (d7) arrayList2.get(i12));
                    return;
                }
                i12 -= arrayList2.size();
            }
            ArrayList arrayList3 = d3Var.g0;
            if (arrayList3 == null || i12 < 0 || i12 >= arrayList3.size()) {
                return;
            }
            ff ffVar = (ff) d3Var.g0.get(i12);
            z2Var.f(arrayList.indexOf(ffVar), !arrayList.isEmpty() || d3Var.R, z2Var.T == ffVar);
            z2Var.T = ffVar;
            z2Var.g((ffVar == null || !ffVar.b || ffVar.d()) ? null : org.telegram.messenger.g0.g0(ffVar.E, false, false));
            z2Var.G = null;
            if (ffVar == null) {
                z2Var.P = null;
            } else if (ffVar.b) {
                StringBuilder sb2 = new StringBuilder();
                org.telegram.ui.Cells.y0.r(null, 2131753933, sb2, ", ");
                sb2.append(hd.z(ffVar.E));
                z2Var.P = sb2.toString();
            } else {
                z2Var.P = hd.M0(2131753948, null);
            }
            z2Var.b(ffVar);
            z2Var.invalidate();
            if (d3Var.N) {
                z2Var.J.setOnClickListener(new ah.g(this, ffVar, z2Var, 14));
            }
        }
    }

    @Override // v4.h0
    public final v4.e1 x(ViewGroup viewGroup, int i7) {
        View view;
        d3 d3Var = this.c;
        if (i7 == 0) {
            view = new a3(d3Var, d3Var.getContext());
        } else if (i7 == 1) {
            Context context = d3Var.getContext();
            boolean z10 = d3Var.M;
            bi.v1 v1Var = new bi.v1(context, 3);
            v1Var.setPadding(org.telegram.messenger.g0.L(z10 ? 14.0f : 16.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(10.0f));
            TextView textView = new TextView(context);
            textView.setTextSize(1, 16.0f);
            textView.setTextColor(-1);
            textView.setTypeface(org.telegram.messenger.g0.o());
            textView.setText(d3Var.getTitle());
            v1Var.addView(textView, c8.ja.d(-1, -1.0f, ns.E1, 0.0f, 0.0f, z10 ? 32.0f : 0.0f, 0.0f));
            d3Var.j0 = v1Var;
            view = v1Var;
        } else {
            view = new z2(d3Var.getContext(), d3Var.b, d3Var.P, d3Var.N);
        }
        return new cj0(view);
    }

    @Override // v4.h0
    public final void y(v4.e1 e1Var) {
        d3 d3Var = this.c;
        ArrayList arrayList = d3Var.i0;
        if (e1Var.f == 2) {
            z2 z2Var = (z2) e1Var.a;
            Object obj = z2Var.T;
            if (!(obj instanceof ff)) {
                z2Var.f(-1, false, false);
            } else {
                z2Var.f(arrayList.indexOf((ff) obj), !arrayList.isEmpty() || d3Var.R, false);
            }
        }
    }
}
