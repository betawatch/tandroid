package ci;

import android.os.Bundle;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.r41;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class x2 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ org.telegram.ui.ActionBar.d2 b;
    public final /* synthetic */ long c;

    public /* synthetic */ x2(long j10, org.telegram.ui.ActionBar.d2 d2Var) {
        this.c = j10;
        this.b = d2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                Bundle bundle = new Bundle();
                long j10 = this.c;
                if (j10 >= 0) {
                    bundle.putLong("user_id", j10);
                } else {
                    bundle.putLong("chat_id", -j10);
                }
                bundle.putBoolean("my_profile", true);
                bundle.putBoolean("open_gifts", true);
                this.b.presentFragment(new ProfileActivity(bundle, null));
                break;
            default:
                org.telegram.ui.ActionBar.d2 d2Var = this.b;
                d2Var.presentFragment(r41.g0(d2Var.getMessagesController().M0(Long.valueOf(-this.c)), true));
                break;
        }
    }

    public /* synthetic */ x2(org.telegram.ui.ActionBar.d2 d2Var, long j10) {
        this.b = d2Var;
        this.c = j10;
    }
}
