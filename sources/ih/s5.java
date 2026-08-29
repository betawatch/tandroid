package ih;

import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Collections;
import jh.ia;
import jh.s7;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.t41;
import org.telegram.ui.Components.tc;
import org.telegram.ui.Components.w41;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final /* synthetic */ class s5 implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ e6 b;

    public /* synthetic */ s5(e6 e6Var, int i10) {
        this.a = i10;
        this.b = e6Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01db  */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v7 */
    @Override // org.telegram.messenger.Utilities.Callback2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run(Object obj, Object obj2) {
        int i10;
        char c3;
        String formatString;
        int i11;
        boolean z10;
        String formatString2;
        CharSequence replaceArrows;
        int i12 = this.a;
        e6 e6Var = this.b;
        switch (i12) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                cg.n nVar = e6Var.a0;
                FrameLayout frameLayout = e6Var.k0;
                boolean z11 = e6Var.W;
                boolean z12 = e6Var.X;
                TL_stars.StarGift starGift = e6Var.Y;
                String str = e6Var.b0;
                boolean z13 = e6Var.T;
                int i13 = e6Var.U;
                MessagesController messagesController = MessagesController.getInstance(i13);
                long j10 = e6Var.V;
                long sendPaidMessagesStars = messagesController.getSendPaidMessagesStars(j10);
                arrayList.add(w41.j(-1, e6Var.d0));
                if (sendPaidMessagesStars <= 0) {
                    arrayList.add(w41.j(-2, e6Var.o0));
                    arrayList.add(w41.C(AndroidUtilities.dp(12.0f)));
                }
                if (starGift != null) {
                    if (!starGift.can_upgrade || z13) {
                        arrayList.add(w41.A(-5, null));
                    } else {
                        arrayList.add(w41.A(-3, null));
                        w41 i14 = w41.i(2, ia.X0(false, LocaleController.formatString(z13 ? R.string.Gift2UpgradeSelf : R.string.Gift2Upgrade, Integer.valueOf((int) starGift.upgrade_stars)), 0.78f, null));
                        i14.K(e6Var.m0);
                        arrayList.add(i14);
                        if (z12) {
                            replaceArrows = LocaleController.formatString(j10 < 0 ? R.string.Gift2NoUpgradeChannelForcedInfo : R.string.Gift2NoUpgradeForcedInfo, str);
                        } else if (z11) {
                            replaceArrows = LocaleController.formatString(j10 < 0 ? R.string.Gift2UpgradeChannelForcedInfo : R.string.Gift2UpgradeForcedInfo, str);
                        } else {
                            if (z13) {
                                formatString2 = LocaleController.getString(R.string.Gift2UpgradeSelfInfo);
                                z10 = true;
                            } else {
                                z10 = true;
                                formatString2 = LocaleController.formatString(j10 >= 0 ? R.string.Gift2UpgradeInfo : R.string.Gift2UpgradeChannelInfo, str);
                            }
                            replaceArrows = AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(formatString2, new u5(e6Var, 2)), z10);
                        }
                        w41 A = w41.A(-5, replaceArrows);
                        A.g = (z11 || z12) ? false : true;
                        arrayList.add(A);
                    }
                    w41 i15 = w41.i(1, LocaleController.getString(z13 ? R.string.Gift2HideSelf : R.string.Gift2Hide));
                    i15.K(e6Var.l0);
                    arrayList.add(i15);
                    if (z13) {
                        i11 = R.string.Gift2HideSelfInfo;
                    } else if (j10 < 0) {
                        i11 = R.string.Gift2HideChannelInfo;
                    } else {
                        i10 = 1;
                        c3 = 0;
                        formatString = LocaleController.formatString(R.string.Gift2HideInfo, str);
                        arrayList.add(w41.A(-6, formatString));
                        if (frameLayout != null) {
                            int i16 = starGift.gifts_per_round;
                            Object[] objArr = new Object[i10];
                            objArr[c3] = Integer.valueOf(i16);
                            CharSequence replaceArrows2 = AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.formatPluralString("Gift2AuctionInfoLearnMore2", i16, objArr), new u5(e6Var, 3)), i10);
                            arrayList.add(w41.j(-43, frameLayout));
                            arrayList.add(w41.A(-44, replaceArrows2));
                        }
                    }
                    formatString = LocaleController.getString(i11);
                    i10 = 1;
                    c3 = 0;
                    arrayList.add(w41.A(-6, formatString));
                    if (frameLayout != null) {
                    }
                } else {
                    if (sendPaidMessagesStars <= 0) {
                        arrayList.add(w41.A(-3, LocaleController.formatString(R.string.Gift2MessagePremiumInfo, str)));
                    }
                    if (nVar != null && (nVar.c != null || nVar.d != null)) {
                        w41 i17 = w41.i(3, ia.X0(false, LocaleController.formatString(R.string.Gift2MessageStars, Integer.valueOf((int) nVar.g())), 0.78f, null));
                        i17.K(e6Var.n0);
                        arrayList.add(i17);
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.formatNumber(s7.y(i13, false).p().amount, ','));
                        spannableStringBuilder.setSpan(new t41(AndroidUtilities.bold()), 0, spannableStringBuilder.length(), 33);
                        arrayList.add(w41.A(-7, TextUtils.concat(ia.X0(false, LocaleController.formatSpannable(R.string.Gift2MessageStarsInfo, spannableStringBuilder), 0.66f, null), " ", AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.Gift2MessageStarsInfoLink), new u5(e6Var, 4)), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(1.0f)))));
                    }
                }
                if (e6Var.M) {
                    Collections.reverse(arrayList);
                    break;
                }
                break;
            default:
                String str2 = (String) obj2;
                TL_stars.StarGift starGift2 = e6Var.Y;
                z5 z5Var = e6Var.o0;
                if (!((Boolean) obj).booleanValue()) {
                    if (!"STARGIFT_USAGE_LIMITED".equalsIgnoreCase(str2)) {
                        if ("STARGIFT_USER_USAGE_LIMITED".equalsIgnoreCase(str2)) {
                            AndroidUtilities.hideKeyboard(z5Var);
                            e6Var.dismiss();
                            tc X = e6Var.X();
                            if (X != null && starGift2 != null && starGift2.limited_per_user) {
                                X.R(starGift2.getDocument(), AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("Gift2PerUserLimit", starGift2.per_user_total))).j();
                                break;
                            }
                        }
                    } else {
                        AndroidUtilities.hideKeyboard(z5Var);
                        e6Var.dismiss();
                        s7 y8 = s7.y(e6Var.U, false);
                        if (starGift2 != null && y8.D) {
                            starGift2.availability_remains = 0;
                            y8.c0(y8.F, y8.G, y8.H);
                            NotificationCenter.getInstance(y8.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiftSoldOut, starGift2);
                            break;
                        }
                    }
                } else {
                    Runnable runnable = e6Var.c0;
                    if (runnable != null) {
                        runnable.run();
                    }
                    AndroidUtilities.hideKeyboard(z5Var);
                    e6Var.dismiss();
                }
                e6Var.j0.setLoading(false);
                break;
        }
    }
}
