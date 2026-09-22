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

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class e2 extends View {
    public final /* synthetic */ u70 a;
    public final /* synthetic */ f4 b;
    public final /* synthetic */ f2 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e2(f2 f2Var, Context context, u70 u70Var, f4 f4Var) {
        super(context);
        this.c = f2Var;
        this.a = u70Var;
        this.b = f4Var;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        f2 f2Var = this.c;
        if (f2Var.c != null) {
            canvas.save();
            h4.v(this.a, canvas, f2Var, 0);
            f2Var.c.draw(canvas, this);
            canvas.restore();
            f2Var.c.s = (int) getX();
            f2Var.c.v = (int) getY();
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12;
        f2 f2Var = this.c;
        TL_iv.pageBlockPreformatted pageblockpreformatted = f2Var.f;
        int i13 = 1;
        if (pageblockpreformatted != null) {
            CharSequence charSequence = f2Var.h;
            f4 f4Var = this.b;
            u70 u70Var = this.a;
            if (charSequence == null) {
                TL_iv.RichText richText = pageblockpreformatted.text;
                int dp = AndroidUtilities.dp(5000.0f);
                HashSet hashSet = h4.b1;
                f2Var.h = h4.C(u70Var, f4Var.E, this, richText, richText, pageblockpreformatted, dp);
                if (!TextUtils.isEmpty(f2Var.f.language)) {
                    f2Var.h = CodeHighlighting.getHighlighted(f2Var.h, f2Var.f.language);
                }
            }
            a3 q6 = h4.q(u70Var, this, f2Var.h, null, AndroidUtilities.dp(5000.0f), 0, f2Var.f, f4Var);
            f2Var.c = q6;
            if (q6 != null) {
                i12 = q6.d.getHeight();
                int lineCount = f2Var.c.d.getLineCount();
                for (int i14 = 0; i14 < lineCount; i14++) {
                    i13 = Math.max((int) Math.ceil(f2Var.c.d.getLineWidth(i14)), i13);
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
        f2 f2Var = this.c;
        return h4.l(this.a, this.b, motionEvent, f2Var, f2Var.c, 0, 0) || super.onTouchEvent(motionEvent);
    }
}
