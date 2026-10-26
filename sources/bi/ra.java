package bi;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.profileinstaller.ProfileInstallerInitializer;
import java.util.Random;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final /* synthetic */ class ra implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;

    public /* synthetic */ ra(Context context, int i10) {
        this.a = i10;
        this.b = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                qf.d.r(this.b, LocaleController.getString(R.string.StarsTOSLink));
                break;
            case 1:
                new q0(this.b).show();
                break;
            case 2:
                qf.d.r(this.b, LocaleController.getString(R.string.StarsTOSLink));
                break;
            case 3:
                qf.d.r(this.b, LocaleController.getString(R.string.StarsTOSLink));
                break;
            case 4:
                qf.d.r(this.b, LocaleController.getString(R.string.PaidContentInfoLink));
                break;
            case 5:
                qf.d.r(this.b, LocaleController.getString(R.string.StarsSubscribeInfoLink));
                break;
            case 6:
                qf.d.r(this.b, LocaleController.getString(R.string.StarsReactionTermsLink));
                break;
            case 7:
                new q0(this.b).show();
                break;
            case 8:
                qf.d.r(this.b, LocaleController.getString(R.string.ChannelAffiliateProgramJoinButtonInfoLink));
                break;
            case 9:
                (Build.VERSION.SDK_INT >= 28 ? r4.f.a(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new ra(this.b, 10), new Random().nextInt(Math.max(MediaDataController.MAX_STYLE_RUNS_COUNT, 1)) + 5000);
                break;
            case 10:
                new ThreadPoolExecutor(0, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue()).execute(new ra(this.b, 11));
                break;
            case 11:
                r4.d.s(this.b, new a3.b(2), r4.d.a, false);
                break;
            default:
                new q0(this.b).show();
                break;
        }
    }

    public /* synthetic */ ra(ProfileInstallerInitializer profileInstallerInitializer, Context context) {
        this.a = 9;
        this.b = context;
    }
}
