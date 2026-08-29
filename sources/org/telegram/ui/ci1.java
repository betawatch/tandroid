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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class ci1 extends org.telegram.ui.Components.il0 {
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
    public t31 y;

    public ci1(WallpapersListActivity wallpapersListActivity, Context context) {
        this.A = wallpapersListActivity;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.il0
    public final boolean D(f2.n1 n1Var) {
        return n1Var.f != 2;
    }

    public final void E(String str, boolean z10) {
        int i10;
        if (str != null && this.n != null) {
            str = a4.w.o(this.n, " ", str, new StringBuilder("#color"));
        }
        t31 t31Var = this.y;
        if (t31Var != null) {
            AndroidUtilities.cancelRunOnUIThread(t31Var);
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
                i10 = ((org.telegram.ui.ActionBar.o2) wallpapersListActivity).currentAccount;
                ConnectionsManager.getInstance(i10).cancelRequest(this.s, true);
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
                t31 t31Var2 = new t31(27, this, str);
                this.y = t31Var2;
                AndroidUtilities.runOnUIThread(t31Var2, 500L);
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
        WallpapersListActivity wallpapersListActivity = this.A;
        if (i19 != 0) {
            i18 = ((org.telegram.ui.ActionBar.o2) wallpapersListActivity).currentAccount;
            ConnectionsManager.getInstance(i18).cancelRequest(this.s, true);
            this.s = 0;
        }
        this.x = str;
        i10 = ((org.telegram.ui.ActionBar.o2) wallpapersListActivity).currentAccount;
        MessagesController messagesController = MessagesController.getInstance(i10);
        i11 = ((org.telegram.ui.ActionBar.o2) wallpapersListActivity).currentAccount;
        TLObject userOrChat = messagesController.getUserOrChat(MessagesController.getInstance(i11).imageSearchBot);
        if (!(userOrChat instanceof TLRPC.User)) {
            if (!z10 || this.w) {
                return;
            }
            this.w = true;
            TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
            i16 = ((org.telegram.ui.ActionBar.o2) wallpapersListActivity).currentAccount;
            tL_contacts_resolveUsername.username = MessagesController.getInstance(i16).imageSearchBot;
            i17 = ((org.telegram.ui.ActionBar.o2) wallpapersListActivity).currentAccount;
            ConnectionsManager.getInstance(i17).sendRequest(tL_contacts_resolveUsername, new o(this, 25));
            return;
        }
        TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults = new TLRPC.TL_messages_getInlineBotResults();
        tL_messages_getInlineBotResults.query = u3.c.e("#wallpaper ", str);
        i12 = ((org.telegram.ui.ActionBar.o2) wallpapersListActivity).currentAccount;
        tL_messages_getInlineBotResults.bot = MessagesController.getInstance(i12).getInputUser((TLRPC.User) userOrChat);
        tL_messages_getInlineBotResults.offset = str2;
        tL_messages_getInlineBotResults.peer = new TLRPC.TL_inputPeerEmpty();
        int i20 = this.v + 1;
        this.v = i20;
        i13 = ((org.telegram.ui.ActionBar.o2) wallpapersListActivity).currentAccount;
        this.s = ConnectionsManager.getInstance(i13).sendRequest(tL_messages_getInlineBotResults, new jh.s1(this, i20, 8));
        i14 = ((org.telegram.ui.ActionBar.o2) wallpapersListActivity).currentAccount;
        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i14);
        int i21 = this.s;
        i15 = ((org.telegram.ui.ActionBar.o2) wallpapersListActivity).classGuid;
        connectionsManager.bindRequestToGuid(i21, i15);
    }

    @Override // f2.p0
    public final int h() {
        if (TextUtils.isEmpty(this.h)) {
            return 2;
        }
        return (int) Math.ceil(this.d.size() / this.A.N);
    }

    @Override // f2.p0
    public final int j(int i10) {
        if (TextUtils.isEmpty(this.h)) {
            return i10 == 0 ? 2 : 1;
        }
        return 0;
    }

    @Override // f2.p0
    public final void v(f2.n1 n1Var, int i10) {
        int i11 = n1Var.f;
        View view = n1Var.a;
        if (i11 != 0) {
            if (i11 != 2) {
                return;
            }
            ((org.telegram.ui.Cells.s3) view).setText(LocaleController.getString(R.string.SearchByColor));
            return;
        }
        org.telegram.ui.Cells.wa waVar = (org.telegram.ui.Cells.wa) view;
        WallpapersListActivity wallpapersListActivity = this.A;
        int i12 = i10 * wallpapersListActivity.N;
        ArrayList arrayList = this.d;
        int ceil = (int) Math.ceil(arrayList.size() / wallpapersListActivity.N);
        int i13 = wallpapersListActivity.N;
        waVar.d(i13, i12 == 0, i12 / i13 == ceil - 1);
        for (int i14 = 0; i14 < wallpapersListActivity.N; i14++) {
            int i15 = i12 + i14;
            waVar.e(wallpapersListActivity.v, i15 < arrayList.size() ? arrayList.get(i15) : null, "", i14);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [android.view.View, android.view.ViewGroup, androidx.recyclerview.widget.RecyclerView, org.telegram.ui.Components.jl0, org.telegram.ui.wa1] */
    @Override // f2.p0
    public final f2.n1 x(ViewGroup viewGroup, int i10) {
        FrameLayout ajVar;
        FrameLayout frameLayout;
        Context context = this.c;
        if (i10 != 0) {
            ajVar = null;
            boolean z10 = false;
            if (i10 == 1) {
                ?? wa1Var = new wa1(context, 12, z10 ? 1 : 0);
                wa1Var.setItemAnimator(null);
                wa1Var.setLayoutAnimation(null);
                k kVar = new k(18);
                wa1Var.setPadding(AndroidUtilities.dp(7.0f), 0, AndroidUtilities.dp(7.0f), 0);
                wa1Var.setClipToPadding(false);
                kVar.j1(0);
                wa1Var.setLayoutManager(kVar);
                wa1Var.setAdapter(new cg.g(this, 5));
                wa1Var.setOnItemClickListener(new d21(this, 12));
                frameLayout = wa1Var;
            } else if (i10 == 2) {
                frameLayout = new org.telegram.ui.Cells.s3(context, null);
            }
            ajVar = frameLayout;
        } else {
            ajVar = new org.telegram.ui.Components.aj(this, context, 2);
        }
        if (i10 == 1) {
            ajVar.setLayoutParams(new f2.x0(-1, AndroidUtilities.dp(60.0f)));
        } else {
            ajVar.setLayoutParams(new f2.x0(-1, -2));
        }
        return new org.telegram.ui.Components.vk0(ajVar);
    }
}
