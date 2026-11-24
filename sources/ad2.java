// default package

import android.view.ViewGroup;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
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
