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
import c8.va;
import java.util.ArrayList;
import org.telegram.messenger.gc;
import org.telegram.messenger.gj;
import org.telegram.messenger.hd;
import org.telegram.messenger.i20;
import org.telegram.messenger.pz;
import org.telegram.messenger.si;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.dg0;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class v extends FrameLayout implements Checkable {
    public final boolean a;
    public final TextView b;
    public final TextView c;
    public final org.telegram.ui.Components.i9 d;
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
            dg0Var.setText(hd.M0(2131754486, null));
            org.telegram.ui.ActionBar.q6.U(dg0Var, org.telegram.ui.ActionBar.j6.Ji, null);
            dg0Var.setProgressColor(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.Ei, false));
            int i7 = org.telegram.ui.ActionBar.j6.Fi;
            int x02 = org.telegram.ui.ActionBar.j6.x0(null, i7, false);
            org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.Hi, false);
            dg0Var.setBackground(org.telegram.ui.ActionBar.y5.e(x02, 14.0f));
            Drawable background = dg0Var.getBackground();
            org.telegram.ui.ActionBar.m6 M = org.telegram.ui.ActionBar.q6.M(i7);
            dg0Var.setBackground(background);
            org.telegram.ui.ActionBar.q6.j(dg0Var, background, M, null, null);
            addView(dg0Var, c8.ja.i(-2.0f, 28.0f, 8388661, 0.0f, 18.0f, 14.0f, 0.0f));
            int L = org.telegram.messenger.g0.L(60.0f);
            dg0 dg0Var2 = new dg0(context);
            this.e = dg0Var2;
            dg0Var2.setAllCaps(false);
            dg0Var2.setMinWidth(L);
            dg0Var2.setMinimumWidth(L);
            dg0Var2.setTextSize(1, 14.0f);
            int i10 = org.telegram.ui.ActionBar.j6.Ii;
            org.telegram.ui.ActionBar.q6.U(dg0Var2, i10, null);
            dg0Var2.setText(hd.M0(2131744855, null));
            y J0 = org.telegram.ui.ActionBar.j6.J0(org.telegram.messenger.g0.L(3.0f), org.telegram.ui.ActionBar.j6.x0(null, i10, false));
            org.telegram.ui.ActionBar.m6 g10 = org.telegram.ui.ActionBar.q6.g(i10, 25);
            dg0Var2.setBackground(J0);
            org.telegram.ui.ActionBar.q6.j(dg0Var2, J0, null, g10, null);
            dg0Var2.setTypeface(org.telegram.messenger.g0.o());
            va.a(dg0Var2, 8.0f, 0.0f, 8.0f, 0.0f);
            dg0Var2.setOutlineProvider(null);
            addView(dg0Var2, c8.ja.i(-2.0f, 28.0f, 8388661, 0.0f, 18.0f, 14.0f, 0.0f));
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
        org.telegram.ui.ActionBar.q6.U(textView, org.telegram.ui.ActionBar.j6.G6, null);
        i20.p(textView, 1, 16.0f, 1, 1);
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setGravity(c8.ja.y());
        addView(textView, c8.ja.i(-2.0f, -2.0f, 8388611, 71.0f, 10.0f, 21.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.c = textView2;
        org.telegram.ui.ActionBar.q6.U(textView2, org.telegram.ui.ActionBar.j6.z6, null);
        i20.p(textView2, 1, 13.0f, 1, 1);
        textView2.setSingleLine(true);
        textView2.setGravity(c8.ja.y());
        addView(textView2, c8.ja.i(-2.0f, -2.0f, 8388611, 71.0f, 35.0f, 21.0f, 0.0f));
        org.telegram.ui.Components.i9 i9Var = new org.telegram.ui.Components.i9(context);
        this.d = i9Var;
        i9Var.setAspectFit(true);
        i9Var.setLayerNum(1);
        addView(i9Var, c8.ja.i(48.0f, 48.0f, 8388659, 12.0f, 8.0f, 0.0f, 0.0f));
    }

    public final void a(boolean z10, boolean z11, boolean z12) {
        u uVar;
        int i7;
        if (!this.a || this.x == z10) {
            return;
        }
        this.x = z10;
        c(z11);
        if (!z12 || (uVar = this.w) == null) {
            return;
        }
        m2.d dVar = (m2.d) uVar;
        org.telegram.ui.o oVar = ((org.telegram.ui.n) dVar.b).d;
        TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) dVar.c;
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
        i7 = ((org.telegram.ui.ActionBar.e2) oVar).currentAccount;
        si.b0(i7).f2(oVar.getParentActivity(), stickerSetCovered, z10 ? 2 : 1, oVar, false, false);
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
            textView.setText(hd.G(stickerSet.count, "EmojiCount", new Object[0]));
        } else {
            textView.setText(hd.G(stickerSet.count, "Stickers", new Object[0]));
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
        org.telegram.ui.Components.i9 i9Var = this.d;
        if (document == null) {
            i9Var.k(null, null, "webp", null, stickerSetCovered);
            return;
        }
        TLObject w10 = org.telegram.messenger.w7.w(stickerSetCovered.set.thumbs, 90, false, null, false);
        if (w10 == null) {
            w10 = document;
        }
        pz d = org.telegram.messenger.t5.d(stickerSetCovered.set.thumbs, org.telegram.ui.ActionBar.j6.a7, 1.0f, false);
        boolean z12 = w10 instanceof TLRPC.Document;
        gc c10 = z12 ? gc.c(org.telegram.messenger.w7.w(document.thumbs, 90, false, null, false), document) : gc.k((TLRPC.PhotoSize) w10, document, stickerSetCovered.set.thumb_version);
        if (z12 && (gj.K2(document, true) || gj.N4(document))) {
            if (d != null) {
                i9Var.p(gc.b(document), "50_50", d, stickerSetCovered);
                return;
            } else {
                i9Var.l(gc.b(document), "50_50", c10, null, 0, stickerSetCovered);
                return;
            }
        }
        if (c10 == null || c10.p != 1) {
            i9Var.k(c10, "50_50", "webp", d, stickerSetCovered);
        } else {
            i9Var.k(c10, "50_50", "tgs", d, stickerSetCovered);
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
            this.r.addListener(new ki.s3(this, 22));
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
            canvas.drawLine(0.0f, getHeight() - 1, getWidth() - getPaddingRight(), getHeight() - 1, org.telegram.ui.ActionBar.j6.k0);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(64.0f) + (this.h ? 1 : 0), TLObject.FLAG_30));
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
