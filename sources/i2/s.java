package i2;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.SystemClock;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
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
import org.telegram.messenger.Utilities;
import org.telegram.messenger.h5;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.a2;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.a8;
import org.telegram.ui.Components.cd0;
import org.telegram.ui.Components.d5;
import org.telegram.ui.Components.e8;
import org.telegram.ui.Components.j8;
import org.telegram.ui.Components.jl0;
import org.telegram.ui.Components.k6;
import org.telegram.ui.Components.nl0;
import org.telegram.ui.Components.no;
import org.telegram.ui.Components.ol0;
import org.telegram.ui.Components.pl0;
import org.telegram.ui.Components.qk0;
import org.telegram.ui.Components.rk0;
import org.telegram.ui.Components.ro;
import org.telegram.ui.Components.sk0;
import org.telegram.ui.Components.tr;
import org.telegram.ui.Components.z7;
import org.telegram.ui.ContactsActivity;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PrivacyControlActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.bd0;
import org.telegram.ui.kn0;
import org.telegram.ui.lc0;
import org.telegram.ui.lj;
import org.telegram.ui.o20;
import org.telegram.ui.oj0;
import org.telegram.ui.sm0;
import org.telegram.ui.tg0;
import org.telegram.ui.ug0;
import org.telegram.ui.yn;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes.dex */
public final /* synthetic */ class s implements e2.m, e2.h, MessagesStorage.BooleanCallback, cd0, ImageReceiver.ImageReceiverDelegate, d5, ol0, nl0, a2, bd0, jl0, pl0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ s(int i10, Object obj, int i11) {
        this.a = i11;
        this.b = i10;
        this.c = obj;
    }

    @Override // org.telegram.ui.Components.d5
    public void K(int i10, int i11, boolean z10) {
        switch (this.a) {
            case 7:
                AndroidUtilities.runOnUIThread(new gg.n(i10, this.b, (ro) this.c, 8), 16L);
                break;
            default:
                AndroidUtilities.runOnUIThread(new gg.n(i10, this.b, (no) this.c, 9), 16L);
                break;
        }
    }

    @Override // e2.h
    public void accept(Object obj) {
        m4.l lVar;
        m4.l lVar2;
        m4.r rVar = (m4.r) this.c;
        int i10 = this.b;
        try {
            try {
                lVar2 = (m4.l) ((i9.w) obj).get();
                e2.d.e(lVar2, "LibraryResult must not be null");
            } catch (InterruptedException e7) {
                e = e7;
                e2.a.o("MediaSessionStub", "Library operation failed", e);
                String str = m4.l.d;
                m4.i1 i1Var = new m4.i1("no error message provided", -1, Bundle.EMPTY);
                lVar = new m4.l(i1Var.a, SystemClock.elapsedRealtime(), i1Var);
                lVar2 = lVar;
                m4.q qVar = rVar.d;
                e2.d.h(qVar);
                qVar.a(i10, lVar2);
            } catch (CancellationException e10) {
                e2.a.o("MediaSessionStub", "Library operation cancelled", e10);
                String str2 = m4.l.d;
                m4.i1 i1Var2 = new m4.i1("no error message provided", 1, Bundle.EMPTY);
                lVar = new m4.l(i1Var2.a, SystemClock.elapsedRealtime(), i1Var2);
                lVar2 = lVar;
                m4.q qVar2 = rVar.d;
                e2.d.h(qVar2);
                qVar2.a(i10, lVar2);
            } catch (ExecutionException e11) {
                e = e11;
                e2.a.o("MediaSessionStub", "Library operation failed", e);
                String str3 = m4.l.d;
                m4.i1 i1Var3 = new m4.i1("no error message provided", -1, Bundle.EMPTY);
                lVar = new m4.l(i1Var3.a, SystemClock.elapsedRealtime(), i1Var3);
                lVar2 = lVar;
                m4.q qVar22 = rVar.d;
                e2.d.h(qVar22);
                qVar22.a(i10, lVar2);
            }
            m4.q qVar222 = rVar.d;
            e2.d.h(qVar222);
            qVar222.a(i10, lVar2);
        } catch (RemoteException e12) {
            e2.a.o("MediaSessionStub", "Failed to send result to browser " + rVar, e12);
        }
    }

    @Override // org.telegram.ui.bd0
    public void b(TLRPC.MessageMedia messageMedia, int i10, boolean z10, int i11, long j3) {
        HashMap hashMap = (HashMap) this.c;
        Pattern pattern = LaunchActivity.B1;
        Iterator it = hashMap.entrySet().iterator();
        while (it.hasNext()) {
            MessageObject messageObject = (MessageObject) ((Map.Entry) it.next()).getValue();
            SendMessagesHelper.getInstance(this.b).sendMessage(SendMessagesHelper.SendMessageParams.of(messageMedia, messageObject.getDialogId(), messageObject, (MessageObject) null, (TLRPC.ReplyMarkup) null, (HashMap<String, String>) null, true, 0, 0));
        }
    }

    @Override // org.telegram.ui.Components.nl0
    public void c(float f7, float f10, int i10, View view) {
        switch (this.a) {
            case 10:
                ContactsActivity.S((ContactsActivity) this.c, this.b, view, i10);
                break;
            default:
                oj0.N((oj0) this.c, this.b, view);
                break;
        }
    }

    @Override // org.telegram.ui.Components.ol0
    public boolean d(int i10, View view) {
        sk0 sk0Var = (sk0) this.c;
        if (this.b == 5) {
            sk0Var.getClass();
            return false;
        }
        rk0 rk0Var = sk0Var.g0;
        if (rk0Var == null || !(view instanceof qk0)) {
            return false;
        }
        rk0Var.i(sk0Var, ((qk0) view).e, true, false);
        return true;
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
                j8Var.S0.addUpdateListener(new k6(j8Var, 2));
                j8Var.S0.start();
            }
            if (j8Var.i0.getTag() != null) {
                j8Var.j0.setImageBitmap(bitmap);
            }
        }
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public /* synthetic */ void didSetImageBitmap(int i10, String str, Drawable drawable) {
        h5.a(this, i10, str, drawable);
    }

    @Override // org.telegram.ui.Components.cd0
    public String e(int i10) {
        Calendar calendar = (Calendar) this.c;
        calendar.clear();
        int i11 = this.b;
        calendar.set(1, i11);
        calendar.set(2, 0);
        calendar.add(2, i10 - 120);
        return calendar.get(1) == i11 ? LocaleController.getInstance().getFormatterMonthOnly().format(calendar.getTimeInMillis()) : LocaleController.getInstance().getFormatterMonthYear().format(calendar.getTimeInMillis());
    }

    @Override // org.telegram.ui.Components.nl0
    public /* synthetic */ boolean f1(View view) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void g(b2 b2Var, int i10) {
        switch (this.a) {
            case 11:
                ArrayList arrayList = ((LaunchActivity) this.c).d0;
                if (!arrayList.isEmpty()) {
                    MessagesController.getInstance(this.b).openByUserName("spambot", (n2) hg.c.g(1, arrayList), 1);
                    break;
                }
                break;
            case 12:
            case 13:
            case 15:
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
            case 14:
                ug0 ug0Var = ((tg0) this.c).V;
                int i11 = UserConfig.selectedAccount;
                int i12 = this.b;
                if (i11 != i12) {
                    ((LaunchActivity) ug0Var.getParentActivity()).K0(i12);
                }
                ug0Var.finishFragment();
                break;
            case 16:
                kn0 kn0Var = ((sm0) this.c).a;
                kn0Var.z1(kn0Var.Y[this.b]);
                break;
            case 17:
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
                ((b2.z0) obj).onTimelineChanged(((h1) this.c).a, this.b);
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

    @Override // org.telegram.ui.Components.jl0
    public int run() {
        s4.c0 c0Var = ((lc0) this.c).c;
        int dp = AndroidUtilities.dp(60.0f);
        int i10 = this.b;
        c0Var.h1(i10, dp);
        return i10;
    }

    @Override // org.telegram.ui.Components.nl0
    public /* synthetic */ void s0(View view, float f7, float f10) {
        int i10 = this.a;
    }

    public /* synthetic */ s(j2.a aVar, int i10, b2.a1 a1Var, b2.a1 a1Var2) {
        this.a = 2;
        this.c = aVar;
        this.b = i10;
    }

    @Override // org.telegram.ui.Components.pl0
    public boolean c(float f7, float f10, int i10, View view) {
        tg.m1 m1Var = (tg.m1) this.c;
        o20 o20Var = m1Var.d0;
        HashSet hashSet = m1Var.h0;
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
            m1Var.n0.put(Long.valueOf(j3), user);
        }
        if (hashSet.size() == m1Var.Y() + 1) {
            hashSet.remove(Long.valueOf(j3));
            m1Var.f0();
            return true;
        }
        boolean z11 = (i11 == 4 && hashSet.isEmpty()) ? false : true;
        if (z10 != z11) {
            o20Var.setVisibility(0);
            o20Var.animate().alpha(z11 ? 1.0f : 0.0f).translationY(z11 ? 0.0f : AndroidUtilities.dp(12.0f)).setInterpolator(tr.h).setDuration(320L).withEndAction(!z11 ? new tg.a1(m1Var, 7) : null).start();
            ug.h hVar = m1Var.p0;
            boolean z12 = !z11;
            if (hVar.y != z12) {
                hVar.y = z12;
                AndroidUtilities.forEachViews((RecyclerView) hVar.f, (Utilities.Callback<View>) new ug.f(z12));
            }
        }
        m1Var.U();
        m1Var.Z.b(true, hashSet, new tg.a1(m1Var, 8), null);
        m1Var.i0(true, true);
        m1Var.W();
        return true;
    }

    @Override // org.telegram.messenger.MessagesStorage.BooleanCallback
    public void run(boolean z10) {
        yn ynVar = ((lj) this.c).b;
        int i10 = this.b;
        if (i10 == 15 && ChatObject.isChannel(ynVar.e)) {
            TLRPC.Chat chat = ynVar.e;
            if (!chat.megagroup || ChatObject.isPublic(chat)) {
                ynVar.getMessagesController().deleteDialog(ynVar.R5, 2, z10);
                return;
            }
        }
        if (i10 == 15) {
            ynVar.pa(ynVar.b4, z10);
            return;
        }
        NotificationCenter notificationCenter = ynVar.getNotificationCenter();
        int i11 = NotificationCenter.closeChats;
        notificationCenter.removeObserver(ynVar, i11);
        ynVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i11, new Object[0]);
        ynVar.finishFragment();
        ynVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needDeleteDialog, Long.valueOf(ynVar.R5), ynVar.f, ynVar.e, Boolean.valueOf(z10));
    }

    public /* synthetic */ s(Object obj, int i10, int i11) {
        this.a = i11;
        this.c = obj;
        this.b = i10;
    }

    public /* synthetic */ s(lj ljVar, int i10, boolean z10) {
        this.a = 4;
        this.c = ljVar;
        this.b = i10;
    }

    @Override // org.telegram.ui.Components.pl0
    public /* synthetic */ void i() {
    }

    @Override // org.telegram.ui.Components.pl0
    public /* synthetic */ void q(float f7) {
    }

    private final /* synthetic */ void a(View view, float f7, float f10) {
    }

    private final /* synthetic */ void f(View view, float f7, float f10) {
    }
}
