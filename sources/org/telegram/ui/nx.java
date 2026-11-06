package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class nx extends org.telegram.ui.ActionBar.f2 {
    public long a;
    public TLRPC.Chat b;
    public boolean c;
    public boolean d;
    public boolean e;
    public kx f;
    public di.b0 h;

    @Override // org.telegram.ui.ActionBar.f2
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.simpleActionBar.setActionBarMenuOnItemClick(new w9(this, 29));
        this.simpleActionBar.setTitle(org.telegram.messenger.hd.M0(2131743982, null));
        FrameLayout frameLayout = new FrameLayout(context);
        kx kxVar = new kx(this, new a5(this, 13), new wr(this, 9), null, 0);
        this.f = kxVar;
        kxVar.r1();
        this.f.setSectionsDrawBackground(true);
        frameLayout.addView(this.f, c8.ha.e(-1, -1, org.telegram.messenger.qs.E1));
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final org.telegram.ui.Components.pj0 getListViewForSimpleGlass() {
        return this.f;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean onFragmentCreate() {
        this.b = getMessagesController().M0(Long.valueOf(-this.a));
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean useSimpleActionBar() {
        return true;
    }
}
