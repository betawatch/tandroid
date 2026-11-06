package org.telegram.ui.ActionBar;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.iz;
import org.telegram.ui.Components.f41;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class s1 implements f6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ s1(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // org.telegram.ui.ActionBar.f6
    public final boolean a() {
        switch (this.a) {
        }
        return k6.I.q();
    }

    @Override // org.telegram.ui.ActionBar.f6
    public final void b(float f10, float f11, int i7, int i10) {
        switch (this.a) {
            case 0:
                k6.r(f10, f11, i7, i10);
                break;
            case 1:
                k6.r(f10, f11, i7, i10);
                break;
            default:
                k6.r(f10, f11, i7, i10);
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.f6
    public final ColorFilter c() {
        switch (this.a) {
        }
        return k6.v3;
    }

    @Override // org.telegram.ui.ActionBar.f6
    public final Paint d(String str) {
        switch (this.a) {
        }
        return k6.V0(str);
    }

    @Override // org.telegram.ui.ActionBar.f6
    public final boolean e() {
        switch (this.a) {
        }
        return iz.H0;
    }

    @Override // org.telegram.ui.ActionBar.f6
    public final int f(int i7) {
        switch (this.a) {
        }
        return h(i7);
    }

    @Override // org.telegram.ui.ActionBar.f6
    public final /* synthetic */ boolean g() {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.f6
    public final /* synthetic */ Drawable getDrawable(String str) {
        switch (this.a) {
        }
        return null;
    }

    @Override // org.telegram.ui.ActionBar.f6
    public final int h(int i7) {
        switch (this.a) {
            case 0:
                return ((u1) this.b).f(i7);
            case 1:
                return ((f2) this.b).getThemedColor(i7);
            default:
                return ((f41) this.b).I(i7);
        }
    }

    @Override // org.telegram.ui.ActionBar.f6
    public final /* synthetic */ void i(int i7, int i10) {
        int i11 = this.a;
    }

    @Override // org.telegram.ui.ActionBar.f6
    public final int j(int i7) {
        switch (this.a) {
        }
        return h(i7);
    }

    private final /* synthetic */ void k(int i7, int i10) {
    }

    private final /* synthetic */ void l(int i7, int i10) {
    }

    private final /* synthetic */ void m(int i7, int i10) {
    }
}
