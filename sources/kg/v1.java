package kg;

import android.animation.ValueAnimator;
import android.app.Dialog;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.cd;
import org.telegram.messenger.d20;
import org.telegram.messenger.i5;
import org.telegram.messenger.k6;
import org.telegram.messenger.o5;
import org.telegram.messenger.ui;
import org.telegram.messenger.us;
import org.telegram.messenger.z20;
import org.telegram.messenger.zs;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.ActionBar.u5;
import org.telegram.ui.Components.d5;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.ha;
import org.telegram.ui.Components.o80;
import org.telegram.ui.Components.p80;
import org.telegram.ui.Components.sk0;
import org.telegram.ui.Components.tk0;
import org.telegram.ui.Components.u80;
import org.telegram.ui.Components.uu0;
import org.telegram.ui.Components.xz;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.eu0;
import org.telegram.ui.st0;
import org.telegram.ui.u71;
import w7.b6;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public class v1 extends ha implements us {
    public ValueAnimator A2;
    public boolean B2;
    public boolean C2;
    public FrameLayout D2;
    public final FrameLayout E2;
    public FrameLayout F2;
    public p80[] G2;
    public p80 H2;
    public final ArrayList P1;
    public int Q1;
    public final TLRPC.User R1;
    public final m S1;
    public final TL_stars.StarGift T1;
    public boolean U1;
    public final st0 V1;
    public int W1;
    public int X1;
    public int Y1;
    public int Z1;
    public int a2;
    public int b2;
    public int c2;
    public int d2;
    public int e2;
    public int f2;
    public final xz g2;
    public final k1 h2;
    public g i2;
    public h j2;
    public u71 k2;
    public final org.telegram.ui.ActionBar.k2 l2;
    public Integer m2;
    public float n2;
    public float o2;
    public float p2;
    public float q2;
    public float r2;
    public View s2;
    public View t2;
    public TLRPC.InputStickerSet u2;
    public TLRPC.TL_emojiStatusCollectible v2;
    public boolean w2;
    public final int[] x2;
    public float y2;
    public boolean z2;

    public v1(org.telegram.ui.ActionBar.k2 k2Var, int i10, TLRPC.User user, p6 p6Var) {
        this(k2Var, i10, user, null, null, p6Var);
    }

    @Override // org.telegram.ui.Components.ha
    public final sk0 L0(tk0 tk0Var) {
        return new f(this, 1);
    }

    @Override // org.telegram.ui.Components.ha
    public final CharSequence O0() {
        return cd.L0(2131744256, null);
    }

    @Override // org.telegram.ui.Components.ha
    public final void S0(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        int i12 = 0;
        int i13 = 0;
        while (true) {
            ArrayList arrayList = this.P1;
            if (i12 >= arrayList.size()) {
                this.W1 = i13;
                this.c.getLocationOnScreen(this.x2);
                return;
            }
            eu0 eu0Var = (eu0) arrayList.get(i12);
            st0 st0Var = this.V1;
            st0Var.a(eu0Var, false);
            st0Var.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_31));
            ((eu0) arrayList.get(i12)).e = i13;
            i13 += st0Var.getMeasuredHeight();
            i12++;
        }
    }

    @Override // org.telegram.ui.Components.ha
    public final void U0(uu0 uu0Var) {
        this.Q1 = d20.s0;
        x0 x0Var = new x0(getContext(), this.I0, false);
        x0Var.b(PremiumPreviewFragment.s0(this.Q1, null), new ag.g(this, 12), false);
        this.D2 = new FrameLayout(getContext());
        View view = new View(getContext());
        a7.i(t6.d7, view, this.I0);
        this.D2.addView(view, b6.c(1.0f, -1));
        view.getLayoutParams().height = 1;
        org.telegram.messenger.i0.Y3(view, true, 1.0f, true, false);
        if (d20.i(this.Q1).q() || (this instanceof mg.f1)) {
            return;
        }
        this.D2.addView(x0Var, b6.d(-1, 48.0f, 16, 16.0f, 0.0f, 16.0f, 0.0f));
        a7.i(t6.h5, this.D2, this.I0);
        uu0Var.addView(this.D2, b6.e(-1, 68, 80));
    }

    @Override // org.telegram.ui.ActionBar.z2
    public final void Z(Canvas canvas) {
        View view = this.t2;
        if (view != null) {
            view.setVisibility(this.z2 ? 4 : 0);
        }
        if (this.s2 == null || !this.z2) {
            return;
        }
        View view2 = this.t2;
        View view3 = view2 == null ? this.j2 : view2;
        if (view3 == view2) {
            view2.setVisibility(0);
        }
        canvas.save();
        float[] fArr = {this.n2, this.o2};
        this.s2.getMatrix().mapPoints(fArr);
        View view4 = this.s2;
        Drawable rightDrawable = view4 instanceof u5 ? ((u5) view4).getRightDrawable() : view4 instanceof org.telegram.ui.Cells.q1 ? ((org.telegram.ui.Cells.q1) view4).oa : null;
        if (rightDrawable == null) {
            canvas.restore();
            return;
        }
        int[] iArr = this.x2;
        float f7 = (-iArr[0]) + this.p2 + fArr[0];
        float f10 = (-iArr[1]) + this.q2 + fArr[1];
        if (org.telegram.messenger.i0.Q1()) {
            ViewGroup view5 = this.l2.getParentLayout().getView();
            f7 += view5.getX() + view5.getPaddingLeft();
            f10 += view5.getY() + view5.getPaddingTop();
        }
        float intrinsicWidth = this.r2 * rightDrawable.getIntrinsicWidth();
        float measuredHeight = view3.getMeasuredHeight() * 0.8f;
        float f11 = measuredHeight / intrinsicWidth;
        float f12 = intrinsicWidth / measuredHeight;
        float measuredWidth = view3.getMeasuredWidth() / 2.0f;
        for (View view6 = view3; view6 != this.c && view6 != null; view6 = (View) view6.getParent()) {
            measuredWidth += view6.getX();
        }
        float measuredHeight2 = (view3.getMeasuredHeight() / 2.0f) + ((View) view3.getParent().getParent()).getY() + ((View) view3.getParent()).getY() + view3.getY() + 0.0f;
        float T1 = org.telegram.messenger.i0.T1(f7, measuredWidth, gr.h.getInterpolation(this.y2));
        float T12 = org.telegram.messenger.i0.T1(f10, measuredHeight2, this.y2);
        float f13 = this.r2;
        float f14 = this.y2;
        float f15 = (f11 * f14) + ((1.0f - f14) * f13);
        canvas.save();
        canvas.scale(f15, f15, T1, T12);
        int i10 = (int) T1;
        int i11 = (int) T12;
        rightDrawable.setBounds(org.telegram.ui.Cells.f1.z(2, i10, rightDrawable), org.telegram.ui.Cells.f1.y(2, i11, rightDrawable), org.telegram.ui.Cells.f1.w(2, i10, rightDrawable), org.telegram.ui.Cells.f1.f(2, i11, rightDrawable));
        rightDrawable.setAlpha((int) ((1.0f - Utilities.i(this.y2, 1.0f, 0.0f)) * 255.0f));
        rightDrawable.draw(canvas);
        rightDrawable.setAlpha(0);
        canvas.restore();
        float T13 = org.telegram.messenger.i0.T1(f12, 1.0f, this.y2);
        canvas.scale(T13, T13, T1, T12);
        canvas.translate(T1 - (view3.getMeasuredWidth() / 2.0f), T12 - (view3.getMeasuredHeight() / 2.0f));
        view3.draw(canvas);
        canvas.restore();
    }

    @Override // org.telegram.messenger.us
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        TLRPC.InputStickerSet inputStickerSet;
        if (i10 == zs.B0 && (inputStickerSet = this.u2) != null && inputStickerSet.id == ((Long) objArr[0]).longValue()) {
            j1(true);
        }
    }

    @Override // org.telegram.ui.ActionBar.z2, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.g2
    public final void dismiss() {
        super.dismiss();
        zs.e().k(zs.k1, 4);
        ValueAnimator valueAnimator = this.A2;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        xz xzVar = this.g2;
        if (xzVar.c) {
            xzVar.animate().alpha(0.0f).setDuration(150L).start();
        }
    }

    public void e1(u71 u71Var) {
        u71Var.addView(this.t2, b6.q(zs.W1, zs.W1, 1.0f, 17, 10, 10, 10, 10));
    }

    public int f1() {
        return 0;
    }

    public View h1(Context context, int i10) {
        return null;
    }

    public final SpannableStringBuilder i1(String str) {
        Integer num = this.m2;
        return num == null ? org.telegram.messenger.i0.P2(str, t6.u6, this.I0, null, false) : org.telegram.messenger.i0.N2(str, num.intValue(), null);
    }

    public void j1(boolean z10) {
        TLRPC.Document document;
        SpannableStringBuilder spannableStringBuilder;
        p80[] p80VarArr = this.G2;
        if (p80VarArr == null || this.H2 == null) {
            return;
        }
        TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = this.v2;
        int i10 = 2;
        int i11 = 1;
        TLRPC.User user = this.R1;
        int i12 = 0;
        if (tL_emojiStatusCollectible != null) {
            String str = tL_emojiStatusCollectible.title;
            int lastIndexOf = str.lastIndexOf(32);
            if (lastIndexOf >= 0) {
                str = str.substring(0, lastIndexOf);
            }
            this.G2[0].setText(org.telegram.messenger.i0.T2(cd.a0(null, null, 2131744244, o5.u(user), str), new m1(this, i12)));
            this.H2.setText(org.telegram.messenger.i0.W2(cd.L0(2131744242, null)));
        } else if (this.u2 != null) {
            CharSequence i13 = i1(cd.a0(null, null, 2131744241, i5.m(0, user.first_name, user.last_name), "<STICKERSET>"));
            try {
                i13 = k6.m(i13, this.G2[0].getPaint().getFontMetricsInt(), false, null, 0);
            } catch (Exception unused) {
            }
            SpannableStringBuilder spannableStringBuilder2 = i13 instanceof SpannableStringBuilder ? (SpannableStringBuilder) i13 : new SpannableStringBuilder(i13);
            int indexOf = i13.toString().indexOf("<STICKERSET>");
            if (indexOf >= 0) {
                TLRPC.TL_messages_stickerSet m0 = ui.b0(this.Q1).m0(this.u2, false);
                if (m0 == null || m0.documents.isEmpty()) {
                    document = null;
                } else {
                    document = m0.documents.get(0);
                    if (m0.set != null) {
                        int i14 = 0;
                        while (true) {
                            if (i14 >= m0.documents.size()) {
                                break;
                            }
                            if (m0.documents.get(i14).id == m0.set.thumb_document_id) {
                                document = m0.documents.get(i14);
                                break;
                            }
                            i14++;
                        }
                    }
                }
                if (document != null) {
                    spannableStringBuilder = new SpannableStringBuilder("x");
                    spannableStringBuilder.setSpan(new org.telegram.ui.Components.o5(document, this.G2[0].getPaint().getFontMetricsInt()), 0, spannableStringBuilder.length(), 33);
                    if (m0 != null && m0.set != null) {
                        spannableStringBuilder.append((CharSequence) " ").append((CharSequence) m0.set.title);
                    }
                } else {
                    spannableStringBuilder = new SpannableStringBuilder("xxxxxx");
                    spannableStringBuilder.setSpan(new u80(org.telegram.messenger.i0.L(100.0f), this.G2[0]), 0, spannableStringBuilder.length(), 33);
                }
                spannableStringBuilder2.replace(indexOf, indexOf + 12, (CharSequence) spannableStringBuilder);
                spannableStringBuilder2.setSpan(new dh.a(this, i10), indexOf, spannableStringBuilder.length() + indexOf, 33);
                this.G2[1].setOnLinkPressListener(new o80() { // from class: kg.n1
                    @Override // org.telegram.ui.Components.o80
                    public final void a(ClickableSpan clickableSpan) {
                        ArrayList arrayList = new ArrayList();
                        v1 v1Var = v1.this;
                        arrayList.add(v1Var.u2);
                        q1 q1Var = new q1(v1Var, 0);
                        org.telegram.ui.ActionBar.k2 k2Var = v1Var.l2;
                        if (k2Var != null) {
                            q1Var.setParentFragment(k2Var);
                        }
                        new r1(v1Var, q1Var, v1Var.getContext(), v1Var.I0, arrayList).show();
                    }
                });
                if (document != null) {
                    p80[] p80VarArr2 = this.G2;
                    if (p80VarArr2 != null) {
                        p80VarArr2[1].setText(spannableStringBuilder2);
                        if (this.G2[1].getVisibility() != 0) {
                            if (z10) {
                                this.G2[1].setAlpha(0.0f);
                                this.G2[1].setVisibility(0);
                                ViewPropertyAnimator alpha = this.G2[1].animate().alpha(1.0f);
                                gr grVar = gr.f;
                                z20.m(alpha, grVar, 200L);
                                this.G2[0].animate().alpha(0.0f).setInterpolator(grVar).setDuration(200L).withEndAction(new m1(this, i10)).start();
                                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                                ofFloat.addUpdateListener(new p1(this, i11));
                                ofFloat.setInterpolator(grVar);
                                ofFloat.setDuration(200L);
                                ofFloat.start();
                            } else {
                                this.G2[1].setAlpha(1.0f);
                                this.G2[1].setVisibility(0);
                                this.G2[0].setAlpha(0.0f);
                                this.G2[0].setVisibility(8);
                            }
                        }
                    }
                } else {
                    this.G2[0].setText(spannableStringBuilder2, (TextView.BufferType) null);
                }
            }
            this.H2.setText(org.telegram.messenger.i0.W2(cd.L0(2131744242, null)));
        } else if (this.w2) {
            p80VarArr[0].setText(org.telegram.messenger.i0.W2(cd.a0(null, null, 2131744243, i5.m(0, user.first_name, user.last_name))));
            this.H2.setText(org.telegram.messenger.i0.W2(cd.a0(null, null, 2131744242, i5.m(0, user.first_name, user.last_name))));
        } else {
            m mVar = this.S1;
            if (mVar == null) {
                TL_stars.StarGift starGift = this.T1;
                if (starGift != null) {
                    p80VarArr[0].setText(cd.L0(2131750077, null));
                    this.G2[0].setTextSize(1, 20.0f);
                    if (starGift.limited_per_user) {
                        this.H2.setText(org.telegram.messenger.i0.W2(cd.H(',', "Gift2PremiumSubtitleMany", starGift.per_user_total)));
                    } else {
                        this.H2.setText(org.telegram.messenger.i0.W2(cd.L0(2131750081, null)));
                    }
                    this.H2.setTextSize(1, 14.0f);
                } else if (user == null) {
                    p80VarArr[0].setText(cd.L0(2131744256, null));
                    this.H2.setText(org.telegram.messenger.i0.W2(cd.L0(2131744254, null)));
                } else {
                    p80VarArr[0].setText(i1(cd.a0(null, null, 2131744250, i5.m(0, user.first_name, user.last_name))));
                    this.H2.setText(org.telegram.messenger.i0.W2(cd.L0(2131744251, null)));
                }
            } else if (this.U1) {
                p80VarArr[0].setText(i1(cd.a0(null, null, 2131744245, user != null ? user.first_name : "", cd.G(mVar.d(), "GiftMonths", new Object[0]))));
                this.H2.setText(i1(cd.a0(null, null, 2131744246, user != null ? user.first_name : "")));
            } else if (user == null || TextUtils.isEmpty(user.first_name) || user.id == 777000) {
                this.G2[0].setText(i1(cd.a0(null, null, 2131744247, cd.G(mVar.d(), "GiftMonths", new Object[0]))));
                this.H2.setText(org.telegram.messenger.i0.W2(cd.L0(2131744249, null)));
            } else {
                this.G2[0].setText(i1(cd.a0(null, null, 2131744248, user.first_name, cd.G(mVar.d(), "GiftMonths", new Object[0]))));
                this.H2.setText(org.telegram.messenger.i0.W2(cd.L0(2131744249, null)));
            }
        }
        try {
            p80 p80Var = this.G2[0];
            p80Var.setText(k6.m(p80Var.getText(), this.G2[0].getPaint().getFontMetricsInt(), false, null, 0));
        } catch (Exception unused2) {
        }
    }

    public void k1() {
        int i10 = this.X1;
        int i11 = i10 + 1;
        this.X1 = i11;
        this.Y1 = i10;
        this.b2 = i11;
        int size = this.P1.size() + i11;
        this.c2 = size;
        this.X1 = size + 1;
        this.d2 = size;
        if (d20.i(this.Q1).q() || this.S1 != null) {
            return;
        }
        int i12 = this.X1;
        this.X1 = i12 + 1;
        this.e2 = i12;
    }

    @Override // org.telegram.ui.ActionBar.z2
    public final boolean m0() {
        Drawable drawable;
        int i10 = 0;
        if (this.s2 == null) {
            return false;
        }
        this.A2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.y2 = 0.0f;
        this.z2 = true;
        this.k2.invalidate();
        View view = this.s2;
        if (view instanceof u5) {
            drawable = ((u5) view).getRightDrawable();
        } else if (view instanceof org.telegram.ui.Cells.q1) {
            org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) view;
            d5 d5Var = q1Var.oa;
            q1Var.n2();
            drawable = d5Var;
        } else {
            drawable = null;
        }
        if (drawable != null) {
            drawable.setAlpha(0);
        }
        View view2 = this.s2;
        if (view2 instanceof org.telegram.ui.Cells.q1) {
            ((org.telegram.ui.Cells.q1) view2).n2();
        } else {
            view2.invalidate();
        }
        h hVar = this.j2;
        if (hVar != null) {
            hVar.m(100L);
        }
        this.A2.addUpdateListener(new p1(this, i10));
        this.A2.addListener(new bg.f(6, this, drawable));
        this.A2.setDuration(600L);
        this.A2.setInterpolator(gr.h);
        this.A2.start();
        return false;
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        zs.f(d20.s0).c(this, zs.B0);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        zs.f(d20.s0).n(this, zs.B0);
    }

    @Override // org.telegram.ui.ActionBar.z2, android.app.Dialog
    public final void show() {
        super.show();
        int i10 = 1;
        zs.e().k(zs.j1, 4);
        if (this.B2) {
            org.telegram.messenger.i0.h3(new m1(this, i10), 200L);
        }
    }

    @Override // org.telegram.ui.ActionBar.z2, org.telegram.ui.ActionBar.g2
    public final boolean t(Dialog dialog) {
        h hVar = this.j2;
        if (hVar != null) {
            hVar.setDialogVisible(true);
        }
        this.i2.setPaused(true);
        dialog.setOnDismissListener(new ag.x(this, 5));
        dialog.show();
        return true;
    }

    public v1(org.telegram.ui.ActionBar.k2 k2Var, int i10, TLRPC.User user, m mVar, TL_stars.StarGift starGift, p6 p6Var) {
        super(k2Var, false, false, p6Var);
        ArrayList arrayList = new ArrayList();
        this.P1 = arrayList;
        this.x2 = new int[2];
        this.y2 = 0.0f;
        O();
        this.l2 = k2Var;
        this.r1 = 0.26f;
        this.R1 = user;
        this.Q1 = i10;
        this.S1 = mVar;
        this.T1 = starGift;
        this.V1 = new st0(getContext(), null);
        PremiumPreviewFragment.r0(i10, arrayList);
        if (mVar != null || d20.i(i10).q()) {
            this.D2.setVisibility(8);
        }
        k1 k1Var = new k1(t6.zk, t6.Ak, t6.Bk, t6.Ck, null);
        this.h2 = k1Var;
        k1Var.m = true;
        k1Var.o = 1.0f;
        k1Var.p = 0.0f;
        k1Var.q = 0.0f;
        k1Var.b = 0.0f;
        k1Var.c = 0.0f;
        k1();
        this.k1.setPadding(org.telegram.messenger.i0.L(6.0f), 0, org.telegram.messenger.i0.L(6.0f), 0);
        this.k1.setOnItemClickListener(new o1(this, i10, k2Var, 0));
        ui.b0(i10).o1();
        PremiumPreviewFragment.v0("profile");
        xz xzVar = new xz(getContext());
        this.g2 = xzVar;
        this.c.addView(xzVar, b6.c(-1.0f, -1));
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.E2 = frameLayout;
        this.b.addView(frameLayout, b6.e(-1, zs.W1, 87));
    }

    public void g1(View view) {
    }

    public void d1(int i10, View view) {
    }
}
