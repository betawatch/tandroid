// default package

import android.os.Bundle;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class m39 implements Runnable {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ long b;
    public final /* synthetic */ d c;

    public /* synthetic */ m39(long j, d dVar) {
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
                dVar.presentFragment(xza.e0(dVar.getMessagesController().L0(Long.valueOf(-j)), true));
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

    public /* synthetic */ m39(d dVar, long j) {
        this.c = dVar;
        this.b = j;
    }
}
