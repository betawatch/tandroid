// default package

import java.util.HashMap;
import org.telegram.ui.Dictation.DictationAsr;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class im3 implements om3 {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ boolean[] b;
    public final /* synthetic */ float[] c;
    public final /* synthetic */ pm3 d;
    public final /* synthetic */ mm3 e;

    public /* synthetic */ im3(boolean[] zArr, pm3 pm3Var, s2c s2cVar, float[] fArr) {
        this.b = zArr;
        this.d = pm3Var;
        this.e = s2cVar;
        this.c = fArr;
    }

    @Override // om3
    public final void a(boolean z) {
        switch (this.a) {
            case 0:
                boolean[] zArr = this.b;
                pm3 pm3Var = this.d;
                s2c s2cVar = (s2c) this.e;
                float[] fArr = this.c;
                nm3[] nm3VarArr = DictationAsr.a;
                if (!zArr[0]) {
                    if (!z) {
                        nm3 nm3Var = (nm3) pm3Var.b;
                        if (nm3Var != null && nm3Var.f == 0 && !DictationAsr.z(nm3Var) && !qn3.b()) {
                            HashMap hashMap = u2c.S;
                            Integer num = s2cVar.a;
                            hashMap.remove(num);
                            u2c.R.remove(num);
                            u2c.o(s2cVar.b);
                            break;
                        } else {
                            s2cVar.a(null, null, true);
                            break;
                        }
                    } else {
                        new Thread(new fm3(fArr, pm3Var, s2cVar, zArr), "DictationAsrFile").start();
                        break;
                    }
                }
                break;
            default:
                boolean[] zArr2 = this.b;
                j7b j7bVar = (j7b) this.e;
                float[] fArr2 = this.c;
                pm3 pm3Var2 = this.d;
                nm3[] nm3VarArr2 = DictationAsr.a;
                if (!zArr2[0]) {
                    if (!z) {
                        j7bVar.a(null, null, true);
                        break;
                    } else {
                        new Thread(new ao1(fArr2, pm3Var2, j7bVar, zArr2, (byte) 13), "DictationAsrFile").start();
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ im3(boolean[] zArr, j7b j7bVar, float[] fArr, pm3 pm3Var) {
        this.b = zArr;
        this.e = j7bVar;
        this.c = fArr;
        this.d = pm3Var;
    }
}
