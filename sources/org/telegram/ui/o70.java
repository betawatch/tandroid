package org.telegram.ui;

import android.graphics.drawable.Drawable;
import android.view.View;
import java.io.File;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.tl.TL_wallet;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final /* synthetic */ class o70 implements Comparator {
    public final /* synthetic */ int a;

    public /* synthetic */ o70(int i10) {
        this.a = i10;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                int i10 = ((ContactsController.Contact) obj).imported;
                int i11 = ((ContactsController.Contact) obj2).imported;
                if (i10 > i11) {
                    return -1;
                }
                return i10 < i11 ? 1 : 0;
            case 1:
                long j10 = UserConfig.getInstance(((Integer) obj).intValue()).loginTime;
                long j11 = UserConfig.getInstance(((Integer) obj2).intValue()).loginTime;
                if (j10 > j11) {
                    return 1;
                }
                return j10 < j11 ? -1 : 0;
            case 2:
                long j12 = UserConfig.getInstance(((Integer) obj).intValue()).loginTime;
                long j13 = UserConfig.getInstance(((Integer) obj2).intValue()).loginTime;
                if (j12 > j13) {
                    return 1;
                }
                return j12 < j13 ? -1 : 0;
            case 3:
                return ((String) obj).compareTo((String) obj2);
            case 4:
                Drawable[] drawableArr = PhotoViewer.U8;
                return ((MessageObject) obj).getId() - ((MessageObject) obj2).getId();
            case 5:
                return (int) (((View) obj).getY() - ((View) obj2).getY());
            case 6:
                int i12 = obj instanceof p01 ? ((p01) obj).g : obj instanceof MessagesController.FaqSearchResult ? ((MessagesController.FaqSearchResult) obj).num : 0;
                int i13 = obj2 instanceof p01 ? ((p01) obj2).g : obj2 instanceof MessagesController.FaqSearchResult ? ((MessagesController.FaqSearchResult) obj2).num : 0;
                if (i12 < i13) {
                    return -1;
                }
                return i12 > i13 ? 1 : 0;
            case 7:
                long j14 = UserConfig.getInstance(((Integer) obj).intValue()).loginTime;
                long j15 = UserConfig.getInstance(((Integer) obj2).intValue()).loginTime;
                if (j14 > j15) {
                    return 1;
                }
                return j14 < j15 ? -1 : 0;
            case 8:
                return Integer.compare(((org.telegram.ui.ActionBar.j6) obj).V, ((org.telegram.ui.ActionBar.j6) obj2).V);
            case 9:
                long j16 = UserConfig.getInstance(((Integer) obj).intValue()).loginTime;
                long j17 = UserConfig.getInstance(((Integer) obj2).intValue()).loginTime;
                if (j16 > j17) {
                    return 1;
                }
                return j16 < j17 ? -1 : 0;
            case 10:
                return Integer.compare(((org.telegram.ui.Wallet.h0) obj2).b, ((org.telegram.ui.Wallet.h0) obj).b);
            case 11:
                return Integer.compare(((TL_wallet.walletTransaction) obj2).date, ((TL_wallet.walletTransaction) obj).date);
            case 12:
                long j18 = UserConfig.getInstance(((Integer) obj).intValue()).loginTime;
                long j19 = UserConfig.getInstance(((Integer) obj2).intValue()).loginTime;
                if (j18 > j19) {
                    return 1;
                }
                return j18 < j19 ? -1 : 0;
            case 13:
                return (int) (((org.telegram.ui.web.k) obj2).c - ((org.telegram.ui.web.k) obj).c);
            case 14:
                return (int) (((org.telegram.ui.web.k) obj2).c - ((org.telegram.ui.web.k) obj).c);
            case 15:
                return ((p2.f) obj).a.compareTo(((p2.f) obj2).a);
            case 16:
                return (int) ((((sg.p1) obj).a * 100.0f) - (((sg.p1) obj2).a * 100.0f));
            case 17:
                return ((String) obj).compareTo((String) obj2);
            case 18:
                return ((b2.w) obj2).j - ((b2.w) obj).j;
            case 19:
                Integer num = (Integer) obj;
                Integer num2 = (Integer) obj2;
                if (num.intValue() == -1) {
                    return num2.intValue() == -1 ? 0 : -1;
                }
                if (num2.intValue() == -1) {
                    return 1;
                }
                return num.intValue() - num2.intValue();
            case 20:
                return Integer.compare(((x2.f) ((List) obj).get(0)).f, ((x2.f) ((List) obj2).get(0)).f);
            case 21:
                List list = (List) obj;
                List list2 = (List) obj2;
                int i14 = 24;
                int i15 = 25;
                return e9.z.f(x2.m.c((x2.m) Collections.max(list, new o70(i14)), (x2.m) Collections.max(list2, new o70(i14)))).a(list.size(), list2.size()).b((x2.m) Collections.max(list, new o70(i15)), (x2.m) Collections.max(list2, new o70(i15)), new o70(i15)).e();
            case 22:
                return ((x2.e) Collections.max((List) obj)).compareTo((x2.e) Collections.max((List) obj2));
            case 23:
                return ((x2.j) ((List) obj).get(0)).compareTo((x2.j) ((List) obj2).get(0));
            case 24:
                return x2.m.c((x2.m) obj, (x2.m) obj2);
            case 25:
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
            case 26:
                return Long.compare(((File) obj2).lastModified(), ((File) obj).lastModified());
            case 27:
                return ((z9.d0) ((z9.h1) obj)).a.compareTo(((z9.d0) ((z9.h1) obj2)).a);
            case 28:
                return ((y2.p) obj).a - ((y2.p) obj2).a;
            default:
                return Float.compare(((y2.p) obj).c, ((y2.p) obj2).c);
        }
    }
}
