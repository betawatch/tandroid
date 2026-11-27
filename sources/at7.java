// default package

import org.telegram.messenger.voip.OpusDred;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class at7 implements Runnable {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ jn7 b;
    public final /* synthetic */ fn7[] c;

    public /* synthetic */ at7(jn7 jn7Var, fn7[] fn7VarArr) {
        this.b = jn7Var;
        this.c = fn7VarArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        fn7[] fn7VarArr = this.c;
        jn7 jn7Var = this.b;
        switch (b) {
            case 0:
                fn7 fn7Var = fn7VarArr[0];
                if (fn7Var != null) {
                    jn7Var.n(fn7Var, 1);
                    fn7VarArr[0] = null;
                    break;
                }
                break;
            default:
                OpusDred.lambda$loadDocument$12(jn7Var, fn7VarArr);
                break;
        }
    }

    public /* synthetic */ at7(fn7[] fn7VarArr, jn7 jn7Var) {
        this.c = fn7VarArr;
        this.b = jn7Var;
    }
}
