package gg;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import i7.f6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.h01;
import org.telegram.ui.Components.i01;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class v extends FrameLayout {
    public final gh.s a;
    public final FrameLayout b;
    public String c;
    public String d;
    public final ImageView e;

    public v(Context context, c6 c6Var) {
        super(context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.b = frameLayout;
        gh.s sVar = new gh.s(context);
        this.a = sVar;
        sVar.setPadding(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(50.0f), AndroidUtilities.dp(13.0f));
        sVar.setTextSize(1, 16.0f);
        sVar.setEllipsize(TextUtils.TruncateAt.MIDDLE);
        sVar.setSingleLine(true);
        sVar.setTextColor(g6.v0(g6.G6, c6Var));
        sVar.f = false;
        frameLayout.addView(sVar, f6.e(-2, -2, 17));
        int dp = AndroidUtilities.dp(8.0f);
        int v02 = g6.v0(g6.e7, c6Var);
        int i10 = g6.i6;
        int k9 = i0.a.k(g6.v0(i10, c6Var), 76);
        frameLayout.setBackground(g6.i0(dp, dp, dp, dp, v02, k9, k9));
        addView(frameLayout, f6.d(-1, -2.0f, 0, 14.0f, 0.0f, 14.0f, 0.0f));
        final int i11 = 0;
        frameLayout.setOnClickListener(new View.OnClickListener(this) { // from class: gg.t
            public final /* synthetic */ v b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        AndroidUtilities.addToClipboard(this.b.d);
                        break;
                    default:
                        AndroidUtilities.addToClipboard(this.b.d);
                        break;
                }
            }
        });
        ImageView imageView = new ImageView(getContext());
        this.e = imageView;
        imageView.setImageResource(R.drawable.menu_copy_s);
        imageView.setColorFilter(g6.v0(g6.j5, c6Var));
        imageView.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        int dp2 = AndroidUtilities.dp(20.0f);
        int k10 = i0.a.k(g6.v0(i10, c6Var), 76);
        imageView.setBackground(g6.i0(dp2, dp2, dp2, dp2, 0, k10, k10));
        addView(imageView, f6.d(40, 40.0f, 21, 15.0f, 0.0f, 17.0f, 0.0f));
        final int i12 = 1;
        imageView.setOnClickListener(new View.OnClickListener(this) { // from class: gg.t
            public final /* synthetic */ v b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i12) {
                    case 0:
                        AndroidUtilities.addToClipboard(this.b.d);
                        break;
                    default:
                        AndroidUtilities.addToClipboard(this.b.d);
                        break;
                }
            }
        });
    }

    public final void a(Runnable runnable) {
        this.e.setVisibility(4);
        int dp = AndroidUtilities.dp(18.0f);
        int dp2 = AndroidUtilities.dp(14.0f);
        int dp3 = AndroidUtilities.dp(14.0f);
        int dp4 = AndroidUtilities.dp(18.0f);
        gh.s sVar = this.a;
        sVar.setPadding(dp, dp2, dp3, dp4);
        h01 h01Var = new h01();
        h01Var.a |= 256;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("t.me/giftcode/" + this.c);
        if (this.c == null) {
            spannableStringBuilder.append((CharSequence) "1234567891011123654897566536223");
        }
        spannableStringBuilder.setSpan(new i01(h01Var, 0), 0, spannableStringBuilder.length(), 33);
        sVar.setText(spannableStringBuilder);
        this.b.setOnClickListener(new u(0, runnable));
    }

    public void setSlug(String str) {
        this.c = str;
        this.d = u3.c.e("https://t.me/giftcode/", str);
        this.a.setText("t.me/giftcode/" + str);
    }
}
