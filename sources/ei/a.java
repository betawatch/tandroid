package ei;

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
import zh.s;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes4.dex */
public final /* synthetic */ class a implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;

    public /* synthetic */ a(Context context, int i10) {
        this.a = i10;
        this.b = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                new s(this.b).show();
                break;
            case 1:
                of.f.s(this.b, LocaleController.getString(R.string.ChannelAffiliateProgramJoinButtonInfoLink));
                break;
            case 2:
                (Build.VERSION.SDK_INT >= 28 ? r4.f.a(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new a(this.b, 3), new Random().nextInt(Math.max(MediaDataController.MAX_STYLE_RUNS_COUNT, 1)) + 5000);
                break;
            case 3:
                new ThreadPoolExecutor(0, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue()).execute(new a(this.b, 4));
                break;
            case 4:
                r4.d.s(this.b, new a3.b(2), r4.d.a, false);
                break;
            case 5:
                new s(this.b).show();
                break;
            case 6:
                of.f.s(this.b, LocaleController.getString(R.string.StarsTOSLink));
                break;
            case 7:
                new s(this.b).show();
                break;
            case 8:
                of.f.s(this.b, LocaleController.getString(R.string.StarsTOSLink));
                break;
            case 9:
                of.f.s(this.b, LocaleController.getString(R.string.StarsTOSLink));
                break;
            case 10:
                of.f.s(this.b, LocaleController.getString(R.string.PaidContentInfoLink));
                break;
            case 11:
                of.f.s(this.b, LocaleController.getString(R.string.StarsSubscribeInfoLink));
                break;
            default:
                of.f.s(this.b, LocaleController.getString(R.string.StarsReactionTermsLink));
                break;
        }
    }

    public /* synthetic */ a(ProfileInstallerInitializer profileInstallerInitializer, Context context) {
        this.a = 2;
        this.b = context;
    }
}
