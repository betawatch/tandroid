// default package

import android.view.View;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
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
