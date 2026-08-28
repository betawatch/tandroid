package of;

import java.util.ArrayList;
import java.util.Comparator;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class z0 implements Comparator {
    public final /* synthetic */ a0.h a;
    public final /* synthetic */ ArrayList b;

    public z0(a0.h hVar, ArrayList arrayList) {
        this.a = hVar;
        this.b = arrayList;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        TLObject tLObject = (TLObject) obj;
        TLObject tLObject2 = (TLObject) obj2;
        long j10 = tLObject instanceof TLRPC.User ? ((TLRPC.User) tLObject).id : -((TLRPC.Chat) tLObject).id;
        long j11 = tLObject2 instanceof TLRPC.User ? ((TLRPC.User) tLObject2).id : -((TLRPC.Chat) tLObject2).id;
        a0.h hVar = this.a;
        if (hVar.h(j10) >= 0 && hVar.h(j11) >= 0) {
            return 0;
        }
        if (hVar.h(j10) < 0) {
            if (hVar.h(j11) >= 0) {
                return 1;
            }
            Long valueOf = Long.valueOf(j10);
            ArrayList arrayList = this.b;
            int indexOf = arrayList.indexOf(valueOf);
            int indexOf2 = arrayList.indexOf(Long.valueOf(j11));
            if (indexOf == -1 || indexOf2 == -1) {
                if (indexOf == -1 || indexOf2 != -1) {
                    return (indexOf != -1 || indexOf2 == -1) ? 0 : 1;
                }
            } else if (indexOf >= indexOf2) {
                return indexOf == indexOf2 ? 0 : 1;
            }
        }
        return -1;
    }
}
