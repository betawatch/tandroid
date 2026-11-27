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
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public class ly3 extends nx0 implements fn7 {
    public static Pattern P1;
    public n8 A1;
    public final boolean B1;
    public boolean C1;
    public float D1;
    public int E1;
    public int F1;
    public final mm G1;
    public final wx3 H1;
    public int I1;
    public boolean J1;
    public long K1;
    public ValueAnimator L1;
    public boolean M1;
    public PorterDuffColorFilter N1;
    public int O1;
    public LongSparseArray l1;
    public final e m1;
    public final t62 n1;
    public final xx3 o1;
    public final dy3 p1;
    public final iw q1;
    public by3 r1;
    public final View s1;
    public final FrameLayout t1;
    public final TextView u1;
    public final TextView v1;
    public final ok8 w1;
    public final u55 x1;
    public final hw6 y1;
    public final di2 z1;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ly3(e eVar, Context context, vnb vnbVar, ArrayList arrayList) {
        super(1, r4, context, false);
        vnb resourceProvider = (eVar == null || eVar.getResourceProvider() == null) ? vnbVar : eVar.getResourceProvider();
        this.E1 = -1;
        this.F1 = -1;
        this.H1 = new wx3(this);
        this.I1 = -1;
        this.J1 = false;
        this.M1 = true;
        this.m1 = eVar;
        J();
        if (arrayList != null) {
            this.B1 = arrayList.size() > 1;
        }
        this.o1 = new xx3(this, this.a, arrayList);
        float L = hl.L(32.0f);
        float L2 = hl.L(3.5f);
        int i = aob.Fi;
        this.z1 = new di2(L, L2, aob.v0(i, this.J0));
        dy3 dy3Var = new dy3(this, context);
        this.p1 = dy3Var;
        this.b = dy3Var;
        byte b = 8;
        this.n1 = new t62(context, b);
        iw iwVar = new iw(this, context, this.J0);
        this.q1 = iwVar;
        this.G1 = new mm(0.0f, iwVar, 0L, 1250L, k43.i);
        ViewGroup viewGroup = this.b;
        int i2 = this.u0;
        viewGroup.setPadding(i2, hl.m, i2, 0);
        this.b.setClipChildren(false);
        this.b.setClipToPadding(false);
        this.b.setWillNotDraw(false);
        iwVar.setWillNotDraw(false);
        iwVar.setSelectorRadius(hl.L(6.0f));
        yob.l(iwVar, 20, aob.i6, resourceProvider);
        iwVar.setPadding(hl.L(8.0f), 0, hl.L(8.0f), hl.L(this.B1 ? 8.0f : 68.0f));
        u55 u55Var = new u55(8);
        this.x1 = u55Var;
        iwVar.setLayoutManager(u55Var);
        byte b2 = 4;
        iwVar.i(new lr(this, b2));
        iwVar.j(new to2(this, b));
        h62 h62Var = new h62(this, arrayList, eVar, resourceProvider);
        iwVar.setOnItemClickListener(h62Var);
        iwVar.setOnItemLongClickListener(new q72((Object) this, (Object) context, (byte) 29));
        iwVar.setOnTouchListener(new g8(this, h62Var, b2));
        u55Var.j1(false);
        u55Var.O = new zx3(this);
        this.y1 = new hw6(iwVar, u55Var);
        this.b.addView(iwVar, tre.e(-1, -1, 51));
        View view = new View(context);
        this.s1 = view;
        yob.h(aob.V5, null, view);
        this.b.addView(view, tre.a(-1.0f, 1.0f / hl.p, 80));
        view.setTranslationY(-hl.L(68.0f));
        FrameLayout frameLayout = new FrameLayout(context);
        this.t1 = frameLayout;
        yob.h(aob.h5, this.J0, frameLayout);
        this.b.addView(frameLayout, tre.e(-1, 68, 87));
        TextView textView = new TextView(context);
        this.u1 = textView;
        textView.setVisibility(8);
        hf0 e = rnb.e(aob.v0(i, this.J0), 24.0f);
        uob M = yob.M(i);
        uob e2 = yob.e(i);
        vnb vnbVar2 = this.J0;
        textView.setBackground(e);
        yob.j(textView, e, M, e2, vnbVar2);
        yob.X(textView, aob.Ji, this.J0);
        textView.setTypeface(hl.o());
        textView.setGravity(17);
        iye.b(textView, 0.02f, 1.2f);
        TextView l = ik8.l(frameLayout, textView, tre.d(-1, 48.0f, 80, 12.0f, 10.0f, 12.0f, 10.0f), context);
        this.v1 = l;
        l.setVisibility(8);
        int i3 = aob.q7;
        hf0 Y = aob.Y(aob.v0(i3, this.J0) & 268435455, 0, 0);
        uob g = yob.g(i3, 15);
        vnb vnbVar3 = this.J0;
        l.setBackground(Y);
        yob.j(l, Y, null, g, vnbVar3);
        yob.X(l, i3, this.J0);
        l.setTypeface(hl.o());
        l.setGravity(17);
        l.setClickable(true);
        frameLayout.addView(l, tre.d(-1, -1.0f, 80, 0.0f, 0.0f, 0.0f, 19.0f));
        ok8 ok8Var = new ok8(this.J0, context, false);
        this.w1 = ok8Var;
        ok8Var.b(ob6.M0(2131743520, null), new mh3(this, (byte) 5), false);
        ok8Var.setIcon(R.raw.unlock_icon);
        ok8Var.w.setClickable(true);
        frameLayout.addView(ok8Var, tre.d(-1, 48.0f, 80, 12.0f, 10.0f, 12.0f, 10.0f));
    }

    public static void F0(final e eVar, TLObject tLObject, final boolean z, final zo2 zo2Var, final lw3 lw3Var) {
        int currentAccount;
        final View fragmentView;
        TLRPC.StickerSet stickerSet = null;
        if (eVar == null) {
            currentAccount = yac.t0;
            fragmentView = null;
        } else {
            currentAccount = eVar.getCurrentAccount();
            fragmentView = eVar.getFragmentView();
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
                Runnable runnable = (Runnable) ls6.d0(i).U.f(stickerSet2.id);
                if (runnable != null) {
                    runnable.run();
                    if (zo2Var != null) {
                        zo2Var.a(Boolean.TRUE);
                        return;
                    }
                    return;
                }
                TLRPC.TL_messages_installStickerSet tL_messages_installStickerSet = new TLRPC.TL_messages_installStickerSet();
                TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
                tL_messages_installStickerSet.stickerset = tL_inputStickerSetID;
                tL_inputStickerSetID.id = stickerSet2.id;
                tL_inputStickerSetID.access_hash = stickerSet2.access_hash;
                ConnectionsManager.getInstance(i).sendRequest(tL_messages_installStickerSet, new RequestDelegate() { // from class: ux3
                    @Override // org.telegram.tgnet.RequestDelegate
                    public final void run(final TLObject tLObject2, final TLRPC.TL_error tL_error) {
                        final TLRPC.StickerSet stickerSet3 = TLRPC.StickerSet.this;
                        final boolean z2 = z;
                        final View view = fragmentView;
                        final e eVar2 = eVar;
                        final TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = tL_messages_stickerSet;
                        final int i2 = i;
                        final zo2 zo2Var2 = zo2Var;
                        final lw3 lw3Var2 = lw3Var;
                        hl.c3(new Runnable() { // from class: sx3
                            @Override // java.lang.Runnable
                            public final void run() {
                                TLObject tLObject3 = tLObject2;
                                TLRPC.StickerSet stickerSet4 = TLRPC.StickerSet.this;
                                int i3 = stickerSet4.masks ? 1 : stickerSet4.emojis ? 5 : 0;
                                TLRPC.TL_error tL_error2 = tL_error;
                                View view2 = view;
                                e eVar3 = eVar2;
                                int i4 = i2;
                                zo2 zo2Var3 = zo2Var2;
                                try {
                                    if (tL_error2 == null) {
                                        if (z2 && view2 != null) {
                                            Context context = eVar3.getFragmentView().getContext();
                                            TLObject tLObject4 = tL_messages_stickerSet2;
                                            v21.g(eVar3, new l3b(context, tLObject4 == null ? stickerSet4 : tLObject4, 1, 2, null, eVar3.getResourceProvider()), 1500).j();
                                        }
                                        if (tLObject3 instanceof TLRPC.TL_messages_stickerSetInstallResultArchive) {
                                            ls6.d0(i4).C1(eVar3, true, i3, (TLRPC.TL_messages_stickerSetInstallResultArchive) tLObject3);
                                        }
                                        if (zo2Var3 != null) {
                                            zo2Var3.a(Boolean.TRUE);
                                        }
                                    } else if (view2 != null) {
                                        Toast.makeText(eVar3.getFragmentView().getContext(), ob6.M0(2131751070, null), 0).show();
                                        if (zo2Var3 != null) {
                                            zo2Var3.a(Boolean.FALSE);
                                        }
                                    } else if (zo2Var3 != null) {
                                        zo2Var3.a(Boolean.FALSE);
                                    }
                                } catch (Exception e) {
                                    cc4.g(e, true);
                                }
                                ls6.d0(i4).c1(i3, false, true, false, new zj3(lw3Var2, (byte) 6));
                            }
                        });
                    }
                });
            }
        }
    }

    @Override // nx0
    public final boolean D() {
        return false;
    }

    public final int E0() {
        if (this.b == null) {
            return 0;
        }
        iw iwVar = this.q1;
        if (iwVar == null || iwVar.getChildCount() < 1) {
            return this.b.getPaddingTop();
        }
        View childAt = iwVar.getChildAt(0);
        t62 t62Var = this.n1;
        return childAt != t62Var ? this.b.getPaddingTop() : t62Var.getBottom() + ((int) iwVar.getY());
    }

    public final void I0() {
        e eVar = this.m1;
        if (eVar != null) {
            new xk8(eVar, 11, false).show();
        } else if (getContext() instanceof LaunchActivity) {
            ((LaunchActivity) getContext()).t0(new PremiumPreviewFragment(0, null));
        }
    }

    public final void J0() {
        final byte b;
        TLRPC.StickerSet stickerSet;
        if (this.t1 == null) {
            return;
        }
        xx3 xx3Var = this.o1;
        ArrayList arrayList = xx3Var.b == null ? new ArrayList() : new ArrayList(xx3Var.b);
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
        ls6 d0 = ls6.d0(this.a);
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
        boolean z = xx3Var.a != null && arrayList.size() == xx3Var.a.size();
        if (!this.M1 && z && this.L1 == null) {
            this.L1 = ValueAnimator.ofFloat(this.D1, 1.0f);
            this.b.getY();
            this.L1.addUpdateListener(new az1(this, (byte) 19));
            this.L1.setDuration(250L);
            this.L1.setInterpolator(k43.h);
            this.L1.start();
        }
        this.M1 = z;
        iw iwVar = this.q1;
        if (!z) {
            iwVar.setAlpha(0.0f);
        } else if (this.I1 >= 0) {
            int K0 = this.x1.K0();
            int E = this.r1.E(this.I1);
            if (Math.abs(K0 - E) > 54) {
                int i3 = K0 < E ? 0 : 1;
                hw6 hw6Var = this.y1;
                hw6Var.b = i3;
                hw6Var.k(E, (hl.q.y / 2) - hl.L(170.0f), false, false);
            } else {
                iwVar.A0(E);
            }
            this.E1 = this.r1.E(this.I1);
            by3 by3Var = this.r1;
            int i4 = this.I1;
            ly3 ly3Var = by3Var.c;
            boolean z2 = ly3Var.C1;
            xx3 xx3Var2 = ly3Var.o1;
            int i5 = z2 ? 2 : 1;
            int i6 = 0;
            while (true) {
                ArrayList[] arrayListArr = xx3Var2.c;
                if (i6 >= arrayListArr.length) {
                    break;
                }
                int size = arrayListArr[i6].size();
                if (xx3Var2.c.length > 1) {
                    size = Math.min(ly3Var.x1.J << 1, size);
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
            iwVar.invalidate();
            this.I1 = -1;
        }
        boolean z3 = this.M1;
        ok8 ok8Var = this.w1;
        TextView textView = this.u1;
        TextView textView2 = this.v1;
        if (!z3 || this.B1) {
            ok8Var.setVisibility(8);
            textView.setVisibility(8);
            textView2.setVisibility(8);
            L0(false);
            return;
        }
        ok8Var.setVisibility(4);
        if (arrayList4.size() > 0) {
            textView.setVisibility(0);
            textView2.setVisibility(8);
            if (arrayList4.size() == 1) {
                textView.setText(ob6.G(((TLRPC.TL_messages_stickerSet) arrayList4.get(0)).documents.size(), "AddManyEmojiCount", new Object[0]));
            } else {
                textView.setText(ob6.G(arrayList4.size(), "AddManyEmojiPacksCount", new Object[0]));
            }
            textView.setOnClickListener(new View.OnClickListener(this) { // from class: tx3
                public final /* synthetic */ ly3 b;

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
                    ly3 ly3Var2 = this.b;
                    int i8 = 0;
                    boolean z5 = true;
                    switch (b3) {
                        case 0:
                            ArrayList arrayList5 = arrayList4;
                            int size2 = arrayList5.size();
                            int[] iArr = new int[2];
                            while (i8 < arrayList5.size()) {
                                ly3.F0(ly3Var2.m1, (TLObject) arrayList5.get(i8), size2 == 1, size2 > 1 ? new zo2(ly3Var2, iArr, size2, arrayList5) : null, null);
                                i8++;
                            }
                            ly3Var2.G0(true);
                            if (size2 <= 1) {
                                ly3Var2.dismiss();
                                break;
                            }
                            break;
                        default:
                            ly3Var2.dismiss();
                            e eVar = ly3Var2.m1;
                            ArrayList arrayList6 = arrayList4;
                            if (eVar != null) {
                                ls6 d02 = ls6.d0(eVar.getCurrentAccount());
                                Context context = eVar.getContext();
                                ArrayList[] arrayListArr2 = d02.H;
                                if (!arrayList6.isEmpty() && (tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) c00.g(1, arrayList6)) != null) {
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
                                    long s = ls6.s(arrayList7);
                                    jArr[i15] = s;
                                    d02.M1(i15, i14, s, arrayList7);
                                    jn7 notificationCenter = d02.getNotificationCenter();
                                    Object[] objArr = new Object[2];
                                    objArr[z6 ? 1 : 0] = Integer.valueOf(i15);
                                    objArr[i13] = Boolean.TRUE;
                                    notificationCenter.k(61, objArr);
                                    for (int i16 = z6 ? 1 : 0; i16 < arrayList6.size(); i16++) {
                                        d02.h1(((TLRPC.TL_messages_stickerSet) arrayList6.get(i16)).set.id, i13);
                                    }
                                    l3b l3bVar = new l3b(context, tL_messages_stickerSet2, arrayList6.size(), 0, null, eVar.getResourceProvider());
                                    ?? r15 = new boolean[i13];
                                    t21 t21Var = new t21(null, context, z6);
                                    t21Var.b = new fd6(d02, r15, arrayList6, i15, r7, (byte) 1);
                                    t21Var.c = new wt2(d02, (boolean[]) r15, arrayList6, context, eVar, i15);
                                    l3bVar.setButton(t21Var);
                                    for (int i17 = 0; i17 < arrayList6.size(); i17++) {
                                        d02.U.k(((TLRPC.TL_messages_stickerSet) arrayList6.get(i17)).set.id, new z96(t21Var, (byte) 17));
                                    }
                                    v21.g(eVar, l3bVar, 2750).j();
                                }
                            } else {
                                int i18 = 0;
                                while (i18 < arrayList6.size()) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet4 = (TLRPC.TL_messages_stickerSet) arrayList6.get(i18);
                                    Context context2 = ly3Var2.getContext();
                                    boolean z7 = i18 == 0;
                                    if (tL_messages_stickerSet4 != null) {
                                        ls6.d0(yac.t0).i2(context2, tL_messages_stickerSet4, null, 0, null, null, true, z7, null, true);
                                    }
                                    i18++;
                                }
                            }
                            ly3Var2.G0(false);
                            break;
                    }
                }
            });
            L0(true);
            return;
        }
        if (arrayList2.size() <= 0) {
            textView.setVisibility(8);
            textView2.setVisibility(8);
            L0(false);
            return;
        }
        textView.setVisibility(8);
        textView2.setVisibility(0);
        if (arrayList2.size() == 1) {
            textView2.setText(ob6.G(((TLRPC.TL_messages_stickerSet) arrayList2.get(0)).documents.size(), "RemoveManyEmojiCount", new Object[0]));
        } else {
            textView2.setText(ob6.G(arrayList2.size(), "RemoveManyEmojiPacksCount", new Object[0]));
        }
        textView2.setOnClickListener(new View.OnClickListener(this) { // from class: tx3
            public final /* synthetic */ ly3 b;

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
                ly3 ly3Var2 = this.b;
                int i8 = 0;
                boolean z5 = true;
                switch (b3) {
                    case 0:
                        ArrayList arrayList5 = arrayList2;
                        int size2 = arrayList5.size();
                        int[] iArr = new int[2];
                        while (i8 < arrayList5.size()) {
                            ly3.F0(ly3Var2.m1, (TLObject) arrayList5.get(i8), size2 == 1, size2 > 1 ? new zo2(ly3Var2, iArr, size2, arrayList5) : null, null);
                            i8++;
                        }
                        ly3Var2.G0(true);
                        if (size2 <= 1) {
                            ly3Var2.dismiss();
                            break;
                        }
                        break;
                    default:
                        ly3Var2.dismiss();
                        e eVar = ly3Var2.m1;
                        ArrayList arrayList6 = arrayList2;
                        if (eVar != null) {
                            ls6 d02 = ls6.d0(eVar.getCurrentAccount());
                            Context context = eVar.getContext();
                            ArrayList[] arrayListArr2 = d02.H;
                            if (!arrayList6.isEmpty() && (tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) c00.g(1, arrayList6)) != null) {
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
                                long s = ls6.s(arrayList7);
                                jArr[i15] = s;
                                d02.M1(i15, i14, s, arrayList7);
                                jn7 notificationCenter = d02.getNotificationCenter();
                                Object[] objArr = new Object[2];
                                objArr[z6 ? 1 : 0] = Integer.valueOf(i15);
                                objArr[i13] = Boolean.TRUE;
                                notificationCenter.k(61, objArr);
                                for (int i16 = z6 ? 1 : 0; i16 < arrayList6.size(); i16++) {
                                    d02.h1(((TLRPC.TL_messages_stickerSet) arrayList6.get(i16)).set.id, i13);
                                }
                                l3b l3bVar = new l3b(context, tL_messages_stickerSet2, arrayList6.size(), 0, null, eVar.getResourceProvider());
                                ?? r15 = new boolean[i13];
                                t21 t21Var = new t21(null, context, z6);
                                t21Var.b = new fd6(d02, r15, arrayList6, i15, r7, (byte) 1);
                                t21Var.c = new wt2(d02, (boolean[]) r15, arrayList6, context, eVar, i15);
                                l3bVar.setButton(t21Var);
                                for (int i17 = 0; i17 < arrayList6.size(); i17++) {
                                    d02.U.k(((TLRPC.TL_messages_stickerSet) arrayList6.get(i17)).set.id, new z96(t21Var, (byte) 17));
                                }
                                v21.g(eVar, l3bVar, 2750).j();
                            }
                        } else {
                            int i18 = 0;
                            while (i18 < arrayList6.size()) {
                                TLRPC.TL_messages_stickerSet tL_messages_stickerSet4 = (TLRPC.TL_messages_stickerSet) arrayList6.get(i18);
                                Context context2 = ly3Var2.getContext();
                                boolean z7 = i18 == 0;
                                if (tL_messages_stickerSet4 != null) {
                                    ls6.d0(yac.t0).i2(context2, tL_messages_stickerSet4, null, 0, null, null, true, z7, null, true);
                                }
                                i18++;
                            }
                        }
                        ly3Var2.G0(false);
                        break;
                }
            }
        });
        L0(true);
    }

    public final void K0(boolean z) {
        boolean z2 = hl.B(aob.v0(aob.h5, this.J0)) > 0.721f;
        boolean z3 = hl.B(aob.v(aob.v0(aob.s8, this.J0), 855638016)) > 0.721f;
        if (!z) {
            z2 = z3;
        }
        hl.l3(this, z2);
    }

    public final void L0(boolean z) {
        boolean z2 = !this.J1 && z;
        float L = this.v1.getVisibility() == 0 ? hl.L(19.0f) : 0;
        boolean z3 = this.B1;
        iw iwVar = this.q1;
        FrameLayout frameLayout = this.t1;
        View view = this.s1;
        float f = 0.0f;
        if (z2) {
            ViewPropertyAnimator duration = frameLayout.animate().translationY(z ? L : hl.L(16.0f)).alpha(z ? 1.0f : 0.0f).setDuration(250L);
            k43 k43Var = k43.h;
            duration.setInterpolator(k43Var).start();
            view.animate().translationY(z ? -(hl.L(68.0f) - L) : 0.0f).alpha(z ? 1.0f : 0.0f).setDuration(250L).setInterpolator(k43Var).start();
            ViewPropertyAnimator animate = iwVar.animate();
            if (!z3 && !z) {
                f = hl.L(68.0f) - L;
            }
            animate.translationY(f).setDuration(250L).setInterpolator(k43Var).start();
        } else {
            frameLayout.setAlpha(z ? 1.0f : 0.0f);
            frameLayout.setTranslationY(z ? L : hl.L(16.0f));
            view.setAlpha(z ? 1.0f : 0.0f);
            view.setTranslationY(z ? -(hl.L(68.0f) - L) : 0.0f);
            if (!z3 && !z) {
                f = hl.L(68.0f) - L;
            }
            iwVar.setTranslationY(f);
        }
        this.J1 = z;
    }

    @Override // nx0
    public final int P() {
        iw iwVar = this.q1;
        int measuredHeight = (iwVar == null ? 0 : iwVar.getMeasuredHeight()) - E0();
        ViewGroup viewGroup = this.b;
        return hl.L(8.0f) + measuredHeight + (viewGroup != null ? viewGroup.getPaddingTop() : 0) + hl.n;
    }

    @Override // fn7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        hy3 hy3Var;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        if (i != jn7.x0) {
            return;
        }
        int i3 = 0;
        while (true) {
            iw iwVar = this.q1;
            if (i3 >= iwVar.getChildCount()) {
                J0();
                return;
            }
            View childAt = iwVar.getChildAt(i3);
            if ((childAt instanceof hy3) && (tL_messages_stickerSet = (hy3Var = (hy3) childAt).r) != null && tL_messages_stickerSet.set != null) {
                hy3Var.a(ls6.d0(this.a).D0(hy3Var.r.set.id, true), true);
            }
            i3++;
        }
    }

    @Override // nx0, android.app.Dialog, android.content.DialogInterface, ag0
    public void dismiss() {
        dy3 dy3Var = this.p1;
        if (dy3Var != null && dy3Var.x) {
            dy3Var.x = false;
            dy3Var.invalidate();
        }
        super.dismiss();
        xx3 xx3Var = this.o1;
        if (xx3Var != null) {
            jn7.f(xx3Var.d).n(xx3Var, jn7.B0);
        }
        jn7.e().k(jn7.k1, 4);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        jn7.f(this.a).b(this, jn7.x0);
    }

    @Override // nx0, android.app.Dialog
    public final void onBackPressed() {
        if (rw2.e().E) {
            rw2.e().c();
        } else {
            super.onBackPressed();
        }
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        jn7.f(this.a).n(this, jn7.x0);
    }

    @Override // nx0
    public final void p0() {
        Boolean bool;
        try {
            super.p0();
            di2 di2Var = this.z1;
            if (di2Var != null) {
                di2Var.b(aob.v0(aob.Fi, this.J0));
            }
            dy3 dy3Var = this.p1;
            if (dy3Var != null && (bool = dy3Var.c) != null) {
                K0(bool.booleanValue());
            }
            ViewGroup viewGroup = this.b;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    @Override // nx0, android.app.Dialog
    public final void show() {
        TLRPC.StickerSet stickerSet;
        super.show();
        by3 by3Var = new by3(this);
        this.r1 = by3Var;
        this.q1.setAdapter(by3Var);
        byte b = 0;
        jn7.e().k(jn7.j1, 4);
        xx3 xx3Var = this.o1;
        if (!xx3Var.e) {
            xx3Var.e = true;
            ly3 ly3Var = xx3Var.f;
            int i = xx3Var.d;
            xx3Var.b = new ArrayList(xx3Var.a.size());
            xx3Var.c = new ArrayList[xx3Var.a.size()];
            jn7.f(i).b(xx3Var, 65);
            boolean[] zArr = new boolean[1];
            int i2 = 0;
            while (true) {
                if (i2 < xx3Var.c.length) {
                    TLRPC.TL_messages_stickerSet m0 = ls6.d0(i).m0((TLRPC.InputStickerSet) xx3Var.a.get(i2), null, false, false, new rx1((Object) xx3Var, (Object) zArr, (byte) 16));
                    if (xx3Var.c.length != 1 || m0 == null || (stickerSet = m0.set) == null || stickerSet.emojis) {
                        xx3Var.b.add(m0);
                        xx3Var.a(i2, m0);
                        i2++;
                    } else {
                        hl.c3(new iy3(xx3Var, b));
                        Context context = ly3Var.getContext();
                        e eVar = ly3Var.m1;
                        TLRPC.InputStickerSet inputStickerSet = (TLRPC.InputStickerSet) xx3Var.a.get(i2);
                        e eVar2 = ly3Var.m1;
                        new s4b(context, eVar, inputStickerSet, null, eVar2 instanceof zu1 ? ((zu1) eVar2).a0 : null, ly3Var.J0).show();
                    }
                } else {
                    ly3 ly3Var2 = xx3Var.h;
                    ly3Var2.J0();
                    iw iwVar = ly3Var2.q1;
                    if (iwVar != null && iwVar.getAdapter() != null) {
                        iwVar.getAdapter().f();
                    }
                }
            }
        }
        J0();
        e eVar3 = this.m1;
        ls6.d0(eVar3 == null ? yac.t0 : eVar3.getCurrentAccount()).D(5);
    }

    public void H0() {
    }

    public void G0(boolean z) {
    }
}
