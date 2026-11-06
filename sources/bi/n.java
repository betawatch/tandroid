package bi;

import android.text.TextUtils;
import android.view.View;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final /* synthetic */ class n implements View.OnFocusChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ n(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z9) {
        switch (this.a) {
            case 0:
                u uVar = ((z) this.b).V;
                float f10 = z9 ? 1.0f : 0.0f;
                uVar.b(f10, f10, true);
                break;
            case 1:
                ((a1) this.b).V1.c(z9, !TextUtils.isEmpty(r2.W1.getText()));
                break;
            case 2:
                ((e1) this.b).m1.c(z9, !TextUtils.isEmpty(r2.n1.getText()));
                break;
            case 3:
                ((h1) this.b).i1.c(z9, !TextUtils.isEmpty(r2.j1.getText()));
                break;
            case 4:
                ch.l lVar = (ch.l) this.b;
                if (!z9) {
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
            case 5:
                li.a6.a((li.a6) this.b, z9);
                break;
            case 6:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) ((org.telegram.ui.t4) this.b).f;
                if (!z9 && TextUtils.isEmpty(editTextBoldCursor.getText())) {
                    editTextBoldCursor.setText("0");
                    break;
                }
                break;
            default:
                EditTextBoldCursor editTextBoldCursor2 = ((sg.p) this.b).d;
                if (!z9 && TextUtils.isEmpty(editTextBoldCursor2.getText())) {
                    editTextBoldCursor2.setText("0");
                    break;
                }
                break;
        }
    }
}
