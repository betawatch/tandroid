package di;

import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.ks;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class m5 extends j5 {
    public final boolean c;
    public final ImageReceiver d;

    public m5(View view, TL_stars.starGiftAttributeModel stargiftattributemodel) {
        this.a = stargiftattributemodel.name;
        this.b = stargiftattributemodel.getRarityPermille();
        this.c = true;
        ImageReceiver imageReceiver = new ImageReceiver(view);
        this.d = imageReceiver;
        pb.d1(imageReceiver, stargiftattributemodel.document, ks.q2);
    }

    @Override // di.j5
    public final void a() {
        if (this.c) {
            this.d.S();
        }
    }

    @Override // di.j5
    public final boolean b() {
        return this.d.C() != null;
    }

    public m5(org.telegram.ui.Components.p9 p9Var, TL_stars.starGiftAttributeModel stargiftattributemodel) {
        this.a = stargiftattributemodel.name;
        this.b = stargiftattributemodel.getRarityPermille();
        this.c = false;
        this.d = p9Var.getImageReceiver();
    }
}
