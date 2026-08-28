package gh;

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
import org.telegram.ui.Components.gr;
import org.telegram.ui.bj;
import org.telegram.ui.ch;
import org.telegram.ui.qn;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class w3 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;

    public /* synthetic */ w3(Object obj, long j10, long j11, int i9) {
        this.a = i9;
        this.d = obj;
        this.b = j10;
        this.c = j11;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0105 A[LOOP:1: B:36:0x0101->B:38:0x0105, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x013a  */
    @Override // org.telegram.messenger.Utilities.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run(Object obj) {
        SpannableStringBuilder spannableStringBuilder;
        int size;
        int i9;
        org.telegram.ui.ActionBar.b6 b6Var;
        int i10 = this.a;
        Object obj2 = this.d;
        switch (i10) {
            case 0:
                i4 i4Var = (i4) obj2;
                ArrayList arrayList = (ArrayList) obj;
                org.telegram.ui.Components.s5 s5Var = i4Var.A;
                if (this.b == this.c) {
                    i4Var.W = arrayList;
                    s5Var.animate().alpha(i4Var.s ? 0.0f : i4Var.W != null ? 1.0f : 0.25f).setInterpolator(gr.h).setDuration(420L).start();
                    ArrayList arrayList2 = new ArrayList();
                    for (int i11 = 0; i11 < arrayList.size(); i11++) {
                        if ((arrayList.get(i11) instanceof TL_stars.starGiftAttributeModel) && !(((TL_stars.StarGiftAttribute) arrayList.get(i11)).rarity instanceof TL_stars.TL_starGiftAttributeRarity)) {
                            arrayList2.add((TL_stars.starGiftAttributeModel) arrayList.get(i11));
                            if (arrayList2.size() >= 3) {
                                spannableStringBuilder = new SpannableStringBuilder();
                                size = arrayList2.size();
                                i9 = 0;
                                while (i9 < size) {
                                    Object obj3 = arrayList2.get(i9);
                                    i9++;
                                    spannableStringBuilder.append((CharSequence) "x");
                                    spannableStringBuilder.setSpan(new org.telegram.ui.Components.t5(((TL_stars.starGiftAttributeModel) obj3).document, s5Var.getPaint().getFontMetricsInt()), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                                    spannableStringBuilder.append((CharSequence) " ");
                                }
                                if (spannableStringBuilder.length() > 0) {
                                    spannableStringBuilder.append((CharSequence) " ");
                                }
                                spannableStringBuilder.append(AndroidUtilities.replaceArrows(LocaleController.getString(R.string.GiftCraftViewAllVariants), false, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f)));
                                s5Var.setText(spannableStringBuilder);
                                break;
                            }
                        }
                    }
                    spannableStringBuilder = new SpannableStringBuilder();
                    size = arrayList2.size();
                    i9 = 0;
                    while (i9 < size) {
                    }
                    if (spannableStringBuilder.length() > 0) {
                    }
                    spannableStringBuilder.append(AndroidUtilities.replaceArrows(LocaleController.getString(R.string.GiftCraftViewAllVariants), false, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f)));
                    s5Var.setText(spannableStringBuilder);
                }
                break;
            case 1:
                qn.m1((qn) obj2, this.b, this.c, (Long) obj);
                break;
            default:
                bj bjVar = (bj) obj2;
                Long l10 = (Long) obj;
                qn qnVar = bjVar.b;
                if (qnVar.getParentActivity() != null) {
                    Activity parentActivity = qnVar.getParentActivity();
                    String string = LocaleController.getString(R.string.RemoveMessageFeeTitle);
                    int i12 = ChatObject.isMonoForum(qnVar.e) ? R.string.RemoveMessageFeeMessageChannel : R.string.RemoveMessageFeeMessage;
                    long j10 = this.b;
                    SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString(i12, DialogObject.getShortName(j10)));
                    String formatPluralStringComma = l10.longValue() > 0 ? LocaleController.formatPluralStringComma("RemoveMessageFeeRefund", (int) l10.longValue()) : null;
                    String string2 = LocaleController.getString(R.string.Confirm);
                    ch chVar = new ch(bjVar, j10, this.c, l10, 1);
                    b6Var = ((org.telegram.ui.ActionBar.o2) qnVar).resourceProvider;
                    org.telegram.ui.Components.y4.i0(parentActivity, string, replaceTags, formatPluralStringComma, string2, chVar, b6Var, true);
                    break;
                }
                break;
        }
    }
}
