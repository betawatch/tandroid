package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.location.Location;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.HashtagSearchController;
import org.telegram.messenger.IMapsProvider;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.RichMessageLayout;
import org.telegram.messenger.SecretChatHelper;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class p1 implements org.telegram.ui.ActionBar.b2, e5, IMapsProvider.ITouchInterceptor, org.telegram.ui.Cells.w5, ImageReceiver.ImageReceiverDelegate, cj, org.telegram.ui.ActionBar.n1, cm0, Utilities.Callback5, MessagesStorage.BooleanCallback, bm0, dm0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ p1(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // org.telegram.ui.Components.e5
    public void G(int i10, int i11, boolean z10) {
        MessageObject threadMessage;
        switch (this.a) {
            case 9:
                of ofVar = (of) this.b;
                String str = (String) this.c;
                ChatActivityEnterView chatActivityEnterView = ofVar.a;
                long j10 = chatActivityEnterView.Q2;
                MessageObject messageObject = chatActivityEnterView.T2;
                threadMessage = chatActivityEnterView.getThreadMessage();
                SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of(str, j10, messageObject, threadMessage, null, false, null, null, null, z10, i10, i11, null, false);
                org.telegram.ui.wn wnVar = chatActivityEnterView.P2;
                of2.sendMessageChatArguments = wnVar != null ? wnVar.O8() : null;
                of2.effect_id = chatActivityEnterView.S4;
                SendMessagesHelper.getInstance(chatActivityEnterView.Q).sendMessage(of2);
                chatActivityEnterView.setFieldText("");
                chatActivityEnterView.m0.c();
                xe xeVar = chatActivityEnterView.J0;
                chatActivityEnterView.S4 = 0L;
                xeVar.setEffect(0L);
                break;
            case 10:
                ((ng) this.b).o((t0.i) this.c, z10, i10, i11);
                break;
            case 11:
            default:
                go goVar = (go) this.b;
                View view = (View) this.c;
                if (!z10) {
                    goVar.getClass();
                    break;
                } else {
                    goVar.V = i10;
                    goVar.U = 0;
                    if (!(view instanceof org.telegram.ui.Cells.v8)) {
                        goVar.r.m(goVar.I0);
                        break;
                    } else {
                        goVar.X((org.telegram.ui.Cells.v8) view, true);
                        break;
                    }
                }
            case 12:
                pl plVar = (pl) this.b;
                rl rlVar = (rl) this.c;
                sl slVar = plVar.b;
                slVar.u0.d(rlVar.c, slVar.v0, z10, i10, 0L);
                slVar.b.dismiss(true);
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.n1
    public void a() {
        fp fpVar = (fp) this.b;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.c;
        if (fpVar.c != null) {
            fpVar.h = actionBarPopupWindow$ActionBarPopupWindowLayout.getVisibleHeight() - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredHeight();
            fpVar.a();
        }
    }

    @Override // org.telegram.ui.Cells.w5
    public void b(org.telegram.ui.Cells.x5 x5Var) {
        TLRPC.Chat chat;
        tm tmVar = (tm) this.b;
        org.telegram.ui.Cells.x5 x5Var2 = (org.telegram.ui.Cells.x5) this.c;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = tmVar.v;
        boolean z10 = chatAttachAlertPhotoLayout.v0;
        ti tiVar = chatAttachAlertPhotoLayout.b;
        if (z10) {
            int i10 = tiVar.T0;
            org.telegram.ui.ActionBar.r2 r2Var = tiVar.f0;
            if (i10 != 0 || tiVar.H) {
                return;
            }
            int intValue = ((Integer) x5Var.getTag()).intValue();
            MediaController.PhotoEntry photoEntry = x5Var.getPhotoEntry();
            if (chatAttachAlertPhotoLayout.Y(photoEntry)) {
                return;
            }
            HashMap hashMap = ChatAttachAlertPhotoLayout.s1;
            if (hashMap.size() + 1 > ChatAttachAlertPhotoLayout.P(chatAttachAlertPhotoLayout)) {
                new wc(tiVar.u1, chatAttachAlertPhotoLayout.a).t(AndroidUtilities.replaceTags(LocaleController.formatPluralString("BusinessRepliesToastLimit", r2Var.getMessagesController().config.quickReplyMessagesLimit.get(), new Object[0])), null).j();
                return;
            }
            boolean containsKey = hashMap.containsKey(Integer.valueOf(photoEntry.imageId));
            boolean z11 = !containsKey;
            if (!containsKey && tiVar.V1 >= 0 && hashMap.size() >= tiVar.V1) {
                if (!tiVar.W1 || !(r2Var instanceof org.telegram.ui.wn) || (chat = ((org.telegram.ui.wn) r2Var).e) == null || ChatObject.hasAdminRights(chat) || !chat.slowmode_enabled || chatAttachAlertPhotoLayout.L == 2) {
                    return;
                }
                g5.N(chatAttachAlertPhotoLayout.getContext(), LocaleController.getString(R.string.Slowmode), LocaleController.getString(R.string.SlowmodeSelectSendError), null, null, chatAttachAlertPhotoLayout.a).p();
                if (chatAttachAlertPhotoLayout.L == 1) {
                    chatAttachAlertPhotoLayout.L = 2;
                    return;
                }
                return;
            }
            int size = !containsKey ? ChatAttachAlertPhotoLayout.t1.size() : -1;
            if ((r2Var instanceof org.telegram.ui.wn) && tiVar.W1) {
                x5Var.b(size, z11, true);
            } else {
                x5Var.b(-1, z11, true);
            }
            chatAttachAlertPhotoLayout.R(photoEntry, intValue);
            tm tmVar2 = chatAttachAlertPhotoLayout.v;
            if (tmVar == tmVar2) {
                tm tmVar3 = chatAttachAlertPhotoLayout.G;
                if (tmVar3.d && chatAttachAlertPhotoLayout.T0 == chatAttachAlertPhotoLayout.U0) {
                    intValue++;
                }
                if (tmVar3.f && intValue >= chatAttachAlertPhotoLayout.M0) {
                    intValue++;
                }
                tmVar3.m(intValue);
            } else {
                tmVar2.m(intValue);
            }
            tiVar.d2(containsKey ? 2 : 1);
            x5Var2.setHasSpoiler(photoEntry.hasSpoiler);
            x5Var2.setHighQuality(photoEntry.isHighQuality());
            x5Var2.f(photoEntry.starsAmount, hashMap.size() > 1);
        }
    }

    @Override // org.telegram.ui.Components.cm0
    public boolean c(int i10, View view) {
        return aw.q((aw) this.b, (Context) this.c, view);
    }

    @Override // org.telegram.ui.Components.bm0
    public /* synthetic */ boolean c1(View view) {
        return false;
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        zm zmVar = (zm) this.b;
        MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) this.c;
        zmVar.getClass();
        if (z10 && !z11 && photoEntry != null && photoEntry.hasSpoiler && zmVar.d.getBitmap() == null) {
            if (zmVar.d.getBitmap() != null && !zmVar.d.getBitmap().isRecycled()) {
                zmVar.d.getBitmap().recycle();
                zmVar.d.setImageBitmap((Bitmap) null);
            }
            zmVar.d.setImageBitmap(Utilities.stackBlurBitmapMax(imageReceiver.getBitmap()));
        }
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public /* synthetic */ void didSetImageBitmap(int i10, String str, Drawable drawable) {
        org.telegram.messenger.p5.a(this, i10, str, drawable);
    }

    @Override // org.telegram.ui.Components.bm0
    public void e(float f7, float f10, int i10, View view) {
        s71 s71Var = (s71) this.b;
        Utilities.Callback5 callback5 = (Utilities.Callback5) this.c;
        u61 G = s71Var.g3.G(i10);
        if (G == null) {
            return;
        }
        callback5.run(G, view, Integer.valueOf(i10), Float.valueOf(f7), Float.valueOf(f10));
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void h(org.telegram.ui.ActionBar.e2 e2Var, int i10) {
        switch (this.a) {
            case 0:
                li.s2 s2Var = (li.s2) this.b;
                EditText editText = (EditText) this.c;
                e2Var.dismiss();
                s2Var.run(editText.getText().toString());
                break;
            case 1:
                int[] iArr = (int[]) this.b;
                MessagesStorage.IntCallback intCallback = (MessagesStorage.IntCallback) this.c;
                int i11 = iArr[0];
                intCallback.run(i11 == 0 ? RichMessageLayout.PART_MAX_HEIGHT_DP : i11 == 1 ? 3600 : i11 == 2 ? 28800 : ConnectionsManager.DEFAULT_DATACENTER_ID);
                break;
            case 2:
                h4 h4Var = (h4) this.b;
                Utilities.Callback callback = (Utilities.Callback) this.c;
                String trim = h4Var.getText().toString().trim();
                if (TextUtils.isEmpty(trim) ? false : g5.a.matcher(trim.trim()).matches()) {
                    callback.run(trim);
                    e2Var.dismiss();
                    break;
                } else {
                    AndroidUtilities.shakeView(h4Var);
                    break;
                }
            case 3:
                String str = (String) this.b;
                org.telegram.ui.ActionBar.r2 r2Var = (org.telegram.ui.ActionBar.r2) this.c;
                try {
                    Intent intent = new Intent("android.intent.action.VIEW", Uri.fromParts("sms", str, null));
                    intent.putExtra("sms_body", ContactsController.getInstance(r2Var.getCurrentAccount()).getInviteText(1));
                    r2Var.getParentActivity().startActivityForResult(intent, 500);
                    break;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 4:
                TLRPC.EncryptedChat encryptedChat = (TLRPC.EncryptedChat) this.b;
                nd0 nd0Var = (nd0) this.c;
                int i12 = encryptedChat.ttl;
                int value = nd0Var.getValue();
                if (value >= 0 && value < 16) {
                    encryptedChat.ttl = value;
                } else if (value == 16) {
                    encryptedChat.ttl = 30;
                } else if (value == 17) {
                    encryptedChat.ttl = 60;
                } else if (value == 18) {
                    encryptedChat.ttl = 3600;
                } else if (value == 19) {
                    encryptedChat.ttl = 86400;
                } else if (value == 20) {
                    encryptedChat.ttl = 604800;
                }
                if (i12 != encryptedChat.ttl) {
                    SecretChatHelper.getInstance(UserConfig.selectedAccount).sendTTLMessage(encryptedChat, null);
                    MessagesStorage.getInstance(UserConfig.selectedAccount).updateEncryptedChatTTL(encryptedChat);
                    break;
                }
                break;
            case 5:
                ((ag.k0) this.b).run(((boolean[]) this.c)[0]);
                break;
            case 6:
                String str2 = (String) this.b;
                Runnable runnable = (Runnable) this.c;
                SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(UserConfig.selectedAccount).edit();
                edit.remove("color_" + str2);
                edit.commit();
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            case 7:
                ((MessagesStorage.BooleanCallback) this.b).run(((boolean[]) this.c)[0]);
                break;
            case 8:
                org.telegram.ui.Components.voip.k1 k1Var = (org.telegram.ui.Components.voip.k1) this.b;
                boolean[] zArr = (boolean[]) this.c;
                boolean z10 = zArr[0];
                boolean z11 = zArr[1];
                org.telegram.ui.ey eyVar = (org.telegram.ui.ey) k1Var.c;
                ArrayList arrayList = (ArrayList) k1Var.b;
                eyVar.getClass();
                int size = arrayList.size();
                for (int i13 = 0; i13 < size; i13++) {
                    Long l4 = (Long) arrayList.get(i13);
                    long longValue = l4.longValue();
                    if (z10) {
                        eyVar.getMessagesController().reportSpam(longValue, eyVar.getMessagesController().getUser(l4), null, null, false);
                    }
                    if (z11) {
                        eyVar.getMessagesController().deleteDialog(longValue, 0, true);
                    }
                    eyVar.getMessagesController().blockPeer(longValue);
                }
                eyVar.j4(false);
                break;
            case 19:
                ((iu) this.b).run(((bi.t) this.c).getText().toString().trim());
                break;
            case 22:
                o40 o40Var = (o40) this.b;
                HashtagSearchController.getInstance(o40Var.a).removeHashtagFromHistory((String) this.c);
                o40Var.f.O(true);
                break;
            case 24:
                fp0 fp0Var = (fp0) this.b;
                ArrayList<MessageObject> arrayList2 = (ArrayList) this.c;
                fp0Var.getClass();
                e2Var.dismiss();
                fp0Var.L0.getDownloadController().deleteRecentFiles(arrayList2);
                fp0Var.R(false);
                break;
            case 26:
                Runnable runnable2 = (Runnable) this.b;
                TLRPC.StickerSet stickerSet = (TLRPC.StickerSet) this.c;
                runnable2.run();
                TLRPC.TL_stickers_deleteStickerSet tL_stickers_deleteStickerSet = new TLRPC.TL_stickers_deleteStickerSet();
                tL_stickers_deleteStickerSet.stickerset = MediaDataController.getInputStickerSet(stickerSet);
                ConnectionsManager.getInstance(UserConfig.selectedAccount).sendRequest(tL_stickers_deleteStickerSet, new di.d6(15));
                break;
            default:
                qf.d.o((Context) this.b, Uri.parse((String) this.c), true, false);
                break;
        }
    }

    @Override // org.telegram.ui.Components.cj
    public void j(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j10, boolean z11, long j11) {
        Utilities.Callback callback = (Utilities.Callback) this.b;
        nn nnVar = (nn) this.c;
        if (!arrayList.isEmpty()) {
            callback.run(new th.g((MessageObject) arrayList.get(0)));
        }
        nnVar.dismiss(true);
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public /* synthetic */ void onAnimationReady(ImageReceiver imageReceiver) {
        org.telegram.messenger.p5.b(this, imageReceiver);
    }

    @Override // org.telegram.messenger.IMapsProvider.ITouchInterceptor
    public boolean onInterceptTouchEvent(MotionEvent motionEvent, IMapsProvider.ICallableMethod iCallableMethod) {
        Location location;
        sl slVar = (sl) this.b;
        org.telegram.ui.ActionBar.u6 u6Var = (org.telegram.ui.ActionBar.u6) this.c;
        ImageView imageView = slVar.n;
        Property property = View.TRANSLATION_Y;
        ImageView imageView2 = slVar.Q;
        if (motionEvent.getAction() == 0) {
            AnimatorSet animatorSet = slVar.d0;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            slVar.d0 = animatorSet2;
            animatorSet2.setDuration(200L);
            slVar.d0.playTogether(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property, slVar.p0 - AndroidUtilities.dp(10.0f)));
            slVar.d0.start();
        } else if (motionEvent.getAction() == 1) {
            AnimatorSet animatorSet3 = slVar.d0;
            if (animatorSet3 != null) {
                animatorSet3.cancel();
            }
            slVar.I = 0.0f;
            AnimatorSet animatorSet4 = new AnimatorSet();
            slVar.d0 = animatorSet4;
            animatorSet4.setDuration(200L);
            slVar.d0.playTogether(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property, slVar.p0));
            slVar.d0.start();
        }
        if (motionEvent.getAction() == 2) {
            if (!slVar.r0) {
                int i10 = org.telegram.ui.ActionBar.y6.ui;
                org.telegram.ui.ActionBar.f7.t(imageView, i10, u6Var, PorterDuff.Mode.MULTIPLY);
                imageView.setTag(Integer.valueOf(i10));
                slVar.r0 = true;
            }
            IMapsProvider.IMap iMap = slVar.F;
            if (iMap != null && (location = slVar.o0) != null) {
                location.setLatitude(iMap.getCameraPosition().target.latitude);
                slVar.o0.setLongitude(slVar.F.getCameraPosition().target.longitude);
            }
            slVar.M.L(slVar.o0);
        }
        return ((Boolean) iCallableMethod.call(motionEvent)).booleanValue();
    }

    @Override // org.telegram.messenger.Utilities.Callback5
    public void run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        nm0 nm0Var = (nm0) this.b;
        Canvas canvas = (Canvas) this.c;
        Float f7 = (Float) obj;
        Float f10 = (Float) obj2;
        Float f11 = (Float) obj3;
        Float f12 = (Float) obj4;
        Float f13 = (Float) obj5;
        if (nm0Var.Q2) {
            f7 = Float.valueOf(Math.max(f7.floatValue(), nm0Var.q1()));
        }
        if (nm0Var.R2) {
            f10 = Float.valueOf(Math.min(f10.floatValue(), nm0Var.p1()));
        }
        if (f10.floatValue() <= f7.floatValue()) {
            return;
        }
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(nm0Var.getPaddingLeft() + nm0Var.G2.c, f7.floatValue(), (nm0Var.getWidth() - nm0Var.G2.c) - nm0Var.getPaddingRight(), f10.floatValue());
        f11.getClass();
        f12.getClass();
        f13.getClass();
        nm0Var.J2.run(canvas, rectF, f11, f12, f13);
    }

    @Override // org.telegram.ui.Components.dm0
    public boolean e(float f7, float f10, int i10, View view) {
        s71 s71Var = (s71) this.b;
        Utilities.Callback5Return callback5Return = (Utilities.Callback5Return) this.c;
        u61 G = s71Var.g3.G(i10);
        if (G == null) {
            return false;
        }
        return ((Boolean) callback5Return.run(G, view, Integer.valueOf(i10), Float.valueOf(f7), Float.valueOf(f10))).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.telegram.messenger.MessagesStorage.BooleanCallback
    public void run(boolean z10) {
        bw0 bw0Var = (bw0) this.b;
        TLRPC.User user = (TLRPC.User) this.c;
        org.telegram.ui.ActionBar.r2 r2Var = bw0Var.x1;
        r2Var.finishFragment();
        if (r2Var instanceof NotificationCenter.NotificationCenterDelegate) {
            r2Var.getNotificationCenter().removeObserver((NotificationCenter.NotificationCenterDelegate) r2Var, NotificationCenter.closeChats);
        }
        r2Var.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
        r2Var.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needDeleteDialog, Long.valueOf(bw0Var.l1), user, null, Boolean.valueOf(z10));
        r2Var.getMessagesController().setSavedViewAs(false);
    }

    @Override // org.telegram.ui.Components.dm0
    public /* synthetic */ void g() {
    }

    @Override // org.telegram.ui.Components.dm0
    public /* synthetic */ void o(float f7) {
    }

    @Override // org.telegram.ui.Components.bm0
    public /* synthetic */ void l0(View view, float f7, float f10) {
    }
}
