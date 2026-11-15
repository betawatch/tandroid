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

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class x80 extends org.telegram.ui.ActionBar.e2 implements rs0, pg.b, org.telegram.messenger.is {
    public boolean E;
    public boolean F;
    public int G;
    public org.telegram.ui.ActionBar.z0 H;
    public org.telegram.ui.ActionBar.z0 I;
    public org.telegram.ui.ActionBar.z0 J;
    public org.telegram.ui.le0 K;
    public final qh.b[] L;
    public int M;
    public FrameLayout N;
    public hi.d O;
    public te.a P;
    public View Q;
    public di.m6 R;
    public w80 S;
    public int T;
    public String U;
    public int V;
    public int a;
    public qs0 b;
    public TLRPC.ChatFull c;
    public TLRPC.UserFull d;
    public long e;
    public long f;
    public String h;
    public String n;
    public int r;
    public org.telegram.ui.ActionBar.d5 s;
    public SparseArray w;
    public org.telegram.ui.ActionBar.z0 x;
    public org.telegram.ui.ActionBar.z0 y;

    public x80(Bundle bundle, qs0 qs0Var) {
        super(bundle);
        this.E = true;
        this.F = true;
        this.G = -12;
        this.L = new qh.b[2];
        this.M = -1;
        this.b = qs0Var;
    }

    @Override // pg.b
    public final List F() {
        Activity parentActivity = getParentActivity();
        org.telegram.messenger.q5 q5Var = sg.b1.m;
        return Arrays.asList(new pg.a((parentActivity.getSharedPreferences("shapedetector_conf", 0).getBoolean("learning", false) ? "Disable" : "Enable").concat(" shape detector learning debug"), new t80(this, 1)));
    }

    @Override // org.telegram.ui.Components.rs0
    public final void R() {
        qs0 qs0Var;
        w80 w80Var = this.S;
        if (w80Var != null && (qs0Var = this.b) != null) {
            w80Var.setNewMediaCounts(qs0Var.c);
        }
        g0();
    }

    public final void b0() {
        if (this.S == null) {
            return;
        }
        int i7 = 0;
        int L = this.K != null ? org.telegram.messenger.g0.L(72.0f) : 0;
        w80 w80Var = this.S;
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + this.mSystemInsets.b;
        int[] iArr = ys0.t2;
        w80Var.n1(ri.a.d(currentActionBarHeight - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - org.telegram.messenger.g0.L(6.666f), ri.a.c(this.mSystemInsets.b), ri.a.c(this.mSystemInsets.d + L), this.mSystemInsets.d + L);
        if (this.Q != null) {
            int topPanelShift = this.S.getTopPanelShift() + org.telegram.messenger.g0.L(44.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + this.mSystemInsets.b;
            if (this.Q.getLayoutParams().height != topPanelShift) {
                this.Q.getLayoutParams().height = topPanelShift;
                this.Q.requestLayout();
            }
        }
        View view = this.navigationBarFadeView;
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            int i10 = this.mSystemInsets.d;
            layoutParams.height = i10 + L;
            View view2 = this.navigationBarFadeView;
            if (i10 < org.telegram.messenger.g0.L(40.0f) && L <= 0) {
                i7 = 8;
            }
            view2.setVisibility(i7);
            this.navigationBarFadeView.requestLayout();
        }
        c0();
    }

    public final void c0() {
        if (this.K == null) {
            return;
        }
        float f10 = this.P.e;
        float L = org.telegram.messenger.g0.L(72.0f) + this.mSystemInsets.d;
        this.K.setTranslationY((L * f10) + (-r2));
        float f11 = 1.0f - f10;
        this.K.setAlpha(f11);
        this.K.setVisibility(f10 < 1.0f ? 0 : 4);
        this.N.setTranslationY((L * f11) + (-this.mSystemInsets.d));
        this.N.setAlpha(f10);
        this.N.setVisibility(f10 > 0.0f ? 0 : 4);
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final boolean canBeginSlide() {
        if (this.S.K0()) {
            return super.canBeginSlide();
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final View createView(Context context) {
        ri.a aVar;
        int i7;
        setHasOwnBackground(true);
        final int i10 = 0;
        this.simpleActionBar.setBackButtonDrawable(new org.telegram.ui.ActionBar.x1(false));
        this.simpleActionBar.setActionBarMenuOnItemClick(new org.telegram.ui.p9(this, 15));
        bi.g2 g2Var = new bi.g2(22, context, this);
        this.fragmentView = g2Var;
        if (this.a == 0 && this.e == getUserConfig().e() && this.f == 0 && !getMessagesController().G1().b && getMessagesController().G1().e()) {
            this.T = 11;
        }
        ri.a baseSimpleGlass = getBaseSimpleGlass();
        w80 w80Var = new w80(this, context, this.e, this.b, this.c, this.d, this.T, this, new v80(this), getResourceProvider(), baseSimpleGlass.c);
        this.S = w80Var;
        w80Var.setOnTopPanelShiftChanged(new t80(this, i10));
        this.S.L0.setOpen(true);
        this.S.setPinnedToTop(true);
        g2Var.addView(this.S, c8.ja.c(-1.0f, -1));
        final int i11 = 3;
        if (d0()) {
            org.telegram.ui.ActionBar.d5 b10 = this.simpleActionBar.r().b(0, R.drawable.ic_ab_other);
            this.s = b10;
            b10.setContentDescription(org.telegram.messenger.hd.M0(2131754839, null));
            this.s.Z(false, false);
            org.telegram.ui.ActionBar.z0 e10 = this.s.e(8, R.drawable.msg_zoomin, org.telegram.messenger.hd.M0(2131748650, null));
            this.I = e10;
            e10.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.u80
                public final /* synthetic */ x80 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    fi.k6 k6Var;
                    fi.k6 k6Var2;
                    fi.k6 k6Var3;
                    fi.k6 k6Var4;
                    int i12;
                    int i13 = i10;
                    org.telegram.messenger.p2 p2Var = org.telegram.messenger.p2.E;
                    x80 x80Var = this.b;
                    switch (i13) {
                        case 0:
                            Boolean Q1 = x80Var.S.Q1(null, null);
                            if (Q1 != null) {
                                x80Var.i0(true, Q1.booleanValue());
                                break;
                            }
                            break;
                        case 1:
                            Boolean R1 = x80Var.S.R1(null, null);
                            if (R1 != null) {
                                x80Var.i0(R1.booleanValue(), true);
                                break;
                            }
                            break;
                        case 2:
                            boolean z10 = x80Var.E;
                            if (z10 && !x80Var.F) {
                                p2Var.a();
                                org.telegram.ui.ActionBar.z0 z0Var = x80Var.x;
                                int i14 = -x80Var.G;
                                x80Var.G = i14;
                                org.telegram.messenger.g0.F3(i14, z0Var, null);
                                break;
                            } else {
                                org.telegram.ui.ActionBar.z0 z0Var2 = x80Var.x;
                                boolean z11 = !z10;
                                x80Var.E = z11;
                                z0Var2.setChecked(z11);
                                w80 w80Var2 = x80Var.S;
                                boolean z12 = x80Var.E;
                                boolean z13 = x80Var.F;
                                ir0 ir0Var = w80Var2.f0;
                                if (ir0Var != null && (k6Var2 = ir0Var.s) != null) {
                                    k6Var2.n = z12;
                                    k6Var2.o = z13;
                                    k6Var2.d(true);
                                }
                                up0 up0Var = w80Var2.h0;
                                if (up0Var != null && (k6Var = up0Var.s) != null) {
                                    k6Var.n = z12;
                                    k6Var.o = z13;
                                    k6Var.d(true);
                                    break;
                                }
                            }
                            break;
                        case 3:
                            boolean z14 = x80Var.F;
                            if (z14 && !x80Var.E) {
                                p2Var.a();
                                org.telegram.ui.ActionBar.z0 z0Var3 = x80Var.y;
                                int i15 = -x80Var.G;
                                x80Var.G = i15;
                                org.telegram.messenger.g0.F3(i15, z0Var3, null);
                                break;
                            } else {
                                org.telegram.ui.ActionBar.z0 z0Var4 = x80Var.y;
                                boolean z15 = !z14;
                                x80Var.F = z15;
                                z0Var4.setChecked(z15);
                                w80 w80Var3 = x80Var.S;
                                boolean z16 = x80Var.E;
                                boolean z17 = x80Var.F;
                                ir0 ir0Var2 = w80Var3.f0;
                                if (ir0Var2 != null && (k6Var4 = ir0Var2.s) != null) {
                                    k6Var4.n = z16;
                                    k6Var4.o = z17;
                                    k6Var4.d(true);
                                }
                                up0 up0Var2 = w80Var3.h0;
                                if (up0Var2 != null && (k6Var3 = up0Var2.s) != null) {
                                    k6Var3.n = z16;
                                    k6Var3.o = z17;
                                    k6Var3.d(true);
                                    break;
                                }
                            }
                            break;
                        default:
                            x80 x80Var2 = this.b;
                            di.m6 m6Var = x80Var2.R;
                            if (m6Var != null) {
                                m6Var.run();
                                x80Var2.R = null;
                            }
                            xb.e();
                            boolean z18 = x80Var2.S.getClosestTab() == 9;
                            ArrayList arrayList = new ArrayList();
                            if (x80Var2.w != null) {
                                int i16 = 0;
                                for (int i17 = 0; i17 < x80Var2.w.size(); i17++) {
                                    TL_stories.StoryItem storyItem = ((org.telegram.messenger.gj) x80Var2.w.valueAt(i17)).l;
                                    if (storyItem != null) {
                                        arrayList.add(storyItem);
                                        i16++;
                                    }
                                }
                                i12 = i16;
                            } else {
                                i12 = 0;
                            }
                            x80Var2.S.V(false);
                            if (z18) {
                                x80Var2.S.k1(8);
                            }
                            if (!arrayList.isEmpty()) {
                                boolean[] zArr = new boolean[arrayList.size()];
                                for (int i18 = 0; i18 < arrayList.size(); i18++) {
                                    TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) arrayList.get(i18);
                                    zArr[i18] = storyItem2.pinned;
                                    storyItem2.pinned = z18;
                                }
                                x80Var2.getMessagesController().P1().q0(x80Var2.e, arrayList, false);
                                boolean[] zArr2 = {false};
                                x80Var2.R = new di.m6(x80Var2, arrayList, z18, 21);
                                org.telegram.ui.ActionBar.m5 m5Var = new org.telegram.ui.ActionBar.m5(x80Var2, zArr2, arrayList, zArr, 29);
                                (z18 ? cc.a0(x80Var2).L(R.raw.contact_check, org.telegram.messenger.hd.G(i12, "StorySavedTitle", new Object[0]), org.telegram.messenger.hd.M0(2131744484, null), org.telegram.messenger.hd.M0(2131743887, null), m5Var).j() : cc.a0(x80Var2).J(R.raw.chats_archived, org.telegram.messenger.hd.G(i12, "StoryArchived", new Object[0]), org.telegram.messenger.hd.M0(2131743887, null), 5000, false, m5Var).j()).v = new vs(23, x80Var2, zArr2);
                                break;
                            }
                            break;
                    }
                }
            });
            org.telegram.ui.ActionBar.z0 e11 = this.s.e(9, R.drawable.msg_zoomout, org.telegram.messenger.hd.M0(2131748649, null));
            this.J = e11;
            e11.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.u80
                public final /* synthetic */ x80 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    fi.k6 k6Var;
                    fi.k6 k6Var2;
                    fi.k6 k6Var3;
                    fi.k6 k6Var4;
                    int i12;
                    int i13 = r2;
                    org.telegram.messenger.p2 p2Var = org.telegram.messenger.p2.E;
                    x80 x80Var = this.b;
                    switch (i13) {
                        case 0:
                            Boolean Q1 = x80Var.S.Q1(null, null);
                            if (Q1 != null) {
                                x80Var.i0(true, Q1.booleanValue());
                                break;
                            }
                            break;
                        case 1:
                            Boolean R1 = x80Var.S.R1(null, null);
                            if (R1 != null) {
                                x80Var.i0(R1.booleanValue(), true);
                                break;
                            }
                            break;
                        case 2:
                            boolean z10 = x80Var.E;
                            if (z10 && !x80Var.F) {
                                p2Var.a();
                                org.telegram.ui.ActionBar.z0 z0Var = x80Var.x;
                                int i14 = -x80Var.G;
                                x80Var.G = i14;
                                org.telegram.messenger.g0.F3(i14, z0Var, null);
                                break;
                            } else {
                                org.telegram.ui.ActionBar.z0 z0Var2 = x80Var.x;
                                boolean z11 = !z10;
                                x80Var.E = z11;
                                z0Var2.setChecked(z11);
                                w80 w80Var2 = x80Var.S;
                                boolean z12 = x80Var.E;
                                boolean z13 = x80Var.F;
                                ir0 ir0Var = w80Var2.f0;
                                if (ir0Var != null && (k6Var2 = ir0Var.s) != null) {
                                    k6Var2.n = z12;
                                    k6Var2.o = z13;
                                    k6Var2.d(true);
                                }
                                up0 up0Var = w80Var2.h0;
                                if (up0Var != null && (k6Var = up0Var.s) != null) {
                                    k6Var.n = z12;
                                    k6Var.o = z13;
                                    k6Var.d(true);
                                    break;
                                }
                            }
                            break;
                        case 3:
                            boolean z14 = x80Var.F;
                            if (z14 && !x80Var.E) {
                                p2Var.a();
                                org.telegram.ui.ActionBar.z0 z0Var3 = x80Var.y;
                                int i15 = -x80Var.G;
                                x80Var.G = i15;
                                org.telegram.messenger.g0.F3(i15, z0Var3, null);
                                break;
                            } else {
                                org.telegram.ui.ActionBar.z0 z0Var4 = x80Var.y;
                                boolean z15 = !z14;
                                x80Var.F = z15;
                                z0Var4.setChecked(z15);
                                w80 w80Var3 = x80Var.S;
                                boolean z16 = x80Var.E;
                                boolean z17 = x80Var.F;
                                ir0 ir0Var2 = w80Var3.f0;
                                if (ir0Var2 != null && (k6Var4 = ir0Var2.s) != null) {
                                    k6Var4.n = z16;
                                    k6Var4.o = z17;
                                    k6Var4.d(true);
                                }
                                up0 up0Var2 = w80Var3.h0;
                                if (up0Var2 != null && (k6Var3 = up0Var2.s) != null) {
                                    k6Var3.n = z16;
                                    k6Var3.o = z17;
                                    k6Var3.d(true);
                                    break;
                                }
                            }
                            break;
                        default:
                            x80 x80Var2 = this.b;
                            di.m6 m6Var = x80Var2.R;
                            if (m6Var != null) {
                                m6Var.run();
                                x80Var2.R = null;
                            }
                            xb.e();
                            boolean z18 = x80Var2.S.getClosestTab() == 9;
                            ArrayList arrayList = new ArrayList();
                            if (x80Var2.w != null) {
                                int i16 = 0;
                                for (int i17 = 0; i17 < x80Var2.w.size(); i17++) {
                                    TL_stories.StoryItem storyItem = ((org.telegram.messenger.gj) x80Var2.w.valueAt(i17)).l;
                                    if (storyItem != null) {
                                        arrayList.add(storyItem);
                                        i16++;
                                    }
                                }
                                i12 = i16;
                            } else {
                                i12 = 0;
                            }
                            x80Var2.S.V(false);
                            if (z18) {
                                x80Var2.S.k1(8);
                            }
                            if (!arrayList.isEmpty()) {
                                boolean[] zArr = new boolean[arrayList.size()];
                                for (int i18 = 0; i18 < arrayList.size(); i18++) {
                                    TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) arrayList.get(i18);
                                    zArr[i18] = storyItem2.pinned;
                                    storyItem2.pinned = z18;
                                }
                                x80Var2.getMessagesController().P1().q0(x80Var2.e, arrayList, false);
                                boolean[] zArr2 = {false};
                                x80Var2.R = new di.m6(x80Var2, arrayList, z18, 21);
                                org.telegram.ui.ActionBar.m5 m5Var = new org.telegram.ui.ActionBar.m5(x80Var2, zArr2, arrayList, zArr, 29);
                                (z18 ? cc.a0(x80Var2).L(R.raw.contact_check, org.telegram.messenger.hd.G(i12, "StorySavedTitle", new Object[0]), org.telegram.messenger.hd.M0(2131744484, null), org.telegram.messenger.hd.M0(2131743887, null), m5Var).j() : cc.a0(x80Var2).J(R.raw.chats_archived, org.telegram.messenger.hd.G(i12, "StoryArchived", new Object[0]), org.telegram.messenger.hd.M0(2131743887, null), 5000, false, m5Var).j()).v = new vs(23, x80Var2, zArr2);
                                break;
                            }
                            break;
                    }
                }
            });
            org.telegram.ui.ActionBar.z0 e12 = this.s.e(10, R.drawable.msg_calendar2, org.telegram.messenger.hd.M0(2131752642, null));
            this.H = e12;
            e12.setEnabled(false);
            this.H.setAlpha(0.5f);
            this.s.a(-1);
            org.telegram.ui.ActionBar.d5 d5Var = this.s;
            org.telegram.ui.ActionBar.z0 d = d5Var.d(6, 0, null, org.telegram.messenger.hd.M0(2131748653, null), true, true, d5Var.n0);
            this.x = d;
            d.setChecked(this.E);
            final int i12 = 2;
            this.x.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.u80
                public final /* synthetic */ x80 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    fi.k6 k6Var;
                    fi.k6 k6Var2;
                    fi.k6 k6Var3;
                    fi.k6 k6Var4;
                    int i122;
                    int i13 = i12;
                    org.telegram.messenger.p2 p2Var = org.telegram.messenger.p2.E;
                    x80 x80Var = this.b;
                    switch (i13) {
                        case 0:
                            Boolean Q1 = x80Var.S.Q1(null, null);
                            if (Q1 != null) {
                                x80Var.i0(true, Q1.booleanValue());
                                break;
                            }
                            break;
                        case 1:
                            Boolean R1 = x80Var.S.R1(null, null);
                            if (R1 != null) {
                                x80Var.i0(R1.booleanValue(), true);
                                break;
                            }
                            break;
                        case 2:
                            boolean z10 = x80Var.E;
                            if (z10 && !x80Var.F) {
                                p2Var.a();
                                org.telegram.ui.ActionBar.z0 z0Var = x80Var.x;
                                int i14 = -x80Var.G;
                                x80Var.G = i14;
                                org.telegram.messenger.g0.F3(i14, z0Var, null);
                                break;
                            } else {
                                org.telegram.ui.ActionBar.z0 z0Var2 = x80Var.x;
                                boolean z11 = !z10;
                                x80Var.E = z11;
                                z0Var2.setChecked(z11);
                                w80 w80Var2 = x80Var.S;
                                boolean z12 = x80Var.E;
                                boolean z13 = x80Var.F;
                                ir0 ir0Var = w80Var2.f0;
                                if (ir0Var != null && (k6Var2 = ir0Var.s) != null) {
                                    k6Var2.n = z12;
                                    k6Var2.o = z13;
                                    k6Var2.d(true);
                                }
                                up0 up0Var = w80Var2.h0;
                                if (up0Var != null && (k6Var = up0Var.s) != null) {
                                    k6Var.n = z12;
                                    k6Var.o = z13;
                                    k6Var.d(true);
                                    break;
                                }
                            }
                            break;
                        case 3:
                            boolean z14 = x80Var.F;
                            if (z14 && !x80Var.E) {
                                p2Var.a();
                                org.telegram.ui.ActionBar.z0 z0Var3 = x80Var.y;
                                int i15 = -x80Var.G;
                                x80Var.G = i15;
                                org.telegram.messenger.g0.F3(i15, z0Var3, null);
                                break;
                            } else {
                                org.telegram.ui.ActionBar.z0 z0Var4 = x80Var.y;
                                boolean z15 = !z14;
                                x80Var.F = z15;
                                z0Var4.setChecked(z15);
                                w80 w80Var3 = x80Var.S;
                                boolean z16 = x80Var.E;
                                boolean z17 = x80Var.F;
                                ir0 ir0Var2 = w80Var3.f0;
                                if (ir0Var2 != null && (k6Var4 = ir0Var2.s) != null) {
                                    k6Var4.n = z16;
                                    k6Var4.o = z17;
                                    k6Var4.d(true);
                                }
                                up0 up0Var2 = w80Var3.h0;
                                if (up0Var2 != null && (k6Var3 = up0Var2.s) != null) {
                                    k6Var3.n = z16;
                                    k6Var3.o = z17;
                                    k6Var3.d(true);
                                    break;
                                }
                            }
                            break;
                        default:
                            x80 x80Var2 = this.b;
                            di.m6 m6Var = x80Var2.R;
                            if (m6Var != null) {
                                m6Var.run();
                                x80Var2.R = null;
                            }
                            xb.e();
                            boolean z18 = x80Var2.S.getClosestTab() == 9;
                            ArrayList arrayList = new ArrayList();
                            if (x80Var2.w != null) {
                                int i16 = 0;
                                for (int i17 = 0; i17 < x80Var2.w.size(); i17++) {
                                    TL_stories.StoryItem storyItem = ((org.telegram.messenger.gj) x80Var2.w.valueAt(i17)).l;
                                    if (storyItem != null) {
                                        arrayList.add(storyItem);
                                        i16++;
                                    }
                                }
                                i122 = i16;
                            } else {
                                i122 = 0;
                            }
                            x80Var2.S.V(false);
                            if (z18) {
                                x80Var2.S.k1(8);
                            }
                            if (!arrayList.isEmpty()) {
                                boolean[] zArr = new boolean[arrayList.size()];
                                for (int i18 = 0; i18 < arrayList.size(); i18++) {
                                    TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) arrayList.get(i18);
                                    zArr[i18] = storyItem2.pinned;
                                    storyItem2.pinned = z18;
                                }
                                x80Var2.getMessagesController().P1().q0(x80Var2.e, arrayList, false);
                                boolean[] zArr2 = {false};
                                x80Var2.R = new di.m6(x80Var2, arrayList, z18, 21);
                                org.telegram.ui.ActionBar.m5 m5Var = new org.telegram.ui.ActionBar.m5(x80Var2, zArr2, arrayList, zArr, 29);
                                (z18 ? cc.a0(x80Var2).L(R.raw.contact_check, org.telegram.messenger.hd.G(i122, "StorySavedTitle", new Object[0]), org.telegram.messenger.hd.M0(2131744484, null), org.telegram.messenger.hd.M0(2131743887, null), m5Var).j() : cc.a0(x80Var2).J(R.raw.chats_archived, org.telegram.messenger.hd.G(i122, "StoryArchived", new Object[0]), org.telegram.messenger.hd.M0(2131743887, null), 5000, false, m5Var).j()).v = new vs(23, x80Var2, zArr2);
                                break;
                            }
                            break;
                    }
                }
            });
            org.telegram.ui.ActionBar.d5 d5Var2 = this.s;
            org.telegram.ui.ActionBar.z0 d2 = d5Var2.d(7, 0, null, org.telegram.messenger.hd.M0(2131748652, null), true, true, d5Var2.n0);
            this.y = d2;
            d2.setChecked(this.F);
            this.y.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.u80
                public final /* synthetic */ x80 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    fi.k6 k6Var;
                    fi.k6 k6Var2;
                    fi.k6 k6Var3;
                    fi.k6 k6Var4;
                    int i122;
                    int i13 = i11;
                    org.telegram.messenger.p2 p2Var = org.telegram.messenger.p2.E;
                    x80 x80Var = this.b;
                    switch (i13) {
                        case 0:
                            Boolean Q1 = x80Var.S.Q1(null, null);
                            if (Q1 != null) {
                                x80Var.i0(true, Q1.booleanValue());
                                break;
                            }
                            break;
                        case 1:
                            Boolean R1 = x80Var.S.R1(null, null);
                            if (R1 != null) {
                                x80Var.i0(R1.booleanValue(), true);
                                break;
                            }
                            break;
                        case 2:
                            boolean z10 = x80Var.E;
                            if (z10 && !x80Var.F) {
                                p2Var.a();
                                org.telegram.ui.ActionBar.z0 z0Var = x80Var.x;
                                int i14 = -x80Var.G;
                                x80Var.G = i14;
                                org.telegram.messenger.g0.F3(i14, z0Var, null);
                                break;
                            } else {
                                org.telegram.ui.ActionBar.z0 z0Var2 = x80Var.x;
                                boolean z11 = !z10;
                                x80Var.E = z11;
                                z0Var2.setChecked(z11);
                                w80 w80Var2 = x80Var.S;
                                boolean z12 = x80Var.E;
                                boolean z13 = x80Var.F;
                                ir0 ir0Var = w80Var2.f0;
                                if (ir0Var != null && (k6Var2 = ir0Var.s) != null) {
                                    k6Var2.n = z12;
                                    k6Var2.o = z13;
                                    k6Var2.d(true);
                                }
                                up0 up0Var = w80Var2.h0;
                                if (up0Var != null && (k6Var = up0Var.s) != null) {
                                    k6Var.n = z12;
                                    k6Var.o = z13;
                                    k6Var.d(true);
                                    break;
                                }
                            }
                            break;
                        case 3:
                            boolean z14 = x80Var.F;
                            if (z14 && !x80Var.E) {
                                p2Var.a();
                                org.telegram.ui.ActionBar.z0 z0Var3 = x80Var.y;
                                int i15 = -x80Var.G;
                                x80Var.G = i15;
                                org.telegram.messenger.g0.F3(i15, z0Var3, null);
                                break;
                            } else {
                                org.telegram.ui.ActionBar.z0 z0Var4 = x80Var.y;
                                boolean z15 = !z14;
                                x80Var.F = z15;
                                z0Var4.setChecked(z15);
                                w80 w80Var3 = x80Var.S;
                                boolean z16 = x80Var.E;
                                boolean z17 = x80Var.F;
                                ir0 ir0Var2 = w80Var3.f0;
                                if (ir0Var2 != null && (k6Var4 = ir0Var2.s) != null) {
                                    k6Var4.n = z16;
                                    k6Var4.o = z17;
                                    k6Var4.d(true);
                                }
                                up0 up0Var2 = w80Var3.h0;
                                if (up0Var2 != null && (k6Var3 = up0Var2.s) != null) {
                                    k6Var3.n = z16;
                                    k6Var3.o = z17;
                                    k6Var3.d(true);
                                    break;
                                }
                            }
                            break;
                        default:
                            x80 x80Var2 = this.b;
                            di.m6 m6Var = x80Var2.R;
                            if (m6Var != null) {
                                m6Var.run();
                                x80Var2.R = null;
                            }
                            xb.e();
                            boolean z18 = x80Var2.S.getClosestTab() == 9;
                            ArrayList arrayList = new ArrayList();
                            if (x80Var2.w != null) {
                                int i16 = 0;
                                for (int i17 = 0; i17 < x80Var2.w.size(); i17++) {
                                    TL_stories.StoryItem storyItem = ((org.telegram.messenger.gj) x80Var2.w.valueAt(i17)).l;
                                    if (storyItem != null) {
                                        arrayList.add(storyItem);
                                        i16++;
                                    }
                                }
                                i122 = i16;
                            } else {
                                i122 = 0;
                            }
                            x80Var2.S.V(false);
                            if (z18) {
                                x80Var2.S.k1(8);
                            }
                            if (!arrayList.isEmpty()) {
                                boolean[] zArr = new boolean[arrayList.size()];
                                for (int i18 = 0; i18 < arrayList.size(); i18++) {
                                    TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) arrayList.get(i18);
                                    zArr[i18] = storyItem2.pinned;
                                    storyItem2.pinned = z18;
                                }
                                x80Var2.getMessagesController().P1().q0(x80Var2.e, arrayList, false);
                                boolean[] zArr2 = {false};
                                x80Var2.R = new di.m6(x80Var2, arrayList, z18, 21);
                                org.telegram.ui.ActionBar.m5 m5Var = new org.telegram.ui.ActionBar.m5(x80Var2, zArr2, arrayList, zArr, 29);
                                (z18 ? cc.a0(x80Var2).L(R.raw.contact_check, org.telegram.messenger.hd.G(i122, "StorySavedTitle", new Object[0]), org.telegram.messenger.hd.M0(2131744484, null), org.telegram.messenger.hd.M0(2131743887, null), m5Var).j() : cc.a0(x80Var2).J(R.raw.chats_archived, org.telegram.messenger.hd.G(i122, "StoryArchived", new Object[0]), org.telegram.messenger.hd.M0(2131743887, null), 5000, false, m5Var).j()).v = new vs(23, x80Var2, zArr2);
                                break;
                            }
                            break;
                    }
                }
            });
        }
        int i13 = this.a;
        qh.b[] bVarArr = this.L;
        if (i13 == 1) {
            org.telegram.ui.le0 le0Var = new org.telegram.ui.le0(context, getResourceProvider());
            this.K = le0Var;
            le0Var.setClipChildren(false);
            this.K.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f));
            bVarArr[0] = qh.b.c(context, getResourceProvider(), qh.a.R, 2131746651);
            bVarArr[1] = qh.b.c(context, getResourceProvider(), qh.a.S, 2131746627);
            for (int i14 = 0; i14 < bVarArr.length; i14++) {
                bVarArr[i14].setOnClickListener(new ci.q(this, i14, 14));
                this.K.addView(bVarArr[i14]);
                this.K.i(bVarArr[i14], true, false);
            }
            aVar = baseSimpleGlass;
            fh.g c10 = aVar.c.c(this.K, c8.g0.f(getResourceProvider()), false);
            org.telegram.messenger.i20.r(c10, org.telegram.messenger.g0.L(28.0f), 7.666f);
            this.K.setBackground(c10);
            g2Var.addView(this.K, c8.ja.e(-2, 72, 81));
            FrameLayout frameLayout = new FrameLayout(context);
            this.N = frameLayout;
            frameLayout.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(8.0f));
            hi.d dVar = new hi.d(context, getResourceProvider(), true);
            this.O = dVar;
            dVar.i(org.telegram.messenger.hd.M0(2131745909, null), false, true);
            this.O.setShowZero(true);
            this.O.c(0, false);
            this.O.setEnabled(false);
            final int i15 = 4;
            this.O.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.u80
                public final /* synthetic */ x80 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    fi.k6 k6Var;
                    fi.k6 k6Var2;
                    fi.k6 k6Var3;
                    fi.k6 k6Var4;
                    int i122;
                    int i132 = i15;
                    org.telegram.messenger.p2 p2Var = org.telegram.messenger.p2.E;
                    x80 x80Var = this.b;
                    switch (i132) {
                        case 0:
                            Boolean Q1 = x80Var.S.Q1(null, null);
                            if (Q1 != null) {
                                x80Var.i0(true, Q1.booleanValue());
                                break;
                            }
                            break;
                        case 1:
                            Boolean R1 = x80Var.S.R1(null, null);
                            if (R1 != null) {
                                x80Var.i0(R1.booleanValue(), true);
                                break;
                            }
                            break;
                        case 2:
                            boolean z10 = x80Var.E;
                            if (z10 && !x80Var.F) {
                                p2Var.a();
                                org.telegram.ui.ActionBar.z0 z0Var = x80Var.x;
                                int i142 = -x80Var.G;
                                x80Var.G = i142;
                                org.telegram.messenger.g0.F3(i142, z0Var, null);
                                break;
                            } else {
                                org.telegram.ui.ActionBar.z0 z0Var2 = x80Var.x;
                                boolean z11 = !z10;
                                x80Var.E = z11;
                                z0Var2.setChecked(z11);
                                w80 w80Var2 = x80Var.S;
                                boolean z12 = x80Var.E;
                                boolean z13 = x80Var.F;
                                ir0 ir0Var = w80Var2.f0;
                                if (ir0Var != null && (k6Var2 = ir0Var.s) != null) {
                                    k6Var2.n = z12;
                                    k6Var2.o = z13;
                                    k6Var2.d(true);
                                }
                                up0 up0Var = w80Var2.h0;
                                if (up0Var != null && (k6Var = up0Var.s) != null) {
                                    k6Var.n = z12;
                                    k6Var.o = z13;
                                    k6Var.d(true);
                                    break;
                                }
                            }
                            break;
                        case 3:
                            boolean z14 = x80Var.F;
                            if (z14 && !x80Var.E) {
                                p2Var.a();
                                org.telegram.ui.ActionBar.z0 z0Var3 = x80Var.y;
                                int i152 = -x80Var.G;
                                x80Var.G = i152;
                                org.telegram.messenger.g0.F3(i152, z0Var3, null);
                                break;
                            } else {
                                org.telegram.ui.ActionBar.z0 z0Var4 = x80Var.y;
                                boolean z15 = !z14;
                                x80Var.F = z15;
                                z0Var4.setChecked(z15);
                                w80 w80Var3 = x80Var.S;
                                boolean z16 = x80Var.E;
                                boolean z17 = x80Var.F;
                                ir0 ir0Var2 = w80Var3.f0;
                                if (ir0Var2 != null && (k6Var4 = ir0Var2.s) != null) {
                                    k6Var4.n = z16;
                                    k6Var4.o = z17;
                                    k6Var4.d(true);
                                }
                                up0 up0Var2 = w80Var3.h0;
                                if (up0Var2 != null && (k6Var3 = up0Var2.s) != null) {
                                    k6Var3.n = z16;
                                    k6Var3.o = z17;
                                    k6Var3.d(true);
                                    break;
                                }
                            }
                            break;
                        default:
                            x80 x80Var2 = this.b;
                            di.m6 m6Var = x80Var2.R;
                            if (m6Var != null) {
                                m6Var.run();
                                x80Var2.R = null;
                            }
                            xb.e();
                            boolean z18 = x80Var2.S.getClosestTab() == 9;
                            ArrayList arrayList = new ArrayList();
                            if (x80Var2.w != null) {
                                int i16 = 0;
                                for (int i17 = 0; i17 < x80Var2.w.size(); i17++) {
                                    TL_stories.StoryItem storyItem = ((org.telegram.messenger.gj) x80Var2.w.valueAt(i17)).l;
                                    if (storyItem != null) {
                                        arrayList.add(storyItem);
                                        i16++;
                                    }
                                }
                                i122 = i16;
                            } else {
                                i122 = 0;
                            }
                            x80Var2.S.V(false);
                            if (z18) {
                                x80Var2.S.k1(8);
                            }
                            if (!arrayList.isEmpty()) {
                                boolean[] zArr = new boolean[arrayList.size()];
                                for (int i18 = 0; i18 < arrayList.size(); i18++) {
                                    TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) arrayList.get(i18);
                                    zArr[i18] = storyItem2.pinned;
                                    storyItem2.pinned = z18;
                                }
                                x80Var2.getMessagesController().P1().q0(x80Var2.e, arrayList, false);
                                boolean[] zArr2 = {false};
                                x80Var2.R = new di.m6(x80Var2, arrayList, z18, 21);
                                org.telegram.ui.ActionBar.m5 m5Var = new org.telegram.ui.ActionBar.m5(x80Var2, zArr2, arrayList, zArr, 29);
                                (z18 ? cc.a0(x80Var2).L(R.raw.contact_check, org.telegram.messenger.hd.G(i122, "StorySavedTitle", new Object[0]), org.telegram.messenger.hd.M0(2131744484, null), org.telegram.messenger.hd.M0(2131743887, null), m5Var).j() : cc.a0(x80Var2).J(R.raw.chats_archived, org.telegram.messenger.hd.G(i122, "StoryArchived", new Object[0]), org.telegram.messenger.hd.M0(2131743887, null), 5000, false, m5Var).j()).v = new vs(23, x80Var2, zArr2);
                                break;
                            }
                            break;
                    }
                }
            });
            this.N.addView(this.O, c8.ja.c(56.0f, -1));
            this.N.setVisibility(4);
            g2Var.addView(this.N, c8.ja.e(-1, 72, 80));
            this.P = new te.a(0, new gx(this, 8), er.h, 320L, false);
            setBulletinDelegate(new bi.e1(this, 9));
        } else {
            aVar = baseSimpleGlass;
        }
        View view = new View(context);
        this.Q = view;
        this.S.z(view);
        View view2 = this.Q;
        view2.setBackground(aVar.a(view2));
        View view3 = new View(context);
        this.navigationBarFadeView = view3;
        view3.setBackground(aVar.b(view3));
        View view4 = this.navigationBarFadeView;
        org.telegram.ui.le0 le0Var2 = this.K;
        g2Var.addView(view4, le0Var2 != null ? g2Var.indexOfChild(le0Var2) : g2Var.getChildCount(), c8.ja.e(-1, 0, 80));
        org.telegram.ui.ActionBar.w4 w4Var = this.simpleActionBar;
        org.telegram.ui.ActionBar.e6 resourceProvider = getResourceProvider();
        aVar.m = g2Var;
        aVar.n = null;
        aVar.g(g2Var, w4Var, resourceProvider);
        aVar.o = new di.f(5, this, g2Var);
        this.S.setPagesGlassEngine(this.glassEngine);
        this.simpleActionBar.setBackground(null);
        h0(false);
        if (this.a == 3 && (i7 = this.r) != -1) {
            this.simpleActionBar.setSubtitle(org.telegram.messenger.hd.H(' ', "FoundStories", i7));
        }
        b0();
        g0();
        if (this.a == 1) {
            r13 = this.T != 9 ? 0 : 1;
            org.telegram.ui.le0 le0Var3 = this.K;
            if (le0Var3 != null && this.M != r13) {
                this.M = r13;
                le0Var3.q(bVarArr[r13], false);
            }
        }
        return g2Var;
    }

    public final boolean d0() {
        int i7 = this.a;
        return i7 == 1 || i7 == 2;
    }

    @Override // org.telegram.messenger.is
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.ns.E0 && ((Long) objArr[0]).longValue() == this.e) {
            TLRPC.UserFull userFull = (TLRPC.UserFull) objArr[1];
            this.d = userFull;
            w80 w80Var = this.S;
            if (w80Var != null) {
                w80Var.setUserInfo(userFull);
            }
        }
    }

    public final void e0(TLRPC.ChatFull chatFull) {
        this.c = chatFull;
    }

    public final void f0(String str) {
        this.simpleActionBar.setSubtitleAnimated(str);
    }

    public final void g0() {
        int i7;
        w80 w80Var = this.S;
        if (w80Var == null || this.simpleActionBar == null) {
            return;
        }
        int closestTab = w80Var.getClosestTab();
        if (this.a != 3 || closestTab == 8) {
            int[] iArr = this.b.c;
            boolean z10 = org.telegram.messenger.hd.a0;
            if (closestTab == 8 || closestTab == 9) {
                org.telegram.ui.ActionBar.z0 z0Var = this.J;
                if (z0Var != null) {
                    z0Var.setEnabled(this.S.K());
                    org.telegram.ui.ActionBar.z0 z0Var2 = this.J;
                    z0Var2.setAlpha(z0Var2.isEnabled() ? 1.0f : 0.5f);
                }
                org.telegram.ui.ActionBar.z0 z0Var3 = this.I;
                if (z0Var3 != null) {
                    z0Var3.setEnabled(this.S.J());
                    org.telegram.ui.ActionBar.z0 z0Var4 = this.I;
                    z0Var4.setAlpha(z0Var4.isEnabled() ? 1.0f : 0.5f);
                }
                int m0 = this.S.m0(closestTab);
                if (this.a == 3) {
                    if (m0 > 0) {
                        f0(org.telegram.messenger.hd.H(' ', "FoundStories", m0));
                    }
                } else if (closestTab == 8) {
                    f0(m0 > 0 ? org.telegram.messenger.hd.G(m0, "ProfileMyStoriesCount", new Object[0]) : null);
                } else {
                    f0(m0 > 0 ? org.telegram.messenger.hd.G(m0, "ProfileStoriesArchiveCount", new Object[0]) : null);
                }
                h0(true);
                org.telegram.ui.ActionBar.d5 d5Var = this.s;
                if (d5Var != null) {
                    d5Var.Z(m0 > 0, true);
                }
                hi.d dVar = this.O;
                if (dVar != null) {
                    boolean z11 = !z10 && this.V == closestTab;
                    if (closestTab == 8) {
                        SparseArray sparseArray = this.w;
                        dVar.i(org.telegram.messenger.hd.G(sparseArray == null ? 0 : sparseArray.size(), "ArchiveStories", new Object[0]), z11, true);
                    } else {
                        dVar.i(org.telegram.messenger.hd.M0(2131745909, null), z11, true);
                    }
                    this.V = closestTab;
                }
                org.telegram.ui.ActionBar.z0 z0Var5 = this.H;
                if (z0Var5 != null) {
                    boolean z12 = m0 > 0;
                    z0Var5.setEnabled(z12);
                    this.H.setAlpha(z12 ? 1.0f : 0.5f);
                    return;
                }
                return;
            }
            if (closestTab == 11) {
                f0(org.telegram.messenger.hd.G(getMessagesController().G1().c(), "SavedDialogsTabCount", new Object[0]));
                return;
            }
            if (closestTab >= 0) {
                if (closestTab >= iArr.length || iArr[closestTab] >= 0) {
                    if (closestTab == 0) {
                        if (this.S.getPhotosVideosTypeFilter() == 1) {
                            f0(org.telegram.messenger.hd.G(iArr[6], "Photos", new Object[0]));
                            return;
                        } else if (this.S.getPhotosVideosTypeFilter() == 2) {
                            f0(org.telegram.messenger.hd.G(iArr[7], "Videos", new Object[0]));
                            return;
                        } else {
                            f0(org.telegram.messenger.hd.G(iArr[0], "Media", new Object[0]));
                            return;
                        }
                    }
                    if (closestTab == 1) {
                        f0(org.telegram.messenger.hd.G(iArr[1], "Files", new Object[0]));
                        return;
                    }
                    if (closestTab == 2) {
                        f0(org.telegram.messenger.hd.G(iArr[2], "Voice", new Object[0]));
                        return;
                    }
                    if (closestTab == 3) {
                        f0(org.telegram.messenger.hd.G(iArr[3], "Links", new Object[0]));
                        return;
                    }
                    if (closestTab == 4) {
                        f0(org.telegram.messenger.hd.G(iArr[4], "MusicFiles", new Object[0]));
                        return;
                    }
                    if (closestTab == 5) {
                        f0(org.telegram.messenger.hd.G(iArr[5], "GIFs", new Object[0]));
                        return;
                    }
                    if (closestTab == 15 && (i7 = iArr[8]) >= 0) {
                        f0(org.telegram.messenger.hd.G(i7, "ProfilePollsCount", new Object[0]));
                    } else if (closestTab == 10) {
                        org.telegram.messenger.oo L0 = org.telegram.messenger.np.s1(this.currentAccount).L0(this.e);
                        f0(org.telegram.messenger.hd.G(L0 == null ? 0 : L0.b.size() + L0.c, "Channels", new Object[0]));
                    }
                }
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final int getNavigationBarColor() {
        int navigationBarColor = super.getNavigationBarColor();
        return (getLastStoryViewer() == null || !getLastStoryViewer().y()) ? navigationBarColor : getLastStoryViewer().e(navigationBarColor);
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.S.getThemeDescriptions());
        return arrayList;
    }

    public final void h0(boolean z10) {
        String str;
        int i7 = this.a;
        boolean z11 = true;
        if (i7 == 3) {
            str = this.h;
        } else {
            if (i7 == 2) {
                str = org.telegram.messenger.hd.M0(2131746634, null);
            } else if (i7 == 1) {
                w80 w80Var = this.S;
                if (w80Var != null && w80Var.getClosestTab() != 9) {
                    z11 = false;
                }
                str = org.telegram.messenger.hd.M0(z11 ? 2131746634 : 2131746655, null);
            } else {
                long j3 = (this.f == 0 || this.e != getUserConfig().e()) ? this.e : this.f;
                if (j3 == 2666000) {
                    str = org.telegram.messenger.hd.M0(2131754252, null);
                } else if (this.f != 0 && j3 == getUserConfig().e()) {
                    str = org.telegram.messenger.hd.M0(2131748303, null);
                } else if (org.telegram.messenger.m5.C(j3)) {
                    TLRPC.EncryptedChat a12 = getMessagesController().a1(Integer.valueOf((int) (j3 & 4294967295L)));
                    TLRPC.User a22 = a12 != null ? getMessagesController().a2(Long.valueOf(a12.user_id)) : null;
                    if (a22 != null) {
                        str = org.telegram.messenger.g5.m(0, a22.first_name, a22.last_name);
                    }
                    str = null;
                } else if (org.telegram.messenger.m5.E(j3)) {
                    TLRPC.User a23 = getMessagesController().a2(Long.valueOf(j3));
                    if (a23 != null) {
                        str = a23.self ? org.telegram.messenger.hd.M0(2131745901, null) : org.telegram.messenger.g5.m(0, a23.first_name, a23.last_name);
                    }
                    str = null;
                } else {
                    TLRPC.Chat M0 = getMessagesController().M0(Long.valueOf(-j3));
                    if (M0 != null) {
                        str = M0.title;
                    }
                    str = null;
                }
                if (TextUtils.isEmpty(str)) {
                    str = org.telegram.messenger.hd.M0(2131745415, null);
                }
            }
        }
        String str2 = str;
        boolean z12 = z11;
        if (TextUtils.equals(this.U, str2)) {
            return;
        }
        this.U = str2;
        if (!z10) {
            this.simpleActionBar.setTitle(str2);
            return;
        }
        org.telegram.ui.ActionBar.w4 w4Var = this.simpleActionBar;
        w4Var.getClass();
        w4Var.D(str2, z12, 320L, er.h);
    }

    public final void i0(boolean z10, boolean z11) {
        this.J.setEnabled(z10);
        this.J.animate().alpha(z10 ? 1.0f : 0.5f).start();
        this.I.setEnabled(z11);
        this.I.animate().alpha(z11 ? 1.0f : 0.5f).start();
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        if (!this.S.K0()) {
            return false;
        }
        w80 w80Var = this.S;
        return w80Var.getSelectedTab() == w80Var.L0.getFirstTabId();
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final boolean onBackPressed(boolean z10) {
        if (!hasShownSheet()) {
            w80 w80Var = this.S;
            if (!w80Var.F1) {
                return super.onBackPressed(z10);
            }
            if (z10) {
                w80Var.V(false);
            }
        } else if (z10) {
            closeSheet();
            return false;
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final boolean onFragmentCreate() {
        this.a = getArguments().getInt(TeXSymbolParser.TYPE_ATTR, 0);
        this.e = getArguments().getLong("dialog_id");
        this.f = getArguments().getLong("topic_id", 0L);
        this.h = getArguments().getString("hashtag", "");
        this.n = getArguments().getString("username", "");
        this.r = getArguments().getInt("storiesCount", -1);
        int i7 = this.a;
        this.T = getArguments().getInt("start_from", i7 == 2 ? 9 : i7 == 1 ? 8 : 0);
        getNotificationCenter().c(this, org.telegram.messenger.ns.E0);
        getNotificationCenter().c(this, org.telegram.messenger.ns.f5);
        getNotificationCenter().c(this, org.telegram.messenger.ns.Z2);
        if (org.telegram.messenger.m5.E(this.e) && this.f == 0) {
            TLRPC.User a22 = getMessagesController().a2(Long.valueOf(this.e));
            if (org.telegram.messenger.q10.B(a22)) {
                getMessagesController().g3(a22, false, this.classGuid);
                this.d = getMessagesController().b2(this.e);
            }
        }
        if (this.b == null) {
            this.b = new qs0(this);
        }
        this.b.y.add(this);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().n(this, org.telegram.messenger.ns.E0);
        getNotificationCenter().n(this, org.telegram.messenger.ns.f5);
        getNotificationCenter().n(this, org.telegram.messenger.ns.Z2);
        di.m6 m6Var = this.R;
        if (m6Var != null) {
            this.R = null;
            org.telegram.messenger.g0.h3(m6Var);
        }
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final void onInsets(int i7, int i10, int i11, int i12) {
        b0();
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final boolean useSimpleActionBar() {
        return true;
    }
}
