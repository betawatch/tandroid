package jh;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.x5;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class f extends View implements x5 {
    public ah.d a;
    public ah.d b;
    public int c;
    public int d;
    public fh.c e;
    public int f;

    public f(Context context) {
        super(context);
    }

    public final void a() {
        this.a.setBounds(0, 0, getMeasuredWidth(), this.c);
        this.b.setBounds(0, getMeasuredHeight() - this.d, getMeasuredWidth(), getMeasuredHeight());
    }

    public final void b(ah.c cVar, dh.e eVar) {
        ch.d c10 = cVar.c(this, null, false);
        c10.o(eVar);
        ah.d dVar = new ah.d(c10);
        this.a = dVar;
        dVar.b(-AndroidUtilities.dp(30.0f), true);
        ch.d c11 = cVar.c(this, null, false);
        c11.o(eVar);
        ah.d dVar2 = new ah.d(c11);
        this.b = dVar2;
        dVar2.b(AndroidUtilities.dp(30.0f), true);
    }

    @Override // org.telegram.ui.ActionBar.x5
    public final void e() {
        int i10;
        fh.c cVar = this.e;
        if (cVar == null || (i10 = this.f) == -1) {
            return;
        }
        cVar.a(h6.w0(null, i10, false));
        invalidate();
    }

    public /* bridge */ /* synthetic */ int[] getColorKeys() {
        return null;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.a.draw(canvas);
        this.b.draw(canvas);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        a();
    }

    public void setFadeHeightBottom(int i10) {
        this.b.b(i10, true);
    }

    public void setFadeHeightTop(int i10) {
        this.a.b(-i10, true);
    }

    public void setFadeTopAlpha(int i10) {
        ah.d dVar = this.a;
        if (dVar.q != i10) {
            dVar.q = i10;
            invalidate();
        }
    }

    public void setFadeZoneBottom(int i10) {
        if (this.d != i10) {
            this.d = i10;
            a();
            invalidate();
        }
    }

    public void setFadeZoneTop(int i10) {
        if (this.c != i10) {
            this.c = i10;
            a();
            invalidate();
        }
    }

    public void setIgnoreFastWay(boolean z10) {
        this.a.p = z10;
        this.b.p = z10;
    }

    public void setup(ah.c cVar) {
        b(cVar, null);
    }

    public void setupColorKey(int i10) {
        this.f = i10;
        if (this.e == null) {
            fh.c cVar = new fh.c();
            this.e = cVar;
            cVar.a(h6.w0(null, i10, false));
            setup(new ah.c(this.e));
        }
    }
}
