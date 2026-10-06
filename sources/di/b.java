package di;

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
import yh.t;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes4.dex */
public final /* synthetic */ class b implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;

    public /* synthetic */ b(Context context, int i10) {
        this.a = i10;
        this.b = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                new t(this.b).show();
                break;
            case 1:
                nf.f.s(this.b, LocaleController.getString(R.string.ChannelAffiliateProgramJoinButtonInfoLink));
                break;
            case 2:
                (Build.VERSION.SDK_INT >= 28 ? r4.f.a(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new b(this.b, 3), new Random().nextInt(Math.max(MediaDataController.MAX_STYLE_RUNS_COUNT, 1)) + 5000);
                break;
            case 3:
                new ThreadPoolExecutor(0, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue()).execute(new b(this.b, 4));
                break;
            case 4:
                r4.d.s(this.b, new a3.b(2), r4.d.a, false);
                break;
            case 5:
                new t(this.b).show();
                break;
            case 6:
                nf.f.s(this.b, LocaleController.getString(R.string.StarsTOSLink));
                break;
            case 7:
                new t(this.b).show();
                break;
            case 8:
                nf.f.s(this.b, LocaleController.getString(R.string.StarsTOSLink));
                break;
            case 9:
                nf.f.s(this.b, LocaleController.getString(R.string.StarsTOSLink));
                break;
            case 10:
                nf.f.s(this.b, LocaleController.getString(R.string.PaidContentInfoLink));
                break;
            case 11:
                nf.f.s(this.b, LocaleController.getString(R.string.StarsSubscribeInfoLink));
                break;
            default:
                nf.f.s(this.b, LocaleController.getString(R.string.StarsReactionTermsLink));
                break;
        }
    }

    public /* synthetic */ b(ProfileInstallerInitializer profileInstallerInitializer, Context context) {
        this.a = 2;
        this.b = context;
    }
}
