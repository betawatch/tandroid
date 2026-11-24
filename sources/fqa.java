// default package

import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class fqa extends cqa {
    public final boolean c;
    public final ImageReceiver d;

    public fqa(View view, TL_stars.starGiftAttributeModel stargiftattributemodel) {
        this.a = stargiftattributemodel.name;
        this.b = stargiftattributemodel.getRarityPermille();
        this.c = true;
        ImageReceiver imageReceiver = new ImageReceiver(view);
        this.d = imageReceiver;
        jva.d1(imageReceiver, stargiftattributemodel.document, kk7.p2);
    }

    @Override // cqa
    public final void a() {
        if (this.c) {
            this.d.K();
        }
    }

    @Override // cqa
    public final boolean b() {
        return this.d.y() != null;
    }

    public fqa(be0 be0Var, TL_stars.starGiftAttributeModel stargiftattributemodel) {
        this.a = stargiftattributemodel.name;
        this.b = stargiftattributemodel.getRarityPermille();
        this.c = false;
        this.d = be0Var.getImageReceiver();
    }
}
