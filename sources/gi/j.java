package gi;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.internal.vision.e2;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.rk;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.z5;
import org.telegram.ui.Components.bc0;
import w7.y5;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes4.dex */
public final class j extends LinearLayout implements z5 {
    public final f6 a;
    public final bc0 b;
    public final FrameLayout c;
    public final ImageView d;
    public final TextView e;
    public final TextView f;
    public final boolean h;
    public boolean n;

    public j(Context context, f6 f6Var, boolean z10) {
        super(context);
        this.a = f6Var;
        this.h = z10;
        setOrientation(0);
        FrameLayout frameLayout = new FrameLayout(context);
        this.c = frameLayout;
        bc0 bc0Var = new bc0(1);
        this.b = bc0Var;
        frameLayout.setBackground(bc0Var);
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        frameLayout.addView(imageView, y5.e(24, 24, 17));
        LinearLayout f7 = rk.f(context, 1);
        TextView textView = new TextView(context);
        this.e = textView;
        textView.setTextSize(1, 16.0f);
        TextView h = e2.h(f7, textView, y5.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2), context);
        this.f = h;
        h.setGravity(17);
        h.setMinWidth(AndroidUtilities.dp(20.66f));
        h.setPadding(AndroidUtilities.dp(6.33f), 0, AndroidUtilities.dp(6.33f), 0);
        h.setTextSize(1, 16.0f);
        if (LocaleController.isRTL) {
            addView(h, y5.j(13.33f, 0.0f));
            addView(f7, y5.p(0, -2, 1.0f, 23, 20, 0, z10 ? 12 : 16, 0));
            addView(frameLayout, y5.t(28, 28, 21, 0, 0, z10 ? 9 : 14, 0));
        } else {
            addView(frameLayout, y5.t(28, 28, 19, z10 ? 9 : 14, 0, 0, 0));
            addView(f7, y5.p(0, -2, 1.0f, 23, z10 ? 12 : 16, 0, 20, 0));
            addView(h, y5.j(0.0f, 13.33f));
        }
        e();
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

    @Override // org.telegram.ui.ActionBar.z5
    public final void e() {
        int i10 = j6.G6;
        f6 f6Var = this.a;
        this.e.setTextColor(j6.v0(i10, f6Var));
        int v02 = j6.v0(this.n ? j6.W8 : j6.n6, f6Var);
        TextView textView = this.f;
        textView.setTextColor(v02);
        textView.setBackground(this.n ? j6.b0(AndroidUtilities.dp(10.33f), j6.v0(j6.U8, f6Var)) : null);
        this.b.b = f6Var != null ? f6Var.a() : j6.I.q();
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
            int i10 = z10 ? j6.W8 : j6.n6;
            f6 f6Var = this.a;
            textView.setTextColor(j6.v0(i10, f6Var));
            textView.setBackground(z10 ? j6.b0(AndroidUtilities.dp(10.33f), j6.v0(j6.U8, f6Var)) : null);
        }
    }

    public void setValue(CharSequence charSequence) {
        int i10 = !TextUtils.isEmpty(charSequence) ? 0 : 8;
        TextView textView = this.f;
        textView.setVisibility(i10);
        textView.setText(charSequence);
    }
}
