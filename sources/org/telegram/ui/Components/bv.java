package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PorterDuffColorFilter;
import android.util.LongSparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.TextView;
import android.widget.Toast;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public class bv extends org.telegram.ui.ActionBar.w2 implements org.telegram.messenger.fs {
    public static Pattern Q1;
    public final rp A1;
    public org.telegram.ui.ActionBar.g1 B1;
    public final boolean C1;
    public boolean D1;
    public float E1;
    public int F1;
    public int G1;
    public final c6 H1;
    public final mu I1;
    public int J1;
    public boolean K1;
    public long L1;
    public ValueAnimator M1;
    public boolean N1;
    public PorterDuffColorFilter O1;
    public int P1;
    public LongSparseArray m1;
    public final org.telegram.ui.ActionBar.g2 n1;
    public final in o1;
    public final nu p1;
    public final tu q1;
    public final hi.e0 r1;
    public ru s1;
    public final View t1;
    public final FrameLayout u1;
    public final TextView v1;
    public final TextView w1;
    public final ug.r0 x1;
    public final v4.t y1;
    public final org.telegram.ui.ActionBar.l5 z1;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public bv(org.telegram.ui.ActionBar.g2 g2Var, Context context, org.telegram.ui.ActionBar.i6 i6Var, ArrayList arrayList) {
        super(1, context, r4, false);
        org.telegram.ui.ActionBar.i6 resourceProvider = (g2Var == null || g2Var.getResourceProvider() == null) ? i6Var : g2Var.getResourceProvider();
        this.F1 = -1;
        this.G1 = -1;
        this.I1 = new mu(this);
        this.J1 = -1;
        this.K1 = false;
        this.N1 = true;
        this.n1 = g2Var;
        O();
        if (arrayList != null) {
            this.C1 = arrayList.size() > 1;
        }
        this.p1 = new nu(this.a, arrayList, this);
        float L = org.telegram.messenger.g0.L(32.0f);
        float L2 = org.telegram.messenger.g0.L(3.5f);
        int i7 = org.telegram.ui.ActionBar.n6.Fi;
        this.A1 = new rp(L, L2, org.telegram.ui.ActionBar.n6.w0(i7, this.J0));
        tu tuVar = new tu(this, context);
        this.q1 = tuVar;
        this.b = tuVar;
        this.o1 = new in(context, 10);
        hi.e0 e0Var = new hi.e0(this, context, this.J0);
        this.r1 = e0Var;
        this.H1 = new c6(0.0f, e0Var, 0L, 1250L, kr.i);
        ViewGroup viewGroup = this.b;
        int i10 = this.u0;
        viewGroup.setPadding(i10, org.telegram.messenger.g0.m, i10, 0);
        this.b.setClipChildren(false);
        this.b.setClipToPadding(false);
        this.b.setWillNotDraw(false);
        e0Var.setWillNotDraw(false);
        e0Var.setSelectorRadius(org.telegram.messenger.g0.L(6.0f));
        org.telegram.ui.ActionBar.u6.l(e0Var, 20, org.telegram.ui.ActionBar.n6.i6, resourceProvider);
        e0Var.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(this.C1 ? 8.0f : 68.0f));
        v4.t tVar = new v4.t(8);
        this.y1 = tVar;
        e0Var.setLayoutManager(tVar);
        e0Var.i(new ai.f0(this, 3));
        e0Var.j(new na(this, 9));
        vm vmVar = new vm(this, arrayList, g2Var, resourceProvider);
        e0Var.setOnItemClickListener(vmVar);
        e0Var.setOnItemLongClickListener((sj0) new g2(17, this, context));
        e0Var.setOnTouchListener(new hi.x1(2, this, vmVar));
        tVar.k1(false);
        tVar.O = new pu(this);
        this.z1 = new org.telegram.ui.ActionBar.l5(e0Var, tVar);
        this.b.addView(e0Var, c8.na.e(-1, -1, 51));
        View view = new View(context);
        this.t1 = view;
        org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.V5, view, null);
        this.b.addView(view, c8.na.a(-1.0f, 1.0f / org.telegram.messenger.g0.p, 80));
        view.setTranslationY(-org.telegram.messenger.g0.L(68.0f));
        FrameLayout frameLayout = new FrameLayout(context);
        this.u1 = frameLayout;
        org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.h5, frameLayout, this.J0);
        this.b.addView(frameLayout, c8.na.e(-1, 68, 87));
        TextView textView = new TextView(context);
        this.v1 = textView;
        textView.setVisibility(8);
        org.telegram.ui.Cells.y e10 = org.telegram.ui.ActionBar.b6.e(org.telegram.ui.ActionBar.n6.w0(i7, this.J0), 24.0f);
        org.telegram.ui.ActionBar.q6 M = org.telegram.ui.ActionBar.u6.M(i7);
        org.telegram.ui.ActionBar.q6 e11 = org.telegram.ui.ActionBar.u6.e(i7);
        org.telegram.ui.ActionBar.i6 i6Var2 = this.J0;
        textView.setBackground(e10);
        org.telegram.ui.ActionBar.u6.j(textView, e10, M, e11, i6Var2);
        org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.Ji, this.J0);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setGravity(17);
        c8.sa.b(textView, 0.02f, 1.2f);
        TextView m10 = org.telegram.ui.Cells.c0.m(frameLayout, textView, c8.na.d(-1, 48.0f, 80, 12.0f, 10.0f, 12.0f, 10.0f), context);
        this.w1 = m10;
        m10.setVisibility(8);
        int i11 = org.telegram.ui.ActionBar.n6.q7;
        org.telegram.ui.Cells.y a02 = org.telegram.ui.ActionBar.n6.a0(org.telegram.ui.ActionBar.n6.w0(i11, this.J0) & 268435455, 0, 0);
        org.telegram.ui.ActionBar.q6 g10 = org.telegram.ui.ActionBar.u6.g(i11, 15);
        org.telegram.ui.ActionBar.i6 i6Var3 = this.J0;
        m10.setBackground(a02);
        org.telegram.ui.ActionBar.u6.j(m10, a02, null, g10, i6Var3);
        org.telegram.ui.ActionBar.u6.U(m10, i11, this.J0);
        m10.setTypeface(org.telegram.messenger.g0.o());
        m10.setGravity(17);
        m10.setClickable(true);
        frameLayout.addView(m10, c8.na.d(-1, -1.0f, 80, 0.0f, 0.0f, 0.0f, 19.0f));
        ug.r0 r0Var = new ug.r0(context, this.J0, false);
        this.x1 = r0Var;
        r0Var.b(org.telegram.messenger.gd.N0(2131743618, null), new n0(this, 12), false);
        r0Var.setIcon(R.raw.unlock_icon);
        r0Var.w.setClickable(true);
        frameLayout.addView(r0Var, c8.na.d(-1, 48.0f, 80, 12.0f, 10.0f, 12.0f, 10.0f));
    }

    public static void K0(final org.telegram.ui.ActionBar.g2 g2Var, TLObject tLObject, final boolean z10, final di.p9 p9Var, final lo loVar) {
        final int currentAccount = g2Var == null ? org.telegram.messenger.i10.t0 : g2Var.getCurrentAccount();
        TLRPC.StickerSet stickerSet = null;
        final View fragmentView = g2Var == null ? null : g2Var.getFragmentView();
        if (tLObject == null) {
            return;
        }
        final TLRPC.TL_messages_stickerSet tL_messages_stickerSet = tLObject instanceof TLRPC.TL_messages_stickerSet ? (TLRPC.TL_messages_stickerSet) tLObject : null;
        if (tL_messages_stickerSet != null) {
            stickerSet = tL_messages_stickerSet.set;
        } else if (tLObject instanceof TLRPC.StickerSet) {
            stickerSet = (TLRPC.StickerSet) tLObject;
        }
        final TLRPC.StickerSet stickerSet2 = stickerSet;
        if (stickerSet2 == null) {
            return;
        }
        Runnable runnable = (Runnable) org.telegram.messenger.ri.d0(currentAccount).U.f(stickerSet2.id);
        if (runnable != null) {
            runnable.run();
            if (p9Var != null) {
                p9Var.a(Boolean.TRUE);
                return;
            }
            return;
        }
        TLRPC.TL_messages_installStickerSet tL_messages_installStickerSet = new TLRPC.TL_messages_installStickerSet();
        TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
        tL_messages_installStickerSet.stickerset = tL_inputStickerSetID;
        tL_inputStickerSetID.id = stickerSet2.id;
        tL_inputStickerSetID.access_hash = stickerSet2.access_hash;
        ConnectionsManager.getInstance(currentAccount).sendRequest(tL_messages_installStickerSet, new RequestDelegate() { // from class: org.telegram.ui.Components.lu
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(final TLObject tLObject2, final TLRPC.TL_error tL_error) {
                final TLRPC.StickerSet stickerSet3 = TLRPC.StickerSet.this;
                final boolean z11 = z10;
                final View view = fragmentView;
                final org.telegram.ui.ActionBar.g2 g2Var2 = g2Var;
                final TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = tL_messages_stickerSet;
                final int i7 = currentAccount;
                final org.telegram.messenger.w10 w10Var = p9Var;
                final Runnable runnable2 = loVar;
                org.telegram.messenger.g0.g3(new Runnable() { // from class: org.telegram.ui.Components.ku
                    @Override // java.lang.Runnable
                    public final void run() {
                        TLObject tLObject3 = tLObject2;
                        TLRPC.StickerSet stickerSet4 = TLRPC.StickerSet.this;
                        int i10 = stickerSet4.masks ? 1 : stickerSet4.emojis ? 5 : 0;
                        TLRPC.TL_error tL_error2 = tL_error;
                        View view2 = view;
                        org.telegram.ui.ActionBar.g2 g2Var3 = g2Var2;
                        int i11 = i7;
                        org.telegram.messenger.w10 w10Var2 = w10Var;
                        try {
                            if (tL_error2 == null) {
                                if (z11 && view2 != null) {
                                    Context context = g2Var3.getFragmentView().getContext();
                                    TLObject tLObject4 = tL_messages_stickerSet2;
                                    fc.g(g2Var3, new ov0(context, tLObject4 == null ? stickerSet4 : tLObject4, 1, 2, null, g2Var3.getResourceProvider()), 1500).j();
                                }
                                if (tLObject3 instanceof TLRPC.TL_messages_stickerSetInstallResultArchive) {
                                    org.telegram.messenger.ri.d0(i11).E1(g2Var3, true, i10, (TLRPC.TL_messages_stickerSetInstallResultArchive) tLObject3);
                                }
                                if (w10Var2 != null) {
                                    w10Var2.a(Boolean.TRUE);
                                }
                            } else if (view2 != null) {
                                Toast.makeText(g2Var3.getFragmentView().getContext(), org.telegram.messenger.gd.N0(2131751093, null), 0).show();
                                if (w10Var2 != null) {
                                    w10Var2.a(Boolean.FALSE);
                                }
                            } else if (w10Var2 != null) {
                                w10Var2.a(Boolean.FALSE);
                            }
                        } catch (Exception e10) {
                            org.telegram.messenger.a8.g(e10, true);
                        }
                        org.telegram.messenger.ri.d0(i11).e1(i10, false, true, false, new y2(runnable2, 6));
                    }
                });
            }
        });
    }

    @Override // org.telegram.ui.ActionBar.w2
    public final boolean F() {
        return false;
    }

    public final int J0() {
        if (this.b == null) {
            return 0;
        }
        hi.e0 e0Var = this.r1;
        if (e0Var == null || e0Var.getChildCount() < 1) {
            return this.b.getPaddingTop();
        }
        View childAt = e0Var.getChildAt(0);
        in inVar = this.o1;
        return childAt != inVar ? this.b.getPaddingTop() : inVar.getBottom() + ((int) e0Var.getY());
    }

    public final void N0() {
        org.telegram.ui.ActionBar.g2 g2Var = this.n1;
        if (g2Var != null) {
            new ug.y0(g2Var, 11, false).show();
        } else if (getContext() instanceof LaunchActivity) {
            ((LaunchActivity) getContext()).t0(new PremiumPreviewFragment(0, null));
        }
    }

    public final void O0() {
        final int i7;
        TLRPC.StickerSet stickerSet;
        if (this.u1 == null) {
            return;
        }
        nu nuVar = this.p1;
        ArrayList arrayList = nuVar.b == null ? new ArrayList() : new ArrayList(nuVar.b);
        final int i10 = 0;
        int i11 = 0;
        while (true) {
            i7 = 1;
            if (i11 >= arrayList.size()) {
                break;
            }
            if (arrayList.get(i11) == null) {
                arrayList.remove(i11);
                i11--;
            }
            i11++;
        }
        org.telegram.messenger.ri d02 = org.telegram.messenger.ri.d0(this.a);
        final ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) arrayList.get(i12);
            if (tL_messages_stickerSet != null && (stickerSet = tL_messages_stickerSet.set) != null) {
                if (d02.E0(stickerSet.id, true)) {
                    arrayList2.add(tL_messages_stickerSet);
                } else {
                    arrayList3.add(tL_messages_stickerSet);
                }
            }
        }
        final ArrayList arrayList4 = new ArrayList(arrayList3);
        boolean z10 = nuVar.a != null && arrayList.size() == nuVar.a.size();
        if (!this.N1 && z10 && this.M1 == null) {
            this.M1 = ValueAnimator.ofFloat(this.E1, 1.0f);
            this.b.getY();
            this.M1.addUpdateListener(new w(this, 17));
            this.M1.setDuration(250L);
            this.M1.setInterpolator(kr.h);
            this.M1.start();
        }
        this.N1 = z10;
        hi.e0 e0Var = this.r1;
        if (!z10) {
            e0Var.setAlpha(0.0f);
        } else if (this.J1 >= 0) {
            int L0 = this.y1.L0();
            int E = this.s1.E(this.J1);
            if (Math.abs(L0 - E) > 54) {
                int i13 = L0 < E ? 0 : 1;
                org.telegram.ui.ActionBar.l5 l5Var = this.z1;
                l5Var.b = i13;
                l5Var.k(E, (org.telegram.messenger.g0.q.y / 2) - org.telegram.messenger.g0.L(170.0f), false, false);
            } else {
                e0Var.y0(E);
            }
            this.F1 = this.s1.E(this.J1);
            ru ruVar = this.s1;
            int i14 = this.J1;
            bv bvVar = ruVar.c;
            boolean z11 = bvVar.D1;
            nu nuVar2 = bvVar.p1;
            int i15 = z11 ? 2 : 1;
            int i16 = 0;
            while (true) {
                ArrayList[] arrayListArr = nuVar2.c;
                if (i16 >= arrayListArr.length) {
                    break;
                }
                int size = arrayListArr[i16].size();
                if (nuVar2.c.length > 1) {
                    size = Math.min(bvVar.y1.J * 2, size);
                }
                if (i16 == i14) {
                    i15 = i15 + size + 1;
                    break;
                } else {
                    i15 += size + 2;
                    i16++;
                }
            }
            this.G1 = i15;
            this.H1.e(true, 1.0f);
            e0Var.invalidate();
            this.J1 = -1;
        }
        boolean z12 = this.N1;
        ug.r0 r0Var = this.x1;
        TextView textView = this.w1;
        TextView textView2 = this.v1;
        if (!z12 || this.C1) {
            r0Var.setVisibility(8);
            textView2.setVisibility(8);
            textView.setVisibility(8);
            Q0(false);
            return;
        }
        r0Var.setVisibility(4);
        if (arrayList4.size() > 0) {
            textView2.setVisibility(0);
            textView.setVisibility(8);
            if (arrayList4.size() == 1) {
                textView2.setText(org.telegram.messenger.gd.G(((TLRPC.TL_messages_stickerSet) arrayList4.get(0)).documents.size(), "AddManyEmojiCount", new Object[0]));
            } else {
                textView2.setText(org.telegram.messenger.gd.G(arrayList4.size(), "AddManyEmojiPacksCount", new Object[0]));
            }
            textView2.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.ju
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r14v0, types: [boolean[], java.io.Serializable] */
                /* JADX WARN: Type inference failed for: r9v7, types: [int[], java.io.Serializable] */
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2;
                    int i17;
                    boolean z13;
                    int i18 = 0;
                    boolean z14 = true;
                    switch (i10) {
                        case 0:
                            ArrayList arrayList5 = arrayList4;
                            int size2 = arrayList5.size();
                            int[] iArr = new int[2];
                            int i19 = 0;
                            while (true) {
                                int size3 = arrayList5.size();
                                bv bvVar2 = this;
                                if (i19 >= size3) {
                                    bvVar2.L0(true);
                                    if (size2 <= 1) {
                                        bvVar2.dismiss();
                                        break;
                                    }
                                } else {
                                    bv.K0(bvVar2.n1, (TLObject) arrayList5.get(i19), size2 == 1, size2 > 1 ? new di.p9(bvVar2, iArr, size2, arrayList5, 5) : null, null);
                                    i19++;
                                }
                            }
                            break;
                        default:
                            bv bvVar3 = this;
                            bvVar3.dismiss();
                            org.telegram.ui.ActionBar.g2 g2Var = bvVar3.n1;
                            ArrayList arrayList6 = arrayList4;
                            if (g2Var != null) {
                                org.telegram.messenger.ri d03 = org.telegram.messenger.ri.d0(g2Var.getCurrentAccount());
                                Context context = g2Var.getContext();
                                ArrayList[] arrayListArr2 = d03.H;
                                if (!arrayList6.isEmpty() && (tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) i5.c.h(1, arrayList6)) != null) {
                                    TLRPC.StickerSet stickerSet2 = tL_messages_stickerSet2.set;
                                    int i20 = stickerSet2.masks ? 1 : stickerSet2.emojis ? 5 : 0;
                                    for (int i21 = 0; i21 < arrayList6.size(); i21++) {
                                        ((TLRPC.TL_messages_stickerSet) arrayList6.get(i21)).set.archived = false;
                                    }
                                    ?? r92 = new int[arrayList6.size()];
                                    int i22 = 0;
                                    while (i22 < arrayListArr2[i20].size()) {
                                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = (TLRPC.TL_messages_stickerSet) arrayListArr2[i20].get(i22);
                                        int i23 = i18;
                                        while (true) {
                                            if (i23 < arrayList6.size()) {
                                                i17 = i18;
                                                z13 = z14;
                                                if (tL_messages_stickerSet3.set.id == ((TLRPC.TL_messages_stickerSet) arrayList6.get(i23)).set.id) {
                                                    r92[i23] = i22;
                                                    arrayListArr2[i20].remove(i22);
                                                    d03.J.l(tL_messages_stickerSet3.set.id);
                                                    d03.K.l(tL_messages_stickerSet3.set.id);
                                                    d03.O.remove(tL_messages_stickerSet3.set.short_name);
                                                } else {
                                                    i23++;
                                                    i18 = i17;
                                                    z14 = z13;
                                                }
                                            } else {
                                                i17 = i18;
                                                z13 = z14;
                                            }
                                        }
                                        i22++;
                                        i18 = i17;
                                        z14 = z13;
                                    }
                                    boolean z15 = i18;
                                    int i24 = z14;
                                    ArrayList arrayList7 = arrayListArr2[i20];
                                    int i25 = d03.Z[i20];
                                    long[] jArr = d03.Y;
                                    long s5 = org.telegram.messenger.ri.s(arrayList7);
                                    jArr[i20] = s5;
                                    int i26 = i20;
                                    d03.O1(i26, i25, s5, arrayList7);
                                    org.telegram.messenger.ks notificationCenter = d03.getNotificationCenter();
                                    Object[] objArr = new Object[2];
                                    objArr[z15 ? 1 : 0] = Integer.valueOf(i26);
                                    objArr[i24] = Boolean.TRUE;
                                    notificationCenter.k(60, objArr);
                                    for (int i27 = z15 ? 1 : 0; i27 < arrayList6.size(); i27++) {
                                        d03.j1(((TLRPC.TL_messages_stickerSet) arrayList6.get(i27)).set.id, i24);
                                    }
                                    ov0 ov0Var = new ov0(context, tL_messages_stickerSet2, arrayList6.size(), 0, null, g2Var.getResourceProvider());
                                    ?? r14 = new boolean[i24];
                                    dc dcVar = new dc(context, null, z15);
                                    dcVar.b = new org.telegram.messenger.yj(d03, (Serializable) r14, arrayList6, i26, (Serializable) r92, 2);
                                    dcVar.c = new bg.m0(d03, (boolean[]) r14, arrayList6, context, g2Var, i26);
                                    ov0Var.setButton(dcVar);
                                    for (int i28 = 0; i28 < arrayList6.size(); i28++) {
                                        d03.U.k(new org.telegram.messenger.a(dcVar, 22), ((TLRPC.TL_messages_stickerSet) arrayList6.get(i28)).set.id);
                                    }
                                    fc.g(g2Var, ov0Var, 2750).j();
                                }
                            } else {
                                int i29 = 0;
                                while (i29 < arrayList6.size()) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet4 = (TLRPC.TL_messages_stickerSet) arrayList6.get(i29);
                                    Context context2 = bvVar3.getContext();
                                    boolean z16 = i29 == 0;
                                    if (tL_messages_stickerSet4 != null) {
                                        org.telegram.messenger.ri.d0(org.telegram.messenger.i10.t0).l2(context2, tL_messages_stickerSet4, null, 0, null, null, true, z16, null, true);
                                    }
                                    i29++;
                                }
                            }
                            bvVar3.L0(false);
                            break;
                    }
                }
            });
            Q0(true);
            return;
        }
        if (arrayList2.size() <= 0) {
            textView2.setVisibility(8);
            textView.setVisibility(8);
            Q0(false);
            return;
        }
        textView2.setVisibility(8);
        textView.setVisibility(0);
        if (arrayList2.size() == 1) {
            textView.setText(org.telegram.messenger.gd.G(((TLRPC.TL_messages_stickerSet) arrayList2.get(0)).documents.size(), "RemoveManyEmojiCount", new Object[0]));
        } else {
            textView.setText(org.telegram.messenger.gd.G(arrayList2.size(), "RemoveManyEmojiPacksCount", new Object[0]));
        }
        textView.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.ju
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r14v0, types: [boolean[], java.io.Serializable] */
            /* JADX WARN: Type inference failed for: r9v7, types: [int[], java.io.Serializable] */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2;
                int i17;
                boolean z13;
                int i18 = 0;
                boolean z14 = true;
                switch (i7) {
                    case 0:
                        ArrayList arrayList5 = arrayList2;
                        int size2 = arrayList5.size();
                        int[] iArr = new int[2];
                        int i19 = 0;
                        while (true) {
                            int size3 = arrayList5.size();
                            bv bvVar2 = this;
                            if (i19 >= size3) {
                                bvVar2.L0(true);
                                if (size2 <= 1) {
                                    bvVar2.dismiss();
                                    break;
                                }
                            } else {
                                bv.K0(bvVar2.n1, (TLObject) arrayList5.get(i19), size2 == 1, size2 > 1 ? new di.p9(bvVar2, iArr, size2, arrayList5, 5) : null, null);
                                i19++;
                            }
                        }
                        break;
                    default:
                        bv bvVar3 = this;
                        bvVar3.dismiss();
                        org.telegram.ui.ActionBar.g2 g2Var = bvVar3.n1;
                        ArrayList arrayList6 = arrayList2;
                        if (g2Var != null) {
                            org.telegram.messenger.ri d03 = org.telegram.messenger.ri.d0(g2Var.getCurrentAccount());
                            Context context = g2Var.getContext();
                            ArrayList[] arrayListArr2 = d03.H;
                            if (!arrayList6.isEmpty() && (tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) i5.c.h(1, arrayList6)) != null) {
                                TLRPC.StickerSet stickerSet2 = tL_messages_stickerSet2.set;
                                int i20 = stickerSet2.masks ? 1 : stickerSet2.emojis ? 5 : 0;
                                for (int i21 = 0; i21 < arrayList6.size(); i21++) {
                                    ((TLRPC.TL_messages_stickerSet) arrayList6.get(i21)).set.archived = false;
                                }
                                ?? r92 = new int[arrayList6.size()];
                                int i22 = 0;
                                while (i22 < arrayListArr2[i20].size()) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = (TLRPC.TL_messages_stickerSet) arrayListArr2[i20].get(i22);
                                    int i23 = i18;
                                    while (true) {
                                        if (i23 < arrayList6.size()) {
                                            i17 = i18;
                                            z13 = z14;
                                            if (tL_messages_stickerSet3.set.id == ((TLRPC.TL_messages_stickerSet) arrayList6.get(i23)).set.id) {
                                                r92[i23] = i22;
                                                arrayListArr2[i20].remove(i22);
                                                d03.J.l(tL_messages_stickerSet3.set.id);
                                                d03.K.l(tL_messages_stickerSet3.set.id);
                                                d03.O.remove(tL_messages_stickerSet3.set.short_name);
                                            } else {
                                                i23++;
                                                i18 = i17;
                                                z14 = z13;
                                            }
                                        } else {
                                            i17 = i18;
                                            z13 = z14;
                                        }
                                    }
                                    i22++;
                                    i18 = i17;
                                    z14 = z13;
                                }
                                boolean z15 = i18;
                                int i24 = z14;
                                ArrayList arrayList7 = arrayListArr2[i20];
                                int i25 = d03.Z[i20];
                                long[] jArr = d03.Y;
                                long s5 = org.telegram.messenger.ri.s(arrayList7);
                                jArr[i20] = s5;
                                int i26 = i20;
                                d03.O1(i26, i25, s5, arrayList7);
                                org.telegram.messenger.ks notificationCenter = d03.getNotificationCenter();
                                Object[] objArr = new Object[2];
                                objArr[z15 ? 1 : 0] = Integer.valueOf(i26);
                                objArr[i24] = Boolean.TRUE;
                                notificationCenter.k(60, objArr);
                                for (int i27 = z15 ? 1 : 0; i27 < arrayList6.size(); i27++) {
                                    d03.j1(((TLRPC.TL_messages_stickerSet) arrayList6.get(i27)).set.id, i24);
                                }
                                ov0 ov0Var = new ov0(context, tL_messages_stickerSet2, arrayList6.size(), 0, null, g2Var.getResourceProvider());
                                ?? r14 = new boolean[i24];
                                dc dcVar = new dc(context, null, z15);
                                dcVar.b = new org.telegram.messenger.yj(d03, (Serializable) r14, arrayList6, i26, (Serializable) r92, 2);
                                dcVar.c = new bg.m0(d03, (boolean[]) r14, arrayList6, context, g2Var, i26);
                                ov0Var.setButton(dcVar);
                                for (int i28 = 0; i28 < arrayList6.size(); i28++) {
                                    d03.U.k(new org.telegram.messenger.a(dcVar, 22), ((TLRPC.TL_messages_stickerSet) arrayList6.get(i28)).set.id);
                                }
                                fc.g(g2Var, ov0Var, 2750).j();
                            }
                        } else {
                            int i29 = 0;
                            while (i29 < arrayList6.size()) {
                                TLRPC.TL_messages_stickerSet tL_messages_stickerSet4 = (TLRPC.TL_messages_stickerSet) arrayList6.get(i29);
                                Context context2 = bvVar3.getContext();
                                boolean z16 = i29 == 0;
                                if (tL_messages_stickerSet4 != null) {
                                    org.telegram.messenger.ri.d0(org.telegram.messenger.i10.t0).l2(context2, tL_messages_stickerSet4, null, 0, null, null, true, z16, null, true);
                                }
                                i29++;
                            }
                        }
                        bvVar3.L0(false);
                        break;
                }
            }
        });
        Q0(true);
    }

    public final void P0(boolean z10) {
        boolean z11 = org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.h5, this.J0)) > 0.721f;
        boolean z12 = org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.n6.w(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.s8, this.J0), 855638016)) > 0.721f;
        if (!z10) {
            z11 = z12;
        }
        org.telegram.messenger.g0.p3(this, z11);
    }

    public final void Q0(boolean z10) {
        boolean z11 = !this.K1 && z10;
        float L = this.w1.getVisibility() == 0 ? org.telegram.messenger.g0.L(19.0f) : 0;
        boolean z12 = this.C1;
        hi.e0 e0Var = this.r1;
        View view = this.t1;
        FrameLayout frameLayout = this.u1;
        float f10 = 0.0f;
        if (z11) {
            ViewPropertyAnimator duration = frameLayout.animate().translationY(z10 ? L : org.telegram.messenger.g0.L(16.0f)).alpha(z10 ? 1.0f : 0.0f).setDuration(250L);
            kr krVar = kr.h;
            duration.setInterpolator(krVar).start();
            view.animate().translationY(z10 ? -(org.telegram.messenger.g0.L(68.0f) - L) : 0.0f).alpha(z10 ? 1.0f : 0.0f).setDuration(250L).setInterpolator(krVar).start();
            ViewPropertyAnimator animate = e0Var.animate();
            if (!z12 && !z10) {
                f10 = org.telegram.messenger.g0.L(68.0f) - L;
            }
            animate.translationY(f10).setDuration(250L).setInterpolator(krVar).start();
        } else {
            frameLayout.setAlpha(z10 ? 1.0f : 0.0f);
            frameLayout.setTranslationY(z10 ? L : org.telegram.messenger.g0.L(16.0f));
            view.setAlpha(z10 ? 1.0f : 0.0f);
            view.setTranslationY(z10 ? -(org.telegram.messenger.g0.L(68.0f) - L) : 0.0f);
            if (!z12 && !z10) {
                f10 = org.telegram.messenger.g0.L(68.0f) - L;
            }
            e0Var.setTranslationY(f10);
        }
        this.K1 = z10;
    }

    @Override // org.telegram.ui.ActionBar.w2
    public final int S() {
        hi.e0 e0Var = this.r1;
        int measuredHeight = (e0Var == null ? 0 : e0Var.getMeasuredHeight()) - J0();
        ViewGroup viewGroup = this.b;
        return org.telegram.messenger.g0.L(8.0f) + measuredHeight + (viewGroup != null ? viewGroup.getPaddingTop() : 0) + org.telegram.messenger.g0.n;
    }

    @Override // org.telegram.messenger.fs
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        xu xuVar;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        if (i7 != org.telegram.messenger.ks.x0) {
            return;
        }
        int i11 = 0;
        while (true) {
            hi.e0 e0Var = this.r1;
            if (i11 >= e0Var.getChildCount()) {
                O0();
                return;
            }
            View childAt = e0Var.getChildAt(i11);
            if ((childAt instanceof xu) && (tL_messages_stickerSet = (xuVar = (xu) childAt).r) != null && tL_messages_stickerSet.set != null) {
                xuVar.a(org.telegram.messenger.ri.d0(this.a).E0(xuVar.r.set.id, true), true);
            }
            i11++;
        }
    }

    @Override // org.telegram.ui.ActionBar.w2, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.c2
    public void dismiss() {
        tu tuVar = this.q1;
        if (tuVar != null && tuVar.x) {
            tuVar.x = false;
            tuVar.invalidate();
        }
        super.dismiss();
        nu nuVar = this.p1;
        if (nuVar != null) {
            org.telegram.messenger.ks.f(nuVar.d).n(nuVar, org.telegram.messenger.ks.B0);
        }
        org.telegram.messenger.ks.e().k(org.telegram.messenger.ks.k1, 4);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.messenger.ks.f(this.a).c(this, org.telegram.messenger.ks.x0);
    }

    @Override // org.telegram.ui.ActionBar.w2, android.app.Dialog
    public final void onBackPressed() {
        if (org.telegram.ui.ns.p().E) {
            org.telegram.ui.ns.p().n();
        } else {
            super.onBackPressed();
        }
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.messenger.ks.f(this.a).n(this, org.telegram.messenger.ks.x0);
    }

    @Override // org.telegram.ui.ActionBar.w2
    public final void s0() {
        Boolean bool;
        try {
            super.s0();
            rp rpVar = this.A1;
            if (rpVar != null) {
                rpVar.b(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Fi, this.J0));
            }
            tu tuVar = this.q1;
            if (tuVar != null && (bool = tuVar.c) != null) {
                P0(bool.booleanValue());
            }
            ViewGroup viewGroup = this.b;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.w2, android.app.Dialog
    public final void show() {
        TLRPC.StickerSet stickerSet;
        super.show();
        ru ruVar = new ru(this);
        this.s1 = ruVar;
        this.r1.setAdapter(ruVar);
        int i7 = 0;
        org.telegram.messenger.ks.e().k(org.telegram.messenger.ks.j1, 4);
        nu nuVar = this.p1;
        if (!nuVar.e) {
            nuVar.e = true;
            bv bvVar = nuVar.f;
            int i10 = nuVar.d;
            nuVar.b = new ArrayList(nuVar.a.size());
            nuVar.c = new ArrayList[nuVar.a.size()];
            org.telegram.messenger.ks.f(i10).c(nuVar, 64);
            boolean[] zArr = new boolean[1];
            int i11 = 0;
            while (true) {
                if (i11 < nuVar.c.length) {
                    TLRPC.TL_messages_stickerSet n02 = org.telegram.messenger.ri.d0(i10).n0((TLRPC.InputStickerSet) nuVar.a.get(i11), null, false, false, new ph(3, nuVar, zArr));
                    if (nuVar.c.length != 1 || n02 == null || (stickerSet = n02.set) == null || stickerSet.emojis) {
                        nuVar.b.add(n02);
                        nuVar.a(i11, n02);
                        i11++;
                    } else {
                        org.telegram.messenger.g0.g3(new yu(nuVar, i7));
                        Context context = bvVar.getContext();
                        org.telegram.ui.ActionBar.g2 g2Var = bvVar.n1;
                        TLRPC.InputStickerSet inputStickerSet = (TLRPC.InputStickerSet) nuVar.a.get(i11);
                        org.telegram.ui.ActionBar.g2 g2Var2 = bvVar.n1;
                        new jw0(context, g2Var, inputStickerSet, null, g2Var2 instanceof org.telegram.ui.bn ? ((org.telegram.ui.bn) g2Var2).a0 : null, bvVar.J0).show();
                    }
                } else {
                    bv bvVar2 = nuVar.h;
                    bvVar2.O0();
                    hi.e0 e0Var = bvVar2.r1;
                    if (e0Var != null && e0Var.getAdapter() != null) {
                        e0Var.getAdapter().f();
                    }
                }
            }
        }
        O0();
        org.telegram.ui.ActionBar.g2 g2Var3 = this.n1;
        org.telegram.messenger.ri.d0(g2Var3 == null ? org.telegram.messenger.i10.t0 : g2Var3.getCurrentAccount()).D(5);
    }

    public void L0(boolean z10) {
    }

    public void M0() {
    }
}
