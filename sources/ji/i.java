package ji;

import ai.r2;
import android.util.Log;
import java.util.Locale;
import org.telegram.ui.bn;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final /* synthetic */ class i implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ n b;

    public /* synthetic */ i(n nVar, int i7) {
        this.a = i7;
        this.b = nVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                n nVar = this.b;
                if (nVar.c == 2) {
                    if (nVar.y != 0) {
                        StringBuilder sb2 = new StringBuilder("self-check ok: chunks=");
                        sb2.append(nVar.y);
                        sb2.append(" in=");
                        sb2.append(nVar.w);
                        sb2.append("B out=");
                        sb2.append(nVar.x);
                        sb2.append("B (ratio ");
                        sb2.append(nVar.x > 0 ? String.format(Locale.US, "%.2f", Double.valueOf(nVar.w / nVar.x)) : "-");
                        sb2.append(", expect 3.00 at 48 kHz) source=");
                        int i7 = nVar.F;
                        p5.c.t(sb2, i7 == 1 ? "MediaController" : i7 == 2 ? "AudioRecorderV2" : "none", "VoiceLive");
                        break;
                    } else {
                        Log.w("VoiceLive", "SELF-CHECK FAILED: no PCM from the recorder tap 1.5 s after lock (neither MediaController nor AudioCapture fed it)");
                        break;
                    }
                }
                break;
            case 1:
                n nVar2 = this.b;
                if (nVar2.c == 2) {
                    nVar2.s();
                    break;
                }
                break;
            case 2:
                n nVar3 = this.b;
                nVar3.q();
                bn bnVar = nVar3.b.a.F3;
                if (bnVar != null) {
                    bnVar.presentFragment(new r2());
                    break;
                }
                break;
            default:
                this.b.k("field send preview");
                break;
        }
    }
}
