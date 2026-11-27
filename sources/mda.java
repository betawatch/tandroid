// default package

import android.content.Context;
import android.graphics.Canvas;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class mda extends d79 {
    public final /* synthetic */ byte f3;
    public final /* synthetic */ kea g3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mda(kea keaVar, Context context, vnb vnbVar, byte b) {
        super(context, vnbVar);
        this.f3 = b;
        this.g3 = keaVar;
    }

    @Override // d79
    public final boolean G0(float f) {
        byte b = this.f3;
        float f2 = 58.0f;
        kea keaVar = this.g3;
        switch (b) {
            case 0:
                if (keaVar.c2 && keaVar.j2[1] != null) {
                    f2 = 111.0f;
                }
                if (f >= hl.L(f2) + keaVar.B2.b) {
                    break;
                }
                break;
            default:
                if (keaVar.c2 && keaVar.j2[1] != null) {
                    f2 = 111.0f;
                }
                if (f >= hl.L(f2) + keaVar.B2.b) {
                    break;
                }
                break;
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void draw(Canvas canvas) {
        byte b = this.f3;
        float f = 58.0f;
        kea keaVar = this.g3;
        switch (b) {
            case 0:
                d79 d79Var = keaVar.z1;
                if (d79Var.getVisibility() != 8) {
                    canvas.save();
                    int i = keaVar.k2;
                    if (keaVar.c2 && keaVar.j2[1] != null) {
                        f = 111.0f;
                    }
                    canvas.clipRect(0, hl.L(f) + i, getWidth(), getHeight());
                }
                super.draw(canvas);
                if (d79Var.getVisibility() != 8) {
                    canvas.restore();
                    break;
                }
                break;
            default:
                d79 d79Var2 = keaVar.z1;
                if (d79Var2.getVisibility() != 8) {
                    canvas.save();
                    int i2 = keaVar.k2;
                    if (keaVar.c2 && keaVar.j2[1] != null) {
                        f = 111.0f;
                    }
                    canvas.clipRect(0, hl.L(f) + i2, getWidth(), getHeight());
                }
                super.draw(canvas);
                if (d79Var2.getVisibility() != 8) {
                    canvas.restore();
                    break;
                }
                break;
        }
    }
}
