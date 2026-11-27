// default package

import android.view.View;
import java.util.Iterator;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class jb2 implements em {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ jb2(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // em
    public final void invalidate() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((wb2) obj).r2();
                break;
            case 1:
                Iterator it = ((y85) obj).i.iterator();
                while (it.hasNext()) {
                    ((View) it.next()).invalidate();
                }
                break;
            default:
                w0a w0aVar = (w0a) obj;
                if (!ri5.b && w0aVar.getParent() != null) {
                    ((View) w0aVar.getParent()).invalidate();
                    break;
                }
                break;
        }
    }
}
