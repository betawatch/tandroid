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

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final class qa extends org.telegram.ui.ActionBar.n2 {
    public static final Paint H = new Paint(1);
    public static final Paint I = new Paint(1);
    public static final Paint J = new Paint(1);
    public na E;
    public pa F;
    public org.telegram.ui.Cells.x1 G;
    public org.telegram.ui.ActionBar.v0 a;
    public org.telegram.ui.Components.ll0 b;
    public ha c;
    public boolean d;
    public int e;
    public String f;
    public org.telegram.ui.ActionBar.c6 h;
    public boolean n;
    public String r;
    public final ArrayList s;
    public final ArrayList v;
    public final ArrayList w;
    public final long x;
    public ka y;

    public qa(Bundle bundle) {
        super(bundle);
        this.r = "";
        this.s = new ArrayList();
        this.v = new ArrayList();
        this.w = new ArrayList();
        if (bundle != null) {
            this.x = bundle.getLong("bot_id");
        }
    }

    public static /* synthetic */ void U(qa qaVar, org.telegram.ui.ActionBar.b2 b2Var, TLRPC.TL_error tL_error, TL_account.updateUsername updateusername) {
        try {
            b2Var.dismiss();
        } catch (Exception e7) {
            FileLog.e(e7);
        }
        org.telegram.ui.Components.e5.f0(qaVar.currentAccount, tL_error, qaVar, updateusername, new Object[0]);
        qaVar.h0();
    }

    public static /* synthetic */ void W(qa qaVar, String str) {
        TL_account.checkUsername checkusername = new TL_account.checkUsername();
        checkusername.username = str;
        qaVar.e = ConnectionsManager.getInstance(qaVar.currentAccount).sendRequest(checkusername, new aa(qaVar, str, checkusername, 0), 2);
    }

    public static /* synthetic */ void X(qa qaVar, org.telegram.ui.ActionBar.b2 b2Var, TLRPC.User user) {
        try {
            b2Var.dismiss();
        } catch (Exception e7) {
            FileLog.e(e7);
        }
        ArrayList<TLRPC.User> arrayList = new ArrayList<>();
        arrayList.add(user);
        MessagesController.getInstance(qaVar.currentAccount).putUsers(arrayList, false);
        MessagesStorage.getInstance(qaVar.currentAccount).putUsersAndChats(arrayList, null, false, true);
        UserConfig.getInstance(qaVar.currentAccount).saveConfig(true);
        qaVar.finishFragment();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void Y(qa qaVar) {
        TL_bots.reorderUsernames reorderusernames;
        long j3 = qaVar.x;
        ArrayList arrayList = qaVar.v;
        ArrayList arrayList2 = qaVar.s;
        if (qaVar.d) {
            qaVar.d = false;
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
            if (j3 == 0) {
                TL_account.reorderUsernames reorderusernames2 = new TL_account.reorderUsernames();
                reorderusernames2.order = arrayList3;
                reorderusernames = reorderusernames2;
            } else {
                TL_bots.reorderUsernames reorderusernames3 = new TL_bots.reorderUsernames();
                reorderusernames3.bot = MessagesController.getInstance(qaVar.currentAccount).getInputUser(j3);
                reorderusernames3.order = arrayList3;
                reorderusernames = reorderusernames3;
            }
            qaVar.getConnectionsManager().sendRequest(reorderusernames, new bi.c7(9));
            ArrayList<TLRPC.TL_username> arrayList4 = new ArrayList<>();
            arrayList4.addAll(arrayList2);
            arrayList4.addAll(arrayList);
            TLRPC.User user = MessagesController.getInstance(qaVar.currentAccount).getUser(Long.valueOf(qaVar.g0()));
            user.usernames = arrayList4;
            MessagesController.getInstance(qaVar.currentAccount).putUser(user, false, true);
        }
    }

    public static void Z(qa qaVar) {
        if (qaVar.x != 0) {
            qaVar.finishFragment();
            return;
        }
        int i10 = 1;
        if (qaVar.r.startsWith("@")) {
            qaVar.r = qaVar.r.substring(1);
        }
        if (!qaVar.r.isEmpty() && !qaVar.d0(qaVar.r)) {
            qaVar.h0();
            return;
        }
        TLRPC.User f02 = qaVar.f0();
        if (qaVar.getParentActivity() == null || f02 == null) {
            return;
        }
        String publicUsername = UserObject.getPublicUsername(f02);
        if (publicUsername == null) {
            publicUsername = "";
        }
        if (publicUsername.equals(qaVar.r)) {
            qaVar.finishFragment();
            return;
        }
        org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(qaVar.getParentActivity(), 3, null);
        TL_account.updateUsername updateusername = new TL_account.updateUsername();
        updateusername.username = qaVar.r;
        NotificationCenter.getInstance(qaVar.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_NAME));
        int sendRequest = ConnectionsManager.getInstance(qaVar.currentAccount).sendRequest(updateusername, new aa(qaVar, b2Var, updateusername, i10), 2);
        ConnectionsManager.getInstance(qaVar.currentAccount).bindRequestToGuid(sendRequest, qaVar.classGuid);
        b2Var.setOnCancelListener(new ba(qaVar, sendRequest, 0));
        b2Var.show();
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final View createView(Context context) {
        String str;
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.Username));
        this.actionBar.setActionBarMenuOnItemClick(new ah.t(this, 28));
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
        org.telegram.ui.Components.ll0 ll0Var = new org.telegram.ui.Components.ll0(context, null);
        this.b = ll0Var;
        ll0Var.o1();
        this.actionBar.setAdaptiveBackground(this.b);
        this.fragmentView.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.j6.a7));
        this.b.setLayoutManager(new s4.c0());
        org.telegram.ui.Components.ll0 ll0Var2 = this.b;
        ha haVar = new ha(this);
        this.c = haVar;
        ll0Var2.setAdapter(haVar);
        this.b.setSelectorDrawableColor(getThemedColor(org.telegram.ui.ActionBar.j6.i6));
        new s4.y(new la(this)).d(this.b);
        ((FrameLayout) this.fragmentView).addView(this.b, w7.x5.c(-1.0f, -1));
        this.fragmentView.setOnTouchListener(new ci.d(6));
        this.b.setOnItemClickListener(new fa(this));
        AndroidUtilities.runOnUIThread(new lu0(this, 19), 40L);
        return this.fragmentView;
    }

    public final boolean d0(String str) {
        if (str != null && str.startsWith("@")) {
            str = str.substring(1);
        }
        org.telegram.ui.Cells.x1 x1Var = this.G;
        if (x1Var != null) {
            x1Var.setVisibility(!TextUtils.isEmpty(str) ? 0 : 8);
            pa paVar = this.F;
            if (paVar != null) {
                pa.a(paVar);
            }
        }
        org.telegram.ui.ActionBar.c6 c6Var = this.h;
        if (c6Var != null) {
            AndroidUtilities.cancelRunOnUIThread(c6Var);
            this.h = null;
            this.f = null;
            if (this.e != 0) {
                ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.e, true);
            }
        }
        if (str != null) {
            if (str.startsWith("_") || str.endsWith("_")) {
                org.telegram.ui.Cells.x1 x1Var2 = this.G;
                if (x1Var2 != null) {
                    x1Var2.setText(LocaleController.getString(R.string.UsernameInvalid));
                    org.telegram.ui.Cells.x1 x1Var3 = this.G;
                    int i10 = org.telegram.ui.ActionBar.j6.p7;
                    x1Var3.setTag(Integer.valueOf(i10));
                    this.G.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i10, false));
                    pa paVar2 = this.F;
                    if (paVar2 != null) {
                        pa.a(paVar2);
                        return false;
                    }
                }
            } else {
                for (int i11 = 0; i11 < str.length(); i11++) {
                    char charAt = str.charAt(i11);
                    if (i11 == 0 && charAt >= '0' && charAt <= '9') {
                        org.telegram.ui.Cells.x1 x1Var4 = this.G;
                        if (x1Var4 != null) {
                            x1Var4.setText(LocaleController.getString(R.string.UsernameInvalidStartNumber));
                            org.telegram.ui.Cells.x1 x1Var5 = this.G;
                            int i12 = org.telegram.ui.ActionBar.j6.p7;
                            x1Var5.setTag(Integer.valueOf(i12));
                            this.G.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i12, false));
                            pa paVar3 = this.F;
                            if (paVar3 != null) {
                                pa.a(paVar3);
                                return false;
                            }
                        }
                    } else if ((charAt < '0' || charAt > '9') && ((charAt < 'a' || charAt > 'z') && ((charAt < 'A' || charAt > 'Z') && charAt != '_'))) {
                        org.telegram.ui.Cells.x1 x1Var6 = this.G;
                        if (x1Var6 != null) {
                            x1Var6.setText(LocaleController.getString(R.string.UsernameInvalid));
                            org.telegram.ui.Cells.x1 x1Var7 = this.G;
                            int i13 = org.telegram.ui.ActionBar.j6.p7;
                            x1Var7.setTag(Integer.valueOf(i13));
                            this.G.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i13, false));
                            pa paVar4 = this.F;
                            if (paVar4 != null) {
                                pa.a(paVar4);
                                return false;
                            }
                        }
                    }
                }
            }
            return false;
        }
        if (str == null || str.length() < 4) {
            org.telegram.ui.Cells.x1 x1Var8 = this.G;
            if (x1Var8 != null) {
                x1Var8.setText(LocaleController.getString(R.string.UsernameInvalidShort));
                org.telegram.ui.Cells.x1 x1Var9 = this.G;
                int i14 = org.telegram.ui.ActionBar.j6.p7;
                x1Var9.setTag(Integer.valueOf(i14));
                this.G.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i14, false));
                pa paVar5 = this.F;
                if (paVar5 != null) {
                    pa.a(paVar5);
                }
            }
        } else {
            if (str.length() <= 32) {
                String str2 = f0().username;
                if (str2 == null) {
                    str2 = "";
                }
                if (str.equals(str2)) {
                    org.telegram.ui.Cells.x1 x1Var10 = this.G;
                    if (x1Var10 != null) {
                        x1Var10.setText(LocaleController.formatString("UsernameAvailable", R.string.UsernameAvailable, str));
                        org.telegram.ui.Cells.x1 x1Var11 = this.G;
                        int i15 = org.telegram.ui.ActionBar.j6.w6;
                        x1Var11.setTag(Integer.valueOf(i15));
                        this.G.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i15, false));
                        pa paVar6 = this.F;
                        if (paVar6 != null) {
                            pa.a(paVar6);
                        }
                    }
                    return true;
                }
                org.telegram.ui.Cells.x1 x1Var12 = this.G;
                if (x1Var12 != null) {
                    x1Var12.setText(LocaleController.getString(R.string.UsernameChecking));
                    org.telegram.ui.Cells.x1 x1Var13 = this.G;
                    int i16 = org.telegram.ui.ActionBar.j6.F6;
                    x1Var13.setTag(Integer.valueOf(i16));
                    this.G.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i16, false));
                    pa paVar7 = this.F;
                    if (paVar7 != null) {
                        pa.a(paVar7);
                    }
                }
                this.f = str;
                org.telegram.ui.ActionBar.c6 c6Var2 = new org.telegram.ui.ActionBar.c6(15, this, str);
                this.h = c6Var2;
                AndroidUtilities.runOnUIThread(c6Var2, 300L);
                return true;
            }
            org.telegram.ui.Cells.x1 x1Var14 = this.G;
            if (x1Var14 != null) {
                x1Var14.setText(LocaleController.getString(R.string.UsernameInvalidLong));
                org.telegram.ui.Cells.x1 x1Var15 = this.G;
                int i17 = org.telegram.ui.ActionBar.j6.p7;
                x1Var15.setTag(Integer.valueOf(i17));
                this.G.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i17, false));
                pa paVar8 = this.F;
                if (paVar8 != null) {
                    pa.a(paVar8);
                    return false;
                }
            }
        }
        return false;
    }

    public final void e0(boolean z10) {
        ka kaVar = this.y;
        if (kaVar != null) {
            if (!kaVar.a.isFocused()) {
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
        long j3 = this.x;
        int i10 = this.currentAccount;
        return j3 != 0 ? MessagesController.getInstance(i10).getUser(Long.valueOf(j3)) : UserConfig.getInstance(i10).getCurrentUser();
    }

    public final long g0() {
        long j3 = this.x;
        return j3 != 0 ? j3 : UserConfig.getInstance(this.currentAccount).getClientUserId();
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.j6.d6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.j6.v8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.j6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.j6.t8));
        return arrayList;
    }

    public final void h0() {
        if (this.b == null) {
            return;
        }
        for (int i10 = 0; i10 < this.b.getChildCount(); i10++) {
            View childAt = this.b.getChildAt(i10);
            if ((childAt instanceof org.telegram.ui.Cells.l4) && i10 == 0) {
                AndroidUtilities.shakeViewSpring(((org.telegram.ui.Cells.l4) childAt).getTextView());
            } else if (childAt instanceof pa) {
                AndroidUtilities.shakeViewSpring(childAt);
            } else if (childAt instanceof ka) {
                ka kaVar = (ka) childAt;
                AndroidUtilities.shakeViewSpring(kaVar.a);
                AndroidUtilities.shakeViewSpring(kaVar.b);
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
                            if (childAt instanceof na) {
                                na naVar = (na) childAt;
                                naVar.setLoading(this.w.contains(tL_username.username));
                                TLRPC.TL_username tL_username2 = naVar.v;
                                if (tL_username2 != null) {
                                    naVar.a(tL_username2, naVar.w, true, naVar.x);
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
                ha haVar = this.c;
                int i17 = i12 - 4;
                ArrayList arrayList2 = haVar.c.v;
                if (i11 >= arrayList2.size() || i17 >= arrayList2.size()) {
                    return;
                }
                arrayList2.add(i17, (TLRPC.TL_username) arrayList2.remove(i11));
                haVar.p(i10, i12);
                for (int i18 = 0; i18 < arrayList2.size(); i18++) {
                    haVar.m(i18 + 4);
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
