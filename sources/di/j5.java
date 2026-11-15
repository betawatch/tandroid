package di;

import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.ns;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class j5 extends g5 {
    public final boolean c;
    public final ImageReceiver d;

    public j5(View view, TL_stars.starGiftAttributeModel stargiftattributemodel) {
        this.a = stargiftattributemodel.name;
        this.b = stargiftattributemodel.getRarityPermille();
        this.c = true;
        ImageReceiver imageReceiver = new ImageReceiver(view);
        this.d = imageReceiver;
        lb.c1(imageReceiver, stargiftattributemodel.document, ns.q2);
    }

    @Override // di.g5
    public final void a() {
        if (this.c) {
            this.d.R();
        }
    }

    @Override // di.g5
    public final boolean b() {
        return this.d.B() != null;
    }

    public j5(org.telegram.ui.Components.i9 i9Var, TL_stars.starGiftAttributeModel stargiftattributemodel) {
        this.a = stargiftattributemodel.name;
        this.b = stargiftattributemodel.getRarityPermille();
        this.c = false;
        this.d = i9Var.getImageReceiver();
    }
}
