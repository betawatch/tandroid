package ci;

import android.os.Bundle;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.wm;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class n9 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.t2[] b;
    public final /* synthetic */ TL_stars.StarsTransaction c;
    public final /* synthetic */ long d;

    public /* synthetic */ n9(org.telegram.ui.ActionBar.t2[] t2VarArr, long j10, TL_stars.StarsTransaction starsTransaction) {
        this.a = 3;
        this.b = t2VarArr;
        this.d = j10;
        this.c = starsTransaction;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b[0].dismiss();
                org.telegram.ui.ActionBar.d2 T = LaunchActivity.T();
                if (T != null) {
                    TL_stars.StarsTransaction starsTransaction = this.c;
                    int i3 = starsTransaction.flags & TLObject.FLAG_13;
                    long j10 = this.d;
                    if (i3 == 0) {
                        T.presentFragment(wm.ra(j10));
                        break;
                    } else {
                        T.presentFragment(wm.qa(starsTransaction.giveaway_post_id, j10));
                        break;
                    }
                }
                break;
            case 1:
                this.b[0].dismiss();
                org.telegram.ui.ActionBar.d2 T2 = LaunchActivity.T();
                if (T2 != null) {
                    TL_stars.StarsTransaction starsTransaction2 = this.c;
                    int i10 = starsTransaction2.flags & TLObject.FLAG_13;
                    long j11 = this.d;
                    if (i10 == 0) {
                        T2.presentFragment(wm.ra(j11));
                        break;
                    } else {
                        T2.presentFragment(wm.qa(starsTransaction2.giveaway_post_id, j11));
                        break;
                    }
                }
                break;
            case 2:
                this.b[0].dismiss();
                org.telegram.ui.ActionBar.d2 T3 = LaunchActivity.T();
                if (T3 != null) {
                    TL_stars.StarsTransaction starsTransaction3 = this.c;
                    int i11 = starsTransaction3.flags & TLObject.FLAG_13;
                    long j12 = this.d;
                    if (i11 == 0) {
                        T3.presentFragment(wm.ra(j12));
                        break;
                    } else {
                        T3.presentFragment(wm.qa(starsTransaction3.giveaway_post_id, j12));
                        break;
                    }
                }
                break;
            case 3:
                this.b[0].dismiss();
                org.telegram.ui.ActionBar.d2 T4 = LaunchActivity.T();
                if (T4 != null) {
                    Bundle bundle = new Bundle();
                    bundle.putLong("chat_id", -this.d);
                    bundle.putInt("message_id", this.c.msg_id);
                    T4.presentFragment(new wm(bundle));
                    break;
                }
                break;
            default:
                this.b[0].dismiss();
                org.telegram.ui.ActionBar.d2 T5 = LaunchActivity.T();
                if (T5 != null) {
                    TL_stars.StarsTransaction starsTransaction4 = this.c;
                    int i12 = starsTransaction4.flags & TLObject.FLAG_13;
                    long j13 = this.d;
                    if (i12 == 0) {
                        T5.presentFragment(wm.ra(j13));
                        break;
                    } else {
                        T5.presentFragment(wm.qa(starsTransaction4.giveaway_post_id, j13));
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ n9(org.telegram.ui.ActionBar.t2[] t2VarArr, TL_stars.StarsTransaction starsTransaction, long j10, int i3) {
        this.a = i3;
        this.b = t2VarArr;
        this.c = starsTransaction;
        this.d = j10;
    }
}
