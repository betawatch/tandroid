package nh;

import android.animation.ValueAnimator;
import android.graphics.Path;
import android.text.Layout;
import android.view.View;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import org.telegram.messenger.i0;
import org.telegram.ui.Components.sh0;
import org.telegram.ui.Components.vs;
import w7.u;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
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
    public final void addRect(float f7, float f10, float f11, float f12, Path.Direction direction) {
        Stack stack = this.c;
        int i10 = 0;
        i iVar = (stack == null || stack.isEmpty()) ? new i() : (i) stack.remove(0);
        iVar.y = false;
        ArrayList arrayList = this.g;
        if (arrayList != null) {
            float f13 = (f10 + f12) / 2.0f;
            while (true) {
                if (i10 >= arrayList.size()) {
                    break;
                }
                sh0 sh0Var = (sh0) arrayList.get(i10);
                if (f13 >= sh0Var.b && f13 <= sh0Var.c) {
                    iVar.y = true;
                    break;
                }
                i10++;
            }
        }
        iVar.n = -1.0f;
        ValueAnimator valueAnimator = iVar.r;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        iVar.p = true;
        int max = (int) Math.max(f7, this.e);
        int i11 = (int) f10;
        int i12 = this.f;
        iVar.setBounds(max, i11, (int) Math.min(f11, i12 <= 0 ? 2.14748365E9f : i12), (int) f12);
        iVar.h(this.b.getPaint().getColor());
        iVar.t = vs.c;
        int width = iVar.getBounds().width() / i0.L(6.0f);
        int i13 = i.B;
        int b10 = u.b(width * i13, i13, i.A);
        Stack stack2 = iVar.c;
        iVar.d = b10;
        while (iVar.h.size() + stack2.size() < b10) {
            stack2.push(new d());
        }
        View view = this.a;
        if (view != null) {
            iVar.i = view;
        }
        this.d.add(iVar);
    }
}
