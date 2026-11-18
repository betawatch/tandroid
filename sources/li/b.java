package li;

import java.io.Serializable;
import org.telegram.messenger.rr;
import org.telegram.messenger.v10;
import org.telegram.ui.Components.l41;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes4.dex */
public final /* synthetic */ class b implements v10, rr {
    public final /* synthetic */ g a;

    @Override // org.telegram.messenger.rr
    public void a(String str) {
        g gVar = this.a;
        gVar.getMessagesController().O0(Long.valueOf(-gVar.b));
        gVar.showDialog(new ni.a(gVar.getParentActivity(), null, gVar.b, new d(1, gVar, str)));
    }

    @Override // org.telegram.messenger.v10
    public void l(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        g.Z(this.a, (l41) obj);
    }
}
