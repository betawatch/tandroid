package hi;

import ai.d1;
import ai.f2;
import ai.v0;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.widget.TextView;
import ci.d;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.f9;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.ml0;
import org.telegram.ui.Components.oq;
import org.telegram.ui.Components.u9;
import org.telegram.ui.Components.x51;
import org.telegram.ui.Components.za;
import w7.x5;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes4.dex */
public final class c extends za {
    public final d1 X;
    public x51 Y;

    public c(Context context, TLRPC.Chat chat, Runnable runnable) {
        super(context, (f6) null, false);
        this.K = AndroidUtilities.dp(30.0f);
        ml0 ml0Var = this.d;
        int i10 = this.backgroundPaddingLeft;
        ml0Var.setPadding(i10, 0, i10, AndroidUtilities.dp(130.0f) + AndroidUtilities.navigationBarHeight);
        this.d.setClipToPadding(false);
        d dVar = new d(context, this.resourcesProvider, true);
        dVar.setText(LocaleController.getString(R.string.Cancel));
        dVar.d();
        dVar.e();
        dVar.setOnClickListener(new v0(this, 26));
        boolean isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(chat);
        d dVar2 = new d(context, this.resourcesProvider, true);
        dVar2.setText(LocaleController.getString(isChannelAndNotMegaGroup ? R.string.CommunityInviteOnlyChannelMessageOwner : R.string.CommunityInviteOnlyGroupMessageOwner));
        dVar2.e();
        dVar2.setOnClickListener(new f2(12, this, runnable));
        d1 d1Var = new d1(context, 2);
        TextView textView = (TextView) d1Var.d;
        TextView textView2 = (TextView) d1Var.c;
        this.X = d1Var;
        d1Var.setPadding(AndroidUtilities.dp(20.0f), 0, AndroidUtilities.dp(20.0f), AndroidUtilities.dp(17.0f));
        ((u9) d1Var.b).e(chat, new f9(chat));
        textView2.setText(DialogObject.getName(chat));
        int i11 = j6.G6;
        textView2.setTextColor(getThemedColor(i11));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) "* ");
        spannableStringBuilder.setSpan(new oq(R.drawable.mini_ephemeral_hidden_14, 0), 0, 1, 33);
        spannableStringBuilder.append((CharSequence) LocaleController.getString(isChannelAndNotMegaGroup ? R.string.CommunityInviteOnlyChannelInfo : R.string.CommunityInviteOnlyGroupInfo));
        textView.setTextColor(getThemedColor(i11));
        textView.setText(spannableStringBuilder);
        this.containerView.addView(dVar2, x5.f(48.0f, 80, AndroidUtilities.dp(12.0f) + this.backgroundPaddingLeft, 0, AndroidUtilities.dp(12.0f) + this.backgroundPaddingLeft, AndroidUtilities.dp(70.0f) + AndroidUtilities.navigationBarHeight));
        this.containerView.addView(dVar, x5.f(48.0f, 80, AndroidUtilities.dp(12.0f) + this.backgroundPaddingLeft, 0, AndroidUtilities.dp(12.0f) + this.backgroundPaddingLeft, AndroidUtilities.dp(12.0f) + AndroidUtilities.navigationBarHeight));
        this.Y.N(false);
    }

    @Override // org.telegram.ui.Components.za
    public final ll0 v(ml0 ml0Var) {
        x51 x51Var = new x51(this.d, getContext(), this.currentAccount, 0, true, new a(this, 1), this.resourcesProvider);
        this.Y = x51Var;
        x51Var.r = false;
        return x51Var;
    }

    @Override // org.telegram.ui.Components.za
    public final CharSequence y() {
        return null;
    }
}
