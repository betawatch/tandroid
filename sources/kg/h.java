package kg;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.View;
import android.widget.TextView;
import b8.mf;
import gi.y4;
import org.telegram.messenger.h10;
import org.telegram.messenger.hs;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.ActionBar.y5;
import org.telegram.ui.Cells.d3;
import org.telegram.ui.Components.k9;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class h extends d3 {
    public final /* synthetic */ m f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(m mVar, Context context) {
        super(context);
        this.f = mVar;
        this.a = h10.t0;
        final int i3 = 1;
        setOrientation(1);
        r6.i(k6.a7, this, null);
        y4 y4Var = new y4(context, 3);
        y4Var.c = new Path();
        Paint paint = new Paint(1);
        y4Var.b = paint;
        final int i10 = 0;
        paint.setColor(k6.x0(null, k6.d6, false));
        paint.setShadowLayer(org.telegram.messenger.g0.L(1.33f), 0.0f, org.telegram.messenger.g0.L(0.33f), 503316480);
        y4Var.setWillNotDraw(false);
        y4Var.setOrientation(1);
        y4Var.setPadding(org.telegram.messenger.g0.L(32.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(32.0f), org.telegram.messenger.g0.L(32.0f));
        k9 k9Var = new k9(context);
        this.b = k9Var;
        k9Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Cells.c3
            public final /* synthetic */ kg.h b;

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
        y4Var.addView(k9Var, mf.r(hs.O1, hs.O1, 49));
        TextView textView = new TextView(context);
        this.c = textView;
        textView.setGravity(17);
        textView.setTextSize(1, 18.0f);
        r6.V(textView, k6.G6, null);
        textView.setTypeface(org.telegram.messenger.g0.o());
        y4Var.addView(textView, mf.t(-1, -2, 49, 0, 6, 0, 0));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setGravity(17);
        textView2.setTextSize(1, 14.0f);
        r6.V(textView2, k6.y6, null);
        y4Var.addView(textView2, mf.t(-1, -2, 49, 0, 7, 0, 0));
        TextView textView3 = new TextView(context);
        this.e = textView3;
        textView3.setGravity(17);
        textView3.setBackground(y5.f(k6.Ci, 8.0f));
        textView3.setTextSize(1, 14.0f);
        r6.V(textView3, k6.Gi, null);
        textView3.setTypeface(org.telegram.messenger.g0.o());
        textView3.setPadding(org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(14.0f));
        textView3.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Cells.c3
            public final /* synthetic */ kg.h b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i3) {
                    case 0:
                        this.b.b.getImageReceiver().P0(false);
                        break;
                    default:
                        this.b.f.L();
                        break;
                }
            }
        });
        y4Var.addView(textView3, mf.t(-1, -2, 49, 0, 18, 0, 0));
        addView(y4Var, mf.o(-1, -2));
        set(null);
    }
}
