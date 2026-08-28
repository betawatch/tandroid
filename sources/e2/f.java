package e2;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.profileinstaller.ProfileInstallerInitializer;
import gh.g0;
import java.util.Random;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.R;
import org.telegram.ui.gb0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class f implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;

    public /* synthetic */ f(Context context, int i9) {
        this.a = i9;
        this.b = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                (Build.VERSION.SDK_INT >= 28 ? h.a(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new f(this.b, 1), new Random().nextInt(Math.max(MediaDataController.MAX_STYLE_RUNS_COUNT, 1)) + 5000);
                break;
            case 1:
                new ThreadPoolExecutor(0, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue()).execute(new f(this.b, 2));
                break;
            case 2:
                e.s(this.b, new gb0(1), e.a, false);
                break;
            case 3:
                new g0(this.b).show();
                break;
            case 4:
                ve.e.s(this.b, LocaleController.getString(R.string.StarsTOSLink));
                break;
            case 5:
                new g0(this.b).show();
                break;
            case 6:
                ve.e.s(this.b, LocaleController.getString(R.string.StarsTOSLink));
                break;
            case 7:
                ve.e.s(this.b, LocaleController.getString(R.string.StarsTOSLink));
                break;
            case 8:
                ve.e.s(this.b, LocaleController.getString(R.string.PaidContentInfoLink));
                break;
            case 9:
                ve.e.s(this.b, LocaleController.getString(R.string.StarsSubscribeInfoLink));
                break;
            case 10:
                ve.e.s(this.b, LocaleController.getString(R.string.StarsReactionTermsLink));
                break;
            case 11:
                new g0(this.b).show();
                break;
            default:
                ve.e.s(this.b, LocaleController.getString(R.string.ChannelAffiliateProgramJoinButtonInfoLink));
                break;
        }
    }

    public /* synthetic */ f(ProfileInstallerInitializer profileInstallerInitializer, Context context) {
        this.a = 0;
        this.b = context;
    }
}
