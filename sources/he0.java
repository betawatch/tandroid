// default package

import android.app.Activity;
import android.graphics.PorterDuff;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class he0 extends FrameLayout {
    public final ge0 a;
    public boolean b;
    public boolean c;
    public qac d;

    public he0(Activity activity, ylb ylbVar) {
        super(activity);
        ge0 ge0Var = new ge0(this, activity);
        this.a = ge0Var;
        ge0Var.setHapticFeedbackEnabled(true);
        ge0Var.setImageResource(R.drawable.smiles_tab_clear);
        anb.s(ge0Var, cmb.If, ylbVar, PorterDuff.Mode.MULTIPLY);
        ge0Var.setScaleType(ImageView.ScaleType.CENTER);
        ge0Var.setContentDescription(jb6.M0(2131754920, null));
        ge0Var.setFocusable(true);
        ge0Var.setOnClickListener(new x10((byte) 1));
        addView(ge0Var, qoe.e(36, 36, 17));
        int w0 = cmb.w0(null, cmb.h6, false);
        int L = gm.L(36.0f);
        int i = cmb.c6;
        fg0 h0 = cmb.h0(L, ylbVar != null ? ylbVar.h(i) : cmb.w0(null, i, false), w0);
        wmb M = anb.M(i);
        ge0Var.setBackground(h0);
        anb.j(ge0Var, h0, M, null, ylbVar);
        ge0Var.setOutlineProvider(new pl9(18));
        ge0Var.setElevation(gm.L(1.0f));
        ge0Var.setClipToOutline(true);
        setClickable(true);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(gm.L(42.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(gm.L(42.0f), TLObject.FLAG_30));
    }

    public void setOnBackspace(qac qacVar) {
        this.d = qacVar;
    }
}
