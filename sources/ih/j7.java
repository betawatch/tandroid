package ih;

import android.animation.ValueAnimator;
import android.content.ClipboardManager;
import android.content.Context;
import android.database.SQLException;
import android.graphics.Bitmap;
import android.location.Address;
import android.location.Geocoder;
import android.media.AudioTrack;
import android.text.TextUtils;
import android.text.style.CharacterStyle;
import android.text.style.URLSpan;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.TextView;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.ll;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.i80;
import org.telegram.ui.Components.m80;
import org.telegram.ui.Components.pc;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final /* synthetic */ class j7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ j7(int i9, Object obj, Object obj2) {
        this.a = i9;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        l3 l3Var;
        h4 h4Var;
        int i9;
        int i10;
        int i11;
        boolean z10 = false;
        r4 = 0;
        r4 = 0;
        char c10 = 0;
        int i12 = 0;
        z10 = false;
        switch (this.a) {
            case 0:
                m7 m7Var = (m7) this.b;
                Runnable runnable = (Runnable) this.c;
                if (m7Var.d) {
                    return;
                }
                runnable.run();
                return;
            case 1:
                Runnable[] runnableArr = (Runnable[]) this.c;
                m7 m7Var2 = (m7) this.b;
                runnableArr[0] = null;
                m7Var2.c.run();
                k7 k7Var = m7Var2.e;
                if (k7Var != null) {
                    k7Var.onDetachedFromWindow();
                    return;
                }
                return;
            case 2:
                l7 l7Var = (l7) this.b;
                View view = (View) this.c;
                l7Var.getClass();
                try {
                    view.performHapticFeedback(0);
                } catch (Exception unused) {
                }
                pc pcVar = l7Var.H;
                if (pcVar != null) {
                    pcVar.c(false);
                }
                ViewParent parent = view.getParent();
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).requestDisallowInterceptTouchEvent(false);
                }
                l7Var.N = false;
                l7Var.e();
                return;
            case 3:
                c8 c8Var = (c8) this.b;
                m80 m80Var = (m80) this.c;
                m80 m80Var2 = c8Var.a;
                if (m80Var != m80Var2 || m80Var2 == null) {
                    return;
                }
                CharacterStyle characterStyle = m80Var2.i;
                if (characterStyle instanceof URLSpan) {
                    d8 d8Var = c8Var.v;
                    i80 i80Var = c8Var.c;
                    Objects.requireNonNull(i80Var);
                    d8Var.F.H((URLSpan) characterStyle, d8Var, new g(i80Var, 16));
                    c8Var.a = null;
                    return;
                }
                return;
            case 4:
                q8 q8Var = (q8) this.b;
                kh.x3 x3Var = (kh.x3) this.c;
                q8Var.d.removeView(x3Var);
                if (x3Var == q8Var.c) {
                    q8Var.b = null;
                    q8Var.invalidate();
                    q8Var.b(false);
                    return;
                }
                return;
            case 5:
                d9 d9Var = (d9) this.b;
                l9 l9Var = (l9) this.c;
                m9 m9Var = d9Var.d;
                i4 currentPeerView = m9Var.j0.getCurrentPeerView();
                if (currentPeerView == null || (l3Var = currentPeerView.Y0) == null || (h4Var = m9Var.C0) == null || h4Var.b != l9Var) {
                    return;
                }
                l3Var.invalidate();
                return;
            case 6:
                j3.m mVar = (j3.m) this.b;
                String str = (String) this.c;
                j3.n nVar = mVar.b;
                int i13 = d5.f0.a;
                i3.f fVar = ((h3.h0) nVar).a.r;
                i3.a k10 = fVar.k();
                fVar.l(k10, 1012, new i3.d(k10, str, 5));
                return;
            case 7:
                AudioTrack audioTrack = (AudioTrack) this.b;
                d5.c cVar = (d5.c) this.c;
                try {
                    audioTrack.flush();
                    audioTrack.release();
                    cVar.c();
                    synchronized (j3.i0.d0) {
                        try {
                            int i14 = j3.i0.f0 - 1;
                            j3.i0.f0 = i14;
                            if (i14 == 0) {
                                j3.i0.e0.shutdown();
                                j3.i0.e0 = null;
                            }
                        } finally {
                        }
                    }
                    return;
                } catch (Throwable th) {
                    cVar.c();
                    synchronized (j3.i0.d0) {
                        try {
                            int i15 = j3.i0.f0 - 1;
                            j3.i0.f0 = i15;
                            if (i15 == 0) {
                                j3.i0.e0.shutdown();
                                j3.i0.e0 = null;
                            }
                            throw th;
                        } finally {
                        }
                    }
                }
            case 8:
                j4.s0 s0Var = (j4.s0) this.b;
                m3.t tVar = (m3.t) this.c;
                s0Var.K = s0Var.D == null ? tVar : new m3.o(-9223372036854775807L);
                s0Var.L = tVar.i();
                if (!s0Var.R && tVar.i() == -9223372036854775807L) {
                    z10 = true;
                }
                s0Var.M = z10;
                s0Var.N = z10 ? 7 : 1;
                s0Var.h.t(s0Var.L, tVar.e(), s0Var.M);
                if (s0Var.H) {
                    return;
                }
                s0Var.r();
                return;
            case 9:
                jh.u uVar = (jh.u) this.b;
                String str2 = (String) this.c;
                ArrayList arrayList = uVar.f;
                while (true) {
                    if (i12 >= arrayList.size()) {
                        i12 = -1;
                    } else if (!TextUtils.equals(((f6) arrayList.get(i12)).E, str2)) {
                        i12++;
                    }
                }
                if (i12 >= 0) {
                    uVar.r.d(str2.hashCode(), i12 + 1);
                    return;
                }
                return;
            case 10:
                k9.c cVar2 = (k9.c) this.b;
                CountDownLatch countDownLatch = (CountDownLatch) this.c;
                try {
                    w2.q.a().d.e(cVar2.h.a.b(t2.d.c), 1);
                } catch (SQLException unused2) {
                }
                countDownLatch.countDown();
                return;
            case 11:
                kh.d dVar = (kh.d) this.b;
                org.telegram.ui.Cells.g gVar = (org.telegram.ui.Cells.g) this.c;
                int i16 = dVar.B - 1;
                dVar.B = i16;
                dVar.c(i16, true);
                if (dVar.B > 0) {
                    AndroidUtilities.runOnUIThread(dVar.C, 1000L);
                    return;
                } else {
                    dVar.setClickable(true);
                    gVar.run();
                    return;
                }
            case 12:
                ((Utilities.Callback) this.b).run((ArrayList) this.c);
                return;
            case 13:
                kh.u1 u1Var = (kh.u1) this.b;
                TLObject tLObject = (TLObject) this.c;
                kh.w1 w1Var = u1Var.s;
                if (tLObject instanceof TLRPC.TL_contacts_resolvedPeer) {
                    TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject;
                    kh.n2 n2Var = w1Var.r;
                    i9 = ((org.telegram.ui.ActionBar.f3) n2Var).currentAccount;
                    MessagesController.getInstance(i9).putUsers(tL_contacts_resolvedPeer.users, false);
                    i10 = ((org.telegram.ui.ActionBar.f3) n2Var).currentAccount;
                    MessagesController.getInstance(i10).putChats(tL_contacts_resolvedPeer.chats, false);
                    i11 = ((org.telegram.ui.ActionBar.f3) n2Var).currentAccount;
                    MessagesStorage.getInstance(i11).putUsersAndChats(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, true, true);
                }
                u1Var.n = true;
                u1Var.G();
                return;
            case 14:
                ((kh.s2) this.b).e(0.0f, 240L, (Runnable) this.c);
                return;
            case 15:
                kh.g6 g6Var = (kh.g6) this.b;
                View view2 = (View) this.c;
                g6Var.getClass();
                if (view2 instanceof yf.j) {
                    yf.j jVar = (yf.j) view2;
                    jVar.m();
                    g6Var.D0(jVar, true);
                    return;
                }
                return;
            case 16:
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
            case 17:
                ((Utilities.Callback) this.b).run((Bitmap) this.c);
                return;
            case 18:
                kh.r6.a((kh.r6) this.b, (kh.a8) this.c);
                return;
            case 19:
                j4.c cVar3 = (j4.c) this.b;
                kh.a8 a8Var = (kh.a8) this.c;
                kh.r6 r6Var = (kh.r6) cVar3.d;
                Bitmap bitmap = r6Var.a;
                if (bitmap != null) {
                    bitmap.recycle();
                    if (a8Var.M0 == r6Var.a) {
                        a8Var.M0 = null;
                    }
                    r6Var.a = null;
                    r6Var.invalidate();
                    return;
                }
                return;
            case 20:
                kh.v6 v6Var = (kh.v6) this.b;
                Context context = (Context) this.c;
                AtomicReference atomicReference = v6Var.a;
                com.google.android.gms.internal.vision.x1 x1Var = new com.google.android.gms.internal.vision.x1();
                x1Var.a = 256;
                atomicReference.set(new b8.n(new com.google.android.gms.internal.vision.t2(context, x1Var)));
                v6Var.a(v6Var.f);
                return;
            case 21:
                ((kh.v6) this.b).c.run((kh.t6) this.c);
                return;
            case 22:
                kh.q qVar = (kh.q) this.b;
                yf.b2 b2Var = (yf.b2) this.c;
                kh.d7 d7Var = qVar.a;
                if (b2Var.getWidth() <= 0) {
                    d7Var.animate().scaleX(0.0f).scaleY(1.0f).withEndAction(new kh.f1(qVar, 10)).start();
                    return;
                }
                float width = b2Var.getWidth() / d7Var.getWidth();
                ValueAnimator valueAnimator = qVar.w;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                qVar.w = ValueAnimator.ofFloat(0.0f, 1.0f);
                qVar.w.addUpdateListener(new kh.c7(qVar, d7Var.getScaleX(), width, ((b2Var.getWidth() / 2.0f) + b2Var.getX()) - ((d7Var.getWidth() / 2.0f) + d7Var.getX()), ((b2Var.getHeight() / 2.0f) + b2Var.getY()) - ((d7Var.getHeight() / 2.0f) + d7Var.getY()), 0));
                qVar.w.addListener(new fg.j(6, qVar, b2Var));
                qVar.w.setDuration(320L);
                qVar.w.setInterpolator(gr.h);
                qVar.v = b2Var;
                qVar.w.start();
                return;
            case 23:
                kh.s7 s7Var = (kh.s7) this.b;
                ArrayList arrayList2 = (ArrayList) this.c;
                s7Var.H0 = false;
                s7Var.X.addAll(arrayList2);
                s7Var.m0.N(true);
                return;
            case 24:
                kh.s7.Q((kh.s7) this.b, (TLObject) this.c);
                return;
            case 25:
                kh.a8 a8Var2 = (kh.a8) this.b;
                TLObject tLObject2 = (TLObject) this.c;
                a8Var2.e1 = 0;
                if (tLObject2 instanceof Vector) {
                    a8Var2.V0 = new ArrayList();
                    Vector vector = (Vector) tLObject2;
                    for (int i17 = 0; i17 < vector.objects.size(); i17++) {
                        TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) vector.objects.get(i17);
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
                            a8Var2.V0.add(tL_inputDocument);
                        }
                    }
                    return;
                }
                return;
            case 26:
                kh.k8.Q((kh.k8) this.b, (TLObject) this.c);
                return;
            case 27:
                kh.k8 k8Var = (kh.k8) this.b;
                TextView textView = (TextView) this.c;
                ClipboardManager clipboardManager = (ClipboardManager) k8Var.getContext().getSystemService("clipboard");
                org.telegram.ui.Cells.h3 h3Var = k8Var.U.b;
                if ((TextUtils.isEmpty(h3Var.getText()) || TextUtils.equals(h3Var.getText(), "https://") || TextUtils.isEmpty(h3Var.getText().toString())) && clipboardManager != null && clipboardManager.hasPrimaryClip()) {
                    c10 = 1;
                }
                ll.r(textView.animate().alpha(c10 != 0 ? 1.0f : 0.0f).scaleX(c10 != 0 ? 1.0f : 0.7f).scaleY(c10 == 0 ? 0.7f : 1.0f), gr.h, 300L);
                return;
            case 28:
                kh.t9 t9Var = (kh.t9) this.b;
                HashMap<Long, Integer> smallGroupsParticipantsCount = ((MessagesStorage) this.c).getSmallGroupsParticipantsCount();
                if (smallGroupsParticipantsCount == null || smallGroupsParticipantsCount.isEmpty()) {
                    return;
                }
                AndroidUtilities.runOnUIThread(new j7(29, t9Var, smallGroupsParticipantsCount));
                return;
            default:
                kh.t9 t9Var2 = (kh.t9) this.b;
                HashMap hashMap = (HashMap) this.c;
                if (t9Var2.L == null) {
                    t9Var2.L = new HashMap();
                }
                t9Var2.L.putAll(hashMap);
                return;
        }
    }

    public /* synthetic */ j7(Runnable[] runnableArr, m7 m7Var) {
        this.a = 1;
        this.c = runnableArr;
        this.b = m7Var;
    }
}
