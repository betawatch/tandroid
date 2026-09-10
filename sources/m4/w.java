package m4;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.os.ResultReceiver;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import bi.o2;
import java.io.File;
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
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Components.bq0;
import org.telegram.ui.Components.io0;
import org.telegram.ui.Components.wr;
import org.telegram.ui.n41;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final /* synthetic */ class w implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ w(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        r1 r1Var;
        int i10 = this.a;
        int i11 = 4;
        ArrayList arrayList = null;
        Bitmap bitmap = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        int i12 = 1;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i10) {
            case 0:
                ((i9.c0) obj).m(Boolean.valueOf(((b0) obj2).o()));
                break;
            case 1:
                ((b0) obj2).getClass();
                ((Runnable) obj).run();
                break;
            case 2:
                ((b0) obj2).u(null, (l1) obj);
                break;
            case 3:
                ResultReceiver resultReceiver = (ResultReceiver) obj;
                try {
                    r1Var = (r1) ((i9.u) obj2).a;
                    e2.d.e(r1Var, "SessionResult must not be null");
                } catch (InterruptedException e) {
                    e = e;
                    e2.a.o("MediaSessionLegacyStub", "Custom command failed", e);
                    r1Var = new r1(-1);
                } catch (CancellationException e7) {
                    e2.a.o("MediaSessionLegacyStub", "Custom command cancelled", e7);
                    r1Var = new r1(1);
                } catch (ExecutionException e10) {
                    e = e10;
                    e2.a.o("MediaSessionLegacyStub", "Custom command failed", e);
                    r1Var = new r1(-1);
                }
                resultReceiver.send(r1Var.a, r1Var.b);
                break;
            case 4:
                ki.f fVar = ((h1) obj2).b;
                r s10 = fVar.s(((i) obj).asBinder());
                if (s10 != null) {
                    fVar.K(s10);
                    break;
                }
                break;
            case 5:
                ((h1) obj2).b.n((r) obj);
                break;
            case 6:
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
            case 7:
                n2.d dVar = (n2.d) obj2;
                b2.s sVar = (b2.s) obj;
                n2.e eVar = dVar.d;
                if (eVar.E != 0 && !dVar.c) {
                    Looper looper = eVar.I;
                    looper.getClass();
                    dVar.b = eVar.a(looper, dVar.a, sVar, false);
                    eVar.x.add(dVar);
                    break;
                }
                break;
            case 8:
                ((p2.b) ((o2.k) ((o2.q) obj2).c.a).b.d.get(((o2.j) obj).x)).c(true);
                break;
            case 9:
                og.v0 v0Var = (og.v0) obj2;
                v0Var.v = true;
                ByteBuffer byteBuffer = (ByteBuffer) v0Var.h(v0Var.f(), true, false, false).c;
                RectF f11 = v0Var.f();
                Object obj3 = v0Var.a.b;
                v0Var.w = new a5.a(byteBuffer, 0, f11);
                v0Var.a(false);
                ((og.c1) obj).run();
                break;
            case 10:
                Runnable runnable = (Runnable) obj;
                og.f1 f1Var = ((og.h1) obj2).d;
                if (f1Var != null && f1Var.f) {
                    og.f1.b(f1Var);
                    runnable.run();
                    break;
                }
                break;
            case 11:
                ((VideoAds) obj2).lambda$showPremium$19((qg.a1) obj);
                break;
            case 12:
                ((VideoAds) obj2).lambda$load$0((TLObject) obj);
                break;
            case 13:
                ((VideoAds) obj2).lambda$show$16((Utilities.Callback) obj);
                break;
            case 14:
                n41.T((Context) obj2, null, false, (bq0) obj, null);
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
                ((VoIPService) obj2).lambda$startConferenceGroupCall$56((org.telegram.messenger.voip.o0) obj);
                break;
            case 21:
                ((VoIPService) obj2).lambda$startScreenCapture$58((TLRPC.Updates) obj);
                break;
            case 22:
                ((VoipAudioManager) obj2).lambda$isBluetoothAndSpeakerOnAsync$2((Utilities.Callback2) obj);
                break;
            case 23:
                org.telegram.ui.ActionBar.l lVar = (org.telegram.ui.ActionBar.l) obj2;
                boolean canScrollVertically = ((io0) obj).canScrollVertically(-1);
                boolean z10 = !canScrollVertically;
                if (lVar.q1 != z10) {
                    ValueAnimator valueAnimator = lVar.s1;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    float f12 = lVar.r1;
                    lVar.q1 = z10;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f12, canScrollVertically ? 0.0f : 1.0f);
                    lVar.s1 = ofFloat;
                    ofFloat.addUpdateListener(new org.telegram.ui.ActionBar.a(lVar, i11));
                    lVar.s1.addListener(new org.telegram.ui.ActionBar.c(lVar, z10, i12));
                    lVar.s1.setDuration(320L);
                    lVar.s1.setInterpolator(wr.h);
                    lVar.s1.start();
                    break;
                }
                break;
            case 24:
                org.telegram.ui.ActionBar.l lVar2 = (org.telegram.ui.ActionBar.l) obj2;
                boolean canScrollVertically2 = ((RecyclerView) obj).canScrollVertically(-1);
                boolean z11 = !canScrollVertically2;
                if (lVar2.q1 != z11) {
                    ValueAnimator valueAnimator2 = lVar2.s1;
                    if (valueAnimator2 != null) {
                        valueAnimator2.cancel();
                    }
                    float f13 = lVar2.r1;
                    lVar2.q1 = z11;
                    ValueAnimator ofFloat2 = ValueAnimator.ofFloat(f13, canScrollVertically2 ? 0.0f : 1.0f);
                    lVar2.s1 = ofFloat2;
                    ofFloat2.addUpdateListener(new org.telegram.ui.ActionBar.a(lVar2, 3));
                    lVar2.s1.addListener(new org.telegram.ui.ActionBar.c(lVar2, z11, objArr == true ? 1 : 0));
                    lVar2.s1.setDuration(320L);
                    lVar2.s1.setInterpolator(wr.h);
                    lVar2.s1.start();
                    break;
                }
                break;
            case 25:
                ActionBarLayout actionBarLayout = (ActionBarLayout) obj2;
                Drawable drawable = ActionBarLayout.p1;
                actionBarLayout.b0((p2) obj, false);
                actionBarLayout.setVisibility(8);
                View view2 = actionBarLayout.B0;
                if (view2 != null) {
                    view2.setVisibility(8);
                    break;
                }
                break;
            case 26:
                p2 p2Var = (p2) obj2;
                p2 p2Var2 = (p2) obj;
                Drawable drawable2 = ActionBarLayout.p1;
                if (p2Var != null) {
                    p2Var.onTransitionAnimationEnd(false, false);
                }
                p2Var2.onTransitionAnimationEnd(true, false);
                p2Var2.onBecomeFullyVisible();
                break;
            case 27:
                e6 e6Var = (e6) obj2;
                ArrayList arrayList2 = (ArrayList) obj;
                int size = arrayList2.size();
                int i13 = 0;
                while (i13 < size) {
                    h6 h6Var = (h6) arrayList2.get(i13);
                    File d = h6Var.d();
                    if (d == null || d.length() <= 0) {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        if (!arrayList.contains(h6Var.o)) {
                            arrayList.add(h6Var.o);
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
                    ConnectionsManager.getInstance(e6Var.a).sendRequest(getmultiwallpapers, new o2(15, e6Var, arrayList2));
                    break;
                }
                break;
            case 28:
                e6 e6Var2 = (e6) obj2;
                d6 d6Var = (d6) obj;
                TLRPC.TL_wallPaper tL_wallPaper = d6Var.a;
                File pathToAttach = FileLoader.getInstance(UserConfig.selectedAccount).getPathToAttach(tL_wallPaper.document, true);
                ArrayList arrayList3 = d6Var.b;
                int size3 = arrayList3.size();
                ArrayList arrayList4 = null;
                for (int i15 = 0; i15 < size3; i15++) {
                    h6 h6Var2 = (h6) arrayList3.get(i15);
                    if (h6Var2.o.equals(tL_wallPaper.slug)) {
                        Bitmap b10 = e6.b(bitmap, "application/x-tgwallpattern".equals(tL_wallPaper.document.mime_type), pathToAttach, h6Var2);
                        if (arrayList4 == null) {
                            arrayList4 = new ArrayList();
                            arrayList4.add(h6Var2);
                        }
                        bitmap = b10;
                    }
                }
                if (bitmap != null) {
                    bitmap.recycle();
                }
                AndroidUtilities.runOnUIThread(new bi.c1((Object) e6Var2, (Object) arrayList4, (boolean) (objArr2 == true ? 1 : 0), 10));
                break;
            default:
                i6 i6Var = (i6) obj2;
                i6Var.d((File) obj, i6Var.h0);
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.q(i6Var, 19));
                break;
        }
    }

    public /* synthetic */ w(b0 b0Var, r rVar, Runnable runnable) {
        this.a = 1;
        this.b = b0Var;
        this.c = runnable;
    }
}
