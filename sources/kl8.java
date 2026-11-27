// default package

import android.animation.ValueAnimator;
import android.app.Dialog;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.PremiumPreviewFragment;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public class kl8 extends ny0 implements fn7 {
    public final int[] A2;
    public float B2;
    public boolean C2;
    public ValueAnimator D2;
    public boolean E2;
    public boolean F2;
    public FrameLayout G2;
    public final FrameLayout H2;
    public FrameLayout I2;
    public p66[] J2;
    public p66 K2;
    public final ArrayList S1;
    public int T1;
    public final TLRPC.User U1;
    public final pw4 V1;
    public final TL_stars.StarGift W1;
    public boolean X1;
    public final yk8 Y1;
    public int Z1;
    public int a2;
    public int b2;
    public int c2;
    public int d2;
    public int e2;
    public int f2;
    public int g2;
    public int h2;
    public int i2;
    public final tj4 j2;
    public final al8 k2;
    public vb l2;
    public i94 m2;
    public oob n2;
    public final e o2;
    public Integer p2;
    public float q2;
    public float r2;
    public float s2;
    public float t2;
    public float u2;
    public View v2;
    public View w2;
    public TLRPC.InputStickerSet x2;
    public TLRPC.TL_emojiStatusCollectible y2;
    public boolean z2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kl8(e eVar, int i, TLRPC.User user, pw4 pw4Var, TL_stars.StarGift starGift, vnb vnbVar) {
        super(eVar, false, false, vnbVar);
        byte b = 0;
        ArrayList arrayList = new ArrayList();
        this.S1 = arrayList;
        this.A2 = new int[2];
        this.B2 = 0.0f;
        J();
        this.o2 = eVar;
        this.u1 = 0.26f;
        this.U1 = user;
        this.T1 = i;
        this.V1 = pw4Var;
        this.W1 = starGift;
        this.Y1 = new yk8(getContext(), null);
        PremiumPreviewFragment.q0(i, arrayList);
        if (pw4Var != null || yac.h(i).p()) {
            this.G2.setVisibility(8);
        }
        al8 al8Var = new al8(aob.Ck, aob.Dk, aob.Ek, aob.Fk, null);
        this.k2 = al8Var;
        al8Var.m = true;
        al8Var.o = 1.0f;
        al8Var.p = 0.0f;
        al8Var.q = 0.0f;
        al8Var.b = 0.0f;
        al8Var.c = 0.0f;
        g1();
        this.n1.setPadding(hl.L(6.0f), 0, hl.L(6.0f), 0);
        this.n1.setOnItemClickListener(new fl8(this, i, eVar, b));
        ls6.d0(i).p1();
        PremiumPreviewFragment.w0("profile");
        tj4 tj4Var = new tj4(getContext());
        this.j2 = tj4Var;
        this.c.addView(tj4Var, tre.c(-1.0f, -1));
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.H2 = frameLayout;
        this.b.addView(frameLayout, tre.e(-1, jn7.V1, 87));
    }

    @Override // ny0
    public final void O0(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int i3 = 0;
        int i4 = 0;
        while (true) {
            ArrayList arrayList = this.S1;
            if (i3 >= arrayList.size()) {
                this.Z1 = i4;
                this.c.getLocationOnScreen(this.A2);
                return;
            }
            sl8 sl8Var = (sl8) arrayList.get(i3);
            yk8 yk8Var = this.Y1;
            yk8Var.a(sl8Var, false);
            yk8Var.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_31));
            ((sl8) arrayList.get(i3)).e = i4;
            i4 += yk8Var.getMeasuredHeight();
            i3++;
        }
    }

    @Override // ny0
    public final void Q0(wma wmaVar) {
        this.T1 = yac.t0;
        ok8 ok8Var = new ok8(this.J0, getContext(), false);
        ok8Var.b(PremiumPreviewFragment.r0(this.T1, null), new am7(this, (byte) 25), false);
        this.G2 = new FrameLayout(getContext());
        View view = new View(getContext());
        yob.h(aob.d7, this.J0, view);
        this.G2.addView(view, tre.c(1.0f, -1));
        view.getLayoutParams().height = 1;
        hl.T3(view, true, 1.0f, true, false);
        if (yac.h(this.T1).p() || (this instanceof zl8)) {
            return;
        }
        this.G2.addView(ok8Var, tre.d(-1, 48.0f, 16, 16.0f, 0.0f, 16.0f, 0.0f));
        yob.h(aob.h5, this.J0, this.G2);
        wmaVar.addView(this.G2, tre.e(-1, 68, 80));
    }

    @Override // nx0
    public final void W(Canvas canvas) {
        View view = this.w2;
        if (view != null) {
            view.setVisibility(this.C2 ? 4 : 0);
        }
        if (this.v2 == null || !this.C2) {
            return;
        }
        View view2 = this.w2;
        View view3 = view2 == null ? this.m2 : view2;
        if (view3 == view2) {
            view2.setVisibility(0);
        }
        canvas.save();
        float[] fArr = {this.q2, this.r2};
        this.v2.getMatrix().mapPoints(fArr);
        View view4 = this.v2;
        Drawable rightDrawable = view4 instanceof ema ? ((ema) view4).getRightDrawable() : view4 instanceof wb2 ? ((wb2) view4).Ca : null;
        if (rightDrawable == null) {
            canvas.restore();
            return;
        }
        int[] iArr = this.A2;
        float f = (-iArr[0]) + this.s2 + fArr[0];
        float f2 = (-iArr[1]) + this.t2 + fArr[1];
        if (hl.O1()) {
            ViewGroup view5 = this.o2.getParentLayout().getView();
            f += view5.getX() + view5.getPaddingLeft();
            f2 += view5.getY() + view5.getPaddingTop();
        }
        float intrinsicWidth = this.u2 * rightDrawable.getIntrinsicWidth();
        float measuredHeight = view3.getMeasuredHeight() * 0.8f;
        float f3 = measuredHeight / intrinsicWidth;
        float f4 = intrinsicWidth / measuredHeight;
        float measuredWidth = view3.getMeasuredWidth() / 2.0f;
        for (View view6 = view3; view6 != this.c && view6 != null; view6 = (View) view6.getParent()) {
            measuredWidth += view6.getX();
        }
        float measuredHeight2 = (view3.getMeasuredHeight() / 2.0f) + ((View) view3.getParent().getParent()).getY() + ((View) view3.getParent()).getY() + view3.getY() + 0.0f;
        float R1 = hl.R1(f, measuredWidth, k43.h.getInterpolation(this.B2));
        float R12 = hl.R1(f2, measuredHeight2, this.B2);
        float f5 = this.u2;
        float f6 = this.B2;
        float f7 = (f3 * f6) + ((1.0f - f6) * f5);
        canvas.save();
        canvas.scale(f7, f7, R1, R12);
        int i = (int) R1;
        int i2 = (int) R12;
        rightDrawable.setBounds(bp1.A(2, i, rightDrawable), bp1.y(2, i2, rightDrawable), bp1.w(2, i, rightDrawable), bp1.i(2, i2, rightDrawable));
        rightDrawable.setAlpha((int) ((1.0f - Utilities.i(this.B2, 1.0f, 0.0f)) * 255.0f));
        rightDrawable.draw(canvas);
        rightDrawable.setAlpha(0);
        canvas.restore();
        float R13 = hl.R1(f4, 1.0f, this.B2);
        canvas.scale(R13, R13, R1, R12);
        uh9.n(view3.getMeasuredHeight(), 2.0f, R12, R1 - (view3.getMeasuredWidth() / 2.0f), canvas);
        view3.draw(canvas);
        canvas.restore();
    }

    public void a1(oob oobVar) {
        oobVar.addView(this.w2, tre.q(jn7.V1, jn7.V1, 1.0f, 17, 10, 10, 10, 10));
    }

    public int b1() {
        return 0;
    }

    public View d1(Context context, int i) {
        return null;
    }

    @Override // fn7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        TLRPC.InputStickerSet inputStickerSet;
        if (i == jn7.B0 && (inputStickerSet = this.x2) != null && inputStickerSet.id == ((Long) objArr[0]).longValue()) {
            f1(true);
        }
    }

    @Override // nx0, android.app.Dialog, android.content.DialogInterface, ag0
    public final void dismiss() {
        super.dismiss();
        jn7.e().k(jn7.k1, 4);
        ValueAnimator valueAnimator = this.D2;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        tj4 tj4Var = this.j2;
        if (tj4Var.c) {
            tj4Var.animate().alpha(0.0f).setDuration(150L).start();
        }
    }

    public final SpannableStringBuilder e1(String str) {
        Integer num = this.p2;
        return num == null ? hl.M2(str, aob.u6, this.J0, null, false) : hl.K2(str, num.intValue(), null);
    }

    public void f1(boolean z) {
        TLRPC.Document document;
        SpannableStringBuilder spannableStringBuilder;
        p66[] p66VarArr = this.J2;
        if (p66VarArr == null || this.K2 == null) {
            return;
        }
        TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = this.y2;
        byte b = 2;
        byte b2 = 1;
        TLRPC.User user = this.U1;
        byte b3 = 0;
        if (tL_emojiStatusCollectible != null) {
            String str = tL_emojiStatusCollectible.title;
            int lastIndexOf = str.lastIndexOf(32);
            if (lastIndexOf >= 0) {
                str = str.substring(0, lastIndexOf);
            }
            this.J2[0].setText(hl.N2(ob6.a0(null, null, 2131743872, wf3.t(user), str), -1, 0, new el8(this, b3), null));
            this.K2.setText(hl.S2(ob6.M0(2131743870, null)));
        } else if (this.x2 != null) {
            CharSequence e1 = e1(ob6.a0(null, null, 2131743869, lv2.m(0, user.first_name, user.last_name), "<STICKERSET>"));
            try {
                e1 = pv3.m(e1, this.J2[0].getPaint().getFontMetricsInt(), false, null, 0);
            } catch (Exception unused) {
            }
            SpannableStringBuilder spannableStringBuilder2 = e1 instanceof SpannableStringBuilder ? (SpannableStringBuilder) e1 : new SpannableStringBuilder(e1);
            int indexOf = e1.toString().indexOf("<STICKERSET>");
            if (indexOf >= 0) {
                TLRPC.TL_messages_stickerSet n0 = ls6.d0(this.T1).n0(this.x2, false);
                if (n0 == null || n0.documents.isEmpty()) {
                    document = null;
                } else {
                    document = n0.documents.get(0);
                    if (n0.set != null) {
                        int i = 0;
                        while (true) {
                            if (i >= n0.documents.size()) {
                                break;
                            }
                            if (n0.documents.get(i).id == n0.set.thumb_document_id) {
                                document = n0.documents.get(i);
                                break;
                            }
                            i++;
                        }
                    }
                }
                if (document != null) {
                    spannableStringBuilder = new SpannableStringBuilder("x");
                    spannableStringBuilder.setSpan(new hm(document, this.J2[0].getPaint().getFontMetricsInt()), 0, spannableStringBuilder.length(), 33);
                    if (n0 != null && n0.set != null) {
                        spannableStringBuilder.append((CharSequence) " ").append((CharSequence) n0.set.title);
                    }
                } else {
                    spannableStringBuilder = new SpannableStringBuilder("xxxxxx");
                    spannableStringBuilder.setSpan(new ya6(hl.L(100.0f), this.J2[0]), 0, spannableStringBuilder.length(), 33);
                }
                spannableStringBuilder2.replace(indexOf, indexOf + 12, (CharSequence) spannableStringBuilder);
                spannableStringBuilder2.setSpan(new a31(this, (byte) 9), indexOf, spannableStringBuilder.length() + indexOf, 33);
                this.J2[1].setOnLinkPressListener(new r94(this, b2));
                p66[] p66VarArr2 = this.J2;
                if (document == null) {
                    p66VarArr2[0].setText(spannableStringBuilder2, (TextView.BufferType) null);
                } else if (p66VarArr2 != null) {
                    p66VarArr2[1].setText(spannableStringBuilder2);
                    if (this.J2[1].getVisibility() != 0) {
                        p66[] p66VarArr3 = this.J2;
                        if (z) {
                            p66VarArr3[1].setAlpha(0.0f);
                            this.J2[1].setVisibility(0);
                            ViewPropertyAnimator alpha = this.J2[1].animate().alpha(1.0f);
                            k43 k43Var = k43.f;
                            ik8.t(alpha, k43Var, 200L);
                            this.J2[0].animate().alpha(0.0f).setInterpolator(k43Var).setDuration(200L).withEndAction(new el8(this, b)).start();
                            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                            ofFloat.addUpdateListener(new gl8(this, b3));
                            ofFloat.setInterpolator(k43Var);
                            ofFloat.setDuration(200L);
                            ofFloat.start();
                        } else {
                            p66VarArr3[1].setAlpha(1.0f);
                            this.J2[1].setVisibility(0);
                            this.J2[0].setAlpha(0.0f);
                            this.J2[0].setVisibility(8);
                        }
                    }
                }
            }
            this.K2.setText(hl.S2(ob6.M0(2131743870, null)));
        } else if (this.z2) {
            p66VarArr[0].setText(hl.S2(ob6.a0(null, null, 2131743871, lv2.m(0, user.first_name, user.last_name))));
            this.K2.setText(hl.S2(ob6.a0(null, null, 2131743870, lv2.m(0, user.first_name, user.last_name))));
        } else {
            pw4 pw4Var = this.V1;
            if (pw4Var == null) {
                TL_stars.StarGift starGift = this.W1;
                if (starGift != null) {
                    p66VarArr[0].setText(ob6.M0(2131750026, null));
                    this.J2[0].setTextSize(1, 20.0f);
                    boolean z2 = starGift.limited_per_user;
                    p66 p66Var = this.K2;
                    if (z2) {
                        p66Var.setText(hl.S2(ob6.H(',', "Gift2PremiumSubtitleMany", starGift.per_user_total)));
                    } else {
                        p66Var.setText(hl.S2(ob6.M0(2131750030, null)));
                    }
                    this.K2.setTextSize(1, 14.0f);
                } else if (user == null) {
                    p66VarArr[0].setText(ob6.M0(2131743884, null));
                    this.K2.setText(hl.S2(ob6.M0(2131743882, null)));
                } else {
                    p66VarArr[0].setText(e1(ob6.a0(null, null, 2131743878, lv2.m(0, user.first_name, user.last_name))));
                    this.K2.setText(hl.S2(ob6.M0(2131743879, null)));
                }
            } else if (this.X1) {
                p66VarArr[0].setText(e1(ob6.a0(null, null, 2131743873, user != null ? user.first_name : "", ob6.G(pw4Var.d(), "GiftMonths", new Object[0]))));
                this.K2.setText(e1(ob6.a0(null, null, 2131743874, user != null ? user.first_name : "")));
            } else if (user == null || TextUtils.isEmpty(user.first_name) || user.id == 777000) {
                this.J2[0].setText(e1(ob6.a0(null, null, 2131743875, ob6.G(pw4Var.d(), "GiftMonths", new Object[0]))));
                this.K2.setText(hl.S2(ob6.M0(2131743877, null)));
            } else {
                this.J2[0].setText(e1(ob6.a0(null, null, 2131743876, user.first_name, ob6.G(pw4Var.d(), "GiftMonths", new Object[0]))));
                this.K2.setText(hl.S2(ob6.M0(2131743877, null)));
            }
        }
        try {
            p66 p66Var2 = this.J2[0];
            p66Var2.setText(pv3.m(p66Var2.getText(), this.J2[0].getPaint().getFontMetricsInt(), false, null, 0));
        } catch (Exception unused2) {
        }
    }

    public void g1() {
        int i = this.a2;
        int i2 = i + 1;
        this.a2 = i2;
        this.b2 = i;
        this.e2 = i2;
        int size = this.S1.size() + i2;
        this.f2 = size;
        this.a2 = size + 1;
        this.g2 = size;
        if (yac.h(this.T1).p() || this.V1 != null) {
            return;
        }
        int i3 = this.a2;
        this.a2 = i3 + 1;
        this.h2 = i3;
    }

    @Override // nx0
    public final boolean j0() {
        Drawable drawable;
        if (this.v2 == null) {
            return false;
        }
        byte b = 2;
        this.D2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.B2 = 0.0f;
        byte b2 = 1;
        this.C2 = true;
        this.n2.invalidate();
        View view = this.v2;
        if (view instanceof ema) {
            drawable = ((ema) view).getRightDrawable();
        } else if (view instanceof wb2) {
            wb2 wb2Var = (wb2) view;
            ul ulVar = wb2Var.Ca;
            wb2Var.r2();
            drawable = ulVar;
        } else {
            drawable = null;
        }
        if (drawable != null) {
            drawable.setAlpha(0);
        }
        View view2 = this.v2;
        if (view2 instanceof wb2) {
            ((wb2) view2).r2();
        } else {
            view2.invalidate();
        }
        i94 i94Var = this.m2;
        if (i94Var != null) {
            i94Var.m(100L);
        }
        this.D2.addUpdateListener(new gl8(this, b2));
        this.D2.addListener(new wd8(this, drawable, b));
        this.D2.setDuration(600L);
        this.D2.setInterpolator(k43.h);
        this.D2.start();
        return false;
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        jn7.f(yac.t0).b(this, jn7.B0);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        jn7.f(yac.t0).n(this, jn7.B0);
    }

    @Override // nx0, android.app.Dialog
    public final void show() {
        super.show();
        byte b = 1;
        jn7.e().k(jn7.j1, 4);
        if (this.E2) {
            hl.d3(new el8(this, b), 200L);
        }
    }

    @Override // nx0, ag0
    public final boolean u(Dialog dialog) {
        i94 i94Var = this.m2;
        if (i94Var != null) {
            i94Var.setDialogVisible(true);
        }
        this.l2.setPaused(true);
        dialog.setOnDismissListener(new dl8(this, (byte) 0));
        dialog.show();
        return true;
    }

    public void c1(View view) {
    }

    public void Z0(int i, View view) {
    }

    public kl8(e eVar, int i, TLRPC.User user, vnb vnbVar) {
        this(eVar, i, user, null, null, vnbVar);
    }
}
