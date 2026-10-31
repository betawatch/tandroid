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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class pe1 extends org.telegram.ui.Components.sk0 {
    public org.telegram.ui.Wallet.k3 D;
    public final /* synthetic */ WallpapersListActivity E;
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

    public pe1(WallpapersListActivity wallpapersListActivity, Context context) {
        this.E = wallpapersListActivity;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.sk0
    public final boolean D(s4.c1 c1Var) {
        return c1Var.f != 2;
    }

    public final void E(String str, boolean z10) {
        int i10;
        if (str != null && this.n != null) {
            str = a1.g.o(this.n, " ", str, new StringBuilder("#color"));
        }
        org.telegram.ui.Wallet.k3 k3Var = this.D;
        if (k3Var != null) {
            org.telegram.messenger.i0.r(k3Var);
            this.D = null;
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
                i10 = ((org.telegram.ui.ActionBar.k2) wallpapersListActivity).currentAccount;
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
                f();
            } else {
                org.telegram.ui.Wallet.k3 k3Var2 = new org.telegram.ui.Wallet.k3(19, this, str);
                this.D = k3Var2;
                org.telegram.messenger.i0.h3(k3Var2, 500L);
            }
        }
        f();
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
            i18 = ((org.telegram.ui.ActionBar.k2) wallpapersListActivity).currentAccount;
            ConnectionsManager.getInstance(i18).cancelRequest(this.s, true);
            this.s = 0;
        }
        this.y = str;
        i10 = ((org.telegram.ui.ActionBar.k2) wallpapersListActivity).currentAccount;
        org.telegram.messenger.vp r12 = org.telegram.messenger.vp.r1(i10);
        i11 = ((org.telegram.ui.ActionBar.k2) wallpapersListActivity).currentAccount;
        TLObject e22 = r12.e2(org.telegram.messenger.vp.r1(i11).N3);
        if (!(e22 instanceof TLRPC.User)) {
            if (!z10 || this.x) {
                return;
            }
            this.x = true;
            TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
            i16 = ((org.telegram.ui.ActionBar.k2) wallpapersListActivity).currentAccount;
            tL_contacts_resolveUsername.username = org.telegram.messenger.vp.r1(i16).N3;
            i17 = ((org.telegram.ui.ActionBar.k2) wallpapersListActivity).currentAccount;
            ConnectionsManager.getInstance(i17).sendRequest(tL_contacts_resolveUsername, new k(this, 26));
            return;
        }
        TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults = new TLRPC.TL_messages_getInlineBotResults();
        tL_messages_getInlineBotResults.query = sc.e.h("#wallpaper ", str);
        i12 = ((org.telegram.ui.ActionBar.k2) wallpapersListActivity).currentAccount;
        tL_messages_getInlineBotResults.bot = org.telegram.messenger.vp.r1(i12).p1((TLRPC.User) e22);
        tL_messages_getInlineBotResults.offset = str2;
        tL_messages_getInlineBotResults.peer = new TLRPC.TL_inputPeerEmpty();
        int i20 = this.w + 1;
        this.w = i20;
        i13 = ((org.telegram.ui.ActionBar.k2) wallpapersListActivity).currentAccount;
        this.s = ConnectionsManager.getInstance(i13).sendRequest(tL_messages_getInlineBotResults, new org.telegram.messenger.voip.g0(this, i20, 4));
        i14 = ((org.telegram.ui.ActionBar.k2) wallpapersListActivity).currentAccount;
        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i14);
        int i21 = this.s;
        i15 = ((org.telegram.ui.ActionBar.k2) wallpapersListActivity).classGuid;
        connectionsManager.bindRequestToGuid(i21, i15);
    }

    @Override // s4.g0
    public final int b() {
        if (TextUtils.isEmpty(this.h)) {
            return 2;
        }
        return (int) Math.ceil(this.d.size() / this.E.N);
    }

    @Override // s4.g0
    public final int d(int i10) {
        if (TextUtils.isEmpty(this.h)) {
            return i10 == 0 ? 2 : 1;
        }
        return 0;
    }

    @Override // s4.g0
    public final void t(s4.c1 c1Var, int i10) {
        int i11 = c1Var.f;
        View view = c1Var.a;
        if (i11 != 0) {
            if (i11 != 2) {
                return;
            }
            ((org.telegram.ui.Cells.z3) view).setText(org.telegram.messenger.cd.L0(2131745832, null));
            return;
        }
        org.telegram.ui.Cells.ua uaVar = (org.telegram.ui.Cells.ua) view;
        WallpapersListActivity wallpapersListActivity = this.E;
        int i12 = i10 * wallpapersListActivity.N;
        ArrayList arrayList = this.d;
        int ceil = (int) Math.ceil(arrayList.size() / wallpapersListActivity.N);
        int i13 = wallpapersListActivity.N;
        uaVar.d(i13, i12 == 0, i12 / i13 == ceil - 1);
        for (int i14 = 0; i14 < wallpapersListActivity.N; i14++) {
            int i15 = i12 + i14;
            uaVar.e(wallpapersListActivity.r, i15 < arrayList.size() ? arrayList.get(i15) : null, "", i14);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [android.view.View, android.view.ViewGroup, androidx.recyclerview.widget.RecyclerView, org.telegram.ui.Components.tk0, org.telegram.ui.w71] */
    @Override // s4.g0
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        FrameLayout piVar;
        FrameLayout frameLayout;
        Context context = this.c;
        if (i10 != 0) {
            piVar = null;
            if (i10 == 1) {
                ?? w71Var = new w71(11, context, false ? 1 : 0);
                w71Var.setItemAnimator(null);
                w71Var.setLayoutAnimation(null);
                dh.f fVar = new dh.f(19);
                w71Var.setPadding(org.telegram.messenger.i0.L(7.0f), 0, org.telegram.messenger.i0.L(7.0f), 0);
                w71Var.setClipToPadding(false);
                fVar.j1(0);
                w71Var.setLayoutManager(fVar);
                w71Var.setAdapter(new kg.f(this, 8));
                w71Var.setOnItemClickListener(new kz0(this, 13));
                frameLayout = w71Var;
            } else if (i10 == 2) {
                frameLayout = new org.telegram.ui.Cells.z3(context, null);
            }
            piVar = frameLayout;
        } else {
            piVar = new org.telegram.ui.Components.pi(this, context, 2);
            piVar.setTag(-33024);
        }
        if (i10 == 1) {
            piVar.setLayoutParams(new s4.o0(-1, org.telegram.messenger.i0.L(60.0f)));
        } else {
            piVar.setLayoutParams(new s4.o0(-1, -2));
        }
        return new org.telegram.ui.Components.ck0(piVar);
    }
}
