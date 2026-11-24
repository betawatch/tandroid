// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class hk1 extends FrameLayout {
    public final ylb a;
    public final fn b;
    public final TextView c;
    public final TextView d;
    public final DecimalFormat e;
    public boolean f;

    public hk1(Context context, ylb ylbVar) {
        super(context);
        this.a = ylbVar;
        LinearLayout i = hg9.i(context, 1);
        addView(i, qoe.d(-1, -2.0f, nm7.D1, 17.0f, 9.0f, 130.0f, 9.0f));
        TextView textView = new TextView(context);
        this.c = textView;
        textView.setTextSize(1, 16.0f);
        anb.X(textView, cmb.F6, ylbVar);
        i.addView(textView, qoe.o(-1, -2));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setTextSize(1, 13.0f);
        anb.X(textView2, cmb.x6, ylbVar);
        i.addView(textView2, qoe.k(0.0f, 4.0f, 0.0f, 0.0f, -1, -2));
        fn fnVar = new fn(context);
        this.b = fnVar;
        fnVar.setTypeface(gm.o());
        fnVar.setTextSize(1, 13.0f);
        addView(fnVar, qoe.d(-2, -2.0f, 21, 0.0f, 0.0f, 18.0f, 0.0f));
        DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(Locale.US);
        decimalFormatSymbols.setDecimalSeparator('.');
        DecimalFormat decimalFormat = new DecimalFormat("#.##", decimalFormatSymbols);
        this.e = decimalFormat;
        decimalFormat.setMinimumFractionDigits(2);
        decimalFormat.setMaximumFractionDigits(12);
        decimalFormat.setGroupingUsed(false);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f) {
            ylb ylbVar = this.a;
            Paint d = ylbVar != null ? ylbVar.d("paintDivider") : cmb.j0;
            if (d != null) {
                canvas.drawLine(jb6.a0 ? 0.0f : gm.L(17.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (jb6.a0 ? gm.L(17.0f) : 0), getMeasuredHeight() - 1, d);
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), i2);
    }
}
