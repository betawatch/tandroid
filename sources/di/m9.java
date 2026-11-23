package di;

import android.os.Bundle;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.messenger.az;
import org.telegram.messenger.np;
import org.telegram.messenger.ur;
import org.telegram.messenger.yy;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PrivacyControlActivity;
import org.telegram.ui.bn;
import org.telegram.ui.is0;
import org.telegram.ui.rq;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final /* synthetic */ class m9 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;

    public /* synthetic */ m9(int i7, long j3, int i10) {
        this.a = i10;
        this.b = i7;
        this.c = j3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.ui.ActionBar.g2 T = LaunchActivity.T();
                if (T != null) {
                    long j3 = this.c;
                    if (j3 < 0) {
                        int i7 = this.b;
                        long j10 = -j3;
                        if (!org.telegram.messenger.v3.V(np.u1(i7).O0(Long.valueOf(j10)))) {
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", j10);
                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 3);
                            rq rqVar = new rq(bundle);
                            rqVar.C0(np.u1(i7).P0(j10));
                            T.presentFragment(rqVar);
                            break;
                        } else {
                            T.presentFragment(new is0(j10));
                            break;
                        }
                    } else {
                        T.presentFragment(new PrivacyControlActivity(10, false));
                        break;
                    }
                }
                break;
            case 1:
                int i10 = this.b;
                long j11 = this.c;
                try {
                    SQLitePreparedStatement executeFast = ur.a0(i10).b.executeFast("REPLACE INTO search_recent VALUES(?, ?)");
                    executeFast.requery();
                    executeFast.bindLong(1, j11);
                    executeFast.bindInteger(2, (int) (System.currentTimeMillis() / 1000));
                    executeFast.step();
                    executeFast.dispose();
                    break;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
            case 2:
                az.C(this.b).r0(yy.b("/privacy", this.c, null, null, null, false, null, null, null, true, 0, 0, null, false));
                break;
            default:
                org.telegram.ui.ActionBar.g2 T2 = LaunchActivity.T();
                if (T2 != null) {
                    T2.presentFragment(bn.ta(this.b, this.c));
                    break;
                }
                break;
        }
    }

    public /* synthetic */ m9(long j3, int i7, int i10) {
        this.a = i10;
        this.c = j3;
        this.b = i7;
    }
}
