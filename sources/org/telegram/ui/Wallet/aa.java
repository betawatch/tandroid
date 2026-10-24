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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.R;
import org.telegram.messenger.sl;
import org.telegram.ui.Components.c41;
import org.telegram.ui.Components.nw0;
import org.telegram.ui.Components.ow0;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes4.dex */
public final class aa extends org.telegram.ui.ActionBar.o2 {
    public final String[] a;
    public final int[] b;
    public final m c;
    public final ArrayList d;
    public ScrollView e;
    public ImageView f;
    public ei.d h;
    public int n;
    public int r;
    public int s;
    public int v;
    public int w;
    public boolean x;

    public aa(ArrayList arrayList, m mVar) {
        super(null);
        this.b = new int[3];
        this.d = new ArrayList();
        int i10 = 0;
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        this.a = strArr;
        if (strArr.length != 12 && strArr.length != 24) {
            throw new IllegalArgumentException("Expected a 12- or 24-word recovery phrase");
        }
        this.c = mVar;
        ArrayList arrayList2 = new ArrayList();
        for (int i11 = 0; i11 < this.a.length; i11 = com.google.android.gms.internal.play_billing.k3.f(i11, i11, 1, arrayList2)) {
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

    public final void U() {
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
            z11 &= !((ia) obj).getWord().isEmpty();
        }
        this.h.setVisibility(z11 ? 0 : 4);
        ei.d dVar = this.h;
        if (z11 && !this.x) {
            z10 = true;
        }
        dVar.setEnabled(z10);
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final View createView(Context context) {
        final int i10 = 0;
        this.actionBar.setAddToContainer(false);
        this.actionBar.setOccupyStatusBar(false);
        ow0 ow0Var = new ow0(context, null);
        ow0Var.setDelegate(new nw0() { // from class: org.telegram.ui.Wallet.y9
            @Override // org.telegram.ui.Components.nw0
            public final void G(int i11, boolean z10) {
                aa aaVar = aa.this;
                aaVar.getClass();
                if (i11 <= AndroidUtilities.dp(20.0f)) {
                    i11 = 0;
                }
                aaVar.n = i11;
                aaVar.onInsets(aaVar.r, aaVar.s, aaVar.v, aaVar.w);
            }
        });
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d6, ow0Var, this.resourceProvider);
        this.fragmentView = ow0Var;
        ScrollView scrollView = new ScrollView(context);
        this.e = scrollView;
        final int i11 = 1;
        scrollView.setFillViewport(true);
        this.e.setVerticalScrollBarEnabled(false);
        this.e.setClipToPadding(false);
        this.e.setPadding(0, AndroidUtilities.dp(96.0f), 0, 0);
        ow0Var.addView(this.e, w7.z5.c(-1.0f, -1));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(AndroidUtilities.dp(36.0f), 0, AndroidUtilities.dp(36.0f), AndroidUtilities.dp(24.0f));
        linearLayout.setClipToPadding(false);
        this.e.addView(linearLayout, new FrameLayout.LayoutParams(-1, -2));
        ImageView imageView = new ImageView(context);
        this.f = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        ImageView imageView2 = this.f;
        int i12 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.ui.ActionBar.r6.t(imageView2, i12, this.resourceProvider, PorterDuff.Mode.SRC_IN);
        this.f.setImageResource(R.drawable.ic_ab_close);
        ImageView imageView3 = this.f;
        int i13 = org.telegram.ui.ActionBar.k6.i6;
        org.telegram.ui.ActionBar.r6.S(imageView3, org.telegram.ui.ActionBar.k6.g0(org.telegram.ui.ActionBar.k6.w0(i13, this.resourceProvider), 3, -1), null, org.telegram.ui.ActionBar.r6.O(i13), this.resourceProvider);
        this.f.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Wallet.z9
            public final /* synthetic */ aa b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        this.b.finishFragment();
                        break;
                    default:
                        aa aaVar = this.b;
                        int[] iArr = aaVar.b;
                        ArrayList arrayList = aaVar.d;
                        if (!aaVar.x && arrayList.size() == iArr.length) {
                            if (!BuildVars.DEBUG_PRIVATE_VERSION) {
                                int size = arrayList.size();
                                int i14 = 0;
                                while (i14 < size) {
                                    Object obj = arrayList.get(i14);
                                    i14++;
                                    if (((ia) obj).getWord().isEmpty()) {
                                        break;
                                    }
                                }
                                boolean z10 = true;
                                for (int i15 = 0; i15 < iArr.length; i15++) {
                                    ia iaVar = (ia) arrayList.get(i15);
                                    boolean equalsIgnoreCase = aaVar.a[iArr[i15]].equalsIgnoreCase(iaVar.getWord());
                                    if (!equalsIgnoreCase && iaVar.v) {
                                        AndroidUtilities.shakeViewSpring(iaVar);
                                    }
                                    iaVar.setError(!equalsIgnoreCase);
                                    z10 &= equalsIgnoreCase;
                                }
                                if (!z10) {
                                }
                            }
                            aaVar.x = true;
                            aaVar.U();
                            AndroidUtilities.hideKeyboard(aaVar.fragmentView);
                            m mVar = aaVar.c;
                            if (mVar != null) {
                                mVar.run();
                                break;
                            }
                        }
                        break;
                }
            }
        });
        ow0Var.addView(this.f, w7.z5.d(48, 48.0f, 51, 4.0f, 12.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.w9 w9Var = new org.telegram.ui.Components.w9(context);
        w9Var.setAspectFit(true);
        w9Var.getImageReceiver().setCurrentAccount(AndroidUtilities.getAccountInProduction());
        MediaDataController.getInstance(AndroidUtilities.getAccountInProduction()).setPlaceholderImage(w9Var, "RestrictedEmoji", "👨\u200d🏫", "100_100");
        w9Var.getImageReceiver().setAutoRepeatCount(1);
        linearLayout.addView(w9Var, w7.z5.t(100, 100, 1, 0, 0, 0, 12));
        TextView textView = new TextView(context);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(1);
        org.telegram.ui.ActionBar.r6.W(textView, i12, this.resourceProvider);
        textView.setText(LocaleController.getString(R.string.WalletTestPhrase));
        TextView f7 = sl.f(linearLayout, textView, w7.z5.t(-1, -2, 1, 32, 0, 32, 10), context);
        f7.setTextSize(1, 14.0f);
        f7.setGravity(1);
        org.telegram.ui.ActionBar.r6.W(f7, org.telegram.ui.ActionBar.k6.z6, this.resourceProvider);
        int i14 = R.string.WalletTestPhraseInfo;
        int[] iArr = this.b;
        sl.r(i14, new Object[]{Integer.valueOf(iArr[0] + 1), Integer.valueOf(iArr[1] + 1), Integer.valueOf(iArr[2] + 1)}, f7);
        linearLayout.addView(f7, w7.z5.t(-1, -2, 1, 32, 0, 32, 8));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        linearLayout2.setGravity(1);
        linearLayout2.setClipChildren(false);
        linearLayout.addView(linearLayout2, w7.z5.t(-1, -2, 1, 0, 16, 0, 0));
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.d;
        int size = arrayList2.size();
        int i15 = 0;
        while (i15 < size) {
            Object obj = arrayList2.get(i15);
            i15++;
            arrayList.add(((ia) obj).getWord());
        }
        arrayList2.clear();
        int i16 = 0;
        while (i16 < iArr.length) {
            ia iaVar = new ia(iArr[i16], context, this.resourceProvider, false);
            if (i16 < arrayList.size()) {
                iaVar.setText((String) arrayList.get(i16));
            }
            iaVar.setOnTextChangedListener(new m(this, 14));
            iaVar.setOnNextListener(new c41(this, i16, iaVar, 21));
            linearLayout2.addView(iaVar, w7.z5.t(-1, 50, 1, 0, i16 == 0 ? 0 : 12, 0, 0));
            arrayList2.add(iaVar);
            i16++;
        }
        linearLayout.addView(new View(context), w7.z5.l(1.0f, -1, 0));
        ei.d dVar = new ei.d(context, this.resourceProvider, true);
        this.h = dVar;
        dVar.f();
        this.h.setText(LocaleController.getString(R.string.WalletContinue));
        this.h.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Wallet.z9
            public final /* synthetic */ aa b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        this.b.finishFragment();
                        break;
                    default:
                        aa aaVar = this.b;
                        int[] iArr2 = aaVar.b;
                        ArrayList arrayList3 = aaVar.d;
                        if (!aaVar.x && arrayList3.size() == iArr2.length) {
                            if (!BuildVars.DEBUG_PRIVATE_VERSION) {
                                int size2 = arrayList3.size();
                                int i142 = 0;
                                while (i142 < size2) {
                                    Object obj2 = arrayList3.get(i142);
                                    i142++;
                                    if (((ia) obj2).getWord().isEmpty()) {
                                        break;
                                    }
                                }
                                boolean z10 = true;
                                for (int i152 = 0; i152 < iArr2.length; i152++) {
                                    ia iaVar2 = (ia) arrayList3.get(i152);
                                    boolean equalsIgnoreCase = aaVar.a[iArr2[i152]].equalsIgnoreCase(iaVar2.getWord());
                                    if (!equalsIgnoreCase && iaVar2.v) {
                                        AndroidUtilities.shakeViewSpring(iaVar2);
                                    }
                                    iaVar2.setError(!equalsIgnoreCase);
                                    z10 &= equalsIgnoreCase;
                                }
                                if (!z10) {
                                }
                            }
                            aaVar.x = true;
                            aaVar.U();
                            AndroidUtilities.hideKeyboard(aaVar.fragmentView);
                            m mVar = aaVar.c;
                            if (mVar != null) {
                                mVar.run();
                                break;
                            }
                        }
                        break;
                }
            }
        });
        linearLayout.addView(this.h, w7.z5.t(-1, 48, 1, 0, 24, 0, 0));
        U();
        return this.fragmentView;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.r = i10;
        this.s = i11;
        this.v = i12;
        this.w = i13;
        ScrollView scrollView = this.e;
        if (scrollView != null) {
            scrollView.setPadding(i10, AndroidUtilities.dp(96.0f) + i11, i12, i13 + this.n);
        }
        ImageView imageView = this.f;
        if (imageView != null) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) imageView.getLayoutParams();
            layoutParams.leftMargin = AndroidUtilities.dp(4.0f) + i10;
            layoutParams.topMargin = AndroidUtilities.dp(12.0f) + i11;
            this.f.setLayoutParams(layoutParams);
        }
    }
}
