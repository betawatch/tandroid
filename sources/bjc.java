// default package

import android.util.Log;
import java.util.Locale;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes3.dex */
public final /* synthetic */ class bjc implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ gjc b;

    public /* synthetic */ bjc(gjc gjcVar, byte b) {
        this.a = b;
        this.b = gjcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        gjc gjcVar = this.b;
        switch (b) {
            case 0:
                if (gjcVar.c == 2) {
                    if (gjcVar.y != 0) {
                        StringBuilder sb = new StringBuilder("self-check ok: chunks=");
                        sb.append(gjcVar.y);
                        sb.append(" in=");
                        sb.append(gjcVar.w);
                        sb.append("B out=");
                        sb.append(gjcVar.x);
                        sb.append("B (ratio ");
                        sb.append(gjcVar.x > 0 ? String.format(Locale.US, "%.2f", Double.valueOf(gjcVar.w / gjcVar.x)) : "-");
                        sb.append(", expect 3.00 at 48 kHz) source=");
                        byte b2 = gjcVar.F;
                        ir2.x(sb, b2 == 1 ? "MediaController" : b2 == 2 ? "AudioRecorderV2" : "none", "VoiceLive");
                        break;
                    } else {
                        Log.w("VoiceLive", "SELF-CHECK FAILED: no PCM from the recorder tap 1.5 s after lock (neither MediaController nor AudioCapture fed it)");
                        break;
                    }
                }
                break;
            case 1:
                if (gjcVar.c == 2) {
                    gjcVar.u();
                    break;
                }
                break;
            case 2:
                gjcVar.t();
                mu1 mu1Var = gjcVar.b.a.F3;
                if (mu1Var != null) {
                    mu1Var.presentFragment(new zka());
                    break;
                }
                break;
            default:
                gjcVar.m("field send preview");
                break;
        }
    }
}
