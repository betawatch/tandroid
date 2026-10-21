package m4;

import ai.ua;
import ai.y7;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Looper;
import android.os.ResultReceiver;
import android.text.SpannableString;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.io.File;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
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
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.xo0;
import org.telegram.ui.t21;
import v7.u6;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes.dex */
public final /* synthetic */ class z implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ z(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v1, types: [int] */
    /* JADX WARN: Type inference failed for: r11v2, types: [int] */
    /* JADX WARN: Type inference failed for: r1v16, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, java.lang.OutOfMemoryError, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r4v11, types: [java.lang.LinkageError, java.lang.Throwable] */
    @Override // java.lang.Runnable
    public final void run() {
        s1 s1Var;
        mi.q qVar;
        mi.q qVar2;
        int i10 = 4;
        ArrayList arrayList = null;
        Bitmap bitmap = null;
        int i11 = 1;
        ?? r11 = 0;
        switch (this.a) {
            case 0:
                ((c0.i) this.c).a(Boolean.valueOf(((f0) this.b).o()));
                return;
            case 1:
                j9.w wVar = (j9.w) this.b;
                ResultReceiver resultReceiver = (ResultReceiver) this.c;
                try {
                    s1Var = (s1) wVar.a;
                    u6.l(s1Var, "SessionResult must not be null");
                } catch (InterruptedException e) {
                    e = e;
                    e2.a.m("MediaSessionLegacyStub", "Custom command failed", e);
                    s1Var = new s1(-1);
                } catch (CancellationException e7) {
                    e2.a.m("MediaSessionLegacyStub", "Custom command cancelled", e7);
                    s1Var = new s1(1);
                } catch (ExecutionException e10) {
                    e = e10;
                    e2.a.m("MediaSessionLegacyStub", "Custom command failed", e);
                    s1Var = new s1(-1);
                }
                resultReceiver.send(s1Var.a, s1Var.b);
                return;
            case 2:
                i1 i1Var = (i1) this.b;
                l lVar = (l) this.c;
                qi.e eVar = i1Var.b;
                v q6 = eVar.q(lVar.asBinder());
                if (q6 != null) {
                    eVar.E(q6);
                    return;
                }
                return;
            case 3:
                ((i1) this.b).b.m((v) this.c);
                return;
            case 4:
                ((ua) this.b).run((SpannableString) this.c);
                return;
            case 5:
                mi.r rVar = (mi.r) this.b;
                mi.o oVar = (mi.o) this.c;
                synchronized (rVar.a) {
                    try {
                        if (rVar.s) {
                            return;
                        }
                        ArrayList arrayList2 = (ArrayList) rVar.n.get(oVar);
                        if (arrayList2 != null) {
                            int size = arrayList2.size();
                            int i12 = 0;
                            while (i12 < size) {
                                Object obj = arrayList2.get(i12);
                                i12++;
                                if (((mi.p) obj).a != null) {
                                    mi.m mVar = (mi.m) rVar.h.get(oVar);
                                    if (mVar != null) {
                                        qVar2 = mVar.a;
                                    } else if (rVar.a()) {
                                        try {
                                            com.google.android.gms.internal.play_billing.s0 c10 = rVar.v.a.c(oVar.a, oVar.b);
                                            c10.b();
                                            qVar = new mi.q(r11, c10, arrayList);
                                        } catch (LinkageError | OutOfMemoryError | RuntimeException e11) {
                                            if (rVar.c != null) {
                                                try {
                                                    FileLog.e((Throwable) e11);
                                                } catch (LinkageError | RuntimeException unused) {
                                                }
                                            }
                                            qVar = new mi.q(r11, arrayList, e11);
                                        }
                                        qVar2 = qVar;
                                    } else {
                                        qVar2 = new mi.q(r11, arrayList, rVar.w);
                                    }
                                    synchronized (rVar.a) {
                                        try {
                                            if (rVar.s) {
                                                return;
                                            }
                                            if (mVar == null && ((Throwable) qVar2.c) == null) {
                                                rVar.c(oVar, qVar2);
                                            }
                                            ?? r12 = (ArrayList) rVar.n.remove(oVar);
                                            if (r12 == 0) {
                                                return;
                                            }
                                            int size2 = r12.size();
                                            while (r11 < size2) {
                                                Object obj2 = r12.get(r11);
                                                r11++;
                                                mi.p pVar = (mi.p) obj2;
                                                try {
                                                    mi.n nVar = pVar.a;
                                                    pVar.a = null;
                                                    if (nVar != null) {
                                                        nVar.a(qVar2);
                                                    }
                                                } catch (LinkageError | RuntimeException e12) {
                                                    if (rVar.c != null) {
                                                        try {
                                                            FileLog.e((Throwable) e12);
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
                        rVar.n.remove(oVar);
                        return;
                    } finally {
                    }
                }
            case 6:
                n2.d dVar = (n2.d) this.b;
                b2.w wVar2 = (b2.w) this.c;
                n2.f fVar = dVar.d;
                if (fVar.E == 0 || dVar.c) {
                    return;
                }
                Looper looper = fVar.I;
                looper.getClass();
                dVar.b = fVar.a(looper, dVar.a, wVar2, false);
                fVar.x.add(dVar);
                return;
            case 7:
                o2.q qVar3 = (o2.q) this.b;
                o2.j jVar = (o2.j) this.c;
                le.b bVar = qVar3.c;
                Uri uri = jVar.x;
                p2.d dVar2 = (p2.d) ((o2.k) bVar.b).b.d.get(uri);
                if (dVar2 != null) {
                    p2.d.b(dVar2, uri, true);
                    return;
                }
                return;
            case 8:
                oe.b bVar2 = (oe.b) this.b;
                View view = (View) this.c;
                oe.a aVar = bVar2.a;
                if ((bVar2.c & 2) != 0) {
                    if (!aVar.onLongPressRequestedAt(view, bVar2.d, bVar2.e)) {
                        bVar2.c |= 8;
                        return;
                    }
                    bVar2.c &= -3;
                    bVar2.b = null;
                    float f7 = bVar2.d;
                    float f10 = bVar2.e;
                    bVar2.f = f7;
                    bVar2.g = f10;
                    if (aVar.ignoreHapticFeedbackSettings(f7, f10)) {
                        boolean forceEnableVibration = aVar.forceEnableVibration();
                        if (view != null) {
                            view.performHapticFeedback(0, forceEnableVibration ? 2 : 0);
                        }
                    } else {
                        view.performHapticFeedback(0);
                    }
                    bVar2.c = (bVar2.c | 4) & (-11);
                    bVar2.b = null;
                    return;
                }
                return;
            case 9:
                ((VideoAds) this.b).lambda$showPremium$19((sg.y0) this.c);
                return;
            case 10:
                ((VideoAds) this.b).lambda$load$0((TLObject) this.c);
                return;
            case 11:
                ((VideoAds) this.b).lambda$show$16((Utilities.Callback) this.c);
                return;
            case 12:
                t21.U((Context) this.b, null, false, (ci.k0) this.c, null);
                return;
            case 13:
                ((ConferenceCall) this.b).lambda$processUpdates$4((TLRPC.Updates) this.c);
                return;
            case 14:
                VideoCapturerDevice.lambda$checkScreenCapturerSize$1((VideoCapturerDevice) this.b, (Point) this.c);
                return;
            case 15:
                ((VideoCapturerDevice) this.b).lambda$init$4((String) this.c);
                return;
            case 16:
                ((VoIPService) this.b).lambda$startGroupCall$21((TL_update.TL_updateGroupCall) this.c);
                return;
            case 17:
                ((VoIPService) this.b).lambda$createGroupInstance$71((String) this.c);
                return;
            case 18:
                ((VoIPService) this.b).lambda$startConferenceGroupCall$56((org.telegram.messenger.voip.k0) this.c);
                return;
            case 19:
                ((VoIPService) this.b).lambda$startScreenCapture$58((TLRPC.Updates) this.c);
                return;
            case 20:
                ((AudioManager) this.b).setCommunicationDevice((AudioDeviceInfo) this.c);
                return;
            case 21:
                ((VoipAudioManager) this.b).lambda$isBluetoothAndSpeakerOnAsync$4((Utilities.Callback2) this.c);
                return;
            case 22:
                org.telegram.ui.ActionBar.k kVar = (org.telegram.ui.ActionBar.k) this.b;
                boolean canScrollVertically = ((xo0) this.c).canScrollVertically(-1);
                boolean z10 = !canScrollVertically;
                if (kVar.r1 == z10) {
                    return;
                }
                ValueAnimator valueAnimator = kVar.t1;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                float f11 = kVar.s1;
                kVar.r1 = z10;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, canScrollVertically ? 0.0f : 1.0f);
                kVar.t1 = ofFloat;
                ofFloat.addUpdateListener(new org.telegram.ui.ActionBar.a(kVar, r11));
                kVar.t1.addListener(new org.telegram.ui.ActionBar.c(kVar, z10, i11));
                kVar.t1.setDuration(320L);
                kVar.t1.setInterpolator(bs.h);
                kVar.t1.start();
                return;
            case 23:
                org.telegram.ui.ActionBar.k kVar2 = (org.telegram.ui.ActionBar.k) this.b;
                boolean canScrollVertically2 = ((RecyclerView) this.c).canScrollVertically(-1);
                boolean z11 = !canScrollVertically2;
                if (kVar2.r1 == z11) {
                    return;
                }
                ValueAnimator valueAnimator2 = kVar2.t1;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
                float f12 = kVar2.s1;
                kVar2.r1 = z11;
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(f12, canScrollVertically2 ? 0.0f : 1.0f);
                kVar2.t1 = ofFloat2;
                ofFloat2.addUpdateListener(new org.telegram.ui.ActionBar.a(kVar2, i10));
                kVar2.t1.addListener(new org.telegram.ui.ActionBar.c(kVar2, z11, r11));
                kVar2.t1.setDuration(320L);
                kVar2.t1.setInterpolator(bs.h);
                kVar2.t1.start();
                return;
            case 24:
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
            case 25:
                n2 n2Var2 = (n2) this.b;
                n2 n2Var3 = (n2) this.c;
                Drawable drawable2 = ActionBarLayout.p1;
                if (n2Var2 != null) {
                    n2Var2.onTransitionAnimationEnd(false, false);
                }
                n2Var3.onTransitionAnimationEnd(true, false);
                n2Var3.onBecomeFullyVisible();
                return;
            case 26:
                c6 c6Var = (c6) this.b;
                ArrayList arrayList3 = (ArrayList) this.c;
                int size3 = arrayList3.size();
                int i13 = 0;
                while (i13 < size3) {
                    f6 f6Var = (f6) arrayList3.get(i13);
                    File d = f6Var.d();
                    if (d == null || d.length() <= 0) {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        if (!arrayList.contains(f6Var.o)) {
                            arrayList.add(f6Var.o);
                        }
                    } else {
                        arrayList3.remove(i13);
                        i13--;
                        size3--;
                    }
                    i13++;
                }
                if (arrayList == null) {
                    return;
                }
                TL_account.getMultiWallPapers getmultiwallpapers = new TL_account.getMultiWallPapers();
                int size4 = arrayList.size();
                for (int i14 = 0; i14 < size4; i14++) {
                    TLRPC.TL_inputWallPaperSlug tL_inputWallPaperSlug = new TLRPC.TL_inputWallPaperSlug();
                    tL_inputWallPaperSlug.slug = (String) arrayList.get(i14);
                    getmultiwallpapers.wallpapers.add(tL_inputWallPaperSlug);
                }
                ConnectionsManager.getInstance(c6Var.a).sendRequest(getmultiwallpapers, new ai.g(27, c6Var, arrayList3));
                return;
            case 27:
                c6 c6Var2 = (c6) this.b;
                b6 b6Var = (b6) this.c;
                TLRPC.TL_wallPaper tL_wallPaper = b6Var.a;
                File pathToAttach = FileLoader.getInstance(UserConfig.selectedAccount).getPathToAttach(tL_wallPaper.document, true);
                ArrayList arrayList4 = b6Var.b;
                int size5 = arrayList4.size();
                ArrayList arrayList5 = null;
                for (int i15 = 0; i15 < size5; i15++) {
                    f6 f6Var2 = (f6) arrayList4.get(i15);
                    if (f6Var2.o.equals(tL_wallPaper.slug)) {
                        Bitmap b10 = c6.b(bitmap, "application/x-tgwallpattern".equals(tL_wallPaper.document.mime_type), pathToAttach, f6Var2);
                        if (arrayList5 == null) {
                            arrayList5 = new ArrayList();
                            arrayList5.add(f6Var2);
                        }
                        bitmap = b10;
                    }
                }
                if (bitmap != null) {
                    bitmap.recycle();
                }
                AndroidUtilities.runOnUIThread(new y7(c6Var2, arrayList5, (boolean) r11, 13));
                return;
            case 28:
                g6 g6Var = (g6) this.b;
                g6Var.d((File) this.c, g6Var.h0);
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.p(g6Var, 19));
                return;
            default:
                ((org.telegram.ui.p) this.b).X((TLRPC.TL_messages_archivedStickers) this.c);
                return;
        }
    }
}
