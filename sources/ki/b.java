package ki;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.widget.TextView;
import bi.mc;
import bi.q;
import fi.d;
import hi.e2;
import ig.d0;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f7;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.bb;
import org.telegram.ui.Components.j9;
import org.telegram.ui.Components.k71;
import org.telegram.ui.Components.kb1;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.nm0;
import org.telegram.ui.Components.y9;
import org.telegram.ui.Components.zq;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class b extends bb {
    public final mc X;
    public k71 Y;

    public b(Context context, TLRPC.Chat chat, Runnable runnable) {
        super(context, (u6) null, false);
        this.K = AndroidUtilities.dp(30.0f);
        nm0 nm0Var = this.d;
        int i10 = this.backgroundPaddingLeft;
        nm0Var.setPadding(i10, 0, i10, AndroidUtilities.dp(130.0f) + AndroidUtilities.navigationBarHeight);
        this.d.setClipToPadding(false);
        d dVar = new d(context, this.resourcesProvider, true);
        dVar.setText(LocaleController.getString(R.string.Cancel));
        dVar.e();
        dVar.f();
        dVar.setOnClickListener(new d0(this, 8));
        boolean isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(chat);
        d dVar2 = new d(context, this.resourcesProvider, true);
        dVar2.setText(LocaleController.getString(isChannelAndNotMegaGroup ? R.string.CommunityInviteOnlyChannelMessageOwner : R.string.CommunityInviteOnlyGroupMessageOwner));
        dVar2.f();
        dVar2.setOnClickListener(new q(22, this, runnable));
        mc mcVar = new mc(context, 3);
        TextView textView = (TextView) mcVar.d;
        TextView textView2 = (TextView) mcVar.c;
        this.X = mcVar;
        mcVar.setPadding(AndroidUtilities.dp(20.0f), 0, AndroidUtilities.dp(20.0f), AndroidUtilities.dp(17.0f));
        ((y9) mcVar.b).f(chat, new j9(chat));
        textView2.setText(DialogObject.getName(chat));
        int i11 = y6.G6;
        f7.V(textView2, i11, this.resourcesProvider);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) "* ");
        spannableStringBuilder.setSpan(new zq(R.drawable.mini_ephemeral_hidden_14, 0), 0, 1, 33);
        spannableStringBuilder.append((CharSequence) LocaleController.getString(isChannelAndNotMegaGroup ? R.string.CommunityInviteOnlyChannelInfo : R.string.CommunityInviteOnlyGroupInfo));
        f7.V(textView, i11, this.resourcesProvider);
        textView.setText(spannableStringBuilder);
        this.containerView.addView(dVar2, kb1.j(48.0f, 80, AndroidUtilities.dp(12.0f) + this.backgroundPaddingLeft, 0, AndroidUtilities.dp(12.0f) + this.backgroundPaddingLeft, AndroidUtilities.dp(70.0f) + AndroidUtilities.navigationBarHeight));
        this.containerView.addView(dVar, kb1.j(48.0f, 80, AndroidUtilities.dp(12.0f) + this.backgroundPaddingLeft, 0, AndroidUtilities.dp(12.0f) + this.backgroundPaddingLeft, AndroidUtilities.dp(12.0f) + AndroidUtilities.navigationBarHeight));
        this.Y.O(false);
    }

    @Override // org.telegram.ui.Components.bb
    public final mm0 v(nm0 nm0Var) {
        k71 k71Var = new k71(this.d, getContext(), this.currentAccount, 0, true, new e2(this, 15), this.resourcesProvider);
        this.Y = k71Var;
        k71Var.r = false;
        return k71Var;
    }

    @Override // org.telegram.ui.Components.bb
    public final CharSequence y() {
        return null;
    }
}
