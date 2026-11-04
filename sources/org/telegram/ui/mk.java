package org.telegram.ui;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import java.io.Serializable;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class mk implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Serializable h;

    public /* synthetic */ mk(g2.d dVar, Bitmap bitmap, int i3, int i10, String str, boolean z10) {
        this.e = dVar;
        this.f = bitmap;
        this.b = i3;
        this.c = i10;
        this.h = str;
        this.d = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        org.telegram.ui.Components.ac acVar;
        int i3;
        int i10;
        int i11;
        Rect rect;
        int i12 = this.a;
        Serializable serializable = this.h;
        int i13 = this.c;
        int i14 = this.b;
        Object obj = this.f;
        Object obj2 = this.e;
        switch (i12) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                ArrayList arrayList2 = (ArrayList) serializable;
                wm wmVar = ((nk) obj2).b;
                if (this.d) {
                    i3 = ((org.telegram.ui.ActionBar.d2) wmVar).currentAccount;
                    org.telegram.messenger.hp.s1(i3).d7.edit().remove("pin_" + wmVar.k6).commit();
                    wmVar.cd(0, true);
                    acVar = null;
                } else {
                    acVar = null;
                    wmVar.getNotificationCenter().k(56, Long.valueOf(wmVar.k6), arrayList, Boolean.TRUE, arrayList2, null, 0, Integer.valueOf(i14), Boolean.valueOf(wmVar.f5));
                }
                if (i13 == wmVar.R3) {
                    wmVar.P3 = acVar;
                    break;
                }
                break;
            default:
                g2.d dVar = (g2.d) obj2;
                Bitmap bitmap = (Bitmap) obj;
                String str = (String) serializable;
                Paint paint = (Paint) dVar.d;
                int i15 = dVar.a;
                if (bitmap != null && !bitmap.isRecycled()) {
                    float width = bitmap.getWidth() / bitmap.getHeight();
                    int round = (int) Math.round(Math.sqrt(width * 324.0f));
                    int round2 = (int) Math.round(Math.sqrt(324.0f / width));
                    if (i14 == 90 || i14 == 270) {
                        i10 = round2;
                        i11 = round;
                    } else {
                        i11 = round2;
                        i10 = round;
                    }
                    int i16 = i15 * 2;
                    Bitmap createBitmap = Bitmap.createBitmap(i16 + i10, i16 + i11, Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(createBitmap);
                    Rect rect2 = new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight());
                    int i17 = i15 + round;
                    int i18 = i15 + round2;
                    Rect rect3 = new Rect(i15, i15, i17, i18);
                    float f10 = i15;
                    canvas.translate((i10 / 2.0f) + f10, (i11 / 2.0f) + f10);
                    if (i13 == 1) {
                        canvas.scale(-1.0f, 1.0f);
                        rect = rect2;
                    } else {
                        rect = rect2;
                        if (i13 == 2) {
                            canvas.scale(1.0f, -1.0f);
                        }
                    }
                    canvas.rotate(i14);
                    float f11 = -i15;
                    canvas.translate(f11 - (round / 2.0f), f11 - (round2 / 2.0f));
                    try {
                        canvas.drawBitmap(bitmap, rect, rect3, (Paint) null);
                    } catch (Exception unused) {
                    }
                    Utilities.stackBlurBitmap(createBitmap, 6);
                    if (i15 > 0) {
                        float f12 = i17;
                        canvas.drawRect(0.0f, 0.0f, f12, f10, paint);
                        float f13 = i18;
                        canvas.drawRect(0.0f, f10, f10, f13, paint);
                        float f14 = i17 + i15;
                        canvas.drawRect(f12, f10, f14, f13, paint);
                        canvas.drawRect(0.0f, f13, f14, i18 + i15, paint);
                    }
                    org.telegram.messenger.g0.h3(new gi.q1(dVar, str, createBitmap, this.d, bitmap));
                    break;
                }
                break;
        }
    }

    public /* synthetic */ mk(nk nkVar, boolean z10, ArrayList arrayList, ArrayList arrayList2, int i3, int i10) {
        this.e = nkVar;
        this.d = z10;
        this.f = arrayList;
        this.h = arrayList2;
        this.b = i3;
        this.c = i10;
    }
}
