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

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class k90 extends org.telegram.ui.ActionBar.g2 implements ct0, pg.b, org.telegram.messenger.fs {
    public boolean E;
    public boolean F;
    public int G;
    public org.telegram.ui.ActionBar.y0 H;
    public org.telegram.ui.ActionBar.y0 I;
    public org.telegram.ui.ActionBar.y0 J;
    public org.telegram.ui.oe0 K;
    public final qh.b[] L;
    public int M;
    public FrameLayout N;
    public hi.e O;
    public te.a P;
    public View Q;
    public di.p6 R;
    public j90 S;
    public int T;
    public String U;
    public int V;
    public int a;
    public bt0 b;
    public TLRPC.ChatFull c;
    public TLRPC.UserFull d;
    public long e;
    public long f;
    public String h;
    public String n;
    public int r;
    public org.telegram.ui.ActionBar.g5 s;
    public SparseArray w;
    public org.telegram.ui.ActionBar.y0 x;
    public org.telegram.ui.ActionBar.y0 y;

    public k90(Bundle bundle, bt0 bt0Var) {
        super(bundle);
        this.E = true;
        this.F = true;
        this.G = -12;
        this.L = new qh.b[2];
        this.M = -1;
        this.b = bt0Var;
    }

    @Override // pg.b
    public final List F() {
        Activity parentActivity = getParentActivity();
        org.telegram.messenger.r5 r5Var = sg.b1.m;
        return Arrays.asList(new pg.a((parentActivity.getSharedPreferences("shapedetector_conf", 0).getBoolean("learning", false) ? "Disable" : "Enable").concat(" shape detector learning debug"), new g90(this, 1)));
    }

    @Override // org.telegram.ui.Components.ct0
    public final void R() {
        bt0 bt0Var;
        j90 j90Var = this.S;
        if (j90Var != null && (bt0Var = this.b) != null) {
            j90Var.setNewMediaCounts(bt0Var.c);
        }
        g0();
    }

    public final void b0() {
        if (this.S == null) {
            return;
        }
        int i7 = 0;
        int L = this.K != null ? org.telegram.messenger.g0.L(72.0f) : 0;
        j90 j90Var = this.S;
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + this.mSystemInsets.b;
        int[] iArr = jt0.t2;
        j90Var.n1(ri.a.d(currentActionBarHeight - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - org.telegram.messenger.g0.L(6.666f), ri.a.c(this.mSystemInsets.b), ri.a.c(this.mSystemInsets.d + L), this.mSystemInsets.d + L);
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

    @Override // org.telegram.ui.ActionBar.g2
    public final boolean canBeginSlide() {
        if (this.S.K0()) {
            return super.canBeginSlide();
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final View createView(Context context) {
        ri.a aVar;
        int i7;
        setHasOwnBackground(true);
        final int i10 = 0;
        this.simpleActionBar.setBackButtonDrawable(new org.telegram.ui.ActionBar.x1(false));
        this.simpleActionBar.setActionBarMenuOnItemClick(new org.telegram.ui.x7(this, 17));
        bi.e3 e3Var = new bi.e3(22, context, this);
        this.fragmentView = e3Var;
        if (this.a == 0 && this.e == getUserConfig().e() && this.f == 0 && !getMessagesController().I1().b && getMessagesController().I1().e()) {
            this.T = 11;
        }
        ri.a baseSimpleGlass = getBaseSimpleGlass();
        j90 j90Var = new j90(this, context, this.e, this.b, this.c, this.d, this.T, this, new i90(this), getResourceProvider(), baseSimpleGlass.c);
        this.S = j90Var;
        j90Var.setOnTopPanelShiftChanged(new g90(this, i10));
        this.S.L0.setOpen(true);
        this.S.setPinnedToTop(true);
        e3Var.addView(this.S, c8.ma.c(-1.0f, -1));
        final int i11 = 3;
        if (d0()) {
            org.telegram.ui.ActionBar.g5 b10 = this.simpleActionBar.t().b(0, R.drawable.ic_ab_other);
            this.s = b10;
            b10.setContentDescription(org.telegram.messenger.gd.N0(2131754838, null));
            this.s.Z(false, false);
            org.telegram.ui.ActionBar.y0 e10 = this.s.e(8, R.drawable.msg_zoomin, org.telegram.messenger.gd.N0(2131748457, null));
            this.I = e10;
            e10.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.h90
                public final /* synthetic */ k90 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    fi.h6 h6Var;
                    fi.h6 h6Var2;
                    fi.h6 h6Var3;
                    fi.h6 h6Var4;
                    int i12;
                    int i13 = i10;
                    org.telegram.messenger.q2 q2Var = org.telegram.messenger.q2.E;
                    k90 k90Var = this.b;
                    switch (i13) {
                        case 0:
                            Boolean Q1 = k90Var.S.Q1(null, null);
                            if (Q1 != null) {
                                k90Var.i0(true, Q1.booleanValue());
                                break;
                            }
                            break;
                        case 1:
                            Boolean R1 = k90Var.S.R1(null, null);
                            if (R1 != null) {
                                k90Var.i0(R1.booleanValue(), true);
                                break;
                            }
                            break;
                        case 2:
                            boolean z10 = k90Var.E;
                            if (z10 && !k90Var.F) {
                                q2Var.a();
                                org.telegram.ui.ActionBar.y0 y0Var = k90Var.x;
                                int i14 = -k90Var.G;
                                k90Var.G = i14;
                                org.telegram.messenger.g0.E3(i14, y0Var, null);
                                break;
                            } else {
                                org.telegram.ui.ActionBar.y0 y0Var2 = k90Var.x;
                                boolean z11 = !z10;
                                k90Var.E = z11;
                                y0Var2.setChecked(z11);
                                j90 j90Var2 = k90Var.S;
                                boolean z12 = k90Var.E;
                                boolean z13 = k90Var.F;
                                sr0 sr0Var = j90Var2.f0;
                                if (sr0Var != null && (h6Var2 = sr0Var.s) != null) {
                                    h6Var2.n = z12;
                                    h6Var2.o = z13;
                                    h6Var2.d(true);
                                }
                                eq0 eq0Var = j90Var2.h0;
                                if (eq0Var != null && (h6Var = eq0Var.s) != null) {
                                    h6Var.n = z12;
                                    h6Var.o = z13;
                                    h6Var.d(true);
                                    break;
                                }
                            }
                            break;
                        case 3:
                            boolean z14 = k90Var.F;
                            if (z14 && !k90Var.E) {
                                q2Var.a();
                                org.telegram.ui.ActionBar.y0 y0Var3 = k90Var.y;
                                int i15 = -k90Var.G;
                                k90Var.G = i15;
                                org.telegram.messenger.g0.E3(i15, y0Var3, null);
                                break;
                            } else {
                                org.telegram.ui.ActionBar.y0 y0Var4 = k90Var.y;
                                boolean z15 = !z14;
                                k90Var.F = z15;
                                y0Var4.setChecked(z15);
                                j90 j90Var3 = k90Var.S;
                                boolean z16 = k90Var.E;
                                boolean z17 = k90Var.F;
                                sr0 sr0Var2 = j90Var3.f0;
                                if (sr0Var2 != null && (h6Var4 = sr0Var2.s) != null) {
                                    h6Var4.n = z16;
                                    h6Var4.o = z17;
                                    h6Var4.d(true);
                                }
                                eq0 eq0Var2 = j90Var3.h0;
                                if (eq0Var2 != null && (h6Var3 = eq0Var2.s) != null) {
                                    h6Var3.n = z16;
                                    h6Var3.o = z17;
                                    h6Var3.d(true);
                                    break;
                                }
                            }
                            break;
                        default:
                            k90 k90Var2 = this.b;
                            di.p6 p6Var = k90Var2.R;
                            if (p6Var != null) {
                                p6Var.run();
                                k90Var2.R = null;
                            }
                            gc.e();
                            boolean z18 = k90Var2.S.getClosestTab() == 9;
                            ArrayList arrayList = new ArrayList();
                            if (k90Var2.w != null) {
                                int i16 = 0;
                                for (int i17 = 0; i17 < k90Var2.w.size(); i17++) {
                                    TL_stories.StoryItem storyItem = ((org.telegram.messenger.fj) k90Var2.w.valueAt(i17)).l;
                                    if (storyItem != null) {
                                        arrayList.add(storyItem);
                                        i16++;
                                    }
                                }
                                i12 = i16;
                            } else {
                                i12 = 0;
                            }
                            k90Var2.S.V(false);
                            if (z18) {
                                k90Var2.S.k1(8);
                            }
                            if (!arrayList.isEmpty()) {
                                boolean[] zArr = new boolean[arrayList.size()];
                                for (int i18 = 0; i18 < arrayList.size(); i18++) {
                                    TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) arrayList.get(i18);
                                    zArr[i18] = storyItem2.pinned;
                                    storyItem2.pinned = z18;
                                }
                                k90Var2.getMessagesController().R1().q0(k90Var2.e, arrayList, false);
                                boolean[] zArr2 = {false};
                                int i19 = 21;
                                k90Var2.R = new di.p6(k90Var2, arrayList, z18, i19);
                                q20 q20Var = new q20(k90Var2, zArr2, arrayList, zArr, 3);
                                (z18 ? lc.b0(k90Var2).L(R.raw.contact_check, org.telegram.messenger.gd.G(i12, "StorySavedTitle", new Object[0]), org.telegram.messenger.gd.N0(2131744243, null), org.telegram.messenger.gd.N0(2131743644, null), q20Var).j() : lc.b0(k90Var2).J(R.raw.chats_archived, org.telegram.messenger.gd.G(i12, "StoryArchived", new Object[0]), org.telegram.messenger.gd.N0(2131743644, null), 5000, false, q20Var).j()).v = new ou(i19, k90Var2, zArr2);
                                break;
                            }
                            break;
                    }
                }
            });
            org.telegram.ui.ActionBar.y0 e11 = this.s.e(9, R.drawable.msg_zoomout, org.telegram.messenger.gd.N0(2131748456, null));
            this.J = e11;
            e11.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.h90
                public final /* synthetic */ k90 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    fi.h6 h6Var;
                    fi.h6 h6Var2;
                    fi.h6 h6Var3;
                    fi.h6 h6Var4;
                    int i12;
                    int i13 = r2;
                    org.telegram.messenger.q2 q2Var = org.telegram.messenger.q2.E;
                    k90 k90Var = this.b;
                    switch (i13) {
                        case 0:
                            Boolean Q1 = k90Var.S.Q1(null, null);
                            if (Q1 != null) {
                                k90Var.i0(true, Q1.booleanValue());
                                break;
                            }
                            break;
                        case 1:
                            Boolean R1 = k90Var.S.R1(null, null);
                            if (R1 != null) {
                                k90Var.i0(R1.booleanValue(), true);
                                break;
                            }
                            break;
                        case 2:
                            boolean z10 = k90Var.E;
                            if (z10 && !k90Var.F) {
                                q2Var.a();
                                org.telegram.ui.ActionBar.y0 y0Var = k90Var.x;
                                int i14 = -k90Var.G;
                                k90Var.G = i14;
                                org.telegram.messenger.g0.E3(i14, y0Var, null);
                                break;
                            } else {
                                org.telegram.ui.ActionBar.y0 y0Var2 = k90Var.x;
                                boolean z11 = !z10;
                                k90Var.E = z11;
                                y0Var2.setChecked(z11);
                                j90 j90Var2 = k90Var.S;
                                boolean z12 = k90Var.E;
                                boolean z13 = k90Var.F;
                                sr0 sr0Var = j90Var2.f0;
                                if (sr0Var != null && (h6Var2 = sr0Var.s) != null) {
                                    h6Var2.n = z12;
                                    h6Var2.o = z13;
                                    h6Var2.d(true);
                                }
                                eq0 eq0Var = j90Var2.h0;
                                if (eq0Var != null && (h6Var = eq0Var.s) != null) {
                                    h6Var.n = z12;
                                    h6Var.o = z13;
                                    h6Var.d(true);
                                    break;
                                }
                            }
                            break;
                        case 3:
                            boolean z14 = k90Var.F;
                            if (z14 && !k90Var.E) {
                                q2Var.a();
                                org.telegram.ui.ActionBar.y0 y0Var3 = k90Var.y;
                                int i15 = -k90Var.G;
                                k90Var.G = i15;
                                org.telegram.messenger.g0.E3(i15, y0Var3, null);
                                break;
                            } else {
                                org.telegram.ui.ActionBar.y0 y0Var4 = k90Var.y;
                                boolean z15 = !z14;
                                k90Var.F = z15;
                                y0Var4.setChecked(z15);
                                j90 j90Var3 = k90Var.S;
                                boolean z16 = k90Var.E;
                                boolean z17 = k90Var.F;
                                sr0 sr0Var2 = j90Var3.f0;
                                if (sr0Var2 != null && (h6Var4 = sr0Var2.s) != null) {
                                    h6Var4.n = z16;
                                    h6Var4.o = z17;
                                    h6Var4.d(true);
                                }
                                eq0 eq0Var2 = j90Var3.h0;
                                if (eq0Var2 != null && (h6Var3 = eq0Var2.s) != null) {
                                    h6Var3.n = z16;
                                    h6Var3.o = z17;
                                    h6Var3.d(true);
                                    break;
                                }
                            }
                            break;
                        default:
                            k90 k90Var2 = this.b;
                            di.p6 p6Var = k90Var2.R;
                            if (p6Var != null) {
                                p6Var.run();
                                k90Var2.R = null;
                            }
                            gc.e();
                            boolean z18 = k90Var2.S.getClosestTab() == 9;
                            ArrayList arrayList = new ArrayList();
                            if (k90Var2.w != null) {
                                int i16 = 0;
                                for (int i17 = 0; i17 < k90Var2.w.size(); i17++) {
                                    TL_stories.StoryItem storyItem = ((org.telegram.messenger.fj) k90Var2.w.valueAt(i17)).l;
                                    if (storyItem != null) {
                                        arrayList.add(storyItem);
                                        i16++;
                                    }
                                }
                                i12 = i16;
                            } else {
                                i12 = 0;
                            }
                            k90Var2.S.V(false);
                            if (z18) {
                                k90Var2.S.k1(8);
                            }
                            if (!arrayList.isEmpty()) {
                                boolean[] zArr = new boolean[arrayList.size()];
                                for (int i18 = 0; i18 < arrayList.size(); i18++) {
                                    TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) arrayList.get(i18);
                                    zArr[i18] = storyItem2.pinned;
                                    storyItem2.pinned = z18;
                                }
                                k90Var2.getMessagesController().R1().q0(k90Var2.e, arrayList, false);
                                boolean[] zArr2 = {false};
                                int i19 = 21;
                                k90Var2.R = new di.p6(k90Var2, arrayList, z18, i19);
                                q20 q20Var = new q20(k90Var2, zArr2, arrayList, zArr, 3);
                                (z18 ? lc.b0(k90Var2).L(R.raw.contact_check, org.telegram.messenger.gd.G(i12, "StorySavedTitle", new Object[0]), org.telegram.messenger.gd.N0(2131744243, null), org.telegram.messenger.gd.N0(2131743644, null), q20Var).j() : lc.b0(k90Var2).J(R.raw.chats_archived, org.telegram.messenger.gd.G(i12, "StoryArchived", new Object[0]), org.telegram.messenger.gd.N0(2131743644, null), 5000, false, q20Var).j()).v = new ou(i19, k90Var2, zArr2);
                                break;
                            }
                            break;
                    }
                }
            });
            org.telegram.ui.ActionBar.y0 e12 = this.s.e(10, R.drawable.msg_calendar2, org.telegram.messenger.gd.N0(2131752630, null));
            this.H = e12;
            e12.setEnabled(false);
            this.H.setAlpha(0.5f);
            this.s.a(-1);
            org.telegram.ui.ActionBar.g5 g5Var = this.s;
            org.telegram.ui.ActionBar.y0 d = g5Var.d(6, 0, null, org.telegram.messenger.gd.N0(2131748460, null), true, true, g5Var.n0);
            this.x = d;
            d.setChecked(this.E);
            final int i12 = 2;
            this.x.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.h90
                public final /* synthetic */ k90 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    fi.h6 h6Var;
                    fi.h6 h6Var2;
                    fi.h6 h6Var3;
                    fi.h6 h6Var4;
                    int i122;
                    int i13 = i12;
                    org.telegram.messenger.q2 q2Var = org.telegram.messenger.q2.E;
                    k90 k90Var = this.b;
                    switch (i13) {
                        case 0:
                            Boolean Q1 = k90Var.S.Q1(null, null);
                            if (Q1 != null) {
                                k90Var.i0(true, Q1.booleanValue());
                                break;
                            }
                            break;
                        case 1:
                            Boolean R1 = k90Var.S.R1(null, null);
                            if (R1 != null) {
                                k90Var.i0(R1.booleanValue(), true);
                                break;
                            }
                            break;
                        case 2:
                            boolean z10 = k90Var.E;
                            if (z10 && !k90Var.F) {
                                q2Var.a();
                                org.telegram.ui.ActionBar.y0 y0Var = k90Var.x;
                                int i14 = -k90Var.G;
                                k90Var.G = i14;
                                org.telegram.messenger.g0.E3(i14, y0Var, null);
                                break;
                            } else {
                                org.telegram.ui.ActionBar.y0 y0Var2 = k90Var.x;
                                boolean z11 = !z10;
                                k90Var.E = z11;
                                y0Var2.setChecked(z11);
                                j90 j90Var2 = k90Var.S;
                                boolean z12 = k90Var.E;
                                boolean z13 = k90Var.F;
                                sr0 sr0Var = j90Var2.f0;
                                if (sr0Var != null && (h6Var2 = sr0Var.s) != null) {
                                    h6Var2.n = z12;
                                    h6Var2.o = z13;
                                    h6Var2.d(true);
                                }
                                eq0 eq0Var = j90Var2.h0;
                                if (eq0Var != null && (h6Var = eq0Var.s) != null) {
                                    h6Var.n = z12;
                                    h6Var.o = z13;
                                    h6Var.d(true);
                                    break;
                                }
                            }
                            break;
                        case 3:
                            boolean z14 = k90Var.F;
                            if (z14 && !k90Var.E) {
                                q2Var.a();
                                org.telegram.ui.ActionBar.y0 y0Var3 = k90Var.y;
                                int i15 = -k90Var.G;
                                k90Var.G = i15;
                                org.telegram.messenger.g0.E3(i15, y0Var3, null);
                                break;
                            } else {
                                org.telegram.ui.ActionBar.y0 y0Var4 = k90Var.y;
                                boolean z15 = !z14;
                                k90Var.F = z15;
                                y0Var4.setChecked(z15);
                                j90 j90Var3 = k90Var.S;
                                boolean z16 = k90Var.E;
                                boolean z17 = k90Var.F;
                                sr0 sr0Var2 = j90Var3.f0;
                                if (sr0Var2 != null && (h6Var4 = sr0Var2.s) != null) {
                                    h6Var4.n = z16;
                                    h6Var4.o = z17;
                                    h6Var4.d(true);
                                }
                                eq0 eq0Var2 = j90Var3.h0;
                                if (eq0Var2 != null && (h6Var3 = eq0Var2.s) != null) {
                                    h6Var3.n = z16;
                                    h6Var3.o = z17;
                                    h6Var3.d(true);
                                    break;
                                }
                            }
                            break;
                        default:
                            k90 k90Var2 = this.b;
                            di.p6 p6Var = k90Var2.R;
                            if (p6Var != null) {
                                p6Var.run();
                                k90Var2.R = null;
                            }
                            gc.e();
                            boolean z18 = k90Var2.S.getClosestTab() == 9;
                            ArrayList arrayList = new ArrayList();
                            if (k90Var2.w != null) {
                                int i16 = 0;
                                for (int i17 = 0; i17 < k90Var2.w.size(); i17++) {
                                    TL_stories.StoryItem storyItem = ((org.telegram.messenger.fj) k90Var2.w.valueAt(i17)).l;
                                    if (storyItem != null) {
                                        arrayList.add(storyItem);
                                        i16++;
                                    }
                                }
                                i122 = i16;
                            } else {
                                i122 = 0;
                            }
                            k90Var2.S.V(false);
                            if (z18) {
                                k90Var2.S.k1(8);
                            }
                            if (!arrayList.isEmpty()) {
                                boolean[] zArr = new boolean[arrayList.size()];
                                for (int i18 = 0; i18 < arrayList.size(); i18++) {
                                    TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) arrayList.get(i18);
                                    zArr[i18] = storyItem2.pinned;
                                    storyItem2.pinned = z18;
                                }
                                k90Var2.getMessagesController().R1().q0(k90Var2.e, arrayList, false);
                                boolean[] zArr2 = {false};
                                int i19 = 21;
                                k90Var2.R = new di.p6(k90Var2, arrayList, z18, i19);
                                q20 q20Var = new q20(k90Var2, zArr2, arrayList, zArr, 3);
                                (z18 ? lc.b0(k90Var2).L(R.raw.contact_check, org.telegram.messenger.gd.G(i122, "StorySavedTitle", new Object[0]), org.telegram.messenger.gd.N0(2131744243, null), org.telegram.messenger.gd.N0(2131743644, null), q20Var).j() : lc.b0(k90Var2).J(R.raw.chats_archived, org.telegram.messenger.gd.G(i122, "StoryArchived", new Object[0]), org.telegram.messenger.gd.N0(2131743644, null), 5000, false, q20Var).j()).v = new ou(i19, k90Var2, zArr2);
                                break;
                            }
                            break;
                    }
                }
            });
            org.telegram.ui.ActionBar.g5 g5Var2 = this.s;
            org.telegram.ui.ActionBar.y0 d2 = g5Var2.d(7, 0, null, org.telegram.messenger.gd.N0(2131748459, null), true, true, g5Var2.n0);
            this.y = d2;
            d2.setChecked(this.F);
            this.y.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.h90
                public final /* synthetic */ k90 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    fi.h6 h6Var;
                    fi.h6 h6Var2;
                    fi.h6 h6Var3;
                    fi.h6 h6Var4;
                    int i122;
                    int i13 = i11;
                    org.telegram.messenger.q2 q2Var = org.telegram.messenger.q2.E;
                    k90 k90Var = this.b;
                    switch (i13) {
                        case 0:
                            Boolean Q1 = k90Var.S.Q1(null, null);
                            if (Q1 != null) {
                                k90Var.i0(true, Q1.booleanValue());
                                break;
                            }
                            break;
                        case 1:
                            Boolean R1 = k90Var.S.R1(null, null);
                            if (R1 != null) {
                                k90Var.i0(R1.booleanValue(), true);
                                break;
                            }
                            break;
                        case 2:
                            boolean z10 = k90Var.E;
                            if (z10 && !k90Var.F) {
                                q2Var.a();
                                org.telegram.ui.ActionBar.y0 y0Var = k90Var.x;
                                int i14 = -k90Var.G;
                                k90Var.G = i14;
                                org.telegram.messenger.g0.E3(i14, y0Var, null);
                                break;
                            } else {
                                org.telegram.ui.ActionBar.y0 y0Var2 = k90Var.x;
                                boolean z11 = !z10;
                                k90Var.E = z11;
                                y0Var2.setChecked(z11);
                                j90 j90Var2 = k90Var.S;
                                boolean z12 = k90Var.E;
                                boolean z13 = k90Var.F;
                                sr0 sr0Var = j90Var2.f0;
                                if (sr0Var != null && (h6Var2 = sr0Var.s) != null) {
                                    h6Var2.n = z12;
                                    h6Var2.o = z13;
                                    h6Var2.d(true);
                                }
                                eq0 eq0Var = j90Var2.h0;
                                if (eq0Var != null && (h6Var = eq0Var.s) != null) {
                                    h6Var.n = z12;
                                    h6Var.o = z13;
                                    h6Var.d(true);
                                    break;
                                }
                            }
                            break;
                        case 3:
                            boolean z14 = k90Var.F;
                            if (z14 && !k90Var.E) {
                                q2Var.a();
                                org.telegram.ui.ActionBar.y0 y0Var3 = k90Var.y;
                                int i15 = -k90Var.G;
                                k90Var.G = i15;
                                org.telegram.messenger.g0.E3(i15, y0Var3, null);
                                break;
                            } else {
                                org.telegram.ui.ActionBar.y0 y0Var4 = k90Var.y;
                                boolean z15 = !z14;
                                k90Var.F = z15;
                                y0Var4.setChecked(z15);
                                j90 j90Var3 = k90Var.S;
                                boolean z16 = k90Var.E;
                                boolean z17 = k90Var.F;
                                sr0 sr0Var2 = j90Var3.f0;
                                if (sr0Var2 != null && (h6Var4 = sr0Var2.s) != null) {
                                    h6Var4.n = z16;
                                    h6Var4.o = z17;
                                    h6Var4.d(true);
                                }
                                eq0 eq0Var2 = j90Var3.h0;
                                if (eq0Var2 != null && (h6Var3 = eq0Var2.s) != null) {
                                    h6Var3.n = z16;
                                    h6Var3.o = z17;
                                    h6Var3.d(true);
                                    break;
                                }
                            }
                            break;
                        default:
                            k90 k90Var2 = this.b;
                            di.p6 p6Var = k90Var2.R;
                            if (p6Var != null) {
                                p6Var.run();
                                k90Var2.R = null;
                            }
                            gc.e();
                            boolean z18 = k90Var2.S.getClosestTab() == 9;
                            ArrayList arrayList = new ArrayList();
                            if (k90Var2.w != null) {
                                int i16 = 0;
                                for (int i17 = 0; i17 < k90Var2.w.size(); i17++) {
                                    TL_stories.StoryItem storyItem = ((org.telegram.messenger.fj) k90Var2.w.valueAt(i17)).l;
                                    if (storyItem != null) {
                                        arrayList.add(storyItem);
                                        i16++;
                                    }
                                }
                                i122 = i16;
                            } else {
                                i122 = 0;
                            }
                            k90Var2.S.V(false);
                            if (z18) {
                                k90Var2.S.k1(8);
                            }
                            if (!arrayList.isEmpty()) {
                                boolean[] zArr = new boolean[arrayList.size()];
                                for (int i18 = 0; i18 < arrayList.size(); i18++) {
                                    TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) arrayList.get(i18);
                                    zArr[i18] = storyItem2.pinned;
                                    storyItem2.pinned = z18;
                                }
                                k90Var2.getMessagesController().R1().q0(k90Var2.e, arrayList, false);
                                boolean[] zArr2 = {false};
                                int i19 = 21;
                                k90Var2.R = new di.p6(k90Var2, arrayList, z18, i19);
                                q20 q20Var = new q20(k90Var2, zArr2, arrayList, zArr, 3);
                                (z18 ? lc.b0(k90Var2).L(R.raw.contact_check, org.telegram.messenger.gd.G(i122, "StorySavedTitle", new Object[0]), org.telegram.messenger.gd.N0(2131744243, null), org.telegram.messenger.gd.N0(2131743644, null), q20Var).j() : lc.b0(k90Var2).J(R.raw.chats_archived, org.telegram.messenger.gd.G(i122, "StoryArchived", new Object[0]), org.telegram.messenger.gd.N0(2131743644, null), 5000, false, q20Var).j()).v = new ou(i19, k90Var2, zArr2);
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
            org.telegram.ui.oe0 oe0Var = new org.telegram.ui.oe0(context, getResourceProvider());
            this.K = oe0Var;
            oe0Var.setClipChildren(false);
            this.K.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f));
            bVarArr[0] = qh.b.c(context, getResourceProvider(), qh.a.R, 2131746455);
            bVarArr[1] = qh.b.c(context, getResourceProvider(), qh.a.S, 2131746431);
            for (int i14 = 0; i14 < bVarArr.length; i14++) {
                bVarArr[i14].setOnClickListener(new ci.q(this, i14, 16));
                this.K.addView(bVarArr[i14]);
                this.K.j(bVarArr[i14], true, false);
            }
            aVar = baseSimpleGlass;
            fh.g c10 = aVar.c.c(this.K, c8.i0.g(getResourceProvider()), false);
            org.telegram.messenger.n10.s(c10, org.telegram.messenger.g0.L(28.0f), 7.666f);
            this.K.setBackground(c10);
            e3Var.addView(this.K, c8.ma.e(-2, 72, 81));
            FrameLayout frameLayout = new FrameLayout(context);
            this.N = frameLayout;
            frameLayout.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(8.0f));
            hi.e eVar = new hi.e(context, getResourceProvider(), true);
            this.O = eVar;
            eVar.i(org.telegram.messenger.gd.N0(2131745713, null), false, true);
            this.O.setShowZero(true);
            this.O.c(0, false);
            this.O.setEnabled(false);
            final int i15 = 4;
            this.O.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.h90
                public final /* synthetic */ k90 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    fi.h6 h6Var;
                    fi.h6 h6Var2;
                    fi.h6 h6Var3;
                    fi.h6 h6Var4;
                    int i122;
                    int i132 = i15;
                    org.telegram.messenger.q2 q2Var = org.telegram.messenger.q2.E;
                    k90 k90Var = this.b;
                    switch (i132) {
                        case 0:
                            Boolean Q1 = k90Var.S.Q1(null, null);
                            if (Q1 != null) {
                                k90Var.i0(true, Q1.booleanValue());
                                break;
                            }
                            break;
                        case 1:
                            Boolean R1 = k90Var.S.R1(null, null);
                            if (R1 != null) {
                                k90Var.i0(R1.booleanValue(), true);
                                break;
                            }
                            break;
                        case 2:
                            boolean z10 = k90Var.E;
                            if (z10 && !k90Var.F) {
                                q2Var.a();
                                org.telegram.ui.ActionBar.y0 y0Var = k90Var.x;
                                int i142 = -k90Var.G;
                                k90Var.G = i142;
                                org.telegram.messenger.g0.E3(i142, y0Var, null);
                                break;
                            } else {
                                org.telegram.ui.ActionBar.y0 y0Var2 = k90Var.x;
                                boolean z11 = !z10;
                                k90Var.E = z11;
                                y0Var2.setChecked(z11);
                                j90 j90Var2 = k90Var.S;
                                boolean z12 = k90Var.E;
                                boolean z13 = k90Var.F;
                                sr0 sr0Var = j90Var2.f0;
                                if (sr0Var != null && (h6Var2 = sr0Var.s) != null) {
                                    h6Var2.n = z12;
                                    h6Var2.o = z13;
                                    h6Var2.d(true);
                                }
                                eq0 eq0Var = j90Var2.h0;
                                if (eq0Var != null && (h6Var = eq0Var.s) != null) {
                                    h6Var.n = z12;
                                    h6Var.o = z13;
                                    h6Var.d(true);
                                    break;
                                }
                            }
                            break;
                        case 3:
                            boolean z14 = k90Var.F;
                            if (z14 && !k90Var.E) {
                                q2Var.a();
                                org.telegram.ui.ActionBar.y0 y0Var3 = k90Var.y;
                                int i152 = -k90Var.G;
                                k90Var.G = i152;
                                org.telegram.messenger.g0.E3(i152, y0Var3, null);
                                break;
                            } else {
                                org.telegram.ui.ActionBar.y0 y0Var4 = k90Var.y;
                                boolean z15 = !z14;
                                k90Var.F = z15;
                                y0Var4.setChecked(z15);
                                j90 j90Var3 = k90Var.S;
                                boolean z16 = k90Var.E;
                                boolean z17 = k90Var.F;
                                sr0 sr0Var2 = j90Var3.f0;
                                if (sr0Var2 != null && (h6Var4 = sr0Var2.s) != null) {
                                    h6Var4.n = z16;
                                    h6Var4.o = z17;
                                    h6Var4.d(true);
                                }
                                eq0 eq0Var2 = j90Var3.h0;
                                if (eq0Var2 != null && (h6Var3 = eq0Var2.s) != null) {
                                    h6Var3.n = z16;
                                    h6Var3.o = z17;
                                    h6Var3.d(true);
                                    break;
                                }
                            }
                            break;
                        default:
                            k90 k90Var2 = this.b;
                            di.p6 p6Var = k90Var2.R;
                            if (p6Var != null) {
                                p6Var.run();
                                k90Var2.R = null;
                            }
                            gc.e();
                            boolean z18 = k90Var2.S.getClosestTab() == 9;
                            ArrayList arrayList = new ArrayList();
                            if (k90Var2.w != null) {
                                int i16 = 0;
                                for (int i17 = 0; i17 < k90Var2.w.size(); i17++) {
                                    TL_stories.StoryItem storyItem = ((org.telegram.messenger.fj) k90Var2.w.valueAt(i17)).l;
                                    if (storyItem != null) {
                                        arrayList.add(storyItem);
                                        i16++;
                                    }
                                }
                                i122 = i16;
                            } else {
                                i122 = 0;
                            }
                            k90Var2.S.V(false);
                            if (z18) {
                                k90Var2.S.k1(8);
                            }
                            if (!arrayList.isEmpty()) {
                                boolean[] zArr = new boolean[arrayList.size()];
                                for (int i18 = 0; i18 < arrayList.size(); i18++) {
                                    TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) arrayList.get(i18);
                                    zArr[i18] = storyItem2.pinned;
                                    storyItem2.pinned = z18;
                                }
                                k90Var2.getMessagesController().R1().q0(k90Var2.e, arrayList, false);
                                boolean[] zArr2 = {false};
                                int i19 = 21;
                                k90Var2.R = new di.p6(k90Var2, arrayList, z18, i19);
                                q20 q20Var = new q20(k90Var2, zArr2, arrayList, zArr, 3);
                                (z18 ? lc.b0(k90Var2).L(R.raw.contact_check, org.telegram.messenger.gd.G(i122, "StorySavedTitle", new Object[0]), org.telegram.messenger.gd.N0(2131744243, null), org.telegram.messenger.gd.N0(2131743644, null), q20Var).j() : lc.b0(k90Var2).J(R.raw.chats_archived, org.telegram.messenger.gd.G(i122, "StoryArchived", new Object[0]), org.telegram.messenger.gd.N0(2131743644, null), 5000, false, q20Var).j()).v = new ou(i19, k90Var2, zArr2);
                                break;
                            }
                            break;
                    }
                }
            });
            this.N.addView(this.O, c8.ma.c(56.0f, -1));
            this.N.setVisibility(4);
            e3Var.addView(this.N, c8.ma.e(-1, 72, 80));
            this.P = new te.a(0, new ky(this, 7), nr.h, 320L, false);
            setBulletinDelegate(new bi.i1(this, 9));
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
        org.telegram.ui.oe0 oe0Var2 = this.K;
        e3Var.addView(view4, oe0Var2 != null ? e3Var.indexOfChild(oe0Var2) : e3Var.getChildCount(), c8.ma.e(-1, 0, 80));
        org.telegram.ui.ActionBar.z4 z4Var = this.simpleActionBar;
        org.telegram.ui.ActionBar.h6 resourceProvider = getResourceProvider();
        aVar.m = e3Var;
        aVar.n = null;
        aVar.g(e3Var, z4Var, resourceProvider);
        aVar.o = new di.f(5, this, e3Var);
        this.S.setPagesGlassEngine(this.glassEngine);
        this.simpleActionBar.setBackground(null);
        h0(false);
        if (this.a == 3 && (i7 = this.r) != -1) {
            this.simpleActionBar.setSubtitle(org.telegram.messenger.gd.H(' ', "FoundStories", i7));
        }
        b0();
        g0();
        if (this.a == 1) {
            r13 = this.T != 9 ? 0 : 1;
            org.telegram.ui.oe0 oe0Var3 = this.K;
            if (oe0Var3 != null && this.M != r13) {
                this.M = r13;
                oe0Var3.r(bVarArr[r13], false);
            }
        }
        return e3Var;
    }

    public final boolean d0() {
        int i7 = this.a;
        return i7 == 1 || i7 == 2;
    }

    @Override // org.telegram.messenger.fs
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.ks.E0 && ((Long) objArr[0]).longValue() == this.e) {
            TLRPC.UserFull userFull = (TLRPC.UserFull) objArr[1];
            this.d = userFull;
            j90 j90Var = this.S;
            if (j90Var != null) {
                j90Var.setUserInfo(userFull);
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
        j90 j90Var = this.S;
        if (j90Var == null || this.simpleActionBar == null) {
            return;
        }
        int closestTab = j90Var.getClosestTab();
        if (this.a != 3 || closestTab == 8) {
            int[] iArr = this.b.c;
            boolean z10 = org.telegram.messenger.gd.a0;
            if (closestTab == 8 || closestTab == 9) {
                org.telegram.ui.ActionBar.y0 y0Var = this.J;
                if (y0Var != null) {
                    y0Var.setEnabled(this.S.K());
                    org.telegram.ui.ActionBar.y0 y0Var2 = this.J;
                    y0Var2.setAlpha(y0Var2.isEnabled() ? 1.0f : 0.5f);
                }
                org.telegram.ui.ActionBar.y0 y0Var3 = this.I;
                if (y0Var3 != null) {
                    y0Var3.setEnabled(this.S.J());
                    org.telegram.ui.ActionBar.y0 y0Var4 = this.I;
                    y0Var4.setAlpha(y0Var4.isEnabled() ? 1.0f : 0.5f);
                }
                int m0 = this.S.m0(closestTab);
                if (this.a == 3) {
                    if (m0 > 0) {
                        f0(org.telegram.messenger.gd.H(' ', "FoundStories", m0));
                    }
                } else if (closestTab == 8) {
                    f0(m0 > 0 ? org.telegram.messenger.gd.G(m0, "ProfileMyStoriesCount", new Object[0]) : null);
                } else {
                    f0(m0 > 0 ? org.telegram.messenger.gd.G(m0, "ProfileStoriesArchiveCount", new Object[0]) : null);
                }
                h0(true);
                org.telegram.ui.ActionBar.g5 g5Var = this.s;
                if (g5Var != null) {
                    g5Var.Z(m0 > 0, true);
                }
                hi.e eVar = this.O;
                if (eVar != null) {
                    boolean z11 = !z10 && this.V == closestTab;
                    if (closestTab == 8) {
                        SparseArray sparseArray = this.w;
                        eVar.i(org.telegram.messenger.gd.G(sparseArray == null ? 0 : sparseArray.size(), "ArchiveStories", new Object[0]), z11, true);
                    } else {
                        eVar.i(org.telegram.messenger.gd.N0(2131745713, null), z11, true);
                    }
                    this.V = closestTab;
                }
                org.telegram.ui.ActionBar.y0 y0Var5 = this.H;
                if (y0Var5 != null) {
                    boolean z12 = m0 > 0;
                    y0Var5.setEnabled(z12);
                    this.H.setAlpha(z12 ? 1.0f : 0.5f);
                    return;
                }
                return;
            }
            if (closestTab == 11) {
                f0(org.telegram.messenger.gd.G(getMessagesController().I1().c(), "SavedDialogsTabCount", new Object[0]));
                return;
            }
            if (closestTab >= 0) {
                if (closestTab >= iArr.length || iArr[closestTab] >= 0) {
                    if (closestTab == 0) {
                        if (this.S.getPhotosVideosTypeFilter() == 1) {
                            f0(org.telegram.messenger.gd.G(iArr[6], "Photos", new Object[0]));
                            return;
                        } else if (this.S.getPhotosVideosTypeFilter() == 2) {
                            f0(org.telegram.messenger.gd.G(iArr[7], "Videos", new Object[0]));
                            return;
                        } else {
                            f0(org.telegram.messenger.gd.G(iArr[0], "Media", new Object[0]));
                            return;
                        }
                    }
                    if (closestTab == 1) {
                        f0(org.telegram.messenger.gd.G(iArr[1], "Files", new Object[0]));
                        return;
                    }
                    if (closestTab == 2) {
                        f0(org.telegram.messenger.gd.G(iArr[2], "Voice", new Object[0]));
                        return;
                    }
                    if (closestTab == 3) {
                        f0(org.telegram.messenger.gd.G(iArr[3], "Links", new Object[0]));
                        return;
                    }
                    if (closestTab == 4) {
                        f0(org.telegram.messenger.gd.G(iArr[4], "MusicFiles", new Object[0]));
                        return;
                    }
                    if (closestTab == 5) {
                        f0(org.telegram.messenger.gd.G(iArr[5], "GIFs", new Object[0]));
                        return;
                    }
                    if (closestTab == 15 && (i7 = iArr[8]) >= 0) {
                        f0(org.telegram.messenger.gd.G(i7, "ProfilePollsCount", new Object[0]));
                    } else if (closestTab == 10) {
                        org.telegram.messenger.no N0 = org.telegram.messenger.mp.u1(this.currentAccount).N0(this.e);
                        f0(org.telegram.messenger.gd.G(N0 == null ? 0 : N0.b.size() + N0.c, "Channels", new Object[0]));
                    }
                }
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final int getNavigationBarColor() {
        int navigationBarColor = super.getNavigationBarColor();
        return (getLastStoryViewer() == null || !getLastStoryViewer().y()) ? navigationBarColor : getLastStoryViewer().e(navigationBarColor);
    }

    @Override // org.telegram.ui.ActionBar.g2
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
                str = org.telegram.messenger.gd.N0(2131746438, null);
            } else if (i7 == 1) {
                j90 j90Var = this.S;
                if (j90Var != null && j90Var.getClosestTab() != 9) {
                    z11 = false;
                }
                str = org.telegram.messenger.gd.N0(z11 ? 2131746438 : 2131746459, null);
            } else {
                long j3 = (this.f == 0 || this.e != getUserConfig().e()) ? this.e : this.f;
                if (j3 == 2666000) {
                    str = org.telegram.messenger.gd.N0(2131754249, null);
                } else if (this.f != 0 && j3 == getUserConfig().e()) {
                    str = org.telegram.messenger.gd.N0(2131748110, null);
                } else if (org.telegram.messenger.n5.C(j3)) {
                    TLRPC.EncryptedChat c12 = getMessagesController().c1(Integer.valueOf((int) (j3 & 4294967295L)));
                    TLRPC.User c22 = c12 != null ? getMessagesController().c2(Long.valueOf(c12.user_id)) : null;
                    if (c22 != null) {
                        str = org.telegram.messenger.i5.m(0, c22.first_name, c22.last_name);
                    }
                    str = null;
                } else if (org.telegram.messenger.n5.E(j3)) {
                    TLRPC.User c23 = getMessagesController().c2(Long.valueOf(j3));
                    if (c23 != null) {
                        str = c23.self ? org.telegram.messenger.gd.N0(2131745705, null) : org.telegram.messenger.i5.m(0, c23.first_name, c23.last_name);
                    }
                    str = null;
                } else {
                    TLRPC.Chat O0 = getMessagesController().O0(Long.valueOf(-j3));
                    if (O0 != null) {
                        str = O0.title;
                    }
                    str = null;
                }
                if (TextUtils.isEmpty(str)) {
                    str = org.telegram.messenger.gd.N0(2131745219, null);
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
        org.telegram.ui.ActionBar.z4 z4Var = this.simpleActionBar;
        z4Var.getClass();
        z4Var.I(str2, z12, 320L, nr.h);
    }

    public final void i0(boolean z10, boolean z11) {
        this.J.setEnabled(z10);
        this.J.animate().alpha(z10 ? 1.0f : 0.5f).start();
        this.I.setEnabled(z11);
        this.I.animate().alpha(z11 ? 1.0f : 0.5f).start();
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        if (!this.S.K0()) {
            return false;
        }
        j90 j90Var = this.S;
        return j90Var.getSelectedTab() == j90Var.L0.getFirstTabId();
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final boolean onBackPressed(boolean z10) {
        if (!hasShownSheet()) {
            j90 j90Var = this.S;
            if (!j90Var.F1) {
                return super.onBackPressed(z10);
            }
            if (z10) {
                j90Var.V(false);
            }
        } else if (z10) {
            closeSheet();
            return false;
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final boolean onFragmentCreate() {
        this.a = getArguments().getInt(TeXSymbolParser.TYPE_ATTR, 0);
        this.e = getArguments().getLong("dialog_id");
        this.f = getArguments().getLong("topic_id", 0L);
        this.h = getArguments().getString("hashtag", "");
        this.n = getArguments().getString("username", "");
        this.r = getArguments().getInt("storiesCount", -1);
        int i7 = this.a;
        this.T = getArguments().getInt("start_from", i7 == 2 ? 9 : i7 == 1 ? 8 : 0);
        getNotificationCenter().c(this, org.telegram.messenger.ks.E0);
        getNotificationCenter().c(this, org.telegram.messenger.ks.i5);
        getNotificationCenter().c(this, org.telegram.messenger.ks.b3);
        if (org.telegram.messenger.n5.E(this.e) && this.f == 0) {
            TLRPC.User c22 = getMessagesController().c2(Long.valueOf(this.e));
            if (org.telegram.messenger.o10.C(c22)) {
                getMessagesController().n3(c22, false, this.classGuid);
                this.d = getMessagesController().d2(this.e);
            }
        }
        if (this.b == null) {
            this.b = new bt0(this);
        }
        this.b.y.add(this);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().n(this, org.telegram.messenger.ks.E0);
        getNotificationCenter().n(this, org.telegram.messenger.ks.i5);
        getNotificationCenter().n(this, org.telegram.messenger.ks.b3);
        di.p6 p6Var = this.R;
        if (p6Var != null) {
            this.R = null;
            org.telegram.messenger.g0.g3(p6Var);
        }
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final void onInsets(int i7, int i10, int i11, int i12) {
        b0();
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final boolean useSimpleActionBar() {
        return true;
    }
}
