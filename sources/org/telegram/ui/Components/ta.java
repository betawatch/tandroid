package org.telegram.ui.Components;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import java.util.WeakHashMap;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class ta extends Dialog {
    public final sa a;
    public final WindowManager.LayoutParams b;

    public ta(Context context, bi.t tVar) {
        super(context);
        org.telegram.messenger.g0.S(getWindow());
        sa saVar = new sa(this, context);
        this.a = saVar;
        setContentView(saVar, new ViewGroup.LayoutParams(-1, -1));
        s sVar = new s(this, 15);
        WeakHashMap weakHashMap = r0.i0.a;
        r0.a0.i(saVar, sVar);
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 30) {
            saVar.setSystemUiVisibility(1792);
        } else {
            saVar.setSystemUiVisibility(1280);
        }
        saVar.setTag(R.id.bulletin_delegate_tag, new bi.e1(tVar, 7));
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
            if (i7 >= 28) {
                attributes.layoutInDisplayCutoutMode = 1;
            }
            window.setAttributes(attributes);
            if (org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.a7, false)) <= 0.721f) {
                z10 = false;
            }
            org.telegram.messenger.g0.n3(this, z10);
        } catch (Exception unused) {
        }
    }

    public static sa a(Context context) {
        return new ta(context, null).a;
    }

    @Override // android.app.Dialog
    public final void show() {
        if (org.telegram.messenger.g0.M1(getContext())) {
            super.show();
        }
    }
}
