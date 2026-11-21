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
import org.telegram.messenger.gd;
import org.telegram.ui.Components.a30;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final /* synthetic */ class a implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;

    public /* synthetic */ a(Context context, int i7) {
        this.a = i7;
        this.b = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        Context context = this.b;
        switch (i7) {
            case 0:
                d.a(context);
                break;
            case 1:
                new a30(context).show();
                break;
            case 2:
                new a30(context).show();
                break;
            case 3:
                vf.c.t(context, gd.N0(2131744725, null));
                break;
            case 4:
                vf.c.t(context, gd.N0(2131744725, null));
                break;
            case 5:
                vf.c.t(context, gd.N0(2131747540, null));
                break;
            case 6:
                vf.c.t(context, gd.N0(2131744778, null));
                break;
            case 7:
                vf.c.t(context, gd.N0(2131744725, null));
                break;
            case 8:
                vf.c.t(context, gd.N0(2131744803, null));
                break;
            case 9:
                new a30(context).show();
                break;
            case 10:
                vf.c.t(context, gd.N0(2131752494, null));
                break;
            case 11:
                (Build.VERSION.SDK_INT >= 28 ? u4.f.a(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new a(context, 12), new Random().nextInt(Math.max(1000, 1)) + 5000);
                break;
            case 12:
                new ThreadPoolExecutor(0, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue()).execute(new a(context, 13));
                break;
            default:
                u4.d.s(context, new d3.b(3), u4.d.a, false);
                break;
        }
    }

    public /* synthetic */ a(ProfileInstallerInitializer profileInstallerInitializer, Context context) {
        this.a = 11;
        this.b = context;
    }
}
