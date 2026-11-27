// default package

import android.graphics.drawable.Drawable;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class c29 extends ImageReceiver {
    public final /* synthetic */ e29 K1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c29(e29 e29Var) {
        super(null);
        this.K1 = e29Var;
    }

    @Override // org.telegram.messenger.ImageReceiver
    public final boolean h0(Drawable drawable, String str, int i, boolean z, int i2) {
        if (drawable != null) {
            this.K1.c();
        }
        return super.h0(drawable, str, i, z, i2);
    }
}
