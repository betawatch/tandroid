package di;

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
import bi.kc;
import c8.ha;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.fp;
import org.telegram.messenger.gp;
import org.telegram.messenger.id;
import org.telegram.messenger.ij;
import org.telegram.messenger.p10;
import org.telegram.messenger.qi;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.messenger.t10;
import org.telegram.messenger.y00;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.PollVotesAlert$UserCell;
import org.telegram.ui.Components.a01;
import org.telegram.ui.Components.bd0;
import org.telegram.ui.Components.bj;
import org.telegram.ui.Components.bn;
import org.telegram.ui.Components.cj0;
import org.telegram.ui.Components.di;
import org.telegram.ui.Components.e90;
import org.telegram.ui.Components.eh;
import org.telegram.ui.Components.ej;
import org.telegram.ui.Components.f41;
import org.telegram.ui.Components.fj;
import org.telegram.ui.Components.h90;
import org.telegram.ui.Components.hc;
import org.telegram.ui.Components.ib0;
import org.telegram.ui.Components.ik;
import org.telegram.ui.Components.kr0;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.mg;
import org.telegram.ui.Components.n11;
import org.telegram.ui.Components.n50;
import org.telegram.ui.Components.ne0;
import org.telegram.ui.Components.q01;
import org.telegram.ui.Components.q60;
import org.telegram.ui.Components.qe0;
import org.telegram.ui.Components.qj0;
import org.telegram.ui.Components.re0;
import org.telegram.ui.Components.ri;
import org.telegram.ui.Components.t01;
import org.telegram.ui.Components.u60;
import org.telegram.ui.Components.uo;
import org.telegram.ui.Components.vh;
import org.telegram.ui.Components.vk;
import org.telegram.ui.Components.w21;
import org.telegram.ui.Components.wh;
import org.telegram.ui.Components.wj;
import org.telegram.ui.Components.wk;
import org.telegram.ui.Components.xh;
import org.telegram.ui.Components.y31;
import org.telegram.ui.Components.zi;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PrivacySettingsActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.UsersSelectActivity;
import org.telegram.ui.cn;
import org.telegram.ui.ec;
import org.telegram.ui.ef0;
import org.telegram.ui.f61;
import org.telegram.ui.fk;
import org.telegram.ui.gx;
import org.telegram.ui.ic;
import org.telegram.ui.j90;
import org.telegram.ui.ld;
import org.telegram.ui.lf0;
import org.telegram.ui.mp;
import org.telegram.ui.ob0;
import org.telegram.ui.rc;
import org.telegram.ui.uh0;
import org.telegram.ui.v00;
import org.telegram.ui.vt;
import org.telegram.ui.y40;
import org.telegram.ui.zc1;
import org.webrtc.MediaStreamTrack;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class q4 implements cj0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ q4(int i7, Object obj, Object obj2) {
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
        boolean z9;
        int i12;
        kr0 kr0Var;
        vt vtVar = (vt) this.b;
        org.telegram.ui.ActionBar.f2 f2Var = (org.telegram.ui.ActionBar.f2) this.c;
        uo uoVar = (uo) vtVar.c.d.get(i7);
        org.telegram.ui.ActionBar.k6 i13 = uoVar.a.i(vtVar.w);
        ig.b bVar = uoVar.a.c;
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
            ig.b bVar2 = uoVar.a.c;
            if (bVar2 != null && (str2 = bVar2.b) == null) {
                str2 = bVar2.a;
            }
            if (!str2.equals("🎨")) {
                i10 = -1;
                if (i13 == null) {
                    TLRPC.TL_theme tL_theme = ((org.telegram.ui.ActionBar.q3) uoVar.a.f.get(vtVar.w)).b;
                    org.telegram.ui.ActionBar.k6 Q0 = org.telegram.ui.ActionBar.l6.Q0(org.telegram.ui.ActionBar.l6.r0(tL_theme.settings.get(((org.telegram.ui.ActionBar.q3) uoVar.a.f.get(vtVar.w)).d)));
                    if (Q0 != null) {
                        org.telegram.ui.ActionBar.i6 i6Var = (org.telegram.ui.ActionBar.i6) Q0.c0.get(tL_theme.id);
                        if (i6Var == null) {
                            i6Var = Q0.f(tL_theme, f2Var.getCurrentAccount(), 0);
                        }
                        i10 = i6Var.a;
                        Q0.u(i10);
                    }
                    i13 = Q0;
                }
                org.telegram.ui.ActionBar.l6.K1(i13, false, i10, view);
                vtVar.r = i7;
                i11 = 0;
                while (true) {
                    z9 = true;
                    if (i11 < vtVar.c.d.size()) {
                        break;
                    }
                    uo uoVar2 = (uo) vtVar.c.d.get(i11);
                    if (i11 != vtVar.r) {
                        z9 = false;
                    }
                    uoVar2.d = z9;
                    i11++;
                }
                vtVar.c.E(vtVar.r);
                for (i12 = 0; i12 < vtVar.a.getChildCount(); i12++) {
                    a01 a01Var = (a01) vtVar.a.getChildAt(i12);
                    if (a01Var != view && (kr0Var = a01Var.J) != null) {
                        org.telegram.messenger.g0.r(kr0Var);
                        a01Var.J.run();
                    }
                }
                ((a01) view).d();
                if (i13 != null) {
                    SharedPreferences.Editor edit = org.telegram.messenger.t0.b.getSharedPreferences("themeconfig", 0).edit();
                    edit.putString((vtVar.s == 1 || i13.q()) ? "lastDarkTheme" : "lastDayTheme", i13.m());
                    edit.commit();
                }
                org.telegram.ui.ActionBar.l6.M1(f2Var);
            }
        }
        i10 = ((org.telegram.ui.ActionBar.q3) uoVar.a.f.get(vtVar.w)).e;
        if (i13 == null) {
        }
        org.telegram.ui.ActionBar.l6.K1(i13, false, i10, view);
        vtVar.r = i7;
        i11 = 0;
        while (true) {
            z9 = true;
            if (i11 < vtVar.c.d.size()) {
            }
            uoVar2.d = z9;
            i11++;
        }
        vtVar.c.E(vtVar.r);
        while (i12 < vtVar.a.getChildCount()) {
        }
        ((a01) view).d();
        if (i13 != null) {
        }
        org.telegram.ui.ActionBar.l6.M1(f2Var);
    }

    private final void b(int i7, View view) {
        uh0.Z((uh0) this.b, (Context) this.c, view, i7);
    }

    private final void d(int i7, View view) {
        PrivacySettingsActivity.a0((PrivacySettingsActivity) this.b, (Context) this.c, view, i7);
    }

    private final void e(int i7, View view) {
        UsersSelectActivity.Z((UsersSelectActivity) this.b, (Context) this.c, view, i7);
    }

    private final void f(int i7, View view) {
        org.telegram.ui.Components.y3 y3Var;
        sg.i0 i0Var;
        wg.z zVar = (wg.z) this.b;
        org.telegram.ui.ActionBar.f2 f2Var = (org.telegram.ui.ActionBar.f2) this.c;
        ArrayList arrayList = zVar.V1;
        wg.s sVar = zVar.q2;
        if (view instanceof yg.y) {
            yg.y yVar = (yg.y) view;
            int type = yVar.getType();
            boolean z9 = yVar.e.h;
            boolean z10 = !z9;
            yVar.setChecked(z10);
            int i10 = yg.y.L;
            if (type == 0) {
                zVar.p2 = z10;
                zVar.k1(false, false);
            } else if (type == 1) {
                yVar.setDivider(z10);
                zVar.o2 = z10;
                zVar.k1(false, false);
                xg.c cVar = zVar.Y1;
                int i11 = 0;
                while (true) {
                    if (i11 >= cVar.e.size()) {
                        break;
                    }
                    xg.b bVar = (xg.b) cVar.e.get(i11);
                    if (bVar.a == 15) {
                        int i12 = bVar.l;
                        int i13 = yg.y.L;
                        if (i12 == 1) {
                            if (z9) {
                                cVar.s(i11 + 1);
                            } else {
                                cVar.i(i11 + 1);
                            }
                        }
                    }
                    i11++;
                }
                zVar.Y1.G();
                if (zVar.o2) {
                    org.telegram.messenger.g0.r(sVar);
                } else {
                    org.telegram.messenger.g0.i3(sVar, 250L);
                }
            }
        }
        if (view instanceof yg.c) {
            if (view instanceof yg.d) {
                int selectedType = ((yg.d) view).getSelectedType();
                int i14 = yg.d.w;
                if (selectedType == 2 || selectedType == 3) {
                    if (selectedType == 2 && zVar.Z1 == selectedType) {
                        sg.i0 i0Var2 = zVar.j2;
                        if (i0Var2 != null) {
                            ((wg.w0) i0Var2.b).h1(1, arrayList);
                            ((wg.l) i0Var2.c).i1.E(1);
                            return;
                        }
                        return;
                    }
                    zVar.Z1 = selectedType;
                    zVar.k1(true, true);
                    zVar.j1(true);
                    zVar.b1();
                } else if (selectedType == 1) {
                    sg.i0 i0Var3 = zVar.j2;
                    if (i0Var3 != null) {
                        ((wg.w0) i0Var3.b).h1(1, arrayList);
                        ((wg.l) i0Var3.c).i1.E(1);
                    }
                } else {
                    zVar.a2 = selectedType;
                    zVar.k1(true, true);
                    zVar.j1(true);
                    zVar.b1();
                }
            } else {
                yg.c cVar2 = (yg.c) view;
                qj0 qj0Var = zVar.k1;
                if (cVar2.b()) {
                    for (int i15 = 0; i15 < qj0Var.getChildCount(); i15++) {
                        View childAt = qj0Var.getChildAt(i15);
                        if (childAt.getClass().isInstance(cVar2)) {
                            ((yg.c) childAt).c(childAt == cVar2, true);
                        }
                    }
                }
            }
        }
        if (view instanceof yg.u) {
            int selectedType2 = ((yg.u) view).getSelectedType();
            if (zVar.b2 == selectedType2 && (i0Var = zVar.j2) != null) {
                ((wg.w0) i0Var.b).h1(3, zVar.W1);
                ((wg.l) i0Var.c).i1.E(1);
            }
            zVar.b2 = selectedType2;
            zVar.k1(false, false);
            return;
        }
        if (view instanceof yg.i) {
            zVar.d2 = ((TLRPC.TL_premiumGiftCodeOption) ((yg.i) view).getGifCode()).months;
            zVar.k1(false, false);
            zVar.Y1.G();
            return;
        }
        if (!(view instanceof yg.h)) {
            if (view instanceof yg.b) {
                sg.i0 i0Var4 = zVar.j2;
                if (i0Var4 != null) {
                    ((wg.w0) i0Var4.b).h1(2, zVar.U1);
                    ((wg.l) i0Var4.c).i1.E(1);
                    return;
                }
                return;
            }
            if (!(view instanceof yg.w)) {
                if (view instanceof kc) {
                    zVar.c2 = true;
                    zVar.k1(true, true);
                    return;
                }
                return;
            }
            TL_stars.TL_starsGiveawayOption option = ((yg.w) view).getOption();
            if (option != null) {
                zVar.h2 = option.stars;
                zVar.k1(true, true);
                zVar.j1(true);
                zVar.b1();
                return;
            }
            return;
        }
        Context context = f2Var.getContext();
        long j3 = zVar.e2;
        wg.t tVar = new wg.t(zVar);
        org.telegram.ui.ActionBar.g6 g6Var = zVar.I0;
        org.telegram.ui.Components.s4 s4Var = new org.telegram.ui.Components.s4(g6Var);
        h9.f1 f1Var = new h9.f1(context, g6Var);
        ((org.telegram.ui.ActionBar.v2) f1Var.b).v0 = false;
        ib0 ib0Var = new ib0(context, g6Var);
        int i16 = s4Var.a;
        ib0Var.setTextColor(i16);
        ib0Var.setTextOffset(org.telegram.messenger.g0.L(10.0f));
        ib0Var.setItemCount(5);
        wg.f fVar = new wg.f(context, g6Var);
        fVar.setWrapSelectorWheel(true);
        fVar.setAllItemsCount(24);
        fVar.setItemCount(5);
        fVar.setTextColor(i16);
        fVar.setTextOffset(-org.telegram.messenger.g0.L(10.0f));
        fVar.setTag("HOUR");
        wg.g gVar = new wg.g(context, g6Var);
        gVar.setWrapSelectorWheel(true);
        gVar.setAllItemsCount(60);
        gVar.setItemCount(5);
        gVar.setTextColor(i16);
        gVar.setTextOffset(-org.telegram.messenger.g0.L(34.0f));
        org.telegram.ui.Components.y3 y3Var2 = new org.telegram.ui.Components.y3(context, s4Var, ib0Var, fVar, gVar);
        y3Var2.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        y3Var2.addView(frameLayout, ha.t(-1, -2, 51, 22, 0, 0, 4));
        TextView textView = new TextView(context);
        textView.setText(id.M0(2131753287, "BoostingSelectDateTime"));
        textView.setTextColor(i16);
        com.google.android.recaptcha.internal.a.q(textView, 1, 20.0f);
        frameLayout.addView(textView, ha.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
        textView.setOnTouchListener(new ei.b(2));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setWeightSum(1.0f);
        y3Var2.addView(linearLayout, ha.q(-1, -2, 1.0f, 0, 0, 12, 0, 12));
        long currentTimeMillis = System.currentTimeMillis();
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(currentTimeMillis);
        int i17 = calendar.get(1);
        ob0 ob0Var = new ob0(context, 5);
        long j10 = qp.s1(p10.s0).o0 * 1000;
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTimeInMillis(j10);
        int i18 = calendar2.get(6);
        calendar2.setTimeInMillis(System.currentTimeMillis());
        calendar2.add(14, (int) j10);
        int i19 = calendar2.get(11);
        int i20 = calendar.get(12);
        linearLayout.addView(ib0Var, ha.l(0.5f, 0, qs.t4));
        ib0Var.setMinValue(0);
        ib0Var.setMaxValue(i18 - 1);
        ib0Var.setWrapSelectorWheel(false);
        ib0Var.setTag("DAY");
        ib0Var.setFormatter(new v00(currentTimeMillis, calendar, i17, 1));
        hi.g4 g4Var = new hi.g4(y3Var2, fVar, gVar, i19, i20, ib0Var);
        ib0Var.setOnValueChangedListener(g4Var);
        fVar.setMinValue(0);
        fVar.setMaxValue(23);
        linearLayout.addView(fVar, ha.l(0.2f, 0, qs.t4));
        fVar.setFormatter(new v0.j(16));
        fVar.setOnValueChangedListener(g4Var);
        gVar.setMinValue(0);
        gVar.setMaxValue(11);
        gVar.setValue(0);
        gVar.setFormatter(new v0.j(17));
        linearLayout.addView(gVar, ha.l(0.3f, 0, qs.t4));
        gVar.setOnValueChangedListener(g4Var);
        if (j3 > 0) {
            y3Var = y3Var2;
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
            g4Var.n(ib0Var, ib0Var.getValue());
            fVar.getValue();
            g4Var.n(fVar, fVar.getValue());
        } else {
            y3Var = y3Var2;
        }
        ob0Var.setPadding(org.telegram.messenger.g0.L(34.0f), 0, org.telegram.messenger.g0.L(34.0f), 0);
        ob0Var.setGravity(17);
        ob0Var.setTextColor(s4Var.g);
        ob0Var.setTextSize(1, 14.0f);
        ob0Var.setTypeface(org.telegram.messenger.g0.o());
        ob0Var.setBackground(org.telegram.ui.ActionBar.a6.e(s4Var.h, 8.0f));
        ob0Var.setText(id.M0(2131753543, "BoostingConfirm"));
        y3Var.addView(ob0Var, ha.t(-1, 48, 83, 16, 15, 16, 16));
        ob0Var.setOnClickListener(new org.telegram.ui.Components.n1(calendar, ib0Var, fVar, gVar, tVar, f1Var));
        org.telegram.ui.ActionBar.v2 v2Var = (org.telegram.ui.ActionBar.v2) f1Var.b;
        v2Var.N = y3Var;
        v2Var.show();
        int i21 = s4Var.b;
        v2Var.v0(i21);
        v2Var.O(i21);
        org.telegram.messenger.g0.q3(v2Var, i0.a.h(i21) > 0.699999988079071d);
    }

    /* JADX WARN: Removed duplicated region for block: B:540:0x0ab2  */
    /* JADX WARN: Removed duplicated region for block: B:542:0x0ac6  */
    @Override // org.telegram.ui.Components.cj0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(int i7, View view) {
        int i10;
        ArrayList arrayList;
        TL_stories.TL_storyReactionPublicRepost tL_storyReactionPublicRepost;
        TL_stories.StoryItem storyItem;
        y31 G;
        int i11;
        Object O;
        org.telegram.messenger.d5 d5Var;
        String str;
        String str2;
        String str3;
        String str4;
        boolean z9;
        Paint.FontMetricsInt fontMetricsInt;
        int i12 = this.a;
        int i13 = 13;
        int i14 = -1;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i12) {
            case 0:
                l5 l5Var = (l5) obj2;
                q9 q9Var = (q9) obj;
                org.telegram.ui.ActionBar.f2 f2Var = q9Var.f;
                h5 h5Var = l5Var.x;
                s4 s4Var = l5Var.r;
                if (i7 >= 0 && i7 < h5Var.c.size()) {
                    c5 c5Var = (c5) h5Var.c.get(i7);
                    TL_stories.StoryView storyView = c5Var.b;
                    TL_stories.StoryReaction storyReaction = c5Var.c;
                    if (storyView instanceof TL_stories.TL_storyView) {
                        q9Var.N(ProfileActivity.D4(storyView.user_id));
                        break;
                    } else if (storyView instanceof TL_stories.TL_storyViewPublicRepost) {
                        f2Var.createOverlayStoryViewer().L(l5Var.getContext(), ((TL_stories.TL_storyViewPublicRepost) c5Var.b).story, i7.a(s4Var));
                        break;
                    } else if (storyReaction instanceof TL_stories.TL_storyReaction) {
                        q9Var.N(ProfileActivity.D4(org.telegram.messenger.m5.o(storyReaction.peer_id)));
                        break;
                    } else if (storyReaction instanceof TL_stories.TL_storyReactionPublicRepost) {
                        ArrayList arrayList2 = new ArrayList();
                        k5 k5Var = l5Var.E;
                        if (k5Var == null || (arrayList = k5Var.i) == null) {
                            i10 = 0;
                        } else {
                            int size = arrayList.size();
                            for (int i15 = 0; i15 < l5Var.E.i.size(); i15++) {
                                TL_stories.StoryReaction storyReaction2 = (TL_stories.StoryReaction) l5Var.E.i.get(i15);
                                if ((storyReaction2 instanceof TL_stories.TL_storyReactionPublicRepost) && (storyItem = (tL_storyReactionPublicRepost = (TL_stories.TL_storyReactionPublicRepost) storyReaction2).story) != null) {
                                    storyItem.dialogId = org.telegram.messenger.m5.o(tL_storyReactionPublicRepost.peer_id);
                                    if (storyReaction2 == storyReaction) {
                                        i14 = arrayList2.size();
                                    }
                                    arrayList2.add(storyItem);
                                }
                            }
                            i10 = size;
                        }
                        int i16 = i14;
                        if (i16 < 0 || arrayList2.size() <= 1) {
                            l5Var.G = null;
                            f2Var.createOverlayStoryViewer().L(l5Var.getContext(), ((TL_stories.TL_storyReactionPublicRepost) storyReaction).story, i7.a(s4Var));
                            break;
                        } else {
                            l5Var.G = new u6(l5Var.w, arrayList2);
                            l5Var.H = i10;
                            k5 k5Var2 = l5Var.E;
                            q9 createOverlayStoryViewer = f2Var.createOverlayStoryViewer();
                            Context context = l5Var.getContext();
                            u6 u6Var = l5Var.G;
                            i7 a10 = i7.a(s4Var);
                            a10.e = new r4(k5Var2, 0);
                            createOverlayStoryViewer.I(context, i16, u6Var, a10);
                            break;
                        }
                    } else {
                        boolean z10 = storyReaction instanceof TL_stories.TL_storyReactionPublicForward;
                        if (z10 || (storyView instanceof TL_stories.TL_storyViewPublicForward)) {
                            TLRPC.Message message = z10 ? storyReaction.message : storyView.message;
                            Bundle bundle = new Bundle();
                            long o4 = org.telegram.messenger.m5.o(message.peer_id);
                            if (o4 >= 0) {
                                bundle.putLong("user_id", o4);
                            } else {
                                bundle.putLong("chat_id", -o4);
                            }
                            bundle.putInt("message_id", message.id);
                            q9Var.N(new cn(bundle));
                            break;
                        }
                    }
                }
                break;
            case 1:
                ei.q qVar = (ei.q) obj2;
                ai.i iVar = (ai.i) obj;
                m41 m41Var = qVar.R1;
                if (m41Var != null && (G = m41Var.G(i7 - 1)) != null) {
                    Object obj3 = G.G;
                    if (obj3 instanceof y00) {
                        iVar.a(((y00) obj3).a);
                        qVar.dismiss();
                        break;
                    }
                }
                break;
            case 2:
                hi.q3.C0((hi.q3) obj2, (Context) obj, i7);
                break;
            case 3:
                org.telegram.ui.t5.A0((org.telegram.ui.t5) obj2, (Context) obj, view, i7);
                break;
            case 4:
                rc.b0((rc) obj2, (TLRPC.ChatFull) obj, view, i7);
                break;
            case 5:
                ic icVar = (ic) obj;
                rc rcVar = ((ec) obj2).c;
                int i17 = icVar.d;
                f61 f61Var = icVar.b;
                gp gpVar = qp.s1(i17).q4;
                if (gpVar != null) {
                    ArrayList arrayList3 = gpVar.c;
                    if (i7 >= 0 && i7 < arrayList3.size()) {
                        i11 = ((fp) arrayList3.get(i7)).c;
                        rcVar.f = i11;
                        rcVar.e1(true);
                        rcVar.h1(true);
                        rcVar.i1();
                        if (view.getLeft() >= org.telegram.messenger.g0.L(24.0f) + f61Var.getPaddingLeft()) {
                            f61Var.w0(-((org.telegram.messenger.g0.L(48.0f) + f61Var.getPaddingLeft()) - view.getLeft()), 0, null);
                            break;
                        } else if (view.getWidth() + view.getLeft() > (f61Var.getMeasuredWidth() - f61Var.getPaddingRight()) - org.telegram.messenger.g0.L(24.0f)) {
                            f61Var.w0(org.telegram.messenger.k5.B(48.0f, f61Var.getMeasuredWidth() - f61Var.getPaddingRight(), view.getWidth() + view.getLeft()), 0, null);
                            break;
                        }
                    }
                }
                i11 = 0;
                rcVar.f = i11;
                rcVar.e1(true);
                rcVar.h1(true);
                rcVar.i1();
                if (view.getLeft() >= org.telegram.messenger.g0.L(24.0f) + f61Var.getPaddingLeft()) {
                }
                break;
            case 6:
                cn cnVar = (cn) obj2;
                cnVar.getClass();
                TLObject tLObject = (TLObject) ((lf0) obj).c.get(i7);
                if (tLObject != null) {
                    cnVar.P7(true);
                    Bundle bundle2 = new Bundle();
                    if (tLObject instanceof TLRPC.User) {
                        bundle2.putLong("user_id", ((TLRPC.User) tLObject).id);
                    } else if (tLObject instanceof TLRPC.Chat) {
                        bundle2.putLong("chat_id", ((TLRPC.Chat) tLObject).id);
                    }
                    cnVar.presentFragment(new ProfileActivity(bundle2, null));
                    break;
                }
                break;
            case 7:
                mp.c0((mp) obj2, (Context) obj, view, i7);
                break;
            case 8:
                org.telegram.ui.Components.a0 a0Var = (org.telegram.ui.Components.a0) obj2;
                org.telegram.ui.ActionBar.g6 g6Var = (org.telegram.ui.ActionBar.g6) obj;
                y31 G2 = a0Var.f2.G(i7 - 1);
                if (G2 != null && G2.d == 1) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, a0Var.getContext(), g6Var);
                    String M0 = id.M0(2131754998, null);
                    org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
                    u1Var.R = M0;
                    u1Var.T = id.M0(2131754997, null);
                    alertDialog$Builder.h(id.M0(2131752589, null), null);
                    alertDialog$Builder.k(id.M0(2131751598, null), new org.telegram.ui.Components.u(a0Var, 0));
                    alertDialog$Builder.d(-1);
                    alertDialog$Builder.p();
                    break;
                }
                break;
            case 9:
                di diVar = (di) obj2;
                org.telegram.ui.ActionBar.g6 g6Var2 = (org.telegram.ui.ActionBar.g6) obj;
                eh ehVar = diVar.s3;
                vh[] vhVarArr = diVar.q2;
                org.telegram.ui.ActionBar.f2 f2Var2 = diVar.W1;
                org.telegram.ui.ActionBar.f2 Q = f2Var2 == null ? LaunchActivity.Q() : f2Var2;
                if (Q != null && Q.getParentActivity() != null) {
                    if (view instanceof xh) {
                        Activity parentActivity = Q.getParentActivity();
                        int intValue = view.getTag() instanceof Integer ? ((Integer) view.getTag()).intValue() : -1;
                        if (intValue == 1) {
                            if (diVar.F3 || diVar.G3 || !diVar.N0()) {
                                if (!diVar.F3 && !diVar.G3) {
                                    org.telegram.ui.Components.cn cnVar2 = new org.telegram.ui.Components.cn(1, diVar.getContext(), g6Var2, diVar);
                                    diVar.K1 = cnVar2;
                                    diVar.F1(cnVar2);
                                }
                                diVar.F1(diVar.a2);
                            }
                        } else if (intValue == 17) {
                            if (diVar.n2 == null && (f2Var2 instanceof cn)) {
                                TLRPC.User j3 = ((cn) f2Var2).j();
                                if (di.g1(j3)) {
                                    ik ikVar = new ik(diVar, diVar.getContext(), diVar.D3, j3, g6Var2);
                                    diVar.n2 = ikVar;
                                    vhVarArr[11] = ikVar;
                                }
                            }
                            ik ikVar2 = diVar.n2;
                            if (ikVar2 != null) {
                                diVar.F1(ikVar2);
                            }
                        } else if (intValue == 3) {
                            if (diVar.H3 || !diVar.N0()) {
                                if (Build.VERSION.SDK_INT >= 33) {
                                    if (parentActivity.checkSelfPermission("android.permission.READ_MEDIA_AUDIO") != 0) {
                                        parentActivity.requestPermissions(new String[]{"android.permission.READ_MEDIA_AUDIO"}, 4);
                                        break;
                                    }
                                } else if (parentActivity.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") != 0) {
                                    org.telegram.messenger.g0.W(diVar.getContext()).requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 4);
                                    break;
                                }
                                diVar.p1(true);
                            }
                        } else if (intValue == 4) {
                            if (diVar.E3 || !diVar.N0()) {
                                if (Build.VERSION.SDK_INT >= 33) {
                                    if (parentActivity.checkSelfPermission("android.permission.READ_MEDIA_IMAGES") != 0 || parentActivity.checkSelfPermission("android.permission.READ_MEDIA_VIDEO") != 0) {
                                        parentActivity.requestPermissions(new String[]{"android.permission.READ_MEDIA_IMAGES", "android.permission.READ_MEDIA_VIDEO"}, 4);
                                        break;
                                    }
                                } else if (parentActivity.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") != 0) {
                                    org.telegram.messenger.g0.W(diVar.getContext()).requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 4);
                                    break;
                                }
                                diVar.r1(true);
                            }
                        } else if (intValue != 5) {
                            int i18 = 12;
                            if (intValue == 6) {
                                if ((diVar.K3 || !diVar.N0()) && org.telegram.messenger.g0.J1(f2Var2)) {
                                    if (diVar.K3) {
                                        if (diVar.f2 == null) {
                                            wk wkVar = new wk(diVar, diVar.getContext(), g6Var2, (diVar.y1 || diVar.L3) ? false : true);
                                            diVar.f2 = wkVar;
                                            vhVarArr[5] = wkVar;
                                            vk vkVar = diVar.q4;
                                            if (vkVar != null) {
                                                wkVar.setDelegate(vkVar);
                                            } else {
                                                wkVar.setDelegate(new mg(diVar, i18));
                                            }
                                        }
                                        diVar.F1(diVar.f2);
                                    } else {
                                        org.telegram.ui.Components.cn cnVar3 = new org.telegram.ui.Components.cn(6, diVar.getContext(), g6Var2, diVar);
                                        diVar.K1 = cnVar3;
                                        diVar.F1(cnVar3);
                                    }
                                }
                            } else if (intValue == 9) {
                                if (diVar.I3 || !diVar.N0()) {
                                    if (diVar.I3) {
                                        diVar.H1(true, null);
                                    } else {
                                        org.telegram.ui.Components.cn cnVar4 = new org.telegram.ui.Components.cn(9, diVar.getContext(), g6Var2, diVar);
                                        diVar.K1 = cnVar4;
                                        diVar.F1(cnVar4);
                                    }
                                }
                            } else if (intValue == 11) {
                                if (diVar.j2 == null) {
                                    kg.g0 g0Var = new kg.g0(diVar.getContext(), diVar.I0, diVar);
                                    diVar.j2 = g0Var;
                                    vhVarArr[7] = g0Var;
                                    g0Var.setupBlurredSearchField(diVar.B4);
                                }
                                diVar.F1(diVar.j2);
                            } else if (intValue == 12) {
                                if (diVar.J3 || !diVar.N0()) {
                                    if (diVar.J3) {
                                        if (diVar.e2 == null) {
                                            bn bnVar = new bn(diVar, diVar.getContext(), true, g6Var2, null);
                                            diVar = diVar;
                                            diVar.e2 = bnVar;
                                            vhVarArr[1] = bnVar;
                                            bnVar.setDelegate(new mg(diVar, i13));
                                        }
                                        diVar.F1(diVar.e2);
                                    } else {
                                        org.telegram.ui.Components.cn cnVar5 = new org.telegram.ui.Components.cn(9, diVar.getContext(), g6Var2, diVar);
                                        diVar.K1 = cnVar5;
                                        diVar.F1(cnVar5);
                                    }
                                }
                            } else if (intValue == 13) {
                                if (diVar.l2 == null) {
                                    wj wjVar = new wj(diVar, diVar.getContext(), g6Var2, true);
                                    diVar.l2 = wjVar;
                                    vhVarArr[8] = wjVar;
                                    wjVar.setDelegate(diVar.U3);
                                }
                                diVar.F1(diVar.l2);
                            } else if (intValue == 14) {
                                if (diVar.k2 == null) {
                                    wj wjVar2 = new wj(diVar, diVar.getContext(), g6Var2, false);
                                    diVar.k2 = wjVar2;
                                    vhVarArr[9] = wjVar2;
                                    wjVar2.setDelegate(diVar.U3);
                                }
                                diVar.F1(diVar.k2);
                            } else if (intValue == 16) {
                                if (diVar.m2 == null) {
                                    li.p pVar = new li.p(diVar.D3, diVar.getContext(), g6Var2, diVar);
                                    diVar.m2 = pVar;
                                    vhVarArr[10] = pVar;
                                }
                                diVar.F1(diVar.m2);
                            } else if (view.getTag() instanceof Integer) {
                                diVar.T3.o1(((Integer) view.getTag()).intValue(), true, true, 0, 0, 0L, diVar.f1(), false, 0L);
                            }
                        } else if (diVar.K3 || !diVar.N0()) {
                            if (diVar.K3 && diVar.getContext().checkSelfPermission("android.permission.READ_CONTACTS") != 0) {
                                org.telegram.messenger.g0.W(diVar.getContext()).requestPermissions(new String[]{"android.permission.READ_CONTACTS"}, 5);
                                break;
                            } else {
                                diVar.q1();
                            }
                        }
                    } else if (view instanceof wh) {
                        wh whVar = (wh) view;
                        TLRPC.TL_attachMenuBot tL_attachMenuBot = whVar.c;
                        if (tL_attachMenuBot == null) {
                            diVar.T3.Y0(whVar.b);
                            diVar.dismiss();
                        } else if (tL_attachMenuBot.inactive) {
                            zc1.a(diVar.getContext(), new org.telegram.messenger.voip.k(23, diVar, whVar), null);
                        } else {
                            diVar.C1(tL_attachMenuBot.bot_id, null, false, true);
                        }
                    }
                    int left = view.getLeft();
                    int right = view.getRight();
                    int L = org.telegram.messenger.g0.L(70.0f);
                    int i19 = left - L;
                    if (i19 < 0) {
                        ehVar.w0(i19, 0, null);
                        break;
                    } else {
                        int i20 = right + L;
                        if (i20 > ehVar.getMeasuredWidth()) {
                            ehVar.w0(i20 - ehVar.getMeasuredWidth(), 0, null);
                            break;
                        }
                    }
                }
                break;
            case 10:
                fj fjVar = (fj) obj2;
                org.telegram.ui.ActionBar.g6 g6Var3 = (org.telegram.ui.ActionBar.g6) obj;
                zi ziVar = fjVar.E;
                v4.g0 adapter = fjVar.s.getAdapter();
                bj bjVar = fjVar.F;
                if (adapter == bjVar) {
                    O = bjVar.E(i7);
                } else {
                    int S = ziVar.S(i7);
                    int Q2 = ziVar.Q(i7);
                    if (Q2 >= 0 && S >= 0) {
                        O = ziVar.O(S, Q2);
                    }
                }
                if (O != null) {
                    if (fjVar.x.isEmpty()) {
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
                        bd0 bd0Var = new bd0(fjVar.b.W1, d5Var, null, null, null, null, str, str2, g6Var3);
                        bd0Var.B1 = new ri(fjVar);
                        bd0Var.show();
                        break;
                    } else {
                        fjVar.P((ej) view, O);
                        break;
                    }
                }
                break;
            case 11:
                u60 u60Var = (u60) obj2;
                TLRPC.Chat chat = (TLRPC.Chat) obj;
                q60 q60Var = u60Var.m1;
                ArrayList arrayList4 = u60Var.p1;
                if (!u60Var.x1 && arrayList4.get(i7) != u60Var.t1) {
                    u60Var.t1 = (TLRPC.Peer) arrayList4.get(i7);
                    boolean z11 = view instanceof org.telegram.ui.Cells.h4;
                    if (z11) {
                        z9 = true;
                        ((org.telegram.ui.Cells.h4) view).c(true, true);
                    } else {
                        z9 = true;
                        if (view instanceof org.telegram.ui.Cells.d7) {
                            ((org.telegram.ui.Cells.d7) view).b(true, true);
                            view.invalidate();
                        }
                    }
                    int childCount = q60Var.getChildCount();
                    for (int i21 = 0; i21 < childCount; i21++) {
                        View childAt = q60Var.getChildAt(i21);
                        if (childAt != view) {
                            if (z11) {
                                ((org.telegram.ui.Cells.h4) childAt).c(false, z9);
                            } else if (view instanceof org.telegram.ui.Cells.d7) {
                                ((org.telegram.ui.Cells.d7) childAt).b(false, z9);
                            }
                        }
                    }
                    if (u60Var.s1 != 0) {
                        u60Var.M0(chat, z9);
                        break;
                    }
                }
                break;
            case 12:
                h90 h90Var = (h90) obj2;
                e90 e90Var = (e90) obj;
                if (i7 != 0) {
                    jg.i1 adapter2 = h90Var.getAdapter();
                    if (adapter2.w0 == null || adapter2.h0) {
                        int i22 = i7 - 1;
                        Object J = h90Var.getAdapter().J(i22);
                        int i23 = h90Var.getAdapter().X;
                        int i24 = h90Var.getAdapter().Y;
                        if (h90Var.getAdapter().F == null || i22 != 1) {
                            if (h90Var.getAdapter().F == null || i22 != 0) {
                                if (J instanceof TLRPC.TL_document) {
                                    if (view instanceof org.telegram.ui.Cells.x7) {
                                        ((org.telegram.ui.Cells.x7) view).getSendAnimationData();
                                    }
                                    TLRPC.TL_document tL_document = (TLRPC.TL_document) J;
                                    e90Var.e1(tL_document, ij.U(tL_document), h90Var.getAdapter().L(i22));
                                } else if (J instanceof TLRPC.Chat) {
                                    String K = org.telegram.messenger.t3.K((TLRPC.Chat) J, false);
                                    if (K != null) {
                                        e90Var.z1(i23, i24, a8.p0.p("@", K, " "), false);
                                    }
                                } else if (J instanceof TLRPC.User) {
                                    TLRPC.User user3 = (TLRPC.User) J;
                                    if (t10.n(user3) != null) {
                                        e90Var.z1(i23, i24, "@" + t10.n(user3) + " ", false);
                                    } else {
                                        SpannableString spannableString = new SpannableString(rf.b.r(t10.j(user3, false), " "));
                                        spannableString.setSpan(new f41("" + user3.id, 3, null), 0, spannableString.length(), 33);
                                        e90Var.z1(i23, i24, spannableString, false);
                                    }
                                } else if (J instanceof String) {
                                    e90Var.z1(i23, i24, J + " ", false);
                                } else if (J instanceof qi) {
                                    String str7 = ((qi) J).a;
                                    e90Var.G1(str7);
                                    if (str7 != null) {
                                        try {
                                        } catch (Exception unused) {
                                            e90Var.z1(i23, i24, str7, true);
                                        }
                                        if (str7.startsWith("animated_")) {
                                            try {
                                                fontMetricsInt = e90Var.R0();
                                            } catch (Exception e10) {
                                                org.telegram.messenger.a8.g(e10, false);
                                                fontMetricsInt = null;
                                            }
                                            long parseLong = Long.parseLong(str7.substring(9));
                                            TLRPC.Document e11 = org.telegram.ui.Components.i5.e(p10.s0, parseLong);
                                            SpannableString spannableString2 = new SpannableString(ij.U(e11));
                                            spannableString2.setSpan(e11 != null ? new org.telegram.ui.Components.r5(e11, fontMetricsInt) : new org.telegram.ui.Components.r5(parseLong, fontMetricsInt), 0, spannableString2.length(), 33);
                                            e90Var.z1(i23, i24, spannableString2, false);
                                            h90Var.o(false);
                                        }
                                    }
                                    e90Var.z1(i23, i24, str7, true);
                                    h90Var.o(false);
                                }
                                if (J instanceof TLRPC.BotInlineResult) {
                                    TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) J;
                                    if ((!botInlineResult.type.equals("photo") || (botInlineResult.photo == null && botInlineResult.content == null)) && ((!botInlineResult.type.equals("gif") || (botInlineResult.document == null && botInlineResult.content == null)) && (!botInlineResult.type.equals(MediaStreamTrack.VIDEO_TRACK_KIND) || botInlineResult.document == null))) {
                                        e90Var.M(botInlineResult, true, 0);
                                        break;
                                    } else {
                                        ArrayList arrayList5 = new ArrayList(h90Var.getAdapter().R);
                                        h90Var.P = arrayList5;
                                        PhotoViewer.p1().H2(null, h90Var.h, h90Var.a);
                                        PhotoViewer.p1().e2(arrayList5, h90Var.getAdapter().M(i22), 3, false, h90Var.Q, null);
                                        break;
                                    }
                                }
                            } else {
                                e90Var.z1(i23, i24, a8.p0.s(new StringBuilder(), h90Var.getAdapter().F, " "), false);
                                break;
                            }
                        } else {
                            TLRPC.Chat chat2 = h90Var.getAdapter().l0;
                            if (chat2 == null && h90Var.getAdapter().G0 != null) {
                                chat2 = h90Var.getAdapter().G0.e;
                            }
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(h90Var.getAdapter().F);
                            e90Var.z1(i23, i24, a8.p0.s(sb2, chat2 != null ? "@" + org.telegram.messenger.t3.K(chat2, false) : "", " "), false);
                            break;
                        }
                    }
                } else {
                    h90Var.getClass();
                    break;
                }
                break;
            case 13:
                re0 re0Var = (re0) obj2;
                HashSet hashSet = re0Var.r1;
                ne0 ne0Var = re0Var.j1;
                if (org.telegram.messenger.g0.E1((Context) obj)) {
                    ArrayList arrayList6 = re0Var.w1;
                    if (arrayList6 == null || arrayList6.isEmpty()) {
                        if (view instanceof org.telegram.ui.Cells.m8) {
                            int S2 = ne0Var.S(i7) - 1;
                            int Q3 = ne0Var.Q(i7) - 1;
                            if (Q3 > 0 && S2 >= 0) {
                                qe0 qe0Var = (qe0) re0Var.t1.get(S2);
                                if (Q3 == qe0Var.b() && !hashSet.contains(qe0Var)) {
                                    if (!qe0Var.e || qe0Var.f >= qe0Var.b.size()) {
                                        hashSet.add(qe0Var);
                                        TLRPC.TL_messages_getPollVotes tL_messages_getPollVotes = new TLRPC.TL_messages_getPollVotes();
                                        tL_messages_getPollVotes.peer = re0Var.q1;
                                        tL_messages_getPollVotes.id = re0Var.o1.e1();
                                        tL_messages_getPollVotes.limit = 50;
                                        int i25 = tL_messages_getPollVotes.flags;
                                        tL_messages_getPollVotes.option = qe0Var.d;
                                        tL_messages_getPollVotes.flags = i25 | 3;
                                        tL_messages_getPollVotes.offset = qe0Var.c;
                                        ConnectionsManager.getInstance(re0Var.a).sendRequest(tL_messages_getPollVotes, new ld(18, re0Var, qe0Var));
                                        break;
                                    } else {
                                        int min = Math.min(qe0Var.f + 50, qe0Var.b.size());
                                        qe0Var.f = min;
                                        if (min == qe0Var.b.size()) {
                                            qe0Var.e = false;
                                        }
                                        re0Var.J0(null);
                                        ne0Var.X(true);
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
                                re0Var.dismiss();
                                org.telegram.ui.ActionBar.f2 T = LaunchActivity.T();
                                if (T != null) {
                                    ProfileActivity profileActivity = new ProfileActivity(bundle3, null);
                                    if (T instanceof cn) {
                                        if (pollVotesAlert$UserCell.h != null) {
                                            TLRPC.User j10 = ((cn) T).j();
                                            re0Var.i1.getChildAt(0);
                                            profileActivity.j5((j10 == null || j10.id != pollVotesAlert$UserCell.h.id) ? 0 : 1);
                                        } else {
                                            TLRPC.Chat chat3 = ((cn) T).e;
                                            profileActivity.j5((chat3 == null || chat3.id != pollVotesAlert$UserCell.n.id) ? 0 : 1);
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
                t01 t01Var = (t01) obj2;
                EditText editText = t01Var.w;
                long a11 = ((q01) t01Var.s.c.get(i7)).a();
                cn cnVar6 = ((fk) obj).a;
                if (cnVar6.Y9()) {
                    cn.M2(a11, cnVar6);
                } else {
                    n11 n11Var = cnVar6.f2;
                    if (n11Var != null) {
                        n11Var.n(a11, false);
                    }
                }
                if (editText.length() > 0) {
                    editText.setText("");
                }
                editText.clearFocus();
                t01Var.d();
                break;
            case 15:
                w21 w21Var = (w21) obj2;
                org.telegram.ui.ActionBar.g6 g6Var4 = (org.telegram.ui.ActionBar.g6) obj;
                y31 G3 = w21Var.b2.G(i7 - 1);
                if (G3 != null) {
                    int i26 = G3.d;
                    if (i26 == 1) {
                        CharSequence charSequence = w21Var.U1;
                        if (charSequence != null && !w21Var.T1) {
                            org.telegram.messenger.g0.g(charSequence);
                            break;
                        }
                    } else if (i26 == 2) {
                        if (p10.i(w21Var.a).q()) {
                            qp.s1(w21Var.a).s7.K(0L, !r0.B(0L));
                            w21Var.dismiss();
                            break;
                        } else if (LaunchActivity.T() != null) {
                            new ug.w0(13, w21Var.getContext(), g6Var4).show();
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
                y40.Z((y40) obj2, (Context) obj, view, i7);
                break;
            case 19:
                ef0 ef0Var = (ef0) obj2;
                Context context2 = (Context) obj;
                HashMap hashMap = ef0Var.k0;
                if (i7 == ef0Var.Q) {
                    TLRPC.User user5 = (TLRPC.User) hashMap.get(Long.valueOf(ef0Var.e.admin_id));
                    if (user5 != null) {
                        Bundle bundle4 = new Bundle();
                        bundle4.putLong("user_id", user5.id);
                        qp.s1(p10.s0).X3(user5, false, false);
                        ef0Var.presentFragment(new ProfileActivity(bundle4, null));
                        break;
                    }
                } else if (i7 == ef0Var.y) {
                    j90 j90Var = new j90(0, ef0Var.n);
                    j90Var.S = ef0Var.s0;
                    ef0Var.presentFragment(j90Var);
                    break;
                } else {
                    int i27 = ef0Var.D;
                    if (i7 >= i27 && i7 < ef0Var.E) {
                        n50 n50Var = new n50(context2, (TLRPC.TL_chatInviteExported) ef0Var.i0.get(i7 - i27), ef0Var.d, hashMap, ef0Var, ef0Var.n, false, ef0Var.h);
                        ef0Var.l0 = n50Var;
                        n50Var.b2 = ef0Var.p0;
                        n50Var.show();
                        break;
                    } else {
                        int i28 = ef0Var.H;
                        if (i7 >= i28 && i7 < ef0Var.I) {
                            n50 n50Var2 = new n50(context2, (TLRPC.TL_chatInviteExported) ef0Var.j0.get(i7 - i28), ef0Var.d, hashMap, ef0Var, ef0Var.n, false, ef0Var.h);
                            ef0Var.l0 = n50Var2;
                            n50Var2.show();
                            break;
                        } else if (i7 != ef0Var.N) {
                            int i29 = ef0Var.U;
                            if (i7 >= i29 && i7 < ef0Var.V) {
                                TLRPC.TL_chatAdminWithInvites tL_chatAdminWithInvites = (TLRPC.TL_chatAdminWithInvites) ef0Var.m0.get(i7 - i29);
                                if (hashMap.containsKey(Long.valueOf(tL_chatAdminWithInvites.admin_id))) {
                                    ef0Var.getMessagesController().X3((TLRPC.User) hashMap.get(Long.valueOf(tL_chatAdminWithInvites.admin_id)), false, false);
                                }
                                ef0 ef0Var2 = new ef0(ef0Var.n, tL_chatAdminWithInvites.invites_count, tL_chatAdminWithInvites.admin_id);
                                ef0Var2.m0(ef0Var.d, null);
                                ef0Var.presentFragment(ef0Var2);
                                break;
                            }
                        } else if (!ef0Var.c0) {
                            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(ef0Var.getParentActivity());
                            String M02 = id.M0(2131751575, null);
                            org.telegram.ui.ActionBar.u1 u1Var2 = alertDialog$Builder2.a;
                            u1Var2.R = M02;
                            u1Var2.T = id.M0(2131751576, null);
                            alertDialog$Builder2.k(id.M0(2131751598, null), new org.telegram.ui.re0(ef0Var));
                            alertDialog$Builder2.h(id.M0(2131752589, null), null);
                            ef0Var.showDialog(u1Var2);
                            break;
                        }
                    }
                }
                break;
            case 20:
                b(i7, view);
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
                wg.q0 q0Var = (wg.q0) obj2;
                TLRPC.Chat chat4 = (TLRPC.Chat) obj;
                ArrayList arrayList7 = q0Var.P1;
                if (view instanceof ah.r) {
                    ah.r rVar = (ah.r) view;
                    if (rVar.getBoost().cooldown_until_date > 0) {
                        new hc(q0Var.c, q0Var.I0).G(R.raw.chats_infotip, 5, org.telegram.messenger.g0.X2(id.G((int) qp.s1(p10.s0).r0, "BoostingWaitWarningPlural", new Object[0]))).k(true);
                        break;
                    } else {
                        if (arrayList7.contains(rVar.getBoost())) {
                            arrayList7.remove(rVar.getBoost());
                        } else {
                            arrayList7.add(rVar.getBoost());
                        }
                        rVar.c(arrayList7.contains(rVar.getBoost()), true);
                        q0Var.d1(true);
                        q0Var.T1.a(arrayList7, chat4);
                        break;
                    }
                }
                break;
        }
    }
}
