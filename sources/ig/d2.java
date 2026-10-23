package ig;

import ai.va;
import android.content.Context;
import android.content.SharedPreferences;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Handler;
import android.text.SpannableString;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import ei.bc;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.concurrent.ScheduledExecutorService;
import ki.b6;
import ki.c6;
import ki.e3;
import ki.e6;
import ki.j3;
import ki.o5;
import ki.w3;
import ki.w5;
import ki.z5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.video.VideoAds;
import org.telegram.messenger.video.VideoPlayerHolderBase;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.n3;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.ActionBar.p3;
import org.telegram.ui.ActionBar.q3;
import org.telegram.ui.Cells.la;
import org.telegram.ui.Cells.na;
import org.telegram.ui.Components.ew0;
import org.telegram.ui.Components.f5;
import org.telegram.ui.Components.ff;
import org.telegram.ui.Components.j80;
import org.telegram.ui.Components.k8;
import org.telegram.ui.Components.lg;
import org.telegram.ui.Components.ng;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.vp0;
import org.telegram.ui.sn;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final /* synthetic */ class d2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ d2(Object obj, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    /* JADX WARN: Type inference failed for: r2v41, types: [java.lang.Object, n2.l] */
    /* JADX WARN: Type inference failed for: r2v42, types: [java.lang.Object, n2.l] */
    @Override // java.lang.Runnable
    public final void run() {
        ViewGroup viewGroup;
        int i10 = 8;
        int i11 = 0;
        switch (this.a) {
            case 0:
                e2 e2Var = (e2) this.b;
                TLObject tLObject = (TLObject) this.c;
                SharedPreferences sharedPreferences = (SharedPreferences) this.d;
                ArrayList arrayList = e2Var.d;
                if (tLObject instanceof TLRPC.TL_help_timezonesList) {
                    arrayList.clear();
                    arrayList.addAll(((TLRPC.TL_help_timezonesList) tLObject).timezones);
                    SerializedData serializedData = new SerializedData(tLObject.getObjectSize());
                    tLObject.serializeToStream(serializedData);
                    sharedPreferences.edit().putString("timezones", Utilities.bytesToHex(serializedData.toByteArray())).apply();
                    NotificationCenter.getInstance(e2Var.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.timezonesUpdated, new Object[0]);
                }
                e2Var.c = true;
                e2Var.b = false;
                return;
            case 1:
                qf.b bVar = (qf.b) this.b;
                b2.w wVar = (b2.w) this.c;
                i2.f fVar = (i2.f) this.d;
                k2.v vVar = (k2.v) bVar.c;
                String str = e2.m0.a;
                j2.e eVar = ((i2.b0) vVar).a.s;
                j2.a p5 = eVar.p();
                eVar.q(p5, 1009, new j2.d(p5, wVar, fVar, i10));
                return;
            case 2:
                AudioTrack audioTrack = (AudioTrack) this.b;
                Handler handler = (Handler) this.c;
                e2.r rVar = (e2.r) this.d;
                int i12 = 27;
                try {
                    audioTrack.flush();
                    audioTrack.release();
                    if (handler.getLooper().getThread().isAlive()) {
                        handler.post(new bc(rVar, i12));
                    }
                    synchronized (k2.i0.t) {
                        try {
                            int i13 = k2.i0.v - 1;
                            k2.i0.v = i13;
                            if (i13 == 0) {
                                ScheduledExecutorService scheduledExecutorService = k2.i0.u;
                                scheduledExecutorService.getClass();
                                scheduledExecutorService.shutdown();
                                k2.i0.u = null;
                            }
                        } finally {
                        }
                    }
                    return;
                } catch (Throwable th2) {
                    if (handler.getLooper().getThread().isAlive()) {
                        handler.post(new bc(rVar, i12));
                    }
                    synchronized (k2.i0.t) {
                        try {
                            int i14 = k2.i0.v - 1;
                            k2.i0.v = i14;
                            if (i14 == 0) {
                                ScheduledExecutorService scheduledExecutorService2 = k2.i0.u;
                                scheduledExecutorService2.getClass();
                                scheduledExecutorService2.shutdown();
                                k2.i0.u = null;
                            }
                            throw th2;
                        } finally {
                        }
                    }
                }
            case 3:
                w3 w3Var = (w3) this.b;
                j80 j80Var = (j80) this.c;
                o5 o5Var = (o5) this.d;
                if (w3Var.k4 != j80Var) {
                    return;
                }
                w3Var.k4 = null;
                if (w3Var.D3 && w3Var.j4 == o5Var && !o5Var.H.isEmpty()) {
                    w3Var.S2();
                    return;
                }
                return;
            case 4:
                w3 w3Var2 = (w3) this.b;
                ki.a aVar = (ki.a) this.c;
                ki.a aVar2 = (ki.a) this.d;
                ArrayList arrayList2 = w3Var2.q4;
                j3 j3Var = w3Var2.o3;
                if (j3Var == null || aVar == null || aVar2 == null) {
                    return;
                }
                int indexOf = arrayList2.indexOf(aVar);
                int indexOf2 = arrayList2.indexOf(aVar2);
                if (indexOf < 0 || indexOf2 < 0) {
                    return;
                }
                while (i11 < arrayList2.size()) {
                    ki.a aVar3 = (ki.a) arrayList2.get(i11);
                    long j10 = aVar3.t;
                    if (j10 != 0) {
                        j3Var.X(i11, e6.l((TL_iv.RichText) w3Var2.n3.get(Long.valueOf(j10))));
                    } else {
                        j3Var.X(i11, c6.y(aVar3.b));
                    }
                    i11++;
                }
                j3Var.i0(Math.min(indexOf, indexOf2), Math.max(indexOf, indexOf2));
                return;
            case 5:
                ((w3) this.b).f5((String) this.d, (ki.a) this.c);
                return;
            case 6:
                w5 w5Var = (w5) this.b;
                ki.a aVar4 = (ki.a) this.c;
                b6 b6Var = (b6) this.d;
                z5 z5Var = w5Var.a.y;
                if (z5Var != null) {
                    ((e3) z5Var).d(aVar4, b6Var.a, b6Var.b, b6Var.c, b6Var.d, b6Var.e);
                    return;
                }
                return;
            case 7:
                li.m mVar = (li.m) this.b;
                ArrayList arrayList3 = (ArrayList) this.c;
                ArrayList arrayList4 = (ArrayList) this.d;
                mVar.getClass();
                for (int i15 = 0; i15 < arrayList3.size(); i15++) {
                    ((View) arrayList3.get(i15)).setVisibility(0);
                }
                if (mVar.A.removeAll(arrayList4)) {
                    while (i11 < arrayList4.size()) {
                        mVar.d((s4.b1) arrayList4.get(i11));
                        i11++;
                    }
                    mVar.G();
                }
                mVar.K.removeAll(arrayList3);
                return;
            case 8:
                li.m mVar2 = (li.m) this.b;
                View view = (View) this.c;
                s4.b1 b1Var = (s4.b1) this.d;
                mVar2.getClass();
                view.setVisibility(0);
                if (mVar2.A.remove(b1Var)) {
                    mVar2.d(b1Var);
                    mVar2.G();
                }
                mVar2.K.remove(view);
                return;
            case 9:
                m4.b0 b0Var = (m4.b0) this.b;
                m4.v vVar2 = (m4.v) this.c;
                KeyEvent keyEvent = (KeyEvent) this.d;
                m4.f0 f0Var = b0Var.b;
                if (f0Var.i(vVar2)) {
                    f0Var.b(keyEvent, false, false);
                } else {
                    m4.p0 p0Var = f0Var.h;
                    n4.t tVar = vVar2.a;
                    tVar.getClass();
                    p0Var.getClass();
                    p0Var.H(1, new m4.i0(p0Var, 9), tVar, true);
                }
                b0Var.a = null;
                return;
            case 10:
                m4.f0 f0Var2 = (m4.f0) this.b;
                m4.v0 v0Var = (m4.v0) this.c;
                m4.w wVar2 = (m4.w) this.d;
                if (f0Var2.j()) {
                    return;
                }
                m4.m1 m1Var = f0Var2.t;
                v0Var.getClass();
                w7.v.b(m1Var, wVar2);
                return;
            case 11:
                SpannableString spannableString = (SpannableString) this.b;
                mi.q qVar = (mi.q) this.c;
                va vaVar = (va) this.d;
                mi.k.a(spannableString, spannableString.length(), (com.google.android.gms.internal.play_billing.s0) qVar.b);
                vaVar.run(spannableString);
                return;
            case 12:
                n2.k kVar = (n2.k) this.b;
                this.c.b(kVar.a, kVar.b, (Exception) this.d);
                return;
            case 13:
                n2.k kVar2 = (n2.k) this.b;
                this.c.c(kVar2.a, kVar2.b, (oa.d) this.d);
                return;
            case 14:
                ((VideoAds) this.b).lambda$show$3((qc) this.c, (TLRPC.TL_sponsoredMessage) this.d);
                return;
            case 15:
                ((VideoAds) this.b).lambda$show$5((qc) this.c, (boolean[]) this.d);
                return;
            case 16:
                ((VideoPlayerHolderBase) this.b).lambda$release$3((TLRPC.Document) this.c, (Runnable) this.d);
                return;
            case 17:
                ((Utilities.Callback2) this.b).run((TLObject) this.c, (TLRPC.TL_error) this.d);
                return;
            case 18:
                ((Utilities.Callback2) this.b).run((TLRPC.Updates) this.c, (TLRPC.TL_error) this.d);
                return;
            case 19:
                ActionBarLayout actionBarLayout = (ActionBarLayout) this.b;
                o2 o2Var = (o2) this.c;
                o2 o2Var2 = (o2) this.d;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = actionBarLayout.J;
                if (actionBarPopupWindow$ActionBarPopupWindowLayout != null && (viewGroup = (ViewGroup) actionBarPopupWindow$ActionBarPopupWindowLayout.getParent()) != null) {
                    viewGroup.removeView(actionBarLayout.J);
                }
                if (actionBarLayout.h || actionBarLayout.a0) {
                    actionBarLayout.v.setScaleX(1.0f);
                    actionBarLayout.v.setScaleY(1.0f);
                    actionBarLayout.h = false;
                    actionBarLayout.J = null;
                    actionBarLayout.a0 = false;
                } else {
                    actionBarLayout.v.setTranslationX(0.0f);
                }
                actionBarLayout.m(o2Var);
                o2Var.setRemovingFromStack(false);
                o2Var.onTransitionAnimationEnd(false, true);
                o2Var2.onTransitionAnimationEnd(true, true);
                o2Var2.onBecomeFullyVisible();
                return;
            case 20:
                q3 q3Var = (q3) this.b;
                ((o2) this.c).presentFragment((sn) this.d);
                q3Var.c = false;
                return;
            case 21:
                q3 q3Var2 = (q3) this.b;
                ArrayList arrayList5 = (ArrayList) this.c;
                p3 p3Var = (p3) this.d;
                q3Var2.getClass();
                while (i11 < arrayList5.size()) {
                    if (((n3) arrayList5.get(i11)).a == p3Var) {
                        arrayList5.remove(i11);
                        i11--;
                    }
                    i11++;
                }
                q3Var2.invalidate();
                return;
            case 22:
                j6 j6Var = (j6) this.b;
                TLObject tLObject2 = (TLObject) this.c;
                j6 j6Var2 = (j6) this.d;
                if (!(tLObject2 instanceof TLRPC.TL_wallPaper)) {
                    j6Var.s();
                    return;
                }
                TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) tLObject2;
                j6Var.g0 = FileLoader.getAttachFileName(tL_wallPaper.document);
                NotificationCenter.getInstance(j6Var.E).addObserver(j6Var, NotificationCenter.fileLoaded);
                NotificationCenter.getInstance(j6Var.E).addObserver(j6Var, NotificationCenter.fileLoadFailed);
                FileLoader.getInstance(j6Var2.E).loadFile(tL_wallPaper.document, tL_wallPaper, 1, 1);
                return;
            case 23:
                org.telegram.ui.Cells.v0 v0Var2 = (org.telegram.ui.Cells.v0) this.b;
                org.telegram.ui.Wallet.o5.B0(v0Var2.getContext(), v0Var2.H, (TL_wallet.walletTransaction) this.c, null, null, null, (org.telegram.ui.Cells.o0) this.d, v0Var2.g1);
                return;
            case 24:
                org.telegram.ui.Cells.v0 v0Var3 = (org.telegram.ui.Cells.v0) this.b;
                v0Var3.f1.C1(v0Var3, (TLRPC.TL_premiumGiftOption) this.c, (String) this.d);
                return;
            case 25:
                na naVar = (na) this.b;
                j6 j6Var3 = (j6) this.c;
                j6Var3.f = true ^ j6Var3.d((File) this.d, j6Var3.c);
                AndroidUtilities.runOnUIThread(new la(i10, naVar, j6Var3));
                return;
            case 26:
                org.telegram.ui.Components.e0 e0Var = (org.telegram.ui.Components.e0) this.b;
                f5.M((Context) this.c, e0Var.l0, new k2.w0(e0Var, 10), (g6) this.d);
                return;
            case 27:
                k8.r((k8) this.b, (org.telegram.ui.ActionBar.c2) this.d, (TLObject) this.c);
                return;
            case 28:
                ff ffVar = (ff) this.b;
                ew0 ew0Var = (ew0) this.c;
                vp0 vp0Var = (vp0) this.d;
                ffVar.getClass();
                ew0Var.getViewTreeObserver().removeOnDrawListener(ffVar);
                vp0Var.a.setHideAvatar(true);
                return;
            default:
                ng ngVar = (ng) this.b;
                Uri uri = (Uri) this.c;
                File file = (File) this.d;
                try {
                    InputStream openInputStream = ngVar.getContext().getContentResolver().openInputStream(uri);
                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int read = openInputStream.read(bArr);
                        if (read <= 0) {
                            openInputStream.close();
                            fileOutputStream.close();
                            MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, -1, 0L, file.getAbsolutePath(), 0, false, 0, 0, 0L);
                            ArrayList arrayList6 = new ArrayList();
                            arrayList6.add(photoEntry);
                            AndroidUtilities.runOnUIThread(new lg(ngVar, arrayList6, file, i11));
                            return;
                        }
                        fileOutputStream.write(bArr, 0, read);
                        fileOutputStream.flush();
                    }
                } catch (Throwable th3) {
                    th3.printStackTrace();
                    return;
                }
        }
    }

    public /* synthetic */ d2(k8 k8Var, org.telegram.ui.ActionBar.c2 c2Var, TLObject tLObject) {
        this.a = 27;
        this.b = k8Var;
        this.d = c2Var;
        this.c = tLObject;
    }
}
