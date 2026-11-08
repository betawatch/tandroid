package jg;

import java.util.ArrayList;
import java.util.Comparator;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class b1 implements Comparator {
    public final /* synthetic */ a0.h a;
    public final /* synthetic */ ArrayList b;

    public b1(a0.h hVar, ArrayList arrayList) {
        this.a = hVar;
        this.b = arrayList;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        TLObject tLObject = (TLObject) obj;
        TLObject tLObject2 = (TLObject) obj2;
        long j3 = tLObject instanceof TLRPC.User ? ((TLRPC.User) tLObject).id : -((TLRPC.Chat) tLObject).id;
        long j10 = tLObject2 instanceof TLRPC.User ? ((TLRPC.User) tLObject2).id : -((TLRPC.Chat) tLObject2).id;
        a0.h hVar = this.a;
        if (hVar.h(j3) >= 0 && hVar.h(j10) >= 0) {
            return 0;
        }
        if (hVar.h(j3) < 0) {
            if (hVar.h(j10) >= 0) {
                return 1;
            }
            Long valueOf = Long.valueOf(j3);
            ArrayList arrayList = this.b;
            int indexOf = arrayList.indexOf(valueOf);
            int indexOf2 = arrayList.indexOf(Long.valueOf(j10));
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
