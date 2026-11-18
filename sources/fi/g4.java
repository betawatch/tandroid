package fi;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Paint;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import c8.ma;
import di.xa;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.bp;
import org.telegram.messenger.cp;
import org.telegram.messenger.fj;
import org.telegram.messenger.gd;
import org.telegram.messenger.j10;
import org.telegram.messenger.ks;
import org.telegram.messenger.mp;
import org.telegram.messenger.ni;
import org.telegram.messenger.o10;
import org.telegram.messenger.s00;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.PollVotesAlert$UserCell;
import org.telegram.ui.Components.ap0;
import org.telegram.ui.Components.b11;
import org.telegram.ui.Components.bh;
import org.telegram.ui.Components.c70;
import org.telegram.ui.Components.cf0;
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Components.df0;
import org.telegram.ui.Components.f11;
import org.telegram.ui.Components.g70;
import org.telegram.ui.Components.gj;
import org.telegram.ui.Components.j01;
import org.telegram.ui.Components.jl;
import org.telegram.ui.Components.k31;
import org.telegram.ui.Components.ki;
import org.telegram.ui.Components.kl;
import org.telegram.ui.Components.kp;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.lc;
import org.telegram.ui.Components.ld0;
import org.telegram.ui.Components.li;
import org.telegram.ui.Components.lk;
import org.telegram.ui.Components.mi;
import org.telegram.ui.Components.nj;
import org.telegram.ui.Components.oj0;
import org.telegram.ui.Components.pj;
import org.telegram.ui.Components.q90;
import org.telegram.ui.Components.rn;
import org.telegram.ui.Components.s41;
import org.telegram.ui.Components.sb0;
import org.telegram.ui.Components.si;
import org.telegram.ui.Components.sj;
import org.telegram.ui.Components.sn;
import org.telegram.ui.Components.t90;
import org.telegram.ui.Components.th;
import org.telegram.ui.Components.tj;
import org.telegram.ui.Components.x50;
import org.telegram.ui.Components.xk;
import org.telegram.ui.Components.z11;
import org.telegram.ui.Components.z41;
import org.telegram.ui.Components.ze0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PrivacySettingsActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.UsersSelectActivity;
import org.telegram.ui.bn;
import org.telegram.ui.dc;
import org.telegram.ui.ek;
import org.telegram.ui.f61;
import org.telegram.ui.gf0;
import org.telegram.ui.hc;
import org.telegram.ui.k90;
import org.telegram.ui.kx;
import org.telegram.ui.nb0;
import org.telegram.ui.nf0;
import org.telegram.ui.np;
import org.telegram.ui.qc;
import org.telegram.ui.se0;
import org.telegram.ui.xt;
import org.telegram.ui.y00;
import org.telegram.ui.yh0;
import org.telegram.ui.z40;
import org.telegram.ui.zc1;
import org.webrtc.MediaStreamTrack;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes4.dex */
public final /* synthetic */ class g4 implements oj0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ g4(int i7, Object obj, Object obj2) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ca A[EDGE_INSN: B:32:0x00ca->B:33:0x00ca BREAK  A[LOOP:0: B:24:0x00aa->B:30:0x00c5], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00fa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void a(int i7, View view) {
        String str;
        int i10;
        int i11;
        boolean z10;
        int i12;
        ap0 ap0Var;
        xt xtVar = (xt) this.b;
        org.telegram.ui.ActionBar.h2 h2Var = (org.telegram.ui.ActionBar.h2) this.c;
        kp kpVar = (kp) xtVar.c.d.get(i7);
        org.telegram.ui.ActionBar.m6 i13 = kpVar.a.i(xtVar.r);
        ig.b bVar = kpVar.a.c;
        String str2 = null;
        if (bVar == null) {
            str = null;
        } else {
            str = bVar.b;
            if (str == null) {
                str = bVar.a;
            }
        }
        if (!str.equals("🏠")) {
            ig.b bVar2 = kpVar.a.c;
            if (bVar2 != null && (str2 = bVar2.b) == null) {
                str2 = bVar2.a;
            }
            if (!str2.equals("🎨")) {
                i10 = -1;
                if (i13 == null) {
                    TLRPC.TL_theme tL_theme = ((org.telegram.ui.ActionBar.s3) kpVar.a.f.get(xtVar.r)).b;
                    org.telegram.ui.ActionBar.m6 Q0 = org.telegram.ui.ActionBar.n6.Q0(org.telegram.ui.ActionBar.n6.r0(tL_theme.settings.get(((org.telegram.ui.ActionBar.s3) kpVar.a.f.get(xtVar.r)).d)));
                    if (Q0 != null) {
                        org.telegram.ui.ActionBar.k6 k6Var = (org.telegram.ui.ActionBar.k6) Q0.d0.get(tL_theme.id);
                        if (k6Var == null) {
                            k6Var = Q0.f(tL_theme, h2Var.getCurrentAccount(), 0);
                        }
                        i10 = k6Var.a;
                        Q0.u(i10);
                    }
                    i13 = Q0;
                }
                org.telegram.ui.ActionBar.n6.K1(i13, false, i10, view);
                xtVar.h = i7;
                i11 = 0;
                while (true) {
                    z10 = true;
                    if (i11 < xtVar.c.d.size()) {
                        break;
                    }
                    kp kpVar2 = (kp) xtVar.c.d.get(i11);
                    if (i11 != xtVar.h) {
                        z10 = false;
                    }
                    kpVar2.d = z10;
                    i11++;
                }
                xtVar.c.E(xtVar.h);
                for (i12 = 0; i12 < xtVar.a.getChildCount(); i12++) {
                    j01 j01Var = (j01) xtVar.a.getChildAt(i12);
                    if (j01Var != view && (ap0Var = j01Var.K) != null) {
                        org.telegram.messenger.g0.r(ap0Var);
                        j01Var.K.run();
                    }
                }
                ((j01) view).d();
                if (i13 != null) {
                    SharedPreferences.Editor edit = org.telegram.messenger.t0.b.getSharedPreferences("themeconfig", 0).edit();
                    edit.putString((xtVar.n == 1 || i13.q()) ? "lastDarkTheme" : "lastDayTheme", i13.m());
                    edit.commit();
                }
                org.telegram.ui.ActionBar.n6.M1(h2Var);
            }
        }
        i10 = ((org.telegram.ui.ActionBar.s3) kpVar.a.f.get(xtVar.r)).e;
        if (i13 == null) {
        }
        org.telegram.ui.ActionBar.n6.K1(i13, false, i10, view);
        xtVar.h = i7;
        i11 = 0;
        while (true) {
            z10 = true;
            if (i11 < xtVar.c.d.size()) {
            }
            kpVar2.d = z10;
            i11++;
        }
        xtVar.c.E(xtVar.h);
        while (i12 < xtVar.a.getChildCount()) {
        }
        ((j01) view).d();
        if (i13 != null) {
        }
        org.telegram.ui.ActionBar.n6.M1(h2Var);
    }

    private final void b(int i7, View view) {
        gf0 gf0Var = (gf0) this.b;
        Context context = (Context) this.c;
        HashMap hashMap = gf0Var.l0;
        if (i7 == gf0Var.R) {
            TLRPC.User user = (TLRPC.User) hashMap.get(Long.valueOf(gf0Var.e.admin_id));
            if (user != null) {
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", user.id);
                mp.u1(j10.t0).e4(user, false, false);
                gf0Var.presentFragment(new ProfileActivity(bundle, null));
                return;
            }
            return;
        }
        if (i7 == gf0Var.y) {
            k90 k90Var = new k90(0, gf0Var.n);
            k90Var.T = gf0Var.t0;
            gf0Var.presentFragment(k90Var);
            return;
        }
        int i10 = gf0Var.E;
        if (i7 >= i10 && i7 < gf0Var.F) {
            x50 x50Var = new x50(context, (TLRPC.TL_chatInviteExported) gf0Var.j0.get(i7 - i10), gf0Var.d, hashMap, gf0Var, gf0Var.n, false, gf0Var.h);
            gf0Var.m0 = x50Var;
            x50Var.f2 = gf0Var.q0;
            x50Var.show();
            return;
        }
        int i11 = gf0Var.I;
        if (i7 >= i11 && i7 < gf0Var.J) {
            x50 x50Var2 = new x50(context, (TLRPC.TL_chatInviteExported) gf0Var.k0.get(i7 - i11), gf0Var.d, hashMap, gf0Var, gf0Var.n, false, gf0Var.h);
            gf0Var.m0 = x50Var2;
            x50Var2.show();
            return;
        }
        if (i7 == gf0Var.O) {
            if (gf0Var.d0) {
                return;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(gf0Var.getParentActivity());
            String M0 = gd.M0(2131751564, null);
            org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
            u1Var.S = M0;
            u1Var.U = gd.M0(2131751565, null);
            alertDialog$Builder.k(gd.M0(2131751587, null), new se0(gf0Var));
            alertDialog$Builder.h(gd.M0(2131752578, null), null);
            gf0Var.showDialog(u1Var);
            return;
        }
        int i12 = gf0Var.V;
        if (i7 < i12 || i7 >= gf0Var.W) {
            return;
        }
        TLRPC.TL_chatAdminWithInvites tL_chatAdminWithInvites = (TLRPC.TL_chatAdminWithInvites) gf0Var.n0.get(i7 - i12);
        if (hashMap.containsKey(Long.valueOf(tL_chatAdminWithInvites.admin_id))) {
            gf0Var.getMessagesController().e4((TLRPC.User) hashMap.get(Long.valueOf(tL_chatAdminWithInvites.admin_id)), false, false);
        }
        gf0 gf0Var2 = new gf0(gf0Var.n, tL_chatAdminWithInvites.invites_count, tL_chatAdminWithInvites.admin_id);
        gf0Var2.m0(gf0Var.d, null);
        gf0Var.presentFragment(gf0Var2);
    }

    private final void d(int i7, View view) {
        org.telegram.ui.Components.e4 e4Var;
        sg.h0 h0Var;
        wg.a0 a0Var = (wg.a0) this.b;
        org.telegram.ui.ActionBar.h2 h2Var = (org.telegram.ui.ActionBar.h2) this.c;
        ArrayList arrayList = a0Var.Z1;
        wg.t tVar = a0Var.u2;
        if (view instanceof yg.y) {
            yg.y yVar = (yg.y) view;
            int type = yVar.getType();
            boolean z10 = yVar.e.h;
            boolean z11 = !z10;
            yVar.setChecked(z11);
            int i10 = yg.y.M;
            if (type == 0) {
                a0Var.t2 = z11;
                a0Var.l1(false, false);
            } else if (type == 1) {
                yVar.setDivider(z11);
                a0Var.s2 = z11;
                a0Var.l1(false, false);
                xg.b bVar = a0Var.c2;
                int i11 = 0;
                while (true) {
                    if (i11 >= bVar.e.size()) {
                        break;
                    }
                    xg.a aVar = (xg.a) bVar.e.get(i11);
                    if (aVar.a == 15) {
                        int i12 = aVar.l;
                        int i13 = yg.y.M;
                        if (i12 == 1) {
                            if (z10) {
                                bVar.s(i11 + 1);
                            } else {
                                bVar.i(i11 + 1);
                            }
                        }
                    }
                    i11++;
                }
                a0Var.c2.G();
                if (a0Var.s2) {
                    org.telegram.messenger.g0.r(tVar);
                } else {
                    org.telegram.messenger.g0.h3(tVar, 250L);
                }
            }
        }
        if (view instanceof yg.c) {
            if (view instanceof yg.d) {
                int selectedType = ((yg.d) view).getSelectedType();
                int i14 = yg.d.w;
                if (selectedType == 2 || selectedType == 3) {
                    if (selectedType == 2 && a0Var.d2 == selectedType) {
                        sg.h0 h0Var2 = a0Var.n2;
                        if (h0Var2 != null) {
                            ((wg.w0) h0Var2.b).i1(1, arrayList);
                            ((wg.l) h0Var2.c).m1.A(1);
                            return;
                        }
                        return;
                    }
                    a0Var.d2 = selectedType;
                    a0Var.l1(true, true);
                    a0Var.k1(true);
                    a0Var.c1();
                } else if (selectedType == 1) {
                    sg.h0 h0Var3 = a0Var.n2;
                    if (h0Var3 != null) {
                        ((wg.w0) h0Var3.b).i1(1, arrayList);
                        ((wg.l) h0Var3.c).m1.A(1);
                    }
                } else {
                    a0Var.e2 = selectedType;
                    a0Var.l1(true, true);
                    a0Var.k1(true);
                    a0Var.c1();
                }
            } else {
                yg.c cVar = (yg.c) view;
                ck0 ck0Var = a0Var.o1;
                if (cVar.b()) {
                    for (int i15 = 0; i15 < ck0Var.getChildCount(); i15++) {
                        View childAt = ck0Var.getChildAt(i15);
                        if (childAt.getClass().isInstance(cVar)) {
                            ((yg.c) childAt).c(childAt == cVar, true);
                        }
                    }
                }
            }
        }
        if (view instanceof yg.u) {
            int selectedType2 = ((yg.u) view).getSelectedType();
            if (a0Var.f2 == selectedType2 && (h0Var = a0Var.n2) != null) {
                ((wg.w0) h0Var.b).i1(3, a0Var.a2);
                ((wg.l) h0Var.c).m1.A(1);
            }
            a0Var.f2 = selectedType2;
            a0Var.l1(false, false);
            return;
        }
        if (view instanceof yg.i) {
            a0Var.h2 = ((TLRPC.TL_premiumGiftCodeOption) ((yg.i) view).getGifCode()).months;
            a0Var.l1(false, false);
            a0Var.c2.G();
            return;
        }
        if (!(view instanceof yg.h)) {
            if (view instanceof yg.b) {
                sg.h0 h0Var4 = a0Var.n2;
                if (h0Var4 != null) {
                    ((wg.w0) h0Var4.b).i1(2, a0Var.Y1);
                    ((wg.l) h0Var4.c).m1.A(1);
                    return;
                }
                return;
            }
            if (!(view instanceof yg.w)) {
                if (view instanceof xa) {
                    a0Var.g2 = true;
                    a0Var.l1(true, true);
                    return;
                }
                return;
            }
            TL_stars.TL_starsGiveawayOption option = ((yg.w) view).getOption();
            if (option != null) {
                a0Var.l2 = option.stars;
                a0Var.l1(true, true);
                a0Var.k1(true);
                a0Var.c1();
                return;
            }
            return;
        }
        Context context = h2Var.getContext();
        long j3 = a0Var.i2;
        wg.u uVar = new wg.u(a0Var);
        org.telegram.ui.ActionBar.i6 i6Var = a0Var.J0;
        org.telegram.ui.Components.y4 y4Var = new org.telegram.ui.Components.y4(i6Var);
        hi.w4 w4Var = new hi.w4(context, i6Var);
        ((org.telegram.ui.ActionBar.x2) w4Var.b).w0 = false;
        sb0 sb0Var = new sb0(context, i6Var);
        int i16 = y4Var.a;
        sb0Var.setTextColor(i16);
        sb0Var.setTextOffset(org.telegram.messenger.g0.L(10.0f));
        sb0Var.setItemCount(5);
        wg.f fVar = new wg.f(context, i6Var);
        fVar.setWrapSelectorWheel(true);
        fVar.setAllItemsCount(24);
        fVar.setItemCount(5);
        fVar.setTextColor(i16);
        fVar.setTextOffset(-org.telegram.messenger.g0.L(10.0f));
        fVar.setTag("HOUR");
        wg.g gVar = new wg.g(context, i6Var);
        gVar.setWrapSelectorWheel(true);
        gVar.setAllItemsCount(60);
        gVar.setItemCount(5);
        gVar.setTextColor(i16);
        gVar.setTextOffset(-org.telegram.messenger.g0.L(34.0f));
        org.telegram.ui.Components.e4 e4Var2 = new org.telegram.ui.Components.e4(context, y4Var, sb0Var, fVar, gVar);
        e4Var2.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        e4Var2.addView(frameLayout, ma.t(-1, -2, 51, 22, 0, 0, 4));
        TextView textView = new TextView(context);
        textView.setText(gd.M0(2131753285, "BoostingSelectDateTime"));
        textView.setTextColor(i16);
        i5.c.x(textView, 1, 20.0f);
        frameLayout.addView(textView, ma.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
        textView.setOnTouchListener(new gi.a(2));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setWeightSum(1.0f);
        e4Var2.addView(linearLayout, ma.q(-1, -2, 1.0f, 0, 0, 12, 0, 12));
        long currentTimeMillis = System.currentTimeMillis();
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(currentTimeMillis);
        int i17 = calendar.get(1);
        nb0 nb0Var = new nb0(context, 5);
        long j10 = mp.u1(j10.t0).p0 * 1000;
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTimeInMillis(j10);
        int i18 = calendar2.get(6);
        calendar2.setTimeInMillis(System.currentTimeMillis());
        calendar2.add(14, (int) j10);
        int i19 = calendar2.get(11);
        int i20 = calendar.get(12);
        linearLayout.addView(sb0Var, ma.l(0.5f, 0, ks.t4));
        sb0Var.setMinValue(0);
        sb0Var.setMaxValue(i18 - 1);
        sb0Var.setWrapSelectorWheel(false);
        sb0Var.setTag("DAY");
        sb0Var.setFormatter(new y00(currentTimeMillis, calendar, i17, 1));
        ki.w3 w3Var = new ki.w3(e4Var2, fVar, gVar, i19, i20, sb0Var);
        sb0Var.setOnValueChangedListener(w3Var);
        fVar.setMinValue(0);
        fVar.setMaxValue(23);
        linearLayout.addView(fVar, ma.l(0.2f, 0, ks.t4));
        fVar.setFormatter(new ug.x(18));
        fVar.setOnValueChangedListener(w3Var);
        gVar.setMinValue(0);
        gVar.setMaxValue(11);
        gVar.setValue(0);
        gVar.setFormatter(new ug.x(19));
        linearLayout.addView(gVar, ma.l(0.3f, 0, ks.t4));
        gVar.setOnValueChangedListener(w3Var);
        if (j3 > 0) {
            e4Var = e4Var2;
            calendar.setTimeInMillis(System.currentTimeMillis());
            calendar.set(12, 0);
            calendar.set(13, 0);
            calendar.set(14, 0);
            calendar.set(11, 0);
            int timeInMillis = (int) ((j3 - calendar.getTimeInMillis()) / 86400000);
            calendar.setTimeInMillis(j3);
            gVar.setValue(calendar.get(12) / 5);
            fVar.setValue(calendar.get(11));
            sb0Var.setValue(timeInMillis);
            sb0Var.getValue();
            w3Var.n(sb0Var, sb0Var.getValue());
            fVar.getValue();
            w3Var.n(fVar, fVar.getValue());
        } else {
            e4Var = e4Var2;
        }
        nb0Var.setPadding(org.telegram.messenger.g0.L(34.0f), 0, org.telegram.messenger.g0.L(34.0f), 0);
        nb0Var.setGravity(17);
        nb0Var.setTextColor(y4Var.g);
        nb0Var.setTextSize(1, 14.0f);
        nb0Var.setTypeface(org.telegram.messenger.g0.o());
        nb0Var.setBackground(org.telegram.ui.ActionBar.b6.e(y4Var.h, 8.0f));
        nb0Var.setText(gd.M0(2131753541, "BoostingConfirm"));
        e4Var.addView(nb0Var, ma.t(-1, 48, 83, 16, 15, 16, 16));
        nb0Var.setOnClickListener(new org.telegram.ui.Components.v1(calendar, sb0Var, fVar, gVar, uVar, w4Var));
        org.telegram.ui.ActionBar.x2 x2Var = (org.telegram.ui.ActionBar.x2) w4Var.b;
        x2Var.O = e4Var;
        x2Var.show();
        int i21 = y4Var.b;
        x2Var.v0(i21);
        x2Var.P(i21);
        org.telegram.messenger.g0.p3(x2Var, i0.a.h(i21) > 0.699999988079071d);
    }

    /* JADX WARN: Removed duplicated region for block: B:170:0x041e  */
    /* JADX WARN: Removed duplicated region for block: B:506:0x09a5  */
    /* JADX WARN: Removed duplicated region for block: B:508:0x09b9  */
    @Override // org.telegram.ui.Components.oj0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(int i7, View view) {
        int i10;
        ArrayList arrayList;
        TL_stories.TL_storyReactionPublicRepost tL_storyReactionPublicRepost;
        TL_stories.StoryItem storyItem;
        l41 G;
        int i11;
        si siVar;
        Object O;
        org.telegram.messenger.f5 f5Var;
        String str;
        String str2;
        String str3;
        String str4;
        boolean z10;
        q90 q90Var;
        Paint.FontMetricsInt fontMetricsInt;
        int i12 = this.a;
        int i13 = 13;
        int i14 = 7;
        int i15 = -1;
        int i16 = 0;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i12) {
            case 0:
                a5 a5Var = (a5) obj2;
                f9 f9Var = (f9) obj;
                org.telegram.ui.ActionBar.h2 h2Var = f9Var.f;
                w4 w4Var = a5Var.x;
                h4 h4Var = a5Var.r;
                if (i7 >= 0 && i7 < w4Var.c.size()) {
                    r4 r4Var = (r4) w4Var.c.get(i7);
                    TL_stories.StoryView storyView = r4Var.b;
                    TL_stories.StoryReaction storyReaction = r4Var.c;
                    if (storyView instanceof TL_stories.TL_storyView) {
                        f9Var.N(ProfileActivity.D4(storyView.user_id));
                        break;
                    } else if (storyView instanceof TL_stories.TL_storyViewPublicRepost) {
                        h2Var.createOverlayStoryViewer().L(a5Var.getContext(), ((TL_stories.TL_storyViewPublicRepost) r4Var.b).story, y6.a(h4Var));
                        break;
                    } else if (storyReaction instanceof TL_stories.TL_storyReaction) {
                        f9Var.N(ProfileActivity.D4(org.telegram.messenger.n5.o(storyReaction.peer_id)));
                        break;
                    } else if (storyReaction instanceof TL_stories.TL_storyReactionPublicRepost) {
                        ArrayList arrayList2 = new ArrayList();
                        z4 z4Var = a5Var.F;
                        if (z4Var == null || (arrayList = z4Var.i) == null) {
                            i10 = 0;
                        } else {
                            i10 = arrayList.size();
                            for (int i17 = 0; i17 < a5Var.F.i.size(); i17++) {
                                TL_stories.StoryReaction storyReaction2 = (TL_stories.StoryReaction) a5Var.F.i.get(i17);
                                if ((storyReaction2 instanceof TL_stories.TL_storyReactionPublicRepost) && (storyItem = (tL_storyReactionPublicRepost = (TL_stories.TL_storyReactionPublicRepost) storyReaction2).story) != null) {
                                    storyItem.dialogId = org.telegram.messenger.n5.o(tL_storyReactionPublicRepost.peer_id);
                                    if (storyReaction2 == storyReaction) {
                                        i15 = arrayList2.size();
                                    }
                                    arrayList2.add(storyItem);
                                }
                            }
                        }
                        int i18 = i15;
                        if (i18 < 0 || arrayList2.size() <= 1) {
                            a5Var.H = null;
                            h2Var.createOverlayStoryViewer().L(a5Var.getContext(), ((TL_stories.TL_storyReactionPublicRepost) storyReaction).story, y6.a(h4Var));
                            break;
                        } else {
                            a5Var.H = new k6(a5Var.w, arrayList2);
                            a5Var.I = i10;
                            z4 z4Var2 = a5Var.F;
                            f9 createOverlayStoryViewer = h2Var.createOverlayStoryViewer();
                            Context context = a5Var.getContext();
                            k6 k6Var = a5Var.H;
                            y6 a10 = y6.a(h4Var);
                            a10.e = new di.c7(z4Var2, i14);
                            createOverlayStoryViewer.I(context, i18, k6Var, a10);
                            break;
                        }
                    } else {
                        boolean z11 = storyReaction instanceof TL_stories.TL_storyReactionPublicForward;
                        if (z11 || (storyView instanceof TL_stories.TL_storyViewPublicForward)) {
                            TLRPC.Message message = z11 ? storyReaction.message : storyView.message;
                            Bundle bundle = new Bundle();
                            long o4 = org.telegram.messenger.n5.o(message.peer_id);
                            if (o4 >= 0) {
                                bundle.putLong("user_id", o4);
                            } else {
                                bundle.putLong("chat_id", -o4);
                            }
                            bundle.putInt("message_id", message.id);
                            f9Var.N(new bn(bundle));
                            break;
                        }
                    }
                }
                break;
            case 1:
                gi.p pVar = (gi.p) obj2;
                ai.g0 g0Var = (ai.g0) obj;
                z41 z41Var = pVar.V1;
                if (z41Var != null && (G = z41Var.G(i7 - 1)) != null) {
                    Object obj3 = G.H;
                    if (obj3 instanceof s00) {
                        g0Var.a(((s00) obj3).a);
                        pVar.dismiss();
                        break;
                    }
                }
                break;
            case 2:
                ki.i3.C0((ki.i3) obj2, (Context) obj, i7);
                break;
            case 3:
                org.telegram.ui.t5.A0((org.telegram.ui.t5) obj2, (Context) obj, view, i7);
                break;
            case 4:
                qc.b0((qc) obj2, (TLRPC.ChatFull) obj, view, i7);
                break;
            case 5:
                hc hcVar = (hc) obj;
                qc qcVar = ((dc) obj2).c;
                int i19 = hcVar.d;
                f61 f61Var = hcVar.b;
                cp cpVar = mp.u1(i19).t4;
                if (cpVar != null) {
                    ArrayList arrayList3 = cpVar.c;
                    if (i7 >= 0 && i7 < arrayList3.size()) {
                        i11 = ((bp) arrayList3.get(i7)).c;
                        qcVar.f = i11;
                        qcVar.e1(true);
                        qcVar.h1(true);
                        qcVar.i1();
                        if (view.getLeft() >= org.telegram.messenger.g0.L(24.0f) + f61Var.getPaddingLeft()) {
                            f61Var.w0(-((org.telegram.messenger.g0.L(48.0f) + f61Var.getPaddingLeft()) - view.getLeft()), 0, null);
                            break;
                        } else if (view.getWidth() + view.getLeft() > (f61Var.getMeasuredWidth() - f61Var.getPaddingRight()) - org.telegram.messenger.g0.L(24.0f)) {
                            f61Var.w0(org.telegram.messenger.f3.B(48.0f, f61Var.getMeasuredWidth() - f61Var.getPaddingRight(), view.getWidth() + view.getLeft()), 0, null);
                            break;
                        }
                    }
                }
                i11 = 0;
                qcVar.f = i11;
                qcVar.e1(true);
                qcVar.h1(true);
                qcVar.i1();
                if (view.getLeft() >= org.telegram.messenger.g0.L(24.0f) + f61Var.getPaddingLeft()) {
                }
                break;
            case 6:
                bn bnVar = (bn) obj2;
                bnVar.getClass();
                TLObject tLObject = (TLObject) ((nf0) obj).c.get(i7);
                if (tLObject != null) {
                    bnVar.P7(true);
                    Bundle bundle2 = new Bundle();
                    if (tLObject instanceof TLRPC.User) {
                        bundle2.putLong("user_id", ((TLRPC.User) tLObject).id);
                    } else if (tLObject instanceof TLRPC.Chat) {
                        bundle2.putLong("chat_id", ((TLRPC.Chat) tLObject).id);
                    }
                    bnVar.presentFragment(new ProfileActivity(bundle2, null));
                    break;
                }
                break;
            case 7:
                np.c0((np) obj2, (Context) obj, view, i7);
                break;
            case 8:
                org.telegram.ui.Components.h0 h0Var = (org.telegram.ui.Components.h0) obj2;
                org.telegram.ui.ActionBar.i6 i6Var = (org.telegram.ui.ActionBar.i6) obj;
                l41 G2 = h0Var.j2.G(i7 - 1);
                if (G2 != null && G2.d == 1) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, h0Var.getContext(), i6Var);
                    String M0 = gd.M0(2131754998, null);
                    org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
                    u1Var.S = M0;
                    u1Var.U = gd.M0(2131754997, null);
                    alertDialog$Builder.h(gd.M0(2131752578, null), null);
                    alertDialog$Builder.k(gd.M0(2131751587, null), new org.telegram.ui.Components.b0(h0Var, 0));
                    alertDialog$Builder.d(-1);
                    alertDialog$Builder.p();
                    break;
                }
                break;
            case 9:
                si siVar2 = (si) obj2;
                org.telegram.ui.ActionBar.i6 i6Var2 = (org.telegram.ui.ActionBar.i6) obj;
                th thVar = siVar2.w3;
                ki[] kiVarArr = siVar2.u2;
                org.telegram.ui.ActionBar.h2 h2Var2 = siVar2.a2;
                org.telegram.ui.ActionBar.h2 Q = h2Var2 == null ? LaunchActivity.Q() : h2Var2;
                if (Q != null && Q.getParentActivity() != null) {
                    if (view instanceof mi) {
                        Activity parentActivity = Q.getParentActivity();
                        int intValue = view.getTag() instanceof Integer ? ((Integer) view.getTag()).intValue() : -1;
                        if (intValue == 1) {
                            if (siVar2.J3 || siVar2.K3 || !siVar2.O0()) {
                                if (!siVar2.J3 && !siVar2.K3) {
                                    sn snVar = new sn(1, siVar2.getContext(), i6Var2, siVar2);
                                    siVar2.O1 = snVar;
                                    siVar2.G1(snVar);
                                }
                                siVar2.G1(siVar2.e2);
                            }
                        } else if (intValue == 17) {
                            if (siVar2.r2 == null && (h2Var2 instanceof bn)) {
                                TLRPC.User j3 = ((bn) h2Var2).j();
                                if (si.h1(j3)) {
                                    xk xkVar = new xk(siVar2, siVar2.getContext(), siVar2.H3, j3, i6Var2);
                                    siVar2 = siVar2;
                                    siVar2.r2 = xkVar;
                                    kiVarArr[11] = xkVar;
                                }
                            }
                            xk xkVar2 = siVar2.r2;
                            if (xkVar2 != null) {
                                siVar2.G1(xkVar2);
                            }
                        } else if (intValue == 3) {
                            if (siVar2.L3 || !siVar2.O0()) {
                                if (Build.VERSION.SDK_INT >= 33) {
                                    if (parentActivity.checkSelfPermission("android.permission.READ_MEDIA_AUDIO") != 0) {
                                        parentActivity.requestPermissions(new String[]{"android.permission.READ_MEDIA_AUDIO"}, 4);
                                        break;
                                    }
                                } else if (parentActivity.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") != 0) {
                                    org.telegram.messenger.g0.W(siVar2.getContext()).requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 4);
                                    break;
                                }
                                siVar2.q1(true);
                            }
                        } else if (intValue == 4) {
                            if (siVar2.I3 || !siVar2.O0()) {
                                if (Build.VERSION.SDK_INT >= 33) {
                                    if (parentActivity.checkSelfPermission("android.permission.READ_MEDIA_IMAGES") != 0 || parentActivity.checkSelfPermission("android.permission.READ_MEDIA_VIDEO") != 0) {
                                        parentActivity.requestPermissions(new String[]{"android.permission.READ_MEDIA_IMAGES", "android.permission.READ_MEDIA_VIDEO"}, 4);
                                        break;
                                    }
                                } else if (parentActivity.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") != 0) {
                                    org.telegram.messenger.g0.W(siVar2.getContext()).requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 4);
                                    break;
                                }
                                siVar2.s1(true);
                            }
                        } else if (intValue != 5) {
                            int i20 = 12;
                            if (intValue == 6) {
                                if ((siVar2.O3 || !siVar2.O0()) && org.telegram.messenger.g0.J1(h2Var2)) {
                                    if (siVar2.O3) {
                                        if (siVar2.j2 == null) {
                                            kl klVar = new kl(siVar2, siVar2.getContext(), i6Var2, (siVar2.C1 || siVar2.P3) ? false : true);
                                            siVar2.j2 = klVar;
                                            kiVarArr[5] = klVar;
                                            jl jlVar = siVar2.u4;
                                            if (jlVar != null) {
                                                klVar.setDelegate(jlVar);
                                            } else {
                                                klVar.setDelegate(new bh(siVar2, i20));
                                            }
                                        }
                                        siVar2.G1(siVar2.j2);
                                    } else {
                                        sn snVar2 = new sn(6, siVar2.getContext(), i6Var2, siVar2);
                                        siVar2.O1 = snVar2;
                                        siVar2.G1(snVar2);
                                    }
                                }
                            } else if (intValue == 9) {
                                if (siVar2.M3 || !siVar2.O0()) {
                                    if (siVar2.M3) {
                                        siVar2.I1(true, null);
                                    } else {
                                        sn snVar3 = new sn(9, siVar2.getContext(), i6Var2, siVar2);
                                        siVar2.O1 = snVar3;
                                        siVar2.G1(snVar3);
                                    }
                                }
                            } else if (intValue == 11) {
                                if (siVar2.n2 == null) {
                                    kg.g0 g0Var2 = new kg.g0(siVar2.getContext(), siVar2.J0, siVar2);
                                    siVar2.n2 = g0Var2;
                                    kiVarArr[7] = g0Var2;
                                    g0Var2.setupBlurredSearchField(siVar2.F4);
                                }
                                siVar2.G1(siVar2.n2);
                            } else if (intValue == 12) {
                                if (siVar2.N3 || !siVar2.O0()) {
                                    if (siVar2.N3) {
                                        if (siVar2.i2 == null) {
                                            siVar = siVar2;
                                            rn rnVar = new rn(siVar, siVar.getContext(), true, i6Var2, null);
                                            siVar.i2 = rnVar;
                                            kiVarArr[1] = rnVar;
                                            rnVar.setDelegate(new bh(siVar, i13));
                                        } else {
                                            siVar = siVar2;
                                        }
                                        siVar.G1(siVar.i2);
                                    } else {
                                        sn snVar4 = new sn(9, siVar2.getContext(), i6Var2, siVar2);
                                        siVar2.O1 = snVar4;
                                        siVar2.G1(snVar4);
                                    }
                                }
                            } else if (intValue == 13) {
                                if (siVar2.p2 == null) {
                                    lk lkVar = new lk(siVar2, siVar2.getContext(), i6Var2, true);
                                    siVar2.p2 = lkVar;
                                    kiVarArr[8] = lkVar;
                                    lkVar.setDelegate(siVar2.Y3);
                                }
                                siVar2.G1(siVar2.p2);
                            } else if (intValue == 14) {
                                if (siVar2.o2 == null) {
                                    lk lkVar2 = new lk(siVar2, siVar2.getContext(), i6Var2, false);
                                    siVar2.o2 = lkVar2;
                                    kiVarArr[9] = lkVar2;
                                    lkVar2.setDelegate(siVar2.Y3);
                                }
                                siVar2.G1(siVar2.o2);
                            } else if (intValue == 16) {
                                if (siVar2.q2 == null) {
                                    oi.o oVar = new oi.o(siVar2.H3, siVar2.getContext(), i6Var2, siVar2);
                                    siVar2.q2 = oVar;
                                    kiVarArr[10] = oVar;
                                }
                                siVar2.G1(siVar2.q2);
                            } else if (view.getTag() instanceof Integer) {
                                siVar2.X3.y1(((Integer) view.getTag()).intValue(), true, true, 0, 0, 0L, siVar2.g1(), false, 0L);
                            }
                        } else if (siVar2.O3 || !siVar2.O0()) {
                            if (siVar2.O3 && siVar2.getContext().checkSelfPermission("android.permission.READ_CONTACTS") != 0) {
                                org.telegram.messenger.g0.W(siVar2.getContext()).requestPermissions(new String[]{"android.permission.READ_CONTACTS"}, 5);
                                break;
                            } else {
                                siVar2.r1();
                            }
                        }
                    } else if (view instanceof li) {
                        li liVar = (li) view;
                        TLRPC.TL_attachMenuBot tL_attachMenuBot = liVar.c;
                        if (tL_attachMenuBot == null) {
                            siVar2.X3.h1(liVar.b);
                            siVar2.dismiss();
                        } else if (tL_attachMenuBot.inactive) {
                            zc1.a(siVar2.getContext(), new li.d(28, siVar2, liVar), null);
                        } else {
                            siVar2.D1(tL_attachMenuBot.bot_id, null, false, true);
                        }
                    }
                    int left = view.getLeft();
                    int right = view.getRight();
                    int L = org.telegram.messenger.g0.L(70.0f);
                    int i21 = left - L;
                    if (i21 < 0) {
                        thVar.w0(i21, 0, null);
                        break;
                    } else {
                        int i22 = right + L;
                        if (i22 > thVar.getMeasuredWidth()) {
                            thVar.w0(i22 - thVar.getMeasuredWidth(), 0, null);
                            break;
                        }
                    }
                }
                break;
            case 10:
                tj tjVar = (tj) obj2;
                org.telegram.ui.ActionBar.i6 i6Var3 = (org.telegram.ui.ActionBar.i6) obj;
                nj njVar = tjVar.F;
                v4.i0 adapter = tjVar.s.getAdapter();
                pj pjVar = tjVar.G;
                if (adapter == pjVar) {
                    O = pjVar.E(i7);
                } else {
                    int S = njVar.S(i7);
                    int Q2 = njVar.Q(i7);
                    if (Q2 >= 0 && S >= 0) {
                        O = njVar.O(S, Q2);
                    }
                }
                if (O != null) {
                    if (tjVar.x.isEmpty()) {
                        if (O instanceof org.telegram.messenger.f5) {
                            org.telegram.messenger.f5 f5Var2 = (org.telegram.messenger.f5) O;
                            TLRPC.User user = f5Var2.m;
                            if (user != null) {
                                str3 = user.first_name;
                                str4 = user.last_name;
                            } else {
                                str3 = f5Var2.i;
                                str4 = f5Var2.j;
                            }
                            f5Var = f5Var2;
                            str2 = str4;
                            str = str3;
                        } else {
                            TLRPC.User user2 = (TLRPC.User) O;
                            org.telegram.messenger.f5 f5Var3 = new org.telegram.messenger.f5();
                            String str5 = user2.first_name;
                            f5Var3.i = str5;
                            String str6 = user2.last_name;
                            f5Var3.j = str6;
                            f5Var3.e.add(user2.phone);
                            f5Var3.m = user2;
                            f5Var = f5Var3;
                            str = str5;
                            str2 = str6;
                        }
                        ld0 ld0Var = new ld0(tjVar.b.a2, f5Var, null, null, null, null, str, str2, i6Var3);
                        ld0Var.F1 = new gj(tjVar);
                        ld0Var.show();
                        break;
                    } else {
                        tjVar.Q((sj) view, O);
                        break;
                    }
                }
                break;
            case 11:
                g70 g70Var = (g70) obj2;
                TLRPC.Chat chat = (TLRPC.Chat) obj;
                c70 c70Var = g70Var.q1;
                ArrayList arrayList4 = g70Var.t1;
                if (!g70Var.B1 && arrayList4.get(i7) != g70Var.x1) {
                    g70Var.x1 = (TLRPC.Peer) arrayList4.get(i7);
                    boolean z12 = view instanceof org.telegram.ui.Cells.i4;
                    if (z12) {
                        z10 = true;
                        ((org.telegram.ui.Cells.i4) view).c(true, true);
                    } else {
                        z10 = true;
                        if (view instanceof org.telegram.ui.Cells.e7) {
                            ((org.telegram.ui.Cells.e7) view).b(true, true);
                            view.invalidate();
                        }
                    }
                    int childCount = c70Var.getChildCount();
                    for (int i23 = 0; i23 < childCount; i23++) {
                        View childAt = c70Var.getChildAt(i23);
                        if (childAt != view) {
                            if (z12) {
                                ((org.telegram.ui.Cells.i4) childAt).c(false, z10);
                            } else if (view instanceof org.telegram.ui.Cells.e7) {
                                ((org.telegram.ui.Cells.e7) childAt).b(false, z10);
                            }
                        }
                    }
                    if (g70Var.w1 != 0) {
                        g70Var.N0(chat, z10);
                        break;
                    }
                }
                break;
            case 12:
                t90 t90Var = (t90) obj2;
                q90 q90Var2 = (q90) obj;
                if (i7 == 0) {
                    t90Var.getClass();
                    break;
                } else {
                    jg.h1 adapter2 = t90Var.getAdapter();
                    if (adapter2.x0 == null || adapter2.i0) {
                        int i24 = i7 - 1;
                        Object J = t90Var.getAdapter().J(i24);
                        int i25 = t90Var.getAdapter().Y;
                        int i26 = t90Var.getAdapter().Z;
                        if (t90Var.getAdapter().G != null && i24 == 1) {
                            TLRPC.Chat chat2 = t90Var.getAdapter().m0;
                            if (chat2 == null && t90Var.getAdapter().H0 != null) {
                                chat2 = t90Var.getAdapter().H0.e;
                            }
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(t90Var.getAdapter().G);
                            q90Var2.l0(i25, i26, a8.p0.s(sb2, chat2 != null ? "@" + org.telegram.messenger.v3.K(chat2, false) : "", " "), false);
                            break;
                        } else if (t90Var.getAdapter().G != null && i24 == 0) {
                            q90Var2.l0(i25, i26, a8.p0.s(new StringBuilder(), t90Var.getAdapter().G, " "), false);
                            break;
                        } else {
                            if (J instanceof TLRPC.TL_document) {
                                if (view instanceof org.telegram.ui.Cells.y7) {
                                    ((org.telegram.ui.Cells.y7) view).getSendAnimationData();
                                }
                                TLRPC.TL_document tL_document = (TLRPC.TL_document) J;
                                q90Var2.Y(tL_document, fj.U(tL_document), t90Var.getAdapter().L(i24));
                            } else if (!(J instanceof TLRPC.Chat)) {
                                if (J instanceof TLRPC.User) {
                                    TLRPC.User user3 = (TLRPC.User) J;
                                    if (o10.o(user3) != null) {
                                        q90Var2.l0(i25, i26, "@" + o10.o(user3) + " ", false);
                                    } else {
                                        SpannableString spannableString = new SpannableString(p5.c.v(o10.k(user3, false), " "));
                                        StringBuilder sb3 = new StringBuilder("");
                                        q90Var = q90Var2;
                                        sb3.append(user3.id);
                                        spannableString.setSpan(new s41(sb3.toString(), 3, null), 0, spannableString.length(), 33);
                                        q90Var.l0(i25, i26, spannableString, false);
                                    }
                                } else {
                                    q90Var = q90Var2;
                                    if (J instanceof String) {
                                        q90Var.l0(i25, i26, J + " ", false);
                                    } else if (J instanceof ni) {
                                        String str7 = ((ni) J).a;
                                        q90Var.q0(str7);
                                        if (str7 != null) {
                                            try {
                                            } catch (Exception unused) {
                                                q90Var.l0(i25, i26, str7, true);
                                            }
                                            if (str7.startsWith("animated_")) {
                                                try {
                                                    fontMetricsInt = q90Var.P();
                                                } catch (Exception e10) {
                                                    org.telegram.messenger.a8.g(e10, false);
                                                    fontMetricsInt = null;
                                                }
                                                long parseLong = Long.parseLong(str7.substring(9));
                                                TLRPC.Document e11 = org.telegram.ui.Components.o5.e(j10.t0, parseLong);
                                                SpannableString spannableString2 = new SpannableString(fj.U(e11));
                                                spannableString2.setSpan(e11 != null ? new org.telegram.ui.Components.x5(e11, fontMetricsInt) : new org.telegram.ui.Components.x5(parseLong, fontMetricsInt), 0, spannableString2.length(), 33);
                                                q90Var.l0(i25, i26, spannableString2, false);
                                                t90Var.o(false);
                                            }
                                        }
                                        q90Var.l0(i25, i26, str7, true);
                                        t90Var.o(false);
                                    }
                                }
                                if (!(J instanceof TLRPC.BotInlineResult)) {
                                    TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) J;
                                    if ((!botInlineResult.type.equals("photo") || (botInlineResult.photo == null && botInlineResult.content == null)) && ((!botInlineResult.type.equals("gif") || (botInlineResult.document == null && botInlineResult.content == null)) && (!botInlineResult.type.equals(MediaStreamTrack.VIDEO_TRACK_KIND) || botInlineResult.document == null))) {
                                        q90Var.g(botInlineResult, true, 0);
                                        break;
                                    } else {
                                        ArrayList arrayList5 = new ArrayList(t90Var.getAdapter().S);
                                        t90Var.Q = arrayList5;
                                        PhotoViewer.p1().I2(null, t90Var.h, t90Var.a);
                                        PhotoViewer.p1().f2(arrayList5, t90Var.getAdapter().M(i24), 3, false, t90Var.R, null);
                                        break;
                                    }
                                }
                            } else {
                                String K = org.telegram.messenger.v3.K((TLRPC.Chat) J, false);
                                if (K != null) {
                                    q90Var2.l0(i25, i26, a8.p0.p("@", K, " "), false);
                                }
                            }
                            q90Var = q90Var2;
                            if (!(J instanceof TLRPC.BotInlineResult)) {
                            }
                        }
                    }
                }
                break;
            case 13:
                df0 df0Var = (df0) obj2;
                HashSet hashSet = df0Var.v1;
                ze0 ze0Var = df0Var.n1;
                if (org.telegram.messenger.g0.E1((Context) obj)) {
                    ArrayList arrayList6 = df0Var.A1;
                    if (arrayList6 == null || arrayList6.isEmpty()) {
                        if (view instanceof org.telegram.ui.Cells.n8) {
                            int S2 = ze0Var.S(i7) - 1;
                            int Q3 = ze0Var.Q(i7) - 1;
                            if (Q3 > 0 && S2 >= 0) {
                                cf0 cf0Var = (cf0) df0Var.x1.get(S2);
                                if (Q3 == cf0Var.b() && !hashSet.contains(cf0Var)) {
                                    if (!cf0Var.e || cf0Var.f >= cf0Var.b.size()) {
                                        hashSet.add(cf0Var);
                                        TLRPC.TL_messages_getPollVotes tL_messages_getPollVotes = new TLRPC.TL_messages_getPollVotes();
                                        tL_messages_getPollVotes.peer = df0Var.u1;
                                        tL_messages_getPollVotes.id = df0Var.s1.e1();
                                        tL_messages_getPollVotes.limit = 50;
                                        int i27 = tL_messages_getPollVotes.flags;
                                        tL_messages_getPollVotes.option = cf0Var.d;
                                        tL_messages_getPollVotes.flags = i27 | 3;
                                        tL_messages_getPollVotes.offset = cf0Var.c;
                                        ConnectionsManager.getInstance(df0Var.a).sendRequest(tL_messages_getPollVotes, new org.telegram.ui.u7(20, df0Var, cf0Var));
                                        break;
                                    } else {
                                        int min = Math.min(cf0Var.f + 50, cf0Var.b.size());
                                        cf0Var.f = min;
                                        if (min == cf0Var.b.size()) {
                                            cf0Var.e = false;
                                        }
                                        df0Var.K0(null);
                                        ze0Var.X(true);
                                        break;
                                    }
                                }
                            }
                        } else if (view instanceof PollVotesAlert$UserCell) {
                            PollVotesAlert$UserCell pollVotesAlert$UserCell = (PollVotesAlert$UserCell) view;
                            if (pollVotesAlert$UserCell.h != null || pollVotesAlert$UserCell.n != null) {
                                Bundle bundle3 = new Bundle();
                                TLRPC.User user4 = pollVotesAlert$UserCell.h;
                                if (user4 != null) {
                                    bundle3.putLong("user_id", user4.id);
                                } else {
                                    bundle3.putLong("chat_id", pollVotesAlert$UserCell.n.id);
                                }
                                df0Var.dismiss();
                                org.telegram.ui.ActionBar.h2 T = LaunchActivity.T();
                                if (T != null) {
                                    ProfileActivity profileActivity = new ProfileActivity(bundle3, null);
                                    if (T instanceof bn) {
                                        if (pollVotesAlert$UserCell.h != null) {
                                            TLRPC.User j10 = ((bn) T).j();
                                            df0Var.m1.getChildAt(0);
                                            if (j10 != null && j10.id == pollVotesAlert$UserCell.h.id) {
                                                i16 = 1;
                                            }
                                            profileActivity.j5(i16);
                                        } else {
                                            TLRPC.Chat chat3 = ((bn) T).e;
                                            if (chat3 != null && chat3.id == pollVotesAlert$UserCell.n.id) {
                                                i16 = 1;
                                            }
                                            profileActivity.j5(i16);
                                        }
                                    }
                                    T.presentFragment(profileActivity);
                                    break;
                                }
                            }
                        }
                    }
                }
                break;
            case 14:
                f11 f11Var = (f11) obj2;
                EditText editText = f11Var.w;
                long a11 = ((b11) f11Var.s.c.get(i7)).a();
                bn bnVar2 = ((ek) obj).a;
                if (bnVar2.Z9()) {
                    bn.M2(a11, bnVar2);
                } else {
                    z11 z11Var = bnVar2.g2;
                    if (z11Var != null) {
                        z11Var.n(a11, false);
                    }
                }
                boolean i28 = f11Var.i();
                f11Var.V = 0L;
                f11Var.W = null;
                if (editText.length() > 0) {
                    editText.setText("");
                } else if (i28) {
                    f11Var.l(false);
                    f11Var.n();
                }
                editText.clearFocus();
                f11Var.e();
                break;
            case 15:
                k31 k31Var = (k31) obj2;
                org.telegram.ui.ActionBar.i6 i6Var4 = (org.telegram.ui.ActionBar.i6) obj;
                l41 G3 = k31Var.f2.G(i7 - 1);
                if (G3 != null) {
                    int i29 = G3.d;
                    if (i29 == 1) {
                        CharSequence charSequence = k31Var.Y1;
                        if (charSequence != null && !k31Var.X1) {
                            org.telegram.messenger.g0.g(charSequence);
                            break;
                        }
                    } else if (i29 == 2) {
                        if (j10.i(k31Var.a).q()) {
                            mp.u1(k31Var.a).v7.K(0L, !r0.B(0L));
                            k31Var.dismiss();
                            break;
                        } else if (LaunchActivity.T() != null) {
                            new ug.z0(13, k31Var.getContext(), i6Var4).show();
                            break;
                        }
                    }
                }
                break;
            case 16:
                a(i7, view);
                break;
            case 17:
                kx.Z((kx) obj2, (Context) obj, i7);
                break;
            case 18:
                z40.Z((z40) obj2, (Context) obj, view, i7);
                break;
            case 19:
                b(i7, view);
                break;
            case 20:
                yh0.Z((yh0) obj2, (Context) obj, view, i7);
                break;
            case 21:
                PrivacySettingsActivity.a0((PrivacySettingsActivity) obj2, (Context) obj, view, i7);
                break;
            case 22:
                UsersSelectActivity.Z((UsersSelectActivity) obj2, (Context) obj, view, i7);
                break;
            case 23:
                d(i7, view);
                break;
            default:
                wg.q0 q0Var = (wg.q0) obj2;
                TLRPC.Chat chat4 = (TLRPC.Chat) obj;
                ArrayList arrayList7 = q0Var.T1;
                if (view instanceof ah.r) {
                    ah.r rVar = (ah.r) view;
                    if (rVar.getBoost().cooldown_until_date > 0) {
                        new lc(q0Var.c, q0Var.J0).G(R.raw.chats_infotip, 5, org.telegram.messenger.g0.W2(gd.G((int) mp.u1(j10.t0).s0, "BoostingWaitWarningPlural", new Object[0]))).k(true);
                        break;
                    } else {
                        if (arrayList7.contains(rVar.getBoost())) {
                            arrayList7.remove(rVar.getBoost());
                        } else {
                            arrayList7.add(rVar.getBoost());
                        }
                        rVar.c(arrayList7.contains(rVar.getBoost()), true);
                        q0Var.e1(true);
                        q0Var.X1.a(arrayList7, chat4);
                        break;
                    }
                }
                break;
        }
    }
}
