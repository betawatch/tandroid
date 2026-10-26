package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class e2 extends View {
    public final /* synthetic */ h70 a;
    public final /* synthetic */ h4 b;
    public final /* synthetic */ f2 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e2(f2 f2Var, Context context, h70 h70Var, h4 h4Var) {
        super(context);
        this.c = f2Var;
        this.a = h70Var;
        this.b = h4Var;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        f2 f2Var = this.c;
        if (f2Var.c != null) {
            canvas.save();
            j4.v(this.a, canvas, f2Var, 0);
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
            h4 h4Var = this.b;
            h70 h70Var = this.a;
            if (charSequence == null) {
                TL_iv.RichText richText = pageblockpreformatted.text;
                int dp = AndroidUtilities.dp(5000.0f);
                HashSet hashSet = j4.c1;
                f2Var.h = j4.C(h70Var, h4Var.E, this, richText, richText, pageblockpreformatted, dp);
                if (!TextUtils.isEmpty(f2Var.f.language)) {
                    f2Var.h = ni.k.b(f2Var.h, f2Var.f.language);
                }
            }
            a3 q5 = j4.q(h70Var, this, f2Var.h, null, AndroidUtilities.dp(5000.0f), 0, f2Var.f, h4Var);
            f2Var.c = q5;
            if (q5 != null) {
                i12 = q5.d.getHeight();
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
        return j4.l(this.a, this.b, motionEvent, f2Var, f2Var.c, 0, 0) || super.onTouchEvent(motionEvent);
    }
}
