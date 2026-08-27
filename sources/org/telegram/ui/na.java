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

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class na extends org.telegram.ui.ActionBar.n2 {
    public static final Paint D = new Paint(1);
    public static final Paint E = new Paint(1);
    public static final Paint F = new Paint(1);
    public ka A;
    public ma B;
    public org.telegram.ui.Cells.w1 C;
    public org.telegram.ui.ActionBar.v0 a;
    public org.telegram.ui.Components.zk0 b;
    public ea c;
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
    public ha y;

    public na(Bundle bundle) {
        super(bundle);
        this.r = "";
        this.s = new ArrayList();
        this.v = new ArrayList();
        this.w = new ArrayList();
        if (bundle != null) {
            this.x = bundle.getLong("bot_id");
        }
    }

    public static /* synthetic */ void U(na naVar, org.telegram.ui.ActionBar.b2 b2Var, TLRPC.TL_error tL_error, TL_account.updateUsername updateusername) {
        try {
            b2Var.dismiss();
        } catch (Exception e9) {
            FileLog.e(e9);
        }
        org.telegram.ui.Components.y4.f0(naVar.currentAccount, tL_error, naVar, updateusername, new Object[0]);
        naVar.h0();
    }

    public static /* synthetic */ void W(na naVar, String str) {
        TL_account.checkUsername checkusername = new TL_account.checkUsername();
        checkusername.username = str;
        naVar.e = ConnectionsManager.getInstance(naVar.currentAccount).sendRequest(checkusername, new z9(naVar, str, checkusername, 0), 2);
    }

    public static /* synthetic */ void X(na naVar, org.telegram.ui.ActionBar.b2 b2Var, TLRPC.User user) {
        try {
            b2Var.dismiss();
        } catch (Exception e9) {
            FileLog.e(e9);
        }
        ArrayList<TLRPC.User> arrayList = new ArrayList<>();
        arrayList.add(user);
        MessagesController.getInstance(naVar.currentAccount).putUsers(arrayList, false);
        MessagesStorage.getInstance(naVar.currentAccount).putUsersAndChats(arrayList, null, false, true);
        UserConfig.getInstance(naVar.currentAccount).saveConfig(true);
        naVar.finishFragment();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void Y(na naVar) {
        TL_bots.reorderUsernames reorderusernames;
        long j10 = naVar.x;
        ArrayList arrayList = naVar.v;
        ArrayList arrayList2 = naVar.s;
        if (naVar.d) {
            naVar.d = false;
            ArrayList<String> arrayList3 = new ArrayList<>();
            for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                if (((TLRPC.TL_username) arrayList2.get(i10)).active) {
                    arrayList3.add(((TLRPC.TL_username) arrayList2.get(i10)).username);
                }
            }
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                if (((TLRPC.TL_username) arrayList.get(i11)).active) {
                    arrayList3.add(((TLRPC.TL_username) arrayList.get(i11)).username);
                }
            }
            if (j10 == 0) {
                TL_account.reorderUsernames reorderusernames2 = new TL_account.reorderUsernames();
                reorderusernames2.order = arrayList3;
                reorderusernames = reorderusernames2;
            } else {
                TL_bots.reorderUsernames reorderusernames3 = new TL_bots.reorderUsernames();
                reorderusernames3.bot = MessagesController.getInstance(naVar.currentAccount).getInputUser(j10);
                reorderusernames3.order = arrayList3;
                reorderusernames = reorderusernames3;
            }
            naVar.getConnectionsManager().sendRequest(reorderusernames, new jh.m5(6));
            ArrayList<TLRPC.TL_username> arrayList4 = new ArrayList<>();
            arrayList4.addAll(arrayList2);
            arrayList4.addAll(arrayList);
            TLRPC.User user = MessagesController.getInstance(naVar.currentAccount).getUser(Long.valueOf(naVar.g0()));
            user.usernames = arrayList4;
            MessagesController.getInstance(naVar.currentAccount).putUser(user, false, true);
        }
    }

    public static void Z(na naVar) {
        if (naVar.x != 0) {
            naVar.finishFragment();
            return;
        }
        int i10 = 1;
        if (naVar.r.startsWith("@")) {
            naVar.r = naVar.r.substring(1);
        }
        if (!naVar.r.isEmpty() && !naVar.d0(naVar.r)) {
            naVar.h0();
            return;
        }
        TLRPC.User f02 = naVar.f0();
        if (naVar.getParentActivity() == null || f02 == null) {
            return;
        }
        String publicUsername = UserObject.getPublicUsername(f02);
        if (publicUsername == null) {
            publicUsername = "";
        }
        if (publicUsername.equals(naVar.r)) {
            naVar.finishFragment();
            return;
        }
        org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(naVar.getParentActivity(), 3, null);
        TL_account.updateUsername updateusername = new TL_account.updateUsername();
        updateusername.username = naVar.r;
        NotificationCenter.getInstance(naVar.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_NAME));
        int sendRequest = ConnectionsManager.getInstance(naVar.currentAccount).sendRequest(updateusername, new z9(naVar, b2Var, updateusername, i10), 2);
        ConnectionsManager.getInstance(naVar.currentAccount).bindRequestToGuid(sendRequest, naVar.classGuid);
        b2Var.setOnCancelListener(new hh.x(naVar, sendRequest, i10));
        b2Var.show();
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final View createView(Context context) {
        String str;
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.Username));
        this.actionBar.setActionBarMenuOnItemClick(new ag.e2(this, 23));
        this.a = this.actionBar.n().h(1, R.drawable.ic_ab_done, LocaleController.getString(R.string.Done), AndroidUtilities.dp(56.0f));
        TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(g0()));
        if (user == null) {
            user = f0();
        }
        if (user != null) {
            this.r = null;
            if (user.usernames != null) {
                int i10 = 0;
                while (true) {
                    if (i10 >= user.usernames.size()) {
                        break;
                    }
                    TLRPC.TL_username tL_username = user.usernames.get(i10);
                    if (tL_username != null && tL_username.editable) {
                        this.r = tL_username.username;
                        break;
                    }
                    i10++;
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
            for (int i11 = 0; i11 < user.usernames.size(); i11++) {
                if (user.usernames.get(i11).active) {
                    arrayList.add(user.usernames.get(i11));
                }
            }
            for (int i12 = 0; i12 < user.usernames.size(); i12++) {
                if (!user.usernames.get(i12).active) {
                    arrayList.add(user.usernames.get(i12));
                }
            }
        }
        this.fragmentView = new FrameLayout(context);
        org.telegram.ui.Components.zk0 zk0Var = new org.telegram.ui.Components.zk0(context, null);
        this.b = zk0Var;
        zk0Var.p1();
        this.actionBar.setAdaptiveBackground(this.b);
        this.fragmentView.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.g6.a7));
        this.b.setLayoutManager(new f2.k0());
        org.telegram.ui.Components.zk0 zk0Var2 = this.b;
        ea eaVar = new ea(this);
        this.c = eaVar;
        zk0Var2.setAdapter(eaVar);
        this.b.setSelectorDrawableColor(getThemedColor(org.telegram.ui.ActionBar.g6.i6));
        new f2.f0(new ia(this)).d(this.b);
        ((FrameLayout) this.fragmentView).addView(this.b, h7.z5.c(-1.0f, -1));
        this.fragmentView.setOnTouchListener(new kh.e(6));
        this.b.setOnItemClickListener(new ca(this));
        AndroidUtilities.runOnUIThread(new lt0(this, 19), 40L);
        return this.fragmentView;
    }

    public final boolean d0(String str) {
        if (str != null && str.startsWith("@")) {
            str = str.substring(1);
        }
        org.telegram.ui.Cells.w1 w1Var = this.C;
        if (w1Var != null) {
            w1Var.setVisibility(!TextUtils.isEmpty(str) ? 0 : 8);
            ma maVar = this.B;
            if (maVar != null) {
                ma.a(maVar);
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
                org.telegram.ui.Cells.w1 w1Var2 = this.C;
                if (w1Var2 != null) {
                    w1Var2.setText(LocaleController.getString(R.string.UsernameInvalid));
                    org.telegram.ui.Cells.w1 w1Var3 = this.C;
                    int i10 = org.telegram.ui.ActionBar.g6.p7;
                    w1Var3.setTag(Integer.valueOf(i10));
                    this.C.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i10, false));
                    ma maVar2 = this.B;
                    if (maVar2 != null) {
                        ma.a(maVar2);
                        return false;
                    }
                }
            } else {
                for (int i11 = 0; i11 < str.length(); i11++) {
                    char charAt = str.charAt(i11);
                    if (i11 == 0 && charAt >= '0' && charAt <= '9') {
                        org.telegram.ui.Cells.w1 w1Var4 = this.C;
                        if (w1Var4 != null) {
                            w1Var4.setText(LocaleController.getString(R.string.UsernameInvalidStartNumber));
                            org.telegram.ui.Cells.w1 w1Var5 = this.C;
                            int i12 = org.telegram.ui.ActionBar.g6.p7;
                            w1Var5.setTag(Integer.valueOf(i12));
                            this.C.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i12, false));
                            ma maVar3 = this.B;
                            if (maVar3 != null) {
                                ma.a(maVar3);
                                return false;
                            }
                        }
                    } else if ((charAt < '0' || charAt > '9') && ((charAt < 'a' || charAt > 'z') && ((charAt < 'A' || charAt > 'Z') && charAt != '_'))) {
                        org.telegram.ui.Cells.w1 w1Var6 = this.C;
                        if (w1Var6 != null) {
                            w1Var6.setText(LocaleController.getString(R.string.UsernameInvalid));
                            org.telegram.ui.Cells.w1 w1Var7 = this.C;
                            int i13 = org.telegram.ui.ActionBar.g6.p7;
                            w1Var7.setTag(Integer.valueOf(i13));
                            this.C.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i13, false));
                            ma maVar4 = this.B;
                            if (maVar4 != null) {
                                ma.a(maVar4);
                                return false;
                            }
                        }
                    }
                }
            }
            return false;
        }
        if (str == null || str.length() < 4) {
            org.telegram.ui.Cells.w1 w1Var8 = this.C;
            if (w1Var8 != null) {
                w1Var8.setText(LocaleController.getString(R.string.UsernameInvalidShort));
                org.telegram.ui.Cells.w1 w1Var9 = this.C;
                int i14 = org.telegram.ui.ActionBar.g6.p7;
                w1Var9.setTag(Integer.valueOf(i14));
                this.C.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i14, false));
                ma maVar5 = this.B;
                if (maVar5 != null) {
                    ma.a(maVar5);
                }
            }
        } else {
            if (str.length() <= 32) {
                String str2 = f0().username;
                if (str2 == null) {
                    str2 = "";
                }
                if (str.equals(str2)) {
                    org.telegram.ui.Cells.w1 w1Var10 = this.C;
                    if (w1Var10 != null) {
                        w1Var10.setText(LocaleController.formatString("UsernameAvailable", R.string.UsernameAvailable, str));
                        org.telegram.ui.Cells.w1 w1Var11 = this.C;
                        int i15 = org.telegram.ui.ActionBar.g6.w6;
                        w1Var11.setTag(Integer.valueOf(i15));
                        this.C.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i15, false));
                        ma maVar6 = this.B;
                        if (maVar6 != null) {
                            ma.a(maVar6);
                        }
                    }
                    return true;
                }
                org.telegram.ui.Cells.w1 w1Var12 = this.C;
                if (w1Var12 != null) {
                    w1Var12.setText(LocaleController.getString(R.string.UsernameChecking));
                    org.telegram.ui.Cells.w1 w1Var13 = this.C;
                    int i16 = org.telegram.ui.ActionBar.g6.F6;
                    w1Var13.setTag(Integer.valueOf(i16));
                    this.C.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i16, false));
                    ma maVar7 = this.B;
                    if (maVar7 != null) {
                        ma.a(maVar7);
                    }
                }
                this.f = str;
                org.telegram.messenger.voip.l0 l0Var2 = new org.telegram.messenger.voip.l0(21, this, str);
                this.h = l0Var2;
                AndroidUtilities.runOnUIThread(l0Var2, 300L);
                return true;
            }
            org.telegram.ui.Cells.w1 w1Var14 = this.C;
            if (w1Var14 != null) {
                w1Var14.setText(LocaleController.getString(R.string.UsernameInvalidLong));
                org.telegram.ui.Cells.w1 w1Var15 = this.C;
                int i17 = org.telegram.ui.ActionBar.g6.p7;
                w1Var15.setTag(Integer.valueOf(i17));
                this.C.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i17, false));
                ma maVar8 = this.B;
                if (maVar8 != null) {
                    ma.a(maVar8);
                    return false;
                }
            }
        }
        return false;
    }

    public final void e0(boolean z10) {
        ha haVar = this.y;
        if (haVar != null) {
            if (!haVar.a.isFocused()) {
                EditTextBoldCursor editTextBoldCursor = this.y.a;
                editTextBoldCursor.setSelection(editTextBoldCursor.length());
            }
            this.y.a.requestFocus();
            if (z10) {
                AndroidUtilities.showKeyboard(this.y.a);
            }
        }
    }

    public final TLRPC.User f0() {
        long j10 = this.x;
        int i10 = this.currentAccount;
        return j10 != 0 ? MessagesController.getInstance(i10).getUser(Long.valueOf(j10)) : UserConfig.getInstance(i10).getCurrentUser();
    }

    public final long g0() {
        long j10 = this.x;
        return j10 != 0 ? j10 : UserConfig.getInstance(this.currentAccount).getClientUserId();
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.g6.d6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.g6.v8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.g6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.g6.t8));
        return arrayList;
    }

    public final void h0() {
        if (this.b == null) {
            return;
        }
        for (int i10 = 0; i10 < this.b.getChildCount(); i10++) {
            View childAt = this.b.getChildAt(i10);
            if ((childAt instanceof org.telegram.ui.Cells.j4) && i10 == 0) {
                AndroidUtilities.shakeViewSpring(((org.telegram.ui.Cells.j4) childAt).getTextView());
            } else if (childAt instanceof ma) {
                AndroidUtilities.shakeViewSpring(childAt);
            } else if (childAt instanceof ha) {
                ha haVar = (ha) childAt;
                AndroidUtilities.shakeViewSpring(haVar.a);
                AndroidUtilities.shakeViewSpring(haVar.b);
            }
        }
        BotWebViewVibrationEffect.APP_ERROR.vibrate();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0067  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i0(int i10, boolean z10, boolean z11) {
        TLRPC.TL_username tL_username;
        int min;
        int i11 = i10 - 4;
        if (i11 >= 0) {
            ArrayList arrayList = this.v;
            if (i11 < arrayList.size() && (tL_username = (TLRPC.TL_username) arrayList.get(i11)) != null) {
                tL_username.active = z10;
                int i12 = -1;
                if (!z10) {
                    int i13 = -1;
                    for (int i14 = 0; i14 < arrayList.size(); i14++) {
                        if (((TLRPC.TL_username) arrayList.get(i14)).active) {
                            i13 = i14;
                        }
                    }
                    if (i13 >= 0) {
                        min = Math.min(arrayList.size() - 1, i13 + 1);
                        i12 = min + 4;
                    }
                    if (this.b != null) {
                    }
                    if (i12 >= 0) {
                        return;
                    } else {
                        return;
                    }
                }
                int i15 = 0;
                while (true) {
                    if (i15 >= arrayList.size()) {
                        i15 = -1;
                        break;
                    } else if (!((TLRPC.TL_username) arrayList.get(i15)).active) {
                        break;
                    } else {
                        i15++;
                    }
                }
                if (i15 >= 0) {
                    min = Math.max(0, i15 - 1);
                    i12 = min + 4;
                }
                if (this.b != null) {
                    int i16 = 0;
                    while (true) {
                        if (i16 >= this.b.getChildCount()) {
                            break;
                        }
                        View childAt = this.b.getChildAt(i16);
                        this.b.getClass();
                        if (RecyclerView.R(childAt) == i10) {
                            if (z11) {
                                AndroidUtilities.shakeView(childAt);
                            }
                            if (childAt instanceof ka) {
                                ka kaVar = (ka) childAt;
                                kaVar.setLoading(this.w.contains(tL_username.username));
                                TLRPC.TL_username tL_username2 = kaVar.v;
                                if (tL_username2 != null) {
                                    kaVar.a(tL_username2, kaVar.w, true, kaVar.x);
                                }
                            }
                        } else {
                            i16++;
                        }
                    }
                }
                if (i12 >= 0 || i10 == i12) {
                    return;
                }
                ea eaVar = this.c;
                int i17 = i12 - 4;
                ArrayList arrayList2 = eaVar.c.v;
                if (i11 >= arrayList2.size() || i17 >= arrayList2.size()) {
                    return;
                }
                arrayList2.add(i17, (TLRPC.TL_username) arrayList2.remove(i11));
                eaVar.p(i10, i12);
                for (int i18 = 0; i18 < arrayList2.size(); i18++) {
                    eaVar.m(i18 + 4);
                }
            }
        }
    }

    public final void j0(TLRPC.TL_username tL_username, boolean z10, boolean z11) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.v;
            if (i10 >= arrayList.size()) {
                return;
            }
            if (arrayList.get(i10) == tL_username) {
                i0(i10 + 4, z10, z11);
                return;
            }
            i10++;
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onResume() {
        super.onResume();
        if (MessagesController.getGlobalMainSettings().getBoolean("view_animations", true)) {
            return;
        }
        e0(false);
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (z10) {
            e0(false);
        }
    }
}
