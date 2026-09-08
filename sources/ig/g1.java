package ig;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import bi.v7;
import j$.time.DayOfWeek;
import j$.time.format.TextStyle;
import java.util.ArrayList;
import java.util.Calendar;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Cells.i5;
import org.telegram.ui.Cells.p6;
import org.telegram.ui.Cells.r8;
import org.telegram.ui.Components.d61;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.or;
import org.telegram.ui.Components.sp;
import org.telegram.ui.Components.v51;
import org.telegram.ui.Components.yc;
import w7.x5;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class g1 extends n2 implements NotificationCenter.NotificationCenterDelegate {
    public d61 a;
    public or b;
    public org.telegram.ui.ActionBar.v0 c;
    public boolean d;
    public boolean e;
    public ArrayList[] f;
    public ArrayList[] h;
    public String n;
    public String r;

    public g1() {
        super(null);
        this.f = null;
        this.h = new ArrayList[]{new ArrayList(), new ArrayList(), new ArrayList(), new ArrayList(), new ArrayList(), new ArrayList(), new ArrayList()};
    }

    public static void U(g1 g1Var, TLRPC.TL_error tL_error, TLObject tLObject) {
        if (tL_error != null) {
            g1Var.b.a(0.0f);
            yc.b0(tL_error);
            return;
        }
        if (!(tLObject instanceof TLRPC.TL_boolFalse)) {
            if (g1Var.isFinished || g1Var.finishing) {
                return;
            }
            g1Var.finishFragment();
            return;
        }
        if (g1Var.getParentActivity() == null) {
            return;
        }
        g1Var.b.a(0.0f);
        org.telegram.messenger.w1.p(R.string.UnknownError, yc.a0(g1Var), null);
    }

    public static void V(g1 g1Var, ArrayList arrayList) {
        String string = LocaleController.getString(R.string.BusinessHours);
        String string2 = LocaleController.getString(R.string.BusinessHoursInfo);
        int i10 = R.raw.biz_clock;
        h51 h51Var = new h51(2);
        h51Var.l = string;
        h51Var.o = string2;
        h51Var.k = i10;
        arrayList.add(h51Var);
        h51 i11 = h51.i(-1, LocaleController.getString(R.string.BusinessHoursShow));
        i11.K(g1Var.e);
        arrayList.add(i11);
        arrayList.add(h51.A(-100, null));
        if (!g1Var.e) {
            return;
        }
        i2.g.p(R.string.BusinessHours, arrayList);
        int i12 = 0;
        while (true) {
            ArrayList[] arrayListArr = g1Var.h;
            if (i12 >= arrayListArr.length) {
                arrayList.add(h51.A(-101, null));
                arrayList.add(h51.f(LocaleController.getString(R.string.BusinessHoursTimezone), f2.b(g1Var.currentAccount).d(g1Var.r, false), -2));
                arrayList.add(h51.A(-102, null));
                return;
            }
            if (arrayListArr[i12] == null) {
                arrayListArr[i12] = new ArrayList();
            }
            String displayName = DayOfWeek.values()[i12].getDisplayName(TextStyle.FULL, LocaleController.getInstance().getCurrentLocale());
            String str = displayName.substring(0, 1).toUpperCase() + displayName.substring(1);
            String a02 = a0(g1Var.h[i12]);
            h51 h51Var2 = new h51(5);
            h51Var2.d = i12;
            h51Var2.l = str;
            h51Var2.m = a02;
            h51Var2.K(!g1Var.h[i12].isEmpty());
            arrayList.add(h51Var2);
            i12++;
        }
    }

    public static /* synthetic */ void W(g1 g1Var, View view, String str) {
        f2 b10 = f2.b(g1Var.currentAccount);
        g1Var.r = str;
        ((r8) view).u(b10.d(str, false), true);
        g1Var.Y(true);
    }

    public static ArrayList[] Z(ArrayList arrayList) {
        int i10;
        ArrayList[] arrayListArr = new ArrayList[7];
        for (int i11 = 0; i11 < 7; i11++) {
            arrayListArr[i11] = new ArrayList();
        }
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            TL_account.TL_businessWeeklyOpen tL_businessWeeklyOpen = (TL_account.TL_businessWeeklyOpen) arrayList.get(i12);
            int i13 = tL_businessWeeklyOpen.start_minute;
            int i14 = i13 % 1440;
            arrayListArr[(i13 / 1440) % 7].add(new f1(i14, (tL_businessWeeklyOpen.end_minute - i13) + i14));
        }
        int i15 = 0;
        while (i15 < 7) {
            int i16 = i15 * 1440;
            int i17 = i15 + 1;
            int i18 = i17 * 1440;
            int i19 = i16;
            for (int i20 = 0; i20 < arrayList.size(); i20++) {
                TL_account.TL_businessWeeklyOpen tL_businessWeeklyOpen2 = (TL_account.TL_businessWeeklyOpen) arrayList.get(i20);
                if (tL_businessWeeklyOpen2.start_minute <= i19 && (i10 = tL_businessWeeklyOpen2.end_minute) >= i19) {
                    i19 = i10 + 1;
                }
            }
            if (i19 >= i18) {
                int i21 = (i15 + 6) % 7;
                if (!arrayListArr[i21].isEmpty() && ((f1) i2.g.h(1, arrayListArr[i21])).b >= 1440) {
                    ((f1) i2.g.h(1, arrayListArr[i21])).b = 1439;
                }
                int min = Math.min((i19 - i16) - 1, 2879);
                ArrayList arrayList2 = arrayListArr[(i15 + 8) % 7];
                if (min >= 1440 && !arrayList2.isEmpty() && ((f1) arrayList2.get(0)).a < min - 1440) {
                    min = ((f1) arrayList2.get(0)).a + 1439;
                }
                arrayListArr[i15].clear();
                arrayListArr[i15].add(new f1(0, min));
            } else {
                int i22 = i17 % 7;
                if (!arrayListArr[i15].isEmpty() && !arrayListArr[i22].isEmpty()) {
                    f1 f1Var = (f1) i2.g.h(1, arrayListArr[i15]);
                    f1 f1Var2 = (f1) arrayListArr[i22].get(0);
                    int i23 = f1Var.b;
                    if (i23 > 1440 && i23 - 1439 == f1Var2.a) {
                        f1Var.b = 1439;
                        f1Var2.a = 0;
                    }
                }
            }
            i15 = i17;
        }
        return arrayListArr;
    }

    public static String a0(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return LocaleController.getString(R.string.BusinessHoursDayClosed);
        }
        if (c0(arrayList)) {
            return LocaleController.getString(R.string.BusinessHoursDayFullOpened);
        }
        String str = "";
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            f1 f1Var = (f1) arrayList.get(i10);
            if (i10 > 0) {
                str = p6.t(str, "\n");
            }
            StringBuilder u10 = a4.a.u(str);
            u10.append(f1.a(f1Var.a));
            u10.append(" - ");
            u10.append(f1.a(f1Var.b));
            str = u10.toString();
        }
        return str;
    }

    public static boolean c0(ArrayList arrayList) {
        if (arrayList == null || arrayList.isEmpty()) {
            return false;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            f1 f1Var = (f1) arrayList.get(i11);
            if (i10 < f1Var.a) {
                return false;
            }
            i10 = f1Var.b;
        }
        return i10 == 1439 || i10 == 1440;
    }

    public static String f0(int i10, TLRPC.User user, TL_account.TL_businessWorkHours tL_businessWorkHours) {
        if (tL_businessWorkHours == null) {
            return null;
        }
        ArrayList[] Z = Z(tL_businessWorkHours.weekly_open);
        StringBuilder sb2 = new StringBuilder();
        if (user != null) {
            sb2.append(LocaleController.formatString(R.string.BusinessHoursCopyHeader, UserObject.getUserName(user)));
            sb2.append("\n");
        }
        for (int i11 = 0; i11 < 7; i11++) {
            ArrayList arrayList = Z[i11];
            String displayName = DayOfWeek.values()[i11].getDisplayName(TextStyle.FULL, LocaleController.getInstance().getCurrentLocale());
            sb2.append(displayName.substring(0, 1).toUpperCase() + displayName.substring(1));
            sb2.append(": ");
            if (c0(arrayList)) {
                sb2.append(LocaleController.getString(R.string.BusinessHoursProfileOpen));
            } else if (arrayList.isEmpty()) {
                sb2.append(LocaleController.getString(R.string.BusinessHoursProfileClose));
            } else {
                for (int i12 = 0; i12 < arrayList.size(); i12++) {
                    if (i12 > 0) {
                        sb2.append(", ");
                    }
                    f1 f1Var = (f1) arrayList.get(i12);
                    sb2.append(f1.a(f1Var.a));
                    sb2.append(" - ");
                    sb2.append(f1.a(f1Var.b));
                }
            }
            sb2.append("\n");
        }
        TLRPC.TL_timezone a2 = f2.b(i10).a(tL_businessWorkHours.timezone_id);
        if (((Calendar.getInstance().getTimeZone().getRawOffset() / MediaDataController.MAX_STYLE_RUNS_COUNT) - (a2 == null ? 0 : a2.utc_offset)) / 60 != 0 && a2 != null) {
            int i13 = R.string.BusinessHoursCopyFooter;
            f2.b(i10);
            sb2.append(LocaleController.formatString(i13, f2.e(a2, true)));
        }
        return sb2.toString();
    }

    public final void X(int i10) {
        if ((this.h[i10].isEmpty() ? null : (f1) i2.g.h(1, this.h[i10])) == null) {
            return;
        }
        int i11 = (i10 + 6) % 7;
        f1 f1Var = this.h[i11].isEmpty() ? null : (f1) i2.g.h(1, this.h[i11]);
        if (f1Var == null || f1Var.b <= 1439) {
            return;
        }
        f1Var.b = 1439;
        if (f1Var.a >= 1439) {
            this.h[i11].remove(f1Var);
        }
        View x12 = this.a.x1(i11);
        if (x12 instanceof i5) {
            ((i5) x12).setValue(a0(this.h[i11]));
        } else {
            this.a.Y2.N(true);
        }
    }

    public final void Y(boolean z10) {
        if (this.c == null) {
            return;
        }
        boolean b02 = b0();
        this.c.setEnabled(b02);
        if (z10) {
            this.c.animate().alpha(b02 ? 1.0f : 0.0f).scaleX(b02 ? 1.0f : 0.0f).scaleY(b02 ? 1.0f : 0.0f).setDuration(180L).start();
            return;
        }
        this.c.setAlpha(b02 ? 1.0f : 0.0f);
        this.c.setScaleX(b02 ? 1.0f : 0.0f);
        this.c.setScaleY(b02 ? 1.0f : 0.0f);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x006c, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b0() {
        if ((this.f != null) != this.e || !TextUtils.equals(this.n, this.r)) {
            return true;
        }
        if (this.f != null && this.e) {
            if (this.h == null) {
                return true;
            }
            int i10 = 0;
            loop0: while (true) {
                ArrayList[] arrayListArr = this.f;
                if (i10 >= arrayListArr.length) {
                    break;
                }
                if (arrayListArr[i10].size() != this.h[i10].size()) {
                    return true;
                }
                for (int i11 = 0; i11 < this.h[i10].size(); i11++) {
                    f1 f1Var = (f1) this.f[i10].get(i11);
                    f1 f1Var2 = (f1) this.h[i10].get(i11);
                    if (f1Var.a != f1Var2.a || f1Var.b != f1Var2.b) {
                        break loop0;
                    }
                }
                i10++;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.BusinessHours));
        this.actionBar.setActionBarMenuOnItemClick(new ah.t(this, 15));
        Drawable mutate = context.getResources().getDrawable(R.drawable.ic_ab_done).mutate();
        int i10 = j6.v8;
        mutate.setColorFilter(new PorterDuffColorFilter(j6.w0(null, i10, false), PorterDuff.Mode.MULTIPLY));
        this.b = new or(mutate, new sp(j6.w0(null, i10, false)));
        this.c = this.actionBar.n().i(AndroidUtilities.dp(56.0f), LocaleController.getString(R.string.Done), this.b);
        Y(false);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(j6.w0(null, j6.a7, false));
        d61 d61Var = new d61(this, new ci.u(this, 27), new fi.f(this, 11), null);
        this.a = d61Var;
        d61Var.o1();
        d61 d61Var2 = this.a;
        d61Var2.Y2.r = false;
        frameLayout.addView(d61Var2, x5.c(-1.0f, -1));
        this.actionBar.A(this.a, true);
        e0();
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    public final void d0() {
        if (this.b.c > 0.0f) {
            return;
        }
        if (!b0()) {
            finishFragment();
            return;
        }
        this.b.a(1.0f);
        TLRPC.UserFull userFull = getMessagesController().getUserFull(getUserConfig().getClientUserId());
        TL_account.updateBusinessWorkHours updatebusinessworkhours = new TL_account.updateBusinessWorkHours();
        ArrayList[] arrayListArr = this.h;
        ArrayList arrayList = new ArrayList();
        if (arrayListArr != null) {
            for (int i10 = 0; i10 < arrayListArr.length; i10++) {
                if (arrayListArr[i10] != null) {
                    for (int i11 = 0; i11 < arrayListArr[i10].size(); i11++) {
                        f1 f1Var = (f1) arrayListArr[i10].get(i11);
                        TL_account.TL_businessWeeklyOpen tL_businessWeeklyOpen = new TL_account.TL_businessWeeklyOpen();
                        int i12 = i10 * 1440;
                        tL_businessWeeklyOpen.start_minute = f1Var.a + i12;
                        tL_businessWeeklyOpen.end_minute = i12 + f1Var.b;
                        arrayList.add(tL_businessWeeklyOpen);
                    }
                }
            }
        }
        if (this.e && !arrayList.isEmpty()) {
            TL_account.TL_businessWorkHours tL_businessWorkHours = new TL_account.TL_businessWorkHours();
            tL_businessWorkHours.timezone_id = this.r;
            tL_businessWorkHours.weekly_open.addAll(arrayList);
            updatebusinessworkhours.flags |= 1;
            updatebusinessworkhours.business_work_hours = tL_businessWorkHours;
            if (userFull != null) {
                userFull.flags2 |= 1;
                userFull.business_work_hours = tL_businessWorkHours;
            }
        } else if (userFull != null) {
            userFull.flags2 &= -2;
            userFull.business_work_hours = null;
        }
        getConnectionsManager().sendRequest(updatebusinessworkhours, new v7(this, 14));
        getMessagesStorage().updateUserInfo(userFull, false);
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        v51 v51Var;
        if (i10 == NotificationCenter.userInfoDidLoad) {
            e0();
            return;
        }
        if (i10 == NotificationCenter.timezonesUpdated) {
            if (this.f == null) {
                this.r = f2.b(this.currentAccount).c();
            }
            d61 d61Var = this.a;
            if (d61Var == null || (v51Var = d61Var.Y2) == null) {
                return;
            }
            v51Var.N(true);
        }
    }

    public final void e0() {
        v51 v51Var;
        if (this.d) {
            return;
        }
        TLRPC.UserFull userFull = getMessagesController().getUserFull(getUserConfig().getClientUserId());
        if (userFull == null) {
            getMessagesController().loadUserInfo(getUserConfig().getCurrentUser(), true, getClassGuid());
            return;
        }
        TL_account.TL_businessWorkHours tL_businessWorkHours = userFull.business_work_hours;
        boolean z10 = tL_businessWorkHours != null;
        this.e = z10;
        if (!z10) {
            String c10 = f2.b(this.currentAccount).c();
            this.r = c10;
            this.n = c10;
            this.f = null;
            this.h = new ArrayList[7];
            int i10 = 0;
            while (true) {
                ArrayList[] arrayListArr = this.h;
                if (i10 >= arrayListArr.length) {
                    break;
                }
                arrayListArr[i10] = new ArrayList();
                if (i10 >= 0 && i10 < 5) {
                    this.h[i10].add(new f1(0, 1439));
                }
                i10++;
            }
        } else {
            String str = tL_businessWorkHours.timezone_id;
            this.r = str;
            this.n = str;
            this.f = Z(tL_businessWorkHours.weekly_open);
            this.h = Z(userFull.business_work_hours.weekly_open);
        }
        d61 d61Var = this.a;
        if (d61Var != null && (v51Var = d61Var.Y2) != null) {
            v51Var.N(true);
        }
        Y(false);
        this.d = true;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean onFragmentCreate() {
        f2.b(this.currentAccount).g();
        this.r = f2.b(this.currentAccount).c();
        getNotificationCenter().addObserver(this, NotificationCenter.userInfoDidLoad);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onFragmentDestroy() {
        getNotificationCenter().removeObserver(this, NotificationCenter.userInfoDidLoad);
        super.onFragmentDestroy();
        d0();
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.a.setPadding(0, 0, 0, i13);
        this.a.setClipToPadding(false);
    }
}
