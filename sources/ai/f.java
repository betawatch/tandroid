package ai;

import org.telegram.ui.Components.g21;
import org.telegram.ui.Dictation.DictationAsr;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class f implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean[] b;
    public final /* synthetic */ g21 c;

    public /* synthetic */ f(boolean[] zArr, g21 g21Var, int i7) {
        this.a = i7;
        this.b = zArr;
        this.c = g21Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                boolean[] zArr = this.b;
                g21 g21Var = this.c;
                q[] qVarArr = DictationAsr.a;
                if (!zArr[0]) {
                    g21Var.a(null, null, true);
                    break;
                }
                break;
            default:
                boolean[] zArr2 = this.b;
                g21 g21Var2 = this.c;
                q[] qVarArr2 = DictationAsr.a;
                if (!zArr2[0]) {
                    g21Var2.a(null, null, true);
                    break;
                }
                break;
        }
    }
}
