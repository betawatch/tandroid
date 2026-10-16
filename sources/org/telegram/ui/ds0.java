package org.telegram.ui;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.io.File;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_wallet;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ds0 implements Comparator {
    public final /* synthetic */ int a;

    public /* synthetic */ ds0(int i10) {
        this.a = i10;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i10;
        int i11;
        switch (this.a) {
            case 0:
                Drawable[] drawableArr = PhotoViewer.U8;
                return ((MessageObject) obj).getId() - ((MessageObject) obj2).getId();
            case 1:
                return (int) (((View) obj).getY() - ((View) obj2).getY());
            case 2:
                int i12 = obj instanceof o11 ? ((o11) obj).g : obj instanceof MessagesController.FaqSearchResult ? ((MessagesController.FaqSearchResult) obj).num : 0;
                int i13 = obj2 instanceof o11 ? ((o11) obj2).g : obj2 instanceof MessagesController.FaqSearchResult ? ((MessagesController.FaqSearchResult) obj2).num : 0;
                if (i12 < i13) {
                    return -1;
                }
                return i12 > i13 ? 1 : 0;
            case 3:
                long j10 = UserConfig.getInstance(((Integer) obj).intValue()).loginTime;
                long j11 = UserConfig.getInstance(((Integer) obj2).intValue()).loginTime;
                if (j10 > j11) {
                    return 1;
                }
                return j10 < j11 ? -1 : 0;
            case 4:
                return Integer.compare(((org.telegram.ui.ActionBar.f6) obj).V, ((org.telegram.ui.ActionBar.f6) obj2).V);
            case 5:
                long j12 = UserConfig.getInstance(((Integer) obj).intValue()).loginTime;
                long j13 = UserConfig.getInstance(((Integer) obj2).intValue()).loginTime;
                if (j12 > j13) {
                    return 1;
                }
                return j12 < j13 ? -1 : 0;
            case 6:
                return Integer.compare(((org.telegram.ui.Wallet.g0) obj2).b, ((org.telegram.ui.Wallet.g0) obj).b);
            case 7:
                return Integer.compare(((TL_wallet.walletTransaction) obj2).date, ((TL_wallet.walletTransaction) obj).date);
            case 8:
                long j14 = UserConfig.getInstance(((Integer) obj).intValue()).loginTime;
                long j15 = UserConfig.getInstance(((Integer) obj2).intValue()).loginTime;
                if (j14 > j15) {
                    return 1;
                }
                return j14 < j15 ? -1 : 0;
            case 9:
                return (int) (((org.telegram.ui.web.j) obj2).c - ((org.telegram.ui.web.j) obj).c);
            case 10:
                return (int) (((org.telegram.ui.web.j) obj2).c - ((org.telegram.ui.web.j) obj).c);
            case 11:
                return ((p2.e) obj).a.compareTo(((p2.e) obj2).a);
            case 12:
                return (int) ((((sg.p1) obj).a * 100.0f) - (((sg.p1) obj2).a * 100.0f));
            case 13:
                return ((String) obj).compareTo((String) obj2);
            case 14:
                i10 = ((b2.x) obj2).j;
                i11 = ((b2.x) obj).j;
                break;
            case 15:
                Integer num = (Integer) obj;
                Integer num2 = (Integer) obj2;
                if (num.intValue() == -1) {
                    return num2.intValue() == -1 ? 0 : -1;
                }
                if (num2.intValue() == -1) {
                    return 1;
                }
                return num.intValue() - num2.intValue();
            case 16:
                return Integer.compare(((x2.f) ((List) obj).get(0)).f, ((x2.f) ((List) obj2).get(0)).f);
            case 17:
                List list = (List) obj;
                List list2 = (List) obj2;
                int i14 = 20;
                int i15 = 21;
                return e9.z.f(x2.m.c((x2.m) Collections.max(list, new ds0(i14)), (x2.m) Collections.max(list2, new ds0(i14)))).a(list.size(), list2.size()).b((x2.m) Collections.max(list, new ds0(i15)), (x2.m) Collections.max(list2, new ds0(i15)), new ds0(i15)).e();
            case 18:
                return ((x2.e) Collections.max((List) obj)).compareTo((x2.e) Collections.max((List) obj2));
            case 19:
                return ((x2.j) ((List) obj).get(0)).compareTo((x2.j) ((List) obj2).get(0));
            case 20:
                return x2.m.c((x2.m) obj, (x2.m) obj2);
            case 21:
                x2.m mVar = (x2.m) obj;
                x2.m mVar2 = (x2.m) obj2;
                boolean z10 = mVar.e;
                int i16 = mVar.s;
                e9.v1 a2 = (z10 && mVar.n) ? x2.n.l : x2.n.l.a();
                boolean z11 = mVar.f.F;
                e9.b0 b0Var = e9.b0.a;
                if (z11) {
                    b0Var = b0Var.b(Integer.valueOf(i16), Integer.valueOf(mVar2.s), x2.n.l.a());
                }
                e9.b0 b10 = b0Var.c(mVar.O, mVar2.O).b(Integer.valueOf(mVar.v), Integer.valueOf(mVar2.v), a2);
                if (mVar.K && mVar.M) {
                    b10 = b10.a(mVar.N, mVar2.N);
                }
                return b10.c(mVar.L, mVar2.L).b(Integer.valueOf(i16), Integer.valueOf(mVar2.s), a2).e();
            case 22:
                return Long.compare(((File) obj2).lastModified(), ((File) obj).lastModified());
            case 23:
                return ((z9.d0) ((z9.h1) obj)).a.compareTo(((z9.d0) ((z9.h1) obj2)).a);
            case 24:
                return ((y2.p) obj).a - ((y2.p) obj2).a;
            case 25:
                return Float.compare(((y2.p) obj).c, ((y2.p) obj2).c);
            case 26:
                RectF rectF = (RectF) obj;
                RectF rectF2 = (RectF) obj2;
                if (Math.abs(rectF.top - rectF2.top) > 1.0E-4f) {
                    if (rectF.top < rectF2.top) {
                        return -1;
                    }
                } else {
                    if (Math.abs(rectF.left - rectF2.left) <= 1.0E-4f) {
                        return 0;
                    }
                    if (rectF.left < rectF2.left) {
                        return -1;
                    }
                }
                return 1;
            case 27:
                i10 = ((TL_stars.SavedStarGift) obj2).date;
                i11 = ((TL_stars.SavedStarGift) obj).date;
                break;
            case 28:
                i10 = ((TL_stars.SavedStarGift) obj2).date;
                i11 = ((TL_stars.SavedStarGift) obj).date;
                break;
            default:
                return (int) (((zh.c8) obj2).d - ((zh.c8) obj).d);
        }
        return i10 - i11;
    }
}
