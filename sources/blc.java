// default package

import android.util.Log;
import java.util.Locale;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final /* synthetic */ class blc implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ glc b;

    public /* synthetic */ blc(glc glcVar, byte b) {
        this.a = b;
        this.b = glcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        glc glcVar = this.b;
        switch (b) {
            case 0:
                if (glcVar.c == 2) {
                    if (glcVar.y != 0) {
                        StringBuilder sb = new StringBuilder("self-check ok: chunks=");
                        sb.append(glcVar.y);
                        sb.append(" in=");
                        sb.append(glcVar.w);
                        sb.append("B out=");
                        sb.append(glcVar.x);
                        sb.append("B (ratio ");
                        sb.append(glcVar.x > 0 ? String.format(Locale.US, "%.2f", Double.valueOf(glcVar.w / glcVar.x)) : "-");
                        sb.append(", expect 3.00 at 48 kHz) source=");
                        byte b2 = glcVar.F;
                        ts2.w(sb, b2 == 1 ? "MediaController" : b2 == 2 ? "AudioRecorderV2" : "none", "VoiceLive");
                        break;
                    } else {
                        Log.w("VoiceLive", "SELF-CHECK FAILED: no PCM from the recorder tap 1.5 s after lock (neither MediaController nor AudioCapture fed it)");
                        break;
                    }
                }
                break;
            case 1:
                if (glcVar.c == 2) {
                    glcVar.u();
                    break;
                }
                break;
            case 2:
                glcVar.t();
                yv1 yv1Var = glcVar.b.a.F3;
                if (yv1Var != null) {
                    yv1Var.presentFragment(new ana());
                    break;
                }
                break;
            default:
                glcVar.m("field send preview");
                break;
        }
    }
}
