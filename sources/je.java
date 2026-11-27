// default package

import android.graphics.RectF;
import android.view.View;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class je implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ sg2[] b;

    public /* synthetic */ je(sg2[] sg2VarArr, byte b) {
        this.a = b;
        this.b = sg2VarArr;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        byte b = this.a;
        sg2[] sg2VarArr = this.b;
        switch (b) {
            case 0:
                sg2VarArr[((Integer) view.getTag()).intValue()].c(!sg2VarArr[r4.intValue()].b(), true);
                break;
            case 1:
                sg2VarArr[((Integer) view.getTag()).intValue()].c(!sg2VarArr[r4.intValue()].b(), true);
                break;
            case 2:
                sg2VarArr[((Integer) view.getTag()).intValue()].c(!sg2VarArr[r4.intValue()].b(), true);
                break;
            case 3:
                sg2VarArr[0].c(!r3.b(), true);
                break;
            default:
                RectF rectF = ProfileActivity.Z6;
                sg2VarArr[0].c(!r3.b(), true);
                break;
        }
    }
}
