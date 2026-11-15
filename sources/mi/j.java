package mi;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import c8.ja;
import java.util.HashSet;
import org.telegram.messenger.g0;
import org.telegram.messenger.hd;
import org.telegram.messenger.i20;
import org.telegram.messenger.k5;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.q6;
import org.telegram.ui.ActionBar.z5;
import org.telegram.ui.Components.fa0;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes4.dex */
public final class j extends LinearLayout implements z5 {
    public final e6 a;
    public final fa0 b;
    public final FrameLayout c;
    public final ImageView d;
    public final TextView e;
    public final TextView f;
    public final boolean h;
    public boolean n;

    public j(Context context, e6 e6Var, boolean z10) {
        super(context);
        this.a = e6Var;
        this.h = z10;
        setOrientation(0);
        FrameLayout frameLayout = new FrameLayout(context);
        this.c = frameLayout;
        fa0 fa0Var = new fa0(1);
        this.b = fa0Var;
        frameLayout.setBackground(fa0Var);
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        frameLayout.addView(imageView, ja.e(24, 24, 17));
        LinearLayout f10 = k5.f(context, 1);
        TextView textView = new TextView(context);
        this.e = textView;
        textView.setTextSize(1, 16.0f);
        TextView f11 = i20.f(f10, textView, ja.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2), context);
        this.f = f11;
        f11.setGravity(17);
        f11.setMinWidth(g0.L(20.66f));
        f11.setPadding(g0.L(6.33f), 0, g0.L(6.33f), 0);
        f11.setTextSize(1, 16.0f);
        if (hd.a0) {
            addView(f11, ja.j(13.33f, 0.0f));
            addView(f10, ja.q(0, -2, 1.0f, 23, 20, 0, z10 ? 12 : 16, 0));
            addView(frameLayout, ja.t(28, 28, 21, 0, 0, z10 ? 9 : 14, 0));
        } else {
            addView(frameLayout, ja.t(28, 28, 19, z10 ? 9 : 14, 0, 0, 0));
            addView(f10, ja.q(0, -2, 1.0f, 23, z10 ? 12 : 16, 0, 20, 0));
            addView(f11, ja.j(0.0f, 13.33f));
        }
        updateColors();
        setUnreadMode(true);
    }

    public final void a(int i7, int i10, int i11, CharSequence charSequence, CharSequence charSequence2, boolean z10) {
        this.c.setVisibility(i11 != 0 ? 0 : 8);
        this.e.setTranslationX(i11 == 0 ? g0.L(2.0f) : 0.0f);
        this.b.b(i7, i10);
        this.d.setImageResource(i11);
        setTitle(charSequence);
        setValue(charSequence2);
        setUnreadMode(z10);
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(j6.G6));
        hashSet.add(Integer.valueOf(j6.U8));
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(g0.L(this.h ? 44.0f : 50.0f), TLObject.FLAG_30));
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
            textView.setTypeface(z10 ? g0.o() : null);
            int i7 = z10 ? j6.W8 : j6.n6;
            e6 e6Var = this.a;
            q6.U(textView, i7, e6Var);
            textView.setBackground(z10 ? j6.d0(g0.L(10.33f), j6.w0(j6.U8, e6Var)) : null);
        }
    }

    public void setValue(CharSequence charSequence) {
        int i7 = !TextUtils.isEmpty(charSequence) ? 0 : 8;
        TextView textView = this.f;
        textView.setVisibility(i7);
        textView.setText(charSequence);
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final void updateColors() {
        int i7 = j6.G6;
        e6 e6Var = this.a;
        this.e.setTextColor(j6.w0(i7, e6Var));
        int w02 = j6.w0(this.n ? j6.W8 : j6.n6, e6Var);
        TextView textView = this.f;
        textView.setTextColor(w02);
        textView.setBackground(this.n ? j6.d0(g0.L(10.33f), j6.w0(j6.U8, e6Var)) : null);
        this.b.b = e6Var != null ? e6Var.a() : j6.I.q();
    }
}
