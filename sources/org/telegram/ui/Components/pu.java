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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public class pu extends org.telegram.ui.ActionBar.t2 implements org.telegram.messenger.cs {
    public static Pattern N1;
    public boolean A1;
    public float B1;
    public int C1;
    public int D1;
    public final u5 E1;
    public final au F1;
    public int G1;
    public boolean H1;
    public long I1;
    public ValueAnimator J1;
    public boolean K1;
    public PorterDuffColorFilter L1;
    public int M1;
    public LongSparseArray j1;
    public final org.telegram.ui.ActionBar.d2 k1;
    public final sm l1;
    public final bu m1;
    public final hu n1;
    public final gi.v o1;
    public fu p1;
    public final View q1;
    public final FrameLayout r1;
    public final TextView s1;
    public final TextView t1;
    public final vg.o0 u1;
    public final u4.s v1;
    public final vi0 w1;
    public final cp x1;
    public org.telegram.ui.ActionBar.f1 y1;
    public final boolean z1;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public pu(org.telegram.ui.ActionBar.d2 d2Var, Context context, org.telegram.ui.ActionBar.e6 e6Var, ArrayList arrayList) {
        super(1, context, r4, false);
        org.telegram.ui.ActionBar.e6 resourceProvider = (d2Var == null || d2Var.getResourceProvider() == null) ? e6Var : d2Var.getResourceProvider();
        this.C1 = -1;
        this.D1 = -1;
        this.F1 = new au(this);
        this.G1 = -1;
        this.H1 = false;
        this.K1 = true;
        this.k1 = d2Var;
        N();
        if (arrayList != null) {
            this.z1 = arrayList.size() > 1;
        }
        this.m1 = new bu(this.a, arrayList, this);
        float L = org.telegram.messenger.g0.L(32.0f);
        float L2 = org.telegram.messenger.g0.L(3.5f);
        int i3 = org.telegram.ui.ActionBar.k6.Ci;
        this.x1 = new cp(L, L2, org.telegram.ui.ActionBar.k6.w0(i3, this.J0));
        hu huVar = new hu(this, context);
        this.n1 = huVar;
        this.b = huVar;
        int i10 = 11;
        this.l1 = new sm(context, 11);
        gi.v vVar = new gi.v(this, context, this.J0);
        this.o1 = vVar;
        this.E1 = new u5(0.0f, vVar, 0L, 1250L, xq.i);
        ViewGroup viewGroup = this.b;
        int i11 = this.u0;
        viewGroup.setPadding(i11, org.telegram.messenger.g0.m, i11, 0);
        this.b.setClipChildren(false);
        this.b.setClipToPadding(false);
        this.b.setWillNotDraw(false);
        vVar.setWillNotDraw(false);
        vVar.setSelectorRadius(org.telegram.messenger.g0.L(6.0f));
        org.telegram.ui.ActionBar.r6.m(vVar, 20, org.telegram.ui.ActionBar.k6.i6, resourceProvider);
        vVar.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(this.z1 ? 8.0f : 68.0f));
        u4.s sVar = new u4.s(8);
        this.v1 = sVar;
        vVar.setLayoutManager(sVar);
        vVar.i(new gi.o1(this, 2));
        vVar.j(new ji(this, 8));
        fm fmVar = new fm(this, arrayList, d2Var, resourceProvider);
        vVar.setOnItemClickListener(fmVar);
        vVar.setOnItemLongClickListener(new org.telegram.ui.jo(24, this, context));
        vVar.setOnTouchListener(new gi.n1(3, this, fmVar));
        sVar.k1(false);
        sVar.O = new du(this);
        this.w1 = new vi0(vVar, sVar);
        this.b.addView(vVar, b8.mf.e(-1, -1, 51));
        View view = new View(context);
        this.q1 = view;
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.V5, view, null);
        this.b.addView(view, b8.mf.a(-1.0f, 1.0f / org.telegram.messenger.g0.p, 80));
        view.setTranslationY(-org.telegram.messenger.g0.L(68.0f));
        FrameLayout frameLayout = new FrameLayout(context);
        this.r1 = frameLayout;
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.h5, frameLayout, this.J0);
        this.b.addView(frameLayout, b8.mf.e(-1, 68, 87));
        TextView textView = new TextView(context);
        this.s1 = textView;
        textView.setVisibility(8);
        org.telegram.ui.Cells.y e10 = org.telegram.ui.ActionBar.y5.e(org.telegram.ui.ActionBar.k6.w0(i3, this.J0), 24.0f);
        org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i3);
        org.telegram.ui.ActionBar.n6 f10 = org.telegram.ui.ActionBar.r6.f(i3);
        org.telegram.ui.ActionBar.e6 e6Var2 = this.J0;
        textView.setBackground(e10);
        org.telegram.ui.ActionBar.r6.k(textView, e10, N, f10, e6Var2);
        org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.Gi, this.J0);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setGravity(17);
        b8.pf.b(textView, 0.02f, 1.2f);
        TextView m10 = org.telegram.ui.Cells.f1.m(frameLayout, textView, b8.mf.d(-1, 48.0f, 80, 12.0f, 10.0f, 12.0f, 10.0f), context);
        this.t1 = m10;
        m10.setVisibility(8);
        int i12 = org.telegram.ui.ActionBar.k6.q7;
        org.telegram.ui.Cells.y a02 = org.telegram.ui.ActionBar.k6.a0(org.telegram.ui.ActionBar.k6.w0(i12, this.J0) & 268435455, 0, 0);
        org.telegram.ui.ActionBar.n6 h = org.telegram.ui.ActionBar.r6.h(i12, 15);
        org.telegram.ui.ActionBar.e6 e6Var3 = this.J0;
        m10.setBackground(a02);
        org.telegram.ui.ActionBar.r6.k(m10, a02, null, h, e6Var3);
        org.telegram.ui.ActionBar.r6.V(m10, i12, this.J0);
        m10.setTypeface(org.telegram.messenger.g0.o());
        m10.setGravity(17);
        m10.setClickable(true);
        frameLayout.addView(m10, b8.mf.d(-1, -1.0f, 80, 0.0f, 0.0f, 0.0f, 19.0f));
        vg.o0 o0Var = new vg.o0(context, this.J0, false);
        this.u1 = o0Var;
        o0Var.b(org.telegram.messenger.bd.M0(2131743875, null), new f0(this, i10), false);
        o0Var.setIcon(R.raw.unlock_icon);
        o0Var.w.setClickable(true);
        frameLayout.addView(o0Var, b8.mf.d(-1, 48.0f, 80, 12.0f, 10.0f, 12.0f, 10.0f));
    }

    public static void J0(final org.telegram.ui.ActionBar.d2 d2Var, TLObject tLObject, final boolean z10, final ci.w9 w9Var, final gp gpVar) {
        final int currentAccount = d2Var == null ? org.telegram.messenger.h10.t0 : d2Var.getCurrentAccount();
        TLRPC.StickerSet stickerSet = null;
        final View fragmentView = d2Var == null ? null : d2Var.getFragmentView();
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
        Runnable runnable = (Runnable) org.telegram.messenger.li.b0(currentAccount).U.f(stickerSet2.id);
        if (runnable != null) {
            runnable.run();
            if (w9Var != null) {
                w9Var.a(Boolean.TRUE);
                return;
            }
            return;
        }
        TLRPC.TL_messages_installStickerSet tL_messages_installStickerSet = new TLRPC.TL_messages_installStickerSet();
        TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
        tL_messages_installStickerSet.stickerset = tL_inputStickerSetID;
        tL_inputStickerSetID.id = stickerSet2.id;
        tL_inputStickerSetID.access_hash = stickerSet2.access_hash;
        ConnectionsManager.getInstance(currentAccount).sendRequest(tL_messages_installStickerSet, new RequestDelegate() { // from class: org.telegram.ui.Components.zt
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(final TLObject tLObject2, final TLRPC.TL_error tL_error) {
                final TLRPC.StickerSet stickerSet3 = TLRPC.StickerSet.this;
                final boolean z11 = z10;
                final View view = fragmentView;
                final org.telegram.ui.ActionBar.d2 d2Var2 = d2Var;
                final TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = tL_messages_stickerSet;
                final int i3 = currentAccount;
                final org.telegram.messenger.u10 u10Var = w9Var;
                final Runnable runnable2 = gpVar;
                org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.Components.yt
                    @Override // java.lang.Runnable
                    public final void run() {
                        TLObject tLObject3 = tLObject2;
                        TLRPC.StickerSet stickerSet4 = TLRPC.StickerSet.this;
                        int i10 = stickerSet4.masks ? 1 : stickerSet4.emojis ? 5 : 0;
                        TLRPC.TL_error tL_error2 = tL_error;
                        View view2 = view;
                        org.telegram.ui.ActionBar.d2 d2Var3 = d2Var2;
                        int i11 = i3;
                        org.telegram.messenger.u10 u10Var2 = u10Var;
                        try {
                            if (tL_error2 == null) {
                                if (z11 && view2 != null) {
                                    Context context = d2Var3.getFragmentView().getContext();
                                    TLObject tLObject4 = tL_messages_stickerSet2;
                                    ac.g(d2Var3, new bv0(context, tLObject4 == null ? stickerSet4 : tLObject4, 1, 2, null, d2Var3.getResourceProvider()), 1500).j();
                                }
                                if (tLObject3 instanceof TLRPC.TL_messages_stickerSetInstallResultArchive) {
                                    org.telegram.messenger.li.b0(i11).A1(d2Var3, true, i10, (TLRPC.TL_messages_stickerSetInstallResultArchive) tLObject3);
                                }
                                if (u10Var2 != null) {
                                    u10Var2.a(Boolean.TRUE);
                                }
                            } else if (view2 != null) {
                                Toast.makeText(d2Var3.getFragmentView().getContext(), org.telegram.messenger.bd.M0(2131751106, null), 0).show();
                                if (u10Var2 != null) {
                                    u10Var2.a(Boolean.FALSE);
                                }
                            } else if (u10Var2 != null) {
                                u10Var2.a(Boolean.FALSE);
                            }
                        } catch (Exception e10) {
                            org.telegram.messenger.a8.g(e10, true);
                        }
                        org.telegram.messenger.li.b0(i11).b1(i10, false, true, false, new p2(runnable2, 4));
                    }
                });
            }
        });
    }

    @Override // org.telegram.ui.ActionBar.t2
    public final boolean G() {
        return false;
    }

    public final int I0() {
        if (this.b == null) {
            return 0;
        }
        gi.v vVar = this.o1;
        if (vVar == null || vVar.getChildCount() < 1) {
            return this.b.getPaddingTop();
        }
        View childAt = vVar.getChildAt(0);
        sm smVar = this.l1;
        return childAt != smVar ? this.b.getPaddingTop() : smVar.getBottom() + ((int) vVar.getY());
    }

    public final void M0() {
        org.telegram.ui.ActionBar.d2 d2Var = this.k1;
        if (d2Var != null) {
            new vg.v0(d2Var, 11, false).show();
        } else if (getContext() instanceof LaunchActivity) {
            ((LaunchActivity) getContext()).t0(new PremiumPreviewFragment(0, null));
        }
    }

    public final void N0() {
        final int i3;
        TLRPC.StickerSet stickerSet;
        if (this.r1 == null) {
            return;
        }
        bu buVar = this.m1;
        ArrayList arrayList = buVar.b == null ? new ArrayList() : new ArrayList(buVar.b);
        final int i10 = 0;
        int i11 = 0;
        while (true) {
            i3 = 1;
            if (i11 >= arrayList.size()) {
                break;
            }
            if (arrayList.get(i11) == null) {
                arrayList.remove(i11);
                i11--;
            }
            i11++;
        }
        org.telegram.messenger.li b02 = org.telegram.messenger.li.b0(this.a);
        final ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) arrayList.get(i12);
            if (tL_messages_stickerSet != null && (stickerSet = tL_messages_stickerSet.set) != null) {
                if (b02.B0(stickerSet.id, true)) {
                    arrayList2.add(tL_messages_stickerSet);
                } else {
                    arrayList3.add(tL_messages_stickerSet);
                }
            }
        }
        final ArrayList arrayList4 = new ArrayList(arrayList3);
        boolean z10 = buVar.a != null && arrayList.size() == buVar.a.size();
        if (!this.K1 && z10 && this.J1 == null) {
            this.J1 = ValueAnimator.ofFloat(this.B1, 1.0f);
            this.b.getY();
            this.J1.addUpdateListener(new c6(this, 16));
            this.J1.setDuration(250L);
            this.J1.setInterpolator(xq.h);
            this.J1.start();
        }
        this.K1 = z10;
        gi.v vVar = this.o1;
        if (!z10) {
            vVar.setAlpha(0.0f);
        } else if (this.G1 >= 0) {
            int L0 = this.v1.L0();
            int E = this.p1.E(this.G1);
            if (Math.abs(L0 - E) > 54) {
                int i13 = L0 < E ? 0 : 1;
                vi0 vi0Var = this.w1;
                vi0Var.b = i13;
                vi0Var.d(E, (org.telegram.messenger.g0.q.y / 2) - org.telegram.messenger.g0.L(170.0f), false, false);
            } else {
                vVar.y0(E);
            }
            this.C1 = this.p1.E(this.G1);
            fu fuVar = this.p1;
            int i14 = this.G1;
            pu puVar = fuVar.c;
            boolean z11 = puVar.A1;
            bu buVar2 = puVar.m1;
            int i15 = z11 ? 2 : 1;
            int i16 = 0;
            while (true) {
                ArrayList[] arrayListArr = buVar2.c;
                if (i16 >= arrayListArr.length) {
                    break;
                }
                int size = arrayListArr[i16].size();
                if (buVar2.c.length > 1) {
                    size = Math.min(puVar.v1.J * 2, size);
                }
                if (i16 == i14) {
                    i15 = i15 + size + 1;
                    break;
                } else {
                    i15 += size + 2;
                    i16++;
                }
            }
            this.D1 = i15;
            this.E1.e(true, 1.0f);
            vVar.invalidate();
            this.G1 = -1;
        }
        boolean z12 = this.K1;
        vg.o0 o0Var = this.u1;
        TextView textView = this.t1;
        TextView textView2 = this.s1;
        if (!z12 || this.z1) {
            o0Var.setVisibility(8);
            textView2.setVisibility(8);
            textView.setVisibility(8);
            P0(false);
            return;
        }
        o0Var.setVisibility(4);
        if (arrayList4.size() > 0) {
            textView2.setVisibility(0);
            textView.setVisibility(8);
            if (arrayList4.size() == 1) {
                textView2.setText(org.telegram.messenger.bd.G(((TLRPC.TL_messages_stickerSet) arrayList4.get(0)).documents.size(), "AddManyEmojiCount", new Object[0]));
            } else {
                textView2.setText(org.telegram.messenger.bd.G(arrayList4.size(), "AddManyEmojiPacksCount", new Object[0]));
            }
            textView2.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.xt
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r15v3, types: [boolean[], java.io.Serializable] */
                /* JADX WARN: Type inference failed for: r8v8, types: [int[], java.io.Serializable] */
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    pu puVar2;
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2;
                    pu puVar3;
                    int i17;
                    boolean z13;
                    int i18 = i10;
                    pu puVar4 = this;
                    int i19 = 0;
                    boolean z14 = true;
                    switch (i18) {
                        case 0:
                            ArrayList arrayList5 = arrayList4;
                            int size2 = arrayList5.size();
                            int[] iArr = new int[2];
                            for (int i20 = 0; i20 < arrayList5.size(); i20++) {
                                pu.J0(puVar4.k1, (TLObject) arrayList5.get(i20), size2 == 1, size2 > 1 ? new ci.w9(puVar4, iArr, size2, arrayList5) : null, null);
                            }
                            puVar4.K0(true);
                            if (size2 <= 1) {
                                puVar4.dismiss();
                                break;
                            }
                            break;
                        default:
                            puVar4.dismiss();
                            org.telegram.ui.ActionBar.d2 d2Var = puVar4.k1;
                            ArrayList arrayList6 = arrayList4;
                            if (d2Var != null) {
                                org.telegram.messenger.li b03 = org.telegram.messenger.li.b0(d2Var.getCurrentAccount());
                                Context context = d2Var.getContext();
                                ArrayList[] arrayListArr2 = b03.H;
                                if (arrayList6.isEmpty() || (tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) k2.p1.h(1, arrayList6)) == null) {
                                    puVar2 = puVar4;
                                } else {
                                    TLRPC.StickerSet stickerSet2 = tL_messages_stickerSet2.set;
                                    int i21 = stickerSet2.masks ? 1 : stickerSet2.emojis ? 5 : 0;
                                    for (int i22 = 0; i22 < arrayList6.size(); i22++) {
                                        ((TLRPC.TL_messages_stickerSet) arrayList6.get(i22)).set.archived = false;
                                    }
                                    ?? r82 = new int[arrayList6.size()];
                                    int i23 = 0;
                                    while (i23 < arrayListArr2[i21].size()) {
                                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = (TLRPC.TL_messages_stickerSet) arrayListArr2[i21].get(i23);
                                        int i24 = i19;
                                        while (true) {
                                            if (i24 < arrayList6.size()) {
                                                i17 = i19;
                                                z13 = z14;
                                                puVar3 = puVar4;
                                                if (tL_messages_stickerSet3.set.id == ((TLRPC.TL_messages_stickerSet) arrayList6.get(i24)).set.id) {
                                                    r82[i24] = i23;
                                                    arrayListArr2[i21].remove(i23);
                                                    b03.J.l(tL_messages_stickerSet3.set.id);
                                                    b03.K.l(tL_messages_stickerSet3.set.id);
                                                    b03.O.remove(tL_messages_stickerSet3.set.short_name);
                                                } else {
                                                    i24++;
                                                    i19 = i17;
                                                    z14 = z13;
                                                    puVar4 = puVar3;
                                                }
                                            } else {
                                                puVar3 = puVar4;
                                                i17 = i19;
                                                z13 = z14;
                                            }
                                        }
                                        i23++;
                                        i19 = i17;
                                        z14 = z13;
                                        puVar4 = puVar3;
                                    }
                                    puVar2 = puVar4;
                                    boolean z15 = i19;
                                    int i25 = z14;
                                    ArrayList arrayList7 = arrayListArr2[i21];
                                    int i26 = b03.Z[i21];
                                    long[] jArr = b03.Y;
                                    int i27 = i21;
                                    long q10 = org.telegram.messenger.li.q(arrayList7);
                                    jArr[i27] = q10;
                                    b03.J1(i27, i26, q10, arrayList7);
                                    org.telegram.messenger.hs notificationCenter = b03.getNotificationCenter();
                                    Object[] objArr = new Object[2];
                                    objArr[z15 ? 1 : 0] = Integer.valueOf(i27);
                                    objArr[i25] = Boolean.TRUE;
                                    notificationCenter.k(60, objArr);
                                    for (int i28 = z15 ? 1 : 0; i28 < arrayList6.size(); i28++) {
                                        b03.g1(((TLRPC.TL_messages_stickerSet) arrayList6.get(i28)).set.id, i25);
                                    }
                                    bv0 bv0Var = new bv0(context, tL_messages_stickerSet2, arrayList6.size(), 0, null, d2Var.getResourceProvider());
                                    ?? r15 = new boolean[i25];
                                    yb ybVar = new yb(context, null, z15);
                                    ybVar.b = new org.telegram.messenger.sj(b03, (Serializable) r15, arrayList6, i27, (Serializable) r82, 2);
                                    ybVar.c = new cg.k0(b03, (boolean[]) r15, arrayList6, context, d2Var, i27);
                                    bv0Var.setButton(ybVar);
                                    for (int i29 = 0; i29 < arrayList6.size(); i29++) {
                                        b03.U.k(new org.telegram.messenger.a(ybVar, 21), ((TLRPC.TL_messages_stickerSet) arrayList6.get(i29)).set.id);
                                    }
                                    ac.g(d2Var, bv0Var, 2750).j();
                                }
                            } else {
                                puVar2 = puVar4;
                                int i30 = 0;
                                while (i30 < arrayList6.size()) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet4 = (TLRPC.TL_messages_stickerSet) arrayList6.get(i30);
                                    Context context2 = puVar2.getContext();
                                    boolean z16 = i30 == 0;
                                    if (tL_messages_stickerSet4 != null) {
                                        org.telegram.messenger.li.b0(org.telegram.messenger.h10.t0).g2(context2, tL_messages_stickerSet4, null, 0, null, null, true, z16, null, true);
                                    }
                                    i30++;
                                }
                            }
                            puVar2.K0(false);
                            break;
                    }
                }
            });
            P0(true);
            return;
        }
        if (arrayList2.size() <= 0) {
            textView2.setVisibility(8);
            textView.setVisibility(8);
            P0(false);
            return;
        }
        textView2.setVisibility(8);
        textView.setVisibility(0);
        if (arrayList2.size() == 1) {
            textView.setText(org.telegram.messenger.bd.G(((TLRPC.TL_messages_stickerSet) arrayList2.get(0)).documents.size(), "RemoveManyEmojiCount", new Object[0]));
        } else {
            textView.setText(org.telegram.messenger.bd.G(arrayList2.size(), "RemoveManyEmojiPacksCount", new Object[0]));
        }
        textView.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.xt
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r15v3, types: [boolean[], java.io.Serializable] */
            /* JADX WARN: Type inference failed for: r8v8, types: [int[], java.io.Serializable] */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                pu puVar2;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2;
                pu puVar3;
                int i17;
                boolean z13;
                int i18 = i3;
                pu puVar4 = this;
                int i19 = 0;
                boolean z14 = true;
                switch (i18) {
                    case 0:
                        ArrayList arrayList5 = arrayList2;
                        int size2 = arrayList5.size();
                        int[] iArr = new int[2];
                        for (int i20 = 0; i20 < arrayList5.size(); i20++) {
                            pu.J0(puVar4.k1, (TLObject) arrayList5.get(i20), size2 == 1, size2 > 1 ? new ci.w9(puVar4, iArr, size2, arrayList5) : null, null);
                        }
                        puVar4.K0(true);
                        if (size2 <= 1) {
                            puVar4.dismiss();
                            break;
                        }
                        break;
                    default:
                        puVar4.dismiss();
                        org.telegram.ui.ActionBar.d2 d2Var = puVar4.k1;
                        ArrayList arrayList6 = arrayList2;
                        if (d2Var != null) {
                            org.telegram.messenger.li b03 = org.telegram.messenger.li.b0(d2Var.getCurrentAccount());
                            Context context = d2Var.getContext();
                            ArrayList[] arrayListArr2 = b03.H;
                            if (arrayList6.isEmpty() || (tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) k2.p1.h(1, arrayList6)) == null) {
                                puVar2 = puVar4;
                            } else {
                                TLRPC.StickerSet stickerSet2 = tL_messages_stickerSet2.set;
                                int i21 = stickerSet2.masks ? 1 : stickerSet2.emojis ? 5 : 0;
                                for (int i22 = 0; i22 < arrayList6.size(); i22++) {
                                    ((TLRPC.TL_messages_stickerSet) arrayList6.get(i22)).set.archived = false;
                                }
                                ?? r82 = new int[arrayList6.size()];
                                int i23 = 0;
                                while (i23 < arrayListArr2[i21].size()) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = (TLRPC.TL_messages_stickerSet) arrayListArr2[i21].get(i23);
                                    int i24 = i19;
                                    while (true) {
                                        if (i24 < arrayList6.size()) {
                                            i17 = i19;
                                            z13 = z14;
                                            puVar3 = puVar4;
                                            if (tL_messages_stickerSet3.set.id == ((TLRPC.TL_messages_stickerSet) arrayList6.get(i24)).set.id) {
                                                r82[i24] = i23;
                                                arrayListArr2[i21].remove(i23);
                                                b03.J.l(tL_messages_stickerSet3.set.id);
                                                b03.K.l(tL_messages_stickerSet3.set.id);
                                                b03.O.remove(tL_messages_stickerSet3.set.short_name);
                                            } else {
                                                i24++;
                                                i19 = i17;
                                                z14 = z13;
                                                puVar4 = puVar3;
                                            }
                                        } else {
                                            puVar3 = puVar4;
                                            i17 = i19;
                                            z13 = z14;
                                        }
                                    }
                                    i23++;
                                    i19 = i17;
                                    z14 = z13;
                                    puVar4 = puVar3;
                                }
                                puVar2 = puVar4;
                                boolean z15 = i19;
                                int i25 = z14;
                                ArrayList arrayList7 = arrayListArr2[i21];
                                int i26 = b03.Z[i21];
                                long[] jArr = b03.Y;
                                int i27 = i21;
                                long q10 = org.telegram.messenger.li.q(arrayList7);
                                jArr[i27] = q10;
                                b03.J1(i27, i26, q10, arrayList7);
                                org.telegram.messenger.hs notificationCenter = b03.getNotificationCenter();
                                Object[] objArr = new Object[2];
                                objArr[z15 ? 1 : 0] = Integer.valueOf(i27);
                                objArr[i25] = Boolean.TRUE;
                                notificationCenter.k(60, objArr);
                                for (int i28 = z15 ? 1 : 0; i28 < arrayList6.size(); i28++) {
                                    b03.g1(((TLRPC.TL_messages_stickerSet) arrayList6.get(i28)).set.id, i25);
                                }
                                bv0 bv0Var = new bv0(context, tL_messages_stickerSet2, arrayList6.size(), 0, null, d2Var.getResourceProvider());
                                ?? r15 = new boolean[i25];
                                yb ybVar = new yb(context, null, z15);
                                ybVar.b = new org.telegram.messenger.sj(b03, (Serializable) r15, arrayList6, i27, (Serializable) r82, 2);
                                ybVar.c = new cg.k0(b03, (boolean[]) r15, arrayList6, context, d2Var, i27);
                                bv0Var.setButton(ybVar);
                                for (int i29 = 0; i29 < arrayList6.size(); i29++) {
                                    b03.U.k(new org.telegram.messenger.a(ybVar, 21), ((TLRPC.TL_messages_stickerSet) arrayList6.get(i29)).set.id);
                                }
                                ac.g(d2Var, bv0Var, 2750).j();
                            }
                        } else {
                            puVar2 = puVar4;
                            int i30 = 0;
                            while (i30 < arrayList6.size()) {
                                TLRPC.TL_messages_stickerSet tL_messages_stickerSet4 = (TLRPC.TL_messages_stickerSet) arrayList6.get(i30);
                                Context context2 = puVar2.getContext();
                                boolean z16 = i30 == 0;
                                if (tL_messages_stickerSet4 != null) {
                                    org.telegram.messenger.li.b0(org.telegram.messenger.h10.t0).g2(context2, tL_messages_stickerSet4, null, 0, null, null, true, z16, null, true);
                                }
                                i30++;
                            }
                        }
                        puVar2.K0(false);
                        break;
                }
            }
        });
        P0(true);
    }

    public final void O0(boolean z10) {
        boolean z11 = org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.h5, this.J0)) > 0.721f;
        boolean z12 = org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.k6.w(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.s8, this.J0), 855638016)) > 0.721f;
        if (!z10) {
            z11 = z12;
        }
        org.telegram.messenger.g0.q3(this, z11);
    }

    public final void P0(boolean z10) {
        boolean z11 = !this.H1 && z10;
        float L = this.t1.getVisibility() == 0 ? org.telegram.messenger.g0.L(19.0f) : 0;
        boolean z12 = this.z1;
        gi.v vVar = this.o1;
        View view = this.q1;
        FrameLayout frameLayout = this.r1;
        float f10 = 0.0f;
        if (z11) {
            ViewPropertyAnimator duration = frameLayout.animate().translationY(z10 ? L : org.telegram.messenger.g0.L(16.0f)).alpha(z10 ? 1.0f : 0.0f).setDuration(250L);
            xq xqVar = xq.h;
            duration.setInterpolator(xqVar).start();
            view.animate().translationY(z10 ? -(org.telegram.messenger.g0.L(68.0f) - L) : 0.0f).alpha(z10 ? 1.0f : 0.0f).setDuration(250L).setInterpolator(xqVar).start();
            ViewPropertyAnimator animate = vVar.animate();
            if (!z12 && !z10) {
                f10 = org.telegram.messenger.g0.L(68.0f) - L;
            }
            animate.translationY(f10).setDuration(250L).setInterpolator(xqVar).start();
        } else {
            frameLayout.setAlpha(z10 ? 1.0f : 0.0f);
            frameLayout.setTranslationY(z10 ? L : org.telegram.messenger.g0.L(16.0f));
            view.setAlpha(z10 ? 1.0f : 0.0f);
            view.setTranslationY(z10 ? -(org.telegram.messenger.g0.L(68.0f) - L) : 0.0f);
            if (!z12 && !z10) {
                f10 = org.telegram.messenger.g0.L(68.0f) - L;
            }
            vVar.setTranslationY(f10);
        }
        this.H1 = z10;
    }

    @Override // org.telegram.ui.ActionBar.t2
    public final int R() {
        gi.v vVar = this.o1;
        int measuredHeight = (vVar == null ? 0 : vVar.getMeasuredHeight()) - I0();
        ViewGroup viewGroup = this.b;
        return org.telegram.messenger.g0.L(8.0f) + measuredHeight + (viewGroup != null ? viewGroup.getPaddingTop() : 0) + org.telegram.messenger.g0.n;
    }

    @Override // org.telegram.messenger.cs
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        lu luVar;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        if (i3 != org.telegram.messenger.hs.x0) {
            return;
        }
        int i11 = 0;
        while (true) {
            gi.v vVar = this.o1;
            if (i11 >= vVar.getChildCount()) {
                N0();
                return;
            }
            View childAt = vVar.getChildAt(i11);
            if ((childAt instanceof lu) && (tL_messages_stickerSet = (luVar = (lu) childAt).r) != null && tL_messages_stickerSet.set != null) {
                luVar.a(org.telegram.messenger.li.b0(this.a).B0(luVar.r.set.id, true), true);
            }
            i11++;
        }
    }

    @Override // org.telegram.ui.ActionBar.t2, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.z1
    public void dismiss() {
        hu huVar = this.n1;
        if (huVar != null && huVar.x) {
            huVar.x = false;
            huVar.invalidate();
        }
        super.dismiss();
        bu buVar = this.m1;
        if (buVar != null) {
            org.telegram.messenger.hs.f(buVar.d).n(buVar, org.telegram.messenger.hs.B0);
        }
        org.telegram.messenger.hs.e().k(org.telegram.messenger.hs.k1, 4);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.messenger.hs.f(this.a).c(this, org.telegram.messenger.hs.x0);
    }

    @Override // org.telegram.ui.ActionBar.t2, android.app.Dialog
    public final void onBackPressed() {
        if (org.telegram.ui.is.p().E) {
            org.telegram.ui.is.p().n();
        } else {
            super.onBackPressed();
        }
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.messenger.hs.f(this.a).n(this, org.telegram.messenger.hs.x0);
    }

    @Override // org.telegram.ui.ActionBar.t2
    public final void s0() {
        Boolean bool;
        try {
            super.s0();
            cp cpVar = this.x1;
            if (cpVar != null) {
                cpVar.b(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Ci, this.J0));
            }
            hu huVar = this.n1;
            if (huVar != null && (bool = huVar.c) != null) {
                O0(bool.booleanValue());
            }
            ViewGroup viewGroup = this.b;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.t2, android.app.Dialog
    public final void show() {
        TLRPC.StickerSet stickerSet;
        super.show();
        fu fuVar = new fu(this);
        this.p1 = fuVar;
        this.o1.setAdapter(fuVar);
        int i3 = 1;
        int i10 = 0;
        org.telegram.messenger.hs.e().k(org.telegram.messenger.hs.j1, 4);
        bu buVar = this.m1;
        if (!buVar.e) {
            buVar.e = true;
            pu puVar = buVar.f;
            int i11 = buVar.d;
            buVar.b = new ArrayList(buVar.a.size());
            buVar.c = new ArrayList[buVar.a.size()];
            org.telegram.messenger.hs.f(i11).c(buVar, 64);
            boolean[] zArr = new boolean[1];
            int i12 = 0;
            while (true) {
                if (i12 < buVar.c.length) {
                    TLRPC.TL_messages_stickerSet l02 = org.telegram.messenger.li.b0(i11).l0((TLRPC.InputStickerSet) buVar.a.get(i12), null, false, false, new ei(i3, buVar, zArr));
                    if (buVar.c.length != 1 || l02 == null || (stickerSet = l02.set) == null || stickerSet.emojis) {
                        buVar.b.add(l02);
                        buVar.a(i12, l02);
                        i12++;
                    } else {
                        org.telegram.messenger.g0.h3(new mu(buVar, i10));
                        Context context = puVar.getContext();
                        org.telegram.ui.ActionBar.d2 d2Var = puVar.k1;
                        TLRPC.InputStickerSet inputStickerSet = (TLRPC.InputStickerSet) buVar.a.get(i12);
                        org.telegram.ui.ActionBar.d2 d2Var2 = puVar.k1;
                        new xv0(context, d2Var, inputStickerSet, null, d2Var2 instanceof org.telegram.ui.wm ? ((org.telegram.ui.wm) d2Var2).a0 : null, puVar.J0).show();
                    }
                } else {
                    pu puVar2 = buVar.h;
                    puVar2.N0();
                    gi.v vVar = puVar2.o1;
                    if (vVar != null && vVar.getAdapter() != null) {
                        vVar.getAdapter().f();
                    }
                }
            }
        }
        N0();
        org.telegram.ui.ActionBar.d2 d2Var3 = this.k1;
        org.telegram.messenger.li.b0(d2Var3 == null ? org.telegram.messenger.h10.t0 : d2Var3.getCurrentAccount()).B(5);
    }

    public void K0(boolean z10) {
    }

    public void L0() {
    }
}
