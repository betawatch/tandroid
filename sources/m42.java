// default package

import java.util.ArrayList;
import java.util.Comparator;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class m42 implements Comparator {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ArrayList b;

    public /* synthetic */ m42(ArrayList arrayList, byte b) {
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
                xl6 xl6Var = (xl6) obj;
                xl6 xl6Var2 = (xl6) obj2;
                boolean z = ChatAttachAlertPhotoLayout.r1;
                if (xl6Var.a != 0) {
                    break;
                } else {
                    break;
                }
                int indexOf = arrayList.indexOf(xl6Var);
                int indexOf2 = arrayList.indexOf(xl6Var2);
                if (indexOf <= indexOf2) {
                    if (indexOf >= indexOf2) {
                        return 0;
                    }
                    return -1;
                }
                return 1;
            case 1:
                xl6 xl6Var3 = (xl6) obj;
                xl6 xl6Var4 = (xl6) obj2;
                if (xl6Var3.a != 0) {
                    break;
                } else {
                    break;
                }
                int indexOf3 = arrayList.indexOf(xl6Var3);
                int indexOf4 = arrayList.indexOf(xl6Var4);
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
                dq6 dq6Var = (dq6) obj;
                dq6 dq6Var2 = (dq6) obj2;
                int indexOf7 = arrayList.indexOf(dq6Var.a);
                int i = ConnectionsManager.DEFAULT_DATACENTER_ID;
                if (indexOf7 < 0) {
                    indexOf7 = Integer.MAX_VALUE;
                }
                int indexOf8 = arrayList.indexOf(dq6Var2.a);
                if (indexOf8 >= 0) {
                    i = indexOf8;
                }
                if (indexOf7 >= i) {
                    if (indexOf7 <= i) {
                        int length = dq6Var.b.length();
                        int length2 = dq6Var2.b.length();
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
