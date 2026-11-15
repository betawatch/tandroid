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
import c8.ja;
import di.ua;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cp;
import org.telegram.messenger.hd;
import org.telegram.messenger.m10;
import org.telegram.messenger.np;
import org.telegram.messenger.ns;
import org.telegram.messenger.oi;
import org.telegram.messenger.ou;
import org.telegram.messenger.q10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.PollVotesAlert$UserCell;
import org.telegram.ui.Components.a31;
import org.telegram.ui.Components.b01;
import org.telegram.ui.Components.b41;
import org.telegram.ui.Components.bd0;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.ci;
import org.telegram.ui.Components.cl;
import org.telegram.ui.Components.di;
import org.telegram.ui.Components.dl;
import org.telegram.ui.Components.dp;
import org.telegram.ui.Components.ei;
import org.telegram.ui.Components.ek;
import org.telegram.ui.Components.f90;
import org.telegram.ui.Components.gj;
import org.telegram.ui.Components.gj0;
import org.telegram.ui.Components.i41;
import org.telegram.ui.Components.i90;
import org.telegram.ui.Components.ib0;
import org.telegram.ui.Components.ij;
import org.telegram.ui.Components.jn;
import org.telegram.ui.Components.ki;
import org.telegram.ui.Components.kn;
import org.telegram.ui.Components.lh;
import org.telegram.ui.Components.lj;
import org.telegram.ui.Components.mj;
import org.telegram.ui.Components.p11;
import org.telegram.ui.Components.p41;
import org.telegram.ui.Components.p50;
import org.telegram.ui.Components.pe0;
import org.telegram.ui.Components.qk;
import org.telegram.ui.Components.r60;
import org.telegram.ui.Components.ro0;
import org.telegram.ui.Components.s01;
import org.telegram.ui.Components.se0;
import org.telegram.ui.Components.sg;
import org.telegram.ui.Components.te0;
import org.telegram.ui.Components.uj0;
import org.telegram.ui.Components.v01;
import org.telegram.ui.Components.v60;
import org.telegram.ui.Components.zi;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PrivacySettingsActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.UsersSelectActivity;
import org.telegram.ui.an;
import org.telegram.ui.b61;
import org.telegram.ui.cf0;
import org.telegram.ui.dc;
import org.telegram.ui.dk;
import org.telegram.ui.gx;
import org.telegram.ui.hc;
import org.telegram.ui.jf0;
import org.telegram.ui.mb0;
import org.telegram.ui.mp;
import org.telegram.ui.qc;
import org.telegram.ui.uh0;
import org.telegram.ui.v00;
import org.telegram.ui.vt;
import org.telegram.ui.w40;
import org.telegram.ui.wc1;
import org.webrtc.MediaStreamTrack;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class i4 implements gj0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ i4(int i7, Object obj, Object obj2) {
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
        ro0 ro0Var;
        vt vtVar = (vt) this.b;
        org.telegram.ui.ActionBar.e2 e2Var = (org.telegram.ui.ActionBar.e2) this.c;
        dp dpVar = (dp) vtVar.c.d.get(i7);
        org.telegram.ui.ActionBar.i6 i13 = dpVar.a.i(vtVar.r);
        ig.b bVar = dpVar.a.c;
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
            ig.b bVar2 = dpVar.a.c;
            if (bVar2 != null && (str2 = bVar2.b) == null) {
                str2 = bVar2.a;
            }
            if (!str2.equals("🎨")) {
                i10 = -1;
                if (i13 == null) {
                    TLRPC.TL_theme tL_theme = ((org.telegram.ui.ActionBar.o3) dpVar.a.f.get(vtVar.r)).b;
                    org.telegram.ui.ActionBar.i6 Q0 = org.telegram.ui.ActionBar.j6.Q0(org.telegram.ui.ActionBar.j6.r0(tL_theme.settings.get(((org.telegram.ui.ActionBar.o3) dpVar.a.f.get(vtVar.r)).d)));
                    if (Q0 != null) {
                        org.telegram.ui.ActionBar.g6 g6Var = (org.telegram.ui.ActionBar.g6) Q0.d0.get(tL_theme.id);
                        if (g6Var == null) {
                            g6Var = Q0.f(tL_theme, e2Var.getCurrentAccount(), 0);
                        }
                        i10 = g6Var.a;
                        Q0.u(i10);
                    }
                    i13 = Q0;
                }
                org.telegram.ui.ActionBar.j6.K1(i13, false, i10, view);
                vtVar.h = i7;
                i11 = 0;
                while (true) {
                    z10 = true;
                    if (i11 < vtVar.c.d.size()) {
                        break;
                    }
                    dp dpVar2 = (dp) vtVar.c.d.get(i11);
                    if (i11 != vtVar.h) {
                        z10 = false;
                    }
                    dpVar2.d = z10;
                    i11++;
                }
                vtVar.c.E(vtVar.h);
                for (i12 = 0; i12 < vtVar.a.getChildCount(); i12++) {
                    b01 b01Var = (b01) vtVar.a.getChildAt(i12);
                    if (b01Var != view && (ro0Var = b01Var.K) != null) {
                        org.telegram.messenger.g0.r(ro0Var);
                        b01Var.K.run();
                    }
                }
                ((b01) view).d();
                if (i13 != null) {
                    SharedPreferences.Editor edit = org.telegram.messenger.t0.b.getSharedPreferences("themeconfig", 0).edit();
                    edit.putString((vtVar.n == 1 || i13.q()) ? "lastDarkTheme" : "lastDayTheme", i13.m());
                    edit.commit();
                }
                org.telegram.ui.ActionBar.j6.M1(e2Var);
            }
        }
        i10 = ((org.telegram.ui.ActionBar.o3) dpVar.a.f.get(vtVar.r)).e;
        if (i13 == null) {
        }
        org.telegram.ui.ActionBar.j6.K1(i13, false, i10, view);
        vtVar.h = i7;
        i11 = 0;
        while (true) {
            z10 = true;
            if (i11 < vtVar.c.d.size()) {
            }
            dpVar2.d = z10;
            i11++;
        }
        vtVar.c.E(vtVar.h);
        while (i12 < vtVar.a.getChildCount()) {
        }
        ((b01) view).d();
        if (i13 != null) {
        }
        org.telegram.ui.ActionBar.j6.M1(e2Var);
    }

    private final void c(int i7, View view) {
        uh0.Z((uh0) this.b, (Context) this.c, view, i7);
    }

    private final void d(int i7, View view) {
        PrivacySettingsActivity.a0((PrivacySettingsActivity) this.b, (Context) this.c, view, i7);
    }

    private final void e(int i7, View view) {
        UsersSelectActivity.Z((UsersSelectActivity) this.b, (Context) this.c, view, i7);
    }

    private final void f(int i7, View view) {
        org.telegram.ui.Components.w3 w3Var;
        sg.h0 h0Var;
        wg.y yVar = (wg.y) this.b;
        org.telegram.ui.ActionBar.e2 e2Var = (org.telegram.ui.ActionBar.e2) this.c;
        ArrayList arrayList = yVar.Z1;
        wg.r rVar = yVar.u2;
        if (view instanceof yg.y) {
            yg.y yVar2 = (yg.y) view;
            int type = yVar2.getType();
            boolean z10 = yVar2.e.h;
            boolean z11 = !z10;
            yVar2.setChecked(z11);
            int i10 = yg.y.M;
            if (type == 0) {
                yVar.t2 = z11;
                yVar.k1(false, false);
            } else if (type == 1) {
                yVar2.setDivider(z11);
                yVar.s2 = z11;
                yVar.k1(false, false);
                xg.b bVar = yVar.c2;
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
                yVar.c2.G();
                if (yVar.s2) {
                    org.telegram.messenger.g0.r(rVar);
                } else {
                    org.telegram.messenger.g0.i3(rVar, 250L);
                }
            }
        }
        if (view instanceof yg.c) {
            if (view instanceof yg.d) {
                int selectedType = ((yg.d) view).getSelectedType();
                int i14 = yg.d.w;
                if (selectedType == 2 || selectedType == 3) {
                    if (selectedType == 2 && yVar.d2 == selectedType) {
                        sg.h0 h0Var2 = yVar.n2;
                        if (h0Var2 != null) {
                            ((wg.u0) h0Var2.b).h1(1, arrayList);
                            ((wg.l) h0Var2.c).m1.C(1);
                            return;
                        }
                        return;
                    }
                    yVar.d2 = selectedType;
                    yVar.k1(true, true);
                    yVar.j1(true);
                    yVar.b1();
                } else if (selectedType == 1) {
                    sg.h0 h0Var3 = yVar.n2;
                    if (h0Var3 != null) {
                        ((wg.u0) h0Var3.b).h1(1, arrayList);
                        ((wg.l) h0Var3.c).m1.C(1);
                    }
                } else {
                    yVar.e2 = selectedType;
                    yVar.k1(true, true);
                    yVar.j1(true);
                    yVar.b1();
                }
            } else {
                yg.c cVar = (yg.c) view;
                uj0 uj0Var = yVar.o1;
                if (cVar.b()) {
                    for (int i15 = 0; i15 < uj0Var.getChildCount(); i15++) {
                        View childAt = uj0Var.getChildAt(i15);
                        if (childAt.getClass().isInstance(cVar)) {
                            ((yg.c) childAt).c(childAt == cVar, true);
                        }
                    }
                }
            }
        }
        if (view instanceof yg.u) {
            int selectedType2 = ((yg.u) view).getSelectedType();
            if (yVar.f2 == selectedType2 && (h0Var = yVar.n2) != null) {
                ((wg.u0) h0Var.b).h1(3, yVar.a2);
                ((wg.l) h0Var.c).m1.C(1);
            }
            yVar.f2 = selectedType2;
            yVar.k1(false, false);
            return;
        }
        if (view instanceof yg.i) {
            yVar.h2 = ((TLRPC.TL_premiumGiftCodeOption) ((yg.i) view).getGifCode()).months;
            yVar.k1(false, false);
            yVar.c2.G();
            return;
        }
        if (!(view instanceof yg.h)) {
            if (view instanceof yg.b) {
                sg.h0 h0Var4 = yVar.n2;
                if (h0Var4 != null) {
                    ((wg.u0) h0Var4.b).h1(2, yVar.Y1);
                    ((wg.l) h0Var4.c).m1.C(1);
                    return;
                }
                return;
            }
            if (!(view instanceof yg.w)) {
                if (view instanceof ua) {
                    yVar.g2 = true;
                    yVar.k1(true, true);
                    return;
                }
                return;
            }
            TL_stars.TL_starsGiveawayOption option = ((yg.w) view).getOption();
            if (option != null) {
                yVar.l2 = option.stars;
                yVar.k1(true, true);
                yVar.j1(true);
                yVar.b1();
                return;
            }
            return;
        }
        Context context = e2Var.getContext();
        long j3 = yVar.i2;
        wg.s sVar = new wg.s(yVar);
        org.telegram.ui.ActionBar.e6 e6Var = yVar.J0;
        org.telegram.ui.Components.q4 q4Var = new org.telegram.ui.Components.q4(e6Var);
        ou ouVar = new ou(context, e6Var);
        ((org.telegram.ui.ActionBar.u2) ouVar.b).w0 = false;
        ib0 ib0Var = new ib0(context, e6Var);
        int i16 = q4Var.a;
        ib0Var.setTextColor(i16);
        ib0Var.setTextOffset(org.telegram.messenger.g0.L(10.0f));
        ib0Var.setItemCount(5);
        wg.f fVar = new wg.f(context, e6Var);
        fVar.setWrapSelectorWheel(true);
        fVar.setAllItemsCount(24);
        fVar.setItemCount(5);
        fVar.setTextColor(i16);
        fVar.setTextOffset(-org.telegram.messenger.g0.L(10.0f));
        fVar.setTag("HOUR");
        wg.g gVar = new wg.g(context, e6Var);
        gVar.setWrapSelectorWheel(true);
        gVar.setAllItemsCount(60);
        gVar.setItemCount(5);
        gVar.setTextColor(i16);
        gVar.setTextOffset(-org.telegram.messenger.g0.L(34.0f));
        org.telegram.ui.Components.w3 w3Var2 = new org.telegram.ui.Components.w3(context, q4Var, ib0Var, fVar, gVar);
        w3Var2.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        w3Var2.addView(frameLayout, ja.t(-1, -2, 51, 22, 0, 0, 4));
        TextView textView = new TextView(context);
        textView.setText(hd.M0(2131753287, "BoostingSelectDateTime"));
        textView.setTextColor(i16);
        i5.c.v(textView, 1, 20.0f);
        frameLayout.addView(textView, ja.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
        textView.setOnTouchListener(new gi.a(2));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setWeightSum(1.0f);
        w3Var2.addView(linearLayout, ja.q(-1, -2, 1.0f, 0, 0, 12, 0, 12));
        long currentTimeMillis = System.currentTimeMillis();
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(currentTimeMillis);
        int i17 = calendar.get(1);
        mb0 mb0Var = new mb0(context, 5);
        long j10 = np.s1(m10.t0).p0 * 1000;
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTimeInMillis(j10);
        int i18 = calendar2.get(6);
        calendar2.setTimeInMillis(System.currentTimeMillis());
        calendar2.add(14, (int) j10);
        int i19 = calendar2.get(11);
        int i20 = calendar.get(12);
        linearLayout.addView(ib0Var, ja.l(0.5f, 0, ns.t4));
        ib0Var.setMinValue(0);
        ib0Var.setMaxValue(i18 - 1);
        ib0Var.setWrapSelectorWheel(false);
        ib0Var.setTag("DAY");
        ib0Var.setFormatter(new v00(currentTimeMillis, calendar, i17, 1));
        ki.b4 b4Var = new ki.b4(w3Var2, fVar, gVar, i19, i20, ib0Var);
        ib0Var.setOnValueChangedListener(b4Var);
        fVar.setMinValue(0);
        fVar.setMaxValue(23);
        linearLayout.addView(fVar, ja.l(0.2f, 0, ns.t4));
        fVar.setFormatter(new ug.x(17));
        fVar.setOnValueChangedListener(b4Var);
        gVar.setMinValue(0);
        gVar.setMaxValue(11);
        gVar.setValue(0);
        gVar.setFormatter(new ug.x(18));
        linearLayout.addView(gVar, ja.l(0.3f, 0, ns.t4));
        gVar.setOnValueChangedListener(b4Var);
        if (j3 > 0) {
            w3Var = w3Var2;
            calendar.setTimeInMillis(System.currentTimeMillis());
            calendar.set(12, 0);
            calendar.set(13, 0);
            calendar.set(14, 0);
            calendar.set(11, 0);
            int timeInMillis = (int) ((j3 - calendar.getTimeInMillis()) / 86400000);
            calendar.setTimeInMillis(j3);
            gVar.setValue(calendar.get(12) / 5);
            fVar.setValue(calendar.get(11));
            ib0Var.setValue(timeInMillis);
            ib0Var.getValue();
            b4Var.m(ib0Var, ib0Var.getValue());
            fVar.getValue();
            b4Var.m(fVar, fVar.getValue());
        } else {
            w3Var = w3Var2;
        }
        mb0Var.setPadding(org.telegram.messenger.g0.L(34.0f), 0, org.telegram.messenger.g0.L(34.0f), 0);
        mb0Var.setGravity(17);
        mb0Var.setTextColor(q4Var.g);
        mb0Var.setTextSize(1, 14.0f);
        mb0Var.setTypeface(org.telegram.messenger.g0.o());
        mb0Var.setBackground(org.telegram.ui.ActionBar.y5.e(q4Var.h, 8.0f));
        mb0Var.setText(hd.M0(2131753543, "BoostingConfirm"));
        w3Var.addView(mb0Var, ja.t(-1, 48, 83, 16, 15, 16, 16));
        mb0Var.setOnClickListener(new org.telegram.ui.Components.l1(calendar, ib0Var, fVar, gVar, sVar, ouVar));
        org.telegram.ui.ActionBar.u2 u2Var = (org.telegram.ui.ActionBar.u2) ouVar.b;
        u2Var.O = w3Var;
        u2Var.show();
        int i21 = q4Var.b;
        u2Var.v0(i21);
        u2Var.P(i21);
        org.telegram.messenger.g0.q3(u2Var, i0.a.h(i21) > 0.699999988079071d);
    }

    /* JADX WARN: Removed duplicated region for block: B:539:0x0ab4  */
    /* JADX WARN: Removed duplicated region for block: B:541:0x0ac8  */
    @Override // org.telegram.ui.Components.gj0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(int i7, View view) {
        int i10;
        ArrayList arrayList;
        TL_stories.TL_storyReactionPublicRepost tL_storyReactionPublicRepost;
        TL_stories.StoryItem storyItem;
        b41 G;
        int i11;
        Object O;
        org.telegram.messenger.d5 d5Var;
        String str;
        String str2;
        String str3;
        String str4;
        boolean z10;
        Paint.FontMetricsInt fontMetricsInt;
        int i12 = this.a;
        int i13 = 13;
        int i14 = 7;
        int i15 = -1;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i12) {
            case 0:
                c5 c5Var = (c5) obj2;
                i9 i9Var = (i9) obj;
                org.telegram.ui.ActionBar.e2 e2Var = i9Var.f;
                y4 y4Var = c5Var.x;
                j4 j4Var = c5Var.r;
                if (i7 >= 0 && i7 < y4Var.c.size()) {
                    t4 t4Var = (t4) y4Var.c.get(i7);
                    TL_stories.StoryView storyView = t4Var.b;
                    TL_stories.StoryReaction storyReaction = t4Var.c;
                    if (storyView instanceof TL_stories.TL_storyView) {
                        i9Var.N(ProfileActivity.C4(storyView.user_id));
                        break;
                    } else if (storyView instanceof TL_stories.TL_storyViewPublicRepost) {
                        e2Var.createOverlayStoryViewer().L(c5Var.getContext(), ((TL_stories.TL_storyViewPublicRepost) t4Var.b).story, b7.a(j4Var));
                        break;
                    } else if (storyReaction instanceof TL_stories.TL_storyReaction) {
                        i9Var.N(ProfileActivity.C4(org.telegram.messenger.m5.o(storyReaction.peer_id)));
                        break;
                    } else if (storyReaction instanceof TL_stories.TL_storyReactionPublicRepost) {
                        ArrayList arrayList2 = new ArrayList();
                        b5 b5Var = c5Var.F;
                        if (b5Var == null || (arrayList = b5Var.i) == null) {
                            i10 = 0;
                        } else {
                            int size = arrayList.size();
                            for (int i16 = 0; i16 < c5Var.F.i.size(); i16++) {
                                TL_stories.StoryReaction storyReaction2 = (TL_stories.StoryReaction) c5Var.F.i.get(i16);
                                if ((storyReaction2 instanceof TL_stories.TL_storyReactionPublicRepost) && (storyItem = (tL_storyReactionPublicRepost = (TL_stories.TL_storyReactionPublicRepost) storyReaction2).story) != null) {
                                    storyItem.dialogId = org.telegram.messenger.m5.o(tL_storyReactionPublicRepost.peer_id);
                                    if (storyReaction2 == storyReaction) {
                                        i15 = arrayList2.size();
                                    }
                                    arrayList2.add(storyItem);
                                }
                            }
                            i10 = size;
                        }
                        int i17 = i15;
                        if (i17 < 0 || arrayList2.size() <= 1) {
                            c5Var.H = null;
                            e2Var.createOverlayStoryViewer().L(c5Var.getContext(), ((TL_stories.TL_storyReactionPublicRepost) storyReaction).story, b7.a(j4Var));
                            break;
                        } else {
                            c5Var.H = new n6(c5Var.w, arrayList2);
                            c5Var.I = i10;
                            b5 b5Var2 = c5Var.F;
                            i9 createOverlayStoryViewer = e2Var.createOverlayStoryViewer();
                            Context context = c5Var.getContext();
                            n6 n6Var = c5Var.H;
                            b7 a10 = b7.a(j4Var);
                            a10.e = new di.z6(b5Var2, i14);
                            createOverlayStoryViewer.I(context, i17, n6Var, a10);
                            break;
                        }
                    } else {
                        boolean z11 = storyReaction instanceof TL_stories.TL_storyReactionPublicForward;
                        if (z11 || (storyView instanceof TL_stories.TL_storyViewPublicForward)) {
                            TLRPC.Message message = z11 ? storyReaction.message : storyView.message;
                            Bundle bundle = new Bundle();
                            long o4 = org.telegram.messenger.m5.o(message.peer_id);
                            if (o4 >= 0) {
                                bundle.putLong("user_id", o4);
                            } else {
                                bundle.putLong("chat_id", -o4);
                            }
                            bundle.putInt("message_id", message.id);
                            i9Var.N(new an(bundle));
                            break;
                        }
                    }
                }
                break;
            case 1:
                gi.p pVar = (gi.p) obj2;
                ai.f0 f0Var = (ai.f0) obj;
                p41 p41Var = pVar.V1;
                if (p41Var != null && (G = p41Var.G(i7 - 1)) != null) {
                    Object obj3 = G.G;
                    if (obj3 instanceof org.telegram.messenger.v00) {
                        f0Var.a(((org.telegram.messenger.v00) obj3).a);
                        pVar.dismiss();
                        break;
                    }
                }
                break;
            case 2:
                ki.n3.C0((ki.n3) obj2, (Context) obj, i7);
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
                int i18 = hcVar.d;
                b61 b61Var = hcVar.b;
                org.telegram.messenger.dp dpVar = np.s1(i18).r4;
                if (dpVar != null) {
                    ArrayList arrayList3 = dpVar.c;
                    if (i7 >= 0 && i7 < arrayList3.size()) {
                        i11 = ((cp) arrayList3.get(i7)).c;
                        qcVar.f = i11;
                        qcVar.e1(true);
                        qcVar.h1(true);
                        qcVar.i1();
                        if (view.getLeft() >= org.telegram.messenger.g0.L(24.0f) + b61Var.getPaddingLeft()) {
                            b61Var.w0(-((org.telegram.messenger.g0.L(48.0f) + b61Var.getPaddingLeft()) - view.getLeft()), 0, null);
                            break;
                        } else if (view.getWidth() + view.getLeft() > (b61Var.getMeasuredWidth() - b61Var.getPaddingRight()) - org.telegram.messenger.g0.L(24.0f)) {
                            b61Var.w0(org.telegram.messenger.k5.B(48.0f, b61Var.getMeasuredWidth() - b61Var.getPaddingRight(), view.getWidth() + view.getLeft()), 0, null);
                            break;
                        }
                    }
                }
                i11 = 0;
                qcVar.f = i11;
                qcVar.e1(true);
                qcVar.h1(true);
                qcVar.i1();
                if (view.getLeft() >= org.telegram.messenger.g0.L(24.0f) + b61Var.getPaddingLeft()) {
                }
                break;
            case 6:
                an anVar = (an) obj2;
                anVar.getClass();
                TLObject tLObject = (TLObject) ((jf0) obj).c.get(i7);
                if (tLObject != null) {
                    anVar.P7(true);
                    Bundle bundle2 = new Bundle();
                    if (tLObject instanceof TLRPC.User) {
                        bundle2.putLong("user_id", ((TLRPC.User) tLObject).id);
                    } else if (tLObject instanceof TLRPC.Chat) {
                        bundle2.putLong("chat_id", ((TLRPC.Chat) tLObject).id);
                    }
                    anVar.presentFragment(new ProfileActivity(bundle2, null));
                    break;
                }
                break;
            case 7:
                mp.c0((mp) obj2, (Context) obj, view, i7);
                break;
            case 8:
                org.telegram.ui.Components.y yVar = (org.telegram.ui.Components.y) obj2;
                org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) obj;
                b41 G2 = yVar.j2.G(i7 - 1);
                if (G2 != null && G2.d == 1) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, yVar.getContext(), e6Var);
                    String M0 = hd.M0(2131754998, null);
                    org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
                    t1Var.S = M0;
                    t1Var.U = hd.M0(2131754997, null);
                    alertDialog$Builder.h(hd.M0(2131752589, null), null);
                    alertDialog$Builder.k(hd.M0(2131751598, null), new org.telegram.ui.Components.s(yVar, 0));
                    alertDialog$Builder.d(-1);
                    alertDialog$Builder.p();
                    break;
                }
                break;
            case 9:
                ki kiVar = (ki) obj2;
                org.telegram.ui.ActionBar.e6 e6Var2 = (org.telegram.ui.ActionBar.e6) obj;
                lh lhVar = kiVar.w3;
                ci[] ciVarArr = kiVar.u2;
                org.telegram.ui.ActionBar.e2 e2Var2 = kiVar.a2;
                org.telegram.ui.ActionBar.e2 Q = e2Var2 == null ? LaunchActivity.Q() : e2Var2;
                if (Q != null && Q.getParentActivity() != null) {
                    if (view instanceof ei) {
                        Activity parentActivity = Q.getParentActivity();
                        int intValue = view.getTag() instanceof Integer ? ((Integer) view.getTag()).intValue() : -1;
                        if (intValue == 1) {
                            if (kiVar.J3 || kiVar.K3 || !kiVar.N0()) {
                                if (!kiVar.J3 && !kiVar.K3) {
                                    kn knVar = new kn(1, kiVar.getContext(), e6Var2, kiVar);
                                    kiVar.O1 = knVar;
                                    kiVar.F1(knVar);
                                }
                                kiVar.F1(kiVar.e2);
                            }
                        } else if (intValue == 17) {
                            if (kiVar.r2 == null && (e2Var2 instanceof an)) {
                                TLRPC.User j3 = ((an) e2Var2).j();
                                if (ki.g1(j3)) {
                                    qk qkVar = new qk(kiVar, kiVar.getContext(), kiVar.H3, j3, e6Var2);
                                    kiVar.r2 = qkVar;
                                    ciVarArr[11] = qkVar;
                                }
                            }
                            qk qkVar2 = kiVar.r2;
                            if (qkVar2 != null) {
                                kiVar.F1(qkVar2);
                            }
                        } else if (intValue == 3) {
                            if (kiVar.L3 || !kiVar.N0()) {
                                if (Build.VERSION.SDK_INT >= 33) {
                                    if (parentActivity.checkSelfPermission("android.permission.READ_MEDIA_AUDIO") != 0) {
                                        parentActivity.requestPermissions(new String[]{"android.permission.READ_MEDIA_AUDIO"}, 4);
                                        break;
                                    }
                                } else if (parentActivity.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") != 0) {
                                    org.telegram.messenger.g0.W(kiVar.getContext()).requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 4);
                                    break;
                                }
                                kiVar.p1(true);
                            }
                        } else if (intValue == 4) {
                            if (kiVar.I3 || !kiVar.N0()) {
                                if (Build.VERSION.SDK_INT >= 33) {
                                    if (parentActivity.checkSelfPermission("android.permission.READ_MEDIA_IMAGES") != 0 || parentActivity.checkSelfPermission("android.permission.READ_MEDIA_VIDEO") != 0) {
                                        parentActivity.requestPermissions(new String[]{"android.permission.READ_MEDIA_IMAGES", "android.permission.READ_MEDIA_VIDEO"}, 4);
                                        break;
                                    }
                                } else if (parentActivity.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") != 0) {
                                    org.telegram.messenger.g0.W(kiVar.getContext()).requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 4);
                                    break;
                                }
                                kiVar.r1(true);
                            }
                        } else if (intValue != 5) {
                            int i19 = 12;
                            if (intValue == 6) {
                                if ((kiVar.O3 || !kiVar.N0()) && org.telegram.messenger.g0.J1(e2Var2)) {
                                    if (kiVar.O3) {
                                        if (kiVar.j2 == null) {
                                            dl dlVar = new dl(kiVar, kiVar.getContext(), e6Var2, (kiVar.C1 || kiVar.P3) ? false : true);
                                            kiVar.j2 = dlVar;
                                            ciVarArr[5] = dlVar;
                                            cl clVar = kiVar.u4;
                                            if (clVar != null) {
                                                dlVar.setDelegate(clVar);
                                            } else {
                                                dlVar.setDelegate(new sg(kiVar, i19));
                                            }
                                        }
                                        kiVar.F1(kiVar.j2);
                                    } else {
                                        kn knVar2 = new kn(6, kiVar.getContext(), e6Var2, kiVar);
                                        kiVar.O1 = knVar2;
                                        kiVar.F1(knVar2);
                                    }
                                }
                            } else if (intValue == 9) {
                                if (kiVar.M3 || !kiVar.N0()) {
                                    if (kiVar.M3) {
                                        kiVar.H1(true, null);
                                    } else {
                                        kn knVar3 = new kn(9, kiVar.getContext(), e6Var2, kiVar);
                                        kiVar.O1 = knVar3;
                                        kiVar.F1(knVar3);
                                    }
                                }
                            } else if (intValue == 11) {
                                if (kiVar.n2 == null) {
                                    kg.g0 g0Var = new kg.g0(kiVar.getContext(), kiVar.J0, kiVar);
                                    kiVar.n2 = g0Var;
                                    ciVarArr[7] = g0Var;
                                    g0Var.setupBlurredSearchField(kiVar.F4);
                                }
                                kiVar.F1(kiVar.n2);
                            } else if (intValue == 12) {
                                if (kiVar.N3 || !kiVar.N0()) {
                                    if (kiVar.N3) {
                                        if (kiVar.i2 == null) {
                                            jn jnVar = new jn(kiVar, kiVar.getContext(), true, e6Var2, null);
                                            kiVar.i2 = jnVar;
                                            ciVarArr[1] = jnVar;
                                            jnVar.setDelegate(new sg(kiVar, i13));
                                        }
                                        kiVar.F1(kiVar.i2);
                                    } else {
                                        kn knVar4 = new kn(9, kiVar.getContext(), e6Var2, kiVar);
                                        kiVar.O1 = knVar4;
                                        kiVar.F1(knVar4);
                                    }
                                }
                            } else if (intValue == 13) {
                                if (kiVar.p2 == null) {
                                    ek ekVar = new ek(kiVar, kiVar.getContext(), e6Var2, true);
                                    kiVar.p2 = ekVar;
                                    ciVarArr[8] = ekVar;
                                    ekVar.setDelegate(kiVar.Y3);
                                }
                                kiVar.F1(kiVar.p2);
                            } else if (intValue == 14) {
                                if (kiVar.o2 == null) {
                                    ek ekVar2 = new ek(kiVar, kiVar.getContext(), e6Var2, false);
                                    kiVar.o2 = ekVar2;
                                    ciVarArr[9] = ekVar2;
                                    ekVar2.setDelegate(kiVar.Y3);
                                }
                                kiVar.F1(kiVar.o2);
                            } else if (intValue == 16) {
                                if (kiVar.q2 == null) {
                                    oi.o oVar = new oi.o(kiVar.H3, kiVar.getContext(), e6Var2, kiVar);
                                    kiVar.q2 = oVar;
                                    ciVarArr[10] = oVar;
                                }
                                kiVar.F1(kiVar.q2);
                            } else if (view.getTag() instanceof Integer) {
                                kiVar.X3.y1(((Integer) view.getTag()).intValue(), true, true, 0, 0, 0L, kiVar.f1(), false, 0L);
                            }
                        } else if (kiVar.O3 || !kiVar.N0()) {
                            if (kiVar.O3 && kiVar.getContext().checkSelfPermission("android.permission.READ_CONTACTS") != 0) {
                                org.telegram.messenger.g0.W(kiVar.getContext()).requestPermissions(new String[]{"android.permission.READ_CONTACTS"}, 5);
                                break;
                            } else {
                                kiVar.q1();
                            }
                        }
                    } else if (view instanceof di) {
                        di diVar = (di) view;
                        TLRPC.TL_attachMenuBot tL_attachMenuBot = diVar.c;
                        if (tL_attachMenuBot == null) {
                            kiVar.X3.h1(diVar.b);
                            kiVar.dismiss();
                        } else if (tL_attachMenuBot.inactive) {
                            wc1.a(kiVar.getContext(), new li.v(28, kiVar, diVar), null);
                        } else {
                            kiVar.C1(tL_attachMenuBot.bot_id, null, false, true);
                        }
                    }
                    int left = view.getLeft();
                    int right = view.getRight();
                    int L = org.telegram.messenger.g0.L(70.0f);
                    int i20 = left - L;
                    if (i20 < 0) {
                        lhVar.w0(i20, 0, null);
                        break;
                    } else {
                        int i21 = right + L;
                        if (i21 > lhVar.getMeasuredWidth()) {
                            lhVar.w0(i21 - lhVar.getMeasuredWidth(), 0, null);
                            break;
                        }
                    }
                }
                break;
            case 10:
                mj mjVar = (mj) obj2;
                org.telegram.ui.ActionBar.e6 e6Var3 = (org.telegram.ui.ActionBar.e6) obj;
                gj gjVar = mjVar.F;
                v4.h0 adapter = mjVar.s.getAdapter();
                ij ijVar = mjVar.G;
                if (adapter == ijVar) {
                    O = ijVar.E(i7);
                } else {
                    int S = gjVar.S(i7);
                    int Q2 = gjVar.Q(i7);
                    if (Q2 >= 0 && S >= 0) {
                        O = gjVar.O(S, Q2);
                    }
                }
                if (O != null) {
                    if (mjVar.x.isEmpty()) {
                        if (O instanceof org.telegram.messenger.d5) {
                            org.telegram.messenger.d5 d5Var2 = (org.telegram.messenger.d5) O;
                            TLRPC.User user = d5Var2.m;
                            if (user != null) {
                                str3 = user.first_name;
                                str4 = user.last_name;
                            } else {
                                str3 = d5Var2.i;
                                str4 = d5Var2.j;
                            }
                            d5Var = d5Var2;
                            str2 = str4;
                            str = str3;
                        } else {
                            TLRPC.User user2 = (TLRPC.User) O;
                            org.telegram.messenger.d5 d5Var3 = new org.telegram.messenger.d5();
                            String str5 = user2.first_name;
                            d5Var3.i = str5;
                            String str6 = user2.last_name;
                            d5Var3.j = str6;
                            d5Var3.e.add(user2.phone);
                            d5Var3.m = user2;
                            d5Var = d5Var3;
                            str = str5;
                            str2 = str6;
                        }
                        bd0 bd0Var = new bd0(mjVar.b.a2, d5Var, null, null, null, null, str, str2, e6Var3);
                        bd0Var.F1 = new zi(mjVar);
                        bd0Var.show();
                        break;
                    } else {
                        mjVar.Q((lj) view, O);
                        break;
                    }
                }
                break;
            case 11:
                v60 v60Var = (v60) obj2;
                TLRPC.Chat chat = (TLRPC.Chat) obj;
                r60 r60Var = v60Var.q1;
                ArrayList arrayList4 = v60Var.t1;
                if (!v60Var.B1 && arrayList4.get(i7) != v60Var.x1) {
                    v60Var.x1 = (TLRPC.Peer) arrayList4.get(i7);
                    boolean z12 = view instanceof org.telegram.ui.Cells.h4;
                    if (z12) {
                        z10 = true;
                        ((org.telegram.ui.Cells.h4) view).c(true, true);
                    } else {
                        z10 = true;
                        if (view instanceof org.telegram.ui.Cells.c7) {
                            ((org.telegram.ui.Cells.c7) view).b(true, true);
                            view.invalidate();
                        }
                    }
                    int childCount = r60Var.getChildCount();
                    for (int i22 = 0; i22 < childCount; i22++) {
                        View childAt = r60Var.getChildAt(i22);
                        if (childAt != view) {
                            if (z12) {
                                ((org.telegram.ui.Cells.h4) childAt).c(false, z10);
                            } else if (view instanceof org.telegram.ui.Cells.c7) {
                                ((org.telegram.ui.Cells.c7) childAt).b(false, z10);
                            }
                        }
                    }
                    if (v60Var.w1 != 0) {
                        v60Var.M0(chat, z10);
                        break;
                    }
                }
                break;
            case 12:
                i90 i90Var = (i90) obj2;
                f90 f90Var = (f90) obj;
                if (i7 != 0) {
                    jg.h1 adapter2 = i90Var.getAdapter();
                    if (adapter2.x0 == null || adapter2.i0) {
                        int i23 = i7 - 1;
                        Object J = i90Var.getAdapter().J(i23);
                        int i24 = i90Var.getAdapter().Y;
                        int i25 = i90Var.getAdapter().Z;
                        if (i90Var.getAdapter().G == null || i23 != 1) {
                            if (i90Var.getAdapter().G == null || i23 != 0) {
                                if (J instanceof TLRPC.TL_document) {
                                    if (view instanceof org.telegram.ui.Cells.w7) {
                                        ((org.telegram.ui.Cells.w7) view).getSendAnimationData();
                                    }
                                    TLRPC.TL_document tL_document = (TLRPC.TL_document) J;
                                    f90Var.a0(tL_document, org.telegram.messenger.gj.U(tL_document), i90Var.getAdapter().L(i23));
                                } else if (J instanceof TLRPC.Chat) {
                                    String K = org.telegram.messenger.t3.K((TLRPC.Chat) J, false);
                                    if (K != null) {
                                        f90Var.p0(i24, i25, a8.p0.p("@", K, " "), false);
                                    }
                                } else if (J instanceof TLRPC.User) {
                                    TLRPC.User user3 = (TLRPC.User) J;
                                    if (q10.n(user3) != null) {
                                        f90Var.p0(i24, i25, "@" + q10.n(user3) + " ", false);
                                    } else {
                                        SpannableString spannableString = new SpannableString(r.b.v(q10.j(user3, false), " "));
                                        spannableString.setSpan(new i41("" + user3.id, 3, null), 0, spannableString.length(), 33);
                                        f90Var.p0(i24, i25, spannableString, false);
                                    }
                                } else if (J instanceof String) {
                                    f90Var.p0(i24, i25, J + " ", false);
                                } else if (J instanceof oi) {
                                    String str7 = ((oi) J).a;
                                    f90Var.v0(str7);
                                    if (str7 == null || !str7.startsWith("animated_")) {
                                        f90Var.p0(i24, i25, str7, true);
                                    } else {
                                        try {
                                            try {
                                                fontMetricsInt = f90Var.Q();
                                            } catch (Exception e10) {
                                                org.telegram.messenger.a8.g(e10, false);
                                                fontMetricsInt = null;
                                            }
                                            long parseLong = Long.parseLong(str7.substring(9));
                                            TLRPC.Document e11 = org.telegram.ui.Components.g5.e(m10.t0, parseLong);
                                            SpannableString spannableString2 = new SpannableString(org.telegram.messenger.gj.U(e11));
                                            spannableString2.setSpan(e11 != null ? new org.telegram.ui.Components.p5(e11, fontMetricsInt) : new org.telegram.ui.Components.p5(parseLong, fontMetricsInt), 0, spannableString2.length(), 33);
                                            f90Var.p0(i24, i25, spannableString2, false);
                                        } catch (Exception unused) {
                                            f90Var.p0(i24, i25, str7, true);
                                        }
                                    }
                                    i90Var.o(false);
                                }
                                if (J instanceof TLRPC.BotInlineResult) {
                                    TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) J;
                                    if ((!botInlineResult.type.equals("photo") || (botInlineResult.photo == null && botInlineResult.content == null)) && ((!botInlineResult.type.equals("gif") || (botInlineResult.document == null && botInlineResult.content == null)) && (!botInlineResult.type.equals(MediaStreamTrack.VIDEO_TRACK_KIND) || botInlineResult.document == null))) {
                                        f90Var.r(botInlineResult, true, 0);
                                        break;
                                    } else {
                                        ArrayList arrayList5 = new ArrayList(i90Var.getAdapter().S);
                                        i90Var.Q = arrayList5;
                                        PhotoViewer.p1().I2(null, i90Var.h, i90Var.a);
                                        PhotoViewer.p1().f2(arrayList5, i90Var.getAdapter().M(i23), 3, false, i90Var.R, null);
                                        break;
                                    }
                                }
                            } else {
                                f90Var.p0(i24, i25, a8.p0.s(new StringBuilder(), i90Var.getAdapter().G, " "), false);
                                break;
                            }
                        } else {
                            TLRPC.Chat chat2 = i90Var.getAdapter().m0;
                            if (chat2 == null && i90Var.getAdapter().H0 != null) {
                                chat2 = i90Var.getAdapter().H0.e;
                            }
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(i90Var.getAdapter().G);
                            f90Var.p0(i24, i25, a8.p0.s(sb2, chat2 != null ? "@" + org.telegram.messenger.t3.K(chat2, false) : "", " "), false);
                            break;
                        }
                    }
                } else {
                    i90Var.getClass();
                    break;
                }
                break;
            case 13:
                te0 te0Var = (te0) obj2;
                HashSet hashSet = te0Var.v1;
                pe0 pe0Var = te0Var.n1;
                if (org.telegram.messenger.g0.E1((Context) obj)) {
                    ArrayList arrayList6 = te0Var.A1;
                    if (arrayList6 == null || arrayList6.isEmpty()) {
                        if (view instanceof org.telegram.ui.Cells.l8) {
                            int S2 = pe0Var.S(i7) - 1;
                            int Q3 = pe0Var.Q(i7) - 1;
                            if (Q3 > 0 && S2 >= 0) {
                                se0 se0Var = (se0) te0Var.x1.get(S2);
                                if (Q3 == se0Var.b() && !hashSet.contains(se0Var)) {
                                    if (!se0Var.e || se0Var.f >= se0Var.b.size()) {
                                        hashSet.add(se0Var);
                                        TLRPC.TL_messages_getPollVotes tL_messages_getPollVotes = new TLRPC.TL_messages_getPollVotes();
                                        tL_messages_getPollVotes.peer = te0Var.u1;
                                        tL_messages_getPollVotes.id = te0Var.s1.e1();
                                        tL_messages_getPollVotes.limit = 50;
                                        int i26 = tL_messages_getPollVotes.flags;
                                        tL_messages_getPollVotes.option = se0Var.d;
                                        tL_messages_getPollVotes.flags = i26 | 3;
                                        tL_messages_getPollVotes.offset = se0Var.c;
                                        ConnectionsManager.getInstance(te0Var.a).sendRequest(tL_messages_getPollVotes, new org.telegram.ui.v7(20, te0Var, se0Var));
                                        break;
                                    } else {
                                        int min = Math.min(se0Var.f + 50, se0Var.b.size());
                                        se0Var.f = min;
                                        if (min == se0Var.b.size()) {
                                            se0Var.e = false;
                                        }
                                        te0Var.J0(null);
                                        pe0Var.X(true);
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
                                te0Var.dismiss();
                                org.telegram.ui.ActionBar.e2 T = LaunchActivity.T();
                                if (T != null) {
                                    ProfileActivity profileActivity = new ProfileActivity(bundle3, null);
                                    if (T instanceof an) {
                                        if (pollVotesAlert$UserCell.h != null) {
                                            TLRPC.User j10 = ((an) T).j();
                                            te0Var.m1.getChildAt(0);
                                            profileActivity.i5((j10 == null || j10.id != pollVotesAlert$UserCell.h.id) ? 0 : 1);
                                        } else {
                                            TLRPC.Chat chat3 = ((an) T).e;
                                            profileActivity.i5((chat3 == null || chat3.id != pollVotesAlert$UserCell.n.id) ? 0 : 1);
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
                v01 v01Var = (v01) obj2;
                EditText editText = v01Var.w;
                long a11 = ((s01) v01Var.s.c.get(i7)).a();
                an anVar2 = ((dk) obj).a;
                if (anVar2.Z9()) {
                    an.M2(a11, anVar2);
                } else {
                    p11 p11Var = anVar2.g2;
                    if (p11Var != null) {
                        p11Var.n(a11, false);
                    }
                }
                if (editText.length() > 0) {
                    editText.setText("");
                }
                editText.clearFocus();
                v01Var.d();
                break;
            case 15:
                a31 a31Var = (a31) obj2;
                org.telegram.ui.ActionBar.e6 e6Var4 = (org.telegram.ui.ActionBar.e6) obj;
                b41 G3 = a31Var.f2.G(i7 - 1);
                if (G3 != null) {
                    int i27 = G3.d;
                    if (i27 == 1) {
                        CharSequence charSequence = a31Var.Y1;
                        if (charSequence != null && !a31Var.X1) {
                            org.telegram.messenger.g0.g(charSequence);
                            break;
                        }
                    } else if (i27 == 2) {
                        if (m10.i(a31Var.a).q()) {
                            np.s1(a31Var.a).t7.K(0L, !r0.B(0L));
                            a31Var.dismiss();
                            break;
                        } else if (LaunchActivity.T() != null) {
                            new ug.x0(13, a31Var.getContext(), e6Var4).show();
                            break;
                        }
                    }
                }
                break;
            case 16:
                a(i7, view);
                break;
            case 17:
                gx.Z((gx) obj2, (Context) obj, i7);
                break;
            case 18:
                w40.Z((w40) obj2, (Context) obj, view, i7);
                break;
            case 19:
                cf0 cf0Var = (cf0) obj2;
                Context context2 = (Context) obj;
                HashMap hashMap = cf0Var.l0;
                if (i7 == cf0Var.R) {
                    TLRPC.User user5 = (TLRPC.User) hashMap.get(Long.valueOf(cf0Var.e.admin_id));
                    if (user5 != null) {
                        Bundle bundle4 = new Bundle();
                        bundle4.putLong("user_id", user5.id);
                        np.s1(m10.t0).X3(user5, false, false);
                        cf0Var.presentFragment(new ProfileActivity(bundle4, null));
                        break;
                    }
                } else if (i7 == cf0Var.y) {
                    org.telegram.ui.i90 i90Var2 = new org.telegram.ui.i90(0, cf0Var.n);
                    i90Var2.T = cf0Var.t0;
                    cf0Var.presentFragment(i90Var2);
                    break;
                } else {
                    int i28 = cf0Var.E;
                    if (i7 >= i28 && i7 < cf0Var.F) {
                        p50 p50Var = new p50(context2, (TLRPC.TL_chatInviteExported) cf0Var.j0.get(i7 - i28), cf0Var.d, hashMap, cf0Var, cf0Var.n, false, cf0Var.h);
                        cf0Var.m0 = p50Var;
                        p50Var.f2 = cf0Var.q0;
                        p50Var.show();
                        break;
                    } else {
                        int i29 = cf0Var.I;
                        if (i7 >= i29 && i7 < cf0Var.J) {
                            p50 p50Var2 = new p50(context2, (TLRPC.TL_chatInviteExported) cf0Var.k0.get(i7 - i29), cf0Var.d, hashMap, cf0Var, cf0Var.n, false, cf0Var.h);
                            cf0Var.m0 = p50Var2;
                            p50Var2.show();
                            break;
                        } else if (i7 != cf0Var.O) {
                            int i30 = cf0Var.V;
                            if (i7 >= i30 && i7 < cf0Var.W) {
                                TLRPC.TL_chatAdminWithInvites tL_chatAdminWithInvites = (TLRPC.TL_chatAdminWithInvites) cf0Var.n0.get(i7 - i30);
                                if (hashMap.containsKey(Long.valueOf(tL_chatAdminWithInvites.admin_id))) {
                                    cf0Var.getMessagesController().X3((TLRPC.User) hashMap.get(Long.valueOf(tL_chatAdminWithInvites.admin_id)), false, false);
                                }
                                cf0 cf0Var2 = new cf0(cf0Var.n, tL_chatAdminWithInvites.invites_count, tL_chatAdminWithInvites.admin_id);
                                cf0Var2.m0(cf0Var.d, null);
                                cf0Var.presentFragment(cf0Var2);
                                break;
                            }
                        } else if (!cf0Var.d0) {
                            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(cf0Var.getParentActivity());
                            String M02 = hd.M0(2131751575, null);
                            org.telegram.ui.ActionBar.t1 t1Var2 = alertDialog$Builder2.a;
                            t1Var2.S = M02;
                            t1Var2.U = hd.M0(2131751576, null);
                            alertDialog$Builder2.k(hd.M0(2131751598, null), new org.telegram.ui.pe0(cf0Var));
                            alertDialog$Builder2.h(hd.M0(2131752589, null), null);
                            cf0Var.showDialog(t1Var2);
                            break;
                        }
                    }
                }
                break;
            case 20:
                c(i7, view);
                break;
            case 21:
                d(i7, view);
                break;
            case 22:
                e(i7, view);
                break;
            case 23:
                f(i7, view);
                break;
            default:
                wg.o0 o0Var = (wg.o0) obj2;
                TLRPC.Chat chat4 = (TLRPC.Chat) obj;
                ArrayList arrayList7 = o0Var.T1;
                if (view instanceof ah.r) {
                    ah.r rVar = (ah.r) view;
                    if (rVar.getBoost().cooldown_until_date > 0) {
                        new cc(o0Var.c, o0Var.J0).G(R.raw.chats_infotip, 5, org.telegram.messenger.g0.X2(hd.G((int) np.s1(m10.t0).s0, "BoostingWaitWarningPlural", new Object[0]))).k(true);
                        break;
                    } else {
                        if (arrayList7.contains(rVar.getBoost())) {
                            arrayList7.remove(rVar.getBoost());
                        } else {
                            arrayList7.add(rVar.getBoost());
                        }
                        rVar.c(arrayList7.contains(rVar.getBoost()), true);
                        o0Var.d1(true);
                        o0Var.X1.a(arrayList7, chat4);
                        break;
                    }
                }
                break;
        }
    }
}
