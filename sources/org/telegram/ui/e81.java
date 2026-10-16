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

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class e81 extends org.telegram.ui.Components.db implements NotificationCenter.NotificationCenterDelegate {
    public final org.telegram.ui.Components.zz X;
    public final di.d Y;
    public final bi.o8 Z;
    public final HashMap a0;
    public final int b0;
    public int c0;
    public org.telegram.ui.Components.a71 d0;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public e81(org.telegram.ui.ActionBar.m2 m2Var, long j10, int i10, org.telegram.ui.Components.vc vcVar) {
        super(r2, m2Var, new org.telegram.ui.Components.cb(r3));
        Activity parentActivity = m2Var.getParentActivity();
        org.telegram.ui.Components.cb cbVar = new org.telegram.ui.Components.cb();
        cbVar.a = false;
        cbVar.c = false;
        cbVar.f = 2;
        cbVar.g = m2Var.getResourceProvider();
        this.a0 = new HashMap();
        this.b0 = i10;
        bi.o8 A = MessagesController.getInstance(m2Var.getCurrentAccount()).getStoriesController().A(j10, 1, -1, true);
        this.Z = A;
        A.p(30, false);
        this.K = AndroidUtilities.dp(12.0f);
        fixNavigationBar();
        L();
        FrameLayout frameLayout = new FrameLayout(getContext());
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.h5, this.resourcesProvider));
        int i11 = this.backgroundPaddingLeft;
        frameLayout.setPadding(i11, 0, i11, 0);
        this.containerView.addView(frameLayout, w7.z5.a(-2.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1, 87));
        View view = new View(getContext());
        view.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.d7, this.resourcesProvider));
        frameLayout.addView(view, w7.z5.b(-1.0f, 1.0f / AndroidUtilities.density, 55));
        di.d dVar = new di.d(getContext(), this.resourcesProvider, true);
        this.Y = dVar;
        dVar.g(LocaleController.getString(R.string.StoriesAlbumMenuAddStories), false, true);
        dVar.setEnabled(false);
        dVar.setOnClickListener(new bz0(3, this, vcVar));
        frameLayout.addView(dVar, w7.z5.a(48.0f, 10.0f, (1.0f / AndroidUtilities.density) + 10.0f, 10.0f, 10.0f, -1, 119));
        getContext();
        org.telegram.ui.Components.zz zzVar = new org.telegram.ui.Components.zz(i10, false);
        this.X = zzVar;
        zzVar.O = new c81(this);
        org.telegram.ui.Components.mm0 mm0Var = this.d;
        int i12 = this.backgroundPaddingLeft;
        mm0Var.setPadding(i12, 0, i12, 0);
        this.d.setSelectorType(9);
        this.d.setSelectorDrawableColor(0);
        this.d.setLayoutManager(zzVar);
        this.d.setOnItemClickListener(new i21(this, 6));
        this.d.setOnItemLongClickListener(new lq0(this, 16));
        this.d.setOnScrollListener(new d81(this));
        this.d0.N(true);
    }

    @Override // org.telegram.ui.Components.db
    public final CharSequence B() {
        return LocaleController.getString(R.string.StoriesAlbumMenuAddStories);
    }

    public final void Q() {
        org.telegram.ui.Components.zz zzVar = this.X;
        int L0 = zzVar.L0();
        int abs = L0 == -1 ? 0 : Math.abs(zzVar.N0() - L0) + 1;
        bi.o8 o8Var = this.Z;
        if (o8Var != null) {
            int i10 = L0 + abs;
            int i11 = o8Var.i();
            int i12 = this.b0;
            if (i10 > i11 - i12) {
                o8Var.p(Math.min(100, Math.max(1, i12 / 2) * i12 * i12), false);
            }
        }
    }

    public final boolean R(int i10, View view) {
        org.telegram.ui.Components.m61 G;
        org.telegram.ui.Components.a71 a71Var = this.d0;
        if (a71Var == null || i10 == 0 || (G = a71Var.G(i10 - 1)) == null) {
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
            di.d dVar = this.Y;
            dVar.setEnabled(z10);
            dVar.b(hashMap.size(), true);
        }
        return true;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.storiesListUpdated && ((bi.o8) objArr[0]) == this.Z) {
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

    @Override // org.telegram.ui.Components.db
    public final org.telegram.ui.Components.lm0 x(org.telegram.ui.Components.mm0 mm0Var) {
        org.telegram.ui.Components.a71 a71Var = new org.telegram.ui.Components.a71(mm0Var, getContext(), this.currentAccount, 0, false, new f5(this, 25), this.resourcesProvider);
        this.d0 = a71Var;
        a71Var.r = false;
        return a71Var;
    }
}
