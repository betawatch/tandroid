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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class c1 implements org.telegram.ui.Components.vn0, ph.l3, pg1, r0.o, org.telegram.ui.ActionBar.b2, cg.x, org.telegram.ui.Components.md0, org.telegram.ui.Components.al0, org.telegram.ui.Components.kv0, lh.d9, CameraView.CameraViewDelegate, Utilities.Callback5, LanguageDetector.ExceptionCallback, org.telegram.ui.Components.mj0, MessagesStorage.BooleanCallback, org.telegram.ui.Cells.f0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ c1(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // r0.o
    public r0.m1 I0(View view, r0.m1 m1Var) {
        n0 n0Var;
        ab.m mVar = (ab.m) this.b;
        mVar.getClass();
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(m1Var, false);
        s4 s4Var = (s4) mVar.d;
        if (s4Var == view && (n0Var = s4Var.b) != null) {
            n0Var.setPadding(defaultWindowInsets.a, defaultWindowInsets.b, defaultWindowInsets.c, defaultWindowInsets.d);
        }
        return r0.m1.b;
    }

    @Override // org.telegram.ui.pg1
    public void a(int i10, ArrayList arrayList) {
        AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.c(9, (n4) this.b, arrayList), 100L);
    }

    @Override // org.telegram.ui.Components.al0
    public void b(float f9, float f10, int i10, View view) {
        org.telegram.ui.Components.w41 G;
        Object obj;
        long j10;
        switch (this.a) {
            case 7:
                a6 a6Var = (a6) this.b;
                ArrayList arrayList = a6Var.c;
                if (((z5) arrayList.get(i10)).a != 1) {
                    if (((z5) arrayList.get(i10)).a != 2) {
                        if (((z5) arrayList.get(i10)).a == 4) {
                            org.telegram.ui.ActionBar.c2 c2Var = org.telegram.ui.Components.c5.O(a6Var.getParentActivity(), LocaleController.getString(R.string.NotificationsDeleteAllExceptionTitle), LocaleController.getString(R.string.NotificationsDeleteAllExceptionAlert), LocaleController.getString(R.string.Delete), new it0(a6Var, 13), null).a;
                            c2Var.show();
                            c2Var.h();
                            break;
                        }
                    } else {
                        CacheByChatsController.KeepMediaException keepMediaException = ((z5) arrayList.get(i10)).c;
                        x70 x70Var = new x70(view.getContext(), a6Var);
                        x70Var.g(false);
                        x70Var.setParentWindow(org.telegram.ui.Components.c5.Q(a6Var, x70Var, view, f9, f10));
                        x70Var.setCallback(new x5(a6Var, keepMediaException, 0));
                        break;
                    }
                } else {
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("onlySelect", true);
                    bundle.putBoolean("checkCanWrite", false);
                    int i11 = a6Var.e;
                    if (i11 == 1) {
                        bundle.putInt("dialogsType", 6);
                    } else if (i11 == 2) {
                        bundle.putInt("dialogsType", 5);
                    } else {
                        bundle.putInt("dialogsType", 4);
                    }
                    bundle.putBoolean("allowGlobalSearch", false);
                    fy fyVar = new fy(bundle);
                    fyVar.y2 = new kg.w(10, a6Var, fyVar);
                    a6Var.presentFragment(fyVar);
                    break;
                }
                break;
            case 28:
                tt ttVar = (tt) this.b;
                HashSet hashSet = ttVar.X;
                if (!ttVar.Y && (G = ttVar.Z.G(i10 - 1)) != null && (obj = G.G) != null) {
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
                    if (view instanceof ig.n) {
                        ((ig.n) view).c(hashSet.contains(Long.valueOf(j10)), true);
                        break;
                    }
                }
                break;
            default:
                DataAutoDownloadActivity.W((DataAutoDownloadActivity) this.b, view, i10, f9);
                break;
        }
    }

    @Override // org.telegram.ui.Components.al0
    public /* synthetic */ boolean b1(View view) {
        switch (this.a) {
            case 7:
                break;
            case 28:
                break;
        }
        return false;
    }

    @Override // org.telegram.ui.Components.vn0
    public void c(float f9) {
        d1 d1Var = (d1) this.b;
        MessageObject messageObject = d1Var.I;
        if (messageObject == null) {
            return;
        }
        messageObject.audioProgress = f9;
        MediaController.getInstance().seekToProgress(d1Var.I, f9);
    }

    @Override // org.telegram.ui.Components.mj0
    public void e(ArrayList arrayList) {
        yh yhVar = (yh) this.b;
        tn tnVar = yhVar.p;
        if (tnVar.getParentActivity() == null || tnVar.getParentActivity() == null) {
            return;
        }
        xh xhVar = new xh(yhVar, tnVar, tnVar.getParentActivity(), tnVar.aa, arrayList);
        xhVar.setCalcMandatoryInsets(tnVar.x9());
        xhVar.setDimBehind(false);
        tnVar.A7(false);
        tnVar.showDialog(xhVar);
    }

    @Override // ph.l3
    public void f(boolean z10) {
        q3 q3Var = (q3) this.b;
        z3 z3Var = q3Var.G.G;
        if (z3Var != null) {
            q3Var.h = true;
            z3Var.dismiss(true);
        }
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
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
                } catch (Exception e10) {
                    FileLog.e(e10);
                    return;
                }
            case 8:
                o6 o6Var = (o6) this.b;
                n6 n6Var = new n6(o6Var.getContext(), false);
                n6Var.fixNavigationBar();
                n6Var.setCanDismissWithSwipe(false);
                n6Var.setCancelable(false);
                Context context = o6Var.getContext();
                p6 p6Var = new p6(context);
                org.telegram.ui.Components.aj0 aj0Var = new org.telegram.ui.Components.aj0(context);
                aj0Var.setAutoRepeat(true);
                aj0Var.f(R.raw.utyan_cache, ImageReceiver.DEFAULT_CROSSFADE_DURATION, ImageReceiver.DEFAULT_CROSSFADE_DURATION, null);
                p6Var.addView(aj0Var, i7.f6.d(ImageReceiver.DEFAULT_CROSSFADE_DURATION, 150.0f, 49, 0.0f, 16.0f, 0.0f, 0.0f));
                aj0Var.d();
                org.telegram.ui.Components.o6 o6Var2 = new org.telegram.ui.Components.o6(context, false, true, true);
                p6Var.a = o6Var2;
                org.telegram.ui.Components.jr jrVar = org.telegram.ui.Components.jr.g;
                o6Var2.b(0.35f, 120L, jrVar);
                o6Var2.setGravity(1);
                int i13 = org.telegram.ui.ActionBar.g6.j5;
                o6Var2.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i13, false));
                o6Var2.setTextSize(AndroidUtilities.dp(24.0f));
                o6Var2.setTypeface(AndroidUtilities.bold());
                p6Var.addView(o6Var2, i7.f6.d(-1, 32.0f, 49, 0.0f, 176.0f, 0.0f, 0.0f));
                ag.s sVar = new ag.s(context);
                Paint paint = new Paint(1);
                sVar.b = paint;
                Paint paint2 = new Paint(1);
                sVar.c = paint2;
                sVar.e = new org.telegram.ui.Components.d6(sVar, 350L, jrVar);
                int i14 = org.telegram.ui.ActionBar.g6.N6;
                paint.setColor(org.telegram.ui.ActionBar.g6.w0(null, i14, false));
                paint2.setColor(org.telegram.ui.ActionBar.g6.l1(0.2f, org.telegram.ui.ActionBar.g6.w0(null, i14, false)));
                p6Var.b = sVar;
                p6Var.addView(sVar, i7.f6.d(240, 5.0f, 49, 0.0f, 226.0f, 0.0f, 0.0f));
                TextView textView = new TextView(context);
                textView.setGravity(1);
                org.telegram.messenger.x3.t(textView, org.telegram.ui.ActionBar.g6.w0(null, i13, false), 1, 16.0f);
                textView.setText(LocaleController.getString(R.string.ClearingCache));
                p6Var.addView(textView, i7.f6.d(-1, -2.0f, 49, 0.0f, 261.0f, 0.0f, 0.0f));
                TextView textView2 = new TextView(context);
                textView2.setGravity(1);
                textView2.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i13, false));
                textView2.setTextSize(1, 14.0f);
                textView2.setText(LocaleController.getString(R.string.ClearingCacheDescription));
                p6Var.addView(textView2, i7.f6.d(240, -2.0f, 49, 0.0f, 289.0f, 0.0f, 0.0f));
                p6Var.a(0.0f);
                n6Var.setCustomView(p6Var);
                boolean[] zArr = {false};
                float[] fArr = {0.0f};
                boolean[] zArr2 = {false};
                androidx.car.app.utils.c cVar = new androidx.car.app.utils.c(o6Var, p6Var, fArr, zArr2, 24);
                long[] jArr = {-1};
                AndroidUtilities.runOnUIThread(new androidx.car.app.utils.c(o6Var, zArr, jArr, n6Var, 25), 150L);
                x6 x6Var = o6Var.d;
                l6 l6Var = new l6(fArr, zArr2, cVar, i12);
                m6 m6Var = new m6(zArr, p6Var, jArr, n6Var, 0);
                kh.b bVar = x6Var.U;
                if (bVar != null) {
                    bVar.d();
                }
                u6 u6Var = x6Var.J;
                if (u6Var != null) {
                    u6Var.d();
                    x6Var.J.e(false);
                }
                x6Var.getFileLoader().cancelLoadAllFiles();
                x6Var.getFileLoader().getFileLoaderQueue().postRunnable(new e6(x6Var, l6Var, m6Var, i12));
                x6Var.U = null;
                u6 u6Var2 = x6Var.J;
                if (u6Var2 != null) {
                    u6Var2.setCacheModel(null);
                    break;
                }
                break;
            case 12:
                hd.U((hd) this.b, c2Var);
                break;
            case 15:
                ((ig) this.b).run();
                break;
            case 17:
                tn tnVar = ((ej) this.b).b;
                tnVar.finishFragment();
                tnVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needDeleteBusinessLink, tnVar.L3);
                break;
            case 21:
                tn tnVar2 = ((vl) this.b).a.M;
                i11 = ((org.telegram.ui.ActionBar.o2) tnVar2).currentAccount;
                ChatThemeController.getInstance(i11).clearWallpaper(tnVar2.P5, true, true);
                break;
            case 22:
                kp kpVar = (kp) this.b;
                boolean z10 = kpVar.s;
                if (!z10 || kpVar.h.linked_chat_id != 0) {
                    org.telegram.ui.ActionBar.c2[] c2VarArr = {new org.telegram.ui.ActionBar.c2(kpVar.getParentActivity(), 3, null)};
                    TLRPC.TL_channels_setDiscussionGroup tL_channels_setDiscussionGroup = new TLRPC.TL_channels_setDiscussionGroup();
                    if (z10) {
                        tL_channels_setDiscussionGroup.broadcast = MessagesController.getInputChannel(kpVar.f);
                        tL_channels_setDiscussionGroup.group = new TLRPC.TL_inputChannelEmpty();
                    } else {
                        tL_channels_setDiscussionGroup.broadcast = new TLRPC.TL_inputChannelEmpty();
                        tL_channels_setDiscussionGroup.group = MessagesController.getInputChannel(kpVar.f);
                    }
                    AndroidUtilities.runOnUIThread(new ap(kpVar, c2VarArr, kpVar.getConnectionsManager().sendRequest(tL_channels_setDiscussionGroup, new zg(4, kpVar, c2VarArr)), i12), 500L);
                    break;
                }
                break;
            default:
                ((nq) this.b).run(1);
                break;
        }
    }

    @Override // org.telegram.ui.Components.kv0
    public void h(int i10) {
        SharedConfig.getPreferences().edit().putInt("cache_limit", ((Integer) ((ArrayList) this.b).get(i10)).intValue()).apply();
    }

    @Override // org.telegram.ui.Components.md0
    public void i(org.telegram.ui.Components.nd0 nd0Var) {
        BubbleActivity bubbleActivity = (BubbleActivity) this.b;
        BubbleActivity bubbleActivity2 = BubbleActivity.W;
        SharedConfig.isWaitingForPasscodeEnter = false;
        Intent intent = bubbleActivity.Q;
        if (intent != null) {
            bubbleActivity.y(intent, bubbleActivity.R, bubbleActivity.T, true, bubbleActivity.S);
            bubbleActivity.Q = null;
        }
        bubbleActivity.O.c0();
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.passcodeDismissed, nd0Var);
    }

    @Override // lh.d9
    public void j(Canvas canvas, RectF rectF, float f9) {
        f8 f8Var = (f8) ((h) this.b).b;
        Paint paint = f8Var.w;
        TextPaint textPaint = f8Var.e;
        paint.setAlpha((int) (80.0f * f9));
        float lerp = AndroidUtilities.lerp(0.0f, Math.min(rectF.width(), rectF.height()) / 2.0f, f9);
        canvas.drawRoundRect(rectF, lerp, lerp, paint);
        float clamp = Utilities.clamp((f9 - 0.5f) / 0.5f, 1.0f, 0.0f);
        if (clamp > 0.0f) {
            int alpha = textPaint.getAlpha();
            textPaint.setAlpha((int) (alpha * clamp));
            canvas.save();
            float min = Math.min(2.0f, Math.min(rectF.height(), rectF.width()) / AndroidUtilities.dp(44.0f));
            canvas.scale(min, min, rectF.centerX(), rectF.centerY());
            canvas.drawText(Integer.toString(f8Var.d0 + 1), rectF.centerX(), rectF.centerY() + AndroidUtilities.dp(5.0f), textPaint);
            canvas.restore();
            textPaint.setAlpha(alpha);
        }
    }

    public void k(String str) {
        tn tnVar = ((em) this.b).M;
        if (str.startsWith("@")) {
            tnVar.getMessagesController().openByUserName(str.substring(1), tnVar, 0);
            return;
        }
        if (str.startsWith("#") || str.startsWith("$")) {
            fy fyVar = new fy(null);
            fyVar.j2 = str;
            tnVar.presentFragment(fyVar);
        } else {
            if (!str.startsWith("/")) {
                tnVar.xa(0, str, null, null, false);
                return;
            }
            tnVar.U.a1(null, str, false, false);
            if (tnVar.U.getFieldText() == null) {
                tnVar.e9(false);
            }
        }
    }

    @Override // org.telegram.ui.Components.al0
    public /* synthetic */ void o0(View view, float f9, float f10) {
        int i10 = this.a;
    }

    @Override // org.telegram.messenger.camera.CameraView.CameraViewDelegate
    public void onCameraInit() {
        r9 r9Var = (r9) this.b;
        HandlerThread handlerThread = r9Var.d;
        handlerThread.start();
        r9Var.e = new Handler(handlerThread.getLooper());
        AndroidUtilities.runOnUIThread(r9Var.Y, 0L);
        if (r9Var.a0()) {
            o1.k kVar = r9Var.x;
            if (kVar != null) {
                kVar.c();
                r9Var.x = null;
            }
            o1.k kVar2 = new o1.k(new ib.a(0.0f));
            r9Var.x = kVar2;
            int i10 = 0;
            kVar2.b(new j9(r9Var, i10));
            r9Var.x.a(new k9(r9Var, i10));
            r9Var.x.u = new o1.l(500.0f);
            r9Var.x.u.a(0.8f);
            r9Var.x.u.b(250.0f);
            r9Var.x.f();
        }
    }

    @Override // org.telegram.messenger.Utilities.Callback5
    public void run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        switch (this.a) {
            case 13:
                xd xdVar = (xd) this.b;
                org.telegram.ui.Components.w41 w41Var = (org.telegram.ui.Components.w41) obj;
                ((Integer) obj3).intValue();
                ((Float) obj4).floatValue();
                ((Float) obj5).floatValue();
                zd zdVar = xdVar.f;
                Object obj6 = w41Var.G;
                if (!(obj6 instanceof TL_stars.StarsTransaction)) {
                    if (obj6 instanceof TL_stats.BroadcastRevenueTransaction) {
                        de.h0(xdVar.getContext(), xdVar.c, (TL_stats.BroadcastRevenueTransaction) w41Var.G, zdVar.d, xdVar.b);
                        break;
                    }
                } else {
                    jh.ia.h1(xdVar.getContext(), true, zdVar.d, xdVar.c, (TL_stars.StarsTransaction) w41Var.G, xdVar.b);
                    break;
                }
                break;
            default:
                hs hsVar = (hs) this.b;
                View view = (View) obj2;
                ((Integer) obj3).getClass();
                ((Float) obj4).getClass();
                ((Float) obj5).getClass();
                int i10 = ((org.telegram.ui.Components.w41) obj).d;
                if (i10 != 1) {
                    if (i10 == 2) {
                        boolean z10 = !hsVar.T;
                        hsVar.T = z10;
                        ((org.telegram.ui.Cells.q8) view).setChecked(z10);
                        break;
                    }
                } else {
                    TLRPC.User user = hsVar.getMessagesController().getUser(Long.valueOf(hsVar.D));
                    if (user != null && hsVar.getParentActivity() != null) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(hsVar.getParentActivity(), 0, hsVar.r);
                        alertDialog$Builder.a.N = LocaleController.getString(R.string.DeleteContact);
                        alertDialog$Builder.a.P = LocaleController.getString(R.string.AreYouSureDeleteContact);
                        alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new xr(0, hsVar, user));
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        alertDialog$Builder.d(-1);
                        alertDialog$Builder.o();
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ c1(dj djVar, boolean z10) {
        this.a = 18;
        this.b = djVar;
    }

    @Override // org.telegram.ui.Components.vn0
    public /* synthetic */ void d(float f9) {
    }

    @Override // org.telegram.ui.Components.kv0
    public /* synthetic */ void m() {
    }

    @Override // org.telegram.messenger.MessagesStorage.BooleanCallback
    public void run(boolean z10) {
        org.telegram.ui.ActionBar.b5 b5Var;
        org.telegram.ui.ActionBar.b5 b5Var2;
        org.telegram.ui.ActionBar.b5 b5Var3;
        org.telegram.ui.ActionBar.b5 b5Var4;
        org.telegram.ui.ActionBar.b5 b5Var5;
        switch (this.a) {
            case 18:
                tn tnVar = ((dj) this.b).b.b;
                tnVar.qa(tnVar.Z3, true);
                break;
            case 19:
                tn tnVar2 = ((ol) this.b).b;
                if (z10) {
                    tnVar2.Q7();
                    UndoView undoView = tnVar2.u3;
                    if (undoView != null) {
                        undoView.j(76, 0L, null);
                        break;
                    }
                }
                break;
            default:
                jr jrVar = ((br) this.b).b;
                if (z10) {
                    b5Var = ((org.telegram.ui.ActionBar.o2) jrVar).parentLayout;
                    if (b5Var != null) {
                        b5Var2 = ((org.telegram.ui.ActionBar.o2) jrVar).parentLayout;
                        List fragmentStack = b5Var2.getFragmentStack();
                        b5Var3 = ((org.telegram.ui.ActionBar.o2) jrVar).parentLayout;
                        org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) fragmentStack.get(b5Var3.getFragmentStack().size() - 2);
                        if (o2Var instanceof ko) {
                            o2Var.removeSelfFromStack();
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", jrVar.J);
                            ko koVar = new ko(bundle);
                            koVar.l0(jrVar.s);
                            b5Var4 = ((org.telegram.ui.ActionBar.o2) jrVar).parentLayout;
                            b5Var5 = ((org.telegram.ui.ActionBar.o2) jrVar).parentLayout;
                            ((ActionBarLayout) b5Var4).c(b5Var5.getFragmentStack().size() - 1, koVar);
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

    private final /* synthetic */ void l(View view, float f9, float f10) {
    }

    private final /* synthetic */ void n(View view, float f9, float f10) {
    }

    private final /* synthetic */ void o(View view, float f9, float f10) {
    }
}
