package gh;

import android.os.Bundle;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.qn;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class z7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.f3[] b;
    public final /* synthetic */ TL_stars.StarsTransaction c;
    public final /* synthetic */ long d;

    public /* synthetic */ z7(org.telegram.ui.ActionBar.f3[] f3VarArr, long j10, TL_stars.StarsTransaction starsTransaction) {
        this.a = 2;
        this.b = f3VarArr;
        this.d = j10;
        this.c = starsTransaction;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b[0].dismiss();
                org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                if (U != null) {
                    TL_stars.StarsTransaction starsTransaction = this.c;
                    int i9 = starsTransaction.flags & 8192;
                    long j10 = this.d;
                    if (i9 == 0) {
                        U.presentFragment(qn.R9(j10));
                        break;
                    } else {
                        U.presentFragment(qn.Q9(starsTransaction.giveaway_post_id, j10));
                        break;
                    }
                }
                break;
            case 1:
                this.b[0].dismiss();
                org.telegram.ui.ActionBar.o2 U2 = LaunchActivity.U();
                if (U2 != null) {
                    TL_stars.StarsTransaction starsTransaction2 = this.c;
                    int i10 = starsTransaction2.flags & 8192;
                    long j11 = this.d;
                    if (i10 == 0) {
                        U2.presentFragment(qn.R9(j11));
                        break;
                    } else {
                        U2.presentFragment(qn.Q9(starsTransaction2.giveaway_post_id, j11));
                        break;
                    }
                }
                break;
            case 2:
                this.b[0].dismiss();
                org.telegram.ui.ActionBar.o2 U3 = LaunchActivity.U();
                if (U3 != null) {
                    Bundle bundle = new Bundle();
                    bundle.putLong("chat_id", -this.d);
                    bundle.putInt("message_id", this.c.msg_id);
                    U3.presentFragment(new qn(bundle));
                    break;
                }
                break;
            case 3:
                this.b[0].dismiss();
                org.telegram.ui.ActionBar.o2 U4 = LaunchActivity.U();
                if (U4 != null) {
                    TL_stars.StarsTransaction starsTransaction3 = this.c;
                    int i11 = starsTransaction3.flags & 8192;
                    long j12 = this.d;
                    if (i11 == 0) {
                        U4.presentFragment(qn.R9(j12));
                        break;
                    } else {
                        U4.presentFragment(qn.Q9(starsTransaction3.giveaway_post_id, j12));
                        break;
                    }
                }
                break;
            default:
                this.b[0].dismiss();
                org.telegram.ui.ActionBar.o2 U5 = LaunchActivity.U();
                if (U5 != null) {
                    TL_stars.StarsTransaction starsTransaction4 = this.c;
                    int i12 = starsTransaction4.flags & 8192;
                    long j13 = this.d;
                    if (i12 == 0) {
                        U5.presentFragment(qn.R9(j13));
                        break;
                    } else {
                        U5.presentFragment(qn.Q9(starsTransaction4.giveaway_post_id, j13));
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ z7(org.telegram.ui.ActionBar.f3[] f3VarArr, TL_stars.StarsTransaction starsTransaction, long j10, int i9) {
        this.a = i9;
        this.b = f3VarArr;
        this.c = starsTransaction;
        this.d = j10;
    }
}
