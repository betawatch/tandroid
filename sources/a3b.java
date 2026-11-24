// default package

import android.content.Context;
import android.graphics.Canvas;
import android.widget.FrameLayout;
import java.util.ArrayList;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes3.dex */
public final class a3b extends FrameLayout {
    public y28 a;
    public long b;
    public ArrayList c;
    public boolean d;
    public final /* synthetic */ c8b e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a3b(c8b c8bVar, Context context) {
        super(context);
        this.e = c8bVar;
    }

    public final void a(boolean z) {
        if (this.d != z) {
            this.d = z;
            invalidate();
            this.a.setIsVisible(z);
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
