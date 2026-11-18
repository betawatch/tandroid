package ch;

import android.app.Activity;
import android.graphics.PorterDuff;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import c8.ma;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.gd;
import org.telegram.messenger.x10;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.q6;
import org.telegram.ui.ActionBar.u6;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class f extends FrameLayout {
    public static final /* synthetic */ int e = 0;
    public final e a;
    public boolean b;
    public boolean c;
    public x10 d;

    public f(Activity activity, i6 i6Var) {
        super(activity);
        e eVar = new e(this, activity);
        this.a = eVar;
        eVar.setHapticFeedbackEnabled(true);
        eVar.setImageResource(R.drawable.smiles_tab_clear);
        u6.s(eVar, n6.Jf, i6Var, PorterDuff.Mode.MULTIPLY);
        eVar.setScaleType(ImageView.ScaleType.CENTER);
        eVar.setContentDescription(gd.M0(2131754920, null));
        eVar.setFocusable(true);
        eVar.setOnClickListener(new bi.o(5));
        addView(eVar, ma.e(36, 36, 17));
        int x02 = n6.x0(null, n6.i6, false);
        int L = org.telegram.messenger.g0.L(36.0f);
        int i7 = n6.d6;
        org.telegram.ui.Cells.y j02 = n6.j0(L, i6Var != null ? i6Var.k(i7) : n6.x0(null, i7, false), x02);
        q6 M = u6.M(i7);
        eVar.setBackground(j02);
        u6.j(eVar, j02, M, null, i6Var);
        eVar.setOutlineProvider(new bg.r0(18));
        eVar.setElevation(org.telegram.messenger.g0.L(1.0f));
        eVar.setClipToOutline(true);
        setClickable(true);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(42.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(42.0f), TLObject.FLAG_30));
    }

    public void setOnBackspace(x10 x10Var) {
        this.d = x10Var;
    }
}
