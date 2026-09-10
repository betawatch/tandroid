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

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class g2 extends View {
    public final /* synthetic */ t70 a;
    public final /* synthetic */ h4 b;
    public final /* synthetic */ h2 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g2(h2 h2Var, Context context, t70 t70Var, h4 h4Var) {
        super(context);
        this.c = h2Var;
        this.a = t70Var;
        this.b = h4Var;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        h2 h2Var = this.c;
        if (h2Var.c != null) {
            canvas.save();
            j4.v(this.a, canvas, h2Var, 0);
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
            h4 h4Var = this.b;
            t70 t70Var = this.a;
            if (charSequence == null) {
                TL_iv.RichText richText = pageblockpreformatted.text;
                int dp = AndroidUtilities.dp(5000.0f);
                HashSet hashSet = j4.b1;
                h2Var.h = j4.C(t70Var, h4Var.E, this, richText, richText, pageblockpreformatted, dp);
                if (!TextUtils.isEmpty(h2Var.f.language)) {
                    h2Var.h = CodeHighlighting.getHighlighted(h2Var.h, h2Var.f.language);
                }
            }
            c3 q6 = j4.q(t70Var, this, h2Var.h, null, AndroidUtilities.dp(5000.0f), 0, h2Var.f, h4Var);
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
        return j4.l(this.a, this.b, motionEvent, h2Var, h2Var.c, 0, 0) || super.onTouchEvent(motionEvent);
    }
}
