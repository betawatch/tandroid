package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.PorterDuff;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import b8.mf;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.li;
import org.telegram.ui.Components.pt0;
import org.telegram.ui.Components.qt0;
import org.telegram.ui.rw;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class ea extends org.telegram.ui.ActionBar.d2 {
    public final String[] a;
    public final int[] b;
    public final l c;
    public final ArrayList d;
    public ScrollView e;
    public ImageView f;
    public gi.d h;
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
        int i3 = 0;
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
            if (i3 >= iArr.length) {
                Arrays.sort(iArr);
                return;
            } else {
                iArr[i3] = ((Integer) arrayList2.get(i3)).intValue();
                i3++;
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
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            z11 &= !((na) obj).getWord().isEmpty();
        }
        this.h.setVisibility(z11 ? 0 : 4);
        gi.d dVar = this.h;
        if (z11 && !this.y) {
            z10 = true;
        }
        dVar.setEnabled(z10);
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final View createView(Context context) {
        final int i3 = 0;
        this.actionBar.setAddToContainer(false);
        this.actionBar.setOccupyStatusBar(false);
        qt0 qt0Var = new qt0(context, null);
        qt0Var.setDelegate(new pt0() { // from class: org.telegram.ui.Wallet.ca
            @Override // org.telegram.ui.Components.pt0
            public final void K(int i10, boolean z10) {
                ea eaVar = ea.this;
                eaVar.getClass();
                if (i10 <= org.telegram.messenger.g0.L(20.0f)) {
                    i10 = 0;
                }
                eaVar.n = i10;
                eaVar.onInsets(eaVar.r, eaVar.s, eaVar.w, eaVar.x);
            }
        });
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d6, qt0Var, this.resourceProvider);
        this.fragmentView = qt0Var;
        ScrollView scrollView = new ScrollView(context);
        this.e = scrollView;
        final int i10 = 1;
        scrollView.setFillViewport(true);
        this.e.setVerticalScrollBarEnabled(false);
        this.e.setClipToPadding(false);
        this.e.setPadding(0, org.telegram.messenger.g0.L(96.0f), 0, 0);
        qt0Var.addView(this.e, mf.c(-1.0f, -1));
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
                int i13 = i3;
                ea eaVar = this.b;
                switch (i13) {
                    case 0:
                        eaVar.finishFragment();
                        break;
                    default:
                        int[] iArr = eaVar.b;
                        ArrayList arrayList = eaVar.d;
                        if (!eaVar.y && arrayList.size() == iArr.length) {
                            boolean z10 = org.telegram.messenger.r2.a;
                            int size = arrayList.size();
                            int i14 = 0;
                            while (i14 < size) {
                                Object obj = arrayList.get(i14);
                                i14++;
                                if (((na) obj).getWord().isEmpty()) {
                                    break;
                                }
                            }
                            boolean z11 = true;
                            for (int i15 = 0; i15 < iArr.length; i15++) {
                                na naVar = (na) arrayList.get(i15);
                                boolean equalsIgnoreCase = eaVar.a[iArr[i15]].equalsIgnoreCase(naVar.getWord());
                                if (!equalsIgnoreCase && naVar.w) {
                                    org.telegram.messenger.g0.H3(naVar);
                                }
                                naVar.setError(!equalsIgnoreCase);
                                z11 &= equalsIgnoreCase;
                            }
                            if (z11) {
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
        qt0Var.addView(this.f, mf.d(48, 48.0f, 51, 4.0f, 12.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.k9 k9Var = new org.telegram.ui.Components.k9(context);
        k9Var.setAspectFit(true);
        k9Var.getImageReceiver().d = org.telegram.messenger.g0.t0();
        li.b0(org.telegram.messenger.g0.t0()).c2(k9Var, "RestrictedEmoji", "👨\u200d🏫", "100_100");
        k9Var.getImageReceiver().X(1);
        linearLayout.addView(k9Var, mf.t(100, 100, 1, 0, 0, 0, 12));
        TextView textView = new TextView(context);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setGravity(1);
        org.telegram.messenger.camera.q.o(textView, i11, this.resourceProvider, null, 2131743015);
        TextView f10 = org.telegram.messenger.camera.q.f(linearLayout, textView, mf.t(-1, -2, 1, 32, 0, 32, 10), context);
        f10.setTextSize(1, 14.0f);
        f10.setGravity(1);
        org.telegram.ui.ActionBar.r6.V(f10, org.telegram.ui.ActionBar.k6.z6, this.resourceProvider);
        int[] iArr = this.b;
        org.telegram.messenger.k5.r(null, null, 2131743014, new Object[]{Integer.valueOf(iArr[0] + 1), Integer.valueOf(iArr[1] + 1), Integer.valueOf(iArr[2] + 1)}, f10);
        linearLayout.addView(f10, mf.t(-1, -2, 1, 32, 0, 32, 8));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        linearLayout2.setGravity(1);
        linearLayout2.setClipChildren(false);
        linearLayout.addView(linearLayout2, mf.t(-1, -2, 1, 0, 16, 0, 0));
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
            naVar.setOnNextListener(new rw(this, i14, naVar, 19));
            linearLayout2.addView(naVar, mf.t(-1, 50, 1, 0, i14 == 0 ? 0 : 12, 0, 0));
            arrayList2.add(naVar);
            i14++;
        }
        linearLayout.addView(new View(context), mf.l(1.0f, -1, 0));
        gi.d dVar = new gi.d(context, this.resourceProvider, true);
        this.h = dVar;
        dVar.f();
        this.h.setText(bd.M0(2131743164, null));
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
                            boolean z10 = org.telegram.messenger.r2.a;
                            int size2 = arrayList3.size();
                            int i142 = 0;
                            while (i142 < size2) {
                                Object obj2 = arrayList3.get(i142);
                                i142++;
                                if (((na) obj2).getWord().isEmpty()) {
                                    break;
                                }
                            }
                            boolean z11 = true;
                            for (int i15 = 0; i15 < iArr2.length; i15++) {
                                na naVar2 = (na) arrayList3.get(i15);
                                boolean equalsIgnoreCase = eaVar.a[iArr2[i15]].equalsIgnoreCase(naVar2.getWord());
                                if (!equalsIgnoreCase && naVar2.w) {
                                    org.telegram.messenger.g0.H3(naVar2);
                                }
                                naVar2.setError(!equalsIgnoreCase);
                                z11 &= equalsIgnoreCase;
                            }
                            if (z11) {
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
        linearLayout.addView(this.h, mf.t(-1, 48, 1, 0, 24, 0, 0));
        Z();
        return this.fragmentView;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onInsets(int i3, int i10, int i11, int i12) {
        this.r = i3;
        this.s = i10;
        this.w = i11;
        this.x = i12;
        ScrollView scrollView = this.e;
        if (scrollView != null) {
            scrollView.setPadding(i3, org.telegram.messenger.g0.L(96.0f) + i10, i11, i12 + this.n);
        }
        ImageView imageView = this.f;
        if (imageView != null) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) imageView.getLayoutParams();
            layoutParams.leftMargin = org.telegram.messenger.g0.L(4.0f) + i3;
            layoutParams.topMargin = org.telegram.messenger.g0.L(12.0f) + i10;
            this.f.setLayoutParams(layoutParams);
        }
    }
}
