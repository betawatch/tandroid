package org.telegram.ui.ActionBar;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.az;
import org.telegram.ui.Components.f41;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class q1 implements e6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ q1(Object obj, int i3) {
        this.a = i3;
        this.b = obj;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // org.telegram.ui.ActionBar.e6
    public final boolean a() {
        switch (this.a) {
        }
        return k6.I.q();
    }

    @Override // org.telegram.ui.ActionBar.e6
    public final void b(float f10, float f11, int i3, int i10) {
        switch (this.a) {
            case 0:
                k6.r(f10, f11, i3, i10);
                break;
            case 1:
                k6.r(f10, f11, i3, i10);
                break;
            default:
                k6.r(f10, f11, i3, i10);
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.e6
    public final ColorFilter c() {
        switch (this.a) {
        }
        return k6.v3;
    }

    @Override // org.telegram.ui.ActionBar.e6
    public final Paint d(String str) {
        switch (this.a) {
        }
        return k6.V0(str);
    }

    @Override // org.telegram.ui.ActionBar.e6
    public final boolean e() {
        switch (this.a) {
        }
        return az.H0;
    }

    @Override // org.telegram.ui.ActionBar.e6
    public final int f(int i3) {
        switch (this.a) {
        }
        return h(i3);
    }

    @Override // org.telegram.ui.ActionBar.e6
    public final /* synthetic */ boolean g() {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.e6
    public final /* synthetic */ Drawable getDrawable(String str) {
        switch (this.a) {
        }
        return null;
    }

    @Override // org.telegram.ui.ActionBar.e6
    public final int h(int i3) {
        switch (this.a) {
            case 0:
                return ((s1) this.b).f(i3);
            case 1:
                return ((d2) this.b).getThemedColor(i3);
            default:
                return ((f41) this.b).I(i3);
        }
    }

    @Override // org.telegram.ui.ActionBar.e6
    public final /* synthetic */ void i(int i3, int i10) {
        int i11 = this.a;
    }

    @Override // org.telegram.ui.ActionBar.e6
    public final int j(int i3) {
        switch (this.a) {
        }
        return h(i3);
    }

    private final /* synthetic */ void k(int i3, int i10) {
    }

    private final /* synthetic */ void l(int i3, int i10) {
    }

    private final /* synthetic */ void m(int i3, int i10) {
    }
}
