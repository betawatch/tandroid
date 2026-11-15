package di;

import android.os.Bundle;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.messenger.cz;
import org.telegram.messenger.ez;
import org.telegram.messenger.np;
import org.telegram.messenger.vr;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PrivacyControlActivity;
import org.telegram.ui.an;
import org.telegram.ui.es0;
import org.telegram.ui.qq;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class j9 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;

    public /* synthetic */ j9(int i7, long j3, int i10) {
        this.a = i10;
        this.b = i7;
        this.c = j3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.ui.ActionBar.e2 T = LaunchActivity.T();
                if (T != null) {
                    long j3 = this.c;
                    if (j3 < 0) {
                        int i7 = this.b;
                        long j10 = -j3;
                        if (!org.telegram.messenger.t3.V(np.s1(i7).M0(Long.valueOf(j10)))) {
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", j10);
                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 3);
                            qq qqVar = new qq(bundle);
                            qqVar.C0(np.s1(i7).N0(j10));
                            T.presentFragment(qqVar);
                            break;
                        } else {
                            T.presentFragment(new es0(j10));
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
                    SQLitePreparedStatement executeFast = vr.a0(i10).b.executeFast("REPLACE INTO search_recent VALUES(?, ?)");
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
                ez.C(this.b).r0(cz.b("/privacy", this.c, null, null, null, false, null, null, null, true, 0, 0, null, false));
                break;
            default:
                org.telegram.ui.ActionBar.e2 T2 = LaunchActivity.T();
                if (T2 != null) {
                    T2.presentFragment(an.ta(this.b, this.c));
                    break;
                }
                break;
        }
    }

    public /* synthetic */ j9(long j3, int i7, int i10) {
        this.a = i10;
        this.c = j3;
        this.b = i7;
    }
}
