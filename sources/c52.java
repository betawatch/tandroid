// default package

import java.util.ArrayList;
import java.util.Comparator;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class c52 implements Comparator {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ArrayList b;

    public /* synthetic */ c52(ArrayList arrayList, byte b) {
        this.a = b;
        this.b = arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0069, code lost:
    
        if (r8.a != 0) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x006e, code lost:
    
        if (r8.a != 0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x008c, code lost:
    
        if (r8.a != 0) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0091, code lost:
    
        if (r8.a != 0) goto L44;
     */
    @Override // java.util.Comparator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int compare(Object obj, Object obj2) {
        byte b = this.a;
        ArrayList arrayList = this.b;
        switch (b) {
            case 0:
                do6 do6Var = (do6) obj;
                do6 do6Var2 = (do6) obj2;
                boolean z = ChatAttachAlertPhotoLayout.r1;
                if (do6Var.a != 0) {
                    break;
                } else {
                    break;
                }
                int indexOf = arrayList.indexOf(do6Var);
                int indexOf2 = arrayList.indexOf(do6Var2);
                if (indexOf <= indexOf2) {
                    if (indexOf >= indexOf2) {
                        return 0;
                    }
                    return -1;
                }
                return 1;
            case 1:
                do6 do6Var3 = (do6) obj;
                do6 do6Var4 = (do6) obj2;
                if (do6Var3.a != 0) {
                    break;
                } else {
                    break;
                }
                int indexOf3 = arrayList.indexOf(do6Var3);
                int indexOf4 = arrayList.indexOf(do6Var4);
                if (indexOf3 <= indexOf4) {
                    if (indexOf3 >= indexOf4) {
                        return 0;
                    }
                    return -1;
                }
                return 1;
            case 2:
                int indexOf5 = arrayList.indexOf(Long.valueOf(((TLRPC.TL_messages_stickerSet) obj).set.id));
                int indexOf6 = arrayList.indexOf(Long.valueOf(((TLRPC.TL_messages_stickerSet) obj2).set.id));
                if (indexOf5 > indexOf6) {
                    return 1;
                }
                return indexOf5 < indexOf6 ? -1 : 0;
            default:
                hs6 hs6Var = (hs6) obj;
                hs6 hs6Var2 = (hs6) obj2;
                int indexOf7 = arrayList.indexOf(hs6Var.a);
                int i = ConnectionsManager.DEFAULT_DATACENTER_ID;
                if (indexOf7 < 0) {
                    indexOf7 = Integer.MAX_VALUE;
                }
                int indexOf8 = arrayList.indexOf(hs6Var2.a);
                if (indexOf8 >= 0) {
                    i = indexOf8;
                }
                if (indexOf7 >= i) {
                    if (indexOf7 <= i) {
                        int length = hs6Var.b.length();
                        int length2 = hs6Var2.b.length();
                        if (length >= length2) {
                            if (length <= length2) {
                                return 0;
                            }
                        }
                    }
                    return 1;
                }
                return -1;
        }
    }
}
