// default package

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.widget.ImageView;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class fd6 implements TextWatcher {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ View c;

    public fd6(gd6 gd6Var, boolean z) {
        this.a = (byte) 0;
        this.c = gd6Var;
        this.b = z;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        int j;
        byte b = this.a;
        View view = this.c;
        switch (b) {
            case 0:
                gd6 gd6Var = (gd6) view;
                ImageView imageView = gd6Var.f;
                if (this.b) {
                    if (imageView.getVisibility() != 0 && !TextUtils.isEmpty(editable)) {
                        if (gd6Var.E) {
                            imageView.callOnClick();
                        }
                        gl.T3(imageView, true, 0.1f, true, true);
                        break;
                    } else if (imageView.getVisibility() != 8 && TextUtils.isEmpty(editable)) {
                        gl.T3(imageView, false, 0.1f, true, true);
                        break;
                    }
                }
                break;
            case 1:
                dq8 dq8Var = (dq8) view;
                if (!this.b && editable.length() > 12) {
                    this.b = true;
                    editable.delete(12, editable.length());
                    gl.z3(dq8Var);
                    try {
                        dq8Var.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    this.b = false;
                    break;
                }
                break;
            default:
                vhb vhbVar = (vhb) view;
                uhb uhbVar = vhbVar.s0;
                if (this.b && vhbVar.y0 > 0 && vhbVar.z0 > 0 && !vhbVar.B0 && uhbVar.getLayout() != null) {
                    int height = uhbVar.getLayout().getHeight();
                    float f = gl.q.y / 3.0f;
                    float f2 = height;
                    if (f2 > f && (j = Utilities.j((int) ((f / f2) * vhbVar.getBaseFontSize()), vhbVar.z0, vhbVar.y0)) != vhbVar.getBaseFontSize()) {
                        vhbVar.setBaseFontSize(j);
                        Runnable runnable = vhbVar.A0;
                        if (runnable != null) {
                            runnable.run();
                        }
                    }
                }
                vhbVar.t();
                break;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        switch (this.a) {
            case 0:
            case 1:
                break;
            default:
                this.b = i3 > 3;
                break;
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        byte b = this.a;
    }

    public /* synthetic */ fd6(View view, byte b) {
        this.a = b;
        this.c = view;
    }

    private final void a(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void b(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void c(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void d(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void e(int i, int i2, int i3, CharSequence charSequence) {
    }
}
