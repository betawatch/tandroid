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
import org.telegram.ui.di1;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
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
                qd0 qd0Var = (qd0) this.b;
                qd0 qd0Var2 = (qd0) this.e;
                qd0 qd0Var3 = (qd0) this.f;
                Calendar calendar = (Calendar) this.c;
                MessagesStorage.IntCallback intCallback = (MessagesStorage.IntCallback) this.h;
                org.telegram.ui.ActionBar.b3 b3Var = (org.telegram.ui.ActionBar.b3) this.d;
                f5.b(qd0Var, qd0Var2, qd0Var3);
                calendar.set(1, qd0Var3.getValue());
                calendar.set(2, qd0Var2.getValue());
                calendar.set(5, qd0Var.getValue());
                calendar.set(12, 0);
                calendar.set(11, 0);
                calendar.set(13, 0);
                intCallback.run((int) (calendar.getTimeInMillis() / 1000));
                runnable = b3Var.a.dismissRunnable;
                runnable.run();
                break;
            case 1:
                qd0 qd0Var4 = (qd0) this.b;
                g4 g4Var = (g4) this.e;
                h4 h4Var = (h4) this.f;
                Calendar calendar2 = (Calendar) this.c;
                org.telegram.ui.ql0 ql0Var = (org.telegram.ui.ql0) this.h;
                org.telegram.ui.ActionBar.b3 b3Var2 = (org.telegram.ui.ActionBar.b3) this.d;
                boolean g10 = f5.g(null, null, 0L, 0L, 0, qd0Var4, g4Var, h4Var);
                calendar2.setTimeInMillis(System.currentTimeMillis());
                calendar2.add(6, qd0Var4.getValue());
                calendar2.set(11, g4Var.getValue());
                calendar2.set(12, h4Var.getValue());
                if (g10) {
                    calendar2.set(13, 0);
                    calendar2.set(14, 0);
                }
                int timeInMillis = (int) (calendar2.getTimeInMillis() / 1000);
                org.telegram.ui.q41 q41Var = (org.telegram.ui.q41) ql0Var.b;
                ((boolean[]) ql0Var.c)[0] = true;
                q41Var.e(Integer.valueOf(timeInMillis));
                runnable2 = b3Var2.a.dismissRunnable;
                runnable2.run();
                break;
            case 2:
                qd0 qd0Var5 = (qd0) this.b;
                x3 x3Var = (x3) this.e;
                z3 z3Var = (z3) this.f;
                Calendar calendar3 = (Calendar) this.c;
                d5 d5Var = (d5) this.h;
                org.telegram.ui.ActionBar.b3 b3Var3 = (org.telegram.ui.ActionBar.b3) this.d;
                boolean g11 = f5.g(null, null, 0L, 0L, 0, qd0Var5, x3Var, z3Var);
                calendar3.setTimeInMillis(System.currentTimeMillis());
                calendar3.add(6, qd0Var5.getValue());
                calendar3.set(11, x3Var.getValue());
                calendar3.set(12, z3Var.getValue());
                if (g11) {
                    calendar3.set(13, 0);
                    calendar3.set(14, 0);
                }
                d5Var.C((int) (calendar3.getTimeInMillis() / 1000), 0, true);
                runnable3 = b3Var3.a.dismissRunnable;
                runnable3.run();
                break;
            case 3:
                ty0.A((ty0) this.b, (int[]) this.e, (EditTextBoldCursor) this.f, (TextView) this.c, (TextView) this.h, (AlertDialog$Builder) this.d);
                break;
            case 4:
                org.telegram.ui.ActionBar.h3 h3Var = (org.telegram.ui.ActionBar.h3) this.b;
                FrameLayout frameLayout = (FrameLayout) this.e;
                ArrayList arrayList = (ArrayList) this.f;
                int[] iArr = (int[]) this.c;
                h9 h9Var = (h9) this.h;
                w9 w9Var = (w9) this.d;
                j80 F = j80.F(h3Var.container, h3Var.getResourcesProvider(), frameLayout);
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    int i11 = i10 + 1;
                    int intValue = ((Integer) arrayList.get(i10)).intValue();
                    TLRPC.User currentUser = UserConfig.getInstance(intValue).getCurrentUser();
                    if (currentUser != null) {
                        F.e(intValue, iArr[0] == intValue, new di1(iArr, intValue, h9Var, currentUser, w9Var, 0));
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
                qd0 qd0Var6 = (qd0) this.b;
                ug.f fVar = (ug.f) this.e;
                ug.g gVar = (ug.g) this.f;
                ug.s sVar = (ug.s) this.h;
                org.telegram.ui.ActionBar.b3 b3Var4 = (org.telegram.ui.ActionBar.b3) this.d;
                calendar4.setTimeInMillis((qd0Var6.getValue() * 86400000) + System.currentTimeMillis());
                calendar4.set(11, fVar.getValue());
                calendar4.set(12, gVar.getValue() * 5);
                sVar.C((int) (calendar4.getTimeInMillis() / 1000), 0, true);
                runnable4 = b3Var4.a.dismissRunnable;
                runnable4.run();
                break;
        }
    }

    public /* synthetic */ m0(Calendar calendar, qd0 qd0Var, ug.f fVar, ug.g gVar, ug.s sVar, org.telegram.ui.ActionBar.b3 b3Var) {
        this.a = 5;
        this.c = calendar;
        this.b = qd0Var;
        this.e = fVar;
        this.f = gVar;
        this.h = sVar;
        this.d = b3Var;
    }
}
