package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class oz extends org.telegram.ui.ActionBar.o2 {
    public long a;
    public TLRPC.Chat b;
    public boolean c;
    public boolean d;
    public lz e;
    public ai.m0 f;

    public final void U() {
        if (!this.d || getParentLayout() == null) {
            return;
        }
        for (org.telegram.ui.ActionBar.o2 o2Var : getParentLayout().getFragmentStack()) {
            if (o2Var instanceof wy) {
                qx qxVar = ((wy) o2Var).F3;
                if (qxVar.c()) {
                    qxVar.a();
                }
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new to(this, 21));
        this.actionBar.setTitle(LocaleController.getString(R.string.TopicsTitle));
        FrameLayout frameLayout = new FrameLayout(context);
        lz lzVar = new lz(this, new b5(this, 13), new gu(this, 7), null);
        this.e = lzVar;
        lzVar.q1();
        this.e.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.a7, this.resourceProvider));
        frameLayout.addView(this.e, w7.x5.e(-1, -1, 119));
        this.actionBar.setAdaptiveBackground(this.e);
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean onFragmentCreate() {
        this.b = getMessagesController().getChat(Long.valueOf(-this.a));
        return super.onFragmentCreate();
    }
}
