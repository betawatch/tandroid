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

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class bj1 extends org.telegram.ui.Components.vl0 {
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
    public p81 y;

    public bj1(WallpapersListActivity wallpapersListActivity, Context context) {
        this.E = wallpapersListActivity;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.vl0
    public final boolean D(s4.c1 c1Var) {
        return c1Var.f != 2;
    }

    public final void E(String str, boolean z10) {
        int i10;
        if (str != null && this.n != null) {
            str = a4.a.r(this.n, " ", str, new StringBuilder("#color"));
        }
        p81 p81Var = this.y;
        if (p81Var != null) {
            AndroidUtilities.cancelRunOnUIThread(p81Var);
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
                i10 = ((org.telegram.ui.ActionBar.m2) wallpapersListActivity).currentAccount;
                ConnectionsManager.getInstance(i10).cancelRequest(this.s, true);
                this.s = 0;
            }
            wallpapersListActivity.N.c();
        } else {
            wallpapersListActivity.N.b();
            if (z10) {
                arrayList.clear();
                hashMap.clear();
                this.f = true;
                F(str, "", true);
                this.h = str;
                l();
            } else {
                p81 p81Var2 = new p81(23, this, str);
                this.y = p81Var2;
                AndroidUtilities.runOnUIThread(p81Var2, 500L);
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
            i18 = ((org.telegram.ui.ActionBar.m2) wallpapersListActivity).currentAccount;
            ConnectionsManager.getInstance(i18).cancelRequest(this.s, true);
            this.s = 0;
        }
        this.x = str;
        i10 = ((org.telegram.ui.ActionBar.m2) wallpapersListActivity).currentAccount;
        MessagesController messagesController = MessagesController.getInstance(i10);
        i11 = ((org.telegram.ui.ActionBar.m2) wallpapersListActivity).currentAccount;
        TLObject userOrChat = messagesController.getUserOrChat(MessagesController.getInstance(i11).imageSearchBot);
        if (!(userOrChat instanceof TLRPC.User)) {
            if (!z10 || this.w) {
                return;
            }
            this.w = true;
            TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
            i16 = ((org.telegram.ui.ActionBar.m2) wallpapersListActivity).currentAccount;
            tL_contacts_resolveUsername.username = MessagesController.getInstance(i16).imageSearchBot;
            i17 = ((org.telegram.ui.ActionBar.m2) wallpapersListActivity).currentAccount;
            ConnectionsManager.getInstance(i17).sendRequest(tL_contacts_resolveUsername, new m(this, 25));
            return;
        }
        TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults = new TLRPC.TL_messages_getInlineBotResults();
        tL_messages_getInlineBotResults.query = v7.j.g("#wallpaper ", str);
        i12 = ((org.telegram.ui.ActionBar.m2) wallpapersListActivity).currentAccount;
        tL_messages_getInlineBotResults.bot = MessagesController.getInstance(i12).getInputUser((TLRPC.User) userOrChat);
        tL_messages_getInlineBotResults.offset = str2;
        tL_messages_getInlineBotResults.peer = new TLRPC.TL_inputPeerEmpty();
        int i20 = this.v + 1;
        this.v = i20;
        i13 = ((org.telegram.ui.ActionBar.m2) wallpapersListActivity).currentAccount;
        this.s = ConnectionsManager.getInstance(i13).sendRequest(tL_messages_getInlineBotResults, new ai.i8(this, i20, 7));
        i14 = ((org.telegram.ui.ActionBar.m2) wallpapersListActivity).currentAccount;
        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i14);
        int i21 = this.s;
        i15 = ((org.telegram.ui.ActionBar.m2) wallpapersListActivity).classGuid;
        connectionsManager.bindRequestToGuid(i21, i15);
    }

    @Override // s4.h0
    public final int h() {
        if (TextUtils.isEmpty(this.h)) {
            return 2;
        }
        return (int) Math.ceil(this.d.size() / this.E.R);
    }

    @Override // s4.h0
    public final int j(int i10) {
        if (TextUtils.isEmpty(this.h)) {
            return i10 == 0 ? 2 : 1;
        }
        return 0;
    }

    @Override // s4.h0
    public final void v(s4.c1 c1Var, int i10) {
        int i11 = c1Var.f;
        View view = c1Var.a;
        if (i11 != 0) {
            if (i11 != 2) {
                return;
            }
            ((org.telegram.ui.Cells.v3) view).setText(LocaleController.getString(R.string.SearchByColor));
            return;
        }
        org.telegram.ui.Cells.eb ebVar = (org.telegram.ui.Cells.eb) view;
        WallpapersListActivity wallpapersListActivity = this.E;
        int i12 = i10 * wallpapersListActivity.R;
        ArrayList arrayList = this.d;
        int ceil = (int) Math.ceil(arrayList.size() / wallpapersListActivity.R);
        int i13 = wallpapersListActivity.R;
        ebVar.d(i13, i12 == 0, i12 / i13 == ceil - 1);
        for (int i14 = 0; i14 < wallpapersListActivity.R; i14++) {
            int i15 = i12 + i14;
            ebVar.e(wallpapersListActivity.v, i15 < arrayList.size() ? arrayList.get(i15) : null, "", i14);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [android.view.View, android.view.ViewGroup, androidx.recyclerview.widget.RecyclerView, org.telegram.ui.Components.wl0, org.telegram.ui.wb1] */
    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        FrameLayout jjVar;
        FrameLayout frameLayout;
        Context context = this.c;
        if (i10 != 0) {
            jjVar = null;
            boolean z10 = false;
            if (i10 == 1) {
                ?? wb1Var = new wb1(context, 13, z10 ? 1 : 0);
                wb1Var.setItemAnimator(null);
                wb1Var.setLayoutAnimation(null);
                gg.b0 b0Var = new gg.b0(20);
                wb1Var.setPadding(AndroidUtilities.dp(7.0f), 0, AndroidUtilities.dp(7.0f), 0);
                wb1Var.setClipToPadding(false);
                b0Var.j1(0);
                wb1Var.setLayoutManager(b0Var);
                wb1Var.setAdapter(new gg.n0(this, 4));
                wb1Var.setOnItemClickListener(new r21(this, 14));
                frameLayout = wb1Var;
            } else if (i10 == 2) {
                frameLayout = new org.telegram.ui.Cells.v3(context, null);
            }
            jjVar = frameLayout;
        } else {
            jjVar = new org.telegram.ui.Components.jj(this, context, 2);
        }
        if (i10 == 1) {
            jjVar.setLayoutParams(new s4.p0(-1, AndroidUtilities.dp(60.0f)));
        } else {
            jjVar.setLayoutParams(new s4.p0(-1, -2));
        }
        return new org.telegram.ui.Components.gl0(jjVar);
    }
}
