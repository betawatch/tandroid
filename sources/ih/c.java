package ih;

import android.animation.ValueAnimator;
import android.graphics.Path;
import android.text.Layout;
import android.view.View;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.gt;
import org.telegram.ui.Components.vi0;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class c extends Path {
    public final /* synthetic */ View a;
    public final /* synthetic */ Layout b;
    public final /* synthetic */ Stack c;
    public final /* synthetic */ List d;
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;
    public final /* synthetic */ ArrayList g;

    public c(View view, Layout layout, Stack stack, List list, int i10, int i11, ArrayList arrayList) {
        this.a = view;
        this.b = layout;
        this.c = stack;
        this.d = list;
        this.e = i10;
        this.f = i11;
        this.g = arrayList;
    }

    @Override // android.graphics.Path
    public final void addRect(float f10, float f11, float f12, float f13, Path.Direction direction) {
        Stack stack = this.c;
        int i10 = 0;
        k kVar = (stack == null || stack.isEmpty()) ? new k() : (k) stack.remove(0);
        kVar.y = false;
        ArrayList arrayList = this.g;
        if (arrayList != null) {
            float f14 = (f11 + f13) / 2.0f;
            while (true) {
                if (i10 >= arrayList.size()) {
                    break;
                }
                vi0 vi0Var = (vi0) arrayList.get(i10);
                if (f14 >= vi0Var.b && f14 <= vi0Var.c) {
                    kVar.y = true;
                    break;
                }
                i10++;
            }
        }
        kVar.n = -1.0f;
        ValueAnimator valueAnimator = kVar.r;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        kVar.p = true;
        int max = (int) Math.max(f10, this.e);
        int i11 = (int) f11;
        int i12 = this.f;
        kVar.setBounds(max, i11, (int) Math.min(f12, i12 <= 0 ? 2.14748365E9f : i12), (int) f13);
        kVar.h(this.b.getPaint().getColor());
        kVar.t = gt.c;
        int width = kVar.getBounds().width() / AndroidUtilities.dp(6.0f);
        int i13 = k.B;
        int b10 = k7.n.b(width * i13, i13, k.A);
        Stack stack2 = kVar.c;
        kVar.d = b10;
        while (kVar.h.size() + stack2.size() < b10) {
            stack2.push(new e());
        }
        View view = this.a;
        if (view != null) {
            kVar.i = view;
        }
        this.d.add(kVar);
    }
}
