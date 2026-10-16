package ah;

import android.app.Activity;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import bi.u5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import w7.z5;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class i extends FrameLayout {
    public static final /* synthetic */ int e = 0;
    public final h a;
    public boolean b;
    public boolean c;
    public Utilities.Callback d;

    public i(Activity activity, c6 c6Var) {
        super(activity);
        h hVar = new h(this, activity);
        this.a = hVar;
        hVar.setHapticFeedbackEnabled(true);
        hVar.setImageResource(R.drawable.smiles_tab_clear);
        int i10 = g6.Re;
        hVar.setColorFilter(new PorterDuffColorFilter(c6Var != null ? c6Var.E0(i10) : g6.x0(null, i10, false), PorterDuff.Mode.MULTIPLY));
        hVar.setScaleType(ImageView.ScaleType.CENTER);
        hVar.setContentDescription(LocaleController.getString(R.string.AccDescrBackspace));
        hVar.setFocusable(true);
        hVar.setOnClickListener(new f(0));
        addView(hVar, z5.e(36, 36, 17));
        int x02 = g6.x0(null, g6.i6, false);
        int dp = AndroidUtilities.dp(36.0f);
        int i11 = g6.d6;
        hVar.setBackground(g6.i0(dp, c6Var != null ? c6Var.E0(i11) : g6.x0(null, i11, false), x02));
        hVar.setOutlineProvider(new u5(18));
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
