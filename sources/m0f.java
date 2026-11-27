// default package

import android.os.Build;
import android.text.TextUtils;
import android.view.View;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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
