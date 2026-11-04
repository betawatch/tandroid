package ci;

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
import org.telegram.messenger.cs;
import org.telegram.messenger.hp;
import org.telegram.messenger.hs;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.xq;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class z0 extends View implements cs {
    public final org.telegram.ui.Components.u5 E;
    public float F;
    public v8 G;
    public final ArrayList H;
    public final ArrayList I;
    public final HashSet J;
    public int K;
    public final DecelerateInterpolator L;
    public final LinearInterpolator M;
    public y0 N;
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

    public z0(Context context, int i3, long j10, org.telegram.ui.l0 l0Var) {
        super(context);
        this.d = true;
        this.E = new org.telegram.ui.Components.u5(this, 0L, 350L, xq.h);
        this.F = 1.0f;
        this.H = new ArrayList();
        this.I = new ArrayList();
        this.J = new HashSet();
        this.L = new DecelerateInterpolator();
        this.M = new LinearInterpolator();
        this.a = i3;
        this.b = j10;
        this.c = l0Var;
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
        v8 G;
        boolean z10;
        int i3;
        ArrayList arrayList;
        int i10;
        int i11;
        y0 y0Var;
        y0 y0Var2;
        int i12 = this.a;
        if (!hp.s1(i12).y7) {
            return;
        }
        this.K = hp.s1(i12).K6;
        ArrayList arrayList2 = this.H;
        arrayList2.clear();
        ArrayList arrayList3 = this.I;
        arrayList2.addAll(arrayList3);
        arrayList3.clear();
        HashSet hashSet = this.J;
        hashSet.clear();
        long j10 = this.b;
        if (j10 >= 0) {
            TLRPC.User a22 = hp.s1(i12).a2(Long.valueOf(j10));
            if (a22 != null) {
                emojiStatus = a22.emoji_status;
                if (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) {
                    hashSet.add(Long.valueOf(((TLRPC.TL_emojiStatusCollectible) emojiStatus).collectible_id));
                }
                int i13 = 0;
                G = e9.y(i12, false).G(j10, true);
                this.G = G;
                if (G != null) {
                    for (int i14 = 0; i14 < this.G.l.size(); i14++) {
                        TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) this.G.l.get(i14);
                        if (!savedStarGift.unsaved && savedStarGift.pinned_to_top) {
                            TL_stars.StarGift starGift = savedStarGift.gift;
                            if (starGift instanceof TL_stars.TL_starGiftUnique) {
                                y0 y0Var3 = new y0(this, (TL_stars.TL_starGiftUnique) starGift);
                                long j11 = y0Var3.a;
                                if (!hashSet.contains(Long.valueOf(j11))) {
                                    arrayList3.add(y0Var3);
                                    hashSet.add(Long.valueOf(j11));
                                }
                            }
                        }
                    }
                }
                if (arrayList3.size() == arrayList2.size()) {
                    for (int i15 = 0; i15 < arrayList3.size(); i15++) {
                        y0 y0Var4 = (y0) arrayList3.get(i15);
                        y0 y0Var5 = (y0) arrayList2.get(i15);
                        y0Var4.getClass();
                        if (y0Var5 != null && y0Var5.a == y0Var4.a) {
                        }
                    }
                    z10 = false;
                    i3 = 0;
                    while (i3 < arrayList3.size()) {
                        y0 y0Var6 = (y0) arrayList3.get(i3);
                        int i16 = i13;
                        while (true) {
                            if (i16 >= arrayList2.size()) {
                                y0Var2 = null;
                                break;
                            } else {
                                if (((y0) arrayList2.get(i16)).a == y0Var6.a) {
                                    y0Var2 = (y0) arrayList2.get(i16);
                                    break;
                                }
                                i16++;
                            }
                        }
                        if (y0Var2 != null) {
                            y0Var6.getClass();
                            y0Var6.h = y0Var2.h;
                            y0Var6.j = y0Var2.j;
                            y0Var6.i = y0Var2.i;
                            y0Var6.k = y0Var2.k;
                            y0Var6.f = y0Var2.f;
                            y0Var6.g = y0Var2.g;
                        } else {
                            float L = org.telegram.messenger.g0.L(22.5f);
                            int i17 = y0Var6.d;
                            y0Var6.h = new RadialGradient(0.0f, 0.0f, L, new int[]{i17, org.telegram.ui.ActionBar.k6.r1(0.0f, i17)}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                            Paint paint = new Paint(1);
                            y0Var6.i = paint;
                            paint.setShader(y0Var6.h);
                            TLRPC.Document document = y0Var6.b;
                            if (document != null) {
                                y0Var6.j = org.telegram.ui.Components.g5.l(i12, i13, document);
                            } else {
                                y0Var6.j = org.telegram.ui.Components.g5.m(i12, y0Var6.c, null, i13);
                            }
                            org.telegram.ui.Components.u5 u5Var = new org.telegram.ui.Components.u5(this, 0L, 320L, (TimeInterpolator) null);
                            y0Var6.k = u5Var;
                            u5Var.e(true, 0.0f);
                            if (isAttachedToWindow()) {
                                y0Var6.j.a(this);
                            }
                        }
                        i3++;
                        i13 = 0;
                    }
                    arrayList = new ArrayList();
                    for (i10 = 0; i10 < this.K; i10 = com.google.android.recaptcha.internal.a.f(i10, i10, 1, arrayList)) {
                    }
                    for (i11 = 0; i11 < arrayList2.size(); i11++) {
                        y0 y0Var7 = (y0) arrayList2.get(i11);
                        int i18 = 0;
                        while (true) {
                            if (i18 >= arrayList3.size()) {
                                y0Var = null;
                                break;
                            } else {
                                if (((y0) arrayList3.get(i18)).a == y0Var7.a) {
                                    y0Var = (y0) arrayList3.get(i18);
                                    break;
                                }
                                i18++;
                            }
                        }
                        if (y0Var == null) {
                            y0Var7.j.n(this);
                            y0Var7.j = null;
                            y0Var7.h = null;
                        } else {
                            arrayList.remove(Integer.valueOf(y0Var7.g));
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        a aVar = new a(arrayList);
                        for (int i19 = 0; i19 < arrayList3.size(); i19++) {
                            y0 y0Var8 = (y0) arrayList3.get(i19);
                            if (y0Var8.g == -1) {
                                y0Var8.g = ((Integer) aVar.c()).intValue();
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
                i3 = 0;
                while (i3 < arrayList3.size()) {
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
            G = e9.y(i12, false).G(j10, true);
            this.G = G;
            if (G != null) {
            }
            if (arrayList3.size() == arrayList2.size()) {
            }
            z10 = true;
            i3 = 0;
            while (i3 < arrayList3.size()) {
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
            TLRPC.User a23 = hp.s1(i12).a2(Long.valueOf(-j10));
            if (a23 != null) {
                emojiStatus = a23.emoji_status;
                if (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) {
                }
                int i1322 = 0;
                G = e9.y(i12, false).G(j10, true);
                this.G = G;
                if (G != null) {
                }
                if (arrayList3.size() == arrayList2.size()) {
                }
                z10 = true;
                i3 = 0;
                while (i3 < arrayList3.size()) {
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
            G = e9.y(i12, false).G(j10, true);
            this.G = G;
            if (G != null) {
            }
            if (arrayList3.size() == arrayList2.size()) {
            }
            z10 = true;
            i3 = 0;
            while (i3 < arrayList3.size()) {
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

    @Override // org.telegram.messenger.cs
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        if (i3 == hs.G3 && ((Long) objArr[0]).longValue() == this.b) {
            a();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x018a  */
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
        y0 y0Var;
        boolean z10;
        z0 z0Var = this;
        ArrayList arrayList2 = z0Var.I;
        if (arrayList2.isEmpty()) {
            return;
        }
        float f14 = 1.0f;
        if (z0Var.e < 1.0f) {
            float f15 = 0.0f;
            if (z0Var.f <= 0.0f) {
                return;
            }
            View view = z0Var.c;
            float x10 = view.getX();
            float y9 = view.getY();
            float scaleX = view.getScaleX() * view.getWidth();
            float scaleY = view.getScaleY() * view.getHeight();
            float N = org.telegram.messenger.g0.N(96.0f);
            float f16 = 2.0f;
            float min = Math.min(x10, (z0Var.getWidth() - N) / 2.0f);
            float max = Math.max(y9, (z0Var.y - N) / 2.0f);
            float max2 = Math.max(scaleX, N);
            float max3 = Math.max(scaleY, N);
            canvas.save();
            canvas.clipRect(0.0f, 0.0f, z0Var.getWidth(), z0Var.x);
            float f17 = (max2 / 2.0f) + min;
            float f18 = (max3 / 2.0f) + max;
            float f19 = (scaleX / 2.0f) + x10;
            float f20 = (scaleY / 2.0f) + y9;
            float f21 = z0Var.x;
            float f22 = f21 / z0Var.y;
            float l11 = Utilities.l((f21 - (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + org.telegram.messenger.g0.m)) / org.telegram.messenger.g0.L(50.0f));
            boolean z11 = false;
            int i3 = 0;
            while (i3 < arrayList2.size()) {
                y0 y0Var2 = (y0) arrayList2.get(i3);
                float f23 = f16;
                float e10 = y0Var2.k.e(z11, f14);
                float T1 = org.telegram.messenger.g0.T1(0.5f, f14, e10);
                float f24 = f15;
                int i10 = i3;
                float A = org.telegram.messenger.k5.A(f14, z0Var.n, (f14 - z0Var.e) * e10, l11);
                int i11 = y0Var2.g;
                float f25 = 1.6f;
                float f26 = f14;
                if (i11 != 0) {
                    if (i11 != 1) {
                        if (i11 == 2) {
                            f10 = l11;
                            L = ((f17 * f23) / 3.0f) - (org.telegram.messenger.g0.L(12.0f) * f22);
                            f11 = (max + max3) - org.telegram.messenger.g0.L(16.0f);
                        } else if (i11 == 3) {
                            f10 = l11;
                            L = (org.telegram.messenger.g0.L(20.0f) * f22) + (1.5f * f17);
                            L2 = org.telegram.messenger.g0.L(13.0f);
                        } else if (i11 != 4) {
                            L = (org.telegram.messenger.g0.L(12.0f) * f22) + ((4.0f * f17) / 3.0f);
                            f10 = l11;
                            f11 = (max + max3) - org.telegram.messenger.g0.L(16.0f);
                        } else {
                            f10 = l11;
                            L = (org.telegram.messenger.g0.L(12.0f) * f22) + ((f17 * 4.0f) / 3.0f);
                            f11 = max - org.telegram.messenger.g0.L(4.0f);
                        }
                        f25 = 0.9f;
                        float min2 = (!z0Var.h || e10 >= f26) ? z0Var.f : Math.min(e10, z0Var.f);
                        float f27 = f25 * 0.2f;
                        l10 = min2 >= f26 - f27 ? f26 : Utilities.l(((min2 - 0.32000002f) + f27) / 0.67999995f);
                        if (l10 < f26) {
                            L = org.telegram.messenger.g0.T1(f19, L, z0Var.L.getInterpolation(l10));
                            f11 = org.telegram.messenger.g0.T1(f20, f11, z0Var.M.getInterpolation(l10));
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
                            y0Var2.l.set(L - f29, f11 - f29, L + f29, f11 + f29);
                            canvas.save();
                            canvas.translate(L, f11);
                            f13 = f24;
                            canvas.rotate(f13);
                            float a10 = y0Var2.m.a(0.1f) * f28;
                            canvas.scale(a10, a10);
                            y0Var2.f.d();
                            y0Var2.f.b(canvas, y0Var2.d, A);
                            Paint paint = y0Var2.i;
                            if (paint != null) {
                                paint.setAlpha((int) (A * 255.0f * f26));
                                float f30 = (-L3) / f23;
                                y0Var = y0Var2;
                                z10 = false;
                                canvas.drawRect(f30, f30, f29, f29, y0Var2.i);
                            } else {
                                y0Var = y0Var2;
                                z10 = false;
                            }
                            if (y0Var.j != null) {
                                int L4 = org.telegram.messenger.g0.L(24.0f);
                                int i12 = (-L4) / 2;
                                int i13 = L4 / 2;
                                y0Var.j.setBounds(i12, i12, i13, i13);
                                y0Var.j.setAlpha((int) (A * 255.0f));
                                y0Var.j.draw(canvas);
                            }
                            canvas.restore();
                        }
                        i3 = i10 + 1;
                        f15 = f13;
                        f16 = f23;
                        z11 = z10;
                        f20 = f12;
                        f14 = f26;
                        arrayList2 = arrayList;
                        l11 = f10;
                        z0Var = this;
                    } else {
                        f10 = l11;
                        L = ((f17 * f23) / 3.0f) - (org.telegram.messenger.g0.L(6.0f) * f22);
                        f11 = max - org.telegram.messenger.g0.L(4.0f);
                    }
                    f25 = f24;
                    if (z0Var.h) {
                    }
                    float f272 = f25 * 0.2f;
                    if (min2 >= f26 - f272) {
                    }
                    if (l10 < f26) {
                    }
                    if (A <= f24) {
                    }
                    i3 = i10 + 1;
                    f15 = f13;
                    f16 = f23;
                    z11 = z10;
                    f20 = f12;
                    f14 = f26;
                    arrayList2 = arrayList;
                    l11 = f10;
                    z0Var = this;
                } else {
                    f10 = l11;
                    L = (f17 / f23) - (org.telegram.messenger.g0.L(20.0f) * f22);
                    L2 = org.telegram.messenger.g0.L(13.0f);
                }
                f11 = f18 - L2;
                if (z0Var.h) {
                }
                float f2722 = f25 * 0.2f;
                if (min2 >= f26 - f2722) {
                }
                if (l10 < f26) {
                }
                if (A <= f24) {
                }
                i3 = i10 + 1;
                f15 = f13;
                f16 = f23;
                z11 = z10;
                f20 = f12;
                f14 = f26;
                arrayList2 = arrayList;
                l11 = f10;
                z0Var = this;
            }
            canvas.restore();
        }
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        hs.f(this.a).c(this, hs.G3);
        ArrayList arrayList = this.I;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            ((y0) obj).j.a(this);
        }
        a();
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        hs.f(this.a).n(this, hs.G3);
        ArrayList arrayList = this.I;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            ((y0) obj).j.n(this);
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        y0 y0Var;
        y0 y0Var2;
        if (!this.d) {
            return false;
        }
        float x10 = motionEvent.getX();
        float y9 = motionEvent.getY();
        int i3 = 0;
        while (true) {
            ArrayList arrayList = this.I;
            if (i3 >= arrayList.size()) {
                y0Var = null;
                break;
            }
            if (((y0) arrayList.get(i3)).l.contains(x10, y9)) {
                y0Var = (y0) arrayList.get(i3);
                break;
            }
            i3++;
        }
        if (motionEvent.getAction() == 0) {
            this.N = y0Var;
            if (y0Var != null) {
                y0Var.m.c(true);
            }
        } else if (motionEvent.getAction() == 2) {
            y0 y0Var3 = this.N;
            if (y0Var3 != y0Var && y0Var3 != null) {
                y0Var3.m.c(false);
                this.N = null;
            }
        } else if (motionEvent.getAction() == 1) {
            y0 y0Var4 = this.N;
            if (y0Var4 != null) {
                sf.c.t(getContext(), "https://t.me/nft/" + y0Var4.e);
                this.N.m.c(false);
                this.N = null;
            }
        } else if (motionEvent.getAction() == 3 && (y0Var2 = this.N) != null) {
            y0Var2.m.c(false);
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
