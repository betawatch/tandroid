package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class ox extends org.telegram.ui.ActionBar.e2 {
    public long a;
    public TLRPC.Chat b;
    public boolean c;
    public boolean d;
    public boolean e;
    public bi.y4 f;
    public fi.b0 h;

    @Override // org.telegram.ui.ActionBar.e2
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.simpleActionBar.setActionBarMenuOnItemClick(new lx(this, 0));
        this.simpleActionBar.setTitle(org.telegram.messenger.hd.M0(2131743981, null));
        FrameLayout frameLayout = new FrameLayout(context);
        bi.y4 y4Var = new bi.y4(this, new a5(this, 13), new zr(this, 9), null, 7);
        this.f = y4Var;
        y4Var.r1();
        this.f.setSectionsDrawBackground(true);
        frameLayout.addView(this.f, c8.ja.e(-1, -1, org.telegram.messenger.ns.E1));
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final org.telegram.ui.Components.uj0 getListViewForSimpleGlass() {
        return this.f;
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final boolean onFragmentCreate() {
        this.b = getMessagesController().M0(Long.valueOf(-this.a));
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final boolean useSimpleActionBar() {
        return true;
    }
}
