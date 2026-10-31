package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class e60 extends org.telegram.ui.ActionBar.k2 implements org.telegram.messenger.us {
    public d60 a;
    public org.telegram.ui.Components.tk0 b;
    public org.telegram.ui.Components.xy c;
    public long d;
    public boolean e;
    public TLRPC.TL_chatInviteExported f;
    public int h;
    public int n;
    public int r;
    public int s;
    public int w;
    public int x;

    public final void Y(boolean z10) {
        this.e = true;
        TLRPC.TL_messages_exportChatInvite tL_messages_exportChatInvite = new TLRPC.TL_messages_exportChatInvite();
        tL_messages_exportChatInvite.peer = getMessagesController().i1(-this.d);
        ConnectionsManager.getInstance(this.currentAccount).bindRequestToGuid(ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_exportChatInvite, new org.telegram.messenger.voip.u0(6, this, z10)), this.classGuid);
        d60 d60Var = this.a;
        if (d60Var != null) {
            d60Var.f();
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.s8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.d6));
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.simpleActionBar.setTitle(org.telegram.messenger.cd.L0(2131749159, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new ar(this, 27));
        this.a = new d60(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.xy xyVar = new org.telegram.ui.Components.xy(context, null);
        this.c = xyVar;
        xyVar.b();
        org.telegram.ui.Components.tk0 tk0Var = new org.telegram.ui.Components.tk0(context, null);
        this.b = tk0Var;
        tk0Var.r1();
        this.b.setSectionsDrawBackground(true);
        this.b.setLayoutManager(new s4.a0(1, false));
        this.b.setEmptyView(this.c);
        this.b.setVerticalScrollBarEnabled(false);
        frameLayout.addView(this.b, w7.b6.e(-1, -1, 51));
        frameLayout.addView(this.c, w7.b6.e(-1, -1, 51));
        this.b.setAdapter(this.a);
        this.b.setOnItemClickListener(new g(this, 13));
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.us
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        long j10 = this.d;
        if (i10 == org.telegram.messenger.zs.T) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            int intValue = ((Integer) objArr[1]).intValue();
            if (chatFull.id == j10 && intValue == this.classGuid) {
                TLRPC.TL_chatInviteExported tL_chatInviteExported = (TLRPC.TL_chatInviteExported) getMessagesController().r.f(j10);
                this.f = tL_chatInviteExported;
                if (tL_chatInviteExported == null) {
                    Y(false);
                    return;
                }
                this.e = false;
                d60 d60Var = this.a;
                if (d60Var != null) {
                    d60Var.f();
                }
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final org.telegram.ui.Components.tk0 getListViewForSimpleGlass() {
        return this.b;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.c, 2048, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.h6));
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        org.telegram.messenger.zs.f(this.currentAccount).c(this, org.telegram.messenger.zs.T);
        getMessagesController().T2(this.classGuid, this.d, true);
        this.e = true;
        this.h = 1;
        this.n = 2;
        this.r = 3;
        this.s = 4;
        this.x = 6;
        this.w = 5;
        return true;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        org.telegram.messenger.zs.f(this.currentAccount).n(this, org.telegram.messenger.zs.T);
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onResume() {
        super.onResume();
        d60 d60Var = this.a;
        if (d60Var != null) {
            d60Var.f();
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onThemeColorsChanged() {
        super.onThemeColorsChanged();
        try {
            org.telegram.ui.Components.xy xyVar = this.c;
            if (xyVar != null) {
                xyVar.setProgressBarColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.h6, false));
            }
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean useSimpleActionBar() {
        return true;
    }
}
