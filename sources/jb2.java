// default package

import android.view.View;
import java.util.Iterator;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
