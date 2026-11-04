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
import org.telegram.messenger.bd;
import org.telegram.ui.Components.i20;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class s1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;

    public /* synthetic */ s1(Context context, int i3) {
        this.a = i3;
        this.b = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i3 = this.a;
        Context context = this.b;
        switch (i3) {
            case 0:
                new i20(context).show();
                break;
            case 1:
                new i20(context).show();
                break;
            case 2:
                sf.c.t(context, bd.M0(2131744976, null));
                break;
            case 3:
                sf.c.t(context, bd.M0(2131744976, null));
                break;
            case 4:
                sf.c.t(context, bd.M0(2131747742, null));
                break;
            case 5:
                sf.c.t(context, bd.M0(2131745029, null));
                break;
            case 6:
                sf.c.t(context, bd.M0(2131744976, null));
                break;
            case 7:
                sf.c.t(context, bd.M0(2131745054, null));
                break;
            case 8:
                new i20(context).show();
                break;
            case 9:
                sf.c.t(context, bd.M0(2131752506, null));
                break;
            case 10:
                (Build.VERSION.SDK_INT >= 28 ? t4.g.a(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new s1(context, 11), new Random().nextInt(Math.max(1000, 1)) + 5000);
                break;
            case 11:
                new ThreadPoolExecutor(0, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue()).execute(new s1(context, 12));
                break;
            default:
                t4.e.s(context, new c3.b(3), t4.e.a, false);
                break;
        }
    }

    public /* synthetic */ s1(ProfileInstallerInitializer profileInstallerInitializer, Context context) {
        this.a = 10;
        this.b = context;
    }
}
