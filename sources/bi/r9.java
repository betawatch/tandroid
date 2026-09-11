package bi;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.ui.Components.fk0;
import org.telegram.ui.Components.w50;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes4.dex */
public final class r9 extends z4.a {
    public final ArrayList c = new ArrayList();
    public final /* synthetic */ Context d;
    public final /* synthetic */ pb e;
    public final /* synthetic */ org.telegram.ui.ActionBar.f6 f;
    public final /* synthetic */ fb g;

    public r9(fb fbVar, Context context, pb pbVar, org.telegram.ui.ActionBar.f6 f6Var) {
        this.g = fbVar;
        this.d = context;
        this.e = pbVar;
        this.f = f6Var;
    }

    @Override // z4.a
    public final void a(z4.g gVar, Object obj) {
        FrameLayout frameLayout = (FrameLayout) obj;
        gVar.removeView(frameLayout);
        o5 o5Var = (o5) frameLayout.getChildAt(0);
        AndroidUtilities.removeFromParent(o5Var);
        this.c.add(o5Var);
    }

    @Override // z4.a
    public final int b() {
        fb fbVar = this.g;
        ArrayList arrayList = fbVar.x0;
        return arrayList != null ? arrayList.size() : fbVar.A0.size();
    }

    @Override // z4.a
    public final Object e(z4.g gVar, int i10) {
        o5 q9Var;
        Context context = this.d;
        fb fbVar = this.g;
        t9 t9Var = new t9(fbVar, context);
        ArrayList arrayList = this.c;
        boolean isEmpty = arrayList.isEmpty();
        pb pbVar = this.e;
        if (isEmpty) {
            q9Var = new q9(this, this.d, pbVar, fbVar.H0, this.f);
        } else {
            q9Var = (o5) arrayList.remove(0);
            q9Var.o1.a.getImageReceiver().setVisible(true, true);
            if (q9Var.e2 != null) {
                q9Var.b2.P0();
                q9Var.b2.setAlpha(1.0f - q9Var.d4);
            }
            fk0 fk0Var = q9Var.f2;
            if (fk0Var != null) {
                fk0Var.n();
            }
            fk0 fk0Var2 = q9Var.r3;
            if (fk0Var2 != null) {
                fk0Var2.n();
            }
            w50 w50Var = q9Var.J2;
            if (w50Var != null) {
                AndroidUtilities.removeFromParent(w50Var);
                q9Var.J2.h(true);
                q9Var.J2 = null;
            }
            q9Var.setActive(false);
            q9Var.setIsVisible(false);
            q9Var.L2 = false;
            q9Var.O2.d(0.0f, false);
            q9Var.l1 = null;
            q9Var.i3 = false;
            q9Var.p0();
        }
        t9Var.a = q9Var;
        q9Var.setAccount(fbVar.y0);
        q9Var.setDelegate(fbVar.B0);
        q9Var.setLongpressed(pbVar.a1);
        t9Var.setTag(Integer.valueOf(i10));
        ArrayList arrayList2 = fbVar.x0;
        if (arrayList2 != null) {
            if (pbVar.R0) {
                i10 = (arrayList2.size() - 1) - i10;
            }
            ArrayList arrayList3 = (ArrayList) arrayList2.get(i10);
            t9Var.c = arrayList3;
            l8 l8Var = pbVar.O0;
            if ((l8Var instanceof d8) || (l8Var instanceof o8)) {
                MessageObject f7 = l8Var.f(((Integer) arrayList3.get(0)).intValue());
                t9Var.b = f7 == null ? fbVar.w0 : f7.getDialogId();
            } else {
                t9Var.b = fbVar.w0;
            }
        } else {
            t9Var.c = null;
            t9Var.b = ((Long) fbVar.A0.get(i10)).longValue();
        }
        t9Var.addView(q9Var);
        q9Var.requestLayout();
        gVar.addView(t9Var);
        return t9Var;
    }

    @Override // z4.a
    public final boolean f(View view, Object obj) {
        return view == obj;
    }
}
