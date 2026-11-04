package ci;

import android.text.TextUtils;
import android.view.View;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class m implements View.OnFocusChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ m(Object obj, int i3) {
        this.a = i3;
        this.b = obj;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z10) {
        switch (this.a) {
            case 0:
                r rVar = ((v) this.b).W;
                float f10 = z10 ? 1.0f : 0.0f;
                rVar.b(f10, f10, true);
                break;
            case 1:
                ((t0) this.b).W1.c(z10, !TextUtils.isEmpty(r2.X1.getText()));
                break;
            case 2:
                ((x0) this.b).n1.c(z10, !TextUtils.isEmpty(r2.o1.getText()));
                break;
            case 3:
                ((a1) this.b).j1.c(z10, !TextUtils.isEmpty(r2.k1.getText()));
                break;
            case 4:
                dh.l lVar = (dh.l) this.b;
                if (!z10) {
                    lVar.I();
                    break;
                } else {
                    lVar.J(true);
                    Runnable runnable = lVar.b2;
                    if (runnable != null) {
                        runnable.run();
                        break;
                    }
                }
                break;
            case 5:
                mi.b6.a((mi.b6) this.b, z10);
                break;
            case 6:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) ((org.telegram.ui.v4) this.b).f;
                if (!z10 && TextUtils.isEmpty(editTextBoldCursor.getText())) {
                    editTextBoldCursor.setText("0");
                    break;
                }
                break;
            default:
                EditTextBoldCursor editTextBoldCursor2 = ((tg.p) this.b).d;
                if (!z10 && TextUtils.isEmpty(editTextBoldCursor2.getText())) {
                    editTextBoldCursor2.setText("0");
                    break;
                }
                break;
        }
    }
}
