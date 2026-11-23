package li;

import java.io.Serializable;
import ki.n2;
import org.telegram.messenger.rr;
import org.telegram.messenger.u10;
import org.telegram.ui.Components.n41;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final /* synthetic */ class b implements u10, rr {
    public final /* synthetic */ f a;

    @Override // org.telegram.messenger.rr
    public void a(String str) {
        f fVar = this.a;
        fVar.getMessagesController().O0(Long.valueOf(-fVar.b));
        fVar.showDialog(new ni.a(fVar.getParentActivity(), null, fVar.b, new n2(2, fVar, str)));
    }

    @Override // org.telegram.messenger.u10
    public void k(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        f.Z(this.a, (n41) obj);
    }
}
