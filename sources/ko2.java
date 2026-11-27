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

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class ko2 extends LinearLayout implements snb {
    public final vnb a;
    public final n57 b;
    public final FrameLayout c;
    public final ImageView d;
    public final TextView e;
    public final TextView f;
    public final boolean h;
    public boolean n;

    public ko2(vnb vnbVar, Context context, boolean z) {
        super(context);
        this.a = vnbVar;
        this.h = z;
        setOrientation(0);
        FrameLayout frameLayout = new FrameLayout(context);
        this.c = frameLayout;
        n57 n57Var = new n57((byte) 1);
        this.b = n57Var;
        frameLayout.setBackground(n57Var);
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        frameLayout.addView(imageView, tre.e(24, 24, 17));
        LinearLayout j = uh9.j(context, 1);
        TextView textView = new TextView(context);
        this.e = textView;
        textView.setTextSize(1, 16.0f);
        TextView m = ik8.m(j, textView, tre.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2), context);
        this.f = m;
        m.setGravity(17);
        m.setMinWidth(hl.L(20.66f));
        m.setPadding(hl.L(6.33f), 0, hl.L(6.33f), 0);
        m.setTextSize(1, 16.0f);
        if (ob6.a0) {
            addView(m, tre.j(13.33f, 0.0f));
            addView(j, tre.q(0, -2, 1.0f, 23, 20, 0, z ? 12 : 16, 0));
            addView(frameLayout, tre.t(28, 28, 21, 0, 0, z ? 9 : 14, 0));
        } else {
            addView(frameLayout, tre.t(28, 28, 19, z ? 9 : 14, 0, 0, 0));
            addView(j, tre.q(0, -2, 1.0f, 23, z ? 12 : 16, 0, 20, 0));
            addView(m, tre.j(0.0f, 13.33f));
        }
        updateColors();
        setUnreadMode(true);
    }

    public final void a(int i, int i2, int i3, CharSequence charSequence, CharSequence charSequence2, boolean z) {
        this.c.setVisibility(i3 != 0 ? 0 : 8);
        this.e.setTranslationX(i3 == 0 ? hl.L(2.0f) : 0.0f);
        this.b.b(i, i2);
        this.d.setImageResource(i3);
        setTitle(charSequence);
        setValue(charSequence2);
        setUnreadMode(z);
    }

    @Override // snb
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(aob.G6));
        hashSet.add(Integer.valueOf(aob.U8));
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(hl.L(this.h ? 44.0f : 50.0f), TLObject.FLAG_30));
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
            textView.setTypeface(z ? hl.o() : null);
            int i = z ? aob.W8 : aob.n6;
            vnb vnbVar = this.a;
            yob.X(textView, i, vnbVar);
            textView.setBackground(z ? aob.b0(hl.L(10.33f), aob.v0(aob.U8, vnbVar)) : null);
        }
    }

    public void setValue(CharSequence charSequence) {
        int i = !TextUtils.isEmpty(charSequence) ? 0 : 8;
        TextView textView = this.f;
        textView.setVisibility(i);
        textView.setText(charSequence);
    }

    @Override // snb
    public final void updateColors() {
        int i = aob.G6;
        vnb vnbVar = this.a;
        this.e.setTextColor(aob.v0(i, vnbVar));
        int v0 = aob.v0(this.n ? aob.W8 : aob.n6, vnbVar);
        TextView textView = this.f;
        textView.setTextColor(v0);
        textView.setBackground(this.n ? aob.b0(hl.L(10.33f), aob.v0(aob.U8, vnbVar)) : null);
        this.b.b = vnbVar != null ? vnbVar.a() : aob.I.o();
    }
}
