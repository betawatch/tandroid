// default package

import android.content.Context;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class nc6 extends eja {
    public final /* synthetic */ uc6 x2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nc6(uc6 uc6Var, Context context, wia wiaVar, uc6 uc6Var2, mc6 mc6Var, vnb vnbVar) {
        super(context, 0L, wiaVar, 0, null, null, null, 8, 0, uc6Var2, mc6Var, 0, vnbVar, null);
        this.x2 = uc6Var;
    }

    @Override // eja
    public final boolean H() {
        return true;
    }

    @Override // eja
    public final int I0() {
        return 32;
    }

    @Override // eja
    public final int Z0() {
        return 3;
    }

    @Override // eja
    public final TL_stories.MediaArea getStoriesArea() {
        return this.x2.T0;
    }
}
