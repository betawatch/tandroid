package org.telegram.ui.Components;

import android.view.View;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_aicompose;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final /* synthetic */ class t implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ w b;

    public /* synthetic */ t(w wVar, int i7) {
        this.a = i7;
        this.b = wVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                this.b.dismiss();
                break;
            default:
                w wVar = this.b;
                TL_aicompose.AiComposeTone aiComposeTone = wVar.T1;
                if (aiComposeTone instanceof TL_aicompose.TL_aiComposeTone) {
                    int i7 = wVar.d2 + 1;
                    wVar.d2 = i7;
                    TL_aicompose.aiComposeToneExample[] aicomposetoneexampleArr = wVar.e2;
                    if (i7 >= aicomposetoneexampleArr.length) {
                        wVar.d2 = 0;
                    }
                    int i10 = wVar.d2;
                    if (aicomposetoneexampleArr[i10] == null) {
                        TL_aicompose.getToneExample gettoneexample = new TL_aicompose.getToneExample();
                        gettoneexample.tone = TL_aicompose.InputAiComposeTone.from(aiComposeTone);
                        gettoneexample.num = i10;
                        ConnectionsManager.getInstance(wVar.a).sendRequestTyped(gettoneexample, new d3.b(1), new u(wVar, i10, 0));
                    }
                    wVar.c2.O(true);
                    break;
                }
                break;
        }
    }
}
