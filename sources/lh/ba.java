package lh;

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
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.rl0;
import org.telegram.ui.Components.w51;
import org.telegram.ui.r70;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final class ba extends h51 {
    public static final /* synthetic */ int a = 0;

    static {
        h51.setup(new ba());
    }

    @Override // org.telegram.ui.Components.h51
    public final void bindView(View view, i51 i51Var, boolean z4, w51 w51Var, g61 g61Var) {
        String userName;
        boolean z10;
        boolean z11;
        org.telegram.ui.ActionBar.k5 k5Var;
        ca caVar = (ca) view;
        TL_stars.StarsSubscription starsSubscription = (TL_stars.StarsSubscription) i51Var.G;
        org.telegram.ui.ActionBar.k5 k5Var2 = caVar.d;
        org.telegram.ui.Components.p9 p9Var = caVar.c;
        org.telegram.ui.ActionBar.f6 f6Var = caVar.b;
        TextView textView = caVar.h;
        TextView textView2 = caVar.f;
        TextView textView3 = caVar.e;
        int i10 = caVar.a;
        TextView textView4 = caVar.n;
        long peerDialogId = DialogObject.getPeerDialogId(starsSubscription.peer);
        caVar.r = !TextUtils.isEmpty(starsSubscription.title);
        if (peerDialogId < 0) {
            TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-peerDialogId));
            org.telegram.ui.Components.z8 z8Var = new org.telegram.ui.Components.z8((org.telegram.ui.ActionBar.f6) null);
            z8Var.q(chat);
            p9Var.e(chat, z8Var);
            userName = chat != null ? chat.title : null;
            z10 = false;
        } else {
            TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(peerDialogId));
            org.telegram.ui.Components.z8 z8Var2 = new org.telegram.ui.Components.z8((org.telegram.ui.ActionBar.f6) null);
            z8Var2.r(user);
            p9Var.e(user, z8Var2);
            userName = UserObject.getUserName(user);
            z10 = !UserObject.isBot(user);
        }
        long currentTime = ConnectionsManager.getInstance(i10).getCurrentTime();
        k5Var2.l(Emoji.replaceEmoji(userName, k5Var2.getPaint().getFontMetricsInt(), false), false);
        if (TextUtils.isEmpty(starsSubscription.title)) {
            z11 = z10;
            textView3.setVisibility(8);
        } else {
            textView3.setVisibility(0);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            if (starsSubscription.photo != null) {
                r70 r70Var = new r70(textView3, 14.0f, i10);
                r70Var.a(4.0f);
                r70Var.f = false;
                SpannableString spannableString = new SpannableString("x");
                k5Var = k5Var2;
                z11 = z10;
                spannableString.setSpan(r70Var, 0, 1, 33);
                r70Var.b.setImage(ImageLocation.getForWebFile(WebFile.createWithWebDocument(starsSubscription.photo)), "14_14", null, null, 0, 0);
                spannableStringBuilder.append((CharSequence) spannableString).append((CharSequence) " ");
            } else {
                k5Var = k5Var2;
                z11 = z10;
            }
            spannableStringBuilder.append(Emoji.replaceEmoji(starsSubscription.title, k5Var.getPaint().getFontMetricsInt(), false));
            textView3.setText(spannableStringBuilder);
        }
        textView2.setTextSize(1, caVar.r ? 13.0f : 14.0f);
        if (starsSubscription.canceled || starsSubscription.bot_canceled) {
            long j10 = starsSubscription.until_date;
            textView2.setText(LocaleController.formatString(j10 < currentTime ? R.string.StarsSubscriptionExpired : R.string.StarsSubscriptionExpires, LocaleController.formatDateChat(j10)));
            textView.setVisibility(8);
            textView4.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.wj, f6Var));
            textView4.setText(LocaleController.getString(starsSubscription.bot_canceled ? z11 ? R.string.StarsSubscriptionStatusBizCancelled : R.string.StarsSubscriptionStatusBotCancelled : R.string.StarsSubscriptionStatusCancelled));
        } else {
            long j11 = starsSubscription.until_date;
            if (j11 < currentTime) {
                textView2.setText(LocaleController.formatString(R.string.StarsSubscriptionExpired, LocaleController.formatDateChat(j11)));
                textView.setVisibility(8);
                textView4.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.wj, f6Var));
                textView4.setText(LocaleController.getString(R.string.StarsSubscriptionStatusExpired));
            } else {
                textView2.setText(LocaleController.formatString(R.string.StarsSubscriptionRenews, LocaleController.formatDateChat(j11)));
                textView.setVisibility(0);
                textView.setText(ja.X0(false, "⭐️ " + Long.toString(starsSubscription.pricing.amount), 0.8f, null));
                textView4.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.z6, f6Var));
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
        caVar.s = z4;
        caVar.setWillNotDraw(!z4);
    }

    @Override // org.telegram.ui.Components.h51
    public final View createView(Context context, rl0 rl0Var, int i10, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        ca caVar = (ca) getCached();
        return caVar != null ? caVar : new ca(context, i10, f6Var);
    }

    @Override // org.telegram.ui.Components.h51
    public final boolean equals(i51 i51Var, i51 i51Var2) {
        if (i51Var2 == null) {
            return false;
        }
        Object obj = i51Var.G;
        if (!(obj instanceof TL_stars.StarsSubscription)) {
            return false;
        }
        Object obj2 = i51Var2.G;
        if (obj2 instanceof TL_stars.StarsSubscription) {
            return TextUtils.equals(((TL_stars.StarsSubscription) obj).id, ((TL_stars.StarsSubscription) obj2).id);
        }
        return false;
    }
}
