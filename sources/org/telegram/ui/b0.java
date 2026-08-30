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

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class b0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ b0(Object obj, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        TLRPC.Document document;
        oy oyVar;
        org.telegram.ui.ActionBar.g3 g3Var;
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
                p3 p3Var = (p3) obj;
                l4Var.e0.k(false);
                AndroidUtilities.hideKeyboard(l4Var.e0.V);
                if (TextUtils.isEmpty(str)) {
                    str = "about:blank";
                }
                AndroidUtilities.addToClipboard(str);
                new org.telegram.ui.Components.qc(p3Var.f, null).k(false).k(true);
                break;
            case 1:
                g7 g7Var = (g7) obj3;
                org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) obj;
                Bundle bundle = new Bundle();
                mh.a aVar = ((o7) obj2).d;
                long j10 = aVar.b;
                if (j10 > 0) {
                    bundle.putLong("user_id", j10);
                } else {
                    bundle.putLong("chat_id", -j10);
                }
                bundle.putInt("message_id", aVar.g);
                p2Var.presentFragment(new xn(bundle));
                g7Var.d.v.dismiss();
                org.telegram.ui.ActionBar.p1 p1Var = g7Var.a;
                if (p1Var != null) {
                    p1Var.d(true);
                    break;
                }
                break;
            case 2:
                org.telegram.ui.Components.yj0 yj0Var = (org.telegram.ui.Components.yj0) obj3;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) obj2;
                int[] iArr = (int[]) obj;
                if (yj0Var == null || yj0Var.w) {
                    actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().e(iArr[0]);
                    break;
                }
                break;
            case 3:
                xn xnVar = (xn) obj3;
                TL_keyboard.KeyboardInlineButton keyboardInlineButton = (TL_keyboard.KeyboardInlineButton) obj2;
                MessageObject messageObject = (MessageObject) obj;
                if (xnVar.getParentActivity() != null) {
                    if (xnVar.L0.getVisibility() != 0 || mf.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeSwitchInline.class) || mf.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeCallback.class) || mf.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeGame.class) || mf.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeUrl.class) || mf.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeBuy.class) || mf.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeUrlAuth.class) || mf.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeUserProfile.class)) {
                        xnVar.V.c0(keyboardInlineButton, messageObject, messageObject, null);
                        break;
                    }
                }
                break;
            case 4:
                ((xn) obj3).va((org.telegram.ui.Cells.a0) obj2, (TLRPC.ReactionCount) obj, 0.0f, 0.0f);
                break;
            case 5:
                xn.j1((xn) obj3, (boolean[]) obj2, (Context) obj);
                break;
            case 6:
                xn.F0((xn) obj3, (mk) obj2, (boolean[]) obj);
                break;
            case 7:
                jn jnVar = (jn) obj3;
                TLRPC.Chat chat = (TLRPC.Chat) obj2;
                org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) obj;
                org.telegram.ui.ActionBar.p2 p2Var2 = jnVar.a;
                p2Var2.finishPreviewFragment();
                chat.left = false;
                if (t1Var != null && t1Var.v != null) {
                    p2Var2.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.channelRecommendationsLoaded, Long.valueOf(t1Var.v.e));
                }
                p2Var2.getMessagesController().addUserToChat(chat.id, p2Var2.getUserConfig().getCurrentUser(), 0, null, p2Var2, new xm(jnVar, chat, i11));
                break;
            case 8:
                po poVar = (po) obj3;
                org.telegram.ui.Cells.i6[] i6VarArr = (org.telegram.ui.Cells.i6[]) obj2;
                org.telegram.ui.ActionBar.b3 b3Var = (org.telegram.ui.ActionBar.b3) obj;
                Integer num = (Integer) view.getTag();
                i6VarArr[0].a(num.intValue() == 0);
                i6VarArr[1].a(num.intValue() == 1);
                poVar.G0 = num.intValue() == 1;
                b3Var.a.dismissRunnable.run();
                poVar.p0(true, true);
                break;
            case 9:
                MessageObject messageObject2 = (MessageObject) obj2;
                PhotoViewer photoViewer = ((rr) obj3).c.a;
                Drawable[] drawableArr = PhotoViewer.Q8;
                ArrayList arrayList = ((org.telegram.ui.Components.e71) obj).d;
                if (arrayList.isEmpty()) {
                    document = null;
                } else {
                    int size = arrayList.size();
                    int i13 = 0;
                    while (true) {
                        if (i13 < size) {
                            Object obj4 = arrayList.get(i13);
                            i13++;
                            org.telegram.ui.Components.g71 g71Var = (org.telegram.ui.Components.g71) obj4;
                            if (g71Var.b()) {
                                document = g71Var.g;
                            }
                        } else {
                            long j11 = Long.MAX_VALUE;
                            org.telegram.ui.Components.g71 g71Var2 = null;
                            for (int i14 = 0; i14 < arrayList.size(); i14++) {
                                org.telegram.ui.Components.g71 g71Var3 = (org.telegram.ui.Components.g71) arrayList.get(i14);
                                if (g71Var3.k < j11 && org.telegram.ui.Components.i71.Y(g71Var3.m)) {
                                    j11 = g71Var3.k;
                                    g71Var2 = g71Var3;
                                }
                            }
                            document = g71Var2 != null ? g71Var2.g : ((org.telegram.ui.Components.g71) arrayList.get(0)).g;
                        }
                    }
                }
                if (document != null) {
                    File pathToAttach = FileLoader.getInstance(photoViewer.Q).getPathToAttach(document, null, false, true);
                    if (pathToAttach == null || !pathToAttach.exists()) {
                        pathToAttach = FileLoader.getInstance(photoViewer.Q).getPathToAttach(document, null, true, true);
                    }
                    if (pathToAttach == null || !pathToAttach.exists()) {
                        ArrayList arrayList2 = new ArrayList();
                        messageObject2.qualityToSave = document;
                        arrayList2.add(messageObject2);
                        MediaController.saveFilesFromMessages(photoViewer.y, AccountInstance.getInstance(photoViewer.Q), arrayList2, new ta(photoViewer, i11));
                    } else {
                        MediaController.saveFile(pathToAttach.toString(), photoViewer.y, 1, null, null, new sq0(photoViewer, i12));
                    }
                    photoViewer.l0.M(null, null);
                    break;
                }
                break;
            case 10:
                ns nsVar = (ns) obj3;
                TLRPC.User user = (TLRPC.User) obj;
                org.telegram.ui.Components.z4.O((Context) obj2, LocaleController.getString(R.string.ResetToOriginalPhotoTitle), LocaleController.formatString(R.string.ResetToOriginalPhotoMessage, user.first_name), LocaleController.getString(R.string.Reset), new es(nsVar, user, i12), nsVar.r).o();
                break;
            case 11:
                vg0 vg0Var = (vg0) obj3;
                ((org.telegram.ui.Components.o70) obj2).u();
                int i15 = ((MessagesController.DialogFilter) obj).id;
                if (vg0Var.c.getCurrentPosition() != 0 || (oyVar = vg0Var.G) == null) {
                    if (vg0Var.G == null) {
                        vg0Var.l0(null);
                    }
                    vg0Var.F = Integer.valueOf(i15);
                    vg0Var.m0(0, true);
                    vg0Var.c.D(0);
                    break;
                } else {
                    oyVar.w4(i15);
                    break;
                }
            case 12:
                org.telegram.ui.ActionBar.g3[] g3VarArr = (org.telegram.ui.ActionBar.g3[]) obj3;
                Utilities.Callback callback = (Utilities.Callback) obj;
                String str2 = (String) obj2;
                org.telegram.ui.ActionBar.g3 g3Var2 = g3VarArr[0];
                if (g3Var2 != null) {
                    g3Var2.dismiss();
                    g3VarArr[0] = null;
                    callback.run(str2);
                    break;
                }
                break;
            case 13:
                org.telegram.ui.ActionBar.g3[] g3VarArr2 = (org.telegram.ui.ActionBar.g3[]) obj2;
                Runnable runnable = (Runnable) obj;
                if (!((ph.d) obj3).K && (g3Var = g3VarArr2[0]) != null) {
                    g3Var.dismiss();
                    g3VarArr2[0] = null;
                    runnable.run();
                    break;
                }
                break;
            case 14:
                ProfileActivity.U((ProfileActivity) obj3, (TLRPC.User) obj2, (org.telegram.ui.ActionBar.k5) obj);
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

    public /* synthetic */ b0(org.telegram.ui.ActionBar.g3[] g3VarArr, Utilities.Callback callback, String str) {
        this.a = 12;
        this.b = g3VarArr;
        this.d = callback;
        this.c = str;
    }
}
