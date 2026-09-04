package org.telegram.ui.Components;

import android.graphics.Paint;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessageSuggestionParams;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class oy0 {
    public final org.telegram.ui.ActionBar.f6 a;
    public StaticLayout b;
    public final ArrayList c = new ArrayList(2);
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;

    public oy0(org.telegram.ui.ActionBar.f6 f6Var) {
        this.a = f6Var;
    }

    public static void c(StringBuilder sb2, int i10, boolean z10) {
        if (sb2.length() > 0) {
            if (z10) {
                sb2.append(' ');
                sb2.append(LocaleController.getString(R.string.SuggestionOfferInfoTitleEditedAnd));
                sb2.append(' ');
            } else {
                sb2.append(", ");
            }
        }
        sb2.append(LocaleController.getString(i10));
    }

    public final int a() {
        return this.g;
    }

    public final void b(MessageObject messageObject) {
        float f7;
        int i10;
        char c10;
        TLRPC.Message message;
        TLRPC.SuggestedPost suggestedPost = (messageObject == null || (message = messageObject.messageOwner) == null) ? null : message.suggested_post;
        if (suggestedPost == null) {
            return;
        }
        MessageSuggestionParams of2 = MessageSuggestionParams.of(suggestedPost);
        org.telegram.ui.ActionBar.f6 f6Var = this.a;
        Paint G = f6Var != null ? f6Var.G("paintChatActionText3") : null;
        if (G == null) {
            G = org.telegram.ui.ActionBar.j6.S0("paintChatActionText3");
        }
        TextPaint textPaint = (TextPaint) G;
        this.g = AndroidUtilities.dp(14.0f) * 2;
        ArrayList arrayList = this.c;
        arrayList.clear();
        zf.a aVar = of2.amount;
        if (aVar != null && !aVar.k()) {
            arrayList.add(new ny0(new f01(LocaleController.getString(R.string.SuggestionOfferInfoPrice), textPaint), new f01(LocaleController.bold(of2.amount.f()), textPaint)));
        }
        if (suggestedPost.schedule_date > 0) {
            arrayList.add(new ny0(new f01(LocaleController.getString(R.string.SuggestionOfferInfoTime), textPaint), new f01(LocaleController.bold(LocaleController.formatDateTime(suggestedPost.schedule_date, true)), textPaint)));
        }
        int size = arrayList.size();
        float f10 = 0.0f;
        float f11 = 0.0f;
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            ny0 ny0Var = (ny0) obj;
            f10 = Math.max(f10, ny0Var.a.l());
            f11 = Math.max(f11, ny0Var.b.l());
            int j3 = ((int) ny0Var.a.j()) + this.g;
            this.g = j3;
            this.g = AndroidUtilities.dp(7.0f) + j3;
        }
        int dp = (int) (f11 + f10 + AndroidUtilities.dp(11.0f));
        int max = Math.max(dp, AndroidUtilities.dp(160.0f));
        String name = DialogObject.getName(messageObject.getFromChatId());
        int editedSuggestionFlags = messageObject.getEditedSuggestionFlags();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (editedSuggestionFlags == 0) {
            if (messageObject.isOutOwner()) {
                spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.SuggestionOfferInfoTitleYou));
            } else {
                spannableStringBuilder.append((CharSequence) LocaleController.formatString(R.string.SuggestionOfferInfoTitle, name));
            }
            f7 = 11.0f;
        } else {
            MessageObject messageObject2 = messageObject.replyMessageObject;
            if (messageObject2 != null) {
                DialogObject.getName(messageObject2.getFromChatId());
            }
            StringBuilder sb2 = new StringBuilder();
            int i12 = editedSuggestionFlags & 4;
            int i13 = editedSuggestionFlags & 2;
            int i14 = editedSuggestionFlags & 8;
            int i15 = editedSuggestionFlags & 1;
            int i16 = (i12 != 0 ? 1 : 0) + (i13 != 0 ? 1 : 0) + (i14 != 0 ? 1 : 0) + (i15 != 0 ? 1 : 0);
            if (i15 != 0) {
                f7 = 11.0f;
                c(sb2, R.string.SuggestionOfferInfoTitleEditedPrice, i16 == 1);
                i10 = 1;
            } else {
                f7 = 11.0f;
                i10 = 0;
            }
            if (i13 != 0) {
                i10++;
                c10 = 0;
                c(sb2, R.string.SuggestionOfferInfoTitleEditedTime, i16 == i10);
            } else {
                c10 = 0;
            }
            if (i12 != 0) {
                i10++;
                c(sb2, R.string.SuggestionOfferInfoTitleEditedText, i16 == i10);
            }
            if (i14 != 0) {
                c(sb2, R.string.SuggestionOfferInfoTitleEditedMedia, i16 == i10 + 1);
            }
            if (messageObject.isOutOwner()) {
                int i17 = R.string.SuggestionOfferInfoTitleEditedFromYou;
                Object[] objArr = new Object[1];
                objArr[c10] = sb2;
                spannableStringBuilder.append((CharSequence) LocaleController.formatString(i17, objArr));
            } else {
                int i18 = R.string.SuggestionOfferInfoTitleEditedFromX;
                Object[] objArr2 = new Object[2];
                objArr2[c10] = name;
                objArr2[1] = sb2;
                spannableStringBuilder.append((CharSequence) LocaleController.formatString(i18, objArr2));
            }
        }
        this.b = new StaticLayout(AndroidUtilities.replaceTags(spannableStringBuilder), textPaint, max, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
        int i19 = 0;
        for (int i20 = 0; i20 < this.b.getLineCount(); i20++) {
            i19 = (int) Math.max(i19, this.b.getLineWidth(i20));
        }
        int height = this.b.getHeight() + this.g;
        this.g = height;
        this.g = AndroidUtilities.dp(5.0f) + height;
        int D = org.telegram.messenger.w1.D(24.0f, 2, Math.max(dp, i19));
        this.h = D;
        this.d = (D - max) / 2;
        this.e = (D - dp) / 2;
        this.f = (int) (AndroidUtilities.dp(f7) + r1 + f10);
    }
}
