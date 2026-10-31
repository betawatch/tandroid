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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class e {
    public final Context a;
    public final ig.c0 b;
    public final Handler c;
    public final c d;
    public final androidx.mediarouter.app.f e;
    public final d f;
    public z2.d g;
    public b h;
    public AudioDeviceInfo i;
    public b2.f j;
    public boolean k;

    public e(Context context, ig.c0 c0Var, b2.f fVar, AudioDeviceInfo audioDeviceInfo) {
        Context applicationContext = context.getApplicationContext();
        this.a = applicationContext;
        this.b = c0Var;
        this.j = fVar;
        this.i = audioDeviceInfo;
        String str = e2.l0.a;
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
        n0 n0Var = (n0) this.b.b;
        n0Var.f();
        b bVar2 = n0Var.h;
        if (bVar2 == null || bVar.equals(bVar2)) {
            return;
        }
        n0Var.h = bVar;
        e2.r rVar = n0Var.f;
        if (rVar != null) {
            rVar.e(-1, new k0(0));
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
