package ki;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.FrameLayout;
import android.widget.TextView;
import c8.ma;
import c8.va;
import java.util.Date;
import org.telegram.messenger.gd;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.RadioButton;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes4.dex */
public final class i1 extends FrameLayout {
    public final String a;
    public final RadioButton b;
    public final boolean c;

    public i1(j1 j1Var, boolean z10, Context context) {
        super(context);
        this.a = j1Var.a;
        RadioButton radioButton = new RadioButton(context);
        this.b = radioButton;
        radioButton.setSize(org.telegram.messenger.g0.L(20.0f));
        t6.O(radioButton, m6.D5, m6.E5, null);
        addView(radioButton, ma.d(22, 22.0f, 19, 20.0f, 0.0f, 0.0f, 0.0f));
        TextView b10 = va.b(context, 16.0f, m6.G6, true, null);
        b10.setText(j1Var.c);
        addView(b10, ma.t(-1, -2, 7, 62, 9, 8, 0));
        TextView b11 = va.b(context, 14.0f, m6.y6, false, null);
        b11.setText(gd.a0(null, null, 2131752981, gd.a0(null, null, 2131742519, gd.T(j1Var.d / 1000), gd.E0().p0().format(new Date(j1Var.d / 1000)))));
        addView(b11, ma.t(-1, -2, 7, 62, 32, 8, 0));
        this.c = z10;
        setWillNotDraw(!z10);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.c) {
            canvas.drawLine(org.telegram.messenger.g0.L(62.0f), getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, m6.k0);
        }
    }
}
