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
import org.telegram.messenger.bi;
import org.telegram.ui.Components.rw0;
import org.telegram.ui.Components.sw0;
import org.telegram.ui.Components.y9;
import org.telegram.ui.bi0;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final class z8 extends org.telegram.ui.ActionBar.n2 {
    public final String[] a;
    public final int[] b;
    public final m c;
    public final ArrayList d;
    public ScrollView e;
    public ImageView f;
    public ci.d h;
    public int n;
    public int r;
    public int s;
    public int v;
    public int w;
    public boolean x;

    public z8(ArrayList arrayList, m mVar) {
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
        for (int i11 = 0; i11 < this.a.length; i11 = com.google.android.gms.internal.vision.e2.e(i11, i11, 1, arrayList2)) {
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
            z11 &= !((h9) obj).getWord().isEmpty();
        }
        this.h.setVisibility(z11 ? 0 : 4);
        ci.d dVar = this.h;
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
        sw0 sw0Var = new sw0(context, null);
        sw0Var.setDelegate(new rw0() { // from class: org.telegram.ui.Wallet.x8
            @Override // org.telegram.ui.Components.rw0
            public final void H(int i11, boolean z10) {
                z8 z8Var = z8.this;
                z8Var.getClass();
                if (i11 <= AndroidUtilities.dp(20.0f)) {
                    i11 = 0;
                }
                z8Var.n = i11;
                z8Var.onInsets(z8Var.r, z8Var.s, z8Var.v, z8Var.w);
            }
        });
        sw0Var.setBackgroundColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.d6, this.resourceProvider));
        this.fragmentView = sw0Var;
        ScrollView scrollView = new ScrollView(context);
        this.e = scrollView;
        final int i11 = 1;
        scrollView.setFillViewport(true);
        this.e.setVerticalScrollBarEnabled(false);
        this.e.setClipToPadding(false);
        this.e.setPadding(0, AndroidUtilities.dp(96.0f), 0, 0);
        sw0Var.addView(this.e, w7.x5.d(-1.0f, -1));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(AndroidUtilities.dp(36.0f), 0, AndroidUtilities.dp(36.0f), AndroidUtilities.dp(24.0f));
        linearLayout.setClipToPadding(false);
        this.e.addView(linearLayout, new FrameLayout.LayoutParams(-1, -2));
        ImageView imageView = new ImageView(context);
        this.f = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        ImageView imageView2 = this.f;
        int i12 = org.telegram.ui.ActionBar.i6.G6;
        imageView2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.w0(i12, this.resourceProvider), PorterDuff.Mode.SRC_IN));
        this.f.setImageResource(R.drawable.ic_ab_close);
        this.f.setBackground(org.telegram.ui.ActionBar.i6.g0(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.i6, this.resourceProvider), 3, -1));
        this.f.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Wallet.y8
            public final /* synthetic */ z8 b;

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
                        z8 z8Var = this.b;
                        int[] iArr = z8Var.b;
                        ArrayList arrayList = z8Var.d;
                        if (!z8Var.x && arrayList.size() == iArr.length) {
                            if (!BuildVars.DEBUG_PRIVATE_VERSION) {
                                int size = arrayList.size();
                                int i13 = 0;
                                while (i13 < size) {
                                    Object obj = arrayList.get(i13);
                                    i13++;
                                    if (((h9) obj).getWord().isEmpty()) {
                                        break;
                                    }
                                }
                                boolean z10 = true;
                                for (int i14 = 0; i14 < iArr.length; i14++) {
                                    h9 h9Var = (h9) arrayList.get(i14);
                                    boolean equalsIgnoreCase = z8Var.a[iArr[i14]].equalsIgnoreCase(h9Var.getWord());
                                    if (!equalsIgnoreCase && h9Var.v) {
                                        AndroidUtilities.shakeViewSpring(h9Var);
                                    }
                                    h9Var.setError(!equalsIgnoreCase);
                                    z10 &= equalsIgnoreCase;
                                }
                                if (!z10) {
                                }
                            }
                            z8Var.x = true;
                            z8Var.U();
                            AndroidUtilities.hideKeyboard(z8Var.fragmentView);
                            m mVar = z8Var.c;
                            if (mVar != null) {
                                mVar.run();
                                break;
                            }
                        }
                        break;
                }
            }
        });
        sw0Var.addView(this.f, w7.x5.a(48.0f, 4.0f, 12.0f, 0.0f, 0.0f, 48, 51));
        y9 y9Var = new y9(context);
        y9Var.setAspectFit(true);
        y9Var.getImageReceiver().setCurrentAccount(AndroidUtilities.getAccountInProduction());
        MediaDataController.getInstance(AndroidUtilities.getAccountInProduction()).setPlaceholderImage(y9Var, "RestrictedEmoji", "👨\u200d🏫", "100_100");
        y9Var.getImageReceiver().setAutoRepeatCount(1);
        linearLayout.addView(y9Var, w7.x5.t(100, 100, 1, 0, 0, 0, 12));
        TextView textView = new TextView(context);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(1);
        textView.setTextColor(org.telegram.ui.ActionBar.i6.w0(i12, this.resourceProvider));
        textView.setText(LocaleController.getString(R.string.WalletTestPhrase));
        TextView h = com.google.android.gms.internal.vision.e2.h(linearLayout, textView, w7.x5.t(-1, -2, 1, 32, 0, 32, 10), context);
        h.setTextSize(1, 14.0f);
        h.setGravity(1);
        h.setTextColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.z6, this.resourceProvider));
        int i13 = R.string.WalletTestPhraseInfo;
        int[] iArr = this.b;
        bi.r(i13, new Object[]{Integer.valueOf(iArr[0] + 1), Integer.valueOf(iArr[1] + 1), Integer.valueOf(iArr[2] + 1)}, h);
        linearLayout.addView(h, w7.x5.t(-1, -2, 1, 32, 0, 32, 8));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        linearLayout2.setGravity(1);
        linearLayout2.setClipChildren(false);
        linearLayout.addView(linearLayout2, w7.x5.t(-1, -2, 1, 0, 16, 0, 0));
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.d;
        int size = arrayList2.size();
        int i14 = 0;
        while (i14 < size) {
            Object obj = arrayList2.get(i14);
            i14++;
            arrayList.add(((h9) obj).getWord());
        }
        arrayList2.clear();
        int i15 = 0;
        while (i15 < iArr.length) {
            h9 h9Var = new h9(iArr[i15], context, this.resourceProvider, false);
            if (i15 < arrayList.size()) {
                h9Var.setText((String) arrayList.get(i15));
            }
            h9Var.setOnTextChangedListener(new m(this, 15));
            h9Var.setOnNextListener(new bi0(this, i15, h9Var, 15));
            linearLayout2.addView(h9Var, w7.x5.t(-1, 50, 1, 0, i15 == 0 ? 0 : 12, 0, 0));
            arrayList2.add(h9Var);
            i15++;
        }
        linearLayout.addView(new View(context), w7.x5.l(1.0f, -1, 0));
        ci.d dVar = new ci.d(context, this.resourceProvider, true);
        this.h = dVar;
        dVar.e();
        this.h.setText(LocaleController.getString(R.string.WalletContinue));
        this.h.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Wallet.y8
            public final /* synthetic */ z8 b;

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
                        z8 z8Var = this.b;
                        int[] iArr2 = z8Var.b;
                        ArrayList arrayList3 = z8Var.d;
                        if (!z8Var.x && arrayList3.size() == iArr2.length) {
                            if (!BuildVars.DEBUG_PRIVATE_VERSION) {
                                int size2 = arrayList3.size();
                                int i132 = 0;
                                while (i132 < size2) {
                                    Object obj2 = arrayList3.get(i132);
                                    i132++;
                                    if (((h9) obj2).getWord().isEmpty()) {
                                        break;
                                    }
                                }
                                boolean z10 = true;
                                for (int i142 = 0; i142 < iArr2.length; i142++) {
                                    h9 h9Var2 = (h9) arrayList3.get(i142);
                                    boolean equalsIgnoreCase = z8Var.a[iArr2[i142]].equalsIgnoreCase(h9Var2.getWord());
                                    if (!equalsIgnoreCase && h9Var2.v) {
                                        AndroidUtilities.shakeViewSpring(h9Var2);
                                    }
                                    h9Var2.setError(!equalsIgnoreCase);
                                    z10 &= equalsIgnoreCase;
                                }
                                if (!z10) {
                                }
                            }
                            z8Var.x = true;
                            z8Var.U();
                            AndroidUtilities.hideKeyboard(z8Var.fragmentView);
                            m mVar = z8Var.c;
                            if (mVar != null) {
                                mVar.run();
                                break;
                            }
                        }
                        break;
                }
            }
        });
        linearLayout.addView(this.h, w7.x5.t(-1, 48, 1, 0, 24, 0, 0));
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
