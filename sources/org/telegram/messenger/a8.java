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
import org.telegram.ui.Components.o41;
import org.telegram.ui.Components.xi0;
import org.telegram.ui.su;
import org.telegram.ui.tn;
import org.telegram.ui.tu;
import org.telegram.ui.uu;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final /* synthetic */ class a8 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;

    public /* synthetic */ a8(MediaDataController mediaDataController, int i10, TLObject tLObject, org.telegram.ui.ActionBar.o2 o2Var, boolean z10, int i11) {
        this.e = mediaDataController;
        this.c = i10;
        this.f = tLObject;
        this.h = o2Var;
        this.b = z10;
        this.d = i11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        org.telegram.ui.Components.mc mcVar;
        int i10;
        int i11;
        int i12;
        xi0 xi0Var;
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
                ((MediaDataController) obj3).lambda$toggleStickerSets$118(this.c, (TLObject) obj2, (org.telegram.ui.ActionBar.o2) obj, this.b, this.d);
                break;
            case 1:
                ((SendMessagesHelper) obj3).lambda$performSendMessageRequest$99(this.b, (TLRPC.Message) obj2, this.c, (ArrayList) obj, this.d);
                break;
            case 2:
                ArrayList arrayList = (ArrayList) obj2;
                ArrayList arrayList2 = (ArrayList) obj;
                tn tnVar = ((org.telegram.ui.el) obj3).b;
                if (z10) {
                    i10 = ((org.telegram.ui.ActionBar.o2) tnVar).currentAccount;
                    MessagesController.getNotificationsSettings(i10).edit().remove("pin_" + tnVar.P5).commit();
                    tnVar.yc(0, true);
                    mcVar = null;
                } else {
                    mcVar = null;
                    tnVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didLoadPinnedMessages, Long.valueOf(tnVar.P5), arrayList, Boolean.TRUE, arrayList2, null, 0, Integer.valueOf(i15), Boolean.valueOf(tnVar.O4));
                }
                if (i14 == tnVar.y3) {
                    tnVar.w3 = mcVar;
                    break;
                }
                break;
            case 3:
                org.telegram.ui.Components.la laVar = (org.telegram.ui.Components.la) obj3;
                Bitmap bitmap = (Bitmap) obj2;
                String str = (String) obj;
                Paint paint = laVar.c;
                int i18 = laVar.d;
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
                    float f9 = i18;
                    canvas.translate((i11 / 2.0f) + f9, (i12 / 2.0f) + f9);
                    if (i14 == 1) {
                        canvas.scale(-1.0f, 1.0f);
                    } else if (i14 == 2) {
                        canvas.scale(1.0f, -1.0f);
                    }
                    canvas.rotate(i15);
                    float f10 = -i18;
                    canvas.translate(f10 - (round / 2.0f), f10 - (round2 / 2.0f));
                    try {
                        canvas.drawBitmap(bitmap, rect, rect2, (Paint) null);
                    } catch (Exception unused) {
                    }
                    Utilities.stackBlurBitmap(createBitmap, 6);
                    if (i18 > 0) {
                        float f11 = i20;
                        canvas.drawRect(0.0f, 0.0f, f11, f9, paint);
                        float f12 = i21;
                        canvas.drawRect(0.0f, f9, f9, f12, paint);
                        float f13 = i20 + i18;
                        canvas.drawRect(f11, f9, f13, f12, paint);
                        canvas.drawRect(0.0f, f12, f13, i21 + i18, paint);
                    }
                    AndroidUtilities.runOnUIThread(new eg.j(laVar, str, createBitmap, this.b, bitmap, 14));
                    break;
                }
                break;
            default:
                tu tuVar = (tu) obj3;
                Context context = (Context) obj2;
                org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) obj;
                uu uuVar = tuVar.c;
                uuVar.b();
                org.telegram.ui.Cells.m8 m8Var = uuVar.e;
                uuVar.d();
                int w02 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.q6, false);
                xi0 xi0Var2 = uuVar.d;
                xi0Var2.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new o41(tuVar, i15, w02));
                ofFloat.addListener(new org.telegram.ui.x0(tuVar, w02, i17));
                ofFloat.setDuration(350L);
                ofFloat.start();
                int w03 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.a7, false);
                Activity activity = context instanceof Activity ? (Activity) context : null;
                if ((activity != null ? activity.getWindow() : null) != null) {
                    ValueAnimator valueAnimator = uuVar.h;
                    if (valueAnimator != null && valueAnimator.isRunning()) {
                        uuVar.h.cancel();
                    }
                    ValueAnimator valueAnimator2 = uuVar.h;
                    if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                        i14 = uuVar.n;
                    }
                    int i22 = i14;
                    ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                    uuVar.h = ofFloat2;
                    float f14 = z10 ? 50.0f : 200.0f;
                    xi0Var = xi0Var2;
                    ofFloat2.addUpdateListener(new su(tuVar, f14, i22, w03, activity));
                    uuVar.h.addListener(new org.telegram.ui.x0(activity, w03, i16));
                    uuVar.h.setDuration(350L);
                    uuVar.h.start();
                } else {
                    xi0Var = xi0Var2;
                }
                if (org.telegram.ui.ActionBar.g6.f1()) {
                    m8Var.n(LocaleController.getString(R.string.SettingsSwitchToNightMode), xi0Var, true);
                } else {
                    m8Var.n(LocaleController.getString(R.string.SettingsSwitchToDayMode), xi0Var, true);
                }
                org.telegram.ui.ActionBar.g6.F1(o2Var);
                break;
        }
    }

    public /* synthetic */ a8(SendMessagesHelper sendMessagesHelper, boolean z10, TLRPC.Message message, int i10, ArrayList arrayList, int i11) {
        this.e = sendMessagesHelper;
        this.b = z10;
        this.f = message;
        this.c = i10;
        this.h = arrayList;
        this.d = i11;
    }

    public /* synthetic */ a8(org.telegram.ui.el elVar, boolean z10, ArrayList arrayList, ArrayList arrayList2, int i10, int i11) {
        this.e = elVar;
        this.b = z10;
        this.f = arrayList;
        this.h = arrayList2;
        this.c = i10;
        this.d = i11;
    }

    public /* synthetic */ a8(org.telegram.ui.Components.la laVar, Bitmap bitmap, int i10, int i11, String str, boolean z10) {
        this.e = laVar;
        this.f = bitmap;
        this.c = i10;
        this.d = i11;
        this.h = str;
        this.b = z10;
    }

    public /* synthetic */ a8(tu tuVar, int i10, Context context, int i11, boolean z10, org.telegram.ui.ActionBar.o2 o2Var) {
        this.e = tuVar;
        this.c = i10;
        this.f = context;
        this.d = i11;
        this.b = z10;
        this.h = o2Var;
    }
}
