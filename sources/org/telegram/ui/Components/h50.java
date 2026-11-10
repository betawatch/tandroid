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

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class h50 extends oj0 {
    public final /* synthetic */ m50 c;

    public h50(m50 m50Var) {
        this.c = m50Var;
    }

    @Override // org.telegram.ui.Components.oj0
    public final boolean D(v4.d1 d1Var) {
        int b10 = d1Var.b();
        m50 m50Var = this.c;
        if (b10 == m50Var.r1) {
            return m50Var.l1.admin_id != org.telegram.messenger.p10.i(m50Var.a).n;
        }
        if (b10 < m50Var.w1 || b10 >= m50Var.x1) {
            return b10 >= m50Var.I1 && b10 < m50Var.J1;
        }
        return true;
    }

    @Override // v4.g0
    public final int b() {
        return this.c.M1;
    }

    @Override // v4.g0
    public final int d(int i7) {
        m50 m50Var = this.c;
        if (i7 == m50Var.q1 || i7 == m50Var.H1 || i7 == m50Var.v1 || i7 == m50Var.o1) {
            return 0;
        }
        if (i7 == m50Var.r1) {
            return 1;
        }
        if (i7 >= m50Var.I1 && i7 < m50Var.J1) {
            return 1;
        }
        if (i7 >= m50Var.w1 && i7 < m50Var.x1) {
            return 1;
        }
        if (i7 == m50Var.s1 || i7 == m50Var.t1) {
            return 2;
        }
        if (i7 == m50Var.B1) {
            return 3;
        }
        if (i7 == m50Var.C1) {
            return 4;
        }
        if (i7 == m50Var.D1) {
            return 5;
        }
        m50Var.getClass();
        if (i7 == 0 || i7 == m50Var.E1 || i7 == m50Var.F1) {
            return 6;
        }
        if (i7 == m50Var.u1) {
            return 7;
        }
        if (i7 == m50Var.G1) {
            return 8;
        }
        return i7 == m50Var.p1 ? 9 : 0;
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
        m50 m50Var = this.c;
        HashMap hashMap = m50Var.m1;
        TLRPC.ChatFull chatFull = m50Var.n1;
        TLRPC.TL_chatInviteExported tL_chatInviteExported = m50Var.l1;
        int i12 = d1Var.f;
        View view = d1Var.a;
        if (i12 == 0) {
            org.telegram.ui.Cells.x3 x3Var = (org.telegram.ui.Cells.x3) view;
            if (i7 == m50Var.q1) {
                x3Var.setText(org.telegram.messenger.id.M0(2131748918, null));
                x3Var.setRightText(null);
                return;
            }
            if (i7 == m50Var.o1) {
                x3Var.setText(org.telegram.messenger.id.M0(2131748893, null));
                x3Var.setRightText(null);
                return;
            }
            if (i7 != m50Var.v1) {
                if (i7 == m50Var.y1) {
                    x3Var.setText(org.telegram.messenger.id.G(tL_chatInviteExported.subscription_expired, "PeopleSubscriptionExpired", new Object[0]));
                    x3Var.setRightText(null);
                    return;
                } else {
                    if (i7 == m50Var.H1) {
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
                q70 q70Var = (q70) view;
                q70Var.d(0, null, false);
                q70Var.setLink(tL_chatInviteExported.link);
                q70Var.setRevoke(tL_chatInviteExported.revoked);
                q70Var.setPermanent(tL_chatInviteExported.permanent);
                q70Var.setCanEdit(m50Var.e2);
                q70Var.b(!m50Var.e2);
                return;
            }
            if (i12 == 4) {
                l50 l50Var = (l50) view;
                org.telegram.messenger.g0.r(l50Var.x);
                l50Var.y = false;
                org.telegram.ui.ActionBar.t6.U(l50Var.getTextView(), org.telegram.ui.ActionBar.m6.B6, null);
                l50Var.setFixedSize(0);
                if (tL_chatInviteExported.revoked) {
                    l50Var.setText(org.telegram.messenger.id.M0(2131748901, null));
                    return;
                }
                if (tL_chatInviteExported.expired) {
                    int i14 = tL_chatInviteExported.usage_limit;
                    if (i14 > 0 && i14 == tL_chatInviteExported.usage) {
                        l50Var.setText(org.telegram.messenger.id.M0(2131748902, null));
                        return;
                    } else {
                        l50Var.setText(org.telegram.messenger.id.M0(2131748903, null));
                        org.telegram.ui.ActionBar.t6.U(l50Var.getTextView(), org.telegram.ui.ActionBar.m6.p7, null);
                        return;
                    }
                }
                if (tL_chatInviteExported.expire_date <= 0) {
                    l50Var.setFixedSize(-1);
                    l50Var.setText(null);
                    return;
                }
                long currentTimeMillis = (m50Var.c2 * 1000) + System.currentTimeMillis();
                long j10 = tL_chatInviteExported.expire_date;
                long j11 = (j10 * 1000) - currentTimeMillis;
                if (j11 < 0) {
                    j11 = 0;
                }
                if (j11 > 86400000) {
                    l50Var.setText(org.telegram.messenger.id.a0("LinkExpiresIn", null, 2131748916, org.telegram.messenger.id.s(j10, false)));
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
                l50Var.y = true;
                dt dtVar = l50Var.x;
                org.telegram.messenger.g0.r(dtVar);
                if (l50Var.y) {
                    org.telegram.messenger.g0.i3(dtVar, 500L);
                }
                l50Var.setText(org.telegram.messenger.id.a0("LinkExpiresInTime", null, 2131748915, sb3));
                return;
            }
            if (i12 == 8) {
                i50 i50Var = (i50) view;
                int i16 = tL_chatInviteExported.usage_limit;
                if (i16 <= 0) {
                    i50Var.a.setVisibility(8);
                    return;
                } else {
                    i50Var.a.setText(org.telegram.messenger.id.G(i16, "PeopleCanJoinViaLinkCount", new Object[0]));
                    i50Var.a.setVisibility(0);
                    return;
                }
            }
            if (i12 != 9) {
                return;
            }
            j50 j50Var = (j50) view;
            TL_stars.TL_starsSubscriptionPricing tL_starsSubscriptionPricing2 = tL_chatInviteExported.subscription_pricing;
            int i17 = tL_chatInviteExported.usage;
            m50 m50Var2 = j50Var.f;
            TextView textView = j50Var.c;
            TextView textView2 = j50Var.b;
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
                    int i20 = m50.h2;
                    a02 = org.telegram.messenger.id.a0(null, null, 2131748891, i19.f((long) (d * org.telegram.messenger.qp.s1(m50Var2.a).c6 * i17), "USD"));
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
                int i22 = m50.h2;
                format = String.format(locale2, "you get approximately %1$s %2$s", i21.f((long) (d2 * org.telegram.messenger.qp.s1(m50Var2.a).c6 * i17), "USD"), "for ".concat(str3));
            }
            textView.setText(format);
            return;
        }
        k50 k50Var = (k50) view;
        if (i7 == m50Var.r1) {
            j3 = tL_chatInviteExported.admin_id;
            tL_chatInviteImporter = null;
        } else {
            int i23 = m50Var.w1;
            ArrayList arrayList = m50Var.X1;
            int i24 = m50Var.z1;
            if (i24 != -1 && i7 >= i24) {
                arrayList = m50Var.Y1;
                i23 = i24;
            }
            int i25 = m50Var.I1;
            if (i25 != -1 && i7 >= i25) {
                arrayList = m50Var.Z1;
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
        if (i7 == m50Var.r1) {
            user2 = (TLRPC.User) hashMap.get(Long.valueOf(j3));
            if (user2 == null) {
                user2 = org.telegram.messenger.qp.s1(m50Var.a).a2(Long.valueOf(tL_chatInviteExported.admin_id));
            }
            if (user2 != null) {
                str = org.telegram.messenger.id.s(tL_chatInviteExported.date, false);
                user = user2;
                if (i7 != m50Var.r1 && chatParticipant != null) {
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
                            z15 = channelParticipant.promoted_by == org.telegram.messenger.p10.i(m50Var.a).e();
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
                            z11 = chatParticipant.inviter_id == org.telegram.messenger.p10.i(m50Var.a).e();
                            z9 = true;
                            z10 = false;
                            str2 = str4;
                        } else {
                            str2 = str4;
                        }
                    }
                    if (org.telegram.messenger.t10.B(user)) {
                        tL_chatInviteImporter2 = tL_chatInviteImporter;
                        if (org.telegram.messenger.t3.h(org.telegram.messenger.qp.s1(m50Var.a).M0(Long.valueOf(m50Var.a2)))) {
                            z12 = true;
                            k50Var.a(str2, z9, z10, z12, new c50(this, user, str2, z9, z10, z11, 0));
                            k50Var.d(user, null, str, false);
                            if (i7 != m50Var.r1 || (tL_starsSubscriptionPricing = tL_chatInviteExported.subscription_pricing) == null || tL_chatInviteImporter2 == null) {
                                return;
                            }
                            int i27 = tL_chatInviteImporter2.date;
                            TextView textView3 = k50Var.c0;
                            TextView textView4 = k50Var.b0;
                            SpannableStringBuilder a12 = bi.dd.a1(false, "⭐️" + tL_starsSubscriptionPricing.amount, 0.7f, null);
                            int i28 = tL_starsSubscriptionPricing.period;
                            String M0 = i28 == 2592000 ? org.telegram.messenger.id.M0(2131745056, null) : i28 == 300 ? "per 5 minutes" : "per each minute";
                            textView4.setText(a12);
                            textView3.setText(M0);
                            k50Var.h((int) Math.max(fi.m3.h(a12, textView4.getPaint()), fi.m3.h(M0, textView3.getPaint())), true);
                            k50Var.c.l(org.telegram.messenger.id.B(i27), false);
                            return;
                        }
                    } else {
                        tL_chatInviteImporter2 = tL_chatInviteImporter;
                    }
                    z12 = false;
                    k50Var.a(str2, z9, z10, z12, new c50(this, user, str2, z9, z10, z11, 0));
                    k50Var.d(user, null, str, false);
                    if (i7 != m50Var.r1) {
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
                k50Var.a(str2, z9, z10, z12, new c50(this, user, str2, z9, z10, z11, 0));
                k50Var.d(user, null, str, false);
                if (i7 != m50Var.r1) {
                }
            }
        }
        user = user2;
        str = null;
        if (i7 != m50Var.r1) {
        }
        str2 = null;
        z9 = false;
        z10 = false;
        z11 = false;
        if (org.telegram.messenger.t10.B(user)) {
        }
        z12 = false;
        k50Var.a(str2, z9, z10, z12, new c50(this, user, str2, z9, z10, z11, 0));
        k50Var.d(user, null, str, false);
        if (i7 != m50Var.r1) {
        }
    }

    @Override // v4.g0
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        View view;
        View view2;
        Context context = viewGroup.getContext();
        m50 m50Var = this.c;
        switch (i7) {
            case 1:
                view2 = new k50(context);
                break;
            case 2:
                int i10 = org.telegram.ui.ActionBar.m6.a7;
                View y6Var = new org.telegram.ui.Cells.y6(context, org.telegram.ui.ActionBar.m6.x0(null, i10, false), 0);
                org.telegram.ui.ActionBar.t6.h(i10, y6Var, null);
                view = y6Var;
                view2 = view;
                break;
            case 3:
                d50 d50Var = new d50(this, context, m50Var.O1, m50Var, m50Var.b2);
                d50Var.setDelegate(new g50(this));
                d50Var.setLayoutParams(new v4.o0(-1, -2));
                view2 = d50Var;
                break;
            case 4:
                view2 = new l50(m50Var, context);
                break;
            case 5:
                lz lzVar = new lz(context, null);
                lzVar.setIsSingleCell(true);
                lzVar.setViewType(10);
                lzVar.x = false;
                lzVar.setPaddingLeft(org.telegram.messenger.g0.L(10.0f));
                view = lzVar;
                view2 = view;
                break;
            case 6:
                view2 = new sm(context, 11);
                break;
            case 7:
                view2 = new org.telegram.ui.Cells.y6(context, (org.telegram.ui.Cells.f1) null);
                break;
            case 8:
                i50 i50Var = new i50(context);
                TextView textView = new TextView(context);
                i50Var.a = textView;
                textView.setTextSize(1, 14.0f);
                org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.y6, null);
                textView.setGravity(1);
                i50Var.addView(textView, c8.ha.d(-1, -2.0f, 16, 60.0f, 0.0f, 60.0f, 0.0f));
                view2 = i50Var;
                break;
            case 9:
                view2 = new j50(m50Var, context);
                break;
            default:
                view2 = new org.telegram.ui.Cells.x3(context, m50Var.I0);
                break;
        }
        return jg.g.r(view2, view2, -1, -2);
    }
}
