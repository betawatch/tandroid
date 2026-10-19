package ii;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.internal.play_billing.k3;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.kk;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.y5;
import org.telegram.ui.Components.jc0;
import w7.z5;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes4.dex */
public final class i extends LinearLayout implements y5 {
    public final d6 a;
    public final jc0 b;
    public final FrameLayout c;
    public final ImageView d;
    public final TextView e;
    public final TextView f;
    public final boolean h;
    public boolean n;

    public i(Context context, d6 d6Var, boolean z10) {
        super(context);
        this.a = d6Var;
        this.h = z10;
        setOrientation(0);
        FrameLayout frameLayout = new FrameLayout(context);
        this.c = frameLayout;
        jc0 jc0Var = new jc0(1);
        this.b = jc0Var;
        frameLayout.setBackground(jc0Var);
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        frameLayout.addView(imageView, z5.e(24, 24, 17));
        LinearLayout e = kk.e(context, 1);
        TextView textView = new TextView(context);
        this.e = textView;
        textView.setTextSize(1, 16.0f);
        TextView i10 = k3.i(e, textView, z5.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2), context);
        this.f = i10;
        i10.setGravity(17);
        i10.setMinWidth(AndroidUtilities.dp(20.66f));
        i10.setPadding(AndroidUtilities.dp(6.33f), 0, AndroidUtilities.dp(6.33f), 0);
        i10.setTextSize(1, 16.0f);
        if (LocaleController.isRTL) {
            addView(i10, z5.j(13.33f, 0.0f));
            addView(e, z5.p(0, -2, 1.0f, 23, 20, 0, z10 ? 12 : 16, 0));
            addView(frameLayout, z5.t(28, 28, 21, 0, 0, z10 ? 9 : 14, 0));
        } else {
            addView(frameLayout, z5.t(28, 28, 19, z10 ? 9 : 14, 0, 0, 0));
            addView(e, z5.p(0, -2, 1.0f, 23, z10 ? 12 : 16, 0, 20, 0));
            addView(i10, z5.j(0.0f, 13.33f));
        }
        d();
        setUnreadMode(true);
    }

    public final void a(int i10, int i11, int i12, CharSequence charSequence, CharSequence charSequence2, boolean z10) {
        this.c.setVisibility(i12 != 0 ? 0 : 8);
        this.e.setTranslationX(i12 == 0 ? AndroidUtilities.dp(2.0f) : 0.0f);
        this.b.b(i10, i11);
        this.d.setImageResource(i12);
        setTitle(charSequence);
        setValue(charSequence2);
        setUnreadMode(z10);
    }

    @Override // org.telegram.ui.ActionBar.y5
    public final void d() {
        int i10 = h6.G6;
        d6 d6Var = this.a;
        this.e.setTextColor(h6.w0(i10, d6Var));
        int w02 = h6.w0(this.n ? h6.W8 : h6.n6, d6Var);
        TextView textView = this.f;
        textView.setTextColor(w02);
        textView.setBackground(this.n ? h6.c0(AndroidUtilities.dp(10.33f), h6.w0(h6.U8, d6Var)) : null);
        this.b.b = d6Var != null ? d6Var.a() : h6.I.q();
    }

    public /* bridge */ /* synthetic */ int[] getColorKeys() {
        return null;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(this.h ? 44.0f : 50.0f), TLObject.FLAG_30));
    }

    public void setTitle(CharSequence charSequence) {
        this.e.setText(charSequence);
    }

    public void setUnreadMode(boolean z10) {
        if (this.n != z10) {
            this.n = z10;
            float f7 = z10 ? 13.0f : 16.0f;
            TextView textView = this.f;
            textView.setTextSize(1, f7);
            textView.setTypeface(z10 ? AndroidUtilities.bold() : null);
            int i10 = z10 ? h6.W8 : h6.n6;
            d6 d6Var = this.a;
            textView.setTextColor(h6.w0(i10, d6Var));
            textView.setBackground(z10 ? h6.c0(AndroidUtilities.dp(10.33f), h6.w0(h6.U8, d6Var)) : null);
        }
    }

    public void setValue(CharSequence charSequence) {
        int i10 = !TextUtils.isEmpty(charSequence) ? 0 : 8;
        TextView textView = this.f;
        textView.setVisibility(i10);
        textView.setText(charSequence);
    }
}
