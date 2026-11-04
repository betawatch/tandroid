package b3;

import android.content.Context;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.Spatializer;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import d2.f;
import d2.v;
import e2.h;
import g2.n0;
import g9.i0;
import g9.s1;
import j$.util.Objects;
import java.util.List;
import k2.g0;
import org.telegram.messenger.hs;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class d {
    public final Spatializer a;
    public final boolean b;
    public final Handler c;
    public final c d;

    public d(Context context, Runnable runnable, Boolean bool) {
        AudioManager e10 = context == null ? null : h.e(context);
        if (e10 == null || (bool != null && bool.booleanValue())) {
            this.a = null;
            this.b = false;
            this.c = null;
            this.d = null;
            return;
        }
        Spatializer spatializer = e10.getSpatializer();
        this.a = spatializer;
        this.b = spatializer.getImmersiveAudioLevel() != 0;
        Looper myLooper = Looper.myLooper();
        myLooper.getClass();
        Handler handler = new Handler(myLooper);
        this.c = handler;
        c cVar = new c(runnable);
        this.d = cVar;
        spatializer.addOnSpatializerStateChangedListener(new g0(handler, 1), cVar);
    }

    public final boolean a(f fVar, v vVar) {
        if (this.a == null || !this.b || !c() || !d()) {
            return false;
        }
        String str = vVar.s;
        int i3 = vVar.K;
        if (Objects.equals(str, "audio/eac3-joc")) {
            if (i3 == 16) {
                i3 = 12;
            }
        } else if (Objects.equals(str, "audio/iamf")) {
            if (i3 == -1) {
                i3 = 6;
            }
        } else if (Objects.equals(str, "audio/ac4") && (i3 == 18 || i3 == 21)) {
            i3 = 24;
        }
        int t10 = n0.t(i3);
        if (t10 == 0) {
            return false;
        }
        AudioFormat.Builder channelMask = new AudioFormat.Builder().setEncoding(2).setChannelMask(t10);
        int i10 = vVar.L;
        if (i10 != -1) {
            channelMask.setSampleRate(i10);
        }
        Spatializer spatializer = this.a;
        spatializer.getClass();
        return spatializer.canBeSpatialized(fVar.b(), channelMask.build());
    }

    public final List b() {
        if (this.a == null || !this.b || !c() || !d()) {
            g9.g0 g0Var = i0.b;
            return s1.e;
        }
        if (Build.VERSION.SDK_INT < 36) {
            return i0.u(Integer.valueOf(hs.b4));
        }
        Spatializer spatializer = this.a;
        spatializer.getClass();
        return spatializer.getSpatializedChannelMasks();
    }

    public final boolean c() {
        Spatializer spatializer = this.a;
        return spatializer != null && spatializer.isAvailable();
    }

    public final boolean d() {
        Spatializer spatializer = this.a;
        return spatializer != null && spatializer.isEnabled();
    }

    public final void e() {
        c cVar;
        Handler handler;
        Spatializer spatializer = this.a;
        if (spatializer == null || (cVar = this.d) == null || (handler = this.c) == null) {
            return;
        }
        spatializer.removeOnSpatializerStateChangedListener(cVar);
        handler.removeCallbacksAndMessages(null);
    }
}
