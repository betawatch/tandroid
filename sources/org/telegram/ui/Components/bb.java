package org.telegram.ui.Components;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import java.util.WeakHashMap;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class bb extends Dialog {
    public final ab a;
    public final WindowManager.LayoutParams b;

    public bb(Context context, bi.t tVar) {
        super(context);
        org.telegram.messenger.g0.S(getWindow());
        ab abVar = new ab(this, context);
        this.a = abVar;
        setContentView(abVar, new ViewGroup.LayoutParams(-1, -1));
        b0 b0Var = new b0(this, 14);
        WeakHashMap weakHashMap = r0.i0.a;
        r0.a0.i(abVar, b0Var);
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 30) {
            abVar.setSystemUiVisibility(1792);
        } else {
            abVar.setSystemUiVisibility(1280);
        }
        abVar.setTag(R.id.bulletin_delegate_tag, new bi.i1(tVar, 7));
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
            if (org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.a7, false)) <= 0.721f) {
                z10 = false;
            }
            org.telegram.messenger.g0.m3(this, z10);
        } catch (Exception unused) {
        }
    }

    public static ab a(Context context) {
        return new bb(context, null).a;
    }

    @Override // android.app.Dialog
    public final void show() {
        if (org.telegram.messenger.g0.M1(getContext())) {
            super.show();
        }
    }
}
