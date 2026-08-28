package org.telegram.ui.Components;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class v50 extends vk0 {
    public final /* synthetic */ a60 c;

    public v50(a60 a60Var) {
        this.c = a60Var;
    }

    @Override // org.telegram.ui.Components.vk0
    public final boolean D(f2.q1 q1Var) {
        int i9;
        int b10 = q1Var.b();
        a60 a60Var = this.c;
        if (b10 == a60Var.n) {
            long j10 = a60Var.b.admin_id;
            i9 = ((org.telegram.ui.ActionBar.f3) a60Var).currentAccount;
            return j10 != UserConfig.getInstance(i9).clientUserId;
        }
        if (b10 < a60Var.x || b10 >= a60Var.y) {
            return b10 >= a60Var.K && b10 < a60Var.L;
        }
        return true;
    }

    @Override // f2.r0
    public final int h() {
        return this.c.O;
    }

    @Override // f2.r0
    public final int j(int i9) {
        a60 a60Var = this.c;
        if (i9 == a60Var.h || i9 == a60Var.J || i9 == a60Var.w || i9 == a60Var.e) {
            return 0;
        }
        if (i9 == a60Var.n) {
            return 1;
        }
        if (i9 >= a60Var.K && i9 < a60Var.L) {
            return 1;
        }
        if (i9 >= a60Var.x && i9 < a60Var.y) {
            return 1;
        }
        if (i9 == a60Var.r || i9 == a60Var.s) {
            return 2;
        }
        if (i9 == a60Var.D) {
            return 3;
        }
        if (i9 == a60Var.E) {
            return 4;
        }
        if (i9 == a60Var.F) {
            return 5;
        }
        a60Var.getClass();
        if (i9 == 0 || i9 == a60Var.G || i9 == a60Var.H) {
            return 6;
        }
        if (i9 == a60Var.v) {
            return 7;
        }
        if (i9 == a60Var.I) {
            return 8;
        }
        return i9 == a60Var.f ? 9 : 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:116:0x03ba  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x03f9  */
    /* JADX WARN: Removed duplicated region for block: B:135:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:137:0x03d7  */
    @Override // f2.r0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(f2.q1 q1Var, int i9) {
        int i10;
        int i11;
        long j10;
        TLRPC.TL_chatInviteImporter tL_chatInviteImporter;
        TLRPC.ChatParticipant chatParticipant;
        TLRPC.User user;
        String str;
        String str2;
        boolean z10;
        boolean z11;
        boolean z12;
        String str3;
        boolean z13;
        TL_stars.TL_starsSubscriptionPricing tL_starsSubscriptionPricing;
        int i12;
        int i13;
        String str4;
        boolean z14;
        boolean z15;
        int i14;
        boolean z16;
        int i15;
        int i16;
        String format;
        int i17;
        String formatString;
        a60 a60Var = this.c;
        HashMap hashMap = a60Var.c;
        TLRPC.ChatFull chatFull = a60Var.d;
        TLRPC.TL_chatInviteExported tL_chatInviteExported = a60Var.b;
        int i18 = q1Var.f;
        View view = q1Var.a;
        if (i18 == 0) {
            org.telegram.ui.Cells.v3 v3Var = (org.telegram.ui.Cells.v3) view;
            if (i9 == a60Var.h) {
                v3Var.setText(LocaleController.getString(R.string.LinkCreatedeBy));
                v3Var.setRightText(null);
                return;
            }
            if (i9 == a60Var.e) {
                v3Var.setText(LocaleController.getString(R.string.LinkRevenue));
                v3Var.setRightText(null);
                return;
            }
            if (i9 != a60Var.w) {
                if (i9 == a60Var.A) {
                    v3Var.setText(LocaleController.formatPluralString("PeopleSubscriptionExpired", tL_chatInviteExported.subscription_expired, new Object[0]));
                    v3Var.setRightText(null);
                    return;
                } else {
                    if (i9 == a60Var.J) {
                        v3Var.setText(LocaleController.formatPluralString("JoinRequests", tL_chatInviteExported.requested, new Object[0]));
                        v3Var.setRightText(null);
                        return;
                    }
                    return;
                }
            }
            int i19 = tL_chatInviteExported.usage;
            if (i19 > 0) {
                v3Var.setText(LocaleController.formatPluralString("PeopleJoined", i19, new Object[0]));
            } else {
                v3Var.setText(LocaleController.getString(tL_chatInviteExported.subscription_pricing != null ? R.string.NoOneSubscribed : R.string.NoOneJoined));
            }
            if (tL_chatInviteExported.expired || tL_chatInviteExported.revoked || (i10 = tL_chatInviteExported.usage_limit) <= 0 || (i11 = tL_chatInviteExported.usage) <= 0) {
                v3Var.setRightText(null);
                return;
            } else {
                v3Var.setRightText(LocaleController.formatPluralString("PeopleJoinedRemaining", i10 - i11, new Object[0]));
                return;
            }
        }
        if (i18 != 1) {
            if (i18 == 3) {
                e80 e80Var = (e80) view;
                e80Var.d(0, null, false);
                e80Var.setLink(tL_chatInviteExported.link);
                e80Var.setRevoke(tL_chatInviteExported.revoked);
                e80Var.setPermanent(tL_chatInviteExported.permanent);
                e80Var.setCanEdit(a60Var.g0);
                e80Var.b(!a60Var.g0);
                return;
            }
            if (i18 == 4) {
                z50 z50Var = (z50) view;
                AndroidUtilities.cancelRunOnUIThread(z50Var.v);
                z50Var.w = false;
                z50Var.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.B6, false));
                z50Var.setFixedSize(0);
                if (tL_chatInviteExported.revoked) {
                    z50Var.setText(LocaleController.getString(R.string.LinkIsNoActive));
                    return;
                }
                if (tL_chatInviteExported.expired) {
                    int i20 = tL_chatInviteExported.usage_limit;
                    if (i20 > 0 && i20 == tL_chatInviteExported.usage) {
                        z50Var.setText(LocaleController.getString(R.string.LinkIsExpiredLimitReached));
                        return;
                    } else {
                        z50Var.setText(LocaleController.getString(R.string.LinkIsExpired));
                        z50Var.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.p7, false));
                        return;
                    }
                }
                if (tL_chatInviteExported.expire_date <= 0) {
                    z50Var.setFixedSize(-1);
                    z50Var.setText(null);
                    return;
                }
                long currentTimeMillis = (a60Var.e0 * 1000) + System.currentTimeMillis();
                long j11 = tL_chatInviteExported.expire_date;
                long j12 = (j11 * 1000) - currentTimeMillis;
                if (j12 < 0) {
                    j12 = 0;
                }
                if (j12 > 86400000) {
                    z50Var.setText(LocaleController.formatString("LinkExpiresIn", R.string.LinkExpiresIn, LocaleController.formatDateAudio(j11, false)));
                    return;
                }
                long j13 = j12 / 1000;
                int i21 = (int) (j13 % 60);
                long j14 = j13 / 60;
                StringBuilder sb2 = new StringBuilder();
                Locale locale = Locale.ENGLISH;
                sb2.append(String.format(locale, "%02d", Integer.valueOf((int) (j14 / 60))));
                sb2.append(String.format(locale, ":%02d", Integer.valueOf((int) (j14 % 60))));
                sb2.append(String.format(locale, ":%02d", Integer.valueOf(i21)));
                String sb3 = sb2.toString();
                z50Var.w = true;
                m.i3 i3Var = z50Var.v;
                AndroidUtilities.cancelRunOnUIThread(i3Var);
                if (z50Var.w) {
                    AndroidUtilities.runOnUIThread(i3Var, 500L);
                }
                z50Var.setText(LocaleController.formatString("LinkExpiresInTime", R.string.LinkExpiresInTime, sb3));
                return;
            }
            if (i18 == 8) {
                w50 w50Var = (w50) view;
                int i22 = tL_chatInviteExported.usage_limit;
                if (i22 <= 0) {
                    w50Var.a.setVisibility(8);
                    return;
                } else {
                    w50Var.a.setText(LocaleController.formatPluralString("PeopleCanJoinViaLinkCount", i22, new Object[0]));
                    w50Var.a.setVisibility(0);
                    return;
                }
            }
            if (i18 != 9) {
                return;
            }
            x50 x50Var = (x50) view;
            TL_stars.TL_starsSubscriptionPricing tL_starsSubscriptionPricing2 = tL_chatInviteExported.subscription_pricing;
            int i23 = tL_chatInviteExported.usage;
            a60 a60Var2 = x50Var.c;
            TextView textView = x50Var.b;
            TextView textView2 = x50Var.a;
            if (tL_starsSubscriptionPricing2 == null) {
                return;
            }
            int i24 = tL_starsSubscriptionPricing2.period;
            if (i24 == 2592000) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(LocaleController.formatString(R.string.LinkRevenuePrice, Long.valueOf(tL_starsSubscriptionPricing2.amount)));
                sb4.append(i23 > 0 ? j3.r0.l(i23, " x ") : "");
                textView2.setText(gh.oa.X0(false, sb4.toString(), 0.8f, null));
                if (i23 == 0) {
                    formatString = LocaleController.getString(R.string.NoOneSubscribed);
                } else {
                    int i25 = R.string.LinkRevenuePriceInfo;
                    BillingController billingController = BillingController.getInstance();
                    double d = tL_starsSubscriptionPricing2.amount / 1000.0d;
                    i17 = ((org.telegram.ui.ActionBar.f3) a60Var2).currentAccount;
                    formatString = LocaleController.formatString(i25, billingController.formatCurrency((long) (d * MessagesController.getInstance(i17).starsUsdWithdrawRate1000 * i23), "USD"));
                }
                textView.setText(formatString);
                return;
            }
            String str5 = i24 == 300 ? "5min" : "min";
            StringBuilder sb5 = new StringBuilder();
            Locale locale2 = Locale.US;
            sb5.append(String.format(locale2, "⭐%1$d/%2$s", Long.valueOf(tL_starsSubscriptionPricing2.amount), str5));
            sb5.append(i23 > 0 ? j3.r0.l(i23, " x ") : "");
            textView2.setText(gh.oa.X0(false, sb5.toString(), 0.8f, null));
            if (i23 == 0) {
                format = LocaleController.getString(R.string.NoOneSubscribed);
            } else {
                BillingController billingController2 = BillingController.getInstance();
                double d9 = tL_starsSubscriptionPricing2.amount / 1000.0d;
                i16 = ((org.telegram.ui.ActionBar.f3) a60Var2).currentAccount;
                format = String.format(locale2, "you get approximately %1$s %2$s", billingController2.formatCurrency((long) (d9 * MessagesController.getInstance(i16).starsUsdWithdrawRate1000 * i23), "USD"), "for ".concat(str5));
            }
            textView.setText(format);
            return;
        }
        y50 y50Var = (y50) view;
        if (i9 == a60Var.n) {
            j10 = tL_chatInviteExported.admin_id;
            tL_chatInviteImporter = null;
        } else {
            int i26 = a60Var.x;
            ArrayList arrayList = a60Var.Z;
            int i27 = a60Var.B;
            if (i27 != -1 && i9 >= i27) {
                arrayList = a60Var.a0;
                i26 = i27;
            }
            int i28 = a60Var.K;
            if (i28 != -1 && i9 >= i28) {
                arrayList = a60Var.b0;
                i26 = i28;
            }
            TLRPC.TL_chatInviteImporter tL_chatInviteImporter2 = (TLRPC.TL_chatInviteImporter) arrayList.get(i9 - i26);
            j10 = tL_chatInviteImporter2.user_id;
            tL_chatInviteImporter = tL_chatInviteImporter2;
        }
        TLRPC.User user2 = (TLRPC.User) hashMap.get(Long.valueOf(j10));
        if (chatFull != null && chatFull.participants != null) {
            for (int i29 = 0; i29 < chatFull.participants.participants.size(); i29++) {
                if (chatFull.participants.participants.get(i29).user_id == j10) {
                    chatParticipant = chatFull.participants.participants.get(i29);
                    break;
                }
            }
        }
        chatParticipant = null;
        if (i9 == a60Var.n) {
            user2 = (TLRPC.User) hashMap.get(Long.valueOf(j10));
            if (user2 == null) {
                i15 = ((org.telegram.ui.ActionBar.f3) a60Var).currentAccount;
                user2 = MessagesController.getInstance(i15).getUser(Long.valueOf(tL_chatInviteExported.admin_id));
            }
            if (user2 != null) {
                str = LocaleController.formatDateAudio(tL_chatInviteExported.date, false);
                user = user2;
                if (i9 != a60Var.n && chatParticipant != null) {
                    if (chatParticipant instanceof TLRPC.TL_chatChannelParticipant) {
                        TLRPC.ChannelParticipant channelParticipant = ((TLRPC.TL_chatChannelParticipant) chatParticipant).channelParticipant;
                        String str6 = channelParticipant.rank;
                        if (channelParticipant instanceof TLRPC.TL_channelParticipantCreator) {
                            if (TextUtils.isEmpty(str6)) {
                                str6 = LocaleController.getString("ChannelCreator", R.string.ChannelCreator);
                            }
                            str4 = str6;
                            z14 = true;
                            z15 = true;
                        } else if (channelParticipant instanceof TLRPC.TL_channelParticipantAdmin) {
                            if (TextUtils.isEmpty(str6)) {
                                str6 = LocaleController.getString("ChannelAdmin", R.string.ChannelAdmin);
                            }
                            long j15 = channelParticipant.promoted_by;
                            i14 = ((org.telegram.ui.ActionBar.f3) a60Var).currentAccount;
                            z16 = j15 == UserConfig.getInstance(i14).getClientUserId();
                            str4 = str6;
                            z14 = true;
                            z15 = false;
                            String str7 = str4;
                            z11 = z15;
                            str2 = str7;
                            z12 = z16;
                            z10 = z14;
                        } else {
                            str4 = str6;
                            z14 = false;
                            z15 = false;
                        }
                        z16 = false;
                        String str72 = str4;
                        z11 = z15;
                        str2 = str72;
                        z12 = z16;
                        z10 = z14;
                    } else {
                        String str8 = chatParticipant.rank;
                        if (chatParticipant instanceof TLRPC.TL_chatParticipantCreator) {
                            if (TextUtils.isEmpty(str8)) {
                                str8 = LocaleController.getString("ChannelCreator", R.string.ChannelCreator);
                            }
                            str2 = str8;
                            z10 = true;
                            z11 = true;
                            z12 = false;
                        } else if (chatParticipant instanceof TLRPC.TL_chatParticipantAdmin) {
                            if (TextUtils.isEmpty(str8)) {
                                str8 = LocaleController.getString("ChannelAdmin", R.string.ChannelAdmin);
                            }
                            long j16 = chatParticipant.inviter_id;
                            i13 = ((org.telegram.ui.ActionBar.f3) a60Var).currentAccount;
                            z12 = j16 == UserConfig.getInstance(i13).getClientUserId();
                            z10 = true;
                            z11 = false;
                            str2 = str8;
                        } else {
                            str2 = str8;
                        }
                    }
                    if (UserObject.isUserSelf(user)) {
                        i12 = ((org.telegram.ui.ActionBar.f3) a60Var).currentAccount;
                        str3 = str;
                        if (ChatObject.canManageMyTag(MessagesController.getInstance(i12).getChat(Long.valueOf(a60Var.c0)))) {
                            z13 = true;
                            y50Var.a(str2, z10, z11, z13, new q50(this, user, str2, z10, z11, z12, 0));
                            y50Var.e(user, null, str3, false);
                            if (i9 != a60Var.n || (tL_starsSubscriptionPricing = tL_chatInviteExported.subscription_pricing) == null || tL_chatInviteImporter == null) {
                                return;
                            }
                            int i30 = tL_chatInviteImporter.date;
                            TextView textView3 = y50Var.U;
                            TextView textView4 = y50Var.T;
                            SpannableStringBuilder X0 = gh.oa.X0(false, "⭐️" + tL_starsSubscriptionPricing.amount, 0.7f, null);
                            int i31 = tL_starsSubscriptionPricing.period;
                            String string = i31 == 2592000 ? LocaleController.getString(R.string.StarsParticipantSubscriptionPerMonth) : i31 == 300 ? "per 5 minutes" : "per each minute";
                            textView4.setText(X0);
                            textView3.setText(string);
                            y50Var.i((int) Math.max(kh.x3.g(X0, textView4.getPaint()), kh.x3.g(string, textView3.getPaint())), true);
                            y50Var.c.l(LocaleController.formatJoined(i30), false);
                            return;
                        }
                    } else {
                        str3 = str;
                    }
                    z13 = false;
                    y50Var.a(str2, z10, z11, z13, new q50(this, user, str2, z10, z11, z12, 0));
                    y50Var.e(user, null, str3, false);
                    if (i9 != a60Var.n) {
                        return;
                    } else {
                        return;
                    }
                }
                str2 = null;
                z10 = false;
                z11 = false;
                z12 = false;
                if (UserObject.isUserSelf(user)) {
                }
                z13 = false;
                y50Var.a(str2, z10, z11, z13, new q50(this, user, str2, z10, z11, z12, 0));
                y50Var.e(user, null, str3, false);
                if (i9 != a60Var.n) {
                }
            }
        }
        user = user2;
        str = null;
        if (i9 != a60Var.n) {
        }
        str2 = null;
        z10 = false;
        z11 = false;
        z12 = false;
        if (UserObject.isUserSelf(user)) {
        }
        z13 = false;
        y50Var.a(str2, z10, z11, z13, new q50(this, user, str2, z10, z11, z12, 0));
        y50Var.e(user, null, str3, false);
        if (i9 != a60Var.n) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // f2.r0
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        e00 e00Var;
        View view;
        org.telegram.ui.ActionBar.b6 b6Var;
        Context context = viewGroup.getContext();
        a60 a60Var = this.c;
        switch (i9) {
            case 1:
                view = new y50(context);
                break;
            case 2:
                view = new org.telegram.ui.Cells.z6(context, org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.a7, false), 0);
                break;
            case 3:
                r50 r50Var = new r50(this, context, a60Var.Q, a60Var, a60Var.d0);
                r50Var.setDelegate(new u50(this));
                r50Var.setLayoutParams(new f2.a1(-1, -2));
                view = r50Var;
                break;
            case 4:
                view = new z50(a60Var, context);
                break;
            case 5:
                e00 e00Var2 = new e00(context, null);
                e00Var2.setIsSingleCell(true);
                e00Var2.setViewType(10);
                e00Var2.w = false;
                e00Var2.setPaddingLeft(AndroidUtilities.dp(10.0f));
                e00Var = e00Var2;
                view = e00Var;
                break;
            case 6:
                view = new an(context, 13);
                break;
            case 7:
                view = new org.telegram.ui.Cells.z6(context, (org.telegram.ui.Cells.j2) null);
                break;
            case 8:
                w50 w50Var = new w50(context);
                TextView textView = new TextView(context);
                w50Var.a = textView;
                textView.setTextSize(1, 14.0f);
                j3.r0.w(org.telegram.ui.ActionBar.f6.y6, null, false, textView, 1);
                w50Var.addView(textView, g7.e6.d(-1, -2.0f, 16, 60.0f, 0.0f, 60.0f, 0.0f));
                e00Var = w50Var;
                view = e00Var;
                break;
            case 9:
                view = new x50(a60Var, context);
                break;
            default:
                b6Var = ((org.telegram.ui.ActionBar.f3) a60Var).resourcesProvider;
                view = new org.telegram.ui.Cells.v3(context, b6Var);
                break;
        }
        return j3.r0.s(view, view, -1, -2);
    }
}
