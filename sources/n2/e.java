package n2;

import android.content.Context;
import android.content.IntentFilter;
import android.media.AudioDeviceInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import h9.s1;
import java.util.List;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes.dex */
public final class e {
    public final Context a;
    public final ki.e b;
    public final Handler c;
    public final c d;
    public final androidx.mediarouter.app.f e;
    public final d f;
    public c3.d g;
    public b h;
    public AudioDeviceInfo i;
    public e2.e j;
    public boolean k;

    public e(Context context, ki.e eVar, e2.e eVar2, AudioDeviceInfo audioDeviceInfo) {
        Context applicationContext = context.getApplicationContext();
        this.a = applicationContext;
        this.b = eVar;
        this.j = eVar2;
        this.i = audioDeviceInfo;
        String str = h2.l0.a;
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
        c3.d dVar;
        if (Build.VERSION.SDK_INT >= 32 && (dVar = this.g) != null) {
            return dVar.b();
        }
        h9.g0 g0Var = h9.i0.b;
        return s1.e;
    }

    public final void b(b bVar) {
        if (!this.k || bVar.equals(this.h)) {
            return;
        }
        this.h = bVar;
        i0 i0Var = (i0) this.b.b;
        i0Var.f();
        b bVar2 = i0Var.h;
        if (bVar2 == null || bVar.equals(bVar2)) {
            return;
        }
        i0Var.h = bVar;
        h2.r rVar = i0Var.f;
        if (rVar != null) {
            rVar.e(-1, new a0(3));
        }
    }

    public final void c() {
        List a10 = a();
        e2.e eVar = this.j;
        AudioDeviceInfo audioDeviceInfo = this.i;
        s1 s1Var = b.e;
        IntentFilter intentFilter = new IntentFilter("android.media.action.HDMI_AUDIO_PLUG");
        Context context = this.a;
        b(b.b(context, context.registerReceiver(null, intentFilter), eVar, audioDeviceInfo, a10));
    }
}
