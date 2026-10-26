package bh;

import android.app.Activity;
import android.graphics.PorterDuff;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.b7;
import org.telegram.ui.ActionBar.f7;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.gb1;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final class h extends FrameLayout {
    public static final /* synthetic */ int e = 0;
    public final g a;
    public boolean b;
    public boolean c;
    public Utilities.Callback d;

    public h(Activity activity, u6 u6Var) {
        super(activity);
        g gVar = new g(this, activity);
        this.a = gVar;
        gVar.setHapticFeedbackEnabled(true);
        gVar.setImageResource(R.drawable.smiles_tab_clear);
        f7.t(gVar, y6.Re, u6Var, PorterDuff.Mode.MULTIPLY);
        gVar.setScaleType(ImageView.ScaleType.CENTER);
        gVar.setContentDescription(LocaleController.getString(R.string.AccDescrBackspace));
        gVar.setFocusable(true);
        gVar.setOnClickListener(new f(0));
        addView(gVar, gb1.i(36, 36, 17));
        int x02 = y6.x0(null, y6.i6, false);
        int dp = AndroidUtilities.dp(36.0f);
        int i10 = y6.d6;
        org.telegram.ui.Cells.y i02 = y6.i0(dp, u6Var != null ? u6Var.g(i10) : y6.x0(null, i10, false), x02);
        b7 N = f7.N(i10);
        gVar.setBackground(i02);
        f7.k(gVar, i02, N, null, u6Var);
        gVar.setOutlineProvider(new ag.w0(18));
        gVar.setElevation(AndroidUtilities.dp(1.0f));
        gVar.setClipToOutline(true);
        setClickable(true);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(42.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(42.0f), TLObject.FLAG_30));
    }

    public void setOnBackspace(Utilities.Callback<Boolean> callback) {
        this.d = callback;
    }
}
