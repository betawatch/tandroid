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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public abstract class mz3 extends lt9 {
    public static final int[] e0 = {R.drawable.msg_emoji_smiles, R.drawable.msg_emoji_cat, R.drawable.msg_emoji_food, R.drawable.msg_emoji_activities, R.drawable.msg_emoji_travel, R.drawable.msg_emoji_objects, R.drawable.msg_emoji_other, R.drawable.msg_emoji_flags};
    public static final int[] f0 = {R.raw.msg_emoji_smiles, R.raw.msg_emoji_cat, R.raw.msg_emoji_food, R.raw.msg_emoji_activities, R.raw.msg_emoji_travel, R.raw.msg_emoji_objects, R.raw.msg_emoji_other, R.raw.msg_emoji_flags};
    public final jz3 E;
    public final jz3 F;
    public final lz3 G;
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
    public ln r;
    public final ylb s;
    public final boolean w;
    public final jz3 x;
    public final jz3 y;

    public mz3(Context context, ylb ylbVar, boolean z, boolean z2, boolean z3, boolean z4, int i, Runnable runnable, int i2, boolean z5) {
        super(context);
        this.h = !z8c.h(z8c.t0).p();
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
        this.s = ylbVar;
        this.R = runnable;
        this.T = i;
        this.Q = i2;
        this.P = z5;
        fz3 fz3Var = new fz3(this, context, z4, z5);
        this.b = fz3Var;
        fz3Var.setClipToPadding(false);
        this.b.setOrientation(0);
        setVerticalScrollBarEnabled(false);
        setHorizontalScrollBarEnabled(false);
        addView(this.b);
        if (i == 4) {
            LinearLayout linearLayout = this.b;
            jz3 jz3Var = new jz3(this, context, R.drawable.msg_emoji_stickers, false);
            this.x = jz3Var;
            linearLayout.addView(jz3Var);
            jz3Var.setContentDescription(jb6.M0(2131754755, null));
        }
        int i3 = i == 6 ? R.drawable.emoji_love : i == 3 ? R.drawable.msg_emoji_smiles : R.drawable.msg_emoji_recent;
        if (z) {
            LinearLayout linearLayout2 = this.b;
            jz3 jz3Var2 = new jz3(this, context, i3, false);
            this.y = jz3Var2;
            linearLayout2.addView(jz3Var2);
            jz3Var2.setContentDescription(jb6.M0(2131746094, null));
            jz3Var2.a = -934918565L;
        }
        if (z2) {
            LinearLayout linearLayout3 = this.b;
            jz3 jz3Var3 = new jz3(this, context, R.drawable.msg_emoji_gem, false);
            this.E = jz3Var3;
            linearLayout3.addView(jz3Var3);
            jz3Var3.setContentDescription(jb6.M0(2131751112, null));
            jz3Var3.setAlpha(0.0f);
            jz3Var3.a = 98352451L;
        }
        if (!z4) {
            int i4 = 0;
            while (i4 < 8) {
                jz3 jz3Var4 = new jz3(this, context, e0[i4], i4 == 0);
                jz3Var4.setContentDescription(f(i4));
                this.b.addView(jz3Var4);
                i4++;
            }
            o();
            return;
        }
        if (z3) {
            LinearLayout linearLayout4 = this.b;
            lz3 lz3Var = new lz3(this, context);
            this.G = lz3Var;
            linearLayout4.addView(lz3Var);
            lz3Var.h = 3552126;
        }
        this.I = this.b.getChildCount();
        if (runnable != null) {
            LinearLayout linearLayout5 = this.b;
            jz3 jz3Var5 = new jz3(this, context, R.drawable.smiles_tab_settings, true);
            this.F = jz3Var5;
            linearLayout5.addView(jz3Var5);
            jz3Var5.setContentDescription(jb6.M0(2131745229, null));
            jz3Var5.a = 1434631203L;
            jz3Var5.setAlpha(0.0f);
        }
        o();
    }

    public static String f(int i) {
        switch (i) {
            case 0:
                return jb6.M0(2131751132, null);
            case 1:
                return jb6.M0(2131751131, null);
            case 2:
                return jb6.M0(2131751130, null);
            case 3:
                return jb6.M0(2131751129, null);
            case 4:
                return jb6.M0(2131751128, null);
            case 5:
                return jb6.M0(2131751127, null);
            case 6:
                return jb6.M0(2131751126, null);
            case 7:
                return jb6.M0(2131751125, null);
            default:
                return null;
        }
    }

    public boolean d() {
        return false;
    }

    public boolean g(s14 s14Var) {
        return s14Var.f;
    }

    public ColorFilter getEmojiColorFilter() {
        return cmb.n0(this.s);
    }

    public abstract boolean h(int i);

    public final void j(int i, boolean z) {
        int i2;
        boolean z2 = z && !this.c0;
        jz3 jz3Var = this.x;
        if (jz3Var != null) {
            i++;
        }
        if (!this.W || jz3Var != null) {
            i = Math.max(1, i);
        }
        int i3 = this.M;
        int i4 = 0;
        int i5 = 0;
        while (i4 < this.b.getChildCount()) {
            View childAt = this.b.getChildAt(i4);
            if (childAt instanceof lz3) {
                lz3 lz3Var = (lz3) childAt;
                int i6 = 0;
                int i7 = i5;
                while (i6 < lz3Var.b.getChildCount()) {
                    View childAt2 = lz3Var.b.getChildAt(i6);
                    if (childAt2 instanceof jz3) {
                        ((jz3) childAt2).g(i == i7, z2);
                    }
                    i6++;
                    i7++;
                }
                i2 = i7 - 1;
            } else {
                if (childAt instanceof jz3) {
                    ((jz3) childAt).g(i == i5, z2);
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
        lz3 lz3Var2 = this.G;
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
                ofFloat.addUpdateListener(new dz1(this, f, f2, b));
                this.J.setDuration(350L);
                this.J.setInterpolator(d53.h);
                this.J.start();
            } else {
                this.L = 1.0f;
                this.K = gm.R1(f, f2, 1.0f);
                this.b.invalidate();
            }
            if (lz3Var2 != null) {
                boolean z3 = this.M == 1 || this.h;
                if (z3 != lz3Var2.n) {
                    lz3Var2.n = z3;
                    if (!z3) {
                        lz3Var2.a(0);
                    }
                    ValueAnimator valueAnimator2 = lz3Var2.c;
                    if (valueAnimator2 != null) {
                        valueAnimator2.cancel();
                    }
                    if (z2) {
                        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(lz3Var2.r, z3 ? 1.0f : 0.0f);
                        lz3Var2.c = ofFloat2;
                        ofFloat2.addUpdateListener(new et1(lz3Var2, (byte) 24));
                        lz3Var2.c.setDuration(475L);
                        lz3Var2.c.setInterpolator(d53.h);
                        lz3Var2.c.start();
                    } else {
                        lz3Var2.r = z3 ? 1.0f : 0.0f;
                        lz3Var2.invalidate();
                        lz3Var2.requestLayout();
                        lz3Var2.c();
                        lz3Var2.s.b.invalidate();
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
            if (lz3Var2 != null && this.M == 1 && i >= 1 && i <= lz3Var2.b.getChildCount() + 1) {
                int i9 = (i - 1) * 36;
                lz3Var2.b(gm.L(i9 - 6), gm.L(i9 + 24));
            }
            this.N = i;
        }
    }

    public final int k() {
        boolean z = this.P;
        ylb ylbVar = this.s;
        if (z) {
            return on2.p(cmb.v0(cmb.Ml, ylbVar), 12);
        }
        int i = this.T;
        return (i == 5 || i == 7) ? cmb.p1(0.09f, this.Q) : cmb.p1(0.18f, cmb.v0(cmb.Df, ylbVar));
    }

    public final void l(boolean z) {
        jz3 jz3Var = this.E;
        if (jz3Var != null) {
            boolean z2 = this.a0;
            if (z2 || this.b0 != z) {
                this.b0 = z;
                if (z2) {
                    jz3Var.setVisibility(z ? 0 : 8);
                    jz3Var.setAlpha(z ? 1.0f : 0.0f);
                } else {
                    jz3Var.setVisibility(0);
                    jz3Var.animate().alpha(z ? 1.0f : 0.0f).setDuration(200L).setInterpolator(d53.h).withEndAction(new y8c((byte) 16, this, z)).start();
                }
                this.b.requestLayout();
                this.a0 = false;
            }
        }
    }

    public final void m(boolean z) {
        jz3 jz3Var = this.y;
        if (jz3Var == null) {
            return;
        }
        if (z) {
            jz3Var.setBackground(new ck3(k()));
        } else {
            jz3Var.setBackground(null);
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
            if (childAt instanceof lz3) {
                lz3 lz3Var = (lz3) childAt;
                int i3 = 0;
                while (i3 < lz3Var.b.getChildCount()) {
                    lz3Var.b.getChildAt(i3).setOnClickListener(new View.OnClickListener(this) { // from class: ez3
                        public final /* synthetic */ mz3 b;

                        {
                            this.b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            byte b3 = b;
                            int i4 = i2;
                            mz3 mz3Var = this.b;
                            switch (b3) {
                                case 0:
                                    mz3Var.h(i4);
                                    break;
                                default:
                                    mz3Var.h(i4);
                                    break;
                            }
                        }
                    });
                    i3++;
                    i2++;
                }
                i2--;
            } else if (childAt != null) {
                childAt.setOnClickListener(new View.OnClickListener(this) { // from class: ez3
                    public final /* synthetic */ mz3 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        byte b3 = b2;
                        int i4 = i2;
                        mz3 mz3Var = this.b;
                        switch (b3) {
                            case 0:
                                mz3Var.h(i4);
                                break;
                            default:
                                mz3Var.h(i4);
                                break;
                        }
                    }
                });
            }
            i++;
            i2++;
        }
        jz3 jz3Var = this.F;
        if (jz3Var != null) {
            jz3Var.setOnClickListener(new sf3(this, (byte) 7));
        }
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        this.b.setPadding(gm.L(this.d0), 0, gm.L(11.0f), 0);
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
        jz3 jz3Var;
        boolean z;
        boolean z2;
        TLRPC.Document document;
        if (this.w) {
            if (!this.c0 || hs6.d0(z8c.t0).X[5]) {
                this.c0 = false;
                if (arrayList == null) {
                    return;
                }
                int childCount = this.b.getChildCount();
                int i3 = this.I;
                int i4 = childCount - i3;
                jz3 jz3Var2 = this.F;
                int i5 = i4 - (jz3Var2 != null ? 1 : 0);
                if (i5 == 0 && arrayList.size() > 0) {
                    arrayList.size();
                }
                arrayList.size();
                e();
                boolean z3 = z8c.h(z8c.t0).p() || d();
                ArrayList arrayList2 = new ArrayList();
                int i6 = 0;
                while (i6 < Math.max(arrayList.size(), i5)) {
                    jz3 jz3Var3 = i6 < i5 ? (jz3) this.b.getChildAt(i6 + i3) : null;
                    s14 s14Var = i6 < arrayList.size() ? (s14) arrayList.get(i6) : null;
                    if (s14Var == null) {
                        if (jz3Var3 != null) {
                            this.b.removeView(jz3Var3);
                        }
                    } else if (s14Var.j == 0) {
                        boolean z4 = s14Var.e;
                        Long l = s14Var.a;
                        if (l != null) {
                            if (jz3Var3 == null) {
                                i = i5;
                                jz3Var3 = new jz3(this, getContext(), s14Var.a.longValue());
                                i(jz3Var3);
                                this.b.addView(jz3Var3, i3 + i6);
                            } else {
                                i = i5;
                                jz3Var3.setAnimatedEmojiDocumentId(l.longValue());
                            }
                            i2 = i3;
                            jz3Var = jz3Var2;
                            z = z3;
                            z2 = true;
                        } else {
                            i = i5;
                            TLRPC.StickerSet stickerSet = s14Var.b;
                            ArrayList arrayList3 = s14Var.c;
                            if (stickerSet == null) {
                                i2 = i3;
                                jz3Var = jz3Var2;
                                z = z3;
                            } else {
                                if (arrayList3 != null) {
                                    int i7 = 0;
                                    while (i7 < arrayList3.size()) {
                                        document = (TLRPC.Document) arrayList3.get(i7);
                                        z = z3;
                                        i2 = i3;
                                        jz3Var = jz3Var2;
                                        if (document.id == stickerSet.thumb_document_id) {
                                            z2 = true;
                                            break;
                                        }
                                        i7++;
                                        z3 = z;
                                        i3 = i2;
                                        jz3Var2 = jz3Var;
                                    }
                                }
                                i2 = i3;
                                jz3Var = jz3Var2;
                                z = z3;
                                if (arrayList3 != null) {
                                    z2 = true;
                                    if (arrayList3.size() >= 1) {
                                        document = (TLRPC.Document) arrayList3.get(0);
                                        if (jz3Var3 == null) {
                                            jz3 jz3Var4 = new jz3(this, getContext(), document);
                                            i(jz3Var4);
                                            this.b.addView(jz3Var4, i2 + i6);
                                            jz3Var3 = jz3Var4;
                                        } else {
                                            jz3Var3.setAnimatedEmojiDocument(document);
                                        }
                                        if (document == null) {
                                            jz3Var3.setStickerThumb(s14Var);
                                        }
                                    }
                                    document = null;
                                    if (jz3Var3 == null) {
                                    }
                                    if (document == null) {
                                    }
                                }
                            }
                            z2 = true;
                            document = null;
                            if (jz3Var3 == null) {
                            }
                            if (document == null) {
                            }
                        }
                        jz3Var3.a = s14Var.i ? 439488310L : null;
                        jz3Var3.g(this.M == i6 ? z2 : false, false);
                        int i8 = this.T;
                        if (i8 == 4) {
                            jz3Var3.a((z || z4) ? null : Boolean.TRUE);
                        } else if (i8 == 6 || i8 == 5 || i8 == 7) {
                            jz3Var3.a(null);
                        } else if (!z && !z4) {
                            jz3Var3.a(Boolean.TRUE);
                        } else if (g(s14Var)) {
                            jz3Var3.a(null);
                        } else {
                            jz3Var3.a(Boolean.FALSE);
                        }
                        i6++;
                        i5 = i;
                        z3 = z;
                        i3 = i2;
                        jz3Var2 = jz3Var;
                    } else if (jz3Var3 == null) {
                        jz3 jz3Var5 = new jz3(this, getContext(), s14Var.j, false);
                        i(jz3Var5);
                        this.b.addView(jz3Var5, i3 + i6);
                    } else {
                        jz3Var3.setDrawable(getResources().getDrawable(s14Var.j).mutate());
                        jz3Var3.d();
                        jz3Var3.a(null);
                    }
                    i = i5;
                    i2 = i3;
                    jz3Var = jz3Var2;
                    z = z3;
                    i6++;
                    i5 = i;
                    z3 = z;
                    i3 = i2;
                    jz3Var2 = jz3Var;
                }
                jz3 jz3Var6 = jz3Var2;
                if (jz3Var6 != null) {
                    jz3Var6.bringToFront();
                    if (jz3Var6.getAlpha() < 1.0f) {
                        jz3Var6.animate().alpha(1.0f).setDuration(oi5.d() ? 0L : 200L).setInterpolator(d53.f).start();
                    }
                }
                for (int i9 = 0; i9 < arrayList2.size(); i9++) {
                    ((jz3) arrayList2.get(i9)).getClass();
                    ((jz3) arrayList2.get(i9)).c();
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

    public void i(jz3 jz3Var) {
    }
}
