// default package

import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class aw8 implements jm7 {
    public static final aw8 c;
    public static final List d;
    public boolean a;
    public pp8 b;

    static {
        aw8 aw8Var = new aw8();
        aw8Var.b = new pp8(aw8Var, (byte) 11);
        c = aw8Var;
        d = Arrays.asList(5, 10, 15, 30, 60);
    }

    public final void a() {
        this.a = false;
        if (gda.W0) {
            ArrayList arrayList = new ArrayList(gda.v1);
            Collections.sort(arrayList, new qx7((byte) 9));
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                fda fdaVar = (fda) obj;
                if (fdaVar != gda.x1 && !fdaVar.c && fdaVar.d) {
                    SharedPreferences.Editor edit = oc7.d1().edit();
                    edit.putBoolean("proxy_enabled", true);
                    fdaVar.a.i(edit);
                    edit.apply();
                    gda.x1 = fdaVar;
                    nm7.e().k(nm7.E4, new Object[0]);
                    nm7.e().k(nm7.G4, new Object[0]);
                    ConnectionsManager.setProxySettings(true, gda.x1.a);
                    return;
                }
            }
        }
    }

    @Override // jm7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        pp8 pp8Var = this.b;
        if (i == nm7.F4) {
            boolean z = gda.a;
            if (oc7.d1().getBoolean("proxy_enabled", false) && gda.x1 != null && gda.W0 && gda.v1.size() > 1 && this.a) {
                a();
                return;
            }
            return;
        }
        if (i == nm7.E4) {
            gm.r(pp8Var);
            return;
        }
        if (i == nm7.T1 && i2 == z8c.t0) {
            boolean z2 = gda.a;
            if (((!oc7.d1().getBoolean("proxy_enabled", false) || gda.x1 == null) && !gda.W0) || gda.v1.size() <= 1) {
                return;
            }
            if (ConnectionsManager.getInstance(i2).getConnectionState() != 4) {
                gm.r(pp8Var);
            } else {
                if (this.a) {
                    return;
                }
                gm.d3(pp8Var, ((Integer) d.get(gda.X0)).intValue() * 1000);
            }
        }
    }
}
