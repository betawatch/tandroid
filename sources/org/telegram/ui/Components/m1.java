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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class m1 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ KeyEvent.Callback b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;

    public /* synthetic */ m1(KeyEvent.Callback callback, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i3) {
        this.a = i3;
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
                cb0 cb0Var = (cb0) this.b;
                a4 a4Var = (a4) this.e;
                b4 b4Var = (b4) this.f;
                Calendar calendar = (Calendar) this.c;
                org.telegram.ui.rb0 rb0Var = (org.telegram.ui.rb0) this.h;
                hi.d dVar = (hi.d) this.d;
                boolean g7 = t4.g(null, null, 0L, 0L, 0, cb0Var, a4Var, b4Var);
                calendar.setTimeInMillis(System.currentTimeMillis());
                calendar.add(6, cb0Var.getValue());
                calendar.set(11, a4Var.getValue());
                calendar.set(12, b4Var.getValue());
                if (g7) {
                    calendar.set(13, 0);
                    calendar.set(14, 0);
                }
                int timeInMillis = (int) (calendar.getTimeInMillis() / 1000);
                org.telegram.ui.wz0 wz0Var = (org.telegram.ui.wz0) rb0Var.b;
                ((boolean[]) rb0Var.c)[0] = true;
                wz0Var.e(Integer.valueOf(timeInMillis));
                ((org.telegram.ui.ActionBar.t2) dVar.b).y0.run();
                break;
            case 1:
                cb0 cb0Var2 = (cb0) this.b;
                s3 s3Var = (s3) this.e;
                t3 t3Var = (t3) this.f;
                Calendar calendar2 = (Calendar) this.c;
                r4 r4Var = (r4) this.h;
                hi.d dVar2 = (hi.d) this.d;
                boolean g10 = t4.g(null, null, 0L, 0L, 0, cb0Var2, s3Var, t3Var);
                calendar2.setTimeInMillis(System.currentTimeMillis());
                calendar2.add(6, cb0Var2.getValue());
                calendar2.set(11, s3Var.getValue());
                calendar2.set(12, t3Var.getValue());
                if (g10) {
                    calendar2.set(13, 0);
                    calendar2.set(14, 0);
                }
                r4Var.L((int) (calendar2.getTimeInMillis() / 1000), 0, true);
                ((org.telegram.ui.ActionBar.t2) dVar2.b).y0.run();
                break;
            case 2:
                cb0 cb0Var3 = (cb0) this.b;
                cb0 cb0Var4 = (cb0) this.e;
                cb0 cb0Var5 = (cb0) this.f;
                Calendar calendar3 = (Calendar) this.c;
                org.telegram.messenger.kr krVar = (org.telegram.messenger.kr) this.h;
                hi.d dVar3 = (hi.d) this.d;
                t4.b(cb0Var3, cb0Var4, cb0Var5);
                calendar3.set(1, cb0Var5.getValue());
                calendar3.set(2, cb0Var4.getValue());
                calendar3.set(5, cb0Var3.getValue());
                calendar3.set(12, 0);
                calendar3.set(11, 0);
                calendar3.set(13, 0);
                krVar.a((int) (calendar3.getTimeInMillis() / 1000));
                ((org.telegram.ui.ActionBar.t2) dVar3.b).y0.run();
                break;
            case 3:
                xv0 xv0Var = (xv0) this.b;
                int[] iArr = (int[]) this.e;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.f;
                TextView textView = (TextView) this.c;
                TextView textView2 = (TextView) this.h;
                AlertDialog$Builder alertDialog$Builder = (AlertDialog$Builder) this.d;
                int i3 = iArr[0];
                if (i3 != 1) {
                    if (i3 != 0) {
                        if (i3 == 2) {
                            iArr[0] = 3;
                            if (!xv0Var.i2) {
                                org.telegram.messenger.g0.F3(editTextBoldCursor);
                                try {
                                    editTextBoldCursor.performHapticFeedback(3, 2);
                                } catch (Exception unused) {
                                }
                            }
                            org.telegram.messenger.g0.v1(editTextBoldCursor);
                            org.telegram.messenger.yy C = org.telegram.messenger.yy.C(xv0Var.a);
                            String str = xv0Var.j2;
                            String str2 = xv0Var.g2;
                            String str3 = xv0Var.S1;
                            ArrayList arrayList = xv0Var.Q1;
                            gv0 gv0Var = new gv0(xv0Var);
                            if (C.G.get(str2) != null) {
                                gv0Var.a(null);
                            } else {
                                new Thread(new org.telegram.messenger.pj((Object) C, str, str2, (Object) str3, (Object) arrayList, (Object) gv0Var, 9)).start();
                            }
                            alertDialog$Builder.a.O0.run();
                            xv0Var.dismiss();
                            break;
                        }
                    } else {
                        iArr[0] = 1;
                        TLRPC.TL_stickers_suggestShortName tL_stickers_suggestShortName = new TLRPC.TL_stickers_suggestShortName();
                        String obj = editTextBoldCursor.getText().toString();
                        xv0Var.j2 = obj;
                        tL_stickers_suggestShortName.title = obj;
                        ConnectionsManager.getInstance(xv0Var.a).sendRequest(tL_stickers_suggestShortName, new ci.s7(xv0Var, editTextBoldCursor, textView, textView2, iArr, 7));
                        break;
                    }
                }
                break;
            case 4:
                org.telegram.ui.ActionBar.t2 t2Var = (org.telegram.ui.ActionBar.t2) this.b;
                FrameLayout frameLayout = (FrameLayout) this.e;
                ArrayList arrayList2 = (ArrayList) this.f;
                int[] iArr2 = (int[]) this.c;
                u8 u8Var = (u8) this.h;
                k9 k9Var = (k9) this.d;
                f60 F = f60.F(t2Var.c, t2Var.J0, frameLayout);
                int size = arrayList2.size();
                int i10 = 0;
                while (i10 < size) {
                    int i11 = i10 + 1;
                    int intValue = ((Integer) arrayList2.get(i10)).intValue();
                    TLRPC.User f10 = org.telegram.messenger.h10.i(intValue).f();
                    if (f10 != null) {
                        F.e(intValue, iArr2[0] == intValue, new ai.p1(iArr2, intValue, u8Var, f10, k9Var, 25));
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
                cb0 cb0Var6 = (cb0) this.b;
                xg.h hVar = (xg.h) this.e;
                xg.i iVar = (xg.i) this.f;
                xg.u uVar = (xg.u) this.h;
                hi.d dVar4 = (hi.d) this.d;
                calendar4.setTimeInMillis((cb0Var6.getValue() * 86400000) + System.currentTimeMillis());
                calendar4.set(11, hVar.getValue());
                calendar4.set(12, iVar.getValue() * 5);
                uVar.L((int) (calendar4.getTimeInMillis() / 1000), 0, true);
                ((org.telegram.ui.ActionBar.t2) dVar4.b).y0.run();
                break;
        }
    }

    public /* synthetic */ m1(Calendar calendar, cb0 cb0Var, xg.h hVar, xg.i iVar, xg.u uVar, hi.d dVar) {
        this.a = 5;
        this.c = calendar;
        this.b = cb0Var;
        this.e = hVar;
        this.f = iVar;
        this.h = uVar;
        this.d = dVar;
    }
}
