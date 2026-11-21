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
import android.support.v4.media.session.a0;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.animation.AnimationUtils;
import bi.k1;
import ch.b0;
import ch.e0;
import ch.m;
import ch.n0;
import ch.p;
import ch.q0;
import ch.s0;
import ci.j0;
import ci.s;
import ci.t;
import ci.y;
import ci.z0;
import com.google.android.gms.internal.vision.e2;
import d3.h0;
import di.c0;
import di.f6;
import e2.x1;
import h2.l0;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import ji.l;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.r;
import l2.f0;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.a8;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.g0;
import org.telegram.messenger.gd;
import org.telegram.messenger.ks;
import org.telegram.messenger.mp;
import org.telegram.messenger.x10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.Cells.q4;
import org.telegram.ui.Cells.z;
import org.telegram.ui.Components.RLottieNative;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.lc;
import org.telegram.ui.Components.xi0;
import org.telegram.ui.Components.y5;
import org.telegram.ui.qm0;
import q4.q;
import v0.g;
import v0.n;
import w0.h;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ a(int i7, Object obj, Object obj2) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:182:0x0405, code lost:
    
        if (r4 == null) goto L174;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:93:0x026e  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        RLottieNative rLottieNative;
        ci.e eVar;
        TLRPC.Chat O0;
        Bitmap bitmap = null;
        final int i7 = 0;
        r10 = false;
        r10 = false;
        r10 = false;
        boolean z10 = false;
        final int i10 = 1;
        switch (this.a) {
            case 0:
                ((f) this.b).f().a(((r) this.c).a);
                return;
            case 1:
                ((f) this.b).f().a((h) this.c);
                return;
            case 2:
                ((f) this.b).f().onResult((n) this.c);
                return;
            case 3:
                p pVar = (p) this.b;
                y5 y5Var = (y5) this.c;
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(pVar.h.getText());
                y5[] y5VarArr = (y5[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), y5.class);
                int length = y5VarArr.length;
                while (i7 < length) {
                    y5 y5Var2 = y5VarArr[i7];
                    if (y5Var2 == y5Var) {
                        int editTextSelectionEnd = pVar.h.getEditTextSelectionEnd();
                        int spanEnd = spannableStringBuilder.getSpanEnd(y5Var2);
                        int spanStart = spannableStringBuilder.getSpanStart(y5Var2);
                        pVar.h.getText().delete(spanStart, spanEnd);
                        int i11 = spanEnd - spanStart;
                        m mVar = pVar.h;
                        if (spanEnd <= editTextSelectionEnd) {
                            editTextSelectionEnd -= i11;
                        }
                        mVar.setSelection(editTextSelectionEnd);
                        return;
                    }
                    i7++;
                }
                return;
            case 4:
                p pVar2 = (p) this.b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.c;
                if (pVar2.X != null && tL_error.text.equals("BOOSTS_REQUIRED")) {
                    s0.f(-pVar2.T, pVar2.Y, pVar2.X);
                    return;
                }
                String str = tL_error.text;
                if (str.equals("REACTIONS_TOO_MANY")) {
                    str = gd.G(pVar2.O, "ReactionMaxCountError", new Object[0]);
                }
                lc.b0(pVar2).t(str, null).j();
                return;
            case 5:
                ch.n nVar = (ch.n) this.b;
                y5 y5Var3 = (y5) this.c;
                p pVar3 = nVar.g2;
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(pVar3.h.getText());
                for (y5 y5Var4 : (y5[]) spannableStringBuilder2.getSpans(0, spannableStringBuilder2.length(), y5.class)) {
                    if (y5Var4 == y5Var3) {
                        int editTextSelectionEnd2 = pVar3.h.getEditTextSelectionEnd();
                        int spanEnd2 = spannableStringBuilder2.getSpanEnd(y5Var4);
                        int spanStart2 = spannableStringBuilder2.getSpanStart(y5Var4);
                        pVar3.h.getText().delete(spanStart2, spanEnd2);
                        int i12 = spanEnd2 - spanStart2;
                        m mVar2 = pVar3.h;
                        if (spanEnd2 <= editTextSelectionEnd2) {
                            editTextSelectionEnd2 -= i12;
                        }
                        mVar2.setSelection(editTextSelectionEnd2);
                        return;
                    }
                }
                return;
            case 6:
                b0 b0Var = (b0) this.b;
                xi0 xi0Var = (xi0) this.c;
                b0Var.l = true;
                b0Var.a.invalidate();
                xi0Var.d1 = false;
                xi0Var.invalidate();
                b0Var.c(true);
                return;
            case 7:
                e0 e0Var = (e0) this.b;
                ch.b bVar = (ch.b) this.c;
                e0Var.getText().delete(e0Var.getText().getSpanStart(bVar), e0Var.getText().getSpanEnd(bVar));
                e0Var.setCursorVisible(true);
                e0Var.setLongClickable(true);
                return;
            case 8:
                q0 q0Var = (q0) this.b;
                n0 n0Var = (n0) this.c;
                q0Var.getClass();
                TLRPC.ReactionCount reactionCount = n0Var.a;
                z zVar = q0Var.w;
                if (e2.s(zVar)) {
                    ((q4) zVar).d(reactionCount, true, 0.0f, 0.0f);
                }
                n0Var.X.c(false);
                q0Var.P = null;
                q0Var.Q = false;
                q0Var.R = null;
                return;
            case 9:
                s sVar = (s) this.b;
                if (((TLRPC.Document) this.c) != null) {
                    sVar.e();
                    return;
                } else {
                    sVar.getClass();
                    return;
                }
            case 10:
                t tVar = (t) this.b;
                File file = (File) this.c;
                int i13 = tVar.c;
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
                g0.g3(new a(11, tVar, bitmap));
                return;
            case 11:
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
            case 12:
                ci.b0 b0Var2 = (ci.b0) this.b;
                q qVar = (q) this.c;
                if (b0Var2.W) {
                    return;
                }
                b0Var2.e();
                b0Var2.a.i((String) qVar.b);
                return;
            case 13:
                sa saVar = (sa) this.b;
                q qVar2 = (q) this.c;
                ci.b0 b0Var3 = (ci.b0) saVar.b;
                if (b0Var3.m0 || b0Var3.W || b0Var3.V) {
                    return;
                }
                b0Var3.m0 = true;
                b0Var3.i0 = false;
                b0Var3.performHapticFeedback(3, 2);
                PointF[] pointFArr = (PointF[]) qVar2.c;
                Object[] objArr = pointFArr.length >= 3 ? 1 : null;
                if (objArr != null) {
                    b0Var3.n0 = pointFArr;
                    b0Var3.invalidate();
                }
                g0.h3(new a(12, b0Var3, qVar2), objArr != null ? 450L : 0L);
                return;
            case 14:
                j0.Z((j0) this.b, (AnimatorSet) this.c);
                return;
            case 15:
                j0 j0Var = (j0) this.b;
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
                    g0.g3(new a(17, j0Var, file2));
                    return;
                }
                return;
            case 16:
                final j0 j0Var2 = (j0) this.b;
                ci.b0 b0Var4 = (ci.b0) this.c;
                if (ci.b0.d(j0Var2.getParentActivity())) {
                    b0Var4.e();
                    y yVar = new y(i10);
                    x10 x10Var = new x10() { // from class: ci.e0
                        @Override // org.telegram.messenger.x10
                        public final void a(Object obj) {
                            int i14 = i7;
                            j0 j0Var3 = j0Var2;
                            switch (i14) {
                                case 0:
                                    String str2 = (String) obj;
                                    if (j0Var3.getParentActivity() != null) {
                                        vf.c.t(j0Var3.getParentActivity(), str2);
                                        break;
                                    }
                                    break;
                                default:
                                    z0 z0Var = j0Var3.d;
                                    if (z0Var != null && !j0Var3.isFinished) {
                                        z0Var.d1(R.drawable.msg_download, gd.N0(2131746275, null), null);
                                        break;
                                    }
                                    break;
                            }
                        }
                    };
                    qm0 qm0Var = new qm0(10, false, false, null);
                    qm0Var.H = 1;
                    qm0Var.I = false;
                    qm0Var.y = false;
                    qm0Var.W = new a0(yVar, j0Var2, x10Var, false, 19);
                    j0Var2.presentFragment(qm0Var);
                    return;
                }
                return;
            case 17:
                final j0 j0Var3 = (j0) this.b;
                File file3 = (File) this.c;
                Activity parentActivity = j0Var3.getParentActivity();
                if (parentActivity == null) {
                    return;
                }
                MediaController.d0(file3.getAbsolutePath(), parentActivity, 0, file3.getName(), "image/png", new x10() { // from class: ci.e0
                    @Override // org.telegram.messenger.x10
                    public final void a(Object obj) {
                        int i14 = i10;
                        j0 j0Var32 = j0Var3;
                        switch (i14) {
                            case 0:
                                String str2 = (String) obj;
                                if (j0Var32.getParentActivity() != null) {
                                    vf.c.t(j0Var32.getParentActivity(), str2);
                                    break;
                                }
                                break;
                            default:
                                z0 z0Var = j0Var32.d;
                                if (z0Var != null && !j0Var32.isFinished) {
                                    z0Var.d1(R.drawable.msg_download, gd.N0(2131746275, null), null);
                                    break;
                                }
                                break;
                        }
                    }
                });
                return;
            case 18:
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
                int i14 = (Build.VERSION.SDK_INT >= 29 ? 1 : 0) ^ 1;
                if (fVar.o < 1.0f && (eVar = fVar.n) != null) {
                    eVar3 = eVar;
                }
                fVar.n = eVar3;
                fVar.m = eVar2;
                fVar.o = 0.0f;
                fVar.q = i14;
                fVar.p = System.currentTimeMillis();
                boolean[] zArr = fVar.s;
                if (zArr != null) {
                    int length2 = zArr.length;
                    int i15 = fVar.n.e;
                    if (length2 >= i15 * i15) {
                        Arrays.fill(zArr, false);
                        fVar.G = i14 == 1;
                        return;
                    }
                }
                int i16 = fVar.n.e;
                fVar.s = new boolean[i16 * i16];
                fVar.G = i14 == 1;
                return;
            case 19:
                ((x10) this.b).a((ci.e) this.c);
                return;
            case 20:
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
            case 21:
                ((d3.e) ((q) this.b).c).h.a((x1) this.c);
                return;
            case 22:
                wf.b bVar2 = (wf.b) this.b;
                l2.c cVar = (l2.c) this.c;
                h0 h0Var = (h0) bVar2.c;
                String str2 = l0.a;
                l.z(((l2.z) h0Var).a.G, cVar);
                return;
            case 23:
                wf.b bVar3 = (wf.b) this.b;
                x1 x1Var = (x1) this.c;
                h0 h0Var2 = (h0) bVar3.c;
                String str3 = l0.a;
                f0 f0Var = ((l2.z) h0Var2).a;
                f0Var.k0 = x1Var;
                f0Var.m.e(25, new l2.y(x1Var));
                return;
            case 24:
                wf.b bVar4 = (wf.b) this.b;
                Exception exc = (Exception) this.c;
                h0 h0Var3 = (h0) bVar4.c;
                String str4 = l0.a;
                m2.d dVar = ((l2.z) h0Var3).a.s;
                m2.a U = dVar.U();
                dVar.V(U, 1030, new li.c(U, exc, 3));
                return;
            case 25:
                wf.b bVar5 = (wf.b) this.b;
                String str5 = (String) this.c;
                h0 h0Var4 = (h0) bVar5.c;
                String str6 = l0.a;
                m2.d dVar2 = ((l2.z) h0Var4).a.s;
                m2.a U2 = dVar2.U();
                dVar2.V(U2, 1019, new li.c(U2, str5, 10));
                return;
            case 26:
                di.b0 b0Var5 = (di.b0) this.b;
                TLObject tLObject = (TLObject) this.c;
                int i17 = b0Var5.a;
                ArrayList arrayList = b0Var5.e;
                b0Var5.i = 0;
                if (tLObject instanceof TL_payments.connectedStarRefBots) {
                    TL_payments.connectedStarRefBots connectedstarrefbots = (TL_payments.connectedStarRefBots) tLObject;
                    mp.u1(i17).f4(connectedstarrefbots.users, false);
                    if (b0Var5.c <= 0) {
                        arrayList.clear();
                    }
                    b0Var5.c = connectedstarrefbots.count;
                    arrayList.addAll(connectedstarrefbots.connected_bots);
                    b0Var5.d = connectedstarrefbots.connected_bots.isEmpty() || arrayList.size() >= b0Var5.c;
                } else {
                    b0Var5.h = true;
                    b0Var5.d = true;
                }
                b0Var5.g = false;
                ks.f(i17).k(ks.O3, Long.valueOf(b0Var5.b));
                return;
            case 27:
                c0 c0Var = (c0) this.b;
                TLObject tLObject2 = (TLObject) this.c;
                int i18 = c0Var.a;
                ArrayList arrayList2 = c0Var.e;
                if (tLObject2 instanceof TL_payments.suggestedStarRefBots) {
                    TL_payments.suggestedStarRefBots suggestedstarrefbots = (TL_payments.suggestedStarRefBots) tLObject2;
                    mp.u1(i18).f4(suggestedstarrefbots.users, false);
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
                ks.f(i18).k(ks.N3, Long.valueOf(c0Var.b));
                return;
            case 28:
                f6 f6Var = (f6) this.b;
                Long l10 = (Long) this.c;
                String str7 = (l10.longValue() >= 0 || (O0 = mp.u1(f6Var.a).O0(Long.valueOf(-l10.longValue()))) == null) ? "" : O0.title;
                gc Q = f6Var.k().Q(R.raw.contact_check, 36, g0.W2(TextUtils.isEmpty(str7) ? gd.N0(2131749443, null) : gd.a0(null, null, 2131749444, str7)));
                Q.t = true;
                Q.j();
                return;
            default:
                f6 f6Var2 = (f6) this.b;
                k1 k1Var = (k1) this.c;
                if (k1Var != null) {
                    f6Var2.getClass();
                    k1Var.dismiss();
                    f6Var2.O0 = true;
                }
                f6Var2.dismiss();
                return;
        }
    }
}
