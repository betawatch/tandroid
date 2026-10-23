package ig;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import j$.time.DayOfWeek;
import j$.time.format.TextStyle;
import java.util.ArrayList;
import java.util.Calendar;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.sl;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Cells.i5;
import org.telegram.ui.Cells.r8;
import org.telegram.ui.Components.as;
import org.telegram.ui.Components.b71;
import org.telegram.ui.Components.eq;
import org.telegram.ui.Components.j71;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.xc;
import w7.z5;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final class e1 extends o2 implements NotificationCenter.NotificationCenterDelegate {
    public j71 a;
    public as b;
    public eq c;
    public org.telegram.ui.ActionBar.u0 d;
    public boolean e;
    public boolean f;
    public ArrayList[] h;
    public ArrayList[] n;
    public String r;
    public String s;

    public e1() {
        super(null);
        this.h = null;
        this.n = new ArrayList[]{new ArrayList(), new ArrayList(), new ArrayList(), new ArrayList(), new ArrayList(), new ArrayList(), new ArrayList()};
    }

    public static void U(e1 e1Var, TLRPC.TL_error tL_error, TLObject tLObject) {
        if (tL_error != null) {
            e1Var.b.a(0.0f);
            xc.d0(tL_error);
            return;
        }
        if (!(tLObject instanceof TLRPC.TL_boolFalse)) {
            if (e1Var.isFinished || e1Var.finishing) {
                return;
            }
            e1Var.finishFragment();
            return;
        }
        if (e1Var.getParentActivity() == null) {
            return;
        }
        e1Var.b.a(0.0f);
        sl.q(R.string.UnknownError, xc.a0(e1Var), null);
    }

    public static void V(e1 e1Var, ArrayList arrayList) {
        String string = LocaleController.getString(R.string.BusinessHours);
        String string2 = LocaleController.getString(R.string.BusinessHoursInfo);
        int i10 = R.raw.biz_clock;
        m61 m61Var = new m61(2);
        m61Var.l = string;
        m61Var.o = string2;
        m61Var.k = i10;
        arrayList.add(m61Var);
        m61 i11 = m61.i(-1, LocaleController.getString(R.string.BusinessHoursShow));
        i11.K(e1Var.f);
        arrayList.add(i11);
        arrayList.add(m61.A(-100, null));
        if (!e1Var.f) {
            return;
        }
        i2.o1.q(R.string.BusinessHours, arrayList);
        int i12 = 0;
        while (true) {
            ArrayList[] arrayListArr = e1Var.n;
            if (i12 >= arrayListArr.length) {
                arrayList.add(m61.A(-101, null));
                arrayList.add(m61.f(LocaleController.getString(R.string.BusinessHoursTimezone), e2.b(e1Var.currentAccount).d(e1Var.s, false), -2));
                arrayList.add(m61.A(-102, null));
                return;
            }
            if (arrayListArr[i12] == null) {
                arrayListArr[i12] = new ArrayList();
            }
            String displayName = DayOfWeek.values()[i12].getDisplayName(TextStyle.FULL, LocaleController.getInstance().getCurrentLocale());
            String str = displayName.substring(0, 1).toUpperCase() + displayName.substring(1);
            String a02 = a0(e1Var.n[i12]);
            m61 m61Var2 = new m61(5);
            m61Var2.d = i12;
            m61Var2.l = str;
            m61Var2.m = a02;
            m61Var2.K(!e1Var.n[i12].isEmpty());
            arrayList.add(m61Var2);
            i12++;
        }
    }

    public static /* synthetic */ void W(e1 e1Var, View view, String str) {
        e2 b10 = e2.b(e1Var.currentAccount);
        e1Var.s = str;
        ((r8) view).w(b10.d(str, false), true);
        e1Var.Y(true);
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
            arrayListArr[(i13 / 1440) % 7].add(new d1(i14, (tL_businessWeeklyOpen.end_minute - i13) + i14));
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
                if (!arrayListArr[i21].isEmpty() && ((d1) i2.o1.i(1, arrayListArr[i21])).b >= 1440) {
                    ((d1) i2.o1.i(1, arrayListArr[i21])).b = 1439;
                }
                int min = Math.min((i19 - i16) - 1, 2879);
                ArrayList arrayList2 = arrayListArr[(i15 + 8) % 7];
                if (min >= 1440 && !arrayList2.isEmpty() && ((d1) arrayList2.get(0)).a < min - 1440) {
                    min = ((d1) arrayList2.get(0)).a + 1439;
                }
                arrayListArr[i15].clear();
                arrayListArr[i15].add(new d1(0, min));
            } else {
                int i22 = i17 % 7;
                if (!arrayListArr[i15].isEmpty() && !arrayListArr[i22].isEmpty()) {
                    d1 d1Var = (d1) i2.o1.i(1, arrayListArr[i15]);
                    d1 d1Var2 = (d1) arrayListArr[i22].get(0);
                    int i23 = d1Var.b;
                    if (i23 > 1440 && i23 - 1439 == d1Var2.a) {
                        d1Var.b = 1439;
                        d1Var2.a = 0;
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
            d1 d1Var = (d1) arrayList.get(i10);
            if (i10 > 0) {
                str = si.o0.u(str, "\n");
            }
            StringBuilder u10 = a1.g.u(str);
            u10.append(d1.a(d1Var.a));
            u10.append(" - ");
            u10.append(d1.a(d1Var.b));
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
            d1 d1Var = (d1) arrayList.get(i11);
            if (i10 < d1Var.a) {
                return false;
            }
            i10 = d1Var.b;
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
                    d1 d1Var = (d1) arrayList.get(i12);
                    sb2.append(d1.a(d1Var.a));
                    sb2.append(" - ");
                    sb2.append(d1.a(d1Var.b));
                }
            }
            sb2.append("\n");
        }
        TLRPC.TL_timezone a2 = e2.b(i10).a(tL_businessWorkHours.timezone_id);
        if (((Calendar.getInstance().getTimeZone().getRawOffset() / MediaDataController.MAX_STYLE_RUNS_COUNT) - (a2 == null ? 0 : a2.utc_offset)) / 60 != 0 && a2 != null) {
            int i13 = R.string.BusinessHoursCopyFooter;
            e2.b(i10);
            sb2.append(LocaleController.formatString(i13, e2.e(a2, true)));
        }
        return sb2.toString();
    }

    public final void X(int i10) {
        if ((this.n[i10].isEmpty() ? null : (d1) i2.o1.i(1, this.n[i10])) == null) {
            return;
        }
        int i11 = (i10 + 6) % 7;
        d1 d1Var = this.n[i11].isEmpty() ? null : (d1) i2.o1.i(1, this.n[i11]);
        if (d1Var == null || d1Var.b <= 1439) {
            return;
        }
        d1Var.b = 1439;
        if (d1Var.a >= 1439) {
            this.n[i11].remove(d1Var);
        }
        View E1 = this.a.E1(i11);
        if (E1 instanceof i5) {
            ((i5) E1).setValue(a0(this.n[i11]));
        } else {
            this.a.Z2.N(true);
        }
    }

    public final void Y(boolean z10) {
        if (this.d == null) {
            return;
        }
        boolean b02 = b0();
        this.d.setEnabled(b02);
        if (z10) {
            this.d.animate().alpha(b02 ? 1.0f : 0.0f).scaleX(b02 ? 1.0f : 0.0f).scaleY(b02 ? 1.0f : 0.0f).setDuration(180L).start();
            return;
        }
        this.d.setAlpha(b02 ? 1.0f : 0.0f);
        this.d.setScaleX(b02 ? 1.0f : 0.0f);
        this.d.setScaleY(b02 ? 1.0f : 0.0f);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x006c, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b0() {
        if ((this.h != null) != this.f || !TextUtils.equals(this.r, this.s)) {
            return true;
        }
        if (this.h != null && this.f) {
            if (this.n == null) {
                return true;
            }
            int i10 = 0;
            loop0: while (true) {
                ArrayList[] arrayListArr = this.h;
                if (i10 >= arrayListArr.length) {
                    break;
                }
                if (arrayListArr[i10].size() != this.n[i10].size()) {
                    return true;
                }
                for (int i11 = 0; i11 < this.n[i10].size(); i11++) {
                    d1 d1Var = (d1) this.h[i10].get(i11);
                    d1 d1Var2 = (d1) this.n[i10].get(i11);
                    if (d1Var.a != d1Var2.a || d1Var.b != d1Var2.b) {
                        break loop0;
                    }
                }
                i10++;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.BusinessHours));
        this.actionBar.setActionBarMenuOnItemClick(new ah.s(this, 16));
        Drawable mutate = context.getResources().getDrawable(R.drawable.ic_ab_done).mutate();
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = k6.v8;
        r6.z(kVar, mutate, i10, null, PorterDuff.Mode.MULTIPLY);
        eq eqVar = new eq(k6.x0(null, i10, false));
        this.c = eqVar;
        this.b = new as(mutate, eqVar);
        this.d = this.actionBar.m().i(AndroidUtilities.dp(56.0f), LocaleController.getString(R.string.Done), this.b);
        Y(false);
        FrameLayout frameLayout = new FrameLayout(context);
        r6.i(k6.a7, frameLayout, null);
        j71 j71Var = new j71(this, new hg.o(this, 8), new e1.c(this, 20), null);
        this.a = j71Var;
        j71Var.t1();
        j71 j71Var2 = this.a;
        j71Var2.Z2.r = false;
        frameLayout.addView(j71Var2, z5.c(-1.0f, -1));
        this.actionBar.z(this.a, true);
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
        ArrayList[] arrayListArr = this.n;
        ArrayList arrayList = new ArrayList();
        if (arrayListArr != null) {
            for (int i10 = 0; i10 < arrayListArr.length; i10++) {
                if (arrayListArr[i10] != null) {
                    for (int i11 = 0; i11 < arrayListArr[i10].size(); i11++) {
                        d1 d1Var = (d1) arrayListArr[i10].get(i11);
                        TL_account.TL_businessWeeklyOpen tL_businessWeeklyOpen = new TL_account.TL_businessWeeklyOpen();
                        int i12 = i10 * 1440;
                        tL_businessWeeklyOpen.start_minute = d1Var.a + i12;
                        tL_businessWeeklyOpen.end_minute = i12 + d1Var.b;
                        arrayList.add(tL_businessWeeklyOpen);
                    }
                }
            }
        }
        if (this.f && !arrayList.isEmpty()) {
            TL_account.TL_businessWorkHours tL_businessWorkHours = new TL_account.TL_businessWorkHours();
            tL_businessWorkHours.timezone_id = this.s;
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
        getConnectionsManager().sendRequest(updatebusinessworkhours, new ai.h(this, 20));
        getMessagesStorage().updateUserInfo(userFull, false);
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        b71 b71Var;
        if (i10 == NotificationCenter.userInfoDidLoad) {
            e0();
            return;
        }
        if (i10 == NotificationCenter.timezonesUpdated) {
            if (this.h == null) {
                this.s = e2.b(this.currentAccount).c();
            }
            j71 j71Var = this.a;
            if (j71Var == null || (b71Var = j71Var.Z2) == null) {
                return;
            }
            b71Var.N(true);
        }
    }

    public final void e0() {
        b71 b71Var;
        if (this.e) {
            return;
        }
        TLRPC.UserFull userFull = getMessagesController().getUserFull(getUserConfig().getClientUserId());
        if (userFull == null) {
            getMessagesController().loadUserInfo(getUserConfig().getCurrentUser(), true, getClassGuid());
            return;
        }
        TL_account.TL_businessWorkHours tL_businessWorkHours = userFull.business_work_hours;
        boolean z10 = tL_businessWorkHours != null;
        this.f = z10;
        if (!z10) {
            String c10 = e2.b(this.currentAccount).c();
            this.s = c10;
            this.r = c10;
            this.h = null;
            this.n = new ArrayList[7];
            int i10 = 0;
            while (true) {
                ArrayList[] arrayListArr = this.n;
                if (i10 >= arrayListArr.length) {
                    break;
                }
                arrayListArr[i10] = new ArrayList();
                if (i10 >= 0 && i10 < 5) {
                    this.n[i10].add(new d1(0, 1439));
                }
                i10++;
            }
        } else {
            String str = tL_businessWorkHours.timezone_id;
            this.s = str;
            this.r = str;
            this.h = Z(tL_businessWorkHours.weekly_open);
            this.n = Z(userFull.business_work_hours.weekly_open);
        }
        j71 j71Var = this.a;
        if (j71Var != null && (b71Var = j71Var.Z2) != null) {
            b71Var.N(true);
        }
        Y(false);
        this.e = true;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean onFragmentCreate() {
        e2.b(this.currentAccount).g();
        this.s = e2.b(this.currentAccount).c();
        getNotificationCenter().addObserver(this, NotificationCenter.userInfoDidLoad);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onFragmentDestroy() {
        getNotificationCenter().removeObserver(this, NotificationCenter.userInfoDidLoad);
        super.onFragmentDestroy();
        d0();
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.a.setPadding(0, 0, 0, i13);
        this.a.setClipToPadding(false);
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onThemeColorsChanged() {
        super.onThemeColorsChanged();
        try {
            eq eqVar = this.c;
            if (eqVar != null) {
                eqVar.b(k6.x0(null, k6.v8, false));
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }
}
