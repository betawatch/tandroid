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
import org.telegram.messenger.hc;
import org.telegram.messenger.id;
import org.telegram.messenger.ij;
import org.telegram.messenger.ls;
import org.telegram.messenger.p10;
import org.telegram.messenger.qs;
import org.telegram.messenger.rz;
import org.telegram.messenger.ui;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.bg0;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class q3 extends FrameLayout implements ls, org.telegram.ui.ActionBar.b6 {
    public boolean D;
    public Long E;
    public boolean F;
    public Drawable G;
    public boolean a;
    public final int b;
    public final TextView c;
    public final TextView d;
    public final org.telegram.ui.Components.l9 e;
    public final bg0 f;
    public final TextView h;
    public final ug.p0 n;
    public AnimatorSet r;
    public TLRPC.StickerSetCovered s;
    public boolean w;
    public boolean x;
    public boolean y;

    public q3(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.a = org.telegram.ui.ActionBar.l6.I.q();
        this.b = p10.s0;
        TextView textView = new TextView(context);
        this.c = textView;
        org.telegram.ui.ActionBar.s6.U(textView, org.telegram.ui.ActionBar.l6.G6, null);
        org.telegram.messenger.camera.q.n(textView, 1, 16.0f, 1, 1);
        textView.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setGravity(id.a0 ? 5 : 3);
        boolean z9 = id.a0;
        addView(textView, c8.ha.d(-2, -2.0f, z9 ? 5 : 3, z9 ? 22.0f : 71.0f, 10.0f, z9 ? 71.0f : 22.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        org.telegram.ui.ActionBar.s6.U(textView2, org.telegram.ui.ActionBar.l6.z6, null);
        org.telegram.messenger.camera.q.n(textView2, 1, 13.0f, 1, 1);
        textView2.setSingleLine(true);
        textView2.setEllipsize(truncateAt);
        textView2.setGravity(id.a0 ? 5 : 3);
        boolean z10 = id.a0;
        addView(textView2, c8.ha.d(-2, -2.0f, z10 ? 5 : 3, z10 ? 100.0f : 71.0f, 35.0f, z10 ? 71.0f : 100.0f, 0.0f));
        org.telegram.ui.Components.l9 l9Var = new org.telegram.ui.Components.l9(context);
        this.e = l9Var;
        l9Var.setAspectFit(true);
        l9Var.setLayerNum(1);
        boolean z11 = id.a0;
        addView(l9Var, c8.ha.d(48, 48.0f, (z11 ? 5 : 3) | 48, z11 ? 0.0f : 12.0f, 8.0f, z11 ? 12.0f : 0.0f, 0.0f));
        bg0 bg0Var = new bg0(context);
        this.f = bg0Var;
        bg0Var.setText(id.M0(2131754486, null));
        org.telegram.ui.ActionBar.s6.U(bg0Var, org.telegram.ui.ActionBar.l6.Gi, null);
        addView(bg0Var, c8.ha.i(-2.0f, 28.0f, 8388661, 0.0f, 18.0f, 14.0f, 0.0f));
        TextView textView3 = new TextView(context);
        this.h = textView3;
        textView3.setGravity(17);
        org.telegram.messenger.k5.n(textView3, org.telegram.ui.ActionBar.l6.Fi, null, 1, 14.0f);
        textView3.setText(id.M0(2131744855, null));
        addView(textView3, c8.ha.i(-2.0f, 28.0f, 8388661, 0.0f, 16.0f, 14.0f, 0.0f));
        ug.p0 p0Var = new ug.p0(org.telegram.messenger.g0.L(4.0f), context, g6Var, false);
        this.n = p0Var;
        p0Var.setIcon(R.raw.unlock_icon);
        p0Var.b(id.M0(2131743876, null), new a(this, 4), false);
        p0Var.setVisibility(8);
        try {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) p0Var.getIconView().getLayoutParams();
            marginLayoutParams.leftMargin = org.telegram.messenger.g0.L(1.0f);
            marginLayoutParams.topMargin = org.telegram.messenger.g0.L(1.0f);
            int L = org.telegram.messenger.g0.L(20.0f);
            marginLayoutParams.height = L;
            marginLayoutParams.width = L;
            ((ViewGroup.MarginLayoutParams) p0Var.getTextView().getLayoutParams()).leftMargin = org.telegram.messenger.g0.L(3.0f);
            p0Var.getChildAt(0).setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
        } catch (Exception unused) {
        }
        addView(this.n, c8.ha.i(-2.0f, 28.0f, 8388661, 0.0f, 16.0f, 10.0f, 0.0f));
        updateColors();
    }

    public final void a(TLRPC.StickerSetCovered stickerSetCovered, boolean z9, boolean z10, boolean z11) {
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
        this.y = z9;
        this.s = stickerSetCovered;
        setWillNotDraw(!z9);
        String str = this.s.set.title;
        TextView textView = this.c;
        textView.setText(str);
        textView.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
        TLRPC.StickerSet stickerSet2 = stickerSetCovered.set;
        this.d.setText(id.G(stickerSet2.count, stickerSet2.emojis ? "EmojiCount" : "Stickers", new Object[0]));
        boolean z12 = stickerSetCovered instanceof TLRPC.TL_stickerSetNoCovered;
        int i7 = this.b;
        if (!z12 || (stickerSet = stickerSetCovered.set) == null) {
            document = stickerSetCovered.cover;
            if (document == null) {
                if (stickerSetCovered.covers.isEmpty()) {
                    if (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered) {
                        TLRPC.TL_stickerSetFullCovered tL_stickerSetFullCovered = (TLRPC.TL_stickerSetFullCovered) stickerSetCovered;
                        if (!tL_stickerSetFullCovered.documents.isEmpty()) {
                            ArrayList<TLRPC.Document> arrayList2 = tL_stickerSetFullCovered.documents;
                            document = arrayList2.get(0);
                            for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                                if (arrayList2.get(i10).id == stickerSetCovered.set.thumb_document_id) {
                                    document2 = arrayList2.get(i10);
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
                        for (int i11 = 0; i11 < stickerSetCovered.covers.size(); i11++) {
                            if (stickerSetCovered.covers.get(i11).id == stickerSetCovered.set.thumb_document_id) {
                                document2 = stickerSetCovered.covers.get(i11);
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
                qs.f(i7).c(this, qs.B0);
                this.D = true;
            }
            TLRPC.TL_messages_stickerSet l02 = ui.b0(i7).l0(ui.Z(stickerSetCovered.set), Integer.valueOf(stickerSetCovered.set.hash), false, false, null);
            if (l02 != null && (arrayList = l02.documents) != null && !arrayList.isEmpty()) {
                document = l02.documents.get(0);
                int i12 = 0;
                while (true) {
                    if (i12 >= l02.documents.size()) {
                        break;
                    }
                    if (l02.documents.get(i12).id == stickerSetCovered.set.thumb_document_id) {
                        document = l02.documents.get(i12);
                        break;
                    }
                    i12++;
                }
            }
            document = null;
        }
        org.telegram.ui.Components.l9 l9Var = this.e;
        if (document != null) {
            if (ij.p(document)) {
                TLObject w10 = org.telegram.messenger.w7.w(stickerSetCovered.set.thumbs, 90, false, null, false);
                if (w10 == null) {
                    w10 = document;
                }
                rz d = org.telegram.messenger.t5.d(stickerSetCovered.set.thumbs, org.telegram.ui.ActionBar.l6.a7, 1.0f, false);
                boolean z13 = w10 instanceof TLRPC.Document;
                hc c10 = z13 ? hc.c(org.telegram.messenger.w7.w(document.thumbs, 90, false, null, false), document) : hc.k((TLRPC.PhotoSize) w10, document, stickerSetCovered.set.thumb_version);
                if (z13 && (ij.K2(document, true) || ij.N4(document))) {
                    if (d != null) {
                        l9Var.p(hc.b(document), "50_50", d, stickerSetCovered);
                    } else {
                        l9Var.l(hc.b(document), "50_50", c10, null, 0, stickerSetCovered);
                    }
                } else if (c10 == null || c10.p != 1) {
                    l9Var.k(c10, "50_50", "webp", d, stickerSetCovered);
                } else {
                    l9Var.k(c10, "50_50", "tgs", d, stickerSetCovered);
                }
            } else {
                TLRPC.PhotoSize w11 = org.telegram.messenger.w7.w(document.thumbs, 90, false, null, false);
                if (w11 != null) {
                    l9Var.k(hc.c(w11, document), "50_50", "webp", null, stickerSetCovered);
                } else {
                    l9Var.k(hc.b(document), "50_50", "webp", null, stickerSetCovered);
                }
            }
            stickerSetCovered2 = stickerSetCovered;
        } else {
            stickerSetCovered2 = stickerSetCovered;
            l9Var.k(null, null, "webp", null, stickerSetCovered2);
        }
        bg0 bg0Var = this.f;
        bg0Var.setVisibility(0);
        this.F = z10;
        this.w = z10 || ui.b0(i7).B0(stickerSetCovered2.set.id, true);
        boolean z14 = !p10.i(i7).q() && ij.U3(stickerSetCovered2);
        this.x = z14;
        ug.p0 p0Var = this.n;
        TextView textView2 = this.h;
        if (z11) {
            if (z14) {
                p0Var.setVisibility(0);
                textView2.setVisibility(0);
                bg0Var.setVisibility(0);
            } else {
                p0Var.setVisibility(0);
                if (this.w) {
                    textView2.setVisibility(0);
                } else {
                    bg0Var.setVisibility(0);
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
            animatorSet3.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(textView2, (Property<TextView, Float>) property3, fArr3), ObjectAnimator.ofFloat(bg0Var, (Property<bg0, Float>) property, (this.w || this.x) ? 0.0f : 1.0f), ObjectAnimator.ofFloat(bg0Var, (Property<bg0, Float>) property2, (this.w || this.x) ? 0.0f : 1.0f), ObjectAnimator.ofFloat(p0Var, (Property<ug.p0, Float>) property3, !this.x ? 0.0f : 1.0f), ObjectAnimator.ofFloat(p0Var, (Property<ug.p0, Float>) property2, !this.x ? 0.0f : 1.0f), ObjectAnimator.ofFloat(p0Var, (Property<ug.p0, Float>) property3, !this.x ? 0.0f : 1.0f));
            this.r.addListener(new o3(this));
            this.r.setInterpolator(new OvershootInterpolator(1.02f));
            this.r.start();
            return;
        }
        if (z14) {
            p0Var.setVisibility(0);
            p0Var.setAlpha(1.0f);
            p0Var.setScaleX(1.0f);
            p0Var.setScaleY(1.0f);
            bg0Var.setVisibility(4);
            bg0Var.setAlpha(0.0f);
            bg0Var.setScaleX(0.0f);
            bg0Var.setScaleY(0.0f);
            textView2.setVisibility(4);
            textView2.setAlpha(0.0f);
            textView2.setScaleX(0.0f);
            textView2.setScaleY(0.0f);
            return;
        }
        p0Var.setVisibility(8);
        p0Var.setAlpha(0.0f);
        p0Var.setScaleX(0.0f);
        p0Var.setScaleY(0.0f);
        if (this.w) {
            textView2.setVisibility(0);
            textView2.setAlpha(1.0f);
            textView2.setScaleX(1.0f);
            textView2.setScaleY(1.0f);
            bg0Var.setVisibility(4);
            bg0Var.setAlpha(0.0f);
            bg0Var.setScaleX(0.0f);
            bg0Var.setScaleY(0.0f);
            return;
        }
        bg0Var.setVisibility(0);
        bg0Var.setAlpha(1.0f);
        bg0Var.setScaleX(1.0f);
        bg0Var.setScaleY(1.0f);
        textView2.setVisibility(4);
        textView2.setAlpha(0.0f);
        textView2.setScaleX(0.0f);
        textView2.setScaleY(0.0f);
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.Bi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.Ci));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.d7));
    }

    @Override // org.telegram.messenger.ls
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == qs.B0) {
            long longValue = ((Long) objArr[0]).longValue();
            Long l10 = this.E;
            if (l10 == null || l10.longValue() != longValue) {
                return;
            }
            this.E = null;
            TLRPC.TL_stickerSetNoCovered tL_stickerSetNoCovered = new TLRPC.TL_stickerSetNoCovered();
            tL_stickerSetNoCovered.set = ((TLRPC.TL_messages_stickerSet) objArr[1]).set;
            a(tL_stickerSetNoCovered, this.y, this.F, true);
        }
    }

    public org.telegram.ui.Components.l9 getImageView() {
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
            qs.f(this.b).n(this, qs.B0);
            this.D = false;
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.y) {
            canvas.drawLine(id.a0 ? 0.0f : org.telegram.messenger.g0.L(71.0f), getHeight() - 1, getWidth() - (id.a0 ? org.telegram.messenger.g0.L(71.0f) : 0), getHeight() - 1, org.telegram.ui.ActionBar.l6.k0);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(64.0f) + (this.y ? 1 : 0), TLObject.FLAG_30));
        int measuredWidth = this.f.getMeasuredWidth();
        TextView textView = this.h;
        int measuredWidth2 = textView.getMeasuredWidth();
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) textView.getLayoutParams();
        if (measuredWidth2 < measuredWidth) {
            layoutParams.rightMargin = jg.g.D(measuredWidth, measuredWidth2, 2, org.telegram.messenger.g0.L(14.0f));
        } else {
            layoutParams.rightMargin = org.telegram.messenger.g0.L(14.0f);
        }
        measureChildWithMargins(this.c, i7, measuredWidth, i10, 0);
    }

    public void setAddOnClickListener(View.OnClickListener onClickListener) {
        this.f.setOnClickListener(onClickListener);
        this.h.setOnClickListener(onClickListener);
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final void updateColors() {
        bg0 bg0Var = this.f;
        if (bg0Var == null) {
            return;
        }
        bg0Var.setProgressColor(org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.Bi, false));
        try {
            Drawable background = bg0Var.getBackground();
            if (background != null && background == this.G && (background instanceof RippleDrawable)) {
                RippleDrawable rippleDrawable = (RippleDrawable) background;
                if (rippleDrawable.getNumberOfLayers() > 0 && rippleDrawable.getId(0) != 16908334 && (rippleDrawable.getDrawable(0) instanceof ShapeDrawable)) {
                    int x02 = org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.Ci, false);
                    ShapeDrawable shapeDrawable = (ShapeDrawable) rippleDrawable.getDrawable(0);
                    if (shapeDrawable.getPaint().getColor() == x02 && this.a == org.telegram.ui.ActionBar.l6.I.q()) {
                        return;
                    }
                    this.a = org.telegram.ui.ActionBar.l6.I.q();
                    shapeDrawable.getPaint().setColor(x02);
                    rippleDrawable.setColor(ColorStateList.valueOf(org.telegram.ui.ActionBar.a6.b(x02)));
                    rippleDrawable.invalidateSelf();
                    return;
                }
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        int x03 = org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.Ci, false);
        org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.Ei, false);
        bg0Var.setBackground(org.telegram.ui.ActionBar.a6.e(x03, 14.0f));
        this.G = bg0Var.getBackground();
    }
}
