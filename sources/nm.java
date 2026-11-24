// default package

import android.view.View;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class nm implements v46, be3 {
    public final View a;
    public boolean b;
    public boolean c;
    public byte d;
    public int e;

    public nm(View view) {
        this.a = view;
    }

    @Override // be3
    public final void a() {
        if (!this.b) {
            this.a.setVisibility(8);
        }
        this.c = false;
    }

    @Override // v46
    public final int b(boolean z) {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof nm)) {
            return false;
        }
        return this.a.equals(((nm) obj).a);
    }

    @Override // v46
    public final int getHeight() {
        return this.a.getMeasuredHeight();
    }

    @Override // v46
    public final int getWidth() {
        return this.a.getMeasuredWidth();
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
