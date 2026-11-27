// default package

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.location.Location;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.Editable;
import android.util.Log;
import android.util.Pair;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import androidx.car.app.CarAppPermissionActivity;
import androidx.car.app.IOnRequestPermissionsListener;
import androidx.car.app.IStartCarApp;
import androidx.car.app.notification.CarAppNotificationBroadcastReceiver;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.RequestDelegateTimestamp;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class h01 implements RequestDelegateTimestamp, lcc, fd, oj3, ea9, s9, wb0, t69, gc7, hj, dz5, h69, n39, bf7, ResultCallback, zj5, c88, on5, u12 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ h01(of1 of1Var, wb2 wb2Var, TLRPC.User user) {
        this.a = (byte) 7;
        this.b = of1Var;
        this.c = user;
    }

    @Override // bf7
    public final void A(boolean z) {
        oq1 oq1Var = (oq1) this.b;
        long j = ((TLRPC.User) this.c).id;
        zu1 zu1Var = oq1Var.b;
        long j2 = zu1Var.s4;
        if (j != j2) {
            return;
        }
        zu1Var.Ia(j2, false);
    }

    @Override // oj3
    public final boolean E() {
        return false;
    }

    @Override // zj5
    public final boolean a(MotionEvent motionEvent, a15 a15Var) {
        Location location;
        s42 s42Var = (s42) this.b;
        vnb vnbVar = (vnb) this.c;
        ImageView imageView = s42Var.n;
        Property property = View.TRANSLATION_Y;
        ImageView imageView2 = s42Var.P;
        if (motionEvent.getAction() == 0) {
            AnimatorSet animatorSet = s42Var.b0;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            s42Var.b0 = animatorSet2;
            animatorSet2.setDuration(200L);
            s42Var.b0.playTogether(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property, s42Var.k0 - hl.L(10.0f)));
            s42Var.b0.start();
        } else if (motionEvent.getAction() == 1) {
            AnimatorSet animatorSet3 = s42Var.b0;
            if (animatorSet3 != null) {
                animatorSet3.cancel();
            }
            s42Var.H = 0.0f;
            AnimatorSet animatorSet4 = new AnimatorSet();
            s42Var.b0 = animatorSet4;
            animatorSet4.setDuration(200L);
            s42Var.b0.playTogether(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property, s42Var.k0));
            s42Var.b0.start();
        }
        if (motionEvent.getAction() == 2) {
            if (!s42Var.m0) {
                int i = aob.lj;
                yob.s(imageView, i, vnbVar, PorterDuff.Mode.MULTIPLY);
                imageView.setTag(Integer.valueOf(i));
                s42Var.m0 = true;
            }
            x05 x05Var = s42Var.E;
            if (x05Var != null && (location = s42Var.j0) != null) {
                location.setLatitude(((ak5) x05Var.d().b).a);
                s42Var.j0.setLongitude(((ak5) s42Var.E.d().b).b);
            }
            s42Var.L.L(s42Var.j0);
        }
        return a15Var.a(motionEvent).booleanValue();
    }

    @Override // gc7
    public final boolean b(TLRPC.TL_error tL_error) {
        ((zu1) this.b).Q8((Context) this.c, tL_error);
        return false;
    }

    @Override // c88
    public final void c(d88 d88Var) {
        TLRPC.Chat chat;
        u52 u52Var = (u52) this.b;
        d88 d88Var2 = (d88) this.c;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = u52Var.w;
        boolean z = chatAttachAlertPhotoLayout.w0;
        n12 n12Var = chatAttachAlertPhotoLayout.b;
        if (z) {
            byte b = n12Var.N2;
            e eVar = n12Var.Z1;
            if (b != 0 || n12Var.B1) {
                return;
            }
            int intValue = ((Integer) d88Var.getTag()).intValue();
            no6 photoEntry = d88Var.getPhotoEntry();
            if (chatAttachAlertPhotoLayout.X(photoEntry)) {
                return;
            }
            HashMap hashMap = ChatAttachAlertPhotoLayout.t1;
            if (hashMap.size() + 1 > chatAttachAlertPhotoLayout.h0()) {
                new d31(n12Var.o3, chatAttachAlertPhotoLayout.a).t(hl.S2(ob6.G(eVar.getMessagesController().k4.q0.f(), "BusinessRepliesToastLimit", new Object[0])), null).j();
                return;
            }
            boolean containsKey = hashMap.containsKey(Integer.valueOf(photoEntry.C));
            boolean z2 = !containsKey;
            if (!containsKey && n12Var.P3 >= 0 && hashMap.size() >= n12Var.P3) {
                if (!n12Var.Q3 || !(eVar instanceof zu1) || (chat = ((zu1) eVar).e) == null || xc2.N(chat) || !chat.slowmode_enabled || chatAttachAlertPhotoLayout.M == 2) {
                    return;
                }
                jj.L(chatAttachAlertPhotoLayout.getContext(), ob6.M0(2131745038, null), ob6.M0(2131745031, null), null, null, chatAttachAlertPhotoLayout.a).o();
                if (chatAttachAlertPhotoLayout.M == 1) {
                    chatAttachAlertPhotoLayout.M = (byte) 2;
                    return;
                }
                return;
            }
            int size = !containsKey ? ChatAttachAlertPhotoLayout.u1.size() : -1;
            if ((eVar instanceof zu1) && n12Var.Q3) {
                d88Var.b(size, z2, true);
            } else {
                d88Var.b(-1, z2, true);
            }
            chatAttachAlertPhotoLayout.Q(photoEntry, intValue);
            u52 u52Var2 = chatAttachAlertPhotoLayout.w;
            if (u52Var == u52Var2) {
                u52 u52Var3 = chatAttachAlertPhotoLayout.H;
                if (u52Var3.d && chatAttachAlertPhotoLayout.U0 == chatAttachAlertPhotoLayout.V0) {
                    intValue++;
                }
                if (u52Var3.f && intValue >= chatAttachAlertPhotoLayout.N0) {
                    intValue++;
                }
                u52Var3.g(intValue);
            } else {
                u52Var2.g(intValue);
            }
            n12Var.G1(containsKey ? 2 : 1);
            d88Var2.setHasSpoiler(photoEntry.M);
            d88Var2.setHighQuality(photoEntry.c());
            d88Var2.f(photoEntry.N, hashMap.size() > 1);
        }
    }

    @Override // ea9
    public final void call() {
        IStartCarApp iStartCarApp = (IStartCarApp) this.b;
        Intent intent = (Intent) this.c;
        int i = CarAppNotificationBroadcastReceiver.a;
        iStartCarApp.startCarApp(intent);
    }

    @Override // u12
    public final void d(ArrayList arrayList, Editable editable, boolean z, int i, int i2, long j, boolean z2, long j2) {
        pcc pccVar = (pcc) this.b;
        f41 f41Var = (f41) this.c;
        if (!arrayList.isEmpty()) {
            pccVar.a(new hh8((r47) arrayList.get(0)));
        }
        f41Var.a(true);
    }

    @Override // t69
    public final boolean e(int i, View view) {
        return ((ng1) this.b).I0((Context) this.c, view, i);
    }

    @Override // h69
    public final void f() {
        zu1 zu1Var = (zu1) this.b;
        ((vy4) this.c).g();
        zu1Var.Q7();
    }

    @Override // n39
    public final void g(long j, TLRPC.MessagePeerReaction messagePeerReaction) {
        jp1 jp1Var = (jp1) this.b;
        r47 r47Var = (r47) this.c;
        zu1 zu1Var = jp1Var.p;
        Bundle bundle = new Bundle();
        if (j > 0) {
            bundle.putLong("user_id", j);
        } else {
            bundle.putLong("chat_id", -j);
        }
        bundle.putInt("report_reaction_message_id", r47Var.e1());
        bundle.putLong("report_reaction_from_dialog_id", zu1Var.l6);
        zu1Var.presentFragment(new ProfileActivity(bundle, null));
        zu1Var.M5(true);
    }

    @Override // lcc
    public final void h(Object obj, TLRPC.Document document, Boolean bool) {
        g41 g41Var = (g41) this.b;
        View view = (View) this.c;
        g41Var.x = false;
        hl.r(g41Var.e);
        b41 b41Var = g41Var.n;
        g41Var.y = document;
        b41Var.setSticker(document);
        ((skb) view).setValueSticker(document);
        g41Var.f0(true);
    }

    @Override // wb0
    public final void j(ec0 ec0Var) {
        of1 of1Var = (of1) this.b;
        TLRPC.User user = (TLRPC.User) this.c;
        int ordinal = ec0Var.ordinal();
        if (ordinal == 0) {
            of1Var.a(user);
            return;
        }
        if (ordinal == 3) {
            tf1 tf1Var = of1Var.a;
            if (user != null) {
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", user.id);
                e eVar = tf1Var.n;
                if (eVar.getMessagesController().C(bundle, eVar, null, null)) {
                    eVar.presentFragment(new zu1(bundle));
                }
            }
        }
    }

    @Override // s9
    public final void k(Object obj) {
        CarAppPermissionActivity carAppPermissionActivity = (CarAppPermissionActivity) this.b;
        IOnRequestPermissionsListener iOnRequestPermissionsListener = (IOnRequestPermissionsListener) this.c;
        int i = CarAppPermissionActivity.K;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Map.Entry entry : ((Map) obj).entrySet()) {
            Boolean bool = (Boolean) entry.getValue();
            if (bool == null || !bool.booleanValue()) {
                arrayList2.add((String) entry.getKey());
            } else {
                arrayList.add((String) entry.getKey());
            }
        }
        try {
            iOnRequestPermissionsListener.onRequestPermissionsResult((String[]) arrayList.toArray(new String[0]), (String[]) arrayList2.toArray(new String[0]));
        } catch (RemoteException e) {
            Log.e("CarApp", "CarAppService dead when accepting/rejecting permissions", e);
        }
        carAppPermissionActivity.finish();
    }

    @Override // dz5
    public final void l(Exception exc) {
        AtomicBoolean atomicBoolean = (AtomicBoolean) this.b;
        AtomicReference atomicReference = (AtomicReference) this.c;
        cc4.d("mlkit: failed to detect language in message");
        atomicBoolean.set(false);
        if (atomicReference.get() != null) {
            ((Runnable) atomicReference.get()).run();
            atomicReference.set(null);
        }
    }

    @Override // org.telegram.tgnet.ResultCallback
    public final void onComplete(Object obj) {
        xu1 xu1Var = (xu1) this.b;
        hh7 hh7Var = (hh7) this.c;
        Pair pair = (Pair) obj;
        if (pair != null) {
            long longValue = ((Long) pair.first).longValue();
            Bitmap bitmap = (Bitmap) pair.second;
            ez3 ez3Var = xu1Var.f;
            if (ez3Var == null || longValue != ez3Var.h(xu1Var.q ? 1 : 0) || bitmap == null) {
                return;
            }
            hh7Var.x = bitmap;
            hh7Var.i();
        }
    }

    @Override // oj3
    public final boolean q(uj3 uj3Var, ArrayList arrayList, CharSequence charSequence, boolean z, boolean z2, int i, int i2, tzb tzbVar) {
        byte b;
        d61 d61Var = (d61) this.b;
        uj3 uj3Var2 = (uj3) this.c;
        ArrayList arrayList2 = d61Var.c;
        uj3Var2.finishFragment();
        u51 u51Var = null;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            boolean z3 = true;
            if (i4 >= arrayList.size()) {
                break;
            }
            int i5 = 0;
            while (true) {
                if (i5 >= d61Var.d.size()) {
                    z3 = false;
                    break;
                }
                if (((u51) d61Var.d.get(i5)).a == ((if7) arrayList.get(i4)).a) {
                    u51Var = (u51) d61Var.d.get(i5);
                    break;
                }
                i5++;
            }
            if (!z3) {
                b = d61Var.getMessagesController().h4.c(d61Var.e) != 2 ? (byte) 2 : (byte) 3;
                ArrayList arrayList3 = d61Var.d;
                u51 u51Var2 = new u51(((if7) arrayList.get(i4)).a, b);
                arrayList3.add(u51Var2);
                u51Var = u51Var2;
            }
            i4++;
        }
        d61Var.getMessagesController().h4.h(d61Var.e, d61Var.d);
        d61Var.Y();
        if (u51Var != null) {
            int i6 = 0;
            while (true) {
                if (i6 < arrayList2.size()) {
                    if (((c61) arrayList2.get(i6)).c != null && ((c61) arrayList2.get(i6)).c.a == u51Var.a) {
                        i3 = i6;
                        break;
                    }
                    i6++;
                } else {
                    break;
                }
            }
            d61Var.b.x0(i3);
            hl.d3(new z21(d61Var, u51Var, b), 150L);
        }
        return true;
    }

    @Override // org.telegram.tgnet.RequestDelegateTimestamp
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error, long j) {
        String str;
        oz0 oz0Var;
        oz0 oz0Var2;
        i01 i01Var = (i01) this.b;
        pz0 pz0Var = (pz0) this.c;
        if (tLObject instanceof TLRPC.TL_upload_file) {
            TLRPC.TL_upload_file tL_upload_file = (TLRPC.TL_upload_file) tLObject;
            NativeByteBuffer nativeByteBuffer = tL_upload_file.bytes;
            int limit = nativeByteBuffer != null ? nativeByteBuffer.limit() : 0;
            byte[] bArr = new byte[limit];
            if (limit > 0) {
                tL_upload_file.bytes.position(0);
                tL_upload_file.bytes.readBytes(bArr, false);
            }
            oz0Var2 = new oz0(j, bArr, 0, limit);
        } else {
            if (tLObject instanceof TLRPC.TL_upload_fileCdnRedirect) {
                oz0Var = new oz0(j, null, 1, 0);
            } else {
                if (tL_error == null || (str = tL_error.text) == null) {
                    str = "";
                }
                if (str.startsWith("FLOOD_WAIT") || "TIME_TOO_BIG".equals(str)) {
                    oz0Var = new oz0(j, null, 1, 0);
                } else if ("GROUPCALL_JOIN_MISSING".equals(str)) {
                    oz0Var2 = new oz0(0L, null, 3, 0);
                } else {
                    oz0Var = new oz0(j, null, 2, 0);
                }
            }
            oz0Var2 = oz0Var;
        }
        i01Var.e.execute(new a30(pz0Var, oz0Var2, (byte) 27));
    }

    @Override // oj3
    public final boolean s(uj3 uj3Var) {
        return false;
    }

    @Override // on5
    public final void v(ImageReceiver imageReceiver, boolean z, boolean z2, boolean z3) {
        z52 z52Var = (z52) this.b;
        no6 no6Var = (no6) this.c;
        if (z && !z2 && no6Var.M && z52Var.d.n() == null) {
            if (z52Var.d.n() != null && !z52Var.d.n().isRecycled()) {
                z52Var.d.n().recycle();
                z52Var.d.g0(null);
            }
            z52Var.d.f0(Utilities.D(imageReceiver.n(), false));
        }
    }

    @Override // fd
    public final void w(id idVar, int i) {
        byte b = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 2:
                ((n41) obj2).e0((TL_account.TL_businessChatLink) obj);
                break;
            case 6:
                m01.q(((wf1) obj2).getParentActivity(), (String) obj, true);
                break;
            case 9:
                ((ng1) obj2).G0((TL_payments.connectedBotStarRef) obj);
                break;
            default:
                ((gi1) obj2).f0((TLRPC.Chat) obj);
                break;
        }
    }

    @Override // hj
    public final void y(int i, int i2, boolean z) {
        r47 threadMessage;
        byte b = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 12:
                zu1 zu1Var = (zu1) obj2;
                zu1Var.getSendMessagesHelper().q0(p7a.b((String) obj, zu1Var.l6, zu1Var.F5, zu1Var.m4, null, false, null, null, null, z, i, 0, null, false));
                zu1Var.a0.setFieldText("");
                zu1Var.E7(false);
                break;
            case 15:
                zu1 zu1Var2 = (zu1) obj2;
                zu1Var2.G6();
                r7a.X(zu1Var2.getAccountInstance(), (Uri) obj, zu1Var2.l6, zu1Var2.F5, zu1Var2.m4, null, zu1Var2.H5, z, i, zu1Var2.X6());
                break;
            case 18:
                ju1 ju1Var = (ju1) obj2;
                r47 r47Var = (r47) obj;
                if (z) {
                    ju1Var.a.getMessagesController().t(r47Var.k.id, i, wf3.n(r47Var.k.peer_id), null, false);
                    break;
                }
                break;
            case 21:
                String str = (String) obj;
                ChatActivityEnterView chatActivityEnterView = ((sx1) obj2).a;
                long j = chatActivityEnterView.F3;
                r47 r47Var2 = chatActivityEnterView.I3;
                threadMessage = chatActivityEnterView.getThreadMessage();
                p7a b2 = p7a.b(str, j, r47Var2, threadMessage, null, false, null, null, null, z, i, i2, null, false);
                zu1 zu1Var3 = chatActivityEnterView.E3;
                b2.K = zu1Var3 != null ? zu1Var3.X6() : null;
                b2.O = chatActivityEnterView.o7;
                r7a.B(chatActivityEnterView.R).q0(b2);
                chatActivityEnterView.setFieldText("");
                chatActivityEnterView.n0.c();
                bx1 bx1Var = chatActivityEnterView.K0;
                chatActivityEnterView.o7 = 0L;
                bx1Var.setEffect(0L);
                break;
            case 23:
                ((wy1) obj2).L((kj4) obj, z, i, i2);
                break;
            default:
                a72 a72Var = (a72) obj2;
                View view = (View) obj;
                if (z) {
                    a72Var.W = i;
                    a72Var.V = 0;
                    if (!(view instanceof skb)) {
                        a72Var.r.g(a72Var.J0);
                        break;
                    } else {
                        a72Var.T((skb) view, true);
                        break;
                    }
                }
                break;
        }
    }

    @Override // org.telegram.tgnet.ResultCallback
    public final void onError(TLRPC.TL_error tL_error) {
    }

    public /* synthetic */ h01(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    @Override // org.telegram.tgnet.ResultCallback
    public final void onError(Throwable th) {
    }

    @Override // on5
    public final void r(ImageReceiver imageReceiver) {
    }

    @Override // on5
    public final void z(int i, Drawable drawable) {
    }
}
