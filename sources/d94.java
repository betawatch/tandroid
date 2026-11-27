// default package

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
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class d94 extends FrameLayout implements fn7, snb {
    public boolean E;
    public Long F;
    public boolean G;
    public Drawable H;
    public boolean a;
    public final int b;
    public final TextView c;
    public final TextView d;
    public final de0 e;
    public final uv8 f;
    public final TextView h;
    public final ok8 n;
    public AnimatorSet r;
    public TLRPC.StickerSetCovered s;
    public boolean w;
    public boolean x;
    public boolean y;

    public d94(Context context, vnb vnbVar) {
        super(context);
        int i;
        float f;
        int i2;
        float f2;
        this.a = aob.I.o();
        this.b = yac.t0;
        TextView textView = new TextView(context);
        this.c = textView;
        yob.X(textView, aob.G6, null);
        ik8.w(textView, 1, 16.0f, 1, 1);
        textView.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        byte b = 5;
        textView.setGravity(ob6.a0 ? 5 : 3);
        boolean z = ob6.a0;
        if (z) {
            i = 5;
            f = 22.0f;
        } else {
            i = 3;
            f = 71.0f;
        }
        addView(textView, tre.d(-2, -2.0f, i, f, 10.0f, z ? 71.0f : 22.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        yob.X(textView2, aob.z6, null);
        ik8.w(textView2, 1, 13.0f, 1, 1);
        textView2.setSingleLine(true);
        textView2.setEllipsize(truncateAt);
        textView2.setGravity(ob6.a0 ? 5 : 3);
        boolean z2 = ob6.a0;
        if (z2) {
            f2 = 100.0f;
            i2 = 5;
        } else {
            i2 = 3;
            f2 = 71.0f;
        }
        addView(textView2, tre.d(-2, -2.0f, i2, f2, 35.0f, z2 ? 71.0f : 100.0f, 0.0f));
        de0 de0Var = new de0(context);
        this.e = de0Var;
        de0Var.setAspectFit(true);
        de0Var.setLayerNum(1);
        boolean z3 = ob6.a0;
        addView(de0Var, tre.d(48, 48.0f, (z3 ? 5 : 3) | 48, z3 ? 0.0f : 12.0f, 8.0f, z3 ? 12.0f : 0.0f, 0.0f));
        uv8 uv8Var = new uv8(context);
        this.f = uv8Var;
        uv8Var.setText(ob6.M0(2131754479, null));
        yob.X(uv8Var, aob.Ji, null);
        addView(uv8Var, tre.i(-2.0f, 28.0f, 8388661, 0.0f, 18.0f, 14.0f, 0.0f));
        TextView textView3 = new TextView(context);
        this.h = textView3;
        textView3.setGravity(17);
        qd4.w(textView3, aob.Ii, null, 1, 14.0f);
        textView3.setText(ob6.M0(2131744512, null));
        addView(textView3, tre.i(-2.0f, 28.0f, 8388661, 0.0f, 16.0f, 14.0f, 0.0f));
        ok8 ok8Var = new ok8(hl.L(4.0f), vnbVar, context, false);
        this.n = ok8Var;
        ok8Var.setIcon(R.raw.unlock_icon);
        ok8Var.b(ob6.M0(2131743531, null), new y00(this, b), false);
        ok8Var.setVisibility(8);
        try {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) ok8Var.getIconView().getLayoutParams();
            marginLayoutParams.leftMargin = hl.L(1.0f);
            marginLayoutParams.topMargin = hl.L(1.0f);
            int L = hl.L(20.0f);
            marginLayoutParams.height = L;
            marginLayoutParams.width = L;
            ((ViewGroup.MarginLayoutParams) ok8Var.getTextView().getLayoutParams()).leftMargin = hl.L(3.0f);
            ok8Var.getChildAt(0).setPadding(hl.L(8.0f), 0, hl.L(8.0f), 0);
        } catch (Exception unused) {
        }
        addView(this.n, tre.i(-2.0f, 28.0f, 8388661, 0.0f, 16.0f, 10.0f, 0.0f));
        updateColors();
    }

    public final void a(TLRPC.StickerSetCovered stickerSetCovered, boolean z, boolean z2, boolean z3) {
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
        this.y = z;
        this.s = stickerSetCovered;
        setWillNotDraw(!z);
        String str = this.s.set.title;
        TextView textView = this.c;
        textView.setText(str);
        textView.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
        TLRPC.StickerSet stickerSet2 = stickerSetCovered.set;
        this.d.setText(ob6.G(stickerSet2.count, stickerSet2.emojis ? "EmojiCount" : "Stickers", new Object[0]));
        boolean z4 = stickerSetCovered instanceof TLRPC.TL_stickerSetNoCovered;
        int i = this.b;
        if (!z4 || (stickerSet = stickerSetCovered.set) == null) {
            document = stickerSetCovered.cover;
            if (document == null) {
                if (stickerSetCovered.covers.isEmpty()) {
                    if (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered) {
                        TLRPC.TL_stickerSetFullCovered tL_stickerSetFullCovered = (TLRPC.TL_stickerSetFullCovered) stickerSetCovered;
                        if (!tL_stickerSetFullCovered.documents.isEmpty()) {
                            ArrayList<TLRPC.Document> arrayList2 = tL_stickerSetFullCovered.documents;
                            document = arrayList2.get(0);
                            for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                                if (arrayList2.get(i2).id == stickerSetCovered.set.thumb_document_id) {
                                    document2 = arrayList2.get(i2);
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
                        for (int i3 = 0; i3 < stickerSetCovered.covers.size(); i3++) {
                            if (stickerSetCovered.covers.get(i3).id == stickerSetCovered.set.thumb_document_id) {
                                document2 = stickerSetCovered.covers.get(i3);
                                document = document2;
                                break;
                            }
                        }
                    }
                }
            }
        } else {
            this.F = Long.valueOf(stickerSet.id);
            if (!this.E) {
                jn7.f(i).b(this, jn7.B0);
                this.E = true;
            }
            TLRPC.TL_messages_stickerSet m0 = ls6.d0(i).m0(ls6.b0(stickerSetCovered.set), Integer.valueOf(stickerSetCovered.set.hash), false, false, null);
            if (m0 != null && (arrayList = m0.documents) != null && !arrayList.isEmpty()) {
                document = m0.documents.get(0);
                int i4 = 0;
                while (true) {
                    if (i4 >= m0.documents.size()) {
                        break;
                    }
                    if (m0.documents.get(i4).id == stickerSetCovered.set.thumb_document_id) {
                        document = m0.documents.get(i4);
                        break;
                    }
                    i4++;
                }
            }
            document = null;
        }
        de0 de0Var = this.e;
        if (document != null) {
            if (r47.p(document)) {
                TLObject w = xb4.w(stickerSetCovered.set.thumbs, 90, false, null, false);
                if (w == null) {
                    w = document;
                }
                ggb d = lp3.d(stickerSetCovered.set.thumbs, aob.a7, 1.0f, false);
                boolean z5 = w instanceof TLRPC.Document;
                jn5 c = z5 ? jn5.c(xb4.w(document.thumbs, 90, false, null, false), document) : jn5.k((TLRPC.PhotoSize) w, document, stickerSetCovered.set.thumb_version);
                if (z5 && (r47.K2(document, true) || r47.M4(document))) {
                    if (d != null) {
                        de0Var.p(jn5.b(document), "50_50", d, stickerSetCovered);
                    } else {
                        de0Var.h(jn5.b(document), "50_50", c, null, 0, stickerSetCovered);
                    }
                } else if (c == null || c.p != 1) {
                    de0Var.n(c, "50_50", "webp", d, stickerSetCovered);
                } else {
                    de0Var.n(c, "50_50", "tgs", d, stickerSetCovered);
                }
            } else {
                TLRPC.PhotoSize w2 = xb4.w(document.thumbs, 90, false, null, false);
                if (w2 != null) {
                    de0Var.n(jn5.c(w2, document), "50_50", "webp", null, stickerSetCovered);
                } else {
                    de0Var.n(jn5.b(document), "50_50", "webp", null, stickerSetCovered);
                }
            }
            stickerSetCovered2 = stickerSetCovered;
        } else {
            stickerSetCovered2 = stickerSetCovered;
            de0Var.n(null, null, "webp", null, stickerSetCovered2);
        }
        uv8 uv8Var = this.f;
        uv8Var.setVisibility(0);
        this.G = z2;
        this.w = z2 || ls6.d0(i).D0(stickerSetCovered2.set.id, true);
        boolean z6 = !yac.h(i).p() && r47.T3(stickerSetCovered2);
        this.x = z6;
        ok8 ok8Var = this.n;
        TextView textView2 = this.h;
        if (z3) {
            if (z6) {
                ok8Var.setVisibility(0);
                textView2.setVisibility(0);
                uv8Var.setVisibility(0);
            } else {
                ok8Var.setVisibility(0);
                if (this.w) {
                    textView2.setVisibility(0);
                } else {
                    uv8Var.setVisibility(0);
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
            animatorSet3.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(textView2, (Property<TextView, Float>) property3, fArr3), ObjectAnimator.ofFloat(uv8Var, (Property<uv8, Float>) property, (this.w || this.x) ? 0.0f : 1.0f), ObjectAnimator.ofFloat(uv8Var, (Property<uv8, Float>) property2, (this.w || this.x) ? 0.0f : 1.0f), ObjectAnimator.ofFloat(ok8Var, (Property<ok8, Float>) property3, !this.x ? 0.0f : 1.0f), ObjectAnimator.ofFloat(ok8Var, (Property<ok8, Float>) property2, !this.x ? 0.0f : 1.0f), ObjectAnimator.ofFloat(ok8Var, (Property<ok8, Float>) property3, !this.x ? 0.0f : 1.0f));
            this.r.addListener(new b94(this));
            this.r.setInterpolator(new OvershootInterpolator(1.02f));
            this.r.start();
            return;
        }
        if (z6) {
            ok8Var.setVisibility(0);
            ok8Var.setAlpha(1.0f);
            ok8Var.setScaleX(1.0f);
            ok8Var.setScaleY(1.0f);
            uv8Var.setVisibility(4);
            uv8Var.setAlpha(0.0f);
            uv8Var.setScaleX(0.0f);
            uv8Var.setScaleY(0.0f);
            textView2.setVisibility(4);
            textView2.setAlpha(0.0f);
            textView2.setScaleX(0.0f);
            textView2.setScaleY(0.0f);
            return;
        }
        ok8Var.setVisibility(8);
        ok8Var.setAlpha(0.0f);
        ok8Var.setScaleX(0.0f);
        ok8Var.setScaleY(0.0f);
        if (this.w) {
            textView2.setVisibility(0);
            textView2.setAlpha(1.0f);
            textView2.setScaleX(1.0f);
            textView2.setScaleY(1.0f);
            uv8Var.setVisibility(4);
            uv8Var.setAlpha(0.0f);
            uv8Var.setScaleX(0.0f);
            uv8Var.setScaleY(0.0f);
            return;
        }
        uv8Var.setVisibility(0);
        uv8Var.setAlpha(1.0f);
        uv8Var.setScaleX(1.0f);
        uv8Var.setScaleY(1.0f);
        textView2.setVisibility(4);
        textView2.setAlpha(0.0f);
        textView2.setScaleX(0.0f);
        textView2.setScaleY(0.0f);
    }

    @Override // snb
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(aob.Ei));
        hashSet.add(Integer.valueOf(aob.Fi));
        hashSet.add(Integer.valueOf(aob.d7));
    }

    @Override // fn7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == jn7.B0) {
            long longValue = ((Long) objArr[0]).longValue();
            Long l = this.F;
            if (l == null || l.longValue() != longValue) {
                return;
            }
            this.F = null;
            TLRPC.TL_stickerSetNoCovered tL_stickerSetNoCovered = new TLRPC.TL_stickerSetNoCovered();
            tL_stickerSetNoCovered.set = ((TLRPC.TL_messages_stickerSet) objArr[1]).set;
            a(tL_stickerSetNoCovered, this.y, this.G, true);
        }
    }

    public de0 getImageView() {
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
        if (this.E) {
            jn7.f(this.b).n(this, jn7.B0);
            this.E = false;
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.y) {
            canvas.drawLine(ob6.a0 ? 0.0f : hl.L(71.0f), getHeight() - 1, getWidth() - (ob6.a0 ? hl.L(71.0f) : 0), getHeight() - 1, aob.j0);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(hl.L(64.0f) + (this.y ? 1 : 0), TLObject.FLAG_30));
        int measuredWidth = this.f.getMeasuredWidth();
        TextView textView = this.h;
        int measuredWidth2 = textView.getMeasuredWidth();
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) textView.getLayoutParams();
        if (measuredWidth2 < measuredWidth) {
            layoutParams.rightMargin = ik8.g(measuredWidth, measuredWidth2, 2, hl.L(14.0f));
        } else {
            layoutParams.rightMargin = hl.L(14.0f);
        }
        measureChildWithMargins(this.c, i, measuredWidth, i2, 0);
    }

    public void setAddOnClickListener(View.OnClickListener onClickListener) {
        this.f.setOnClickListener(onClickListener);
        this.h.setOnClickListener(onClickListener);
    }

    @Override // snb
    public final void updateColors() {
        uv8 uv8Var = this.f;
        if (uv8Var != null) {
            uv8Var.setProgressColor(aob.w0(null, aob.Ei, false));
            try {
                Drawable background = uv8Var.getBackground();
                if (background != null && background == this.H && (background instanceof RippleDrawable)) {
                    RippleDrawable rippleDrawable = (RippleDrawable) background;
                    if (rippleDrawable.getNumberOfLayers() > 0 && rippleDrawable.getId(0) != 16908334 && (rippleDrawable.getDrawable(0) instanceof ShapeDrawable)) {
                        int w0 = aob.w0(null, aob.Fi, false);
                        ShapeDrawable shapeDrawable = (ShapeDrawable) rippleDrawable.getDrawable(0);
                        if (shapeDrawable.getPaint().getColor() == w0 && this.a == aob.I.o()) {
                            return;
                        }
                        this.a = aob.I.o();
                        shapeDrawable.getPaint().setColor(w0);
                        rippleDrawable.setColor(ColorStateList.valueOf(rnb.b(w0)));
                        rippleDrawable.invalidateSelf();
                        return;
                    }
                }
            } catch (Exception e) {
                cc4.g(e, true);
            }
            int w02 = aob.w0(null, aob.Fi, false);
            aob.w0(null, aob.Hi, false);
            uv8Var.setBackground(rnb.e(w02, 14.0f));
            this.H = uv8Var.getBackground();
        }
    }
}
