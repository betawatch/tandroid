package ii;

import android.text.TextUtils;
import android.view.View;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.ae;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes4.dex */
public final /* synthetic */ class x5 implements View.OnFocusChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ x5(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z10) {
        switch (this.a) {
            case 0:
                f6.a((f6) this.b, z10);
                break;
            case 1:
                EditTextBoldCursor editTextBoldCursor = ((pg.v) this.b).c;
                if (!z10 && TextUtils.isEmpty(editTextBoldCursor.getText())) {
                    editTextBoldCursor.setText("0");
                    break;
                }
                break;
            case 2:
                EditTextBoldCursor editTextBoldCursor2 = ((pg.w) this.b).d;
                if (!z10 && TextUtils.isEmpty(editTextBoldCursor2.getText())) {
                    editTextBoldCursor2.setText("0");
                    break;
                }
                break;
            case 3:
                ae aeVar = ((yh.h) this.b).V;
                float f7 = z10 ? 1.0f : 0.0f;
                aeVar.b(f7, f7, true);
                break;
            case 4:
                ((yh.b0) this.b).c0.c(z10, !TextUtils.isEmpty(r2.d0.getText()));
                break;
            case 5:
                ((yh.f0) this.b).f.c(z10, !TextUtils.isEmpty(r2.h.getText()));
                break;
            case 6:
                ((yh.j0) this.b).b.c(z10, !TextUtils.isEmpty(r2.c.getText()));
                break;
            default:
                zg.l lVar = (zg.l) this.b;
                if (!z10) {
                    lVar.m();
                    break;
                } else {
                    lVar.n(true);
                    Runnable runnable = lVar.e;
                    if (runnable != null) {
                        runnable.run();
                        break;
                    }
                }
                break;
        }
    }
}
