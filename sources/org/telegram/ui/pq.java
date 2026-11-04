package org.telegram.ui;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class pq extends org.telegram.ui.Components.h41 {
    public final wa1 e;
    public final long f;
    public final ua1 h;
    public String n;
    public org.telegram.ui.ActionBar.f5 r;
    public boolean s = false;

    public pq(wa1 wa1Var, long j10, ua1 ua1Var) {
        this.e = wa1Var;
        this.f = j10;
        this.h = ua1Var;
        oq oqVar = new oq(this, 0);
        if (wa1Var.c) {
            oqVar.run();
        } else {
            wa1Var.f.add(oqVar);
        }
    }

    @Override // org.telegram.ui.Components.h41
    public final void Z(ArrayList arrayList, org.telegram.ui.Components.f41 f41Var) {
        boolean isEmpty = TextUtils.isEmpty(this.n);
        long j10 = this.f;
        if (isEmpty && j10 != 0) {
            org.telegram.ui.Components.r31 c2 = org.telegram.ui.Components.r31.c(1, R.drawable.msg_archive_hide, org.telegram.messenger.bd.M0(2131751236, null));
            c2.r = true;
            arrayList.add(c2);
            arrayList.add(org.telegram.ui.Components.r31.C(null));
        }
        if (TextUtils.isEmpty(this.n)) {
            arrayList.add(org.telegram.ui.Components.r31.u(org.telegram.messenger.bd.M0(2131751235, null)));
        }
        ArrayList arrayList2 = this.e.e;
        int size = arrayList2.size();
        int i3 = 0;
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList2.get(i10);
            i10++;
            TLRPC.Chat chat = (TLRPC.Chat) obj;
            if (chat != null && !org.telegram.messenger.t3.n0(chat)) {
                i3++;
                if (!TextUtils.isEmpty(this.n)) {
                    String lowerCase = this.n.toLowerCase();
                    String O3 = org.telegram.messenger.g0.O3(lowerCase);
                    String lowerCase2 = chat.title.toLowerCase();
                    String O32 = org.telegram.messenger.g0.O3(lowerCase2);
                    if (!lowerCase2.startsWith(lowerCase) && !k2.p1.z(" ", lowerCase, lowerCase2) && !O32.startsWith(O3) && !O32.contains(" ".concat(O3))) {
                    }
                }
                long j11 = chat.id;
                org.telegram.ui.Components.r31 r31Var = new org.telegram.ui.Components.r31(11);
                r31Var.w = true;
                r31Var.x = -j11;
                r31Var.L(j10 == j11);
                arrayList.add(r31Var);
            }
        }
        if (TextUtils.isEmpty(this.n) && i3 == 0) {
            org.telegram.ui.Components.r31 c10 = org.telegram.ui.Components.r31.c(2, R.drawable.msg_channel_create, org.telegram.messenger.bd.M0(2131751233, null));
            c10.q = true;
            arrayList.add(c10);
        }
        arrayList.add(org.telegram.ui.Components.r31.C(null));
        org.telegram.ui.ActionBar.f5 f5Var = this.r;
        if (f5Var != null) {
            f5Var.setVisibility(i3 > 5 ? 0 : 8);
        }
    }

    @Override // org.telegram.ui.Components.h41
    public final CharSequence a0() {
        return org.telegram.messenger.bd.M0(2131751232, null);
    }

    @Override // org.telegram.ui.Components.h41
    public final void b0(org.telegram.ui.Components.r31 r31Var, View view) {
        int i3 = r31Var.d;
        ua1 ua1Var = this.h;
        if (i3 == 1) {
            ua1Var.a(null);
            finishFragment();
            return;
        }
        if (i3 != 2) {
            if (r31Var.a == 12) {
                finishFragment();
                ua1Var.a(getMessagesController().M0(Long.valueOf(-r31Var.x)));
                return;
            }
            return;
        }
        this.s = true;
        SharedPreferences e12 = org.telegram.messenger.hp.e1();
        boolean z10 = org.telegram.messenger.r2.a;
        presentFragment(new g(0));
        e12.edit().putBoolean("channel_intro", true).apply();
    }

    @Override // org.telegram.ui.Components.h41
    public final boolean c0(org.telegram.ui.Components.r31 r31Var, View view) {
        return false;
    }

    @Override // org.telegram.ui.Components.h41, org.telegram.ui.ActionBar.d2
    public final View createView(Context context) {
        org.telegram.ui.ActionBar.e5 o10 = this.simpleActionBar.o();
        getResourceProvider();
        org.telegram.ui.ActionBar.f5 b10 = o10.b(0, R.drawable.outline_header_search);
        b10.N();
        b10.C0 = new lg.w1(this, 4);
        this.r = b10;
        b10.setSearchFieldHint(org.telegram.messenger.bd.M0(2131745846, null));
        this.r.setContentDescription(org.telegram.messenger.bd.M0(2131745846, null));
        this.r.setVisibility(8);
        setHasOwnBackground(true);
        super.createView(context);
        this.a.r1();
        this.a.setSectionsDrawBackground(true);
        return this.fragmentView;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final org.telegram.ui.Components.tj0 getListViewForSimpleGlass() {
        return this.a;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onResume() {
        super.onResume();
        if (this.s) {
            wa1 wa1Var = this.e;
            wa1Var.c = false;
            wa1Var.f.add(new oq(this, 1));
            this.s = false;
        }
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean useSimpleActionBar() {
        return true;
    }
}
