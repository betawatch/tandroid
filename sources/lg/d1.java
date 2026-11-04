package lg;

import ai.g5;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import b8.mf;
import gi.q4;
import j$.time.DayOfWeek;
import j$.time.format.TextStyle;
import java.util.ArrayList;
import java.util.Calendar;
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cs;
import org.telegram.messenger.hs;
import org.telegram.messenger.k5;
import org.telegram.messenger.l10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.b5;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.Cells.h5;
import org.telegram.ui.Cells.l8;
import org.telegram.ui.Components.f41;
import org.telegram.ui.Components.fc;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.r31;
import org.telegram.ui.Components.tj0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class d1 extends d2 implements cs {
    public l41 a;
    public b5 b;
    public boolean c;
    public boolean d;
    public ArrayList[] e;
    public ArrayList[] f;
    public String h;
    public String n;

    public d1() {
        super(null);
        this.e = null;
        this.f = new ArrayList[]{new ArrayList(), new ArrayList(), new ArrayList(), new ArrayList(), new ArrayList(), new ArrayList(), new ArrayList()};
    }

    public static void Z(d1 d1Var, TLRPC.TL_error tL_error, TLObject tLObject) {
        if (tL_error != null) {
            d1Var.b.b(false);
            fc.d0(tL_error);
        } else {
            if (tLObject instanceof TLRPC.TL_boolFalse) {
                if (d1Var.getParentActivity() == null) {
                    return;
                }
                d1Var.b.b(false);
                k5.p(null, 2131743889, fc.a0(d1Var), null);
                return;
            }
            if (d1Var.isFinished || d1Var.finishing) {
                return;
            }
            d1Var.finishFragment();
        }
    }

    public static void a0(d1 d1Var, ArrayList arrayList) {
        String M0 = bd.M0(2131752764, null);
        String M02 = bd.M0(2131752749, null);
        r31 r31Var = new r31(2);
        r31Var.l = M0;
        r31Var.o = M02;
        r31Var.k = R.raw.biz_clock;
        arrayList.add(r31Var);
        r31 i3 = r31.i(-1, bd.M0(2131752729, null));
        i3.L(d1Var.d);
        arrayList.add(i3);
        arrayList.add(r31.B(-100, null));
        if (!d1Var.d) {
            return;
        }
        arrayList.add(r31.u(bd.M0(2131752764, null)));
        int i10 = 0;
        while (true) {
            ArrayList[] arrayListArr = d1Var.f;
            if (i10 >= arrayListArr.length) {
                arrayList.add(r31.B(-101, null));
                arrayList.add(r31.f(bd.M0(2131752728, null), y1.b(d1Var.currentAccount).d(d1Var.n, false), -2));
                arrayList.add(r31.B(-102, null));
                return;
            }
            if (arrayListArr[i10] == null) {
                arrayListArr[i10] = new ArrayList();
            }
            String displayName = DayOfWeek.values()[i10].getDisplayName(TextStyle.FULL, bd.E0().y);
            String str = displayName.substring(0, 1).toUpperCase() + displayName.substring(1);
            String f02 = f0(d1Var.f[i10]);
            r31 r31Var2 = new r31(5);
            r31Var2.d = i10;
            r31Var2.l = str;
            r31Var2.m = f02;
            r31Var2.L(!d1Var.f[i10].isEmpty());
            arrayList.add(r31Var2);
            i10++;
        }
    }

    public static /* synthetic */ void b0(d1 d1Var, View view, String str) {
        y1 b10 = y1.b(d1Var.currentAccount);
        d1Var.n = str;
        ((l8) view).w(b10.d(str, false), true);
        d1Var.d0(true);
    }

    public static ArrayList[] e0(ArrayList arrayList) {
        int i3;
        ArrayList[] arrayListArr = new ArrayList[7];
        for (int i10 = 0; i10 < 7; i10++) {
            arrayListArr[i10] = new ArrayList();
        }
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            TL_account.TL_businessWeeklyOpen tL_businessWeeklyOpen = (TL_account.TL_businessWeeklyOpen) arrayList.get(i11);
            int i12 = tL_businessWeeklyOpen.start_minute;
            int i13 = i12 % 1440;
            arrayListArr[(i12 / 1440) % 7].add(new c1(i13, (tL_businessWeeklyOpen.end_minute - i12) + i13));
        }
        int i14 = 0;
        while (i14 < 7) {
            int i15 = i14 * 1440;
            int i16 = i14 + 1;
            int i17 = i16 * 1440;
            int i18 = i15;
            for (int i19 = 0; i19 < arrayList.size(); i19++) {
                TL_account.TL_businessWeeklyOpen tL_businessWeeklyOpen2 = (TL_account.TL_businessWeeklyOpen) arrayList.get(i19);
                if (tL_businessWeeklyOpen2.start_minute <= i18 && (i3 = tL_businessWeeklyOpen2.end_minute) >= i18) {
                    i18 = i3 + 1;
                }
            }
            if (i18 >= i17) {
                int i20 = (i14 + 6) % 7;
                if (!arrayListArr[i20].isEmpty() && ((c1) k2.p1.h(1, arrayListArr[i20])).b >= 1440) {
                    ((c1) k2.p1.h(1, arrayListArr[i20])).b = 1439;
                }
                int min = Math.min((i18 - i15) - 1, 2879);
                ArrayList arrayList2 = arrayListArr[(i14 + 8) % 7];
                if (min >= 1440 && !arrayList2.isEmpty() && ((c1) arrayList2.get(0)).a < min - 1440) {
                    min = ((c1) arrayList2.get(0)).a + 1439;
                }
                arrayListArr[i14].clear();
                arrayListArr[i14].add(new c1(0, min));
            } else {
                int i21 = i16 % 7;
                if (!arrayListArr[i14].isEmpty() && !arrayListArr[i21].isEmpty()) {
                    c1 c1Var = (c1) k2.p1.h(1, arrayListArr[i14]);
                    c1 c1Var2 = (c1) arrayListArr[i21].get(0);
                    int i22 = c1Var.b;
                    if (i22 > 1440 && i22 - 1439 == c1Var2.a) {
                        c1Var.b = 1439;
                        c1Var2.a = 0;
                    }
                }
            }
            i14 = i16;
        }
        return arrayListArr;
    }

    public static String f0(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return bd.M0(2131752755, null);
        }
        if (h0(arrayList)) {
            return bd.M0(2131752754, null);
        }
        String str = "";
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            c1 c1Var = (c1) arrayList.get(i3);
            if (i3 > 0) {
                str = t4.c.q(str, "\n");
            }
            StringBuilder l10 = com.google.android.recaptcha.internal.a.l(str);
            l10.append(c1.a(c1Var.a));
            l10.append(" - ");
            l10.append(c1.a(c1Var.b));
            str = l10.toString();
        }
        return str;
    }

    public static boolean h0(ArrayList arrayList) {
        if (arrayList == null || arrayList.isEmpty()) {
            return false;
        }
        int i3 = 0;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            c1 c1Var = (c1) arrayList.get(i10);
            if (i3 < c1Var.a) {
                return false;
            }
            i3 = c1Var.b;
        }
        return i3 == 1439 || i3 == 1440;
    }

    public static String k0(int i3, TLRPC.User user, TL_account.TL_businessWorkHours tL_businessWorkHours) {
        if (tL_businessWorkHours == null) {
            return null;
        }
        ArrayList[] e02 = e0(tL_businessWorkHours.weekly_open);
        StringBuilder sb2 = new StringBuilder();
        if (user != null) {
            sb2.append(bd.a0(null, null, 2131752759, l10.p(user)));
            sb2.append("\n");
        }
        for (int i10 = 0; i10 < 7; i10++) {
            ArrayList arrayList = e02[i10];
            String displayName = DayOfWeek.values()[i10].getDisplayName(TextStyle.FULL, bd.E0().y);
            sb2.append(displayName.substring(0, 1).toUpperCase() + displayName.substring(1));
            sb2.append(": ");
            if (h0(arrayList)) {
                sb2.append(bd.M0(2131752741, null));
            } else if (arrayList.isEmpty()) {
                sb2.append(bd.M0(2131752745, null));
            } else {
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    if (i11 > 0) {
                        sb2.append(", ");
                    }
                    c1 c1Var = (c1) arrayList.get(i11);
                    sb2.append(c1.a(c1Var.a));
                    sb2.append(" - ");
                    sb2.append(c1.a(c1Var.b));
                }
            }
            sb2.append("\n");
        }
        TLRPC.TL_timezone a10 = y1.b(i3).a(tL_businessWorkHours.timezone_id);
        if (((Calendar.getInstance().getTimeZone().getRawOffset() / 1000) - (a10 == null ? 0 : a10.utc_offset)) / 60 != 0 && a10 != null) {
            y1.b(i3);
            sb2.append(bd.a0(null, null, 2131752760, y1.e(a10, true)));
        }
        return sb2.toString();
    }

    public final void c0(int i3) {
        if ((this.f[i3].isEmpty() ? null : (c1) k2.p1.h(1, this.f[i3])) == null) {
            return;
        }
        int i10 = (i3 + 6) % 7;
        c1 c1Var = this.f[i10].isEmpty() ? null : (c1) k2.p1.h(1, this.f[i10]);
        if (c1Var == null || c1Var.b <= 1439) {
            return;
        }
        c1Var.b = 1439;
        if (c1Var.a >= 1439) {
            this.f[i10].remove(c1Var);
        }
        View B1 = this.a.B1(i10);
        if (B1 instanceof h5) {
            ((h5) B1).setValue(f0(this.f[i10]));
        } else {
            this.a.g3.O(true);
        }
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.simpleActionBar.setTitle(bd.M0(2131752764, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new g5(this, 17));
        this.b = this.simpleActionBar.n(bd.M0(2131745956, null));
        d0(false);
        FrameLayout frameLayout = new FrameLayout(context);
        l41 l41Var = new l41(this, new q4(this, 21), new l5.b(this, 1), null);
        this.a = l41Var;
        l41Var.r1();
        l41 l41Var2 = this.a;
        l41Var2.g3.r = false;
        l41Var2.setSectionsDrawBackground(true);
        frameLayout.addView(this.a, mf.c(-1.0f, -1));
        j0();
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    public final void d0(boolean z10) {
        if (this.b == null) {
            return;
        }
        this.b.a(g0(), z10);
    }

    @Override // org.telegram.messenger.cs
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        f41 f41Var;
        if (i3 == hs.E0) {
            j0();
            return;
        }
        if (i3 == hs.r3) {
            if (this.e == null) {
                this.n = y1.b(this.currentAccount).c();
            }
            l41 l41Var = this.a;
            if (l41Var == null || (f41Var = l41Var.g3) == null) {
                return;
            }
            f41Var.O(true);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x006c, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean g0() {
        if ((this.e != null) != this.d || !TextUtils.equals(this.h, this.n)) {
            return true;
        }
        if (this.e != null && this.d) {
            if (this.f == null) {
                return true;
            }
            int i3 = 0;
            loop0: while (true) {
                ArrayList[] arrayListArr = this.e;
                if (i3 >= arrayListArr.length) {
                    break;
                }
                if (arrayListArr[i3].size() != this.f[i3].size()) {
                    return true;
                }
                for (int i10 = 0; i10 < this.f[i3].size(); i10++) {
                    c1 c1Var = (c1) this.e[i3].get(i10);
                    c1 c1Var2 = (c1) this.f[i3].get(i10);
                    if (c1Var.a != c1Var2.a || c1Var.b != c1Var2.b) {
                        break loop0;
                    }
                }
                i3++;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final tj0 getListViewForSimpleGlass() {
        return this.a;
    }

    public final void i0() {
        if (this.b.y.f) {
            return;
        }
        if (!g0()) {
            finishFragment();
            return;
        }
        this.b.b(true);
        TLRPC.UserFull b22 = getMessagesController().b2(getUserConfig().e());
        TL_account.updateBusinessWorkHours updatebusinessworkhours = new TL_account.updateBusinessWorkHours();
        ArrayList[] arrayListArr = this.f;
        ArrayList arrayList = new ArrayList();
        if (arrayListArr != null) {
            for (int i3 = 0; i3 < arrayListArr.length; i3++) {
                if (arrayListArr[i3] != null) {
                    for (int i10 = 0; i10 < arrayListArr[i3].size(); i10++) {
                        c1 c1Var = (c1) arrayListArr[i3].get(i10);
                        TL_account.TL_businessWeeklyOpen tL_businessWeeklyOpen = new TL_account.TL_businessWeeklyOpen();
                        int i11 = i3 * 1440;
                        tL_businessWeeklyOpen.start_minute = c1Var.a + i11;
                        tL_businessWeeklyOpen.end_minute = i11 + c1Var.b;
                        arrayList.add(tL_businessWeeklyOpen);
                    }
                }
            }
        }
        if (this.d && !arrayList.isEmpty()) {
            TL_account.TL_businessWorkHours tL_businessWorkHours = new TL_account.TL_businessWorkHours();
            tL_businessWorkHours.timezone_id = this.n;
            tL_businessWorkHours.weekly_open.addAll(arrayList);
            updatebusinessworkhours.flags |= 1;
            updatebusinessworkhours.business_work_hours = tL_businessWorkHours;
            if (b22 != null) {
                b22.flags2 = 1 | b22.flags2;
                b22.business_work_hours = tL_businessWorkHours;
            }
        } else if (b22 != null) {
            b22.flags2 &= -2;
            b22.business_work_hours = null;
        }
        getConnectionsManager().sendRequest(updatebusinessworkhours, new ci.d0(this, 18));
        getMessagesStorage().j2(b22, false);
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void j0() {
        f41 f41Var;
        if (this.c) {
            return;
        }
        TLRPC.UserFull b22 = getMessagesController().b2(getUserConfig().e());
        if (b22 == null) {
            getMessagesController().g3(getUserConfig().f(), true, getClassGuid());
            return;
        }
        TL_account.TL_businessWorkHours tL_businessWorkHours = b22.business_work_hours;
        boolean z10 = tL_businessWorkHours != null;
        this.d = z10;
        if (!z10) {
            String c2 = y1.b(this.currentAccount).c();
            this.n = c2;
            this.h = c2;
            this.e = null;
            this.f = new ArrayList[7];
            int i3 = 0;
            while (true) {
                ArrayList[] arrayListArr = this.f;
                if (i3 >= arrayListArr.length) {
                    break;
                }
                arrayListArr[i3] = new ArrayList();
                if (i3 >= 0 && i3 < 5) {
                    this.f[i3].add(new c1(0, 1439));
                }
                i3++;
            }
        } else {
            String str = tL_businessWorkHours.timezone_id;
            this.n = str;
            this.h = str;
            this.e = e0(tL_businessWorkHours.weekly_open);
            this.f = e0(b22.business_work_hours.weekly_open);
        }
        l41 l41Var = this.a;
        if (l41Var != null && (f41Var = l41Var.g3) != null) {
            f41Var.O(true);
        }
        d0(false);
        this.c = true;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean onFragmentCreate() {
        y1.b(this.currentAccount).g();
        this.n = y1.b(this.currentAccount).c();
        getNotificationCenter().c(this, hs.E0);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onFragmentDestroy() {
        getNotificationCenter().n(this, hs.E0);
        super.onFragmentDestroy();
        i0();
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean useSimpleActionBar() {
        return true;
    }
}
