package ji;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import c8.ha;
import java.util.HashSet;
import org.telegram.messenger.camera.q;
import org.telegram.messenger.g0;
import org.telegram.messenger.id;
import org.telegram.messenger.k5;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.l6;
import org.telegram.ui.ActionBar.s6;
import org.telegram.ui.Components.ea0;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes4.dex */
public final class j extends LinearLayout implements b6 {
    public final g6 a;
    public final ea0 b;
    public final FrameLayout c;
    public final ImageView d;
    public final TextView e;
    public final TextView f;
    public final boolean h;
    public boolean n;

    public j(Context context, g6 g6Var, boolean z9) {
        super(context);
        this.a = g6Var;
        this.h = z9;
        setOrientation(0);
        FrameLayout frameLayout = new FrameLayout(context);
        this.c = frameLayout;
        ea0 ea0Var = new ea0(1);
        this.b = ea0Var;
        frameLayout.setBackground(ea0Var);
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        frameLayout.addView(imageView, ha.e(24, 24, 17));
        LinearLayout f10 = k5.f(context, 1);
        TextView textView = new TextView(context);
        this.e = textView;
        textView.setTextSize(1, 16.0f);
        TextView f11 = q.f(f10, textView, ha.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2), context);
        this.f = f11;
        f11.setGravity(17);
        f11.setMinWidth(g0.L(20.66f));
        f11.setPadding(g0.L(6.33f), 0, g0.L(6.33f), 0);
        f11.setTextSize(1, 16.0f);
        if (id.a0) {
            addView(f11, ha.j(13.33f, 0.0f));
            addView(f10, ha.q(0, -2, 1.0f, 23, 20, 0, z9 ? 12 : 16, 0));
            addView(frameLayout, ha.t(28, 28, 21, 0, 0, z9 ? 9 : 14, 0));
        } else {
            addView(frameLayout, ha.t(28, 28, 19, z9 ? 9 : 14, 0, 0, 0));
            addView(f10, ha.q(0, -2, 1.0f, 23, z9 ? 12 : 16, 0, 20, 0));
            addView(f11, ha.j(0.0f, 13.33f));
        }
        updateColors();
        setUnreadMode(true);
    }

    public final void a(int i7, int i10, int i11, CharSequence charSequence, CharSequence charSequence2, boolean z9) {
        this.c.setVisibility(i11 != 0 ? 0 : 8);
        this.e.setTranslationX(i11 == 0 ? g0.L(2.0f) : 0.0f);
        this.b.b(i7, i10);
        this.d.setImageResource(i11);
        setTitle(charSequence);
        setValue(charSequence2);
        setUnreadMode(z9);
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(l6.G6));
        hashSet.add(Integer.valueOf(l6.U8));
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(g0.L(this.h ? 44.0f : 50.0f), TLObject.FLAG_30));
    }

    public void setTitle(CharSequence charSequence) {
        this.e.setText(charSequence);
    }

    public void setUnreadMode(boolean z9) {
        if (this.n != z9) {
            this.n = z9;
            float f10 = z9 ? 13.0f : 16.0f;
            TextView textView = this.f;
            textView.setTextSize(1, f10);
            textView.setTypeface(z9 ? g0.o() : null);
            int i7 = z9 ? l6.W8 : l6.n6;
            g6 g6Var = this.a;
            s6.U(textView, i7, g6Var);
            textView.setBackground(z9 ? l6.d0(g0.L(10.33f), l6.w0(l6.U8, g6Var)) : null);
        }
    }

    public void setValue(CharSequence charSequence) {
        int i7 = !TextUtils.isEmpty(charSequence) ? 0 : 8;
        TextView textView = this.f;
        textView.setVisibility(i7);
        textView.setText(charSequence);
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final void updateColors() {
        int i7 = l6.G6;
        g6 g6Var = this.a;
        this.e.setTextColor(l6.w0(i7, g6Var));
        int w02 = l6.w0(this.n ? l6.W8 : l6.n6, g6Var);
        TextView textView = this.f;
        textView.setTextColor(w02);
        textView.setBackground(this.n ? l6.d0(g0.L(10.33f), l6.w0(l6.U8, g6Var)) : null);
        this.b.b = g6Var != null ? g6Var.a() : l6.I.q();
    }
}
