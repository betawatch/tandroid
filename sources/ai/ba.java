package ai;

import android.animation.ValueAnimator;
import android.content.ClipboardManager;
import android.content.Context;
import android.database.SQLException;
import android.graphics.Bitmap;
import android.location.Address;
import android.location.Geocoder;
import android.media.AudioManager;
import android.text.TextUtils;
import android.text.style.CharacterStyle;
import android.text.style.URLSpan;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.TextView;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.ok;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.k90;
import org.telegram.ui.Components.o90;
import org.telegram.ui.Components.rr;
import org.telegram.ui.Components.zc;
import org.webrtc.MediaStreamTrack;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes4.dex */
public final /* synthetic */ class ba implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ba(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        a5 a5Var;
        d6 d6Var;
        int i10;
        int i11;
        int i12;
        int i13 = 0;
        switch (this.a) {
            case 0:
                ca caVar = (ca) this.b;
                View view = (View) this.c;
                caVar.getClass();
                try {
                    view.performHapticFeedback(0);
                } catch (Exception unused) {
                }
                zc zcVar = caVar.H;
                if (zcVar != null) {
                    zcVar.c(false);
                }
                ViewParent parent = view.getParent();
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).requestDisallowInterceptTouchEvent(false);
                }
                caVar.N = false;
                caVar.e();
                return;
            case 1:
                va vaVar = (va) this.b;
                o90 o90Var = (o90) this.c;
                o90 o90Var2 = vaVar.a;
                if (o90Var != o90Var2 || o90Var2 == null) {
                    return;
                }
                CharacterStyle characterStyle = o90Var2.i;
                if (characterStyle instanceof URLSpan) {
                    wa waVar = vaVar.v;
                    k90 k90Var = vaVar.c;
                    Objects.requireNonNull(k90Var);
                    waVar.J.H((URLSpan) characterStyle, waVar, new a3.d(k90Var, 18));
                    vaVar.a = null;
                    return;
                }
                return;
            case 2:
                mb mbVar = (mb) this.b;
                ci.e4 e4Var = (ci.e4) this.c;
                mbVar.d.removeView(e4Var);
                if (e4Var == mbVar.c) {
                    mbVar.b = null;
                    mbVar.invalidate();
                    mbVar.b(false);
                    return;
                }
                return;
            case 3:
                ac acVar = (ac) this.b;
                ic icVar = (ic) this.c;
                jc jcVar = acVar.d;
                e6 currentPeerView = jcVar.n0.getCurrentPeerView();
                if (currentPeerView == null || (a5Var = currentPeerView.c1) == null || (d6Var = jcVar.G0) == null || ((ic) d6Var.c) != icVar) {
                    return;
                }
                a5Var.invalidate();
                return;
            case 4:
                ViewGroup container = (ViewGroup) this.b;
                kotlin.jvm.internal.i.e(container, "$container");
                container.endViewTransition(null);
                throw null;
            case 5:
                ((v0.i) this.b).onError(this.c);
                return;
            case 6:
                ((v0.i) this.b).onResult((v0.o) this.c);
                return;
            case 7:
                bi.z zVar = (bi.z) this.b;
                String str = (String) this.c;
                ArrayList arrayList = zVar.f;
                while (true) {
                    if (i13 >= arrayList.size()) {
                        i13 = -1;
                    } else if (!TextUtils.equals(((u8) arrayList.get(i13)).E, str)) {
                        i13++;
                    }
                }
                if (i13 >= 0) {
                    zVar.r.d(str.hashCode(), i13 + 1);
                    return;
                }
                return;
            case 8:
                ((c1.e) this.b).e().onError(((kotlin.jvm.internal.p) this.c).a);
                return;
            case 9:
                ((c1.e) this.b).e().onError((w0.h) this.c);
                return;
            case 10:
                ((c1.e) this.b).e().onResult((v0.o) this.c);
                return;
            case 11:
                Context context = (Context) this.b;
                e2.g gVar = (e2.g) this.c;
                c2.d.a = (AudioManager) context.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
                gVar.e();
                return;
            case 12:
                ca.c cVar = (ca.c) this.b;
                CountDownLatch countDownLatch = (CountDownLatch) this.c;
                try {
                    l5.s.a().d.e(cVar.h.a.b(i5.d.c), 1);
                } catch (SQLException unused2) {
                }
                countDownLatch.countDown();
                return;
            case 13:
                ci.d dVar = (ci.d) this.b;
                org.telegram.ui.Cells.g gVar2 = (org.telegram.ui.Cells.g) this.c;
                int i14 = dVar.F - 1;
                dVar.F = i14;
                dVar.b(i14, true);
                if (dVar.F > 0) {
                    AndroidUtilities.runOnUIThread(dVar.G, 1000L);
                    return;
                } else {
                    dVar.setClickable(true);
                    gVar2.run();
                    return;
                }
            case 14:
                ((Utilities.Callback) this.b).run((ArrayList) this.c);
                return;
            case 15:
                ci.w1 w1Var = (ci.w1) this.b;
                TLObject tLObject = (TLObject) this.c;
                ci.z1 z1Var = w1Var.s;
                if (tLObject instanceof TLRPC.TL_contacts_resolvedPeer) {
                    TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject;
                    ci.s2 s2Var = z1Var.r;
                    i10 = ((org.telegram.ui.ActionBar.e3) s2Var).currentAccount;
                    MessagesController.getInstance(i10).putUsers(tL_contacts_resolvedPeer.users, false);
                    i11 = ((org.telegram.ui.ActionBar.e3) s2Var).currentAccount;
                    MessagesController.getInstance(i11).putChats(tL_contacts_resolvedPeer.chats, false);
                    i12 = ((org.telegram.ui.ActionBar.e3) s2Var).currentAccount;
                    MessagesStorage.getInstance(i12).putUsersAndChats(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, true, true);
                }
                w1Var.n = true;
                w1Var.G();
                return;
            case 16:
                ((ci.x2) this.b).e(0.0f, 240L, (Runnable) this.c);
                return;
            case 17:
                ci.q6 q6Var = (ci.q6) this.b;
                View view2 = (View) this.c;
                q6Var.getClass();
                if (view2 instanceof qg.j) {
                    qg.j jVar = (qg.j) view2;
                    jVar.m();
                    q6Var.D0(jVar, true);
                    return;
                }
                return;
            case 18:
                TLRPC.MessageMedia messageMedia = (TLRPC.MessageMedia) this.b;
                TL_stories.TL_mediaAreaGeoPoint tL_mediaAreaGeoPoint = (TL_stories.TL_mediaAreaGeoPoint) this.c;
                try {
                    List<Address> fromLocationName = new Geocoder(ApplicationLoader.applicationContext, LocaleController.getInstance().getCurrentLocale()).getFromLocationName(messageMedia.title, 1);
                    if (fromLocationName.size() <= 0) {
                        return;
                    }
                    tL_mediaAreaGeoPoint.geo.lat = fromLocationName.get(0).getLatitude();
                    tL_mediaAreaGeoPoint.geo._long = fromLocationName.get(0).getLongitude();
                    return;
                } catch (Exception unused3) {
                    return;
                }
            case 19:
                ((Utilities.Callback) this.b).run((Bitmap) this.c);
                return;
            case 20:
                ci.b7.a((ci.b7) this.b, (ci.l8) this.c);
                return;
            case 21:
                aa.a aVar = (aa.a) this.b;
                ci.l8 l8Var = (ci.l8) this.c;
                ci.b7 b7Var = (ci.b7) aVar.d;
                Bitmap bitmap = b7Var.a;
                if (bitmap != null) {
                    bitmap.recycle();
                    if (l8Var.M0 == b7Var.a) {
                        l8Var.M0 = null;
                    }
                    b7Var.a = null;
                    b7Var.invalidate();
                    return;
                }
                return;
            case 22:
                ci.f7 f7Var = (ci.f7) this.b;
                Context context2 = (Context) this.c;
                AtomicReference atomicReference = f7Var.a;
                com.google.android.gms.internal.vision.x1 x1Var = new com.google.android.gms.internal.vision.x1();
                x1Var.a = 256;
                atomicReference.set(new r8.n(new com.google.android.gms.internal.vision.u2(context2, x1Var)));
                f7Var.a(f7Var.f);
                return;
            case 23:
                ((ci.f7) this.b).c.run((ci.d7) this.c);
                return;
            case 24:
                ci.p pVar = (ci.p) this.b;
                qg.c2 c2Var = (qg.c2) this.c;
                ci.n7 n7Var = pVar.a;
                if (c2Var.getWidth() <= 0) {
                    n7Var.animate().scaleX(0.0f).scaleY(1.0f).withEndAction(new androidx.fragment.app.a0(pVar, 20)).start();
                    return;
                }
                float width = c2Var.getWidth() / n7Var.getWidth();
                ValueAnimator valueAnimator = pVar.w;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                pVar.w = ValueAnimator.ofFloat(0.0f, 1.0f);
                pVar.w.addUpdateListener(new ci.m7(pVar, n7Var.getScaleX(), width, ((c2Var.getWidth() / 2.0f) + c2Var.getX()) - ((n7Var.getWidth() / 2.0f) + n7Var.getX()), ((c2Var.getHeight() / 2.0f) + c2Var.getY()) - ((n7Var.getHeight() / 2.0f) + n7Var.getY()), 0));
                pVar.w.addListener(new z(4, pVar, c2Var));
                pVar.w.setDuration(320L);
                pVar.w.setInterpolator(rr.h);
                pVar.v = c2Var;
                pVar.w.start();
                return;
            case 25:
                ci.d8 d8Var = (ci.d8) this.b;
                ArrayList arrayList2 = (ArrayList) this.c;
                d8Var.L0 = false;
                d8Var.b0.addAll(arrayList2);
                d8Var.q0.N(true);
                return;
            case 26:
                ci.d8.R((ci.d8) this.b, (TLObject) this.c);
                return;
            case 27:
                ci.l8 l8Var2 = (ci.l8) this.b;
                TLObject tLObject2 = (TLObject) this.c;
                l8Var2.e1 = 0;
                if (tLObject2 instanceof Vector) {
                    l8Var2.V0 = new ArrayList();
                    Vector vector = (Vector) tLObject2;
                    for (int i15 = 0; i15 < vector.objects.size(); i15++) {
                        TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) vector.objects.get(i15);
                        TLRPC.Document document = stickerSetCovered.cover;
                        if (document == null && !stickerSetCovered.covers.isEmpty()) {
                            document = stickerSetCovered.covers.get(0);
                        }
                        if (document == null && (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered)) {
                            TLRPC.TL_stickerSetFullCovered tL_stickerSetFullCovered = (TLRPC.TL_stickerSetFullCovered) stickerSetCovered;
                            if (!tL_stickerSetFullCovered.documents.isEmpty()) {
                                document = tL_stickerSetFullCovered.documents.get(0);
                            }
                        }
                        if (document != null) {
                            TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                            tL_inputDocument.id = document.id;
                            tL_inputDocument.access_hash = document.access_hash;
                            tL_inputDocument.file_reference = document.file_reference;
                            l8Var2.V0.add(tL_inputDocument);
                        }
                    }
                    return;
                }
                return;
            case 28:
                ci.u8.R((ci.u8) this.b, (TLObject) this.c);
                return;
            default:
                ci.u8 u8Var = (ci.u8) this.b;
                TextView textView = (TextView) this.c;
                ClipboardManager clipboardManager = (ClipboardManager) u8Var.getContext().getSystemService("clipboard");
                org.telegram.ui.Cells.h3 h3Var = u8Var.Y.b;
                if ((TextUtils.isEmpty(h3Var.getText()) || TextUtils.equals(h3Var.getText(), "https://") || TextUtils.isEmpty(h3Var.getText().toString())) && clipboardManager != null && clipboardManager.hasPrimaryClip()) {
                    i13 = 1;
                }
                ok.s(textView.animate().alpha(i13 != 0 ? 1.0f : 0.0f).scaleX(i13 != 0 ? 1.0f : 0.7f).scaleY(i13 == 0 ? 0.7f : 1.0f), rr.h, 300L);
                return;
        }
    }
}
