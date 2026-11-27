// default package

import android.view.TextureView;
import android.view.ViewGroup;
import android.view.ViewParent;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class o00 {
    public Object a;
    public Object b;
    public Object c;
    public boolean d;
    public int e;
    public int f;
    public boolean g;

    public final void a(TextureView textureView) {
        TextureView textureView2 = (TextureView) this.a;
        if (textureView2 != textureView) {
            if (textureView2 != null) {
                ViewParent parent = textureView2.getParent();
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView((TextureView) this.a);
                }
                this.a = null;
            }
            this.d = false;
            this.a = textureView;
            zj3 zj3Var = (zj3) this.b;
            if (zj3Var != null) {
                zj3Var.a(textureView);
            }
        }
    }
}
