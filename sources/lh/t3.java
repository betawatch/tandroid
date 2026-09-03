package lh;

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
import org.telegram.ui.Components.mr;
import org.telegram.ui.ih;
import org.telegram.ui.lj;
import org.telegram.ui.zn;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
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
        org.telegram.ui.ActionBar.f6 f6Var;
        int i11 = this.a;
        Object obj2 = this.d;
        switch (i11) {
            case 0:
                f4 f4Var = (f4) obj2;
                ArrayList arrayList = (ArrayList) obj;
                org.telegram.ui.Components.t5 t5Var = f4Var.B;
                if (this.b == this.c) {
                    f4Var.a0 = arrayList;
                    t5Var.animate().alpha(f4Var.s ? 0.0f : f4Var.a0 != null ? 1.0f : 0.25f).setInterpolator(mr.h).setDuration(420L).start();
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
                zn.m1((zn) obj2, this.b, this.c, (Long) obj);
                break;
            default:
                lj ljVar = (lj) obj2;
                Long l10 = (Long) obj;
                zn znVar = ljVar.b;
                if (znVar.getParentActivity() != null) {
                    Activity parentActivity = znVar.getParentActivity();
                    String string = LocaleController.getString(R.string.RemoveMessageFeeTitle);
                    int i13 = ChatObject.isMonoForum(znVar.e) ? R.string.RemoveMessageFeeMessageChannel : R.string.RemoveMessageFeeMessage;
                    long j10 = this.b;
                    SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString(i13, DialogObject.getShortName(j10)));
                    String formatPluralStringComma = l10.longValue() > 0 ? LocaleController.formatPluralStringComma("RemoveMessageFeeRefund", (int) l10.longValue()) : null;
                    String string2 = LocaleController.getString(R.string.Confirm);
                    ih ihVar = new ih(ljVar, j10, this.c, l10, 1);
                    f6Var = ((org.telegram.ui.ActionBar.p2) znVar).resourceProvider;
                    org.telegram.ui.Components.z4.i0(parentActivity, string, replaceTags, formatPluralStringComma, string2, ihVar, f6Var, true);
                    break;
                }
                break;
        }
    }
}
