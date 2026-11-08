package c3;

import android.content.Context;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.Spatializer;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import e2.e;
import e2.u;
import f2.i;
import h2.m0;
import h9.i0;
import h9.t1;
import j$.util.Objects;
import java.util.List;
import l2.g0;
import org.telegram.messenger.qs;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes.dex */
public final class d {
    public final Spatializer a;
    public final boolean b;
    public final Handler c;
    public final c d;

    public d(Context context, Runnable runnable, Boolean bool) {
        AudioManager d = context == null ? null : i.d(context);
        if (d == null || (bool != null && bool.booleanValue())) {
            this.a = null;
            this.b = false;
            this.c = null;
            this.d = null;
            return;
        }
        Spatializer spatializer = d.getSpatializer();
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

    public final boolean a(e eVar, u uVar) {
        if (this.a == null || !this.b || !c() || !d()) {
            return false;
        }
        String str = uVar.s;
        int i7 = uVar.K;
        if (Objects.equals(str, "audio/eac3-joc")) {
            if (i7 == 16) {
                i7 = 12;
            }
        } else if (Objects.equals(str, "audio/iamf")) {
            if (i7 == -1) {
                i7 = 6;
            }
        } else if (Objects.equals(str, "audio/ac4") && (i7 == 18 || i7 == 21)) {
            i7 = 24;
        }
        int t6 = m0.t(i7);
        if (t6 == 0) {
            return false;
        }
        AudioFormat.Builder channelMask = new AudioFormat.Builder().setEncoding(2).setChannelMask(t6);
        int i10 = uVar.L;
        if (i10 != -1) {
            channelMask.setSampleRate(i10);
        }
        Spatializer spatializer = this.a;
        spatializer.getClass();
        return spatializer.canBeSpatialized(eVar.b(), channelMask.build());
    }

    public final List b() {
        if (this.a == null || !this.b || !c() || !d()) {
            h9.g0 g0Var = i0.b;
            return t1.e;
        }
        if (Build.VERSION.SDK_INT < 36) {
            return i0.u(Integer.valueOf(qs.b4));
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
