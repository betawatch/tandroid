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

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class omb extends n39 {
    public final Context c;
    public final /* synthetic */ qmb d;

    public omb(qmb qmbVar, Context context) {
        this.d = qmbVar;
        this.c = context;
    }

    @Override // n39
    public final boolean D(s49 s49Var) {
        return false;
    }

    @Override // w39
    public final int b() {
        ArrayList arrayList = this.d.W0;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    @Override // w39
    public final int d(int i) {
        return 0;
    }

    @Override // w39
    public final void t(s49 s49Var, int i) {
        BlendMode blendMode;
        ly7 ly7Var = (ly7) s49Var.a;
        qmb qmbVar = this.d;
        ly7Var.setPattern((TLRPC.TL_wallPaper) qmbVar.W0.get(i));
        ly7Var.getImageReceiver().p1 = new PorterDuffColorFilter(qmbVar.l1, qmbVar.u1);
        if (Build.VERSION.SDK_INT >= 29) {
            int i2 = 0;
            if (qmbVar.b == 1) {
                int C0 = bkb.C0(bkb.Fe);
                long j = qmbVar.w.l;
                int i3 = (int) j;
                if (i3 != 0) {
                    i2 = i3;
                } else if (j == 0) {
                    i2 = C0;
                }
            } else if (qmbVar.D1 instanceof krc) {
                i2 = qmbVar.e1;
            }
            if (i2 == 0 || qmbVar.n1 < 0.0f) {
                ly7Var.getImageReceiver().P(null);
                return;
            }
            ImageReceiver imageReceiver = qmbVar.z0.getImageReceiver();
            blendMode = BlendMode.SOFT_LIGHT;
            imageReceiver.P(blendMode);
        }
    }

    @Override // w39
    public final s49 x(ViewGroup viewGroup, int i) {
        int i2 = this.d.J1;
        nmb nmbVar = new nmb(this);
        ly7 ly7Var = new ly7(this.c);
        ly7Var.H = new RectF();
        int i3 = y6c.t0;
        ly7Var.K = i3;
        ly7Var.setRoundRadius(gl.L(6.0f));
        ly7Var.V = i2;
        ly7Var.U = nmbVar;
        RadialProgress2 radialProgress2 = new RadialProgress2(ly7Var, null);
        ly7Var.I = radialProgress2;
        radialProgress2.p(gl.L(30.0f), gl.L(30.0f), gl.L(70.0f), gl.L(70.0f));
        ly7Var.R = new Paint(3);
        ly7Var.T = up3.q(i3).k();
        ly7Var.setOutlineProvider(new xi((byte) 7));
        ly7Var.setClipToOutline(true);
        return new y29(ly7Var);
    }
}
