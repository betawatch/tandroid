package ai;

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

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes4.dex */
public final /* synthetic */ class sa implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;

    public /* synthetic */ sa(Context context, int i10) {
        this.a = i10;
        this.b = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                pf.d.r(this.b, LocaleController.getString(R.string.StarsTOSLink));
                break;
            case 1:
                new o0(this.b).show();
                break;
            case 2:
                pf.d.r(this.b, LocaleController.getString(R.string.StarsTOSLink));
                break;
            case 3:
                pf.d.r(this.b, LocaleController.getString(R.string.StarsTOSLink));
                break;
            case 4:
                pf.d.r(this.b, LocaleController.getString(R.string.PaidContentInfoLink));
                break;
            case 5:
                pf.d.r(this.b, LocaleController.getString(R.string.StarsSubscribeInfoLink));
                break;
            case 6:
                pf.d.r(this.b, LocaleController.getString(R.string.StarsReactionTermsLink));
                break;
            case 7:
                new o0(this.b).show();
                break;
            case 8:
                pf.d.r(this.b, LocaleController.getString(R.string.ChannelAffiliateProgramJoinButtonInfoLink));
                break;
            case 9:
                (Build.VERSION.SDK_INT >= 28 ? r4.g.a(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new sa(this.b, 10), new Random().nextInt(Math.max(MediaDataController.MAX_STYLE_RUNS_COUNT, 1)) + 5000);
                break;
            case 10:
                new ThreadPoolExecutor(0, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue()).execute(new sa(this.b, 11));
                break;
            case 11:
                r4.d.s(this.b, new a3.b(2), r4.d.a, false);
                break;
            default:
                new o0(this.b).show();
                break;
        }
    }

    public /* synthetic */ sa(ProfileInstallerInitializer profileInstallerInitializer, Context context) {
        this.a = 9;
        this.b = context;
    }
}
