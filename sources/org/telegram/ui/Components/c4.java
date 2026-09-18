package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Point;
import android.text.TextPaint;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public final class c4 extends LinearLayout {
    public final /* synthetic */ int a = 1;
    public boolean b;
    public final /* synthetic */ dd0 c;
    public final Object d;
    public final /* synthetic */ dd0 e;
    public final /* synthetic */ dd0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c4(Context context, c5 c5Var, dd0 dd0Var, tg.g gVar, tg.h hVar) {
        super(context);
        this.c = dd0Var;
        this.e = gVar;
        this.f = hVar;
        this.b = false;
        TextPaint textPaint = new TextPaint(1);
        this.d = textPaint;
        setWillNotDraw(false);
        textPaint.setTextSize(AndroidUtilities.dp(20.0f));
        textPaint.setTypeface(AndroidUtilities.bold());
        textPaint.setColor(c5Var.a);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onDraw(Canvas canvas) {
        switch (this.a) {
            case 1:
                super.onDraw(canvas);
                canvas.drawText(":", ((tg.g) this.e).getRight() - AndroidUtilities.dp(12.0f), (getHeight() / 2.0f) - AndroidUtilities.dp(11.0f), (TextPaint) this.d);
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
                dd0 dd0Var = (dd0) this.d;
                this.b = true;
                Point point = AndroidUtilities.displaySize;
                int i12 = point.x > point.y ? 3 : 5;
                dd0 dd0Var2 = this.c;
                dd0Var2.setItemCount(i12);
                dd0Var.setItemCount(i12);
                dd0 dd0Var3 = this.e;
                dd0Var3.setItemCount(i12);
                dd0 dd0Var4 = this.f;
                dd0Var4.setItemCount(i12);
                dd0Var2.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
                dd0Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
                dd0Var3.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
                dd0Var4.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
                this.b = false;
                super.onMeasure(i10, i11);
                break;
            default:
                tg.h hVar = (tg.h) this.f;
                tg.g gVar = (tg.g) this.e;
                this.b = true;
                Point point2 = AndroidUtilities.displaySize;
                int i13 = point2.x > point2.y ? 3 : 5;
                dd0 dd0Var5 = this.c;
                dd0Var5.setItemCount(i13);
                gVar.setItemCount(i13);
                hVar.setItemCount(i13);
                dd0Var5.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i13;
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
    public c4(Context context, dd0 dd0Var, dd0 dd0Var2, dd0 dd0Var3, dd0 dd0Var4) {
        super(context);
        this.c = dd0Var;
        this.d = dd0Var2;
        this.e = dd0Var3;
        this.f = dd0Var4;
        this.b = false;
    }
}
