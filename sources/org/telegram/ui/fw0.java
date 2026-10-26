package org.telegram.ui;

import android.content.Context;
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

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class fw0 extends org.telegram.ui.ActionBar.r2 {
    public final long a;
    public org.telegram.ui.Cells.c8 b;
    public org.telegram.ui.Components.r90 c;
    public org.telegram.ui.Components.r71 d;
    public org.telegram.ui.ActionBar.u5 e;
    public final boolean f;
    public final long h;
    public boolean n;
    public long r;
    public fo s;
    public boolean v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fw0(long j10) {
        super(null);
        TLRPC.Chat chat = null;
        this.v = true;
        this.a = j10;
        TLRPC.Chat chat2 = getMessagesController().getChat(Long.valueOf(j10));
        if (chat2 != null && chat2.linked_monoforum_id != 0) {
            chat = getMessagesController().getChat(Long.valueOf(chat2.linked_monoforum_id));
        }
        long j11 = chat != null ? chat.send_paid_messages_stars : 0L;
        boolean z10 = chat2 != null && chat2.broadcast_messages_allowed;
        this.f = z10;
        long clamp = Utilities.clamp(z10 ? j11 : getMessagesController().config.starsPaidMessagesChannelAmountDefault.get(), getMessagesController().starsPaidMessageAmountMax, 0L);
        this.h = clamp;
        this.n = z10;
        this.r = clamp;
    }

    public static /* synthetic */ void V(fw0 fw0Var, TLRPC.TL_error tL_error, TLObject tLObject, TL_stars.updatePaidMessagesPrice updatepaidmessagesprice) {
        if (tL_error != null) {
            fw0Var.e.b(false);
            org.telegram.ui.Components.wc.e0(tL_error);
            return;
        }
        TLRPC.Updates updates = (TLRPC.Updates) tLObject;
        fw0Var.getMessagesController().putChats(updates.chats, false);
        fw0Var.getMessagesController().lambda$processUpdates$379(updates, false);
        if (fw0Var.isFinished || fw0Var.finishing) {
            return;
        }
        fo foVar = fw0Var.s;
        if (foVar != null) {
            foVar.run(updatepaidmessagesprice.suggestions_allowed ? updatepaidmessagesprice.send_paid_messages_stars : -1L);
        }
        fw0Var.finishFragment();
    }

    public final void W(boolean z10) {
        boolean Y;
        if (this.e == null || this.v == (Y = Y())) {
            return;
        }
        this.v = Y;
        this.e.a(Y, z10);
    }

    public final String X() {
        return LocaleController.formatString(R.string.PostSuggestionsPriceInfo2, hi.k.F0(getMessagesController().starsPaidMessageCommissionPermille), String.valueOf(((int) (((this.r * (r0 / 1000.0f)) / 1000.0d) * getMessagesController().starsUsdWithdrawRate1000)) / 100.0d));
    }

    public final boolean Y() {
        return (this.r == this.h && this.n == this.f) ? false : true;
    }

    public final void Z() {
        if (this.e.x.f) {
            return;
        }
        if (!Y()) {
            finishFragment();
            return;
        }
        this.e.b(true);
        TL_stars.updatePaidMessagesPrice updatepaidmessagesprice = new TL_stars.updatePaidMessagesPrice();
        MessagesController messagesController = getMessagesController();
        long j10 = this.a;
        updatepaidmessagesprice.channel = messagesController.getInputChannel(j10);
        boolean z10 = this.n;
        updatepaidmessagesprice.send_paid_messages_stars = z10 ? this.r : 0L;
        updatepaidmessagesprice.suggestions_allowed = z10;
        getConnectionsManager().sendRequest(updatepaidmessagesprice, new j10(21, this, updatepaidmessagesprice));
        TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(j10));
        if (chat != null) {
            if (this.n) {
                chat.flags2 |= 65536;
                chat.broadcast_messages_allowed = true;
            } else {
                chat.flags2 &= -65537;
                chat.broadcast_messages_allowed = false;
            }
            getMessagesController().putChat(chat, true);
            TLRPC.Chat chat2 = getMessagesController().getChat(Long.valueOf(chat.linked_monoforum_id));
            if (chat2 != null) {
                if (this.n) {
                    chat2.flags2 |= 16384;
                    chat2.send_paid_messages_stars = this.r;
                } else {
                    chat2.flags2 &= -16385;
                    chat2.send_paid_messages_stars = 0L;
                }
                getMessagesController().putChat(chat2, true);
            }
        }
        fo foVar = this.s;
        if (foVar != null) {
            foVar.run(this.n ? this.r : -1L);
        }
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final View createView(Context context) {
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.simpleActionBar.setTitle(LocaleController.getString(R.string.PostSuggestions));
        this.simpleActionBar.setActionBarMenuOnItemClick(new a20(this, 24));
        this.e = this.simpleActionBar.i(LocaleController.getString(R.string.Save));
        W(false);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.a7, frameLayout, null);
        FrameLayout frameLayout2 = (FrameLayout) this.fragmentView;
        org.telegram.ui.Cells.c8 c8Var = new org.telegram.ui.Cells.c8(context, this.resourceProvider);
        this.b = c8Var;
        int i10 = org.telegram.ui.ActionBar.y6.d6;
        org.telegram.ui.ActionBar.f7.i(i10, c8Var, getResourceProvider());
        org.telegram.ui.Components.r90 r90Var = new org.telegram.ui.Components.r90(context, this, null, true, true);
        this.c = r90Var;
        r90Var.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(16.0f), 0);
        org.telegram.ui.ActionBar.f7.i(i10, this.c, getResourceProvider());
        this.c.b(true);
        this.c.d(0, null, false);
        org.telegram.ui.Components.r71 r71Var = new org.telegram.ui.Components.r71(context, this.currentAccount, this.classGuid, false, new e5(this, 16), new ew0(this, 2), null, this.resourceProvider);
        this.d = r71Var;
        r71Var.u1();
        frameLayout2.addView(this.d, org.telegram.ui.Components.gb1.i(-1, -1, 51));
        return this.fragmentView;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final org.telegram.ui.Components.mm0 getListViewForSimpleGlass() {
        return this.d;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return !Y();
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean onBackPressed(boolean z10) {
        if (!Y()) {
            return super.onBackPressed(z10);
        }
        if (!z10) {
            return false;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        alertDialog$Builder.a.R = LocaleController.getString(R.string.UnsavedChanges);
        alertDialog$Builder.a.T = LocaleController.getString(R.string.MessageSuggestionsUnsavedChanges);
        alertDialog$Builder.k(LocaleController.getString(R.string.ApplyTheme), new ew0(this, 0));
        alertDialog$Builder.h(LocaleController.getString(R.string.Discard), new ew0(this, 1));
        showDialog(alertDialog$Builder.a);
        return false;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean onFragmentCreate() {
        org.telegram.ui.Components.j71 j71Var;
        super.onFragmentCreate();
        org.telegram.ui.Components.r71 r71Var = this.d;
        if (r71Var == null || (j71Var = r71Var.g3) == null) {
            return true;
        }
        j71Var.O(false);
        return true;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean useSimpleActionBar() {
        return true;
    }
}
