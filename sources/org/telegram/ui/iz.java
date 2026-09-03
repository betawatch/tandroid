package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class iz extends org.telegram.ui.ActionBar.p2 {
    public long a;
    public TLRPC.Chat b;
    public boolean c;
    public boolean d;
    public fz e;
    public eh.w f;

    public final void U() {
        if (!this.d || getParentLayout() == null) {
            return;
        }
        for (org.telegram.ui.ActionBar.p2 p2Var : getParentLayout().getFragmentStack()) {
            if (p2Var instanceof py) {
                kx kxVar = ((py) p2Var).C3;
                if (kxVar.c()) {
                    kxVar.a();
                }
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new org.telegram.ui.Components.y51(this, 8));
        this.actionBar.setTitle(LocaleController.getString(R.string.TopicsTitle));
        FrameLayout frameLayout = new FrameLayout(context);
        fz fzVar = new fz(this, new d5(this, 13), new gu(this, 6), null);
        this.e = fzVar;
        fzVar.o1();
        this.e.setBackgroundColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.a7, this.resourceProvider));
        frameLayout.addView(this.e, k7.c6.e(-1, -1, 119));
        this.actionBar.setAdaptiveBackground(this.e);
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean onFragmentCreate() {
        this.b = getMessagesController().getChat(Long.valueOf(-this.a));
        return super.onFragmentCreate();
    }
}
