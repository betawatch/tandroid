// default package

import android.util.Log;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Dictation.DictationAsr;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class ol3 implements Runnable {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ float[] b;
    public final /* synthetic */ xl3 c;
    public final /* synthetic */ syb d;
    public final /* synthetic */ boolean[] e;

    public /* synthetic */ ol3(float[] fArr, xl3 xl3Var, syb sybVar, boolean[] zArr) {
        this.b = fArr;
        this.c = xl3Var;
        this.d = sybVar;
        this.e = zArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                boolean[] zArr = this.e;
                xl3 xl3Var = this.c;
                syb sybVar = this.d;
                float[] fArr = this.b;
                vl3[] vl3VarArr = DictationAsr.a;
                if (!zArr[0]) {
                    if (xl3Var != null) {
                        DictationAsr.i0((vl3) xl3Var.b, false, new pl3(zArr, xl3Var, sybVar, fArr));
                        break;
                    } else {
                        k27 k27Var = sybVar.b;
                        Integer valueOf = Integer.valueOf(uyb.r(k27Var));
                        int i = k27Var.K1;
                        uyb.R.remove(valueOf);
                        uyb.S.remove(valueOf);
                        HashMap hashMap = uyb.P;
                        if (hashMap != null) {
                            hashMap.remove(valueOf);
                        }
                        if (w01.a) {
                            fa4.b("local transcription of msg_id=" + k27Var.e1() + ": unknown language, no words");
                        }
                        TLRPC.Message message = k27Var.k;
                        message.voiceTranscription = "";
                        message.voiceTranscriptionWords = null;
                        message.voiceTranscriptionLocal = true;
                        message.voiceTranscriptionFinal = true;
                        message.voiceTranscriptionOpen = true;
                        message.voiceTranscriptionId = 0L;
                        uyb.q(k27Var);
                        kk7 f = kk7.f(i);
                        Boolean bool = Boolean.TRUE;
                        f.k(kk7.z1, k27Var, null, null, bool, bool);
                        break;
                    }
                }
                break;
            default:
                float[] fArr2 = this.b;
                xl3 xl3Var2 = this.c;
                syb sybVar2 = this.d;
                boolean[] zArr2 = this.e;
                try {
                    DictationAsr.d0(fArr2, xl3Var2, sybVar2, zArr2);
                    break;
                } catch (Throwable th) {
                    Log.e("Dictation", "tinyasr: transcription failed", th);
                    gl.c3(new nl3(zArr2, sybVar2, (byte) 1));
                }
        }
    }

    public /* synthetic */ ol3(boolean[] zArr, xl3 xl3Var, syb sybVar, float[] fArr) {
        this.e = zArr;
        this.c = xl3Var;
        this.d = sybVar;
        this.b = fArr;
    }
}
