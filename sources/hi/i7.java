package hi;

import org.telegram.ui.Components.sp;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes4.dex */
public final class i7 extends sp {
    public final /* synthetic */ int i = 0;

    public /* synthetic */ i7(float f10, float f11, int i7) {
        super(f10, f11, i7);
    }

    @Override // org.telegram.ui.Components.sp, android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        switch (this.i) {
            case 0:
                return org.telegram.messenger.g0.L(26.0f);
            default:
                return (int) ((this.b * 2.0f) + this.a);
        }
    }

    @Override // org.telegram.ui.Components.sp, android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        switch (this.i) {
            case 0:
                return org.telegram.messenger.g0.L(26.0f);
            default:
                return (int) ((this.b * 2.0f) + this.a);
        }
    }

    public /* synthetic */ i7(int i7) {
        super(i7);
    }
}
