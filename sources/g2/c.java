package g2;

import android.animation.ValueAnimator;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.location.Address;
import android.location.Geocoder;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.PowerManager;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.google.android.gms.internal.vision.t2;
import com.google.android.gms.internal.vision.x1;
import gi.a6;
import gi.c6;
import gi.cb;
import gi.db;
import gi.f6;
import gi.f7;
import gi.i2;
import gi.k6;
import gi.l6;
import gi.m5;
import gi.m7;
import gi.n2;
import gi.r1;
import gi.t1;
import gi.t8;
import gi.x6;
import gi.y5;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.messenger.bd;
import org.telegram.messenger.hp;
import org.telegram.messenger.qr;
import org.telegram.messenger.t0;
import org.telegram.messenger.u10;
import org.telegram.messenger.zi;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Cells.i3;
import org.telegram.ui.Components.xq;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class c implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ c(int i3, Object obj, Object obj2) {
        this.a = i3;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:78:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0154  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        PowerManager.WakeLock wakeLock;
        TLRPC.TL_messageMediaWebPage tL_messageMediaWebPage;
        ci.j0 j0Var;
        int i3 = 3;
        int i10 = 5;
        int i11 = 6;
        int i12 = 1;
        switch (this.a) {
            case 0:
                d dVar = (d) this.b;
                Object apply = ((k2.v) this.c).apply(dVar.f);
                dVar.f = apply;
                b bVar = new b(dVar, apply, i12);
                j0 j0Var2 = (j0) dVar.c;
                if (j0Var2.a.getLooper().getThread().isAlive()) {
                    j0Var2.d(bVar);
                    return;
                }
                return;
            case 1:
                x xVar = (x) this.b;
                Context context = (Context) this.c;
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
                context.registerReceiver(new androidx.mediarouter.app.f(xVar, i3), intentFilter);
                return;
            case 2:
                androidx.mediarouter.app.f fVar = (androidx.mediarouter.app.f) this.b;
                Context context2 = (Context) this.c;
                x xVar2 = (x) fVar.b;
                ConnectivityManager connectivityManager = (ConnectivityManager) context2.getSystemService("connectivity");
                if (connectivityManager != null) {
                    try {
                        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                        if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                            int type = activeNetworkInfo.getType();
                            if (type != 0) {
                                if (type != 1) {
                                    if (type != 4 && type != 5) {
                                        if (type != 6) {
                                            i3 = type != 9 ? 8 : 7;
                                        }
                                        i3 = 5;
                                    }
                                }
                                i3 = 2;
                            }
                            switch (activeNetworkInfo.getSubtype()) {
                                case 1:
                                case 2:
                                    break;
                                case 3:
                                case 4:
                                case 5:
                                case 6:
                                case 7:
                                case 8:
                                case 9:
                                case 10:
                                case 11:
                                case 12:
                                case 14:
                                case 15:
                                case 17:
                                    i3 = 4;
                                    break;
                                case 13:
                                    i3 = 5;
                                    break;
                                case 16:
                                case 19:
                                default:
                                    i3 = 6;
                                    break;
                                case 18:
                                    i3 = 2;
                                    break;
                                case 20:
                                    if (Build.VERSION.SDK_INT >= 29) {
                                        i3 = 9;
                                        break;
                                    }
                                    break;
                            }
                        } else {
                            i3 = 1;
                        }
                    } catch (SecurityException unused) {
                    }
                    if (Build.VERSION.SDK_INT >= 31 || i3 != 5) {
                        xVar2.c(i3);
                        return;
                    } else {
                        v.a(context2, xVar2);
                        return;
                    }
                }
                i3 = 0;
                if (Build.VERSION.SDK_INT >= 31) {
                }
                xVar2.c(i3);
                return;
            case 3:
                l9.e0 e0Var = (l9.e0) this.b;
                l9.y yVar = (l9.y) this.c;
                if (e0Var.a instanceof l9.a) {
                    yVar.cancel(false);
                    return;
                }
                return;
            case 4:
                q0 q0Var = (q0) this.b;
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.c;
                p4.q qVar = (p4.q) q0Var.d;
                qVar.getClass();
                if (atomicBoolean.get()) {
                    new Thread(new c(i10, qVar, atomicBoolean), "ExoPlayer:WakeLockManager").start();
                    return;
                }
                return;
            case 5:
                p4.q qVar2 = (p4.q) this.b;
                AtomicBoolean atomicBoolean2 = (AtomicBoolean) this.c;
                synchronized (qVar2) {
                    if (atomicBoolean2.get() && (wakeLock = (PowerManager.WakeLock) qVar2.b) != null) {
                        wakeLock.release();
                    }
                }
                return;
            case 6:
                ga.c cVar = (ga.c) this.b;
                CountDownLatch countDownLatch = (CountDownLatch) this.c;
                try {
                    n5.s.a().d.c(cVar.h.a.b(k5.d.c), 1);
                } catch (Exception unused2) {
                }
                countDownLatch.countDown();
                return;
            case 7:
                gi.d dVar2 = (gi.d) this.b;
                org.telegram.ui.Cells.f fVar2 = (org.telegram.ui.Cells.f) this.c;
                int i13 = dVar2.J - 1;
                dVar2.J = i13;
                dVar2.c(i13, true);
                if (dVar2.J > 0) {
                    org.telegram.messenger.g0.i3(dVar2.K, 1000L);
                    return;
                } else {
                    dVar2.setClickable(true);
                    fVar2.run();
                    return;
                }
            case 8:
                ((u10) this.b).a((ArrayList) this.c);
                return;
            case 9:
                r1 r1Var = (r1) this.b;
                TLObject tLObject = (TLObject) this.c;
                t1 t1Var = r1Var.s;
                if (tLObject instanceof TLRPC.TL_contacts_resolvedPeer) {
                    TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject;
                    i2 i2Var = t1Var.r;
                    int i14 = i2.z1;
                    hp.s1(i2Var.a).Y3(tL_contacts_resolvedPeer.users, false);
                    hp.s1(i2Var.a).S3(tL_contacts_resolvedPeer.chats, false);
                    qr.a0(i2Var.a).m1(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, true, true);
                }
                r1Var.n = true;
                r1Var.G();
                return;
            case 10:
                ((n2) this.b).e(0.0f, 240L, (Runnable) this.c);
                return;
            case 11:
                m5 m5Var = (m5) this.b;
                View view = (View) this.c;
                m5Var.getClass();
                if (view instanceof ug.j) {
                    ug.j jVar = (ug.j) view;
                    jVar.m();
                    m5Var.A0(jVar, true);
                    return;
                }
                return;
            case 12:
                TLRPC.MessageMedia messageMedia = (TLRPC.MessageMedia) this.b;
                TL_stories.TL_mediaAreaGeoPoint tL_mediaAreaGeoPoint = (TL_stories.TL_mediaAreaGeoPoint) this.c;
                try {
                    List<Address> fromLocationName = new Geocoder(t0.b, bd.E0().y).getFromLocationName(messageMedia.title, 1);
                    if (fromLocationName.size() <= 0) {
                        return;
                    }
                    tL_mediaAreaGeoPoint.geo.lat = fromLocationName.get(0).getLatitude();
                    tL_mediaAreaGeoPoint.geo._long = fromLocationName.get(0).getLongitude();
                    return;
                } catch (Exception unused3) {
                    return;
                }
            case 13:
                ((u10) this.b).a((Bitmap) this.c);
                return;
            case 14:
                y5.a((y5) this.b, (f7) this.c);
                return;
            case 15:
                android.support.v4.media.session.a0 a0Var = (android.support.v4.media.session.a0) this.b;
                f7 f7Var = (f7) this.c;
                y5 y5Var = (y5) a0Var.d;
                Bitmap bitmap = y5Var.a;
                if (bitmap != null) {
                    bitmap.recycle();
                    if (f7Var.M0 == y5Var.a) {
                        f7Var.M0 = null;
                    }
                    y5Var.a = null;
                    y5Var.invalidate();
                    return;
                }
                return;
            case 16:
                c6 c6Var = (c6) this.b;
                Context context3 = (Context) this.c;
                AtomicReference atomicReference = c6Var.a;
                x1 x1Var = new x1();
                x1Var.a = 256;
                atomicReference.set(new t8.n(new t2(context3, x1Var)));
                c6Var.a(c6Var.f);
                return;
            case 17:
                ((c6) this.b).c.a((a6) this.c);
                return;
            case 18:
                gi.p pVar = (gi.p) this.b;
                ug.r1 r1Var2 = (ug.r1) this.c;
                l6 l6Var = pVar.a;
                if (r1Var2.getWidth() <= 0) {
                    l6Var.animate().scaleX(0.0f).scaleY(1.0f).withEndAction(new f6(pVar, i12)).start();
                    return;
                }
                float width = r1Var2.getWidth() / l6Var.getWidth();
                ValueAnimator valueAnimator = pVar.x;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                pVar.x = ValueAnimator.ofFloat(0.0f, 1.0f);
                pVar.x.addUpdateListener(new k6(pVar, l6Var.getScaleX(), width, ((r1Var2.getWidth() / 2.0f) + r1Var2.getX()) - ((l6Var.getWidth() / 2.0f) + l6Var.getX()), ((r1Var2.getHeight() / 2.0f) + r1Var2.getY()) - ((l6Var.getHeight() / 2.0f) + l6Var.getY()), 0));
                pVar.x.addListener(new bh.j(i11, pVar, r1Var2));
                pVar.x.setDuration(320L);
                pVar.x.setInterpolator(xq.h);
                pVar.w = r1Var2;
                pVar.x.start();
                return;
            case 19:
                x6 x6Var = (x6) this.b;
                TLObject tLObject2 = (TLObject) this.c;
                ArrayList arrayList = x6Var.V1;
                x6Var.o2 = false;
                x6Var.n2 = false;
                if (tLObject2 instanceof TLRPC.messages_Messages) {
                    TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject2;
                    hp.s1(x6Var.a).Y3(messages_messages.users, false);
                    hp.s1(x6Var.a).S3(messages_messages.chats, false);
                    ArrayList<TLRPC.Message> arrayList2 = messages_messages.messages;
                    int size = arrayList2.size();
                    int i15 = 0;
                    while (i15 < size) {
                        TLRPC.Message message = arrayList2.get(i15);
                        i15++;
                        arrayList.add(new zi(x6Var.a, message, false, true));
                    }
                    if ((messages_messages instanceof TLRPC.TL_messages_messagesSlice) && arrayList.size() < messages_messages.count) {
                        r9 = true;
                    }
                    x6Var.m2 = r9;
                    x6Var.l2 = messages_messages.next_rate;
                } else {
                    x6Var.m2 = false;
                    x6Var.l2 = 0;
                }
                x6Var.i2.O(true);
                return;
            case 20:
                x6 x6Var2 = (x6) this.b;
                ArrayList arrayList3 = (ArrayList) this.c;
                x6Var2.D2 = false;
                x6Var2.U1.addAll(arrayList3);
                x6Var2.i2.O(true);
                return;
            case 21:
                f7 f7Var2 = (f7) this.b;
                TLObject tLObject3 = (TLObject) this.c;
                f7Var2.e1 = 0;
                if (tLObject3 instanceof Vector) {
                    f7Var2.V0 = new ArrayList();
                    Vector vector = (Vector) tLObject3;
                    for (int i16 = 0; i16 < vector.objects.size(); i16++) {
                        TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) vector.objects.get(i16);
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
                            f7Var2.V0.add(tL_inputDocument);
                        }
                    }
                    return;
                }
                return;
            case 22:
                m7 m7Var = (m7) this.b;
                TLObject tLObject4 = (TLObject) this.c;
                if (tLObject4 instanceof TL_account.webPagePreview) {
                    TL_account.webPagePreview webpagepreview = (TL_account.webPagePreview) tLObject4;
                    hp.s1(m7Var.a).Y3(webpagepreview.users, false);
                    hp.s1(m7Var.a).S3(webpagepreview.chats, false);
                    TLRPC.MessageMedia messageMedia2 = webpagepreview.media;
                    if (messageMedia2 instanceof TLRPC.TL_messageMediaWebPage) {
                        tL_messageMediaWebPage = (TLRPC.TL_messageMediaWebPage) messageMedia2;
                        if (tL_messageMediaWebPage == null) {
                            TLRPC.WebPage webPage = tL_messageMediaWebPage.webpage;
                            m7Var.Z1 = webPage;
                            if (m7.g1(webPage)) {
                                TLRPC.WebPage webPage2 = m7Var.Z1;
                                m7Var.Y1 = webPage2 == null ? 0L : webPage2.id;
                                m7Var.Z1 = null;
                            } else {
                                m7Var.Y1 = 0L;
                            }
                        } else {
                            m7Var.Z1 = null;
                            m7Var.Y1 = 0L;
                        }
                        m7Var.a2 = m7Var.Y1 != 0;
                        j0Var = m7Var.Q1;
                        if (j0Var == null) {
                            j0Var.O(true);
                            return;
                        }
                        return;
                    }
                }
                tL_messageMediaWebPage = null;
                if (tL_messageMediaWebPage == null) {
                }
                m7Var.a2 = m7Var.Y1 != 0;
                j0Var = m7Var.Q1;
                if (j0Var == null) {
                }
            case 23:
                m7 m7Var2 = (m7) this.b;
                TextView textView = (TextView) this.c;
                ClipboardManager clipboardManager = (ClipboardManager) m7Var2.getContext().getSystemService("clipboard");
                i3 i3Var = m7Var2.R1.d;
                if ((TextUtils.isEmpty(i3Var.getText()) || TextUtils.equals(i3Var.getText(), "https://") || TextUtils.isEmpty(i3Var.getText().toString())) && clipboardManager != null && clipboardManager.hasPrimaryClip()) {
                    r9 = true;
                }
                org.telegram.messenger.camera.q.l(textView.animate().alpha(r9 ? 1.0f : 0.0f).scaleX(r9 ? 1.0f : 0.7f).scaleY(r9 ? 1.0f : 0.7f), xq.h, 300L);
                return;
            case 24:
                t8 t8Var = (t8) this.b;
                HashMap h02 = ((qr) this.c).h0();
                if (h02.isEmpty()) {
                    return;
                }
                org.telegram.messenger.g0.h3(new c(25, t8Var, h02));
                return;
            case 25:
                t8 t8Var2 = (t8) this.b;
                HashMap hashMap = (HashMap) this.c;
                if (t8Var2.H1 == null) {
                    t8Var2.H1 = new HashMap();
                }
                t8Var2.H1.putAll(hashMap);
                return;
            case 26:
                gi.d dVar3 = (gi.d) this.b;
                Runnable runnable = (Runnable) this.c;
                if (dVar3 != null) {
                    dVar3.setLoading(false);
                }
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 27:
                db dbVar = (db) this.b;
                Bitmap bitmap2 = (Bitmap) this.c;
                if (!dbVar.k || dbVar.i) {
                    return;
                }
                dbVar.d.add(new cb(dbVar, bitmap2));
                dbVar.k = false;
                dbVar.n.invalidate();
                return;
            case 28:
                int[] iArr = (int[]) this.b;
                ConnectionsManager connectionsManager = (ConnectionsManager) this.c;
                int i17 = iArr[0];
                if (i17 != 0) {
                    connectionsManager.cancelRequest(i17, true);
                    iArr[0] = 0;
                    return;
                }
                return;
            default:
                ((k0) this.b).h((Typeface) this.c);
                return;
        }
    }
}
