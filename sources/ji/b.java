package ji;

import ai.o1;
import java.io.Serializable;
import org.telegram.messenger.or;
import org.telegram.messenger.s10;
import org.telegram.ui.Components.r31;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class b implements s10, or {
    public final /* synthetic */ e a;

    @Override // org.telegram.messenger.or
    public void a(String str) {
        e eVar = this.a;
        eVar.getMessagesController().M0(Long.valueOf(-eVar.b));
        eVar.showDialog(new li.a(eVar.getParentActivity(), null, eVar.b, new o1(25, eVar, str)));
    }

    @Override // org.telegram.messenger.s10
    public void j(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        e.Z(this.a, (r31) obj);
    }
}
