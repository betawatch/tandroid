// default package

import android.app.Activity;
import android.graphics.PorterDuff;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class jd0 extends FrameLayout {
    public final id0 a;
    public boolean b;
    public boolean c;
    public pcc d;

    public jd0(Activity activity, vnb vnbVar) {
        super(activity);
        id0 id0Var = new id0(this, activity);
        this.a = id0Var;
        id0Var.setHapticFeedbackEnabled(true);
        id0Var.setImageResource(R.drawable.smiles_tab_clear);
        yob.s(id0Var, aob.Jf, vnbVar, PorterDuff.Mode.MULTIPLY);
        id0Var.setScaleType(ImageView.ScaleType.CENTER);
        id0Var.setContentDescription(ob6.M0(2131754916, null));
        id0Var.setFocusable(true);
        id0Var.setOnClickListener(new y00((byte) 1));
        addView(id0Var, tre.e(36, 36, 17));
        int w0 = aob.w0(null, aob.i6, false);
        int L = hl.L(36.0f);
        int i = aob.d6;
        hf0 h0 = aob.h0(L, vnbVar != null ? vnbVar.h(i) : aob.w0(null, i, false), w0);
        uob M = yob.M(i);
        id0Var.setBackground(h0);
        yob.j(id0Var, h0, M, null, vnbVar);
        id0Var.setOutlineProvider(new bn9(18));
        id0Var.setElevation(hl.L(1.0f));
        id0Var.setClipToOutline(true);
        setClickable(true);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(hl.L(42.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(hl.L(42.0f), TLObject.FLAG_30));
    }

    public void setOnBackspace(pcc pccVar) {
        this.d = pccVar;
    }
}
