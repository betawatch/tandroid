// default package

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
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public class az3 extends my0 implements jm7 {
    public static Pattern P1;
    public m8 A1;
    public final boolean B1;
    public boolean C1;
    public float D1;
    public int E1;
    public int F1;
    public final ln G1;
    public final ly3 H1;
    public int I1;
    public boolean J1;
    public long K1;
    public ValueAnimator L1;
    public boolean M1;
    public PorterDuffColorFilter N1;
    public int O1;
    public LongSparseArray l1;
    public final d m1;
    public final o72 n1;
    public final my3 o1;
    public final sy3 p1;
    public final hx q1;
    public qy3 r1;
    public final View s1;
    public final FrameLayout t1;
    public final TextView u1;
    public final TextView v1;
    public final cj8 w1;
    public final q55 x1;
    public final cw6 y1;
    public final wi2 z1;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public az3(d dVar, Context context, ylb ylbVar, ArrayList arrayList) {
        super(1, r4, context, false);
        ylb resourceProvider = (dVar == null || dVar.getResourceProvider() == null) ? ylbVar : dVar.getResourceProvider();
        this.E1 = -1;
        this.F1 = -1;
        this.H1 = new ly3(this);
        this.I1 = -1;
        this.J1 = false;
        this.M1 = true;
        this.m1 = dVar;
        J();
        if (arrayList != null) {
            this.B1 = arrayList.size() > 1;
        }
        this.o1 = new my3(this, this.a, arrayList);
        float L = gm.L(32.0f);
        float L2 = gm.L(3.5f);
        int i = cmb.Ei;
        this.z1 = new wi2(L, L2, cmb.v0(i, this.J0));
        sy3 sy3Var = new sy3(this, context);
        this.p1 = sy3Var;
        this.b = sy3Var;
        this.n1 = new o72(context, (byte) 8);
        hx hxVar = new hx(this, context, this.J0);
        this.q1 = hxVar;
        this.G1 = new ln(0.0f, hxVar, 0L, 1250L, d53.i);
        ViewGroup viewGroup = this.b;
        int i2 = this.u0;
        viewGroup.setPadding(i2, gm.m, i2, 0);
        this.b.setClipChildren(false);
        this.b.setClipToPadding(false);
        this.b.setWillNotDraw(false);
        hxVar.setWillNotDraw(false);
        hxVar.setSelectorRadius(gm.L(6.0f));
        anb.l(hxVar, 20, cmb.h6, resourceProvider);
        hxVar.setPadding(gm.L(8.0f), 0, gm.L(8.0f), gm.L(this.B1 ? 8.0f : 68.0f));
        q55 q55Var = new q55(8);
        this.x1 = q55Var;
        hxVar.setLayoutManager(q55Var);
        byte b = 4;
        hxVar.i(new ks(this, b));
        hxVar.j(new ip2(this, (byte) 9));
        c72 c72Var = new c72(this, arrayList, dVar, resourceProvider);
        hxVar.setOnItemClickListener(c72Var);
        hxVar.setOnItemLongClickListener(new x92((Object) this, (Object) context, (byte) 26));
        hxVar.setOnTouchListener(new f8(this, c72Var, b));
        q55Var.j1(false);
        q55Var.O = new oy3(this);
        this.y1 = new cw6(hxVar, q55Var);
        this.b.addView(hxVar, qoe.e(-1, -1, 51));
        View view = new View(context);
        this.s1 = view;
        anb.h(cmb.U5, null, view);
        this.b.addView(view, qoe.a(-1.0f, 1.0f / gm.p, 80));
        view.setTranslationY(-gm.L(68.0f));
        FrameLayout frameLayout = new FrameLayout(context);
        this.t1 = frameLayout;
        anb.h(cmb.g5, this.J0, frameLayout);
        this.b.addView(frameLayout, qoe.e(-1, 68, 87));
        TextView textView = new TextView(context);
        this.u1 = textView;
        textView.setVisibility(8);
        fg0 e = ulb.e(cmb.v0(i, this.J0), 24.0f);
        wmb M = anb.M(i);
        wmb e2 = anb.e(i);
        ylb ylbVar2 = this.J0;
        textView.setBackground(e);
        anb.j(textView, e, M, e2, ylbVar2);
        anb.X(textView, cmb.Ii, this.J0);
        textView.setTypeface(gm.o());
        textView.setGravity(17);
        rve.b(textView, 0.02f, 1.2f);
        TextView l = wi8.l(frameLayout, textView, qoe.d(-1, 48.0f, 80, 12.0f, 10.0f, 12.0f, 10.0f), context);
        this.v1 = l;
        l.setVisibility(8);
        int i3 = cmb.p7;
        fg0 Y = cmb.Y(cmb.v0(i3, this.J0) & 268435455, 0, 0);
        wmb g = anb.g(i3, 15);
        ylb ylbVar3 = this.J0;
        l.setBackground(Y);
        anb.j(l, Y, null, g, ylbVar3);
        anb.X(l, i3, this.J0);
        l.setTypeface(gm.o());
        l.setGravity(17);
        l.setClickable(true);
        frameLayout.addView(l, qoe.d(-1, -1.0f, 80, 0.0f, 0.0f, 0.0f, 19.0f));
        cj8 cj8Var = new cj8(this.J0, context, false);
        this.w1 = cj8Var;
        cj8Var.b(jb6.M0(2131743552, null), new sf3(this, (byte) 6), false);
        cj8Var.setIcon(R.raw.unlock_icon);
        cj8Var.w.setClickable(true);
        frameLayout.addView(cj8Var, qoe.d(-1, 48.0f, 80, 12.0f, 10.0f, 12.0f, 10.0f));
    }

    public static void E0(final d dVar, TLObject tLObject, final boolean z, final rp2 rp2Var, final a14 a14Var) {
        int currentAccount;
        final View fragmentView;
        TLRPC.StickerSet stickerSet = null;
        if (dVar == null) {
            currentAccount = z8c.t0;
            fragmentView = null;
        } else {
            currentAccount = dVar.getCurrentAccount();
            fragmentView = dVar.getFragmentView();
        }
        final int i = currentAccount;
        if (tLObject != null) {
            final TLRPC.TL_messages_stickerSet tL_messages_stickerSet = tLObject instanceof TLRPC.TL_messages_stickerSet ? (TLRPC.TL_messages_stickerSet) tLObject : null;
            if (tL_messages_stickerSet != null) {
                stickerSet = tL_messages_stickerSet.set;
            } else if (tLObject instanceof TLRPC.StickerSet) {
                stickerSet = (TLRPC.StickerSet) tLObject;
            }
            final TLRPC.StickerSet stickerSet2 = stickerSet;
            if (stickerSet2 != null) {
                Runnable runnable = (Runnable) hs6.d0(i).U.f(stickerSet2.id);
                if (runnable != null) {
                    runnable.run();
                    if (rp2Var != null) {
                        rp2Var.a(Boolean.TRUE);
                        return;
                    }
                    return;
                }
                TLRPC.TL_messages_installStickerSet tL_messages_installStickerSet = new TLRPC.TL_messages_installStickerSet();
                TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
                tL_messages_installStickerSet.stickerset = tL_inputStickerSetID;
                tL_inputStickerSetID.id = stickerSet2.id;
                tL_inputStickerSetID.access_hash = stickerSet2.access_hash;
                ConnectionsManager.getInstance(i).sendRequest(tL_messages_installStickerSet, new RequestDelegate() { // from class: ky3
                    @Override // org.telegram.tgnet.RequestDelegate
                    public final void run(final TLObject tLObject2, final TLRPC.TL_error tL_error) {
                        final TLRPC.StickerSet stickerSet3 = TLRPC.StickerSet.this;
                        final boolean z2 = z;
                        final View view = fragmentView;
                        final d dVar2 = dVar;
                        final TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = tL_messages_stickerSet;
                        final int i2 = i;
                        final rp2 rp2Var2 = rp2Var;
                        final a14 a14Var2 = a14Var;
                        gm.c3(new Runnable() { // from class: jy3
                            @Override // java.lang.Runnable
                            public final void run() {
                                TLObject tLObject3 = tLObject2;
                                TLRPC.StickerSet stickerSet4 = TLRPC.StickerSet.this;
                                int i3 = stickerSet4.masks ? 1 : stickerSet4.emojis ? 5 : 0;
                                TLRPC.TL_error tL_error2 = tL_error;
                                View view2 = view;
                                d dVar3 = dVar2;
                                int i4 = i2;
                                rp2 rp2Var3 = rp2Var2;
                                try {
                                    if (tL_error2 == null) {
                                        if (z2 && view2 != null) {
                                            Context context = dVar3.getFragmentView().getContext();
                                            TLObject tLObject4 = tL_messages_stickerSet2;
                                            u31.g(dVar3, new o1b(context, tLObject4 == null ? stickerSet4 : tLObject4, 1, 2, null, dVar3.getResourceProvider()), 1500).j();
                                        }
                                        if (tLObject3 instanceof TLRPC.TL_messages_stickerSetInstallResultArchive) {
                                            hs6.d0(i4).C1(dVar3, true, i3, (TLRPC.TL_messages_stickerSetInstallResultArchive) tLObject3);
                                        }
                                        if (rp2Var3 != null) {
                                            rp2Var3.a(Boolean.TRUE);
                                        }
                                    } else if (view2 != null) {
                                        Toast.makeText(dVar3.getFragmentView().getContext(), jb6.M0(2131751042, null), 0).show();
                                        if (rp2Var3 != null) {
                                            rp2Var3.a(Boolean.FALSE);
                                        }
                                    } else if (rp2Var3 != null) {
                                        rp2Var3.a(Boolean.FALSE);
                                    }
                                } catch (Exception e) {
                                    fc4.g(e, true);
                                }
                                hs6.d0(i4).c1(i3, false, true, false, new sk3(a14Var2, (byte) 6));
                            }
                        });
                    }
                });
            }
        }
    }

    @Override // my0
    public final boolean C() {
        return false;
    }

    public final int D0() {
        if (this.b == null) {
            return 0;
        }
        hx hxVar = this.q1;
        if (hxVar == null || hxVar.getChildCount() < 1) {
            return this.b.getPaddingTop();
        }
        View childAt = hxVar.getChildAt(0);
        o72 o72Var = this.n1;
        return childAt != o72Var ? this.b.getPaddingTop() : o72Var.getBottom() + ((int) hxVar.getY());
    }

    public final void H0() {
        d dVar = this.m1;
        if (dVar != null) {
            new kj8(dVar, 11, false).show();
        } else if (getContext() instanceof LaunchActivity) {
            ((LaunchActivity) getContext()).t0(new PremiumPreviewFragment(0, null));
        }
    }

    public final void I0() {
        final byte b;
        TLRPC.StickerSet stickerSet;
        if (this.t1 == null) {
            return;
        }
        my3 my3Var = this.o1;
        ArrayList arrayList = my3Var.b == null ? new ArrayList() : new ArrayList(my3Var.b);
        final byte b2 = 0;
        int i = 0;
        while (true) {
            b = 1;
            if (i >= arrayList.size()) {
                break;
            }
            if (arrayList.get(i) == null) {
                arrayList.remove(i);
                i--;
            }
            i++;
        }
        hs6 d0 = hs6.d0(this.a);
        final ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) arrayList.get(i2);
            if (tL_messages_stickerSet != null && (stickerSet = tL_messages_stickerSet.set) != null) {
                if (d0.D0(stickerSet.id, true)) {
                    arrayList2.add(tL_messages_stickerSet);
                } else {
                    arrayList3.add(tL_messages_stickerSet);
                }
            }
        }
        final ArrayList arrayList4 = new ArrayList(arrayList3);
        boolean z = my3Var.a != null && arrayList.size() == my3Var.a.size();
        if (!this.M1 && z && this.L1 == null) {
            this.L1 = ValueAnimator.ofFloat(this.D1, 1.0f);
            this.b.getY();
            this.L1.addUpdateListener(new et1(this, (byte) 20));
            this.L1.setDuration(250L);
            this.L1.setInterpolator(d53.h);
            this.L1.start();
        }
        this.M1 = z;
        hx hxVar = this.q1;
        if (!z) {
            hxVar.setAlpha(0.0f);
        } else if (this.I1 >= 0) {
            int K0 = this.x1.K0();
            int E = this.r1.E(this.I1);
            if (Math.abs(K0 - E) > 54) {
                int i3 = K0 < E ? 0 : 1;
                cw6 cw6Var = this.y1;
                cw6Var.b = i3;
                cw6Var.l(E, (gm.q.y / 2) - gm.L(170.0f), false, false);
            } else {
                hxVar.z0(E);
            }
            this.E1 = this.r1.E(this.I1);
            qy3 qy3Var = this.r1;
            int i4 = this.I1;
            az3 az3Var = qy3Var.c;
            boolean z2 = az3Var.C1;
            my3 my3Var2 = az3Var.o1;
            int i5 = z2 ? 2 : 1;
            int i6 = 0;
            while (true) {
                ArrayList[] arrayListArr = my3Var2.c;
                if (i6 >= arrayListArr.length) {
                    break;
                }
                int size = arrayListArr[i6].size();
                if (my3Var2.c.length > 1) {
                    size = Math.min(az3Var.x1.J << 1, size);
                }
                if (i6 == i4) {
                    i5 = i5 + size + 1;
                    break;
                } else {
                    i5 += size + 2;
                    i6++;
                }
            }
            this.F1 = i5;
            this.G1.e(true, 1.0f);
            hxVar.invalidate();
            this.I1 = -1;
        }
        boolean z3 = this.M1;
        cj8 cj8Var = this.w1;
        TextView textView = this.u1;
        TextView textView2 = this.v1;
        if (!z3 || this.B1) {
            cj8Var.setVisibility(8);
            textView.setVisibility(8);
            textView2.setVisibility(8);
            K0(false);
            return;
        }
        cj8Var.setVisibility(4);
        if (arrayList4.size() > 0) {
            textView.setVisibility(0);
            textView2.setVisibility(8);
            if (arrayList4.size() == 1) {
                textView.setText(jb6.G(((TLRPC.TL_messages_stickerSet) arrayList4.get(0)).documents.size(), "AddManyEmojiCount", new Object[0]));
            } else {
                textView.setText(jb6.G(arrayList4.size(), "AddManyEmojiPacksCount", new Object[0]));
            }
            textView.setOnClickListener(new View.OnClickListener(this) { // from class: iy3
                public final /* synthetic */ az3 b;

                {
                    this.b = this;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r15v3, types: [boolean[], java.io.Serializable] */
                /* JADX WARN: Type inference failed for: r7v8, types: [int[], java.io.Serializable] */
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2;
                    int i7;
                    boolean z4;
                    byte b3 = b2;
                    az3 az3Var2 = this.b;
                    int i8 = 0;
                    boolean z5 = true;
                    switch (b3) {
                        case 0:
                            ArrayList arrayList5 = arrayList4;
                            int size2 = arrayList5.size();
                            int[] iArr = new int[2];
                            while (i8 < arrayList5.size()) {
                                az3.E0(az3Var2.m1, (TLObject) arrayList5.get(i8), size2 == 1, size2 > 1 ? new rp2(az3Var2, iArr, size2, arrayList5) : null, null);
                                i8++;
                            }
                            az3Var2.F0(true);
                            if (size2 <= 1) {
                                az3Var2.dismiss();
                                break;
                            }
                            break;
                        default:
                            az3Var2.dismiss();
                            d dVar = az3Var2.m1;
                            ArrayList arrayList6 = arrayList4;
                            if (dVar != null) {
                                hs6 d02 = hs6.d0(dVar.getCurrentAccount());
                                Context context = dVar.getContext();
                                ArrayList[] arrayListArr2 = d02.H;
                                if (!arrayList6.isEmpty() && (tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) b10.f(1, arrayList6)) != null) {
                                    TLRPC.StickerSet stickerSet2 = tL_messages_stickerSet2.set;
                                    int i9 = stickerSet2.masks ? 1 : stickerSet2.emojis ? 5 : 0;
                                    for (int i10 = 0; i10 < arrayList6.size(); i10++) {
                                        ((TLRPC.TL_messages_stickerSet) arrayList6.get(i10)).set.archived = false;
                                    }
                                    ?? r7 = new int[arrayList6.size()];
                                    int i11 = 0;
                                    while (i11 < arrayListArr2[i9].size()) {
                                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = (TLRPC.TL_messages_stickerSet) arrayListArr2[i9].get(i11);
                                        int i12 = i8;
                                        while (true) {
                                            if (i12 < arrayList6.size()) {
                                                i7 = i8;
                                                z4 = z5;
                                                if (tL_messages_stickerSet3.set.id == ((TLRPC.TL_messages_stickerSet) arrayList6.get(i12)).set.id) {
                                                    r7[i12] = i11;
                                                    arrayListArr2[i9].remove(i11);
                                                    d02.J.l(tL_messages_stickerSet3.set.id);
                                                    d02.K.l(tL_messages_stickerSet3.set.id);
                                                    d02.O.remove(tL_messages_stickerSet3.set.short_name);
                                                } else {
                                                    i12++;
                                                    i8 = i7;
                                                    z5 = z4;
                                                }
                                            } else {
                                                i7 = i8;
                                                z4 = z5;
                                            }
                                        }
                                        i11++;
                                        i8 = i7;
                                        z5 = z4;
                                    }
                                    boolean z6 = i8;
                                    int i13 = z5;
                                    ArrayList arrayList7 = arrayListArr2[i9];
                                    int i14 = d02.Z[i9];
                                    long[] jArr = d02.Y;
                                    int i15 = i9;
                                    long s = hs6.s(arrayList7);
                                    jArr[i15] = s;
                                    d02.M1(i15, i14, s, arrayList7);
                                    nm7 notificationCenter = d02.getNotificationCenter();
                                    Object[] objArr = new Object[2];
                                    objArr[z6 ? 1 : 0] = Integer.valueOf(i15);
                                    objArr[i13] = Boolean.TRUE;
                                    notificationCenter.k(61, objArr);
                                    for (int i16 = z6 ? 1 : 0; i16 < arrayList6.size(); i16++) {
                                        d02.h1(((TLRPC.TL_messages_stickerSet) arrayList6.get(i16)).set.id, i13);
                                    }
                                    o1b o1bVar = new o1b(context, tL_messages_stickerSet2, arrayList6.size(), 0, null, dVar.getResourceProvider());
                                    ?? r15 = new boolean[i13];
                                    s31 s31Var = new s31(null, context, z6);
                                    s31Var.b = new ad6(d02, r15, arrayList6, i15, r7, (byte) 1);
                                    s31Var.c = new nu2(d02, (boolean[]) r15, arrayList6, context, dVar, i15);
                                    o1bVar.setButton(s31Var);
                                    for (int i17 = 0; i17 < arrayList6.size(); i17++) {
                                        d02.U.k(new pg6(s31Var, (byte) 12), ((TLRPC.TL_messages_stickerSet) arrayList6.get(i17)).set.id);
                                    }
                                    u31.g(dVar, o1bVar, 2750).j();
                                }
                            } else {
                                int i18 = 0;
                                while (i18 < arrayList6.size()) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet4 = (TLRPC.TL_messages_stickerSet) arrayList6.get(i18);
                                    Context context2 = az3Var2.getContext();
                                    boolean z7 = i18 == 0;
                                    if (tL_messages_stickerSet4 != null) {
                                        hs6.d0(z8c.t0).i2(context2, tL_messages_stickerSet4, null, 0, null, null, true, z7, null, true);
                                    }
                                    i18++;
                                }
                            }
                            az3Var2.F0(false);
                            break;
                    }
                }
            });
            K0(true);
            return;
        }
        if (arrayList2.size() <= 0) {
            textView.setVisibility(8);
            textView2.setVisibility(8);
            K0(false);
            return;
        }
        textView.setVisibility(8);
        textView2.setVisibility(0);
        if (arrayList2.size() == 1) {
            textView2.setText(jb6.G(((TLRPC.TL_messages_stickerSet) arrayList2.get(0)).documents.size(), "RemoveManyEmojiCount", new Object[0]));
        } else {
            textView2.setText(jb6.G(arrayList2.size(), "RemoveManyEmojiPacksCount", new Object[0]));
        }
        textView2.setOnClickListener(new View.OnClickListener(this) { // from class: iy3
            public final /* synthetic */ az3 b;

            {
                this.b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r15v3, types: [boolean[], java.io.Serializable] */
            /* JADX WARN: Type inference failed for: r7v8, types: [int[], java.io.Serializable] */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2;
                int i7;
                boolean z4;
                byte b3 = b;
                az3 az3Var2 = this.b;
                int i8 = 0;
                boolean z5 = true;
                switch (b3) {
                    case 0:
                        ArrayList arrayList5 = arrayList2;
                        int size2 = arrayList5.size();
                        int[] iArr = new int[2];
                        while (i8 < arrayList5.size()) {
                            az3.E0(az3Var2.m1, (TLObject) arrayList5.get(i8), size2 == 1, size2 > 1 ? new rp2(az3Var2, iArr, size2, arrayList5) : null, null);
                            i8++;
                        }
                        az3Var2.F0(true);
                        if (size2 <= 1) {
                            az3Var2.dismiss();
                            break;
                        }
                        break;
                    default:
                        az3Var2.dismiss();
                        d dVar = az3Var2.m1;
                        ArrayList arrayList6 = arrayList2;
                        if (dVar != null) {
                            hs6 d02 = hs6.d0(dVar.getCurrentAccount());
                            Context context = dVar.getContext();
                            ArrayList[] arrayListArr2 = d02.H;
                            if (!arrayList6.isEmpty() && (tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) b10.f(1, arrayList6)) != null) {
                                TLRPC.StickerSet stickerSet2 = tL_messages_stickerSet2.set;
                                int i9 = stickerSet2.masks ? 1 : stickerSet2.emojis ? 5 : 0;
                                for (int i10 = 0; i10 < arrayList6.size(); i10++) {
                                    ((TLRPC.TL_messages_stickerSet) arrayList6.get(i10)).set.archived = false;
                                }
                                ?? r7 = new int[arrayList6.size()];
                                int i11 = 0;
                                while (i11 < arrayListArr2[i9].size()) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = (TLRPC.TL_messages_stickerSet) arrayListArr2[i9].get(i11);
                                    int i12 = i8;
                                    while (true) {
                                        if (i12 < arrayList6.size()) {
                                            i7 = i8;
                                            z4 = z5;
                                            if (tL_messages_stickerSet3.set.id == ((TLRPC.TL_messages_stickerSet) arrayList6.get(i12)).set.id) {
                                                r7[i12] = i11;
                                                arrayListArr2[i9].remove(i11);
                                                d02.J.l(tL_messages_stickerSet3.set.id);
                                                d02.K.l(tL_messages_stickerSet3.set.id);
                                                d02.O.remove(tL_messages_stickerSet3.set.short_name);
                                            } else {
                                                i12++;
                                                i8 = i7;
                                                z5 = z4;
                                            }
                                        } else {
                                            i7 = i8;
                                            z4 = z5;
                                        }
                                    }
                                    i11++;
                                    i8 = i7;
                                    z5 = z4;
                                }
                                boolean z6 = i8;
                                int i13 = z5;
                                ArrayList arrayList7 = arrayListArr2[i9];
                                int i14 = d02.Z[i9];
                                long[] jArr = d02.Y;
                                int i15 = i9;
                                long s = hs6.s(arrayList7);
                                jArr[i15] = s;
                                d02.M1(i15, i14, s, arrayList7);
                                nm7 notificationCenter = d02.getNotificationCenter();
                                Object[] objArr = new Object[2];
                                objArr[z6 ? 1 : 0] = Integer.valueOf(i15);
                                objArr[i13] = Boolean.TRUE;
                                notificationCenter.k(61, objArr);
                                for (int i16 = z6 ? 1 : 0; i16 < arrayList6.size(); i16++) {
                                    d02.h1(((TLRPC.TL_messages_stickerSet) arrayList6.get(i16)).set.id, i13);
                                }
                                o1b o1bVar = new o1b(context, tL_messages_stickerSet2, arrayList6.size(), 0, null, dVar.getResourceProvider());
                                ?? r15 = new boolean[i13];
                                s31 s31Var = new s31(null, context, z6);
                                s31Var.b = new ad6(d02, r15, arrayList6, i15, r7, (byte) 1);
                                s31Var.c = new nu2(d02, (boolean[]) r15, arrayList6, context, dVar, i15);
                                o1bVar.setButton(s31Var);
                                for (int i17 = 0; i17 < arrayList6.size(); i17++) {
                                    d02.U.k(new pg6(s31Var, (byte) 12), ((TLRPC.TL_messages_stickerSet) arrayList6.get(i17)).set.id);
                                }
                                u31.g(dVar, o1bVar, 2750).j();
                            }
                        } else {
                            int i18 = 0;
                            while (i18 < arrayList6.size()) {
                                TLRPC.TL_messages_stickerSet tL_messages_stickerSet4 = (TLRPC.TL_messages_stickerSet) arrayList6.get(i18);
                                Context context2 = az3Var2.getContext();
                                boolean z7 = i18 == 0;
                                if (tL_messages_stickerSet4 != null) {
                                    hs6.d0(z8c.t0).i2(context2, tL_messages_stickerSet4, null, 0, null, null, true, z7, null, true);
                                }
                                i18++;
                            }
                        }
                        az3Var2.F0(false);
                        break;
                }
            }
        });
        K0(true);
    }

    public final void J0(boolean z) {
        boolean z2 = gm.B(cmb.v0(cmb.g5, this.J0)) > 0.721f;
        boolean z3 = gm.B(cmb.v(cmb.v0(cmb.r8, this.J0), 855638016)) > 0.721f;
        if (!z) {
            z2 = z3;
        }
        gm.l3(this, z2);
    }

    public final void K0(boolean z) {
        boolean z2 = !this.J1 && z;
        float L = this.v1.getVisibility() == 0 ? gm.L(19.0f) : 0;
        boolean z3 = this.B1;
        hx hxVar = this.q1;
        FrameLayout frameLayout = this.t1;
        View view = this.s1;
        float f = 0.0f;
        if (z2) {
            ViewPropertyAnimator duration = frameLayout.animate().translationY(z ? L : gm.L(16.0f)).alpha(z ? 1.0f : 0.0f).setDuration(250L);
            d53 d53Var = d53.h;
            duration.setInterpolator(d53Var).start();
            view.animate().translationY(z ? -(gm.L(68.0f) - L) : 0.0f).alpha(z ? 1.0f : 0.0f).setDuration(250L).setInterpolator(d53Var).start();
            ViewPropertyAnimator animate = hxVar.animate();
            if (!z3 && !z) {
                f = gm.L(68.0f) - L;
            }
            animate.translationY(f).setDuration(250L).setInterpolator(d53Var).start();
        } else {
            frameLayout.setAlpha(z ? 1.0f : 0.0f);
            frameLayout.setTranslationY(z ? L : gm.L(16.0f));
            view.setAlpha(z ? 1.0f : 0.0f);
            view.setTranslationY(z ? -(gm.L(68.0f) - L) : 0.0f);
            if (!z3 && !z) {
                f = gm.L(68.0f) - L;
            }
            hxVar.setTranslationY(f);
        }
        this.J1 = z;
    }

    @Override // my0
    public final int P() {
        hx hxVar = this.q1;
        int measuredHeight = (hxVar == null ? 0 : hxVar.getMeasuredHeight()) - D0();
        ViewGroup viewGroup = this.b;
        return gm.L(8.0f) + measuredHeight + (viewGroup != null ? viewGroup.getPaddingTop() : 0) + gm.n;
    }

    @Override // jm7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        wy3 wy3Var;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        if (i != nm7.x0) {
            return;
        }
        int i3 = 0;
        while (true) {
            hx hxVar = this.q1;
            if (i3 >= hxVar.getChildCount()) {
                I0();
                return;
            }
            View childAt = hxVar.getChildAt(i3);
            if ((childAt instanceof wy3) && (tL_messages_stickerSet = (wy3Var = (wy3) childAt).r) != null && tL_messages_stickerSet.set != null) {
                wy3Var.a(hs6.d0(this.a).D0(wy3Var.r.set.id, true), true);
            }
            i3++;
        }
    }

    @Override // my0, android.app.Dialog, android.content.DialogInterface, ah0
    public void dismiss() {
        sy3 sy3Var = this.p1;
        if (sy3Var != null && sy3Var.x) {
            sy3Var.x = false;
            sy3Var.invalidate();
        }
        super.dismiss();
        my3 my3Var = this.o1;
        if (my3Var != null) {
            nm7.f(my3Var.d).n(my3Var, nm7.B0);
        }
        nm7.e().k(nm7.k1, 4);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        nm7.f(this.a).b(this, nm7.x0);
    }

    @Override // my0, android.app.Dialog
    public final void onBackPressed() {
        if (hx2.e().E) {
            hx2.e().c();
        } else {
            super.onBackPressed();
        }
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        nm7.f(this.a).n(this, nm7.x0);
    }

    @Override // my0
    public final void p0() {
        Boolean bool;
        try {
            super.p0();
            wi2 wi2Var = this.z1;
            if (wi2Var != null) {
                wi2Var.b(cmb.v0(cmb.Ei, this.J0));
            }
            sy3 sy3Var = this.p1;
            if (sy3Var != null && (bool = sy3Var.c) != null) {
                J0(bool.booleanValue());
            }
            ViewGroup viewGroup = this.b;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    @Override // my0, android.app.Dialog
    public final void show() {
        TLRPC.StickerSet stickerSet;
        super.show();
        qy3 qy3Var = new qy3(this);
        this.r1 = qy3Var;
        this.q1.setAdapter(qy3Var);
        byte b = 0;
        nm7.e().k(nm7.j1, 4);
        my3 my3Var = this.o1;
        if (!my3Var.e) {
            my3Var.e = true;
            az3 az3Var = my3Var.f;
            int i = my3Var.d;
            my3Var.b = new ArrayList(my3Var.a.size());
            my3Var.c = new ArrayList[my3Var.a.size()];
            nm7.f(i).b(my3Var, 65);
            boolean[] zArr = new boolean[1];
            int i2 = 0;
            while (true) {
                if (i2 < my3Var.c.length) {
                    TLRPC.TL_messages_stickerSet m0 = hs6.d0(i).m0((TLRPC.InputStickerSet) my3Var.a.get(i2), null, false, false, new qy1((Object) my3Var, (Object) zArr, (byte) 16));
                    if (my3Var.c.length != 1 || m0 == null || (stickerSet = m0.set) == null || stickerSet.emojis) {
                        my3Var.b.add(m0);
                        my3Var.a(i2, m0);
                        i2++;
                    } else {
                        gm.c3(new xy3(my3Var, b));
                        Context context = az3Var.getContext();
                        d dVar = az3Var.m1;
                        TLRPC.InputStickerSet inputStickerSet = (TLRPC.InputStickerSet) my3Var.a.get(i2);
                        d dVar2 = az3Var.m1;
                        new x2b(context, dVar, inputStickerSet, null, dVar2 instanceof yv1 ? ((yv1) dVar2).a0 : null, az3Var.J0).show();
                    }
                } else {
                    az3 az3Var2 = my3Var.h;
                    az3Var2.I0();
                    hx hxVar = az3Var2.q1;
                    if (hxVar != null && hxVar.getAdapter() != null) {
                        hxVar.getAdapter().f();
                    }
                }
            }
        }
        I0();
        d dVar3 = this.m1;
        hs6.d0(dVar3 == null ? z8c.t0 : dVar3.getCurrentAccount()).D(5);
    }

    public void F0(boolean z) {
    }

    public void G0() {
    }
}
