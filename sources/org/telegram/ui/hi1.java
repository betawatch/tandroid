package org.telegram.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class hi1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ hi1(Object obj, int i10, Object obj2, Object obj3, Object obj4, int i11) {
        this.a = i11;
        this.c = obj;
        this.b = i10;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10;
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings;
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings2;
        switch (this.a) {
            case 0:
                int[] iArr = (int[]) this.c;
                int i10 = this.b;
                org.telegram.ui.Components.j9 j9Var = (org.telegram.ui.Components.j9) this.d;
                TLRPC.User user = (TLRPC.User) this.e;
                org.telegram.ui.Components.y9 y9Var = (org.telegram.ui.Components.y9) this.f;
                iArr[0] = i10;
                j9Var.r(user);
                y9Var.f(user, j9Var);
                break;
            case 1:
                sg.o2 o2Var = (sg.o2) this.c;
                int i11 = this.b;
                List list = (List) this.d;
                ArrayList arrayList = (ArrayList) this.e;
                fr0 fr0Var = (fr0) this.f;
                if (o2Var.I != null && !o2Var.y) {
                    Matrix matrix = new Matrix();
                    matrix.postScale(1.0f / o2Var.I.getWidth(), 1.0f / o2Var.I.getHeight());
                    matrix.postTranslate(-0.5f, -0.5f);
                    matrix.postRotate(i11);
                    matrix.postTranslate(0.5f, 0.5f);
                    if ((i11 / 90) % 2 != 0) {
                        matrix.postScale(o2Var.I.getHeight(), o2Var.I.getWidth());
                    } else {
                        matrix.postScale(o2Var.I.getWidth(), o2Var.I.getHeight());
                    }
                    if (list.isEmpty()) {
                        sg.l2 l2Var = new sg.l2(o2Var);
                        l2Var.h.set(0.0f, 0.0f, o2Var.I.getWidth(), o2Var.I.getHeight());
                        l2Var.i.set(l2Var.h);
                        matrix.mapRect(l2Var.i);
                        l2Var.c = i11;
                        Bitmap d = o2Var.d(0, 0, o2Var.I, false);
                        l2Var.d = d;
                        if (d == null) {
                            FileLog.e(new RuntimeException("createSmoothEdgesSegmentedImage failed on empty image"));
                            break;
                        } else {
                            l2Var.f = l2Var.c();
                            sg.o2.c(l2Var, o2Var.T, o2Var.U);
                            o2Var.O = l2Var.j;
                            o2Var.P = l2Var.k;
                            arrayList.add(l2Var);
                            AndroidUtilities.runOnUIThread(new sg.g2(o2Var, arrayList, fr0Var, l2Var, 0));
                            o2Var.E = l2Var;
                            o2Var.y = true;
                            o2Var.x = false;
                            break;
                        }
                    } else {
                        for (int i12 = 0; i12 < list.size(); i12++) {
                            sg.n2 n2Var = (sg.n2) list.get(i12);
                            sg.l2 l2Var2 = new sg.l2(o2Var);
                            l2Var2.h.set(n2Var.b, n2Var.c, r12 + n2Var.d, r14 + n2Var.e);
                            l2Var2.i.set(l2Var2.h);
                            matrix.mapRect(l2Var2.i);
                            l2Var2.c = i11;
                            Bitmap d10 = o2Var.d(n2Var.b, n2Var.c, n2Var.a, false);
                            l2Var2.d = d10;
                            if (d10 != null) {
                                l2Var2.f = l2Var2.c();
                                sg.o2.c(l2Var2, o2Var.T, o2Var.U);
                                o2Var.O = l2Var2.j;
                                o2Var.P = l2Var2.k;
                                arrayList.add(l2Var2);
                            }
                        }
                        o2Var.E = null;
                        o2Var.y = true;
                        o2Var.x = false;
                        AndroidUtilities.runOnUIThread(new s9.g(3, o2Var, arrayList));
                        break;
                    }
                }
                break;
            default:
                zh.p1 p1Var = (zh.p1) this.c;
                Context context = (Context) this.d;
                int i13 = this.b;
                TL_stars.StarGift starGift = (TL_stars.StarGift) this.e;
                Utilities.Callback callback = (Utilities.Callback) this.f;
                long j10 = p1Var.c0;
                zh.l0 l0Var = new zh.l0(p1Var, callback, 2);
                boolean z11 = starGift.limited;
                boolean z12 = false;
                if (z11 && (disallowedGiftsSettings2 = p1Var.b0) != null && disallowedGiftsSettings2.disallow_limited_stargifts) {
                    z10 = false;
                    z12 = true;
                } else {
                    z10 = false;
                }
                new zh.r0(p1Var, context, i13, starGift, j10, l0Var, z12, (z11 && (disallowedGiftsSettings = p1Var.b0) != null && disallowedGiftsSettings.disallow_unique_stargifts) ? true : z10).show();
                break;
        }
    }

    public /* synthetic */ hi1(zh.p1 p1Var, Context context, int i10, TL_stars.StarGift starGift, Utilities.Callback callback) {
        this.a = 2;
        this.c = p1Var;
        this.d = context;
        this.b = i10;
        this.e = starGift;
        this.f = callback;
    }
}
