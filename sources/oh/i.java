package oh;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import g7.e6;
import j3.r0;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.ll;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.w5;
import org.telegram.ui.Components.xa0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class i extends LinearLayout implements w5 {
    public final b6 a;
    public final xa0 b;
    public final FrameLayout c;
    public final ImageView d;
    public final TextView e;
    public final TextView f;
    public final boolean h;
    public boolean n;

    public i(Context context, b6 b6Var, boolean z10) {
        super(context);
        this.a = b6Var;
        this.h = z10;
        setOrientation(0);
        FrameLayout frameLayout = new FrameLayout(context);
        this.c = frameLayout;
        xa0 xa0Var = new xa0(1);
        this.b = xa0Var;
        frameLayout.setBackground(xa0Var);
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        frameLayout.addView(imageView, e6.e(24, 24, 17));
        LinearLayout f10 = ll.f(context, 1);
        TextView textView = new TextView(context);
        this.e = textView;
        textView.setTextSize(1, 16.0f);
        TextView h = r0.h(f10, textView, e6.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2), context);
        this.f = h;
        h.setGravity(17);
        h.setMinWidth(AndroidUtilities.dp(20.66f));
        h.setPadding(AndroidUtilities.dp(6.33f), 0, AndroidUtilities.dp(6.33f), 0);
        h.setTextSize(1, 16.0f);
        if (LocaleController.isRTL) {
            addView(h, e6.j(13.33f, 0.0f));
            addView(f10, e6.p(0, -2, 1.0f, 23, 20, 0, z10 ? 12 : 16, 0));
            addView(frameLayout, e6.t(28, 28, 21, 0, 0, z10 ? 9 : 14, 0));
        } else {
            addView(frameLayout, e6.t(28, 28, 19, z10 ? 9 : 14, 0, 0, 0));
            addView(f10, e6.p(0, -2, 1.0f, 23, z10 ? 12 : 16, 0, 20, 0));
            addView(h, e6.j(0.0f, 13.33f));
        }
        d();
        setUnreadMode(true);
    }

    public final void a(int i9, int i10, int i11, CharSequence charSequence, CharSequence charSequence2, boolean z10) {
        this.c.setVisibility(i11 != 0 ? 0 : 8);
        this.e.setTranslationX(i11 == 0 ? AndroidUtilities.dp(2.0f) : 0.0f);
        this.b.b(i9, i10);
        this.d.setImageResource(i11);
        setTitle(charSequence);
        setValue(charSequence2);
        setUnreadMode(z10);
    }

    @Override // org.telegram.ui.ActionBar.w5
    public final void d() {
        int i9 = f6.G6;
        b6 b6Var = this.a;
        this.e.setTextColor(f6.v0(i9, b6Var));
        int v02 = f6.v0(this.n ? f6.W8 : f6.n6, b6Var);
        TextView textView = this.f;
        textView.setTextColor(v02);
        textView.setBackground(this.n ? f6.b0(AndroidUtilities.dp(10.33f), f6.v0(f6.U8, b6Var)) : null);
        this.b.b = b6Var != null ? b6Var.a() : f6.I.q();
    }

    public /* bridge */ /* synthetic */ int[] getColorKeys() {
        return null;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i9), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(this.h ? 44.0f : 50.0f), TLObject.FLAG_30));
    }

    public void setTitle(CharSequence charSequence) {
        this.e.setText(charSequence);
    }

    public void setUnreadMode(boolean z10) {
        if (this.n != z10) {
            this.n = z10;
            float f10 = z10 ? 13.0f : 16.0f;
            TextView textView = this.f;
            textView.setTextSize(1, f10);
            textView.setTypeface(z10 ? AndroidUtilities.bold() : null);
            int i9 = z10 ? f6.W8 : f6.n6;
            b6 b6Var = this.a;
            textView.setTextColor(f6.v0(i9, b6Var));
            textView.setBackground(z10 ? f6.b0(AndroidUtilities.dp(10.33f), f6.v0(f6.U8, b6Var)) : null);
        }
    }

    public void setValue(CharSequence charSequence) {
        int i9 = !TextUtils.isEmpty(charSequence) ? 0 : 8;
        TextView textView = this.f;
        textView.setVisibility(i9);
        textView.setText(charSequence);
    }
}
