package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final class g2 extends View {
    public final /* synthetic */ f70 a;
    public final /* synthetic */ i4 b;
    public final /* synthetic */ h2 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g2(h2 h2Var, Context context, f70 f70Var, i4 i4Var) {
        super(context);
        this.c = h2Var;
        this.a = f70Var;
        this.b = i4Var;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        h2 h2Var = this.c;
        if (h2Var.c != null) {
            canvas.save();
            k4.v(this.a, canvas, h2Var, 0);
            h2Var.c.draw(canvas, this);
            canvas.restore();
            h2Var.c.s = (int) getX();
            h2Var.c.v = (int) getY();
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12;
        h2 h2Var = this.c;
        TL_iv.pageBlockPreformatted pageblockpreformatted = h2Var.f;
        int i13 = 1;
        if (pageblockpreformatted != null) {
            CharSequence charSequence = h2Var.h;
            i4 i4Var = this.b;
            f70 f70Var = this.a;
            if (charSequence == null) {
                TL_iv.RichText richText = pageblockpreformatted.text;
                int dp = AndroidUtilities.dp(5000.0f);
                HashSet hashSet = k4.c1;
                h2Var.h = k4.C(f70Var, i4Var.E, this, richText, richText, pageblockpreformatted, dp);
                if (!TextUtils.isEmpty(h2Var.f.language)) {
                    h2Var.h = mi.k.b(h2Var.h, h2Var.f.language);
                }
            }
            c3 q6 = k4.q(f70Var, this, h2Var.h, null, AndroidUtilities.dp(5000.0f), 0, h2Var.f, i4Var);
            h2Var.c = q6;
            if (q6 != null) {
                i12 = q6.d.getHeight();
                int lineCount = h2Var.c.d.getLineCount();
                for (int i14 = 0; i14 < lineCount; i14++) {
                    i13 = Math.max((int) Math.ceil(h2Var.c.d.getLineWidth(i14)), i13);
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
        h2 h2Var = this.c;
        return k4.l(this.a, this.b, motionEvent, h2Var, h2Var.c, 0, 0) || super.onTouchEvent(motionEvent);
    }
}
