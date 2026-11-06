package bi;

import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.qs;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class q6 extends n6 {
    public final boolean c;
    public final ImageReceiver d;

    public q6(View view, TL_stars.starGiftAttributeModel stargiftattributemodel) {
        this.a = stargiftattributemodel.name;
        this.b = stargiftattributemodel.getRarityPermille();
        this.c = true;
        ImageReceiver imageReceiver = new ImageReceiver(view);
        this.d = imageReceiver;
        dd.c1(imageReceiver, stargiftattributemodel.document, qs.q2);
    }

    @Override // bi.n6
    public final void a() {
        if (this.c) {
            this.d.R();
        }
    }

    @Override // bi.n6
    public final boolean b() {
        return this.d.B() != null;
    }

    public q6(org.telegram.ui.Components.l9 l9Var, TL_stars.starGiftAttributeModel stargiftattributemodel) {
        this.a = stargiftattributemodel.name;
        this.b = stargiftattributemodel.getRarityPermille();
        this.c = false;
        this.d = l9Var.getImageReceiver();
    }
}
