package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class n90 extends org.telegram.ui.ActionBar.k2 implements st0, fg.b, org.telegram.messenger.us {
    public boolean D;
    public boolean E;
    public int F;
    public org.telegram.ui.ActionBar.b1 G;
    public org.telegram.ui.ActionBar.b1 H;
    public org.telegram.ui.ActionBar.b1 I;
    public org.telegram.ui.rf0 J;
    public final gh.b[] K;
    public int L;
    public FrameLayout M;
    public vh.d N;
    public fe.b O;
    public View P;
    public ag.j0 Q;
    public m90 R;
    public int S;
    public String T;
    public int U;
    public int a;
    public rt0 b;
    public TLRPC.ChatFull c;
    public TLRPC.UserFull d;
    public long e;
    public long f;
    public String h;
    public String n;
    public int r;
    public org.telegram.ui.ActionBar.p5 s;
    public SparseArray w;
    public org.telegram.ui.ActionBar.b1 x;
    public org.telegram.ui.ActionBar.b1 y;

    public n90(Bundle bundle, rt0 rt0Var) {
        super(bundle);
        this.D = true;
        this.E = true;
        this.F = -12;
        this.K = new gh.b[2];
        this.L = -1;
        this.b = rt0Var;
    }

    @Override // fg.b
    public final List F() {
        Activity parentActivity = getParentActivity();
        org.telegram.messenger.s5 s5Var = ig.k1.m;
        return Arrays.asList(new fg.a((parentActivity.getSharedPreferences("shapedetector_conf", 0).getBoolean("learning", false) ? "Disable" : "Enable").concat(" shape detector learning debug"), new j90(this, 1)));
    }

    @Override // org.telegram.ui.Components.st0
    public final void Q() {
        rt0 rt0Var;
        m90 m90Var = this.R;
        if (m90Var != null && (rt0Var = this.b) != null) {
            m90Var.setNewMediaCounts(rt0Var.c);
        }
        f0();
    }

    public final void a0() {
        if (this.R == null) {
            return;
        }
        int i10 = 0;
        int L = this.J != null ? org.telegram.messenger.i0.L(72.0f) : 0;
        m90 m90Var = this.R;
        int currentActionBarHeight = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + this.mSystemInsets.b;
        int[] iArr = zt0.s2;
        m90Var.i1(ei.b.d(currentActionBarHeight - org.telegram.ui.ActionBar.l.getCurrentActionBarHeight()) - org.telegram.messenger.i0.L(6.666f), ei.b.c(this.mSystemInsets.b), ei.b.c(this.mSystemInsets.d + L), this.mSystemInsets.d + L);
        if (this.P != null) {
            int topPanelShift = this.R.getTopPanelShift() + org.telegram.messenger.i0.L(44.0f) + org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + this.mSystemInsets.b;
            if (this.P.getLayoutParams().height != topPanelShift) {
                this.P.getLayoutParams().height = topPanelShift;
                this.P.requestLayout();
            }
        }
        View view = this.navigationBarFadeView;
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            int i11 = this.mSystemInsets.d;
            layoutParams.height = i11 + L;
            View view2 = this.navigationBarFadeView;
            if (i11 < org.telegram.messenger.i0.L(40.0f) && L <= 0) {
                i10 = 8;
            }
            view2.setVisibility(i10);
            this.navigationBarFadeView.requestLayout();
        }
        b0();
    }

    public final void b0() {
        if (this.J == null) {
            return;
        }
        float f7 = this.O.e;
        float L = org.telegram.messenger.i0.L(72.0f) + this.mSystemInsets.d;
        this.J.setTranslationY((L * f7) + (-r2));
        float f10 = 1.0f - f7;
        this.J.setAlpha(f10);
        this.J.setVisibility(f7 < 1.0f ? 0 : 4);
        this.M.setTranslationY((L * f10) + (-this.mSystemInsets.d));
        this.M.setAlpha(f7);
        this.M.setVisibility(f7 > 0.0f ? 0 : 4);
    }

    public final boolean c0() {
        int i10 = this.a;
        return i10 == 1 || i10 == 2;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean canBeginSlide() {
        if (this.R.G0()) {
            return super.canBeginSlide();
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final View createView(Context context) {
        ei.b bVar;
        int i10;
        setHasOwnBackground(true);
        final int i11 = 0;
        this.simpleActionBar.setBackButtonDrawable(new org.telegram.ui.ActionBar.c2(false));
        this.simpleActionBar.setActionBarMenuOnItemClick(new org.telegram.ui.ar(this, 5));
        jg.l0 l0Var = new jg.l0(this, context, 20);
        this.fragmentView = l0Var;
        if (this.a == 0 && this.e == getUserConfig().e() && this.f == 0 && !getMessagesController().F1().b && getMessagesController().F1().e()) {
            this.S = 11;
        }
        ei.b baseSimpleGlass = getBaseSimpleGlass();
        m90 m90Var = new m90(this, context, this.e, this.b, this.c, this.d, this.S, this, new l90(this), getResourceProvider(), baseSimpleGlass.c);
        this.R = m90Var;
        m90Var.setOnTopPanelShiftChanged(new j90(this, i11));
        this.R.K0.setOpen(true);
        this.R.setPinnedToTop(true);
        l0Var.addView(this.R, w7.b6.c(-1.0f, -1));
        final int i12 = 3;
        int i13 = 9;
        if (c0()) {
            org.telegram.ui.ActionBar.p5 b10 = this.simpleActionBar.o().b(0, R.drawable.ic_ab_other);
            this.s = b10;
            b10.setContentDescription(org.telegram.messenger.cd.L0(2131754839, null));
            this.s.Y(false, false);
            org.telegram.ui.ActionBar.b1 e = this.s.e(8, R.drawable.msg_zoomin, org.telegram.messenger.cd.L0(2131748665, null));
            this.H = e;
            e.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.k90
                public final /* synthetic */ n90 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    th.x4 x4Var;
                    th.x4 x4Var2;
                    th.x4 x4Var3;
                    th.x4 x4Var4;
                    int i14;
                    int i15 = i11;
                    org.telegram.messenger.t2 t2Var = org.telegram.messenger.t2.D;
                    n90 n90Var = this.b;
                    switch (i15) {
                        case 0:
                            Boolean L1 = n90Var.R.L1(null, null);
                            if (L1 != null) {
                                n90Var.h0(true, L1.booleanValue());
                                break;
                            }
                            break;
                        case 1:
                            Boolean M1 = n90Var.R.M1(null, null);
                            if (M1 != null) {
                                n90Var.h0(M1.booleanValue(), true);
                                break;
                            }
                            break;
                        case 2:
                            boolean z10 = n90Var.D;
                            if (z10 && !n90Var.E) {
                                t2Var.a();
                                org.telegram.ui.ActionBar.b1 b1Var = n90Var.x;
                                int i16 = -n90Var.F;
                                n90Var.F = i16;
                                org.telegram.messenger.i0.F3(i16, b1Var, null);
                                break;
                            } else {
                                org.telegram.ui.ActionBar.b1 b1Var2 = n90Var.x;
                                boolean z11 = !z10;
                                n90Var.D = z11;
                                b1Var2.setChecked(z11);
                                m90 m90Var2 = n90Var.R;
                                boolean z12 = n90Var.D;
                                boolean z13 = n90Var.E;
                                hs0 hs0Var = m90Var2.e0;
                                if (hs0Var != null && (x4Var2 = hs0Var.s) != null) {
                                    x4Var2.n = z12;
                                    x4Var2.o = z13;
                                    x4Var2.d(true);
                                }
                                tq0 tq0Var = m90Var2.g0;
                                if (tq0Var != null && (x4Var = tq0Var.s) != null) {
                                    x4Var.n = z12;
                                    x4Var.o = z13;
                                    x4Var.d(true);
                                    break;
                                }
                            }
                            break;
                        case 3:
                            boolean z14 = n90Var.E;
                            if (z14 && !n90Var.D) {
                                t2Var.a();
                                org.telegram.ui.ActionBar.b1 b1Var3 = n90Var.y;
                                int i17 = -n90Var.F;
                                n90Var.F = i17;
                                org.telegram.messenger.i0.F3(i17, b1Var3, null);
                                break;
                            } else {
                                org.telegram.ui.ActionBar.b1 b1Var4 = n90Var.y;
                                boolean z15 = !z14;
                                n90Var.E = z15;
                                b1Var4.setChecked(z15);
                                m90 m90Var3 = n90Var.R;
                                boolean z16 = n90Var.D;
                                boolean z17 = n90Var.E;
                                hs0 hs0Var2 = m90Var3.e0;
                                if (hs0Var2 != null && (x4Var4 = hs0Var2.s) != null) {
                                    x4Var4.n = z16;
                                    x4Var4.o = z17;
                                    x4Var4.d(true);
                                }
                                tq0 tq0Var2 = m90Var3.g0;
                                if (tq0Var2 != null && (x4Var3 = tq0Var2.s) != null) {
                                    x4Var3.n = z16;
                                    x4Var3.o = z17;
                                    x4Var3.d(true);
                                    break;
                                }
                            }
                            break;
                        default:
                            n90 n90Var2 = this.b;
                            ag.j0 j0Var = n90Var2.Q;
                            if (j0Var != null) {
                                j0Var.run();
                                n90Var2.Q = null;
                            }
                            wb.e();
                            boolean z18 = n90Var2.R.getClosestTab() == 9;
                            ArrayList arrayList = new ArrayList();
                            if (n90Var2.w != null) {
                                int i18 = 0;
                                for (int i19 = 0; i19 < n90Var2.w.size(); i19++) {
                                    TL_stories.StoryItem storyItem = ((org.telegram.messenger.jj) n90Var2.w.valueAt(i19)).l;
                                    if (storyItem != null) {
                                        arrayList.add(storyItem);
                                        i18++;
                                    }
                                }
                                i14 = i18;
                            } else {
                                i14 = 0;
                            }
                            n90Var2.R.T(false);
                            if (z18) {
                                n90Var2.R.f1(8);
                            }
                            if (!arrayList.isEmpty()) {
                                boolean[] zArr = new boolean[arrayList.size()];
                                for (int i20 = 0; i20 < arrayList.size(); i20++) {
                                    TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) arrayList.get(i20);
                                    zArr[i20] = storyItem2.pinned;
                                    storyItem2.pinned = z18;
                                }
                                n90Var2.getMessagesController().O1().q0(n90Var2.e, arrayList, false);
                                boolean[] zArr2 = {false};
                                n90Var2.Q = new ag.j0(n90Var2, arrayList, z18, 18);
                                org.telegram.ui.fp fpVar = new org.telegram.ui.fp(n90Var2, zArr2, arrayList, zArr, 16);
                                (z18 ? cc.a0(n90Var2).L(R.raw.contact_check, org.telegram.messenger.cd.G(i14, "StorySavedTitle", new Object[0]), org.telegram.messenger.cd.L0(2131744510, null), org.telegram.messenger.cd.L0(2131743912, null), fpVar).j() : cc.a0(n90Var2).J(R.raw.chats_archived, org.telegram.messenger.cd.G(i14, "StoryArchived", new Object[0]), org.telegram.messenger.cd.L0(2131743912, null), 5000, false, fpVar).j()).v = new at(23, n90Var2, zArr2);
                                break;
                            }
                            break;
                    }
                }
            });
            org.telegram.ui.ActionBar.b1 e7 = this.s.e(9, R.drawable.msg_zoomout, org.telegram.messenger.cd.L0(2131748664, null));
            this.I = e7;
            e7.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.k90
                public final /* synthetic */ n90 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    th.x4 x4Var;
                    th.x4 x4Var2;
                    th.x4 x4Var3;
                    th.x4 x4Var4;
                    int i14;
                    int i15 = r2;
                    org.telegram.messenger.t2 t2Var = org.telegram.messenger.t2.D;
                    n90 n90Var = this.b;
                    switch (i15) {
                        case 0:
                            Boolean L1 = n90Var.R.L1(null, null);
                            if (L1 != null) {
                                n90Var.h0(true, L1.booleanValue());
                                break;
                            }
                            break;
                        case 1:
                            Boolean M1 = n90Var.R.M1(null, null);
                            if (M1 != null) {
                                n90Var.h0(M1.booleanValue(), true);
                                break;
                            }
                            break;
                        case 2:
                            boolean z10 = n90Var.D;
                            if (z10 && !n90Var.E) {
                                t2Var.a();
                                org.telegram.ui.ActionBar.b1 b1Var = n90Var.x;
                                int i16 = -n90Var.F;
                                n90Var.F = i16;
                                org.telegram.messenger.i0.F3(i16, b1Var, null);
                                break;
                            } else {
                                org.telegram.ui.ActionBar.b1 b1Var2 = n90Var.x;
                                boolean z11 = !z10;
                                n90Var.D = z11;
                                b1Var2.setChecked(z11);
                                m90 m90Var2 = n90Var.R;
                                boolean z12 = n90Var.D;
                                boolean z13 = n90Var.E;
                                hs0 hs0Var = m90Var2.e0;
                                if (hs0Var != null && (x4Var2 = hs0Var.s) != null) {
                                    x4Var2.n = z12;
                                    x4Var2.o = z13;
                                    x4Var2.d(true);
                                }
                                tq0 tq0Var = m90Var2.g0;
                                if (tq0Var != null && (x4Var = tq0Var.s) != null) {
                                    x4Var.n = z12;
                                    x4Var.o = z13;
                                    x4Var.d(true);
                                    break;
                                }
                            }
                            break;
                        case 3:
                            boolean z14 = n90Var.E;
                            if (z14 && !n90Var.D) {
                                t2Var.a();
                                org.telegram.ui.ActionBar.b1 b1Var3 = n90Var.y;
                                int i17 = -n90Var.F;
                                n90Var.F = i17;
                                org.telegram.messenger.i0.F3(i17, b1Var3, null);
                                break;
                            } else {
                                org.telegram.ui.ActionBar.b1 b1Var4 = n90Var.y;
                                boolean z15 = !z14;
                                n90Var.E = z15;
                                b1Var4.setChecked(z15);
                                m90 m90Var3 = n90Var.R;
                                boolean z16 = n90Var.D;
                                boolean z17 = n90Var.E;
                                hs0 hs0Var2 = m90Var3.e0;
                                if (hs0Var2 != null && (x4Var4 = hs0Var2.s) != null) {
                                    x4Var4.n = z16;
                                    x4Var4.o = z17;
                                    x4Var4.d(true);
                                }
                                tq0 tq0Var2 = m90Var3.g0;
                                if (tq0Var2 != null && (x4Var3 = tq0Var2.s) != null) {
                                    x4Var3.n = z16;
                                    x4Var3.o = z17;
                                    x4Var3.d(true);
                                    break;
                                }
                            }
                            break;
                        default:
                            n90 n90Var2 = this.b;
                            ag.j0 j0Var = n90Var2.Q;
                            if (j0Var != null) {
                                j0Var.run();
                                n90Var2.Q = null;
                            }
                            wb.e();
                            boolean z18 = n90Var2.R.getClosestTab() == 9;
                            ArrayList arrayList = new ArrayList();
                            if (n90Var2.w != null) {
                                int i18 = 0;
                                for (int i19 = 0; i19 < n90Var2.w.size(); i19++) {
                                    TL_stories.StoryItem storyItem = ((org.telegram.messenger.jj) n90Var2.w.valueAt(i19)).l;
                                    if (storyItem != null) {
                                        arrayList.add(storyItem);
                                        i18++;
                                    }
                                }
                                i14 = i18;
                            } else {
                                i14 = 0;
                            }
                            n90Var2.R.T(false);
                            if (z18) {
                                n90Var2.R.f1(8);
                            }
                            if (!arrayList.isEmpty()) {
                                boolean[] zArr = new boolean[arrayList.size()];
                                for (int i20 = 0; i20 < arrayList.size(); i20++) {
                                    TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) arrayList.get(i20);
                                    zArr[i20] = storyItem2.pinned;
                                    storyItem2.pinned = z18;
                                }
                                n90Var2.getMessagesController().O1().q0(n90Var2.e, arrayList, false);
                                boolean[] zArr2 = {false};
                                n90Var2.Q = new ag.j0(n90Var2, arrayList, z18, 18);
                                org.telegram.ui.fp fpVar = new org.telegram.ui.fp(n90Var2, zArr2, arrayList, zArr, 16);
                                (z18 ? cc.a0(n90Var2).L(R.raw.contact_check, org.telegram.messenger.cd.G(i14, "StorySavedTitle", new Object[0]), org.telegram.messenger.cd.L0(2131744510, null), org.telegram.messenger.cd.L0(2131743912, null), fpVar).j() : cc.a0(n90Var2).J(R.raw.chats_archived, org.telegram.messenger.cd.G(i14, "StoryArchived", new Object[0]), org.telegram.messenger.cd.L0(2131743912, null), 5000, false, fpVar).j()).v = new at(23, n90Var2, zArr2);
                                break;
                            }
                            break;
                    }
                }
            });
            org.telegram.ui.ActionBar.b1 e10 = this.s.e(10, R.drawable.msg_calendar2, org.telegram.messenger.cd.L0(2131752642, null));
            this.G = e10;
            e10.setEnabled(false);
            this.G.setAlpha(0.5f);
            this.s.a(-1);
            org.telegram.ui.ActionBar.p5 p5Var = this.s;
            org.telegram.ui.ActionBar.b1 d = p5Var.d(6, 0, null, org.telegram.messenger.cd.L0(2131748668, null), true, true, p5Var.m0);
            this.x = d;
            d.setChecked(this.D);
            final int i14 = 2;
            this.x.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.k90
                public final /* synthetic */ n90 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    th.x4 x4Var;
                    th.x4 x4Var2;
                    th.x4 x4Var3;
                    th.x4 x4Var4;
                    int i142;
                    int i15 = i14;
                    org.telegram.messenger.t2 t2Var = org.telegram.messenger.t2.D;
                    n90 n90Var = this.b;
                    switch (i15) {
                        case 0:
                            Boolean L1 = n90Var.R.L1(null, null);
                            if (L1 != null) {
                                n90Var.h0(true, L1.booleanValue());
                                break;
                            }
                            break;
                        case 1:
                            Boolean M1 = n90Var.R.M1(null, null);
                            if (M1 != null) {
                                n90Var.h0(M1.booleanValue(), true);
                                break;
                            }
                            break;
                        case 2:
                            boolean z10 = n90Var.D;
                            if (z10 && !n90Var.E) {
                                t2Var.a();
                                org.telegram.ui.ActionBar.b1 b1Var = n90Var.x;
                                int i16 = -n90Var.F;
                                n90Var.F = i16;
                                org.telegram.messenger.i0.F3(i16, b1Var, null);
                                break;
                            } else {
                                org.telegram.ui.ActionBar.b1 b1Var2 = n90Var.x;
                                boolean z11 = !z10;
                                n90Var.D = z11;
                                b1Var2.setChecked(z11);
                                m90 m90Var2 = n90Var.R;
                                boolean z12 = n90Var.D;
                                boolean z13 = n90Var.E;
                                hs0 hs0Var = m90Var2.e0;
                                if (hs0Var != null && (x4Var2 = hs0Var.s) != null) {
                                    x4Var2.n = z12;
                                    x4Var2.o = z13;
                                    x4Var2.d(true);
                                }
                                tq0 tq0Var = m90Var2.g0;
                                if (tq0Var != null && (x4Var = tq0Var.s) != null) {
                                    x4Var.n = z12;
                                    x4Var.o = z13;
                                    x4Var.d(true);
                                    break;
                                }
                            }
                            break;
                        case 3:
                            boolean z14 = n90Var.E;
                            if (z14 && !n90Var.D) {
                                t2Var.a();
                                org.telegram.ui.ActionBar.b1 b1Var3 = n90Var.y;
                                int i17 = -n90Var.F;
                                n90Var.F = i17;
                                org.telegram.messenger.i0.F3(i17, b1Var3, null);
                                break;
                            } else {
                                org.telegram.ui.ActionBar.b1 b1Var4 = n90Var.y;
                                boolean z15 = !z14;
                                n90Var.E = z15;
                                b1Var4.setChecked(z15);
                                m90 m90Var3 = n90Var.R;
                                boolean z16 = n90Var.D;
                                boolean z17 = n90Var.E;
                                hs0 hs0Var2 = m90Var3.e0;
                                if (hs0Var2 != null && (x4Var4 = hs0Var2.s) != null) {
                                    x4Var4.n = z16;
                                    x4Var4.o = z17;
                                    x4Var4.d(true);
                                }
                                tq0 tq0Var2 = m90Var3.g0;
                                if (tq0Var2 != null && (x4Var3 = tq0Var2.s) != null) {
                                    x4Var3.n = z16;
                                    x4Var3.o = z17;
                                    x4Var3.d(true);
                                    break;
                                }
                            }
                            break;
                        default:
                            n90 n90Var2 = this.b;
                            ag.j0 j0Var = n90Var2.Q;
                            if (j0Var != null) {
                                j0Var.run();
                                n90Var2.Q = null;
                            }
                            wb.e();
                            boolean z18 = n90Var2.R.getClosestTab() == 9;
                            ArrayList arrayList = new ArrayList();
                            if (n90Var2.w != null) {
                                int i18 = 0;
                                for (int i19 = 0; i19 < n90Var2.w.size(); i19++) {
                                    TL_stories.StoryItem storyItem = ((org.telegram.messenger.jj) n90Var2.w.valueAt(i19)).l;
                                    if (storyItem != null) {
                                        arrayList.add(storyItem);
                                        i18++;
                                    }
                                }
                                i142 = i18;
                            } else {
                                i142 = 0;
                            }
                            n90Var2.R.T(false);
                            if (z18) {
                                n90Var2.R.f1(8);
                            }
                            if (!arrayList.isEmpty()) {
                                boolean[] zArr = new boolean[arrayList.size()];
                                for (int i20 = 0; i20 < arrayList.size(); i20++) {
                                    TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) arrayList.get(i20);
                                    zArr[i20] = storyItem2.pinned;
                                    storyItem2.pinned = z18;
                                }
                                n90Var2.getMessagesController().O1().q0(n90Var2.e, arrayList, false);
                                boolean[] zArr2 = {false};
                                n90Var2.Q = new ag.j0(n90Var2, arrayList, z18, 18);
                                org.telegram.ui.fp fpVar = new org.telegram.ui.fp(n90Var2, zArr2, arrayList, zArr, 16);
                                (z18 ? cc.a0(n90Var2).L(R.raw.contact_check, org.telegram.messenger.cd.G(i142, "StorySavedTitle", new Object[0]), org.telegram.messenger.cd.L0(2131744510, null), org.telegram.messenger.cd.L0(2131743912, null), fpVar).j() : cc.a0(n90Var2).J(R.raw.chats_archived, org.telegram.messenger.cd.G(i142, "StoryArchived", new Object[0]), org.telegram.messenger.cd.L0(2131743912, null), 5000, false, fpVar).j()).v = new at(23, n90Var2, zArr2);
                                break;
                            }
                            break;
                    }
                }
            });
            org.telegram.ui.ActionBar.p5 p5Var2 = this.s;
            org.telegram.ui.ActionBar.b1 d10 = p5Var2.d(7, 0, null, org.telegram.messenger.cd.L0(2131748667, null), true, true, p5Var2.m0);
            this.y = d10;
            d10.setChecked(this.E);
            this.y.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.k90
                public final /* synthetic */ n90 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    th.x4 x4Var;
                    th.x4 x4Var2;
                    th.x4 x4Var3;
                    th.x4 x4Var4;
                    int i142;
                    int i15 = i12;
                    org.telegram.messenger.t2 t2Var = org.telegram.messenger.t2.D;
                    n90 n90Var = this.b;
                    switch (i15) {
                        case 0:
                            Boolean L1 = n90Var.R.L1(null, null);
                            if (L1 != null) {
                                n90Var.h0(true, L1.booleanValue());
                                break;
                            }
                            break;
                        case 1:
                            Boolean M1 = n90Var.R.M1(null, null);
                            if (M1 != null) {
                                n90Var.h0(M1.booleanValue(), true);
                                break;
                            }
                            break;
                        case 2:
                            boolean z10 = n90Var.D;
                            if (z10 && !n90Var.E) {
                                t2Var.a();
                                org.telegram.ui.ActionBar.b1 b1Var = n90Var.x;
                                int i16 = -n90Var.F;
                                n90Var.F = i16;
                                org.telegram.messenger.i0.F3(i16, b1Var, null);
                                break;
                            } else {
                                org.telegram.ui.ActionBar.b1 b1Var2 = n90Var.x;
                                boolean z11 = !z10;
                                n90Var.D = z11;
                                b1Var2.setChecked(z11);
                                m90 m90Var2 = n90Var.R;
                                boolean z12 = n90Var.D;
                                boolean z13 = n90Var.E;
                                hs0 hs0Var = m90Var2.e0;
                                if (hs0Var != null && (x4Var2 = hs0Var.s) != null) {
                                    x4Var2.n = z12;
                                    x4Var2.o = z13;
                                    x4Var2.d(true);
                                }
                                tq0 tq0Var = m90Var2.g0;
                                if (tq0Var != null && (x4Var = tq0Var.s) != null) {
                                    x4Var.n = z12;
                                    x4Var.o = z13;
                                    x4Var.d(true);
                                    break;
                                }
                            }
                            break;
                        case 3:
                            boolean z14 = n90Var.E;
                            if (z14 && !n90Var.D) {
                                t2Var.a();
                                org.telegram.ui.ActionBar.b1 b1Var3 = n90Var.y;
                                int i17 = -n90Var.F;
                                n90Var.F = i17;
                                org.telegram.messenger.i0.F3(i17, b1Var3, null);
                                break;
                            } else {
                                org.telegram.ui.ActionBar.b1 b1Var4 = n90Var.y;
                                boolean z15 = !z14;
                                n90Var.E = z15;
                                b1Var4.setChecked(z15);
                                m90 m90Var3 = n90Var.R;
                                boolean z16 = n90Var.D;
                                boolean z17 = n90Var.E;
                                hs0 hs0Var2 = m90Var3.e0;
                                if (hs0Var2 != null && (x4Var4 = hs0Var2.s) != null) {
                                    x4Var4.n = z16;
                                    x4Var4.o = z17;
                                    x4Var4.d(true);
                                }
                                tq0 tq0Var2 = m90Var3.g0;
                                if (tq0Var2 != null && (x4Var3 = tq0Var2.s) != null) {
                                    x4Var3.n = z16;
                                    x4Var3.o = z17;
                                    x4Var3.d(true);
                                    break;
                                }
                            }
                            break;
                        default:
                            n90 n90Var2 = this.b;
                            ag.j0 j0Var = n90Var2.Q;
                            if (j0Var != null) {
                                j0Var.run();
                                n90Var2.Q = null;
                            }
                            wb.e();
                            boolean z18 = n90Var2.R.getClosestTab() == 9;
                            ArrayList arrayList = new ArrayList();
                            if (n90Var2.w != null) {
                                int i18 = 0;
                                for (int i19 = 0; i19 < n90Var2.w.size(); i19++) {
                                    TL_stories.StoryItem storyItem = ((org.telegram.messenger.jj) n90Var2.w.valueAt(i19)).l;
                                    if (storyItem != null) {
                                        arrayList.add(storyItem);
                                        i18++;
                                    }
                                }
                                i142 = i18;
                            } else {
                                i142 = 0;
                            }
                            n90Var2.R.T(false);
                            if (z18) {
                                n90Var2.R.f1(8);
                            }
                            if (!arrayList.isEmpty()) {
                                boolean[] zArr = new boolean[arrayList.size()];
                                for (int i20 = 0; i20 < arrayList.size(); i20++) {
                                    TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) arrayList.get(i20);
                                    zArr[i20] = storyItem2.pinned;
                                    storyItem2.pinned = z18;
                                }
                                n90Var2.getMessagesController().O1().q0(n90Var2.e, arrayList, false);
                                boolean[] zArr2 = {false};
                                n90Var2.Q = new ag.j0(n90Var2, arrayList, z18, 18);
                                org.telegram.ui.fp fpVar = new org.telegram.ui.fp(n90Var2, zArr2, arrayList, zArr, 16);
                                (z18 ? cc.a0(n90Var2).L(R.raw.contact_check, org.telegram.messenger.cd.G(i142, "StorySavedTitle", new Object[0]), org.telegram.messenger.cd.L0(2131744510, null), org.telegram.messenger.cd.L0(2131743912, null), fpVar).j() : cc.a0(n90Var2).J(R.raw.chats_archived, org.telegram.messenger.cd.G(i142, "StoryArchived", new Object[0]), org.telegram.messenger.cd.L0(2131743912, null), 5000, false, fpVar).j()).v = new at(23, n90Var2, zArr2);
                                break;
                            }
                            break;
                    }
                }
            });
        }
        int i15 = this.a;
        final int i16 = 4;
        gh.b[] bVarArr = this.K;
        if (i15 == 1) {
            org.telegram.ui.rf0 rf0Var = new org.telegram.ui.rf0(context, getResourceProvider());
            this.J = rf0Var;
            rf0Var.setClipChildren(false);
            this.J.setPadding(org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(12.0f));
            bVarArr[0] = gh.b.c(context, getResourceProvider(), gh.a.Q, 2131746666);
            bVarArr[1] = gh.b.c(context, getResourceProvider(), gh.a.R, 2131746642);
            for (int i17 = 0; i17 < bVarArr.length; i17++) {
                bVarArr[i17].setOnClickListener(new bh.f(this, i17, i13));
                this.J.addView(bVarArr[i17]);
                this.J.i(bVarArr[i17], true, false);
            }
            bVar = baseSimpleGlass;
            vg.f c10 = bVar.c.c(this.J, w7.b9.f(getResourceProvider()), false);
            org.telegram.messenger.z20.u(c10, org.telegram.messenger.i0.L(28.0f), 7.666f);
            this.J.setBackground(c10);
            l0Var.addView(this.J, w7.b6.e(-2, 72, 81));
            FrameLayout frameLayout = new FrameLayout(context);
            this.M = frameLayout;
            frameLayout.setPadding(org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(8.0f));
            vh.d dVar = new vh.d(context, getResourceProvider(), true);
            this.N = dVar;
            dVar.i(org.telegram.messenger.cd.L0(2131745926, null), false, true);
            this.N.setShowZero(true);
            this.N.c(0, false);
            this.N.setEnabled(false);
            this.N.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.k90
                public final /* synthetic */ n90 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    th.x4 x4Var;
                    th.x4 x4Var2;
                    th.x4 x4Var3;
                    th.x4 x4Var4;
                    int i142;
                    int i152 = i16;
                    org.telegram.messenger.t2 t2Var = org.telegram.messenger.t2.D;
                    n90 n90Var = this.b;
                    switch (i152) {
                        case 0:
                            Boolean L1 = n90Var.R.L1(null, null);
                            if (L1 != null) {
                                n90Var.h0(true, L1.booleanValue());
                                break;
                            }
                            break;
                        case 1:
                            Boolean M1 = n90Var.R.M1(null, null);
                            if (M1 != null) {
                                n90Var.h0(M1.booleanValue(), true);
                                break;
                            }
                            break;
                        case 2:
                            boolean z10 = n90Var.D;
                            if (z10 && !n90Var.E) {
                                t2Var.a();
                                org.telegram.ui.ActionBar.b1 b1Var = n90Var.x;
                                int i162 = -n90Var.F;
                                n90Var.F = i162;
                                org.telegram.messenger.i0.F3(i162, b1Var, null);
                                break;
                            } else {
                                org.telegram.ui.ActionBar.b1 b1Var2 = n90Var.x;
                                boolean z11 = !z10;
                                n90Var.D = z11;
                                b1Var2.setChecked(z11);
                                m90 m90Var2 = n90Var.R;
                                boolean z12 = n90Var.D;
                                boolean z13 = n90Var.E;
                                hs0 hs0Var = m90Var2.e0;
                                if (hs0Var != null && (x4Var2 = hs0Var.s) != null) {
                                    x4Var2.n = z12;
                                    x4Var2.o = z13;
                                    x4Var2.d(true);
                                }
                                tq0 tq0Var = m90Var2.g0;
                                if (tq0Var != null && (x4Var = tq0Var.s) != null) {
                                    x4Var.n = z12;
                                    x4Var.o = z13;
                                    x4Var.d(true);
                                    break;
                                }
                            }
                            break;
                        case 3:
                            boolean z14 = n90Var.E;
                            if (z14 && !n90Var.D) {
                                t2Var.a();
                                org.telegram.ui.ActionBar.b1 b1Var3 = n90Var.y;
                                int i172 = -n90Var.F;
                                n90Var.F = i172;
                                org.telegram.messenger.i0.F3(i172, b1Var3, null);
                                break;
                            } else {
                                org.telegram.ui.ActionBar.b1 b1Var4 = n90Var.y;
                                boolean z15 = !z14;
                                n90Var.E = z15;
                                b1Var4.setChecked(z15);
                                m90 m90Var3 = n90Var.R;
                                boolean z16 = n90Var.D;
                                boolean z17 = n90Var.E;
                                hs0 hs0Var2 = m90Var3.e0;
                                if (hs0Var2 != null && (x4Var4 = hs0Var2.s) != null) {
                                    x4Var4.n = z16;
                                    x4Var4.o = z17;
                                    x4Var4.d(true);
                                }
                                tq0 tq0Var2 = m90Var3.g0;
                                if (tq0Var2 != null && (x4Var3 = tq0Var2.s) != null) {
                                    x4Var3.n = z16;
                                    x4Var3.o = z17;
                                    x4Var3.d(true);
                                    break;
                                }
                            }
                            break;
                        default:
                            n90 n90Var2 = this.b;
                            ag.j0 j0Var = n90Var2.Q;
                            if (j0Var != null) {
                                j0Var.run();
                                n90Var2.Q = null;
                            }
                            wb.e();
                            boolean z18 = n90Var2.R.getClosestTab() == 9;
                            ArrayList arrayList = new ArrayList();
                            if (n90Var2.w != null) {
                                int i18 = 0;
                                for (int i19 = 0; i19 < n90Var2.w.size(); i19++) {
                                    TL_stories.StoryItem storyItem = ((org.telegram.messenger.jj) n90Var2.w.valueAt(i19)).l;
                                    if (storyItem != null) {
                                        arrayList.add(storyItem);
                                        i18++;
                                    }
                                }
                                i142 = i18;
                            } else {
                                i142 = 0;
                            }
                            n90Var2.R.T(false);
                            if (z18) {
                                n90Var2.R.f1(8);
                            }
                            if (!arrayList.isEmpty()) {
                                boolean[] zArr = new boolean[arrayList.size()];
                                for (int i20 = 0; i20 < arrayList.size(); i20++) {
                                    TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) arrayList.get(i20);
                                    zArr[i20] = storyItem2.pinned;
                                    storyItem2.pinned = z18;
                                }
                                n90Var2.getMessagesController().O1().q0(n90Var2.e, arrayList, false);
                                boolean[] zArr2 = {false};
                                n90Var2.Q = new ag.j0(n90Var2, arrayList, z18, 18);
                                org.telegram.ui.fp fpVar = new org.telegram.ui.fp(n90Var2, zArr2, arrayList, zArr, 16);
                                (z18 ? cc.a0(n90Var2).L(R.raw.contact_check, org.telegram.messenger.cd.G(i142, "StorySavedTitle", new Object[0]), org.telegram.messenger.cd.L0(2131744510, null), org.telegram.messenger.cd.L0(2131743912, null), fpVar).j() : cc.a0(n90Var2).J(R.raw.chats_archived, org.telegram.messenger.cd.G(i142, "StoryArchived", new Object[0]), org.telegram.messenger.cd.L0(2131743912, null), 5000, false, fpVar).j()).v = new at(23, n90Var2, zArr2);
                                break;
                            }
                            break;
                    }
                }
            });
            this.M.addView(this.N, w7.b6.c(56.0f, -1));
            this.M.setVisibility(4);
            l0Var.addView(this.M, w7.b6.e(-1, 72, 80));
            this.O = new fe.b(0, new px(this, 8), gr.h, 320L, false);
            setBulletinDelegate(new k7(this, 3));
        } else {
            bVar = baseSimpleGlass;
        }
        View view = new View(context);
        this.P = view;
        this.R.y(view);
        View view2 = this.P;
        view2.setBackground(bVar.a(view2));
        View view3 = new View(context);
        this.navigationBarFadeView = view3;
        view3.setBackground(bVar.b(view3));
        View view4 = this.navigationBarFadeView;
        org.telegram.ui.rf0 rf0Var2 = this.J;
        l0Var.addView(view4, rf0Var2 != null ? l0Var.indexOfChild(rf0Var2) : l0Var.getChildCount(), w7.b6.e(-1, 0, 80));
        org.telegram.ui.ActionBar.i5 i5Var = this.simpleActionBar;
        org.telegram.ui.ActionBar.p6 resourceProvider = getResourceProvider();
        bVar.k = l0Var;
        bVar.l = null;
        bVar.g(l0Var, i5Var, resourceProvider);
        bVar.m = new ei.a(i16, this, l0Var);
        this.R.setPagesGlassEngine(this.glassEngine);
        this.simpleActionBar.setBackground(null);
        g0(false);
        if (this.a == 3 && (i10 = this.r) != -1) {
            this.simpleActionBar.setSubtitle(org.telegram.messenger.cd.H(' ', "FoundStories", i10));
        }
        a0();
        f0();
        if (this.a == 1) {
            r13 = this.S != 9 ? 0 : 1;
            org.telegram.ui.rf0 rf0Var3 = this.J;
            if (rf0Var3 != null && this.L != r13) {
                this.L = r13;
                rf0Var3.q(bVarArr[r13], false);
            }
        }
        return l0Var;
    }

    public final void d0(TLRPC.ChatFull chatFull) {
        this.c = chatFull;
    }

    @Override // org.telegram.messenger.us
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == org.telegram.messenger.zs.E0 && ((Long) objArr[0]).longValue() == this.e) {
            TLRPC.UserFull userFull = (TLRPC.UserFull) objArr[1];
            this.d = userFull;
            m90 m90Var = this.R;
            if (m90Var != null) {
                m90Var.setUserInfo(userFull);
            }
        }
    }

    public final void e0(String str) {
        this.simpleActionBar.setSubtitleAnimated(str);
    }

    public final void f0() {
        int i10;
        m90 m90Var = this.R;
        if (m90Var == null || this.simpleActionBar == null) {
            return;
        }
        int closestTab = m90Var.getClosestTab();
        if (this.a != 3 || closestTab == 8) {
            int[] iArr = this.b.c;
            boolean z10 = org.telegram.messenger.cd.X;
            if (closestTab == 8 || closestTab == 9) {
                org.telegram.ui.ActionBar.b1 b1Var = this.I;
                if (b1Var != null) {
                    b1Var.setEnabled(this.R.J());
                    org.telegram.ui.ActionBar.b1 b1Var2 = this.I;
                    b1Var2.setAlpha(b1Var2.isEnabled() ? 1.0f : 0.5f);
                }
                org.telegram.ui.ActionBar.b1 b1Var3 = this.H;
                if (b1Var3 != null) {
                    b1Var3.setEnabled(this.R.I());
                    org.telegram.ui.ActionBar.b1 b1Var4 = this.H;
                    b1Var4.setAlpha(b1Var4.isEnabled() ? 1.0f : 0.5f);
                }
                int k02 = this.R.k0(closestTab);
                if (this.a == 3) {
                    if (k02 > 0) {
                        e0(org.telegram.messenger.cd.H(' ', "FoundStories", k02));
                    }
                } else if (closestTab == 8) {
                    e0(k02 > 0 ? org.telegram.messenger.cd.G(k02, "ProfileMyStoriesCount", new Object[0]) : null);
                } else {
                    e0(k02 > 0 ? org.telegram.messenger.cd.G(k02, "ProfileStoriesArchiveCount", new Object[0]) : null);
                }
                g0(true);
                org.telegram.ui.ActionBar.p5 p5Var = this.s;
                if (p5Var != null) {
                    p5Var.Y(k02 > 0, true);
                }
                vh.d dVar = this.N;
                if (dVar != null) {
                    boolean z11 = !z10 && this.U == closestTab;
                    if (closestTab == 8) {
                        SparseArray sparseArray = this.w;
                        dVar.i(org.telegram.messenger.cd.G(sparseArray == null ? 0 : sparseArray.size(), "ArchiveStories", new Object[0]), z11, true);
                    } else {
                        dVar.i(org.telegram.messenger.cd.L0(2131745926, null), z11, true);
                    }
                    this.U = closestTab;
                }
                org.telegram.ui.ActionBar.b1 b1Var5 = this.G;
                if (b1Var5 != null) {
                    boolean z12 = k02 > 0;
                    b1Var5.setEnabled(z12);
                    this.G.setAlpha(z12 ? 1.0f : 0.5f);
                    return;
                }
                return;
            }
            if (closestTab == 11) {
                e0(org.telegram.messenger.cd.G(getMessagesController().F1().c(), "SavedDialogsTabCount", new Object[0]));
                return;
            }
            if (closestTab >= 0) {
                if (closestTab >= iArr.length || iArr[closestTab] >= 0) {
                    if (closestTab == 0) {
                        if (this.R.getPhotosVideosTypeFilter() == 1) {
                            e0(org.telegram.messenger.cd.G(iArr[6], "Photos", new Object[0]));
                            return;
                        } else if (this.R.getPhotosVideosTypeFilter() == 2) {
                            e0(org.telegram.messenger.cd.G(iArr[7], "Videos", new Object[0]));
                            return;
                        } else {
                            e0(org.telegram.messenger.cd.G(iArr[0], "Media", new Object[0]));
                            return;
                        }
                    }
                    if (closestTab == 1) {
                        e0(org.telegram.messenger.cd.G(iArr[1], "Files", new Object[0]));
                        return;
                    }
                    if (closestTab == 2) {
                        e0(org.telegram.messenger.cd.G(iArr[2], "Voice", new Object[0]));
                        return;
                    }
                    if (closestTab == 3) {
                        e0(org.telegram.messenger.cd.G(iArr[3], "Links", new Object[0]));
                        return;
                    }
                    if (closestTab == 4) {
                        e0(org.telegram.messenger.cd.G(iArr[4], "MusicFiles", new Object[0]));
                        return;
                    }
                    if (closestTab == 5) {
                        e0(org.telegram.messenger.cd.G(iArr[5], "GIFs", new Object[0]));
                        return;
                    }
                    if (closestTab == 15 && (i10 = iArr[8]) >= 0) {
                        e0(org.telegram.messenger.cd.G(i10, "ProfilePollsCount", new Object[0]));
                    } else if (closestTab == 10) {
                        org.telegram.messenger.wo K0 = org.telegram.messenger.vp.r1(this.currentAccount).K0(this.e);
                        e0(org.telegram.messenger.cd.G(K0 == null ? 0 : K0.b.size() + K0.c, "Channels", new Object[0]));
                    }
                }
            }
        }
    }

    public final void g0(boolean z10) {
        String str;
        int i10 = this.a;
        boolean z11 = true;
        if (i10 == 3) {
            str = this.h;
        } else {
            if (i10 == 2) {
                str = org.telegram.messenger.cd.L0(2131746649, null);
            } else if (i10 == 1) {
                m90 m90Var = this.R;
                if (m90Var != null && m90Var.getClosestTab() != 9) {
                    z11 = false;
                }
                str = org.telegram.messenger.cd.L0(z11 ? 2131746649 : 2131746670, null);
            } else {
                long j10 = (this.f == 0 || this.e != getUserConfig().e()) ? this.e : this.f;
                if (j10 == 2666000) {
                    str = org.telegram.messenger.cd.L0(2131754252, null);
                } else if (this.f != 0 && j10 == getUserConfig().e()) {
                    str = org.telegram.messenger.cd.L0(2131748318, null);
                } else if (org.telegram.messenger.o5.C(j10)) {
                    TLRPC.EncryptedChat Z0 = getMessagesController().Z0(Integer.valueOf((int) (j10 & 4294967295L)));
                    TLRPC.User Z1 = Z0 != null ? getMessagesController().Z1(Long.valueOf(Z0.user_id)) : null;
                    if (Z1 != null) {
                        str = org.telegram.messenger.i5.m(0, Z1.first_name, Z1.last_name);
                    }
                    str = null;
                } else if (org.telegram.messenger.o5.E(j10)) {
                    TLRPC.User Z12 = getMessagesController().Z1(Long.valueOf(j10));
                    if (Z12 != null) {
                        str = Z12.self ? org.telegram.messenger.cd.L0(2131745918, null) : org.telegram.messenger.i5.m(0, Z12.first_name, Z12.last_name);
                    }
                    str = null;
                } else {
                    TLRPC.Chat L0 = getMessagesController().L0(Long.valueOf(-j10));
                    if (L0 != null) {
                        str = L0.title;
                    }
                    str = null;
                }
                if (TextUtils.isEmpty(str)) {
                    str = org.telegram.messenger.cd.L0(2131745433, null);
                }
            }
        }
        String str2 = str;
        boolean z12 = z11;
        if (TextUtils.equals(this.T, str2)) {
            return;
        }
        this.T = str2;
        if (!z10) {
            this.simpleActionBar.setTitle(str2);
            return;
        }
        org.telegram.ui.ActionBar.i5 i5Var = this.simpleActionBar;
        i5Var.getClass();
        i5Var.B(str2, z12, 320L, gr.h);
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final int getNavigationBarColor() {
        int navigationBarColor = super.getNavigationBarColor();
        return (getLastStoryViewer() == null || !getLastStoryViewer().z()) ? navigationBarColor : getLastStoryViewer().e(navigationBarColor);
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.R.getThemeDescriptions());
        return arrayList;
    }

    public final void h0(boolean z10, boolean z11) {
        this.I.setEnabled(z10);
        this.I.animate().alpha(z10 ? 1.0f : 0.5f).start();
        this.H.setEnabled(z11);
        this.H.animate().alpha(z11 ? 1.0f : 0.5f).start();
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        if (!this.R.G0()) {
            return false;
        }
        m90 m90Var = this.R;
        return m90Var.getSelectedTab() == m90Var.K0.getFirstTabId();
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean onBackPressed(boolean z10) {
        if (!hasShownSheet()) {
            m90 m90Var = this.R;
            if (!m90Var.E1) {
                return super.onBackPressed(z10);
            }
            if (z10) {
                m90Var.T(false);
            }
        } else if (z10) {
            closeSheet();
            return false;
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean onFragmentCreate() {
        this.a = getArguments().getInt(TeXSymbolParser.TYPE_ATTR, 0);
        this.e = getArguments().getLong("dialog_id");
        this.f = getArguments().getLong("topic_id", 0L);
        this.h = getArguments().getString("hashtag", "");
        this.n = getArguments().getString("username", "");
        this.r = getArguments().getInt("storiesCount", -1);
        int i10 = this.a;
        this.S = getArguments().getInt("start_from", i10 == 2 ? 9 : i10 == 1 ? 8 : 0);
        getNotificationCenter().c(this, org.telegram.messenger.zs.E0);
        getNotificationCenter().c(this, org.telegram.messenger.zs.f5);
        getNotificationCenter().c(this, org.telegram.messenger.zs.Z2);
        if (org.telegram.messenger.o5.E(this.e) && this.f == 0) {
            TLRPC.User Z1 = getMessagesController().Z1(Long.valueOf(this.e));
            if (org.telegram.messenger.h20.B(Z1)) {
                getMessagesController().e3(Z1, false, this.classGuid);
                this.d = getMessagesController().a2(this.e);
            }
        }
        if (this.b == null) {
            this.b = new rt0(this);
        }
        this.b.y.add(this);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().n(this, org.telegram.messenger.zs.E0);
        getNotificationCenter().n(this, org.telegram.messenger.zs.f5);
        getNotificationCenter().n(this, org.telegram.messenger.zs.Z2);
        ag.j0 j0Var = this.Q;
        if (j0Var != null) {
            this.Q = null;
            org.telegram.messenger.i0.g3(j0Var);
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onInsets(int i10, int i11, int i12, int i13) {
        a0();
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean useSimpleActionBar() {
        return true;
    }
}
