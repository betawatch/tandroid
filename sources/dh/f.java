package dh;

import android.app.Activity;
import android.graphics.PorterDuff;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import b8.mf;
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.u10;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.r6;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class f extends FrameLayout {
    public static final /* synthetic */ int e = 0;
    public final e a;
    public boolean b;
    public boolean c;
    public u10 d;

    public f(Activity activity, e6 e6Var) {
        super(activity);
        e eVar = new e(this, activity);
        this.a = eVar;
        eVar.setHapticFeedbackEnabled(true);
        eVar.setImageResource(R.drawable.smiles_tab_clear);
        r6.t(eVar, k6.Gf, e6Var, PorterDuff.Mode.MULTIPLY);
        eVar.setScaleType(ImageView.ScaleType.CENTER);
        eVar.setContentDescription(bd.M0(2131754920, null));
        eVar.setFocusable(true);
        eVar.setOnClickListener(new ai.t(4));
        addView(eVar, mf.e(36, 36, 17));
        int x02 = k6.x0(null, k6.i6, false);
        int L = org.telegram.messenger.g0.L(36.0f);
        int i3 = k6.d6;
        org.telegram.ui.Cells.y j02 = k6.j0(L, e6Var != null ? e6Var.h(i3) : k6.x0(null, i3, false), x02);
        n6 N = r6.N(i3);
        eVar.setBackground(j02);
        r6.k(eVar, j02, N, null, e6Var);
        eVar.setOutlineProvider(new cg.q0(18));
        eVar.setElevation(org.telegram.messenger.g0.L(1.0f));
        eVar.setClipToOutline(true);
        setClickable(true);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(42.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(42.0f), TLObject.FLAG_30));
    }

    public void setOnBackspace(u10 u10Var) {
        this.d = u10Var;
    }
}
