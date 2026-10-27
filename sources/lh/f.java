package lh;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.y6;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class f extends View implements p6 {
    public ch.c a;
    public ch.c b;
    public int c;
    public int d;
    public hh.c e;
    public int f;

    public f(Context context) {
        super(context);
    }

    public final void a() {
        this.a.setBounds(0, 0, getMeasuredWidth(), this.c);
        this.b.setBounds(0, getMeasuredHeight() - this.d, getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // org.telegram.ui.ActionBar.p6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(this.f));
    }

    public final void b(ch.b bVar, fh.e eVar) {
        eh.d c10 = bVar.c(this, null, false);
        c10.v(eVar);
        ch.c cVar = new ch.c(c10);
        this.a = cVar;
        cVar.b(-AndroidUtilities.dp(30.0f), true);
        eh.d c11 = bVar.c(this, null, false);
        c11.v(eVar);
        ch.c cVar2 = new ch.c(c11);
        this.b = cVar2;
        cVar2.b(AndroidUtilities.dp(30.0f), true);
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
        ch.c cVar = this.a;
        if (cVar.G != i10) {
            cVar.G = i10;
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
        this.a.F = z10;
        this.b.F = z10;
    }

    public void setup(ch.b bVar) {
        b(bVar, null);
    }

    public void setupColorKey(int i10) {
        this.f = i10;
        if (this.e == null) {
            hh.c cVar = new hh.c();
            this.e = cVar;
            cVar.a(y6.x0(null, i10, false));
            setup(new ch.b(this.e));
        }
    }

    @Override // org.telegram.ui.ActionBar.p6
    public final void updateColors() {
        int i10;
        hh.c cVar = this.e;
        if (cVar == null || (i10 = this.f) == -1) {
            return;
        }
        cVar.a(y6.x0(null, i10, false));
        invalidate();
    }
}
