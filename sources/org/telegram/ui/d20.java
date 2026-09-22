package org.telegram.ui;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.io.File;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.CacheByChatsController;
import org.telegram.messenger.ContactsLoadingObserver;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.LocationController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.voip.ConferenceCall;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final /* synthetic */ class d20 implements org.telegram.ui.ActionBar.a2, oy, ContactsLoadingObserver.Callback, org.telegram.ui.Components.bv0, org.telegram.ui.Components.bl0, ImageReceiver.ImageReceiverDelegate, OnCompleteListener, org.telegram.ui.Components.al0, zt, FileLoader.FileResolver, org.telegram.ui.Components.b5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ d20(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // org.telegram.ui.oy
    public /* synthetic */ boolean A() {
        return false;
    }

    @Override // org.telegram.ui.Components.b5
    public void J(int i10, int i11, boolean z10) {
        sv0 sv0Var = (sv0) this.b;
        TLRPC.TL_messageMediaToDo tL_messageMediaToDo = (TLRPC.TL_messageMediaToDo) this.c;
        aw0 aw0Var = sv0Var.a;
        aw0Var.e0.a(tL_messageMediaToDo);
        aw0Var.finishFragment();
    }

    @Override // org.telegram.ui.oy
    public /* synthetic */ boolean K(uy uyVar) {
        return false;
    }

    @Override // org.telegram.ui.zt
    public void a1(vt vtVar) {
        on0 on0Var = (on0) this.b;
        int intValue = ((Integer) ((View) this.c).getTag()).intValue();
        EditTextBoldCursor editTextBoldCursor = on0Var.Y[intValue];
        if (intValue == 5) {
            on0Var.s = vtVar.d;
        } else {
            on0Var.v = vtVar.d;
        }
        editTextBoldCursor.setText(vtVar.a);
    }

    @Override // org.telegram.ui.Components.bv0
    public void b(LocationController.SharingLocationInfo sharingLocationInfo) {
        LaunchActivity launchActivity = (LaunchActivity) this.b;
        int[] iArr = (int[]) this.c;
        Pattern pattern = LaunchActivity.B1;
        int i10 = sharingLocationInfo.messageObject.currentAccount;
        iArr[0] = i10;
        launchActivity.K0(i10);
        id0 id0Var = new id0(2);
        id0Var.u0(sharingLocationInfo.messageObject);
        id0Var.F0 = new ai.z1(iArr, sharingLocationInfo.messageObject.getDialogId(), 10);
        launchActivity.p0(id0Var);
    }

    @Override // org.telegram.ui.Components.al0
    public void c(float f7, float f10, int i10, View view) {
        NotificationsCustomSettingsActivity.U((NotificationsCustomSettingsActivity) this.b, (Context) this.c, view, i10, f7, f10);
    }

    @Override // org.telegram.ui.Components.bl0
    public boolean d(int i10, View view) {
        id0 id0Var = (id0) this.b;
        Context context = (Context) this.c;
        if (id0Var.G0 == 2) {
            Object J = id0Var.T.J(i10);
            if (J instanceof cd0) {
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(context, null);
                org.telegram.ui.ActionBar.f1 f1Var = new org.telegram.ui.ActionBar.f1(0, id0Var.getParentActivity(), id0Var.getResourceProvider(), true, true);
                f1Var.setMinimumWidth(AndroidUtilities.dp(200.0f));
                f1Var.g(LocaleController.getString(R.string.GetDirections), R.drawable.filled_directions, null);
                f1Var.setOnClickListener(new sv(16, id0Var, (cd0) J));
                actionBarPopupWindow$ActionBarPopupWindowLayout.addView(f1Var);
                ad0 ad0Var = new ad0(id0Var, actionBarPopupWindow$ActionBarPopupWindowLayout);
                id0Var.I0 = ad0Var;
                ad0Var.setOutsideTouchable(true);
                id0Var.I0.setClippingEnabled(true);
                id0Var.I0.setInputMethodMode(2);
                id0Var.I0.setSoftInputMode(0);
                int[] iArr = new int[2];
                view.getLocationInWindow(iArr);
                id0Var.I0.showAtLocation(view, 48, 0, iArr[1] - AndroidUtilities.dp(52.0f));
                id0Var.I0.b();
                return true;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Components.al0
    public /* synthetic */ boolean d1(View view) {
        return false;
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        Bitmap g02;
        id0 id0Var = (id0) this.b;
        cd0 cd0Var = (cd0) this.c;
        id0Var.getClass();
        if (!z10 || z11 || cd0Var.e == null || (g02 = id0Var.g0(cd0Var)) == null) {
            return;
        }
        cd0Var.e.setIcon(g02);
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public /* synthetic */ void didSetImageBitmap(int i10, String str, Drawable drawable) {
        org.telegram.messenger.h5.a(this, i10, str, drawable);
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        ConferenceCall conferenceCall;
        ArrayList<Long> arrayList;
        TLRPC.EncryptedChat encryptedChat;
        int i11 = this.a;
        org.telegram.ui.ActionBar.b2 b2Var2 = null;
        int i12 = 0;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i11) {
            case 0:
                e20 e20Var = (e20) obj2;
                MessagesController.DialogFilter dialogFilter = (MessagesController.DialogFilter) obj;
                FiltersSetupActivity filtersSetupActivity = e20Var.e;
                if (filtersSetupActivity.getParentActivity() != null) {
                    org.telegram.ui.ActionBar.b2 b2Var3 = new org.telegram.ui.ActionBar.b2(filtersSetupActivity.getParentActivity(), 3, null);
                    b2Var3.g0 = false;
                    b2Var3.show();
                    b2Var2 = b2Var3;
                }
                TLRPC.TL_messages_updateDialogFilter tL_messages_updateDialogFilter = new TLRPC.TL_messages_updateDialogFilter();
                tL_messages_updateDialogFilter.id = dialogFilter.id;
                filtersSetupActivity.getConnectionsManager().sendRequest(tL_messages_updateDialogFilter, new aa(e20Var, b2Var2, dialogFilter, 10));
                break;
            case 1:
                i60 i60Var = (i60) obj2;
                TLObject tLObject = (TLObject) obj;
                AccountInstance accountInstance = i60Var.d;
                if (!i60Var.o1()) {
                    if (!(tLObject instanceof TLRPC.User)) {
                        TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                        accountInstance.getMessagesController().deleteParticipantFromChat(i60Var.i1(), (TLRPC.User) null, chat, false, false);
                        i60Var.k1().k(0L, 32, chat, null, null, null);
                        break;
                    } else {
                        TLRPC.User user = (TLRPC.User) tLObject;
                        accountInstance.getMessagesController().deleteParticipantFromChat(i60Var.i1(), user);
                        i60Var.k1().k(0L, 32, user, null, null, null);
                        break;
                    }
                } else {
                    VoIPService sharedInstance = VoIPService.getSharedInstance();
                    if (sharedInstance != null && (conferenceCall = sharedInstance.conference) != null && (tLObject instanceof TLRPC.User)) {
                        TLRPC.User user2 = (TLRPC.User) tLObject;
                        conferenceCall.kick(user2.id);
                        i60Var.a1.addKickedUser(user2.id);
                        i60Var.k1().k(0L, 102, user2, null, null, null);
                        break;
                    }
                }
                break;
            case 2:
                e70 e70Var = (e70) obj2;
                e70Var.x.i((TLRPC.User) obj);
                if (e70Var.f.r.length() > 0) {
                    e70Var.f.r.setText((CharSequence) null);
                    break;
                }
                break;
            case 3:
                e70 e70Var2 = (e70) obj2;
                e70Var2.getClass();
                org.telegram.ui.Cells.z1 z1Var = ((org.telegram.ui.Cells.z1[]) obj)[0];
                if (z1Var != null && z1Var.b()) {
                    i12 = 100;
                }
                e70Var2.m0(i12);
                break;
            case 4:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 17:
            case 19:
            case 22:
            case 25:
            case 26:
            default:
                boolean[] zArr = (boolean[]) obj;
                PhotoViewer photoViewer = ((ss0) obj2).b;
                bv0 bv0Var = photoViewer.d;
                ArrayList arrayList2 = photoViewer.a7;
                ArrayList arrayList3 = photoViewer.d7;
                ArrayList arrayList4 = photoViewer.Y6;
                ArrayList arrayList5 = photoViewer.e7;
                ArrayList arrayList6 = photoViewer.f7;
                if (!bv0Var.M()) {
                    photoViewer.G0(false, false);
                    break;
                } else if (!arrayList4.isEmpty()) {
                    int i13 = photoViewer.P4;
                    if (i13 >= 0 && i13 < arrayList4.size()) {
                        MessageObject messageObject = (MessageObject) arrayList4.get(photoViewer.P4);
                        if (messageObject.isSent()) {
                            photoViewer.G0(false, false);
                            ArrayList<Integer> arrayList7 = new ArrayList<>();
                            int i14 = photoViewer.v;
                            if (i14 != 0) {
                                arrayList7.add(Integer.valueOf(i14));
                            } else {
                                arrayList7.add(Integer.valueOf(messageObject.getId()));
                            }
                            if (!DialogObject.isEncryptedDialog(messageObject.getDialogId()) || messageObject.messageOwner.random_id == 0) {
                                arrayList = null;
                                encryptedChat = null;
                            } else {
                                ArrayList<Long> arrayList8 = new ArrayList<>();
                                arrayList8.add(Long.valueOf(messageObject.messageOwner.random_id));
                                arrayList = arrayList8;
                                encryptedChat = MessagesController.getInstance(photoViewer.T).getEncryptedChat(Integer.valueOf(DialogObject.getEncryptedChatId(messageObject.getDialogId())));
                            }
                            MessagesController.getInstance(photoViewer.T).deleteMessages(arrayList7, arrayList, encryptedChat, messageObject.getDialogId(), messageObject.getQuickReplyId(), zArr[0], messageObject.getChatMode());
                            break;
                        }
                    }
                } else if (!arrayList6.isEmpty()) {
                    int i15 = photoViewer.P4;
                    if (i15 >= 0 && i15 < arrayList6.size()) {
                        TLRPC.Message message = (TLRPC.Message) arrayList3.get(photoViewer.P4);
                        if (message != null) {
                            ArrayList<Integer> arrayList9 = new ArrayList<>();
                            arrayList9.add(Integer.valueOf(message.id));
                            MessagesController.getInstance(photoViewer.T).deleteMessages(arrayList9, null, null, MessageObject.getDialogId(message), message.quick_reply_shortcut_id, true, 0);
                            NotificationCenter.getInstance(photoViewer.T).lambda$postNotificationNameOnUIThread$1(NotificationCenter.reloadDialogPhotos, new Object[0]);
                        }
                        if (!photoViewer.I1()) {
                            TLRPC.Photo photo = (TLRPC.Photo) arrayList6.get(photoViewer.P4);
                            if (photo != null) {
                                TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
                                tL_inputPhoto.id = photo.id;
                                tL_inputPhoto.access_hash = photo.access_hash;
                                byte[] bArr = photo.file_reference;
                                tL_inputPhoto.file_reference = bArr;
                                if (bArr == null) {
                                    tL_inputPhoto.file_reference = new byte[0];
                                }
                                if (photoViewer.z5 > 0) {
                                    MessagesController.getInstance(photoViewer.T).deleteUserPhoto(tL_inputPhoto);
                                }
                                MessagesStorage.getInstance(photoViewer.T).clearUserPhoto(photoViewer.z5, photo.id);
                                arrayList2.remove(photoViewer.P4);
                                photoViewer.c7.remove(photoViewer.P4);
                                photoViewer.b7.remove(photoViewer.P4);
                                arrayList3.remove(photoViewer.P4);
                                arrayList6.remove(photoViewer.P4);
                                if (arrayList2.isEmpty()) {
                                    photoViewer.G0(false, false);
                                } else {
                                    int i16 = photoViewer.P4;
                                    if (i16 >= arrayList6.size()) {
                                        i16 = arrayList6.size() - 1;
                                    }
                                    photoViewer.P4 = -1;
                                    photoViewer.A2(i16);
                                }
                                if (message == null) {
                                    NotificationCenter.getInstance(photoViewer.T).lambda$postNotificationNameOnUIThread$1(NotificationCenter.reloadDialogPhotos, new Object[0]);
                                    break;
                                }
                            }
                        } else {
                            if (photoViewer.z5 > 0) {
                                MessagesController.getInstance(photoViewer.T).deleteUserPhoto(null);
                            } else {
                                MessagesController.getInstance(photoViewer.T).changeChatAvatar(-photoViewer.z5, null, null, null, null, 0.0d, null, null, null, null);
                            }
                            photoViewer.G0(false, false);
                            break;
                        }
                    }
                } else if (!arrayList5.isEmpty() && photoViewer.d != null) {
                    arrayList5.remove(photoViewer.P4);
                    photoViewer.d.B(photoViewer.P4);
                    if (!arrayList5.isEmpty()) {
                        int i17 = photoViewer.P4;
                        if (i17 >= arrayList5.size()) {
                            i17 = arrayList5.size() - 1;
                        }
                        photoViewer.P4 = -1;
                        photoViewer.A2(i17);
                        break;
                    } else {
                        photoViewer.G0(false, false);
                        break;
                    }
                }
                break;
            case 5:
                LanguageSelectActivity.X((LanguageSelectActivity) obj2, (LocaleController.LocaleInfo) obj);
                break;
            case 6:
                Pattern pattern = LaunchActivity.B1;
                ((LaunchActivity) obj2).p0((wg0) obj);
                break;
            case 7:
                LaunchActivity launchActivity = (LaunchActivity) obj2;
                Pattern pattern2 = LaunchActivity.B1;
                launchActivity.getClass();
                LocaleController.getInstance().applyLanguage(((LocaleController.LocaleInfo[]) obj)[0], true, false, launchActivity.O);
                launchActivity.u0(true);
                break;
            case 15:
                ((me0) obj2).E.o1((TLRPC.TL_auth_authorization) ((TLObject) obj), false);
                break;
            case 16:
                pe0 pe0Var = (pe0) obj2;
                pe0Var.getClass();
                Bundle bundle = new Bundle();
                bundle.putString("email_unconfirmed_pattern", ((TLRPC.TL_auth_passwordRecovery) obj).email_pattern);
                bundle.putString("password", pe0Var.r);
                bundle.putString("requestPhone", pe0Var.s);
                bundle.putString("phoneHash", pe0Var.v);
                bundle.putString("phoneCode", pe0Var.w);
                pe0Var.y.u1(7, true, bundle, false);
                break;
            case 18:
                zf0.o((zf0) obj2, (Context) obj);
                break;
            case 20:
                on0 on0Var = (on0) obj2;
                boolean[] zArr2 = (boolean[]) obj;
                if (!on0Var.v0) {
                    on0Var.s1.clear();
                }
                on0Var.t1.clear();
                rm0 rm0Var = (rm0) on0Var.B1;
                rm0Var.d.j1(on0Var.E, on0Var.F, on0Var.G, zArr2[0], null, null, rm0Var.b);
                on0Var.finishFragment();
                break;
            case 21:
                int[] iArr = ((on0) obj2).x;
                iArr[2] = 0;
                iArr[1] = 0;
                iArr[0] = 0;
                ((EditTextBoldCursor) obj).setText(LocaleController.getString(R.string.PassportNoExpireDate));
                break;
            case 23:
                on0.U((on0) obj2, (TLRPC.TL_auth_passwordRecovery) obj);
                break;
            case 24:
                wo0 wo0Var = (wo0) obj2;
                wo0Var.b0 = true;
                wo0Var.a0.email_unconfirmed_pattern = (String) obj;
                wo0Var.J0();
                break;
            case 27:
                PhotoViewer.B(((ss0) obj2).b, (ArrayList) obj);
                break;
        }
    }

    @Override // org.telegram.messenger.FileLoader.FileResolver
    public File getFile() {
        switch (this.a) {
            case 25:
                PhotoViewer photoViewer = (PhotoViewer) this.b;
                return FileLoader.getInstance(photoViewer.T).getPathToAttach((TLObject) this.c, true);
            default:
                PhotoViewer photoViewer2 = (PhotoViewer) this.b;
                return FileLoader.getInstance(photoViewer2.T).getPathToMessage((TLRPC.Message) this.c);
        }
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public /* synthetic */ void onAnimationReady(ImageReceiver imageReceiver) {
        org.telegram.messenger.h5.b(this, imageReceiver);
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        switch (this.a) {
            case 14:
                ge0 ge0Var = (ge0) this.b;
                com.google.android.gms.internal.clearcut.v0 v0Var = (com.google.android.gms.internal.clearcut.v0) this.c;
                wg0 wg0Var = ge0Var.W;
                if (wg0Var.getParentActivity() != null) {
                    wg0Var.getParentActivity().startActivityForResult(v0Var.f(), 200);
                    break;
                }
                break;
            default:
                lf0 lf0Var = (lf0) this.b;
                com.google.android.gms.internal.clearcut.v0 v0Var2 = (com.google.android.gms.internal.clearcut.v0) this.c;
                wg0 wg0Var2 = lf0Var.E;
                if (wg0Var2.getParentActivity() != null && !wg0Var2.getParentActivity().isFinishing()) {
                    wg0Var2.getParentActivity().startActivityForResult(v0Var2.f(), 200);
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.messenger.ContactsLoadingObserver.Callback
    public void onResult(boolean z10) {
        LaunchActivity launchActivity = (LaunchActivity) this.b;
        Intent intent = (Intent) this.c;
        Pattern pattern = LaunchActivity.B1;
        launchActivity.X(intent, true, false, false, null, true, false);
    }

    @Override // org.telegram.ui.oy
    public boolean u(uy uyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, eg1 eg1Var) {
        p80 p80Var = (p80) this.b;
        uy uyVar2 = (uy) this.c;
        CacheByChatsController.KeepMediaException keepMediaException = null;
        int i12 = 0;
        while (i12 < arrayList.size()) {
            ArrayList arrayList2 = p80Var.f0;
            CacheByChatsController.KeepMediaException keepMediaException2 = new CacheByChatsController.KeepMediaException(((MessagesStorage.TopicKey) arrayList.get(i12)).dialogId, CacheByChatsController.KEEP_MEDIA_ONE_DAY);
            arrayList2.add(keepMediaException2);
            i12++;
            keepMediaException = keepMediaException2;
        }
        p80Var.d0.saveKeepMediaExceptions(p80Var.c0, p80Var.f0);
        Bundle bundle = new Bundle();
        bundle.putInt(TeXSymbolParser.TYPE_ATTR, p80Var.c0);
        m80 m80Var = new m80(bundle, uyVar2);
        m80Var.d = p80Var.f0;
        m80Var.U();
        p80Var.g0.presentFragment(m80Var);
        AndroidUtilities.runOnUIThread(new kw(23, m80Var, keepMediaException), 150L);
        return true;
    }

    @Override // org.telegram.ui.Components.al0
    public /* synthetic */ void r0(View view, float f7, float f10) {
    }
}
