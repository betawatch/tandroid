package org.telegram.ui.Components;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import java.util.WeakHashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class cb extends Dialog {
    public final bb a;
    public final WindowManager.LayoutParams b;

    public cb(Context context, bg.z zVar) {
        super(context);
        AndroidUtilities.enableEdgeToEdge(getWindow());
        bb bbVar = new bb(this, context);
        this.a = bbVar;
        setContentView(bbVar, new ViewGroup.LayoutParams(-1, -1));
        s sVar = new s(this, 15);
        WeakHashMap weakHashMap = r0.j0.a;
        r0.b0.j(bbVar, sVar);
        int i9 = Build.VERSION.SDK_INT;
        if (i9 >= 30) {
            bbVar.setSystemUiVisibility(1792);
        } else {
            bbVar.setSystemUiVisibility(1280);
        }
        gc.a(bbVar, new fh.y0(zVar, 8));
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
            boolean z10 = true;
            if (i9 >= 28) {
                attributes.layoutInDisplayCutoutMode = 1;
            }
            window.setAttributes(attributes);
            if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.a7, false)) <= 0.721f) {
                z10 = false;
            }
            AndroidUtilities.setLightNavigationBar(this, z10);
        } catch (Exception unused) {
        }
    }

    public static bb a(Context context) {
        return new cb(context, null).a;
    }

    @Override // android.app.Dialog
    public final void show() {
        if (AndroidUtilities.isSafeToShow(getContext())) {
            super.show();
        }
    }
}
