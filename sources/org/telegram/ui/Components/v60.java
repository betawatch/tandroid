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

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class v60 extends ul0 {
    public final /* synthetic */ a70 c;

    public v60(a70 a70Var) {
        this.c = a70Var;
    }

    @Override // org.telegram.ui.Components.ul0
    public final boolean D(s4.c1 c1Var) {
        int i10;
        int b10 = c1Var.b();
        a70 a70Var = this.c;
        if (b10 == a70Var.n) {
            long j3 = a70Var.b.admin_id;
            i10 = ((org.telegram.ui.ActionBar.h3) a70Var).currentAccount;
            return j3 != UserConfig.getInstance(i10).clientUserId;
        }
        if (b10 < a70Var.x || b10 >= a70Var.y) {
            return b10 >= a70Var.O && b10 < a70Var.P;
        }
        return true;
    }

    @Override // s4.h0
    public final int h() {
        return this.c.S;
    }

    @Override // s4.h0
    public final int j(int i10) {
        a70 a70Var = this.c;
        if (i10 == a70Var.h || i10 == a70Var.N || i10 == a70Var.w || i10 == a70Var.e) {
            return 0;
        }
        if (i10 == a70Var.n) {
            return 1;
        }
        if (i10 >= a70Var.O && i10 < a70Var.P) {
            return 1;
        }
        if (i10 >= a70Var.x && i10 < a70Var.y) {
            return 1;
        }
        if (i10 == a70Var.r || i10 == a70Var.s) {
            return 2;
        }
        if (i10 == a70Var.H) {
            return 3;
        }
        if (i10 == a70Var.I) {
            return 4;
        }
        if (i10 == a70Var.J) {
            return 5;
        }
        a70Var.getClass();
        if (i10 == 0 || i10 == a70Var.K || i10 == a70Var.L) {
            return 6;
        }
        if (i10 == a70Var.v) {
            return 7;
        }
        if (i10 == a70Var.M) {
            return 8;
        }
        return i10 == a70Var.f ? 9 : 0;
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
        a70 a70Var = this.c;
        HashMap hashMap = a70Var.c;
        TLRPC.ChatFull chatFull = a70Var.d;
        TLRPC.TL_chatInviteExported tL_chatInviteExported = a70Var.b;
        int i19 = c1Var.f;
        View view = c1Var.a;
        if (i19 == 0) {
            org.telegram.ui.Cells.u3 u3Var = (org.telegram.ui.Cells.u3) view;
            if (i10 == a70Var.h) {
                u3Var.setText(LocaleController.getString(R.string.LinkCreatedeBy));
                u3Var.setRightText(null);
                return;
            }
            if (i10 == a70Var.e) {
                u3Var.setText(LocaleController.getString(R.string.LinkRevenue));
                u3Var.setRightText(null);
                return;
            }
            if (i10 != a70Var.w) {
                if (i10 == a70Var.E) {
                    u3Var.setText(LocaleController.formatPluralString("PeopleSubscriptionExpired", tL_chatInviteExported.subscription_expired, new Object[0]));
                    u3Var.setRightText(null);
                    return;
                } else {
                    if (i10 == a70Var.N) {
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
                f90 f90Var = (f90) view;
                f90Var.d(0, null, false);
                f90Var.setLink(tL_chatInviteExported.link);
                f90Var.setRevoke(tL_chatInviteExported.revoked);
                f90Var.setPermanent(tL_chatInviteExported.permanent);
                f90Var.setCanEdit(a70Var.k0);
                f90Var.b(!a70Var.k0);
                return;
            }
            if (i19 == 4) {
                z60 z60Var = (z60) view;
                AndroidUtilities.cancelRunOnUIThread(z60Var.v);
                z60Var.w = false;
                z60Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.B6, false));
                z60Var.setFixedSize(0);
                if (tL_chatInviteExported.revoked) {
                    z60Var.setText(LocaleController.getString(R.string.LinkIsNoActive));
                    return;
                }
                if (tL_chatInviteExported.expired) {
                    int i21 = tL_chatInviteExported.usage_limit;
                    if (i21 > 0 && i21 == tL_chatInviteExported.usage) {
                        z60Var.setText(LocaleController.getString(R.string.LinkIsExpiredLimitReached));
                        return;
                    } else {
                        z60Var.setText(LocaleController.getString(R.string.LinkIsExpired));
                        z60Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.p7, false));
                        return;
                    }
                }
                if (tL_chatInviteExported.expire_date <= 0) {
                    z60Var.setFixedSize(-1);
                    z60Var.setText(null);
                    return;
                }
                long currentTimeMillis = (a70Var.i0 * 1000) + System.currentTimeMillis();
                long j10 = tL_chatInviteExported.expire_date;
                long j11 = (j10 * 1000) - currentTimeMillis;
                if (j11 < 0) {
                    j11 = 0;
                }
                if (j11 > 86400000) {
                    z60Var.setText(LocaleController.formatString("LinkExpiresIn", R.string.LinkExpiresIn, LocaleController.formatDateAudio(j10, false)));
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
                z60Var.w = true;
                org.telegram.ui.Cells.l9 l9Var = z60Var.v;
                AndroidUtilities.cancelRunOnUIThread(l9Var);
                if (z60Var.w) {
                    AndroidUtilities.runOnUIThread(l9Var, 500L);
                }
                z60Var.setText(LocaleController.formatString("LinkExpiresInTime", R.string.LinkExpiresInTime, sb3));
                return;
            }
            if (i19 == 8) {
                w60 w60Var = (w60) view;
                int i23 = tL_chatInviteExported.usage_limit;
                if (i23 <= 0) {
                    w60Var.a.setVisibility(8);
                    return;
                } else {
                    w60Var.a.setText(LocaleController.formatPluralString("PeopleCanJoinViaLinkCount", i23, new Object[0]));
                    w60Var.a.setVisibility(0);
                    return;
                }
            }
            if (i19 != 9) {
                return;
            }
            x60 x60Var = (x60) view;
            TL_stars.TL_starsSubscriptionPricing tL_starsSubscriptionPricing2 = tL_chatInviteExported.subscription_pricing;
            int i24 = tL_chatInviteExported.usage;
            a70 a70Var2 = x60Var.c;
            TextView textView = x60Var.b;
            TextView textView2 = x60Var.a;
            if (tL_starsSubscriptionPricing2 == null) {
                return;
            }
            int i25 = tL_starsSubscriptionPricing2.period;
            if (i25 == 2592000) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(LocaleController.formatString(R.string.LinkRevenuePrice, Long.valueOf(tL_starsSubscriptionPricing2.amount)));
                sb4.append(i24 > 0 ? hc.b.j(i24, " x ") : "");
                textView2.setText(xh.z7.X0(false, sb4.toString(), 0.8f, null));
                if (i24 == 0) {
                    formatString = LocaleController.getString(R.string.NoOneSubscribed);
                } else {
                    int i26 = R.string.LinkRevenuePriceInfo;
                    BillingController billingController = BillingController.getInstance();
                    double d = tL_starsSubscriptionPricing2.amount / 1000.0d;
                    i18 = ((org.telegram.ui.ActionBar.h3) a70Var2).currentAccount;
                    formatString = LocaleController.formatString(i26, billingController.formatCurrency((long) (d * MessagesController.getInstance(i18).starsUsdWithdrawRate1000 * i24), "USD"));
                }
                textView.setText(formatString);
                return;
            }
            String str5 = i25 == 300 ? "5min" : "min";
            StringBuilder sb5 = new StringBuilder();
            Locale locale2 = Locale.US;
            sb5.append(String.format(locale2, "⭐%1$d/%2$s", Long.valueOf(tL_starsSubscriptionPricing2.amount), str5));
            sb5.append(i24 > 0 ? hc.b.j(i24, " x ") : "");
            textView2.setText(xh.z7.X0(false, sb5.toString(), 0.8f, null));
            if (i24 == 0) {
                format = LocaleController.getString(R.string.NoOneSubscribed);
            } else {
                BillingController billingController2 = BillingController.getInstance();
                double d10 = tL_starsSubscriptionPricing2.amount / 1000.0d;
                i17 = ((org.telegram.ui.ActionBar.h3) a70Var2).currentAccount;
                format = String.format(locale2, "you get approximately %1$s %2$s", billingController2.formatCurrency((long) (d10 * MessagesController.getInstance(i17).starsUsdWithdrawRate1000 * i24), "USD"), "for ".concat(str5));
            }
            textView.setText(format);
            return;
        }
        y60 y60Var = (y60) view;
        if (i10 == a70Var.n) {
            j3 = tL_chatInviteExported.admin_id;
            tL_chatInviteImporter = null;
        } else {
            int i27 = a70Var.x;
            ArrayList arrayList = a70Var.d0;
            int i28 = a70Var.F;
            if (i28 != -1 && i10 >= i28) {
                arrayList = a70Var.e0;
                i27 = i28;
            }
            int i29 = a70Var.O;
            if (i29 != -1 && i10 >= i29) {
                arrayList = a70Var.f0;
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
        if (i10 == a70Var.n) {
            user2 = (TLRPC.User) hashMap.get(Long.valueOf(j3));
            if (user2 == null) {
                i16 = ((org.telegram.ui.ActionBar.h3) a70Var).currentAccount;
                user2 = MessagesController.getInstance(i16).getUser(Long.valueOf(tL_chatInviteExported.admin_id));
            }
            if (user2 != null) {
                str = LocaleController.formatDateAudio(tL_chatInviteExported.date, false);
                user = user2;
                if (i10 != a70Var.n && chatParticipant != null) {
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
                            i15 = ((org.telegram.ui.ActionBar.h3) a70Var).currentAccount;
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
                            i14 = ((org.telegram.ui.ActionBar.h3) a70Var).currentAccount;
                            z12 = j15 == UserConfig.getInstance(i14).getClientUserId();
                            z10 = true;
                            z11 = false;
                            str2 = str8;
                        } else {
                            str2 = str8;
                        }
                    }
                    if (UserObject.isUserSelf(user)) {
                        i13 = ((org.telegram.ui.ActionBar.h3) a70Var).currentAccount;
                        str3 = str;
                        if (ChatObject.canManageMyTag(MessagesController.getInstance(i13).getChat(Long.valueOf(a70Var.g0)))) {
                            z13 = true;
                            y60Var.a(str2, z10, z11, z13, new q60(this, user, str2, z10, z11, z12, 0));
                            y60Var.d(user, null, str3, false);
                            if (i10 != a70Var.n || (tL_starsSubscriptionPricing = tL_chatInviteExported.subscription_pricing) == null || tL_chatInviteImporter == null) {
                                return;
                            }
                            int i31 = tL_chatInviteImporter.date;
                            TextView textView3 = y60Var.b0;
                            TextView textView4 = y60Var.a0;
                            SpannableStringBuilder X0 = xh.z7.X0(false, "⭐️" + tL_starsSubscriptionPricing.amount, 0.7f, null);
                            int i32 = tL_starsSubscriptionPricing.period;
                            String string = i32 == 2592000 ? LocaleController.getString(R.string.StarsParticipantSubscriptionPerMonth) : i32 == 300 ? "per 5 minutes" : "per each minute";
                            textView4.setText(X0);
                            textView3.setText(string);
                            y60Var.i((int) Math.max(bi.x4.g(X0, textView4.getPaint()), bi.x4.g(string, textView3.getPaint())), true);
                            y60Var.c.l(LocaleController.formatJoined(i31), false);
                            return;
                        }
                    } else {
                        str3 = str;
                    }
                    z13 = false;
                    y60Var.a(str2, z10, z11, z13, new q60(this, user, str2, z10, z11, z12, 0));
                    y60Var.d(user, null, str3, false);
                    if (i10 != a70Var.n) {
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
                y60Var.a(str2, z10, z11, z13, new q60(this, user, str2, z10, z11, z12, 0));
                y60Var.d(user, null, str3, false);
                if (i10 != a70Var.n) {
                }
            }
        }
        user = user2;
        str = null;
        if (i10 != a70Var.n) {
        }
        str2 = null;
        z10 = false;
        z11 = false;
        z12 = false;
        if (UserObject.isUserSelf(user)) {
        }
        z13 = false;
        y60Var.a(str2, z10, z11, z13, new q60(this, user, str2, z10, z11, z12, 0));
        y60Var.d(user, null, str3, false);
        if (i10 != a70Var.n) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        a10 a10Var;
        View view;
        org.telegram.ui.ActionBar.f6 f6Var;
        Context context = viewGroup.getContext();
        a70 a70Var = this.c;
        switch (i10) {
            case 1:
                view = new y60(context);
                break;
            case 2:
                view = new org.telegram.ui.Cells.c7(context, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.a7, false), 0);
                break;
            case 3:
                r60 r60Var = new r60(this, context, a70Var.U, a70Var, a70Var.h0);
                r60Var.setDelegate(new u60(this));
                r60Var.setLayoutParams(new s4.p0(-1, -2));
                view = r60Var;
                break;
            case 4:
                view = new z60(a70Var, context);
                break;
            case 5:
                a10 a10Var2 = new a10(context, null);
                a10Var2.setIsSingleCell(true);
                a10Var2.setViewType(10);
                a10Var2.w = false;
                a10Var2.setPaddingLeft(AndroidUtilities.dp(10.0f));
                a10Var = a10Var2;
                view = a10Var;
                break;
            case 6:
                view = new qn(context, 11);
                break;
            case 7:
                view = new org.telegram.ui.Cells.c7(context, (org.telegram.ui.Cells.r6) null);
                break;
            case 8:
                w60 w60Var = new w60(context);
                TextView textView = new TextView(context);
                w60Var.a = textView;
                textView.setTextSize(1, 14.0f);
                com.google.android.gms.internal.vision.e2.p(org.telegram.ui.ActionBar.j6.y6, null, false, textView, 1);
                w60Var.addView(textView, w7.a6.d(-1, -2.0f, 16, 60.0f, 0.0f, 60.0f, 0.0f));
                a10Var = w60Var;
                view = a10Var;
                break;
            case 9:
                view = new x60(a70Var, context);
                break;
            default:
                f6Var = ((org.telegram.ui.ActionBar.h3) a70Var).resourcesProvider;
                view = new org.telegram.ui.Cells.u3(context, f6Var);
                break;
        }
        return com.google.android.gms.internal.vision.e2.j(view, view, -1, -2);
    }
}
