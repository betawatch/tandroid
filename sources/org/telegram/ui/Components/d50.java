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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class d50 extends sj0 {
    public final /* synthetic */ i50 c;

    public d50(i50 i50Var) {
        this.c = i50Var;
    }

    @Override // org.telegram.ui.Components.sj0
    public final boolean D(u4.d1 d1Var) {
        int b10 = d1Var.b();
        i50 i50Var = this.c;
        if (b10 == i50Var.p1) {
            return i50Var.j1.admin_id != org.telegram.messenger.h10.i(i50Var.a).n;
        }
        if (b10 < i50Var.u1 || b10 >= i50Var.v1) {
            return b10 >= i50Var.G1 && b10 < i50Var.H1;
        }
        return true;
    }

    @Override // u4.h0
    public final int b() {
        return this.c.K1;
    }

    @Override // u4.h0
    public final int d(int i3) {
        i50 i50Var = this.c;
        if (i3 == i50Var.o1 || i3 == i50Var.F1 || i3 == i50Var.t1 || i3 == i50Var.m1) {
            return 0;
        }
        if (i3 == i50Var.p1) {
            return 1;
        }
        if (i3 >= i50Var.G1 && i3 < i50Var.H1) {
            return 1;
        }
        if (i3 >= i50Var.u1 && i3 < i50Var.v1) {
            return 1;
        }
        if (i3 == i50Var.q1 || i3 == i50Var.r1) {
            return 2;
        }
        if (i3 == i50Var.z1) {
            return 3;
        }
        if (i3 == i50Var.A1) {
            return 4;
        }
        if (i3 == i50Var.B1) {
            return 5;
        }
        i50Var.getClass();
        if (i3 == 0 || i3 == i50Var.C1 || i3 == i50Var.D1) {
            return 6;
        }
        if (i3 == i50Var.s1) {
            return 7;
        }
        if (i3 == i50Var.E1) {
            return 8;
        }
        return i3 == i50Var.n1 ? 9 : 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:119:0x03b7  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x03f2  */
    /* JADX WARN: Removed duplicated region for block: B:138:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:140:0x03d2  */
    @Override // u4.h0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(u4.d1 d1Var, int i3) {
        int i10;
        int i11;
        long j10;
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
        i50 i50Var = this.c;
        HashMap hashMap = i50Var.k1;
        TLRPC.ChatFull chatFull = i50Var.l1;
        TLRPC.TL_chatInviteExported tL_chatInviteExported = i50Var.j1;
        int i12 = d1Var.f;
        View view = d1Var.a;
        if (i12 == 0) {
            org.telegram.ui.Cells.x3 x3Var = (org.telegram.ui.Cells.x3) view;
            if (i3 == i50Var.o1) {
                x3Var.setText(org.telegram.messenger.bd.M0(2131748926, null));
                x3Var.setRightText(null);
                return;
            }
            if (i3 == i50Var.m1) {
                x3Var.setText(org.telegram.messenger.bd.M0(2131748901, null));
                x3Var.setRightText(null);
                return;
            }
            if (i3 != i50Var.t1) {
                if (i3 == i50Var.w1) {
                    x3Var.setText(org.telegram.messenger.bd.G(tL_chatInviteExported.subscription_expired, "PeopleSubscriptionExpired", new Object[0]));
                    x3Var.setRightText(null);
                    return;
                } else {
                    if (i3 == i50Var.F1) {
                        x3Var.setText(org.telegram.messenger.bd.G(tL_chatInviteExported.requested, "JoinRequests", new Object[0]));
                        x3Var.setRightText(null);
                        return;
                    }
                    return;
                }
            }
            int i13 = tL_chatInviteExported.usage;
            if (i13 > 0) {
                x3Var.setText(org.telegram.messenger.bd.G(i13, "PeopleJoined", new Object[0]));
            } else {
                x3Var.setText(org.telegram.messenger.bd.M0(tL_chatInviteExported.subscription_pricing != null ? 2131748193 : 2131748195, null));
            }
            if (tL_chatInviteExported.expired || tL_chatInviteExported.revoked || (i10 = tL_chatInviteExported.usage_limit) <= 0 || (i11 = tL_chatInviteExported.usage) <= 0) {
                x3Var.setRightText(null);
                return;
            } else {
                x3Var.setRightText(org.telegram.messenger.bd.G(i10 - i11, "PeopleJoinedRemaining", new Object[0]));
                return;
            }
        }
        if (i12 != 1) {
            if (i12 == 3) {
                m70 m70Var = (m70) view;
                m70Var.d(0, null, false);
                m70Var.setLink(tL_chatInviteExported.link);
                m70Var.setRevoke(tL_chatInviteExported.revoked);
                m70Var.setPermanent(tL_chatInviteExported.permanent);
                m70Var.setCanEdit(i50Var.c2);
                m70Var.b(!i50Var.c2);
                return;
            }
            if (i12 == 4) {
                h50 h50Var = (h50) view;
                org.telegram.messenger.g0.r(h50Var.x);
                h50Var.y = false;
                org.telegram.ui.ActionBar.r6.V(h50Var.getTextView(), org.telegram.ui.ActionBar.k6.B6, null);
                h50Var.setFixedSize(0);
                if (tL_chatInviteExported.revoked) {
                    h50Var.setText(org.telegram.messenger.bd.M0(2131748909, null));
                    return;
                }
                if (tL_chatInviteExported.expired) {
                    int i14 = tL_chatInviteExported.usage_limit;
                    if (i14 > 0 && i14 == tL_chatInviteExported.usage) {
                        h50Var.setText(org.telegram.messenger.bd.M0(2131748910, null));
                        return;
                    } else {
                        h50Var.setText(org.telegram.messenger.bd.M0(2131748911, null));
                        org.telegram.ui.ActionBar.r6.V(h50Var.getTextView(), org.telegram.ui.ActionBar.k6.p7, null);
                        return;
                    }
                }
                if (tL_chatInviteExported.expire_date <= 0) {
                    h50Var.setFixedSize(-1);
                    h50Var.setText(null);
                    return;
                }
                long currentTimeMillis = (i50Var.a2 * 1000) + System.currentTimeMillis();
                long j11 = tL_chatInviteExported.expire_date;
                long j12 = (j11 * 1000) - currentTimeMillis;
                if (j12 < 0) {
                    j12 = 0;
                }
                if (j12 > 86400000) {
                    h50Var.setText(org.telegram.messenger.bd.a0("LinkExpiresIn", null, 2131748924, org.telegram.messenger.bd.s(j11, false)));
                    return;
                }
                long j13 = j12 / 1000;
                int i15 = (int) (j13 % 60);
                long j14 = j13 / 60;
                StringBuilder sb2 = new StringBuilder();
                Locale locale = Locale.ENGLISH;
                sb2.append(String.format(locale, "%02d", Integer.valueOf((int) (j14 / 60))));
                sb2.append(String.format(locale, ":%02d", Integer.valueOf((int) (j14 % 60))));
                sb2.append(String.format(locale, ":%02d", Integer.valueOf(i15)));
                String sb3 = sb2.toString();
                h50Var.y = true;
                lt ltVar = h50Var.x;
                org.telegram.messenger.g0.r(ltVar);
                if (h50Var.y) {
                    org.telegram.messenger.g0.i3(ltVar, 500L);
                }
                h50Var.setText(org.telegram.messenger.bd.a0("LinkExpiresInTime", null, 2131748923, sb3));
                return;
            }
            if (i12 == 8) {
                e50 e50Var = (e50) view;
                int i16 = tL_chatInviteExported.usage_limit;
                if (i16 <= 0) {
                    e50Var.a.setVisibility(8);
                    return;
                } else {
                    e50Var.a.setText(org.telegram.messenger.bd.G(i16, "PeopleCanJoinViaLinkCount", new Object[0]));
                    e50Var.a.setVisibility(0);
                    return;
                }
            }
            if (i12 != 9) {
                return;
            }
            f50 f50Var = (f50) view;
            TL_stars.TL_starsSubscriptionPricing tL_starsSubscriptionPricing2 = tL_chatInviteExported.subscription_pricing;
            int i17 = tL_chatInviteExported.usage;
            i50 i50Var2 = f50Var.f;
            TextView textView = f50Var.c;
            TextView textView2 = f50Var.b;
            if (tL_starsSubscriptionPricing2 == null) {
                return;
            }
            int i18 = tL_starsSubscriptionPricing2.period;
            if (i18 == 2592000) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(org.telegram.messenger.bd.a0(null, null, 2131748900, Long.valueOf(tL_starsSubscriptionPricing2.amount)));
                sb4.append(i17 > 0 ? k2.p1.i(i17, " x ") : "");
                textView2.setText(ci.wb.a1(false, sb4.toString(), 0.8f, null));
                if (i17 == 0) {
                    a02 = org.telegram.messenger.bd.M0(2131748193, null);
                } else {
                    org.telegram.messenger.r1 i19 = org.telegram.messenger.r1.i();
                    double d = tL_starsSubscriptionPricing2.amount / 1000.0d;
                    int i20 = i50.f2;
                    a02 = org.telegram.messenger.bd.a0(null, null, 2131748899, i19.f((long) (d * org.telegram.messenger.hp.s1(i50Var2.a).c6 * i17), "USD"));
                }
                textView.setText(a02);
                return;
            }
            String str3 = i18 == 300 ? "5min" : "min";
            StringBuilder sb5 = new StringBuilder();
            Locale locale2 = Locale.US;
            sb5.append(String.format(locale2, "⭐%1$d/%2$s", Long.valueOf(tL_starsSubscriptionPricing2.amount), str3));
            sb5.append(i17 > 0 ? k2.p1.i(i17, " x ") : "");
            textView2.setText(ci.wb.a1(false, sb5.toString(), 0.8f, null));
            if (i17 == 0) {
                format = org.telegram.messenger.bd.M0(2131748193, null);
            } else {
                org.telegram.messenger.r1 i21 = org.telegram.messenger.r1.i();
                double d10 = tL_starsSubscriptionPricing2.amount / 1000.0d;
                int i22 = i50.f2;
                format = String.format(locale2, "you get approximately %1$s %2$s", i21.f((long) (d10 * org.telegram.messenger.hp.s1(i50Var2.a).c6 * i17), "USD"), "for ".concat(str3));
            }
            textView.setText(format);
            return;
        }
        g50 g50Var = (g50) view;
        if (i3 == i50Var.p1) {
            j10 = tL_chatInviteExported.admin_id;
            tL_chatInviteImporter = null;
        } else {
            int i23 = i50Var.u1;
            ArrayList arrayList = i50Var.V1;
            int i24 = i50Var.x1;
            if (i24 != -1 && i3 >= i24) {
                arrayList = i50Var.W1;
                i23 = i24;
            }
            int i25 = i50Var.G1;
            if (i25 != -1 && i3 >= i25) {
                arrayList = i50Var.X1;
                i23 = i25;
            }
            TLRPC.TL_chatInviteImporter tL_chatInviteImporter3 = (TLRPC.TL_chatInviteImporter) arrayList.get(i3 - i23);
            j10 = tL_chatInviteImporter3.user_id;
            tL_chatInviteImporter = tL_chatInviteImporter3;
        }
        TLRPC.User user2 = (TLRPC.User) hashMap.get(Long.valueOf(j10));
        if (chatFull != null && chatFull.participants != null) {
            for (int i26 = 0; i26 < chatFull.participants.participants.size(); i26++) {
                if (chatFull.participants.participants.get(i26).user_id == j10) {
                    chatParticipant = chatFull.participants.participants.get(i26);
                    break;
                }
            }
        }
        chatParticipant = null;
        if (i3 == i50Var.p1) {
            user2 = (TLRPC.User) hashMap.get(Long.valueOf(j10));
            if (user2 == null) {
                user2 = org.telegram.messenger.hp.s1(i50Var.a).a2(Long.valueOf(tL_chatInviteExported.admin_id));
            }
            if (user2 != null) {
                str = org.telegram.messenger.bd.s(tL_chatInviteExported.date, false);
                user = user2;
                if (i3 != i50Var.p1 && chatParticipant != null) {
                    if (chatParticipant instanceof TLRPC.TL_chatChannelParticipant) {
                        TLRPC.ChannelParticipant channelParticipant = ((TLRPC.TL_chatChannelParticipant) chatParticipant).channelParticipant;
                        str2 = channelParticipant.rank;
                        if (channelParticipant instanceof TLRPC.TL_channelParticipantCreator) {
                            if (TextUtils.isEmpty(str2)) {
                                str2 = org.telegram.messenger.bd.M0(2131752423, "ChannelCreator");
                            }
                            z14 = true;
                            z15 = true;
                        } else if (channelParticipant instanceof TLRPC.TL_channelParticipantAdmin) {
                            if (TextUtils.isEmpty(str2)) {
                                str2 = org.telegram.messenger.bd.M0(2131752520, "ChannelAdmin");
                            }
                            z16 = channelParticipant.promoted_by == org.telegram.messenger.h10.i(i50Var.a).e();
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
                                str4 = org.telegram.messenger.bd.M0(2131752423, "ChannelCreator");
                            }
                            str2 = str4;
                            z10 = true;
                            z11 = true;
                            z12 = false;
                        } else if (chatParticipant instanceof TLRPC.TL_chatParticipantAdmin) {
                            if (TextUtils.isEmpty(str4)) {
                                str4 = org.telegram.messenger.bd.M0(2131752520, "ChannelAdmin");
                            }
                            z12 = chatParticipant.inviter_id == org.telegram.messenger.h10.i(i50Var.a).e();
                            z10 = true;
                            z11 = false;
                            str2 = str4;
                        } else {
                            str2 = str4;
                        }
                    }
                    if (org.telegram.messenger.l10.B(user)) {
                        tL_chatInviteImporter2 = tL_chatInviteImporter;
                        if (org.telegram.messenger.t3.h(org.telegram.messenger.hp.s1(i50Var.a).M0(Long.valueOf(i50Var.Y1)))) {
                            z13 = true;
                            g50Var.a(str2, z10, z11, z13, new y40(this, user, str2, z10, z11, z12, 0));
                            g50Var.d(user, null, str, false);
                            if (i3 != i50Var.p1 || (tL_starsSubscriptionPricing = tL_chatInviteExported.subscription_pricing) == null || tL_chatInviteImporter2 == null) {
                                return;
                            }
                            int i27 = tL_chatInviteImporter2.date;
                            TextView textView3 = g50Var.d0;
                            TextView textView4 = g50Var.c0;
                            SpannableStringBuilder a12 = ci.wb.a1(false, "⭐️" + tL_starsSubscriptionPricing.amount, 0.7f, null);
                            int i28 = tL_starsSubscriptionPricing.period;
                            String M0 = i28 == 2592000 ? org.telegram.messenger.bd.M0(2131745066, null) : i28 == 300 ? "per 5 minutes" : "per each minute";
                            textView4.setText(a12);
                            textView3.setText(M0);
                            g50Var.h((int) Math.max(gi.l3.h(a12, textView4.getPaint()), gi.l3.h(M0, textView3.getPaint())), true);
                            g50Var.c.l(org.telegram.messenger.bd.B(i27), false);
                            return;
                        }
                    } else {
                        tL_chatInviteImporter2 = tL_chatInviteImporter;
                    }
                    z13 = false;
                    g50Var.a(str2, z10, z11, z13, new y40(this, user, str2, z10, z11, z12, 0));
                    g50Var.d(user, null, str, false);
                    if (i3 != i50Var.p1) {
                        return;
                    } else {
                        return;
                    }
                }
                str2 = null;
                z10 = false;
                z11 = false;
                z12 = false;
                if (org.telegram.messenger.l10.B(user)) {
                }
                z13 = false;
                g50Var.a(str2, z10, z11, z13, new y40(this, user, str2, z10, z11, z12, 0));
                g50Var.d(user, null, str, false);
                if (i3 != i50Var.p1) {
                }
            }
        }
        user = user2;
        str = null;
        if (i3 != i50Var.p1) {
        }
        str2 = null;
        z10 = false;
        z11 = false;
        z12 = false;
        if (org.telegram.messenger.l10.B(user)) {
        }
        z13 = false;
        g50Var.a(str2, z10, z11, z13, new y40(this, user, str2, z10, z11, z12, 0));
        g50Var.d(user, null, str, false);
        if (i3 != i50Var.p1) {
        }
    }

    @Override // u4.h0
    public final u4.d1 x(ViewGroup viewGroup, int i3) {
        View view;
        View view2;
        Context context = viewGroup.getContext();
        i50 i50Var = this.c;
        switch (i3) {
            case 1:
                view2 = new g50(context);
                break;
            case 2:
                int i10 = org.telegram.ui.ActionBar.k6.a7;
                View x6Var = new org.telegram.ui.Cells.x6(context, org.telegram.ui.ActionBar.k6.x0(null, i10, false), 0);
                org.telegram.ui.ActionBar.r6.i(i10, x6Var, null);
                view = x6Var;
                view2 = view;
                break;
            case 3:
                z40 z40Var = new z40(this, context, i50Var.M1, i50Var, i50Var.Z1);
                z40Var.setDelegate(new c50(this));
                z40Var.setLayoutParams(new u4.p0(-1, -2));
                view2 = z40Var;
                break;
            case 4:
                view2 = new h50(i50Var, context);
                break;
            case 5:
                iz izVar = new iz(context, null);
                izVar.setIsSingleCell(true);
                izVar.setViewType(10);
                izVar.x = false;
                izVar.setPaddingLeft(org.telegram.messenger.g0.L(10.0f));
                view = izVar;
                view2 = view;
                break;
            case 6:
                view2 = new sm(context, 12);
                break;
            case 7:
                view2 = new org.telegram.ui.Cells.x6(context, (org.telegram.ui.Cells.f1) null);
                break;
            case 8:
                e50 e50Var = new e50(context);
                TextView textView = new TextView(context);
                e50Var.a = textView;
                textView.setTextSize(1, 14.0f);
                org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.y6, null);
                textView.setGravity(1);
                e50Var.addView(textView, b8.mf.d(-1, -2.0f, 16, 60.0f, 0.0f, 60.0f, 0.0f));
                view2 = e50Var;
                break;
            case 9:
                view2 = new f50(i50Var, context);
                break;
            default:
                view2 = new org.telegram.ui.Cells.x3(context, i50Var.J0);
                break;
        }
        return k2.p1.p(view2, view2, -1, -2);
    }
}
