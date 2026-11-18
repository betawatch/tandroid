package org.telegram.ui.Components;

import android.view.View;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_aicompose;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class s implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ v b;

    public /* synthetic */ s(v vVar, int i7) {
        this.a = i7;
        this.b = vVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                this.b.dismiss();
                break;
            default:
                v vVar = this.b;
                TL_aicompose.AiComposeTone aiComposeTone = vVar.T1;
                if (aiComposeTone instanceof TL_aicompose.TL_aiComposeTone) {
                    int i7 = vVar.d2 + 1;
                    vVar.d2 = i7;
                    TL_aicompose.aiComposeToneExample[] aicomposetoneexampleArr = vVar.e2;
                    if (i7 >= aicomposetoneexampleArr.length) {
                        vVar.d2 = 0;
                    }
                    int i10 = vVar.d2;
                    if (aicomposetoneexampleArr[i10] == null) {
                        TL_aicompose.getToneExample gettoneexample = new TL_aicompose.getToneExample();
                        gettoneexample.tone = TL_aicompose.InputAiComposeTone.from(aiComposeTone);
                        gettoneexample.num = i10;
                        ConnectionsManager.getInstance(vVar.a).sendRequestTyped(gettoneexample, new d3.b(1), new t(vVar, i10, 0));
                    }
                    vVar.c2.O(true);
                    break;
                }
                break;
        }
    }
}
