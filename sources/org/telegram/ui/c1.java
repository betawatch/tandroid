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

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class c1 implements org.telegram.ui.Components.ln0, nh.c4, mg1, r0.o, org.telegram.ui.ActionBar.a2, ag.c0, org.telegram.ui.Components.cd0, org.telegram.ui.Components.qk0, org.telegram.ui.Components.cv0, jh.d9, CameraView.CameraViewDelegate, Utilities.Callback5, LanguageDetector.ExceptionCallback, org.telegram.ui.Components.dj0, MessagesStorage.BooleanCallback, org.telegram.ui.Cells.f0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ c1(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // r0.o
    public r0.m1 I0(View view, r0.m1 m1Var) {
        n0 n0Var;
        com.google.firebase.messaging.l lVar = (com.google.firebase.messaging.l) this.b;
        lVar.getClass();
        i0.c defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(m1Var, false);
        s4 s4Var = (s4) lVar.d;
        if (s4Var == view && (n0Var = s4Var.b) != null) {
            n0Var.setPadding(defaultWindowInsets.a, defaultWindowInsets.b, defaultWindowInsets.c, defaultWindowInsets.d);
        }
        return r0.m1.b;
    }

    @Override // org.telegram.ui.mg1
    public void a(int i10, ArrayList arrayList) {
        AndroidUtilities.runOnUIThread(new org.telegram.messenger.voip.l0(12, (n4) this.b, arrayList), 100L);
    }

    @Override // org.telegram.ui.Components.ln0
    public void b(float f10) {
        d1 d1Var = (d1) this.b;
        MessageObject messageObject = d1Var.I;
        if (messageObject == null) {
            return;
        }
        messageObject.audioProgress = f10;
        MediaController.getInstance().seekToProgress(d1Var.I, f10);
    }

    @Override // org.telegram.ui.Components.qk0
    public void c(float f10, float f11, int i10, View view) {
        org.telegram.ui.Components.n41 G;
        Object obj;
        long j10;
        switch (this.a) {
            case 7:
                a6 a6Var = (a6) this.b;
                ArrayList arrayList = a6Var.c;
                if (((z5) arrayList.get(i10)).a != 1) {
                    if (((z5) arrayList.get(i10)).a != 2) {
                        if (((z5) arrayList.get(i10)).a == 4) {
                            org.telegram.ui.ActionBar.b2 b2Var = org.telegram.ui.Components.y4.O(a6Var.getParentActivity(), LocaleController.getString(R.string.NotificationsDeleteAllExceptionTitle), LocaleController.getString(R.string.NotificationsDeleteAllExceptionAlert), LocaleController.getString(R.string.Delete), new lt0(a6Var, 13), null).a;
                            b2Var.show();
                            b2Var.h();
                            break;
                        }
                    } else {
                        CacheByChatsController.KeepMediaException keepMediaException = ((z5) arrayList.get(i10)).c;
                        y70 y70Var = new y70(view.getContext(), a6Var);
                        y70Var.g(false);
                        y70Var.setParentWindow(org.telegram.ui.Components.y4.Q(a6Var, y70Var, view, f10, f11));
                        y70Var.setCallback(new x5(a6Var, keepMediaException, 0));
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
                    gy gyVar = new gy(bundle);
                    gyVar.y2 = new jh.z1(10, a6Var, gyVar);
                    a6Var.presentFragment(gyVar);
                    break;
                }
                break;
            case 28:
                vt vtVar = (vt) this.b;
                HashSet hashSet = vtVar.X;
                if (!vtVar.Y && (G = vtVar.Z.G(i10 - 1)) != null && (obj = G.G) != null) {
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
                    if (view instanceof gg.o) {
                        ((gg.o) view).c(hashSet.contains(Long.valueOf(j10)), true);
                        break;
                    }
                }
                break;
            default:
                DataAutoDownloadActivity.W((DataAutoDownloadActivity) this.b, view, i10, f10);
                break;
        }
    }

    @Override // org.telegram.ui.Components.qk0
    public /* synthetic */ void c0(View view, float f10, float f11) {
        int i10 = this.a;
    }

    @Override // jh.d9
    public void d(Canvas canvas, RectF rectF, float f10) {
        h8 h8Var = (h8) ((g) this.b).b;
        Paint paint = h8Var.w;
        TextPaint textPaint = h8Var.e;
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
            canvas.drawText(Integer.toString(h8Var.d0 + 1), rectF.centerX(), rectF.centerY() + AndroidUtilities.dp(5.0f), textPaint);
            canvas.restore();
            textPaint.setAlpha(alpha);
        }
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
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
                } catch (Exception e9) {
                    FileLog.e(e9);
                    return;
                }
            case 8:
                p6 p6Var = (p6) this.b;
                o6 o6Var = new o6(p6Var.getContext(), false);
                o6Var.fixNavigationBar();
                o6Var.setCanDismissWithSwipe(false);
                o6Var.setCancelable(false);
                Context context = p6Var.getContext();
                r6 r6Var = new r6(context);
                org.telegram.ui.Components.ri0 ri0Var = new org.telegram.ui.Components.ri0(context);
                ri0Var.setAutoRepeat(true);
                ri0Var.f(R.raw.utyan_cache, ImageReceiver.DEFAULT_CROSSFADE_DURATION, ImageReceiver.DEFAULT_CROSSFADE_DURATION, null);
                r6Var.addView(ri0Var, h7.z5.d(ImageReceiver.DEFAULT_CROSSFADE_DURATION, 150.0f, 49, 0.0f, 16.0f, 0.0f, 0.0f));
                ri0Var.d();
                org.telegram.ui.Components.j6 j6Var = new org.telegram.ui.Components.j6(context, false, true, true);
                r6Var.a = j6Var;
                org.telegram.ui.Components.er erVar = org.telegram.ui.Components.er.g;
                j6Var.b(0.35f, 120L, erVar);
                j6Var.setGravity(1);
                int i13 = org.telegram.ui.ActionBar.g6.j5;
                j6Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i13, false));
                j6Var.setTextSize(AndroidUtilities.dp(24.0f));
                j6Var.setTypeface(AndroidUtilities.bold());
                r6Var.addView(j6Var, h7.z5.d(-1, 32.0f, 49, 0.0f, 176.0f, 0.0f, 0.0f));
                q6 q6Var = new q6(context);
                Paint paint = new Paint(1);
                q6Var.b = paint;
                Paint paint2 = new Paint(1);
                q6Var.c = paint2;
                q6Var.e = new org.telegram.ui.Components.y5(q6Var, 350L, erVar);
                int i14 = org.telegram.ui.ActionBar.g6.N6;
                paint.setColor(org.telegram.ui.ActionBar.g6.w0(null, i14, false));
                paint2.setColor(org.telegram.ui.ActionBar.g6.l1(0.2f, org.telegram.ui.ActionBar.g6.w0(null, i14, false)));
                r6Var.b = q6Var;
                r6Var.addView(q6Var, h7.z5.d(240, 5.0f, 49, 0.0f, 226.0f, 0.0f, 0.0f));
                TextView textView = new TextView(context);
                textView.setGravity(1);
                org.telegram.messenger.y1.s(textView, org.telegram.ui.ActionBar.g6.w0(null, i13, false), 1, 16.0f);
                textView.setText(LocaleController.getString(R.string.ClearingCache));
                r6Var.addView(textView, h7.z5.d(-1, -2.0f, 49, 0.0f, 261.0f, 0.0f, 0.0f));
                TextView textView2 = new TextView(context);
                textView2.setGravity(1);
                textView2.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i13, false));
                textView2.setTextSize(1, 14.0f);
                textView2.setText(LocaleController.getString(R.string.ClearingCacheDescription));
                r6Var.addView(textView2, h7.z5.d(240, -2.0f, 49, 0.0f, 289.0f, 0.0f, 0.0f));
                r6Var.a(0.0f);
                o6Var.setCustomView(r6Var);
                boolean[] zArr = {false};
                float[] fArr = {0.0f};
                boolean[] zArr2 = {false};
                androidx.car.app.utils.b bVar = new androidx.car.app.utils.b(p6Var, r6Var, fArr, zArr2, 26);
                long[] jArr = {-1};
                AndroidUtilities.runOnUIThread(new androidx.car.app.utils.b(p6Var, zArr, jArr, o6Var, 27), 150L);
                z6 z6Var = p6Var.d;
                m6 m6Var = new m6(fArr, zArr2, bVar, i12);
                n6 n6Var = new n6(zArr, r6Var, jArr, o6Var, 0);
                ih.b bVar2 = z6Var.U;
                if (bVar2 != null) {
                    bVar2.d();
                }
                w6 w6Var = z6Var.J;
                if (w6Var != null) {
                    w6Var.d();
                    z6Var.J.e(false);
                }
                z6Var.getFileLoader().cancelLoadAllFiles();
                z6Var.getFileLoader().getFileLoaderQueue().postRunnable(new e6(z6Var, m6Var, n6Var, i12));
                z6Var.U = null;
                w6 w6Var2 = z6Var.J;
                if (w6Var2 != null) {
                    w6Var2.setCacheModel(null);
                    break;
                }
                break;
            case 12:
                id.U((id) this.b, b2Var);
                break;
            case 15:
                ((lg) this.b).run();
                break;
            case 17:
                rn rnVar = ((dj) this.b).b;
                rnVar.finishFragment();
                rnVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needDeleteBusinessLink, rnVar.L3);
                break;
            case 21:
                rn rnVar2 = ((ul) this.b).a.M;
                i11 = ((org.telegram.ui.ActionBar.n2) rnVar2).currentAccount;
                ChatThemeController.getInstance(i11).clearWallpaper(rnVar2.P5, true, true);
                break;
            case 22:
                jp jpVar = (jp) this.b;
                boolean z10 = jpVar.s;
                if (!z10 || jpVar.h.linked_chat_id != 0) {
                    org.telegram.ui.ActionBar.b2[] b2VarArr = {new org.telegram.ui.ActionBar.b2(jpVar.getParentActivity(), 3, null)};
                    TLRPC.TL_channels_setDiscussionGroup tL_channels_setDiscussionGroup = new TLRPC.TL_channels_setDiscussionGroup();
                    if (z10) {
                        tL_channels_setDiscussionGroup.broadcast = MessagesController.getInputChannel(jpVar.f);
                        tL_channels_setDiscussionGroup.group = new TLRPC.TL_inputChannelEmpty();
                    } else {
                        tL_channels_setDiscussionGroup.broadcast = new TLRPC.TL_inputChannelEmpty();
                        tL_channels_setDiscussionGroup.group = MessagesController.getInputChannel(jpVar.f);
                    }
                    AndroidUtilities.runOnUIThread(new zo(jpVar, b2VarArr, jpVar.getConnectionsManager().sendRequest(tL_channels_setDiscussionGroup, new gg(5, jpVar, b2VarArr)), i12), 500L);
                    break;
                }
                break;
            default:
                ((nq) this.b).run(1);
                break;
        }
    }

    @Override // org.telegram.ui.Components.qk0
    public /* synthetic */ boolean f1(View view) {
        switch (this.a) {
            case 7:
                break;
            case 28:
                break;
        }
        return false;
    }

    @Override // org.telegram.ui.Components.dj0
    public void g(ArrayList arrayList) {
        xh xhVar = (xh) this.b;
        rn rnVar = xhVar.p;
        if (rnVar.getParentActivity() == null || rnVar.getParentActivity() == null) {
            return;
        }
        wh whVar = new wh(xhVar, rnVar, rnVar.getParentActivity(), rnVar.aa, arrayList);
        whVar.setCalcMandatoryInsets(rnVar.x9());
        whVar.setDimBehind(false);
        rnVar.A7(false);
        rnVar.showDialog(whVar);
    }

    @Override // org.telegram.ui.Components.cd0
    public void h(org.telegram.ui.Components.dd0 dd0Var) {
        BubbleActivity bubbleActivity = (BubbleActivity) this.b;
        BubbleActivity bubbleActivity2 = BubbleActivity.W;
        SharedConfig.isWaitingForPasscodeEnter = false;
        Intent intent = bubbleActivity.Q;
        if (intent != null) {
            bubbleActivity.y(intent, bubbleActivity.R, bubbleActivity.T, true, bubbleActivity.S);
            bubbleActivity.Q = null;
        }
        bubbleActivity.O.c0();
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.passcodeDismissed, dd0Var);
    }

    @Override // nh.c4
    public void i(boolean z10) {
        q3 q3Var = (q3) this.b;
        z3 z3Var = q3Var.G.G;
        if (z3Var != null) {
            q3Var.h = true;
            z3Var.dismiss(true);
        }
    }

    @Override // org.telegram.ui.Components.cv0
    public void j(int i10) {
        SharedConfig.getPreferences().edit().putInt("cache_limit", ((Integer) ((ArrayList) this.b).get(i10)).intValue()).apply();
    }

    public void k(String str) {
        rn rnVar = ((dm) this.b).M;
        if (str.startsWith("@")) {
            rnVar.getMessagesController().openByUserName(str.substring(1), rnVar, 0);
            return;
        }
        if (str.startsWith("#") || str.startsWith("$")) {
            gy gyVar = new gy(null);
            gyVar.j2 = str;
            rnVar.presentFragment(gyVar);
        } else {
            if (!str.startsWith("/")) {
                rnVar.xa(0, str, null, null, false);
                return;
            }
            rnVar.U.Z0(null, str, false, false);
            if (rnVar.U.getFieldText() == null) {
                rnVar.e9(false);
            }
        }
    }

    @Override // org.telegram.messenger.camera.CameraView.CameraViewDelegate
    public void onCameraInit() {
        t9 t9Var = (t9) this.b;
        HandlerThread handlerThread = t9Var.d;
        handlerThread.start();
        t9Var.e = new Handler(handlerThread.getLooper());
        AndroidUtilities.runOnUIThread(t9Var.Y, 0L);
        if (t9Var.a0()) {
            o1.j jVar = t9Var.x;
            if (jVar != null) {
                jVar.c();
                t9Var.x = null;
            }
            o1.j jVar2 = new o1.j(new hb.a(0.0f));
            t9Var.x = jVar2;
            int i10 = 0;
            jVar2.b(new l9(t9Var, i10));
            t9Var.x.a(new m9(t9Var, i10));
            t9Var.x.u = new o1.k(500.0f);
            t9Var.x.u.a(0.8f);
            t9Var.x.u.b(250.0f);
            t9Var.x.f();
        }
    }

    @Override // org.telegram.messenger.Utilities.Callback5
    public void run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        switch (this.a) {
            case 13:
                zd zdVar = (zd) this.b;
                org.telegram.ui.Components.n41 n41Var = (org.telegram.ui.Components.n41) obj;
                ((Integer) obj3).intValue();
                ((Float) obj4).floatValue();
                ((Float) obj5).floatValue();
                be beVar = zdVar.f;
                Object obj6 = n41Var.G;
                if (!(obj6 instanceof TL_stars.StarsTransaction)) {
                    if (obj6 instanceof TL_stats.BroadcastRevenueTransaction) {
                        fe.h0(zdVar.getContext(), zdVar.c, (TL_stats.BroadcastRevenueTransaction) n41Var.G, beVar.d, zdVar.b);
                        break;
                    }
                } else {
                    hh.oa.h1(zdVar.getContext(), true, beVar.d, zdVar.c, (TL_stars.StarsTransaction) n41Var.G, zdVar.b);
                    break;
                }
                break;
            default:
                js jsVar = (js) this.b;
                View view = (View) obj2;
                ((Integer) obj3).getClass();
                ((Float) obj4).getClass();
                ((Float) obj5).getClass();
                int i10 = ((org.telegram.ui.Components.n41) obj).d;
                if (i10 != 1) {
                    if (i10 == 2) {
                        boolean z10 = !jsVar.T;
                        jsVar.T = z10;
                        ((org.telegram.ui.Cells.p8) view).setChecked(z10);
                        break;
                    }
                } else {
                    TLRPC.User user = jsVar.getMessagesController().getUser(Long.valueOf(jsVar.D));
                    if (user != null && jsVar.getParentActivity() != null) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(jsVar.getParentActivity(), 0, jsVar.r);
                        alertDialog$Builder.a.N = LocaleController.getString(R.string.DeleteContact);
                        alertDialog$Builder.a.P = LocaleController.getString(R.string.AreYouSureDeleteContact);
                        alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new zr(0, jsVar, user));
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        alertDialog$Builder.d(-1);
                        alertDialog$Builder.o();
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ c1(cj cjVar, boolean z10) {
        this.a = 18;
        this.b = cjVar;
    }

    @Override // org.telegram.ui.Components.ln0
    public /* synthetic */ void e(float f10) {
    }

    @Override // org.telegram.ui.Components.cv0
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
                rn rnVar = ((cj) this.b).b.b;
                rnVar.qa(rnVar.Z3, true);
                break;
            case 19:
                rn rnVar2 = ((nl) this.b).b;
                if (z10) {
                    rnVar2.Q7();
                    UndoView undoView = rnVar2.u3;
                    if (undoView != null) {
                        undoView.j(76, 0L, null);
                        break;
                    }
                }
                break;
            default:
                lr lrVar = ((cr) this.b).b;
                if (z10) {
                    b5Var = ((org.telegram.ui.ActionBar.n2) lrVar).parentLayout;
                    if (b5Var != null) {
                        b5Var2 = ((org.telegram.ui.ActionBar.n2) lrVar).parentLayout;
                        List fragmentStack = b5Var2.getFragmentStack();
                        b5Var3 = ((org.telegram.ui.ActionBar.n2) lrVar).parentLayout;
                        org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) fragmentStack.get(b5Var3.getFragmentStack().size() - 2);
                        if (n2Var instanceof jo) {
                            n2Var.removeSelfFromStack();
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", lrVar.J);
                            jo joVar = new jo(bundle);
                            joVar.l0(lrVar.s);
                            b5Var4 = ((org.telegram.ui.ActionBar.n2) lrVar).parentLayout;
                            b5Var5 = ((org.telegram.ui.ActionBar.n2) lrVar).parentLayout;
                            ((ActionBarLayout) b5Var4).c(b5Var5.getFragmentStack().size() - 1, joVar);
                            lrVar.finishFragment();
                            joVar.c.j(76, 0L, null);
                            break;
                        } else {
                            lrVar.finishFragment();
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
