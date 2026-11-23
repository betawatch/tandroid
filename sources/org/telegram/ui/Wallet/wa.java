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
import org.telegram.messenger.m10;
import org.telegram.messenger.ri;
import org.telegram.ui.Components.bu0;
import org.telegram.ui.Components.cu0;
import org.telegram.ui.Components.e21;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final class wa extends org.telegram.ui.ActionBar.g2 {
    public final String[] a;
    public final int[] b;
    public final m c;
    public final ArrayList d;
    public ScrollView e;
    public ImageView f;
    public hi.e h;
    public int n;
    public int r;
    public int s;
    public int w;
    public int x;
    public boolean y;

    public wa(ArrayList arrayList, m mVar) {
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
            z11 &= !((eb) obj).getWord().isEmpty();
        }
        this.h.setVisibility(z11 ? 0 : 4);
        hi.e eVar = this.h;
        if (z11 && !this.y) {
            z10 = true;
        }
        eVar.setEnabled(z10);
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final View createView(Context context) {
        final int i7 = 0;
        this.actionBar.setAddToContainer(false);
        this.actionBar.setOccupyStatusBar(false);
        cu0 cu0Var = new cu0(context, null);
        cu0Var.setDelegate(new bu0() { // from class: org.telegram.ui.Wallet.ua
            @Override // org.telegram.ui.Components.bu0
            public final void L(int i10, boolean z10) {
                wa waVar = wa.this;
                waVar.getClass();
                if (i10 <= org.telegram.messenger.g0.L(20.0f)) {
                    i10 = 0;
                }
                waVar.n = i10;
                waVar.onInsets(waVar.r, waVar.s, waVar.w, waVar.x);
            }
        });
        org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.d6, cu0Var, this.resourceProvider);
        this.fragmentView = cu0Var;
        ScrollView scrollView = new ScrollView(context);
        this.e = scrollView;
        final int i10 = 1;
        scrollView.setFillViewport(true);
        this.e.setVerticalScrollBarEnabled(false);
        this.e.setClipToPadding(false);
        this.e.setPadding(0, org.telegram.messenger.g0.L(96.0f), 0, 0);
        cu0Var.addView(this.e, c8.na.c(-1.0f, -1));
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
        this.f.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Wallet.va
            public final /* synthetic */ wa b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i13 = i7;
                wa waVar = this.b;
                switch (i13) {
                    case 0:
                        waVar.finishFragment();
                        break;
                    default:
                        int[] iArr = waVar.b;
                        ArrayList arrayList = waVar.d;
                        if (!waVar.y && arrayList.size() == iArr.length) {
                            boolean z10 = org.telegram.messenger.s2.a;
                            int size = arrayList.size();
                            int i14 = 0;
                            while (i14 < size) {
                                Object obj = arrayList.get(i14);
                                i14++;
                                if (((eb) obj).getWord().isEmpty()) {
                                    break;
                                }
                            }
                            boolean z11 = true;
                            for (int i15 = 0; i15 < iArr.length; i15++) {
                                eb ebVar = (eb) arrayList.get(i15);
                                boolean equalsIgnoreCase = waVar.a[iArr[i15]].equalsIgnoreCase(ebVar.getWord());
                                if (!equalsIgnoreCase && ebVar.w) {
                                    org.telegram.messenger.g0.F3(ebVar);
                                }
                                ebVar.setError(!equalsIgnoreCase);
                                z11 &= equalsIgnoreCase;
                            }
                            if (z11) {
                                waVar.y = true;
                                waVar.Z();
                                org.telegram.messenger.g0.v1(waVar.fragmentView);
                                m mVar = waVar.c;
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
        cu0Var.addView(this.f, c8.na.d(48, 48.0f, 51, 4.0f, 12.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.p9 p9Var = new org.telegram.ui.Components.p9(context);
        p9Var.setAspectFit(true);
        p9Var.getImageReceiver().d = org.telegram.messenger.g0.t0();
        ri.d0(org.telegram.messenger.g0.t0()).h2(p9Var, "RestrictedEmoji", "👨\u200d🏫", "100_100");
        p9Var.getImageReceiver().Y(1);
        linearLayout.addView(p9Var, c8.na.t(100, 100, 1, 0, 0, 0, 12));
        TextView textView = new TextView(context);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setGravity(1);
        m10.r(textView, i11, this.resourceProvider, null, 2131742734);
        TextView f10 = m10.f(linearLayout, textView, c8.na.t(-1, -2, 1, 32, 0, 32, 10), context);
        f10.setTextSize(1, 14.0f);
        f10.setGravity(1);
        org.telegram.ui.ActionBar.u6.U(f10, org.telegram.ui.ActionBar.n6.z6, this.resourceProvider);
        int[] iArr = this.b;
        org.telegram.messenger.f3.q(null, null, 2131742733, new Object[]{Integer.valueOf(iArr[0] + 1), Integer.valueOf(iArr[1] + 1), Integer.valueOf(iArr[2] + 1)}, f10);
        linearLayout.addView(f10, c8.na.t(-1, -2, 1, 32, 0, 32, 8));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        linearLayout2.setGravity(1);
        linearLayout2.setClipChildren(false);
        linearLayout.addView(linearLayout2, c8.na.t(-1, -2, 1, 0, 16, 0, 0));
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.d;
        int size = arrayList2.size();
        int i13 = 0;
        while (i13 < size) {
            Object obj = arrayList2.get(i13);
            i13++;
            arrayList.add(((eb) obj).getWord());
        }
        arrayList2.clear();
        int i14 = 0;
        while (i14 < iArr.length) {
            eb ebVar = new eb(iArr[i14], context, this.resourceProvider, false);
            if (i14 < arrayList.size()) {
                ebVar.setText((String) arrayList.get(i14));
            }
            ebVar.setOnTextChangedListener(new m(this, 14));
            ebVar.setOnNextListener(new e21(this, i14, ebVar, 21));
            linearLayout2.addView(ebVar, c8.na.t(-1, 50, 1, 0, i14 == 0 ? 0 : 12, 0, 0));
            arrayList2.add(ebVar);
            i14++;
        }
        linearLayout.addView(new View(context), c8.na.l(1.0f, -1, 0));
        hi.e eVar = new hi.e(context, this.resourceProvider, true);
        this.h = eVar;
        eVar.f();
        this.h.setText(gd.N0(2131742903, null));
        this.h.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Wallet.va
            public final /* synthetic */ wa b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i132 = i10;
                wa waVar = this.b;
                switch (i132) {
                    case 0:
                        waVar.finishFragment();
                        break;
                    default:
                        int[] iArr2 = waVar.b;
                        ArrayList arrayList3 = waVar.d;
                        if (!waVar.y && arrayList3.size() == iArr2.length) {
                            boolean z10 = org.telegram.messenger.s2.a;
                            int size2 = arrayList3.size();
                            int i142 = 0;
                            while (i142 < size2) {
                                Object obj2 = arrayList3.get(i142);
                                i142++;
                                if (((eb) obj2).getWord().isEmpty()) {
                                    break;
                                }
                            }
                            boolean z11 = true;
                            for (int i15 = 0; i15 < iArr2.length; i15++) {
                                eb ebVar2 = (eb) arrayList3.get(i15);
                                boolean equalsIgnoreCase = waVar.a[iArr2[i15]].equalsIgnoreCase(ebVar2.getWord());
                                if (!equalsIgnoreCase && ebVar2.w) {
                                    org.telegram.messenger.g0.F3(ebVar2);
                                }
                                ebVar2.setError(!equalsIgnoreCase);
                                z11 &= equalsIgnoreCase;
                            }
                            if (z11) {
                                waVar.y = true;
                                waVar.Z();
                                org.telegram.messenger.g0.v1(waVar.fragmentView);
                                m mVar = waVar.c;
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
        linearLayout.addView(this.h, c8.na.t(-1, 48, 1, 0, 24, 0, 0));
        Z();
        return this.fragmentView;
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.g2
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
