package ig;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import android.widget.FrameLayout;
import k7.b6;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class a extends FrameLayout {
    public final ph.d a;
    public final View b;
    public final f6 c;
    public final Paint d;
    public boolean e;

    public a(Context context, f6 f6Var) {
        super(context);
        this.d = new Paint(1);
        this.c = f6Var;
        View view = new View(context);
        this.b = view;
        addView(view, b6.n(-1, -1));
        ph.d dVar = new ph.d(context, f6Var, true);
        this.a = dVar;
        addView(dVar, b6.d(-1, 48.0f, 17, 14.0f, 0.0f, 14.0f, 0.0f));
    }

    public final void a(int i10, boolean z4) {
        this.e = true;
        ph.d dVar = this.a;
        dVar.k();
        dVar.setShowZero(true);
        dVar.setEnabled(true);
        dVar.c(i10, z4);
        dVar.g(LocaleController.getString(R.string.BoostingStartGiveaway), z4, true);
        this.b.setBackgroundColor(j6.v0(j6.h5, this.c));
    }

    public final void b(boolean z4) {
        this.a.setLoading(z4);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.e) {
            int v02 = j6.v0(j6.a7, this.c);
            Paint paint = this.d;
            paint.setColor(v02);
            paint.setAlpha(255);
            canvas.drawRect(0.0f, 0.0f, getWidth(), 1.0f, paint);
        }
    }

    public void setCloseStyle(boolean z4) {
        this.e = false;
        ph.d dVar = this.a;
        dVar.setShowZero(false);
        dVar.setEnabled(true);
        dVar.g(LocaleController.formatString("Close", R.string.Close, new Object[0]), false, true);
        this.e = z4;
    }

    public void setOkStyle(boolean z4) {
        this.e = false;
        ph.d dVar = this.a;
        dVar.setShowZero(false);
        dVar.setEnabled(true);
        dVar.g(z4 ? LocaleController.formatString("BoostingUseLink", R.string.BoostingUseLink, new Object[0]) : LocaleController.formatString("OK", R.string.OK, new Object[0]), false, true);
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.a.setOnClickListener(onClickListener);
    }
}
