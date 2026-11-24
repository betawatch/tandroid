// default package

import org.telegram.ui.Dictation.DictationAsr;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
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
