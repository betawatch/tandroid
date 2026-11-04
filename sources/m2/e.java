package m2;

import android.content.Context;
import android.content.IntentFilter;
import android.media.AudioDeviceInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import g9.s1;
import java.util.List;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class e {
    public final Context a;
    public final l5.b b;
    public final Handler c;
    public final c d;
    public final androidx.mediarouter.app.f e;
    public final d f;
    public b3.d g;
    public b h;
    public AudioDeviceInfo i;
    public d2.f j;
    public boolean k;

    public e(Context context, l5.b bVar, d2.f fVar, AudioDeviceInfo audioDeviceInfo) {
        Context applicationContext = context.getApplicationContext();
        this.a = applicationContext;
        this.b = bVar;
        this.j = fVar;
        this.i = audioDeviceInfo;
        String str = g2.n0.a;
        Looper myLooper = Looper.myLooper();
        Handler handler = new Handler(myLooper == null ? Looper.getMainLooper() : myLooper, null);
        this.c = handler;
        this.d = new c(this);
        this.e = new androidx.mediarouter.app.f(this, 4);
        s1 s1Var = b.e;
        String str2 = Build.MANUFACTURER;
        Uri uriFor = (str2.equals("Amazon") || str2.equals("Xiaomi")) ? Settings.Global.getUriFor("external_surround_sound_enabled") : null;
        this.f = uriFor != null ? new d(this, handler, applicationContext.getContentResolver(), uriFor) : null;
    }

    public final List a() {
        b3.d dVar;
        if (Build.VERSION.SDK_INT >= 32 && (dVar = this.g) != null) {
            return dVar.b();
        }
        g9.g0 g0Var = g9.i0.b;
        return s1.e;
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
        g2.s sVar = j0Var.f;
        if (sVar != null) {
            sVar.e(-1, new l2.d(22));
        }
    }

    public final void c() {
        List a10 = a();
        d2.f fVar = this.j;
        AudioDeviceInfo audioDeviceInfo = this.i;
        s1 s1Var = b.e;
        IntentFilter intentFilter = new IntentFilter("android.media.action.HDMI_AUDIO_PLUG");
        Context context = this.a;
        b(b.b(context, context.registerReceiver(null, intentFilter), fVar, audioDeviceInfo, a10));
    }
}
