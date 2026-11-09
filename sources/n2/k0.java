package n2;

import android.content.Context;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.os.Build;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes.dex */
public final class k0 {
    public final Context a;
    public Boolean b;

    public k0(Context context) {
        this.a = context == null ? null : context.getApplicationContext();
    }

    public final f a(e2.e eVar, e2.u uVar) {
        boolean booleanValue;
        uVar.getClass();
        int i7 = uVar.L;
        eVar.getClass();
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 29 || i7 == -1) {
            return f.d;
        }
        Boolean bool = this.b;
        if (bool != null) {
            booleanValue = bool.booleanValue();
        } else {
            Context context = this.a;
            if (context != null) {
                String parameters = f2.i.d(context).getParameters("offloadVariableRateSupported");
                this.b = Boolean.valueOf(parameters != null && parameters.equals("offloadVariableRateSupported=1"));
            } else {
                this.b = Boolean.FALSE;
            }
            booleanValue = this.b.booleanValue();
        }
        String str = uVar.s;
        str.getClass();
        int c10 = e2.s0.c(str, uVar.k);
        if (c10 == 0 || i10 < h2.m0.s(c10)) {
            return f.d;
        }
        int t6 = h2.m0.t(uVar.K);
        if (t6 == 0) {
            return f.d;
        }
        try {
            AudioFormat build = new AudioFormat.Builder().setSampleRate(i7).setChannelMask(t6).setEncoding(c10).build();
            if (i10 >= 33) {
                int directPlaybackSupport = AudioManager.getDirectPlaybackSupport(build, eVar.b());
                if ((directPlaybackSupport & 1) == 0) {
                    return f.d;
                }
                r3 = (directPlaybackSupport & 3) == 3;
                ia.a aVar = new ia.a();
                aVar.a = true;
                aVar.b = r3;
                aVar.c = booleanValue;
                return aVar.a();
            }
            if (i10 < 31) {
                if (!AudioManager.isOffloadedPlaybackSupported(build, eVar.b())) {
                    return f.d;
                }
                ia.a aVar2 = new ia.a();
                aVar2.a = true;
                aVar2.c = booleanValue;
                return aVar2.a();
            }
            int playbackOffloadSupport = AudioManager.getPlaybackOffloadSupport(build, eVar.b());
            if (playbackOffloadSupport == 0) {
                return f.d;
            }
            ia.a aVar3 = new ia.a();
            if (i10 > 32 && playbackOffloadSupport == 2) {
                r3 = true;
            }
            aVar3.a = true;
            aVar3.b = r3;
            aVar3.c = booleanValue;
            return aVar3.a();
        } catch (IllegalArgumentException unused) {
            return f.d;
        }
    }
}
