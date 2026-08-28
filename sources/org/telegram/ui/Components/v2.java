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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class v2 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ v2(Object obj, int i9) {
        this.a = i9;
        this.b = obj;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        float height;
        switch (this.a) {
            case 0:
                ((bg.c2) this.b).run();
                break;
            case 1:
                CharSequence charSequence = (CharSequence) obj;
                kh.g gVar = ((ad) this.b).f;
                gVar.setText(charSequence);
                gVar.w(charSequence.length(), charSequence.length());
                break;
            case 2:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = ((yl) this.b).v;
                chatAttachAlertPhotoLayout.q0(null, null, ((Long) obj).longValue());
                chatAttachAlertPhotoLayout.b.dismiss();
                break;
            case 3:
                MessagesController.getInstance(((hs) this.b).J).openApp((TLRPC.User) obj, 0);
                break;
            case 4:
                ((mt) this.b).performMenuAction(((Integer) obj).intValue());
                break;
            case 5:
                Runnable runnable = (Runnable) this.b;
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            case 6:
                ((k90) this.b).R.Y0(((Integer) obj).intValue() + 8);
                break;
            case 7:
                cb0 cb0Var = (cb0) this.b;
                Integer num = (Integer) obj;
                ArrayList arrayList = cb0Var.e.a;
                ea0 ea0Var = cb0Var.f;
                if (((za0) arrayList.get(ea0Var.getCurrentPosition())).a != num.intValue()) {
                    int i9 = 0;
                    int i10 = 0;
                    while (true) {
                        if (i10 < arrayList.size()) {
                            if (((za0) arrayList.get(i10)).a == num.intValue()) {
                                i9 = i10;
                            } else {
                                i10++;
                            }
                        }
                    }
                    if (ea0Var.getCurrentPosition() != i9) {
                        ea0Var.D(i9);
                        break;
                    }
                }
                break;
            case 8:
                yc0 yc0Var = (yc0) this.b;
                Integer num2 = (Integer) obj;
                FrameLayout frameLayout = yc0Var.h;
                if (yc0Var.getContext() != null) {
                    boolean z10 = yc0Var.getContext().getResources().getConfiguration().orientation == 2;
                    int intValue = num2.intValue() - AndroidUtilities.navigationBarHeight;
                    if (SharedConfig.passcodeType == 1) {
                        ViewPropertyAnimator animate = frameLayout.animate();
                        if (intValue <= AndroidUtilities.dp(20.0f)) {
                            height = 0.0f;
                        } else {
                            height = (((yc0Var.getHeight() - intValue) / 2.0f) - (frameLayout.getHeight() / (z10 ? 1.0f : 2.0f))) - frameLayout.getTop();
                        }
                        ViewPropertyAnimator duration = animate.translationY(height).setDuration(320L);
                        gr grVar = gr.h;
                        duration.setInterpolator(grVar).start();
                        yc0Var.E.animate().alpha(intValue > AndroidUtilities.dp(20.0f) ? 0.0f : 1.0f).setDuration(320L).setInterpolator(grVar);
                        break;
                    }
                }
                break;
            case 9:
                wd0 wd0Var = (wd0) this.b;
                wd0Var.G.b(wd0Var.J, true, 0, ((Long) obj).longValue());
                wd0Var.dismiss();
                break;
            case 10:
                Utilities.Callback2 callback2 = (Utilities.Callback2) this.b;
                Bitmap bitmap = (Bitmap) obj;
                ColorMatrix colorMatrix = new ColorMatrix();
                AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, org.telegram.ui.ActionBar.f6.I.q() ? 0.04f : 0.25f);
                AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, org.telegram.ui.ActionBar.f6.I.q() ? -0.04f : -0.07f);
                Bitmap applyColorMatrix = AndroidUtilities.applyColorMatrix(bitmap, colorMatrix);
                applyColorMatrix.setHasAlpha(false);
                ColorMatrix colorMatrix2 = new ColorMatrix();
                colorMatrix2.setSaturation(org.telegram.ui.ActionBar.f6.I.q() ? 2.0f : 3.0f);
                if (!org.telegram.ui.ActionBar.f6.I.q()) {
                    AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix2, org.telegram.ui.ActionBar.f6.I.q() ? -0.2f : -0.07f);
                }
                Bitmap applyColorMatrix2 = AndroidUtilities.applyColorMatrix(bitmap, colorMatrix2);
                applyColorMatrix2.setHasAlpha(false);
                bitmap.recycle();
                callback2.run(applyColorMatrix, applyColorMatrix2);
                break;
            default:
                ox0 ox0Var = (ox0) this.b;
                TL_account.TL_birthday tL_birthday = (TL_account.TL_birthday) obj;
                TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
                updatebirthday.flags |= 1;
                updatebirthday.birthday = tL_birthday;
                int i11 = ox0Var.a;
                TLRPC.UserFull userFull = MessagesController.getInstance(i11).getUserFull(UserConfig.getInstance(i11).getClientUserId());
                TL_account.TL_birthday tL_birthday2 = userFull != null ? userFull.birthday : null;
                if (userFull != null) {
                    userFull.flags2 |= 32;
                    userFull.birthday = tL_birthday;
                    MessagesStorage.getInstance(i11).updateUserInfo(userFull, false);
                }
                ConnectionsManager.getInstance(i11).sendRequest(updatebirthday, new bg.b0(ox0Var, userFull, tL_birthday2, 21), 1024);
                MessagesController.getInstance(i11).invalidateContentSettings();
                MessagesController.getInstance(i11).removeSuggestion(0L, "BIRTHDAY_SETUP");
                NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.newSuggestionsAvailable, new Object[0]);
                break;
        }
    }
}
