package eg;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import bg.j3;
import java.util.ArrayList;
import java.util.Calendar;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.a3;
import org.telegram.ui.ActionBar.f3;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.b5;
import org.telegram.ui.Components.c5;
import org.telegram.ui.Components.e4;
import org.telegram.ui.Components.e9;
import org.telegram.ui.Components.f4;
import org.telegram.ui.Components.j70;
import org.telegram.ui.Components.nx0;
import org.telegram.ui.Components.qc0;
import org.telegram.ui.Components.t9;
import org.telegram.ui.Components.w3;
import org.telegram.ui.Components.y3;
import org.telegram.ui.kl0;
import org.telegram.ui.s41;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class f implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;

    public /* synthetic */ f(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = obj2;
        this.e = obj3;
        this.f = obj4;
        this.h = obj5;
        this.d = obj6;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Runnable runnable;
        Runnable runnable2;
        Runnable runnable3;
        Runnable runnable4;
        switch (this.a) {
            case 0:
                Calendar calendar = (Calendar) this.c;
                qc0 qc0Var = (qc0) this.b;
                o oVar = (o) this.e;
                p pVar = (p) this.f;
                s0 s0Var = (s0) this.h;
                a3 a3Var = (a3) this.d;
                calendar.setTimeInMillis((qc0Var.getValue() * 86400000) + System.currentTimeMillis());
                calendar.set(11, oVar.getValue());
                calendar.set(12, pVar.getValue() * 5);
                s0Var.I((int) (calendar.getTimeInMillis() / 1000), 0, true);
                runnable = a3Var.a.dismissRunnable;
                runnable.run();
                break;
            case 1:
                qc0 qc0Var2 = (qc0) this.b;
                qc0 qc0Var3 = (qc0) this.e;
                qc0 qc0Var4 = (qc0) this.f;
                Calendar calendar2 = (Calendar) this.c;
                MessagesStorage.IntCallback intCallback = (MessagesStorage.IntCallback) this.h;
                a3 a3Var2 = (a3) this.d;
                c5.b(qc0Var2, qc0Var3, qc0Var4);
                calendar2.set(1, qc0Var4.getValue());
                calendar2.set(2, qc0Var3.getValue());
                calendar2.set(5, qc0Var2.getValue());
                calendar2.set(12, 0);
                calendar2.set(11, 0);
                calendar2.set(13, 0);
                intCallback.run((int) (calendar2.getTimeInMillis() / 1000));
                runnable2 = a3Var2.a.dismissRunnable;
                runnable2.run();
                break;
            case 2:
                qc0 qc0Var5 = (qc0) this.b;
                e4 e4Var = (e4) this.e;
                f4 f4Var = (f4) this.f;
                Calendar calendar3 = (Calendar) this.c;
                kl0 kl0Var = (kl0) this.h;
                a3 a3Var3 = (a3) this.d;
                boolean g10 = c5.g(null, null, 0L, 0L, 0, qc0Var5, e4Var, f4Var);
                calendar3.setTimeInMillis(System.currentTimeMillis());
                calendar3.add(6, qc0Var5.getValue());
                calendar3.set(11, e4Var.getValue());
                calendar3.set(12, f4Var.getValue());
                if (g10) {
                    calendar3.set(13, 0);
                    calendar3.set(14, 0);
                }
                int timeInMillis = (int) (calendar3.getTimeInMillis() / 1000);
                s41 s41Var = (s41) kl0Var.b;
                ((boolean[]) kl0Var.c)[0] = true;
                s41Var.e(Integer.valueOf(timeInMillis));
                runnable3 = a3Var3.a.dismissRunnable;
                runnable3.run();
                break;
            case 3:
                qc0 qc0Var6 = (qc0) this.b;
                w3 w3Var = (w3) this.e;
                y3 y3Var = (y3) this.f;
                Calendar calendar4 = (Calendar) this.c;
                b5 b5Var = (b5) this.h;
                a3 a3Var4 = (a3) this.d;
                boolean g11 = c5.g(null, null, 0L, 0L, 0, qc0Var6, w3Var, y3Var);
                calendar4.setTimeInMillis(System.currentTimeMillis());
                calendar4.add(6, qc0Var6.getValue());
                calendar4.set(11, w3Var.getValue());
                calendar4.set(12, y3Var.getValue());
                if (g11) {
                    calendar4.set(13, 0);
                    calendar4.set(14, 0);
                }
                b5Var.I((int) (calendar4.getTimeInMillis() / 1000), 0, true);
                runnable4 = a3Var4.a.dismissRunnable;
                runnable4.run();
                break;
            case 4:
                nx0.x((nx0) this.c, (int[]) this.b, (EditTextBoldCursor) this.e, (TextView) this.f, (TextView) this.h, (AlertDialog$Builder) this.d);
                break;
            default:
                f3 f3Var = (f3) this.c;
                FrameLayout frameLayout = (FrameLayout) this.b;
                ArrayList arrayList = (ArrayList) this.e;
                int[] iArr = (int[]) this.f;
                e9 e9Var = (e9) this.h;
                t9 t9Var = (t9) this.d;
                j70 F = j70.F(f3Var.container, f3Var.getResourcesProvider(), frameLayout);
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    int i11 = i10 + 1;
                    int intValue = ((Integer) arrayList.get(i10)).intValue();
                    TLRPC.User currentUser = UserConfig.getInstance(intValue).getCurrentUser();
                    if (currentUser != null) {
                        F.e(intValue, iArr[0] == intValue, new j3(iArr, intValue, e9Var, currentUser, t9Var, 24));
                    }
                    i10 = i11;
                }
                F.t = false;
                F.Y = true;
                F.s = 0;
                F.i = 3;
                F.a0(-AndroidUtilities.dp(8.0f), -AndroidUtilities.dp(8.0f));
                F.Z();
                break;
        }
    }

    public /* synthetic */ f(qc0 qc0Var, qc0 qc0Var2, qc0 qc0Var3, Calendar calendar, Object obj, a3 a3Var, int i10) {
        this.a = i10;
        this.b = qc0Var;
        this.e = qc0Var2;
        this.f = qc0Var3;
        this.c = calendar;
        this.h = obj;
        this.d = a3Var;
    }
}
