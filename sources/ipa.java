// default package

import android.animation.ValueAnimator;
import android.graphics.Path;
import android.text.Layout;
import android.view.View;
import java.util.ArrayList;
import java.util.Stack;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class ipa extends Path {
    public final /* synthetic */ View a;
    public final /* synthetic */ Layout b;
    public final /* synthetic */ Stack c;
    public final /* synthetic */ ArrayList d;
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;
    public final /* synthetic */ ArrayList g;

    public ipa(View view, Layout layout, Stack stack, ArrayList arrayList, int i, int i2, ArrayList arrayList2) {
        this.a = view;
        this.b = layout;
        this.c = stack;
        this.d = arrayList;
        this.e = i;
        this.f = i2;
        this.g = arrayList2;
    }

    @Override // android.graphics.Path
    public final void addRect(float f, float f2, float f3, float f4, Path.Direction direction) {
        Stack stack = this.c;
        int i = 0;
        npa npaVar = (stack == null || stack.isEmpty()) ? new npa() : (npa) stack.remove(0);
        npaVar.y = false;
        ArrayList arrayList = this.g;
        if (arrayList != null) {
            float f5 = (f2 + f4) / 2.0f;
            while (true) {
                if (i >= arrayList.size()) {
                    break;
                }
                n19 n19Var = (n19) arrayList.get(i);
                if (f5 >= n19Var.b && f5 <= n19Var.c) {
                    npaVar.y = true;
                    break;
                }
                i++;
            }
        }
        npaVar.n = -1.0f;
        ValueAnimator valueAnimator = npaVar.r;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        npaVar.p = true;
        int max = (int) Math.max(f, this.e);
        int i2 = (int) f2;
        int i3 = this.f;
        npaVar.setBounds(max, i2, (int) Math.min(f3, i3 <= 0 ? 2.1474836E9f : i3), (int) f4);
        npaVar.h(this.b.getPaint().getColor());
        npaVar.t = dt3.c;
        int width = npaVar.getBounds().width() / hl.L(6.0f);
        byte b = npa.B;
        int b2 = ete.b(width * b, b, npa.A);
        Stack stack2 = npaVar.c;
        npaVar.d = b2;
        while (npaVar.h.size() + stack2.size() < b2) {
            stack2.push(new jpa());
        }
        View view = this.a;
        if (view != null) {
            npaVar.i = view;
        }
        this.d.add(npaVar);
    }
}
