package mh;

import android.os.Bundle;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.ha1;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes4.dex */
public final /* synthetic */ class g2 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ org.telegram.ui.ActionBar.p2 b;
    public final /* synthetic */ long c;

    public /* synthetic */ g2(long j10, org.telegram.ui.ActionBar.p2 p2Var) {
        this.c = j10;
        this.b = p2Var;
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
                org.telegram.ui.ActionBar.p2 p2Var = this.b;
                p2Var.presentFragment(ha1.d0(p2Var.getMessagesController().getChat(Long.valueOf(-this.c)), true));
                break;
        }
    }

    public /* synthetic */ g2(org.telegram.ui.ActionBar.p2 p2Var, long j10) {
        this.b = p2Var;
        this.c = j10;
    }
}
