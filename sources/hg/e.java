package hg;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import eg.d3;
import java.util.ArrayList;
import java.util.Calendar;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.c3;
import org.telegram.ui.ActionBar.h3;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.b4;
import org.telegram.ui.Components.c4;
import org.telegram.ui.Components.p9;
import org.telegram.ui.Components.q70;
import org.telegram.ui.Components.t3;
import org.telegram.ui.Components.v3;
import org.telegram.ui.Components.xx0;
import org.telegram.ui.Components.y4;
import org.telegram.ui.Components.yc0;
import org.telegram.ui.Components.z4;
import org.telegram.ui.Components.z8;
import org.telegram.ui.l51;
import org.telegram.ui.vl0;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
                yc0 yc0Var = (yc0) this.b;
                n nVar = (n) this.e;
                o oVar = (o) this.f;
                r0 r0Var = (r0) this.h;
                c3 c3Var = (c3) this.d;
                calendar.setTimeInMillis((yc0Var.getValue() * 86400000) + System.currentTimeMillis());
                calendar.set(11, nVar.getValue());
                calendar.set(12, oVar.getValue() * 5);
                r0Var.I((int) (calendar.getTimeInMillis() / 1000), 0, true);
                c3Var.a.dismissRunnable.run();
                break;
            case 1:
                yc0 yc0Var2 = (yc0) this.b;
                yc0 yc0Var3 = (yc0) this.e;
                yc0 yc0Var4 = (yc0) this.f;
                Calendar calendar2 = (Calendar) this.c;
                MessagesStorage.IntCallback intCallback = (MessagesStorage.IntCallback) this.h;
                c3 c3Var2 = (c3) this.d;
                z4.b(yc0Var2, yc0Var3, yc0Var4);
                calendar2.set(1, yc0Var4.getValue());
                calendar2.set(2, yc0Var3.getValue());
                calendar2.set(5, yc0Var2.getValue());
                calendar2.set(12, 0);
                calendar2.set(11, 0);
                calendar2.set(13, 0);
                intCallback.run((int) (calendar2.getTimeInMillis() / 1000));
                c3Var2.a.dismissRunnable.run();
                break;
            case 2:
                yc0 yc0Var5 = (yc0) this.b;
                b4 b4Var = (b4) this.e;
                c4 c4Var = (c4) this.f;
                Calendar calendar3 = (Calendar) this.c;
                vl0 vl0Var = (vl0) this.h;
                c3 c3Var3 = (c3) this.d;
                boolean g10 = z4.g(null, null, 0L, 0L, 0, yc0Var5, b4Var, c4Var);
                calendar3.setTimeInMillis(System.currentTimeMillis());
                calendar3.add(6, yc0Var5.getValue());
                calendar3.set(11, b4Var.getValue());
                calendar3.set(12, c4Var.getValue());
                if (g10) {
                    calendar3.set(13, 0);
                    calendar3.set(14, 0);
                }
                int timeInMillis = (int) (calendar3.getTimeInMillis() / 1000);
                l51 l51Var = (l51) vl0Var.b;
                ((boolean[]) vl0Var.c)[0] = true;
                l51Var.e(Integer.valueOf(timeInMillis));
                c3Var3.a.dismissRunnable.run();
                break;
            case 3:
                yc0 yc0Var6 = (yc0) this.b;
                t3 t3Var = (t3) this.e;
                v3 v3Var = (v3) this.f;
                Calendar calendar4 = (Calendar) this.c;
                y4 y4Var = (y4) this.h;
                c3 c3Var4 = (c3) this.d;
                boolean g11 = z4.g(null, null, 0L, 0L, 0, yc0Var6, t3Var, v3Var);
                calendar4.setTimeInMillis(System.currentTimeMillis());
                calendar4.add(6, yc0Var6.getValue());
                calendar4.set(11, t3Var.getValue());
                calendar4.set(12, v3Var.getValue());
                if (g11) {
                    calendar4.set(13, 0);
                    calendar4.set(14, 0);
                }
                y4Var.I((int) (calendar4.getTimeInMillis() / 1000), 0, true);
                c3Var4.a.dismissRunnable.run();
                break;
            case 4:
                xx0.x((xx0) this.c, (int[]) this.b, (EditTextBoldCursor) this.e, (TextView) this.f, (TextView) this.h, (AlertDialog$Builder) this.d);
                break;
            default:
                h3 h3Var = (h3) this.c;
                FrameLayout frameLayout = (FrameLayout) this.b;
                ArrayList arrayList = (ArrayList) this.e;
                int[] iArr = (int[]) this.f;
                z8 z8Var = (z8) this.h;
                p9 p9Var = (p9) this.d;
                q70 F = q70.F(h3Var.container, h3Var.getResourcesProvider(), frameLayout);
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    int i11 = i10 + 1;
                    int intValue = ((Integer) arrayList.get(i10)).intValue();
                    TLRPC.User currentUser = UserConfig.getInstance(intValue).getCurrentUser();
                    if (currentUser != null) {
                        F.e(intValue, iArr[0] == intValue, new d3(iArr, intValue, z8Var, currentUser, p9Var, 24));
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

    public /* synthetic */ e(yc0 yc0Var, yc0 yc0Var2, yc0 yc0Var3, Calendar calendar, Object obj, c3 c3Var, int i10) {
        this.a = i10;
        this.b = yc0Var;
        this.e = yc0Var2;
        this.f = yc0Var3;
        this.c = calendar;
        this.h = obj;
        this.d = c3Var;
    }
}
