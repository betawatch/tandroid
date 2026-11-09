package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class fi0 extends ImageReceiver {
    public final /* synthetic */ int J1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fi0(int i7, View view) {
        super(view);
        this.J1 = i7;
    }

    @Override // org.telegram.messenger.ImageReceiver
    public final boolean x0(Drawable drawable, String str, int i7, boolean z9, int i10) {
        switch (this.J1) {
            case 0:
                if (drawable instanceof ah0) {
                    ((ah0) drawable).N(0, false, true);
                }
                return super.x0(drawable, str, i7, z9, i10);
            default:
                boolean x02 = super.x0(drawable, str, i7, z9, i10);
                if (x02 && (drawable instanceof ah0)) {
                    ah0 ah0Var = (ah0) drawable;
                    ah0Var.N(0, false, true);
                    ah0Var.stop();
                }
                return x02;
        }
    }
}
