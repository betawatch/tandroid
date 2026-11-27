// default package

import android.content.Context;
import java.util.HashSet;
import org.telegram.ui.d0;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class nob extends cz0 implements snb {
    public int e;
    public final /* synthetic */ d0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nob(d0 d0Var, Context context) {
        super(context);
        this.f = d0Var;
    }

    @Override // snb
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(aob.Mj));
    }

    @Override // snb
    public final void updateColors() {
        bz0 bz0Var = this.d;
        if (bz0Var != null) {
            try {
                int w0 = aob.w0(null, aob.Mj, false);
                if (w0 != this.e) {
                    this.e = w0;
                    bz0Var.setOuterColor(w0);
                    bz0Var.invalidate();
                }
            } catch (Exception e) {
                cc4.g(e, true);
            }
        }
    }
}
