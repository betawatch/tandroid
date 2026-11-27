// default package

import android.content.Context;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class i94 extends it4 {
    public final /* synthetic */ byte j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i94(rl8 rl8Var, Context context, int i, int i2, Context context2) {
        super(context, i, i2);
        this.j0 = (byte) 4;
    }

    @Override // it4
    public final void g() {
        switch (this.j0) {
            case 4:
                boolean z = f11.a;
                break;
        }
    }

    @Override // it4
    public final void n() {
        switch (this.j0) {
            case 5:
                break;
            default:
                super.n();
                break;
        }
    }

    @Override // it4, android.view.TextureView, android.view.View
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

    @Override // it4, android.view.View
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
    public /* synthetic */ i94(Context context, int i, int i2, byte b) {
        super(context, i, i2);
        this.j0 = b;
    }

    private final void p() {
    }
}
