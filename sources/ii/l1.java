package ii;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.FrameLayout;
import android.widget.TextView;
import b8.mf;
import b8.rf;
import java.util.Date;
import org.telegram.messenger.bd;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.RadioButton;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class l1 extends FrameLayout {
    public final String a;
    public final RadioButton b;
    public final boolean c;

    public l1(m1 m1Var, boolean z10, Context context) {
        super(context);
        this.a = m1Var.a;
        RadioButton radioButton = new RadioButton(context);
        this.b = radioButton;
        radioButton.setSize(org.telegram.messenger.g0.L(20.0f));
        r6.P(radioButton, k6.D5, k6.E5, null);
        addView(radioButton, mf.d(22, 22.0f, 19, 20.0f, 0.0f, 0.0f, 0.0f));
        TextView b10 = rf.b(context, 16.0f, k6.G6, true, null);
        b10.setText(m1Var.c);
        addView(b10, mf.t(-1, -2, 7, 62, 9, 8, 0));
        TextView b11 = rf.b(context, 14.0f, k6.y6, false, null);
        b11.setText(bd.a0(null, null, 2131752993, bd.a0(null, null, 2131742793, bd.T(m1Var.d / 1000), bd.E0().p0().format(new Date(m1Var.d / 1000)))));
        addView(b11, mf.t(-1, -2, 7, 62, 32, 8, 0));
        this.c = z10;
        setWillNotDraw(!z10);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.c) {
            canvas.drawLine(org.telegram.messenger.g0.L(62.0f), getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, k6.k0);
        }
    }
}
