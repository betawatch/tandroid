package k2;

import android.content.Context;
import android.content.IntentFilter;
import android.media.AudioDeviceInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import e9.x1;
import java.util.List;
import ji.m5;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes.dex */
public final class e {
    public final Context a;
    public final m5 b;
    public final Handler c;
    public final c d;
    public final androidx.mediarouter.app.f e;
    public final d f;
    public z2.d g;
    public b h;
    public AudioDeviceInfo i;
    public b2.f j;
    public boolean k;

    public e(Context context, m5 m5Var, b2.f fVar, AudioDeviceInfo audioDeviceInfo) {
        Context applicationContext = context.getApplicationContext();
        this.a = applicationContext;
        this.b = m5Var;
        this.j = fVar;
        this.i = audioDeviceInfo;
        String str = e2.m0.a;
        Looper myLooper = Looper.myLooper();
        Handler handler = new Handler(myLooper == null ? Looper.getMainLooper() : myLooper, null);
        this.c = handler;
        this.d = new c(this);
        this.e = new androidx.mediarouter.app.f(this, 5);
        x1 x1Var = b.e;
        String str2 = Build.MANUFACTURER;
        Uri uriFor = (str2.equals("Amazon") || str2.equals("Xiaomi")) ? Settings.Global.getUriFor("external_surround_sound_enabled") : null;
        this.f = uriFor != null ? new d(this, handler, applicationContext.getContentResolver(), uriFor) : null;
    }

    public final List a() {
        z2.d dVar;
        if (Build.VERSION.SDK_INT >= 32 && (dVar = this.g) != null) {
            return dVar.b();
        }
        e9.l0 l0Var = e9.n0.b;
        return x1.e;
    }

    public final void b(b bVar) {
        if (!this.k || bVar.equals(this.h)) {
            return;
        }
        this.h = bVar;
        j0 j0Var = (j0) this.b.b;
        j0Var.f();
        b bVar2 = j0Var.h;
        if (bVar2 == null || bVar.equals(bVar2)) {
            return;
        }
        j0Var.h = bVar;
        e2.r rVar = j0Var.f;
        if (rVar != null) {
            rVar.e(-1, new j2.e(29));
        }
    }

    public final void c() {
        List a2 = a();
        b2.f fVar = this.j;
        AudioDeviceInfo audioDeviceInfo = this.i;
        x1 x1Var = b.e;
        IntentFilter intentFilter = new IntentFilter("android.media.action.HDMI_AUDIO_PLUG");
        Context context = this.a;
        b(b.b(context, context.registerReceiver(null, intentFilter), fVar, audioDeviceInfo, a2));
    }
}
