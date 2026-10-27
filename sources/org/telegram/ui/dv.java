package org.telegram.ui;

import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.tl.TL_wallet;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class dv implements Comparator {
    public final /* synthetic */ int a;

    public /* synthetic */ dv(int i10) {
        this.a = i10;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                long j10 = UserConfig.getInstance(((Integer) obj).intValue()).loginTime;
                long j11 = UserConfig.getInstance(((Integer) obj2).intValue()).loginTime;
                if (j10 > j11) {
                    return 1;
                }
                return j10 < j11 ? -1 : 0;
            case 1:
                int i10 = ((ContactsController.Contact) obj).imported;
                int i11 = ((ContactsController.Contact) obj2).imported;
                if (i10 > i11) {
                    return -1;
                }
                return i10 < i11 ? 1 : 0;
            case 2:
                long j12 = UserConfig.getInstance(((Integer) obj).intValue()).loginTime;
                long j13 = UserConfig.getInstance(((Integer) obj2).intValue()).loginTime;
                if (j12 > j13) {
                    return 1;
                }
                return j12 < j13 ? -1 : 0;
            case 3:
                return Integer.compare(((MessageObject) obj).getId(), ((MessageObject) obj2).getId());
            case 4:
                return Integer.compare(((View) obj).getTop(), ((View) obj2).getTop());
            case 5:
                long j14 = UserConfig.getInstance(((Integer) obj).intValue()).loginTime;
                long j15 = UserConfig.getInstance(((Integer) obj2).intValue()).loginTime;
                if (j14 > j15) {
                    return 1;
                }
                return j14 < j15 ? -1 : 0;
            case 6:
                return ((String) obj).compareTo((String) obj2);
            case 7:
                Drawable[] drawableArr = PhotoViewer.U8;
                return ((MessageObject) obj).getId() - ((MessageObject) obj2).getId();
            case 8:
                return (int) (((View) obj).getY() - ((View) obj2).getY());
            case 9:
                int i12 = obj instanceof v01 ? ((v01) obj).g : obj instanceof MessagesController.FaqSearchResult ? ((MessagesController.FaqSearchResult) obj).num : 0;
                int i13 = obj2 instanceof v01 ? ((v01) obj2).g : obj2 instanceof MessagesController.FaqSearchResult ? ((MessagesController.FaqSearchResult) obj2).num : 0;
                if (i12 < i13) {
                    return -1;
                }
                return i12 > i13 ? 1 : 0;
            case 10:
                long j16 = UserConfig.getInstance(((Integer) obj).intValue()).loginTime;
                long j17 = UserConfig.getInstance(((Integer) obj2).intValue()).loginTime;
                if (j16 > j17) {
                    return 1;
                }
                return j16 < j17 ? -1 : 0;
            case 11:
                return Integer.compare(((org.telegram.ui.ActionBar.x6) obj).V, ((org.telegram.ui.ActionBar.x6) obj2).V);
            case 12:
                long j18 = UserConfig.getInstance(((Integer) obj).intValue()).loginTime;
                long j19 = UserConfig.getInstance(((Integer) obj2).intValue()).loginTime;
                if (j18 > j19) {
                    return 1;
                }
                return j18 < j19 ? -1 : 0;
            case 13:
                return Integer.compare(((org.telegram.ui.Wallet.h0) obj2).b, ((org.telegram.ui.Wallet.h0) obj).b);
            case 14:
                return Integer.compare(((TL_wallet.walletTransaction) obj2).date, ((TL_wallet.walletTransaction) obj).date);
            case 15:
                long j20 = UserConfig.getInstance(((Integer) obj).intValue()).loginTime;
                long j21 = UserConfig.getInstance(((Integer) obj2).intValue()).loginTime;
                if (j20 > j21) {
                    return 1;
                }
                return j20 < j21 ? -1 : 0;
            case 16:
                return (int) (((org.telegram.ui.web.k) obj2).c - ((org.telegram.ui.web.k) obj).c);
            case 17:
                return (int) (((org.telegram.ui.web.k) obj2).c - ((org.telegram.ui.web.k) obj).c);
            case 18:
                return ((p2.e) obj).a.compareTo(((p2.e) obj2).a);
            case 19:
                return (int) ((((tg.p1) obj).a * 100.0f) - (((tg.p1) obj2).a * 100.0f));
            case 20:
                return ((String) obj).compareTo((String) obj2);
            case 21:
                return ((b2.x) obj2).j - ((b2.x) obj).j;
            case 22:
                Integer num = (Integer) obj;
                Integer num2 = (Integer) obj2;
                if (num.intValue() == -1) {
                    return num2.intValue() == -1 ? 0 : -1;
                }
                if (num2.intValue() == -1) {
                    return 1;
                }
                return num.intValue() - num2.intValue();
            case 23:
                return Integer.compare(((x2.g) ((List) obj).get(0)).f, ((x2.g) ((List) obj2).get(0)).f);
            case 24:
                List list = (List) obj;
                List list2 = (List) obj2;
                int i14 = 27;
                int i15 = 28;
                return f9.u.f(x2.n.c((x2.n) Collections.max(list, new dv(i14)), (x2.n) Collections.max(list2, new dv(i14)))).a(list.size(), list2.size()).b((x2.n) Collections.max(list, new dv(i15)), (x2.n) Collections.max(list2, new dv(i15)), new dv(i15)).e();
            case 25:
                return ((x2.f) Collections.max((List) obj)).compareTo((x2.f) Collections.max((List) obj2));
            case 26:
                return ((x2.k) ((List) obj).get(0)).compareTo((x2.k) ((List) obj2).get(0));
            case 27:
                return x2.n.c((x2.n) obj, (x2.n) obj2);
            case 28:
                x2.n nVar = (x2.n) obj;
                x2.n nVar2 = (x2.n) obj2;
                boolean z10 = nVar.e;
                int i16 = nVar.s;
                f9.q1 a2 = (z10 && nVar.n) ? x2.o.l : x2.o.l.a();
                boolean z11 = nVar.f.F;
                f9.w wVar = f9.w.a;
                if (z11) {
                    wVar = wVar.b(Integer.valueOf(i16), Integer.valueOf(nVar2.s), x2.o.l.a());
                }
                f9.w b10 = wVar.c(nVar.O, nVar2.O).b(Integer.valueOf(nVar.v), Integer.valueOf(nVar2.v), a2);
                if (nVar.K && nVar.M) {
                    b10 = b10.a(nVar.N, nVar2.N);
                }
                return b10.c(nVar.L, nVar2.L).b(Integer.valueOf(i16), Integer.valueOf(nVar2.s), a2).e();
            default:
                return ((y2.q) obj).a - ((y2.q) obj2).a;
        }
    }
}
