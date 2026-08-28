package org.telegram.ui.Cells;

import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.i41;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class m3 {
    public boolean a;
    public StaticLayout b;
    public StaticLayout c;
    public int d;
    public int e;
    public float f;
    public float g;
    public float h;
    public float i;

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(t1 t1Var) {
        TLRPC.Message message;
        String str;
        SpannableStringBuilder e10 = ih.p7.e(R.string.ExpiredStory, false, new Object[0]);
        MessageObject messageObject = t1Var.getMessageObject();
        if (messageObject != null && (message = messageObject.messageOwner) != null) {
            TLRPC.MessageMedia messageMedia = message.media;
            if (messageMedia instanceof TLRPC.TL_messageMediaStory) {
                TLRPC.User user = MessagesController.getInstance(t1Var.E7).getUser(Long.valueOf(((TLRPC.TL_messageMediaStory) messageMedia).user_id));
                String str2 = user == null ? "DELETED" : user.first_name;
                int minTabletSide = (int) ((AndroidUtilities.isTablet() ? AndroidUtilities.getMinTabletSide() : t1Var.getParentWidth()) * 0.4f);
                String string = LocaleController.getString(R.string.From);
                TextPaint textPaint = org.telegram.ui.ActionBar.f6.X2;
                int ceil = (int) Math.ceil(textPaint.measureText(string + " "));
                if (str2 == null) {
                    str2 = "";
                }
                String str3 = (String) TextUtils.ellipsize(str2.replace('\n', ' '), org.telegram.ui.ActionBar.f6.Y2, minTabletSide - ceil, TextUtils.TruncateAt.END);
                String string2 = LocaleController.getString(R.string.FromFormatted);
                int indexOf = string2.indexOf("%1$s");
                String format = String.format(string2, str3);
                if (indexOf >= 0) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(format);
                    spannableStringBuilder.setSpan(new i41(AndroidUtilities.bold()), indexOf, str3.length() + indexOf, 33);
                    str = spannableStringBuilder;
                } else {
                    str = format;
                }
                TextPaint textPaint2 = org.telegram.ui.ActionBar.f6.Z2;
                int dp = AndroidUtilities.dp(10.0f) + ((int) (textPaint2.measureText(e10, 0, e10.length()) + 1.0f));
                Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
                this.b = new StaticLayout(e10, textPaint2, dp, alignment, 1.0f, 0.0f, false);
                this.c = new StaticLayout(str, textPaint2, AndroidUtilities.dp(10.0f) + ((int) (textPaint2.measureText((CharSequence) str, 0, str.length()) + 1.0f)), alignment, 1.0f, 0.0f, false);
                this.e = 0;
                this.h = AndroidUtilities.dp(4.0f);
                this.i = AndroidUtilities.dp(12.0f);
                this.e = (int) aa.d.w(this.h, 2.0f, AndroidUtilities.dp(4.0f) + this.c.getHeight() + AndroidUtilities.dp(2.0f) + this.b.getHeight() + AndroidUtilities.dp(4.0f), this.e);
                this.d = t1Var.getExtraTextX() + AndroidUtilities.dp(20.0f) + AndroidUtilities.dp(12.0f) + Math.max(this.b.getWidth(), this.c.getWidth());
                return;
            }
        }
        this.h = AndroidUtilities.dp(4.0f);
        this.i = AndroidUtilities.dp(12.0f);
        this.e = 0;
        this.d = 0;
    }
}
