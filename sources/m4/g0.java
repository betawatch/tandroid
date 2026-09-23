package m4;

import ai.v1;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.os.ResultReceiver;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.io.File;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.video.VideoAds;
import org.telegram.messenger.voip.ConferenceCall;
import org.telegram.messenger.voip.VideoCapturerDevice;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.messenger.voip.VoipAudioManager;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.rr;
import org.telegram.ui.Components.zn0;
import org.telegram.ui.a41;
import org.telegram.ui.i4;
import org.telegram.ui.v3;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes.dex */
public final /* synthetic */ class g0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ g0(int i10, Object obj, Object obj2) {
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
        ni.k kVar = (ni.k) this.b;
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
                        ni.j jVar = (ni.j) kVar.m.get(Integer.valueOf(i13));
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
                                                        if (kVar.m.get(Integer.valueOf(jVar.a)) == jVar) {
                                                            jVar.d += j12;
                                                            kVar.k(4, jVar.a, ByteBuffer.allocate(4).putInt(i15).array());
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
                        if (!kVar.r && !kVar.q) {
                            kVar.q = true;
                            ArrayList arrayList = new ArrayList(kVar.m.values());
                            int size = arrayList.size();
                            int i16 = 0;
                            while (i16 < size) {
                                Object obj = arrayList.get(i16);
                                i16++;
                                ni.j jVar2 = (ni.j) obj;
                                jVar2.e = true;
                                kVar.k(1, jVar2.a, null);
                            }
                            ni.d dVar = kVar.u;
                            kVar.a.notifyAll();
                            if (dVar != null) {
                                AndroidUtilities.runOnUIThread(new i2.h0(dVar, 15));
                            }
                        }
                    } finally {
                    }
                }
                if (!z10) {
                }
            } else if (i12 == 5 && i15 <= 64) {
                kVar.k(6, i10, bArr2);
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

    /* JADX WARN: Code restructure failed: missing block: B:185:?, code lost:
    
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        l1 l1Var;
        int i10 = 4;
        long j3 = 0;
        ArrayList arrayList = null;
        Bitmap bitmap = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        int i11 = 1;
        switch (this.a) {
            case 0:
                i9.u uVar = (i9.u) this.b;
                ResultReceiver resultReceiver = (ResultReceiver) this.c;
                try {
                    l1Var = (l1) uVar.a;
                    e2.d.e(l1Var, "SessionResult must not be null");
                } catch (InterruptedException e) {
                    e = e;
                    e2.a.o("MediaSessionLegacyStub", "Custom command failed", e);
                    l1Var = new l1(-1);
                } catch (CancellationException e7) {
                    e2.a.o("MediaSessionLegacyStub", "Custom command cancelled", e7);
                    l1Var = new l1(1);
                } catch (ExecutionException e10) {
                    e = e10;
                    e2.a.o("MediaSessionLegacyStub", "Custom command failed", e);
                    l1Var = new l1(-1);
                }
                resultReceiver.send(l1Var.a, l1Var.b);
                return;
            case 1:
                b1 b1Var = (b1) this.b;
                i iVar = (i) this.c;
                ni.f fVar = b1Var.b;
                r t10 = fVar.t(iVar.asBinder());
                if (t10 != null) {
                    fVar.M(t10);
                    return;
                }
                return;
            case 2:
                ((b1) this.b).b.n((r) this.c);
                return;
            case 3:
                me.b bVar = (me.b) this.b;
                View view = (View) this.c;
                me.a aVar = bVar.a;
                if ((bVar.c & 2) != 0) {
                    if (!aVar.onLongPressRequestedAt(view, bVar.d, bVar.e)) {
                        bVar.c |= 8;
                        return;
                    }
                    bVar.c &= -3;
                    bVar.b = null;
                    float f7 = bVar.d;
                    float f10 = bVar.e;
                    bVar.f = f7;
                    bVar.g = f10;
                    if (aVar.ignoreHapticFeedbackSettings(f7, f10)) {
                        boolean forceEnableVibration = aVar.forceEnableVibration();
                        if (view != null) {
                            view.performHapticFeedback(0, forceEnableVibration ? 2 : 0);
                        }
                    } else {
                        view.performHapticFeedback(0);
                    }
                    bVar.c = (4 | bVar.c) & (-11);
                    bVar.b = null;
                    return;
                }
                return;
            case 4:
                n2.d dVar = (n2.d) this.b;
                b2.s sVar = (b2.s) this.c;
                n2.e eVar = dVar.d;
                if (eVar.E == 0 || dVar.c) {
                    return;
                }
                Looper looper = eVar.I;
                looper.getClass();
                dVar.b = eVar.a(looper, dVar.a, sVar, false);
                eVar.x.add(dVar);
                return;
            case 5:
                ni.k kVar = (ni.k) this.b;
                ni.j jVar = (ni.j) this.c;
                byte[] bArr = new byte[65536];
                try {
                    InputStream inputStream = jVar.b.getInputStream();
                    while (true) {
                        synchronized (kVar.a) {
                            while (!kVar.r && kVar.m.get(Integer.valueOf(jVar.a)) == jVar && (!kVar.q || !jVar.e || jVar.c == j3)) {
                                try {
                                    kVar.a.wait();
                                } finally {
                                }
                            }
                            if (!kVar.r && kVar.m.get(Integer.valueOf(jVar.a)) == jVar) {
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
                                            if (!kVar.r && kVar.m.get(Integer.valueOf(jVar.a)) == jVar && kVar.q) {
                                                jVar.c -= read;
                                                kVar.k(2, jVar.a, bArr2);
                                            }
                                        } finally {
                                        }
                                    }
                                    j3 = 0;
                                }
                            }
                        }
                    }
                    return;
                } catch (Exception unused) {
                    kVar.c(jVar, true);
                    return;
                }
            case 6:
                a();
                return;
            case 7:
                ((p2.c) ((o2.k) ((o2.q) this.b).c.b).b.d.get(((o2.j) this.c).x)).c(true);
                return;
            case 8:
                ((VideoAds) this.b).lambda$showPremium$19((rg.x0) this.c);
                return;
            case 9:
                ((VideoAds) this.b).lambda$load$0((TLObject) this.c);
                return;
            case 10:
                ((VideoAds) this.b).lambda$show$16((Utilities.Callback) this.c);
                return;
            case 11:
                a41.T((Context) this.b, null, false, (ai.a1) this.c, null);
                return;
            case 12:
                ((ConferenceCall) this.b).lambda$processUpdates$4((TLRPC.Updates) this.c);
                return;
            case 13:
                VideoCapturerDevice.lambda$checkScreenCapturerSize$1((VideoCapturerDevice) this.b, (Point) this.c);
                return;
            case 14:
                ((VideoCapturerDevice) this.b).lambda$init$4((String) this.c);
                return;
            case 15:
                ((VoIPService) this.b).lambda$startGroupCall$21((TL_update.TL_updateGroupCall) this.c);
                return;
            case 16:
                ((VoIPService) this.b).lambda$createGroupInstance$71((String) this.c);
                return;
            case 17:
                ((VoIPService) this.b).lambda$startConferenceGroupCall$56((org.telegram.messenger.voip.l0) this.c);
                return;
            case 18:
                ((VoIPService) this.b).lambda$startScreenCapture$58((TLRPC.Updates) this.c);
                return;
            case 19:
                ((VoipAudioManager) this.b).lambda$isBluetoothAndSpeakerOnAsync$2((Utilities.Callback2) this.c);
                return;
            case 20:
                org.telegram.ui.ActionBar.k kVar2 = (org.telegram.ui.ActionBar.k) this.b;
                boolean canScrollVertically = ((zn0) this.c).canScrollVertically(-1);
                boolean z10 = !canScrollVertically;
                if (kVar2.q1 == z10) {
                    return;
                }
                ValueAnimator valueAnimator = kVar2.s1;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                float f11 = kVar2.r1;
                kVar2.q1 = z10;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, canScrollVertically ? 0.0f : 1.0f);
                kVar2.s1 = ofFloat;
                ofFloat.addUpdateListener(new org.telegram.ui.ActionBar.a(kVar2, i10));
                kVar2.s1.addListener(new org.telegram.ui.ActionBar.c(kVar2, z10, i11));
                kVar2.s1.setDuration(320L);
                kVar2.s1.setInterpolator(rr.h);
                kVar2.s1.start();
                return;
            case 21:
                org.telegram.ui.ActionBar.k kVar3 = (org.telegram.ui.ActionBar.k) this.b;
                boolean canScrollVertically2 = ((RecyclerView) this.c).canScrollVertically(-1);
                boolean z11 = !canScrollVertically2;
                if (kVar3.q1 == z11) {
                    return;
                }
                ValueAnimator valueAnimator2 = kVar3.s1;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
                float f12 = kVar3.r1;
                kVar3.q1 = z11;
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(f12, canScrollVertically2 ? 0.0f : 1.0f);
                kVar3.s1 = ofFloat2;
                ofFloat2.addUpdateListener(new org.telegram.ui.ActionBar.a(kVar3, 3));
                kVar3.s1.addListener(new org.telegram.ui.ActionBar.c(kVar3, z11, objArr == true ? 1 : 0));
                kVar3.s1.setDuration(320L);
                kVar3.s1.setInterpolator(rr.h);
                kVar3.s1.start();
                return;
            case 22:
                ActionBarLayout actionBarLayout = (ActionBarLayout) this.b;
                n2 n2Var = (n2) this.c;
                Drawable drawable = ActionBarLayout.p1;
                actionBarLayout.b0(n2Var, false);
                actionBarLayout.setVisibility(8);
                View view2 = actionBarLayout.B0;
                if (view2 != null) {
                    view2.setVisibility(8);
                    return;
                }
                return;
            case 23:
                n2 n2Var2 = (n2) this.b;
                n2 n2Var3 = (n2) this.c;
                Drawable drawable2 = ActionBarLayout.p1;
                if (n2Var2 != null) {
                    n2Var2.onTransitionAnimationEnd(false, false);
                }
                n2Var3.onTransitionAnimationEnd(true, false);
                n2Var3.onBecomeFullyVisible();
                return;
            case 24:
                c6 c6Var = (c6) this.b;
                ArrayList arrayList2 = (ArrayList) this.c;
                int size = arrayList2.size();
                int i12 = 0;
                while (i12 < size) {
                    f6 f6Var = (f6) arrayList2.get(i12);
                    File d = f6Var.d();
                    if (d == null || d.length() <= 0) {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        if (!arrayList.contains(f6Var.o)) {
                            arrayList.add(f6Var.o);
                        }
                    } else {
                        arrayList2.remove(i12);
                        i12--;
                        size--;
                    }
                    i12++;
                }
                if (arrayList == null) {
                    return;
                }
                TL_account.getMultiWallPapers getmultiwallpapers = new TL_account.getMultiWallPapers();
                int size2 = arrayList.size();
                for (int i13 = 0; i13 < size2; i13++) {
                    TLRPC.TL_inputWallPaperSlug tL_inputWallPaperSlug = new TLRPC.TL_inputWallPaperSlug();
                    tL_inputWallPaperSlug.slug = (String) arrayList.get(i13);
                    getmultiwallpapers.wallpapers.add(tL_inputWallPaperSlug);
                }
                ConnectionsManager.getInstance(c6Var.a).sendRequest(getmultiwallpapers, new v1(20, c6Var, arrayList2));
                return;
            case 25:
                c6 c6Var2 = (c6) this.b;
                b6 b6Var = (b6) this.c;
                TLRPC.TL_wallPaper tL_wallPaper = b6Var.a;
                File pathToAttach = FileLoader.getInstance(UserConfig.selectedAccount).getPathToAttach(tL_wallPaper.document, true);
                ArrayList arrayList3 = b6Var.b;
                int size3 = arrayList3.size();
                ArrayList arrayList4 = null;
                for (int i14 = 0; i14 < size3; i14++) {
                    f6 f6Var2 = (f6) arrayList3.get(i14);
                    if (f6Var2.o.equals(tL_wallPaper.slug)) {
                        Bitmap b10 = c6.b(bitmap, "application/x-tgwallpattern".equals(tL_wallPaper.document.mime_type), pathToAttach, f6Var2);
                        if (arrayList4 == null) {
                            arrayList4 = new ArrayList();
                            arrayList4.add(f6Var2);
                        }
                        bitmap = b10;
                    }
                }
                if (bitmap != null) {
                    bitmap.recycle();
                }
                AndroidUtilities.runOnUIThread(new ci.y0((Object) c6Var2, (Object) arrayList4, (boolean) (objArr2 == true ? 1 : 0), 10));
                return;
            case 26:
                g6 g6Var = (g6) this.b;
                g6Var.d((File) this.c, g6Var.h0);
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.q(g6Var, 19));
                return;
            case 27:
                ((org.telegram.ui.p) this.b).X((TLRPC.TL_messages_archivedStickers) this.c);
                return;
            case 28:
                i4 i4Var = (i4) this.b;
                nf.e eVar2 = (nf.e) this.c;
                v3 v3Var = i4Var.K;
                if (v3Var != null) {
                    v3Var.dismiss(true);
                }
                if (i4Var.M0 == eVar2) {
                    i4Var.M0 = null;
                    return;
                }
                return;
            default:
                i4 i4Var2 = (i4) this.b;
                AnimatorSet animatorSet = (AnimatorSet) this.c;
                i4Var2.R0.lock();
                animatorSet.start();
                return;
        }
    }
}
