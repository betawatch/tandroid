// default package

import android.content.Context;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.os.Build;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class fa3 {
    public final Context a;
    public Boolean b;

    public fa3(Context context) {
        this.a = context == null ? null : context.getApplicationContext();
    }

    public final l00 a(oz ozVar, ko4 ko4Var) {
        Boolean bool;
        boolean booleanValue;
        ko4Var.getClass();
        int i = ko4Var.P;
        ozVar.getClass();
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 29 || i == -1) {
            return l00.d;
        }
        Boolean bool2 = this.b;
        if (bool2 != null) {
            booleanValue = bool2.booleanValue();
        } else {
            Context context = this.a;
            if (context != null) {
                String parameters = j00.e(context).getParameters("offloadVariableRateSupported");
                bool = Boolean.valueOf(parameters != null && parameters.equals("offloadVariableRateSupported=1"));
                this.b = bool;
            } else {
                bool = Boolean.FALSE;
                this.b = bool;
            }
            booleanValue = bool.booleanValue();
        }
        String str = ko4Var.t;
        str.getClass();
        int c = eg7.c(str, ko4Var.l);
        if (c == 0 || i2 < gcc.s(c)) {
            return l00.d;
        }
        int i3 = ko4Var.O;
        if (i3 == -1) {
            i3 = gcc.t(ko4Var.N);
        }
        if (i3 == 0) {
            return l00.d;
        }
        try {
            AudioFormat build = new AudioFormat.Builder().setSampleRate(i).setChannelMask(i3).setEncoding(c).build();
            if (i2 >= 33) {
                int directPlaybackSupport = AudioManager.getDirectPlaybackSupport(build, ozVar.b());
                if ((directPlaybackSupport & 1) == 0) {
                    return l00.d;
                }
                r4 = (directPlaybackSupport & 3) == 3;
                k00 k00Var = new k00();
                k00Var.a = true;
                k00Var.b = r4;
                k00Var.c = booleanValue;
                return k00Var.a();
            }
            if (i2 < 31) {
                if (!AudioManager.isOffloadedPlaybackSupported(build, ozVar.b())) {
                    return l00.d;
                }
                k00 k00Var2 = new k00();
                k00Var2.a = true;
                k00Var2.c = booleanValue;
                return k00Var2.a();
            }
            int playbackOffloadSupport = AudioManager.getPlaybackOffloadSupport(build, ozVar.b());
            if (playbackOffloadSupport == 0) {
                return l00.d;
            }
            k00 k00Var3 = new k00();
            if (i2 > 32 && playbackOffloadSupport == 2) {
                r4 = true;
            }
            k00Var3.a = true;
            k00Var3.b = r4;
            k00Var3.c = booleanValue;
            return k00Var3.a();
        } catch (IllegalArgumentException unused) {
            return l00.d;
        }
    }
}
