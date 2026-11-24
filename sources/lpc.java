// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;
import android.text.Editable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.MotionEvent;
import java.util.ArrayList;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes3.dex */
public final class lpc extends EditTextBoldCursor {
    public final lm M1;
    public final lm N1;
    public float O1;
    public float P1;
    public final /* synthetic */ ppc Q1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lpc(ppc ppcVar, Context context) {
        super(context);
        this.Q1 = ppcVar;
        this.M1 = new lm(180L, this, s33.h);
        this.N1 = new lm(320L, this, ppc.T);
        this.O1 = 1.0f;
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor
    public final void n(Canvas canvas, GradientDrawable gradientDrawable) {
        gradientDrawable.setCornerRadius(gl.N(1.5f));
        int lineBaseline = getLayout().getLineBaseline(0);
        Rect bounds = gradientDrawable.getBounds();
        float f = lineBaseline;
        int round = Math.round(((bounds.top - lineBaseline) * this.O1) + f);
        int round2 = Math.round(((bounds.bottom - lineBaseline) * this.O1) + f);
        int i = bounds.left;
        int width = bounds.width();
        if (this.P1 > 0.0f) {
            float f2 = i;
            i = Math.round((((((((getWidth() + getScrollX()) - getCompoundPaddingLeft()) - getCompoundPaddingRight()) - getPaint().measureText("0")) - width) - f2) * this.P1) + f2);
        }
        gradientDrawable.setBounds(i, round, width + i, round2);
        gradientDrawable.draw(canvas);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0082  */
    @Override // org.telegram.ui.Components.EditTextBoldCursor, lt3, android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onDraw(Canvas canvas) {
        float lineLeft;
        int size;
        Editable text = getText();
        int max = Math.max(TextUtils.indexOf((CharSequence) text, '.'), TextUtils.indexOf((CharSequence) text, ','));
        int i = 0;
        this.O1 = this.M1.e(false, (max < 0 || getSelectionStart() <= max) ? 1.0f : 0.6363636f);
        this.P1 = this.N1.d(length() == 0);
        super.onDraw(canvas);
        ppc ppcVar = this.Q1;
        if (ppcVar.J >= 1.0f) {
            return;
        }
        TextPaint paint = getPaint();
        float textSize = paint.getTextSize();
        float compoundPaddingLeft = getCompoundPaddingLeft();
        if (length() != 0) {
            if (getLayout() != null) {
                lineLeft = getLayout().getLineLeft(0);
            }
            float f = compoundPaddingLeft;
            int baseline = getBaseline();
            ArrayList arrayList = ppcVar.M;
            size = arrayList.size();
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                npc npcVar = (npc) obj;
                paint.setTextSize(npcVar.b ? (28.0f * textSize) / 44.0f : textSize);
                npcVar.c.b(canvas, paint, npcVar.a, f, baseline);
            }
            paint.setTextSize(textSize);
        }
        lineLeft = getScrollX() + ppcVar.O;
        compoundPaddingLeft += lineLeft;
        float f2 = compoundPaddingLeft;
        int baseline2 = getBaseline();
        ArrayList arrayList2 = ppcVar.M;
        size = arrayList2.size();
        while (i < size) {
        }
        paint.setTextSize(textSize);
    }

    @Override // lt3, android.widget.TextView
    public final void onSelectionChanged(int i, int i2) {
        super.onSelectionChanged(i, i2);
        if (i != i2) {
            this.Q1.b();
        }
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 0) {
            this.Q1.b();
            this.N1.a(length() == 0);
        }
        return super.onTouchEvent(motionEvent);
    }
}
