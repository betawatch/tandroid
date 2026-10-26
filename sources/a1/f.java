package a1;

import a3.m0;
import ai.k0;
import ai.o0;
import ai.t1;
import ai.y;
import ai.z;
import ai.z0;
import android.animation.AnimatorSet;
import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.os.Build;
import android.text.SpannableStringBuilder;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import b2.b2;
import bh.a1;
import bh.i0;
import bh.l0;
import bh.q;
import bh.u;
import bh.v0;
import bh.y0;
import bi.h7;
import c3.h0;
import e2.n0;
import i2.c0;
import i2.d0;
import i2.j0;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.jvm.internal.p;
import n4.s;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Cells.s4;
import org.telegram.ui.Components.RLottieNative;
import org.telegram.ui.Components.c6;
import org.telegram.ui.Components.fl0;
import org.telegram.ui.Components.wc;
import org.telegram.ui.aq0;
import v0.i;
import v0.o;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final /* synthetic */ class f implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ f(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:204:0x0453, code lost:
    
        if (r10 == null) goto L189;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:114:0x02c0  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        RLottieNative rLottieNative;
        FileOutputStream fileOutputStream;
        ai.g gVar;
        int i10 = 9;
        int i11 = 10;
        Bitmap bitmap = null;
        r8 = false;
        r8 = false;
        r8 = false;
        boolean z10 = false;
        final int i12 = 1;
        switch (this.a) {
            case 0:
                CredentialProviderPlayServicesImpl.runFallbackClearCredFlow$lambda$27$lambda$26$lambda$25$lambda$24((i) this.b, (Exception) this.c);
                return;
            case 1:
                CredentialProviderPlayServicesImpl.onClearCredential$lambda$14$lambda$13$lambda$12((i) this.b, (p) this.c);
                return;
            case 2:
                ((a3.f) ((rf.b) this.b).c).h.onVideoSizeChanged((b2) this.c);
                return;
            case 3:
                s sVar = (s) this.b;
                i2.d dVar = (i2.d) this.c;
                m0 m0Var = (m0) sVar.c;
                String str = n0.a;
                rf.b.D(((d0) m0Var).a.G, dVar);
                return;
            case 4:
                s sVar2 = (s) this.b;
                b2 b2Var = (b2) this.c;
                m0 m0Var2 = (m0) sVar2.c;
                String str2 = n0.a;
                j0 j0Var = ((d0) m0Var2).a;
                j0Var.k0 = b2Var;
                j0Var.m.e(25, new c0(b2Var));
                return;
            case 5:
                s sVar3 = (s) this.b;
                Exception exc = (Exception) this.c;
                m0 m0Var3 = (m0) sVar3.c;
                String str3 = n0.a;
                j2.e eVar = ((d0) m0Var3).a.s;
                j2.a p10 = eVar.p();
                eVar.q(p10, 1030, new ig.g(p10, exc, 2));
                return;
            case 6:
                s sVar4 = (s) this.b;
                String str4 = (String) this.c;
                m0 m0Var4 = (m0) sVar4.c;
                String str5 = n0.a;
                j2.e eVar2 = ((d0) m0Var4).a.s;
                j2.a p11 = eVar2.p();
                eVar2.q(p11, 1019, new ig.g(p11, str4, 9));
                return;
            case 7:
                y yVar = (y) this.b;
                if (((TLRPC.Document) this.c) != null) {
                    yVar.e();
                    return;
                } else {
                    yVar.getClass();
                    return;
                }
            case 8:
                z zVar = (z) this.b;
                File file = (File) this.c;
                int i13 = zVar.c;
                try {
                    rLottieNative = RLottieNative.a(file.getAbsolutePath(), null, null, null, 0, null);
                    if (rLottieNative != null) {
                        try {
                            Bitmap.Config config = Bitmap.Config.ARGB_8888;
                            Bitmap createBitmap = Bitmap.createBitmap(i13, i13, config);
                            rLottieNative.c(0, createBitmap, true);
                            Bitmap createBitmap2 = Bitmap.createBitmap(i13, i13, config);
                            Paint paint = new Paint(2);
                            paint.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                            new Canvas(createBitmap2).drawBitmap(createBitmap, 0.0f, 0.0f, paint);
                            createBitmap.recycle();
                            createBitmap2.setHasMipMap(true);
                            rLottieNative.d();
                            bitmap = createBitmap2;
                        } catch (Throwable th2) {
                            th = th2;
                            try {
                                FileLog.e(th);
                                break;
                            } finally {
                                if (rLottieNative != null) {
                                    rLottieNative.d();
                                }
                            }
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    rLottieNative = null;
                }
                AndroidUtilities.runOnUIThread(new f(i10, zVar, bitmap));
                return;
            case 9:
                z zVar2 = (z) this.b;
                Bitmap bitmap2 = (Bitmap) this.c;
                zVar2.h = true;
                if (zVar2.e) {
                    if (bitmap2 != null) {
                        bitmap2.recycle();
                        return;
                    }
                    return;
                } else {
                    if (bitmap2 != null) {
                        zVar2.d.run(bitmap2);
                        return;
                    }
                    return;
                }
            case 10:
                o0 o0Var = (o0) this.b;
                rf.b bVar = (rf.b) this.c;
                if (o0Var.V) {
                    return;
                }
                o0Var.e();
                o0Var.a.f((String) bVar.b);
                return;
            case 11:
                ai.m0 m0Var5 = (ai.m0) this.b;
                rf.b bVar2 = (rf.b) this.c;
                o0 o0Var2 = m0Var5.a;
                if (o0Var2.l0 || o0Var2.V || o0Var2.U) {
                    return;
                }
                o0Var2.l0 = true;
                o0Var2.h0 = false;
                o0Var2.performHapticFeedback(3, 2);
                PointF[] pointFArr = (PointF[]) bVar2.c;
                r8 = pointFArr.length >= 3 ? 1 : 0;
                if (r8 != 0) {
                    o0Var2.m0 = pointFArr;
                    o0Var2.invalidate();
                }
                AndroidUtilities.runOnUIThread(new f(i11, o0Var2, bVar2), r8 != 0 ? 450L : 0L);
                return;
            case 12:
                z0.V((z0) this.b, (AnimatorSet) this.c);
                return;
            case 13:
                z0 z0Var = (z0) this.b;
                Bitmap bitmap3 = (Bitmap) this.c;
                File file2 = new File(AndroidUtilities.getCacheDir(), "qr_code_" + System.currentTimeMillis() + ".png");
                try {
                    fileOutputStream = new FileOutputStream(file2);
                } catch (Exception e) {
                    FileLog.e(e);
                }
                try {
                    z10 = bitmap3.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
                    fileOutputStream.close();
                    bitmap3.recycle();
                    if (z10) {
                        AndroidUtilities.runOnUIThread(new f(15, z0Var, file2));
                        return;
                    }
                    return;
                } finally {
                }
            case 14:
                final z0 z0Var2 = (z0) this.b;
                o0 o0Var3 = (o0) this.c;
                if (o0.d(z0Var2.getParentActivity())) {
                    o0Var3.e();
                    ai.d0 d0Var = new ai.d0(i12);
                    Utilities.Callback callback = new Utilities.Callback() { // from class: ai.s0
                        @Override // org.telegram.messenger.Utilities.Callback
                        public final void run(Object obj) {
                            switch (r2) {
                                case 0:
                                    String str6 = (String) obj;
                                    z0 z0Var3 = z0Var2;
                                    if (z0Var3.getParentActivity() != null) {
                                        qf.d.r(z0Var3.getParentActivity(), str6);
                                        break;
                                    }
                                    break;
                                default:
                                    z0 z0Var4 = z0Var2;
                                    t1 t1Var = z0Var4.d;
                                    if (t1Var != null && !z0Var4.isFinished) {
                                        t1Var.d1(R.drawable.msg_download, LocaleController.getString(R.string.QrSavedToGallery), null);
                                        break;
                                    }
                                    break;
                            }
                        }
                    };
                    aq0 aq0Var = new aq0(10, false, false, null);
                    aq0Var.G = 1;
                    aq0Var.H = false;
                    aq0Var.x = false;
                    aq0Var.V = new k0(d0Var, z0Var2, callback);
                    z0Var2.presentFragment(aq0Var);
                    return;
                }
                return;
            case 15:
                final z0 z0Var3 = (z0) this.b;
                File file3 = (File) this.c;
                Activity parentActivity = z0Var3.getParentActivity();
                if (parentActivity == null) {
                    return;
                }
                MediaController.saveFile(file3.getAbsolutePath(), parentActivity, 0, file3.getName(), "image/png", new Utilities.Callback() { // from class: ai.s0
                    @Override // org.telegram.messenger.Utilities.Callback
                    public final void run(Object obj) {
                        switch (i12) {
                            case 0:
                                String str6 = (String) obj;
                                z0 z0Var32 = z0Var3;
                                if (z0Var32.getParentActivity() != null) {
                                    qf.d.r(z0Var32.getParentActivity(), str6);
                                    break;
                                }
                                break;
                            default:
                                z0 z0Var4 = z0Var3;
                                t1 t1Var = z0Var4.d;
                                if (t1Var != null && !z0Var4.isFinished) {
                                    t1Var.d1(R.drawable.msg_download, LocaleController.getString(R.string.QrSavedToGallery), null);
                                    break;
                                }
                                break;
                        }
                    }
                }, false);
                return;
            case 16:
                t1 t1Var = (t1) this.b;
                ai.g gVar2 = (ai.g) this.c;
                ai.h hVar = t1Var.s0;
                if (hVar.q == 2 && hVar.o < 1.0f) {
                    hVar.m = gVar2;
                    t1Var.invalidate();
                    return;
                }
                long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                t1Var.p2 = t1.j(t1Var.n2, 0.03f, 0.005f);
                t1Var.n2 = currentAnimationTimeMillis;
                ai.g gVar3 = hVar.m;
                if (gVar3 == null) {
                    hVar.m = gVar2;
                    hVar.n = null;
                    hVar.o = 1.0f;
                    return;
                }
                int i14 = (Build.VERSION.SDK_INT >= 29 ? 1 : 0) ^ 1;
                if (hVar.o < 1.0f && (gVar = hVar.n) != null) {
                    gVar3 = gVar;
                }
                hVar.n = gVar3;
                hVar.m = gVar2;
                hVar.o = 0.0f;
                hVar.q = i14;
                hVar.p = System.currentTimeMillis();
                boolean[] zArr = hVar.s;
                if (zArr != null) {
                    int length = zArr.length;
                    int i15 = hVar.n.e;
                    if (length >= i15 * i15) {
                        Arrays.fill(zArr, false);
                        hVar.G = i14 == 1;
                        return;
                    }
                }
                int i16 = hVar.n.e;
                hVar.s = new boolean[i16 * i16];
                hVar.G = i14 == 1;
                return;
            case 17:
                ((Utilities.Callback) this.b).run((ai.g) this.c);
                return;
            case 18:
                ViewGroup container = (ViewGroup) this.b;
                kotlin.jvm.internal.i.e(container, "$container");
                container.endViewTransition(null);
                throw null;
            case 19:
                ((i) this.b).onError(this.c);
                return;
            case 20:
                ((i) this.b).onResult((o) this.c);
                return;
            case 21:
                u uVar = (u) this.b;
                c6 c6Var = (c6) this.c;
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(uVar.h.getText());
                for (c6 c6Var2 : (c6[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), c6.class)) {
                    if (c6Var2 == c6Var) {
                        int editTextSelectionEnd = uVar.h.getEditTextSelectionEnd();
                        int spanEnd = spannableStringBuilder.getSpanEnd(c6Var2);
                        int spanStart = spannableStringBuilder.getSpanStart(c6Var2);
                        uVar.h.getText().delete(spanStart, spanEnd);
                        int i17 = spanEnd - spanStart;
                        q qVar = uVar.h;
                        if (spanEnd <= editTextSelectionEnd) {
                            editTextSelectionEnd -= i17;
                        }
                        qVar.setSelection(editTextSelectionEnd);
                        return;
                    }
                }
                return;
            case 22:
                u uVar2 = (u) this.b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.c;
                if (uVar2.V != null && tL_error.text.equals("BOOSTS_REQUIRED")) {
                    a1.f(-uVar2.R, uVar2.W, uVar2.V);
                    return;
                }
                String str6 = tL_error.text;
                if (str6.equals("REACTIONS_TOO_MANY")) {
                    str6 = LocaleController.formatPluralString("ReactionMaxCountError", uVar2.M, new Object[0]);
                }
                wc.b0(uVar2).t(str6, null).j();
                return;
            case 23:
                bh.s sVar5 = (bh.s) this.b;
                c6 c6Var3 = (c6) this.c;
                u uVar3 = sVar5.f2;
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(uVar3.h.getText());
                for (c6 c6Var4 : (c6[]) spannableStringBuilder2.getSpans(0, spannableStringBuilder2.length(), c6.class)) {
                    if (c6Var4 == c6Var3) {
                        int editTextSelectionEnd2 = uVar3.h.getEditTextSelectionEnd();
                        int spanEnd2 = spannableStringBuilder2.getSpanEnd(c6Var4);
                        int spanStart2 = spannableStringBuilder2.getSpanStart(c6Var4);
                        uVar3.h.getText().delete(spanStart2, spanEnd2);
                        int i18 = spanEnd2 - spanStart2;
                        q qVar2 = uVar3.h;
                        if (spanEnd2 <= editTextSelectionEnd2) {
                            editTextSelectionEnd2 -= i18;
                        }
                        qVar2.setSelection(editTextSelectionEnd2);
                        return;
                    }
                }
                return;
            case 24:
                i0 i0Var = (i0) this.b;
                fl0 fl0Var = (fl0) this.c;
                i0Var.l = true;
                i0Var.a.invalidate();
                fl0Var.c1 = false;
                fl0Var.invalidate();
                i0Var.c(true);
                return;
            case 25:
                l0 l0Var = (l0) this.b;
                bh.c cVar = (bh.c) this.c;
                l0Var.getText().delete(l0Var.getText().getSpanStart(cVar), l0Var.getText().getSpanEnd(cVar));
                l0Var.setCursorVisible(true);
                l0Var.setLongClickable(true);
                return;
            case 26:
                y0 y0Var = (y0) this.b;
                v0 v0Var = (v0) this.c;
                y0Var.getClass();
                TLRPC.ReactionCount reactionCount = v0Var.a;
                org.telegram.ui.Cells.z zVar3 = y0Var.z;
                if (h0.t(zVar3)) {
                    ((s4) zVar3).d(reactionCount, true, 0.0f, 0.0f);
                }
                v0Var.Y.c(false);
                y0Var.S = null;
                y0Var.T = false;
                y0Var.U = null;
                return;
            case 27:
                bi.j0 j0Var2 = (bi.j0) this.b;
                TLObject tLObject = (TLObject) this.c;
                int i19 = j0Var2.a;
                ArrayList arrayList = j0Var2.e;
                j0Var2.i = 0;
                if (tLObject instanceof TL_payments.connectedStarRefBots) {
                    TL_payments.connectedStarRefBots connectedstarrefbots = (TL_payments.connectedStarRefBots) tLObject;
                    MessagesController.getInstance(i19).putUsers(connectedstarrefbots.users, false);
                    if (j0Var2.c <= 0) {
                        arrayList.clear();
                    }
                    j0Var2.c = connectedstarrefbots.count;
                    arrayList.addAll(connectedstarrefbots.connected_bots);
                    j0Var2.d = connectedstarrefbots.connected_bots.isEmpty() || arrayList.size() >= j0Var2.c;
                } else {
                    j0Var2.h = true;
                    j0Var2.d = true;
                }
                j0Var2.g = false;
                NotificationCenter.getInstance(i19).lambda$postNotificationNameOnUIThread$1(NotificationCenter.channelConnectedBotsUpdate, Long.valueOf(j0Var2.b));
                return;
            case 28:
                bi.k0 k0Var = (bi.k0) this.b;
                TLObject tLObject2 = (TLObject) this.c;
                int i20 = k0Var.a;
                ArrayList arrayList2 = k0Var.e;
                if (tLObject2 instanceof TL_payments.suggestedStarRefBots) {
                    TL_payments.suggestedStarRefBots suggestedstarrefbots = (TL_payments.suggestedStarRefBots) tLObject2;
                    MessagesController.getInstance(i20).putUsers(suggestedstarrefbots.users, false);
                    if (k0Var.c <= 0) {
                        arrayList2.clear();
                    }
                    k0Var.c = suggestedstarrefbots.count;
                    arrayList2.addAll(suggestedstarrefbots.suggested_bots);
                    k0Var.j = suggestedstarrefbots.next_offset;
                    k0Var.d = suggestedstarrefbots.suggested_bots.isEmpty() || arrayList2.size() >= k0Var.c;
                } else {
                    k0Var.i = true;
                    k0Var.d = true;
                }
                k0Var.h = false;
                NotificationCenter.getInstance(i20).lambda$postNotificationNameOnUIThread$1(NotificationCenter.channelSuggestedBotsUpdate, Long.valueOf(k0Var.b));
                return;
            default:
                h7.e1((h7) this.b, (TL_stars.TL_payments_uniqueStarGift) this.c);
                return;
        }
    }
}
