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

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class i50 extends pj0 {
    public final /* synthetic */ n50 c;

    public i50(n50 n50Var) {
        this.c = n50Var;
    }

    @Override // org.telegram.ui.Components.pj0
    public final boolean D(v4.d1 d1Var) {
        int b10 = d1Var.b();
        n50 n50Var = this.c;
        if (b10 == n50Var.o1) {
            return n50Var.i1.admin_id != org.telegram.messenger.p10.i(n50Var.a).n;
        }
        if (b10 < n50Var.t1 || b10 >= n50Var.u1) {
            return b10 >= n50Var.F1 && b10 < n50Var.G1;
        }
        return true;
    }

    @Override // v4.g0
    public final int b() {
        return this.c.J1;
    }

    @Override // v4.g0
    public final int d(int i7) {
        n50 n50Var = this.c;
        if (i7 == n50Var.n1 || i7 == n50Var.E1 || i7 == n50Var.s1 || i7 == n50Var.l1) {
            return 0;
        }
        if (i7 == n50Var.o1) {
            return 1;
        }
        if (i7 >= n50Var.F1 && i7 < n50Var.G1) {
            return 1;
        }
        if (i7 >= n50Var.t1 && i7 < n50Var.u1) {
            return 1;
        }
        if (i7 == n50Var.p1 || i7 == n50Var.q1) {
            return 2;
        }
        if (i7 == n50Var.y1) {
            return 3;
        }
        if (i7 == n50Var.z1) {
            return 4;
        }
        if (i7 == n50Var.A1) {
            return 5;
        }
        n50Var.getClass();
        if (i7 == 0 || i7 == n50Var.B1 || i7 == n50Var.C1) {
            return 6;
        }
        if (i7 == n50Var.r1) {
            return 7;
        }
        if (i7 == n50Var.D1) {
            return 8;
        }
        return i7 == n50Var.m1 ? 9 : 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:119:0x03b7  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x03f2  */
    /* JADX WARN: Removed duplicated region for block: B:138:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:140:0x03d2  */
    @Override // v4.g0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(v4.d1 d1Var, int i7) {
        int i10;
        int i11;
        long j3;
        TLRPC.TL_chatInviteImporter tL_chatInviteImporter;
        TLRPC.ChatParticipant chatParticipant;
        TLRPC.User user;
        String str;
        String str2;
        boolean z9;
        boolean z10;
        boolean z11;
        TLRPC.TL_chatInviteImporter tL_chatInviteImporter2;
        boolean z12;
        TL_stars.TL_starsSubscriptionPricing tL_starsSubscriptionPricing;
        boolean z13;
        boolean z14;
        boolean z15;
        String format;
        String a02;
        n50 n50Var = this.c;
        HashMap hashMap = n50Var.j1;
        TLRPC.ChatFull chatFull = n50Var.k1;
        TLRPC.TL_chatInviteExported tL_chatInviteExported = n50Var.i1;
        int i12 = d1Var.f;
        View view = d1Var.a;
        if (i12 == 0) {
            org.telegram.ui.Cells.x3 x3Var = (org.telegram.ui.Cells.x3) view;
            if (i7 == n50Var.n1) {
                x3Var.setText(org.telegram.messenger.id.M0(2131748918, null));
                x3Var.setRightText(null);
                return;
            }
            if (i7 == n50Var.l1) {
                x3Var.setText(org.telegram.messenger.id.M0(2131748893, null));
                x3Var.setRightText(null);
                return;
            }
            if (i7 != n50Var.s1) {
                if (i7 == n50Var.v1) {
                    x3Var.setText(org.telegram.messenger.id.G(tL_chatInviteExported.subscription_expired, "PeopleSubscriptionExpired", new Object[0]));
                    x3Var.setRightText(null);
                    return;
                } else {
                    if (i7 == n50Var.E1) {
                        x3Var.setText(org.telegram.messenger.id.G(tL_chatInviteExported.requested, "JoinRequests", new Object[0]));
                        x3Var.setRightText(null);
                        return;
                    }
                    return;
                }
            }
            int i13 = tL_chatInviteExported.usage;
            if (i13 > 0) {
                x3Var.setText(org.telegram.messenger.id.G(i13, "PeopleJoined", new Object[0]));
            } else {
                x3Var.setText(org.telegram.messenger.id.M0(tL_chatInviteExported.subscription_pricing != null ? 2131748185 : 2131748187, null));
            }
            if (tL_chatInviteExported.expired || tL_chatInviteExported.revoked || (i10 = tL_chatInviteExported.usage_limit) <= 0 || (i11 = tL_chatInviteExported.usage) <= 0) {
                x3Var.setRightText(null);
                return;
            } else {
                x3Var.setRightText(org.telegram.messenger.id.G(i10 - i11, "PeopleJoinedRemaining", new Object[0]));
                return;
            }
        }
        if (i12 != 1) {
            if (i12 == 3) {
                r70 r70Var = (r70) view;
                r70Var.d(0, null, false);
                r70Var.setLink(tL_chatInviteExported.link);
                r70Var.setRevoke(tL_chatInviteExported.revoked);
                r70Var.setPermanent(tL_chatInviteExported.permanent);
                r70Var.setCanEdit(n50Var.b2);
                r70Var.b(!n50Var.b2);
                return;
            }
            if (i12 == 4) {
                m50 m50Var = (m50) view;
                org.telegram.messenger.g0.r(m50Var.x);
                m50Var.y = false;
                org.telegram.ui.ActionBar.s6.U(m50Var.getTextView(), org.telegram.ui.ActionBar.l6.B6, null);
                m50Var.setFixedSize(0);
                if (tL_chatInviteExported.revoked) {
                    m50Var.setText(org.telegram.messenger.id.M0(2131748901, null));
                    return;
                }
                if (tL_chatInviteExported.expired) {
                    int i14 = tL_chatInviteExported.usage_limit;
                    if (i14 > 0 && i14 == tL_chatInviteExported.usage) {
                        m50Var.setText(org.telegram.messenger.id.M0(2131748902, null));
                        return;
                    } else {
                        m50Var.setText(org.telegram.messenger.id.M0(2131748903, null));
                        org.telegram.ui.ActionBar.s6.U(m50Var.getTextView(), org.telegram.ui.ActionBar.l6.p7, null);
                        return;
                    }
                }
                if (tL_chatInviteExported.expire_date <= 0) {
                    m50Var.setFixedSize(-1);
                    m50Var.setText(null);
                    return;
                }
                long currentTimeMillis = (n50Var.Z1 * 1000) + System.currentTimeMillis();
                long j10 = tL_chatInviteExported.expire_date;
                long j11 = (j10 * 1000) - currentTimeMillis;
                if (j11 < 0) {
                    j11 = 0;
                }
                if (j11 > 86400000) {
                    m50Var.setText(org.telegram.messenger.id.a0("LinkExpiresIn", null, 2131748916, org.telegram.messenger.id.s(j10, false)));
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
                m50Var.y = true;
                et etVar = m50Var.x;
                org.telegram.messenger.g0.r(etVar);
                if (m50Var.y) {
                    org.telegram.messenger.g0.i3(etVar, 500L);
                }
                m50Var.setText(org.telegram.messenger.id.a0("LinkExpiresInTime", null, 2131748915, sb3));
                return;
            }
            if (i12 == 8) {
                j50 j50Var = (j50) view;
                int i16 = tL_chatInviteExported.usage_limit;
                if (i16 <= 0) {
                    j50Var.a.setVisibility(8);
                    return;
                } else {
                    j50Var.a.setText(org.telegram.messenger.id.G(i16, "PeopleCanJoinViaLinkCount", new Object[0]));
                    j50Var.a.setVisibility(0);
                    return;
                }
            }
            if (i12 != 9) {
                return;
            }
            k50 k50Var = (k50) view;
            TL_stars.TL_starsSubscriptionPricing tL_starsSubscriptionPricing2 = tL_chatInviteExported.subscription_pricing;
            int i17 = tL_chatInviteExported.usage;
            n50 n50Var2 = k50Var.f;
            TextView textView = k50Var.c;
            TextView textView2 = k50Var.b;
            if (tL_starsSubscriptionPricing2 == null) {
                return;
            }
            int i18 = tL_starsSubscriptionPricing2.period;
            if (i18 == 2592000) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(org.telegram.messenger.id.a0(null, null, 2131748892, Long.valueOf(tL_starsSubscriptionPricing2.amount)));
                sb4.append(i17 > 0 ? jg.g.j(i17, " x ") : "");
                textView2.setText(bi.dd.a1(false, sb4.toString(), 0.8f, null));
                if (i17 == 0) {
                    a02 = org.telegram.messenger.id.M0(2131748185, null);
                } else {
                    org.telegram.messenger.r1 i19 = org.telegram.messenger.r1.i();
                    double d = tL_starsSubscriptionPricing2.amount / 1000.0d;
                    int i20 = n50.e2;
                    a02 = org.telegram.messenger.id.a0(null, null, 2131748891, i19.f((long) (d * org.telegram.messenger.qp.s1(n50Var2.a).c6 * i17), "USD"));
                }
                textView.setText(a02);
                return;
            }
            String str3 = i18 == 300 ? "5min" : "min";
            StringBuilder sb5 = new StringBuilder();
            Locale locale2 = Locale.US;
            sb5.append(String.format(locale2, "⭐%1$d/%2$s", Long.valueOf(tL_starsSubscriptionPricing2.amount), str3));
            sb5.append(i17 > 0 ? jg.g.j(i17, " x ") : "");
            textView2.setText(bi.dd.a1(false, sb5.toString(), 0.8f, null));
            if (i17 == 0) {
                format = org.telegram.messenger.id.M0(2131748185, null);
            } else {
                org.telegram.messenger.r1 i21 = org.telegram.messenger.r1.i();
                double d2 = tL_starsSubscriptionPricing2.amount / 1000.0d;
                int i22 = n50.e2;
                format = String.format(locale2, "you get approximately %1$s %2$s", i21.f((long) (d2 * org.telegram.messenger.qp.s1(n50Var2.a).c6 * i17), "USD"), "for ".concat(str3));
            }
            textView.setText(format);
            return;
        }
        l50 l50Var = (l50) view;
        if (i7 == n50Var.o1) {
            j3 = tL_chatInviteExported.admin_id;
            tL_chatInviteImporter = null;
        } else {
            int i23 = n50Var.t1;
            ArrayList arrayList = n50Var.U1;
            int i24 = n50Var.w1;
            if (i24 != -1 && i7 >= i24) {
                arrayList = n50Var.V1;
                i23 = i24;
            }
            int i25 = n50Var.F1;
            if (i25 != -1 && i7 >= i25) {
                arrayList = n50Var.W1;
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
        if (i7 == n50Var.o1) {
            user2 = (TLRPC.User) hashMap.get(Long.valueOf(j3));
            if (user2 == null) {
                user2 = org.telegram.messenger.qp.s1(n50Var.a).a2(Long.valueOf(tL_chatInviteExported.admin_id));
            }
            if (user2 != null) {
                str = org.telegram.messenger.id.s(tL_chatInviteExported.date, false);
                user = user2;
                if (i7 != n50Var.o1 && chatParticipant != null) {
                    if (chatParticipant instanceof TLRPC.TL_chatChannelParticipant) {
                        TLRPC.ChannelParticipant channelParticipant = ((TLRPC.TL_chatChannelParticipant) chatParticipant).channelParticipant;
                        str2 = channelParticipant.rank;
                        if (channelParticipant instanceof TLRPC.TL_channelParticipantCreator) {
                            if (TextUtils.isEmpty(str2)) {
                                str2 = org.telegram.messenger.id.M0(2131752423, "ChannelCreator");
                            }
                            z13 = true;
                            z14 = true;
                        } else if (channelParticipant instanceof TLRPC.TL_channelParticipantAdmin) {
                            if (TextUtils.isEmpty(str2)) {
                                str2 = org.telegram.messenger.id.M0(2131752520, "ChannelAdmin");
                            }
                            z15 = channelParticipant.promoted_by == org.telegram.messenger.p10.i(n50Var.a).e();
                            z13 = true;
                            z14 = false;
                            z11 = z15;
                            z10 = z14;
                            z9 = z13;
                        } else {
                            z13 = false;
                            z14 = false;
                        }
                        z15 = false;
                        z11 = z15;
                        z10 = z14;
                        z9 = z13;
                    } else {
                        String str4 = chatParticipant.rank;
                        if (chatParticipant instanceof TLRPC.TL_chatParticipantCreator) {
                            if (TextUtils.isEmpty(str4)) {
                                str4 = org.telegram.messenger.id.M0(2131752423, "ChannelCreator");
                            }
                            str2 = str4;
                            z9 = true;
                            z10 = true;
                            z11 = false;
                        } else if (chatParticipant instanceof TLRPC.TL_chatParticipantAdmin) {
                            if (TextUtils.isEmpty(str4)) {
                                str4 = org.telegram.messenger.id.M0(2131752520, "ChannelAdmin");
                            }
                            z11 = chatParticipant.inviter_id == org.telegram.messenger.p10.i(n50Var.a).e();
                            z9 = true;
                            z10 = false;
                            str2 = str4;
                        } else {
                            str2 = str4;
                        }
                    }
                    if (org.telegram.messenger.t10.B(user)) {
                        tL_chatInviteImporter2 = tL_chatInviteImporter;
                        if (org.telegram.messenger.t3.h(org.telegram.messenger.qp.s1(n50Var.a).M0(Long.valueOf(n50Var.X1)))) {
                            z12 = true;
                            l50Var.a(str2, z9, z10, z12, new d50(this, user, str2, z9, z10, z11, 0));
                            l50Var.d(user, null, str, false);
                            if (i7 != n50Var.o1 || (tL_starsSubscriptionPricing = tL_chatInviteExported.subscription_pricing) == null || tL_chatInviteImporter2 == null) {
                                return;
                            }
                            int i27 = tL_chatInviteImporter2.date;
                            TextView textView3 = l50Var.c0;
                            TextView textView4 = l50Var.b0;
                            SpannableStringBuilder a12 = bi.dd.a1(false, "⭐️" + tL_starsSubscriptionPricing.amount, 0.7f, null);
                            int i28 = tL_starsSubscriptionPricing.period;
                            String M0 = i28 == 2592000 ? org.telegram.messenger.id.M0(2131745056, null) : i28 == 300 ? "per 5 minutes" : "per each minute";
                            textView4.setText(a12);
                            textView3.setText(M0);
                            l50Var.h((int) Math.max(fi.m3.h(a12, textView4.getPaint()), fi.m3.h(M0, textView3.getPaint())), true);
                            l50Var.c.l(org.telegram.messenger.id.B(i27), false);
                            return;
                        }
                    } else {
                        tL_chatInviteImporter2 = tL_chatInviteImporter;
                    }
                    z12 = false;
                    l50Var.a(str2, z9, z10, z12, new d50(this, user, str2, z9, z10, z11, 0));
                    l50Var.d(user, null, str, false);
                    if (i7 != n50Var.o1) {
                        return;
                    } else {
                        return;
                    }
                }
                str2 = null;
                z9 = false;
                z10 = false;
                z11 = false;
                if (org.telegram.messenger.t10.B(user)) {
                }
                z12 = false;
                l50Var.a(str2, z9, z10, z12, new d50(this, user, str2, z9, z10, z11, 0));
                l50Var.d(user, null, str, false);
                if (i7 != n50Var.o1) {
                }
            }
        }
        user = user2;
        str = null;
        if (i7 != n50Var.o1) {
        }
        str2 = null;
        z9 = false;
        z10 = false;
        z11 = false;
        if (org.telegram.messenger.t10.B(user)) {
        }
        z12 = false;
        l50Var.a(str2, z9, z10, z12, new d50(this, user, str2, z9, z10, z11, 0));
        l50Var.d(user, null, str, false);
        if (i7 != n50Var.o1) {
        }
    }

    @Override // v4.g0
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        View view;
        View view2;
        Context context = viewGroup.getContext();
        n50 n50Var = this.c;
        switch (i7) {
            case 1:
                view2 = new l50(context);
                break;
            case 2:
                int i10 = org.telegram.ui.ActionBar.l6.a7;
                View y6Var = new org.telegram.ui.Cells.y6(context, org.telegram.ui.ActionBar.l6.x0(null, i10, false), 0);
                org.telegram.ui.ActionBar.s6.h(i10, y6Var, null);
                view = y6Var;
                view2 = view;
                break;
            case 3:
                e50 e50Var = new e50(this, context, n50Var.L1, n50Var, n50Var.Y1);
                e50Var.setDelegate(new h50(this));
                e50Var.setLayoutParams(new v4.o0(-1, -2));
                view2 = e50Var;
                break;
            case 4:
                view2 = new m50(n50Var, context);
                break;
            case 5:
                mz mzVar = new mz(context, null);
                mzVar.setIsSingleCell(true);
                mzVar.setViewType(10);
                mzVar.x = false;
                mzVar.setPaddingLeft(org.telegram.messenger.g0.L(10.0f));
                view = mzVar;
                view2 = view;
                break;
            case 6:
                view2 = new tm(context, 11);
                break;
            case 7:
                view2 = new org.telegram.ui.Cells.y6(context, (org.telegram.ui.Cells.f1) null);
                break;
            case 8:
                j50 j50Var = new j50(context);
                TextView textView = new TextView(context);
                j50Var.a = textView;
                textView.setTextSize(1, 14.0f);
                org.telegram.ui.ActionBar.s6.U(textView, org.telegram.ui.ActionBar.l6.y6, null);
                textView.setGravity(1);
                j50Var.addView(textView, c8.ha.d(-1, -2.0f, 16, 60.0f, 0.0f, 60.0f, 0.0f));
                view2 = j50Var;
                break;
            case 9:
                view2 = new k50(n50Var, context);
                break;
            default:
                view2 = new org.telegram.ui.Cells.x3(context, n50Var.I0);
                break;
        }
        return jg.g.r(view2, view2, -1, -2);
    }
}
