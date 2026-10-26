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

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class fi1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ fi1(Object obj, int i10, Object obj2, Object obj3, Object obj4, int i11) {
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
                sg.p2 p2Var = (sg.p2) this.c;
                int i11 = this.b;
                List list = (List) this.d;
                ArrayList arrayList = (ArrayList) this.e;
                dr0 dr0Var = (dr0) this.f;
                if (p2Var.I != null && !p2Var.y) {
                    Matrix matrix = new Matrix();
                    matrix.postScale(1.0f / p2Var.I.getWidth(), 1.0f / p2Var.I.getHeight());
                    matrix.postTranslate(-0.5f, -0.5f);
                    matrix.postRotate(i11);
                    matrix.postTranslate(0.5f, 0.5f);
                    if ((i11 / 90) % 2 != 0) {
                        matrix.postScale(p2Var.I.getHeight(), p2Var.I.getWidth());
                    } else {
                        matrix.postScale(p2Var.I.getWidth(), p2Var.I.getHeight());
                    }
                    if (list.isEmpty()) {
                        sg.m2 m2Var = new sg.m2(p2Var);
                        m2Var.h.set(0.0f, 0.0f, p2Var.I.getWidth(), p2Var.I.getHeight());
                        m2Var.i.set(m2Var.h);
                        matrix.mapRect(m2Var.i);
                        m2Var.c = i11;
                        Bitmap d = p2Var.d(0, 0, p2Var.I, false);
                        m2Var.d = d;
                        if (d == null) {
                            FileLog.e(new RuntimeException("createSmoothEdgesSegmentedImage failed on empty image"));
                            break;
                        } else {
                            m2Var.f = m2Var.c();
                            sg.p2.c(m2Var, p2Var.T, p2Var.U);
                            p2Var.O = m2Var.j;
                            p2Var.P = m2Var.k;
                            arrayList.add(m2Var);
                            AndroidUtilities.runOnUIThread(new sg.h2(p2Var, arrayList, dr0Var, m2Var, 0));
                            p2Var.E = m2Var;
                            p2Var.y = true;
                            p2Var.x = false;
                            break;
                        }
                    } else {
                        for (int i12 = 0; i12 < list.size(); i12++) {
                            sg.o2 o2Var = (sg.o2) list.get(i12);
                            sg.m2 m2Var2 = new sg.m2(p2Var);
                            m2Var2.h.set(o2Var.b, o2Var.c, r12 + o2Var.d, r14 + o2Var.e);
                            m2Var2.i.set(m2Var2.h);
                            matrix.mapRect(m2Var2.i);
                            m2Var2.c = i11;
                            Bitmap d10 = p2Var.d(o2Var.b, o2Var.c, o2Var.a, false);
                            m2Var2.d = d10;
                            if (d10 != null) {
                                m2Var2.f = m2Var2.c();
                                sg.p2.c(m2Var2, p2Var.T, p2Var.U);
                                p2Var.O = m2Var2.j;
                                p2Var.P = m2Var2.k;
                                arrayList.add(m2Var2);
                            }
                        }
                        p2Var.E = null;
                        p2Var.y = true;
                        p2Var.x = false;
                        AndroidUtilities.runOnUIThread(new sg.u(2, p2Var, arrayList));
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

    public /* synthetic */ fi1(zh.p1 p1Var, Context context, int i10, TL_stars.StarGift starGift, Utilities.Callback callback) {
        this.a = 2;
        this.c = p1Var;
        this.d = context;
        this.b = i10;
        this.e = starGift;
        this.f = callback;
    }
}
