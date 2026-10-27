package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.ColorMatrix;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class b3 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ b3(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    private final void a(Object obj) {
        qa1 qa1Var = (qa1) this.b;
        String str = (String) obj;
        synchronized (qa1Var.d) {
            qa1Var.d.add(str);
        }
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        float height;
        switch (this.a) {
            case 0:
                ((h2) this.b).run();
                return;
            case 1:
                CharSequence charSequence = (CharSequence) obj;
                fi.g gVar = ((jd) this.b).f;
                gVar.setText(charSequence);
                gVar.w(charSequence.length(), charSequence.length());
                return;
            case 2:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = ((tm) this.b).v;
                chatAttachAlertPhotoLayout.s0(null, null, ((Long) obj).longValue());
                chatAttachAlertPhotoLayout.b.dismiss();
                return;
            case 3:
                MessagesController.getInstance(((ct) this.b).P).openApp((TLRPC.User) obj, 0);
                return;
            case 4:
                ((ju) this.b).performMenuAction(((Integer) obj).intValue());
                return;
            case 5:
                Runnable runnable = (Runnable) this.b;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 6:
                oc0 oc0Var = (oc0) this.b;
                Integer num = (Integer) obj;
                ArrayList arrayList = oc0Var.e.a;
                pb0 pb0Var = oc0Var.f;
                if (((lc0) arrayList.get(pb0Var.getCurrentPosition())).a == num.intValue()) {
                    return;
                }
                int i10 = 0;
                int i11 = 0;
                while (true) {
                    if (i11 < arrayList.size()) {
                        if (((lc0) arrayList.get(i11)).a == num.intValue()) {
                            i10 = i11;
                        } else {
                            i11++;
                        }
                    }
                }
                if (pb0Var.getCurrentPosition() == i10) {
                    return;
                }
                pb0Var.E(i10);
                return;
            case 7:
                ic0 ic0Var = (ic0) this.b;
                ic0Var.n.y(ic0Var.f.T((View) obj));
                return;
            case 8:
                me0 me0Var = (me0) this.b;
                Integer num2 = (Integer) obj;
                FrameLayout frameLayout = me0Var.h;
                if (me0Var.getContext() == null) {
                    return;
                }
                boolean z10 = me0Var.getContext().getResources().getConfiguration().orientation == 2;
                int intValue = num2.intValue() - AndroidUtilities.navigationBarHeight;
                if (SharedConfig.passcodeType == 1) {
                    ViewPropertyAnimator animate = frameLayout.animate();
                    if (intValue <= AndroidUtilities.dp(20.0f)) {
                        height = 0.0f;
                    } else {
                        height = (((me0Var.getHeight() - intValue) / 2.0f) - (frameLayout.getHeight() / (z10 ? 1.0f : 2.0f))) - frameLayout.getTop();
                    }
                    ViewPropertyAnimator duration = animate.translationY(height).setDuration(320L);
                    ds dsVar = ds.h;
                    duration.setInterpolator(dsVar).start();
                    me0Var.M.animate().alpha(intValue > AndroidUtilities.dp(20.0f) ? 0.0f : 1.0f).setDuration(320L).setInterpolator(dsVar);
                    return;
                }
                return;
            case 9:
                kf0 kf0Var = (kf0) this.b;
                kf0Var.K.a(kf0Var.N, true, 0, ((Long) obj).longValue());
                kf0Var.dismiss();
                return;
            case 10:
                Utilities.Callback2 callback2 = (Utilities.Callback2) this.b;
                Bitmap bitmap = (Bitmap) obj;
                ColorMatrix colorMatrix = new ColorMatrix();
                AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, org.telegram.ui.ActionBar.y6.I.q() ? 0.04f : 0.25f);
                AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, org.telegram.ui.ActionBar.y6.I.q() ? -0.04f : -0.07f);
                Bitmap applyColorMatrix = AndroidUtilities.applyColorMatrix(bitmap, colorMatrix);
                applyColorMatrix.setHasAlpha(false);
                ColorMatrix colorMatrix2 = new ColorMatrix();
                colorMatrix2.setSaturation(org.telegram.ui.ActionBar.y6.I.q() ? 2.0f : 3.0f);
                if (!org.telegram.ui.ActionBar.y6.I.q()) {
                    AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix2, org.telegram.ui.ActionBar.y6.I.q() ? -0.2f : -0.07f);
                }
                Bitmap applyColorMatrix2 = AndroidUtilities.applyColorMatrix(bitmap, colorMatrix2);
                applyColorMatrix2.setHasAlpha(false);
                bitmap.recycle();
                callback2.run(applyColorMatrix, applyColorMatrix2);
                return;
            case 11:
                oz0 oz0Var = (oz0) this.b;
                TL_account.TL_birthday tL_birthday = (TL_account.TL_birthday) obj;
                TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
                updatebirthday.flags |= 1;
                updatebirthday.birthday = tL_birthday;
                int i12 = oz0Var.a;
                TLRPC.UserFull userFull = MessagesController.getInstance(i12).getUserFull(UserConfig.getInstance(i12).getClientUserId());
                TL_account.TL_birthday tL_birthday2 = userFull != null ? userFull.birthday : null;
                if (userFull != null) {
                    userFull.flags2 |= 32;
                    userFull.birthday = tL_birthday;
                    MessagesStorage.getInstance(i12).updateUserInfo(userFull, false);
                }
                ConnectionsManager.getInstance(i12).sendRequest(updatebirthday, new bi.h2(oz0Var, userFull, tL_birthday2, 18), 1024);
                MessagesController.getInstance(i12).invalidateContentSettings();
                MessagesController.getInstance(i12).removeSuggestion(0L, "BIRTHDAY_SETUP");
                NotificationCenter.getInstance(i12).lambda$postNotificationNameOnUIThread$1(NotificationCenter.newSuggestionsAvailable, new Object[0]);
                return;
            case 12:
                s71 s71Var = (s71) this.b;
                s71Var.g3.R(s71Var.T((View) obj), s71Var.k3);
                return;
            case 13:
                a(obj);
                return;
            default:
                za1 za1Var = (za1) this.b;
                String str = (String) obj;
                za1Var.getClass();
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    synchronized (za1Var.f) {
                        za1Var.a = jSONObject;
                        za1Var.f.notifyAll();
                    }
                    return;
                } catch (Exception unused) {
                    return;
                }
        }
    }
}
