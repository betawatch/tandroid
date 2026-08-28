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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class b1 implements org.telegram.ui.Components.kn0, mh.e4, ng1, r0.o, org.telegram.ui.ActionBar.b2, zf.t, org.telegram.ui.Components.xc0, org.telegram.ui.Components.nk0, org.telegram.ui.Components.av0, ih.h9, CameraView.CameraViewDelegate, Utilities.Callback5, LanguageDetector.ExceptionCallback, org.telegram.ui.Components.bj0, MessagesStorage.BooleanCallback, org.telegram.ui.Cells.f0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ b1(Object obj, int i9) {
        this.a = i9;
        this.b = obj;
    }

    @Override // r0.o
    public r0.m1 L0(View view, r0.m1 m1Var) {
        m0 m0Var;
        com.google.firebase.messaging.l lVar = (com.google.firebase.messaging.l) this.b;
        lVar.getClass();
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(m1Var, false);
        r4 r4Var = (r4) lVar.d;
        if (r4Var == view && (m0Var = r4Var.b) != null) {
            m0Var.setPadding(defaultWindowInsets.a, defaultWindowInsets.b, defaultWindowInsets.c, defaultWindowInsets.d);
        }
        return r0.m1.b;
    }

    @Override // org.telegram.ui.ng1
    public void a(int i9, ArrayList arrayList) {
        AndroidUtilities.runOnUIThread(new org.telegram.messenger.voip.l0(12, (m4) this.b, arrayList), 100L);
    }

    @Override // org.telegram.ui.Components.kn0
    public void b(float f10) {
        c1 c1Var = (c1) this.b;
        MessageObject messageObject = c1Var.I;
        if (messageObject == null) {
            return;
        }
        messageObject.audioProgress = f10;
        MediaController.getInstance().seekToProgress(c1Var.I, f10);
    }

    @Override // org.telegram.ui.Components.nk0
    public void c(float f10, float f11, int i9, View view) {
        org.telegram.ui.Components.l41 G;
        Object obj;
        long j10;
        switch (this.a) {
            case 7:
                z5 z5Var = (z5) this.b;
                ArrayList arrayList = z5Var.c;
                if (((y5) arrayList.get(i9)).a != 1) {
                    if (((y5) arrayList.get(i9)).a != 2) {
                        if (((y5) arrayList.get(i9)).a == 4) {
                            org.telegram.ui.ActionBar.c2 c2Var = org.telegram.ui.Components.y4.O(z5Var.getParentActivity(), LocaleController.getString(R.string.NotificationsDeleteAllExceptionTitle), LocaleController.getString(R.string.NotificationsDeleteAllExceptionAlert), LocaleController.getString(R.string.Delete), new kt0(z5Var, 13), null).a;
                            c2Var.show();
                            c2Var.h();
                            break;
                        }
                    } else {
                        CacheByChatsController.KeepMediaException keepMediaException = ((y5) arrayList.get(i9)).c;
                        u70 u70Var = new u70(view.getContext(), z5Var);
                        u70Var.g(false);
                        u70Var.setParentWindow(org.telegram.ui.Components.y4.Q(z5Var, u70Var, view, f10, f11));
                        u70Var.setCallback(new w5(z5Var, keepMediaException, 0));
                        break;
                    }
                } else {
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("onlySelect", true);
                    bundle.putBoolean("checkCanWrite", false);
                    int i10 = z5Var.e;
                    if (i10 == 1) {
                        bundle.putInt("dialogsType", 6);
                    } else if (i10 == 2) {
                        bundle.putInt("dialogsType", 5);
                    } else {
                        bundle.putInt("dialogsType", 4);
                    }
                    bundle.putBoolean("allowGlobalSearch", false);
                    dy dyVar = new dy(bundle);
                    dyVar.y2 = new ih.v3(10, z5Var, dyVar);
                    z5Var.presentFragment(dyVar);
                    break;
                }
                break;
            case 28:
                st stVar = (st) this.b;
                HashSet hashSet = stVar.X;
                if (!stVar.Y && (G = stVar.Z.G(i9 - 1)) != null && (obj = G.G) != null) {
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
                    if (view instanceof fg.p) {
                        ((fg.p) view).c(hashSet.contains(Long.valueOf(j10)), true);
                        break;
                    }
                }
                break;
            default:
                DataAutoDownloadActivity.V((DataAutoDownloadActivity) this.b, view, i9, f10);
                break;
        }
    }

    @Override // ih.h9
    public void d(Canvas canvas, RectF rectF, float f10) {
        g8 g8Var = (g8) ((g) this.b).b;
        Paint paint = g8Var.w;
        TextPaint textPaint = g8Var.e;
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
            canvas.drawText(Integer.toString(g8Var.d0 + 1), rectF.centerX(), rectF.centerY() + AndroidUtilities.dp(5.0f), textPaint);
            canvas.restore();
            textPaint.setAlpha(alpha);
        }
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void f(org.telegram.ui.ActionBar.c2 c2Var, int i9) {
        int i10;
        int i11 = 0;
        switch (this.a) {
            case 4:
                g5 g5Var = (g5) this.b;
                g5Var.getClass();
                try {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                    g5Var.startActivity(intent);
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
                q6 q6Var = new q6(context);
                org.telegram.ui.Components.pi0 pi0Var = new org.telegram.ui.Components.pi0(context);
                pi0Var.setAutoRepeat(true);
                pi0Var.f(R.raw.utyan_cache, ImageReceiver.DEFAULT_CROSSFADE_DURATION, ImageReceiver.DEFAULT_CROSSFADE_DURATION, null);
                q6Var.addView(pi0Var, g7.e6.d(ImageReceiver.DEFAULT_CROSSFADE_DURATION, 150.0f, 49, 0.0f, 16.0f, 0.0f, 0.0f));
                pi0Var.d();
                org.telegram.ui.Components.j6 j6Var = new org.telegram.ui.Components.j6(context, false, true, true);
                q6Var.a = j6Var;
                org.telegram.ui.Components.gr grVar = org.telegram.ui.Components.gr.g;
                j6Var.b(0.35f, 120L, grVar);
                j6Var.setGravity(1);
                int i12 = org.telegram.ui.ActionBar.f6.j5;
                j6Var.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i12, false));
                j6Var.setTextSize(AndroidUtilities.dp(24.0f));
                j6Var.setTypeface(AndroidUtilities.bold());
                q6Var.addView(j6Var, g7.e6.d(-1, 32.0f, 49, 0.0f, 176.0f, 0.0f, 0.0f));
                p6 p6Var = new p6(context);
                Paint paint = new Paint(1);
                p6Var.b = paint;
                Paint paint2 = new Paint(1);
                p6Var.c = paint2;
                p6Var.e = new org.telegram.ui.Components.y5(p6Var, 350L, grVar);
                int i13 = org.telegram.ui.ActionBar.f6.N6;
                paint.setColor(org.telegram.ui.ActionBar.f6.w0(null, i13, false));
                paint2.setColor(org.telegram.ui.ActionBar.f6.l1(0.2f, org.telegram.ui.ActionBar.f6.w0(null, i13, false)));
                q6Var.b = p6Var;
                q6Var.addView(p6Var, g7.e6.d(240, 5.0f, 49, 0.0f, 226.0f, 0.0f, 0.0f));
                TextView textView = new TextView(context);
                textView.setGravity(1);
                org.telegram.messenger.l0.q(textView, org.telegram.ui.ActionBar.f6.w0(null, i12, false), 1, 16.0f);
                textView.setText(LocaleController.getString(R.string.ClearingCache));
                q6Var.addView(textView, g7.e6.d(-1, -2.0f, 49, 0.0f, 261.0f, 0.0f, 0.0f));
                TextView textView2 = new TextView(context);
                textView2.setGravity(1);
                textView2.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i12, false));
                textView2.setTextSize(1, 14.0f);
                textView2.setText(LocaleController.getString(R.string.ClearingCacheDescription));
                q6Var.addView(textView2, g7.e6.d(240, -2.0f, 49, 0.0f, 289.0f, 0.0f, 0.0f));
                q6Var.a(0.0f);
                n6Var.setCustomView(q6Var);
                boolean[] zArr = {false};
                float[] fArr = {0.0f};
                boolean[] zArr2 = {false};
                k6 k6Var = new k6(o6Var, q6Var, fArr, zArr2, 0);
                long[] jArr = {-1};
                AndroidUtilities.runOnUIThread(new k6((Object) o6Var, zArr, (Object) jArr, (Object) n6Var, 1), 150L);
                y6 y6Var = o6Var.d;
                l6 l6Var = new l6(fArr, zArr2, k6Var, i11);
                m6 m6Var = new m6(zArr, q6Var, jArr, n6Var, 0);
                hh.b bVar = y6Var.U;
                if (bVar != null) {
                    bVar.d();
                }
                v6 v6Var = y6Var.J;
                if (v6Var != null) {
                    v6Var.d();
                    y6Var.J.e(false);
                }
                y6Var.getFileLoader().cancelLoadAllFiles();
                y6Var.getFileLoader().getFileLoaderQueue().postRunnable(new d6(y6Var, l6Var, m6Var, i11));
                y6Var.U = null;
                v6 v6Var2 = y6Var.J;
                if (v6Var2 != null) {
                    v6Var2.setCacheModel(null);
                    break;
                }
                break;
            case 12:
                id.T((id) this.b, c2Var);
                break;
            case 15:
                ((jg) this.b).run();
                break;
            case 17:
                qn qnVar = ((bj) this.b).b;
                qnVar.finishFragment();
                qnVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needDeleteBusinessLink, qnVar.L3);
                break;
            case 21:
                qn qnVar2 = ((tl) this.b).a.M;
                i10 = ((org.telegram.ui.ActionBar.o2) qnVar2).currentAccount;
                ChatThemeController.getInstance(i10).clearWallpaper(qnVar2.P5, true, true);
                break;
            case 22:
                hp hpVar = (hp) this.b;
                boolean z10 = hpVar.s;
                if (!z10 || hpVar.h.linked_chat_id != 0) {
                    org.telegram.ui.ActionBar.c2[] c2VarArr = {new org.telegram.ui.ActionBar.c2(hpVar.getParentActivity(), 3, null)};
                    TLRPC.TL_channels_setDiscussionGroup tL_channels_setDiscussionGroup = new TLRPC.TL_channels_setDiscussionGroup();
                    if (z10) {
                        tL_channels_setDiscussionGroup.broadcast = MessagesController.getInputChannel(hpVar.f);
                        tL_channels_setDiscussionGroup.group = new TLRPC.TL_inputChannelEmpty();
                    } else {
                        tL_channels_setDiscussionGroup.broadcast = new TLRPC.TL_inputChannelEmpty();
                        tL_channels_setDiscussionGroup.group = MessagesController.getInputChannel(hpVar.f);
                    }
                    AndroidUtilities.runOnUIThread(new xo(hpVar, c2VarArr, hpVar.getConnectionsManager().sendRequest(tL_channels_setDiscussionGroup, new rc(8, hpVar, c2VarArr)), i11), 500L);
                    break;
                }
                break;
            default:
                ((lq) this.b).run(1);
                break;
        }
    }

    @Override // org.telegram.ui.Components.nk0
    public /* synthetic */ boolean f1(View view) {
        switch (this.a) {
            case 7:
                break;
            case 28:
                break;
        }
        return false;
    }

    @Override // org.telegram.ui.Components.bj0
    public void g(ArrayList arrayList) {
        vh vhVar = (vh) this.b;
        qn qnVar = vhVar.p;
        if (qnVar.getParentActivity() == null || qnVar.getParentActivity() == null) {
            return;
        }
        uh uhVar = new uh(vhVar, qnVar, qnVar.getParentActivity(), qnVar.aa, arrayList);
        uhVar.setCalcMandatoryInsets(qnVar.x9());
        uhVar.setDimBehind(false);
        qnVar.A7(false);
        qnVar.showDialog(uhVar);
    }

    @Override // org.telegram.ui.Components.nk0
    public /* synthetic */ void g0(View view, float f10, float f11) {
        int i9 = this.a;
    }

    @Override // org.telegram.ui.Components.av0
    public void h(int i9) {
        SharedConfig.getPreferences().edit().putInt("cache_limit", ((Integer) ((ArrayList) this.b).get(i9)).intValue()).apply();
    }

    @Override // org.telegram.ui.Components.xc0
    public void i(org.telegram.ui.Components.yc0 yc0Var) {
        BubbleActivity bubbleActivity = (BubbleActivity) this.b;
        BubbleActivity bubbleActivity2 = BubbleActivity.W;
        SharedConfig.isWaitingForPasscodeEnter = false;
        Intent intent = bubbleActivity.Q;
        if (intent != null) {
            bubbleActivity.y(intent, bubbleActivity.R, bubbleActivity.T, true, bubbleActivity.S);
            bubbleActivity.Q = null;
        }
        bubbleActivity.O.c0();
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.passcodeDismissed, yc0Var);
    }

    @Override // mh.e4
    public void j(boolean z10) {
        p3 p3Var = (p3) this.b;
        y3 y3Var = p3Var.G.G;
        if (y3Var != null) {
            p3Var.h = true;
            y3Var.dismiss(true);
        }
    }

    public void k(String str) {
        qn qnVar = ((bm) this.b).M;
        if (str.startsWith("@")) {
            qnVar.getMessagesController().openByUserName(str.substring(1), qnVar, 0);
            return;
        }
        if (str.startsWith("#") || str.startsWith("$")) {
            dy dyVar = new dy(null);
            dyVar.j2 = str;
            qnVar.presentFragment(dyVar);
        } else {
            if (!str.startsWith("/")) {
                qnVar.xa(0, str, null, null, false);
                return;
            }
            qnVar.U.a1(null, str, false, false);
            if (qnVar.U.getFieldText() == null) {
                qnVar.e9(false);
            }
        }
    }

    @Override // org.telegram.messenger.camera.CameraView.CameraViewDelegate
    public void onCameraInit() {
        s9 s9Var = (s9) this.b;
        HandlerThread handlerThread = s9Var.d;
        handlerThread.start();
        s9Var.e = new Handler(handlerThread.getLooper());
        AndroidUtilities.runOnUIThread(s9Var.Y, 0L);
        if (s9Var.Z()) {
            o1.j jVar = s9Var.x;
            if (jVar != null) {
                jVar.c();
                s9Var.x = null;
            }
            o1.j jVar2 = new o1.j(new gb.a(0.0f));
            s9Var.x = jVar2;
            int i9 = 0;
            jVar2.b(new k9(s9Var, i9));
            s9Var.x.a(new l9(s9Var, i9));
            s9Var.x.u = new o1.k(500.0f);
            s9Var.x.u.a(0.8f);
            s9Var.x.u.b(250.0f);
            s9Var.x.f();
        }
    }

    @Override // org.telegram.messenger.Utilities.Callback5
    public void run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        switch (this.a) {
            case 13:
                zd zdVar = (zd) this.b;
                org.telegram.ui.Components.l41 l41Var = (org.telegram.ui.Components.l41) obj;
                ((Integer) obj3).intValue();
                ((Float) obj4).floatValue();
                ((Float) obj5).floatValue();
                be beVar = zdVar.f;
                Object obj6 = l41Var.G;
                if (!(obj6 instanceof TL_stars.StarsTransaction)) {
                    if (obj6 instanceof TL_stats.BroadcastRevenueTransaction) {
                        fe.h0(zdVar.getContext(), zdVar.c, (TL_stats.BroadcastRevenueTransaction) l41Var.G, beVar.d, zdVar.b);
                        break;
                    }
                } else {
                    gh.oa.h1(zdVar.getContext(), true, beVar.d, zdVar.c, (TL_stars.StarsTransaction) l41Var.G, zdVar.b);
                    break;
                }
                break;
            default:
                is isVar = (is) this.b;
                View view = (View) obj2;
                ((Integer) obj3).getClass();
                ((Float) obj4).getClass();
                ((Float) obj5).getClass();
                int i9 = ((org.telegram.ui.Components.l41) obj).d;
                if (i9 != 1) {
                    if (i9 == 2) {
                        boolean z10 = !isVar.T;
                        isVar.T = z10;
                        ((org.telegram.ui.Cells.t8) view).setChecked(z10);
                        break;
                    }
                } else {
                    TLRPC.User user = isVar.getMessagesController().getUser(Long.valueOf(isVar.D));
                    if (user != null && isVar.getParentActivity() != null) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(isVar.getParentActivity(), 0, isVar.r);
                        alertDialog$Builder.a.N = LocaleController.getString(R.string.DeleteContact);
                        alertDialog$Builder.a.P = LocaleController.getString(R.string.AreYouSureDeleteContact);
                        alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new yr(0, isVar, user));
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        alertDialog$Builder.d(-1);
                        alertDialog$Builder.o();
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ b1(aj ajVar, boolean z10) {
        this.a = 18;
        this.b = ajVar;
    }

    @Override // org.telegram.ui.Components.kn0
    public /* synthetic */ void e(float f10) {
    }

    @Override // org.telegram.ui.Components.av0
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
                qn qnVar = ((aj) this.b).b.b;
                qnVar.qa(qnVar.Z3, true);
                break;
            case 19:
                qn qnVar2 = ((ll) this.b).b;
                if (z10) {
                    qnVar2.Q7();
                    UndoView undoView = qnVar2.u3;
                    if (undoView != null) {
                        undoView.j(76, 0L, null);
                        break;
                    }
                }
                break;
            default:
                jr jrVar = ((ar) this.b).b;
                if (z10) {
                    b5Var = ((org.telegram.ui.ActionBar.o2) jrVar).parentLayout;
                    if (b5Var != null) {
                        b5Var2 = ((org.telegram.ui.ActionBar.o2) jrVar).parentLayout;
                        List fragmentStack = b5Var2.getFragmentStack();
                        b5Var3 = ((org.telegram.ui.ActionBar.o2) jrVar).parentLayout;
                        org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) fragmentStack.get(b5Var3.getFragmentStack().size() - 2);
                        if (o2Var instanceof ho) {
                            o2Var.removeSelfFromStack();
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", jrVar.J);
                            ho hoVar = new ho(bundle);
                            hoVar.k0(jrVar.s);
                            b5Var4 = ((org.telegram.ui.ActionBar.o2) jrVar).parentLayout;
                            b5Var5 = ((org.telegram.ui.ActionBar.o2) jrVar).parentLayout;
                            ((ActionBarLayout) b5Var4).c(b5Var5.getFragmentStack().size() - 1, hoVar);
                            jrVar.finishFragment();
                            hoVar.c.j(76, 0L, null);
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

    private final /* synthetic */ void l(View view, float f10, float f11) {
    }

    private final /* synthetic */ void n(View view, float f10, float f11) {
    }

    private final /* synthetic */ void o(View view, float f10, float f11) {
    }
}
