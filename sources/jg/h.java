package jg;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.View;
import android.widget.TextView;
import c8.ja;
import hi.y4;
import org.telegram.messenger.m10;
import org.telegram.messenger.ns;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.q6;
import org.telegram.ui.ActionBar.y5;
import org.telegram.ui.Cells.d3;
import org.telegram.ui.Components.i9;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class h extends d3 {
    public final /* synthetic */ m f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(m mVar, Context context) {
        super(context);
        this.f = mVar;
        this.a = m10.t0;
        final int i7 = 1;
        setOrientation(1);
        q6.h(j6.a7, this, null);
        y4 y4Var = new y4(context, 3);
        y4Var.c = new Path();
        Paint paint = new Paint(1);
        y4Var.b = paint;
        final int i10 = 0;
        paint.setColor(j6.x0(null, j6.d6, false));
        paint.setShadowLayer(org.telegram.messenger.g0.L(1.33f), 0.0f, org.telegram.messenger.g0.L(0.33f), 503316480);
        y4Var.setWillNotDraw(false);
        y4Var.setOrientation(1);
        y4Var.setPadding(org.telegram.messenger.g0.L(32.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(32.0f), org.telegram.messenger.g0.L(32.0f));
        i9 i9Var = new i9(context);
        this.b = i9Var;
        i9Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Cells.c3
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
        y4Var.addView(i9Var, ja.r(ns.O1, ns.O1, 49));
        TextView textView = new TextView(context);
        this.c = textView;
        textView.setGravity(17);
        textView.setTextSize(1, 18.0f);
        q6.U(textView, j6.G6, null);
        textView.setTypeface(org.telegram.messenger.g0.o());
        y4Var.addView(textView, ja.t(-1, -2, 49, 0, 6, 0, 0));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setGravity(17);
        textView2.setTextSize(1, 14.0f);
        q6.U(textView2, j6.y6, null);
        y4Var.addView(textView2, ja.t(-1, -2, 49, 0, 7, 0, 0));
        TextView textView3 = new TextView(context);
        this.e = textView3;
        textView3.setGravity(17);
        textView3.setBackground(y5.f(j6.Fi, 8.0f));
        textView3.setTextSize(1, 14.0f);
        q6.U(textView3, j6.Ji, null);
        textView3.setTypeface(org.telegram.messenger.g0.o());
        textView3.setPadding(org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(14.0f));
        textView3.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Cells.c3
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
        y4Var.addView(textView3, ja.t(-1, -2, 49, 0, 18, 0, 0));
        addView(y4Var, ja.o(-1, -2));
        set(null);
    }
}
