package gh;

import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.widget.FrameLayout;
import hh.oa;
import hh.u7;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.k41;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.n41;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final /* synthetic */ class z5 implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ m6 b;

    public /* synthetic */ z5(m6 m6Var, int i10) {
        this.a = i10;
        this.b = m6Var;
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
        char c10;
        String formatString;
        int i11;
        boolean z10;
        String formatString2;
        CharSequence replaceArrows;
        int i12 = this.a;
        m6 m6Var = this.b;
        switch (i12) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                ag.p pVar = m6Var.a0;
                FrameLayout frameLayout = m6Var.k0;
                boolean z11 = m6Var.W;
                boolean z12 = m6Var.X;
                TL_stars.StarGift starGift = m6Var.Y;
                String str = m6Var.b0;
                boolean z13 = m6Var.T;
                int i13 = m6Var.U;
                MessagesController messagesController = MessagesController.getInstance(i13);
                long j10 = m6Var.V;
                long sendPaidMessagesStars = messagesController.getSendPaidMessagesStars(j10);
                arrayList.add(n41.j(-1, m6Var.d0));
                if (sendPaidMessagesStars <= 0) {
                    arrayList.add(n41.j(-2, m6Var.o0));
                    arrayList.add(n41.C(AndroidUtilities.dp(12.0f)));
                }
                if (starGift != null) {
                    if (!starGift.can_upgrade || z13) {
                        arrayList.add(n41.A(-5, null));
                    } else {
                        arrayList.add(n41.A(-3, null));
                        n41 i14 = n41.i(2, oa.X0(false, LocaleController.formatString(z13 ? R.string.Gift2UpgradeSelf : R.string.Gift2Upgrade, Integer.valueOf((int) starGift.upgrade_stars)), 0.78f, null));
                        i14.K(m6Var.m0);
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
                            replaceArrows = AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(formatString2, new b6(m6Var, 2)), z10);
                        }
                        n41 A = n41.A(-5, replaceArrows);
                        A.g = (z11 || z12) ? false : true;
                        arrayList.add(A);
                    }
                    n41 i15 = n41.i(1, LocaleController.getString(z13 ? R.string.Gift2HideSelf : R.string.Gift2Hide));
                    i15.K(m6Var.l0);
                    arrayList.add(i15);
                    if (z13) {
                        i11 = R.string.Gift2HideSelfInfo;
                    } else if (j10 < 0) {
                        i11 = R.string.Gift2HideChannelInfo;
                    } else {
                        i10 = 1;
                        c10 = 0;
                        formatString = LocaleController.formatString(R.string.Gift2HideInfo, str);
                        arrayList.add(n41.A(-6, formatString));
                        if (frameLayout != null) {
                            int i16 = starGift.gifts_per_round;
                            Object[] objArr = new Object[i10];
                            objArr[c10] = Integer.valueOf(i16);
                            CharSequence replaceArrows2 = AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.formatPluralString("Gift2AuctionInfoLearnMore2", i16, objArr), new b6(m6Var, 3)), i10);
                            arrayList.add(n41.j(-43, frameLayout));
                            arrayList.add(n41.A(-44, replaceArrows2));
                        }
                    }
                    formatString = LocaleController.getString(i11);
                    i10 = 1;
                    c10 = 0;
                    arrayList.add(n41.A(-6, formatString));
                    if (frameLayout != null) {
                    }
                } else {
                    if (sendPaidMessagesStars <= 0) {
                        arrayList.add(n41.A(-3, LocaleController.formatString(R.string.Gift2MessagePremiumInfo, str)));
                    }
                    if (pVar != null && (pVar.c != null || pVar.d != null)) {
                        n41 i17 = n41.i(3, oa.X0(false, LocaleController.formatString(R.string.Gift2MessageStars, Integer.valueOf((int) pVar.g())), 0.78f, null));
                        i17.K(m6Var.n0);
                        arrayList.add(i17);
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.formatNumber(u7.y(i13, false).p().amount, ','));
                        spannableStringBuilder.setSpan(new k41(AndroidUtilities.bold()), 0, spannableStringBuilder.length(), 33);
                        arrayList.add(n41.A(-7, TextUtils.concat(oa.X0(false, LocaleController.formatSpannable(R.string.Gift2MessageStarsInfo, spannableStringBuilder), 0.66f, null), " ", AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.Gift2MessageStarsInfoLink), new b6(m6Var, 4)), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(1.0f)))));
                    }
                }
                if (m6Var.M) {
                    Collections.reverse(arrayList);
                    break;
                }
                break;
            default:
                String str2 = (String) obj2;
                TL_stars.StarGift starGift2 = m6Var.Y;
                h6 h6Var = m6Var.o0;
                if (!((Boolean) obj).booleanValue()) {
                    if (!"STARGIFT_USAGE_LIMITED".equalsIgnoreCase(str2)) {
                        if ("STARGIFT_USER_USAGE_LIMITED".equalsIgnoreCase(str2)) {
                            AndroidUtilities.hideKeyboard(h6Var);
                            m6Var.dismiss();
                            mc X = m6Var.X();
                            if (X != null && starGift2 != null && starGift2.limited_per_user) {
                                X.R(starGift2.getDocument(), AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("Gift2PerUserLimit", starGift2.per_user_total))).j();
                                break;
                            }
                        }
                    } else {
                        AndroidUtilities.hideKeyboard(h6Var);
                        m6Var.dismiss();
                        u7 y10 = u7.y(m6Var.U, false);
                        if (starGift2 != null && y10.D) {
                            starGift2.availability_remains = 0;
                            y10.c0(y10.F, y10.G, y10.H);
                            NotificationCenter.getInstance(y10.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiftSoldOut, starGift2);
                            break;
                        }
                    }
                } else {
                    Runnable runnable = m6Var.c0;
                    if (runnable != null) {
                        runnable.run();
                    }
                    AndroidUtilities.hideKeyboard(h6Var);
                    m6Var.dismiss();
                }
                m6Var.j0.setLoading(false);
                break;
        }
    }
}
