package og;

import android.content.Context;
import android.graphics.PorterDuff;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.i0;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.ActionBar.w6;
import org.telegram.ui.Components.yz0;
import org.telegram.ui.Components.zz0;
import w7.b6;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class v extends FrameLayout {
    public final nh.p a;
    public final FrameLayout b;
    public String c;
    public String d;
    public final ImageView e;

    public v(Context context, p6 p6Var) {
        super(context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.b = frameLayout;
        nh.p pVar = new nh.p(context);
        this.a = pVar;
        pVar.setPadding(i0.L(18.0f), i0.L(13.0f), i0.L(50.0f), i0.L(13.0f));
        final int i10 = 1;
        pVar.setTextSize(1, 16.0f);
        pVar.setEllipsize(TextUtils.TruncateAt.MIDDLE);
        pVar.setSingleLine(true);
        a7.V(pVar, t6.G6, p6Var);
        final int i11 = 0;
        pVar.r = false;
        frameLayout.addView(pVar, b6.e(-2, -2, 17));
        int L = i0.L(8.0f);
        int i12 = t6.e7;
        int w02 = t6.w0(i12, p6Var);
        int i13 = t6.i6;
        int o10 = i0.b.o(t6.w0(i13, p6Var), 76);
        org.telegram.ui.Cells.y k02 = t6.k0(L, L, L, L, w02, o10, o10);
        w6 N = a7.N(i12);
        w6 h = a7.h(i13, 76);
        frameLayout.setBackground(k02);
        a7.k(frameLayout, k02, N, h, p6Var);
        addView(frameLayout, b6.d(-1, -2.0f, 0, 14.0f, 0.0f, 14.0f, 0.0f));
        frameLayout.setOnClickListener(new View.OnClickListener(this) { // from class: og.t
            public final /* synthetic */ v b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        i0.g(this.b.d);
                        break;
                    default:
                        i0.g(this.b.d);
                        break;
                }
            }
        });
        ImageView imageView = new ImageView(getContext());
        this.e = imageView;
        imageView.setImageResource(R.drawable.menu_copy_s);
        a7.t(imageView, t6.j5, p6Var, PorterDuff.Mode.SRC_ATOP);
        imageView.setPadding(i0.L(8.0f), i0.L(8.0f), i0.L(8.0f), i0.L(8.0f));
        int L2 = i0.L(20.0f);
        int o11 = i0.b.o(t6.w0(i13, p6Var), 76);
        imageView.setBackground(t6.k0(L2, L2, L2, L2, 0, o11, o11));
        addView(imageView, b6.d(40, 40.0f, 21, 15.0f, 0.0f, 17.0f, 0.0f));
        imageView.setOnClickListener(new View.OnClickListener(this) { // from class: og.t
            public final /* synthetic */ v b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        i0.g(this.b.d);
                        break;
                    default:
                        i0.g(this.b.d);
                        break;
                }
            }
        });
    }

    public final void a(Runnable runnable) {
        this.e.setVisibility(4);
        int L = i0.L(18.0f);
        int L2 = i0.L(14.0f);
        int L3 = i0.L(14.0f);
        int L4 = i0.L(18.0f);
        nh.p pVar = this.a;
        pVar.setPadding(L, L2, L3, L4);
        yz0 yz0Var = new yz0();
        yz0Var.a |= 256;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("t.me/giftcode/" + this.c);
        if (this.c == null) {
            spannableStringBuilder.append((CharSequence) "1234567891011123654897566536223");
        }
        spannableStringBuilder.setSpan(new zz0(yz0Var, 0), 0, spannableStringBuilder.length(), 33);
        pVar.setText(spannableStringBuilder);
        this.b.setOnClickListener(new u(0, runnable));
    }

    public void setSlug(String str) {
        this.c = str;
        this.d = sc.e.h("https://t.me/giftcode/", str);
        this.a.setText("t.me/giftcode/" + str);
    }
}
