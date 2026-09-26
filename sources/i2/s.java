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
import org.telegram.ui.ActionBar.m2;
import org.telegram.ui.ActionBar.z1;
import org.telegram.ui.Components.a8;
import org.telegram.ui.Components.ad0;
import org.telegram.ui.Components.d5;
import org.telegram.ui.Components.e8;
import org.telegram.ui.Components.hl0;
import org.telegram.ui.Components.j8;
import org.telegram.ui.Components.k6;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.lo;
import org.telegram.ui.Components.ml0;
import org.telegram.ui.Components.nl0;
import org.telegram.ui.Components.ok0;
import org.telegram.ui.Components.pk0;
import org.telegram.ui.Components.po;
import org.telegram.ui.Components.qk0;
import org.telegram.ui.Components.rr;
import org.telegram.ui.Components.z7;
import org.telegram.ui.ContactsActivity;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PrivacyControlActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.gn0;
import org.telegram.ui.hc0;
import org.telegram.ui.j20;
import org.telegram.ui.kj;
import org.telegram.ui.kj0;
import org.telegram.ui.om0;
import org.telegram.ui.pg0;
import org.telegram.ui.qg0;
import org.telegram.ui.wn;
import org.telegram.ui.xc0;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes.dex */
public final /* synthetic */ class s implements e2.m, e2.h, MessagesStorage.BooleanCallback, ad0, ImageReceiver.ImageReceiverDelegate, d5, ml0, ll0, z1, xc0, hl0, nl0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ s(int i10, Object obj, int i11) {
        this.a = i11;
        this.b = i10;
        this.c = obj;
    }

    @Override // org.telegram.ui.Components.d5
    public void J(int i10, int i11, boolean z10) {
        switch (this.a) {
            case 7:
                AndroidUtilities.runOnUIThread(new gg.n(i10, this.b, (po) this.c, 8), 16L);
                break;
            default:
                AndroidUtilities.runOnUIThread(new gg.n(i10, this.b, (lo) this.c, 9), 16L);
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
            } catch (InterruptedException e) {
                e = e;
                e2.a.o("MediaSessionStub", "Library operation failed", e);
                String str = m4.l.d;
                m4.i1 i1Var = new m4.i1("no error message provided", -1, Bundle.EMPTY);
                lVar = new m4.l(i1Var.a, SystemClock.elapsedRealtime(), i1Var);
                lVar2 = lVar;
                m4.q qVar = rVar.d;
                e2.d.h(qVar);
                qVar.a(i10, lVar2);
            } catch (CancellationException e7) {
                e2.a.o("MediaSessionStub", "Library operation cancelled", e7);
                String str2 = m4.l.d;
                m4.i1 i1Var2 = new m4.i1("no error message provided", 1, Bundle.EMPTY);
                lVar = new m4.l(i1Var2.a, SystemClock.elapsedRealtime(), i1Var2);
                lVar2 = lVar;
                m4.q qVar2 = rVar.d;
                e2.d.h(qVar2);
                qVar2.a(i10, lVar2);
            } catch (ExecutionException e10) {
                e = e10;
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
        } catch (RemoteException e11) {
            e2.a.o("MediaSessionStub", "Failed to send result to browser " + rVar, e11);
        }
    }

    @Override // org.telegram.ui.xc0
    public void b(TLRPC.MessageMedia messageMedia, int i10, boolean z10, int i11, long j3) {
        HashMap hashMap = (HashMap) this.c;
        Pattern pattern = LaunchActivity.B1;
        Iterator it = hashMap.entrySet().iterator();
        while (it.hasNext()) {
            MessageObject messageObject = (MessageObject) ((Map.Entry) it.next()).getValue();
            SendMessagesHelper.getInstance(this.b).sendMessage(SendMessagesHelper.SendMessageParams.of(messageMedia, messageObject.getDialogId(), messageObject, (MessageObject) null, (TLRPC.ReplyMarkup) null, (HashMap<String, String>) null, true, 0, 0));
        }
    }

    @Override // org.telegram.ui.Components.ll0
    public void c(float f7, float f10, int i10, View view) {
        switch (this.a) {
            case 10:
                ContactsActivity.U((ContactsActivity) this.c, this.b, view, i10);
                break;
            default:
                kj0.P((kj0) this.c, this.b, view);
                break;
        }
    }

    @Override // org.telegram.ui.Components.ml0
    public boolean d(int i10, View view) {
        qk0 qk0Var = (qk0) this.c;
        if (this.b == 5) {
            qk0Var.getClass();
            return false;
        }
        pk0 pk0Var = qk0Var.g0;
        if (pk0Var == null || !(view instanceof ok0)) {
            return false;
        }
        pk0Var.h(qk0Var, ((ok0) view).e, true, false);
        return true;
    }

    @Override // org.telegram.ui.Components.ll0
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

    @Override // org.telegram.ui.ActionBar.z1
    public void f(a2 a2Var, int i10) {
        switch (this.a) {
            case 11:
                ArrayList arrayList = ((LaunchActivity) this.c).d0;
                if (!arrayList.isEmpty()) {
                    MessagesController.getInstance(this.b).openByUserName("spambot", (m2) hg.c.g(1, arrayList), 1);
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
                qg0 qg0Var = ((pg0) this.c).V;
                int i11 = UserConfig.selectedAccount;
                int i12 = this.b;
                if (i11 != i12) {
                    ((LaunchActivity) qg0Var.getParentActivity()).K0(i12);
                }
                qg0Var.finishFragment();
                break;
            case 16:
                gn0 gn0Var = ((om0) this.c).a;
                gn0Var.z1(gn0Var.Y[this.b]);
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

    @Override // org.telegram.ui.Components.ad0
    public String j(int i10) {
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
        h5.b(this, imageReceiver);
    }

    @Override // org.telegram.ui.Components.ll0
    public /* synthetic */ void r0(View view, float f7, float f10) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Components.hl0
    public int run() {
        s4.c0 c0Var = ((hc0) this.c).c;
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

    @Override // org.telegram.ui.Components.nl0
    public boolean c(float f7, float f10, int i10, View view) {
        tg.m1 m1Var = (tg.m1) this.c;
        j20 j20Var = m1Var.d0;
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
        if (hashSet.size() == m1Var.Z() + 1) {
            hashSet.remove(Long.valueOf(j3));
            m1Var.f0();
            return true;
        }
        boolean z11 = (i11 == 4 && hashSet.isEmpty()) ? false : true;
        if (z10 != z11) {
            j20Var.setVisibility(0);
            j20Var.animate().alpha(z11 ? 1.0f : 0.0f).translationY(z11 ? 0.0f : AndroidUtilities.dp(12.0f)).setInterpolator(rr.h).setDuration(320L).withEndAction(!z11 ? new tg.a1(m1Var, 7) : null).start();
            ug.h hVar = m1Var.p0;
            boolean z12 = !z11;
            if (hVar.y != z12) {
                hVar.y = z12;
                AndroidUtilities.forEachViews((RecyclerView) hVar.f, (Utilities.Callback<View>) new ug.f(z12));
            }
        }
        m1Var.W();
        m1Var.Z.b(true, hashSet, new tg.a1(m1Var, 8), null);
        m1Var.i0(true, true);
        m1Var.X();
        return true;
    }

    @Override // org.telegram.messenger.MessagesStorage.BooleanCallback
    public void run(boolean z10) {
        wn wnVar = ((kj) this.c).b;
        int i10 = this.b;
        if (i10 == 15 && ChatObject.isChannel(wnVar.e)) {
            TLRPC.Chat chat = wnVar.e;
            if (!chat.megagroup || ChatObject.isPublic(chat)) {
                wnVar.getMessagesController().deleteDialog(wnVar.T5, 2, z10);
                return;
            }
        }
        if (i10 == 15) {
            wnVar.qa(wnVar.d4, z10);
            return;
        }
        NotificationCenter notificationCenter = wnVar.getNotificationCenter();
        int i11 = NotificationCenter.closeChats;
        notificationCenter.removeObserver(wnVar, i11);
        wnVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i11, new Object[0]);
        wnVar.finishFragment();
        wnVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needDeleteDialog, Long.valueOf(wnVar.T5), wnVar.f, wnVar.e, Boolean.valueOf(z10));
    }

    public /* synthetic */ s(Object obj, int i10, int i11) {
        this.a = i11;
        this.c = obj;
        this.b = i10;
    }

    public /* synthetic */ s(kj kjVar, int i10, boolean z10) {
        this.a = 4;
        this.c = kjVar;
        this.b = i10;
    }

    @Override // org.telegram.ui.Components.nl0
    public /* synthetic */ void g() {
    }

    @Override // org.telegram.ui.Components.nl0
    public /* synthetic */ void q(float f7) {
    }

    private final /* synthetic */ void a(View view, float f7, float f10) {
    }

    private final /* synthetic */ void e(View view, float f7, float f10) {
    }
}
