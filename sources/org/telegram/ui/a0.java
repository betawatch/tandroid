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

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class a0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ a0(Object obj, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Runnable runnable;
        TLRPC.Document document;
        wy wyVar;
        org.telegram.ui.ActionBar.h3 h3Var;
        int i10 = this.a;
        int i11 = 3;
        int i12 = 1;
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i10) {
            case 0:
                j4 j4Var = (j4) obj3;
                String str = (String) obj2;
                n3 n3Var = (n3) obj;
                j4Var.h0.k(false);
                AndroidUtilities.hideKeyboard(j4Var.h0.b0);
                if (TextUtils.isEmpty(str)) {
                    str = "about:blank";
                }
                AndroidUtilities.addToClipboard(str);
                new org.telegram.ui.Components.wc(n3Var.f, null).k(false).k(true);
                break;
            case 1:
                d7 d7Var = (d7) obj3;
                org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) obj;
                Bundle bundle = new Bundle();
                yh.a aVar = ((l7) obj2).d;
                long j3 = aVar.b;
                if (j3 > 0) {
                    bundle.putLong("user_id", j3);
                } else {
                    bundle.putLong("chat_id", -j3);
                }
                bundle.putInt("message_id", aVar.g);
                p2Var.presentFragment(new eo(bundle));
                d7Var.d.v.dismiss();
                org.telegram.ui.ActionBar.p1 p1Var = d7Var.a;
                if (p1Var != null) {
                    p1Var.d(true);
                    break;
                }
                break;
            case 2:
                org.telegram.ui.Components.zj0 zj0Var = (org.telegram.ui.Components.zj0) obj3;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) obj2;
                int[] iArr = (int[]) obj;
                if (zj0Var == null || zj0Var.w) {
                    actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().e(iArr[0]);
                    break;
                }
                break;
            case 3:
                eo eoVar = (eo) obj3;
                TL_keyboard.KeyboardInlineButton keyboardInlineButton = (TL_keyboard.KeyboardInlineButton) obj2;
                MessageObject messageObject = (MessageObject) obj;
                if (eoVar.getParentActivity() != null) {
                    if (eoVar.O0.getVisibility() != 0 || yf.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeSwitchInline.class) || yf.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeCallback.class) || yf.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeGame.class) || yf.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeUrl.class) || yf.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeBuy.class) || yf.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeUrlAuth.class) || yf.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeUserProfile.class)) {
                        eoVar.Y.c0(keyboardInlineButton, messageObject, messageObject, null);
                        break;
                    }
                }
                break;
            case 4:
                ((eo) obj3).va((org.telegram.ui.Cells.a0) obj2, (TLRPC.ReactionCount) obj, 0.0f, 0.0f);
                break;
            case 5:
                eo.j1((eo) obj3, (boolean[]) obj2, (Context) obj);
                break;
            case 6:
                eo.F0((eo) obj3, (rk) obj2, (boolean[]) obj);
                break;
            case 7:
                pn pnVar = (pn) obj3;
                TLRPC.Chat chat = (TLRPC.Chat) obj2;
                org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) obj;
                org.telegram.ui.ActionBar.p2 p2Var2 = pnVar.a;
                p2Var2.finishPreviewFragment();
                chat.left = false;
                if (t1Var != null && t1Var.v != null) {
                    p2Var2.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.channelRecommendationsLoaded, Long.valueOf(t1Var.v.e));
                }
                p2Var2.getMessagesController().addUserToChat(chat.id, p2Var2.getUserConfig().getCurrentUser(), 0, null, p2Var2, new dn(pnVar, chat, i11));
                break;
            case 8:
                yo yoVar = (yo) obj3;
                org.telegram.ui.Cells.k6[] k6VarArr = (org.telegram.ui.Cells.k6[]) obj2;
                org.telegram.ui.ActionBar.c3 c3Var = (org.telegram.ui.ActionBar.c3) obj;
                Integer num = (Integer) view.getTag();
                k6VarArr[0].a(num.intValue() == 0);
                k6VarArr[1].a(num.intValue() == 1);
                yoVar.J0 = num.intValue() == 1;
                runnable = c3Var.a.dismissRunnable;
                runnable.run();
                yoVar.p0(true, true);
                break;
            case 9:
                MessageObject messageObject2 = (MessageObject) obj2;
                PhotoViewer photoViewer = ((yr) obj3).c.a;
                Drawable[] drawableArr = PhotoViewer.T8;
                ArrayList arrayList = ((org.telegram.ui.Components.p71) obj).d;
                if (arrayList.isEmpty()) {
                    document = null;
                } else {
                    int size = arrayList.size();
                    int i13 = 0;
                    while (true) {
                        if (i13 < size) {
                            Object obj4 = arrayList.get(i13);
                            i13++;
                            org.telegram.ui.Components.r71 r71Var = (org.telegram.ui.Components.r71) obj4;
                            if (r71Var.b()) {
                                document = r71Var.g;
                            }
                        } else {
                            long j10 = Long.MAX_VALUE;
                            org.telegram.ui.Components.r71 r71Var2 = null;
                            for (int i14 = 0; i14 < arrayList.size(); i14++) {
                                org.telegram.ui.Components.r71 r71Var3 = (org.telegram.ui.Components.r71) arrayList.get(i14);
                                if (r71Var3.k < j10 && org.telegram.ui.Components.t71.Y(r71Var3.m)) {
                                    j10 = r71Var3.k;
                                    r71Var2 = r71Var3;
                                }
                            }
                            document = r71Var2 != null ? r71Var2.g : ((org.telegram.ui.Components.r71) arrayList.get(0)).g;
                        }
                    }
                }
                if (document != null) {
                    File pathToAttach = FileLoader.getInstance(photoViewer.T).getPathToAttach(document, null, false, true);
                    if (pathToAttach == null || !pathToAttach.exists()) {
                        pathToAttach = FileLoader.getInstance(photoViewer.T).getPathToAttach(document, null, true, true);
                    }
                    if (pathToAttach == null || !pathToAttach.exists()) {
                        ArrayList arrayList2 = new ArrayList();
                        messageObject2.qualityToSave = document;
                        arrayList2.add(messageObject2);
                        MediaController.saveFilesFromMessages(photoViewer.y, AccountInstance.getInstance(photoViewer.T), arrayList2, new wa(photoViewer, i11));
                    } else {
                        MediaController.saveFile(pathToAttach.toString(), photoViewer.y, 1, null, null, new or0(photoViewer, i12));
                    }
                    photoViewer.o0.M(null, null);
                    break;
                }
                break;
            case 10:
                ts tsVar = (ts) obj3;
                TLRPC.User user = (TLRPC.User) obj;
                org.telegram.ui.Components.d5.O((Context) obj2, LocaleController.getString(R.string.ResetToOriginalPhotoTitle), LocaleController.formatString(R.string.ResetToOriginalPhotoMessage, user.first_name), LocaleController.getString(R.string.Reset), new ks(tsVar, user, i12), tsVar.r).o();
                break;
            case 11:
                fh0 fh0Var = (fh0) obj3;
                ((org.telegram.ui.Components.w70) obj2).u();
                int i15 = ((MessagesController.DialogFilter) obj).id;
                if (fh0Var.c.getCurrentPosition() != 0 || (wyVar = fh0Var.J) == null) {
                    if (fh0Var.J == null) {
                        fh0Var.l0(null);
                    }
                    fh0Var.I = Integer.valueOf(i15);
                    fh0Var.m0(0, true);
                    fh0Var.c.D(0);
                    break;
                } else {
                    wyVar.w4(i15);
                    break;
                }
            case 12:
                org.telegram.ui.ActionBar.h3[] h3VarArr = (org.telegram.ui.ActionBar.h3[]) obj3;
                Utilities.Callback callback = (Utilities.Callback) obj;
                String str2 = (String) obj2;
                org.telegram.ui.ActionBar.h3 h3Var2 = h3VarArr[0];
                if (h3Var2 != null) {
                    h3Var2.dismiss();
                    h3VarArr[0] = null;
                    callback.run(str2);
                    break;
                }
                break;
            case 13:
                org.telegram.ui.ActionBar.h3[] h3VarArr2 = (org.telegram.ui.ActionBar.h3[]) obj2;
                Runnable runnable2 = (Runnable) obj;
                if (!((bi.d) obj3).N && (h3Var = h3VarArr2[0]) != null) {
                    h3Var.dismiss();
                    h3VarArr2[0] = null;
                    runnable2.run();
                    break;
                }
                break;
            case 14:
                ProfileActivity.U((ProfileActivity) obj3, (TLRPC.User) obj2, (org.telegram.ui.ActionBar.l5) obj);
                break;
            default:
                SaveToGallerySettingsActivity saveToGallerySettingsActivity = (SaveToGallerySettingsActivity) obj3;
                saveToGallerySettingsActivity.getClass();
                ((org.telegram.ui.ActionBar.p1) obj2).dismiss();
                LongSparseArray<SaveToGallerySettingsHelper.DialogException> saveGalleryExceptions = saveToGallerySettingsActivity.getUserConfig().getSaveGalleryExceptions(saveToGallerySettingsActivity.a);
                saveGalleryExceptions.remove(((SaveToGallerySettingsHelper.DialogException) obj).dialogId);
                saveToGallerySettingsActivity.getUserConfig().updateSaveGalleryExceptions(saveToGallerySettingsActivity.a, saveGalleryExceptions);
                saveToGallerySettingsActivity.Z();
                break;
        }
    }

    public /* synthetic */ a0(org.telegram.ui.ActionBar.h3[] h3VarArr, Utilities.Callback callback, String str) {
        this.a = 12;
        this.b = h3VarArr;
        this.d = callback;
        this.c = str;
    }
}
