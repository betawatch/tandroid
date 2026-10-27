package bh;

import android.os.Bundle;
import org.telegram.ui.ActionBar.r2;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.y91;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
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
                r2Var.presentFragment(y91.c0(r2Var.getMessagesController().getChat(Long.valueOf(-this.b)), true));
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
