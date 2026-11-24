// default package

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class baa implements zk3 {
    public final /* synthetic */ taa a;

    public baa(taa taaVar) {
        this.a = taaVar;
    }

    @Override // zk3
    public final void a(vf6 vf6Var, ArrayList arrayList) {
        int i = 0;
        while (i < arrayList.size()) {
            TLObject tLObject = ((al3) arrayList.get(i)).a;
            if ((tLObject instanceof TLRPC.Chat) && !hc2.B((TLRPC.Chat) tLObject)) {
                arrayList.remove(i);
                i--;
            }
            i++;
        }
        taa taaVar = this.a;
        taaVar.z2 = arrayList;
        for (int i2 = 0; i2 < taaVar.z2.size(); i2++) {
            al3 al3Var = (al3) taaVar.z2.get(i2);
            TLObject tLObject2 = al3Var.a;
            if (tLObject2 instanceof TLRPC.User) {
                na7.q1(taaVar.a).Z3((TLRPC.User) al3Var.a, true, false);
            } else if (tLObject2 instanceof TLRPC.Chat) {
                na7.q1(taaVar.a).S3((TLRPC.Chat) al3Var.a, true);
            } else if (tLObject2 instanceof TLRPC.EncryptedChat) {
                na7.q1(taaVar.a).W3((TLRPC.EncryptedChat) al3Var.a, true);
            }
        }
        taaVar.H1.f();
    }
}
