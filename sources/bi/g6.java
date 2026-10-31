package bi;

import android.text.TextUtils;
import android.view.View;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.yd;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes4.dex */
public final /* synthetic */ class g6 implements View.OnFocusChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ g6(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z10) {
        switch (this.a) {
            case 0:
                q6.a((q6) this.b, z10);
                break;
            case 1:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) ((ig.s) this.b).f;
                if (!z10 && TextUtils.isEmpty(editTextBoldCursor.getText())) {
                    editTextBoldCursor.setText("0");
                    break;
                }
                break;
            case 2:
                EditTextBoldCursor editTextBoldCursor2 = ((ig.t) this.b).d;
                if (!z10 && TextUtils.isEmpty(editTextBoldCursor2.getText())) {
                    editTextBoldCursor2.setText("0");
                    break;
                }
                break;
            case 3:
                yd ydVar = ((rh.i) this.b).V;
                float f7 = z10 ? 1.0f : 0.0f;
                ydVar.b(f7, f7, true);
                break;
            case 4:
                ((rh.b0) this.b).V1.c(z10, !TextUtils.isEmpty(r2.W1.getText()));
                break;
            case 5:
                ((rh.e0) this.b).m1.c(z10, !TextUtils.isEmpty(r2.n1.getText()));
                break;
            case 6:
                ((rh.i0) this.b).i1.c(z10, !TextUtils.isEmpty(r2.j1.getText()));
                break;
            default:
                sg.l lVar = (sg.l) this.b;
                if (!z10) {
                    lVar.I();
                    break;
                } else {
                    lVar.J(true);
                    Runnable runnable = lVar.a2;
                    if (runnable != null) {
                        runnable.run();
                        break;
                    }
                }
                break;
        }
    }
}
