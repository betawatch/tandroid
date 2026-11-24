// default package

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class cp2 extends LinearLayout implements vlb {
    public final ylb a;
    public final g57 b;
    public final FrameLayout c;
    public final ImageView d;
    public final TextView e;
    public final TextView f;
    public final boolean h;
    public boolean n;

    public cp2(ylb ylbVar, Context context, boolean z) {
        super(context);
        this.a = ylbVar;
        this.h = z;
        setOrientation(0);
        FrameLayout frameLayout = new FrameLayout(context);
        this.c = frameLayout;
        g57 g57Var = new g57((byte) 1);
        this.b = g57Var;
        frameLayout.setBackground(g57Var);
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        frameLayout.addView(imageView, qoe.e(24, 24, 17));
        LinearLayout i = hg9.i(context, 1);
        TextView textView = new TextView(context);
        this.e = textView;
        textView.setTextSize(1, 16.0f);
        TextView m = wi8.m(i, textView, qoe.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2), context);
        this.f = m;
        m.setGravity(17);
        m.setMinWidth(gm.L(20.66f));
        m.setPadding(gm.L(6.33f), 0, gm.L(6.33f), 0);
        m.setTextSize(1, 16.0f);
        if (jb6.a0) {
            addView(m, qoe.j(13.33f, 0.0f));
            addView(i, qoe.q(0, -2, 1.0f, 23, 20, 0, z ? 12 : 16, 0));
            addView(frameLayout, qoe.t(28, 28, 21, 0, 0, z ? 9 : 14, 0));
        } else {
            addView(frameLayout, qoe.t(28, 28, 19, z ? 9 : 14, 0, 0, 0));
            addView(i, qoe.q(0, -2, 1.0f, 23, z ? 12 : 16, 0, 20, 0));
            addView(m, qoe.j(0.0f, 13.33f));
        }
        updateColors();
        setUnreadMode(true);
    }

    public final void a(int i, int i2, int i3, CharSequence charSequence, CharSequence charSequence2, boolean z) {
        this.c.setVisibility(i3 != 0 ? 0 : 8);
        this.e.setTranslationX(i3 == 0 ? gm.L(2.0f) : 0.0f);
        this.b.b(i, i2);
        this.d.setImageResource(i3);
        setTitle(charSequence);
        setValue(charSequence2);
        setUnreadMode(z);
    }

    @Override // vlb
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(cmb.F6));
        hashSet.add(Integer.valueOf(cmb.T8));
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(gm.L(this.h ? 44.0f : 50.0f), TLObject.FLAG_30));
    }

    public void setTitle(CharSequence charSequence) {
        this.e.setText(charSequence);
    }

    public void setUnreadMode(boolean z) {
        if (this.n != z) {
            this.n = z;
            float f = z ? 13.0f : 16.0f;
            TextView textView = this.f;
            textView.setTextSize(1, f);
            textView.setTypeface(z ? gm.o() : null);
            int i = z ? cmb.V8 : cmb.m6;
            ylb ylbVar = this.a;
            anb.X(textView, i, ylbVar);
            textView.setBackground(z ? cmb.b0(gm.L(10.33f), cmb.v0(cmb.T8, ylbVar)) : null);
        }
    }

    public void setValue(CharSequence charSequence) {
        int i = !TextUtils.isEmpty(charSequence) ? 0 : 8;
        TextView textView = this.f;
        textView.setVisibility(i);
        textView.setText(charSequence);
    }

    @Override // vlb
    public final void updateColors() {
        int i = cmb.F6;
        ylb ylbVar = this.a;
        this.e.setTextColor(cmb.v0(i, ylbVar));
        int v0 = cmb.v0(this.n ? cmb.V8 : cmb.m6, ylbVar);
        TextView textView = this.f;
        textView.setTextColor(v0);
        textView.setBackground(this.n ? cmb.b0(gm.L(10.33f), cmb.v0(cmb.T8, ylbVar)) : null);
        this.b.b = ylbVar != null ? ylbVar.a() : cmb.I.o();
    }
}
