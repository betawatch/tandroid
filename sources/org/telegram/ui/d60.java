package org.telegram.ui;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class d60 extends bd {
    public float A0;
    public boolean B0;
    public tc z0;

    public d60(long j10) {
        super(j10);
        this.d = true;
    }

    public static void g1(d60 d60Var, int i10, ChannelBoostsController.CanApplyBoost canApplyBoost) {
        if (canApplyBoost == null || d60Var.getParentActivity() == null) {
            d60Var.B0 = false;
            return;
        }
        c60 c60Var = new c60(d60Var, d60Var, d60Var.getParentActivity(), i10, d60Var.currentAccount, d60Var.resourceProvider);
        c60Var.K1(canApplyBoost);
        c60Var.J1(d60Var.c, true);
        c60Var.L1(d60Var.a);
        c60Var.show();
    }

    @Override // org.telegram.ui.bd
    public final int B0() {
        return getMessagesController().groupCustomWallpaperLevelMin;
    }

    @Override // org.telegram.ui.bd
    public final int C0() {
        return R.string.GroupEmojiPackInfo;
    }

    @Override // org.telegram.ui.bd
    public final int D0() {
        return R.string.GroupEmojiPack;
    }

    @Override // org.telegram.ui.bd
    public final int G0() {
        return R.string.GroupEmojiStatusInfo;
    }

    @Override // org.telegram.ui.bd
    public final int H0() {
        return getMessagesController().groupEmojiStatusLevelMin;
    }

    @Override // org.telegram.ui.bd
    public final int I0() {
        return R.string.GroupEmojiStatus;
    }

    @Override // org.telegram.ui.bd
    public final int J0() {
        return getMessagesController().groupEmojiStickersLevelMin;
    }

    @Override // org.telegram.ui.bd
    public final int K0() {
        return 4;
    }

    @Override // org.telegram.ui.bd
    public final int L0() {
        return getMessagesController().groupProfileBgIconLevelMin;
    }

    @Override // org.telegram.ui.bd
    public final int M0() {
        return R.string.GroupProfileInfo;
    }

    @Override // org.telegram.ui.bd
    public final int N0() {
        return R.string.GroupStickerPackInfo;
    }

    @Override // org.telegram.ui.bd
    public final int O0() {
        return R.string.GroupStickerPack;
    }

    @Override // org.telegram.ui.bd
    public final int P0() {
        return R.string.GroupWallpaper2Info;
    }

    @Override // org.telegram.ui.bd
    public final int Q0() {
        return getMessagesController().groupWallpaperLevelMin;
    }

    @Override // org.telegram.ui.bd
    public final int R0() {
        return R.string.GroupWallpaper;
    }

    @Override // org.telegram.ui.bd
    public final boolean T0() {
        return ChatObject.isForum(getMessagesController().getChat(Long.valueOf(-this.a)));
    }

    @Override // org.telegram.ui.bd
    public final void V0(int i10) {
        if (this.c == null || this.B0) {
            return;
        }
        this.B0 = true;
        MessagesController.getInstance(this.currentAccount).getBoostsController().userCanBoostChannel(this.a, this.c, new ei.e4(this, i10, 5));
    }

    @Override // org.telegram.ui.bd
    public final void Z0(boolean z10) {
        super.Z0(z10);
        tc tcVar = this.z0;
        if (tcVar != null) {
            TextView textView = tcVar.d;
            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.c;
            textView.setText(AndroidUtilities.replaceTags(LocaleController.formatPluralString("BoostingGroupBoostCount", tL_premium_boostsStatus != null ? tL_premium_boostsStatus.boosts : 0, new Object[0])));
        }
    }

    @Override // org.telegram.ui.bd
    public final void b1(boolean z10) {
        super.b1(z10);
        this.actionBar.setBackgroundColor(0);
        org.telegram.ui.Components.yq yqVar = new org.telegram.ui.Components.yq(new ColorDrawable(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.d6, this.resourceProvider)), org.telegram.ui.ActionBar.k6.X0(getParentActivity(), R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.k6.b7), 0, 0);
        yqVar.w = true;
        this.O.setBackground(yqVar);
        tc tcVar = this.z0;
        if (tcVar == null || z10) {
            return;
        }
        tcVar.a.b(this.currentAccount, this.s, false);
        this.z0.b.b(this.s, false);
        this.z0.updateColors();
    }

    @Override // org.telegram.ui.bd, org.telegram.ui.ActionBar.o2
    public final View createView(Context context) {
        View createView = super.createView(context);
        b1(false);
        this.actionBar.setAddToContainer(false);
        this.actionBar.setTitle("");
        ((ViewGroup) createView).addView(this.actionBar);
        createView.getViewTreeObserver().addOnGlobalLayoutListener(new b60(this, (FrameLayout) createView));
        return createView;
    }

    @Override // org.telegram.ui.bd, org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        super.didReceivedNotification(i10, i11, objArr);
        if (i10 == NotificationCenter.chatInfoDidLoad && ((TLRPC.ChatFull) objArr[0]).id == (-this.a)) {
            d1();
        }
    }

    @Override // org.telegram.ui.bd
    public final void e1() {
        nc ncVar;
        nc ncVar2;
        this.Z = 0;
        int i10 = 1 + 1;
        this.a0 = 1;
        this.b0 = i10;
        int i11 = i10 + 2;
        this.R = i11;
        this.c0 = i10 + 1;
        if (this.w != 0 || this.s >= 0) {
            boolean z10 = this.e0 >= 0;
            this.R = i10 + 3;
            this.e0 = i11;
            if (!z10 && (ncVar = this.N) != null) {
                ncVar.o(i11);
                this.N.m(this.c0);
                this.M.u0(0);
            }
        } else {
            int i12 = this.e0;
            this.e0 = -1;
            if (i12 >= 0 && (ncVar2 = this.N) != null) {
                ncVar2.u(i12);
                this.N.m(this.c0);
            }
        }
        int i13 = this.R;
        this.d0 = i13;
        this.h0 = i13 + 1;
        this.i0 = i13 + 2;
        this.f0 = i13 + 3;
        this.R = i13 + 5;
        this.g0 = i13 + 4;
        TLRPC.ChatFull chatFull = getMessagesController().getChatFull(-this.a);
        if (chatFull == null || !chatFull.can_set_stickers) {
            this.j0 = -1;
            this.k0 = -1;
        } else {
            int i14 = this.R;
            this.j0 = i14;
            this.R = i14 + 2;
            this.k0 = i14 + 1;
        }
        int i15 = this.R;
        this.S = i15;
        this.W = i15 + 1;
        this.X = i15 + 2;
        this.R = i15 + 4;
        this.Y = i15 + 3;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        tc tcVar = this.z0;
        if (tcVar != null) {
            tcVar.a();
        }
    }

    @Override // org.telegram.ui.bd, org.telegram.ui.ActionBar.o2
    public final boolean onFragmentCreate() {
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.chatInfoDidLoad);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.bd, org.telegram.ui.ActionBar.o2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.chatInfoDidLoad);
    }

    @Override // org.telegram.ui.bd
    public final void x0() {
        w0();
        org.telegram.ui.Components.mm0 mm0Var = this.M;
        if (mm0Var != null) {
            mm0Var.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.k6.a7));
        }
        FrameLayout frameLayout = this.O;
        if (frameLayout == null || !(frameLayout.getBackground() instanceof org.telegram.ui.Components.yq)) {
            return;
        }
        Drawable drawable = ((org.telegram.ui.Components.yq) this.O.getBackground()).a;
        if (drawable instanceof ColorDrawable) {
            ((ColorDrawable) drawable).setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.d6, this.resourceProvider));
            this.O.invalidate();
        }
    }

    @Override // org.telegram.ui.bd
    public final void z0() {
        k10 k10Var = new k10(this, getParentActivity(), this.resourceProvider, 1);
        this.M = k10Var;
        k10Var.setOnScrollListener(new j3(this, 12));
        this.M.setSections(true);
    }
}
