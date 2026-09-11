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

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final /* synthetic */ class n0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ KeyEvent.Callback b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;

    public /* synthetic */ n0(KeyEvent.Callback callback, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i10) {
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
                vc0 vc0Var = (vc0) this.b;
                vc0 vc0Var2 = (vc0) this.e;
                vc0 vc0Var3 = (vc0) this.f;
                Calendar calendar = (Calendar) this.c;
                MessagesStorage.IntCallback intCallback = (MessagesStorage.IntCallback) this.h;
                org.telegram.ui.ActionBar.a3 a3Var = (org.telegram.ui.ActionBar.a3) this.d;
                e5.b(vc0Var, vc0Var2, vc0Var3);
                calendar.set(1, vc0Var3.getValue());
                calendar.set(2, vc0Var2.getValue());
                calendar.set(5, vc0Var.getValue());
                calendar.set(12, 0);
                calendar.set(11, 0);
                calendar.set(13, 0);
                intCallback.run((int) (calendar.getTimeInMillis() / 1000));
                runnable = a3Var.a.dismissRunnable;
                runnable.run();
                break;
            case 1:
                vc0 vc0Var4 = (vc0) this.b;
                g4 g4Var = (g4) this.e;
                h4 h4Var = (h4) this.f;
                Calendar calendar2 = (Calendar) this.c;
                org.telegram.ui.qv0 qv0Var = (org.telegram.ui.qv0) this.h;
                org.telegram.ui.ActionBar.a3 a3Var2 = (org.telegram.ui.ActionBar.a3) this.d;
                boolean g10 = e5.g(null, null, 0L, 0L, 0, vc0Var4, g4Var, h4Var);
                calendar2.setTimeInMillis(System.currentTimeMillis());
                calendar2.add(6, vc0Var4.getValue());
                calendar2.set(11, g4Var.getValue());
                calendar2.set(12, h4Var.getValue());
                if (g10) {
                    calendar2.set(13, 0);
                    calendar2.set(14, 0);
                }
                int timeInMillis = (int) (calendar2.getTimeInMillis() / 1000);
                org.telegram.ui.y51 y51Var = (org.telegram.ui.y51) qv0Var.b;
                ((boolean[]) qv0Var.c)[0] = true;
                y51Var.e(Integer.valueOf(timeInMillis));
                runnable2 = a3Var2.a.dismissRunnable;
                runnable2.run();
                break;
            case 2:
                vc0 vc0Var5 = (vc0) this.b;
                x3 x3Var = (x3) this.e;
                z3 z3Var = (z3) this.f;
                Calendar calendar3 = (Calendar) this.c;
                d5 d5Var = (d5) this.h;
                org.telegram.ui.ActionBar.a3 a3Var3 = (org.telegram.ui.ActionBar.a3) this.d;
                boolean g11 = e5.g(null, null, 0L, 0L, 0, vc0Var5, x3Var, z3Var);
                calendar3.setTimeInMillis(System.currentTimeMillis());
                calendar3.add(6, vc0Var5.getValue());
                calendar3.set(11, x3Var.getValue());
                calendar3.set(12, z3Var.getValue());
                if (g11) {
                    calendar3.set(13, 0);
                    calendar3.set(14, 0);
                }
                d5Var.J((int) (calendar3.getTimeInMillis() / 1000), 0, true);
                runnable3 = a3Var3.a.dismissRunnable;
                runnable3.run();
                break;
            case 3:
                ux0.x((ux0) this.b, (int[]) this.e, (EditTextBoldCursor) this.f, (TextView) this.c, (TextView) this.h, (AlertDialog$Builder) this.d);
                break;
            case 4:
                org.telegram.ui.ActionBar.f3 f3Var = (org.telegram.ui.ActionBar.f3) this.b;
                FrameLayout frameLayout = (FrameLayout) this.e;
                ArrayList arrayList = (ArrayList) this.f;
                int[] iArr = (int[]) this.c;
                i9 i9Var = (i9) this.h;
                x9 x9Var = (x9) this.d;
                n70 F = n70.F(f3Var.container, f3Var.getResourcesProvider(), frameLayout);
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    int i11 = i10 + 1;
                    int intValue = ((Integer) arrayList.get(i10)).intValue();
                    TLRPC.User currentUser = UserConfig.getInstance(intValue).getCurrentUser();
                    if (currentUser != null) {
                        F.e(intValue, iArr[0] == intValue, new fi.l3(iArr, intValue, i9Var, currentUser, x9Var));
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
                vc0 vc0Var6 = (vc0) this.b;
                ug.h hVar = (ug.h) this.e;
                ug.i iVar = (ug.i) this.f;
                ug.v vVar = (ug.v) this.h;
                org.telegram.ui.ActionBar.a3 a3Var4 = (org.telegram.ui.ActionBar.a3) this.d;
                calendar4.setTimeInMillis((vc0Var6.getValue() * 86400000) + System.currentTimeMillis());
                calendar4.set(11, hVar.getValue());
                calendar4.set(12, iVar.getValue() * 5);
                vVar.J((int) (calendar4.getTimeInMillis() / 1000), 0, true);
                runnable4 = a3Var4.a.dismissRunnable;
                runnable4.run();
                break;
        }
    }

    public /* synthetic */ n0(Calendar calendar, vc0 vc0Var, ug.h hVar, ug.i iVar, ug.v vVar, org.telegram.ui.ActionBar.a3 a3Var) {
        this.a = 5;
        this.c = calendar;
        this.b = vc0Var;
        this.e = hVar;
        this.f = iVar;
        this.h = vVar;
        this.d = a3Var;
    }
}
