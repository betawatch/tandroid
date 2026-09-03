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

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class fw0 extends org.telegram.ui.ActionBar.p2 {
    public final long a;
    public org.telegram.ui.Cells.x7 b;
    public org.telegram.ui.Components.y80 c;
    public org.telegram.ui.Components.h61 d;
    public org.telegram.ui.Components.or e;
    public org.telegram.ui.ActionBar.w0 f;
    public final boolean h;
    public final long n;
    public boolean r;
    public long s;
    public io v;
    public boolean w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fw0(long j10) {
        super(null);
        TLRPC.Chat chat = null;
        this.w = true;
        this.a = j10;
        TLRPC.Chat chat2 = getMessagesController().getChat(Long.valueOf(j10));
        if (chat2 != null && chat2.linked_monoforum_id != 0) {
            chat = getMessagesController().getChat(Long.valueOf(chat2.linked_monoforum_id));
        }
        long j11 = chat != null ? chat.send_paid_messages_stars : 0L;
        boolean z4 = chat2 != null && chat2.broadcast_messages_allowed;
        this.h = z4;
        long clamp = Utilities.clamp(z4 ? j11 : getMessagesController().config.starsPaidMessagesChannelAmountDefault.get(), getMessagesController().starsPaidMessageAmountMax, 0L);
        this.n = clamp;
        this.r = z4;
        this.s = clamp;
    }

    public static /* synthetic */ void U(fw0 fw0Var, TLRPC.TL_error tL_error, TLObject tLObject, TL_stars.updatePaidMessagesPrice updatepaidmessagesprice) {
        if (tL_error != null) {
            fw0Var.e.a(0.0f);
            org.telegram.ui.Components.qc.b0(tL_error);
            return;
        }
        TLRPC.Updates updates = (TLRPC.Updates) tLObject;
        fw0Var.getMessagesController().putChats(updates.chats, false);
        fw0Var.getMessagesController().processUpdates(updates, false);
        if (fw0Var.isFinished || fw0Var.finishing) {
            return;
        }
        io ioVar = fw0Var.v;
        if (ioVar != null) {
            ioVar.run(updatepaidmessagesprice.suggestions_allowed ? updatepaidmessagesprice.send_paid_messages_stars : -1L);
        }
        fw0Var.finishFragment();
    }

    public final void V(boolean z4) {
        boolean X;
        if (this.f == null || this.w == (X = X())) {
            return;
        }
        this.w = X;
        this.f.setEnabled(X);
        if (z4) {
            this.f.animate().alpha(X ? 1.0f : 0.0f).scaleX(X ? 1.0f : 0.0f).scaleY(X ? 1.0f : 0.0f).setDuration(180L).start();
            return;
        }
        this.f.setAlpha(X ? 1.0f : 0.0f);
        this.f.setScaleX(X ? 1.0f : 0.0f);
        this.f.setScaleY(X ? 1.0f : 0.0f);
    }

    public final String W() {
        return LocaleController.formatString(R.string.PostSuggestionsPriceInfo2, sh.j.G0(getMessagesController().starsPaidMessageCommissionPermille), String.valueOf(((int) (((this.s * (r0 / 1000.0f)) / 1000.0d) * getMessagesController().starsUsdWithdrawRate1000)) / 100.0d));
    }

    public final boolean X() {
        return (this.s == this.n && this.r == this.h) ? false : true;
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
        boolean z4 = this.r;
        updatepaidmessagesprice.send_paid_messages_stars = z4 ? this.s : 0L;
        updatepaidmessagesprice.suggestions_allowed = z4;
        getConnectionsManager().sendRequest(updatepaidmessagesprice, new tb0(12, this, updatepaidmessagesprice));
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
        io ioVar = this.v;
        if (ioVar != null) {
            ioVar.run(this.r ? this.s : -1L);
        }
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.PostSuggestions));
        this.actionBar.setActionBarMenuOnItemClick(new ll0(this, 5));
        Drawable mutate = context.getResources().getDrawable(R.drawable.ic_ab_done).mutate();
        int i10 = org.telegram.ui.ActionBar.k6.v8;
        mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.w0(null, i10, false), PorterDuff.Mode.MULTIPLY));
        this.e = new org.telegram.ui.Components.or(mutate, new org.telegram.ui.Components.tp(org.telegram.ui.ActionBar.k6.w0(null, i10, false)));
        this.f = this.actionBar.n().i(AndroidUtilities.dp(56.0f), LocaleController.getString(R.string.Done), this.e);
        V(false);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.a7, false));
        FrameLayout frameLayout2 = (FrameLayout) this.fragmentView;
        org.telegram.ui.Cells.x7 x7Var = new org.telegram.ui.Cells.x7(context, this.resourceProvider);
        this.b = x7Var;
        int i11 = org.telegram.ui.ActionBar.k6.d6;
        x7Var.setBackgroundColor(getThemedColor(i11));
        org.telegram.ui.Components.y80 y80Var = new org.telegram.ui.Components.y80(context, this, null, true, true);
        this.c = y80Var;
        y80Var.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(16.0f), 0);
        this.c.setBackgroundColor(getThemedColor(i11));
        this.c.b(true);
        this.c.d(0, null, false);
        org.telegram.ui.Components.h61 h61Var = new org.telegram.ui.Components.h61(context, this.currentAccount, this.classGuid, false, new d5(this, 16), new ew0(this, 2), null, this.resourceProvider);
        this.d = h61Var;
        h61Var.o1();
        frameLayout2.addView(this.d, k7.c6.e(-1, -1, 51));
        this.actionBar.setAdaptiveBackground(this.d);
        return this.fragmentView;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return !X();
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean onBackPressed(boolean z4) {
        if (!X()) {
            return super.onBackPressed(z4);
        }
        if (!z4) {
            return false;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        alertDialog$Builder.a.O = LocaleController.getString(R.string.UnsavedChanges);
        alertDialog$Builder.a.Q = LocaleController.getString(R.string.MessageSuggestionsUnsavedChanges);
        alertDialog$Builder.k(LocaleController.getString(R.string.ApplyTheme), new ew0(this, 0));
        alertDialog$Builder.h(LocaleController.getString(R.string.Discard), new ew0(this, 1));
        showDialog(alertDialog$Builder.a);
        return false;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean onFragmentCreate() {
        org.telegram.ui.Components.w51 w51Var;
        super.onFragmentCreate();
        org.telegram.ui.Components.h61 h61Var = this.d;
        if (h61Var == null || (w51Var = h61Var.V2) == null) {
            return true;
        }
        w51Var.N(false);
        return true;
    }
}
