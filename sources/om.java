// default package

import android.view.View;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
