package mh;

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
import org.telegram.ui.Components.pr;
import org.telegram.ui.gh;
import org.telegram.ui.jj;
import org.telegram.ui.xn;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final /* synthetic */ class t3 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;

    public /* synthetic */ t3(Object obj, long j10, long j11, int i10) {
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
        org.telegram.ui.ActionBar.g6 g6Var;
        int i11 = this.a;
        Object obj2 = this.d;
        switch (i11) {
            case 0:
                f4 f4Var = (f4) obj2;
                ArrayList arrayList = (ArrayList) obj;
                org.telegram.ui.Components.t5 t5Var = f4Var.B;
                if (this.b == this.c) {
                    f4Var.a0 = arrayList;
                    t5Var.animate().alpha(f4Var.s ? 0.0f : f4Var.a0 != null ? 1.0f : 0.25f).setInterpolator(pr.h).setDuration(420L).start();
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
                                    spannableStringBuilder.setSpan(new org.telegram.ui.Components.u5(((TL_stars.starGiftAttributeModel) obj3).document, t5Var.getPaint().getFontMetricsInt()), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                                    spannableStringBuilder.append((CharSequence) " ");
                                }
                                if (spannableStringBuilder.length() > 0) {
                                    spannableStringBuilder.append((CharSequence) " ");
                                }
                                spannableStringBuilder.append(AndroidUtilities.replaceArrows(LocaleController.getString(R.string.GiftCraftViewAllVariants), false, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f)));
                                t5Var.setText(spannableStringBuilder);
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
                    t5Var.setText(spannableStringBuilder);
                }
                break;
            case 1:
                xn.m1((xn) obj2, this.b, this.c, (Long) obj);
                break;
            default:
                jj jjVar = (jj) obj2;
                Long l10 = (Long) obj;
                xn xnVar = jjVar.b;
                if (xnVar.getParentActivity() != null) {
                    Activity parentActivity = xnVar.getParentActivity();
                    String string = LocaleController.getString(R.string.RemoveMessageFeeTitle);
                    int i13 = ChatObject.isMonoForum(xnVar.e) ? R.string.RemoveMessageFeeMessageChannel : R.string.RemoveMessageFeeMessage;
                    long j10 = this.b;
                    SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString(i13, DialogObject.getShortName(j10)));
                    String formatPluralStringComma = l10.longValue() > 0 ? LocaleController.formatPluralStringComma("RemoveMessageFeeRefund", (int) l10.longValue()) : null;
                    String string2 = LocaleController.getString(R.string.Confirm);
                    gh ghVar = new gh(jjVar, j10, this.c, l10, 1);
                    g6Var = ((org.telegram.ui.ActionBar.p2) xnVar).resourceProvider;
                    org.telegram.ui.Components.z4.i0(parentActivity, string, replaceTags, formatPluralStringComma, string2, ghVar, g6Var, true);
                    break;
                }
                break;
        }
    }
}
