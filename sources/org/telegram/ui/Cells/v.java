package org.telegram.ui.Cells;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.c00;
import org.telegram.messenger.cd;
import org.telegram.messenger.ic;
import org.telegram.messenger.jj;
import org.telegram.messenger.ui;
import org.telegram.messenger.z20;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ch0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class v extends FrameLayout implements Checkable {
    public final boolean a;
    public final TextView b;
    public final TextView c;
    public final org.telegram.ui.Components.g9 d;
    public final ch0 e;
    public final ch0 f;
    public boolean h;
    public Button n;
    public AnimatorSet r;
    public TLRPC.StickerSetCovered s;
    public u w;
    public boolean x;

    public v(Context context, boolean z10) {
        super(context);
        this.a = z10;
        if (z10) {
            ch0 ch0Var = new ch0(context);
            this.f = ch0Var;
            this.n = ch0Var;
            ch0Var.setText(cd.L0(2131754486, null));
            org.telegram.ui.ActionBar.a7.V(ch0Var, org.telegram.ui.ActionBar.t6.Gi, null);
            ch0Var.setProgressColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Bi, false));
            int i10 = org.telegram.ui.ActionBar.t6.Ci;
            int x02 = org.telegram.ui.ActionBar.t6.x0(null, i10, false);
            org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Ei, false);
            ch0Var.setBackground(org.telegram.ui.ActionBar.j6.e(x02, 14.0f));
            Drawable background = ch0Var.getBackground();
            org.telegram.ui.ActionBar.w6 N = org.telegram.ui.ActionBar.a7.N(i10);
            ch0Var.setBackground(background);
            org.telegram.ui.ActionBar.a7.k(ch0Var, background, N, null, null);
            addView(ch0Var, w7.b6.i(-2.0f, 28.0f, 8388661, 0.0f, 18.0f, 14.0f, 0.0f));
            int L = org.telegram.messenger.i0.L(60.0f);
            ch0 ch0Var2 = new ch0(context);
            this.e = ch0Var2;
            ch0Var2.setAllCaps(false);
            ch0Var2.setMinWidth(L);
            ch0Var2.setMinimumWidth(L);
            ch0Var2.setTextSize(1, 14.0f);
            int i11 = org.telegram.ui.ActionBar.t6.Fi;
            org.telegram.ui.ActionBar.a7.V(ch0Var2, i11, null);
            ch0Var2.setText(cd.L0(2131744873, null));
            y J0 = org.telegram.ui.ActionBar.t6.J0(org.telegram.messenger.i0.L(3.0f), org.telegram.ui.ActionBar.t6.x0(null, i11, false));
            org.telegram.ui.ActionBar.w6 h = org.telegram.ui.ActionBar.a7.h(i11, 25);
            ch0Var2.setBackground(J0);
            org.telegram.ui.ActionBar.a7.k(ch0Var2, J0, null, h, null);
            ch0Var2.setTypeface(org.telegram.messenger.i0.o());
            w7.i6.a(ch0Var2, 8.0f, 0.0f, 8.0f, 0.0f);
            ch0Var2.setOutlineProvider(null);
            addView(ch0Var2, w7.b6.i(-2.0f, 28.0f, 8388661, 0.0f, 18.0f, 14.0f, 0.0f));
            a aVar = new a(this, 2);
            ch0Var.setOnClickListener(aVar);
            ch0Var2.setOnClickListener(aVar);
            c(false);
        } else {
            this.f = null;
            this.e = null;
        }
        TextView textView = new TextView(context);
        this.b = textView;
        org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.G6, null);
        z20.o(textView, 1, 16.0f, 1, 1);
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setGravity(w7.b6.y());
        addView(textView, w7.b6.i(-2.0f, -2.0f, 8388611, 71.0f, 10.0f, 21.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.c = textView2;
        org.telegram.ui.ActionBar.a7.V(textView2, org.telegram.ui.ActionBar.t6.z6, null);
        z20.o(textView2, 1, 13.0f, 1, 1);
        textView2.setSingleLine(true);
        textView2.setGravity(w7.b6.y());
        addView(textView2, w7.b6.i(-2.0f, -2.0f, 8388611, 71.0f, 35.0f, 21.0f, 0.0f));
        org.telegram.ui.Components.g9 g9Var = new org.telegram.ui.Components.g9(context);
        this.d = g9Var;
        g9Var.setAspectFit(true);
        g9Var.setLayerNum(1);
        addView(g9Var, w7.b6.i(48.0f, 48.0f, 8388659, 12.0f, 8.0f, 0.0f, 0.0f));
    }

    public final void a(boolean z10, boolean z11, boolean z12) {
        u uVar;
        int i10;
        if (!this.a || this.x == z10) {
            return;
        }
        this.x = z10;
        c(z11);
        if (!z12 || (uVar = this.w) == null) {
            return;
        }
        ng.d dVar = (ng.d) uVar;
        org.telegram.ui.n nVar = ((org.telegram.ui.m) dVar.b).d;
        TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) dVar.c;
        a0.h hVar = nVar.a;
        if (z10) {
            a(false, false, false);
            if (hVar.h(stickerSetCovered.set.id) >= 0) {
                return;
            }
            ch0 ch0Var = this.f;
            if (ch0Var != null) {
                ch0Var.a(true, true);
            }
            hVar.k(stickerSetCovered, stickerSetCovered.set.id);
        }
        i10 = ((org.telegram.ui.ActionBar.k2) nVar).currentAccount;
        ui.b0(i10).f2(nVar.getParentActivity(), stickerSetCovered, z10 ? 2 : 1, nVar, false, false);
    }

    public final void b(TLRPC.StickerSetCovered stickerSetCovered, boolean z10) {
        TLRPC.Document document;
        this.h = z10;
        this.s = stickerSetCovered;
        setWillNotDraw(!z10);
        this.b.setText(this.s.set.title);
        TLRPC.StickerSet stickerSet = stickerSetCovered.set;
        boolean z11 = stickerSet.emojis;
        TextView textView = this.c;
        if (z11) {
            textView.setText(cd.G(stickerSet.count, "EmojiCount", new Object[0]));
        } else {
            textView.setText(cd.G(stickerSet.count, "Stickers", new Object[0]));
        }
        if (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered) {
            ArrayList<TLRPC.Document> arrayList = ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered).documents;
            if (arrayList == null) {
                return;
            }
            long j10 = stickerSetCovered.set.thumb_document_id;
            int i10 = 0;
            while (true) {
                if (i10 >= arrayList.size()) {
                    document = null;
                    break;
                }
                document = arrayList.get(i10);
                if (document != null && document.id == j10) {
                    break;
                } else {
                    i10++;
                }
            }
            if (document == null && !arrayList.isEmpty()) {
                document = arrayList.get(0);
            }
        } else {
            document = stickerSetCovered.cover;
            if (document == null) {
                document = !stickerSetCovered.covers.isEmpty() ? stickerSetCovered.covers.get(0) : null;
            }
        }
        org.telegram.ui.Components.g9 g9Var = this.d;
        if (document == null) {
            g9Var.k(null, null, "webp", null, stickerSetCovered);
            return;
        }
        TLObject w9 = org.telegram.messenger.b8.w(stickerSetCovered.set.thumbs, 90, false, null, false);
        if (w9 == null) {
            w9 = document;
        }
        c00 d = org.telegram.messenger.v5.d(stickerSetCovered.set.thumbs, org.telegram.ui.ActionBar.t6.a7, 1.0f, false);
        boolean z12 = w9 instanceof TLRPC.Document;
        ic c10 = z12 ? ic.c(org.telegram.messenger.b8.w(document.thumbs, 90, false, null, false), document) : ic.k((TLRPC.PhotoSize) w9, document, stickerSetCovered.set.thumb_version);
        if (z12 && (jj.K2(document, true) || jj.N4(document))) {
            if (d != null) {
                g9Var.p(ic.b(document), "50_50", d, stickerSetCovered);
                return;
            } else {
                g9Var.l(ic.b(document), "50_50", c10, null, 0, stickerSetCovered);
                return;
            }
        }
        if (c10 == null || c10.p != 1) {
            g9Var.k(c10, "50_50", "webp", d, stickerSetCovered);
        } else {
            g9Var.k(c10, "50_50", "tgs", d, stickerSetCovered);
        }
    }

    public final void c(boolean z10) {
        if (this.a) {
            AnimatorSet animatorSet = this.r;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            boolean z11 = this.x;
            float f7 = z11 ? 1.0f : 0.0f;
            float f10 = z11 ? 0.0f : 1.0f;
            ch0 ch0Var = this.f;
            ch0 ch0Var2 = this.e;
            if (!z10) {
                ch0Var2.setVisibility(z11 ? 0 : 4);
                ch0Var2.setAlpha(f7);
                ch0Var2.setScaleX(f7);
                ch0Var2.setScaleY(f7);
                ch0Var.setVisibility(this.x ? 4 : 0);
                ch0Var.setAlpha(f10);
                ch0Var.setScaleX(f10);
                ch0Var.setScaleY(f10);
                return;
            }
            this.n = z11 ? ch0Var2 : ch0Var;
            ch0Var.setVisibility(0);
            ch0Var2.setVisibility(0);
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.r = animatorSet2;
            animatorSet2.setDuration(250L);
            AnimatorSet animatorSet3 = this.r;
            Property property = View.ALPHA;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(ch0Var2, (Property<ch0, Float>) property, f7);
            Property property2 = View.SCALE_X;
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(ch0Var2, (Property<ch0, Float>) property2, f7);
            float[] fArr = {f7};
            Property property3 = View.SCALE_Y;
            animatorSet3.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(ch0Var2, (Property<ch0, Float>) property3, fArr), ObjectAnimator.ofFloat(ch0Var, (Property<ch0, Float>) property, f10), ObjectAnimator.ofFloat(ch0Var, (Property<ch0, Float>) property2, f10), ObjectAnimator.ofFloat(ch0Var, (Property<ch0, Float>) property3, f10));
            this.r.addListener(new org.telegram.ui.s9(this, 2));
            this.r.setInterpolator(new OvershootInterpolator(1.02f));
            this.r.start();
        }
    }

    public TLRPC.StickerSetCovered getStickersSet() {
        return this.s;
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.x;
    }

    @Override // android.view.ViewGroup
    public final void measureChildWithMargins(View view, int i10, int i11, int i12, int i13) {
        if (this.a && view == this.b) {
            i11 += Math.max(this.f.getMeasuredWidth(), this.e.getMeasuredWidth());
        }
        super.measureChildWithMargins(view, i10, i11, i12, i13);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.h) {
            canvas.drawLine(0.0f, getHeight() - 1, getWidth() - getPaddingRight(), getHeight() - 1, org.telegram.ui.ActionBar.t6.k0);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(64.0f) + (this.h ? 1 : 0), TLObject.FLAG_30));
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z10) {
        a(z10, true, true);
    }

    public void setOnCheckedChangeListener(u uVar) {
        this.w = uVar;
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        if (this.a) {
            setChecked(!this.x);
        }
    }
}
