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

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class p60 extends rl0 {
    public final /* synthetic */ u60 c;

    public p60(u60 u60Var) {
        this.c = u60Var;
    }

    @Override // org.telegram.ui.Components.rl0
    public final boolean D(f2.m1 m1Var) {
        int i10;
        int b10 = m1Var.b();
        u60 u60Var = this.c;
        if (b10 == u60Var.n) {
            long j10 = u60Var.b.admin_id;
            i10 = ((org.telegram.ui.ActionBar.h3) u60Var).currentAccount;
            return j10 != UserConfig.getInstance(i10).clientUserId;
        }
        if (b10 < u60Var.x || b10 >= u60Var.y) {
            return b10 >= u60Var.L && b10 < u60Var.M;
        }
        return true;
    }

    @Override // f2.p0
    public final int h() {
        return this.c.P;
    }

    @Override // f2.p0
    public final int j(int i10) {
        u60 u60Var = this.c;
        if (i10 == u60Var.h || i10 == u60Var.K || i10 == u60Var.w || i10 == u60Var.e) {
            return 0;
        }
        if (i10 == u60Var.n) {
            return 1;
        }
        if (i10 >= u60Var.L && i10 < u60Var.M) {
            return 1;
        }
        if (i10 >= u60Var.x && i10 < u60Var.y) {
            return 1;
        }
        if (i10 == u60Var.r || i10 == u60Var.s) {
            return 2;
        }
        if (i10 == u60Var.E) {
            return 3;
        }
        if (i10 == u60Var.F) {
            return 4;
        }
        if (i10 == u60Var.G) {
            return 5;
        }
        u60Var.getClass();
        if (i10 == 0 || i10 == u60Var.H || i10 == u60Var.I) {
            return 6;
        }
        if (i10 == u60Var.v) {
            return 7;
        }
        if (i10 == u60Var.J) {
            return 8;
        }
        return i10 == u60Var.f ? 9 : 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:116:0x03ba  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x03f9  */
    /* JADX WARN: Removed duplicated region for block: B:135:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:137:0x03d7  */
    @Override // f2.p0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(f2.m1 m1Var, int i10) {
        int i11;
        int i12;
        long j10;
        TLRPC.TL_chatInviteImporter tL_chatInviteImporter;
        TLRPC.ChatParticipant chatParticipant;
        TLRPC.User user;
        String str;
        String str2;
        boolean z4;
        boolean z10;
        boolean z11;
        String str3;
        boolean z12;
        TL_stars.TL_starsSubscriptionPricing tL_starsSubscriptionPricing;
        int i13;
        int i14;
        String str4;
        boolean z13;
        boolean z14;
        int i15;
        boolean z15;
        int i16;
        int i17;
        String format;
        int i18;
        String formatString;
        u60 u60Var = this.c;
        HashMap hashMap = u60Var.c;
        TLRPC.ChatFull chatFull = u60Var.d;
        TLRPC.TL_chatInviteExported tL_chatInviteExported = u60Var.b;
        int i19 = m1Var.f;
        View view = m1Var.a;
        if (i19 == 0) {
            org.telegram.ui.Cells.u3 u3Var = (org.telegram.ui.Cells.u3) view;
            if (i10 == u60Var.h) {
                u3Var.setText(LocaleController.getString(R.string.LinkCreatedeBy));
                u3Var.setRightText(null);
                return;
            }
            if (i10 == u60Var.e) {
                u3Var.setText(LocaleController.getString(R.string.LinkRevenue));
                u3Var.setRightText(null);
                return;
            }
            if (i10 != u60Var.w) {
                if (i10 == u60Var.B) {
                    u3Var.setText(LocaleController.formatPluralString("PeopleSubscriptionExpired", tL_chatInviteExported.subscription_expired, new Object[0]));
                    u3Var.setRightText(null);
                    return;
                } else {
                    if (i10 == u60Var.K) {
                        u3Var.setText(LocaleController.formatPluralString("JoinRequests", tL_chatInviteExported.requested, new Object[0]));
                        u3Var.setRightText(null);
                        return;
                    }
                    return;
                }
            }
            int i20 = tL_chatInviteExported.usage;
            if (i20 > 0) {
                u3Var.setText(LocaleController.formatPluralString("PeopleJoined", i20, new Object[0]));
            } else {
                u3Var.setText(LocaleController.getString(tL_chatInviteExported.subscription_pricing != null ? R.string.NoOneSubscribed : R.string.NoOneJoined));
            }
            if (tL_chatInviteExported.expired || tL_chatInviteExported.revoked || (i11 = tL_chatInviteExported.usage_limit) <= 0 || (i12 = tL_chatInviteExported.usage) <= 0) {
                u3Var.setRightText(null);
                return;
            } else {
                u3Var.setRightText(LocaleController.formatPluralString("PeopleJoinedRemaining", i11 - i12, new Object[0]));
                return;
            }
        }
        if (i19 != 1) {
            if (i19 == 3) {
                y80 y80Var = (y80) view;
                y80Var.d(0, null, false);
                y80Var.setLink(tL_chatInviteExported.link);
                y80Var.setRevoke(tL_chatInviteExported.revoked);
                y80Var.setPermanent(tL_chatInviteExported.permanent);
                y80Var.setCanEdit(u60Var.h0);
                y80Var.b(!u60Var.h0);
                return;
            }
            if (i19 == 4) {
                t60 t60Var = (t60) view;
                AndroidUtilities.cancelRunOnUIThread(t60Var.v);
                t60Var.w = false;
                t60Var.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.B6, false));
                t60Var.setFixedSize(0);
                if (tL_chatInviteExported.revoked) {
                    t60Var.setText(LocaleController.getString(R.string.LinkIsNoActive));
                    return;
                }
                if (tL_chatInviteExported.expired) {
                    int i21 = tL_chatInviteExported.usage_limit;
                    if (i21 > 0 && i21 == tL_chatInviteExported.usage) {
                        t60Var.setText(LocaleController.getString(R.string.LinkIsExpiredLimitReached));
                        return;
                    } else {
                        t60Var.setText(LocaleController.getString(R.string.LinkIsExpired));
                        t60Var.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.p7, false));
                        return;
                    }
                }
                if (tL_chatInviteExported.expire_date <= 0) {
                    t60Var.setFixedSize(-1);
                    t60Var.setText(null);
                    return;
                }
                long currentTimeMillis = (u60Var.f0 * 1000) + System.currentTimeMillis();
                long j11 = tL_chatInviteExported.expire_date;
                long j12 = (j11 * 1000) - currentTimeMillis;
                if (j12 < 0) {
                    j12 = 0;
                }
                if (j12 > 86400000) {
                    t60Var.setText(LocaleController.formatString("LinkExpiresIn", R.string.LinkExpiresIn, LocaleController.formatDateAudio(j11, false)));
                    return;
                }
                long j13 = j12 / 1000;
                int i22 = (int) (j13 % 60);
                long j14 = j13 / 60;
                StringBuilder sb = new StringBuilder();
                Locale locale = Locale.ENGLISH;
                sb.append(String.format(locale, "%02d", Integer.valueOf((int) (j14 / 60))));
                sb.append(String.format(locale, ":%02d", Integer.valueOf((int) (j14 % 60))));
                sb.append(String.format(locale, ":%02d", Integer.valueOf(i22)));
                String sb2 = sb.toString();
                t60Var.w = true;
                m2.b bVar = t60Var.v;
                AndroidUtilities.cancelRunOnUIThread(bVar);
                if (t60Var.w) {
                    AndroidUtilities.runOnUIThread(bVar, 500L);
                }
                t60Var.setText(LocaleController.formatString("LinkExpiresInTime", R.string.LinkExpiresInTime, sb2));
                return;
            }
            if (i19 == 8) {
                q60 q60Var = (q60) view;
                int i23 = tL_chatInviteExported.usage_limit;
                if (i23 <= 0) {
                    q60Var.a.setVisibility(8);
                    return;
                } else {
                    q60Var.a.setText(LocaleController.formatPluralString("PeopleCanJoinViaLinkCount", i23, new Object[0]));
                    q60Var.a.setVisibility(0);
                    return;
                }
            }
            if (i19 != 9) {
                return;
            }
            r60 r60Var = (r60) view;
            TL_stars.TL_starsSubscriptionPricing tL_starsSubscriptionPricing2 = tL_chatInviteExported.subscription_pricing;
            int i24 = tL_chatInviteExported.usage;
            u60 u60Var2 = r60Var.c;
            TextView textView = r60Var.b;
            TextView textView2 = r60Var.a;
            if (tL_starsSubscriptionPricing2 == null) {
                return;
            }
            int i25 = tL_starsSubscriptionPricing2.period;
            if (i25 == 2592000) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(LocaleController.formatString(R.string.LinkRevenuePrice, Long.valueOf(tL_starsSubscriptionPricing2.amount)));
                sb3.append(i24 > 0 ? l.d.j(i24, " x ") : "");
                textView2.setText(mh.ja.X0(false, sb3.toString(), 0.8f, null));
                if (i24 == 0) {
                    formatString = LocaleController.getString(R.string.NoOneSubscribed);
                } else {
                    int i26 = R.string.LinkRevenuePriceInfo;
                    BillingController billingController = BillingController.getInstance();
                    double d = tL_starsSubscriptionPricing2.amount / 1000.0d;
                    i18 = ((org.telegram.ui.ActionBar.h3) u60Var2).currentAccount;
                    formatString = LocaleController.formatString(i26, billingController.formatCurrency((long) (d * MessagesController.getInstance(i18).starsUsdWithdrawRate1000 * i24), "USD"));
                }
                textView.setText(formatString);
                return;
            }
            String str5 = i25 == 300 ? "5min" : "min";
            StringBuilder sb4 = new StringBuilder();
            Locale locale2 = Locale.US;
            sb4.append(String.format(locale2, "⭐%1$d/%2$s", Long.valueOf(tL_starsSubscriptionPricing2.amount), str5));
            sb4.append(i24 > 0 ? l.d.j(i24, " x ") : "");
            textView2.setText(mh.ja.X0(false, sb4.toString(), 0.8f, null));
            if (i24 == 0) {
                format = LocaleController.getString(R.string.NoOneSubscribed);
            } else {
                BillingController billingController2 = BillingController.getInstance();
                double d10 = tL_starsSubscriptionPricing2.amount / 1000.0d;
                i17 = ((org.telegram.ui.ActionBar.h3) u60Var2).currentAccount;
                format = String.format(locale2, "you get approximately %1$s %2$s", billingController2.formatCurrency((long) (d10 * MessagesController.getInstance(i17).starsUsdWithdrawRate1000 * i24), "USD"), "for ".concat(str5));
            }
            textView.setText(format);
            return;
        }
        s60 s60Var = (s60) view;
        if (i10 == u60Var.n) {
            j10 = tL_chatInviteExported.admin_id;
            tL_chatInviteImporter = null;
        } else {
            int i27 = u60Var.x;
            ArrayList arrayList = u60Var.a0;
            int i28 = u60Var.C;
            if (i28 != -1 && i10 >= i28) {
                arrayList = u60Var.b0;
                i27 = i28;
            }
            int i29 = u60Var.L;
            if (i29 != -1 && i10 >= i29) {
                arrayList = u60Var.c0;
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
        if (i10 == u60Var.n) {
            user2 = (TLRPC.User) hashMap.get(Long.valueOf(j10));
            if (user2 == null) {
                i16 = ((org.telegram.ui.ActionBar.h3) u60Var).currentAccount;
                user2 = MessagesController.getInstance(i16).getUser(Long.valueOf(tL_chatInviteExported.admin_id));
            }
            if (user2 != null) {
                str = LocaleController.formatDateAudio(tL_chatInviteExported.date, false);
                user = user2;
                if (i10 != u60Var.n && chatParticipant != null) {
                    if (chatParticipant instanceof TLRPC.TL_chatChannelParticipant) {
                        TLRPC.ChannelParticipant channelParticipant = ((TLRPC.TL_chatChannelParticipant) chatParticipant).channelParticipant;
                        String str6 = channelParticipant.rank;
                        if (channelParticipant instanceof TLRPC.TL_channelParticipantCreator) {
                            if (TextUtils.isEmpty(str6)) {
                                str6 = LocaleController.getString("ChannelCreator", R.string.ChannelCreator);
                            }
                            str4 = str6;
                            z13 = true;
                            z14 = true;
                        } else if (channelParticipant instanceof TLRPC.TL_channelParticipantAdmin) {
                            if (TextUtils.isEmpty(str6)) {
                                str6 = LocaleController.getString("ChannelAdmin", R.string.ChannelAdmin);
                            }
                            long j15 = channelParticipant.promoted_by;
                            i15 = ((org.telegram.ui.ActionBar.h3) u60Var).currentAccount;
                            z15 = j15 == UserConfig.getInstance(i15).getClientUserId();
                            str4 = str6;
                            z13 = true;
                            z14 = false;
                            String str7 = str4;
                            z10 = z14;
                            str2 = str7;
                            z11 = z15;
                            z4 = z13;
                        } else {
                            str4 = str6;
                            z13 = false;
                            z14 = false;
                        }
                        z15 = false;
                        String str72 = str4;
                        z10 = z14;
                        str2 = str72;
                        z11 = z15;
                        z4 = z13;
                    } else {
                        String str8 = chatParticipant.rank;
                        if (chatParticipant instanceof TLRPC.TL_chatParticipantCreator) {
                            if (TextUtils.isEmpty(str8)) {
                                str8 = LocaleController.getString("ChannelCreator", R.string.ChannelCreator);
                            }
                            str2 = str8;
                            z4 = true;
                            z10 = true;
                            z11 = false;
                        } else if (chatParticipant instanceof TLRPC.TL_chatParticipantAdmin) {
                            if (TextUtils.isEmpty(str8)) {
                                str8 = LocaleController.getString("ChannelAdmin", R.string.ChannelAdmin);
                            }
                            long j16 = chatParticipant.inviter_id;
                            i14 = ((org.telegram.ui.ActionBar.h3) u60Var).currentAccount;
                            z11 = j16 == UserConfig.getInstance(i14).getClientUserId();
                            z4 = true;
                            z10 = false;
                            str2 = str8;
                        } else {
                            str2 = str8;
                        }
                    }
                    if (UserObject.isUserSelf(user)) {
                        i13 = ((org.telegram.ui.ActionBar.h3) u60Var).currentAccount;
                        str3 = str;
                        if (ChatObject.canManageMyTag(MessagesController.getInstance(i13).getChat(Long.valueOf(u60Var.d0)))) {
                            z12 = true;
                            s60Var.a(str2, z4, z10, z12, new k60(this, user, str2, z4, z10, z11, 0));
                            s60Var.d(user, null, str3, false);
                            if (i10 != u60Var.n || (tL_starsSubscriptionPricing = tL_chatInviteExported.subscription_pricing) == null || tL_chatInviteImporter == null) {
                                return;
                            }
                            int i31 = tL_chatInviteImporter.date;
                            TextView textView3 = s60Var.V;
                            TextView textView4 = s60Var.U;
                            SpannableStringBuilder X0 = mh.ja.X0(false, "⭐️" + tL_starsSubscriptionPricing.amount, 0.7f, null);
                            int i32 = tL_starsSubscriptionPricing.period;
                            String string = i32 == 2592000 ? LocaleController.getString(R.string.StarsParticipantSubscriptionPerMonth) : i32 == 300 ? "per 5 minutes" : "per each minute";
                            textView4.setText(X0);
                            textView3.setText(string);
                            s60Var.i((int) Math.max(qh.e3.g(X0, textView4.getPaint()), qh.e3.g(string, textView3.getPaint())), true);
                            s60Var.c.l(LocaleController.formatJoined(i31), false);
                            return;
                        }
                    } else {
                        str3 = str;
                    }
                    z12 = false;
                    s60Var.a(str2, z4, z10, z12, new k60(this, user, str2, z4, z10, z11, 0));
                    s60Var.d(user, null, str3, false);
                    if (i10 != u60Var.n) {
                        return;
                    } else {
                        return;
                    }
                }
                str2 = null;
                z4 = false;
                z10 = false;
                z11 = false;
                if (UserObject.isUserSelf(user)) {
                }
                z12 = false;
                s60Var.a(str2, z4, z10, z12, new k60(this, user, str2, z4, z10, z11, 0));
                s60Var.d(user, null, str3, false);
                if (i10 != u60Var.n) {
                }
            }
        }
        user = user2;
        str = null;
        if (i10 != u60Var.n) {
        }
        str2 = null;
        z4 = false;
        z10 = false;
        z11 = false;
        if (UserObject.isUserSelf(user)) {
        }
        z12 = false;
        s60Var.a(str2, z4, z10, z12, new k60(this, user, str2, z4, z10, z11, 0));
        s60Var.d(user, null, str3, false);
        if (i10 != u60Var.n) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // f2.p0
    public final f2.m1 x(ViewGroup viewGroup, int i10) {
        u00 u00Var;
        View view;
        org.telegram.ui.ActionBar.g6 g6Var;
        Context context = viewGroup.getContext();
        u60 u60Var = this.c;
        switch (i10) {
            case 1:
                view = new s60(context);
                break;
            case 2:
                view = new org.telegram.ui.Cells.z6(context, org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.a7, false), 0);
                break;
            case 3:
                l60 l60Var = new l60(this, context, u60Var.R, u60Var, u60Var.e0);
                l60Var.setDelegate(new o60(this));
                l60Var.setLayoutParams(new f2.x0(-1, -2));
                view = l60Var;
                break;
            case 4:
                view = new t60(u60Var, context);
                break;
            case 5:
                u00 u00Var2 = new u00(context, null);
                u00Var2.setIsSingleCell(true);
                u00Var2.setViewType(10);
                u00Var2.w = false;
                u00Var2.setPaddingLeft(AndroidUtilities.dp(10.0f));
                u00Var = u00Var2;
                view = u00Var;
                break;
            case 6:
                view = new in(context, 9);
                break;
            case 7:
                view = new org.telegram.ui.Cells.z6(context, (org.telegram.ui.b) null);
                break;
            case 8:
                q60 q60Var = new q60(context);
                TextView textView = new TextView(context);
                q60Var.a = textView;
                textView.setTextSize(1, 14.0f);
                org.telegram.ui.yh.t(org.telegram.ui.ActionBar.k6.y6, null, false, textView, 1);
                q60Var.addView(textView, k7.c6.d(-1, -2.0f, 16, 60.0f, 0.0f, 60.0f, 0.0f));
                u00Var = q60Var;
                view = u00Var;
                break;
            case 9:
                view = new r60(u60Var, context);
                break;
            default:
                g6Var = ((org.telegram.ui.ActionBar.h3) u60Var).resourcesProvider;
                view = new org.telegram.ui.Cells.u3(context, g6Var);
                break;
        }
        return org.telegram.ui.yh.o(view, view, -1, -2);
    }
}
