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

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class f2 extends View {
    public final /* synthetic */ v70 a;
    public final /* synthetic */ g4 b;
    public final /* synthetic */ g2 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f2(g2 g2Var, Context context, v70 v70Var, g4 g4Var) {
        super(context);
        this.c = g2Var;
        this.a = v70Var;
        this.b = g4Var;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        g2 g2Var = this.c;
        if (g2Var.c != null) {
            canvas.save();
            i4.v(this.a, canvas, g2Var, 0);
            g2Var.c.draw(canvas, this);
            canvas.restore();
            g2Var.c.s = (int) getX();
            g2Var.c.v = (int) getY();
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12;
        g2 g2Var = this.c;
        TL_iv.pageBlockPreformatted pageblockpreformatted = g2Var.f;
        int i13 = 1;
        if (pageblockpreformatted != null) {
            CharSequence charSequence = g2Var.h;
            g4 g4Var = this.b;
            v70 v70Var = this.a;
            if (charSequence == null) {
                TL_iv.RichText richText = pageblockpreformatted.text;
                int dp = AndroidUtilities.dp(5000.0f);
                HashSet hashSet = i4.b1;
                g2Var.h = i4.C(v70Var, g4Var.E, this, richText, richText, pageblockpreformatted, dp);
                if (!TextUtils.isEmpty(g2Var.f.language)) {
                    g2Var.h = CodeHighlighting.getHighlighted(g2Var.h, g2Var.f.language);
                }
            }
            b3 q6 = i4.q(v70Var, this, g2Var.h, null, AndroidUtilities.dp(5000.0f), 0, g2Var.f, g4Var);
            g2Var.c = q6;
            if (q6 != null) {
                i12 = q6.d.getHeight();
                int lineCount = g2Var.c.d.getLineCount();
                for (int i14 = 0; i14 < lineCount; i14++) {
                    i13 = Math.max((int) Math.ceil(g2Var.c.d.getLineWidth(i14)), i13);
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
        g2 g2Var = this.c;
        return i4.l(this.a, this.b, motionEvent, g2Var, g2Var.c, 0, 0) || super.onTouchEvent(motionEvent);
    }
}
