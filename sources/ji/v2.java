package ji;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.media.AudioDeviceInfo;
import android.media.AudioRouting;
import android.net.Uri;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.ResultReceiver;
import android.os.SystemClock;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.video.VideoAds;
import org.telegram.messenger.voip.ConferenceCall;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.es;
import org.telegram.ui.Components.o60;
import org.telegram.ui.n41;
import org.telegram.ui.rl;
import v7.u6;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes4.dex */
public final /* synthetic */ class v2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ v2(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        TLRPC.Document document;
        TLRPC.PhotoSize closestPhotoSizeWithSize;
        TLRPC.Photo photo;
        k2.e eVar;
        m4.t1 t1Var;
        m4.c cVar;
        m4.c cVar2;
        int i10 = -1;
        int i11 = 8;
        int i12 = 4;
        int i13 = 0;
        View view = null;
        switch (this.a) {
            case 0:
                x3 x3Var = (x3) this.b;
                e2 e2Var = (e2) this.c;
                x3Var.getClass();
                long j10 = e2Var.a;
                int i14 = e2Var.d;
                int i15 = e2Var.c;
                ArrayList arrayList = x3Var.j3;
                int i16 = 0;
                while (true) {
                    if (i16 < arrayList.size()) {
                        if (((a) arrayList.get(i16)).a == j10) {
                            i10 = i16;
                        } else {
                            i16++;
                        }
                    }
                }
                if (i10 < 0) {
                    return;
                }
                KeyEvent.Callback m10 = x3Var.V2.m(i10);
                if (m10 instanceof i6) {
                    i6 i6Var = (i6) m10;
                    i6Var.B();
                    h1 editText = i6Var.getEditText();
                    int length = editText.length();
                    editText.setSelection(Math.max(0, Math.min(i15, length)), Math.max(0, Math.min(i14, length)));
                    return;
                }
                if (!(m10 instanceof u5)) {
                    if (m10 instanceof l0) {
                        h1 captionEditText = ((l0) m10).getCaptionEditText();
                        captionEditText.r();
                        int length2 = captionEditText.length();
                        captionEditText.setSelection(Math.max(0, Math.min(i15, length2)), Math.max(0, Math.min(i14, length2)));
                        return;
                    }
                    return;
                }
                u5 u5Var = (u5) m10;
                h1 l4 = u5Var.l(e2Var.b);
                if (l4 == null) {
                    l4 = u5Var.l(0);
                }
                if (l4 == null) {
                    return;
                }
                l4.r();
                int length3 = l4.length();
                l4.setSelection(Math.max(0, Math.min(i15, length3)), Math.max(0, Math.min(i14, length3)));
                return;
            case 1:
                o3 o3Var = (o3) this.b;
                a aVar = (a) this.c;
                if (aVar == null) {
                    o3Var.getClass();
                } else {
                    view = o3Var.e.A1(aVar);
                }
                if (view instanceof i6) {
                    i6 i6Var2 = (i6) view;
                    i6Var2.B();
                    i6Var2.getEditText().setSelection(i6Var2.getEditText().length());
                    return;
                }
                return;
            case 2:
                e5 e5Var = (e5) this.b;
                TLObject tLObject = (TLObject) this.c;
                boolean z10 = e5Var.e;
                boolean z11 = e5Var.d;
                d5 d5Var = e5Var.s;
                if (e5Var.w) {
                    return;
                }
                e5Var.y = 0;
                if (e5Var.c || z11 || z10) {
                    if ((tLObject instanceof TLRPC.TL_messageMediaDocument) && (document = ((TLRPC.TL_messageMediaDocument) tLObject).document) != null) {
                        if (!z10) {
                            if (z11) {
                                e5Var.x = true;
                                e5Var.e();
                                d5Var.e(document);
                                return;
                            } else {
                                e5Var.x = true;
                                e5Var.e();
                                d5Var.c(document);
                                return;
                            }
                        }
                        int i17 = e5Var.a;
                        if (document.id == 0 || document.access_hash == 0) {
                            e5Var.x = true;
                            e5Var.e();
                            d5Var.onError();
                            return;
                        }
                        e5Var.x = true;
                        e5Var.e();
                        if (!TextUtils.isEmpty(e5Var.F) && MessageObject.isDocumentHasThumb(document) && (closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 320)) != null) {
                            FileLoader.getInstance(i17).setLocalPathTo(closestPhotoSizeWithSize, e5Var.F);
                            AndroidUtilities.copyFileSafe(new File(e5Var.F), FileLoader.getInstance(i17).getPathToAttach(closestPhotoSizeWithSize, true));
                        }
                        d5Var.d(document);
                        return;
                    }
                } else if ((tLObject instanceof TLRPC.TL_messageMediaPhoto) && (photo = ((TLRPC.TL_messageMediaPhoto) tLObject).photo) != null) {
                    e5Var.x = true;
                    e5Var.e();
                    d5Var.b(photo);
                    return;
                }
                e5Var.x = true;
                e5Var.e();
                d5Var.onError();
                return;
            case 3:
                e5 e5Var2 = (e5) this.b;
                String str = (String) this.c;
                if (e5Var2.w || e5Var2.x) {
                    return;
                }
                e5Var2.a(str);
                return;
            case 4:
                x5 m11 = ((u5) this.b).v.m((TL_iv.pageTableCell) this.c);
                if (m11 == null) {
                    return;
                }
                h1 h1Var = m11.a;
                h1Var.r();
                h1Var.setSelection(h1Var.length());
                return;
            case 5:
                qf.b bVar = (qf.b) this.b;
                String str2 = (String) this.c;
                k2.u uVar = (k2.u) bVar.c;
                String str3 = e2.m0.a;
                j2.f fVar = ((i2.b0) uVar).a.s;
                j2.a p5 = fVar.p();
                fVar.q(p5, 1012, new j2.e(p5, str2, 10));
                return;
            case 6:
                qf.b bVar2 = (qf.b) this.b;
                i2.c cVar3 = (i2.c) this.c;
                k2.u uVar2 = (k2.u) bVar2.c;
                String str4 = e2.m0.a;
                n4.s.e(((i2.b0) uVar2).a.F, cVar3);
                return;
            case 7:
                k2.d0.a((k2.d0) this.b, (AudioRouting) this.c);
                return;
            case 8:
                k2.d0 d0Var = (k2.d0) this.b;
                AudioDeviceInfo audioDeviceInfo = (AudioDeviceInfo) this.c;
                if (d0Var.d == null || (eVar = ((k2.j0) d0Var.b.b).i) == null || audioDeviceInfo.equals(eVar.i)) {
                    return;
                }
                eVar.i = audioDeviceInfo;
                Context context = eVar.a;
                b2.f fVar2 = eVar.j;
                List a2 = eVar.a();
                e9.x1 x1Var = k2.b.e;
                eVar.b(k2.b.b(context, context.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")), fVar2, audioDeviceInfo, a2));
                return;
            case 9:
                ((li.l) this.b).a0((li.n0) this.c);
                return;
            case 10:
                li.l lVar = (li.l) this.b;
                HandlerThread handlerThread = (HandlerThread) this.c;
                lVar.k();
                li.o oVar = lVar.x;
                if (oVar != null) {
                    long l10 = oVar.l();
                    li.u uVar3 = lVar.w;
                    if (uVar3 != null && l10 != Long.MAX_VALUE) {
                        uVar3.q = Math.max(0L, l10) * 1000;
                        Handler handler = uVar3.u;
                        if (handler != null) {
                            handler.removeCallbacks(uVar3.x0);
                        }
                    }
                }
                lVar.p();
                li.o oVar2 = lVar.x;
                if (oVar2 != null) {
                    oVar2.q();
                    lVar.x = null;
                }
                handlerThread.quitSafely();
                return;
            case 11:
                li.u uVar4 = (li.u) this.b;
                CountDownLatch countDownLatch = (CountDownLatch) this.c;
                uVar4.getClass();
                try {
                    try {
                        uVar4.f();
                        uVar4.r0 = true;
                    } catch (RuntimeException e) {
                        uVar4.w0 = e;
                        uVar4.i();
                    }
                    return;
                } finally {
                    countDownLatch.countDown();
                }
            case 12:
                d4 d4Var = (d4) this.b;
                li.n0 n0Var = (li.n0) this.c;
                li.u0 u0Var = (li.u0) d4Var.b;
                u0Var.N++;
                u0Var.w = true;
                u0Var.m.b("camera switch started: target=" + n0Var);
                o60 o60Var = (o60) u0Var.d.b;
                FrameLayout frameLayout = o60Var.x;
                o60Var.s0++;
                ValueAnimator valueAnimator = o60Var.b0;
                if (valueAnimator != null) {
                    valueAnimator.removeAllListeners();
                    o60Var.b0.cancel();
                    o60Var.b0 = null;
                }
                o60Var.n0 = true;
                o60Var.o0 = false;
                o60Var.p0 = false;
                o60Var.q0 = false;
                o60Var.r0 = SystemClock.elapsedRealtime();
                rl rlVar = o60Var.E;
                o60Var.v(false);
                Bitmap bitmap = o60Var.t0;
                if (bitmap != null) {
                    rlVar.setImageBitmap(bitmap);
                    o60Var.m0 = true;
                    rlVar.animate().cancel();
                    rlVar.setAlpha(1.0f);
                }
                frameLayout.animate().cancel();
                frameLayout.setRotationY(0.0f);
                frameLayout.setCameraDistance(frameLayout.getMeasuredHeight() * 8.0f);
                int i18 = o60Var.s0;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                o60Var.b0 = ofFloat;
                ofFloat.setDuration(580L);
                o60Var.b0.setInterpolator(es.h);
                o60Var.b0.addUpdateListener(new org.telegram.ui.ActionBar.p2(o60Var, i18, i12));
                o60Var.b0.addListener(new fi.v2(o60Var, i18, i11));
                o60Var.b0.start();
                FileLog.d("RoundVideo camera flip started: facing=" + n0Var + ", minimumDurationMs=580");
                o60Var.y();
                u0Var.o();
                return;
            case 13:
                ((li.u0) ((d4) this.b).b).h((Exception) this.c);
                return;
            case 14:
                ((m4.f0) this.b).u(null, (m4.n1) this.c);
                return;
            case 15:
                m4.f0 f0Var = (m4.f0) this.b;
                Runnable runnable = (Runnable) this.c;
                f0Var.getClass();
                runnable.run();
                return;
            case 16:
                ((c0.i) this.c).a(Boolean.valueOf(((m4.f0) this.b).o()));
                return;
            case 17:
                j9.w wVar = (j9.w) this.b;
                ResultReceiver resultReceiver = (ResultReceiver) this.c;
                try {
                    t1Var = (m4.t1) wVar.a;
                    u6.l(t1Var, "SessionResult must not be null");
                } catch (InterruptedException e7) {
                    e = e7;
                    e2.a.m("MediaSessionLegacyStub", "Custom command failed", e);
                    t1Var = new m4.t1(-1);
                } catch (CancellationException e10) {
                    e2.a.m("MediaSessionLegacyStub", "Custom command cancelled", e10);
                    t1Var = new m4.t1(1);
                } catch (ExecutionException e11) {
                    e = e11;
                    e2.a.m("MediaSessionLegacyStub", "Custom command failed", e);
                    t1Var = new m4.t1(-1);
                }
                resultReceiver.send(t1Var.a, t1Var.b);
                return;
            case 18:
                m4.j1 j1Var = (m4.j1) this.b;
                m4.m mVar = (m4.m) this.c;
                qi.e eVar2 = j1Var.b;
                m4.w n10 = eVar2.n(mVar.asBinder());
                if (n10 != null) {
                    eVar2.C(n10);
                    return;
                }
                return;
            case 19:
                ((m4.j1) this.b).b.j((m4.w) this.c);
                return;
            case 20:
                ((gi.m0) this.b).run((SpannableString) this.c);
                return;
            case 21:
                mi.q qVar = (mi.q) this.b;
                mi.o oVar3 = (mi.o) this.c;
                synchronized (qVar.a) {
                    try {
                        if (qVar.s) {
                            return;
                        }
                        ArrayList arrayList2 = (ArrayList) qVar.n.get(oVar3);
                        if (arrayList2 != null) {
                            int size = arrayList2.size();
                            int i19 = 0;
                            while (i19 < size) {
                                Object obj = arrayList2.get(i19);
                                i19++;
                                if (((mi.p) obj).a != null) {
                                    mi.m mVar2 = (mi.m) qVar.h.get(oVar3);
                                    if (mVar2 != null) {
                                        cVar2 = mVar2.a;
                                    } else if (qVar.a()) {
                                        try {
                                            com.google.android.gms.internal.play_billing.s0 c10 = qVar.v.a.c(oVar3.a, oVar3.b);
                                            c10.b();
                                            cVar = new m4.c(r6, c10, view);
                                        } catch (LinkageError | OutOfMemoryError | RuntimeException e12) {
                                            if (qVar.c != null) {
                                                try {
                                                    FileLog.e(e12);
                                                } catch (LinkageError | RuntimeException unused) {
                                                }
                                            }
                                            cVar = new m4.c(r6, view, e12);
                                        }
                                        cVar2 = cVar;
                                    } else {
                                        cVar2 = new m4.c(r6, view, qVar.w);
                                    }
                                    synchronized (qVar.a) {
                                        try {
                                            if (qVar.s) {
                                                return;
                                            }
                                            if (mVar2 == null && ((Throwable) cVar2.c) == null) {
                                                qVar.c(oVar3, cVar2);
                                            }
                                            ArrayList arrayList3 = (ArrayList) qVar.n.remove(oVar3);
                                            if (arrayList3 == null) {
                                                return;
                                            }
                                            int size2 = arrayList3.size();
                                            while (i13 < size2) {
                                                Object obj2 = arrayList3.get(i13);
                                                i13++;
                                                mi.p pVar = (mi.p) obj2;
                                                try {
                                                    mi.n nVar = pVar.a;
                                                    pVar.a = null;
                                                    if (nVar != null) {
                                                        nVar.a(cVar2);
                                                    }
                                                } catch (LinkageError | RuntimeException e13) {
                                                    if (qVar.c != null) {
                                                        try {
                                                            FileLog.e(e13);
                                                        } catch (LinkageError | RuntimeException unused2) {
                                                        }
                                                    }
                                                }
                                            }
                                            return;
                                        } finally {
                                        }
                                    }
                                }
                            }
                        }
                        qVar.n.remove(oVar3);
                        return;
                    } finally {
                    }
                }
            case 22:
                n2.d dVar = (n2.d) this.b;
                b2.x xVar = (b2.x) this.c;
                n2.e eVar3 = dVar.d;
                if (eVar3.E == 0 || dVar.c) {
                    return;
                }
                Looper looper = eVar3.I;
                looper.getClass();
                dVar.b = eVar3.a(looper, dVar.a, xVar, false);
                eVar3.x.add(dVar);
                return;
            case 23:
                o2.q qVar2 = (o2.q) this.b;
                o2.j jVar = (o2.j) this.c;
                h5 h5Var = qVar2.c;
                Uri uri = jVar.x;
                p2.c cVar4 = (p2.c) ((o2.k) h5Var.b).b.d.get(uri);
                if (cVar4 != null) {
                    p2.c.b(cVar4, uri, true);
                    return;
                }
                return;
            case 24:
                oe.b bVar3 = (oe.b) this.b;
                View view2 = (View) this.c;
                oe.a aVar2 = bVar3.a;
                if ((bVar3.c & 2) != 0) {
                    if (!aVar2.onLongPressRequestedAt(view2, bVar3.d, bVar3.e)) {
                        bVar3.c |= 8;
                        return;
                    }
                    bVar3.c &= -3;
                    bVar3.b = null;
                    float f7 = bVar3.d;
                    float f10 = bVar3.e;
                    bVar3.f = f7;
                    bVar3.g = f10;
                    if (aVar2.ignoreHapticFeedbackSettings(f7, f10)) {
                        boolean forceEnableVibration = aVar2.forceEnableVibration();
                        if (view2 != null) {
                            view2.performHapticFeedback(0, forceEnableVibration ? 2 : 0);
                        }
                    } else {
                        view2.performHapticFeedback(0);
                    }
                    bVar3.c = (bVar3.c | 4) & (-11);
                    bVar3.b = null;
                    return;
                }
                return;
            case 25:
                ((VideoAds) this.b).lambda$showPremium$19((sg.y0) this.c);
                return;
            case 26:
                ((VideoAds) this.b).lambda$load$0((TLObject) this.c);
                return;
            case 27:
                ((VideoAds) this.b).lambda$show$16((Utilities.Callback) this.c);
                return;
            case 28:
                n41.U((Context) this.b, null, false, (bi.s0) this.c, null);
                return;
            default:
                ((ConferenceCall) this.b).lambda$processUpdates$4((TLRPC.Updates) this.c);
                return;
        }
    }

    public /* synthetic */ v2(m4.f0 f0Var, m4.w wVar, Runnable runnable) {
        this.a = 15;
        this.b = f0Var;
        this.c = runnable;
    }
}
