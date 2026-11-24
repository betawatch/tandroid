// default package

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.profileinstaller.ProfileInstallerInitializer;
import java.util.Random;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.telegram.messenger.beta.R;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.utils.twidget.z;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class dh1 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Context b;

    public /* synthetic */ dh1(ProfileInstallerInitializer profileInstallerInitializer, Context context) {
        this.a = (byte) 6;
        this.b = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        byte b2 = 1;
        Context context = this.b;
        switch (b) {
            case 0:
                l11.u(context, jb6.M0(2131752453, null));
                break;
            case 1:
                cmb.J(context, false);
                break;
            case 2:
                new ud5(context).show();
                break;
            case 3:
                oa5.k(context);
                break;
            case 4:
                l11.u(context, jb6.M0(2131744655, null));
                break;
            case 5:
                Activity W = gm.W(context);
                if (W == null) {
                    W = LaunchActivity.H1;
                }
                if (W != null && !W.isFinishing()) {
                    W.moveTaskToBack(true);
                    break;
                }
                break;
            case 6:
                (Build.VERSION.SDK_INT >= 28 ? ht8.a(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new dh1(context, (byte) 7), new Random().nextInt(1000) + 5000);
                break;
            case 7:
                new ThreadPoolExecutor(0, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue()).execute(new dh1(context, (byte) 8));
                break;
            case 8:
                ced.b(context, new kc(b2), ced.a, false);
                break;
            case 9:
                l11.u(context, "https://promote.telegram.org/guidelines");
                break;
            case 10:
                l11.u(context, "https://promote.telegram.org/guidelines");
                break;
            case 11:
                l11.u(context, "https://promote.telegram.org/guidelines");
                break;
            case 12:
                l11.u(context, "https://promote.telegram.org/guidelines");
                break;
            case 13:
                l11.u(context, "https://promote.telegram.org/guidelines");
                break;
            case 14:
                l11.u(context, "https://promote.telegram.org/guidelines");
                break;
            case 15:
                new ud5(context).show();
                break;
            case 16:
                l11.u(context, jb6.M0(2131744655, null));
                break;
            case 17:
                l11.u(context, jb6.M0(2131744655, null));
                break;
            case 18:
                l11.u(context, jb6.M0(2131747467, null));
                break;
            case 19:
                l11.u(context, jb6.M0(2131744708, null));
                break;
            case 20:
                l11.u(context, jb6.M0(2131744655, null));
                break;
            case 21:
                l11.u(context, jb6.M0(2131744733, null));
                break;
            case 22:
                Activity W2 = gm.W(context);
                if (W2 instanceof LaunchActivity) {
                    ((LaunchActivity) W2).t0(new PremiumPreviewFragment(0, i46.l1(10)));
                    break;
                }
                break;
            case 23:
                Activity W3 = gm.W(context);
                if (W3 instanceof LaunchActivity) {
                    ((LaunchActivity) W3).t0(new PremiumPreviewFragment(0, i46.l1(9)));
                    break;
                }
                break;
            case 24:
                new ud5(context).show();
                break;
            case 25:
                l11.w(context, jb6.M0(2131743881, null), false);
                break;
            case 26:
                l11.w(context, jb6.M0(2131743881, null), false);
                break;
            case 27:
                new ioc(context.getApplicationContext(), R.drawable.wallet_card_qr, 46, new jd((byte) 10));
                break;
            case 28:
                l11.u(context, jb6.M0(2131742606, null));
                break;
            default:
                z.d(context);
                break;
        }
    }

    public /* synthetic */ dh1(Context context, byte b) {
        this.a = b;
        this.b = context;
    }
}
