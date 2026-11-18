package ch;

import android.os.Bundle;
import org.telegram.ui.ActionBar.h2;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.c51;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class r0 implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ long b;
    public final /* synthetic */ h2 c;

    public /* synthetic */ r0(long j3, h2 h2Var) {
        this.b = j3;
        this.c = h2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                h2 h2Var = this.c;
                h2Var.presentFragment(c51.g0(h2Var.getMessagesController().O0(Long.valueOf(-this.b)), true));
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

    public /* synthetic */ r0(h2 h2Var, long j3) {
        this.c = h2Var;
        this.b = j3;
    }
}
