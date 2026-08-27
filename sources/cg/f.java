package cg;

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
import org.telegram.ui.ActionBar.e3;
import org.telegram.ui.ActionBar.z2;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.a4;
import org.telegram.ui.Components.b4;
import org.telegram.ui.Components.b70;
import org.telegram.ui.Components.ex0;
import org.telegram.ui.Components.fc0;
import org.telegram.ui.Components.n9;
import org.telegram.ui.Components.s3;
import org.telegram.ui.Components.u3;
import org.telegram.ui.Components.x4;
import org.telegram.ui.Components.y4;
import org.telegram.ui.Components.y8;
import org.telegram.ui.nl0;
import org.telegram.ui.p41;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
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
                fc0 fc0Var = (fc0) this.b;
                n nVar = (n) this.e;
                o oVar = (o) this.f;
                s0 s0Var = (s0) this.h;
                z2 z2Var = (z2) this.d;
                calendar.setTimeInMillis((fc0Var.getValue() * 86400000) + System.currentTimeMillis());
                calendar.set(11, nVar.getValue());
                calendar.set(12, oVar.getValue() * 5);
                s0Var.I((int) (calendar.getTimeInMillis() / 1000), 0, true);
                runnable = z2Var.a.dismissRunnable;
                runnable.run();
                break;
            case 1:
                fc0 fc0Var2 = (fc0) this.b;
                fc0 fc0Var3 = (fc0) this.e;
                fc0 fc0Var4 = (fc0) this.f;
                Calendar calendar2 = (Calendar) this.c;
                MessagesStorage.IntCallback intCallback = (MessagesStorage.IntCallback) this.h;
                z2 z2Var2 = (z2) this.d;
                y4.b(fc0Var2, fc0Var3, fc0Var4);
                calendar2.set(1, fc0Var4.getValue());
                calendar2.set(2, fc0Var3.getValue());
                calendar2.set(5, fc0Var2.getValue());
                calendar2.set(12, 0);
                calendar2.set(11, 0);
                calendar2.set(13, 0);
                intCallback.run((int) (calendar2.getTimeInMillis() / 1000));
                runnable2 = z2Var2.a.dismissRunnable;
                runnable2.run();
                break;
            case 2:
                fc0 fc0Var5 = (fc0) this.b;
                a4 a4Var = (a4) this.e;
                b4 b4Var = (b4) this.f;
                Calendar calendar3 = (Calendar) this.c;
                nl0 nl0Var = (nl0) this.h;
                z2 z2Var3 = (z2) this.d;
                boolean g10 = y4.g(null, null, 0L, 0L, 0, fc0Var5, a4Var, b4Var);
                calendar3.setTimeInMillis(System.currentTimeMillis());
                calendar3.add(6, fc0Var5.getValue());
                calendar3.set(11, a4Var.getValue());
                calendar3.set(12, b4Var.getValue());
                if (g10) {
                    calendar3.set(13, 0);
                    calendar3.set(14, 0);
                }
                int timeInMillis = (int) (calendar3.getTimeInMillis() / 1000);
                p41 p41Var = (p41) nl0Var.b;
                ((boolean[]) nl0Var.c)[0] = true;
                p41Var.e(Integer.valueOf(timeInMillis));
                runnable3 = z2Var3.a.dismissRunnable;
                runnable3.run();
                break;
            case 3:
                fc0 fc0Var6 = (fc0) this.b;
                s3 s3Var = (s3) this.e;
                u3 u3Var = (u3) this.f;
                Calendar calendar4 = (Calendar) this.c;
                x4 x4Var = (x4) this.h;
                z2 z2Var4 = (z2) this.d;
                boolean g11 = y4.g(null, null, 0L, 0L, 0, fc0Var6, s3Var, u3Var);
                calendar4.setTimeInMillis(System.currentTimeMillis());
                calendar4.add(6, fc0Var6.getValue());
                calendar4.set(11, s3Var.getValue());
                calendar4.set(12, u3Var.getValue());
                if (g11) {
                    calendar4.set(13, 0);
                    calendar4.set(14, 0);
                }
                x4Var.I((int) (calendar4.getTimeInMillis() / 1000), 0, true);
                runnable4 = z2Var4.a.dismissRunnable;
                runnable4.run();
                break;
            case 4:
                ex0.y((ex0) this.c, (int[]) this.b, (EditTextBoldCursor) this.e, (TextView) this.f, (TextView) this.h, (AlertDialog$Builder) this.d);
                break;
            default:
                e3 e3Var = (e3) this.c;
                FrameLayout frameLayout = (FrameLayout) this.b;
                ArrayList arrayList = (ArrayList) this.e;
                int[] iArr = (int[]) this.f;
                y8 y8Var = (y8) this.h;
                n9 n9Var = (n9) this.d;
                b70 F = b70.F(e3Var.container, e3Var.getResourcesProvider(), frameLayout);
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    int i11 = i10 + 1;
                    int intValue = ((Integer) arrayList.get(i10)).intValue();
                    TLRPC.User currentUser = UserConfig.getInstance(intValue).getCurrentUser();
                    if (currentUser != null) {
                        F.e(intValue, iArr[0] == intValue, new gh.e1(iArr, intValue, y8Var, currentUser, n9Var, 25));
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

    public /* synthetic */ f(fc0 fc0Var, fc0 fc0Var2, fc0 fc0Var3, Calendar calendar, Object obj, z2 z2Var, int i10) {
        this.a = i10;
        this.b = fc0Var;
        this.e = fc0Var2;
        this.f = fc0Var3;
        this.c = calendar;
        this.h = obj;
        this.d = z2Var;
    }
}
