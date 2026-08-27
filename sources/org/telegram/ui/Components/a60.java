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

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class a60 extends yk0 {
    public final /* synthetic */ f60 c;

    public a60(f60 f60Var) {
        this.c = f60Var;
    }

    @Override // org.telegram.ui.Components.yk0
    public final boolean D(f2.o1 o1Var) {
        int i10;
        int b10 = o1Var.b();
        f60 f60Var = this.c;
        if (b10 == f60Var.n) {
            long j10 = f60Var.b.admin_id;
            i10 = ((org.telegram.ui.ActionBar.e3) f60Var).currentAccount;
            return j10 != UserConfig.getInstance(i10).clientUserId;
        }
        if (b10 < f60Var.x || b10 >= f60Var.y) {
            return b10 >= f60Var.K && b10 < f60Var.L;
        }
        return true;
    }

    @Override // f2.q0
    public final int h() {
        return this.c.O;
    }

    @Override // f2.q0
    public final int j(int i10) {
        f60 f60Var = this.c;
        if (i10 == f60Var.h || i10 == f60Var.J || i10 == f60Var.w || i10 == f60Var.e) {
            return 0;
        }
        if (i10 == f60Var.n) {
            return 1;
        }
        if (i10 >= f60Var.K && i10 < f60Var.L) {
            return 1;
        }
        if (i10 >= f60Var.x && i10 < f60Var.y) {
            return 1;
        }
        if (i10 == f60Var.r || i10 == f60Var.s) {
            return 2;
        }
        if (i10 == f60Var.D) {
            return 3;
        }
        if (i10 == f60Var.E) {
            return 4;
        }
        if (i10 == f60Var.F) {
            return 5;
        }
        f60Var.getClass();
        if (i10 == 0 || i10 == f60Var.G || i10 == f60Var.H) {
            return 6;
        }
        if (i10 == f60Var.v) {
            return 7;
        }
        if (i10 == f60Var.I) {
            return 8;
        }
        return i10 == f60Var.f ? 9 : 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:116:0x03ba  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x03f9  */
    /* JADX WARN: Removed duplicated region for block: B:135:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:137:0x03d7  */
    @Override // f2.q0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(f2.o1 o1Var, int i10) {
        int i11;
        int i12;
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
        int i13;
        int i14;
        String str4;
        boolean z14;
        boolean z15;
        int i15;
        boolean z16;
        int i16;
        int i17;
        String format;
        int i18;
        String formatString;
        f60 f60Var = this.c;
        HashMap hashMap = f60Var.c;
        TLRPC.ChatFull chatFull = f60Var.d;
        TLRPC.TL_chatInviteExported tL_chatInviteExported = f60Var.b;
        int i19 = o1Var.f;
        View view = o1Var.a;
        if (i19 == 0) {
            org.telegram.ui.Cells.s3 s3Var = (org.telegram.ui.Cells.s3) view;
            if (i10 == f60Var.h) {
                s3Var.setText(LocaleController.getString(R.string.LinkCreatedeBy));
                s3Var.setRightText(null);
                return;
            }
            if (i10 == f60Var.e) {
                s3Var.setText(LocaleController.getString(R.string.LinkRevenue));
                s3Var.setRightText(null);
                return;
            }
            if (i10 != f60Var.w) {
                if (i10 == f60Var.A) {
                    s3Var.setText(LocaleController.formatPluralString("PeopleSubscriptionExpired", tL_chatInviteExported.subscription_expired, new Object[0]));
                    s3Var.setRightText(null);
                    return;
                } else {
                    if (i10 == f60Var.J) {
                        s3Var.setText(LocaleController.formatPluralString("JoinRequests", tL_chatInviteExported.requested, new Object[0]));
                        s3Var.setRightText(null);
                        return;
                    }
                    return;
                }
            }
            int i20 = tL_chatInviteExported.usage;
            if (i20 > 0) {
                s3Var.setText(LocaleController.formatPluralString("PeopleJoined", i20, new Object[0]));
            } else {
                s3Var.setText(LocaleController.getString(tL_chatInviteExported.subscription_pricing != null ? R.string.NoOneSubscribed : R.string.NoOneJoined));
            }
            if (tL_chatInviteExported.expired || tL_chatInviteExported.revoked || (i11 = tL_chatInviteExported.usage_limit) <= 0 || (i12 = tL_chatInviteExported.usage) <= 0) {
                s3Var.setRightText(null);
                return;
            } else {
                s3Var.setRightText(LocaleController.formatPluralString("PeopleJoinedRemaining", i11 - i12, new Object[0]));
                return;
            }
        }
        if (i19 != 1) {
            if (i19 == 3) {
                i80 i80Var = (i80) view;
                i80Var.d(0, null, false);
                i80Var.setLink(tL_chatInviteExported.link);
                i80Var.setRevoke(tL_chatInviteExported.revoked);
                i80Var.setPermanent(tL_chatInviteExported.permanent);
                i80Var.setCanEdit(f60Var.g0);
                i80Var.b(!f60Var.g0);
                return;
            }
            if (i19 == 4) {
                e60 e60Var = (e60) view;
                AndroidUtilities.cancelRunOnUIThread(e60Var.v);
                e60Var.w = false;
                e60Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.B6, false));
                e60Var.setFixedSize(0);
                if (tL_chatInviteExported.revoked) {
                    e60Var.setText(LocaleController.getString(R.string.LinkIsNoActive));
                    return;
                }
                if (tL_chatInviteExported.expired) {
                    int i21 = tL_chatInviteExported.usage_limit;
                    if (i21 > 0 && i21 == tL_chatInviteExported.usage) {
                        e60Var.setText(LocaleController.getString(R.string.LinkIsExpiredLimitReached));
                        return;
                    } else {
                        e60Var.setText(LocaleController.getString(R.string.LinkIsExpired));
                        e60Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.p7, false));
                        return;
                    }
                }
                if (tL_chatInviteExported.expire_date <= 0) {
                    e60Var.setFixedSize(-1);
                    e60Var.setText(null);
                    return;
                }
                long currentTimeMillis = (f60Var.e0 * 1000) + System.currentTimeMillis();
                long j11 = tL_chatInviteExported.expire_date;
                long j12 = (j11 * 1000) - currentTimeMillis;
                if (j12 < 0) {
                    j12 = 0;
                }
                if (j12 > 86400000) {
                    e60Var.setText(LocaleController.formatString("LinkExpiresIn", R.string.LinkExpiresIn, LocaleController.formatDateAudio(j11, false)));
                    return;
                }
                long j13 = j12 / 1000;
                int i22 = (int) (j13 % 60);
                long j14 = j13 / 60;
                StringBuilder sb2 = new StringBuilder();
                Locale locale = Locale.ENGLISH;
                sb2.append(String.format(locale, "%02d", Integer.valueOf((int) (j14 / 60))));
                sb2.append(String.format(locale, ":%02d", Integer.valueOf((int) (j14 % 60))));
                sb2.append(String.format(locale, ":%02d", Integer.valueOf(i22)));
                String sb3 = sb2.toString();
                e60Var.w = true;
                m.i3 i3Var = e60Var.v;
                AndroidUtilities.cancelRunOnUIThread(i3Var);
                if (e60Var.w) {
                    AndroidUtilities.runOnUIThread(i3Var, 500L);
                }
                e60Var.setText(LocaleController.formatString("LinkExpiresInTime", R.string.LinkExpiresInTime, sb3));
                return;
            }
            if (i19 == 8) {
                b60 b60Var = (b60) view;
                int i23 = tL_chatInviteExported.usage_limit;
                if (i23 <= 0) {
                    b60Var.a.setVisibility(8);
                    return;
                } else {
                    b60Var.a.setText(LocaleController.formatPluralString("PeopleCanJoinViaLinkCount", i23, new Object[0]));
                    b60Var.a.setVisibility(0);
                    return;
                }
            }
            if (i19 != 9) {
                return;
            }
            c60 c60Var = (c60) view;
            TL_stars.TL_starsSubscriptionPricing tL_starsSubscriptionPricing2 = tL_chatInviteExported.subscription_pricing;
            int i24 = tL_chatInviteExported.usage;
            f60 f60Var2 = c60Var.c;
            TextView textView = c60Var.b;
            TextView textView2 = c60Var.a;
            if (tL_starsSubscriptionPricing2 == null) {
                return;
            }
            int i25 = tL_starsSubscriptionPricing2.period;
            if (i25 == 2592000) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(LocaleController.formatString(R.string.LinkRevenuePrice, Long.valueOf(tL_starsSubscriptionPricing2.amount)));
                sb4.append(i24 > 0 ? i0.a.k(i24, " x ") : "");
                textView2.setText(hh.oa.X0(false, sb4.toString(), 0.8f, null));
                if (i24 == 0) {
                    formatString = LocaleController.getString(R.string.NoOneSubscribed);
                } else {
                    int i26 = R.string.LinkRevenuePriceInfo;
                    BillingController billingController = BillingController.getInstance();
                    double d = tL_starsSubscriptionPricing2.amount / 1000.0d;
                    i18 = ((org.telegram.ui.ActionBar.e3) f60Var2).currentAccount;
                    formatString = LocaleController.formatString(i26, billingController.formatCurrency((long) (d * MessagesController.getInstance(i18).starsUsdWithdrawRate1000 * i24), "USD"));
                }
                textView.setText(formatString);
                return;
            }
            String str5 = i25 == 300 ? "5min" : "min";
            StringBuilder sb5 = new StringBuilder();
            Locale locale2 = Locale.US;
            sb5.append(String.format(locale2, "⭐%1$d/%2$s", Long.valueOf(tL_starsSubscriptionPricing2.amount), str5));
            sb5.append(i24 > 0 ? i0.a.k(i24, " x ") : "");
            textView2.setText(hh.oa.X0(false, sb5.toString(), 0.8f, null));
            if (i24 == 0) {
                format = LocaleController.getString(R.string.NoOneSubscribed);
            } else {
                BillingController billingController2 = BillingController.getInstance();
                double d10 = tL_starsSubscriptionPricing2.amount / 1000.0d;
                i17 = ((org.telegram.ui.ActionBar.e3) f60Var2).currentAccount;
                format = String.format(locale2, "you get approximately %1$s %2$s", billingController2.formatCurrency((long) (d10 * MessagesController.getInstance(i17).starsUsdWithdrawRate1000 * i24), "USD"), "for ".concat(str5));
            }
            textView.setText(format);
            return;
        }
        d60 d60Var = (d60) view;
        if (i10 == f60Var.n) {
            j10 = tL_chatInviteExported.admin_id;
            tL_chatInviteImporter = null;
        } else {
            int i27 = f60Var.x;
            ArrayList arrayList = f60Var.Z;
            int i28 = f60Var.B;
            if (i28 != -1 && i10 >= i28) {
                arrayList = f60Var.a0;
                i27 = i28;
            }
            int i29 = f60Var.K;
            if (i29 != -1 && i10 >= i29) {
                arrayList = f60Var.b0;
                i27 = i29;
            }
            TLRPC.TL_chatInviteImporter tL_chatInviteImporter2 = (TLRPC.TL_chatInviteImporter) arrayList.get(i10 - i27);
            j10 = tL_chatInviteImporter2.user_id;
            tL_chatInviteImporter = tL_chatInviteImporter2;
        }
        TLRPC.User user2 = (TLRPC.User) hashMap.get(Long.valueOf(j10));
        if (chatFull != null && chatFull.participants != null) {
            for (int i30 = 0; i30 < chatFull.participants.participants.size(); i30++) {
                if (chatFull.participants.participants.get(i30).user_id == j10) {
                    chatParticipant = chatFull.participants.participants.get(i30);
                    break;
                }
            }
        }
        chatParticipant = null;
        if (i10 == f60Var.n) {
            user2 = (TLRPC.User) hashMap.get(Long.valueOf(j10));
            if (user2 == null) {
                i16 = ((org.telegram.ui.ActionBar.e3) f60Var).currentAccount;
                user2 = MessagesController.getInstance(i16).getUser(Long.valueOf(tL_chatInviteExported.admin_id));
            }
            if (user2 != null) {
                str = LocaleController.formatDateAudio(tL_chatInviteExported.date, false);
                user = user2;
                if (i10 != f60Var.n && chatParticipant != null) {
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
                            i15 = ((org.telegram.ui.ActionBar.e3) f60Var).currentAccount;
                            z16 = j15 == UserConfig.getInstance(i15).getClientUserId();
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
                            i14 = ((org.telegram.ui.ActionBar.e3) f60Var).currentAccount;
                            z12 = j16 == UserConfig.getInstance(i14).getClientUserId();
                            z10 = true;
                            z11 = false;
                            str2 = str8;
                        } else {
                            str2 = str8;
                        }
                    }
                    if (UserObject.isUserSelf(user)) {
                        i13 = ((org.telegram.ui.ActionBar.e3) f60Var).currentAccount;
                        str3 = str;
                        if (ChatObject.canManageMyTag(MessagesController.getInstance(i13).getChat(Long.valueOf(f60Var.c0)))) {
                            z13 = true;
                            d60Var.a(str2, z10, z11, z13, new v50(this, user, str2, z10, z11, z12, 0));
                            d60Var.e(user, null, str3, false);
                            if (i10 != f60Var.n || (tL_starsSubscriptionPricing = tL_chatInviteExported.subscription_pricing) == null || tL_chatInviteImporter == null) {
                                return;
                            }
                            int i31 = tL_chatInviteImporter.date;
                            TextView textView3 = d60Var.U;
                            TextView textView4 = d60Var.T;
                            SpannableStringBuilder X0 = hh.oa.X0(false, "⭐️" + tL_starsSubscriptionPricing.amount, 0.7f, null);
                            int i32 = tL_starsSubscriptionPricing.period;
                            String string = i32 == 2592000 ? LocaleController.getString(R.string.StarsParticipantSubscriptionPerMonth) : i32 == 300 ? "per 5 minutes" : "per each minute";
                            textView4.setText(X0);
                            textView3.setText(string);
                            d60Var.i((int) Math.max(lh.w3.g(X0, textView4.getPaint()), lh.w3.g(string, textView3.getPaint())), true);
                            d60Var.c.l(LocaleController.formatJoined(i31), false);
                            return;
                        }
                    } else {
                        str3 = str;
                    }
                    z13 = false;
                    d60Var.a(str2, z10, z11, z13, new v50(this, user, str2, z10, z11, z12, 0));
                    d60Var.e(user, null, str3, false);
                    if (i10 != f60Var.n) {
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
                d60Var.a(str2, z10, z11, z13, new v50(this, user, str2, z10, z11, z12, 0));
                d60Var.e(user, null, str3, false);
                if (i10 != f60Var.n) {
                }
            }
        }
        user = user2;
        str = null;
        if (i10 != f60Var.n) {
        }
        str2 = null;
        z10 = false;
        z11 = false;
        z12 = false;
        if (UserObject.isUserSelf(user)) {
        }
        z13 = false;
        d60Var.a(str2, z10, z11, z13, new v50(this, user, str2, z10, z11, z12, 0));
        d60Var.e(user, null, str3, false);
        if (i10 != f60Var.n) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // f2.q0
    public final f2.o1 x(ViewGroup viewGroup, int i10) {
        h00 h00Var;
        View view;
        org.telegram.ui.ActionBar.c6 c6Var;
        Context context = viewGroup.getContext();
        f60 f60Var = this.c;
        switch (i10) {
            case 1:
                view = new d60(context);
                break;
            case 2:
                view = new org.telegram.ui.Cells.w6(context, org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.a7, false), 0);
                break;
            case 3:
                w50 w50Var = new w50(this, context, f60Var.Q, f60Var, f60Var.d0);
                w50Var.setDelegate(new z50(this));
                w50Var.setLayoutParams(new f2.y0(-1, -2));
                view = w50Var;
                break;
            case 4:
                view = new e60(f60Var, context);
                break;
            case 5:
                h00 h00Var2 = new h00(context, null);
                h00Var2.setIsSingleCell(true);
                h00Var2.setViewType(10);
                h00Var2.w = false;
                h00Var2.setPaddingLeft(AndroidUtilities.dp(10.0f));
                h00Var = h00Var2;
                view = h00Var;
                break;
            case 6:
                view = new zm(context, 11);
                break;
            case 7:
                view = new org.telegram.ui.Cells.w6(context, (org.telegram.messenger.rl) null);
                break;
            case 8:
                b60 b60Var = new b60(context);
                TextView textView = new TextView(context);
                b60Var.a = textView;
                textView.setTextSize(1, 14.0f);
                org.telegram.ui.Cells.pa.s(org.telegram.ui.ActionBar.g6.y6, null, false, textView, 1);
                b60Var.addView(textView, h7.z5.d(-1, -2.0f, 16, 60.0f, 0.0f, 60.0f, 0.0f));
                h00Var = b60Var;
                view = h00Var;
                break;
            case 9:
                view = new c60(f60Var, context);
                break;
            default:
                c6Var = ((org.telegram.ui.ActionBar.e3) f60Var).resourcesProvider;
                view = new org.telegram.ui.Cells.s3(context, c6Var);
                break;
        }
        return org.telegram.ui.Cells.pa.l(view, view, -1, -2);
    }
}
