package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
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
import org.telegram.messenger.kk;
import org.telegram.ui.Components.iw0;
import org.telegram.ui.Components.jw0;
import org.telegram.ui.Components.w31;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes4.dex */
public final class da extends org.telegram.ui.ActionBar.n2 {
    public final String[] a;
    public final int[] b;
    public final n c;
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

    public da(ArrayList arrayList, n nVar) {
        super(null);
        this.b = new int[3];
        this.d = new ArrayList();
        int i10 = 0;
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        this.a = strArr;
        if (strArr.length != 12 && strArr.length != 24) {
            throw new IllegalArgumentException("Expected a 12- or 24-word recovery phrase");
        }
        this.c = nVar;
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
            z11 &= !((la) obj).getWord().isEmpty();
        }
        this.h.setVisibility(z11 ? 0 : 4);
        ei.d dVar = this.h;
        if (z11 && !this.x) {
            z10 = true;
        }
        dVar.setEnabled(z10);
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final View createView(Context context) {
        final int i10 = 0;
        this.actionBar.setAddToContainer(false);
        this.actionBar.setOccupyStatusBar(false);
        jw0 jw0Var = new jw0(context, null);
        jw0Var.setDelegate(new iw0() { // from class: org.telegram.ui.Wallet.ba
            @Override // org.telegram.ui.Components.iw0
            public final void H(int i11, boolean z10) {
                da daVar = da.this;
                daVar.getClass();
                if (i11 <= AndroidUtilities.dp(20.0f)) {
                    i11 = 0;
                }
                daVar.n = i11;
                daVar.onInsets(daVar.r, daVar.s, daVar.v, daVar.w);
            }
        });
        jw0Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.d6, this.resourceProvider));
        this.fragmentView = jw0Var;
        ScrollView scrollView = new ScrollView(context);
        this.e = scrollView;
        final int i11 = 1;
        scrollView.setFillViewport(true);
        this.e.setVerticalScrollBarEnabled(false);
        this.e.setClipToPadding(false);
        this.e.setPadding(0, AndroidUtilities.dp(96.0f), 0, 0);
        jw0Var.addView(this.e, w7.z5.d(-1.0f, -1));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(AndroidUtilities.dp(36.0f), 0, AndroidUtilities.dp(36.0f), AndroidUtilities.dp(24.0f));
        linearLayout.setClipToPadding(false);
        this.e.addView(linearLayout, new FrameLayout.LayoutParams(-1, -2));
        ImageView imageView = new ImageView(context);
        this.f = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        ImageView imageView2 = this.f;
        int i12 = org.telegram.ui.ActionBar.h6.G6;
        imageView2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(i12, this.resourceProvider), PorterDuff.Mode.SRC_IN));
        this.f.setImageResource(R.drawable.ic_ab_close);
        this.f.setBackground(org.telegram.ui.ActionBar.h6.g0(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.i6, this.resourceProvider), 3, -1));
        this.f.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Wallet.ca
            public final /* synthetic */ da b;

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
                        da daVar = this.b;
                        int[] iArr = daVar.b;
                        ArrayList arrayList = daVar.d;
                        if (!daVar.x && arrayList.size() == iArr.length) {
                            if (!BuildVars.DEBUG_PRIVATE_VERSION) {
                                int size = arrayList.size();
                                int i13 = 0;
                                while (i13 < size) {
                                    Object obj = arrayList.get(i13);
                                    i13++;
                                    if (((la) obj).getWord().isEmpty()) {
                                        break;
                                    }
                                }
                                boolean z10 = true;
                                for (int i14 = 0; i14 < iArr.length; i14++) {
                                    la laVar = (la) arrayList.get(i14);
                                    boolean equalsIgnoreCase = daVar.a[iArr[i14]].equalsIgnoreCase(laVar.getWord());
                                    if (!equalsIgnoreCase && laVar.v) {
                                        AndroidUtilities.shakeViewSpring(laVar);
                                    }
                                    laVar.setError(!equalsIgnoreCase);
                                    z10 &= equalsIgnoreCase;
                                }
                                if (!z10) {
                                }
                            }
                            daVar.x = true;
                            daVar.U();
                            AndroidUtilities.hideKeyboard(daVar.fragmentView);
                            n nVar = daVar.c;
                            if (nVar != null) {
                                nVar.run();
                                break;
                            }
                        }
                        break;
                }
            }
        });
        jw0Var.addView(this.f, w7.z5.a(48.0f, 4.0f, 12.0f, 0.0f, 0.0f, 48, 51));
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
        textView.setTextColor(org.telegram.ui.ActionBar.h6.w0(i12, this.resourceProvider));
        textView.setText(LocaleController.getString(R.string.WalletTestPhrase));
        TextView i13 = com.google.android.gms.internal.play_billing.k3.i(linearLayout, textView, w7.z5.t(-1, -2, 1, 32, 0, 32, 10), context);
        i13.setTextSize(1, 14.0f);
        i13.setGravity(1);
        i13.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.z6, this.resourceProvider));
        int i14 = R.string.WalletTestPhraseInfo;
        int[] iArr = this.b;
        kk.r(i14, new Object[]{Integer.valueOf(iArr[0] + 1), Integer.valueOf(iArr[1] + 1), Integer.valueOf(iArr[2] + 1)}, i13);
        linearLayout.addView(i13, w7.z5.t(-1, -2, 1, 32, 0, 32, 8));
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
            arrayList.add(((la) obj).getWord());
        }
        arrayList2.clear();
        int i16 = 0;
        while (i16 < iArr.length) {
            la laVar = new la(iArr[i16], context, this.resourceProvider, false);
            if (i16 < arrayList.size()) {
                laVar.setText((String) arrayList.get(i16));
            }
            laVar.setOnTextChangedListener(new n(this, 17));
            laVar.setOnNextListener(new w31(this, i16, laVar, 20));
            linearLayout2.addView(laVar, w7.z5.t(-1, 50, 1, 0, i16 == 0 ? 0 : 12, 0, 0));
            arrayList2.add(laVar);
            i16++;
        }
        linearLayout.addView(new View(context), w7.z5.l(1.0f, -1, 0));
        ei.d dVar = new ei.d(context, this.resourceProvider, true);
        this.h = dVar;
        dVar.e();
        this.h.setText(LocaleController.getString(R.string.WalletContinue));
        this.h.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Wallet.ca
            public final /* synthetic */ da b;

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
                        da daVar = this.b;
                        int[] iArr2 = daVar.b;
                        ArrayList arrayList3 = daVar.d;
                        if (!daVar.x && arrayList3.size() == iArr2.length) {
                            if (!BuildVars.DEBUG_PRIVATE_VERSION) {
                                int size2 = arrayList3.size();
                                int i132 = 0;
                                while (i132 < size2) {
                                    Object obj2 = arrayList3.get(i132);
                                    i132++;
                                    if (((la) obj2).getWord().isEmpty()) {
                                        break;
                                    }
                                }
                                boolean z10 = true;
                                for (int i142 = 0; i142 < iArr2.length; i142++) {
                                    la laVar2 = (la) arrayList3.get(i142);
                                    boolean equalsIgnoreCase = daVar.a[iArr2[i142]].equalsIgnoreCase(laVar2.getWord());
                                    if (!equalsIgnoreCase && laVar2.v) {
                                        AndroidUtilities.shakeViewSpring(laVar2);
                                    }
                                    laVar2.setError(!equalsIgnoreCase);
                                    z10 &= equalsIgnoreCase;
                                }
                                if (!z10) {
                                }
                            }
                            daVar.x = true;
                            daVar.U();
                            AndroidUtilities.hideKeyboard(daVar.fragmentView);
                            n nVar = daVar.c;
                            if (nVar != null) {
                                nVar.run();
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

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.n2
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
