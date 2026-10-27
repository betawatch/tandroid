package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class gi1 extends org.telegram.ui.Components.mm0 {
    public final /* synthetic */ WallpapersListActivity E;
    public final Context c;
    public final ArrayList d = new ArrayList();
    public final HashMap e = new HashMap();
    public boolean f = true;
    public String h;
    public String n;
    public String r;
    public int s;
    public int v;
    public boolean w;
    public String x;
    public org.telegram.ui.Wallet.a6 y;

    public gi1(WallpapersListActivity wallpapersListActivity, Context context) {
        this.E = wallpapersListActivity;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.mm0
    public final boolean D(s4.e1 e1Var) {
        return e1Var.f != 2;
    }

    public final void E(String str, boolean z10) {
        int i10;
        if (str != null && this.n != null) {
            str = a1.g.q(this.n, " ", str, new StringBuilder("#color"));
        }
        org.telegram.ui.Wallet.a6 a6Var = this.y;
        if (a6Var != null) {
            AndroidUtilities.cancelRunOnUIThread(a6Var);
            this.y = null;
        }
        boolean isEmpty = TextUtils.isEmpty(str);
        HashMap hashMap = this.e;
        ArrayList arrayList = this.d;
        WallpapersListActivity wallpapersListActivity = this.E;
        if (isEmpty) {
            arrayList.clear();
            hashMap.clear();
            this.f = true;
            this.h = null;
            if (this.s != 0) {
                i10 = ((org.telegram.ui.ActionBar.r2) wallpapersListActivity).currentAccount;
                ConnectionsManager.getInstance(i10).cancelRequest(this.s, true);
                this.s = 0;
            }
            wallpapersListActivity.K.c();
        } else {
            wallpapersListActivity.K.b();
            if (z10) {
                arrayList.clear();
                hashMap.clear();
                this.f = true;
                F(str, "", true);
                this.h = str;
                l();
            } else {
                org.telegram.ui.Wallet.a6 a6Var2 = new org.telegram.ui.Wallet.a6(9, this, str);
                this.y = a6Var2;
                AndroidUtilities.runOnUIThread(a6Var2, 500L);
            }
        }
        l();
    }

    public final void F(String str, String str2, boolean z10) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19 = this.s;
        WallpapersListActivity wallpapersListActivity = this.E;
        if (i19 != 0) {
            i18 = ((org.telegram.ui.ActionBar.r2) wallpapersListActivity).currentAccount;
            ConnectionsManager.getInstance(i18).cancelRequest(this.s, true);
            this.s = 0;
        }
        this.x = str;
        i10 = ((org.telegram.ui.ActionBar.r2) wallpapersListActivity).currentAccount;
        MessagesController messagesController = MessagesController.getInstance(i10);
        i11 = ((org.telegram.ui.ActionBar.r2) wallpapersListActivity).currentAccount;
        TLObject userOrChat = messagesController.getUserOrChat(MessagesController.getInstance(i11).imageSearchBot);
        if (!(userOrChat instanceof TLRPC.User)) {
            if (!z10 || this.w) {
                return;
            }
            this.w = true;
            TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
            i16 = ((org.telegram.ui.ActionBar.r2) wallpapersListActivity).currentAccount;
            tL_contacts_resolveUsername.username = MessagesController.getInstance(i16).imageSearchBot;
            i17 = ((org.telegram.ui.ActionBar.r2) wallpapersListActivity).currentAccount;
            ConnectionsManager.getInstance(i17).sendRequest(tL_contacts_resolveUsername, new l(this, 26));
            return;
        }
        TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults = new TLRPC.TL_messages_getInlineBotResults();
        tL_messages_getInlineBotResults.query = org.telegram.ui.Components.b10.j("#wallpaper ", str);
        i12 = ((org.telegram.ui.ActionBar.r2) wallpapersListActivity).currentAccount;
        tL_messages_getInlineBotResults.bot = MessagesController.getInstance(i12).getInputUser((TLRPC.User) userOrChat);
        tL_messages_getInlineBotResults.offset = str2;
        tL_messages_getInlineBotResults.peer = new TLRPC.TL_inputPeerEmpty();
        int i20 = this.v + 1;
        this.v = i20;
        i13 = ((org.telegram.ui.ActionBar.r2) wallpapersListActivity).currentAccount;
        this.s = ConnectionsManager.getInstance(i13).sendRequest(tL_messages_getInlineBotResults, new bi.l2(this, i20, 9));
        i14 = ((org.telegram.ui.ActionBar.r2) wallpapersListActivity).currentAccount;
        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i14);
        int i21 = this.s;
        i15 = ((org.telegram.ui.ActionBar.r2) wallpapersListActivity).classGuid;
        connectionsManager.bindRequestToGuid(i21, i15);
    }

    @Override // s4.h0
    public final int h() {
        if (TextUtils.isEmpty(this.h)) {
            return 2;
        }
        return (int) Math.ceil(this.d.size() / this.E.N);
    }

    @Override // s4.h0
    public final int j(int i10) {
        if (TextUtils.isEmpty(this.h)) {
            return i10 == 0 ? 2 : 1;
        }
        return 0;
    }

    @Override // s4.h0
    public final void v(s4.e1 e1Var, int i10) {
        int i11 = e1Var.f;
        View view = e1Var.a;
        if (i11 != 0) {
            if (i11 != 2) {
                return;
            }
            ((org.telegram.ui.Cells.z3) view).setText(LocaleController.getString(R.string.SearchByColor));
            return;
        }
        org.telegram.ui.Cells.fb fbVar = (org.telegram.ui.Cells.fb) view;
        WallpapersListActivity wallpapersListActivity = this.E;
        int i12 = i10 * wallpapersListActivity.N;
        ArrayList arrayList = this.d;
        int ceil = (int) Math.ceil(arrayList.size() / wallpapersListActivity.N);
        int i13 = wallpapersListActivity.N;
        fbVar.d(i13, i12 == 0, i12 / i13 == ceil - 1);
        for (int i14 = 0; i14 < wallpapersListActivity.N; i14++) {
            int i15 = i12 + i14;
            fbVar.e(wallpapersListActivity.r, i15 < arrayList.size() ? arrayList.get(i15) : null, "", i14);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [android.view.View, android.view.ViewGroup, androidx.recyclerview.widget.RecyclerView, org.telegram.ui.Components.nm0, org.telegram.ui.bb1] */
    @Override // s4.h0
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        FrameLayout hjVar;
        FrameLayout frameLayout;
        Context context = this.c;
        if (i10 != 0) {
            hjVar = null;
            if (i10 == 1) {
                ?? bb1Var = new bb1(context, 13, false ? 1 : 0);
                bb1Var.setItemAnimator(null);
                bb1Var.setLayoutAnimation(null);
                ig.a0 a0Var = new ig.a0(20);
                bb1Var.setPadding(AndroidUtilities.dp(7.0f), 0, AndroidUtilities.dp(7.0f), 0);
                bb1Var.setClipToPadding(false);
                a0Var.k1(0);
                bb1Var.setLayoutManager(a0Var);
                bb1Var.setAdapter(new bi.h5(this, 5));
                bb1Var.setOnItemClickListener(new o11(this, 14));
                frameLayout = bb1Var;
            } else if (i10 == 2) {
                frameLayout = new org.telegram.ui.Cells.z3(context, null);
            }
            hjVar = frameLayout;
        } else {
            hjVar = new org.telegram.ui.Components.hj(this, context, 2);
            hjVar.setTag(-33024);
        }
        if (i10 == 1) {
            hjVar.setLayoutParams(new s4.q0(-1, AndroidUtilities.dp(60.0f)));
        } else {
            hjVar.setLayoutParams(new s4.q0(-1, -2));
        }
        return new org.telegram.ui.Components.wl0(hjVar);
    }
}
