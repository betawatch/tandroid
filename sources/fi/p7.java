package fi;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.FrameLayout;
import java.util.ArrayList;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class p7 extends FrameLayout {
    public b4 a;
    public long b;
    public ArrayList c;
    public boolean d;
    public final /* synthetic */ w e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p7(w wVar, Context context) {
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
