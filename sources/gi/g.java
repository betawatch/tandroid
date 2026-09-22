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
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.e61;
import org.telegram.ui.Components.f9;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.u9;
import org.telegram.ui.Components.w51;
import s4.p0;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes4.dex */
public final class g extends h51 {
    public static final /* synthetic */ int a = 0;

    static {
        h51.setup(new g());
    }

    @Override // org.telegram.ui.Components.h51
    public final void bindView(View view, i51 i51Var, boolean z10, w51 w51Var, e61 e61Var) {
        h hVar = (h) view;
        f fVar = (f) i51Var.G;
        TLRPC.User user = fVar.b;
        long j3 = fVar.a;
        e eVar = (e) i51Var.H;
        boolean z11 = fVar.c;
        boolean z12 = !i51Var.j;
        u9 u9Var = hVar.c;
        TextView textView = hVar.n;
        TextView textView2 = hVar.d;
        hVar.x = eVar;
        hVar.y = j3;
        hVar.E = user.id;
        int i10 = hVar.b;
        TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-j3));
        TLRPC.User user2 = MessagesController.getInstance(i10).getUser(Long.valueOf(j3));
        hVar.f.setText(DialogObject.getName(j3));
        hVar.h.setText(AndroidUtilities.replaceSingleLink(LocaleController.formatString(user2 != null ? R.string.CommunityPendingRequestSuggestedBot : ChatObject.isChannelAndNotMegaGroup(chat) ? R.string.CommunityPendingRequestSuggestedChannel : R.string.CommunityPendingRequestSuggestedGroup, DialogObject.getShortName(user)), i6.w0(null, i6.il, false), new ai.f(12)));
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
            u9Var.e(user2, new f9(0, user2));
        } else {
            u9Var.e(chat, new f9(chat));
        }
        hVar.e.e(user, new f9(0, user));
    }

    @Override // org.telegram.ui.Components.h51
    public final View createView(Context context, ll0 ll0Var, int i10, int i11, e6 e6Var) {
        h hVar = new h(context, i10, e6Var);
        hVar.setLayoutParams(new p0(-1, -2));
        hVar.setClickable(false);
        return hVar;
    }

    @Override // org.telegram.ui.Components.h51
    public final boolean equals(i51 i51Var, i51 i51Var2) {
        f fVar = (f) i51Var.G;
        f fVar2 = (f) i51Var2.G;
        return fVar.a == fVar2.a && DialogObject.getDialogId(fVar.b) == DialogObject.getDialogId(fVar2.b);
    }
}
