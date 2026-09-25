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

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class x60 extends vl0 {
    public final /* synthetic */ c70 c;

    public x60(c70 c70Var) {
        this.c = c70Var;
    }

    @Override // org.telegram.ui.Components.vl0
    public final boolean D(s4.c1 c1Var) {
        int i10;
        int b10 = c1Var.b();
        c70 c70Var = this.c;
        if (b10 == c70Var.n) {
            long j3 = c70Var.b.admin_id;
            i10 = ((org.telegram.ui.ActionBar.e3) c70Var).currentAccount;
            return j3 != UserConfig.getInstance(i10).clientUserId;
        }
        if (b10 < c70Var.x || b10 >= c70Var.y) {
            return b10 >= c70Var.O && b10 < c70Var.P;
        }
        return true;
    }

    @Override // s4.h0
    public final int h() {
        return this.c.S;
    }

    @Override // s4.h0
    public final int j(int i10) {
        c70 c70Var = this.c;
        if (i10 == c70Var.h || i10 == c70Var.N || i10 == c70Var.w || i10 == c70Var.e) {
            return 0;
        }
        if (i10 == c70Var.n) {
            return 1;
        }
        if (i10 >= c70Var.O && i10 < c70Var.P) {
            return 1;
        }
        if (i10 >= c70Var.x && i10 < c70Var.y) {
            return 1;
        }
        if (i10 == c70Var.r || i10 == c70Var.s) {
            return 2;
        }
        if (i10 == c70Var.H) {
            return 3;
        }
        if (i10 == c70Var.I) {
            return 4;
        }
        if (i10 == c70Var.J) {
            return 5;
        }
        c70Var.getClass();
        if (i10 == 0 || i10 == c70Var.K || i10 == c70Var.L) {
            return 6;
        }
        if (i10 == c70Var.v) {
            return 7;
        }
        if (i10 == c70Var.M) {
            return 8;
        }
        return i10 == c70Var.f ? 9 : 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:116:0x03ba  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x03f9  */
    /* JADX WARN: Removed duplicated region for block: B:135:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:137:0x03d7  */
    @Override // s4.h0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(s4.c1 c1Var, int i10) {
        int i11;
        int i12;
        long j3;
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
        c70 c70Var = this.c;
        HashMap hashMap = c70Var.c;
        TLRPC.ChatFull chatFull = c70Var.d;
        TLRPC.TL_chatInviteExported tL_chatInviteExported = c70Var.b;
        int i19 = c1Var.f;
        View view = c1Var.a;
        if (i19 == 0) {
            org.telegram.ui.Cells.v3 v3Var = (org.telegram.ui.Cells.v3) view;
            if (i10 == c70Var.h) {
                v3Var.setText(LocaleController.getString(R.string.LinkCreatedeBy));
                v3Var.setRightText(null);
                return;
            }
            if (i10 == c70Var.e) {
                v3Var.setText(LocaleController.getString(R.string.LinkRevenue));
                v3Var.setRightText(null);
                return;
            }
            if (i10 != c70Var.w) {
                if (i10 == c70Var.E) {
                    v3Var.setText(LocaleController.formatPluralString("PeopleSubscriptionExpired", tL_chatInviteExported.subscription_expired, new Object[0]));
                    v3Var.setRightText(null);
                    return;
                } else {
                    if (i10 == c70Var.N) {
                        v3Var.setText(LocaleController.formatPluralString("JoinRequests", tL_chatInviteExported.requested, new Object[0]));
                        v3Var.setRightText(null);
                        return;
                    }
                    return;
                }
            }
            int i20 = tL_chatInviteExported.usage;
            if (i20 > 0) {
                v3Var.setText(LocaleController.formatPluralString("PeopleJoined", i20, new Object[0]));
            } else {
                v3Var.setText(LocaleController.getString(tL_chatInviteExported.subscription_pricing != null ? R.string.NoOneSubscribed : R.string.NoOneJoined));
            }
            if (tL_chatInviteExported.expired || tL_chatInviteExported.revoked || (i11 = tL_chatInviteExported.usage_limit) <= 0 || (i12 = tL_chatInviteExported.usage) <= 0) {
                v3Var.setRightText(null);
                return;
            } else {
                v3Var.setRightText(LocaleController.formatPluralString("PeopleJoinedRemaining", i11 - i12, new Object[0]));
                return;
            }
        }
        if (i19 != 1) {
            if (i19 == 3) {
                g90 g90Var = (g90) view;
                g90Var.d(0, null, false);
                g90Var.setLink(tL_chatInviteExported.link);
                g90Var.setRevoke(tL_chatInviteExported.revoked);
                g90Var.setPermanent(tL_chatInviteExported.permanent);
                g90Var.setCanEdit(c70Var.k0);
                g90Var.b(!c70Var.k0);
                return;
            }
            if (i19 == 4) {
                b70 b70Var = (b70) view;
                AndroidUtilities.cancelRunOnUIThread(b70Var.v);
                b70Var.w = false;
                b70Var.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.B6, false));
                b70Var.setFixedSize(0);
                if (tL_chatInviteExported.revoked) {
                    b70Var.setText(LocaleController.getString(R.string.LinkIsNoActive));
                    return;
                }
                if (tL_chatInviteExported.expired) {
                    int i21 = tL_chatInviteExported.usage_limit;
                    if (i21 > 0 && i21 == tL_chatInviteExported.usage) {
                        b70Var.setText(LocaleController.getString(R.string.LinkIsExpiredLimitReached));
                        return;
                    } else {
                        b70Var.setText(LocaleController.getString(R.string.LinkIsExpired));
                        b70Var.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.p7, false));
                        return;
                    }
                }
                if (tL_chatInviteExported.expire_date <= 0) {
                    b70Var.setFixedSize(-1);
                    b70Var.setText(null);
                    return;
                }
                long currentTimeMillis = (c70Var.i0 * 1000) + System.currentTimeMillis();
                long j10 = tL_chatInviteExported.expire_date;
                long j11 = (j10 * 1000) - currentTimeMillis;
                if (j11 < 0) {
                    j11 = 0;
                }
                if (j11 > 86400000) {
                    b70Var.setText(LocaleController.formatString("LinkExpiresIn", R.string.LinkExpiresIn, LocaleController.formatDateAudio(j10, false)));
                    return;
                }
                long j12 = j11 / 1000;
                int i22 = (int) (j12 % 60);
                long j13 = j12 / 60;
                StringBuilder sb2 = new StringBuilder();
                Locale locale = Locale.ENGLISH;
                sb2.append(String.format(locale, "%02d", Integer.valueOf((int) (j13 / 60))));
                sb2.append(String.format(locale, ":%02d", Integer.valueOf((int) (j13 % 60))));
                sb2.append(String.format(locale, ":%02d", Integer.valueOf(i22)));
                String sb3 = sb2.toString();
                b70Var.w = true;
                org.telegram.ui.Cells.t6 t6Var = b70Var.v;
                AndroidUtilities.cancelRunOnUIThread(t6Var);
                if (b70Var.w) {
                    AndroidUtilities.runOnUIThread(t6Var, 500L);
                }
                b70Var.setText(LocaleController.formatString("LinkExpiresInTime", R.string.LinkExpiresInTime, sb3));
                return;
            }
            if (i19 == 8) {
                y60 y60Var = (y60) view;
                int i23 = tL_chatInviteExported.usage_limit;
                if (i23 <= 0) {
                    y60Var.a.setVisibility(8);
                    return;
                } else {
                    y60Var.a.setText(LocaleController.formatPluralString("PeopleCanJoinViaLinkCount", i23, new Object[0]));
                    y60Var.a.setVisibility(0);
                    return;
                }
            }
            if (i19 != 9) {
                return;
            }
            z60 z60Var = (z60) view;
            TL_stars.TL_starsSubscriptionPricing tL_starsSubscriptionPricing2 = tL_chatInviteExported.subscription_pricing;
            int i24 = tL_chatInviteExported.usage;
            c70 c70Var2 = z60Var.c;
            TextView textView = z60Var.b;
            TextView textView2 = z60Var.a;
            if (tL_starsSubscriptionPricing2 == null) {
                return;
            }
            int i25 = tL_starsSubscriptionPricing2.period;
            if (i25 == 2592000) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(LocaleController.formatString(R.string.LinkRevenuePrice, Long.valueOf(tL_starsSubscriptionPricing2.amount)));
                sb4.append(i24 > 0 ? hg.c.h(i24, " x ") : "");
                textView2.setText(yh.w7.X0(false, sb4.toString(), 0.8f, null));
                if (i24 == 0) {
                    formatString = LocaleController.getString(R.string.NoOneSubscribed);
                } else {
                    int i26 = R.string.LinkRevenuePriceInfo;
                    BillingController billingController = BillingController.getInstance();
                    double d = tL_starsSubscriptionPricing2.amount / 1000.0d;
                    i18 = ((org.telegram.ui.ActionBar.e3) c70Var2).currentAccount;
                    formatString = LocaleController.formatString(i26, billingController.formatCurrency((long) (d * MessagesController.getInstance(i18).starsUsdWithdrawRate1000 * i24), "USD"));
                }
                textView.setText(formatString);
                return;
            }
            String str5 = i25 == 300 ? "5min" : "min";
            StringBuilder sb5 = new StringBuilder();
            Locale locale2 = Locale.US;
            sb5.append(String.format(locale2, "⭐%1$d/%2$s", Long.valueOf(tL_starsSubscriptionPricing2.amount), str5));
            sb5.append(i24 > 0 ? hg.c.h(i24, " x ") : "");
            textView2.setText(yh.w7.X0(false, sb5.toString(), 0.8f, null));
            if (i24 == 0) {
                format = LocaleController.getString(R.string.NoOneSubscribed);
            } else {
                BillingController billingController2 = BillingController.getInstance();
                double d10 = tL_starsSubscriptionPricing2.amount / 1000.0d;
                i17 = ((org.telegram.ui.ActionBar.e3) c70Var2).currentAccount;
                format = String.format(locale2, "you get approximately %1$s %2$s", billingController2.formatCurrency((long) (d10 * MessagesController.getInstance(i17).starsUsdWithdrawRate1000 * i24), "USD"), "for ".concat(str5));
            }
            textView.setText(format);
            return;
        }
        a70 a70Var = (a70) view;
        if (i10 == c70Var.n) {
            j3 = tL_chatInviteExported.admin_id;
            tL_chatInviteImporter = null;
        } else {
            int i27 = c70Var.x;
            ArrayList arrayList = c70Var.d0;
            int i28 = c70Var.F;
            if (i28 != -1 && i10 >= i28) {
                arrayList = c70Var.e0;
                i27 = i28;
            }
            int i29 = c70Var.O;
            if (i29 != -1 && i10 >= i29) {
                arrayList = c70Var.f0;
                i27 = i29;
            }
            TLRPC.TL_chatInviteImporter tL_chatInviteImporter2 = (TLRPC.TL_chatInviteImporter) arrayList.get(i10 - i27);
            j3 = tL_chatInviteImporter2.user_id;
            tL_chatInviteImporter = tL_chatInviteImporter2;
        }
        TLRPC.User user2 = (TLRPC.User) hashMap.get(Long.valueOf(j3));
        if (chatFull != null && chatFull.participants != null) {
            for (int i30 = 0; i30 < chatFull.participants.participants.size(); i30++) {
                if (chatFull.participants.participants.get(i30).user_id == j3) {
                    chatParticipant = chatFull.participants.participants.get(i30);
                    break;
                }
            }
        }
        chatParticipant = null;
        if (i10 == c70Var.n) {
            user2 = (TLRPC.User) hashMap.get(Long.valueOf(j3));
            if (user2 == null) {
                i16 = ((org.telegram.ui.ActionBar.e3) c70Var).currentAccount;
                user2 = MessagesController.getInstance(i16).getUser(Long.valueOf(tL_chatInviteExported.admin_id));
            }
            if (user2 != null) {
                str = LocaleController.formatDateAudio(tL_chatInviteExported.date, false);
                user = user2;
                if (i10 != c70Var.n && chatParticipant != null) {
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
                            long j14 = channelParticipant.promoted_by;
                            i15 = ((org.telegram.ui.ActionBar.e3) c70Var).currentAccount;
                            z16 = j14 == UserConfig.getInstance(i15).getClientUserId();
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
                            long j15 = chatParticipant.inviter_id;
                            i14 = ((org.telegram.ui.ActionBar.e3) c70Var).currentAccount;
                            z12 = j15 == UserConfig.getInstance(i14).getClientUserId();
                            z10 = true;
                            z11 = false;
                            str2 = str8;
                        } else {
                            str2 = str8;
                        }
                    }
                    if (UserObject.isUserSelf(user)) {
                        i13 = ((org.telegram.ui.ActionBar.e3) c70Var).currentAccount;
                        str3 = str;
                        if (ChatObject.canManageMyTag(MessagesController.getInstance(i13).getChat(Long.valueOf(c70Var.g0)))) {
                            z13 = true;
                            a70Var.a(str2, z10, z11, z13, new s60(this, user, str2, z10, z11, z12, 0));
                            a70Var.d(user, null, str3, false);
                            if (i10 != c70Var.n || (tL_starsSubscriptionPricing = tL_chatInviteExported.subscription_pricing) == null || tL_chatInviteImporter == null) {
                                return;
                            }
                            int i31 = tL_chatInviteImporter.date;
                            TextView textView3 = a70Var.b0;
                            TextView textView4 = a70Var.a0;
                            SpannableStringBuilder X0 = yh.w7.X0(false, "⭐️" + tL_starsSubscriptionPricing.amount, 0.7f, null);
                            int i32 = tL_starsSubscriptionPricing.period;
                            String string = i32 == 2592000 ? LocaleController.getString(R.string.StarsParticipantSubscriptionPerMonth) : i32 == 300 ? "per 5 minutes" : "per each minute";
                            textView4.setText(X0);
                            textView3.setText(string);
                            a70Var.i((int) Math.max(ci.e4.g(X0, textView4.getPaint()), ci.e4.g(string, textView3.getPaint())), true);
                            a70Var.c.l(LocaleController.formatJoined(i31), false);
                            return;
                        }
                    } else {
                        str3 = str;
                    }
                    z13 = false;
                    a70Var.a(str2, z10, z11, z13, new s60(this, user, str2, z10, z11, z12, 0));
                    a70Var.d(user, null, str3, false);
                    if (i10 != c70Var.n) {
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
                a70Var.a(str2, z10, z11, z13, new s60(this, user, str2, z10, z11, z12, 0));
                a70Var.d(user, null, str3, false);
                if (i10 != c70Var.n) {
                }
            }
        }
        user = user2;
        str = null;
        if (i10 != c70Var.n) {
        }
        str2 = null;
        z10 = false;
        z11 = false;
        z12 = false;
        if (UserObject.isUserSelf(user)) {
        }
        z13 = false;
        a70Var.a(str2, z10, z11, z13, new s60(this, user, str2, z10, z11, z12, 0));
        a70Var.d(user, null, str3, false);
        if (i10 != c70Var.n) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        u00 u00Var;
        View view;
        org.telegram.ui.ActionBar.d6 d6Var;
        Context context = viewGroup.getContext();
        c70 c70Var = this.c;
        switch (i10) {
            case 1:
                view = new a70(context);
                break;
            case 2:
                view = new org.telegram.ui.Cells.b7(context, org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.a7, false), 0);
                break;
            case 3:
                t60 t60Var = new t60(this, context, c70Var.U, c70Var, c70Var.h0);
                t60Var.setDelegate(new w60(this));
                t60Var.setLayoutParams(new s4.p0(-1, -2));
                view = t60Var;
                break;
            case 4:
                view = new b70(c70Var, context);
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
                view = new ln(context, 12);
                break;
            case 7:
                view = new org.telegram.ui.Cells.b7(context, (org.telegram.ui.Cells.c1) null);
                break;
            case 8:
                y60 y60Var = new y60(context);
                TextView textView = new TextView(context);
                y60Var.a = textView;
                textView.setTextSize(1, 14.0f);
                com.google.android.gms.internal.vision.e2.p(org.telegram.ui.ActionBar.h6.y6, null, false, textView, 1);
                y60Var.addView(textView, w7.y5.d(-1, -2.0f, 16, 60.0f, 0.0f, 60.0f, 0.0f));
                u00Var = y60Var;
                view = u00Var;
                break;
            case 9:
                view = new z60(c70Var, context);
                break;
            default:
                d6Var = ((org.telegram.ui.ActionBar.e3) c70Var).resourcesProvider;
                view = new org.telegram.ui.Cells.v3(context, d6Var);
                break;
        }
        return com.google.android.gms.internal.vision.e2.k(view, view, -1, -2);
    }
}
