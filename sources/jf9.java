// default package

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.net.Uri;
import android.os.Build;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.IdentityHashMap;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final class jf9 extends d implements jm7 {
    public pr2 A0;
    public e34 B0;
    public boolean C0;
    public boolean D0;
    public RectF E;
    public int E0;
    public boolean F;
    public int F0;
    public final int[] G;
    public int G0;
    public int[] H;
    public boolean H0;
    public int[] I;
    public se9 I0;
    public float J;
    public int J0;
    public yv1 K;
    public boolean K0;
    public Runnable L;
    public int L0;
    public Runnable M;
    public boolean M0;
    public boolean N;
    public final Runnable N0;
    public final ArrayList O;
    public ve9 O0;
    public bf9 P;
    public j67 P0;
    public ch9 Q;
    public ValueAnimator Q0;
    public View R;
    public float R0;
    public View S;
    public ne9 S0;
    public FrameLayout T;
    public int T0;
    public ImageView U;
    public int U0;
    public LinearLayout V;
    public int V0;
    public ImageView W;
    public boolean W0;
    public ImageView X;
    public int X0;
    public FrameLayout Y;
    public int Y0;
    public FrameLayout Z;
    public int Z0;
    public final Editable a;
    public FrameLayout a0;
    public boolean a1;
    public final TL_iv.RichMessage b;
    public LinearLayout b0;
    public int c;
    public d02 c0;
    public int d;
    public ImageView d0;
    public boolean e;
    public df9 e0;
    public final String f;
    public LinearLayout f0;
    public final ArrayList g0;
    public CharSequence h;
    public ImageView h0;
    public qmb i0;
    public LinearLayout j0;
    public ef9 k0;
    public int l0;
    public final ArrayList m0;
    public CharSequence n;
    public LinearLayout n0;
    public LinearLayout o0;
    public LinearLayout p0;
    public ff9 q0;
    public k47 r;
    public ff9 r0;
    public va2 s;
    public ff9 s0;
    public ff9 t0;
    public ff9 u0;
    public ff9 v0;
    public ms1 w;
    public FrameLayout w0;
    public final Rect x;
    public s09 x0;
    public im0 y;
    public bu5 y0;
    public vi3 z0;

    public jf9(Editable editable) {
        super(null);
        this.c = -1;
        this.d = -1;
        this.x = new Rect();
        this.G = new int[2];
        this.J = 1.0f;
        this.O = new ArrayList();
        this.g0 = new ArrayList();
        this.l0 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        this.m0 = new ArrayList();
        this.J0 = 0;
        this.L0 = -1;
        this.N0 = new oe9(this, (byte) 0);
        this.a = editable;
    }

    public static String d0(int i) {
        if (i == 1) {
            return jb6.M0(2131754853, null);
        }
        if (i == 2) {
            return jb6.M0(2131754859, null);
        }
        if (i == 4) {
            return jb6.M0(2131754854, null);
        }
        if (i == 7) {
            return jb6.M0(2131754863, null);
        }
        if (i != 9) {
            return null;
        }
        return jb6.M0(2131754868, null);
    }

    public static String f0(int i) {
        if (i == 1) {
            return jb6.M0(2131753636, null);
        }
        if (i == 2) {
            return jb6.M0(2131748844, null);
        }
        if (i == 16) {
            return jb6.M0(2131743576, null);
        }
        if (i == 8) {
            return jb6.M0(2131744122, null);
        }
        if (i == 256) {
            return jb6.M0(2131744951, null);
        }
        if (i == 4) {
            return jb6.M0(2131748107, null);
        }
        if (i == 65536) {
            return jb6.M0(2131749060, null);
        }
        if (i == 16384) {
            return jb6.M0(2131744110, null);
        }
        if (i == 32768) {
            return jb6.M0(2131744012, null);
        }
        return null;
    }

    public static void r0(ylb ylbVar, Context context, final Runnable runnable, final Runnable runnable2) {
        final byte b = 1;
        final byte b2 = 0;
        final my0 h = hg9.h(1, ylbVar, context, false);
        LinearLayout i = hg9.i(context, 1);
        h.O = i;
        ImageView k = td4.k(context, R.drawable.large_article);
        k.setScaleType(ImageView.ScaleType.CENTER);
        int L = gm.L(80.0f);
        int i2 = cmb.Ei;
        ShapeDrawable K = cmb.K(L, cmb.v0(i2, ylbVar));
        wmb M = anb.M(i2);
        k.setBackground(K);
        anb.j(k, K, M, null, ylbVar);
        i.addView(k, qoe.t(80, 80, 1, 0, 18, 0, 0));
        TextView textView = new TextView(context);
        textView.setText(jb6.M0(2131754006, null));
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(gm.o());
        textView.setGravity(17);
        int i3 = cmb.F6;
        anb.X(textView, i3, ylbVar);
        TextView m = wi8.m(i, textView, qoe.t(-1, -2, 49, 25, 16, 25, 0), context);
        m.setText(gm.S2(jb6.M0(2131754007, null)));
        m.setTextSize(1, 14.0f);
        m.setGravity(17);
        anb.X(m, i3, ylbVar);
        i.addView(m, qoe.t(-1, -2, 49, 25, 11, 25, 0));
        b61 i4 = mlb.i(24, ylbVar, context, true);
        i4.setText(jb6.M0(2131754008, null));
        i.addView(i4, qoe.t(-1, 48, 49, 14, 31, 14, 0));
        b61 i5 = mlb.i(24, ylbVar, context, false);
        i5.setText(jb6.M0(2131754009, null));
        i.addView(i5, qoe.t(-1, 48, 49, 14, 2, 14, 6));
        h.show();
        i4.setOnClickListener(new View.OnClickListener() { // from class: re9
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b3 = b2;
                Runnable runnable3 = runnable2;
                my0 my0Var = h;
                switch (b3) {
                    case 0:
                        my0Var.dismiss();
                        runnable3.run();
                        break;
                    default:
                        my0Var.dismiss();
                        runnable3.run();
                        break;
                }
            }
        });
        i5.setOnClickListener(new View.OnClickListener() { // from class: re9
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b3 = b;
                Runnable runnable3 = runnable;
                my0 my0Var = h;
                switch (b3) {
                    case 0:
                        my0Var.dismiss();
                        runnable3.run();
                        break;
                    default:
                        my0Var.dismiss();
                        runnable3.run();
                        break;
                }
            }
        });
    }

    public final void A0() {
        this.s.getLocationInWindow(this.G);
        if (this.E == null) {
            this.E = new RectF();
        }
        RectF rectF = new RectF(this.y.getBounds());
        this.E = rectF;
        rectF.offset(r1[0], r1[1]);
        int[] iArr = this.H;
        if (iArr == null) {
            iArr = new int[2];
            this.H = iArr;
        }
        this.w.getLocationInWindow(iArr);
        int[] iArr2 = this.I;
        if (iArr2 == null) {
            iArr2 = new int[2];
            this.I = iArr2;
        }
        iArr2[0] = this.Q.getPaddingLeft();
        this.I[1] = this.Q.getPaddingTop();
        this.I[0] = (int) (r0[0] - (this.w.F0.getX() - gm.L(16.0f)));
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00bb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void B0() {
        ll0 M2;
        int i;
        int size;
        int i2;
        gkb textSelectionHelper = this.Q.getTextSelectionHelper();
        if (textSelectionHelper == null || !textSelectionHelper.w()) {
            M2 = this.Q.M2();
        } else {
            int i3 = textSelectionHelper.p0;
            M2 = i3 == textSelectionHelper.s0 ? this.Q.A4(i3) : null;
        }
        if (this.Q.N2() == null) {
            if (M2 != null) {
                if (!M2.a() && !M2.b() && !M2.c()) {
                    TL_iv.PageBlock pageBlock = M2.b;
                    if (!(pageBlock instanceof TL_iv.pageBlockDetails)) {
                        if (!(pageBlock instanceof TL_iv.pageBlockTable)) {
                            if (pageBlock instanceof TL_iv.pageBlockDivider) {
                                i = 8;
                            } else if ((pageBlock instanceof TL_iv.pageBlockHeading1) || (pageBlock instanceof TL_iv.pageBlockHeading2) || (pageBlock instanceof TL_iv.pageBlockHeading3) || (pageBlock instanceof TL_iv.pageBlockHeading4) || (pageBlock instanceof TL_iv.pageBlockHeading5) || (pageBlock instanceof TL_iv.pageBlockHeading6) || (pageBlock instanceof TL_iv.pageBlockParagraph) || (pageBlock instanceof TL_iv.pageBlockPreformatted) || (pageBlock instanceof TL_iv.pageBlockBlockquote) || (pageBlock instanceof TL_iv.pageBlockPullquote) || (pageBlock instanceof TL_iv.pageBlockFooter)) {
                                i = 1;
                            } else if ((pageBlock instanceof TL_iv.pageBlockPhoto) || (pageBlock instanceof TL_iv.pageBlockVideo) || (pageBlock instanceof TL_iv.pageBlockCollage) || (pageBlock instanceof TL_iv.pageBlockSlideshow)) {
                                i = 3;
                            } else if ((pageBlock instanceof TL_iv.pageBlockAudio) || (pageBlock instanceof TL_iv.pageBlockDocument)) {
                                i = 5;
                            } else if (pageBlock instanceof TL_iv.pageBlockMap) {
                                i = 6;
                            } else if (pageBlock instanceof TL_iv.pageBlockMath) {
                                i = 7;
                            }
                            ArrayList arrayList = this.g0;
                            size = arrayList.size();
                            i2 = 0;
                            while (i2 < size) {
                                Object obj = arrayList.get(i2);
                                i2++;
                                ff9 ff9Var = (ff9) obj;
                                int intValue = ((Integer) ff9Var.getTag()).intValue();
                                ff9Var.setSelected(i == intValue);
                                if (i == intValue) {
                                    ff9Var.setEnabled(true);
                                    if (M2 == null) {
                                        ff9Var.a();
                                    } else if (i == 1) {
                                        TL_iv.PageBlock pageBlock2 = M2.b;
                                        if (pageBlock2 instanceof TL_iv.pageBlockHeading1) {
                                            ff9Var.e(R.drawable.iv_h1);
                                        } else if (pageBlock2 instanceof TL_iv.pageBlockHeading2) {
                                            ff9Var.e(R.drawable.iv_h2);
                                        } else if (pageBlock2 instanceof TL_iv.pageBlockHeading3) {
                                            ff9Var.e(R.drawable.iv_h3);
                                        } else if (pageBlock2 instanceof TL_iv.pageBlockHeading4) {
                                            ff9Var.e(R.drawable.iv_h4);
                                        } else if (pageBlock2 instanceof TL_iv.pageBlockHeading5) {
                                            ff9Var.e(R.drawable.iv_h5);
                                        } else if (pageBlock2 instanceof TL_iv.pageBlockHeading6) {
                                            ff9Var.e(R.drawable.iv_h6);
                                        } else if (pageBlock2 instanceof TL_iv.pageBlockPreformatted) {
                                            ff9Var.e(R.drawable.iv_code);
                                        } else if (pageBlock2 instanceof TL_iv.pageBlockBlockquote) {
                                            ff9Var.e(R.drawable.iv_quote);
                                        } else if (pageBlock2 instanceof TL_iv.pageBlockPullquote) {
                                            ff9Var.e(R.drawable.iv_pullquote);
                                        } else if (pageBlock2 instanceof TL_iv.pageBlockFooter) {
                                            ff9Var.e(R.drawable.iv_footer);
                                        } else {
                                            ff9Var.a();
                                        }
                                    } else if (i == 2) {
                                        if (M2.a()) {
                                            ff9Var.e(R.drawable.iv_todo);
                                        } else if (M2.c()) {
                                            ff9Var.e(R.drawable.iv_ordered_list);
                                        } else {
                                            ff9Var.a();
                                        }
                                    } else if (i == 8) {
                                        ff9Var.e(R.drawable.iv_details);
                                    } else {
                                        ff9Var.a();
                                    }
                                } else {
                                    ff9Var.setEnabled(i != 4);
                                    ff9Var.a();
                                }
                            }
                        }
                    }
                }
                i = 2;
                ArrayList arrayList2 = this.g0;
                size = arrayList2.size();
                i2 = 0;
                while (i2 < size) {
                }
            }
            i = 0;
            ArrayList arrayList22 = this.g0;
            size = arrayList22.size();
            i2 = 0;
            while (i2 < size) {
            }
        }
        i = 4;
        ArrayList arrayList222 = this.g0;
        size = arrayList222.size();
        i2 = 0;
        while (i2 < size) {
        }
    }

    public final void C0(int i, boolean z) {
        if (this.L0 == i) {
            return;
        }
        this.L0 = i;
        LinearLayout linearLayout = this.b0;
        if (z) {
            linearLayout.setVisibility(0);
            ViewPropertyAnimator duration = this.b0.animate().alpha(this.L0 == 0 ? 1.0f : 0.0f).scaleX(this.L0 == 0 ? 1.0f : 0.8f).scaleY(this.L0 == 0 ? 1.0f : 0.8f).translationY(this.L0 == 0 ? 0.0f : gm.L(30.0f)).setDuration(420L);
            d53 d53Var = d53.h;
            duration.setInterpolator(d53Var).withEndAction(new oe9(this, (byte) 1)).start();
            this.i0.setVisibility(0);
            this.i0.animate().alpha(this.L0 == 1 ? 1.0f : 0.0f).scaleX(this.L0 == 1 ? 1.0f : 0.8f).scaleY(this.L0 == 1 ? 1.0f : 0.8f).translationY(this.L0 == 1 ? 0.0f : gm.L(30.0f)).setDuration(420L).setInterpolator(d53Var).withEndAction(new oe9(this, (byte) 2)).start();
            this.w0.setVisibility(0);
            this.w0.animate().alpha(this.L0 == 2 ? 1.0f : 0.0f).scaleX(this.L0 == 2 ? 1.0f : 0.8f).scaleY(this.L0 == 2 ? 1.0f : 0.8f).setDuration(420L).setInterpolator(d53Var).withEndAction(new oe9(this, (byte) 3)).start();
            return;
        }
        linearLayout.setVisibility(i == 0 ? 0 : 8);
        this.b0.setAlpha(i == 0 ? 1.0f : 0.0f);
        this.b0.setScaleX(i == 0 ? 1.0f : 0.8f);
        this.b0.setScaleY(i == 0 ? 1.0f : 0.8f);
        this.b0.setTranslationY(i == 0 ? 0.0f : gm.L(30.0f));
        this.i0.setVisibility(i == 1 ? 0 : 8);
        this.i0.setAlpha(i == 1 ? 1.0f : 0.0f);
        this.i0.setScaleX(i == 1 ? 1.0f : 0.8f);
        this.i0.setScaleY(i == 1 ? 1.0f : 0.8f);
        this.i0.setTranslationY(i == 1 ? 0.0f : gm.L(30.0f));
        this.w0.setVisibility(i != 2 ? 8 : 0);
        this.w0.setAlpha(i == 2 ? 1.0f : 0.0f);
        this.w0.setScaleX(i == 2 ? 1.0f : 0.8f);
        this.w0.setScaleY(i == 2 ? 1.0f : 0.8f);
    }

    public final void D0() {
        boolean z;
        boolean z2;
        int max;
        int max2;
        gkb textSelectionHelper = this.Q.getTextSelectionHelper();
        ArrayList arrayList = this.m0;
        if (arrayList.isEmpty() || textSelectionHelper == null || !textSelectionHelper.w()) {
            return;
        }
        ff9 ff9Var = this.v0;
        boolean z3 = false;
        if (ff9Var != null) {
            ch9 ch9Var = this.Q;
            int[] D4 = ch9Var.D4();
            ff9Var.setSelected(D4 != null && ch9Var.D3(D4[0], D4[1]));
        }
        boolean H3 = this.Q.H3();
        ch9 ch9Var2 = this.Q;
        if (H3) {
            gkb textSelectionHelper2 = ch9Var2.getTextSelectionHelper();
            int i = textSelectionHelper2.p0;
            int i2 = textSelectionHelper2.q0;
            int i3 = textSelectionHelper2.t0;
            int i4 = textSelectionHelper2.r0;
            int i5 = textSelectionHelper2.u0;
            int size = arrayList.size();
            int i6 = 0;
            while (i6 < size) {
                Object obj = arrayList.get(i6);
                i6++;
                ff9 ff9Var2 = (ff9) obj;
                ff9Var2.setSelected(this.Q.G3(((Integer) ff9Var2.getTag()).intValue(), i, i2, i4, i3, i5));
            }
            boolean z4 = i2 == i3;
            ne9 Q4 = z4 ? this.Q.Q4(i, i2) : null;
            int max3 = Math.max(0, Math.min(i4, i5));
            int max4 = Q4 == null ? 0 : Math.max(0, Math.min(Math.max(i4, i5), Q4.length()));
            ff9 ff9Var3 = this.r0;
            if (ff9Var3 != null) {
                ff9Var3.setSelected(Q4 != null && max3 < max4 && zk9.h(Q4.getText(), max3, max4));
            }
            ff9 ff9Var4 = this.t0;
            if (ff9Var4 != null) {
                if (Q4 != null && max3 < max4 && zk9.g(Q4.getText(), max3, max4)) {
                    z3 = true;
                }
                ff9Var4.setSelected(z3);
            }
            x0(true);
            y0(z4, this.Q.g2());
            return;
        }
        if (ch9Var2.s3()) {
            gkb textSelectionHelper3 = this.Q.getTextSelectionHelper();
            ne9 o2 = this.Q.o2(textSelectionHelper3.p0);
            int i7 = textSelectionHelper3.r0;
            int i8 = textSelectionHelper3.u0;
            if (o2 == null) {
                max2 = 0;
                max = 0;
            } else {
                max = Math.max(0, Math.min(Math.min(i7, i8), o2.length()));
                max2 = Math.max(0, Math.min(Math.max(i7, i8), o2.length()));
            }
            int size2 = arrayList.size();
            int i9 = 0;
            while (i9 < size2) {
                Object obj2 = arrayList.get(i9);
                i9++;
                ff9 ff9Var5 = (ff9) obj2;
                ff9Var5.setSelected((o2 == null || max >= max2 || (o2.c(max, max2) & ((Integer) ff9Var5.getTag()).intValue()) == 0) ? false : true);
            }
            ff9 ff9Var6 = this.r0;
            if (ff9Var6 != null) {
                ff9Var6.setSelected(o2 != null && max < max2 && zk9.h(o2.getText(), max, max2));
            }
            ff9 ff9Var7 = this.t0;
            if (ff9Var7 != null) {
                if (o2 != null && max < max2 && zk9.g(o2.getText(), max, max2)) {
                    z3 = true;
                }
                ff9Var7.setSelected(z3);
            }
            x0(true);
            y0(true, this.Q.g2());
            return;
        }
        int i10 = textSelectionHelper.p0;
        int i11 = textSelectionHelper.s0;
        int i12 = textSelectionHelper.r0;
        int i13 = textSelectionHelper.u0;
        boolean z5 = i10 >= 0 && i11 >= 0 && i11 >= i10 && i11 < this.Q.x4.size();
        int size3 = arrayList.size();
        int i14 = 0;
        while (i14 < size3) {
            int i15 = i14 + 1;
            ff9 ff9Var8 = (ff9) arrayList.get(i14);
            ff9Var8.setSelected(z5 && this.Q.F3(((Integer) ff9Var8.getTag()).intValue(), i10, i12, i11, i13));
            i14 = i15;
        }
        x0(!this.Q.E3());
        ff9 ff9Var9 = this.r0;
        if (ff9Var9 != null) {
            if (z5) {
                Editable J4 = this.Q.J4(i10, i12, i11, i13);
                if (J4 == null ? false : zk9.h(J4, Math.max(0, Math.min(i12, i13)), Math.max(i12, i13))) {
                    z2 = true;
                    ff9Var9.setSelected(z2);
                }
            }
            z2 = false;
            ff9Var9.setSelected(z2);
        }
        ff9 ff9Var10 = this.t0;
        if (ff9Var10 != null) {
            if (z5) {
                Editable J42 = this.Q.J4(i10, i12, i11, i13);
                if (J42 == null ? false : zk9.g(J42, Math.max(0, Math.min(i12, i13)), Math.max(i12, i13))) {
                    z = true;
                    ff9Var10.setSelected(z);
                }
            }
            z = false;
            ff9Var10.setSelected(z);
        }
        if (z5 && i10 == i11) {
            z3 = true;
        }
        y0(z3, this.Q.g2());
    }

    public final void E0() {
        boolean m2 = this.Q.m2();
        of9 of9Var = this.Q.R3;
        boolean z = (of9Var == null || of9Var.c.isEmpty()) ? false : true;
        ImageView imageView = this.W;
        if (imageView != null) {
            imageView.setEnabled(m2);
            this.W.setAlpha(m2 ? 1.0f : 0.35f);
        }
        ImageView imageView2 = this.X;
        if (imageView2 != null) {
            imageView2.setEnabled(z);
            this.X.setAlpha(z ? 1.0f : 0.35f);
        }
    }

    public final void F0() {
        int i = 0;
        boolean z = (oc7.r1(this.currentAccount).x4() || z8c.h(this.currentAccount).p()) ? false : true;
        ArrayList arrayList = this.O;
        int size = arrayList.size();
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((ff9) obj).setPremiumLocked(z);
        }
    }

    public final void G0() {
        if (this.z0 == null) {
            return;
        }
        boolean I3 = this.Q.I3();
        this.z0.setEnabled(I3);
        wi8.s(this.z0.animate(), I3 ? 1.0f : 0.5f, 150L);
    }

    public final ff9 Z(int i, int i2, boolean z) {
        ff9 ff9Var = new ff9(i, getResourceProvider(), this.f0.getContext());
        if (z) {
            ff9Var.d();
            this.O.add(ff9Var);
        }
        ff9Var.setTag(Integer.valueOf(i2));
        ff9Var.setContentDescription(d0(i2));
        this.g0.add(ff9Var);
        LinearLayout linearLayout = this.f0;
        linearLayout.addView(ff9Var, qoe.t(38, 38, 16, linearLayout.getChildCount() == 0 ? 0 : 2, 0, 0, 0));
        return ff9Var;
    }

    public final void a0(Context context, int i, int i2, boolean z) {
        ff9 ff9Var = new ff9(i, getResourceProvider(), context);
        if (z) {
            ff9Var.d();
            this.O.add(ff9Var);
        }
        ff9Var.setTag(Integer.valueOf(i2));
        ff9Var.setContentDescription(f0(i2));
        ff9Var.setOnClickListener(new v0(this, i2, (byte) 21));
        this.m0.add(ff9Var);
        LinearLayout linearLayout = this.j0;
        linearLayout.addView(ff9Var, qoe.t(38, 38, 16, linearLayout.getChildCount() > 0 ? 2 : 0, 0, 0, 0));
    }

    public final void b0(boolean z) {
        ValueAnimator valueAnimator = this.Q0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.Q0 = null;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.R0, z ? 1.0f : 0.0f);
        this.Q0 = ofFloat;
        ofFloat.addUpdateListener(new qe9(this, (byte) 0));
        this.Q0.setInterpolator(d53.h);
        this.Q0.setDuration(250L);
        this.Q0.start();
    }

    public final void c0() {
        FrameLayout.LayoutParams layoutParams;
        e34 e34Var = this.B0;
        if (e34Var == null || (layoutParams = (FrameLayout.LayoutParams) e34Var.getLayoutParams()) == null) {
            return;
        }
        int round = Math.round((((this.P == null ? g0() : Math.max(g0(), ((r2.getMeasuredHeight() - this.P.getPaddingTop()) - gm.L(240.0f)) - this.U0)) - r1) * this.R0) + g0());
        if (layoutParams.height != round) {
            layoutParams.height = round;
            this.B0.setLayoutParams(layoutParams);
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final View createView(Context context) {
        byte b = 0;
        this.actionBar.setCastShadows(false);
        this.actionBar.setAddToContainer(false);
        ArrayList arrayList = this.O;
        arrayList.clear();
        this.P = new bf9(this, context);
        byte b2 = 1;
        setHasOwnBackground(true);
        this.P.setFocusable(true);
        this.P.setFocusableInTouchMode(true);
        if (Build.VERSION.SDK_INT >= 26) {
            this.P.setDefaultFocusHighlightEnabled(false);
        }
        this.F0 = oc7.c1().getInt("kbd_height", gm.L(200.0f));
        this.G0 = oc7.c1().getInt("kbd_height_land3", gm.L(200.0f));
        se9 se9Var = new se9();
        this.I0 = se9Var;
        this.P.r.add(se9Var);
        ch9 ch9Var = new ch9(context, this.currentAccount, getResourceProvider(), new cf9(this, b));
        this.Q = ch9Var;
        ch9Var.setFileRefParentObject(this.r);
        this.P.addView(this.Q, qoe.e(-1, -1, nm7.D1));
        this.P.addView(this.Q.getOverlayView(), qoe.c(-1.0f, -1));
        TL_iv.RichMessage richMessage = this.b;
        if (richMessage != null) {
            ch9 ch9Var2 = this.Q;
            ArrayList arrayList2 = ch9Var2.t3;
            ch9Var2.s3 = richMessage;
            ch9.S2(arrayList2, richMessage.blocks, ch9Var2.u3);
            ch9Var2.S3();
            for (int i = 0; i < arrayList2.size(); i++) {
                ch9Var2.w4((ll0) arrayList2.get(i));
            }
            ch9Var2.g3.O(false);
        } else {
            String str = this.f;
            if (str != null) {
                ch9 ch9Var3 = this.Q;
                CharSequence charSequence = this.h;
                CharSequence charSequence2 = this.n;
                HashMap hashMap = ch9Var3.u3;
                ArrayList arrayList3 = ch9Var3.t3;
                if (!TextUtils.isEmpty(charSequence)) {
                    ch9.S2(arrayList3, hi9.b(charSequence), hashMap);
                }
                arrayList3.addAll(ch9Var3.x4(jh9.z(str, hashMap)));
                if (!TextUtils.isEmpty(charSequence2)) {
                    ch9.S2(arrayList3, hi9.b(charSequence2), hashMap);
                }
                ch9Var3.S3();
                ch9Var3.g3.O(false);
            } else {
                Editable editable = this.a;
                if (editable != null) {
                    this.Q.setInitialText(editable);
                }
            }
        }
        of9 of9Var = this.Q.R3;
        if (of9Var != null) {
            of9Var.j();
        }
        View view = new View(context);
        this.R = view;
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
        int i2 = cmb.c6;
        view.setBackground(new GradientDrawable(orientation, new int[]{getThemedColor(i2), cmb.p1(0.0f, getThemedColor(i2))}));
        this.P.addView(this.R, qoe.e(-1, 68, 55));
        View view2 = new View(context);
        this.S = view2;
        view2.setBackground(new GradientDrawable(orientation, new int[]{cmb.p1(0.0f, getThemedColor(i2)), getThemedColor(i2)}));
        this.P.addView(this.S, qoe.e(-1, 68, 87));
        FrameLayout frameLayout = new FrameLayout(context);
        this.T = frameLayout;
        frameLayout.setClipChildren(false);
        this.T.setClipToPadding(false);
        this.P.addView(this.T, qoe.e(-1, 68, 55));
        ImageView imageView = new ImageView(context);
        this.U = imageView;
        imageView.setImageResource(R.drawable.ic_ab_back);
        ImageView imageView2 = this.U;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView2.setScaleType(scaleType);
        ImageView imageView3 = this.U;
        int themedColor = getThemedColor(i2);
        int themedColor2 = getThemedColor(i2);
        int i3 = cmb.h6;
        imageView3.setBackground(new if9(cmb.Z(themedColor, cmb.v(themedColor2, getThemedColor(i3)), gm.L(22.0f), gm.L(22.0f))));
        ImageView imageView4 = this.U;
        int i4 = cmb.F6;
        ylb resourceProvider = getResourceProvider();
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        anb.s(imageView4, i4, resourceProvider, mode);
        rve.a(this.U);
        this.U.setContentDescription(jb6.M0(2131754878, null));
        this.U.setOnClickListener(new pe9(this, b2));
        this.T.addView(this.U, qoe.d(44, 44.0f, 51, 8.0f, 8.0f, 8.0f, 8.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.V = linearLayout;
        linearLayout.setOrientation(0);
        this.V.setBackground(new if9(cmb.b0(gm.L(22.0f), getThemedColor(i2))));
        this.T.addView(this.V, qoe.d(82, 44.0f, 53, 8.0f, 8.0f, 8.0f, 8.0f));
        ImageView imageView5 = new ImageView(context);
        this.W = imageView5;
        imageView5.setImageResource(R.drawable.iv_undo);
        this.W.setScaleType(scaleType);
        anb.R(this.W, cmb.f0(getThemedColor(i3), 1, -1), null, anb.M(i3), getResourceProvider());
        anb.s(this.W, i4, getResourceProvider(), mode);
        rve.a(this.W);
        this.W.setContentDescription(jb6.M0(2131743574, null));
        this.W.setOnClickListener(new pe9(this, (byte) 2));
        this.V.addView(this.W, qoe.r(41, 41, 16));
        ImageView imageView6 = new ImageView(context);
        this.X = imageView6;
        imageView6.setImageResource(R.drawable.iv_redo);
        this.X.setScaleType(scaleType);
        anb.R(this.X, cmb.f0(getThemedColor(i3), 1, -1), null, anb.M(i3), getResourceProvider());
        anb.s(this.X, i4, getResourceProvider(), mode);
        rve.a(this.X);
        this.X.setContentDescription(jb6.M0(2131746075, null));
        this.X.setOnClickListener(new pe9(this, (byte) 3));
        this.V.addView(this.X, qoe.r(41, 41, 16));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.Z = frameLayout2;
        frameLayout2.setClipChildren(false);
        this.Z.setClipToPadding(false);
        this.P.addView(this.Z, qoe.e(-1, nm7.p2, 87));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.a0 = frameLayout3;
        frameLayout3.setClipChildren(false);
        this.a0.setClipToPadding(false);
        this.Z.addView(this.a0, qoe.e(-1, nm7.p2, 87));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.b0 = linearLayout2;
        linearLayout2.setClipToPadding(false);
        this.b0.setClipChildren(false);
        this.b0.setPadding(gm.L(8.0f), gm.L(8.0f), gm.L(8.0f), gm.L(8.0f));
        this.a0.addView(this.b0, qoe.e(-1, 60, 87));
        FrameLayout frameLayout4 = new FrameLayout(context);
        this.Y = frameLayout4;
        this.a0.addView(frameLayout4, qoe.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, 60.0f));
        ImageView imageView7 = new ImageView(context);
        this.d0 = imageView7;
        imageView7.setImageDrawable(new hd(context));
        this.d0.setScaleType(scaleType);
        anb.s(this.d0, i4, getResourceProvider(), mode);
        this.d0.setBackground(new if9(cmb.Z(getThemedColor(i2), cmb.v(getThemedColor(i2), getThemedColor(i3)), gm.L(22.0f), gm.L(22.0f))));
        this.b0.addView(this.d0, qoe.q(44, 44, 0.0f, 19, 0, 0, 8, 0));
        rve.a(this.d0);
        this.d0.setContentDescription(jb6.M0(2131755006, null));
        this.d0.setOnClickListener(new pe9(this, (byte) 4));
        FrameLayout frameLayout5 = new FrameLayout(context);
        frameLayout5.setClipToPadding(false);
        frameLayout5.setClipChildren(false);
        FrameLayout frameLayout6 = new FrameLayout(context);
        frameLayout6.setBackground(new if9(cmb.b0(gm.L(22.0f), getThemedColor(i2))));
        frameLayout5.addView(frameLayout6, qoe.e(-2, 44, 81));
        df9 df9Var = new df9(context, (byte) 0);
        this.e0 = df9Var;
        df9Var.setClipToOutline(true);
        this.e0.setOutlineProvider(new xj((byte) 14));
        LinearLayout linearLayout3 = new LinearLayout(context);
        this.f0 = linearLayout3;
        linearLayout3.setPadding(gm.L(2.0f), 0, gm.L(2.0f), 0);
        this.f0.setOrientation(0);
        this.e0.addView(this.f0);
        frameLayout6.addView(this.e0, qoe.c(-1.0f, -1));
        d02 d02Var = new d02(context, 24);
        this.c0 = d02Var;
        d02Var.setPadding(gm.L(7.0f), gm.L(7.0f), gm.L(7.0f), gm.L(7.0f));
        anb.s(this.c0, i4, getResourceProvider(), mode);
        anb.R(this.c0, cmb.Z(getThemedColor(i2), getThemedColor(i3), gm.L(20.0f), gm.L(20.0f)), anb.M(i2), anb.M(i3), getResourceProvider());
        this.c0.j(b02.e, false);
        this.f0.addView(this.c0, qoe.r(38, 38, 16));
        rve.a(this.c0);
        this.c0.setContentDescription(jb6.M0(2131754884, null));
        this.c0.setOnClickListener(new pe9(this, (byte) 5));
        Z(R.drawable.iv_text, 1, false).setOnClickListener(new r39(this, context, (byte) 3));
        Z(R.drawable.iv_lists, 2, true).setOnClickListener(new pe9(this, (byte) 6));
        Z(R.drawable.iv_table, 4, true).setOnClickListener(new pe9(this, (byte) 7));
        Z(R.drawable.iv_math, 7, true).setOnClickListener(new pe9(this, (byte) 8));
        ImageView imageView8 = new ImageView(context);
        this.h0 = imageView8;
        imageView8.setImageResource(R.drawable.outline_poll_attach_24);
        this.h0.setScaleType(scaleType);
        anb.s(this.h0, i4, getResourceProvider(), mode);
        anb.R(this.h0, cmb.Z(getThemedColor(i2), getThemedColor(i3), gm.L(20.0f), gm.L(20.0f)), anb.M(i2), anb.M(i3), getResourceProvider());
        this.f0.addView(this.h0, qoe.t(38, 38, 16, 2, 0, 0, 0));
        rve.a(this.h0);
        this.h0.setContentDescription(jb6.M0(2131754921, null));
        this.h0.setOnClickListener(new pe9(this, (byte) 9));
        this.b0.addView(frameLayout5, qoe.l(1.0f, 0, 44));
        qmb qmbVar = new qmb((byte) 13, context, this);
        this.i0 = qmbVar;
        qmbVar.setOrientation(0);
        this.i0.setClipToPadding(false);
        this.i0.setClipChildren(false);
        this.i0.setPadding(gm.L(8.0f), gm.L(8.0f), gm.L(8.0f), gm.L(8.0f));
        this.Z.addView(this.i0, qoe.e(-2, 60, 81));
        FrameLayout frameLayout7 = new FrameLayout(context);
        this.w0 = frameLayout7;
        frameLayout7.setClipChildren(false);
        this.w0.setClipToPadding(false);
        this.w0.setPadding(gm.L(8.0f), gm.L(8.0f), gm.L(8.0f), gm.L(8.0f));
        this.Z.addView(this.w0, qoe.e(80, 60, 81));
        s09 s09Var = new s09(context);
        this.x0 = s09Var;
        s09Var.f(R.raw.group_pip_delete_icon, gm.L(16.0f), gm.L(16.0f), null);
        p09 animatedDrawable = this.x0.getAnimatedDrawable();
        if (animatedDrawable != null) {
            animatedDrawable.h = true;
            animatedDrawable.F(0);
            animatedDrawable.K(0);
        }
        this.x0.setScaleType(scaleType);
        anb.s(this.x0, i4, getResourceProvider(), mode);
        this.x0.setBackground(new if9(cmb.b0(gm.L(22.0f), getThemedColor(i2))));
        this.w0.addView(this.x0, qoe.e(-1, -1, nm7.D1));
        FrameLayout frameLayout8 = new FrameLayout(context);
        frameLayout8.setBackground(new if9(cmb.b0(gm.L(22.0f), getThemedColor(i2))));
        this.i0.addView(frameLayout8, qoe.c(44.0f, -2));
        ef9 ef9Var = new ef9(this, context);
        this.k0 = ef9Var;
        ef9Var.setHorizontalScrollBarEnabled(false);
        this.k0.setClipToOutline(true);
        byte b3 = 15;
        this.k0.setOutlineProvider(new xj(b3));
        frameLayout8.addView(this.k0, qoe.c(-1.0f, -1));
        LinearLayout linearLayout4 = new LinearLayout(context);
        this.j0 = linearLayout4;
        linearLayout4.setOrientation(0);
        this.j0.setPadding(gm.L(2.0f), 0, gm.L(2.0f), 0);
        this.k0.addView(this.j0, new FrameLayout.LayoutParams(-2, -1));
        a0(context, R.drawable.formatting_bold, 1, false);
        a0(context, R.drawable.formatting_italic, 2, false);
        a0(context, R.drawable.formatting_underline, 16, false);
        a0(context, R.drawable.formatting_strikethrough, 8, false);
        a0(context, R.drawable.formatting_spoiler, 256, false);
        a0(context, R.drawable.iv_code, 4, false);
        a0(context, R.drawable.formatting_marked, 65536, true);
        a0(context, R.drawable.iv_sub, TLObject.FLAG_14, true);
        a0(context, R.drawable.iv_super, 32768, true);
        ff9 ff9Var = new ff9(R.drawable.iv_quote, getResourceProvider(), context);
        this.v0 = ff9Var;
        ff9Var.setContentDescription(jb6.M0(2131746173, null));
        this.v0.setOnClickListener(new pe9(this, (byte) 11));
        LinearLayout linearLayout5 = this.j0;
        linearLayout5.addView(this.v0, qoe.t(38, 38, 16, linearLayout5.getChildCount() > 0 ? 2 : 0, 0, 0, 0));
        ff9 ff9Var2 = new ff9(R.drawable.iv_button, getResourceProvider(), context);
        this.s0 = ff9Var2;
        ff9Var2.setContentDescription(jb6.M0(2131745744, null));
        this.s0.setOnClickListener(new pe9(this, (byte) 12));
        LinearLayout linearLayout6 = this.j0;
        linearLayout6.addView(this.s0, qoe.t(38, 38, 16, linearLayout6.getChildCount() > 0 ? 2 : 0, 0, 0, 0));
        LinearLayout linearLayout7 = new LinearLayout(context);
        this.o0 = linearLayout7;
        linearLayout7.setOrientation(0);
        this.o0.setPadding(gm.L(2.0f), 0, gm.L(2.0f), 0);
        this.o0.setBackground(new if9(cmb.b0(gm.L(22.0f), getThemedColor(i2))));
        this.i0.addView(this.o0, qoe.d(-2, 44.0f, 80, 8.0f, 0.0f, 0.0f, 0.0f));
        ff9 ff9Var3 = new ff9(R.drawable.media_link_24, getResourceProvider(), context);
        this.r0 = ff9Var3;
        ff9Var3.setContentDescription(jb6.M0(2131751681, null));
        this.r0.setOnClickListener(new pe9(this, (byte) 13));
        this.o0.addView(this.r0, qoe.r(38, 38, 16));
        ff9 ff9Var4 = new ff9(R.drawable.msg_calendar2, getResourceProvider(), context);
        this.t0 = ff9Var4;
        ff9Var4.setContentDescription(jb6.M0(2131754861, null));
        this.t0.setOnClickListener(new pe9(this, (byte) 14));
        this.o0.addView(this.t0, qoe.r(38, 38, 16));
        LinearLayout linearLayout8 = new LinearLayout(context);
        this.p0 = linearLayout8;
        linearLayout8.setOrientation(0);
        this.p0.setPadding(gm.L(2.0f), 0, gm.L(2.0f), 0);
        this.p0.setBackground(new if9(cmb.b0(gm.L(22.0f), getThemedColor(i2))));
        this.i0.addView(this.p0, qoe.d(-2, 44.0f, 80, 8.0f, 0.0f, 0.0f, 0.0f));
        ff9 ff9Var5 = new ff9(R.drawable.iv_math, getResourceProvider(), context);
        this.u0 = ff9Var5;
        ff9Var5.d();
        arrayList.add(this.u0);
        this.u0.setContentDescription(jb6.M0(2131754863, null));
        this.u0.setOnClickListener(new pe9(this, b3));
        this.p0.addView(this.u0, qoe.r(38, 38, 16));
        LinearLayout linearLayout9 = new LinearLayout(context);
        this.n0 = linearLayout9;
        linearLayout9.setOrientation(0);
        this.n0.setPadding(gm.L(2.0f), 0, gm.L(2.0f), 0);
        this.n0.setBackground(new if9(cmb.b0(gm.L(22.0f), getThemedColor(i2))));
        this.i0.addView(this.n0, 0, qoe.d(-2, 44.0f, 80, 0.0f, 0.0f, 8.0f, 0.0f));
        ff9 ff9Var6 = new ff9(0, getResourceProvider(), context);
        this.q0 = ff9Var6;
        ff9Var6.setImageDrawable(new hd(context));
        this.q0.setContentDescription(jb6.M0(2131755006, null));
        this.q0.setOnClickListener(new pe9(this, (byte) 16));
        this.n0.addView(this.q0, qoe.r(38, 38, 16));
        vi3 vi3Var = new vi3(this, context, this.r != null ? R.drawable.input_done : i0() ? R.drawable.input_schedule : R.drawable.send_plane_24, getResourceProvider());
        this.z0 = vi3Var;
        vi3Var.setBackground(new if9(cmb.b0(gm.L(22.0f), getThemedColor(cmb.Oe))));
        rve.a(this.z0);
        this.b0.addView(this.z0, qoe.q(44, 44, 0.0f, 5, 8, 0, 0, 0));
        this.z0.setContentDescription(jb6.M0(2131745374, null));
        this.z0.setOnClickListener(new pe9(this, b));
        this.z0.setOnLongClickListener(new au(this, (byte) 13));
        vi3 vi3Var2 = this.z0;
        if (vi3Var2 != null) {
            vi3Var2.setLocked(j0());
        }
        this.P.setPadding(0, gm.m, 0, 0);
        e0();
        C0(0, false);
        E0();
        this.P.getViewTreeObserver().addOnGlobalFocusChangeListener(new i82(this, (byte) 2));
        F0();
        if (this.e) {
            this.Q.y2();
            this.e = false;
        }
        bf9 bf9Var = this.P;
        this.fragmentView = bf9Var;
        return bf9Var;
    }

    @Override // jm7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == nm7.j5) {
            vi3 vi3Var = this.z0;
            if (vi3Var != null) {
                vi3Var.setLocked(j0());
            }
            F0();
        }
    }

    public final void e0() {
        FrameLayout.LayoutParams layoutParams;
        e34 e34Var = this.B0;
        if (e34Var != null && (layoutParams = (FrameLayout.LayoutParams) e34Var.getLayoutParams()) != null) {
            int i = layoutParams.bottomMargin;
            int i2 = this.U0;
            if (i != i2) {
                layoutParams.bottomMargin = i2;
                this.B0.setLayoutParams(layoutParams);
            }
        }
        c0();
        int max = Math.max(Math.max(this.E0, this.U0), this.V0);
        this.Q.setPadding(0, gm.L(60.0f), 0, gm.L(110.0f) + max);
        ch9 ch9Var = this.Q;
        int i3 = this.U0;
        int i4 = this.V0;
        int i5 = this.E0;
        ch9Var.W3 = i3;
        ch9Var.X3 = i4;
        ch9Var.Y3 = i5;
        this.Z.setTranslationY(-max);
        this.S.setTranslationY(r0 + this.U0);
    }

    public final int g0() {
        Point point = gm.q;
        int i = point.x > point.y ? this.G0 : this.F0;
        return i <= 0 ? gm.L(200.0f) : i;
    }

    public final void h0(boolean z) {
        if (this.D0) {
            this.D0 = false;
            e34 e34Var = this.B0;
            if (e34Var != null) {
                e34Var.r(false);
                this.B0.y();
            }
        }
        ValueAnimator valueAnimator = this.Q0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.Q0 = null;
        }
        this.R0 = 0.0f;
        this.S0 = null;
        e34 e34Var2 = this.B0;
        if (e34Var2 != null) {
            e34Var2.setTranslationY(0.0f);
            this.B0.setVisibility(8);
        }
        if (this.C0 || this.E0 != 0) {
            this.C0 = false;
            this.E0 = 0;
            e0();
        }
        d02 d02Var = this.c0;
        if (d02Var != null) {
            d02Var.j(b02.e, z);
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean hideKeyboardOnShow() {
        return false;
    }

    public final boolean i0() {
        yv1 yv1Var;
        return this.r == null && (yv1Var = this.K) != null && yv1Var.X7();
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        ch9 ch9Var = this.Q;
        if (ch9Var == null || !ch9Var.v3.w()) {
            return super.isSwipeBackEnabled(motionEvent);
        }
        return false;
    }

    public final boolean j0() {
        if (oc7.r1(this.currentAccount).x4() || z8c.h(this.currentAccount).p()) {
            return false;
        }
        ch9 ch9Var = this.Q;
        return hi9.d(ch9Var.t3, ch9Var.u3);
    }

    public final void k0(Context context, View view) {
        bu5 bu5Var = this.y0;
        if (bu5Var != null) {
            bu5Var.u();
            this.y0 = null;
        }
        final byte b = 0;
        final byte b2 = 1;
        boolean z = (oc7.r1(this.currentAccount).x4() || z8c.h(this.currentAccount).p()) ? false : true;
        final ll0 M2 = this.Q.M2();
        final bu5 J = bu5.J(this, view);
        J.T = true;
        bu5 K = J.K();
        K.b(R.drawable.ic_ab_back, jb6.M0(2131753721, null), new bo1(J, (byte) 9), false);
        K.j();
        K.i(M2 != null && (M2.b instanceof TL_iv.pageBlockHeading1), R.drawable.iv_h1, null, jb6.M0(2131753995, null), new Runnable(this) { // from class: ue9
            public final /* synthetic */ jf9 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                byte b3 = b;
                bu5 bu5Var2 = J;
                ll0 ll0Var = M2;
                jf9 jf9Var = this.b;
                switch (b3) {
                    case 0:
                        jf9Var.Q.Y4(ll0Var, new TL_iv.pageBlockHeading1());
                        bu5Var2.u();
                        break;
                    case 1:
                        jf9Var.Q.Y4(ll0Var, new TL_iv.pageBlockHeading2());
                        bu5Var2.u();
                        break;
                    case 2:
                        jf9Var.Q.Y4(ll0Var, new TL_iv.pageBlockHeading3());
                        bu5Var2.u();
                        break;
                    case 3:
                        jf9Var.Q.Y4(ll0Var, new TL_iv.pageBlockHeading4());
                        bu5Var2.u();
                        break;
                    case 4:
                        jf9Var.Q.Y4(ll0Var, new TL_iv.pageBlockHeading5());
                        bu5Var2.u();
                        break;
                    default:
                        jf9Var.Q.Y4(ll0Var, new TL_iv.pageBlockHeading6());
                        bu5Var2.u();
                        break;
                }
            }
        });
        K.z().a.setTypeface(gm.n1("fonts/mw_bold.ttf"));
        final byte b3 = 2;
        K.z().a.setTextSize(1, gda.S0 + 2);
        K.i(M2 != null && (M2.b instanceof TL_iv.pageBlockHeading2), R.drawable.iv_h2, null, jb6.M0(2131753994, null), new Runnable(this) { // from class: ue9
            public final /* synthetic */ jf9 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                byte b32 = b2;
                bu5 bu5Var2 = J;
                ll0 ll0Var = M2;
                jf9 jf9Var = this.b;
                switch (b32) {
                    case 0:
                        jf9Var.Q.Y4(ll0Var, new TL_iv.pageBlockHeading1());
                        bu5Var2.u();
                        break;
                    case 1:
                        jf9Var.Q.Y4(ll0Var, new TL_iv.pageBlockHeading2());
                        bu5Var2.u();
                        break;
                    case 2:
                        jf9Var.Q.Y4(ll0Var, new TL_iv.pageBlockHeading3());
                        bu5Var2.u();
                        break;
                    case 3:
                        jf9Var.Q.Y4(ll0Var, new TL_iv.pageBlockHeading4());
                        bu5Var2.u();
                        break;
                    case 4:
                        jf9Var.Q.Y4(ll0Var, new TL_iv.pageBlockHeading5());
                        bu5Var2.u();
                        break;
                    default:
                        jf9Var.Q.Y4(ll0Var, new TL_iv.pageBlockHeading6());
                        bu5Var2.u();
                        break;
                }
            }
        });
        K.z().a.setTypeface(gm.n1("fonts/mw_bold.ttf"));
        K.z().a.setTextSize(1, gda.S0 + 1);
        K.i(M2 != null && (M2.b instanceof TL_iv.pageBlockHeading3), R.drawable.iv_h3, null, jb6.M0(2131753993, null), new Runnable(this) { // from class: ue9
            public final /* synthetic */ jf9 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                byte b32 = b3;
                bu5 bu5Var2 = J;
                ll0 ll0Var = M2;
                jf9 jf9Var = this.b;
                switch (b32) {
                    case 0:
                        jf9Var.Q.Y4(ll0Var, new TL_iv.pageBlockHeading1());
                        bu5Var2.u();
                        break;
                    case 1:
                        jf9Var.Q.Y4(ll0Var, new TL_iv.pageBlockHeading2());
                        bu5Var2.u();
                        break;
                    case 2:
                        jf9Var.Q.Y4(ll0Var, new TL_iv.pageBlockHeading3());
                        bu5Var2.u();
                        break;
                    case 3:
                        jf9Var.Q.Y4(ll0Var, new TL_iv.pageBlockHeading4());
                        bu5Var2.u();
                        break;
                    case 4:
                        jf9Var.Q.Y4(ll0Var, new TL_iv.pageBlockHeading5());
                        bu5Var2.u();
                        break;
                    default:
                        jf9Var.Q.Y4(ll0Var, new TL_iv.pageBlockHeading6());
                        bu5Var2.u();
                        break;
                }
            }
        });
        K.z().a.setTypeface(gm.n1("fonts/mw_bold.ttf"));
        K.z().a.setTextSize(1, gda.S0);
        final byte b4 = 3;
        K.i(M2 != null && (M2.b instanceof TL_iv.pageBlockHeading4), R.drawable.iv_h4, null, jb6.M0(2131753992, null), new Runnable(this) { // from class: ue9
            public final /* synthetic */ jf9 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                byte b32 = b4;
                bu5 bu5Var2 = J;
                ll0 ll0Var = M2;
                jf9 jf9Var = this.b;
                switch (b32) {
                    case 0:
                        jf9Var.Q.Y4(ll0Var, new TL_iv.pageBlockHeading1());
                        bu5Var2.u();
                        break;
                    case 1:
                        jf9Var.Q.Y4(ll0Var, new TL_iv.pageBlockHeading2());
                        bu5Var2.u();
                        break;
                    case 2:
                        jf9Var.Q.Y4(ll0Var, new TL_iv.pageBlockHeading3());
                        bu5Var2.u();
                        break;
                    case 3:
                        jf9Var.Q.Y4(ll0Var, new TL_iv.pageBlockHeading4());
                        bu5Var2.u();
                        break;
                    case 4:
                        jf9Var.Q.Y4(ll0Var, new TL_iv.pageBlockHeading5());
                        bu5Var2.u();
                        break;
                    default:
                        jf9Var.Q.Y4(ll0Var, new TL_iv.pageBlockHeading6());
                        bu5Var2.u();
                        break;
                }
            }
        });
        K.z().a.setTypeface(gm.n1("fonts/mw_bold.ttf"));
        K.z().a.setTextSize(1, gda.S0 - 1);
        final byte b5 = 4;
        K.i(M2 != null && (M2.b instanceof TL_iv.pageBlockHeading5), R.drawable.iv_h5, null, jb6.M0(2131753991, null), new Runnable(this) { // from class: ue9
            public final /* synthetic */ jf9 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                byte b32 = b5;
                bu5 bu5Var2 = J;
                ll0 ll0Var = M2;
                jf9 jf9Var = this.b;
                switch (b32) {
                    case 0:
                        jf9Var.Q.Y4(ll0Var, new TL_iv.pageBlockHeading1());
                        bu5Var2.u();
                        break;
                    case 1:
                        jf9Var.Q.Y4(ll0Var, new TL_iv.pageBlockHeading2());
                        bu5Var2.u();
                        break;
                    case 2:
                        jf9Var.Q.Y4(ll0Var, new TL_iv.pageBlockHeading3());
                        bu5Var2.u();
                        break;
                    case 3:
                        jf9Var.Q.Y4(ll0Var, new TL_iv.pageBlockHeading4());
                        bu5Var2.u();
                        break;
                    case 4:
                        jf9Var.Q.Y4(ll0Var, new TL_iv.pageBlockHeading5());
                        bu5Var2.u();
                        break;
                    default:
                        jf9Var.Q.Y4(ll0Var, new TL_iv.pageBlockHeading6());
                        bu5Var2.u();
                        break;
                }
            }
        });
        K.z().a.setTypeface(gm.n1("fonts/mw_bold.ttf"));
        K.z().a.setTextSize(1, gda.S0 - 2);
        final byte b6 = 5;
        K.i(M2 != null && (M2.b instanceof TL_iv.pageBlockHeading6), R.drawable.iv_h6, null, jb6.M0(2131753990, null), new Runnable(this) { // from class: ue9
            public final /* synthetic */ jf9 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                byte b32 = b6;
                bu5 bu5Var2 = J;
                ll0 ll0Var = M2;
                jf9 jf9Var = this.b;
                switch (b32) {
                    case 0:
                        jf9Var.Q.Y4(ll0Var, new TL_iv.pageBlockHeading1());
                        bu5Var2.u();
                        break;
                    case 1:
                        jf9Var.Q.Y4(ll0Var, new TL_iv.pageBlockHeading2());
                        bu5Var2.u();
                        break;
                    case 2:
                        jf9Var.Q.Y4(ll0Var, new TL_iv.pageBlockHeading3());
                        bu5Var2.u();
                        break;
                    case 3:
                        jf9Var.Q.Y4(ll0Var, new TL_iv.pageBlockHeading4());
                        bu5Var2.u();
                        break;
                    case 4:
                        jf9Var.Q.Y4(ll0Var, new TL_iv.pageBlockHeading5());
                        bu5Var2.u();
                        break;
                    default:
                        jf9Var.Q.Y4(ll0Var, new TL_iv.pageBlockHeading6());
                        bu5Var2.u();
                        break;
                }
            }
        });
        K.z().a.setTypeface(gm.n1("fonts/mw_bold.ttf"));
        K.z().a.setTextSize(1, gda.S0 - 3);
        boolean z2 = M2 != null && ch9.y3(M2.b);
        hf9 hf9Var = new hf9(context, R.drawable.iv_h);
        hf9Var.a(z);
        int i = cmb.F8;
        hf9Var.d = i;
        J.i(z2, 0, hf9Var, jb6.M0(2131753996, null), new c20(J, K, (byte) 8));
        J.z().a.setTypeface(gm.o());
        J.z().setPadding(gm.L(jb6.a0 ? 18.0f : 9.0f), 0, gm.L(jb6.a0 ? 9.0f : 18.0f), 0);
        J.i(M2 != null && (M2.b instanceof TL_iv.pageBlockParagraph), R.drawable.iv_text2, null, jb6.M0(2131753953, null), new te9(this, M2, b4));
        J.i(M2 != null && (M2.b instanceof TL_iv.pageBlockBlockquote), R.drawable.iv_quote, null, jb6.M0(2131753961, null), new te9(this, M2, (byte) 4));
        boolean z3 = M2 != null && (M2.b instanceof TL_iv.pageBlockPullquote);
        hf9 hf9Var2 = new hf9(context, R.drawable.iv_pullquote);
        hf9Var2.a(z);
        hf9Var2.d = i;
        J.i(z3, 0, hf9Var2, jb6.M0(2131753962, null), new te9(this, M2, b));
        J.z().setPadding(gm.L(jb6.a0 ? 18.0f : 9.0f), 0, gm.L(jb6.a0 ? 9.0f : 18.0f), 0);
        J.i(M2 != null && (M2.b instanceof TL_iv.pageBlockPreformatted), R.drawable.iv_code, null, jb6.M0(2131754020, null), new te9(this, M2, b2));
        boolean z4 = M2 != null && (M2.b instanceof TL_iv.pageBlockFooter);
        hf9 hf9Var3 = new hf9(context, R.drawable.iv_footer);
        hf9Var3.a(z);
        hf9Var3.d = i;
        J.i(z4, 0, hf9Var3, jb6.M0(2131753997, null), new te9(this, M2, b3));
        J.z().setPadding(gm.L(jb6.a0 ? 18.0f : 9.0f), 0, gm.L(jb6.a0 ? 9.0f : 18.0f), 0);
        J.a0();
        this.y0 = J;
    }

    public final void l0() {
        qg9 qg9Var = this.Q.v3;
        if (qg9Var != null && qg9Var.w()) {
            o0();
        } else {
            new gd9(this.currentAccount, getResourceProvider(), new ci7(this, (byte) 29), getParentActivity()).show();
        }
    }

    public final void m0(k47 k47Var, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, long j, k47 k47Var2, k47 k47Var3, nv1 nv1Var, boolean z, int i, int i2, l3a l3aVar, long j2) {
        int i3 = this.currentAccount;
        if (k47Var == null) {
            a6a.Q(j5.a(i3), arrayList, arrayList2, arrayList3, arrayList4, j, k47Var2, k47Var3, nv1Var, z, i, i2, l3aVar, 0L, j2, 0L);
            return;
        }
        j5 a = j5.a(i3);
        yv1 yv1Var = this.K;
        mp3 mp3Var = a6a.J;
        if (arrayList.isEmpty()) {
            return;
        }
        TL_iv.RichMessage richMessage = new TL_iv.RichMessage();
        int i4 = 0;
        richMessage.rtl = false;
        int size = arrayList.size();
        int i5 = 0;
        while (i5 < size) {
            Object obj = arrayList.get(i5);
            i5++;
            TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) obj;
            if (pageBlock != null) {
                richMessage.blocks.add(pageBlock);
            }
        }
        if (richMessage.blocks.isEmpty()) {
            return;
        }
        if (!arrayList2.isEmpty()) {
            richMessage.photos.addAll(arrayList2);
        }
        if (!arrayList3.isEmpty()) {
            richMessage.documents.addAll(arrayList3);
        }
        IdentityHashMap identityHashMap = new IdentityHashMap();
        ArrayList<TL_iv.PageBlock> arrayList5 = richMessage.blocks;
        int size2 = arrayList5.size();
        while (i4 < size2) {
            TL_iv.PageBlock pageBlock2 = arrayList5.get(i4);
            i4++;
            a6a.j(pageBlock2, identityHashMap);
        }
        a6a.B(a.a).u(k47Var, richMessage, arrayList4, yv1Var, false);
    }

    public final /* synthetic */ void n0() {
        if (z8c.h(this.currentAccount).p()) {
            return;
        }
        showDialog(new kj8((d) this, 43, true));
    }

    public final void o0() {
        tg9 c2 = this.Q.c2();
        if (c2 != null) {
            TL_iv.RichMessage a = c2.a();
            if (a.blocks.isEmpty()) {
                return;
            }
            a1 a1Var = new a1(getParentActivity(), getResourceProvider());
            a1Var.n1(a);
            a1Var.f2 = new mf2(c2, (byte) 20);
            a1Var.show();
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onActivityResultFragment(int i, int i2, Intent intent) {
        if (i2 == -1) {
            byte b = 21;
            if (i == 21) {
                if (intent == null || intent.getData() == null) {
                    return;
                }
                ch9 ch9Var = this.Q;
                Uri data = intent.getData();
                if (data == null) {
                    ch9Var.getClass();
                    return;
                } else {
                    if (ch9Var.getContext() != null) {
                        Utilities.e.c(new ey8(ch9Var, data, b));
                        return;
                    }
                    return;
                }
            }
            if (i == 1 || i == 14) {
                if (intent == null || intent.getData() == null) {
                    return;
                }
                this.Q.Z1(intent.getData());
                return;
            }
        }
        super.onActivityResultFragment(i, i2, intent);
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean onBackPressed(boolean z) {
        boolean z2 = this.D0;
        if (z2) {
            if (z2) {
                this.D0 = false;
                e34 e34Var = this.B0;
                if (e34Var != null) {
                    e34Var.r(false);
                    this.B0.y();
                }
                b0(false);
                return false;
            }
        } else {
            if (this.C0) {
                h0(true);
                return false;
            }
            if (!this.Q.B2()) {
                return super.onBackPressed(z);
            }
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final AnimatorSet onCustomTransitionAnimation(boolean z, Runnable runnable) {
        byte b = 1;
        if (!z && !this.W0) {
            s0();
            this.W0 = true;
        }
        if (gm.O1() || this.s == null || this.w == null) {
            return super.onCustomTransitionAnimation(z, runnable);
        }
        AnimatorSet animatorSet = new AnimatorSet();
        va2 va2Var = this.s;
        this.y = va2Var.n;
        va2Var.e = false;
        va2Var.invalidate();
        this.w.setAlpha(0.0f);
        this.w.q2.setVisibility(4);
        A0();
        float f = z ? 0.0f : 1.0f;
        this.J = f;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f, z ? 1.0f : 0.0f);
        this.F = true;
        this.P.invalidate();
        ofFloat.addUpdateListener(new qe9(this, b));
        ofFloat.addListener(new ic8((Object) this, (Object) runnable, (byte) 9));
        FrameLayout frameLayout = this.T;
        if (z) {
            Property property = View.ALPHA;
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(frameLayout, (Property<FrameLayout, Float>) property, 0.0f, 1.0f);
            FrameLayout frameLayout2 = this.T;
            Property property2 = View.TRANSLATION_Y;
            animatorSet.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(frameLayout2, (Property<FrameLayout, Float>) property2, -gm.L(16.0f), 0.0f), ObjectAnimator.ofFloat(this.a0, (Property<FrameLayout, Float>) property, 0.0f, 1.0f), ObjectAnimator.ofFloat(this.a0, (Property<FrameLayout, Float>) property2, gm.L(16.0f), 0.0f), ObjectAnimator.ofFloat(this.Q, (Property<ch9, Float>) property, 0.0f, 1.0f), ObjectAnimator.ofFloat(this.R, (Property<View, Float>) property, 0.0f, 1.0f), ObjectAnimator.ofFloat(this.S, (Property<View, Float>) property, 0.0f, 1.0f));
        } else {
            Property property3 = View.ALPHA;
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(frameLayout, (Property<FrameLayout, Float>) property3, 0.0f);
            FrameLayout frameLayout3 = this.T;
            Property property4 = View.TRANSLATION_Y;
            animatorSet.playTogether(ofFloat, ofFloat3, ObjectAnimator.ofFloat(frameLayout3, (Property<FrameLayout, Float>) property4, -gm.L(16.0f)), ObjectAnimator.ofFloat(this.a0, (Property<FrameLayout, Float>) property3, 0.0f), ObjectAnimator.ofFloat(this.a0, (Property<FrameLayout, Float>) property4, gm.L(16.0f), 0.0f), ObjectAnimator.ofFloat(this.Q, (Property<ch9, Float>) property3, 1.0f, 0.0f), ObjectAnimator.ofFloat(this.R, (Property<View, Float>) property3, 1.0f, 0.0f), ObjectAnimator.ofFloat(this.S, (Property<View, Float>) property3, 1.0f, 0.0f));
        }
        animatorSet.setDuration(420L);
        animatorSet.setInterpolator(d53.h);
        this.P.post(new pu(animatorSet, (byte) 1));
        return animatorSet;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean onFragmentCreate() {
        nm7.f(this.currentAccount).b(this, nm7.j5);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onFragmentDestroy() {
        se9 se9Var;
        nm7.f(this.currentAccount).n(this, nm7.j5);
        if (!this.W0) {
            s0();
            this.W0 = true;
        }
        ve9 ve9Var = this.O0;
        if (ve9Var != null) {
            this.O0 = null;
            gm.c3(ve9Var);
        }
        j67 j67Var = this.P0;
        if (j67Var != null) {
            j67Var.g();
            this.P0 = null;
        }
        ch9 ch9Var = this.Q;
        if (ch9Var != null) {
            ch9Var.C2();
        }
        pr2 pr2Var = this.A0;
        if (pr2Var != null) {
            pr2Var.m();
        }
        super.onFragmentDestroy();
        e34 e34Var = this.B0;
        if (e34Var != null) {
            e34Var.z();
        }
        bf9 bf9Var = this.P;
        if (bf9Var == null || (se9Var = this.I0) == null) {
            return;
        }
        bf9Var.r.remove(se9Var);
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onInsets(int i, int i2, int i3, int i4) {
        this.U0 = i4;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.S.getLayoutParams();
        layoutParams.height = gm.L(68.0f) + this.U0;
        this.S.setLayoutParams(layoutParams);
        e0();
    }

    @Override // org.telegram.ui.ActionBar.d
    public final wzc onInsetsInternal(View view, wzc wzcVar) {
        bu5 bu5Var;
        iq5 f = wzcVar.a.f(3);
        int i = wzcVar.a.f(8).d;
        this.V0 = i;
        int i2 = i - f.d;
        boolean z = this.H0;
        boolean z2 = i2 > gm.L(20.0f);
        this.H0 = z2;
        if (z2 && i2 > gm.L(50.0f) && !gm.E && !gm.O1()) {
            Point point = gm.q;
            if (point.x > point.y) {
                this.G0 = i2;
                oc7.c1().edit().putInt("kbd_height_land3", this.G0).commit();
            } else {
                this.F0 = i2;
                oc7.c1().edit().putInt("kbd_height", this.F0).commit();
            }
        }
        if (this.H0 && !z && this.C0 && !this.D0) {
            h0(false);
        }
        if (!this.H0 && z && (bu5Var = this.y0) != null) {
            bu5Var.u();
            this.y0 = null;
        }
        onInsets(f.a, f.b, f.c, f.d);
        return wzc.b;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            int i = cmb.c6;
            int themedColor = getThemedColor(i);
            int i2 = cmb.h6;
            int themedColor2 = getThemedColor(i2);
            int i3 = cmb.Oe;
            int themedColor3 = getThemedColor(i3);
            if (this.a1 && themedColor == this.X0 && themedColor2 == this.Y0 && themedColor3 == this.Z0) {
                return;
            }
            this.a1 = true;
            this.X0 = themedColor;
            this.Y0 = themedColor2;
            this.Z0 = themedColor3;
            View view = this.R;
            if (view != null) {
                view.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{getThemedColor(i), cmb.p1(0.0f, getThemedColor(i))}));
            }
            View view2 = this.S;
            if (view2 != null) {
                view2.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{cmb.p1(0.0f, getThemedColor(i)), getThemedColor(i)}));
            }
            ImageView imageView = this.U;
            if (imageView != null) {
                imageView.setBackground(new if9(cmb.Z(getThemedColor(i), cmb.v(getThemedColor(i), getThemedColor(i2)), gm.L(22.0f), gm.L(22.0f))));
            }
            LinearLayout linearLayout = this.V;
            if (linearLayout != null) {
                linearLayout.setBackground(new if9(cmb.b0(gm.L(22.0f), getThemedColor(i))));
            }
            ImageView imageView2 = this.d0;
            if (imageView2 != null) {
                imageView2.setBackground(new if9(cmb.Z(getThemedColor(i), cmb.v(getThemedColor(i), getThemedColor(i2)), gm.L(22.0f), gm.L(22.0f))));
            }
            s09 s09Var = this.x0;
            if (s09Var != null) {
                s09Var.setBackground(new if9(cmb.b0(gm.L(22.0f), getThemedColor(i))));
            }
            LinearLayout linearLayout2 = this.o0;
            if (linearLayout2 != null) {
                linearLayout2.setBackground(new if9(cmb.b0(gm.L(22.0f), getThemedColor(i))));
            }
            LinearLayout linearLayout3 = this.p0;
            if (linearLayout3 != null) {
                linearLayout3.setBackground(new if9(cmb.b0(gm.L(22.0f), getThemedColor(i))));
            }
            LinearLayout linearLayout4 = this.n0;
            if (linearLayout4 != null) {
                linearLayout4.setBackground(new if9(cmb.b0(gm.L(22.0f), getThemedColor(i))));
            }
            vi3 vi3Var = this.z0;
            if (vi3Var != null) {
                vi3Var.setBackground(new if9(cmb.b0(gm.L(22.0f), getThemedColor(i3))));
            }
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onTransitionAnimationStart(boolean z, boolean z2) {
        ch9 ch9Var;
        int i;
        ch9 ch9Var2;
        super.onTransitionAnimationStart(z, z2);
        if (z && !z2 && (i = this.c) >= 0 && (ch9Var2 = this.Q) != null) {
            int i2 = this.d;
            this.d = -1;
            this.c = -1;
            if (ch9Var2.U1(i, i2)) {
                return;
            }
            ch9Var2.post(new wf9(ch9Var2, i, i2, (byte) 0));
            return;
        }
        if (!z || z2) {
            return;
        }
        if ((this.b == null && this.f == null) || (ch9Var = this.Q) == null || ch9Var.W2()) {
            return;
        }
        ch9Var.post(new b82(ch9Var, (byte) 5));
    }

    public final boolean p0(View view) {
        yv1 yv1Var = this.K;
        if (yv1Var != null && this.r == null && !yv1Var.X7() && this.Q.g3() && !this.Q.i3()) {
            if (!this.Q.I3()) {
                G0();
                return false;
            }
            ArrayList<TL_iv.PageBlock> V2 = this.Q.V2();
            if (!V2.isEmpty()) {
                j67 j67Var = this.P0;
                if (j67Var != null) {
                    j67Var.f(false);
                    this.P0 = null;
                }
                j67 j67Var2 = new j67(getParentActivity(), getResourceProvider());
                this.P0 = j67Var2;
                j67Var2.setOnDismissListener(new qj8(this, (byte) 4));
                long a = this.K.a();
                k47 k47Var = this.K.F5;
                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                tL_message.id = 0;
                tL_message.out = true;
                tL_message.peer_id = oc7.r1(this.currentAccount).x1(a);
                tL_message.from_id = oc7.r1(this.currentAccount).x1(z8c.h(this.currentAccount).e());
                tL_message.flags2 |= TLObject.FLAG_13;
                TL_iv.RichMessage richMessage = new TL_iv.RichMessage();
                tL_message.rich_message = richMessage;
                richMessage.blocks = V2;
                richMessage.photos = this.Q.x2();
                tL_message.rich_message.documents = this.Q.u2();
                if (k47Var != null && !k47Var.p) {
                    TLRPC.TL_messageReplyHeader tL_messageReplyHeader = new TLRPC.TL_messageReplyHeader();
                    tL_messageReplyHeader.flags |= 16;
                    tL_messageReplyHeader.reply_to_msg_id = k47Var.e1();
                    tL_message.reply_to = tL_messageReplyHeader;
                }
                k47 k47Var2 = new k47(this.currentAccount, tL_message, false, false);
                if (k47Var != null && !k47Var.p) {
                    k47Var2.C = k47Var;
                }
                k47Var2.B0 = true;
                k47Var2.W2 = Boolean.TRUE;
                k47Var2.n0(null);
                k47Var2.w1 = true;
                this.P0.r(td4.u(k47Var2));
                this.z0.setScaleX(1.0f);
                this.z0.setScaleY(1.0f);
                xz1 s = this.P0.s(this.z0, true, new pe9(this, (byte) 10));
                if (s != null) {
                    s.setBackground(new if9(cmb.b0(gm.L(22.0f), getThemedColor(cmb.Ei))));
                    j67 j67Var3 = this.P0;
                    int L = gm.L(44.0f);
                    j67Var3.p0 = true;
                    j67Var3.Y = L;
                }
                bu5 I = bu5.I(this, this.z0);
                boolean D = m9c.D(this.K.h());
                if (this.K.M4()) {
                    I.b(R.drawable.msg_calendar2, jb6.M0(D ? 2131745248 : 2131745593, null), new fu((Object) this, a, (byte) 28), false);
                    if (!D && a > 0) {
                        I.b(R.drawable.msg_online, jb6.M0(2131745320, null), new oe9(this, (byte) 5), false);
                    }
                }
                if (!D) {
                    I.b(R.drawable.input_notify_off, jb6.M0(2131745317, null), new oe9(this, (byte) 6), false);
                }
                I.Z();
                this.P0.q(I);
                this.P0.show();
                try {
                    view.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                return true;
            }
        }
        return false;
    }

    public final void q0(int i, int i2) {
        ch9 ch9Var = this.Q;
        ch9Var.k4 = ch9Var.M2();
        i22 i22Var = new i22(getParentActivity(), this, false, false, true, getResourceProvider());
        i22Var.W3 = new ye9(this, i22Var);
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = i22Var.d2;
        chatAttachAlertPhotoLayout.setIncludeVideosInGallery(true);
        chatAttachAlertPhotoLayout.h0();
        i22Var.t1(1, true);
        i22Var.P0(i);
        i22Var.t4 = new xe9(this, i22Var);
        i22Var.S1 = new xe9(this, i22Var);
        i22Var.R1 = new ze9(this, i22Var);
        i22Var.Z0();
        if (i2 != 0) {
            i22Var.j1(i2);
        }
        i22Var.v0(true);
        i22Var.show();
    }

    public final boolean s0() {
        Runnable runnable;
        if (this.K == null || this.r != null || !this.Q.m2()) {
            return false;
        }
        TL_iv.RichMessage e2 = this.N ? null : this.Q.e2();
        if (e2 == null && (runnable = this.M) != null) {
            runnable.run();
        }
        ms1 ms1Var = this.K.a0;
        if (e2 != null && !this.N) {
            ch9 ch9Var = this.Q;
            if (ch9Var.g3() && !hi9.d(ch9Var.t3, ch9Var.u3) && ms1Var != null) {
                SpannableStringBuilder g = hi9.g(this.Q.t3);
                yv1 yv1Var = ms1Var.F3;
                if (ms1Var.F0 == null) {
                    return true;
                }
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(g);
                gw3.m(spannableStringBuilder, ms1Var.F0.getPaint().getFontMetricsInt(), false, null, 0);
                gn[] gnVarArr = (gn[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), gn.class);
                if (gnVarArr != null) {
                    for (gn gnVar : gnVarArr) {
                        gnVar.applyFontMetrics(ms1Var.F0.getPaint().getFontMetricsInt(), vm.f());
                    }
                }
                f09.a(spannableStringBuilder);
                if (yv1Var != null) {
                    CharSequence[] charSequenceArr = {new SpannableStringBuilder(spannableStringBuilder)};
                    hs6.d0(ms1Var.R).T1(yv1Var.a(), yv1Var.O5(yv1Var.F5), charSequenceArr[0], hs6.d0(ms1Var.R).Y(charSequenceArr, true, false), null, null, null, 0L, false, false, null);
                }
                ms1Var.setRichDraftPreview(null);
                if (ms1Var.F0.getText() != null) {
                    ms1Var.F0.getText().clear();
                }
                ms1Var.setFieldText(spannableStringBuilder);
                return true;
            }
        }
        hs6 mediaDataController = getMediaDataController();
        long a = this.K.a();
        yv1 yv1Var2 = this.K;
        mediaDataController.T1(a, yv1Var2.O5(yv1Var2.F5), "", null, null, null, null, 0L, false, false, e2);
        TL_iv.RichMessage richMessage = e2;
        if (ms1Var == null) {
            return true;
        }
        ms1Var.setRichDraftPreview(richMessage);
        return true;
    }

    public final ne9 t0() {
        ne9 focusedEditTextOrNull = this.Q.getFocusedEditTextOrNull();
        if (focusedEditTextOrNull == null) {
            ne9 ne9Var = this.S0;
            return ne9Var != null ? ne9Var : this.Q.L2();
        }
        this.S0 = focusedEditTextOrNull;
        this.T0 = Math.max(0, focusedEditTextOrNull.getSelectionEnd());
        return focusedEditTextOrNull;
    }

    public final int u0(ne9 ne9Var) {
        return (ne9Var != this.S0 || this.Q.getFocusedEditTextOrNull() == ne9Var) ? Math.max(0, ne9Var.getSelectionEnd()) : Math.min(this.T0, ne9Var.length());
    }

    public final void v0() {
        byte b = 0;
        if (!j0()) {
            if (i0()) {
                ik.J(getParentActivity(), this.K.a(), new et8((Object) this, (byte) 5), getResourceProvider());
                return;
            } else {
                w0(0, 0, true);
                return;
            }
        }
        Activity parentActivity = getParentActivity();
        ch9 ch9Var = this.Q;
        Objects.requireNonNull(ch9Var);
        r0(getResourceProvider(), parentActivity, new b82(ch9Var, b), new oe9(this, (byte) 4));
    }

    /* JADX WARN: Type inference failed for: r0v19, types: [ve9] */
    public final void w0(final int i, final int i2, final boolean z) {
        ms1 ms1Var;
        uz1 uz1Var;
        if (j0()) {
            Activity parentActivity = getParentActivity();
            ch9 ch9Var = this.Q;
            Objects.requireNonNull(ch9Var);
            r0(getResourceProvider(), parentActivity, new b82(ch9Var, (byte) 0), new oe9(this, (byte) 4));
            return;
        }
        if (this.K == null || !this.Q.g3() || this.Q.i3()) {
            return;
        }
        if (!this.Q.I3()) {
            G0();
            return;
        }
        if (!oc7.r1(this.currentAccount).x4()) {
            ms1 ms1Var2 = this.K.a0;
            if (ms1Var2 != null) {
                this.N = true;
                Runnable runnable = this.L;
                if (runnable != null) {
                    runnable.run();
                }
                ms1Var2.v1(hi9.g(this.Q.t3), z, i, i2);
                finishFragment();
                return;
            }
            return;
        }
        this.N = true;
        final ArrayList V2 = this.Q.V2();
        if (V2.isEmpty()) {
            return;
        }
        final ArrayList x2 = this.Q.x2();
        final ArrayList u2 = this.Q.u2();
        final ArrayList a = gi9.a(this.currentAccount, V2);
        final long a2 = this.K.a();
        yv1 yv1Var = this.K;
        final k47 k47Var = yv1Var.F5;
        final k47 k47Var2 = yv1Var.m4;
        final nv1 nv1Var = yv1Var.D5;
        final long k7 = yv1Var.k7();
        final l3a X6 = this.K.X6();
        final k47 k47Var3 = this.r;
        ?? r0 = new Runnable() { // from class: ve9
            @Override // java.lang.Runnable
            public final void run() {
                jf9.this.m0(k47Var3, V2, x2, u2, a, a2, k47Var, k47Var2, nv1Var, z, i, i2, X6, k7);
            }
        };
        Runnable runnable2 = this.L;
        if (runnable2 != null) {
            runnable2.run();
        }
        if (k47Var3 == null && (ms1Var = this.K.a0) != null && (uz1Var = ms1Var.P3) != null) {
            uz1Var.w(null, z, i, i2, 0L);
        }
        if (i == 0 || k47Var3 != null) {
            r0.run();
            finishFragment();
        } else {
            this.O0 = r0;
            finishFragment();
        }
    }

    public final void x0(boolean z) {
        ArrayList arrayList = this.m0;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ff9 ff9Var = (ff9) obj;
            if (((Integer) ff9Var.getTag()).intValue() == 1) {
                ff9Var.setEnabled(z);
            }
        }
    }

    public final void y0(boolean z, boolean z2) {
        ff9 ff9Var = this.r0;
        if (ff9Var != null) {
            ff9Var.setEnabled(z);
        }
        ff9 ff9Var2 = this.s0;
        if (ff9Var2 != null) {
            ff9Var2.setEnabled(z2);
        }
        ff9 ff9Var3 = this.t0;
        if (ff9Var3 != null) {
            ff9Var3.setEnabled(z);
        }
        ff9 ff9Var4 = this.u0;
        if (ff9Var4 != null) {
            ff9Var4.setEnabled(z);
        }
    }

    public final void z0(boolean z, boolean z2) {
        if (this.K0 == z && z2) {
            return;
        }
        this.K0 = z;
        float f = z ? 1.15f : 1.0f;
        s09 s09Var = this.x0;
        if (z2) {
            s09Var.animate().scaleX(f).scaleY(f).setDuration(180L).setInterpolator(d53.h).start();
        } else {
            s09Var.animate().cancel();
            this.x0.setScaleX(f);
            this.x0.setScaleY(f);
        }
        anb.s(this.x0, z ? cmb.p7 : cmb.F6, getResourceProvider(), PorterDuff.Mode.SRC_IN);
        p09 animatedDrawable = this.x0.getAnimatedDrawable();
        if (animatedDrawable != null) {
            if (z) {
                if (animatedDrawable.b0 > 34) {
                    animatedDrawable.I(0, false, false);
                }
                animatedDrawable.K(33);
            } else {
                animatedDrawable.K(0);
            }
            animatedDrawable.start();
        }
    }

    public jf9(String str) {
        super(null);
        this.c = -1;
        this.d = -1;
        this.x = new Rect();
        this.G = new int[2];
        this.J = 1.0f;
        this.O = new ArrayList();
        this.g0 = new ArrayList();
        this.l0 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        this.m0 = new ArrayList();
        this.J0 = 0;
        this.L0 = -1;
        this.N0 = new oe9(this, (byte) 0);
        this.f = str;
    }

    public jf9(TL_iv.RichMessage richMessage) {
        super(null);
        this.c = -1;
        this.d = -1;
        this.x = new Rect();
        this.G = new int[2];
        this.J = 1.0f;
        this.O = new ArrayList();
        this.g0 = new ArrayList();
        this.l0 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        this.m0 = new ArrayList();
        this.J0 = 0;
        this.L0 = -1;
        this.N0 = new oe9(this, (byte) 0);
        this.b = richMessage;
    }
}
