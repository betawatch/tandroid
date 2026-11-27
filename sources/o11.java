// default package

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import java.util.WeakHashMap;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class o11 extends Dialog {
    public final n11 a;
    public final WindowManager.LayoutParams b;

    public o11(Context context, py pyVar) {
        super(context);
        hl.S(getWindow());
        n11 n11Var = new n11(this, context);
        this.a = n11Var;
        setContentView(n11Var, new ViewGroup.LayoutParams(-1, -1));
        tg0 tg0Var = new tg0(this, (byte) 17);
        WeakHashMap weakHashMap = ihc.a;
        ahc.i(n11Var, tg0Var);
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            n11Var.setSystemUiVisibility(1792);
        } else {
            n11Var.setSystemUiVisibility(1280);
        }
        n11Var.setTag(R.id.bulletin_delegate_tag, new t10(pyVar, (byte) 2));
        try {
            Window window = getWindow();
            window.setWindowAnimations(R.style.DialogNoAnimation);
            window.setBackgroundDrawable(null);
            WindowManager.LayoutParams attributes = window.getAttributes();
            this.b = attributes;
            attributes.width = -1;
            attributes.height = -1;
            attributes.gravity = 51;
            attributes.dimAmount = 0.0f;
            attributes.format = -3;
            attributes.flags = ((attributes.flags & (-3)) | (-1946091240)) & (-1025);
            if (i >= 28) {
                attributes.layoutInDisplayCutoutMode = 1;
            }
            window.setAttributes(attributes);
            hl.i3(this, hl.B(aob.w0(null, aob.a7, false)) > 0.721f);
        } catch (Exception unused) {
        }
    }

    public static n11 a(Context context) {
        return new o11(context, null).a;
    }

    @Override // android.app.Dialog
    public final void show() {
        if (hl.K1(getContext())) {
            super.show();
        }
    }
}
