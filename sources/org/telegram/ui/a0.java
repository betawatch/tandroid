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

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
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
        qy qyVar;
        org.telegram.ui.ActionBar.e3 e3Var;
        int i10 = this.a;
        int i11 = 3;
        int i12 = 1;
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i10) {
            case 0:
                i4 i4Var = (i4) obj3;
                String str = (String) obj2;
                m3 m3Var = (m3) obj;
                i4Var.h0.k(false);
                AndroidUtilities.hideKeyboard(i4Var.h0.b0);
                if (TextUtils.isEmpty(str)) {
                    str = "about:blank";
                }
                AndroidUtilities.addToClipboard(str);
                new org.telegram.ui.Components.xc(m3Var.f, null).k(false).k(true);
                break;
            case 1:
                e7 e7Var = (e7) obj3;
                org.telegram.ui.ActionBar.m2 m2Var = (org.telegram.ui.ActionBar.m2) obj;
                Bundle bundle = new Bundle();
                zh.a aVar = ((m7) obj2).d;
                long j3 = aVar.b;
                if (j3 > 0) {
                    bundle.putLong("user_id", j3);
                } else {
                    bundle.putLong("chat_id", -j3);
                }
                bundle.putInt("message_id", aVar.g);
                m2Var.presentFragment(new wn(bundle));
                e7Var.d.v.dismiss();
                org.telegram.ui.ActionBar.m1 m1Var = e7Var.a;
                if (m1Var != null) {
                    m1Var.d(true);
                    break;
                }
                break;
            case 2:
                org.telegram.ui.Components.ak0 ak0Var = (org.telegram.ui.Components.ak0) obj3;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) obj2;
                int[] iArr = (int[]) obj;
                if (ak0Var == null || ak0Var.w) {
                    actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().e(iArr[0]);
                    break;
                }
                break;
            case 3:
                wn wnVar = (wn) obj3;
                TL_keyboard.KeyboardInlineButton keyboardInlineButton = (TL_keyboard.KeyboardInlineButton) obj2;
                MessageObject messageObject = (MessageObject) obj;
                if (wnVar.getParentActivity() != null) {
                    if (wnVar.O0.getVisibility() != 0 || zf.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeSwitchInline.class) || zf.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeCallback.class) || zf.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeGame.class) || zf.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeUrl.class) || zf.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeBuy.class) || zf.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeUrlAuth.class) || zf.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeUserProfile.class)) {
                        wnVar.Y.c0(keyboardInlineButton, messageObject, messageObject, null);
                        break;
                    }
                }
                break;
            case 4:
                ((wn) obj3).va((org.telegram.ui.Cells.a0) obj2, (TLRPC.ReactionCount) obj, 0.0f, 0.0f);
                break;
            case 5:
                wn.m1((wn) obj3, (boolean[]) obj2, (Context) obj);
                break;
            case 6:
                wn.G0((wn) obj3, (mk) obj2, (boolean[]) obj);
                break;
            case 7:
                in inVar = (in) obj3;
                TLRPC.Chat chat = (TLRPC.Chat) obj2;
                org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) obj;
                org.telegram.ui.ActionBar.m2 m2Var2 = inVar.a;
                m2Var2.finishPreviewFragment();
                chat.left = false;
                if (u1Var != null && u1Var.v != null) {
                    m2Var2.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.channelRecommendationsLoaded, Long.valueOf(u1Var.v.e));
                }
                m2Var2.getMessagesController().addUserToChat(chat.id, m2Var2.getUserConfig().getCurrentUser(), 0, null, m2Var2, new wm(inVar, chat, i11));
                break;
            case 8:
                ro roVar = (ro) obj3;
                org.telegram.ui.Cells.j6[] j6VarArr = (org.telegram.ui.Cells.j6[]) obj2;
                org.telegram.ui.ActionBar.z2 z2Var = (org.telegram.ui.ActionBar.z2) obj;
                Integer num = (Integer) view.getTag();
                j6VarArr[0].a(num.intValue() == 0);
                j6VarArr[1].a(num.intValue() == 1);
                roVar.J0 = num.intValue() == 1;
                runnable = z2Var.a.dismissRunnable;
                runnable.run();
                roVar.p0(true, true);
                break;
            case 9:
                MessageObject messageObject2 = (MessageObject) obj2;
                PhotoViewer photoViewer = ((rr) obj3).c.a;
                Drawable[] drawableArr = PhotoViewer.U8;
                ArrayList arrayList = ((org.telegram.ui.Components.o71) obj).d;
                if (arrayList.isEmpty()) {
                    document = null;
                } else {
                    int size = arrayList.size();
                    int i13 = 0;
                    while (true) {
                        if (i13 < size) {
                            Object obj4 = arrayList.get(i13);
                            i13++;
                            org.telegram.ui.Components.q71 q71Var = (org.telegram.ui.Components.q71) obj4;
                            if (q71Var.b()) {
                                document = q71Var.g;
                            }
                        } else {
                            long j10 = Long.MAX_VALUE;
                            org.telegram.ui.Components.q71 q71Var2 = null;
                            for (int i14 = 0; i14 < arrayList.size(); i14++) {
                                org.telegram.ui.Components.q71 q71Var3 = (org.telegram.ui.Components.q71) arrayList.get(i14);
                                if (q71Var3.k < j10 && org.telegram.ui.Components.s71.Y(q71Var3.m)) {
                                    j10 = q71Var3.k;
                                    q71Var2 = q71Var3;
                                }
                            }
                            document = q71Var2 != null ? q71Var2.g : ((org.telegram.ui.Components.q71) arrayList.get(0)).g;
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
                        MediaController.saveFilesFromMessages(photoViewer.y, AccountInstance.getInstance(photoViewer.T), arrayList2, new ua(photoViewer, i11));
                    } else {
                        MediaController.saveFile(pathToAttach.toString(), photoViewer.y, 1, null, null, new gr0(photoViewer, i12));
                    }
                    photoViewer.o0.M(null, null);
                    break;
                }
                break;
            case 10:
                ms msVar = (ms) obj3;
                TLRPC.User user = (TLRPC.User) obj;
                org.telegram.ui.Components.e5.O((Context) obj2, LocaleController.getString(R.string.ResetToOriginalPhotoTitle), LocaleController.formatString(R.string.ResetToOriginalPhotoMessage, user.first_name), LocaleController.getString(R.string.Reset), new ds(msVar, user, i12), msVar.r).o();
                break;
            case 11:
                yg0 yg0Var = (yg0) obj3;
                ((org.telegram.ui.Components.y70) obj2).u();
                int i15 = ((MessagesController.DialogFilter) obj).id;
                if (yg0Var.c.getCurrentPosition() != 0 || (qyVar = yg0Var.J) == null) {
                    if (yg0Var.J == null) {
                        yg0Var.l0(null);
                    }
                    yg0Var.I = Integer.valueOf(i15);
                    yg0Var.m0(0, true);
                    yg0Var.c.D(0);
                    break;
                } else {
                    qyVar.w4(i15);
                    break;
                }
            case 12:
                org.telegram.ui.ActionBar.e3[] e3VarArr = (org.telegram.ui.ActionBar.e3[]) obj3;
                Utilities.Callback callback = (Utilities.Callback) obj;
                String str2 = (String) obj2;
                org.telegram.ui.ActionBar.e3 e3Var2 = e3VarArr[0];
                if (e3Var2 != null) {
                    e3Var2.dismiss();
                    e3VarArr[0] = null;
                    callback.run(str2);
                    break;
                }
                break;
            case 13:
                org.telegram.ui.ActionBar.e3[] e3VarArr2 = (org.telegram.ui.ActionBar.e3[]) obj2;
                Runnable runnable2 = (Runnable) obj;
                if (!((ci.d) obj3).N && (e3Var = e3VarArr2[0]) != null) {
                    e3Var.dismiss();
                    e3VarArr2[0] = null;
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
                ((org.telegram.ui.ActionBar.m1) obj2).dismiss();
                LongSparseArray<SaveToGallerySettingsHelper.DialogException> saveGalleryExceptions = saveToGallerySettingsActivity.getUserConfig().getSaveGalleryExceptions(saveToGallerySettingsActivity.a);
                saveGalleryExceptions.remove(((SaveToGallerySettingsHelper.DialogException) obj).dialogId);
                saveToGallerySettingsActivity.getUserConfig().updateSaveGalleryExceptions(saveToGallerySettingsActivity.a, saveGalleryExceptions);
                saveToGallerySettingsActivity.Z();
                break;
        }
    }

    public /* synthetic */ a0(org.telegram.ui.ActionBar.e3[] e3VarArr, Utilities.Callback callback, String str) {
        this.a = 12;
        this.b = e3VarArr;
        this.d = callback;
        this.c = str;
    }
}
