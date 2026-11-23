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

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public class ev extends org.telegram.ui.ActionBar.w2 implements org.telegram.messenger.gs {
    public static Pattern Q1;
    public final up A1;
    public org.telegram.ui.ActionBar.g1 B1;
    public final boolean C1;
    public boolean D1;
    public float E1;
    public int F1;
    public int G1;
    public final d6 H1;
    public final pu I1;
    public int J1;
    public boolean K1;
    public long L1;
    public ValueAnimator M1;
    public boolean N1;
    public PorterDuffColorFilter O1;
    public int P1;
    public LongSparseArray m1;
    public final org.telegram.ui.ActionBar.g2 n1;
    public final ln o1;
    public final qu p1;
    public final wu q1;
    public final hi.x r1;
    public uu s1;
    public final View t1;
    public final FrameLayout u1;
    public final TextView v1;
    public final TextView w1;
    public final ug.r0 x1;
    public final v4.t y1;
    public final org.telegram.ui.ActionBar.k5 z1;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ev(org.telegram.ui.ActionBar.g2 g2Var, Context context, org.telegram.ui.ActionBar.h6 h6Var, ArrayList arrayList) {
        super(1, context, r4, false);
        org.telegram.ui.ActionBar.h6 resourceProvider = (g2Var == null || g2Var.getResourceProvider() == null) ? h6Var : g2Var.getResourceProvider();
        this.F1 = -1;
        this.G1 = -1;
        this.I1 = new pu(this);
        this.J1 = -1;
        this.K1 = false;
        this.N1 = true;
        this.n1 = g2Var;
        O();
        if (arrayList != null) {
            this.C1 = arrayList.size() > 1;
        }
        this.p1 = new qu(this.a, arrayList, this);
        float L = org.telegram.messenger.g0.L(32.0f);
        float L2 = org.telegram.messenger.g0.L(3.5f);
        int i7 = org.telegram.ui.ActionBar.m6.Fi;
        this.A1 = new up(L, L2, org.telegram.ui.ActionBar.m6.w0(i7, this.J0));
        wu wuVar = new wu(this, context);
        this.q1 = wuVar;
        this.b = wuVar;
        this.o1 = new ln(context, 10);
        hi.x xVar = new hi.x(this, context, this.J0);
        this.r1 = xVar;
        this.H1 = new d6(0.0f, xVar, 0L, 1250L, nr.i);
        ViewGroup viewGroup = this.b;
        int i10 = this.u0;
        viewGroup.setPadding(i10, org.telegram.messenger.g0.m, i10, 0);
        this.b.setClipChildren(false);
        this.b.setClipToPadding(false);
        this.b.setWillNotDraw(false);
        xVar.setWillNotDraw(false);
        xVar.setSelectorRadius(org.telegram.messenger.g0.L(6.0f));
        org.telegram.ui.ActionBar.t6.l(xVar, 20, org.telegram.ui.ActionBar.m6.i6, resourceProvider);
        xVar.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(this.C1 ? 8.0f : 68.0f));
        v4.t tVar = new v4.t(8);
        this.y1 = tVar;
        xVar.setLayoutManager(tVar);
        xVar.i(new ai.j0(this, 3));
        xVar.j(new oa(this, 9));
        xm xmVar = new xm(this, arrayList, g2Var, resourceProvider);
        xVar.setOnItemClickListener(xmVar);
        xVar.setOnItemLongClickListener((sj0) new h2(17, this, context));
        xVar.setOnTouchListener(new hi.p1(2, this, xmVar));
        tVar.k1(false);
        tVar.O = new su(this);
        this.z1 = new org.telegram.ui.ActionBar.k5(xVar, tVar);
        this.b.addView(xVar, c8.ma.e(-1, -1, 51));
        View view = new View(context);
        this.t1 = view;
        org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.V5, view, null);
        this.b.addView(view, c8.ma.a(-1.0f, 1.0f / org.telegram.messenger.g0.p, 80));
        view.setTranslationY(-org.telegram.messenger.g0.L(68.0f));
        FrameLayout frameLayout = new FrameLayout(context);
        this.u1 = frameLayout;
        org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.h5, frameLayout, this.J0);
        this.b.addView(frameLayout, c8.ma.e(-1, 68, 87));
        TextView textView = new TextView(context);
        this.v1 = textView;
        textView.setVisibility(8);
        org.telegram.ui.Cells.y e10 = org.telegram.ui.ActionBar.a6.e(org.telegram.ui.ActionBar.m6.w0(i7, this.J0), 24.0f);
        org.telegram.ui.ActionBar.p6 M = org.telegram.ui.ActionBar.t6.M(i7);
        org.telegram.ui.ActionBar.p6 e11 = org.telegram.ui.ActionBar.t6.e(i7);
        org.telegram.ui.ActionBar.h6 h6Var2 = this.J0;
        textView.setBackground(e10);
        org.telegram.ui.ActionBar.t6.j(textView, e10, M, e11, h6Var2);
        org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.Ji, this.J0);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setGravity(17);
        c8.ra.b(textView, 0.02f, 1.2f);
        TextView m10 = org.telegram.ui.Cells.c0.m(frameLayout, textView, c8.ma.d(-1, 48.0f, 80, 12.0f, 10.0f, 12.0f, 10.0f), context);
        this.w1 = m10;
        m10.setVisibility(8);
        int i11 = org.telegram.ui.ActionBar.m6.q7;
        org.telegram.ui.Cells.y a02 = org.telegram.ui.ActionBar.m6.a0(org.telegram.ui.ActionBar.m6.w0(i11, this.J0) & 268435455, 0, 0);
        org.telegram.ui.ActionBar.p6 g10 = org.telegram.ui.ActionBar.t6.g(i11, 15);
        org.telegram.ui.ActionBar.h6 h6Var3 = this.J0;
        m10.setBackground(a02);
        org.telegram.ui.ActionBar.t6.j(m10, a02, null, g10, h6Var3);
        org.telegram.ui.ActionBar.t6.U(m10, i11, this.J0);
        m10.setTypeface(org.telegram.messenger.g0.o());
        m10.setGravity(17);
        m10.setClickable(true);
        frameLayout.addView(m10, c8.ma.d(-1, -1.0f, 80, 0.0f, 0.0f, 0.0f, 19.0f));
        ug.r0 r0Var = new ug.r0(context, this.J0, false);
        this.x1 = r0Var;
        r0Var.b(org.telegram.messenger.hd.N0(2131743620, null), new o0(this, 12), false);
        r0Var.setIcon(R.raw.unlock_icon);
        r0Var.w.setClickable(true);
        frameLayout.addView(r0Var, c8.ma.d(-1, 48.0f, 80, 12.0f, 10.0f, 12.0f, 10.0f));
    }

    public static void K0(final org.telegram.ui.ActionBar.g2 g2Var, TLObject tLObject, final boolean z10, final di.p9 p9Var, final oo ooVar) {
        final int currentAccount = g2Var == null ? org.telegram.messenger.k10.t0 : g2Var.getCurrentAccount();
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
        Runnable runnable = (Runnable) org.telegram.messenger.si.d0(currentAccount).U.f(stickerSet2.id);
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
        ConnectionsManager.getInstance(currentAccount).sendRequest(tL_messages_installStickerSet, new RequestDelegate() { // from class: org.telegram.ui.Components.nu
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(final TLObject tLObject2, final TLRPC.TL_error tL_error) {
                final TLRPC.StickerSet stickerSet3 = TLRPC.StickerSet.this;
                final boolean z11 = z10;
                final View view = fragmentView;
                final org.telegram.ui.ActionBar.g2 g2Var2 = g2Var;
                final TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = tL_messages_stickerSet;
                final int i7 = currentAccount;
                final org.telegram.messenger.y10 y10Var = p9Var;
                final Runnable runnable2 = ooVar;
                org.telegram.messenger.g0.g3(new Runnable() { // from class: org.telegram.ui.Components.mu
                    @Override // java.lang.Runnable
                    public final void run() {
                        TLObject tLObject3 = tLObject2;
                        TLRPC.StickerSet stickerSet4 = TLRPC.StickerSet.this;
                        int i10 = stickerSet4.masks ? 1 : stickerSet4.emojis ? 5 : 0;
                        TLRPC.TL_error tL_error2 = tL_error;
                        View view2 = view;
                        org.telegram.ui.ActionBar.g2 g2Var3 = g2Var2;
                        int i11 = i7;
                        org.telegram.messenger.y10 y10Var2 = y10Var;
                        try {
                            if (tL_error2 == null) {
                                if (z11 && view2 != null) {
                                    Context context = g2Var3.getFragmentView().getContext();
                                    TLObject tLObject4 = tL_messages_stickerSet2;
                                    gc.g(g2Var3, new pv0(context, tLObject4 == null ? stickerSet4 : tLObject4, 1, 2, null, g2Var3.getResourceProvider()), 1500).j();
                                }
                                if (tLObject3 instanceof TLRPC.TL_messages_stickerSetInstallResultArchive) {
                                    org.telegram.messenger.si.d0(i11).E1(g2Var3, true, i10, (TLRPC.TL_messages_stickerSetInstallResultArchive) tLObject3);
                                }
                                if (y10Var2 != null) {
                                    y10Var2.a(Boolean.TRUE);
                                }
                            } else if (view2 != null) {
                                Toast.makeText(g2Var3.getFragmentView().getContext(), org.telegram.messenger.hd.N0(2131751093, null), 0).show();
                                if (y10Var2 != null) {
                                    y10Var2.a(Boolean.FALSE);
                                }
                            } else if (y10Var2 != null) {
                                y10Var2.a(Boolean.FALSE);
                            }
                        } catch (Exception e10) {
                            org.telegram.messenger.a8.g(e10, true);
                        }
                        org.telegram.messenger.si.d0(i11).e1(i10, false, true, false, new z2(runnable2, 6));
                    }
                });
            }
        });
    }

    @Override // org.telegram.ui.ActionBar.w2
    public final boolean G() {
        return false;
    }

    public final int J0() {
        if (this.b == null) {
            return 0;
        }
        hi.x xVar = this.r1;
        if (xVar == null || xVar.getChildCount() < 1) {
            return this.b.getPaddingTop();
        }
        View childAt = xVar.getChildAt(0);
        ln lnVar = this.o1;
        return childAt != lnVar ? this.b.getPaddingTop() : lnVar.getBottom() + ((int) xVar.getY());
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
        qu quVar = this.p1;
        ArrayList arrayList = quVar.b == null ? new ArrayList() : new ArrayList(quVar.b);
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
        org.telegram.messenger.si d02 = org.telegram.messenger.si.d0(this.a);
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
        boolean z10 = quVar.a != null && arrayList.size() == quVar.a.size();
        if (!this.N1 && z10 && this.M1 == null) {
            this.M1 = ValueAnimator.ofFloat(this.E1, 1.0f);
            this.b.getY();
            this.M1.addUpdateListener(new x(this, 17));
            this.M1.setDuration(250L);
            this.M1.setInterpolator(nr.h);
            this.M1.start();
        }
        this.N1 = z10;
        hi.x xVar = this.r1;
        if (!z10) {
            xVar.setAlpha(0.0f);
        } else if (this.J1 >= 0) {
            int L0 = this.y1.L0();
            int E = this.s1.E(this.J1);
            if (Math.abs(L0 - E) > 54) {
                int i13 = L0 < E ? 0 : 1;
                org.telegram.ui.ActionBar.k5 k5Var = this.z1;
                k5Var.b = i13;
                k5Var.k(E, (org.telegram.messenger.g0.q.y / 2) - org.telegram.messenger.g0.L(170.0f), false, false);
            } else {
                xVar.y0(E);
            }
            this.F1 = this.s1.E(this.J1);
            uu uuVar = this.s1;
            int i14 = this.J1;
            ev evVar = uuVar.c;
            boolean z11 = evVar.D1;
            qu quVar2 = evVar.p1;
            int i15 = z11 ? 2 : 1;
            int i16 = 0;
            while (true) {
                ArrayList[] arrayListArr = quVar2.c;
                if (i16 >= arrayListArr.length) {
                    break;
                }
                int size = arrayListArr[i16].size();
                if (quVar2.c.length > 1) {
                    size = Math.min(evVar.y1.J * 2, size);
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
            xVar.invalidate();
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
                textView2.setText(org.telegram.messenger.hd.G(((TLRPC.TL_messages_stickerSet) arrayList4.get(0)).documents.size(), "AddManyEmojiCount", new Object[0]));
            } else {
                textView2.setText(org.telegram.messenger.hd.G(arrayList4.size(), "AddManyEmojiPacksCount", new Object[0]));
            }
            textView2.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.lu
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
                                ev evVar2 = this;
                                if (i19 >= size3) {
                                    evVar2.L0(true);
                                    if (size2 <= 1) {
                                        evVar2.dismiss();
                                        break;
                                    }
                                } else {
                                    ev.K0(evVar2.n1, (TLObject) arrayList5.get(i19), size2 == 1, size2 > 1 ? new di.p9(evVar2, iArr, size2, arrayList5, 5) : null, null);
                                    i19++;
                                }
                            }
                            break;
                        default:
                            ev evVar3 = this;
                            evVar3.dismiss();
                            org.telegram.ui.ActionBar.g2 g2Var = evVar3.n1;
                            ArrayList arrayList6 = arrayList4;
                            if (g2Var != null) {
                                org.telegram.messenger.si d03 = org.telegram.messenger.si.d0(g2Var.getCurrentAccount());
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
                                    long s5 = org.telegram.messenger.si.s(arrayList7);
                                    jArr[i20] = s5;
                                    int i26 = i20;
                                    d03.O1(i26, i25, s5, arrayList7);
                                    org.telegram.messenger.ls notificationCenter = d03.getNotificationCenter();
                                    Object[] objArr = new Object[2];
                                    objArr[z15 ? 1 : 0] = Integer.valueOf(i26);
                                    objArr[i24] = Boolean.TRUE;
                                    notificationCenter.k(60, objArr);
                                    for (int i27 = z15 ? 1 : 0; i27 < arrayList6.size(); i27++) {
                                        d03.j1(((TLRPC.TL_messages_stickerSet) arrayList6.get(i27)).set.id, i24);
                                    }
                                    pv0 pv0Var = new pv0(context, tL_messages_stickerSet2, arrayList6.size(), 0, null, g2Var.getResourceProvider());
                                    ?? r14 = new boolean[i24];
                                    ec ecVar = new ec(context, null, z15);
                                    ecVar.b = new org.telegram.messenger.zj(d03, (Serializable) r14, arrayList6, i26, (Serializable) r92, 2);
                                    ecVar.c = new bg.m0(d03, (boolean[]) r14, arrayList6, context, g2Var, i26);
                                    pv0Var.setButton(ecVar);
                                    for (int i28 = 0; i28 < arrayList6.size(); i28++) {
                                        d03.U.k(new org.telegram.messenger.a(ecVar, 22), ((TLRPC.TL_messages_stickerSet) arrayList6.get(i28)).set.id);
                                    }
                                    gc.g(g2Var, pv0Var, 2750).j();
                                }
                            } else {
                                int i29 = 0;
                                while (i29 < arrayList6.size()) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet4 = (TLRPC.TL_messages_stickerSet) arrayList6.get(i29);
                                    Context context2 = evVar3.getContext();
                                    boolean z16 = i29 == 0;
                                    if (tL_messages_stickerSet4 != null) {
                                        org.telegram.messenger.si.d0(org.telegram.messenger.k10.t0).l2(context2, tL_messages_stickerSet4, null, 0, null, null, true, z16, null, true);
                                    }
                                    i29++;
                                }
                            }
                            evVar3.L0(false);
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
            textView.setText(org.telegram.messenger.hd.G(((TLRPC.TL_messages_stickerSet) arrayList2.get(0)).documents.size(), "RemoveManyEmojiCount", new Object[0]));
        } else {
            textView.setText(org.telegram.messenger.hd.G(arrayList2.size(), "RemoveManyEmojiPacksCount", new Object[0]));
        }
        textView.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.lu
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
                            ev evVar2 = this;
                            if (i19 >= size3) {
                                evVar2.L0(true);
                                if (size2 <= 1) {
                                    evVar2.dismiss();
                                    break;
                                }
                            } else {
                                ev.K0(evVar2.n1, (TLObject) arrayList5.get(i19), size2 == 1, size2 > 1 ? new di.p9(evVar2, iArr, size2, arrayList5, 5) : null, null);
                                i19++;
                            }
                        }
                        break;
                    default:
                        ev evVar3 = this;
                        evVar3.dismiss();
                        org.telegram.ui.ActionBar.g2 g2Var = evVar3.n1;
                        ArrayList arrayList6 = arrayList2;
                        if (g2Var != null) {
                            org.telegram.messenger.si d03 = org.telegram.messenger.si.d0(g2Var.getCurrentAccount());
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
                                long s5 = org.telegram.messenger.si.s(arrayList7);
                                jArr[i20] = s5;
                                int i26 = i20;
                                d03.O1(i26, i25, s5, arrayList7);
                                org.telegram.messenger.ls notificationCenter = d03.getNotificationCenter();
                                Object[] objArr = new Object[2];
                                objArr[z15 ? 1 : 0] = Integer.valueOf(i26);
                                objArr[i24] = Boolean.TRUE;
                                notificationCenter.k(60, objArr);
                                for (int i27 = z15 ? 1 : 0; i27 < arrayList6.size(); i27++) {
                                    d03.j1(((TLRPC.TL_messages_stickerSet) arrayList6.get(i27)).set.id, i24);
                                }
                                pv0 pv0Var = new pv0(context, tL_messages_stickerSet2, arrayList6.size(), 0, null, g2Var.getResourceProvider());
                                ?? r14 = new boolean[i24];
                                ec ecVar = new ec(context, null, z15);
                                ecVar.b = new org.telegram.messenger.zj(d03, (Serializable) r14, arrayList6, i26, (Serializable) r92, 2);
                                ecVar.c = new bg.m0(d03, (boolean[]) r14, arrayList6, context, g2Var, i26);
                                pv0Var.setButton(ecVar);
                                for (int i28 = 0; i28 < arrayList6.size(); i28++) {
                                    d03.U.k(new org.telegram.messenger.a(ecVar, 22), ((TLRPC.TL_messages_stickerSet) arrayList6.get(i28)).set.id);
                                }
                                gc.g(g2Var, pv0Var, 2750).j();
                            }
                        } else {
                            int i29 = 0;
                            while (i29 < arrayList6.size()) {
                                TLRPC.TL_messages_stickerSet tL_messages_stickerSet4 = (TLRPC.TL_messages_stickerSet) arrayList6.get(i29);
                                Context context2 = evVar3.getContext();
                                boolean z16 = i29 == 0;
                                if (tL_messages_stickerSet4 != null) {
                                    org.telegram.messenger.si.d0(org.telegram.messenger.k10.t0).l2(context2, tL_messages_stickerSet4, null, 0, null, null, true, z16, null, true);
                                }
                                i29++;
                            }
                        }
                        evVar3.L0(false);
                        break;
                }
            }
        });
        Q0(true);
    }

    public final void P0(boolean z10) {
        boolean z11 = org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.h5, this.J0)) > 0.721f;
        boolean z12 = org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.m6.w(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.s8, this.J0), 855638016)) > 0.721f;
        if (!z10) {
            z11 = z12;
        }
        org.telegram.messenger.g0.p3(this, z11);
    }

    public final void Q0(boolean z10) {
        boolean z11 = !this.K1 && z10;
        float L = this.w1.getVisibility() == 0 ? org.telegram.messenger.g0.L(19.0f) : 0;
        boolean z12 = this.C1;
        hi.x xVar = this.r1;
        View view = this.t1;
        FrameLayout frameLayout = this.u1;
        float f10 = 0.0f;
        if (z11) {
            ViewPropertyAnimator duration = frameLayout.animate().translationY(z10 ? L : org.telegram.messenger.g0.L(16.0f)).alpha(z10 ? 1.0f : 0.0f).setDuration(250L);
            nr nrVar = nr.h;
            duration.setInterpolator(nrVar).start();
            view.animate().translationY(z10 ? -(org.telegram.messenger.g0.L(68.0f) - L) : 0.0f).alpha(z10 ? 1.0f : 0.0f).setDuration(250L).setInterpolator(nrVar).start();
            ViewPropertyAnimator animate = xVar.animate();
            if (!z12 && !z10) {
                f10 = org.telegram.messenger.g0.L(68.0f) - L;
            }
            animate.translationY(f10).setDuration(250L).setInterpolator(nrVar).start();
        } else {
            frameLayout.setAlpha(z10 ? 1.0f : 0.0f);
            frameLayout.setTranslationY(z10 ? L : org.telegram.messenger.g0.L(16.0f));
            view.setAlpha(z10 ? 1.0f : 0.0f);
            view.setTranslationY(z10 ? -(org.telegram.messenger.g0.L(68.0f) - L) : 0.0f);
            if (!z12 && !z10) {
                f10 = org.telegram.messenger.g0.L(68.0f) - L;
            }
            xVar.setTranslationY(f10);
        }
        this.K1 = z10;
    }

    @Override // org.telegram.ui.ActionBar.w2
    public final int S() {
        hi.x xVar = this.r1;
        int measuredHeight = (xVar == null ? 0 : xVar.getMeasuredHeight()) - J0();
        ViewGroup viewGroup = this.b;
        return org.telegram.messenger.g0.L(8.0f) + measuredHeight + (viewGroup != null ? viewGroup.getPaddingTop() : 0) + org.telegram.messenger.g0.n;
    }

    @Override // org.telegram.messenger.gs
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        av avVar;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        if (i7 != org.telegram.messenger.ls.x0) {
            return;
        }
        int i11 = 0;
        while (true) {
            hi.x xVar = this.r1;
            if (i11 >= xVar.getChildCount()) {
                O0();
                return;
            }
            View childAt = xVar.getChildAt(i11);
            if ((childAt instanceof av) && (tL_messages_stickerSet = (avVar = (av) childAt).r) != null && tL_messages_stickerSet.set != null) {
                avVar.a(org.telegram.messenger.si.d0(this.a).E0(avVar.r.set.id, true), true);
            }
            i11++;
        }
    }

    @Override // org.telegram.ui.ActionBar.w2, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.c2
    public void dismiss() {
        wu wuVar = this.q1;
        if (wuVar != null && wuVar.x) {
            wuVar.x = false;
            wuVar.invalidate();
        }
        super.dismiss();
        qu quVar = this.p1;
        if (quVar != null) {
            org.telegram.messenger.ls.f(quVar.d).n(quVar, org.telegram.messenger.ls.B0);
        }
        org.telegram.messenger.ls.e().k(org.telegram.messenger.ls.k1, 4);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.messenger.ls.f(this.a).c(this, org.telegram.messenger.ls.x0);
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
        org.telegram.messenger.ls.f(this.a).n(this, org.telegram.messenger.ls.x0);
    }

    @Override // org.telegram.ui.ActionBar.w2
    public final void s0() {
        Boolean bool;
        try {
            super.s0();
            up upVar = this.A1;
            if (upVar != null) {
                upVar.b(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Fi, this.J0));
            }
            wu wuVar = this.q1;
            if (wuVar != null && (bool = wuVar.c) != null) {
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
        uu uuVar = new uu(this);
        this.s1 = uuVar;
        this.r1.setAdapter(uuVar);
        int i7 = 0;
        org.telegram.messenger.ls.e().k(org.telegram.messenger.ls.j1, 4);
        qu quVar = this.p1;
        if (!quVar.e) {
            quVar.e = true;
            ev evVar = quVar.f;
            int i10 = quVar.d;
            quVar.b = new ArrayList(quVar.a.size());
            quVar.c = new ArrayList[quVar.a.size()];
            org.telegram.messenger.ls.f(i10).c(quVar, 64);
            boolean[] zArr = new boolean[1];
            int i11 = 0;
            while (true) {
                if (i11 < quVar.c.length) {
                    TLRPC.TL_messages_stickerSet n02 = org.telegram.messenger.si.d0(i10).n0((TLRPC.InputStickerSet) quVar.a.get(i11), null, false, false, new rh(2, quVar, zArr));
                    if (quVar.c.length != 1 || n02 == null || (stickerSet = n02.set) == null || stickerSet.emojis) {
                        quVar.b.add(n02);
                        quVar.a(i11, n02);
                        i11++;
                    } else {
                        org.telegram.messenger.g0.g3(new bv(quVar, i7));
                        Context context = evVar.getContext();
                        org.telegram.ui.ActionBar.g2 g2Var = evVar.n1;
                        TLRPC.InputStickerSet inputStickerSet = (TLRPC.InputStickerSet) quVar.a.get(i11);
                        org.telegram.ui.ActionBar.g2 g2Var2 = evVar.n1;
                        new kw0(context, g2Var, inputStickerSet, null, g2Var2 instanceof org.telegram.ui.bn ? ((org.telegram.ui.bn) g2Var2).a0 : null, evVar.J0).show();
                    }
                } else {
                    ev evVar2 = quVar.h;
                    evVar2.O0();
                    hi.x xVar = evVar2.r1;
                    if (xVar != null && xVar.getAdapter() != null) {
                        xVar.getAdapter().f();
                    }
                }
            }
        }
        O0();
        org.telegram.ui.ActionBar.g2 g2Var3 = this.n1;
        org.telegram.messenger.si.d0(g2Var3 == null ? org.telegram.messenger.k10.t0 : g2Var3.getCurrentAccount()).D(5);
    }

    public void L0(boolean z10) {
    }

    public void M0() {
    }
}
