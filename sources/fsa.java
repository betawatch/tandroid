// default package

import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class fsa extends csa {
    public final boolean c;
    public final ImageReceiver d;

    public fsa(View view, TL_stars.starGiftAttributeModel stargiftattributemodel) {
        this.a = stargiftattributemodel.name;
        this.b = stargiftattributemodel.getRarityPermille();
        this.c = true;
        ImageReceiver imageReceiver = new ImageReceiver(view);
        this.d = imageReceiver;
        nxa.e1(imageReceiver, stargiftattributemodel.document, nm7.p2);
    }

    @Override // csa
    public final void a() {
        if (this.c) {
            this.d.K();
        }
    }

    @Override // csa
    public final boolean b() {
        return this.d.y() != null;
    }

    public fsa(bf0 bf0Var, TL_stars.starGiftAttributeModel stargiftattributemodel) {
        this.a = stargiftattributemodel.name;
        this.b = stargiftattributemodel.getRarityPermille();
        this.c = false;
        this.d = bf0Var.getImageReceiver();
    }
}
