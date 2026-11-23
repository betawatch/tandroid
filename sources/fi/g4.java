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
import c8.na;
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
import org.telegram.messenger.i10;
import org.telegram.messenger.ks;
import org.telegram.messenger.mp;
import org.telegram.messenger.n10;
import org.telegram.messenger.r00;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.PollVotesAlert$UserCell;
import org.telegram.ui.Components.af0;
import org.telegram.ui.Components.b11;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.b70;
import org.telegram.ui.Components.bp0;
import org.telegram.ui.Components.ch;
import org.telegram.ui.Components.df0;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.f11;
import org.telegram.ui.Components.f70;
import org.telegram.ui.Components.hj;
import org.telegram.ui.Components.j01;
import org.telegram.ui.Components.jl;
import org.telegram.ui.Components.jp;
import org.telegram.ui.Components.kc;
import org.telegram.ui.Components.kd0;
import org.telegram.ui.Components.kl;
import org.telegram.ui.Components.l31;
import org.telegram.ui.Components.li;
import org.telegram.ui.Components.lk;
import org.telegram.ui.Components.mi;
import org.telegram.ui.Components.n41;
import org.telegram.ui.Components.ni;
import org.telegram.ui.Components.oj;
import org.telegram.ui.Components.p90;
import org.telegram.ui.Components.qb0;
import org.telegram.ui.Components.qj;
import org.telegram.ui.Components.qj0;
import org.telegram.ui.Components.qn;
import org.telegram.ui.Components.rn;
import org.telegram.ui.Components.s90;
import org.telegram.ui.Components.ti;
import org.telegram.ui.Components.tj;
import org.telegram.ui.Components.u41;
import org.telegram.ui.Components.uh;
import org.telegram.ui.Components.uj;
import org.telegram.ui.Components.x50;
import org.telegram.ui.Components.xk;
import org.telegram.ui.Components.z11;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PrivacySettingsActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.UsersSelectActivity;
import org.telegram.ui.bn;
import org.telegram.ui.d61;
import org.telegram.ui.dc;
import org.telegram.ui.ef0;
import org.telegram.ui.ek;
import org.telegram.ui.hc;
import org.telegram.ui.j90;
import org.telegram.ui.jx;
import org.telegram.ui.lf0;
import org.telegram.ui.mb0;
import org.telegram.ui.np;
import org.telegram.ui.qc;
import org.telegram.ui.re0;
import org.telegram.ui.wh0;
import org.telegram.ui.wt;
import org.telegram.ui.x00;
import org.telegram.ui.xc1;
import org.telegram.ui.y40;
import org.webrtc.MediaStreamTrack;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
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
        bp0 bp0Var;
        wt wtVar = (wt) this.b;
        org.telegram.ui.ActionBar.g2 g2Var = (org.telegram.ui.ActionBar.g2) this.c;
        jp jpVar = (jp) wtVar.c.d.get(i7);
        org.telegram.ui.ActionBar.m6 i13 = jpVar.a.i(wtVar.r);
        ig.b bVar = jpVar.a.c;
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
            ig.b bVar2 = jpVar.a.c;
            if (bVar2 != null && (str2 = bVar2.b) == null) {
                str2 = bVar2.a;
            }
            if (!str2.equals("🎨")) {
                i10 = -1;
                if (i13 == null) {
                    TLRPC.TL_theme tL_theme = ((org.telegram.ui.ActionBar.r3) jpVar.a.f.get(wtVar.r)).b;
                    org.telegram.ui.ActionBar.m6 Q0 = org.telegram.ui.ActionBar.n6.Q0(org.telegram.ui.ActionBar.n6.r0(tL_theme.settings.get(((org.telegram.ui.ActionBar.r3) jpVar.a.f.get(wtVar.r)).d)));
                    if (Q0 != null) {
                        org.telegram.ui.ActionBar.k6 k6Var = (org.telegram.ui.ActionBar.k6) Q0.d0.get(tL_theme.id);
                        if (k6Var == null) {
                            k6Var = Q0.f(tL_theme, g2Var.getCurrentAccount(), 0);
                        }
                        i10 = k6Var.a;
                        Q0.u(i10);
                    }
                    i13 = Q0;
                }
                org.telegram.ui.ActionBar.n6.K1(i13, false, i10, view);
                wtVar.h = i7;
                i11 = 0;
                while (true) {
                    z10 = true;
                    if (i11 < wtVar.c.d.size()) {
                        break;
                    }
                    jp jpVar2 = (jp) wtVar.c.d.get(i11);
                    if (i11 != wtVar.h) {
                        z10 = false;
                    }
                    jpVar2.d = z10;
                    i11++;
                }
                wtVar.c.E(wtVar.h);
                for (i12 = 0; i12 < wtVar.a.getChildCount(); i12++) {
                    j01 j01Var = (j01) wtVar.a.getChildAt(i12);
                    if (j01Var != view && (bp0Var = j01Var.K) != null) {
                        org.telegram.messenger.g0.r(bp0Var);
                        j01Var.K.run();
                    }
                }
                ((j01) view).d();
                if (i13 != null) {
                    SharedPreferences.Editor edit = org.telegram.messenger.t0.b.getSharedPreferences("themeconfig", 0).edit();
                    edit.putString((wtVar.n == 1 || i13.q()) ? "lastDarkTheme" : "lastDayTheme", i13.m());
                    edit.commit();
                }
                org.telegram.ui.ActionBar.n6.M1(g2Var);
            }
        }
        i10 = ((org.telegram.ui.ActionBar.r3) jpVar.a.f.get(wtVar.r)).e;
        if (i13 == null) {
        }
        org.telegram.ui.ActionBar.n6.K1(i13, false, i10, view);
        wtVar.h = i7;
        i11 = 0;
        while (true) {
            z10 = true;
            if (i11 < wtVar.c.d.size()) {
            }
            jpVar2.d = z10;
            i11++;
        }
        wtVar.c.E(wtVar.h);
        while (i12 < wtVar.a.getChildCount()) {
        }
        ((j01) view).d();
        if (i13 != null) {
        }
        org.telegram.ui.ActionBar.n6.M1(g2Var);
    }

    private final void c(int i7, View view) {
        ef0 ef0Var = (ef0) this.b;
        Context context = (Context) this.c;
        HashMap hashMap = ef0Var.l0;
        if (i7 == ef0Var.R) {
            TLRPC.User user = (TLRPC.User) hashMap.get(Long.valueOf(ef0Var.e.admin_id));
            if (user != null) {
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", user.id);
                mp.u1(i10.t0).e4(user, false, false);
                ef0Var.presentFragment(new ProfileActivity(bundle, null));
                return;
            }
            return;
        }
        if (i7 == ef0Var.y) {
            j90 j90Var = new j90(0, ef0Var.n);
            j90Var.T = ef0Var.t0;
            ef0Var.presentFragment(j90Var);
            return;
        }
        int i10 = ef0Var.E;
        if (i7 >= i10 && i7 < ef0Var.F) {
            x50 x50Var = new x50(context, (TLRPC.TL_chatInviteExported) ef0Var.j0.get(i7 - i10), ef0Var.d, hashMap, ef0Var, ef0Var.n, false, ef0Var.h);
            ef0Var.m0 = x50Var;
            x50Var.f2 = ef0Var.q0;
            x50Var.show();
            return;
        }
        int i11 = ef0Var.I;
        if (i7 >= i11 && i7 < ef0Var.J) {
            x50 x50Var2 = new x50(context, (TLRPC.TL_chatInviteExported) ef0Var.k0.get(i7 - i11), ef0Var.d, hashMap, ef0Var, ef0Var.n, false, ef0Var.h);
            ef0Var.m0 = x50Var2;
            x50Var2.show();
            return;
        }
        if (i7 == ef0Var.O) {
            if (ef0Var.d0) {
                return;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ef0Var.getParentActivity());
            String N0 = gd.N0(2131751563, null);
            org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
            t1Var.S = N0;
            t1Var.U = gd.N0(2131751564, null);
            alertDialog$Builder.k(gd.N0(2131751586, null), new re0(ef0Var));
            alertDialog$Builder.h(gd.N0(2131752577, null), null);
            ef0Var.showDialog(t1Var);
            return;
        }
        int i12 = ef0Var.V;
        if (i7 < i12 || i7 >= ef0Var.W) {
            return;
        }
        TLRPC.TL_chatAdminWithInvites tL_chatAdminWithInvites = (TLRPC.TL_chatAdminWithInvites) ef0Var.n0.get(i7 - i12);
        if (hashMap.containsKey(Long.valueOf(tL_chatAdminWithInvites.admin_id))) {
            ef0Var.getMessagesController().e4((TLRPC.User) hashMap.get(Long.valueOf(tL_chatAdminWithInvites.admin_id)), false, false);
        }
        ef0 ef0Var2 = new ef0(ef0Var.n, tL_chatAdminWithInvites.invites_count, tL_chatAdminWithInvites.admin_id);
        ef0Var2.m0(ef0Var.d, null);
        ef0Var.presentFragment(ef0Var2);
    }

    private final void d(int i7, View view) {
        org.telegram.ui.Components.e4 e4Var;
        s2.e eVar;
        wg.z zVar = (wg.z) this.b;
        org.telegram.ui.ActionBar.g2 g2Var = (org.telegram.ui.ActionBar.g2) this.c;
        ArrayList arrayList = zVar.Z1;
        wg.s sVar = zVar.u2;
        if (view instanceof yg.y) {
            yg.y yVar = (yg.y) view;
            int type = yVar.getType();
            boolean z10 = yVar.e.h;
            boolean z11 = !z10;
            yVar.setChecked(z11);
            int i10 = yg.y.M;
            if (type == 0) {
                zVar.t2 = z11;
                zVar.l1(false, false);
            } else if (type == 1) {
                yVar.setDivider(z11);
                zVar.s2 = z11;
                zVar.l1(false, false);
                xg.b bVar = zVar.c2;
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
                zVar.c2.G();
                if (zVar.s2) {
                    org.telegram.messenger.g0.r(sVar);
                } else {
                    org.telegram.messenger.g0.h3(sVar, 250L);
                }
            }
        }
        if (view instanceof yg.c) {
            if (view instanceof yg.d) {
                int selectedType = ((yg.d) view).getSelectedType();
                int i14 = yg.d.w;
                if (selectedType == 2 || selectedType == 3) {
                    if (selectedType == 2 && zVar.d2 == selectedType) {
                        s2.e eVar2 = zVar.n2;
                        if (eVar2 != null) {
                            ((wg.v0) eVar2.b).i1(1, arrayList);
                            ((wg.l) eVar2.c).m1.C(1);
                            return;
                        }
                        return;
                    }
                    zVar.d2 = selectedType;
                    zVar.l1(true, true);
                    zVar.k1(true);
                    zVar.c1();
                } else if (selectedType == 1) {
                    s2.e eVar3 = zVar.n2;
                    if (eVar3 != null) {
                        ((wg.v0) eVar3.b).i1(1, arrayList);
                        ((wg.l) eVar3.c).m1.C(1);
                    }
                } else {
                    zVar.e2 = selectedType;
                    zVar.l1(true, true);
                    zVar.k1(true);
                    zVar.c1();
                }
            } else {
                yg.c cVar = (yg.c) view;
                ek0 ek0Var = zVar.o1;
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
            if (zVar.f2 == selectedType2 && (eVar = zVar.n2) != null) {
                ((wg.v0) eVar.b).i1(3, zVar.a2);
                ((wg.l) eVar.c).m1.C(1);
            }
            zVar.f2 = selectedType2;
            zVar.l1(false, false);
            return;
        }
        if (view instanceof yg.i) {
            zVar.h2 = ((TLRPC.TL_premiumGiftCodeOption) ((yg.i) view).getGifCode()).months;
            zVar.l1(false, false);
            zVar.c2.G();
            return;
        }
        if (!(view instanceof yg.h)) {
            if (view instanceof yg.b) {
                s2.e eVar4 = zVar.n2;
                if (eVar4 != null) {
                    ((wg.v0) eVar4.b).i1(2, zVar.Y1);
                    ((wg.l) eVar4.c).m1.C(1);
                    return;
                }
                return;
            }
            if (!(view instanceof yg.w)) {
                if (view instanceof xa) {
                    zVar.g2 = true;
                    zVar.l1(true, true);
                    return;
                }
                return;
            }
            TL_stars.TL_starsGiveawayOption option = ((yg.w) view).getOption();
            if (option != null) {
                zVar.l2 = option.stars;
                zVar.l1(true, true);
                zVar.k1(true);
                zVar.c1();
                return;
            }
            return;
        }
        Context context = g2Var.getContext();
        long j3 = zVar.i2;
        wg.t tVar = new wg.t(zVar);
        org.telegram.ui.ActionBar.i6 i6Var = zVar.J0;
        org.telegram.ui.Components.y4 y4Var = new org.telegram.ui.Components.y4(i6Var);
        h6.o oVar = new h6.o(context, i6Var);
        ((org.telegram.ui.ActionBar.w2) oVar.b).w0 = false;
        qb0 qb0Var = new qb0(context, i6Var);
        int i16 = y4Var.a;
        qb0Var.setTextColor(i16);
        qb0Var.setTextOffset(org.telegram.messenger.g0.L(10.0f));
        qb0Var.setItemCount(5);
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
        org.telegram.ui.Components.e4 e4Var2 = new org.telegram.ui.Components.e4(context, y4Var, qb0Var, fVar, gVar);
        e4Var2.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        e4Var2.addView(frameLayout, na.t(-1, -2, 51, 22, 0, 0, 4));
        TextView textView = new TextView(context);
        textView.setText(gd.N0(2131753284, "BoostingSelectDateTime"));
        textView.setTextColor(i16);
        i5.c.x(textView, 1, 20.0f);
        frameLayout.addView(textView, na.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
        textView.setOnTouchListener(new gi.a(2));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setWeightSum(1.0f);
        e4Var2.addView(linearLayout, na.q(-1, -2, 1.0f, 0, 0, 12, 0, 12));
        long currentTimeMillis = System.currentTimeMillis();
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(currentTimeMillis);
        int i17 = calendar.get(1);
        mb0 mb0Var = new mb0(context, 5);
        long j10 = mp.u1(i10.t0).p0 * 1000;
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTimeInMillis(j10);
        int i18 = calendar2.get(6);
        calendar2.setTimeInMillis(System.currentTimeMillis());
        calendar2.add(14, (int) j10);
        int i19 = calendar2.get(11);
        int i20 = calendar.get(12);
        linearLayout.addView(qb0Var, na.l(0.5f, 0, ks.t4));
        qb0Var.setMinValue(0);
        qb0Var.setMaxValue(i18 - 1);
        qb0Var.setWrapSelectorWheel(false);
        qb0Var.setTag("DAY");
        qb0Var.setFormatter(new x00(currentTimeMillis, calendar, i17, 1));
        ki.w3 w3Var = new ki.w3(e4Var2, fVar, gVar, i19, i20, qb0Var);
        qb0Var.setOnValueChangedListener(w3Var);
        fVar.setMinValue(0);
        fVar.setMaxValue(23);
        linearLayout.addView(fVar, na.l(0.2f, 0, ks.t4));
        fVar.setFormatter(new ug.x(18));
        fVar.setOnValueChangedListener(w3Var);
        gVar.setMinValue(0);
        gVar.setMaxValue(11);
        gVar.setValue(0);
        gVar.setFormatter(new ug.x(19));
        linearLayout.addView(gVar, na.l(0.3f, 0, ks.t4));
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
            qb0Var.setValue(timeInMillis);
            qb0Var.getValue();
            w3Var.o(qb0Var, qb0Var.getValue());
            fVar.getValue();
            w3Var.o(fVar, fVar.getValue());
        } else {
            e4Var = e4Var2;
        }
        mb0Var.setPadding(org.telegram.messenger.g0.L(34.0f), 0, org.telegram.messenger.g0.L(34.0f), 0);
        mb0Var.setGravity(17);
        mb0Var.setTextColor(y4Var.g);
        mb0Var.setTextSize(1, 14.0f);
        mb0Var.setTypeface(org.telegram.messenger.g0.o());
        mb0Var.setBackground(org.telegram.ui.ActionBar.b6.e(y4Var.h, 8.0f));
        mb0Var.setText(gd.N0(2131753540, "BoostingConfirm"));
        e4Var.addView(mb0Var, na.t(-1, 48, 83, 16, 15, 16, 16));
        mb0Var.setOnClickListener(new org.telegram.ui.Components.v1(calendar, qb0Var, fVar, gVar, tVar, oVar));
        org.telegram.ui.ActionBar.w2 w2Var = (org.telegram.ui.ActionBar.w2) oVar.b;
        w2Var.O = e4Var;
        w2Var.show();
        int i21 = y4Var.b;
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
    public final void b(int i7, View view) {
        int i10;
        ArrayList arrayList;
        TL_stories.TL_storyReactionPublicRepost tL_storyReactionPublicRepost;
        TL_stories.StoryItem storyItem;
        n41 G;
        int i11;
        ti tiVar;
        Object O;
        org.telegram.messenger.f5 f5Var;
        String str;
        String str2;
        String str3;
        String str4;
        boolean z10;
        p90 p90Var;
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
                ai.d0 d0Var = (ai.d0) obj;
                b51 b51Var = pVar.V1;
                if (b51Var != null && (G = b51Var.G(i7 - 1)) != null) {
                    Object obj3 = G.H;
                    if (obj3 instanceof r00) {
                        d0Var.a(((r00) obj3).a);
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
                d61 d61Var = hcVar.b;
                cp cpVar = mp.u1(i19).t4;
                if (cpVar != null) {
                    ArrayList arrayList3 = cpVar.c;
                    if (i7 >= 0 && i7 < arrayList3.size()) {
                        i11 = ((bp) arrayList3.get(i7)).c;
                        qcVar.f = i11;
                        qcVar.e1(true);
                        qcVar.h1(true);
                        qcVar.i1();
                        if (view.getLeft() >= org.telegram.messenger.g0.L(24.0f) + d61Var.getPaddingLeft()) {
                            d61Var.w0(-((org.telegram.messenger.g0.L(48.0f) + d61Var.getPaddingLeft()) - view.getLeft()), 0, null);
                            break;
                        } else if (view.getWidth() + view.getLeft() > (d61Var.getMeasuredWidth() - d61Var.getPaddingRight()) - org.telegram.messenger.g0.L(24.0f)) {
                            d61Var.w0(org.telegram.messenger.f3.B(48.0f, d61Var.getMeasuredWidth() - d61Var.getPaddingRight(), view.getWidth() + view.getLeft()), 0, null);
                            break;
                        }
                    }
                }
                i11 = 0;
                qcVar.f = i11;
                qcVar.e1(true);
                qcVar.h1(true);
                qcVar.i1();
                if (view.getLeft() >= org.telegram.messenger.g0.L(24.0f) + d61Var.getPaddingLeft()) {
                }
                break;
            case 6:
                bn bnVar = (bn) obj2;
                bnVar.getClass();
                TLObject tLObject = (TLObject) ((lf0) obj).c.get(i7);
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
                n41 G2 = h0Var.j2.G(i7 - 1);
                if (G2 != null && G2.d == 1) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, h0Var.getContext(), i6Var);
                    String N0 = gd.N0(2131754998, null);
                    org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
                    t1Var.S = N0;
                    t1Var.U = gd.N0(2131754997, null);
                    alertDialog$Builder.h(gd.N0(2131752577, null), null);
                    alertDialog$Builder.k(gd.N0(2131751586, null), new org.telegram.ui.Components.b0(h0Var, 0));
                    alertDialog$Builder.d(-1);
                    alertDialog$Builder.p();
                    break;
                }
                break;
            case 9:
                ti tiVar2 = (ti) obj2;
                org.telegram.ui.ActionBar.i6 i6Var2 = (org.telegram.ui.ActionBar.i6) obj;
                uh uhVar = tiVar2.w3;
                li[] liVarArr = tiVar2.u2;
                org.telegram.ui.ActionBar.g2 g2Var2 = tiVar2.a2;
                org.telegram.ui.ActionBar.g2 Q = g2Var2 == null ? LaunchActivity.Q() : g2Var2;
                if (Q != null && Q.getParentActivity() != null) {
                    if (view instanceof ni) {
                        Activity parentActivity = Q.getParentActivity();
                        int intValue = view.getTag() instanceof Integer ? ((Integer) view.getTag()).intValue() : -1;
                        if (intValue == 1) {
                            if (tiVar2.J3 || tiVar2.K3 || !tiVar2.O0()) {
                                if (!tiVar2.J3 && !tiVar2.K3) {
                                    rn rnVar = new rn(1, tiVar2.getContext(), i6Var2, tiVar2);
                                    tiVar2.O1 = rnVar;
                                    tiVar2.G1(rnVar);
                                }
                                tiVar2.G1(tiVar2.e2);
                            }
                        } else if (intValue == 17) {
                            if (tiVar2.r2 == null && (g2Var2 instanceof bn)) {
                                TLRPC.User j3 = ((bn) g2Var2).j();
                                if (ti.h1(j3)) {
                                    xk xkVar = new xk(tiVar2, tiVar2.getContext(), tiVar2.H3, j3, i6Var2);
                                    tiVar2 = tiVar2;
                                    tiVar2.r2 = xkVar;
                                    liVarArr[11] = xkVar;
                                }
                            }
                            xk xkVar2 = tiVar2.r2;
                            if (xkVar2 != null) {
                                tiVar2.G1(xkVar2);
                            }
                        } else if (intValue == 3) {
                            if (tiVar2.L3 || !tiVar2.O0()) {
                                if (Build.VERSION.SDK_INT >= 33) {
                                    if (parentActivity.checkSelfPermission("android.permission.READ_MEDIA_AUDIO") != 0) {
                                        parentActivity.requestPermissions(new String[]{"android.permission.READ_MEDIA_AUDIO"}, 4);
                                        break;
                                    }
                                } else if (parentActivity.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") != 0) {
                                    org.telegram.messenger.g0.W(tiVar2.getContext()).requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 4);
                                    break;
                                }
                                tiVar2.q1(true);
                            }
                        } else if (intValue == 4) {
                            if (tiVar2.I3 || !tiVar2.O0()) {
                                if (Build.VERSION.SDK_INT >= 33) {
                                    if (parentActivity.checkSelfPermission("android.permission.READ_MEDIA_IMAGES") != 0 || parentActivity.checkSelfPermission("android.permission.READ_MEDIA_VIDEO") != 0) {
                                        parentActivity.requestPermissions(new String[]{"android.permission.READ_MEDIA_IMAGES", "android.permission.READ_MEDIA_VIDEO"}, 4);
                                        break;
                                    }
                                } else if (parentActivity.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") != 0) {
                                    org.telegram.messenger.g0.W(tiVar2.getContext()).requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 4);
                                    break;
                                }
                                tiVar2.s1(true);
                            }
                        } else if (intValue != 5) {
                            int i20 = 12;
                            if (intValue == 6) {
                                if ((tiVar2.O3 || !tiVar2.O0()) && org.telegram.messenger.g0.J1(g2Var2)) {
                                    if (tiVar2.O3) {
                                        if (tiVar2.j2 == null) {
                                            kl klVar = new kl(tiVar2, tiVar2.getContext(), i6Var2, (tiVar2.C1 || tiVar2.P3) ? false : true);
                                            tiVar2.j2 = klVar;
                                            liVarArr[5] = klVar;
                                            jl jlVar = tiVar2.u4;
                                            if (jlVar != null) {
                                                klVar.setDelegate(jlVar);
                                            } else {
                                                klVar.setDelegate(new ch(tiVar2, i20));
                                            }
                                        }
                                        tiVar2.G1(tiVar2.j2);
                                    } else {
                                        rn rnVar2 = new rn(6, tiVar2.getContext(), i6Var2, tiVar2);
                                        tiVar2.O1 = rnVar2;
                                        tiVar2.G1(rnVar2);
                                    }
                                }
                            } else if (intValue == 9) {
                                if (tiVar2.M3 || !tiVar2.O0()) {
                                    if (tiVar2.M3) {
                                        tiVar2.I1(true, null);
                                    } else {
                                        rn rnVar3 = new rn(9, tiVar2.getContext(), i6Var2, tiVar2);
                                        tiVar2.O1 = rnVar3;
                                        tiVar2.G1(rnVar3);
                                    }
                                }
                            } else if (intValue == 11) {
                                if (tiVar2.n2 == null) {
                                    kg.h0 h0Var2 = new kg.h0(tiVar2.getContext(), tiVar2.J0, tiVar2);
                                    tiVar2.n2 = h0Var2;
                                    liVarArr[7] = h0Var2;
                                    h0Var2.setupBlurredSearchField(tiVar2.F4);
                                }
                                tiVar2.G1(tiVar2.n2);
                            } else if (intValue == 12) {
                                if (tiVar2.N3 || !tiVar2.O0()) {
                                    if (tiVar2.N3) {
                                        if (tiVar2.i2 == null) {
                                            tiVar = tiVar2;
                                            qn qnVar = new qn(tiVar, tiVar.getContext(), true, i6Var2, null);
                                            tiVar.i2 = qnVar;
                                            liVarArr[1] = qnVar;
                                            qnVar.setDelegate(new ch(tiVar, i13));
                                        } else {
                                            tiVar = tiVar2;
                                        }
                                        tiVar.G1(tiVar.i2);
                                    } else {
                                        rn rnVar4 = new rn(9, tiVar2.getContext(), i6Var2, tiVar2);
                                        tiVar2.O1 = rnVar4;
                                        tiVar2.G1(rnVar4);
                                    }
                                }
                            } else if (intValue == 13) {
                                if (tiVar2.p2 == null) {
                                    lk lkVar = new lk(tiVar2, tiVar2.getContext(), i6Var2, true);
                                    tiVar2.p2 = lkVar;
                                    liVarArr[8] = lkVar;
                                    lkVar.setDelegate(tiVar2.Y3);
                                }
                                tiVar2.G1(tiVar2.p2);
                            } else if (intValue == 14) {
                                if (tiVar2.o2 == null) {
                                    lk lkVar2 = new lk(tiVar2, tiVar2.getContext(), i6Var2, false);
                                    tiVar2.o2 = lkVar2;
                                    liVarArr[9] = lkVar2;
                                    lkVar2.setDelegate(tiVar2.Y3);
                                }
                                tiVar2.G1(tiVar2.o2);
                            } else if (intValue == 16) {
                                if (tiVar2.q2 == null) {
                                    oi.p pVar2 = new oi.p(tiVar2.H3, tiVar2.getContext(), i6Var2, tiVar2);
                                    tiVar2.q2 = pVar2;
                                    liVarArr[10] = pVar2;
                                }
                                tiVar2.G1(tiVar2.q2);
                            } else if (view.getTag() instanceof Integer) {
                                tiVar2.X3.y1(((Integer) view.getTag()).intValue(), true, true, 0, 0, 0L, tiVar2.g1(), false, 0L);
                            }
                        } else if (tiVar2.O3 || !tiVar2.O0()) {
                            if (tiVar2.O3 && tiVar2.getContext().checkSelfPermission("android.permission.READ_CONTACTS") != 0) {
                                org.telegram.messenger.g0.W(tiVar2.getContext()).requestPermissions(new String[]{"android.permission.READ_CONTACTS"}, 5);
                                break;
                            } else {
                                tiVar2.r1();
                            }
                        }
                    } else if (view instanceof mi) {
                        mi miVar = (mi) view;
                        TLRPC.TL_attachMenuBot tL_attachMenuBot = miVar.c;
                        if (tL_attachMenuBot == null) {
                            tiVar2.X3.h1(miVar.b);
                            tiVar2.dismiss();
                        } else if (tL_attachMenuBot.inactive) {
                            xc1.a(tiVar2.getContext(), new ki.n2(29, tiVar2, miVar), null);
                        } else {
                            tiVar2.D1(tL_attachMenuBot.bot_id, null, false, true);
                        }
                    }
                    int left = view.getLeft();
                    int right = view.getRight();
                    int L = org.telegram.messenger.g0.L(70.0f);
                    int i21 = left - L;
                    if (i21 < 0) {
                        uhVar.w0(i21, 0, null);
                        break;
                    } else {
                        int i22 = right + L;
                        if (i22 > uhVar.getMeasuredWidth()) {
                            uhVar.w0(i22 - uhVar.getMeasuredWidth(), 0, null);
                            break;
                        }
                    }
                }
                break;
            case 10:
                uj ujVar = (uj) obj2;
                org.telegram.ui.ActionBar.i6 i6Var3 = (org.telegram.ui.ActionBar.i6) obj;
                oj ojVar = ujVar.F;
                v4.i0 adapter = ujVar.s.getAdapter();
                qj qjVar = ujVar.G;
                if (adapter == qjVar) {
                    O = qjVar.E(i7);
                } else {
                    int S = ojVar.S(i7);
                    int Q2 = ojVar.Q(i7);
                    if (Q2 >= 0 && S >= 0) {
                        O = ojVar.O(S, Q2);
                    }
                }
                if (O != null) {
                    if (ujVar.x.isEmpty()) {
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
                        kd0 kd0Var = new kd0(ujVar.b.a2, f5Var, null, null, null, null, str, str2, i6Var3);
                        kd0Var.F1 = new hj(ujVar);
                        kd0Var.show();
                        break;
                    } else {
                        ujVar.Q((tj) view, O);
                        break;
                    }
                }
                break;
            case 11:
                f70 f70Var = (f70) obj2;
                TLRPC.Chat chat = (TLRPC.Chat) obj;
                b70 b70Var = f70Var.q1;
                ArrayList arrayList4 = f70Var.t1;
                if (!f70Var.B1 && arrayList4.get(i7) != f70Var.x1) {
                    f70Var.x1 = (TLRPC.Peer) arrayList4.get(i7);
                    boolean z12 = view instanceof org.telegram.ui.Cells.i4;
                    if (z12) {
                        z10 = true;
                        ((org.telegram.ui.Cells.i4) view).c(true, true);
                    } else {
                        z10 = true;
                        if (view instanceof org.telegram.ui.Cells.d7) {
                            ((org.telegram.ui.Cells.d7) view).b(true, true);
                            view.invalidate();
                        }
                    }
                    int childCount = b70Var.getChildCount();
                    for (int i23 = 0; i23 < childCount; i23++) {
                        View childAt = b70Var.getChildAt(i23);
                        if (childAt != view) {
                            if (z12) {
                                ((org.telegram.ui.Cells.i4) childAt).c(false, z10);
                            } else if (view instanceof org.telegram.ui.Cells.d7) {
                                ((org.telegram.ui.Cells.d7) childAt).b(false, z10);
                            }
                        }
                    }
                    if (f70Var.w1 != 0) {
                        f70Var.N0(chat, z10);
                        break;
                    }
                }
                break;
            case 12:
                s90 s90Var = (s90) obj2;
                p90 p90Var2 = (p90) obj;
                if (i7 == 0) {
                    s90Var.getClass();
                    break;
                } else {
                    jg.h1 adapter2 = s90Var.getAdapter();
                    if (adapter2.x0 == null || adapter2.i0) {
                        int i24 = i7 - 1;
                        Object J = s90Var.getAdapter().J(i24);
                        int i25 = s90Var.getAdapter().Y;
                        int i26 = s90Var.getAdapter().Z;
                        if (s90Var.getAdapter().G != null && i24 == 1) {
                            TLRPC.Chat chat2 = s90Var.getAdapter().m0;
                            if (chat2 == null && s90Var.getAdapter().H0 != null) {
                                chat2 = s90Var.getAdapter().H0.e;
                            }
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(s90Var.getAdapter().G);
                            p90Var2.x2(i25, i26, a8.p0.s(sb2, chat2 != null ? "@" + org.telegram.messenger.v3.K(chat2, false) : "", " "), false);
                            break;
                        } else if (s90Var.getAdapter().G != null && i24 == 0) {
                            p90Var2.x2(i25, i26, a8.p0.s(new StringBuilder(), s90Var.getAdapter().G, " "), false);
                            break;
                        } else {
                            if (J instanceof TLRPC.TL_document) {
                                if (view instanceof org.telegram.ui.Cells.x7) {
                                    ((org.telegram.ui.Cells.x7) view).getSendAnimationData();
                                }
                                TLRPC.TL_document tL_document = (TLRPC.TL_document) J;
                                p90Var2.G1(tL_document, fj.U(tL_document), s90Var.getAdapter().L(i24));
                            } else if (!(J instanceof TLRPC.Chat)) {
                                if (J instanceof TLRPC.User) {
                                    TLRPC.User user3 = (TLRPC.User) J;
                                    if (n10.o(user3) != null) {
                                        p90Var2.x2(i25, i26, "@" + n10.o(user3) + " ", false);
                                    } else {
                                        SpannableString spannableString = new SpannableString(p5.c.v(n10.k(user3, false), " "));
                                        StringBuilder sb3 = new StringBuilder("");
                                        p90Var = p90Var2;
                                        sb3.append(user3.id);
                                        spannableString.setSpan(new u41(sb3.toString(), 3, null), 0, spannableString.length(), 33);
                                        p90Var.x2(i25, i26, spannableString, false);
                                    }
                                } else {
                                    p90Var = p90Var2;
                                    if (J instanceof String) {
                                        p90Var.x2(i25, i26, J + " ", false);
                                    } else if (J instanceof org.telegram.messenger.ni) {
                                        String str7 = ((org.telegram.messenger.ni) J).a;
                                        p90Var.E2(str7);
                                        if (str7 != null) {
                                            try {
                                            } catch (Exception unused) {
                                                p90Var.x2(i25, i26, str7, true);
                                            }
                                            if (str7.startsWith("animated_")) {
                                                try {
                                                    fontMetricsInt = p90Var.j1();
                                                } catch (Exception e10) {
                                                    org.telegram.messenger.a8.g(e10, false);
                                                    fontMetricsInt = null;
                                                }
                                                long parseLong = Long.parseLong(str7.substring(9));
                                                TLRPC.Document e11 = org.telegram.ui.Components.o5.e(i10.t0, parseLong);
                                                SpannableString spannableString2 = new SpannableString(fj.U(e11));
                                                spannableString2.setSpan(e11 != null ? new org.telegram.ui.Components.x5(e11, fontMetricsInt) : new org.telegram.ui.Components.x5(parseLong, fontMetricsInt), 0, spannableString2.length(), 33);
                                                p90Var.x2(i25, i26, spannableString2, false);
                                                s90Var.o(false);
                                            }
                                        }
                                        p90Var.x2(i25, i26, str7, true);
                                        s90Var.o(false);
                                    }
                                }
                                if (!(J instanceof TLRPC.BotInlineResult)) {
                                    TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) J;
                                    if ((!botInlineResult.type.equals("photo") || (botInlineResult.photo == null && botInlineResult.content == null)) && ((!botInlineResult.type.equals("gif") || (botInlineResult.document == null && botInlineResult.content == null)) && (!botInlineResult.type.equals(MediaStreamTrack.VIDEO_TRACK_KIND) || botInlineResult.document == null))) {
                                        p90Var.a0(botInlineResult, true, 0);
                                        break;
                                    } else {
                                        ArrayList arrayList5 = new ArrayList(s90Var.getAdapter().S);
                                        s90Var.Q = arrayList5;
                                        PhotoViewer.p1().J2(null, s90Var.h, s90Var.a);
                                        PhotoViewer.p1().g2(arrayList5, s90Var.getAdapter().M(i24), 3, false, s90Var.R, null);
                                        break;
                                    }
                                }
                            } else {
                                String K = org.telegram.messenger.v3.K((TLRPC.Chat) J, false);
                                if (K != null) {
                                    p90Var2.x2(i25, i26, a8.p0.p("@", K, " "), false);
                                }
                            }
                            p90Var = p90Var2;
                            if (!(J instanceof TLRPC.BotInlineResult)) {
                            }
                        }
                    }
                }
                break;
            case 13:
                org.telegram.ui.Components.ef0 ef0Var = (org.telegram.ui.Components.ef0) obj2;
                HashSet hashSet = ef0Var.v1;
                af0 af0Var = ef0Var.n1;
                if (org.telegram.messenger.g0.E1((Context) obj)) {
                    ArrayList arrayList6 = ef0Var.A1;
                    if (arrayList6 == null || arrayList6.isEmpty()) {
                        if (view instanceof org.telegram.ui.Cells.m8) {
                            int S2 = af0Var.S(i7) - 1;
                            int Q3 = af0Var.Q(i7) - 1;
                            if (Q3 > 0 && S2 >= 0) {
                                df0 df0Var = (df0) ef0Var.x1.get(S2);
                                if (Q3 == df0Var.b() && !hashSet.contains(df0Var)) {
                                    if (!df0Var.e || df0Var.f >= df0Var.b.size()) {
                                        hashSet.add(df0Var);
                                        TLRPC.TL_messages_getPollVotes tL_messages_getPollVotes = new TLRPC.TL_messages_getPollVotes();
                                        tL_messages_getPollVotes.peer = ef0Var.u1;
                                        tL_messages_getPollVotes.id = ef0Var.s1.e1();
                                        tL_messages_getPollVotes.limit = 50;
                                        int i27 = tL_messages_getPollVotes.flags;
                                        tL_messages_getPollVotes.option = df0Var.d;
                                        tL_messages_getPollVotes.flags = i27 | 3;
                                        tL_messages_getPollVotes.offset = df0Var.c;
                                        ConnectionsManager.getInstance(ef0Var.a).sendRequest(tL_messages_getPollVotes, new org.telegram.ui.v7(20, ef0Var, df0Var));
                                        break;
                                    } else {
                                        int min = Math.min(df0Var.f + 50, df0Var.b.size());
                                        df0Var.f = min;
                                        if (min == df0Var.b.size()) {
                                            df0Var.e = false;
                                        }
                                        ef0Var.K0(null);
                                        af0Var.X(true);
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
                                ef0Var.dismiss();
                                org.telegram.ui.ActionBar.g2 T = LaunchActivity.T();
                                if (T != null) {
                                    ProfileActivity profileActivity = new ProfileActivity(bundle3, null);
                                    if (T instanceof bn) {
                                        if (pollVotesAlert$UserCell.h != null) {
                                            TLRPC.User j10 = ((bn) T).j();
                                            ef0Var.m1.getChildAt(0);
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
                l31 l31Var = (l31) obj2;
                org.telegram.ui.ActionBar.i6 i6Var4 = (org.telegram.ui.ActionBar.i6) obj;
                n41 G3 = l31Var.f2.G(i7 - 1);
                if (G3 != null) {
                    int i29 = G3.d;
                    if (i29 == 1) {
                        CharSequence charSequence = l31Var.Y1;
                        if (charSequence != null && !l31Var.X1) {
                            org.telegram.messenger.g0.g(charSequence);
                            break;
                        }
                    } else if (i29 == 2) {
                        if (i10.i(l31Var.a).q()) {
                            mp.u1(l31Var.a).v7.K(0L, !r0.B(0L));
                            l31Var.dismiss();
                            break;
                        } else if (LaunchActivity.T() != null) {
                            new ug.y0(13, l31Var.getContext(), i6Var4).show();
                            break;
                        }
                    }
                }
                break;
            case 16:
                a(i7, view);
                break;
            case 17:
                jx.Z((jx) obj2, (Context) obj, i7);
                break;
            case 18:
                y40.Z((y40) obj2, (Context) obj, view, i7);
                break;
            case 19:
                c(i7, view);
                break;
            case 20:
                wh0.Z((wh0) obj2, (Context) obj, view, i7);
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
                wg.p0 p0Var = (wg.p0) obj2;
                TLRPC.Chat chat4 = (TLRPC.Chat) obj;
                ArrayList arrayList7 = p0Var.T1;
                if (view instanceof ah.r) {
                    ah.r rVar = (ah.r) view;
                    if (rVar.getBoost().cooldown_until_date > 0) {
                        new kc(p0Var.c, p0Var.J0).G(R.raw.chats_infotip, 5, org.telegram.messenger.g0.W2(gd.G((int) mp.u1(i10.t0).s0, "BoostingWaitWarningPlural", new Object[0]))).k(true);
                        break;
                    } else {
                        if (arrayList7.contains(rVar.getBoost())) {
                            arrayList7.remove(rVar.getBoost());
                        } else {
                            arrayList7.add(rVar.getBoost());
                        }
                        rVar.c(arrayList7.contains(rVar.getBoost()), true);
                        p0Var.e1(true);
                        p0Var.X1.a(arrayList7, chat4);
                        break;
                    }
                }
                break;
        }
    }
}
