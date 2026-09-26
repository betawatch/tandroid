package org.telegram.ui;

import android.app.Activity;
import android.view.View;
import android.widget.FrameLayout;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class n71 extends org.telegram.ui.Components.bb implements NotificationCenter.NotificationCenterDelegate {
    public final org.telegram.ui.Components.oz X;
    public final ci.d Y;
    public final ai.d9 Z;
    public final HashMap a0;
    public final int b0;
    public int c0;
    public org.telegram.ui.Components.j61 d0;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public n71(org.telegram.ui.ActionBar.m2 m2Var, long j3, int i10, org.telegram.ui.Components.tc tcVar) {
        super(r2, m2Var, new org.telegram.ui.Components.ab(r3));
        Activity parentActivity = m2Var.getParentActivity();
        org.telegram.ui.Components.ab abVar = new org.telegram.ui.Components.ab();
        abVar.a = false;
        abVar.c = false;
        abVar.f = 2;
        abVar.g = m2Var.getResourceProvider();
        this.a0 = new HashMap();
        this.b0 = i10;
        ai.d9 A = MessagesController.getInstance(m2Var.getCurrentAccount()).getStoriesController().A(j3, 1, -1, true);
        this.Z = A;
        A.p(30, false);
        this.K = AndroidUtilities.dp(12.0f);
        fixNavigationBar();
        K();
        FrameLayout frameLayout = new FrameLayout(getContext());
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.h5, this.resourcesProvider));
        int i11 = this.backgroundPaddingLeft;
        frameLayout.setPadding(i11, 0, i11, 0);
        this.containerView.addView(frameLayout, w7.y5.d(-1, -2.0f, 87, 0.0f, 0.0f, 0.0f, 0.0f));
        View view = new View(getContext());
        view.setBackgroundColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.d7, this.resourcesProvider));
        frameLayout.addView(view, w7.y5.a(-1.0f, 1.0f / AndroidUtilities.density, 55));
        ci.d dVar = new ci.d(getContext(), this.resourcesProvider, true);
        this.Y = dVar;
        dVar.g(LocaleController.getString(R.string.StoriesAlbumMenuAddStories), false, true);
        dVar.setEnabled(false);
        dVar.setOnClickListener(new ny0(3, this, tcVar));
        frameLayout.addView(dVar, w7.y5.d(-1, 48.0f, 119, 10.0f, (1.0f / AndroidUtilities.density) + 10.0f, 10.0f, 10.0f));
        getContext();
        org.telegram.ui.Components.oz ozVar = new org.telegram.ui.Components.oz(i10, false);
        this.X = ozVar;
        ozVar.O = new l71(this);
        org.telegram.ui.Components.wl0 wl0Var = this.d;
        int i12 = this.backgroundPaddingLeft;
        wl0Var.setPadding(i12, 0, i12, 0);
        this.d.setSelectorType(9);
        this.d.setSelectorDrawableColor(0);
        this.d.setLayoutManager(ozVar);
        this.d.setOnItemClickListener(new r21(this, 5));
        this.d.setOnItemLongClickListener(new ml0(this, 17));
        this.d.setOnScrollListener(new m71(this));
        this.d0.N(true);
    }

    public final void P() {
        org.telegram.ui.Components.oz ozVar = this.X;
        int L0 = ozVar.L0();
        int abs = L0 == -1 ? 0 : Math.abs(ozVar.N0() - L0) + 1;
        ai.d9 d9Var = this.Z;
        if (d9Var != null) {
            int i10 = L0 + abs;
            int i11 = d9Var.i();
            int i12 = this.b0;
            if (i10 > i11 - i12) {
                d9Var.p(Math.min(100, Math.max(1, i12 / 2) * i12 * i12), false);
            }
        }
    }

    public final boolean Q(int i10, View view) {
        org.telegram.ui.Components.v51 G;
        org.telegram.ui.Components.j61 j61Var = this.d0;
        if (j61Var == null || i10 == 0 || (G = j61Var.G(i10 - 1)) == null) {
            return false;
        }
        Object obj = G.G;
        if (obj instanceof MessageObject) {
            MessageObject messageObject = (MessageObject) obj;
            int id2 = messageObject.getId();
            Integer valueOf = Integer.valueOf(id2);
            HashMap hashMap = this.a0;
            if (hashMap.containsKey(valueOf)) {
                hashMap.remove(Integer.valueOf(id2));
                G.e = false;
                ((org.telegram.ui.Cells.t7) view).i(false, true);
            } else {
                hashMap.put(Integer.valueOf(id2), messageObject.storyItem);
                G.e = true;
                ((org.telegram.ui.Cells.t7) view).i(true, true);
            }
            boolean z10 = !hashMap.isEmpty();
            ci.d dVar = this.Y;
            dVar.setEnabled(z10);
            dVar.b(hashMap.size(), true);
        }
        return true;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.storiesListUpdated && ((ai.d9) objArr[0]) == this.Z) {
            this.d0.N(false);
            P();
        }
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.c0 = this.Z.o();
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.storiesListUpdated);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.Z.z(this.c0);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.storiesListUpdated);
    }

    @Override // org.telegram.ui.Components.bb
    public final org.telegram.ui.Components.vl0 v(org.telegram.ui.Components.wl0 wl0Var) {
        org.telegram.ui.Components.j61 j61Var = new org.telegram.ui.Components.j61(wl0Var, getContext(), this.currentAccount, 0, false, new b5(this, 25), this.resourcesProvider);
        this.d0 = j61Var;
        j61Var.r = false;
        return j61Var;
    }

    @Override // org.telegram.ui.Components.bb
    public final CharSequence y() {
        return LocaleController.getString(R.string.StoriesAlbumMenuAddStories);
    }
}
