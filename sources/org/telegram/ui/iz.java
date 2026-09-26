package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class iz extends org.telegram.ui.ActionBar.m2 {
    public long a;
    public TLRPC.Chat b;
    public boolean c;
    public boolean d;
    public fz e;
    public ai.m0 f;

    public final void U() {
        if (!this.d || getParentLayout() == null) {
            return;
        }
        for (org.telegram.ui.ActionBar.m2 m2Var : getParentLayout().getFragmentStack()) {
            if (m2Var instanceof qy) {
                kx kxVar = ((qy) m2Var).F3;
                if (kxVar.c()) {
                    kxVar.a();
                }
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new oo(this, 21));
        this.actionBar.setTitle(LocaleController.getString(R.string.TopicsTitle));
        FrameLayout frameLayout = new FrameLayout(context);
        fz fzVar = new fz(this, new b5(this, 13), new du(this, 6), null);
        this.e = fzVar;
        fzVar.p1();
        this.e.setBackgroundColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.a7, this.resourceProvider));
        frameLayout.addView(this.e, w7.y5.e(-1, -1, 119));
        this.actionBar.setAdaptiveBackground(this.e);
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final boolean onFragmentCreate() {
        this.b = getMessagesController().getChat(Long.valueOf(-this.a));
        return super.onFragmentCreate();
    }
}
