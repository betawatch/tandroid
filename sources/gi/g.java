package gi;

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
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.g9;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.v9;
import org.telegram.ui.Components.x51;
import org.telegram.ui.Components.y51;
import org.telegram.ui.Components.yl0;
import s4.p0;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes4.dex */
public final class g extends x51 {
    public static final /* synthetic */ int a = 0;

    static {
        x51.setup(new g());
    }

    @Override // org.telegram.ui.Components.x51
    public final void bindView(View view, y51 y51Var, boolean z10, m61 m61Var, u61 u61Var) {
        h hVar = (h) view;
        f fVar = (f) y51Var.G;
        TLRPC.User user = fVar.b;
        long j3 = fVar.a;
        e eVar = (e) y51Var.H;
        boolean z11 = fVar.c;
        boolean z12 = !y51Var.j;
        v9 v9Var = hVar.c;
        TextView textView = hVar.n;
        TextView textView2 = hVar.d;
        hVar.x = eVar;
        hVar.y = j3;
        hVar.E = user.id;
        int i10 = hVar.b;
        TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-j3));
        TLRPC.User user2 = MessagesController.getInstance(i10).getUser(Long.valueOf(j3));
        hVar.f.setText(DialogObject.getName(j3));
        hVar.h.setText(AndroidUtilities.replaceSingleLink(LocaleController.formatString(user2 != null ? R.string.CommunityPendingRequestSuggestedBot : ChatObject.isChannelAndNotMegaGroup(chat) ? R.string.CommunityPendingRequestSuggestedChannel : R.string.CommunityPendingRequestSuggestedGroup, DialogObject.getShortName(user)), j6.w0(null, j6.il, false), new ai.f(12)));
        if (user2 != null) {
            textView2.setVisibility(8);
        } else if (chat == null || chat.participants_count <= 0) {
            textView2.setVisibility(8);
        } else {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("* ");
            spannableStringBuilder.setSpan(hVar.r, 0, 1, 33);
            spannableStringBuilder.append((CharSequence) LocaleController.formatNumberWithMillion(chat.participants_count, ','));
            textView2.setText(spannableStringBuilder);
            textView2.setVisibility(0);
        }
        if (z11) {
            textView.setVisibility(0);
        } else {
            textView.setVisibility(8);
        }
        hVar.w = z12;
        if (user2 != null) {
            v9Var.e(user2, new g9(0, user2));
        } else {
            v9Var.e(chat, new g9(chat));
        }
        hVar.e.e(user, new g9(0, user));
    }

    @Override // org.telegram.ui.Components.x51
    public final View createView(Context context, yl0 yl0Var, int i10, int i11, f6 f6Var) {
        h hVar = new h(context, i10, f6Var);
        hVar.setLayoutParams(new p0(-1, -2));
        hVar.setClickable(false);
        return hVar;
    }

    @Override // org.telegram.ui.Components.x51
    public final boolean equals(y51 y51Var, y51 y51Var2) {
        f fVar = (f) y51Var.G;
        f fVar2 = (f) y51Var2.G;
        return fVar.a == fVar2.a && DialogObject.getDialogId(fVar.b) == DialogObject.getDialogId(fVar2.b);
    }
}
