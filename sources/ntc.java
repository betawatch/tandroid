// default package

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
import org.telegram.ui.ActionBar.e;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes3.dex */
public final class ntc extends e {
    public final ArrayList a;
    public ScrollView b;
    public ImageView c;
    public LinearLayout d;
    public c51 e;
    public Runnable f;
    public boolean h;

    public ntc() {
        super(null);
        this.a = new ArrayList();
    }

    public final void Y() {
        ArrayList arrayList = this.a;
        if (arrayList.size() == 12 || arrayList.size() == 24) {
            tuc tucVar = new tuc(arrayList, new olc(this, (byte) 13));
            tucVar.setCurrentAccount(this.currentAccount);
            presentFragment(tucVar);
        }
    }

    public final void Z() {
        LinearLayout linearLayout = this.d;
        if (linearLayout != null) {
            linearLayout.removeAllViews();
            Context context = this.d.getContext();
            ArrayList arrayList = this.a;
            boolean z = true;
            int size = (arrayList.size() + 1) / 2;
            this.d.addView(gtc.i0(0, size, this.resourceProvider, context, arrayList), tre.p(0, -2, 1.0f, 48));
            this.d.addView(new View(context), tre.o(10, 0));
            this.d.addView(gtc.i0(size, arrayList.size(), this.resourceProvider, context, arrayList), tre.p(0, -2, 1.0f, 48));
            c51 c51Var = this.e;
            if (c51Var != null) {
                if (arrayList.size() != 12 && arrayList.size() != 24) {
                    z = false;
                }
                c51Var.setEnabled(z);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.e
    public final View createView(Context context) {
        final byte b = 0;
        this.actionBar.setAddToContainer(false);
        this.actionBar.setOccupyStatusBar(false);
        FrameLayout frameLayout = new FrameLayout(context);
        yob.h(aob.d6, this.resourceProvider, frameLayout);
        this.fragmentView = frameLayout;
        ScrollView scrollView = new ScrollView(context);
        this.b = scrollView;
        final byte b2 = 1;
        scrollView.setFillViewport(true);
        this.b.setVerticalScrollBarEnabled(false);
        this.b.setClipToPadding(false);
        this.b.setPadding(0, hl.L(96.0f), 0, 0);
        frameLayout.addView(this.b, tre.c(-1.0f, -1));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(hl.L(36.0f), 0, hl.L(36.0f), hl.L(24.0f));
        linearLayout.setClipToPadding(false);
        this.b.addView(linearLayout, new FrameLayout.LayoutParams(-1, -2));
        ImageView imageView = new ImageView(context);
        this.c = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        ImageView imageView2 = this.c;
        int i = aob.G6;
        yob.s(imageView2, i, this.resourceProvider, PorterDuff.Mode.SRC_IN);
        this.c.setImageResource(R.drawable.ic_ab_close);
        ImageView imageView3 = this.c;
        int i2 = aob.i6;
        yob.R(imageView3, aob.f0(aob.v0(i2, this.resourceProvider), 3, -1), null, yob.M(i2), this.resourceProvider);
        this.c.setOnClickListener(new View.OnClickListener(this) { // from class: mtc
            public final /* synthetic */ ntc b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b3 = b;
                ntc ntcVar = this.b;
                switch (b3) {
                    case 0:
                        ntcVar.finishFragment();
                        break;
                    default:
                        ntcVar.Y();
                        break;
                }
            }
        });
        frameLayout.addView(this.c, tre.d(48, 48.0f, 51, 4.0f, 12.0f, 0.0f, 0.0f));
        de0 de0Var = new de0(context);
        de0Var.setAspectFit(true);
        de0Var.getImageReceiver().d = hl.t0();
        ls6.d0(hl.t0()).e2(de0Var, "RestrictedEmoji", "📝", "100_100");
        de0Var.getImageReceiver().N(1);
        linearLayout.addView(de0Var, tre.t(100, 100, 1, 0, 0, 0, 12));
        TextView textView = new TextView(context);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(hl.o());
        textView.setGravity(1);
        yob.X(textView, i, this.resourceProvider);
        textView.setText(ob6.M0(this.h ? 2131742797 : 2131742720, null));
        TextView m = ik8.m(linearLayout, textView, tre.t(-1, -2, 1, 32, 0, 32, 10), context);
        m.setTextSize(1, 14.0f);
        m.setGravity(1);
        yob.X(m, aob.z6, this.resourceProvider);
        m.setText(ob6.M0(this.h ? 2131742796 : 2131742719, null));
        linearLayout.addView(m, tre.t(-1, -2, 1, 32, 0, 32, 8));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.d = linearLayout2;
        linearLayout2.setOrientation(0);
        this.d.setGravity(1);
        linearLayout.addView(this.d, tre.t(-1, -2, 1, 4, 24, 4, 0));
        linearLayout.addView(new View(context), tre.l(1.0f, -1, 0));
        c51 c51Var = new c51(this.resourceProvider, context, true);
        this.e = c51Var;
        c51Var.f();
        this.e.setText(ob6.M0(2131742805, null));
        this.e.setOnClickListener(new View.OnClickListener(this) { // from class: mtc
            public final /* synthetic */ ntc b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b3 = b2;
                ntc ntcVar = this.b;
                switch (b3) {
                    case 0:
                        ntcVar.finishFragment();
                        break;
                    default:
                        ntcVar.Y();
                        break;
                }
            }
        });
        linearLayout.addView(this.e, tre.t(-1, 48, 1, 0, 24, 0, 0));
        Z();
        return this.fragmentView;
    }

    @Override // org.telegram.ui.ActionBar.e
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void onInsets(int i, int i2, int i3, int i4) {
        ScrollView scrollView = this.b;
        if (scrollView != null) {
            scrollView.setPadding(i, hl.L(96.0f) + i2, i3, i4);
        }
        ImageView imageView = this.c;
        if (imageView != null) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) imageView.getLayoutParams();
            layoutParams.leftMargin = hl.L(4.0f) + i;
            layoutParams.topMargin = hl.L(12.0f) + i2;
            this.c.setLayoutParams(layoutParams);
        }
    }
}
