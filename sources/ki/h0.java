package ki;

import ai.v1;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.os.Looper;
import android.os.ResultReceiver;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import ii.n4;
import java.io.File;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import m4.a1;
import m4.e1;
import m4.k1;
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
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.e60;
import org.telegram.ui.Components.so0;
import org.telegram.ui.Components.tr;
import org.telegram.ui.il;
import org.telegram.ui.z31;
import rg.y0;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes4.dex */
public final /* synthetic */ class h0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ h0(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        k1 k1Var;
        int i10 = this.a;
        int i11 = 4;
        ArrayList arrayList = null;
        Bitmap bitmap = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        int i12 = 1;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i10) {
            case 0:
                s0 s0Var = (s0) ((n4) obj2).b;
                s0Var.N++;
                s0Var.w = true;
                s0Var.m.b("camera switch started: target=" + ((l0) obj));
                e60 e60Var = (e60) s0Var.d.b;
                il ilVar = e60Var.E;
                FrameLayout frameLayout = e60Var.x;
                e60Var.s(false);
                Bitmap bitmap2 = e60Var.m0;
                if (bitmap2 != null) {
                    ilVar.setImageBitmap(bitmap2);
                    e60Var.l0 = true;
                    ilVar.animate().cancel();
                    ilVar.setAlpha(1.0f);
                }
                frameLayout.animate().cancel();
                frameLayout.setCameraDistance(frameLayout.getMeasuredHeight() * 8.0f);
                frameLayout.animate().rotationY(90.0f).setDuration(120L).start();
                s0Var.o();
                break;
            case 1:
                ((s0) ((n4) obj2).b).h((Exception) obj);
                break;
            case 2:
                ((i9.c0) obj).m(Boolean.valueOf(((m4.a0) obj2).o()));
                break;
            case 3:
                ((m4.a0) obj2).getClass();
                ((Runnable) obj).run();
                break;
            case 4:
                ((m4.a0) obj2).u(null, (e1) obj);
                break;
            case 5:
                ResultReceiver resultReceiver = (ResultReceiver) obj;
                try {
                    k1Var = (k1) ((i9.u) obj2).a;
                    e2.d.e(k1Var, "SessionResult must not be null");
                } catch (InterruptedException e7) {
                    e = e7;
                    e2.a.o("MediaSessionLegacyStub", "Custom command failed", e);
                    k1Var = new k1(-1);
                } catch (CancellationException e10) {
                    e2.a.o("MediaSessionLegacyStub", "Custom command cancelled", e10);
                    k1Var = new k1(1);
                } catch (ExecutionException e11) {
                    e = e11;
                    e2.a.o("MediaSessionLegacyStub", "Custom command failed", e);
                    k1Var = new k1(-1);
                }
                resultReceiver.send(k1Var.a, k1Var.b);
                break;
            case 6:
                qi.f fVar = ((a1) obj2).b;
                m4.r t10 = fVar.t(((m4.i) obj).asBinder());
                if (t10 != null) {
                    fVar.M(t10);
                    break;
                }
                break;
            case 7:
                ((a1) obj2).b.n((m4.r) obj);
                break;
            case 8:
                me.b bVar = (me.b) obj2;
                View view = (View) obj;
                me.a aVar = bVar.a;
                if ((bVar.c & 2) != 0) {
                    if (aVar.onLongPressRequestedAt(view, bVar.d, bVar.e)) {
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
                        bVar.c = (bVar.c | 4) & (-11);
                        bVar.b = null;
                        break;
                    } else {
                        bVar.c |= 8;
                        break;
                    }
                }
                break;
            case 9:
                n2.e eVar = (n2.e) obj2;
                b2.s sVar = (b2.s) obj;
                n2.f fVar2 = eVar.d;
                if (fVar2.E != 0 && !eVar.c) {
                    Looper looper = fVar2.I;
                    looper.getClass();
                    eVar.b = fVar2.a(looper, eVar.a, sVar, false);
                    fVar2.x.add(eVar);
                    break;
                }
                break;
            case 10:
                ((p2.b) ((o2.k) ((o2.q) obj2).c.b).b.d.get(((o2.j) obj).x)).c(true);
                break;
            case 11:
                ((VideoAds) obj2).lambda$showPremium$19((y0) obj);
                break;
            case 12:
                ((VideoAds) obj2).lambda$load$0((TLObject) obj);
                break;
            case 13:
                ((VideoAds) obj2).lambda$show$16((Utilities.Callback) obj);
                break;
            case 14:
                z31.R((Context) obj2, null, false, (ai.a1) obj, null);
                break;
            case 15:
                ((ConferenceCall) obj2).lambda$processUpdates$4((TLRPC.Updates) obj);
                break;
            case 16:
                VideoCapturerDevice.lambda$checkScreenCapturerSize$1((VideoCapturerDevice) obj2, (Point) obj);
                break;
            case 17:
                ((VideoCapturerDevice) obj2).lambda$init$4((String) obj);
                break;
            case 18:
                ((VoIPService) obj2).lambda$startGroupCall$21((TL_update.TL_updateGroupCall) obj);
                break;
            case 19:
                ((VoIPService) obj2).lambda$createGroupInstance$71((String) obj);
                break;
            case 20:
                ((VoIPService) obj2).lambda$startConferenceGroupCall$56((org.telegram.messenger.voip.m0) obj);
                break;
            case 21:
                ((VoIPService) obj2).lambda$startScreenCapture$58((TLRPC.Updates) obj);
                break;
            case 22:
                ((AudioManager) obj2).setCommunicationDevice((AudioDeviceInfo) obj);
                break;
            case 23:
                ((VoipAudioManager) obj2).lambda$isBluetoothAndSpeakerOnAsync$4((Utilities.Callback2) obj);
                break;
            case 24:
                org.telegram.ui.ActionBar.k kVar = (org.telegram.ui.ActionBar.k) obj2;
                boolean canScrollVertically = ((so0) obj).canScrollVertically(-1);
                boolean z10 = !canScrollVertically;
                if (kVar.s1 != z10) {
                    ValueAnimator valueAnimator = kVar.u1;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    float f11 = kVar.t1;
                    kVar.s1 = z10;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, canScrollVertically ? 0.0f : 1.0f);
                    kVar.u1 = ofFloat;
                    ofFloat.addUpdateListener(new org.telegram.ui.ActionBar.a(kVar, objArr == true ? 1 : 0));
                    kVar.u1.addListener(new org.telegram.ui.ActionBar.c(kVar, z10, i12));
                    kVar.u1.setDuration(320L);
                    kVar.u1.setInterpolator(tr.h);
                    kVar.u1.start();
                    break;
                }
                break;
            case 25:
                org.telegram.ui.ActionBar.k kVar2 = (org.telegram.ui.ActionBar.k) obj2;
                boolean canScrollVertically2 = ((RecyclerView) obj).canScrollVertically(-1);
                boolean z11 = !canScrollVertically2;
                if (kVar2.s1 != z11) {
                    ValueAnimator valueAnimator2 = kVar2.u1;
                    if (valueAnimator2 != null) {
                        valueAnimator2.cancel();
                    }
                    float f12 = kVar2.t1;
                    kVar2.s1 = z11;
                    ValueAnimator ofFloat2 = ValueAnimator.ofFloat(f12, canScrollVertically2 ? 0.0f : 1.0f);
                    kVar2.u1 = ofFloat2;
                    ofFloat2.addUpdateListener(new org.telegram.ui.ActionBar.a(kVar2, i11));
                    kVar2.u1.addListener(new org.telegram.ui.ActionBar.c(kVar2, z11, objArr2 == true ? 1 : 0));
                    kVar2.u1.setDuration(320L);
                    kVar2.u1.setInterpolator(tr.h);
                    kVar2.u1.start();
                    break;
                }
                break;
            case 26:
                ActionBarLayout actionBarLayout = (ActionBarLayout) obj2;
                Drawable drawable = ActionBarLayout.p1;
                actionBarLayout.b0((n2) obj, false);
                actionBarLayout.setVisibility(8);
                View view2 = actionBarLayout.B0;
                if (view2 != null) {
                    view2.setVisibility(8);
                    break;
                }
                break;
            case 27:
                n2 n2Var = (n2) obj2;
                n2 n2Var2 = (n2) obj;
                Drawable drawable2 = ActionBarLayout.p1;
                if (n2Var != null) {
                    n2Var.onTransitionAnimationEnd(false, false);
                }
                n2Var2.onTransitionAnimationEnd(true, false);
                n2Var2.onBecomeFullyVisible();
                break;
            case 28:
                c6 c6Var = (c6) obj2;
                ArrayList arrayList2 = (ArrayList) obj;
                int size = arrayList2.size();
                int i13 = 0;
                while (i13 < size) {
                    f6 f6Var = (f6) arrayList2.get(i13);
                    File d = f6Var.d();
                    if (d == null || d.length() <= 0) {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        if (!arrayList.contains(f6Var.o)) {
                            arrayList.add(f6Var.o);
                        }
                    } else {
                        arrayList2.remove(i13);
                        i13--;
                        size--;
                    }
                    i13++;
                }
                if (arrayList != null) {
                    TL_account.getMultiWallPapers getmultiwallpapers = new TL_account.getMultiWallPapers();
                    int size2 = arrayList.size();
                    for (int i14 = 0; i14 < size2; i14++) {
                        TLRPC.TL_inputWallPaperSlug tL_inputWallPaperSlug = new TLRPC.TL_inputWallPaperSlug();
                        tL_inputWallPaperSlug.slug = (String) arrayList.get(i14);
                        getmultiwallpapers.wallpapers.add(tL_inputWallPaperSlug);
                    }
                    ConnectionsManager.getInstance(c6Var.a).sendRequest(getmultiwallpapers, new v1(20, c6Var, arrayList2));
                    break;
                }
                break;
            default:
                c6 c6Var2 = (c6) obj2;
                b6 b6Var = (b6) obj;
                TLRPC.TL_wallPaper tL_wallPaper = b6Var.a;
                File pathToAttach = FileLoader.getInstance(UserConfig.selectedAccount).getPathToAttach(tL_wallPaper.document, true);
                ArrayList arrayList3 = b6Var.b;
                int size3 = arrayList3.size();
                ArrayList arrayList4 = null;
                for (int i15 = 0; i15 < size3; i15++) {
                    f6 f6Var2 = (f6) arrayList3.get(i15);
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
                AndroidUtilities.runOnUIThread(new ci.y0((Object) c6Var2, (Object) arrayList4, (boolean) (objArr3 == true ? 1 : 0), 11));
                break;
        }
    }

    public /* synthetic */ h0(m4.a0 a0Var, m4.r rVar, Runnable runnable) {
        this.a = 3;
        this.b = a0Var;
        this.c = runnable;
    }
}
