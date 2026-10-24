package ah;

import android.app.Activity;
import android.graphics.PorterDuff;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import ci.s4;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.r6;
import w7.z5;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class i extends FrameLayout {
    public static final /* synthetic */ int e = 0;
    public final h a;
    public boolean b;
    public boolean c;
    public Utilities.Callback d;

    public i(Activity activity, g6 g6Var) {
        super(activity);
        h hVar = new h(this, activity);
        this.a = hVar;
        hVar.setHapticFeedbackEnabled(true);
        hVar.setImageResource(R.drawable.smiles_tab_clear);
        r6.t(hVar, k6.Re, g6Var, PorterDuff.Mode.MULTIPLY);
        hVar.setScaleType(ImageView.ScaleType.CENTER);
        hVar.setContentDescription(LocaleController.getString(R.string.AccDescrBackspace));
        hVar.setFocusable(true);
        hVar.setOnClickListener(new f(0));
        addView(hVar, z5.e(36, 36, 17));
        int x02 = k6.x0(null, k6.i6, false);
        int dp = AndroidUtilities.dp(36.0f);
        int i10 = k6.d6;
        org.telegram.ui.Cells.y i02 = k6.i0(dp, g6Var != null ? g6Var.g(i10) : k6.x0(null, i10, false), x02);
        n6 O = r6.O(i10);
        hVar.setBackground(i02);
        r6.k(hVar, i02, O, null, g6Var);
        hVar.setOutlineProvider(new s4(18));
        hVar.setElevation(AndroidUtilities.dp(1.0f));
        hVar.setClipToOutline(true);
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
