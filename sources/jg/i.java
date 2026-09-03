package jg;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.Date;
import k7.c6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.l5;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class i extends FrameLayout {
    public final l5 a;
    public long b;

    public i(Context context, g6 g6Var) {
        super(context);
        l5 l5Var = new l5(context);
        l5Var.setTextSize(16);
        l5Var.setTextColor(k6.v0(k6.j5, g6Var));
        l5Var.setGravity(LocaleController.isRTL ? 5 : 3);
        addView(l5Var);
        l5 l5Var2 = new l5(context);
        this.a = l5Var2;
        l5Var2.setTextSize(16);
        l5Var2.setTextColor(k6.v0(k6.L6, g6Var));
        l5Var2.setGravity(LocaleController.isRTL ? 3 : 5);
        addView(l5Var2);
        l5Var.l(LocaleController.formatString("BoostingDateAndTime", R.string.BoostingDateAndTime, new Object[0]), false);
        boolean z4 = LocaleController.isRTL;
        l5Var.setLayoutParams(c6.d(-1, -2.0f, (z4 ? 5 : 3) | 16, z4 ? 0.0f : 21.0f, 0.0f, z4 ? 21.0f : 0.0f, 0.0f));
        boolean z10 = LocaleController.isRTL;
        l5Var2.setLayoutParams(c6.d(-1, -2.0f, (z10 ? 3 : 5) | 16, z10 ? 21.0f : 0.0f, 0.0f, z10 ? 0.0f : 21.0f, 0.0f));
        setBackgroundColor(k6.v0(k6.h5, g6Var));
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
