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

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class a1 implements org.telegram.ui.Components.fo0, rh.m3, bh1, r0.o, org.telegram.ui.ActionBar.c2, eg.x, org.telegram.ui.Components.ud0, org.telegram.ui.Components.jl0, org.telegram.ui.Components.tv0, nh.d9, CameraView.CameraViewDelegate, Utilities.Callback5, LanguageDetector.ExceptionCallback, org.telegram.ui.Components.vj0, MessagesStorage.BooleanCallback, org.telegram.ui.Cells.f0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ a1(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // r0.o
    public r0.m1 N0(View view, r0.m1 m1Var) {
        l0 l0Var;
        cb.m mVar = (cb.m) this.b;
        mVar.getClass();
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(m1Var, false);
        u4 u4Var = (u4) mVar.d;
        if (u4Var == view && (l0Var = u4Var.b) != null) {
            l0Var.setPadding(defaultWindowInsets.a, defaultWindowInsets.b, defaultWindowInsets.c, defaultWindowInsets.d);
        }
        return r0.m1.b;
    }

    @Override // org.telegram.ui.bh1
    public void a(int i10, ArrayList arrayList) {
        AndroidUtilities.runOnUIThread(new org.telegram.messenger.voip.b(18, (p4) this.b, arrayList), 100L);
    }

    @Override // org.telegram.ui.Components.fo0
    public void b(float f10) {
        b1 b1Var = (b1) this.b;
        MessageObject messageObject = b1Var.J;
        if (messageObject == null) {
            return;
        }
        messageObject.audioProgress = f10;
        MediaController.getInstance().seekToProgress(b1Var.J, f10);
    }

    @Override // org.telegram.ui.Components.jl0
    public void c(float f10, float f11, int i10, View view) {
        org.telegram.ui.Components.i51 G;
        Object obj;
        long j10;
        switch (this.a) {
            case 7:
                d6 d6Var = (d6) this.b;
                ArrayList arrayList = d6Var.c;
                if (((c6) arrayList.get(i10)).a != 1) {
                    if (((c6) arrayList.get(i10)).a != 2) {
                        if (((c6) arrayList.get(i10)).a == 4) {
                            org.telegram.ui.ActionBar.d2 d2Var = org.telegram.ui.Components.z4.O(d6Var.getParentActivity(), LocaleController.getString(R.string.NotificationsDeleteAllExceptionTitle), LocaleController.getString(R.string.NotificationsDeleteAllExceptionAlert), LocaleController.getString(R.string.Delete), new rt0(d6Var, 13), null).a;
                            d2Var.show();
                            d2Var.h();
                            break;
                        }
                    } else {
                        CacheByChatsController.KeepMediaException keepMediaException = ((c6) arrayList.get(i10)).c;
                        g80 g80Var = new g80(view.getContext(), d6Var);
                        g80Var.g(false);
                        g80Var.setParentWindow(org.telegram.ui.Components.z4.Q(d6Var, g80Var, view, f10, f11));
                        g80Var.setCallback(new a6(d6Var, keepMediaException, 0));
                        break;
                    }
                } else {
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("onlySelect", true);
                    bundle.putBoolean("checkCanWrite", false);
                    int i11 = d6Var.e;
                    if (i11 == 1) {
                        bundle.putInt("dialogsType", 6);
                    } else if (i11 == 2) {
                        bundle.putInt("dialogsType", 5);
                    } else {
                        bundle.putInt("dialogsType", 4);
                    }
                    bundle.putBoolean("allowGlobalSearch", false);
                    oy oyVar = new oy(bundle);
                    oyVar.z2 = new mg.w(9, d6Var, oyVar);
                    d6Var.presentFragment(oyVar);
                    break;
                }
                break;
            case 28:
                au auVar = (au) this.b;
                HashSet hashSet = auVar.Y;
                if (!auVar.Z && (G = auVar.a0.G(i10 - 1)) != null && (obj = G.G) != null) {
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
                    if (view instanceof kg.n) {
                        ((kg.n) view).c(hashSet.contains(Long.valueOf(j10)), true);
                        break;
                    }
                }
                break;
            default:
                DataAutoDownloadActivity.W((DataAutoDownloadActivity) this.b, view, i10, f10);
                break;
        }
    }

    @Override // org.telegram.ui.Components.vj0
    public void e(ArrayList arrayList) {
        di diVar = (di) this.b;
        xn xnVar = diVar.p;
        if (xnVar.getParentActivity() == null || xnVar.getParentActivity() == null) {
            return;
        }
        ci ciVar = new ci(diVar, xnVar, xnVar.getParentActivity(), xnVar.ba, arrayList);
        ciVar.setCalcMandatoryInsets(xnVar.x9());
        ciVar.setDimBehind(false);
        xnVar.A7(false);
        xnVar.showDialog(ciVar);
    }

    @Override // org.telegram.ui.Components.jl0
    public /* synthetic */ boolean e1(View view) {
        switch (this.a) {
            case 7:
                break;
            case 28:
                break;
        }
        return false;
    }

    @Override // nh.d9
    public void f(Canvas canvas, RectF rectF, float f10) {
        j8 j8Var = (j8) ((h) this.b).b;
        Paint paint = j8Var.w;
        TextPaint textPaint = j8Var.e;
        paint.setAlpha((int) (80.0f * f10));
        float lerp = AndroidUtilities.lerp(0.0f, Math.min(rectF.width(), rectF.height()) / 2.0f, f10);
        canvas.drawRoundRect(rectF, lerp, lerp, paint);
        float clamp = Utilities.clamp((f10 - 0.5f) / 0.5f, 1.0f, 0.0f);
        if (clamp > 0.0f) {
            int alpha = textPaint.getAlpha();
            textPaint.setAlpha((int) (alpha * clamp));
            canvas.save();
            float min = Math.min(2.0f, Math.min(rectF.height(), rectF.width()) / AndroidUtilities.dp(44.0f));
            canvas.scale(min, min, rectF.centerX(), rectF.centerY());
            canvas.drawText(Integer.toString(j8Var.e0 + 1), rectF.centerX(), rectF.centerY() + AndroidUtilities.dp(5.0f), textPaint);
            canvas.restore();
            textPaint.setAlpha(alpha);
        }
    }

    @Override // rh.m3
    public void g(boolean z4) {
        p3 p3Var = (p3) this.b;
        y3 y3Var = p3Var.H.H;
        if (y3Var != null) {
            p3Var.h = true;
            y3Var.dismiss(true);
        }
    }

    @Override // org.telegram.ui.Components.tv0
    public void h(int i10) {
        SharedConfig.getPreferences().edit().putInt("cache_limit", ((Integer) ((ArrayList) this.b).get(i10)).intValue()).apply();
    }

    @Override // org.telegram.ui.ActionBar.c2
    public void i(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        int i11;
        int i12 = 0;
        int i13 = 1;
        switch (this.a) {
            case 4:
                j5 j5Var = (j5) this.b;
                j5Var.getClass();
                try {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                    j5Var.startActivity(intent);
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
                t6 t6Var = new t6(context);
                org.telegram.ui.Components.jj0 jj0Var = new org.telegram.ui.Components.jj0(context);
                jj0Var.setAutoRepeat(true);
                jj0Var.f(R.raw.utyan_cache, ImageReceiver.DEFAULT_CROSSFADE_DURATION, ImageReceiver.DEFAULT_CROSSFADE_DURATION, null);
                t6Var.addView(jj0Var, k7.b6.d(ImageReceiver.DEFAULT_CROSSFADE_DURATION, 150.0f, 49, 0.0f, 16.0f, 0.0f, 0.0f));
                jj0Var.d();
                org.telegram.ui.Components.k6 k6Var = new org.telegram.ui.Components.k6(context, false, true, true);
                t6Var.a = k6Var;
                org.telegram.ui.Components.nr nrVar = org.telegram.ui.Components.nr.g;
                k6Var.b(0.35f, 120L, nrVar);
                k6Var.setGravity(1);
                int i14 = org.telegram.ui.ActionBar.j6.j5;
                k6Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i14, false));
                k6Var.setTextSize(AndroidUtilities.dp(24.0f));
                k6Var.setTypeface(AndroidUtilities.bold());
                t6Var.addView(k6Var, k7.b6.d(-1, 32.0f, 49, 0.0f, 176.0f, 0.0f, 0.0f));
                cg.r rVar = new cg.r(context);
                Paint paint = new Paint(1);
                rVar.b = paint;
                Paint paint2 = new Paint(1);
                rVar.c = paint2;
                rVar.e = new org.telegram.ui.Components.z5(rVar, 350L, nrVar);
                int i15 = org.telegram.ui.ActionBar.j6.N6;
                paint.setColor(org.telegram.ui.ActionBar.j6.w0(null, i15, false));
                paint2.setColor(org.telegram.ui.ActionBar.j6.l1(0.2f, org.telegram.ui.ActionBar.j6.w0(null, i15, false)));
                t6Var.b = rVar;
                t6Var.addView(rVar, k7.b6.d(240, 5.0f, 49, 0.0f, 226.0f, 0.0f, 0.0f));
                TextView textView = new TextView(context);
                textView.setGravity(1);
                org.telegram.messenger.y3.t(textView, org.telegram.ui.ActionBar.j6.w0(null, i14, false), 1, 16.0f);
                textView.setText(LocaleController.getString(R.string.ClearingCache));
                t6Var.addView(textView, k7.b6.d(-1, -2.0f, 49, 0.0f, 261.0f, 0.0f, 0.0f));
                TextView textView2 = new TextView(context);
                textView2.setGravity(1);
                textView2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i14, false));
                textView2.setTextSize(1, 14.0f);
                textView2.setText(LocaleController.getString(R.string.ClearingCacheDescription));
                t6Var.addView(textView2, k7.b6.d(240, -2.0f, 49, 0.0f, 289.0f, 0.0f, 0.0f));
                t6Var.a(0.0f);
                r6Var.setCustomView(t6Var);
                boolean[] zArr = {false};
                float[] fArr = {0.0f};
                boolean[] zArr2 = {false};
                androidx.car.app.utils.c cVar = new androidx.car.app.utils.c(s6Var, t6Var, fArr, zArr2, 22);
                long[] jArr = {-1};
                AndroidUtilities.runOnUIThread(new androidx.car.app.utils.c(s6Var, zArr, jArr, r6Var, 23), 150L);
                b7 b7Var = s6Var.d;
                p6 p6Var = new p6(fArr, zArr2, cVar, i12);
                q6 q6Var = new q6(zArr, t6Var, jArr, r6Var, 0);
                mh.b bVar = b7Var.V;
                if (bVar != null) {
                    bVar.d();
                }
                y6 y6Var = b7Var.K;
                if (y6Var != null) {
                    y6Var.d();
                    b7Var.K.e(false);
                }
                b7Var.getFileLoader().cancelLoadAllFiles();
                b7Var.getFileLoader().getFileLoaderQueue().postRunnable(new h6(b7Var, p6Var, q6Var, i12));
                b7Var.V = null;
                y6 y6Var2 = b7Var.K;
                if (y6Var2 != null) {
                    y6Var2.setCacheModel(null);
                    break;
                }
                break;
            case 12:
                nd.U((nd) this.b, d2Var);
                break;
            case 15:
                ((ng) this.b).run();
                break;
            case 17:
                xn xnVar = ((jj) this.b).b;
                xnVar.finishFragment();
                xnVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needDeleteBusinessLink, xnVar.M3);
                break;
            case 21:
                xn xnVar2 = ((bm) this.b).a.N;
                i11 = ((org.telegram.ui.ActionBar.p2) xnVar2).currentAccount;
                ChatThemeController.getInstance(i11).clearWallpaper(xnVar2.Q5, true, true);
                break;
            case 22:
                qp qpVar = (qp) this.b;
                boolean z4 = qpVar.s;
                if (!z4 || qpVar.h.linked_chat_id != 0) {
                    org.telegram.ui.ActionBar.d2[] d2VarArr = {new org.telegram.ui.ActionBar.d2(qpVar.getParentActivity(), 3, null)};
                    TLRPC.TL_channels_setDiscussionGroup tL_channels_setDiscussionGroup = new TLRPC.TL_channels_setDiscussionGroup();
                    if (z4) {
                        tL_channels_setDiscussionGroup.broadcast = MessagesController.getInputChannel(qpVar.f);
                        tL_channels_setDiscussionGroup.group = new TLRPC.TL_inputChannelEmpty();
                    } else {
                        tL_channels_setDiscussionGroup.broadcast = new TLRPC.TL_inputChannelEmpty();
                        tL_channels_setDiscussionGroup.group = MessagesController.getInputChannel(qpVar.f);
                    }
                    AndroidUtilities.runOnUIThread(new fp(qpVar, d2VarArr, qpVar.getConnectionsManager().sendRequest(tL_channels_setDiscussionGroup, new lo(i13, qpVar, d2VarArr)), i12), 500L);
                    break;
                }
                break;
            default:
                ((tq) this.b).run(1);
                break;
        }
    }

    @Override // org.telegram.ui.Components.ud0
    public void j(org.telegram.ui.Components.vd0 vd0Var) {
        BubbleActivity bubbleActivity = (BubbleActivity) this.b;
        BubbleActivity bubbleActivity2 = BubbleActivity.X;
        SharedConfig.isWaitingForPasscodeEnter = false;
        Intent intent = bubbleActivity.R;
        if (intent != null) {
            bubbleActivity.y(intent, bubbleActivity.S, bubbleActivity.U, true, bubbleActivity.T);
            bubbleActivity.R = null;
        }
        bubbleActivity.P.c0();
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.passcodeDismissed, vd0Var);
    }

    public void k(String str) {
        xn xnVar = ((jm) this.b).N;
        if (str.startsWith("@")) {
            xnVar.getMessagesController().openByUserName(str.substring(1), xnVar, 0);
            return;
        }
        if (str.startsWith("#") || str.startsWith("$")) {
            oy oyVar = new oy(null);
            oyVar.k2 = str;
            xnVar.presentFragment(oyVar);
        } else {
            if (!str.startsWith("/")) {
                xnVar.xa(0, str, null, null, false);
                return;
            }
            xnVar.V.a1(null, str, false, false);
            if (xnVar.V.getFieldText() == null) {
                xnVar.e9(false);
            }
        }
    }

    @Override // org.telegram.ui.Components.jl0
    public /* synthetic */ void o0(View view, float f10, float f11) {
        int i10 = this.a;
    }

    @Override // org.telegram.messenger.camera.CameraView.CameraViewDelegate
    public void onCameraInit() {
        v9 v9Var = (v9) this.b;
        HandlerThread handlerThread = v9Var.d;
        handlerThread.start();
        v9Var.e = new Handler(handlerThread.getLooper());
        AndroidUtilities.runOnUIThread(v9Var.Z, 0L);
        if (v9Var.a0()) {
            o1.j jVar = v9Var.x;
            if (jVar != null) {
                jVar.c();
                v9Var.x = null;
            }
            o1.j jVar2 = new o1.j(new kb.a(0.0f));
            v9Var.x = jVar2;
            int i10 = 0;
            jVar2.b(new n9(v9Var, i10));
            v9Var.x.a(new o9(v9Var, i10));
            v9Var.x.u = new o1.k(500.0f);
            v9Var.x.u.a(0.8f);
            v9Var.x.u.b(250.0f);
            v9Var.x.f();
        }
    }

    @Override // org.telegram.messenger.Utilities.Callback5
    public void run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        switch (this.a) {
            case 13:
                ee eeVar = (ee) this.b;
                org.telegram.ui.Components.i51 i51Var = (org.telegram.ui.Components.i51) obj;
                ((Integer) obj3).intValue();
                ((Float) obj4).floatValue();
                ((Float) obj5).floatValue();
                ge geVar = eeVar.f;
                Object obj6 = i51Var.G;
                if (!(obj6 instanceof TL_stars.StarsTransaction)) {
                    if (obj6 instanceof TL_stats.BroadcastRevenueTransaction) {
                        ke.h0(eeVar.getContext(), eeVar.c, (TL_stats.BroadcastRevenueTransaction) i51Var.G, geVar.d, eeVar.b);
                        break;
                    }
                } else {
                    lh.ja.h1(eeVar.getContext(), true, geVar.d, eeVar.c, (TL_stars.StarsTransaction) i51Var.G, eeVar.b);
                    break;
                }
                break;
            default:
                ns nsVar = (ns) this.b;
                View view = (View) obj2;
                ((Integer) obj3).getClass();
                ((Float) obj4).getClass();
                ((Float) obj5).getClass();
                int i10 = ((org.telegram.ui.Components.i51) obj).d;
                if (i10 != 1) {
                    if (i10 == 2) {
                        boolean z4 = !nsVar.U;
                        nsVar.U = z4;
                        ((org.telegram.ui.Cells.s8) view).setChecked(z4);
                        break;
                    }
                } else {
                    TLRPC.User user = nsVar.getMessagesController().getUser(Long.valueOf(nsVar.E));
                    if (user != null && nsVar.getParentActivity() != null) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(nsVar.getParentActivity(), 0, nsVar.r);
                        alertDialog$Builder.a.O = LocaleController.getString(R.string.DeleteContact);
                        alertDialog$Builder.a.Q = LocaleController.getString(R.string.AreYouSureDeleteContact);
                        alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.Components.o1(29, nsVar, user));
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        alertDialog$Builder.d(-1);
                        alertDialog$Builder.o();
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ a1(ij ijVar, boolean z4) {
        this.a = 18;
        this.b = ijVar;
    }

    @Override // org.telegram.ui.Components.fo0
    public /* synthetic */ void d(float f10) {
    }

    @Override // org.telegram.ui.Components.tv0
    public /* synthetic */ void m() {
    }

    @Override // org.telegram.messenger.MessagesStorage.BooleanCallback
    public void run(boolean z4) {
        org.telegram.ui.ActionBar.e5 e5Var;
        org.telegram.ui.ActionBar.e5 e5Var2;
        org.telegram.ui.ActionBar.e5 e5Var3;
        org.telegram.ui.ActionBar.e5 e5Var4;
        org.telegram.ui.ActionBar.e5 e5Var5;
        switch (this.a) {
            case 18:
                xn xnVar = ((ij) this.b).b.b;
                xnVar.qa(xnVar.a4, true);
                break;
            case 19:
                xn xnVar2 = ((ul) this.b).b;
                if (z4) {
                    xnVar2.Q7();
                    UndoView undoView = xnVar2.v3;
                    if (undoView != null) {
                        undoView.j(76, 0L, null);
                        break;
                    }
                }
                break;
            default:
                pr prVar = ((hr) this.b).b;
                if (z4) {
                    e5Var = ((org.telegram.ui.ActionBar.p2) prVar).parentLayout;
                    if (e5Var != null) {
                        e5Var2 = ((org.telegram.ui.ActionBar.p2) prVar).parentLayout;
                        List fragmentStack = e5Var2.getFragmentStack();
                        e5Var3 = ((org.telegram.ui.ActionBar.p2) prVar).parentLayout;
                        org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) fragmentStack.get(e5Var3.getFragmentStack().size() - 2);
                        if (p2Var instanceof po) {
                            p2Var.removeSelfFromStack();
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", prVar.K);
                            po poVar = new po(bundle);
                            poVar.l0(prVar.s);
                            e5Var4 = ((org.telegram.ui.ActionBar.p2) prVar).parentLayout;
                            e5Var5 = ((org.telegram.ui.ActionBar.p2) prVar).parentLayout;
                            ((ActionBarLayout) e5Var4).c(e5Var5.getFragmentStack().size() - 1, poVar);
                            prVar.finishFragment();
                            poVar.c.j(76, 0L, null);
                            break;
                        } else {
                            prVar.finishFragment();
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

    private final /* synthetic */ void l(View view, float f10, float f11) {
    }

    private final /* synthetic */ void n(View view, float f10, float f11) {
    }

    private final /* synthetic */ void o(View view, float f10, float f11) {
    }
}
