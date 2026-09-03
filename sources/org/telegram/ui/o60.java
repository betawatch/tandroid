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

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class o60 extends dd {
    public wc w0;
    public float x0;
    public boolean y0;

    public o60(long j10) {
        super(j10);
        this.d = true;
    }

    public static void e1(o60 o60Var, int i10, ChannelBoostsController.CanApplyBoost canApplyBoost) {
        if (canApplyBoost == null || o60Var.getParentActivity() == null) {
            o60Var.y0 = false;
            return;
        }
        n60 n60Var = new n60(o60Var, o60Var, o60Var.getParentActivity(), i10, o60Var.currentAccount, o60Var.resourceProvider);
        n60Var.G1(canApplyBoost);
        n60Var.F1(o60Var.c, true);
        n60Var.H1(o60Var.a);
        n60Var.show();
    }

    @Override // org.telegram.ui.dd
    public final int A0() {
        return R.string.GroupEmojiPackInfo;
    }

    @Override // org.telegram.ui.dd
    public final int B0() {
        return R.string.GroupEmojiPack;
    }

    @Override // org.telegram.ui.dd
    public final int E0() {
        return R.string.GroupEmojiStatusInfo;
    }

    @Override // org.telegram.ui.dd
    public final int F0() {
        return getMessagesController().groupEmojiStatusLevelMin;
    }

    @Override // org.telegram.ui.dd
    public final int G0() {
        return R.string.GroupEmojiStatus;
    }

    @Override // org.telegram.ui.dd
    public final int H0() {
        return getMessagesController().groupEmojiStickersLevelMin;
    }

    @Override // org.telegram.ui.dd
    public final int I0() {
        return 4;
    }

    @Override // org.telegram.ui.dd
    public final int J0() {
        return getMessagesController().groupProfileBgIconLevelMin;
    }

    @Override // org.telegram.ui.dd
    public final int K0() {
        return R.string.GroupProfileInfo;
    }

    @Override // org.telegram.ui.dd
    public final int L0() {
        return R.string.GroupStickerPackInfo;
    }

    @Override // org.telegram.ui.dd
    public final int M0() {
        return R.string.GroupStickerPack;
    }

    @Override // org.telegram.ui.dd
    public final int N0() {
        return R.string.GroupWallpaper2Info;
    }

    @Override // org.telegram.ui.dd
    public final int O0() {
        return getMessagesController().groupWallpaperLevelMin;
    }

    @Override // org.telegram.ui.dd
    public final int P0() {
        return R.string.GroupWallpaper;
    }

    @Override // org.telegram.ui.dd
    public final boolean R0() {
        return ChatObject.isForum(getMessagesController().getChat(Long.valueOf(-this.a)));
    }

    @Override // org.telegram.ui.dd
    public final void T0(int i10) {
        if (this.c == null || this.y0) {
            return;
        }
        this.y0 = true;
        MessagesController.getInstance(this.currentAccount).getBoostsController().userCanBoostChannel(this.a, this.c, new l60(this, i10, 0));
    }

    @Override // org.telegram.ui.dd
    public final void X0(boolean z4) {
        super.X0(z4);
        wc wcVar = this.w0;
        if (wcVar != null) {
            TextView textView = wcVar.d;
            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.c;
            textView.setText(AndroidUtilities.replaceTags(LocaleController.formatPluralString("BoostingGroupBoostCount", tL_premium_boostsStatus != null ? tL_premium_boostsStatus.boosts : 0, new Object[0])));
        }
    }

    @Override // org.telegram.ui.dd
    public final void Z0(boolean z4) {
        super.Z0(z4);
        this.actionBar.setBackgroundColor(0);
        org.telegram.ui.Components.mq mqVar = new org.telegram.ui.Components.mq(new ColorDrawable(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.d6, this.resourceProvider)), org.telegram.ui.ActionBar.j6.V0(getParentActivity(), R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.j6.b7), 0, 0);
        mqVar.w = true;
        this.L.setBackground(mqVar);
        wc wcVar = this.w0;
        if (wcVar == null || z4) {
            return;
        }
        wcVar.a.b(this.currentAccount, this.s, false);
        this.w0.b.b(this.s, false);
        this.w0.e();
    }

    @Override // org.telegram.ui.dd
    public final void c1() {
        pc pcVar;
        pc pcVar2;
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
            if (!z4 && (pcVar = this.K) != null) {
                pcVar.o(i11);
                this.K.m(this.Z);
                this.J.u0(0);
            }
        } else {
            int i12 = this.b0;
            this.b0 = -1;
            if (i12 >= 0 && (pcVar2 = this.K) != null) {
                pcVar2.u(i12);
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

    @Override // org.telegram.ui.dd, org.telegram.ui.ActionBar.p2
    public final View createView(Context context) {
        View createView = super.createView(context);
        Z0(false);
        this.actionBar.setAddToContainer(false);
        this.actionBar.setTitle("");
        ((ViewGroup) createView).addView(this.actionBar);
        createView.getViewTreeObserver().addOnGlobalLayoutListener(new m60(this, (FrameLayout) createView));
        return createView;
    }

    @Override // org.telegram.ui.dd, org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        super.didReceivedNotification(i10, i11, objArr);
        if (i10 == NotificationCenter.chatInfoDidLoad && ((TLRPC.ChatFull) objArr[0]).id == (-this.a)) {
            b1();
        }
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        wc wcVar = this.w0;
        if (wcVar != null) {
            wcVar.a();
        }
    }

    @Override // org.telegram.ui.dd, org.telegram.ui.ActionBar.p2
    public final boolean onFragmentCreate() {
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.chatInfoDidLoad);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.dd, org.telegram.ui.ActionBar.p2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.chatInfoDidLoad);
    }

    @Override // org.telegram.ui.dd
    public final void x0() {
        lh.e1 e1Var = new lh.e1(this, getParentActivity(), this.resourceProvider, 28);
        this.J = e1Var;
        e1Var.setOnScrollListener(new n3(this, 12));
        this.J.setSections(true);
    }

    @Override // org.telegram.ui.dd
    public final int z0() {
        return getMessagesController().groupCustomWallpaperLevelMin;
    }
}
