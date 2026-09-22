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

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
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
                fd0 fd0Var = (fd0) this.b;
                fd0 fd0Var2 = (fd0) this.e;
                fd0 fd0Var3 = (fd0) this.f;
                Calendar calendar = (Calendar) this.c;
                MessagesStorage.IntCallback intCallback = (MessagesStorage.IntCallback) this.h;
                org.telegram.ui.ActionBar.a3 a3Var = (org.telegram.ui.ActionBar.a3) this.d;
                d5.b(fd0Var, fd0Var2, fd0Var3);
                calendar.set(1, fd0Var3.getValue());
                calendar.set(2, fd0Var2.getValue());
                calendar.set(5, fd0Var.getValue());
                calendar.set(12, 0);
                calendar.set(11, 0);
                calendar.set(13, 0);
                intCallback.run((int) (calendar.getTimeInMillis() / 1000));
                runnable = a3Var.a.dismissRunnable;
                runnable.run();
                break;
            case 1:
                fd0 fd0Var4 = (fd0) this.b;
                f4 f4Var = (f4) this.e;
                g4 g4Var = (g4) this.f;
                Calendar calendar2 = (Calendar) this.c;
                org.telegram.ui.rv0 rv0Var = (org.telegram.ui.rv0) this.h;
                org.telegram.ui.ActionBar.a3 a3Var2 = (org.telegram.ui.ActionBar.a3) this.d;
                boolean g10 = d5.g(null, null, 0L, 0L, 0, fd0Var4, f4Var, g4Var);
                calendar2.setTimeInMillis(System.currentTimeMillis());
                calendar2.add(6, fd0Var4.getValue());
                calendar2.set(11, f4Var.getValue());
                calendar2.set(12, g4Var.getValue());
                if (g10) {
                    calendar2.set(13, 0);
                    calendar2.set(14, 0);
                }
                int timeInMillis = (int) (calendar2.getTimeInMillis() / 1000);
                org.telegram.ui.y51 y51Var = (org.telegram.ui.y51) rv0Var.b;
                ((boolean[]) rv0Var.c)[0] = true;
                y51Var.e(Integer.valueOf(timeInMillis));
                runnable2 = a3Var2.a.dismissRunnable;
                runnable2.run();
                break;
            case 2:
                fd0 fd0Var5 = (fd0) this.b;
                w3 w3Var = (w3) this.e;
                y3 y3Var = (y3) this.f;
                Calendar calendar3 = (Calendar) this.c;
                c5 c5Var = (c5) this.h;
                org.telegram.ui.ActionBar.a3 a3Var3 = (org.telegram.ui.ActionBar.a3) this.d;
                boolean g11 = d5.g(null, null, 0L, 0L, 0, fd0Var5, w3Var, y3Var);
                calendar3.setTimeInMillis(System.currentTimeMillis());
                calendar3.add(6, fd0Var5.getValue());
                calendar3.set(11, w3Var.getValue());
                calendar3.set(12, y3Var.getValue());
                if (g11) {
                    calendar3.set(13, 0);
                    calendar3.set(14, 0);
                }
                c5Var.J((int) (calendar3.getTimeInMillis() / 1000), 0, true);
                runnable3 = a3Var3.a.dismissRunnable;
                runnable3.run();
                break;
            case 3:
                iy0.x((iy0) this.b, (int[]) this.e, (EditTextBoldCursor) this.f, (TextView) this.c, (TextView) this.h, (AlertDialog$Builder) this.d);
                break;
            case 4:
                org.telegram.ui.ActionBar.f3 f3Var = (org.telegram.ui.ActionBar.f3) this.b;
                FrameLayout frameLayout = (FrameLayout) this.e;
                ArrayList arrayList = (ArrayList) this.f;
                int[] iArr = (int[]) this.c;
                g9 g9Var = (g9) this.h;
                v9 v9Var = (v9) this.d;
                y70 F = y70.F(f3Var.container, f3Var.getResourcesProvider(), frameLayout);
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    int i11 = i10 + 1;
                    int intValue = ((Integer) arrayList.get(i10)).intValue();
                    TLRPC.User currentUser = UserConfig.getInstance(intValue).getCurrentUser();
                    if (currentUser != null) {
                        F.e(intValue, iArr[0] == intValue, new ei.l3(iArr, intValue, g9Var, currentUser, v9Var));
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
                fd0 fd0Var6 = (fd0) this.b;
                tg.g gVar = (tg.g) this.e;
                tg.h hVar = (tg.h) this.f;
                tg.u uVar = (tg.u) this.h;
                org.telegram.ui.ActionBar.a3 a3Var4 = (org.telegram.ui.ActionBar.a3) this.d;
                calendar4.setTimeInMillis((fd0Var6.getValue() * 86400000) + System.currentTimeMillis());
                calendar4.set(11, gVar.getValue());
                calendar4.set(12, hVar.getValue() * 5);
                uVar.J((int) (calendar4.getTimeInMillis() / 1000), 0, true);
                runnable4 = a3Var4.a.dismissRunnable;
                runnable4.run();
                break;
        }
    }

    public /* synthetic */ m0(Calendar calendar, fd0 fd0Var, tg.g gVar, tg.h hVar, tg.u uVar, org.telegram.ui.ActionBar.a3 a3Var) {
        this.a = 5;
        this.c = calendar;
        this.b = fd0Var;
        this.e = gVar;
        this.f = hVar;
        this.h = uVar;
        this.d = a3Var;
    }
}
