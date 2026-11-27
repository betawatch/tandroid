// default package

import android.view.View;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_aicompose;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class b0 implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ f0 b;

    public /* synthetic */ b0(f0 f0Var, byte b) {
        this.a = b;
        this.b = f0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        byte b = this.a;
        f0 f0Var = this.b;
        switch (b) {
            case 0:
                f0Var.dismiss();
                break;
            default:
                TL_aicompose.AiComposeTone aiComposeTone = f0Var.S1;
                if (aiComposeTone instanceof TL_aicompose.TL_aiComposeTone) {
                    int i = f0Var.c2 + 1;
                    f0Var.c2 = i;
                    TL_aicompose.aiComposeToneExample[] aicomposetoneexampleArr = f0Var.d2;
                    byte b2 = 0;
                    if (i >= aicomposetoneexampleArr.length) {
                        f0Var.c2 = 0;
                        i = 0;
                    }
                    if (aicomposetoneexampleArr[i] == null) {
                        TL_aicompose.getToneExample gettoneexample = new TL_aicompose.getToneExample();
                        gettoneexample.tone = TL_aicompose.InputAiComposeTone.from(aiComposeTone);
                        gettoneexample.num = i;
                        ConnectionsManager.getInstance(f0Var.a).sendRequestTyped(gettoneexample, new ic((byte) 0), new d0(f0Var, i, b2));
                    }
                    f0Var.b2.O(true);
                    break;
                }
                break;
        }
    }
}
