package ji;

import ai.v2;
import android.util.Log;
import java.util.Locale;
import org.telegram.ui.an;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes.dex */
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
                this.b.l("field send preview");
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
                        r.b.t(sb2, i7 == 1 ? "MediaController" : i7 == 2 ? "AudioRecorderV2" : "none", "VoiceLive");
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
                    mVar2.t();
                    break;
                }
                break;
            case 3:
                this.b.k();
                break;
            default:
                m mVar3 = this.b;
                mVar3.s();
                an anVar = mVar3.b.a.x3;
                if (anVar != null) {
                    anVar.presentFragment(new v2());
                    break;
                }
                break;
        }
    }
}
