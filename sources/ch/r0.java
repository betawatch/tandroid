package ch;

import android.os.Bundle;
import org.telegram.ui.ActionBar.e2;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.z41;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class r0 implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ long b;
    public final /* synthetic */ e2 c;

    public /* synthetic */ r0(long j3, e2 e2Var) {
        this.b = j3;
        this.c = e2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                e2 e2Var = this.c;
                e2Var.presentFragment(z41.g0(e2Var.getMessagesController().M0(Long.valueOf(-this.b)), true));
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

    public /* synthetic */ r0(e2 e2Var, long j3) {
        this.c = e2Var;
        this.b = j3;
    }
}
