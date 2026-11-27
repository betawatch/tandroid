// default package

import org.telegram.ui.Dictation.DictationAsr;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
