package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class ma extends org.telegram.ui.ActionBar.o2 {
    public static final Paint D = new Paint(1);
    public static final Paint E = new Paint(1);
    public static final Paint F = new Paint(1);
    public ja A;
    public la B;
    public org.telegram.ui.Cells.x1 C;
    public org.telegram.ui.ActionBar.w0 a;
    public org.telegram.ui.Components.wk0 b;
    public da c;
    public boolean d;
    public int e;
    public String f;
    public org.telegram.messenger.voip.l0 h;
    public boolean n;
    public String r;
    public final ArrayList s;
    public final ArrayList v;
    public final ArrayList w;
    public final long x;
    public ga y;

    public ma(Bundle bundle) {
        super(bundle);
        this.r = "";
        this.s = new ArrayList();
        this.v = new ArrayList();
        this.w = new ArrayList();
        if (bundle != null) {
            this.x = bundle.getLong("bot_id");
        }
    }

    public static /* synthetic */ void T(ma maVar, org.telegram.ui.ActionBar.c2 c2Var, TLRPC.TL_error tL_error, TL_account.updateUsername updateusername) {
        try {
            c2Var.dismiss();
        } catch (Exception e10) {
            FileLog.e(e10);
        }
        org.telegram.ui.Components.y4.f0(maVar.currentAccount, tL_error, maVar, updateusername, new Object[0]);
        maVar.g0();
    }

    public static /* synthetic */ void V(ma maVar, String str) {
        TL_account.checkUsername checkusername = new TL_account.checkUsername();
        checkusername.username = str;
        maVar.e = ConnectionsManager.getInstance(maVar.currentAccount).sendRequest(checkusername, new y9(maVar, str, checkusername, 0), 2);
    }

    public static /* synthetic */ void W(ma maVar, org.telegram.ui.ActionBar.c2 c2Var, TLRPC.User user) {
        try {
            c2Var.dismiss();
        } catch (Exception e10) {
            FileLog.e(e10);
        }
        ArrayList<TLRPC.User> arrayList = new ArrayList<>();
        arrayList.add(user);
        MessagesController.getInstance(maVar.currentAccount).putUsers(arrayList, false);
        MessagesStorage.getInstance(maVar.currentAccount).putUsersAndChats(arrayList, null, false, true);
        UserConfig.getInstance(maVar.currentAccount).saveConfig(true);
        maVar.finishFragment();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void X(ma maVar) {
        TL_bots.reorderUsernames reorderusernames;
        long j10 = maVar.x;
        ArrayList arrayList = maVar.v;
        ArrayList arrayList2 = maVar.s;
        if (maVar.d) {
            maVar.d = false;
            ArrayList<String> arrayList3 = new ArrayList<>();
            for (int i9 = 0; i9 < arrayList2.size(); i9++) {
                if (((TLRPC.TL_username) arrayList2.get(i9)).active) {
                    arrayList3.add(((TLRPC.TL_username) arrayList2.get(i9)).username);
                }
            }
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                if (((TLRPC.TL_username) arrayList.get(i10)).active) {
                    arrayList3.add(((TLRPC.TL_username) arrayList.get(i10)).username);
                }
            }
            if (j10 == 0) {
                TL_account.reorderUsernames reorderusernames2 = new TL_account.reorderUsernames();
                reorderusernames2.order = arrayList3;
                reorderusernames = reorderusernames2;
            } else {
                TL_bots.reorderUsernames reorderusernames3 = new TL_bots.reorderUsernames();
                reorderusernames3.bot = MessagesController.getInstance(maVar.currentAccount).getInputUser(j10);
                reorderusernames3.order = arrayList3;
                reorderusernames = reorderusernames3;
            }
            maVar.getConnectionsManager().sendRequest(reorderusernames, new ih.q5(6));
            ArrayList<TLRPC.TL_username> arrayList4 = new ArrayList<>();
            arrayList4.addAll(arrayList2);
            arrayList4.addAll(arrayList);
            TLRPC.User user = MessagesController.getInstance(maVar.currentAccount).getUser(Long.valueOf(maVar.f0()));
            user.usernames = arrayList4;
            MessagesController.getInstance(maVar.currentAccount).putUser(user, false, true);
        }
    }

    public static void Y(ma maVar) {
        if (maVar.x != 0) {
            maVar.finishFragment();
            return;
        }
        int i9 = 1;
        if (maVar.r.startsWith("@")) {
            maVar.r = maVar.r.substring(1);
        }
        if (!maVar.r.isEmpty() && !maVar.c0(maVar.r)) {
            maVar.g0();
            return;
        }
        TLRPC.User e02 = maVar.e0();
        if (maVar.getParentActivity() == null || e02 == null) {
            return;
        }
        String publicUsername = UserObject.getPublicUsername(e02);
        if (publicUsername == null) {
            publicUsername = "";
        }
        if (publicUsername.equals(maVar.r)) {
            maVar.finishFragment();
            return;
        }
        org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2(maVar.getParentActivity(), 3, null);
        TL_account.updateUsername updateusername = new TL_account.updateUsername();
        updateusername.username = maVar.r;
        NotificationCenter.getInstance(maVar.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_NAME));
        int sendRequest = ConnectionsManager.getInstance(maVar.currentAccount).sendRequest(updateusername, new y9(maVar, c2Var, updateusername, i9), 2);
        ConnectionsManager.getInstance(maVar.currentAccount).bindRequestToGuid(sendRequest, maVar.classGuid);
        c2Var.setOnCancelListener(new gh.x(maVar, sendRequest, i9));
        c2Var.show();
    }

    public final boolean c0(String str) {
        if (str != null && str.startsWith("@")) {
            str = str.substring(1);
        }
        org.telegram.ui.Cells.x1 x1Var = this.C;
        if (x1Var != null) {
            x1Var.setVisibility(!TextUtils.isEmpty(str) ? 0 : 8);
            la laVar = this.B;
            if (laVar != null) {
                la.a(laVar);
            }
        }
        org.telegram.messenger.voip.l0 l0Var = this.h;
        if (l0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(l0Var);
            this.h = null;
            this.f = null;
            if (this.e != 0) {
                ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.e, true);
            }
        }
        if (str != null) {
            if (str.startsWith("_") || str.endsWith("_")) {
                org.telegram.ui.Cells.x1 x1Var2 = this.C;
                if (x1Var2 != null) {
                    x1Var2.setText(LocaleController.getString(R.string.UsernameInvalid));
                    org.telegram.ui.Cells.x1 x1Var3 = this.C;
                    int i9 = org.telegram.ui.ActionBar.f6.p7;
                    x1Var3.setTag(Integer.valueOf(i9));
                    this.C.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i9, false));
                    la laVar2 = this.B;
                    if (laVar2 != null) {
                        la.a(laVar2);
                        return false;
                    }
                }
            } else {
                for (int i10 = 0; i10 < str.length(); i10++) {
                    char charAt = str.charAt(i10);
                    if (i10 == 0 && charAt >= '0' && charAt <= '9') {
                        org.telegram.ui.Cells.x1 x1Var4 = this.C;
                        if (x1Var4 != null) {
                            x1Var4.setText(LocaleController.getString(R.string.UsernameInvalidStartNumber));
                            org.telegram.ui.Cells.x1 x1Var5 = this.C;
                            int i11 = org.telegram.ui.ActionBar.f6.p7;
                            x1Var5.setTag(Integer.valueOf(i11));
                            this.C.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i11, false));
                            la laVar3 = this.B;
                            if (laVar3 != null) {
                                la.a(laVar3);
                                return false;
                            }
                        }
                    } else if ((charAt < '0' || charAt > '9') && ((charAt < 'a' || charAt > 'z') && ((charAt < 'A' || charAt > 'Z') && charAt != '_'))) {
                        org.telegram.ui.Cells.x1 x1Var6 = this.C;
                        if (x1Var6 != null) {
                            x1Var6.setText(LocaleController.getString(R.string.UsernameInvalid));
                            org.telegram.ui.Cells.x1 x1Var7 = this.C;
                            int i12 = org.telegram.ui.ActionBar.f6.p7;
                            x1Var7.setTag(Integer.valueOf(i12));
                            this.C.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i12, false));
                            la laVar4 = this.B;
                            if (laVar4 != null) {
                                la.a(laVar4);
                                return false;
                            }
                        }
                    }
                }
            }
            return false;
        }
        if (str == null || str.length() < 4) {
            org.telegram.ui.Cells.x1 x1Var8 = this.C;
            if (x1Var8 != null) {
                x1Var8.setText(LocaleController.getString(R.string.UsernameInvalidShort));
                org.telegram.ui.Cells.x1 x1Var9 = this.C;
                int i13 = org.telegram.ui.ActionBar.f6.p7;
                x1Var9.setTag(Integer.valueOf(i13));
                this.C.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i13, false));
                la laVar5 = this.B;
                if (laVar5 != null) {
                    la.a(laVar5);
                }
            }
        } else {
            if (str.length() <= 32) {
                String str2 = e0().username;
                if (str2 == null) {
                    str2 = "";
                }
                if (str.equals(str2)) {
                    org.telegram.ui.Cells.x1 x1Var10 = this.C;
                    if (x1Var10 != null) {
                        x1Var10.setText(LocaleController.formatString("UsernameAvailable", R.string.UsernameAvailable, str));
                        org.telegram.ui.Cells.x1 x1Var11 = this.C;
                        int i14 = org.telegram.ui.ActionBar.f6.w6;
                        x1Var11.setTag(Integer.valueOf(i14));
                        this.C.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i14, false));
                        la laVar6 = this.B;
                        if (laVar6 != null) {
                            la.a(laVar6);
                        }
                    }
                    return true;
                }
                org.telegram.ui.Cells.x1 x1Var12 = this.C;
                if (x1Var12 != null) {
                    x1Var12.setText(LocaleController.getString(R.string.UsernameChecking));
                    org.telegram.ui.Cells.x1 x1Var13 = this.C;
                    int i15 = org.telegram.ui.ActionBar.f6.F6;
                    x1Var13.setTag(Integer.valueOf(i15));
                    this.C.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i15, false));
                    la laVar7 = this.B;
                    if (laVar7 != null) {
                        la.a(laVar7);
                    }
                }
                this.f = str;
                org.telegram.messenger.voip.l0 l0Var2 = new org.telegram.messenger.voip.l0(21, this, str);
                this.h = l0Var2;
                AndroidUtilities.runOnUIThread(l0Var2, 300L);
                return true;
            }
            org.telegram.ui.Cells.x1 x1Var14 = this.C;
            if (x1Var14 != null) {
                x1Var14.setText(LocaleController.getString(R.string.UsernameInvalidLong));
                org.telegram.ui.Cells.x1 x1Var15 = this.C;
                int i16 = org.telegram.ui.ActionBar.f6.p7;
                x1Var15.setTag(Integer.valueOf(i16));
                this.C.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i16, false));
                la laVar8 = this.B;
                if (laVar8 != null) {
                    la.a(laVar8);
                    return false;
                }
            }
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final View createView(Context context) {
        String str;
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.Username));
        this.actionBar.setActionBarMenuOnItemClick(new fh.w4(this, 22));
        this.a = this.actionBar.n().h(1, R.drawable.ic_ab_done, LocaleController.getString(R.string.Done), AndroidUtilities.dp(56.0f));
        TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(f0()));
        if (user == null) {
            user = e0();
        }
        if (user != null) {
            this.r = null;
            if (user.usernames != null) {
                int i9 = 0;
                while (true) {
                    if (i9 >= user.usernames.size()) {
                        break;
                    }
                    TLRPC.TL_username tL_username = user.usernames.get(i9);
                    if (tL_username != null && tL_username.editable) {
                        this.r = tL_username.username;
                        break;
                    }
                    i9++;
                }
            }
            if (this.r == null && (str = user.username) != null) {
                this.r = str;
            }
            if (this.r == null) {
                this.r = "";
            }
            this.s.clear();
            ArrayList arrayList = this.v;
            arrayList.clear();
            for (int i10 = 0; i10 < user.usernames.size(); i10++) {
                if (user.usernames.get(i10).active) {
                    arrayList.add(user.usernames.get(i10));
                }
            }
            for (int i11 = 0; i11 < user.usernames.size(); i11++) {
                if (!user.usernames.get(i11).active) {
                    arrayList.add(user.usernames.get(i11));
                }
            }
        }
        this.fragmentView = new FrameLayout(context);
        org.telegram.ui.Components.wk0 wk0Var = new org.telegram.ui.Components.wk0(context, null);
        this.b = wk0Var;
        wk0Var.p1();
        this.actionBar.setAdaptiveBackground(this.b);
        this.fragmentView.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.f6.a7));
        this.b.setLayoutManager(new f2.m0());
        org.telegram.ui.Components.wk0 wk0Var2 = this.b;
        da daVar = new da(this);
        this.c = daVar;
        wk0Var2.setAdapter(daVar);
        this.b.setSelectorDrawableColor(getThemedColor(org.telegram.ui.ActionBar.f6.i6));
        new f2.h0(new ha(this)).d(this.b);
        ((FrameLayout) this.fragmentView).addView(this.b, g7.e6.c(-1.0f, -1));
        this.fragmentView.setOnTouchListener(new jh.d(6));
        this.b.setOnItemClickListener(new ba(this));
        AndroidUtilities.runOnUIThread(new kt0(this, 19), 40L);
        return this.fragmentView;
    }

    public final void d0(boolean z10) {
        ga gaVar = this.y;
        if (gaVar != null) {
            if (!gaVar.a.isFocused()) {
                EditTextBoldCursor editTextBoldCursor = this.y.a;
                editTextBoldCursor.setSelection(editTextBoldCursor.length());
            }
            this.y.a.requestFocus();
            if (z10) {
                AndroidUtilities.showKeyboard(this.y.a);
            }
        }
    }

    public final TLRPC.User e0() {
        long j10 = this.x;
        int i9 = this.currentAccount;
        return j10 != 0 ? MessagesController.getInstance(i9).getUser(Long.valueOf(j10)) : UserConfig.getInstance(i9).getCurrentUser();
    }

    public final long f0() {
        long j10 = this.x;
        return j10 != 0 ? j10 : UserConfig.getInstance(this.currentAccount).getClientUserId();
    }

    public final void g0() {
        if (this.b == null) {
            return;
        }
        for (int i9 = 0; i9 < this.b.getChildCount(); i9++) {
            View childAt = this.b.getChildAt(i9);
            if ((childAt instanceof org.telegram.ui.Cells.m4) && i9 == 0) {
                AndroidUtilities.shakeViewSpring(((org.telegram.ui.Cells.m4) childAt).getTextView());
            } else if (childAt instanceof la) {
                AndroidUtilities.shakeViewSpring(childAt);
            } else if (childAt instanceof ga) {
                ga gaVar = (ga) childAt;
                AndroidUtilities.shakeViewSpring(gaVar.a);
                AndroidUtilities.shakeViewSpring(gaVar.b);
            }
        }
        BotWebViewVibrationEffect.APP_ERROR.vibrate();
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.f6.d6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.f6.v8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.f6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.f6.t8));
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0067  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h0(int i9, boolean z10, boolean z11) {
        TLRPC.TL_username tL_username;
        int min;
        int i10 = i9 - 4;
        if (i10 >= 0) {
            ArrayList arrayList = this.v;
            if (i10 < arrayList.size() && (tL_username = (TLRPC.TL_username) arrayList.get(i10)) != null) {
                tL_username.active = z10;
                int i11 = -1;
                if (!z10) {
                    int i12 = -1;
                    for (int i13 = 0; i13 < arrayList.size(); i13++) {
                        if (((TLRPC.TL_username) arrayList.get(i13)).active) {
                            i12 = i13;
                        }
                    }
                    if (i12 >= 0) {
                        min = Math.min(arrayList.size() - 1, i12 + 1);
                        i11 = min + 4;
                    }
                    if (this.b != null) {
                    }
                    if (i11 >= 0) {
                        return;
                    } else {
                        return;
                    }
                }
                int i14 = 0;
                while (true) {
                    if (i14 >= arrayList.size()) {
                        i14 = -1;
                        break;
                    } else if (!((TLRPC.TL_username) arrayList.get(i14)).active) {
                        break;
                    } else {
                        i14++;
                    }
                }
                if (i14 >= 0) {
                    min = Math.max(0, i14 - 1);
                    i11 = min + 4;
                }
                if (this.b != null) {
                    int i15 = 0;
                    while (true) {
                        if (i15 >= this.b.getChildCount()) {
                            break;
                        }
                        View childAt = this.b.getChildAt(i15);
                        this.b.getClass();
                        if (RecyclerView.R(childAt) == i9) {
                            if (z11) {
                                AndroidUtilities.shakeView(childAt);
                            }
                            if (childAt instanceof ja) {
                                ja jaVar = (ja) childAt;
                                jaVar.setLoading(this.w.contains(tL_username.username));
                                TLRPC.TL_username tL_username2 = jaVar.v;
                                if (tL_username2 != null) {
                                    jaVar.a(tL_username2, jaVar.w, true, jaVar.x);
                                }
                            }
                        } else {
                            i15++;
                        }
                    }
                }
                if (i11 >= 0 || i9 == i11) {
                    return;
                }
                da daVar = this.c;
                int i16 = i11 - 4;
                ArrayList arrayList2 = daVar.c.v;
                if (i10 >= arrayList2.size() || i16 >= arrayList2.size()) {
                    return;
                }
                arrayList2.add(i16, (TLRPC.TL_username) arrayList2.remove(i10));
                daVar.p(i9, i11);
                for (int i17 = 0; i17 < arrayList2.size(); i17++) {
                    daVar.m(i17 + 4);
                }
            }
        }
    }

    public final void i0(TLRPC.TL_username tL_username, boolean z10, boolean z11) {
        int i9 = 0;
        while (true) {
            ArrayList arrayList = this.v;
            if (i9 >= arrayList.size()) {
                return;
            }
            if (arrayList.get(i9) == tL_username) {
                h0(i9 + 4, z10, z11);
                return;
            }
            i9++;
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onResume() {
        super.onResume();
        if (MessagesController.getGlobalMainSettings().getBoolean("view_animations", true)) {
            return;
        }
        d0(false);
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (z10) {
            d0(false);
        }
    }
}
