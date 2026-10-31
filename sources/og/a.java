package og;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.cd;
import org.telegram.messenger.zs;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import w7.b6;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class a extends FrameLayout {
    public final vh.d a;
    public final View b;
    public final p6 c;
    public final Paint d;
    public boolean e;

    public a(Context context, p6 p6Var) {
        super(context);
        this.d = new Paint(1);
        this.c = p6Var;
        View view = new View(context);
        this.b = view;
        addView(view, b6.o(-1, -1));
        vh.d dVar = new vh.d(context, p6Var, true);
        this.a = dVar;
        addView(dVar, b6.d(-1, 48.0f, 17, 14.0f, 0.0f, 14.0f, 0.0f));
    }

    public final void a(int i10, boolean z10) {
        this.e = true;
        vh.d dVar = this.a;
        dVar.k();
        dVar.setShowZero(true);
        dVar.setEnabled(true);
        dVar.c(i10, z10);
        dVar.i(cd.L0(2131753193, null), z10, true);
        a7.i(t6.h5, this.b, this.c);
    }

    public final void b(boolean z10) {
        this.a.setLoading(z10);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.e) {
            int w02 = t6.w0(t6.a7, this.c);
            Paint paint = this.d;
            paint.setColor(w02);
            paint.setAlpha(zs.e4);
            canvas.drawRect(0.0f, 0.0f, getWidth(), 1.0f, paint);
        }
    }

    public void setCloseStyle(boolean z10) {
        this.e = false;
        vh.d dVar = this.a;
        dVar.setShowZero(false);
        dVar.setEnabled(true);
        dVar.i(cd.a0("Close", null, 2131752041, new Object[0]), false, true);
        this.e = z10;
    }

    public void setOkStyle(boolean z10) {
        this.e = false;
        vh.d dVar = this.a;
        dVar.setShowZero(false);
        dVar.setEnabled(true);
        dVar.i(z10 ? cd.a0("BoostingUseLink", null, 2131753174, new Object[0]) : cd.a0("OK", null, 2131747847, new Object[0]), false, true);
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.a.setOnClickListener(onClickListener);
    }
}
