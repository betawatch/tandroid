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
import org.telegram.messenger.cp;
import org.telegram.messenger.dp;
import org.telegram.messenger.gj;
import org.telegram.messenger.hd;
import org.telegram.messenger.k10;
import org.telegram.messenger.ls;
import org.telegram.messenger.np;
import org.telegram.messenger.p10;
import org.telegram.messenger.t00;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.PollVotesAlert$UserCell;
import org.telegram.ui.Components.a21;
import org.telegram.ui.Components.a60;
import org.telegram.ui.Components.bf0;
import org.telegram.ui.Components.c11;
import org.telegram.ui.Components.c51;
import org.telegram.ui.Components.cp0;
import org.telegram.ui.Components.dh;
import org.telegram.ui.Components.e70;
import org.telegram.ui.Components.ef0;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.g11;
import org.telegram.ui.Components.i70;
import org.telegram.ui.Components.ij;
import org.telegram.ui.Components.k01;
import org.telegram.ui.Components.lc;
import org.telegram.ui.Components.ll;
import org.telegram.ui.Components.m31;
import org.telegram.ui.Components.md0;
import org.telegram.ui.Components.mi;
import org.telegram.ui.Components.ml;
import org.telegram.ui.Components.mp;
import org.telegram.ui.Components.ni;
import org.telegram.ui.Components.nk;
import org.telegram.ui.Components.o41;
import org.telegram.ui.Components.oi;
import org.telegram.ui.Components.pj;
import org.telegram.ui.Components.qj0;
import org.telegram.ui.Components.rj;
import org.telegram.ui.Components.s90;
import org.telegram.ui.Components.tb0;
import org.telegram.ui.Components.tn;
import org.telegram.ui.Components.ui;
import org.telegram.ui.Components.uj;
import org.telegram.ui.Components.un;
import org.telegram.ui.Components.v41;
import org.telegram.ui.Components.v90;
import org.telegram.ui.Components.vh;
import org.telegram.ui.Components.vj;
import org.telegram.ui.Components.zk;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PrivacySettingsActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.UsersSelectActivity;
import org.telegram.ui.bn;
import org.telegram.ui.dc;
import org.telegram.ui.ek;
import org.telegram.ui.f61;
import org.telegram.ui.ff0;
import org.telegram.ui.hc;
import org.telegram.ui.k90;
import org.telegram.ui.kx;
import org.telegram.ui.mf0;
import org.telegram.ui.nb0;
import org.telegram.ui.qc;
import org.telegram.ui.se0;
import org.telegram.ui.xt;
import org.telegram.ui.y00;
import org.telegram.ui.yh0;
import org.telegram.ui.z40;
import org.telegram.ui.zc1;
import org.webrtc.MediaStreamTrack;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes4.dex */
public final /* synthetic */ class g4 implements qj0 {
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
        cp0 cp0Var;
        xt xtVar = (xt) this.b;
        org.telegram.ui.ActionBar.g2 g2Var = (org.telegram.ui.ActionBar.g2) this.c;
        mp mpVar = (mp) xtVar.c.d.get(i7);
        org.telegram.ui.ActionBar.l6 i13 = mpVar.a.i(xtVar.r);
        ig.b bVar = mpVar.a.c;
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
            ig.b bVar2 = mpVar.a.c;
            if (bVar2 != null && (str2 = bVar2.b) == null) {
                str2 = bVar2.a;
            }
            if (!str2.equals("🎨")) {
                i10 = -1;
                if (i13 == null) {
                    TLRPC.TL_theme tL_theme = ((org.telegram.ui.ActionBar.r3) mpVar.a.f.get(xtVar.r)).b;
                    org.telegram.ui.ActionBar.l6 Q0 = org.telegram.ui.ActionBar.m6.Q0(org.telegram.ui.ActionBar.m6.r0(tL_theme.settings.get(((org.telegram.ui.ActionBar.r3) mpVar.a.f.get(xtVar.r)).d)));
                    if (Q0 != null) {
                        org.telegram.ui.ActionBar.j6 j6Var = (org.telegram.ui.ActionBar.j6) Q0.d0.get(tL_theme.id);
                        if (j6Var == null) {
                            j6Var = Q0.f(tL_theme, g2Var.getCurrentAccount(), 0);
                        }
                        i10 = j6Var.a;
                        Q0.u(i10);
                    }
                    i13 = Q0;
                }
                org.telegram.ui.ActionBar.m6.K1(i13, false, i10, view);
                xtVar.h = i7;
                i11 = 0;
                while (true) {
                    z10 = true;
                    if (i11 < xtVar.c.d.size()) {
                        break;
                    }
                    mp mpVar2 = (mp) xtVar.c.d.get(i11);
                    if (i11 != xtVar.h) {
                        z10 = false;
                    }
                    mpVar2.d = z10;
                    i11++;
                }
                xtVar.c.E(xtVar.h);
                for (i12 = 0; i12 < xtVar.a.getChildCount(); i12++) {
                    k01 k01Var = (k01) xtVar.a.getChildAt(i12);
                    if (k01Var != view && (cp0Var = k01Var.K) != null) {
                        org.telegram.messenger.g0.r(cp0Var);
                        k01Var.K.run();
                    }
                }
                ((k01) view).d();
                if (i13 != null) {
                    SharedPreferences.Editor edit = org.telegram.messenger.t0.b.getSharedPreferences("themeconfig", 0).edit();
                    edit.putString((xtVar.n == 1 || i13.q()) ? "lastDarkTheme" : "lastDayTheme", i13.m());
                    edit.commit();
                }
                org.telegram.ui.ActionBar.m6.M1(g2Var);
            }
        }
        i10 = ((org.telegram.ui.ActionBar.r3) mpVar.a.f.get(xtVar.r)).e;
        if (i13 == null) {
        }
        org.telegram.ui.ActionBar.m6.K1(i13, false, i10, view);
        xtVar.h = i7;
        i11 = 0;
        while (true) {
            z10 = true;
            if (i11 < xtVar.c.d.size()) {
            }
            mpVar2.d = z10;
            i11++;
        }
        xtVar.c.E(xtVar.h);
        while (i12 < xtVar.a.getChildCount()) {
        }
        ((k01) view).d();
        if (i13 != null) {
        }
        org.telegram.ui.ActionBar.m6.M1(g2Var);
    }

    private final void b(int i7, View view) {
        ff0 ff0Var = (ff0) this.b;
        Context context = (Context) this.c;
        HashMap hashMap = ff0Var.l0;
        if (i7 == ff0Var.R) {
            TLRPC.User user = (TLRPC.User) hashMap.get(Long.valueOf(ff0Var.e.admin_id));
            if (user != null) {
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", user.id);
                np.u1(k10.t0).e4(user, false, false);
                ff0Var.presentFragment(new ProfileActivity(bundle, null));
                return;
            }
            return;
        }
        if (i7 == ff0Var.y) {
            k90 k90Var = new k90(0, ff0Var.n);
            k90Var.T = ff0Var.t0;
            ff0Var.presentFragment(k90Var);
            return;
        }
        int i10 = ff0Var.E;
        if (i7 >= i10 && i7 < ff0Var.F) {
            a60 a60Var = new a60(context, (TLRPC.TL_chatInviteExported) ff0Var.j0.get(i7 - i10), ff0Var.d, hashMap, ff0Var, ff0Var.n, false, ff0Var.h);
            ff0Var.m0 = a60Var;
            a60Var.f2 = ff0Var.q0;
            a60Var.show();
            return;
        }
        int i11 = ff0Var.I;
        if (i7 >= i11 && i7 < ff0Var.J) {
            a60 a60Var2 = new a60(context, (TLRPC.TL_chatInviteExported) ff0Var.k0.get(i7 - i11), ff0Var.d, hashMap, ff0Var, ff0Var.n, false, ff0Var.h);
            ff0Var.m0 = a60Var2;
            a60Var2.show();
            return;
        }
        if (i7 == ff0Var.O) {
            if (ff0Var.d0) {
                return;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ff0Var.getParentActivity());
            String N0 = hd.N0(2131751563, null);
            org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
            t1Var.S = N0;
            t1Var.U = hd.N0(2131751564, null);
            alertDialog$Builder.k(hd.N0(2131751586, null), new se0(ff0Var));
            alertDialog$Builder.h(hd.N0(2131752577, null), null);
            ff0Var.showDialog(t1Var);
            return;
        }
        int i12 = ff0Var.V;
        if (i7 < i12 || i7 >= ff0Var.W) {
            return;
        }
        TLRPC.TL_chatAdminWithInvites tL_chatAdminWithInvites = (TLRPC.TL_chatAdminWithInvites) ff0Var.n0.get(i7 - i12);
        if (hashMap.containsKey(Long.valueOf(tL_chatAdminWithInvites.admin_id))) {
            ff0Var.getMessagesController().e4((TLRPC.User) hashMap.get(Long.valueOf(tL_chatAdminWithInvites.admin_id)), false, false);
        }
        ff0 ff0Var2 = new ff0(ff0Var.n, tL_chatAdminWithInvites.invites_count, tL_chatAdminWithInvites.admin_id);
        ff0Var2.m0(ff0Var.d, null);
        ff0Var.presentFragment(ff0Var2);
    }

    private final void d(int i7, View view) {
        org.telegram.ui.Components.f4 f4Var;
        sg.h0 h0Var;
        wg.a0 a0Var = (wg.a0) this.b;
        org.telegram.ui.ActionBar.g2 g2Var = (org.telegram.ui.ActionBar.g2) this.c;
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
                ek0 ek0Var = a0Var.o1;
                if (cVar.b()) {
                    for (int i15 = 0; i15 < ek0Var.getChildCount(); i15++) {
                        View childAt = ek0Var.getChildAt(i15);
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
        Context context = g2Var.getContext();
        long j3 = a0Var.i2;
        wg.u uVar = new wg.u(a0Var);
        org.telegram.ui.ActionBar.h6 h6Var = a0Var.J0;
        org.telegram.ui.Components.z4 z4Var = new org.telegram.ui.Components.z4(h6Var);
        hi.w4 w4Var = new hi.w4(context, h6Var);
        ((org.telegram.ui.ActionBar.w2) w4Var.b).w0 = false;
        tb0 tb0Var = new tb0(context, h6Var);
        int i16 = z4Var.a;
        tb0Var.setTextColor(i16);
        tb0Var.setTextOffset(org.telegram.messenger.g0.L(10.0f));
        tb0Var.setItemCount(5);
        wg.f fVar = new wg.f(context, h6Var);
        fVar.setWrapSelectorWheel(true);
        fVar.setAllItemsCount(24);
        fVar.setItemCount(5);
        fVar.setTextColor(i16);
        fVar.setTextOffset(-org.telegram.messenger.g0.L(10.0f));
        fVar.setTag("HOUR");
        wg.g gVar = new wg.g(context, h6Var);
        gVar.setWrapSelectorWheel(true);
        gVar.setAllItemsCount(60);
        gVar.setItemCount(5);
        gVar.setTextColor(i16);
        gVar.setTextOffset(-org.telegram.messenger.g0.L(34.0f));
        org.telegram.ui.Components.f4 f4Var2 = new org.telegram.ui.Components.f4(context, z4Var, tb0Var, fVar, gVar);
        f4Var2.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        f4Var2.addView(frameLayout, ma.t(-1, -2, 51, 22, 0, 0, 4));
        TextView textView = new TextView(context);
        textView.setText(hd.N0(2131753284, "BoostingSelectDateTime"));
        textView.setTextColor(i16);
        i5.c.x(textView, 1, 20.0f);
        frameLayout.addView(textView, ma.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
        textView.setOnTouchListener(new gi.a(2));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setWeightSum(1.0f);
        f4Var2.addView(linearLayout, ma.q(-1, -2, 1.0f, 0, 0, 12, 0, 12));
        long currentTimeMillis = System.currentTimeMillis();
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(currentTimeMillis);
        int i17 = calendar.get(1);
        nb0 nb0Var = new nb0(context, 5);
        long j10 = np.u1(k10.t0).p0 * 1000;
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTimeInMillis(j10);
        int i18 = calendar2.get(6);
        calendar2.setTimeInMillis(System.currentTimeMillis());
        calendar2.add(14, (int) j10);
        int i19 = calendar2.get(11);
        int i20 = calendar.get(12);
        linearLayout.addView(tb0Var, ma.l(0.5f, 0, ls.t4));
        tb0Var.setMinValue(0);
        tb0Var.setMaxValue(i18 - 1);
        tb0Var.setWrapSelectorWheel(false);
        tb0Var.setTag("DAY");
        tb0Var.setFormatter(new y00(currentTimeMillis, calendar, i17, 1));
        ki.v3 v3Var = new ki.v3(f4Var2, fVar, gVar, i19, i20, tb0Var);
        tb0Var.setOnValueChangedListener(v3Var);
        fVar.setMinValue(0);
        fVar.setMaxValue(23);
        linearLayout.addView(fVar, ma.l(0.2f, 0, ls.t4));
        fVar.setFormatter(new ug.x(18));
        fVar.setOnValueChangedListener(v3Var);
        gVar.setMinValue(0);
        gVar.setMaxValue(11);
        gVar.setValue(0);
        gVar.setFormatter(new ug.x(19));
        linearLayout.addView(gVar, ma.l(0.3f, 0, ls.t4));
        gVar.setOnValueChangedListener(v3Var);
        if (j3 > 0) {
            f4Var = f4Var2;
            calendar.setTimeInMillis(System.currentTimeMillis());
            calendar.set(12, 0);
            calendar.set(13, 0);
            calendar.set(14, 0);
            calendar.set(11, 0);
            int timeInMillis = (int) ((j3 - calendar.getTimeInMillis()) / 86400000);
            calendar.setTimeInMillis(j3);
            gVar.setValue(calendar.get(12) / 5);
            fVar.setValue(calendar.get(11));
            tb0Var.setValue(timeInMillis);
            tb0Var.getValue();
            v3Var.n(tb0Var, tb0Var.getValue());
            fVar.getValue();
            v3Var.n(fVar, fVar.getValue());
        } else {
            f4Var = f4Var2;
        }
        nb0Var.setPadding(org.telegram.messenger.g0.L(34.0f), 0, org.telegram.messenger.g0.L(34.0f), 0);
        nb0Var.setGravity(17);
        nb0Var.setTextColor(z4Var.g);
        nb0Var.setTextSize(1, 14.0f);
        nb0Var.setTypeface(org.telegram.messenger.g0.o());
        nb0Var.setBackground(org.telegram.ui.ActionBar.a6.e(z4Var.h, 8.0f));
        nb0Var.setText(hd.N0(2131753540, "BoostingConfirm"));
        f4Var.addView(nb0Var, ma.t(-1, 48, 83, 16, 15, 16, 16));
        nb0Var.setOnClickListener(new org.telegram.ui.Components.w1(calendar, tb0Var, fVar, gVar, uVar, w4Var));
        org.telegram.ui.ActionBar.w2 w2Var = (org.telegram.ui.ActionBar.w2) w4Var.b;
        w2Var.O = f4Var;
        w2Var.show();
        int i21 = z4Var.b;
        w2Var.v0(i21);
        w2Var.P(i21);
        org.telegram.messenger.g0.p3(w2Var, i0.a.h(i21) > 0.699999988079071d);
    }

    /* JADX WARN: Removed duplicated region for block: B:170:0x041e  */
    /* JADX WARN: Removed duplicated region for block: B:506:0x09a4  */
    /* JADX WARN: Removed duplicated region for block: B:508:0x09b8  */
    @Override // org.telegram.ui.Components.qj0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(int i7, View view) {
        int i10;
        ArrayList arrayList;
        TL_stories.TL_storyReactionPublicRepost tL_storyReactionPublicRepost;
        TL_stories.StoryItem storyItem;
        o41 G;
        int i11;
        ui uiVar;
        Object O;
        org.telegram.messenger.f5 f5Var;
        String str;
        String str2;
        String str3;
        String str4;
        boolean z10;
        s90 s90Var;
        Paint.FontMetricsInt fontMetricsInt;
        int i12 = this.a;
        int i13 = 13;
        int i14 = 8;
        int i15 = -1;
        int i16 = 0;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i12) {
            case 0:
                b5 b5Var = (b5) obj2;
                f9 f9Var = (f9) obj;
                org.telegram.ui.ActionBar.g2 g2Var = f9Var.f;
                x4 x4Var = b5Var.x;
                h4 h4Var = b5Var.r;
                if (i7 >= 0 && i7 < x4Var.c.size()) {
                    s4 s4Var = (s4) x4Var.c.get(i7);
                    TL_stories.StoryView storyView = s4Var.b;
                    TL_stories.StoryReaction storyReaction = s4Var.c;
                    if (storyView instanceof TL_stories.TL_storyView) {
                        f9Var.N(ProfileActivity.D4(storyView.user_id));
                        break;
                    } else if (storyView instanceof TL_stories.TL_storyViewPublicRepost) {
                        g2Var.createOverlayStoryViewer().L(b5Var.getContext(), ((TL_stories.TL_storyViewPublicRepost) s4Var.b).story, y6.a(h4Var));
                        break;
                    } else if (storyReaction instanceof TL_stories.TL_storyReaction) {
                        f9Var.N(ProfileActivity.D4(org.telegram.messenger.n5.o(storyReaction.peer_id)));
                        break;
                    } else if (storyReaction instanceof TL_stories.TL_storyReactionPublicRepost) {
                        ArrayList arrayList2 = new ArrayList();
                        a5 a5Var = b5Var.F;
                        if (a5Var == null || (arrayList = a5Var.i) == null) {
                            i10 = 0;
                        } else {
                            i10 = arrayList.size();
                            for (int i17 = 0; i17 < b5Var.F.i.size(); i17++) {
                                TL_stories.StoryReaction storyReaction2 = (TL_stories.StoryReaction) b5Var.F.i.get(i17);
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
                            b5Var.H = null;
                            g2Var.createOverlayStoryViewer().L(b5Var.getContext(), ((TL_stories.TL_storyReactionPublicRepost) storyReaction).story, y6.a(h4Var));
                            break;
                        } else {
                            b5Var.H = new k6(b5Var.w, arrayList2);
                            b5Var.I = i10;
                            a5 a5Var2 = b5Var.F;
                            f9 createOverlayStoryViewer = g2Var.createOverlayStoryViewer();
                            Context context = b5Var.getContext();
                            k6 k6Var = b5Var.H;
                            y6 a10 = y6.a(h4Var);
                            a10.e = new di.v6(a5Var2, i14);
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
                ai.h0 h0Var = (ai.h0) obj;
                c51 c51Var = pVar.V1;
                if (c51Var != null && (G = c51Var.G(i7 - 1)) != null) {
                    Object obj3 = G.H;
                    if (obj3 instanceof t00) {
                        h0Var.a(((t00) obj3).a);
                        pVar.dismiss();
                        break;
                    }
                }
                break;
            case 2:
                ki.h3.C0((ki.h3) obj2, (Context) obj, i7);
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
                dp dpVar = np.u1(i19).t4;
                if (dpVar != null) {
                    ArrayList arrayList3 = dpVar.c;
                    if (i7 >= 0 && i7 < arrayList3.size()) {
                        i11 = ((cp) arrayList3.get(i7)).c;
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
                TLObject tLObject = (TLObject) ((mf0) obj).c.get(i7);
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
                org.telegram.ui.np.c0((org.telegram.ui.np) obj2, (Context) obj, view, i7);
                break;
            case 8:
                org.telegram.ui.Components.i0 i0Var = (org.telegram.ui.Components.i0) obj2;
                org.telegram.ui.ActionBar.h6 h6Var = (org.telegram.ui.ActionBar.h6) obj;
                o41 G2 = i0Var.j2.G(i7 - 1);
                if (G2 != null && G2.d == 1) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, i0Var.getContext(), h6Var);
                    String N0 = hd.N0(2131754998, null);
                    org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
                    t1Var.S = N0;
                    t1Var.U = hd.N0(2131754997, null);
                    alertDialog$Builder.h(hd.N0(2131752577, null), null);
                    alertDialog$Builder.k(hd.N0(2131751586, null), new org.telegram.ui.Components.c0(i0Var, 0));
                    alertDialog$Builder.d(-1);
                    alertDialog$Builder.p();
                    break;
                }
                break;
            case 9:
                ui uiVar2 = (ui) obj2;
                org.telegram.ui.ActionBar.h6 h6Var2 = (org.telegram.ui.ActionBar.h6) obj;
                vh vhVar = uiVar2.w3;
                mi[] miVarArr = uiVar2.u2;
                org.telegram.ui.ActionBar.g2 g2Var2 = uiVar2.a2;
                org.telegram.ui.ActionBar.g2 Q = g2Var2 == null ? LaunchActivity.Q() : g2Var2;
                if (Q != null && Q.getParentActivity() != null) {
                    if (view instanceof oi) {
                        Activity parentActivity = Q.getParentActivity();
                        int intValue = view.getTag() instanceof Integer ? ((Integer) view.getTag()).intValue() : -1;
                        if (intValue == 1) {
                            if (uiVar2.J3 || uiVar2.K3 || !uiVar2.O0()) {
                                if (!uiVar2.J3 && !uiVar2.K3) {
                                    un unVar = new un(1, uiVar2.getContext(), h6Var2, uiVar2);
                                    uiVar2.O1 = unVar;
                                    uiVar2.G1(unVar);
                                }
                                uiVar2.G1(uiVar2.e2);
                            }
                        } else if (intValue == 17) {
                            if (uiVar2.r2 == null && (g2Var2 instanceof bn)) {
                                TLRPC.User j3 = ((bn) g2Var2).j();
                                if (ui.h1(j3)) {
                                    zk zkVar = new zk(uiVar2, uiVar2.getContext(), uiVar2.H3, j3, h6Var2);
                                    uiVar2 = uiVar2;
                                    uiVar2.r2 = zkVar;
                                    miVarArr[11] = zkVar;
                                }
                            }
                            zk zkVar2 = uiVar2.r2;
                            if (zkVar2 != null) {
                                uiVar2.G1(zkVar2);
                            }
                        } else if (intValue == 3) {
                            if (uiVar2.L3 || !uiVar2.O0()) {
                                if (Build.VERSION.SDK_INT >= 33) {
                                    if (parentActivity.checkSelfPermission("android.permission.READ_MEDIA_AUDIO") != 0) {
                                        parentActivity.requestPermissions(new String[]{"android.permission.READ_MEDIA_AUDIO"}, 4);
                                        break;
                                    }
                                } else if (parentActivity.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") != 0) {
                                    org.telegram.messenger.g0.W(uiVar2.getContext()).requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 4);
                                    break;
                                }
                                uiVar2.q1(true);
                            }
                        } else if (intValue == 4) {
                            if (uiVar2.I3 || !uiVar2.O0()) {
                                if (Build.VERSION.SDK_INT >= 33) {
                                    if (parentActivity.checkSelfPermission("android.permission.READ_MEDIA_IMAGES") != 0 || parentActivity.checkSelfPermission("android.permission.READ_MEDIA_VIDEO") != 0) {
                                        parentActivity.requestPermissions(new String[]{"android.permission.READ_MEDIA_IMAGES", "android.permission.READ_MEDIA_VIDEO"}, 4);
                                        break;
                                    }
                                } else if (parentActivity.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") != 0) {
                                    org.telegram.messenger.g0.W(uiVar2.getContext()).requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 4);
                                    break;
                                }
                                uiVar2.s1(true);
                            }
                        } else if (intValue != 5) {
                            int i20 = 12;
                            if (intValue == 6) {
                                if ((uiVar2.O3 || !uiVar2.O0()) && org.telegram.messenger.g0.J1(g2Var2)) {
                                    if (uiVar2.O3) {
                                        if (uiVar2.j2 == null) {
                                            ml mlVar = new ml(uiVar2, uiVar2.getContext(), h6Var2, (uiVar2.C1 || uiVar2.P3) ? false : true);
                                            uiVar2.j2 = mlVar;
                                            miVarArr[5] = mlVar;
                                            ll llVar = uiVar2.u4;
                                            if (llVar != null) {
                                                mlVar.setDelegate(llVar);
                                            } else {
                                                mlVar.setDelegate(new dh(uiVar2, i20));
                                            }
                                        }
                                        uiVar2.G1(uiVar2.j2);
                                    } else {
                                        un unVar2 = new un(6, uiVar2.getContext(), h6Var2, uiVar2);
                                        uiVar2.O1 = unVar2;
                                        uiVar2.G1(unVar2);
                                    }
                                }
                            } else if (intValue == 9) {
                                if (uiVar2.M3 || !uiVar2.O0()) {
                                    if (uiVar2.M3) {
                                        uiVar2.I1(true, null);
                                    } else {
                                        un unVar3 = new un(9, uiVar2.getContext(), h6Var2, uiVar2);
                                        uiVar2.O1 = unVar3;
                                        uiVar2.G1(unVar3);
                                    }
                                }
                            } else if (intValue == 11) {
                                if (uiVar2.n2 == null) {
                                    kg.h0 h0Var2 = new kg.h0(uiVar2.getContext(), uiVar2.J0, uiVar2);
                                    uiVar2.n2 = h0Var2;
                                    miVarArr[7] = h0Var2;
                                    h0Var2.setupBlurredSearchField(uiVar2.F4);
                                }
                                uiVar2.G1(uiVar2.n2);
                            } else if (intValue == 12) {
                                if (uiVar2.N3 || !uiVar2.O0()) {
                                    if (uiVar2.N3) {
                                        if (uiVar2.i2 == null) {
                                            uiVar = uiVar2;
                                            tn tnVar = new tn(uiVar, uiVar.getContext(), true, h6Var2, null);
                                            uiVar.i2 = tnVar;
                                            miVarArr[1] = tnVar;
                                            tnVar.setDelegate(new dh(uiVar, i13));
                                        } else {
                                            uiVar = uiVar2;
                                        }
                                        uiVar.G1(uiVar.i2);
                                    } else {
                                        un unVar4 = new un(9, uiVar2.getContext(), h6Var2, uiVar2);
                                        uiVar2.O1 = unVar4;
                                        uiVar2.G1(unVar4);
                                    }
                                }
                            } else if (intValue == 13) {
                                if (uiVar2.p2 == null) {
                                    nk nkVar = new nk(uiVar2, uiVar2.getContext(), h6Var2, true);
                                    uiVar2.p2 = nkVar;
                                    miVarArr[8] = nkVar;
                                    nkVar.setDelegate(uiVar2.Y3);
                                }
                                uiVar2.G1(uiVar2.p2);
                            } else if (intValue == 14) {
                                if (uiVar2.o2 == null) {
                                    nk nkVar2 = new nk(uiVar2, uiVar2.getContext(), h6Var2, false);
                                    uiVar2.o2 = nkVar2;
                                    miVarArr[9] = nkVar2;
                                    nkVar2.setDelegate(uiVar2.Y3);
                                }
                                uiVar2.G1(uiVar2.o2);
                            } else if (intValue == 16) {
                                if (uiVar2.q2 == null) {
                                    oi.o oVar = new oi.o(uiVar2.H3, uiVar2.getContext(), h6Var2, uiVar2);
                                    uiVar2.q2 = oVar;
                                    miVarArr[10] = oVar;
                                }
                                uiVar2.G1(uiVar2.q2);
                            } else if (view.getTag() instanceof Integer) {
                                uiVar2.X3.y1(((Integer) view.getTag()).intValue(), true, true, 0, 0, 0L, uiVar2.g1(), false, 0L);
                            }
                        } else if (uiVar2.O3 || !uiVar2.O0()) {
                            if (uiVar2.O3 && uiVar2.getContext().checkSelfPermission("android.permission.READ_CONTACTS") != 0) {
                                org.telegram.messenger.g0.W(uiVar2.getContext()).requestPermissions(new String[]{"android.permission.READ_CONTACTS"}, 5);
                                break;
                            } else {
                                uiVar2.r1();
                            }
                        }
                    } else if (view instanceof ni) {
                        ni niVar = (ni) view;
                        TLRPC.TL_attachMenuBot tL_attachMenuBot = niVar.c;
                        if (tL_attachMenuBot == null) {
                            uiVar2.X3.h1(niVar.b);
                            uiVar2.dismiss();
                        } else if (tL_attachMenuBot.inactive) {
                            zc1.a(uiVar2.getContext(), new li.d(28, uiVar2, niVar), null);
                        } else {
                            uiVar2.D1(tL_attachMenuBot.bot_id, null, false, true);
                        }
                    }
                    int left = view.getLeft();
                    int right = view.getRight();
                    int L = org.telegram.messenger.g0.L(70.0f);
                    int i21 = left - L;
                    if (i21 < 0) {
                        vhVar.w0(i21, 0, null);
                        break;
                    } else {
                        int i22 = right + L;
                        if (i22 > vhVar.getMeasuredWidth()) {
                            vhVar.w0(i22 - vhVar.getMeasuredWidth(), 0, null);
                            break;
                        }
                    }
                }
                break;
            case 10:
                vj vjVar = (vj) obj2;
                org.telegram.ui.ActionBar.h6 h6Var3 = (org.telegram.ui.ActionBar.h6) obj;
                pj pjVar = vjVar.F;
                v4.i0 adapter = vjVar.s.getAdapter();
                rj rjVar = vjVar.G;
                if (adapter == rjVar) {
                    O = rjVar.E(i7);
                } else {
                    int S = pjVar.S(i7);
                    int Q2 = pjVar.Q(i7);
                    if (Q2 >= 0 && S >= 0) {
                        O = pjVar.O(S, Q2);
                    }
                }
                if (O != null) {
                    if (vjVar.x.isEmpty()) {
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
                        md0 md0Var = new md0(vjVar.b.a2, f5Var, null, null, null, null, str, str2, h6Var3);
                        md0Var.F1 = new ij(vjVar);
                        md0Var.show();
                        break;
                    } else {
                        vjVar.Q((uj) view, O);
                        break;
                    }
                }
                break;
            case 11:
                i70 i70Var = (i70) obj2;
                TLRPC.Chat chat = (TLRPC.Chat) obj;
                e70 e70Var = i70Var.q1;
                ArrayList arrayList4 = i70Var.t1;
                if (!i70Var.B1 && arrayList4.get(i7) != i70Var.x1) {
                    i70Var.x1 = (TLRPC.Peer) arrayList4.get(i7);
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
                    int childCount = e70Var.getChildCount();
                    for (int i23 = 0; i23 < childCount; i23++) {
                        View childAt = e70Var.getChildAt(i23);
                        if (childAt != view) {
                            if (z12) {
                                ((org.telegram.ui.Cells.i4) childAt).c(false, z10);
                            } else if (view instanceof org.telegram.ui.Cells.e7) {
                                ((org.telegram.ui.Cells.e7) childAt).b(false, z10);
                            }
                        }
                    }
                    if (i70Var.w1 != 0) {
                        i70Var.N0(chat, z10);
                        break;
                    }
                }
                break;
            case 12:
                v90 v90Var = (v90) obj2;
                s90 s90Var2 = (s90) obj;
                if (i7 == 0) {
                    v90Var.getClass();
                    break;
                } else {
                    jg.h1 adapter2 = v90Var.getAdapter();
                    if (adapter2.x0 == null || adapter2.i0) {
                        int i24 = i7 - 1;
                        Object J = v90Var.getAdapter().J(i24);
                        int i25 = v90Var.getAdapter().Y;
                        int i26 = v90Var.getAdapter().Z;
                        if (v90Var.getAdapter().G != null && i24 == 1) {
                            TLRPC.Chat chat2 = v90Var.getAdapter().m0;
                            if (chat2 == null && v90Var.getAdapter().H0 != null) {
                                chat2 = v90Var.getAdapter().H0.e;
                            }
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(v90Var.getAdapter().G);
                            s90Var2.l0(i25, i26, a8.p0.s(sb2, chat2 != null ? "@" + org.telegram.messenger.v3.K(chat2, false) : "", " "), false);
                            break;
                        } else if (v90Var.getAdapter().G != null && i24 == 0) {
                            s90Var2.l0(i25, i26, a8.p0.s(new StringBuilder(), v90Var.getAdapter().G, " "), false);
                            break;
                        } else {
                            if (J instanceof TLRPC.TL_document) {
                                if (view instanceof org.telegram.ui.Cells.y7) {
                                    ((org.telegram.ui.Cells.y7) view).getSendAnimationData();
                                }
                                TLRPC.TL_document tL_document = (TLRPC.TL_document) J;
                                s90Var2.Y(tL_document, gj.U(tL_document), v90Var.getAdapter().L(i24));
                            } else if (!(J instanceof TLRPC.Chat)) {
                                if (J instanceof TLRPC.User) {
                                    TLRPC.User user3 = (TLRPC.User) J;
                                    if (p10.o(user3) != null) {
                                        s90Var2.l0(i25, i26, "@" + p10.o(user3) + " ", false);
                                    } else {
                                        SpannableString spannableString = new SpannableString(p5.c.v(p10.k(user3, false), " "));
                                        StringBuilder sb3 = new StringBuilder("");
                                        s90Var = s90Var2;
                                        sb3.append(user3.id);
                                        spannableString.setSpan(new v41(sb3.toString(), 3, null), 0, spannableString.length(), 33);
                                        s90Var.l0(i25, i26, spannableString, false);
                                    }
                                } else {
                                    s90Var = s90Var2;
                                    if (J instanceof String) {
                                        s90Var.l0(i25, i26, J + " ", false);
                                    } else if (J instanceof org.telegram.messenger.oi) {
                                        String str7 = ((org.telegram.messenger.oi) J).a;
                                        s90Var.q0(str7);
                                        if (str7 != null) {
                                            try {
                                            } catch (Exception unused) {
                                                s90Var.l0(i25, i26, str7, true);
                                            }
                                            if (str7.startsWith("animated_")) {
                                                try {
                                                    fontMetricsInt = s90Var.P();
                                                } catch (Exception e10) {
                                                    org.telegram.messenger.a8.g(e10, false);
                                                    fontMetricsInt = null;
                                                }
                                                long parseLong = Long.parseLong(str7.substring(9));
                                                TLRPC.Document e11 = org.telegram.ui.Components.p5.e(k10.t0, parseLong);
                                                SpannableString spannableString2 = new SpannableString(gj.U(e11));
                                                spannableString2.setSpan(e11 != null ? new org.telegram.ui.Components.y5(e11, fontMetricsInt) : new org.telegram.ui.Components.y5(parseLong, fontMetricsInt), 0, spannableString2.length(), 33);
                                                s90Var.l0(i25, i26, spannableString2, false);
                                                v90Var.o(false);
                                            }
                                        }
                                        s90Var.l0(i25, i26, str7, true);
                                        v90Var.o(false);
                                    }
                                }
                                if (!(J instanceof TLRPC.BotInlineResult)) {
                                    TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) J;
                                    if ((!botInlineResult.type.equals("photo") || (botInlineResult.photo == null && botInlineResult.content == null)) && ((!botInlineResult.type.equals("gif") || (botInlineResult.document == null && botInlineResult.content == null)) && (!botInlineResult.type.equals(MediaStreamTrack.VIDEO_TRACK_KIND) || botInlineResult.document == null))) {
                                        s90Var.g(botInlineResult, true, 0);
                                        break;
                                    } else {
                                        ArrayList arrayList5 = new ArrayList(v90Var.getAdapter().S);
                                        v90Var.Q = arrayList5;
                                        PhotoViewer.p1().I2(null, v90Var.h, v90Var.a);
                                        PhotoViewer.p1().f2(arrayList5, v90Var.getAdapter().M(i24), 3, false, v90Var.R, null);
                                        break;
                                    }
                                }
                            } else {
                                String K = org.telegram.messenger.v3.K((TLRPC.Chat) J, false);
                                if (K != null) {
                                    s90Var2.l0(i25, i26, a8.p0.p("@", K, " "), false);
                                }
                            }
                            s90Var = s90Var2;
                            if (!(J instanceof TLRPC.BotInlineResult)) {
                            }
                        }
                    }
                }
                break;
            case 13:
                org.telegram.ui.Components.ff0 ff0Var = (org.telegram.ui.Components.ff0) obj2;
                HashSet hashSet = ff0Var.v1;
                bf0 bf0Var = ff0Var.n1;
                if (org.telegram.messenger.g0.E1((Context) obj)) {
                    ArrayList arrayList6 = ff0Var.A1;
                    if (arrayList6 == null || arrayList6.isEmpty()) {
                        if (view instanceof org.telegram.ui.Cells.n8) {
                            int S2 = bf0Var.S(i7) - 1;
                            int Q3 = bf0Var.Q(i7) - 1;
                            if (Q3 > 0 && S2 >= 0) {
                                ef0 ef0Var = (ef0) ff0Var.x1.get(S2);
                                if (Q3 == ef0Var.b() && !hashSet.contains(ef0Var)) {
                                    if (!ef0Var.e || ef0Var.f >= ef0Var.b.size()) {
                                        hashSet.add(ef0Var);
                                        TLRPC.TL_messages_getPollVotes tL_messages_getPollVotes = new TLRPC.TL_messages_getPollVotes();
                                        tL_messages_getPollVotes.peer = ff0Var.u1;
                                        tL_messages_getPollVotes.id = ff0Var.s1.e1();
                                        tL_messages_getPollVotes.limit = 50;
                                        int i27 = tL_messages_getPollVotes.flags;
                                        tL_messages_getPollVotes.option = ef0Var.d;
                                        tL_messages_getPollVotes.flags = i27 | 3;
                                        tL_messages_getPollVotes.offset = ef0Var.c;
                                        ConnectionsManager.getInstance(ff0Var.a).sendRequest(tL_messages_getPollVotes, new org.telegram.ui.u7(20, ff0Var, ef0Var));
                                        break;
                                    } else {
                                        int min = Math.min(ef0Var.f + 50, ef0Var.b.size());
                                        ef0Var.f = min;
                                        if (min == ef0Var.b.size()) {
                                            ef0Var.e = false;
                                        }
                                        ff0Var.K0(null);
                                        bf0Var.X(true);
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
                                ff0Var.dismiss();
                                org.telegram.ui.ActionBar.g2 T = LaunchActivity.T();
                                if (T != null) {
                                    ProfileActivity profileActivity = new ProfileActivity(bundle3, null);
                                    if (T instanceof bn) {
                                        if (pollVotesAlert$UserCell.h != null) {
                                            TLRPC.User j10 = ((bn) T).j();
                                            ff0Var.m1.getChildAt(0);
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
                g11 g11Var = (g11) obj2;
                EditText editText = g11Var.w;
                long a11 = ((c11) g11Var.s.c.get(i7)).a();
                bn bnVar2 = ((ek) obj).a;
                if (bnVar2.Z9()) {
                    bn.M2(a11, bnVar2);
                } else {
                    a21 a21Var = bnVar2.g2;
                    if (a21Var != null) {
                        a21Var.n(a11, false);
                    }
                }
                boolean i28 = g11Var.i();
                g11Var.V = 0L;
                g11Var.W = null;
                if (editText.length() > 0) {
                    editText.setText("");
                } else if (i28) {
                    g11Var.l(false);
                    g11Var.n();
                }
                editText.clearFocus();
                g11Var.e();
                break;
            case 15:
                m31 m31Var = (m31) obj2;
                org.telegram.ui.ActionBar.h6 h6Var4 = (org.telegram.ui.ActionBar.h6) obj;
                o41 G3 = m31Var.f2.G(i7 - 1);
                if (G3 != null) {
                    int i29 = G3.d;
                    if (i29 == 1) {
                        CharSequence charSequence = m31Var.Y1;
                        if (charSequence != null && !m31Var.X1) {
                            org.telegram.messenger.g0.g(charSequence);
                            break;
                        }
                    } else if (i29 == 2) {
                        if (k10.i(m31Var.a).q()) {
                            np.u1(m31Var.a).v7.K(0L, !r0.B(0L));
                            m31Var.dismiss();
                            break;
                        } else if (LaunchActivity.T() != null) {
                            new ug.y0(13, m31Var.getContext(), h6Var4).show();
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
                        new lc(q0Var.c, q0Var.J0).G(R.raw.chats_infotip, 5, org.telegram.messenger.g0.W2(hd.G((int) np.u1(k10.t0).s0, "BoostingWaitWarningPlural", new Object[0]))).k(true);
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
