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
import org.telegram.messenger.ui;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes4.dex */
public final class v8 extends org.telegram.ui.ActionBar.f2 {
    public final ArrayList a;
    public ScrollView b;
    public ImageView c;
    public LinearLayout d;
    public fi.d e;
    public Runnable f;
    public boolean h;

    public v8() {
        super(null);
        this.a = new ArrayList();
    }

    public static void Z(v8 v8Var) {
        ArrayList arrayList = v8Var.a;
        if (arrayList.size() == 12 || arrayList.size() == 24) {
            fa faVar = new fa(arrayList, new l(v8Var, 12));
            faVar.setCurrentAccount(v8Var.currentAccount);
            v8Var.presentFragment(faVar);
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
        boolean z9 = true;
        int size = (arrayList.size() + 1) / 2;
        this.d.addView(o8.j0(0, size, context, arrayList, this.resourceProvider), c8.ha.p(0, -2, 1.0f, 48));
        this.d.addView(new View(context), c8.ha.o(10, 0));
        this.d.addView(o8.j0(size, arrayList.size(), context, arrayList, this.resourceProvider), c8.ha.p(0, -2, 1.0f, 48));
        fi.d dVar = this.e;
        if (dVar != null) {
            if (arrayList.size() != 12 && arrayList.size() != 24) {
                z9 = false;
            }
            dVar.setEnabled(z9);
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final View createView(Context context) {
        final int i7 = 0;
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
        frameLayout.addView(this.b, c8.ha.c(-1.0f, -1));
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
        this.c.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Wallet.u8
            public final /* synthetic */ v8 b;

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
                        v8.Z(this.b);
                        break;
                }
            }
        });
        frameLayout.addView(this.c, c8.ha.d(48, 48.0f, 51, 4.0f, 12.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.l9 l9Var = new org.telegram.ui.Components.l9(context);
        l9Var.setAspectFit(true);
        l9Var.getImageReceiver().d = org.telegram.messenger.g0.t0();
        ui.b0(org.telegram.messenger.g0.t0()).c2(l9Var, "RestrictedEmoji", "📝", "100_100");
        l9Var.getImageReceiver().X(1);
        linearLayout.addView(l9Var, c8.ha.t(100, 100, 1, 0, 0, 0, 12));
        TextView textView = new TextView(context);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setGravity(1);
        org.telegram.ui.ActionBar.r6.V(textView, i11, this.resourceProvider);
        textView.setText(hd.M0(this.h ? 2131743147 : 2131743071, null));
        TextView f10 = org.telegram.messenger.camera.q.f(linearLayout, textView, c8.ha.t(-1, -2, 1, 32, 0, 32, 10), context);
        f10.setTextSize(1, 14.0f);
        f10.setGravity(1);
        org.telegram.ui.ActionBar.r6.V(f10, org.telegram.ui.ActionBar.k6.z6, this.resourceProvider);
        f10.setText(hd.M0(this.h ? 2131743146 : 2131743070, null));
        linearLayout.addView(f10, c8.ha.t(-1, -2, 1, 32, 0, 32, 8));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.d = linearLayout2;
        linearLayout2.setOrientation(0);
        this.d.setGravity(1);
        linearLayout.addView(this.d, c8.ha.t(-1, -2, 1, 4, 24, 4, 0));
        linearLayout.addView(new View(context), c8.ha.l(1.0f, -1, 0));
        fi.d dVar = new fi.d(context, this.resourceProvider, true);
        this.e = dVar;
        dVar.f();
        this.e.setText(hd.M0(2131743155, null));
        this.e.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Wallet.u8
            public final /* synthetic */ v8 b;

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
                        v8.Z(this.b);
                        break;
                }
            }
        });
        linearLayout.addView(this.e, c8.ha.t(-1, 48, 1, 0, 24, 0, 0));
        a0();
        return this.fragmentView;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.f2
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
