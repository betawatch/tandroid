package eg;

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
import org.telegram.ui.Components.al0;
import org.telegram.ui.Components.b5;
import org.telegram.ui.Components.b8;
import org.telegram.ui.Components.bl0;
import org.telegram.ui.Components.cl0;
import org.telegram.ui.Components.dk0;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.eo;
import org.telegram.ui.Components.fk0;
import org.telegram.ui.Components.g8;
import org.telegram.ui.Components.io;
import org.telegram.ui.Components.j6;
import org.telegram.ui.Components.jr;
import org.telegram.ui.Components.mc0;
import org.telegram.ui.Components.w7;
import org.telegram.ui.Components.wk0;
import org.telegram.ui.Components.x7;
import org.telegram.ui.ContactsActivity;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PrivacyControlActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.dm0;
import org.telegram.ui.eg0;
import org.telegram.ui.ej;
import org.telegram.ui.fg0;
import org.telegram.ui.tn;
import org.telegram.ui.ub0;
import org.telegram.ui.vm0;
import org.telegram.ui.zi0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class n2 implements cl0, f5.j, MessagesStorage.BooleanCallback, mc0, ImageReceiver.ImageReceiverDelegate, b5, bl0, al0, org.telegram.ui.ActionBar.b2, org.telegram.ui.mc0, wk0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ n2(int i10, Object obj, int i11) {
        this.a = i11;
        this.b = i10;
        this.c = obj;
    }

    @Override // org.telegram.ui.Components.b5
    public void I(int i10, int i11, boolean z10) {
        switch (this.a) {
            case 5:
                AndroidUtilities.runOnUIThread(new j3.y(i10, this.b, (io) this.c, 7), 16L);
                break;
            default:
                AndroidUtilities.runOnUIThread(new j3.y(i10, this.b, (eo) this.c, 8), 16L);
                break;
        }
    }

    @Override // org.telegram.ui.Components.al0
    public void b(float f9, float f10, int i10, View view) {
        switch (this.a) {
            case 8:
                ContactsActivity.U((ContactsActivity) this.c, this.b, view, i10);
                break;
            default:
                zi0.P((zi0) this.c, this.b, view);
                break;
        }
    }

    @Override // org.telegram.ui.Components.al0
    public /* synthetic */ boolean b1(View view) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Components.bl0
    public boolean c(int i10, View view) {
        fk0 fk0Var = (fk0) this.c;
        if (this.b == 5) {
            fk0Var.getClass();
            return false;
        }
        ek0 ek0Var = fk0Var.c0;
        if (ek0Var == null || !(view instanceof dk0)) {
            return false;
        }
        ek0Var.Q(fk0Var, ((dk0) view).e, true, false);
        return true;
    }

    @Override // org.telegram.ui.mc0
    public void d(TLRPC.MessageMedia messageMedia, int i10, boolean z10, int i11, long j10) {
        HashMap hashMap = (HashMap) this.c;
        Pattern pattern = LaunchActivity.x1;
        Iterator it = hashMap.entrySet().iterator();
        while (it.hasNext()) {
            MessageObject messageObject = (MessageObject) ((Map.Entry) it.next()).getValue();
            SendMessagesHelper.getInstance(this.b).sendMessage(SendMessagesHelper.SendMessageParams.of(messageMedia, messageObject.getDialogId(), messageObject, (MessageObject) null, (TLRPC.ReplyMarkup) null, (HashMap<String, String>) null, true, 0, 0));
        }
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        b8 b8Var = (b8) this.c;
        if (this.b == b8Var.b) {
            g8 g8Var = ((w7) b8Var).e;
            Bitmap bitmap = imageReceiver.getBitmap();
            int dp = ((bitmap == null || !imageReceiver.hasImageLoaded()) && !imageReceiver.hasBitmapImage()) ? 0 : AndroidUtilities.dp(64.0f);
            x7 x7Var = g8Var.F;
            ValueAnimator valueAnimator = g8Var.O0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                g8Var.O0 = null;
            }
            if (x7Var.getCustomPaddingRight() != dp) {
                ValueAnimator ofInt = ValueAnimator.ofInt(x7Var.getCustomPaddingRight(), dp);
                g8Var.O0 = ofInt;
                if (dp == 0) {
                    ofInt.setStartDelay(200L);
                    g8Var.O0.setDuration(100L);
                } else {
                    ofInt.setDuration(200L);
                }
                g8Var.O0.setInterpolator(new DecelerateInterpolator());
                g8Var.O0.addUpdateListener(new j6(g8Var, 2));
                g8Var.O0.start();
            }
            if (g8Var.e0.getTag() != null) {
                g8Var.f0.setImageBitmap(bitmap);
            }
        }
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public /* synthetic */ void didSetImageBitmap(int i10, String str, Drawable drawable) {
        i5.a(this, i10, str, drawable);
    }

    @Override // org.telegram.ui.Components.mc0
    public String e(int i10) {
        Calendar calendar = (Calendar) this.c;
        calendar.clear();
        int i11 = this.b;
        calendar.set(1, i11);
        calendar.set(2, 0);
        calendar.add(2, i10 - 120);
        return calendar.get(1) == i11 ? LocaleController.getInstance().getFormatterMonthOnly().format(calendar.getTimeInMillis()) : LocaleController.getInstance().getFormatterMonthYear().format(calendar.getTimeInMillis());
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        switch (this.a) {
            case 9:
                ArrayList arrayList = ((LaunchActivity) this.c).Z;
                if (!arrayList.isEmpty()) {
                    MessagesController.getInstance(this.b).openByUserName("spambot", (org.telegram.ui.ActionBar.o2) j7.l1.i(1, arrayList), 1);
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
                fg0 fg0Var = ((eg0) this.c).R;
                int i11 = UserConfig.selectedAccount;
                int i12 = this.b;
                if (i11 != i12) {
                    ((LaunchActivity) fg0Var.getParentActivity()).K0(i12);
                }
                fg0Var.finishFragment();
                break;
            case 14:
                vm0 vm0Var = ((dm0) this.c).a;
                vm0Var.z1(vm0Var.U[this.b]);
                break;
            case 15:
                PrivacyControlActivity privacyControlActivity = (PrivacyControlActivity) this.c;
                privacyControlActivity.getClass();
                privacyControlActivity.presentFragment(new PrivacyControlActivity(this.b, false), true);
                break;
        }
    }

    @Override // f5.j
    public void invoke(Object obj) {
        ((j3.a2) obj).onMediaItemTransition((j3.f1) this.c, this.b);
    }

    @Override // org.telegram.ui.Components.al0
    public /* synthetic */ void o0(View view, float f9, float f10) {
        int i10 = this.a;
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public /* synthetic */ void onAnimationReady(ImageReceiver imageReceiver) {
        i5.b(this, imageReceiver);
    }

    @Override // org.telegram.ui.Components.wk0
    public int run() {
        f2.j0 j0Var = ((ub0) this.c).c;
        int dp = AndroidUtilities.dp(60.0f);
        int i10 = this.b;
        j0Var.h1(i10, dp);
        return i10;
    }

    public /* synthetic */ n2(Object obj, int i10, int i11) {
        this.a = i11;
        this.c = obj;
        this.b = i10;
    }

    @Override // org.telegram.ui.Components.cl0
    public boolean b(float f9, float f10, int i10, View view) {
        w2 w2Var = (w2) this.c;
        ig.a aVar = w2Var.Z;
        HashSet hashSet = w2Var.d0;
        if (!(view instanceof ig.n)) {
            return false;
        }
        ig.n nVar = (ig.n) view;
        TLRPC.User user = nVar.getUser();
        long j10 = user != null ? user.id : -nVar.getChat().id;
        int i11 = this.b;
        boolean z10 = (i11 == 4 && hashSet.isEmpty()) ? false : true;
        if (hashSet.contains(Long.valueOf(j10))) {
            hashSet.remove(Long.valueOf(j10));
        } else {
            hashSet.add(Long.valueOf(j10));
            w2Var.j0.put(Long.valueOf(j10), user);
        }
        if (hashSet.size() == w2Var.Z() + 1) {
            hashSet.remove(Long.valueOf(j10));
            w2Var.f0();
            return true;
        }
        boolean z11 = (i11 == 4 && hashSet.isEmpty()) ? false : true;
        if (z10 != z11) {
            aVar.setVisibility(0);
            aVar.animate().alpha(z11 ? 1.0f : 0.0f).translationY(z11 ? 0.0f : AndroidUtilities.dp(12.0f)).setInterpolator(jr.h).setDuration(320L).withEndAction(!z11 ? new h2(w2Var, 7) : null).start();
            fg.h hVar = w2Var.l0;
            boolean z12 = !z11;
            if (hVar.x != z12) {
                hVar.x = z12;
                AndroidUtilities.forEachViews((RecyclerView) hVar.f, (f5.d) new fg.f(z12));
            }
        }
        w2Var.W();
        w2Var.V.b(true, hashSet, new h2(w2Var, 8), null);
        w2Var.i0(true, true);
        w2Var.X();
        return true;
    }

    @Override // org.telegram.messenger.MessagesStorage.BooleanCallback
    public void run(boolean z10) {
        tn tnVar = ((ej) this.c).b;
        int i10 = this.b;
        if (i10 == 15 && ChatObject.isChannel(tnVar.e)) {
            TLRPC.Chat chat = tnVar.e;
            if (!chat.megagroup || ChatObject.isPublic(chat)) {
                tnVar.getMessagesController().deleteDialog(tnVar.P5, 2, z10);
                return;
            }
        }
        if (i10 == 15) {
            tnVar.qa(tnVar.Z3, z10);
            return;
        }
        NotificationCenter notificationCenter = tnVar.getNotificationCenter();
        int i11 = NotificationCenter.closeChats;
        notificationCenter.removeObserver(tnVar, i11);
        tnVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i11, new Object[0]);
        tnVar.finishFragment();
        tnVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needDeleteDialog, Long.valueOf(tnVar.P5), tnVar.f, tnVar.e, Boolean.valueOf(z10));
    }

    public /* synthetic */ n2(ej ejVar, int i10, boolean z10) {
        this.a = 2;
        this.c = ejVar;
        this.b = i10;
    }

    @Override // org.telegram.ui.Components.cl0
    public /* synthetic */ void h() {
    }

    @Override // org.telegram.ui.Components.cl0
    public /* synthetic */ void r(float f9) {
    }

    private final /* synthetic */ void a(View view, float f9, float f10) {
    }

    private final /* synthetic */ void f(View view, float f9, float f10) {
    }
}
