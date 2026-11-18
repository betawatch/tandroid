package fi;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.FrameLayout;
import java.util.ArrayList;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes4.dex */
public final class m7 extends FrameLayout {
    public z3 a;
    public long b;
    public ArrayList c;
    public boolean d;
    public final /* synthetic */ w e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m7(w wVar, Context context) {
        super(context);
        this.e = wVar;
    }

    public final void a(boolean z10) {
        if (this.d != z10) {
            this.d = z10;
            invalidate();
            this.a.setIsVisible(z10);
            this.e.A();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        if (this.d) {
            super.dispatchDraw(canvas);
        }
    }
}
