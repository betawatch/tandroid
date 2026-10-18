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

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
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
                (Build.VERSION.SDK_INT >= 28 ? r4.h.a(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new ra(this.b, 10), new Random().nextInt(Math.max(MediaDataController.MAX_STYLE_RUNS_COUNT, 1)) + 5000);
                break;
            case 10:
                new ThreadPoolExecutor(0, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue()).execute(new ra(this.b, 11));
                break;
            case 11:
                r4.e.s(this.b, new a3.b(2), r4.e.a, false);
                break;
            default:
                new o0(this.b).show();
                break;
        }
    }

    public /* synthetic */ ra(ProfileInstallerInitializer profileInstallerInitializer, Context context) {
        this.a = 9;
        this.b = context;
    }
}
