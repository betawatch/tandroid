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
import org.telegram.messenger.gd;
import org.telegram.ui.Components.x20;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class h2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;

    public /* synthetic */ h2(Context context, int i7) {
        this.a = i7;
        this.b = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        Context context = this.b;
        switch (i7) {
            case 0:
                new x20(context).show();
                break;
            case 1:
                new x20(context).show();
                break;
            case 2:
                vf.c.t(context, gd.N0(2131744725, null));
                break;
            case 3:
                vf.c.t(context, gd.N0(2131744725, null));
                break;
            case 4:
                vf.c.t(context, gd.N0(2131747540, null));
                break;
            case 5:
                vf.c.t(context, gd.N0(2131744778, null));
                break;
            case 6:
                vf.c.t(context, gd.N0(2131744725, null));
                break;
            case 7:
                vf.c.t(context, gd.N0(2131744803, null));
                break;
            case 8:
                new x20(context).show();
                break;
            case 9:
                vf.c.t(context, gd.N0(2131752494, null));
                break;
            case 10:
                (Build.VERSION.SDK_INT >= 28 ? u4.f.a(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new h2(context, 11), new Random().nextInt(Math.max(1000, 1)) + 5000);
                break;
            case 11:
                new ThreadPoolExecutor(0, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue()).execute(new h2(context, 12));
                break;
            default:
                u4.d.s(context, new d3.b(3), u4.d.a, false);
                break;
        }
    }

    public /* synthetic */ h2(ProfileInstallerInitializer profileInstallerInitializer, Context context) {
        this.a = 10;
        this.b = context;
    }
}
