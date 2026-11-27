// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.a;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class gu8 extends View implements fn7 {
    public final mm E;
    public float F;
    public axa G;
    public final ArrayList H;
    public final ArrayList I;
    public final HashSet J;
    public int K;
    public final DecelerateInterpolator L;
    public final LinearInterpolator M;
    public fu8 N;
    public final int a;
    public final long b;
    public final d26 c;
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

    public gu8(Context context, int i, long j, d26 d26Var) {
        super(context);
        this.d = true;
        this.E = new mm(this, 0L, 350L, k43.h);
        this.F = 1.0f;
        this.H = new ArrayList();
        this.I = new ArrayList();
        this.J = new HashSet();
        this.L = new DecelerateInterpolator();
        this.M = new LinearInterpolator();
        this.a = i;
        this.b = j;
        this.c = d26Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:115:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01d4 A[LOOP:4: B:75:0x01d0->B:77:0x01d4, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01e2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a() {
        TLRPC.EmojiStatus emojiStatus;
        boolean z;
        int i;
        gu8 gu8Var;
        ArrayList arrayList;
        int i2;
        int i3;
        fu8 fu8Var;
        fu8 fu8Var2;
        gu8 gu8Var2;
        if (!uc7.s1(this.a).k4.T1.f) {
            return;
        }
        this.K = uc7.s1(this.a).k4.R1.f();
        this.H.clear();
        this.H.addAll(this.I);
        this.I.clear();
        this.J.clear();
        long j = this.b;
        int i4 = this.a;
        if (j >= 0) {
            TLRPC.User X1 = uc7.s1(i4).X1(Long.valueOf(this.b));
            if (X1 != null) {
                emojiStatus = X1.emoji_status;
            }
            emojiStatus = null;
        } else {
            TLRPC.User X12 = uc7.s1(i4).X1(Long.valueOf(-this.b));
            if (X12 != null) {
                emojiStatus = X12.emoji_status;
            }
            emojiStatus = null;
        }
        if (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) {
            this.J.add(Long.valueOf(((TLRPC.TL_emojiStatusCollectible) emojiStatus).collectible_id));
        }
        axa D = jxa.v(this.a, false).D(this.b, true);
        this.G = D;
        if (D != null) {
            for (int i5 = 0; i5 < this.G.l.size(); i5++) {
                TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) this.G.l.get(i5);
                if (!savedStarGift.unsaved && savedStarGift.pinned_to_top) {
                    TL_stars.StarGift starGift = savedStarGift.gift;
                    if (starGift instanceof TL_stars.TL_starGiftUnique) {
                        fu8 fu8Var3 = new fu8(this, (TL_stars.TL_starGiftUnique) starGift);
                        if (!this.J.contains(Long.valueOf(fu8Var3.a))) {
                            this.I.add(fu8Var3);
                            this.J.add(Long.valueOf(fu8Var3.a));
                        }
                    }
                }
            }
        }
        if (this.I.size() == this.H.size()) {
            for (int i6 = 0; i6 < this.I.size(); i6++) {
                fu8 fu8Var4 = (fu8) this.I.get(i6);
                fu8 fu8Var5 = (fu8) this.H.get(i6);
                if (fu8Var5 == null) {
                    fu8Var4.getClass();
                } else if (fu8Var5.a == fu8Var4.a) {
                }
            }
            z = false;
            i = 0;
            while (i < this.I.size()) {
                fu8 fu8Var6 = (fu8) this.I.get(i);
                int i7 = 0;
                while (true) {
                    if (i7 >= this.H.size()) {
                        fu8Var2 = null;
                        break;
                    } else {
                        if (((fu8) this.H.get(i7)).a == fu8Var6.a) {
                            fu8Var2 = (fu8) this.H.get(i7);
                            break;
                        }
                        i7++;
                    }
                }
                if (fu8Var2 != null) {
                    fu8Var6.getClass();
                    fu8Var6.h = fu8Var2.h;
                    fu8Var6.j = fu8Var2.j;
                    fu8Var6.i = fu8Var2.i;
                    fu8Var6.k = fu8Var2.k;
                    fu8Var6.f = fu8Var2.f;
                    fu8Var6.g = fu8Var2.g;
                    gu8Var2 = this;
                } else {
                    float L = hl.L(22.5f);
                    int i8 = fu8Var6.d;
                    fu8Var6.h = new RadialGradient(0.0f, 0.0f, L, new int[]{i8, aob.p1(0.0f, i8)}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                    Paint paint = new Paint(1);
                    fu8Var6.i = paint;
                    paint.setShader(fu8Var6.h);
                    TLRPC.Document document = fu8Var6.b;
                    int i9 = this.a;
                    if (document != null) {
                        fu8Var6.j = wl.l(i9, 0, document);
                    } else {
                        fu8Var6.j = wl.m(i9, fu8Var6.c, null, 0);
                    }
                    gu8Var2 = this;
                    mm mmVar = new mm(gu8Var2, 0L, 320L, (Interpolator) null);
                    fu8Var6.k = mmVar;
                    mmVar.e(true, 0.0f);
                    if (gu8Var2.isAttachedToWindow()) {
                        fu8Var6.j.b(gu8Var2);
                    }
                }
                i++;
                this = gu8Var2;
            }
            gu8Var = this;
            arrayList = new ArrayList();
            for (i2 = 0; i2 < gu8Var.K; i2 = qd4.g(i2, i2, 1, arrayList)) {
            }
            for (i3 = 0; i3 < gu8Var.H.size(); i3++) {
                fu8 fu8Var7 = (fu8) gu8Var.H.get(i3);
                int i10 = 0;
                while (true) {
                    if (i10 >= gu8Var.I.size()) {
                        fu8Var = null;
                        break;
                    } else {
                        if (((fu8) gu8Var.I.get(i10)).a == fu8Var7.a) {
                            fu8Var = (fu8) gu8Var.I.get(i10);
                            break;
                        }
                        i10++;
                    }
                }
                if (fu8Var == null) {
                    fu8Var7.j.o(gu8Var);
                    fu8Var7.j = null;
                    fu8Var7.h = null;
                } else {
                    arrayList.remove(Integer.valueOf(fu8Var7.g));
                }
            }
            if (!arrayList.isEmpty()) {
                ge0 ge0Var = new ge0(arrayList);
                for (int i11 = 0; i11 < gu8Var.I.size(); i11++) {
                    fu8 fu8Var8 = (fu8) gu8Var.I.get(i11);
                    if (fu8Var8.g == -1) {
                        fu8Var8.g = ((Integer) ge0Var.b()).intValue();
                    }
                }
            }
            if (z) {
                return;
            }
            gu8Var.invalidate();
            return;
        }
        z = true;
        i = 0;
        while (i < this.I.size()) {
        }
        gu8Var = this;
        arrayList = new ArrayList();
        while (i2 < gu8Var.K) {
        }
        while (i3 < gu8Var.H.size()) {
        }
        if (!arrayList.isEmpty()) {
        }
        if (z) {
        }
    }

    @Override // fn7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == jn7.I3 && ((Long) objArr[0]).longValue() == this.b) {
            a();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0185  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        float f;
        float L;
        int L2;
        float f2;
        float l;
        float f3;
        ArrayList arrayList;
        float f4;
        fu8 fu8Var;
        boolean z;
        gu8 gu8Var = this;
        ArrayList arrayList2 = gu8Var.I;
        if (arrayList2.isEmpty()) {
            return;
        }
        float f5 = 1.0f;
        if (gu8Var.e < 1.0f) {
            float f6 = 0.0f;
            if (gu8Var.f > 0.0f) {
                d26 d26Var = gu8Var.c;
                float x = d26Var.getX();
                float y = d26Var.getY();
                float scaleX = d26Var.getScaleX() * d26Var.getWidth();
                float scaleY = d26Var.getScaleY() * d26Var.getHeight();
                float N = hl.N(96.0f);
                float f7 = 2.0f;
                float min = Math.min(x, (gu8Var.getWidth() - N) / 2.0f);
                float f8 = bp1.f(gu8Var.y, N, 2.0f, y);
                float max = Math.max(scaleX, N);
                float max2 = Math.max(scaleY, N);
                canvas.save();
                canvas.clipRect(0.0f, 0.0f, gu8Var.getWidth(), gu8Var.x);
                float f9 = (max / 2.0f) + min;
                float f10 = (max2 / 2.0f) + f8;
                float f11 = (scaleX / 2.0f) + x;
                float f12 = (scaleY / 2.0f) + y;
                float f13 = gu8Var.x;
                float f14 = f13 / gu8Var.y;
                float l2 = Utilities.l((f13 - (a.getCurrentActionBarHeight() + hl.m)) / hl.L(50.0f));
                boolean z2 = false;
                int i = 0;
                while (i < arrayList2.size()) {
                    fu8 fu8Var2 = (fu8) arrayList2.get(i);
                    float f15 = f7;
                    float e = fu8Var2.k.e(z2, f5);
                    float R1 = hl.R1(0.5f, f5, e);
                    float f16 = f6;
                    int i2 = i;
                    float z3 = qd4.z(f5, gu8Var.n, (f5 - gu8Var.e) * e, l2);
                    int i3 = fu8Var2.g;
                    float f17 = 1.6f;
                    float f18 = f5;
                    if (i3 != 0) {
                        if (i3 != 1) {
                            if (i3 == 2) {
                                f = l2;
                                L = ((f9 * f15) / 3.0f) - (hl.L(12.0f) * f14);
                                f2 = (f8 + max2) - hl.L(16.0f);
                            } else if (i3 == 3) {
                                f = l2;
                                L = (hl.L(20.0f) * f14) + (1.5f * f9);
                                L2 = hl.L(13.0f);
                            } else if (i3 != 4) {
                                L = (hl.L(12.0f) * f14) + ((4.0f * f9) / 3.0f);
                                f = l2;
                                f2 = (f8 + max2) - hl.L(16.0f);
                            } else {
                                f = l2;
                                L = (hl.L(12.0f) * f14) + ((f9 * 4.0f) / 3.0f);
                                f2 = f8 - hl.L(4.0f);
                            }
                            f17 = 0.9f;
                            float min2 = (!gu8Var.h || e >= f18) ? gu8Var.f : Math.min(e, gu8Var.f);
                            float f19 = f17 * 0.2f;
                            l = min2 >= f18 - f19 ? f18 : Utilities.l(((min2 - 0.32000002f) + f19) / 0.67999995f);
                            if (l < f18) {
                                L = hl.R1(f11, L, gu8Var.L.getInterpolation(l));
                                f2 = hl.R1(f12, f2, gu8Var.M.getInterpolation(l));
                                R1 = hl.R1(R1 / f15, R1, l);
                            }
                            if (z3 <= f16) {
                                f3 = f12;
                                arrayList = arrayList2;
                                f4 = f16;
                                z = false;
                            } else {
                                float L3 = hl.L(45.0f);
                                float f20 = R1;
                                float f21 = L3 / f15;
                                f3 = f12;
                                arrayList = arrayList2;
                                fu8Var2.l.set(L - f21, f2 - f21, L + f21, f2 + f21);
                                canvas.save();
                                canvas.translate(L, f2);
                                f4 = f16;
                                canvas.rotate(f4);
                                float a = fu8Var2.m.a(0.1f) * f20;
                                canvas.scale(a, a);
                                fu8Var2.f.d();
                                fu8Var2.f.b(canvas, fu8Var2.d, z3);
                                Paint paint = fu8Var2.i;
                                if (paint != null) {
                                    paint.setAlpha((int) (z3 * 255.0f * f18));
                                    float f22 = (-L3) / f15;
                                    fu8Var = fu8Var2;
                                    z = false;
                                    canvas.drawRect(f22, f22, f21, f21, fu8Var2.i);
                                } else {
                                    fu8Var = fu8Var2;
                                    z = false;
                                }
                                if (fu8Var.j != null) {
                                    int L4 = hl.L(24.0f);
                                    int i4 = (-L4) / 2;
                                    int i5 = L4 / 2;
                                    fu8Var.j.setBounds(i4, i4, i5, i5);
                                    fu8Var.j.setAlpha((int) (z3 * 255.0f));
                                    fu8Var.j.draw(canvas);
                                }
                                canvas.restore();
                            }
                            i = i2 + 1;
                            f6 = f4;
                            f7 = f15;
                            z2 = z;
                            f12 = f3;
                            f5 = f18;
                            arrayList2 = arrayList;
                            l2 = f;
                            gu8Var = this;
                        } else {
                            f = l2;
                            L = ((f9 * f15) / 3.0f) - (hl.L(6.0f) * f14);
                            f2 = f8 - hl.L(4.0f);
                        }
                        f17 = f16;
                        if (gu8Var.h) {
                        }
                        float f192 = f17 * 0.2f;
                        if (min2 >= f18 - f192) {
                        }
                        if (l < f18) {
                        }
                        if (z3 <= f16) {
                        }
                        i = i2 + 1;
                        f6 = f4;
                        f7 = f15;
                        z2 = z;
                        f12 = f3;
                        f5 = f18;
                        arrayList2 = arrayList;
                        l2 = f;
                        gu8Var = this;
                    } else {
                        f = l2;
                        L = (f9 / f15) - (hl.L(20.0f) * f14);
                        L2 = hl.L(13.0f);
                    }
                    f2 = f10 - L2;
                    if (gu8Var.h) {
                    }
                    float f1922 = f17 * 0.2f;
                    if (min2 >= f18 - f1922) {
                    }
                    if (l < f18) {
                    }
                    if (z3 <= f16) {
                    }
                    i = i2 + 1;
                    f6 = f4;
                    f7 = f15;
                    z2 = z;
                    f12 = f3;
                    f5 = f18;
                    arrayList2 = arrayList;
                    l2 = f;
                    gu8Var = this;
                }
                canvas.restore();
            }
        }
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        jn7.f(this.a).b(this, jn7.I3);
        ArrayList arrayList = this.I;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((fu8) obj).j.b(this);
        }
        a();
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        jn7.f(this.a).n(this, jn7.I3);
        ArrayList arrayList = this.I;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((fu8) obj).j.o(this);
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        fu8 fu8Var;
        fu8 fu8Var2;
        if (this.d) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            int i = 0;
            while (true) {
                ArrayList arrayList = this.I;
                if (i >= arrayList.size()) {
                    fu8Var = null;
                    break;
                }
                if (((fu8) arrayList.get(i)).l.contains(x, y)) {
                    fu8Var = (fu8) arrayList.get(i);
                    break;
                }
                i++;
            }
            if (motionEvent.getAction() == 0) {
                this.N = fu8Var;
                if (fu8Var != null) {
                    fu8Var.m.c(true);
                }
            } else if (motionEvent.getAction() == 2) {
                fu8 fu8Var3 = this.N;
                if (fu8Var3 != fu8Var && fu8Var3 != null) {
                    fu8Var3.m.c(false);
                    this.N = null;
                }
            } else if (motionEvent.getAction() == 1) {
                fu8 fu8Var4 = this.N;
                if (fu8Var4 != null) {
                    m01.u(getContext(), "https://t.me/nft/" + fu8Var4.e);
                    this.N.m.c(false);
                    this.N = null;
                }
            } else if (motionEvent.getAction() == 3 && (fu8Var2 = this.N) != null) {
                fu8Var2.m.c(false);
                this.N = null;
            }
            if (this.N != null) {
                return true;
            }
        }
        return false;
    }

    public void setActionBarActionMode(float f) {
        this.n = f;
        invalidate();
    }

    public void setActive(boolean z) {
        this.d = z;
    }

    public void setExpandCoords(float f) {
        this.x = f;
        invalidate();
    }

    public void setExpandProgress(float f) {
        if (this.e != f) {
            this.e = f;
            invalidate();
        }
    }

    public void setProgressToStoriesInsets(float f) {
        if (this.F == f) {
            return;
        }
        this.F = f;
        invalidate();
    }
}
