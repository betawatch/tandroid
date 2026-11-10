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
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Cells.d3;
import org.telegram.ui.Components.k9;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
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
        t6.h(m6.a7, this, null);
        a5 a5Var = new a5(context, 3);
        a5Var.c = new Path();
        Paint paint = new Paint(1);
        a5Var.b = paint;
        final int i10 = 0;
        paint.setColor(m6.x0(null, m6.d6, false));
        paint.setShadowLayer(org.telegram.messenger.g0.L(1.33f), 0.0f, org.telegram.messenger.g0.L(0.33f), 503316480);
        a5Var.setWillNotDraw(false);
        a5Var.setOrientation(1);
        a5Var.setPadding(org.telegram.messenger.g0.L(32.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(32.0f), org.telegram.messenger.g0.L(32.0f));
        k9 k9Var = new k9(context);
        this.b = k9Var;
        k9Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Cells.c3
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
        a5Var.addView(k9Var, ha.r(qs.O1, qs.O1, 49));
        TextView textView = new TextView(context);
        this.c = textView;
        textView.setGravity(17);
        textView.setTextSize(1, 18.0f);
        t6.U(textView, m6.G6, null);
        textView.setTypeface(org.telegram.messenger.g0.o());
        a5Var.addView(textView, ha.t(-1, -2, 49, 0, 6, 0, 0));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setGravity(17);
        textView2.setTextSize(1, 14.0f);
        t6.U(textView2, m6.y6, null);
        a5Var.addView(textView2, ha.t(-1, -2, 49, 0, 7, 0, 0));
        TextView textView3 = new TextView(context);
        this.e = textView3;
        textView3.setGravity(17);
        textView3.setBackground(b6.f(m6.Ci, 8.0f));
        textView3.setTextSize(1, 14.0f);
        t6.U(textView3, m6.Gi, null);
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
