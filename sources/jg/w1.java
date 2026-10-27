package jg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.f7;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.aq;
import org.telegram.ui.Components.j9;
import org.telegram.ui.Components.kb1;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class w1 extends FrameLayout implements p6 {
    public final j9 a;
    public final ImageReceiver b;
    public final TextView c;
    public final TextView d;
    public final aq e;
    public final Path f;
    public final Paint h;
    public final u6 n;
    public final int[] r;
    public boolean s;

    public w1(Context context, u6 u6Var) {
        super(context);
        this.a = new j9((u6) null);
        this.b = new ImageReceiver(this);
        this.f = new Path();
        this.h = new Paint(1);
        this.r = new int[1];
        this.n = u6Var;
        setWillNotDraw(false);
        TextView textView = new TextView(context);
        this.c = textView;
        textView.setSingleLine();
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        f7.V(textView, y6.G6, u6Var);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextSize(1, 16.0f);
        boolean z10 = LocaleController.isRTL;
        addView(textView, kb1.h(-1, -2.0f, 7, z10 ? 40.0f : 78.0f, 10.33f, z10 ? 78.0f : 40.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setLines(2);
        textView2.setEllipsize(truncateAt);
        f7.V(textView2, y6.z6, u6Var);
        textView2.setTextSize(1, 15.0f);
        boolean z11 = LocaleController.isRTL;
        addView(textView2, kb1.h(-1, -2.0f, 7, z11 ? 40.0f : 78.0f, 32.0f, z11 ? 78.0f : 40.0f, 0.0f));
        aq aqVar = new aq(getContext(), 21, u6Var);
        this.e = aqVar;
        aqVar.b(-1, y6.d6, y6.k7);
        aqVar.setDrawUnchecked(false);
        aqVar.setDrawBackgroundAsArc(3);
        addView(aqVar, kb1.m(24.0f, 24.0f, 8388659, 33.0f, 25.0f, 0.0f, 0.0f));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float measuredWidth = LocaleController.isRTL ? getMeasuredWidth() - AndroidUtilities.dp(65.0f) : AndroidUtilities.dp(9.0f);
        float dp = AndroidUtilities.dp(11.33f);
        float dp2 = AndroidUtilities.dp(56.0f);
        float dp3 = AndroidUtilities.dp(56.0f);
        ImageReceiver imageReceiver = this.b;
        imageReceiver.setImageCoords(measuredWidth, dp, dp2, dp3);
        imageReceiver.draw(canvas);
        super.onDraw(canvas);
        canvas.drawPath(this.f, this.h);
        if (this.s) {
            Paint V0 = y6.V0("paintDivider", this.n);
            if (V0 == null) {
                V0 = y6.k0;
            }
            canvas.drawRect(AndroidUtilities.dp(LocaleController.isRTL ? 0.0f : 78.0f), getMeasuredHeight() - 1, getWidth() - AndroidUtilities.dp(LocaleController.isRTL ? 78.0f : 0.0f), getMeasuredHeight(), V0);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(78.0f) + (this.s ? 1 : 0), TLObject.FLAG_30));
        Paint.Style style = Paint.Style.STROKE;
        Paint paint = this.h;
        paint.setStyle(style);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeWidth(AndroidUtilities.dpf2(1.66f));
        paint.setColor(y6.o1(0.85f, y6.w0(y6.z6, this.n)));
        Path path = this.f;
        path.rewind();
        float measuredHeight = getMeasuredHeight() / 2.0f;
        float dpf2 = LocaleController.isRTL ? AndroidUtilities.dpf2(29.66f) : getMeasuredWidth() - AndroidUtilities.dpf2(24.33f);
        path.moveTo(dpf2, measuredHeight - AndroidUtilities.dpf2(5.66f));
        path.lineTo((AndroidUtilities.dpf2(5.33f) * (LocaleController.isRTL ? -1 : 1)) + dpf2, measuredHeight);
        path.lineTo(dpf2, AndroidUtilities.dpf2(5.66f) + measuredHeight);
    }

    @Override // org.telegram.ui.ActionBar.p6
    public final void updateColors() {
        try {
            this.h.setColor(y6.o1(0.85f, y6.w0(y6.z6, this.n)));
            invalidate();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override // org.telegram.ui.ActionBar.p6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
