package ah;

import android.app.Activity;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import ci.t4;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import w7.z5;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class i extends FrameLayout {
    public static final /* synthetic */ int e = 0;
    public final h a;
    public boolean b;
    public boolean c;
    public Utilities.Callback d;

    public i(Activity activity, d6 d6Var) {
        super(activity);
        h hVar = new h(this, activity);
        this.a = hVar;
        hVar.setHapticFeedbackEnabled(true);
        hVar.setImageResource(R.drawable.smiles_tab_clear);
        int i10 = h6.Re;
        hVar.setColorFilter(new PorterDuffColorFilter(d6Var != null ? d6Var.w(i10) : h6.x0(null, i10, false), PorterDuff.Mode.MULTIPLY));
        hVar.setScaleType(ImageView.ScaleType.CENTER);
        hVar.setContentDescription(LocaleController.getString(R.string.AccDescrBackspace));
        hVar.setFocusable(true);
        hVar.setOnClickListener(new f(0));
        addView(hVar, z5.e(36, 36, 17));
        int x02 = h6.x0(null, h6.i6, false);
        int dp = AndroidUtilities.dp(36.0f);
        int i11 = h6.d6;
        hVar.setBackground(h6.i0(dp, d6Var != null ? d6Var.w(i11) : h6.x0(null, i11, false), x02));
        hVar.setOutlineProvider(new t4(18));
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
