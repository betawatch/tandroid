package org.telegram.ui;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.ColorDrawable;
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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class a60 extends vc {
    public oc v0;
    public float w0;
    public boolean x0;

    public a60(long j10) {
        super(j10);
        this.d = true;
    }

    public static void e1(a60 a60Var, int i10, ChannelBoostsController.CanApplyBoost canApplyBoost) {
        if (canApplyBoost == null || a60Var.getParentActivity() == null) {
            a60Var.x0 = false;
            return;
        }
        z50 z50Var = new z50(a60Var, a60Var, a60Var.getParentActivity(), i10, a60Var.currentAccount, a60Var.resourceProvider);
        z50Var.G1(canApplyBoost);
        z50Var.F1(a60Var.c, true);
        z50Var.H1(a60Var.a);
        z50Var.show();
    }

    @Override // org.telegram.ui.vc
    public final int A0() {
        return R.string.GroupEmojiPackInfo;
    }

    @Override // org.telegram.ui.vc
    public final int B0() {
        return R.string.GroupEmojiPack;
    }

    @Override // org.telegram.ui.vc
    public final int E0() {
        return R.string.GroupEmojiStatusInfo;
    }

    @Override // org.telegram.ui.vc
    public final int F0() {
        return getMessagesController().groupEmojiStatusLevelMin;
    }

    @Override // org.telegram.ui.vc
    public final int G0() {
        return R.string.GroupEmojiStatus;
    }

    @Override // org.telegram.ui.vc
    public final int H0() {
        return getMessagesController().groupEmojiStickersLevelMin;
    }

    @Override // org.telegram.ui.vc
    public final int I0() {
        return 4;
    }

    @Override // org.telegram.ui.vc
    public final int J0() {
        return getMessagesController().groupProfileBgIconLevelMin;
    }

    @Override // org.telegram.ui.vc
    public final int K0() {
        return R.string.GroupProfileInfo;
    }

    @Override // org.telegram.ui.vc
    public final int L0() {
        return R.string.GroupStickerPackInfo;
    }

    @Override // org.telegram.ui.vc
    public final int M0() {
        return R.string.GroupStickerPack;
    }

    @Override // org.telegram.ui.vc
    public final int N0() {
        return R.string.GroupWallpaper2Info;
    }

    @Override // org.telegram.ui.vc
    public final int O0() {
        return getMessagesController().groupWallpaperLevelMin;
    }

    @Override // org.telegram.ui.vc
    public final int P0() {
        return R.string.GroupWallpaper;
    }

    @Override // org.telegram.ui.vc
    public final boolean R0() {
        return ChatObject.isForum(getMessagesController().getChat(Long.valueOf(-this.a)));
    }

    @Override // org.telegram.ui.vc
    public final void T0(int i10) {
        if (this.c == null || this.x0) {
            return;
        }
        this.x0 = true;
        MessagesController.getInstance(this.currentAccount).getBoostsController().userCanBoostChannel(this.a, this.c, new nh.z3(this, i10, 1));
    }

    @Override // org.telegram.ui.vc
    public final void X0(boolean z10) {
        super.X0(z10);
        oc ocVar = this.v0;
        if (ocVar != null) {
            TextView textView = ocVar.d;
            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.c;
            textView.setText(AndroidUtilities.replaceTags(LocaleController.formatPluralString("BoostingGroupBoostCount", tL_premium_boostsStatus != null ? tL_premium_boostsStatus.boosts : 0, new Object[0])));
        }
    }

    @Override // org.telegram.ui.vc
    public final void Z0(boolean z10) {
        super.Z0(z10);
        this.actionBar.setBackgroundColor(0);
        org.telegram.ui.Components.jq jqVar = new org.telegram.ui.Components.jq(new ColorDrawable(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.d6, this.resourceProvider)), org.telegram.ui.ActionBar.g6.V0(getParentActivity(), R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.g6.b7), 0, 0);
        jqVar.w = true;
        this.K.setBackground(jqVar);
        oc ocVar = this.v0;
        if (ocVar == null || z10) {
            return;
        }
        ocVar.a.b(this.currentAccount, this.s, false);
        this.v0.b.b(this.s, false);
        this.v0.e();
    }

    @Override // org.telegram.ui.vc
    public final void c1() {
        hc hcVar;
        hc hcVar2;
        this.V = 0;
        int i10 = 1 + 1;
        this.W = 1;
        this.X = i10;
        int i11 = i10 + 2;
        this.N = i11;
        this.Y = i10 + 1;
        if (this.w != 0 || this.s >= 0) {
            boolean z10 = this.a0 >= 0;
            this.N = i10 + 3;
            this.a0 = i11;
            if (!z10 && (hcVar = this.J) != null) {
                hcVar.o(i11);
                this.J.m(this.Y);
                this.I.u0(0);
            }
        } else {
            int i12 = this.a0;
            this.a0 = -1;
            if (i12 >= 0 && (hcVar2 = this.J) != null) {
                hcVar2.u(i12);
                this.J.m(this.Y);
            }
        }
        int i13 = this.N;
        this.Z = i13;
        this.d0 = i13 + 1;
        this.e0 = i13 + 2;
        this.b0 = i13 + 3;
        this.N = i13 + 5;
        this.c0 = i13 + 4;
        TLRPC.ChatFull chatFull = getMessagesController().getChatFull(-this.a);
        if (chatFull == null || !chatFull.can_set_stickers) {
            this.f0 = -1;
            this.g0 = -1;
        } else {
            int i14 = this.N;
            this.f0 = i14;
            this.N = i14 + 2;
            this.g0 = i14 + 1;
        }
        int i15 = this.N;
        this.O = i15;
        this.S = i15 + 1;
        this.T = i15 + 2;
        this.N = i15 + 4;
        this.U = i15 + 3;
    }

    @Override // org.telegram.ui.vc, org.telegram.ui.ActionBar.o2
    public final View createView(Context context) {
        View createView = super.createView(context);
        Z0(false);
        this.actionBar.setAddToContainer(false);
        this.actionBar.setTitle("");
        ((ViewGroup) createView).addView(this.actionBar);
        createView.getViewTreeObserver().addOnGlobalLayoutListener(new y50(this, (FrameLayout) createView));
        return createView;
    }

    @Override // org.telegram.ui.vc, org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        super.didReceivedNotification(i10, i11, objArr);
        if (i10 == NotificationCenter.chatInfoDidLoad && ((TLRPC.ChatFull) objArr[0]).id == (-this.a)) {
            b1();
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        oc ocVar = this.v0;
        if (ocVar != null) {
            ocVar.a();
        }
    }

    @Override // org.telegram.ui.vc, org.telegram.ui.ActionBar.o2
    public final boolean onFragmentCreate() {
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.chatInfoDidLoad);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.vc, org.telegram.ui.ActionBar.o2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.chatInfoDidLoad);
    }

    @Override // org.telegram.ui.vc
    public final void x0() {
        jh.e1 e1Var = new jh.e1(this, getParentActivity(), this.resourceProvider, 29);
        this.I = e1Var;
        e1Var.setOnScrollListener(new m3(this, 12));
        this.I.setSections(true);
    }

    @Override // org.telegram.ui.vc
    public final int z0() {
        return getMessagesController().groupCustomWallpaperLevelMin;
    }
}
