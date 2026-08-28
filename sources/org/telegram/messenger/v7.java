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
import org.telegram.ui.Components.d41;
import org.telegram.ui.Components.mi0;
import org.telegram.ui.qn;
import org.telegram.ui.ru;
import org.telegram.ui.su;
import org.telegram.ui.tu;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class v7 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;

    public /* synthetic */ v7(MediaDataController mediaDataController, int i9, TLObject tLObject, org.telegram.ui.ActionBar.o2 o2Var, boolean z10, int i10) {
        this.e = mediaDataController;
        this.c = i9;
        this.f = tLObject;
        this.h = o2Var;
        this.b = z10;
        this.d = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        org.telegram.ui.Components.gc gcVar;
        int i9;
        int i10;
        int i11;
        mi0 mi0Var;
        int i12 = this.a;
        boolean z10 = this.b;
        int i13 = this.d;
        int i14 = this.c;
        int i15 = 2;
        int i16 = 1;
        Object obj = this.h;
        Object obj2 = this.f;
        Object obj3 = this.e;
        switch (i12) {
            case 0:
                ((MediaDataController) obj3).lambda$toggleStickerSets$118(this.c, (TLObject) obj2, (org.telegram.ui.ActionBar.o2) obj, this.b, this.d);
                break;
            case 1:
                ((SendMessagesHelper) obj3).lambda$performSendMessageRequest$99(this.b, (TLRPC.Message) obj2, this.c, (ArrayList) obj, this.d);
                break;
            case 2:
                ArrayList arrayList = (ArrayList) obj2;
                ArrayList arrayList2 = (ArrayList) obj;
                qn qnVar = ((org.telegram.ui.bl) obj3).b;
                if (z10) {
                    i9 = ((org.telegram.ui.ActionBar.o2) qnVar).currentAccount;
                    MessagesController.getNotificationsSettings(i9).edit().remove("pin_" + qnVar.P5).commit();
                    qnVar.yc(0, true);
                    gcVar = null;
                } else {
                    gcVar = null;
                    qnVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didLoadPinnedMessages, Long.valueOf(qnVar.P5), arrayList, Boolean.TRUE, arrayList2, null, 0, Integer.valueOf(i14), Boolean.valueOf(qnVar.O4));
                }
                if (i13 == qnVar.y3) {
                    qnVar.w3 = gcVar;
                    break;
                }
                break;
            case 3:
                org.telegram.ui.Components.ga gaVar = (org.telegram.ui.Components.ga) obj3;
                Bitmap bitmap = (Bitmap) obj2;
                String str = (String) obj;
                Paint paint = gaVar.c;
                int i17 = gaVar.d;
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
                    int i18 = i17 * 2;
                    Bitmap createBitmap = Bitmap.createBitmap(i18 + i10, i18 + i11, Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(createBitmap);
                    Rect rect = new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight());
                    int i19 = i17 + round;
                    int i20 = i17 + round2;
                    Rect rect2 = new Rect(i17, i17, i19, i20);
                    float f10 = i17;
                    canvas.translate((i10 / 2.0f) + f10, (i11 / 2.0f) + f10);
                    if (i13 == 1) {
                        canvas.scale(-1.0f, 1.0f);
                    } else if (i13 == 2) {
                        canvas.scale(1.0f, -1.0f);
                    }
                    canvas.rotate(i14);
                    float f11 = -i17;
                    canvas.translate(f11 - (round / 2.0f), f11 - (round2 / 2.0f));
                    try {
                        canvas.drawBitmap(bitmap, rect, rect2, (Paint) null);
                    } catch (Exception unused) {
                    }
                    Utilities.stackBlurBitmap(createBitmap, 6);
                    if (i17 > 0) {
                        float f12 = i19;
                        canvas.drawRect(0.0f, 0.0f, f12, f10, paint);
                        float f13 = i20;
                        canvas.drawRect(0.0f, f10, f10, f13, paint);
                        float f14 = i19 + i17;
                        canvas.drawRect(f12, f10, f14, f13, paint);
                        canvas.drawRect(0.0f, f13, f14, i20 + i17, paint);
                    }
                    AndroidUtilities.runOnUIThread(new bg.m(gaVar, str, createBitmap, this.b, bitmap, 14));
                    break;
                }
                break;
            default:
                su suVar = (su) obj3;
                Context context = (Context) obj2;
                org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) obj;
                tu tuVar = suVar.c;
                tuVar.b();
                org.telegram.ui.Cells.p8 p8Var = tuVar.e;
                tuVar.d();
                int w02 = org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.q6, false);
                mi0 mi0Var2 = tuVar.d;
                mi0Var2.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new d41(suVar, i14, w02));
                ofFloat.addListener(new org.telegram.ui.w0(suVar, w02, i16));
                ofFloat.setDuration(350L);
                ofFloat.start();
                int w03 = org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.a7, false);
                Activity activity = context instanceof Activity ? (Activity) context : null;
                if ((activity != null ? activity.getWindow() : null) != null) {
                    ValueAnimator valueAnimator = tuVar.h;
                    if (valueAnimator != null && valueAnimator.isRunning()) {
                        tuVar.h.cancel();
                    }
                    ValueAnimator valueAnimator2 = tuVar.h;
                    if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                        i13 = tuVar.n;
                    }
                    int i21 = i13;
                    ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                    tuVar.h = ofFloat2;
                    float f15 = z10 ? 50.0f : 200.0f;
                    mi0Var = mi0Var2;
                    ofFloat2.addUpdateListener(new ru(suVar, f15, i21, w03, activity));
                    tuVar.h.addListener(new org.telegram.ui.w0(activity, w03, i15));
                    tuVar.h.setDuration(350L);
                    tuVar.h.start();
                } else {
                    mi0Var = mi0Var2;
                }
                if (org.telegram.ui.ActionBar.f6.f1()) {
                    p8Var.n(LocaleController.getString(R.string.SettingsSwitchToNightMode), mi0Var, true);
                } else {
                    p8Var.n(LocaleController.getString(R.string.SettingsSwitchToDayMode), mi0Var, true);
                }
                org.telegram.ui.ActionBar.f6.F1(o2Var);
                break;
        }
    }

    public /* synthetic */ v7(SendMessagesHelper sendMessagesHelper, boolean z10, TLRPC.Message message, int i9, ArrayList arrayList, int i10) {
        this.e = sendMessagesHelper;
        this.b = z10;
        this.f = message;
        this.c = i9;
        this.h = arrayList;
        this.d = i10;
    }

    public /* synthetic */ v7(org.telegram.ui.bl blVar, boolean z10, ArrayList arrayList, ArrayList arrayList2, int i9, int i10) {
        this.e = blVar;
        this.b = z10;
        this.f = arrayList;
        this.h = arrayList2;
        this.c = i9;
        this.d = i10;
    }

    public /* synthetic */ v7(org.telegram.ui.Components.ga gaVar, Bitmap bitmap, int i9, int i10, String str, boolean z10) {
        this.e = gaVar;
        this.f = bitmap;
        this.c = i9;
        this.d = i10;
        this.h = str;
        this.b = z10;
    }

    public /* synthetic */ v7(su suVar, int i9, Context context, int i10, boolean z10, org.telegram.ui.ActionBar.o2 o2Var) {
        this.e = suVar;
        this.c = i9;
        this.f = context;
        this.d = i10;
        this.b = z10;
        this.h = o2Var;
    }
}
