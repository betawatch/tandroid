package ci;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.media.AudioDeviceInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import j$.util.Objects;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildConfig;
import org.telegram.ui.Components.qr;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes4.dex */
public final class g7 {
    public boolean a;
    public final Object b;
    public Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public Object h;
    public Object i;
    public Object j;

    public g7(Context context, k2.v vVar, b2.e eVar, a6.m mVar) {
        Context applicationContext = context.getApplicationContext();
        this.b = applicationContext;
        this.c = vVar;
        this.j = eVar;
        this.i = mVar;
        String str = e2.d0.a;
        Looper myLooper = Looper.myLooper();
        Handler handler = new Handler(myLooper == null ? Looper.getMainLooper() : myLooper, null);
        this.d = handler;
        this.e = Build.VERSION.SDK_INT >= 23 ? new k2.c(this) : null;
        this.f = new androidx.mediarouter.app.g(this, 5);
        k2.b bVar = k2.b.c;
        String str2 = Build.MANUFACTURER;
        Uri uriFor = (str2.equals("Amazon") || str2.equals("Xiaomi")) ? Settings.Global.getUriFor("external_surround_sound_enabled") : null;
        this.g = uriFor != null ? new k2.d(this, handler, applicationContext.getContentResolver(), uriFor) : null;
    }

    public void a(k2.b bVar) {
        if (!this.a || bVar.equals((k2.b) this.h)) {
            return;
        }
        this.h = bVar;
        k2.g0 g0Var = (k2.g0) ((k2.v) this.c).b;
        Looper myLooper = Looper.myLooper();
        boolean z10 = g0Var.i0 == myLooper;
        StringBuilder sb2 = new StringBuilder("Current looper (");
        String str = BuildConfig.BETA_URL;
        sb2.append(myLooper == null ? BuildConfig.BETA_URL : myLooper.getThread().getName());
        sb2.append(") is not the playback looper (");
        Looper looper = g0Var.i0;
        if (looper != null) {
            str = looper.getThread().getName();
        }
        sb2.append(str);
        sb2.append(")");
        e2.d.f(sb2.toString(), z10);
        k2.b bVar2 = g0Var.y;
        if (bVar2 == null || bVar.equals(bVar2)) {
            return;
        }
        g0Var.y = bVar;
        k2.n nVar = g0Var.t;
        if (nVar != null) {
            nVar.J();
        }
    }

    public void b(f7 f7Var) {
        if (f7Var != null) {
            this.c = f7Var;
        }
        if (f7Var != null) {
            float f7 = f7Var.d;
            float f10 = f7Var.c;
            PointF[] pointFArr = f7Var.b;
            if (!this.a) {
                ((org.telegram.ui.Components.c6) this.e).d(f10, true);
                ((org.telegram.ui.Components.c6) this.f).d(f7, true);
                for (int i10 = 0; i10 < Math.min(4, pointFArr.length); i10++) {
                    ((org.telegram.ui.Components.c6[]) this.g)[i10].d(pointFArr[i10].x - f10, true);
                    ((org.telegram.ui.Components.c6[]) this.h)[i10].d(pointFArr[i10].y - f7, true);
                }
            }
        }
        this.a = f7Var != null;
        ((a0) this.b).run();
    }

    public void c(AudioDeviceInfo audioDeviceInfo) {
        a6.m mVar = (a6.m) this.i;
        if (Objects.equals(audioDeviceInfo, mVar == null ? null : (AudioDeviceInfo) mVar.b)) {
            return;
        }
        a6.m mVar2 = audioDeviceInfo != null ? new a6.m(audioDeviceInfo, 29) : null;
        this.i = mVar2;
        a(k2.b.c((Context) this.b, (b2.e) this.j, mVar2));
    }

    public g7(a0 a0Var) {
        Paint paint = new Paint(1);
        this.i = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(-8697);
        paint.setStrokeWidth(AndroidUtilities.dp(6.0f));
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setShadowLayer(1.08045274E9f, 0.0f, AndroidUtilities.dp(3.0f), AndroidUtilities.dp(6.0f));
        this.j = new Path();
        this.b = a0Var;
        qr qrVar = qr.g;
        this.d = new org.telegram.ui.Components.c6(0.0f, a0Var, 0L, 320L, qrVar);
        this.e = new org.telegram.ui.Components.c6(0.0f, a0Var, 0L, 160L, qrVar);
        this.f = new org.telegram.ui.Components.c6(0.0f, a0Var, 0L, 160L, qrVar);
        this.g = new org.telegram.ui.Components.c6[]{new org.telegram.ui.Components.c6(0.0f, a0Var, 0L, 160L, qrVar), new org.telegram.ui.Components.c6(0.0f, a0Var, 0L, 160L, qrVar), new org.telegram.ui.Components.c6(0.0f, a0Var, 0L, 160L, qrVar), new org.telegram.ui.Components.c6(0.0f, a0Var, 0L, 160L, qrVar)};
        this.h = new org.telegram.ui.Components.c6[]{new org.telegram.ui.Components.c6(0.0f, a0Var, 0L, 160L, qrVar), new org.telegram.ui.Components.c6(0.0f, a0Var, 0L, 160L, qrVar), new org.telegram.ui.Components.c6(0.0f, a0Var, 0L, 160L, qrVar), new org.telegram.ui.Components.c6(0.0f, a0Var, 0L, 160L, qrVar)};
    }
}
