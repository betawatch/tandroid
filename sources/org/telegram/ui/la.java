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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class la extends org.telegram.ui.ActionBar.o2 {
    public static final Paint D = new Paint(1);
    public static final Paint E = new Paint(1);
    public static final Paint F = new Paint(1);
    public ia A;
    public ka B;
    public org.telegram.ui.Cells.w1 C;
    public org.telegram.ui.ActionBar.w0 a;
    public org.telegram.ui.Components.jl0 b;
    public ca c;
    public boolean d;
    public int e;
    public String f;
    public org.telegram.ui.ActionBar.c h;
    public boolean n;
    public String r;
    public final ArrayList s;
    public final ArrayList v;
    public final ArrayList w;
    public final long x;
    public fa y;

    public la(Bundle bundle) {
        super(bundle);
        this.r = "";
        this.s = new ArrayList();
        this.v = new ArrayList();
        this.w = new ArrayList();
        if (bundle != null) {
            this.x = bundle.getLong("bot_id");
        }
    }

    public static /* synthetic */ void U(la laVar, org.telegram.ui.ActionBar.c2 c2Var, TLRPC.TL_error tL_error, TL_account.updateUsername updateusername) {
        try {
            c2Var.dismiss();
        } catch (Exception e10) {
            FileLog.e(e10);
        }
        org.telegram.ui.Components.c5.f0(laVar.currentAccount, tL_error, laVar, updateusername, new Object[0]);
        laVar.h0();
    }

    public static /* synthetic */ void W(la laVar, String str) {
        TL_account.checkUsername checkusername = new TL_account.checkUsername();
        checkusername.username = str;
        laVar.e = ConnectionsManager.getInstance(laVar.currentAccount).sendRequest(checkusername, new x9(laVar, str, checkusername, 0), 2);
    }

    public static /* synthetic */ void X(la laVar, org.telegram.ui.ActionBar.c2 c2Var, TLRPC.User user) {
        try {
            c2Var.dismiss();
        } catch (Exception e10) {
            FileLog.e(e10);
        }
        ArrayList<TLRPC.User> arrayList = new ArrayList<>();
        arrayList.add(user);
        MessagesController.getInstance(laVar.currentAccount).putUsers(arrayList, false);
        MessagesStorage.getInstance(laVar.currentAccount).putUsersAndChats(arrayList, null, false, true);
        UserConfig.getInstance(laVar.currentAccount).saveConfig(true);
        laVar.finishFragment();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void Y(la laVar) {
        TL_bots.reorderUsernames reorderusernames;
        long j10 = laVar.x;
        ArrayList arrayList = laVar.v;
        ArrayList arrayList2 = laVar.s;
        if (laVar.d) {
            laVar.d = false;
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
                reorderusernames3.bot = MessagesController.getInstance(laVar.currentAccount).getInputUser(j10);
                reorderusernames3.order = arrayList3;
                reorderusernames = reorderusernames3;
            }
            laVar.getConnectionsManager().sendRequest(reorderusernames, new lh.o5(6));
            ArrayList<TLRPC.TL_username> arrayList4 = new ArrayList<>();
            arrayList4.addAll(arrayList2);
            arrayList4.addAll(arrayList);
            TLRPC.User user = MessagesController.getInstance(laVar.currentAccount).getUser(Long.valueOf(laVar.g0()));
            user.usernames = arrayList4;
            MessagesController.getInstance(laVar.currentAccount).putUser(user, false, true);
        }
    }

    public static void Z(la laVar) {
        if (laVar.x != 0) {
            laVar.finishFragment();
            return;
        }
        int i10 = 1;
        if (laVar.r.startsWith("@")) {
            laVar.r = laVar.r.substring(1);
        }
        if (!laVar.r.isEmpty() && !laVar.d0(laVar.r)) {
            laVar.h0();
            return;
        }
        TLRPC.User f02 = laVar.f0();
        if (laVar.getParentActivity() == null || f02 == null) {
            return;
        }
        String publicUsername = UserObject.getPublicUsername(f02);
        if (publicUsername == null) {
            publicUsername = "";
        }
        if (publicUsername.equals(laVar.r)) {
            laVar.finishFragment();
            return;
        }
        org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2(laVar.getParentActivity(), 3, null);
        TL_account.updateUsername updateusername = new TL_account.updateUsername();
        updateusername.username = laVar.r;
        NotificationCenter.getInstance(laVar.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_NAME));
        int sendRequest = ConnectionsManager.getInstance(laVar.currentAccount).sendRequest(updateusername, new x9(laVar, c2Var, updateusername, i10), 2);
        ConnectionsManager.getInstance(laVar.currentAccount).bindRequestToGuid(sendRequest, laVar.classGuid);
        c2Var.setOnCancelListener(new jh.w(laVar, sendRequest, i10));
        c2Var.show();
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final View createView(Context context) {
        String str;
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.Username));
        this.actionBar.setActionBarMenuOnItemClick(new cg.n1(this, 14));
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
        org.telegram.ui.Components.jl0 jl0Var = new org.telegram.ui.Components.jl0(context, null);
        this.b = jl0Var;
        jl0Var.p1();
        this.actionBar.setAdaptiveBackground(this.b);
        this.fragmentView.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.g6.a7));
        this.b.setLayoutManager(new f2.j0());
        org.telegram.ui.Components.jl0 jl0Var2 = this.b;
        ca caVar = new ca(this);
        this.c = caVar;
        jl0Var2.setAdapter(caVar);
        this.b.setSelectorDrawableColor(getThemedColor(org.telegram.ui.ActionBar.g6.i6));
        new f2.e0(new ga(this)).d(this.b);
        ((FrameLayout) this.fragmentView).addView(this.b, i7.f6.c(-1.0f, -1));
        this.fragmentView.setOnTouchListener(new mh.d(6));
        this.b.setOnItemClickListener(new aa(this));
        AndroidUtilities.runOnUIThread(new it0(this, 19), 40L);
        return this.fragmentView;
    }

    public final boolean d0(String str) {
        if (str != null && str.startsWith("@")) {
            str = str.substring(1);
        }
        org.telegram.ui.Cells.w1 w1Var = this.C;
        if (w1Var != null) {
            w1Var.setVisibility(!TextUtils.isEmpty(str) ? 0 : 8);
            ka kaVar = this.B;
            if (kaVar != null) {
                ka.a(kaVar);
            }
        }
        org.telegram.ui.ActionBar.c cVar = this.h;
        if (cVar != null) {
            AndroidUtilities.cancelRunOnUIThread(cVar);
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
                    ka kaVar2 = this.B;
                    if (kaVar2 != null) {
                        ka.a(kaVar2);
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
                            ka kaVar3 = this.B;
                            if (kaVar3 != null) {
                                ka.a(kaVar3);
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
                            ka kaVar4 = this.B;
                            if (kaVar4 != null) {
                                ka.a(kaVar4);
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
                ka kaVar5 = this.B;
                if (kaVar5 != null) {
                    ka.a(kaVar5);
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
                        ka kaVar6 = this.B;
                        if (kaVar6 != null) {
                            ka.a(kaVar6);
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
                    ka kaVar7 = this.B;
                    if (kaVar7 != null) {
                        ka.a(kaVar7);
                    }
                }
                this.f = str;
                org.telegram.ui.ActionBar.c cVar2 = new org.telegram.ui.ActionBar.c(18, this, str);
                this.h = cVar2;
                AndroidUtilities.runOnUIThread(cVar2, 300L);
                return true;
            }
            org.telegram.ui.Cells.w1 w1Var14 = this.C;
            if (w1Var14 != null) {
                w1Var14.setText(LocaleController.getString(R.string.UsernameInvalidLong));
                org.telegram.ui.Cells.w1 w1Var15 = this.C;
                int i17 = org.telegram.ui.ActionBar.g6.p7;
                w1Var15.setTag(Integer.valueOf(i17));
                this.C.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i17, false));
                ka kaVar8 = this.B;
                if (kaVar8 != null) {
                    ka.a(kaVar8);
                    return false;
                }
            }
        }
        return false;
    }

    public final void e0(boolean z10) {
        fa faVar = this.y;
        if (faVar != null) {
            if (!faVar.a.isFocused()) {
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

    @Override // org.telegram.ui.ActionBar.o2
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
            if ((childAt instanceof org.telegram.ui.Cells.k4) && i10 == 0) {
                AndroidUtilities.shakeViewSpring(((org.telegram.ui.Cells.k4) childAt).getTextView());
            } else if (childAt instanceof ka) {
                AndroidUtilities.shakeViewSpring(childAt);
            } else if (childAt instanceof fa) {
                fa faVar = (fa) childAt;
                AndroidUtilities.shakeViewSpring(faVar.a);
                AndroidUtilities.shakeViewSpring(faVar.b);
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
                            if (childAt instanceof ia) {
                                ia iaVar = (ia) childAt;
                                iaVar.setLoading(this.w.contains(tL_username.username));
                                TLRPC.TL_username tL_username2 = iaVar.v;
                                if (tL_username2 != null) {
                                    iaVar.a(tL_username2, iaVar.w, true, iaVar.x);
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
                ca caVar = this.c;
                int i17 = i12 - 4;
                ArrayList arrayList2 = caVar.c.v;
                if (i11 >= arrayList2.size() || i17 >= arrayList2.size()) {
                    return;
                }
                arrayList2.add(i17, (TLRPC.TL_username) arrayList2.remove(i11));
                caVar.p(i10, i12);
                for (int i18 = 0; i18 < arrayList2.size(); i18++) {
                    caVar.m(i18 + 4);
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

    @Override // org.telegram.ui.ActionBar.o2
    public final void onResume() {
        super.onResume();
        if (MessagesController.getGlobalMainSettings().getBoolean("view_animations", true)) {
            return;
        }
        e0(false);
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (z10) {
            e0(false);
        }
    }
}
