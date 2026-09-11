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

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final /* synthetic */ class lg implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;

    public /* synthetic */ lg(Object obj, long j3, long j10, int i10) {
        this.a = i10;
        this.d = obj;
        this.b = j3;
        this.c = j10;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0089 A[LOOP:1: B:19:0x0085->B:21:0x0089, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00bd  */
    @Override // org.telegram.messenger.Utilities.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run(Object obj) {
        org.telegram.ui.ActionBar.f6 f6Var;
        SpannableStringBuilder spannableStringBuilder;
        int size;
        int i10;
        int i11 = this.a;
        Object obj2 = this.d;
        switch (i11) {
            case 0:
                co.m1((co) obj2, this.b, this.c, (Long) obj);
                break;
            case 1:
                nj njVar = (nj) obj2;
                Long l4 = (Long) obj;
                co coVar = njVar.b;
                if (coVar.getParentActivity() != null) {
                    Activity parentActivity = coVar.getParentActivity();
                    String string = LocaleController.getString(R.string.RemoveMessageFeeTitle);
                    int i12 = ChatObject.isMonoForum(coVar.e) ? R.string.RemoveMessageFeeMessageChannel : R.string.RemoveMessageFeeMessage;
                    long j3 = this.b;
                    SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString(i12, DialogObject.getShortName(j3)));
                    String formatPluralStringComma = l4.longValue() > 0 ? LocaleController.formatPluralStringComma("RemoveMessageFeeRefund", (int) l4.longValue()) : null;
                    String string2 = LocaleController.getString(R.string.Confirm);
                    oh ohVar = new oh(njVar, j3, this.c, l4, 1);
                    f6Var = ((org.telegram.ui.ActionBar.n2) coVar).resourceProvider;
                    org.telegram.ui.Components.e5.i0(parentActivity, string, replaceTags, formatPluralStringComma, string2, ohVar, f6Var, true);
                    break;
                }
                break;
            default:
                zh.x2 x2Var = (zh.x2) obj2;
                ArrayList arrayList = (ArrayList) obj;
                org.telegram.ui.Components.y5 y5Var = x2Var.E;
                if (this.b == this.c) {
                    x2Var.d0 = arrayList;
                    y5Var.animate().alpha(x2Var.s ? 0.0f : x2Var.d0 != null ? 1.0f : 0.25f).setInterpolator(org.telegram.ui.Components.pr.h).setDuration(420L).start();
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
                                    spannableStringBuilder.setSpan(new org.telegram.ui.Components.z5(((TL_stars.starGiftAttributeModel) obj3).document, y5Var.getPaint().getFontMetricsInt()), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                                    spannableStringBuilder.append((CharSequence) " ");
                                }
                                if (spannableStringBuilder.length() > 0) {
                                    spannableStringBuilder.append((CharSequence) " ");
                                }
                                spannableStringBuilder.append(AndroidUtilities.replaceArrows(LocaleController.getString(R.string.GiftCraftViewAllVariants), false, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f)));
                                y5Var.setText(spannableStringBuilder);
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
                    y5Var.setText(spannableStringBuilder);
                }
                break;
        }
    }
}
