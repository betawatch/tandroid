package ai;

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
import org.telegram.ui.Components.bs;
import org.telegram.ui.bh;
import org.telegram.ui.fj;
import org.telegram.ui.qn;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes4.dex */
public final /* synthetic */ class q5 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;

    public /* synthetic */ q5(Object obj, long j10, long j11, int i10) {
        this.a = i10;
        this.d = obj;
        this.b = j10;
        this.c = j11;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0104 A[LOOP:1: B:36:0x0100->B:38:0x0104, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0138  */
    @Override // org.telegram.messenger.Utilities.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run(Object obj) {
        SpannableStringBuilder spannableStringBuilder;
        int size;
        int i10;
        org.telegram.ui.ActionBar.d6 d6Var;
        int i11 = this.a;
        Object obj2 = this.d;
        switch (i11) {
            case 0:
                e6 e6Var = (e6) obj2;
                ArrayList arrayList = (ArrayList) obj;
                org.telegram.ui.Components.z5 z5Var = e6Var.E;
                if (this.b == this.c) {
                    e6Var.d0 = arrayList;
                    z5Var.animate().alpha(e6Var.s ? 0.0f : e6Var.d0 != null ? 1.0f : 0.25f).setInterpolator(bs.h).setDuration(420L).start();
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
                                    spannableStringBuilder.setSpan(new org.telegram.ui.Components.a6(((TL_stars.starGiftAttributeModel) obj3).document, z5Var.getPaint().getFontMetricsInt()), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                                    spannableStringBuilder.append((CharSequence) " ");
                                }
                                if (spannableStringBuilder.length() > 0) {
                                    spannableStringBuilder.append((CharSequence) " ");
                                }
                                spannableStringBuilder.append(AndroidUtilities.replaceArrows(LocaleController.getString(R.string.GiftCraftViewAllVariants), false, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f)));
                                z5Var.setText(spannableStringBuilder);
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
                    z5Var.setText(spannableStringBuilder);
                }
                break;
            case 1:
                qn.R0((qn) obj2, this.b, this.c, (Long) obj);
                break;
            default:
                fj fjVar = (fj) obj2;
                Long l4 = (Long) obj;
                qn qnVar = fjVar.b;
                if (qnVar.getParentActivity() != null) {
                    Activity parentActivity = qnVar.getParentActivity();
                    String string = LocaleController.getString(R.string.RemoveMessageFeeTitle);
                    int i13 = ChatObject.isMonoForum(qnVar.e) ? R.string.RemoveMessageFeeMessageChannel : R.string.RemoveMessageFeeMessage;
                    long j10 = this.b;
                    SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString(i13, DialogObject.getShortName(j10)));
                    String formatPluralStringComma = l4.longValue() > 0 ? LocaleController.formatPluralStringComma("RemoveMessageFeeRefund", (int) l4.longValue()) : null;
                    String string2 = LocaleController.getString(R.string.Confirm);
                    bh bhVar = new bh(fjVar, j10, this.c, l4, 1);
                    d6Var = ((org.telegram.ui.ActionBar.n2) qnVar).resourceProvider;
                    org.telegram.ui.Components.f5.h0(parentActivity, string, replaceTags, formatPluralStringComma, string2, bhVar, d6Var, true);
                    break;
                }
                break;
        }
    }
}
