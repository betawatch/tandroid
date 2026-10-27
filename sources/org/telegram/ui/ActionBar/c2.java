package org.telegram.ui.ActionBar;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class c2 implements u6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ c2(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // org.telegram.ui.ActionBar.u6
    public final boolean a() {
        switch (this.a) {
        }
        return y6.I.q();
    }

    @Override // org.telegram.ui.ActionBar.u6
    public final void b(float f7, float f10, int i10, int i11) {
        switch (this.a) {
            case 0:
                y6.q(f7, f10, i10, i11);
                break;
            default:
                y6.q(f7, f10, i10, i11);
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.u6
    public final ColorFilter c() {
        switch (this.a) {
        }
        return y6.v3;
    }

    @Override // org.telegram.ui.ActionBar.u6
    public final Paint d(String str) {
        switch (this.a) {
        }
        return y6.U0(str);
    }

    @Override // org.telegram.ui.ActionBar.u6
    public final int e(int i10) {
        switch (this.a) {
        }
        return g(i10);
    }

    @Override // org.telegram.ui.ActionBar.u6
    public final /* synthetic */ boolean f() {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.u6
    public final int g(int i10) {
        switch (this.a) {
            case 0:
                return ((e2) this.b).f(i10);
            default:
                return ((r2) this.b).getThemedColor(i10);
        }
    }

    @Override // org.telegram.ui.ActionBar.u6
    public final /* synthetic */ Drawable getDrawable(String str) {
        switch (this.a) {
        }
        return null;
    }

    @Override // org.telegram.ui.ActionBar.u6
    public final /* synthetic */ void h(int i10, int i11) {
        int i12 = this.a;
    }

    @Override // org.telegram.ui.ActionBar.u6
    public final int i(int i10) {
        switch (this.a) {
        }
        return g(i10);
    }

    private final /* synthetic */ void j(int i10, int i11) {
    }

    private final /* synthetic */ void k(int i10, int i11) {
    }
}
