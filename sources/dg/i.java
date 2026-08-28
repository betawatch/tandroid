package dg;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import g7.e6;
import java.util.Date;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.h5;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class i extends FrameLayout {
    public final h5 a;
    public long b;

    public i(Context context, b6 b6Var) {
        super(context);
        h5 h5Var = new h5(context);
        h5Var.setTextSize(16);
        h5Var.setTextColor(f6.v0(f6.j5, b6Var));
        h5Var.setGravity(LocaleController.isRTL ? 5 : 3);
        addView(h5Var);
        h5 h5Var2 = new h5(context);
        this.a = h5Var2;
        h5Var2.setTextSize(16);
        h5Var2.setTextColor(f6.v0(f6.L6, b6Var));
        h5Var2.setGravity(LocaleController.isRTL ? 3 : 5);
        addView(h5Var2);
        h5Var.l(LocaleController.formatString("BoostingDateAndTime", R.string.BoostingDateAndTime, new Object[0]), false);
        boolean z10 = LocaleController.isRTL;
        h5Var.setLayoutParams(e6.d(-1, -2.0f, (z10 ? 5 : 3) | 16, z10 ? 0.0f : 21.0f, 0.0f, z10 ? 21.0f : 0.0f, 0.0f));
        boolean z11 = LocaleController.isRTL;
        h5Var2.setLayoutParams(e6.d(-1, -2.0f, (z11 ? 3 : 5) | 16, z11 ? 21.0f : 0.0f, 0.0f, z11 ? 0.0f : 21.0f, 0.0f));
        setBackgroundColor(f6.v0(f6.h5, b6Var));
    }

    public long getSelectedTime() {
        return this.b;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i9), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f), TLObject.FLAG_30));
    }

    public void setDate(long j10) {
        this.b = j10;
        Date date = new Date(j10);
        this.a.l(LocaleController.formatString("formatDateAtTime", R.string.formatDateAtTime, LocaleController.getInstance().getFormatterDayMonth().format(date), LocaleController.getInstance().getFormatterDay().format(date)), false);
    }
}
