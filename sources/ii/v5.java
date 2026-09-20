package ii;

import android.text.TextUtils;
import android.view.View;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.zd;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes4.dex */
public final /* synthetic */ class v5 implements View.OnFocusChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ v5(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z10) {
        switch (this.a) {
            case 0:
                d6.a((d6) this.b, z10);
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
                zd zdVar = ((yh.g) this.b).M;
                float f7 = z10 ? 1.0f : 0.0f;
                zdVar.b(f7, f7, true);
                break;
            case 4:
                ((yh.a0) this.b).c0.c(z10, !TextUtils.isEmpty(r2.d0.getText()));
                break;
            case 5:
                ((yh.e0) this.b).f.c(z10, !TextUtils.isEmpty(r2.h.getText()));
                break;
            case 6:
                ((yh.i0) this.b).b.c(z10, !TextUtils.isEmpty(r2.c.getText()));
                break;
            default:
                zg.o oVar = (zg.o) this.b;
                if (!z10) {
                    oVar.m();
                    break;
                } else {
                    oVar.n(true);
                    Runnable runnable = oVar.e;
                    if (runnable != null) {
                        runnable.run();
                        break;
                    }
                }
                break;
        }
    }
}
