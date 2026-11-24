// default package

import android.view.ViewGroup;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class ad2 implements qf8 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ViewGroup b;

    public /* synthetic */ ad2(ViewGroup viewGroup, byte b) {
        this.a = b;
        this.b = viewGroup;
    }

    @Override // qf8
    public final void a(float f, float f2) {
        byte b = this.a;
        ViewGroup viewGroup = this.b;
        switch (b) {
            case 0:
                bd2 bd2Var = (bd2) viewGroup;
                FrameLayout frameLayout = bd2Var.c;
                if (frameLayout != null) {
                    frameLayout.setAlpha(1.0f - f2);
                }
                bd2Var.f = f2;
                bd2Var.b();
                break;
            default:
                ((zha) viewGroup).invalidate();
                break;
        }
    }
}
