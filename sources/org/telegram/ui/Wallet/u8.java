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
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.li;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class u8 extends org.telegram.ui.ActionBar.d2 {
    public final ArrayList a;
    public ScrollView b;
    public ImageView c;
    public LinearLayout d;
    public gi.d e;
    public Runnable f;
    public boolean h;

    public u8() {
        super(null);
        this.a = new ArrayList();
    }

    public static void Z(u8 u8Var) {
        ArrayList arrayList = u8Var.a;
        if (arrayList.size() == 12 || arrayList.size() == 24) {
            ea eaVar = new ea(arrayList, new l(u8Var, 12));
            eaVar.setCurrentAccount(u8Var.currentAccount);
            u8Var.presentFragment(eaVar);
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
        this.d.addView(n8.j0(0, size, context, arrayList, this.resourceProvider), mf.p(0, -2, 1.0f, 48));
        this.d.addView(new View(context), mf.o(10, 0));
        this.d.addView(n8.j0(size, arrayList.size(), context, arrayList, this.resourceProvider), mf.p(0, -2, 1.0f, 48));
        gi.d dVar = this.e;
        if (dVar != null) {
            if (arrayList.size() != 12 && arrayList.size() != 24) {
                z10 = false;
            }
            dVar.setEnabled(z10);
        }
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final View createView(Context context) {
        final int i3 = 0;
        this.actionBar.setAddToContainer(false);
        this.actionBar.setOccupyStatusBar(false);
        FrameLayout frameLayout = new FrameLayout(context);
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d6, frameLayout, this.resourceProvider);
        this.fragmentView = frameLayout;
        ScrollView scrollView = new ScrollView(context);
        this.b = scrollView;
        final int i10 = 1;
        scrollView.setFillViewport(true);
        this.b.setVerticalScrollBarEnabled(false);
        this.b.setClipToPadding(false);
        this.b.setPadding(0, org.telegram.messenger.g0.L(96.0f), 0, 0);
        frameLayout.addView(this.b, mf.c(-1.0f, -1));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(org.telegram.messenger.g0.L(36.0f), 0, org.telegram.messenger.g0.L(36.0f), org.telegram.messenger.g0.L(24.0f));
        linearLayout.setClipToPadding(false);
        this.b.addView(linearLayout, new FrameLayout.LayoutParams(-1, -2));
        ImageView imageView = new ImageView(context);
        this.c = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        ImageView imageView2 = this.c;
        int i11 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.ui.ActionBar.r6.t(imageView2, i11, this.resourceProvider, PorterDuff.Mode.SRC_IN);
        this.c.setImageResource(R.drawable.ic_ab_close);
        ImageView imageView3 = this.c;
        int i12 = org.telegram.ui.ActionBar.k6.i6;
        org.telegram.ui.ActionBar.r6.R(imageView3, org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.w0(i12, this.resourceProvider), 3, -1), null, org.telegram.ui.ActionBar.r6.N(i12), this.resourceProvider);
        this.c.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Wallet.t8
            public final /* synthetic */ u8 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i3) {
                    case 0:
                        this.b.finishFragment();
                        break;
                    default:
                        u8.Z(this.b);
                        break;
                }
            }
        });
        frameLayout.addView(this.c, mf.d(48, 48.0f, 51, 4.0f, 12.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.k9 k9Var = new org.telegram.ui.Components.k9(context);
        k9Var.setAspectFit(true);
        k9Var.getImageReceiver().d = org.telegram.messenger.g0.t0();
        li.b0(org.telegram.messenger.g0.t0()).c2(k9Var, "RestrictedEmoji", "📝", "100_100");
        k9Var.getImageReceiver().X(1);
        linearLayout.addView(k9Var, mf.t(100, 100, 1, 0, 0, 0, 12));
        TextView textView = new TextView(context);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setGravity(1);
        org.telegram.ui.ActionBar.r6.V(textView, i11, this.resourceProvider);
        textView.setText(bd.M0(this.h ? 2131743156 : 2131743080, null));
        TextView f10 = org.telegram.messenger.camera.q.f(linearLayout, textView, mf.t(-1, -2, 1, 32, 0, 32, 10), context);
        f10.setTextSize(1, 14.0f);
        f10.setGravity(1);
        org.telegram.ui.ActionBar.r6.V(f10, org.telegram.ui.ActionBar.k6.z6, this.resourceProvider);
        f10.setText(bd.M0(this.h ? 2131743155 : 2131743079, null));
        linearLayout.addView(f10, mf.t(-1, -2, 1, 32, 0, 32, 8));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.d = linearLayout2;
        linearLayout2.setOrientation(0);
        this.d.setGravity(1);
        linearLayout.addView(this.d, mf.t(-1, -2, 1, 4, 24, 4, 0));
        linearLayout.addView(new View(context), mf.l(1.0f, -1, 0));
        gi.d dVar = new gi.d(context, this.resourceProvider, true);
        this.e = dVar;
        dVar.f();
        this.e.setText(bd.M0(2131743164, null));
        this.e.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Wallet.t8
            public final /* synthetic */ u8 b;

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
                        u8.Z(this.b);
                        break;
                }
            }
        });
        linearLayout.addView(this.e, mf.t(-1, 48, 1, 0, 24, 0, 0));
        a0();
        return this.fragmentView;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onInsets(int i3, int i10, int i11, int i12) {
        ScrollView scrollView = this.b;
        if (scrollView != null) {
            scrollView.setPadding(i3, org.telegram.messenger.g0.L(96.0f) + i10, i11, i12);
        }
        ImageView imageView = this.c;
        if (imageView != null) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) imageView.getLayoutParams();
            layoutParams.leftMargin = org.telegram.messenger.g0.L(4.0f) + i3;
            layoutParams.topMargin = org.telegram.messenger.g0.L(12.0f) + i10;
            this.c.setLayoutParams(layoutParams);
        }
    }
}
