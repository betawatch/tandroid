// default package

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import java.util.WeakHashMap;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class f11 extends Dialog {
    public final e11 a;
    public final WindowManager.LayoutParams b;

    public f11(Context context, oy oyVar) {
        super(context);
        gl.S(getWindow());
        e11 e11Var = new e11(this, context);
        this.a = e11Var;
        setContentView(e11Var, new ViewGroup.LayoutParams(-1, -1));
        sg0 sg0Var = new sg0(this, (byte) 16);
        WeakHashMap weakHashMap = jdc.a;
        bdc.i(e11Var, sg0Var);
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            e11Var.setSystemUiVisibility(1792);
        } else {
            e11Var.setSystemUiVisibility(1280);
        }
        e11Var.setTag(R.id.bulletin_delegate_tag, new s10(oyVar, (byte) 2));
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
            gl.j3(this, gl.B(bkb.w0(null, bkb.Z6, false)) > 0.721f);
        } catch (Exception unused) {
        }
    }

    public static e11 a(Context context) {
        return new f11(context, null).a;
    }

    @Override // android.app.Dialog
    public final void show() {
        if (gl.K1(getContext())) {
            super.show();
        }
    }
}
