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

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class j70 extends mm0 {
    public final /* synthetic */ o70 c;

    public j70(o70 o70Var) {
        this.c = o70Var;
    }

    @Override // org.telegram.ui.Components.mm0
    public final boolean D(s4.e1 e1Var) {
        int i10;
        int b10 = e1Var.b();
        o70 o70Var = this.c;
        if (b10 == o70Var.n) {
            long j10 = o70Var.b.admin_id;
            i10 = ((org.telegram.ui.ActionBar.k3) o70Var).currentAccount;
            return j10 != UserConfig.getInstance(i10).clientUserId;
        }
        if (b10 < o70Var.x || b10 >= o70Var.y) {
            return b10 >= o70Var.O && b10 < o70Var.P;
        }
        return true;
    }

    @Override // s4.h0
    public final int h() {
        return this.c.S;
    }

    @Override // s4.h0
    public final int j(int i10) {
        o70 o70Var = this.c;
        if (i10 == o70Var.h || i10 == o70Var.N || i10 == o70Var.w || i10 == o70Var.e) {
            return 0;
        }
        if (i10 == o70Var.n) {
            return 1;
        }
        if (i10 >= o70Var.O && i10 < o70Var.P) {
            return 1;
        }
        if (i10 >= o70Var.x && i10 < o70Var.y) {
            return 1;
        }
        if (i10 == o70Var.r || i10 == o70Var.s) {
            return 2;
        }
        if (i10 == o70Var.H) {
            return 3;
        }
        if (i10 == o70Var.I) {
            return 4;
        }
        if (i10 == o70Var.J) {
            return 5;
        }
        o70Var.getClass();
        if (i10 == 0 || i10 == o70Var.K || i10 == o70Var.L) {
            return 6;
        }
        if (i10 == o70Var.v) {
            return 7;
        }
        if (i10 == o70Var.M) {
            return 8;
        }
        return i10 == o70Var.f ? 9 : 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:116:0x03b5  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x03f4  */
    /* JADX WARN: Removed duplicated region for block: B:135:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:137:0x03d2  */
    @Override // s4.h0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(s4.e1 e1Var, int i10) {
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
        o70 o70Var = this.c;
        HashMap hashMap = o70Var.c;
        TLRPC.ChatFull chatFull = o70Var.d;
        TLRPC.TL_chatInviteExported tL_chatInviteExported = o70Var.b;
        int i19 = e1Var.f;
        View view = e1Var.a;
        if (i19 == 0) {
            org.telegram.ui.Cells.z3 z3Var = (org.telegram.ui.Cells.z3) view;
            if (i10 == o70Var.h) {
                z3Var.setText(LocaleController.getString(R.string.LinkCreatedeBy));
                z3Var.setRightText(null);
                return;
            }
            if (i10 == o70Var.e) {
                z3Var.setText(LocaleController.getString(R.string.LinkRevenue));
                z3Var.setRightText(null);
                return;
            }
            if (i10 != o70Var.w) {
                if (i10 == o70Var.E) {
                    z3Var.setText(LocaleController.formatPluralString("PeopleSubscriptionExpired", tL_chatInviteExported.subscription_expired, new Object[0]));
                    z3Var.setRightText(null);
                    return;
                } else {
                    if (i10 == o70Var.N) {
                        z3Var.setText(LocaleController.formatPluralString("JoinRequests", tL_chatInviteExported.requested, new Object[0]));
                        z3Var.setRightText(null);
                        return;
                    }
                    return;
                }
            }
            int i20 = tL_chatInviteExported.usage;
            if (i20 > 0) {
                z3Var.setText(LocaleController.formatPluralString("PeopleJoined", i20, new Object[0]));
            } else {
                z3Var.setText(LocaleController.getString(tL_chatInviteExported.subscription_pricing != null ? R.string.NoOneSubscribed : R.string.NoOneJoined));
            }
            if (tL_chatInviteExported.expired || tL_chatInviteExported.revoked || (i11 = tL_chatInviteExported.usage_limit) <= 0 || (i12 = tL_chatInviteExported.usage) <= 0) {
                z3Var.setRightText(null);
                return;
            } else {
                z3Var.setRightText(LocaleController.formatPluralString("PeopleJoinedRemaining", i11 - i12, new Object[0]));
                return;
            }
        }
        if (i19 != 1) {
            if (i19 == 3) {
                s90 s90Var = (s90) view;
                s90Var.d(0, null, false);
                s90Var.setLink(tL_chatInviteExported.link);
                s90Var.setRevoke(tL_chatInviteExported.revoked);
                s90Var.setPermanent(tL_chatInviteExported.permanent);
                s90Var.setCanEdit(o70Var.k0);
                s90Var.b(!o70Var.k0);
                return;
            }
            if (i19 == 4) {
                n70 n70Var = (n70) view;
                AndroidUtilities.cancelRunOnUIThread(n70Var.w);
                n70Var.x = false;
                org.telegram.ui.ActionBar.f7.V(n70Var.getTextView(), org.telegram.ui.ActionBar.y6.B6, null);
                n70Var.setFixedSize(0);
                if (tL_chatInviteExported.revoked) {
                    n70Var.setText(LocaleController.getString(R.string.LinkIsNoActive));
                    return;
                }
                if (tL_chatInviteExported.expired) {
                    int i21 = tL_chatInviteExported.usage_limit;
                    if (i21 > 0 && i21 == tL_chatInviteExported.usage) {
                        n70Var.setText(LocaleController.getString(R.string.LinkIsExpiredLimitReached));
                        return;
                    } else {
                        n70Var.setText(LocaleController.getString(R.string.LinkIsExpired));
                        org.telegram.ui.ActionBar.f7.V(n70Var.getTextView(), org.telegram.ui.ActionBar.y6.p7, null);
                        return;
                    }
                }
                if (tL_chatInviteExported.expire_date <= 0) {
                    n70Var.setFixedSize(-1);
                    n70Var.setText(null);
                    return;
                }
                long currentTimeMillis = (o70Var.i0 * 1000) + System.currentTimeMillis();
                long j11 = tL_chatInviteExported.expire_date;
                long j12 = (j11 * 1000) - currentTimeMillis;
                if (j12 < 0) {
                    j12 = 0;
                }
                if (j12 > 86400000) {
                    n70Var.setText(LocaleController.formatString("LinkExpiresIn", R.string.LinkExpiresIn, LocaleController.formatDateAudio(j11, false)));
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
                n70Var.x = true;
                m.g3 g3Var = n70Var.w;
                AndroidUtilities.cancelRunOnUIThread(g3Var);
                if (n70Var.x) {
                    AndroidUtilities.runOnUIThread(g3Var, 500L);
                }
                n70Var.setText(LocaleController.formatString("LinkExpiresInTime", R.string.LinkExpiresInTime, sb3));
                return;
            }
            if (i19 == 8) {
                k70 k70Var = (k70) view;
                int i23 = tL_chatInviteExported.usage_limit;
                if (i23 <= 0) {
                    k70Var.a.setVisibility(8);
                    return;
                } else {
                    k70Var.a.setText(LocaleController.formatPluralString("PeopleCanJoinViaLinkCount", i23, new Object[0]));
                    k70Var.a.setVisibility(0);
                    return;
                }
            }
            if (i19 != 9) {
                return;
            }
            l70 l70Var = (l70) view;
            TL_stars.TL_starsSubscriptionPricing tL_starsSubscriptionPricing2 = tL_chatInviteExported.subscription_pricing;
            int i24 = tL_chatInviteExported.usage;
            o70 o70Var2 = l70Var.f;
            TextView textView = l70Var.c;
            TextView textView2 = l70Var.b;
            if (tL_starsSubscriptionPricing2 == null) {
                return;
            }
            int i25 = tL_starsSubscriptionPricing2.period;
            if (i25 == 2592000) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(LocaleController.formatString(R.string.LinkRevenuePrice, Long.valueOf(tL_starsSubscriptionPricing2.amount)));
                sb4.append(i24 > 0 ? ic.a.i(i24, " x ") : "");
                textView2.setText(bi.dd.W0(false, sb4.toString(), 0.8f, null));
                if (i24 == 0) {
                    formatString = LocaleController.getString(R.string.NoOneSubscribed);
                } else {
                    int i26 = R.string.LinkRevenuePriceInfo;
                    BillingController billingController = BillingController.getInstance();
                    double d = tL_starsSubscriptionPricing2.amount / 1000.0d;
                    i18 = ((org.telegram.ui.ActionBar.k3) o70Var2).currentAccount;
                    formatString = LocaleController.formatString(i26, billingController.formatCurrency((long) (d * MessagesController.getInstance(i18).starsUsdWithdrawRate1000 * i24), "USD"));
                }
                textView.setText(formatString);
                return;
            }
            String str5 = i25 == 300 ? "5min" : "min";
            StringBuilder sb5 = new StringBuilder();
            Locale locale2 = Locale.US;
            sb5.append(String.format(locale2, "⭐%1$d/%2$s", Long.valueOf(tL_starsSubscriptionPricing2.amount), str5));
            sb5.append(i24 > 0 ? ic.a.i(i24, " x ") : "");
            textView2.setText(bi.dd.W0(false, sb5.toString(), 0.8f, null));
            if (i24 == 0) {
                format = LocaleController.getString(R.string.NoOneSubscribed);
            } else {
                BillingController billingController2 = BillingController.getInstance();
                double d10 = tL_starsSubscriptionPricing2.amount / 1000.0d;
                i17 = ((org.telegram.ui.ActionBar.k3) o70Var2).currentAccount;
                format = String.format(locale2, "you get approximately %1$s %2$s", billingController2.formatCurrency((long) (d10 * MessagesController.getInstance(i17).starsUsdWithdrawRate1000 * i24), "USD"), "for ".concat(str5));
            }
            textView.setText(format);
            return;
        }
        m70 m70Var = (m70) view;
        if (i10 == o70Var.n) {
            j10 = tL_chatInviteExported.admin_id;
            tL_chatInviteImporter = null;
        } else {
            int i27 = o70Var.x;
            ArrayList arrayList = o70Var.d0;
            int i28 = o70Var.F;
            if (i28 != -1 && i10 >= i28) {
                arrayList = o70Var.e0;
                i27 = i28;
            }
            int i29 = o70Var.O;
            if (i29 != -1 && i10 >= i29) {
                arrayList = o70Var.f0;
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
        if (i10 == o70Var.n) {
            user2 = (TLRPC.User) hashMap.get(Long.valueOf(j10));
            if (user2 == null) {
                i16 = ((org.telegram.ui.ActionBar.k3) o70Var).currentAccount;
                user2 = MessagesController.getInstance(i16).getUser(Long.valueOf(tL_chatInviteExported.admin_id));
            }
            if (user2 != null) {
                str = LocaleController.formatDateAudio(tL_chatInviteExported.date, false);
                user = user2;
                if (i10 != o70Var.n && chatParticipant != null) {
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
                            i15 = ((org.telegram.ui.ActionBar.k3) o70Var).currentAccount;
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
                            i14 = ((org.telegram.ui.ActionBar.k3) o70Var).currentAccount;
                            z12 = j16 == UserConfig.getInstance(i14).getClientUserId();
                            z10 = true;
                            z11 = false;
                            str2 = str8;
                        } else {
                            str2 = str8;
                        }
                    }
                    if (UserObject.isUserSelf(user)) {
                        i13 = ((org.telegram.ui.ActionBar.k3) o70Var).currentAccount;
                        str3 = str;
                        if (ChatObject.canManageMyTag(MessagesController.getInstance(i13).getChat(Long.valueOf(o70Var.g0)))) {
                            z13 = true;
                            m70Var.a(str2, z10, z11, z13, new e70(this, user, str2, z10, z11, z12, 0));
                            m70Var.d(user, null, str3, false);
                            if (i10 != o70Var.n || (tL_starsSubscriptionPricing = tL_chatInviteExported.subscription_pricing) == null || tL_chatInviteImporter == null) {
                                return;
                            }
                            int i31 = tL_chatInviteImporter.date;
                            TextView textView3 = m70Var.c0;
                            TextView textView4 = m70Var.b0;
                            SpannableStringBuilder W0 = bi.dd.W0(false, "⭐️" + tL_starsSubscriptionPricing.amount, 0.7f, null);
                            int i32 = tL_starsSubscriptionPricing.period;
                            String string = i32 == 2592000 ? LocaleController.getString(R.string.StarsParticipantSubscriptionPerMonth) : i32 == 300 ? "per 5 minutes" : "per each minute";
                            textView4.setText(W0);
                            textView3.setText(string);
                            m70Var.h((int) Math.max(fi.v3.g(W0, textView4.getPaint()), fi.v3.g(string, textView3.getPaint())), true);
                            m70Var.c.l(LocaleController.formatJoined(i31), false);
                            return;
                        }
                    } else {
                        str3 = str;
                    }
                    z13 = false;
                    m70Var.a(str2, z10, z11, z13, new e70(this, user, str2, z10, z11, z12, 0));
                    m70Var.d(user, null, str3, false);
                    if (i10 != o70Var.n) {
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
                m70Var.a(str2, z10, z11, z13, new e70(this, user, str2, z10, z11, z12, 0));
                m70Var.d(user, null, str3, false);
                if (i10 != o70Var.n) {
                }
            }
        }
        user = user2;
        str = null;
        if (i10 != o70Var.n) {
        }
        str2 = null;
        z10 = false;
        z11 = false;
        z12 = false;
        if (UserObject.isUserSelf(user)) {
        }
        z13 = false;
        m70Var.a(str2, z10, z11, z13, new e70(this, user, str2, z10, z11, z12, 0));
        m70Var.d(user, null, str3, false);
        if (i10 != o70Var.n) {
        }
    }

    @Override // s4.h0
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        View view;
        View view2;
        org.telegram.ui.ActionBar.u6 u6Var;
        Context context = viewGroup.getContext();
        o70 o70Var = this.c;
        switch (i10) {
            case 1:
                view2 = new m70(context);
                break;
            case 2:
                int i11 = org.telegram.ui.ActionBar.y6.a7;
                View f7Var = new org.telegram.ui.Cells.f7(context, org.telegram.ui.ActionBar.y6.x0(null, i11, false), 0);
                org.telegram.ui.ActionBar.f7.i(i11, f7Var, null);
                view = f7Var;
                view2 = view;
                break;
            case 3:
                f70 f70Var = new f70(this, context, o70Var.U, o70Var, o70Var.h0);
                f70Var.setDelegate(new i70(this));
                f70Var.setLayoutParams(new s4.q0(-1, -2));
                view2 = f70Var;
                break;
            case 4:
                view2 = new n70(o70Var, context);
                break;
            case 5:
                c10 c10Var = new c10(context, null);
                c10Var.setIsSingleCell(true);
                c10Var.setViewType(10);
                c10Var.w = false;
                c10Var.setPaddingLeft(AndroidUtilities.dp(10.0f));
                view = c10Var;
                view2 = view;
                break;
            case 6:
                view2 = new vn(context, 12);
                break;
            case 7:
                view2 = new org.telegram.ui.Cells.f7(context, (org.telegram.ui.d3) null);
                break;
            case 8:
                k70 k70Var = new k70(context);
                TextView textView = new TextView(context);
                k70Var.a = textView;
                textView.setTextSize(1, 14.0f);
                org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.y6, null);
                textView.setGravity(1);
                k70Var.addView(textView, kb1.h(-1, -2.0f, 16, 60.0f, 0.0f, 60.0f, 0.0f));
                view2 = k70Var;
                break;
            case 9:
                view2 = new l70(o70Var, context);
                break;
            default:
                u6Var = ((org.telegram.ui.ActionBar.k3) o70Var).resourcesProvider;
                view2 = new org.telegram.ui.Cells.z3(context, u6Var);
                break;
        }
        return ic.a.n(view2, view2, -1, -2);
    }
}
