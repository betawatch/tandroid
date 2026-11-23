package ai;

import hi.j7;
import java.util.HashMap;
import org.telegram.ui.Components.g21;
import org.telegram.ui.Components.i21;
import org.telegram.ui.Dictation.DictationAsr;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class h implements r {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ boolean[] b;
    public final /* synthetic */ android.support.v4.media.session.a0 c;
    public final /* synthetic */ float[] d;
    public final /* synthetic */ p e;

    public /* synthetic */ h(boolean[] zArr, android.support.v4.media.session.a0 a0Var, g21 g21Var, float[] fArr) {
        this.b = zArr;
        this.c = a0Var;
        this.e = g21Var;
        this.d = fArr;
    }

    @Override // ai.r
    public final void a(boolean z10) {
        switch (this.a) {
            case 0:
                boolean[] zArr = this.b;
                j7 j7Var = (j7) this.e;
                float[] fArr = this.d;
                android.support.v4.media.session.a0 a0Var = this.c;
                q[] qVarArr = DictationAsr.a;
                if (!zArr[0]) {
                    if (!z10) {
                        j7Var.a(null, null, true);
                        break;
                    } else {
                        new Thread(new j(fArr, a0Var, j7Var, zArr, 0), "DictationAsrFile").start();
                        break;
                    }
                }
                break;
            default:
                boolean[] zArr2 = this.b;
                android.support.v4.media.session.a0 a0Var2 = this.c;
                g21 g21Var = (g21) this.e;
                float[] fArr2 = this.d;
                q[] qVarArr2 = DictationAsr.a;
                if (!zArr2[0]) {
                    if (!z10) {
                        q qVar = (q) a0Var2.b;
                        if (qVar != null && qVar.f == 0 && !DictationAsr.A(qVar) && !h1.b()) {
                            HashMap hashMap = i21.S;
                            Integer num = g21Var.a;
                            hashMap.remove(num);
                            i21.R.remove(num);
                            i21.o(g21Var.b);
                            break;
                        } else {
                            g21Var.a(null, null, true);
                            break;
                        }
                    } else {
                        new Thread(new g(fArr2, a0Var2, g21Var, zArr2), "DictationAsrFile").start();
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ h(boolean[] zArr, j7 j7Var, float[] fArr, android.support.v4.media.session.a0 a0Var) {
        this.b = zArr;
        this.e = j7Var;
        this.d = fArr;
        this.c = a0Var;
    }
}
