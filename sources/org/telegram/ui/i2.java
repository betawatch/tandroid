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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class i2 extends View {
    public final /* synthetic */ a70 a;
    public final /* synthetic */ j4 b;
    public final /* synthetic */ j2 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i2(j2 j2Var, Context context, a70 a70Var, j4 j4Var) {
        super(context);
        this.c = j2Var;
        this.a = a70Var;
        this.b = j4Var;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        j2 j2Var = this.c;
        if (j2Var.c != null) {
            canvas.save();
            l4.v(this.a, canvas, j2Var, 0);
            j2Var.c.draw(canvas, this);
            canvas.restore();
            j2Var.c.s = (int) getX();
            j2Var.c.v = (int) getY();
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i9, int i10) {
        int i11;
        j2 j2Var = this.c;
        TL_iv.pageBlockPreformatted pageblockpreformatted = j2Var.f;
        int i12 = 1;
        if (pageblockpreformatted != null) {
            CharSequence charSequence = j2Var.h;
            j4 j4Var = this.b;
            a70 a70Var = this.a;
            if (charSequence == null) {
                TL_iv.RichText richText = pageblockpreformatted.text;
                int dp = AndroidUtilities.dp(5000.0f);
                HashSet hashSet = l4.X0;
                j2Var.h = l4.C(a70Var, j4Var.A, this, richText, richText, pageblockpreformatted, dp);
                if (!TextUtils.isEmpty(j2Var.f.language)) {
                    j2Var.h = CodeHighlighting.getHighlighted(j2Var.h, j2Var.f.language);
                }
            }
            e3 q10 = l4.q(a70Var, this, j2Var.h, null, AndroidUtilities.dp(5000.0f), 0, j2Var.f, j4Var);
            j2Var.c = q10;
            if (q10 != null) {
                i11 = q10.d.getHeight();
                int lineCount = j2Var.c.d.getLineCount();
                for (int i13 = 0; i13 < lineCount; i13++) {
                    i12 = Math.max((int) Math.ceil(j2Var.c.d.getLineWidth(i13)), i12);
                }
            } else {
                i11 = 0;
            }
        } else {
            i11 = 1;
        }
        setMeasuredDimension(AndroidUtilities.dp(32.0f) + i12, i11);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        j2 j2Var = this.c;
        return l4.l(this.a, this.b, motionEvent, j2Var, j2Var.c, 0, 0) || super.onTouchEvent(motionEvent);
    }
}
