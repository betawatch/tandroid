package gh;

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
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.k41;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.wk0;
import org.telegram.ui.Components.z41;
import org.telegram.ui.c70;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class ga extends k41 {
    public static final /* synthetic */ int a = 0;

    static {
        k41.setup(new ga());
    }

    @Override // org.telegram.ui.Components.k41
    public final void bindView(View view, l41 l41Var, boolean z10, z41 z41Var, i51 i51Var) {
        String userName;
        boolean z11;
        boolean z12;
        org.telegram.ui.ActionBar.h5 h5Var;
        ha haVar = (ha) view;
        TL_stars.StarsSubscription starsSubscription = (TL_stars.StarsSubscription) l41Var.G;
        org.telegram.ui.ActionBar.h5 h5Var2 = haVar.d;
        org.telegram.ui.Components.o9 o9Var = haVar.c;
        org.telegram.ui.ActionBar.b6 b6Var = haVar.b;
        TextView textView = haVar.h;
        TextView textView2 = haVar.f;
        TextView textView3 = haVar.e;
        int i9 = haVar.a;
        TextView textView4 = haVar.n;
        long peerDialogId = DialogObject.getPeerDialogId(starsSubscription.peer);
        haVar.r = !TextUtils.isEmpty(starsSubscription.title);
        if (peerDialogId < 0) {
            TLRPC.Chat chat = MessagesController.getInstance(i9).getChat(Long.valueOf(-peerDialogId));
            org.telegram.ui.Components.z8 z8Var = new org.telegram.ui.Components.z8((org.telegram.ui.ActionBar.b6) null);
            z8Var.q(chat);
            o9Var.e(chat, z8Var);
            userName = chat != null ? chat.title : null;
            z11 = false;
        } else {
            TLRPC.User user = MessagesController.getInstance(i9).getUser(Long.valueOf(peerDialogId));
            org.telegram.ui.Components.z8 z8Var2 = new org.telegram.ui.Components.z8((org.telegram.ui.ActionBar.b6) null);
            z8Var2.r(user);
            o9Var.e(user, z8Var2);
            userName = UserObject.getUserName(user);
            z11 = !UserObject.isBot(user);
        }
        long currentTime = ConnectionsManager.getInstance(i9).getCurrentTime();
        h5Var2.l(Emoji.replaceEmoji(userName, h5Var2.getPaint().getFontMetricsInt(), false), false);
        if (TextUtils.isEmpty(starsSubscription.title)) {
            z12 = z11;
            textView3.setVisibility(8);
        } else {
            textView3.setVisibility(0);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            if (starsSubscription.photo != null) {
                c70 c70Var = new c70(textView3, 14.0f, i9);
                c70Var.a(4.0f);
                c70Var.f = false;
                SpannableString spannableString = new SpannableString("x");
                h5Var = h5Var2;
                z12 = z11;
                spannableString.setSpan(c70Var, 0, 1, 33);
                c70Var.b.setImage(ImageLocation.getForWebFile(WebFile.createWithWebDocument(starsSubscription.photo)), "14_14", null, null, 0, 0);
                spannableStringBuilder.append((CharSequence) spannableString).append((CharSequence) " ");
            } else {
                h5Var = h5Var2;
                z12 = z11;
            }
            spannableStringBuilder.append(Emoji.replaceEmoji(starsSubscription.title, h5Var.getPaint().getFontMetricsInt(), false));
            textView3.setText(spannableStringBuilder);
        }
        textView2.setTextSize(1, haVar.r ? 13.0f : 14.0f);
        if (starsSubscription.canceled || starsSubscription.bot_canceled) {
            long j10 = starsSubscription.until_date;
            textView2.setText(LocaleController.formatString(j10 < currentTime ? R.string.StarsSubscriptionExpired : R.string.StarsSubscriptionExpires, LocaleController.formatDateChat(j10)));
            textView.setVisibility(8);
            textView4.setTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.wj, b6Var));
            textView4.setText(LocaleController.getString(starsSubscription.bot_canceled ? z12 ? R.string.StarsSubscriptionStatusBizCancelled : R.string.StarsSubscriptionStatusBotCancelled : R.string.StarsSubscriptionStatusCancelled));
        } else {
            long j11 = starsSubscription.until_date;
            if (j11 < currentTime) {
                textView2.setText(LocaleController.formatString(R.string.StarsSubscriptionExpired, LocaleController.formatDateChat(j11)));
                textView.setVisibility(8);
                textView4.setTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.wj, b6Var));
                textView4.setText(LocaleController.getString(R.string.StarsSubscriptionStatusExpired));
            } else {
                textView2.setText(LocaleController.formatString(R.string.StarsSubscriptionRenews, LocaleController.formatDateChat(j11)));
                textView.setVisibility(0);
                textView.setText(oa.X0(false, "⭐️ " + Long.toString(starsSubscription.pricing.amount), 0.8f, null));
                textView4.setTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.z6, b6Var));
                int i10 = starsSubscription.pricing.period;
                if (i10 == 2592000) {
                    textView4.setText(LocaleController.getString(R.string.StarsParticipantSubscriptionPerMonth));
                } else if (i10 == 60) {
                    textView4.setText("per minute");
                } else if (i10 == 300) {
                    textView4.setText("per 5 minutes");
                }
            }
        }
        haVar.s = z10;
        haVar.setWillNotDraw(!z10);
    }

    @Override // org.telegram.ui.Components.k41
    public final View createView(Context context, wk0 wk0Var, int i9, int i10, org.telegram.ui.ActionBar.b6 b6Var) {
        ha haVar = (ha) getCached();
        return haVar != null ? haVar : new ha(context, i9, b6Var);
    }

    @Override // org.telegram.ui.Components.k41
    public final boolean equals(l41 l41Var, l41 l41Var2) {
        if (l41Var2 == null) {
            return false;
        }
        Object obj = l41Var.G;
        if (!(obj instanceof TL_stars.StarsSubscription)) {
            return false;
        }
        Object obj2 = l41Var2.G;
        if (obj2 instanceof TL_stars.StarsSubscription) {
            return TextUtils.equals(((TL_stars.StarsSubscription) obj).id, ((TL_stars.StarsSubscription) obj2).id);
        }
        return false;
    }
}
