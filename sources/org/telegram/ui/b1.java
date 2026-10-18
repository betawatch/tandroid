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

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final /* synthetic */ class b1 implements org.telegram.ui.Components.xo0, gi.d4, kg1, r0.n, org.telegram.ui.ActionBar.a2, sg.t, org.telegram.ui.Components.ke0, org.telegram.ui.Components.xl0, org.telegram.ui.Components.mw0, ci.u9, CameraView.CameraViewDelegate, Utilities.Callback5, LanguageDetector.ExceptionCallback, org.telegram.ui.Components.jk0, MessagesStorage.BooleanCallback, org.telegram.ui.Cells.f0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ b1(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // r0.n
    public r0.k1 B0(View view, r0.k1 k1Var) {
        m0 m0Var;
        c2.b bVar = (c2.b) this.b;
        bVar.getClass();
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(k1Var, false);
        x4 x4Var = (x4) bVar.d;
        if (x4Var == view && (m0Var = x4Var.b) != null) {
            m0Var.setPadding(defaultWindowInsets.a, defaultWindowInsets.b, defaultWindowInsets.c, defaultWindowInsets.d);
        }
        return r0.k1.b;
    }

    @Override // org.telegram.ui.Components.xl0
    public /* synthetic */ boolean P0(View view) {
        switch (this.a) {
            case 7:
                break;
            case 28:
                break;
        }
        return false;
    }

    @Override // org.telegram.ui.kg1
    public void a(int i10, ArrayList arrayList) {
        AndroidUtilities.runOnUIThread(new i0(2, (s4) this.b, arrayList), 100L);
    }

    @Override // org.telegram.ui.Components.xl0
    public /* synthetic */ void a0(View view, float f7, float f10) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Components.xo0
    public void b(float f7) {
        c1 c1Var = (c1) this.b;
        MessageObject messageObject = c1Var.M;
        if (messageObject == null) {
            return;
        }
        messageObject.audioProgress = f7;
        MediaController.getInstance().seekToProgress(c1Var.M, f7);
    }

    @Override // org.telegram.ui.Components.xl0
    public void d(float f7, float f10, int i10, View view) {
        org.telegram.ui.Components.f61 G;
        Object obj;
        long j10;
        switch (this.a) {
            case 7:
                e6 e6Var = (e6) this.b;
                ArrayList arrayList = e6Var.c;
                if (((d6) arrayList.get(i10)).a != 1) {
                    if (((d6) arrayList.get(i10)).a != 2) {
                        if (((d6) arrayList.get(i10)).a == 4) {
                            org.telegram.ui.ActionBar.b2 b2Var = org.telegram.ui.Components.f5.N(e6Var.getParentActivity(), LocaleController.getString(R.string.NotificationsDeleteAllExceptionTitle), LocaleController.getString(R.string.NotificationsDeleteAllExceptionAlert), LocaleController.getString(R.string.Delete), new ut0(e6Var, 13), null).a;
                            b2Var.show();
                            b2Var.h();
                            break;
                        }
                    } else {
                        CacheByChatsController.KeepMediaException keepMediaException = ((d6) arrayList.get(i10)).c;
                        x70 x70Var = new x70(view.getContext(), e6Var);
                        x70Var.g(false);
                        x70Var.setParentWindow(org.telegram.ui.Components.f5.P(e6Var, x70Var, view, f7, f10));
                        x70Var.setCallback(new b6(e6Var, keepMediaException, 0));
                        break;
                    }
                } else {
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("onlySelect", true);
                    bundle.putBoolean("checkCanWrite", false);
                    int i11 = e6Var.e;
                    if (i11 == 1) {
                        bundle.putInt("dialogsType", 6);
                    } else if (i11 == 2) {
                        bundle.putInt("dialogsType", 5);
                    } else {
                        bundle.putInt("dialogsType", 4);
                    }
                    bundle.putBoolean("allowGlobalSearch", false);
                    ey eyVar = new ey(bundle);
                    eyVar.C2 = new m4.w0(7, e6Var, eyVar);
                    e6Var.presentFragment(eyVar);
                    break;
                }
                break;
            case 28:
                st stVar = (st) this.b;
                HashSet hashSet = stVar.b0;
                if (!stVar.c0 && (G = stVar.d0.G(i10 - 1)) != null && (obj = G.G) != null) {
                    if (obj instanceof TLRPC.User) {
                        j10 = ((TLRPC.User) obj).id;
                    } else if (obj instanceof TLRPC.Chat) {
                        j10 = ((TLRPC.Chat) obj).id;
                    }
                    if (hashSet.contains(Long.valueOf(j10))) {
                        hashSet.remove(Long.valueOf(j10));
                    } else {
                        hashSet.add(Long.valueOf(j10));
                    }
                    if (view instanceof yg.k) {
                        ((yg.k) view).c(hashSet.contains(Long.valueOf(j10)), true);
                        break;
                    }
                }
                break;
            default:
                DataAutoDownloadActivity.W((DataAutoDownloadActivity) this.b, view, i10, f7);
                break;
        }
    }

    @Override // org.telegram.ui.Components.jk0
    public void e(ArrayList arrayList) {
        ai aiVar = (ai) this.b;
        sn snVar = aiVar.p;
        if (snVar.getParentActivity() == null || snVar.getParentActivity() == null) {
            return;
        }
        zh zhVar = new zh(aiVar, snVar, snVar.getParentActivity(), snVar.ea, arrayList);
        zhVar.setCalcMandatoryInsets(snVar.C9());
        zhVar.setDimBehind(false);
        snVar.D7(false);
        snVar.showDialog(zhVar);
    }

    @Override // gi.d4
    public void f(boolean z10) {
        o3 o3Var = (o3) this.b;
        x3 x3Var = o3Var.K.K;
        if (x3Var != null) {
            o3Var.h = true;
            x3Var.dismiss(true);
        }
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        int i11;
        int i12 = 0;
        switch (this.a) {
            case 4:
                m5 m5Var = (m5) this.b;
                m5Var.getClass();
                try {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                    m5Var.startActivity(intent);
                    break;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 8:
                s6 s6Var = (s6) this.b;
                r6 r6Var = new r6(s6Var.getContext(), false);
                r6Var.fixNavigationBar();
                r6Var.setCanDismissWithSwipe(false);
                r6Var.setCancelable(false);
                Context context = s6Var.getContext();
                u6 u6Var = new u6(context);
                org.telegram.ui.Components.xj0 xj0Var = new org.telegram.ui.Components.xj0(context);
                xj0Var.setAutoRepeat(true);
                xj0Var.f(R.raw.utyan_cache, ImageReceiver.DEFAULT_CROSSFADE_DURATION, ImageReceiver.DEFAULT_CROSSFADE_DURATION, null);
                u6Var.addView(xj0Var, w7.z5.d(ImageReceiver.DEFAULT_CROSSFADE_DURATION, 150.0f, 49, 0.0f, 16.0f, 0.0f, 0.0f));
                xj0Var.d();
                org.telegram.ui.Components.q6 q6Var = new org.telegram.ui.Components.q6(context, false, true, true);
                u6Var.a = q6Var;
                org.telegram.ui.Components.bs bsVar = org.telegram.ui.Components.bs.g;
                q6Var.b(0.35f, 120L, bsVar);
                q6Var.setGravity(1);
                int i13 = org.telegram.ui.ActionBar.h6.j5;
                q6Var.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i13, false));
                q6Var.setTextSize(AndroidUtilities.dp(24.0f));
                q6Var.setTypeface(AndroidUtilities.bold());
                u6Var.addView(q6Var, w7.z5.d(-1, 32.0f, 49, 0.0f, 176.0f, 0.0f, 0.0f));
                t6 t6Var = new t6(context);
                Paint paint = new Paint(1);
                t6Var.b = paint;
                Paint paint2 = new Paint(1);
                t6Var.c = paint2;
                t6Var.e = new org.telegram.ui.Components.f6(t6Var, 350L, bsVar);
                int i14 = org.telegram.ui.ActionBar.h6.N6;
                paint.setColor(org.telegram.ui.ActionBar.h6.x0(null, i14, false));
                paint2.setColor(org.telegram.ui.ActionBar.h6.m1(0.2f, org.telegram.ui.ActionBar.h6.x0(null, i14, false)));
                u6Var.b = t6Var;
                u6Var.addView(t6Var, w7.z5.d(240, 5.0f, 49, 0.0f, 226.0f, 0.0f, 0.0f));
                TextView textView = new TextView(context);
                textView.setGravity(1);
                org.telegram.messenger.g0.m(16.0f, org.telegram.ui.ActionBar.h6.x0(null, i13, false), 1, textView);
                textView.setText(LocaleController.getString(R.string.ClearingCache));
                u6Var.addView(textView, w7.z5.d(-1, -2.0f, 49, 0.0f, 261.0f, 0.0f, 0.0f));
                TextView textView2 = new TextView(context);
                textView2.setGravity(1);
                textView2.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i13, false));
                textView2.setTextSize(1, 14.0f);
                textView2.setText(LocaleController.getString(R.string.ClearingCacheDescription));
                u6Var.addView(textView2, w7.z5.d(240, -2.0f, 49, 0.0f, 289.0f, 0.0f, 0.0f));
                u6Var.a(0.0f);
                r6Var.setCustomView(u6Var);
                boolean[] zArr = {false};
                float[] fArr = {0.0f};
                boolean[] zArr2 = {false};
                org.telegram.messenger.camera.i iVar = new org.telegram.messenger.camera.i(s6Var, u6Var, fArr, zArr2, 5);
                long[] jArr = {-1};
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.camera.i(s6Var, zArr, jArr, r6Var, 6), 150L);
                c7 c7Var = s6Var.d;
                p6 p6Var = new p6(fArr, zArr2, iVar, i12);
                q6 q6Var2 = new q6(zArr, u6Var, jArr, r6Var, 0);
                bi.c cVar = c7Var.Y;
                if (cVar != null) {
                    cVar.d();
                }
                z6 z6Var = c7Var.N;
                if (z6Var != null) {
                    z6Var.d();
                    c7Var.N.e(false);
                }
                c7Var.getFileLoader().cancelLoadAllFiles();
                c7Var.getFileLoader().getFileLoaderQueue().postRunnable(new i6(c7Var, p6Var, q6Var2, i12));
                c7Var.Y = null;
                z6 z6Var2 = c7Var.N;
                if (z6Var2 != null) {
                    z6Var2.setCacheModel(null);
                    break;
                }
                break;
            case 12:
                od.U((od) this.b, b2Var);
                break;
            case 15:
                ((mg) this.b).run();
                break;
            case 17:
                sn snVar = ((hj) this.b).b;
                snVar.finishFragment();
                snVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needDeleteBusinessLink, snVar.P3);
                break;
            case 21:
                sn snVar2 = ((wl) this.b).a.Q;
                i11 = ((org.telegram.ui.ActionBar.n2) snVar2).currentAccount;
                ChatThemeController.getInstance(i11).clearWallpaper(snVar2.T5, true, true);
                break;
            case 22:
                kp kpVar = (kp) this.b;
                boolean z10 = kpVar.s;
                if (!z10 || kpVar.h.linked_chat_id != 0) {
                    org.telegram.ui.ActionBar.b2[] b2VarArr = {new org.telegram.ui.ActionBar.b2(kpVar.getParentActivity(), 3, null)};
                    TLRPC.TL_channels_setDiscussionGroup tL_channels_setDiscussionGroup = new TLRPC.TL_channels_setDiscussionGroup();
                    if (z10) {
                        tL_channels_setDiscussionGroup.broadcast = MessagesController.getInputChannel(kpVar.f);
                        tL_channels_setDiscussionGroup.group = new TLRPC.TL_inputChannelEmpty();
                    } else {
                        tL_channels_setDiscussionGroup.broadcast = new TLRPC.TL_inputChannelEmpty();
                        tL_channels_setDiscussionGroup.group = MessagesController.getInputChannel(kpVar.f);
                    }
                    AndroidUtilities.runOnUIThread(new ap(kpVar, b2VarArr, kpVar.getConnectionsManager().sendRequest(tL_channels_setDiscussionGroup, new xc(8, kpVar, b2VarArr)), i12), 500L);
                    break;
                }
                break;
            default:
                ((nq) this.b).run(1);
                break;
        }
    }

    @Override // org.telegram.ui.Components.mw0
    public void h(int i10) {
        SharedConfig.getPreferences().edit().putInt("cache_limit", ((Integer) ((ArrayList) this.b).get(i10)).intValue()).apply();
    }

    @Override // ci.u9
    public void i(Canvas canvas, RectF rectF, float f7) {
        k8 k8Var = (k8) ((g) this.b).b;
        Paint paint = k8Var.w;
        TextPaint textPaint = k8Var.e;
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
            canvas.drawText(Integer.toString(k8Var.h0 + 1), rectF.centerX(), rectF.centerY() + AndroidUtilities.dp(5.0f), textPaint);
            canvas.restore();
            textPaint.setAlpha(alpha);
        }
    }

    @Override // org.telegram.ui.Components.ke0
    public void j(org.telegram.ui.Components.le0 le0Var) {
        BubbleActivity bubbleActivity = (BubbleActivity) this.b;
        BubbleActivity bubbleActivity2 = BubbleActivity.a0;
        SharedConfig.isWaitingForPasscodeEnter = false;
        Intent intent = bubbleActivity.U;
        if (intent != null) {
            bubbleActivity.y(intent, bubbleActivity.V, bubbleActivity.X, true, bubbleActivity.W);
            bubbleActivity.U = null;
        }
        bubbleActivity.S.c0();
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.passcodeDismissed, le0Var);
    }

    public void k(String str) {
        sn snVar = ((fm) this.b).Q;
        if (str.startsWith("@")) {
            snVar.getMessagesController().openByUserName(str.substring(1), snVar, 0);
            return;
        }
        if (str.startsWith("#") || str.startsWith("$")) {
            ey eyVar = new ey(null);
            eyVar.n2 = str;
            snVar.presentFragment(eyVar);
        } else {
            if (!str.startsWith("/")) {
                snVar.Ba(0, str, null, null, false);
                return;
            }
            snVar.Y.X0(null, str, false, false);
            if (snVar.Y.getFieldText() == null) {
                snVar.j9(false);
            }
        }
    }

    @Override // org.telegram.messenger.camera.CameraView.CameraViewDelegate
    public void onCameraInit() {
        y9 y9Var = (y9) this.b;
        HandlerThread handlerThread = y9Var.e;
        handlerThread.start();
        y9Var.f = new Handler(handlerThread.getLooper());
        AndroidUtilities.runOnUIThread(y9Var.f0, 0L);
        if (y9Var.a0()) {
            o1.k kVar = y9Var.E;
            if (kVar != null) {
                kVar.c();
                y9Var.E = null;
            }
            o1.k kVar2 = new o1.k(new o1.j(0.0f));
            y9Var.E = kVar2;
            int i10 = 0;
            kVar2.b(new o9(y9Var, i10));
            y9Var.E.a(new p9(y9Var, i10));
            y9Var.E.u = new o1.l(500.0f);
            y9Var.E.u.a(0.8f);
            y9Var.E.u.b(250.0f);
            y9Var.E.h();
        }
    }

    @Override // org.telegram.messenger.Utilities.Callback5
    public void run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        switch (this.a) {
            case 13:
                ee eeVar = (ee) this.b;
                org.telegram.ui.Components.f61 f61Var = (org.telegram.ui.Components.f61) obj;
                ((Integer) obj3).intValue();
                ((Float) obj4).floatValue();
                ((Float) obj5).floatValue();
                ge geVar = eeVar.f;
                Object obj6 = f61Var.G;
                if (!(obj6 instanceof TL_stars.StarsTransaction)) {
                    if (obj6 instanceof TL_stats.BroadcastRevenueTransaction) {
                        ke.h0(eeVar.getContext(), eeVar.c, (TL_stats.BroadcastRevenueTransaction) f61Var.G, geVar.d, eeVar.b);
                        break;
                    }
                } else {
                    ai.md.i1(eeVar.getContext(), true, geVar.d, eeVar.c, (TL_stars.StarsTransaction) f61Var.G, eeVar.b);
                    break;
                }
                break;
            default:
                hs hsVar = (hs) this.b;
                View view = (View) obj2;
                ((Integer) obj3).getClass();
                ((Float) obj4).getClass();
                ((Float) obj5).getClass();
                int i10 = ((org.telegram.ui.Components.f61) obj).d;
                if (i10 != 1) {
                    if (i10 == 2) {
                        boolean z10 = !hsVar.X;
                        hsVar.X = z10;
                        ((org.telegram.ui.Cells.v8) view).setChecked(z10);
                        break;
                    }
                } else {
                    TLRPC.User user = hsVar.getMessagesController().getUser(Long.valueOf(hsVar.H));
                    if (user != null && hsVar.getParentActivity() != null) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(hsVar.getParentActivity(), 0, hsVar.r);
                        alertDialog$Builder.a.R = LocaleController.getString(R.string.DeleteContact);
                        alertDialog$Builder.a.T = LocaleController.getString(R.string.AreYouSureDeleteContact);
                        alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.Components.q2(26, hsVar, user));
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        alertDialog$Builder.d(-1);
                        alertDialog$Builder.o();
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ b1(gj gjVar, boolean z10) {
        this.a = 18;
        this.b = gjVar;
    }

    @Override // org.telegram.ui.Components.xo0
    public /* synthetic */ void c(float f7) {
    }

    @Override // org.telegram.ui.Components.mw0
    public /* synthetic */ void m() {
    }

    @Override // org.telegram.messenger.MessagesStorage.BooleanCallback
    public void run(boolean z10) {
        org.telegram.ui.ActionBar.d5 d5Var;
        org.telegram.ui.ActionBar.d5 d5Var2;
        org.telegram.ui.ActionBar.d5 d5Var3;
        org.telegram.ui.ActionBar.d5 d5Var4;
        org.telegram.ui.ActionBar.d5 d5Var5;
        switch (this.a) {
            case 18:
                sn snVar = ((gj) this.b).b.b;
                snVar.va(snVar.d4, true);
                break;
            case 19:
                sn snVar2 = ((ql) this.b).b;
                if (z10) {
                    snVar2.T7();
                    UndoView undoView = snVar2.y3;
                    if (undoView != null) {
                        undoView.j(76, 0L, null);
                        break;
                    }
                }
                break;
            default:
                jr jrVar = ((br) this.b).b;
                if (z10) {
                    d5Var = ((org.telegram.ui.ActionBar.n2) jrVar).parentLayout;
                    if (d5Var != null) {
                        d5Var2 = ((org.telegram.ui.ActionBar.n2) jrVar).parentLayout;
                        List fragmentStack = d5Var2.getFragmentStack();
                        d5Var3 = ((org.telegram.ui.ActionBar.n2) jrVar).parentLayout;
                        org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) fragmentStack.get(d5Var3.getFragmentStack().size() - 2);
                        if (n2Var instanceof ko) {
                            n2Var.removeSelfFromStack();
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", jrVar.N);
                            ko koVar = new ko(bundle);
                            koVar.l0(jrVar.s);
                            d5Var4 = ((org.telegram.ui.ActionBar.n2) jrVar).parentLayout;
                            d5Var5 = ((org.telegram.ui.ActionBar.n2) jrVar).parentLayout;
                            ((ActionBarLayout) d5Var4).c(d5Var5.getFragmentStack().size() - 1, koVar);
                            jrVar.finishFragment();
                            koVar.c.j(76, 0L, null);
                            break;
                        } else {
                            jrVar.finishFragment();
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

    private final /* synthetic */ void l(View view, float f7, float f10) {
    }

    private final /* synthetic */ void n(View view, float f7, float f10) {
    }

    private final /* synthetic */ void o(View view, float f7, float f10) {
    }
}
