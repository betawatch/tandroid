// default package

import java.io.Serializable;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final /* synthetic */ class fo2 implements oac, af7 {
    public final /* synthetic */ io2 a;

    @Override // af7
    public final void a(String str) {
        io2 io2Var = this.a;
        io2Var.getMessagesController().L0(Long.valueOf(-io2Var.b));
        io2Var.showDialog(new co2(io2Var.getParentActivity(), null, io2Var.b, new qy1(io2Var, str, (byte) 9)));
    }

    @Override // oac
    public final void k(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        this.a.b0((c6c) obj);
    }
}
