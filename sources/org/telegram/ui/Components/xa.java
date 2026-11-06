package org.telegram.ui.Components;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import java.util.WeakHashMap;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class xa extends Dialog {
    public final wa a;
    public final WindowManager.LayoutParams b;

    public xa(Context context, fi.r7 r7Var) {
        super(context);
        org.telegram.messenger.g0.S(getWindow());
        wa waVar = new wa(this, context);
        this.a = waVar;
        setContentView(waVar, new ViewGroup.LayoutParams(-1, -1));
        u uVar = new u(this, 15);
        WeakHashMap weakHashMap = r0.i0.a;
        r0.a0.i(waVar, uVar);
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 30) {
            waVar.setSystemUiVisibility(1792);
        } else {
            waVar.setSystemUiVisibility(1280);
        }
        waVar.setTag(R.id.bulletin_delegate_tag, new ch.v(r7Var, 6));
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
            attributes.flags = (((-3) & attributes.flags) | (-1946091240)) & (-1025);
            boolean z9 = true;
            if (i7 >= 28) {
                attributes.layoutInDisplayCutoutMode = 1;
            }
            window.setAttributes(attributes);
            if (org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.a7, false)) <= 0.721f) {
                z9 = false;
            }
            org.telegram.messenger.g0.n3(this, z9);
        } catch (Exception unused) {
        }
    }

    public static wa a(Context context) {
        return new xa(context, null).a;
    }

    @Override // android.app.Dialog
    public final void show() {
        if (org.telegram.messenger.g0.M1(getContext())) {
            super.show();
        }
    }
}
