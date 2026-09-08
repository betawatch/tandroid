package ah;

import android.os.Bundle;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.bb1;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final /* synthetic */ class l1 implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ long b;
    public final /* synthetic */ n2 c;

    public /* synthetic */ l1(long j3, n2 n2Var) {
        this.b = j3;
        this.c = n2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                n2 n2Var = this.c;
                n2Var.presentFragment(bb1.d0(n2Var.getMessagesController().getChat(Long.valueOf(-this.b)), true));
                break;
            default:
                Bundle bundle = new Bundle();
                long j3 = this.b;
                if (j3 >= 0) {
                    bundle.putLong("user_id", j3);
                } else {
                    bundle.putLong("chat_id", -j3);
                }
                bundle.putBoolean("my_profile", true);
                bundle.putBoolean("open_gifts", true);
                this.c.presentFragment(new ProfileActivity(bundle, null));
                break;
        }
    }

    public /* synthetic */ l1(n2 n2Var, long j3) {
        this.c = n2Var;
        this.b = j3;
    }
}
