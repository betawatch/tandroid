package lh;

import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Collections;
import mh.ja;
import mh.t7;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.e51;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.qc;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
        boolean z4;
        String formatString2;
        CharSequence replaceArrows;
        int i12 = this.a;
        e6 e6Var = this.b;
        switch (i12) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                fg.n nVar = e6Var.b0;
                FrameLayout frameLayout = e6Var.l0;
                boolean z10 = e6Var.X;
                boolean z11 = e6Var.Y;
                TL_stars.StarGift starGift = e6Var.Z;
                String str = e6Var.c0;
                boolean z12 = e6Var.U;
                int i13 = e6Var.V;
                MessagesController messagesController = MessagesController.getInstance(i13);
                long j10 = e6Var.W;
                long sendPaidMessagesStars = messagesController.getSendPaidMessagesStars(j10);
                arrayList.add(h51.j(-1, e6Var.e0));
                if (sendPaidMessagesStars <= 0) {
                    arrayList.add(h51.j(-2, e6Var.p0));
                    arrayList.add(h51.C(AndroidUtilities.dp(12.0f)));
                }
                if (starGift != null) {
                    if (!starGift.can_upgrade || z12) {
                        arrayList.add(h51.A(-5, null));
                    } else {
                        arrayList.add(h51.A(-3, null));
                        h51 i14 = h51.i(2, ja.X0(false, LocaleController.formatString(z12 ? R.string.Gift2UpgradeSelf : R.string.Gift2Upgrade, Integer.valueOf((int) starGift.upgrade_stars)), 0.78f, null));
                        i14.K(e6Var.n0);
                        arrayList.add(i14);
                        if (z11) {
                            replaceArrows = LocaleController.formatString(j10 < 0 ? R.string.Gift2NoUpgradeChannelForcedInfo : R.string.Gift2NoUpgradeForcedInfo, str);
                        } else if (z10) {
                            replaceArrows = LocaleController.formatString(j10 < 0 ? R.string.Gift2UpgradeChannelForcedInfo : R.string.Gift2UpgradeForcedInfo, str);
                        } else {
                            if (z12) {
                                formatString2 = LocaleController.getString(R.string.Gift2UpgradeSelfInfo);
                                z4 = true;
                            } else {
                                z4 = true;
                                formatString2 = LocaleController.formatString(j10 >= 0 ? R.string.Gift2UpgradeInfo : R.string.Gift2UpgradeChannelInfo, str);
                            }
                            replaceArrows = AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(formatString2, new u5(e6Var, 2)), z4);
                        }
                        h51 A = h51.A(-5, replaceArrows);
                        A.g = (z10 || z11) ? false : true;
                        arrayList.add(A);
                    }
                    h51 i15 = h51.i(1, LocaleController.getString(z12 ? R.string.Gift2HideSelf : R.string.Gift2Hide));
                    i15.K(e6Var.m0);
                    arrayList.add(i15);
                    if (z12) {
                        i11 = R.string.Gift2HideSelfInfo;
                    } else if (j10 < 0) {
                        i11 = R.string.Gift2HideChannelInfo;
                    } else {
                        i10 = 1;
                        c3 = 0;
                        formatString = LocaleController.formatString(R.string.Gift2HideInfo, str);
                        arrayList.add(h51.A(-6, formatString));
                        if (frameLayout != null) {
                            int i16 = starGift.gifts_per_round;
                            Object[] objArr = new Object[i10];
                            objArr[c3] = Integer.valueOf(i16);
                            CharSequence replaceArrows2 = AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.formatPluralString("Gift2AuctionInfoLearnMore2", i16, objArr), new u5(e6Var, 3)), i10);
                            arrayList.add(h51.j(-43, frameLayout));
                            arrayList.add(h51.A(-44, replaceArrows2));
                        }
                    }
                    formatString = LocaleController.getString(i11);
                    i10 = 1;
                    c3 = 0;
                    arrayList.add(h51.A(-6, formatString));
                    if (frameLayout != null) {
                    }
                } else {
                    if (sendPaidMessagesStars <= 0) {
                        arrayList.add(h51.A(-3, LocaleController.formatString(R.string.Gift2MessagePremiumInfo, str)));
                    }
                    if (nVar != null && (nVar.c != null || nVar.d != null)) {
                        h51 i17 = h51.i(3, ja.X0(false, LocaleController.formatString(R.string.Gift2MessageStars, Integer.valueOf((int) nVar.g())), 0.78f, null));
                        i17.K(e6Var.o0);
                        arrayList.add(i17);
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.formatNumber(t7.y(i13, false).p().amount, ','));
                        spannableStringBuilder.setSpan(new e51(AndroidUtilities.bold()), 0, spannableStringBuilder.length(), 33);
                        arrayList.add(h51.A(-7, TextUtils.concat(ja.X0(false, LocaleController.formatSpannable(R.string.Gift2MessageStarsInfo, spannableStringBuilder), 0.66f, null), " ", AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.Gift2MessageStarsInfoLink), new u5(e6Var, 4)), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(1.0f)))));
                    }
                }
                if (e6Var.N) {
                    Collections.reverse(arrayList);
                    break;
                }
                break;
            default:
                String str2 = (String) obj2;
                TL_stars.StarGift starGift2 = e6Var.Z;
                z5 z5Var = e6Var.p0;
                if (!((Boolean) obj).booleanValue()) {
                    if (!"STARGIFT_USAGE_LIMITED".equalsIgnoreCase(str2)) {
                        if ("STARGIFT_USER_USAGE_LIMITED".equalsIgnoreCase(str2)) {
                            AndroidUtilities.hideKeyboard(z5Var);
                            e6Var.dismiss();
                            qc X = e6Var.X();
                            if (X != null && starGift2 != null && starGift2.limited_per_user) {
                                X.R(starGift2.getDocument(), AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("Gift2PerUserLimit", starGift2.per_user_total))).j();
                                break;
                            }
                        }
                    } else {
                        AndroidUtilities.hideKeyboard(z5Var);
                        e6Var.dismiss();
                        t7 y10 = t7.y(e6Var.V, false);
                        if (starGift2 != null && y10.D) {
                            starGift2.availability_remains = 0;
                            y10.c0(y10.F, y10.G, y10.H);
                            NotificationCenter.getInstance(y10.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiftSoldOut, starGift2);
                            break;
                        }
                    }
                } else {
                    Runnable runnable = e6Var.d0;
                    if (runnable != null) {
                        runnable.run();
                    }
                    AndroidUtilities.hideKeyboard(z5Var);
                    e6Var.dismiss();
                }
                e6Var.k0.setLoading(false);
                break;
        }
    }
}
