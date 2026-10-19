package ii;

import ah.j;
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
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.b71;
import org.telegram.ui.Components.f61;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.h9;
import org.telegram.ui.Components.im0;
import org.telegram.ui.Components.t61;
import org.telegram.ui.Components.w9;
import s4.o0;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes4.dex */
public final class f extends f61 {
    public static final /* synthetic */ int a = 0;

    static {
        f61.setup(new f());
    }

    @Override // org.telegram.ui.Components.f61
    public final void bindView(View view, g61 g61Var, boolean z10, t61 t61Var, b71 b71Var) {
        g gVar = (g) view;
        e eVar = (e) g61Var.G;
        TLRPC.User user = eVar.b;
        long j10 = eVar.a;
        d dVar = (d) g61Var.H;
        boolean z11 = eVar.c;
        boolean z12 = !g61Var.j;
        w9 w9Var = gVar.c;
        TextView textView = gVar.n;
        TextView textView2 = gVar.d;
        gVar.x = dVar;
        gVar.y = j10;
        gVar.E = user.id;
        int i10 = gVar.b;
        TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-j10));
        TLRPC.User user2 = MessagesController.getInstance(i10).getUser(Long.valueOf(j10));
        gVar.f.setText(DialogObject.getName(j10));
        gVar.h.setText(AndroidUtilities.replaceSingleLink(LocaleController.formatString(user2 != null ? R.string.CommunityPendingRequestSuggestedBot : ChatObject.isChannelAndNotMegaGroup(chat) ? R.string.CommunityPendingRequestSuggestedChannel : R.string.CommunityPendingRequestSuggestedGroup, DialogObject.getShortName(user)), h6.x0(null, h6.il, false), new j(18)));
        if (user2 != null) {
            textView2.setVisibility(8);
        } else if (chat == null || chat.participants_count <= 0) {
            textView2.setVisibility(8);
        } else {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("* ");
            spannableStringBuilder.setSpan(gVar.r, 0, 1, 33);
            spannableStringBuilder.append((CharSequence) LocaleController.formatNumberWithMillion(chat.participants_count, ','));
            textView2.setText(spannableStringBuilder);
            textView2.setVisibility(0);
        }
        if (z11) {
            textView.setVisibility(0);
        } else {
            textView.setVisibility(8);
        }
        gVar.w = z12;
        if (user2 != null) {
            w9Var.e(user2, new h9(0, user2));
        } else {
            w9Var.e(chat, new h9(chat));
        }
        gVar.e.e(user, new h9(0, user));
    }

    @Override // org.telegram.ui.Components.f61
    public final View createView(Context context, im0 im0Var, int i10, int i11, d6 d6Var) {
        g gVar = new g(context, i10, d6Var);
        gVar.setLayoutParams(new o0(-1, -2));
        gVar.setClickable(false);
        return gVar;
    }

    @Override // org.telegram.ui.Components.f61
    public final boolean equals(g61 g61Var, g61 g61Var2) {
        e eVar = (e) g61Var.G;
        e eVar2 = (e) g61Var2.G;
        return eVar.a == eVar2.a && DialogObject.getDialogId(eVar.b) == DialogObject.getDialogId(eVar2.b);
    }
}
