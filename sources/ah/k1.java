package ah;

import android.os.Bundle;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.u91;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final /* synthetic */ class k1 implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ long b;
    public final /* synthetic */ o2 c;

    public /* synthetic */ k1(long j10, o2 o2Var) {
        this.b = j10;
        this.c = o2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                o2 o2Var = this.c;
                o2Var.presentFragment(u91.d0(o2Var.getMessagesController().getChat(Long.valueOf(-this.b)), true));
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

    public /* synthetic */ k1(o2 o2Var, long j10) {
        this.c = o2Var;
        this.b = j10;
    }
}
