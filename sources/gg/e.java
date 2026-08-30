package gg;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import dg.f3;
import java.util.ArrayList;
import java.util.Calendar;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.b3;
import org.telegram.ui.ActionBar.g3;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.b4;
import org.telegram.ui.Components.c4;
import org.telegram.ui.Components.o70;
import org.telegram.ui.Components.p9;
import org.telegram.ui.Components.t3;
import org.telegram.ui.Components.v3;
import org.telegram.ui.Components.wc0;
import org.telegram.ui.Components.xx0;
import org.telegram.ui.Components.y4;
import org.telegram.ui.Components.z4;
import org.telegram.ui.Components.z8;
import org.telegram.ui.e51;
import org.telegram.ui.tl0;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class e implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;

    public /* synthetic */ e(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i10) {
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
        switch (this.a) {
            case 0:
                Calendar calendar = (Calendar) this.c;
                wc0 wc0Var = (wc0) this.b;
                n nVar = (n) this.e;
                o oVar = (o) this.f;
                r0 r0Var = (r0) this.h;
                b3 b3Var = (b3) this.d;
                calendar.setTimeInMillis((wc0Var.getValue() * 86400000) + System.currentTimeMillis());
                calendar.set(11, nVar.getValue());
                calendar.set(12, oVar.getValue() * 5);
                r0Var.J((int) (calendar.getTimeInMillis() / 1000), 0, true);
                b3Var.a.dismissRunnable.run();
                break;
            case 1:
                wc0 wc0Var2 = (wc0) this.b;
                wc0 wc0Var3 = (wc0) this.e;
                wc0 wc0Var4 = (wc0) this.f;
                Calendar calendar2 = (Calendar) this.c;
                MessagesStorage.IntCallback intCallback = (MessagesStorage.IntCallback) this.h;
                b3 b3Var2 = (b3) this.d;
                z4.b(wc0Var2, wc0Var3, wc0Var4);
                calendar2.set(1, wc0Var4.getValue());
                calendar2.set(2, wc0Var3.getValue());
                calendar2.set(5, wc0Var2.getValue());
                calendar2.set(12, 0);
                calendar2.set(11, 0);
                calendar2.set(13, 0);
                intCallback.run((int) (calendar2.getTimeInMillis() / 1000));
                b3Var2.a.dismissRunnable.run();
                break;
            case 2:
                wc0 wc0Var5 = (wc0) this.b;
                b4 b4Var = (b4) this.e;
                c4 c4Var = (c4) this.f;
                Calendar calendar3 = (Calendar) this.c;
                tl0 tl0Var = (tl0) this.h;
                b3 b3Var3 = (b3) this.d;
                boolean g10 = z4.g(null, null, 0L, 0L, 0, wc0Var5, b4Var, c4Var);
                calendar3.setTimeInMillis(System.currentTimeMillis());
                calendar3.add(6, wc0Var5.getValue());
                calendar3.set(11, b4Var.getValue());
                calendar3.set(12, c4Var.getValue());
                if (g10) {
                    calendar3.set(13, 0);
                    calendar3.set(14, 0);
                }
                int timeInMillis = (int) (calendar3.getTimeInMillis() / 1000);
                e51 e51Var = (e51) tl0Var.b;
                ((boolean[]) tl0Var.c)[0] = true;
                e51Var.e(Integer.valueOf(timeInMillis));
                b3Var3.a.dismissRunnable.run();
                break;
            case 3:
                wc0 wc0Var6 = (wc0) this.b;
                t3 t3Var = (t3) this.e;
                v3 v3Var = (v3) this.f;
                Calendar calendar4 = (Calendar) this.c;
                y4 y4Var = (y4) this.h;
                b3 b3Var4 = (b3) this.d;
                boolean g11 = z4.g(null, null, 0L, 0L, 0, wc0Var6, t3Var, v3Var);
                calendar4.setTimeInMillis(System.currentTimeMillis());
                calendar4.add(6, wc0Var6.getValue());
                calendar4.set(11, t3Var.getValue());
                calendar4.set(12, v3Var.getValue());
                if (g11) {
                    calendar4.set(13, 0);
                    calendar4.set(14, 0);
                }
                y4Var.J((int) (calendar4.getTimeInMillis() / 1000), 0, true);
                b3Var4.a.dismissRunnable.run();
                break;
            case 4:
                xx0.x((xx0) this.c, (int[]) this.b, (EditTextBoldCursor) this.e, (TextView) this.f, (TextView) this.h, (AlertDialog$Builder) this.d);
                break;
            default:
                g3 g3Var = (g3) this.c;
                FrameLayout frameLayout = (FrameLayout) this.b;
                ArrayList arrayList = (ArrayList) this.e;
                int[] iArr = (int[]) this.f;
                z8 z8Var = (z8) this.h;
                p9 p9Var = (p9) this.d;
                o70 F = o70.F(g3Var.container, g3Var.getResourcesProvider(), frameLayout);
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    int i11 = i10 + 1;
                    int intValue = ((Integer) arrayList.get(i10)).intValue();
                    TLRPC.User currentUser = UserConfig.getInstance(intValue).getCurrentUser();
                    if (currentUser != null) {
                        F.e(intValue, iArr[0] == intValue, new f3(iArr, intValue, z8Var, currentUser, p9Var, 24));
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

    public /* synthetic */ e(wc0 wc0Var, wc0 wc0Var2, wc0 wc0Var3, Calendar calendar, Object obj, b3 b3Var, int i10) {
        this.a = i10;
        this.b = wc0Var;
        this.e = wc0Var2;
        this.f = wc0Var3;
        this.c = calendar;
        this.h = obj;
        this.d = b3Var;
    }
}
