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

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class b3 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ b3(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    private final void a(Object obj) {
        pa1 pa1Var = (pa1) this.b;
        String str = (String) obj;
        synchronized (pa1Var.d) {
            pa1Var.d.add(str);
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
                chatAttachAlertPhotoLayout.r0(null, null, ((Long) obj).longValue());
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
                nc0 nc0Var = (nc0) this.b;
                Integer num = (Integer) obj;
                ArrayList arrayList = nc0Var.e.a;
                ob0 ob0Var = nc0Var.f;
                if (((kc0) arrayList.get(ob0Var.getCurrentPosition())).a == num.intValue()) {
                    return;
                }
                int i10 = 0;
                int i11 = 0;
                while (true) {
                    if (i11 < arrayList.size()) {
                        if (((kc0) arrayList.get(i11)).a == num.intValue()) {
                            i10 = i11;
                        } else {
                            i11++;
                        }
                    }
                }
                if (ob0Var.getCurrentPosition() == i10) {
                    return;
                }
                ob0Var.E(i10);
                return;
            case 7:
                hc0 hc0Var = (hc0) this.b;
                hc0Var.n.y(hc0Var.f.T((View) obj));
                return;
            case 8:
                le0 le0Var = (le0) this.b;
                Integer num2 = (Integer) obj;
                FrameLayout frameLayout = le0Var.h;
                if (le0Var.getContext() == null) {
                    return;
                }
                boolean z10 = le0Var.getContext().getResources().getConfiguration().orientation == 2;
                int intValue = num2.intValue() - AndroidUtilities.navigationBarHeight;
                if (SharedConfig.passcodeType == 1) {
                    ViewPropertyAnimator animate = frameLayout.animate();
                    if (intValue <= AndroidUtilities.dp(20.0f)) {
                        height = 0.0f;
                    } else {
                        height = (((le0Var.getHeight() - intValue) / 2.0f) - (frameLayout.getHeight() / (z10 ? 1.0f : 2.0f))) - frameLayout.getTop();
                    }
                    ViewPropertyAnimator duration = animate.translationY(height).setDuration(320L);
                    ds dsVar = ds.h;
                    duration.setInterpolator(dsVar).start();
                    le0Var.M.animate().alpha(intValue > AndroidUtilities.dp(20.0f) ? 0.0f : 1.0f).setDuration(320L).setInterpolator(dsVar);
                    return;
                }
                return;
            case 9:
                jf0 jf0Var = (jf0) this.b;
                jf0Var.K.a(jf0Var.N, true, 0, ((Long) obj).longValue());
                jf0Var.dismiss();
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
                nz0 nz0Var = (nz0) this.b;
                TL_account.TL_birthday tL_birthday = (TL_account.TL_birthday) obj;
                TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
                updatebirthday.flags |= 1;
                updatebirthday.birthday = tL_birthday;
                int i12 = nz0Var.a;
                TLRPC.UserFull userFull = MessagesController.getInstance(i12).getUserFull(UserConfig.getInstance(i12).getClientUserId());
                TL_account.TL_birthday tL_birthday2 = userFull != null ? userFull.birthday : null;
                if (userFull != null) {
                    userFull.flags2 |= 32;
                    userFull.birthday = tL_birthday;
                    MessagesStorage.getInstance(i12).updateUserInfo(userFull, false);
                }
                ConnectionsManager.getInstance(i12).sendRequest(updatebirthday, new bi.h2(nz0Var, userFull, tL_birthday2, 18), 1024);
                MessagesController.getInstance(i12).invalidateContentSettings();
                MessagesController.getInstance(i12).removeSuggestion(0L, "BIRTHDAY_SETUP");
                NotificationCenter.getInstance(i12).lambda$postNotificationNameOnUIThread$1(NotificationCenter.newSuggestionsAvailable, new Object[0]);
                return;
            case 12:
                r71 r71Var = (r71) this.b;
                r71Var.g3.R(r71Var.T((View) obj), r71Var.k3);
                return;
            case 13:
                a(obj);
                return;
            default:
                ya1 ya1Var = (ya1) this.b;
                String str = (String) obj;
                ya1Var.getClass();
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    synchronized (ya1Var.d) {
                        ya1Var.a = jSONObject;
                        ya1Var.d.notifyAll();
                    }
                    return;
                } catch (Exception unused) {
                    return;
                }
        }
    }
}
