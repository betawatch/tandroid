// default package

import android.os.Build;
import android.text.TextUtils;
import android.view.View;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
