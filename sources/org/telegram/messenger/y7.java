package org.telegram.messenger;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.f41;
import org.telegram.ui.Components.oi0;
import org.telegram.ui.rn;
import org.telegram.ui.uu;
import org.telegram.ui.vu;
import org.telegram.ui.wu;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final /* synthetic */ class y7 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;

    public /* synthetic */ y7(MediaDataController mediaDataController, int i10, TLObject tLObject, org.telegram.ui.ActionBar.n2 n2Var, boolean z10, int i11) {
        this.e = mediaDataController;
        this.c = i10;
        this.f = tLObject;
        this.h = n2Var;
        this.b = z10;
        this.d = i11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        org.telegram.ui.Components.ec ecVar;
        int i10;
        int i11;
        int i12;
        oi0 oi0Var;
        int i13 = this.a;
        boolean z10 = this.b;
        int i14 = this.d;
        int i15 = this.c;
        int i16 = 2;
        int i17 = 1;
        Object obj = this.h;
        Object obj2 = this.f;
        Object obj3 = this.e;
        switch (i13) {
            case 0:
                ((MediaDataController) obj3).lambda$toggleStickerSets$118(this.c, (TLObject) obj2, (org.telegram.ui.ActionBar.n2) obj, this.b, this.d);
                break;
            case 1:
                ((SendMessagesHelper) obj3).lambda$performSendMessageRequest$99(this.b, (TLRPC.Message) obj2, this.c, (ArrayList) obj, this.d);
                break;
            case 2:
                ArrayList arrayList = (ArrayList) obj2;
                ArrayList arrayList2 = (ArrayList) obj;
                rn rnVar = ((org.telegram.ui.dl) obj3).b;
                if (z10) {
                    i10 = ((org.telegram.ui.ActionBar.n2) rnVar).currentAccount;
                    MessagesController.getNotificationsSettings(i10).edit().remove("pin_" + rnVar.P5).commit();
                    rnVar.yc(0, true);
                    ecVar = null;
                } else {
                    ecVar = null;
                    rnVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didLoadPinnedMessages, Long.valueOf(rnVar.P5), arrayList, Boolean.TRUE, arrayList2, null, 0, Integer.valueOf(i15), Boolean.valueOf(rnVar.O4));
                }
                if (i14 == rnVar.y3) {
                    rnVar.w3 = ecVar;
                    break;
                }
                break;
            case 3:
                org.telegram.ui.Components.ea eaVar = (org.telegram.ui.Components.ea) obj3;
                Bitmap bitmap = (Bitmap) obj2;
                String str = (String) obj;
                Paint paint = eaVar.c;
                int i18 = eaVar.d;
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
                    int i19 = i18 * 2;
                    Bitmap createBitmap = Bitmap.createBitmap(i19 + i11, i19 + i12, Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(createBitmap);
                    Rect rect = new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight());
                    int i20 = i18 + round;
                    int i21 = i18 + round2;
                    Rect rect2 = new Rect(i18, i18, i20, i21);
                    float f10 = i18;
                    canvas.translate((i11 / 2.0f) + f10, (i12 / 2.0f) + f10);
                    if (i14 == 1) {
                        canvas.scale(-1.0f, 1.0f);
                    } else if (i14 == 2) {
                        canvas.scale(1.0f, -1.0f);
                    }
                    canvas.rotate(i15);
                    float f11 = -i18;
                    canvas.translate(f11 - (round / 2.0f), f11 - (round2 / 2.0f));
                    try {
                        canvas.drawBitmap(bitmap, rect, rect2, (Paint) null);
                    } catch (Exception unused) {
                    }
                    Utilities.stackBlurBitmap(createBitmap, 6);
                    if (i18 > 0) {
                        float f12 = i20;
                        canvas.drawRect(0.0f, 0.0f, f12, f10, paint);
                        float f13 = i21;
                        canvas.drawRect(0.0f, f10, f10, f13, paint);
                        float f14 = i20 + i18;
                        canvas.drawRect(f12, f10, f14, f13, paint);
                        canvas.drawRect(0.0f, f13, f14, i21 + i18, paint);
                    }
                    AndroidUtilities.runOnUIThread(new cg.j(eaVar, str, createBitmap, this.b, bitmap, 14));
                    break;
                }
                break;
            default:
                vu vuVar = (vu) obj3;
                Context context = (Context) obj2;
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) obj;
                wu wuVar = vuVar.c;
                wuVar.b();
                org.telegram.ui.Cells.l8 l8Var = wuVar.e;
                wuVar.d();
                int w02 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.q6, false);
                oi0 oi0Var2 = wuVar.d;
                oi0Var2.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new f41(vuVar, i15, w02));
                ofFloat.addListener(new org.telegram.ui.x0(vuVar, w02, i17));
                ofFloat.setDuration(350L);
                ofFloat.start();
                int w03 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.a7, false);
                Activity activity = context instanceof Activity ? (Activity) context : null;
                if ((activity != null ? activity.getWindow() : null) != null) {
                    ValueAnimator valueAnimator = wuVar.h;
                    if (valueAnimator != null && valueAnimator.isRunning()) {
                        wuVar.h.cancel();
                    }
                    ValueAnimator valueAnimator2 = wuVar.h;
                    if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                        i14 = wuVar.n;
                    }
                    int i22 = i14;
                    ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                    wuVar.h = ofFloat2;
                    float f15 = z10 ? 50.0f : 200.0f;
                    oi0Var = oi0Var2;
                    ofFloat2.addUpdateListener(new uu(vuVar, f15, i22, w03, activity));
                    wuVar.h.addListener(new org.telegram.ui.x0(activity, w03, i16));
                    wuVar.h.setDuration(350L);
                    wuVar.h.start();
                } else {
                    oi0Var = oi0Var2;
                }
                if (org.telegram.ui.ActionBar.g6.f1()) {
                    l8Var.n(LocaleController.getString(R.string.SettingsSwitchToNightMode), oi0Var, true);
                } else {
                    l8Var.n(LocaleController.getString(R.string.SettingsSwitchToDayMode), oi0Var, true);
                }
                org.telegram.ui.ActionBar.g6.F1(n2Var);
                break;
        }
    }

    public /* synthetic */ y7(SendMessagesHelper sendMessagesHelper, boolean z10, TLRPC.Message message, int i10, ArrayList arrayList, int i11) {
        this.e = sendMessagesHelper;
        this.b = z10;
        this.f = message;
        this.c = i10;
        this.h = arrayList;
        this.d = i11;
    }

    public /* synthetic */ y7(org.telegram.ui.dl dlVar, boolean z10, ArrayList arrayList, ArrayList arrayList2, int i10, int i11) {
        this.e = dlVar;
        this.b = z10;
        this.f = arrayList;
        this.h = arrayList2;
        this.c = i10;
        this.d = i11;
    }

    public /* synthetic */ y7(org.telegram.ui.Components.ea eaVar, Bitmap bitmap, int i10, int i11, String str, boolean z10) {
        this.e = eaVar;
        this.f = bitmap;
        this.c = i10;
        this.d = i11;
        this.h = str;
        this.b = z10;
    }

    public /* synthetic */ y7(vu vuVar, int i10, Context context, int i11, boolean z10, org.telegram.ui.ActionBar.n2 n2Var) {
        this.e = vuVar;
        this.c = i10;
        this.f = context;
        this.d = i11;
        this.b = z10;
        this.h = n2Var;
    }
}
