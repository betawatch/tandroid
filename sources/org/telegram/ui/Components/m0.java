package org.telegram.ui.Components;

import android.view.KeyEvent;
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

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class m0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ KeyEvent.Callback b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;

    public /* synthetic */ m0(KeyEvent.Callback callback, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i10) {
        this.a = i10;
        this.b = callback;
        this.e = obj;
        this.f = obj2;
        this.c = obj3;
        this.h = obj4;
        this.d = obj5;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Runnable runnable;
        Runnable runnable2;
        Runnable runnable3;
        Runnable runnable4;
        switch (this.a) {
            case 0:
                uc0 uc0Var = (uc0) this.b;
                uc0 uc0Var2 = (uc0) this.e;
                uc0 uc0Var3 = (uc0) this.f;
                Calendar calendar = (Calendar) this.c;
                MessagesStorage.IntCallback intCallback = (MessagesStorage.IntCallback) this.h;
                org.telegram.ui.ActionBar.b3 b3Var = (org.telegram.ui.ActionBar.b3) this.d;
                c5.b(uc0Var, uc0Var2, uc0Var3);
                calendar.set(1, uc0Var3.getValue());
                calendar.set(2, uc0Var2.getValue());
                calendar.set(5, uc0Var.getValue());
                calendar.set(12, 0);
                calendar.set(11, 0);
                calendar.set(13, 0);
                intCallback.run((int) (calendar.getTimeInMillis() / 1000));
                runnable = b3Var.a.dismissRunnable;
                runnable.run();
                break;
            case 1:
                uc0 uc0Var4 = (uc0) this.b;
                e4 e4Var = (e4) this.e;
                f4 f4Var = (f4) this.f;
                Calendar calendar2 = (Calendar) this.c;
                org.telegram.ui.tv0 tv0Var = (org.telegram.ui.tv0) this.h;
                org.telegram.ui.ActionBar.b3 b3Var2 = (org.telegram.ui.ActionBar.b3) this.d;
                boolean g10 = c5.g(null, null, 0L, 0L, 0, uc0Var4, e4Var, f4Var);
                calendar2.setTimeInMillis(System.currentTimeMillis());
                calendar2.add(6, uc0Var4.getValue());
                calendar2.set(11, e4Var.getValue());
                calendar2.set(12, f4Var.getValue());
                if (g10) {
                    calendar2.set(13, 0);
                    calendar2.set(14, 0);
                }
                int timeInMillis = (int) (calendar2.getTimeInMillis() / 1000);
                org.telegram.ui.x51 x51Var = (org.telegram.ui.x51) tv0Var.b;
                ((boolean[]) tv0Var.c)[0] = true;
                x51Var.e(Integer.valueOf(timeInMillis));
                runnable2 = b3Var2.a.dismissRunnable;
                runnable2.run();
                break;
            case 2:
                uc0 uc0Var5 = (uc0) this.b;
                v3 v3Var = (v3) this.e;
                x3 x3Var = (x3) this.f;
                Calendar calendar3 = (Calendar) this.c;
                b5 b5Var = (b5) this.h;
                org.telegram.ui.ActionBar.b3 b3Var3 = (org.telegram.ui.ActionBar.b3) this.d;
                boolean g11 = c5.g(null, null, 0L, 0L, 0, uc0Var5, v3Var, x3Var);
                calendar3.setTimeInMillis(System.currentTimeMillis());
                calendar3.add(6, uc0Var5.getValue());
                calendar3.set(11, v3Var.getValue());
                calendar3.set(12, x3Var.getValue());
                if (g11) {
                    calendar3.set(13, 0);
                    calendar3.set(14, 0);
                }
                b5Var.J((int) (calendar3.getTimeInMillis() / 1000), 0, true);
                runnable3 = b3Var3.a.dismissRunnable;
                runnable3.run();
                break;
            case 3:
                wx0.x((wx0) this.b, (int[]) this.e, (EditTextBoldCursor) this.f, (TextView) this.c, (TextView) this.h, (AlertDialog$Builder) this.d);
                break;
            case 4:
                org.telegram.ui.ActionBar.g3 g3Var = (org.telegram.ui.ActionBar.g3) this.b;
                FrameLayout frameLayout = (FrameLayout) this.e;
                ArrayList arrayList = (ArrayList) this.f;
                int[] iArr = (int[]) this.c;
                f9 f9Var = (f9) this.h;
                u9 u9Var = (u9) this.d;
                n70 F = n70.F(g3Var.container, g3Var.getResourcesProvider(), frameLayout);
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    int i11 = i10 + 1;
                    int intValue = ((Integer) arrayList.get(i10)).intValue();
                    TLRPC.User currentUser = UserConfig.getInstance(intValue).getCurrentUser();
                    if (currentUser != null) {
                        F.e(intValue, iArr[0] == intValue, new ei.l3(iArr, intValue, f9Var, currentUser, u9Var));
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
            default:
                Calendar calendar4 = (Calendar) this.c;
                uc0 uc0Var6 = (uc0) this.b;
                tg.i iVar = (tg.i) this.e;
                tg.j jVar = (tg.j) this.f;
                tg.v vVar = (tg.v) this.h;
                org.telegram.ui.ActionBar.b3 b3Var4 = (org.telegram.ui.ActionBar.b3) this.d;
                calendar4.setTimeInMillis((uc0Var6.getValue() * 86400000) + System.currentTimeMillis());
                calendar4.set(11, iVar.getValue());
                calendar4.set(12, jVar.getValue() * 5);
                vVar.J((int) (calendar4.getTimeInMillis() / 1000), 0, true);
                runnable4 = b3Var4.a.dismissRunnable;
                runnable4.run();
                break;
        }
    }

    public /* synthetic */ m0(Calendar calendar, uc0 uc0Var, tg.i iVar, tg.j jVar, tg.v vVar, org.telegram.ui.ActionBar.b3 b3Var) {
        this.a = 5;
        this.c = calendar;
        this.b = uc0Var;
        this.e = iVar;
        this.f = jVar;
        this.h = vVar;
        this.d = b3Var;
    }
}
