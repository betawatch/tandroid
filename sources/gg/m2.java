package gg;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.j5;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.c8;
import org.telegram.ui.Components.f6;
import org.telegram.ui.Components.fl0;
import org.telegram.ui.Components.go;
import org.telegram.ui.Components.jl0;
import org.telegram.ui.Components.kl0;
import org.telegram.ui.Components.ko;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.nk0;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.ok0;
import org.telegram.ui.Components.pk0;
import org.telegram.ui.Components.s7;
import org.telegram.ui.Components.sc0;
import org.telegram.ui.Components.t7;
import org.telegram.ui.Components.x7;
import org.telegram.ui.Components.y4;
import org.telegram.ui.ContactsActivity;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PrivacyControlActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.dn0;
import org.telegram.ui.ec0;
import org.telegram.ui.hj0;
import org.telegram.ui.jj;
import org.telegram.ui.lm0;
import org.telegram.ui.mg0;
import org.telegram.ui.ng0;
import org.telegram.ui.vc0;
import org.telegram.ui.xn;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class m2 implements ll0, h5.j, MessagesStorage.BooleanCallback, sc0, ImageReceiver.ImageReceiverDelegate, y4, kl0, jl0, org.telegram.ui.ActionBar.c2, vc0, fl0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ m2(int i10, Object obj, int i11) {
        this.a = i11;
        this.b = i10;
        this.c = obj;
    }

    @Override // org.telegram.ui.Components.y4
    public void J(int i10, int i11, boolean z4) {
        switch (this.a) {
            case 6:
                AndroidUtilities.runOnUIThread(new j3.v(i10, this.b, (ko) this.c, 7), 16L);
                break;
            default:
                AndroidUtilities.runOnUIThread(new j3.v(i10, this.b, (go) this.c, 8), 16L);
                break;
        }
    }

    @Override // org.telegram.ui.Components.jl0
    public void c(float f10, float f11, int i10, View view) {
        switch (this.a) {
            case 9:
                ContactsActivity.U((ContactsActivity) this.c, this.b, view, i10);
                break;
            default:
                hj0.P((hj0) this.c, this.b, view);
                break;
        }
    }

    @Override // org.telegram.ui.vc0
    public void d(TLRPC.MessageMedia messageMedia, int i10, boolean z4, int i11, long j10) {
        HashMap hashMap = (HashMap) this.c;
        Pattern pattern = LaunchActivity.y1;
        Iterator it = hashMap.entrySet().iterator();
        while (it.hasNext()) {
            MessageObject messageObject = (MessageObject) ((Map.Entry) it.next()).getValue();
            SendMessagesHelper.getInstance(this.b).sendMessage(SendMessagesHelper.SendMessageParams.of(messageMedia, messageObject.getDialogId(), messageObject, (MessageObject) null, (TLRPC.ReplyMarkup) null, (HashMap<String, String>) null, true, 0, 0));
        }
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public void didSetImage(ImageReceiver imageReceiver, boolean z4, boolean z10, boolean z11) {
        x7 x7Var = (x7) this.c;
        if (this.b == x7Var.b) {
            c8 c8Var = ((s7) x7Var).e;
            Bitmap bitmap = imageReceiver.getBitmap();
            int dp = ((bitmap == null || !imageReceiver.hasImageLoaded()) && !imageReceiver.hasBitmapImage()) ? 0 : AndroidUtilities.dp(64.0f);
            t7 t7Var = c8Var.G;
            ValueAnimator valueAnimator = c8Var.P0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                c8Var.P0 = null;
            }
            if (t7Var.getCustomPaddingRight() != dp) {
                ValueAnimator ofInt = ValueAnimator.ofInt(t7Var.getCustomPaddingRight(), dp);
                c8Var.P0 = ofInt;
                if (dp == 0) {
                    ofInt.setStartDelay(200L);
                    c8Var.P0.setDuration(100L);
                } else {
                    ofInt.setDuration(200L);
                }
                c8Var.P0.setInterpolator(new DecelerateInterpolator());
                c8Var.P0.addUpdateListener(new f6(c8Var, 2));
                c8Var.P0.start();
            }
            if (c8Var.f0.getTag() != null) {
                c8Var.g0.setImageBitmap(bitmap);
            }
        }
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public /* synthetic */ void didSetImageBitmap(int i10, String str, Drawable drawable) {
        j5.a(this, i10, str, drawable);
    }

    @Override // org.telegram.ui.Components.sc0
    public String e(int i10) {
        Calendar calendar = (Calendar) this.c;
        calendar.clear();
        int i11 = this.b;
        calendar.set(1, i11);
        calendar.set(2, 0);
        calendar.add(2, i10 - 120);
        return calendar.get(1) == i11 ? LocaleController.getInstance().getFormatterMonthOnly().format(calendar.getTimeInMillis()) : LocaleController.getInstance().getFormatterMonthYear().format(calendar.getTimeInMillis());
    }

    @Override // org.telegram.ui.Components.jl0
    public /* synthetic */ boolean e1(View view) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Components.kl0
    public boolean f(int i10, View view) {
        pk0 pk0Var = (pk0) this.c;
        if (this.b == 5) {
            pk0Var.getClass();
            return false;
        }
        ok0 ok0Var = pk0Var.d0;
        if (ok0Var == null || !(view instanceof nk0)) {
            return false;
        }
        ok0Var.i(pk0Var, ((nk0) view).e, true, false);
        return true;
    }

    @Override // org.telegram.ui.ActionBar.c2
    public void i(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        switch (this.a) {
            case 10:
                ArrayList arrayList = ((LaunchActivity) this.c).a0;
                if (!arrayList.isEmpty()) {
                    MessagesController.getInstance(this.b).openByUserName("spambot", (org.telegram.ui.ActionBar.p2) kh.a2.i(1, arrayList), 1);
                    break;
                }
                break;
            case 11:
            case 12:
            case 14:
            default:
                ProfileActivity profileActivity = (ProfileActivity) this.c;
                TLRPC.UserFull userFull = profileActivity.getMessagesController().getUserFull(profileActivity.b1);
                if (userFull != null) {
                    userFull.flags2 &= -4194305;
                    userFull.note = null;
                    profileActivity.getMessagesStorage().updateUserInfo(userFull, true);
                }
                TLRPC.TL_updateContactNote tL_updateContactNote = new TLRPC.TL_updateContactNote();
                tL_updateContactNote.id = profileActivity.getMessagesController().getInputUser(profileActivity.b1);
                tL_updateContactNote.note = new TLRPC.TL_textWithEntities();
                profileActivity.getConnectionsManager().sendRequest(tL_updateContactNote, null);
                profileActivity.j5();
                profileActivity.d.u(this.b);
                break;
            case 13:
                ng0 ng0Var = ((mg0) this.c).S;
                int i11 = UserConfig.selectedAccount;
                int i12 = this.b;
                if (i11 != i12) {
                    ((LaunchActivity) ng0Var.getParentActivity()).K0(i12);
                }
                ng0Var.finishFragment();
                break;
            case 15:
                dn0 dn0Var = ((lm0) this.c).a;
                dn0Var.z1(dn0Var.V[this.b]);
                break;
            case 16:
                PrivacyControlActivity privacyControlActivity = (PrivacyControlActivity) this.c;
                privacyControlActivity.getClass();
                privacyControlActivity.presentFragment(new PrivacyControlActivity(this.b, false), true);
                break;
        }
    }

    @Override // h5.j
    public void invoke(Object obj) {
        switch (this.a) {
            case 1:
                ((j3.y1) obj).onMediaItemTransition((j3.c1) this.c, this.b);
                break;
            default:
                k3.a aVar = (k3.a) this.c;
                k3.b bVar = (k3.b) obj;
                bVar.getClass();
                bVar.h(aVar, this.b);
                break;
        }
    }

    @Override // org.telegram.ui.Components.jl0
    public /* synthetic */ void o0(View view, float f10, float f11) {
        int i10 = this.a;
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public /* synthetic */ void onAnimationReady(ImageReceiver imageReceiver) {
        j5.b(this, imageReceiver);
    }

    @Override // org.telegram.ui.Components.fl0
    public int run() {
        f2.i0 i0Var = ((ec0) this.c).c;
        int dp = AndroidUtilities.dp(60.0f);
        int i10 = this.b;
        i0Var.h1(i10, dp);
        return i10;
    }

    public /* synthetic */ m2(Object obj, int i10, int i11) {
        this.a = i11;
        this.c = obj;
        this.b = i10;
    }

    @Override // org.telegram.ui.Components.ll0
    public boolean c(float f10, float f11, int i10, View view) {
        v2 v2Var = (v2) this.c;
        kg.a aVar = v2Var.a0;
        HashSet hashSet = v2Var.e0;
        if (!(view instanceof kg.n)) {
            return false;
        }
        kg.n nVar = (kg.n) view;
        TLRPC.User user = nVar.getUser();
        long j10 = user != null ? user.id : -nVar.getChat().id;
        int i11 = this.b;
        boolean z4 = (i11 == 4 && hashSet.isEmpty()) ? false : true;
        if (hashSet.contains(Long.valueOf(j10))) {
            hashSet.remove(Long.valueOf(j10));
        } else {
            hashSet.add(Long.valueOf(j10));
            v2Var.k0.put(Long.valueOf(j10), user);
        }
        if (hashSet.size() == v2Var.Z() + 1) {
            hashSet.remove(Long.valueOf(j10));
            v2Var.f0();
            return true;
        }
        boolean z10 = (i11 == 4 && hashSet.isEmpty()) ? false : true;
        if (z4 != z10) {
            aVar.setVisibility(0);
            aVar.animate().alpha(z10 ? 1.0f : 0.0f).translationY(z10 ? 0.0f : AndroidUtilities.dp(12.0f)).setInterpolator(nr.h).setDuration(320L).withEndAction(!z10 ? new g2(v2Var, 7) : null).start();
            hg.h hVar = v2Var.m0;
            boolean z11 = !z10;
            if (hVar.x != z11) {
                hVar.x = z11;
                AndroidUtilities.forEachViews((RecyclerView) hVar.f, (h5.d) new hg.f(z11));
            }
        }
        v2Var.W();
        v2Var.W.b(true, hashSet, new g2(v2Var, 8), null);
        v2Var.i0(true, true);
        v2Var.X();
        return true;
    }

    @Override // org.telegram.messenger.MessagesStorage.BooleanCallback
    public void run(boolean z4) {
        xn xnVar = ((jj) this.c).b;
        int i10 = this.b;
        if (i10 == 15 && ChatObject.isChannel(xnVar.e)) {
            TLRPC.Chat chat = xnVar.e;
            if (!chat.megagroup || ChatObject.isPublic(chat)) {
                xnVar.getMessagesController().deleteDialog(xnVar.Q5, 2, z4);
                return;
            }
        }
        if (i10 == 15) {
            xnVar.qa(xnVar.a4, z4);
            return;
        }
        NotificationCenter notificationCenter = xnVar.getNotificationCenter();
        int i11 = NotificationCenter.closeChats;
        notificationCenter.removeObserver(xnVar, i11);
        xnVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i11, new Object[0]);
        xnVar.finishFragment();
        xnVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needDeleteDialog, Long.valueOf(xnVar.Q5), xnVar.f, xnVar.e, Boolean.valueOf(z4));
    }

    public /* synthetic */ m2(k3.a aVar, int i10, j3.z1 z1Var, j3.z1 z1Var2) {
        this.a = 2;
        this.c = aVar;
        this.b = i10;
    }

    public /* synthetic */ m2(jj jjVar, int i10, boolean z4) {
        this.a = 3;
        this.c = jjVar;
        this.b = i10;
    }

    @Override // org.telegram.ui.Components.ll0
    public /* synthetic */ void h() {
    }

    @Override // org.telegram.ui.Components.ll0
    public /* synthetic */ void p(float f10) {
    }

    private final /* synthetic */ void a(View view, float f10, float f11) {
    }

    private final /* synthetic */ void b(View view, float f10, float f11) {
    }
}
