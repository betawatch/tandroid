package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class bw0 extends org.telegram.ui.ActionBar.o2 {
    public final long a;
    public org.telegram.ui.Cells.y7 b;
    public org.telegram.ui.Components.r90 c;
    public org.telegram.ui.Components.j71 d;
    public org.telegram.ui.Components.as e;
    public org.telegram.ui.Components.eq f;
    public org.telegram.ui.ActionBar.u0 h;
    public final boolean n;
    public final long r;
    public boolean s;
    public long v;
    public co w;
    public boolean x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bw0(long j10) {
        super(null);
        TLRPC.Chat chat = null;
        this.x = true;
        this.a = j10;
        TLRPC.Chat chat2 = getMessagesController().getChat(Long.valueOf(j10));
        if (chat2 != null && chat2.linked_monoforum_id != 0) {
            chat = getMessagesController().getChat(Long.valueOf(chat2.linked_monoforum_id));
        }
        long j11 = chat != null ? chat.send_paid_messages_stars : 0L;
        boolean z10 = chat2 != null && chat2.broadcast_messages_allowed;
        this.n = z10;
        long clamp = Utilities.clamp(z10 ? j11 : getMessagesController().config.starsPaidMessagesChannelAmountDefault.get(), getMessagesController().starsPaidMessageAmountMax, 0L);
        this.r = clamp;
        this.s = z10;
        this.v = clamp;
    }

    public static /* synthetic */ void U(bw0 bw0Var, TLRPC.TL_error tL_error, TLObject tLObject, TL_stars.updatePaidMessagesPrice updatepaidmessagesprice) {
        if (tL_error != null) {
            bw0Var.e.a(0.0f);
            org.telegram.ui.Components.xc.d0(tL_error);
            return;
        }
        TLRPC.Updates updates = (TLRPC.Updates) tLObject;
        bw0Var.getMessagesController().putChats(updates.chats, false);
        bw0Var.getMessagesController().lambda$processUpdates$377(updates, false);
        if (bw0Var.isFinished || bw0Var.finishing) {
            return;
        }
        co coVar = bw0Var.w;
        if (coVar != null) {
            coVar.run(updatepaidmessagesprice.suggestions_allowed ? updatepaidmessagesprice.send_paid_messages_stars : -1L);
        }
        bw0Var.finishFragment();
    }

    public final void V(boolean z10) {
        boolean X;
        if (this.h == null || this.x == (X = X())) {
            return;
        }
        this.x = X;
        this.h.setEnabled(X);
        if (z10) {
            this.h.animate().alpha(X ? 1.0f : 0.0f).scaleX(X ? 1.0f : 0.0f).scaleY(X ? 1.0f : 0.0f).setDuration(180L).start();
            return;
        }
        this.h.setAlpha(X ? 1.0f : 0.0f);
        this.h.setScaleX(X ? 1.0f : 0.0f);
        this.h.setScaleY(X ? 1.0f : 0.0f);
    }

    public final String W() {
        return LocaleController.formatString(R.string.PostSuggestionsPriceInfo2, gi.l.H0(getMessagesController().starsPaidMessageCommissionPermille), String.valueOf(((int) (((this.v * (r0 / 1000.0f)) / 1000.0d) * getMessagesController().starsUsdWithdrawRate1000)) / 100.0d));
    }

    public final boolean X() {
        return (this.v == this.r && this.s == this.n) ? false : true;
    }

    public final void Y() {
        if (this.e.c > 0.0f) {
            return;
        }
        if (!X()) {
            finishFragment();
            return;
        }
        this.e.a(1.0f);
        TL_stars.updatePaidMessagesPrice updatepaidmessagesprice = new TL_stars.updatePaidMessagesPrice();
        MessagesController messagesController = getMessagesController();
        long j10 = this.a;
        updatepaidmessagesprice.channel = messagesController.getInputChannel(j10);
        boolean z10 = this.s;
        updatepaidmessagesprice.send_paid_messages_stars = z10 ? this.v : 0L;
        updatepaidmessagesprice.suggestions_allowed = z10;
        getConnectionsManager().sendRequest(updatepaidmessagesprice, new a50(19, this, updatepaidmessagesprice));
        TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(j10));
        if (chat != null) {
            if (this.s) {
                chat.flags2 |= 65536;
                chat.broadcast_messages_allowed = true;
            } else {
                chat.flags2 &= -65537;
                chat.broadcast_messages_allowed = false;
            }
            getMessagesController().putChat(chat, true);
            TLRPC.Chat chat2 = getMessagesController().getChat(Long.valueOf(chat.linked_monoforum_id));
            if (chat2 != null) {
                if (this.s) {
                    chat2.flags2 |= 16384;
                    chat2.send_paid_messages_stars = this.v;
                } else {
                    chat2.flags2 &= -16385;
                    chat2.send_paid_messages_stars = 0L;
                }
                getMessagesController().putChat(chat2, true);
            }
        }
        co coVar = this.w;
        if (coVar != null) {
            coVar.run(this.s ? this.v : -1L);
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.PostSuggestions));
        this.actionBar.setActionBarMenuOnItemClick(new s60(this, 21));
        Drawable mutate = context.getResources().getDrawable(R.drawable.ic_ab_done).mutate();
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.k6.v8;
        org.telegram.ui.ActionBar.r6.z(kVar, mutate, i10, null, PorterDuff.Mode.MULTIPLY);
        org.telegram.ui.Components.eq eqVar = new org.telegram.ui.Components.eq(org.telegram.ui.ActionBar.k6.x0(null, i10, false));
        this.f = eqVar;
        this.e = new org.telegram.ui.Components.as(mutate, eqVar);
        this.h = this.actionBar.m().i(AndroidUtilities.dp(56.0f), LocaleController.getString(R.string.Done), this.e);
        V(false);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.a7, frameLayout, null);
        FrameLayout frameLayout2 = (FrameLayout) this.fragmentView;
        org.telegram.ui.Cells.y7 y7Var = new org.telegram.ui.Cells.y7(context, this.resourceProvider);
        this.b = y7Var;
        int i11 = org.telegram.ui.ActionBar.k6.d6;
        org.telegram.ui.ActionBar.r6.i(i11, y7Var, getResourceProvider());
        org.telegram.ui.Components.r90 r90Var = new org.telegram.ui.Components.r90(context, this, null, true, true);
        this.c = r90Var;
        r90Var.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(16.0f), 0);
        org.telegram.ui.ActionBar.r6.i(i11, this.c, getResourceProvider());
        this.c.b(true);
        this.c.d(0, null, false);
        org.telegram.ui.Components.j71 j71Var = new org.telegram.ui.Components.j71(context, this.currentAccount, this.classGuid, false, new f5(this, 16), new aw0(this, 2), null, this.resourceProvider);
        this.d = j71Var;
        j71Var.t1();
        frameLayout2.addView(this.d, w7.z5.e(-1, -1, 51));
        this.actionBar.setAdaptiveBackground(this.d);
        return this.fragmentView;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return !X();
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean onBackPressed(boolean z10) {
        if (!X()) {
            return super.onBackPressed(z10);
        }
        if (!z10) {
            return false;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        alertDialog$Builder.a.R = LocaleController.getString(R.string.UnsavedChanges);
        alertDialog$Builder.a.T = LocaleController.getString(R.string.MessageSuggestionsUnsavedChanges);
        alertDialog$Builder.k(LocaleController.getString(R.string.ApplyTheme), new aw0(this, 0));
        alertDialog$Builder.h(LocaleController.getString(R.string.Discard), new aw0(this, 1));
        showDialog(alertDialog$Builder.a);
        return false;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean onFragmentCreate() {
        org.telegram.ui.Components.b71 b71Var;
        super.onFragmentCreate();
        org.telegram.ui.Components.j71 j71Var = this.d;
        if (j71Var == null || (b71Var = j71Var.Z2) == null) {
            return true;
        }
        b71Var.N(false);
        return true;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onThemeColorsChanged() {
        super.onThemeColorsChanged();
        try {
            org.telegram.ui.Components.eq eqVar = this.f;
            if (eqVar != null) {
                eqVar.b(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.v8, false));
                org.telegram.ui.Components.as asVar = this.e;
                if (asVar != null) {
                    asVar.invalidateSelf();
                }
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }
}
