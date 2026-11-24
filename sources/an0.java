// default package

import android.os.Bundle;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PrivacyControlActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class an0 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;

    public /* synthetic */ an0(int i, long j, byte b) {
        this.a = b;
        this.b = i;
        this.c = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        long j = this.c;
        int i = this.b;
        switch (b) {
            case 0:
                d S = LaunchActivity.S();
                if (S != null) {
                    S.presentFragment(yv1.fa(i, j));
                    break;
                }
                break;
            case 1:
                a6a.B(i).q0(y5a.b("/privacy", this.c, null, null, null, false, null, null, null, true, 0, 0, null, false));
                break;
            case 2:
                try {
                    SQLitePreparedStatement executeFast = cf7.Y(i).b.executeFast("REPLACE INTO search_recent VALUES(?, ?)");
                    executeFast.requery();
                    executeFast.bindLong(1, j);
                    executeFast.bindInteger(2, (int) (System.currentTimeMillis() / 1000));
                    executeFast.step();
                    executeFast.dispose();
                    break;
                } catch (Exception e) {
                    fc4.g(e, true);
                    return;
                }
            default:
                d S2 = LaunchActivity.S();
                if (S2 != null) {
                    if (j < 0) {
                        long j2 = -j;
                        if (!sd2.V(oc7.r1(i).L0(Long.valueOf(j2)))) {
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", j2);
                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 3);
                            wg2 wg2Var = new wg2(bundle);
                            wg2Var.B0(oc7.r1(i).M0(j2));
                            S2.presentFragment(wg2Var);
                            break;
                        } else {
                            S2.presentFragment(new wh8(j2));
                            break;
                        }
                    } else {
                        S2.presentFragment(new PrivacyControlActivity(10, false));
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ an0(long j, int i, byte b) {
        this.a = b;
        this.c = j;
        this.b = i;
    }
}
