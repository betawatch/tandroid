package oh;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.TextView;
import bg.d2;
import f2.a1;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.k41;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.o9;
import org.telegram.ui.Components.wk0;
import org.telegram.ui.Components.z41;
import org.telegram.ui.Components.z8;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class f extends k41 {
    public static final /* synthetic */ int a = 0;

    static {
        k41.setup(new f());
    }

    @Override // org.telegram.ui.Components.k41
    public final void bindView(View view, l41 l41Var, boolean z10, z41 z41Var, i51 i51Var) {
        g gVar = (g) view;
        e eVar = (e) l41Var.G;
        TLRPC.User user = eVar.b;
        long j10 = eVar.a;
        d dVar = (d) l41Var.H;
        boolean z11 = eVar.c;
        boolean z12 = !l41Var.j;
        o9 o9Var = gVar.c;
        TextView textView = gVar.n;
        TextView textView2 = gVar.d;
        gVar.x = dVar;
        gVar.y = j10;
        gVar.A = user.id;
        int i9 = gVar.b;
        TLRPC.Chat chat = MessagesController.getInstance(i9).getChat(Long.valueOf(-j10));
        TLRPC.User user2 = MessagesController.getInstance(i9).getUser(Long.valueOf(j10));
        gVar.f.setText(DialogObject.getName(j10));
        gVar.h.setText(AndroidUtilities.replaceSingleLink(LocaleController.formatString(user2 != null ? R.string.CommunityPendingRequestSuggestedBot : ChatObject.isChannelAndNotMegaGroup(chat) ? R.string.CommunityPendingRequestSuggestedChannel : R.string.CommunityPendingRequestSuggestedGroup, DialogObject.getShortName(user)), f6.w0(null, f6.il, false), new d2(20)));
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
            o9Var.e(user2, new z8(0, user2));
        } else {
            o9Var.e(chat, new z8(chat));
        }
        gVar.e.e(user, new z8(0, user));
    }

    @Override // org.telegram.ui.Components.k41
    public final View createView(Context context, wk0 wk0Var, int i9, int i10, b6 b6Var) {
        g gVar = new g(context, i9, b6Var);
        gVar.setLayoutParams(new a1(-1, -2));
        gVar.setClickable(false);
        return gVar;
    }

    @Override // org.telegram.ui.Components.k41
    public final boolean equals(l41 l41Var, l41 l41Var2) {
        e eVar = (e) l41Var.G;
        e eVar2 = (e) l41Var2.G;
        return eVar.a == eVar2.a && DialogObject.getDialogId(eVar.b) == DialogObject.getDialogId(eVar2.b);
    }
}
