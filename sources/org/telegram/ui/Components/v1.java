package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Calendar;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class v1 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ KeyEvent.Callback b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;

    public /* synthetic */ v1(KeyEvent.Callback callback, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i7) {
        this.a = i7;
        this.b = callback;
        this.e = obj;
        this.f = obj2;
        this.c = obj3;
        this.h = obj4;
        this.d = obj5;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                sb0 sb0Var = (sb0) this.b;
                i4 i4Var = (i4) this.e;
                j4 j4Var = (j4) this.f;
                Calendar calendar = (Calendar) this.c;
                org.telegram.ui.aj0 aj0Var = (org.telegram.ui.aj0) this.h;
                hi.w4 w4Var = (hi.w4) this.d;
                boolean g10 = b5.g(null, null, 0L, 0L, 0, sb0Var, i4Var, j4Var);
                calendar.setTimeInMillis(System.currentTimeMillis());
                calendar.add(6, sb0Var.getValue());
                calendar.set(11, i4Var.getValue());
                calendar.set(12, j4Var.getValue());
                if (g10) {
                    calendar.set(13, 0);
                    calendar.set(14, 0);
                }
                int timeInMillis = (int) (calendar.getTimeInMillis() / 1000);
                org.telegram.ui.h01 h01Var = (org.telegram.ui.h01) aj0Var.b;
                ((boolean[]) aj0Var.c)[0] = true;
                h01Var.e(Integer.valueOf(timeInMillis));
                ((org.telegram.ui.ActionBar.x2) w4Var.b).y0.run();
                break;
            case 1:
                sb0 sb0Var2 = (sb0) this.b;
                a4 a4Var = (a4) this.e;
                b4 b4Var = (b4) this.f;
                Calendar calendar2 = (Calendar) this.c;
                z4 z4Var = (z4) this.h;
                hi.w4 w4Var2 = (hi.w4) this.d;
                boolean g11 = b5.g(null, null, 0L, 0L, 0, sb0Var2, a4Var, b4Var);
                calendar2.setTimeInMillis(System.currentTimeMillis());
                calendar2.add(6, sb0Var2.getValue());
                calendar2.set(11, a4Var.getValue());
                calendar2.set(12, b4Var.getValue());
                if (g11) {
                    calendar2.set(13, 0);
                    calendar2.set(14, 0);
                }
                z4Var.O((int) (calendar2.getTimeInMillis() / 1000), 0, true);
                ((org.telegram.ui.ActionBar.x2) w4Var2.b).y0.run();
                break;
            case 2:
                sb0 sb0Var3 = (sb0) this.b;
                sb0 sb0Var4 = (sb0) this.e;
                sb0 sb0Var5 = (sb0) this.f;
                Calendar calendar3 = (Calendar) this.c;
                org.telegram.messenger.nr nrVar = (org.telegram.messenger.nr) this.h;
                hi.w4 w4Var3 = (hi.w4) this.d;
                b5.b(sb0Var3, sb0Var4, sb0Var5);
                calendar3.set(1, sb0Var5.getValue());
                calendar3.set(2, sb0Var4.getValue());
                calendar3.set(5, sb0Var3.getValue());
                calendar3.set(12, 0);
                calendar3.set(11, 0);
                calendar3.set(13, 0);
                nrVar.a((int) (calendar3.getTimeInMillis() / 1000));
                ((org.telegram.ui.ActionBar.x2) w4Var3.b).y0.run();
                break;
            case 3:
                iw0 iw0Var = (iw0) this.b;
                int[] iArr = (int[]) this.e;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.f;
                TextView textView = (TextView) this.c;
                TextView textView2 = (TextView) this.h;
                AlertDialog$Builder alertDialog$Builder = (AlertDialog$Builder) this.d;
                int i7 = iArr[0];
                if (i7 != 1) {
                    if (i7 != 0) {
                        if (i7 == 2) {
                            iArr[0] = 3;
                            if (!iw0Var.l2) {
                                org.telegram.messenger.g0.D3(editTextBoldCursor);
                                try {
                                    editTextBoldCursor.performHapticFeedback(3, 2);
                                } catch (Exception unused) {
                                }
                            }
                            org.telegram.messenger.g0.v1(editTextBoldCursor);
                            org.telegram.messenger.zy C = org.telegram.messenger.zy.C(iw0Var.a);
                            String str = iw0Var.m2;
                            String str2 = iw0Var.j2;
                            String str3 = iw0Var.V1;
                            ArrayList arrayList = iw0Var.T1;
                            rv0 rv0Var = new rv0(iw0Var);
                            if (C.G.get(str2) != null) {
                                rv0Var.a(null);
                            } else {
                                new Thread(new org.telegram.messenger.tj((Object) C, str, str2, (Object) str3, (Object) arrayList, (Object) rv0Var, 9)).start();
                            }
                            alertDialog$Builder.a.M0.run();
                            iw0Var.dismiss();
                            break;
                        }
                    } else {
                        iArr[0] = 1;
                        TLRPC.TL_stickers_suggestShortName tL_stickers_suggestShortName = new TLRPC.TL_stickers_suggestShortName();
                        String obj = editTextBoldCursor.getText().toString();
                        iw0Var.m2 = obj;
                        tL_stickers_suggestShortName.title = obj;
                        ConnectionsManager.getInstance(iw0Var.a).sendRequest(tL_stickers_suggestShortName, new di.m7(iw0Var, editTextBoldCursor, textView, textView2, iArr, 7));
                        break;
                    }
                }
                break;
            case 4:
                org.telegram.ui.ActionBar.x2 x2Var = (org.telegram.ui.ActionBar.x2) this.b;
                FrameLayout frameLayout = (FrameLayout) this.e;
                ArrayList arrayList2 = (ArrayList) this.f;
                int[] iArr2 = (int[]) this.c;
                b9 b9Var = (b9) this.h;
                q9 q9Var = (q9) this.d;
                y60 G = y60.G(x2Var.c, x2Var.J0, frameLayout);
                int size = arrayList2.size();
                int i10 = 0;
                while (i10 < size) {
                    int i11 = i10 + 1;
                    int intValue = ((Integer) arrayList2.get(i10)).intValue();
                    TLRPC.User f10 = org.telegram.messenger.j10.i(intValue).f();
                    if (f10 != null) {
                        G.e(intValue, iArr2[0] == intValue, new ai.g1(iArr2, intValue, b9Var, f10, q9Var, 25));
                    }
                    i10 = i11;
                }
                G.t = false;
                G.b0 = true;
                G.s = 0;
                G.i = 3;
                G.b0(-org.telegram.messenger.g0.L(8.0f), -org.telegram.messenger.g0.L(8.0f));
                G.a0();
                break;
            default:
                Calendar calendar4 = (Calendar) this.c;
                sb0 sb0Var6 = (sb0) this.b;
                wg.f fVar = (wg.f) this.e;
                wg.g gVar = (wg.g) this.f;
                wg.u uVar = (wg.u) this.h;
                hi.w4 w4Var4 = (hi.w4) this.d;
                calendar4.setTimeInMillis((sb0Var6.getValue() * 86400000) + System.currentTimeMillis());
                calendar4.set(11, fVar.getValue());
                calendar4.set(12, gVar.getValue() * 5);
                uVar.O((int) (calendar4.getTimeInMillis() / 1000), 0, true);
                ((org.telegram.ui.ActionBar.x2) w4Var4.b).y0.run();
                break;
        }
    }

    public /* synthetic */ v1(Calendar calendar, sb0 sb0Var, wg.f fVar, wg.g gVar, wg.u uVar, hi.w4 w4Var) {
        this.a = 5;
        this.c = calendar;
        this.b = sb0Var;
        this.e = fVar;
        this.f = gVar;
        this.h = uVar;
        this.d = w4Var;
    }
}
