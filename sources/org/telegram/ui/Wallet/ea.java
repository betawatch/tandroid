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
import org.telegram.messenger.id;
import org.telegram.messenger.ui;
import org.telegram.ui.Components.qt0;
import org.telegram.ui.Components.rt0;
import org.telegram.ui.d10;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes4.dex */
public final class ea extends org.telegram.ui.ActionBar.f2 {
    public final String[] a;
    public final int[] b;
    public final l c;
    public final ArrayList d;
    public ScrollView e;
    public ImageView f;
    public fi.d h;
    public int n;
    public int r;
    public int s;
    public int w;
    public int x;
    public boolean y;

    public ea(ArrayList arrayList, l lVar) {
        super(null);
        this.b = new int[3];
        this.d = new ArrayList();
        int i7 = 0;
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        this.a = strArr;
        if (strArr.length != 12 && strArr.length != 24) {
            throw new IllegalArgumentException("Expected a 12- or 24-word recovery phrase");
        }
        this.c = lVar;
        ArrayList arrayList2 = new ArrayList();
        for (int i10 = 0; i10 < this.a.length; i10 = com.google.android.recaptcha.internal.a.f(i10, i10, 1, arrayList2)) {
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
        boolean z9 = false;
        boolean z10 = arrayList.size() == this.b.length;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            z10 &= !((na) obj).getWord().isEmpty();
        }
        this.h.setVisibility(z10 ? 0 : 4);
        fi.d dVar = this.h;
        if (z10 && !this.y) {
            z9 = true;
        }
        dVar.setEnabled(z9);
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final View createView(Context context) {
        final int i7 = 0;
        this.actionBar.setAddToContainer(false);
        this.actionBar.setOccupyStatusBar(false);
        rt0 rt0Var = new rt0(context, null);
        rt0Var.setDelegate(new qt0() { // from class: org.telegram.ui.Wallet.ca
            @Override // org.telegram.ui.Components.qt0
            public final void K(int i10, boolean z9) {
                ea eaVar = ea.this;
                eaVar.getClass();
                if (i10 <= org.telegram.messenger.g0.L(20.0f)) {
                    i10 = 0;
                }
                eaVar.n = i10;
                eaVar.onInsets(eaVar.r, eaVar.s, eaVar.w, eaVar.x);
            }
        });
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d6, rt0Var, this.resourceProvider);
        this.fragmentView = rt0Var;
        ScrollView scrollView = new ScrollView(context);
        this.e = scrollView;
        final int i10 = 1;
        scrollView.setFillViewport(true);
        this.e.setVerticalScrollBarEnabled(false);
        this.e.setClipToPadding(false);
        this.e.setPadding(0, org.telegram.messenger.g0.L(96.0f), 0, 0);
        rt0Var.addView(this.e, c8.ha.c(-1.0f, -1));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(org.telegram.messenger.g0.L(36.0f), 0, org.telegram.messenger.g0.L(36.0f), org.telegram.messenger.g0.L(24.0f));
        linearLayout.setClipToPadding(false);
        this.e.addView(linearLayout, new FrameLayout.LayoutParams(-1, -2));
        ImageView imageView = new ImageView(context);
        this.f = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        ImageView imageView2 = this.f;
        int i11 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.ui.ActionBar.r6.t(imageView2, i11, this.resourceProvider, PorterDuff.Mode.SRC_IN);
        this.f.setImageResource(R.drawable.ic_ab_close);
        ImageView imageView3 = this.f;
        int i12 = org.telegram.ui.ActionBar.k6.i6;
        org.telegram.ui.ActionBar.r6.R(imageView3, org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.w0(i12, this.resourceProvider), 3, -1), null, org.telegram.ui.ActionBar.r6.N(i12), this.resourceProvider);
        this.f.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Wallet.da
            public final /* synthetic */ ea b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i13 = i7;
                ea eaVar = this.b;
                switch (i13) {
                    case 0:
                        eaVar.finishFragment();
                        break;
                    default:
                        int[] iArr = eaVar.b;
                        ArrayList arrayList = eaVar.d;
                        if (!eaVar.y && arrayList.size() == iArr.length) {
                            boolean z9 = org.telegram.messenger.r2.a;
                            int size = arrayList.size();
                            int i14 = 0;
                            while (i14 < size) {
                                Object obj = arrayList.get(i14);
                                i14++;
                                if (((na) obj).getWord().isEmpty()) {
                                    break;
                                }
                            }
                            boolean z10 = true;
                            for (int i15 = 0; i15 < iArr.length; i15++) {
                                na naVar = (na) arrayList.get(i15);
                                boolean equalsIgnoreCase = eaVar.a[iArr[i15]].equalsIgnoreCase(naVar.getWord());
                                if (!equalsIgnoreCase && naVar.w) {
                                    org.telegram.messenger.g0.H3(naVar);
                                }
                                naVar.setError(!equalsIgnoreCase);
                                z10 &= equalsIgnoreCase;
                            }
                            if (z10) {
                                eaVar.y = true;
                                eaVar.Z();
                                org.telegram.messenger.g0.v1(eaVar.fragmentView);
                                l lVar = eaVar.c;
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
        rt0Var.addView(this.f, c8.ha.d(48, 48.0f, 51, 4.0f, 12.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.l9 l9Var = new org.telegram.ui.Components.l9(context);
        l9Var.setAspectFit(true);
        l9Var.getImageReceiver().d = org.telegram.messenger.g0.t0();
        ui.b0(org.telegram.messenger.g0.t0()).c2(l9Var, "RestrictedEmoji", "👨\u200d🏫", "100_100");
        l9Var.getImageReceiver().X(1);
        linearLayout.addView(l9Var, c8.ha.t(100, 100, 1, 0, 0, 0, 12));
        TextView textView = new TextView(context);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setGravity(1);
        org.telegram.messenger.camera.q.o(textView, i11, this.resourceProvider, null, 2131743008);
        TextView f10 = org.telegram.messenger.camera.q.f(linearLayout, textView, c8.ha.t(-1, -2, 1, 32, 0, 32, 10), context);
        f10.setTextSize(1, 14.0f);
        f10.setGravity(1);
        org.telegram.ui.ActionBar.r6.V(f10, org.telegram.ui.ActionBar.k6.z6, this.resourceProvider);
        int[] iArr = this.b;
        org.telegram.messenger.k5.r(null, null, 2131743007, new Object[]{Integer.valueOf(iArr[0] + 1), Integer.valueOf(iArr[1] + 1), Integer.valueOf(iArr[2] + 1)}, f10);
        linearLayout.addView(f10, c8.ha.t(-1, -2, 1, 32, 0, 32, 8));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        linearLayout2.setGravity(1);
        linearLayout2.setClipChildren(false);
        linearLayout.addView(linearLayout2, c8.ha.t(-1, -2, 1, 0, 16, 0, 0));
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.d;
        int size = arrayList2.size();
        int i13 = 0;
        while (i13 < size) {
            Object obj = arrayList2.get(i13);
            i13++;
            arrayList.add(((na) obj).getWord());
        }
        arrayList2.clear();
        int i14 = 0;
        while (i14 < iArr.length) {
            na naVar = new na(iArr[i14], context, this.resourceProvider, false);
            if (i14 < arrayList.size()) {
                naVar.setText((String) arrayList.get(i14));
            }
            naVar.setOnTextChangedListener(new l(this, 14));
            naVar.setOnNextListener(new d10(this, i14, naVar, 18));
            linearLayout2.addView(naVar, c8.ha.t(-1, 50, 1, 0, i14 == 0 ? 0 : 12, 0, 0));
            arrayList2.add(naVar);
            i14++;
        }
        linearLayout.addView(new View(context), c8.ha.l(1.0f, -1, 0));
        fi.d dVar = new fi.d(context, this.resourceProvider, true);
        this.h = dVar;
        dVar.f();
        this.h.setText(id.M0(2131743157, null));
        this.h.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Wallet.da
            public final /* synthetic */ ea b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i132 = i10;
                ea eaVar = this.b;
                switch (i132) {
                    case 0:
                        eaVar.finishFragment();
                        break;
                    default:
                        int[] iArr2 = eaVar.b;
                        ArrayList arrayList3 = eaVar.d;
                        if (!eaVar.y && arrayList3.size() == iArr2.length) {
                            boolean z9 = org.telegram.messenger.r2.a;
                            int size2 = arrayList3.size();
                            int i142 = 0;
                            while (i142 < size2) {
                                Object obj2 = arrayList3.get(i142);
                                i142++;
                                if (((na) obj2).getWord().isEmpty()) {
                                    break;
                                }
                            }
                            boolean z10 = true;
                            for (int i15 = 0; i15 < iArr2.length; i15++) {
                                na naVar2 = (na) arrayList3.get(i15);
                                boolean equalsIgnoreCase = eaVar.a[iArr2[i15]].equalsIgnoreCase(naVar2.getWord());
                                if (!equalsIgnoreCase && naVar2.w) {
                                    org.telegram.messenger.g0.H3(naVar2);
                                }
                                naVar2.setError(!equalsIgnoreCase);
                                z10 &= equalsIgnoreCase;
                            }
                            if (z10) {
                                eaVar.y = true;
                                eaVar.Z();
                                org.telegram.messenger.g0.v1(eaVar.fragmentView);
                                l lVar = eaVar.c;
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
        linearLayout.addView(this.h, c8.ha.t(-1, 48, 1, 0, 24, 0, 0));
        Z();
        return this.fragmentView;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.f2
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
