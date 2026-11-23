package li;

import java.io.Serializable;
import org.telegram.messenger.sr;
import org.telegram.messenger.w10;
import org.telegram.ui.Components.o41;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes4.dex */
public final /* synthetic */ class b implements w10, sr {
    public final /* synthetic */ g a;

    @Override // org.telegram.messenger.sr
    public void a(String str) {
        g gVar = this.a;
        gVar.getMessagesController().O0(Long.valueOf(-gVar.b));
        gVar.showDialog(new ni.a(gVar.getParentActivity(), null, gVar.b, new d(1, gVar, str)));
    }

    @Override // org.telegram.messenger.w10
    public void l(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        g.Z(this.a, (o41) obj);
    }
}
