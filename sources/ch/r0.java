package ch;

import android.os.Bundle;
import org.telegram.ui.ActionBar.g2;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.c51;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final /* synthetic */ class r0 implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ long b;
    public final /* synthetic */ g2 c;

    public /* synthetic */ r0(long j3, g2 g2Var) {
        this.b = j3;
        this.c = g2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                g2 g2Var = this.c;
                g2Var.presentFragment(c51.g0(g2Var.getMessagesController().O0(Long.valueOf(-this.b)), true));
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

    public /* synthetic */ r0(g2 g2Var, long j3) {
        this.c = g2Var;
        this.b = j3;
    }
}
