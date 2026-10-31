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
import org.telegram.messenger.cd;
import org.telegram.messenger.ui;
import org.telegram.messenger.z20;
import org.telegram.ui.Components.tu0;
import org.telegram.ui.Components.uu0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class ja extends org.telegram.ui.ActionBar.k2 {
    public final String[] a;
    public final int[] b;
    public final l c;
    public final ArrayList d;
    public ScrollView e;
    public ImageView f;
    public vh.d h;
    public int n;
    public int r;
    public int s;
    public int w;
    public int x;
    public boolean y;

    public ja(ArrayList arrayList, l lVar) {
        super(null);
        this.b = new int[3];
        this.d = new ArrayList();
        int i10 = 0;
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        this.a = strArr;
        if (strArr.length != 12 && strArr.length != 24) {
            throw new IllegalArgumentException("Expected a 12- or 24-word recovery phrase");
        }
        this.c = lVar;
        ArrayList arrayList2 = new ArrayList();
        for (int i11 = 0; i11 < this.a.length; i11 = c3.i0.j(i11, i11, 1, arrayList2)) {
        }
        Collections.shuffle(arrayList2);
        while (true) {
            int[] iArr = this.b;
            if (i10 >= iArr.length) {
                Arrays.sort(iArr);
                return;
            } else {
                iArr[i10] = ((Integer) arrayList2.get(i10)).intValue();
                i10++;
            }
        }
    }

    public final void Y() {
        if (this.h == null) {
            return;
        }
        ArrayList arrayList = this.d;
        boolean z10 = false;
        boolean z11 = arrayList.size() == this.b.length;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            z11 &= !((ra) obj).getWord().isEmpty();
        }
        this.h.setVisibility(z11 ? 0 : 4);
        vh.d dVar = this.h;
        if (z11 && !this.y) {
            z10 = true;
        }
        dVar.setEnabled(z10);
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final View createView(Context context) {
        final int i10 = 0;
        this.actionBar.setAddToContainer(false);
        this.actionBar.setOccupyStatusBar(false);
        uu0 uu0Var = new uu0(context, null);
        uu0Var.setDelegate(new tu0() { // from class: org.telegram.ui.Wallet.ha
            @Override // org.telegram.ui.Components.tu0
            public final void K(int i11, boolean z10) {
                ja jaVar = ja.this;
                jaVar.getClass();
                if (i11 <= org.telegram.messenger.i0.L(20.0f)) {
                    i11 = 0;
                }
                jaVar.n = i11;
                jaVar.onInsets(jaVar.r, jaVar.s, jaVar.w, jaVar.x);
            }
        });
        org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.d6, uu0Var, this.resourceProvider);
        this.fragmentView = uu0Var;
        ScrollView scrollView = new ScrollView(context);
        this.e = scrollView;
        final int i11 = 1;
        scrollView.setFillViewport(true);
        this.e.setVerticalScrollBarEnabled(false);
        this.e.setClipToPadding(false);
        this.e.setPadding(0, org.telegram.messenger.i0.L(96.0f), 0, 0);
        uu0Var.addView(this.e, w7.b6.c(-1.0f, -1));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(org.telegram.messenger.i0.L(36.0f), 0, org.telegram.messenger.i0.L(36.0f), org.telegram.messenger.i0.L(24.0f));
        linearLayout.setClipToPadding(false);
        this.e.addView(linearLayout, new FrameLayout.LayoutParams(-1, -2));
        ImageView imageView = new ImageView(context);
        this.f = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        ImageView imageView2 = this.f;
        int i12 = org.telegram.ui.ActionBar.t6.G6;
        org.telegram.ui.ActionBar.a7.t(imageView2, i12, this.resourceProvider, PorterDuff.Mode.SRC_IN);
        this.f.setImageResource(R.drawable.ic_ab_close);
        ImageView imageView3 = this.f;
        int i13 = org.telegram.ui.ActionBar.t6.i6;
        org.telegram.ui.ActionBar.a7.R(imageView3, org.telegram.ui.ActionBar.t6.h0(org.telegram.ui.ActionBar.t6.w0(i13, this.resourceProvider), 3, -1), null, org.telegram.ui.ActionBar.a7.N(i13), this.resourceProvider);
        this.f.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Wallet.ia
            public final /* synthetic */ ja b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i14 = i10;
                ja jaVar = this.b;
                switch (i14) {
                    case 0:
                        jaVar.finishFragment();
                        break;
                    default:
                        int[] iArr = jaVar.b;
                        ArrayList arrayList = jaVar.d;
                        if (!jaVar.y && arrayList.size() == iArr.length) {
                            boolean z10 = org.telegram.messenger.v2.a;
                            int size = arrayList.size();
                            int i15 = 0;
                            while (i15 < size) {
                                Object obj = arrayList.get(i15);
                                i15++;
                                if (((ra) obj).getWord().isEmpty()) {
                                    break;
                                }
                            }
                            boolean z11 = true;
                            for (int i16 = 0; i16 < iArr.length; i16++) {
                                ra raVar = (ra) arrayList.get(i16);
                                boolean equalsIgnoreCase = jaVar.a[iArr[i16]].equalsIgnoreCase(raVar.getWord());
                                if (!equalsIgnoreCase && raVar.w) {
                                    org.telegram.messenger.i0.G3(raVar);
                                }
                                raVar.setError(!equalsIgnoreCase);
                                z11 &= equalsIgnoreCase;
                            }
                            if (z11) {
                                jaVar.y = true;
                                jaVar.Y();
                                org.telegram.messenger.i0.v1(jaVar.fragmentView);
                                l lVar = jaVar.c;
                                if (lVar != null) {
                                    lVar.run();
                                    break;
                                }
                            }
                        }
                        break;
                }
            }
        });
        uu0Var.addView(this.f, w7.b6.d(48, 48.0f, 51, 4.0f, 12.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.g9 g9Var = new org.telegram.ui.Components.g9(context);
        g9Var.setAspectFit(true);
        g9Var.getImageReceiver().d = org.telegram.messenger.i0.t0();
        ui.b0(org.telegram.messenger.i0.t0()).c2(g9Var, "RestrictedEmoji", "👨\u200d🏫", "100_100");
        g9Var.getImageReceiver().X(1);
        linearLayout.addView(g9Var, w7.b6.t(100, 100, 1, 0, 0, 0, 12));
        TextView textView = new TextView(context);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(org.telegram.messenger.i0.o());
        textView.setGravity(1);
        z20.p(textView, i12, this.resourceProvider, null, 2131743031);
        TextView f7 = z20.f(linearLayout, textView, w7.b6.t(-1, -2, 1, 32, 0, 32, 10), context);
        f7.setTextSize(1, 14.0f);
        f7.setGravity(1);
        org.telegram.ui.ActionBar.a7.V(f7, org.telegram.ui.ActionBar.t6.z6, this.resourceProvider);
        int[] iArr = this.b;
        org.telegram.messenger.m5.q(null, null, 2131743030, new Object[]{Integer.valueOf(iArr[0] + 1), Integer.valueOf(iArr[1] + 1), Integer.valueOf(iArr[2] + 1)}, f7);
        linearLayout.addView(f7, w7.b6.t(-1, -2, 1, 32, 0, 32, 8));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        linearLayout2.setGravity(1);
        linearLayout2.setClipChildren(false);
        linearLayout.addView(linearLayout2, w7.b6.t(-1, -2, 1, 0, 16, 0, 0));
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.d;
        int size = arrayList2.size();
        int i14 = 0;
        while (i14 < size) {
            Object obj = arrayList2.get(i14);
            i14++;
            arrayList.add(((ra) obj).getWord());
        }
        arrayList2.clear();
        int i15 = 0;
        while (i15 < iArr.length) {
            ra raVar = new ra(iArr[i15], context, this.resourceProvider, false);
            if (i15 < arrayList.size()) {
                raVar.setText((String) arrayList.get(i15));
            }
            raVar.setOnTextChangedListener(new l(this, 14));
            raVar.setOnNextListener(new x0(this, i15, raVar, 5));
            linearLayout2.addView(raVar, w7.b6.t(-1, 50, 1, 0, i15 == 0 ? 0 : 12, 0, 0));
            arrayList2.add(raVar);
            i15++;
        }
        linearLayout.addView(new View(context), w7.b6.l(1.0f, -1, 0));
        vh.d dVar = new vh.d(context, this.resourceProvider, true);
        this.h = dVar;
        dVar.f();
        this.h.setText(cd.L0(2131743180, null));
        this.h.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Wallet.ia
            public final /* synthetic */ ja b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i142 = i11;
                ja jaVar = this.b;
                switch (i142) {
                    case 0:
                        jaVar.finishFragment();
                        break;
                    default:
                        int[] iArr2 = jaVar.b;
                        ArrayList arrayList3 = jaVar.d;
                        if (!jaVar.y && arrayList3.size() == iArr2.length) {
                            boolean z10 = org.telegram.messenger.v2.a;
                            int size2 = arrayList3.size();
                            int i152 = 0;
                            while (i152 < size2) {
                                Object obj2 = arrayList3.get(i152);
                                i152++;
                                if (((ra) obj2).getWord().isEmpty()) {
                                    break;
                                }
                            }
                            boolean z11 = true;
                            for (int i16 = 0; i16 < iArr2.length; i16++) {
                                ra raVar2 = (ra) arrayList3.get(i16);
                                boolean equalsIgnoreCase = jaVar.a[iArr2[i16]].equalsIgnoreCase(raVar2.getWord());
                                if (!equalsIgnoreCase && raVar2.w) {
                                    org.telegram.messenger.i0.G3(raVar2);
                                }
                                raVar2.setError(!equalsIgnoreCase);
                                z11 &= equalsIgnoreCase;
                            }
                            if (z11) {
                                jaVar.y = true;
                                jaVar.Y();
                                org.telegram.messenger.i0.v1(jaVar.fragmentView);
                                l lVar = jaVar.c;
                                if (lVar != null) {
                                    lVar.run();
                                    break;
                                }
                            }
                        }
                        break;
                }
            }
        });
        linearLayout.addView(this.h, w7.b6.t(-1, 48, 1, 0, 24, 0, 0));
        Y();
        return this.fragmentView;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.r = i10;
        this.s = i11;
        this.w = i12;
        this.x = i13;
        ScrollView scrollView = this.e;
        if (scrollView != null) {
            scrollView.setPadding(i10, org.telegram.messenger.i0.L(96.0f) + i11, i12, i13 + this.n);
        }
        ImageView imageView = this.f;
        if (imageView != null) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) imageView.getLayoutParams();
            layoutParams.leftMargin = org.telegram.messenger.i0.L(4.0f) + i10;
            layoutParams.topMargin = org.telegram.messenger.i0.L(12.0f) + i11;
            this.f.setLayoutParams(layoutParams);
        }
    }
}
