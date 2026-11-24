// default package

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class lga extends FrameLayout implements vlb {
    public final ylb a;
    public final ut8 b;
    public final View c;

    public lga(int i, Context context, boolean z, ylb ylbVar, c0a c0aVar) {
        super(context);
        this.a = ylbVar;
        ut8 ut8Var = new ut8(context, ylbVar);
        this.b = ut8Var;
        int i2 = cmb.h6;
        fg0 f0 = cmb.f0(cmb.v0(i2, ylbVar), 2, -1);
        wmb M = anb.M(i2);
        ut8Var.setBackground(f0);
        anb.j(ut8Var, f0, null, M, ylbVar);
        addView(ut8Var, qoe.c(-2.0f, -1));
        View view = new View(context);
        this.c = view;
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
        int i3 = cmb.c6;
        view.setBackground(new GradientDrawable(orientation, new int[]{cmb.p1(0.4f, cmb.v0(i3, ylbVar)), cmb.v0(i3, ylbVar)}));
        addView(view, qoe.c(60.0f, -1));
        b61 b61Var = new b61(ylbVar, context, true);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) jb6.M0(z ? 2131748086 : 2131748084, null));
        spannableStringBuilder.append((CharSequence) " ");
        SpannableString spannableString = new SpannableString("l");
        spannableString.setSpan(new pn2(R.drawable.msg_mini_lock2, 0), 0, 1, 33);
        spannableStringBuilder.append((CharSequence) spannableString);
        b61Var.i(spannableStringBuilder, false, true);
        addView(b61Var, qoe.d(-1, 48.0f, 48, 14.0f, 38.0f, 14.0f, 0.0f));
        b61Var.setOnClickListener(new wk8(c0aVar, (byte) 29));
        l66 l66Var = new l66(context, ylbVar);
        l66Var.setTextSize(1, 13.0f);
        l66Var.setTextAlignment(4);
        l66Var.setGravity(17);
        anb.X(l66Var, cmb.F6, ylbVar);
        anb.G(l66Var, cmb.m6, ylbVar);
        l66Var.setLineSpacing(gm.L(3.0f), 1.0f);
        SpannableStringBuilder N2 = gm.N2(jb6.M0(z ? 2131748085 : 2131748083, null), -1, 2, new c0a(c0aVar, (byte) 15), null);
        SpannableString spannableString2 = new SpannableString(String.valueOf(oc7.r1(i).l4.R1.f()));
        spannableString2.setSpan(new z5c(gm.o()), 0, spannableString2.length(), 33);
        l66Var.setText(gm.G2(N2, spannableString2, "%s"));
        addView(l66Var, qoe.d(-1, -2.0f, 49, 24.0f, 96.0f, 24.0f, 12.0f));
    }

    @Override // vlb
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(cmb.c6));
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(gm.L(145.0f), TLObject.FLAG_30));
    }

    @Override // vlb
    public final void updateColors() {
        ylb ylbVar = this.a;
        View view = this.c;
        if (view != null) {
            try {
                if (view.getBackground() instanceof GradientDrawable) {
                    GradientDrawable gradientDrawable = (GradientDrawable) view.getBackground();
                    int i = cmb.c6;
                    gradientDrawable.setColors(new int[]{cmb.p1(0.4f, cmb.v0(i, ylbVar)), cmb.v0(i, ylbVar)});
                }
            } catch (Exception e) {
                fc4.g(e, true);
            }
        }
    }
}
