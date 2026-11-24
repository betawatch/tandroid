// default package

import java.util.ArrayList;
import java.util.Comparator;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class f17 implements Comparator {
    public final /* synthetic */ vh6 a;
    public final /* synthetic */ ArrayList b;

    public f17(vh6 vh6Var, ArrayList arrayList) {
        this.a = vh6Var;
        this.b = arrayList;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        TLObject tLObject = (TLObject) obj;
        TLObject tLObject2 = (TLObject) obj2;
        long j = tLObject instanceof TLRPC.User ? ((TLRPC.User) tLObject).id : -((TLRPC.Chat) tLObject).id;
        long j2 = tLObject2 instanceof TLRPC.User ? ((TLRPC.User) tLObject2).id : -((TLRPC.Chat) tLObject2).id;
        vh6 vh6Var = this.a;
        if (vh6Var.h(j) >= 0 && vh6Var.h(j2) >= 0) {
            return 0;
        }
        if (vh6Var.h(j) < 0) {
            if (vh6Var.h(j2) >= 0) {
                return 1;
            }
            Long valueOf = Long.valueOf(j);
            ArrayList arrayList = this.b;
            int indexOf = arrayList.indexOf(valueOf);
            int indexOf2 = arrayList.indexOf(Long.valueOf(j2));
            if (indexOf == -1) {
                return indexOf2 != -1 ? 1 : 0;
            }
            if (indexOf2 != -1) {
                if (indexOf >= indexOf2) {
                    return indexOf == indexOf2 ? 0 : 1;
                }
            } else if (indexOf2 != -1) {
                return 0;
            }
        }
        return -1;
    }
}
