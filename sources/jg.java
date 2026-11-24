// default package

import android.content.DialogInterface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.DatePicker;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class jg implements DialogInterface.OnShowListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ View b;

    public /* synthetic */ jg(View view, byte b) {
        this.a = b;
        this.b = view;
    }

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        byte b = this.a;
        View view = this.b;
        switch (b) {
            case 0:
                mi miVar = (mi) view;
                miVar.requestFocus();
                gl.E3(miVar);
                break;
            case 1:
                py pyVar = (py) view;
                pyVar.requestFocus();
                gl.E3(pyVar);
                break;
            case 2:
                c41 c41Var = (c41) view;
                c41Var.requestFocus();
                gl.E3(c41Var);
                break;
            case 3:
                p32 p32Var = (p32) view;
                p32Var.requestFocus();
                gl.E3(p32Var);
                break;
            case 4:
                DatePicker datePicker = (DatePicker) view;
                int childCount = datePicker.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = datePicker.getChildAt(i);
                    ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                    layoutParams.width = -1;
                    childAt.setLayoutParams(layoutParams);
                }
                break;
            case 5:
                dq8 dq8Var = (dq8) view;
                dq8Var.requestFocus();
                gl.E3(dq8Var);
                break;
            default:
                p32 p32Var2 = (p32) view;
                p32Var2.requestFocus();
                gl.E3(p32Var2);
                break;
        }
    }
}
