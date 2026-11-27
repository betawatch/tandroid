// default package

import android.view.View;
import java.io.Serializable;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class ig2 implements fd, ncc {
    public final /* synthetic */ byte a;
    public final /* synthetic */ mg2 b;

    public /* synthetic */ ig2(mg2 mg2Var, byte b) {
        this.a = b;
        this.b = mg2Var;
    }

    @Override // ncc
    public final void k(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        this.b.d0((b8c) obj, (View) obj2);
    }

    @Override // fd
    public final void w(id idVar, int i) {
        byte b = this.a;
        mg2 mg2Var = this.b;
        switch (b) {
            case 0:
                mg2Var.e0();
                break;
            case 1:
                mg2Var.finishFragment();
                break;
            default:
                mg2Var.e0();
                break;
        }
    }
}
