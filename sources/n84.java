// default package

import android.content.Context;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class n84 extends er4 {
    public final /* synthetic */ byte j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n84(ei8 ei8Var, Context context, int i, int i2, Context context2) {
        super(context, i, i2);
        this.j0 = (byte) 4;
    }

    @Override // er4
    public final void g() {
        switch (this.j0) {
            case 4:
                boolean z = w01.a;
                break;
        }
    }

    @Override // er4
    public final void n() {
        switch (this.j0) {
            case 5:
                break;
            default:
                super.n();
                break;
        }
    }

    @Override // er4, android.view.TextureView, android.view.View
    public final void onAttachedToWindow() {
        switch (this.j0) {
            case 0:
                super.onAttachedToWindow();
                setPaused(false);
                break;
            case 1:
                super.onAttachedToWindow();
                setPaused(false);
                break;
            case 2:
                super.onAttachedToWindow();
                setPaused(false);
                break;
            case 3:
                super.onAttachedToWindow();
                setPaused(false);
                break;
            default:
                super.onAttachedToWindow();
                break;
        }
    }

    @Override // er4, android.view.View
    public final void onDetachedFromWindow() {
        switch (this.j0) {
            case 0:
                super.onDetachedFromWindow();
                setPaused(true);
                break;
            case 1:
                super.onDetachedFromWindow();
                setPaused(true);
                break;
            case 2:
                super.onDetachedFromWindow();
                setPaused(true);
                break;
            case 3:
                super.onDetachedFromWindow();
                setPaused(true);
                break;
            default:
                super.onDetachedFromWindow();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n84(Context context, int i, int i2, byte b) {
        super(context, i, i2);
        this.j0 = b;
    }

    private final void p() {
    }
}
