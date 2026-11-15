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

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public class wu extends org.telegram.ui.ActionBar.u2 implements org.telegram.messenger.is {
    public static Pattern Q1;
    public final lp A1;
    public org.telegram.ui.ActionBar.g1 B1;
    public final boolean C1;
    public boolean D1;
    public float E1;
    public int F1;
    public int G1;
    public final u5 H1;
    public final hu I1;
    public int J1;
    public boolean K1;
    public long L1;
    public ValueAnimator M1;
    public boolean N1;
    public PorterDuffColorFilter O1;
    public int P1;
    public LongSparseArray m1;
    public final org.telegram.ui.ActionBar.e2 n1;
    public final bn o1;
    public final iu p1;
    public final ou q1;
    public final hi.v r1;
    public mu s1;
    public final View t1;
    public final FrameLayout u1;
    public final TextView v1;
    public final TextView w1;
    public final ug.q0 x1;
    public final v4.s y1;
    public final wi0 z1;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public wu(org.telegram.ui.ActionBar.e2 e2Var, Context context, org.telegram.ui.ActionBar.e6 e6Var, ArrayList arrayList) {
        super(1, context, r4, false);
        org.telegram.ui.ActionBar.e6 resourceProvider = (e2Var == null || e2Var.getResourceProvider() == null) ? e6Var : e2Var.getResourceProvider();
        this.F1 = -1;
        this.G1 = -1;
        this.I1 = new hu(this);
        this.J1 = -1;
        this.K1 = false;
        this.N1 = true;
        this.n1 = e2Var;
        O();
        if (arrayList != null) {
            this.C1 = arrayList.size() > 1;
        }
        this.p1 = new iu(this.a, arrayList, this);
        float L = org.telegram.messenger.g0.L(32.0f);
        float L2 = org.telegram.messenger.g0.L(3.5f);
        int i7 = org.telegram.ui.ActionBar.j6.Fi;
        this.A1 = new lp(L, L2, org.telegram.ui.ActionBar.j6.w0(i7, this.J0));
        ou ouVar = new ou(this, context);
        this.q1 = ouVar;
        this.b = ouVar;
        this.o1 = new bn(context, 10);
        hi.v vVar = new hi.v(this, context, this.J0);
        this.r1 = vVar;
        this.H1 = new u5(0.0f, vVar, 0L, 1250L, er.i);
        ViewGroup viewGroup = this.b;
        int i10 = this.u0;
        viewGroup.setPadding(i10, org.telegram.messenger.g0.m, i10, 0);
        this.b.setClipChildren(false);
        this.b.setClipToPadding(false);
        this.b.setWillNotDraw(false);
        vVar.setWillNotDraw(false);
        vVar.setSelectorRadius(org.telegram.messenger.g0.L(6.0f));
        org.telegram.ui.ActionBar.q6.l(vVar, 20, org.telegram.ui.ActionBar.j6.i6, resourceProvider);
        vVar.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(this.C1 ? 8.0f : 68.0f));
        v4.s sVar = new v4.s(8);
        this.y1 = sVar;
        vVar.setLayoutManager(sVar);
        int i11 = 3;
        vVar.i(new ai.i0(this, i11));
        vVar.j(new ri(this, 8));
        om omVar = new om(this, arrayList, e2Var, resourceProvider);
        vVar.setOnItemClickListener(omVar);
        vVar.setOnItemLongClickListener((ij0) new f1(18, this, context));
        vVar.setOnTouchListener(new hi.p1(i11, this, omVar));
        sVar.k1(false);
        sVar.O = new ku(this);
        this.z1 = new wi0(vVar, sVar);
        this.b.addView(vVar, c8.ja.e(-1, -1, 51));
        View view = new View(context);
        this.t1 = view;
        org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.V5, view, null);
        this.b.addView(view, c8.ja.a(-1.0f, 1.0f / org.telegram.messenger.g0.p, 80));
        view.setTranslationY(-org.telegram.messenger.g0.L(68.0f));
        FrameLayout frameLayout = new FrameLayout(context);
        this.u1 = frameLayout;
        org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.h5, frameLayout, this.J0);
        this.b.addView(frameLayout, c8.ja.e(-1, 68, 87));
        TextView textView = new TextView(context);
        this.v1 = textView;
        textView.setVisibility(8);
        org.telegram.ui.Cells.y e10 = org.telegram.ui.ActionBar.y5.e(org.telegram.ui.ActionBar.j6.w0(i7, this.J0), 24.0f);
        org.telegram.ui.ActionBar.m6 M = org.telegram.ui.ActionBar.q6.M(i7);
        org.telegram.ui.ActionBar.m6 e11 = org.telegram.ui.ActionBar.q6.e(i7);
        org.telegram.ui.ActionBar.e6 e6Var2 = this.J0;
        textView.setBackground(e10);
        org.telegram.ui.ActionBar.q6.j(textView, e10, M, e11, e6Var2);
        org.telegram.ui.ActionBar.q6.U(textView, org.telegram.ui.ActionBar.j6.Ji, this.J0);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setGravity(17);
        c8.na.b(textView, 0.02f, 1.2f);
        TextView k10 = org.telegram.ui.Cells.y0.k(frameLayout, textView, c8.ja.d(-1, 48.0f, 80, 12.0f, 10.0f, 12.0f, 10.0f), context);
        this.w1 = k10;
        k10.setVisibility(8);
        int i12 = org.telegram.ui.ActionBar.j6.q7;
        org.telegram.ui.Cells.y a02 = org.telegram.ui.ActionBar.j6.a0(org.telegram.ui.ActionBar.j6.w0(i12, this.J0) & 268435455, 0, 0);
        org.telegram.ui.ActionBar.m6 g10 = org.telegram.ui.ActionBar.q6.g(i12, 15);
        org.telegram.ui.ActionBar.e6 e6Var3 = this.J0;
        k10.setBackground(a02);
        org.telegram.ui.ActionBar.q6.j(k10, a02, null, g10, e6Var3);
        org.telegram.ui.ActionBar.q6.U(k10, i12, this.J0);
        k10.setTypeface(org.telegram.messenger.g0.o());
        k10.setGravity(17);
        k10.setClickable(true);
        frameLayout.addView(k10, c8.ja.d(-1, -1.0f, 80, 0.0f, 0.0f, 0.0f, 19.0f));
        ug.q0 q0Var = new ug.q0(context, this.J0, false);
        this.x1 = q0Var;
        q0Var.b(org.telegram.messenger.hd.M0(2131743865, null), new e0(this, 12), false);
        q0Var.setIcon(R.raw.unlock_icon);
        q0Var.w.setClickable(true);
        frameLayout.addView(q0Var, c8.ja.d(-1, 48.0f, 80, 12.0f, 10.0f, 12.0f, 10.0f));
    }

    public static void J0(final org.telegram.ui.ActionBar.e2 e2Var, TLObject tLObject, final boolean z10, final di.l9 l9Var, final fo foVar) {
        final int currentAccount = e2Var == null ? org.telegram.messenger.m10.t0 : e2Var.getCurrentAccount();
        TLRPC.StickerSet stickerSet = null;
        final View fragmentView = e2Var == null ? null : e2Var.getFragmentView();
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
        Runnable runnable = (Runnable) org.telegram.messenger.si.b0(currentAccount).U.f(stickerSet2.id);
        if (runnable != null) {
            runnable.run();
            if (l9Var != null) {
                l9Var.a(Boolean.TRUE);
                return;
            }
            return;
        }
        TLRPC.TL_messages_installStickerSet tL_messages_installStickerSet = new TLRPC.TL_messages_installStickerSet();
        TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
        tL_messages_installStickerSet.stickerset = tL_inputStickerSetID;
        tL_inputStickerSetID.id = stickerSet2.id;
        tL_inputStickerSetID.access_hash = stickerSet2.access_hash;
        ConnectionsManager.getInstance(currentAccount).sendRequest(tL_messages_installStickerSet, new RequestDelegate() { // from class: org.telegram.ui.Components.gu
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(final TLObject tLObject2, final TLRPC.TL_error tL_error) {
                final TLRPC.StickerSet stickerSet3 = TLRPC.StickerSet.this;
                final boolean z11 = z10;
                final View view = fragmentView;
                final org.telegram.ui.ActionBar.e2 e2Var2 = e2Var;
                final TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = tL_messages_stickerSet;
                final int i7 = currentAccount;
                final org.telegram.messenger.z10 z10Var = l9Var;
                final Runnable runnable2 = foVar;
                org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.Components.fu
                    @Override // java.lang.Runnable
                    public final void run() {
                        TLObject tLObject3 = tLObject2;
                        TLRPC.StickerSet stickerSet4 = TLRPC.StickerSet.this;
                        int i10 = stickerSet4.masks ? 1 : stickerSet4.emojis ? 5 : 0;
                        TLRPC.TL_error tL_error2 = tL_error;
                        View view2 = view;
                        org.telegram.ui.ActionBar.e2 e2Var3 = e2Var2;
                        int i11 = i7;
                        org.telegram.messenger.z10 z10Var2 = z10Var;
                        try {
                            if (tL_error2 == null) {
                                if (z11 && view2 != null) {
                                    Context context = e2Var3.getFragmentView().getContext();
                                    TLObject tLObject4 = tL_messages_stickerSet2;
                                    xb.g(e2Var3, new ev0(context, tLObject4 == null ? stickerSet4 : tLObject4, 1, 2, null, e2Var3.getResourceProvider()), 1500).j();
                                }
                                if (tLObject3 instanceof TLRPC.TL_messages_stickerSetInstallResultArchive) {
                                    org.telegram.messenger.si.b0(i11).A1(e2Var3, true, i10, (TLRPC.TL_messages_stickerSetInstallResultArchive) tLObject3);
                                }
                                if (z10Var2 != null) {
                                    z10Var2.a(Boolean.TRUE);
                                }
                            } else if (view2 != null) {
                                Toast.makeText(e2Var3.getFragmentView().getContext(), org.telegram.messenger.hd.M0(2131751105, null), 0).show();
                                if (z10Var2 != null) {
                                    z10Var2.a(Boolean.FALSE);
                                }
                            } else if (z10Var2 != null) {
                                z10Var2.a(Boolean.FALSE);
                            }
                        } catch (Exception e10) {
                            org.telegram.messenger.a8.g(e10, true);
                        }
                        org.telegram.messenger.si.b0(i11).b1(i10, false, true, false, new q2(runnable2, 6));
                    }
                });
            }
        });
    }

    @Override // org.telegram.ui.ActionBar.u2
    public final boolean H() {
        return false;
    }

    public final int I0() {
        if (this.b == null) {
            return 0;
        }
        hi.v vVar = this.r1;
        if (vVar == null || vVar.getChildCount() < 1) {
            return this.b.getPaddingTop();
        }
        View childAt = vVar.getChildAt(0);
        bn bnVar = this.o1;
        return childAt != bnVar ? this.b.getPaddingTop() : bnVar.getBottom() + ((int) vVar.getY());
    }

    public final void M0() {
        org.telegram.ui.ActionBar.e2 e2Var = this.n1;
        if (e2Var != null) {
            new ug.x0(e2Var, 11, false).show();
        } else if (getContext() instanceof LaunchActivity) {
            ((LaunchActivity) getContext()).t0(new PremiumPreviewFragment(0, null));
        }
    }

    public final void N0() {
        final int i7;
        TLRPC.StickerSet stickerSet;
        if (this.u1 == null) {
            return;
        }
        iu iuVar = this.p1;
        ArrayList arrayList = iuVar.b == null ? new ArrayList() : new ArrayList(iuVar.b);
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
        org.telegram.messenger.si b02 = org.telegram.messenger.si.b0(this.a);
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
        boolean z10 = iuVar.a != null && arrayList.size() == iuVar.a.size();
        if (!this.N1 && z10 && this.M1 == null) {
            this.M1 = ValueAnimator.ofFloat(this.E1, 1.0f);
            this.b.getY();
            this.M1.addUpdateListener(new c6(this, 16));
            this.M1.setDuration(250L);
            this.M1.setInterpolator(er.h);
            this.M1.start();
        }
        this.N1 = z10;
        hi.v vVar = this.r1;
        if (!z10) {
            vVar.setAlpha(0.0f);
        } else if (this.J1 >= 0) {
            int L0 = this.y1.L0();
            int E = this.s1.E(this.J1);
            if (Math.abs(L0 - E) > 54) {
                int i13 = L0 < E ? 0 : 1;
                wi0 wi0Var = this.z1;
                wi0Var.b = i13;
                wi0Var.d(E, (org.telegram.messenger.g0.q.y / 2) - org.telegram.messenger.g0.L(170.0f), false, false);
            } else {
                vVar.y0(E);
            }
            this.F1 = this.s1.E(this.J1);
            mu muVar = this.s1;
            int i14 = this.J1;
            wu wuVar = muVar.c;
            boolean z11 = wuVar.D1;
            iu iuVar2 = wuVar.p1;
            int i15 = z11 ? 2 : 1;
            int i16 = 0;
            while (true) {
                ArrayList[] arrayListArr = iuVar2.c;
                if (i16 >= arrayListArr.length) {
                    break;
                }
                int size = arrayListArr[i16].size();
                if (iuVar2.c.length > 1) {
                    size = Math.min(wuVar.y1.J * 2, size);
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
            vVar.invalidate();
            this.J1 = -1;
        }
        boolean z12 = this.N1;
        ug.q0 q0Var = this.x1;
        TextView textView = this.w1;
        TextView textView2 = this.v1;
        if (!z12 || this.C1) {
            q0Var.setVisibility(8);
            textView2.setVisibility(8);
            textView.setVisibility(8);
            P0(false);
            return;
        }
        q0Var.setVisibility(4);
        if (arrayList4.size() > 0) {
            textView2.setVisibility(0);
            textView.setVisibility(8);
            if (arrayList4.size() == 1) {
                textView2.setText(org.telegram.messenger.hd.G(((TLRPC.TL_messages_stickerSet) arrayList4.get(0)).documents.size(), "AddManyEmojiCount", new Object[0]));
            } else {
                textView2.setText(org.telegram.messenger.hd.G(arrayList4.size(), "AddManyEmojiPacksCount", new Object[0]));
            }
            textView2.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.eu
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r15v3, types: [boolean[], java.io.Serializable] */
                /* JADX WARN: Type inference failed for: r8v8, types: [int[], java.io.Serializable] */
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    wu wuVar2;
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2;
                    wu wuVar3;
                    int i17;
                    boolean z13;
                    int i18 = i10;
                    wu wuVar4 = this;
                    int i19 = 0;
                    boolean z14 = true;
                    switch (i18) {
                        case 0:
                            ArrayList arrayList5 = arrayList4;
                            int size2 = arrayList5.size();
                            int[] iArr = new int[2];
                            for (int i20 = 0; i20 < arrayList5.size(); i20++) {
                                wu.J0(wuVar4.n1, (TLObject) arrayList5.get(i20), size2 == 1, size2 > 1 ? new di.l9(wuVar4, iArr, size2, arrayList5) : null, null);
                            }
                            wuVar4.K0(true);
                            if (size2 <= 1) {
                                wuVar4.dismiss();
                                break;
                            }
                            break;
                        default:
                            wuVar4.dismiss();
                            org.telegram.ui.ActionBar.e2 e2Var = wuVar4.n1;
                            ArrayList arrayList6 = arrayList4;
                            if (e2Var != null) {
                                org.telegram.messenger.si b03 = org.telegram.messenger.si.b0(e2Var.getCurrentAccount());
                                Context context = e2Var.getContext();
                                ArrayList[] arrayListArr2 = b03.H;
                                if (arrayList6.isEmpty() || (tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) i5.c.h(1, arrayList6)) == null) {
                                    wuVar2 = wuVar4;
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
                                                wuVar3 = wuVar4;
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
                                                    wuVar4 = wuVar3;
                                                }
                                            } else {
                                                wuVar3 = wuVar4;
                                                i17 = i19;
                                                z13 = z14;
                                            }
                                        }
                                        i23++;
                                        i19 = i17;
                                        z14 = z13;
                                        wuVar4 = wuVar3;
                                    }
                                    wuVar2 = wuVar4;
                                    boolean z15 = i19;
                                    int i25 = z14;
                                    ArrayList arrayList7 = arrayListArr2[i21];
                                    int i26 = b03.Z[i21];
                                    long[] jArr = b03.Y;
                                    int i27 = i21;
                                    long q10 = org.telegram.messenger.si.q(arrayList7);
                                    jArr[i27] = q10;
                                    b03.J1(i27, i26, q10, arrayList7);
                                    org.telegram.messenger.ns notificationCenter = b03.getNotificationCenter();
                                    Object[] objArr = new Object[2];
                                    objArr[z15 ? 1 : 0] = Integer.valueOf(i27);
                                    objArr[i25] = Boolean.TRUE;
                                    notificationCenter.k(60, objArr);
                                    for (int i28 = z15 ? 1 : 0; i28 < arrayList6.size(); i28++) {
                                        b03.g1(((TLRPC.TL_messages_stickerSet) arrayList6.get(i28)).set.id, i25);
                                    }
                                    ev0 ev0Var = new ev0(context, tL_messages_stickerSet2, arrayList6.size(), 0, null, e2Var.getResourceProvider());
                                    ?? r15 = new boolean[i25];
                                    vb vbVar = new vb(context, null, z15);
                                    vbVar.b = new org.telegram.messenger.zj(b03, (Serializable) r15, arrayList6, i27, (Serializable) r82, 2);
                                    vbVar.c = new bg.l0(b03, (boolean[]) r15, arrayList6, context, e2Var, i27);
                                    ev0Var.setButton(vbVar);
                                    for (int i29 = 0; i29 < arrayList6.size(); i29++) {
                                        b03.U.k(new org.telegram.messenger.a(vbVar, 22), ((TLRPC.TL_messages_stickerSet) arrayList6.get(i29)).set.id);
                                    }
                                    xb.g(e2Var, ev0Var, 2750).j();
                                }
                            } else {
                                wuVar2 = wuVar4;
                                int i30 = 0;
                                while (i30 < arrayList6.size()) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet4 = (TLRPC.TL_messages_stickerSet) arrayList6.get(i30);
                                    Context context2 = wuVar2.getContext();
                                    boolean z16 = i30 == 0;
                                    if (tL_messages_stickerSet4 != null) {
                                        org.telegram.messenger.si.b0(org.telegram.messenger.m10.t0).g2(context2, tL_messages_stickerSet4, null, 0, null, null, true, z16, null, true);
                                    }
                                    i30++;
                                }
                            }
                            wuVar2.K0(false);
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
            textView.setText(org.telegram.messenger.hd.G(((TLRPC.TL_messages_stickerSet) arrayList2.get(0)).documents.size(), "RemoveManyEmojiCount", new Object[0]));
        } else {
            textView.setText(org.telegram.messenger.hd.G(arrayList2.size(), "RemoveManyEmojiPacksCount", new Object[0]));
        }
        textView.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.eu
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r15v3, types: [boolean[], java.io.Serializable] */
            /* JADX WARN: Type inference failed for: r8v8, types: [int[], java.io.Serializable] */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                wu wuVar2;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2;
                wu wuVar3;
                int i17;
                boolean z13;
                int i18 = i7;
                wu wuVar4 = this;
                int i19 = 0;
                boolean z14 = true;
                switch (i18) {
                    case 0:
                        ArrayList arrayList5 = arrayList2;
                        int size2 = arrayList5.size();
                        int[] iArr = new int[2];
                        for (int i20 = 0; i20 < arrayList5.size(); i20++) {
                            wu.J0(wuVar4.n1, (TLObject) arrayList5.get(i20), size2 == 1, size2 > 1 ? new di.l9(wuVar4, iArr, size2, arrayList5) : null, null);
                        }
                        wuVar4.K0(true);
                        if (size2 <= 1) {
                            wuVar4.dismiss();
                            break;
                        }
                        break;
                    default:
                        wuVar4.dismiss();
                        org.telegram.ui.ActionBar.e2 e2Var = wuVar4.n1;
                        ArrayList arrayList6 = arrayList2;
                        if (e2Var != null) {
                            org.telegram.messenger.si b03 = org.telegram.messenger.si.b0(e2Var.getCurrentAccount());
                            Context context = e2Var.getContext();
                            ArrayList[] arrayListArr2 = b03.H;
                            if (arrayList6.isEmpty() || (tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) i5.c.h(1, arrayList6)) == null) {
                                wuVar2 = wuVar4;
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
                                            wuVar3 = wuVar4;
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
                                                wuVar4 = wuVar3;
                                            }
                                        } else {
                                            wuVar3 = wuVar4;
                                            i17 = i19;
                                            z13 = z14;
                                        }
                                    }
                                    i23++;
                                    i19 = i17;
                                    z14 = z13;
                                    wuVar4 = wuVar3;
                                }
                                wuVar2 = wuVar4;
                                boolean z15 = i19;
                                int i25 = z14;
                                ArrayList arrayList7 = arrayListArr2[i21];
                                int i26 = b03.Z[i21];
                                long[] jArr = b03.Y;
                                int i27 = i21;
                                long q10 = org.telegram.messenger.si.q(arrayList7);
                                jArr[i27] = q10;
                                b03.J1(i27, i26, q10, arrayList7);
                                org.telegram.messenger.ns notificationCenter = b03.getNotificationCenter();
                                Object[] objArr = new Object[2];
                                objArr[z15 ? 1 : 0] = Integer.valueOf(i27);
                                objArr[i25] = Boolean.TRUE;
                                notificationCenter.k(60, objArr);
                                for (int i28 = z15 ? 1 : 0; i28 < arrayList6.size(); i28++) {
                                    b03.g1(((TLRPC.TL_messages_stickerSet) arrayList6.get(i28)).set.id, i25);
                                }
                                ev0 ev0Var = new ev0(context, tL_messages_stickerSet2, arrayList6.size(), 0, null, e2Var.getResourceProvider());
                                ?? r15 = new boolean[i25];
                                vb vbVar = new vb(context, null, z15);
                                vbVar.b = new org.telegram.messenger.zj(b03, (Serializable) r15, arrayList6, i27, (Serializable) r82, 2);
                                vbVar.c = new bg.l0(b03, (boolean[]) r15, arrayList6, context, e2Var, i27);
                                ev0Var.setButton(vbVar);
                                for (int i29 = 0; i29 < arrayList6.size(); i29++) {
                                    b03.U.k(new org.telegram.messenger.a(vbVar, 22), ((TLRPC.TL_messages_stickerSet) arrayList6.get(i29)).set.id);
                                }
                                xb.g(e2Var, ev0Var, 2750).j();
                            }
                        } else {
                            wuVar2 = wuVar4;
                            int i30 = 0;
                            while (i30 < arrayList6.size()) {
                                TLRPC.TL_messages_stickerSet tL_messages_stickerSet4 = (TLRPC.TL_messages_stickerSet) arrayList6.get(i30);
                                Context context2 = wuVar2.getContext();
                                boolean z16 = i30 == 0;
                                if (tL_messages_stickerSet4 != null) {
                                    org.telegram.messenger.si.b0(org.telegram.messenger.m10.t0).g2(context2, tL_messages_stickerSet4, null, 0, null, null, true, z16, null, true);
                                }
                                i30++;
                            }
                        }
                        wuVar2.K0(false);
                        break;
                }
            }
        });
        P0(true);
    }

    public final void O0(boolean z10) {
        boolean z11 = org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.h5, this.J0)) > 0.721f;
        boolean z12 = org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.j6.w(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.s8, this.J0), 855638016)) > 0.721f;
        if (!z10) {
            z11 = z12;
        }
        org.telegram.messenger.g0.q3(this, z11);
    }

    public final void P0(boolean z10) {
        boolean z11 = !this.K1 && z10;
        float L = this.w1.getVisibility() == 0 ? org.telegram.messenger.g0.L(19.0f) : 0;
        boolean z12 = this.C1;
        hi.v vVar = this.r1;
        View view = this.t1;
        FrameLayout frameLayout = this.u1;
        float f10 = 0.0f;
        if (z11) {
            ViewPropertyAnimator duration = frameLayout.animate().translationY(z10 ? L : org.telegram.messenger.g0.L(16.0f)).alpha(z10 ? 1.0f : 0.0f).setDuration(250L);
            er erVar = er.h;
            duration.setInterpolator(erVar).start();
            view.animate().translationY(z10 ? -(org.telegram.messenger.g0.L(68.0f) - L) : 0.0f).alpha(z10 ? 1.0f : 0.0f).setDuration(250L).setInterpolator(erVar).start();
            ViewPropertyAnimator animate = vVar.animate();
            if (!z12 && !z10) {
                f10 = org.telegram.messenger.g0.L(68.0f) - L;
            }
            animate.translationY(f10).setDuration(250L).setInterpolator(erVar).start();
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
        this.K1 = z10;
    }

    @Override // org.telegram.ui.ActionBar.u2
    public final int S() {
        hi.v vVar = this.r1;
        int measuredHeight = (vVar == null ? 0 : vVar.getMeasuredHeight()) - I0();
        ViewGroup viewGroup = this.b;
        return org.telegram.messenger.g0.L(8.0f) + measuredHeight + (viewGroup != null ? viewGroup.getPaddingTop() : 0) + org.telegram.messenger.g0.n;
    }

    @Override // org.telegram.messenger.is
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        su suVar;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        if (i7 != org.telegram.messenger.ns.x0) {
            return;
        }
        int i11 = 0;
        while (true) {
            hi.v vVar = this.r1;
            if (i11 >= vVar.getChildCount()) {
                N0();
                return;
            }
            View childAt = vVar.getChildAt(i11);
            if ((childAt instanceof su) && (tL_messages_stickerSet = (suVar = (su) childAt).r) != null && tL_messages_stickerSet.set != null) {
                suVar.a(org.telegram.messenger.si.b0(this.a).B0(suVar.r.set.id, true), true);
            }
            i11++;
        }
    }

    @Override // org.telegram.ui.ActionBar.u2, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.a2
    public void dismiss() {
        ou ouVar = this.q1;
        if (ouVar != null && ouVar.x) {
            ouVar.x = false;
            ouVar.invalidate();
        }
        super.dismiss();
        iu iuVar = this.p1;
        if (iuVar != null) {
            org.telegram.messenger.ns.f(iuVar.d).n(iuVar, org.telegram.messenger.ns.B0);
        }
        org.telegram.messenger.ns.e().k(org.telegram.messenger.ns.k1, 4);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.messenger.ns.f(this.a).c(this, org.telegram.messenger.ns.x0);
    }

    @Override // org.telegram.ui.ActionBar.u2, android.app.Dialog
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
        org.telegram.messenger.ns.f(this.a).n(this, org.telegram.messenger.ns.x0);
    }

    @Override // org.telegram.ui.ActionBar.u2
    public final void s0() {
        Boolean bool;
        try {
            super.s0();
            lp lpVar = this.A1;
            if (lpVar != null) {
                lpVar.b(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.Fi, this.J0));
            }
            ou ouVar = this.q1;
            if (ouVar != null && (bool = ouVar.c) != null) {
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

    @Override // org.telegram.ui.ActionBar.u2, android.app.Dialog
    public final void show() {
        TLRPC.StickerSet stickerSet;
        super.show();
        mu muVar = new mu(this);
        this.s1 = muVar;
        this.r1.setAdapter(muVar);
        int i7 = 0;
        org.telegram.messenger.ns.e().k(org.telegram.messenger.ns.j1, 4);
        iu iuVar = this.p1;
        if (!iuVar.e) {
            iuVar.e = true;
            wu wuVar = iuVar.f;
            int i10 = iuVar.d;
            iuVar.b = new ArrayList(iuVar.a.size());
            iuVar.c = new ArrayList[iuVar.a.size()];
            org.telegram.messenger.ns.f(i10).c(iuVar, 64);
            boolean[] zArr = new boolean[1];
            int i11 = 0;
            while (true) {
                if (i11 < iuVar.c.length) {
                    TLRPC.TL_messages_stickerSet l02 = org.telegram.messenger.si.b0(i10).l0((TLRPC.InputStickerSet) iuVar.a.get(i11), null, false, false, new gh(2, iuVar, zArr));
                    if (iuVar.c.length != 1 || l02 == null || (stickerSet = l02.set) == null || stickerSet.emojis) {
                        iuVar.b.add(l02);
                        iuVar.a(i11, l02);
                        i11++;
                    } else {
                        org.telegram.messenger.g0.h3(new tu(iuVar, i7));
                        Context context = wuVar.getContext();
                        org.telegram.ui.ActionBar.e2 e2Var = wuVar.n1;
                        TLRPC.InputStickerSet inputStickerSet = (TLRPC.InputStickerSet) iuVar.a.get(i11);
                        org.telegram.ui.ActionBar.e2 e2Var2 = wuVar.n1;
                        new bw0(context, e2Var, inputStickerSet, null, e2Var2 instanceof org.telegram.ui.an ? ((org.telegram.ui.an) e2Var2).a0 : null, wuVar.J0).show();
                    }
                } else {
                    wu wuVar2 = iuVar.h;
                    wuVar2.N0();
                    hi.v vVar = wuVar2.r1;
                    if (vVar != null && vVar.getAdapter() != null) {
                        vVar.getAdapter().f();
                    }
                }
            }
        }
        N0();
        org.telegram.ui.ActionBar.e2 e2Var3 = this.n1;
        org.telegram.messenger.si.b0(e2Var3 == null ? org.telegram.messenger.m10.t0 : e2Var3.getCurrentAccount()).B(5);
    }

    public void K0(boolean z10) {
    }

    public void L0() {
    }
}
