// default package

import android.view.View;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_aicompose;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class a0 implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ e0 b;

    public /* synthetic */ a0(e0 e0Var, byte b) {
        this.a = b;
        this.b = e0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        byte b = this.a;
        e0 e0Var = this.b;
        switch (b) {
            case 0:
                e0Var.dismiss();
                break;
            default:
                TL_aicompose.AiComposeTone aiComposeTone = e0Var.S1;
                if (aiComposeTone instanceof TL_aicompose.TL_aiComposeTone) {
                    int i = e0Var.c2 + 1;
                    e0Var.c2 = i;
                    TL_aicompose.aiComposeToneExample[] aicomposetoneexampleArr = e0Var.d2;
                    byte b2 = 0;
                    if (i >= aicomposetoneexampleArr.length) {
                        e0Var.c2 = 0;
                        i = 0;
                    }
                    if (aicomposetoneexampleArr[i] == null) {
                        TL_aicompose.getToneExample gettoneexample = new TL_aicompose.getToneExample();
                        gettoneexample.tone = TL_aicompose.InputAiComposeTone.from(aiComposeTone);
                        gettoneexample.num = i;
                        ConnectionsManager.getInstance(e0Var.a).sendRequestTyped(gettoneexample, new hc(b2), new c0(e0Var, i, b2));
                    }
                    e0Var.b2.O(true);
                    break;
                }
                break;
        }
    }
}
