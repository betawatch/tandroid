package ig;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.Date;
import k7.b6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.k5;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class i extends FrameLayout {
    public final k5 a;
    public long b;

    public i(Context context, f6 f6Var) {
        super(context);
        k5 k5Var = new k5(context);
        k5Var.setTextSize(16);
        k5Var.setTextColor(j6.v0(j6.j5, f6Var));
        k5Var.setGravity(LocaleController.isRTL ? 5 : 3);
        addView(k5Var);
        k5 k5Var2 = new k5(context);
        this.a = k5Var2;
        k5Var2.setTextSize(16);
        k5Var2.setTextColor(j6.v0(j6.L6, f6Var));
        k5Var2.setGravity(LocaleController.isRTL ? 3 : 5);
        addView(k5Var2);
        k5Var.l(LocaleController.formatString("BoostingDateAndTime", R.string.BoostingDateAndTime, new Object[0]), false);
        boolean z4 = LocaleController.isRTL;
        k5Var.setLayoutParams(b6.d(-1, -2.0f, (z4 ? 5 : 3) | 16, z4 ? 0.0f : 21.0f, 0.0f, z4 ? 21.0f : 0.0f, 0.0f));
        boolean z10 = LocaleController.isRTL;
        k5Var2.setLayoutParams(b6.d(-1, -2.0f, (z10 ? 3 : 5) | 16, z10 ? 21.0f : 0.0f, 0.0f, z10 ? 0.0f : 21.0f, 0.0f));
        setBackgroundColor(j6.v0(j6.h5, f6Var));
    }

    public long getSelectedTime() {
        return this.b;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f), TLObject.FLAG_30));
    }

    public void setDate(long j10) {
        this.b = j10;
        Date date = new Date(j10);
        this.a.l(LocaleController.formatString("formatDateAtTime", R.string.formatDateAtTime, LocaleController.getInstance().getFormatterDayMonth().format(date), LocaleController.getInstance().getFormatterDay().format(date)), false);
    }
}
