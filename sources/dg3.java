// default package

import android.os.Bundle;
import android.view.View;
import java.util.ArrayList;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class dg3 implements c39 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ cj3 b;

    public /* synthetic */ dg3(cj3 cj3Var, byte b) {
        this.a = b;
        this.b = cj3Var;
    }

    @Override // c39
    public final void d(int i, View view) {
        byte b = this.a;
        cj3 cj3Var = this.b;
        switch (b) {
            case 0:
                Object obj = cj3Var.D0.y0.G(i).H;
                if (!(obj instanceof k27)) {
                    if (obj instanceof t1b) {
                        t1b t1bVar = (t1b) obj;
                        Bundle j = ls6.j(3, TeXSymbolParser.TYPE_ATTR);
                        j.putString("hashtag", t1bVar.C);
                        j.putInt("storiesCount", t1bVar.J);
                        cj3Var.presentFragment(new zj6(j, null));
                        break;
                    }
                } else {
                    k27 k27Var = (k27) obj;
                    Bundle bundle = new Bundle();
                    long B0 = k27.B0(k27Var.k);
                    TLRPC.Message message = k27Var.k;
                    if (B0 >= 0) {
                        bundle.putLong("user_id", k27.B0(message));
                    } else {
                        bundle.putLong("chat_id", -k27.B0(message));
                    }
                    bundle.putInt("message_id", k27Var.e1());
                    mu1 mu1Var = new mu1(bundle);
                    cj3.A3(mu1Var, k27Var);
                    cj3Var.presentFragment(mu1Var);
                    break;
                }
                break;
            default:
                cj3Var.c0.J0(true);
                ArrayList arrayList = cj3Var.c0.f3;
                cj3Var.z2(arrayList.isEmpty() ? tf4.k3[i] : (rf4) arrayList.get(i));
                break;
        }
    }
}
