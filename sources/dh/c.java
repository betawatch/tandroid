package dh;

import b2.z0;
import e2.m;
import org.telegram.ui.ActionBar.f6;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final /* synthetic */ class c implements d, m {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;

    public /* synthetic */ c(int i10, int i11, int i12) {
        this.a = i12;
        this.b = i10;
        this.c = i11;
    }

    @Override // dh.d
    public int f(f6 f6Var, boolean z10) {
        return z10 ? this.b : this.c;
    }

    @Override // e2.m
    public void invoke(Object obj) {
        switch (this.a) {
            case 1:
                ((z0) obj).onSurfaceSizeChanged(this.b, this.c);
                break;
            default:
                ((z0) obj).onSurfaceSizeChanged(this.b, this.c);
                break;
        }
    }
}
