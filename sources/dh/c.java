package dh;

import android.animation.ValueAnimator;
import android.graphics.Path;
import android.text.Layout;
import android.view.View;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.bi0;
import org.telegram.ui.Components.xs;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class c extends Path {
    public final /* synthetic */ View a;
    public final /* synthetic */ Layout b;
    public final /* synthetic */ Stack c;
    public final /* synthetic */ List d;
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;
    public final /* synthetic */ ArrayList g;

    public c(View view, Layout layout, Stack stack, List list, int i9, int i10, ArrayList arrayList) {
        this.a = view;
        this.b = layout;
        this.c = stack;
        this.d = list;
        this.e = i9;
        this.f = i10;
        this.g = arrayList;
    }

    @Override // android.graphics.Path
    public final void addRect(float f10, float f11, float f12, float f13, Path.Direction direction) {
        Stack stack = this.c;
        int i9 = 0;
        l lVar = (stack == null || stack.isEmpty()) ? new l() : (l) stack.remove(0);
        lVar.y = false;
        ArrayList arrayList = this.g;
        if (arrayList != null) {
            float f14 = (f11 + f13) / 2.0f;
            while (true) {
                if (i9 >= arrayList.size()) {
                    break;
                }
                bi0 bi0Var = (bi0) arrayList.get(i9);
                if (f14 >= bi0Var.b && f14 <= bi0Var.c) {
                    lVar.y = true;
                    break;
                }
                i9++;
            }
        }
        lVar.n = -1.0f;
        ValueAnimator valueAnimator = lVar.r;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        lVar.p = true;
        int max = (int) Math.max(f10, this.e);
        int i10 = (int) f11;
        int i11 = this.f;
        lVar.setBounds(max, i10, (int) Math.min(f12, i11 <= 0 ? 2.14748365E9f : i11), (int) f13);
        lVar.h(this.b.getPaint().getColor());
        lVar.t = xs.c;
        int width = lVar.getBounds().width() / AndroidUtilities.dp(6.0f);
        int i12 = l.B;
        int b10 = g7.n.b(width * i12, i12, l.A);
        Stack stack2 = lVar.c;
        lVar.d = b10;
        while (lVar.h.size() + stack2.size() < b10) {
            stack2.push(new e());
        }
        View view = this.a;
        if (view != null) {
            lVar.i = view;
        }
        this.d.add(lVar);
    }
}
