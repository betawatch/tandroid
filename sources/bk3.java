// default package

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.View;
import android.widget.TextView;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class bk3 extends cl3 {
    public final /* synthetic */ gk3 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bk3(gk3 gk3Var, Context context) {
        super(context);
        this.f = gk3Var;
        this.a = yac.t0;
        final byte b = 1;
        setOrientation(1);
        yob.h(aob.a7, null, this);
        g7 g7Var = new g7(context, (byte) 2);
        g7Var.b = new Path();
        Paint paint = new Paint(1);
        g7Var.c = paint;
        final byte b2 = 0;
        paint.setColor(aob.w0(null, aob.d6, false));
        paint.setShadowLayer(hl.L(1.33f), 0.0f, hl.L(0.33f), 503316480);
        g7Var.setWillNotDraw(false);
        g7Var.setOrientation(1);
        g7Var.setPadding(hl.L(32.0f), hl.L(16.0f), hl.L(32.0f), hl.L(32.0f));
        de0 de0Var = new de0(context);
        this.b = de0Var;
        de0Var.setOnClickListener(new View.OnClickListener(this) { // from class: bl3
            public final /* synthetic */ bk3 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b3 = b2;
                bk3 bk3Var = this.b;
                switch (b3) {
                    case 0:
                        bk3Var.b.getImageReceiver().w0(false);
                        break;
                    default:
                        bk3Var.f.L();
                        break;
                }
            }
        });
        a();
        g7Var.addView(de0Var, tre.r(jn7.N1, jn7.N1, 49));
        TextView textView = new TextView(context);
        this.c = textView;
        textView.setGravity(17);
        textView.setTextSize(1, 18.0f);
        yob.X(textView, aob.G6, null);
        textView.setTypeface(hl.o());
        g7Var.addView(textView, tre.t(-1, -2, 49, 0, 6, 0, 0));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setGravity(17);
        textView2.setTextSize(1, 14.0f);
        yob.X(textView2, aob.y6, null);
        g7Var.addView(textView2, tre.t(-1, -2, 49, 0, 7, 0, 0));
        TextView textView3 = new TextView(context);
        this.e = textView3;
        textView3.setGravity(17);
        textView3.setBackground(rnb.f(aob.Fi, 8.0f));
        textView3.setTextSize(1, 14.0f);
        yob.X(textView3, aob.Ji, null);
        textView3.setTypeface(hl.o());
        textView3.setPadding(hl.L(14.0f), hl.L(14.0f), hl.L(14.0f), hl.L(14.0f));
        textView3.setOnClickListener(new View.OnClickListener(this) { // from class: bl3
            public final /* synthetic */ bk3 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b3 = b;
                bk3 bk3Var = this.b;
                switch (b3) {
                    case 0:
                        bk3Var.b.getImageReceiver().w0(false);
                        break;
                    default:
                        bk3Var.f.L();
                        break;
                }
            }
        });
        g7Var.addView(textView3, tre.t(-1, -2, 49, 0, 18, 0, 0));
        addView(g7Var, tre.o(-1, -2));
        set(null);
    }
}
