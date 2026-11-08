package ch;

import android.app.Activity;
import android.graphics.PorterDuff;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import bi.l1;
import c8.ha;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.c20;
import org.telegram.messenger.id;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.r6;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class f extends FrameLayout {
    public static final /* synthetic */ int e = 0;
    public final e a;
    public boolean b;
    public boolean c;
    public c20 d;

    public f(Activity activity, f6 f6Var) {
        super(activity);
        e eVar = new e(this, activity);
        this.a = eVar;
        eVar.setHapticFeedbackEnabled(true);
        eVar.setImageResource(R.drawable.smiles_tab_clear);
        r6.t(eVar, k6.Gf, f6Var, PorterDuff.Mode.MULTIPLY);
        eVar.setScaleType(ImageView.ScaleType.CENTER);
        eVar.setContentDescription(id.M0(2131754920, null));
        eVar.setFocusable(true);
        eVar.setOnClickListener(new l1(1));
        addView(eVar, ha.e(36, 36, 17));
        int x02 = k6.x0(null, k6.i6, false);
        int L = org.telegram.messenger.g0.L(36.0f);
        int i7 = k6.d6;
        org.telegram.ui.Cells.y j02 = k6.j0(L, f6Var != null ? f6Var.h(i7) : k6.x0(null, i7, false), x02);
        n6 N = r6.N(i7);
        eVar.setBackground(j02);
        r6.k(eVar, j02, N, null, f6Var);
        eVar.setOutlineProvider(new bg.r0(18));
        eVar.setElevation(org.telegram.messenger.g0.L(1.0f));
        eVar.setClipToOutline(true);
        setClickable(true);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(42.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(42.0f), TLObject.FLAG_30));
    }

    public void setOnBackspace(c20 c20Var) {
        this.d = c20Var;
    }
}
