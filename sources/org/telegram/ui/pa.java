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

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class pa extends org.telegram.ui.ActionBar.p2 {
    public static final Paint E = new Paint(1);
    public static final Paint F = new Paint(1);
    public static final Paint G = new Paint(1);
    public ma B;
    public oa C;
    public org.telegram.ui.Cells.x1 D;
    public org.telegram.ui.ActionBar.w0 a;
    public org.telegram.ui.Components.tl0 b;
    public ga c;
    public boolean d;
    public int e;
    public String f;
    public org.telegram.messenger.voip.h h;
    public boolean n;
    public String r;
    public final ArrayList s;
    public final ArrayList v;
    public final ArrayList w;
    public final long x;
    public ja y;

    public pa(Bundle bundle) {
        super(bundle);
        this.r = "";
        this.s = new ArrayList();
        this.v = new ArrayList();
        this.w = new ArrayList();
        if (bundle != null) {
            this.x = bundle.getLong("bot_id");
        }
    }

    public static /* synthetic */ void U(pa paVar, org.telegram.ui.ActionBar.d2 d2Var, TLRPC.TL_error tL_error, TL_account.updateUsername updateusername) {
        try {
            d2Var.dismiss();
        } catch (Exception e6) {
            FileLog.e(e6);
        }
        org.telegram.ui.Components.z4.f0(paVar.currentAccount, tL_error, paVar, updateusername, new Object[0]);
        paVar.h0();
    }

    public static /* synthetic */ void W(pa paVar, String str) {
        TL_account.checkUsername checkusername = new TL_account.checkUsername();
        checkusername.username = str;
        paVar.e = ConnectionsManager.getInstance(paVar.currentAccount).sendRequest(checkusername, new ba(paVar, str, checkusername, 0), 2);
    }

    public static /* synthetic */ void X(pa paVar, org.telegram.ui.ActionBar.d2 d2Var, TLRPC.User user) {
        try {
            d2Var.dismiss();
        } catch (Exception e6) {
            FileLog.e(e6);
        }
        ArrayList<TLRPC.User> arrayList = new ArrayList<>();
        arrayList.add(user);
        MessagesController.getInstance(paVar.currentAccount).putUsers(arrayList, false);
        MessagesStorage.getInstance(paVar.currentAccount).putUsersAndChats(arrayList, null, false, true);
        UserConfig.getInstance(paVar.currentAccount).saveConfig(true);
        paVar.finishFragment();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void Y(pa paVar) {
        TL_bots.reorderUsernames reorderusernames;
        long j10 = paVar.x;
        ArrayList arrayList = paVar.v;
        ArrayList arrayList2 = paVar.s;
        if (paVar.d) {
            paVar.d = false;
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
                reorderusernames3.bot = MessagesController.getInstance(paVar.currentAccount).getInputUser(j10);
                reorderusernames3.order = arrayList3;
                reorderusernames = reorderusernames3;
            }
            paVar.getConnectionsManager().sendRequest(reorderusernames, new oh.p5(5));
            ArrayList<TLRPC.TL_username> arrayList4 = new ArrayList<>();
            arrayList4.addAll(arrayList2);
            arrayList4.addAll(arrayList);
            TLRPC.User user = MessagesController.getInstance(paVar.currentAccount).getUser(Long.valueOf(paVar.g0()));
            user.usernames = arrayList4;
            MessagesController.getInstance(paVar.currentAccount).putUser(user, false, true);
        }
    }

    public static void Z(pa paVar) {
        if (paVar.x != 0) {
            paVar.finishFragment();
            return;
        }
        int i10 = 1;
        if (paVar.r.startsWith("@")) {
            paVar.r = paVar.r.substring(1);
        }
        if (!paVar.r.isEmpty() && !paVar.d0(paVar.r)) {
            paVar.h0();
            return;
        }
        TLRPC.User f02 = paVar.f0();
        if (paVar.getParentActivity() == null || f02 == null) {
            return;
        }
        String publicUsername = UserObject.getPublicUsername(f02);
        if (publicUsername == null) {
            publicUsername = "";
        }
        if (publicUsername.equals(paVar.r)) {
            paVar.finishFragment();
            return;
        }
        org.telegram.ui.ActionBar.d2 d2Var = new org.telegram.ui.ActionBar.d2(paVar.getParentActivity(), 3, null);
        TL_account.updateUsername updateusername = new TL_account.updateUsername();
        updateusername.username = paVar.r;
        NotificationCenter.getInstance(paVar.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_NAME));
        int sendRequest = ConnectionsManager.getInstance(paVar.currentAccount).sendRequest(updateusername, new ba(paVar, d2Var, updateusername, i10), 2);
        ConnectionsManager.getInstance(paVar.currentAccount).bindRequestToGuid(sendRequest, paVar.classGuid);
        d2Var.setOnCancelListener(new mh.v(paVar, sendRequest, i10));
        d2Var.show();
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final View createView(Context context) {
        String str;
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.Username));
        this.actionBar.setActionBarMenuOnItemClick(new fg.l1(this, 14));
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
        org.telegram.ui.Components.tl0 tl0Var = new org.telegram.ui.Components.tl0(context, null);
        this.b = tl0Var;
        tl0Var.p1();
        this.actionBar.setAdaptiveBackground(this.b);
        this.fragmentView.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.k6.a7));
        this.b.setLayoutManager(new f2.j0());
        org.telegram.ui.Components.tl0 tl0Var2 = this.b;
        ga gaVar = new ga(this);
        this.c = gaVar;
        tl0Var2.setAdapter(gaVar);
        this.b.setSelectorDrawableColor(getThemedColor(org.telegram.ui.ActionBar.k6.i6));
        new f2.f0(new ka(this)).d(this.b);
        ((FrameLayout) this.fragmentView).addView(this.b, k7.c6.c(-1.0f, -1));
        this.fragmentView.setOnTouchListener(new org.telegram.ui.ActionBar.s2(5));
        this.b.setOnItemClickListener(new ea(this));
        AndroidUtilities.runOnUIThread(new tt0(this, 19), 40L);
        return this.fragmentView;
    }

    public final boolean d0(String str) {
        if (str != null && str.startsWith("@")) {
            str = str.substring(1);
        }
        org.telegram.ui.Cells.x1 x1Var = this.D;
        if (x1Var != null) {
            x1Var.setVisibility(!TextUtils.isEmpty(str) ? 0 : 8);
            oa oaVar = this.C;
            if (oaVar != null) {
                oa.a(oaVar);
            }
        }
        org.telegram.messenger.voip.h hVar = this.h;
        if (hVar != null) {
            AndroidUtilities.cancelRunOnUIThread(hVar);
            this.h = null;
            this.f = null;
            if (this.e != 0) {
                ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.e, true);
            }
        }
        if (str != null) {
            if (str.startsWith("_") || str.endsWith("_")) {
                org.telegram.ui.Cells.x1 x1Var2 = this.D;
                if (x1Var2 != null) {
                    x1Var2.setText(LocaleController.getString(R.string.UsernameInvalid));
                    org.telegram.ui.Cells.x1 x1Var3 = this.D;
                    int i10 = org.telegram.ui.ActionBar.k6.p7;
                    x1Var3.setTag(Integer.valueOf(i10));
                    this.D.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, i10, false));
                    oa oaVar2 = this.C;
                    if (oaVar2 != null) {
                        oa.a(oaVar2);
                        return false;
                    }
                }
            } else {
                for (int i11 = 0; i11 < str.length(); i11++) {
                    char charAt = str.charAt(i11);
                    if (i11 == 0 && charAt >= '0' && charAt <= '9') {
                        org.telegram.ui.Cells.x1 x1Var4 = this.D;
                        if (x1Var4 != null) {
                            x1Var4.setText(LocaleController.getString(R.string.UsernameInvalidStartNumber));
                            org.telegram.ui.Cells.x1 x1Var5 = this.D;
                            int i12 = org.telegram.ui.ActionBar.k6.p7;
                            x1Var5.setTag(Integer.valueOf(i12));
                            this.D.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, i12, false));
                            oa oaVar3 = this.C;
                            if (oaVar3 != null) {
                                oa.a(oaVar3);
                                return false;
                            }
                        }
                    } else if ((charAt < '0' || charAt > '9') && ((charAt < 'a' || charAt > 'z') && ((charAt < 'A' || charAt > 'Z') && charAt != '_'))) {
                        org.telegram.ui.Cells.x1 x1Var6 = this.D;
                        if (x1Var6 != null) {
                            x1Var6.setText(LocaleController.getString(R.string.UsernameInvalid));
                            org.telegram.ui.Cells.x1 x1Var7 = this.D;
                            int i13 = org.telegram.ui.ActionBar.k6.p7;
                            x1Var7.setTag(Integer.valueOf(i13));
                            this.D.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, i13, false));
                            oa oaVar4 = this.C;
                            if (oaVar4 != null) {
                                oa.a(oaVar4);
                                return false;
                            }
                        }
                    }
                }
            }
            return false;
        }
        if (str == null || str.length() < 4) {
            org.telegram.ui.Cells.x1 x1Var8 = this.D;
            if (x1Var8 != null) {
                x1Var8.setText(LocaleController.getString(R.string.UsernameInvalidShort));
                org.telegram.ui.Cells.x1 x1Var9 = this.D;
                int i14 = org.telegram.ui.ActionBar.k6.p7;
                x1Var9.setTag(Integer.valueOf(i14));
                this.D.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, i14, false));
                oa oaVar5 = this.C;
                if (oaVar5 != null) {
                    oa.a(oaVar5);
                }
            }
        } else {
            if (str.length() <= 32) {
                String str2 = f0().username;
                if (str2 == null) {
                    str2 = "";
                }
                if (str.equals(str2)) {
                    org.telegram.ui.Cells.x1 x1Var10 = this.D;
                    if (x1Var10 != null) {
                        x1Var10.setText(LocaleController.formatString("UsernameAvailable", R.string.UsernameAvailable, str));
                        org.telegram.ui.Cells.x1 x1Var11 = this.D;
                        int i15 = org.telegram.ui.ActionBar.k6.w6;
                        x1Var11.setTag(Integer.valueOf(i15));
                        this.D.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, i15, false));
                        oa oaVar6 = this.C;
                        if (oaVar6 != null) {
                            oa.a(oaVar6);
                        }
                    }
                    return true;
                }
                org.telegram.ui.Cells.x1 x1Var12 = this.D;
                if (x1Var12 != null) {
                    x1Var12.setText(LocaleController.getString(R.string.UsernameChecking));
                    org.telegram.ui.Cells.x1 x1Var13 = this.D;
                    int i16 = org.telegram.ui.ActionBar.k6.F6;
                    x1Var13.setTag(Integer.valueOf(i16));
                    this.D.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, i16, false));
                    oa oaVar7 = this.C;
                    if (oaVar7 != null) {
                        oa.a(oaVar7);
                    }
                }
                this.f = str;
                org.telegram.messenger.voip.h hVar2 = new org.telegram.messenger.voip.h(26, this, str);
                this.h = hVar2;
                AndroidUtilities.runOnUIThread(hVar2, 300L);
                return true;
            }
            org.telegram.ui.Cells.x1 x1Var14 = this.D;
            if (x1Var14 != null) {
                x1Var14.setText(LocaleController.getString(R.string.UsernameInvalidLong));
                org.telegram.ui.Cells.x1 x1Var15 = this.D;
                int i17 = org.telegram.ui.ActionBar.k6.p7;
                x1Var15.setTag(Integer.valueOf(i17));
                this.D.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, i17, false));
                oa oaVar8 = this.C;
                if (oaVar8 != null) {
                    oa.a(oaVar8);
                    return false;
                }
            }
        }
        return false;
    }

    public final void e0(boolean z4) {
        ja jaVar = this.y;
        if (jaVar != null) {
            if (!jaVar.a.isFocused()) {
                EditTextBoldCursor editTextBoldCursor = this.y.a;
                editTextBoldCursor.setSelection(editTextBoldCursor.length());
            }
            this.y.a.requestFocus();
            if (z4) {
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

    @Override // org.telegram.ui.ActionBar.p2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.k6.d6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.k6.v8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.k6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.k6.t8));
        return arrayList;
    }

    public final void h0() {
        if (this.b == null) {
            return;
        }
        for (int i10 = 0; i10 < this.b.getChildCount(); i10++) {
            View childAt = this.b.getChildAt(i10);
            if ((childAt instanceof org.telegram.ui.Cells.m4) && i10 == 0) {
                AndroidUtilities.shakeViewSpring(((org.telegram.ui.Cells.m4) childAt).getTextView());
            } else if (childAt instanceof oa) {
                AndroidUtilities.shakeViewSpring(childAt);
            } else if (childAt instanceof ja) {
                ja jaVar = (ja) childAt;
                AndroidUtilities.shakeViewSpring(jaVar.a);
                AndroidUtilities.shakeViewSpring(jaVar.b);
            }
        }
        BotWebViewVibrationEffect.APP_ERROR.vibrate();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0067  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i0(int i10, boolean z4, boolean z10) {
        TLRPC.TL_username tL_username;
        int min;
        int i11 = i10 - 4;
        if (i11 >= 0) {
            ArrayList arrayList = this.v;
            if (i11 < arrayList.size() && (tL_username = (TLRPC.TL_username) arrayList.get(i11)) != null) {
                tL_username.active = z4;
                int i12 = -1;
                if (!z4) {
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
                            if (z10) {
                                AndroidUtilities.shakeView(childAt);
                            }
                            if (childAt instanceof ma) {
                                ma maVar = (ma) childAt;
                                maVar.setLoading(this.w.contains(tL_username.username));
                                TLRPC.TL_username tL_username2 = maVar.v;
                                if (tL_username2 != null) {
                                    maVar.a(tL_username2, maVar.w, true, maVar.x);
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
                ga gaVar = this.c;
                int i17 = i12 - 4;
                ArrayList arrayList2 = gaVar.c.v;
                if (i11 >= arrayList2.size() || i17 >= arrayList2.size()) {
                    return;
                }
                arrayList2.add(i17, (TLRPC.TL_username) arrayList2.remove(i11));
                gaVar.p(i10, i12);
                for (int i18 = 0; i18 < arrayList2.size(); i18++) {
                    gaVar.m(i18 + 4);
                }
            }
        }
    }

    public final void j0(TLRPC.TL_username tL_username, boolean z4, boolean z10) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.v;
            if (i10 >= arrayList.size()) {
                return;
            }
            if (arrayList.get(i10) == tL_username) {
                i0(i10 + 4, z4, z10);
                return;
            }
            i10++;
        }
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onResume() {
        super.onResume();
        if (MessagesController.getGlobalMainSettings().getBoolean("view_animations", true)) {
            return;
        }
        e0(false);
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onTransitionAnimationEnd(boolean z4, boolean z10) {
        if (z4) {
            e0(false);
        }
    }
}
