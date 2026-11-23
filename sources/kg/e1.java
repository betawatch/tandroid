package kg;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import c8.ma;
import com.google.android.gms.internal.vision.e2;
import di.v6;
import hi.d7;
import j$.time.DayOfWeek;
import j$.time.format.TextStyle;
import java.util.ArrayList;
import java.util.Calendar;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.f3;
import org.telegram.messenger.gs;
import org.telegram.messenger.hd;
import org.telegram.messenger.ls;
import org.telegram.messenger.p10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.c5;
import org.telegram.ui.ActionBar.g2;
import org.telegram.ui.Cells.j5;
import org.telegram.ui.Cells.n8;
import org.telegram.ui.Components.c51;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.lc;
import org.telegram.ui.Components.o41;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class e1 extends g2 implements gs {
    public h51 a;
    public c5 b;
    public boolean c;
    public boolean d;
    public ArrayList[] e;
    public ArrayList[] f;
    public String h;
    public String n;

    public e1() {
        super(null);
        this.e = null;
        this.f = new ArrayList[]{new ArrayList(), new ArrayList(), new ArrayList(), new ArrayList(), new ArrayList(), new ArrayList(), new ArrayList()};
    }

    public static void Z(e1 e1Var, TLRPC.TL_error tL_error, TLObject tLObject) {
        if (tL_error != null) {
            e1Var.b.b(false);
            lc.e0(tL_error);
        } else {
            if (tLObject instanceof TLRPC.TL_boolFalse) {
                if (e1Var.getParentActivity() == null) {
                    return;
                }
                e1Var.b.b(false);
                f3.o(null, 2131743634, lc.b0(e1Var), null);
                return;
            }
            if (e1Var.isFinished || e1Var.finishing) {
                return;
            }
            e1Var.finishFragment();
        }
    }

    public static void a0(e1 e1Var, ArrayList arrayList) {
        String N0 = hd.N0(2131752752, null);
        String N02 = hd.N0(2131752737, null);
        o41 o41Var = new o41(2);
        o41Var.m = N0;
        o41Var.p = N02;
        o41Var.k = R.raw.biz_clock;
        arrayList.add(o41Var);
        o41 i7 = o41.i(-1, hd.N0(2131752717, null));
        i7.L(e1Var.d);
        arrayList.add(i7);
        arrayList.add(o41.B(-100, null));
        if (!e1Var.d) {
            return;
        }
        i5.c.s(2131752752, null, arrayList);
        int i10 = 0;
        while (true) {
            ArrayList[] arrayListArr = e1Var.f;
            if (i10 >= arrayListArr.length) {
                arrayList.add(o41.B(-101, null));
                arrayList.add(o41.f(hd.N0(2131752716, null), z1.b(e1Var.currentAccount).d(e1Var.n, false), -2));
                arrayList.add(o41.B(-102, null));
                return;
            }
            if (arrayListArr[i10] == null) {
                arrayListArr[i10] = new ArrayList();
            }
            String displayName = DayOfWeek.values()[i10].getDisplayName(TextStyle.FULL, hd.E0().y);
            String str = displayName.substring(0, 1).toUpperCase() + displayName.substring(1);
            String f02 = f0(e1Var.f[i10]);
            o41 o41Var2 = new o41(5);
            o41Var2.d = i10;
            o41Var2.m = str;
            o41Var2.n = f02;
            o41Var2.L(!e1Var.f[i10].isEmpty());
            arrayList.add(o41Var2);
            i10++;
        }
    }

    public static /* synthetic */ void b0(e1 e1Var, View view, String str) {
        z1 b10 = z1.b(e1Var.currentAccount);
        e1Var.n = str;
        ((n8) view).w(b10.d(str, false), true);
        e1Var.d0(true);
    }

    public static ArrayList[] e0(ArrayList arrayList) {
        int i7;
        ArrayList[] arrayListArr = new ArrayList[7];
        for (int i10 = 0; i10 < 7; i10++) {
            arrayListArr[i10] = new ArrayList();
        }
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            TL_account.TL_businessWeeklyOpen tL_businessWeeklyOpen = (TL_account.TL_businessWeeklyOpen) arrayList.get(i11);
            int i12 = tL_businessWeeklyOpen.start_minute;
            int i13 = i12 % 1440;
            arrayListArr[(i12 / 1440) % 7].add(new d1(i13, (tL_businessWeeklyOpen.end_minute - i12) + i13));
        }
        int i14 = 0;
        while (i14 < 7) {
            int i15 = i14 * 1440;
            int i16 = i14 + 1;
            int i17 = i16 * 1440;
            int i18 = i15;
            for (int i19 = 0; i19 < arrayList.size(); i19++) {
                TL_account.TL_businessWeeklyOpen tL_businessWeeklyOpen2 = (TL_account.TL_businessWeeklyOpen) arrayList.get(i19);
                if (tL_businessWeeklyOpen2.start_minute <= i18 && (i7 = tL_businessWeeklyOpen2.end_minute) >= i18) {
                    i18 = i7 + 1;
                }
            }
            if (i18 >= i17) {
                int i20 = (i14 + 6) % 7;
                if (!arrayListArr[i20].isEmpty() && ((d1) i5.c.h(1, arrayListArr[i20])).b >= 1440) {
                    ((d1) i5.c.h(1, arrayListArr[i20])).b = 1439;
                }
                int min = Math.min((i18 - i15) - 1, 2879);
                ArrayList arrayList2 = arrayListArr[(i14 + 8) % 7];
                if (min >= 1440 && !arrayList2.isEmpty() && ((d1) arrayList2.get(0)).a < min - 1440) {
                    min = ((d1) arrayList2.get(0)).a + 1439;
                }
                arrayListArr[i14].clear();
                arrayListArr[i14].add(new d1(0, min));
            } else {
                int i21 = i16 % 7;
                if (!arrayListArr[i14].isEmpty() && !arrayListArr[i21].isEmpty()) {
                    d1 d1Var = (d1) i5.c.h(1, arrayListArr[i14]);
                    d1 d1Var2 = (d1) arrayListArr[i21].get(0);
                    int i22 = d1Var.b;
                    if (i22 > 1440 && i22 - 1439 == d1Var2.a) {
                        d1Var.b = 1439;
                        d1Var2.a = 0;
                    }
                }
            }
            i14 = i16;
        }
        return arrayListArr;
    }

    public static String f0(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return hd.N0(2131752743, null);
        }
        if (h0(arrayList)) {
            return hd.N0(2131752742, null);
        }
        String str = "";
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            d1 d1Var = (d1) arrayList.get(i7);
            if (i7 > 0) {
                str = p5.c.v(str, "\n");
            }
            StringBuilder m10 = e2.m(str);
            m10.append(d1.a(d1Var.a));
            m10.append(" - ");
            m10.append(d1.a(d1Var.b));
            str = m10.toString();
        }
        return str;
    }

    public static boolean h0(ArrayList arrayList) {
        if (arrayList == null || arrayList.isEmpty()) {
            return false;
        }
        int i7 = 0;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            d1 d1Var = (d1) arrayList.get(i10);
            if (i7 < d1Var.a) {
                return false;
            }
            i7 = d1Var.b;
        }
        return i7 == 1439 || i7 == 1440;
    }

    public static String k0(int i7, TLRPC.User user, TL_account.TL_businessWorkHours tL_businessWorkHours) {
        if (tL_businessWorkHours == null) {
            return null;
        }
        ArrayList[] e02 = e0(tL_businessWorkHours.weekly_open);
        StringBuilder sb2 = new StringBuilder();
        if (user != null) {
            sb2.append(hd.a0(null, null, 2131752747, p10.q(user)));
            sb2.append("\n");
        }
        for (int i10 = 0; i10 < 7; i10++) {
            ArrayList arrayList = e02[i10];
            String displayName = DayOfWeek.values()[i10].getDisplayName(TextStyle.FULL, hd.E0().y);
            sb2.append(displayName.substring(0, 1).toUpperCase() + displayName.substring(1));
            sb2.append(": ");
            if (h0(arrayList)) {
                sb2.append(hd.N0(2131752729, null));
            } else if (arrayList.isEmpty()) {
                sb2.append(hd.N0(2131752733, null));
            } else {
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    if (i11 > 0) {
                        sb2.append(", ");
                    }
                    d1 d1Var = (d1) arrayList.get(i11);
                    sb2.append(d1.a(d1Var.a));
                    sb2.append(" - ");
                    sb2.append(d1.a(d1Var.b));
                }
            }
            sb2.append("\n");
        }
        TLRPC.TL_timezone a10 = z1.b(i7).a(tL_businessWorkHours.timezone_id);
        if (((Calendar.getInstance().getTimeZone().getRawOffset() / 1000) - (a10 == null ? 0 : a10.utc_offset)) / 60 != 0 && a10 != null) {
            z1.b(i7);
            sb2.append(hd.a0(null, null, 2131752748, z1.e(a10, true)));
        }
        return sb2.toString();
    }

    public final void c0(int i7) {
        if ((this.f[i7].isEmpty() ? null : (d1) i5.c.h(1, this.f[i7])) == null) {
            return;
        }
        int i10 = (i7 + 6) % 7;
        d1 d1Var = this.f[i10].isEmpty() ? null : (d1) i5.c.h(1, this.f[i10]);
        if (d1Var == null || d1Var.b <= 1439) {
            return;
        }
        d1Var.b = 1439;
        if (d1Var.a >= 1439) {
            this.f[i10].remove(d1Var);
        }
        View B1 = this.a.B1(i10);
        if (B1 instanceof j5) {
            ((j5) B1).setValue(f0(this.f[i10]));
        } else {
            this.a.g3.O(true);
        }
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.simpleActionBar.setTitle(hd.N0(2131752752, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new bi.v1(this, 11));
        this.b = this.simpleActionBar.s(hd.N0(2131745750, null));
        d0(false);
        FrameLayout frameLayout = new FrameLayout(context);
        h51 h51Var = new h51(this, new d7(this, 13), new v6(this, 27), null);
        this.a = h51Var;
        h51Var.r1();
        h51 h51Var2 = this.a;
        h51Var2.g3.r = false;
        h51Var2.setSectionsDrawBackground(true);
        frameLayout.addView(this.a, ma.c(-1.0f, -1));
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

    @Override // org.telegram.messenger.gs
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        c51 c51Var;
        if (i7 == ls.E0) {
            j0();
            return;
        }
        if (i7 == ls.t3) {
            if (this.e == null) {
                this.n = z1.b(this.currentAccount).c();
            }
            h51 h51Var = this.a;
            if (h51Var == null || (c51Var = h51Var.g3) == null) {
                return;
            }
            c51Var.O(true);
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
            int i7 = 0;
            loop0: while (true) {
                ArrayList[] arrayListArr = this.e;
                if (i7 >= arrayListArr.length) {
                    break;
                }
                if (arrayListArr[i7].size() != this.f[i7].size()) {
                    return true;
                }
                for (int i10 = 0; i10 < this.f[i7].size(); i10++) {
                    d1 d1Var = (d1) this.e[i7].get(i10);
                    d1 d1Var2 = (d1) this.f[i7].get(i10);
                    if (d1Var.a != d1Var2.a || d1Var.b != d1Var2.b) {
                        break loop0;
                    }
                }
                i7++;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final ek0 getListViewForSimpleGlass() {
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
        TLRPC.UserFull d2 = getMessagesController().d2(getUserConfig().e());
        TL_account.updateBusinessWorkHours updatebusinessworkhours = new TL_account.updateBusinessWorkHours();
        ArrayList[] arrayListArr = this.f;
        ArrayList arrayList = new ArrayList();
        if (arrayListArr != null) {
            for (int i7 = 0; i7 < arrayListArr.length; i7++) {
                if (arrayListArr[i7] != null) {
                    for (int i10 = 0; i10 < arrayListArr[i7].size(); i10++) {
                        d1 d1Var = (d1) arrayListArr[i7].get(i10);
                        TL_account.TL_businessWeeklyOpen tL_businessWeeklyOpen = new TL_account.TL_businessWeeklyOpen();
                        int i11 = i7 * 1440;
                        tL_businessWeeklyOpen.start_minute = d1Var.a + i11;
                        tL_businessWeeklyOpen.end_minute = i11 + d1Var.b;
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
            if (d2 != null) {
                d2.flags2 = 1 | d2.flags2;
                d2.business_work_hours = tL_businessWorkHours;
            }
        } else if (d2 != null) {
            d2.flags2 &= -2;
            d2.business_work_hours = null;
        }
        getConnectionsManager().sendRequest(updatebusinessworkhours, new ai.g1(this, 20));
        getMessagesStorage().j2(d2, false);
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void j0() {
        c51 c51Var;
        if (this.c) {
            return;
        }
        TLRPC.UserFull d2 = getMessagesController().d2(getUserConfig().e());
        if (d2 == null) {
            getMessagesController().n3(getUserConfig().f(), true, getClassGuid());
            return;
        }
        TL_account.TL_businessWorkHours tL_businessWorkHours = d2.business_work_hours;
        boolean z10 = tL_businessWorkHours != null;
        this.d = z10;
        if (!z10) {
            String c10 = z1.b(this.currentAccount).c();
            this.n = c10;
            this.h = c10;
            this.e = null;
            this.f = new ArrayList[7];
            int i7 = 0;
            while (true) {
                ArrayList[] arrayListArr = this.f;
                if (i7 >= arrayListArr.length) {
                    break;
                }
                arrayListArr[i7] = new ArrayList();
                if (i7 >= 0 && i7 < 5) {
                    this.f[i7].add(new d1(0, 1439));
                }
                i7++;
            }
        } else {
            String str = tL_businessWorkHours.timezone_id;
            this.n = str;
            this.h = str;
            this.e = e0(tL_businessWorkHours.weekly_open);
            this.f = e0(d2.business_work_hours.weekly_open);
        }
        h51 h51Var = this.a;
        if (h51Var != null && (c51Var = h51Var.g3) != null) {
            c51Var.O(true);
        }
        d0(false);
        this.c = true;
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final boolean onFragmentCreate() {
        z1.b(this.currentAccount).g();
        this.n = z1.b(this.currentAccount).c();
        getNotificationCenter().c(this, ls.E0);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final void onFragmentDestroy() {
        getNotificationCenter().n(this, ls.E0);
        super.onFragmentDestroy();
        i0();
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final boolean useSimpleActionBar() {
        return true;
    }
}
