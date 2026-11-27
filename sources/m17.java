// default package

import java.util.ArrayList;
import java.util.Comparator;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class m17 implements Comparator {
    public final /* synthetic */ zh6 a;
    public final /* synthetic */ ArrayList b;

    public m17(zh6 zh6Var, ArrayList arrayList) {
        this.a = zh6Var;
        this.b = arrayList;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        TLObject tLObject = (TLObject) obj;
        TLObject tLObject2 = (TLObject) obj2;
        long j = tLObject instanceof TLRPC.User ? ((TLRPC.User) tLObject).id : -((TLRPC.Chat) tLObject).id;
        long j2 = tLObject2 instanceof TLRPC.User ? ((TLRPC.User) tLObject2).id : -((TLRPC.Chat) tLObject2).id;
        zh6 zh6Var = this.a;
        if (zh6Var.h(j) >= 0 && zh6Var.h(j2) >= 0) {
            return 0;
        }
        if (zh6Var.h(j) < 0) {
            if (zh6Var.h(j2) >= 0) {
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
