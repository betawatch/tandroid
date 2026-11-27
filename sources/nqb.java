// default package

import android.content.Context;
import android.graphics.BlendMode;
import android.graphics.Paint;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.os.Build;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.RadialProgress2;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class nqb extends c79 {
    public final Context c;
    public final /* synthetic */ pqb d;

    public nqb(pqb pqbVar, Context context) {
        this.d = pqbVar;
        this.c = context;
    }

    @Override // c79
    public final boolean D(f89 f89Var) {
        return false;
    }

    @Override // j79
    public final int b() {
        ArrayList arrayList = this.d.W0;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    @Override // j79
    public final int d(int i) {
        return 0;
    }

    @Override // j79
    public final void t(f89 f89Var, int i) {
        BlendMode blendMode;
        r18 r18Var = (r18) f89Var.a;
        pqb pqbVar = this.d;
        r18Var.setPattern((TLRPC.TL_wallPaper) pqbVar.W0.get(i));
        r18Var.getImageReceiver().p1 = new PorterDuffColorFilter(pqbVar.l1, pqbVar.u1);
        if (Build.VERSION.SDK_INT >= 29) {
            int i2 = 0;
            if (pqbVar.b == 1) {
                int C0 = aob.C0(aob.Ge);
                long j = pqbVar.w.l;
                int i3 = (int) j;
                if (i3 != 0) {
                    i2 = i3;
                } else if (j == 0) {
                    i2 = C0;
                }
            } else if (pqbVar.D1 instanceof yvc) {
                i2 = pqbVar.e1;
            }
            if (i2 == 0 || pqbVar.n1 < 0.0f) {
                r18Var.getImageReceiver().P(null);
                return;
            }
            ImageReceiver imageReceiver = pqbVar.z0.getImageReceiver();
            blendMode = BlendMode.SOFT_LIGHT;
            imageReceiver.P(blendMode);
        }
    }

    @Override // j79
    public final f89 x(ViewGroup viewGroup, int i) {
        int i2 = this.d.J1;
        mqb mqbVar = new mqb(this);
        r18 r18Var = new r18(this.c);
        r18Var.H = new RectF();
        int i3 = yac.t0;
        r18Var.K = i3;
        r18Var.setRoundRadius(hl.L(6.0f));
        r18Var.V = i2;
        r18Var.U = mqbVar;
        RadialProgress2 radialProgress2 = new RadialProgress2(r18Var, null);
        r18Var.I = radialProgress2;
        radialProgress2.p(hl.L(30.0f), hl.L(30.0f), hl.L(70.0f), hl.L(70.0f));
        r18Var.R = new Paint(3);
        r18Var.T = lq3.q(i3).k();
        r18Var.setOutlineProvider(new yi((byte) 7));
        r18Var.setClipToOutline(true);
        return new n69(r18Var);
    }
}
