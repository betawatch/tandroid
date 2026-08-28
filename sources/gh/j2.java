package gh;

import android.os.Bundle;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.s91;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class j2 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ org.telegram.ui.ActionBar.o2 b;
    public final /* synthetic */ long c;

    public /* synthetic */ j2(long j10, org.telegram.ui.ActionBar.o2 o2Var) {
        this.c = j10;
        this.b = o2Var;
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
                org.telegram.ui.ActionBar.o2 o2Var = this.b;
                o2Var.presentFragment(s91.c0(o2Var.getMessagesController().getChat(Long.valueOf(-this.c)), true));
                break;
        }
    }

    public /* synthetic */ j2(org.telegram.ui.ActionBar.o2 o2Var, long j10) {
        this.b = o2Var;
        this.c = j10;
    }
}
