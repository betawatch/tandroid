// default package

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.webkit.PermissionRequest;
import java.util.Arrays;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class cw0 implements gu2 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ cw0(Object obj, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // gu2
    public final void accept(Object obj) {
        byte b = this.a;
        byte b2 = 1;
        Object obj2 = this.d;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (b) {
            case 0:
                jw0 jw0Var = (jw0) obj4;
                PermissionRequest permissionRequest = (PermissionRequest) obj3;
                String[] strArr = (String[]) obj2;
                Boolean bool = (Boolean) obj;
                if (jw0Var.a != null) {
                    jw0Var.a = null;
                    if (!bool.booleanValue()) {
                        permissionRequest.deny();
                        break;
                    } else {
                        cw0 cw0Var = new cw0(jw0Var, permissionRequest, strArr, b2);
                        boolean z = qw0.R0;
                        jw0Var.e.R.R(new String[]{"android.permission.CAMERA", "android.permission.RECORD_AUDIO"}, cw0Var);
                        break;
                    }
                }
                break;
            case 1:
                jw0 jw0Var2 = (jw0) obj4;
                PermissionRequest permissionRequest2 = (PermissionRequest) obj3;
                String[] strArr2 = (String[]) obj2;
                if (!((Boolean) obj).booleanValue()) {
                    permissionRequest2.deny();
                    break;
                } else {
                    permissionRequest2.grant(new String[]{strArr2[0], strArr2[1]});
                    jw0Var2.e.R.U = true;
                    break;
                }
            default:
                Path path = (Path) obj3;
                float[] fArr = (float[]) obj2;
                Canvas canvas = (Canvas) obj;
                ub8 ub8Var = ((gk8) obj4).e;
                View pressedChildView = ub8Var.getPressedChildView();
                int b3 = pressedChildView == null ? -1 : ub8Var.T(pressedChildView).b();
                path.rewind();
                Rect selectorRect = ub8Var.getSelectorRect();
                RectF rectF = gm.P;
                rectF.set(selectorRect.left, selectorRect.top, selectorRect.right, selectorRect.bottom);
                Arrays.fill(fArr, 0.0f);
                if (b3 == 0) {
                    Arrays.fill(fArr, 0, 4, gm.L(12.0f));
                }
                if (b3 == ub8Var.getAdapter().b() - 1) {
                    Arrays.fill(fArr, 4, 8, gm.L(12.0f));
                }
                path.addRoundRect(rectF, fArr, Path.Direction.CW);
                canvas.clipPath(path);
                break;
        }
    }
}
