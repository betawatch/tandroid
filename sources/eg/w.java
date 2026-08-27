package eg;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import h7.z5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.xz0;
import org.telegram.ui.Components.yz0;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class w extends FrameLayout {
    public final eh.s a;
    public final FrameLayout b;
    public String c;
    public String d;
    public final ImageView e;

    public w(Context context, c6 c6Var) {
        super(context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.b = frameLayout;
        eh.s sVar = new eh.s(context);
        this.a = sVar;
        sVar.setPadding(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(50.0f), AndroidUtilities.dp(13.0f));
        sVar.setTextSize(1, 16.0f);
        sVar.setEllipsize(TextUtils.TruncateAt.MIDDLE);
        sVar.setSingleLine(true);
        sVar.setTextColor(g6.v0(g6.G6, c6Var));
        sVar.f = false;
        frameLayout.addView(sVar, z5.e(-2, -2, 17));
        int dp = AndroidUtilities.dp(8.0f);
        int v02 = g6.v0(g6.e7, c6Var);
        int i10 = g6.i6;
        int k10 = i0.b.k(g6.v0(i10, c6Var), 76);
        frameLayout.setBackground(g6.i0(dp, dp, dp, dp, v02, k10, k10));
        addView(frameLayout, z5.d(-1, -2.0f, 0, 14.0f, 0.0f, 14.0f, 0.0f));
        final int i11 = 0;
        frameLayout.setOnClickListener(new View.OnClickListener(this) { // from class: eg.u
            public final /* synthetic */ w b;

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
        int k11 = i0.b.k(g6.v0(i10, c6Var), 76);
        imageView.setBackground(g6.i0(dp2, dp2, dp2, dp2, 0, k11, k11));
        addView(imageView, z5.d(40, 40.0f, 21, 15.0f, 0.0f, 17.0f, 0.0f));
        final int i12 = 1;
        imageView.setOnClickListener(new View.OnClickListener(this) { // from class: eg.u
            public final /* synthetic */ w b;

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
        eh.s sVar = this.a;
        sVar.setPadding(dp, dp2, dp3, dp4);
        xz0 xz0Var = new xz0();
        xz0Var.a |= 256;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("t.me/giftcode/" + this.c);
        if (this.c == null) {
            spannableStringBuilder.append((CharSequence) "1234567891011123654897566536223");
        }
        spannableStringBuilder.setSpan(new yz0(xz0Var, 0), 0, spannableStringBuilder.length(), 33);
        sVar.setText(spannableStringBuilder);
        this.b.setOnClickListener(new v(0, runnable));
    }

    public void setSlug(String str) {
        this.c = str;
        this.d = s3.c.e("https://t.me/giftcode/", str);
        this.a.setText("t.me/giftcode/" + str);
    }
}
