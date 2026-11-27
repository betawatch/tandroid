// default package

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.NotificationManager;
import android.content.res.Resources;
import android.util.Property;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.concurrent.ExecutorService;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.messenger.FilesMigrationService;
import org.telegram.messenger.Intro;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Dictation.DictationLid;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Wallet.c;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class hl3 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ hl3(int i, Object obj, byte b) {
        this.a = b;
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00a9  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i;
        hyc hycVar;
        hyc hycVar2;
        SQLiteCursor sQLiteCursor;
        byte b = this.a;
        SQLiteCursor sQLiteCursor2 = null;
        byte b2 = 2;
        int i2 = this.b;
        Object obj = this.c;
        switch (b) {
            case 0:
                ((tl3) obj).g(i2);
                return;
            case 1:
                ExecutorService executorService = DictationLid.a;
                ((ln3) obj).a(null, 0L, i2);
                return;
            case 2:
                ExecutorService executorService2 = DictationLid.a;
                ((rx1) obj).a(Integer.valueOf(i2));
                return;
            case 3:
                ((zw3) obj).I0(i2);
                return;
            case 4:
                o24 o24Var = (o24) obj;
                if (o24Var.Q1) {
                    p14 p14Var = o24Var.u1;
                    if (p14Var != null && p14Var.l()) {
                        try {
                            o24Var.y.performHapticFeedback(3);
                        } catch (Exception unused) {
                        }
                    }
                    o24Var.R1 = true;
                    int max = Math.max(50, i2 - 100);
                    hl.d3(new hl3((Object) o24Var, max, (byte) 4), max);
                    return;
                }
                return;
            case 5:
                h44 h44Var = (h44) obj;
                h44Var.N = i2;
                h44Var.M = true;
                try {
                    h44Var.performHapticFeedback(3, 2);
                } catch (Exception unused2) {
                }
                ValueAnimator valueAnimator = h44Var.R;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                ValueAnimator valueAnimator2 = h44Var.S;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
                ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
                h44Var.R = duration;
                duration.setInterpolator(k43.f);
                h44Var.R.addUpdateListener(new d44(h44Var, (byte) 5));
                h44Var.R.addListener(new e44(h44Var, b2));
                h44Var.R.start();
                return;
            case 6:
                ea3 ea3Var = ((c74) obj).N;
                uj Q = ea3Var.Q();
                ea3Var.V(Q, 1034, new uy2(Q, i2, (byte) 29));
                return;
            case 7:
                bf bfVar = (bf) obj;
                ((ja4) bfVar.c).a(bfVar.b, i2, (ArrayList) bfVar.d);
                return;
            case 8:
                FilesMigrationService filesMigrationService = (FilesMigrationService) obj;
                boolean z = FilesMigrationService.c;
                bs2.q();
                ((NotificationManager) filesMigrationService.getSystemService("notification")).notify(jn7.X4, gk.a(filesMigrationService, ip7.k0).setContentTitle(ob6.M0(2131748184, null)).setContentText(i2 + "/" + filesMigrationService.a).setSmallIcon(R.drawable.notification).setAutoCancel(false).setProgress(filesMigrationService.a, i2, false).build());
                return;
            case 9:
                ((j14) obj).y0(i2, 0, null);
                return;
            case 10:
                ((ow4) obj).G0(i2, true);
                return;
            case 11:
                c C = c.C(i2);
                jn7 f = jn7.f(i2);
                t25 t25Var = new t25(f, (z56) obj, C);
                f.a(t25Var, jn7.d4);
                hl.d3(t25Var, 10000L);
                if (C.e == null && C.C < 0) {
                    C.i0();
                }
                C.g0();
                t25Var.a();
                return;
            case 12:
                c cVar = (c) obj;
                HashSet hashSet = cVar.G;
                hashSet.remove(Integer.valueOf(i2));
                if (hashSet.isEmpty()) {
                    cVar.a0();
                    return;
                }
                return;
            case 13:
                jn7.f(i2).n((c55) obj, jn7.d4);
                return;
            case 14:
                j95 j95Var = ((m85) obj).b;
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                if (sharedInstance != null) {
                    sharedInstance.setAudioOutput(i2);
                    j95Var.n5 = Integer.valueOf(i2);
                }
                d31 d31Var = new d31(j95Var.F, new w53());
                Resources resources = j95Var.getContext().getResources();
                if (i2 == 2) {
                    i = R.drawable.msg_voice_bluetooth;
                } else if (i2 == 0) {
                    i = R.drawable.msg_voice_speaker;
                } else {
                    VoIPService sharedInstance2 = VoIPService.getSharedInstance();
                    i = (sharedInstance2 == null || !sharedInstance2.isHeadsetPlugged()) ? R.drawable.msg_voice_phone : R.drawable.msg_voice_headphones;
                }
                d31Var.M(resources.getDrawable(i).mutate(), j95.Y0(i2)).k(j95Var.g1());
                return;
            case 15:
                rc5 rc5Var = (rc5) obj;
                AnimatorSet animatorSet = new AnimatorSet();
                int childCount = rc5Var.n.getChildCount();
                for (int i3 = 0; i3 < childCount; i3++) {
                    View childAt = rc5Var.n.getChildAt(i3);
                    rc5Var.n.getClass();
                    if (RecyclerView.S(childAt) >= i2) {
                        childAt.setAlpha(0.0f);
                        int min = (int) ((Math.min(rc5Var.n.getMeasuredHeight(), Math.max(0, childAt.getTop())) / rc5Var.n.getMeasuredHeight()) * 100.0f);
                        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(childAt, (Property<View, Float>) View.ALPHA, 0.0f, 1.0f);
                        ofFloat.setStartDelay(min);
                        ofFloat.setDuration(200L);
                        animatorSet.playTogether(ofFloat);
                    }
                }
                animatorSet.start();
                return;
            case 16:
                xr5 xr5Var = (xr5) obj;
                int i4 = xr5.E;
                xr5Var.a(R.drawable.intro_powerful_mask, 17, i2, true);
                xr5Var.c();
                xr5Var.b(xr5Var.w, 23, true);
                xr5Var.d();
                Intro.a(i2);
                return;
            case 17:
                hc8 hc8Var = (hc8) obj;
                igb igbVar = hc8Var.u1;
                hc8Var.u0(igbVar, null);
                a78.e(i2).j(igbVar.c);
                return;
            case 18:
                String str = LaunchActivity.C1;
                ConnectionsManager.getInstance(((LaunchActivity) obj).P).cancelRequest(i2, true);
                return;
            case 19:
                ((df6) obj).a.f[i2].D(1.0f);
                return;
            case 20:
                MediaController mediaController = (MediaController) obj;
                String[] strArr = MediaController.W1;
                if (i2 == -1) {
                    if (mediaController.H(mediaController.v0) && !mediaController.G()) {
                        mediaController.U(mediaController.v0, true);
                    }
                    mediaController.V = (byte) 0;
                    mediaController.Y = (byte) 0;
                } else if (i2 == 1) {
                    mediaController.Y = (byte) 2;
                    if (mediaController.Z) {
                        mediaController.Z = false;
                        if (mediaController.H(mediaController.v0) && mediaController.G()) {
                            mediaController.V(mediaController.v0);
                        }
                    }
                } else if (i2 == -3) {
                    mediaController.Y = (byte) 1;
                } else if (i2 == -2) {
                    mediaController.Y = (byte) 0;
                    if (mediaController.H(mediaController.v0) && !mediaController.G()) {
                        mediaController.U(mediaController.v0, true);
                        mediaController.Z = true;
                    }
                }
                mediaController.p0();
                return;
            case 21:
                id idVar = (id) obj;
                String[] strArr2 = MediaController.W1;
                try {
                    idVar.n(i2);
                    return;
                } catch (Exception e) {
                    cc4.g(e, true);
                    return;
                }
            case 22:
                MediaController mediaController2 = ((ao6) obj).a;
                if (i2 == 1) {
                    if (mediaController2.H(mediaController2.v0) && !mediaController2.G()) {
                        mediaController2.U(mediaController2.v0, true);
                    } else if (mediaController2.I()) {
                        mediaController2.F0(2, 0, false, false);
                    }
                    iv3 iv3Var = iv3.R1;
                    if (iv3Var != null && (hycVar2 = iv3Var.m1) != null && hycVar2.x) {
                        hycVar2.a.f0();
                        hycVar2.n();
                        hycVar2.g0.d(true, true);
                    }
                    mediaController2.X = true;
                    return;
                }
                if (i2 == 0) {
                    mediaController2.X = false;
                    return;
                }
                if (i2 == 2) {
                    iv3 iv3Var2 = iv3.R1;
                    if (iv3Var2 != null && (hycVar = iv3Var2.m1) != null && hycVar.x) {
                        hycVar.a.f0();
                        hycVar.n();
                        hycVar.g0.d(true, true);
                    }
                    mediaController2.X = true;
                    return;
                }
                return;
            case 23:
                ls6 ls6Var = (ls6) obj;
                ls6Var.W[i2] = false;
                ls6Var.X[i2] = true;
                Runnable[] runnableArr = ls6Var.V;
                Runnable runnable = runnableArr[i2];
                if (runnable != null) {
                    runnable.run();
                    runnableArr[i2] = null;
                    return;
                }
                return;
            case 24:
                ((a37) obj).b.b.H(i2);
                return;
            case 25:
                TLRPC.TL_help_appConfig tL_help_appConfig = (TLRPC.TL_help_appConfig) obj;
                try {
                    SQLiteDatabase sQLiteDatabase = kf7.a0(i2).b;
                    if (sQLiteDatabase != null) {
                        sQLiteDatabase.executeFast("DELETE FROM app_config").stepThis().dispose();
                        if (tL_help_appConfig != null) {
                            SQLitePreparedStatement executeFast = sQLiteDatabase.executeFast("INSERT INTO app_config VALUES(?)");
                            executeFast.requery();
                            NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(tL_help_appConfig.getObjectSize());
                            tL_help_appConfig.serializeToStream(nativeByteBuffer);
                            executeFast.bindByteBuffer(1, nativeByteBuffer);
                            executeFast.step();
                            nativeByteBuffer.reuse();
                            executeFast.dispose();
                            return;
                        }
                        return;
                    }
                    return;
                } catch (Exception e2) {
                    cc4.g(e2, true);
                    return;
                }
            case 26:
                TLRPC.messages_AvailableEffects messages_availableeffects = (TLRPC.messages_AvailableEffects) obj;
                try {
                    SQLiteDatabase sQLiteDatabase2 = kf7.a0(i2).b;
                    if (sQLiteDatabase2 != null) {
                        sQLiteDatabase2.executeFast("DELETE FROM effects").stepThis().dispose();
                        if (messages_availableeffects != null) {
                            SQLitePreparedStatement executeFast2 = sQLiteDatabase2.executeFast("INSERT INTO effects VALUES(?)");
                            executeFast2.requery();
                            NativeByteBuffer nativeByteBuffer2 = new NativeByteBuffer(messages_availableeffects.getObjectSize());
                            messages_availableeffects.serializeToStream(nativeByteBuffer2);
                            executeFast2.bindByteBuffer(1, nativeByteBuffer2);
                            executeFast2.step();
                            nativeByteBuffer2.reuse();
                            executeFast2.dispose();
                            return;
                        }
                        return;
                    }
                    return;
                } catch (Exception e3) {
                    cc4.g(e3, true);
                    return;
                }
            case 27:
                icc iccVar = (icc) obj;
                try {
                    try {
                        SQLiteDatabase sQLiteDatabase3 = kf7.a0(i2).b;
                        if (sQLiteDatabase3 != null) {
                            sQLiteCursor = sQLiteDatabase3.queryFinalized("SELECT data FROM web_browser_settings", new Object[0]);
                            try {
                                TL_account.WebBrowserSettings webBrowserSettings = sQLiteCursor.next() ? (TL_account.WebBrowserSettings) sQLiteCursor.tlObjectValue(0, new hz6((byte) 12), true) : null;
                                if (webBrowserSettings instanceof TL_account.TL_webBrowserSettings) {
                                    TL_account.TL_webBrowserSettings tL_webBrowserSettings = (TL_account.TL_webBrowserSettings) webBrowserSettings;
                                    iccVar.a(Long.valueOf(tL_webBrowserSettings.hash), tL_webBrowserSettings);
                                } else {
                                    iccVar.a(0L, null);
                                }
                                sQLiteCursor2 = sQLiteCursor;
                            } catch (Exception e4) {
                                e = e4;
                                cc4.g(e, true);
                                iccVar.a(0L, null);
                                if (sQLiteCursor != null) {
                                    sQLiteCursor.dispose();
                                    return;
                                }
                                return;
                            }
                        }
                        if (sQLiteCursor2 != null) {
                            sQLiteCursor2.dispose();
                            return;
                        }
                        return;
                    } catch (Throwable th) {
                        th = th;
                        sQLiteCursor2 = 3;
                        if (sQLiteCursor2 != null) {
                            sQLiteCursor2.dispose();
                        }
                        throw th;
                    }
                } catch (Exception e5) {
                    e = e5;
                    sQLiteCursor = null;
                } catch (Throwable th2) {
                    th = th2;
                    if (sQLiteCursor2 != null) {
                    }
                    throw th;
                }
            case 28:
                TL_account.TL_webBrowserSettings tL_webBrowserSettings2 = (TL_account.TL_webBrowserSettings) obj;
                try {
                    SQLiteDatabase sQLiteDatabase4 = kf7.a0(i2).b;
                    if (sQLiteDatabase4 != null) {
                        sQLiteDatabase4.executeFast("DELETE FROM web_browser_settings").stepThis().dispose();
                        if (tL_webBrowserSettings2 != null) {
                            SQLitePreparedStatement executeFast3 = sQLiteDatabase4.executeFast("INSERT INTO web_browser_settings VALUES(?)");
                            executeFast3.requery();
                            executeFast3.bindTlObject(1, tL_webBrowserSettings2);
                            executeFast3.step();
                            executeFast3.dispose();
                            return;
                        }
                        return;
                    }
                    return;
                } catch (Exception e6) {
                    cc4.g(e6, true);
                    return;
                }
            default:
                ((sa) obj).a(Integer.valueOf(i2));
                return;
        }
    }

    public /* synthetic */ hl3(Object obj, int i, byte b) {
        this.a = b;
        this.c = obj;
        this.b = i;
    }
}
