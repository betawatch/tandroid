package bi;

import android.os.Bundle;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.an;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final /* synthetic */ class oa implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.v2[] b;
    public final /* synthetic */ TL_stars.StarsTransaction c;
    public final /* synthetic */ long d;

    public /* synthetic */ oa(org.telegram.ui.ActionBar.v2[] v2VarArr, long j3, TL_stars.StarsTransaction starsTransaction) {
        this.a = 3;
        this.b = v2VarArr;
        this.d = j3;
        this.c = starsTransaction;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b[0].dismiss();
                org.telegram.ui.ActionBar.f2 T = LaunchActivity.T();
                if (T != null) {
                    TL_stars.StarsTransaction starsTransaction = this.c;
                    int i7 = starsTransaction.flags & TLObject.FLAG_13;
                    long j3 = this.d;
                    if (i7 == 0) {
                        T.presentFragment(an.ra(j3));
                        break;
                    } else {
                        T.presentFragment(an.qa(starsTransaction.giveaway_post_id, j3));
                        break;
                    }
                }
                break;
            case 1:
                this.b[0].dismiss();
                org.telegram.ui.ActionBar.f2 T2 = LaunchActivity.T();
                if (T2 != null) {
                    TL_stars.StarsTransaction starsTransaction2 = this.c;
                    int i10 = starsTransaction2.flags & TLObject.FLAG_13;
                    long j10 = this.d;
                    if (i10 == 0) {
                        T2.presentFragment(an.ra(j10));
                        break;
                    } else {
                        T2.presentFragment(an.qa(starsTransaction2.giveaway_post_id, j10));
                        break;
                    }
                }
                break;
            case 2:
                this.b[0].dismiss();
                org.telegram.ui.ActionBar.f2 T3 = LaunchActivity.T();
                if (T3 != null) {
                    TL_stars.StarsTransaction starsTransaction3 = this.c;
                    int i11 = starsTransaction3.flags & TLObject.FLAG_13;
                    long j11 = this.d;
                    if (i11 == 0) {
                        T3.presentFragment(an.ra(j11));
                        break;
                    } else {
                        T3.presentFragment(an.qa(starsTransaction3.giveaway_post_id, j11));
                        break;
                    }
                }
                break;
            case 3:
                this.b[0].dismiss();
                org.telegram.ui.ActionBar.f2 T4 = LaunchActivity.T();
                if (T4 != null) {
                    Bundle bundle = new Bundle();
                    bundle.putLong("chat_id", -this.d);
                    bundle.putInt("message_id", this.c.msg_id);
                    T4.presentFragment(new an(bundle));
                    break;
                }
                break;
            default:
                this.b[0].dismiss();
                org.telegram.ui.ActionBar.f2 T5 = LaunchActivity.T();
                if (T5 != null) {
                    TL_stars.StarsTransaction starsTransaction4 = this.c;
                    int i12 = starsTransaction4.flags & TLObject.FLAG_13;
                    long j12 = this.d;
                    if (i12 == 0) {
                        T5.presentFragment(an.ra(j12));
                        break;
                    } else {
                        T5.presentFragment(an.qa(starsTransaction4.giveaway_post_id, j12));
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ oa(org.telegram.ui.ActionBar.v2[] v2VarArr, TL_stars.StarsTransaction starsTransaction, long j3, int i7) {
        this.a = i7;
        this.b = v2VarArr;
        this.c = starsTransaction;
        this.d = j3;
    }
}
