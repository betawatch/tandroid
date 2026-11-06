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

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final /* synthetic */ class n1 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ KeyEvent.Callback b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;

    public /* synthetic */ n1(KeyEvent.Callback callback, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i7) {
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
                hb0 hb0Var = (hb0) this.b;
                c4 c4Var = (c4) this.e;
                d4 d4Var = (d4) this.f;
                Calendar calendar = (Calendar) this.c;
                org.telegram.ui.lk0 lk0Var = (org.telegram.ui.lk0) this.h;
                h9.f1 f1Var = (h9.f1) this.d;
                boolean g10 = v4.g(null, null, 0L, 0L, 0, hb0Var, c4Var, d4Var);
                calendar.setTimeInMillis(System.currentTimeMillis());
                calendar.add(6, hb0Var.getValue());
                calendar.set(11, c4Var.getValue());
                calendar.set(12, d4Var.getValue());
                if (g10) {
                    calendar.set(13, 0);
                    calendar.set(14, 0);
                }
                int timeInMillis = (int) (calendar.getTimeInMillis() / 1000);
                org.telegram.ui.g01 g01Var = (org.telegram.ui.g01) lk0Var.b;
                ((boolean[]) lk0Var.c)[0] = true;
                g01Var.e(Integer.valueOf(timeInMillis));
                ((org.telegram.ui.ActionBar.v2) f1Var.b).x0.run();
                break;
            case 1:
                hb0 hb0Var2 = (hb0) this.b;
                u3 u3Var = (u3) this.e;
                v3 v3Var = (v3) this.f;
                Calendar calendar2 = (Calendar) this.c;
                t4 t4Var = (t4) this.h;
                h9.f1 f1Var2 = (h9.f1) this.d;
                boolean g11 = v4.g(null, null, 0L, 0L, 0, hb0Var2, u3Var, v3Var);
                calendar2.setTimeInMillis(System.currentTimeMillis());
                calendar2.add(6, hb0Var2.getValue());
                calendar2.set(11, u3Var.getValue());
                calendar2.set(12, v3Var.getValue());
                if (g11) {
                    calendar2.set(13, 0);
                    calendar2.set(14, 0);
                }
                t4Var.L((int) (calendar2.getTimeInMillis() / 1000), 0, true);
                ((org.telegram.ui.ActionBar.v2) f1Var2.b).x0.run();
                break;
            case 2:
                hb0 hb0Var3 = (hb0) this.b;
                hb0 hb0Var4 = (hb0) this.e;
                hb0 hb0Var5 = (hb0) this.f;
                Calendar calendar3 = (Calendar) this.c;
                org.telegram.messenger.sr srVar = (org.telegram.messenger.sr) this.h;
                h9.f1 f1Var3 = (h9.f1) this.d;
                v4.b(hb0Var3, hb0Var4, hb0Var5);
                calendar3.set(1, hb0Var5.getValue());
                calendar3.set(2, hb0Var4.getValue());
                calendar3.set(5, hb0Var3.getValue());
                calendar3.set(12, 0);
                calendar3.set(11, 0);
                calendar3.set(13, 0);
                srVar.a((int) (calendar3.getTimeInMillis() / 1000));
                ((org.telegram.ui.ActionBar.v2) f1Var3.b).x0.run();
                break;
            case 3:
                yv0 yv0Var = (yv0) this.b;
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
                            if (!yv0Var.h2) {
                                org.telegram.messenger.g0.F3(editTextBoldCursor);
                                try {
                                    editTextBoldCursor.performHapticFeedback(3, 2);
                                } catch (Exception unused) {
                                }
                            }
                            org.telegram.messenger.g0.v1(editTextBoldCursor);
                            org.telegram.messenger.gz C = org.telegram.messenger.gz.C(yv0Var.a);
                            String str = yv0Var.i2;
                            String str2 = yv0Var.f2;
                            String str3 = yv0Var.R1;
                            ArrayList arrayList = yv0Var.P1;
                            hv0 hv0Var = new hv0(yv0Var);
                            if (C.F.get(str2) != null) {
                                hv0Var.a(null);
                            } else {
                                new Thread(new org.telegram.messenger.zj((Object) C, str, str2, (Object) str3, (Object) arrayList, (Object) hv0Var, 9)).start();
                            }
                            alertDialog$Builder.a.L0.run();
                            yv0Var.dismiss();
                            break;
                        }
                    } else {
                        iArr[0] = 1;
                        TLRPC.TL_stickers_suggestShortName tL_stickers_suggestShortName = new TLRPC.TL_stickers_suggestShortName();
                        String obj = editTextBoldCursor.getText().toString();
                        yv0Var.i2 = obj;
                        tL_stickers_suggestShortName.title = obj;
                        ConnectionsManager.getInstance(yv0Var.a).sendRequest(tL_stickers_suggestShortName, new bi.r8(yv0Var, editTextBoldCursor, textView, textView2, iArr, 7));
                        break;
                    }
                }
                break;
            case 4:
                org.telegram.ui.ActionBar.v2 v2Var = (org.telegram.ui.ActionBar.v2) this.b;
                FrameLayout frameLayout = (FrameLayout) this.e;
                ArrayList arrayList2 = (ArrayList) this.f;
                int[] iArr2 = (int[]) this.c;
                w8 w8Var = (w8) this.h;
                l9 l9Var = (l9) this.d;
                k60 F = k60.F(v2Var.c, v2Var.I0, frameLayout);
                int size = arrayList2.size();
                int i10 = 0;
                while (i10 < size) {
                    int i11 = i10 + 1;
                    int intValue = ((Integer) arrayList2.get(i10)).intValue();
                    TLRPC.User f10 = org.telegram.messenger.p10.i(intValue).f();
                    if (f10 != null) {
                        F.e(intValue, iArr2[0] == intValue, new bi.ub(iArr2, intValue, w8Var, f10, l9Var, 23));
                    }
                    i10 = i11;
                }
                F.t = false;
                F.Y = true;
                F.s = 0;
                F.i = 3;
                F.a0(-org.telegram.messenger.g0.L(8.0f), -org.telegram.messenger.g0.L(8.0f));
                F.Z();
                break;
            default:
                Calendar calendar4 = (Calendar) this.c;
                hb0 hb0Var6 = (hb0) this.b;
                wg.f fVar = (wg.f) this.e;
                wg.g gVar = (wg.g) this.f;
                wg.u uVar = (wg.u) this.h;
                h9.f1 f1Var4 = (h9.f1) this.d;
                calendar4.setTimeInMillis((hb0Var6.getValue() * 86400000) + System.currentTimeMillis());
                calendar4.set(11, fVar.getValue());
                calendar4.set(12, gVar.getValue() * 5);
                uVar.L((int) (calendar4.getTimeInMillis() / 1000), 0, true);
                ((org.telegram.ui.ActionBar.v2) f1Var4.b).x0.run();
                break;
        }
    }

    public /* synthetic */ n1(Calendar calendar, hb0 hb0Var, wg.f fVar, wg.g gVar, wg.u uVar, h9.f1 f1Var) {
        this.a = 5;
        this.c = calendar;
        this.b = hb0Var;
        this.e = fVar;
        this.f = gVar;
        this.h = uVar;
        this.d = f1Var;
    }
}
