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
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class f extends FrameLayout {
    public static final /* synthetic */ int e = 0;
    public final e a;
    public boolean b;
    public boolean c;
    public c20 d;

    public f(Activity activity, h6 h6Var) {
        super(activity);
        e eVar = new e(this, activity);
        this.a = eVar;
        eVar.setHapticFeedbackEnabled(true);
        eVar.setImageResource(R.drawable.smiles_tab_clear);
        t6.s(eVar, m6.Gf, h6Var, PorterDuff.Mode.MULTIPLY);
        eVar.setScaleType(ImageView.ScaleType.CENTER);
        eVar.setContentDescription(id.M0(2131754920, null));
        eVar.setFocusable(true);
        eVar.setOnClickListener(new l1(1));
        addView(eVar, ha.e(36, 36, 17));
        int x02 = m6.x0(null, m6.i6, false);
        int L = org.telegram.messenger.g0.L(36.0f);
        int i7 = m6.d6;
        org.telegram.ui.Cells.y j02 = m6.j0(L, h6Var != null ? h6Var.h(i7) : m6.x0(null, i7, false), x02);
        p6 M = t6.M(i7);
        eVar.setBackground(j02);
        t6.j(eVar, j02, M, null, h6Var);
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
