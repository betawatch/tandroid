package k2;

import android.content.Context;
import android.content.IntentFilter;
import android.media.AudioDeviceInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import f9.s1;
import java.util.List;
import jg.e1;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class f {
    public final Context a;
    public final e1 b;
    public final Handler c;
    public final d d;
    public final androidx.mediarouter.app.g e;
    public final e f;
    public z2.d g;
    public b h;
    public AudioDeviceInfo i;
    public b2.f j;
    public boolean k;

    public f(Context context, e1 e1Var, b2.f fVar, AudioDeviceInfo audioDeviceInfo) {
        Context applicationContext = context.getApplicationContext();
        this.a = applicationContext;
        this.b = e1Var;
        this.j = fVar;
        this.i = audioDeviceInfo;
        String str = e2.n0.a;
        Looper myLooper = Looper.myLooper();
        Handler handler = new Handler(myLooper == null ? Looper.getMainLooper() : myLooper, null);
        this.c = handler;
        this.d = new d(this);
        this.e = new androidx.mediarouter.app.g(this, 5);
        s1 s1Var = b.e;
        String str2 = Build.MANUFACTURER;
        Uri uriFor = (str2.equals("Amazon") || str2.equals("Xiaomi")) ? Settings.Global.getUriFor("external_surround_sound_enabled") : null;
        this.f = uriFor != null ? new e(this, handler, applicationContext.getContentResolver(), uriFor) : null;
    }

    public final List a() {
        z2.d dVar;
        if (Build.VERSION.SDK_INT >= 32 && (dVar = this.g) != null) {
            return dVar.b();
        }
        f9.g0 g0Var = f9.i0.b;
        return s1.e;
    }

    public final void b(b bVar) {
        if (!this.k || bVar.equals(this.h)) {
            return;
        }
        this.h = bVar;
        l0 l0Var = (l0) this.b.b;
        l0Var.f();
        b bVar2 = l0Var.h;
        if (bVar2 == null || bVar.equals(bVar2)) {
            return;
        }
        l0Var.h = bVar;
        e2.r rVar = l0Var.f;
        if (rVar != null) {
            rVar.e(-1, new jh.l(7));
        }
    }

    public final void c() {
        List a2 = a();
        b2.f fVar = this.j;
        AudioDeviceInfo audioDeviceInfo = this.i;
        s1 s1Var = b.e;
        IntentFilter intentFilter = new IntentFilter("android.media.action.HDMI_AUDIO_PLUG");
        Context context = this.a;
        b(b.b(context, context.registerReceiver(null, intentFilter), fVar, audioDeviceInfo, a2));
    }
}
