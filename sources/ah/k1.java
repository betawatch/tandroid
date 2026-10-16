package ah;

import android.os.Bundle;
import org.telegram.ui.ActionBar.m2;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.hb1;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final /* synthetic */ class k1 implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ long b;
    public final /* synthetic */ m2 c;

    public /* synthetic */ k1(long j10, m2 m2Var) {
        this.b = j10;
        this.c = m2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                m2 m2Var = this.c;
                m2Var.presentFragment(hb1.d0(m2Var.getMessagesController().getChat(Long.valueOf(-this.b)), true));
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

    public /* synthetic */ k1(m2 m2Var, long j10) {
        this.c = m2Var;
        this.b = j10;
    }
}
