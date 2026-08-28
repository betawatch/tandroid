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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class b0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ b0(Object obj, Object obj2, Object obj3, int i9) {
        this.a = i9;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        TLRPC.Document document;
        dy dyVar;
        org.telegram.ui.ActionBar.f3 f3Var;
        int i9 = this.a;
        int i10 = 3;
        int i11 = 1;
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i9) {
            case 0:
                l4 l4Var = (l4) obj3;
                String str = (String) obj2;
                p3 p3Var = (p3) obj;
                l4Var.d0.k(false);
                AndroidUtilities.hideKeyboard(l4Var.d0.U);
                if (TextUtils.isEmpty(str)) {
                    str = "about:blank";
                }
                AndroidUtilities.addToClipboard(str);
                new org.telegram.ui.Components.oc(p3Var.f, null).k(false).k(true);
                break;
            case 1:
                d7 d7Var = (d7) obj3;
                org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) obj;
                Bundle bundle = new Bundle();
                hh.a aVar = ((l7) obj2).d;
                long j10 = aVar.b;
                if (j10 > 0) {
                    bundle.putLong("user_id", j10);
                } else {
                    bundle.putLong("chat_id", -j10);
                }
                bundle.putInt("message_id", aVar.g);
                o2Var.presentFragment(new qn(bundle));
                d7Var.d.v.dismiss();
                org.telegram.ui.ActionBar.o1 o1Var = d7Var.a;
                if (o1Var != null) {
                    o1Var.d(true);
                    break;
                }
                break;
            case 2:
                org.telegram.ui.Components.ej0 ej0Var = (org.telegram.ui.Components.ej0) obj3;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) obj2;
                int[] iArr = (int[]) obj;
                if (ej0Var == null || ej0Var.w) {
                    actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().e(iArr[0]);
                    break;
                }
                break;
            case 3:
                qn qnVar = (qn) obj3;
                TL_keyboard.KeyboardInlineButton keyboardInlineButton = (TL_keyboard.KeyboardInlineButton) obj2;
                MessageObject messageObject = (MessageObject) obj;
                if (qnVar.getParentActivity() != null) {
                    if (qnVar.K0.getVisibility() != 0 || gf.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeSwitchInline.class) || gf.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeCallback.class) || gf.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeGame.class) || gf.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeUrl.class) || gf.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeBuy.class) || gf.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeUrlAuth.class) || gf.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeUserProfile.class)) {
                        qnVar.U.b0(keyboardInlineButton, messageObject, messageObject, null);
                        break;
                    }
                }
                break;
            case 4:
                ((qn) obj3).va((org.telegram.ui.Cells.a0) obj2, (TLRPC.ReactionCount) obj, 0.0f, 0.0f);
                break;
            case 5:
                qn.j1((qn) obj3, (boolean[]) obj2, (Context) obj);
                break;
            case 6:
                qn.E0((qn) obj3, (dk) obj2, (boolean[]) obj);
                break;
            case 7:
                cn cnVar = (cn) obj3;
                TLRPC.Chat chat = (TLRPC.Chat) obj2;
                org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) obj;
                org.telegram.ui.ActionBar.o2 o2Var2 = cnVar.a;
                o2Var2.finishPreviewFragment();
                chat.left = false;
                if (t1Var != null && t1Var.v != null) {
                    o2Var2.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.channelRecommendationsLoaded, Long.valueOf(t1Var.v.e));
                }
                o2Var2.getMessagesController().addUserToChat(chat.id, o2Var2.getUserConfig().getCurrentUser(), 0, null, o2Var2, new qm(cnVar, chat, i10));
                break;
            case 8:
                ho hoVar = (ho) obj3;
                org.telegram.ui.Cells.i6[] i6VarArr = (org.telegram.ui.Cells.i6[]) obj2;
                org.telegram.ui.ActionBar.a3 a3Var = (org.telegram.ui.ActionBar.a3) obj;
                Integer num = (Integer) view.getTag();
                i6VarArr[0].a(num.intValue() == 0);
                i6VarArr[1].a(num.intValue() == 1);
                hoVar.F0 = num.intValue() == 1;
                a3Var.a.dismissRunnable.run();
                hoVar.o0(true, true);
                break;
            case 9:
                MessageObject messageObject2 = (MessageObject) obj2;
                PhotoViewer photoViewer = ((lr) obj3).c.a;
                Drawable[] drawableArr = PhotoViewer.P8;
                ArrayList arrayList = ((org.telegram.ui.Components.g61) obj).d;
                if (arrayList.isEmpty()) {
                    document = null;
                } else {
                    int size = arrayList.size();
                    int i12 = 0;
                    while (true) {
                        if (i12 < size) {
                            Object obj4 = arrayList.get(i12);
                            i12++;
                            org.telegram.ui.Components.i61 i61Var = (org.telegram.ui.Components.i61) obj4;
                            if (i61Var.b()) {
                                document = i61Var.g;
                            }
                        } else {
                            long j11 = Long.MAX_VALUE;
                            org.telegram.ui.Components.i61 i61Var2 = null;
                            for (int i13 = 0; i13 < arrayList.size(); i13++) {
                                org.telegram.ui.Components.i61 i61Var3 = (org.telegram.ui.Components.i61) arrayList.get(i13);
                                if (i61Var3.k < j11 && org.telegram.ui.Components.k61.Y(i61Var3.m)) {
                                    j11 = i61Var3.k;
                                    i61Var2 = i61Var3;
                                }
                            }
                            document = i61Var2 != null ? i61Var2.g : ((org.telegram.ui.Components.i61) arrayList.get(0)).g;
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
                        MediaController.saveFilesFromMessages(photoViewer.y, AccountInstance.getInstance(photoViewer.P), arrayList2, new qa(photoViewer, i10));
                    } else {
                        MediaController.saveFile(pathToAttach.toString(), photoViewer.y, 1, null, null, new mq0(photoViewer, i11));
                    }
                    photoViewer.k0.M(null, null);
                    break;
                }
                break;
            case 10:
                is isVar = (is) obj3;
                TLRPC.User user = (TLRPC.User) obj;
                org.telegram.ui.Components.y4.O((Context) obj2, LocaleController.getString(R.string.ResetToOriginalPhotoTitle), LocaleController.formatString(R.string.ResetToOriginalPhotoMessage, user.first_name), LocaleController.getString(R.string.Reset), new zr(isVar, user, i11), isVar.r).o();
                break;
            case 11:
                ng0 ng0Var = (ng0) obj3;
                ((org.telegram.ui.Components.x60) obj2).u();
                int i14 = ((MessagesController.DialogFilter) obj).id;
                if (ng0Var.c.getCurrentPosition() != 0 || (dyVar = ng0Var.F) == null) {
                    if (ng0Var.F == null) {
                        ng0Var.k0(null);
                    }
                    ng0Var.E = Integer.valueOf(i14);
                    ng0Var.l0(0, true);
                    ng0Var.c.D(0);
                    break;
                } else {
                    dyVar.w4(i14);
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
                Runnable runnable = (Runnable) obj;
                if (!((kh.d) obj3).J && (f3Var = f3VarArr2[0]) != null) {
                    f3Var.dismiss();
                    f3VarArr2[0] = null;
                    runnable.run();
                    break;
                }
                break;
            case 14:
                ProfileActivity.T((ProfileActivity) obj3, (TLRPC.User) obj2, (org.telegram.ui.ActionBar.h5) obj);
                break;
            default:
                SaveToGallerySettingsActivity saveToGallerySettingsActivity = (SaveToGallerySettingsActivity) obj3;
                saveToGallerySettingsActivity.getClass();
                ((org.telegram.ui.ActionBar.o1) obj2).dismiss();
                LongSparseArray<SaveToGallerySettingsHelper.DialogException> saveGalleryExceptions = saveToGallerySettingsActivity.getUserConfig().getSaveGalleryExceptions(saveToGallerySettingsActivity.a);
                saveGalleryExceptions.remove(((SaveToGallerySettingsHelper.DialogException) obj).dialogId);
                saveToGallerySettingsActivity.getUserConfig().updateSaveGalleryExceptions(saveToGallerySettingsActivity.a, saveGalleryExceptions);
                saveToGallerySettingsActivity.Y();
                break;
        }
    }

    public /* synthetic */ b0(org.telegram.ui.ActionBar.f3[] f3VarArr, Utilities.Callback callback, String str) {
        this.a = 12;
        this.b = f3VarArr;
        this.d = callback;
        this.c = str;
    }
}
