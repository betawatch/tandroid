package gh;

import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class t4 extends q4 {
    public final boolean c;
    public final ImageReceiver d;

    public t4(View view, TL_stars.starGiftAttributeModel stargiftattributemodel) {
        this.a = stargiftattributemodel.name;
        this.b = stargiftattributemodel.getRarityPermille();
        this.c = true;
        ImageReceiver imageReceiver = new ImageReceiver(view);
        this.d = imageReceiver;
        oa.Z0(imageReceiver, stargiftattributemodel.document, 160);
    }

    @Override // gh.q4
    public final void a() {
        if (this.c) {
            this.d.onDetachedFromWindow();
        }
    }

    @Override // gh.q4
    public final boolean b() {
        return this.d.getLottieAnimation() != null;
    }

    public t4(org.telegram.ui.Components.o9 o9Var, TL_stars.starGiftAttributeModel stargiftattributemodel) {
        this.a = stargiftattributemodel.name;
        this.b = stargiftattributemodel.getRarityPermille();
        this.c = false;
        this.d = o9Var.getImageReceiver();
    }
}
