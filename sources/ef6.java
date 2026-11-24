// default package

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.widget.ImageView;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class ef6 implements TextWatcher {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ View c;

    public ef6(ff6 ff6Var, boolean z) {
        this.a = (byte) 0;
        this.c = ff6Var;
        this.b = z;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        int j;
        byte b = this.a;
        View view = this.c;
        switch (b) {
            case 0:
                ff6 ff6Var = (ff6) view;
                ImageView imageView = ff6Var.f;
                if (this.b) {
                    if (imageView.getVisibility() != 0 && !TextUtils.isEmpty(editable)) {
                        if (ff6Var.E) {
                            imageView.callOnClick();
                        }
                        gm.T3(imageView, true, 0.1f, true, true);
                        break;
                    } else if (imageView.getVisibility() != 8 && TextUtils.isEmpty(editable)) {
                        gm.T3(imageView, false, 0.1f, true, true);
                        break;
                    }
                }
                break;
            case 1:
                fs8 fs8Var = (fs8) view;
                if (!this.b && editable.length() > 12) {
                    this.b = true;
                    editable.delete(12, editable.length());
                    gm.z3(fs8Var);
                    try {
                        fs8Var.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    this.b = false;
                    break;
                }
                break;
            default:
                xjb xjbVar = (xjb) view;
                wjb wjbVar = xjbVar.s0;
                if (this.b && xjbVar.y0 > 0 && xjbVar.z0 > 0 && !xjbVar.B0 && wjbVar.getLayout() != null) {
                    int height = wjbVar.getLayout().getHeight();
                    float f = gm.q.y / 3.0f;
                    float f2 = height;
                    if (f2 > f && (j = Utilities.j((int) ((f / f2) * xjbVar.getBaseFontSize()), xjbVar.z0, xjbVar.y0)) != xjbVar.getBaseFontSize()) {
                        xjbVar.setBaseFontSize(j);
                        Runnable runnable = xjbVar.A0;
                        if (runnable != null) {
                            runnable.run();
                        }
                    }
                }
                xjbVar.t();
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

    public /* synthetic */ ef6(View view, byte b) {
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
