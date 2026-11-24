// default package

import android.os.Bundle;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class j19 implements Runnable {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ long b;
    public final /* synthetic */ d c;

    public /* synthetic */ j19(long j, d dVar) {
        this.b = j;
        this.c = dVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        d dVar = this.c;
        long j = this.b;
        switch (b) {
            case 0:
                dVar.presentFragment(uxa.d0(dVar.getMessagesController().K0(Long.valueOf(-j)), true));
                break;
            default:
                Bundle bundle = new Bundle();
                if (j >= 0) {
                    bundle.putLong("user_id", j);
                } else {
                    bundle.putLong("chat_id", -j);
                }
                bundle.putBoolean("my_profile", true);
                bundle.putBoolean("open_gifts", true);
                dVar.presentFragment(new ProfileActivity(bundle, null));
                break;
        }
    }

    public /* synthetic */ j19(d dVar, long j) {
        this.c = dVar;
        this.b = j;
    }
}
