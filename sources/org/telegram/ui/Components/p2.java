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
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import java.io.File;
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
import org.telegram.messenger.SecretChatHelper;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ContactsActivity;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final /* synthetic */ class p2 implements org.telegram.ui.ActionBar.z1, d5, IMapsProvider.ITouchInterceptor, org.telegram.ui.Cells.r5, ImageReceiver.ImageReceiverDelegate, cj, org.telegram.ui.ActionBar.l1, cm0, Utilities.Callback5, MessagesStorage.BooleanCallback, bm0, dm0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ p2(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // org.telegram.ui.Components.d5
    public void C(int i10, int i11, boolean z10) {
        MessageObject threadMessage;
        switch (this.a) {
            case 6:
                of ofVar = (of) this.c;
                String str = (String) this.b;
                ChatActivityEnterView chatActivityEnterView = ofVar.a;
                long j10 = chatActivityEnterView.Q2;
                MessageObject messageObject = chatActivityEnterView.T2;
                threadMessage = chatActivityEnterView.getThreadMessage();
                SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of(str, j10, messageObject, threadMessage, null, false, null, null, null, z10, i10, i11, null, false);
                org.telegram.ui.sn snVar = chatActivityEnterView.P2;
                of2.sendMessageChatArguments = snVar != null ? snVar.H8() : null;
                of2.effect_id = chatActivityEnterView.S4;
                SendMessagesHelper.getInstance(chatActivityEnterView.Q).sendMessage(of2);
                chatActivityEnterView.setFieldText("");
                chatActivityEnterView.m0.c();
                xe xeVar = chatActivityEnterView.J0;
                chatActivityEnterView.S4 = 0L;
                xeVar.setEffect(0L);
                break;
            case 7:
                ((ng) this.b).o((t0.i) this.c, z10, i10, i11);
                break;
            case 8:
            default:
                fo foVar = (fo) this.b;
                View view = (View) this.c;
                if (!z10) {
                    foVar.getClass();
                    break;
                } else {
                    foVar.V = i10;
                    foVar.U = 0;
                    if (!(view instanceof org.telegram.ui.Cells.r8)) {
                        foVar.r.m(foVar.I0);
                        break;
                    } else {
                        foVar.X((org.telegram.ui.Cells.r8) view, true);
                        break;
                    }
                }
            case 9:
                ol olVar = (ol) this.b;
                ql qlVar = (ql) this.c;
                rl rlVar = olVar.b;
                rlVar.v0.b(qlVar.c, rlVar.w0, z10, i10, 0L);
                rlVar.b.dismiss(true);
                break;
        }
    }

    @Override // org.telegram.ui.Components.bm0
    public /* synthetic */ boolean P0(View view) {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.l1
    public void a() {
        cp cpVar = (cp) this.b;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.c;
        if (cpVar.c != null) {
            cpVar.h = actionBarPopupWindow$ActionBarPopupWindowLayout.getVisibleHeight() - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredHeight();
            cpVar.a();
        }
    }

    @Override // org.telegram.ui.Cells.r5
    public void b(org.telegram.ui.Cells.s5 s5Var) {
        TLRPC.Chat chat;
        sm smVar = (sm) this.b;
        org.telegram.ui.Cells.s5 s5Var2 = (org.telegram.ui.Cells.s5) this.c;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = smVar.v;
        boolean z10 = chatAttachAlertPhotoLayout.v0;
        ti tiVar = chatAttachAlertPhotoLayout.b;
        if (z10) {
            int i10 = tiVar.T0;
            org.telegram.ui.ActionBar.o2 o2Var = tiVar.f0;
            if (i10 != 0 || tiVar.H) {
                return;
            }
            int intValue = ((Integer) s5Var.getTag()).intValue();
            MediaController.PhotoEntry photoEntry = s5Var.getPhotoEntry();
            if (chatAttachAlertPhotoLayout.X(photoEntry)) {
                return;
            }
            HashMap hashMap = ChatAttachAlertPhotoLayout.s1;
            if (hashMap.size() + 1 > ChatAttachAlertPhotoLayout.P(chatAttachAlertPhotoLayout)) {
                new xc(tiVar.u1, chatAttachAlertPhotoLayout.a).t(AndroidUtilities.replaceTags(LocaleController.formatPluralString("BusinessRepliesToastLimit", o2Var.getMessagesController().config.quickReplyMessagesLimit.get(), new Object[0])), null).j();
                return;
            }
            boolean containsKey = hashMap.containsKey(Integer.valueOf(photoEntry.imageId));
            boolean z11 = !containsKey;
            if (!containsKey && tiVar.V1 >= 0 && hashMap.size() >= tiVar.V1) {
                if (!tiVar.W1 || !(o2Var instanceof org.telegram.ui.sn) || (chat = ((org.telegram.ui.sn) o2Var).e) == null || ChatObject.hasAdminRights(chat) || !chat.slowmode_enabled || chatAttachAlertPhotoLayout.L == 2) {
                    return;
                }
                f5.O(chatAttachAlertPhotoLayout.getContext(), LocaleController.getString(R.string.Slowmode), LocaleController.getString(R.string.SlowmodeSelectSendError), null, null, chatAttachAlertPhotoLayout.a).p();
                if (chatAttachAlertPhotoLayout.L == 1) {
                    chatAttachAlertPhotoLayout.L = 2;
                    return;
                }
                return;
            }
            int size = !containsKey ? ChatAttachAlertPhotoLayout.t1.size() : -1;
            if ((o2Var instanceof org.telegram.ui.sn) && tiVar.W1) {
                s5Var.b(size, z11, true);
            } else {
                s5Var.b(-1, z11, true);
            }
            chatAttachAlertPhotoLayout.Q(photoEntry, intValue);
            sm smVar2 = chatAttachAlertPhotoLayout.v;
            if (smVar == smVar2) {
                sm smVar3 = chatAttachAlertPhotoLayout.G;
                if (smVar3.d && chatAttachAlertPhotoLayout.T0 == chatAttachAlertPhotoLayout.U0) {
                    intValue++;
                }
                if (smVar3.f && intValue >= chatAttachAlertPhotoLayout.M0) {
                    intValue++;
                }
                smVar3.m(intValue);
            } else {
                smVar2.m(intValue);
            }
            tiVar.d2(containsKey ? 2 : 1);
            s5Var2.setHasSpoiler(photoEntry.hasSpoiler);
            s5Var2.setHighQuality(photoEntry.isHighQuality());
            s5Var2.f(photoEntry.starsAmount, hashMap.size() > 1);
        }
    }

    @Override // org.telegram.ui.Components.bm0
    public void c(float f7, float f10, int i10, View view) {
        j71 j71Var = (j71) this.b;
        Utilities.Callback5 callback5 = (Utilities.Callback5) this.c;
        m61 G = j71Var.Z2.G(i10);
        if (G == null) {
            return;
        }
        callback5.run(G, view, Integer.valueOf(i10), Float.valueOf(f7), Float.valueOf(f10));
    }

    @Override // org.telegram.ui.Components.cm0
    public boolean d(int i10, View view) {
        return aw.r((aw) this.b, (Context) this.c, view);
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        ym ymVar = (ym) this.b;
        MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) this.c;
        ymVar.getClass();
        if (z10 && !z11 && photoEntry != null && photoEntry.hasSpoiler && ymVar.d.getBitmap() == null) {
            if (ymVar.d.getBitmap() != null && !ymVar.d.getBitmap().isRecycled()) {
                ymVar.d.getBitmap().recycle();
                ymVar.d.setImageBitmap((Bitmap) null);
            }
            ymVar.d.setImageBitmap(Utilities.stackBlurBitmapMax(imageReceiver.getBitmap()));
        }
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public /* synthetic */ void didSetImageBitmap(int i10, String str, Drawable drawable) {
        org.telegram.messenger.m5.a(this, i10, str, drawable);
    }

    @Override // org.telegram.ui.Components.cj
    public void f(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j10, boolean z11, long j11) {
        Utilities.Callback callback = (Utilities.Callback) this.b;
        mn mnVar = (mn) this.c;
        if (!arrayList.isEmpty()) {
            callback.run(new sh.g((MessageObject) arrayList.get(0)));
        }
        mnVar.dismiss(true);
    }

    @Override // org.telegram.ui.ActionBar.z1
    public void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        switch (this.a) {
            case 0:
                String str = (String) this.b;
                org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) this.c;
                try {
                    Intent intent = new Intent("android.intent.action.VIEW", Uri.fromParts("sms", str, null));
                    intent.putExtra("sms_body", ContactsController.getInstance(o2Var.getCurrentAccount()).getInviteText(1));
                    o2Var.getParentActivity().startActivityForResult(intent, 500);
                    break;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 1:
                TLRPC.EncryptedChat encryptedChat = (TLRPC.EncryptedChat) this.b;
                qd0 qd0Var = (qd0) this.c;
                int i11 = encryptedChat.ttl;
                int value = qd0Var.getValue();
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
                if (i11 != encryptedChat.ttl) {
                    SecretChatHelper.getInstance(UserConfig.selectedAccount).sendTTLMessage(encryptedChat, null);
                    MessagesStorage.getInstance(UserConfig.selectedAccount).updateEncryptedChatTTL(encryptedChat);
                    break;
                }
                break;
            case 2:
                ((org.telegram.ui.fa) this.b).run(((boolean[]) this.c)[0]);
                break;
            case 3:
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
            case 4:
                ((MessagesStorage.BooleanCallback) this.b).run(((boolean[]) this.c)[0]);
                break;
            case 5:
                org.telegram.ui.ks ksVar = (org.telegram.ui.ks) this.b;
                boolean[] zArr = (boolean[]) this.c;
                boolean z10 = zArr[0];
                boolean z11 = zArr[1];
                org.telegram.ui.ey eyVar = (org.telegram.ui.ey) ksVar.b;
                ArrayList arrayList = (ArrayList) ksVar.c;
                eyVar.getClass();
                int size = arrayList.size();
                for (int i12 = 0; i12 < size; i12++) {
                    Long l4 = (Long) arrayList.get(i12);
                    long longValue = l4.longValue();
                    if (z10) {
                        eyVar.getMessagesController().reportSpam(longValue, eyVar.getMessagesController().getUser(l4), null, null, false);
                    }
                    if (z11) {
                        eyVar.getMessagesController().deleteDialog(longValue, 0, true);
                    }
                    eyVar.getMessagesController().blockPeer(longValue);
                }
                eyVar.Z3(false);
                break;
            case 16:
                ((hu) this.b).run(((ai.t) this.c).getText().toString().trim());
                break;
            case 18:
                m40 m40Var = (m40) this.c;
                HashtagSearchController.getInstance(m40Var.a).removeHashtagFromHistory((String) this.b);
                m40Var.f.N(true);
                break;
            case 19:
                qa0 qa0Var = (qa0) this.b;
                ArrayList arrayList2 = (ArrayList) this.c;
                xa0 xa0Var = qa0Var.a;
                xa0Var.getMessagesController().getStoriesController().s(xa0Var.e, arrayList2);
                xa0Var.V.M(false);
                break;
            case 21:
                ap0 ap0Var = (ap0) this.b;
                ArrayList<MessageObject> arrayList3 = (ArrayList) this.c;
                ap0Var.getClass();
                c2Var.dismiss();
                ap0Var.J0.getDownloadController().deleteRecentFiles(arrayList3);
                ap0Var.P(false);
                break;
            case 23:
                Runnable runnable2 = (Runnable) this.b;
                TLRPC.StickerSet stickerSet = (TLRPC.StickerSet) this.c;
                runnable2.run();
                TLRPC.TL_stickers_deleteStickerSet tL_stickers_deleteStickerSet = new TLRPC.TL_stickers_deleteStickerSet();
                tL_stickers_deleteStickerSet.stickerset = MediaDataController.getInputStickerSet(stickerSet);
                ConnectionsManager.getInstance(UserConfig.selectedAccount).sendRequest(tL_stickers_deleteStickerSet, new ci.d6(15));
                break;
            case 27:
                Context context = (Context) this.b;
                File file = (File) this.c;
                Intent intent2 = new Intent(context, (Class<?>) LaunchActivity.class);
                intent2.setAction("android.intent.action.SEND");
                intent2.putExtra("android.intent.extra.STREAM", Uri.fromFile(file));
                context.startActivity(intent2);
                break;
            case 28:
                org.telegram.ui.hs hsVar = (org.telegram.ui.hs) this.b;
                TLRPC.User user = (TLRPC.User) this.c;
                hsVar.getClass();
                ArrayList<TLRPC.User> arrayList4 = new ArrayList<>();
                arrayList4.add(user);
                hsVar.getContactsController().deleteContact(arrayList4, true);
                if (user != null) {
                    user.contact = false;
                }
                hsVar.finishFragment();
                break;
            default:
                ContactsActivity.W((ContactsActivity) this.c, (String) this.b);
                break;
        }
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public /* synthetic */ void onAnimationReady(ImageReceiver imageReceiver) {
        org.telegram.messenger.m5.b(this, imageReceiver);
    }

    @Override // org.telegram.messenger.IMapsProvider.ITouchInterceptor
    public boolean onInterceptTouchEvent(MotionEvent motionEvent, IMapsProvider.ICallableMethod iCallableMethod) {
        Location location;
        rl rlVar = (rl) this.b;
        org.telegram.ui.ActionBar.g6 g6Var = (org.telegram.ui.ActionBar.g6) this.c;
        ImageView imageView = rlVar.n;
        Property property = View.TRANSLATION_Y;
        ImageView imageView2 = rlVar.Q;
        if (motionEvent.getAction() == 0) {
            AnimatorSet animatorSet = rlVar.d0;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            rlVar.d0 = animatorSet2;
            animatorSet2.setDuration(200L);
            rlVar.d0.playTogether(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property, rlVar.q0 - AndroidUtilities.dp(10.0f)));
            rlVar.d0.start();
        } else if (motionEvent.getAction() == 1) {
            AnimatorSet animatorSet3 = rlVar.d0;
            if (animatorSet3 != null) {
                animatorSet3.cancel();
            }
            rlVar.I = 0.0f;
            AnimatorSet animatorSet4 = new AnimatorSet();
            rlVar.d0 = animatorSet4;
            animatorSet4.setDuration(200L);
            rlVar.d0.playTogether(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property, rlVar.q0));
            rlVar.d0.start();
        }
        if (motionEvent.getAction() == 2) {
            if (!rlVar.s0) {
                int i10 = org.telegram.ui.ActionBar.k6.ui;
                org.telegram.ui.ActionBar.r6.t(imageView, i10, g6Var, PorterDuff.Mode.MULTIPLY);
                imageView.setTag(Integer.valueOf(i10));
                rlVar.s0 = true;
            }
            IMapsProvider.IMap iMap = rlVar.F;
            if (iMap != null && (location = rlVar.p0) != null) {
                location.setLatitude(iMap.getCameraPosition().target.latitude);
                rlVar.p0.setLongitude(rlVar.F.getCameraPosition().target.longitude);
            }
            rlVar.M.L(rlVar.p0);
        }
        return ((Boolean) iCallableMethod.call(motionEvent)).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.telegram.messenger.MessagesStorage.BooleanCallback
    public void run(boolean z10) {
        bu0 bu0Var = (bu0) this.b;
        TLRPC.User user = (TLRPC.User) this.c;
        xv0 xv0Var = bu0Var.d;
        xv0Var.v1.finishFragment();
        org.telegram.ui.ActionBar.o2 o2Var = xv0Var.v1;
        if (o2Var instanceof NotificationCenter.NotificationCenterDelegate) {
            o2Var.getNotificationCenter().removeObserver((NotificationCenter.NotificationCenterDelegate) o2Var, NotificationCenter.closeChats);
        }
        o2Var.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
        o2Var.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needDeleteDialog, Long.valueOf(xv0Var.j1), user, null, Boolean.valueOf(z10));
        o2Var.getMessagesController().setSavedViewAs(false);
    }

    public /* synthetic */ p2(String str, int i10, Object obj) {
        this.a = i10;
        this.c = obj;
        this.b = str;
    }

    @Override // org.telegram.ui.Components.dm0
    public boolean c(float f7, float f10, int i10, View view) {
        j71 j71Var = (j71) this.b;
        Utilities.Callback5Return callback5Return = (Utilities.Callback5Return) this.c;
        m61 G = j71Var.Z2.G(i10);
        if (G == null) {
            return false;
        }
        return ((Boolean) callback5Return.run(G, view, Integer.valueOf(i10), Float.valueOf(f7), Float.valueOf(f10))).booleanValue();
    }

    @Override // org.telegram.messenger.Utilities.Callback5
    public void run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        mm0 mm0Var = (mm0) this.b;
        Canvas canvas = (Canvas) this.c;
        Float f7 = (Float) obj;
        Float f10 = (Float) obj2;
        Float f11 = (Float) obj3;
        Float f12 = (Float) obj4;
        Float f13 = (Float) obj5;
        if (mm0Var.N2) {
            f7 = Float.valueOf(Math.max(f7.floatValue(), mm0Var.p1()));
        }
        if (mm0Var.O2) {
            f10 = Float.valueOf(Math.min(f10.floatValue(), mm0Var.o1()));
        }
        if (f10.floatValue() <= f7.floatValue()) {
            return;
        }
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(mm0Var.getPaddingLeft() + mm0Var.G2.c, f7.floatValue(), (mm0Var.getWidth() - mm0Var.G2.c) - mm0Var.getPaddingRight(), f10.floatValue());
        mm0Var.I2.run(canvas, rectF, f11, f12, f13);
    }

    @Override // org.telegram.ui.Components.dm0
    public /* synthetic */ void h() {
    }

    @Override // org.telegram.ui.Components.dm0
    public /* synthetic */ void o(float f7) {
    }

    @Override // org.telegram.ui.Components.bm0
    public /* synthetic */ void a0(View view, float f7, float f10) {
    }
}
