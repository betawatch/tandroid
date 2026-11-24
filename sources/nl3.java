// default package

import org.telegram.ui.Dictation.DictationAsr;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class nl3 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean[] b;
    public final /* synthetic */ syb c;

    public /* synthetic */ nl3(boolean[] zArr, syb sybVar, byte b) {
        this.a = b;
        this.b = zArr;
        this.c = sybVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                boolean[] zArr = this.b;
                syb sybVar = this.c;
                vl3[] vl3VarArr = DictationAsr.a;
                if (!zArr[0]) {
                    sybVar.a(null, null, true);
                    break;
                }
                break;
            default:
                boolean[] zArr2 = this.b;
                syb sybVar2 = this.c;
                vl3[] vl3VarArr2 = DictationAsr.a;
                if (!zArr2[0]) {
                    sybVar2.a(null, null, true);
                    break;
                }
                break;
        }
    }
}
