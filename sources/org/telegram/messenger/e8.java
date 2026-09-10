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
import org.telegram.ui.Components.hj0;
import org.telegram.ui.Components.n51;
import org.telegram.ui.eo;
import org.telegram.ui.ev;
import org.telegram.ui.fv;
import org.telegram.ui.hv;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final /* synthetic */ class e8 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;

    public /* synthetic */ e8(MediaDataController mediaDataController, int i10, TLObject tLObject, org.telegram.ui.ActionBar.p2 p2Var, boolean z10, int i11) {
        this.e = mediaDataController;
        this.c = i10;
        this.f = tLObject;
        this.h = p2Var;
        this.b = z10;
        this.d = i11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        org.telegram.ui.Components.pc pcVar;
        int i10;
        int i11;
        int i12;
        hj0 hj0Var;
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
                ((MediaDataController) obj3).lambda$toggleStickerSets$118(this.c, (TLObject) obj2, (org.telegram.ui.ActionBar.p2) obj, this.b, this.d);
                break;
            case 1:
                ((SendMessagesHelper) obj3).lambda$performSendMessageRequest$99(this.b, (TLRPC.Message) obj2, this.c, (ArrayList) obj, this.d);
                break;
            case 2:
                ArrayList arrayList = (ArrayList) obj2;
                ArrayList arrayList2 = (ArrayList) obj;
                eo eoVar = ((org.telegram.ui.pl) obj3).b;
                if (z10) {
                    i10 = ((org.telegram.ui.ActionBar.p2) eoVar).currentAccount;
                    MessagesController.getNotificationsSettings(i10).edit().remove("pin_" + eoVar.T5).commit();
                    eoVar.yc(0, true);
                    pcVar = null;
                } else {
                    pcVar = null;
                    eoVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didLoadPinnedMessages, Long.valueOf(eoVar.T5), arrayList, Boolean.TRUE, arrayList2, null, 0, Integer.valueOf(i15), Boolean.valueOf(eoVar.S4));
                }
                if (i14 == eoVar.C3) {
                    eoVar.A3 = pcVar;
                    break;
                }
                break;
            case 3:
                org.telegram.ui.Components.na naVar = (org.telegram.ui.Components.na) obj3;
                Bitmap bitmap = (Bitmap) obj2;
                String str = (String) obj;
                Paint paint = naVar.c;
                int i18 = naVar.d;
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
                    float f7 = i18;
                    canvas.translate((i11 / 2.0f) + f7, (i12 / 2.0f) + f7);
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
                        canvas.drawRect(0.0f, 0.0f, f11, f7, paint);
                        float f12 = i21;
                        canvas.drawRect(0.0f, f7, f7, f12, paint);
                        float f13 = i20 + i18;
                        canvas.drawRect(f11, f7, f13, f12, paint);
                        canvas.drawRect(0.0f, f12, f13, i21 + i18, paint);
                    }
                    AndroidUtilities.runOnUIThread(new bi.e2(naVar, str, createBitmap, this.b, bitmap));
                    break;
                }
                break;
            default:
                fv fvVar = (fv) obj3;
                Context context = (Context) obj2;
                org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) obj;
                hv hvVar = fvVar.c;
                hvVar.b();
                org.telegram.ui.Cells.s8 s8Var = hvVar.e;
                hvVar.d();
                int w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.q6, false);
                hj0 hj0Var2 = hvVar.d;
                hj0Var2.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new n51(fvVar, i15, w02));
                ofFloat.addListener(new org.telegram.ui.u0(fvVar, w02, i17));
                ofFloat.setDuration(350L);
                ofFloat.start();
                int w03 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.a7, false);
                Activity activity = context instanceof Activity ? (Activity) context : null;
                if ((activity != null ? activity.getWindow() : null) != null) {
                    ValueAnimator valueAnimator = hvVar.h;
                    if (valueAnimator != null && valueAnimator.isRunning()) {
                        hvVar.h.cancel();
                    }
                    ValueAnimator valueAnimator2 = hvVar.h;
                    if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                        i14 = hvVar.n;
                    }
                    int i22 = i14;
                    ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                    hvVar.h = ofFloat2;
                    float f14 = z10 ? 50.0f : 200.0f;
                    hj0Var = hj0Var2;
                    ofFloat2.addUpdateListener(new ev(fvVar, f14, i22, w03, activity));
                    hvVar.h.addListener(new org.telegram.ui.u0(activity, w03, i16));
                    hvVar.h.setDuration(350L);
                    hvVar.h.start();
                } else {
                    hj0Var = hj0Var2;
                }
                if (org.telegram.ui.ActionBar.j6.f1()) {
                    s8Var.n(LocaleController.getString(R.string.SettingsSwitchToNightMode), hj0Var, true);
                } else {
                    s8Var.n(LocaleController.getString(R.string.SettingsSwitchToDayMode), hj0Var, true);
                }
                org.telegram.ui.ActionBar.j6.F1(p2Var);
                break;
        }
    }

    public /* synthetic */ e8(SendMessagesHelper sendMessagesHelper, boolean z10, TLRPC.Message message, int i10, ArrayList arrayList, int i11) {
        this.e = sendMessagesHelper;
        this.b = z10;
        this.f = message;
        this.c = i10;
        this.h = arrayList;
        this.d = i11;
    }

    public /* synthetic */ e8(org.telegram.ui.pl plVar, boolean z10, ArrayList arrayList, ArrayList arrayList2, int i10, int i11) {
        this.e = plVar;
        this.b = z10;
        this.f = arrayList;
        this.h = arrayList2;
        this.c = i10;
        this.d = i11;
    }

    public /* synthetic */ e8(org.telegram.ui.Components.na naVar, Bitmap bitmap, int i10, int i11, String str, boolean z10) {
        this.e = naVar;
        this.f = bitmap;
        this.c = i10;
        this.d = i11;
        this.h = str;
        this.b = z10;
    }

    public /* synthetic */ e8(fv fvVar, int i10, Context context, int i11, boolean z10, org.telegram.ui.ActionBar.p2 p2Var) {
        this.e = fvVar;
        this.c = i10;
        this.f = context;
        this.d = i11;
        this.b = z10;
        this.h = p2Var;
    }
}
