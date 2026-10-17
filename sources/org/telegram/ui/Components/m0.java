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
import org.telegram.ui.yh1;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
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
                od0 od0Var = (od0) this.b;
                od0 od0Var2 = (od0) this.e;
                od0 od0Var3 = (od0) this.f;
                Calendar calendar = (Calendar) this.c;
                MessagesStorage.IntCallback intCallback = (MessagesStorage.IntCallback) this.h;
                org.telegram.ui.ActionBar.a3 a3Var = (org.telegram.ui.ActionBar.a3) this.d;
                f5.a(od0Var, od0Var2, od0Var3);
                calendar.set(1, od0Var3.getValue());
                calendar.set(2, od0Var2.getValue());
                calendar.set(5, od0Var.getValue());
                calendar.set(12, 0);
                calendar.set(11, 0);
                calendar.set(13, 0);
                intCallback.run((int) (calendar.getTimeInMillis() / 1000));
                runnable = a3Var.a.dismissRunnable;
                runnable.run();
                break;
            case 1:
                od0 od0Var4 = (od0) this.b;
                h4 h4Var = (h4) this.e;
                i4 i4Var = (i4) this.f;
                Calendar calendar2 = (Calendar) this.c;
                org.telegram.ui.fr0 fr0Var = (org.telegram.ui.fr0) this.h;
                org.telegram.ui.ActionBar.a3 a3Var2 = (org.telegram.ui.ActionBar.a3) this.d;
                boolean f7 = f5.f(null, null, 0L, 0L, 0, od0Var4, h4Var, i4Var);
                calendar2.setTimeInMillis(System.currentTimeMillis());
                calendar2.add(6, od0Var4.getValue());
                calendar2.set(11, h4Var.getValue());
                calendar2.set(12, i4Var.getValue());
                if (f7) {
                    calendar2.set(13, 0);
                    calendar2.set(14, 0);
                }
                int timeInMillis = (int) (calendar2.getTimeInMillis() / 1000);
                org.telegram.ui.o41 o41Var = (org.telegram.ui.o41) fr0Var.b;
                ((boolean[]) fr0Var.c)[0] = true;
                o41Var.e(Integer.valueOf(timeInMillis));
                runnable2 = a3Var2.a.dismissRunnable;
                runnable2.run();
                break;
            case 2:
                od0 od0Var5 = (od0) this.b;
                y3 y3Var = (y3) this.e;
                a4 a4Var = (a4) this.f;
                Calendar calendar3 = (Calendar) this.c;
                e5 e5Var = (e5) this.h;
                org.telegram.ui.ActionBar.a3 a3Var3 = (org.telegram.ui.ActionBar.a3) this.d;
                boolean f10 = f5.f(null, null, 0L, 0L, 0, od0Var5, y3Var, a4Var);
                calendar3.setTimeInMillis(System.currentTimeMillis());
                calendar3.add(6, od0Var5.getValue());
                calendar3.set(11, y3Var.getValue());
                calendar3.set(12, a4Var.getValue());
                if (f10) {
                    calendar3.set(13, 0);
                    calendar3.set(14, 0);
                }
                e5Var.C((int) (calendar3.getTimeInMillis() / 1000), 0, true);
                runnable3 = a3Var3.a.dismissRunnable;
                runnable3.run();
                break;
            case 3:
                oy0.z((oy0) this.b, (int[]) this.e, (EditTextBoldCursor) this.f, (TextView) this.c, (TextView) this.h, (AlertDialog$Builder) this.d);
                break;
            case 4:
                org.telegram.ui.ActionBar.f3 f3Var = (org.telegram.ui.ActionBar.f3) this.b;
                FrameLayout frameLayout = (FrameLayout) this.e;
                ArrayList arrayList = (ArrayList) this.f;
                int[] iArr = (int[]) this.c;
                h9 h9Var = (h9) this.h;
                w9 w9Var = (w9) this.d;
                i80 F = i80.F(f3Var.container, f3Var.getResourcesProvider(), frameLayout);
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    int i11 = i10 + 1;
                    int intValue = ((Integer) arrayList.get(i10)).intValue();
                    TLRPC.User currentUser = UserConfig.getInstance(intValue).getCurrentUser();
                    if (currentUser != null) {
                        F.e(intValue, iArr[0] == intValue, new yh1(iArr, intValue, h9Var, currentUser, w9Var, 0));
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
                od0 od0Var6 = (od0) this.b;
                ug.f fVar = (ug.f) this.e;
                ug.g gVar = (ug.g) this.f;
                ug.s sVar = (ug.s) this.h;
                org.telegram.ui.ActionBar.a3 a3Var4 = (org.telegram.ui.ActionBar.a3) this.d;
                calendar4.setTimeInMillis((od0Var6.getValue() * 86400000) + System.currentTimeMillis());
                calendar4.set(11, fVar.getValue());
                calendar4.set(12, gVar.getValue() * 5);
                sVar.C((int) (calendar4.getTimeInMillis() / 1000), 0, true);
                runnable4 = a3Var4.a.dismissRunnable;
                runnable4.run();
                break;
        }
    }

    public /* synthetic */ m0(Calendar calendar, od0 od0Var, ug.f fVar, ug.g gVar, ug.s sVar, org.telegram.ui.ActionBar.a3 a3Var) {
        this.a = 5;
        this.c = calendar;
        this.b = od0Var;
        this.e = fVar;
        this.f = gVar;
        this.h = sVar;
        this.d = a3Var;
    }
}
