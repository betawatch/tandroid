package org.telegram.ui.Components;

import android.widget.TextView;
import org.telegram.tgnet.TLObject;
/* loaded from: classes3.dex */
public final /* synthetic */ class StickersAlert$$ExternalSyntheticLambda23 implements Runnable {
    public final /* synthetic */ StickersAlert f$0;
    public final /* synthetic */ TLObject f$1;
    public final /* synthetic */ EditTextBoldCursor f$2;
    public final /* synthetic */ TextView f$3;
    public final /* synthetic */ TextView f$4;
    public final /* synthetic */ int[] f$5;

    public /* synthetic */ StickersAlert$$ExternalSyntheticLambda23(StickersAlert stickersAlert, TLObject tLObject, EditTextBoldCursor editTextBoldCursor, TextView textView, TextView textView2, int[] iArr) {
        this.f$0 = stickersAlert;
        this.f$1 = tLObject;
        this.f$2 = editTextBoldCursor;
        this.f$3 = textView;
        this.f$4 = textView2;
        this.f$5 = iArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f$0.lambda$showNameEnterAlert$27(this.f$1, this.f$2, this.f$3, this.f$4, this.f$5);
    }
}
