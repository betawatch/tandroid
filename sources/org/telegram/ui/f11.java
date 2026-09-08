package org.telegram.ui;

import android.graphics.RectF;
import java.io.File;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final /* synthetic */ class f11 implements Comparator {
    public final /* synthetic */ int a;

    public /* synthetic */ f11(int i10) {
        this.a = i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0068 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0066 A[RETURN, SYNTHETIC] */
    @Override // java.util.Comparator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int compare(Object obj, Object obj2) {
        int i10;
        int i11;
        switch (this.a) {
            case 0:
                int i12 = obj instanceof k11 ? ((k11) obj).g : obj instanceof MessagesController.FaqSearchResult ? ((MessagesController.FaqSearchResult) obj).num : 0;
                int i13 = obj2 instanceof k11 ? ((k11) obj2).g : obj2 instanceof MessagesController.FaqSearchResult ? ((MessagesController.FaqSearchResult) obj2).num : 0;
                if (i12 < i13) {
                    return -1;
                }
                return i12 > i13 ? 1 : 0;
            case 1:
                long j3 = UserConfig.getInstance(((Integer) obj).intValue()).loginTime;
                long j10 = UserConfig.getInstance(((Integer) obj2).intValue()).loginTime;
                if (j3 > j10) {
                    return 1;
                }
                return j3 < j10 ? -1 : 0;
            case 2:
                return Integer.compare(((org.telegram.ui.ActionBar.i6) obj).V, ((org.telegram.ui.ActionBar.i6) obj2).V);
            case 3:
                long j11 = UserConfig.getInstance(((Integer) obj).intValue()).loginTime;
                long j12 = UserConfig.getInstance(((Integer) obj2).intValue()).loginTime;
                if (j11 > j12) {
                    return 1;
                }
                return j11 < j12 ? -1 : 0;
            case 4:
                long j13 = UserConfig.getInstance(((Integer) obj).intValue()).loginTime;
                long j14 = UserConfig.getInstance(((Integer) obj2).intValue()).loginTime;
                if (j13 > j14) {
                    return 1;
                }
                return j13 < j14 ? -1 : 0;
            case 5:
                return (int) (((org.telegram.ui.web.k) obj2).c - ((org.telegram.ui.web.k) obj).c);
            case 6:
                return (int) (((org.telegram.ui.web.k) obj2).c - ((org.telegram.ui.web.k) obj).c);
            case 7:
                return ((p2.d) obj).a.compareTo(((p2.d) obj2).a);
            case 8:
                return (int) ((((sg.r1) obj).a * 100.0f) - (((sg.r1) obj2).a * 100.0f));
            case 9:
                return ((String) obj).compareTo((String) obj2);
            case 10:
                return Long.compare(((File) obj2).lastModified(), ((File) obj).lastModified());
            case 11:
                return ((y9.d0) ((y9.h1) obj)).a.compareTo(((y9.d0) ((y9.h1) obj2)).a);
            case 12:
                i10 = ((b2.s) obj2).j;
                i11 = ((b2.s) obj).j;
                break;
            case 13:
                Integer num = (Integer) obj;
                Integer num2 = (Integer) obj2;
                if (num.intValue() == -1) {
                    return num2.intValue() == -1 ? 0 : -1;
                }
                if (num2.intValue() == -1) {
                    return 1;
                }
                return num.intValue() - num2.intValue();
            case 14:
                return Integer.compare(((x2.f) ((List) obj).get(0)).f, ((x2.f) ((List) obj2).get(0)).f);
            case 15:
                List list = (List) obj;
                List list2 = (List) obj2;
                int i14 = 19;
                return e9.x.f(x2.o.c((x2.o) Collections.max(list, new f11(18)), (x2.o) Collections.max(list2, new f11(18)))).a(list.size(), list2.size()).b((x2.o) Collections.max(list, new f11(i14)), (x2.o) Collections.max(list2, new f11(i14)), new f11(i14)).e();
            case 16:
                return ((x2.e) Collections.max((List) obj)).compareTo((x2.e) Collections.max((List) obj2));
            case 17:
                return ((x2.l) ((List) obj).get(0)).compareTo((x2.l) ((List) obj2).get(0));
            case 18:
                return x2.o.c((x2.o) obj, (x2.o) obj2);
            case 19:
                x2.o oVar = (x2.o) obj;
                x2.o oVar2 = (x2.o) obj2;
                boolean z10 = oVar.e;
                int i15 = oVar.s;
                e9.y0 a2 = (z10 && oVar.n) ? x2.p.l : x2.p.l.a();
                boolean z11 = oVar.f.B;
                e9.z zVar = e9.z.a;
                if (z11) {
                    zVar = zVar.b(Integer.valueOf(i15), Integer.valueOf(oVar2.s), x2.p.l.a());
                }
                return zVar.b(Integer.valueOf(oVar.v), Integer.valueOf(oVar2.v), a2).b(Integer.valueOf(i15), Integer.valueOf(oVar2.s), a2).e();
            case 20:
                return ((y2.q) obj).a - ((y2.q) obj2).a;
            case 21:
                return Float.compare(((y2.q) obj).c, ((y2.q) obj2).c);
            case 22:
                RectF rectF = (RectF) obj;
                RectF rectF2 = (RectF) obj2;
                if (Math.abs(rectF.top - rectF2.top) > 1.0E-4f) {
                    return rectF.top < rectF2.top ? -1 : 1;
                }
                if (Math.abs(rectF.left - rectF2.left) <= 1.0E-4f) {
                    return 0;
                }
                if (rectF.left < rectF2.left) {
                }
            case 23:
                return Long.compare(((TLRPC.PollAnswer) obj).shuffle_hash ^ Long.MIN_VALUE, ((TLRPC.PollAnswer) obj2).shuffle_hash ^ Long.MIN_VALUE);
            case 24:
                i10 = ((TL_stars.SavedStarGift) obj2).date;
                i11 = ((TL_stars.SavedStarGift) obj).date;
                break;
            case 25:
                i10 = ((TL_stars.SavedStarGift) obj2).date;
                i11 = ((TL_stars.SavedStarGift) obj).date;
                break;
            default:
                return (int) (((zh.i8) obj2).d - ((zh.i8) obj).d);
        }
        return i10 - i11;
    }
}
