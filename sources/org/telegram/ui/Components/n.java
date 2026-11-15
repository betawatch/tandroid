package org.telegram.ui.Components;

import android.view.View;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_aicompose;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class n implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ q b;

    public /* synthetic */ n(q qVar, int i7) {
        this.a = i7;
        this.b = qVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                this.b.dismiss();
                break;
            default:
                q qVar = this.b;
                TL_aicompose.AiComposeTone aiComposeTone = qVar.T1;
                if (aiComposeTone instanceof TL_aicompose.TL_aiComposeTone) {
                    int i7 = qVar.d2 + 1;
                    qVar.d2 = i7;
                    TL_aicompose.aiComposeToneExample[] aicomposetoneexampleArr = qVar.e2;
                    if (i7 >= aicomposetoneexampleArr.length) {
                        qVar.d2 = 0;
                    }
                    int i10 = qVar.d2;
                    if (aicomposetoneexampleArr[i10] == null) {
                        TL_aicompose.getToneExample gettoneexample = new TL_aicompose.getToneExample();
                        gettoneexample.tone = TL_aicompose.InputAiComposeTone.from(aiComposeTone);
                        gettoneexample.num = i10;
                        ConnectionsManager.getInstance(qVar.a).sendRequestTyped(gettoneexample, new d3.b(1), new o(qVar, i10, 0));
                    }
                    qVar.c2.O(true);
                    break;
                }
                break;
        }
    }
}
