package gh;

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
import org.telegram.ui.Components.gr;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class v0 extends View implements NotificationCenter.NotificationCenterDelegate {
    public float A;
    public n7 B;
    public final ArrayList C;
    public final ArrayList D;
    public final HashSet E;
    public int F;
    public final DecelerateInterpolator G;
    public final LinearInterpolator H;
    public u0 I;
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
    public final org.telegram.ui.Components.y5 y;

    public v0(Context context, int i9, long j10, org.telegram.ui.m0 m0Var) {
        super(context);
        this.d = true;
        this.y = new org.telegram.ui.Components.y5(this, 0L, 350L, gr.h);
        this.A = 1.0f;
        this.C = new ArrayList();
        this.D = new ArrayList();
        this.E = new HashSet();
        this.G = new DecelerateInterpolator();
        this.H = new LinearInterpolator();
        this.a = i9;
        this.b = j10;
        this.c = m0Var;
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
        n7 G;
        boolean z10;
        int i9;
        ArrayList arrayList;
        int i10;
        int i11;
        u0 u0Var;
        u0 u0Var2;
        int i12 = this.a;
        if (!MessagesController.getInstance(i12).enableGiftsInProfile) {
            return;
        }
        this.F = MessagesController.getInstance(i12).stargiftsPinnedToTopLimit;
        ArrayList arrayList2 = this.C;
        arrayList2.clear();
        ArrayList arrayList3 = this.D;
        arrayList2.addAll(arrayList3);
        arrayList3.clear();
        HashSet hashSet = this.E;
        hashSet.clear();
        long j10 = this.b;
        if (j10 >= 0) {
            TLRPC.User user = MessagesController.getInstance(i12).getUser(Long.valueOf(j10));
            if (user != null) {
                emojiStatus = user.emoji_status;
                if (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) {
                    hashSet.add(Long.valueOf(((TLRPC.TL_emojiStatusCollectible) emojiStatus).collectible_id));
                }
                int i13 = 0;
                G = v7.y(i12, false).G(j10, true);
                this.B = G;
                if (G != null) {
                    for (int i14 = 0; i14 < this.B.l.size(); i14++) {
                        TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) this.B.l.get(i14);
                        if (!savedStarGift.unsaved && savedStarGift.pinned_to_top) {
                            TL_stars.StarGift starGift = savedStarGift.gift;
                            if (starGift instanceof TL_stars.TL_starGiftUnique) {
                                u0 u0Var3 = new u0(this, (TL_stars.TL_starGiftUnique) starGift);
                                long j11 = u0Var3.a;
                                if (!hashSet.contains(Long.valueOf(j11))) {
                                    arrayList3.add(u0Var3);
                                    hashSet.add(Long.valueOf(j11));
                                }
                            }
                        }
                    }
                }
                if (arrayList3.size() == arrayList2.size()) {
                    for (int i15 = 0; i15 < arrayList3.size(); i15++) {
                        u0 u0Var4 = (u0) arrayList3.get(i15);
                        u0 u0Var5 = (u0) arrayList2.get(i15);
                        u0Var4.getClass();
                        if (u0Var5 != null && u0Var5.a == u0Var4.a) {
                        }
                    }
                    z10 = false;
                    i9 = 0;
                    while (i9 < arrayList3.size()) {
                        u0 u0Var6 = (u0) arrayList3.get(i9);
                        int i16 = 0;
                        while (true) {
                            if (i16 >= arrayList2.size()) {
                                u0Var2 = null;
                                break;
                            } else {
                                if (((u0) arrayList2.get(i16)).a == u0Var6.a) {
                                    u0Var2 = (u0) arrayList2.get(i16);
                                    break;
                                }
                                i16++;
                            }
                        }
                        if (u0Var2 != null) {
                            u0Var6.getClass();
                            u0Var6.h = u0Var2.h;
                            u0Var6.j = u0Var2.j;
                            u0Var6.i = u0Var2.i;
                            u0Var6.k = u0Var2.k;
                            u0Var6.f = u0Var2.f;
                            u0Var6.g = u0Var2.g;
                        } else {
                            float dp = AndroidUtilities.dp(22.5f);
                            int i17 = u0Var6.d;
                            u0Var6.h = new RadialGradient(0.0f, 0.0f, dp, new int[]{i17, org.telegram.ui.ActionBar.f6.l1(0.0f, i17)}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                            Paint paint = new Paint(1);
                            u0Var6.i = paint;
                            paint.setShader(u0Var6.h);
                            TLRPC.Document document = u0Var6.b;
                            if (document != null) {
                                u0Var6.j = org.telegram.ui.Components.k5.m(i12, i13, document);
                            } else {
                                u0Var6.j = org.telegram.ui.Components.k5.n(i12, u0Var6.c, null, i13);
                            }
                            org.telegram.ui.Components.y5 y5Var = new org.telegram.ui.Components.y5(this, 0L, 320L, (TimeInterpolator) null);
                            u0Var6.k = y5Var;
                            y5Var.d(0.0f, true);
                            if (isAttachedToWindow()) {
                                u0Var6.j.a(this);
                            }
                        }
                        i9++;
                        i13 = 0;
                    }
                    arrayList = new ArrayList();
                    for (i10 = 0; i10 < this.F; i10 = j3.r0.e(i10, i10, 1, arrayList)) {
                    }
                    for (i11 = 0; i11 < arrayList2.size(); i11++) {
                        u0 u0Var7 = (u0) arrayList2.get(i11);
                        int i18 = 0;
                        while (true) {
                            if (i18 >= arrayList3.size()) {
                                u0Var = null;
                                break;
                            } else {
                                if (((u0) arrayList3.get(i18)).a == u0Var7.a) {
                                    u0Var = (u0) arrayList3.get(i18);
                                    break;
                                }
                                i18++;
                            }
                        }
                        if (u0Var == null) {
                            u0Var7.j.o(this);
                            u0Var7.j = null;
                            u0Var7.h = null;
                        } else {
                            arrayList.remove(Integer.valueOf(u0Var7.g));
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        com.google.android.gms.common.api.internal.r rVar = new com.google.android.gms.common.api.internal.r(arrayList);
                        for (int i19 = 0; i19 < arrayList3.size(); i19++) {
                            u0 u0Var8 = (u0) arrayList3.get(i19);
                            if (u0Var8.g == -1) {
                                u0Var8.g = ((Integer) rVar.c()).intValue();
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
                i9 = 0;
                while (i9 < arrayList3.size()) {
                }
                arrayList = new ArrayList();
                while (i10 < this.F) {
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
            G = v7.y(i12, false).G(j10, true);
            this.B = G;
            if (G != null) {
            }
            if (arrayList3.size() == arrayList2.size()) {
            }
            z10 = true;
            i9 = 0;
            while (i9 < arrayList3.size()) {
            }
            arrayList = new ArrayList();
            while (i10 < this.F) {
            }
            while (i11 < arrayList2.size()) {
            }
            if (!arrayList.isEmpty()) {
            }
            if (z10) {
            }
        } else {
            TLRPC.User user2 = MessagesController.getInstance(i12).getUser(Long.valueOf(-j10));
            if (user2 != null) {
                emojiStatus = user2.emoji_status;
                if (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) {
                }
                int i1322 = 0;
                G = v7.y(i12, false).G(j10, true);
                this.B = G;
                if (G != null) {
                }
                if (arrayList3.size() == arrayList2.size()) {
                }
                z10 = true;
                i9 = 0;
                while (i9 < arrayList3.size()) {
                }
                arrayList = new ArrayList();
                while (i10 < this.F) {
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
            G = v7.y(i12, false).G(j10, true);
            this.B = G;
            if (G != null) {
            }
            if (arrayList3.size() == arrayList2.size()) {
            }
            z10 = true;
            i9 = 0;
            while (i9 < arrayList3.size()) {
            }
            arrayList = new ArrayList();
            while (i10 < this.F) {
            }
            while (i11 < arrayList2.size()) {
            }
            if (!arrayList.isEmpty()) {
            }
            if (z10) {
            }
        }
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        if (i9 == NotificationCenter.starUserGiftsLoaded && ((Long) objArr[0]).longValue() == this.b) {
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
        u0 u0Var;
        v0 v0Var = this;
        ArrayList arrayList2 = v0Var.D;
        if (arrayList2.isEmpty()) {
            return;
        }
        float f13 = 1.0f;
        if (v0Var.e >= 1.0f || v0Var.f <= 0.0f) {
            return;
        }
        View view = v0Var.c;
        float x10 = view.getX();
        float y10 = view.getY();
        float scaleX = view.getScaleX() * view.getWidth();
        float scaleY = view.getScaleY() * view.getHeight();
        float dpf2 = AndroidUtilities.dpf2(96.0f);
        float min = Math.min(x10, (v0Var.getWidth() - dpf2) / 2.0f);
        float max = Math.max(y10, (v0Var.x - dpf2) / 2.0f);
        float max2 = Math.max(scaleX, dpf2);
        float max3 = Math.max(scaleY, dpf2);
        canvas.save();
        canvas.clipRect(0.0f, 0.0f, v0Var.getWidth(), v0Var.w);
        float f14 = (max2 / 2.0f) + min;
        float f15 = (max3 / 2.0f) + max;
        float f16 = (scaleX / 2.0f) + x10;
        float f17 = (scaleY / 2.0f) + y10;
        float f18 = v0Var.w;
        float f19 = f18 / v0Var.x;
        float clamp012 = Utilities.clamp01((f18 - (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight)) / AndroidUtilities.dp(50.0f));
        boolean z10 = false;
        int i9 = 0;
        while (i9 < arrayList2.size()) {
            u0 u0Var2 = (u0) arrayList2.get(i9);
            float d = u0Var2.k.d(f13, z10);
            float lerp = AndroidUtilities.lerp(0.5f, f13, d);
            int i10 = i9;
            float y11 = org.telegram.messenger.l0.y(f13, v0Var.n, (f13 - v0Var.e) * d, clamp012);
            int i11 = u0Var2.g;
            float f20 = 1.6f;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 == 2) {
                        f10 = clamp012;
                        dp = ((f14 * 2.0f) / 3.0f) - (AndroidUtilities.dp(12.0f) * f19);
                        f11 = (max + max3) - AndroidUtilities.dp(16.0f);
                    } else if (i11 == 3) {
                        f10 = clamp012;
                        dp = (AndroidUtilities.dp(20.0f) * f19) + (1.5f * f14);
                        dp2 = AndroidUtilities.dp(13.0f);
                    } else if (i11 != 4) {
                        dp = (AndroidUtilities.dp(12.0f) * f19) + ((4.0f * f14) / 3.0f);
                        f10 = clamp012;
                        f11 = (max + max3) - AndroidUtilities.dp(16.0f);
                    } else {
                        f10 = clamp012;
                        dp = (AndroidUtilities.dp(12.0f) * f19) + ((f14 * 4.0f) / 3.0f);
                        f11 = max - AndroidUtilities.dp(4.0f);
                    }
                    f20 = 0.9f;
                    float min2 = (!v0Var.h || d >= 1.0f) ? v0Var.f : Math.min(d, v0Var.f);
                    float f21 = f20 * 0.2f;
                    clamp01 = min2 >= 1.0f - f21 ? 1.0f : Utilities.clamp01(((min2 - 0.32000002f) + f21) / 0.67999995f);
                    if (clamp01 < 1.0f) {
                        dp = AndroidUtilities.lerp(f16, dp, v0Var.G.getInterpolation(clamp01));
                        f11 = AndroidUtilities.lerp(f17, f11, v0Var.H.getInterpolation(clamp01));
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
                        u0Var2.l.set(dp - f23, f11 - f23, dp + f23, f11 + f23);
                        canvas.save();
                        canvas.translate(dp, f11);
                        canvas.rotate(0.0f);
                        float a2 = u0Var2.m.a(0.1f) * f22;
                        canvas.scale(a2, a2);
                        u0Var2.f.d();
                        u0Var2.f.b(canvas, u0Var2.d, y11);
                        Paint paint = u0Var2.i;
                        if (paint != null) {
                            paint.setAlpha((int) (y11 * 255.0f * 1.0f));
                            float f24 = (-dp3) / 2.0f;
                            u0Var = u0Var2;
                            canvas.drawRect(f24, f24, f23, f23, u0Var2.i);
                        } else {
                            u0Var = u0Var2;
                        }
                        if (u0Var.j != null) {
                            int dp4 = AndroidUtilities.dp(24.0f);
                            int i12 = (-dp4) / 2;
                            int i13 = dp4 / 2;
                            u0Var.j.setBounds(i12, i12, i13, i13);
                            u0Var.j.setAlpha((int) (y11 * 255.0f));
                            u0Var.j.draw(canvas);
                        }
                        canvas.restore();
                    }
                    i9 = i10 + 1;
                    v0Var = this;
                    f17 = f12;
                    arrayList2 = arrayList;
                    clamp012 = f10;
                    z10 = false;
                    f13 = 1.0f;
                } else {
                    f10 = clamp012;
                    dp = ((f14 * 2.0f) / 3.0f) - (AndroidUtilities.dp(6.0f) * f19);
                    f11 = max - AndroidUtilities.dp(4.0f);
                }
                f20 = 0.0f;
                if (v0Var.h) {
                }
                float f212 = f20 * 0.2f;
                if (min2 >= 1.0f - f212) {
                }
                if (clamp01 < 1.0f) {
                }
                if (y11 <= 0.0f) {
                }
                i9 = i10 + 1;
                v0Var = this;
                f17 = f12;
                arrayList2 = arrayList;
                clamp012 = f10;
                z10 = false;
                f13 = 1.0f;
            } else {
                f10 = clamp012;
                dp = (f14 / 2.0f) - (AndroidUtilities.dp(20.0f) * f19);
                dp2 = AndroidUtilities.dp(13.0f);
            }
            f11 = f15 - dp2;
            if (v0Var.h) {
            }
            float f2122 = f20 * 0.2f;
            if (min2 >= 1.0f - f2122) {
            }
            if (clamp01 < 1.0f) {
            }
            if (y11 <= 0.0f) {
            }
            i9 = i10 + 1;
            v0Var = this;
            f17 = f12;
            arrayList2 = arrayList;
            clamp012 = f10;
            z10 = false;
            f13 = 1.0f;
        }
        canvas.restore();
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getInstance(this.a).addObserver(this, NotificationCenter.starUserGiftsLoaded);
        ArrayList arrayList = this.D;
        int size = arrayList.size();
        int i9 = 0;
        while (i9 < size) {
            Object obj = arrayList.get(i9);
            i9++;
            ((u0) obj).j.a(this);
        }
        a();
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.a).removeObserver(this, NotificationCenter.starUserGiftsLoaded);
        ArrayList arrayList = this.D;
        int size = arrayList.size();
        int i9 = 0;
        while (i9 < size) {
            Object obj = arrayList.get(i9);
            i9++;
            ((u0) obj).j.o(this);
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        u0 u0Var;
        u0 u0Var2;
        if (!this.d) {
            return false;
        }
        float x10 = motionEvent.getX();
        float y10 = motionEvent.getY();
        int i9 = 0;
        while (true) {
            ArrayList arrayList = this.D;
            if (i9 >= arrayList.size()) {
                u0Var = null;
                break;
            }
            if (((u0) arrayList.get(i9)).l.contains(x10, y10)) {
                u0Var = (u0) arrayList.get(i9);
                break;
            }
            i9++;
        }
        if (motionEvent.getAction() == 0) {
            this.I = u0Var;
            if (u0Var != null) {
                u0Var.m.c(true);
            }
        } else if (motionEvent.getAction() == 2) {
            u0 u0Var3 = this.I;
            if (u0Var3 != u0Var && u0Var3 != null) {
                u0Var3.m.c(false);
                this.I = null;
            }
        } else if (motionEvent.getAction() == 1) {
            u0 u0Var4 = this.I;
            if (u0Var4 != null) {
                ve.e.s(getContext(), "https://t.me/nft/" + u0Var4.e);
                this.I.m.c(false);
                this.I = null;
            }
        } else if (motionEvent.getAction() == 3 && (u0Var2 = this.I) != null) {
            u0Var2.m.c(false);
            this.I = null;
        }
        return this.I != null;
    }

    public void setActionBarActionMode(float f10) {
        this.n = f10;
        invalidate();
    }

    public void setActive(boolean z10) {
        this.d = z10;
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
        if (this.A == f10) {
            return;
        }
        this.A = f10;
        invalidate();
    }
}
