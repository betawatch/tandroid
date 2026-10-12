package di;

import android.animation.ValueAnimator;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.PowerManager;
import android.text.TextUtils;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.yh;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.Components.es;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes4.dex */
public final /* synthetic */ class x6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ x6(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        PowerManager.WakeLock wakeLock;
        TL_bots.BotInfo botInfo;
        TL_bots.botAppSettings botappsettings;
        int i10 = 29;
        int i11 = 4;
        int i12 = 2;
        switch (this.a) {
            case 0:
                ((Utilities.Callback) this.b).run((Bitmap) this.c);
                return;
            case 1:
                a7.a((a7) this.b, (k8) this.c);
                return;
            case 2:
                androidx.biometric.e eVar = (androidx.biometric.e) this.b;
                k8 k8Var = (k8) this.c;
                a7 a7Var = (a7) eVar.d;
                Bitmap bitmap = a7Var.a;
                if (bitmap != null) {
                    bitmap.recycle();
                    if (k8Var.M0 == a7Var.a) {
                        k8Var.M0 = null;
                    }
                    a7Var.a = null;
                    a7Var.invalidate();
                    return;
                }
                return;
            case 3:
                e7 e7Var = (e7) this.b;
                Context context = (Context) this.c;
                AtomicReference atomicReference = e7Var.a;
                com.google.android.gms.internal.vision.x1 x1Var = new com.google.android.gms.internal.vision.x1();
                x1Var.a = 256;
                atomicReference.set(new r8.n(new com.google.android.gms.internal.vision.t2(context, x1Var)));
                e7Var.a(e7Var.f);
                return;
            case 4:
                ((e7) this.b).c.run((c7) this.c);
                return;
            case 5:
                p pVar = (p) this.b;
                rg.d2 d2Var = (rg.d2) this.c;
                m7 m7Var = pVar.a;
                if (d2Var.getWidth() <= 0) {
                    m7Var.animate().scaleX(0.0f).scaleY(1.0f).withEndAction(new bi.la(pVar, i10)).start();
                    return;
                }
                float width = d2Var.getWidth() / m7Var.getWidth();
                ValueAnimator valueAnimator = pVar.w;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                pVar.w = ValueAnimator.ofFloat(0.0f, 1.0f);
                pVar.w.addUpdateListener(new l7(pVar, m7Var.getScaleX(), width, ((d2Var.getWidth() / 2.0f) + d2Var.getX()) - ((m7Var.getWidth() / 2.0f) + m7Var.getX()), ((d2Var.getHeight() / 2.0f) + d2Var.getY()) - ((m7Var.getHeight() / 2.0f) + m7Var.getY()), 0));
                pVar.w.addListener(new bi.t(i11, pVar, d2Var));
                pVar.w.setDuration(320L);
                pVar.w.setInterpolator(es.h);
                pVar.v = d2Var;
                pVar.w.start();
                return;
            case 6:
                c8 c8Var = (c8) this.b;
                ArrayList arrayList = (ArrayList) this.c;
                c8Var.L0 = false;
                c8Var.b0.addAll(arrayList);
                c8Var.q0.N(true);
                return;
            case 7:
                c8.S((c8) this.b, (TLObject) this.c);
                return;
            case 8:
                k8 k8Var2 = (k8) this.b;
                TLObject tLObject = (TLObject) this.c;
                k8Var2.e1 = 0;
                if (tLObject instanceof Vector) {
                    k8Var2.V0 = new ArrayList();
                    Vector vector = (Vector) tLObject;
                    for (int i13 = 0; i13 < vector.objects.size(); i13++) {
                        TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) vector.objects.get(i13);
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
                            k8Var2.V0.add(tL_inputDocument);
                        }
                    }
                    return;
                }
                return;
            case 9:
                t8.S((t8) this.b, (TLObject) this.c);
                return;
            case 10:
                t8 t8Var = (t8) this.b;
                TextView textView = (TextView) this.c;
                ClipboardManager clipboardManager = (ClipboardManager) t8Var.getContext().getSystemService("clipboard");
                org.telegram.ui.Cells.h3 h3Var = t8Var.Y.b;
                r7 = ((TextUtils.isEmpty(h3Var.getText()) || TextUtils.equals(h3Var.getText(), "https://") || TextUtils.isEmpty(h3Var.getText().toString())) && clipboardManager != null && clipboardManager.hasPrimaryClip()) ? 1 : 0;
                yh.s(textView.animate().alpha(r7 != 0 ? 1.0f : 0.0f).scaleX(r7 != 0 ? 1.0f : 0.7f).scaleY(r7 == 0 ? 0.7f : 1.0f), es.h, 300L);
                return;
            case 11:
                ea eaVar = (ea) this.b;
                HashMap<Long, Integer> smallGroupsParticipantsCount = ((MessagesStorage) this.c).getSmallGroupsParticipantsCount();
                if (smallGroupsParticipantsCount == null || smallGroupsParticipantsCount.isEmpty()) {
                    return;
                }
                AndroidUtilities.runOnUIThread(new x6(12, eaVar, smallGroupsParticipantsCount));
                return;
            case 12:
                ea eaVar2 = (ea) this.b;
                HashMap hashMap = (HashMap) this.c;
                if (eaVar2.P == null) {
                    eaVar2.P = new HashMap();
                }
                eaVar2.P.putAll(hashMap);
                return;
            case 13:
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
            case 14:
                sc scVar = (sc) this.b;
                Bitmap bitmap2 = (Bitmap) this.c;
                if (!scVar.k || scVar.i) {
                    return;
                }
                scVar.d.add(new rc(scVar, bitmap2));
                scVar.k = false;
                scVar.n.invalidate();
                return;
            case 15:
                int[] iArr = (int[]) this.b;
                ConnectionsManager connectionsManager = (ConnectionsManager) this.c;
                int i14 = iArr[0];
                if (i14 != 0) {
                    connectionsManager.cancelRequest(i14, true);
                    iArr[0] = 0;
                    return;
                }
                return;
            case 16:
                ((v0.i) this.b).onError((w0.d) this.c);
                return;
            case 17:
                ((v0.i) this.b).onResult((v0.f) this.c);
                return;
            case 18:
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
            case 19:
                e2.c cVar2 = (e2.c) this.b;
                Object apply = ((i2.v) this.c).apply(cVar2.f);
                cVar2.f = apply;
                e2.b bVar = new e2.b(cVar2, apply, r7);
                e2.i0 i0Var = (e2.i0) cVar2.c;
                if (i0Var.a.getLooper().getThread().isAlive()) {
                    i0Var.d(bVar);
                    return;
                }
                return;
            case 20:
                e2.w wVar = (e2.w) this.b;
                Context context2 = (Context) this.c;
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
                context2.registerReceiver(new androidx.mediarouter.app.f(wVar, i12), intentFilter);
                return;
            case 21:
                androidx.mediarouter.app.f fVar = (androidx.mediarouter.app.f) this.b;
                Context context3 = (Context) this.c;
                e2.w wVar2 = (e2.w) fVar.b;
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
                                            i11 = type != 9 ? 8 : 7;
                                        }
                                        i11 = 5;
                                    }
                                }
                                i11 = 2;
                            }
                            switch (activeNetworkInfo.getSubtype()) {
                                case 1:
                                case 2:
                                    i11 = 3;
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
                                    i11 = 5;
                                    break;
                                case 16:
                                case 19:
                                default:
                                    i11 = 6;
                                    break;
                                case 18:
                                    i11 = 2;
                                    break;
                                case 20:
                                    if (Build.VERSION.SDK_INT >= 29) {
                                        i11 = 9;
                                        break;
                                    }
                                    break;
                            }
                        } else {
                            i11 = 1;
                        }
                    } catch (SecurityException unused) {
                    }
                    if (Build.VERSION.SDK_INT >= 31 || i11 != 5) {
                        wVar2.c(i11);
                        return;
                    } else {
                        e2.u.a(context3, wVar2);
                        return;
                    }
                }
                i11 = 0;
                if (Build.VERSION.SDK_INT >= 31) {
                }
                wVar2.c(i11);
                return;
            case 22:
                j9.e0 e0Var = (j9.e0) this.b;
                j9.y yVar = (j9.y) this.c;
                if (e0Var.a instanceof j9.a) {
                    yVar.cancel(false);
                    return;
                }
                return;
            case 23:
                ac.a aVar = (ac.a) this.b;
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.c;
                qf.b bVar2 = (qf.b) aVar.c;
                bVar2.getClass();
                if (atomicBoolean.get()) {
                    new Thread(new x6(24, bVar2, atomicBoolean), "ExoPlayer:WakeLockManager").start();
                    return;
                }
                return;
            case 24:
                qf.b bVar3 = (qf.b) this.b;
                AtomicBoolean atomicBoolean2 = (AtomicBoolean) this.c;
                synchronized (bVar3) {
                    if (atomicBoolean2.get() && (wakeLock = (PowerManager.WakeLock) bVar3.c) != null) {
                        wakeLock.release();
                    }
                }
                return;
            case 25:
                fi.l lVar = (fi.l) this.b;
                TLRPC.UserFull userFull = (TLRPC.UserFull) this.c;
                if (userFull != null) {
                    lVar.W = false;
                    TL_payments.starRefProgram starrefprogram = userFull.starref_program;
                    lVar.Y = starrefprogram;
                    if (starrefprogram == null) {
                        lVar.W = true;
                        lVar.Y = lVar.G0();
                        lVar.X = null;
                    } else {
                        TL_payments.starRefProgram starrefprogram2 = new TL_payments.starRefProgram();
                        lVar.X = starrefprogram2;
                        TL_payments.starRefProgram starrefprogram3 = lVar.Y;
                        starrefprogram2.commission_permille = starrefprogram3.commission_permille;
                        starrefprogram2.duration_months = starrefprogram3.duration_months;
                    }
                }
                lVar.I0(true);
                return;
            case 26:
                fi.k3 k3Var = (fi.k3) this.b;
                TLRPC.UserFull userFull2 = (TLRPC.UserFull) this.c;
                k3Var.getClass();
                if (userFull2 == null || (botInfo = userFull2.bot_info) == null || (botappsettings = botInfo.app_settings) == null) {
                    return;
                }
                k3Var.g(botappsettings, true);
                return;
            case 27:
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
            case 28:
                fi.k3 k3Var3 = (fi.k3) this.b;
                org.telegram.ui.Components.sc Q = new org.telegram.ui.Components.zc(k3Var3.p0, k3Var3.E).Q(R.raw.contact_check, 36, AndroidUtilities.replaceTags((String) this.c));
                Q.j = 5000;
                Q.k(true);
                return;
            default:
                fi.f4 f4Var = (fi.f4) this.b;
                f4Var.getMessagesController().openApp((TLRPC.User) this.c, f4Var.getClassGuid());
                return;
        }
    }
}
