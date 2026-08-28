package gh;

import android.text.TextUtils;
import android.view.View;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class j implements View.OnFocusChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ j(Object obj, int i9) {
        this.a = i9;
        this.b = obj;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z10) {
        switch (this.a) {
            case 0:
                n nVar = ((r) this.b).I;
                float f10 = z10 ? 1.0f : 0.0f;
                nVar.b(f10, f10, true);
                break;
            case 1:
                ((o0) this.b).Y.c(z10, !TextUtils.isEmpty(r2.Z.getText()));
                break;
            case 2:
                ((t0) this.b).f.c(z10, !TextUtils.isEmpty(r2.h.getText()));
                break;
            case 3:
                ((x0) this.b).b.c(z10, !TextUtils.isEmpty(r2.c.getText()));
                break;
            case 4:
                hg.p pVar = (hg.p) this.b;
                if (!z10) {
                    pVar.m();
                    break;
                } else {
                    pVar.n(true);
                    Runnable runnable = pVar.e;
                    if (runnable != null) {
                        runnable.run();
                        break;
                    }
                }
                break;
            case 5:
                qh.s5.a((qh.s5) this.b, z10);
                break;
            case 6:
                EditTextBoldCursor editTextBoldCursor = ((xf.v) this.b).c;
                if (!z10 && TextUtils.isEmpty(editTextBoldCursor.getText())) {
                    editTextBoldCursor.setText("0");
                    break;
                }
                break;
            default:
                EditTextBoldCursor editTextBoldCursor2 = ((xf.w) this.b).d;
                if (!z10 && TextUtils.isEmpty(editTextBoldCursor2.getText())) {
                    editTextBoldCursor2.setText("0");
                    break;
                }
                break;
        }
    }
}
