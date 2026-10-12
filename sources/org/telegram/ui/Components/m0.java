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

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
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
                ud0 ud0Var = (ud0) this.b;
                ud0 ud0Var2 = (ud0) this.e;
                ud0 ud0Var3 = (ud0) this.f;
                Calendar calendar = (Calendar) this.c;
                MessagesStorage.IntCallback intCallback = (MessagesStorage.IntCallback) this.h;
                org.telegram.ui.ActionBar.z2 z2Var = (org.telegram.ui.ActionBar.z2) this.d;
                g5.a(ud0Var, ud0Var2, ud0Var3);
                calendar.set(1, ud0Var3.getValue());
                calendar.set(2, ud0Var2.getValue());
                calendar.set(5, ud0Var.getValue());
                calendar.set(12, 0);
                calendar.set(11, 0);
                calendar.set(13, 0);
                intCallback.run((int) (calendar.getTimeInMillis() / 1000));
                runnable = z2Var.a.dismissRunnable;
                runnable.run();
                break;
            case 1:
                ud0 ud0Var4 = (ud0) this.b;
                i4 i4Var = (i4) this.e;
                j4 j4Var = (j4) this.f;
                Calendar calendar2 = (Calendar) this.c;
                org.telegram.ui.cs0 cs0Var = (org.telegram.ui.cs0) this.h;
                org.telegram.ui.ActionBar.z2 z2Var2 = (org.telegram.ui.ActionBar.z2) this.d;
                boolean f7 = g5.f(null, null, 0L, 0L, 0, ud0Var4, i4Var, j4Var);
                calendar2.setTimeInMillis(System.currentTimeMillis());
                calendar2.add(6, ud0Var4.getValue());
                calendar2.set(11, i4Var.getValue());
                calendar2.set(12, j4Var.getValue());
                if (f7) {
                    calendar2.set(13, 0);
                    calendar2.set(14, 0);
                }
                int timeInMillis = (int) (calendar2.getTimeInMillis() / 1000);
                org.telegram.ui.g61 g61Var = (org.telegram.ui.g61) cs0Var.b;
                ((boolean[]) cs0Var.c)[0] = true;
                g61Var.e(Integer.valueOf(timeInMillis));
                runnable2 = z2Var2.a.dismissRunnable;
                runnable2.run();
                break;
            case 2:
                ud0 ud0Var5 = (ud0) this.b;
                z3 z3Var = (z3) this.e;
                b4 b4Var = (b4) this.f;
                Calendar calendar3 = (Calendar) this.c;
                f5 f5Var = (f5) this.h;
                org.telegram.ui.ActionBar.z2 z2Var3 = (org.telegram.ui.ActionBar.z2) this.d;
                boolean f10 = g5.f(null, null, 0L, 0L, 0, ud0Var5, z3Var, b4Var);
                calendar3.setTimeInMillis(System.currentTimeMillis());
                calendar3.add(6, ud0Var5.getValue());
                calendar3.set(11, z3Var.getValue());
                calendar3.set(12, b4Var.getValue());
                if (f10) {
                    calendar3.set(13, 0);
                    calendar3.set(14, 0);
                }
                f5Var.J((int) (calendar3.getTimeInMillis() / 1000), 0, true);
                runnable3 = z2Var3.a.dismissRunnable;
                runnable3.run();
                break;
            case 3:
                ty0.z((ty0) this.b, (int[]) this.e, (EditTextBoldCursor) this.f, (TextView) this.c, (TextView) this.h, (AlertDialog$Builder) this.d);
                break;
            case 4:
                org.telegram.ui.ActionBar.e3 e3Var = (org.telegram.ui.ActionBar.e3) this.b;
                FrameLayout frameLayout = (FrameLayout) this.e;
                ArrayList arrayList = (ArrayList) this.f;
                int[] iArr = (int[]) this.c;
                k9 k9Var = (k9) this.h;
                z9 z9Var = (z9) this.d;
                m80 F = m80.F(e3Var.container, e3Var.getResourcesProvider(), frameLayout);
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    int i11 = i10 + 1;
                    int intValue = ((Integer) arrayList.get(i10)).intValue();
                    TLRPC.User currentUser = UserConfig.getInstance(intValue).getCurrentUser();
                    if (currentUser != null) {
                        F.e(intValue, iArr[0] == intValue, new fi.l3(iArr, intValue, k9Var, currentUser, z9Var));
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
                ud0 ud0Var6 = (ud0) this.b;
                ug.h hVar = (ug.h) this.e;
                ug.i iVar = (ug.i) this.f;
                ug.u uVar = (ug.u) this.h;
                org.telegram.ui.ActionBar.z2 z2Var4 = (org.telegram.ui.ActionBar.z2) this.d;
                calendar4.setTimeInMillis((ud0Var6.getValue() * 86400000) + System.currentTimeMillis());
                calendar4.set(11, hVar.getValue());
                calendar4.set(12, iVar.getValue() * 5);
                uVar.J((int) (calendar4.getTimeInMillis() / 1000), 0, true);
                runnable4 = z2Var4.a.dismissRunnable;
                runnable4.run();
                break;
        }
    }

    public /* synthetic */ m0(Calendar calendar, ud0 ud0Var, ug.h hVar, ug.i iVar, ug.u uVar, org.telegram.ui.ActionBar.z2 z2Var) {
        this.a = 5;
        this.c = calendar;
        this.b = ud0Var;
        this.e = hVar;
        this.f = iVar;
        this.h = uVar;
        this.d = z2Var;
    }
}
