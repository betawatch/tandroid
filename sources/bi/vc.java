package bi;

import android.content.Context;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.WebFile;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.j71;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.r71;
import org.telegram.ui.Components.s61;
import org.telegram.ui.Components.t61;
import org.telegram.ui.j70;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final class vc extends s61 {
    public static final /* synthetic */ int a = 0;

    static {
        s61.setup(new vc());
    }

    @Override // org.telegram.ui.Components.s61
    public final void bindView(View view, t61 t61Var, boolean z10, j71 j71Var, r71 r71Var) {
        String userName;
        boolean z11;
        boolean z12;
        org.telegram.ui.ActionBar.b6 b6Var;
        wc wcVar = (wc) view;
        TL_stars.StarsSubscription starsSubscription = (TL_stars.StarsSubscription) t61Var.G;
        org.telegram.ui.ActionBar.b6 b6Var2 = wcVar.d;
        org.telegram.ui.Components.y9 y9Var = wcVar.c;
        org.telegram.ui.ActionBar.u6 u6Var = wcVar.b;
        TextView textView = wcVar.h;
        TextView textView2 = wcVar.f;
        TextView textView3 = wcVar.e;
        int i10 = wcVar.a;
        TextView textView4 = wcVar.n;
        long peerDialogId = DialogObject.getPeerDialogId(starsSubscription.peer);
        wcVar.r = !TextUtils.isEmpty(starsSubscription.title);
        if (peerDialogId < 0) {
            TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-peerDialogId));
            org.telegram.ui.Components.j9 j9Var = new org.telegram.ui.Components.j9((org.telegram.ui.ActionBar.u6) null);
            j9Var.q(chat);
            y9Var.f(chat, j9Var);
            userName = chat != null ? chat.title : null;
            z11 = false;
        } else {
            TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(peerDialogId));
            org.telegram.ui.Components.j9 j9Var2 = new org.telegram.ui.Components.j9((org.telegram.ui.ActionBar.u6) null);
            j9Var2.r(user);
            y9Var.f(user, j9Var2);
            userName = UserObject.getUserName(user);
            z11 = !UserObject.isBot(user);
        }
        long currentTime = ConnectionsManager.getInstance(i10).getCurrentTime();
        b6Var2.l(Emoji.replaceEmoji(userName, b6Var2.getPaint().getFontMetricsInt(), false), false);
        if (TextUtils.isEmpty(starsSubscription.title)) {
            z12 = z11;
            textView3.setVisibility(8);
        } else {
            textView3.setVisibility(0);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            if (starsSubscription.photo != null) {
                j70 j70Var = new j70(textView3, 14.0f, i10);
                j70Var.a(4.0f);
                j70Var.f = false;
                SpannableString spannableString = new SpannableString("x");
                b6Var = b6Var2;
                z12 = z11;
                spannableString.setSpan(j70Var, 0, 1, 33);
                j70Var.b.setImage(ImageLocation.getForWebFile(WebFile.createWithWebDocument(starsSubscription.photo)), "14_14", null, null, 0, 0);
                spannableStringBuilder.append((CharSequence) spannableString).append((CharSequence) " ");
            } else {
                b6Var = b6Var2;
                z12 = z11;
            }
            spannableStringBuilder.append(Emoji.replaceEmoji(starsSubscription.title, b6Var.getPaint().getFontMetricsInt(), false));
            textView3.setText(spannableStringBuilder);
        }
        textView2.setTextSize(1, wcVar.r ? 13.0f : 14.0f);
        if (starsSubscription.canceled || starsSubscription.bot_canceled) {
            long j10 = starsSubscription.until_date;
            textView2.setText(LocaleController.formatString(j10 < currentTime ? R.string.StarsSubscriptionExpired : R.string.StarsSubscriptionExpires, LocaleController.formatDateChat(j10)));
            textView.setVisibility(8);
            org.telegram.ui.ActionBar.f7.V(textView4, org.telegram.ui.ActionBar.y6.wj, u6Var);
            textView4.setText(LocaleController.getString(starsSubscription.bot_canceled ? z12 ? R.string.StarsSubscriptionStatusBizCancelled : R.string.StarsSubscriptionStatusBotCancelled : R.string.StarsSubscriptionStatusCancelled));
        } else {
            long j11 = starsSubscription.until_date;
            if (j11 < currentTime) {
                textView2.setText(LocaleController.formatString(R.string.StarsSubscriptionExpired, LocaleController.formatDateChat(j11)));
                textView.setVisibility(8);
                org.telegram.ui.ActionBar.f7.V(textView4, org.telegram.ui.ActionBar.y6.wj, u6Var);
                textView4.setText(LocaleController.getString(R.string.StarsSubscriptionStatusExpired));
            } else {
                textView2.setText(LocaleController.formatString(R.string.StarsSubscriptionRenews, LocaleController.formatDateChat(j11)));
                textView.setVisibility(0);
                textView.setText(dd.W0(false, "⭐️ " + Long.toString(starsSubscription.pricing.amount), 0.8f, null));
                org.telegram.ui.ActionBar.f7.V(textView4, org.telegram.ui.ActionBar.y6.z6, u6Var);
                int i11 = starsSubscription.pricing.period;
                if (i11 == 2592000) {
                    textView4.setText(LocaleController.getString(R.string.StarsParticipantSubscriptionPerMonth));
                } else if (i11 == 60) {
                    textView4.setText("per minute");
                } else if (i11 == 300) {
                    textView4.setText("per 5 minutes");
                }
            }
        }
        wcVar.s = z10;
        wcVar.setWillNotDraw(!z10);
    }

    @Override // org.telegram.ui.Components.s61
    public final View createView(Context context, mm0 mm0Var, int i10, int i11, org.telegram.ui.ActionBar.u6 u6Var) {
        wc wcVar = (wc) getCached();
        return wcVar != null ? wcVar : new wc(context, i10, u6Var);
    }

    @Override // org.telegram.ui.Components.s61
    public final boolean equals(t61 t61Var, t61 t61Var2) {
        if (t61Var2 == null) {
            return false;
        }
        Object obj = t61Var.G;
        if (!(obj instanceof TL_stars.StarsSubscription)) {
            return false;
        }
        Object obj2 = t61Var2.G;
        if (obj2 instanceof TL_stars.StarsSubscription) {
            return TextUtils.equals(((TL_stars.StarsSubscription) obj).id, ((TL_stars.StarsSubscription) obj2).id);
        }
        return false;
    }
}
