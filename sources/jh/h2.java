package jh;

import android.os.Bundle;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.t91;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final /* synthetic */ class h2 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ org.telegram.ui.ActionBar.o2 b;
    public final /* synthetic */ long c;

    public /* synthetic */ h2(long j10, org.telegram.ui.ActionBar.o2 o2Var) {
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
                o2Var.presentFragment(t91.d0(o2Var.getMessagesController().getChat(Long.valueOf(-this.c)), true));
                break;
        }
    }

    public /* synthetic */ h2(org.telegram.ui.ActionBar.o2 o2Var, long j10) {
        this.b = o2Var;
        this.c = j10;
    }
}
