package org.telegram.messenger;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.wn;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final /* synthetic */ class d8 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;

    public /* synthetic */ d8(MediaDataController mediaDataController, int i10, TLObject tLObject, org.telegram.ui.ActionBar.r2 r2Var, boolean z10, int i11) {
        this.e = mediaDataController;
        this.c = i10;
        this.f = tLObject;
        this.h = r2Var;
        this.b = z10;
        this.d = i11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        org.telegram.ui.Components.qc qcVar;
        int i10;
        int i11;
        int i12;
        Canvas canvas;
        int i13 = this.a;
        int i14 = this.d;
        int i15 = this.c;
        Object obj = this.h;
        Object obj2 = this.f;
        Object obj3 = this.e;
        switch (i13) {
            case 0:
                ((MediaDataController) obj3).lambda$toggleStickerSets$118(this.c, (TLObject) obj2, (org.telegram.ui.ActionBar.r2) obj, this.b, this.d);
                break;
            case 1:
                ((SendMessagesHelper) obj3).lambda$performSendMessageRequest$102(this.b, (TLRPC.Message) obj2, this.c, (ArrayList) obj, this.d);
                break;
            case 2:
                ArrayList arrayList = (ArrayList) obj2;
                ArrayList arrayList2 = (ArrayList) obj;
                wn wnVar = ((org.telegram.ui.jl) obj3).b;
                if (this.b) {
                    i10 = ((org.telegram.ui.ActionBar.r2) wnVar).currentAccount;
                    MessagesController.getNotificationsSettings(i10).edit().remove("pin_" + wnVar.j6).commit();
                    wnVar.Pc(0, true);
                    qcVar = null;
                } else {
                    qcVar = null;
                    wnVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didLoadPinnedMessages, Long.valueOf(wnVar.j6), arrayList, Boolean.TRUE, arrayList2, null, 0, Integer.valueOf(i15), Boolean.valueOf(wnVar.e5));
                }
                if (i14 == wnVar.O3) {
                    wnVar.M3 = qcVar;
                    break;
                }
                break;
            default:
                org.telegram.ui.Components.qa qaVar = (org.telegram.ui.Components.qa) obj3;
                Bitmap bitmap = (Bitmap) obj2;
                String str = (String) obj;
                Paint paint = qaVar.c;
                int i16 = qaVar.d;
                if (bitmap != null && !bitmap.isRecycled()) {
                    float width = bitmap.getWidth() / bitmap.getHeight();
                    int round = (int) Math.round(Math.sqrt(width * 324.0f));
                    int round2 = (int) Math.round(Math.sqrt(324.0f / width));
                    if (i15 == 90 || i15 == 270) {
                        i11 = round2;
                        i12 = round;
                    } else {
                        i12 = round2;
                        i11 = round;
                    }
                    int i17 = i16 * 2;
                    Bitmap createBitmap = Bitmap.createBitmap(i17 + i11, i17 + i12, Bitmap.Config.ARGB_8888);
                    Canvas canvas2 = new Canvas(createBitmap);
                    Rect rect = new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight());
                    int i18 = i16 + round;
                    int i19 = i16 + round2;
                    Rect rect2 = new Rect(i16, i16, i18, i19);
                    float f7 = i16;
                    canvas2.translate((i11 / 2.0f) + f7, (i12 / 2.0f) + f7);
                    if (i14 == 1) {
                        canvas2.scale(-1.0f, 1.0f);
                        canvas = canvas2;
                    } else {
                        canvas = canvas2;
                        if (i14 == 2) {
                            canvas.scale(1.0f, -1.0f);
                        }
                    }
                    canvas.rotate(i15);
                    float f10 = -i16;
                    canvas.translate(f10 - (round / 2.0f), f10 - (round2 / 2.0f));
                    try {
                        canvas.drawBitmap(bitmap, rect, rect2, (Paint) null);
                    } catch (Exception unused) {
                    }
                    Utilities.stackBlurBitmap(createBitmap, 6);
                    if (i16 > 0) {
                        float f11 = i18;
                        Canvas canvas3 = canvas;
                        canvas3.drawRect(0.0f, 0.0f, f11, f7, paint);
                        float f12 = i19;
                        canvas3.drawRect(0.0f, f7, f7, f12, paint);
                        float f13 = i18 + i16;
                        canvas3.drawRect(f11, f7, f13, f12, paint);
                        canvas3.drawRect(0.0f, f12, f13, i19 + i16, paint);
                    }
                    AndroidUtilities.runOnUIThread(new fi.r1(qaVar, str, createBitmap, this.b, bitmap));
                    break;
                }
                break;
        }
    }

    public /* synthetic */ d8(SendMessagesHelper sendMessagesHelper, boolean z10, TLRPC.Message message, int i10, ArrayList arrayList, int i11) {
        this.e = sendMessagesHelper;
        this.b = z10;
        this.f = message;
        this.c = i10;
        this.h = arrayList;
        this.d = i11;
    }

    public /* synthetic */ d8(org.telegram.ui.jl jlVar, boolean z10, ArrayList arrayList, ArrayList arrayList2, int i10, int i11) {
        this.e = jlVar;
        this.b = z10;
        this.f = arrayList;
        this.h = arrayList2;
        this.c = i10;
        this.d = i11;
    }

    public /* synthetic */ d8(org.telegram.ui.Components.qa qaVar, Bitmap bitmap, int i10, int i11, String str, boolean z10) {
        this.e = qaVar;
        this.f = bitmap;
        this.c = i10;
        this.d = i11;
        this.h = str;
        this.b = z10;
    }
}
