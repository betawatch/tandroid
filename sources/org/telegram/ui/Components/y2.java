package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.ColorMatrix;
import android.view.View;
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

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final /* synthetic */ class y2 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ y2(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        float height;
        switch (this.a) {
            case 0:
                ((ai.o8) this.b).run();
                break;
            case 1:
                CharSequence charSequence = (CharSequence) obj;
                ci.g gVar = ((md) this.b).f;
                gVar.setText(charSequence);
                gVar.w(charSequence.length(), charSequence.length());
                break;
            case 2:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = ((im) this.b).v;
                chatAttachAlertPhotoLayout.r0(null, null, ((Long) obj).longValue());
                chatAttachAlertPhotoLayout.b.dismiss();
                break;
            case 3:
                MessagesController.getInstance(((ss) this.b).N).openApp((TLRPC.User) obj, 0);
                break;
            case 4:
                ((cu) this.b).performMenuAction(((Integer) obj).intValue());
                break;
            case 5:
                Runnable runnable = (Runnable) this.b;
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            case 6:
                ((na0) this.b).V.Y0(((Integer) obj).intValue() + 8);
                break;
            case 7:
                fc0 fc0Var = (fc0) this.b;
                Integer num = (Integer) obj;
                ArrayList arrayList = fc0Var.e.a;
                hb0 hb0Var = fc0Var.f;
                if (((cc0) arrayList.get(hb0Var.getCurrentPosition())).a != num.intValue()) {
                    int i10 = 0;
                    int i11 = 0;
                    while (true) {
                        if (i11 < arrayList.size()) {
                            if (((cc0) arrayList.get(i11)).a == num.intValue()) {
                                i10 = i11;
                            } else {
                                i11++;
                            }
                        }
                    }
                    if (hb0Var.getCurrentPosition() != i10) {
                        hb0Var.D(i10);
                        break;
                    }
                }
                break;
            case 8:
                zb0 zb0Var = (zb0) this.b;
                zb0Var.n.y(zb0Var.f.T((View) obj));
                break;
            case 9:
                ce0 ce0Var = (ce0) this.b;
                Integer num2 = (Integer) obj;
                FrameLayout frameLayout = ce0Var.h;
                if (ce0Var.getContext() != null) {
                    boolean z10 = ce0Var.getContext().getResources().getConfiguration().orientation == 2;
                    int intValue = num2.intValue() - AndroidUtilities.navigationBarHeight;
                    if (SharedConfig.passcodeType == 1) {
                        ViewPropertyAnimator animate = frameLayout.animate();
                        if (intValue <= AndroidUtilities.dp(20.0f)) {
                            height = 0.0f;
                        } else {
                            height = (((ce0Var.getHeight() - intValue) / 2.0f) - (frameLayout.getHeight() / (z10 ? 1.0f : 2.0f))) - frameLayout.getTop();
                        }
                        ViewPropertyAnimator duration = animate.translationY(height).setDuration(320L);
                        rr rrVar = rr.h;
                        duration.setInterpolator(rrVar).start();
                        ce0Var.I.animate().alpha(intValue > AndroidUtilities.dp(20.0f) ? 0.0f : 1.0f).setDuration(320L).setInterpolator(rrVar);
                        break;
                    }
                }
                break;
            case 10:
                ze0 ze0Var = (ze0) this.b;
                ze0Var.K.a(ze0Var.N, true, 0, ((Long) obj).longValue());
                ze0Var.dismiss();
                break;
            case 11:
                Utilities.Callback2 callback2 = (Utilities.Callback2) this.b;
                Bitmap bitmap = (Bitmap) obj;
                ColorMatrix colorMatrix = new ColorMatrix();
                AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, org.telegram.ui.ActionBar.h6.I.q() ? 0.04f : 0.25f);
                AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, org.telegram.ui.ActionBar.h6.I.q() ? -0.04f : -0.07f);
                Bitmap applyColorMatrix = AndroidUtilities.applyColorMatrix(bitmap, colorMatrix);
                applyColorMatrix.setHasAlpha(false);
                ColorMatrix colorMatrix2 = new ColorMatrix();
                colorMatrix2.setSaturation(org.telegram.ui.ActionBar.h6.I.q() ? 2.0f : 3.0f);
                if (!org.telegram.ui.ActionBar.h6.I.q()) {
                    AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix2, org.telegram.ui.ActionBar.h6.I.q() ? -0.2f : -0.07f);
                }
                Bitmap applyColorMatrix2 = AndroidUtilities.applyColorMatrix(bitmap, colorMatrix2);
                applyColorMatrix2.setHasAlpha(false);
                bitmap.recycle();
                callback2.run(applyColorMatrix, applyColorMatrix2);
                break;
            case 12:
                ry0 ry0Var = (ry0) this.b;
                TL_account.TL_birthday tL_birthday = (TL_account.TL_birthday) obj;
                TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
                updatebirthday.flags |= 1;
                updatebirthday.birthday = tL_birthday;
                int i12 = ry0Var.a;
                TLRPC.UserFull userFull = MessagesController.getInstance(i12).getUserFull(UserConfig.getInstance(i12).getClientUserId());
                TL_account.TL_birthday tL_birthday2 = userFull != null ? userFull.birthday : null;
                if (userFull != null) {
                    userFull.flags2 |= 32;
                    userFull.birthday = tL_birthday;
                    MessagesStorage.getInstance(i12).updateUserInfo(userFull, false);
                }
                ConnectionsManager.getInstance(i12).sendRequest(updatebirthday, new ai.s5(ry0Var, userFull, tL_birthday2, 13), 1024);
                MessagesController.getInstance(i12).invalidateContentSettings();
                MessagesController.getInstance(i12).removeSuggestion(0L, "BIRTHDAY_SETUP");
                NotificationCenter.getInstance(i12).lambda$postNotificationNameOnUIThread$1(NotificationCenter.newSuggestionsAvailable, new Object[0]);
                break;
            default:
                r61 r61Var = (r61) this.b;
                r61Var.Y2.Q(r61Var.T((View) obj), r61Var.c3);
                break;
        }
    }
}
