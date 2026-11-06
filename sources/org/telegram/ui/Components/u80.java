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

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class u80 extends org.telegram.ui.ActionBar.f2 implements qs0, pg.b, org.telegram.messenger.ls {
    public boolean D;
    public boolean E;
    public int F;
    public org.telegram.ui.ActionBar.z0 G;
    public org.telegram.ui.ActionBar.z0 H;
    public org.telegram.ui.ActionBar.z0 I;
    public org.telegram.ui.le0 J;
    public final qh.b[] K;
    public int L;
    public FrameLayout M;
    public fi.d N;
    public te.a O;
    public View P;
    public bi.u7 Q;
    public t80 R;
    public int S;
    public String T;
    public int U;
    public int a;
    public ps0 b;
    public TLRPC.ChatFull c;
    public TLRPC.UserFull d;
    public long e;
    public long f;
    public String h;
    public String n;
    public int r;
    public org.telegram.ui.ActionBar.f5 s;
    public SparseArray w;
    public org.telegram.ui.ActionBar.z0 x;
    public org.telegram.ui.ActionBar.z0 y;

    public u80(Bundle bundle, ps0 ps0Var) {
        super(bundle);
        this.D = true;
        this.E = true;
        this.F = -12;
        this.K = new qh.b[2];
        this.L = -1;
        this.b = ps0Var;
    }

    @Override // pg.b
    public final List E() {
        Activity parentActivity = getParentActivity();
        org.telegram.messenger.q5 q5Var = sg.d1.m;
        return Arrays.asList(new pg.a((parentActivity.getSharedPreferences("shapedetector_conf", 0).getBoolean("learning", false) ? "Disable" : "Enable").concat(" shape detector learning debug"), new q80(this, 1)));
    }

    @Override // org.telegram.ui.Components.qs0
    public final void Q() {
        ps0 ps0Var;
        t80 t80Var = this.R;
        if (t80Var != null && (ps0Var = this.b) != null) {
            t80Var.setNewMediaCounts(ps0Var.c);
        }
        g0();
    }

    public final void b0() {
        if (this.R == null) {
            return;
        }
        int i7 = 0;
        int L = this.J != null ? org.telegram.messenger.g0.L(72.0f) : 0;
        t80 t80Var = this.R;
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + this.mSystemInsets.b;
        int[] iArr = xs0.s2;
        t80Var.l1(oi.a.d(currentActionBarHeight - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - org.telegram.messenger.g0.L(6.666f), oi.a.c(this.mSystemInsets.b), oi.a.c(this.mSystemInsets.d + L), this.mSystemInsets.d + L);
        if (this.P != null) {
            int topPanelShift = this.R.getTopPanelShift() + org.telegram.messenger.g0.L(44.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + this.mSystemInsets.b;
            if (this.P.getLayoutParams().height != topPanelShift) {
                this.P.getLayoutParams().height = topPanelShift;
                this.P.requestLayout();
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
        if (this.J == null) {
            return;
        }
        float f10 = this.O.e;
        float L = org.telegram.messenger.g0.L(72.0f) + this.mSystemInsets.d;
        this.J.setTranslationY((L * f10) + (-r2));
        float f11 = 1.0f - f10;
        this.J.setAlpha(f11);
        this.J.setVisibility(f10 < 1.0f ? 0 : 4);
        this.M.setTranslationY((L * f11) + (-this.mSystemInsets.d));
        this.M.setAlpha(f10);
        this.M.setVisibility(f10 > 0.0f ? 0 : 4);
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean canBeginSlide() {
        if (this.R.J0()) {
            return super.canBeginSlide();
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final View createView(Context context) {
        oi.a aVar;
        int i7;
        setHasOwnBackground(true);
        final int i10 = 0;
        this.simpleActionBar.setBackButtonDrawable(new org.telegram.ui.ActionBar.y1(false));
        this.simpleActionBar.setActionBarMenuOnItemClick(new org.telegram.ui.w9(this, 14));
        bi.e5 e5Var = new bi.e5(21, context, this);
        this.fragmentView = e5Var;
        if (this.a == 0 && this.e == getUserConfig().e() && this.f == 0 && !getMessagesController().G1().b && getMessagesController().G1().e()) {
            this.S = 11;
        }
        oi.a baseSimpleGlass = getBaseSimpleGlass();
        t80 t80Var = new t80(this, context, this.e, this.b, this.c, this.d, this.S, this, new s80(this), getResourceProvider(), baseSimpleGlass.c);
        this.R = t80Var;
        t80Var.setOnTopPanelShiftChanged(new q80(this, i10));
        this.R.K0.setOpen(true);
        this.R.setPinnedToTop(true);
        e5Var.addView(this.R, c8.ha.c(-1.0f, -1));
        final int i11 = 3;
        if (d0()) {
            org.telegram.ui.ActionBar.f5 b10 = this.simpleActionBar.o().b(0, R.drawable.ic_ab_other);
            this.s = b10;
            b10.setContentDescription(org.telegram.messenger.hd.M0(2131754839, null));
            this.s.Y(false, false);
            org.telegram.ui.ActionBar.z0 e10 = this.s.e(8, R.drawable.msg_zoomin, org.telegram.messenger.hd.M0(2131748649, null));
            this.H = e10;
            e10.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.r80
                public final /* synthetic */ u80 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    di.q6 q6Var;
                    di.q6 q6Var2;
                    di.q6 q6Var3;
                    di.q6 q6Var4;
                    int i12;
                    int i13 = i10;
                    org.telegram.messenger.p2 p2Var = org.telegram.messenger.p2.D;
                    u80 u80Var = this.b;
                    switch (i13) {
                        case 0:
                            Boolean O1 = u80Var.R.O1(null, null);
                            if (O1 != null) {
                                u80Var.i0(true, O1.booleanValue());
                                break;
                            }
                            break;
                        case 1:
                            Boolean P1 = u80Var.R.P1(null, null);
                            if (P1 != null) {
                                u80Var.i0(P1.booleanValue(), true);
                                break;
                            }
                            break;
                        case 2:
                            boolean z9 = u80Var.D;
                            if (z9 && !u80Var.E) {
                                p2Var.a();
                                org.telegram.ui.ActionBar.z0 z0Var = u80Var.x;
                                int i14 = -u80Var.F;
                                u80Var.F = i14;
                                org.telegram.messenger.g0.G3(i14, z0Var, null);
                                break;
                            } else {
                                org.telegram.ui.ActionBar.z0 z0Var2 = u80Var.x;
                                boolean z10 = !z9;
                                u80Var.D = z10;
                                z0Var2.setChecked(z10);
                                t80 t80Var2 = u80Var.R;
                                boolean z11 = u80Var.D;
                                boolean z12 = u80Var.E;
                                gr0 gr0Var = t80Var2.e0;
                                if (gr0Var != null && (q6Var2 = gr0Var.s) != null) {
                                    q6Var2.n = z11;
                                    q6Var2.o = z12;
                                    q6Var2.d(true);
                                }
                                rp0 rp0Var = t80Var2.g0;
                                if (rp0Var != null && (q6Var = rp0Var.s) != null) {
                                    q6Var.n = z11;
                                    q6Var.o = z12;
                                    q6Var.d(true);
                                    break;
                                }
                            }
                            break;
                        case 3:
                            boolean z13 = u80Var.E;
                            if (z13 && !u80Var.D) {
                                p2Var.a();
                                org.telegram.ui.ActionBar.z0 z0Var3 = u80Var.y;
                                int i15 = -u80Var.F;
                                u80Var.F = i15;
                                org.telegram.messenger.g0.G3(i15, z0Var3, null);
                                break;
                            } else {
                                org.telegram.ui.ActionBar.z0 z0Var4 = u80Var.y;
                                boolean z14 = !z13;
                                u80Var.E = z14;
                                z0Var4.setChecked(z14);
                                t80 t80Var3 = u80Var.R;
                                boolean z15 = u80Var.D;
                                boolean z16 = u80Var.E;
                                gr0 gr0Var2 = t80Var3.e0;
                                if (gr0Var2 != null && (q6Var4 = gr0Var2.s) != null) {
                                    q6Var4.n = z15;
                                    q6Var4.o = z16;
                                    q6Var4.d(true);
                                }
                                rp0 rp0Var2 = t80Var3.g0;
                                if (rp0Var2 != null && (q6Var3 = rp0Var2.s) != null) {
                                    q6Var3.n = z15;
                                    q6Var3.o = z16;
                                    q6Var3.d(true);
                                    break;
                                }
                            }
                            break;
                        default:
                            u80 u80Var2 = this.b;
                            bi.u7 u7Var = u80Var2.Q;
                            if (u7Var != null) {
                                u7Var.run();
                                u80Var2.Q = null;
                            }
                            cc.e();
                            boolean z17 = u80Var2.R.getClosestTab() == 9;
                            ArrayList arrayList = new ArrayList();
                            if (u80Var2.w != null) {
                                int i16 = 0;
                                for (int i17 = 0; i17 < u80Var2.w.size(); i17++) {
                                    TL_stories.StoryItem storyItem = ((org.telegram.messenger.ij) u80Var2.w.valueAt(i17)).l;
                                    if (storyItem != null) {
                                        arrayList.add(storyItem);
                                        i16++;
                                    }
                                }
                                i12 = i16;
                            } else {
                                i12 = 0;
                            }
                            u80Var2.R.V(false);
                            if (z17) {
                                u80Var2.R.i1(8);
                            }
                            if (!arrayList.isEmpty()) {
                                boolean[] zArr = new boolean[arrayList.size()];
                                for (int i18 = 0; i18 < arrayList.size(); i18++) {
                                    TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) arrayList.get(i18);
                                    zArr[i18] = storyItem2.pinned;
                                    storyItem2.pinned = z17;
                                }
                                u80Var2.getMessagesController().P1().q0(u80Var2.e, arrayList, false);
                                boolean[] zArr2 = {false};
                                u80Var2.Q = new bi.u7(u80Var2, arrayList, z17, 21);
                                org.telegram.ui.m6 m6Var = new org.telegram.ui.m6((Object) u80Var2, zArr2, (Object) arrayList, (Object) zArr, 26);
                                (z17 ? hc.a0(u80Var2).L(R.raw.contact_check, org.telegram.messenger.hd.G(i12, "StorySavedTitle", new Object[0]), org.telegram.messenger.hd.M0(2131744485, null), org.telegram.messenger.hd.M0(2131743888, null), m6Var).j() : hc.a0(u80Var2).J(R.raw.chats_archived, org.telegram.messenger.hd.G(i12, "StoryArchived", new Object[0]), org.telegram.messenger.hd.M0(2131743888, null), 5000, false, m6Var).j()).v = new fq(29, u80Var2, zArr2);
                                break;
                            }
                            break;
                    }
                }
            });
            org.telegram.ui.ActionBar.z0 e11 = this.s.e(9, R.drawable.msg_zoomout, org.telegram.messenger.hd.M0(2131748648, null));
            this.I = e11;
            e11.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.r80
                public final /* synthetic */ u80 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    di.q6 q6Var;
                    di.q6 q6Var2;
                    di.q6 q6Var3;
                    di.q6 q6Var4;
                    int i12;
                    int i13 = r2;
                    org.telegram.messenger.p2 p2Var = org.telegram.messenger.p2.D;
                    u80 u80Var = this.b;
                    switch (i13) {
                        case 0:
                            Boolean O1 = u80Var.R.O1(null, null);
                            if (O1 != null) {
                                u80Var.i0(true, O1.booleanValue());
                                break;
                            }
                            break;
                        case 1:
                            Boolean P1 = u80Var.R.P1(null, null);
                            if (P1 != null) {
                                u80Var.i0(P1.booleanValue(), true);
                                break;
                            }
                            break;
                        case 2:
                            boolean z9 = u80Var.D;
                            if (z9 && !u80Var.E) {
                                p2Var.a();
                                org.telegram.ui.ActionBar.z0 z0Var = u80Var.x;
                                int i14 = -u80Var.F;
                                u80Var.F = i14;
                                org.telegram.messenger.g0.G3(i14, z0Var, null);
                                break;
                            } else {
                                org.telegram.ui.ActionBar.z0 z0Var2 = u80Var.x;
                                boolean z10 = !z9;
                                u80Var.D = z10;
                                z0Var2.setChecked(z10);
                                t80 t80Var2 = u80Var.R;
                                boolean z11 = u80Var.D;
                                boolean z12 = u80Var.E;
                                gr0 gr0Var = t80Var2.e0;
                                if (gr0Var != null && (q6Var2 = gr0Var.s) != null) {
                                    q6Var2.n = z11;
                                    q6Var2.o = z12;
                                    q6Var2.d(true);
                                }
                                rp0 rp0Var = t80Var2.g0;
                                if (rp0Var != null && (q6Var = rp0Var.s) != null) {
                                    q6Var.n = z11;
                                    q6Var.o = z12;
                                    q6Var.d(true);
                                    break;
                                }
                            }
                            break;
                        case 3:
                            boolean z13 = u80Var.E;
                            if (z13 && !u80Var.D) {
                                p2Var.a();
                                org.telegram.ui.ActionBar.z0 z0Var3 = u80Var.y;
                                int i15 = -u80Var.F;
                                u80Var.F = i15;
                                org.telegram.messenger.g0.G3(i15, z0Var3, null);
                                break;
                            } else {
                                org.telegram.ui.ActionBar.z0 z0Var4 = u80Var.y;
                                boolean z14 = !z13;
                                u80Var.E = z14;
                                z0Var4.setChecked(z14);
                                t80 t80Var3 = u80Var.R;
                                boolean z15 = u80Var.D;
                                boolean z16 = u80Var.E;
                                gr0 gr0Var2 = t80Var3.e0;
                                if (gr0Var2 != null && (q6Var4 = gr0Var2.s) != null) {
                                    q6Var4.n = z15;
                                    q6Var4.o = z16;
                                    q6Var4.d(true);
                                }
                                rp0 rp0Var2 = t80Var3.g0;
                                if (rp0Var2 != null && (q6Var3 = rp0Var2.s) != null) {
                                    q6Var3.n = z15;
                                    q6Var3.o = z16;
                                    q6Var3.d(true);
                                    break;
                                }
                            }
                            break;
                        default:
                            u80 u80Var2 = this.b;
                            bi.u7 u7Var = u80Var2.Q;
                            if (u7Var != null) {
                                u7Var.run();
                                u80Var2.Q = null;
                            }
                            cc.e();
                            boolean z17 = u80Var2.R.getClosestTab() == 9;
                            ArrayList arrayList = new ArrayList();
                            if (u80Var2.w != null) {
                                int i16 = 0;
                                for (int i17 = 0; i17 < u80Var2.w.size(); i17++) {
                                    TL_stories.StoryItem storyItem = ((org.telegram.messenger.ij) u80Var2.w.valueAt(i17)).l;
                                    if (storyItem != null) {
                                        arrayList.add(storyItem);
                                        i16++;
                                    }
                                }
                                i12 = i16;
                            } else {
                                i12 = 0;
                            }
                            u80Var2.R.V(false);
                            if (z17) {
                                u80Var2.R.i1(8);
                            }
                            if (!arrayList.isEmpty()) {
                                boolean[] zArr = new boolean[arrayList.size()];
                                for (int i18 = 0; i18 < arrayList.size(); i18++) {
                                    TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) arrayList.get(i18);
                                    zArr[i18] = storyItem2.pinned;
                                    storyItem2.pinned = z17;
                                }
                                u80Var2.getMessagesController().P1().q0(u80Var2.e, arrayList, false);
                                boolean[] zArr2 = {false};
                                u80Var2.Q = new bi.u7(u80Var2, arrayList, z17, 21);
                                org.telegram.ui.m6 m6Var = new org.telegram.ui.m6((Object) u80Var2, zArr2, (Object) arrayList, (Object) zArr, 26);
                                (z17 ? hc.a0(u80Var2).L(R.raw.contact_check, org.telegram.messenger.hd.G(i12, "StorySavedTitle", new Object[0]), org.telegram.messenger.hd.M0(2131744485, null), org.telegram.messenger.hd.M0(2131743888, null), m6Var).j() : hc.a0(u80Var2).J(R.raw.chats_archived, org.telegram.messenger.hd.G(i12, "StoryArchived", new Object[0]), org.telegram.messenger.hd.M0(2131743888, null), 5000, false, m6Var).j()).v = new fq(29, u80Var2, zArr2);
                                break;
                            }
                            break;
                    }
                }
            });
            org.telegram.ui.ActionBar.z0 e12 = this.s.e(10, R.drawable.msg_calendar2, org.telegram.messenger.hd.M0(2131752642, null));
            this.G = e12;
            e12.setEnabled(false);
            this.G.setAlpha(0.5f);
            this.s.a(-1);
            org.telegram.ui.ActionBar.f5 f5Var = this.s;
            org.telegram.ui.ActionBar.z0 d = f5Var.d(6, 0, null, org.telegram.messenger.hd.M0(2131748652, null), true, true, f5Var.m0);
            this.x = d;
            d.setChecked(this.D);
            final int i12 = 2;
            this.x.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.r80
                public final /* synthetic */ u80 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    di.q6 q6Var;
                    di.q6 q6Var2;
                    di.q6 q6Var3;
                    di.q6 q6Var4;
                    int i122;
                    int i13 = i12;
                    org.telegram.messenger.p2 p2Var = org.telegram.messenger.p2.D;
                    u80 u80Var = this.b;
                    switch (i13) {
                        case 0:
                            Boolean O1 = u80Var.R.O1(null, null);
                            if (O1 != null) {
                                u80Var.i0(true, O1.booleanValue());
                                break;
                            }
                            break;
                        case 1:
                            Boolean P1 = u80Var.R.P1(null, null);
                            if (P1 != null) {
                                u80Var.i0(P1.booleanValue(), true);
                                break;
                            }
                            break;
                        case 2:
                            boolean z9 = u80Var.D;
                            if (z9 && !u80Var.E) {
                                p2Var.a();
                                org.telegram.ui.ActionBar.z0 z0Var = u80Var.x;
                                int i14 = -u80Var.F;
                                u80Var.F = i14;
                                org.telegram.messenger.g0.G3(i14, z0Var, null);
                                break;
                            } else {
                                org.telegram.ui.ActionBar.z0 z0Var2 = u80Var.x;
                                boolean z10 = !z9;
                                u80Var.D = z10;
                                z0Var2.setChecked(z10);
                                t80 t80Var2 = u80Var.R;
                                boolean z11 = u80Var.D;
                                boolean z12 = u80Var.E;
                                gr0 gr0Var = t80Var2.e0;
                                if (gr0Var != null && (q6Var2 = gr0Var.s) != null) {
                                    q6Var2.n = z11;
                                    q6Var2.o = z12;
                                    q6Var2.d(true);
                                }
                                rp0 rp0Var = t80Var2.g0;
                                if (rp0Var != null && (q6Var = rp0Var.s) != null) {
                                    q6Var.n = z11;
                                    q6Var.o = z12;
                                    q6Var.d(true);
                                    break;
                                }
                            }
                            break;
                        case 3:
                            boolean z13 = u80Var.E;
                            if (z13 && !u80Var.D) {
                                p2Var.a();
                                org.telegram.ui.ActionBar.z0 z0Var3 = u80Var.y;
                                int i15 = -u80Var.F;
                                u80Var.F = i15;
                                org.telegram.messenger.g0.G3(i15, z0Var3, null);
                                break;
                            } else {
                                org.telegram.ui.ActionBar.z0 z0Var4 = u80Var.y;
                                boolean z14 = !z13;
                                u80Var.E = z14;
                                z0Var4.setChecked(z14);
                                t80 t80Var3 = u80Var.R;
                                boolean z15 = u80Var.D;
                                boolean z16 = u80Var.E;
                                gr0 gr0Var2 = t80Var3.e0;
                                if (gr0Var2 != null && (q6Var4 = gr0Var2.s) != null) {
                                    q6Var4.n = z15;
                                    q6Var4.o = z16;
                                    q6Var4.d(true);
                                }
                                rp0 rp0Var2 = t80Var3.g0;
                                if (rp0Var2 != null && (q6Var3 = rp0Var2.s) != null) {
                                    q6Var3.n = z15;
                                    q6Var3.o = z16;
                                    q6Var3.d(true);
                                    break;
                                }
                            }
                            break;
                        default:
                            u80 u80Var2 = this.b;
                            bi.u7 u7Var = u80Var2.Q;
                            if (u7Var != null) {
                                u7Var.run();
                                u80Var2.Q = null;
                            }
                            cc.e();
                            boolean z17 = u80Var2.R.getClosestTab() == 9;
                            ArrayList arrayList = new ArrayList();
                            if (u80Var2.w != null) {
                                int i16 = 0;
                                for (int i17 = 0; i17 < u80Var2.w.size(); i17++) {
                                    TL_stories.StoryItem storyItem = ((org.telegram.messenger.ij) u80Var2.w.valueAt(i17)).l;
                                    if (storyItem != null) {
                                        arrayList.add(storyItem);
                                        i16++;
                                    }
                                }
                                i122 = i16;
                            } else {
                                i122 = 0;
                            }
                            u80Var2.R.V(false);
                            if (z17) {
                                u80Var2.R.i1(8);
                            }
                            if (!arrayList.isEmpty()) {
                                boolean[] zArr = new boolean[arrayList.size()];
                                for (int i18 = 0; i18 < arrayList.size(); i18++) {
                                    TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) arrayList.get(i18);
                                    zArr[i18] = storyItem2.pinned;
                                    storyItem2.pinned = z17;
                                }
                                u80Var2.getMessagesController().P1().q0(u80Var2.e, arrayList, false);
                                boolean[] zArr2 = {false};
                                u80Var2.Q = new bi.u7(u80Var2, arrayList, z17, 21);
                                org.telegram.ui.m6 m6Var = new org.telegram.ui.m6((Object) u80Var2, zArr2, (Object) arrayList, (Object) zArr, 26);
                                (z17 ? hc.a0(u80Var2).L(R.raw.contact_check, org.telegram.messenger.hd.G(i122, "StorySavedTitle", new Object[0]), org.telegram.messenger.hd.M0(2131744485, null), org.telegram.messenger.hd.M0(2131743888, null), m6Var).j() : hc.a0(u80Var2).J(R.raw.chats_archived, org.telegram.messenger.hd.G(i122, "StoryArchived", new Object[0]), org.telegram.messenger.hd.M0(2131743888, null), 5000, false, m6Var).j()).v = new fq(29, u80Var2, zArr2);
                                break;
                            }
                            break;
                    }
                }
            });
            org.telegram.ui.ActionBar.f5 f5Var2 = this.s;
            org.telegram.ui.ActionBar.z0 d2 = f5Var2.d(7, 0, null, org.telegram.messenger.hd.M0(2131748651, null), true, true, f5Var2.m0);
            this.y = d2;
            d2.setChecked(this.E);
            this.y.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.r80
                public final /* synthetic */ u80 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    di.q6 q6Var;
                    di.q6 q6Var2;
                    di.q6 q6Var3;
                    di.q6 q6Var4;
                    int i122;
                    int i13 = i11;
                    org.telegram.messenger.p2 p2Var = org.telegram.messenger.p2.D;
                    u80 u80Var = this.b;
                    switch (i13) {
                        case 0:
                            Boolean O1 = u80Var.R.O1(null, null);
                            if (O1 != null) {
                                u80Var.i0(true, O1.booleanValue());
                                break;
                            }
                            break;
                        case 1:
                            Boolean P1 = u80Var.R.P1(null, null);
                            if (P1 != null) {
                                u80Var.i0(P1.booleanValue(), true);
                                break;
                            }
                            break;
                        case 2:
                            boolean z9 = u80Var.D;
                            if (z9 && !u80Var.E) {
                                p2Var.a();
                                org.telegram.ui.ActionBar.z0 z0Var = u80Var.x;
                                int i14 = -u80Var.F;
                                u80Var.F = i14;
                                org.telegram.messenger.g0.G3(i14, z0Var, null);
                                break;
                            } else {
                                org.telegram.ui.ActionBar.z0 z0Var2 = u80Var.x;
                                boolean z10 = !z9;
                                u80Var.D = z10;
                                z0Var2.setChecked(z10);
                                t80 t80Var2 = u80Var.R;
                                boolean z11 = u80Var.D;
                                boolean z12 = u80Var.E;
                                gr0 gr0Var = t80Var2.e0;
                                if (gr0Var != null && (q6Var2 = gr0Var.s) != null) {
                                    q6Var2.n = z11;
                                    q6Var2.o = z12;
                                    q6Var2.d(true);
                                }
                                rp0 rp0Var = t80Var2.g0;
                                if (rp0Var != null && (q6Var = rp0Var.s) != null) {
                                    q6Var.n = z11;
                                    q6Var.o = z12;
                                    q6Var.d(true);
                                    break;
                                }
                            }
                            break;
                        case 3:
                            boolean z13 = u80Var.E;
                            if (z13 && !u80Var.D) {
                                p2Var.a();
                                org.telegram.ui.ActionBar.z0 z0Var3 = u80Var.y;
                                int i15 = -u80Var.F;
                                u80Var.F = i15;
                                org.telegram.messenger.g0.G3(i15, z0Var3, null);
                                break;
                            } else {
                                org.telegram.ui.ActionBar.z0 z0Var4 = u80Var.y;
                                boolean z14 = !z13;
                                u80Var.E = z14;
                                z0Var4.setChecked(z14);
                                t80 t80Var3 = u80Var.R;
                                boolean z15 = u80Var.D;
                                boolean z16 = u80Var.E;
                                gr0 gr0Var2 = t80Var3.e0;
                                if (gr0Var2 != null && (q6Var4 = gr0Var2.s) != null) {
                                    q6Var4.n = z15;
                                    q6Var4.o = z16;
                                    q6Var4.d(true);
                                }
                                rp0 rp0Var2 = t80Var3.g0;
                                if (rp0Var2 != null && (q6Var3 = rp0Var2.s) != null) {
                                    q6Var3.n = z15;
                                    q6Var3.o = z16;
                                    q6Var3.d(true);
                                    break;
                                }
                            }
                            break;
                        default:
                            u80 u80Var2 = this.b;
                            bi.u7 u7Var = u80Var2.Q;
                            if (u7Var != null) {
                                u7Var.run();
                                u80Var2.Q = null;
                            }
                            cc.e();
                            boolean z17 = u80Var2.R.getClosestTab() == 9;
                            ArrayList arrayList = new ArrayList();
                            if (u80Var2.w != null) {
                                int i16 = 0;
                                for (int i17 = 0; i17 < u80Var2.w.size(); i17++) {
                                    TL_stories.StoryItem storyItem = ((org.telegram.messenger.ij) u80Var2.w.valueAt(i17)).l;
                                    if (storyItem != null) {
                                        arrayList.add(storyItem);
                                        i16++;
                                    }
                                }
                                i122 = i16;
                            } else {
                                i122 = 0;
                            }
                            u80Var2.R.V(false);
                            if (z17) {
                                u80Var2.R.i1(8);
                            }
                            if (!arrayList.isEmpty()) {
                                boolean[] zArr = new boolean[arrayList.size()];
                                for (int i18 = 0; i18 < arrayList.size(); i18++) {
                                    TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) arrayList.get(i18);
                                    zArr[i18] = storyItem2.pinned;
                                    storyItem2.pinned = z17;
                                }
                                u80Var2.getMessagesController().P1().q0(u80Var2.e, arrayList, false);
                                boolean[] zArr2 = {false};
                                u80Var2.Q = new bi.u7(u80Var2, arrayList, z17, 21);
                                org.telegram.ui.m6 m6Var = new org.telegram.ui.m6((Object) u80Var2, zArr2, (Object) arrayList, (Object) zArr, 26);
                                (z17 ? hc.a0(u80Var2).L(R.raw.contact_check, org.telegram.messenger.hd.G(i122, "StorySavedTitle", new Object[0]), org.telegram.messenger.hd.M0(2131744485, null), org.telegram.messenger.hd.M0(2131743888, null), m6Var).j() : hc.a0(u80Var2).J(R.raw.chats_archived, org.telegram.messenger.hd.G(i122, "StoryArchived", new Object[0]), org.telegram.messenger.hd.M0(2131743888, null), 5000, false, m6Var).j()).v = new fq(29, u80Var2, zArr2);
                                break;
                            }
                            break;
                    }
                }
            });
        }
        int i13 = this.a;
        qh.b[] bVarArr = this.K;
        if (i13 == 1) {
            org.telegram.ui.le0 le0Var = new org.telegram.ui.le0(context, getResourceProvider());
            this.J = le0Var;
            le0Var.setClipChildren(false);
            this.J.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f));
            bVarArr[0] = qh.b.c(context, getResourceProvider(), qh.a.Q, 2131746650);
            bVarArr[1] = qh.b.c(context, getResourceProvider(), qh.a.R, 2131746626);
            for (int i14 = 0; i14 < bVarArr.length; i14++) {
                bVarArr[i14].setOnClickListener(new ai.v(this, i14, 14));
                this.J.addView(bVarArr[i14]);
                this.J.i(bVarArr[i14], true, false);
            }
            aVar = baseSimpleGlass;
            fh.g c10 = aVar.c.c(this.J, c8.g0.f(getResourceProvider()), false);
            org.telegram.messenger.camera.q.p(c10, org.telegram.messenger.g0.L(28.0f), 7.666f);
            this.J.setBackground(c10);
            e5Var.addView(this.J, c8.ha.e(-2, 72, 81));
            FrameLayout frameLayout = new FrameLayout(context);
            this.M = frameLayout;
            frameLayout.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(8.0f));
            fi.d dVar = new fi.d(context, getResourceProvider(), true);
            this.N = dVar;
            dVar.i(org.telegram.messenger.hd.M0(2131745910, null), false, true);
            this.N.setShowZero(true);
            this.N.c(0, false);
            this.N.setEnabled(false);
            final int i15 = 4;
            this.N.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.r80
                public final /* synthetic */ u80 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    di.q6 q6Var;
                    di.q6 q6Var2;
                    di.q6 q6Var3;
                    di.q6 q6Var4;
                    int i122;
                    int i132 = i15;
                    org.telegram.messenger.p2 p2Var = org.telegram.messenger.p2.D;
                    u80 u80Var = this.b;
                    switch (i132) {
                        case 0:
                            Boolean O1 = u80Var.R.O1(null, null);
                            if (O1 != null) {
                                u80Var.i0(true, O1.booleanValue());
                                break;
                            }
                            break;
                        case 1:
                            Boolean P1 = u80Var.R.P1(null, null);
                            if (P1 != null) {
                                u80Var.i0(P1.booleanValue(), true);
                                break;
                            }
                            break;
                        case 2:
                            boolean z9 = u80Var.D;
                            if (z9 && !u80Var.E) {
                                p2Var.a();
                                org.telegram.ui.ActionBar.z0 z0Var = u80Var.x;
                                int i142 = -u80Var.F;
                                u80Var.F = i142;
                                org.telegram.messenger.g0.G3(i142, z0Var, null);
                                break;
                            } else {
                                org.telegram.ui.ActionBar.z0 z0Var2 = u80Var.x;
                                boolean z10 = !z9;
                                u80Var.D = z10;
                                z0Var2.setChecked(z10);
                                t80 t80Var2 = u80Var.R;
                                boolean z11 = u80Var.D;
                                boolean z12 = u80Var.E;
                                gr0 gr0Var = t80Var2.e0;
                                if (gr0Var != null && (q6Var2 = gr0Var.s) != null) {
                                    q6Var2.n = z11;
                                    q6Var2.o = z12;
                                    q6Var2.d(true);
                                }
                                rp0 rp0Var = t80Var2.g0;
                                if (rp0Var != null && (q6Var = rp0Var.s) != null) {
                                    q6Var.n = z11;
                                    q6Var.o = z12;
                                    q6Var.d(true);
                                    break;
                                }
                            }
                            break;
                        case 3:
                            boolean z13 = u80Var.E;
                            if (z13 && !u80Var.D) {
                                p2Var.a();
                                org.telegram.ui.ActionBar.z0 z0Var3 = u80Var.y;
                                int i152 = -u80Var.F;
                                u80Var.F = i152;
                                org.telegram.messenger.g0.G3(i152, z0Var3, null);
                                break;
                            } else {
                                org.telegram.ui.ActionBar.z0 z0Var4 = u80Var.y;
                                boolean z14 = !z13;
                                u80Var.E = z14;
                                z0Var4.setChecked(z14);
                                t80 t80Var3 = u80Var.R;
                                boolean z15 = u80Var.D;
                                boolean z16 = u80Var.E;
                                gr0 gr0Var2 = t80Var3.e0;
                                if (gr0Var2 != null && (q6Var4 = gr0Var2.s) != null) {
                                    q6Var4.n = z15;
                                    q6Var4.o = z16;
                                    q6Var4.d(true);
                                }
                                rp0 rp0Var2 = t80Var3.g0;
                                if (rp0Var2 != null && (q6Var3 = rp0Var2.s) != null) {
                                    q6Var3.n = z15;
                                    q6Var3.o = z16;
                                    q6Var3.d(true);
                                    break;
                                }
                            }
                            break;
                        default:
                            u80 u80Var2 = this.b;
                            bi.u7 u7Var = u80Var2.Q;
                            if (u7Var != null) {
                                u7Var.run();
                                u80Var2.Q = null;
                            }
                            cc.e();
                            boolean z17 = u80Var2.R.getClosestTab() == 9;
                            ArrayList arrayList = new ArrayList();
                            if (u80Var2.w != null) {
                                int i16 = 0;
                                for (int i17 = 0; i17 < u80Var2.w.size(); i17++) {
                                    TL_stories.StoryItem storyItem = ((org.telegram.messenger.ij) u80Var2.w.valueAt(i17)).l;
                                    if (storyItem != null) {
                                        arrayList.add(storyItem);
                                        i16++;
                                    }
                                }
                                i122 = i16;
                            } else {
                                i122 = 0;
                            }
                            u80Var2.R.V(false);
                            if (z17) {
                                u80Var2.R.i1(8);
                            }
                            if (!arrayList.isEmpty()) {
                                boolean[] zArr = new boolean[arrayList.size()];
                                for (int i18 = 0; i18 < arrayList.size(); i18++) {
                                    TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) arrayList.get(i18);
                                    zArr[i18] = storyItem2.pinned;
                                    storyItem2.pinned = z17;
                                }
                                u80Var2.getMessagesController().P1().q0(u80Var2.e, arrayList, false);
                                boolean[] zArr2 = {false};
                                u80Var2.Q = new bi.u7(u80Var2, arrayList, z17, 21);
                                org.telegram.ui.m6 m6Var = new org.telegram.ui.m6((Object) u80Var2, zArr2, (Object) arrayList, (Object) zArr, 26);
                                (z17 ? hc.a0(u80Var2).L(R.raw.contact_check, org.telegram.messenger.hd.G(i122, "StorySavedTitle", new Object[0]), org.telegram.messenger.hd.M0(2131744485, null), org.telegram.messenger.hd.M0(2131743888, null), m6Var).j() : hc.a0(u80Var2).J(R.raw.chats_archived, org.telegram.messenger.hd.G(i122, "StoryArchived", new Object[0]), org.telegram.messenger.hd.M0(2131743888, null), 5000, false, m6Var).j()).v = new fq(29, u80Var2, zArr2);
                                break;
                            }
                            break;
                    }
                }
            });
            this.M.addView(this.N, c8.ha.c(56.0f, -1));
            this.M.setVisibility(4);
            e5Var.addView(this.M, c8.ha.e(-1, 72, 80));
            int i16 = 8;
            this.O = new te.a(0, new ax(this, i16), xq.h, 320L, false);
            setBulletinDelegate(new ch.v(this, i16));
        } else {
            aVar = baseSimpleGlass;
        }
        View view = new View(context);
        this.P = view;
        this.R.z(view);
        View view2 = this.P;
        view2.setBackground(aVar.a(view2));
        View view3 = new View(context);
        this.navigationBarFadeView = view3;
        view3.setBackground(aVar.b(view3));
        View view4 = this.navigationBarFadeView;
        org.telegram.ui.le0 le0Var2 = this.J;
        e5Var.addView(view4, le0Var2 != null ? e5Var.indexOfChild(le0Var2) : e5Var.getChildCount(), c8.ha.e(-1, 0, 80));
        org.telegram.ui.ActionBar.y4 y4Var = this.simpleActionBar;
        org.telegram.ui.ActionBar.f6 resourceProvider = getResourceProvider();
        aVar.m = e5Var;
        aVar.n = null;
        aVar.g(e5Var, y4Var, resourceProvider);
        aVar.o = new bi.g(7, this, e5Var);
        this.R.setPagesGlassEngine(this.glassEngine);
        this.simpleActionBar.setBackground(null);
        h0(false);
        if (this.a == 3 && (i7 = this.r) != -1) {
            this.simpleActionBar.setSubtitle(org.telegram.messenger.hd.H(' ', "FoundStories", i7));
        }
        b0();
        g0();
        if (this.a == 1) {
            r13 = this.S != 9 ? 0 : 1;
            org.telegram.ui.le0 le0Var3 = this.J;
            if (le0Var3 != null && this.L != r13) {
                this.L = r13;
                le0Var3.q(bVarArr[r13], false);
            }
        }
        return e5Var;
    }

    public final boolean d0() {
        int i7 = this.a;
        return i7 == 1 || i7 == 2;
    }

    @Override // org.telegram.messenger.ls
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.qs.E0 && ((Long) objArr[0]).longValue() == this.e) {
            TLRPC.UserFull userFull = (TLRPC.UserFull) objArr[1];
            this.d = userFull;
            t80 t80Var = this.R;
            if (t80Var != null) {
                t80Var.setUserInfo(userFull);
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
        t80 t80Var = this.R;
        if (t80Var == null || this.simpleActionBar == null) {
            return;
        }
        int closestTab = t80Var.getClosestTab();
        if (this.a != 3 || closestTab == 8) {
            int[] iArr = this.b.c;
            boolean z9 = org.telegram.messenger.hd.a0;
            if (closestTab == 8 || closestTab == 9) {
                org.telegram.ui.ActionBar.z0 z0Var = this.I;
                if (z0Var != null) {
                    z0Var.setEnabled(this.R.K());
                    org.telegram.ui.ActionBar.z0 z0Var2 = this.I;
                    z0Var2.setAlpha(z0Var2.isEnabled() ? 1.0f : 0.5f);
                }
                org.telegram.ui.ActionBar.z0 z0Var3 = this.H;
                if (z0Var3 != null) {
                    z0Var3.setEnabled(this.R.J());
                    org.telegram.ui.ActionBar.z0 z0Var4 = this.H;
                    z0Var4.setAlpha(z0Var4.isEnabled() ? 1.0f : 0.5f);
                }
                int m0 = this.R.m0(closestTab);
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
                org.telegram.ui.ActionBar.f5 f5Var = this.s;
                if (f5Var != null) {
                    f5Var.Y(m0 > 0, true);
                }
                fi.d dVar = this.N;
                if (dVar != null) {
                    boolean z10 = !z9 && this.U == closestTab;
                    if (closestTab == 8) {
                        SparseArray sparseArray = this.w;
                        dVar.i(org.telegram.messenger.hd.G(sparseArray == null ? 0 : sparseArray.size(), "ArchiveStories", new Object[0]), z10, true);
                    } else {
                        dVar.i(org.telegram.messenger.hd.M0(2131745910, null), z10, true);
                    }
                    this.U = closestTab;
                }
                org.telegram.ui.ActionBar.z0 z0Var5 = this.G;
                if (z0Var5 != null) {
                    boolean z11 = m0 > 0;
                    z0Var5.setEnabled(z11);
                    this.G.setAlpha(z11 ? 1.0f : 0.5f);
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
                        if (this.R.getPhotosVideosTypeFilter() == 1) {
                            f0(org.telegram.messenger.hd.G(iArr[6], "Photos", new Object[0]));
                            return;
                        } else if (this.R.getPhotosVideosTypeFilter() == 2) {
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
                        org.telegram.messenger.ro L0 = org.telegram.messenger.qp.s1(this.currentAccount).L0(this.e);
                        f0(org.telegram.messenger.hd.G(L0 == null ? 0 : L0.b.size() + L0.c, "Channels", new Object[0]));
                    }
                }
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final int getNavigationBarColor() {
        int navigationBarColor = super.getNavigationBarColor();
        return (getLastStoryViewer() == null || !getLastStoryViewer().y()) ? navigationBarColor : getLastStoryViewer().e(navigationBarColor);
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.R.getThemeDescriptions());
        return arrayList;
    }

    public final void h0(boolean z9) {
        String str;
        int i7 = this.a;
        boolean z10 = true;
        if (i7 == 3) {
            str = this.h;
        } else {
            if (i7 == 2) {
                str = org.telegram.messenger.hd.M0(2131746633, null);
            } else if (i7 == 1) {
                t80 t80Var = this.R;
                if (t80Var != null && t80Var.getClosestTab() != 9) {
                    z10 = false;
                }
                str = org.telegram.messenger.hd.M0(z10 ? 2131746633 : 2131746654, null);
            } else {
                long j3 = (this.f == 0 || this.e != getUserConfig().e()) ? this.e : this.f;
                if (j3 == 2666000) {
                    str = org.telegram.messenger.hd.M0(2131754252, null);
                } else if (this.f != 0 && j3 == getUserConfig().e()) {
                    str = org.telegram.messenger.hd.M0(2131748302, null);
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
                        str = a23.self ? org.telegram.messenger.hd.M0(2131745902, null) : org.telegram.messenger.g5.m(0, a23.first_name, a23.last_name);
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
                    str = org.telegram.messenger.hd.M0(2131745416, null);
                }
            }
        }
        String str2 = str;
        boolean z11 = z10;
        if (TextUtils.equals(this.T, str2)) {
            return;
        }
        this.T = str2;
        if (!z9) {
            this.simpleActionBar.setTitle(str2);
            return;
        }
        org.telegram.ui.ActionBar.y4 y4Var = this.simpleActionBar;
        y4Var.getClass();
        y4Var.A(str2, z11, 320L, xq.h);
    }

    public final void i0(boolean z9, boolean z10) {
        this.I.setEnabled(z9);
        this.I.animate().alpha(z9 ? 1.0f : 0.5f).start();
        this.H.setEnabled(z10);
        this.H.animate().alpha(z10 ? 1.0f : 0.5f).start();
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        if (!this.R.J0()) {
            return false;
        }
        t80 t80Var = this.R;
        return t80Var.getSelectedTab() == t80Var.K0.getFirstTabId();
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean onBackPressed(boolean z9) {
        if (!hasShownSheet()) {
            t80 t80Var = this.R;
            if (!t80Var.E1) {
                return super.onBackPressed(z9);
            }
            if (z9) {
                t80Var.V(false);
            }
        } else if (z9) {
            closeSheet();
            return false;
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean onFragmentCreate() {
        this.a = getArguments().getInt(TeXSymbolParser.TYPE_ATTR, 0);
        this.e = getArguments().getLong("dialog_id");
        this.f = getArguments().getLong("topic_id", 0L);
        this.h = getArguments().getString("hashtag", "");
        this.n = getArguments().getString("username", "");
        this.r = getArguments().getInt("storiesCount", -1);
        int i7 = this.a;
        this.S = getArguments().getInt("start_from", i7 == 2 ? 9 : i7 == 1 ? 8 : 0);
        getNotificationCenter().c(this, org.telegram.messenger.qs.E0);
        getNotificationCenter().c(this, org.telegram.messenger.qs.f5);
        getNotificationCenter().c(this, org.telegram.messenger.qs.Z2);
        if (org.telegram.messenger.m5.E(this.e) && this.f == 0) {
            TLRPC.User a22 = getMessagesController().a2(Long.valueOf(this.e));
            if (org.telegram.messenger.t10.B(a22)) {
                getMessagesController().g3(a22, false, this.classGuid);
                this.d = getMessagesController().b2(this.e);
            }
        }
        if (this.b == null) {
            this.b = new ps0(this);
        }
        this.b.y.add(this);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().n(this, org.telegram.messenger.qs.E0);
        getNotificationCenter().n(this, org.telegram.messenger.qs.f5);
        getNotificationCenter().n(this, org.telegram.messenger.qs.Z2);
        bi.u7 u7Var = this.Q;
        if (u7Var != null) {
            this.Q = null;
            org.telegram.messenger.g0.h3(u7Var);
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onInsets(int i7, int i10, int i11, int i12) {
        b0();
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean useSimpleActionBar() {
        return true;
    }
}
