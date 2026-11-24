// default package

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class bha extends m59 {
    public final Context r;
    public final /* synthetic */ nha s;

    public bha(nha nhaVar, Context context) {
        this.s = nhaVar;
        this.r = context;
    }

    @Override // z49
    public final String F(int i) {
        return null;
    }

    @Override // z49
    public final void G(r59 r59Var, float f, int[] iArr) {
        iArr[0] = 0;
        iArr[1] = 0;
    }

    @Override // m59
    public final int M(int i) {
        cha[] chaVarArr = this.s.w1;
        if ((chaVarArr[3].c.size() == 0 && !chaVarArr[3].g) || i >= chaVarArr[3].c.size()) {
            return 1;
        }
        cha chaVar = chaVarArr[3];
        return ((ArrayList) chaVar.d.get(chaVar.c.get(i))).size() + (i == 0 ? 0 : 1);
    }

    @Override // m59
    public final Object O(int i, int i2) {
        return null;
    }

    @Override // m59
    public final int P(int i, int i2) {
        cha[] chaVarArr = this.s.w1;
        if (chaVarArr[3].c.size() == 0 && !chaVarArr[3].g) {
            return 5;
        }
        if (i < chaVarArr[3].c.size()) {
            return (i == 0 || i2 != 0) ? 4 : 3;
        }
        return 6;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0034, code lost:
    
        if (r5[1] != false) goto L13;
     */
    @Override // m59
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int R() {
        cha[] chaVarArr = this.s.w1;
        int i = 1;
        if (chaVarArr[3].c.size() == 0 && !chaVarArr[3].g) {
            return 1;
        }
        int size = chaVarArr[3].c.size();
        if (!chaVarArr[3].c.isEmpty()) {
            boolean[] zArr = chaVarArr[3].i;
            if (zArr[0]) {
            }
            return size + i;
        }
        i = 0;
        return size + i;
    }

    @Override // m59
    public final View T(int i, View view) {
        nha nhaVar = this.s;
        cha[] chaVarArr = nhaVar.w1;
        if (view == null) {
            view = new l55(28, nhaVar.I1, this.r);
        }
        if (i == 0) {
            view.setAlpha(0.0f);
            return view;
        }
        if (i < chaVarArr[3].c.size()) {
            view.setAlpha(1.0f);
            ((l55) view).setText(jb6.e0(((k47) ((ArrayList) chaVarArr[3].d.get((String) chaVarArr[3].c.get(i))).get(0)).k.date, false));
        }
        return view;
    }

    @Override // m59
    public final boolean V(int i, int i2, u69 u69Var) {
        cha[] chaVarArr = this.s.w1;
        if (chaVarArr[3].c.size() != 0 || chaVarArr[3].g) {
            return i == 0 || i2 != 0;
        }
        return false;
    }

    @Override // m59
    public final void W(int i, int i2, u69 u69Var) {
        nha nhaVar = this.s;
        cha[] chaVarArr = nhaVar.w1;
        int i3 = u69Var.f;
        View view = u69Var.a;
        if (i3 == 6 || i3 == 5) {
            return;
        }
        ArrayList arrayList = (ArrayList) chaVarArr[3].d.get((String) chaVarArr[3].c.get(i));
        int i4 = u69Var.f;
        if (i4 == 3) {
            k47 k47Var = (k47) arrayList.get(0);
            if (view instanceof l55) {
                ((l55) view).setText(jb6.e0(k47Var.k.date, false));
                return;
            }
            return;
        }
        if (i4 == 4) {
            if (i != 0) {
                i2--;
            }
            if (!(view instanceof lda) || i2 < 0 || i2 >= arrayList.size()) {
                return;
            }
            lda ldaVar = (lda) view;
            k47 k47Var2 = (k47) arrayList.get(i2);
            ldaVar.E = i2 != arrayList.size() - 1 || (i == chaVarArr[3].c.size() - 1 && chaVarArr[3].g);
            ldaVar.e();
            ldaVar.c0 = k47Var2;
            ldaVar.requestLayout();
            if (nhaVar.F1) {
                ldaVar.f(nhaVar.c1[(k47.B0(k47Var2.k) > nhaVar.m1 ? 1 : (k47.B0(k47Var2.k) == nhaVar.m1 ? 0 : -1)) == 0 ? (char) 0 : (char) 1].indexOfKey(k47Var2.e1()) >= 0, !nhaVar.e1);
            } else {
                ldaVar.f(false, !nhaVar.e1);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // y59
    public final u69 x(ViewGroup viewGroup, int i) {
        l55 l55Var;
        nha nhaVar = this.s;
        ylb ylbVar = nhaVar.I1;
        Context context = this.r;
        if (i == 3) {
            l55Var = new l55(28, ylbVar, context);
        } else if (i == 4) {
            lda ldaVar = new lda(0, ylbVar, context);
            ldaVar.setDelegate(nhaVar.W1);
            l55Var = ldaVar;
        } else {
            if (i == 5) {
                bj G = nha.G(3, nhaVar.m1, ylbVar, context);
                G.setLayoutParams(new g69(-1, -1));
                return new b59(G);
            }
            tk4 tk4Var = new tk4(context, ylbVar);
            tk4Var.setIsSingleCell(true);
            tk4Var.x = false;
            tk4Var.setViewType(5);
            l55Var = tk4Var;
        }
        return kt6.h(l55Var, l55Var, -1, -2);
    }
}
