package fh;

import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.widget.FrameLayout;
import gh.oa;
import gh.v7;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.i41;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.oc;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class h6 implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ u6 b;

    public /* synthetic */ h6(u6 u6Var, int i9) {
        this.a = i9;
        this.b = u6Var;
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
        int i9;
        char c10;
        String formatString;
        int i10;
        boolean z10;
        String formatString2;
        CharSequence replaceArrows;
        int i11 = this.a;
        u6 u6Var = this.b;
        switch (i11) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                zf.k kVar = u6Var.a0;
                FrameLayout frameLayout = u6Var.k0;
                boolean z11 = u6Var.W;
                boolean z12 = u6Var.X;
                TL_stars.StarGift starGift = u6Var.Y;
                String str = u6Var.b0;
                boolean z13 = u6Var.T;
                int i12 = u6Var.U;
                MessagesController messagesController = MessagesController.getInstance(i12);
                long j10 = u6Var.V;
                long sendPaidMessagesStars = messagesController.getSendPaidMessagesStars(j10);
                arrayList.add(l41.j(-1, u6Var.d0));
                if (sendPaidMessagesStars <= 0) {
                    arrayList.add(l41.j(-2, u6Var.o0));
                    arrayList.add(l41.C(AndroidUtilities.dp(12.0f)));
                }
                if (starGift != null) {
                    if (!starGift.can_upgrade || z13) {
                        arrayList.add(l41.A(-5, null));
                    } else {
                        arrayList.add(l41.A(-3, null));
                        l41 i13 = l41.i(2, oa.X0(false, LocaleController.formatString(z13 ? R.string.Gift2UpgradeSelf : R.string.Gift2Upgrade, Integer.valueOf((int) starGift.upgrade_stars)), 0.78f, null));
                        i13.K(u6Var.m0);
                        arrayList.add(i13);
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
                            replaceArrows = AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(formatString2, new j6(u6Var, 2)), z10);
                        }
                        l41 A = l41.A(-5, replaceArrows);
                        A.g = (z11 || z12) ? false : true;
                        arrayList.add(A);
                    }
                    l41 i14 = l41.i(1, LocaleController.getString(z13 ? R.string.Gift2HideSelf : R.string.Gift2Hide));
                    i14.K(u6Var.l0);
                    arrayList.add(i14);
                    if (z13) {
                        i10 = R.string.Gift2HideSelfInfo;
                    } else if (j10 < 0) {
                        i10 = R.string.Gift2HideChannelInfo;
                    } else {
                        i9 = 1;
                        c10 = 0;
                        formatString = LocaleController.formatString(R.string.Gift2HideInfo, str);
                        arrayList.add(l41.A(-6, formatString));
                        if (frameLayout != null) {
                            int i15 = starGift.gifts_per_round;
                            Object[] objArr = new Object[i9];
                            objArr[c10] = Integer.valueOf(i15);
                            CharSequence replaceArrows2 = AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.formatPluralString("Gift2AuctionInfoLearnMore2", i15, objArr), new j6(u6Var, 3)), i9);
                            arrayList.add(l41.j(-43, frameLayout));
                            arrayList.add(l41.A(-44, replaceArrows2));
                        }
                    }
                    formatString = LocaleController.getString(i10);
                    i9 = 1;
                    c10 = 0;
                    arrayList.add(l41.A(-6, formatString));
                    if (frameLayout != null) {
                    }
                } else {
                    if (sendPaidMessagesStars <= 0) {
                        arrayList.add(l41.A(-3, LocaleController.formatString(R.string.Gift2MessagePremiumInfo, str)));
                    }
                    if (kVar != null && (kVar.c != null || kVar.d != null)) {
                        l41 i16 = l41.i(3, oa.X0(false, LocaleController.formatString(R.string.Gift2MessageStars, Integer.valueOf((int) kVar.g())), 0.78f, null));
                        i16.K(u6Var.n0);
                        arrayList.add(i16);
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.formatNumber(v7.y(i12, false).p().amount, ','));
                        spannableStringBuilder.setSpan(new i41(AndroidUtilities.bold()), 0, spannableStringBuilder.length(), 33);
                        arrayList.add(l41.A(-7, TextUtils.concat(oa.X0(false, LocaleController.formatSpannable(R.string.Gift2MessageStarsInfo, spannableStringBuilder), 0.66f, null), " ", AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.Gift2MessageStarsInfoLink), new j6(u6Var, 4)), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(1.0f)))));
                    }
                }
                if (u6Var.M) {
                    Collections.reverse(arrayList);
                    break;
                }
                break;
            default:
                String str2 = (String) obj2;
                TL_stars.StarGift starGift2 = u6Var.Y;
                p6 p6Var = u6Var.o0;
                if (!((Boolean) obj).booleanValue()) {
                    if (!"STARGIFT_USAGE_LIMITED".equalsIgnoreCase(str2)) {
                        if ("STARGIFT_USER_USAGE_LIMITED".equalsIgnoreCase(str2)) {
                            AndroidUtilities.hideKeyboard(p6Var);
                            u6Var.dismiss();
                            oc W = u6Var.W();
                            if (W != null && starGift2 != null && starGift2.limited_per_user) {
                                W.R(starGift2.getDocument(), AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("Gift2PerUserLimit", starGift2.per_user_total))).j();
                                break;
                            }
                        }
                    } else {
                        AndroidUtilities.hideKeyboard(p6Var);
                        u6Var.dismiss();
                        v7 y10 = v7.y(u6Var.U, false);
                        if (starGift2 != null && y10.D) {
                            starGift2.availability_remains = 0;
                            y10.c0(y10.F, y10.G, y10.H);
                            NotificationCenter.getInstance(y10.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiftSoldOut, starGift2);
                            break;
                        }
                    }
                } else {
                    Runnable runnable = u6Var.c0;
                    if (runnable != null) {
                        runnable.run();
                    }
                    AndroidUtilities.hideKeyboard(p6Var);
                    u6Var.dismiss();
                }
                u6Var.j0.setLoading(false);
                break;
        }
    }
}
