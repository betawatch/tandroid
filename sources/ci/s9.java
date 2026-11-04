package ci;

import android.os.Bundle;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.messenger.hp;
import org.telegram.messenger.qr;
import org.telegram.messenger.wy;
import org.telegram.messenger.yy;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PrivacyControlActivity;
import org.telegram.ui.nq;
import org.telegram.ui.wm;
import org.telegram.ui.xr0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class s9 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;

    public /* synthetic */ s9(int i3, long j10, int i10) {
        this.a = i10;
        this.b = i3;
        this.c = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.ui.ActionBar.d2 T = LaunchActivity.T();
                if (T != null) {
                    long j10 = this.c;
                    if (j10 < 0) {
                        int i3 = this.b;
                        long j11 = -j10;
                        if (!org.telegram.messenger.t3.V(hp.s1(i3).M0(Long.valueOf(j11)))) {
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", j11);
                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 3);
                            nq nqVar = new nq(bundle);
                            nqVar.C0(hp.s1(i3).N0(j11));
                            T.presentFragment(nqVar);
                            break;
                        } else {
                            T.presentFragment(new xr0(j11));
                            break;
                        }
                    } else {
                        T.presentFragment(new PrivacyControlActivity(10, false));
                        break;
                    }
                }
                break;
            case 1:
                yy.C(this.b).r0(wy.b("/privacy", this.c, null, null, null, false, null, null, null, true, 0, 0, null, false));
                break;
            case 2:
                int i10 = this.b;
                long j12 = this.c;
                try {
                    SQLitePreparedStatement executeFast = qr.a0(i10).b.executeFast("REPLACE INTO search_recent VALUES(?, ?)");
                    executeFast.requery();
                    executeFast.bindLong(1, j12);
                    executeFast.bindInteger(2, (int) (System.currentTimeMillis() / 1000));
                    executeFast.step();
                    executeFast.dispose();
                    break;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
            default:
                org.telegram.ui.ActionBar.d2 T2 = LaunchActivity.T();
                if (T2 != null) {
                    T2.presentFragment(wm.qa(this.b, this.c));
                    break;
                }
                break;
        }
    }

    public /* synthetic */ s9(long j10, int i3, int i10) {
        this.a = i10;
        this.c = j10;
        this.b = i3;
    }
}
