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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public class cv extends org.telegram.ui.ActionBar.z2 implements org.telegram.messenger.us {
    public static Pattern M1;
    public float A1;
    public int B1;
    public int C1;
    public final t5 D1;
    public final nu E1;
    public int F1;
    public boolean G1;
    public long H1;
    public ValueAnimator I1;
    public boolean J1;
    public PorterDuffColorFilter K1;
    public int L1;
    public LongSparseArray i1;
    public final org.telegram.ui.ActionBar.k2 j1;
    public final bn k1;
    public final ou l1;
    public final uu m1;
    public final org.telegram.ui.g3 n1;
    public su o1;
    public final View p1;
    public final FrameLayout q1;
    public final TextView r1;
    public final TextView s1;
    public final kg.x0 t1;
    public final s4.r u1;
    public final vj0 v1;
    public final kp w1;
    public org.telegram.ui.ActionBar.k1 x1;
    public final boolean y1;
    public boolean z1;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public cv(org.telegram.ui.ActionBar.k2 k2Var, Context context, org.telegram.ui.ActionBar.p6 p6Var, ArrayList arrayList) {
        super(1, context, r4, false);
        org.telegram.ui.ActionBar.p6 resourceProvider = (k2Var == null || k2Var.getResourceProvider() == null) ? p6Var : k2Var.getResourceProvider();
        this.B1 = -1;
        this.C1 = -1;
        this.E1 = new nu(this);
        this.F1 = -1;
        this.G1 = false;
        this.J1 = true;
        this.j1 = k2Var;
        O();
        if (arrayList != null) {
            this.y1 = arrayList.size() > 1;
        }
        this.l1 = new ou(this.a, arrayList, this);
        float L = org.telegram.messenger.i0.L(32.0f);
        float L2 = org.telegram.messenger.i0.L(3.5f);
        int i10 = org.telegram.ui.ActionBar.t6.Ci;
        this.w1 = new kp(L, L2, org.telegram.ui.ActionBar.t6.w0(i10, this.I0));
        uu uuVar = new uu(this, context);
        this.m1 = uuVar;
        this.b = uuVar;
        this.k1 = new bn(context, 7);
        org.telegram.ui.g3 g3Var = new org.telegram.ui.g3(this, context, this.I0);
        this.n1 = g3Var;
        this.D1 = new t5(0.0f, g3Var, 0L, 1250L, gr.i);
        ViewGroup viewGroup = this.b;
        int i11 = this.t0;
        viewGroup.setPadding(i11, org.telegram.messenger.i0.m, i11, 0);
        this.b.setClipChildren(false);
        this.b.setClipToPadding(false);
        this.b.setWillNotDraw(false);
        g3Var.setWillNotDraw(false);
        g3Var.setSelectorRadius(org.telegram.messenger.i0.L(6.0f));
        org.telegram.ui.ActionBar.a7.m(g3Var, 20, org.telegram.ui.ActionBar.t6.i6, resourceProvider);
        g3Var.setPadding(org.telegram.messenger.i0.L(8.0f), 0, org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(this.y1 ? 8.0f : 68.0f));
        s4.r rVar = new s4.r(8);
        this.u1 = rVar;
        g3Var.setLayoutManager(rVar);
        g3Var.i(new mg.u1(this, 3));
        g3Var.j(new ag.u(this, 21));
        om omVar = new om(this, arrayList, k2Var, resourceProvider);
        g3Var.setOnItemClickListener(omVar);
        g3Var.setOnItemLongClickListener((ik0) new f2(15, this, context));
        g3Var.setOnTouchListener(new org.telegram.ui.ActionBar.d1(2, this, omVar));
        rVar.k1(false);
        rVar.O = new qu(this);
        this.v1 = new vj0(g3Var, rVar);
        this.b.addView(g3Var, w7.b6.e(-1, -1, 51));
        View view = new View(context);
        this.p1 = view;
        org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.V5, view, null);
        this.b.addView(view, w7.b6.a(-1.0f, 1.0f / org.telegram.messenger.i0.p, 80));
        view.setTranslationY(-org.telegram.messenger.i0.L(68.0f));
        FrameLayout frameLayout = new FrameLayout(context);
        this.q1 = frameLayout;
        org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.h5, frameLayout, this.I0);
        this.b.addView(frameLayout, w7.b6.e(-1, 68, 87));
        TextView textView = new TextView(context);
        this.r1 = textView;
        textView.setVisibility(8);
        org.telegram.ui.Cells.y e = org.telegram.ui.ActionBar.j6.e(org.telegram.ui.ActionBar.t6.w0(i10, this.I0), 24.0f);
        org.telegram.ui.ActionBar.w6 N = org.telegram.ui.ActionBar.a7.N(i10);
        org.telegram.ui.ActionBar.w6 f7 = org.telegram.ui.ActionBar.a7.f(i10);
        org.telegram.ui.ActionBar.p6 p6Var2 = this.I0;
        textView.setBackground(e);
        org.telegram.ui.ActionBar.a7.k(textView, e, N, f7, p6Var2);
        org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.Gi, this.I0);
        textView.setTypeface(org.telegram.messenger.i0.o());
        textView.setGravity(17);
        w7.e6.b(textView, 0.02f, 1.2f);
        TextView l4 = org.telegram.ui.Cells.f1.l(frameLayout, textView, w7.b6.d(-1, 48.0f, 80, 12.0f, 10.0f, 12.0f, 10.0f), context);
        this.s1 = l4;
        l4.setVisibility(8);
        int i12 = org.telegram.ui.ActionBar.t6.q7;
        org.telegram.ui.Cells.y a02 = org.telegram.ui.ActionBar.t6.a0(org.telegram.ui.ActionBar.t6.w0(i12, this.I0) & 268435455, 0, 0);
        org.telegram.ui.ActionBar.w6 h = org.telegram.ui.ActionBar.a7.h(i12, 15);
        org.telegram.ui.ActionBar.p6 p6Var3 = this.I0;
        l4.setBackground(a02);
        org.telegram.ui.ActionBar.a7.k(l4, a02, null, h, p6Var3);
        org.telegram.ui.ActionBar.a7.V(l4, i12, this.I0);
        l4.setTypeface(org.telegram.messenger.i0.o());
        l4.setGravity(17);
        l4.setClickable(true);
        frameLayout.addView(l4, w7.b6.d(-1, -1.0f, 80, 0.0f, 0.0f, 0.0f, 19.0f));
        kg.x0 x0Var = new kg.x0(context, this.I0, false);
        this.t1 = x0Var;
        x0Var.b(org.telegram.messenger.cd.L0(2131743890, null), new h0(this, 10), false);
        x0Var.setIcon(R.raw.unlock_icon);
        x0Var.w.setClickable(true);
        frameLayout.addView(x0Var, w7.b6.d(-1, 48.0f, 80, 12.0f, 10.0f, 12.0f, 10.0f));
    }

    public static void J0(final org.telegram.ui.ActionBar.k2 k2Var, TLObject tLObject, final boolean z10, final bi.i6 i6Var, final ho hoVar) {
        final int currentAccount = k2Var == null ? org.telegram.messenger.d20.s0 : k2Var.getCurrentAccount();
        TLRPC.StickerSet stickerSet = null;
        final View fragmentView = k2Var == null ? null : k2Var.getFragmentView();
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
        Runnable runnable = (Runnable) org.telegram.messenger.ui.b0(currentAccount).T.f(stickerSet2.id);
        if (runnable != null) {
            runnable.run();
            if (i6Var != null) {
                i6Var.a(Boolean.TRUE);
                return;
            }
            return;
        }
        TLRPC.TL_messages_installStickerSet tL_messages_installStickerSet = new TLRPC.TL_messages_installStickerSet();
        TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
        tL_messages_installStickerSet.stickerset = tL_inputStickerSetID;
        tL_inputStickerSetID.id = stickerSet2.id;
        tL_inputStickerSetID.access_hash = stickerSet2.access_hash;
        ConnectionsManager.getInstance(currentAccount).sendRequest(tL_messages_installStickerSet, new RequestDelegate() { // from class: org.telegram.ui.Components.mu
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(final TLObject tLObject2, final TLRPC.TL_error tL_error) {
                final TLRPC.StickerSet stickerSet3 = TLRPC.StickerSet.this;
                final boolean z11 = z10;
                final View view = fragmentView;
                final org.telegram.ui.ActionBar.k2 k2Var2 = k2Var;
                final TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = tL_messages_stickerSet;
                final int i10 = currentAccount;
                final org.telegram.messenger.q20 q20Var = i6Var;
                final Runnable runnable2 = hoVar;
                org.telegram.messenger.i0.g3(new Runnable() { // from class: org.telegram.ui.Components.lu
                    @Override // java.lang.Runnable
                    public final void run() {
                        TLObject tLObject3 = tLObject2;
                        TLRPC.StickerSet stickerSet4 = TLRPC.StickerSet.this;
                        int i11 = stickerSet4.masks ? 1 : stickerSet4.emojis ? 5 : 0;
                        TLRPC.TL_error tL_error2 = tL_error;
                        View view2 = view;
                        org.telegram.ui.ActionBar.k2 k2Var3 = k2Var2;
                        int i12 = i10;
                        org.telegram.messenger.q20 q20Var2 = q20Var;
                        try {
                            if (tL_error2 == null) {
                                if (z11 && view2 != null) {
                                    Context context = k2Var3.getFragmentView().getContext();
                                    TLObject tLObject4 = tL_messages_stickerSet2;
                                    wb.g(k2Var3, new fw0(context, tLObject4 == null ? stickerSet4 : tLObject4, 1, 2, null, k2Var3.getResourceProvider()), 1500).j();
                                }
                                if (tLObject3 instanceof TLRPC.TL_messages_stickerSetInstallResultArchive) {
                                    org.telegram.messenger.ui.b0(i12).A1(k2Var3, true, i11, (TLRPC.TL_messages_stickerSetInstallResultArchive) tLObject3);
                                }
                                if (q20Var2 != null) {
                                    q20Var2.a(Boolean.TRUE);
                                }
                            } else if (view2 != null) {
                                Toast.makeText(k2Var3.getFragmentView().getContext(), org.telegram.messenger.cd.L0(2131751106, null), 0).show();
                                if (q20Var2 != null) {
                                    q20Var2.a(Boolean.FALSE);
                                }
                            } else if (q20Var2 != null) {
                                q20Var2.a(Boolean.FALSE);
                            }
                        } catch (Exception e) {
                            org.telegram.messenger.f8.g(e, true);
                        }
                        org.telegram.messenger.ui.b0(i12).b1(i11, false, true, false, new r2(runnable2, 4));
                    }
                });
            }
        });
    }

    @Override // org.telegram.ui.ActionBar.z2
    public final boolean H() {
        return false;
    }

    public final int I0() {
        if (this.b == null) {
            return 0;
        }
        org.telegram.ui.g3 g3Var = this.n1;
        if (g3Var == null || g3Var.getChildCount() < 1) {
            return this.b.getPaddingTop();
        }
        View childAt = g3Var.getChildAt(0);
        bn bnVar = this.k1;
        return childAt != bnVar ? this.b.getPaddingTop() : bnVar.getBottom() + ((int) g3Var.getY());
    }

    public final void M0() {
        org.telegram.ui.ActionBar.k2 k2Var = this.j1;
        if (k2Var != null) {
            new kg.i1(k2Var, 11, false).show();
        } else if (getContext() instanceof LaunchActivity) {
            ((LaunchActivity) getContext()).t0(new PremiumPreviewFragment(0, null));
        }
    }

    public final void N0() {
        final int i10;
        TLRPC.StickerSet stickerSet;
        if (this.q1 == null) {
            return;
        }
        ou ouVar = this.l1;
        ArrayList arrayList = ouVar.b == null ? new ArrayList() : new ArrayList(ouVar.b);
        final int i11 = 0;
        int i12 = 0;
        while (true) {
            i10 = 1;
            if (i12 >= arrayList.size()) {
                break;
            }
            if (arrayList.get(i12) == null) {
                arrayList.remove(i12);
                i12--;
            }
            i12++;
        }
        org.telegram.messenger.ui b02 = org.telegram.messenger.ui.b0(this.a);
        final ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (int i13 = 0; i13 < arrayList.size(); i13++) {
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) arrayList.get(i13);
            if (tL_messages_stickerSet != null && (stickerSet = tL_messages_stickerSet.set) != null) {
                if (b02.B0(stickerSet.id, true)) {
                    arrayList2.add(tL_messages_stickerSet);
                } else {
                    arrayList3.add(tL_messages_stickerSet);
                }
            }
        }
        final ArrayList arrayList4 = new ArrayList(arrayList3);
        boolean z10 = ouVar.a != null && arrayList.size() == ouVar.a.size();
        if (!this.J1 && z10 && this.I1 == null) {
            this.I1 = ValueAnimator.ofFloat(this.A1, 1.0f);
            this.b.getY();
            this.I1.addUpdateListener(new a6(this, 16));
            this.I1.setDuration(250L);
            this.I1.setInterpolator(gr.h);
            this.I1.start();
        }
        this.J1 = z10;
        org.telegram.ui.g3 g3Var = this.n1;
        if (!z10) {
            g3Var.setAlpha(0.0f);
        } else if (this.F1 >= 0) {
            int L0 = this.u1.L0();
            int E = this.o1.E(this.F1);
            if (Math.abs(L0 - E) > 54) {
                int i14 = L0 < E ? 0 : 1;
                vj0 vj0Var = this.v1;
                vj0Var.b = i14;
                vj0Var.d(E, (org.telegram.messenger.i0.q.y / 2) - org.telegram.messenger.i0.L(170.0f), false, false);
            } else {
                g3Var.y0(E);
            }
            this.B1 = this.o1.E(this.F1);
            su suVar = this.o1;
            int i15 = this.F1;
            cv cvVar = suVar.c;
            boolean z11 = cvVar.z1;
            ou ouVar2 = cvVar.l1;
            int i16 = z11 ? 2 : 1;
            int i17 = 0;
            while (true) {
                ArrayList[] arrayListArr = ouVar2.c;
                if (i17 >= arrayListArr.length) {
                    break;
                }
                int size = arrayListArr[i17].size();
                if (ouVar2.c.length > 1) {
                    size = Math.min(cvVar.u1.J * 2, size);
                }
                if (i17 == i15) {
                    i16 = i16 + size + 1;
                    break;
                } else {
                    i16 += size + 2;
                    i17++;
                }
            }
            this.C1 = i16;
            this.D1.e(true, 1.0f);
            g3Var.invalidate();
            this.F1 = -1;
        }
        boolean z12 = this.J1;
        kg.x0 x0Var = this.t1;
        TextView textView = this.s1;
        TextView textView2 = this.r1;
        if (!z12 || this.y1) {
            x0Var.setVisibility(8);
            textView2.setVisibility(8);
            textView.setVisibility(8);
            P0(false);
            return;
        }
        x0Var.setVisibility(4);
        if (arrayList4.size() > 0) {
            textView2.setVisibility(0);
            textView.setVisibility(8);
            if (arrayList4.size() == 1) {
                textView2.setText(org.telegram.messenger.cd.G(((TLRPC.TL_messages_stickerSet) arrayList4.get(0)).documents.size(), "AddManyEmojiCount", new Object[0]));
            } else {
                textView2.setText(org.telegram.messenger.cd.G(arrayList4.size(), "AddManyEmojiPacksCount", new Object[0]));
            }
            textView2.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.ku
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r15v3, types: [boolean[], java.io.Serializable, java.lang.Object] */
                /* JADX WARN: Type inference failed for: r8v8, types: [int[], java.io.Serializable] */
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    cv cvVar2;
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2;
                    cv cvVar3;
                    int i18;
                    boolean z13;
                    int i19 = i11;
                    cv cvVar4 = this;
                    int i20 = 0;
                    boolean z14 = true;
                    switch (i19) {
                        case 0:
                            ArrayList arrayList5 = arrayList4;
                            int size2 = arrayList5.size();
                            int[] iArr = new int[2];
                            for (int i21 = 0; i21 < arrayList5.size(); i21++) {
                                cv.J0(cvVar4.j1, (TLObject) arrayList5.get(i21), size2 == 1, size2 > 1 ? new bi.i6(cvVar4, iArr, size2, arrayList5) : null, null);
                            }
                            cvVar4.K0(true);
                            if (size2 <= 1) {
                                cvVar4.dismiss();
                                break;
                            }
                            break;
                        default:
                            cvVar4.dismiss();
                            org.telegram.ui.ActionBar.k2 k2Var = cvVar4.j1;
                            ArrayList arrayList6 = arrayList4;
                            if (k2Var != null) {
                                org.telegram.messenger.ui b03 = org.telegram.messenger.ui.b0(k2Var.getCurrentAccount());
                                Context context = k2Var.getContext();
                                ArrayList[] arrayListArr2 = b03.G;
                                if (arrayList6.isEmpty() || (tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) i0.a.g(1, arrayList6)) == null) {
                                    cvVar2 = cvVar4;
                                } else {
                                    TLRPC.StickerSet stickerSet2 = tL_messages_stickerSet2.set;
                                    int i22 = stickerSet2.masks ? 1 : stickerSet2.emojis ? 5 : 0;
                                    for (int i23 = 0; i23 < arrayList6.size(); i23++) {
                                        ((TLRPC.TL_messages_stickerSet) arrayList6.get(i23)).set.archived = false;
                                    }
                                    ?? r82 = new int[arrayList6.size()];
                                    int i24 = 0;
                                    while (i24 < arrayListArr2[i22].size()) {
                                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = (TLRPC.TL_messages_stickerSet) arrayListArr2[i22].get(i24);
                                        int i25 = i20;
                                        while (true) {
                                            if (i25 < arrayList6.size()) {
                                                i18 = i20;
                                                z13 = z14;
                                                cvVar3 = cvVar4;
                                                if (tL_messages_stickerSet3.set.id == ((TLRPC.TL_messages_stickerSet) arrayList6.get(i25)).set.id) {
                                                    r82[i25] = i24;
                                                    arrayListArr2[i22].remove(i24);
                                                    b03.I.l(tL_messages_stickerSet3.set.id);
                                                    b03.J.l(tL_messages_stickerSet3.set.id);
                                                    b03.N.remove(tL_messages_stickerSet3.set.short_name);
                                                } else {
                                                    i25++;
                                                    i20 = i18;
                                                    z14 = z13;
                                                    cvVar4 = cvVar3;
                                                }
                                            } else {
                                                cvVar3 = cvVar4;
                                                i18 = i20;
                                                z13 = z14;
                                            }
                                        }
                                        i24++;
                                        i20 = i18;
                                        z14 = z13;
                                        cvVar4 = cvVar3;
                                    }
                                    cvVar2 = cvVar4;
                                    boolean z15 = i20;
                                    int i26 = z14;
                                    ArrayList arrayList7 = arrayListArr2[i22];
                                    int i27 = b03.Y[i22];
                                    long[] jArr = b03.X;
                                    int i28 = i22;
                                    long q6 = org.telegram.messenger.ui.q(arrayList7);
                                    jArr[i28] = q6;
                                    b03.J1(i28, i27, q6, arrayList7);
                                    org.telegram.messenger.zs notificationCenter = b03.getNotificationCenter();
                                    Object[] objArr = new Object[2];
                                    objArr[z15 ? 1 : 0] = Integer.valueOf(i28);
                                    objArr[i26] = Boolean.TRUE;
                                    notificationCenter.k(60, objArr);
                                    for (int i29 = z15 ? 1 : 0; i29 < arrayList6.size(); i29++) {
                                        b03.g1(((TLRPC.TL_messages_stickerSet) arrayList6.get(i29)).set.id, i26);
                                    }
                                    fw0 fw0Var = new fw0(context, tL_messages_stickerSet2, arrayList6.size(), 0, null, k2Var.getResourceProvider());
                                    ?? r15 = new boolean[i26];
                                    ub ubVar = new ub(context, null, z15);
                                    ubVar.b = new org.telegram.messenger.kk(b03, (Serializable) r15, arrayList6, i28, (Serializable) r82, 2);
                                    ubVar.c = new m4.a1(b03, (Object) r15, arrayList6, context, k2Var, i28, 3);
                                    fw0Var.setButton(ubVar);
                                    for (int i30 = 0; i30 < arrayList6.size(); i30++) {
                                        b03.T.k(new org.telegram.messenger.a(ubVar, 21), ((TLRPC.TL_messages_stickerSet) arrayList6.get(i30)).set.id);
                                    }
                                    wb.g(k2Var, fw0Var, 2750).j();
                                }
                            } else {
                                cvVar2 = cvVar4;
                                int i31 = 0;
                                while (i31 < arrayList6.size()) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet4 = (TLRPC.TL_messages_stickerSet) arrayList6.get(i31);
                                    Context context2 = cvVar2.getContext();
                                    boolean z16 = i31 == 0;
                                    if (tL_messages_stickerSet4 != null) {
                                        org.telegram.messenger.ui.b0(org.telegram.messenger.d20.s0).g2(context2, tL_messages_stickerSet4, null, 0, null, null, true, z16, null, true);
                                    }
                                    i31++;
                                }
                            }
                            cvVar2.K0(false);
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
            textView.setText(org.telegram.messenger.cd.G(((TLRPC.TL_messages_stickerSet) arrayList2.get(0)).documents.size(), "RemoveManyEmojiCount", new Object[0]));
        } else {
            textView.setText(org.telegram.messenger.cd.G(arrayList2.size(), "RemoveManyEmojiPacksCount", new Object[0]));
        }
        textView.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.ku
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r15v3, types: [boolean[], java.io.Serializable, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r8v8, types: [int[], java.io.Serializable] */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                cv cvVar2;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2;
                cv cvVar3;
                int i18;
                boolean z13;
                int i19 = i10;
                cv cvVar4 = this;
                int i20 = 0;
                boolean z14 = true;
                switch (i19) {
                    case 0:
                        ArrayList arrayList5 = arrayList2;
                        int size2 = arrayList5.size();
                        int[] iArr = new int[2];
                        for (int i21 = 0; i21 < arrayList5.size(); i21++) {
                            cv.J0(cvVar4.j1, (TLObject) arrayList5.get(i21), size2 == 1, size2 > 1 ? new bi.i6(cvVar4, iArr, size2, arrayList5) : null, null);
                        }
                        cvVar4.K0(true);
                        if (size2 <= 1) {
                            cvVar4.dismiss();
                            break;
                        }
                        break;
                    default:
                        cvVar4.dismiss();
                        org.telegram.ui.ActionBar.k2 k2Var = cvVar4.j1;
                        ArrayList arrayList6 = arrayList2;
                        if (k2Var != null) {
                            org.telegram.messenger.ui b03 = org.telegram.messenger.ui.b0(k2Var.getCurrentAccount());
                            Context context = k2Var.getContext();
                            ArrayList[] arrayListArr2 = b03.G;
                            if (arrayList6.isEmpty() || (tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) i0.a.g(1, arrayList6)) == null) {
                                cvVar2 = cvVar4;
                            } else {
                                TLRPC.StickerSet stickerSet2 = tL_messages_stickerSet2.set;
                                int i22 = stickerSet2.masks ? 1 : stickerSet2.emojis ? 5 : 0;
                                for (int i23 = 0; i23 < arrayList6.size(); i23++) {
                                    ((TLRPC.TL_messages_stickerSet) arrayList6.get(i23)).set.archived = false;
                                }
                                ?? r82 = new int[arrayList6.size()];
                                int i24 = 0;
                                while (i24 < arrayListArr2[i22].size()) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = (TLRPC.TL_messages_stickerSet) arrayListArr2[i22].get(i24);
                                    int i25 = i20;
                                    while (true) {
                                        if (i25 < arrayList6.size()) {
                                            i18 = i20;
                                            z13 = z14;
                                            cvVar3 = cvVar4;
                                            if (tL_messages_stickerSet3.set.id == ((TLRPC.TL_messages_stickerSet) arrayList6.get(i25)).set.id) {
                                                r82[i25] = i24;
                                                arrayListArr2[i22].remove(i24);
                                                b03.I.l(tL_messages_stickerSet3.set.id);
                                                b03.J.l(tL_messages_stickerSet3.set.id);
                                                b03.N.remove(tL_messages_stickerSet3.set.short_name);
                                            } else {
                                                i25++;
                                                i20 = i18;
                                                z14 = z13;
                                                cvVar4 = cvVar3;
                                            }
                                        } else {
                                            cvVar3 = cvVar4;
                                            i18 = i20;
                                            z13 = z14;
                                        }
                                    }
                                    i24++;
                                    i20 = i18;
                                    z14 = z13;
                                    cvVar4 = cvVar3;
                                }
                                cvVar2 = cvVar4;
                                boolean z15 = i20;
                                int i26 = z14;
                                ArrayList arrayList7 = arrayListArr2[i22];
                                int i27 = b03.Y[i22];
                                long[] jArr = b03.X;
                                int i28 = i22;
                                long q6 = org.telegram.messenger.ui.q(arrayList7);
                                jArr[i28] = q6;
                                b03.J1(i28, i27, q6, arrayList7);
                                org.telegram.messenger.zs notificationCenter = b03.getNotificationCenter();
                                Object[] objArr = new Object[2];
                                objArr[z15 ? 1 : 0] = Integer.valueOf(i28);
                                objArr[i26] = Boolean.TRUE;
                                notificationCenter.k(60, objArr);
                                for (int i29 = z15 ? 1 : 0; i29 < arrayList6.size(); i29++) {
                                    b03.g1(((TLRPC.TL_messages_stickerSet) arrayList6.get(i29)).set.id, i26);
                                }
                                fw0 fw0Var = new fw0(context, tL_messages_stickerSet2, arrayList6.size(), 0, null, k2Var.getResourceProvider());
                                ?? r15 = new boolean[i26];
                                ub ubVar = new ub(context, null, z15);
                                ubVar.b = new org.telegram.messenger.kk(b03, (Serializable) r15, arrayList6, i28, (Serializable) r82, 2);
                                ubVar.c = new m4.a1(b03, (Object) r15, arrayList6, context, k2Var, i28, 3);
                                fw0Var.setButton(ubVar);
                                for (int i30 = 0; i30 < arrayList6.size(); i30++) {
                                    b03.T.k(new org.telegram.messenger.a(ubVar, 21), ((TLRPC.TL_messages_stickerSet) arrayList6.get(i30)).set.id);
                                }
                                wb.g(k2Var, fw0Var, 2750).j();
                            }
                        } else {
                            cvVar2 = cvVar4;
                            int i31 = 0;
                            while (i31 < arrayList6.size()) {
                                TLRPC.TL_messages_stickerSet tL_messages_stickerSet4 = (TLRPC.TL_messages_stickerSet) arrayList6.get(i31);
                                Context context2 = cvVar2.getContext();
                                boolean z16 = i31 == 0;
                                if (tL_messages_stickerSet4 != null) {
                                    org.telegram.messenger.ui.b0(org.telegram.messenger.d20.s0).g2(context2, tL_messages_stickerSet4, null, 0, null, null, true, z16, null, true);
                                }
                                i31++;
                            }
                        }
                        cvVar2.K0(false);
                        break;
                }
            }
        });
        P0(true);
    }

    public final void O0(boolean z10) {
        boolean z11 = org.telegram.messenger.i0.B(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.h5, this.I0)) > 0.721f;
        boolean z12 = org.telegram.messenger.i0.B(org.telegram.ui.ActionBar.t6.w(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.s8, this.I0), 855638016)) > 0.721f;
        if (!z10) {
            z11 = z12;
        }
        org.telegram.messenger.i0.p3(this, z11);
    }

    public final void P0(boolean z10) {
        boolean z11 = !this.G1 && z10;
        float L = this.s1.getVisibility() == 0 ? org.telegram.messenger.i0.L(19.0f) : 0;
        boolean z12 = this.y1;
        org.telegram.ui.g3 g3Var = this.n1;
        View view = this.p1;
        FrameLayout frameLayout = this.q1;
        float f7 = 0.0f;
        if (z11) {
            ViewPropertyAnimator duration = frameLayout.animate().translationY(z10 ? L : org.telegram.messenger.i0.L(16.0f)).alpha(z10 ? 1.0f : 0.0f).setDuration(250L);
            gr grVar = gr.h;
            duration.setInterpolator(grVar).start();
            view.animate().translationY(z10 ? -(org.telegram.messenger.i0.L(68.0f) - L) : 0.0f).alpha(z10 ? 1.0f : 0.0f).setDuration(250L).setInterpolator(grVar).start();
            ViewPropertyAnimator animate = g3Var.animate();
            if (!z12 && !z10) {
                f7 = org.telegram.messenger.i0.L(68.0f) - L;
            }
            animate.translationY(f7).setDuration(250L).setInterpolator(grVar).start();
        } else {
            frameLayout.setAlpha(z10 ? 1.0f : 0.0f);
            frameLayout.setTranslationY(z10 ? L : org.telegram.messenger.i0.L(16.0f));
            view.setAlpha(z10 ? 1.0f : 0.0f);
            view.setTranslationY(z10 ? -(org.telegram.messenger.i0.L(68.0f) - L) : 0.0f);
            if (!z12 && !z10) {
                f7 = org.telegram.messenger.i0.L(68.0f) - L;
            }
            g3Var.setTranslationY(f7);
        }
        this.G1 = z10;
    }

    @Override // org.telegram.ui.ActionBar.z2
    public final int S() {
        org.telegram.ui.g3 g3Var = this.n1;
        int measuredHeight = (g3Var == null ? 0 : g3Var.getMeasuredHeight()) - I0();
        ViewGroup viewGroup = this.b;
        return org.telegram.messenger.i0.L(8.0f) + measuredHeight + (viewGroup != null ? viewGroup.getPaddingTop() : 0) + org.telegram.messenger.i0.n;
    }

    @Override // org.telegram.messenger.us
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        yu yuVar;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        if (i10 != org.telegram.messenger.zs.x0) {
            return;
        }
        int i12 = 0;
        while (true) {
            org.telegram.ui.g3 g3Var = this.n1;
            if (i12 >= g3Var.getChildCount()) {
                N0();
                return;
            }
            View childAt = g3Var.getChildAt(i12);
            if ((childAt instanceof yu) && (tL_messages_stickerSet = (yuVar = (yu) childAt).r) != null && tL_messages_stickerSet.set != null) {
                yuVar.a(org.telegram.messenger.ui.b0(this.a).B0(yuVar.r.set.id, true), true);
            }
            i12++;
        }
    }

    @Override // org.telegram.ui.ActionBar.z2, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.g2
    public void dismiss() {
        uu uuVar = this.m1;
        if (uuVar != null && uuVar.x) {
            uuVar.x = false;
            uuVar.invalidate();
        }
        super.dismiss();
        ou ouVar = this.l1;
        if (ouVar != null) {
            org.telegram.messenger.zs.f(ouVar.d).n(ouVar, org.telegram.messenger.zs.B0);
        }
        org.telegram.messenger.zs.e().k(org.telegram.messenger.zs.k1, 4);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.messenger.zs.f(this.a).c(this, org.telegram.messenger.zs.x0);
    }

    @Override // org.telegram.ui.ActionBar.z2, android.app.Dialog
    public final void onBackPressed() {
        if (org.telegram.ui.lt.p().E) {
            org.telegram.ui.lt.p().n();
        } else {
            super.onBackPressed();
        }
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.messenger.zs.f(this.a).n(this, org.telegram.messenger.zs.x0);
    }

    @Override // org.telegram.ui.ActionBar.z2
    public final void s0() {
        Boolean bool;
        try {
            super.s0();
            kp kpVar = this.w1;
            if (kpVar != null) {
                kpVar.b(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Ci, this.I0));
            }
            uu uuVar = this.m1;
            if (uuVar != null && (bool = uuVar.c) != null) {
                O0(bool.booleanValue());
            }
            ViewGroup viewGroup = this.b;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.z2, android.app.Dialog
    public final void show() {
        TLRPC.StickerSet stickerSet;
        super.show();
        su suVar = new su(this);
        this.o1 = suVar;
        this.n1.setAdapter(suVar);
        int i10 = 0;
        org.telegram.messenger.zs.e().k(org.telegram.messenger.zs.j1, 4);
        ou ouVar = this.l1;
        int i11 = 5;
        if (!ouVar.e) {
            ouVar.e = true;
            cv cvVar = ouVar.f;
            int i12 = ouVar.d;
            ouVar.b = new ArrayList(ouVar.a.size());
            ouVar.c = new ArrayList[ouVar.a.size()];
            org.telegram.messenger.zs.f(i12).c(ouVar, 64);
            boolean[] zArr = new boolean[1];
            int i13 = 0;
            while (true) {
                if (i13 < ouVar.c.length) {
                    TLRPC.TL_messages_stickerSet l02 = org.telegram.messenger.ui.b0(i12).l0((TLRPC.InputStickerSet) ouVar.a.get(i13), null, false, false, new vg(i11, ouVar, zArr));
                    if (ouVar.c.length != 1 || l02 == null || (stickerSet = l02.set) == null || stickerSet.emojis) {
                        ouVar.b.add(l02);
                        ouVar.a(i13, l02);
                        i13++;
                    } else {
                        org.telegram.messenger.i0.g3(new zu(ouVar, i10));
                        Context context = cvVar.getContext();
                        org.telegram.ui.ActionBar.k2 k2Var = cvVar.j1;
                        TLRPC.InputStickerSet inputStickerSet = (TLRPC.InputStickerSet) ouVar.a.get(i13);
                        org.telegram.ui.ActionBar.k2 k2Var2 = cvVar.j1;
                        new cx0(context, k2Var, inputStickerSet, null, k2Var2 instanceof org.telegram.ui.un ? ((org.telegram.ui.un) k2Var2).Z : null, cvVar.I0).show();
                    }
                } else {
                    cv cvVar2 = ouVar.h;
                    cvVar2.N0();
                    org.telegram.ui.g3 g3Var = cvVar2.n1;
                    if (g3Var != null && g3Var.getAdapter() != null) {
                        g3Var.getAdapter().f();
                    }
                }
            }
        }
        N0();
        org.telegram.ui.ActionBar.k2 k2Var3 = this.j1;
        org.telegram.messenger.ui.b0(k2Var3 == null ? org.telegram.messenger.d20.s0 : k2Var3.getCurrentAccount()).B(5);
    }

    public void K0(boolean z10) {
    }

    public void L0() {
    }
}
