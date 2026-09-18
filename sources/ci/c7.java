package ci;

import android.view.TextureView;
import android.view.ViewGroup;
import android.view.ViewParent;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes4.dex */
public final class c7 {
    public TextureView a;
    public org.telegram.ui.web.b1 b;
    public hi.a c;
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
        org.telegram.ui.web.b1 b1Var = this.b;
        if (b1Var != null) {
            b1Var.run(textureView);
        }
    }
}
