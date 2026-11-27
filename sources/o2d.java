// default package

import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public class o2d extends c3f {
    public final WindowInsetsController a;
    public final Window b;

    public o2d(Window window, ve9 ve9Var) {
        this.a = window.getInsetsController();
        this.b = window;
    }

    @Override // c3f
    public final void a() {
        this.a.hide(519);
    }

    @Override // c3f
    public final void b() {
        g(16);
        this.a.setSystemBarsAppearance(0, 16);
    }

    @Override // c3f
    public final void c(boolean z) {
        if (z) {
            f(TLObject.FLAG_13);
            this.a.setSystemBarsAppearance(8, 8);
        } else {
            g(TLObject.FLAG_13);
            this.a.setSystemBarsAppearance(0, 8);
        }
    }

    @Override // c3f
    public void d() {
        this.b.getDecorView().setTag(356039078, 2);
        g(2048);
        f(TLObject.FLAG_12);
    }

    @Override // c3f
    public final void e() {
        this.a.show(519);
    }

    public final void f(int i) {
        View decorView = this.b.getDecorView();
        decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | i);
    }

    public final void g(int i) {
        View decorView = this.b.getDecorView();
        decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() & (~i));
    }
}
