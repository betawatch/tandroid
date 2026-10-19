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

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
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
        cy cyVar;
        org.telegram.ui.ActionBar.f3 f3Var;
        int i10 = this.a;
        int i11 = 3;
        int i12 = 1;
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i10) {
            case 0:
                l4 l4Var = (l4) obj3;
                String str = (String) obj2;
                o3 o3Var = (o3) obj;
                l4Var.h0.k(false);
                AndroidUtilities.hideKeyboard(l4Var.h0.b0);
                if (TextUtils.isEmpty(str)) {
                    str = "about:blank";
                }
                AndroidUtilities.addToClipboard(str);
                new org.telegram.ui.Components.xc(o3Var.f, null).k(false).k(true);
                break;
            case 1:
                h7 h7Var = (h7) obj3;
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) obj;
                Bundle bundle = new Bundle();
                bi.b bVar = ((p7) obj2).d;
                long j10 = bVar.b;
                if (j10 > 0) {
                    bundle.putLong("user_id", j10);
                } else {
                    bundle.putLong("chat_id", -j10);
                }
                bundle.putInt("message_id", bVar.g);
                n2Var.presentFragment(new qn(bundle));
                h7Var.d.v.dismiss();
                org.telegram.ui.ActionBar.m1 m1Var = h7Var.a;
                if (m1Var != null) {
                    m1Var.d(true);
                    break;
                }
                break;
            case 2:
                org.telegram.ui.Components.mk0 mk0Var = (org.telegram.ui.Components.mk0) obj3;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) obj2;
                int[] iArr = (int[]) obj;
                if (mk0Var == null || mk0Var.w) {
                    actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().e(iArr[0]);
                    break;
                }
                break;
            case 3:
                qn qnVar = (qn) obj3;
                TL_keyboard.KeyboardInlineButton keyboardInlineButton = (TL_keyboard.KeyboardInlineButton) obj2;
                MessageObject messageObject = (MessageObject) obj;
                if (qnVar.getParentActivity() != null) {
                    if (qnVar.O0.getVisibility() != 0 || ag.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeSwitchInline.class) || ag.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeCallback.class) || ag.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeGame.class) || ag.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeUrl.class) || ag.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeBuy.class) || ag.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeUrlAuth.class) || ag.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeUserProfile.class)) {
                        qnVar.Y.a0(keyboardInlineButton, messageObject, messageObject, null);
                        break;
                    }
                }
                break;
            case 4:
                ((qn) obj3).za((org.telegram.ui.Cells.a0) obj2, (TLRPC.ReactionCount) obj, 0.0f, 0.0f);
                break;
            case 5:
                qn.y1((qn) obj3, (boolean[]) obj2, (Context) obj);
                break;
            case 6:
                qn.C0((qn) obj3, (hk) obj2, (boolean[]) obj);
                break;
            case 7:
                cn cnVar = (cn) obj3;
                TLRPC.Chat chat = (TLRPC.Chat) obj2;
                org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) obj;
                org.telegram.ui.ActionBar.n2 n2Var2 = cnVar.a;
                n2Var2.finishPreviewFragment();
                chat.left = false;
                if (u1Var != null && u1Var.v != null) {
                    n2Var2.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.channelRecommendationsLoaded, Long.valueOf(u1Var.v.e));
                }
                n2Var2.getMessagesController().addUserToChat(chat.id, n2Var2.getUserConfig().getCurrentUser(), 0, null, n2Var2, new qm(cnVar, chat, i11));
                break;
            case 8:
                io ioVar = (io) obj3;
                org.telegram.ui.Cells.i6[] i6VarArr = (org.telegram.ui.Cells.i6[]) obj2;
                org.telegram.ui.ActionBar.a3 a3Var = (org.telegram.ui.ActionBar.a3) obj;
                Integer num = (Integer) view.getTag();
                i6VarArr[0].a(num.intValue() == 0);
                i6VarArr[1].a(num.intValue() == 1);
                ioVar.J0 = num.intValue() == 1;
                runnable = a3Var.a.dismissRunnable;
                runnable.run();
                ioVar.p0(true, true);
                break;
            case 9:
                MessageObject messageObject2 = (MessageObject) obj2;
                PhotoViewer photoViewer = ((jr) obj3).c.a;
                Drawable[] drawableArr = PhotoViewer.U8;
                ArrayList arrayList = ((org.telegram.ui.Components.x71) obj).d;
                if (arrayList.isEmpty()) {
                    document = null;
                } else {
                    int size = arrayList.size();
                    int i13 = 0;
                    while (true) {
                        if (i13 < size) {
                            Object obj4 = arrayList.get(i13);
                            i13++;
                            org.telegram.ui.Components.z71 z71Var = (org.telegram.ui.Components.z71) obj4;
                            if (z71Var.b()) {
                                document = z71Var.g;
                            }
                        } else {
                            long j11 = Long.MAX_VALUE;
                            org.telegram.ui.Components.z71 z71Var2 = null;
                            for (int i14 = 0; i14 < arrayList.size(); i14++) {
                                org.telegram.ui.Components.z71 z71Var3 = (org.telegram.ui.Components.z71) arrayList.get(i14);
                                if (z71Var3.k < j11 && org.telegram.ui.Components.b81.Y(z71Var3.m)) {
                                    j11 = z71Var3.k;
                                    z71Var2 = z71Var3;
                                }
                            }
                            document = z71Var2 != null ? z71Var2.g : ((org.telegram.ui.Components.z71) arrayList.get(0)).g;
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
                        MediaController.saveFilesFromMessages(photoViewer.y, AccountInstance.getInstance(photoViewer.T), arrayList2, new va(photoViewer, i11));
                    } else {
                        MediaController.saveFile(pathToAttach.toString(), photoViewer.y, 1, null, null, new wq0(photoViewer, i12));
                    }
                    photoViewer.o0.M(null, null);
                    break;
                }
                break;
            case 10:
                fs fsVar = (fs) obj3;
                TLRPC.User user = (TLRPC.User) obj;
                org.telegram.ui.Components.f5.N((Context) obj2, LocaleController.getString(R.string.ResetToOriginalPhotoTitle), LocaleController.formatString(R.string.ResetToOriginalPhotoMessage, user.first_name), LocaleController.getString(R.string.Reset), new wr(fsVar, user, i12), fsVar.r).o();
                break;
            case 11:
                ng0 ng0Var = (ng0) obj3;
                ((org.telegram.ui.Components.i80) obj2).u();
                int i15 = ((MessagesController.DialogFilter) obj).id;
                if (ng0Var.c.getCurrentPosition() != 0 || (cyVar = ng0Var.J) == null) {
                    if (ng0Var.J == null) {
                        ng0Var.l0(null);
                    }
                    ng0Var.I = Integer.valueOf(i15);
                    ng0Var.m0(0, true);
                    ng0Var.c.D(0);
                    break;
                } else {
                    cyVar.u4(i15);
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
                if (!((ei.d) obj3).N && (f3Var = f3VarArr2[0]) != null) {
                    f3Var.dismiss();
                    f3VarArr2[0] = null;
                    runnable2.run();
                    break;
                }
                break;
            case 14:
                ProfileActivity.b0((ProfileActivity) obj3, (TLRPC.User) obj2, (org.telegram.ui.ActionBar.j5) obj);
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

    public /* synthetic */ a0(org.telegram.ui.ActionBar.f3[] f3VarArr, Utilities.Callback callback, String str) {
        this.a = 12;
        this.b = f3VarArr;
        this.d = callback;
        this.c = str;
    }
}
