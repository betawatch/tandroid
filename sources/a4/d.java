package a4;

import android.util.Pair;
import bh.x0;
import bh.y0;
import bi.ud;
import di.q;
import di.s4;
import di.w0;
import fi.xb;
import ig.h0;
import ig.y1;
import java.io.File;
import java.util.Comparator;
import jg.b2;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.camera.Size;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Stories.ProfileStoriesView;
import s4.e1;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final /* synthetic */ class d implements Comparator {
    public final /* synthetic */ int a;

    public /* synthetic */ d(int i10) {
        this.a = i10;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i10;
        int i11;
        int lambda$initCamera$0;
        switch (this.a) {
            case 0:
                return Integer.compare(((e) obj2).b, ((e) obj).b);
            case 1:
                return Long.compare(((TLRPC.PollAnswer) obj).shuffle_hash ^ Long.MIN_VALUE, ((TLRPC.PollAnswer) obj2).shuffle_hash ^ Long.MIN_VALUE);
            case 2:
                return (int) (y0.k((TLObject) obj) - y0.k((TLObject) obj2));
            case 3:
                i10 = ((TL_stars.SavedStarGift) obj2).date;
                i11 = ((TL_stars.SavedStarGift) obj).date;
                break;
            case 4:
                i10 = ((TL_stars.SavedStarGift) obj2).date;
                i11 = ((TL_stars.SavedStarGift) obj).date;
                break;
            case 5:
                return (int) (((ud) obj2).d - ((ud) obj).d);
            case 6:
                long j10 = ((ci.a) obj2).c;
                long j11 = ((ci.a) obj).c;
                if (j10 > j11) {
                    return 1;
                }
                return j10 < j11 ? -1 : 0;
            case 7:
                return ((File) obj2).getName().compareTo(((File) obj).getName());
            case 8:
                String name = ((File) obj).getName();
                int i12 = da.b.f;
                return name.substring(0, i12).compareTo(((File) obj2).getName().substring(0, i12));
            case 9:
                i10 = ((q) obj2).b;
                i11 = ((q) obj).b;
                break;
            case 10:
            case 12:
                i10 = ((w0) obj2).c;
                i11 = ((w0) obj).c;
                break;
            case 11:
                return (int) (((TL_phone.groupCallDonor) obj2).stars - ((TL_phone.groupCallDonor) obj).stars);
            case 13:
                return ((Integer) ((Pair) obj).first).intValue() - ((Integer) ((Pair) obj2).first).intValue();
            case 14:
                int i13 = ProfileStoriesView.s0;
                return (int) (((s4) obj2).i - ((s4) obj).i);
            case 15:
                return (int) (((Long) obj2).longValue() - ((Long) obj).longValue());
            case 16:
                x0 x0Var = (x0) obj2;
                String str = ((x0) obj).f;
                int i14 = (str == null || !str.equals("❤")) ? 0 : -1;
                String str2 = x0Var.f;
                return i14 - ((str2 == null || !str2.equals("❤")) ? 0 : -1);
            case 17:
                return (int) (((xb) obj2).e - ((xb) obj).e);
            case 18:
                return Integer.compare(((i4.d) obj).a.b, ((i4.d) obj2).a.b);
            case 19:
                return Long.compare(((i4.c) obj).b, ((i4.c) obj2).b);
            case 20:
                int i15 = ((h0) obj).b;
                int i16 = ((h0) obj2).b;
                if (i15 < i16) {
                    return 1;
                }
                return i15 > i16 ? -1 : 0;
            case 21:
                return Double.compare(((TLRPC.TL_topPeer) obj2).rating, ((TLRPC.TL_topPeer) obj).rating);
            case 22:
                int i17 = ((y1) obj).b;
                int i18 = ((y1) obj2).b;
                if (i17 < i18) {
                    return 1;
                }
                return i17 > i18 ? -1 : 0;
            case 23:
                return ((TL_account.TL_businessWeeklyOpen) obj).start_minute - ((TL_account.TL_businessWeeklyOpen) obj2).start_minute;
            case 24:
                return ((b2) obj).c - ((b2) obj2).c;
            case 25:
                i10 = Integer.bitCount(((Integer) obj2).intValue());
                i11 = Integer.bitCount(((Integer) obj).intValue());
                break;
            case 26:
                m2.b bVar = (m2.b) obj;
                m2.b bVar2 = (m2.b) obj2;
                int compare = Integer.compare(bVar.c, bVar2.c);
                return compare != 0 ? compare : bVar.b.compareTo(bVar2.b);
            case 27:
                i10 = ((e1) obj2).a.getTop();
                i11 = ((e1) obj).a.getTop();
                break;
            case 28:
                byte[] bArr = (byte[]) obj;
                byte[] bArr2 = (byte[]) obj2;
                if (bArr.length != bArr2.length) {
                    return bArr.length - bArr2.length;
                }
                for (int i19 = 0; i19 < bArr.length; i19++) {
                    byte b10 = bArr[i19];
                    byte b11 = bArr2[i19];
                    if (b10 != b11) {
                        return b10 - b11;
                    }
                }
                return 0;
            default:
                lambda$initCamera$0 = CameraController.lambda$initCamera$0((Size) obj, (Size) obj2);
                return lambda$initCamera$0;
        }
        return i10 - i11;
    }
}
