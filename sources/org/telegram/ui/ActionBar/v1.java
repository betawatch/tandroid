package org.telegram.ui.ActionBar;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.tz;
import org.telegram.ui.Components.p51;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class v1 implements p6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ v1(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // org.telegram.ui.ActionBar.p6
    public final boolean a() {
        switch (this.a) {
        }
        return t6.I.q();
    }

    @Override // org.telegram.ui.ActionBar.p6
    public final void b(float f7, float f10, int i10, int i11) {
        switch (this.a) {
            case 0:
                t6.r(f7, f10, i10, i11);
                break;
            case 1:
                t6.r(f7, f10, i10, i11);
                break;
            default:
                t6.r(f7, f10, i10, i11);
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.p6
    public final ColorFilter c() {
        switch (this.a) {
        }
        return t6.v3;
    }

    @Override // org.telegram.ui.ActionBar.p6
    public final Paint d(String str) {
        switch (this.a) {
        }
        return t6.V0(str);
    }

    @Override // org.telegram.ui.ActionBar.p6
    public final boolean e() {
        switch (this.a) {
        }
        return tz.H0;
    }

    @Override // org.telegram.ui.ActionBar.p6
    public final int f(int i10) {
        switch (this.a) {
        }
        return h(i10);
    }

    @Override // org.telegram.ui.ActionBar.p6
    public final /* synthetic */ boolean g() {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.p6
    public final /* synthetic */ Drawable getDrawable(String str) {
        switch (this.a) {
        }
        return null;
    }

    @Override // org.telegram.ui.ActionBar.p6
    public final int h(int i10) {
        switch (this.a) {
            case 0:
                return ((x1) this.b).f(i10);
            case 1:
                return ((k2) this.b).getThemedColor(i10);
            default:
                return ((p51) this.b).I(i10);
        }
    }

    @Override // org.telegram.ui.ActionBar.p6
    public final /* synthetic */ void i(int i10, int i11) {
        int i12 = this.a;
    }

    @Override // org.telegram.ui.ActionBar.p6
    public final int j(int i10) {
        switch (this.a) {
        }
        return h(i10);
    }

    private final /* synthetic */ void k(int i10, int i11) {
    }

    private final /* synthetic */ void l(int i10, int i11) {
    }

    private final /* synthetic */ void m(int i10, int i11) {
    }
}
