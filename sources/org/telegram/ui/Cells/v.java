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
import c8.xa;
import java.util.ArrayList;
import org.telegram.messenger.fc;
import org.telegram.messenger.fj;
import org.telegram.messenger.gd;
import org.telegram.messenger.lz;
import org.telegram.messenger.n10;
import org.telegram.messenger.ri;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ng0;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class v extends FrameLayout implements Checkable {
    public final boolean a;
    public final TextView b;
    public final TextView c;
    public final org.telegram.ui.Components.q9 d;
    public final ng0 e;
    public final ng0 f;
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
            ng0 ng0Var = new ng0(context);
            this.f = ng0Var;
            this.n = ng0Var;
            ng0Var.setText(gd.M0(2131754484, null));
            org.telegram.ui.ActionBar.u6.U(ng0Var, org.telegram.ui.ActionBar.n6.Ji, null);
            ng0Var.setProgressColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Ei, false));
            int i7 = org.telegram.ui.ActionBar.n6.Fi;
            int x02 = org.telegram.ui.ActionBar.n6.x0(null, i7, false);
            org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Hi, false);
            ng0Var.setBackground(org.telegram.ui.ActionBar.b6.e(x02, 14.0f));
            Drawable background = ng0Var.getBackground();
            org.telegram.ui.ActionBar.q6 M = org.telegram.ui.ActionBar.u6.M(i7);
            ng0Var.setBackground(background);
            org.telegram.ui.ActionBar.u6.j(ng0Var, background, M, null, null);
            addView(ng0Var, c8.ma.i(-2.0f, 28.0f, 8388661, 0.0f, 18.0f, 14.0f, 0.0f));
            int L = org.telegram.messenger.g0.L(60.0f);
            ng0 ng0Var2 = new ng0(context);
            this.e = ng0Var2;
            ng0Var2.setAllCaps(false);
            ng0Var2.setMinWidth(L);
            ng0Var2.setMinimumWidth(L);
            ng0Var2.setTextSize(1, 14.0f);
            int i10 = org.telegram.ui.ActionBar.n6.Ii;
            org.telegram.ui.ActionBar.u6.U(ng0Var2, i10, null);
            ng0Var2.setText(gd.M0(2131744620, null));
            y J0 = org.telegram.ui.ActionBar.n6.J0(org.telegram.messenger.g0.L(3.0f), org.telegram.ui.ActionBar.n6.x0(null, i10, false));
            org.telegram.ui.ActionBar.q6 g10 = org.telegram.ui.ActionBar.u6.g(i10, 25);
            ng0Var2.setBackground(J0);
            org.telegram.ui.ActionBar.u6.j(ng0Var2, J0, null, g10, null);
            ng0Var2.setTypeface(org.telegram.messenger.g0.o());
            xa.a(ng0Var2, 8.0f, 0.0f, 8.0f, 0.0f);
            ng0Var2.setOutlineProvider(null);
            addView(ng0Var2, c8.ma.i(-2.0f, 28.0f, 8388661, 0.0f, 18.0f, 14.0f, 0.0f));
            a aVar = new a(this, 2);
            ng0Var.setOnClickListener(aVar);
            ng0Var2.setOnClickListener(aVar);
            c(false);
        } else {
            this.f = null;
            this.e = null;
        }
        TextView textView = new TextView(context);
        this.b = textView;
        org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.G6, null);
        n10.q(textView, 1, 16.0f, 1, 1);
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setGravity(c8.ma.y());
        addView(textView, c8.ma.i(-2.0f, -2.0f, 8388611, 71.0f, 10.0f, 21.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.c = textView2;
        org.telegram.ui.ActionBar.u6.U(textView2, org.telegram.ui.ActionBar.n6.z6, null);
        n10.q(textView2, 1, 13.0f, 1, 1);
        textView2.setSingleLine(true);
        textView2.setGravity(c8.ma.y());
        addView(textView2, c8.ma.i(-2.0f, -2.0f, 8388611, 71.0f, 35.0f, 21.0f, 0.0f));
        org.telegram.ui.Components.q9 q9Var = new org.telegram.ui.Components.q9(context);
        this.d = q9Var;
        q9Var.setAspectFit(true);
        q9Var.setLayerNum(1);
        addView(q9Var, c8.ma.i(48.0f, 48.0f, 8388659, 12.0f, 8.0f, 0.0f, 0.0f));
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
        oi.e0 e0Var = (oi.e0) uVar;
        org.telegram.ui.o oVar = ((org.telegram.ui.n) e0Var.b).d;
        TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) e0Var.c;
        a0.h hVar = oVar.a;
        if (z10) {
            a(false, false, false);
            if (hVar.h(stickerSetCovered.set.id) >= 0) {
                return;
            }
            ng0 ng0Var = this.f;
            if (ng0Var != null) {
                ng0Var.a(true, true);
            }
            hVar.k(stickerSetCovered, stickerSetCovered.set.id);
        }
        i7 = ((org.telegram.ui.ActionBar.h2) oVar).currentAccount;
        ri.d0(i7).k2(oVar.getParentActivity(), stickerSetCovered, z10 ? 2 : 1, oVar, false, false);
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
            textView.setText(gd.G(stickerSet.count, "EmojiCount", new Object[0]));
        } else {
            textView.setText(gd.G(stickerSet.count, "Stickers", new Object[0]));
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
        org.telegram.ui.Components.q9 q9Var = this.d;
        if (document == null) {
            q9Var.k(null, null, "webp", null, stickerSetCovered);
            return;
        }
        TLObject w10 = org.telegram.messenger.w7.w(stickerSetCovered.set.thumbs, 90, false, null, false);
        if (w10 == null) {
            w10 = document;
        }
        lz d = org.telegram.messenger.u5.d(stickerSetCovered.set.thumbs, org.telegram.ui.ActionBar.n6.a7, 1.0f, false);
        boolean z12 = w10 instanceof TLRPC.Document;
        fc c10 = z12 ? fc.c(org.telegram.messenger.w7.w(document.thumbs, 90, false, null, false), document) : fc.k((TLRPC.PhotoSize) w10, document, stickerSetCovered.set.thumb_version);
        if (z12 && (fj.K2(document, true) || fj.N4(document))) {
            if (d != null) {
                q9Var.p(fc.b(document), "50_50", d, stickerSetCovered);
                return;
            } else {
                q9Var.l(fc.b(document), "50_50", c10, null, 0, stickerSetCovered);
                return;
            }
        }
        if (c10 == null || c10.p != 1) {
            q9Var.k(c10, "50_50", "webp", d, stickerSetCovered);
        } else {
            q9Var.k(c10, "50_50", "tgs", d, stickerSetCovered);
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
            ng0 ng0Var = this.f;
            ng0 ng0Var2 = this.e;
            if (!z10) {
                ng0Var2.setVisibility(z11 ? 0 : 4);
                ng0Var2.setAlpha(f10);
                ng0Var2.setScaleX(f10);
                ng0Var2.setScaleY(f10);
                ng0Var.setVisibility(this.x ? 4 : 0);
                ng0Var.setAlpha(f11);
                ng0Var.setScaleX(f11);
                ng0Var.setScaleY(f11);
                return;
            }
            this.n = z11 ? ng0Var2 : ng0Var;
            ng0Var.setVisibility(0);
            ng0Var2.setVisibility(0);
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.r = animatorSet2;
            animatorSet2.setDuration(250L);
            AnimatorSet animatorSet3 = this.r;
            Property property = View.ALPHA;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(ng0Var2, (Property<ng0, Float>) property, f10);
            Property property2 = View.SCALE_X;
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(ng0Var2, (Property<ng0, Float>) property2, f10);
            float[] fArr = {f10};
            Property property3 = View.SCALE_Y;
            animatorSet3.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(ng0Var2, (Property<ng0, Float>) property3, fArr), ObjectAnimator.ofFloat(ng0Var, (Property<ng0, Float>) property, f11), ObjectAnimator.ofFloat(ng0Var, (Property<ng0, Float>) property2, f11), ObjectAnimator.ofFloat(ng0Var, (Property<ng0, Float>) property3, f11));
            this.r.addListener(new ki.n3(this, 22));
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
            canvas.drawLine(0.0f, getHeight() - 1, getWidth() - getPaddingRight(), getHeight() - 1, org.telegram.ui.ActionBar.n6.k0);
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
