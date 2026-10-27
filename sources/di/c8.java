package di;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.ui.Components.gl0;
import org.telegram.ui.Components.p60;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class c8 extends a5.a {
    public final /* synthetic */ Context c;
    public final /* synthetic */ y9 d;
    public final /* synthetic */ org.telegram.ui.ActionBar.u6 e;
    public final /* synthetic */ x f;

    public c8(x xVar, Context context, y9 y9Var, org.telegram.ui.ActionBar.u6 u6Var) {
        this.f = xVar;
        this.c = context;
        this.d = y9Var;
        this.e = u6Var;
    }

    @Override // a5.a
    public final void a(a5.m mVar, Object obj) {
        FrameLayout frameLayout = (FrameLayout) obj;
        mVar.removeView(frameLayout);
        q4 q4Var = (q4) frameLayout.getChildAt(0);
        AndroidUtilities.removeFromParent(q4Var);
        this.f.P0.add(q4Var);
    }

    @Override // a5.a
    public final int b() {
        x xVar = this.f;
        ArrayList arrayList = xVar.x0;
        return arrayList != null ? arrayList.size() : xVar.A0.size();
    }

    @Override // a5.a
    public final Object e(a5.m mVar, int i10) {
        q4 b8Var;
        Context context = this.c;
        x xVar = this.f;
        e8 e8Var = new e8(xVar, context);
        ArrayList arrayList = xVar.P0;
        boolean isEmpty = arrayList.isEmpty();
        y9 y9Var = this.d;
        if (isEmpty) {
            b8Var = new b8(this, this.c, y9Var, xVar.H0, this.e);
        } else {
            b8Var = (q4) arrayList.remove(0);
            b8Var.d1.a.getImageReceiver().setVisible(true, true);
            if (b8Var.T1 != null) {
                b8Var.Q1.M0();
                b8Var.Q1.setAlpha(1.0f - b8Var.T3);
            }
            gl0 gl0Var = b8Var.U1;
            if (gl0Var != null) {
                gl0Var.n();
            }
            gl0 gl0Var2 = b8Var.g3;
            if (gl0Var2 != null) {
                gl0Var2.n();
            }
            p60 p60Var = b8Var.y2;
            if (p60Var != null) {
                AndroidUtilities.removeFromParent(p60Var);
                b8Var.y2.c(true);
                b8Var.y2 = null;
            }
            b8Var.setActive(false);
            b8Var.setIsVisible(false);
            b8Var.A2 = false;
            b8Var.D2.d(0.0f, false);
            b8Var.a1 = null;
            b8Var.X2 = false;
            b8Var.n0();
        }
        e8Var.a = b8Var;
        b8Var.setAccount(xVar.y0);
        b8Var.setDelegate(xVar.B0);
        b8Var.setLongpressed(y9Var.a1);
        e8Var.setTag(Integer.valueOf(i10));
        ArrayList arrayList2 = xVar.x0;
        if (arrayList2 != null) {
            if (y9Var.R0) {
                i10 = (arrayList2.size() - 1) - i10;
            }
            ArrayList arrayList3 = (ArrayList) arrayList2.get(i10);
            e8Var.c = arrayList3;
            z6 z6Var = y9Var.O0;
            if ((z6Var instanceof t6) || (z6Var instanceof c7)) {
                MessageObject f7 = z6Var.f(((Integer) arrayList3.get(0)).intValue());
                e8Var.b = f7 == null ? xVar.w0 : f7.getDialogId();
            } else {
                e8Var.b = xVar.w0;
            }
        } else {
            e8Var.c = null;
            e8Var.b = ((Long) xVar.A0.get(i10)).longValue();
        }
        e8Var.addView(b8Var);
        b8Var.requestLayout();
        mVar.addView(e8Var);
        return e8Var;
    }

    @Override // a5.a
    public final boolean f(View view, Object obj) {
        return view == obj;
    }
}
