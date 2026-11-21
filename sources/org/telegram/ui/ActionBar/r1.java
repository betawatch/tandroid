package org.telegram.ui.ActionBar;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.bz;
import org.telegram.ui.Components.c51;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class r1 implements h6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ r1(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // org.telegram.ui.ActionBar.h6
    public final boolean d() {
        switch (this.a) {
        }
        return m6.I.q();
    }

    @Override // org.telegram.ui.ActionBar.h6
    public final void e(float f10, float f11, int i7, int i10) {
        switch (this.a) {
            case 0:
                m6.r(f10, f11, i7, i10);
                break;
            case 1:
                m6.r(f10, f11, i7, i10);
                break;
            default:
                m6.r(f10, f11, i7, i10);
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.h6
    public final ColorFilter f() {
        switch (this.a) {
        }
        return m6.v3;
    }

    @Override // org.telegram.ui.ActionBar.h6
    public final Paint g(String str) {
        switch (this.a) {
        }
        return m6.V0(str);
    }

    @Override // org.telegram.ui.ActionBar.h6
    public final /* synthetic */ Drawable getDrawable(String str) {
        switch (this.a) {
        }
        return null;
    }

    @Override // org.telegram.ui.ActionBar.h6
    public final boolean h() {
        switch (this.a) {
        }
        return bz.H0;
    }

    @Override // org.telegram.ui.ActionBar.h6
    public final int i(int i7) {
        switch (this.a) {
        }
        return k(i7);
    }

    @Override // org.telegram.ui.ActionBar.h6
    public final /* synthetic */ boolean j() {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.h6
    public final int k(int i7) {
        switch (this.a) {
            case 0:
                return ((t1) this.b).f(i7);
            case 1:
                return ((g2) this.b).getThemedColor(i7);
            default:
                return ((c51) this.b).I(i7);
        }
    }

    @Override // org.telegram.ui.ActionBar.h6
    public final /* synthetic */ void l(int i7, int i10) {
        int i11 = this.a;
    }

    @Override // org.telegram.ui.ActionBar.h6
    public final int m(int i7) {
        switch (this.a) {
        }
        return k(i7);
    }

    private final /* synthetic */ void a(int i7, int i10) {
    }

    private final /* synthetic */ void b(int i7, int i10) {
    }

    private final /* synthetic */ void c(int i7, int i10) {
    }
}
