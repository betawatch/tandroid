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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class o61 extends org.telegram.ui.Components.sa implements NotificationCenter.NotificationCenterDelegate {
    public final org.telegram.ui.Components.zy T;
    public final kh.d U;
    public final ih.n6 V;
    public final HashMap W;
    public final int X;
    public int Y;
    public org.telegram.ui.Components.z41 Z;

    public o61(org.telegram.ui.ActionBar.o2 o2Var, long j10, int i9, org.telegram.ui.Components.kc kcVar) {
        super(o2Var);
        this.W = new HashMap();
        this.X = i9;
        ih.n6 A = MessagesController.getInstance(o2Var.getCurrentAccount()).getStoriesController().A(j10, 1, -1, true);
        this.V = A;
        A.p(30, false);
        this.G = AndroidUtilities.dp(12.0f);
        fixNavigationBar();
        J();
        FrameLayout frameLayout = new FrameLayout(getContext());
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.h5, this.resourcesProvider));
        int i10 = this.backgroundPaddingLeft;
        frameLayout.setPadding(i10, 0, i10, 0);
        this.containerView.addView(frameLayout, g7.e6.d(-1, -2.0f, 87, 0.0f, 0.0f, 0.0f, 0.0f));
        View view = new View(getContext());
        view.setBackgroundColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.d7, this.resourcesProvider));
        frameLayout.addView(view, g7.e6.a(-1.0f, 1.0f / AndroidUtilities.density, 55));
        kh.d dVar = new kh.d(getContext(), this.resourcesProvider, true);
        this.U = dVar;
        dVar.g(LocaleController.getString(R.string.StoriesAlbumMenuAddStories), false, true);
        dVar.setEnabled(false);
        dVar.setOnClickListener(new v80(20, this, kcVar));
        frameLayout.addView(dVar, g7.e6.d(-1, 48.0f, 119, 10.0f, (1.0f / AndroidUtilities.density) + 10.0f, 10.0f, 10.0f));
        getContext();
        org.telegram.ui.Components.zy zyVar = new org.telegram.ui.Components.zy(i9, false);
        this.T = zyVar;
        zyVar.O = new m61(this);
        org.telegram.ui.Components.wk0 wk0Var = this.d;
        int i11 = this.backgroundPaddingLeft;
        wk0Var.setPadding(i11, 0, i11, 0);
        this.d.setSelectorType(9);
        this.d.setSelectorDrawableColor(0);
        this.d.setLayoutManager(zyVar);
        this.d.setOnItemClickListener(new c21(this, 3));
        this.d.setOnItemLongClickListener(new dl0(this, 17));
        this.d.setOnScrollListener(new n61(this));
        this.Z.N(true);
    }

    public final void O() {
        org.telegram.ui.Components.zy zyVar = this.T;
        int L0 = zyVar.L0();
        int abs = L0 == -1 ? 0 : Math.abs(zyVar.N0() - L0) + 1;
        ih.n6 n6Var = this.V;
        if (n6Var != null) {
            int i9 = L0 + abs;
            int i10 = n6Var.i();
            int i11 = this.X;
            if (i9 > i10 - i11) {
                n6Var.p(Math.min(100, Math.max(1, i11 / 2) * i11 * i11), false);
            }
        }
    }

    public final boolean P(int i9, View view) {
        org.telegram.ui.Components.l41 G;
        org.telegram.ui.Components.z41 z41Var = this.Z;
        if (z41Var == null || i9 == 0 || (G = z41Var.G(i9 - 1)) == null) {
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
                ((org.telegram.ui.Cells.r7) view).i(false, true);
            } else {
                hashMap.put(Integer.valueOf(id2), messageObject.storyItem);
                G.e = true;
                ((org.telegram.ui.Cells.r7) view).i(true, true);
            }
            boolean z10 = !hashMap.isEmpty();
            kh.d dVar = this.U;
            dVar.setEnabled(z10);
            dVar.c(hashMap.size(), true);
        }
        return true;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        if (i9 == NotificationCenter.storiesListUpdated && ((ih.n6) objArr[0]) == this.V) {
            this.Z.N(false);
            O();
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

    @Override // org.telegram.ui.Components.sa
    public final org.telegram.ui.Components.vk0 v(org.telegram.ui.Components.wk0 wk0Var) {
        org.telegram.ui.Components.z41 z41Var = new org.telegram.ui.Components.z41(wk0Var, getContext(), this.currentAccount, 0, false, new a5(this, 25), this.resourcesProvider);
        this.Z = z41Var;
        z41Var.r = false;
        return z41Var;
    }

    @Override // org.telegram.ui.Components.sa
    public final CharSequence y() {
        return LocaleController.getString(R.string.StoriesAlbumMenuAddStories);
    }
}
