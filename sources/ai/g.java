package ai;

import android.util.Log;
import java.util.HashMap;
import org.telegram.messenger.a8;
import org.telegram.messenger.fj;
import org.telegram.messenger.ks;
import org.telegram.messenger.s2;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.g21;
import org.telegram.ui.Components.i21;
import org.telegram.ui.Dictation.DictationAsr;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class g implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ float[] b;
    public final /* synthetic */ android.support.v4.media.session.a0 c;
    public final /* synthetic */ g21 d;
    public final /* synthetic */ boolean[] e;

    public /* synthetic */ g(float[] fArr, android.support.v4.media.session.a0 a0Var, g21 g21Var, boolean[] zArr) {
        this.b = fArr;
        this.c = a0Var;
        this.d = g21Var;
        this.e = zArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                boolean[] zArr = this.e;
                android.support.v4.media.session.a0 a0Var = this.c;
                g21 g21Var = this.d;
                float[] fArr = this.b;
                q[] qVarArr = DictationAsr.a;
                if (!zArr[0]) {
                    if (a0Var != null) {
                        DictationAsr.i0((q) a0Var.b, false, new h(zArr, a0Var, g21Var, fArr));
                        break;
                    } else {
                        fj fjVar = g21Var.b;
                        Integer valueOf = Integer.valueOf(i21.r(fjVar));
                        int i7 = fjVar.K1;
                        i21.R.remove(valueOf);
                        i21.S.remove(valueOf);
                        HashMap hashMap = i21.P;
                        if (hashMap != null) {
                            hashMap.remove(valueOf);
                        }
                        if (s2.a) {
                            a8.b("local transcription of msg_id=" + fjVar.e1() + ": unknown language, no words");
                        }
                        TLRPC.Message message = fjVar.k;
                        message.voiceTranscription = "";
                        message.voiceTranscriptionWords = null;
                        message.voiceTranscriptionLocal = true;
                        message.voiceTranscriptionFinal = true;
                        message.voiceTranscriptionOpen = true;
                        message.voiceTranscriptionId = 0L;
                        i21.q(fjVar);
                        ks f10 = ks.f(i7);
                        Boolean bool = Boolean.TRUE;
                        f10.k(ks.A1, fjVar, null, null, bool, bool);
                        break;
                    }
                }
                break;
            default:
                float[] fArr2 = this.b;
                android.support.v4.media.session.a0 a0Var2 = this.c;
                g21 g21Var2 = this.d;
                boolean[] zArr2 = this.e;
                try {
                    DictationAsr.e0(fArr2, a0Var2, g21Var2, zArr2);
                    break;
                } catch (Throwable th2) {
                    Log.e("Dictation", "tinyasr: transcription failed", th2);
                    org.telegram.messenger.g0.g3(new f(zArr2, g21Var2, 1));
                }
        }
    }

    public /* synthetic */ g(boolean[] zArr, android.support.v4.media.session.a0 a0Var, g21 g21Var, float[] fArr) {
        this.e = zArr;
        this.c = a0Var;
        this.d = g21Var;
        this.b = fArr;
    }
}
