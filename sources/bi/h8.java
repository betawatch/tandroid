package bi;

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
import org.telegram.ui.Components.wr;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final class h8 {
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

    public h8(Context context, hi.y1 y1Var, b2.e eVar, a6.i iVar) {
        Context applicationContext = context.getApplicationContext();
        this.b = applicationContext;
        this.c = y1Var;
        this.j = eVar;
        this.i = iVar;
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
        k2.e0 e0Var = (k2.e0) ((hi.y1) this.c).b;
        Looper myLooper = Looper.myLooper();
        boolean z10 = e0Var.i0 == myLooper;
        StringBuilder sb2 = new StringBuilder("Current looper (");
        String str = BuildConfig.BETA_URL;
        sb2.append(myLooper == null ? BuildConfig.BETA_URL : myLooper.getThread().getName());
        sb2.append(") is not the playback looper (");
        Looper looper = e0Var.i0;
        if (looper != null) {
            str = looper.getThread().getName();
        }
        sb2.append(str);
        sb2.append(")");
        e2.d.f(sb2.toString(), z10);
        k2.b bVar2 = e0Var.y;
        if (bVar2 == null || bVar.equals(bVar2)) {
            return;
        }
        e0Var.y = bVar;
        k2.n nVar = e0Var.t;
        if (nVar != null) {
            nVar.L();
        }
    }

    public void b(g8 g8Var) {
        if (g8Var != null) {
            this.c = g8Var;
        }
        if (g8Var != null) {
            float f7 = g8Var.d;
            float f10 = g8Var.c;
            PointF[] pointFArr = g8Var.b;
            if (!this.a) {
                ((org.telegram.ui.Components.d6) this.e).d(f10, true);
                ((org.telegram.ui.Components.d6) this.f).d(f7, true);
                for (int i10 = 0; i10 < Math.min(4, pointFArr.length); i10++) {
                    ((org.telegram.ui.Components.d6[]) this.g)[i10].d(pointFArr[i10].x - f10, true);
                    ((org.telegram.ui.Components.d6[]) this.h)[i10].d(pointFArr[i10].y - f7, true);
                }
            }
        }
        this.a = g8Var != null;
        ((e0) this.b).run();
    }

    public void c(AudioDeviceInfo audioDeviceInfo) {
        a6.i iVar = (a6.i) this.i;
        if (Objects.equals(audioDeviceInfo, iVar == null ? null : (AudioDeviceInfo) iVar.b)) {
            return;
        }
        a6.i iVar2 = audioDeviceInfo != null ? new a6.i(audioDeviceInfo, 27) : null;
        this.i = iVar2;
        a(k2.b.c((Context) this.b, (b2.e) this.j, iVar2));
    }

    public h8(e0 e0Var) {
        Paint paint = new Paint(1);
        this.i = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(-8697);
        paint.setStrokeWidth(AndroidUtilities.dp(6.0f));
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setShadowLayer(1.08045274E9f, 0.0f, AndroidUtilities.dp(3.0f), AndroidUtilities.dp(6.0f));
        this.j = new Path();
        this.b = e0Var;
        wr wrVar = wr.g;
        this.d = new org.telegram.ui.Components.d6(0.0f, e0Var, 0L, 320L, wrVar);
        this.e = new org.telegram.ui.Components.d6(0.0f, e0Var, 0L, 160L, wrVar);
        this.f = new org.telegram.ui.Components.d6(0.0f, e0Var, 0L, 160L, wrVar);
        this.g = new org.telegram.ui.Components.d6[]{new org.telegram.ui.Components.d6(0.0f, e0Var, 0L, 160L, wrVar), new org.telegram.ui.Components.d6(0.0f, e0Var, 0L, 160L, wrVar), new org.telegram.ui.Components.d6(0.0f, e0Var, 0L, 160L, wrVar), new org.telegram.ui.Components.d6(0.0f, e0Var, 0L, 160L, wrVar)};
        this.h = new org.telegram.ui.Components.d6[]{new org.telegram.ui.Components.d6(0.0f, e0Var, 0L, 160L, wrVar), new org.telegram.ui.Components.d6(0.0f, e0Var, 0L, 160L, wrVar), new org.telegram.ui.Components.d6(0.0f, e0Var, 0L, 160L, wrVar), new org.telegram.ui.Components.d6(0.0f, e0Var, 0L, 160L, wrVar)};
    }
}
