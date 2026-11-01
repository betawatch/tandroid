package org.telegram.ui;

import android.content.Context;
import android.os.Build;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.beta.R;
import org.telegram.ui.ActionBar.ActionBarLayout;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class ab0 extends org.telegram.ui.ActionBar.k2 {
    public FrameLayout a;
    public org.telegram.ui.Components.uk0 b;
    public s4.a0 c;
    public org.telegram.ui.Components.dj0 d;
    public org.telegram.ui.Components.wb e;
    public int f;
    public final s3 h;
    public final boolean[] n;
    public final ArrayList r;
    public final ArrayList s;

    public ab0() {
        super(null);
        this.h = new s3(this, 10);
        this.n = new boolean[3];
        this.r = new ArrayList();
        this.s = new ArrayList();
    }

    public final int Z(int i10) {
        if (i10 == 3) {
            return 0;
        }
        if (i10 == 28700) {
            return 1;
        }
        return i10 == this.f ? 2 : -1;
    }

    public final void a0(int i10) {
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.s;
            if (i11 >= arrayList.size()) {
                return;
            }
            if (((va0) arrayList.get(i11)).e == i10) {
                this.b.e1(new i2.q(this, i11, 14), 700, true);
                return;
            }
            i11++;
        }
    }

    public final void b0(int i10) {
        int Z = Z(i10);
        if (Z == -1) {
            return;
        }
        this.n[Z] = true;
        d0();
        c0();
    }

    public final void c0() {
        ArrayList arrayList = this.r;
        arrayList.clear();
        ArrayList arrayList2 = this.s;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        int i10 = Build.VERSION.SDK_INT;
        arrayList2.add(new va0(1, 0, null, 0, 0));
        arrayList2.add(new va0(2, 0, org.telegram.messenger.tc.c() <= 0 ? org.telegram.messenger.dd.L0(2131748881, null) : org.telegram.messenger.tc.c() >= 100 ? org.telegram.messenger.dd.L0(2131748880, null) : org.telegram.messenger.dd.a0(null, null, 2131748882, String.format("%d%%", Integer.valueOf(org.telegram.messenger.tc.c()))), 0, 0));
        arrayList2.add(new va0(0, 0, org.telegram.messenger.dd.L0(2131748858, null), 0, 0));
        arrayList2.add(va0.c(R.drawable.msg2_sticker, 3, org.telegram.messenger.dd.L0(2131748860, null)));
        boolean[] zArr = this.n;
        if (zArr[0]) {
            arrayList2.add(va0.b(1, org.telegram.messenger.dd.L0(2131748872, null)));
            arrayList2.add(va0.b(2, org.telegram.messenger.dd.L0(2131748874, null)));
        }
        arrayList2.add(va0.c(R.drawable.msg2_smile_status, 28700, org.telegram.messenger.dd.L0(2131748865, null)));
        if (zArr[1]) {
            arrayList2.add(va0.b(16388, org.telegram.messenger.dd.L0(2131748872, null)));
            arrayList2.add(va0.b(8200, org.telegram.messenger.dd.L0(2131748871, null)));
            arrayList2.add(va0.b(4112, org.telegram.messenger.dd.L0(2131748874, null)));
        }
        arrayList2.add(va0.c(R.drawable.msg2_ask_question, this.f, org.telegram.messenger.dd.L0(2131748866, null)));
        if (zArr[2]) {
            arrayList2.add(va0.b(32, org.telegram.messenger.dd.M0("LiteOptionsBackground")));
            if (!org.telegram.messenger.i0.Q1()) {
                arrayList2.add(va0.b(64, org.telegram.messenger.dd.M0("LiteOptionsTopics")));
            }
            arrayList2.add(va0.b(128, org.telegram.messenger.dd.M0("LiteOptionsSpoiler")));
            if (org.telegram.messenger.uz.o() < 1) {
                boolean z10 = org.telegram.messenger.v2.a;
            } else {
                arrayList2.add(va0.b(256, org.telegram.messenger.dd.M0("LiteOptionsBlur2")));
            }
            if (i10 >= 33) {
                if (org.telegram.messenger.uz.o() < 1) {
                    boolean z11 = org.telegram.messenger.v2.a;
                } else {
                    arrayList2.add(va0.b(262144, org.telegram.messenger.dd.M0("LiteOptionsLiquidGlass")));
                }
            }
            arrayList2.add(va0.b(32768, org.telegram.messenger.dd.M0("LiteOptionsScale")));
            if (org.telegram.ui.Components.i01.c()) {
                arrayList2.add(va0.b(65536, org.telegram.messenger.dd.M0("LiteOptionsThanos")));
            }
        }
        arrayList2.add(va0.c(R.drawable.msg2_call_earpiece, 512, org.telegram.messenger.dd.L0(2131748867, null)));
        arrayList2.add(va0.c(R.drawable.msg2_videocall, 1024, org.telegram.messenger.dd.L0(2131748870, null)));
        arrayList2.add(va0.c(R.drawable.msg2_gif, 2048, org.telegram.messenger.dd.L0(2131748873, null)));
        arrayList2.add(va0.c(R.drawable.photo_star, 131072, org.telegram.messenger.dd.L0(2131748863, null)));
        arrayList2.add(new va0(2, 0, "", 0, 0));
        arrayList2.add(new va0(5, 0, org.telegram.messenger.dd.L0(2131748856, null), 0, 1));
        arrayList2.add(new va0(2, 0, org.telegram.messenger.dd.M0("LiteSmoothTransitionsInfo"), 0, 0));
        this.d.E(arrayList, arrayList2);
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.simpleActionBar.setTitle(org.telegram.messenger.dd.L0(2131747081, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new s60(this, 3));
        org.telegram.ui.ActionBar.z4 z4Var = this.parentLayout;
        if (z4Var != null && ((ActionBarLayout) z4Var).T0) {
            this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_close);
        }
        this.a = new FrameLayout(context);
        org.telegram.ui.Components.uk0 uk0Var = new org.telegram.ui.Components.uk0(context, null);
        this.b = uk0Var;
        uk0Var.r1();
        org.telegram.ui.Components.uk0 uk0Var2 = this.b;
        s4.a0 a0Var = new s4.a0();
        this.c = a0Var;
        uk0Var2.setLayoutManager(a0Var);
        org.telegram.ui.Components.uk0 uk0Var3 = this.b;
        org.telegram.ui.Components.dj0 dj0Var = new org.telegram.ui.Components.dj0(this, 2);
        this.d = dj0Var;
        uk0Var3.setAdapter(dj0Var);
        this.b.setSectionsDrawBackground(true);
        s4.j jVar = new s4.j();
        jVar.n(350L);
        jVar.o(org.telegram.ui.Components.gr.h);
        jVar.C = false;
        jVar.m = false;
        this.b.setItemAnimator(jVar);
        this.a.addView(this.b, w7.b6.c(-1.0f, -1));
        this.b.setOnItemClickListener(new st(this, 17));
        this.fragmentView = this.a;
        this.f = org.telegram.messenger.i0.Q1() ? 360864 : 360928;
        c0();
        return this.fragmentView;
    }

    public final void d0() {
        if (this.b == null) {
            return;
        }
        for (int i10 = 0; i10 < this.b.getChildCount(); i10++) {
            View childAt = this.b.getChildAt(i10);
            if (childAt != null) {
                this.b.getClass();
                int R = RecyclerView.R(childAt);
                if (R >= 0) {
                    ArrayList arrayList = this.s;
                    if (R < arrayList.size()) {
                        va0 va0Var = (va0) arrayList.get(R);
                        int i11 = va0Var.a;
                        if (i11 == 3 || i11 == 4) {
                            za0 za0Var = (za0) childAt;
                            ImageView imageView = za0Var.e;
                            ab0 ab0Var = za0Var.D;
                            int i12 = va0Var.e;
                            if (i11 == 3) {
                                boolean z10 = Integer.bitCount(i12) > 1;
                                za0Var.w = z10;
                                if (z10) {
                                    za0Var.c(va0Var, true);
                                    int Z = ab0Var.Z(i12);
                                    imageView.clearAnimation();
                                    org.telegram.messenger.a30.m(imageView.animate().rotation((Z < 0 || !ab0Var.n[Z]) ? 0.0f : 180.0f), org.telegram.ui.Components.gr.h, 240L);
                                }
                                za0Var.f.c(org.telegram.messenger.tc.e(i12), true);
                            } else {
                                za0Var.h.a(org.telegram.messenger.tc.e(i12), true);
                            }
                            za0Var.b(org.telegram.messenger.tc.f(), true);
                        } else if (i11 == 1) {
                            ((ya0) childAt).a();
                        }
                    }
                }
            }
        }
        if (this.e == null || org.telegram.messenger.tc.f()) {
            return;
        }
        this.e.b();
        this.e = null;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final org.telegram.ui.Components.uk0 getListViewForSimpleGlass() {
        return this.b;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onBecomeFullyHidden() {
        super.onBecomeFullyHidden();
        HashSet hashSet = org.telegram.messenger.tc.n;
        if (hashSet != null) {
            hashSet.remove(this.h);
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        org.telegram.messenger.tc.a(this.h);
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        org.telegram.messenger.tc.k();
        org.telegram.ui.Components.f5.t();
        org.telegram.ui.ActionBar.t6.u1(true);
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean useSimpleActionBar() {
        return true;
    }
}
