package e2;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.profileinstaller.ProfileInstallerInitializer;
import java.util.Random;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import jh.f0;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.R;
import org.telegram.ui.ib0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final /* synthetic */ class e implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;

    public /* synthetic */ e(Context context, int i10) {
        this.a = i10;
        this.b = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                (Build.VERSION.SDK_INT >= 28 ? g.a(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new e(this.b, 1), new Random().nextInt(Math.max(MediaDataController.MAX_STYLE_RUNS_COUNT, 1)) + 5000);
                break;
            case 1:
                new ThreadPoolExecutor(0, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue()).execute(new e(this.b, 2));
                break;
            case 2:
                d.s(this.b, new ib0(1), d.a, false);
                break;
            case 3:
                new f0(this.b).show();
                break;
            case 4:
                ye.d.s(this.b, LocaleController.getString(R.string.StarsTOSLink));
                break;
            case 5:
                new f0(this.b).show();
                break;
            case 6:
                ye.d.s(this.b, LocaleController.getString(R.string.StarsTOSLink));
                break;
            case 7:
                ye.d.s(this.b, LocaleController.getString(R.string.StarsTOSLink));
                break;
            case 8:
                ye.d.s(this.b, LocaleController.getString(R.string.PaidContentInfoLink));
                break;
            case 9:
                ye.d.s(this.b, LocaleController.getString(R.string.StarsSubscribeInfoLink));
                break;
            case 10:
                ye.d.s(this.b, LocaleController.getString(R.string.StarsReactionTermsLink));
                break;
            case 11:
                new f0(this.b).show();
                break;
            default:
                ye.d.s(this.b, LocaleController.getString(R.string.ChannelAffiliateProgramJoinButtonInfoLink));
                break;
        }
    }

    public /* synthetic */ e(ProfileInstallerInitializer profileInstallerInitializer, Context context) {
        this.a = 0;
        this.b = context;
    }
}
