package jh;

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
import org.telegram.ui.Components.jr;
import org.telegram.ui.ch;
import org.telegram.ui.ej;
import org.telegram.ui.tn;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final /* synthetic */ class u3 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;

    public /* synthetic */ u3(Object obj, long j10, long j11, int i10) {
        this.a = i10;
        this.d = obj;
        this.b = j10;
        this.c = j11;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0105 A[LOOP:1: B:36:0x0101->B:38:0x0105, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0139  */
    @Override // org.telegram.messenger.Utilities.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run(Object obj) {
        SpannableStringBuilder spannableStringBuilder;
        int size;
        int i10;
        org.telegram.ui.ActionBar.c6 c6Var;
        int i11 = this.a;
        Object obj2 = this.d;
        switch (i11) {
            case 0:
                g4 g4Var = (g4) obj2;
                ArrayList arrayList = (ArrayList) obj;
                org.telegram.ui.Components.x5 x5Var = g4Var.A;
                if (this.b == this.c) {
                    g4Var.W = arrayList;
                    x5Var.animate().alpha(g4Var.s ? 0.0f : g4Var.W != null ? 1.0f : 0.25f).setInterpolator(jr.h).setDuration(420L).start();
                    ArrayList arrayList2 = new ArrayList();
                    for (int i12 = 0; i12 < arrayList.size(); i12++) {
                        if ((arrayList.get(i12) instanceof TL_stars.starGiftAttributeModel) && !(((TL_stars.StarGiftAttribute) arrayList.get(i12)).rarity instanceof TL_stars.TL_starGiftAttributeRarity)) {
                            arrayList2.add((TL_stars.starGiftAttributeModel) arrayList.get(i12));
                            if (arrayList2.size() >= 3) {
                                spannableStringBuilder = new SpannableStringBuilder();
                                size = arrayList2.size();
                                i10 = 0;
                                while (i10 < size) {
                                    Object obj3 = arrayList2.get(i10);
                                    i10++;
                                    spannableStringBuilder.append((CharSequence) "x");
                                    spannableStringBuilder.setSpan(new org.telegram.ui.Components.y5(((TL_stars.starGiftAttributeModel) obj3).document, x5Var.getPaint().getFontMetricsInt()), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                                    spannableStringBuilder.append((CharSequence) " ");
                                }
                                if (spannableStringBuilder.length() > 0) {
                                    spannableStringBuilder.append((CharSequence) " ");
                                }
                                spannableStringBuilder.append(AndroidUtilities.replaceArrows(LocaleController.getString(R.string.GiftCraftViewAllVariants), false, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f)));
                                x5Var.setText(spannableStringBuilder);
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
                    x5Var.setText(spannableStringBuilder);
                }
                break;
            case 1:
                tn.m1((tn) obj2, this.b, this.c, (Long) obj);
                break;
            default:
                ej ejVar = (ej) obj2;
                Long l10 = (Long) obj;
                tn tnVar = ejVar.b;
                if (tnVar.getParentActivity() != null) {
                    Activity parentActivity = tnVar.getParentActivity();
                    String string = LocaleController.getString(R.string.RemoveMessageFeeTitle);
                    int i13 = ChatObject.isMonoForum(tnVar.e) ? R.string.RemoveMessageFeeMessageChannel : R.string.RemoveMessageFeeMessage;
                    long j10 = this.b;
                    SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString(i13, DialogObject.getShortName(j10)));
                    String formatPluralStringComma = l10.longValue() > 0 ? LocaleController.formatPluralStringComma("RemoveMessageFeeRefund", (int) l10.longValue()) : null;
                    String string2 = LocaleController.getString(R.string.Confirm);
                    ch chVar = new ch(ejVar, j10, this.c, l10, 1);
                    c6Var = ((org.telegram.ui.ActionBar.o2) tnVar).resourceProvider;
                    org.telegram.ui.Components.c5.i0(parentActivity, string, replaceTags, formatPluralStringComma, string2, chVar, c6Var, true);
                    break;
                }
                break;
        }
    }
}
