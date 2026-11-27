// default package

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes3.dex */
public final class ab extends Drawable {
    public final /* synthetic */ byte a;
    public final pkb b;
    public final /* synthetic */ cb c;

    public ab(cb cbVar, String str, byte b) {
        this.a = b;
        switch (b) {
            case 1:
                this.c = cbVar;
                this.b = new pkb(str, 14.0f, hl.o());
                break;
            default:
                this.c = cbVar;
                this.b = new pkb(str, 14.0f, hl.o());
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        byte b = this.a;
        cb cbVar = this.c;
        pkb pkbVar = this.b;
        switch (b) {
            case 0:
                this.b.c(getBounds().centerX() - (pkbVar.c / 2.0f), getBounds().centerY(), 1.0f, cbVar.s, canvas);
                break;
            default:
                this.b.c(getBounds().centerX() - (pkbVar.c / 2.0f), getBounds().centerY(), 1.0f, cbVar.s, canvas);
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        byte b = this.a;
        return -2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        byte b = this.a;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        byte b = this.a;
    }

    private final void a(int i) {
    }

    private final void b(int i) {
    }

    private final void c(ColorFilter colorFilter) {
    }

    private final void d(ColorFilter colorFilter) {
    }
}
