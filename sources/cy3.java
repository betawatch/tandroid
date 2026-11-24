// default package

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.ColorFilter;
import android.view.View;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public abstract class cy3 extends jr9 {
    public static final int[] e0 = {R.drawable.msg_emoji_smiles, R.drawable.msg_emoji_cat, R.drawable.msg_emoji_food, R.drawable.msg_emoji_activities, R.drawable.msg_emoji_travel, R.drawable.msg_emoji_objects, R.drawable.msg_emoji_other, R.drawable.msg_emoji_flags};
    public static final int[] f0 = {R.raw.msg_emoji_smiles, R.raw.msg_emoji_cat, R.raw.msg_emoji_food, R.raw.msg_emoji_activities, R.raw.msg_emoji_travel, R.raw.msg_emoji_objects, R.raw.msg_emoji_other, R.raw.msg_emoji_flags};
    public final zx3 E;
    public final zx3 F;
    public final by3 G;
    public final HashMap H;
    public final int I;
    public ValueAnimator J;
    public float K;
    public float L;
    public int M;
    public int N;
    public boolean O;
    public final boolean P;
    public final int Q;
    public final Runnable R;
    public int S;
    public final int T;
    public boolean U;
    public boolean V;
    public boolean W;
    public boolean a0;
    public boolean b0;
    public boolean c0;
    public float d0;
    public final boolean h;
    public boolean n;
    public lm r;
    public final wjb s;
    public final boolean w;
    public final zx3 x;
    public final zx3 y;

    public cy3(Context context, wjb wjbVar, boolean z, boolean z2, boolean z3, boolean z4, int i, Runnable runnable, int i2, boolean z5) {
        super(context);
        this.h = !y6c.h(y6c.t0).p();
        this.n = true;
        this.H = new HashMap();
        this.K = 0.0f;
        this.L = 0.0f;
        this.M = 0;
        this.N = 0;
        this.O = true;
        this.S = 6;
        this.U = true;
        this.V = true;
        this.W = true;
        this.a0 = true;
        this.b0 = false;
        this.c0 = true;
        this.d0 = 11.0f;
        this.w = z4;
        this.s = wjbVar;
        this.R = runnable;
        this.T = i;
        this.Q = i2;
        this.P = z5;
        vx3 vx3Var = new vx3(this, context, z4, z5);
        this.b = vx3Var;
        vx3Var.setClipToPadding(false);
        this.b.setOrientation(0);
        setVerticalScrollBarEnabled(false);
        setHorizontalScrollBarEnabled(false);
        addView(this.b);
        if (i == 4) {
            LinearLayout linearLayout = this.b;
            zx3 zx3Var = new zx3(this, context, R.drawable.msg_emoji_stickers, false);
            this.x = zx3Var;
            linearLayout.addView(zx3Var);
            zx3Var.setContentDescription(k96.M0(2131754755, null));
        }
        int i3 = i == 6 ? R.drawable.emoji_love : i == 3 ? R.drawable.msg_emoji_smiles : R.drawable.msg_emoji_recent;
        if (z) {
            LinearLayout linearLayout2 = this.b;
            zx3 zx3Var2 = new zx3(this, context, i3, false);
            this.y = zx3Var2;
            linearLayout2.addView(zx3Var2);
            zx3Var2.setContentDescription(k96.M0(2131746168, null));
            zx3Var2.a = -934918565L;
        }
        if (z2) {
            LinearLayout linearLayout3 = this.b;
            zx3 zx3Var3 = new zx3(this, context, R.drawable.msg_emoji_gem, false);
            this.E = zx3Var3;
            linearLayout3.addView(zx3Var3);
            zx3Var3.setContentDescription(k96.M0(2131751163, null));
            zx3Var3.setAlpha(0.0f);
            zx3Var3.a = 98352451L;
        }
        if (!z4) {
            int i4 = 0;
            while (i4 < 8) {
                zx3 zx3Var4 = new zx3(this, context, e0[i4], i4 == 0);
                zx3Var4.setContentDescription(f(i4));
                this.b.addView(zx3Var4);
                i4++;
            }
            o();
            return;
        }
        if (z3) {
            LinearLayout linearLayout4 = this.b;
            by3 by3Var = new by3(this, context);
            this.G = by3Var;
            linearLayout4.addView(by3Var);
            by3Var.h = 3552126;
        }
        this.I = this.b.getChildCount();
        if (runnable != null) {
            LinearLayout linearLayout5 = this.b;
            zx3 zx3Var5 = new zx3(this, context, R.drawable.smiles_tab_settings, true);
            this.F = zx3Var5;
            linearLayout5.addView(zx3Var5);
            zx3Var5.setContentDescription(k96.M0(2131745303, null));
            zx3Var5.a = 1434631203L;
            zx3Var5.setAlpha(0.0f);
        }
        o();
    }

    public static String f(int i) {
        switch (i) {
            case 0:
                return k96.M0(2131751183, null);
            case 1:
                return k96.M0(2131751182, null);
            case 2:
                return k96.M0(2131751181, null);
            case 3:
                return k96.M0(2131751180, null);
            case 4:
                return k96.M0(2131751179, null);
            case 5:
                return k96.M0(2131751178, null);
            case 6:
                return k96.M0(2131751177, null);
            case 7:
                return k96.M0(2131751176, null);
            default:
                return null;
        }
    }

    public boolean d() {
        return false;
    }

    public boolean g(h04 h04Var) {
        return h04Var.f;
    }

    public ColorFilter getEmojiColorFilter() {
        return bkb.n0(this.s);
    }

    public abstract boolean h(int i);

    public final void j(int i, boolean z) {
        int i2;
        boolean z2 = z && !this.c0;
        zx3 zx3Var = this.x;
        if (zx3Var != null) {
            i++;
        }
        if (!this.W || zx3Var != null) {
            i = Math.max(1, i);
        }
        int i3 = this.M;
        int i4 = 0;
        int i5 = 0;
        while (i4 < this.b.getChildCount()) {
            View childAt = this.b.getChildAt(i4);
            if (childAt instanceof by3) {
                by3 by3Var = (by3) childAt;
                int i6 = 0;
                int i7 = i5;
                while (i6 < by3Var.b.getChildCount()) {
                    View childAt2 = by3Var.b.getChildAt(i6);
                    if (childAt2 instanceof zx3) {
                        ((zx3) childAt2).g(i == i7, z2);
                    }
                    i6++;
                    i7++;
                }
                i2 = i7 - 1;
            } else {
                if (childAt instanceof zx3) {
                    ((zx3) childAt).g(i == i5, z2);
                }
                i2 = i5;
            }
            if (i >= i5 && i <= i2) {
                this.M = i4;
            }
            i4++;
            i5 = i2 + 1;
        }
        int i8 = this.M;
        by3 by3Var2 = this.G;
        if (i3 != i8) {
            ValueAnimator valueAnimator = this.J;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            float f = this.K;
            float f2 = this.M;
            byte b = 2;
            if (z2) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.J = ofFloat;
                ofFloat.addUpdateListener(new qx1(this, f, f2, b));
                this.J.setDuration(350L);
                this.J.setInterpolator(s33.h);
                this.J.start();
            } else {
                this.L = 1.0f;
                this.K = gl.R1(f, f2, 1.0f);
                this.b.invalidate();
            }
            if (by3Var2 != null) {
                boolean z3 = this.M == 1 || this.h;
                if (z3 != by3Var2.n) {
                    by3Var2.n = z3;
                    if (!z3) {
                        by3Var2.a(0);
                    }
                    ValueAnimator valueAnimator2 = by3Var2.c;
                    if (valueAnimator2 != null) {
                        valueAnimator2.cancel();
                    }
                    if (z2) {
                        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(by3Var2.r, z3 ? 1.0f : 0.0f);
                        by3Var2.c = ofFloat2;
                        ofFloat2.addUpdateListener(new uz1(by3Var2, (byte) 22));
                        by3Var2.c.setDuration(475L);
                        by3Var2.c.setInterpolator(s33.h);
                        by3Var2.c.start();
                    } else {
                        by3Var2.r = z3 ? 1.0f : 0.0f;
                        by3Var2.invalidate();
                        by3Var2.requestLayout();
                        by3Var2.c();
                        by3Var2.s.b.invalidate();
                    }
                }
            }
            View childAt3 = this.b.getChildAt(this.M);
            if (this.M >= 2) {
                b(childAt3.getLeft(), childAt3.getRight());
            } else {
                a(0);
            }
        }
        if (this.N != i) {
            if (by3Var2 != null && this.M == 1 && i >= 1 && i <= by3Var2.b.getChildCount() + 1) {
                int i9 = (i - 1) * 36;
                by3Var2.b(gl.L(i9 - 6), gl.L(i9 + 24));
            }
            this.N = i;
        }
    }

    public final int k() {
        boolean z = this.P;
        wjb wjbVar = this.s;
        if (z) {
            return bm2.o(bkb.v0(bkb.Ml, wjbVar), 12);
        }
        int i = this.T;
        return (i == 5 || i == 7) ? bkb.p1(0.09f, this.Q) : bkb.p1(0.18f, bkb.v0(bkb.Df, wjbVar));
    }

    public final void l(boolean z) {
        zx3 zx3Var = this.E;
        if (zx3Var != null) {
            boolean z2 = this.a0;
            if (z2 || this.b0 != z) {
                this.b0 = z;
                if (z2) {
                    zx3Var.setVisibility(z ? 0 : 8);
                    zx3Var.setAlpha(z ? 1.0f : 0.0f);
                } else {
                    zx3Var.setVisibility(0);
                    zx3Var.animate().alpha(z ? 1.0f : 0.0f).setDuration(200L).setInterpolator(s33.h).withEndAction(new x6c((byte) 16, this, z)).start();
                }
                this.b.requestLayout();
                this.a0 = false;
            }
        }
    }

    public final void m(boolean z) {
        zx3 zx3Var = this.y;
        if (zx3Var == null) {
            return;
        }
        if (z) {
            zx3Var.setBackground(new si3(k()));
        } else {
            zx3Var.setBackground(null);
        }
    }

    public final void n(boolean z) {
        this.n = z;
        this.b.invalidate();
    }

    public final void o() {
        final byte b = 0;
        int i = 0;
        final int i2 = 0;
        while (i < this.b.getChildCount()) {
            View childAt = this.b.getChildAt(i);
            final byte b2 = 1;
            if (childAt instanceof by3) {
                by3 by3Var = (by3) childAt;
                int i3 = 0;
                while (i3 < by3Var.b.getChildCount()) {
                    by3Var.b.getChildAt(i3).setOnClickListener(new View.OnClickListener(this) { // from class: ux3
                        public final /* synthetic */ cy3 b;

                        {
                            this.b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            byte b3 = b;
                            int i4 = i2;
                            cy3 cy3Var = this.b;
                            switch (b3) {
                                case 0:
                                    cy3Var.h(i4);
                                    break;
                                default:
                                    cy3Var.h(i4);
                                    break;
                            }
                        }
                    });
                    i3++;
                    i2++;
                }
                i2--;
            } else if (childAt != null) {
                childAt.setOnClickListener(new View.OnClickListener(this) { // from class: ux3
                    public final /* synthetic */ cy3 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        byte b3 = b2;
                        int i4 = i2;
                        cy3 cy3Var = this.b;
                        switch (b3) {
                            case 0:
                                cy3Var.h(i4);
                                break;
                            default:
                                cy3Var.h(i4);
                                break;
                        }
                    }
                });
            }
            i++;
            i2++;
        }
        zx3 zx3Var = this.F;
        if (zx3Var != null) {
            zx3Var.setOnClickListener(new yj3(this, (byte) 4));
        }
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        this.b.setPadding(gl.L(this.d0), 0, gl.L(11.0f), 0);
        super.onMeasure(i, i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:90:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0166  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void p(ArrayList arrayList) {
        int i;
        int i2;
        zx3 zx3Var;
        boolean z;
        boolean z2;
        TLRPC.Document document;
        if (this.w) {
            if (!this.c0 || hq6.d0(y6c.t0).X[5]) {
                this.c0 = false;
                if (arrayList == null) {
                    return;
                }
                int childCount = this.b.getChildCount();
                int i3 = this.I;
                int i4 = childCount - i3;
                zx3 zx3Var2 = this.F;
                int i5 = i4 - (zx3Var2 != null ? 1 : 0);
                if (i5 == 0 && arrayList.size() > 0) {
                    arrayList.size();
                }
                arrayList.size();
                e();
                boolean z3 = y6c.h(y6c.t0).p() || d();
                ArrayList arrayList2 = new ArrayList();
                int i6 = 0;
                while (i6 < Math.max(arrayList.size(), i5)) {
                    zx3 zx3Var3 = i6 < i5 ? (zx3) this.b.getChildAt(i6 + i3) : null;
                    h04 h04Var = i6 < arrayList.size() ? (h04) arrayList.get(i6) : null;
                    if (h04Var == null) {
                        if (zx3Var3 != null) {
                            this.b.removeView(zx3Var3);
                        }
                    } else if (h04Var.j == 0) {
                        boolean z4 = h04Var.e;
                        Long l = h04Var.a;
                        if (l != null) {
                            if (zx3Var3 == null) {
                                i = i5;
                                zx3Var3 = new zx3(this, getContext(), h04Var.a.longValue());
                                i(zx3Var3);
                                this.b.addView(zx3Var3, i3 + i6);
                            } else {
                                i = i5;
                                zx3Var3.setAnimatedEmojiDocumentId(l.longValue());
                            }
                            i2 = i3;
                            zx3Var = zx3Var2;
                            z = z3;
                            z2 = true;
                        } else {
                            i = i5;
                            TLRPC.StickerSet stickerSet = h04Var.b;
                            ArrayList arrayList3 = h04Var.c;
                            if (stickerSet == null) {
                                i2 = i3;
                                zx3Var = zx3Var2;
                                z = z3;
                            } else {
                                if (arrayList3 != null) {
                                    int i7 = 0;
                                    while (i7 < arrayList3.size()) {
                                        document = (TLRPC.Document) arrayList3.get(i7);
                                        z = z3;
                                        i2 = i3;
                                        zx3Var = zx3Var2;
                                        if (document.id == stickerSet.thumb_document_id) {
                                            z2 = true;
                                            break;
                                        }
                                        i7++;
                                        z3 = z;
                                        i3 = i2;
                                        zx3Var2 = zx3Var;
                                    }
                                }
                                i2 = i3;
                                zx3Var = zx3Var2;
                                z = z3;
                                if (arrayList3 != null) {
                                    z2 = true;
                                    if (arrayList3.size() >= 1) {
                                        document = (TLRPC.Document) arrayList3.get(0);
                                        if (zx3Var3 == null) {
                                            zx3 zx3Var4 = new zx3(this, getContext(), document);
                                            i(zx3Var4);
                                            this.b.addView(zx3Var4, i2 + i6);
                                            zx3Var3 = zx3Var4;
                                        } else {
                                            zx3Var3.setAnimatedEmojiDocument(document);
                                        }
                                        if (document == null) {
                                            zx3Var3.setStickerThumb(h04Var);
                                        }
                                    }
                                    document = null;
                                    if (zx3Var3 == null) {
                                    }
                                    if (document == null) {
                                    }
                                }
                            }
                            z2 = true;
                            document = null;
                            if (zx3Var3 == null) {
                            }
                            if (document == null) {
                            }
                        }
                        zx3Var3.a = h04Var.i ? 439488310L : null;
                        zx3Var3.g(this.M == i6 ? z2 : false, false);
                        int i8 = this.T;
                        if (i8 == 4) {
                            zx3Var3.a((z || z4) ? null : Boolean.TRUE);
                        } else if (i8 == 6 || i8 == 5 || i8 == 7) {
                            zx3Var3.a(null);
                        } else if (!z && !z4) {
                            zx3Var3.a(Boolean.TRUE);
                        } else if (g(h04Var)) {
                            zx3Var3.a(null);
                        } else {
                            zx3Var3.a(Boolean.FALSE);
                        }
                        i6++;
                        i5 = i;
                        z3 = z;
                        i3 = i2;
                        zx3Var2 = zx3Var;
                    } else if (zx3Var3 == null) {
                        zx3 zx3Var5 = new zx3(this, getContext(), h04Var.j, false);
                        i(zx3Var5);
                        this.b.addView(zx3Var5, i3 + i6);
                    } else {
                        zx3Var3.setDrawable(getResources().getDrawable(h04Var.j).mutate());
                        zx3Var3.d();
                        zx3Var3.a(null);
                    }
                    i = i5;
                    i2 = i3;
                    zx3Var = zx3Var2;
                    z = z3;
                    i6++;
                    i5 = i;
                    z3 = z;
                    i3 = i2;
                    zx3Var2 = zx3Var;
                }
                zx3 zx3Var6 = zx3Var2;
                if (zx3Var6 != null) {
                    zx3Var6.bringToFront();
                    if (zx3Var6.getAlpha() < 1.0f) {
                        zx3Var6.animate().alpha(1.0f).setDuration(pg5.d() ? 0L : 200L).setInterpolator(s33.f).start();
                    }
                }
                for (int i9 = 0; i9 < arrayList2.size(); i9++) {
                    ((zx3) arrayList2.get(i9)).getClass();
                    ((zx3) arrayList2.get(i9)).c();
                }
                o();
            }
        }
    }

    public void setAnimatedEmojiCacheType(int i) {
        this.S = i;
    }

    public void setPaddingLeft(float f) {
        this.d0 = f;
    }

    public void e() {
    }

    public void i(zx3 zx3Var) {
    }
}
