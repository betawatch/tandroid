package org.telegram.ui.Components;

import android.view.View;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_aicompose;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class p implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ s b;

    public /* synthetic */ p(s sVar, int i7) {
        this.a = i7;
        this.b = sVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                this.b.dismiss();
                break;
            default:
                s sVar = this.b;
                TL_aicompose.AiComposeTone aiComposeTone = sVar.P1;
                if (aiComposeTone instanceof TL_aicompose.TL_aiComposeTone) {
                    int i7 = sVar.Z1 + 1;
                    sVar.Z1 = i7;
                    TL_aicompose.aiComposeToneExample[] aicomposetoneexampleArr = sVar.a2;
                    if (i7 >= aicomposetoneexampleArr.length) {
                        sVar.Z1 = 0;
                    }
                    int i10 = sVar.Z1;
                    if (aicomposetoneexampleArr[i10] == null) {
                        TL_aicompose.getToneExample gettoneexample = new TL_aicompose.getToneExample();
                        gettoneexample.tone = TL_aicompose.InputAiComposeTone.from(aiComposeTone);
                        gettoneexample.num = i10;
                        ConnectionsManager.getInstance(sVar.a).sendRequestTyped(gettoneexample, new d3.b(1), new q(sVar, i10, 0));
                    }
                    sVar.Y1.O(true);
                    break;
                }
                break;
        }
    }
}
