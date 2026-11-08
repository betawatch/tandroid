package bi;

import android.os.Bundle;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.messenger.ez;
import org.telegram.messenger.gz;
import org.telegram.messenger.qp;
import org.telegram.messenger.yr;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PrivacyControlActivity;
import org.telegram.ui.an;
import org.telegram.ui.hs0;
import org.telegram.ui.oq;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ua implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;

    public /* synthetic */ ua(int i7, long j3, int i10) {
        this.a = i10;
        this.b = i7;
        this.c = j3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.ui.ActionBar.f2 T = LaunchActivity.T();
                if (T != null) {
                    long j3 = this.c;
                    if (j3 < 0) {
                        int i7 = this.b;
                        long j10 = -j3;
                        if (!org.telegram.messenger.t3.V(qp.s1(i7).M0(Long.valueOf(j10)))) {
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", j10);
                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 3);
                            oq oqVar = new oq(bundle);
                            oqVar.C0(qp.s1(i7).N0(j10));
                            T.presentFragment(oqVar);
                            break;
                        } else {
                            T.presentFragment(new hs0(j10));
                            break;
                        }
                    } else {
                        T.presentFragment(new PrivacyControlActivity(10, false));
                        break;
                    }
                }
                break;
            case 1:
                gz.C(this.b).r0(ez.b("/privacy", this.c, null, null, null, false, null, null, null, true, 0, 0, null, false));
                break;
            case 2:
                int i10 = this.b;
                long j11 = this.c;
                try {
                    SQLitePreparedStatement executeFast = yr.a0(i10).b.executeFast("REPLACE INTO search_recent VALUES(?, ?)");
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
            default:
                org.telegram.ui.ActionBar.f2 T2 = LaunchActivity.T();
                if (T2 != null) {
                    T2.presentFragment(an.qa(this.b, this.c));
                    break;
                }
                break;
        }
    }

    public /* synthetic */ ua(long j3, int i7, int i10) {
        this.a = i10;
        this.c = j3;
        this.b = i7;
    }
}
