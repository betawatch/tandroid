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
import org.telegram.messenger.hc;
import org.telegram.messenger.id;
import org.telegram.messenger.ij;
import org.telegram.messenger.rz;
import org.telegram.messenger.ui;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ag0;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class v extends FrameLayout implements Checkable {
    public final boolean a;
    public final TextView b;
    public final TextView c;
    public final org.telegram.ui.Components.l9 d;
    public final ag0 e;
    public final ag0 f;
    public boolean h;
    public Button n;
    public AnimatorSet r;
    public TLRPC.StickerSetCovered s;
    public u w;
    public boolean x;

    public v(Context context, boolean z9) {
        super(context);
        this.a = z9;
        if (z9) {
            ag0 ag0Var = new ag0(context);
            this.f = ag0Var;
            this.n = ag0Var;
            ag0Var.setText(id.M0(2131754486, null));
            org.telegram.ui.ActionBar.r6.V(ag0Var, org.telegram.ui.ActionBar.k6.Gi, null);
            ag0Var.setProgressColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Bi, false));
            int i7 = org.telegram.ui.ActionBar.k6.Ci;
            int x02 = org.telegram.ui.ActionBar.k6.x0(null, i7, false);
            org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Ei, false);
            ag0Var.setBackground(org.telegram.ui.ActionBar.z5.e(x02, 14.0f));
            Drawable background = ag0Var.getBackground();
            org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i7);
            ag0Var.setBackground(background);
            org.telegram.ui.ActionBar.r6.k(ag0Var, background, N, null, null);
            addView(ag0Var, c8.ha.i(-2.0f, 28.0f, 8388661, 0.0f, 18.0f, 14.0f, 0.0f));
            int L = org.telegram.messenger.g0.L(60.0f);
            ag0 ag0Var2 = new ag0(context);
            this.e = ag0Var2;
            ag0Var2.setAllCaps(false);
            ag0Var2.setMinWidth(L);
            ag0Var2.setMinimumWidth(L);
            ag0Var2.setTextSize(1, 14.0f);
            int i10 = org.telegram.ui.ActionBar.k6.Fi;
            org.telegram.ui.ActionBar.r6.V(ag0Var2, i10, null);
            ag0Var2.setText(id.M0(2131744858, null));
            y J0 = org.telegram.ui.ActionBar.k6.J0(org.telegram.messenger.g0.L(3.0f), org.telegram.ui.ActionBar.k6.x0(null, i10, false));
            org.telegram.ui.ActionBar.n6 h = org.telegram.ui.ActionBar.r6.h(i10, 25);
            ag0Var2.setBackground(J0);
            org.telegram.ui.ActionBar.r6.k(ag0Var2, J0, null, h, null);
            ag0Var2.setTypeface(org.telegram.messenger.g0.o());
            c8.sa.a(ag0Var2, 8.0f, 0.0f, 8.0f, 0.0f);
            ag0Var2.setOutlineProvider(null);
            addView(ag0Var2, c8.ha.i(-2.0f, 28.0f, 8388661, 0.0f, 18.0f, 14.0f, 0.0f));
            a aVar = new a(this, 2);
            ag0Var.setOnClickListener(aVar);
            ag0Var2.setOnClickListener(aVar);
            c(false);
        } else {
            this.f = null;
            this.e = null;
        }
        TextView textView = new TextView(context);
        this.b = textView;
        org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.G6, null);
        org.telegram.messenger.camera.q.n(textView, 1, 16.0f, 1, 1);
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setGravity(c8.ha.y());
        addView(textView, c8.ha.i(-2.0f, -2.0f, 8388611, 71.0f, 10.0f, 21.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.c = textView2;
        org.telegram.ui.ActionBar.r6.V(textView2, org.telegram.ui.ActionBar.k6.z6, null);
        org.telegram.messenger.camera.q.n(textView2, 1, 13.0f, 1, 1);
        textView2.setSingleLine(true);
        textView2.setGravity(c8.ha.y());
        addView(textView2, c8.ha.i(-2.0f, -2.0f, 8388611, 71.0f, 35.0f, 21.0f, 0.0f));
        org.telegram.ui.Components.l9 l9Var = new org.telegram.ui.Components.l9(context);
        this.d = l9Var;
        l9Var.setAspectFit(true);
        l9Var.setLayerNum(1);
        addView(l9Var, c8.ha.i(48.0f, 48.0f, 8388659, 12.0f, 8.0f, 0.0f, 0.0f));
    }

    public final void a(boolean z9, boolean z10, boolean z11) {
        u uVar;
        int i7;
        if (!this.a || this.x == z9) {
            return;
        }
        this.x = z9;
        c(z10);
        if (!z11 || (uVar = this.w) == null) {
            return;
        }
        ni.c cVar = (ni.c) uVar;
        org.telegram.ui.o oVar = ((org.telegram.ui.n) cVar.b).d;
        TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) cVar.c;
        a0.h hVar = oVar.a;
        if (z9) {
            a(false, false, false);
            if (hVar.h(stickerSetCovered.set.id) >= 0) {
                return;
            }
            ag0 ag0Var = this.f;
            if (ag0Var != null) {
                ag0Var.a(true, true);
            }
            hVar.k(stickerSetCovered, stickerSetCovered.set.id);
        }
        i7 = ((org.telegram.ui.ActionBar.f2) oVar).currentAccount;
        ui.b0(i7).f2(oVar.getParentActivity(), stickerSetCovered, z9 ? 2 : 1, oVar, false, false);
    }

    public final void b(TLRPC.StickerSetCovered stickerSetCovered, boolean z9) {
        TLRPC.Document document;
        this.h = z9;
        this.s = stickerSetCovered;
        setWillNotDraw(!z9);
        this.b.setText(this.s.set.title);
        TLRPC.StickerSet stickerSet = stickerSetCovered.set;
        boolean z10 = stickerSet.emojis;
        TextView textView = this.c;
        if (z10) {
            textView.setText(id.G(stickerSet.count, "EmojiCount", new Object[0]));
        } else {
            textView.setText(id.G(stickerSet.count, "Stickers", new Object[0]));
        }
        if (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered) {
            ArrayList<TLRPC.Document> arrayList = ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered).documents;
            if (arrayList == null) {
                return;
            }
            long j3 = stickerSetCovered.set.thumb_document_id;
            int i7 = 0;
            while (true) {
                if (i7 >= arrayList.size()) {
                    document = null;
                    break;
                }
                document = arrayList.get(i7);
                if (document != null && document.id == j3) {
                    break;
                } else {
                    i7++;
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
        org.telegram.ui.Components.l9 l9Var = this.d;
        if (document == null) {
            l9Var.k(null, null, "webp", null, stickerSetCovered);
            return;
        }
        TLObject w10 = org.telegram.messenger.w7.w(stickerSetCovered.set.thumbs, 90, false, null, false);
        if (w10 == null) {
            w10 = document;
        }
        rz d = org.telegram.messenger.t5.d(stickerSetCovered.set.thumbs, org.telegram.ui.ActionBar.k6.a7, 1.0f, false);
        boolean z11 = w10 instanceof TLRPC.Document;
        hc c10 = z11 ? hc.c(org.telegram.messenger.w7.w(document.thumbs, 90, false, null, false), document) : hc.k((TLRPC.PhotoSize) w10, document, stickerSetCovered.set.thumb_version);
        if (z11 && (ij.L2(document, true) || ij.O4(document))) {
            if (d != null) {
                l9Var.p(hc.b(document), "50_50", d, stickerSetCovered);
                return;
            } else {
                l9Var.l(hc.b(document), "50_50", c10, null, 0, stickerSetCovered);
                return;
            }
        }
        if (c10 == null || c10.p != 1) {
            l9Var.k(c10, "50_50", "webp", d, stickerSetCovered);
        } else {
            l9Var.k(c10, "50_50", "tgs", d, stickerSetCovered);
        }
    }

    public final void c(boolean z9) {
        if (this.a) {
            AnimatorSet animatorSet = this.r;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            boolean z10 = this.x;
            float f10 = z10 ? 1.0f : 0.0f;
            float f11 = z10 ? 0.0f : 1.0f;
            ag0 ag0Var = this.f;
            ag0 ag0Var2 = this.e;
            if (!z9) {
                ag0Var2.setVisibility(z10 ? 0 : 4);
                ag0Var2.setAlpha(f10);
                ag0Var2.setScaleX(f10);
                ag0Var2.setScaleY(f10);
                ag0Var.setVisibility(this.x ? 4 : 0);
                ag0Var.setAlpha(f11);
                ag0Var.setScaleX(f11);
                ag0Var.setScaleY(f11);
                return;
            }
            this.n = z10 ? ag0Var2 : ag0Var;
            ag0Var.setVisibility(0);
            ag0Var2.setVisibility(0);
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.r = animatorSet2;
            animatorSet2.setDuration(250L);
            AnimatorSet animatorSet3 = this.r;
            Property property = View.ALPHA;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(ag0Var2, (Property<ag0, Float>) property, f10);
            Property property2 = View.SCALE_X;
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(ag0Var2, (Property<ag0, Float>) property2, f10);
            float[] fArr = {f10};
            Property property3 = View.SCALE_Y;
            animatorSet3.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(ag0Var2, (Property<ag0, Float>) property3, fArr), ObjectAnimator.ofFloat(ag0Var, (Property<ag0, Float>) property, f11), ObjectAnimator.ofFloat(ag0Var, (Property<ag0, Float>) property2, f11), ObjectAnimator.ofFloat(ag0Var, (Property<ag0, Float>) property3, f11));
            this.r.addListener(new m.a(this, 21));
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
    public final void measureChildWithMargins(View view, int i7, int i10, int i11, int i12) {
        if (this.a && view == this.b) {
            i10 += Math.max(this.f.getMeasuredWidth(), this.e.getMeasuredWidth());
        }
        super.measureChildWithMargins(view, i7, i10, i11, i12);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.h) {
            canvas.drawLine(0.0f, getHeight() - 1, getWidth() - getPaddingRight(), getHeight() - 1, org.telegram.ui.ActionBar.k6.k0);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(64.0f) + (this.h ? 1 : 0), TLObject.FLAG_30));
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z9) {
        a(z9, true, true);
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
