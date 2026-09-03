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

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class j2 extends View {
    public final /* synthetic */ p70 a;
    public final /* synthetic */ l4 b;
    public final /* synthetic */ k2 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j2(k2 k2Var, Context context, p70 p70Var, l4 l4Var) {
        super(context);
        this.c = k2Var;
        this.a = p70Var;
        this.b = l4Var;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        k2 k2Var = this.c;
        if (k2Var.c != null) {
            canvas.save();
            n4.v(this.a, canvas, k2Var, 0);
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
            l4 l4Var = this.b;
            p70 p70Var = this.a;
            if (charSequence == null) {
                TL_iv.RichText richText = pageblockpreformatted.text;
                int dp = AndroidUtilities.dp(5000.0f);
                HashSet hashSet = n4.Y0;
                k2Var.h = n4.C(p70Var, l4Var.B, this, richText, richText, pageblockpreformatted, dp);
                if (!TextUtils.isEmpty(k2Var.f.language)) {
                    k2Var.h = CodeHighlighting.getHighlighted(k2Var.h, k2Var.f.language);
                }
            }
            f3 q10 = n4.q(p70Var, this, k2Var.h, null, AndroidUtilities.dp(5000.0f), 0, k2Var.f, l4Var);
            k2Var.c = q10;
            if (q10 != null) {
                i12 = q10.d.getHeight();
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
        return n4.l(this.a, this.b, motionEvent, k2Var, k2Var.c, 0, 0) || super.onTouchEvent(motionEvent);
    }
}
