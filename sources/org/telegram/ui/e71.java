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

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class e71 extends org.telegram.ui.Components.sa implements NotificationCenter.NotificationCenterDelegate {
    public final org.telegram.ui.Components.nz U;
    public final ph.d V;
    public final nh.l6 W;
    public final HashMap X;
    public final int Y;
    public int Z;
    public org.telegram.ui.Components.w51 a0;

    public e71(org.telegram.ui.ActionBar.p2 p2Var, long j10, int i10, org.telegram.ui.Components.lc lcVar) {
        super(p2Var);
        this.X = new HashMap();
        this.Y = i10;
        nh.l6 A = MessagesController.getInstance(p2Var.getCurrentAccount()).getStoriesController().A(j10, 1, -1, true);
        this.W = A;
        A.p(30, false);
        this.H = AndroidUtilities.dp(12.0f);
        fixNavigationBar();
        J();
        FrameLayout frameLayout = new FrameLayout(getContext());
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.h5, this.resourcesProvider));
        int i11 = this.backgroundPaddingLeft;
        frameLayout.setPadding(i11, 0, i11, 0);
        this.containerView.addView(frameLayout, k7.b6.d(-1, -2.0f, 87, 0.0f, 0.0f, 0.0f, 0.0f));
        View view = new View(getContext());
        view.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.d7, this.resourcesProvider));
        frameLayout.addView(view, k7.b6.a(-1.0f, 1.0f / AndroidUtilities.density, 55));
        ph.d dVar = new ph.d(getContext(), this.resourcesProvider, true);
        this.V = dVar;
        dVar.g(LocaleController.getString(R.string.StoriesAlbumMenuAddStories), false, true);
        dVar.setEnabled(false);
        dVar.setOnClickListener(new gb0(18, this, lcVar));
        frameLayout.addView(dVar, k7.b6.d(-1, 48.0f, 119, 10.0f, (1.0f / AndroidUtilities.density) + 10.0f, 10.0f, 10.0f));
        getContext();
        org.telegram.ui.Components.nz nzVar = new org.telegram.ui.Components.nz(i10, false);
        this.U = nzVar;
        nzVar.O = new c71(this);
        org.telegram.ui.Components.sl0 sl0Var = this.d;
        int i12 = this.backgroundPaddingLeft;
        sl0Var.setPadding(i12, 0, i12, 0);
        this.d.setSelectorType(9);
        this.d.setSelectorDrawableColor(0);
        this.d.setLayoutManager(nzVar);
        this.d.setOnItemClickListener(new p21(this, 3));
        this.d.setOnItemLongClickListener(new il0(this, 17));
        this.d.setOnScrollListener(new d71(this));
        this.a0.N(true);
    }

    public final void P() {
        org.telegram.ui.Components.nz nzVar = this.U;
        int L0 = nzVar.L0();
        int abs = L0 == -1 ? 0 : Math.abs(nzVar.N0() - L0) + 1;
        nh.l6 l6Var = this.W;
        if (l6Var != null) {
            int i10 = L0 + abs;
            int i11 = l6Var.i();
            int i12 = this.Y;
            if (i10 > i11 - i12) {
                l6Var.p(Math.min(100, Math.max(1, i12 / 2) * i12 * i12), false);
            }
        }
    }

    public final boolean Q(int i10, View view) {
        org.telegram.ui.Components.i51 G;
        org.telegram.ui.Components.w51 w51Var = this.a0;
        if (w51Var == null || i10 == 0 || (G = w51Var.G(i10 - 1)) == null) {
            return false;
        }
        Object obj = G.G;
        if (obj instanceof MessageObject) {
            MessageObject messageObject = (MessageObject) obj;
            int id2 = messageObject.getId();
            Integer valueOf = Integer.valueOf(id2);
            HashMap hashMap = this.X;
            if (hashMap.containsKey(valueOf)) {
                hashMap.remove(Integer.valueOf(id2));
                G.e = false;
                ((org.telegram.ui.Cells.r7) view).i(false, true);
            } else {
                hashMap.put(Integer.valueOf(id2), messageObject.storyItem);
                G.e = true;
                ((org.telegram.ui.Cells.r7) view).i(true, true);
            }
            boolean z4 = !hashMap.isEmpty();
            ph.d dVar = this.V;
            dVar.setEnabled(z4);
            dVar.c(hashMap.size(), true);
        }
        return true;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.storiesListUpdated && ((nh.l6) objArr[0]) == this.W) {
            this.a0.N(false);
            P();
        }
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.Z = this.W.o();
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.storiesListUpdated);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.W.z(this.Z);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.storiesListUpdated);
    }

    @Override // org.telegram.ui.Components.sa
    public final org.telegram.ui.Components.rl0 v(org.telegram.ui.Components.sl0 sl0Var) {
        org.telegram.ui.Components.w51 w51Var = new org.telegram.ui.Components.w51(sl0Var, getContext(), this.currentAccount, 0, false, new d5(this, 25), this.resourcesProvider);
        this.a0 = w51Var;
        w51Var.r = false;
        return w51Var;
    }

    @Override // org.telegram.ui.Components.sa
    public final CharSequence y() {
        return LocaleController.getString(R.string.StoriesAlbumMenuAddStories);
    }
}
