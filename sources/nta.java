// default package

import android.os.Bundle;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class nta implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ fx0[] b;
    public final /* synthetic */ TL_stars.StarsTransaction c;
    public final /* synthetic */ long d;

    public /* synthetic */ nta(fx0[] fx0VarArr, long j, TL_stars.StarsTransaction starsTransaction) {
        this.a = (byte) 3;
        this.b = fx0VarArr;
        this.d = j;
        this.c = starsTransaction;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        long j = this.d;
        TL_stars.StarsTransaction starsTransaction = this.c;
        fx0[] fx0VarArr = this.b;
        switch (b) {
            case 0:
                fx0VarArr[0].dismiss();
                d S = LaunchActivity.S();
                if (S != null) {
                    if ((starsTransaction.flags & TLObject.FLAG_13) == 0) {
                        S.presentFragment(mu1.U9(j));
                        break;
                    } else {
                        S.presentFragment(mu1.T9(starsTransaction.giveaway_post_id, j));
                        break;
                    }
                }
                break;
            case 1:
                fx0VarArr[0].dismiss();
                d S2 = LaunchActivity.S();
                if (S2 != null) {
                    if ((starsTransaction.flags & TLObject.FLAG_13) == 0) {
                        S2.presentFragment(mu1.U9(j));
                        break;
                    } else {
                        S2.presentFragment(mu1.T9(starsTransaction.giveaway_post_id, j));
                        break;
                    }
                }
                break;
            case 2:
                fx0VarArr[0].dismiss();
                d S3 = LaunchActivity.S();
                if (S3 != null) {
                    if ((starsTransaction.flags & TLObject.FLAG_13) == 0) {
                        S3.presentFragment(mu1.U9(j));
                        break;
                    } else {
                        S3.presentFragment(mu1.T9(starsTransaction.giveaway_post_id, j));
                        break;
                    }
                }
                break;
            case 3:
                fx0VarArr[0].dismiss();
                d S4 = LaunchActivity.S();
                if (S4 != null) {
                    Bundle bundle = new Bundle();
                    bundle.putLong("chat_id", -j);
                    bundle.putInt("message_id", starsTransaction.msg_id);
                    S4.presentFragment(new mu1(bundle));
                    break;
                }
                break;
            default:
                fx0VarArr[0].dismiss();
                d S5 = LaunchActivity.S();
                if (S5 != null) {
                    if ((starsTransaction.flags & TLObject.FLAG_13) == 0) {
                        S5.presentFragment(mu1.U9(j));
                        break;
                    } else {
                        S5.presentFragment(mu1.T9(starsTransaction.giveaway_post_id, j));
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ nta(fx0[] fx0VarArr, TL_stars.StarsTransaction starsTransaction, long j, byte b) {
        this.a = b;
        this.b = fx0VarArr;
        this.c = starsTransaction;
        this.d = j;
    }
}
