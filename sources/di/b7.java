package di;

import android.animation.ValueAnimator;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.text.TextUtils;
import android.widget.TextView;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.messenger.wl;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.Components.pr;
import org.telegram.ui.co;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes4.dex */
public final /* synthetic */ class b7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ b7(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x019a A[LOOP:0: B:2:0x000e->B:33:0x019a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0196 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void a() {
        fg.k kVar = (fg.k) this.b;
        byte[] bArr = (byte[]) this.c;
        int i10 = 0;
        int i11 = 0;
        while (i11 < bArr.length) {
            if (bArr.length - i11 < 8) {
                kVar.f();
                return;
            }
            int i12 = bArr[i11] & 255;
            int i13 = ((bArr[i11 + 1] & 255) << 16) | ((bArr[i11 + 2] & 255) << 8) | (bArr[i11 + 3] & 255);
            long j3 = ((bArr[i11 + 4] & 255) << 24) | ((bArr[i11 + 5] & 255) << 16) | ((bArr[i11 + 6] & 255) << 8) | (255 & bArr[i11 + 7]);
            int i14 = i11 + 8;
            long j10 = i14 + j3;
            if (j3 > 1048576 || j10 > bArr.length) {
                kVar.f();
                return;
            }
            int i15 = (int) j3;
            byte[] bArr2 = new byte[i15];
            System.arraycopy(bArr, i14, bArr2, i10, i15);
            boolean z10 = true;
            if (i13 != 0) {
                synchronized (kVar.a) {
                    try {
                        fg.j jVar = (fg.j) kVar.k.get(Integer.valueOf(i13));
                        if (jVar == null) {
                            if (i12 != 2 && i12 != 4 && i12 != 3) {
                                z10 = false;
                            }
                        } else if (i12 == 2) {
                            if (i15 != 0) {
                                synchronized (kVar.a) {
                                    try {
                                        long j11 = jVar.d;
                                        long j12 = i15;
                                        if (j11 >= j12) {
                                            jVar.d = j11 - j12;
                                            try {
                                                jVar.b.getOutputStream().write(bArr2);
                                                synchronized (kVar.a) {
                                                    try {
                                                        if (kVar.k.get(Integer.valueOf(jVar.a)) == jVar) {
                                                            jVar.d += j12;
                                                            kVar.j(4, jVar.a, ByteBuffer.allocate(4).putInt(i15).array());
                                                        }
                                                    } catch (Throwable th2) {
                                                        throw th2;
                                                    }
                                                }
                                            } catch (Exception unused) {
                                                kVar.c(jVar, true);
                                            }
                                        }
                                    } finally {
                                    }
                                }
                            }
                        } else if (i12 == 4 && i15 == 4) {
                            long j13 = ByteBuffer.wrap(bArr2).getInt() & 4294967295L;
                            if (j13 != 0) {
                                synchronized (kVar.a) {
                                    try {
                                        long j14 = jVar.c;
                                        if (j14 <= 4294967295L - j13) {
                                            jVar.c = j14 + j13;
                                            kVar.a.notifyAll();
                                            z10 = true;
                                        }
                                    } finally {
                                    }
                                }
                            }
                        } else {
                            if (i12 == 3 && i15 == 0) {
                                kVar.c(jVar, false);
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (!z10) {
                            }
                        }
                    } finally {
                    }
                }
                if (!z10) {
                }
            } else if (i12 == 17 && i15 == 0) {
                synchronized (kVar.a) {
                    try {
                        if (!kVar.p && !kVar.o) {
                            kVar.o = true;
                            ArrayList arrayList = new ArrayList(kVar.k.values());
                            int size = arrayList.size();
                            int i16 = 0;
                            while (i16 < size) {
                                Object obj = arrayList.get(i16);
                                i16++;
                                fg.j jVar2 = (fg.j) obj;
                                jVar2.e = true;
                                kVar.j(1, jVar2.a, null);
                            }
                            fg.d dVar = kVar.s;
                            kVar.a.notifyAll();
                            if (dVar != null) {
                                AndroidUtilities.runOnUIThread(new nb(dVar, 9));
                            }
                        }
                    } finally {
                    }
                }
                if (!z10) {
                }
            } else if (i12 == 5 && i15 <= 64) {
                kVar.j(6, i10, bArr2);
                if (!z10) {
                    kVar.f();
                    return;
                } else {
                    i11 = (int) j10;
                    i10 = 0;
                }
            }
            z10 = false;
            if (!z10) {
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:95:?, code lost:
    
        return;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        TL_bots.BotInfo botInfo;
        TL_bots.botAppSettings botappsettings;
        int i10 = 4;
        int i11 = 2;
        switch (this.a) {
            case 0:
                aa.a aVar = (aa.a) this.b;
                o8 o8Var = (o8) this.c;
                d7 d7Var = (d7) aVar.d;
                Bitmap bitmap = d7Var.a;
                if (bitmap != null) {
                    bitmap.recycle();
                    if (o8Var.M0 == d7Var.a) {
                        o8Var.M0 = null;
                    }
                    d7Var.a = null;
                    d7Var.invalidate();
                    return;
                }
                return;
            case 1:
                h7 h7Var = (h7) this.b;
                Context context = (Context) this.c;
                AtomicReference atomicReference = h7Var.a;
                com.google.android.gms.internal.vision.x1 x1Var = new com.google.android.gms.internal.vision.x1();
                x1Var.a = 256;
                atomicReference.set(new r8.n(new com.google.android.gms.internal.vision.u2(context, x1Var)));
                h7Var.a(h7Var.f);
                return;
            case 2:
                ((h7) this.b).c.run((f7) this.c);
                return;
            case 3:
                p pVar = (p) this.b;
                rg.d2 d2Var = (rg.d2) this.c;
                p7 p7Var = pVar.a;
                if (d2Var.getWidth() <= 0) {
                    p7Var.animate().scaleX(0.0f).scaleY(1.0f).withEndAction(new bi.oa(pVar, 26)).start();
                    return;
                }
                float width = d2Var.getWidth() / p7Var.getWidth();
                ValueAnimator valueAnimator = pVar.w;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                pVar.w = ValueAnimator.ofFloat(0.0f, 1.0f);
                pVar.w.addUpdateListener(new o7(pVar, p7Var.getScaleX(), width, ((d2Var.getWidth() / 2.0f) + d2Var.getX()) - ((p7Var.getWidth() / 2.0f) + p7Var.getX()), ((d2Var.getHeight() / 2.0f) + d2Var.getY()) - ((p7Var.getHeight() / 2.0f) + p7Var.getY()), 0));
                pVar.w.addListener(new bi.t(i10, pVar, d2Var));
                pVar.w.setDuration(320L);
                pVar.w.setInterpolator(pr.h);
                pVar.v = d2Var;
                pVar.w.start();
                return;
            case 4:
                g8 g8Var = (g8) this.b;
                ArrayList arrayList = (ArrayList) this.c;
                g8Var.L0 = false;
                g8Var.b0.addAll(arrayList);
                g8Var.q0.N(true);
                return;
            case 5:
                g8.S((g8) this.b, (TLObject) this.c);
                return;
            case 6:
                o8 o8Var2 = (o8) this.c;
                TLObject tLObject = (TLObject) this.b;
                o8Var2.e1 = 0;
                if (tLObject instanceof Vector) {
                    o8Var2.V0 = new ArrayList();
                    Vector vector = (Vector) tLObject;
                    for (int i12 = 0; i12 < vector.objects.size(); i12++) {
                        TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) vector.objects.get(i12);
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
                            o8Var2.V0.add(tL_inputDocument);
                        }
                    }
                    return;
                }
                return;
            case 7:
                x8.R((x8) this.b, (TLObject) this.c);
                return;
            case 8:
                x8 x8Var = (x8) this.b;
                TextView textView = (TextView) this.c;
                ClipboardManager clipboardManager = (ClipboardManager) x8Var.getContext().getSystemService("clipboard");
                org.telegram.ui.Cells.g3 g3Var = x8Var.Y.b;
                r8 = ((TextUtils.isEmpty(g3Var.getText()) || TextUtils.equals(g3Var.getText(), "https://") || TextUtils.isEmpty(g3Var.getText().toString())) && clipboardManager != null && clipboardManager.hasPrimaryClip()) ? 1 : 0;
                wl.q(textView.animate().alpha(r8 != 0 ? 1.0f : 0.0f).scaleX(r8 != 0 ? 1.0f : 0.7f).scaleY(r8 == 0 ? 0.7f : 1.0f), pr.h, 300L);
                return;
            case 9:
                ia iaVar = (ia) this.b;
                HashMap<Long, Integer> smallGroupsParticipantsCount = ((MessagesStorage) this.c).getSmallGroupsParticipantsCount();
                if (smallGroupsParticipantsCount == null || smallGroupsParticipantsCount.isEmpty()) {
                    return;
                }
                AndroidUtilities.runOnUIThread(new b7(10, iaVar, smallGroupsParticipantsCount));
                return;
            case 10:
                ia iaVar2 = (ia) this.b;
                HashMap hashMap = (HashMap) this.c;
                if (iaVar2.P == null) {
                    iaVar2.P = new HashMap();
                }
                iaVar2.P.putAll(hashMap);
                return;
            case 11:
                d dVar = (d) this.b;
                Runnable runnable = (Runnable) this.c;
                if (dVar != null) {
                    dVar.setLoading(false);
                }
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 12:
                xc xcVar = (xc) this.b;
                Bitmap bitmap2 = (Bitmap) this.c;
                if (!xcVar.k || xcVar.i) {
                    return;
                }
                xcVar.d.add(new wc(xcVar, bitmap2));
                xcVar.k = false;
                xcVar.n.invalidate();
                return;
            case 13:
                int[] iArr = (int[]) this.b;
                ConnectionsManager connectionsManager = (ConnectionsManager) this.c;
                int i13 = iArr[0];
                if (i13 != 0) {
                    connectionsManager.cancelRequest(i13, true);
                    iArr[0] = 0;
                    return;
                }
                return;
            case 14:
                ((v0.i) this.b).onError((w0.d) this.c);
                return;
            case 15:
                ((v0.i) this.b).onResult((v0.f) this.c);
                return;
            case 16:
                e1.d dVar2 = (e1.d) this.b;
                v0.c cVar = (v0.c) this.c;
                v0.i iVar = dVar2.f;
                if (iVar != null) {
                    iVar.onResult(cVar);
                    return;
                } else {
                    kotlin.jvm.internal.i.h("callback");
                    throw null;
                }
            case 17:
                e2.c cVar2 = (e2.c) this.b;
                Object apply = ((i2.w) this.c).apply(cVar2.f);
                cVar2.f = apply;
                e2.b bVar = new e2.b(cVar2, apply, r8);
                e2.z zVar = (e2.z) cVar2.c;
                if (zVar.a.getLooper().getThread().isAlive()) {
                    zVar.c(bVar);
                    return;
                }
                return;
            case 18:
                e2.u uVar = (e2.u) this.b;
                Context context2 = (Context) this.c;
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
                context2.registerReceiver(new androidx.mediarouter.app.g(uVar, i11), intentFilter);
                return;
            case 19:
                androidx.mediarouter.app.g gVar = (androidx.mediarouter.app.g) this.b;
                Context context3 = (Context) this.c;
                e2.u uVar2 = (e2.u) gVar.b;
                ConnectivityManager connectivityManager = (ConnectivityManager) context3.getSystemService("connectivity");
                if (connectivityManager != null) {
                    try {
                        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                        if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                            int type = activeNetworkInfo.getType();
                            if (type != 0) {
                                if (type != 1) {
                                    if (type != 4 && type != 5) {
                                        if (type != 6) {
                                            i10 = type != 9 ? 8 : 7;
                                        }
                                        i10 = 5;
                                    }
                                }
                                i10 = 2;
                            }
                            switch (activeNetworkInfo.getSubtype()) {
                                case 1:
                                case 2:
                                    i10 = 3;
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
                                    break;
                                case 13:
                                    i10 = 5;
                                    break;
                                case 16:
                                case 19:
                                default:
                                    i10 = 6;
                                    break;
                                case 18:
                                    i10 = 2;
                                    break;
                                case 20:
                                    if (Build.VERSION.SDK_INT >= 29) {
                                        i10 = 9;
                                        break;
                                    }
                                    break;
                            }
                        } else {
                            i10 = 1;
                        }
                    } catch (SecurityException unused) {
                    }
                    if (Build.VERSION.SDK_INT >= 31 || i10 != 5) {
                        uVar2.c(i10);
                        return;
                    } else {
                        e2.s.a(context3, uVar2);
                        return;
                    }
                }
                i10 = 0;
                if (Build.VERSION.SDK_INT >= 31) {
                }
                uVar2.c(i10);
                return;
            case 20:
                i9.c0 c0Var = (i9.c0) this.b;
                i9.w wVar = (i9.w) this.c;
                if (c0Var.a instanceof i9.a) {
                    wVar.cancel(false);
                    return;
                }
                return;
            case 21:
                fg.k kVar = (fg.k) this.b;
                fg.j jVar = (fg.j) this.c;
                byte[] bArr = new byte[65536];
                try {
                    InputStream inputStream = jVar.b.getInputStream();
                    while (true) {
                        synchronized (kVar.a) {
                            while (!kVar.p && kVar.k.get(Integer.valueOf(jVar.a)) == jVar && (!kVar.o || !jVar.e || jVar.c == 0)) {
                                try {
                                    kVar.a.wait();
                                } finally {
                                }
                            }
                            if (!kVar.p && kVar.k.get(Integer.valueOf(jVar.a)) == jVar) {
                                int read = inputStream.read(bArr, 0, (int) Math.min(65536L, jVar.c));
                                if (read < 0) {
                                    kVar.c(jVar, true);
                                    return;
                                }
                                if (read != 0) {
                                    byte[] bArr2 = new byte[read];
                                    System.arraycopy(bArr, 0, bArr2, 0, read);
                                    synchronized (kVar.a) {
                                        try {
                                            if (!kVar.p && kVar.k.get(Integer.valueOf(jVar.a)) == jVar && kVar.o) {
                                                jVar.c -= read;
                                                kVar.j(2, jVar.a, bArr2);
                                            }
                                        } finally {
                                        }
                                    }
                                }
                            }
                        }
                    }
                    return;
                } catch (Exception unused2) {
                    kVar.c(jVar, true);
                    return;
                }
            case 22:
                a();
                return;
            case 23:
                fi.m mVar = (fi.m) this.b;
                TLRPC.UserFull userFull = (TLRPC.UserFull) this.c;
                if (userFull != null) {
                    mVar.W = false;
                    TL_payments.starRefProgram starrefprogram = userFull.starref_program;
                    mVar.Y = starrefprogram;
                    if (starrefprogram == null) {
                        mVar.W = true;
                        mVar.Y = mVar.F0();
                        mVar.X = null;
                    } else {
                        TL_payments.starRefProgram starrefprogram2 = new TL_payments.starRefProgram();
                        mVar.X = starrefprogram2;
                        TL_payments.starRefProgram starrefprogram3 = mVar.Y;
                        starrefprogram2.commission_permille = starrefprogram3.commission_permille;
                        starrefprogram2.duration_months = starrefprogram3.duration_months;
                    }
                }
                mVar.H0(true);
                return;
            case 24:
                fi.k3 k3Var = (fi.k3) this.b;
                TLRPC.UserFull userFull2 = (TLRPC.UserFull) this.c;
                k3Var.getClass();
                if (userFull2 == null || (botInfo = userFull2.bot_info) == null || (botappsettings = botInfo.app_settings) == null) {
                    return;
                }
                k3Var.g(botappsettings, true);
                return;
            case 25:
                fi.k3 k3Var2 = (fi.k3) this.b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.c;
                if (k3Var2.c0) {
                    return;
                }
                if (tL_error != null) {
                    k3Var2.k(false);
                    return;
                } else {
                    AndroidUtilities.runOnUIThread(k3Var2.t0, 60000L);
                    return;
                }
            case 26:
                fi.k3 k3Var3 = (fi.k3) this.b;
                org.telegram.ui.Components.qc Q = new org.telegram.ui.Components.yc(k3Var3.p0, k3Var3.E).Q(R.raw.contact_check, 36, AndroidUtilities.replaceTags((String) this.c));
                Q.j = 5000;
                Q.k(true);
                return;
            case 27:
                fi.e4 e4Var = (fi.e4) this.b;
                e4Var.getMessagesController().openApp((TLRPC.User) this.c, e4Var.getClassGuid());
                return;
            case 28:
                fi.e4 e4Var2 = (fi.e4) this.b;
                TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) this.c;
                e4Var2.getClass();
                e4Var2.presentFragment(co.R9(connectedbotstarref.bot_id));
                return;
            default:
                fi.r4 r4Var = (fi.r4) this.b;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.c;
                if (r4Var.T) {
                    return;
                }
                if (tL_error2 != null) {
                    r4Var.b.dismiss();
                    return;
                } else {
                    AndroidUtilities.runOnUIThread(r4Var.U, 60000L);
                    return;
                }
        }
    }

    public /* synthetic */ b7(o8 o8Var, TLObject tLObject) {
        this.a = 6;
        this.c = o8Var;
        this.b = tLObject;
    }
}
