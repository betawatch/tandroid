// default package

import android.os.Build;
import android.text.TextUtils;
import android.view.View;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public abstract class m0f {
    public static void a(View view, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            lxb.a(view, charSequence);
            return;
        }
        nxb nxbVar = nxb.w;
        if (nxbVar != null && nxbVar.a == view) {
            nxb.b(null);
        }
        if (!TextUtils.isEmpty(charSequence)) {
            new nxb(view, charSequence);
            return;
        }
        nxb nxbVar2 = nxb.x;
        if (nxbVar2 != null && nxbVar2.a == view) {
            nxbVar2.a();
        }
        view.setOnLongClickListener(null);
        view.setLongClickable(false);
        view.setOnHoverListener(null);
    }
}
