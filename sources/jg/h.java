package jg;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.View;
import android.widget.TextView;
import c8.na;
import hi.i5;
import org.telegram.messenger.i10;
import org.telegram.messenger.ks;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Cells.e3;
import org.telegram.ui.Components.p9;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class h extends e3 {
    public final /* synthetic */ m f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(m mVar, Context context) {
        super(context);
        this.f = mVar;
        this.a = i10.t0;
        final int i7 = 1;
        setOrientation(1);
        u6.h(n6.a7, this, null);
        i5 i5Var = new i5(context, 3);
        i5Var.c = new Path();
        Paint paint = new Paint(1);
        i5Var.b = paint;
        final int i10 = 0;
        paint.setColor(n6.x0(null, n6.d6, false));
        paint.setShadowLayer(org.telegram.messenger.g0.L(1.33f), 0.0f, org.telegram.messenger.g0.L(0.33f), 503316480);
        i5Var.setWillNotDraw(false);
        i5Var.setOrientation(1);
        i5Var.setPadding(org.telegram.messenger.g0.L(32.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(32.0f), org.telegram.messenger.g0.L(32.0f));
        p9 p9Var = new p9(context);
        this.b = p9Var;
        p9Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Cells.d3
            public final /* synthetic */ jg.h b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        this.b.b.getImageReceiver().Q0(false);
                        break;
                    default:
                        this.b.f.L();
                        break;
                }
            }
        });
        a();
        i5Var.addView(p9Var, na.r(ks.O1, ks.O1, 49));
        TextView textView = new TextView(context);
        this.c = textView;
        textView.setGravity(17);
        textView.setTextSize(1, 18.0f);
        u6.U(textView, n6.G6, null);
        textView.setTypeface(org.telegram.messenger.g0.o());
        i5Var.addView(textView, na.t(-1, -2, 49, 0, 6, 0, 0));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setGravity(17);
        textView2.setTextSize(1, 14.0f);
        u6.U(textView2, n6.y6, null);
        i5Var.addView(textView2, na.t(-1, -2, 49, 0, 7, 0, 0));
        TextView textView3 = new TextView(context);
        this.e = textView3;
        textView3.setGravity(17);
        textView3.setBackground(b6.f(n6.Fi, 8.0f));
        textView3.setTextSize(1, 14.0f);
        u6.U(textView3, n6.Ji, null);
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
                        this.b.b.getImageReceiver().Q0(false);
                        break;
                    default:
                        this.b.f.L();
                        break;
                }
            }
        });
        i5Var.addView(textView3, na.t(-1, -2, 49, 0, 18, 0, 0));
        addView(i5Var, na.o(-1, -2));
        set(null);
    }
}
