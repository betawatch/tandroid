// default package

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class dga extends q59 {
    public final Context c;
    public final /* synthetic */ nha d;

    public dga(nha nhaVar, Context context) {
        this.d = nhaVar;
        this.c = context;
    }

    @Override // q59
    public final boolean D(u69 u69Var) {
        cha[] chaVarArr = this.d.w1;
        return chaVarArr[5].a.size() != 0 || chaVarArr[5].g;
    }

    @Override // y59
    public final int b() {
        cha[] chaVarArr = this.d.w1;
        if (chaVarArr[5].a.size() != 0 || chaVarArr[5].g) {
            return chaVarArr[5].a.size();
        }
        return 1;
    }

    @Override // y59
    public final long c(int i) {
        return i;
    }

    @Override // y59
    public final int d(int i) {
        cha[] chaVarArr = this.d.w1;
        return (chaVarArr[5].a.size() != 0 || chaVarArr[5].g) ? 12 : 11;
    }

    @Override // y59
    public final void t(u69 u69Var, int i) {
        if (u69Var.f == 12) {
            nha nhaVar = this.d;
            k47 k47Var = (k47) nhaVar.w1[5].a.get(i);
            TLRPC.Document F0 = k47Var.F0();
            if (F0 != null) {
                View view = u69Var.a;
                if (view instanceof lx2) {
                    lx2 lx2Var = (lx2) view;
                    lx2Var.d(k47Var.k.date, k47Var, F0);
                    if (nhaVar.F1) {
                        lx2Var.c(nhaVar.c1[(k47.B0(k47Var.k) > nhaVar.m1 ? 1 : (k47.B0(k47Var.k) == nhaVar.m1 ? 0 : -1)) == 0 ? (char) 0 : (char) 1].indexOfKey(k47Var.e1()) >= 0, !nhaVar.e1);
                    } else {
                        lx2Var.c(false, !nhaVar.e1);
                    }
                }
            }
        }
    }

    @Override // y59
    public final u69 x(ViewGroup viewGroup, int i) {
        nha nhaVar = this.d;
        ylb ylbVar = nhaVar.I1;
        Context context = this.c;
        if (i == 11) {
            bj G = nha.G(5, nhaVar.m1, ylbVar, context);
            G.setLayoutParams(new g69(-1, -1));
            return new b59(G);
        }
        lx2 lx2Var = new lx2(ylbVar, context, true);
        lx2Var.setCanPreviewGif(true);
        return new b59(lx2Var);
    }

    @Override // y59
    public final void y(u69 u69Var) {
        View view = u69Var.a;
        if (view instanceof lx2) {
            ImageReceiver photoImage = ((lx2) view).getPhotoImage();
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
