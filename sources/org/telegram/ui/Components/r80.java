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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class r80 extends org.telegram.ui.ActionBar.d2 implements ps0, qg.b, org.telegram.messenger.cs {
    public boolean E;
    public boolean F;
    public int G;
    public org.telegram.ui.ActionBar.y0 H;
    public org.telegram.ui.ActionBar.y0 I;
    public org.telegram.ui.ActionBar.y0 J;
    public org.telegram.ui.ge0 K;
    public final rh.b[] L;
    public int M;
    public FrameLayout N;
    public gi.d O;
    public qe.a P;
    public View Q;
    public ci.v6 R;
    public q80 S;
    public int T;
    public String U;
    public int V;
    public int a;
    public os0 b;
    public TLRPC.ChatFull c;
    public TLRPC.UserFull d;
    public long e;
    public long f;
    public String h;
    public String n;
    public int r;
    public org.telegram.ui.ActionBar.f5 s;
    public SparseArray w;
    public org.telegram.ui.ActionBar.y0 x;
    public org.telegram.ui.ActionBar.y0 y;

    public r80(Bundle bundle, os0 os0Var) {
        super(bundle);
        this.E = true;
        this.F = true;
        this.G = -12;
        this.L = new rh.b[2];
        this.M = -1;
        this.b = os0Var;
    }

    @Override // qg.b
    public final List E() {
        Activity parentActivity = getParentActivity();
        org.telegram.messenger.q5 q5Var = tg.b1.m;
        return Arrays.asList(new qg.a((parentActivity.getSharedPreferences("shapedetector_conf", 0).getBoolean("learning", false) ? "Disable" : "Enable").concat(" shape detector learning debug"), new n80(this, 1)));
    }

    @Override // org.telegram.ui.Components.ps0
    public final void Q() {
        os0 os0Var;
        q80 q80Var = this.S;
        if (q80Var != null && (os0Var = this.b) != null) {
            q80Var.setNewMediaCounts(os0Var.c);
        }
        g0();
    }

    public final void b0() {
        if (this.S == null) {
            return;
        }
        int i3 = 0;
        int L = this.K != null ? org.telegram.messenger.g0.L(72.0f) : 0;
        q80 q80Var = this.S;
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + this.mSystemInsets.b;
        int[] iArr = ws0.t2;
        q80Var.l1(pi.a.d(currentActionBarHeight - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - org.telegram.messenger.g0.L(6.666f), pi.a.c(this.mSystemInsets.b), pi.a.c(this.mSystemInsets.d + L), this.mSystemInsets.d + L);
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
                i3 = 8;
            }
            view2.setVisibility(i3);
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

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean canBeginSlide() {
        if (this.S.J0()) {
            return super.canBeginSlide();
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final View createView(Context context) {
        pi.a aVar;
        int i3;
        setHasOwnBackground(true);
        final int i10 = 0;
        this.simpleActionBar.setBackButtonDrawable(new org.telegram.ui.ActionBar.w1(false));
        this.simpleActionBar.setActionBarMenuOnItemClick(new org.telegram.ui.o9(this, 15));
        ai.o2 o2Var = new ai.o2(23, context, this);
        this.fragmentView = o2Var;
        if (this.a == 0 && this.e == getUserConfig().e() && this.f == 0 && !getMessagesController().G1().b && getMessagesController().G1().e()) {
            this.T = 11;
        }
        pi.a baseSimpleGlass = getBaseSimpleGlass();
        q80 q80Var = new q80(this, context, this.e, this.b, this.c, this.d, this.T, this, new p80(this), getResourceProvider(), baseSimpleGlass.c);
        this.S = q80Var;
        q80Var.setOnTopPanelShiftChanged(new n80(this, i10));
        this.S.L0.setOpen(true);
        this.S.setPinnedToTop(true);
        o2Var.addView(this.S, b8.mf.c(-1.0f, -1));
        final int i11 = 3;
        if (d0()) {
            org.telegram.ui.ActionBar.f5 b10 = this.simpleActionBar.o().b(0, R.drawable.ic_ab_other);
            this.s = b10;
            b10.setContentDescription(org.telegram.messenger.bd.M0(2131754839, null));
            this.s.Y(false, false);
            org.telegram.ui.ActionBar.y0 e10 = this.s.e(8, R.drawable.msg_zoomin, org.telegram.messenger.bd.M0(2131748658, null));
            this.I = e10;
            e10.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.o80
                public final /* synthetic */ r80 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ei.r6 r6Var;
                    ei.r6 r6Var2;
                    ei.r6 r6Var3;
                    ei.r6 r6Var4;
                    int i12;
                    int i13 = i10;
                    org.telegram.messenger.p2 p2Var = org.telegram.messenger.p2.E;
                    r80 r80Var = this.b;
                    switch (i13) {
                        case 0:
                            Boolean O1 = r80Var.S.O1(null, null);
                            if (O1 != null) {
                                r80Var.i0(true, O1.booleanValue());
                                break;
                            }
                            break;
                        case 1:
                            Boolean P1 = r80Var.S.P1(null, null);
                            if (P1 != null) {
                                r80Var.i0(P1.booleanValue(), true);
                                break;
                            }
                            break;
                        case 2:
                            boolean z10 = r80Var.E;
                            if (z10 && !r80Var.F) {
                                p2Var.a();
                                org.telegram.ui.ActionBar.y0 y0Var = r80Var.x;
                                int i14 = -r80Var.G;
                                r80Var.G = i14;
                                org.telegram.messenger.g0.G3(i14, y0Var, null);
                                break;
                            } else {
                                org.telegram.ui.ActionBar.y0 y0Var2 = r80Var.x;
                                boolean z11 = !z10;
                                r80Var.E = z11;
                                y0Var2.setChecked(z11);
                                q80 q80Var2 = r80Var.S;
                                boolean z12 = r80Var.E;
                                boolean z13 = r80Var.F;
                                gr0 gr0Var = q80Var2.f0;
                                if (gr0Var != null && (r6Var2 = gr0Var.s) != null) {
                                    r6Var2.n = z12;
                                    r6Var2.o = z13;
                                    r6Var2.d(true);
                                }
                                rp0 rp0Var = q80Var2.h0;
                                if (rp0Var != null && (r6Var = rp0Var.s) != null) {
                                    r6Var.n = z12;
                                    r6Var.o = z13;
                                    r6Var.d(true);
                                    break;
                                }
                            }
                            break;
                        case 3:
                            boolean z14 = r80Var.F;
                            if (z14 && !r80Var.E) {
                                p2Var.a();
                                org.telegram.ui.ActionBar.y0 y0Var3 = r80Var.y;
                                int i15 = -r80Var.G;
                                r80Var.G = i15;
                                org.telegram.messenger.g0.G3(i15, y0Var3, null);
                                break;
                            } else {
                                org.telegram.ui.ActionBar.y0 y0Var4 = r80Var.y;
                                boolean z15 = !z14;
                                r80Var.F = z15;
                                y0Var4.setChecked(z15);
                                q80 q80Var3 = r80Var.S;
                                boolean z16 = r80Var.E;
                                boolean z17 = r80Var.F;
                                gr0 gr0Var2 = q80Var3.f0;
                                if (gr0Var2 != null && (r6Var4 = gr0Var2.s) != null) {
                                    r6Var4.n = z16;
                                    r6Var4.o = z17;
                                    r6Var4.d(true);
                                }
                                rp0 rp0Var2 = q80Var3.h0;
                                if (rp0Var2 != null && (r6Var3 = rp0Var2.s) != null) {
                                    r6Var3.n = z16;
                                    r6Var3.o = z17;
                                    r6Var3.d(true);
                                    break;
                                }
                            }
                            break;
                        default:
                            r80 r80Var2 = this.b;
                            ci.v6 v6Var = r80Var2.R;
                            if (v6Var != null) {
                                v6Var.run();
                                r80Var2.R = null;
                            }
                            ac.e();
                            boolean z18 = r80Var2.S.getClosestTab() == 9;
                            ArrayList arrayList = new ArrayList();
                            if (r80Var2.w != null) {
                                int i16 = 0;
                                for (int i17 = 0; i17 < r80Var2.w.size(); i17++) {
                                    TL_stories.StoryItem storyItem = ((org.telegram.messenger.zi) r80Var2.w.valueAt(i17)).l;
                                    if (storyItem != null) {
                                        arrayList.add(storyItem);
                                        i16++;
                                    }
                                }
                                i12 = i16;
                            } else {
                                i12 = 0;
                            }
                            r80Var2.S.V(false);
                            if (z18) {
                                r80Var2.S.i1(8);
                            }
                            if (!arrayList.isEmpty()) {
                                boolean[] zArr = new boolean[arrayList.size()];
                                for (int i18 = 0; i18 < arrayList.size(); i18++) {
                                    TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) arrayList.get(i18);
                                    zArr[i18] = storyItem2.pinned;
                                    storyItem2.pinned = z18;
                                }
                                r80Var2.getMessagesController().P1().q0(r80Var2.e, arrayList, false);
                                boolean[] zArr2 = {false};
                                r80Var2.R = new ci.v6(r80Var2, arrayList, z18, 21);
                                v60 v60Var = new v60(r80Var2, zArr2, arrayList, zArr, 2);
                                (z18 ? fc.a0(r80Var2).L(R.raw.contact_check, org.telegram.messenger.bd.G(i12, "StorySavedTitle", new Object[0]), org.telegram.messenger.bd.M0(2131744494, null), org.telegram.messenger.bd.M0(2131743897, null), v60Var).j() : fc.a0(r80Var2).J(R.raw.chats_archived, org.telegram.messenger.bd.G(i12, "StoryArchived", new Object[0]), org.telegram.messenger.bd.M0(2131743897, null), 5000, false, v60Var).j()).v = new j50(4, r80Var2, zArr2);
                                break;
                            }
                            break;
                    }
                }
            });
            org.telegram.ui.ActionBar.y0 e11 = this.s.e(9, R.drawable.msg_zoomout, org.telegram.messenger.bd.M0(2131748657, null));
            this.J = e11;
            e11.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.o80
                public final /* synthetic */ r80 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ei.r6 r6Var;
                    ei.r6 r6Var2;
                    ei.r6 r6Var3;
                    ei.r6 r6Var4;
                    int i12;
                    int i13 = r2;
                    org.telegram.messenger.p2 p2Var = org.telegram.messenger.p2.E;
                    r80 r80Var = this.b;
                    switch (i13) {
                        case 0:
                            Boolean O1 = r80Var.S.O1(null, null);
                            if (O1 != null) {
                                r80Var.i0(true, O1.booleanValue());
                                break;
                            }
                            break;
                        case 1:
                            Boolean P1 = r80Var.S.P1(null, null);
                            if (P1 != null) {
                                r80Var.i0(P1.booleanValue(), true);
                                break;
                            }
                            break;
                        case 2:
                            boolean z10 = r80Var.E;
                            if (z10 && !r80Var.F) {
                                p2Var.a();
                                org.telegram.ui.ActionBar.y0 y0Var = r80Var.x;
                                int i14 = -r80Var.G;
                                r80Var.G = i14;
                                org.telegram.messenger.g0.G3(i14, y0Var, null);
                                break;
                            } else {
                                org.telegram.ui.ActionBar.y0 y0Var2 = r80Var.x;
                                boolean z11 = !z10;
                                r80Var.E = z11;
                                y0Var2.setChecked(z11);
                                q80 q80Var2 = r80Var.S;
                                boolean z12 = r80Var.E;
                                boolean z13 = r80Var.F;
                                gr0 gr0Var = q80Var2.f0;
                                if (gr0Var != null && (r6Var2 = gr0Var.s) != null) {
                                    r6Var2.n = z12;
                                    r6Var2.o = z13;
                                    r6Var2.d(true);
                                }
                                rp0 rp0Var = q80Var2.h0;
                                if (rp0Var != null && (r6Var = rp0Var.s) != null) {
                                    r6Var.n = z12;
                                    r6Var.o = z13;
                                    r6Var.d(true);
                                    break;
                                }
                            }
                            break;
                        case 3:
                            boolean z14 = r80Var.F;
                            if (z14 && !r80Var.E) {
                                p2Var.a();
                                org.telegram.ui.ActionBar.y0 y0Var3 = r80Var.y;
                                int i15 = -r80Var.G;
                                r80Var.G = i15;
                                org.telegram.messenger.g0.G3(i15, y0Var3, null);
                                break;
                            } else {
                                org.telegram.ui.ActionBar.y0 y0Var4 = r80Var.y;
                                boolean z15 = !z14;
                                r80Var.F = z15;
                                y0Var4.setChecked(z15);
                                q80 q80Var3 = r80Var.S;
                                boolean z16 = r80Var.E;
                                boolean z17 = r80Var.F;
                                gr0 gr0Var2 = q80Var3.f0;
                                if (gr0Var2 != null && (r6Var4 = gr0Var2.s) != null) {
                                    r6Var4.n = z16;
                                    r6Var4.o = z17;
                                    r6Var4.d(true);
                                }
                                rp0 rp0Var2 = q80Var3.h0;
                                if (rp0Var2 != null && (r6Var3 = rp0Var2.s) != null) {
                                    r6Var3.n = z16;
                                    r6Var3.o = z17;
                                    r6Var3.d(true);
                                    break;
                                }
                            }
                            break;
                        default:
                            r80 r80Var2 = this.b;
                            ci.v6 v6Var = r80Var2.R;
                            if (v6Var != null) {
                                v6Var.run();
                                r80Var2.R = null;
                            }
                            ac.e();
                            boolean z18 = r80Var2.S.getClosestTab() == 9;
                            ArrayList arrayList = new ArrayList();
                            if (r80Var2.w != null) {
                                int i16 = 0;
                                for (int i17 = 0; i17 < r80Var2.w.size(); i17++) {
                                    TL_stories.StoryItem storyItem = ((org.telegram.messenger.zi) r80Var2.w.valueAt(i17)).l;
                                    if (storyItem != null) {
                                        arrayList.add(storyItem);
                                        i16++;
                                    }
                                }
                                i12 = i16;
                            } else {
                                i12 = 0;
                            }
                            r80Var2.S.V(false);
                            if (z18) {
                                r80Var2.S.i1(8);
                            }
                            if (!arrayList.isEmpty()) {
                                boolean[] zArr = new boolean[arrayList.size()];
                                for (int i18 = 0; i18 < arrayList.size(); i18++) {
                                    TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) arrayList.get(i18);
                                    zArr[i18] = storyItem2.pinned;
                                    storyItem2.pinned = z18;
                                }
                                r80Var2.getMessagesController().P1().q0(r80Var2.e, arrayList, false);
                                boolean[] zArr2 = {false};
                                r80Var2.R = new ci.v6(r80Var2, arrayList, z18, 21);
                                v60 v60Var = new v60(r80Var2, zArr2, arrayList, zArr, 2);
                                (z18 ? fc.a0(r80Var2).L(R.raw.contact_check, org.telegram.messenger.bd.G(i12, "StorySavedTitle", new Object[0]), org.telegram.messenger.bd.M0(2131744494, null), org.telegram.messenger.bd.M0(2131743897, null), v60Var).j() : fc.a0(r80Var2).J(R.raw.chats_archived, org.telegram.messenger.bd.G(i12, "StoryArchived", new Object[0]), org.telegram.messenger.bd.M0(2131743897, null), 5000, false, v60Var).j()).v = new j50(4, r80Var2, zArr2);
                                break;
                            }
                            break;
                    }
                }
            });
            org.telegram.ui.ActionBar.y0 e12 = this.s.e(10, R.drawable.msg_calendar2, org.telegram.messenger.bd.M0(2131752642, null));
            this.H = e12;
            e12.setEnabled(false);
            this.H.setAlpha(0.5f);
            this.s.a(-1);
            org.telegram.ui.ActionBar.f5 f5Var = this.s;
            org.telegram.ui.ActionBar.y0 d = f5Var.d(6, 0, null, org.telegram.messenger.bd.M0(2131748661, null), true, true, f5Var.n0);
            this.x = d;
            d.setChecked(this.E);
            final int i12 = 2;
            this.x.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.o80
                public final /* synthetic */ r80 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ei.r6 r6Var;
                    ei.r6 r6Var2;
                    ei.r6 r6Var3;
                    ei.r6 r6Var4;
                    int i122;
                    int i13 = i12;
                    org.telegram.messenger.p2 p2Var = org.telegram.messenger.p2.E;
                    r80 r80Var = this.b;
                    switch (i13) {
                        case 0:
                            Boolean O1 = r80Var.S.O1(null, null);
                            if (O1 != null) {
                                r80Var.i0(true, O1.booleanValue());
                                break;
                            }
                            break;
                        case 1:
                            Boolean P1 = r80Var.S.P1(null, null);
                            if (P1 != null) {
                                r80Var.i0(P1.booleanValue(), true);
                                break;
                            }
                            break;
                        case 2:
                            boolean z10 = r80Var.E;
                            if (z10 && !r80Var.F) {
                                p2Var.a();
                                org.telegram.ui.ActionBar.y0 y0Var = r80Var.x;
                                int i14 = -r80Var.G;
                                r80Var.G = i14;
                                org.telegram.messenger.g0.G3(i14, y0Var, null);
                                break;
                            } else {
                                org.telegram.ui.ActionBar.y0 y0Var2 = r80Var.x;
                                boolean z11 = !z10;
                                r80Var.E = z11;
                                y0Var2.setChecked(z11);
                                q80 q80Var2 = r80Var.S;
                                boolean z12 = r80Var.E;
                                boolean z13 = r80Var.F;
                                gr0 gr0Var = q80Var2.f0;
                                if (gr0Var != null && (r6Var2 = gr0Var.s) != null) {
                                    r6Var2.n = z12;
                                    r6Var2.o = z13;
                                    r6Var2.d(true);
                                }
                                rp0 rp0Var = q80Var2.h0;
                                if (rp0Var != null && (r6Var = rp0Var.s) != null) {
                                    r6Var.n = z12;
                                    r6Var.o = z13;
                                    r6Var.d(true);
                                    break;
                                }
                            }
                            break;
                        case 3:
                            boolean z14 = r80Var.F;
                            if (z14 && !r80Var.E) {
                                p2Var.a();
                                org.telegram.ui.ActionBar.y0 y0Var3 = r80Var.y;
                                int i15 = -r80Var.G;
                                r80Var.G = i15;
                                org.telegram.messenger.g0.G3(i15, y0Var3, null);
                                break;
                            } else {
                                org.telegram.ui.ActionBar.y0 y0Var4 = r80Var.y;
                                boolean z15 = !z14;
                                r80Var.F = z15;
                                y0Var4.setChecked(z15);
                                q80 q80Var3 = r80Var.S;
                                boolean z16 = r80Var.E;
                                boolean z17 = r80Var.F;
                                gr0 gr0Var2 = q80Var3.f0;
                                if (gr0Var2 != null && (r6Var4 = gr0Var2.s) != null) {
                                    r6Var4.n = z16;
                                    r6Var4.o = z17;
                                    r6Var4.d(true);
                                }
                                rp0 rp0Var2 = q80Var3.h0;
                                if (rp0Var2 != null && (r6Var3 = rp0Var2.s) != null) {
                                    r6Var3.n = z16;
                                    r6Var3.o = z17;
                                    r6Var3.d(true);
                                    break;
                                }
                            }
                            break;
                        default:
                            r80 r80Var2 = this.b;
                            ci.v6 v6Var = r80Var2.R;
                            if (v6Var != null) {
                                v6Var.run();
                                r80Var2.R = null;
                            }
                            ac.e();
                            boolean z18 = r80Var2.S.getClosestTab() == 9;
                            ArrayList arrayList = new ArrayList();
                            if (r80Var2.w != null) {
                                int i16 = 0;
                                for (int i17 = 0; i17 < r80Var2.w.size(); i17++) {
                                    TL_stories.StoryItem storyItem = ((org.telegram.messenger.zi) r80Var2.w.valueAt(i17)).l;
                                    if (storyItem != null) {
                                        arrayList.add(storyItem);
                                        i16++;
                                    }
                                }
                                i122 = i16;
                            } else {
                                i122 = 0;
                            }
                            r80Var2.S.V(false);
                            if (z18) {
                                r80Var2.S.i1(8);
                            }
                            if (!arrayList.isEmpty()) {
                                boolean[] zArr = new boolean[arrayList.size()];
                                for (int i18 = 0; i18 < arrayList.size(); i18++) {
                                    TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) arrayList.get(i18);
                                    zArr[i18] = storyItem2.pinned;
                                    storyItem2.pinned = z18;
                                }
                                r80Var2.getMessagesController().P1().q0(r80Var2.e, arrayList, false);
                                boolean[] zArr2 = {false};
                                r80Var2.R = new ci.v6(r80Var2, arrayList, z18, 21);
                                v60 v60Var = new v60(r80Var2, zArr2, arrayList, zArr, 2);
                                (z18 ? fc.a0(r80Var2).L(R.raw.contact_check, org.telegram.messenger.bd.G(i122, "StorySavedTitle", new Object[0]), org.telegram.messenger.bd.M0(2131744494, null), org.telegram.messenger.bd.M0(2131743897, null), v60Var).j() : fc.a0(r80Var2).J(R.raw.chats_archived, org.telegram.messenger.bd.G(i122, "StoryArchived", new Object[0]), org.telegram.messenger.bd.M0(2131743897, null), 5000, false, v60Var).j()).v = new j50(4, r80Var2, zArr2);
                                break;
                            }
                            break;
                    }
                }
            });
            org.telegram.ui.ActionBar.f5 f5Var2 = this.s;
            org.telegram.ui.ActionBar.y0 d10 = f5Var2.d(7, 0, null, org.telegram.messenger.bd.M0(2131748660, null), true, true, f5Var2.n0);
            this.y = d10;
            d10.setChecked(this.F);
            this.y.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.o80
                public final /* synthetic */ r80 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ei.r6 r6Var;
                    ei.r6 r6Var2;
                    ei.r6 r6Var3;
                    ei.r6 r6Var4;
                    int i122;
                    int i13 = i11;
                    org.telegram.messenger.p2 p2Var = org.telegram.messenger.p2.E;
                    r80 r80Var = this.b;
                    switch (i13) {
                        case 0:
                            Boolean O1 = r80Var.S.O1(null, null);
                            if (O1 != null) {
                                r80Var.i0(true, O1.booleanValue());
                                break;
                            }
                            break;
                        case 1:
                            Boolean P1 = r80Var.S.P1(null, null);
                            if (P1 != null) {
                                r80Var.i0(P1.booleanValue(), true);
                                break;
                            }
                            break;
                        case 2:
                            boolean z10 = r80Var.E;
                            if (z10 && !r80Var.F) {
                                p2Var.a();
                                org.telegram.ui.ActionBar.y0 y0Var = r80Var.x;
                                int i14 = -r80Var.G;
                                r80Var.G = i14;
                                org.telegram.messenger.g0.G3(i14, y0Var, null);
                                break;
                            } else {
                                org.telegram.ui.ActionBar.y0 y0Var2 = r80Var.x;
                                boolean z11 = !z10;
                                r80Var.E = z11;
                                y0Var2.setChecked(z11);
                                q80 q80Var2 = r80Var.S;
                                boolean z12 = r80Var.E;
                                boolean z13 = r80Var.F;
                                gr0 gr0Var = q80Var2.f0;
                                if (gr0Var != null && (r6Var2 = gr0Var.s) != null) {
                                    r6Var2.n = z12;
                                    r6Var2.o = z13;
                                    r6Var2.d(true);
                                }
                                rp0 rp0Var = q80Var2.h0;
                                if (rp0Var != null && (r6Var = rp0Var.s) != null) {
                                    r6Var.n = z12;
                                    r6Var.o = z13;
                                    r6Var.d(true);
                                    break;
                                }
                            }
                            break;
                        case 3:
                            boolean z14 = r80Var.F;
                            if (z14 && !r80Var.E) {
                                p2Var.a();
                                org.telegram.ui.ActionBar.y0 y0Var3 = r80Var.y;
                                int i15 = -r80Var.G;
                                r80Var.G = i15;
                                org.telegram.messenger.g0.G3(i15, y0Var3, null);
                                break;
                            } else {
                                org.telegram.ui.ActionBar.y0 y0Var4 = r80Var.y;
                                boolean z15 = !z14;
                                r80Var.F = z15;
                                y0Var4.setChecked(z15);
                                q80 q80Var3 = r80Var.S;
                                boolean z16 = r80Var.E;
                                boolean z17 = r80Var.F;
                                gr0 gr0Var2 = q80Var3.f0;
                                if (gr0Var2 != null && (r6Var4 = gr0Var2.s) != null) {
                                    r6Var4.n = z16;
                                    r6Var4.o = z17;
                                    r6Var4.d(true);
                                }
                                rp0 rp0Var2 = q80Var3.h0;
                                if (rp0Var2 != null && (r6Var3 = rp0Var2.s) != null) {
                                    r6Var3.n = z16;
                                    r6Var3.o = z17;
                                    r6Var3.d(true);
                                    break;
                                }
                            }
                            break;
                        default:
                            r80 r80Var2 = this.b;
                            ci.v6 v6Var = r80Var2.R;
                            if (v6Var != null) {
                                v6Var.run();
                                r80Var2.R = null;
                            }
                            ac.e();
                            boolean z18 = r80Var2.S.getClosestTab() == 9;
                            ArrayList arrayList = new ArrayList();
                            if (r80Var2.w != null) {
                                int i16 = 0;
                                for (int i17 = 0; i17 < r80Var2.w.size(); i17++) {
                                    TL_stories.StoryItem storyItem = ((org.telegram.messenger.zi) r80Var2.w.valueAt(i17)).l;
                                    if (storyItem != null) {
                                        arrayList.add(storyItem);
                                        i16++;
                                    }
                                }
                                i122 = i16;
                            } else {
                                i122 = 0;
                            }
                            r80Var2.S.V(false);
                            if (z18) {
                                r80Var2.S.i1(8);
                            }
                            if (!arrayList.isEmpty()) {
                                boolean[] zArr = new boolean[arrayList.size()];
                                for (int i18 = 0; i18 < arrayList.size(); i18++) {
                                    TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) arrayList.get(i18);
                                    zArr[i18] = storyItem2.pinned;
                                    storyItem2.pinned = z18;
                                }
                                r80Var2.getMessagesController().P1().q0(r80Var2.e, arrayList, false);
                                boolean[] zArr2 = {false};
                                r80Var2.R = new ci.v6(r80Var2, arrayList, z18, 21);
                                v60 v60Var = new v60(r80Var2, zArr2, arrayList, zArr, 2);
                                (z18 ? fc.a0(r80Var2).L(R.raw.contact_check, org.telegram.messenger.bd.G(i122, "StorySavedTitle", new Object[0]), org.telegram.messenger.bd.M0(2131744494, null), org.telegram.messenger.bd.M0(2131743897, null), v60Var).j() : fc.a0(r80Var2).J(R.raw.chats_archived, org.telegram.messenger.bd.G(i122, "StoryArchived", new Object[0]), org.telegram.messenger.bd.M0(2131743897, null), 5000, false, v60Var).j()).v = new j50(4, r80Var2, zArr2);
                                break;
                            }
                            break;
                    }
                }
            });
        }
        int i13 = this.a;
        rh.b[] bVarArr = this.L;
        if (i13 == 1) {
            org.telegram.ui.ge0 ge0Var = new org.telegram.ui.ge0(context, getResourceProvider());
            this.K = ge0Var;
            ge0Var.setClipChildren(false);
            this.K.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f));
            bVarArr[0] = rh.b.c(context, getResourceProvider(), rh.a.R, 2131746659);
            bVarArr[1] = rh.b.c(context, getResourceProvider(), rh.a.S, 2131746635);
            for (int i14 = 0; i14 < bVarArr.length; i14++) {
                bVarArr[i14].setOnClickListener(new bi.q(this, i14, 14));
                this.K.addView(bVarArr[i14]);
                this.K.i(bVarArr[i14], true, false);
            }
            aVar = baseSimpleGlass;
            gh.g c2 = aVar.c.c(this.K, b8.cd.f(getResourceProvider()), false);
            org.telegram.messenger.camera.q.p(c2, org.telegram.messenger.g0.L(28.0f), 7.666f);
            this.K.setBackground(c2);
            o2Var.addView(this.K, b8.mf.e(-2, 72, 81));
            FrameLayout frameLayout = new FrameLayout(context);
            this.N = frameLayout;
            frameLayout.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(8.0f));
            gi.d dVar = new gi.d(context, getResourceProvider(), true);
            this.O = dVar;
            dVar.i(org.telegram.messenger.bd.M0(2131745919, null), false, true);
            this.O.setShowZero(true);
            this.O.c(0, false);
            this.O.setEnabled(false);
            final int i15 = 4;
            this.O.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.o80
                public final /* synthetic */ r80 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ei.r6 r6Var;
                    ei.r6 r6Var2;
                    ei.r6 r6Var3;
                    ei.r6 r6Var4;
                    int i122;
                    int i132 = i15;
                    org.telegram.messenger.p2 p2Var = org.telegram.messenger.p2.E;
                    r80 r80Var = this.b;
                    switch (i132) {
                        case 0:
                            Boolean O1 = r80Var.S.O1(null, null);
                            if (O1 != null) {
                                r80Var.i0(true, O1.booleanValue());
                                break;
                            }
                            break;
                        case 1:
                            Boolean P1 = r80Var.S.P1(null, null);
                            if (P1 != null) {
                                r80Var.i0(P1.booleanValue(), true);
                                break;
                            }
                            break;
                        case 2:
                            boolean z10 = r80Var.E;
                            if (z10 && !r80Var.F) {
                                p2Var.a();
                                org.telegram.ui.ActionBar.y0 y0Var = r80Var.x;
                                int i142 = -r80Var.G;
                                r80Var.G = i142;
                                org.telegram.messenger.g0.G3(i142, y0Var, null);
                                break;
                            } else {
                                org.telegram.ui.ActionBar.y0 y0Var2 = r80Var.x;
                                boolean z11 = !z10;
                                r80Var.E = z11;
                                y0Var2.setChecked(z11);
                                q80 q80Var2 = r80Var.S;
                                boolean z12 = r80Var.E;
                                boolean z13 = r80Var.F;
                                gr0 gr0Var = q80Var2.f0;
                                if (gr0Var != null && (r6Var2 = gr0Var.s) != null) {
                                    r6Var2.n = z12;
                                    r6Var2.o = z13;
                                    r6Var2.d(true);
                                }
                                rp0 rp0Var = q80Var2.h0;
                                if (rp0Var != null && (r6Var = rp0Var.s) != null) {
                                    r6Var.n = z12;
                                    r6Var.o = z13;
                                    r6Var.d(true);
                                    break;
                                }
                            }
                            break;
                        case 3:
                            boolean z14 = r80Var.F;
                            if (z14 && !r80Var.E) {
                                p2Var.a();
                                org.telegram.ui.ActionBar.y0 y0Var3 = r80Var.y;
                                int i152 = -r80Var.G;
                                r80Var.G = i152;
                                org.telegram.messenger.g0.G3(i152, y0Var3, null);
                                break;
                            } else {
                                org.telegram.ui.ActionBar.y0 y0Var4 = r80Var.y;
                                boolean z15 = !z14;
                                r80Var.F = z15;
                                y0Var4.setChecked(z15);
                                q80 q80Var3 = r80Var.S;
                                boolean z16 = r80Var.E;
                                boolean z17 = r80Var.F;
                                gr0 gr0Var2 = q80Var3.f0;
                                if (gr0Var2 != null && (r6Var4 = gr0Var2.s) != null) {
                                    r6Var4.n = z16;
                                    r6Var4.o = z17;
                                    r6Var4.d(true);
                                }
                                rp0 rp0Var2 = q80Var3.h0;
                                if (rp0Var2 != null && (r6Var3 = rp0Var2.s) != null) {
                                    r6Var3.n = z16;
                                    r6Var3.o = z17;
                                    r6Var3.d(true);
                                    break;
                                }
                            }
                            break;
                        default:
                            r80 r80Var2 = this.b;
                            ci.v6 v6Var = r80Var2.R;
                            if (v6Var != null) {
                                v6Var.run();
                                r80Var2.R = null;
                            }
                            ac.e();
                            boolean z18 = r80Var2.S.getClosestTab() == 9;
                            ArrayList arrayList = new ArrayList();
                            if (r80Var2.w != null) {
                                int i16 = 0;
                                for (int i17 = 0; i17 < r80Var2.w.size(); i17++) {
                                    TL_stories.StoryItem storyItem = ((org.telegram.messenger.zi) r80Var2.w.valueAt(i17)).l;
                                    if (storyItem != null) {
                                        arrayList.add(storyItem);
                                        i16++;
                                    }
                                }
                                i122 = i16;
                            } else {
                                i122 = 0;
                            }
                            r80Var2.S.V(false);
                            if (z18) {
                                r80Var2.S.i1(8);
                            }
                            if (!arrayList.isEmpty()) {
                                boolean[] zArr = new boolean[arrayList.size()];
                                for (int i18 = 0; i18 < arrayList.size(); i18++) {
                                    TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) arrayList.get(i18);
                                    zArr[i18] = storyItem2.pinned;
                                    storyItem2.pinned = z18;
                                }
                                r80Var2.getMessagesController().P1().q0(r80Var2.e, arrayList, false);
                                boolean[] zArr2 = {false};
                                r80Var2.R = new ci.v6(r80Var2, arrayList, z18, 21);
                                v60 v60Var = new v60(r80Var2, zArr2, arrayList, zArr, 2);
                                (z18 ? fc.a0(r80Var2).L(R.raw.contact_check, org.telegram.messenger.bd.G(i122, "StorySavedTitle", new Object[0]), org.telegram.messenger.bd.M0(2131744494, null), org.telegram.messenger.bd.M0(2131743897, null), v60Var).j() : fc.a0(r80Var2).J(R.raw.chats_archived, org.telegram.messenger.bd.G(i122, "StoryArchived", new Object[0]), org.telegram.messenger.bd.M0(2131743897, null), 5000, false, v60Var).j()).v = new j50(4, r80Var2, zArr2);
                                break;
                            }
                            break;
                    }
                }
            });
            this.N.addView(this.O, b8.mf.c(56.0f, -1));
            this.N.setVisibility(4);
            o2Var.addView(this.N, b8.mf.e(-1, 72, 80));
            this.P = new qe.a(0, new zw(this, 8), xq.h, 320L, false);
            setBulletinDelegate(new ai.h1(this, 9));
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
        org.telegram.ui.ge0 ge0Var2 = this.K;
        o2Var.addView(view4, ge0Var2 != null ? o2Var.indexOfChild(ge0Var2) : o2Var.getChildCount(), b8.mf.e(-1, 0, 80));
        org.telegram.ui.ActionBar.y4 y4Var = this.simpleActionBar;
        org.telegram.ui.ActionBar.e6 resourceProvider = getResourceProvider();
        aVar.l = o2Var;
        aVar.m = null;
        aVar.g(o2Var, y4Var, resourceProvider);
        aVar.n = new ci.g(5, this, o2Var);
        this.S.setPagesGlassEngine(this.glassEngine);
        this.simpleActionBar.setBackground(null);
        h0(false);
        if (this.a == 3 && (i3 = this.r) != -1) {
            this.simpleActionBar.setSubtitle(org.telegram.messenger.bd.H(' ', "FoundStories", i3));
        }
        b0();
        g0();
        if (this.a == 1) {
            r13 = this.T != 9 ? 0 : 1;
            org.telegram.ui.ge0 ge0Var3 = this.K;
            if (ge0Var3 != null && this.M != r13) {
                this.M = r13;
                ge0Var3.q(bVarArr[r13], false);
            }
        }
        return o2Var;
    }

    public final boolean d0() {
        int i3 = this.a;
        return i3 == 1 || i3 == 2;
    }

    @Override // org.telegram.messenger.cs
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        if (i3 == org.telegram.messenger.hs.E0 && ((Long) objArr[0]).longValue() == this.e) {
            TLRPC.UserFull userFull = (TLRPC.UserFull) objArr[1];
            this.d = userFull;
            q80 q80Var = this.S;
            if (q80Var != null) {
                q80Var.setUserInfo(userFull);
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
        int i3;
        q80 q80Var = this.S;
        if (q80Var == null || this.simpleActionBar == null) {
            return;
        }
        int closestTab = q80Var.getClosestTab();
        if (this.a != 3 || closestTab == 8) {
            int[] iArr = this.b.c;
            boolean z10 = org.telegram.messenger.bd.a0;
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
                        f0(org.telegram.messenger.bd.H(' ', "FoundStories", m0));
                    }
                } else if (closestTab == 8) {
                    f0(m0 > 0 ? org.telegram.messenger.bd.G(m0, "ProfileMyStoriesCount", new Object[0]) : null);
                } else {
                    f0(m0 > 0 ? org.telegram.messenger.bd.G(m0, "ProfileStoriesArchiveCount", new Object[0]) : null);
                }
                h0(true);
                org.telegram.ui.ActionBar.f5 f5Var = this.s;
                if (f5Var != null) {
                    f5Var.Y(m0 > 0, true);
                }
                gi.d dVar = this.O;
                if (dVar != null) {
                    boolean z11 = !z10 && this.V == closestTab;
                    if (closestTab == 8) {
                        SparseArray sparseArray = this.w;
                        dVar.i(org.telegram.messenger.bd.G(sparseArray == null ? 0 : sparseArray.size(), "ArchiveStories", new Object[0]), z11, true);
                    } else {
                        dVar.i(org.telegram.messenger.bd.M0(2131745919, null), z11, true);
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
                f0(org.telegram.messenger.bd.G(getMessagesController().G1().c(), "SavedDialogsTabCount", new Object[0]));
                return;
            }
            if (closestTab >= 0) {
                if (closestTab >= iArr.length || iArr[closestTab] >= 0) {
                    if (closestTab == 0) {
                        if (this.S.getPhotosVideosTypeFilter() == 1) {
                            f0(org.telegram.messenger.bd.G(iArr[6], "Photos", new Object[0]));
                            return;
                        } else if (this.S.getPhotosVideosTypeFilter() == 2) {
                            f0(org.telegram.messenger.bd.G(iArr[7], "Videos", new Object[0]));
                            return;
                        } else {
                            f0(org.telegram.messenger.bd.G(iArr[0], "Media", new Object[0]));
                            return;
                        }
                    }
                    if (closestTab == 1) {
                        f0(org.telegram.messenger.bd.G(iArr[1], "Files", new Object[0]));
                        return;
                    }
                    if (closestTab == 2) {
                        f0(org.telegram.messenger.bd.G(iArr[2], "Voice", new Object[0]));
                        return;
                    }
                    if (closestTab == 3) {
                        f0(org.telegram.messenger.bd.G(iArr[3], "Links", new Object[0]));
                        return;
                    }
                    if (closestTab == 4) {
                        f0(org.telegram.messenger.bd.G(iArr[4], "MusicFiles", new Object[0]));
                        return;
                    }
                    if (closestTab == 5) {
                        f0(org.telegram.messenger.bd.G(iArr[5], "GIFs", new Object[0]));
                        return;
                    }
                    if (closestTab == 15 && (i3 = iArr[8]) >= 0) {
                        f0(org.telegram.messenger.bd.G(i3, "ProfilePollsCount", new Object[0]));
                    } else if (closestTab == 10) {
                        org.telegram.messenger.io L0 = org.telegram.messenger.hp.s1(this.currentAccount).L0(this.e);
                        f0(org.telegram.messenger.bd.G(L0 == null ? 0 : L0.b.size() + L0.c, "Channels", new Object[0]));
                    }
                }
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final int getNavigationBarColor() {
        int navigationBarColor = super.getNavigationBarColor();
        return (getLastStoryViewer() == null || !getLastStoryViewer().y()) ? navigationBarColor : getLastStoryViewer().e(navigationBarColor);
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.S.getThemeDescriptions());
        return arrayList;
    }

    public final void h0(boolean z10) {
        String str;
        int i3 = this.a;
        boolean z11 = true;
        if (i3 == 3) {
            str = this.h;
        } else {
            if (i3 == 2) {
                str = org.telegram.messenger.bd.M0(2131746642, null);
            } else if (i3 == 1) {
                q80 q80Var = this.S;
                if (q80Var != null && q80Var.getClosestTab() != 9) {
                    z11 = false;
                }
                str = org.telegram.messenger.bd.M0(z11 ? 2131746642 : 2131746663, null);
            } else {
                long j10 = (this.f == 0 || this.e != getUserConfig().e()) ? this.e : this.f;
                if (j10 == 2666000) {
                    str = org.telegram.messenger.bd.M0(2131754252, null);
                } else if (this.f != 0 && j10 == getUserConfig().e()) {
                    str = org.telegram.messenger.bd.M0(2131748311, null);
                } else if (org.telegram.messenger.m5.C(j10)) {
                    TLRPC.EncryptedChat a12 = getMessagesController().a1(Integer.valueOf((int) (j10 & 4294967295L)));
                    TLRPC.User a22 = a12 != null ? getMessagesController().a2(Long.valueOf(a12.user_id)) : null;
                    if (a22 != null) {
                        str = org.telegram.messenger.g5.m(0, a22.first_name, a22.last_name);
                    }
                    str = null;
                } else if (org.telegram.messenger.m5.E(j10)) {
                    TLRPC.User a23 = getMessagesController().a2(Long.valueOf(j10));
                    if (a23 != null) {
                        str = a23.self ? org.telegram.messenger.bd.M0(2131745911, null) : org.telegram.messenger.g5.m(0, a23.first_name, a23.last_name);
                    }
                    str = null;
                } else {
                    TLRPC.Chat M0 = getMessagesController().M0(Long.valueOf(-j10));
                    if (M0 != null) {
                        str = M0.title;
                    }
                    str = null;
                }
                if (TextUtils.isEmpty(str)) {
                    str = org.telegram.messenger.bd.M0(2131745425, null);
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
        org.telegram.ui.ActionBar.y4 y4Var = this.simpleActionBar;
        y4Var.getClass();
        y4Var.A(str2, z12, 320L, xq.h);
    }

    public final void i0(boolean z10, boolean z11) {
        this.J.setEnabled(z10);
        this.J.animate().alpha(z10 ? 1.0f : 0.5f).start();
        this.I.setEnabled(z11);
        this.I.animate().alpha(z11 ? 1.0f : 0.5f).start();
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        if (!this.S.J0()) {
            return false;
        }
        q80 q80Var = this.S;
        return q80Var.getSelectedTab() == q80Var.L0.getFirstTabId();
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean onBackPressed(boolean z10) {
        if (!hasShownSheet()) {
            q80 q80Var = this.S;
            if (!q80Var.F1) {
                return super.onBackPressed(z10);
            }
            if (z10) {
                q80Var.V(false);
            }
        } else if (z10) {
            closeSheet();
            return false;
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean onFragmentCreate() {
        this.a = getArguments().getInt(TeXSymbolParser.TYPE_ATTR, 0);
        this.e = getArguments().getLong("dialog_id");
        this.f = getArguments().getLong("topic_id", 0L);
        this.h = getArguments().getString("hashtag", "");
        this.n = getArguments().getString("username", "");
        this.r = getArguments().getInt("storiesCount", -1);
        int i3 = this.a;
        this.T = getArguments().getInt("start_from", i3 == 2 ? 9 : i3 == 1 ? 8 : 0);
        getNotificationCenter().c(this, org.telegram.messenger.hs.E0);
        getNotificationCenter().c(this, org.telegram.messenger.hs.f5);
        getNotificationCenter().c(this, org.telegram.messenger.hs.Z2);
        if (org.telegram.messenger.m5.E(this.e) && this.f == 0) {
            TLRPC.User a22 = getMessagesController().a2(Long.valueOf(this.e));
            if (org.telegram.messenger.l10.B(a22)) {
                getMessagesController().g3(a22, false, this.classGuid);
                this.d = getMessagesController().b2(this.e);
            }
        }
        if (this.b == null) {
            this.b = new os0(this);
        }
        this.b.y.add(this);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().n(this, org.telegram.messenger.hs.E0);
        getNotificationCenter().n(this, org.telegram.messenger.hs.f5);
        getNotificationCenter().n(this, org.telegram.messenger.hs.Z2);
        ci.v6 v6Var = this.R;
        if (v6Var != null) {
            this.R = null;
            org.telegram.messenger.g0.h3(v6Var);
        }
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onInsets(int i3, int i10, int i11, int i12) {
        b0();
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean useSimpleActionBar() {
        return true;
    }
}
