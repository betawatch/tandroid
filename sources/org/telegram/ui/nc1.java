package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class nc1 extends org.telegram.ui.Components.sj0 {
    public hc1 E;
    public final /* synthetic */ WallpapersListActivity F;
    public final Context c;
    public final ArrayList d = new ArrayList();
    public final HashMap e = new HashMap();
    public boolean f = true;
    public String h;
    public String n;
    public String r;
    public int s;
    public int w;
    public boolean x;
    public String y;

    public nc1(WallpapersListActivity wallpapersListActivity, Context context) {
        this.F = wallpapersListActivity;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.sj0
    public final boolean D(u4.d1 d1Var) {
        return d1Var.f != 2;
    }

    public final void E(String str, boolean z10) {
        int i3;
        if (str != null && this.n != null) {
            str = org.telegram.ui.Cells.f1.r(this.n, " ", str, new StringBuilder("#color"));
        }
        hc1 hc1Var = this.E;
        if (hc1Var != null) {
            org.telegram.messenger.g0.r(hc1Var);
            this.E = null;
        }
        boolean isEmpty = TextUtils.isEmpty(str);
        HashMap hashMap = this.e;
        ArrayList arrayList = this.d;
        WallpapersListActivity wallpapersListActivity = this.F;
        if (isEmpty) {
            arrayList.clear();
            hashMap.clear();
            this.f = true;
            this.h = null;
            if (this.s != 0) {
                i3 = ((org.telegram.ui.ActionBar.d2) wallpapersListActivity).currentAccount;
                ConnectionsManager.getInstance(i3).cancelRequest(this.s, true);
                this.s = 0;
            }
            wallpapersListActivity.L.c();
        } else {
            wallpapersListActivity.L.b();
            if (z10) {
                arrayList.clear();
                hashMap.clear();
                this.f = true;
                F(str, "", true);
                this.h = str;
                f();
            } else {
                hc1 hc1Var2 = new hc1(1, this, str);
                this.E = hc1Var2;
                org.telegram.messenger.g0.i3(hc1Var2, 500L);
            }
        }
        f();
    }

    public final void F(String str, String str2, boolean z10) {
        int i3;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18 = this.s;
        WallpapersListActivity wallpapersListActivity = this.F;
        if (i18 != 0) {
            i17 = ((org.telegram.ui.ActionBar.d2) wallpapersListActivity).currentAccount;
            ConnectionsManager.getInstance(i17).cancelRequest(this.s, true);
            this.s = 0;
        }
        this.y = str;
        i3 = ((org.telegram.ui.ActionBar.d2) wallpapersListActivity).currentAccount;
        org.telegram.messenger.hp s12 = org.telegram.messenger.hp.s1(i3);
        i10 = ((org.telegram.ui.ActionBar.d2) wallpapersListActivity).currentAccount;
        TLObject f22 = s12.f2(org.telegram.messenger.hp.s1(i10).M3);
        if (!(f22 instanceof TLRPC.User)) {
            if (!z10 || this.x) {
                return;
            }
            this.x = true;
            TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
            i15 = ((org.telegram.ui.ActionBar.d2) wallpapersListActivity).currentAccount;
            tL_contacts_resolveUsername.username = org.telegram.messenger.hp.s1(i15).M3;
            i16 = ((org.telegram.ui.ActionBar.d2) wallpapersListActivity).currentAccount;
            ConnectionsManager.getInstance(i16).sendRequest(tL_contacts_resolveUsername, new l(this, 26));
            return;
        }
        TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults = new TLRPC.TL_messages_getInlineBotResults();
        tL_messages_getInlineBotResults.query = t4.c.f("#wallpaper ", str);
        i11 = ((org.telegram.ui.ActionBar.d2) wallpapersListActivity).currentAccount;
        tL_messages_getInlineBotResults.bot = org.telegram.messenger.hp.s1(i11).q1((TLRPC.User) f22);
        tL_messages_getInlineBotResults.offset = str2;
        tL_messages_getInlineBotResults.peer = new TLRPC.TL_inputPeerEmpty();
        int i19 = this.w + 1;
        this.w = i19;
        i12 = ((org.telegram.ui.ActionBar.d2) wallpapersListActivity).currentAccount;
        this.s = ConnectionsManager.getInstance(i12).sendRequest(tL_messages_getInlineBotResults, new ci.a2(this, i19, 9));
        i13 = ((org.telegram.ui.ActionBar.d2) wallpapersListActivity).currentAccount;
        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i13);
        int i20 = this.s;
        i14 = ((org.telegram.ui.ActionBar.d2) wallpapersListActivity).classGuid;
        connectionsManager.bindRequestToGuid(i20, i14);
    }

    @Override // u4.h0
    public final int b() {
        if (TextUtils.isEmpty(this.h)) {
            return 2;
        }
        return (int) Math.ceil(this.d.size() / this.F.O);
    }

    @Override // u4.h0
    public final int d(int i3) {
        if (TextUtils.isEmpty(this.h)) {
            return i3 == 0 ? 2 : 1;
        }
        return 0;
    }

    @Override // u4.h0
    public final void t(u4.d1 d1Var, int i3) {
        int i10 = d1Var.f;
        View view = d1Var.a;
        if (i10 != 0) {
            if (i10 != 2) {
                return;
            }
            ((org.telegram.ui.Cells.x3) view).setText(org.telegram.messenger.bd.M0(2131745825, null));
            return;
        }
        org.telegram.ui.Cells.ta taVar = (org.telegram.ui.Cells.ta) view;
        WallpapersListActivity wallpapersListActivity = this.F;
        int i11 = i3 * wallpapersListActivity.O;
        ArrayList arrayList = this.d;
        int ceil = (int) Math.ceil(arrayList.size() / wallpapersListActivity.O);
        int i12 = wallpapersListActivity.O;
        taVar.d(i12, i11 == 0, i11 / i12 == ceil - 1);
        for (int i13 = 0; i13 < wallpapersListActivity.O; i13++) {
            int i14 = i11 + i13;
            taVar.e(wallpapersListActivity.r, i14 < arrayList.size() ? arrayList.get(i14) : null, "", i13);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [android.view.View, android.view.ViewGroup, androidx.recyclerview.widget.RecyclerView, org.telegram.ui.Components.tj0, org.telegram.ui.u51] */
    @Override // u4.h0
    public final u4.d1 x(ViewGroup viewGroup, int i3) {
        FrameLayout piVar;
        FrameLayout frameLayout;
        Context context = this.c;
        if (i3 != 0) {
            piVar = null;
            if (i3 == 1) {
                ?? u51Var = new u51(13, context, false ? 1 : 0);
                u51Var.setItemAnimator(null);
                u51Var.setLayoutAnimation(null);
                kg.y yVar = new kg.y(20);
                u51Var.setPadding(org.telegram.messenger.g0.L(7.0f), 0, org.telegram.messenger.g0.L(7.0f), 0);
                u51Var.setClipToPadding(false);
                yVar.j1(0);
                u51Var.setLayoutManager(yVar);
                u51Var.setAdapter(new ci.r4(this, 8));
                u51Var.setOnItemClickListener(new nx0(this, 13));
                frameLayout = u51Var;
            } else if (i3 == 2) {
                frameLayout = new org.telegram.ui.Cells.x3(context, null);
            }
            piVar = frameLayout;
        } else {
            piVar = new org.telegram.ui.Components.pi(this, context, 2);
            piVar.setTag(-33024);
        }
        if (i3 == 1) {
            piVar.setLayoutParams(new u4.p0(-1, org.telegram.messenger.g0.L(60.0f)));
        } else {
            piVar.setLayoutParams(new u4.p0(-1, -2));
        }
        return new org.telegram.ui.Components.bj0(piVar);
    }
}
