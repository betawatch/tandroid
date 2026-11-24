// default package

import android.view.View;
import java.util.Iterator;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class ec2 implements dn {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ec2(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // dn
    public final void invalidate() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((rc2) obj).r2();
                break;
            case 1:
                Iterator it = ((u85) obj).i.iterator();
                while (it.hasNext()) {
                    ((View) it.next()).invalidate();
                }
                break;
            default:
                fz9 fz9Var = (fz9) obj;
                if (!oi5.b && fz9Var.getParent() != null) {
                    ((View) fz9Var.getParent()).invalidate();
                    break;
                }
                break;
        }
    }
}
