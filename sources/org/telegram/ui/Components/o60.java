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

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class o60 extends ql0 {
    public final /* synthetic */ t60 c;

    public o60(t60 t60Var) {
        this.c = t60Var;
    }

    @Override // org.telegram.ui.Components.ql0
    public final boolean D(f2.l1 l1Var) {
        int i10;
        int b10 = l1Var.b();
        t60 t60Var = this.c;
        if (b10 == t60Var.n) {
            long j10 = t60Var.b.admin_id;
            i10 = ((org.telegram.ui.ActionBar.g3) t60Var).currentAccount;
            return j10 != UserConfig.getInstance(i10).clientUserId;
        }
        if (b10 < t60Var.x || b10 >= t60Var.y) {
            return b10 >= t60Var.L && b10 < t60Var.M;
        }
        return true;
    }

    @Override // f2.o0
    public final int h() {
        return this.c.P;
    }

    @Override // f2.o0
    public final int j(int i10) {
        t60 t60Var = this.c;
        if (i10 == t60Var.h || i10 == t60Var.K || i10 == t60Var.w || i10 == t60Var.e) {
            return 0;
        }
        if (i10 == t60Var.n) {
            return 1;
        }
        if (i10 >= t60Var.L && i10 < t60Var.M) {
            return 1;
        }
        if (i10 >= t60Var.x && i10 < t60Var.y) {
            return 1;
        }
        if (i10 == t60Var.r || i10 == t60Var.s) {
            return 2;
        }
        if (i10 == t60Var.E) {
            return 3;
        }
        if (i10 == t60Var.F) {
            return 4;
        }
        if (i10 == t60Var.G) {
            return 5;
        }
        t60Var.getClass();
        if (i10 == 0 || i10 == t60Var.H || i10 == t60Var.I) {
            return 6;
        }
        if (i10 == t60Var.v) {
            return 7;
        }
        if (i10 == t60Var.J) {
            return 8;
        }
        return i10 == t60Var.f ? 9 : 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:116:0x03ba  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x03f9  */
    /* JADX WARN: Removed duplicated region for block: B:135:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:137:0x03d7  */
    @Override // f2.o0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(f2.l1 l1Var, int i10) {
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
        t60 t60Var = this.c;
        HashMap hashMap = t60Var.c;
        TLRPC.ChatFull chatFull = t60Var.d;
        TLRPC.TL_chatInviteExported tL_chatInviteExported = t60Var.b;
        int i19 = l1Var.f;
        View view = l1Var.a;
        if (i19 == 0) {
            org.telegram.ui.Cells.t3 t3Var = (org.telegram.ui.Cells.t3) view;
            if (i10 == t60Var.h) {
                t3Var.setText(LocaleController.getString(R.string.LinkCreatedeBy));
                t3Var.setRightText(null);
                return;
            }
            if (i10 == t60Var.e) {
                t3Var.setText(LocaleController.getString(R.string.LinkRevenue));
                t3Var.setRightText(null);
                return;
            }
            if (i10 != t60Var.w) {
                if (i10 == t60Var.B) {
                    t3Var.setText(LocaleController.formatPluralString("PeopleSubscriptionExpired", tL_chatInviteExported.subscription_expired, new Object[0]));
                    t3Var.setRightText(null);
                    return;
                } else {
                    if (i10 == t60Var.K) {
                        t3Var.setText(LocaleController.formatPluralString("JoinRequests", tL_chatInviteExported.requested, new Object[0]));
                        t3Var.setRightText(null);
                        return;
                    }
                    return;
                }
            }
            int i20 = tL_chatInviteExported.usage;
            if (i20 > 0) {
                t3Var.setText(LocaleController.formatPluralString("PeopleJoined", i20, new Object[0]));
            } else {
                t3Var.setText(LocaleController.getString(tL_chatInviteExported.subscription_pricing != null ? R.string.NoOneSubscribed : R.string.NoOneJoined));
            }
            if (tL_chatInviteExported.expired || tL_chatInviteExported.revoked || (i11 = tL_chatInviteExported.usage_limit) <= 0 || (i12 = tL_chatInviteExported.usage) <= 0) {
                t3Var.setRightText(null);
                return;
            } else {
                t3Var.setRightText(LocaleController.formatPluralString("PeopleJoinedRemaining", i11 - i12, new Object[0]));
                return;
            }
        }
        if (i19 != 1) {
            if (i19 == 3) {
                x80 x80Var = (x80) view;
                x80Var.d(0, null, false);
                x80Var.setLink(tL_chatInviteExported.link);
                x80Var.setRevoke(tL_chatInviteExported.revoked);
                x80Var.setPermanent(tL_chatInviteExported.permanent);
                x80Var.setCanEdit(t60Var.h0);
                x80Var.b(!t60Var.h0);
                return;
            }
            if (i19 == 4) {
                s60 s60Var = (s60) view;
                AndroidUtilities.cancelRunOnUIThread(s60Var.v);
                s60Var.w = false;
                s60Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.B6, false));
                s60Var.setFixedSize(0);
                if (tL_chatInviteExported.revoked) {
                    s60Var.setText(LocaleController.getString(R.string.LinkIsNoActive));
                    return;
                }
                if (tL_chatInviteExported.expired) {
                    int i21 = tL_chatInviteExported.usage_limit;
                    if (i21 > 0 && i21 == tL_chatInviteExported.usage) {
                        s60Var.setText(LocaleController.getString(R.string.LinkIsExpiredLimitReached));
                        return;
                    } else {
                        s60Var.setText(LocaleController.getString(R.string.LinkIsExpired));
                        s60Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.p7, false));
                        return;
                    }
                }
                if (tL_chatInviteExported.expire_date <= 0) {
                    s60Var.setFixedSize(-1);
                    s60Var.setText(null);
                    return;
                }
                long currentTimeMillis = (t60Var.f0 * 1000) + System.currentTimeMillis();
                long j11 = tL_chatInviteExported.expire_date;
                long j12 = (j11 * 1000) - currentTimeMillis;
                if (j12 < 0) {
                    j12 = 0;
                }
                if (j12 > 86400000) {
                    s60Var.setText(LocaleController.formatString("LinkExpiresIn", R.string.LinkExpiresIn, LocaleController.formatDateAudio(j11, false)));
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
                s60Var.w = true;
                m2.b bVar = s60Var.v;
                AndroidUtilities.cancelRunOnUIThread(bVar);
                if (s60Var.w) {
                    AndroidUtilities.runOnUIThread(bVar, 500L);
                }
                s60Var.setText(LocaleController.formatString("LinkExpiresInTime", R.string.LinkExpiresInTime, sb2));
                return;
            }
            if (i19 == 8) {
                p60 p60Var = (p60) view;
                int i23 = tL_chatInviteExported.usage_limit;
                if (i23 <= 0) {
                    p60Var.a.setVisibility(8);
                    return;
                } else {
                    p60Var.a.setText(LocaleController.formatPluralString("PeopleCanJoinViaLinkCount", i23, new Object[0]));
                    p60Var.a.setVisibility(0);
                    return;
                }
            }
            if (i19 != 9) {
                return;
            }
            q60 q60Var = (q60) view;
            TL_stars.TL_starsSubscriptionPricing tL_starsSubscriptionPricing2 = tL_chatInviteExported.subscription_pricing;
            int i24 = tL_chatInviteExported.usage;
            t60 t60Var2 = q60Var.c;
            TextView textView = q60Var.b;
            TextView textView2 = q60Var.a;
            if (tL_starsSubscriptionPricing2 == null) {
                return;
            }
            int i25 = tL_starsSubscriptionPricing2.period;
            if (i25 == 2592000) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(LocaleController.formatString(R.string.LinkRevenuePrice, Long.valueOf(tL_starsSubscriptionPricing2.amount)));
                sb3.append(i24 > 0 ? kf.k0.j(i24, " x ") : "");
                textView2.setText(lh.ja.X0(false, sb3.toString(), 0.8f, null));
                if (i24 == 0) {
                    formatString = LocaleController.getString(R.string.NoOneSubscribed);
                } else {
                    int i26 = R.string.LinkRevenuePriceInfo;
                    BillingController billingController = BillingController.getInstance();
                    double d = tL_starsSubscriptionPricing2.amount / 1000.0d;
                    i18 = ((org.telegram.ui.ActionBar.g3) t60Var2).currentAccount;
                    formatString = LocaleController.formatString(i26, billingController.formatCurrency((long) (d * MessagesController.getInstance(i18).starsUsdWithdrawRate1000 * i24), "USD"));
                }
                textView.setText(formatString);
                return;
            }
            String str5 = i25 == 300 ? "5min" : "min";
            StringBuilder sb4 = new StringBuilder();
            Locale locale2 = Locale.US;
            sb4.append(String.format(locale2, "⭐%1$d/%2$s", Long.valueOf(tL_starsSubscriptionPricing2.amount), str5));
            sb4.append(i24 > 0 ? kf.k0.j(i24, " x ") : "");
            textView2.setText(lh.ja.X0(false, sb4.toString(), 0.8f, null));
            if (i24 == 0) {
                format = LocaleController.getString(R.string.NoOneSubscribed);
            } else {
                BillingController billingController2 = BillingController.getInstance();
                double d10 = tL_starsSubscriptionPricing2.amount / 1000.0d;
                i17 = ((org.telegram.ui.ActionBar.g3) t60Var2).currentAccount;
                format = String.format(locale2, "you get approximately %1$s %2$s", billingController2.formatCurrency((long) (d10 * MessagesController.getInstance(i17).starsUsdWithdrawRate1000 * i24), "USD"), "for ".concat(str5));
            }
            textView.setText(format);
            return;
        }
        r60 r60Var = (r60) view;
        if (i10 == t60Var.n) {
            j10 = tL_chatInviteExported.admin_id;
            tL_chatInviteImporter = null;
        } else {
            int i27 = t60Var.x;
            ArrayList arrayList = t60Var.a0;
            int i28 = t60Var.C;
            if (i28 != -1 && i10 >= i28) {
                arrayList = t60Var.b0;
                i27 = i28;
            }
            int i29 = t60Var.L;
            if (i29 != -1 && i10 >= i29) {
                arrayList = t60Var.c0;
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
        if (i10 == t60Var.n) {
            user2 = (TLRPC.User) hashMap.get(Long.valueOf(j10));
            if (user2 == null) {
                i16 = ((org.telegram.ui.ActionBar.g3) t60Var).currentAccount;
                user2 = MessagesController.getInstance(i16).getUser(Long.valueOf(tL_chatInviteExported.admin_id));
            }
            if (user2 != null) {
                str = LocaleController.formatDateAudio(tL_chatInviteExported.date, false);
                user = user2;
                if (i10 != t60Var.n && chatParticipant != null) {
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
                            i15 = ((org.telegram.ui.ActionBar.g3) t60Var).currentAccount;
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
                            i14 = ((org.telegram.ui.ActionBar.g3) t60Var).currentAccount;
                            z11 = j16 == UserConfig.getInstance(i14).getClientUserId();
                            z4 = true;
                            z10 = false;
                            str2 = str8;
                        } else {
                            str2 = str8;
                        }
                    }
                    if (UserObject.isUserSelf(user)) {
                        i13 = ((org.telegram.ui.ActionBar.g3) t60Var).currentAccount;
                        str3 = str;
                        if (ChatObject.canManageMyTag(MessagesController.getInstance(i13).getChat(Long.valueOf(t60Var.d0)))) {
                            z12 = true;
                            r60Var.a(str2, z4, z10, z12, new j60(this, user, str2, z4, z10, z11, 0));
                            r60Var.d(user, null, str3, false);
                            if (i10 != t60Var.n || (tL_starsSubscriptionPricing = tL_chatInviteExported.subscription_pricing) == null || tL_chatInviteImporter == null) {
                                return;
                            }
                            int i31 = tL_chatInviteImporter.date;
                            TextView textView3 = r60Var.V;
                            TextView textView4 = r60Var.U;
                            SpannableStringBuilder X0 = lh.ja.X0(false, "⭐️" + tL_starsSubscriptionPricing.amount, 0.7f, null);
                            int i32 = tL_starsSubscriptionPricing.period;
                            String string = i32 == 2592000 ? LocaleController.getString(R.string.StarsParticipantSubscriptionPerMonth) : i32 == 300 ? "per 5 minutes" : "per each minute";
                            textView4.setText(X0);
                            textView3.setText(string);
                            r60Var.i((int) Math.max(ph.f3.g(X0, textView4.getPaint()), ph.f3.g(string, textView3.getPaint())), true);
                            r60Var.c.l(LocaleController.formatJoined(i31), false);
                            return;
                        }
                    } else {
                        str3 = str;
                    }
                    z12 = false;
                    r60Var.a(str2, z4, z10, z12, new j60(this, user, str2, z4, z10, z11, 0));
                    r60Var.d(user, null, str3, false);
                    if (i10 != t60Var.n) {
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
                r60Var.a(str2, z4, z10, z12, new j60(this, user, str2, z4, z10, z11, 0));
                r60Var.d(user, null, str3, false);
                if (i10 != t60Var.n) {
                }
            }
        }
        user = user2;
        str = null;
        if (i10 != t60Var.n) {
        }
        str2 = null;
        z4 = false;
        z10 = false;
        z11 = false;
        if (UserObject.isUserSelf(user)) {
        }
        z12 = false;
        r60Var.a(str2, z4, z10, z12, new j60(this, user, str2, z4, z10, z11, 0));
        r60Var.d(user, null, str3, false);
        if (i10 != t60Var.n) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // f2.o0
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        u00 u00Var;
        View view;
        org.telegram.ui.ActionBar.f6 f6Var;
        Context context = viewGroup.getContext();
        t60 t60Var = this.c;
        switch (i10) {
            case 1:
                view = new r60(context);
                break;
            case 2:
                view = new org.telegram.ui.Cells.y6(context, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.a7, false), 0);
                break;
            case 3:
                k60 k60Var = new k60(this, context, t60Var.R, t60Var, t60Var.e0);
                k60Var.setDelegate(new n60(this));
                k60Var.setLayoutParams(new f2.w0(-1, -2));
                view = k60Var;
                break;
            case 4:
                view = new s60(t60Var, context);
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
                view = new gn(context, 9);
                break;
            case 7:
                view = new org.telegram.ui.Cells.y6(context, (org.telegram.ui.b) null);
                break;
            case 8:
                p60 p60Var = new p60(context);
                TextView textView = new TextView(context);
                p60Var.a = textView;
                textView.setTextSize(1, 14.0f);
                org.telegram.ui.ai.s(org.telegram.ui.ActionBar.j6.y6, null, false, textView, 1);
                p60Var.addView(textView, k7.b6.d(-1, -2.0f, 16, 60.0f, 0.0f, 60.0f, 0.0f));
                u00Var = p60Var;
                view = u00Var;
                break;
            case 9:
                view = new q60(t60Var, context);
                break;
            default:
                f6Var = ((org.telegram.ui.ActionBar.g3) t60Var).resourcesProvider;
                view = new org.telegram.ui.Cells.t3(context, f6Var);
                break;
        }
        return org.telegram.ui.ai.n(view, view, -1, -2);
    }
}
