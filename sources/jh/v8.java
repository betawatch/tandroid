package jh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.db;
import org.telegram.ui.Components.ec;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final class v8 implements db {
    public final float[] a = new float[2];
    public final /* synthetic */ w8 b;

    public v8(w8 w8Var) {
        this.b = w8Var;
    }

    @Override // org.telegram.ui.Components.db
    public final /* synthetic */ boolean a() {
        return true;
    }

    @Override // org.telegram.ui.Components.db
    public final /* synthetic */ boolean e() {
        return true;
    }

    @Override // org.telegram.ui.Components.db
    public final int f(int i10) {
        i9 i9Var = this.b.E0;
        e4 t10 = i9Var.t();
        if (t10 == null) {
            return 0;
        }
        j3 j3Var = t10.Y0;
        w8 w8Var = i9Var.s;
        float[] fArr = this.a;
        AndroidUtilities.getViewPositionInParent(j3Var, w8Var, fArr);
        return (int) (r4.getMeasuredHeight() - (fArr[1] + j3Var.getMeasuredHeight()));
    }

    @Override // org.telegram.ui.Components.db
    public final /* synthetic */ boolean g(int i10) {
        return false;
    }

    @Override // org.telegram.ui.Components.db
    public final /* synthetic */ int h(int i10) {
        return 0;
    }

    @Override // org.telegram.ui.Components.db
    public final /* synthetic */ void b(ec ecVar) {
    }

    @Override // org.telegram.ui.Components.db
    public final /* synthetic */ void c(float f10) {
    }

    @Override // org.telegram.ui.Components.db
    public final /* synthetic */ void d(ec ecVar) {
    }
}
