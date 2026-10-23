package a4;

import ah.i1;
import ah.j1;
import ai.fe;
import android.util.Pair;
import ci.q;
import ci.r4;
import ci.w0;
import ei.ac;
import hg.g0;
import hg.y1;
import java.io.File;
import java.util.Comparator;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Stories.ProfileStoriesView;
import s4.b1;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
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
        switch (this.a) {
            case 0:
                return Integer.compare(((e) obj2).b, ((e) obj).b);
            case 1:
                return Long.compare(((TLRPC.PollAnswer) obj).shuffle_hash ^ Long.MIN_VALUE, ((TLRPC.PollAnswer) obj2).shuffle_hash ^ Long.MIN_VALUE);
            case 2:
                return (int) (j1.k((TLObject) obj) - j1.k((TLObject) obj2));
            case 3:
                i10 = ((TL_stars.SavedStarGift) obj2).date;
                i11 = ((TL_stars.SavedStarGift) obj).date;
                break;
            case 4:
                i10 = ((TL_stars.SavedStarGift) obj2).date;
                i11 = ((TL_stars.SavedStarGift) obj).date;
                break;
            case 5:
                return (int) (((fe) obj2).d - ((fe) obj).d);
            case 6:
                long j10 = ((bi.b) obj2).c;
                long j11 = ((bi.b) obj).c;
                if (j10 > j11) {
                    return 1;
                }
                return j10 < j11 ? -1 : 0;
            case 7:
                return ((File) obj2).getName().compareTo(((File) obj).getName());
            case 8:
                String name = ((File) obj).getName();
                int i12 = ca.b.f;
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
                return (int) (((r4) obj2).i - ((r4) obj).i);
            case 15:
                return (int) (((Long) obj2).longValue() - ((Long) obj).longValue());
            case 16:
                i1 i1Var = (i1) obj2;
                String str = ((i1) obj).f;
                int i14 = (str == null || !str.equals("❤")) ? 0 : -1;
                String str2 = i1Var.f;
                return i14 - ((str2 == null || !str2.equals("❤")) ? 0 : -1);
            case 17:
                return (int) (((ac) obj2).e - ((ac) obj).e);
            case 18:
                int i15 = ((g0) obj).b;
                int i16 = ((g0) obj2).b;
                if (i15 < i16) {
                    return 1;
                }
                return i15 > i16 ? -1 : 0;
            case 19:
                return Double.compare(((TLRPC.TL_topPeer) obj2).rating, ((TLRPC.TL_topPeer) obj).rating);
            case 20:
                int i17 = ((y1) obj).b;
                int i18 = ((y1) obj2).b;
                if (i17 < i18) {
                    return 1;
                }
                return i17 > i18 ? -1 : 0;
            case 21:
                return Integer.compare(((i4.d) obj).a.b, ((i4.d) obj2).a.b);
            case 22:
                return Long.compare(((i4.c) obj).b, ((i4.c) obj2).b);
            case 23:
                return ((TL_account.TL_businessWeeklyOpen) obj).start_minute - ((TL_account.TL_businessWeeklyOpen) obj2).start_minute;
            case 24:
                return ((ig.y1) obj).c - ((ig.y1) obj2).c;
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
                i10 = ((b1) obj2).a.getTop();
                i11 = ((b1) obj).a.getTop();
                break;
            default:
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
        }
        return i10 - i11;
    }
}
