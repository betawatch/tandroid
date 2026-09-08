package hg;

import java.util.ArrayList;
import java.util.Comparator;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class d1 implements Comparator {
    public final /* synthetic */ a0.i a;
    public final /* synthetic */ ArrayList b;

    public d1(a0.i iVar, ArrayList arrayList) {
        this.a = iVar;
        this.b = arrayList;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        TLObject tLObject = (TLObject) obj;
        TLObject tLObject2 = (TLObject) obj2;
        long j3 = tLObject instanceof TLRPC.User ? ((TLRPC.User) tLObject).id : -((TLRPC.Chat) tLObject).id;
        long j10 = tLObject2 instanceof TLRPC.User ? ((TLRPC.User) tLObject2).id : -((TLRPC.Chat) tLObject2).id;
        a0.i iVar = this.a;
        if (iVar.h(j3) >= 0 && iVar.h(j10) >= 0) {
            return 0;
        }
        if (iVar.h(j3) < 0) {
            if (iVar.h(j10) >= 0) {
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
