package j9;

import android.view.MenuItem;
import hg.r0;
import java.io.File;
import java.util.Comparator;
import java.util.List;
import kh.bc;
import of.e0;
import of.t1;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.camera.Size;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.v4;
import org.telegram.ui.Cells.r1;
import org.telegram.ui.Components.f9;
import org.telegram.ui.Components.tc;
import org.telegram.ui.Components.tk0;
import org.telegram.ui.Components.xf0;
import org.telegram.ui.jr;
import org.telegram.ui.r6;
import org.telegram.ui.t6;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements Comparator {
    public final /* synthetic */ int a;

    public /* synthetic */ a(int i9) {
        this.a = i9;
    }

    /* JADX WARN: Removed duplicated region for block: B:84:0x019b A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v20, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v7, types: [boolean] */
    @Override // java.util.Comparator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int compare(Object obj, Object obj2) {
        int lambda$initCamera$0;
        int i9;
        int i10;
        int id2;
        int id3;
        switch (this.a) {
            case 0:
                String name = ((File) obj).getName();
                int i11 = b.f;
                return name.substring(0, i11).compareTo(((File) obj2).getName().substring(0, i11));
            case 1:
                r0 r0Var = (r0) obj2;
                String str = ((r0) obj).f;
                int i12 = 0;
                int i13 = (str == null || !str.equals("❤")) ? 0 : -1;
                String str2 = r0Var.f;
                if (str2 != null && str2.equals("❤")) {
                    i12 = -1;
                }
                return i13 - i12;
            case 2:
                return (int) (((bc) obj2).e - ((bc) obj).e);
            case 3:
                n4.b bVar = (n4.b) obj;
                n4.b bVar2 = (n4.b) obj2;
                int compare = Integer.compare(bVar.c, bVar2.c);
                return compare != 0 ? compare : bVar.b.compareTo(bVar2.b);
            case 4:
                byte[] bArr = (byte[]) obj;
                byte[] bArr2 = (byte[]) obj2;
                if (bArr.length != bArr2.length) {
                    return bArr.length - bArr2.length;
                }
                for (int i14 = 0; i14 < bArr.length; i14++) {
                    byte b10 = bArr[i14];
                    byte b11 = bArr2[i14];
                    if (b10 != b11) {
                        return b10 - b11;
                    }
                }
                return 0;
            case 5:
                int i15 = ((e0) obj).b;
                int i16 = ((e0) obj2).b;
                if (i15 < i16) {
                    return 1;
                }
                return i15 > i16 ? -1 : 0;
            case 6:
                return Double.compare(((TLRPC.TL_topPeer) obj2).rating, ((TLRPC.TL_topPeer) obj).rating);
            case 7:
                int i17 = ((t1) obj).b;
                int i18 = ((t1) obj2).b;
                if (i17 < i18) {
                    return 1;
                }
                return i17 > i18 ? -1 : 0;
            case 8:
                lambda$initCamera$0 = CameraController.lambda$initCamera$0((Size) obj, (Size) obj2);
                return lambda$initCamera$0;
            case 9:
                return ((MenuItem) obj).getOrder() - ((MenuItem) obj2).getOrder();
            case 10:
                List list = v4.r;
                return (list.contains(Integer.valueOf(((MenuItem) obj).getItemId())) ? 1 : 0) - (list.contains(Integer.valueOf(((MenuItem) obj2).getItemId())) ? 1 : 0);
            case 11:
                e6 e6Var = (e6) obj;
                e6 e6Var2 = (e6) obj2;
                if (e6Var.b == null && e6Var.d == null) {
                    return -1;
                }
                if (e6Var2.b == null && e6Var2.d == null) {
                    return 1;
                }
                return e6Var.a.compareTo(e6Var2.a);
            case 12:
                d6 d6Var = (d6) obj;
                d6 d6Var2 = (d6) obj2;
                if (!f6.g1(d6Var)) {
                    if (!f6.g1(d6Var2)) {
                        ?? r02 = d6Var.z;
                        ?? r12 = d6Var2.z;
                        if (r02 == r12) {
                            if (r02 != 0) {
                                int i19 = d6Var.a;
                                int i20 = d6Var2.a;
                                if (i19 <= i20) {
                                    if (i19 >= i20) {
                                        return 0;
                                    }
                                }
                            } else {
                                int i21 = d6Var.a;
                                int i22 = d6Var2.a;
                                if (i21 <= i22) {
                                    if (i21 < i22) {
                                    }
                                }
                            }
                        } else if (r02 > r12) {
                        }
                    }
                    return 1;
                }
                return -1;
            case 13:
                long j10 = ((r6) obj2).c;
                long j11 = ((r6) obj).c;
                if (j10 > j11) {
                    return 1;
                }
                return j10 < j11 ? -1 : 0;
            case 14:
                return Long.compare(((t6) obj2).g, ((t6) obj).g);
            case 15:
                r1 r1Var = (r1) obj;
                r1 r1Var2 = (r1) obj2;
                float f10 = r1Var.e;
                float f11 = r1Var2.e;
                if (f10 <= f11) {
                    if (f10 < f11 || (i9 = r1Var.d) > (i10 = r1Var2.d)) {
                        return 1;
                    }
                    if (i9 >= i10) {
                        return 0;
                    }
                }
                return -1;
            case 16:
                return ((MessageObject) obj).getId() - ((MessageObject) obj2).getId();
            case 17:
                id2 = ((MessageObject) obj2).getId();
                id3 = ((MessageObject) obj).getId();
                break;
            case 18:
                return ((Integer) obj2).compareTo((Integer) obj);
            case 19:
                id2 = ((MessageObject) obj2).getId();
                id3 = ((MessageObject) obj).getId();
                break;
            case 20:
                TLObject tLObject = (TLObject) obj;
                TLObject tLObject2 = (TLObject) obj2;
                int i02 = jr.i0(tLObject);
                int i03 = jr.i0(tLObject2);
                if (i02 > i03) {
                    return 1;
                }
                if (i02 < i03) {
                    return -1;
                }
                if ((tLObject instanceof TLRPC.ChannelParticipant) && (tLObject2 instanceof TLRPC.ChannelParticipant)) {
                    return (int) (MessageObject.getPeerId(((TLRPC.ChannelParticipant) tLObject).peer) - MessageObject.getPeerId(((TLRPC.ChannelParticipant) tLObject2).peer));
                }
                return 0;
            case 21:
                int i04 = jr.i0((TLObject) obj);
                int i05 = jr.i0((TLObject) obj2);
                if (i04 > i05) {
                    return 1;
                }
                return i04 < i05 ? -1 : 0;
            case 22:
                id2 = ((f9) obj2).b;
                id3 = ((f9) obj).b;
                break;
            case 23:
                id2 = ((f9) obj2).b;
                id3 = ((f9) obj).b;
                break;
            case 24:
                return Long.compare(((tc) obj).c, ((tc) obj2).c);
            case 25:
                Size size = (Size) obj;
                Size size2 = (Size) obj2;
                float abs = Math.abs(1.0f - (Math.min(size.mHeight, size.mWidth) / Math.max(size.mHeight, size.mWidth)));
                float abs2 = Math.abs(1.0f - (Math.min(size2.mHeight, size2.mWidth) / Math.max(size2.mHeight, size2.mWidth)));
                if (abs < abs2) {
                    return -1;
                }
                return abs > abs2 ? 1 : 0;
            case 26:
                ic.a aVar = (ic.a) obj;
                ic.a aVar2 = (ic.a) obj2;
                int compare2 = Integer.compare(aVar.b, aVar2.b);
                return compare2 != 0 ? compare2 : Integer.compare(aVar2.d, aVar.d);
            case 27:
                id2 = ((Integer) obj2).intValue();
                id3 = ((Integer) obj).intValue();
                break;
            case 28:
                float f12 = ((xf0) obj).a;
                float f13 = ((xf0) obj2).a;
                if (f12 > f13) {
                    return -1;
                }
                return f12 < f13 ? 1 : 0;
            default:
                return Float.compare(((tk0) obj).a, ((tk0) obj2).a);
        }
        return id2 - id3;
    }
}
