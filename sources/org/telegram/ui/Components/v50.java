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
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class v50 extends dk0 {
    public final /* synthetic */ a60 c;

    public v50(a60 a60Var) {
        this.c = a60Var;
    }

    @Override // org.telegram.ui.Components.dk0
    public final boolean D(v4.f1 f1Var) {
        int b10 = f1Var.b();
        a60 a60Var = this.c;
        if (b10 == a60Var.s1) {
            return a60Var.m1.admin_id != org.telegram.messenger.k10.i(a60Var.a).n;
        }
        if (b10 < a60Var.x1 || b10 >= a60Var.y1) {
            return b10 >= a60Var.J1 && b10 < a60Var.K1;
        }
        return true;
    }

    @Override // v4.i0
    public final int b() {
        return this.c.N1;
    }

    @Override // v4.i0
    public final int d(int i7) {
        a60 a60Var = this.c;
        if (i7 == a60Var.r1 || i7 == a60Var.I1 || i7 == a60Var.w1 || i7 == a60Var.p1) {
            return 0;
        }
        if (i7 == a60Var.s1) {
            return 1;
        }
        if (i7 >= a60Var.J1 && i7 < a60Var.K1) {
            return 1;
        }
        if (i7 >= a60Var.x1 && i7 < a60Var.y1) {
            return 1;
        }
        if (i7 == a60Var.t1 || i7 == a60Var.u1) {
            return 2;
        }
        if (i7 == a60Var.C1) {
            return 3;
        }
        if (i7 == a60Var.D1) {
            return 4;
        }
        if (i7 == a60Var.E1) {
            return 5;
        }
        a60Var.getClass();
        if (i7 == 0 || i7 == a60Var.F1 || i7 == a60Var.G1) {
            return 6;
        }
        if (i7 == a60Var.v1) {
            return 7;
        }
        if (i7 == a60Var.H1) {
            return 8;
        }
        return i7 == a60Var.q1 ? 9 : 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:119:0x03b7  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x03f2  */
    /* JADX WARN: Removed duplicated region for block: B:138:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:140:0x03d2  */
    @Override // v4.i0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(v4.f1 f1Var, int i7) {
        int i10;
        int i11;
        long j3;
        TLRPC.TL_chatInviteImporter tL_chatInviteImporter;
        TLRPC.ChatParticipant chatParticipant;
        TLRPC.User user;
        String str;
        String str2;
        boolean z10;
        boolean z11;
        boolean z12;
        TLRPC.TL_chatInviteImporter tL_chatInviteImporter2;
        boolean z13;
        TL_stars.TL_starsSubscriptionPricing tL_starsSubscriptionPricing;
        boolean z14;
        boolean z15;
        boolean z16;
        String format;
        String a02;
        a60 a60Var = this.c;
        HashMap hashMap = a60Var.n1;
        TLRPC.ChatFull chatFull = a60Var.o1;
        TLRPC.TL_chatInviteExported tL_chatInviteExported = a60Var.m1;
        int i12 = f1Var.f;
        View view = f1Var.a;
        if (i12 == 0) {
            org.telegram.ui.Cells.y3 y3Var = (org.telegram.ui.Cells.y3) view;
            if (i7 == a60Var.r1) {
                y3Var.setText(org.telegram.messenger.hd.N0(2131748725, null));
                y3Var.setRightText(null);
                return;
            }
            if (i7 == a60Var.p1) {
                y3Var.setText(org.telegram.messenger.hd.N0(2131748700, null));
                y3Var.setRightText(null);
                return;
            }
            if (i7 != a60Var.w1) {
                if (i7 == a60Var.z1) {
                    y3Var.setText(org.telegram.messenger.hd.G(tL_chatInviteExported.subscription_expired, "PeopleSubscriptionExpired", new Object[0]));
                    y3Var.setRightText(null);
                    return;
                } else {
                    if (i7 == a60Var.I1) {
                        y3Var.setText(org.telegram.messenger.hd.G(tL_chatInviteExported.requested, "JoinRequests", new Object[0]));
                        y3Var.setRightText(null);
                        return;
                    }
                    return;
                }
            }
            int i13 = tL_chatInviteExported.usage;
            if (i13 > 0) {
                y3Var.setText(org.telegram.messenger.hd.G(i13, "PeopleJoined", new Object[0]));
            } else {
                y3Var.setText(org.telegram.messenger.hd.N0(tL_chatInviteExported.subscription_pricing != null ? 2131747992 : 2131747994, null));
            }
            if (tL_chatInviteExported.expired || tL_chatInviteExported.revoked || (i10 = tL_chatInviteExported.usage_limit) <= 0 || (i11 = tL_chatInviteExported.usage) <= 0) {
                y3Var.setRightText(null);
                return;
            } else {
                y3Var.setRightText(org.telegram.messenger.hd.G(i10 - i11, "PeopleJoinedRemaining", new Object[0]));
                return;
            }
        }
        if (i12 != 1) {
            if (i12 == 3) {
                g80 g80Var = (g80) view;
                g80Var.d(0, null, false);
                g80Var.setLink(tL_chatInviteExported.link);
                g80Var.setRevoke(tL_chatInviteExported.revoked);
                g80Var.setPermanent(tL_chatInviteExported.permanent);
                g80Var.setCanEdit(a60Var.f2);
                g80Var.b(!a60Var.f2);
                return;
            }
            if (i12 == 4) {
                z50 z50Var = (z50) view;
                org.telegram.messenger.g0.r(z50Var.x);
                z50Var.y = false;
                org.telegram.ui.ActionBar.t6.U(z50Var.getTextView(), org.telegram.ui.ActionBar.m6.B6, null);
                z50Var.setFixedSize(0);
                if (tL_chatInviteExported.revoked) {
                    z50Var.setText(org.telegram.messenger.hd.N0(2131748708, null));
                    return;
                }
                if (tL_chatInviteExported.expired) {
                    int i14 = tL_chatInviteExported.usage_limit;
                    if (i14 > 0 && i14 == tL_chatInviteExported.usage) {
                        z50Var.setText(org.telegram.messenger.hd.N0(2131748709, null));
                        return;
                    } else {
                        z50Var.setText(org.telegram.messenger.hd.N0(2131748710, null));
                        org.telegram.ui.ActionBar.t6.U(z50Var.getTextView(), org.telegram.ui.ActionBar.m6.p7, null);
                        return;
                    }
                }
                if (tL_chatInviteExported.expire_date <= 0) {
                    z50Var.setFixedSize(-1);
                    z50Var.setText(null);
                    return;
                }
                long currentTimeMillis = (a60Var.d2 * 1000) + System.currentTimeMillis();
                long j10 = tL_chatInviteExported.expire_date;
                long j11 = (j10 * 1000) - currentTimeMillis;
                if (j11 < 0) {
                    j11 = 0;
                }
                if (j11 > 86400000) {
                    z50Var.setText(org.telegram.messenger.hd.a0("LinkExpiresIn", null, 2131748723, org.telegram.messenger.hd.s(j10, false)));
                    return;
                }
                long j12 = j11 / 1000;
                int i15 = (int) (j12 % 60);
                long j13 = j12 / 60;
                StringBuilder sb2 = new StringBuilder();
                Locale locale = Locale.ENGLISH;
                sb2.append(String.format(locale, "%02d", Integer.valueOf((int) (j13 / 60))));
                sb2.append(String.format(locale, ":%02d", Integer.valueOf((int) (j13 % 60))));
                sb2.append(String.format(locale, ":%02d", Integer.valueOf(i15)));
                String sb3 = sb2.toString();
                z50Var.y = true;
                ik ikVar = z50Var.x;
                org.telegram.messenger.g0.r(ikVar);
                if (z50Var.y) {
                    org.telegram.messenger.g0.h3(ikVar, 500L);
                }
                z50Var.setText(org.telegram.messenger.hd.a0("LinkExpiresInTime", null, 2131748722, sb3));
                return;
            }
            if (i12 == 8) {
                w50 w50Var = (w50) view;
                int i16 = tL_chatInviteExported.usage_limit;
                if (i16 <= 0) {
                    w50Var.a.setVisibility(8);
                    return;
                } else {
                    w50Var.a.setText(org.telegram.messenger.hd.G(i16, "PeopleCanJoinViaLinkCount", new Object[0]));
                    w50Var.a.setVisibility(0);
                    return;
                }
            }
            if (i12 != 9) {
                return;
            }
            x50 x50Var = (x50) view;
            TL_stars.TL_starsSubscriptionPricing tL_starsSubscriptionPricing2 = tL_chatInviteExported.subscription_pricing;
            int i17 = tL_chatInviteExported.usage;
            a60 a60Var2 = x50Var.f;
            TextView textView = x50Var.c;
            TextView textView2 = x50Var.b;
            if (tL_starsSubscriptionPricing2 == null) {
                return;
            }
            int i18 = tL_starsSubscriptionPricing2.period;
            if (i18 == 2592000) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(org.telegram.messenger.hd.a0(null, null, 2131748699, Long.valueOf(tL_starsSubscriptionPricing2.amount)));
                sb4.append(i17 > 0 ? i5.c.i(i17, " x ") : "");
                textView2.setText(di.pb.b1(false, sb4.toString(), 0.8f, null));
                if (i17 == 0) {
                    a02 = org.telegram.messenger.hd.N0(2131747992, null);
                } else {
                    org.telegram.messenger.r1 i19 = org.telegram.messenger.r1.i();
                    double d = tL_starsSubscriptionPricing2.amount / 1000.0d;
                    int i20 = a60.i2;
                    a02 = org.telegram.messenger.hd.a0(null, null, 2131748698, i19.f((long) (d * org.telegram.messenger.np.u1(a60Var2.a).f6 * i17), "USD"));
                }
                textView.setText(a02);
                return;
            }
            String str3 = i18 == 300 ? "5min" : "min";
            StringBuilder sb5 = new StringBuilder();
            Locale locale2 = Locale.US;
            sb5.append(String.format(locale2, "⭐%1$d/%2$s", Long.valueOf(tL_starsSubscriptionPricing2.amount), str3));
            sb5.append(i17 > 0 ? i5.c.i(i17, " x ") : "");
            textView2.setText(di.pb.b1(false, sb5.toString(), 0.8f, null));
            if (i17 == 0) {
                format = org.telegram.messenger.hd.N0(2131747992, null);
            } else {
                org.telegram.messenger.r1 i21 = org.telegram.messenger.r1.i();
                double d2 = tL_starsSubscriptionPricing2.amount / 1000.0d;
                int i22 = a60.i2;
                format = String.format(locale2, "you get approximately %1$s %2$s", i21.f((long) (d2 * org.telegram.messenger.np.u1(a60Var2.a).f6 * i17), "USD"), "for ".concat(str3));
            }
            textView.setText(format);
            return;
        }
        y50 y50Var = (y50) view;
        if (i7 == a60Var.s1) {
            j3 = tL_chatInviteExported.admin_id;
            tL_chatInviteImporter = null;
        } else {
            int i23 = a60Var.x1;
            ArrayList arrayList = a60Var.Y1;
            int i24 = a60Var.A1;
            if (i24 != -1 && i7 >= i24) {
                arrayList = a60Var.Z1;
                i23 = i24;
            }
            int i25 = a60Var.J1;
            if (i25 != -1 && i7 >= i25) {
                arrayList = a60Var.a2;
                i23 = i25;
            }
            TLRPC.TL_chatInviteImporter tL_chatInviteImporter3 = (TLRPC.TL_chatInviteImporter) arrayList.get(i7 - i23);
            j3 = tL_chatInviteImporter3.user_id;
            tL_chatInviteImporter = tL_chatInviteImporter3;
        }
        TLRPC.User user2 = (TLRPC.User) hashMap.get(Long.valueOf(j3));
        if (chatFull != null && chatFull.participants != null) {
            for (int i26 = 0; i26 < chatFull.participants.participants.size(); i26++) {
                if (chatFull.participants.participants.get(i26).user_id == j3) {
                    chatParticipant = chatFull.participants.participants.get(i26);
                    break;
                }
            }
        }
        chatParticipant = null;
        if (i7 == a60Var.s1) {
            user2 = (TLRPC.User) hashMap.get(Long.valueOf(j3));
            if (user2 == null) {
                user2 = org.telegram.messenger.np.u1(a60Var.a).c2(Long.valueOf(tL_chatInviteExported.admin_id));
            }
            if (user2 != null) {
                str = org.telegram.messenger.hd.s(tL_chatInviteExported.date, false);
                user = user2;
                if (i7 != a60Var.s1 && chatParticipant != null) {
                    if (chatParticipant instanceof TLRPC.TL_chatChannelParticipant) {
                        TLRPC.ChannelParticipant channelParticipant = ((TLRPC.TL_chatChannelParticipant) chatParticipant).channelParticipant;
                        str2 = channelParticipant.rank;
                        if (channelParticipant instanceof TLRPC.TL_channelParticipantCreator) {
                            if (TextUtils.isEmpty(str2)) {
                                str2 = org.telegram.messenger.hd.N0(2131752411, "ChannelCreator");
                            }
                            z14 = true;
                            z15 = true;
                        } else if (channelParticipant instanceof TLRPC.TL_channelParticipantAdmin) {
                            if (TextUtils.isEmpty(str2)) {
                                str2 = org.telegram.messenger.hd.N0(2131752508, "ChannelAdmin");
                            }
                            z16 = channelParticipant.promoted_by == org.telegram.messenger.k10.i(a60Var.a).e();
                            z14 = true;
                            z15 = false;
                            z12 = z16;
                            z11 = z15;
                            z10 = z14;
                        } else {
                            z14 = false;
                            z15 = false;
                        }
                        z16 = false;
                        z12 = z16;
                        z11 = z15;
                        z10 = z14;
                    } else {
                        String str4 = chatParticipant.rank;
                        if (chatParticipant instanceof TLRPC.TL_chatParticipantCreator) {
                            if (TextUtils.isEmpty(str4)) {
                                str4 = org.telegram.messenger.hd.N0(2131752411, "ChannelCreator");
                            }
                            str2 = str4;
                            z10 = true;
                            z11 = true;
                            z12 = false;
                        } else if (chatParticipant instanceof TLRPC.TL_chatParticipantAdmin) {
                            if (TextUtils.isEmpty(str4)) {
                                str4 = org.telegram.messenger.hd.N0(2131752508, "ChannelAdmin");
                            }
                            z12 = chatParticipant.inviter_id == org.telegram.messenger.k10.i(a60Var.a).e();
                            z10 = true;
                            z11 = false;
                            str2 = str4;
                        } else {
                            str2 = str4;
                        }
                    }
                    if (org.telegram.messenger.p10.C(user)) {
                        tL_chatInviteImporter2 = tL_chatInviteImporter;
                        if (org.telegram.messenger.v3.h(org.telegram.messenger.np.u1(a60Var.a).O0(Long.valueOf(a60Var.b2)))) {
                            z13 = true;
                            y50Var.a(str2, z10, z11, z13, new q50(this, user, str2, z10, z11, z12, 0));
                            y50Var.d(user, null, str, false);
                            if (i7 != a60Var.s1 || (tL_starsSubscriptionPricing = tL_chatInviteExported.subscription_pricing) == null || tL_chatInviteImporter2 == null) {
                                return;
                            }
                            int i27 = tL_chatInviteImporter2.date;
                            TextView textView3 = y50Var.d0;
                            TextView textView4 = y50Var.c0;
                            SpannableStringBuilder b12 = di.pb.b1(false, "⭐️" + tL_starsSubscriptionPricing.amount, 0.7f, null);
                            int i28 = tL_starsSubscriptionPricing.period;
                            String N0 = i28 == 2592000 ? org.telegram.messenger.hd.N0(2131744813, null) : i28 == 300 ? "per 5 minutes" : "per each minute";
                            textView4.setText(b12);
                            textView3.setText(N0);
                            y50Var.h((int) Math.max(hi.l3.h(b12, textView4.getPaint()), hi.l3.h(N0, textView3.getPaint())), true);
                            y50Var.c.l(org.telegram.messenger.hd.B(i27), false);
                            return;
                        }
                    } else {
                        tL_chatInviteImporter2 = tL_chatInviteImporter;
                    }
                    z13 = false;
                    y50Var.a(str2, z10, z11, z13, new q50(this, user, str2, z10, z11, z12, 0));
                    y50Var.d(user, null, str, false);
                    if (i7 != a60Var.s1) {
                        return;
                    } else {
                        return;
                    }
                }
                str2 = null;
                z10 = false;
                z11 = false;
                z12 = false;
                if (org.telegram.messenger.p10.C(user)) {
                }
                z13 = false;
                y50Var.a(str2, z10, z11, z13, new q50(this, user, str2, z10, z11, z12, 0));
                y50Var.d(user, null, str, false);
                if (i7 != a60Var.s1) {
                }
            }
        }
        user = user2;
        str = null;
        if (i7 != a60Var.s1) {
        }
        str2 = null;
        z10 = false;
        z11 = false;
        z12 = false;
        if (org.telegram.messenger.p10.C(user)) {
        }
        z13 = false;
        y50Var.a(str2, z10, z11, z13, new q50(this, user, str2, z10, z11, z12, 0));
        y50Var.d(user, null, str, false);
        if (i7 != a60Var.s1) {
        }
    }

    @Override // v4.i0
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        View view;
        View view2;
        Context context = viewGroup.getContext();
        a60 a60Var = this.c;
        switch (i7) {
            case 1:
                view2 = new y50(context);
                break;
            case 2:
                int i10 = org.telegram.ui.ActionBar.m6.a7;
                View z6Var = new org.telegram.ui.Cells.z6(context, org.telegram.ui.ActionBar.m6.x0(null, i10, false), 0);
                org.telegram.ui.ActionBar.t6.h(i10, z6Var, null);
                view = z6Var;
                view2 = view;
                break;
            case 3:
                r50 r50Var = new r50(this, context, a60Var.P1, a60Var, a60Var.c2);
                r50Var.setDelegate(new u50(this));
                r50Var.setLayoutParams(new v4.q0(-1, -2));
                view2 = r50Var;
                break;
            case 4:
                view2 = new z50(a60Var, context);
                break;
            case 5:
                yz yzVar = new yz(context, null);
                yzVar.setIsSingleCell(true);
                yzVar.setViewType(10);
                yzVar.x = false;
                yzVar.setPaddingLeft(org.telegram.messenger.g0.L(10.0f));
                view = yzVar;
                view2 = view;
                break;
            case 6:
                view2 = new ln(context, 11);
                break;
            case 7:
                view2 = new org.telegram.ui.Cells.z6(context, (org.telegram.ui.Cells.c0) null);
                break;
            case 8:
                w50 w50Var = new w50(context);
                TextView textView = new TextView(context);
                w50Var.a = textView;
                textView.setTextSize(1, 14.0f);
                org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.y6, null);
                textView.setGravity(1);
                w50Var.addView(textView, c8.ma.d(-1, -2.0f, 16, 60.0f, 0.0f, 60.0f, 0.0f));
                view2 = w50Var;
                break;
            case 9:
                view2 = new x50(a60Var, context);
                break;
            default:
                view2 = new org.telegram.ui.Cells.y3(context, a60Var.J0);
                break;
        }
        return i5.c.q(view2, view2, -1, -2);
    }
}
