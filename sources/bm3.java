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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class bm3 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ bm3(int i, Object obj, byte b) {
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
        tvc tvcVar;
        tvc tvcVar2;
        SQLiteCursor sQLiteCursor;
        byte b = this.a;
        SQLiteCursor sQLiteCursor2 = null;
        byte b2 = 2;
        int i2 = this.b;
        Object obj = this.c;
        switch (b) {
            case 0:
                ((mm3) obj).g(i2);
                return;
            case 1:
                ExecutorService executorService = DictationLid.a;
                ((qy1) obj).a(Integer.valueOf(i2));
                return;
            case 2:
                ExecutorService executorService2 = DictationLid.a;
                ((eo3) obj).a(null, 0L, i2);
                return;
            case 3:
                ((px3) obj).H0(i2);
                return;
            case 4:
                e34 e34Var = (e34) obj;
                if (e34Var.Q1) {
                    f24 f24Var = e34Var.u1;
                    if (f24Var != null && f24Var.l()) {
                        try {
                            e34Var.y.performHapticFeedback(3);
                        } catch (Exception unused) {
                        }
                    }
                    e34Var.R1 = true;
                    int max = Math.max(50, i2 - 100);
                    gm.d3(new bm3((Object) e34Var, max, (byte) 4), max);
                    return;
                }
                return;
            case 5:
                w44 w44Var = (w44) obj;
                w44Var.N = i2;
                w44Var.M = true;
                try {
                    w44Var.performHapticFeedback(3, 2);
                } catch (Exception unused2) {
                }
                ValueAnimator valueAnimator = w44Var.R;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                ValueAnimator valueAnimator2 = w44Var.S;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
                ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
                w44Var.R = duration;
                duration.setInterpolator(d53.f);
                w44Var.R.addUpdateListener(new s44(w44Var, (byte) 5));
                w44Var.R.addListener(new t44(w44Var, b2));
                w44Var.R.start();
                return;
            case 6:
                xa3 xa3Var = ((r74) obj).N;
                tk Q = xa3Var.Q();
                xa3Var.V(Q, 1034, new u03(Q, i2, (byte) 24));
                return;
            case 7:
                yg ygVar = (yg) obj;
                ((na4) ygVar.c).a(ygVar.b, i2, (ArrayList) ygVar.d);
                return;
            case 8:
                FilesMigrationService filesMigrationService = (FilesMigrationService) obj;
                boolean z = FilesMigrationService.c;
                ts2.p();
                ((NotificationManager) filesMigrationService.getSystemService("notification")).notify(nm7.X4, fl.a(filesMigrationService, lo7.k0).setContentTitle(jb6.M0(2131748187, null)).setContentText(i2 + "/" + filesMigrationService.a).setSmallIcon(R.drawable.notification).setAutoCancel(false).setProgress(filesMigrationService.a, i2, false).build());
                return;
            case 9:
                ((z14) obj).x0(i2, 0, null);
                return;
            case 10:
                ((mw4) obj).F0(i2, true);
                return;
            case 11:
                c C = c.C(i2);
                nm7 f = nm7.f(i2);
                p25 p25Var = new p25(f, (k16) obj, C);
                f.a(p25Var, 256);
                gm.d3(p25Var, 10000L);
                if (C.e == null && C.C < 0) {
                    C.g0();
                }
                C.e0();
                p25Var.a();
                return;
            case 12:
                c cVar = (c) obj;
                HashSet hashSet = cVar.G;
                hashSet.remove(Integer.valueOf(i2));
                if (hashSet.isEmpty()) {
                    cVar.Z();
                    return;
                }
                return;
            case 13:
                nm7.f(i2).n((x45) obj, 256);
                return;
            case 14:
                g95 g95Var = ((i85) obj).b;
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                if (sharedInstance != null) {
                    sharedInstance.setAudioOutput(i2);
                    g95Var.n5 = Integer.valueOf(i2);
                }
                c41 c41Var = new c41(g95Var.F, new q63());
                Resources resources = g95Var.getContext().getResources();
                if (i2 == 2) {
                    i = R.drawable.msg_voice_bluetooth;
                } else if (i2 == 0) {
                    i = R.drawable.msg_voice_speaker;
                } else {
                    VoIPService sharedInstance2 = VoIPService.getSharedInstance();
                    i = (sharedInstance2 == null || !sharedInstance2.isHeadsetPlugged()) ? R.drawable.msg_voice_phone : R.drawable.msg_voice_headphones;
                }
                c41Var.M(resources.getDrawable(i).mutate(), g95.X0(i2)).k(g95Var.f1());
                return;
            case 15:
                oc5 oc5Var = (oc5) obj;
                AnimatorSet animatorSet = new AnimatorSet();
                int childCount = oc5Var.n.getChildCount();
                for (int i3 = 0; i3 < childCount; i3++) {
                    View childAt = oc5Var.n.getChildAt(i3);
                    oc5Var.n.getClass();
                    if (RecyclerView.R(childAt) >= i2) {
                        childAt.setAlpha(0.0f);
                        int min = (int) ((Math.min(oc5Var.n.getMeasuredHeight(), Math.max(0, childAt.getTop())) / oc5Var.n.getMeasuredHeight()) * 100.0f);
                        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(childAt, (Property<View, Float>) View.ALPHA, 0.0f, 1.0f);
                        ofFloat.setStartDelay(min);
                        ofFloat.setDuration(200L);
                        animatorSet.playTogether(ofFloat);
                    }
                }
                animatorSet.start();
                return;
            case 16:
                ur5 ur5Var = (ur5) obj;
                int i4 = ur5.E;
                ur5Var.a(R.drawable.intro_powerful_mask, 17, i2, true);
                ur5Var.c();
                ur5Var.b(ur5Var.w, 23, true);
                ur5Var.d();
                Intro.a(i2);
                return;
            case 17:
                sa8 sa8Var = (sa8) obj;
                oeb oebVar = sa8Var.A1;
                sa8Var.u0(oebVar, null);
                m58.e(i2).j(oebVar.c);
                return;
            case 18:
                String str = LaunchActivity.C1;
                ConnectionsManager.getInstance(((LaunchActivity) obj).P).cancelRequest(i2, true);
                return;
            case 19:
                ((ze6) obj).a.f[i2].D(1.0f);
                return;
            case 20:
                MediaController mediaController = (MediaController) obj;
                String[] strArr = MediaController.W1;
                if (i2 == -1) {
                    if (mediaController.D(mediaController.v0) && !mediaController.C()) {
                        mediaController.Q(mediaController.v0, true);
                    }
                    mediaController.V = (byte) 0;
                    mediaController.Y = (byte) 0;
                } else if (i2 == 1) {
                    mediaController.Y = (byte) 2;
                    if (mediaController.Z) {
                        mediaController.Z = false;
                        if (mediaController.D(mediaController.v0) && mediaController.C()) {
                            mediaController.R(mediaController.v0);
                        }
                    }
                } else if (i2 == -3) {
                    mediaController.Y = (byte) 1;
                } else if (i2 == -2) {
                    mediaController.Y = (byte) 0;
                    if (mediaController.D(mediaController.v0) && !mediaController.C()) {
                        mediaController.Q(mediaController.v0, true);
                        mediaController.Z = true;
                    }
                }
                mediaController.m0();
                return;
            case 21:
                he heVar = (he) obj;
                String[] strArr2 = MediaController.W1;
                try {
                    heVar.n(i2);
                    return;
                } catch (Exception e) {
                    fc4.g(e, true);
                    return;
                }
            case 22:
                MediaController mediaController2 = ((vn6) obj).a;
                if (i2 == 1) {
                    if (mediaController2.D(mediaController2.v0) && !mediaController2.C()) {
                        mediaController2.Q(mediaController2.v0, true);
                    } else if (mediaController2.E()) {
                        mediaController2.A0(2, 0, false, false);
                    }
                    zv3 zv3Var = zv3.R1;
                    if (zv3Var != null && (tvcVar2 = zv3Var.m1) != null && tvcVar2.x) {
                        tvcVar2.a.f0();
                        tvcVar2.n();
                        tvcVar2.g0.d(true, true);
                    }
                    mediaController2.X = true;
                    return;
                }
                if (i2 == 0) {
                    mediaController2.X = false;
                    return;
                }
                if (i2 == 2) {
                    zv3 zv3Var2 = zv3.R1;
                    if (zv3Var2 != null && (tvcVar = zv3Var2.m1) != null && tvcVar.x) {
                        tvcVar.a.f0();
                        tvcVar.n();
                        tvcVar.g0.d(true, true);
                    }
                    mediaController2.X = true;
                    return;
                }
                return;
            case 23:
                hs6 hs6Var = (hs6) obj;
                hs6Var.W[i2] = false;
                hs6Var.X[i2] = true;
                Runnable[] runnableArr = hs6Var.V;
                Runnable runnable = runnableArr[i2];
                if (runnable != null) {
                    runnable.run();
                    runnableArr[i2] = null;
                    return;
                }
                return;
            case 24:
                ((t27) obj).b.b.H(i2);
                return;
            case 25:
                TLRPC.TL_help_appConfig tL_help_appConfig = (TLRPC.TL_help_appConfig) obj;
                try {
                    SQLiteDatabase sQLiteDatabase = cf7.Y(i2).b;
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
                    fc4.g(e2, true);
                    return;
                }
            case 26:
                TLRPC.messages_AvailableEffects messages_availableeffects = (TLRPC.messages_AvailableEffects) obj;
                try {
                    SQLiteDatabase sQLiteDatabase2 = cf7.Y(i2).b;
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
                    fc4.g(e3, true);
                    return;
                }
            case 27:
                jac jacVar = (jac) obj;
                try {
                    try {
                        SQLiteDatabase sQLiteDatabase3 = cf7.Y(i2).b;
                        if (sQLiteDatabase3 != null) {
                            sQLiteCursor = sQLiteDatabase3.queryFinalized("SELECT data FROM web_browser_settings", new Object[0]);
                            try {
                                TL_account.WebBrowserSettings webBrowserSettings = sQLiteCursor.next() ? (TL_account.WebBrowserSettings) sQLiteCursor.tlObjectValue(0, new yy6((byte) 26), true) : null;
                                if (webBrowserSettings instanceof TL_account.TL_webBrowserSettings) {
                                    TL_account.TL_webBrowserSettings tL_webBrowserSettings = (TL_account.TL_webBrowserSettings) webBrowserSettings;
                                    jacVar.a(Long.valueOf(tL_webBrowserSettings.hash), tL_webBrowserSettings);
                                } else {
                                    jacVar.a(0L, null);
                                }
                                sQLiteCursor2 = sQLiteCursor;
                            } catch (Exception e4) {
                                e = e4;
                                fc4.g(e, true);
                                jacVar.a(0L, null);
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
                    SQLiteDatabase sQLiteDatabase4 = cf7.Y(i2).b;
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
                    fc4.g(e6, true);
                    return;
                }
            default:
                ((ra) obj).a(Integer.valueOf(i2));
                return;
        }
    }

    public /* synthetic */ bm3(Object obj, int i, byte b) {
        this.a = b;
        this.c = obj;
        this.b = i;
    }
}
