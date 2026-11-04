package org.telegram.ui.Components;

import android.view.View;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_aicompose;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class o implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ r b;

    public /* synthetic */ o(r rVar, int i3) {
        this.a = i3;
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
                TL_aicompose.AiComposeTone aiComposeTone = rVar.Q1;
                if (aiComposeTone instanceof TL_aicompose.TL_aiComposeTone) {
                    int i3 = rVar.a2 + 1;
                    rVar.a2 = i3;
                    TL_aicompose.aiComposeToneExample[] aicomposetoneexampleArr = rVar.b2;
                    if (i3 >= aicomposetoneexampleArr.length) {
                        rVar.a2 = 0;
                    }
                    int i10 = rVar.a2;
                    if (aicomposetoneexampleArr[i10] == null) {
                        TL_aicompose.getToneExample gettoneexample = new TL_aicompose.getToneExample();
                        gettoneexample.tone = TL_aicompose.InputAiComposeTone.from(aiComposeTone);
                        gettoneexample.num = i10;
                        ConnectionsManager.getInstance(rVar.a).sendRequestTyped(gettoneexample, new c3.b(1), new p(rVar, i10, 0));
                    }
                    rVar.Z1.O(true);
                    break;
                }
                break;
        }
    }
}
