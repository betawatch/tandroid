// default package

import android.view.View;
import java.util.Iterator;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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
