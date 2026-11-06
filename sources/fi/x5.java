package fi;

import android.view.TextureView;
import android.view.ViewGroup;
import android.view.ViewParent;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class x5 {
    public TextureView a;
    public ii.c b;
    public hi.u1 c;
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
        ii.c cVar = this.b;
        if (cVar != null) {
            cVar.a(textureView);
        }
    }
}
