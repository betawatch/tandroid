package jg;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.View;
import android.widget.TextView;
import c8.ma;
import hi.x4;
import org.telegram.messenger.k10;
import org.telegram.messenger.ls;
import org.telegram.ui.ActionBar.a6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Cells.e3;
import org.telegram.ui.Components.q9;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class h extends e3 {
    public final /* synthetic */ m f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(m mVar, Context context) {
        super(context);
        this.f = mVar;
        this.a = k10.t0;
        final int i7 = 1;
        setOrientation(1);
        t6.h(m6.a7, this, null);
        x4 x4Var = new x4(context, 3);
        x4Var.c = new Path();
        Paint paint = new Paint(1);
        x4Var.b = paint;
        final int i10 = 0;
        paint.setColor(m6.x0(null, m6.d6, false));
        paint.setShadowLayer(org.telegram.messenger.g0.L(1.33f), 0.0f, org.telegram.messenger.g0.L(0.33f), 503316480);
        x4Var.setWillNotDraw(false);
        x4Var.setOrientation(1);
        x4Var.setPadding(org.telegram.messenger.g0.L(32.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(32.0f), org.telegram.messenger.g0.L(32.0f));
        q9 q9Var = new q9(context);
        this.b = q9Var;
        q9Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Cells.d3
            public final /* synthetic */ jg.h b;

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
        x4Var.addView(q9Var, ma.r(ls.O1, ls.O1, 49));
        TextView textView = new TextView(context);
        this.c = textView;
        textView.setGravity(17);
        textView.setTextSize(1, 18.0f);
        t6.U(textView, m6.G6, null);
        textView.setTypeface(org.telegram.messenger.g0.o());
        x4Var.addView(textView, ma.t(-1, -2, 49, 0, 6, 0, 0));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setGravity(17);
        textView2.setTextSize(1, 14.0f);
        t6.U(textView2, m6.y6, null);
        x4Var.addView(textView2, ma.t(-1, -2, 49, 0, 7, 0, 0));
        TextView textView3 = new TextView(context);
        this.e = textView3;
        textView3.setGravity(17);
        textView3.setBackground(a6.f(m6.Fi, 8.0f));
        textView3.setTextSize(1, 14.0f);
        t6.U(textView3, m6.Ji, null);
        textView3.setTypeface(org.telegram.messenger.g0.o());
        textView3.setPadding(org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(14.0f));
        textView3.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Cells.d3
            public final /* synthetic */ jg.h b;

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
        x4Var.addView(textView3, ma.t(-1, -2, 49, 0, 18, 0, 0));
        addView(x4Var, ma.o(-1, -2));
        set(null);
    }
}
