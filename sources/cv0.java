// default package

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.webkit.PermissionRequest;
import java.util.Arrays;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class cv0 implements pt2 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ cv0(Object obj, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // pt2
    public final void accept(Object obj) {
        byte b = this.a;
        byte b2 = 1;
        Object obj2 = this.d;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (b) {
            case 0:
                kv0 kv0Var = (kv0) obj4;
                PermissionRequest permissionRequest = (PermissionRequest) obj3;
                String[] strArr = (String[]) obj2;
                Boolean bool = (Boolean) obj;
                if (kv0Var.a != null) {
                    kv0Var.a = null;
                    if (!bool.booleanValue()) {
                        permissionRequest.deny();
                        break;
                    } else {
                        cv0 cv0Var = new cv0(kv0Var, permissionRequest, strArr, b2);
                        boolean z = rv0.R0;
                        kv0Var.e.R.R(new String[]{"android.permission.CAMERA", "android.permission.RECORD_AUDIO"}, cv0Var);
                        break;
                    }
                }
                break;
            case 1:
                kv0 kv0Var2 = (kv0) obj4;
                PermissionRequest permissionRequest2 = (PermissionRequest) obj3;
                String[] strArr2 = (String[]) obj2;
                if (!((Boolean) obj).booleanValue()) {
                    permissionRequest2.deny();
                    break;
                } else {
                    permissionRequest2.grant(new String[]{strArr2[0], strArr2[1]});
                    kv0Var2.e.R.U = true;
                    break;
                }
            default:
                Path path = (Path) obj3;
                float[] fArr = (float[]) obj2;
                Canvas canvas = (Canvas) obj;
                jd8 jd8Var = ((rl8) obj4).e;
                View pressedChildView = jd8Var.getPressedChildView();
                int b3 = pressedChildView == null ? -1 : jd8Var.U(pressedChildView).b();
                path.rewind();
                Rect selectorRect = jd8Var.getSelectorRect();
                RectF rectF = hl.P;
                rectF.set(selectorRect.left, selectorRect.top, selectorRect.right, selectorRect.bottom);
                Arrays.fill(fArr, 0.0f);
                if (b3 == 0) {
                    Arrays.fill(fArr, 0, 4, hl.L(12.0f));
                }
                if (b3 == jd8Var.getAdapter().b() - 1) {
                    Arrays.fill(fArr, 4, 8, hl.L(12.0f));
                }
                path.addRoundRect(rectF, fArr, Path.Direction.CW);
                canvas.clipPath(path);
                break;
        }
    }
}
