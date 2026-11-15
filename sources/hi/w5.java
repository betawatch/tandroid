package hi;

import android.view.TextureView;
import android.view.ViewGroup;
import android.view.ViewParent;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class w5 {
    public TextureView a;
    public g7 b;
    public org.telegram.ui.web.b c;
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
        g7 g7Var = this.b;
        if (g7Var != null) {
            g7Var.a(textureView);
        }
    }
}
