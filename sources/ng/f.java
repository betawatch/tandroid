package ng;

import android.app.Activity;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import k7.c6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class f extends FrameLayout {
    public static final /* synthetic */ int e = 0;
    public final e a;
    public boolean b;
    public boolean c;
    public Utilities.Callback d;

    public f(Activity activity, g6 g6Var) {
        super(activity);
        e eVar = new e(this, activity);
        this.a = eVar;
        eVar.setHapticFeedbackEnabled(true);
        eVar.setImageResource(R.drawable.smiles_tab_clear);
        int i10 = k6.Re;
        eVar.setColorFilter(new PorterDuffColorFilter(g6Var != null ? g6Var.B0(i10) : k6.w0(null, i10, false), PorterDuff.Mode.MULTIPLY));
        eVar.setScaleType(ImageView.ScaleType.CENTER);
        eVar.setContentDescription(LocaleController.getString(R.string.AccDescrBackspace));
        eVar.setFocusable(true);
        eVar.setOnClickListener(new eg.m(6));
        addView(eVar, c6.e(36, 36, 17));
        int w02 = k6.w0(null, k6.i6, false);
        int dp = AndroidUtilities.dp(36.0f);
        int i11 = k6.d6;
        eVar.setBackground(k6.h0(dp, g6Var != null ? g6Var.B0(i11) : k6.w0(null, i11, false), w02));
        eVar.setOutlineProvider(new lf.o0(18));
        eVar.setElevation(AndroidUtilities.dp(1.0f));
        eVar.setClipToOutline(true);
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
