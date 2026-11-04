package gi;

import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import b8.mf;
import java.util.ArrayList;
import org.telegram.messenger.bd;
import org.telegram.messenger.hs;
import org.telegram.messenger.ye;
import org.telegram.ui.Components.bj0;
import org.telegram.ui.Components.tj0;
import org.telegram.ui.Components.zi0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class x2 extends zi0 {
    public final /* synthetic */ d3 c;

    public x2(d3 d3Var) {
        this.c = d3Var;
    }

    @Override // org.telegram.ui.Components.sj0
    public final boolean D(u4.d1 d1Var) {
        return d1Var.f == 2;
    }

    @Override // org.telegram.ui.Components.zi0
    public final String F(int i3) {
        ye yeVar;
        int i10 = i3 - 2;
        d3 d3Var = this.c;
        if (d3Var.d0) {
            if (i10 == 0) {
                return null;
            }
            i10 = i3 - 3;
        } else if (d3Var.e0) {
            if (i10 >= 0 && i10 < d3Var.c0.size()) {
                return bd.e0(((f7) d3Var.c0.get(i10)).d / 1000, true);
            }
            i10 -= d3Var.c0.size();
        }
        ArrayList arrayList = d3Var.g0;
        if (arrayList == null || i10 < 0 || i10 >= arrayList.size() || (yeVar = (ye) d3Var.g0.get(i10)) == null) {
            return null;
        }
        long j10 = yeVar.D;
        if (Build.VERSION.SDK_INT <= 28) {
            j10 /= 1000;
        }
        return bd.e0(j10, true);
    }

    @Override // org.telegram.ui.Components.zi0
    public final void G(tj0 tj0Var, float f10, int[] iArr) {
        int e10 = e();
        float width = (tj0Var.getWidth() - tj0Var.getPaddingLeft()) - tj0Var.getPaddingRight();
        d3 d3Var = this.c;
        fi.g gVar = d3Var.e;
        float f11 = gVar.J;
        int i3 = (int) (((int) (width / f11)) * d3Var.P);
        int ceil = (int) Math.ceil(e10 / f11);
        float W1 = (org.telegram.messenger.g0.W1(f10, 0, Math.max(0, r2 - ((org.telegram.messenger.g0.q.y - tj0Var.getPaddingTop()) - tj0Var.getPaddingBottom()))) / (ceil * i3)) * ceil;
        int round = Math.round(W1);
        iArr[0] = Math.max(0, gVar.J * round) + 2;
        iArr[1] = tj0Var.getPaddingTop() + ((int) ((W1 - round) * i3));
    }

    @Override // org.telegram.ui.Components.zi0
    public final float H(tj0 tj0Var) {
        int e10 = e();
        float width = (tj0Var.getWidth() - tj0Var.getPaddingLeft()) - tj0Var.getPaddingRight();
        float f10 = this.c.e.J;
        return (Math.max(0, tj0Var.computeVerticalScrollOffset() - r2.getPadding()) - tj0Var.getPaddingTop()) / ((((int) Math.ceil(e10 / f10)) * ((int) (((int) (width / f10)) * r2.P))) - (org.telegram.messenger.g0.q.y - tj0Var.getPaddingTop()));
    }

    @Override // u4.h0
    public final int b() {
        return e() + 3;
    }

    @Override // u4.h0
    public final int d(int i3) {
        if (i3 == 0 || i3 == b() - 1) {
            return 0;
        }
        return i3 == 1 ? 1 : 2;
    }

    @Override // u4.h0
    public final int e() {
        d3 d3Var = this.c;
        ArrayList arrayList = d3Var.g0;
        int size = arrayList == null ? 0 : arrayList.size();
        return d3Var.d0 ? size + 1 : d3Var.e0 ? d3Var.c0.size() + size : size;
    }

    @Override // u4.h0
    public final void t(u4.d1 d1Var, int i3) {
        d3 d3Var = this.c;
        ArrayList arrayList = d3Var.i0;
        ArrayList arrayList2 = d3Var.c0;
        int i10 = d1Var.f;
        View view = d1Var.a;
        if (i10 == 0) {
            ((a3) view).a = i3 == 0 ? d3Var.getPadding() : -1;
            return;
        }
        if (i10 == 2) {
            z2 z2Var = (z2) view;
            char c2 = 1;
            int i11 = 0;
            boolean z10 = i3 == 2;
            boolean z11 = i3 == 4;
            z2Var.V = z10;
            z2Var.W = z11;
            z2Var.N = new w2(this, z2Var, i11);
            z2Var.O = new w2(this, z2Var, c2 == true ? 1 : 0);
            int i12 = i3 - 2;
            if (d3Var.d0) {
                if (i12 == 0) {
                    z2Var.f(-1, false, false);
                    z2Var.e(arrayList2.size(), (f7) arrayList2.get(0));
                    return;
                }
                i12 = i3 - 3;
            } else if (d3Var.e0) {
                if (i12 >= 0 && i12 < arrayList2.size()) {
                    z2Var.f(-1, false, false);
                    z2Var.e(0, (f7) arrayList2.get(i12));
                    return;
                }
                i12 -= arrayList2.size();
            }
            ArrayList arrayList3 = d3Var.g0;
            if (arrayList3 == null || i12 < 0 || i12 >= arrayList3.size()) {
                return;
            }
            ye yeVar = (ye) d3Var.g0.get(i12);
            z2Var.f(arrayList.indexOf(yeVar), !arrayList.isEmpty() || d3Var.R, z2Var.T == yeVar);
            z2Var.T = yeVar;
            z2Var.g((yeVar == null || !yeVar.b || yeVar.d()) ? null : org.telegram.messenger.g0.g0(yeVar.E, false, false));
            z2Var.G = null;
            if (yeVar == null) {
                z2Var.P = null;
            } else if (yeVar.b) {
                StringBuilder sb2 = new StringBuilder();
                org.telegram.messenger.camera.q.q(null, 2131753933, sb2, ", ");
                sb2.append(bd.z(yeVar.E));
                z2Var.P = sb2.toString();
            } else {
                z2Var.P = bd.M0(2131753948, null);
            }
            z2Var.b(yeVar);
            z2Var.invalidate();
            if (d3Var.N) {
                z2Var.J.setOnClickListener(new ai.h(this, yeVar, z2Var, 14));
            }
        }
    }

    @Override // u4.h0
    public final u4.d1 x(ViewGroup viewGroup, int i3) {
        View view;
        d3 d3Var = this.c;
        if (i3 == 0) {
            view = new a3(d3Var, d3Var.getContext());
        } else if (i3 == 1) {
            Context context = d3Var.getContext();
            boolean z10 = d3Var.M;
            ai.d2 d2Var = new ai.d2(context, 3);
            d2Var.setPadding(org.telegram.messenger.g0.L(z10 ? 14.0f : 16.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(10.0f));
            TextView textView = new TextView(context);
            textView.setTextSize(1, 16.0f);
            textView.setTextColor(-1);
            textView.setTypeface(org.telegram.messenger.g0.o());
            textView.setText(d3Var.getTitle());
            d2Var.addView(textView, mf.d(-1, -1.0f, hs.E1, 0.0f, 0.0f, z10 ? 32.0f : 0.0f, 0.0f));
            d3Var.j0 = d2Var;
            view = d2Var;
        } else {
            view = new z2(d3Var.getContext(), d3Var.b, d3Var.P, d3Var.N);
        }
        return new bj0(view);
    }

    @Override // u4.h0
    public final void y(u4.d1 d1Var) {
        d3 d3Var = this.c;
        ArrayList arrayList = d3Var.i0;
        if (d1Var.f == 2) {
            z2 z2Var = (z2) d1Var.a;
            Object obj = z2Var.T;
            if (!(obj instanceof ye)) {
                z2Var.f(-1, false, false);
            } else {
                z2Var.f(arrayList.indexOf((ye) obj), !arrayList.isEmpty() || d3Var.R, false);
            }
        }
    }
}
