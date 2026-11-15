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

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class k50 extends tj0 {
    public final /* synthetic */ p50 c;

    public k50(p50 p50Var) {
        this.c = p50Var;
    }

    @Override // org.telegram.ui.Components.tj0
    public final boolean D(v4.e1 e1Var) {
        int b10 = e1Var.b();
        p50 p50Var = this.c;
        if (b10 == p50Var.s1) {
            return p50Var.m1.admin_id != org.telegram.messenger.m10.i(p50Var.a).n;
        }
        if (b10 < p50Var.x1 || b10 >= p50Var.y1) {
            return b10 >= p50Var.J1 && b10 < p50Var.K1;
        }
        return true;
    }

    @Override // v4.h0
    public final int b() {
        return this.c.N1;
    }

    @Override // v4.h0
    public final int d(int i7) {
        p50 p50Var = this.c;
        if (i7 == p50Var.r1 || i7 == p50Var.I1 || i7 == p50Var.w1 || i7 == p50Var.p1) {
            return 0;
        }
        if (i7 == p50Var.s1) {
            return 1;
        }
        if (i7 >= p50Var.J1 && i7 < p50Var.K1) {
            return 1;
        }
        if (i7 >= p50Var.x1 && i7 < p50Var.y1) {
            return 1;
        }
        if (i7 == p50Var.t1 || i7 == p50Var.u1) {
            return 2;
        }
        if (i7 == p50Var.C1) {
            return 3;
        }
        if (i7 == p50Var.D1) {
            return 4;
        }
        if (i7 == p50Var.E1) {
            return 5;
        }
        p50Var.getClass();
        if (i7 == 0 || i7 == p50Var.F1 || i7 == p50Var.G1) {
            return 6;
        }
        if (i7 == p50Var.v1) {
            return 7;
        }
        if (i7 == p50Var.H1) {
            return 8;
        }
        return i7 == p50Var.q1 ? 9 : 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:119:0x03b7  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x03f2  */
    /* JADX WARN: Removed duplicated region for block: B:138:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:140:0x03d2  */
    @Override // v4.h0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(v4.e1 e1Var, int i7) {
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
        p50 p50Var = this.c;
        HashMap hashMap = p50Var.n1;
        TLRPC.ChatFull chatFull = p50Var.o1;
        TLRPC.TL_chatInviteExported tL_chatInviteExported = p50Var.m1;
        int i12 = e1Var.f;
        View view = e1Var.a;
        if (i12 == 0) {
            org.telegram.ui.Cells.x3 x3Var = (org.telegram.ui.Cells.x3) view;
            if (i7 == p50Var.r1) {
                x3Var.setText(org.telegram.messenger.hd.M0(2131748918, null));
                x3Var.setRightText(null);
                return;
            }
            if (i7 == p50Var.p1) {
                x3Var.setText(org.telegram.messenger.hd.M0(2131748893, null));
                x3Var.setRightText(null);
                return;
            }
            if (i7 != p50Var.w1) {
                if (i7 == p50Var.z1) {
                    x3Var.setText(org.telegram.messenger.hd.G(tL_chatInviteExported.subscription_expired, "PeopleSubscriptionExpired", new Object[0]));
                    x3Var.setRightText(null);
                    return;
                } else {
                    if (i7 == p50Var.I1) {
                        x3Var.setText(org.telegram.messenger.hd.G(tL_chatInviteExported.requested, "JoinRequests", new Object[0]));
                        x3Var.setRightText(null);
                        return;
                    }
                    return;
                }
            }
            int i13 = tL_chatInviteExported.usage;
            if (i13 > 0) {
                x3Var.setText(org.telegram.messenger.hd.G(i13, "PeopleJoined", new Object[0]));
            } else {
                x3Var.setText(org.telegram.messenger.hd.M0(tL_chatInviteExported.subscription_pricing != null ? 2131748185 : 2131748187, null));
            }
            if (tL_chatInviteExported.expired || tL_chatInviteExported.revoked || (i10 = tL_chatInviteExported.usage_limit) <= 0 || (i11 = tL_chatInviteExported.usage) <= 0) {
                x3Var.setRightText(null);
                return;
            } else {
                x3Var.setRightText(org.telegram.messenger.hd.G(i10 - i11, "PeopleJoinedRemaining", new Object[0]));
                return;
            }
        }
        if (i12 != 1) {
            if (i12 == 3) {
                t70 t70Var = (t70) view;
                t70Var.d(0, null, false);
                t70Var.setLink(tL_chatInviteExported.link);
                t70Var.setRevoke(tL_chatInviteExported.revoked);
                t70Var.setPermanent(tL_chatInviteExported.permanent);
                t70Var.setCanEdit(p50Var.f2);
                t70Var.b(!p50Var.f2);
                return;
            }
            if (i12 == 4) {
                o50 o50Var = (o50) view;
                org.telegram.messenger.g0.r(o50Var.x);
                o50Var.y = false;
                org.telegram.ui.ActionBar.q6.U(o50Var.getTextView(), org.telegram.ui.ActionBar.j6.B6, null);
                o50Var.setFixedSize(0);
                if (tL_chatInviteExported.revoked) {
                    o50Var.setText(org.telegram.messenger.hd.M0(2131748901, null));
                    return;
                }
                if (tL_chatInviteExported.expired) {
                    int i14 = tL_chatInviteExported.usage_limit;
                    if (i14 > 0 && i14 == tL_chatInviteExported.usage) {
                        o50Var.setText(org.telegram.messenger.hd.M0(2131748902, null));
                        return;
                    } else {
                        o50Var.setText(org.telegram.messenger.hd.M0(2131748903, null));
                        org.telegram.ui.ActionBar.q6.U(o50Var.getTextView(), org.telegram.ui.ActionBar.j6.p7, null);
                        return;
                    }
                }
                if (tL_chatInviteExported.expire_date <= 0) {
                    o50Var.setFixedSize(-1);
                    o50Var.setText(null);
                    return;
                }
                long currentTimeMillis = (p50Var.d2 * 1000) + System.currentTimeMillis();
                long j10 = tL_chatInviteExported.expire_date;
                long j11 = (j10 * 1000) - currentTimeMillis;
                if (j11 < 0) {
                    j11 = 0;
                }
                if (j11 > 86400000) {
                    o50Var.setText(org.telegram.messenger.hd.a0("LinkExpiresIn", null, 2131748916, org.telegram.messenger.hd.s(j10, false)));
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
                o50Var.y = true;
                zj zjVar = o50Var.x;
                org.telegram.messenger.g0.r(zjVar);
                if (o50Var.y) {
                    org.telegram.messenger.g0.i3(zjVar, 500L);
                }
                o50Var.setText(org.telegram.messenger.hd.a0("LinkExpiresInTime", null, 2131748915, sb3));
                return;
            }
            if (i12 == 8) {
                l50 l50Var = (l50) view;
                int i16 = tL_chatInviteExported.usage_limit;
                if (i16 <= 0) {
                    l50Var.a.setVisibility(8);
                    return;
                } else {
                    l50Var.a.setText(org.telegram.messenger.hd.G(i16, "PeopleCanJoinViaLinkCount", new Object[0]));
                    l50Var.a.setVisibility(0);
                    return;
                }
            }
            if (i12 != 9) {
                return;
            }
            m50 m50Var = (m50) view;
            TL_stars.TL_starsSubscriptionPricing tL_starsSubscriptionPricing2 = tL_chatInviteExported.subscription_pricing;
            int i17 = tL_chatInviteExported.usage;
            p50 p50Var2 = m50Var.f;
            TextView textView = m50Var.c;
            TextView textView2 = m50Var.b;
            if (tL_starsSubscriptionPricing2 == null) {
                return;
            }
            int i18 = tL_starsSubscriptionPricing2.period;
            if (i18 == 2592000) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(org.telegram.messenger.hd.a0(null, null, 2131748892, Long.valueOf(tL_starsSubscriptionPricing2.amount)));
                sb4.append(i17 > 0 ? i5.c.i(i17, " x ") : "");
                textView2.setText(di.lb.a1(false, sb4.toString(), 0.8f, null));
                if (i17 == 0) {
                    a02 = org.telegram.messenger.hd.M0(2131748185, null);
                } else {
                    org.telegram.messenger.r1 i19 = org.telegram.messenger.r1.i();
                    double d = tL_starsSubscriptionPricing2.amount / 1000.0d;
                    int i20 = p50.i2;
                    a02 = org.telegram.messenger.hd.a0(null, null, 2131748891, i19.f((long) (d * org.telegram.messenger.np.s1(p50Var2.a).d6 * i17), "USD"));
                }
                textView.setText(a02);
                return;
            }
            String str3 = i18 == 300 ? "5min" : "min";
            StringBuilder sb5 = new StringBuilder();
            Locale locale2 = Locale.US;
            sb5.append(String.format(locale2, "⭐%1$d/%2$s", Long.valueOf(tL_starsSubscriptionPricing2.amount), str3));
            sb5.append(i17 > 0 ? i5.c.i(i17, " x ") : "");
            textView2.setText(di.lb.a1(false, sb5.toString(), 0.8f, null));
            if (i17 == 0) {
                format = org.telegram.messenger.hd.M0(2131748185, null);
            } else {
                org.telegram.messenger.r1 i21 = org.telegram.messenger.r1.i();
                double d2 = tL_starsSubscriptionPricing2.amount / 1000.0d;
                int i22 = p50.i2;
                format = String.format(locale2, "you get approximately %1$s %2$s", i21.f((long) (d2 * org.telegram.messenger.np.s1(p50Var2.a).d6 * i17), "USD"), "for ".concat(str3));
            }
            textView.setText(format);
            return;
        }
        n50 n50Var = (n50) view;
        if (i7 == p50Var.s1) {
            j3 = tL_chatInviteExported.admin_id;
            tL_chatInviteImporter = null;
        } else {
            int i23 = p50Var.x1;
            ArrayList arrayList = p50Var.Y1;
            int i24 = p50Var.A1;
            if (i24 != -1 && i7 >= i24) {
                arrayList = p50Var.Z1;
                i23 = i24;
            }
            int i25 = p50Var.J1;
            if (i25 != -1 && i7 >= i25) {
                arrayList = p50Var.a2;
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
        if (i7 == p50Var.s1) {
            user2 = (TLRPC.User) hashMap.get(Long.valueOf(j3));
            if (user2 == null) {
                user2 = org.telegram.messenger.np.s1(p50Var.a).a2(Long.valueOf(tL_chatInviteExported.admin_id));
            }
            if (user2 != null) {
                str = org.telegram.messenger.hd.s(tL_chatInviteExported.date, false);
                user = user2;
                if (i7 != p50Var.s1 && chatParticipant != null) {
                    if (chatParticipant instanceof TLRPC.TL_chatChannelParticipant) {
                        TLRPC.ChannelParticipant channelParticipant = ((TLRPC.TL_chatChannelParticipant) chatParticipant).channelParticipant;
                        str2 = channelParticipant.rank;
                        if (channelParticipant instanceof TLRPC.TL_channelParticipantCreator) {
                            if (TextUtils.isEmpty(str2)) {
                                str2 = org.telegram.messenger.hd.M0(2131752423, "ChannelCreator");
                            }
                            z14 = true;
                            z15 = true;
                        } else if (channelParticipant instanceof TLRPC.TL_channelParticipantAdmin) {
                            if (TextUtils.isEmpty(str2)) {
                                str2 = org.telegram.messenger.hd.M0(2131752520, "ChannelAdmin");
                            }
                            z16 = channelParticipant.promoted_by == org.telegram.messenger.m10.i(p50Var.a).e();
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
                                str4 = org.telegram.messenger.hd.M0(2131752423, "ChannelCreator");
                            }
                            str2 = str4;
                            z10 = true;
                            z11 = true;
                            z12 = false;
                        } else if (chatParticipant instanceof TLRPC.TL_chatParticipantAdmin) {
                            if (TextUtils.isEmpty(str4)) {
                                str4 = org.telegram.messenger.hd.M0(2131752520, "ChannelAdmin");
                            }
                            z12 = chatParticipant.inviter_id == org.telegram.messenger.m10.i(p50Var.a).e();
                            z10 = true;
                            z11 = false;
                            str2 = str4;
                        } else {
                            str2 = str4;
                        }
                    }
                    if (org.telegram.messenger.q10.B(user)) {
                        tL_chatInviteImporter2 = tL_chatInviteImporter;
                        if (org.telegram.messenger.t3.h(org.telegram.messenger.np.s1(p50Var.a).M0(Long.valueOf(p50Var.b2)))) {
                            z13 = true;
                            n50Var.a(str2, z10, z11, z13, new f50(this, user, str2, z10, z11, z12, 0));
                            n50Var.d(user, null, str, false);
                            if (i7 != p50Var.s1 || (tL_starsSubscriptionPricing = tL_chatInviteExported.subscription_pricing) == null || tL_chatInviteImporter2 == null) {
                                return;
                            }
                            int i27 = tL_chatInviteImporter2.date;
                            TextView textView3 = n50Var.d0;
                            TextView textView4 = n50Var.c0;
                            SpannableStringBuilder a12 = di.lb.a1(false, "⭐️" + tL_starsSubscriptionPricing.amount, 0.7f, null);
                            int i28 = tL_starsSubscriptionPricing.period;
                            String M0 = i28 == 2592000 ? org.telegram.messenger.hd.M0(2131745056, null) : i28 == 300 ? "per 5 minutes" : "per each minute";
                            textView4.setText(a12);
                            textView3.setText(M0);
                            n50Var.h((int) Math.max(hi.l3.h(a12, textView4.getPaint()), hi.l3.h(M0, textView3.getPaint())), true);
                            n50Var.c.l(org.telegram.messenger.hd.B(i27), false);
                            return;
                        }
                    } else {
                        tL_chatInviteImporter2 = tL_chatInviteImporter;
                    }
                    z13 = false;
                    n50Var.a(str2, z10, z11, z13, new f50(this, user, str2, z10, z11, z12, 0));
                    n50Var.d(user, null, str, false);
                    if (i7 != p50Var.s1) {
                        return;
                    } else {
                        return;
                    }
                }
                str2 = null;
                z10 = false;
                z11 = false;
                z12 = false;
                if (org.telegram.messenger.q10.B(user)) {
                }
                z13 = false;
                n50Var.a(str2, z10, z11, z13, new f50(this, user, str2, z10, z11, z12, 0));
                n50Var.d(user, null, str, false);
                if (i7 != p50Var.s1) {
                }
            }
        }
        user = user2;
        str = null;
        if (i7 != p50Var.s1) {
        }
        str2 = null;
        z10 = false;
        z11 = false;
        z12 = false;
        if (org.telegram.messenger.q10.B(user)) {
        }
        z13 = false;
        n50Var.a(str2, z10, z11, z13, new f50(this, user, str2, z10, z11, z12, 0));
        n50Var.d(user, null, str, false);
        if (i7 != p50Var.s1) {
        }
    }

    @Override // v4.h0
    public final v4.e1 x(ViewGroup viewGroup, int i7) {
        View view;
        View view2;
        Context context = viewGroup.getContext();
        p50 p50Var = this.c;
        switch (i7) {
            case 1:
                view2 = new n50(context);
                break;
            case 2:
                int i10 = org.telegram.ui.ActionBar.j6.a7;
                View x6Var = new org.telegram.ui.Cells.x6(context, org.telegram.ui.ActionBar.j6.x0(null, i10, false), 0);
                org.telegram.ui.ActionBar.q6.h(i10, x6Var, null);
                view = x6Var;
                view2 = view;
                break;
            case 3:
                g50 g50Var = new g50(this, context, p50Var.P1, p50Var, p50Var.c2);
                g50Var.setDelegate(new j50(this));
                g50Var.setLayoutParams(new v4.p0(-1, -2));
                view2 = g50Var;
                break;
            case 4:
                view2 = new o50(p50Var, context);
                break;
            case 5:
                pz pzVar = new pz(context, null);
                pzVar.setIsSingleCell(true);
                pzVar.setViewType(10);
                pzVar.x = false;
                pzVar.setPaddingLeft(org.telegram.messenger.g0.L(10.0f));
                view = pzVar;
                view2 = view;
                break;
            case 6:
                view2 = new bn(context, 11);
                break;
            case 7:
                view2 = new org.telegram.ui.Cells.x6(context, (org.telegram.ui.Cells.y0) null);
                break;
            case 8:
                l50 l50Var = new l50(context);
                TextView textView = new TextView(context);
                l50Var.a = textView;
                textView.setTextSize(1, 14.0f);
                org.telegram.ui.ActionBar.q6.U(textView, org.telegram.ui.ActionBar.j6.y6, null);
                textView.setGravity(1);
                l50Var.addView(textView, c8.ja.d(-1, -2.0f, 16, 60.0f, 0.0f, 60.0f, 0.0f));
                view2 = l50Var;
                break;
            case 9:
                view2 = new m50(p50Var, context);
                break;
            default:
                view2 = new org.telegram.ui.Cells.x3(context, p50Var.J0);
                break;
        }
        return i5.c.q(view2, view2, -1, -2);
    }
}
