package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.ColorMatrix;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import java.util.ArrayList;
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

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class v2 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ v2(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        float height;
        switch (this.a) {
            case 0:
                ((ah.b) this.b).run();
                break;
            case 1:
                CharSequence charSequence = (CharSequence) obj;
                ph.f fVar = ((bd) this.b).f;
                fVar.setText(charSequence);
                fVar.w(charSequence.length(), charSequence.length());
                break;
            case 2:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = ((dm) this.b).v;
                chatAttachAlertPhotoLayout.r0(null, null, ((Long) obj).longValue());
                chatAttachAlertPhotoLayout.b.dismiss();
                break;
            case 3:
                MessagesController.getInstance(((os) this.b).K).openApp((TLRPC.User) obj, 0);
                break;
            case 4:
                ((ut) this.b).performMenuAction(((Integer) obj).intValue());
                break;
            case 5:
                Runnable runnable = (Runnable) this.b;
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            case 6:
                ((ea0) this.b).S.Y0(((Integer) obj).intValue() + 8);
                break;
            case 7:
                xb0 xb0Var = (xb0) this.b;
                Integer num = (Integer) obj;
                ArrayList arrayList = xb0Var.e.a;
                ya0 ya0Var = xb0Var.f;
                if (((ub0) arrayList.get(ya0Var.getCurrentPosition())).a != num.intValue()) {
                    int i10 = 0;
                    int i11 = 0;
                    while (true) {
                        if (i11 < arrayList.size()) {
                            if (((ub0) arrayList.get(i11)).a == num.intValue()) {
                                i10 = i11;
                            } else {
                                i11++;
                            }
                        }
                    }
                    if (ya0Var.getCurrentPosition() != i10) {
                        ya0Var.D(i10);
                        break;
                    }
                }
                break;
            case 8:
                wd0 wd0Var = (wd0) this.b;
                Integer num2 = (Integer) obj;
                FrameLayout frameLayout = wd0Var.h;
                if (wd0Var.getContext() != null) {
                    boolean z4 = wd0Var.getContext().getResources().getConfiguration().orientation == 2;
                    int intValue = num2.intValue() - AndroidUtilities.navigationBarHeight;
                    if (SharedConfig.passcodeType == 1) {
                        ViewPropertyAnimator animate = frameLayout.animate();
                        if (intValue <= AndroidUtilities.dp(20.0f)) {
                            height = 0.0f;
                        } else {
                            height = (((wd0Var.getHeight() - intValue) / 2.0f) - (frameLayout.getHeight() / (z4 ? 1.0f : 2.0f))) - frameLayout.getTop();
                        }
                        ViewPropertyAnimator duration = animate.translationY(height).setDuration(320L);
                        mr mrVar = mr.h;
                        duration.setInterpolator(mrVar).start();
                        wd0Var.F.animate().alpha(intValue > AndroidUtilities.dp(20.0f) ? 0.0f : 1.0f).setDuration(320L).setInterpolator(mrVar);
                        break;
                    }
                }
                break;
            case 9:
                te0 te0Var = (te0) this.b;
                te0Var.H.a(te0Var.K, true, 0, ((Long) obj).longValue());
                te0Var.dismiss();
                break;
            case 10:
                Utilities.Callback2 callback2 = (Utilities.Callback2) this.b;
                Bitmap bitmap = (Bitmap) obj;
                ColorMatrix colorMatrix = new ColorMatrix();
                AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, org.telegram.ui.ActionBar.j6.I.q() ? 0.04f : 0.25f);
                AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, org.telegram.ui.ActionBar.j6.I.q() ? -0.04f : -0.07f);
                Bitmap applyColorMatrix = AndroidUtilities.applyColorMatrix(bitmap, colorMatrix);
                applyColorMatrix.setHasAlpha(false);
                ColorMatrix colorMatrix2 = new ColorMatrix();
                colorMatrix2.setSaturation(org.telegram.ui.ActionBar.j6.I.q() ? 2.0f : 3.0f);
                if (!org.telegram.ui.ActionBar.j6.I.q()) {
                    AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix2, org.telegram.ui.ActionBar.j6.I.q() ? -0.2f : -0.07f);
                }
                Bitmap applyColorMatrix2 = AndroidUtilities.applyColorMatrix(bitmap, colorMatrix2);
                applyColorMatrix2.setHasAlpha(false);
                bitmap.recycle();
                callback2.run(applyColorMatrix, applyColorMatrix2);
                break;
            default:
                ky0 ky0Var = (ky0) this.b;
                TL_account.TL_birthday tL_birthday = (TL_account.TL_birthday) obj;
                TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
                updatebirthday.flags |= 1;
                updatebirthday.birthday = tL_birthday;
                int i12 = ky0Var.a;
                TLRPC.UserFull userFull = MessagesController.getInstance(i12).getUserFull(UserConfig.getInstance(i12).getClientUserId());
                TL_account.TL_birthday tL_birthday2 = userFull != null ? userFull.birthday : null;
                if (userFull != null) {
                    userFull.flags2 |= 32;
                    userFull.birthday = tL_birthday;
                    MessagesStorage.getInstance(i12).updateUserInfo(userFull, false);
                }
                ConnectionsManager.getInstance(i12).sendRequest(updatebirthday, new gg.y(ky0Var, userFull, tL_birthday2, 18), 1024);
                MessagesController.getInstance(i12).invalidateContentSettings();
                MessagesController.getInstance(i12).removeSuggestion(0L, "BIRTHDAY_SETUP");
                NotificationCenter.getInstance(i12).lambda$postNotificationNameOnUIThread$1(NotificationCenter.newSuggestionsAvailable, new Object[0]);
                break;
        }
    }
}
