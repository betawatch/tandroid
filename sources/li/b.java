package li;

import ai.v1;
import java.io.Serializable;
import org.telegram.messenger.tr;
import org.telegram.messenger.x10;
import org.telegram.ui.Components.b41;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes4.dex */
public final /* synthetic */ class b implements x10, tr {
    public final /* synthetic */ e a;

    @Override // org.telegram.messenger.tr
    public void a(String str) {
        e eVar = this.a;
        eVar.getMessagesController().M0(Long.valueOf(-eVar.b));
        eVar.showDialog(new ni.a(eVar.getParentActivity(), null, eVar.b, new v1(29, eVar, str)));
    }

    @Override // org.telegram.messenger.x10
    public void m(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        e.Z(this.a, (b41) obj);
    }
}
