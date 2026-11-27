// default package

import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
