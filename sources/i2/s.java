package i2;

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
import org.telegram.messenger.h5;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.a2;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.al0;
import org.telegram.ui.Components.b5;
import org.telegram.ui.Components.bl0;
import org.telegram.ui.Components.c8;
import org.telegram.ui.Components.cl0;
import org.telegram.ui.Components.dk0;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.fk0;
import org.telegram.ui.Components.h8;
import org.telegram.ui.Components.i6;
import org.telegram.ui.Components.ko;
import org.telegram.ui.Components.oo;
import org.telegram.ui.Components.qc0;
import org.telegram.ui.Components.qr;
import org.telegram.ui.Components.wk0;
import org.telegram.ui.Components.x7;
import org.telegram.ui.Components.y7;
import org.telegram.ui.ContactsActivity;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PrivacyControlActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.bo;
import org.telegram.ui.dd0;
import org.telegram.ui.nc0;
import org.telegram.ui.nj;
import org.telegram.ui.o20;
import org.telegram.ui.on0;
import org.telegram.ui.rj0;
import org.telegram.ui.vg0;
import org.telegram.ui.wg0;
import org.telegram.ui.wm0;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes.dex */
public final /* synthetic */ class s implements e2.m, MessagesStorage.BooleanCallback, qc0, ImageReceiver.ImageReceiverDelegate, b5, bl0, al0, a2, dd0, wk0, cl0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ s(int i10, Object obj, int i11) {
        this.a = i11;
        this.b = i10;
        this.c = obj;
    }

    @Override // org.telegram.ui.Components.b5
    public void J(int i10, int i11, boolean z10) {
        switch (this.a) {
            case 6:
                AndroidUtilities.runOnUIThread(new gg.n(i10, this.b, (oo) this.c, 8), 16L);
                break;
            default:
                AndroidUtilities.runOnUIThread(new gg.n(i10, this.b, (ko) this.c, 9), 16L);
                break;
        }
    }

    @Override // org.telegram.ui.dd0
    public void b(TLRPC.MessageMedia messageMedia, int i10, boolean z10, int i11, long j3) {
        HashMap hashMap = (HashMap) this.c;
        Pattern pattern = LaunchActivity.B1;
        Iterator it = hashMap.entrySet().iterator();
        while (it.hasNext()) {
            MessageObject messageObject = (MessageObject) ((Map.Entry) it.next()).getValue();
            SendMessagesHelper.getInstance(this.b).sendMessage(SendMessagesHelper.SendMessageParams.of(messageMedia, messageObject.getDialogId(), messageObject, (MessageObject) null, (TLRPC.ReplyMarkup) null, (HashMap<String, String>) null, true, 0, 0));
        }
    }

    @Override // org.telegram.ui.Components.al0
    public void c(float f7, float f10, int i10, View view) {
        switch (this.a) {
            case 9:
                ContactsActivity.U((ContactsActivity) this.c, this.b, view, i10);
                break;
            default:
                rj0.P((rj0) this.c, this.b, view);
                break;
        }
    }

    @Override // org.telegram.ui.Components.bl0
    public boolean d(int i10, View view) {
        fk0 fk0Var = (fk0) this.c;
        if (this.b == 5) {
            fk0Var.getClass();
            return false;
        }
        ek0 ek0Var = fk0Var.g0;
        if (ek0Var == null || !(view instanceof dk0)) {
            return false;
        }
        ek0Var.h(fk0Var, ((dk0) view).e, true, false);
        return true;
    }

    @Override // org.telegram.ui.Components.al0
    public /* synthetic */ boolean d1(View view) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        c8 c8Var = (c8) this.c;
        if (this.b == c8Var.b) {
            h8 h8Var = ((x7) c8Var).e;
            Bitmap bitmap = imageReceiver.getBitmap();
            int dp = ((bitmap == null || !imageReceiver.hasImageLoaded()) && !imageReceiver.hasBitmapImage()) ? 0 : AndroidUtilities.dp(64.0f);
            y7 y7Var = h8Var.J;
            ValueAnimator valueAnimator = h8Var.S0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                h8Var.S0 = null;
            }
            if (y7Var.getCustomPaddingRight() != dp) {
                ValueAnimator ofInt = ValueAnimator.ofInt(y7Var.getCustomPaddingRight(), dp);
                h8Var.S0 = ofInt;
                if (dp == 0) {
                    ofInt.setStartDelay(200L);
                    h8Var.S0.setDuration(100L);
                } else {
                    ofInt.setDuration(200L);
                }
                h8Var.S0.setInterpolator(new DecelerateInterpolator());
                h8Var.S0.addUpdateListener(new i6(h8Var, 2));
                h8Var.S0.start();
            }
            if (h8Var.i0.getTag() != null) {
                h8Var.j0.setImageBitmap(bitmap);
            }
        }
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public /* synthetic */ void didSetImageBitmap(int i10, String str, Drawable drawable) {
        h5.a(this, i10, str, drawable);
    }

    @Override // org.telegram.ui.Components.qc0
    public String e(int i10) {
        Calendar calendar = (Calendar) this.c;
        calendar.clear();
        int i11 = this.b;
        calendar.set(1, i11);
        calendar.set(2, 0);
        calendar.add(2, i10 - 120);
        return calendar.get(1) == i11 ? LocaleController.getInstance().getFormatterMonthOnly().format(calendar.getTimeInMillis()) : LocaleController.getInstance().getFormatterMonthYear().format(calendar.getTimeInMillis());
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void f(b2 b2Var, int i10) {
        switch (this.a) {
            case 10:
                ArrayList arrayList = ((LaunchActivity) this.c).d0;
                if (!arrayList.isEmpty()) {
                    MessagesController.getInstance(this.b).openByUserName("spambot", (n2) hg.c.h(1, arrayList), 1);
                    break;
                }
                break;
            case 11:
            case 12:
            case 14:
            default:
                ProfileActivity profileActivity = (ProfileActivity) this.c;
                TLRPC.UserFull userFull = profileActivity.getMessagesController().getUserFull(profileActivity.e1);
                if (userFull != null) {
                    userFull.flags2 &= -4194305;
                    userFull.note = null;
                    profileActivity.getMessagesStorage().updateUserInfo(userFull, true);
                }
                TLRPC.TL_updateContactNote tL_updateContactNote = new TLRPC.TL_updateContactNote();
                tL_updateContactNote.id = profileActivity.getMessagesController().getInputUser(profileActivity.e1);
                tL_updateContactNote.note = new TLRPC.TL_textWithEntities();
                profileActivity.getConnectionsManager().sendRequest(tL_updateContactNote, null);
                profileActivity.j5();
                profileActivity.d.u(this.b);
                break;
            case 13:
                wg0 wg0Var = ((vg0) this.c).V;
                int i11 = UserConfig.selectedAccount;
                int i12 = this.b;
                if (i11 != i12) {
                    ((LaunchActivity) wg0Var.getParentActivity()).K0(i12);
                }
                wg0Var.finishFragment();
                break;
            case 15:
                on0 on0Var = ((wm0) this.c).a;
                on0Var.z1(on0Var.Y[this.b]);
                break;
            case 16:
                PrivacyControlActivity privacyControlActivity = (PrivacyControlActivity) this.c;
                privacyControlActivity.getClass();
                privacyControlActivity.presentFragment(new PrivacyControlActivity(this.b, false), true);
                break;
        }
    }

    @Override // e2.m
    public void invoke(Object obj) {
        switch (this.a) {
            case 0:
                ((b2.z0) obj).onTimelineChanged(((g1) this.c).a, this.b);
                break;
            case 1:
                ((b2.z0) obj).onMediaItemTransition((b2.k0) this.c, this.b);
                break;
            default:
                j2.a aVar = (j2.a) this.c;
                j2.b bVar = (j2.b) obj;
                bVar.getClass();
                bVar.g(aVar, this.b);
                break;
        }
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public /* synthetic */ void onAnimationReady(ImageReceiver imageReceiver) {
        h5.b(this, imageReceiver);
    }

    @Override // org.telegram.ui.Components.al0
    public /* synthetic */ void r0(View view, float f7, float f10) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Components.wk0
    public int run() {
        s4.c0 c0Var = ((nc0) this.c).c;
        int dp = AndroidUtilities.dp(60.0f);
        int i10 = this.b;
        c0Var.h1(i10, dp);
        return i10;
    }

    public /* synthetic */ s(j2.a aVar, int i10, b2.a1 a1Var, b2.a1 a1Var2) {
        this.a = 2;
        this.c = aVar;
        this.b = i10;
    }

    @Override // org.telegram.ui.Components.cl0
    public boolean c(float f7, float f10, int i10, View view) {
        tg.n1 n1Var = (tg.n1) this.c;
        o20 o20Var = n1Var.d0;
        HashSet hashSet = n1Var.h0;
        if (!(view instanceof xg.l)) {
            return false;
        }
        xg.l lVar = (xg.l) view;
        TLRPC.User user = lVar.getUser();
        long j3 = user != null ? user.id : -lVar.getChat().id;
        int i11 = this.b;
        boolean z10 = (i11 == 4 && hashSet.isEmpty()) ? false : true;
        if (hashSet.contains(Long.valueOf(j3))) {
            hashSet.remove(Long.valueOf(j3));
        } else {
            hashSet.add(Long.valueOf(j3));
            n1Var.n0.put(Long.valueOf(j3), user);
        }
        if (hashSet.size() == n1Var.Z() + 1) {
            hashSet.remove(Long.valueOf(j3));
            n1Var.f0();
            return true;
        }
        boolean z11 = (i11 == 4 && hashSet.isEmpty()) ? false : true;
        if (z10 != z11) {
            o20Var.setVisibility(0);
            o20Var.animate().alpha(z11 ? 1.0f : 0.0f).translationY(z11 ? 0.0f : AndroidUtilities.dp(12.0f)).setInterpolator(qr.h).setDuration(320L).withEndAction(!z11 ? new tg.b1(n1Var, 7) : null).start();
            ug.g gVar = n1Var.p0;
            boolean z12 = !z11;
            if (gVar.y != z12) {
                gVar.y = z12;
                AndroidUtilities.forEachViews((RecyclerView) gVar.f, (e2.h) new m4.o0(3, z12));
            }
        }
        n1Var.W();
        n1Var.Z.b(true, hashSet, new tg.b1(n1Var, 8), null);
        n1Var.i0(true, true);
        n1Var.X();
        return true;
    }

    @Override // org.telegram.messenger.MessagesStorage.BooleanCallback
    public void run(boolean z10) {
        bo boVar = ((nj) this.c).b;
        int i10 = this.b;
        if (i10 == 15 && ChatObject.isChannel(boVar.e)) {
            TLRPC.Chat chat = boVar.e;
            if (!chat.megagroup || ChatObject.isPublic(chat)) {
                boVar.getMessagesController().deleteDialog(boVar.T5, 2, z10);
                return;
            }
        }
        if (i10 == 15) {
            boVar.qa(boVar.d4, z10);
            return;
        }
        NotificationCenter notificationCenter = boVar.getNotificationCenter();
        int i11 = NotificationCenter.closeChats;
        notificationCenter.removeObserver(boVar, i11);
        boVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i11, new Object[0]);
        boVar.finishFragment();
        boVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needDeleteDialog, Long.valueOf(boVar.T5), boVar.f, boVar.e, Boolean.valueOf(z10));
    }

    public /* synthetic */ s(Object obj, int i10, int i11) {
        this.a = i11;
        this.c = obj;
        this.b = i10;
    }

    public /* synthetic */ s(nj njVar, int i10, boolean z10) {
        this.a = 3;
        this.c = njVar;
        this.b = i10;
    }

    @Override // org.telegram.ui.Components.cl0
    public /* synthetic */ void g() {
    }

    @Override // org.telegram.ui.Components.cl0
    public /* synthetic */ void q(float f7) {
    }

    private final /* synthetic */ void a(View view, float f7, float f10) {
    }

    private final /* synthetic */ void h(View view, float f7, float f10) {
    }
}
