// default package

import android.view.TextureView;
import android.view.ViewGroup;
import android.view.ViewParent;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class n00 {
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
            hj3 hj3Var = (hj3) this.b;
            if (hj3Var != null) {
                hj3Var.a(textureView);
            }
        }
    }
}
