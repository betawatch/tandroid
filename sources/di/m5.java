package di;

import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.ks;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
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
            this.d.R();
        }
    }

    @Override // di.j5
    public final boolean b() {
        return this.d.B() != null;
    }

    public m5(org.telegram.ui.Components.q9 q9Var, TL_stars.starGiftAttributeModel stargiftattributemodel) {
        this.a = stargiftattributemodel.name;
        this.b = stargiftattributemodel.getRarityPermille();
        this.c = false;
        this.d = q9Var.getImageReceiver();
    }
}
