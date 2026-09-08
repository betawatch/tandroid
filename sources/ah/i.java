package ah;

import android.app.Activity;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import bi.s5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import w7.x5;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class i extends FrameLayout {
    public static final /* synthetic */ int e = 0;
    public final h a;
    public boolean b;
    public boolean c;
    public Utilities.Callback d;

    public i(Activity activity, f6 f6Var) {
        super(activity);
        h hVar = new h(this, activity);
        this.a = hVar;
        hVar.setHapticFeedbackEnabled(true);
        hVar.setImageResource(R.drawable.smiles_tab_clear);
        int i10 = j6.Re;
        hVar.setColorFilter(new PorterDuffColorFilter(f6Var != null ? f6Var.G0(i10) : j6.w0(null, i10, false), PorterDuff.Mode.MULTIPLY));
        hVar.setScaleType(ImageView.ScaleType.CENTER);
        hVar.setContentDescription(LocaleController.getString(R.string.AccDescrBackspace));
        hVar.setFocusable(true);
        hVar.setOnClickListener(new f(0));
        addView(hVar, x5.e(36, 36, 17));
        int w02 = j6.w0(null, j6.i6, false);
        int dp = AndroidUtilities.dp(36.0f);
        int i11 = j6.d6;
        hVar.setBackground(j6.h0(dp, f6Var != null ? f6Var.G0(i11) : j6.w0(null, i11, false), w02));
        hVar.setOutlineProvider(new s5(18));
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
