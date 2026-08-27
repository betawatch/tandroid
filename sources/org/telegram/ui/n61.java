package org.telegram.ui;

import android.view.View;
import android.widget.FrameLayout;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class n61 extends org.telegram.ui.Components.qa implements NotificationCenter.NotificationCenterDelegate {
    public final org.telegram.ui.Components.bz T;
    public final lh.d U;
    public final jh.j6 V;
    public final HashMap W;
    public final int X;
    public int Y;
    public org.telegram.ui.Components.b51 Z;

    public n61(org.telegram.ui.ActionBar.n2 n2Var, long j10, int i10, org.telegram.ui.Components.ic icVar) {
        super(n2Var);
        this.W = new HashMap();
        this.X = i10;
        jh.j6 A = MessagesController.getInstance(n2Var.getCurrentAccount()).getStoriesController().A(j10, 1, -1, true);
        this.V = A;
        A.p(30, false);
        this.G = AndroidUtilities.dp(12.0f);
        fixNavigationBar();
        K();
        FrameLayout frameLayout = new FrameLayout(getContext());
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.h5, this.resourcesProvider));
        int i11 = this.backgroundPaddingLeft;
        frameLayout.setPadding(i11, 0, i11, 0);
        this.containerView.addView(frameLayout, h7.z5.d(-1, -2.0f, 87, 0.0f, 0.0f, 0.0f, 0.0f));
        View view = new View(getContext());
        view.setBackgroundColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.d7, this.resourcesProvider));
        frameLayout.addView(view, h7.z5.a(-1.0f, 1.0f / AndroidUtilities.density, 55));
        lh.d dVar = new lh.d(getContext(), this.resourcesProvider, true);
        this.U = dVar;
        dVar.g(LocaleController.getString(R.string.StoriesAlbumMenuAddStories), false, true);
        dVar.setEnabled(false);
        dVar.setOnClickListener(new u70(21, this, icVar));
        frameLayout.addView(dVar, h7.z5.d(-1, 48.0f, 119, 10.0f, (1.0f / AndroidUtilities.density) + 10.0f, 10.0f, 10.0f));
        getContext();
        org.telegram.ui.Components.bz bzVar = new org.telegram.ui.Components.bz(i10, false);
        this.T = bzVar;
        bzVar.O = new l61(this);
        org.telegram.ui.Components.zk0 zk0Var = this.d;
        int i12 = this.backgroundPaddingLeft;
        zk0Var.setPadding(i12, 0, i12, 0);
        this.d.setSelectorType(9);
        this.d.setSelectorDrawableColor(0);
        this.d.setLayoutManager(bzVar);
        this.d.setOnItemClickListener(new b21(this, 3));
        this.d.setOnItemLongClickListener(new dl0(this, 17));
        this.d.setOnScrollListener(new m61(this));
        this.Z.N(true);
    }

    public final void P() {
        org.telegram.ui.Components.bz bzVar = this.T;
        int L0 = bzVar.L0();
        int abs = L0 == -1 ? 0 : Math.abs(bzVar.N0() - L0) + 1;
        jh.j6 j6Var = this.V;
        if (j6Var != null) {
            int i10 = L0 + abs;
            int i11 = j6Var.i();
            int i12 = this.X;
            if (i10 > i11 - i12) {
                j6Var.p(Math.min(100, Math.max(1, i12 / 2) * i12 * i12), false);
            }
        }
    }

    public final boolean Q(int i10, View view) {
        org.telegram.ui.Components.n41 G;
        org.telegram.ui.Components.b51 b51Var = this.Z;
        if (b51Var == null || i10 == 0 || (G = b51Var.G(i10 - 1)) == null) {
            return false;
        }
        Object obj = G.G;
        if (obj instanceof MessageObject) {
            MessageObject messageObject = (MessageObject) obj;
            int id2 = messageObject.getId();
            Integer valueOf = Integer.valueOf(id2);
            HashMap hashMap = this.W;
            if (hashMap.containsKey(valueOf)) {
                hashMap.remove(Integer.valueOf(id2));
                G.e = false;
                ((org.telegram.ui.Cells.o7) view).i(false, true);
            } else {
                hashMap.put(Integer.valueOf(id2), messageObject.storyItem);
                G.e = true;
                ((org.telegram.ui.Cells.o7) view).i(true, true);
            }
            boolean z10 = !hashMap.isEmpty();
            lh.d dVar = this.U;
            dVar.setEnabled(z10);
            dVar.c(hashMap.size(), true);
        }
        return true;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.storiesListUpdated && ((jh.j6) objArr[0]) == this.V) {
            this.Z.N(false);
            P();
        }
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.Y = this.V.o();
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.storiesListUpdated);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.V.z(this.Y);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.storiesListUpdated);
    }

    @Override // org.telegram.ui.Components.qa
    public final org.telegram.ui.Components.yk0 w(org.telegram.ui.Components.zk0 zk0Var) {
        org.telegram.ui.Components.b51 b51Var = new org.telegram.ui.Components.b51(zk0Var, getContext(), this.currentAccount, 0, false, new b5(this, 25), this.resourcesProvider);
        this.Z = b51Var;
        b51Var.r = false;
        return b51Var;
    }

    @Override // org.telegram.ui.Components.qa
    public final CharSequence z() {
        return LocaleController.getString(R.string.StoriesAlbumMenuAddStories);
    }
}
