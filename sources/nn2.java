// default package

import java.io.Serializable;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
