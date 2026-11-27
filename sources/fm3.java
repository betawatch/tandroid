// default package

import android.util.Log;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Dictation.DictationAsr;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class fm3 implements Runnable {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ float[] b;
    public final /* synthetic */ pm3 c;
    public final /* synthetic */ s2c d;
    public final /* synthetic */ boolean[] e;

    public /* synthetic */ fm3(float[] fArr, pm3 pm3Var, s2c s2cVar, boolean[] zArr) {
        this.b = fArr;
        this.c = pm3Var;
        this.d = s2cVar;
        this.e = zArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                boolean[] zArr = this.e;
                pm3 pm3Var = this.c;
                s2c s2cVar = this.d;
                float[] fArr = this.b;
                nm3[] nm3VarArr = DictationAsr.a;
                if (!zArr[0]) {
                    if (pm3Var != null) {
                        DictationAsr.k0((nm3) pm3Var.b, false, new im3(zArr, pm3Var, s2cVar, fArr));
                        break;
                    } else {
                        r47 r47Var = s2cVar.b;
                        Integer valueOf = Integer.valueOf(u2c.r(r47Var));
                        int i = r47Var.K1;
                        u2c.R.remove(valueOf);
                        u2c.S.remove(valueOf);
                        HashMap hashMap = u2c.P;
                        if (hashMap != null) {
                            hashMap.remove(valueOf);
                        }
                        if (f11.a) {
                            cc4.b("local transcription of msg_id=" + r47Var.e1() + ": unknown language, no words");
                        }
                        TLRPC.Message message = r47Var.k;
                        message.voiceTranscription = "";
                        message.voiceTranscriptionWords = null;
                        message.voiceTranscriptionLocal = true;
                        message.voiceTranscriptionFinal = true;
                        message.voiceTranscriptionOpen = true;
                        message.voiceTranscriptionId = 0L;
                        u2c.q(r47Var);
                        jn7 f = jn7.f(i);
                        Boolean bool = Boolean.TRUE;
                        f.k(jn7.A1, r47Var, null, null, bool, bool);
                        break;
                    }
                }
                break;
            default:
                float[] fArr2 = this.b;
                pm3 pm3Var2 = this.c;
                s2c s2cVar2 = this.d;
                boolean[] zArr2 = this.e;
                try {
                    DictationAsr.f0(fArr2, pm3Var2, s2cVar2, zArr2);
                    break;
                } catch (Throwable th) {
                    Log.e("Dictation", "tinyasr: transcription failed", th);
                    hl.c3(new em3(zArr2, s2cVar2, (byte) 1));
                }
        }
    }

    public /* synthetic */ fm3(boolean[] zArr, pm3 pm3Var, s2c s2cVar, float[] fArr) {
        this.e = zArr;
        this.c = pm3Var;
        this.d = s2cVar;
        this.b = fArr;
    }
}
