// default package

import java.io.Serializable;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes3.dex */
public final /* synthetic */ class nn2 implements ncc, if7 {
    public final /* synthetic */ qn2 a;

    @Override // if7
    public final void a(String str) {
        qn2 qn2Var = this.a;
        qn2Var.getMessagesController().M0(Long.valueOf(-qn2Var.b));
        qn2Var.showDialog(new kn2(qn2Var.getParentActivity(), null, qn2Var.b, new rx1(qn2Var, str, (byte) 9)));
    }

    @Override // ncc
    public final void k(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        this.a.a0((b8c) obj);
    }
}
