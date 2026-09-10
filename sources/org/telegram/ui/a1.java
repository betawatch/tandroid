package org.telegram.ui;

import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextPaint;
import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.CacheByChatsController;
import org.telegram.messenger.ChatThemeController;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LanguageDetector;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.camera.CameraView;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class a1 implements org.telegram.ui.Components.jo0, di.s4, ai1, r0.n, org.telegram.ui.ActionBar.c2, qg.u, org.telegram.ui.Components.ae0, org.telegram.ui.Components.kl0, org.telegram.ui.Components.dw0, zh.p7, CameraView.CameraViewDelegate, Utilities.Callback5, LanguageDetector.ExceptionCallback, org.telegram.ui.Components.wj0, MessagesStorage.BooleanCallback, org.telegram.ui.Cells.f0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ a1(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // r0.n
    public r0.l1 Q0(View view, r0.l1 l1Var) {
        k0 k0Var;
        com.google.firebase.messaging.m mVar = (com.google.firebase.messaging.m) this.b;
        mVar.getClass();
        i0.c defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(l1Var, false);
        s4 s4Var = (s4) mVar.d;
        if (s4Var == view && (k0Var = s4Var.b) != null) {
            k0Var.setPadding(defaultWindowInsets.a, defaultWindowInsets.b, defaultWindowInsets.c, defaultWindowInsets.d);
        }
        return r0.l1.b;
    }

    @Override // org.telegram.ui.ai1
    public void a(int i10, ArrayList arrayList) {
        AndroidUtilities.runOnUIThread(new n(3, (n4) this.b, arrayList), 100L);
    }

    @Override // org.telegram.ui.Components.jo0
    public void b(float f7) {
        b1 b1Var = (b1) this.b;
        MessageObject messageObject = b1Var.M;
        if (messageObject == null) {
            return;
        }
        messageObject.audioProgress = f7;
        MediaController.getInstance().seekToProgress(b1Var.M, f7);
    }

    @Override // org.telegram.ui.Components.kl0
    public void c(float f7, float f10, int i10, View view) {
        org.telegram.ui.Components.v51 G;
        Object obj;
        long j3;
        switch (this.a) {
            case 7:
                b6 b6Var = (b6) this.b;
                ArrayList arrayList = b6Var.c;
                if (((a6) arrayList.get(i10)).a != 1) {
                    if (((a6) arrayList.get(i10)).a != 2) {
                        if (((a6) arrayList.get(i10)).a == 4) {
                            org.telegram.ui.ActionBar.d2 d2Var = org.telegram.ui.Components.d5.O(b6Var.getParentActivity(), LocaleController.getString(R.string.NotificationsDeleteAllExceptionTitle), LocaleController.getString(R.string.NotificationsDeleteAllExceptionAlert), LocaleController.getString(R.string.Delete), new mu0(b6Var, 13), null).a;
                            d2Var.show();
                            d2Var.h();
                            break;
                        }
                    } else {
                        CacheByChatsController.KeepMediaException keepMediaException = ((a6) arrayList.get(i10)).c;
                        p80 p80Var = new p80(view.getContext(), b6Var);
                        p80Var.g(false);
                        p80Var.setParentWindow(org.telegram.ui.Components.d5.Q(b6Var, p80Var, view, f7, f10));
                        p80Var.setCallback(new y5(b6Var, keepMediaException, 0));
                        break;
                    }
                } else {
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("onlySelect", true);
                    bundle.putBoolean("checkCanWrite", false);
                    int i11 = b6Var.e;
                    if (i11 == 1) {
                        bundle.putInt("dialogsType", 6);
                    } else if (i11 == 2) {
                        bundle.putInt("dialogsType", 5);
                    } else {
                        bundle.putInt("dialogsType", 4);
                    }
                    bundle.putBoolean("allowGlobalSearch", false);
                    wy wyVar = new wy(bundle);
                    wyVar.C2 = new bi.cb(26, b6Var, wyVar);
                    b6Var.presentFragment(wyVar);
                    break;
                }
                break;
            case 28:
                du duVar = (du) this.b;
                HashSet hashSet = duVar.b0;
                if (!duVar.c0 && (G = duVar.d0.G(i10 - 1)) != null && (obj = G.G) != null) {
                    if (obj instanceof TLRPC.User) {
                        j3 = ((TLRPC.User) obj).id;
                    } else if (obj instanceof TLRPC.Chat) {
                        j3 = ((TLRPC.Chat) obj).id;
                    }
                    if (hashSet.contains(Long.valueOf(j3))) {
                        hashSet.remove(Long.valueOf(j3));
                    } else {
                        hashSet.add(Long.valueOf(j3));
                    }
                    if (view instanceof wg.k) {
                        ((wg.k) view).c(hashSet.contains(Long.valueOf(j3)), true);
                        break;
                    }
                }
                break;
            default:
                DataAutoDownloadActivity.W((DataAutoDownloadActivity) this.b, view, i10, f7);
                break;
        }
    }

    @Override // org.telegram.ui.Components.kl0
    public /* synthetic */ boolean d1(View view) {
        switch (this.a) {
            case 7:
                break;
            case 28:
                break;
        }
        return false;
    }

    @Override // org.telegram.ui.Components.wj0
    public void e(ArrayList arrayList) {
        ji jiVar = (ji) this.b;
        eo eoVar = jiVar.p;
        if (eoVar.getParentActivity() == null || eoVar.getParentActivity() == null) {
            return;
        }
        ii iiVar = new ii(jiVar, eoVar, eoVar.getParentActivity(), eoVar.ea, arrayList);
        iiVar.setCalcMandatoryInsets(eoVar.x9());
        iiVar.setDimBehind(false);
        eoVar.A7(false);
        eoVar.showDialog(iiVar);
    }

    @Override // org.telegram.ui.ActionBar.c2
    public void f(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        int i11;
        int i12 = 0;
        switch (this.a) {
            case 4:
                h5 h5Var = (h5) this.b;
                h5Var.getClass();
                try {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                    h5Var.startActivity(intent);
                    break;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 8:
                p6 p6Var = (p6) this.b;
                o6 o6Var = new o6(p6Var.getContext(), false);
                o6Var.fixNavigationBar();
                o6Var.setCanDismissWithSwipe(false);
                o6Var.setCancelable(false);
                Context context = p6Var.getContext();
                q6 q6Var = new q6(context);
                org.telegram.ui.Components.kj0 kj0Var = new org.telegram.ui.Components.kj0(context);
                kj0Var.setAutoRepeat(true);
                kj0Var.f(R.raw.utyan_cache, ImageReceiver.DEFAULT_CROSSFADE_DURATION, ImageReceiver.DEFAULT_CROSSFADE_DURATION, null);
                q6Var.addView(kj0Var, w7.a6.d(ImageReceiver.DEFAULT_CROSSFADE_DURATION, 150.0f, 49, 0.0f, 16.0f, 0.0f, 0.0f));
                kj0Var.d();
                org.telegram.ui.Components.o6 o6Var2 = new org.telegram.ui.Components.o6(context, false, true, true);
                q6Var.a = o6Var2;
                org.telegram.ui.Components.wr wrVar = org.telegram.ui.Components.wr.g;
                o6Var2.b(0.35f, 120L, wrVar);
                o6Var2.setGravity(1);
                int i13 = org.telegram.ui.ActionBar.j6.j5;
                o6Var2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i13, false));
                o6Var2.setTextSize(AndroidUtilities.dp(24.0f));
                o6Var2.setTypeface(AndroidUtilities.bold());
                q6Var.addView(o6Var2, w7.a6.d(-1, 32.0f, 49, 0.0f, 176.0f, 0.0f, 0.0f));
                og.p pVar = new og.p(context);
                Paint paint = new Paint(1);
                pVar.b = paint;
                Paint paint2 = new Paint(1);
                pVar.c = paint2;
                pVar.e = new org.telegram.ui.Components.d6(pVar, 350L, wrVar);
                int i14 = org.telegram.ui.ActionBar.j6.N6;
                paint.setColor(org.telegram.ui.ActionBar.j6.w0(null, i14, false));
                paint2.setColor(org.telegram.ui.ActionBar.j6.l1(0.2f, org.telegram.ui.ActionBar.j6.w0(null, i14, false)));
                q6Var.b = pVar;
                q6Var.addView(pVar, w7.a6.d(240, 5.0f, 49, 0.0f, 226.0f, 0.0f, 0.0f));
                TextView textView = new TextView(context);
                textView.setGravity(1);
                org.telegram.messenger.a2.q(textView, org.telegram.ui.ActionBar.j6.w0(null, i13, false), 1, 16.0f);
                textView.setText(LocaleController.getString(R.string.ClearingCache));
                q6Var.addView(textView, w7.a6.d(-1, -2.0f, 49, 0.0f, 261.0f, 0.0f, 0.0f));
                TextView textView2 = new TextView(context);
                textView2.setGravity(1);
                textView2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i13, false));
                textView2.setTextSize(1, 14.0f);
                textView2.setText(LocaleController.getString(R.string.ClearingCacheDescription));
                q6Var.addView(textView2, w7.a6.d(240, -2.0f, 49, 0.0f, 289.0f, 0.0f, 0.0f));
                q6Var.a(0.0f);
                o6Var.setCustomView(q6Var);
                boolean[] zArr = {false};
                float[] fArr = {0.0f};
                boolean[] zArr2 = {false};
                androidx.car.app.utils.b bVar = new androidx.car.app.utils.b(p6Var, q6Var, fArr, zArr2, 27);
                long[] jArr = {-1};
                AndroidUtilities.runOnUIThread(new androidx.car.app.utils.b(p6Var, zArr, jArr, o6Var, 28), 150L);
                y6 y6Var = p6Var.d;
                m6 m6Var = new m6(fArr, zArr2, bVar, i12);
                n6 n6Var = new n6(zArr, q6Var, jArr, o6Var, 0);
                yh.b bVar2 = y6Var.Y;
                if (bVar2 != null) {
                    bVar2.d();
                }
                v6 v6Var = y6Var.N;
                if (v6Var != null) {
                    v6Var.d();
                    y6Var.N.e(false);
                }
                y6Var.getFileLoader().cancelLoadAllFiles();
                y6Var.getFileLoader().getFileLoaderQueue().postRunnable(new f6(y6Var, m6Var, n6Var, i12));
                y6Var.Y = null;
                v6 v6Var2 = y6Var.N;
                if (v6Var2 != null) {
                    v6Var2.setCacheModel(null);
                    break;
                }
                break;
            case 12:
                nd.U((nd) this.b, d2Var);
                break;
            case 15:
                ((vg) this.b).run();
                break;
            case 17:
                eo eoVar = ((pj) this.b).b;
                eoVar.finishFragment();
                eoVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needDeleteBusinessLink, eoVar.P3);
                break;
            case 21:
                eo eoVar2 = ((gm) this.b).a.Q;
                i11 = ((org.telegram.ui.ActionBar.p2) eoVar2).currentAccount;
                ChatThemeController.getInstance(i11).clearWallpaper(eoVar2.T5, true, true);
                break;
            case 22:
                yp ypVar = (yp) this.b;
                boolean z10 = ypVar.s;
                if (!z10 || ypVar.h.linked_chat_id != 0) {
                    org.telegram.ui.ActionBar.d2[] d2VarArr = {new org.telegram.ui.ActionBar.d2(ypVar.getParentActivity(), 3, null)};
                    TLRPC.TL_channels_setDiscussionGroup tL_channels_setDiscussionGroup = new TLRPC.TL_channels_setDiscussionGroup();
                    if (z10) {
                        tL_channels_setDiscussionGroup.broadcast = MessagesController.getInputChannel(ypVar.f);
                        tL_channels_setDiscussionGroup.group = new TLRPC.TL_inputChannelEmpty();
                    } else {
                        tL_channels_setDiscussionGroup.broadcast = new TLRPC.TL_inputChannelEmpty();
                        tL_channels_setDiscussionGroup.group = MessagesController.getInputChannel(ypVar.f);
                    }
                    AndroidUtilities.runOnUIThread(new op(ypVar, d2VarArr, ypVar.getConnectionsManager().sendRequest(tL_channels_setDiscussionGroup, new bi.o2(26, ypVar, d2VarArr)), i12), 500L);
                    break;
                }
                break;
            default:
                ((br) this.b).run(1);
                break;
        }
    }

    @Override // org.telegram.ui.Components.ae0
    public void g(org.telegram.ui.Components.be0 be0Var) {
        BubbleActivity bubbleActivity = (BubbleActivity) this.b;
        BubbleActivity bubbleActivity2 = BubbleActivity.a0;
        SharedConfig.isWaitingForPasscodeEnter = false;
        Intent intent = bubbleActivity.U;
        if (intent != null) {
            bubbleActivity.y(intent, bubbleActivity.V, bubbleActivity.X, true, bubbleActivity.W);
            bubbleActivity.U = null;
        }
        bubbleActivity.S.c0();
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.passcodeDismissed, be0Var);
    }

    @Override // org.telegram.ui.Components.dw0
    public void h(int i10) {
        SharedConfig.getPreferences().edit().putInt("cache_limit", ((Integer) ((ArrayList) this.b).get(i10)).intValue()).apply();
    }

    @Override // zh.p7
    public void i(Canvas canvas, RectF rectF, float f7) {
        h8 h8Var = (h8) ((g) this.b).b;
        Paint paint = h8Var.w;
        TextPaint textPaint = h8Var.e;
        paint.setAlpha((int) (80.0f * f7));
        float lerp = AndroidUtilities.lerp(0.0f, Math.min(rectF.width(), rectF.height()) / 2.0f, f7);
        canvas.drawRoundRect(rectF, lerp, lerp, paint);
        float clamp = Utilities.clamp((f7 - 0.5f) / 0.5f, 1.0f, 0.0f);
        if (clamp > 0.0f) {
            int alpha = textPaint.getAlpha();
            textPaint.setAlpha((int) (alpha * clamp));
            canvas.save();
            float min = Math.min(2.0f, Math.min(rectF.height(), rectF.width()) / AndroidUtilities.dp(44.0f));
            canvas.scale(min, min, rectF.centerX(), rectF.centerY());
            canvas.drawText(Integer.toString(h8Var.h0 + 1), rectF.centerX(), rectF.centerY() + AndroidUtilities.dp(5.0f), textPaint);
            canvas.restore();
            textPaint.setAlpha(alpha);
        }
    }

    @Override // di.s4
    public void j(boolean z10) {
        n3 n3Var = (n3) this.b;
        w3 w3Var = n3Var.K.K;
        if (w3Var != null) {
            n3Var.h = true;
            w3Var.dismiss(true);
        }
    }

    public void k(String str) {
        eo eoVar = ((pm) this.b).Q;
        if (str.startsWith("@")) {
            eoVar.getMessagesController().openByUserName(str.substring(1), eoVar, 0);
            return;
        }
        if (str.startsWith("#") || str.startsWith("$")) {
            wy wyVar = new wy(null);
            wyVar.n2 = str;
            eoVar.presentFragment(wyVar);
        } else {
            if (!str.startsWith("/")) {
                eoVar.xa(0, str, null, null, false);
                return;
            }
            eoVar.Y.a1(null, str, false, false);
            if (eoVar.Y.getFieldText() == null) {
                eoVar.e9(false);
            }
        }
    }

    @Override // org.telegram.messenger.camera.CameraView.CameraViewDelegate
    public void onCameraInit() {
        u9 u9Var = (u9) this.b;
        HandlerThread handlerThread = u9Var.d;
        handlerThread.start();
        u9Var.e = new Handler(handlerThread.getLooper());
        AndroidUtilities.runOnUIThread(u9Var.c0, 0L);
        if (u9Var.a0()) {
            o1.k kVar = u9Var.x;
            if (kVar != null) {
                kVar.c();
                u9Var.x = null;
            }
            o1.k kVar2 = new o1.k(new o1.j(0.0f));
            u9Var.x = kVar2;
            int i10 = 0;
            kVar2.b(new m9(u9Var, i10));
            u9Var.x.a(new n9(u9Var, i10));
            u9Var.x.u = new o1.l(500.0f);
            u9Var.x.u.a(0.8f);
            u9Var.x.u.b(250.0f);
            u9Var.x.f();
        }
    }

    @Override // org.telegram.ui.Components.kl0
    public /* synthetic */ void p0(View view, float f7, float f10) {
        int i10 = this.a;
    }

    @Override // org.telegram.messenger.Utilities.Callback5
    public void run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        switch (this.a) {
            case 13:
                fe feVar = (fe) this.b;
                org.telegram.ui.Components.v51 v51Var = (org.telegram.ui.Components.v51) obj;
                ((Integer) obj3).intValue();
                ((Float) obj4).floatValue();
                ((Float) obj5).floatValue();
                he heVar = feVar.f;
                Object obj6 = v51Var.G;
                if (!(obj6 instanceof TL_stars.StarsTransaction)) {
                    if (obj6 instanceof TL_stats.BroadcastRevenueTransaction) {
                        le.h0(feVar.getContext(), feVar.c, (TL_stats.BroadcastRevenueTransaction) v51Var.G, heVar.d, feVar.b);
                        break;
                    }
                } else {
                    xh.z7.h1(feVar.getContext(), true, heVar.d, feVar.c, (TL_stars.StarsTransaction) v51Var.G, feVar.b);
                    break;
                }
                break;
            default:
                ts tsVar = (ts) this.b;
                View view = (View) obj2;
                ((Integer) obj3).getClass();
                ((Float) obj4).getClass();
                ((Float) obj5).getClass();
                int i10 = ((org.telegram.ui.Components.v51) obj).d;
                if (i10 != 1) {
                    if (i10 == 2) {
                        boolean z10 = !tsVar.X;
                        tsVar.X = z10;
                        ((org.telegram.ui.Cells.x8) view).setChecked(z10);
                        break;
                    }
                } else {
                    TLRPC.User user = tsVar.getMessagesController().getUser(Long.valueOf(tsVar.H));
                    if (user != null && tsVar.getParentActivity() != null) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(tsVar.getParentActivity(), 0, tsVar.r);
                        alertDialog$Builder.a.R = LocaleController.getString(R.string.DeleteContact);
                        alertDialog$Builder.a.T = LocaleController.getString(R.string.AreYouSureDeleteContact);
                        alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.Components.km(16, tsVar, user));
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        alertDialog$Builder.d(-1);
                        alertDialog$Builder.o();
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ a1(oj ojVar, boolean z10) {
        this.a = 18;
        this.b = ojVar;
    }

    @Override // org.telegram.ui.Components.jo0
    public /* synthetic */ void d(float f7) {
    }

    @Override // org.telegram.ui.Components.dw0
    public /* synthetic */ void l() {
    }

    @Override // org.telegram.messenger.MessagesStorage.BooleanCallback
    public void run(boolean z10) {
        org.telegram.ui.ActionBar.f5 f5Var;
        org.telegram.ui.ActionBar.f5 f5Var2;
        org.telegram.ui.ActionBar.f5 f5Var3;
        org.telegram.ui.ActionBar.f5 f5Var4;
        org.telegram.ui.ActionBar.f5 f5Var5;
        switch (this.a) {
            case 18:
                eo eoVar = ((oj) this.b).b.b;
                eoVar.qa(eoVar.d4, true);
                break;
            case 19:
                eo eoVar2 = ((zl) this.b).b;
                if (z10) {
                    eoVar2.Q7();
                    UndoView undoView = eoVar2.y3;
                    if (undoView != null) {
                        undoView.j(76, 0L, null);
                        break;
                    }
                }
                break;
            default:
                wr wrVar = ((or) this.b).b;
                if (z10) {
                    f5Var = ((org.telegram.ui.ActionBar.p2) wrVar).parentLayout;
                    if (f5Var != null) {
                        f5Var2 = ((org.telegram.ui.ActionBar.p2) wrVar).parentLayout;
                        List fragmentStack = f5Var2.getFragmentStack();
                        f5Var3 = ((org.telegram.ui.ActionBar.p2) wrVar).parentLayout;
                        org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) fragmentStack.get(f5Var3.getFragmentStack().size() - 2);
                        if (p2Var instanceof yo) {
                            p2Var.removeSelfFromStack();
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", wrVar.N);
                            yo yoVar = new yo(bundle);
                            yoVar.l0(wrVar.s);
                            f5Var4 = ((org.telegram.ui.ActionBar.p2) wrVar).parentLayout;
                            f5Var5 = ((org.telegram.ui.ActionBar.p2) wrVar).parentLayout;
                            ((ActionBarLayout) f5Var4).c(f5Var5.getFragmentStack().size() - 1, yoVar);
                            wrVar.finishFragment();
                            yoVar.c.j(76, 0L, null);
                            break;
                        } else {
                            wrVar.finishFragment();
                            break;
                        }
                    }
                }
                break;
        }
    }

    @Override // org.telegram.messenger.LanguageDetector.ExceptionCallback
    public void run(Exception exc) {
        ((org.telegram.ui.Cells.h0) this.b).setClickable(false);
    }

    private final /* synthetic */ void m(View view, float f7, float f10) {
    }

    private final /* synthetic */ void n(View view, float f7, float f10) {
    }

    private final /* synthetic */ void o(View view, float f7, float f10) {
    }
}
