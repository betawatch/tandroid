package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.PorterDuff;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.gd;
import org.telegram.messenger.n10;
import org.telegram.messenger.ri;
import org.telegram.ui.Components.au0;
import org.telegram.ui.Components.h01;
import org.telegram.ui.Components.zt0;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes4.dex */
public final class va extends org.telegram.ui.ActionBar.h2 {
    public final String[] a;
    public final int[] b;
    public final m c;
    public final ArrayList d;
    public ScrollView e;
    public ImageView f;
    public hi.d h;
    public int n;
    public int r;
    public int s;
    public int w;
    public int x;
    public boolean y;

    public va(ArrayList arrayList, m mVar) {
        super(null);
        this.b = new int[3];
        this.d = new ArrayList();
        int i7 = 0;
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        this.a = strArr;
        if (strArr.length != 12 && strArr.length != 24) {
            throw new IllegalArgumentException("Expected a 12- or 24-word recovery phrase");
        }
        this.c = mVar;
        ArrayList arrayList2 = new ArrayList();
        for (int i10 = 0; i10 < this.a.length; i10 = com.google.android.gms.internal.vision.e2.f(i10, i10, 1, arrayList2)) {
        }
        Collections.shuffle(arrayList2);
        while (true) {
            int[] iArr = this.b;
            if (i7 >= iArr.length) {
                Arrays.sort(iArr);
                return;
            } else {
                iArr[i7] = ((Integer) arrayList2.get(i7)).intValue();
                i7++;
            }
        }
    }

    public final void Z() {
        if (this.h == null) {
            return;
        }
        ArrayList arrayList = this.d;
        boolean z10 = false;
        boolean z11 = arrayList.size() == this.b.length;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            z11 &= !((db) obj).getWord().isEmpty();
        }
        this.h.setVisibility(z11 ? 0 : 4);
        hi.d dVar = this.h;
        if (z11 && !this.y) {
            z10 = true;
        }
        dVar.setEnabled(z10);
    }

    @Override // org.telegram.ui.ActionBar.h2
    public final View createView(Context context) {
        final int i7 = 0;
        this.actionBar.setAddToContainer(false);
        this.actionBar.setOccupyStatusBar(false);
        au0 au0Var = new au0(context, null);
        au0Var.setDelegate(new zt0() { // from class: org.telegram.ui.Wallet.ta
            @Override // org.telegram.ui.Components.zt0
            public final void L(int i10, boolean z10) {
                va vaVar = va.this;
                vaVar.getClass();
                if (i10 <= org.telegram.messenger.g0.L(20.0f)) {
                    i10 = 0;
                }
                vaVar.n = i10;
                vaVar.onInsets(vaVar.r, vaVar.s, vaVar.w, vaVar.x);
            }
        });
        org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.d6, au0Var, this.resourceProvider);
        this.fragmentView = au0Var;
        ScrollView scrollView = new ScrollView(context);
        this.e = scrollView;
        final int i10 = 1;
        scrollView.setFillViewport(true);
        this.e.setVerticalScrollBarEnabled(false);
        this.e.setClipToPadding(false);
        this.e.setPadding(0, org.telegram.messenger.g0.L(96.0f), 0, 0);
        au0Var.addView(this.e, c8.ma.c(-1.0f, -1));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(org.telegram.messenger.g0.L(36.0f), 0, org.telegram.messenger.g0.L(36.0f), org.telegram.messenger.g0.L(24.0f));
        linearLayout.setClipToPadding(false);
        this.e.addView(linearLayout, new FrameLayout.LayoutParams(-1, -2));
        ImageView imageView = new ImageView(context);
        this.f = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        ImageView imageView2 = this.f;
        int i11 = org.telegram.ui.ActionBar.n6.G6;
        org.telegram.ui.ActionBar.u6.s(imageView2, i11, this.resourceProvider, PorterDuff.Mode.SRC_IN);
        this.f.setImageResource(R.drawable.ic_ab_close);
        ImageView imageView3 = this.f;
        int i12 = org.telegram.ui.ActionBar.n6.i6;
        org.telegram.ui.ActionBar.u6.Q(imageView3, org.telegram.ui.ActionBar.n6.h0(org.telegram.ui.ActionBar.n6.w0(i12, this.resourceProvider), 3, -1), null, org.telegram.ui.ActionBar.u6.M(i12), this.resourceProvider);
        this.f.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Wallet.ua
            public final /* synthetic */ va b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i13 = i7;
                va vaVar = this.b;
                switch (i13) {
                    case 0:
                        vaVar.finishFragment();
                        break;
                    default:
                        int[] iArr = vaVar.b;
                        ArrayList arrayList = vaVar.d;
                        if (!vaVar.y && arrayList.size() == iArr.length) {
                            boolean z10 = org.telegram.messenger.s2.a;
                            int size = arrayList.size();
                            int i14 = 0;
                            while (i14 < size) {
                                Object obj = arrayList.get(i14);
                                i14++;
                                if (((db) obj).getWord().isEmpty()) {
                                    break;
                                }
                            }
                            boolean z11 = true;
                            for (int i15 = 0; i15 < iArr.length; i15++) {
                                db dbVar = (db) arrayList.get(i15);
                                boolean equalsIgnoreCase = vaVar.a[iArr[i15]].equalsIgnoreCase(dbVar.getWord());
                                if (!equalsIgnoreCase && dbVar.w) {
                                    org.telegram.messenger.g0.F3(dbVar);
                                }
                                dbVar.setError(!equalsIgnoreCase);
                                z11 &= equalsIgnoreCase;
                            }
                            if (z11) {
                                vaVar.y = true;
                                vaVar.Z();
                                org.telegram.messenger.g0.v1(vaVar.fragmentView);
                                m mVar = vaVar.c;
                                if (mVar != null) {
                                    mVar.run();
                                    break;
                                }
                            }
                        }
                        break;
                }
            }
        });
        au0Var.addView(this.f, c8.ma.d(48, 48.0f, 51, 4.0f, 12.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.q9 q9Var = new org.telegram.ui.Components.q9(context);
        q9Var.setAspectFit(true);
        q9Var.getImageReceiver().d = org.telegram.messenger.g0.t0();
        ri.d0(org.telegram.messenger.g0.t0()).h2(q9Var, "RestrictedEmoji", "👨\u200d🏫", "100_100");
        q9Var.getImageReceiver().X(1);
        linearLayout.addView(q9Var, c8.ma.t(100, 100, 1, 0, 0, 0, 12));
        TextView textView = new TextView(context);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setGravity(1);
        n10.r(textView, i11, this.resourceProvider, null, 2131742747);
        TextView f10 = n10.f(linearLayout, textView, c8.ma.t(-1, -2, 1, 32, 0, 32, 10), context);
        f10.setTextSize(1, 14.0f);
        f10.setGravity(1);
        org.telegram.ui.ActionBar.u6.U(f10, org.telegram.ui.ActionBar.n6.z6, this.resourceProvider);
        int[] iArr = this.b;
        org.telegram.messenger.f3.q(null, null, 2131742746, new Object[]{Integer.valueOf(iArr[0] + 1), Integer.valueOf(iArr[1] + 1), Integer.valueOf(iArr[2] + 1)}, f10);
        linearLayout.addView(f10, c8.ma.t(-1, -2, 1, 32, 0, 32, 8));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        linearLayout2.setGravity(1);
        linearLayout2.setClipChildren(false);
        linearLayout.addView(linearLayout2, c8.ma.t(-1, -2, 1, 0, 16, 0, 0));
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.d;
        int size = arrayList2.size();
        int i13 = 0;
        while (i13 < size) {
            Object obj = arrayList2.get(i13);
            i13++;
            arrayList.add(((db) obj).getWord());
        }
        arrayList2.clear();
        int i14 = 0;
        while (i14 < iArr.length) {
            db dbVar = new db(iArr[i14], context, this.resourceProvider, false);
            if (i14 < arrayList.size()) {
                dbVar.setText((String) arrayList.get(i14));
            }
            dbVar.setOnTextChangedListener(new m(this, 14));
            dbVar.setOnNextListener(new h01(this, i14, dbVar, 22));
            linearLayout2.addView(dbVar, c8.ma.t(-1, 50, 1, 0, i14 == 0 ? 0 : 12, 0, 0));
            arrayList2.add(dbVar);
            i14++;
        }
        linearLayout.addView(new View(context), c8.ma.l(1.0f, -1, 0));
        hi.d dVar = new hi.d(context, this.resourceProvider, true);
        this.h = dVar;
        dVar.f();
        this.h.setText(gd.M0(2131742916, null));
        this.h.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Wallet.ua
            public final /* synthetic */ va b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i132 = i10;
                va vaVar = this.b;
                switch (i132) {
                    case 0:
                        vaVar.finishFragment();
                        break;
                    default:
                        int[] iArr2 = vaVar.b;
                        ArrayList arrayList3 = vaVar.d;
                        if (!vaVar.y && arrayList3.size() == iArr2.length) {
                            boolean z10 = org.telegram.messenger.s2.a;
                            int size2 = arrayList3.size();
                            int i142 = 0;
                            while (i142 < size2) {
                                Object obj2 = arrayList3.get(i142);
                                i142++;
                                if (((db) obj2).getWord().isEmpty()) {
                                    break;
                                }
                            }
                            boolean z11 = true;
                            for (int i15 = 0; i15 < iArr2.length; i15++) {
                                db dbVar2 = (db) arrayList3.get(i15);
                                boolean equalsIgnoreCase = vaVar.a[iArr2[i15]].equalsIgnoreCase(dbVar2.getWord());
                                if (!equalsIgnoreCase && dbVar2.w) {
                                    org.telegram.messenger.g0.F3(dbVar2);
                                }
                                dbVar2.setError(!equalsIgnoreCase);
                                z11 &= equalsIgnoreCase;
                            }
                            if (z11) {
                                vaVar.y = true;
                                vaVar.Z();
                                org.telegram.messenger.g0.v1(vaVar.fragmentView);
                                m mVar = vaVar.c;
                                if (mVar != null) {
                                    mVar.run();
                                    break;
                                }
                            }
                        }
                        break;
                }
            }
        });
        linearLayout.addView(this.h, c8.ma.t(-1, 48, 1, 0, 24, 0, 0));
        Z();
        return this.fragmentView;
    }

    @Override // org.telegram.ui.ActionBar.h2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.h2
    public final void onInsets(int i7, int i10, int i11, int i12) {
        this.r = i7;
        this.s = i10;
        this.w = i11;
        this.x = i12;
        ScrollView scrollView = this.e;
        if (scrollView != null) {
            scrollView.setPadding(i7, org.telegram.messenger.g0.L(96.0f) + i10, i11, i12 + this.n);
        }
        ImageView imageView = this.f;
        if (imageView != null) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) imageView.getLayoutParams();
            layoutParams.leftMargin = org.telegram.messenger.g0.L(4.0f) + i7;
            layoutParams.topMargin = org.telegram.messenger.g0.L(12.0f) + i10;
            this.f.setLayoutParams(layoutParams);
        }
    }
}
