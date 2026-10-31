package ag;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.widget.ImageView;
import androidx.car.app.IOnDoneCallback;
import java.io.File;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.b8;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.camera.CameraSession;
import org.telegram.messenger.f8;
import org.telegram.messenger.gq;
import org.telegram.messenger.hs;
import org.telegram.messenger.ir;
import org.telegram.messenger.jj;
import org.telegram.messenger.o5;
import org.telegram.messenger.q20;
import org.telegram.messenger.ui;
import org.telegram.messenger.us;
import org.telegram.messenger.video.VideoAds;
import org.telegram.messenger.zs;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestTimeDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.o6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.ActionBar.s6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.ActionBar.z4;
import org.telegram.ui.Components.fr;
import org.telegram.ui.Components.g90;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.z60;
import org.telegram.ui.h8;
import org.telegram.ui.n6;
import org.telegram.ui.oa;
import org.telegram.ui.p6;
import org.telegram.ui.pa;
import org.telegram.ui.q6;
import org.telegram.ui.un;
import org.telegram.ui.wo0;
import v7.p8;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class q0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ q0(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    private final void a() {
        xa.n nVar = (xa.n) this.b;
        AtomicBoolean atomicBoolean = (AtomicBoolean) this.c;
        m4.i iVar = (m4.i) this.d;
        AtomicBoolean atomicBoolean2 = (AtomicBoolean) this.e;
        synchronized (nVar.a) {
            try {
                if (atomicBoolean.get()) {
                    atomicBoolean2.set(true);
                } else {
                    nVar.t(iVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0176, code lost:
    
        if (r6.equals("android.media.metadata.WRITER") == false) goto L74;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x010d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void b() {
        Bitmap bitmap;
        Bundle bundle;
        e9.n0 n0Var;
        Bundle bundle2;
        boolean z10;
        boolean z11;
        ArrayList arrayList;
        ArrayList arrayList2;
        Bundle bundle3;
        CharSequence charSequence;
        CharSequence charSequence2;
        m4.n0 n0Var2 = (m4.n0) this.b;
        AtomicInteger atomicInteger = (AtomicInteger) this.c;
        ArrayList arrayList3 = (ArrayList) this.d;
        if (atomicInteger.incrementAndGet() == arrayList3.size()) {
            ArrayList arrayList4 = new ArrayList();
            int i10 = 0;
            for (ArrayList arrayList5 = (ArrayList) this.e; i10 < arrayList5.size(); arrayList5 = arrayList2) {
                j9.y yVar = (j9.y) arrayList5.get(i10);
                if (yVar != null) {
                    try {
                        bitmap = (Bitmap) p8.a(yVar);
                    } catch (CancellationException | ExecutionException e) {
                        synchronized (e2.a.b) {
                            Log.d("MediaSessionLegacyStub", e2.a.a("Failed to get bitmap", e));
                        }
                    }
                    b2.p0 p0Var = (b2.p0) arrayList3.get(i10);
                    int i11 = m4.o.a;
                    String str = !p0Var.a.equals("") ? null : p0Var.a;
                    b2.s0 s0Var = p0Var.d;
                    Bitmap bitmap2 = bitmap == null ? bitmap : null;
                    bundle = s0Var.J;
                    CharSequence charSequence3 = s0Var.a;
                    CharSequence charSequence4 = s0Var.g;
                    CharSequence charSequence5 = s0Var.f;
                    n0Var = s0Var.K;
                    Integer num = s0Var.I;
                    Integer num2 = s0Var.q;
                    if (bundle != null) {
                        bundle = new Bundle(bundle);
                    }
                    bundle2 = bundle;
                    z10 = num2 == null && num2.intValue() != -1;
                    z11 = num == null;
                    if (!z10 || z11) {
                        if (bundle2 == null) {
                            bundle2 = new Bundle();
                        }
                        Bundle bundle4 = bundle2;
                        if (z10) {
                            arrayList = arrayList3;
                            arrayList2 = arrayList5;
                        } else {
                            num2.getClass();
                            arrayList = arrayList3;
                            arrayList2 = arrayList5;
                            bundle4.putLong("android.media.extra.BT_FOLDER_TYPE", m4.o.a(num2.intValue()));
                        }
                        if (z11) {
                            num.getClass();
                            bundle4.putLong("androidx.media3.session.EXTRAS_KEY_MEDIA_TYPE_COMPAT", num.intValue());
                        }
                        bundle3 = bundle4;
                    } else {
                        arrayList = arrayList3;
                        arrayList2 = arrayList5;
                        bundle3 = bundle2;
                    }
                    if (!n0Var.isEmpty()) {
                        if (bundle3 == null) {
                            bundle3 = new Bundle();
                        }
                        bundle3.putStringArrayList("androidx.media.utils.extras.CUSTOM_BROWSER_ACTION_ID_LIST", new ArrayList<>(n0Var));
                    }
                    charSequence = s0Var.e;
                    if (charSequence == null) {
                        if (bundle3 == null) {
                            bundle3 = new Bundle();
                        }
                        bundle3.putCharSequence("androidx.media3.mediadescriptioncompat.title", charSequence3);
                    } else {
                        int i12 = 3;
                        CharSequence[] charSequenceArr = new CharSequence[3];
                        int i13 = 0;
                        int i14 = 0;
                        while (true) {
                            char c10 = 2;
                            if (i13 < i12) {
                                String[] strArr = n4.i.d;
                                if (i14 < strArr.length) {
                                    int i15 = i14 + 1;
                                    String str2 = strArr[i14];
                                    str2.getClass();
                                    switch (str2.hashCode()) {
                                        case -1853648227:
                                            if (str2.equals("android.media.metadata.ARTIST")) {
                                                c10 = 0;
                                                break;
                                            }
                                            c10 = 65535;
                                            break;
                                        case -1850878751:
                                            if (str2.equals("android.media.metadata.AUTHOR")) {
                                                c10 = 1;
                                                break;
                                            }
                                            c10 = 65535;
                                            break;
                                        case -1224124471:
                                            break;
                                        case 194702059:
                                            if (str2.equals("android.media.metadata.DISPLAY_SUBTITLE")) {
                                                c10 = 3;
                                                break;
                                            }
                                            c10 = 65535;
                                            break;
                                        case 1058837545:
                                            if (str2.equals("android.media.metadata.DISPLAY_DESCRIPTION")) {
                                                c10 = 4;
                                                break;
                                            }
                                            c10 = 65535;
                                            break;
                                        case 1684534006:
                                            if (str2.equals("android.media.metadata.COMPOSER")) {
                                                c10 = 5;
                                                break;
                                            }
                                            c10 = 65535;
                                            break;
                                        case 1879671865:
                                            if (str2.equals("android.media.metadata.ALBUM")) {
                                                c10 = 6;
                                                break;
                                            }
                                            c10 = 65535;
                                            break;
                                        case 1897146402:
                                            if (str2.equals("android.media.metadata.TITLE")) {
                                                c10 = 7;
                                                break;
                                            }
                                            c10 = 65535;
                                            break;
                                        case 1965214221:
                                            if (str2.equals("android.media.metadata.ALBUM_ARTIST")) {
                                                c10 = '\b';
                                                break;
                                            }
                                            c10 = 65535;
                                            break;
                                        default:
                                            c10 = 65535;
                                            break;
                                    }
                                    switch (c10) {
                                        case 0:
                                            charSequence2 = s0Var.b;
                                            break;
                                        case 1:
                                        default:
                                            charSequence2 = null;
                                            break;
                                        case 2:
                                            charSequence2 = s0Var.A;
                                            break;
                                        case 3:
                                            charSequence2 = charSequence5;
                                            break;
                                        case 4:
                                            charSequence2 = charSequence4;
                                            break;
                                        case 5:
                                            charSequence2 = s0Var.B;
                                            break;
                                        case 6:
                                            charSequence2 = s0Var.c;
                                            break;
                                        case 7:
                                            charSequence2 = charSequence3;
                                            break;
                                        case '\b':
                                            charSequence2 = s0Var.d;
                                            break;
                                    }
                                    if (!TextUtils.isEmpty(charSequence2)) {
                                        charSequenceArr[i13] = charSequence2;
                                        i13++;
                                    }
                                    i14 = i15;
                                    i12 = 3;
                                }
                            }
                        }
                        charSequence = charSequenceArr[0];
                        charSequence5 = charSequenceArr[1];
                        charSequence4 = charSequenceArr[2];
                    }
                    arrayList4.add(new n4.o(new n4.h(str, charSequence, charSequence5, charSequence4, bitmap2, s0Var.n, bundle3, p0Var.f.a), i10 != -1 ? -1L : i10));
                    i10++;
                    arrayList3 = arrayList;
                }
                bitmap = null;
                b2.p0 p0Var2 = (b2.p0) arrayList3.get(i10);
                int i112 = m4.o.a;
                if (!p0Var2.a.equals("")) {
                }
                b2.s0 s0Var2 = p0Var2.d;
                if (bitmap == null) {
                }
                bundle = s0Var2.J;
                CharSequence charSequence32 = s0Var2.a;
                CharSequence charSequence42 = s0Var2.g;
                CharSequence charSequence52 = s0Var2.f;
                n0Var = s0Var2.K;
                Integer num3 = s0Var2.I;
                Integer num22 = s0Var2.q;
                if (bundle != null) {
                }
                bundle2 = bundle;
                if (num22 == null) {
                }
                if (num3 == null) {
                }
                if (z10) {
                }
                if (bundle2 == null) {
                }
                Bundle bundle42 = bundle2;
                if (z10) {
                }
                if (z11) {
                }
                bundle3 = bundle42;
                if (!n0Var.isEmpty()) {
                }
                charSequence = s0Var2.e;
                if (charSequence == null) {
                }
                arrayList4.add(new n4.o(new n4.h(str, charSequence, charSequence52, charSequence42, bitmap2, s0Var2.n, bundle3, p0Var2.f.a), i10 != -1 ? -1L : i10));
                i10++;
                arrayList3 = arrayList;
            }
            m4.p0.e0(((m4.p0) n0Var2.e).n, arrayList4);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:269:0x06da, code lost:
    
        if (r5 == null) goto L251;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:103:? A[RETURN, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int a2;
        int i10;
        boolean z10;
        TLRPC.WallPaperSettings wallPaperSettings;
        TLRPC.TL_webPage tL_webPage;
        int i11 = 4;
        int i12 = 2;
        SQLiteCursor sQLiteCursor = null;
        Throwable th2 = null;
        r5 = null;
        TLRPC.User user = null;
        sQLiteCursor = null;
        int i13 = 0;
        switch (this.a) {
            case 0:
                s0 s0Var = (s0) this.b;
                TLObject tLObject = (TLObject) this.c;
                TL_account.TL_businessChatLink tL_businessChatLink = (TL_account.TL_businessChatLink) this.d;
                Runnable runnable = (Runnable) this.e;
                ArrayList arrayList = s0Var.b;
                if (tLObject instanceof TL_account.TL_businessChatLink) {
                    TL_account.TL_businessChatLink tL_businessChatLink2 = (TL_account.TL_businessChatLink) tLObject;
                    int indexOf = arrayList.indexOf(tL_businessChatLink);
                    if (indexOf != -1) {
                        arrayList.set(indexOf, tL_businessChatLink2);
                        zs.f(s0Var.a).k(zs.J1, new Object[0]);
                        if (runnable != null) {
                            runnable.run();
                        }
                        s0Var.f();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                i3 i3Var = (i3) this.b;
                hs hsVar = (hs) this.c;
                h3 h3Var = (h3) this.d;
                TLRPC.TL_messages_sendQuickReplyMessages tL_messages_sendQuickReplyMessages = (TLRPC.TL_messages_sendQuickReplyMessages) this.e;
                ArrayList arrayList2 = new ArrayList();
                try {
                    try {
                        sQLiteCursor = hsVar.b.queryFinalized("SELECT id FROM quick_replies_messages WHERE topic_id = ?", Integer.valueOf(h3Var.a));
                        while (sQLiteCursor.next()) {
                            arrayList2.add(Integer.valueOf(sQLiteCursor.intValue(0)));
                        }
                    } catch (Exception e) {
                        f8.g(e, true);
                        break;
                    }
                    sQLiteCursor.dispose();
                    org.telegram.messenger.i0.g3(new q0(i3Var, arrayList2, h3Var, tL_messages_sendQuickReplyMessages, 2));
                    return;
                } catch (Throwable th3) {
                    if (sQLiteCursor != null) {
                        sQLiteCursor.dispose();
                    }
                    throw th3;
                }
            case 2:
                i3 i3Var2 = (i3) this.b;
                ArrayList<Integer> arrayList3 = (ArrayList) this.c;
                h3 h3Var2 = (h3) this.d;
                TLRPC.TL_messages_sendQuickReplyMessages tL_messages_sendQuickReplyMessages2 = (TLRPC.TL_messages_sendQuickReplyMessages) this.e;
                int i14 = i3Var2.a;
                if (arrayList3.isEmpty() || arrayList3.size() < h3Var2.a()) {
                    TLRPC.TL_messages_getQuickReplyMessages tL_messages_getQuickReplyMessages = new TLRPC.TL_messages_getQuickReplyMessages();
                    tL_messages_getQuickReplyMessages.shortcut_id = h3Var2.a;
                    ConnectionsManager.getInstance(i14).sendRequest(tL_messages_getQuickReplyMessages, new p0(i3Var2, arrayList3, tL_messages_sendQuickReplyMessages2, i12));
                    return;
                } else {
                    tL_messages_sendQuickReplyMessages2.id = arrayList3;
                    while (i13 < arrayList3.size()) {
                        tL_messages_sendQuickReplyMessages2.random_id.add(Long.valueOf(Utilities.b.nextLong()));
                        i13++;
                    }
                    ConnectionsManager.getInstance(i14).sendRequest(tL_messages_sendQuickReplyMessages2, null);
                    return;
                }
            case 3:
                androidx.lifecycle.o oVar = (androidx.lifecycle.o) this.b;
                IOnDoneCallback iOnDoneCallback = (IOnDoneCallback) this.c;
                String str = (String) this.d;
                androidx.car.app.utils.b bVar = (androidx.car.app.utils.b) this.e;
                if (oVar != null && ((androidx.lifecycle.v) oVar).c.compareTo(androidx.lifecycle.n.c) >= 0) {
                    androidx.car.app.utils.h.b(iOnDoneCallback, str, bVar);
                    return;
                }
                androidx.car.app.utils.h.f(iOnDoneCallback, str, new IllegalStateException("Lifecycle is not at least created when dispatching " + bVar));
                return;
            case 4:
                bi.t tVar = (bi.t) this.b;
                bi.a aVar = (bi.a) this.c;
                TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) this.d;
                z60 z60Var = (z60) this.e;
                tVar.r.Y4(aVar, pageBlock);
                z60Var.u();
                return;
            case 5:
                jg.v2 v2Var = (jg.v2) this.b;
                ArrayList arrayList4 = (ArrayList) this.c;
                wo0 wo0Var = (wo0) this.d;
                jg.s2 s2Var = (jg.s2) this.e;
                v2Var.G = true;
                v2Var.H = (jg.s2[]) arrayList4.toArray(new jg.s2[0]);
                wo0Var.a(s2Var);
                return;
            case 6:
                jg.v2 v2Var2 = (jg.v2) this.b;
                TLObject tLObject2 = (TLObject) this.c;
                jg.t2 t2Var = (jg.t2) this.d;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.e;
                if (!(tLObject2 instanceof TLRPC.TL_messageMediaDocument)) {
                    v2Var2.h();
                    v2Var2.n(tL_error);
                    return;
                }
                v2Var2.getClass();
                TLRPC.TL_messageMediaDocument tL_messageMediaDocument = (TLRPC.TL_messageMediaDocument) tLObject2;
                t2Var.e = ui.a0(tL_messageMediaDocument.document, t2Var.c);
                t2Var.f = tL_messageMediaDocument;
                v2Var2.a();
                return;
            case 7:
                ji.f fVar = (ji.f) this.b;
                ((ArrayDeque) fVar.b).addLast(new ji.e((mg.l) this.c, (ji.b) this.d, (RequestTimeDelegate) this.e));
                fVar.q();
                return;
            case 8:
                li.v vVar = (li.v) this.b;
                li.q0 q0Var = (li.q0) this.c;
                li.q0 q0Var2 = (li.q0) this.d;
                Handler handler = (Handler) this.e;
                if (vVar.r0 && vVar.W == 0 && vVar.T) {
                    vVar.N.g(vVar.L, vVar.D, false);
                    vVar.U = false;
                    vVar.V = false;
                    vVar.c0 = 0.0f;
                    vVar.W = 1;
                    long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
                    vVar.X = elapsedRealtimeNanos;
                    vVar.Y = elapsedRealtimeNanos;
                    vVar.d0 = q0Var;
                    vVar.e0 = q0Var2;
                    String[] strArr = li.y0.a;
                    synchronized (li.y0.class) {
                        li.y0.b();
                        if (q0Var == q0Var2) {
                            throw new IllegalArgumentException("Camera switch direction must change");
                        }
                        a2 = li.y0.a(q0Var == li.q0.b ? 0 : 1);
                    }
                    vVar.b0 = a2;
                    vVar.Z = ((Math.max(zs.n3, Math.min(zs.X4, 300 - ((Math.max(0, a2 - 400) * 3) / 20))) * 45) / 100) * 1000000;
                    vVar.a0 = (r5 - r6) * 1000000;
                    vVar.i.b("synthetic camera switch started: from=" + q0Var + ", to=" + q0Var2 + ", expectedWaitMs=" + vVar.b0 + ", targetBlurRadiusPx=" + (((vVar.N.a * 4.0f) / 48.0f) * 1.15f) + ", overdueBlurGrowth=0.35, revealMs=" + ((vVar.Z + vVar.a0) / 1000000));
                    vVar.Q = -1L;
                    handler.removeCallbacks(vVar.x0);
                    handler.post(vVar.x0);
                    return;
                }
                return;
            case 9:
                a();
                return;
            case 10:
                b();
                return;
            case 11:
                m4.j1 j1Var = (m4.j1) this.b;
                m4.w wVar = (m4.w) this.c;
                m4.f0 f0Var = (m4.f0) this.d;
                m4.m mVar = (m4.m) this.e;
                xa.n nVar = j1Var.b;
                try {
                    j1Var.c.remove(wVar);
                    if (!f0Var.j()) {
                        m4.e1 e1Var = (m4.e1) wVar.d;
                        e1Var.getClass();
                        IBinder asBinder = e1Var.a.asBinder();
                        m4.u m10 = f0Var.m(wVar);
                        if (nVar.L(wVar)) {
                            e2.a.l("MediaSessionStub", "Controller " + wVar + " has sent connection request multiple times");
                        }
                        nVar.f(asBinder, wVar, m10.a, m10.b);
                        com.google.android.gms.common.api.internal.v G = nVar.G(wVar);
                        if (G == null) {
                            e2.a.l("MediaSessionStub", "Ignoring connection request from unknown controller info");
                        } else {
                            m4.n1 n1Var = f0Var.t;
                            m4.l1 l1Var = f0Var.s;
                            b2.b1 b1Var = m10.b;
                            m4.l1 a12 = j1Var.a1(l1Var);
                            MediaSession.Token token = ((n4.l) f0Var.h.n.a).c.b;
                            e9.n0 n0Var = m10.c;
                            if (n0Var == null) {
                                n0Var = f0Var.y;
                            }
                            e9.n0 n0Var2 = m10.d;
                            if (n0Var2 == null) {
                                n0Var2 = f0Var.z;
                            }
                            e9.n0 n0Var3 = f0Var.r;
                            m4.q1 q1Var = m10.a;
                            b2.b1 s10 = n1Var.s();
                            m4.v1 v1Var = f0Var.j.a;
                            v1Var.getClass();
                            m4.k kVar = new m4.k(j1Var, n0Var, n0Var2, n0Var3, q1Var, b1Var, s10, new Bundle(v1Var.g), f0Var.A, a12, token);
                            if (!f0Var.j()) {
                                try {
                                    ((m4.l) mVar).H0(G.e(), kVar.a(wVar.c));
                                    i10 = 1;
                                } catch (RemoteException unused) {
                                    i10 = 0;
                                }
                                if (i10 != 0) {
                                    try {
                                        if (!f0Var.x || !m4.f0.k(wVar)) {
                                            f0Var.e.getClass();
                                        }
                                    } catch (Throwable th4) {
                                        th = th4;
                                        i13 = i10;
                                        if (i13 == 0) {
                                            w7.z.a(mVar);
                                        }
                                        throw th;
                                    }
                                }
                                if (i10 != 0) {
                                    return;
                                }
                            }
                        }
                    }
                    w7.z.a(mVar);
                    return;
                } catch (Throwable th5) {
                    th = th5;
                }
                break;
            case 12:
                m4.f0 f0Var2 = (m4.f0) this.b;
                j9.e0 e0Var = (j9.e0) this.c;
                e2.j jVar = (e2.j) this.d;
                j9.y yVar = (j9.y) this.e;
                if (f0Var2.j()) {
                    e0Var.m(null);
                    return;
                }
                try {
                    jVar.accept(yVar);
                    e0Var.m(null);
                    return;
                } catch (Throwable th6) {
                    e0Var.n(th6);
                    return;
                }
            case 13:
                m4.f0 f0Var3 = (m4.f0) this.b;
                m4.g1 g1Var = (m4.g1) this.c;
                m4.w wVar2 = (m4.w) this.d;
                List list = (List) this.e;
                if (f0Var3.j()) {
                    return;
                }
                g1Var.a(f0Var3.t, wVar2, list);
                return;
            case 14:
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.b;
                q20 q20Var = (q20) this.d;
                TLObject tLObject3 = (TLObject) this.c;
                q20 q20Var2 = (q20) this.e;
                if (tL_error2 != null) {
                    q20Var.a(tL_error2);
                    return;
                } else {
                    if (tLObject3 instanceof TLRPC.payments_GiveawayInfo) {
                        q20Var2.a((TLRPC.payments_GiveawayInfo) tLObject3);
                        return;
                    }
                    return;
                }
            case 15:
                CameraController.lambda$openRound$9((CameraSession) this.b, (Runnable) this.e, (SurfaceTexture) this.c, (Runnable) this.d);
                return;
            case 16:
                CameraController.lambda$close$5((Runnable) this.e, (CameraSession) this.b, (CountDownLatch) this.c, (Runnable) this.d);
                return;
            case 17:
                ((VideoAds) this.b).lambda$show$14((Context) this.c, (TLRPC.TL_sponsoredMessage) this.d, (z60) this.e);
                return;
            case 18:
                TLObject tLObject4 = (TLObject) this.c;
                r6 r6Var = (r6) this.b;
                s6 s6Var = (s6) this.d;
                TLRPC.TL_theme tL_theme = (TLRPC.TL_theme) this.e;
                t6.A--;
                if (tLObject4 instanceof TLRPC.TL_theme) {
                    TLRPC.TL_theme tL_theme2 = (TLRPC.TL_theme) tLObject4;
                    TLRPC.ThemeSettings themeSettings = tL_theme2.settings.size() > 0 ? tL_theme2.settings.get(0) : null;
                    if (r6Var == null || themeSettings == null) {
                        TLRPC.Document document = tL_theme2.document;
                        if (document != null && document.id != tL_theme.document.id) {
                            if (r6Var != null) {
                                r6Var.r = tL_theme2;
                            } else {
                                s6Var.F = tL_theme2;
                                s6Var.G = false;
                                s6Var.g0 = null;
                                s6Var.h0 = null;
                                zs.f(s6Var.E).b(s6Var, zs.Y1);
                                zs.f(s6Var.E).b(s6Var, zs.Z1);
                                b8 G2 = b8.G(s6Var.E);
                                TLRPC.TL_theme tL_theme3 = s6Var.F;
                                G2.X(tL_theme3.document, tL_theme3, 1, 1);
                            }
                        }
                    } else {
                        if (s6.a(r6Var, themeSettings)) {
                            z10 = false;
                        } else {
                            File e7 = r6Var.e();
                            if (e7 != null) {
                                e7.delete();
                            }
                            s6.i(r6Var, themeSettings);
                            s6 s6Var2 = t6.I;
                            if (s6Var2 == s6Var && s6Var2.Y == r6Var.a) {
                                t6.t1(false, false);
                                t6.K(org.telegram.messenger.w0.b, false);
                                s6 s6Var3 = t6.I;
                                t6.K1(s6Var3, t6.J == s6Var3, -1, null);
                            }
                            o6.a(true);
                            z10 = true;
                        }
                        TLRPC.WallPaper wallPaper = themeSettings.wallpaper;
                        r6Var.q = (wallPaper == null || (wallPaperSettings = wallPaper.settings) == null || !wallPaperSettings.motion) ? false : true;
                        r6 = z10;
                    }
                    if (t6.A != 0) {
                        t6.B = (int) (System.currentTimeMillis() / 1000);
                        t6.y1(r6, false);
                        return;
                    }
                    return;
                }
                r6 = false;
                if (t6.A != 0) {
                }
                break;
            case 19:
                ((jg.o2) this.b).a(t6.T0((File) this.c, (String) this.d, (String[]) this.e));
                return;
            case 20:
                q6 q6Var = (q6) this.b;
                fg.i iVar = (fg.i) this.c;
                float[] fArr = (float[]) this.d;
                boolean[] zArr = (boolean[]) this.e;
                q6Var.getClass();
                iVar.d(fArr[0]);
                if (zArr[0]) {
                    q6Var.d.z0(true);
                    return;
                }
                return;
            case 21:
                q6 q6Var2 = (q6) this.b;
                boolean[] zArr2 = (boolean[]) this.c;
                long[] jArr = (long[]) this.d;
                p6 p6Var = (p6) this.e;
                if (zArr2[0]) {
                    return;
                }
                jArr[0] = System.currentTimeMillis();
                q6Var2.d.showDialog(p6Var);
                return;
            case 22:
                h8.Y((h8) this.b, (TLRPC.TL_error) this.d, (TLObject) this.c, (Calendar) this.e);
                return;
            case 23:
                oa.Y((oa) this.b, (org.telegram.ui.ActionBar.x1) this.c, (TLRPC.TL_error) this.d, (TL_account.updateUsername) this.e);
                return;
            case 24:
                un unVar = (un) this.b;
                org.telegram.ui.ActionBar.k2 k2Var = (org.telegram.ui.ActionBar.k2) this.c;
                jj jjVar = (jj) this.d;
                z4 z4Var = (z4) this.e;
                if (k2Var instanceof us) {
                    unVar.getNotificationCenter().n((us) k2Var, 4);
                }
                unVar.getNotificationCenter().k(4, new Object[0]);
                Bundle bundle = new Bundle();
                bundle.putLong("chat_id", jjVar.k.action.channel_id);
                ((ActionBarLayout) z4Var).c(z4Var.getFragmentStack().size() - 1, new un(bundle));
                k2Var.finishFragment();
                return;
            case 25:
                un unVar2 = (un) this.b;
                gf.e eVar = (gf.e) this.d;
                TLObject tLObject5 = (TLObject) this.c;
                pa paVar = (pa) this.e;
                eVar.b();
                if (tLObject5 instanceof TLRPC.TL_contacts_resolvedPeer) {
                    TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject5;
                    unVar2.getMessagesController().V3(tL_contacts_resolvedPeer.users, false);
                    unVar2.getMessagesController().P3(tL_contacts_resolvedPeer.chats, false);
                    long o10 = o5.o(tL_contacts_resolvedPeer.peer);
                    if (o10 >= 0) {
                        user = unVar2.getMessagesController().Z1(Long.valueOf(o10));
                    }
                }
                paVar.a(user);
                return;
            case 26:
                long[] jArr2 = (long[]) this.b;
                boolean[] zArr3 = (boolean[]) this.c;
                ImageView imageView = (ImageView) this.d;
                ImageView imageView2 = (ImageView) this.e;
                jArr2[0] = SystemClock.elapsedRealtime();
                if (!zArr3[0]) {
                    imageView = imageView2;
                }
                fr frVar = (fr) imageView.getDrawable();
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new org.telegram.ui.a3(frVar, i11));
                ofFloat.setDuration(150L);
                ofFloat.setInterpolator(gr.f);
                ofFloat.start();
                return;
            case 27:
                un unVar3 = (un) this.b;
                jj jjVar2 = (jj) this.c;
                org.telegram.ui.ActionBar.x1 x1Var = (org.telegram.ui.ActionBar.x1) this.d;
                boolean[] zArr4 = (boolean[]) this.e;
                try {
                    tL_webPage = g90.g(jjVar2);
                } catch (Throwable th7) {
                    f8.g(th7, true);
                    tL_webPage = null;
                    th2 = th7;
                }
                org.telegram.messenger.i0.g3(new i2.h1(unVar3, x1Var, zArr4, th2 == null && tL_webPage != null, jjVar2, tL_webPage, 4));
                return;
            case 28:
                un unVar4 = (un) this.b;
                TLObject tLObject6 = (TLObject) this.c;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.d;
                hs hsVar2 = (hs) this.e;
                TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject6;
                if (tL_error3 == null && !messages_messages.messages.isEmpty()) {
                    int i15 = messages_messages.messages.get(0).id;
                    jj jjVar3 = (jj) unVar4.E6[0].get(i15);
                    hsVar2.a.c(new gq(hsVar2, i15, unVar4.j6, 4));
                    if (jjVar3 != null) {
                        TLRPC.Message message = jjVar3.k;
                        message.media_unread = true;
                        message.mentioned = true;
                    }
                    unVar4.k(i15, 0, false, 0, true, 0);
                    return;
                }
                if (messages_messages != null) {
                    unVar4.B6 = messages_messages.count;
                } else {
                    unVar4.B6 = 0;
                }
                hsVar2.a.c(new ir(hsVar2, unVar4.b(), unVar4.j6, unVar4.B6, 7));
                int i16 = unVar4.B6;
                if (i16 == 0) {
                    unVar4.C6 = true;
                    unVar4.dc(false);
                    return;
                } else {
                    unVar4.x1.c(2, i16, true);
                    unVar4.X9();
                    return;
                }
            default:
                un.V0((un) this.b, (TLRPC.TL_messageMediaWebPage) this.c, (TLRPC.TL_webPageAttributeStory) this.d, (n6) this.e);
                return;
        }
    }

    public /* synthetic */ q0(Object obj, Object obj2, TLObject tLObject, Object obj3, int i10) {
        this.a = i10;
        this.b = obj;
        this.d = obj2;
        this.c = tLObject;
        this.e = obj3;
    }

    public /* synthetic */ q0(Runnable runnable, CameraSession cameraSession, CountDownLatch countDownLatch, Runnable runnable2) {
        this.a = 16;
        this.e = runnable;
        this.b = cameraSession;
        this.c = countDownLatch;
        this.d = runnable2;
    }

    public /* synthetic */ q0(CameraSession cameraSession, Runnable runnable, SurfaceTexture surfaceTexture, Runnable runnable2) {
        this.a = 15;
        this.b = cameraSession;
        this.e = runnable;
        this.c = surfaceTexture;
        this.d = runnable2;
    }

    public /* synthetic */ q0(TLObject tLObject, r6 r6Var, s6 s6Var, TLRPC.TL_theme tL_theme) {
        this.a = 18;
        this.c = tLObject;
        this.b = r6Var;
        this.d = s6Var;
        this.e = tL_theme;
    }
}
