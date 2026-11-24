// default package

import android.animation.ValueAnimator;
import android.graphics.Path;
import android.text.Layout;
import android.view.View;
import java.util.ArrayList;
import java.util.Stack;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class mna extends Path {
    public final /* synthetic */ View a;
    public final /* synthetic */ Layout b;
    public final /* synthetic */ Stack c;
    public final /* synthetic */ ArrayList d;
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;
    public final /* synthetic */ ArrayList g;

    public mna(View view, Layout layout, Stack stack, ArrayList arrayList, int i, int i2, ArrayList arrayList2) {
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
        rna rnaVar = (stack == null || stack.isEmpty()) ? new rna() : (rna) stack.remove(0);
        rnaVar.y = false;
        ArrayList arrayList = this.g;
        if (arrayList != null) {
            float f5 = (f2 + f4) / 2.0f;
            while (true) {
                if (i >= arrayList.size()) {
                    break;
                }
                b09 b09Var = (b09) arrayList.get(i);
                if (f5 >= b09Var.b && f5 <= b09Var.c) {
                    rnaVar.y = true;
                    break;
                }
                i++;
            }
        }
        rnaVar.n = -1.0f;
        ValueAnimator valueAnimator = rnaVar.r;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        rnaVar.p = true;
        int max = (int) Math.max(f, this.e);
        int i2 = (int) f2;
        int i3 = this.f;
        rnaVar.setBounds(max, i2, (int) Math.min(f3, i3 <= 0 ? 2.1474836E9f : i3), (int) f4);
        rnaVar.h(this.b.getPaint().getColor());
        rnaVar.t = vt3.c;
        int width = rnaVar.getBounds().width() / gm.L(6.0f);
        byte b = rna.B;
        int b2 = pqe.b(width * b, b, rna.A);
        Stack stack2 = rnaVar.c;
        rnaVar.d = b2;
        while (rnaVar.h.size() + stack2.size() < b2) {
            stack2.push(new nna());
        }
        View view = this.a;
        if (view != null) {
            rnaVar.i = view;
        }
        this.d.add(rnaVar);
    }
}
