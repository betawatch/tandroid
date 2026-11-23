package ji;

import ai.a3;
import android.util.Log;
import java.util.Locale;
import org.telegram.ui.bn;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes4.dex */
public final /* synthetic */ class h implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ o b;

    public /* synthetic */ h(o oVar, int i7) {
        this.a = i7;
        this.b = oVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                o oVar = this.b;
                if (oVar.c == 2) {
                    if (oVar.y != 0) {
                        StringBuilder sb2 = new StringBuilder("self-check ok: chunks=");
                        sb2.append(oVar.y);
                        sb2.append(" in=");
                        sb2.append(oVar.w);
                        sb2.append("B out=");
                        sb2.append(oVar.x);
                        sb2.append("B (ratio ");
                        sb2.append(oVar.x > 0 ? String.format(Locale.US, "%.2f", Double.valueOf(oVar.w / oVar.x)) : "-");
                        sb2.append(", expect 3.00 at 48 kHz) source=");
                        int i7 = oVar.F;
                        p5.c.t(sb2, i7 == 1 ? "MediaController" : i7 == 2 ? "AudioRecorderV2" : "none", "VoiceLive");
                        break;
                    } else {
                        Log.w("VoiceLive", "SELF-CHECK FAILED: no PCM from the recorder tap 1.5 s after lock (neither MediaController nor AudioCapture fed it)");
                        break;
                    }
                }
                break;
            case 1:
                o oVar2 = this.b;
                if (oVar2.c == 2) {
                    oVar2.t();
                    break;
                }
                break;
            case 2:
                o oVar3 = this.b;
                oVar3.s();
                bn bnVar = oVar3.b.a.F3;
                if (bnVar != null) {
                    bnVar.presentFragment(new a3());
                    break;
                }
                break;
            default:
                this.b.m("field send preview");
                break;
        }
    }
}
