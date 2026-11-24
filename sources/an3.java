// default package

import java.util.HashMap;
import org.telegram.ui.Dictation.DictationAsr;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class an3 implements hn3 {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ boolean[] b;
    public final /* synthetic */ in3 c;
    public final /* synthetic */ float[] d;
    public final /* synthetic */ fn3 e;

    public /* synthetic */ an3(boolean[] zArr, in3 in3Var, t0c t0cVar, float[] fArr) {
        this.b = zArr;
        this.c = in3Var;
        this.e = t0cVar;
        this.d = fArr;
    }

    @Override // hn3
    public final void a(boolean z) {
        switch (this.a) {
            case 0:
                boolean[] zArr = this.b;
                o5b o5bVar = (o5b) this.e;
                float[] fArr = this.d;
                in3 in3Var = this.c;
                gn3[] gn3VarArr = DictationAsr.a;
                if (!zArr[0]) {
                    if (!z) {
                        o5bVar.a(null, null, true);
                        break;
                    } else {
                        new Thread(new xo1(fArr, in3Var, o5bVar, zArr, (byte) 13), "DictationAsrFile").start();
                        break;
                    }
                }
                break;
            default:
                boolean[] zArr2 = this.b;
                in3 in3Var2 = this.c;
                t0c t0cVar = (t0c) this.e;
                float[] fArr2 = this.d;
                gn3[] gn3VarArr2 = DictationAsr.a;
                if (!zArr2[0]) {
                    if (!z) {
                        gn3 gn3Var = (gn3) in3Var2.b;
                        if (gn3Var != null && gn3Var.f == 0 && !DictationAsr.y(gn3Var) && !jo3.b()) {
                            HashMap hashMap = v0c.S;
                            Integer num = t0cVar.a;
                            hashMap.remove(num);
                            v0c.R.remove(num);
                            v0c.o(t0cVar.b);
                            break;
                        } else {
                            t0cVar.a(null, null, true);
                            break;
                        }
                    } else {
                        new Thread(new zm3(fArr2, in3Var2, t0cVar, zArr2), "DictationAsrFile").start();
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ an3(boolean[] zArr, o5b o5bVar, float[] fArr, in3 in3Var) {
        this.b = zArr;
        this.e = o5bVar;
        this.d = fArr;
        this.c = in3Var;
    }
}
