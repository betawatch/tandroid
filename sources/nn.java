// default package

import android.view.View;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class nn implements v66, nf3 {
    public final View a;
    public boolean b;
    public boolean c;
    public byte d;
    public int e;

    public nn(View view) {
        this.a = view;
    }

    @Override // nf3
    public final void a() {
        if (!this.b) {
            this.a.setVisibility(8);
        }
        this.c = false;
    }

    @Override // v66
    public final int b(boolean z) {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof nn)) {
            return false;
        }
        return this.a.equals(((nn) obj).a);
    }

    @Override // v66
    public final int getHeight() {
        return this.a.getMeasuredHeight();
    }

    @Override // v66
    public final int getWidth() {
        return this.a.getMeasuredWidth();
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
