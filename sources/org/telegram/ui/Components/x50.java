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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class x50 extends sk0 {
    public final /* synthetic */ c60 c;

    public x50(c60 c60Var) {
        this.c = c60Var;
    }

    @Override // org.telegram.ui.Components.sk0
    public final boolean D(s4.c1 c1Var) {
        int b10 = c1Var.b();
        c60 c60Var = this.c;
        if (b10 == c60Var.o1) {
            return c60Var.i1.admin_id != org.telegram.messenger.d20.i(c60Var.a).n;
        }
        if (b10 < c60Var.t1 || b10 >= c60Var.u1) {
            return b10 >= c60Var.F1 && b10 < c60Var.G1;
        }
        return true;
    }

    @Override // s4.g0
    public final int b() {
        return this.c.J1;
    }

    @Override // s4.g0
    public final int d(int i10) {
        c60 c60Var = this.c;
        if (i10 == c60Var.n1 || i10 == c60Var.E1 || i10 == c60Var.s1 || i10 == c60Var.l1) {
            return 0;
        }
        if (i10 == c60Var.o1) {
            return 1;
        }
        if (i10 >= c60Var.F1 && i10 < c60Var.G1) {
            return 1;
        }
        if (i10 >= c60Var.t1 && i10 < c60Var.u1) {
            return 1;
        }
        if (i10 == c60Var.p1 || i10 == c60Var.q1) {
            return 2;
        }
        if (i10 == c60Var.y1) {
            return 3;
        }
        if (i10 == c60Var.z1) {
            return 4;
        }
        if (i10 == c60Var.A1) {
            return 5;
        }
        c60Var.getClass();
        if (i10 == 0 || i10 == c60Var.B1 || i10 == c60Var.C1) {
            return 6;
        }
        if (i10 == c60Var.r1) {
            return 7;
        }
        if (i10 == c60Var.D1) {
            return 8;
        }
        return i10 == c60Var.m1 ? 9 : 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:119:0x03b7  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x03f2  */
    /* JADX WARN: Removed duplicated region for block: B:138:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:140:0x03d2  */
    @Override // s4.g0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(s4.c1 c1Var, int i10) {
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
        TLRPC.TL_chatInviteImporter tL_chatInviteImporter2;
        boolean z13;
        TL_stars.TL_starsSubscriptionPricing tL_starsSubscriptionPricing;
        boolean z14;
        boolean z15;
        boolean z16;
        String format;
        String a02;
        c60 c60Var = this.c;
        HashMap hashMap = c60Var.j1;
        TLRPC.ChatFull chatFull = c60Var.k1;
        TLRPC.TL_chatInviteExported tL_chatInviteExported = c60Var.i1;
        int i13 = c1Var.f;
        View view = c1Var.a;
        if (i13 == 0) {
            org.telegram.ui.Cells.z3 z3Var = (org.telegram.ui.Cells.z3) view;
            if (i10 == c60Var.n1) {
                z3Var.setText(org.telegram.messenger.cd.L0(2131748928, null));
                z3Var.setRightText(null);
                return;
            }
            if (i10 == c60Var.l1) {
                z3Var.setText(org.telegram.messenger.cd.L0(2131748903, null));
                z3Var.setRightText(null);
                return;
            }
            if (i10 != c60Var.s1) {
                if (i10 == c60Var.v1) {
                    z3Var.setText(org.telegram.messenger.cd.G(tL_chatInviteExported.subscription_expired, "PeopleSubscriptionExpired", new Object[0]));
                    z3Var.setRightText(null);
                    return;
                } else {
                    if (i10 == c60Var.E1) {
                        z3Var.setText(org.telegram.messenger.cd.G(tL_chatInviteExported.requested, "JoinRequests", new Object[0]));
                        z3Var.setRightText(null);
                        return;
                    }
                    return;
                }
            }
            int i14 = tL_chatInviteExported.usage;
            if (i14 > 0) {
                z3Var.setText(org.telegram.messenger.cd.G(i14, "PeopleJoined", new Object[0]));
            } else {
                z3Var.setText(org.telegram.messenger.cd.L0(tL_chatInviteExported.subscription_pricing != null ? 2131748202 : 2131748204, null));
            }
            if (tL_chatInviteExported.expired || tL_chatInviteExported.revoked || (i11 = tL_chatInviteExported.usage_limit) <= 0 || (i12 = tL_chatInviteExported.usage) <= 0) {
                z3Var.setRightText(null);
                return;
            } else {
                z3Var.setRightText(org.telegram.messenger.cd.G(i11 - i12, "PeopleJoinedRemaining", new Object[0]));
                return;
            }
        }
        if (i13 != 1) {
            if (i13 == 3) {
                j80 j80Var = (j80) view;
                j80Var.d(0, null, false);
                j80Var.setLink(tL_chatInviteExported.link);
                j80Var.setRevoke(tL_chatInviteExported.revoked);
                j80Var.setPermanent(tL_chatInviteExported.permanent);
                j80Var.setCanEdit(c60Var.b2);
                j80Var.b(!c60Var.b2);
                return;
            }
            if (i13 == 4) {
                b60 b60Var = (b60) view;
                org.telegram.messenger.i0.r(b60Var.x);
                b60Var.y = false;
                org.telegram.ui.ActionBar.a7.V(b60Var.getTextView(), org.telegram.ui.ActionBar.t6.B6, null);
                b60Var.setFixedSize(0);
                if (tL_chatInviteExported.revoked) {
                    b60Var.setText(org.telegram.messenger.cd.L0(2131748911, null));
                    return;
                }
                if (tL_chatInviteExported.expired) {
                    int i15 = tL_chatInviteExported.usage_limit;
                    if (i15 > 0 && i15 == tL_chatInviteExported.usage) {
                        b60Var.setText(org.telegram.messenger.cd.L0(2131748912, null));
                        return;
                    } else {
                        b60Var.setText(org.telegram.messenger.cd.L0(2131748913, null));
                        org.telegram.ui.ActionBar.a7.V(b60Var.getTextView(), org.telegram.ui.ActionBar.t6.p7, null);
                        return;
                    }
                }
                if (tL_chatInviteExported.expire_date <= 0) {
                    b60Var.setFixedSize(-1);
                    b60Var.setText(null);
                    return;
                }
                long currentTimeMillis = (c60Var.Z1 * 1000) + System.currentTimeMillis();
                long j11 = tL_chatInviteExported.expire_date;
                long j12 = (j11 * 1000) - currentTimeMillis;
                if (j12 < 0) {
                    j12 = 0;
                }
                if (j12 > 86400000) {
                    b60Var.setText(org.telegram.messenger.cd.a0("LinkExpiresIn", null, 2131748926, org.telegram.messenger.cd.s(j11, false)));
                    return;
                }
                long j13 = j12 / 1000;
                int i16 = (int) (j13 % 60);
                long j14 = j13 / 60;
                StringBuilder sb2 = new StringBuilder();
                Locale locale = Locale.ENGLISH;
                sb2.append(String.format(locale, "%02d", Integer.valueOf((int) (j14 / 60))));
                sb2.append(String.format(locale, ":%02d", Integer.valueOf((int) (j14 % 60))));
                sb2.append(String.format(locale, ":%02d", Integer.valueOf(i16)));
                String sb3 = sb2.toString();
                b60Var.y = true;
                ew ewVar = b60Var.x;
                org.telegram.messenger.i0.r(ewVar);
                if (b60Var.y) {
                    org.telegram.messenger.i0.h3(ewVar, 500L);
                }
                b60Var.setText(org.telegram.messenger.cd.a0("LinkExpiresInTime", null, 2131748925, sb3));
                return;
            }
            if (i13 == 8) {
                y50 y50Var = (y50) view;
                int i17 = tL_chatInviteExported.usage_limit;
                if (i17 <= 0) {
                    y50Var.a.setVisibility(8);
                    return;
                } else {
                    y50Var.a.setText(org.telegram.messenger.cd.G(i17, "PeopleCanJoinViaLinkCount", new Object[0]));
                    y50Var.a.setVisibility(0);
                    return;
                }
            }
            if (i13 != 9) {
                return;
            }
            z50 z50Var = (z50) view;
            TL_stars.TL_starsSubscriptionPricing tL_starsSubscriptionPricing2 = tL_chatInviteExported.subscription_pricing;
            int i18 = tL_chatInviteExported.usage;
            c60 c60Var2 = z50Var.f;
            TextView textView = z50Var.c;
            TextView textView2 = z50Var.b;
            if (tL_starsSubscriptionPricing2 == null) {
                return;
            }
            int i19 = tL_starsSubscriptionPricing2.period;
            if (i19 == 2592000) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(org.telegram.messenger.cd.a0(null, null, 2131748902, Long.valueOf(tL_starsSubscriptionPricing2.amount)));
                sb4.append(i18 > 0 ? i0.a.i(i18, " x ") : "");
                textView2.setText(rh.h8.Z0(false, sb4.toString(), 0.8f, null));
                if (i18 == 0) {
                    a02 = org.telegram.messenger.cd.L0(2131748202, null);
                } else {
                    org.telegram.messenger.u1 i20 = org.telegram.messenger.u1.i();
                    double d = tL_starsSubscriptionPricing2.amount / 1000.0d;
                    int i21 = c60.e2;
                    a02 = org.telegram.messenger.cd.a0(null, null, 2131748901, i20.f((long) (d * org.telegram.messenger.vp.r1(c60Var2.a).d6 * i18), "USD"));
                }
                textView.setText(a02);
                return;
            }
            String str3 = i19 == 300 ? "5min" : "min";
            StringBuilder sb5 = new StringBuilder();
            Locale locale2 = Locale.US;
            sb5.append(String.format(locale2, "⭐%1$d/%2$s", Long.valueOf(tL_starsSubscriptionPricing2.amount), str3));
            sb5.append(i18 > 0 ? i0.a.i(i18, " x ") : "");
            textView2.setText(rh.h8.Z0(false, sb5.toString(), 0.8f, null));
            if (i18 == 0) {
                format = org.telegram.messenger.cd.L0(2131748202, null);
            } else {
                org.telegram.messenger.u1 i22 = org.telegram.messenger.u1.i();
                double d10 = tL_starsSubscriptionPricing2.amount / 1000.0d;
                int i23 = c60.e2;
                format = String.format(locale2, "you get approximately %1$s %2$s", i22.f((long) (d10 * org.telegram.messenger.vp.r1(c60Var2.a).d6 * i18), "USD"), "for ".concat(str3));
            }
            textView.setText(format);
            return;
        }
        a60 a60Var = (a60) view;
        if (i10 == c60Var.o1) {
            j10 = tL_chatInviteExported.admin_id;
            tL_chatInviteImporter = null;
        } else {
            int i24 = c60Var.t1;
            ArrayList arrayList = c60Var.U1;
            int i25 = c60Var.w1;
            if (i25 != -1 && i10 >= i25) {
                arrayList = c60Var.V1;
                i24 = i25;
            }
            int i26 = c60Var.F1;
            if (i26 != -1 && i10 >= i26) {
                arrayList = c60Var.W1;
                i24 = i26;
            }
            TLRPC.TL_chatInviteImporter tL_chatInviteImporter3 = (TLRPC.TL_chatInviteImporter) arrayList.get(i10 - i24);
            j10 = tL_chatInviteImporter3.user_id;
            tL_chatInviteImporter = tL_chatInviteImporter3;
        }
        TLRPC.User user2 = (TLRPC.User) hashMap.get(Long.valueOf(j10));
        if (chatFull != null && chatFull.participants != null) {
            for (int i27 = 0; i27 < chatFull.participants.participants.size(); i27++) {
                if (chatFull.participants.participants.get(i27).user_id == j10) {
                    chatParticipant = chatFull.participants.participants.get(i27);
                    break;
                }
            }
        }
        chatParticipant = null;
        if (i10 == c60Var.o1) {
            user2 = (TLRPC.User) hashMap.get(Long.valueOf(j10));
            if (user2 == null) {
                user2 = org.telegram.messenger.vp.r1(c60Var.a).Z1(Long.valueOf(tL_chatInviteExported.admin_id));
            }
            if (user2 != null) {
                str = org.telegram.messenger.cd.s(tL_chatInviteExported.date, false);
                user = user2;
                if (i10 != c60Var.o1 && chatParticipant != null) {
                    if (chatParticipant instanceof TLRPC.TL_chatChannelParticipant) {
                        TLRPC.ChannelParticipant channelParticipant = ((TLRPC.TL_chatChannelParticipant) chatParticipant).channelParticipant;
                        str2 = channelParticipant.rank;
                        if (channelParticipant instanceof TLRPC.TL_channelParticipantCreator) {
                            if (TextUtils.isEmpty(str2)) {
                                str2 = org.telegram.messenger.cd.L0(2131752423, "ChannelCreator");
                            }
                            z14 = true;
                            z15 = true;
                        } else if (channelParticipant instanceof TLRPC.TL_channelParticipantAdmin) {
                            if (TextUtils.isEmpty(str2)) {
                                str2 = org.telegram.messenger.cd.L0(2131752520, "ChannelAdmin");
                            }
                            z16 = channelParticipant.promoted_by == org.telegram.messenger.d20.i(c60Var.a).e();
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
                                str4 = org.telegram.messenger.cd.L0(2131752423, "ChannelCreator");
                            }
                            str2 = str4;
                            z10 = true;
                            z11 = true;
                            z12 = false;
                        } else if (chatParticipant instanceof TLRPC.TL_chatParticipantAdmin) {
                            if (TextUtils.isEmpty(str4)) {
                                str4 = org.telegram.messenger.cd.L0(2131752520, "ChannelAdmin");
                            }
                            z12 = chatParticipant.inviter_id == org.telegram.messenger.d20.i(c60Var.a).e();
                            z10 = true;
                            z11 = false;
                            str2 = str4;
                        } else {
                            str2 = str4;
                        }
                    }
                    if (org.telegram.messenger.h20.B(user)) {
                        tL_chatInviteImporter2 = tL_chatInviteImporter;
                        if (org.telegram.messenger.w3.h(org.telegram.messenger.vp.r1(c60Var.a).L0(Long.valueOf(c60Var.X1)))) {
                            z13 = true;
                            a60Var.a(str2, z10, z11, z13, new s50(this, user, str2, z10, z11, z12, 0));
                            a60Var.d(user, null, str, false);
                            if (i10 != c60Var.o1 || (tL_starsSubscriptionPricing = tL_chatInviteExported.subscription_pricing) == null || tL_chatInviteImporter2 == null) {
                                return;
                            }
                            int i28 = tL_chatInviteImporter2.date;
                            TextView textView3 = a60Var.c0;
                            TextView textView4 = a60Var.b0;
                            SpannableStringBuilder Z0 = rh.h8.Z0(false, "⭐️" + tL_starsSubscriptionPricing.amount, 0.7f, null);
                            int i29 = tL_starsSubscriptionPricing.period;
                            String L0 = i29 == 2592000 ? org.telegram.messenger.cd.L0(2131745074, null) : i29 == 300 ? "per 5 minutes" : "per each minute";
                            textView4.setText(Z0);
                            textView3.setText(L0);
                            a60Var.h((int) Math.max(vh.p2.g(Z0, textView4.getPaint()), vh.p2.g(L0, textView3.getPaint())), true);
                            a60Var.c.l(org.telegram.messenger.cd.B(i28), false);
                            return;
                        }
                    } else {
                        tL_chatInviteImporter2 = tL_chatInviteImporter;
                    }
                    z13 = false;
                    a60Var.a(str2, z10, z11, z13, new s50(this, user, str2, z10, z11, z12, 0));
                    a60Var.d(user, null, str, false);
                    if (i10 != c60Var.o1) {
                        return;
                    } else {
                        return;
                    }
                }
                str2 = null;
                z10 = false;
                z11 = false;
                z12 = false;
                if (org.telegram.messenger.h20.B(user)) {
                }
                z13 = false;
                a60Var.a(str2, z10, z11, z13, new s50(this, user, str2, z10, z11, z12, 0));
                a60Var.d(user, null, str, false);
                if (i10 != c60Var.o1) {
                }
            }
        }
        user = user2;
        str = null;
        if (i10 != c60Var.o1) {
        }
        str2 = null;
        z10 = false;
        z11 = false;
        z12 = false;
        if (org.telegram.messenger.h20.B(user)) {
        }
        z13 = false;
        a60Var.a(str2, z10, z11, z13, new s50(this, user, str2, z10, z11, z12, 0));
        a60Var.d(user, null, str, false);
        if (i10 != c60Var.o1) {
        }
    }

    @Override // s4.g0
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        View view;
        View view2;
        Context context = viewGroup.getContext();
        c60 c60Var = this.c;
        switch (i10) {
            case 1:
                view2 = new a60(context);
                break;
            case 2:
                int i11 = org.telegram.ui.ActionBar.t6.a7;
                View c7Var = new org.telegram.ui.Cells.c7(context, org.telegram.ui.ActionBar.t6.x0(null, i11, false), 0);
                org.telegram.ui.ActionBar.a7.i(i11, c7Var, null);
                view = c7Var;
                view2 = view;
                break;
            case 3:
                t50 t50Var = new t50(this, context, c60Var.L1, c60Var, c60Var.Y1);
                t50Var.setDelegate(new w50(this));
                t50Var.setLayoutParams(new s4.o0(-1, -2));
                view2 = t50Var;
                break;
            case 4:
                view2 = new b60(c60Var, context);
                break;
            case 5:
                zz zzVar = new zz(context, null);
                zzVar.setIsSingleCell(true);
                zzVar.setViewType(10);
                zzVar.x = false;
                zzVar.setPaddingLeft(org.telegram.messenger.i0.L(10.0f));
                view = zzVar;
                view2 = view;
                break;
            case 6:
                view2 = new bn(context, 8);
                break;
            case 7:
                view2 = new org.telegram.ui.Cells.c7(context, (org.telegram.ui.Cells.f1) null);
                break;
            case 8:
                y50 y50Var = new y50(context);
                TextView textView = new TextView(context);
                y50Var.a = textView;
                textView.setTextSize(1, 14.0f);
                org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.y6, null);
                textView.setGravity(1);
                y50Var.addView(textView, w7.b6.d(-1, -2.0f, 16, 60.0f, 0.0f, 60.0f, 0.0f));
                view2 = y50Var;
                break;
            case 9:
                view2 = new z50(c60Var, context);
                break;
            default:
                view2 = new org.telegram.ui.Cells.z3(context, c60Var.I0);
                break;
        }
        return sc.e.o(view2, view2, -1, -2);
    }
}
