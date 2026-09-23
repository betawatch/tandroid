package org.telegram.ui;

import android.graphics.RectF;
import java.io.File;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final /* synthetic */ class cb1 implements Comparator {
    public final /* synthetic */ int a;

    public /* synthetic */ cb1(int i10) {
        this.a = i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x008b A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0089 A[RETURN, SYNTHETIC] */
    @Override // java.util.Comparator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int compare(Object obj, Object obj2) {
        int i10;
        int i11;
        switch (this.a) {
            case 0:
                return Integer.compare(((org.telegram.ui.ActionBar.g6) obj).V, ((org.telegram.ui.ActionBar.g6) obj2).V);
            case 1:
                long j3 = UserConfig.getInstance(((Integer) obj).intValue()).loginTime;
                long j10 = UserConfig.getInstance(((Integer) obj2).intValue()).loginTime;
                if (j3 > j10) {
                    return 1;
                }
                return j3 < j10 ? -1 : 0;
            case 2:
                long j11 = UserConfig.getInstance(((Integer) obj).intValue()).loginTime;
                long j12 = UserConfig.getInstance(((Integer) obj2).intValue()).loginTime;
                if (j11 > j12) {
                    return 1;
                }
                return j11 < j12 ? -1 : 0;
            case 3:
                return (int) (((org.telegram.ui.web.j) obj2).c - ((org.telegram.ui.web.j) obj).c);
            case 4:
                return (int) (((org.telegram.ui.web.j) obj2).c - ((org.telegram.ui.web.j) obj).c);
            case 5:
                return ((p2.e) obj).a.compareTo(((p2.e) obj2).a);
            case 6:
                return (int) ((((rg.n1) obj).a * 100.0f) - (((rg.n1) obj2).a * 100.0f));
            case 7:
                return ((String) obj).compareTo((String) obj2);
            case 8:
                return Long.compare(((File) obj2).lastModified(), ((File) obj).lastModified());
            case 9:
                return ((y9.d0) ((y9.h1) obj)).a.compareTo(((y9.d0) ((y9.h1) obj2)).a);
            case 10:
                i10 = ((b2.s) obj2).j;
                i11 = ((b2.s) obj).j;
                break;
            case 11:
                Integer num = (Integer) obj;
                Integer num2 = (Integer) obj2;
                if (num.intValue() == -1) {
                    return num2.intValue() == -1 ? 0 : -1;
                }
                if (num2.intValue() == -1) {
                    return 1;
                }
                return num.intValue() - num2.intValue();
            case 12:
                return Integer.compare(((x2.f) ((List) obj).get(0)).f, ((x2.f) ((List) obj2).get(0)).f);
            case 13:
                List list = (List) obj;
                List list2 = (List) obj2;
                int i12 = 17;
                return e9.x.f(x2.o.c((x2.o) Collections.max(list, new cb1(16)), (x2.o) Collections.max(list2, new cb1(16)))).a(list.size(), list2.size()).b((x2.o) Collections.max(list, new cb1(i12)), (x2.o) Collections.max(list2, new cb1(i12)), new cb1(i12)).e();
            case 14:
                return ((x2.e) Collections.max((List) obj)).compareTo((x2.e) Collections.max((List) obj2));
            case 15:
                return ((x2.l) ((List) obj).get(0)).compareTo((x2.l) ((List) obj2).get(0));
            case 16:
                return x2.o.c((x2.o) obj, (x2.o) obj2);
            case 17:
                x2.o oVar = (x2.o) obj;
                x2.o oVar2 = (x2.o) obj2;
                boolean z10 = oVar.e;
                int i13 = oVar.s;
                e9.y0 a2 = (z10 && oVar.n) ? x2.p.l : x2.p.l.a();
                boolean z11 = oVar.f.B;
                e9.z zVar = e9.z.a;
                if (z11) {
                    zVar = zVar.b(Integer.valueOf(i13), Integer.valueOf(oVar2.s), x2.p.l.a());
                }
                return zVar.b(Integer.valueOf(oVar.v), Integer.valueOf(oVar2.v), a2).b(Integer.valueOf(i13), Integer.valueOf(oVar2.s), a2).e();
            case 18:
                return ((y2.q) obj).a - ((y2.q) obj2).a;
            case 19:
                return Float.compare(((y2.q) obj).c, ((y2.q) obj2).c);
            case 20:
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
            case 21:
                i10 = ((TL_stars.SavedStarGift) obj2).date;
                i11 = ((TL_stars.SavedStarGift) obj).date;
                break;
            case 22:
                i10 = ((TL_stars.SavedStarGift) obj2).date;
                i11 = ((TL_stars.SavedStarGift) obj).date;
                break;
            case 23:
                return (int) (((yh.j8) obj2).d - ((yh.j8) obj).d);
            case 24:
                return Long.compare(((TLRPC.PollAnswer) obj).shuffle_hash ^ Long.MIN_VALUE, ((TLRPC.PollAnswer) obj2).shuffle_hash ^ Long.MIN_VALUE);
            case 25:
                return (int) (zg.q0.k((TLObject) obj) - zg.q0.k((TLObject) obj2));
            default:
                long j13 = ((zh.a) obj2).c;
                long j14 = ((zh.a) obj).c;
                if (j13 > j14) {
                    return 1;
                }
                return j13 < j14 ? -1 : 0;
        }
        return i10 - i11;
    }
}
