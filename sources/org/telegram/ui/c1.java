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

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class c1 implements org.telegram.ui.Components.eo0, rh.l3, jh1, r0.o, org.telegram.ui.ActionBar.c2, eg.x, org.telegram.ui.Components.vd0, org.telegram.ui.Components.il0, org.telegram.ui.Components.tv0, nh.d9, CameraView.CameraViewDelegate, Utilities.Callback5, LanguageDetector.ExceptionCallback, org.telegram.ui.Components.vj0, MessagesStorage.BooleanCallback, org.telegram.ui.Cells.f0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ c1(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // r0.o
    public r0.m1 M0(View view, r0.m1 m1Var) {
        n0 n0Var;
        cb.m mVar = (cb.m) this.b;
        mVar.getClass();
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(m1Var, false);
        w4 w4Var = (w4) mVar.d;
        if (w4Var == view && (n0Var = w4Var.b) != null) {
            n0Var.setPadding(defaultWindowInsets.a, defaultWindowInsets.b, defaultWindowInsets.c, defaultWindowInsets.d);
        }
        return r0.m1.b;
    }

    @Override // org.telegram.ui.Components.il0
    public /* synthetic */ boolean Z0(View view) {
        switch (this.a) {
            case 7:
                break;
            case 28:
                break;
        }
        return false;
    }

    @Override // org.telegram.ui.jh1
    public void a(int i10, ArrayList arrayList) {
        AndroidUtilities.runOnUIThread(new org.telegram.messenger.voip.h(17, (r4) this.b, arrayList), 100L);
    }

    @Override // org.telegram.ui.Components.eo0
    public void b(float f10) {
        d1 d1Var = (d1) this.b;
        MessageObject messageObject = d1Var.J;
        if (messageObject == null) {
            return;
        }
        messageObject.audioProgress = f10;
        MediaController.getInstance().seekToProgress(d1Var.J, f10);
    }

    @Override // org.telegram.ui.Components.il0
    public void c(float f10, float f11, int i10, View view) {
        org.telegram.ui.Components.i51 G;
        Object obj;
        long j10;
        switch (this.a) {
            case 7:
                f6 f6Var = (f6) this.b;
                ArrayList arrayList = f6Var.c;
                if (((e6) arrayList.get(i10)).a != 1) {
                    if (((e6) arrayList.get(i10)).a != 2) {
                        if (((e6) arrayList.get(i10)).a == 4) {
                            org.telegram.ui.ActionBar.d2 d2Var = org.telegram.ui.Components.z4.O(f6Var.getParentActivity(), LocaleController.getString(R.string.NotificationsDeleteAllExceptionTitle), LocaleController.getString(R.string.NotificationsDeleteAllExceptionAlert), LocaleController.getString(R.string.Delete), new yt0(f6Var, 13), null).a;
                            d2Var.show();
                            d2Var.h();
                            break;
                        }
                    } else {
                        CacheByChatsController.KeepMediaException keepMediaException = ((e6) arrayList.get(i10)).c;
                        i80 i80Var = new i80(view.getContext(), f6Var);
                        i80Var.g(false);
                        i80Var.setParentWindow(org.telegram.ui.Components.z4.Q(f6Var, i80Var, view, f10, f11));
                        i80Var.setCallback(new c6(f6Var, keepMediaException, 0));
                        break;
                    }
                } else {
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("onlySelect", true);
                    bundle.putBoolean("checkCanWrite", false);
                    int i11 = f6Var.e;
                    if (i11 == 1) {
                        bundle.putInt("dialogsType", 6);
                    } else if (i11 == 2) {
                        bundle.putInt("dialogsType", 5);
                    } else {
                        bundle.putInt("dialogsType", 4);
                    }
                    bundle.putBoolean("allowGlobalSearch", false);
                    qy qyVar = new qy(bundle);
                    qyVar.z2 = new mg.w(9, f6Var, qyVar);
                    f6Var.presentFragment(qyVar);
                    break;
                }
                break;
            case 28:
                cu cuVar = (cu) this.b;
                HashSet hashSet = cuVar.Y;
                if (!cuVar.Z && (G = cuVar.a0.G(i10 - 1)) != null && (obj = G.G) != null) {
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

    @Override // nh.d9
    public void e(Canvas canvas, RectF rectF, float f10) {
        l8 l8Var = (l8) ((h) this.b).b;
        Paint paint = l8Var.w;
        TextPaint textPaint = l8Var.e;
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
            canvas.drawText(Integer.toString(l8Var.e0 + 1), rectF.centerX(), rectF.centerY() + AndroidUtilities.dp(5.0f), textPaint);
            canvas.restore();
            textPaint.setAlpha(alpha);
        }
    }

    @Override // org.telegram.ui.Components.vj0
    public void f(ArrayList arrayList) {
        fi fiVar = (fi) this.b;
        zn znVar = fiVar.p;
        if (znVar.getParentActivity() == null || znVar.getParentActivity() == null) {
            return;
        }
        ei eiVar = new ei(fiVar, znVar, znVar.getParentActivity(), znVar.ba, arrayList);
        eiVar.setCalcMandatoryInsets(znVar.x9());
        eiVar.setDimBehind(false);
        znVar.A7(false);
        znVar.showDialog(eiVar);
    }

    @Override // org.telegram.ui.Components.tv0
    public void g(int i10) {
        SharedConfig.getPreferences().edit().putInt("cache_limit", ((Integer) ((ArrayList) this.b).get(i10)).intValue()).apply();
    }

    @Override // org.telegram.ui.Components.vd0
    public void h(org.telegram.ui.Components.wd0 wd0Var) {
        BubbleActivity bubbleActivity = (BubbleActivity) this.b;
        BubbleActivity bubbleActivity2 = BubbleActivity.X;
        SharedConfig.isWaitingForPasscodeEnter = false;
        Intent intent = bubbleActivity.R;
        if (intent != null) {
            bubbleActivity.y(intent, bubbleActivity.S, bubbleActivity.U, true, bubbleActivity.T);
            bubbleActivity.R = null;
        }
        bubbleActivity.P.c0();
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.passcodeDismissed, wd0Var);
    }

    @Override // rh.l3
    public void i(boolean z4) {
        r3 r3Var = (r3) this.b;
        a4 a4Var = r3Var.H.H;
        if (a4Var != null) {
            r3Var.h = true;
            a4Var.dismiss(true);
        }
    }

    public void k(String str) {
        zn znVar = ((lm) this.b).N;
        if (str.startsWith("@")) {
            znVar.getMessagesController().openByUserName(str.substring(1), znVar, 0);
            return;
        }
        if (str.startsWith("#") || str.startsWith("$")) {
            qy qyVar = new qy(null);
            qyVar.k2 = str;
            znVar.presentFragment(qyVar);
        } else {
            if (!str.startsWith("/")) {
                znVar.xa(0, str, null, null, false);
                return;
            }
            znVar.V.a1(null, str, false, false);
            if (znVar.V.getFieldText() == null) {
                znVar.e9(false);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.c2
    public void l(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        int i11;
        int i12 = 0;
        int i13 = 1;
        switch (this.a) {
            case 4:
                l5 l5Var = (l5) this.b;
                l5Var.getClass();
                try {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                    l5Var.startActivity(intent);
                    break;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 8:
                u6 u6Var = (u6) this.b;
                t6 t6Var = new t6(u6Var.getContext(), false);
                t6Var.fixNavigationBar();
                t6Var.setCanDismissWithSwipe(false);
                t6Var.setCancelable(false);
                Context context = u6Var.getContext();
                v6 v6Var = new v6(context);
                org.telegram.ui.Components.jj0 jj0Var = new org.telegram.ui.Components.jj0(context);
                jj0Var.setAutoRepeat(true);
                jj0Var.f(R.raw.utyan_cache, ImageReceiver.DEFAULT_CROSSFADE_DURATION, ImageReceiver.DEFAULT_CROSSFADE_DURATION, null);
                v6Var.addView(jj0Var, k7.b6.d(ImageReceiver.DEFAULT_CROSSFADE_DURATION, 150.0f, 49, 0.0f, 16.0f, 0.0f, 0.0f));
                jj0Var.d();
                org.telegram.ui.Components.k6 k6Var = new org.telegram.ui.Components.k6(context, false, true, true);
                v6Var.a = k6Var;
                org.telegram.ui.Components.mr mrVar = org.telegram.ui.Components.mr.g;
                k6Var.b(0.35f, 120L, mrVar);
                k6Var.setGravity(1);
                int i14 = org.telegram.ui.ActionBar.j6.j5;
                k6Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i14, false));
                k6Var.setTextSize(AndroidUtilities.dp(24.0f));
                k6Var.setTypeface(AndroidUtilities.bold());
                v6Var.addView(k6Var, k7.b6.d(-1, 32.0f, 49, 0.0f, 176.0f, 0.0f, 0.0f));
                cg.r rVar = new cg.r(context);
                Paint paint = new Paint(1);
                rVar.b = paint;
                Paint paint2 = new Paint(1);
                rVar.c = paint2;
                rVar.e = new org.telegram.ui.Components.z5(rVar, 350L, mrVar);
                int i15 = org.telegram.ui.ActionBar.j6.N6;
                paint.setColor(org.telegram.ui.ActionBar.j6.w0(null, i15, false));
                paint2.setColor(org.telegram.ui.ActionBar.j6.l1(0.2f, org.telegram.ui.ActionBar.j6.w0(null, i15, false)));
                v6Var.b = rVar;
                v6Var.addView(rVar, k7.b6.d(240, 5.0f, 49, 0.0f, 226.0f, 0.0f, 0.0f));
                TextView textView = new TextView(context);
                textView.setGravity(1);
                org.telegram.messenger.y3.t(textView, org.telegram.ui.ActionBar.j6.w0(null, i14, false), 1, 16.0f);
                textView.setText(LocaleController.getString(R.string.ClearingCache));
                v6Var.addView(textView, k7.b6.d(-1, -2.0f, 49, 0.0f, 261.0f, 0.0f, 0.0f));
                TextView textView2 = new TextView(context);
                textView2.setGravity(1);
                textView2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i14, false));
                textView2.setTextSize(1, 14.0f);
                textView2.setText(LocaleController.getString(R.string.ClearingCacheDescription));
                v6Var.addView(textView2, k7.b6.d(240, -2.0f, 49, 0.0f, 289.0f, 0.0f, 0.0f));
                v6Var.a(0.0f);
                t6Var.setCustomView(v6Var);
                boolean[] zArr = {false};
                float[] fArr = {0.0f};
                boolean[] zArr2 = {false};
                androidx.car.app.utils.c cVar = new androidx.car.app.utils.c(u6Var, v6Var, fArr, zArr2, 22);
                long[] jArr = {-1};
                AndroidUtilities.runOnUIThread(new androidx.car.app.utils.c(u6Var, zArr, jArr, t6Var, 23), 150L);
                d7 d7Var = u6Var.d;
                r6 r6Var = new r6(fArr, zArr2, cVar, i12);
                s6 s6Var = new s6(zArr, v6Var, jArr, t6Var, 0);
                mh.b bVar = d7Var.V;
                if (bVar != null) {
                    bVar.d();
                }
                a7 a7Var = d7Var.K;
                if (a7Var != null) {
                    a7Var.d();
                    d7Var.K.e(false);
                }
                d7Var.getFileLoader().cancelLoadAllFiles();
                d7Var.getFileLoader().getFileLoaderQueue().postRunnable(new j6(d7Var, r6Var, s6Var, i12));
                d7Var.V = null;
                a7 a7Var2 = d7Var.K;
                if (a7Var2 != null) {
                    a7Var2.setCacheModel(null);
                    break;
                }
                break;
            case 12:
                pd.U((pd) this.b, d2Var);
                break;
            case 15:
                ((pg) this.b).run();
                break;
            case 17:
                zn znVar = ((lj) this.b).b;
                znVar.finishFragment();
                znVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needDeleteBusinessLink, znVar.M3);
                break;
            case 21:
                zn znVar2 = ((dm) this.b).a.N;
                i11 = ((org.telegram.ui.ActionBar.p2) znVar2).currentAccount;
                ChatThemeController.getInstance(i11).clearWallpaper(znVar2.Q5, true, true);
                break;
            case 22:
                sp spVar = (sp) this.b;
                boolean z4 = spVar.s;
                if (!z4 || spVar.h.linked_chat_id != 0) {
                    org.telegram.ui.ActionBar.d2[] d2VarArr = {new org.telegram.ui.ActionBar.d2(spVar.getParentActivity(), 3, null)};
                    TLRPC.TL_channels_setDiscussionGroup tL_channels_setDiscussionGroup = new TLRPC.TL_channels_setDiscussionGroup();
                    if (z4) {
                        tL_channels_setDiscussionGroup.broadcast = MessagesController.getInputChannel(spVar.f);
                        tL_channels_setDiscussionGroup.group = new TLRPC.TL_inputChannelEmpty();
                    } else {
                        tL_channels_setDiscussionGroup.broadcast = new TLRPC.TL_inputChannelEmpty();
                        tL_channels_setDiscussionGroup.group = MessagesController.getInputChannel(spVar.f);
                    }
                    AndroidUtilities.runOnUIThread(new hp(spVar, d2VarArr, spVar.getConnectionsManager().sendRequest(tL_channels_setDiscussionGroup, new no(i13, spVar, d2VarArr)), i12), 500L);
                    break;
                }
                break;
            default:
                ((vq) this.b).run(1);
                break;
        }
    }

    @Override // org.telegram.ui.Components.il0
    public /* synthetic */ void n0(View view, float f10, float f11) {
        int i10 = this.a;
    }

    @Override // org.telegram.messenger.camera.CameraView.CameraViewDelegate
    public void onCameraInit() {
        x9 x9Var = (x9) this.b;
        HandlerThread handlerThread = x9Var.d;
        handlerThread.start();
        x9Var.e = new Handler(handlerThread.getLooper());
        AndroidUtilities.runOnUIThread(x9Var.Z, 0L);
        if (x9Var.a0()) {
            o1.j jVar = x9Var.x;
            if (jVar != null) {
                jVar.c();
                x9Var.x = null;
            }
            o1.j jVar2 = new o1.j(new kb.a(0.0f));
            x9Var.x = jVar2;
            int i10 = 0;
            jVar2.b(new p9(x9Var, i10));
            x9Var.x.a(new q9(x9Var, i10));
            x9Var.x.u = new o1.k(500.0f);
            x9Var.x.u.a(0.8f);
            x9Var.x.u.b(250.0f);
            x9Var.x.f();
        }
    }

    @Override // org.telegram.messenger.Utilities.Callback5
    public void run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        switch (this.a) {
            case 13:
                ge geVar = (ge) this.b;
                org.telegram.ui.Components.i51 i51Var = (org.telegram.ui.Components.i51) obj;
                ((Integer) obj3).intValue();
                ((Float) obj4).floatValue();
                ((Float) obj5).floatValue();
                ie ieVar = geVar.f;
                Object obj6 = i51Var.G;
                if (!(obj6 instanceof TL_stars.StarsTransaction)) {
                    if (obj6 instanceof TL_stats.BroadcastRevenueTransaction) {
                        me.h0(geVar.getContext(), geVar.c, (TL_stats.BroadcastRevenueTransaction) i51Var.G, ieVar.d, geVar.b);
                        break;
                    }
                } else {
                    lh.ja.h1(geVar.getContext(), true, ieVar.d, geVar.c, (TL_stars.StarsTransaction) i51Var.G, geVar.b);
                    break;
                }
                break;
            default:
                ps psVar = (ps) this.b;
                View view = (View) obj2;
                ((Integer) obj3).getClass();
                ((Float) obj4).getClass();
                ((Float) obj5).getClass();
                int i10 = ((org.telegram.ui.Components.i51) obj).d;
                if (i10 != 1) {
                    if (i10 == 2) {
                        boolean z4 = !psVar.U;
                        psVar.U = z4;
                        ((org.telegram.ui.Cells.r8) view).setChecked(z4);
                        break;
                    }
                } else {
                    TLRPC.User user = psVar.getMessagesController().getUser(Long.valueOf(psVar.E));
                    if (user != null && psVar.getParentActivity() != null) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(psVar.getParentActivity(), 0, psVar.r);
                        alertDialog$Builder.a.O = LocaleController.getString(R.string.DeleteContact);
                        alertDialog$Builder.a.Q = LocaleController.getString(R.string.AreYouSureDeleteContact);
                        alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.Components.o1(29, psVar, user));
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        alertDialog$Builder.d(-1);
                        alertDialog$Builder.o();
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ c1(kj kjVar, boolean z4) {
        this.a = 18;
        this.b = kjVar;
    }

    @Override // org.telegram.ui.Components.eo0
    public /* synthetic */ void d(float f10) {
    }

    @Override // org.telegram.ui.Components.tv0
    public /* synthetic */ void j() {
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
                zn znVar = ((kj) this.b).b.b;
                znVar.qa(znVar.a4, true);
                break;
            case 19:
                zn znVar2 = ((wl) this.b).b;
                if (z4) {
                    znVar2.Q7();
                    UndoView undoView = znVar2.v3;
                    if (undoView != null) {
                        undoView.j(76, 0L, null);
                        break;
                    }
                }
                break;
            default:
                rr rrVar = ((jr) this.b).b;
                if (z4) {
                    e5Var = ((org.telegram.ui.ActionBar.p2) rrVar).parentLayout;
                    if (e5Var != null) {
                        e5Var2 = ((org.telegram.ui.ActionBar.p2) rrVar).parentLayout;
                        List fragmentStack = e5Var2.getFragmentStack();
                        e5Var3 = ((org.telegram.ui.ActionBar.p2) rrVar).parentLayout;
                        org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) fragmentStack.get(e5Var3.getFragmentStack().size() - 2);
                        if (p2Var instanceof ro) {
                            p2Var.removeSelfFromStack();
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", rrVar.K);
                            ro roVar = new ro(bundle);
                            roVar.l0(rrVar.s);
                            e5Var4 = ((org.telegram.ui.ActionBar.p2) rrVar).parentLayout;
                            e5Var5 = ((org.telegram.ui.ActionBar.p2) rrVar).parentLayout;
                            ((ActionBarLayout) e5Var4).c(e5Var5.getFragmentStack().size() - 1, roVar);
                            rrVar.finishFragment();
                            roVar.c.j(76, 0L, null);
                            break;
                        } else {
                            rrVar.finishFragment();
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

    private final /* synthetic */ void m(View view, float f10, float f11) {
    }

    private final /* synthetic */ void n(View view, float f10, float f11) {
    }

    private final /* synthetic */ void o(View view, float f10, float f11) {
    }
}
