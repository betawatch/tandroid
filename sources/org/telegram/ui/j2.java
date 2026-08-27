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

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class j2 extends View {
    public final /* synthetic */ d70 a;
    public final /* synthetic */ k4 b;
    public final /* synthetic */ k2 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j2(k2 k2Var, Context context, d70 d70Var, k4 k4Var) {
        super(context);
        this.c = k2Var;
        this.a = d70Var;
        this.b = k4Var;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        k2 k2Var = this.c;
        if (k2Var.c != null) {
            canvas.save();
            m4.v(this.a, canvas, k2Var, 0);
            k2Var.c.draw(canvas, this);
            canvas.restore();
            k2Var.c.s = (int) getX();
            k2Var.c.v = (int) getY();
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12;
        k2 k2Var = this.c;
        TL_iv.pageBlockPreformatted pageblockpreformatted = k2Var.f;
        int i13 = 1;
        if (pageblockpreformatted != null) {
            CharSequence charSequence = k2Var.h;
            k4 k4Var = this.b;
            d70 d70Var = this.a;
            if (charSequence == null) {
                TL_iv.RichText richText = pageblockpreformatted.text;
                int dp = AndroidUtilities.dp(5000.0f);
                HashSet hashSet = m4.X0;
                k2Var.h = m4.C(d70Var, k4Var.A, this, richText, richText, pageblockpreformatted, dp);
                if (!TextUtils.isEmpty(k2Var.f.language)) {
                    k2Var.h = CodeHighlighting.getHighlighted(k2Var.h, k2Var.f.language);
                }
            }
            f3 q6 = m4.q(d70Var, this, k2Var.h, null, AndroidUtilities.dp(5000.0f), 0, k2Var.f, k4Var);
            k2Var.c = q6;
            if (q6 != null) {
                i12 = q6.d.getHeight();
                int lineCount = k2Var.c.d.getLineCount();
                for (int i14 = 0; i14 < lineCount; i14++) {
                    i13 = Math.max((int) Math.ceil(k2Var.c.d.getLineWidth(i14)), i13);
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
        k2 k2Var = this.c;
        return m4.l(this.a, this.b, motionEvent, k2Var, k2Var.c, 0, 0) || super.onTouchEvent(motionEvent);
    }
}
