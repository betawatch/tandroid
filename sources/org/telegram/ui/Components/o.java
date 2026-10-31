package org.telegram.ui.Components;

import android.view.View;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_aicompose;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class o implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ r b;

    public /* synthetic */ o(r rVar, int i10) {
        this.a = i10;
        this.b = rVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                this.b.dismiss();
                break;
            default:
                r rVar = this.b;
                TL_aicompose.AiComposeTone aiComposeTone = rVar.P1;
                if (aiComposeTone instanceof TL_aicompose.TL_aiComposeTone) {
                    int i10 = rVar.Z1 + 1;
                    rVar.Z1 = i10;
                    TL_aicompose.aiComposeToneExample[] aicomposetoneexampleArr = rVar.a2;
                    if (i10 >= aicomposetoneexampleArr.length) {
                        rVar.Z1 = 0;
                    }
                    int i11 = rVar.Z1;
                    if (aicomposetoneexampleArr[i11] == null) {
                        TL_aicompose.getToneExample gettoneexample = new TL_aicompose.getToneExample();
                        gettoneexample.tone = TL_aicompose.InputAiComposeTone.from(aiComposeTone);
                        gettoneexample.num = i11;
                        ConnectionsManager.getInstance(rVar.a).sendRequestTyped(gettoneexample, new a3.b(1), new p(rVar, i11, 0));
                    }
                    rVar.Y1.O(true);
                    break;
                }
                break;
        }
    }
}
