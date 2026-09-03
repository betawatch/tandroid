package jg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import android.widget.FrameLayout;
import k7.c6;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class a extends FrameLayout {
    public final qh.d a;
    public final View b;
    public final g6 c;
    public final Paint d;
    public boolean e;

    public a(Context context, g6 g6Var) {
        super(context);
        this.d = new Paint(1);
        this.c = g6Var;
        View view = new View(context);
        this.b = view;
        addView(view, c6.n(-1, -1));
        qh.d dVar = new qh.d(context, g6Var, true);
        this.a = dVar;
        addView(dVar, c6.d(-1, 48.0f, 17, 14.0f, 0.0f, 14.0f, 0.0f));
    }

    public final void a(int i10, boolean z4) {
        this.e = true;
        qh.d dVar = this.a;
        dVar.k();
        dVar.setShowZero(true);
        dVar.setEnabled(true);
        dVar.c(i10, z4);
        dVar.g(LocaleController.getString(R.string.BoostingStartGiveaway), z4, true);
        this.b.setBackgroundColor(k6.v0(k6.h5, this.c));
    }

    public final void b(boolean z4) {
        this.a.setLoading(z4);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.e) {
            int v02 = k6.v0(k6.a7, this.c);
            Paint paint = this.d;
            paint.setColor(v02);
            paint.setAlpha(255);
            canvas.drawRect(0.0f, 0.0f, getWidth(), 1.0f, paint);
        }
    }

    public void setCloseStyle(boolean z4) {
        this.e = false;
        qh.d dVar = this.a;
        dVar.setShowZero(false);
        dVar.setEnabled(true);
        dVar.g(LocaleController.formatString("Close", R.string.Close, new Object[0]), false, true);
        this.e = z4;
    }

    public void setOkStyle(boolean z4) {
        this.e = false;
        qh.d dVar = this.a;
        dVar.setShowZero(false);
        dVar.setEnabled(true);
        dVar.g(z4 ? LocaleController.formatString("BoostingUseLink", R.string.BoostingUseLink, new Object[0]) : LocaleController.formatString("OK", R.string.OK, new Object[0]), false, true);
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.a.setOnClickListener(onClickListener);
    }
}
