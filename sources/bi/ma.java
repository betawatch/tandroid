package bi;

import android.os.Bundle;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.wn;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final /* synthetic */ class ma implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.k3[] b;
    public final /* synthetic */ TL_stars.StarsTransaction c;
    public final /* synthetic */ long d;

    public /* synthetic */ ma(org.telegram.ui.ActionBar.k3[] k3VarArr, long j10, TL_stars.StarsTransaction starsTransaction) {
        this.a = 2;
        this.b = k3VarArr;
        this.d = j10;
        this.c = starsTransaction;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b[0].dismiss();
                org.telegram.ui.ActionBar.r2 U = LaunchActivity.U();
                if (U != null) {
                    TL_stars.StarsTransaction starsTransaction = this.c;
                    int i10 = starsTransaction.flags & 8192;
                    long j10 = this.d;
                    if (i10 == 0) {
                        U.presentFragment(wn.ea(j10));
                        break;
                    } else {
                        U.presentFragment(wn.da(starsTransaction.giveaway_post_id, j10));
                        break;
                    }
                }
                break;
            case 1:
                this.b[0].dismiss();
                org.telegram.ui.ActionBar.r2 U2 = LaunchActivity.U();
                if (U2 != null) {
                    TL_stars.StarsTransaction starsTransaction2 = this.c;
                    int i11 = starsTransaction2.flags & 8192;
                    long j11 = this.d;
                    if (i11 == 0) {
                        U2.presentFragment(wn.ea(j11));
                        break;
                    } else {
                        U2.presentFragment(wn.da(starsTransaction2.giveaway_post_id, j11));
                        break;
                    }
                }
                break;
            case 2:
                this.b[0].dismiss();
                org.telegram.ui.ActionBar.r2 U3 = LaunchActivity.U();
                if (U3 != null) {
                    Bundle bundle = new Bundle();
                    bundle.putLong("chat_id", -this.d);
                    bundle.putInt("message_id", this.c.msg_id);
                    U3.presentFragment(new wn(bundle));
                    break;
                }
                break;
            case 3:
                this.b[0].dismiss();
                org.telegram.ui.ActionBar.r2 U4 = LaunchActivity.U();
                if (U4 != null) {
                    TL_stars.StarsTransaction starsTransaction3 = this.c;
                    int i12 = starsTransaction3.flags & 8192;
                    long j12 = this.d;
                    if (i12 == 0) {
                        U4.presentFragment(wn.ea(j12));
                        break;
                    } else {
                        U4.presentFragment(wn.da(starsTransaction3.giveaway_post_id, j12));
                        break;
                    }
                }
                break;
            default:
                this.b[0].dismiss();
                org.telegram.ui.ActionBar.r2 U5 = LaunchActivity.U();
                if (U5 != null) {
                    TL_stars.StarsTransaction starsTransaction4 = this.c;
                    int i13 = starsTransaction4.flags & 8192;
                    long j13 = this.d;
                    if (i13 == 0) {
                        U5.presentFragment(wn.ea(j13));
                        break;
                    } else {
                        U5.presentFragment(wn.da(starsTransaction4.giveaway_post_id, j13));
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ ma(org.telegram.ui.ActionBar.k3[] k3VarArr, TL_stars.StarsTransaction starsTransaction, long j10, int i10) {
        this.a = i10;
        this.b = k3VarArr;
        this.c = starsTransaction;
        this.d = j10;
    }
}
