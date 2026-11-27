// default package

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
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class fs extends FrameLayout implements Checkable {
    public final boolean a;
    public final TextView b;
    public final TextView c;
    public final de0 d;
    public final uv8 e;
    public final uv8 f;
    public boolean h;
    public Button n;
    public AnimatorSet r;
    public TLRPC.StickerSetCovered s;
    public es w;
    public boolean x;

    public fs(Context context, boolean z) {
        super(context);
        this.a = z;
        if (z) {
            uv8 uv8Var = new uv8(context);
            this.f = uv8Var;
            this.n = uv8Var;
            uv8Var.setText(ob6.M0(2131754479, null));
            yob.X(uv8Var, aob.Ji, null);
            uv8Var.setProgressColor(aob.w0(null, aob.Ei, false));
            int i = aob.Fi;
            int w0 = aob.w0(null, i, false);
            aob.w0(null, aob.Hi, false);
            uv8Var.setBackground(rnb.e(w0, 14.0f));
            Drawable background = uv8Var.getBackground();
            uob M = yob.M(i);
            uv8Var.setBackground(background);
            yob.j(uv8Var, background, M, null, null);
            addView(uv8Var, tre.i(-2.0f, 28.0f, 8388661, 0.0f, 18.0f, 14.0f, 0.0f));
            int L = hl.L(60.0f);
            uv8 uv8Var2 = new uv8(context);
            this.e = uv8Var2;
            uv8Var2.setAllCaps(false);
            uv8Var2.setMinWidth(L);
            uv8Var2.setMinimumWidth(L);
            uv8Var2.setTextSize(1, 14.0f);
            int i2 = aob.Ii;
            yob.X(uv8Var2, i2, null);
            uv8Var2.setText(ob6.M0(2131744512, null));
            hf0 H0 = aob.H0(hl.L(3.0f), aob.w0(null, i2, false));
            uob g = yob.g(i2, 25);
            uv8Var2.setBackground(H0);
            yob.j(uv8Var2, H0, null, g, null);
            uv8Var2.setTypeface(hl.o());
            l2f.a(uv8Var2, 8.0f, 0.0f, 8.0f, 0.0f);
            uv8Var2.setOutlineProvider(null);
            addView(uv8Var2, tre.i(-2.0f, 28.0f, 8388661, 0.0f, 18.0f, 14.0f, 0.0f));
            k1 k1Var = new k1(this, (byte) 10);
            uv8Var.setOnClickListener(k1Var);
            uv8Var2.setOnClickListener(k1Var);
            c(false);
        } else {
            this.f = null;
            this.e = null;
        }
        TextView textView = new TextView(context);
        this.b = textView;
        yob.X(textView, aob.G6, null);
        ik8.w(textView, 1, 16.0f, 1, 1);
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setGravity(tre.y());
        addView(textView, tre.i(-2.0f, -2.0f, 8388611, 71.0f, 10.0f, 21.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.c = textView2;
        yob.X(textView2, aob.z6, null);
        ik8.w(textView2, 1, 13.0f, 1, 1);
        textView2.setSingleLine(true);
        textView2.setGravity(tre.y());
        addView(textView2, tre.i(-2.0f, -2.0f, 8388611, 71.0f, 35.0f, 21.0f, 0.0f));
        de0 de0Var = new de0(context);
        this.d = de0Var;
        de0Var.setAspectFit(true);
        de0Var.setLayerNum(1);
        addView(de0Var, tre.i(48.0f, 48.0f, 8388659, 12.0f, 8.0f, 0.0f, 0.0f));
    }

    public final void a(boolean z, boolean z2, boolean z3) {
        es esVar;
        int i;
        if (!this.a || this.x == z) {
            return;
        }
        this.x = z;
        c(z2);
        if (!z3 || (esVar = this.w) == null) {
            return;
        }
        o oVar = (o) esVar;
        is isVar = ((hs) oVar.b).d;
        TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) oVar.c;
        zh6 zh6Var = isVar.a;
        if (z) {
            a(false, false, false);
            if (zh6Var.h(stickerSetCovered.set.id) >= 0) {
                return;
            }
            uv8 uv8Var = this.f;
            if (uv8Var != null) {
                uv8Var.a(true, true);
            }
            zh6Var.k(stickerSetCovered.set.id, stickerSetCovered);
        }
        i = ((e) isVar).currentAccount;
        ls6.d0(i).h2(isVar.getParentActivity(), stickerSetCovered, z ? 2 : 1, isVar, false, false);
    }

    public final void b(TLRPC.StickerSetCovered stickerSetCovered, boolean z) {
        TLRPC.Document document;
        this.h = z;
        this.s = stickerSetCovered;
        setWillNotDraw(!z);
        this.b.setText(this.s.set.title);
        TLRPC.StickerSet stickerSet = stickerSetCovered.set;
        boolean z2 = stickerSet.emojis;
        int i = stickerSet.count;
        TextView textView = this.c;
        if (z2) {
            textView.setText(ob6.G(i, "EmojiCount", new Object[0]));
        } else {
            textView.setText(ob6.G(i, "Stickers", new Object[0]));
        }
        if (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered) {
            ArrayList<TLRPC.Document> arrayList = ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered).documents;
            if (arrayList == null) {
                return;
            }
            long j = stickerSetCovered.set.thumb_document_id;
            int i2 = 0;
            while (true) {
                if (i2 >= arrayList.size()) {
                    document = null;
                    break;
                }
                document = arrayList.get(i2);
                if (document != null && document.id == j) {
                    break;
                } else {
                    i2++;
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
        de0 de0Var = this.d;
        if (document == null) {
            de0Var.n(null, null, "webp", null, stickerSetCovered);
            return;
        }
        TLObject w = xb4.w(stickerSetCovered.set.thumbs, 90, false, null, false);
        if (w == null) {
            w = document;
        }
        ggb d = lp3.d(stickerSetCovered.set.thumbs, aob.a7, 1.0f, false);
        boolean z3 = w instanceof TLRPC.Document;
        jn5 c = z3 ? jn5.c(xb4.w(document.thumbs, 90, false, null, false), document) : jn5.k((TLRPC.PhotoSize) w, document, stickerSetCovered.set.thumb_version);
        if (z3 && (r47.K2(document, true) || r47.M4(document))) {
            if (d != null) {
                de0Var.p(jn5.b(document), "50_50", d, stickerSetCovered);
                return;
            } else {
                de0Var.h(jn5.b(document), "50_50", c, null, 0, stickerSetCovered);
                return;
            }
        }
        if (c == null || c.p != 1) {
            de0Var.n(c, "50_50", "webp", d, stickerSetCovered);
        } else {
            de0Var.n(c, "50_50", "tgs", d, stickerSetCovered);
        }
    }

    public final void c(boolean z) {
        if (this.a) {
            AnimatorSet animatorSet = this.r;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            boolean z2 = this.x;
            float f = 0.0f;
            float f2 = 1.0f;
            if (!z2) {
                f2 = 0.0f;
                f = 1.0f;
            }
            uv8 uv8Var = this.f;
            uv8 uv8Var2 = this.e;
            if (!z) {
                uv8Var2.setVisibility(z2 ? 0 : 4);
                uv8Var2.setAlpha(f2);
                uv8Var2.setScaleX(f2);
                uv8Var2.setScaleY(f2);
                uv8Var.setVisibility(this.x ? 4 : 0);
                uv8Var.setAlpha(f);
                uv8Var.setScaleX(f);
                uv8Var.setScaleY(f);
                return;
            }
            this.n = z2 ? uv8Var2 : uv8Var;
            uv8Var.setVisibility(0);
            uv8Var2.setVisibility(0);
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.r = animatorSet2;
            animatorSet2.setDuration(250L);
            AnimatorSet animatorSet3 = this.r;
            Property property = View.ALPHA;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(uv8Var2, (Property<uv8, Float>) property, f2);
            Property property2 = View.SCALE_X;
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(uv8Var2, (Property<uv8, Float>) property2, f2);
            float[] fArr = {f2};
            Property property3 = View.SCALE_Y;
            animatorSet3.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(uv8Var2, (Property<uv8, Float>) property3, fArr), ObjectAnimator.ofFloat(uv8Var, (Property<uv8, Float>) property, f), ObjectAnimator.ofFloat(uv8Var, (Property<uv8, Float>) property2, f), ObjectAnimator.ofFloat(uv8Var, (Property<uv8, Float>) property3, f));
            this.r.addListener(new h0(this, (byte) 10));
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
    public final void measureChildWithMargins(View view, int i, int i2, int i3, int i4) {
        if (this.a && view == this.b) {
            i2 += Math.max(this.f.getMeasuredWidth(), this.e.getMeasuredWidth());
        }
        super.measureChildWithMargins(view, i, i2, i3, i4);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.h) {
            canvas.drawLine(0.0f, getHeight() - 1, getWidth() - getPaddingRight(), getHeight() - 1, aob.j0);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(hl.L(64.0f) + (this.h ? 1 : 0), TLObject.FLAG_30));
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        a(z, true, true);
    }

    public void setOnCheckedChangeListener(es esVar) {
        this.w = esVar;
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        if (this.a) {
            setChecked(!this.x);
        }
    }
}
