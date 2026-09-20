package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class fe0 extends ds {
    public final /* synthetic */ int h;
    public final /* synthetic */ Object n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fe0(Object obj, Context context, int i10) {
        super(context);
        this.h = i10;
        this.n = obj;
    }

    @Override // org.telegram.ui.ds
    public final void a() {
        switch (this.h) {
            case 0:
                ((ie0) this.n).h(null);
                break;
            case 1:
                ((cf0) this.n).h(null);
                break;
            case 2:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.n;
                if (passcodeActivity.E != 0) {
                    passcodeActivity.g0();
                    break;
                } else {
                    postDelayed(new sl0(this, 0), 260L);
                    break;
                }
            default:
                ((ih1) this.n).C0();
                break;
        }
    }
}
