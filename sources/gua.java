// default package

import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class gua extends dua {
    public final boolean c;
    public final ImageReceiver d;

    public gua(View view, TL_stars.starGiftAttributeModel stargiftattributemodel) {
        this.a = stargiftattributemodel.name;
        this.b = stargiftattributemodel.getRarityPermille();
        this.c = true;
        ImageReceiver imageReceiver = new ImageReceiver(view);
        this.d = imageReceiver;
        nza.e1(imageReceiver, stargiftattributemodel.document, jn7.p2);
    }

    @Override // dua
    public final void a() {
        if (this.c) {
            this.d.K();
        }
    }

    @Override // dua
    public final boolean b() {
        return this.d.y() != null;
    }

    public gua(de0 de0Var, TL_stars.starGiftAttributeModel stargiftattributemodel) {
        this.a = stargiftattributemodel.name;
        this.b = stargiftattributemodel.getRarityPermille();
        this.c = false;
        this.d = de0Var.getImageReceiver();
    }
}
