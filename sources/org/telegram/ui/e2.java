package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.text.StaticLayout;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import java.util.HashSet;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class e2 extends View {
    public final /* synthetic */ m60 a;
    public final /* synthetic */ f4 b;
    public final /* synthetic */ f2 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e2(f2 f2Var, Context context, m60 m60Var, f4 f4Var) {
        super(context);
        this.c = f2Var;
        this.a = m60Var;
        this.b = f4Var;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        f2 f2Var = this.c;
        if (f2Var.c != null) {
            canvas.save();
            h4.t(this.a, canvas, f2Var, 0);
            f2Var.c.d(canvas, this);
            canvas.restore();
            f2Var.c.s = (int) getX();
            f2Var.c.w = (int) getY();
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12;
        StaticLayout staticLayout;
        StaticLayout staticLayout2;
        f2 f2Var = this.c;
        TL_iv.pageBlockPreformatted pageblockpreformatted = f2Var.f;
        int i13 = 1;
        if (pageblockpreformatted != null) {
            CharSequence charSequence = f2Var.h;
            f4 f4Var = this.b;
            m60 m60Var = this.a;
            if (charSequence == null) {
                TL_iv.RichText richText = pageblockpreformatted.text;
                int L = org.telegram.messenger.i0.L(5000.0f);
                HashSet hashSet = h4.c1;
                CharSequence A = h4.A(m60Var, f4Var.E, this, richText, richText, pageblockpreformatted, L);
                f2Var.h = A;
                TL_iv.pageBlockPreformatted pageblockpreformatted2 = f2Var.f;
                if (pageblockpreformatted2.diff) {
                    f2Var.h = f2.b(f2Var, A, pageblockpreformatted2.language);
                } else if (!TextUtils.isEmpty(pageblockpreformatted2.language)) {
                    f2Var.h = di.l.b(f2Var.h, f2Var.f.language);
                }
            }
            z2 o10 = h4.o(m60Var, this, f2Var.h, null, org.telegram.messenger.i0.L(5000.0f), 0, f2Var.f, f4Var);
            f2Var.c = o10;
            if (o10 != null) {
                i12 = o10.d.getHeight();
                int lineCount = f2Var.c.d.getLineCount();
                int i14 = 1;
                for (int i15 = 0; i15 < lineCount; i15++) {
                    i14 = Math.max((int) Math.ceil(f2Var.c.d.getLineWidth(i15)), i14);
                }
                if (f2Var.f.diff && (staticLayout2 = f2Var.c.d) != null) {
                    i14 = Math.max((int) Math.ceil(staticLayout2.getPaint().measureText("m") * f2Var.f.diffColumns), i14);
                }
                f2Var.r = 0;
                if (f2Var.f.continuesNext && (staticLayout = f2Var.c.d) != null && staticLayout.getLineCount() > 1) {
                    StaticLayout staticLayout3 = f2Var.c.d;
                    int lineCount2 = staticLayout3.getLineCount() - 1;
                    int max = Math.max(0, (staticLayout3.getLineBottom(0) - staticLayout3.getLineTop(0)) - (staticLayout3.getLineBottom(lineCount2) - staticLayout3.getLineTop(lineCount2)));
                    f2Var.r = max;
                    i12 += max;
                }
                i13 = i14;
            } else {
                i12 = 0;
            }
        } else {
            i12 = 1;
        }
        setMeasuredDimension(org.telegram.messenger.i0.L(32.0f) + i13, i12);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        f2 f2Var = this.c;
        return h4.j(this.a, this.b, motionEvent, f2Var, f2Var.c, 0, 0) || super.onTouchEvent(motionEvent);
    }
}
