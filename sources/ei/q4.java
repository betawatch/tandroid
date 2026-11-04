package ei;

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
import b8.mf;
import ci.eb;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.h10;
import org.telegram.messenger.hi;
import org.telegram.messenger.hp;
import org.telegram.messenger.hs;
import org.telegram.messenger.l10;
import org.telegram.messenger.q00;
import org.telegram.messenger.wo;
import org.telegram.messenger.xo;
import org.telegram.messenger.zi;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.PollVotesAlert$UserCell;
import org.telegram.ui.Components.aj;
import org.telegram.ui.Components.an;
import org.telegram.ui.Components.bh;
import org.telegram.ui.Components.bi;
import org.telegram.ui.Components.bn;
import org.telegram.ui.Components.c90;
import org.telegram.ui.Components.cb0;
import org.telegram.ui.Components.dj;
import org.telegram.ui.Components.ej;
import org.telegram.ui.Components.f41;
import org.telegram.ui.Components.fc;
import org.telegram.ui.Components.fj0;
import org.telegram.ui.Components.g11;
import org.telegram.ui.Components.hk;
import org.telegram.ui.Components.i50;
import org.telegram.ui.Components.k60;
import org.telegram.ui.Components.kg;
import org.telegram.ui.Components.l01;
import org.telegram.ui.Components.n01;
import org.telegram.ui.Components.o60;
import org.telegram.ui.Components.oe0;
import org.telegram.ui.Components.q21;
import org.telegram.ui.Components.r31;
import org.telegram.ui.Components.re0;
import org.telegram.ui.Components.ri;
import org.telegram.ui.Components.se0;
import org.telegram.ui.Components.sp0;
import org.telegram.ui.Components.th;
import org.telegram.ui.Components.tj0;
import org.telegram.ui.Components.tk;
import org.telegram.ui.Components.uh;
import org.telegram.ui.Components.uk;
import org.telegram.ui.Components.uo;
import org.telegram.ui.Components.vc0;
import org.telegram.ui.Components.vh;
import org.telegram.ui.Components.vj;
import org.telegram.ui.Components.y31;
import org.telegram.ui.Components.yi;
import org.telegram.ui.Components.yz0;
import org.telegram.ui.Components.z80;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PrivacySettingsActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.UsersSelectActivity;
import org.telegram.ui.cc;
import org.telegram.ui.cx;
import org.telegram.ui.df0;
import org.telegram.ui.e90;
import org.telegram.ui.gc;
import org.telegram.ui.ip;
import org.telegram.ui.jb0;
import org.telegram.ui.ke0;
import org.telegram.ui.pc;
import org.telegram.ui.ph0;
import org.telegram.ui.r00;
import org.telegram.ui.r40;
import org.telegram.ui.rc1;
import org.telegram.ui.rt;
import org.telegram.ui.u51;
import org.telegram.ui.wm;
import org.telegram.ui.xe0;
import org.telegram.ui.zj;
import org.webrtc.MediaStreamTrack;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class q4 implements fj0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ q4(int i3, Object obj, Object obj2) {
        this.a = i3;
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
    private final void a(int i3, View view) {
        String str;
        int i10;
        int i11;
        boolean z10;
        int i12;
        sp0 sp0Var;
        rt rtVar = (rt) this.b;
        org.telegram.ui.ActionBar.d2 d2Var = (org.telegram.ui.ActionBar.d2) this.c;
        uo uoVar = (uo) rtVar.c.d.get(i3);
        org.telegram.ui.ActionBar.j6 i13 = uoVar.a.i(rtVar.w);
        jg.b bVar = uoVar.a.c;
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
            jg.b bVar2 = uoVar.a.c;
            if (bVar2 != null && (str2 = bVar2.b) == null) {
                str2 = bVar2.a;
            }
            if (!str2.equals("🎨")) {
                i10 = -1;
                if (i13 == null) {
                    TLRPC.TL_theme tL_theme = ((org.telegram.ui.ActionBar.o3) uoVar.a.f.get(rtVar.w)).b;
                    org.telegram.ui.ActionBar.j6 Q0 = org.telegram.ui.ActionBar.k6.Q0(org.telegram.ui.ActionBar.k6.r0(tL_theme.settings.get(((org.telegram.ui.ActionBar.o3) uoVar.a.f.get(rtVar.w)).d)));
                    if (Q0 != null) {
                        org.telegram.ui.ActionBar.g6 g6Var = (org.telegram.ui.ActionBar.g6) Q0.d0.get(tL_theme.id);
                        if (g6Var == null) {
                            g6Var = Q0.f(tL_theme, d2Var.getCurrentAccount(), 0);
                        }
                        i10 = g6Var.a;
                        Q0.u(i10);
                    }
                    i13 = Q0;
                }
                org.telegram.ui.ActionBar.k6.K1(i13, false, i10, view);
                rtVar.r = i3;
                i11 = 0;
                while (true) {
                    z10 = true;
                    if (i11 < rtVar.c.d.size()) {
                        break;
                    }
                    uo uoVar2 = (uo) rtVar.c.d.get(i11);
                    if (i11 != rtVar.r) {
                        z10 = false;
                    }
                    uoVar2.d = z10;
                    i11++;
                }
                rtVar.c.E(rtVar.r);
                for (i12 = 0; i12 < rtVar.a.getChildCount(); i12++) {
                    yz0 yz0Var = (yz0) rtVar.a.getChildAt(i12);
                    if (yz0Var != view && (sp0Var = yz0Var.K) != null) {
                        org.telegram.messenger.g0.r(sp0Var);
                        yz0Var.K.run();
                    }
                }
                ((yz0) view).d();
                if (i13 != null) {
                    SharedPreferences.Editor edit = org.telegram.messenger.t0.b.getSharedPreferences("themeconfig", 0).edit();
                    edit.putString((rtVar.s == 1 || i13.q()) ? "lastDarkTheme" : "lastDayTheme", i13.m());
                    edit.commit();
                }
                org.telegram.ui.ActionBar.k6.M1(d2Var);
            }
        }
        i10 = ((org.telegram.ui.ActionBar.o3) uoVar.a.f.get(rtVar.w)).e;
        if (i13 == null) {
        }
        org.telegram.ui.ActionBar.k6.K1(i13, false, i10, view);
        rtVar.r = i3;
        i11 = 0;
        while (true) {
            z10 = true;
            if (i11 < rtVar.c.d.size()) {
            }
            uoVar2.d = z10;
            i11++;
        }
        rtVar.c.E(rtVar.r);
        while (i12 < rtVar.a.getChildCount()) {
        }
        ((yz0) view).d();
        if (i13 != null) {
        }
        org.telegram.ui.ActionBar.k6.M1(d2Var);
    }

    private final void b(int i3, View view) {
        ph0.Z((ph0) this.b, (Context) this.c, view, i3);
    }

    private final void c(int i3, View view) {
        PrivacySettingsActivity.a0((PrivacySettingsActivity) this.b, (Context) this.c, view, i3);
    }

    private final void d(int i3, View view) {
        UsersSelectActivity.Z((UsersSelectActivity) this.b, (Context) this.c, view, i3);
    }

    private final void e(int i3, View view) {
        org.telegram.ui.Components.w3 w3Var;
        ua.b bVar;
        xg.a0 a0Var = (xg.a0) this.b;
        org.telegram.ui.ActionBar.d2 d2Var = (org.telegram.ui.ActionBar.d2) this.c;
        ArrayList arrayList = a0Var.W1;
        xg.t tVar = a0Var.r2;
        if (view instanceof zg.y) {
            zg.y yVar = (zg.y) view;
            int type = yVar.getType();
            boolean z10 = yVar.e.h;
            boolean z11 = !z10;
            yVar.setChecked(z11);
            int i10 = zg.y.M;
            if (type == 0) {
                a0Var.q2 = z11;
                a0Var.k1(false, false);
            } else if (type == 1) {
                yVar.setDivider(z11);
                a0Var.p2 = z11;
                a0Var.k1(false, false);
                yg.b bVar2 = a0Var.Z1;
                int i11 = 0;
                while (true) {
                    if (i11 >= bVar2.e.size()) {
                        break;
                    }
                    yg.a aVar = (yg.a) bVar2.e.get(i11);
                    if (aVar.a == 15) {
                        int i12 = aVar.l;
                        int i13 = zg.y.M;
                        if (i12 == 1) {
                            if (z10) {
                                bVar2.s(i11 + 1);
                            } else {
                                bVar2.i(i11 + 1);
                            }
                        }
                    }
                    i11++;
                }
                a0Var.Z1.G();
                if (a0Var.p2) {
                    org.telegram.messenger.g0.r(tVar);
                } else {
                    org.telegram.messenger.g0.i3(tVar, 250L);
                }
            }
        }
        if (view instanceof zg.c) {
            if (view instanceof zg.d) {
                int selectedType = ((zg.d) view).getSelectedType();
                int i14 = zg.d.w;
                if (selectedType == 2 || selectedType == 3) {
                    if (selectedType == 2 && a0Var.a2 == selectedType) {
                        ua.b bVar3 = a0Var.k2;
                        if (bVar3 != null) {
                            ((xg.w0) bVar3.b).h1(1, arrayList);
                            ((xg.n) bVar3.c).j1.D(1);
                            return;
                        }
                        return;
                    }
                    a0Var.a2 = selectedType;
                    a0Var.k1(true, true);
                    a0Var.j1(true);
                    a0Var.b1();
                } else if (selectedType == 1) {
                    ua.b bVar4 = a0Var.k2;
                    if (bVar4 != null) {
                        ((xg.w0) bVar4.b).h1(1, arrayList);
                        ((xg.n) bVar4.c).j1.D(1);
                    }
                } else {
                    a0Var.b2 = selectedType;
                    a0Var.k1(true, true);
                    a0Var.j1(true);
                    a0Var.b1();
                }
            } else {
                zg.c cVar = (zg.c) view;
                tj0 tj0Var = a0Var.l1;
                if (cVar.b()) {
                    for (int i15 = 0; i15 < tj0Var.getChildCount(); i15++) {
                        View childAt = tj0Var.getChildAt(i15);
                        if (childAt.getClass().isInstance(cVar)) {
                            ((zg.c) childAt).c(childAt == cVar, true);
                        }
                    }
                }
            }
        }
        if (view instanceof zg.u) {
            int selectedType2 = ((zg.u) view).getSelectedType();
            if (a0Var.c2 == selectedType2 && (bVar = a0Var.k2) != null) {
                ((xg.w0) bVar.b).h1(3, a0Var.X1);
                ((xg.n) bVar.c).j1.D(1);
            }
            a0Var.c2 = selectedType2;
            a0Var.k1(false, false);
            return;
        }
        if (view instanceof zg.i) {
            a0Var.e2 = ((TLRPC.TL_premiumGiftCodeOption) ((zg.i) view).getGifCode()).months;
            a0Var.k1(false, false);
            a0Var.Z1.G();
            return;
        }
        if (!(view instanceof zg.h)) {
            if (view instanceof zg.b) {
                ua.b bVar5 = a0Var.k2;
                if (bVar5 != null) {
                    ((xg.w0) bVar5.b).h1(2, a0Var.V1);
                    ((xg.n) bVar5.c).j1.D(1);
                    return;
                }
                return;
            }
            if (!(view instanceof zg.w)) {
                if (view instanceof eb) {
                    a0Var.d2 = true;
                    a0Var.k1(true, true);
                    return;
                }
                return;
            }
            TL_stars.TL_starsGiveawayOption option = ((zg.w) view).getOption();
            if (option != null) {
                a0Var.i2 = option.stars;
                a0Var.k1(true, true);
                a0Var.j1(true);
                a0Var.b1();
                return;
            }
            return;
        }
        Context context = d2Var.getContext();
        long j10 = a0Var.f2;
        xg.u uVar = new xg.u(a0Var);
        org.telegram.ui.ActionBar.e6 e6Var = a0Var.J0;
        org.telegram.ui.Components.q4 q4Var = new org.telegram.ui.Components.q4(e6Var);
        hi.d dVar = new hi.d(context, e6Var);
        ((org.telegram.ui.ActionBar.t2) dVar.b).w0 = false;
        cb0 cb0Var = new cb0(context, e6Var);
        int i16 = q4Var.a;
        cb0Var.setTextColor(i16);
        cb0Var.setTextOffset(org.telegram.messenger.g0.L(10.0f));
        cb0Var.setItemCount(5);
        xg.h hVar = new xg.h(context, e6Var);
        hVar.setWrapSelectorWheel(true);
        hVar.setAllItemsCount(24);
        hVar.setItemCount(5);
        hVar.setTextColor(i16);
        hVar.setTextOffset(-org.telegram.messenger.g0.L(10.0f));
        hVar.setTag("HOUR");
        xg.i iVar = new xg.i(context, e6Var);
        iVar.setWrapSelectorWheel(true);
        iVar.setAllItemsCount(60);
        iVar.setItemCount(5);
        iVar.setTextColor(i16);
        iVar.setTextOffset(-org.telegram.messenger.g0.L(34.0f));
        org.telegram.ui.Components.w3 w3Var2 = new org.telegram.ui.Components.w3(context, q4Var, cb0Var, hVar, iVar);
        w3Var2.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        w3Var2.addView(frameLayout, mf.t(-1, -2, 51, 22, 0, 0, 4));
        TextView textView = new TextView(context);
        textView.setText(bd.M0(2131753287, "BoostingSelectDateTime"));
        textView.setTextColor(i16);
        k2.p1.t(textView, 1, 20.0f);
        frameLayout.addView(textView, mf.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
        textView.setOnTouchListener(new fi.a(2));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setWeightSum(1.0f);
        w3Var2.addView(linearLayout, mf.q(-1, -2, 1.0f, 0, 0, 12, 0, 12));
        long currentTimeMillis = System.currentTimeMillis();
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(currentTimeMillis);
        int i17 = calendar.get(1);
        jb0 jb0Var = new jb0(context, 5);
        long j11 = hp.s1(h10.t0).p0 * 1000;
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTimeInMillis(j11);
        int i18 = calendar2.get(6);
        calendar2.setTimeInMillis(System.currentTimeMillis());
        calendar2.add(14, (int) j11);
        int i19 = calendar2.get(11);
        int i20 = calendar.get(12);
        linearLayout.addView(cb0Var, mf.l(0.5f, 0, hs.t4));
        cb0Var.setMinValue(0);
        cb0Var.setMaxValue(i18 - 1);
        cb0Var.setWrapSelectorWheel(false);
        cb0Var.setTag("DAY");
        cb0Var.setFormatter(new r00(currentTimeMillis, calendar, i17, 1));
        ii.g4 g4Var = new ii.g4(w3Var2, hVar, iVar, i19, i20, cb0Var);
        cb0Var.setOnValueChangedListener(g4Var);
        hVar.setMinValue(0);
        hVar.setMaxValue(23);
        linearLayout.addView(hVar, mf.l(0.2f, 0, hs.t4));
        hVar.setFormatter(new u9.j(21));
        hVar.setOnValueChangedListener(g4Var);
        iVar.setMinValue(0);
        iVar.setMaxValue(11);
        iVar.setValue(0);
        iVar.setFormatter(new u9.j(22));
        linearLayout.addView(iVar, mf.l(0.3f, 0, hs.t4));
        iVar.setOnValueChangedListener(g4Var);
        if (j10 > 0) {
            w3Var = w3Var2;
            calendar.setTimeInMillis(System.currentTimeMillis());
            calendar.set(12, 0);
            calendar.set(13, 0);
            calendar.set(14, 0);
            calendar.set(11, 0);
            int timeInMillis = (int) ((j10 - calendar.getTimeInMillis()) / 86400000);
            calendar.setTimeInMillis(j10);
            iVar.setValue(calendar.get(12) / 5);
            hVar.setValue(calendar.get(11));
            cb0Var.setValue(timeInMillis);
            cb0Var.getValue();
            g4Var.l(cb0Var, cb0Var.getValue());
            hVar.getValue();
            g4Var.l(hVar, hVar.getValue());
        } else {
            w3Var = w3Var2;
        }
        jb0Var.setPadding(org.telegram.messenger.g0.L(34.0f), 0, org.telegram.messenger.g0.L(34.0f), 0);
        jb0Var.setGravity(17);
        jb0Var.setTextColor(q4Var.g);
        jb0Var.setTextSize(1, 14.0f);
        jb0Var.setTypeface(org.telegram.messenger.g0.o());
        jb0Var.setBackground(org.telegram.ui.ActionBar.y5.e(q4Var.h, 8.0f));
        jb0Var.setText(bd.M0(2131753543, "BoostingConfirm"));
        w3Var.addView(jb0Var, mf.t(-1, 48, 83, 16, 15, 16, 16));
        jb0Var.setOnClickListener(new org.telegram.ui.Components.m1(calendar, cb0Var, hVar, iVar, uVar, dVar));
        org.telegram.ui.ActionBar.t2 t2Var = (org.telegram.ui.ActionBar.t2) dVar.b;
        t2Var.O = w3Var;
        t2Var.show();
        int i21 = q4Var.b;
        t2Var.v0(i21);
        t2Var.O(i21);
        org.telegram.messenger.g0.q3(t2Var, i0.a.h(i21) > 0.699999988079071d);
    }

    /* JADX WARN: Removed duplicated region for block: B:540:0x0ab2  */
    /* JADX WARN: Removed duplicated region for block: B:542:0x0ac6  */
    @Override // org.telegram.ui.Components.fj0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f(int i3, View view) {
        int i10;
        ArrayList arrayList;
        TL_stories.TL_storyReactionPublicRepost tL_storyReactionPublicRepost;
        TL_stories.StoryItem storyItem;
        r31 G;
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
        int i14 = -1;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i12) {
            case 0:
                k5 k5Var = (k5) obj2;
                r9 r9Var = (r9) obj;
                org.telegram.ui.ActionBar.d2 d2Var = r9Var.f;
                g5 g5Var = k5Var.x;
                r4 r4Var = k5Var.r;
                if (i3 >= 0 && i3 < g5Var.c.size()) {
                    b5 b5Var = (b5) g5Var.c.get(i3);
                    TL_stories.StoryView storyView = b5Var.b;
                    TL_stories.StoryReaction storyReaction = b5Var.c;
                    if (storyView instanceof TL_stories.TL_storyView) {
                        r9Var.V(ProfileActivity.A4(storyView.user_id));
                        break;
                    } else if (storyView instanceof TL_stories.TL_storyViewPublicRepost) {
                        d2Var.createOverlayStoryViewer().T(k5Var.getContext(), ((TL_stories.TL_storyViewPublicRepost) b5Var.b).story, i7.a(r4Var));
                        break;
                    } else if (storyReaction instanceof TL_stories.TL_storyReaction) {
                        r9Var.V(ProfileActivity.A4(org.telegram.messenger.m5.o(storyReaction.peer_id)));
                        break;
                    } else if (storyReaction instanceof TL_stories.TL_storyReactionPublicRepost) {
                        ArrayList arrayList2 = new ArrayList();
                        j5 j5Var = k5Var.F;
                        if (j5Var == null || (arrayList = j5Var.i) == null) {
                            i10 = 0;
                        } else {
                            int size = arrayList.size();
                            for (int i15 = 0; i15 < k5Var.F.i.size(); i15++) {
                                TL_stories.StoryReaction storyReaction2 = (TL_stories.StoryReaction) k5Var.F.i.get(i15);
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
                            k5Var.H = null;
                            d2Var.createOverlayStoryViewer().T(k5Var.getContext(), ((TL_stories.TL_storyReactionPublicRepost) storyReaction).story, i7.a(r4Var));
                            break;
                        } else {
                            k5Var.H = new u6(k5Var.w, arrayList2);
                            k5Var.I = i10;
                            j5 j5Var2 = k5Var.F;
                            r9 createOverlayStoryViewer = d2Var.createOverlayStoryViewer();
                            Context context = k5Var.getContext();
                            u6 u6Var = k5Var.H;
                            i7 a10 = i7.a(r4Var);
                            a10.e = new a1.c(j5Var2, 26);
                            createOverlayStoryViewer.Q(context, i16, u6Var, a10);
                            break;
                        }
                    } else {
                        boolean z11 = storyReaction instanceof TL_stories.TL_storyReactionPublicForward;
                        if (z11 || (storyView instanceof TL_stories.TL_storyViewPublicForward)) {
                            TLRPC.Message message = z11 ? storyReaction.message : storyView.message;
                            Bundle bundle = new Bundle();
                            long o10 = org.telegram.messenger.m5.o(message.peer_id);
                            if (o10 >= 0) {
                                bundle.putLong("user_id", o10);
                            } else {
                                bundle.putLong("chat_id", -o10);
                            }
                            bundle.putInt("message_id", message.id);
                            r9Var.V(new wm(bundle));
                            break;
                        }
                    }
                }
                break;
            case 1:
                fi.p pVar = (fi.p) obj2;
                ai.v2 v2Var = (ai.v2) obj;
                f41 f41Var = pVar.S1;
                if (f41Var != null && (G = f41Var.G(i3 - 1)) != null) {
                    Object obj3 = G.G;
                    if (obj3 instanceof q00) {
                        v2Var.a(((q00) obj3).a);
                        pVar.dismiss();
                        break;
                    }
                }
                break;
            case 2:
                ii.q3.C0((ii.q3) obj2, (Context) obj, i3);
                break;
            case 3:
                org.telegram.ui.v5.A0((org.telegram.ui.v5) obj2, (Context) obj, view, i3);
                break;
            case 4:
                pc.b0((pc) obj2, (TLRPC.ChatFull) obj, view, i3);
                break;
            case 5:
                gc gcVar = (gc) obj;
                pc pcVar = ((cc) obj2).c;
                int i17 = gcVar.d;
                u51 u51Var = gcVar.b;
                xo xoVar = hp.s1(i17).q4;
                if (xoVar != null) {
                    ArrayList arrayList3 = xoVar.c;
                    if (i3 >= 0 && i3 < arrayList3.size()) {
                        i11 = ((wo) arrayList3.get(i3)).c;
                        pcVar.f = i11;
                        pcVar.e1(true);
                        pcVar.h1(true);
                        pcVar.i1();
                        if (view.getLeft() >= org.telegram.messenger.g0.L(24.0f) + u51Var.getPaddingLeft()) {
                            u51Var.w0(-((org.telegram.messenger.g0.L(48.0f) + u51Var.getPaddingLeft()) - view.getLeft()), 0, null);
                            break;
                        } else if (view.getWidth() + view.getLeft() > (u51Var.getMeasuredWidth() - u51Var.getPaddingRight()) - org.telegram.messenger.g0.L(24.0f)) {
                            u51Var.w0(org.telegram.messenger.k5.B(48.0f, u51Var.getMeasuredWidth() - u51Var.getPaddingRight(), view.getWidth() + view.getLeft()), 0, null);
                            break;
                        }
                    }
                }
                i11 = 0;
                pcVar.f = i11;
                pcVar.e1(true);
                pcVar.h1(true);
                pcVar.i1();
                if (view.getLeft() >= org.telegram.messenger.g0.L(24.0f) + u51Var.getPaddingLeft()) {
                }
                break;
            case 6:
                wm wmVar = (wm) obj2;
                wmVar.getClass();
                TLObject tLObject = (TLObject) ((df0) obj).c.get(i3);
                if (tLObject != null) {
                    wmVar.O7(true);
                    Bundle bundle2 = new Bundle();
                    if (tLObject instanceof TLRPC.User) {
                        bundle2.putLong("user_id", ((TLRPC.User) tLObject).id);
                    } else if (tLObject instanceof TLRPC.Chat) {
                        bundle2.putLong("chat_id", ((TLRPC.Chat) tLObject).id);
                    }
                    wmVar.presentFragment(new ProfileActivity(bundle2, null));
                    break;
                }
                break;
            case 7:
                ip.c0((ip) obj2, (Context) obj, view, i3);
                break;
            case 8:
                org.telegram.ui.Components.z zVar = (org.telegram.ui.Components.z) obj2;
                org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) obj;
                r31 G2 = zVar.g2.G(i3 - 1);
                if (G2 != null && G2.d == 1) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, zVar.getContext(), e6Var);
                    String M0 = bd.M0(2131754998, null);
                    org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.a;
                    s1Var.S = M0;
                    s1Var.U = bd.M0(2131754997, null);
                    alertDialog$Builder.h(bd.M0(2131752589, null), null);
                    alertDialog$Builder.k(bd.M0(2131751599, null), new org.telegram.ui.Components.t(zVar, 0));
                    alertDialog$Builder.d(-1);
                    alertDialog$Builder.p();
                    break;
                }
                break;
            case 9:
                bi biVar = (bi) obj2;
                org.telegram.ui.ActionBar.e6 e6Var2 = (org.telegram.ui.ActionBar.e6) obj;
                bh bhVar = biVar.t3;
                th[] thVarArr = biVar.r2;
                org.telegram.ui.ActionBar.d2 d2Var2 = biVar.X1;
                org.telegram.ui.ActionBar.d2 Q = d2Var2 == null ? LaunchActivity.Q() : d2Var2;
                if (Q != null && Q.getParentActivity() != null) {
                    if (view instanceof vh) {
                        Activity parentActivity = Q.getParentActivity();
                        int intValue = view.getTag() instanceof Integer ? ((Integer) view.getTag()).intValue() : -1;
                        if (intValue == 1) {
                            if (biVar.G3 || biVar.H3 || !biVar.N0()) {
                                if (!biVar.G3 && !biVar.H3) {
                                    bn bnVar = new bn(1, biVar.getContext(), e6Var2, biVar);
                                    biVar.L1 = bnVar;
                                    biVar.F1(bnVar);
                                }
                                biVar.F1(biVar.b2);
                            }
                        } else if (intValue == 17) {
                            if (biVar.o2 == null && (d2Var2 instanceof wm)) {
                                TLRPC.User j10 = ((wm) d2Var2).j();
                                if (bi.g1(j10)) {
                                    hk hkVar = new hk(biVar, biVar.getContext(), biVar.E3, j10, e6Var2);
                                    biVar.o2 = hkVar;
                                    thVarArr[11] = hkVar;
                                }
                            }
                            hk hkVar2 = biVar.o2;
                            if (hkVar2 != null) {
                                biVar.F1(hkVar2);
                            }
                        } else if (intValue == 3) {
                            if (biVar.I3 || !biVar.N0()) {
                                if (Build.VERSION.SDK_INT >= 33) {
                                    if (parentActivity.checkSelfPermission("android.permission.READ_MEDIA_AUDIO") != 0) {
                                        parentActivity.requestPermissions(new String[]{"android.permission.READ_MEDIA_AUDIO"}, 4);
                                        break;
                                    }
                                } else if (parentActivity.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") != 0) {
                                    org.telegram.messenger.g0.W(biVar.getContext()).requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 4);
                                    break;
                                }
                                biVar.p1(true);
                            }
                        } else if (intValue == 4) {
                            if (biVar.F3 || !biVar.N0()) {
                                if (Build.VERSION.SDK_INT >= 33) {
                                    if (parentActivity.checkSelfPermission("android.permission.READ_MEDIA_IMAGES") != 0 || parentActivity.checkSelfPermission("android.permission.READ_MEDIA_VIDEO") != 0) {
                                        parentActivity.requestPermissions(new String[]{"android.permission.READ_MEDIA_IMAGES", "android.permission.READ_MEDIA_VIDEO"}, 4);
                                        break;
                                    }
                                } else if (parentActivity.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") != 0) {
                                    org.telegram.messenger.g0.W(biVar.getContext()).requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 4);
                                    break;
                                }
                                biVar.r1(true);
                            }
                        } else if (intValue != 5) {
                            int i18 = 12;
                            if (intValue == 6) {
                                if ((biVar.L3 || !biVar.N0()) && org.telegram.messenger.g0.J1(d2Var2)) {
                                    if (biVar.L3) {
                                        if (biVar.g2 == null) {
                                            uk ukVar = new uk(biVar, biVar.getContext(), e6Var2, (biVar.z1 || biVar.M3) ? false : true);
                                            biVar.g2 = ukVar;
                                            thVarArr[5] = ukVar;
                                            tk tkVar = biVar.r4;
                                            if (tkVar != null) {
                                                ukVar.setDelegate(tkVar);
                                            } else {
                                                ukVar.setDelegate(new kg(biVar, i18));
                                            }
                                        }
                                        biVar.F1(biVar.g2);
                                    } else {
                                        bn bnVar2 = new bn(6, biVar.getContext(), e6Var2, biVar);
                                        biVar.L1 = bnVar2;
                                        biVar.F1(bnVar2);
                                    }
                                }
                            } else if (intValue == 9) {
                                if (biVar.J3 || !biVar.N0()) {
                                    if (biVar.J3) {
                                        biVar.H1(true, null);
                                    } else {
                                        bn bnVar3 = new bn(9, biVar.getContext(), e6Var2, biVar);
                                        biVar.L1 = bnVar3;
                                        biVar.F1(bnVar3);
                                    }
                                }
                            } else if (intValue == 11) {
                                if (biVar.k2 == null) {
                                    lg.h0 h0Var = new lg.h0(biVar.getContext(), biVar.J0, biVar);
                                    biVar.k2 = h0Var;
                                    thVarArr[7] = h0Var;
                                    h0Var.setupBlurredSearchField(biVar.C4);
                                }
                                biVar.F1(biVar.k2);
                            } else if (intValue == 12) {
                                if (biVar.K3 || !biVar.N0()) {
                                    if (biVar.K3) {
                                        if (biVar.f2 == null) {
                                            an anVar = new an(biVar, biVar.getContext(), true, e6Var2, null);
                                            biVar = biVar;
                                            biVar.f2 = anVar;
                                            thVarArr[1] = anVar;
                                            anVar.setDelegate(new kg(biVar, i13));
                                        }
                                        biVar.F1(biVar.f2);
                                    } else {
                                        bn bnVar4 = new bn(9, biVar.getContext(), e6Var2, biVar);
                                        biVar.L1 = bnVar4;
                                        biVar.F1(bnVar4);
                                    }
                                }
                            } else if (intValue == 13) {
                                if (biVar.m2 == null) {
                                    vj vjVar = new vj(biVar, biVar.getContext(), e6Var2, true);
                                    biVar.m2 = vjVar;
                                    thVarArr[8] = vjVar;
                                    vjVar.setDelegate(biVar.V3);
                                }
                                biVar.F1(biVar.m2);
                            } else if (intValue == 14) {
                                if (biVar.l2 == null) {
                                    vj vjVar2 = new vj(biVar, biVar.getContext(), e6Var2, false);
                                    biVar.l2 = vjVar2;
                                    thVarArr[9] = vjVar2;
                                    vjVar2.setDelegate(biVar.V3);
                                }
                                biVar.F1(biVar.l2);
                            } else if (intValue == 16) {
                                if (biVar.n2 == null) {
                                    mi.p pVar2 = new mi.p(biVar.E3, biVar.getContext(), e6Var2, biVar);
                                    biVar.n2 = pVar2;
                                    thVarArr[10] = pVar2;
                                }
                                biVar.F1(biVar.n2);
                            } else if (view.getTag() instanceof Integer) {
                                biVar.U3.o1(((Integer) view.getTag()).intValue(), true, true, 0, 0, 0L, biVar.f1(), false, 0L);
                            }
                        } else if (biVar.L3 || !biVar.N0()) {
                            if (biVar.L3 && biVar.getContext().checkSelfPermission("android.permission.READ_CONTACTS") != 0) {
                                org.telegram.messenger.g0.W(biVar.getContext()).requestPermissions(new String[]{"android.permission.READ_CONTACTS"}, 5);
                                break;
                            } else {
                                biVar.q1();
                            }
                        }
                    } else if (view instanceof uh) {
                        uh uhVar = (uh) view;
                        TLRPC.TL_attachMenuBot tL_attachMenuBot = uhVar.c;
                        if (tL_attachMenuBot == null) {
                            biVar.U3.a1(uhVar.b);
                            biVar.dismiss();
                        } else if (tL_attachMenuBot.inactive) {
                            rc1.a(biVar.getContext(), new mi.f(27, biVar, uhVar), null);
                        } else {
                            biVar.C1(tL_attachMenuBot.bot_id, null, false, true);
                        }
                    }
                    int left = view.getLeft();
                    int right = view.getRight();
                    int L = org.telegram.messenger.g0.L(70.0f);
                    int i19 = left - L;
                    if (i19 < 0) {
                        bhVar.w0(i19, 0, null);
                        break;
                    } else {
                        int i20 = right + L;
                        if (i20 > bhVar.getMeasuredWidth()) {
                            bhVar.w0(i20 - bhVar.getMeasuredWidth(), 0, null);
                            break;
                        }
                    }
                }
                break;
            case 10:
                ej ejVar = (ej) obj2;
                org.telegram.ui.ActionBar.e6 e6Var3 = (org.telegram.ui.ActionBar.e6) obj;
                yi yiVar = ejVar.F;
                u4.h0 adapter = ejVar.s.getAdapter();
                aj ajVar = ejVar.G;
                if (adapter == ajVar) {
                    O = ajVar.E(i3);
                } else {
                    int S = yiVar.S(i3);
                    int Q2 = yiVar.Q(i3);
                    if (Q2 >= 0 && S >= 0) {
                        O = yiVar.O(S, Q2);
                    }
                }
                if (O != null) {
                    if (ejVar.x.isEmpty()) {
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
                        vc0 vc0Var = new vc0(ejVar.b.X1, d5Var, null, null, null, null, str, str2, e6Var3);
                        vc0Var.C1 = new ri(ejVar);
                        vc0Var.show();
                        break;
                    } else {
                        ejVar.P((dj) view, O);
                        break;
                    }
                }
                break;
            case 11:
                o60 o60Var = (o60) obj2;
                TLRPC.Chat chat = (TLRPC.Chat) obj;
                k60 k60Var = o60Var.n1;
                ArrayList arrayList4 = o60Var.q1;
                if (!o60Var.y1 && arrayList4.get(i3) != o60Var.u1) {
                    o60Var.u1 = (TLRPC.Peer) arrayList4.get(i3);
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
                    int childCount = k60Var.getChildCount();
                    for (int i21 = 0; i21 < childCount; i21++) {
                        View childAt = k60Var.getChildAt(i21);
                        if (childAt != view) {
                            if (z12) {
                                ((org.telegram.ui.Cells.h4) childAt).c(false, z10);
                            } else if (view instanceof org.telegram.ui.Cells.c7) {
                                ((org.telegram.ui.Cells.c7) childAt).b(false, z10);
                            }
                        }
                    }
                    if (o60Var.t1 != 0) {
                        o60Var.M0(chat, z10);
                        break;
                    }
                }
                break;
            case 12:
                c90 c90Var = (c90) obj2;
                z80 z80Var = (z80) obj;
                if (i3 != 0) {
                    kg.e1 adapter2 = c90Var.getAdapter();
                    if (adapter2.x0 == null || adapter2.i0) {
                        int i22 = i3 - 1;
                        Object J = c90Var.getAdapter().J(i22);
                        int i23 = c90Var.getAdapter().Y;
                        int i24 = c90Var.getAdapter().Z;
                        if (c90Var.getAdapter().G == null || i22 != 1) {
                            if (c90Var.getAdapter().G == null || i22 != 0) {
                                if (J instanceof TLRPC.TL_document) {
                                    if (view instanceof org.telegram.ui.Cells.w7) {
                                        ((org.telegram.ui.Cells.w7) view).getSendAnimationData();
                                    }
                                    TLRPC.TL_document tL_document = (TLRPC.TL_document) J;
                                    z80Var.q(tL_document, zi.U(tL_document), c90Var.getAdapter().L(i22));
                                } else if (J instanceof TLRPC.Chat) {
                                    String K = org.telegram.messenger.t3.K((TLRPC.Chat) J, false);
                                    if (K != null) {
                                        z80Var.t(i23, i24, a1.g.q("@", K, " "), false);
                                    }
                                } else if (J instanceof TLRPC.User) {
                                    TLRPC.User user3 = (TLRPC.User) J;
                                    if (l10.n(user3) != null) {
                                        z80Var.t(i23, i24, "@" + l10.n(user3) + " ", false);
                                    } else {
                                        SpannableString spannableString = new SpannableString(t4.c.q(l10.j(user3, false), " "));
                                        spannableString.setSpan(new y31("" + user3.id, 3, null), 0, spannableString.length(), 33);
                                        z80Var.t(i23, i24, spannableString, false);
                                    }
                                } else if (J instanceof String) {
                                    z80Var.t(i23, i24, J + " ", false);
                                } else if (J instanceof hi) {
                                    String str7 = ((hi) J).a;
                                    z80Var.w(str7);
                                    if (str7 != null) {
                                        try {
                                        } catch (Exception unused) {
                                            z80Var.t(i23, i24, str7, true);
                                        }
                                        if (str7.startsWith("animated_")) {
                                            try {
                                                fontMetricsInt = z80Var.n();
                                            } catch (Exception e10) {
                                                org.telegram.messenger.a8.g(e10, false);
                                                fontMetricsInt = null;
                                            }
                                            long parseLong = Long.parseLong(str7.substring(9));
                                            TLRPC.Document e11 = org.telegram.ui.Components.g5.e(h10.t0, parseLong);
                                            SpannableString spannableString2 = new SpannableString(zi.U(e11));
                                            spannableString2.setSpan(e11 != null ? new org.telegram.ui.Components.p5(e11, fontMetricsInt) : new org.telegram.ui.Components.p5(parseLong, fontMetricsInt), 0, spannableString2.length(), 33);
                                            z80Var.t(i23, i24, spannableString2, false);
                                            c90Var.o(false);
                                        }
                                    }
                                    z80Var.t(i23, i24, str7, true);
                                    c90Var.o(false);
                                }
                                if (J instanceof TLRPC.BotInlineResult) {
                                    TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) J;
                                    if ((!botInlineResult.type.equals("photo") || (botInlineResult.photo == null && botInlineResult.content == null)) && ((!botInlineResult.type.equals("gif") || (botInlineResult.document == null && botInlineResult.content == null)) && (!botInlineResult.type.equals(MediaStreamTrack.VIDEO_TRACK_KIND) || botInlineResult.document == null))) {
                                        z80Var.e(botInlineResult, true, 0);
                                        break;
                                    } else {
                                        ArrayList arrayList5 = new ArrayList(c90Var.getAdapter().S);
                                        c90Var.Q = arrayList5;
                                        PhotoViewer.v1().N2(null, c90Var.h, c90Var.a);
                                        PhotoViewer.v1().j2(arrayList5, c90Var.getAdapter().M(i22), 3, false, c90Var.R, null);
                                        break;
                                    }
                                }
                            } else {
                                z80Var.t(i23, i24, a1.g.s(new StringBuilder(), c90Var.getAdapter().G, " "), false);
                                break;
                            }
                        } else {
                            TLRPC.Chat chat2 = c90Var.getAdapter().m0;
                            if (chat2 == null && c90Var.getAdapter().H0 != null) {
                                chat2 = c90Var.getAdapter().H0.e;
                            }
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(c90Var.getAdapter().G);
                            z80Var.t(i23, i24, a1.g.s(sb2, chat2 != null ? "@" + org.telegram.messenger.t3.K(chat2, false) : "", " "), false);
                            break;
                        }
                    }
                } else {
                    c90Var.getClass();
                    break;
                }
                break;
            case 13:
                se0 se0Var = (se0) obj2;
                HashSet hashSet = se0Var.s1;
                oe0 oe0Var = se0Var.k1;
                if (org.telegram.messenger.g0.E1((Context) obj)) {
                    ArrayList arrayList6 = se0Var.x1;
                    if (arrayList6 == null || arrayList6.isEmpty()) {
                        if (view instanceof org.telegram.ui.Cells.l8) {
                            int S2 = oe0Var.S(i3) - 1;
                            int Q3 = oe0Var.Q(i3) - 1;
                            if (Q3 > 0 && S2 >= 0) {
                                re0 re0Var = (re0) se0Var.u1.get(S2);
                                if (Q3 == re0Var.b() && !hashSet.contains(re0Var)) {
                                    if (!re0Var.e || re0Var.f >= re0Var.b.size()) {
                                        hashSet.add(re0Var);
                                        TLRPC.TL_messages_getPollVotes tL_messages_getPollVotes = new TLRPC.TL_messages_getPollVotes();
                                        tL_messages_getPollVotes.peer = se0Var.r1;
                                        tL_messages_getPollVotes.id = se0Var.p1.f1();
                                        tL_messages_getPollVotes.limit = 50;
                                        int i25 = tL_messages_getPollVotes.flags;
                                        tL_messages_getPollVotes.option = re0Var.d;
                                        tL_messages_getPollVotes.flags = i25 | 3;
                                        tL_messages_getPollVotes.offset = re0Var.c;
                                        ConnectionsManager.getInstance(se0Var.a).sendRequest(tL_messages_getPollVotes, new org.telegram.ui.ActionBar.h6(21, se0Var, re0Var));
                                        break;
                                    } else {
                                        int min = Math.min(re0Var.f + 50, re0Var.b.size());
                                        re0Var.f = min;
                                        if (min == re0Var.b.size()) {
                                            re0Var.e = false;
                                        }
                                        se0Var.J0(null);
                                        oe0Var.X(true);
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
                                se0Var.dismiss();
                                org.telegram.ui.ActionBar.d2 T = LaunchActivity.T();
                                if (T != null) {
                                    ProfileActivity profileActivity = new ProfileActivity(bundle3, null);
                                    if (T instanceof wm) {
                                        if (pollVotesAlert$UserCell.h != null) {
                                            TLRPC.User j11 = ((wm) T).j();
                                            se0Var.j1.getChildAt(0);
                                            profileActivity.g5((j11 == null || j11.id != pollVotesAlert$UserCell.h.id) ? 0 : 1);
                                        } else {
                                            TLRPC.Chat chat3 = ((wm) T).e;
                                            profileActivity.g5((chat3 == null || chat3.id != pollVotesAlert$UserCell.n.id) ? 0 : 1);
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
                n01 n01Var = (n01) obj2;
                EditText editText = n01Var.w;
                long a11 = ((l01) n01Var.s.c.get(i3)).a();
                wm wmVar2 = ((zj) obj).a;
                if (wmVar2.X9()) {
                    wm.L2(a11, wmVar2);
                } else {
                    g11 g11Var = wmVar2.g2;
                    if (g11Var != null) {
                        g11Var.n(a11, false);
                    }
                }
                if (editText.length() > 0) {
                    editText.setText("");
                }
                editText.clearFocus();
                n01Var.c();
                break;
            case 15:
                q21 q21Var = (q21) obj2;
                org.telegram.ui.ActionBar.e6 e6Var4 = (org.telegram.ui.ActionBar.e6) obj;
                r31 G3 = q21Var.c2.G(i3 - 1);
                if (G3 != null) {
                    int i26 = G3.d;
                    if (i26 == 1) {
                        CharSequence charSequence = q21Var.V1;
                        if (charSequence != null && !q21Var.U1) {
                            org.telegram.messenger.g0.g(charSequence);
                            break;
                        }
                    } else if (i26 == 2) {
                        if (h10.i(q21Var.a).q()) {
                            hp.s1(q21Var.a).s7.K(0L, !r0.B(0L));
                            q21Var.dismiss();
                            break;
                        } else if (LaunchActivity.T() != null) {
                            new vg.v0(13, q21Var.getContext(), e6Var4).show();
                            break;
                        }
                    }
                }
                break;
            case 16:
                a(i3, view);
                break;
            case 17:
                cx.Z((cx) obj2, (Context) obj, i3);
                break;
            case 18:
                r40.Z((r40) obj2, (Context) obj, view, i3);
                break;
            case 19:
                xe0 xe0Var = (xe0) obj2;
                Context context2 = (Context) obj;
                HashMap hashMap = xe0Var.l0;
                if (i3 == xe0Var.R) {
                    TLRPC.User user5 = (TLRPC.User) hashMap.get(Long.valueOf(xe0Var.e.admin_id));
                    if (user5 != null) {
                        Bundle bundle4 = new Bundle();
                        bundle4.putLong("user_id", user5.id);
                        hp.s1(h10.t0).X3(user5, false, false);
                        xe0Var.presentFragment(new ProfileActivity(bundle4, null));
                        break;
                    }
                } else if (i3 == xe0Var.y) {
                    e90 e90Var = new e90(0, xe0Var.n);
                    e90Var.T = xe0Var.t0;
                    xe0Var.presentFragment(e90Var);
                    break;
                } else {
                    int i27 = xe0Var.E;
                    if (i3 >= i27 && i3 < xe0Var.F) {
                        i50 i50Var = new i50(context2, (TLRPC.TL_chatInviteExported) xe0Var.j0.get(i3 - i27), xe0Var.d, hashMap, xe0Var, xe0Var.n, false, xe0Var.h);
                        xe0Var.m0 = i50Var;
                        i50Var.c2 = xe0Var.q0;
                        i50Var.show();
                        break;
                    } else {
                        int i28 = xe0Var.I;
                        if (i3 >= i28 && i3 < xe0Var.J) {
                            i50 i50Var2 = new i50(context2, (TLRPC.TL_chatInviteExported) xe0Var.k0.get(i3 - i28), xe0Var.d, hashMap, xe0Var, xe0Var.n, false, xe0Var.h);
                            xe0Var.m0 = i50Var2;
                            i50Var2.show();
                            break;
                        } else if (i3 != xe0Var.O) {
                            int i29 = xe0Var.V;
                            if (i3 >= i29 && i3 < xe0Var.W) {
                                TLRPC.TL_chatAdminWithInvites tL_chatAdminWithInvites = (TLRPC.TL_chatAdminWithInvites) xe0Var.n0.get(i3 - i29);
                                if (hashMap.containsKey(Long.valueOf(tL_chatAdminWithInvites.admin_id))) {
                                    xe0Var.getMessagesController().X3((TLRPC.User) hashMap.get(Long.valueOf(tL_chatAdminWithInvites.admin_id)), false, false);
                                }
                                xe0 xe0Var2 = new xe0(xe0Var.n, tL_chatAdminWithInvites.invites_count, tL_chatAdminWithInvites.admin_id);
                                xe0Var2.m0(xe0Var.d, null);
                                xe0Var.presentFragment(xe0Var2);
                                break;
                            }
                        } else if (!xe0Var.d0) {
                            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(xe0Var.getParentActivity());
                            String M02 = bd.M0(2131751576, null);
                            org.telegram.ui.ActionBar.s1 s1Var2 = alertDialog$Builder2.a;
                            s1Var2.S = M02;
                            s1Var2.U = bd.M0(2131751577, null);
                            alertDialog$Builder2.k(bd.M0(2131751599, null), new ke0(xe0Var));
                            alertDialog$Builder2.h(bd.M0(2131752589, null), null);
                            xe0Var.showDialog(s1Var2);
                            break;
                        }
                    }
                }
                break;
            case 20:
                b(i3, view);
                break;
            case 21:
                c(i3, view);
                break;
            case 22:
                d(i3, view);
                break;
            case 23:
                e(i3, view);
                break;
            default:
                xg.q0 q0Var = (xg.q0) obj2;
                TLRPC.Chat chat4 = (TLRPC.Chat) obj;
                ArrayList arrayList7 = q0Var.Q1;
                if (view instanceof bh.p) {
                    bh.p pVar3 = (bh.p) view;
                    if (pVar3.getBoost().cooldown_until_date > 0) {
                        new fc(q0Var.c, q0Var.J0).G(R.raw.chats_infotip, 5, org.telegram.messenger.g0.X2(bd.G((int) hp.s1(h10.t0).s0, "BoostingWaitWarningPlural", new Object[0]))).k(true);
                        break;
                    } else {
                        if (arrayList7.contains(pVar3.getBoost())) {
                            arrayList7.remove(pVar3.getBoost());
                        } else {
                            arrayList7.add(pVar3.getBoost());
                        }
                        pVar3.c(arrayList7.contains(pVar3.getBoost()), true);
                        q0Var.d1(true);
                        q0Var.U1.a(arrayList7, chat4);
                        break;
                    }
                }
                break;
        }
    }
}
