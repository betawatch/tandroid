package ai;

import org.telegram.ui.Components.h21;
import org.telegram.ui.Dictation.DictationAsr;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class j implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean[] b;
    public final /* synthetic */ h21 c;

    public /* synthetic */ j(boolean[] zArr, h21 h21Var, int i7) {
        this.a = i7;
        this.b = zArr;
        this.c = h21Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                boolean[] zArr = this.b;
                h21 h21Var = this.c;
                t[] tVarArr = DictationAsr.a;
                if (!zArr[0]) {
                    h21Var.a(null, null, true);
                    break;
                }
                break;
            case 1:
                boolean[] zArr2 = this.b;
                h21 h21Var2 = this.c;
                t[] tVarArr2 = DictationAsr.a;
                if (!zArr2[0]) {
                    h21Var2.a(null, null, true);
                    break;
                }
                break;
            default:
                boolean[] zArr3 = this.b;
                h21 h21Var3 = this.c;
                t[] tVarArr3 = DictationAsr.a;
                if (!zArr3[0]) {
                    h21Var3.a(null, null, true);
                    break;
                }
                break;
        }
    }
}
