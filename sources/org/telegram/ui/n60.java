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

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class n60 extends bd {
    public uc w0;
    public float x0;
    public boolean y0;

    public n60(long j10) {
        super(j10);
        this.d = true;
    }

    public static void e1(n60 n60Var, int i10, ChannelBoostsController.CanApplyBoost canApplyBoost) {
        if (canApplyBoost == null || n60Var.getParentActivity() == null) {
            n60Var.y0 = false;
            return;
        }
        m60 m60Var = new m60(n60Var, n60Var, n60Var.getParentActivity(), i10, n60Var.currentAccount, n60Var.resourceProvider);
        m60Var.G1(canApplyBoost);
        m60Var.F1(n60Var.c, true);
        m60Var.H1(n60Var.a);
        m60Var.show();
    }

    @Override // org.telegram.ui.bd
    public final int A0() {
        return R.string.GroupEmojiPackInfo;
    }

    @Override // org.telegram.ui.bd
    public final int B0() {
        return R.string.GroupEmojiPack;
    }

    @Override // org.telegram.ui.bd
    public final int E0() {
        return R.string.GroupEmojiStatusInfo;
    }

    @Override // org.telegram.ui.bd
    public final int F0() {
        return getMessagesController().groupEmojiStatusLevelMin;
    }

    @Override // org.telegram.ui.bd
    public final int G0() {
        return R.string.GroupEmojiStatus;
    }

    @Override // org.telegram.ui.bd
    public final int H0() {
        return getMessagesController().groupEmojiStickersLevelMin;
    }

    @Override // org.telegram.ui.bd
    public final int I0() {
        return 4;
    }

    @Override // org.telegram.ui.bd
    public final int J0() {
        return getMessagesController().groupProfileBgIconLevelMin;
    }

    @Override // org.telegram.ui.bd
    public final int K0() {
        return R.string.GroupProfileInfo;
    }

    @Override // org.telegram.ui.bd
    public final int L0() {
        return R.string.GroupStickerPackInfo;
    }

    @Override // org.telegram.ui.bd
    public final int M0() {
        return R.string.GroupStickerPack;
    }

    @Override // org.telegram.ui.bd
    public final int N0() {
        return R.string.GroupWallpaper2Info;
    }

    @Override // org.telegram.ui.bd
    public final int O0() {
        return getMessagesController().groupWallpaperLevelMin;
    }

    @Override // org.telegram.ui.bd
    public final int P0() {
        return R.string.GroupWallpaper;
    }

    @Override // org.telegram.ui.bd
    public final boolean R0() {
        return ChatObject.isForum(getMessagesController().getChat(Long.valueOf(-this.a)));
    }

    @Override // org.telegram.ui.bd
    public final void T0(int i10) {
        if (this.c == null || this.y0) {
            return;
        }
        this.y0 = true;
        MessagesController.getInstance(this.currentAccount).getBoostsController().userCanBoostChannel(this.a, this.c, new k60(this, i10, 0));
    }

    @Override // org.telegram.ui.bd
    public final void X0(boolean z4) {
        super.X0(z4);
        uc ucVar = this.w0;
        if (ucVar != null) {
            TextView textView = ucVar.d;
            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.c;
            textView.setText(AndroidUtilities.replaceTags(LocaleController.formatPluralString("BoostingGroupBoostCount", tL_premium_boostsStatus != null ? tL_premium_boostsStatus.boosts : 0, new Object[0])));
        }
    }

    @Override // org.telegram.ui.bd
    public final void Z0(boolean z4) {
        super.Z0(z4);
        this.actionBar.setBackgroundColor(0);
        org.telegram.ui.Components.pq pqVar = new org.telegram.ui.Components.pq(new ColorDrawable(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.d6, this.resourceProvider)), org.telegram.ui.ActionBar.k6.V0(getParentActivity(), R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.k6.b7), 0, 0);
        pqVar.w = true;
        this.L.setBackground(pqVar);
        uc ucVar = this.w0;
        if (ucVar == null || z4) {
            return;
        }
        ucVar.a.b(this.currentAccount, this.s, false);
        this.w0.b.b(this.s, false);
        this.w0.e();
    }

    @Override // org.telegram.ui.bd
    public final void c1() {
        nc ncVar;
        nc ncVar2;
        this.W = 0;
        int i10 = 1 + 1;
        this.X = 1;
        this.Y = i10;
        int i11 = i10 + 2;
        this.O = i11;
        this.Z = i10 + 1;
        if (this.w != 0 || this.s >= 0) {
            boolean z4 = this.b0 >= 0;
            this.O = i10 + 3;
            this.b0 = i11;
            if (!z4 && (ncVar = this.K) != null) {
                ncVar.o(i11);
                this.K.m(this.Z);
                this.J.u0(0);
            }
        } else {
            int i12 = this.b0;
            this.b0 = -1;
            if (i12 >= 0 && (ncVar2 = this.K) != null) {
                ncVar2.u(i12);
                this.K.m(this.Z);
            }
        }
        int i13 = this.O;
        this.a0 = i13;
        this.e0 = i13 + 1;
        this.f0 = i13 + 2;
        this.c0 = i13 + 3;
        this.O = i13 + 5;
        this.d0 = i13 + 4;
        TLRPC.ChatFull chatFull = getMessagesController().getChatFull(-this.a);
        if (chatFull == null || !chatFull.can_set_stickers) {
            this.g0 = -1;
            this.h0 = -1;
        } else {
            int i14 = this.O;
            this.g0 = i14;
            this.O = i14 + 2;
            this.h0 = i14 + 1;
        }
        int i15 = this.O;
        this.P = i15;
        this.T = i15 + 1;
        this.U = i15 + 2;
        this.O = i15 + 4;
        this.V = i15 + 3;
    }

    @Override // org.telegram.ui.bd, org.telegram.ui.ActionBar.p2
    public final View createView(Context context) {
        View createView = super.createView(context);
        Z0(false);
        this.actionBar.setAddToContainer(false);
        this.actionBar.setTitle("");
        ((ViewGroup) createView).addView(this.actionBar);
        createView.getViewTreeObserver().addOnGlobalLayoutListener(new l60(this, (FrameLayout) createView));
        return createView;
    }

    @Override // org.telegram.ui.bd, org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        super.didReceivedNotification(i10, i11, objArr);
        if (i10 == NotificationCenter.chatInfoDidLoad && ((TLRPC.ChatFull) objArr[0]).id == (-this.a)) {
            b1();
        }
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        uc ucVar = this.w0;
        if (ucVar != null) {
            ucVar.a();
        }
    }

    @Override // org.telegram.ui.bd, org.telegram.ui.ActionBar.p2
    public final boolean onFragmentCreate() {
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.chatInfoDidLoad);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.bd, org.telegram.ui.ActionBar.p2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.chatInfoDidLoad);
    }

    @Override // org.telegram.ui.bd
    public final void x0() {
        mh.d1 d1Var = new mh.d1(this, getParentActivity(), this.resourceProvider, 28);
        this.J = d1Var;
        d1Var.setOnScrollListener(new l3(this, 12));
        this.J.setSections(true);
    }

    @Override // org.telegram.ui.bd
    public final int z0() {
        return getMessagesController().groupCustomWallpaperLevelMin;
    }
}
