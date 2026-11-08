package jg;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.View;
import android.widget.TextView;
import c8.ha;
import fi.a5;
import org.telegram.messenger.p10;
import org.telegram.messenger.qs;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.ActionBar.z5;
import org.telegram.ui.Cells.d3;
import org.telegram.ui.Components.l9;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class i extends d3 {
    public final /* synthetic */ n f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(n nVar, Context context) {
        super(context);
        this.f = nVar;
        this.a = p10.s0;
        final int i7 = 1;
        setOrientation(1);
        r6.i(k6.a7, this, null);
        a5 a5Var = new a5(context, 3);
        a5Var.c = new Path();
        Paint paint = new Paint(1);
        a5Var.b = paint;
        final int i10 = 0;
        paint.setColor(k6.x0(null, k6.d6, false));
        paint.setShadowLayer(org.telegram.messenger.g0.L(1.33f), 0.0f, org.telegram.messenger.g0.L(0.33f), 503316480);
        a5Var.setWillNotDraw(false);
        a5Var.setOrientation(1);
        a5Var.setPadding(org.telegram.messenger.g0.L(32.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(32.0f), org.telegram.messenger.g0.L(32.0f));
        l9 l9Var = new l9(context);
        this.b = l9Var;
        l9Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Cells.c3
            public final /* synthetic */ jg.i b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        this.b.b.getImageReceiver().P0(false);
                        break;
                    default:
                        this.b.f.L();
                        break;
                }
            }
        });
        a();
        a5Var.addView(l9Var, ha.r(qs.O1, qs.O1, 49));
        TextView textView = new TextView(context);
        this.c = textView;
        textView.setGravity(17);
        textView.setTextSize(1, 18.0f);
        r6.V(textView, k6.G6, null);
        textView.setTypeface(org.telegram.messenger.g0.o());
        a5Var.addView(textView, ha.t(-1, -2, 49, 0, 6, 0, 0));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setGravity(17);
        textView2.setTextSize(1, 14.0f);
        r6.V(textView2, k6.y6, null);
        a5Var.addView(textView2, ha.t(-1, -2, 49, 0, 7, 0, 0));
        TextView textView3 = new TextView(context);
        this.e = textView3;
        textView3.setGravity(17);
        textView3.setBackground(z5.f(k6.Ci, 8.0f));
        textView3.setTextSize(1, 14.0f);
        r6.V(textView3, k6.Gi, null);
        textView3.setTypeface(org.telegram.messenger.g0.o());
        textView3.setPadding(org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(14.0f));
        textView3.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Cells.c3
            public final /* synthetic */ jg.i b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i7) {
                    case 0:
                        this.b.b.getImageReceiver().P0(false);
                        break;
                    default:
                        this.b.f.L();
                        break;
                }
            }
        });
        a5Var.addView(textView3, ha.t(-1, -2, 49, 0, 18, 0, 0));
        addView(a5Var, ha.o(-1, -2));
        set(null);
    }
}
