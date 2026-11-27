// default package

import org.telegram.ui.Dictation.DictationAsr;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class em3 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean[] b;
    public final /* synthetic */ s2c c;

    public /* synthetic */ em3(boolean[] zArr, s2c s2cVar, byte b) {
        this.a = b;
        this.b = zArr;
        this.c = s2cVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                boolean[] zArr = this.b;
                s2c s2cVar = this.c;
                nm3[] nm3VarArr = DictationAsr.a;
                if (!zArr[0]) {
                    s2cVar.a(null, null, true);
                    break;
                }
                break;
            default:
                boolean[] zArr2 = this.b;
                s2c s2cVar2 = this.c;
                nm3[] nm3VarArr2 = DictationAsr.a;
                if (!zArr2[0]) {
                    s2cVar2.a(null, null, true);
                    break;
                }
                break;
        }
    }
}
