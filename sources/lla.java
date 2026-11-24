// default package

import android.animation.ValueAnimator;
import android.graphics.Path;
import android.text.Layout;
import android.view.View;
import java.util.ArrayList;
import java.util.Stack;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class lla extends Path {
    public final /* synthetic */ View a;
    public final /* synthetic */ Layout b;
    public final /* synthetic */ Stack c;
    public final /* synthetic */ ArrayList d;
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;
    public final /* synthetic */ ArrayList g;

    public lla(View view, Layout layout, Stack stack, ArrayList arrayList, int i, int i2, ArrayList arrayList2) {
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
        qla qlaVar = (stack == null || stack.isEmpty()) ? new qla() : (qla) stack.remove(0);
        qlaVar.y = false;
        ArrayList arrayList = this.g;
        if (arrayList != null) {
            float f5 = (f2 + f4) / 2.0f;
            while (true) {
                if (i >= arrayList.size()) {
                    break;
                }
                ay8 ay8Var = (ay8) arrayList.get(i);
                if (f5 >= ay8Var.b && f5 <= ay8Var.c) {
                    qlaVar.y = true;
                    break;
                }
                i++;
            }
        }
        qlaVar.n = -1.0f;
        ValueAnimator valueAnimator = qlaVar.r;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        qlaVar.p = true;
        int max = (int) Math.max(f, this.e);
        int i2 = (int) f2;
        int i3 = this.f;
        qlaVar.setBounds(max, i2, (int) Math.min(f3, i3 <= 0 ? 2.1474836E9f : i3), (int) f4);
        qlaVar.h(this.b.getPaint().getColor());
        qlaVar.t = ls3.c;
        int width = qlaVar.getBounds().width() / gl.L(6.0f);
        byte b = qla.B;
        int b2 = moe.b(width * b, b, qla.A);
        Stack stack2 = qlaVar.c;
        qlaVar.d = b2;
        while (qlaVar.h.size() + stack2.size() < b2) {
            stack2.push(new mla());
        }
        View view = this.a;
        if (view != null) {
            qlaVar.i = view;
        }
        this.d.add(qlaVar);
    }
}
