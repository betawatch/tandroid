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

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class cia extends FrameLayout implements snb {
    public final vnb a;
    public final bv8 b;
    public final View c;

    public cia(int i, Context context, boolean z, vnb vnbVar, ux9 ux9Var) {
        super(context);
        this.a = vnbVar;
        bv8 bv8Var = new bv8(context, vnbVar);
        this.b = bv8Var;
        int i2 = aob.i6;
        hf0 f0 = aob.f0(aob.v0(i2, vnbVar), 2, -1);
        uob M = yob.M(i2);
        bv8Var.setBackground(f0);
        yob.j(bv8Var, f0, null, M, vnbVar);
        addView(bv8Var, tre.c(-2.0f, -1));
        View view = new View(context);
        this.c = view;
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
        int i3 = aob.d6;
        view.setBackground(new GradientDrawable(orientation, new int[]{aob.p1(0.4f, aob.v0(i3, vnbVar)), aob.v0(i3, vnbVar)}));
        addView(view, tre.c(60.0f, -1));
        c51 c51Var = new c51(vnbVar, context, true);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) ob6.M0(z ? 2131748083 : 2131748081, null));
        spannableStringBuilder.append((CharSequence) " ");
        SpannableString spannableString = new SpannableString("l");
        spannableString.setSpan(new wm2(R.drawable.msg_mini_lock2, 0), 0, 1, 33);
        spannableStringBuilder.append((CharSequence) spannableString);
        c51Var.i(spannableStringBuilder, false, true);
        addView(c51Var, tre.d(-1, 48.0f, 48, 14.0f, 38.0f, 14.0f, 0.0f));
        c51Var.setOnClickListener(new jn8(ux9Var, (byte) 28));
        p66 p66Var = new p66(context, vnbVar);
        p66Var.setTextSize(1, 13.0f);
        p66Var.setTextAlignment(4);
        p66Var.setGravity(17);
        yob.X(p66Var, aob.G6, vnbVar);
        yob.G(p66Var, aob.n6, vnbVar);
        p66Var.setLineSpacing(hl.L(3.0f), 1.0f);
        SpannableStringBuilder N2 = hl.N2(ob6.M0(z ? 2131748082 : 2131748080, null), -1, 2, new ux9(ux9Var, (byte) 24), null);
        SpannableString spannableString2 = new SpannableString(String.valueOf(uc7.s1(i).k4.Z1.f()));
        spannableString2.setSpan(new y7c(hl.o()), 0, spannableString2.length(), 33);
        p66Var.setText(hl.G2(N2, spannableString2, "%s"));
        addView(p66Var, tre.d(-1, -2.0f, 49, 24.0f, 96.0f, 24.0f, 12.0f));
    }

    @Override // snb
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(aob.d6));
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(hl.L(145.0f), TLObject.FLAG_30));
    }

    @Override // snb
    public final void updateColors() {
        vnb vnbVar = this.a;
        View view = this.c;
        if (view != null) {
            try {
                if (view.getBackground() instanceof GradientDrawable) {
                    GradientDrawable gradientDrawable = (GradientDrawable) view.getBackground();
                    int i = aob.d6;
                    gradientDrawable.setColors(new int[]{aob.p1(0.4f, aob.v0(i, vnbVar)), aob.v0(i, vnbVar)});
                }
            } catch (Exception e) {
                cc4.g(e, true);
            }
        }
    }
}
