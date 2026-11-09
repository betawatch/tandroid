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
import org.telegram.ui.Components.n20;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class pa implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;

    public /* synthetic */ pa(Context context, int i7) {
        this.a = i7;
        this.b = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        Context context = this.b;
        switch (i7) {
            case 0:
                new n20(context).show();
                break;
            case 1:
                vf.c.t(context, org.telegram.messenger.id.M0(2131744966, null));
                break;
            case 2:
                vf.c.t(context, org.telegram.messenger.id.M0(2131744966, null));
                break;
            case 3:
                vf.c.t(context, org.telegram.messenger.id.M0(2131747734, null));
                break;
            case 4:
                vf.c.t(context, org.telegram.messenger.id.M0(2131745019, null));
                break;
            case 5:
                vf.c.t(context, org.telegram.messenger.id.M0(2131744966, null));
                break;
            case 6:
                vf.c.t(context, org.telegram.messenger.id.M0(2131745044, null));
                break;
            case 7:
                new n20(context).show();
                break;
            case 8:
                vf.c.t(context, org.telegram.messenger.id.M0(2131752506, null));
                break;
            case 9:
                (Build.VERSION.SDK_INT >= 28 ? u4.f.a(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new pa(context, 10), new Random().nextInt(Math.max(1000, 1)) + 5000);
                break;
            case 10:
                new ThreadPoolExecutor(0, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue()).execute(new pa(context, 11));
                break;
            case 11:
                u4.d.s(context, new d3.b(3), u4.d.a, false);
                break;
            default:
                new n20(context).show();
                break;
        }
    }

    public /* synthetic */ pa(ProfileInstallerInitializer profileInstallerInitializer, Context context) {
        this.a = 9;
        this.b = context;
    }
}
