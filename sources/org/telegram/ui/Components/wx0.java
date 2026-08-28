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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class wx0 {
    public final org.telegram.ui.ActionBar.b6 a;
    public StaticLayout b;
    public final ArrayList c = new ArrayList(2);
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;

    public wx0(org.telegram.ui.ActionBar.b6 b6Var) {
        this.a = b6Var;
    }

    public static void c(StringBuilder sb2, int i9, boolean z10) {
        if (sb2.length() > 0) {
            if (z10) {
                sb2.append(' ');
                sb2.append(LocaleController.getString(R.string.SuggestionOfferInfoTitleEditedAnd));
                sb2.append(' ');
            } else {
                sb2.append(", ");
            }
        }
        sb2.append(LocaleController.getString(i9));
    }

    public final int a() {
        return this.g;
    }

    public final void b(MessageObject messageObject) {
        float f10;
        int i9;
        char c10;
        TLRPC.Message message;
        TLRPC.SuggestedPost suggestedPost = (messageObject == null || (message = messageObject.messageOwner) == null) ? null : message.suggested_post;
        if (suggestedPost == null) {
            return;
        }
        MessageSuggestionParams of2 = MessageSuggestionParams.of(suggestedPost);
        org.telegram.ui.ActionBar.b6 b6Var = this.a;
        Paint O = b6Var != null ? b6Var.O("paintChatActionText3") : null;
        if (O == null) {
            O = org.telegram.ui.ActionBar.f6.S0("paintChatActionText3");
        }
        TextPaint textPaint = (TextPaint) O;
        this.g = AndroidUtilities.dp(14.0f) * 2;
        ArrayList arrayList = this.c;
        arrayList.clear();
        gf.a aVar = of2.amount;
        if (aVar != null && !aVar.k()) {
            arrayList.add(new vx0(new nz0(LocaleController.getString(R.string.SuggestionOfferInfoPrice), textPaint), new nz0(LocaleController.bold(of2.amount.f()), textPaint)));
        }
        if (suggestedPost.schedule_date > 0) {
            arrayList.add(new vx0(new nz0(LocaleController.getString(R.string.SuggestionOfferInfoTime), textPaint), new nz0(LocaleController.bold(LocaleController.formatDateTime(suggestedPost.schedule_date, true)), textPaint)));
        }
        int size = arrayList.size();
        float f11 = 0.0f;
        float f12 = 0.0f;
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            vx0 vx0Var = (vx0) obj;
            f11 = Math.max(f11, vx0Var.a.l());
            f12 = Math.max(f12, vx0Var.b.l());
            int j10 = ((int) vx0Var.a.j()) + this.g;
            this.g = j10;
            this.g = AndroidUtilities.dp(7.0f) + j10;
        }
        int dp = (int) (f12 + f11 + AndroidUtilities.dp(11.0f));
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
            f10 = 11.0f;
        } else {
            MessageObject messageObject2 = messageObject.replyMessageObject;
            if (messageObject2 != null) {
                DialogObject.getName(messageObject2.getFromChatId());
            }
            StringBuilder sb2 = new StringBuilder();
            int i11 = editedSuggestionFlags & 4;
            int i12 = editedSuggestionFlags & 2;
            int i13 = editedSuggestionFlags & 8;
            int i14 = editedSuggestionFlags & 1;
            int i15 = (i11 != 0 ? 1 : 0) + (i12 != 0 ? 1 : 0) + (i13 != 0 ? 1 : 0) + (i14 != 0 ? 1 : 0);
            if (i14 != 0) {
                f10 = 11.0f;
                c(sb2, R.string.SuggestionOfferInfoTitleEditedPrice, i15 == 1);
                i9 = 1;
            } else {
                f10 = 11.0f;
                i9 = 0;
            }
            if (i12 != 0) {
                i9++;
                c10 = 0;
                c(sb2, R.string.SuggestionOfferInfoTitleEditedTime, i15 == i9);
            } else {
                c10 = 0;
            }
            if (i11 != 0) {
                i9++;
                c(sb2, R.string.SuggestionOfferInfoTitleEditedText, i15 == i9);
            }
            if (i13 != 0) {
                c(sb2, R.string.SuggestionOfferInfoTitleEditedMedia, i15 == i9 + 1);
            }
            if (messageObject.isOutOwner()) {
                int i16 = R.string.SuggestionOfferInfoTitleEditedFromYou;
                Object[] objArr = new Object[1];
                objArr[c10] = sb2;
                spannableStringBuilder.append((CharSequence) LocaleController.formatString(i16, objArr));
            } else {
                int i17 = R.string.SuggestionOfferInfoTitleEditedFromX;
                Object[] objArr2 = new Object[2];
                objArr2[c10] = name;
                objArr2[1] = sb2;
                spannableStringBuilder.append((CharSequence) LocaleController.formatString(i17, objArr2));
            }
        }
        this.b = new StaticLayout(AndroidUtilities.replaceTags(spannableStringBuilder), textPaint, max, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
        int i18 = 0;
        for (int i19 = 0; i19 < this.b.getLineCount(); i19++) {
            i18 = (int) Math.max(i18, this.b.getLineWidth(i19));
        }
        int height = this.b.getHeight() + this.g;
        this.g = height;
        this.g = AndroidUtilities.dp(5.0f) + height;
        int D = org.telegram.messenger.l0.D(24.0f, 2, Math.max(dp, i18));
        this.h = D;
        this.d = (D - max) / 2;
        this.e = (D - dp) / 2;
        this.f = (int) (AndroidUtilities.dp(f10) + r1 + f11);
    }
}
