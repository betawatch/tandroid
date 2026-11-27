// default package

import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class e49 extends ImageReceiver {
    public final /* synthetic */ byte K1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e49(View view, byte b) {
        super(view);
        this.K1 = b;
    }

    @Override // org.telegram.messenger.ImageReceiver
    public final boolean h0(Drawable drawable, String str, int i, boolean z, int i2) {
        switch (this.K1) {
            case 0:
                if (drawable instanceof b29) {
                    ((b29) drawable).I(0, false, true);
                }
                return super.h0(drawable, str, i, z, i2);
            default:
                boolean h0 = super.h0(drawable, str, i, z, i2);
                if (h0 && (drawable instanceof b29)) {
                    b29 b29Var = (b29) drawable;
                    b29Var.I(0, false, true);
                    b29Var.stop();
                }
                return h0;
        }
    }
}
