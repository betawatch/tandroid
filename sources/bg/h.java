package bg;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Calendar;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.a4;
import org.telegram.ui.Components.b4;
import org.telegram.ui.Components.bc0;
import org.telegram.ui.Components.cx0;
import org.telegram.ui.Components.o9;
import org.telegram.ui.Components.s3;
import org.telegram.ui.Components.u3;
import org.telegram.ui.Components.x4;
import org.telegram.ui.Components.x60;
import org.telegram.ui.Components.y4;
import org.telegram.ui.Components.z8;
import org.telegram.ui.nl0;
import org.telegram.ui.q41;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class h implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;

    public /* synthetic */ h(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i9) {
        this.a = i9;
        this.c = obj;
        this.b = obj2;
        this.e = obj3;
        this.f = obj4;
        this.h = obj5;
        this.d = obj6;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                Calendar calendar = (Calendar) this.c;
                bc0 bc0Var = (bc0) this.b;
                q qVar = (q) this.e;
                r rVar = (r) this.f;
                w0 w0Var = (w0) this.h;
                org.telegram.ui.ActionBar.a3 a3Var = (org.telegram.ui.ActionBar.a3) this.d;
                calendar.setTimeInMillis((bc0Var.getValue() * 86400000) + System.currentTimeMillis());
                calendar.set(11, qVar.getValue());
                calendar.set(12, rVar.getValue() * 5);
                w0Var.B((int) (calendar.getTimeInMillis() / 1000), 0, true);
                a3Var.a.dismissRunnable.run();
                break;
            case 1:
                bc0 bc0Var2 = (bc0) this.b;
                bc0 bc0Var3 = (bc0) this.e;
                bc0 bc0Var4 = (bc0) this.f;
                Calendar calendar2 = (Calendar) this.c;
                MessagesStorage.IntCallback intCallback = (MessagesStorage.IntCallback) this.h;
                org.telegram.ui.ActionBar.a3 a3Var2 = (org.telegram.ui.ActionBar.a3) this.d;
                y4.b(bc0Var2, bc0Var3, bc0Var4);
                calendar2.set(1, bc0Var4.getValue());
                calendar2.set(2, bc0Var3.getValue());
                calendar2.set(5, bc0Var2.getValue());
                calendar2.set(12, 0);
                calendar2.set(11, 0);
                calendar2.set(13, 0);
                intCallback.run((int) (calendar2.getTimeInMillis() / 1000));
                a3Var2.a.dismissRunnable.run();
                break;
            case 2:
                bc0 bc0Var5 = (bc0) this.b;
                a4 a4Var = (a4) this.e;
                b4 b4Var = (b4) this.f;
                Calendar calendar3 = (Calendar) this.c;
                nl0 nl0Var = (nl0) this.h;
                org.telegram.ui.ActionBar.a3 a3Var3 = (org.telegram.ui.ActionBar.a3) this.d;
                boolean g10 = y4.g(null, null, 0L, 0L, 0, bc0Var5, a4Var, b4Var);
                calendar3.setTimeInMillis(System.currentTimeMillis());
                calendar3.add(6, bc0Var5.getValue());
                calendar3.set(11, a4Var.getValue());
                calendar3.set(12, b4Var.getValue());
                if (g10) {
                    calendar3.set(13, 0);
                    calendar3.set(14, 0);
                }
                int timeInMillis = (int) (calendar3.getTimeInMillis() / 1000);
                q41 q41Var = (q41) nl0Var.b;
                ((boolean[]) nl0Var.c)[0] = true;
                q41Var.e(Integer.valueOf(timeInMillis));
                a3Var3.a.dismissRunnable.run();
                break;
            case 3:
                bc0 bc0Var6 = (bc0) this.b;
                s3 s3Var = (s3) this.e;
                u3 u3Var = (u3) this.f;
                Calendar calendar4 = (Calendar) this.c;
                x4 x4Var = (x4) this.h;
                org.telegram.ui.ActionBar.a3 a3Var4 = (org.telegram.ui.ActionBar.a3) this.d;
                boolean g11 = y4.g(null, null, 0L, 0L, 0, bc0Var6, s3Var, u3Var);
                calendar4.setTimeInMillis(System.currentTimeMillis());
                calendar4.add(6, bc0Var6.getValue());
                calendar4.set(11, s3Var.getValue());
                calendar4.set(12, u3Var.getValue());
                if (g11) {
                    calendar4.set(13, 0);
                    calendar4.set(14, 0);
                }
                x4Var.B((int) (calendar4.getTimeInMillis() / 1000), 0, true);
                a3Var4.a.dismissRunnable.run();
                break;
            case 4:
                cx0.x((cx0) this.c, (int[]) this.b, (EditTextBoldCursor) this.e, (TextView) this.f, (TextView) this.h, (AlertDialog$Builder) this.d);
                break;
            default:
                org.telegram.ui.ActionBar.f3 f3Var = (org.telegram.ui.ActionBar.f3) this.c;
                FrameLayout frameLayout = (FrameLayout) this.b;
                ArrayList arrayList = (ArrayList) this.e;
                int[] iArr = (int[]) this.f;
                z8 z8Var = (z8) this.h;
                o9 o9Var = (o9) this.d;
                x60 F = x60.F(f3Var.container, f3Var.getResourcesProvider(), frameLayout);
                int size = arrayList.size();
                int i9 = 0;
                while (i9 < size) {
                    int i10 = i9 + 1;
                    int intValue = ((Integer) arrayList.get(i9)).intValue();
                    TLRPC.User currentUser = UserConfig.getInstance(intValue).getCurrentUser();
                    if (currentUser != null) {
                        F.e(intValue, iArr[0] == intValue, new fh.g1(iArr, intValue, z8Var, currentUser, o9Var, 27));
                    }
                    i9 = i10;
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

    public /* synthetic */ h(bc0 bc0Var, bc0 bc0Var2, bc0 bc0Var3, Calendar calendar, Object obj, org.telegram.ui.ActionBar.a3 a3Var, int i9) {
        this.a = i9;
        this.b = bc0Var;
        this.e = bc0Var2;
        this.f = bc0Var3;
        this.c = calendar;
        this.h = obj;
        this.d = a3Var;
    }
}
