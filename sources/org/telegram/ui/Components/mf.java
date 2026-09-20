package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class mf extends org.telegram.ui.dj0 {
    public final /* synthetic */ int A0;
    public final /* synthetic */ Object B0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mf(Object obj, Context context, org.telegram.ui.ActionBar.f6 f6Var, int i10) {
        super(context, f6Var);
        this.A0 = i10;
        this.B0 = obj;
    }

    @Override // org.telegram.ui.dj0
    public final void m(long j3) {
        switch (this.A0) {
            case 0:
                ((ChatActivityEnterView) this.B0).setEffectId(j3);
                break;
            default:
                vi viVar = (vi) this.B0;
                fi fiVar = viVar.I0;
                viVar.N0 = j3;
                fiVar.setEffect(j3);
                break;
        }
    }
}
