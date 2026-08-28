package dg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import android.widget.FrameLayout;
import g7.e6;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.f6;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class a extends FrameLayout {
    public final kh.d a;
    public final View b;
    public final b6 c;
    public final Paint d;
    public boolean e;

    public a(Context context, b6 b6Var) {
        super(context);
        this.d = new Paint(1);
        this.c = b6Var;
        View view = new View(context);
        this.b = view;
        addView(view, e6.n(-1, -1));
        kh.d dVar = new kh.d(context, b6Var, true);
        this.a = dVar;
        addView(dVar, e6.d(-1, 48.0f, 17, 14.0f, 0.0f, 14.0f, 0.0f));
    }

    public final void a(int i9, boolean z10) {
        this.e = true;
        kh.d dVar = this.a;
        dVar.k();
        dVar.setShowZero(true);
        dVar.setEnabled(true);
        dVar.c(i9, z10);
        dVar.g(LocaleController.getString(R.string.BoostingStartGiveaway), z10, true);
        this.b.setBackgroundColor(f6.v0(f6.h5, this.c));
    }

    public final void b(boolean z10) {
        this.a.setLoading(z10);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.e) {
            int v02 = f6.v0(f6.a7, this.c);
            Paint paint = this.d;
            paint.setColor(v02);
            paint.setAlpha(255);
            canvas.drawRect(0.0f, 0.0f, getWidth(), 1.0f, paint);
        }
    }

    public void setCloseStyle(boolean z10) {
        this.e = false;
        kh.d dVar = this.a;
        dVar.setShowZero(false);
        dVar.setEnabled(true);
        dVar.g(LocaleController.formatString("Close", R.string.Close, new Object[0]), false, true);
        this.e = z10;
    }

    public void setOkStyle(boolean z10) {
        this.e = false;
        kh.d dVar = this.a;
        dVar.setShowZero(false);
        dVar.setEnabled(true);
        dVar.g(z10 ? LocaleController.formatString("BoostingUseLink", R.string.BoostingUseLink, new Object[0]) : LocaleController.formatString("OK", R.string.OK, new Object[0]), false, true);
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.a.setOnClickListener(onClickListener);
    }
}
