package c1;

import a8.sa;
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
import android.text.TextUtils;
import android.view.animation.AnimationUtils;
import ch.b0;
import ch.e0;
import ch.l;
import ch.m;
import ch.n0;
import ch.o;
import ch.q0;
import ch.s0;
import ci.a0;
import ci.i0;
import ci.s;
import ci.t;
import ci.x;
import ci.z0;
import com.google.android.gms.internal.vision.e2;
import d3.h0;
import di.c0;
import di.c6;
import e2.x1;
import h2.l0;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.jvm.internal.j;
import l2.f0;
import l2.y;
import li.p;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.a8;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.g0;
import org.telegram.messenger.hd;
import org.telegram.messenger.k5;
import org.telegram.messenger.np;
import org.telegram.messenger.ns;
import org.telegram.messenger.z10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.t1;
import org.telegram.ui.Cells.p4;
import org.telegram.ui.Cells.z;
import org.telegram.ui.Components.RLottieNative;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.mi0;
import org.telegram.ui.Components.p5;
import org.telegram.ui.Components.xb;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.nm0;
import q4.q;
import v0.g;
import v0.n;
import w0.h;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes.dex */
public final /* synthetic */ class c implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ c(int i7, Object obj, Object obj2) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:189:0x0434, code lost:
    
        if (r5 == null) goto L180;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x029c  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        RLottieNative rLottieNative;
        ci.e eVar;
        cc a02;
        int i7;
        int i10;
        TLRPC.Chat M0;
        int i11 = 10;
        Bitmap bitmap = null;
        final int i12 = 0;
        r10 = false;
        r10 = false;
        r10 = false;
        boolean z10 = false;
        final int i13 = 1;
        switch (this.a) {
            case 0:
                ((f) this.b).f().a((h) this.c);
                return;
            case 1:
                ((f) this.b).f().onResult((n) this.c);
                return;
            case 2:
                o oVar = (o) this.b;
                p5 p5Var = (p5) this.c;
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(oVar.h.getText());
                p5[] p5VarArr = (p5[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), p5.class);
                int length = p5VarArr.length;
                while (i12 < length) {
                    p5 p5Var2 = p5VarArr[i12];
                    if (p5Var2 == p5Var) {
                        int editTextSelectionEnd = oVar.h.getEditTextSelectionEnd();
                        int spanEnd = spannableStringBuilder.getSpanEnd(p5Var2);
                        int spanStart = spannableStringBuilder.getSpanStart(p5Var2);
                        oVar.h.getText().delete(spanStart, spanEnd);
                        int i14 = spanEnd - spanStart;
                        l lVar = oVar.h;
                        if (spanEnd <= editTextSelectionEnd) {
                            editTextSelectionEnd -= i14;
                        }
                        lVar.setSelection(editTextSelectionEnd);
                        return;
                    }
                    i12++;
                }
                return;
            case 3:
                o oVar2 = (o) this.b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.c;
                if (oVar2.X != null && tL_error.text.equals("BOOSTS_REQUIRED")) {
                    s0.f(-oVar2.T, oVar2.Y, oVar2.X);
                    return;
                }
                String str = tL_error.text;
                if (str.equals("REACTIONS_TOO_MANY")) {
                    str = hd.G(oVar2.O, "ReactionMaxCountError", new Object[0]);
                }
                cc.a0(oVar2).t(str, null).j();
                return;
            case 4:
                m mVar = (m) this.b;
                p5 p5Var3 = (p5) this.c;
                o oVar3 = mVar.g2;
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(oVar3.h.getText());
                for (p5 p5Var4 : (p5[]) spannableStringBuilder2.getSpans(0, spannableStringBuilder2.length(), p5.class)) {
                    if (p5Var4 == p5Var3) {
                        int editTextSelectionEnd2 = oVar3.h.getEditTextSelectionEnd();
                        int spanEnd2 = spannableStringBuilder2.getSpanEnd(p5Var4);
                        int spanStart2 = spannableStringBuilder2.getSpanStart(p5Var4);
                        oVar3.h.getText().delete(spanStart2, spanEnd2);
                        int i15 = spanEnd2 - spanStart2;
                        l lVar2 = oVar3.h;
                        if (spanEnd2 <= editTextSelectionEnd2) {
                            editTextSelectionEnd2 -= i15;
                        }
                        lVar2.setSelection(editTextSelectionEnd2);
                        return;
                    }
                }
                return;
            case 5:
                b0 b0Var = (b0) this.b;
                mi0 mi0Var = (mi0) this.c;
                b0Var.l = true;
                b0Var.a.invalidate();
                mi0Var.d1 = false;
                mi0Var.invalidate();
                b0Var.c(true);
                return;
            case 6:
                e0 e0Var = (e0) this.b;
                ch.b bVar = (ch.b) this.c;
                e0Var.getText().delete(e0Var.getText().getSpanStart(bVar), e0Var.getText().getSpanEnd(bVar));
                e0Var.setCursorVisible(true);
                e0Var.setLongClickable(true);
                return;
            case 7:
                q0 q0Var = (q0) this.b;
                n0 n0Var = (n0) this.c;
                q0Var.getClass();
                TLRPC.ReactionCount reactionCount = n0Var.a;
                z zVar = q0Var.w;
                if (e2.s(zVar)) {
                    ((p4) zVar).c(reactionCount, true, 0.0f, 0.0f);
                }
                n0Var.X.c(false);
                q0Var.P = null;
                q0Var.Q = false;
                q0Var.R = null;
                return;
            case 8:
                s sVar = (s) this.b;
                if (((TLRPC.Document) this.c) != null) {
                    sVar.e();
                    return;
                } else {
                    sVar.getClass();
                    return;
                }
            case 9:
                t tVar = (t) this.b;
                File file = (File) this.c;
                int i16 = tVar.c;
                try {
                    rLottieNative = RLottieNative.a(file.getAbsolutePath(), null, null, null, 0, null);
                    if (rLottieNative != null) {
                        try {
                            Bitmap.Config config = Bitmap.Config.ARGB_8888;
                            Bitmap createBitmap = Bitmap.createBitmap(i16, i16, config);
                            rLottieNative.c(0, createBitmap, true);
                            Bitmap createBitmap2 = Bitmap.createBitmap(i16, i16, config);
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
                                a8.g(th, true);
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
                g0.h3(new c(i11, tVar, bitmap));
                return;
            case 10:
                t tVar2 = (t) this.b;
                Bitmap bitmap2 = (Bitmap) this.c;
                tVar2.h = true;
                if (tVar2.e) {
                    if (bitmap2 != null) {
                        bitmap2.recycle();
                        return;
                    }
                    return;
                } else {
                    if (bitmap2 != null) {
                        tVar2.d.a(bitmap2);
                        return;
                    }
                    return;
                }
            case 11:
                a0 a0Var = (a0) this.b;
                q qVar = (q) this.c;
                if (a0Var.W) {
                    return;
                }
                a0Var.e();
                a0Var.a.j((String) qVar.b);
                return;
            case 12:
                sa saVar = (sa) this.b;
                q qVar2 = (q) this.c;
                a0 a0Var2 = (a0) saVar.b;
                if (a0Var2.m0 || a0Var2.W || a0Var2.V) {
                    return;
                }
                a0Var2.m0 = true;
                a0Var2.i0 = false;
                a0Var2.performHapticFeedback(3, 2);
                PointF[] pointFArr = (PointF[]) qVar2.c;
                Object[] objArr = pointFArr.length >= 3 ? 1 : null;
                if (objArr != null) {
                    a0Var2.n0 = pointFArr;
                    a0Var2.invalidate();
                }
                g0.i3(new c(11, a0Var2, qVar2), objArr != null ? 450L : 0L);
                return;
            case 13:
                i0.Z((i0) this.b, (AnimatorSet) this.c);
                return;
            case 14:
                i0 i0Var = (i0) this.b;
                Bitmap bitmap3 = (Bitmap) this.c;
                File file2 = new File(g0.E0(), "qr_code_" + System.currentTimeMillis() + ".png");
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(file2);
                    try {
                        z10 = bitmap3.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
                        fileOutputStream.close();
                    } finally {
                    }
                } catch (Exception e10) {
                    a8.g(e10, true);
                }
                bitmap3.recycle();
                if (z10) {
                    g0.h3(new c(16, i0Var, file2));
                    return;
                }
                return;
            case 15:
                final i0 i0Var2 = (i0) this.b;
                a0 a0Var3 = (a0) this.c;
                if (a0.d(i0Var2.getParentActivity())) {
                    a0Var3.e();
                    x xVar = new x(i13);
                    z10 z10Var = new z10() { // from class: ci.d0
                        @Override // org.telegram.messenger.z10
                        public final void a(Object obj) {
                            int i17 = i12;
                            i0 i0Var3 = i0Var2;
                            switch (i17) {
                                case 0:
                                    String str2 = (String) obj;
                                    if (i0Var3.getParentActivity() != null) {
                                        vf.c.t(i0Var3.getParentActivity(), str2);
                                        break;
                                    }
                                    break;
                                default:
                                    z0 z0Var = i0Var3.d;
                                    if (z0Var != null && !i0Var3.isFinished) {
                                        z0Var.d1(R.drawable.msg_download, hd.M0(2131746471, null), null);
                                        break;
                                    }
                                    break;
                            }
                        }
                    };
                    nm0 nm0Var = new nm0(10, false, false, null);
                    nm0Var.H = 1;
                    nm0Var.I = false;
                    nm0Var.y = false;
                    nm0Var.W = new android.support.v4.media.session.a0(xVar, i0Var2, z10Var, false, 19);
                    i0Var2.presentFragment(nm0Var);
                    return;
                }
                return;
            case 16:
                final i0 i0Var3 = (i0) this.b;
                File file3 = (File) this.c;
                Activity parentActivity = i0Var3.getParentActivity();
                if (parentActivity == null) {
                    return;
                }
                MediaController.d0(file3.getAbsolutePath(), parentActivity, 0, file3.getName(), "image/png", new z10() { // from class: ci.d0
                    @Override // org.telegram.messenger.z10
                    public final void a(Object obj) {
                        int i17 = i13;
                        i0 i0Var32 = i0Var3;
                        switch (i17) {
                            case 0:
                                String str2 = (String) obj;
                                if (i0Var32.getParentActivity() != null) {
                                    vf.c.t(i0Var32.getParentActivity(), str2);
                                    break;
                                }
                                break;
                            default:
                                z0 z0Var = i0Var32.d;
                                if (z0Var != null && !i0Var32.isFinished) {
                                    z0Var.d1(R.drawable.msg_download, hd.M0(2131746471, null), null);
                                    break;
                                }
                                break;
                        }
                    }
                });
                return;
            case 17:
                z0 z0Var = (z0) this.b;
                ci.e eVar2 = (ci.e) this.c;
                ci.f fVar = z0Var.t0;
                if (fVar.q == 2 && fVar.o < 1.0f) {
                    fVar.m = eVar2;
                    z0Var.invalidate();
                    return;
                }
                long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                z0Var.q2 = z0.j(z0Var.o2, 0.03f, 0.005f);
                z0Var.o2 = currentAnimationTimeMillis;
                ci.e eVar3 = fVar.m;
                if (eVar3 == null) {
                    fVar.m = eVar2;
                    fVar.n = null;
                    fVar.o = 1.0f;
                    return;
                }
                int i17 = (Build.VERSION.SDK_INT >= 29 ? 1 : 0) ^ 1;
                if (fVar.o < 1.0f && (eVar = fVar.n) != null) {
                    eVar3 = eVar;
                }
                fVar.n = eVar3;
                fVar.m = eVar2;
                fVar.o = 0.0f;
                fVar.q = i17;
                fVar.p = System.currentTimeMillis();
                boolean[] zArr = fVar.s;
                if (zArr != null) {
                    int length2 = zArr.length;
                    int i18 = fVar.n.e;
                    if (length2 >= i18 * i18) {
                        Arrays.fill(zArr, false);
                        fVar.G = i17 == 1;
                        return;
                    }
                }
                int i19 = fVar.n.e;
                fVar.s = new boolean[i19 * i19];
                fVar.G = i17 == 1;
                return;
            case 18:
                ((z10) this.b).a((ci.e) this.c);
                return;
            case 19:
                d1.e eVar4 = (d1.e) this.b;
                v0.f fVar2 = (v0.f) this.c;
                g gVar = eVar4.f;
                if (gVar != null) {
                    gVar.onResult(fVar2);
                    return;
                } else {
                    j.h("callback");
                    throw null;
                }
            case 20:
                ((d3.e) ((q) this.b).c).h.b((x1) this.c);
                return;
            case 21:
                wf.b bVar2 = (wf.b) this.b;
                l2.c cVar = (l2.c) this.c;
                h0 h0Var = (h0) bVar2.c;
                String str2 = l0.a;
                ji.j.T(((l2.z) h0Var).a.G, cVar);
                return;
            case 22:
                wf.b bVar3 = (wf.b) this.b;
                x1 x1Var = (x1) this.c;
                h0 h0Var2 = (h0) bVar3.c;
                String str3 = l0.a;
                f0 f0Var = ((l2.z) h0Var2).a;
                f0Var.k0 = x1Var;
                f0Var.m.e(25, new y(x1Var));
                return;
            case 23:
                wf.b bVar4 = (wf.b) this.b;
                Exception exc = (Exception) this.c;
                h0 h0Var3 = (h0) bVar4.c;
                String str4 = l0.a;
                m2.e eVar5 = ((l2.z) h0Var3).a.s;
                m2.a U = eVar5.U();
                eVar5.V(U, 1030, new p(U, exc, 2));
                return;
            case 24:
                wf.b bVar5 = (wf.b) this.b;
                String str5 = (String) this.c;
                h0 h0Var4 = (h0) bVar5.c;
                String str6 = l0.a;
                m2.e eVar6 = ((l2.z) h0Var4).a.s;
                m2.a U2 = eVar6.U();
                eVar6.V(U2, 1019, new p(U2, str5, 9));
                return;
            case 25:
                di.b0 b0Var2 = (di.b0) this.b;
                TLObject tLObject = (TLObject) this.c;
                int i20 = b0Var2.a;
                ArrayList arrayList = b0Var2.e;
                b0Var2.i = 0;
                if (tLObject instanceof TL_payments.connectedStarRefBots) {
                    TL_payments.connectedStarRefBots connectedstarrefbots = (TL_payments.connectedStarRefBots) tLObject;
                    np.s1(i20).Y3(connectedstarrefbots.users, false);
                    if (b0Var2.c <= 0) {
                        arrayList.clear();
                    }
                    b0Var2.c = connectedstarrefbots.count;
                    arrayList.addAll(connectedstarrefbots.connected_bots);
                    b0Var2.d = connectedstarrefbots.connected_bots.isEmpty() || arrayList.size() >= b0Var2.c;
                } else {
                    b0Var2.h = true;
                    b0Var2.d = true;
                }
                b0Var2.g = false;
                ns.f(i20).k(ns.L3, Long.valueOf(b0Var2.b));
                return;
            case 26:
                c0 c0Var = (c0) this.b;
                TLObject tLObject2 = (TLObject) this.c;
                int i21 = c0Var.a;
                ArrayList arrayList2 = c0Var.e;
                if (tLObject2 instanceof TL_payments.suggestedStarRefBots) {
                    TL_payments.suggestedStarRefBots suggestedstarrefbots = (TL_payments.suggestedStarRefBots) tLObject2;
                    np.s1(i21).Y3(suggestedstarrefbots.users, false);
                    if (c0Var.c <= 0) {
                        arrayList2.clear();
                    }
                    c0Var.c = suggestedstarrefbots.count;
                    arrayList2.addAll(suggestedstarrefbots.suggested_bots);
                    c0Var.j = suggestedstarrefbots.next_offset;
                    c0Var.d = suggestedstarrefbots.suggested_bots.isEmpty() || arrayList2.size() >= c0Var.c;
                } else {
                    c0Var.i = true;
                    c0Var.d = true;
                }
                c0Var.h = false;
                ns.f(i21).k(ns.K3, Long.valueOf(c0Var.b));
                return;
            case 27:
                c6.g1((c6) this.b, (TL_stars.TL_payments_uniqueStarGift) this.c);
                return;
            case 28:
                t1 t1Var = (t1) this.b;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.c;
                t1Var.dismiss();
                org.telegram.ui.ActionBar.e2 T = LaunchActivity.T();
                if (T != null) {
                    if (tL_error2 == null || !"STARGIFT_ALREADY_BURNED".equalsIgnoreCase(tL_error2.text)) {
                        a02 = cc.a0(T);
                        i7 = R.raw.error;
                        i10 = 2131743881;
                    } else {
                        a02 = cc.a0(T);
                        i7 = R.raw.fire_on;
                        i10 = 2131743880;
                    }
                    k5.n(null, i10, a02, i7, 36);
                    return;
                }
                return;
            default:
                c6 c6Var = (c6) this.b;
                Long l10 = (Long) this.c;
                String str7 = (l10.longValue() >= 0 || (M0 = np.s1(c6Var.a).M0(Long.valueOf(-l10.longValue()))) == null) ? "" : M0.title;
                xb Q = c6Var.k().Q(R.raw.contact_check, 36, g0.X2(TextUtils.isEmpty(str7) ? hd.M0(2131749616, null) : hd.a0(null, null, 2131749617, str7)));
                Q.t = true;
                Q.j();
                return;
        }
    }
}
