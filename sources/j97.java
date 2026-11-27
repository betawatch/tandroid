// default package

import android.util.SparseIntArray;
import java.util.Comparator;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final /* synthetic */ class j97 implements Comparator {
    public final /* synthetic */ byte a;
    public final /* synthetic */ uc7 b;

    public /* synthetic */ j97(uc7 uc7Var, byte b) {
        this.a = b;
        this.b = uc7Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x005d, code lost:
    
        if ((r13 instanceof org.telegram.tgnet.TLRPC.TL_dialogFolder) == false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0062, code lost:
    
        if ((r13 instanceof org.telegram.tgnet.TLRPC.TL_dialogFolder) == false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00c3, code lost:
    
        if ((r13 instanceof org.telegram.tgnet.TLRPC.TL_dialogFolder) == false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00c8, code lost:
    
        if ((r13 instanceof org.telegram.tgnet.TLRPC.TL_dialogFolder) == false) goto L57;
     */
    @Override // java.util.Comparator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int compare(Object obj, Object obj2) {
        TLRPC.Dialog dialog;
        int i;
        int i2;
        byte b = this.a;
        uc7 uc7Var = this.b;
        switch (b) {
            case 0:
                TLRPC.Dialog dialog2 = (TLRPC.Dialog) obj;
                TLRPC.Dialog dialog3 = (TLRPC.Dialog) obj2;
                ac7 ac7Var = uc7Var.q4;
                int i3 = ac7Var == null ? Integer.MIN_VALUE : ac7Var.j.get(dialog2.id, TLObject.FLAG_31);
                ac7 ac7Var2 = uc7Var.q4;
                int i4 = ac7Var2 == null ? Integer.MIN_VALUE : ac7Var2.j.get(dialog3.id, TLObject.FLAG_31);
                if (!(dialog2 instanceof TLRPC.TL_dialogFolder)) {
                    break;
                } else {
                    break;
                }
                if (i3 != Integer.MIN_VALUE) {
                    if (i4 != Integer.MIN_VALUE) {
                        if (i3 <= i4) {
                            if (i3 >= i4) {
                                return 0;
                            }
                        }
                        return 1;
                    }
                    return -1;
                }
                if (i4 == Integer.MIN_VALUE) {
                    ls6 mediaDataController = uc7Var.getMediaDataController();
                    long i5 = wf3.i(dialog2, mediaDataController.T(dialog2.id, 0L));
                    long i6 = wf3.i(dialog3, mediaDataController.T(dialog3.id, 0L));
                    if (i5 >= i6) {
                        if (i5 <= i6) {
                            return 0;
                        }
                        return -1;
                    }
                }
                return 1;
            case 1:
                TLRPC.Dialog dialog4 = (TLRPC.Dialog) obj;
                TLRPC.Dialog dialog5 = (TLRPC.Dialog) obj2;
                if (!(dialog4 instanceof TLRPC.TL_dialogFolder)) {
                    break;
                } else {
                    break;
                }
                if (dialog4.pinned) {
                    if (dialog5.pinned) {
                        int i7 = dialog4.pinnedNum;
                        int i8 = dialog5.pinnedNum;
                        if (i7 >= i8) {
                            if (i7 <= i8) {
                                return 0;
                            }
                        }
                        return 1;
                    }
                    return -1;
                }
                if (!dialog5.pinned) {
                    ls6 mediaDataController2 = uc7Var.getMediaDataController();
                    long i9 = wf3.i(dialog4, mediaDataController2.T(dialog4.id, 0L));
                    long i10 = wf3.i(dialog5, mediaDataController2.T(dialog5.id, 0L));
                    if (i9 >= i10) {
                        if (i9 <= i10) {
                            return 0;
                        }
                        return -1;
                    }
                }
                return 1;
            case 2:
                zb7 zb7Var = (zb7) obj2;
                TLRPC.Dialog dialog6 = ((zb7) obj).d;
                if (dialog6 != null && (dialog = zb7Var.d) != null) {
                    return uc7Var.s4.compare(dialog6, dialog);
                }
                if (zb7Var.d != null) {
                    return 1;
                }
                return dialog6 != null ? -1 : 0;
            case 3:
                SparseIntArray sparseIntArray = uc7Var.F0;
                i = sparseIntArray.get(((sl8) obj).a, ConnectionsManager.DEFAULT_DATACENTER_ID);
                i2 = sparseIntArray.get(((sl8) obj2).a, ConnectionsManager.DEFAULT_DATACENTER_ID);
                break;
            default:
                SparseIntArray sparseIntArray2 = uc7Var.E0;
                i = sparseIntArray2.get(((sl8) obj).a, ConnectionsManager.DEFAULT_DATACENTER_ID);
                i2 = sparseIntArray2.get(((sl8) obj2).a, ConnectionsManager.DEFAULT_DATACENTER_ID);
                break;
        }
        return i - i2;
    }
}
