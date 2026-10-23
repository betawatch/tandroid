package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final class h2 extends View {
    public final /* synthetic */ b70 a;
    public final /* synthetic */ j4 b;
    public final /* synthetic */ i2 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h2(i2 i2Var, Context context, b70 b70Var, j4 j4Var) {
        super(context);
        this.c = i2Var;
        this.a = b70Var;
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
            b70 b70Var = this.a;
            if (charSequence == null) {
                TL_iv.RichText richText = pageblockpreformatted.text;
                int dp = AndroidUtilities.dp(5000.0f);
                HashSet hashSet = l4.b1;
                i2Var.h = l4.C(b70Var, j4Var.E, this, richText, richText, pageblockpreformatted, dp);
                if (!TextUtils.isEmpty(i2Var.f.language)) {
                    i2Var.h = mi.k.b(i2Var.h, i2Var.f.language);
                }
            }
            d3 q6 = l4.q(b70Var, this, i2Var.h, null, AndroidUtilities.dp(5000.0f), 0, i2Var.f, j4Var);
            i2Var.c = q6;
            if (q6 != null) {
                i12 = q6.d.getHeight();
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
