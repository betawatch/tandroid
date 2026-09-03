package lh;

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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.mr;
import org.telegram.ui.ai;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final class u0 extends View implements NotificationCenter.NotificationCenterDelegate {
    public float B;
    public l7 C;
    public final ArrayList D;
    public final ArrayList E;
    public final HashSet F;
    public int G;
    public final DecelerateInterpolator H;
    public final LinearInterpolator I;
    public t0 J;
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
    public float v;
    public float w;
    public float x;
    public final org.telegram.ui.Components.z5 y;

    public u0(Context context, int i10, long j10, org.telegram.ui.n0 n0Var) {
        super(context);
        this.d = true;
        this.y = new org.telegram.ui.Components.z5(this, 0L, 350L, mr.h);
        this.B = 1.0f;
        this.D = new ArrayList();
        this.E = new ArrayList();
        this.F = new HashSet();
        this.H = new DecelerateInterpolator();
        this.I = new LinearInterpolator();
        this.a = i10;
        this.b = j10;
        this.c = n0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:103:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:104:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01a8 A[LOOP:3: B:63:0x01a4->B:65:0x01a8, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01f8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a() {
        TLRPC.EmojiStatus emojiStatus;
        l7 G;
        boolean z4;
        int i10;
        ArrayList arrayList;
        int i11;
        int i12;
        t0 t0Var;
        t0 t0Var2;
        int i13 = this.a;
        if (!MessagesController.getInstance(i13).enableGiftsInProfile) {
            return;
        }
        this.G = MessagesController.getInstance(i13).stargiftsPinnedToTopLimit;
        ArrayList arrayList2 = this.D;
        arrayList2.clear();
        ArrayList arrayList3 = this.E;
        arrayList2.addAll(arrayList3);
        arrayList3.clear();
        HashSet hashSet = this.F;
        hashSet.clear();
        long j10 = this.b;
        if (j10 >= 0) {
            TLRPC.User user = MessagesController.getInstance(i13).getUser(Long.valueOf(j10));
            if (user != null) {
                emojiStatus = user.emoji_status;
                if (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) {
                    hashSet.add(Long.valueOf(((TLRPC.TL_emojiStatusCollectible) emojiStatus).collectible_id));
                }
                int i14 = 0;
                G = t7.y(i13, false).G(j10, true);
                this.C = G;
                if (G != null) {
                    for (int i15 = 0; i15 < this.C.l.size(); i15++) {
                        TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) this.C.l.get(i15);
                        if (!savedStarGift.unsaved && savedStarGift.pinned_to_top) {
                            TL_stars.StarGift starGift = savedStarGift.gift;
                            if (starGift instanceof TL_stars.TL_starGiftUnique) {
                                t0 t0Var3 = new t0(this, (TL_stars.TL_starGiftUnique) starGift);
                                long j11 = t0Var3.a;
                                if (!hashSet.contains(Long.valueOf(j11))) {
                                    arrayList3.add(t0Var3);
                                    hashSet.add(Long.valueOf(j11));
                                }
                            }
                        }
                    }
                }
                if (arrayList3.size() == arrayList2.size()) {
                    for (int i16 = 0; i16 < arrayList3.size(); i16++) {
                        t0 t0Var4 = (t0) arrayList3.get(i16);
                        t0 t0Var5 = (t0) arrayList2.get(i16);
                        t0Var4.getClass();
                        if (t0Var5 != null && t0Var5.a == t0Var4.a) {
                        }
                    }
                    z4 = false;
                    i10 = 0;
                    while (i10 < arrayList3.size()) {
                        t0 t0Var6 = (t0) arrayList3.get(i10);
                        int i17 = 0;
                        while (true) {
                            if (i17 >= arrayList2.size()) {
                                t0Var2 = null;
                                break;
                            } else {
                                if (((t0) arrayList2.get(i17)).a == t0Var6.a) {
                                    t0Var2 = (t0) arrayList2.get(i17);
                                    break;
                                }
                                i17++;
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
                            float dp = AndroidUtilities.dp(22.5f);
                            int i18 = t0Var6.d;
                            t0Var6.h = new RadialGradient(0.0f, 0.0f, dp, new int[]{i18, org.telegram.ui.ActionBar.j6.l1(0.0f, i18)}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                            Paint paint = new Paint(1);
                            t0Var6.i = paint;
                            paint.setShader(t0Var6.h);
                            TLRPC.Document document = t0Var6.b;
                            if (document != null) {
                                t0Var6.j = org.telegram.ui.Components.l5.m(i13, i14, document);
                            } else {
                                t0Var6.j = org.telegram.ui.Components.l5.n(i13, t0Var6.c, null, i14);
                            }
                            org.telegram.ui.Components.z5 z5Var = new org.telegram.ui.Components.z5(this, 0L, 320L, (TimeInterpolator) null);
                            t0Var6.k = z5Var;
                            z5Var.d(0.0f, true);
                            if (isAttachedToWindow()) {
                                t0Var6.j.a(this);
                            }
                        }
                        i10++;
                        i14 = 0;
                    }
                    arrayList = new ArrayList();
                    for (i11 = 0; i11 < this.G; i11 = ai.d(i11, i11, 1, arrayList)) {
                    }
                    for (i12 = 0; i12 < arrayList2.size(); i12++) {
                        t0 t0Var7 = (t0) arrayList2.get(i12);
                        int i19 = 0;
                        while (true) {
                            if (i19 >= arrayList3.size()) {
                                t0Var = null;
                                break;
                            } else {
                                if (((t0) arrayList3.get(i19)).a == t0Var7.a) {
                                    t0Var = (t0) arrayList3.get(i19);
                                    break;
                                }
                                i19++;
                            }
                        }
                        if (t0Var == null) {
                            t0Var7.j.o(this);
                            t0Var7.j = null;
                            t0Var7.h = null;
                        } else {
                            arrayList.remove(Integer.valueOf(t0Var7.g));
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        com.google.android.gms.common.api.internal.r rVar = new com.google.android.gms.common.api.internal.r(arrayList);
                        for (int i20 = 0; i20 < arrayList3.size(); i20++) {
                            t0 t0Var8 = (t0) arrayList3.get(i20);
                            if (t0Var8.g == -1) {
                                t0Var8.g = ((Integer) rVar.c()).intValue();
                            }
                        }
                    }
                    if (z4) {
                        invalidate();
                        return;
                    }
                    return;
                }
                z4 = true;
                i10 = 0;
                while (i10 < arrayList3.size()) {
                }
                arrayList = new ArrayList();
                while (i11 < this.G) {
                }
                while (i12 < arrayList2.size()) {
                }
                if (!arrayList.isEmpty()) {
                }
                if (z4) {
                }
            }
            emojiStatus = null;
            if (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) {
            }
            int i142 = 0;
            G = t7.y(i13, false).G(j10, true);
            this.C = G;
            if (G != null) {
            }
            if (arrayList3.size() == arrayList2.size()) {
            }
            z4 = true;
            i10 = 0;
            while (i10 < arrayList3.size()) {
            }
            arrayList = new ArrayList();
            while (i11 < this.G) {
            }
            while (i12 < arrayList2.size()) {
            }
            if (!arrayList.isEmpty()) {
            }
            if (z4) {
            }
        } else {
            TLRPC.User user2 = MessagesController.getInstance(i13).getUser(Long.valueOf(-j10));
            if (user2 != null) {
                emojiStatus = user2.emoji_status;
                if (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) {
                }
                int i1422 = 0;
                G = t7.y(i13, false).G(j10, true);
                this.C = G;
                if (G != null) {
                }
                if (arrayList3.size() == arrayList2.size()) {
                }
                z4 = true;
                i10 = 0;
                while (i10 < arrayList3.size()) {
                }
                arrayList = new ArrayList();
                while (i11 < this.G) {
                }
                while (i12 < arrayList2.size()) {
                }
                if (!arrayList.isEmpty()) {
                }
                if (z4) {
                }
            }
            emojiStatus = null;
            if (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) {
            }
            int i14222 = 0;
            G = t7.y(i13, false).G(j10, true);
            this.C = G;
            if (G != null) {
            }
            if (arrayList3.size() == arrayList2.size()) {
            }
            z4 = true;
            i10 = 0;
            while (i10 < arrayList3.size()) {
            }
            arrayList = new ArrayList();
            while (i11 < this.G) {
            }
            while (i12 < arrayList2.size()) {
            }
            if (!arrayList.isEmpty()) {
            }
            if (z4) {
            }
        }
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.starUserGiftsLoaded && ((Long) objArr[0]).longValue() == this.b) {
            a();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x018e  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        float dp;
        int dp2;
        float f11;
        float clamp01;
        float f12;
        ArrayList arrayList;
        t0 t0Var;
        u0 u0Var = this;
        ArrayList arrayList2 = u0Var.E;
        if (arrayList2.isEmpty()) {
            return;
        }
        float f13 = 1.0f;
        if (u0Var.e >= 1.0f || u0Var.f <= 0.0f) {
            return;
        }
        View view = u0Var.c;
        float x10 = view.getX();
        float y10 = view.getY();
        float scaleX = view.getScaleX() * view.getWidth();
        float scaleY = view.getScaleY() * view.getHeight();
        float dpf2 = AndroidUtilities.dpf2(96.0f);
        float min = Math.min(x10, (u0Var.getWidth() - dpf2) / 2.0f);
        float max = Math.max(y10, (u0Var.x - dpf2) / 2.0f);
        float max2 = Math.max(scaleX, dpf2);
        float max3 = Math.max(scaleY, dpf2);
        canvas.save();
        canvas.clipRect(0.0f, 0.0f, u0Var.getWidth(), u0Var.w);
        float f14 = (max2 / 2.0f) + min;
        float f15 = (max3 / 2.0f) + max;
        float f16 = (scaleX / 2.0f) + x10;
        float f17 = (scaleY / 2.0f) + y10;
        float f18 = u0Var.w;
        float f19 = f18 / u0Var.x;
        float clamp012 = Utilities.clamp01((f18 - (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight)) / AndroidUtilities.dp(50.0f));
        boolean z4 = false;
        int i10 = 0;
        while (i10 < arrayList2.size()) {
            t0 t0Var2 = (t0) arrayList2.get(i10);
            float d = t0Var2.k.d(f13, z4);
            float lerp = AndroidUtilities.lerp(0.5f, f13, d);
            int i11 = i10;
            float y11 = org.telegram.messenger.y3.y(f13, u0Var.n, (f13 - u0Var.e) * d, clamp012);
            int i12 = t0Var2.g;
            float f20 = 1.6f;
            if (i12 != 0) {
                if (i12 != 1) {
                    if (i12 == 2) {
                        f10 = clamp012;
                        dp = ((f14 * 2.0f) / 3.0f) - (AndroidUtilities.dp(12.0f) * f19);
                        f11 = (max + max3) - AndroidUtilities.dp(16.0f);
                    } else if (i12 == 3) {
                        f10 = clamp012;
                        dp = (AndroidUtilities.dp(20.0f) * f19) + (1.5f * f14);
                        dp2 = AndroidUtilities.dp(13.0f);
                    } else if (i12 != 4) {
                        dp = (AndroidUtilities.dp(12.0f) * f19) + ((4.0f * f14) / 3.0f);
                        f10 = clamp012;
                        f11 = (max + max3) - AndroidUtilities.dp(16.0f);
                    } else {
                        f10 = clamp012;
                        dp = (AndroidUtilities.dp(12.0f) * f19) + ((f14 * 4.0f) / 3.0f);
                        f11 = max - AndroidUtilities.dp(4.0f);
                    }
                    f20 = 0.9f;
                    float min2 = (!u0Var.h || d >= 1.0f) ? u0Var.f : Math.min(d, u0Var.f);
                    float f21 = f20 * 0.2f;
                    clamp01 = min2 >= 1.0f - f21 ? 1.0f : Utilities.clamp01(((min2 - 0.32000002f) + f21) / 0.67999995f);
                    if (clamp01 < 1.0f) {
                        dp = AndroidUtilities.lerp(f16, dp, u0Var.H.getInterpolation(clamp01));
                        f11 = AndroidUtilities.lerp(f17, f11, u0Var.I.getInterpolation(clamp01));
                        lerp = AndroidUtilities.lerp(lerp / 2.0f, lerp, clamp01);
                    }
                    if (y11 <= 0.0f) {
                        f12 = f17;
                        arrayList = arrayList2;
                    } else {
                        float dp3 = AndroidUtilities.dp(45.0f);
                        float f22 = lerp;
                        float f23 = dp3 / 2.0f;
                        f12 = f17;
                        arrayList = arrayList2;
                        t0Var2.l.set(dp - f23, f11 - f23, dp + f23, f11 + f23);
                        canvas.save();
                        canvas.translate(dp, f11);
                        canvas.rotate(0.0f);
                        float a2 = t0Var2.m.a(0.1f) * f22;
                        canvas.scale(a2, a2);
                        t0Var2.f.d();
                        t0Var2.f.b(canvas, t0Var2.d, y11);
                        Paint paint = t0Var2.i;
                        if (paint != null) {
                            paint.setAlpha((int) (y11 * 255.0f * 1.0f));
                            float f24 = (-dp3) / 2.0f;
                            t0Var = t0Var2;
                            canvas.drawRect(f24, f24, f23, f23, t0Var2.i);
                        } else {
                            t0Var = t0Var2;
                        }
                        if (t0Var.j != null) {
                            int dp4 = AndroidUtilities.dp(24.0f);
                            int i13 = (-dp4) / 2;
                            int i14 = dp4 / 2;
                            t0Var.j.setBounds(i13, i13, i14, i14);
                            t0Var.j.setAlpha((int) (y11 * 255.0f));
                            t0Var.j.draw(canvas);
                        }
                        canvas.restore();
                    }
                    i10 = i11 + 1;
                    u0Var = this;
                    f17 = f12;
                    arrayList2 = arrayList;
                    clamp012 = f10;
                    z4 = false;
                    f13 = 1.0f;
                } else {
                    f10 = clamp012;
                    dp = ((f14 * 2.0f) / 3.0f) - (AndroidUtilities.dp(6.0f) * f19);
                    f11 = max - AndroidUtilities.dp(4.0f);
                }
                f20 = 0.0f;
                if (u0Var.h) {
                }
                float f212 = f20 * 0.2f;
                if (min2 >= 1.0f - f212) {
                }
                if (clamp01 < 1.0f) {
                }
                if (y11 <= 0.0f) {
                }
                i10 = i11 + 1;
                u0Var = this;
                f17 = f12;
                arrayList2 = arrayList;
                clamp012 = f10;
                z4 = false;
                f13 = 1.0f;
            } else {
                f10 = clamp012;
                dp = (f14 / 2.0f) - (AndroidUtilities.dp(20.0f) * f19);
                dp2 = AndroidUtilities.dp(13.0f);
            }
            f11 = f15 - dp2;
            if (u0Var.h) {
            }
            float f2122 = f20 * 0.2f;
            if (min2 >= 1.0f - f2122) {
            }
            if (clamp01 < 1.0f) {
            }
            if (y11 <= 0.0f) {
            }
            i10 = i11 + 1;
            u0Var = this;
            f17 = f12;
            arrayList2 = arrayList;
            clamp012 = f10;
            z4 = false;
            f13 = 1.0f;
        }
        canvas.restore();
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getInstance(this.a).addObserver(this, NotificationCenter.starUserGiftsLoaded);
        ArrayList arrayList = this.E;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((t0) obj).j.a(this);
        }
        a();
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.a).removeObserver(this, NotificationCenter.starUserGiftsLoaded);
        ArrayList arrayList = this.E;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((t0) obj).j.o(this);
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
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.E;
            if (i10 >= arrayList.size()) {
                t0Var = null;
                break;
            }
            if (((t0) arrayList.get(i10)).l.contains(x10, y10)) {
                t0Var = (t0) arrayList.get(i10);
                break;
            }
            i10++;
        }
        if (motionEvent.getAction() == 0) {
            this.J = t0Var;
            if (t0Var != null) {
                t0Var.m.c(true);
            }
        } else if (motionEvent.getAction() == 2) {
            t0 t0Var3 = this.J;
            if (t0Var3 != t0Var && t0Var3 != null) {
                t0Var3.m.c(false);
                this.J = null;
            }
        } else if (motionEvent.getAction() == 1) {
            t0 t0Var4 = this.J;
            if (t0Var4 != null) {
                ze.d.s(getContext(), "https://t.me/nft/" + t0Var4.e);
                this.J.m.c(false);
                this.J = null;
            }
        } else if (motionEvent.getAction() == 3 && (t0Var2 = this.J) != null) {
            t0Var2.m.c(false);
            this.J = null;
        }
        return this.J != null;
    }

    public void setActionBarActionMode(float f10) {
        this.n = f10;
        invalidate();
    }

    public void setActive(boolean z4) {
        this.d = z4;
    }

    public void setExpandCoords(float f10) {
        this.w = f10;
        invalidate();
    }

    public void setExpandProgress(float f10) {
        if (this.e != f10) {
            this.e = f10;
            invalidate();
        }
    }

    public void setProgressToStoriesInsets(float f10) {
        if (this.B == f10) {
            return;
        }
        this.B = f10;
        invalidate();
    }
}
