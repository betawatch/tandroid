// default package

import android.content.DialogInterface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.DatePicker;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class ig implements DialogInterface.OnShowListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ View b;

    public /* synthetic */ ig(View view, byte b) {
        this.a = b;
        this.b = view;
    }

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        byte b = this.a;
        View view = this.b;
        switch (b) {
            case 0:
                ni niVar = (ni) view;
                niVar.requestFocus();
                hl.E3(niVar);
                break;
            case 1:
                qy qyVar = (qy) view;
                qyVar.requestFocus();
                hl.E3(qyVar);
                break;
            case 2:
                k41 k41Var = (k41) view;
                k41Var.requestFocus();
                hl.E3(k41Var);
                break;
            case 3:
                f42 f42Var = (f42) view;
                f42Var.requestFocus();
                hl.E3(f42Var);
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
                pt8 pt8Var = (pt8) view;
                pt8Var.requestFocus();
                hl.E3(pt8Var);
                break;
            default:
                f42 f42Var2 = (f42) view;
                f42Var2.requestFocus();
                hl.E3(f42Var2);
                break;
        }
    }
}
