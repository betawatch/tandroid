package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.CodeHighlighting;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class h2 extends View {
    public final /* synthetic */ o70 a;
    public final /* synthetic */ j4 b;
    public final /* synthetic */ i2 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h2(i2 i2Var, Context context, o70 o70Var, j4 j4Var) {
        super(context);
        this.c = i2Var;
        this.a = o70Var;
        this.b = j4Var;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        i2 i2Var = this.c;
        if (i2Var.c != null) {
            canvas.save();
            l4.v(this.a, canvas, i2Var, 0);
            i2Var.c.draw(canvas, this);
            canvas.restore();
            i2Var.c.s = (int) getX();
            i2Var.c.v = (int) getY();
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12;
        i2 i2Var = this.c;
        TL_iv.pageBlockPreformatted pageblockpreformatted = i2Var.f;
        int i13 = 1;
        if (pageblockpreformatted != null) {
            CharSequence charSequence = i2Var.h;
            j4 j4Var = this.b;
            o70 o70Var = this.a;
            if (charSequence == null) {
                TL_iv.RichText richText = pageblockpreformatted.text;
                int dp = AndroidUtilities.dp(5000.0f);
                HashSet hashSet = l4.Y0;
                i2Var.h = l4.C(o70Var, j4Var.B, this, richText, richText, pageblockpreformatted, dp);
                if (!TextUtils.isEmpty(i2Var.f.language)) {
                    i2Var.h = CodeHighlighting.getHighlighted(i2Var.h, i2Var.f.language);
                }
            }
            d3 q10 = l4.q(o70Var, this, i2Var.h, null, AndroidUtilities.dp(5000.0f), 0, i2Var.f, j4Var);
            i2Var.c = q10;
            if (q10 != null) {
                i12 = q10.d.getHeight();
                int lineCount = i2Var.c.d.getLineCount();
                for (int i14 = 0; i14 < lineCount; i14++) {
                    i13 = Math.max((int) Math.ceil(i2Var.c.d.getLineWidth(i14)), i13);
                }
            } else {
                i12 = 0;
            }
        } else {
            i12 = 1;
        }
        setMeasuredDimension(AndroidUtilities.dp(32.0f) + i13, i12);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        i2 i2Var = this.c;
        return l4.l(this.a, this.b, motionEvent, i2Var, i2Var.c, 0, 0) || super.onTouchEvent(motionEvent);
    }
}
