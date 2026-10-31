package org.telegram.ui.Cells;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.c00;
import org.telegram.messenger.cd;
import org.telegram.messenger.d20;
import org.telegram.messenger.ic;
import org.telegram.messenger.jj;
import org.telegram.messenger.ui;
import org.telegram.messenger.us;
import org.telegram.messenger.z20;
import org.telegram.messenger.zs;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ch0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class s3 extends FrameLayout implements us, org.telegram.ui.ActionBar.k6 {
    public boolean D;
    public Long E;
    public boolean F;
    public Drawable G;
    public boolean a;
    public final int b;
    public final TextView c;
    public final TextView d;
    public final org.telegram.ui.Components.g9 e;
    public final ch0 f;
    public final TextView h;
    public final kg.x0 n;
    public AnimatorSet r;
    public TLRPC.StickerSetCovered s;
    public boolean w;
    public boolean x;
    public boolean y;

    public s3(Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context);
        this.a = org.telegram.ui.ActionBar.t6.I.q();
        this.b = d20.s0;
        TextView textView = new TextView(context);
        this.c = textView;
        org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.G6, null);
        z20.o(textView, 1, 16.0f, 1, 1);
        textView.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setGravity(cd.X ? 5 : 3);
        boolean z10 = cd.X;
        addView(textView, w7.b6.d(-2, -2.0f, z10 ? 5 : 3, z10 ? 22.0f : 71.0f, 10.0f, z10 ? 71.0f : 22.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        org.telegram.ui.ActionBar.a7.V(textView2, org.telegram.ui.ActionBar.t6.z6, null);
        z20.o(textView2, 1, 13.0f, 1, 1);
        textView2.setSingleLine(true);
        textView2.setEllipsize(truncateAt);
        textView2.setGravity(cd.X ? 5 : 3);
        boolean z11 = cd.X;
        addView(textView2, w7.b6.d(-2, -2.0f, z11 ? 5 : 3, z11 ? 100.0f : 71.0f, 35.0f, z11 ? 71.0f : 100.0f, 0.0f));
        org.telegram.ui.Components.g9 g9Var = new org.telegram.ui.Components.g9(context);
        this.e = g9Var;
        g9Var.setAspectFit(true);
        g9Var.setLayerNum(1);
        boolean z12 = cd.X;
        addView(g9Var, w7.b6.d(48, 48.0f, (z12 ? 5 : 3) | 48, z12 ? 0.0f : 12.0f, 8.0f, z12 ? 12.0f : 0.0f, 0.0f));
        ch0 ch0Var = new ch0(context);
        this.f = ch0Var;
        ch0Var.setText(cd.L0(2131754486, null));
        org.telegram.ui.ActionBar.a7.V(ch0Var, org.telegram.ui.ActionBar.t6.Gi, null);
        addView(ch0Var, w7.b6.i(-2.0f, 28.0f, 8388661, 0.0f, 18.0f, 14.0f, 0.0f));
        TextView textView3 = new TextView(context);
        this.h = textView3;
        textView3.setGravity(17);
        org.telegram.messenger.m5.m(textView3, org.telegram.ui.ActionBar.t6.Fi, null, 1, 14.0f);
        textView3.setText(cd.L0(2131744873, null));
        addView(textView3, w7.b6.i(-2.0f, 28.0f, 8388661, 0.0f, 16.0f, 14.0f, 0.0f));
        kg.x0 x0Var = new kg.x0(org.telegram.messenger.i0.L(4.0f), context, p6Var, false);
        this.n = x0Var;
        x0Var.setIcon(R.raw.unlock_icon);
        x0Var.b(cd.L0(2131743901, null), new a(this, 4), false);
        x0Var.setVisibility(8);
        try {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) x0Var.getIconView().getLayoutParams();
            marginLayoutParams.leftMargin = org.telegram.messenger.i0.L(1.0f);
            marginLayoutParams.topMargin = org.telegram.messenger.i0.L(1.0f);
            int L = org.telegram.messenger.i0.L(20.0f);
            marginLayoutParams.height = L;
            marginLayoutParams.width = L;
            ((ViewGroup.MarginLayoutParams) x0Var.getTextView().getLayoutParams()).leftMargin = org.telegram.messenger.i0.L(3.0f);
            x0Var.getChildAt(0).setPadding(org.telegram.messenger.i0.L(8.0f), 0, org.telegram.messenger.i0.L(8.0f), 0);
        } catch (Exception unused) {
        }
        addView(this.n, w7.b6.i(-2.0f, 28.0f, 8388661, 0.0f, 16.0f, 10.0f, 0.0f));
        updateColors();
    }

    public final void a(TLRPC.StickerSetCovered stickerSetCovered, boolean z10, boolean z11, boolean z12) {
        TLRPC.Document document;
        TLRPC.Document document2;
        TLRPC.StickerSetCovered stickerSetCovered2;
        TLRPC.StickerSet stickerSet;
        ArrayList<TLRPC.Document> arrayList;
        AnimatorSet animatorSet = this.r;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.r = null;
        }
        this.y = z10;
        this.s = stickerSetCovered;
        setWillNotDraw(!z10);
        String str = this.s.set.title;
        TextView textView = this.c;
        textView.setText(str);
        textView.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
        TLRPC.StickerSet stickerSet2 = stickerSetCovered.set;
        this.d.setText(cd.G(stickerSet2.count, stickerSet2.emojis ? "EmojiCount" : "Stickers", new Object[0]));
        boolean z13 = stickerSetCovered instanceof TLRPC.TL_stickerSetNoCovered;
        int i10 = this.b;
        if (!z13 || (stickerSet = stickerSetCovered.set) == null) {
            document = stickerSetCovered.cover;
            if (document == null) {
                if (stickerSetCovered.covers.isEmpty()) {
                    if (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered) {
                        TLRPC.TL_stickerSetFullCovered tL_stickerSetFullCovered = (TLRPC.TL_stickerSetFullCovered) stickerSetCovered;
                        if (!tL_stickerSetFullCovered.documents.isEmpty()) {
                            ArrayList<TLRPC.Document> arrayList2 = tL_stickerSetFullCovered.documents;
                            document = arrayList2.get(0);
                            for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                                if (arrayList2.get(i11).id == stickerSetCovered.set.thumb_document_id) {
                                    document2 = arrayList2.get(i11);
                                    document = document2;
                                    break;
                                }
                            }
                        }
                    }
                    document = null;
                } else {
                    document = stickerSetCovered.covers.get(0);
                    if (stickerSetCovered.set != null) {
                        for (int i12 = 0; i12 < stickerSetCovered.covers.size(); i12++) {
                            if (stickerSetCovered.covers.get(i12).id == stickerSetCovered.set.thumb_document_id) {
                                document2 = stickerSetCovered.covers.get(i12);
                                document = document2;
                                break;
                            }
                        }
                    }
                }
            }
        } else {
            this.E = Long.valueOf(stickerSet.id);
            if (!this.D) {
                zs.f(i10).c(this, zs.B0);
                this.D = true;
            }
            TLRPC.TL_messages_stickerSet l02 = ui.b0(i10).l0(ui.Z(stickerSetCovered.set), Integer.valueOf(stickerSetCovered.set.hash), false, false, null);
            if (l02 != null && (arrayList = l02.documents) != null && !arrayList.isEmpty()) {
                document = l02.documents.get(0);
                int i13 = 0;
                while (true) {
                    if (i13 >= l02.documents.size()) {
                        break;
                    }
                    if (l02.documents.get(i13).id == stickerSetCovered.set.thumb_document_id) {
                        document = l02.documents.get(i13);
                        break;
                    }
                    i13++;
                }
            }
            document = null;
        }
        org.telegram.ui.Components.g9 g9Var = this.e;
        if (document != null) {
            if (jj.p(document)) {
                TLObject w9 = org.telegram.messenger.b8.w(stickerSetCovered.set.thumbs, 90, false, null, false);
                if (w9 == null) {
                    w9 = document;
                }
                c00 d = org.telegram.messenger.v5.d(stickerSetCovered.set.thumbs, org.telegram.ui.ActionBar.t6.a7, 1.0f, false);
                boolean z14 = w9 instanceof TLRPC.Document;
                ic c10 = z14 ? ic.c(org.telegram.messenger.b8.w(document.thumbs, 90, false, null, false), document) : ic.k((TLRPC.PhotoSize) w9, document, stickerSetCovered.set.thumb_version);
                if (z14 && (jj.K2(document, true) || jj.N4(document))) {
                    if (d != null) {
                        g9Var.p(ic.b(document), "50_50", d, stickerSetCovered);
                    } else {
                        g9Var.l(ic.b(document), "50_50", c10, null, 0, stickerSetCovered);
                    }
                } else if (c10 == null || c10.p != 1) {
                    g9Var.k(c10, "50_50", "webp", d, stickerSetCovered);
                } else {
                    g9Var.k(c10, "50_50", "tgs", d, stickerSetCovered);
                }
            } else {
                TLRPC.PhotoSize w10 = org.telegram.messenger.b8.w(document.thumbs, 90, false, null, false);
                if (w10 != null) {
                    g9Var.k(ic.c(w10, document), "50_50", "webp", null, stickerSetCovered);
                } else {
                    g9Var.k(ic.b(document), "50_50", "webp", null, stickerSetCovered);
                }
            }
            stickerSetCovered2 = stickerSetCovered;
        } else {
            stickerSetCovered2 = stickerSetCovered;
            g9Var.k(null, null, "webp", null, stickerSetCovered2);
        }
        ch0 ch0Var = this.f;
        ch0Var.setVisibility(0);
        this.F = z11;
        this.w = z11 || ui.b0(i10).B0(stickerSetCovered2.set.id, true);
        boolean z15 = !d20.i(i10).q() && jj.U3(stickerSetCovered2);
        this.x = z15;
        kg.x0 x0Var = this.n;
        TextView textView2 = this.h;
        if (z12) {
            if (z15) {
                x0Var.setVisibility(0);
                textView2.setVisibility(0);
                ch0Var.setVisibility(0);
            } else {
                x0Var.setVisibility(0);
                if (this.w) {
                    textView2.setVisibility(0);
                } else {
                    ch0Var.setVisibility(0);
                }
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.r = animatorSet2;
            animatorSet2.setDuration(250L);
            AnimatorSet animatorSet3 = this.r;
            float[] fArr = {(!this.w || this.x) ? 0.0f : 1.0f};
            Property property = View.ALPHA;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView2, (Property<TextView, Float>) property, fArr);
            float[] fArr2 = {(!this.w || this.x) ? 0.0f : 1.0f};
            Property property2 = View.SCALE_X;
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(textView2, (Property<TextView, Float>) property2, fArr2);
            float[] fArr3 = {(!this.w || this.x) ? 0.0f : 1.0f};
            Property property3 = View.SCALE_Y;
            animatorSet3.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(textView2, (Property<TextView, Float>) property3, fArr3), ObjectAnimator.ofFloat(ch0Var, (Property<ch0, Float>) property, (this.w || this.x) ? 0.0f : 1.0f), ObjectAnimator.ofFloat(ch0Var, (Property<ch0, Float>) property2, (this.w || this.x) ? 0.0f : 1.0f), ObjectAnimator.ofFloat(x0Var, (Property<kg.x0, Float>) property3, !this.x ? 0.0f : 1.0f), ObjectAnimator.ofFloat(x0Var, (Property<kg.x0, Float>) property2, !this.x ? 0.0f : 1.0f), ObjectAnimator.ofFloat(x0Var, (Property<kg.x0, Float>) property3, !this.x ? 0.0f : 1.0f));
            this.r.addListener(new q3(this));
            this.r.setInterpolator(new OvershootInterpolator(1.02f));
            this.r.start();
            return;
        }
        if (z15) {
            x0Var.setVisibility(0);
            x0Var.setAlpha(1.0f);
            x0Var.setScaleX(1.0f);
            x0Var.setScaleY(1.0f);
            ch0Var.setVisibility(4);
            ch0Var.setAlpha(0.0f);
            ch0Var.setScaleX(0.0f);
            ch0Var.setScaleY(0.0f);
            textView2.setVisibility(4);
            textView2.setAlpha(0.0f);
            textView2.setScaleX(0.0f);
            textView2.setScaleY(0.0f);
            return;
        }
        x0Var.setVisibility(8);
        x0Var.setAlpha(0.0f);
        x0Var.setScaleX(0.0f);
        x0Var.setScaleY(0.0f);
        if (this.w) {
            textView2.setVisibility(0);
            textView2.setAlpha(1.0f);
            textView2.setScaleX(1.0f);
            textView2.setScaleY(1.0f);
            ch0Var.setVisibility(4);
            ch0Var.setAlpha(0.0f);
            ch0Var.setScaleX(0.0f);
            ch0Var.setScaleY(0.0f);
            return;
        }
        ch0Var.setVisibility(0);
        ch0Var.setAlpha(1.0f);
        ch0Var.setScaleX(1.0f);
        ch0Var.setScaleY(1.0f);
        textView2.setVisibility(4);
        textView2.setAlpha(0.0f);
        textView2.setScaleX(0.0f);
        textView2.setScaleY(0.0f);
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Bi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Ci));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.d7));
    }

    @Override // org.telegram.messenger.us
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == zs.B0) {
            long longValue = ((Long) objArr[0]).longValue();
            Long l4 = this.E;
            if (l4 == null || l4.longValue() != longValue) {
                return;
            }
            this.E = null;
            TLRPC.TL_stickerSetNoCovered tL_stickerSetNoCovered = new TLRPC.TL_stickerSetNoCovered();
            tL_stickerSetNoCovered.set = ((TLRPC.TL_messages_stickerSet) objArr[1]).set;
            a(tL_stickerSetNoCovered, this.y, this.F, true);
        }
    }

    public org.telegram.ui.Components.g9 getImageView() {
        return this.e;
    }

    public TLRPC.StickerSetCovered getStickerSet() {
        return this.s;
    }

    public TextView getTextView() {
        return this.c;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.D) {
            zs.f(this.b).n(this, zs.B0);
            this.D = false;
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.y) {
            canvas.drawLine(cd.X ? 0.0f : org.telegram.messenger.i0.L(71.0f), getHeight() - 1, getWidth() - (cd.X ? org.telegram.messenger.i0.L(71.0f) : 0), getHeight() - 1, org.telegram.ui.ActionBar.t6.k0);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(64.0f) + (this.y ? 1 : 0), TLObject.FLAG_30));
        int measuredWidth = this.f.getMeasuredWidth();
        TextView textView = this.h;
        int measuredWidth2 = textView.getMeasuredWidth();
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) textView.getLayoutParams();
        if (measuredWidth2 < measuredWidth) {
            layoutParams.rightMargin = i0.a.u(measuredWidth, measuredWidth2, 2, org.telegram.messenger.i0.L(14.0f));
        } else {
            layoutParams.rightMargin = org.telegram.messenger.i0.L(14.0f);
        }
        measureChildWithMargins(this.c, i10, measuredWidth, i11, 0);
    }

    public void setAddOnClickListener(View.OnClickListener onClickListener) {
        this.f.setOnClickListener(onClickListener);
        this.h.setOnClickListener(onClickListener);
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final void updateColors() {
        ch0 ch0Var = this.f;
        if (ch0Var == null) {
            return;
        }
        ch0Var.setProgressColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Bi, false));
        try {
            Drawable background = ch0Var.getBackground();
            if (background != null && background == this.G && (background instanceof RippleDrawable)) {
                RippleDrawable rippleDrawable = (RippleDrawable) background;
                if (rippleDrawable.getNumberOfLayers() > 0 && rippleDrawable.getId(0) != 16908334 && (rippleDrawable.getDrawable(0) instanceof ShapeDrawable)) {
                    int x02 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Ci, false);
                    ShapeDrawable shapeDrawable = (ShapeDrawable) rippleDrawable.getDrawable(0);
                    if (shapeDrawable.getPaint().getColor() == x02 && this.a == org.telegram.ui.ActionBar.t6.I.q()) {
                        return;
                    }
                    this.a = org.telegram.ui.ActionBar.t6.I.q();
                    shapeDrawable.getPaint().setColor(x02);
                    rippleDrawable.setColor(ColorStateList.valueOf(org.telegram.ui.ActionBar.j6.b(x02)));
                    rippleDrawable.invalidateSelf();
                    return;
                }
            }
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
        int x03 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Ci, false);
        org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Ei, false);
        ch0Var.setBackground(org.telegram.ui.ActionBar.j6.e(x03, 14.0f));
        this.G = ch0Var.getBackground();
    }
}
