package ii;

import ai.f1;
import java.io.Serializable;
import org.telegram.messenger.a20;
import org.telegram.messenger.wr;
import org.telegram.ui.Components.x31;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes4.dex */
public final /* synthetic */ class b implements a20, wr {
    public final /* synthetic */ f a;

    @Override // org.telegram.messenger.wr
    public void a(String str) {
        f fVar = this.a;
        fVar.getMessagesController().M0(Long.valueOf(-fVar.b));
        fVar.showDialog(new ki.a(fVar.getParentActivity(), null, fVar.b, new f1(21, fVar, str)));
    }

    @Override // org.telegram.messenger.a20
    public void i(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        f.Z(this.a, (x31) obj);
    }
}
