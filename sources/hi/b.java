package hi;

import ai.d0;
import ai.g;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import ci.d;
import ci.y0;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Cells.j6;
import org.telegram.ui.Components.c5;
import org.telegram.ui.Components.kl0;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.w51;
import org.telegram.ui.Components.za;
import s4.p0;
import w7.x5;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes4.dex */
public final class b extends za {
    public w51 X;
    public boolean Y;
    public final FrameLayout Z;
    public final boolean a0;
    public final boolean b0;
    public int c0;

    public b(Context context, TLRPC.Chat chat, long j3, Utilities.Callback callback) {
        super(context, (e6) null, false);
        int i10;
        TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(j3));
        TLRPC.Chat chat2 = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-j3));
        this.b0 = UserObject.isBot(user);
        this.a0 = ChatObject.isChannelAndNotMegaGroup(chat2);
        this.L = false;
        this.K = AndroidUtilities.dp(12.0f);
        this.e.setTitle(y());
        setBackgroundColor(i6.v0(i6.a7, this.resourcesProvider));
        FrameLayout frameLayout = new FrameLayout(context);
        this.Z = frameLayout;
        frameLayout.setPadding(0, AndroidUtilities.dp(3.0f), 0, AndroidUtilities.dp(3.0f));
        frameLayout.setLayoutParams(new p0(-1, -2));
        org.telegram.ui.Cells.i6 i6Var = new org.telegram.ui.Cells.i6(context, null);
        if (chat2 != null) {
            i10 = -1;
            i6Var.t(chat2, null, chat2.title, LocaleController.formatPluralStringSpaced("Members", chat2.participants_count), false, false);
        } else {
            i10 = -1;
            if (user != null) {
                i6Var.t(user, null, DialogObject.getName(user), LocaleController.getString(R.string.Bot), false, false);
            }
        }
        frameLayout.addView(i6Var, x5.c(-2.0f, i10));
        ll0 ll0Var = this.d;
        int i11 = this.backgroundPaddingLeft;
        ll0Var.setPadding(i11, 0, i11, AndroidUtilities.dp(64.0f) + AndroidUtilities.navigationBarHeight);
        this.d.p1();
        this.d.setClipToPadding(false);
        this.d.setOnItemClickListener(new g(this, 12));
        d dVar = new d(context, this.resourcesProvider, true);
        if (chat != null) {
            dVar.setText(LocaleController.getString(ChatObject.canAddChatToCommunity(chat) ? R.string.CommunityAddToCommunityButton : R.string.CommunityAddToCommunityRequestButton));
        } else {
            dVar.setText(LocaleController.getString(R.string.CommunityCreateCommunity));
        }
        dVar.e();
        dVar.setOnClickListener(new d0(this, callback, chat, 9));
        this.containerView.addView(dVar, x5.f(48.0f, 80, AndroidUtilities.dp(12.0f) + this.backgroundPaddingLeft, 0, AndroidUtilities.dp(12.0f) + this.backgroundPaddingLeft, AndroidUtilities.dp(12.0f) + AndroidUtilities.navigationBarHeight));
        this.X.N(false);
    }

    public final void P(Utilities.Callback callback, boolean z10, boolean z11) {
        if (z11 && !z10 && !this.b0) {
            c5.P(getContext(), this.resourcesProvider, LocaleController.getString(R.string.CommunityAddToCommunityTitle), LocaleController.getString(this.a0 ? R.string.CommunityAddToCommunityChannelMessage : R.string.CommunityAddToCommunityGroupMessage), LocaleController.getString(R.string.Add), new y0(this, callback, z10, 3)).show();
        } else {
            callback.run(Boolean.valueOf(z10));
            dismiss();
        }
    }

    public final void Q(boolean z10) {
        boolean z11;
        if (this.Y == z10) {
            return;
        }
        this.Y = z10;
        int i10 = this.c0 + 1;
        ll0 ll0Var = this.d;
        View U0 = ll0Var.U0(i10);
        if (U0 instanceof j6) {
            ((j6) U0).a(!z10);
            z11 = false;
        } else {
            z11 = true;
        }
        View U02 = ll0Var.U0(this.c0 + 2);
        if (U02 instanceof j6) {
            ((j6) U02).a(z10);
        } else {
            z11 = true;
        }
        if (z11) {
            this.X.N(true);
        }
    }

    @Override // org.telegram.ui.Components.za
    public final kl0 v(ll0 ll0Var) {
        w51 w51Var = new w51(this.d, getContext(), this.currentAccount, 0, false, new a(this, 0), this.resourcesProvider);
        this.X = w51Var;
        w51Var.r = false;
        return w51Var;
    }

    @Override // org.telegram.ui.Components.za
    public final CharSequence y() {
        return LocaleController.getString(this.b0 ? R.string.CommunityAddBotTitle : R.string.CommunityAddChatTitle);
    }
}
