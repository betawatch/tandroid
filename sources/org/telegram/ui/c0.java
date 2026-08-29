package org.telegram.ui;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.LongSparseArray;
import android.view.View;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SaveToGallerySettingsHelper;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class c0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ c0(Object obj, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Runnable runnable;
        TLRPC.Document document;
        fy fyVar;
        org.telegram.ui.ActionBar.f3 f3Var;
        int i10 = this.a;
        int i11 = 3;
        int i12 = 1;
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i10) {
            case 0:
                m4 m4Var = (m4) obj3;
                String str = (String) obj2;
                q3 q3Var = (q3) obj;
                m4Var.d0.k(false);
                AndroidUtilities.hideKeyboard(m4Var.d0.U);
                if (TextUtils.isEmpty(str)) {
                    str = "about:blank";
                }
                AndroidUtilities.addToClipboard(str);
                new org.telegram.ui.Components.tc(q3Var.f, null).k(false).k(true);
                break;
            case 1:
                c7 c7Var = (c7) obj3;
                org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) obj;
                Bundle bundle = new Bundle();
                kh.a aVar = ((k7) obj2).d;
                long j10 = aVar.b;
                if (j10 > 0) {
                    bundle.putLong("user_id", j10);
                } else {
                    bundle.putLong("chat_id", -j10);
                }
                bundle.putInt("message_id", aVar.g);
                o2Var.presentFragment(new tn(bundle));
                c7Var.d.v.dismiss();
                org.telegram.ui.ActionBar.o1 o1Var = c7Var.a;
                if (o1Var != null) {
                    o1Var.d(true);
                    break;
                }
                break;
            case 2:
                org.telegram.ui.Components.pj0 pj0Var = (org.telegram.ui.Components.pj0) obj3;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) obj2;
                int[] iArr = (int[]) obj;
                if (pj0Var == null || pj0Var.w) {
                    actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().e(iArr[0]);
                    break;
                }
                break;
            case 3:
                tn tnVar = (tn) obj3;
                TL_keyboard.KeyboardInlineButton keyboardInlineButton = (TL_keyboard.KeyboardInlineButton) obj2;
                MessageObject messageObject = (MessageObject) obj;
                if (tnVar.getParentActivity() != null) {
                    if (tnVar.K0.getVisibility() != 0 || kf.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeSwitchInline.class) || kf.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeCallback.class) || kf.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeGame.class) || kf.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeUrl.class) || kf.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeBuy.class) || kf.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeUrlAuth.class) || kf.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeUserProfile.class)) {
                        tnVar.U.c0(keyboardInlineButton, messageObject, messageObject, null);
                        break;
                    }
                }
                break;
            case 4:
                ((tn) obj3).va((org.telegram.ui.Cells.a0) obj2, (TLRPC.ReactionCount) obj, 0.0f, 0.0f);
                break;
            case 5:
                tn.j1((tn) obj3, (boolean[]) obj2, (Context) obj);
                break;
            case 6:
                tn.F0((tn) obj3, (gk) obj2, (boolean[]) obj);
                break;
            case 7:
                fn fnVar = (fn) obj3;
                TLRPC.Chat chat = (TLRPC.Chat) obj2;
                org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) obj;
                org.telegram.ui.ActionBar.o2 o2Var2 = fnVar.a;
                o2Var2.finishPreviewFragment();
                chat.left = false;
                if (s1Var != null && s1Var.v != null) {
                    o2Var2.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.channelRecommendationsLoaded, Long.valueOf(s1Var.v.e));
                }
                o2Var2.getMessagesController().addUserToChat(chat.id, o2Var2.getUserConfig().getCurrentUser(), 0, null, o2Var2, new sm(fnVar, chat, i11));
                break;
            case 8:
                ko koVar = (ko) obj3;
                org.telegram.ui.Cells.g6[] g6VarArr = (org.telegram.ui.Cells.g6[]) obj2;
                org.telegram.ui.ActionBar.a3 a3Var = (org.telegram.ui.ActionBar.a3) obj;
                Integer num = (Integer) view.getTag();
                g6VarArr[0].a(num.intValue() == 0);
                g6VarArr[1].a(num.intValue() == 1);
                koVar.F0 = num.intValue() == 1;
                runnable = a3Var.a.dismissRunnable;
                runnable.run();
                koVar.p0(true, true);
                break;
            case 9:
                MessageObject messageObject2 = (MessageObject) obj2;
                PhotoViewer photoViewer = ((lr) obj3).c.a;
                Drawable[] drawableArr = PhotoViewer.P8;
                ArrayList arrayList = ((org.telegram.ui.Components.t61) obj).d;
                if (arrayList.isEmpty()) {
                    document = null;
                } else {
                    int size = arrayList.size();
                    int i13 = 0;
                    while (true) {
                        if (i13 < size) {
                            Object obj4 = arrayList.get(i13);
                            i13++;
                            org.telegram.ui.Components.v61 v61Var = (org.telegram.ui.Components.v61) obj4;
                            if (v61Var.b()) {
                                document = v61Var.g;
                            }
                        } else {
                            long j11 = Long.MAX_VALUE;
                            org.telegram.ui.Components.v61 v61Var2 = null;
                            for (int i14 = 0; i14 < arrayList.size(); i14++) {
                                org.telegram.ui.Components.v61 v61Var3 = (org.telegram.ui.Components.v61) arrayList.get(i14);
                                if (v61Var3.k < j11 && org.telegram.ui.Components.x61.Y(v61Var3.m)) {
                                    j11 = v61Var3.k;
                                    v61Var2 = v61Var3;
                                }
                            }
                            document = v61Var2 != null ? v61Var2.g : ((org.telegram.ui.Components.v61) arrayList.get(0)).g;
                        }
                    }
                }
                if (document != null) {
                    File pathToAttach = FileLoader.getInstance(photoViewer.P).getPathToAttach(document, null, false, true);
                    if (pathToAttach == null || !pathToAttach.exists()) {
                        pathToAttach = FileLoader.getInstance(photoViewer.P).getPathToAttach(document, null, true, true);
                    }
                    if (pathToAttach == null || !pathToAttach.exists()) {
                        ArrayList arrayList2 = new ArrayList();
                        messageObject2.qualityToSave = document;
                        arrayList2.add(messageObject2);
                        MediaController.saveFilesFromMessages(photoViewer.y, AccountInstance.getInstance(photoViewer.P), arrayList2, new pa(photoViewer, i11));
                    } else {
                        MediaController.saveFile(pathToAttach.toString(), photoViewer.y, 1, null, null, new mq0(photoViewer, i12));
                    }
                    photoViewer.k0.M(null, null);
                    break;
                }
                break;
            case 10:
                hs hsVar = (hs) obj3;
                TLRPC.User user = (TLRPC.User) obj;
                org.telegram.ui.Components.c5.O((Context) obj2, LocaleController.getString(R.string.ResetToOriginalPhotoTitle), LocaleController.formatString(R.string.ResetToOriginalPhotoMessage, user.first_name), LocaleController.getString(R.string.Reset), new yr(hsVar, user, i12), hsVar.r).o();
                break;
            case 11:
                ng0 ng0Var = (ng0) obj3;
                ((org.telegram.ui.Components.j70) obj2).u();
                int i15 = ((MessagesController.DialogFilter) obj).id;
                if (ng0Var.c.getCurrentPosition() != 0 || (fyVar = ng0Var.F) == null) {
                    if (ng0Var.F == null) {
                        ng0Var.l0(null);
                    }
                    ng0Var.E = Integer.valueOf(i15);
                    ng0Var.m0(0, true);
                    ng0Var.c.D(0);
                    break;
                } else {
                    fyVar.w4(i15);
                    break;
                }
            case 12:
                org.telegram.ui.ActionBar.f3[] f3VarArr = (org.telegram.ui.ActionBar.f3[]) obj3;
                Utilities.Callback callback = (Utilities.Callback) obj;
                String str2 = (String) obj2;
                org.telegram.ui.ActionBar.f3 f3Var2 = f3VarArr[0];
                if (f3Var2 != null) {
                    f3Var2.dismiss();
                    f3VarArr[0] = null;
                    callback.run(str2);
                    break;
                }
                break;
            case 13:
                org.telegram.ui.ActionBar.f3[] f3VarArr2 = (org.telegram.ui.ActionBar.f3[]) obj2;
                Runnable runnable2 = (Runnable) obj;
                if (!((nh.d) obj3).J && (f3Var = f3VarArr2[0]) != null) {
                    f3Var.dismiss();
                    f3VarArr2[0] = null;
                    runnable2.run();
                    break;
                }
                break;
            case 14:
                ProfileActivity.U((ProfileActivity) obj3, (TLRPC.User) obj2, (org.telegram.ui.ActionBar.h5) obj);
                break;
            default:
                SaveToGallerySettingsActivity saveToGallerySettingsActivity = (SaveToGallerySettingsActivity) obj3;
                saveToGallerySettingsActivity.getClass();
                ((org.telegram.ui.ActionBar.o1) obj2).dismiss();
                LongSparseArray<SaveToGallerySettingsHelper.DialogException> saveGalleryExceptions = saveToGallerySettingsActivity.getUserConfig().getSaveGalleryExceptions(saveToGallerySettingsActivity.a);
                saveGalleryExceptions.remove(((SaveToGallerySettingsHelper.DialogException) obj).dialogId);
                saveToGallerySettingsActivity.getUserConfig().updateSaveGalleryExceptions(saveToGallerySettingsActivity.a, saveGalleryExceptions);
                saveToGallerySettingsActivity.Z();
                break;
        }
    }

    public /* synthetic */ c0(org.telegram.ui.ActionBar.f3[] f3VarArr, Utilities.Callback callback, String str) {
        this.a = 12;
        this.b = f3VarArr;
        this.d = callback;
        this.c = str;
    }
}
