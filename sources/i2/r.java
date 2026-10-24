package i2;

import ai.cd;
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
import org.telegram.messenger.m5;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.c2;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.ActionBar.z1;
import org.telegram.ui.Components.a8;
import org.telegram.ui.Components.b8;
import org.telegram.ui.Components.bm0;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.cm0;
import org.telegram.ui.Components.d5;
import org.telegram.ui.Components.dm0;
import org.telegram.ui.Components.el0;
import org.telegram.ui.Components.f8;
import org.telegram.ui.Components.fl0;
import org.telegram.ui.Components.gl0;
import org.telegram.ui.Components.k8;
import org.telegram.ui.Components.l6;
import org.telegram.ui.Components.md0;
import org.telegram.ui.Components.uo;
import org.telegram.ui.Components.xl0;
import org.telegram.ui.Components.yo;
import org.telegram.ui.ContactsActivity;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PrivacyControlActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.an0;
import org.telegram.ui.fj;
import org.telegram.ui.fj0;
import org.telegram.ui.hg0;
import org.telegram.ui.ig0;
import org.telegram.ui.im0;
import org.telegram.ui.nc0;
import org.telegram.ui.sn;
import org.telegram.ui.wb0;
import v7.u6;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes.dex */
public final /* synthetic */ class r implements e2.o, e2.j, MessagesStorage.BooleanCallback, md0, ImageReceiver.ImageReceiverDelegate, d5, cm0, bm0, z1, nc0, xl0, dm0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ r(int i10, Object obj, int i11) {
        this.a = i11;
        this.b = i10;
        this.c = obj;
    }

    @Override // org.telegram.ui.Components.d5
    public void C(int i10, int i11, boolean z10) {
        switch (this.a) {
            case 7:
                AndroidUtilities.runOnUIThread(new hg.n(i10, this.b, (yo) this.c, 8), 16L);
                break;
            default:
                AndroidUtilities.runOnUIThread(new hg.n(i10, this.b, (uo) this.c, 9), 16L);
                break;
        }
    }

    @Override // org.telegram.ui.Components.bm0
    public /* synthetic */ boolean P0(View view) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Components.bm0
    public /* synthetic */ void a0(View view, float f7, float f10) {
        int i10 = this.a;
    }

    @Override // e2.j
    public void accept(Object obj) {
        m4.o oVar;
        m4.o oVar2;
        m4.v vVar = (m4.v) this.c;
        int i10 = this.b;
        try {
            try {
                oVar2 = (m4.o) ((j9.y) obj).get();
                u6.l(oVar2, "LibraryResult must not be null");
            } catch (InterruptedException e) {
                e = e;
                e2.a.m("MediaSessionStub", "Library operation failed", e);
                String str = m4.o.d;
                m4.q1 q1Var = new m4.q1("no error message provided", -1, Bundle.EMPTY);
                oVar = new m4.o(q1Var.a, SystemClock.elapsedRealtime(), q1Var);
                oVar2 = oVar;
                m4.u uVar = vVar.d;
                uVar.getClass();
                uVar.a(i10, oVar2);
            } catch (CancellationException e7) {
                e2.a.m("MediaSessionStub", "Library operation cancelled", e7);
                String str2 = m4.o.d;
                m4.q1 q1Var2 = new m4.q1("no error message provided", 1, Bundle.EMPTY);
                oVar = new m4.o(q1Var2.a, SystemClock.elapsedRealtime(), q1Var2);
                oVar2 = oVar;
                m4.u uVar2 = vVar.d;
                uVar2.getClass();
                uVar2.a(i10, oVar2);
            } catch (ExecutionException e10) {
                e = e10;
                e2.a.m("MediaSessionStub", "Library operation failed", e);
                String str3 = m4.o.d;
                m4.q1 q1Var3 = new m4.q1("no error message provided", -1, Bundle.EMPTY);
                oVar = new m4.o(q1Var3.a, SystemClock.elapsedRealtime(), q1Var3);
                oVar2 = oVar;
                m4.u uVar22 = vVar.d;
                uVar22.getClass();
                uVar22.a(i10, oVar2);
            }
            m4.u uVar222 = vVar.d;
            uVar222.getClass();
            uVar222.a(i10, oVar2);
        } catch (RemoteException e11) {
            e2.a.m("MediaSessionStub", "Failed to send result to browser " + vVar, e11);
        }
    }

    @Override // org.telegram.ui.nc0
    public void b(TLRPC.MessageMedia messageMedia, int i10, boolean z10, int i11, long j10) {
        HashMap hashMap = (HashMap) this.c;
        Pattern pattern = LaunchActivity.E1;
        Iterator it = hashMap.entrySet().iterator();
        while (it.hasNext()) {
            MessageObject messageObject = (MessageObject) ((Map.Entry) it.next()).getValue();
            SendMessagesHelper.getInstance(this.b).sendMessage(SendMessagesHelper.SendMessageParams.of(messageMedia, messageObject.getDialogId(), messageObject, (MessageObject) null, (TLRPC.ReplyMarkup) null, (HashMap<String, String>) null, true, 0, 0));
        }
    }

    @Override // org.telegram.ui.Components.bm0
    public void c(float f7, float f10, int i10, View view) {
        switch (this.a) {
            case 10:
                ContactsActivity.U((ContactsActivity) this.c, this.b, view, i10);
                break;
            default:
                fj0.P((fj0) this.c, this.b, view);
                break;
        }
    }

    @Override // org.telegram.ui.Components.cm0
    public boolean d(int i10, View view) {
        gl0 gl0Var = (gl0) this.c;
        if (this.b == 5) {
            gl0Var.getClass();
            return false;
        }
        fl0 fl0Var = gl0Var.g0;
        if (fl0Var == null || !(view instanceof el0)) {
            return false;
        }
        fl0Var.m(gl0Var, ((el0) view).e, true, false);
        return true;
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        f8 f8Var = (f8) this.c;
        if (this.b == f8Var.b) {
            k8 k8Var = ((a8) f8Var).e;
            Bitmap bitmap = imageReceiver.getBitmap();
            int dp = ((bitmap == null || !imageReceiver.hasImageLoaded()) && !imageReceiver.hasBitmapImage()) ? 0 : AndroidUtilities.dp(64.0f);
            b8 b8Var = k8Var.I;
            ValueAnimator valueAnimator = k8Var.S0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                k8Var.S0 = null;
            }
            if (b8Var.getCustomPaddingRight() != dp) {
                ValueAnimator ofInt = ValueAnimator.ofInt(b8Var.getCustomPaddingRight(), dp);
                k8Var.S0 = ofInt;
                if (dp == 0) {
                    ofInt.setStartDelay(200L);
                    k8Var.S0.setDuration(100L);
                } else {
                    ofInt.setDuration(200L);
                }
                k8Var.S0.setInterpolator(new DecelerateInterpolator());
                k8Var.S0.addUpdateListener(new l6(k8Var, 2));
                k8Var.S0.start();
            }
            if (k8Var.h0.getTag() != null) {
                k8Var.i0.setImageBitmap(bitmap);
            }
        }
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public /* synthetic */ void didSetImageBitmap(int i10, String str, Drawable drawable) {
        m5.a(this, i10, str, drawable);
    }

    @Override // org.telegram.ui.Components.md0
    public String e(int i10) {
        Calendar calendar = (Calendar) this.c;
        calendar.clear();
        int i11 = this.b;
        calendar.set(1, i11);
        calendar.set(2, 0);
        calendar.add(2, i10 - 120);
        return calendar.get(1) == i11 ? LocaleController.getInstance().getFormatterMonthOnly().format(calendar.getTimeInMillis()) : LocaleController.getInstance().getFormatterMonthYear().format(calendar.getTimeInMillis());
    }

    @Override // org.telegram.ui.ActionBar.z1
    public void g(c2 c2Var, int i10) {
        switch (this.a) {
            case 11:
                ArrayList arrayList = ((LaunchActivity) this.c).d0;
                if (!arrayList.isEmpty()) {
                    MessagesController.getInstance(this.b).openByUserName("spambot", (o2) o1.i(1, arrayList), 1);
                    break;
                }
                break;
            case 12:
            case 13:
            case 15:
            default:
                ProfileActivity profileActivity = (ProfileActivity) this.c;
                TLRPC.UserFull userFull = profileActivity.getMessagesController().getUserFull(profileActivity.f1);
                if (userFull != null) {
                    userFull.flags2 &= -4194305;
                    userFull.note = null;
                    profileActivity.getMessagesStorage().updateUserInfo(userFull, true);
                }
                TLRPC.TL_updateContactNote tL_updateContactNote = new TLRPC.TL_updateContactNote();
                tL_updateContactNote.id = profileActivity.getMessagesController().getInputUser(profileActivity.f1);
                tL_updateContactNote.note = new TLRPC.TL_textWithEntities();
                profileActivity.getConnectionsManager().sendRequest(tL_updateContactNote, null);
                profileActivity.n5();
                profileActivity.d.u(this.b);
                break;
            case 14:
                ig0 ig0Var = ((hg0) this.c).a0;
                int i11 = UserConfig.selectedAccount;
                int i12 = this.b;
                if (i11 != i12) {
                    ((LaunchActivity) ig0Var.getParentActivity()).P0(i12);
                }
                ig0Var.finishFragment();
                break;
            case 16:
                an0 an0Var = ((im0) this.c).a;
                an0Var.y1(an0Var.Y[this.b]);
                break;
            case 17:
                PrivacyControlActivity privacyControlActivity = (PrivacyControlActivity) this.c;
                privacyControlActivity.getClass();
                privacyControlActivity.presentFragment(new PrivacyControlActivity(this.b, false), true);
                break;
        }
    }

    @Override // e2.o
    public void invoke(Object obj) {
        switch (this.a) {
            case 0:
                ((b2.d1) obj).onTimelineChanged(((i1) this.c).a, this.b);
                break;
            case 1:
                ((b2.d1) obj).onMediaItemTransition((b2.o0) this.c, this.b);
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
        m5.b(this, imageReceiver);
    }

    @Override // org.telegram.ui.Components.xl0
    public int run() {
        s4.b0 b0Var = ((wb0) this.c).c;
        int dp = AndroidUtilities.dp(60.0f);
        int i10 = this.b;
        b0Var.h1(i10, dp);
        return i10;
    }

    public /* synthetic */ r(j2.a aVar, int i10, b2.e1 e1Var, b2.e1 e1Var2) {
        this.a = 2;
        this.c = aVar;
        this.b = i10;
    }

    @Override // org.telegram.ui.Components.dm0
    public boolean c(float f7, float f10, int i10, View view) {
        ug.l1 l1Var = (ug.l1) this.c;
        cd cdVar = l1Var.d0;
        HashSet hashSet = l1Var.h0;
        if (!(view instanceof yg.k)) {
            return false;
        }
        yg.k kVar = (yg.k) view;
        TLRPC.User user = kVar.getUser();
        long j10 = user != null ? user.id : -kVar.getChat().id;
        int i11 = this.b;
        boolean z10 = (i11 == 4 && hashSet.isEmpty()) ? false : true;
        if (hashSet.contains(Long.valueOf(j10))) {
            hashSet.remove(Long.valueOf(j10));
        } else {
            hashSet.add(Long.valueOf(j10));
            l1Var.n0.put(Long.valueOf(j10), user);
        }
        if (hashSet.size() == l1Var.Z() + 1) {
            hashSet.remove(Long.valueOf(j10));
            l1Var.f0();
            return true;
        }
        boolean z11 = (i11 == 4 && hashSet.isEmpty()) ? false : true;
        if (z10 != z11) {
            cdVar.setVisibility(0);
            cdVar.animate().alpha(z11 ? 1.0f : 0.0f).translationY(z11 ? 0.0f : AndroidUtilities.dp(12.0f)).setInterpolator(bs.h).setDuration(320L).withEndAction(!z11 ? new ug.y0(l1Var, 7) : null).start();
            vg.h hVar = l1Var.p0;
            boolean z12 = !z11;
            if (hVar.y != z12) {
                hVar.y = z12;
                AndroidUtilities.forEachViews((RecyclerView) hVar.f, (Utilities.Callback<View>) new vg.f(z12));
            }
        }
        l1Var.W();
        l1Var.Z.b(true, hashSet, new ug.y0(l1Var, 8), null);
        l1Var.i0(true, true);
        l1Var.X();
        return true;
    }

    @Override // org.telegram.messenger.MessagesStorage.BooleanCallback
    public void run(boolean z10) {
        sn snVar = ((fj) this.c).b;
        int i10 = this.b;
        if (i10 == 15 && ChatObject.isChannel(snVar.e)) {
            TLRPC.Chat chat = snVar.e;
            if (!chat.megagroup || ChatObject.isPublic(chat)) {
                snVar.getMessagesController().deleteDialog(snVar.f6, 2, z10);
                return;
            }
        }
        if (i10 == 15) {
            snVar.va(snVar.p4, z10);
            return;
        }
        NotificationCenter notificationCenter = snVar.getNotificationCenter();
        int i11 = NotificationCenter.closeChats;
        notificationCenter.removeObserver(snVar, i11);
        snVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i11, new Object[0]);
        snVar.finishFragment();
        snVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needDeleteDialog, Long.valueOf(snVar.f6), snVar.f, snVar.e, Boolean.valueOf(z10));
    }

    public /* synthetic */ r(Object obj, int i10, int i11) {
        this.a = i11;
        this.c = obj;
        this.b = i10;
    }

    public /* synthetic */ r(fj fjVar, int i10, boolean z10) {
        this.a = 4;
        this.c = fjVar;
        this.b = i10;
    }

    @Override // org.telegram.ui.Components.dm0
    public /* synthetic */ void h() {
    }

    @Override // org.telegram.ui.Components.dm0
    public /* synthetic */ void o(float f7) {
    }

    private final /* synthetic */ void a(View view, float f7, float f10) {
    }

    private final /* synthetic */ void f(View view, float f7, float f10) {
    }
}
