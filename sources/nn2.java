// default package

import java.io.Serializable;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class nn2 implements ncc, hf7 {
    public final /* synthetic */ qn2 a;

    @Override // hf7
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
