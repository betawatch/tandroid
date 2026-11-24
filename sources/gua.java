// default package

import android.graphics.Canvas;
import android.graphics.RectF;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class gua implements cha {
    public final /* synthetic */ byte a;
    public final /* synthetic */ hz4 b;

    public /* synthetic */ gua(hz4 hz4Var, byte b) {
        this.a = b;
        this.b = hz4Var;
    }

    @Override // cha
    public final void m(Canvas canvas, RectF rectF, RecyclerView recyclerView) {
        byte b = this.a;
        hz4 hz4Var = this.b;
        switch (b) {
            case 0:
                o39 o39Var = (o39) recyclerView;
                tk0.a(o39Var, canvas, rectF, o39Var, hz4Var);
                break;
            default:
                o39 o39Var2 = (o39) recyclerView;
                tk0.a(o39Var2, canvas, rectF, o39Var2, hz4Var);
                break;
        }
    }
}
