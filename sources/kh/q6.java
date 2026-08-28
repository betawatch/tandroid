package kh;

import android.view.TextureView;
import android.view.ViewGroup;
import android.view.ViewParent;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class q6 {
    public TextureView a;
    public i9 b;
    public yf.w0 c;
    public boolean d;
    public int e;
    public int f;
    public boolean g;

    public final void a(TextureView textureView) {
        TextureView textureView2 = this.a;
        if (textureView2 == textureView) {
            return;
        }
        if (textureView2 != null) {
            ViewParent parent = textureView2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.a);
            }
            this.a = null;
        }
        this.d = false;
        this.a = textureView;
        i9 i9Var = this.b;
        if (i9Var != null) {
            i9Var.run(textureView);
        }
    }
}
