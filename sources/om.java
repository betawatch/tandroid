// default package

import android.view.View;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class om implements z66, ve3 {
    public final View a;
    public boolean b;
    public boolean c;
    public byte d;
    public int e;

    public om(View view) {
        this.a = view;
    }

    @Override // ve3
    public final void a() {
        if (!this.b) {
            this.a.setVisibility(8);
        }
        this.c = false;
    }

    @Override // z66
    public final int b(boolean z) {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof om)) {
            return false;
        }
        return this.a.equals(((om) obj).a);
    }

    @Override // z66
    public final int getHeight() {
        return this.a.getMeasuredHeight();
    }

    @Override // z66
    public final int getWidth() {
        return this.a.getMeasuredWidth();
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
