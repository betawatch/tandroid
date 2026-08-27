package cg;

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
import org.telegram.messenger.i5;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.b8;
import org.telegram.ui.Components.bc0;
import org.telegram.ui.Components.bo;
import org.telegram.ui.Components.e6;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.mk0;
import org.telegram.ui.Components.qk0;
import org.telegram.ui.Components.r7;
import org.telegram.ui.Components.rk0;
import org.telegram.ui.Components.s7;
import org.telegram.ui.Components.sk0;
import org.telegram.ui.Components.uj0;
import org.telegram.ui.Components.vj0;
import org.telegram.ui.Components.w7;
import org.telegram.ui.Components.wj0;
import org.telegram.ui.Components.x4;
import org.telegram.ui.Components.xn;
import org.telegram.ui.ContactsActivity;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PrivacyControlActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.dj;
import org.telegram.ui.dj0;
import org.telegram.ui.gm0;
import org.telegram.ui.hg0;
import org.telegram.ui.ig0;
import org.telegram.ui.oc0;
import org.telegram.ui.rn;
import org.telegram.ui.xb0;
import org.telegram.ui.xm0;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class p2 implements sk0, d5.k, MessagesStorage.BooleanCallback, bc0, ImageReceiver.ImageReceiverDelegate, x4, rk0, qk0, org.telegram.ui.ActionBar.a2, oc0, mk0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ p2(int i10, Object obj, int i11) {
        this.a = i11;
        this.b = i10;
        this.c = obj;
    }

    @Override // org.telegram.ui.Components.x4
    public void I(int i10, int i11, boolean z10) {
        switch (this.a) {
            case 5:
                AndroidUtilities.runOnUIThread(new h3.z(i10, this.b, (bo) this.c, 7), 16L);
                break;
            default:
                AndroidUtilities.runOnUIThread(new h3.z(i10, this.b, (xn) this.c, 8), 16L);
                break;
        }
    }

    @Override // org.telegram.ui.Components.rk0
    public boolean a(int i10, View view) {
        wj0 wj0Var = (wj0) this.c;
        if (this.b == 5) {
            wj0Var.getClass();
            return false;
        }
        vj0 vj0Var = wj0Var.c0;
        if (vj0Var == null || !(view instanceof uj0)) {
            return false;
        }
        vj0Var.n(wj0Var, ((uj0) view).e, true, false);
        return true;
    }

    @Override // org.telegram.ui.Components.qk0
    public void c(float f10, float f11, int i10, View view) {
        switch (this.a) {
            case 8:
                ContactsActivity.U((ContactsActivity) this.c, this.b, view, i10);
                break;
            default:
                dj0.P((dj0) this.c, this.b, view);
                break;
        }
    }

    @Override // org.telegram.ui.Components.qk0
    public /* synthetic */ void c0(View view, float f10, float f11) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.oc0
    public void d(TLRPC.MessageMedia messageMedia, int i10, boolean z10, int i11, long j10) {
        HashMap hashMap = (HashMap) this.c;
        Pattern pattern = LaunchActivity.x1;
        Iterator it = hashMap.entrySet().iterator();
        while (it.hasNext()) {
            MessageObject messageObject = (MessageObject) ((Map.Entry) it.next()).getValue();
            SendMessagesHelper.getInstance(this.b).sendMessage(SendMessagesHelper.SendMessageParams.of(messageMedia, messageObject.getDialogId(), messageObject, (MessageObject) null, (TLRPC.ReplyMarkup) null, (HashMap<String, String>) null, z10, i11, 0));
        }
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        w7 w7Var = (w7) this.c;
        if (this.b == w7Var.b) {
            b8 b8Var = ((r7) w7Var).e;
            Bitmap bitmap = imageReceiver.getBitmap();
            int dp = ((bitmap == null || !imageReceiver.hasImageLoaded()) && !imageReceiver.hasBitmapImage()) ? 0 : AndroidUtilities.dp(64.0f);
            s7 s7Var = b8Var.F;
            ValueAnimator valueAnimator = b8Var.O0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                b8Var.O0 = null;
            }
            if (s7Var.getCustomPaddingRight() != dp) {
                ValueAnimator ofInt = ValueAnimator.ofInt(s7Var.getCustomPaddingRight(), dp);
                b8Var.O0 = ofInt;
                if (dp == 0) {
                    ofInt.setStartDelay(200L);
                    b8Var.O0.setDuration(100L);
                } else {
                    ofInt.setDuration(200L);
                }
                b8Var.O0.setInterpolator(new DecelerateInterpolator());
                b8Var.O0.addUpdateListener(new e6(b8Var, 2));
                b8Var.O0.start();
            }
            if (b8Var.e0.getTag() != null) {
                b8Var.f0.setImageBitmap(bitmap);
            }
        }
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public /* synthetic */ void didSetImageBitmap(int i10, String str, Drawable drawable) {
        i5.a(this, i10, str, drawable);
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.a) {
            case 9:
                ArrayList arrayList = ((LaunchActivity) this.c).Z;
                if (!arrayList.isEmpty()) {
                    MessagesController.getInstance(this.b).openByUserName("spambot", (org.telegram.ui.ActionBar.n2) i0.a.i(1, arrayList), 1);
                    break;
                }
                break;
            case 10:
            case 11:
            case 13:
            default:
                ProfileActivity profileActivity = (ProfileActivity) this.c;
                TLRPC.UserFull userFull = profileActivity.getMessagesController().getUserFull(profileActivity.a1);
                if (userFull != null) {
                    userFull.flags2 &= -4194305;
                    userFull.note = null;
                    profileActivity.getMessagesStorage().updateUserInfo(userFull, true);
                }
                TLRPC.TL_updateContactNote tL_updateContactNote = new TLRPC.TL_updateContactNote();
                tL_updateContactNote.id = profileActivity.getMessagesController().getInputUser(profileActivity.a1);
                tL_updateContactNote.note = new TLRPC.TL_textWithEntities();
                profileActivity.getConnectionsManager().sendRequest(tL_updateContactNote, null);
                profileActivity.j5();
                profileActivity.d.u(this.b);
                break;
            case 12:
                ig0 ig0Var = ((hg0) this.c).R;
                int i11 = UserConfig.selectedAccount;
                int i12 = this.b;
                if (i11 != i12) {
                    ((LaunchActivity) ig0Var.getParentActivity()).K0(i12);
                }
                ig0Var.finishFragment();
                break;
            case 14:
                xm0 xm0Var = ((gm0) this.c).a;
                xm0Var.z1(xm0Var.U[this.b]);
                break;
            case 15:
                PrivacyControlActivity privacyControlActivity = (PrivacyControlActivity) this.c;
                privacyControlActivity.getClass();
                privacyControlActivity.presentFragment(new PrivacyControlActivity(this.b, false), true);
                break;
        }
    }

    @Override // org.telegram.ui.Components.qk0
    public /* synthetic */ boolean f1(View view) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Components.bc0
    public String g(int i10) {
        Calendar calendar = (Calendar) this.c;
        calendar.clear();
        int i11 = this.b;
        calendar.set(1, i11);
        calendar.set(2, 0);
        calendar.add(2, i10 - 120);
        return calendar.get(1) == i11 ? LocaleController.getInstance().getFormatterMonthOnly().format(calendar.getTimeInMillis()) : LocaleController.getInstance().getFormatterMonthYear().format(calendar.getTimeInMillis());
    }

    @Override // d5.k
    public void invoke(Object obj) {
        ((h3.a2) obj).onMediaItemTransition((h3.f1) this.c, this.b);
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public /* synthetic */ void onAnimationReady(ImageReceiver imageReceiver) {
        i5.b(this, imageReceiver);
    }

    @Override // org.telegram.ui.Components.mk0
    public int run() {
        f2.k0 k0Var = ((xb0) this.c).c;
        int dp = AndroidUtilities.dp(60.0f);
        int i10 = this.b;
        k0Var.h1(i10, dp);
        return i10;
    }

    public /* synthetic */ p2(Object obj, int i10, int i11) {
        this.a = i11;
        this.c = obj;
        this.b = i10;
    }

    @Override // org.telegram.ui.Components.sk0
    public boolean c(float f10, float f11, int i10, View view) {
        y2 y2Var = (y2) this.c;
        gg.a aVar = y2Var.Z;
        HashSet hashSet = y2Var.d0;
        if (!(view instanceof gg.o)) {
            return false;
        }
        gg.o oVar = (gg.o) view;
        TLRPC.User user = oVar.getUser();
        long j10 = user != null ? user.id : -oVar.getChat().id;
        int i11 = this.b;
        boolean z10 = (i11 == 4 && hashSet.isEmpty()) ? false : true;
        if (hashSet.contains(Long.valueOf(j10))) {
            hashSet.remove(Long.valueOf(j10));
        } else {
            hashSet.add(Long.valueOf(j10));
            y2Var.j0.put(Long.valueOf(j10), user);
        }
        if (hashSet.size() == y2Var.Z() + 1) {
            hashSet.remove(Long.valueOf(j10));
            y2Var.f0();
            return true;
        }
        boolean z11 = (i11 == 4 && hashSet.isEmpty()) ? false : true;
        if (z10 != z11) {
            aVar.setVisibility(0);
            aVar.animate().alpha(z11 ? 1.0f : 0.0f).translationY(z11 ? 0.0f : AndroidUtilities.dp(12.0f)).setInterpolator(er.h).setDuration(320L).withEndAction(!z11 ? new j2(y2Var, 7) : null).start();
            dg.h hVar = y2Var.l0;
            boolean z12 = !z11;
            if (hVar.x != z12) {
                hVar.x = z12;
                AndroidUtilities.forEachViews((RecyclerView) hVar.f, (d5.d) new dg.f(z12));
            }
        }
        y2Var.W();
        y2Var.V.b(true, hashSet, new j2(y2Var, 8), null);
        y2Var.i0(true, true);
        y2Var.X();
        return true;
    }

    @Override // org.telegram.messenger.MessagesStorage.BooleanCallback
    public void run(boolean z10) {
        rn rnVar = ((dj) this.c).b;
        int i10 = this.b;
        if (i10 == 15 && ChatObject.isChannel(rnVar.e)) {
            TLRPC.Chat chat = rnVar.e;
            if (!chat.megagroup || ChatObject.isPublic(chat)) {
                rnVar.getMessagesController().deleteDialog(rnVar.P5, 2, z10);
                return;
            }
        }
        if (i10 == 15) {
            rnVar.qa(rnVar.Z3, z10);
            return;
        }
        NotificationCenter notificationCenter = rnVar.getNotificationCenter();
        int i11 = NotificationCenter.closeChats;
        notificationCenter.removeObserver(rnVar, i11);
        rnVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i11, new Object[0]);
        rnVar.finishFragment();
        rnVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needDeleteDialog, Long.valueOf(rnVar.P5), rnVar.f, rnVar.e, Boolean.valueOf(z10));
    }

    public /* synthetic */ p2(dj djVar, int i10, boolean z10) {
        this.a = 2;
        this.c = djVar;
        this.b = i10;
    }

    @Override // org.telegram.ui.Components.sk0
    public /* synthetic */ void i() {
    }

    @Override // org.telegram.ui.Components.sk0
    public /* synthetic */ void s(float f10) {
    }

    private final /* synthetic */ void b(View view, float f10, float f11) {
    }

    private final /* synthetic */ void e(View view, float f10, float f11) {
    }
}
