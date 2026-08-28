package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class pv0 extends org.telegram.ui.ActionBar.o2 {
    public final long a;
    public org.telegram.ui.Cells.x7 b;
    public org.telegram.ui.Components.e80 c;
    public org.telegram.ui.Components.i51 d;
    public org.telegram.ui.Components.fr e;
    public org.telegram.ui.ActionBar.w0 f;
    public final boolean h;
    public final long n;
    public boolean r;
    public long s;
    public ao v;
    public boolean w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pv0(long j10) {
        super(null);
        TLRPC.Chat chat = null;
        this.w = true;
        this.a = j10;
        TLRPC.Chat chat2 = getMessagesController().getChat(Long.valueOf(j10));
        if (chat2 != null && chat2.linked_monoforum_id != 0) {
            chat = getMessagesController().getChat(Long.valueOf(chat2.linked_monoforum_id));
        }
        long j11 = chat != null ? chat.send_paid_messages_stars : 0L;
        boolean z10 = chat2 != null && chat2.broadcast_messages_allowed;
        this.h = z10;
        long clamp = Utilities.clamp(z10 ? j11 : getMessagesController().config.starsPaidMessagesChannelAmountDefault.get(), getMessagesController().starsPaidMessageAmountMax, 0L);
        this.n = clamp;
        this.r = z10;
        this.s = clamp;
    }

    public static /* synthetic */ void T(pv0 pv0Var, TLRPC.TL_error tL_error, TLObject tLObject, TL_stars.updatePaidMessagesPrice updatepaidmessagesprice) {
        if (tL_error != null) {
            pv0Var.e.a(0.0f);
            org.telegram.ui.Components.oc.b0(tL_error);
            return;
        }
        TLRPC.Updates updates = (TLRPC.Updates) tLObject;
        pv0Var.getMessagesController().putChats(updates.chats, false);
        pv0Var.getMessagesController().processUpdates(updates, false);
        if (pv0Var.isFinished || pv0Var.finishing) {
            return;
        }
        ao aoVar = pv0Var.v;
        if (aoVar != null) {
            aoVar.run(updatepaidmessagesprice.suggestions_allowed ? updatepaidmessagesprice.send_paid_messages_stars : -1L);
        }
        pv0Var.finishFragment();
    }

    public final void U(boolean z10) {
        boolean W;
        if (this.f == null || this.w == (W = W())) {
            return;
        }
        this.w = W;
        this.f.setEnabled(W);
        if (z10) {
            this.f.animate().alpha(W ? 1.0f : 0.0f).scaleX(W ? 1.0f : 0.0f).scaleY(W ? 1.0f : 0.0f).setDuration(180L).start();
            return;
        }
        this.f.setAlpha(W ? 1.0f : 0.0f);
        this.f.setScaleX(W ? 1.0f : 0.0f);
        this.f.setScaleY(W ? 1.0f : 0.0f);
    }

    public final String V() {
        return LocaleController.formatString(R.string.PostSuggestionsPriceInfo2, mh.l.F0(getMessagesController().starsPaidMessageCommissionPermille), String.valueOf(((int) (((this.s * (r0 / 1000.0f)) / 1000.0d) * getMessagesController().starsUsdWithdrawRate1000)) / 100.0d));
    }

    public final boolean W() {
        return (this.s == this.n && this.r == this.h) ? false : true;
    }

    public final void X() {
        if (this.e.c > 0.0f) {
            return;
        }
        if (!W()) {
            finishFragment();
            return;
        }
        this.e.a(1.0f);
        TL_stars.updatePaidMessagesPrice updatepaidmessagesprice = new TL_stars.updatePaidMessagesPrice();
        MessagesController messagesController = getMessagesController();
        long j10 = this.a;
        updatepaidmessagesprice.channel = messagesController.getInputChannel(j10);
        boolean z10 = this.r;
        updatepaidmessagesprice.send_paid_messages_stars = z10 ? this.s : 0L;
        updatepaidmessagesprice.suggestions_allowed = z10;
        getConnectionsManager().sendRequest(updatepaidmessagesprice, new v40(19, this, updatepaidmessagesprice));
        TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(j10));
        if (chat != null) {
            if (this.r) {
                chat.flags2 |= 65536;
                chat.broadcast_messages_allowed = true;
            } else {
                chat.flags2 &= -65537;
                chat.broadcast_messages_allowed = false;
            }
            getMessagesController().putChat(chat, true);
            TLRPC.Chat chat2 = getMessagesController().getChat(Long.valueOf(chat.linked_monoforum_id));
            if (chat2 != null) {
                if (this.r) {
                    chat2.flags2 |= 16384;
                    chat2.send_paid_messages_stars = this.s;
                } else {
                    chat2.flags2 &= -16385;
                    chat2.send_paid_messages_stars = 0L;
                }
                getMessagesController().putChat(chat2, true);
            }
        }
        ao aoVar = this.v;
        if (aoVar != null) {
            aoVar.run(this.r ? this.s : -1L);
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.PostSuggestions));
        this.actionBar.setActionBarMenuOnItemClick(new cd0(this, 13));
        Drawable mutate = context.getResources().getDrawable(R.drawable.ic_ab_done).mutate();
        int i9 = org.telegram.ui.ActionBar.f6.v8;
        mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.w0(null, i9, false), PorterDuff.Mode.MULTIPLY));
        this.e = new org.telegram.ui.Components.fr(mutate, new org.telegram.ui.Components.jp(org.telegram.ui.ActionBar.f6.w0(null, i9, false)));
        this.f = this.actionBar.n().i(AndroidUtilities.dp(56.0f), LocaleController.getString(R.string.Done), this.e);
        U(false);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.a7, false));
        FrameLayout frameLayout2 = (FrameLayout) this.fragmentView;
        org.telegram.ui.Cells.x7 x7Var = new org.telegram.ui.Cells.x7(context, this.resourceProvider);
        this.b = x7Var;
        int i10 = org.telegram.ui.ActionBar.f6.d6;
        x7Var.setBackgroundColor(getThemedColor(i10));
        org.telegram.ui.Components.e80 e80Var = new org.telegram.ui.Components.e80(context, this, null, true, true);
        this.c = e80Var;
        e80Var.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(16.0f), 0);
        this.c.setBackgroundColor(getThemedColor(i10));
        this.c.b(true);
        this.c.d(0, null, false);
        org.telegram.ui.Components.i51 i51Var = new org.telegram.ui.Components.i51(context, this.currentAccount, this.classGuid, false, new a5(this, 16), new ov0(this, 2), null, this.resourceProvider);
        this.d = i51Var;
        i51Var.p1();
        frameLayout2.addView(this.d, g7.e6.e(-1, -1, 51));
        this.actionBar.setAdaptiveBackground(this.d);
        return this.fragmentView;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return !W();
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean onBackPressed(boolean z10) {
        if (!W()) {
            return super.onBackPressed(z10);
        }
        if (!z10) {
            return false;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        alertDialog$Builder.a.N = LocaleController.getString(R.string.UnsavedChanges);
        alertDialog$Builder.a.P = LocaleController.getString(R.string.MessageSuggestionsUnsavedChanges);
        alertDialog$Builder.k(LocaleController.getString(R.string.ApplyTheme), new ov0(this, 0));
        alertDialog$Builder.h(LocaleController.getString(R.string.Discard), new ov0(this, 1));
        showDialog(alertDialog$Builder.a);
        return false;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean onFragmentCreate() {
        org.telegram.ui.Components.z41 z41Var;
        super.onFragmentCreate();
        org.telegram.ui.Components.i51 i51Var = this.d;
        if (i51Var == null || (z41Var = i51Var.U2) == null) {
            return true;
        }
        z41Var.N(false);
        return true;
    }
}
