// default package

import android.content.Context;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.os.Build;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class m93 {
    public final Context a;
    public Boolean b;

    public m93(Context context) {
        this.a = context == null ? null : context.getApplicationContext();
    }

    public final k00 a(nz nzVar, fm4 fm4Var) {
        Boolean bool;
        boolean booleanValue;
        fm4Var.getClass();
        int i = fm4Var.P;
        nzVar.getClass();
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 29 || i == -1) {
            return k00.d;
        }
        Boolean bool2 = this.b;
        if (bool2 != null) {
            booleanValue = bool2.booleanValue();
        } else {
            Context context = this.a;
            if (context != null) {
                String parameters = i00.e(context).getParameters("offloadVariableRateSupported");
                bool = Boolean.valueOf(parameters != null && parameters.equals("offloadVariableRateSupported=1"));
                this.b = bool;
            } else {
                bool = Boolean.FALSE;
                this.b = bool;
            }
            booleanValue = bool.booleanValue();
        }
        String str = fm4Var.t;
        str.getClass();
        int c = ud7.c(str, fm4Var.l);
        if (c == 0 || i2 < g8c.s(c)) {
            return k00.d;
        }
        int i3 = fm4Var.O;
        if (i3 == -1) {
            i3 = g8c.t(fm4Var.N);
        }
        if (i3 == 0) {
            return k00.d;
        }
        try {
            AudioFormat build = new AudioFormat.Builder().setSampleRate(i).setChannelMask(i3).setEncoding(c).build();
            if (i2 >= 33) {
                int directPlaybackSupport = AudioManager.getDirectPlaybackSupport(build, nzVar.b());
                if ((directPlaybackSupport & 1) == 0) {
                    return k00.d;
                }
                r4 = (directPlaybackSupport & 3) == 3;
                j00 j00Var = new j00();
                j00Var.a = true;
                j00Var.b = r4;
                j00Var.c = booleanValue;
                return j00Var.a();
            }
            if (i2 < 31) {
                if (!AudioManager.isOffloadedPlaybackSupported(build, nzVar.b())) {
                    return k00.d;
                }
                j00 j00Var2 = new j00();
                j00Var2.a = true;
                j00Var2.c = booleanValue;
                return j00Var2.a();
            }
            int playbackOffloadSupport = AudioManager.getPlaybackOffloadSupport(build, nzVar.b());
            if (playbackOffloadSupport == 0) {
                return k00.d;
            }
            j00 j00Var3 = new j00();
            if (i2 > 32 && playbackOffloadSupport == 2) {
                r4 = true;
            }
            j00Var3.a = true;
            j00Var3.b = r4;
            j00Var3.c = booleanValue;
            return j00Var3.a();
        } catch (IllegalArgumentException unused) {
            return k00.d;
        }
    }
}
