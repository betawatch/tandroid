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
import b8.mf;
import b8.tf;
import java.util.ArrayList;
import org.telegram.messenger.ac;
import org.telegram.messenger.bd;
import org.telegram.messenger.jz;
import org.telegram.messenger.li;
import org.telegram.messenger.zi;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.dg0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class v extends FrameLayout implements Checkable {
    public final boolean a;
    public final TextView b;
    public final TextView c;
    public final org.telegram.ui.Components.k9 d;
    public final dg0 e;
    public final dg0 f;
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
            dg0 dg0Var = new dg0(context);
            this.f = dg0Var;
            this.n = dg0Var;
            dg0Var.setText(bd.M0(2131754486, null));
            org.telegram.ui.ActionBar.r6.V(dg0Var, org.telegram.ui.ActionBar.k6.Gi, null);
            dg0Var.setProgressColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Bi, false));
            int i3 = org.telegram.ui.ActionBar.k6.Ci;
            int x02 = org.telegram.ui.ActionBar.k6.x0(null, i3, false);
            org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Ei, false);
            dg0Var.setBackground(org.telegram.ui.ActionBar.y5.e(x02, 14.0f));
            Drawable background = dg0Var.getBackground();
            org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i3);
            dg0Var.setBackground(background);
            org.telegram.ui.ActionBar.r6.k(dg0Var, background, N, null, null);
            addView(dg0Var, mf.i(-2.0f, 28.0f, 8388661, 0.0f, 18.0f, 14.0f, 0.0f));
            int L = org.telegram.messenger.g0.L(60.0f);
            dg0 dg0Var2 = new dg0(context);
            this.e = dg0Var2;
            dg0Var2.setAllCaps(false);
            dg0Var2.setMinWidth(L);
            dg0Var2.setMinimumWidth(L);
            dg0Var2.setTextSize(1, 14.0f);
            int i10 = org.telegram.ui.ActionBar.k6.Fi;
            org.telegram.ui.ActionBar.r6.V(dg0Var2, i10, null);
            dg0Var2.setText(bd.M0(2131744865, null));
            y J0 = org.telegram.ui.ActionBar.k6.J0(org.telegram.messenger.g0.L(3.0f), org.telegram.ui.ActionBar.k6.x0(null, i10, false));
            org.telegram.ui.ActionBar.n6 h = org.telegram.ui.ActionBar.r6.h(i10, 25);
            dg0Var2.setBackground(J0);
            org.telegram.ui.ActionBar.r6.k(dg0Var2, J0, null, h, null);
            dg0Var2.setTypeface(org.telegram.messenger.g0.o());
            tf.a(dg0Var2, 8.0f, 0.0f, 8.0f, 0.0f);
            dg0Var2.setOutlineProvider(null);
            addView(dg0Var2, mf.i(-2.0f, 28.0f, 8388661, 0.0f, 18.0f, 14.0f, 0.0f));
            a aVar = new a(this, 2);
            dg0Var.setOnClickListener(aVar);
            dg0Var2.setOnClickListener(aVar);
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
        textView.setGravity(mf.y());
        addView(textView, mf.i(-2.0f, -2.0f, 8388611, 71.0f, 10.0f, 21.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.c = textView2;
        org.telegram.ui.ActionBar.r6.V(textView2, org.telegram.ui.ActionBar.k6.z6, null);
        org.telegram.messenger.camera.q.n(textView2, 1, 13.0f, 1, 1);
        textView2.setSingleLine(true);
        textView2.setGravity(mf.y());
        addView(textView2, mf.i(-2.0f, -2.0f, 8388611, 71.0f, 35.0f, 21.0f, 0.0f));
        org.telegram.ui.Components.k9 k9Var = new org.telegram.ui.Components.k9(context);
        this.d = k9Var;
        k9Var.setAspectFit(true);
        k9Var.setLayerNum(1);
        addView(k9Var, mf.i(48.0f, 48.0f, 8388659, 12.0f, 8.0f, 0.0f, 0.0f));
    }

    public final void a(boolean z10, boolean z11, boolean z12) {
        u uVar;
        int i3;
        if (!this.a || this.x == z10) {
            return;
        }
        this.x = z10;
        c(z11);
        if (!z12 || (uVar = this.w) == null) {
            return;
        }
        mi.d4 d4Var = (mi.d4) uVar;
        org.telegram.ui.o oVar = ((org.telegram.ui.n) d4Var.b).d;
        TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) d4Var.c;
        a0.h hVar = oVar.a;
        if (z10) {
            a(false, false, false);
            if (hVar.h(stickerSetCovered.set.id) >= 0) {
                return;
            }
            dg0 dg0Var = this.f;
            if (dg0Var != null) {
                dg0Var.a(true, true);
            }
            hVar.k(stickerSetCovered, stickerSetCovered.set.id);
        }
        i3 = ((org.telegram.ui.ActionBar.d2) oVar).currentAccount;
        li.b0(i3).f2(oVar.getParentActivity(), stickerSetCovered, z10 ? 2 : 1, oVar, false, false);
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
            textView.setText(bd.G(stickerSet.count, "EmojiCount", new Object[0]));
        } else {
            textView.setText(bd.G(stickerSet.count, "Stickers", new Object[0]));
        }
        if (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered) {
            ArrayList<TLRPC.Document> arrayList = ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered).documents;
            if (arrayList == null) {
                return;
            }
            long j10 = stickerSetCovered.set.thumb_document_id;
            int i3 = 0;
            while (true) {
                if (i3 >= arrayList.size()) {
                    document = null;
                    break;
                }
                document = arrayList.get(i3);
                if (document != null && document.id == j10) {
                    break;
                } else {
                    i3++;
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
        org.telegram.ui.Components.k9 k9Var = this.d;
        if (document == null) {
            k9Var.k(null, null, "webp", null, stickerSetCovered);
            return;
        }
        TLObject w10 = org.telegram.messenger.w7.w(stickerSetCovered.set.thumbs, 90, false, null, false);
        if (w10 == null) {
            w10 = document;
        }
        jz d = org.telegram.messenger.t5.d(stickerSetCovered.set.thumbs, org.telegram.ui.ActionBar.k6.a7, 1.0f, false);
        boolean z12 = w10 instanceof TLRPC.Document;
        ac c2 = z12 ? ac.c(org.telegram.messenger.w7.w(document.thumbs, 90, false, null, false), document) : ac.k((TLRPC.PhotoSize) w10, document, stickerSetCovered.set.thumb_version);
        if (z12 && (zi.L2(document, true) || zi.O4(document))) {
            if (d != null) {
                k9Var.p(ac.b(document), "50_50", d, stickerSetCovered);
                return;
            } else {
                k9Var.l(ac.b(document), "50_50", c2, null, 0, stickerSetCovered);
                return;
            }
        }
        if (c2 == null || c2.p != 1) {
            k9Var.k(c2, "50_50", "webp", d, stickerSetCovered);
        } else {
            k9Var.k(c2, "50_50", "tgs", d, stickerSetCovered);
        }
    }

    public final void c(boolean z10) {
        if (this.a) {
            AnimatorSet animatorSet = this.r;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            boolean z11 = this.x;
            float f10 = z11 ? 1.0f : 0.0f;
            float f11 = z11 ? 0.0f : 1.0f;
            dg0 dg0Var = this.f;
            dg0 dg0Var2 = this.e;
            if (!z10) {
                dg0Var2.setVisibility(z11 ? 0 : 4);
                dg0Var2.setAlpha(f10);
                dg0Var2.setScaleX(f10);
                dg0Var2.setScaleY(f10);
                dg0Var.setVisibility(this.x ? 4 : 0);
                dg0Var.setAlpha(f11);
                dg0Var.setScaleX(f11);
                dg0Var.setScaleY(f11);
                return;
            }
            this.n = z11 ? dg0Var2 : dg0Var;
            dg0Var.setVisibility(0);
            dg0Var2.setVisibility(0);
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.r = animatorSet2;
            animatorSet2.setDuration(250L);
            AnimatorSet animatorSet3 = this.r;
            Property property = View.ALPHA;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(dg0Var2, (Property<dg0, Float>) property, f10);
            Property property2 = View.SCALE_X;
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(dg0Var2, (Property<dg0, Float>) property2, f10);
            float[] fArr = {f10};
            Property property3 = View.SCALE_Y;
            animatorSet3.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(dg0Var2, (Property<dg0, Float>) property3, fArr), ObjectAnimator.ofFloat(dg0Var, (Property<dg0, Float>) property, f11), ObjectAnimator.ofFloat(dg0Var, (Property<dg0, Float>) property2, f11), ObjectAnimator.ofFloat(dg0Var, (Property<dg0, Float>) property3, f11));
            this.r.addListener(new ii.v3(this, 22));
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
    public final void measureChildWithMargins(View view, int i3, int i10, int i11, int i12) {
        if (this.a && view == this.b) {
            i10 += Math.max(this.f.getMeasuredWidth(), this.e.getMeasuredWidth());
        }
        super.measureChildWithMargins(view, i3, i10, i11, i12);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.h) {
            canvas.drawLine(0.0f, getHeight() - 1, getWidth() - getPaddingRight(), getHeight() - 1, org.telegram.ui.ActionBar.k6.k0);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(64.0f) + (this.h ? 1 : 0), TLObject.FLAG_30));
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
