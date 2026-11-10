package bi;

import android.os.Bundle;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.e51;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class k3 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ org.telegram.ui.ActionBar.f2 b;
    public final /* synthetic */ long c;

    public /* synthetic */ k3(long j3, org.telegram.ui.ActionBar.f2 f2Var) {
        this.c = j3;
        this.b = f2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                Bundle bundle = new Bundle();
                long j3 = this.c;
                if (j3 >= 0) {
                    bundle.putLong("user_id", j3);
                } else {
                    bundle.putLong("chat_id", -j3);
                }
                bundle.putBoolean("my_profile", true);
                bundle.putBoolean("open_gifts", true);
                this.b.presentFragment(new ProfileActivity(bundle, null));
                break;
            default:
                org.telegram.ui.ActionBar.f2 f2Var = this.b;
                f2Var.presentFragment(e51.g0(f2Var.getMessagesController().M0(Long.valueOf(-this.c)), true));
                break;
        }
    }

    public /* synthetic */ k3(org.telegram.ui.ActionBar.f2 f2Var, long j3) {
        this.b = f2Var;
        this.c = j3;
    }
}
