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

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class qz0 {
    public final org.telegram.ui.ActionBar.e6 a;
    public StaticLayout b;
    public final ArrayList c = new ArrayList(2);
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;

    public qz0(org.telegram.ui.ActionBar.e6 e6Var) {
        this.a = e6Var;
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
        int i11;
        TLRPC.Message message;
        TLRPC.SuggestedPost suggestedPost = (messageObject == null || (message = messageObject.messageOwner) == null) ? null : message.suggested_post;
        if (suggestedPost == null) {
            return;
        }
        MessageSuggestionParams of2 = MessageSuggestionParams.of(suggestedPost);
        org.telegram.ui.ActionBar.e6 e6Var = this.a;
        Paint F = e6Var != null ? e6Var.F("paintChatActionText3") : null;
        if (F == null) {
            F = org.telegram.ui.ActionBar.i6.T0("paintChatActionText3");
        }
        TextPaint textPaint = (TextPaint) F;
        this.g = AndroidUtilities.dp(14.0f) * 2;
        ArrayList arrayList = this.c;
        arrayList.clear();
        zf.a aVar = of2.amount;
        if (aVar != null && !aVar.k()) {
            arrayList.add(new pz0(new l11(LocaleController.getString(R.string.SuggestionOfferInfoPrice), textPaint), new l11(LocaleController.bold(of2.amount.f()), textPaint)));
        }
        if (suggestedPost.schedule_date > 0) {
            arrayList.add(new pz0(new l11(LocaleController.getString(R.string.SuggestionOfferInfoTime), textPaint), new l11(LocaleController.bold(LocaleController.formatDateTime(suggestedPost.schedule_date, true)), textPaint)));
        }
        int size = arrayList.size();
        float f10 = 0.0f;
        float f11 = 0.0f;
        int i12 = 0;
        while (i12 < size) {
            Object obj = arrayList.get(i12);
            i12++;
            pz0 pz0Var = (pz0) obj;
            f10 = Math.max(f10, pz0Var.a.l());
            f11 = Math.max(f11, pz0Var.b.l());
            int j3 = ((int) pz0Var.a.j()) + this.g;
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
            i11 = 0;
        } else {
            MessageObject messageObject2 = messageObject.replyMessageObject;
            if (messageObject2 != null) {
                DialogObject.getName(messageObject2.getFromChatId());
            }
            StringBuilder sb2 = new StringBuilder();
            int i13 = editedSuggestionFlags & 4;
            int i14 = editedSuggestionFlags & 2;
            int i15 = editedSuggestionFlags & 8;
            int i16 = editedSuggestionFlags & 1;
            int i17 = (i13 != 0 ? 1 : 0) + (i14 != 0 ? 1 : 0) + (i15 != 0 ? 1 : 0) + (i16 != 0 ? 1 : 0);
            if (i16 != 0) {
                f7 = 11.0f;
                c(sb2, R.string.SuggestionOfferInfoTitleEditedPrice, i17 == 1);
                i10 = 1;
            } else {
                f7 = 11.0f;
                i10 = 0;
            }
            if (i14 != 0) {
                i10++;
                i11 = 0;
                c(sb2, R.string.SuggestionOfferInfoTitleEditedTime, i17 == i10);
            } else {
                i11 = 0;
            }
            if (i13 != 0) {
                i10++;
                c(sb2, R.string.SuggestionOfferInfoTitleEditedText, i17 == i10 ? true : i11 == true ? 1 : 0);
            }
            if (i15 != 0) {
                c(sb2, R.string.SuggestionOfferInfoTitleEditedMedia, i17 == i10 + 1 ? true : i11 == true ? 1 : 0);
            }
            if (messageObject.isOutOwner()) {
                int i18 = R.string.SuggestionOfferInfoTitleEditedFromYou;
                Object[] objArr = new Object[1];
                objArr[i11 == true ? 1 : 0] = sb2;
                spannableStringBuilder.append((CharSequence) LocaleController.formatString(i18, objArr));
            } else {
                int i19 = R.string.SuggestionOfferInfoTitleEditedFromX;
                Object[] objArr2 = new Object[2];
                objArr2[i11 == true ? 1 : 0] = name;
                objArr2[1] = sb2;
                spannableStringBuilder.append((CharSequence) LocaleController.formatString(i19, objArr2));
            }
        }
        this.b = new StaticLayout(AndroidUtilities.replaceTags(spannableStringBuilder), textPaint, max, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
        int i20 = i11;
        for (int i21 = i20; i21 < this.b.getLineCount(); i21++) {
            i20 = (int) Math.max(i20, this.b.getLineWidth(i21));
        }
        int height = this.b.getHeight() + this.g;
        this.g = height;
        this.g = AndroidUtilities.dp(5.0f) + height;
        int D = org.telegram.messenger.q.D(24.0f, 2, Math.max(dp, i20));
        this.h = D;
        this.d = (D - max) / 2;
        this.e = (D - dp) / 2;
        this.f = (int) (AndroidUtilities.dp(f7) + r1 + f10);
    }
}
