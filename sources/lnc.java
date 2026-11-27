// default package

import android.util.Log;
import java.util.Locale;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes3.dex */
public final /* synthetic */ class lnc implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ snc b;

    public /* synthetic */ lnc(snc sncVar, byte b) {
        this.a = b;
        this.b = sncVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        snc sncVar = this.b;
        switch (b) {
            case 0:
                if (sncVar.c == 2) {
                    if (sncVar.y != 0) {
                        StringBuilder sb = new StringBuilder("self-check ok: chunks=");
                        sb.append(sncVar.y);
                        sb.append(" in=");
                        sb.append(sncVar.w);
                        sb.append("B out=");
                        sb.append(sncVar.x);
                        sb.append("B (ratio ");
                        sb.append(sncVar.x > 0 ? String.format(Locale.US, "%.2f", Double.valueOf(sncVar.w / sncVar.x)) : "-");
                        sb.append(", expect 3.00 at 48 kHz) source=");
                        byte b2 = sncVar.F;
                        bs2.x(sb, b2 == 1 ? "MediaController" : b2 == 2 ? "AudioRecorderV2" : "none", "VoiceLive");
                        break;
                    } else {
                        Log.w("VoiceLive", "SELF-CHECK FAILED: no PCM from the recorder tap 1.5 s after lock (neither MediaController nor AudioCapture fed it)");
                        break;
                    }
                }
                break;
            case 1:
                sncVar.n("field send preview");
                break;
            case 2:
                if (sncVar.c == 2) {
                    sncVar.v();
                    break;
                }
                break;
            default:
                sncVar.u();
                zu1 zu1Var = sncVar.b.a.E3;
                if (zu1Var != null) {
                    zu1Var.presentFragment(new woa());
                    break;
                }
                break;
        }
    }
}
