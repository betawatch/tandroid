package kg;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import c8.ma;
import com.google.android.gms.internal.vision.e2;
import di.c7;
import hi.e7;
import j$.time.DayOfWeek;
import j$.time.format.TextStyle;
import java.util.ArrayList;
import java.util.Calendar;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.f3;
import org.telegram.messenger.fs;
import org.telegram.messenger.gd;
import org.telegram.messenger.ks;
import org.telegram.messenger.o10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.d5;
import org.telegram.ui.ActionBar.h2;
import org.telegram.ui.Cells.j5;
import org.telegram.ui.Cells.n8;
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Components.e51;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.lc;
import org.telegram.ui.Components.z41;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class f1 extends h2 implements fs {
    public e51 a;
    public d5 b;
    public boolean c;
    public boolean d;
    public ArrayList[] e;
    public ArrayList[] f;
    public String h;
    public String n;

    public f1() {
        super(null);
        this.e = null;
        this.f = new ArrayList[]{new ArrayList(), new ArrayList(), new ArrayList(), new ArrayList(), new ArrayList(), new ArrayList(), new ArrayList()};
    }

    public static void Z(f1 f1Var, TLRPC.TL_error tL_error, TLObject tLObject) {
        if (tL_error != null) {
            f1Var.b.b(false);
            lc.e0(tL_error);
        } else {
            if (tLObject instanceof TLRPC.TL_boolFalse) {
                if (f1Var.getParentActivity() == null) {
                    return;
                }
                f1Var.b.b(false);
                f3.o(null, 2131743642, lc.b0(f1Var), null);
                return;
            }
            if (f1Var.isFinished || f1Var.finishing) {
                return;
            }
            f1Var.finishFragment();
        }
    }

    public static void a0(f1 f1Var, ArrayList arrayList) {
        String M0 = gd.M0(2131752753, null);
        String M02 = gd.M0(2131752738, null);
        l41 l41Var = new l41(2);
        l41Var.m = M0;
        l41Var.p = M02;
        l41Var.k = R.raw.biz_clock;
        arrayList.add(l41Var);
        l41 i7 = l41.i(-1, gd.M0(2131752718, null));
        i7.L(f1Var.d);
        arrayList.add(i7);
        arrayList.add(l41.B(-100, null));
        if (!f1Var.d) {
            return;
        }
        i5.c.s(2131752753, null, arrayList);
        int i10 = 0;
        while (true) {
            ArrayList[] arrayListArr = f1Var.f;
            if (i10 >= arrayListArr.length) {
                arrayList.add(l41.B(-101, null));
                arrayList.add(l41.f(gd.M0(2131752717, null), z1.b(f1Var.currentAccount).d(f1Var.n, false), -2));
                arrayList.add(l41.B(-102, null));
                return;
            }
            if (arrayListArr[i10] == null) {
                arrayListArr[i10] = new ArrayList();
            }
            String displayName = DayOfWeek.values()[i10].getDisplayName(TextStyle.FULL, gd.E0().y);
            String str = displayName.substring(0, 1).toUpperCase() + displayName.substring(1);
            String f02 = f0(f1Var.f[i10]);
            l41 l41Var2 = new l41(5);
            l41Var2.d = i10;
            l41Var2.m = str;
            l41Var2.n = f02;
            l41Var2.L(!f1Var.f[i10].isEmpty());
            arrayList.add(l41Var2);
            i10++;
        }
    }

    public static /* synthetic */ void b0(f1 f1Var, View view, String str) {
        z1 b10 = z1.b(f1Var.currentAccount);
        f1Var.n = str;
        ((n8) view).w(b10.d(str, false), true);
        f1Var.d0(true);
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
            arrayListArr[(i12 / 1440) % 7].add(new e1(i13, (tL_businessWeeklyOpen.end_minute - i12) + i13));
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
                if (!arrayListArr[i20].isEmpty() && ((e1) i5.c.h(1, arrayListArr[i20])).b >= 1440) {
                    ((e1) i5.c.h(1, arrayListArr[i20])).b = 1439;
                }
                int min = Math.min((i18 - i15) - 1, 2879);
                ArrayList arrayList2 = arrayListArr[(i14 + 8) % 7];
                if (min >= 1440 && !arrayList2.isEmpty() && ((e1) arrayList2.get(0)).a < min - 1440) {
                    min = ((e1) arrayList2.get(0)).a + 1439;
                }
                arrayListArr[i14].clear();
                arrayListArr[i14].add(new e1(0, min));
            } else {
                int i21 = i16 % 7;
                if (!arrayListArr[i14].isEmpty() && !arrayListArr[i21].isEmpty()) {
                    e1 e1Var = (e1) i5.c.h(1, arrayListArr[i14]);
                    e1 e1Var2 = (e1) arrayListArr[i21].get(0);
                    int i22 = e1Var.b;
                    if (i22 > 1440 && i22 - 1439 == e1Var2.a) {
                        e1Var.b = 1439;
                        e1Var2.a = 0;
                    }
                }
            }
            i14 = i16;
        }
        return arrayListArr;
    }

    public static String f0(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return gd.M0(2131752744, null);
        }
        if (h0(arrayList)) {
            return gd.M0(2131752743, null);
        }
        String str = "";
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            e1 e1Var = (e1) arrayList.get(i7);
            if (i7 > 0) {
                str = p5.c.v(str, "\n");
            }
            StringBuilder m10 = e2.m(str);
            m10.append(e1.a(e1Var.a));
            m10.append(" - ");
            m10.append(e1.a(e1Var.b));
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
            e1 e1Var = (e1) arrayList.get(i10);
            if (i7 < e1Var.a) {
                return false;
            }
            i7 = e1Var.b;
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
            sb2.append(gd.a0(null, null, 2131752748, o10.q(user)));
            sb2.append("\n");
        }
        for (int i10 = 0; i10 < 7; i10++) {
            ArrayList arrayList = e02[i10];
            String displayName = DayOfWeek.values()[i10].getDisplayName(TextStyle.FULL, gd.E0().y);
            sb2.append(displayName.substring(0, 1).toUpperCase() + displayName.substring(1));
            sb2.append(": ");
            if (h0(arrayList)) {
                sb2.append(gd.M0(2131752730, null));
            } else if (arrayList.isEmpty()) {
                sb2.append(gd.M0(2131752734, null));
            } else {
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    if (i11 > 0) {
                        sb2.append(", ");
                    }
                    e1 e1Var = (e1) arrayList.get(i11);
                    sb2.append(e1.a(e1Var.a));
                    sb2.append(" - ");
                    sb2.append(e1.a(e1Var.b));
                }
            }
            sb2.append("\n");
        }
        TLRPC.TL_timezone a10 = z1.b(i7).a(tL_businessWorkHours.timezone_id);
        if (((Calendar.getInstance().getTimeZone().getRawOffset() / 1000) - (a10 == null ? 0 : a10.utc_offset)) / 60 != 0 && a10 != null) {
            z1.b(i7);
            sb2.append(gd.a0(null, null, 2131752749, z1.e(a10, true)));
        }
        return sb2.toString();
    }

    public final void c0(int i7) {
        if ((this.f[i7].isEmpty() ? null : (e1) i5.c.h(1, this.f[i7])) == null) {
            return;
        }
        int i10 = (i7 + 6) % 7;
        e1 e1Var = this.f[i10].isEmpty() ? null : (e1) i5.c.h(1, this.f[i10]);
        if (e1Var == null || e1Var.b <= 1439) {
            return;
        }
        e1Var.b = 1439;
        if (e1Var.a >= 1439) {
            this.f[i10].remove(e1Var);
        }
        View B1 = this.a.B1(i10);
        if (B1 instanceof j5) {
            ((j5) B1).setValue(f0(this.f[i10]));
        } else {
            this.a.g3.O(true);
        }
    }

    @Override // org.telegram.ui.ActionBar.h2
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.simpleActionBar.setTitle(gd.M0(2131752753, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new bi.r1(this, 11));
        this.b = this.simpleActionBar.s(gd.M0(2131745751, null));
        d0(false);
        FrameLayout frameLayout = new FrameLayout(context);
        e51 e51Var = new e51(this, new e7(this, 13), new c7(this, 26), null);
        this.a = e51Var;
        e51Var.r1();
        e51 e51Var2 = this.a;
        e51Var2.g3.r = false;
        e51Var2.setSectionsDrawBackground(true);
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

    @Override // org.telegram.messenger.fs
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        z41 z41Var;
        if (i7 == ks.E0) {
            j0();
            return;
        }
        if (i7 == ks.t3) {
            if (this.e == null) {
                this.n = z1.b(this.currentAccount).c();
            }
            e51 e51Var = this.a;
            if (e51Var == null || (z41Var = e51Var.g3) == null) {
                return;
            }
            z41Var.O(true);
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
                    e1 e1Var = (e1) this.e[i7].get(i10);
                    e1 e1Var2 = (e1) this.f[i7].get(i10);
                    if (e1Var.a != e1Var2.a || e1Var.b != e1Var2.b) {
                        break loop0;
                    }
                }
                i7++;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.h2
    public final ck0 getListViewForSimpleGlass() {
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
                        e1 e1Var = (e1) arrayListArr[i7].get(i10);
                        TL_account.TL_businessWeeklyOpen tL_businessWeeklyOpen = new TL_account.TL_businessWeeklyOpen();
                        int i11 = i7 * 1440;
                        tL_businessWeeklyOpen.start_minute = e1Var.a + i11;
                        tL_businessWeeklyOpen.end_minute = i11 + e1Var.b;
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
        getConnectionsManager().sendRequest(updatebusinessworkhours, new ai.e1(this, 20));
        getMessagesStorage().j2(d2, false);
    }

    @Override // org.telegram.ui.ActionBar.h2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void j0() {
        z41 z41Var;
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
                    this.f[i7].add(new e1(0, 1439));
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
        e51 e51Var = this.a;
        if (e51Var != null && (z41Var = e51Var.g3) != null) {
            z41Var.O(true);
        }
        d0(false);
        this.c = true;
    }

    @Override // org.telegram.ui.ActionBar.h2
    public final boolean onFragmentCreate() {
        z1.b(this.currentAccount).g();
        this.n = z1.b(this.currentAccount).c();
        getNotificationCenter().c(this, ks.E0);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.h2
    public final void onFragmentDestroy() {
        getNotificationCenter().n(this, ks.E0);
        super.onFragmentDestroy();
        i0();
    }

    @Override // org.telegram.ui.ActionBar.h2
    public final boolean useSimpleActionBar() {
        return true;
    }
}
