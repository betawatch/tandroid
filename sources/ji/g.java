package ji;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.j9;
import org.telegram.ui.Components.k71;
import org.telegram.ui.Components.nm0;
import org.telegram.ui.Components.s71;
import org.telegram.ui.Components.t61;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.y9;
import s4.q0;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class g extends t61 {
    public static final /* synthetic */ int a = 0;

    static {
        t61.setup(new g());
    }

    @Override // org.telegram.ui.Components.t61
    public final void bindView(View view, u61 u61Var, boolean z10, k71 k71Var, s71 s71Var) {
        h hVar = (h) view;
        f fVar = (f) u61Var.G;
        TLRPC.User user = fVar.b;
        long j10 = fVar.a;
        e eVar = (e) u61Var.H;
        boolean z11 = fVar.c;
        boolean z12 = !u61Var.j;
        y9 y9Var = hVar.c;
        TextView textView = hVar.n;
        TextView textView2 = hVar.d;
        hVar.E = eVar;
        hVar.F = j10;
        hVar.G = user.id;
        int i10 = hVar.b;
        TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-j10));
        TLRPC.User user2 = MessagesController.getInstance(i10).getUser(Long.valueOf(j10));
        hVar.f.setText(DialogObject.getName(j10));
        hVar.h.setText(AndroidUtilities.replaceSingleLinkKey(LocaleController.formatString(user2 != null ? R.string.CommunityPendingRequestSuggestedBot : ChatObject.isChannelAndNotMegaGroup(chat) ? R.string.CommunityPendingRequestSuggestedChannel : R.string.CommunityPendingRequestSuggestedGroup, DialogObject.getShortName(user)), y6.il, null, new ag.c(20)));
        if (user2 != null) {
            textView2.setVisibility(8);
        } else if (chat == null || chat.participants_count <= 0) {
            textView2.setVisibility(8);
        } else {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("* ");
            spannableStringBuilder.setSpan(hVar.s, 0, 1, 33);
            spannableStringBuilder.append((CharSequence) LocaleController.formatNumberWithMillion(chat.participants_count, ','));
            textView2.setText(spannableStringBuilder);
            textView2.setVisibility(0);
        }
        if (z11) {
            textView.setVisibility(0);
        } else {
            textView.setVisibility(8);
        }
        hVar.x = z12;
        if (user2 != null) {
            y9Var.f(user2, new j9(0, user2));
        } else {
            y9Var.f(chat, new j9(chat));
        }
        hVar.e.f(user, new j9(0, user));
    }

    @Override // org.telegram.ui.Components.t61
    public final View createView(Context context, nm0 nm0Var, int i10, int i11, u6 u6Var) {
        h hVar = new h(context, i10, u6Var);
        hVar.setLayoutParams(new q0(-1, -2));
        hVar.setClickable(false);
        return hVar;
    }

    @Override // org.telegram.ui.Components.t61
    public final boolean equals(u61 u61Var, u61 u61Var2) {
        f fVar = (f) u61Var.G;
        f fVar2 = (f) u61Var2.G;
        return fVar.a == fVar2.a && DialogObject.getDialogId(fVar.b) == DialogObject.getDialogId(fVar2.b);
    }
}
