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

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class s50 extends dk0 {
    public final /* synthetic */ x50 c;

    public s50(x50 x50Var) {
        this.c = x50Var;
    }

    @Override // org.telegram.ui.Components.dk0
    public final boolean D(v4.f1 f1Var) {
        int b10 = f1Var.b();
        x50 x50Var = this.c;
        if (b10 == x50Var.s1) {
            return x50Var.m1.admin_id != org.telegram.messenger.i10.i(x50Var.a).n;
        }
        if (b10 < x50Var.x1 || b10 >= x50Var.y1) {
            return b10 >= x50Var.J1 && b10 < x50Var.K1;
        }
        return true;
    }

    @Override // v4.i0
    public final int b() {
        return this.c.N1;
    }

    @Override // v4.i0
    public final int d(int i7) {
        x50 x50Var = this.c;
        if (i7 == x50Var.r1 || i7 == x50Var.I1 || i7 == x50Var.w1 || i7 == x50Var.p1) {
            return 0;
        }
        if (i7 == x50Var.s1) {
            return 1;
        }
        if (i7 >= x50Var.J1 && i7 < x50Var.K1) {
            return 1;
        }
        if (i7 >= x50Var.x1 && i7 < x50Var.y1) {
            return 1;
        }
        if (i7 == x50Var.t1 || i7 == x50Var.u1) {
            return 2;
        }
        if (i7 == x50Var.C1) {
            return 3;
        }
        if (i7 == x50Var.D1) {
            return 4;
        }
        if (i7 == x50Var.E1) {
            return 5;
        }
        x50Var.getClass();
        if (i7 == 0 || i7 == x50Var.F1 || i7 == x50Var.G1) {
            return 6;
        }
        if (i7 == x50Var.v1) {
            return 7;
        }
        if (i7 == x50Var.H1) {
            return 8;
        }
        return i7 == x50Var.q1 ? 9 : 0;
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
        x50 x50Var = this.c;
        HashMap hashMap = x50Var.n1;
        TLRPC.ChatFull chatFull = x50Var.o1;
        TLRPC.TL_chatInviteExported tL_chatInviteExported = x50Var.m1;
        int i12 = f1Var.f;
        View view = f1Var.a;
        if (i12 == 0) {
            org.telegram.ui.Cells.y3 y3Var = (org.telegram.ui.Cells.y3) view;
            if (i7 == x50Var.r1) {
                y3Var.setText(org.telegram.messenger.gd.N0(2131748725, null));
                y3Var.setRightText(null);
                return;
            }
            if (i7 == x50Var.p1) {
                y3Var.setText(org.telegram.messenger.gd.N0(2131748700, null));
                y3Var.setRightText(null);
                return;
            }
            if (i7 != x50Var.w1) {
                if (i7 == x50Var.z1) {
                    y3Var.setText(org.telegram.messenger.gd.G(tL_chatInviteExported.subscription_expired, "PeopleSubscriptionExpired", new Object[0]));
                    y3Var.setRightText(null);
                    return;
                } else {
                    if (i7 == x50Var.I1) {
                        y3Var.setText(org.telegram.messenger.gd.G(tL_chatInviteExported.requested, "JoinRequests", new Object[0]));
                        y3Var.setRightText(null);
                        return;
                    }
                    return;
                }
            }
            int i13 = tL_chatInviteExported.usage;
            if (i13 > 0) {
                y3Var.setText(org.telegram.messenger.gd.G(i13, "PeopleJoined", new Object[0]));
            } else {
                y3Var.setText(org.telegram.messenger.gd.N0(tL_chatInviteExported.subscription_pricing != null ? 2131747992 : 2131747994, null));
            }
            if (tL_chatInviteExported.expired || tL_chatInviteExported.revoked || (i10 = tL_chatInviteExported.usage_limit) <= 0 || (i11 = tL_chatInviteExported.usage) <= 0) {
                y3Var.setRightText(null);
                return;
            } else {
                y3Var.setRightText(org.telegram.messenger.gd.G(i10 - i11, "PeopleJoinedRemaining", new Object[0]));
                return;
            }
        }
        if (i12 != 1) {
            if (i12 == 3) {
                d80 d80Var = (d80) view;
                d80Var.d(0, null, false);
                d80Var.setLink(tL_chatInviteExported.link);
                d80Var.setRevoke(tL_chatInviteExported.revoked);
                d80Var.setPermanent(tL_chatInviteExported.permanent);
                d80Var.setCanEdit(x50Var.f2);
                d80Var.b(!x50Var.f2);
                return;
            }
            if (i12 == 4) {
                w50 w50Var = (w50) view;
                org.telegram.messenger.g0.r(w50Var.x);
                w50Var.y = false;
                org.telegram.ui.ActionBar.u6.U(w50Var.getTextView(), org.telegram.ui.ActionBar.n6.B6, null);
                w50Var.setFixedSize(0);
                if (tL_chatInviteExported.revoked) {
                    w50Var.setText(org.telegram.messenger.gd.N0(2131748708, null));
                    return;
                }
                if (tL_chatInviteExported.expired) {
                    int i14 = tL_chatInviteExported.usage_limit;
                    if (i14 > 0 && i14 == tL_chatInviteExported.usage) {
                        w50Var.setText(org.telegram.messenger.gd.N0(2131748709, null));
                        return;
                    } else {
                        w50Var.setText(org.telegram.messenger.gd.N0(2131748710, null));
                        org.telegram.ui.ActionBar.u6.U(w50Var.getTextView(), org.telegram.ui.ActionBar.n6.p7, null);
                        return;
                    }
                }
                if (tL_chatInviteExported.expire_date <= 0) {
                    w50Var.setFixedSize(-1);
                    w50Var.setText(null);
                    return;
                }
                long currentTimeMillis = (x50Var.d2 * 1000) + System.currentTimeMillis();
                long j10 = tL_chatInviteExported.expire_date;
                long j11 = (j10 * 1000) - currentTimeMillis;
                if (j11 < 0) {
                    j11 = 0;
                }
                if (j11 > 86400000) {
                    w50Var.setText(org.telegram.messenger.gd.a0("LinkExpiresIn", null, 2131748723, org.telegram.messenger.gd.s(j10, false)));
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
                w50Var.y = true;
                rc rcVar = w50Var.x;
                org.telegram.messenger.g0.r(rcVar);
                if (w50Var.y) {
                    org.telegram.messenger.g0.h3(rcVar, 500L);
                }
                w50Var.setText(org.telegram.messenger.gd.a0("LinkExpiresInTime", null, 2131748722, sb3));
                return;
            }
            if (i12 == 8) {
                t50 t50Var = (t50) view;
                int i16 = tL_chatInviteExported.usage_limit;
                if (i16 <= 0) {
                    t50Var.a.setVisibility(8);
                    return;
                } else {
                    t50Var.a.setText(org.telegram.messenger.gd.G(i16, "PeopleCanJoinViaLinkCount", new Object[0]));
                    t50Var.a.setVisibility(0);
                    return;
                }
            }
            if (i12 != 9) {
                return;
            }
            u50 u50Var = (u50) view;
            TL_stars.TL_starsSubscriptionPricing tL_starsSubscriptionPricing2 = tL_chatInviteExported.subscription_pricing;
            int i17 = tL_chatInviteExported.usage;
            x50 x50Var2 = u50Var.f;
            TextView textView = u50Var.c;
            TextView textView2 = u50Var.b;
            if (tL_starsSubscriptionPricing2 == null) {
                return;
            }
            int i18 = tL_starsSubscriptionPricing2.period;
            if (i18 == 2592000) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(org.telegram.messenger.gd.a0(null, null, 2131748699, Long.valueOf(tL_starsSubscriptionPricing2.amount)));
                sb4.append(i17 > 0 ? i5.c.i(i17, " x ") : "");
                textView2.setText(di.pb.b1(false, sb4.toString(), 0.8f, null));
                if (i17 == 0) {
                    a02 = org.telegram.messenger.gd.N0(2131747992, null);
                } else {
                    org.telegram.messenger.r1 i19 = org.telegram.messenger.r1.i();
                    double d = tL_starsSubscriptionPricing2.amount / 1000.0d;
                    int i20 = x50.i2;
                    a02 = org.telegram.messenger.gd.a0(null, null, 2131748698, i19.f((long) (d * org.telegram.messenger.mp.u1(x50Var2.a).f6 * i17), "USD"));
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
                format = org.telegram.messenger.gd.N0(2131747992, null);
            } else {
                org.telegram.messenger.r1 i21 = org.telegram.messenger.r1.i();
                double d2 = tL_starsSubscriptionPricing2.amount / 1000.0d;
                int i22 = x50.i2;
                format = String.format(locale2, "you get approximately %1$s %2$s", i21.f((long) (d2 * org.telegram.messenger.mp.u1(x50Var2.a).f6 * i17), "USD"), "for ".concat(str3));
            }
            textView.setText(format);
            return;
        }
        v50 v50Var = (v50) view;
        if (i7 == x50Var.s1) {
            j3 = tL_chatInviteExported.admin_id;
            tL_chatInviteImporter = null;
        } else {
            int i23 = x50Var.x1;
            ArrayList arrayList = x50Var.Y1;
            int i24 = x50Var.A1;
            if (i24 != -1 && i7 >= i24) {
                arrayList = x50Var.Z1;
                i23 = i24;
            }
            int i25 = x50Var.J1;
            if (i25 != -1 && i7 >= i25) {
                arrayList = x50Var.a2;
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
        if (i7 == x50Var.s1) {
            user2 = (TLRPC.User) hashMap.get(Long.valueOf(j3));
            if (user2 == null) {
                user2 = org.telegram.messenger.mp.u1(x50Var.a).c2(Long.valueOf(tL_chatInviteExported.admin_id));
            }
            if (user2 != null) {
                str = org.telegram.messenger.gd.s(tL_chatInviteExported.date, false);
                user = user2;
                if (i7 != x50Var.s1 && chatParticipant != null) {
                    if (chatParticipant instanceof TLRPC.TL_chatChannelParticipant) {
                        TLRPC.ChannelParticipant channelParticipant = ((TLRPC.TL_chatChannelParticipant) chatParticipant).channelParticipant;
                        str2 = channelParticipant.rank;
                        if (channelParticipant instanceof TLRPC.TL_channelParticipantCreator) {
                            if (TextUtils.isEmpty(str2)) {
                                str2 = org.telegram.messenger.gd.N0(2131752411, "ChannelCreator");
                            }
                            z14 = true;
                            z15 = true;
                        } else if (channelParticipant instanceof TLRPC.TL_channelParticipantAdmin) {
                            if (TextUtils.isEmpty(str2)) {
                                str2 = org.telegram.messenger.gd.N0(2131752508, "ChannelAdmin");
                            }
                            z16 = channelParticipant.promoted_by == org.telegram.messenger.i10.i(x50Var.a).e();
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
                                str4 = org.telegram.messenger.gd.N0(2131752411, "ChannelCreator");
                            }
                            str2 = str4;
                            z10 = true;
                            z11 = true;
                            z12 = false;
                        } else if (chatParticipant instanceof TLRPC.TL_chatParticipantAdmin) {
                            if (TextUtils.isEmpty(str4)) {
                                str4 = org.telegram.messenger.gd.N0(2131752508, "ChannelAdmin");
                            }
                            z12 = chatParticipant.inviter_id == org.telegram.messenger.i10.i(x50Var.a).e();
                            z10 = true;
                            z11 = false;
                            str2 = str4;
                        } else {
                            str2 = str4;
                        }
                    }
                    if (org.telegram.messenger.n10.C(user)) {
                        tL_chatInviteImporter2 = tL_chatInviteImporter;
                        if (org.telegram.messenger.v3.h(org.telegram.messenger.mp.u1(x50Var.a).O0(Long.valueOf(x50Var.b2)))) {
                            z13 = true;
                            v50Var.a(str2, z10, z11, z13, new n50(this, user, str2, z10, z11, z12, 0));
                            v50Var.d(user, null, str, false);
                            if (i7 != x50Var.s1 || (tL_starsSubscriptionPricing = tL_chatInviteExported.subscription_pricing) == null || tL_chatInviteImporter2 == null) {
                                return;
                            }
                            int i27 = tL_chatInviteImporter2.date;
                            TextView textView3 = v50Var.d0;
                            TextView textView4 = v50Var.c0;
                            SpannableStringBuilder b12 = di.pb.b1(false, "⭐️" + tL_starsSubscriptionPricing.amount, 0.7f, null);
                            int i28 = tL_starsSubscriptionPricing.period;
                            String N0 = i28 == 2592000 ? org.telegram.messenger.gd.N0(2131744815, null) : i28 == 300 ? "per 5 minutes" : "per each minute";
                            textView4.setText(b12);
                            textView3.setText(N0);
                            v50Var.h((int) Math.max(hi.u3.h(b12, textView4.getPaint()), hi.u3.h(N0, textView3.getPaint())), true);
                            v50Var.c.l(org.telegram.messenger.gd.B(i27), false);
                            return;
                        }
                    } else {
                        tL_chatInviteImporter2 = tL_chatInviteImporter;
                    }
                    z13 = false;
                    v50Var.a(str2, z10, z11, z13, new n50(this, user, str2, z10, z11, z12, 0));
                    v50Var.d(user, null, str, false);
                    if (i7 != x50Var.s1) {
                        return;
                    } else {
                        return;
                    }
                }
                str2 = null;
                z10 = false;
                z11 = false;
                z12 = false;
                if (org.telegram.messenger.n10.C(user)) {
                }
                z13 = false;
                v50Var.a(str2, z10, z11, z13, new n50(this, user, str2, z10, z11, z12, 0));
                v50Var.d(user, null, str, false);
                if (i7 != x50Var.s1) {
                }
            }
        }
        user = user2;
        str = null;
        if (i7 != x50Var.s1) {
        }
        str2 = null;
        z10 = false;
        z11 = false;
        z12 = false;
        if (org.telegram.messenger.n10.C(user)) {
        }
        z13 = false;
        v50Var.a(str2, z10, z11, z13, new n50(this, user, str2, z10, z11, z12, 0));
        v50Var.d(user, null, str, false);
        if (i7 != x50Var.s1) {
        }
    }

    @Override // v4.i0
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        View view;
        View view2;
        Context context = viewGroup.getContext();
        x50 x50Var = this.c;
        switch (i7) {
            case 1:
                view2 = new v50(context);
                break;
            case 2:
                int i10 = org.telegram.ui.ActionBar.n6.a7;
                View y6Var = new org.telegram.ui.Cells.y6(context, org.telegram.ui.ActionBar.n6.x0(null, i10, false), 0);
                org.telegram.ui.ActionBar.u6.h(i10, y6Var, null);
                view = y6Var;
                view2 = view;
                break;
            case 3:
                o50 o50Var = new o50(this, context, x50Var.P1, x50Var, x50Var.c2);
                o50Var.setDelegate(new r50(this));
                o50Var.setLayoutParams(new v4.q0(-1, -2));
                view2 = o50Var;
                break;
            case 4:
                view2 = new w50(x50Var, context);
                break;
            case 5:
                vz vzVar = new vz(context, null);
                vzVar.setIsSingleCell(true);
                vzVar.setViewType(10);
                vzVar.x = false;
                vzVar.setPaddingLeft(org.telegram.messenger.g0.L(10.0f));
                view = vzVar;
                view2 = view;
                break;
            case 6:
                view2 = new in(context, 11);
                break;
            case 7:
                view2 = new org.telegram.ui.Cells.y6(context, (org.telegram.ui.Cells.c0) null);
                break;
            case 8:
                t50 t50Var = new t50(context);
                TextView textView = new TextView(context);
                t50Var.a = textView;
                textView.setTextSize(1, 14.0f);
                org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.y6, null);
                textView.setGravity(1);
                t50Var.addView(textView, c8.na.d(-1, -2.0f, 16, 60.0f, 0.0f, 60.0f, 0.0f));
                view2 = t50Var;
                break;
            case 9:
                view2 = new u50(x50Var, context);
                break;
            default:
                view2 = new org.telegram.ui.Cells.y3(context, x50Var.J0);
                break;
        }
        return i5.c.q(view2, view2, -1, -2);
    }
}
