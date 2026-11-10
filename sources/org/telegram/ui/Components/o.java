package org.telegram.ui.Components;

import android.view.View;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_aicompose;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class o implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ r b;

    public /* synthetic */ o(r rVar, int i7) {
        this.a = i7;
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
                TL_aicompose.AiComposeTone aiComposeTone = rVar.S1;
                if (aiComposeTone instanceof TL_aicompose.TL_aiComposeTone) {
                    int i7 = rVar.c2 + 1;
                    rVar.c2 = i7;
                    TL_aicompose.aiComposeToneExample[] aicomposetoneexampleArr = rVar.d2;
                    if (i7 >= aicomposetoneexampleArr.length) {
                        rVar.c2 = 0;
                    }
                    int i10 = rVar.c2;
                    if (aicomposetoneexampleArr[i10] == null) {
                        TL_aicompose.getToneExample gettoneexample = new TL_aicompose.getToneExample();
                        gettoneexample.tone = TL_aicompose.InputAiComposeTone.from(aiComposeTone);
                        gettoneexample.num = i10;
                        ConnectionsManager.getInstance(rVar.a).sendRequestTyped(gettoneexample, new d3.b(1), new p(rVar, i10, 0));
                    }
                    rVar.b2.O(true);
                    break;
                }
                break;
        }
    }
}
