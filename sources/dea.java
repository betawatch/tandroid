// default package

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class dea extends n39 {
    public final Context c;
    public final /* synthetic */ nfa d;

    public dea(nfa nfaVar, Context context) {
        this.d = nfaVar;
        this.c = context;
    }

    @Override // n39
    public final boolean D(s49 s49Var) {
        cfa[] cfaVarArr = this.d.w1;
        return cfaVarArr[5].a.size() != 0 || cfaVarArr[5].g;
    }

    @Override // w39
    public final int b() {
        cfa[] cfaVarArr = this.d.w1;
        if (cfaVarArr[5].a.size() != 0 || cfaVarArr[5].g) {
            return cfaVarArr[5].a.size();
        }
        return 1;
    }

    @Override // w39
    public final long c(int i) {
        return i;
    }

    @Override // w39
    public final int d(int i) {
        cfa[] cfaVarArr = this.d.w1;
        return (cfaVarArr[5].a.size() != 0 || cfaVarArr[5].g) ? 12 : 11;
    }

    @Override // w39
    public final void t(s49 s49Var, int i) {
        if (s49Var.f == 12) {
            nfa nfaVar = this.d;
            k27 k27Var = (k27) nfaVar.w1[5].a.get(i);
            TLRPC.Document F0 = k27Var.F0();
            if (F0 != null) {
                View view = s49Var.a;
                if (view instanceof bw2) {
                    bw2 bw2Var = (bw2) view;
                    bw2Var.d(k27Var.k.date, k27Var, F0);
                    if (nfaVar.F1) {
                        bw2Var.c(nfaVar.c1[(k27.B0(k27Var.k) > nfaVar.m1 ? 1 : (k27.B0(k27Var.k) == nfaVar.m1 ? 0 : -1)) == 0 ? (char) 0 : (char) 1].indexOfKey(k27Var.e1()) >= 0, !nfaVar.e1);
                    } else {
                        bw2Var.c(false, !nfaVar.e1);
                    }
                }
            }
        }
    }

    @Override // w39
    public final s49 x(ViewGroup viewGroup, int i) {
        nfa nfaVar = this.d;
        wjb wjbVar = nfaVar.I1;
        Context context = this.c;
        if (i == 11) {
            bi G = nfa.G(5, nfaVar.m1, wjbVar, context);
            G.setLayoutParams(new e49(-1, -1));
            return new y29(G);
        }
        bw2 bw2Var = new bw2(wjbVar, context, true);
        bw2Var.setCanPreviewGif(true);
        return new y29(bw2Var);
    }

    @Override // w39
    public final void y(s49 s49Var) {
        View view = s49Var.a;
        if (view instanceof bw2) {
            ImageReceiver photoImage = ((bw2) view).getPhotoImage();
            if (this.d.n0[0].F == 5) {
                photoImage.u0 = true;
                photoImage.w0(false);
            } else {
                photoImage.u0 = false;
                photoImage.x0();
            }
        }
    }
}
