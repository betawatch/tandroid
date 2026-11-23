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
import org.telegram.messenger.beta.R;
import org.telegram.messenger.hd;
import org.telegram.messenger.o10;
import org.telegram.messenger.si;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes4.dex */
public final class l9 extends org.telegram.ui.ActionBar.g2 {
    public final ArrayList a;
    public ScrollView b;
    public ImageView c;
    public LinearLayout d;
    public hi.e e;
    public Runnable f;
    public boolean h;

    public l9() {
        super(null);
        this.a = new ArrayList();
    }

    public static void Z(l9 l9Var) {
        ArrayList arrayList = l9Var.a;
        if (arrayList.size() == 12 || arrayList.size() == 24) {
            va vaVar = new va(arrayList, new m(l9Var, 12));
            vaVar.setCurrentAccount(l9Var.currentAccount);
            l9Var.presentFragment(vaVar);
        }
    }

    public final void a0() {
        LinearLayout linearLayout = this.d;
        if (linearLayout == null) {
            return;
        }
        linearLayout.removeAllViews();
        Context context = this.d.getContext();
        ArrayList arrayList = this.a;
        boolean z10 = true;
        int size = (arrayList.size() + 1) / 2;
        this.d.addView(d9.j0(0, size, context, arrayList, this.resourceProvider), c8.ma.p(0, -2, 1.0f, 48));
        this.d.addView(new View(context), c8.ma.o(10, 0));
        this.d.addView(d9.j0(size, arrayList.size(), context, arrayList, this.resourceProvider), c8.ma.p(0, -2, 1.0f, 48));
        hi.e eVar = this.e;
        if (eVar != null) {
            if (arrayList.size() != 12 && arrayList.size() != 24) {
                z10 = false;
            }
            eVar.setEnabled(z10);
        }
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final View createView(Context context) {
        final int i7 = 0;
        this.actionBar.setAddToContainer(false);
        this.actionBar.setOccupyStatusBar(false);
        FrameLayout frameLayout = new FrameLayout(context);
        org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.d6, frameLayout, this.resourceProvider);
        this.fragmentView = frameLayout;
        ScrollView scrollView = new ScrollView(context);
        this.b = scrollView;
        final int i10 = 1;
        scrollView.setFillViewport(true);
        this.b.setVerticalScrollBarEnabled(false);
        this.b.setClipToPadding(false);
        this.b.setPadding(0, org.telegram.messenger.g0.L(96.0f), 0, 0);
        frameLayout.addView(this.b, c8.ma.c(-1.0f, -1));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(org.telegram.messenger.g0.L(36.0f), 0, org.telegram.messenger.g0.L(36.0f), org.telegram.messenger.g0.L(24.0f));
        linearLayout.setClipToPadding(false);
        this.b.addView(linearLayout, new FrameLayout.LayoutParams(-1, -2));
        ImageView imageView = new ImageView(context);
        this.c = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        ImageView imageView2 = this.c;
        int i11 = org.telegram.ui.ActionBar.m6.G6;
        org.telegram.ui.ActionBar.t6.s(imageView2, i11, this.resourceProvider, PorterDuff.Mode.SRC_IN);
        this.c.setImageResource(R.drawable.ic_ab_close);
        ImageView imageView3 = this.c;
        int i12 = org.telegram.ui.ActionBar.m6.i6;
        org.telegram.ui.ActionBar.t6.Q(imageView3, org.telegram.ui.ActionBar.m6.h0(org.telegram.ui.ActionBar.m6.w0(i12, this.resourceProvider), 3, -1), null, org.telegram.ui.ActionBar.t6.M(i12), this.resourceProvider);
        this.c.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Wallet.k9
            public final /* synthetic */ l9 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i7) {
                    case 0:
                        this.b.finishFragment();
                        break;
                    default:
                        l9.Z(this.b);
                        break;
                }
            }
        });
        frameLayout.addView(this.c, c8.ma.d(48, 48.0f, 51, 4.0f, 12.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.q9 q9Var = new org.telegram.ui.Components.q9(context);
        q9Var.setAspectFit(true);
        q9Var.getImageReceiver().d = org.telegram.messenger.g0.t0();
        si.d0(org.telegram.messenger.g0.t0()).h2(q9Var, "RestrictedEmoji", "📝", "100_100");
        q9Var.getImageReceiver().X(1);
        linearLayout.addView(q9Var, c8.ma.t(100, 100, 1, 0, 0, 0, 12));
        TextView textView = new TextView(context);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setGravity(1);
        org.telegram.ui.ActionBar.t6.U(textView, i11, this.resourceProvider);
        textView.setText(hd.N0(this.h ? 2131742900 : 2131742823, null));
        TextView f10 = o10.f(linearLayout, textView, c8.ma.t(-1, -2, 1, 32, 0, 32, 10), context);
        f10.setTextSize(1, 14.0f);
        f10.setGravity(1);
        org.telegram.ui.ActionBar.t6.U(f10, org.telegram.ui.ActionBar.m6.z6, this.resourceProvider);
        f10.setText(hd.N0(this.h ? 2131742899 : 2131742822, null));
        linearLayout.addView(f10, c8.ma.t(-1, -2, 1, 32, 0, 32, 8));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.d = linearLayout2;
        linearLayout2.setOrientation(0);
        this.d.setGravity(1);
        linearLayout.addView(this.d, c8.ma.t(-1, -2, 1, 4, 24, 4, 0));
        linearLayout.addView(new View(context), c8.ma.l(1.0f, -1, 0));
        hi.e eVar = new hi.e(context, this.resourceProvider, true);
        this.e = eVar;
        eVar.f();
        this.e.setText(hd.N0(2131742908, null));
        this.e.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Wallet.k9
            public final /* synthetic */ l9 b;

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
                        l9.Z(this.b);
                        break;
                }
            }
        });
        linearLayout.addView(this.e, c8.ma.t(-1, 48, 1, 0, 24, 0, 0));
        a0();
        return this.fragmentView;
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final void onInsets(int i7, int i10, int i11, int i12) {
        ScrollView scrollView = this.b;
        if (scrollView != null) {
            scrollView.setPadding(i7, org.telegram.messenger.g0.L(96.0f) + i10, i11, i12);
        }
        ImageView imageView = this.c;
        if (imageView != null) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) imageView.getLayoutParams();
            layoutParams.leftMargin = org.telegram.messenger.g0.L(4.0f) + i7;
            layoutParams.topMargin = org.telegram.messenger.g0.L(12.0f) + i10;
            this.c.setLayoutParams(layoutParams);
        }
    }
}
