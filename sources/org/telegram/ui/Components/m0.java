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
import org.telegram.ui.fi1;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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
                md0 md0Var = (md0) this.b;
                md0 md0Var2 = (md0) this.e;
                md0 md0Var3 = (md0) this.f;
                Calendar calendar = (Calendar) this.c;
                MessagesStorage.IntCallback intCallback = (MessagesStorage.IntCallback) this.h;
                org.telegram.ui.ActionBar.e3 e3Var = (org.telegram.ui.ActionBar.e3) this.d;
                g5.b(md0Var, md0Var2, md0Var3);
                calendar.set(1, md0Var3.getValue());
                calendar.set(2, md0Var2.getValue());
                calendar.set(5, md0Var.getValue());
                calendar.set(12, 0);
                calendar.set(11, 0);
                calendar.set(13, 0);
                intCallback.run((int) (calendar.getTimeInMillis() / 1000));
                runnable = e3Var.a.dismissRunnable;
                runnable.run();
                break;
            case 1:
                md0 md0Var4 = (md0) this.b;
                i4 i4Var = (i4) this.e;
                j4 j4Var = (j4) this.f;
                Calendar calendar2 = (Calendar) this.c;
                org.telegram.ui.af0 af0Var = (org.telegram.ui.af0) this.h;
                org.telegram.ui.ActionBar.e3 e3Var2 = (org.telegram.ui.ActionBar.e3) this.d;
                boolean g7 = g5.g(null, null, 0L, 0L, 0, md0Var4, i4Var, j4Var);
                calendar2.setTimeInMillis(System.currentTimeMillis());
                calendar2.add(6, md0Var4.getValue());
                calendar2.set(11, i4Var.getValue());
                calendar2.set(12, j4Var.getValue());
                if (g7) {
                    calendar2.set(13, 0);
                    calendar2.set(14, 0);
                }
                int timeInMillis = (int) (calendar2.getTimeInMillis() / 1000);
                org.telegram.ui.r41 r41Var = (org.telegram.ui.r41) af0Var.c;
                ((boolean[]) af0Var.b)[0] = true;
                r41Var.e(Integer.valueOf(timeInMillis));
                runnable2 = e3Var2.a.dismissRunnable;
                runnable2.run();
                break;
            case 2:
                md0 md0Var5 = (md0) this.b;
                z3 z3Var = (z3) this.e;
                b4 b4Var = (b4) this.f;
                Calendar calendar3 = (Calendar) this.c;
                e5 e5Var = (e5) this.h;
                org.telegram.ui.ActionBar.e3 e3Var3 = (org.telegram.ui.ActionBar.e3) this.d;
                boolean g10 = g5.g(null, null, 0L, 0L, 0, md0Var5, z3Var, b4Var);
                calendar3.setTimeInMillis(System.currentTimeMillis());
                calendar3.add(6, md0Var5.getValue());
                calendar3.set(11, z3Var.getValue());
                calendar3.set(12, b4Var.getValue());
                if (g10) {
                    calendar3.set(13, 0);
                    calendar3.set(14, 0);
                }
                e5Var.G((int) (calendar3.getTimeInMillis() / 1000), 0, true);
                runnable3 = e3Var3.a.dismissRunnable;
                runnable3.run();
                break;
            case 3:
                cz0.A((cz0) this.b, (int[]) this.e, (EditTextBoldCursor) this.f, (TextView) this.c, (TextView) this.h, (AlertDialog$Builder) this.d);
                break;
            case 4:
                org.telegram.ui.ActionBar.k3 k3Var = (org.telegram.ui.ActionBar.k3) this.b;
                FrameLayout frameLayout = (FrameLayout) this.e;
                ArrayList arrayList = (ArrayList) this.f;
                int[] iArr = (int[]) this.c;
                j9 j9Var = (j9) this.h;
                y9 y9Var = (y9) this.d;
                k80 F = k80.F(k3Var.container, k3Var.getResourcesProvider(), frameLayout);
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    int i11 = i10 + 1;
                    int intValue = ((Integer) arrayList.get(i10)).intValue();
                    TLRPC.User currentUser = UserConfig.getInstance(intValue).getCurrentUser();
                    if (currentUser != null) {
                        F.e(intValue, iArr[0] == intValue, new fi1(iArr, intValue, j9Var, currentUser, y9Var, 0));
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
                md0 md0Var6 = (md0) this.b;
                vg.h hVar = (vg.h) this.e;
                vg.i iVar = (vg.i) this.f;
                vg.u uVar = (vg.u) this.h;
                org.telegram.ui.ActionBar.e3 e3Var4 = (org.telegram.ui.ActionBar.e3) this.d;
                calendar4.setTimeInMillis((md0Var6.getValue() * 86400000) + System.currentTimeMillis());
                calendar4.set(11, hVar.getValue());
                calendar4.set(12, iVar.getValue() * 5);
                uVar.G((int) (calendar4.getTimeInMillis() / 1000), 0, true);
                runnable4 = e3Var4.a.dismissRunnable;
                runnable4.run();
                break;
        }
    }

    public /* synthetic */ m0(Calendar calendar, md0 md0Var, vg.h hVar, vg.i iVar, vg.u uVar, org.telegram.ui.ActionBar.e3 e3Var) {
        this.a = 5;
        this.c = calendar;
        this.b = md0Var;
        this.e = hVar;
        this.f = iVar;
        this.h = uVar;
        this.d = e3Var;
    }
}
