package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Point;
import android.text.TextPaint;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final class d4 extends LinearLayout {
    public final /* synthetic */ int a = 1;
    public boolean b;
    public final /* synthetic */ od0 c;
    public final Object d;
    public final /* synthetic */ od0 e;
    public final /* synthetic */ od0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d4(Context context, d5 d5Var, od0 od0Var, ug.g gVar, ug.h hVar) {
        super(context);
        this.c = od0Var;
        this.e = gVar;
        this.f = hVar;
        this.b = false;
        TextPaint textPaint = new TextPaint(1);
        this.d = textPaint;
        setWillNotDraw(false);
        textPaint.setTextSize(AndroidUtilities.dp(20.0f));
        textPaint.setTypeface(AndroidUtilities.bold());
        textPaint.setColor(d5Var.a);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onDraw(Canvas canvas) {
        switch (this.a) {
            case 1:
                super.onDraw(canvas);
                canvas.drawText(":", ((ug.g) this.e).getRight() - AndroidUtilities.dp(12.0f), (getHeight() / 2.0f) - AndroidUtilities.dp(11.0f), (TextPaint) this.d);
                break;
            default:
                super.onDraw(canvas);
                break;
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        switch (this.a) {
            case 0:
                od0 od0Var = (od0) this.d;
                this.b = true;
                Point point = AndroidUtilities.displaySize;
                int i12 = point.x > point.y ? 3 : 5;
                od0 od0Var2 = this.c;
                od0Var2.setItemCount(i12);
                od0Var.setItemCount(i12);
                od0 od0Var3 = this.e;
                od0Var3.setItemCount(i12);
                od0 od0Var4 = this.f;
                od0Var4.setItemCount(i12);
                od0Var2.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
                od0Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
                od0Var3.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
                od0Var4.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
                this.b = false;
                super.onMeasure(i10, i11);
                break;
            default:
                ug.h hVar = (ug.h) this.f;
                ug.g gVar = (ug.g) this.e;
                this.b = true;
                Point point2 = AndroidUtilities.displaySize;
                int i13 = point2.x > point2.y ? 3 : 5;
                od0 od0Var5 = this.c;
                od0Var5.setItemCount(i13);
                gVar.setItemCount(i13);
                hVar.setItemCount(i13);
                od0Var5.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i13;
                gVar.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i13;
                hVar.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i13;
                this.b = false;
                super.onMeasure(i10, i11);
                break;
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        switch (this.a) {
            case 0:
                if (!this.b) {
                    super.requestLayout();
                    break;
                }
                break;
            default:
                if (!this.b) {
                    super.requestLayout();
                    break;
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d4(Context context, od0 od0Var, od0 od0Var2, od0 od0Var3, od0 od0Var4) {
        super(context);
        this.c = od0Var;
        this.d = od0Var2;
        this.e = od0Var3;
        this.f = od0Var4;
        this.b = false;
    }
}
