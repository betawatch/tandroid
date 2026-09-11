package di;

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
import org.telegram.ui.Components.pr;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
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

    public g7(Context context, ji.k5 k5Var, b2.e eVar, ji.u4 u4Var) {
        Context applicationContext = context.getApplicationContext();
        this.b = applicationContext;
        this.c = k5Var;
        this.j = eVar;
        this.i = u4Var;
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
        k2.d0 d0Var = (k2.d0) ((ji.k5) this.c).b;
        Looper myLooper = Looper.myLooper();
        boolean z10 = d0Var.i0 == myLooper;
        StringBuilder sb2 = new StringBuilder("Current looper (");
        sb2.append(myLooper == null ? "null" : myLooper.getThread().getName());
        sb2.append(") is not the playback looper (");
        Looper looper = d0Var.i0;
        sb2.append(looper != null ? looper.getThread().getName() : "null");
        sb2.append(")");
        e2.d.f(sb2.toString(), z10);
        k2.b bVar2 = d0Var.y;
        if (bVar2 == null || bVar.equals(bVar2)) {
            return;
        }
        d0Var.y = bVar;
        k2.n nVar = d0Var.t;
        if (nVar != null) {
            nVar.x();
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
                ((org.telegram.ui.Components.e6) this.e).d(f10, true);
                ((org.telegram.ui.Components.e6) this.f).d(f7, true);
                for (int i10 = 0; i10 < Math.min(4, pointFArr.length); i10++) {
                    ((org.telegram.ui.Components.e6[]) this.g)[i10].d(pointFArr[i10].x - f10, true);
                    ((org.telegram.ui.Components.e6[]) this.h)[i10].d(pointFArr[i10].y - f7, true);
                }
            }
        }
        this.a = f7Var != null;
        ((a0) this.b).run();
    }

    public void c(AudioDeviceInfo audioDeviceInfo) {
        ji.u4 u4Var = (ji.u4) this.i;
        if (Objects.equals(audioDeviceInfo, u4Var == null ? null : (AudioDeviceInfo) u4Var.b)) {
            return;
        }
        ji.u4 u4Var2 = audioDeviceInfo != null ? new ji.u4(audioDeviceInfo, 1) : null;
        this.i = u4Var2;
        a(k2.b.c((Context) this.b, (b2.e) this.j, u4Var2));
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
        pr prVar = pr.g;
        this.d = new org.telegram.ui.Components.e6(0.0f, a0Var, 0L, 320L, prVar);
        this.e = new org.telegram.ui.Components.e6(0.0f, a0Var, 0L, 160L, prVar);
        this.f = new org.telegram.ui.Components.e6(0.0f, a0Var, 0L, 160L, prVar);
        this.g = new org.telegram.ui.Components.e6[]{new org.telegram.ui.Components.e6(0.0f, a0Var, 0L, 160L, prVar), new org.telegram.ui.Components.e6(0.0f, a0Var, 0L, 160L, prVar), new org.telegram.ui.Components.e6(0.0f, a0Var, 0L, 160L, prVar), new org.telegram.ui.Components.e6(0.0f, a0Var, 0L, 160L, prVar)};
        this.h = new org.telegram.ui.Components.e6[]{new org.telegram.ui.Components.e6(0.0f, a0Var, 0L, 160L, prVar), new org.telegram.ui.Components.e6(0.0f, a0Var, 0L, 160L, prVar), new org.telegram.ui.Components.e6(0.0f, a0Var, 0L, 160L, prVar), new org.telegram.ui.Components.e6(0.0f, a0Var, 0L, 160L, prVar)};
    }
}
