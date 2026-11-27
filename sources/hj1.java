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

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class hj1 extends FrameLayout {
    public final vnb a;
    public final gm b;
    public final TextView c;
    public final TextView d;
    public final DecimalFormat e;
    public boolean f;

    public hj1(Context context, vnb vnbVar) {
        super(context);
        this.a = vnbVar;
        LinearLayout j = uh9.j(context, 1);
        addView(j, tre.d(-1, -2.0f, jn7.D1, 17.0f, 9.0f, 130.0f, 9.0f));
        TextView textView = new TextView(context);
        this.c = textView;
        textView.setTextSize(1, 16.0f);
        yob.X(textView, aob.G6, vnbVar);
        j.addView(textView, tre.o(-1, -2));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setTextSize(1, 13.0f);
        yob.X(textView2, aob.y6, vnbVar);
        j.addView(textView2, tre.k(0.0f, 4.0f, 0.0f, 0.0f, -1, -2));
        gm gmVar = new gm(context);
        this.b = gmVar;
        gmVar.setTypeface(hl.o());
        gmVar.setTextSize(1, 13.0f);
        addView(gmVar, tre.d(-2, -2.0f, 21, 0.0f, 0.0f, 18.0f, 0.0f));
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
            vnb vnbVar = this.a;
            Paint d = vnbVar != null ? vnbVar.d("paintDivider") : aob.j0;
            if (d != null) {
                canvas.drawLine(ob6.a0 ? 0.0f : hl.L(17.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (ob6.a0 ? hl.L(17.0f) : 0), getMeasuredHeight() - 1, d);
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), i2);
    }
}
