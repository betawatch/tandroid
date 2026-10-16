package org.telegram.ui;

import android.app.Activity;
import android.text.SpannableStringBuilder;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ih implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ih(Object obj, long j10, long j11, int i10) {
        this.a = i10;
        this.d = obj;
        this.b = j10;
        this.c = j11;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0088 A[LOOP:1: B:19:0x0084->B:21:0x0088, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00bc  */
    @Override // org.telegram.messenger.Utilities.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run(Object obj) {
        org.telegram.ui.ActionBar.c6 c6Var;
        SpannableStringBuilder spannableStringBuilder;
        int size;
        int i10;
        int i11 = this.a;
        Object obj2 = this.d;
        switch (i11) {
            case 0:
                fo.R0((fo) obj2, this.b, this.c, (Long) obj);
                break;
            case 1:
                sj sjVar = (sj) obj2;
                Long l4 = (Long) obj;
                fo foVar = sjVar.b;
                if (foVar.getParentActivity() != null) {
                    Activity parentActivity = foVar.getParentActivity();
                    String string = LocaleController.getString(R.string.RemoveMessageFeeTitle);
                    int i12 = ChatObject.isMonoForum(foVar.e) ? R.string.RemoveMessageFeeMessageChannel : R.string.RemoveMessageFeeMessage;
                    long j10 = this.b;
                    SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString(i12, DialogObject.getShortName(j10)));
                    String formatPluralStringComma = l4.longValue() > 0 ? LocaleController.formatPluralStringComma("RemoveMessageFeeRefund", (int) l4.longValue()) : null;
                    String string2 = LocaleController.getString(R.string.Confirm);
                    ph phVar = new ph(sjVar, j10, this.c, l4, 1);
                    c6Var = ((org.telegram.ui.ActionBar.m2) foVar).resourceProvider;
                    org.telegram.ui.Components.g5.h0(parentActivity, string, replaceTags, formatPluralStringComma, string2, phVar, c6Var, true);
                    break;
                }
                break;
            default:
                zh.s2 s2Var = (zh.s2) obj2;
                ArrayList arrayList = (ArrayList) obj;
                org.telegram.ui.Components.a6 a6Var = s2Var.E;
                if (this.b == this.c) {
                    s2Var.d0 = arrayList;
                    a6Var.animate().alpha(s2Var.s ? 0.0f : s2Var.d0 != null ? 1.0f : 0.25f).setInterpolator(org.telegram.ui.Components.es.h).setDuration(420L).start();
                    ArrayList arrayList2 = new ArrayList();
                    for (int i13 = 0; i13 < arrayList.size(); i13++) {
                        if ((arrayList.get(i13) instanceof TL_stars.starGiftAttributeModel) && !(((TL_stars.StarGiftAttribute) arrayList.get(i13)).rarity instanceof TL_stars.TL_starGiftAttributeRarity)) {
                            arrayList2.add((TL_stars.starGiftAttributeModel) arrayList.get(i13));
                            if (arrayList2.size() >= 3) {
                                spannableStringBuilder = new SpannableStringBuilder();
                                size = arrayList2.size();
                                i10 = 0;
                                while (i10 < size) {
                                    Object obj3 = arrayList2.get(i10);
                                    i10++;
                                    spannableStringBuilder.append((CharSequence) "x");
                                    spannableStringBuilder.setSpan(new org.telegram.ui.Components.b6(((TL_stars.starGiftAttributeModel) obj3).document, a6Var.getPaint().getFontMetricsInt()), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                                    spannableStringBuilder.append((CharSequence) " ");
                                }
                                if (spannableStringBuilder.length() > 0) {
                                    spannableStringBuilder.append((CharSequence) " ");
                                }
                                spannableStringBuilder.append(AndroidUtilities.replaceArrows(LocaleController.getString(R.string.GiftCraftViewAllVariants), false, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f)));
                                a6Var.setText(spannableStringBuilder);
                                break;
                            }
                        }
                    }
                    spannableStringBuilder = new SpannableStringBuilder();
                    size = arrayList2.size();
                    i10 = 0;
                    while (i10 < size) {
                    }
                    if (spannableStringBuilder.length() > 0) {
                    }
                    spannableStringBuilder.append(AndroidUtilities.replaceArrows(LocaleController.getString(R.string.GiftCraftViewAllVariants), false, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f)));
                    a6Var.setText(spannableStringBuilder);
                }
                break;
        }
    }
}
