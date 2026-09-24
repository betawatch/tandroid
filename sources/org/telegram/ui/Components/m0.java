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

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
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
                ed0 ed0Var = (ed0) this.b;
                ed0 ed0Var2 = (ed0) this.e;
                ed0 ed0Var3 = (ed0) this.f;
                Calendar calendar = (Calendar) this.c;
                MessagesStorage.IntCallback intCallback = (MessagesStorage.IntCallback) this.h;
                org.telegram.ui.ActionBar.z2 z2Var = (org.telegram.ui.ActionBar.z2) this.d;
                e5.b(ed0Var, ed0Var2, ed0Var3);
                calendar.set(1, ed0Var3.getValue());
                calendar.set(2, ed0Var2.getValue());
                calendar.set(5, ed0Var.getValue());
                calendar.set(12, 0);
                calendar.set(11, 0);
                calendar.set(13, 0);
                intCallback.run((int) (calendar.getTimeInMillis() / 1000));
                runnable = z2Var.a.dismissRunnable;
                runnable.run();
                break;
            case 1:
                ed0 ed0Var4 = (ed0) this.b;
                g4 g4Var = (g4) this.e;
                h4 h4Var = (h4) this.f;
                Calendar calendar2 = (Calendar) this.c;
                org.telegram.ui.ds0 ds0Var = (org.telegram.ui.ds0) this.h;
                org.telegram.ui.ActionBar.z2 z2Var2 = (org.telegram.ui.ActionBar.z2) this.d;
                boolean g10 = e5.g(null, null, 0L, 0L, 0, ed0Var4, g4Var, h4Var);
                calendar2.setTimeInMillis(System.currentTimeMillis());
                calendar2.add(6, ed0Var4.getValue());
                calendar2.set(11, g4Var.getValue());
                calendar2.set(12, h4Var.getValue());
                if (g10) {
                    calendar2.set(13, 0);
                    calendar2.set(14, 0);
                }
                int timeInMillis = (int) (calendar2.getTimeInMillis() / 1000);
                org.telegram.ui.p51 p51Var = (org.telegram.ui.p51) ds0Var.b;
                ((boolean[]) ds0Var.c)[0] = true;
                p51Var.e(Integer.valueOf(timeInMillis));
                runnable2 = z2Var2.a.dismissRunnable;
                runnable2.run();
                break;
            case 2:
                ed0 ed0Var5 = (ed0) this.b;
                x3 x3Var = (x3) this.e;
                z3 z3Var = (z3) this.f;
                Calendar calendar3 = (Calendar) this.c;
                d5 d5Var = (d5) this.h;
                org.telegram.ui.ActionBar.z2 z2Var3 = (org.telegram.ui.ActionBar.z2) this.d;
                boolean g11 = e5.g(null, null, 0L, 0L, 0, ed0Var5, x3Var, z3Var);
                calendar3.setTimeInMillis(System.currentTimeMillis());
                calendar3.add(6, ed0Var5.getValue());
                calendar3.set(11, x3Var.getValue());
                calendar3.set(12, z3Var.getValue());
                if (g11) {
                    calendar3.set(13, 0);
                    calendar3.set(14, 0);
                }
                d5Var.J((int) (calendar3.getTimeInMillis() / 1000), 0, true);
                runnable3 = z2Var3.a.dismissRunnable;
                runnable3.run();
                break;
            case 3:
                fy0.x((fy0) this.b, (int[]) this.e, (EditTextBoldCursor) this.f, (TextView) this.c, (TextView) this.h, (AlertDialog$Builder) this.d);
                break;
            case 4:
                org.telegram.ui.ActionBar.e3 e3Var = (org.telegram.ui.ActionBar.e3) this.b;
                FrameLayout frameLayout = (FrameLayout) this.e;
                ArrayList arrayList = (ArrayList) this.f;
                int[] iArr = (int[]) this.c;
                h9 h9Var = (h9) this.h;
                w9 w9Var = (w9) this.d;
                y70 F = y70.F(e3Var.container, e3Var.getResourcesProvider(), frameLayout);
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    int i11 = i10 + 1;
                    int intValue = ((Integer) arrayList.get(i10)).intValue();
                    TLRPC.User currentUser = UserConfig.getInstance(intValue).getCurrentUser();
                    if (currentUser != null) {
                        F.e(intValue, iArr[0] == intValue, new ei.l3(iArr, intValue, h9Var, currentUser, w9Var));
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
                ed0 ed0Var6 = (ed0) this.b;
                tg.g gVar = (tg.g) this.e;
                tg.h hVar = (tg.h) this.f;
                tg.u uVar = (tg.u) this.h;
                org.telegram.ui.ActionBar.z2 z2Var4 = (org.telegram.ui.ActionBar.z2) this.d;
                calendar4.setTimeInMillis((ed0Var6.getValue() * 86400000) + System.currentTimeMillis());
                calendar4.set(11, gVar.getValue());
                calendar4.set(12, hVar.getValue() * 5);
                uVar.J((int) (calendar4.getTimeInMillis() / 1000), 0, true);
                runnable4 = z2Var4.a.dismissRunnable;
                runnable4.run();
                break;
        }
    }

    public /* synthetic */ m0(Calendar calendar, ed0 ed0Var, tg.g gVar, tg.h hVar, tg.u uVar, org.telegram.ui.ActionBar.z2 z2Var) {
        this.a = 5;
        this.c = calendar;
        this.b = ed0Var;
        this.e = gVar;
        this.f = hVar;
        this.h = uVar;
        this.d = z2Var;
    }
}
