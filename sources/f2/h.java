package f2;

import android.animation.ValueAnimator;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.location.Address;
import android.location.Geocoder;
import android.media.AudioManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.PowerManager;
import android.support.v4.media.session.a0;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import bi.o0;
import com.google.android.gms.internal.vision.t2;
import com.google.android.gms.internal.vision.x1;
import di.s7;
import fi.a6;
import fi.c6;
import fi.cb;
import fi.db;
import fi.e7;
import fi.j6;
import fi.k2;
import fi.k6;
import fi.m7;
import fi.o5;
import fi.p2;
import fi.r1;
import fi.s8;
import fi.t1;
import fi.w6;
import fi.y5;
import h2.i0;
import h2.j0;
import h2.p0;
import h2.w;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import l2.u;
import m9.e0;
import m9.y;
import org.telegram.messenger.c20;
import org.telegram.messenger.g0;
import org.telegram.messenger.id;
import org.telegram.messenger.ij;
import org.telegram.messenger.qp;
import org.telegram.messenger.t0;
import org.telegram.messenger.yr;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Cells.i3;
import org.telegram.ui.Components.xq;
import org.webrtc.MediaStreamTrack;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final /* synthetic */ class h implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ h(int i7, Context context, Object obj) {
        this.a = i7;
        this.c = obj;
        this.b = context;
    }

    /* JADX WARN: Removed duplicated region for block: B:132:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:145:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0258  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        TLRPC.TL_messageMediaWebPage tL_messageMediaWebPage;
        o0 o0Var;
        PowerManager.WakeLock wakeLock;
        int i7 = 3;
        int i10 = 6;
        int i11 = 29;
        switch (this.a) {
            case 0:
                Context context = (Context) this.b;
                h2.i iVar = (h2.i) this.c;
                i.a = (AudioManager) context.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
                iVar.e();
                return;
            case 1:
                fi.d dVar = (fi.d) this.b;
                org.telegram.ui.Cells.f fVar = (org.telegram.ui.Cells.f) this.c;
                int i12 = dVar.I - 1;
                dVar.I = i12;
                dVar.c(i12, true);
                if (dVar.I > 0) {
                    g0.i3(dVar.J, 1000L);
                    return;
                } else {
                    dVar.setClickable(true);
                    fVar.run();
                    return;
                }
            case 2:
                ((c20) this.b).a((ArrayList) this.c);
                return;
            case 3:
                r1 r1Var = (r1) this.b;
                TLObject tLObject = (TLObject) this.c;
                t1 t1Var = r1Var.s;
                if (tLObject instanceof TLRPC.TL_contacts_resolvedPeer) {
                    TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject;
                    k2 k2Var = t1Var.r;
                    int i13 = k2.y1;
                    qp.s1(k2Var.a).Y3(tL_contacts_resolvedPeer.users, false);
                    qp.s1(k2Var.a).S3(tL_contacts_resolvedPeer.chats, false);
                    yr.a0(k2Var.a).m1(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, true, true);
                }
                r1Var.n = true;
                r1Var.G();
                return;
            case 4:
                ((p2) this.b).e(0.0f, 240L, (Runnable) this.c);
                return;
            case 5:
                o5 o5Var = (o5) this.b;
                View view = (View) this.c;
                o5Var.getClass();
                if (view instanceof tg.j) {
                    tg.j jVar = (tg.j) view;
                    jVar.m();
                    o5Var.A0(jVar, true);
                    return;
                }
                return;
            case 6:
                TLRPC.MessageMedia messageMedia = (TLRPC.MessageMedia) this.b;
                TL_stories.TL_mediaAreaGeoPoint tL_mediaAreaGeoPoint = (TL_stories.TL_mediaAreaGeoPoint) this.c;
                try {
                    List<Address> fromLocationName = new Geocoder(t0.b, id.E0().y).getFromLocationName(messageMedia.title, 1);
                    if (fromLocationName.size() <= 0) {
                        return;
                    }
                    tL_mediaAreaGeoPoint.geo.lat = fromLocationName.get(0).getLatitude();
                    tL_mediaAreaGeoPoint.geo._long = fromLocationName.get(0).getLongitude();
                    return;
                } catch (Exception unused) {
                    return;
                }
            case 7:
                ((c20) this.b).a((Bitmap) this.c);
                return;
            case 8:
                y5.a((y5) this.b, (e7) this.c);
                return;
            case 9:
                a0 a0Var = (a0) this.b;
                e7 e7Var = (e7) this.c;
                y5 y5Var = (y5) a0Var.d;
                Bitmap bitmap = y5Var.a;
                if (bitmap != null) {
                    bitmap.recycle();
                    if (e7Var.M0 == y5Var.a) {
                        e7Var.M0 = null;
                    }
                    y5Var.a = null;
                    y5Var.invalidate();
                    return;
                }
                return;
            case 10:
                c6 c6Var = (c6) this.c;
                Context context2 = (Context) this.b;
                AtomicReference atomicReference = c6Var.a;
                x1 x1Var = new x1();
                x1Var.a = 256;
                atomicReference.set(new u8.n(new t2(context2, x1Var)));
                c6Var.a(c6Var.f);
                return;
            case 11:
                ((c6) this.b).c.a((a6) this.c);
                return;
            case 12:
                fi.p pVar = (fi.p) this.b;
                tg.r1 r1Var2 = (tg.r1) this.c;
                k6 k6Var = pVar.a;
                if (r1Var2.getWidth() <= 0) {
                    k6Var.animate().scaleX(0.0f).scaleY(1.0f).withEndAction(new s7(pVar, 27)).start();
                    return;
                }
                float width = r1Var2.getWidth() / k6Var.getWidth();
                ValueAnimator valueAnimator = pVar.x;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                pVar.x = ValueAnimator.ofFloat(0.0f, 1.0f);
                pVar.x.addUpdateListener(new j6(pVar, k6Var.getScaleX(), width, ((r1Var2.getWidth() / 2.0f) + r1Var2.getX()) - ((k6Var.getWidth() / 2.0f) + k6Var.getX()), ((r1Var2.getHeight() / 2.0f) + r1Var2.getY()) - ((k6Var.getHeight() / 2.0f) + k6Var.getY()), 0));
                pVar.x.addListener(new ah.l(i10, pVar, r1Var2));
                pVar.x.setDuration(320L);
                pVar.x.setInterpolator(xq.h);
                pVar.w = r1Var2;
                pVar.x.start();
                return;
            case 13:
                w6 w6Var = (w6) this.b;
                TLObject tLObject2 = (TLObject) this.c;
                ArrayList arrayList = w6Var.U1;
                w6Var.n2 = false;
                w6Var.m2 = false;
                if (tLObject2 instanceof TLRPC.messages_Messages) {
                    TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject2;
                    qp.s1(w6Var.a).Y3(messages_messages.users, false);
                    qp.s1(w6Var.a).S3(messages_messages.chats, false);
                    ArrayList<TLRPC.Message> arrayList2 = messages_messages.messages;
                    int size = arrayList2.size();
                    int i14 = 0;
                    while (i14 < size) {
                        TLRPC.Message message = arrayList2.get(i14);
                        i14++;
                        arrayList.add(new ij(w6Var.a, message, false, true));
                    }
                    if ((messages_messages instanceof TLRPC.TL_messages_messagesSlice) && arrayList.size() < messages_messages.count) {
                        r9 = true;
                    }
                    w6Var.l2 = r9;
                    w6Var.k2 = messages_messages.next_rate;
                } else {
                    w6Var.l2 = false;
                    w6Var.k2 = 0;
                }
                w6Var.h2.O(true);
                return;
            case 14:
                w6 w6Var2 = (w6) this.b;
                ArrayList arrayList3 = (ArrayList) this.c;
                w6Var2.C2 = false;
                w6Var2.T1.addAll(arrayList3);
                w6Var2.h2.O(true);
                return;
            case 15:
                e7 e7Var2 = (e7) this.b;
                TLObject tLObject3 = (TLObject) this.c;
                e7Var2.e1 = 0;
                if (tLObject3 instanceof Vector) {
                    e7Var2.V0 = new ArrayList();
                    Vector vector = (Vector) tLObject3;
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
                            e7Var2.V0.add(tL_inputDocument);
                        }
                    }
                    return;
                }
                return;
            case 16:
                m7 m7Var = (m7) this.b;
                TLObject tLObject4 = (TLObject) this.c;
                if (tLObject4 instanceof TL_account.webPagePreview) {
                    TL_account.webPagePreview webpagepreview = (TL_account.webPagePreview) tLObject4;
                    qp.s1(m7Var.a).Y3(webpagepreview.users, false);
                    qp.s1(m7Var.a).S3(webpagepreview.chats, false);
                    TLRPC.MessageMedia messageMedia2 = webpagepreview.media;
                    if (messageMedia2 instanceof TLRPC.TL_messageMediaWebPage) {
                        tL_messageMediaWebPage = (TLRPC.TL_messageMediaWebPage) messageMedia2;
                        if (tL_messageMediaWebPage == null) {
                            TLRPC.WebPage webPage = tL_messageMediaWebPage.webpage;
                            m7Var.Y1 = webPage;
                            if (m7.g1(webPage)) {
                                TLRPC.WebPage webPage2 = m7Var.Y1;
                                m7Var.X1 = webPage2 == null ? 0L : webPage2.id;
                                m7Var.Y1 = null;
                            } else {
                                m7Var.X1 = 0L;
                            }
                        } else {
                            m7Var.Y1 = null;
                            m7Var.X1 = 0L;
                        }
                        m7Var.Z1 = m7Var.X1 != 0;
                        o0Var = m7Var.P1;
                        if (o0Var == null) {
                            o0Var.O(true);
                            return;
                        }
                        return;
                    }
                }
                tL_messageMediaWebPage = null;
                if (tL_messageMediaWebPage == null) {
                }
                m7Var.Z1 = m7Var.X1 != 0;
                o0Var = m7Var.P1;
                if (o0Var == null) {
                }
            case 17:
                m7 m7Var2 = (m7) this.b;
                TextView textView = (TextView) this.c;
                ClipboardManager clipboardManager = (ClipboardManager) m7Var2.getContext().getSystemService("clipboard");
                i3 i3Var = m7Var2.Q1.d;
                r8 = ((TextUtils.isEmpty(i3Var.getText()) || TextUtils.equals(i3Var.getText(), "https://") || TextUtils.isEmpty(i3Var.getText().toString())) && clipboardManager != null && clipboardManager.hasPrimaryClip()) ? 1 : 0;
                org.telegram.messenger.camera.q.l(textView.animate().alpha(r8 != 0 ? 1.0f : 0.0f).scaleX(r8 != 0 ? 1.0f : 0.7f).scaleY(r8 == 0 ? 0.7f : 1.0f), xq.h, 300L);
                return;
            case 18:
                s8 s8Var = (s8) this.b;
                HashMap h02 = ((yr) this.c).h0();
                if (h02.isEmpty()) {
                    return;
                }
                g0.h3(new h(19, s8Var, h02));
                return;
            case 19:
                s8 s8Var2 = (s8) this.b;
                HashMap hashMap = (HashMap) this.c;
                if (s8Var2.G1 == null) {
                    s8Var2.G1 = new HashMap();
                }
                s8Var2.G1.putAll(hashMap);
                return;
            case 20:
                fi.d dVar2 = (fi.d) this.b;
                Runnable runnable = (Runnable) this.c;
                if (dVar2 != null) {
                    dVar2.setLoading(false);
                }
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 21:
                db dbVar = (db) this.b;
                Bitmap bitmap2 = (Bitmap) this.c;
                if (!dbVar.k || dbVar.i) {
                    return;
                }
                dbVar.d.add(new cb(dbVar, bitmap2));
                dbVar.k = false;
                dbVar.n.invalidate();
                return;
            case 22:
                int[] iArr = (int[]) this.b;
                ConnectionsManager connectionsManager = (ConnectionsManager) this.c;
                int i16 = iArr[0];
                if (i16 != 0) {
                    connectionsManager.cancelRequest(i16, true);
                    iArr[0] = 0;
                    return;
                }
                return;
            case 23:
                ((j0) this.b).h((Typeface) this.c);
                return;
            case 24:
                h2.c cVar = (h2.c) this.b;
                Object apply = ((u) this.c).apply(cVar.f);
                cVar.f = apply;
                h2.b bVar = new h2.b(cVar, apply, r8);
                i0 i0Var = (i0) cVar.c;
                if (i0Var.a.getLooper().getThread().isAlive()) {
                    i0Var.d(bVar);
                    return;
                }
                return;
            case 25:
                w wVar = (w) this.c;
                Context context3 = (Context) this.b;
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
                context3.registerReceiver(new androidx.mediarouter.app.f(wVar, i7), intentFilter);
                return;
            case 26:
                androidx.mediarouter.app.f fVar2 = (androidx.mediarouter.app.f) this.c;
                Context context4 = (Context) this.b;
                w wVar2 = (w) fVar2.b;
                ConnectivityManager connectivityManager = (ConnectivityManager) context4.getSystemService("connectivity");
                if (connectivityManager != null) {
                    try {
                        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                        if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                            int type = activeNetworkInfo.getType();
                            if (type != 0) {
                                if (type != 1) {
                                    if (type != 4 && type != 5) {
                                        if (type != 6) {
                                            i7 = type != 9 ? 8 : 7;
                                        }
                                        i7 = 5;
                                    }
                                }
                                i7 = 2;
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
                                    i7 = 4;
                                    break;
                                case 13:
                                    i7 = 5;
                                    break;
                                case 16:
                                case 19:
                                default:
                                    i7 = 6;
                                    break;
                                case 18:
                                    i7 = 2;
                                    break;
                                case 20:
                                    if (Build.VERSION.SDK_INT >= 29) {
                                        i7 = 9;
                                        break;
                                    }
                                    break;
                            }
                        } else {
                            i7 = 1;
                        }
                    } catch (SecurityException unused2) {
                    }
                    if (Build.VERSION.SDK_INT >= 31 || i7 != 5) {
                        wVar2.c(i7);
                        return;
                    } else {
                        h2.u.a(context4, wVar2);
                        return;
                    }
                }
                i7 = 0;
                if (Build.VERSION.SDK_INT >= 31) {
                }
                wVar2.c(i7);
                return;
            case 27:
                e0 e0Var = (e0) this.b;
                y yVar = (y) this.c;
                if (e0Var.a instanceof m9.a) {
                    yVar.cancel(false);
                    return;
                }
                return;
            case 28:
                p0 p0Var = (p0) this.b;
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.c;
                wf.b bVar2 = (wf.b) p0Var.d;
                bVar2.getClass();
                if (atomicBoolean.get()) {
                    new Thread(new h(i11, bVar2, atomicBoolean), "ExoPlayer:WakeLockManager").start();
                    return;
                }
                return;
            default:
                wf.b bVar3 = (wf.b) this.b;
                AtomicBoolean atomicBoolean2 = (AtomicBoolean) this.c;
                synchronized (bVar3) {
                    if (atomicBoolean2.get() && (wakeLock = (PowerManager.WakeLock) bVar3.c) != null) {
                        wakeLock.release();
                    }
                }
                return;
        }
    }

    public /* synthetic */ h(int i7, Object obj, Object obj2) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
    }
}
