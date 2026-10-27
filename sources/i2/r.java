package i2;

import a8.yb;
import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.SystemClock;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import androidx.recyclerview.widget.RecyclerView;
import bi.sc;
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
import org.telegram.messenger.p5;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.ActionBar.e2;
import org.telegram.ui.ActionBar.r2;
import org.telegram.ui.Components.ap;
import org.telegram.ui.Components.bm0;
import org.telegram.ui.Components.c8;
import org.telegram.ui.Components.cm0;
import org.telegram.ui.Components.d8;
import org.telegram.ui.Components.dm0;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.e5;
import org.telegram.ui.Components.el0;
import org.telegram.ui.Components.fl0;
import org.telegram.ui.Components.gl0;
import org.telegram.ui.Components.h8;
import org.telegram.ui.Components.jd0;
import org.telegram.ui.Components.m8;
import org.telegram.ui.Components.n6;
import org.telegram.ui.Components.wo;
import org.telegram.ui.Components.xl0;
import org.telegram.ui.ContactsActivity;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PrivacyControlActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.ej0;
import org.telegram.ui.hg0;
import org.telegram.ui.ig0;
import org.telegram.ui.jj;
import org.telegram.ui.kn0;
import org.telegram.ui.mc0;
import org.telegram.ui.sm0;
import org.telegram.ui.wb0;
import org.telegram.ui.wn;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final /* synthetic */ class r implements e2.o, e2.j, MessagesStorage.BooleanCallback, jd0, ImageReceiver.ImageReceiverDelegate, e5, cm0, bm0, b2, mc0, xl0, dm0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ r(int i10, Object obj, int i11) {
        this.a = i11;
        this.b = i10;
        this.c = obj;
    }

    @Override // org.telegram.ui.Components.e5
    public void G(int i10, int i11, boolean z10) {
        switch (this.a) {
            case 7:
                AndroidUtilities.runOnUIThread(new v(i10, this.b, (ap) this.c, 8), 16L);
                break;
            default:
                AndroidUtilities.runOnUIThread(new v(i10, this.b, (wo) this.c, 9), 16L);
                break;
        }
    }

    @Override // e2.j
    public void accept(Object obj) {
        m4.p pVar;
        m4.p pVar2;
        m4.w wVar = (m4.w) this.c;
        int i10 = this.b;
        try {
            try {
                pVar2 = (m4.p) ((k9.y) obj).get();
                yb.l(pVar2, "LibraryResult must not be null");
            } catch (InterruptedException e) {
                e = e;
                e2.a.m("MediaSessionStub", "Library operation failed", e);
                String str = m4.p.d;
                m4.r1 r1Var = new m4.r1("no error message provided", -1, Bundle.EMPTY);
                pVar = new m4.p(r1Var.a, SystemClock.elapsedRealtime(), r1Var);
                pVar2 = pVar;
                m4.v vVar = wVar.d;
                vVar.getClass();
                vVar.a(i10, pVar2);
            } catch (CancellationException e10) {
                e2.a.m("MediaSessionStub", "Library operation cancelled", e10);
                String str2 = m4.p.d;
                m4.r1 r1Var2 = new m4.r1("no error message provided", 1, Bundle.EMPTY);
                pVar = new m4.p(r1Var2.a, SystemClock.elapsedRealtime(), r1Var2);
                pVar2 = pVar;
                m4.v vVar2 = wVar.d;
                vVar2.getClass();
                vVar2.a(i10, pVar2);
            } catch (ExecutionException e11) {
                e = e11;
                e2.a.m("MediaSessionStub", "Library operation failed", e);
                String str3 = m4.p.d;
                m4.r1 r1Var3 = new m4.r1("no error message provided", -1, Bundle.EMPTY);
                pVar = new m4.p(r1Var3.a, SystemClock.elapsedRealtime(), r1Var3);
                pVar2 = pVar;
                m4.v vVar22 = wVar.d;
                vVar22.getClass();
                vVar22.a(i10, pVar2);
            }
            m4.v vVar222 = wVar.d;
            vVar222.getClass();
            vVar222.a(i10, pVar2);
        } catch (RemoteException e12) {
            e2.a.m("MediaSessionStub", "Failed to send result to browser " + wVar, e12);
        }
    }

    @Override // org.telegram.ui.Components.cm0
    public boolean c(int i10, View view) {
        gl0 gl0Var = (gl0) this.c;
        if (this.b == 5) {
            gl0Var.getClass();
            return false;
        }
        fl0 fl0Var = gl0Var.g0;
        if (fl0Var == null || !(view instanceof el0)) {
            return false;
        }
        fl0Var.p(gl0Var, ((el0) view).e, true, false);
        return true;
    }

    @Override // org.telegram.ui.Components.bm0
    public /* synthetic */ boolean c1(View view) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.mc0
    public void d(TLRPC.MessageMedia messageMedia, int i10, boolean z10, int i11, long j10) {
        HashMap hashMap = (HashMap) this.c;
        Pattern pattern = LaunchActivity.D1;
        Iterator it = hashMap.entrySet().iterator();
        while (it.hasNext()) {
            MessageObject messageObject = (MessageObject) ((Map.Entry) it.next()).getValue();
            SendMessagesHelper.getInstance(this.b).sendMessage(SendMessagesHelper.SendMessageParams.of(messageMedia, messageObject.getDialogId(), messageObject, (MessageObject) null, (TLRPC.ReplyMarkup) null, (HashMap<String, String>) null, true, 0, 0));
        }
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        h8 h8Var = (h8) this.c;
        if (this.b == h8Var.b) {
            m8 m8Var = ((c8) h8Var).e;
            Bitmap bitmap = imageReceiver.getBitmap();
            int dp = ((bitmap == null || !imageReceiver.hasImageLoaded()) && !imageReceiver.hasBitmapImage()) ? 0 : AndroidUtilities.dp(64.0f);
            d8 d8Var = m8Var.I;
            ValueAnimator valueAnimator = m8Var.S0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                m8Var.S0 = null;
            }
            if (d8Var.getCustomPaddingRight() != dp) {
                ValueAnimator ofInt = ValueAnimator.ofInt(d8Var.getCustomPaddingRight(), dp);
                m8Var.S0 = ofInt;
                if (dp == 0) {
                    ofInt.setStartDelay(200L);
                    m8Var.S0.setDuration(100L);
                } else {
                    ofInt.setDuration(200L);
                }
                m8Var.S0.setInterpolator(new DecelerateInterpolator());
                m8Var.S0.addUpdateListener(new n6(m8Var, 2));
                m8Var.S0.start();
            }
            if (m8Var.h0.getTag() != null) {
                m8Var.i0.setImageBitmap(bitmap);
            }
        }
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public /* synthetic */ void didSetImageBitmap(int i10, String str, Drawable drawable) {
        p5.a(this, i10, str, drawable);
    }

    @Override // org.telegram.ui.Components.bm0
    public void e(float f7, float f10, int i10, View view) {
        switch (this.a) {
            case 10:
                ContactsActivity.Y((ContactsActivity) this.c, this.b, view, i10);
                break;
            default:
                ej0.P((ej0) this.c, this.b, view);
                break;
        }
    }

    @Override // org.telegram.ui.Components.jd0
    public String f(int i10) {
        Calendar calendar = (Calendar) this.c;
        calendar.clear();
        int i11 = this.b;
        calendar.set(1, i11);
        calendar.set(2, 0);
        calendar.add(2, i10 - 120);
        return calendar.get(1) == i11 ? LocaleController.getInstance().getFormatterMonthOnly().format(calendar.getTimeInMillis()) : LocaleController.getInstance().getFormatterMonthYear().format(calendar.getTimeInMillis());
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void h(e2 e2Var, int i10) {
        int i11 = this.a;
        int i12 = this.b;
        Object obj = this.c;
        switch (i11) {
            case 11:
                ArrayList arrayList = ((LaunchActivity) obj).d0;
                if (!arrayList.isEmpty()) {
                    MessagesController.getInstance(i12).openByUserName("spambot", (r2) ic.a.g(1, arrayList), 1);
                    break;
                }
                break;
            case 12:
            case 13:
            case 15:
            default:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                int i13 = ProfileActivity.R6;
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
                profileActivity.v5();
                profileActivity.d.u(i12);
                break;
            case 14:
                ig0 ig0Var = ((hg0) obj).a0;
                if (UserConfig.selectedAccount != i12) {
                    ((LaunchActivity) ig0Var.getParentActivity()).P0(i12);
                }
                ig0Var.finishFragment();
                break;
            case 16:
                kn0 kn0Var = ((sm0) obj).a;
                kn0Var.z1(kn0Var.Y[i12]);
                break;
            case 17:
                PrivacyControlActivity privacyControlActivity = (PrivacyControlActivity) obj;
                privacyControlActivity.getClass();
                privacyControlActivity.presentFragment(new PrivacyControlActivity(i12, false), true);
                break;
        }
    }

    @Override // e2.o
    public void invoke(Object obj) {
        switch (this.a) {
            case 0:
                ((b2.e1) obj).onTimelineChanged(((k1) this.c).a, this.b);
                break;
            case 1:
                ((b2.e1) obj).onMediaItemTransition((b2.p0) this.c, this.b);
                break;
            default:
                j2.a aVar = (j2.a) this.c;
                j2.b bVar = (j2.b) obj;
                bVar.getClass();
                bVar.g(aVar, this.b);
                break;
        }
    }

    @Override // org.telegram.ui.Components.bm0
    public /* synthetic */ void l0(View view, float f7, float f10) {
        int i10 = this.a;
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public /* synthetic */ void onAnimationReady(ImageReceiver imageReceiver) {
        p5.b(this, imageReceiver);
    }

    @Override // org.telegram.ui.Components.xl0
    public int run() {
        s4.c0 c0Var = ((wb0) this.c).c;
        int dp = AndroidUtilities.dp(60.0f);
        int i10 = this.b;
        c0Var.h1(i10, dp);
        return i10;
    }

    public /* synthetic */ r(j2.a aVar, int i10, b2.f1 f1Var, b2.f1 f1Var2) {
        this.a = 2;
        this.c = aVar;
        this.b = i10;
    }

    @Override // org.telegram.ui.Components.dm0
    public boolean e(float f7, float f10, int i10, View view) {
        vg.n1 n1Var = (vg.n1) this.c;
        sc scVar = n1Var.d0;
        HashSet hashSet = n1Var.h0;
        if (!(view instanceof zg.l)) {
            return false;
        }
        zg.l lVar = (zg.l) view;
        TLRPC.User user = lVar.getUser();
        long j10 = user != null ? user.id : -lVar.getChat().id;
        int i11 = this.b;
        boolean z10 = (i11 == 4 && hashSet.isEmpty()) ? false : true;
        if (hashSet.contains(Long.valueOf(j10))) {
            hashSet.remove(Long.valueOf(j10));
        } else {
            hashSet.add(Long.valueOf(j10));
            n1Var.n0.put(Long.valueOf(j10), user);
        }
        if (hashSet.size() == n1Var.Z() + 1) {
            hashSet.remove(Long.valueOf(j10));
            n1Var.f0();
            return true;
        }
        boolean z11 = (i11 == 4 && hashSet.isEmpty()) ? false : true;
        if (z10 != z11) {
            scVar.setVisibility(0);
            scVar.animate().alpha(z11 ? 1.0f : 0.0f).translationY(z11 ? 0.0f : AndroidUtilities.dp(12.0f)).setInterpolator(ds.h).setDuration(320L).withEndAction(!z11 ? new vg.a1(n1Var, 7) : null).start();
            wg.h hVar = n1Var.p0;
            boolean z12 = !z11;
            if (hVar.y != z12) {
                hVar.y = z12;
                AndroidUtilities.forEachViews((RecyclerView) hVar.f, (Utilities.Callback<View>) new wg.f(z12));
            }
        }
        n1Var.W();
        n1Var.Z.b(true, hashSet, new vg.a1(n1Var, 8), null);
        n1Var.i0(true, true);
        n1Var.X();
        return true;
    }

    @Override // org.telegram.messenger.MessagesStorage.BooleanCallback
    public void run(boolean z10) {
        wn wnVar = ((jj) this.c).b;
        int i10 = this.b;
        if (i10 == 15 && ChatObject.isChannel(wnVar.e)) {
            TLRPC.Chat chat = wnVar.e;
            if (!chat.megagroup || ChatObject.isPublic(chat)) {
                wnVar.getMessagesController().deleteDialog(wnVar.j6, 2, z10);
                return;
            }
        }
        if (i10 == 15) {
            wnVar.Da(wnVar.p4, z10);
            return;
        }
        NotificationCenter notificationCenter = wnVar.getNotificationCenter();
        int i11 = NotificationCenter.closeChats;
        notificationCenter.removeObserver(wnVar, i11);
        wnVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i11, new Object[0]);
        wnVar.finishFragment();
        wnVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needDeleteDialog, Long.valueOf(wnVar.j6), wnVar.f, wnVar.e, Boolean.valueOf(z10));
    }

    public /* synthetic */ r(Object obj, int i10, int i11) {
        this.a = i11;
        this.c = obj;
        this.b = i10;
    }

    public /* synthetic */ r(jj jjVar, int i10, boolean z10) {
        this.a = 4;
        this.c = jjVar;
        this.b = i10;
    }

    @Override // org.telegram.ui.Components.dm0
    public /* synthetic */ void g() {
    }

    @Override // org.telegram.ui.Components.dm0
    public /* synthetic */ void o(float f7) {
    }

    private final /* synthetic */ void a(View view, float f7, float f10) {
    }

    private final /* synthetic */ void b(View view, float f7, float f10) {
    }
}
