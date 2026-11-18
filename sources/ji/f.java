package ji;

import ai.x2;
import android.util.Log;
import java.util.Locale;
import org.telegram.ui.bn;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes4.dex */
public final /* synthetic */ class f implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ m b;

    public /* synthetic */ f(m mVar, int i7) {
        this.a = i7;
        this.b = mVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.n("field send preview");
                break;
            case 1:
                m mVar = this.b;
                if (mVar.c == 2) {
                    if (mVar.y != 0) {
                        StringBuilder sb2 = new StringBuilder("self-check ok: chunks=");
                        sb2.append(mVar.y);
                        sb2.append(" in=");
                        sb2.append(mVar.w);
                        sb2.append("B out=");
                        sb2.append(mVar.x);
                        sb2.append("B (ratio ");
                        sb2.append(mVar.x > 0 ? String.format(Locale.US, "%.2f", Double.valueOf(mVar.w / mVar.x)) : "-");
                        sb2.append(", expect 3.00 at 48 kHz) source=");
                        int i7 = mVar.F;
                        p5.c.t(sb2, i7 == 1 ? "MediaController" : i7 == 2 ? "AudioRecorderV2" : "none", "VoiceLive");
                        break;
                    } else {
                        Log.w("VoiceLive", "SELF-CHECK FAILED: no PCM from the recorder tap 1.5 s after lock (neither MediaController nor AudioCapture fed it)");
                        break;
                    }
                }
                break;
            case 2:
                m mVar2 = this.b;
                if (mVar2.c == 2) {
                    mVar2.u();
                    break;
                }
                break;
            case 3:
                this.b.m();
                break;
            default:
                m mVar3 = this.b;
                mVar3.t();
                bn bnVar = mVar3.b.a.D3;
                if (bnVar != null) {
                    bnVar.presentFragment(new x2());
                    break;
                }
                break;
        }
    }
}
