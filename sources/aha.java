// default package

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class aha extends z49 {
    public final Context c;
    public final byte d;
    public boolean e;
    public final /* synthetic */ nha f;

    /* JADX WARN: Multi-variable type inference failed */
    public aha(nha nhaVar, Context context, int i) {
        this.f = nhaVar;
        this.c = context;
        this.d = i;
    }

    @Override // q59
    public final boolean D(u69 u69Var) {
        return true;
    }

    @Override // z49
    public final String F(int i) {
        ArrayList arrayList = this.f.w1[this.d].e;
        if (arrayList.isEmpty()) {
            return "";
        }
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            if (i <= ((nga) arrayList.get(i2)).b) {
                return ((nga) arrayList.get(i2)).a;
            }
        }
        return ((nga) b10.f(1, arrayList)).a;
    }

    @Override // z49
    public final void G(r59 r59Var, float f, int[] iArr) {
        int measuredHeight = r59Var.getChildAt(0).getMeasuredHeight();
        float e = f * ((e() * measuredHeight) - (r59Var.getMeasuredHeight() - r59Var.getPaddingTop()));
        iArr[0] = (int) (e / measuredHeight);
        iArr[1] = ((int) e) % measuredHeight;
    }

    @Override // z49
    public final void J(r59 r59Var) {
        if (this.e) {
            this.e = false;
            int i = 0;
            for (int i2 = 0; i2 < r59Var.getChildCount() && (i = nha.Q(r59Var.getChildAt(i2))) == 0; i2++) {
            }
            if (i == 0) {
                this.f.L(this.d, r59Var, true);
            }
        }
    }

    @Override // z49
    public final void K() {
        this.e = true;
        iga P = this.f.P(this.d);
        if (P != null) {
            nha.m1(P, null, false);
        }
    }

    @Override // y59
    public final int b() {
        cha[] chaVarArr = this.f.w1;
        byte b = this.d;
        cha chaVar = chaVarArr[b];
        if (chaVar.o) {
            return chaVar.e();
        }
        if (chaVar.a.size() == 0 && !chaVarArr[b].g) {
            return 1;
        }
        if (chaVarArr[b].a.size() == 0) {
            cha chaVar2 = chaVarArr[b];
            boolean[] zArr = chaVar2.i;
            if ((!zArr[0] || !zArr[1]) && chaVar2.l) {
                return 0;
            }
        }
        if (chaVarArr[b].e() != 0) {
            return Math.max(chaVarArr[b].e(), chaVarArr[b].c().size() + chaVarArr[b].d());
        }
        int size = chaVarArr[b].c().size() + chaVarArr[b].d();
        if (size == 0) {
            return size;
        }
        cha chaVar3 = chaVarArr[b];
        boolean[] zArr2 = chaVar3.i;
        if (zArr2[0] && zArr2[1]) {
            return size;
        }
        boolean z = chaVar3.r;
        if ((z ? chaVar3.u : chaVar3.n) != 0) {
            return (z ? chaVar3.u : chaVar3.n) + size;
        }
        return size + 1;
    }

    @Override // y59
    public final int d(int i) {
        cha[] chaVarArr = this.f.w1;
        byte b = this.d;
        if (chaVarArr[b].c.size() == 0 && !chaVarArr[b].g) {
            return 9;
        }
        cha chaVar = chaVarArr[b];
        int i2 = chaVar.m;
        if (i < i2 || i >= chaVar.a.size() + i2) {
            return 8;
        }
        return (b == 2 || b == 4) ? 10 : 7;
    }

    @Override // y59
    public final int e() {
        return this.f.w1[this.d].e();
    }

    @Override // y59
    public final void t(u69 u69Var, int i) {
        nha nhaVar = this.f;
        long j = nhaVar.m1;
        SparseArray[] sparseArrayArr = nhaVar.c1;
        cha chaVar = nhaVar.w1[this.d];
        ArrayList arrayList = chaVar.a;
        int i2 = u69Var.f;
        View view = u69Var.a;
        if (i2 == 7) {
            if (view instanceof ida) {
                ida idaVar = (ida) view;
                k47 k47Var = (k47) arrayList.get(i - chaVar.m);
                idaVar.c(k47Var, i != arrayList.size() - 1);
                if (nhaVar.F1) {
                    idaVar.b(sparseArrayArr[(k47.B0(k47Var.k) > j ? 1 : (k47.B0(k47Var.k) == j ? 0 : -1)) == 0 ? (char) 0 : (char) 1].indexOfKey(k47Var.e1()) >= 0, !nhaVar.e1);
                    return;
                } else {
                    idaVar.b(false, !nhaVar.e1);
                    return;
                }
            }
            return;
        }
        if (i2 == 10 && (view instanceof eda)) {
            eda edaVar = (eda) view;
            k47 k47Var2 = (k47) arrayList.get(i - chaVar.m);
            edaVar.f(k47Var2, i != arrayList.size() - 1);
            if (nhaVar.F1) {
                edaVar.e(sparseArrayArr[(k47.B0(k47Var2.k) > j ? 1 : (k47.B0(k47Var2.k) == j ? 0 : -1)) == 0 ? (char) 0 : (char) 1].indexOfKey(k47Var2.e1()) >= 0, !nhaVar.e1);
            } else {
                edaVar.e(false, !nhaVar.e1);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // y59
    public final u69 x(ViewGroup viewGroup, int i) {
        View view;
        View wg4Var;
        nha nhaVar = this.f;
        tk4 tk4Var = nhaVar.E;
        ArrayList arrayList = nhaVar.J0;
        ylb ylbVar = nhaVar.I1;
        Context context = this.c;
        if (i != 7) {
            byte b = 2;
            byte b2 = this.d;
            if (i == 8) {
                tk4 tk4Var2 = new tk4(context, ylbVar);
                if (b2 == 2) {
                    tk4Var2.setViewType(4);
                } else {
                    tk4Var2.setViewType(3);
                }
                tk4Var2.x = false;
                tk4Var2.setIsSingleCell(true);
                tk4Var2.setGlobalGradientView(tk4Var);
                view = tk4Var2;
            } else {
                if (i == 9) {
                    bj G = nha.G(b2, nhaVar.m1, ylbVar, context);
                    G.setLayoutParams(new g69(-1, -1));
                    return new b59(G);
                }
                if (b2 != 4 || arrayList.isEmpty()) {
                    wg4Var = new wg4(this, context, ylbVar, b);
                } else {
                    View view2 = (View) arrayList.get(0);
                    arrayList.remove(0);
                    ViewGroup viewGroup2 = (ViewGroup) view2.getParent();
                    wg4Var = view2;
                    if (viewGroup2 != null) {
                        viewGroup2.removeView(view2);
                        wg4Var = view2;
                    }
                }
                eda edaVar = (eda) wg4Var;
                edaVar.setGlobalGradientView(tk4Var);
                view = wg4Var;
                if (b2 == 4) {
                    nhaVar.K0.add(edaVar);
                    view = wg4Var;
                }
            }
        } else {
            ida idaVar = new ida(0, ylbVar, context);
            idaVar.setGlobalGradientView(tk4Var);
            view = idaVar;
        }
        return kt6.h(view, view, -1, -2);
    }
}
