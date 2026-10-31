package og;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.Date;
import org.telegram.messenger.cd;
import org.telegram.messenger.i0;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.ActionBar.u5;
import w7.b6;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class i extends FrameLayout {
    public final u5 a;
    public long b;

    public i(Context context, p6 p6Var) {
        super(context);
        u5 u5Var = new u5(context);
        u5Var.setTextSize(16);
        a7.Y(u5Var, t6.j5, p6Var);
        u5Var.setGravity(cd.X ? 5 : 3);
        addView(u5Var);
        u5 u5Var2 = new u5(context);
        this.a = u5Var2;
        u5Var2.setTextSize(16);
        a7.Y(u5Var2, t6.L6, p6Var);
        u5Var2.setGravity(cd.X ? 3 : 5);
        addView(u5Var2);
        u5Var.l(cd.a0("BoostingDateAndTime", null, 2131753539, new Object[0]), false);
        boolean z10 = cd.X;
        u5Var.setLayoutParams(b6.d(-1, -2.0f, (z10 ? 5 : 3) | 16, z10 ? 0.0f : 21.0f, 0.0f, z10 ? 21.0f : 0.0f, 0.0f));
        boolean z11 = cd.X;
        u5Var2.setLayoutParams(b6.d(-1, -2.0f, (z11 ? 3 : 5) | 16, z11 ? 21.0f : 0.0f, 0.0f, z11 ? 0.0f : 21.0f, 0.0f));
        a7.i(t6.h5, this, p6Var);
    }

    public long getSelectedTime() {
        return this.b;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i0.L(50.0f), TLObject.FLAG_30));
    }

    public void setDate(long j10) {
        this.b = j10;
        Date date = new Date(j10);
        this.a.l(cd.a0("formatDateAtTime", null, 2131742808, cd.D0().p0().format(date), cd.D0().o0().format(date)), false);
    }
}
