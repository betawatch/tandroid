package di;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.is;
import org.telegram.messenger.np;
import org.telegram.messenger.ns;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.er;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class u0 extends View implements is {
    public final org.telegram.ui.Components.u5 E;
    public float F;
    public m8 G;
    public final ArrayList H;
    public final ArrayList I;
    public final HashSet J;
    public int K;
    public final DecelerateInterpolator L;
    public final LinearInterpolator M;
    public t0 N;
    public final int a;
    public final long b;
    public final View c;
    public boolean d;
    public float e;
    public float f;
    public boolean h;
    public float n;
    public float r;
    public float s;
    public float w;
    public float x;
    public float y;

    public u0(Context context, int i7, long j3, org.telegram.ui.k0 k0Var) {
        super(context);
        this.d = true;
        this.E = new org.telegram.ui.Components.u5(this, 0L, 350L, er.h);
        this.F = 1.0f;
        this.H = new ArrayList();
        this.I = new ArrayList();
        this.J = new HashSet();
        this.L = new DecelerateInterpolator();
        this.M = new LinearInterpolator();
        this.a = i7;
        this.b = j3;
        this.c = k0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:103:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:104:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01a9 A[LOOP:3: B:63:0x01a5->B:65:0x01a9, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01f9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a() {
        TLRPC.EmojiStatus emojiStatus;
        m8 G;
        boolean z10;
        int i7;
        ArrayList arrayList;
        int i10;
        int i11;
        t0 t0Var;
        t0 t0Var2;
        int i12 = this.a;
        if (!np.s1(i12).z7) {
            return;
        }
        this.K = np.s1(i12).L6;
        ArrayList arrayList2 = this.H;
        arrayList2.clear();
        ArrayList arrayList3 = this.I;
        arrayList2.addAll(arrayList3);
        arrayList3.clear();
        HashSet hashSet = this.J;
        hashSet.clear();
        long j3 = this.b;
        if (j3 >= 0) {
            TLRPC.User a22 = np.s1(i12).a2(Long.valueOf(j3));
            if (a22 != null) {
                emojiStatus = a22.emoji_status;
                if (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) {
                    hashSet.add(Long.valueOf(((TLRPC.TL_emojiStatusCollectible) emojiStatus).collectible_id));
                }
                int i13 = 0;
                G = v8.y(i12, false).G(j3, true);
                this.G = G;
                if (G != null) {
                    for (int i14 = 0; i14 < this.G.l.size(); i14++) {
                        TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) this.G.l.get(i14);
                        if (!savedStarGift.unsaved && savedStarGift.pinned_to_top) {
                            TL_stars.StarGift starGift = savedStarGift.gift;
                            if (starGift instanceof TL_stars.TL_starGiftUnique) {
                                t0 t0Var3 = new t0(this, (TL_stars.TL_starGiftUnique) starGift);
                                long j10 = t0Var3.a;
                                if (!hashSet.contains(Long.valueOf(j10))) {
                                    arrayList3.add(t0Var3);
                                    hashSet.add(Long.valueOf(j10));
                                }
                            }
                        }
                    }
                }
                if (arrayList3.size() == arrayList2.size()) {
                    for (int i15 = 0; i15 < arrayList3.size(); i15++) {
                        t0 t0Var4 = (t0) arrayList3.get(i15);
                        t0 t0Var5 = (t0) arrayList2.get(i15);
                        t0Var4.getClass();
                        if (t0Var5 != null && t0Var5.a == t0Var4.a) {
                        }
                    }
                    z10 = false;
                    i7 = 0;
                    while (i7 < arrayList3.size()) {
                        t0 t0Var6 = (t0) arrayList3.get(i7);
                        int i16 = i13;
                        while (true) {
                            if (i16 >= arrayList2.size()) {
                                t0Var2 = null;
                                break;
                            } else {
                                if (((t0) arrayList2.get(i16)).a == t0Var6.a) {
                                    t0Var2 = (t0) arrayList2.get(i16);
                                    break;
                                }
                                i16++;
                            }
                        }
                        if (t0Var2 != null) {
                            t0Var6.getClass();
                            t0Var6.h = t0Var2.h;
                            t0Var6.j = t0Var2.j;
                            t0Var6.i = t0Var2.i;
                            t0Var6.k = t0Var2.k;
                            t0Var6.f = t0Var2.f;
                            t0Var6.g = t0Var2.g;
                        } else {
                            float L = org.telegram.messenger.g0.L(22.5f);
                            int i17 = t0Var6.d;
                            t0Var6.h = new RadialGradient(0.0f, 0.0f, L, new int[]{i17, org.telegram.ui.ActionBar.j6.r1(0.0f, i17)}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                            Paint paint = new Paint(1);
                            t0Var6.i = paint;
                            paint.setShader(t0Var6.h);
                            TLRPC.Document document = t0Var6.b;
                            if (document != null) {
                                t0Var6.j = org.telegram.ui.Components.g5.l(i12, i13, document);
                            } else {
                                t0Var6.j = org.telegram.ui.Components.g5.m(i12, t0Var6.c, null, i13);
                            }
                            org.telegram.ui.Components.u5 u5Var = new org.telegram.ui.Components.u5(this, 0L, 320L, (TimeInterpolator) null);
                            t0Var6.k = u5Var;
                            u5Var.e(true, 0.0f);
                            if (isAttachedToWindow()) {
                                t0Var6.j.a(this);
                            }
                        }
                        i7++;
                        i13 = 0;
                    }
                    arrayList = new ArrayList();
                    for (i10 = 0; i10 < this.K; i10 = com.google.android.gms.internal.vision.e2.f(i10, i10, 1, arrayList)) {
                    }
                    for (i11 = 0; i11 < arrayList2.size(); i11++) {
                        t0 t0Var7 = (t0) arrayList2.get(i11);
                        int i18 = 0;
                        while (true) {
                            if (i18 >= arrayList3.size()) {
                                t0Var = null;
                                break;
                            } else {
                                if (((t0) arrayList3.get(i18)).a == t0Var7.a) {
                                    t0Var = (t0) arrayList3.get(i18);
                                    break;
                                }
                                i18++;
                            }
                        }
                        if (t0Var == null) {
                            t0Var7.j.n(this);
                            t0Var7.j = null;
                            t0Var7.h = null;
                        } else {
                            arrayList.remove(Integer.valueOf(t0Var7.g));
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        com.google.android.gms.common.api.internal.p pVar = new com.google.android.gms.common.api.internal.p(arrayList);
                        for (int i19 = 0; i19 < arrayList3.size(); i19++) {
                            t0 t0Var8 = (t0) arrayList3.get(i19);
                            if (t0Var8.g == -1) {
                                t0Var8.g = ((Integer) pVar.c()).intValue();
                            }
                        }
                    }
                    if (z10) {
                        invalidate();
                        return;
                    }
                    return;
                }
                z10 = true;
                i7 = 0;
                while (i7 < arrayList3.size()) {
                }
                arrayList = new ArrayList();
                while (i10 < this.K) {
                }
                while (i11 < arrayList2.size()) {
                }
                if (!arrayList.isEmpty()) {
                }
                if (z10) {
                }
            }
            emojiStatus = null;
            if (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) {
            }
            int i132 = 0;
            G = v8.y(i12, false).G(j3, true);
            this.G = G;
            if (G != null) {
            }
            if (arrayList3.size() == arrayList2.size()) {
            }
            z10 = true;
            i7 = 0;
            while (i7 < arrayList3.size()) {
            }
            arrayList = new ArrayList();
            while (i10 < this.K) {
            }
            while (i11 < arrayList2.size()) {
            }
            if (!arrayList.isEmpty()) {
            }
            if (z10) {
            }
        } else {
            TLRPC.User a23 = np.s1(i12).a2(Long.valueOf(-j3));
            if (a23 != null) {
                emojiStatus = a23.emoji_status;
                if (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) {
                }
                int i1322 = 0;
                G = v8.y(i12, false).G(j3, true);
                this.G = G;
                if (G != null) {
                }
                if (arrayList3.size() == arrayList2.size()) {
                }
                z10 = true;
                i7 = 0;
                while (i7 < arrayList3.size()) {
                }
                arrayList = new ArrayList();
                while (i10 < this.K) {
                }
                while (i11 < arrayList2.size()) {
                }
                if (!arrayList.isEmpty()) {
                }
                if (z10) {
                }
            }
            emojiStatus = null;
            if (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) {
            }
            int i13222 = 0;
            G = v8.y(i12, false).G(j3, true);
            this.G = G;
            if (G != null) {
            }
            if (arrayList3.size() == arrayList2.size()) {
            }
            z10 = true;
            i7 = 0;
            while (i7 < arrayList3.size()) {
            }
            arrayList = new ArrayList();
            while (i10 < this.K) {
            }
            while (i11 < arrayList2.size()) {
            }
            if (!arrayList.isEmpty()) {
            }
            if (z10) {
            }
        }
    }

    @Override // org.telegram.messenger.is
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == ns.G3 && ((Long) objArr[0]).longValue() == this.b) {
            a();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0188  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        float L;
        int L2;
        float f11;
        float l10;
        float f12;
        ArrayList arrayList;
        float f13;
        t0 t0Var;
        boolean z10;
        u0 u0Var = this;
        ArrayList arrayList2 = u0Var.I;
        if (arrayList2.isEmpty()) {
            return;
        }
        float f14 = 1.0f;
        if (u0Var.e < 1.0f) {
            float f15 = 0.0f;
            if (u0Var.f <= 0.0f) {
                return;
            }
            View view = u0Var.c;
            float x10 = view.getX();
            float y10 = view.getY();
            float scaleX = view.getScaleX() * view.getWidth();
            float scaleY = view.getScaleY() * view.getHeight();
            float N = org.telegram.messenger.g0.N(96.0f);
            float f16 = 2.0f;
            float min = Math.min(x10, (u0Var.getWidth() - N) / 2.0f);
            float v = org.telegram.ui.Cells.y0.v(u0Var.y, N, 2.0f, y10);
            float max = Math.max(scaleX, N);
            float max2 = Math.max(scaleY, N);
            canvas.save();
            canvas.clipRect(0.0f, 0.0f, u0Var.getWidth(), u0Var.x);
            float f17 = (max / 2.0f) + min;
            float f18 = (max2 / 2.0f) + v;
            float f19 = (scaleX / 2.0f) + x10;
            float f20 = (scaleY / 2.0f) + y10;
            float f21 = u0Var.x;
            float f22 = f21 / u0Var.y;
            float l11 = Utilities.l((f21 - (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + org.telegram.messenger.g0.m)) / org.telegram.messenger.g0.L(50.0f));
            boolean z11 = false;
            int i7 = 0;
            while (i7 < arrayList2.size()) {
                t0 t0Var2 = (t0) arrayList2.get(i7);
                float f23 = f16;
                float e10 = t0Var2.k.e(z11, f14);
                float T1 = org.telegram.messenger.g0.T1(0.5f, f14, e10);
                float f24 = f15;
                int i10 = i7;
                float A = org.telegram.messenger.k5.A(f14, u0Var.n, (f14 - u0Var.e) * e10, l11);
                int i11 = t0Var2.g;
                float f25 = 1.6f;
                float f26 = f14;
                if (i11 != 0) {
                    if (i11 != 1) {
                        if (i11 == 2) {
                            f10 = l11;
                            L = ((f17 * f23) / 3.0f) - (org.telegram.messenger.g0.L(12.0f) * f22);
                            f11 = (v + max2) - org.telegram.messenger.g0.L(16.0f);
                        } else if (i11 == 3) {
                            f10 = l11;
                            L = (org.telegram.messenger.g0.L(20.0f) * f22) + (1.5f * f17);
                            L2 = org.telegram.messenger.g0.L(13.0f);
                        } else if (i11 != 4) {
                            L = (org.telegram.messenger.g0.L(12.0f) * f22) + ((4.0f * f17) / 3.0f);
                            f10 = l11;
                            f11 = (v + max2) - org.telegram.messenger.g0.L(16.0f);
                        } else {
                            f10 = l11;
                            L = (org.telegram.messenger.g0.L(12.0f) * f22) + ((f17 * 4.0f) / 3.0f);
                            f11 = v - org.telegram.messenger.g0.L(4.0f);
                        }
                        f25 = 0.9f;
                        float min2 = (!u0Var.h || e10 >= f26) ? u0Var.f : Math.min(e10, u0Var.f);
                        float f27 = f25 * 0.2f;
                        l10 = min2 >= f26 - f27 ? f26 : Utilities.l(((min2 - 0.32000002f) + f27) / 0.67999995f);
                        if (l10 < f26) {
                            L = org.telegram.messenger.g0.T1(f19, L, u0Var.L.getInterpolation(l10));
                            f11 = org.telegram.messenger.g0.T1(f20, f11, u0Var.M.getInterpolation(l10));
                            T1 = org.telegram.messenger.g0.T1(T1 / f23, T1, l10);
                        }
                        if (A <= f24) {
                            f12 = f20;
                            arrayList = arrayList2;
                            f13 = f24;
                            z10 = false;
                        } else {
                            float L3 = org.telegram.messenger.g0.L(45.0f);
                            float f28 = T1;
                            float f29 = L3 / f23;
                            f12 = f20;
                            arrayList = arrayList2;
                            t0Var2.l.set(L - f29, f11 - f29, L + f29, f11 + f29);
                            canvas.save();
                            canvas.translate(L, f11);
                            f13 = f24;
                            canvas.rotate(f13);
                            float a10 = t0Var2.m.a(0.1f) * f28;
                            canvas.scale(a10, a10);
                            t0Var2.f.d();
                            t0Var2.f.b(canvas, t0Var2.d, A);
                            Paint paint = t0Var2.i;
                            if (paint != null) {
                                paint.setAlpha((int) (A * 255.0f * f26));
                                float f30 = (-L3) / f23;
                                t0Var = t0Var2;
                                z10 = false;
                                canvas.drawRect(f30, f30, f29, f29, t0Var2.i);
                            } else {
                                t0Var = t0Var2;
                                z10 = false;
                            }
                            if (t0Var.j != null) {
                                int L4 = org.telegram.messenger.g0.L(24.0f);
                                int i12 = (-L4) / 2;
                                int i13 = L4 / 2;
                                t0Var.j.setBounds(i12, i12, i13, i13);
                                t0Var.j.setAlpha((int) (A * 255.0f));
                                t0Var.j.draw(canvas);
                            }
                            canvas.restore();
                        }
                        i7 = i10 + 1;
                        f15 = f13;
                        f16 = f23;
                        z11 = z10;
                        f20 = f12;
                        f14 = f26;
                        arrayList2 = arrayList;
                        l11 = f10;
                        u0Var = this;
                    } else {
                        f10 = l11;
                        L = ((f17 * f23) / 3.0f) - (org.telegram.messenger.g0.L(6.0f) * f22);
                        f11 = v - org.telegram.messenger.g0.L(4.0f);
                    }
                    f25 = f24;
                    if (u0Var.h) {
                    }
                    float f272 = f25 * 0.2f;
                    if (min2 >= f26 - f272) {
                    }
                    if (l10 < f26) {
                    }
                    if (A <= f24) {
                    }
                    i7 = i10 + 1;
                    f15 = f13;
                    f16 = f23;
                    z11 = z10;
                    f20 = f12;
                    f14 = f26;
                    arrayList2 = arrayList;
                    l11 = f10;
                    u0Var = this;
                } else {
                    f10 = l11;
                    L = (f17 / f23) - (org.telegram.messenger.g0.L(20.0f) * f22);
                    L2 = org.telegram.messenger.g0.L(13.0f);
                }
                f11 = f18 - L2;
                if (u0Var.h) {
                }
                float f2722 = f25 * 0.2f;
                if (min2 >= f26 - f2722) {
                }
                if (l10 < f26) {
                }
                if (A <= f24) {
                }
                i7 = i10 + 1;
                f15 = f13;
                f16 = f23;
                z11 = z10;
                f20 = f12;
                f14 = f26;
                arrayList2 = arrayList;
                l11 = f10;
                u0Var = this;
            }
            canvas.restore();
        }
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ns.f(this.a).c(this, ns.G3);
        ArrayList arrayList = this.I;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            ((t0) obj).j.a(this);
        }
        a();
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ns.f(this.a).n(this, ns.G3);
        ArrayList arrayList = this.I;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            ((t0) obj).j.n(this);
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        t0 t0Var;
        t0 t0Var2;
        if (!this.d) {
            return false;
        }
        float x10 = motionEvent.getX();
        float y10 = motionEvent.getY();
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.I;
            if (i7 >= arrayList.size()) {
                t0Var = null;
                break;
            }
            if (((t0) arrayList.get(i7)).l.contains(x10, y10)) {
                t0Var = (t0) arrayList.get(i7);
                break;
            }
            i7++;
        }
        if (motionEvent.getAction() == 0) {
            this.N = t0Var;
            if (t0Var != null) {
                t0Var.m.c(true);
            }
        } else if (motionEvent.getAction() == 2) {
            t0 t0Var3 = this.N;
            if (t0Var3 != t0Var && t0Var3 != null) {
                t0Var3.m.c(false);
                this.N = null;
            }
        } else if (motionEvent.getAction() == 1) {
            t0 t0Var4 = this.N;
            if (t0Var4 != null) {
                vf.c.t(getContext(), "https://t.me/nft/" + t0Var4.e);
                this.N.m.c(false);
                this.N = null;
            }
        } else if (motionEvent.getAction() == 3 && (t0Var2 = this.N) != null) {
            t0Var2.m.c(false);
            this.N = null;
        }
        return this.N != null;
    }

    public void setActionBarActionMode(float f10) {
        this.n = f10;
        invalidate();
    }

    public void setActive(boolean z10) {
        this.d = z10;
    }

    public void setExpandCoords(float f10) {
        this.x = f10;
        invalidate();
    }

    public void setExpandProgress(float f10) {
        if (this.e != f10) {
            this.e = f10;
            invalidate();
        }
    }

    public void setProgressToStoriesInsets(float f10) {
        if (this.F == f10) {
            return;
        }
        this.F = f10;
        invalidate();
    }
}
