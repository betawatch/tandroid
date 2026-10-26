package bh;

import android.os.Bundle;
import org.telegram.ui.ActionBar.r2;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.w91;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final /* synthetic */ class z0 implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ long b;
    public final /* synthetic */ r2 c;

    public /* synthetic */ z0(long j10, r2 r2Var) {
        this.b = j10;
        this.c = r2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                r2 r2Var = this.c;
                r2Var.presentFragment(w91.c0(r2Var.getMessagesController().getChat(Long.valueOf(-this.b)), true));
                break;
            default:
                Bundle bundle = new Bundle();
                long j10 = this.b;
                if (j10 >= 0) {
                    bundle.putLong("user_id", j10);
                } else {
                    bundle.putLong("chat_id", -j10);
                }
                bundle.putBoolean("my_profile", true);
                bundle.putBoolean("open_gifts", true);
                this.c.presentFragment(new ProfileActivity(bundle, null));
                break;
        }
    }

    public /* synthetic */ z0(r2 r2Var, long j10) {
        this.c = r2Var;
        this.b = j10;
    }
}
