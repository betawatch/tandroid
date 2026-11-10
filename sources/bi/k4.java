package bi;

import android.os.Bundle;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.cn;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class k4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;

    public /* synthetic */ k4(long j3, int i7) {
        this.a = i7;
        this.b = j3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.ui.ActionBar.f2 T = LaunchActivity.T();
                if (T != null) {
                    Bundle bundle = new Bundle();
                    bundle.putLong("user_id", this.b);
                    bundle.putBoolean("my_profile", true);
                    bundle.putBoolean("open_gifts", true);
                    T.presentFragment(new ProfileActivity(bundle, null));
                    break;
                }
                break;
            case 1:
                org.telegram.ui.ActionBar.f2 T2 = LaunchActivity.T();
                if (T2 != null) {
                    T2.presentFragment(cn.ta(this.b));
                    break;
                }
                break;
            case 2:
                org.telegram.ui.ActionBar.f2 T3 = LaunchActivity.T();
                if (T3 != null) {
                    T3.presentFragment(cn.ta(this.b));
                    break;
                }
                break;
            default:
                org.telegram.ui.ActionBar.f2 T4 = LaunchActivity.T();
                if (T4 != null) {
                    T4.presentFragment(cn.ta(this.b));
                    break;
                }
                break;
        }
    }
}
