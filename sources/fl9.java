// default package

import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final /* synthetic */ class fl9 implements Runnable {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ gl9 b;
    public final /* synthetic */ hl9 c;
    public final /* synthetic */ View d;

    public /* synthetic */ fl9(gl9 gl9Var, hl9 hl9Var, View view) {
        this.b = gl9Var;
        this.c = hl9Var;
        this.d = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        View view = this.d;
        hl9 hl9Var = this.c;
        gl9 gl9Var = this.b;
        switch (b) {
            case 0:
                gl9Var.getClass();
                if (view != null) {
                    view.post(new fl9(gl9Var, hl9Var, view));
                    break;
                }
                break;
            default:
                if (hl9Var != null) {
                    gl9Var.getClass();
                    r47 r47Var = hl9Var.b;
                    if (r47Var != null) {
                        r47Var.N0 = true;
                    }
                    ArrayList arrayList = hl9Var.n;
                    int size = arrayList.size();
                    int i = 0;
                    while (i < size) {
                        Object obj = arrayList.get(i);
                        i++;
                        kmb kmbVar = (kmb) obj;
                        if (kmbVar instanceof gl9) {
                            ((gl9) kmbVar).x.clear();
                        }
                    }
                } else {
                    gl9Var.x.clear();
                }
                view.invalidate();
                break;
        }
    }

    public /* synthetic */ fl9(gl9 gl9Var, View view, hl9 hl9Var) {
        this.b = gl9Var;
        this.d = view;
        this.c = hl9Var;
    }
}
