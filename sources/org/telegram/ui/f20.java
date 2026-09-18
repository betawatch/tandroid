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

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class f20 implements org.telegram.ui.ActionBar.b2, qy, ContactsLoadingObserver.Callback, org.telegram.ui.Components.cv0, org.telegram.ui.Components.cl0, ImageReceiver.ImageReceiverDelegate, OnCompleteListener, org.telegram.ui.Components.bl0, bu, FileLoader.FileResolver, org.telegram.ui.Components.b5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ f20(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // org.telegram.ui.qy
    public /* synthetic */ boolean A() {
        return false;
    }

    @Override // org.telegram.ui.Components.b5
    public void J(int i10, int i11, boolean z10) {
        uv0 uv0Var = (uv0) this.b;
        TLRPC.TL_messageMediaToDo tL_messageMediaToDo = (TLRPC.TL_messageMediaToDo) this.c;
        cw0 cw0Var = uv0Var.a;
        cw0Var.e0.a(tL_messageMediaToDo);
        cw0Var.finishFragment();
    }

    @Override // org.telegram.ui.qy
    public /* synthetic */ boolean K(wy wyVar) {
        return false;
    }

    @Override // org.telegram.ui.bu
    public void a1(xt xtVar) {
        qn0 qn0Var = (qn0) this.b;
        int intValue = ((Integer) ((View) this.c).getTag()).intValue();
        EditTextBoldCursor editTextBoldCursor = qn0Var.Y[intValue];
        if (intValue == 5) {
            qn0Var.s = xtVar.d;
        } else {
            qn0Var.v = xtVar.d;
        }
        editTextBoldCursor.setText(xtVar.a);
    }

    @Override // org.telegram.ui.Components.cv0
    public void b(LocationController.SharingLocationInfo sharingLocationInfo) {
        LaunchActivity launchActivity = (LaunchActivity) this.b;
        int[] iArr = (int[]) this.c;
        Pattern pattern = LaunchActivity.B1;
        int i10 = sharingLocationInfo.messageObject.currentAccount;
        iArr[0] = i10;
        launchActivity.K0(i10);
        kd0 kd0Var = new kd0(2);
        kd0Var.u0(sharingLocationInfo.messageObject);
        kd0Var.F0 = new ai.z1(iArr, sharingLocationInfo.messageObject.getDialogId(), 10);
        launchActivity.p0(kd0Var);
    }

    @Override // org.telegram.ui.Components.bl0
    public void c(float f7, float f10, int i10, View view) {
        NotificationsCustomSettingsActivity.U((NotificationsCustomSettingsActivity) this.b, (Context) this.c, view, i10, f7, f10);
    }

    @Override // org.telegram.ui.Components.cl0
    public boolean d(int i10, View view) {
        kd0 kd0Var = (kd0) this.b;
        Context context = (Context) this.c;
        if (kd0Var.G0 == 2) {
            Object J = kd0Var.T.J(i10);
            if (J instanceof ed0) {
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(context, null);
                org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(0, kd0Var.getParentActivity(), kd0Var.getResourceProvider(), true, true);
                g1Var.setMinimumWidth(AndroidUtilities.dp(200.0f));
                g1Var.g(LocaleController.getString(R.string.GetDirections), R.drawable.filled_directions, null);
                g1Var.setOnClickListener(new uv(16, kd0Var, (ed0) J));
                actionBarPopupWindow$ActionBarPopupWindowLayout.addView(g1Var);
                cd0 cd0Var = new cd0(kd0Var, actionBarPopupWindow$ActionBarPopupWindowLayout);
                kd0Var.I0 = cd0Var;
                cd0Var.setOutsideTouchable(true);
                kd0Var.I0.setClippingEnabled(true);
                kd0Var.I0.setInputMethodMode(2);
                kd0Var.I0.setSoftInputMode(0);
                int[] iArr = new int[2];
                view.getLocationInWindow(iArr);
                kd0Var.I0.showAtLocation(view, 48, 0, iArr[1] - AndroidUtilities.dp(52.0f));
                kd0Var.I0.b();
                return true;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Components.bl0
    public /* synthetic */ boolean d1(View view) {
        return false;
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        Bitmap g02;
        kd0 kd0Var = (kd0) this.b;
        ed0 ed0Var = (ed0) this.c;
        kd0Var.getClass();
        if (!z10 || z11 || ed0Var.e == null || (g02 = kd0Var.g0(ed0Var)) == null) {
            return;
        }
        ed0Var.e.setIcon(g02);
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public /* synthetic */ void didSetImageBitmap(int i10, String str, Drawable drawable) {
        org.telegram.messenger.h5.a(this, i10, str, drawable);
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void f(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        ConferenceCall conferenceCall;
        ArrayList<Long> arrayList;
        TLRPC.EncryptedChat encryptedChat;
        int i11 = this.a;
        org.telegram.ui.ActionBar.c2 c2Var2 = null;
        int i12 = 0;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i11) {
            case 0:
                g20 g20Var = (g20) obj2;
                MessagesController.DialogFilter dialogFilter = (MessagesController.DialogFilter) obj;
                FiltersSetupActivity filtersSetupActivity = g20Var.e;
                if (filtersSetupActivity.getParentActivity() != null) {
                    org.telegram.ui.ActionBar.c2 c2Var3 = new org.telegram.ui.ActionBar.c2(filtersSetupActivity.getParentActivity(), 3, null);
                    c2Var3.g0 = false;
                    c2Var3.show();
                    c2Var2 = c2Var3;
                }
                TLRPC.TL_messages_updateDialogFilter tL_messages_updateDialogFilter = new TLRPC.TL_messages_updateDialogFilter();
                tL_messages_updateDialogFilter.id = dialogFilter.id;
                filtersSetupActivity.getConnectionsManager().sendRequest(tL_messages_updateDialogFilter, new ca(g20Var, c2Var2, dialogFilter, 10));
                break;
            case 1:
                k60 k60Var = (k60) obj2;
                TLObject tLObject = (TLObject) obj;
                AccountInstance accountInstance = k60Var.d;
                if (!k60Var.o1()) {
                    if (!(tLObject instanceof TLRPC.User)) {
                        TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                        accountInstance.getMessagesController().deleteParticipantFromChat(k60Var.i1(), (TLRPC.User) null, chat, false, false);
                        k60Var.k1().k(0L, 32, chat, null, null, null);
                        break;
                    } else {
                        TLRPC.User user = (TLRPC.User) tLObject;
                        accountInstance.getMessagesController().deleteParticipantFromChat(k60Var.i1(), user);
                        k60Var.k1().k(0L, 32, user, null, null, null);
                        break;
                    }
                } else {
                    VoIPService sharedInstance = VoIPService.getSharedInstance();
                    if (sharedInstance != null && (conferenceCall = sharedInstance.conference) != null && (tLObject instanceof TLRPC.User)) {
                        TLRPC.User user2 = (TLRPC.User) tLObject;
                        conferenceCall.kick(user2.id);
                        k60Var.a1.addKickedUser(user2.id);
                        k60Var.k1().k(0L, 102, user2, null, null, null);
                        break;
                    }
                }
                break;
            case 2:
                g70 g70Var = (g70) obj2;
                g70Var.x.i((TLRPC.User) obj);
                if (g70Var.f.r.length() > 0) {
                    g70Var.f.r.setText((CharSequence) null);
                    break;
                }
                break;
            case 3:
                g70 g70Var2 = (g70) obj2;
                g70Var2.getClass();
                org.telegram.ui.Cells.z1 z1Var = ((org.telegram.ui.Cells.z1[]) obj)[0];
                if (z1Var != null && z1Var.b()) {
                    i12 = 100;
                }
                g70Var2.m0(i12);
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
                PhotoViewer photoViewer = ((us0) obj2).b;
                dv0 dv0Var = photoViewer.d;
                ArrayList arrayList2 = photoViewer.a7;
                ArrayList arrayList3 = photoViewer.d7;
                ArrayList arrayList4 = photoViewer.Y6;
                ArrayList arrayList5 = photoViewer.e7;
                ArrayList arrayList6 = photoViewer.f7;
                if (!dv0Var.M()) {
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
                ((LaunchActivity) obj2).p0((yg0) obj);
                break;
            case 7:
                LaunchActivity launchActivity = (LaunchActivity) obj2;
                Pattern pattern2 = LaunchActivity.B1;
                launchActivity.getClass();
                LocaleController.getInstance().applyLanguage(((LocaleController.LocaleInfo[]) obj)[0], true, false, launchActivity.O);
                launchActivity.u0(true);
                break;
            case 15:
                ((oe0) obj2).E.o1((TLRPC.TL_auth_authorization) ((TLObject) obj), false);
                break;
            case 16:
                re0 re0Var = (re0) obj2;
                re0Var.getClass();
                Bundle bundle = new Bundle();
                bundle.putString("email_unconfirmed_pattern", ((TLRPC.TL_auth_passwordRecovery) obj).email_pattern);
                bundle.putString("password", re0Var.r);
                bundle.putString("requestPhone", re0Var.s);
                bundle.putString("phoneHash", re0Var.v);
                bundle.putString("phoneCode", re0Var.w);
                re0Var.y.u1(7, true, bundle, false);
                break;
            case 18:
                bg0.o((bg0) obj2, (Context) obj);
                break;
            case 20:
                qn0 qn0Var = (qn0) obj2;
                boolean[] zArr2 = (boolean[]) obj;
                if (!qn0Var.v0) {
                    qn0Var.s1.clear();
                }
                qn0Var.t1.clear();
                tm0 tm0Var = (tm0) qn0Var.B1;
                tm0Var.d.j1(qn0Var.E, qn0Var.F, qn0Var.G, zArr2[0], null, null, tm0Var.b);
                qn0Var.finishFragment();
                break;
            case 21:
                int[] iArr = ((qn0) obj2).x;
                iArr[2] = 0;
                iArr[1] = 0;
                iArr[0] = 0;
                ((EditTextBoldCursor) obj).setText(LocaleController.getString(R.string.PassportNoExpireDate));
                break;
            case 23:
                qn0.U((qn0) obj2, (TLRPC.TL_auth_passwordRecovery) obj);
                break;
            case 24:
                yo0 yo0Var = (yo0) obj2;
                yo0Var.b0 = true;
                yo0Var.a0.email_unconfirmed_pattern = (String) obj;
                yo0Var.J0();
                break;
            case 27:
                PhotoViewer.B(((us0) obj2).b, (ArrayList) obj);
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
                ie0 ie0Var = (ie0) this.b;
                com.google.android.gms.internal.clearcut.v0 v0Var = (com.google.android.gms.internal.clearcut.v0) this.c;
                yg0 yg0Var = ie0Var.W;
                if (yg0Var.getParentActivity() != null) {
                    yg0Var.getParentActivity().startActivityForResult(v0Var.f(), 200);
                    break;
                }
                break;
            default:
                nf0 nf0Var = (nf0) this.b;
                com.google.android.gms.internal.clearcut.v0 v0Var2 = (com.google.android.gms.internal.clearcut.v0) this.c;
                yg0 yg0Var2 = nf0Var.E;
                if (yg0Var2.getParentActivity() != null && !yg0Var2.getParentActivity().isFinishing()) {
                    yg0Var2.getParentActivity().startActivityForResult(v0Var2.f(), 200);
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

    @Override // org.telegram.ui.qy
    public boolean u(wy wyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, fg1 fg1Var) {
        r80 r80Var = (r80) this.b;
        wy wyVar2 = (wy) this.c;
        CacheByChatsController.KeepMediaException keepMediaException = null;
        int i12 = 0;
        while (i12 < arrayList.size()) {
            ArrayList arrayList2 = r80Var.f0;
            CacheByChatsController.KeepMediaException keepMediaException2 = new CacheByChatsController.KeepMediaException(((MessagesStorage.TopicKey) arrayList.get(i12)).dialogId, CacheByChatsController.KEEP_MEDIA_ONE_DAY);
            arrayList2.add(keepMediaException2);
            i12++;
            keepMediaException = keepMediaException2;
        }
        r80Var.d0.saveKeepMediaExceptions(r80Var.c0, r80Var.f0);
        Bundle bundle = new Bundle();
        bundle.putInt(TeXSymbolParser.TYPE_ATTR, r80Var.c0);
        o80 o80Var = new o80(bundle, wyVar2);
        o80Var.d = r80Var.f0;
        o80Var.U();
        r80Var.g0.presentFragment(o80Var);
        AndroidUtilities.runOnUIThread(new mw(23, o80Var, keepMediaException), 150L);
        return true;
    }

    @Override // org.telegram.ui.Components.bl0
    public /* synthetic */ void r0(View view, float f7, float f10) {
    }
}
