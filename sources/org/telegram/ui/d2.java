package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.text.StaticLayout;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import java.util.HashSet;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class d2 extends View {
    public final /* synthetic */ o50 a;
    public final /* synthetic */ e4 b;
    public final /* synthetic */ e2 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d2(e2 e2Var, Context context, o50 o50Var, e4 e4Var) {
        super(context);
        this.c = e2Var;
        this.a = o50Var;
        this.b = e4Var;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        e2 e2Var = this.c;
        if (e2Var.c != null) {
            canvas.save();
            g4.t(this.a, canvas, e2Var, 0);
            e2Var.c.d(canvas, this);
            canvas.restore();
            e2Var.c.s = (int) getX();
            e2Var.c.w = (int) getY();
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i10) {
        int i11;
        StaticLayout staticLayout;
        StaticLayout staticLayout2;
        e2 e2Var = this.c;
        TL_iv.pageBlockPreformatted pageblockpreformatted = e2Var.f;
        int i12 = 1;
        if (pageblockpreformatted != null) {
            CharSequence charSequence = e2Var.h;
            e4 e4Var = this.b;
            o50 o50Var = this.a;
            if (charSequence == null) {
                TL_iv.RichText richText = pageblockpreformatted.text;
                int L = org.telegram.messenger.g0.L(5000.0f);
                HashSet hashSet = g4.c1;
                CharSequence A = g4.A(o50Var, e4Var.E, this, richText, richText, pageblockpreformatted, L);
                e2Var.h = A;
                TL_iv.pageBlockPreformatted pageblockpreformatted2 = e2Var.f;
                if (pageblockpreformatted2.diff) {
                    e2Var.h = e2.b(e2Var, A, pageblockpreformatted2.language);
                } else if (!TextUtils.isEmpty(pageblockpreformatted2.language)) {
                    e2Var.h = ni.m.b(e2Var.h, e2Var.f.language);
                }
            }
            z2 o4 = g4.o(o50Var, this, e2Var.h, null, org.telegram.messenger.g0.L(5000.0f), 0, e2Var.f, e4Var);
            e2Var.c = o4;
            if (o4 != null) {
                i11 = o4.d.getHeight();
                int lineCount = e2Var.c.d.getLineCount();
                int i13 = 1;
                for (int i14 = 0; i14 < lineCount; i14++) {
                    i13 = Math.max((int) Math.ceil(e2Var.c.d.getLineWidth(i14)), i13);
                }
                if (e2Var.f.diff && (staticLayout2 = e2Var.c.d) != null) {
                    i13 = Math.max((int) Math.ceil(staticLayout2.getPaint().measureText("m") * e2Var.f.diffColumns), i13);
                }
                e2Var.r = 0;
                if (e2Var.f.continuesNext && (staticLayout = e2Var.c.d) != null && staticLayout.getLineCount() > 1) {
                    StaticLayout staticLayout3 = e2Var.c.d;
                    int lineCount2 = staticLayout3.getLineCount() - 1;
                    int max = Math.max(0, (staticLayout3.getLineBottom(0) - staticLayout3.getLineTop(0)) - (staticLayout3.getLineBottom(lineCount2) - staticLayout3.getLineTop(lineCount2)));
                    e2Var.r = max;
                    i11 += max;
                }
                i12 = i13;
            } else {
                i11 = 0;
            }
        } else {
            i11 = 1;
        }
        setMeasuredDimension(org.telegram.messenger.g0.L(32.0f) + i12, i11);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        e2 e2Var = this.c;
        return g4.j(this.a, this.b, motionEvent, e2Var, e2Var.c, 0, 0) || super.onTouchEvent(motionEvent);
    }
}
