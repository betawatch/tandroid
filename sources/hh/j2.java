package hh;

import android.os.Bundle;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.q91;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final /* synthetic */ class j2 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ org.telegram.ui.ActionBar.n2 b;
    public final /* synthetic */ long c;

    public /* synthetic */ j2(long j10, org.telegram.ui.ActionBar.n2 n2Var) {
        this.c = j10;
        this.b = n2Var;
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
                org.telegram.ui.ActionBar.n2 n2Var = this.b;
                n2Var.presentFragment(q91.d0(n2Var.getMessagesController().getChat(Long.valueOf(-this.c)), true));
                break;
        }
    }

    public /* synthetic */ j2(org.telegram.ui.ActionBar.n2 n2Var, long j10) {
        this.b = n2Var;
        this.c = j10;
    }
}
