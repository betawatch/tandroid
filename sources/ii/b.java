package ii;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import bi.d;
import bi.x;
import di.y0;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Cells.h6;
import org.telegram.ui.Cells.i6;
import org.telegram.ui.Components.bb;
import org.telegram.ui.Components.e5;
import org.telegram.ui.Components.kl0;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.v51;
import s4.p0;
import w7.x5;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes4.dex */
public final class b extends bb {
    public v51 X;
    public boolean Y;
    public final FrameLayout Z;
    public final boolean a0;
    public final boolean b0;
    public int c0;

    public b(Context context, TLRPC.Chat chat, long j3, Utilities.Callback callback) {
        super(context, (f6) null, false);
        int i10;
        TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(j3));
        TLRPC.Chat chat2 = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-j3));
        this.b0 = UserObject.isBot(user);
        this.a0 = ChatObject.isChannelAndNotMegaGroup(chat2);
        this.L = false;
        this.K = AndroidUtilities.dp(12.0f);
        this.e.setTitle(y());
        setBackgroundColor(j6.v0(j6.a7, this.resourcesProvider));
        FrameLayout frameLayout = new FrameLayout(context);
        this.Z = frameLayout;
        frameLayout.setPadding(0, AndroidUtilities.dp(3.0f), 0, AndroidUtilities.dp(3.0f));
        frameLayout.setLayoutParams(new p0(-1, -2));
        h6 h6Var = new h6(context, null);
        if (chat2 != null) {
            i10 = -1;
            h6Var.t(chat2, null, chat2.title, LocaleController.formatPluralStringSpaced("Members", chat2.participants_count), false, false);
        } else {
            i10 = -1;
            if (user != null) {
                h6Var.t(user, null, DialogObject.getName(user), LocaleController.getString(R.string.Bot), false, false);
            }
        }
        frameLayout.addView(h6Var, x5.c(-2.0f, i10));
        ll0 ll0Var = this.d;
        int i11 = this.backgroundPaddingLeft;
        ll0Var.setPadding(i11, 0, i11, AndroidUtilities.dp(64.0f) + AndroidUtilities.navigationBarHeight);
        this.d.o1();
        this.d.setClipToPadding(false);
        this.d.setOnItemClickListener(new d(this, 12));
        di.d dVar = new di.d(context, this.resourcesProvider, true);
        if (chat != null) {
            dVar.setText(LocaleController.getString(ChatObject.canAddChatToCommunity(chat) ? R.string.CommunityAddToCommunityButton : R.string.CommunityAddToCommunityRequestButton));
        } else {
            dVar.setText(LocaleController.getString(R.string.CommunityCreateCommunity));
        }
        dVar.e();
        dVar.setOnClickListener(new x(this, callback, chat, 9));
        this.containerView.addView(dVar, x5.f(48.0f, 80, AndroidUtilities.dp(12.0f) + this.backgroundPaddingLeft, 0, AndroidUtilities.dp(12.0f) + this.backgroundPaddingLeft, AndroidUtilities.dp(12.0f) + AndroidUtilities.navigationBarHeight));
        this.X.N(false);
    }

    public final void P(Utilities.Callback callback, boolean z10, boolean z11) {
        if (z11 && !z10 && !this.b0) {
            e5.P(getContext(), this.resourcesProvider, LocaleController.getString(R.string.CommunityAddToCommunityTitle), LocaleController.getString(this.a0 ? R.string.CommunityAddToCommunityChannelMessage : R.string.CommunityAddToCommunityGroupMessage), LocaleController.getString(R.string.Add), new y0(this, callback, z10, 3)).show();
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
        View T0 = ll0Var.T0(i10);
        if (T0 instanceof i6) {
            ((i6) T0).a(!z10);
            z11 = false;
        } else {
            z11 = true;
        }
        View T02 = ll0Var.T0(this.c0 + 2);
        if (T02 instanceof i6) {
            ((i6) T02).a(z10);
        } else {
            z11 = true;
        }
        if (z11) {
            this.X.N(true);
        }
    }

    @Override // org.telegram.ui.Components.bb
    public final kl0 v(ll0 ll0Var) {
        v51 v51Var = new v51(this.d, getContext(), this.currentAccount, 0, false, new a(this, 0), this.resourcesProvider);
        this.X = v51Var;
        v51Var.r = false;
        return v51Var;
    }

    @Override // org.telegram.ui.Components.bb
    public final CharSequence y() {
        return LocaleController.getString(this.b0 ? R.string.CommunityAddBotTitle : R.string.CommunityAddChatTitle);
    }
}
