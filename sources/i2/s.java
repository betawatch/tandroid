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
import org.telegram.messenger.m5;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.c2;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Components.a8;
import org.telegram.ui.Components.c5;
import org.telegram.ui.Components.e8;
import org.telegram.ui.Components.gl0;
import org.telegram.ui.Components.j6;
import org.telegram.ui.Components.j8;
import org.telegram.ui.Components.kl0;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.ml0;
import org.telegram.ui.Components.nk0;
import org.telegram.ui.Components.ok0;
import org.telegram.ui.Components.pk0;
import org.telegram.ui.Components.po;
import org.telegram.ui.Components.to;
import org.telegram.ui.Components.wr;
import org.telegram.ui.Components.z7;
import org.telegram.ui.Components.zc0;
import org.telegram.ui.ContactsActivity;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PrivacyControlActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.dd0;
import org.telegram.ui.eo;
import org.telegram.ui.nc0;
import org.telegram.ui.on0;
import org.telegram.ui.p20;
import org.telegram.ui.pj;
import org.telegram.ui.sj0;
import org.telegram.ui.wg0;
import org.telegram.ui.wm0;
import org.telegram.ui.xg0;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final /* synthetic */ class s implements e2.m, MessagesStorage.BooleanCallback, zc0, ImageReceiver.ImageReceiverDelegate, c5, ll0, kl0, c2, dd0, gl0, ml0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ s(int i10, Object obj, int i11) {
        this.a = i11;
        this.b = i10;
        this.c = obj;
    }

    @Override // org.telegram.ui.Components.c5
    public void I(int i10, int i11, boolean z10) {
        switch (this.a) {
            case 6:
                AndroidUtilities.runOnUIThread(new fg.n(i10, this.b, (to) this.c, 8), 16L);
                break;
            default:
                AndroidUtilities.runOnUIThread(new fg.n(i10, this.b, (po) this.c, 9), 16L);
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

    @Override // org.telegram.ui.Components.kl0
    public void c(float f7, float f10, int i10, View view) {
        switch (this.a) {
            case 9:
                ContactsActivity.U((ContactsActivity) this.c, this.b, view, i10);
                break;
            default:
                sj0.P((sj0) this.c, this.b, view);
                break;
        }
    }

    @Override // org.telegram.ui.Components.ll0
    public boolean d(int i10, View view) {
        pk0 pk0Var = (pk0) this.c;
        if (this.b == 5) {
            pk0Var.getClass();
            return false;
        }
        ok0 ok0Var = pk0Var.g0;
        if (ok0Var == null || !(view instanceof nk0)) {
            return false;
        }
        ok0Var.l(pk0Var, ((nk0) view).e, true, false);
        return true;
    }

    @Override // org.telegram.ui.Components.kl0
    public /* synthetic */ boolean d1(View view) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        e8 e8Var = (e8) this.c;
        if (this.b == e8Var.b) {
            j8 j8Var = ((z7) e8Var).e;
            Bitmap bitmap = imageReceiver.getBitmap();
            int dp = ((bitmap == null || !imageReceiver.hasImageLoaded()) && !imageReceiver.hasBitmapImage()) ? 0 : AndroidUtilities.dp(64.0f);
            a8 a8Var = j8Var.J;
            ValueAnimator valueAnimator = j8Var.S0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                j8Var.S0 = null;
            }
            if (a8Var.getCustomPaddingRight() != dp) {
                ValueAnimator ofInt = ValueAnimator.ofInt(a8Var.getCustomPaddingRight(), dp);
                j8Var.S0 = ofInt;
                if (dp == 0) {
                    ofInt.setStartDelay(200L);
                    j8Var.S0.setDuration(100L);
                } else {
                    ofInt.setDuration(200L);
                }
                j8Var.S0.setInterpolator(new DecelerateInterpolator());
                j8Var.S0.addUpdateListener(new j6(j8Var, 2));
                j8Var.S0.start();
            }
            if (j8Var.i0.getTag() != null) {
                j8Var.j0.setImageBitmap(bitmap);
            }
        }
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public /* synthetic */ void didSetImageBitmap(int i10, String str, Drawable drawable) {
        m5.a(this, i10, str, drawable);
    }

    @Override // org.telegram.ui.ActionBar.c2
    public void f(d2 d2Var, int i10) {
        switch (this.a) {
            case 10:
                ArrayList arrayList = ((LaunchActivity) this.c).d0;
                if (!arrayList.isEmpty()) {
                    MessagesController.getInstance(this.b).openByUserName("spambot", (p2) hc.b.i(1, arrayList), 1);
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
                xg0 xg0Var = ((wg0) this.c).V;
                int i11 = UserConfig.selectedAccount;
                int i12 = this.b;
                if (i11 != i12) {
                    ((LaunchActivity) xg0Var.getParentActivity()).K0(i12);
                }
                xg0Var.finishFragment();
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
                ((b2.z0) obj).onTimelineChanged(((f1) this.c).a, this.b);
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

    @Override // org.telegram.ui.Components.zc0
    public String k(int i10) {
        Calendar calendar = (Calendar) this.c;
        calendar.clear();
        int i11 = this.b;
        calendar.set(1, i11);
        calendar.set(2, 0);
        calendar.add(2, i10 - 120);
        return calendar.get(1) == i11 ? LocaleController.getInstance().getFormatterMonthOnly().format(calendar.getTimeInMillis()) : LocaleController.getInstance().getFormatterMonthYear().format(calendar.getTimeInMillis());
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public /* synthetic */ void onAnimationReady(ImageReceiver imageReceiver) {
        m5.b(this, imageReceiver);
    }

    @Override // org.telegram.ui.Components.kl0
    public /* synthetic */ void p0(View view, float f7, float f10) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Components.gl0
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

    @Override // org.telegram.ui.Components.ml0
    public boolean c(float f7, float f10, int i10, View view) {
        sg.p1 p1Var = (sg.p1) this.c;
        p20 p20Var = p1Var.d0;
        HashSet hashSet = p1Var.h0;
        if (!(view instanceof wg.k)) {
            return false;
        }
        wg.k kVar = (wg.k) view;
        TLRPC.User user = kVar.getUser();
        long j3 = user != null ? user.id : -kVar.getChat().id;
        int i11 = this.b;
        boolean z10 = (i11 == 4 && hashSet.isEmpty()) ? false : true;
        if (hashSet.contains(Long.valueOf(j3))) {
            hashSet.remove(Long.valueOf(j3));
        } else {
            hashSet.add(Long.valueOf(j3));
            p1Var.n0.put(Long.valueOf(j3), user);
        }
        if (hashSet.size() == p1Var.Z() + 1) {
            hashSet.remove(Long.valueOf(j3));
            p1Var.f0();
            return true;
        }
        boolean z11 = (i11 == 4 && hashSet.isEmpty()) ? false : true;
        if (z10 != z11) {
            p20Var.setVisibility(0);
            p20Var.animate().alpha(z11 ? 1.0f : 0.0f).translationY(z11 ? 0.0f : AndroidUtilities.dp(12.0f)).setInterpolator(wr.h).setDuration(320L).withEndAction(!z11 ? new sg.d1(p1Var, 7) : null).start();
            tg.g gVar = p1Var.p0;
            boolean z12 = !z11;
            if (gVar.y != z12) {
                gVar.y = z12;
                AndroidUtilities.forEachViews((RecyclerView) gVar.f, (e2.h) new m4.o0(3, z12));
            }
        }
        p1Var.W();
        p1Var.Z.b(true, hashSet, new sg.d1(p1Var, 8), null);
        p1Var.i0(true, true);
        p1Var.X();
        return true;
    }

    @Override // org.telegram.messenger.MessagesStorage.BooleanCallback
    public void run(boolean z10) {
        eo eoVar = ((pj) this.c).b;
        int i10 = this.b;
        if (i10 == 15 && ChatObject.isChannel(eoVar.e)) {
            TLRPC.Chat chat = eoVar.e;
            if (!chat.megagroup || ChatObject.isPublic(chat)) {
                eoVar.getMessagesController().deleteDialog(eoVar.T5, 2, z10);
                return;
            }
        }
        if (i10 == 15) {
            eoVar.qa(eoVar.d4, z10);
            return;
        }
        NotificationCenter notificationCenter = eoVar.getNotificationCenter();
        int i11 = NotificationCenter.closeChats;
        notificationCenter.removeObserver(eoVar, i11);
        eoVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i11, new Object[0]);
        eoVar.finishFragment();
        eoVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needDeleteDialog, Long.valueOf(eoVar.T5), eoVar.f, eoVar.e, Boolean.valueOf(z10));
    }

    public /* synthetic */ s(Object obj, int i10, int i11) {
        this.a = i11;
        this.c = obj;
        this.b = i10;
    }

    public /* synthetic */ s(pj pjVar, int i10, boolean z10) {
        this.a = 3;
        this.c = pjVar;
        this.b = i10;
    }

    @Override // org.telegram.ui.Components.ml0
    public /* synthetic */ void h() {
    }

    @Override // org.telegram.ui.Components.ml0
    public /* synthetic */ void p(float f7) {
    }

    private final /* synthetic */ void a(View view, float f7, float f10) {
    }

    private final /* synthetic */ void e(View view, float f7, float f10) {
    }
}
