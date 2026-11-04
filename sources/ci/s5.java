package ci;

import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.hs;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class s5 extends p5 {
    public final boolean c;
    public final ImageReceiver d;

    public s5(View view, TL_stars.starGiftAttributeModel stargiftattributemodel) {
        this.a = stargiftattributemodel.name;
        this.b = stargiftattributemodel.getRarityPermille();
        this.c = true;
        ImageReceiver imageReceiver = new ImageReceiver(view);
        this.d = imageReceiver;
        wb.c1(imageReceiver, stargiftattributemodel.document, hs.q2);
    }

    @Override // ci.p5
    public final void a() {
        if (this.c) {
            this.d.R();
        }
    }

    @Override // ci.p5
    public final boolean b() {
        return this.d.B() != null;
    }

    public s5(org.telegram.ui.Components.k9 k9Var, TL_stars.starGiftAttributeModel stargiftattributemodel) {
        this.a = stargiftattributemodel.name;
        this.b = stargiftattributemodel.getRarityPermille();
        this.c = false;
        this.d = k9Var.getImageReceiver();
    }
}
