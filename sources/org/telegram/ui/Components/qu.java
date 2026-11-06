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

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public class qu extends org.telegram.ui.ActionBar.v2 implements org.telegram.messenger.ls {
    public static Pattern M1;
    public float A1;
    public int B1;
    public int C1;
    public final w5 D1;
    public final bu E1;
    public int F1;
    public boolean G1;
    public long H1;
    public ValueAnimator I1;
    public boolean J1;
    public PorterDuffColorFilter K1;
    public int L1;
    public LongSparseArray i1;
    public final org.telegram.ui.ActionBar.f2 j1;
    public final tm k1;
    public final cu l1;
    public final iu m1;
    public final fi.v n1;
    public gu o1;
    public final View p1;
    public final FrameLayout q1;
    public final TextView r1;
    public final TextView s1;
    public final ug.p0 t1;
    public final v4.s u1;
    public final ri0 v1;
    public final cp w1;
    public org.telegram.ui.ActionBar.g1 x1;
    public final boolean y1;
    public boolean z1;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public qu(org.telegram.ui.ActionBar.f2 f2Var, Context context, org.telegram.ui.ActionBar.f6 f6Var, ArrayList arrayList) {
        super(1, context, r4, false);
        org.telegram.ui.ActionBar.f6 resourceProvider = (f2Var == null || f2Var.getResourceProvider() == null) ? f6Var : f2Var.getResourceProvider();
        this.B1 = -1;
        this.C1 = -1;
        this.E1 = new bu(this);
        this.F1 = -1;
        this.G1 = false;
        this.J1 = true;
        this.j1 = f2Var;
        N();
        if (arrayList != null) {
            this.y1 = arrayList.size() > 1;
        }
        this.l1 = new cu(this.a, arrayList, this);
        float L = org.telegram.messenger.g0.L(32.0f);
        float L2 = org.telegram.messenger.g0.L(3.5f);
        int i7 = org.telegram.ui.ActionBar.k6.Ci;
        this.w1 = new cp(L, L2, org.telegram.ui.ActionBar.k6.w0(i7, this.I0));
        iu iuVar = new iu(this, context);
        this.m1 = iuVar;
        this.b = iuVar;
        this.k1 = new tm(context, 10);
        fi.v vVar = new fi.v(this, context, this.I0);
        this.n1 = vVar;
        this.D1 = new w5(0.0f, vVar, 0L, 1250L, xq.i);
        ViewGroup viewGroup = this.b;
        int i10 = this.t0;
        viewGroup.setPadding(i10, org.telegram.messenger.g0.m, i10, 0);
        this.b.setClipChildren(false);
        this.b.setClipToPadding(false);
        this.b.setWillNotDraw(false);
        vVar.setWillNotDraw(false);
        vVar.setSelectorRadius(org.telegram.messenger.g0.L(6.0f));
        org.telegram.ui.ActionBar.r6.m(vVar, 20, org.telegram.ui.ActionBar.k6.i6, resourceProvider);
        vVar.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(this.y1 ? 8.0f : 68.0f));
        v4.s sVar = new v4.s(8);
        this.u1 = sVar;
        vVar.setLayoutManager(sVar);
        vVar.i(new fi.o1(this, 2));
        vVar.j(new ui(this, 6));
        gm gmVar = new gm(this, arrayList, f2Var, resourceProvider);
        vVar.setOnItemClickListener(gmVar);
        vVar.setOnItemLongClickListener((dj0) new f2(14, this, context));
        vVar.setOnTouchListener(new fi.n1(3, this, gmVar));
        sVar.k1(false);
        sVar.O = new eu(this);
        this.v1 = new ri0(vVar, sVar);
        this.b.addView(vVar, c8.ha.e(-1, -1, 51));
        View view = new View(context);
        this.p1 = view;
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.V5, view, null);
        this.b.addView(view, c8.ha.a(-1.0f, 1.0f / org.telegram.messenger.g0.p, 80));
        view.setTranslationY(-org.telegram.messenger.g0.L(68.0f));
        FrameLayout frameLayout = new FrameLayout(context);
        this.q1 = frameLayout;
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.h5, frameLayout, this.I0);
        this.b.addView(frameLayout, c8.ha.e(-1, 68, 87));
        TextView textView = new TextView(context);
        this.r1 = textView;
        textView.setVisibility(8);
        org.telegram.ui.Cells.y e10 = org.telegram.ui.ActionBar.z5.e(org.telegram.ui.ActionBar.k6.w0(i7, this.I0), 24.0f);
        org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i7);
        org.telegram.ui.ActionBar.n6 f10 = org.telegram.ui.ActionBar.r6.f(i7);
        org.telegram.ui.ActionBar.f6 f6Var2 = this.I0;
        textView.setBackground(e10);
        org.telegram.ui.ActionBar.r6.k(textView, e10, N, f10, f6Var2);
        org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.Gi, this.I0);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setGravity(17);
        c8.ka.b(textView, 0.02f, 1.2f);
        TextView i11 = org.telegram.ui.Cells.f1.i(frameLayout, textView, c8.ha.d(-1, 48.0f, 80, 12.0f, 10.0f, 12.0f, 10.0f), context);
        this.s1 = i11;
        i11.setVisibility(8);
        int i12 = org.telegram.ui.ActionBar.k6.q7;
        org.telegram.ui.Cells.y a02 = org.telegram.ui.ActionBar.k6.a0(org.telegram.ui.ActionBar.k6.w0(i12, this.I0) & 268435455, 0, 0);
        org.telegram.ui.ActionBar.n6 h = org.telegram.ui.ActionBar.r6.h(i12, 15);
        org.telegram.ui.ActionBar.f6 f6Var3 = this.I0;
        i11.setBackground(a02);
        org.telegram.ui.ActionBar.r6.k(i11, a02, null, h, f6Var3);
        org.telegram.ui.ActionBar.r6.V(i11, i12, this.I0);
        i11.setTypeface(org.telegram.messenger.g0.o());
        i11.setGravity(17);
        i11.setClickable(true);
        frameLayout.addView(i11, c8.ha.d(-1, -1.0f, 80, 0.0f, 0.0f, 0.0f, 19.0f));
        ug.p0 p0Var = new ug.p0(context, this.I0, false);
        this.t1 = p0Var;
        p0Var.b(org.telegram.messenger.hd.M0(2131743866, null), new h0(this, 11), false);
        p0Var.setIcon(R.raw.unlock_icon);
        p0Var.w.setClickable(true);
        frameLayout.addView(p0Var, c8.ha.d(-1, 48.0f, 80, 12.0f, 10.0f, 12.0f, 10.0f));
    }

    public static void J0(final org.telegram.ui.ActionBar.f2 f2Var, TLObject tLObject, final boolean z9, final bi.ya yaVar, final gp gpVar) {
        final int currentAccount = f2Var == null ? org.telegram.messenger.p10.s0 : f2Var.getCurrentAccount();
        TLRPC.StickerSet stickerSet = null;
        final View fragmentView = f2Var == null ? null : f2Var.getFragmentView();
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
            if (yaVar != null) {
                yaVar.a(Boolean.TRUE);
                return;
            }
            return;
        }
        TLRPC.TL_messages_installStickerSet tL_messages_installStickerSet = new TLRPC.TL_messages_installStickerSet();
        TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
        tL_messages_installStickerSet.stickerset = tL_inputStickerSetID;
        tL_inputStickerSetID.id = stickerSet2.id;
        tL_inputStickerSetID.access_hash = stickerSet2.access_hash;
        ConnectionsManager.getInstance(currentAccount).sendRequest(tL_messages_installStickerSet, new RequestDelegate() { // from class: org.telegram.ui.Components.au
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(final TLObject tLObject2, final TLRPC.TL_error tL_error) {
                final TLRPC.StickerSet stickerSet3 = TLRPC.StickerSet.this;
                final boolean z10 = z9;
                final View view = fragmentView;
                final org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                final TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = tL_messages_stickerSet;
                final int i7 = currentAccount;
                final org.telegram.messenger.c20 c20Var = yaVar;
                final Runnable runnable2 = gpVar;
                org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.Components.zt
                    @Override // java.lang.Runnable
                    public final void run() {
                        TLObject tLObject3 = tLObject2;
                        TLRPC.StickerSet stickerSet4 = TLRPC.StickerSet.this;
                        int i10 = stickerSet4.masks ? 1 : stickerSet4.emojis ? 5 : 0;
                        TLRPC.TL_error tL_error2 = tL_error;
                        View view2 = view;
                        org.telegram.ui.ActionBar.f2 f2Var3 = f2Var2;
                        int i11 = i7;
                        org.telegram.messenger.c20 c20Var2 = c20Var;
                        try {
                            if (tL_error2 == null) {
                                if (z10 && view2 != null) {
                                    Context context = f2Var3.getFragmentView().getContext();
                                    TLObject tLObject4 = tL_messages_stickerSet2;
                                    cc.g(f2Var3, new cv0(context, tLObject4 == null ? stickerSet4 : tLObject4, 1, 2, null, f2Var3.getResourceProvider()), 1500).j();
                                }
                                if (tLObject3 instanceof TLRPC.TL_messages_stickerSetInstallResultArchive) {
                                    org.telegram.messenger.ui.b0(i11).A1(f2Var3, true, i10, (TLRPC.TL_messages_stickerSetInstallResultArchive) tLObject3);
                                }
                                if (c20Var2 != null) {
                                    c20Var2.a(Boolean.TRUE);
                                }
                            } else if (view2 != null) {
                                Toast.makeText(f2Var3.getFragmentView().getContext(), org.telegram.messenger.hd.M0(2131751106, null), 0).show();
                                if (c20Var2 != null) {
                                    c20Var2.a(Boolean.FALSE);
                                }
                            } else if (c20Var2 != null) {
                                c20Var2.a(Boolean.FALSE);
                            }
                        } catch (Exception e10) {
                            org.telegram.messenger.a8.g(e10, true);
                        }
                        org.telegram.messenger.ui.b0(i11).b1(i10, false, true, false, new s2(runnable2, 4));
                    }
                });
            }
        });
    }

    @Override // org.telegram.ui.ActionBar.v2
    public final boolean G() {
        return false;
    }

    public final int I0() {
        if (this.b == null) {
            return 0;
        }
        fi.v vVar = this.n1;
        if (vVar == null || vVar.getChildCount() < 1) {
            return this.b.getPaddingTop();
        }
        View childAt = vVar.getChildAt(0);
        tm tmVar = this.k1;
        return childAt != tmVar ? this.b.getPaddingTop() : tmVar.getBottom() + ((int) vVar.getY());
    }

    public final void M0() {
        org.telegram.ui.ActionBar.f2 f2Var = this.j1;
        if (f2Var != null) {
            new ug.w0(f2Var, 11, false).show();
        } else if (getContext() instanceof LaunchActivity) {
            ((LaunchActivity) getContext()).t0(new PremiumPreviewFragment(0, null));
        }
    }

    public final void N0() {
        final int i7;
        TLRPC.StickerSet stickerSet;
        if (this.q1 == null) {
            return;
        }
        cu cuVar = this.l1;
        ArrayList arrayList = cuVar.b == null ? new ArrayList() : new ArrayList(cuVar.b);
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
        org.telegram.messenger.ui b02 = org.telegram.messenger.ui.b0(this.a);
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
        boolean z9 = cuVar.a != null && arrayList.size() == cuVar.a.size();
        if (!this.J1 && z9 && this.I1 == null) {
            this.I1 = ValueAnimator.ofFloat(this.A1, 1.0f);
            this.b.getY();
            this.I1.addUpdateListener(new e6(this, 16));
            this.I1.setDuration(250L);
            this.I1.setInterpolator(xq.h);
            this.I1.start();
        }
        this.J1 = z9;
        fi.v vVar = this.n1;
        if (!z9) {
            vVar.setAlpha(0.0f);
        } else if (this.F1 >= 0) {
            int L0 = this.u1.L0();
            int E = this.o1.E(this.F1);
            if (Math.abs(L0 - E) > 54) {
                int i13 = L0 < E ? 0 : 1;
                ri0 ri0Var = this.v1;
                ri0Var.b = i13;
                ri0Var.d(E, (org.telegram.messenger.g0.q.y / 2) - org.telegram.messenger.g0.L(170.0f), false, false);
            } else {
                vVar.y0(E);
            }
            this.B1 = this.o1.E(this.F1);
            gu guVar = this.o1;
            int i14 = this.F1;
            qu quVar = guVar.c;
            boolean z10 = quVar.z1;
            cu cuVar2 = quVar.l1;
            int i15 = z10 ? 2 : 1;
            int i16 = 0;
            while (true) {
                ArrayList[] arrayListArr = cuVar2.c;
                if (i16 >= arrayListArr.length) {
                    break;
                }
                int size = arrayListArr[i16].size();
                if (cuVar2.c.length > 1) {
                    size = Math.min(quVar.u1.J * 2, size);
                }
                if (i16 == i14) {
                    i15 = i15 + size + 1;
                    break;
                } else {
                    i15 += size + 2;
                    i16++;
                }
            }
            this.C1 = i15;
            this.D1.e(true, 1.0f);
            vVar.invalidate();
            this.F1 = -1;
        }
        boolean z11 = this.J1;
        ug.p0 p0Var = this.t1;
        TextView textView = this.s1;
        TextView textView2 = this.r1;
        if (!z11 || this.y1) {
            p0Var.setVisibility(8);
            textView2.setVisibility(8);
            textView.setVisibility(8);
            P0(false);
            return;
        }
        p0Var.setVisibility(4);
        if (arrayList4.size() > 0) {
            textView2.setVisibility(0);
            textView.setVisibility(8);
            if (arrayList4.size() == 1) {
                textView2.setText(org.telegram.messenger.hd.G(((TLRPC.TL_messages_stickerSet) arrayList4.get(0)).documents.size(), "AddManyEmojiCount", new Object[0]));
            } else {
                textView2.setText(org.telegram.messenger.hd.G(arrayList4.size(), "AddManyEmojiPacksCount", new Object[0]));
            }
            textView2.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.yt
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r15v3, types: [boolean[], java.io.Serializable] */
                /* JADX WARN: Type inference failed for: r8v8, types: [int[], java.io.Serializable] */
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    qu quVar2;
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2;
                    qu quVar3;
                    int i17;
                    boolean z12;
                    int i18 = i10;
                    qu quVar4 = this;
                    int i19 = 0;
                    boolean z13 = true;
                    switch (i18) {
                        case 0:
                            ArrayList arrayList5 = arrayList4;
                            int size2 = arrayList5.size();
                            int[] iArr = new int[2];
                            for (int i20 = 0; i20 < arrayList5.size(); i20++) {
                                qu.J0(quVar4.j1, (TLObject) arrayList5.get(i20), size2 == 1, size2 > 1 ? new bi.ya(quVar4, iArr, size2, arrayList5) : null, null);
                            }
                            quVar4.K0(true);
                            if (size2 <= 1) {
                                quVar4.dismiss();
                                break;
                            }
                            break;
                        default:
                            quVar4.dismiss();
                            org.telegram.ui.ActionBar.f2 f2Var = quVar4.j1;
                            ArrayList arrayList6 = arrayList4;
                            if (f2Var != null) {
                                org.telegram.messenger.ui b03 = org.telegram.messenger.ui.b0(f2Var.getCurrentAccount());
                                Context context = f2Var.getContext();
                                ArrayList[] arrayListArr2 = b03.G;
                                if (arrayList6.isEmpty() || (tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) jg.g.i(1, arrayList6)) == null) {
                                    quVar2 = quVar4;
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
                                                z12 = z13;
                                                quVar3 = quVar4;
                                                if (tL_messages_stickerSet3.set.id == ((TLRPC.TL_messages_stickerSet) arrayList6.get(i24)).set.id) {
                                                    r82[i24] = i23;
                                                    arrayListArr2[i21].remove(i23);
                                                    b03.I.l(tL_messages_stickerSet3.set.id);
                                                    b03.J.l(tL_messages_stickerSet3.set.id);
                                                    b03.N.remove(tL_messages_stickerSet3.set.short_name);
                                                } else {
                                                    i24++;
                                                    i19 = i17;
                                                    z13 = z12;
                                                    quVar4 = quVar3;
                                                }
                                            } else {
                                                quVar3 = quVar4;
                                                i17 = i19;
                                                z12 = z13;
                                            }
                                        }
                                        i23++;
                                        i19 = i17;
                                        z13 = z12;
                                        quVar4 = quVar3;
                                    }
                                    quVar2 = quVar4;
                                    boolean z14 = i19;
                                    int i25 = z13;
                                    ArrayList arrayList7 = arrayListArr2[i21];
                                    int i26 = b03.Y[i21];
                                    long[] jArr = b03.X;
                                    int i27 = i21;
                                    long q10 = org.telegram.messenger.ui.q(arrayList7);
                                    jArr[i27] = q10;
                                    b03.J1(i27, i26, q10, arrayList7);
                                    org.telegram.messenger.qs notificationCenter = b03.getNotificationCenter();
                                    Object[] objArr = new Object[2];
                                    objArr[z14 ? 1 : 0] = Integer.valueOf(i27);
                                    objArr[i25] = Boolean.TRUE;
                                    notificationCenter.k(60, objArr);
                                    for (int i28 = z14 ? 1 : 0; i28 < arrayList6.size(); i28++) {
                                        b03.g1(((TLRPC.TL_messages_stickerSet) arrayList6.get(i28)).set.id, i25);
                                    }
                                    cv0 cv0Var = new cv0(context, tL_messages_stickerSet2, arrayList6.size(), 0, null, f2Var.getResourceProvider());
                                    ?? r15 = new boolean[i25];
                                    ac acVar = new ac(context, null, z14);
                                    acVar.b = new org.telegram.messenger.ck(b03, (Serializable) r15, arrayList6, i27, (Serializable) r82, 2);
                                    acVar.c = new bg.l0(b03, (boolean[]) r15, arrayList6, context, f2Var, i27);
                                    cv0Var.setButton(acVar);
                                    for (int i29 = 0; i29 < arrayList6.size(); i29++) {
                                        b03.T.k(new org.telegram.messenger.a(acVar, 22), ((TLRPC.TL_messages_stickerSet) arrayList6.get(i29)).set.id);
                                    }
                                    cc.g(f2Var, cv0Var, 2750).j();
                                }
                            } else {
                                quVar2 = quVar4;
                                int i30 = 0;
                                while (i30 < arrayList6.size()) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet4 = (TLRPC.TL_messages_stickerSet) arrayList6.get(i30);
                                    Context context2 = quVar2.getContext();
                                    boolean z15 = i30 == 0;
                                    if (tL_messages_stickerSet4 != null) {
                                        org.telegram.messenger.ui.b0(org.telegram.messenger.p10.s0).g2(context2, tL_messages_stickerSet4, null, 0, null, null, true, z15, null, true);
                                    }
                                    i30++;
                                }
                            }
                            quVar2.K0(false);
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
        textView.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.yt
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r15v3, types: [boolean[], java.io.Serializable] */
            /* JADX WARN: Type inference failed for: r8v8, types: [int[], java.io.Serializable] */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                qu quVar2;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2;
                qu quVar3;
                int i17;
                boolean z12;
                int i18 = i7;
                qu quVar4 = this;
                int i19 = 0;
                boolean z13 = true;
                switch (i18) {
                    case 0:
                        ArrayList arrayList5 = arrayList2;
                        int size2 = arrayList5.size();
                        int[] iArr = new int[2];
                        for (int i20 = 0; i20 < arrayList5.size(); i20++) {
                            qu.J0(quVar4.j1, (TLObject) arrayList5.get(i20), size2 == 1, size2 > 1 ? new bi.ya(quVar4, iArr, size2, arrayList5) : null, null);
                        }
                        quVar4.K0(true);
                        if (size2 <= 1) {
                            quVar4.dismiss();
                            break;
                        }
                        break;
                    default:
                        quVar4.dismiss();
                        org.telegram.ui.ActionBar.f2 f2Var = quVar4.j1;
                        ArrayList arrayList6 = arrayList2;
                        if (f2Var != null) {
                            org.telegram.messenger.ui b03 = org.telegram.messenger.ui.b0(f2Var.getCurrentAccount());
                            Context context = f2Var.getContext();
                            ArrayList[] arrayListArr2 = b03.G;
                            if (arrayList6.isEmpty() || (tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) jg.g.i(1, arrayList6)) == null) {
                                quVar2 = quVar4;
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
                                            z12 = z13;
                                            quVar3 = quVar4;
                                            if (tL_messages_stickerSet3.set.id == ((TLRPC.TL_messages_stickerSet) arrayList6.get(i24)).set.id) {
                                                r82[i24] = i23;
                                                arrayListArr2[i21].remove(i23);
                                                b03.I.l(tL_messages_stickerSet3.set.id);
                                                b03.J.l(tL_messages_stickerSet3.set.id);
                                                b03.N.remove(tL_messages_stickerSet3.set.short_name);
                                            } else {
                                                i24++;
                                                i19 = i17;
                                                z13 = z12;
                                                quVar4 = quVar3;
                                            }
                                        } else {
                                            quVar3 = quVar4;
                                            i17 = i19;
                                            z12 = z13;
                                        }
                                    }
                                    i23++;
                                    i19 = i17;
                                    z13 = z12;
                                    quVar4 = quVar3;
                                }
                                quVar2 = quVar4;
                                boolean z14 = i19;
                                int i25 = z13;
                                ArrayList arrayList7 = arrayListArr2[i21];
                                int i26 = b03.Y[i21];
                                long[] jArr = b03.X;
                                int i27 = i21;
                                long q10 = org.telegram.messenger.ui.q(arrayList7);
                                jArr[i27] = q10;
                                b03.J1(i27, i26, q10, arrayList7);
                                org.telegram.messenger.qs notificationCenter = b03.getNotificationCenter();
                                Object[] objArr = new Object[2];
                                objArr[z14 ? 1 : 0] = Integer.valueOf(i27);
                                objArr[i25] = Boolean.TRUE;
                                notificationCenter.k(60, objArr);
                                for (int i28 = z14 ? 1 : 0; i28 < arrayList6.size(); i28++) {
                                    b03.g1(((TLRPC.TL_messages_stickerSet) arrayList6.get(i28)).set.id, i25);
                                }
                                cv0 cv0Var = new cv0(context, tL_messages_stickerSet2, arrayList6.size(), 0, null, f2Var.getResourceProvider());
                                ?? r15 = new boolean[i25];
                                ac acVar = new ac(context, null, z14);
                                acVar.b = new org.telegram.messenger.ck(b03, (Serializable) r15, arrayList6, i27, (Serializable) r82, 2);
                                acVar.c = new bg.l0(b03, (boolean[]) r15, arrayList6, context, f2Var, i27);
                                cv0Var.setButton(acVar);
                                for (int i29 = 0; i29 < arrayList6.size(); i29++) {
                                    b03.T.k(new org.telegram.messenger.a(acVar, 22), ((TLRPC.TL_messages_stickerSet) arrayList6.get(i29)).set.id);
                                }
                                cc.g(f2Var, cv0Var, 2750).j();
                            }
                        } else {
                            quVar2 = quVar4;
                            int i30 = 0;
                            while (i30 < arrayList6.size()) {
                                TLRPC.TL_messages_stickerSet tL_messages_stickerSet4 = (TLRPC.TL_messages_stickerSet) arrayList6.get(i30);
                                Context context2 = quVar2.getContext();
                                boolean z15 = i30 == 0;
                                if (tL_messages_stickerSet4 != null) {
                                    org.telegram.messenger.ui.b0(org.telegram.messenger.p10.s0).g2(context2, tL_messages_stickerSet4, null, 0, null, null, true, z15, null, true);
                                }
                                i30++;
                            }
                        }
                        quVar2.K0(false);
                        break;
                }
            }
        });
        P0(true);
    }

    public final void O0(boolean z9) {
        boolean z10 = org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.h5, this.I0)) > 0.721f;
        boolean z11 = org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.k6.w(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.s8, this.I0), 855638016)) > 0.721f;
        if (!z9) {
            z10 = z11;
        }
        org.telegram.messenger.g0.q3(this, z10);
    }

    public final void P0(boolean z9) {
        boolean z10 = !this.G1 && z9;
        float L = this.s1.getVisibility() == 0 ? org.telegram.messenger.g0.L(19.0f) : 0;
        boolean z11 = this.y1;
        fi.v vVar = this.n1;
        View view = this.p1;
        FrameLayout frameLayout = this.q1;
        float f10 = 0.0f;
        if (z10) {
            ViewPropertyAnimator duration = frameLayout.animate().translationY(z9 ? L : org.telegram.messenger.g0.L(16.0f)).alpha(z9 ? 1.0f : 0.0f).setDuration(250L);
            xq xqVar = xq.h;
            duration.setInterpolator(xqVar).start();
            view.animate().translationY(z9 ? -(org.telegram.messenger.g0.L(68.0f) - L) : 0.0f).alpha(z9 ? 1.0f : 0.0f).setDuration(250L).setInterpolator(xqVar).start();
            ViewPropertyAnimator animate = vVar.animate();
            if (!z11 && !z9) {
                f10 = org.telegram.messenger.g0.L(68.0f) - L;
            }
            animate.translationY(f10).setDuration(250L).setInterpolator(xqVar).start();
        } else {
            frameLayout.setAlpha(z9 ? 1.0f : 0.0f);
            frameLayout.setTranslationY(z9 ? L : org.telegram.messenger.g0.L(16.0f));
            view.setAlpha(z9 ? 1.0f : 0.0f);
            view.setTranslationY(z9 ? -(org.telegram.messenger.g0.L(68.0f) - L) : 0.0f);
            if (!z11 && !z9) {
                f10 = org.telegram.messenger.g0.L(68.0f) - L;
            }
            vVar.setTranslationY(f10);
        }
        this.G1 = z9;
    }

    @Override // org.telegram.ui.ActionBar.v2
    public final int R() {
        fi.v vVar = this.n1;
        int measuredHeight = (vVar == null ? 0 : vVar.getMeasuredHeight()) - I0();
        ViewGroup viewGroup = this.b;
        return org.telegram.messenger.g0.L(8.0f) + measuredHeight + (viewGroup != null ? viewGroup.getPaddingTop() : 0) + org.telegram.messenger.g0.n;
    }

    @Override // org.telegram.messenger.ls
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        mu muVar;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        if (i7 != org.telegram.messenger.qs.x0) {
            return;
        }
        int i11 = 0;
        while (true) {
            fi.v vVar = this.n1;
            if (i11 >= vVar.getChildCount()) {
                N0();
                return;
            }
            View childAt = vVar.getChildAt(i11);
            if ((childAt instanceof mu) && (tL_messages_stickerSet = (muVar = (mu) childAt).r) != null && tL_messages_stickerSet.set != null) {
                muVar.a(org.telegram.messenger.ui.b0(this.a).B0(muVar.r.set.id, true), true);
            }
            i11++;
        }
    }

    @Override // org.telegram.ui.ActionBar.v2, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.b2
    public void dismiss() {
        iu iuVar = this.m1;
        if (iuVar != null && iuVar.x) {
            iuVar.x = false;
            iuVar.invalidate();
        }
        super.dismiss();
        cu cuVar = this.l1;
        if (cuVar != null) {
            org.telegram.messenger.qs.f(cuVar.d).n(cuVar, org.telegram.messenger.qs.B0);
        }
        org.telegram.messenger.qs.e().k(org.telegram.messenger.qs.k1, 4);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.messenger.qs.f(this.a).c(this, org.telegram.messenger.qs.x0);
    }

    @Override // org.telegram.ui.ActionBar.v2, android.app.Dialog
    public final void onBackPressed() {
        if (org.telegram.ui.ks.p().E) {
            org.telegram.ui.ks.p().n();
        } else {
            super.onBackPressed();
        }
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.messenger.qs.f(this.a).n(this, org.telegram.messenger.qs.x0);
    }

    @Override // org.telegram.ui.ActionBar.v2
    public final void s0() {
        Boolean bool;
        try {
            super.s0();
            cp cpVar = this.w1;
            if (cpVar != null) {
                cpVar.b(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Ci, this.I0));
            }
            iu iuVar = this.m1;
            if (iuVar != null && (bool = iuVar.c) != null) {
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

    @Override // org.telegram.ui.ActionBar.v2, android.app.Dialog
    public final void show() {
        TLRPC.StickerSet stickerSet;
        super.show();
        gu guVar = new gu(this);
        this.o1 = guVar;
        this.n1.setAdapter(guVar);
        int i7 = 0;
        org.telegram.messenger.qs.e().k(org.telegram.messenger.qs.j1, 4);
        cu cuVar = this.l1;
        if (!cuVar.e) {
            cuVar.e = true;
            qu quVar = cuVar.f;
            int i10 = cuVar.d;
            cuVar.b = new ArrayList(cuVar.a.size());
            cuVar.c = new ArrayList[cuVar.a.size()];
            org.telegram.messenger.qs.f(i10).c(cuVar, 64);
            boolean[] zArr = new boolean[1];
            int i11 = 0;
            while (true) {
                if (i11 < cuVar.c.length) {
                    TLRPC.TL_messages_stickerSet l02 = org.telegram.messenger.ui.b0(i10).l0((TLRPC.InputStickerSet) cuVar.a.get(i11), null, false, false, new org.telegram.messenger.voip.k(27, cuVar, zArr));
                    if (cuVar.c.length != 1 || l02 == null || (stickerSet = l02.set) == null || stickerSet.emojis) {
                        cuVar.b.add(l02);
                        cuVar.a(i11, l02);
                        i11++;
                    } else {
                        org.telegram.messenger.g0.h3(new nu(cuVar, i7));
                        Context context = quVar.getContext();
                        org.telegram.ui.ActionBar.f2 f2Var = quVar.j1;
                        TLRPC.InputStickerSet inputStickerSet = (TLRPC.InputStickerSet) cuVar.a.get(i11);
                        org.telegram.ui.ActionBar.f2 f2Var2 = quVar.j1;
                        new yv0(context, f2Var, inputStickerSet, null, f2Var2 instanceof org.telegram.ui.an ? ((org.telegram.ui.an) f2Var2).Z : null, quVar.I0).show();
                    }
                } else {
                    qu quVar2 = cuVar.h;
                    quVar2.N0();
                    fi.v vVar = quVar2.n1;
                    if (vVar != null && vVar.getAdapter() != null) {
                        vVar.getAdapter().f();
                    }
                }
            }
        }
        N0();
        org.telegram.ui.ActionBar.f2 f2Var3 = this.j1;
        org.telegram.messenger.ui.b0(f2Var3 == null ? org.telegram.messenger.p10.s0 : f2Var3.getCurrentAccount()).B(5);
    }

    public void K0(boolean z9) {
    }

    public void L0() {
    }
}
