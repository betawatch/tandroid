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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class bi1 extends org.telegram.ui.Components.vk0 {
    public final /* synthetic */ WallpapersListActivity A;
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
    public ai1 y;

    public bi1(WallpapersListActivity wallpapersListActivity, Context context) {
        this.A = wallpapersListActivity;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.vk0
    public final boolean D(f2.q1 q1Var) {
        return q1Var.f != 2;
    }

    public final void E(String str, boolean z10) {
        int i9;
        if (str != null && this.n != null) {
            str = aa.d.p(this.n, " ", str, new StringBuilder("#color"));
        }
        ai1 ai1Var = this.y;
        if (ai1Var != null) {
            AndroidUtilities.cancelRunOnUIThread(ai1Var);
            this.y = null;
        }
        boolean isEmpty = TextUtils.isEmpty(str);
        HashMap hashMap = this.e;
        ArrayList arrayList = this.d;
        WallpapersListActivity wallpapersListActivity = this.A;
        if (isEmpty) {
            arrayList.clear();
            hashMap.clear();
            this.f = true;
            this.h = null;
            if (this.s != 0) {
                i9 = ((org.telegram.ui.ActionBar.o2) wallpapersListActivity).currentAccount;
                ConnectionsManager.getInstance(i9).cancelRequest(this.s, true);
                this.s = 0;
            }
            wallpapersListActivity.J.c();
        } else {
            wallpapersListActivity.J.b();
            if (z10) {
                arrayList.clear();
                hashMap.clear();
                this.f = true;
                F(str, "", true);
                this.h = str;
                l();
            } else {
                ai1 ai1Var2 = new ai1(0, this, str);
                this.y = ai1Var2;
                AndroidUtilities.runOnUIThread(ai1Var2, 500L);
            }
        }
        l();
    }

    public final void F(String str, String str2, boolean z10) {
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18 = this.s;
        WallpapersListActivity wallpapersListActivity = this.A;
        if (i18 != 0) {
            i17 = ((org.telegram.ui.ActionBar.o2) wallpapersListActivity).currentAccount;
            ConnectionsManager.getInstance(i17).cancelRequest(this.s, true);
            this.s = 0;
        }
        this.x = str;
        i9 = ((org.telegram.ui.ActionBar.o2) wallpapersListActivity).currentAccount;
        MessagesController messagesController = MessagesController.getInstance(i9);
        i10 = ((org.telegram.ui.ActionBar.o2) wallpapersListActivity).currentAccount;
        TLObject userOrChat = messagesController.getUserOrChat(MessagesController.getInstance(i10).imageSearchBot);
        if (!(userOrChat instanceof TLRPC.User)) {
            if (!z10 || this.w) {
                return;
            }
            this.w = true;
            TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
            i15 = ((org.telegram.ui.ActionBar.o2) wallpapersListActivity).currentAccount;
            tL_contacts_resolveUsername.username = MessagesController.getInstance(i15).imageSearchBot;
            i16 = ((org.telegram.ui.ActionBar.o2) wallpapersListActivity).currentAccount;
            ConnectionsManager.getInstance(i16).sendRequest(tL_contacts_resolveUsername, new m(this, 25));
            return;
        }
        TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults = new TLRPC.TL_messages_getInlineBotResults();
        tL_messages_getInlineBotResults.query = ta.b.d("#wallpaper ", str);
        i11 = ((org.telegram.ui.ActionBar.o2) wallpapersListActivity).currentAccount;
        tL_messages_getInlineBotResults.bot = MessagesController.getInstance(i11).getInputUser((TLRPC.User) userOrChat);
        tL_messages_getInlineBotResults.offset = str2;
        tL_messages_getInlineBotResults.peer = new TLRPC.TL_inputPeerEmpty();
        int i19 = this.v + 1;
        this.v = i19;
        i12 = ((org.telegram.ui.ActionBar.o2) wallpapersListActivity).currentAccount;
        this.s = ConnectionsManager.getInstance(i12).sendRequest(tL_messages_getInlineBotResults, new gh.u1(this, i19, 9));
        i13 = ((org.telegram.ui.ActionBar.o2) wallpapersListActivity).currentAccount;
        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i13);
        int i20 = this.s;
        i14 = ((org.telegram.ui.ActionBar.o2) wallpapersListActivity).classGuid;
        connectionsManager.bindRequestToGuid(i20, i14);
    }

    @Override // f2.r0
    public final int h() {
        if (TextUtils.isEmpty(this.h)) {
            return 2;
        }
        return (int) Math.ceil(this.d.size() / this.A.N);
    }

    @Override // f2.r0
    public final int j(int i9) {
        if (TextUtils.isEmpty(this.h)) {
            return i9 == 0 ? 2 : 1;
        }
        return 0;
    }

    @Override // f2.r0
    public final void v(f2.q1 q1Var, int i9) {
        int i10 = q1Var.f;
        View view = q1Var.a;
        if (i10 != 0) {
            if (i10 != 2) {
                return;
            }
            ((org.telegram.ui.Cells.v3) view).setText(LocaleController.getString(R.string.SearchByColor));
            return;
        }
        org.telegram.ui.Cells.za zaVar = (org.telegram.ui.Cells.za) view;
        WallpapersListActivity wallpapersListActivity = this.A;
        int i11 = i9 * wallpapersListActivity.N;
        ArrayList arrayList = this.d;
        int ceil = (int) Math.ceil(arrayList.size() / wallpapersListActivity.N);
        int i12 = wallpapersListActivity.N;
        zaVar.d(i12, i11 == 0, i11 / i12 == ceil - 1);
        for (int i13 = 0; i13 < wallpapersListActivity.N; i13++) {
            int i14 = i11 + i13;
            zaVar.e(wallpapersListActivity.v, i14 < arrayList.size() ? arrayList.get(i14) : null, "", i13);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [android.view.View, android.view.ViewGroup, androidx.recyclerview.widget.RecyclerView, org.telegram.ui.Components.wk0, org.telegram.ui.va1] */
    @Override // f2.r0
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        FrameLayout xiVar;
        FrameLayout frameLayout;
        Context context = this.c;
        if (i9 != 0) {
            xiVar = null;
            boolean z10 = false;
            if (i9 == 1) {
                ?? va1Var = new va1(context, 13, z10 ? 1 : 0);
                va1Var.setItemAnimator(null);
                va1Var.setLayoutAnimation(null);
                of.y yVar = new of.y(19);
                va1Var.setPadding(AndroidUtilities.dp(7.0f), 0, AndroidUtilities.dp(7.0f), 0);
                va1Var.setClipToPadding(false);
                yVar.j1(0);
                va1Var.setLayoutManager(yVar);
                va1Var.setAdapter(new gh.t3(this, 5));
                va1Var.setOnItemClickListener(new c21(this, 12));
                frameLayout = va1Var;
            } else if (i9 == 2) {
                frameLayout = new org.telegram.ui.Cells.v3(context, null);
            }
            xiVar = frameLayout;
        } else {
            xiVar = new org.telegram.ui.Components.xi(this, context, 2);
        }
        if (i9 == 1) {
            xiVar.setLayoutParams(new f2.a1(-1, AndroidUtilities.dp(60.0f)));
        } else {
            xiVar.setLayoutParams(new f2.a1(-1, -2));
        }
        return new org.telegram.ui.Components.ik0(xiVar);
    }
}
