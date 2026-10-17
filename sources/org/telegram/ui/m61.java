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

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final class m61 extends org.telegram.ui.Components.bb implements NotificationCenter.NotificationCenterDelegate {
    public final org.telegram.ui.Components.wz X;
    public final ei.d Y;
    public final ci.a7 Z;
    public final HashMap a0;
    public final int b0;
    public int c0;
    public org.telegram.ui.Components.s61 d0;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public m61(org.telegram.ui.ActionBar.n2 n2Var, long j10, int i10, ai.e4 e4Var) {
        super(r2, n2Var, new org.telegram.ui.Components.ab(r3));
        Activity parentActivity = n2Var.getParentActivity();
        org.telegram.ui.Components.ab abVar = new org.telegram.ui.Components.ab();
        abVar.a = false;
        abVar.c = false;
        abVar.f = 2;
        abVar.g = n2Var.getResourceProvider();
        this.a0 = new HashMap();
        this.b0 = i10;
        ci.a7 A = MessagesController.getInstance(n2Var.getCurrentAccount()).getStoriesController().A(j10, 1, -1, true);
        this.Z = A;
        A.p(30, false);
        this.K = AndroidUtilities.dp(12.0f);
        fixNavigationBar();
        L();
        FrameLayout frameLayout = new FrameLayout(getContext());
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.h5, this.resourcesProvider));
        int i11 = this.backgroundPaddingLeft;
        frameLayout.setPadding(i11, 0, i11, 0);
        this.containerView.addView(frameLayout, w7.z5.a(-2.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1, 87));
        View view = new View(getContext());
        view.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.d7, this.resourcesProvider));
        frameLayout.addView(view, w7.z5.b(-1.0f, 1.0f / AndroidUtilities.density, 55));
        ei.d dVar = new ei.d(getContext(), this.resourcesProvider, true);
        this.Y = dVar;
        dVar.g(LocaleController.getString(R.string.StoriesAlbumMenuAddStories), false, true);
        dVar.setEnabled(false);
        dVar.setOnClickListener(new ef0(13, this, e4Var));
        frameLayout.addView(dVar, w7.z5.a(48.0f, 10.0f, (1.0f / AndroidUtilities.density) + 10.0f, 10.0f, 10.0f, -1, 119));
        getContext();
        org.telegram.ui.Components.wz wzVar = new org.telegram.ui.Components.wz(i10, false);
        this.X = wzVar;
        wzVar.O = new k61(this);
        org.telegram.ui.Components.im0 im0Var = this.d;
        int i12 = this.backgroundPaddingLeft;
        im0Var.setPadding(i12, 0, i12, 0);
        this.d.setSelectorType(9);
        this.d.setSelectorDrawableColor(0);
        this.d.setLayoutManager(wzVar);
        this.d.setOnItemClickListener(new h11(this, 5));
        this.d.setOnItemLongClickListener(new qp0(this, 16));
        this.d.setOnScrollListener(new l61(this));
        this.d0.N(true);
    }

    @Override // org.telegram.ui.Components.bb
    public final CharSequence A() {
        return LocaleController.getString(R.string.StoriesAlbumMenuAddStories);
    }

    public final void Q() {
        org.telegram.ui.Components.wz wzVar = this.X;
        int L0 = wzVar.L0();
        int abs = L0 == -1 ? 0 : Math.abs(wzVar.N0() - L0) + 1;
        ci.a7 a7Var = this.Z;
        if (a7Var != null) {
            int i10 = L0 + abs;
            int i11 = a7Var.i();
            int i12 = this.b0;
            if (i10 > i11 - i12) {
                a7Var.p(Math.min(100, Math.max(1, i12 / 2) * i12 * i12), false);
            }
        }
    }

    public final boolean R(int i10, View view) {
        org.telegram.ui.Components.f61 G;
        org.telegram.ui.Components.s61 s61Var = this.d0;
        if (s61Var == null || i10 == 0 || (G = s61Var.G(i10 - 1)) == null) {
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
                ((org.telegram.ui.Cells.s7) view).i(false, true);
            } else {
                hashMap.put(Integer.valueOf(id2), messageObject.storyItem);
                G.e = true;
                ((org.telegram.ui.Cells.s7) view).i(true, true);
            }
            boolean z10 = !hashMap.isEmpty();
            ei.d dVar = this.Y;
            dVar.setEnabled(z10);
            dVar.b(hashMap.size(), true);
        }
        return true;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.storiesListUpdated && ((ci.a7) objArr[0]) == this.Z) {
            this.d0.N(false);
            Q();
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
    public final org.telegram.ui.Components.hm0 x(org.telegram.ui.Components.im0 im0Var) {
        org.telegram.ui.Components.s61 s61Var = new org.telegram.ui.Components.s61(im0Var, getContext(), this.currentAccount, 0, false, new g5(this, 25), this.resourcesProvider);
        this.d0 = s61Var;
        s61Var.r = false;
        return s61Var;
    }
}
