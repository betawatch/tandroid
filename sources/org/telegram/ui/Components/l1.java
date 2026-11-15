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

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class l1 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ KeyEvent.Callback b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;

    public /* synthetic */ l1(KeyEvent.Callback callback, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i7) {
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
                ib0 ib0Var = (ib0) this.b;
                a4 a4Var = (a4) this.e;
                b4 b4Var = (b4) this.f;
                Calendar calendar = (Calendar) this.c;
                org.telegram.ui.xi0 xi0Var = (org.telegram.ui.xi0) this.h;
                org.telegram.messenger.ou ouVar = (org.telegram.messenger.ou) this.d;
                boolean g10 = t4.g(null, null, 0L, 0L, 0, ib0Var, a4Var, b4Var);
                calendar.setTimeInMillis(System.currentTimeMillis());
                calendar.add(6, ib0Var.getValue());
                calendar.set(11, a4Var.getValue());
                calendar.set(12, b4Var.getValue());
                if (g10) {
                    calendar.set(13, 0);
                    calendar.set(14, 0);
                }
                int timeInMillis = (int) (calendar.getTimeInMillis() / 1000);
                org.telegram.ui.d01 d01Var = (org.telegram.ui.d01) xi0Var.b;
                ((boolean[]) xi0Var.c)[0] = true;
                d01Var.e(Integer.valueOf(timeInMillis));
                ((org.telegram.ui.ActionBar.u2) ouVar.b).y0.run();
                break;
            case 1:
                ib0 ib0Var2 = (ib0) this.b;
                s3 s3Var = (s3) this.e;
                t3 t3Var = (t3) this.f;
                Calendar calendar2 = (Calendar) this.c;
                r4 r4Var = (r4) this.h;
                org.telegram.messenger.ou ouVar2 = (org.telegram.messenger.ou) this.d;
                boolean g11 = t4.g(null, null, 0L, 0L, 0, ib0Var2, s3Var, t3Var);
                calendar2.setTimeInMillis(System.currentTimeMillis());
                calendar2.add(6, ib0Var2.getValue());
                calendar2.set(11, s3Var.getValue());
                calendar2.set(12, t3Var.getValue());
                if (g11) {
                    calendar2.set(13, 0);
                    calendar2.set(14, 0);
                }
                r4Var.L((int) (calendar2.getTimeInMillis() / 1000), 0, true);
                ((org.telegram.ui.ActionBar.u2) ouVar2.b).y0.run();
                break;
            case 2:
                ib0 ib0Var3 = (ib0) this.b;
                ib0 ib0Var4 = (ib0) this.e;
                ib0 ib0Var5 = (ib0) this.f;
                Calendar calendar3 = (Calendar) this.c;
                org.telegram.messenger.pr prVar = (org.telegram.messenger.pr) this.h;
                org.telegram.messenger.ou ouVar3 = (org.telegram.messenger.ou) this.d;
                t4.b(ib0Var3, ib0Var4, ib0Var5);
                calendar3.set(1, ib0Var5.getValue());
                calendar3.set(2, ib0Var4.getValue());
                calendar3.set(5, ib0Var3.getValue());
                calendar3.set(12, 0);
                calendar3.set(11, 0);
                calendar3.set(13, 0);
                prVar.a((int) (calendar3.getTimeInMillis() / 1000));
                ((org.telegram.ui.ActionBar.u2) ouVar3.b).y0.run();
                break;
            case 3:
                bw0 bw0Var = (bw0) this.b;
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
                            if (!bw0Var.l2) {
                                org.telegram.messenger.g0.E3(editTextBoldCursor);
                                try {
                                    editTextBoldCursor.performHapticFeedback(3, 2);
                                } catch (Exception unused) {
                                }
                            }
                            org.telegram.messenger.g0.v1(editTextBoldCursor);
                            org.telegram.messenger.ez C = org.telegram.messenger.ez.C(bw0Var.a);
                            String str = bw0Var.m2;
                            String str2 = bw0Var.j2;
                            String str3 = bw0Var.V1;
                            ArrayList arrayList = bw0Var.T1;
                            jv0 jv0Var = new jv0(bw0Var);
                            if (C.G.get(str2) != null) {
                                jv0Var.a(null);
                            } else {
                                new Thread(new org.telegram.messenger.wj((Object) C, str, str2, (Object) str3, (Object) arrayList, (Object) jv0Var, 9)).start();
                            }
                            alertDialog$Builder.a.M0.run();
                            bw0Var.dismiss();
                            break;
                        }
                    } else {
                        iArr[0] = 1;
                        TLRPC.TL_stickers_suggestShortName tL_stickers_suggestShortName = new TLRPC.TL_stickers_suggestShortName();
                        String obj = editTextBoldCursor.getText().toString();
                        bw0Var.m2 = obj;
                        tL_stickers_suggestShortName.title = obj;
                        ConnectionsManager.getInstance(bw0Var.a).sendRequest(tL_stickers_suggestShortName, new di.k7(bw0Var, editTextBoldCursor, textView, textView2, iArr, 7));
                        break;
                    }
                }
                break;
            case 4:
                org.telegram.ui.ActionBar.u2 u2Var = (org.telegram.ui.ActionBar.u2) this.b;
                FrameLayout frameLayout = (FrameLayout) this.e;
                ArrayList arrayList2 = (ArrayList) this.f;
                int[] iArr2 = (int[]) this.c;
                t8 t8Var = (t8) this.h;
                i9 i9Var = (i9) this.d;
                m60 F = m60.F(u2Var.c, u2Var.J0, frameLayout);
                int size = arrayList2.size();
                int i10 = 0;
                while (i10 < size) {
                    int i11 = i10 + 1;
                    int intValue = ((Integer) arrayList2.get(i10)).intValue();
                    TLRPC.User f10 = org.telegram.messenger.m10.i(intValue).f();
                    if (f10 != null) {
                        F.e(intValue, iArr2[0] == intValue, new ai.f1(iArr2, intValue, t8Var, f10, i9Var, 25));
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
                ib0 ib0Var6 = (ib0) this.b;
                wg.f fVar = (wg.f) this.e;
                wg.g gVar = (wg.g) this.f;
                wg.s sVar = (wg.s) this.h;
                org.telegram.messenger.ou ouVar4 = (org.telegram.messenger.ou) this.d;
                calendar4.setTimeInMillis((ib0Var6.getValue() * 86400000) + System.currentTimeMillis());
                calendar4.set(11, fVar.getValue());
                calendar4.set(12, gVar.getValue() * 5);
                sVar.L((int) (calendar4.getTimeInMillis() / 1000), 0, true);
                ((org.telegram.ui.ActionBar.u2) ouVar4.b).y0.run();
                break;
        }
    }

    public /* synthetic */ l1(Calendar calendar, ib0 ib0Var, wg.f fVar, wg.g gVar, wg.s sVar, org.telegram.messenger.ou ouVar) {
        this.a = 5;
        this.c = calendar;
        this.b = ib0Var;
        this.e = fVar;
        this.f = gVar;
        this.h = sVar;
        this.d = ouVar;
    }
}
