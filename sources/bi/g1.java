package bi;

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
import org.telegram.messenger.ls;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.xq;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class g1 extends View implements ls {
    public final org.telegram.ui.Components.w5 D;
    public float E;
    public v9 F;
    public final ArrayList G;
    public final ArrayList H;
    public final HashSet I;
    public int J;
    public final DecelerateInterpolator K;
    public final LinearInterpolator L;
    public f1 M;
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

    public g1(Context context, int i7, long j3, org.telegram.ui.k0 k0Var) {
        super(context);
        this.d = true;
        this.D = new org.telegram.ui.Components.w5(this, 0L, 350L, xq.h);
        this.E = 1.0f;
        this.G = new ArrayList();
        this.H = new ArrayList();
        this.I = new HashSet();
        this.K = new DecelerateInterpolator();
        this.L = new LinearInterpolator();
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
        v9 G;
        boolean z9;
        int i7;
        ArrayList arrayList;
        int i10;
        int i11;
        f1 f1Var;
        f1 f1Var2;
        int i12 = this.a;
        if (!qp.s1(i12).y7) {
            return;
        }
        this.J = qp.s1(i12).K6;
        ArrayList arrayList2 = this.G;
        arrayList2.clear();
        ArrayList arrayList3 = this.H;
        arrayList2.addAll(arrayList3);
        arrayList3.clear();
        HashSet hashSet = this.I;
        hashSet.clear();
        long j3 = this.b;
        if (j3 >= 0) {
            TLRPC.User a22 = qp.s1(i12).a2(Long.valueOf(j3));
            if (a22 != null) {
                emojiStatus = a22.emoji_status;
                if (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) {
                    hashSet.add(Long.valueOf(((TLRPC.TL_emojiStatusCollectible) emojiStatus).collectible_id));
                }
                int i13 = 0;
                G = ea.y(i12, false).G(j3, true);
                this.F = G;
                if (G != null) {
                    for (int i14 = 0; i14 < this.F.l.size(); i14++) {
                        TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) this.F.l.get(i14);
                        if (!savedStarGift.unsaved && savedStarGift.pinned_to_top) {
                            TL_stars.StarGift starGift = savedStarGift.gift;
                            if (starGift instanceof TL_stars.TL_starGiftUnique) {
                                f1 f1Var3 = new f1(this, (TL_stars.TL_starGiftUnique) starGift);
                                long j10 = f1Var3.a;
                                if (!hashSet.contains(Long.valueOf(j10))) {
                                    arrayList3.add(f1Var3);
                                    hashSet.add(Long.valueOf(j10));
                                }
                            }
                        }
                    }
                }
                if (arrayList3.size() == arrayList2.size()) {
                    for (int i15 = 0; i15 < arrayList3.size(); i15++) {
                        f1 f1Var4 = (f1) arrayList3.get(i15);
                        f1 f1Var5 = (f1) arrayList2.get(i15);
                        f1Var4.getClass();
                        if (f1Var5 != null && f1Var5.a == f1Var4.a) {
                        }
                    }
                    z9 = false;
                    i7 = 0;
                    while (i7 < arrayList3.size()) {
                        f1 f1Var6 = (f1) arrayList3.get(i7);
                        int i16 = i13;
                        while (true) {
                            if (i16 >= arrayList2.size()) {
                                f1Var2 = null;
                                break;
                            } else {
                                if (((f1) arrayList2.get(i16)).a == f1Var6.a) {
                                    f1Var2 = (f1) arrayList2.get(i16);
                                    break;
                                }
                                i16++;
                            }
                        }
                        if (f1Var2 != null) {
                            f1Var6.getClass();
                            f1Var6.h = f1Var2.h;
                            f1Var6.j = f1Var2.j;
                            f1Var6.i = f1Var2.i;
                            f1Var6.k = f1Var2.k;
                            f1Var6.f = f1Var2.f;
                            f1Var6.g = f1Var2.g;
                        } else {
                            float L = org.telegram.messenger.g0.L(22.5f);
                            int i17 = f1Var6.d;
                            f1Var6.h = new RadialGradient(0.0f, 0.0f, L, new int[]{i17, org.telegram.ui.ActionBar.k6.r1(0.0f, i17)}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                            Paint paint = new Paint(1);
                            f1Var6.i = paint;
                            paint.setShader(f1Var6.h);
                            TLRPC.Document document = f1Var6.b;
                            if (document != null) {
                                f1Var6.j = org.telegram.ui.Components.i5.l(i12, i13, document);
                            } else {
                                f1Var6.j = org.telegram.ui.Components.i5.m(i12, f1Var6.c, null, i13);
                            }
                            org.telegram.ui.Components.w5 w5Var = new org.telegram.ui.Components.w5(this, 0L, 320L, (TimeInterpolator) null);
                            f1Var6.k = w5Var;
                            w5Var.e(true, 0.0f);
                            if (isAttachedToWindow()) {
                                f1Var6.j.a(this);
                            }
                        }
                        i7++;
                        i13 = 0;
                    }
                    arrayList = new ArrayList();
                    for (i10 = 0; i10 < this.J; i10 = com.google.android.recaptcha.internal.a.f(i10, i10, 1, arrayList)) {
                    }
                    for (i11 = 0; i11 < arrayList2.size(); i11++) {
                        f1 f1Var7 = (f1) arrayList2.get(i11);
                        int i18 = 0;
                        while (true) {
                            if (i18 >= arrayList3.size()) {
                                f1Var = null;
                                break;
                            } else {
                                if (((f1) arrayList3.get(i18)).a == f1Var7.a) {
                                    f1Var = (f1) arrayList3.get(i18);
                                    break;
                                }
                                i18++;
                            }
                        }
                        if (f1Var == null) {
                            f1Var7.j.n(this);
                            f1Var7.j = null;
                            f1Var7.h = null;
                        } else {
                            arrayList.remove(Integer.valueOf(f1Var7.g));
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        a aVar = new a(arrayList);
                        for (int i19 = 0; i19 < arrayList3.size(); i19++) {
                            f1 f1Var8 = (f1) arrayList3.get(i19);
                            if (f1Var8.g == -1) {
                                f1Var8.g = ((Integer) aVar.c()).intValue();
                            }
                        }
                    }
                    if (z9) {
                        invalidate();
                        return;
                    }
                    return;
                }
                z9 = true;
                i7 = 0;
                while (i7 < arrayList3.size()) {
                }
                arrayList = new ArrayList();
                while (i10 < this.J) {
                }
                while (i11 < arrayList2.size()) {
                }
                if (!arrayList.isEmpty()) {
                }
                if (z9) {
                }
            }
            emojiStatus = null;
            if (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) {
            }
            int i132 = 0;
            G = ea.y(i12, false).G(j3, true);
            this.F = G;
            if (G != null) {
            }
            if (arrayList3.size() == arrayList2.size()) {
            }
            z9 = true;
            i7 = 0;
            while (i7 < arrayList3.size()) {
            }
            arrayList = new ArrayList();
            while (i10 < this.J) {
            }
            while (i11 < arrayList2.size()) {
            }
            if (!arrayList.isEmpty()) {
            }
            if (z9) {
            }
        } else {
            TLRPC.User a23 = qp.s1(i12).a2(Long.valueOf(-j3));
            if (a23 != null) {
                emojiStatus = a23.emoji_status;
                if (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) {
                }
                int i1322 = 0;
                G = ea.y(i12, false).G(j3, true);
                this.F = G;
                if (G != null) {
                }
                if (arrayList3.size() == arrayList2.size()) {
                }
                z9 = true;
                i7 = 0;
                while (i7 < arrayList3.size()) {
                }
                arrayList = new ArrayList();
                while (i10 < this.J) {
                }
                while (i11 < arrayList2.size()) {
                }
                if (!arrayList.isEmpty()) {
                }
                if (z9) {
                }
            }
            emojiStatus = null;
            if (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) {
            }
            int i13222 = 0;
            G = ea.y(i12, false).G(j3, true);
            this.F = G;
            if (G != null) {
            }
            if (arrayList3.size() == arrayList2.size()) {
            }
            z9 = true;
            i7 = 0;
            while (i7 < arrayList3.size()) {
            }
            arrayList = new ArrayList();
            while (i10 < this.J) {
            }
            while (i11 < arrayList2.size()) {
            }
            if (!arrayList.isEmpty()) {
            }
            if (z9) {
            }
        }
    }

    @Override // org.telegram.messenger.ls
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == qs.G3 && ((Long) objArr[0]).longValue() == this.b) {
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
        f1 f1Var;
        boolean z9;
        g1 g1Var = this;
        ArrayList arrayList2 = g1Var.H;
        if (arrayList2.isEmpty()) {
            return;
        }
        float f14 = 1.0f;
        if (g1Var.e < 1.0f) {
            float f15 = 0.0f;
            if (g1Var.f <= 0.0f) {
                return;
            }
            View view = g1Var.c;
            float x10 = view.getX();
            float y10 = view.getY();
            float scaleX = view.getScaleX() * view.getWidth();
            float scaleY = view.getScaleY() * view.getHeight();
            float N = org.telegram.messenger.g0.N(96.0f);
            float f16 = 2.0f;
            float min = Math.min(x10, (g1Var.getWidth() - N) / 2.0f);
            float max = Math.max(y10, (g1Var.y - N) / 2.0f);
            float max2 = Math.max(scaleX, N);
            float max3 = Math.max(scaleY, N);
            canvas.save();
            canvas.clipRect(0.0f, 0.0f, g1Var.getWidth(), g1Var.x);
            float f17 = (max2 / 2.0f) + min;
            float f18 = (max3 / 2.0f) + max;
            float f19 = (scaleX / 2.0f) + x10;
            float f20 = (scaleY / 2.0f) + y10;
            float f21 = g1Var.x;
            float f22 = f21 / g1Var.y;
            float l11 = Utilities.l((f21 - (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + org.telegram.messenger.g0.m)) / org.telegram.messenger.g0.L(50.0f));
            boolean z10 = false;
            int i7 = 0;
            while (i7 < arrayList2.size()) {
                f1 f1Var2 = (f1) arrayList2.get(i7);
                float f23 = f16;
                float e10 = f1Var2.k.e(z10, f14);
                float T1 = org.telegram.messenger.g0.T1(0.5f, f14, e10);
                float f24 = f15;
                int i10 = i7;
                float A = org.telegram.messenger.k5.A(f14, g1Var.n, (f14 - g1Var.e) * e10, l11);
                int i11 = f1Var2.g;
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
                        float min2 = (!g1Var.h || e10 >= f26) ? g1Var.f : Math.min(e10, g1Var.f);
                        float f27 = f25 * 0.2f;
                        l10 = min2 >= f26 - f27 ? f26 : Utilities.l(((min2 - 0.32000002f) + f27) / 0.67999995f);
                        if (l10 < f26) {
                            L = org.telegram.messenger.g0.T1(f19, L, g1Var.K.getInterpolation(l10));
                            f11 = org.telegram.messenger.g0.T1(f20, f11, g1Var.L.getInterpolation(l10));
                            T1 = org.telegram.messenger.g0.T1(T1 / f23, T1, l10);
                        }
                        if (A <= f24) {
                            f12 = f20;
                            arrayList = arrayList2;
                            f13 = f24;
                            z9 = false;
                        } else {
                            float L3 = org.telegram.messenger.g0.L(45.0f);
                            float f28 = T1;
                            float f29 = L3 / f23;
                            f12 = f20;
                            arrayList = arrayList2;
                            f1Var2.l.set(L - f29, f11 - f29, L + f29, f11 + f29);
                            canvas.save();
                            canvas.translate(L, f11);
                            f13 = f24;
                            canvas.rotate(f13);
                            float a10 = f1Var2.m.a(0.1f) * f28;
                            canvas.scale(a10, a10);
                            f1Var2.f.d();
                            f1Var2.f.b(canvas, f1Var2.d, A);
                            Paint paint = f1Var2.i;
                            if (paint != null) {
                                paint.setAlpha((int) (A * 255.0f * f26));
                                float f30 = (-L3) / f23;
                                f1Var = f1Var2;
                                z9 = false;
                                canvas.drawRect(f30, f30, f29, f29, f1Var2.i);
                            } else {
                                f1Var = f1Var2;
                                z9 = false;
                            }
                            if (f1Var.j != null) {
                                int L4 = org.telegram.messenger.g0.L(24.0f);
                                int i12 = (-L4) / 2;
                                int i13 = L4 / 2;
                                f1Var.j.setBounds(i12, i12, i13, i13);
                                f1Var.j.setAlpha((int) (A * 255.0f));
                                f1Var.j.draw(canvas);
                            }
                            canvas.restore();
                        }
                        i7 = i10 + 1;
                        f15 = f13;
                        f16 = f23;
                        z10 = z9;
                        f20 = f12;
                        f14 = f26;
                        arrayList2 = arrayList;
                        l11 = f10;
                        g1Var = this;
                    } else {
                        f10 = l11;
                        L = ((f17 * f23) / 3.0f) - (org.telegram.messenger.g0.L(6.0f) * f22);
                        f11 = max - org.telegram.messenger.g0.L(4.0f);
                    }
                    f25 = f24;
                    if (g1Var.h) {
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
                    z10 = z9;
                    f20 = f12;
                    f14 = f26;
                    arrayList2 = arrayList;
                    l11 = f10;
                    g1Var = this;
                } else {
                    f10 = l11;
                    L = (f17 / f23) - (org.telegram.messenger.g0.L(20.0f) * f22);
                    L2 = org.telegram.messenger.g0.L(13.0f);
                }
                f11 = f18 - L2;
                if (g1Var.h) {
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
                z10 = z9;
                f20 = f12;
                f14 = f26;
                arrayList2 = arrayList;
                l11 = f10;
                g1Var = this;
            }
            canvas.restore();
        }
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        qs.f(this.a).c(this, qs.G3);
        ArrayList arrayList = this.H;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            ((f1) obj).j.a(this);
        }
        a();
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        qs.f(this.a).n(this, qs.G3);
        ArrayList arrayList = this.H;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            ((f1) obj).j.n(this);
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        f1 f1Var;
        f1 f1Var2;
        if (!this.d) {
            return false;
        }
        float x10 = motionEvent.getX();
        float y10 = motionEvent.getY();
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.H;
            if (i7 >= arrayList.size()) {
                f1Var = null;
                break;
            }
            if (((f1) arrayList.get(i7)).l.contains(x10, y10)) {
                f1Var = (f1) arrayList.get(i7);
                break;
            }
            i7++;
        }
        if (motionEvent.getAction() == 0) {
            this.M = f1Var;
            if (f1Var != null) {
                f1Var.m.c(true);
            }
        } else if (motionEvent.getAction() == 2) {
            f1 f1Var3 = this.M;
            if (f1Var3 != f1Var && f1Var3 != null) {
                f1Var3.m.c(false);
                this.M = null;
            }
        } else if (motionEvent.getAction() == 1) {
            f1 f1Var4 = this.M;
            if (f1Var4 != null) {
                vf.c.t(getContext(), "https://t.me/nft/" + f1Var4.e);
                this.M.m.c(false);
                this.M = null;
            }
        } else if (motionEvent.getAction() == 3 && (f1Var2 = this.M) != null) {
            f1Var2.m.c(false);
            this.M = null;
        }
        return this.M != null;
    }

    public void setActionBarActionMode(float f10) {
        this.n = f10;
        invalidate();
    }

    public void setActive(boolean z9) {
        this.d = z9;
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
        if (this.E == f10) {
            return;
        }
        this.E = f10;
        invalidate();
    }
}
