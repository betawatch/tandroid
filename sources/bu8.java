// default package

import android.content.Context;
import android.view.View;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class bu8 extends a8c {
    public static final /* synthetic */ int b = 0;

    static {
        a8c.h(new bu8());
    }

    @Override // a8c
    public final void b(View view, b8c b8cVar, boolean z, l9c l9cVar, q9c q9cVar) {
        p66 p66Var = (p66) view;
        p66Var.setGravity(b8cVar.A);
        Object obj = b8cVar.I;
        if (obj instanceof Integer) {
            int intValue = ((Integer) obj).intValue();
            Object obj2 = b8cVar.H;
            yob.X(p66Var, intValue, obj2 instanceof vnb ? (vnb) obj2 : null);
        } else {
            xob xobVar = yob.a;
            p66Var.setTag(R.id.theme_bind, null);
            p66Var.setTextColor((int) b8cVar.C);
        }
        p66Var.setTextSize(1, b8cVar.B);
        p66Var.setTypeface(b8cVar.r ? hl.o() : null);
        int i = b8cVar.i;
        p66Var.setPadding(i, 0, i, b8cVar.k);
        p66Var.setText(b8cVar.m);
    }

    @Override // a8c
    public final View d(Context context, d79 d79Var, int i, vnb vnbVar) {
        return new b21(context, null, (byte) 8);
    }
}
