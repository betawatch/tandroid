package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ScrollView;
import android.widget.TextView;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_aicompose;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class l0 extends FrameLayout {
    public final int a;
    public final org.telegram.ui.ActionBar.i6 b;
    public final j0 c;
    public final FrameLayout d;
    public int e;
    public boolean f;
    public int h;
    public final c6 n;
    public int r;
    public final c6 s;
    public hi.b5 w;

    public l0(Context context, int i7, int i10, boolean z10, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context);
        this.r = -1;
        this.a = i7;
        this.b = i6Var;
        j0 j0Var = new j0(this, context, i6Var);
        this.c = j0Var;
        j0Var.setOrientation(i10);
        kr krVar = kr.h;
        this.n = new c6(j0Var, 0L, 320L, krVar);
        this.s = new c6(j0Var, 0L, 320L, krVar);
        if (!z10) {
            this.d = null;
            addView(j0Var, c8.na.e(-1, -1, org.telegram.messenger.ks.E1));
            return;
        }
        if (i10 == 0) {
            HorizontalScrollView horizontalScrollView = new HorizontalScrollView(context);
            this.d = horizontalScrollView;
            horizontalScrollView.setFillViewport(true);
        } else {
            ScrollView scrollView = new ScrollView(context);
            this.d = scrollView;
            scrollView.setFillViewport(true);
        }
        this.d.addView(j0Var);
        addView(this.d, c8.na.e(-1, -1, org.telegram.messenger.ks.E1));
    }

    public final void a(int i7, String str, org.telegram.messenger.w10 w10Var) {
        j0 j0Var = this.c;
        int childCount = j0Var.getChildCount();
        k0 k0Var = new k0(this.a, getContext(), this.b);
        k0Var.c = this.e;
        k0Var.updateColors();
        k0Var.f = false;
        k0Var.h.setImageResource(i7);
        k0Var.n.setText(str);
        k0Var.setOnClickListener(new ci.q(w10Var, childCount, 9));
        j0Var.addView(k0Var, c8.na.p(j0Var.getOrientation() == 0 ? 0 : -1, j0Var.getOrientation() != 1 ? -1 : 0, 1.0f, org.telegram.messenger.ks.E1));
    }

    public final void b(TL_aicompose.AiComposeTone aiComposeTone, org.telegram.messenger.w10 w10Var) {
        k0 k0Var = new k0(this.a, getContext(), this.b);
        k0Var.e = aiComposeTone;
        k0Var.c = this.e;
        k0Var.updateColors();
        TextView textView = k0Var.n;
        p9 p9Var = k0Var.h;
        if (aiComposeTone == null) {
            k0Var.d = false;
            k0Var.updateColors();
            String N0 = org.telegram.messenger.gd.N0(2131754975, null);
            k0Var.f = false;
            p9Var.setImageResource(R.drawable.tone_create);
            textView.setText(N0);
        } else if (aiComposeTone instanceof i0) {
            k0Var.d = false;
            k0Var.updateColors();
            String N02 = org.telegram.messenger.gd.N0(2131754973, null);
            k0Var.f = false;
            p9Var.setImageResource(R.drawable.iv_prompt);
            textView.setText(N02);
        } else {
            k0Var.a(null, aiComposeTone.title, Long.valueOf(aiComposeTone.emoji_id));
        }
        k0Var.setOnClickListener(new oi.i1(21, w10Var, aiComposeTone));
        k0Var.setOnLongClickListener(new fi.z1(1, this, k0Var));
        j0 j0Var = this.c;
        j0Var.addView(k0Var, c8.na.p(j0Var.getOrientation() == 0 ? 0 : -1, j0Var.getOrientation() != 1 ? -1 : 0, 1.0f, org.telegram.messenger.ks.E1));
    }

    public final void c(int i7, boolean z10) {
        int i10 = this.h;
        if (i10 == i7) {
            return;
        }
        this.h = i7;
        c6 c6Var = this.n;
        c6 c6Var2 = this.s;
        if (i7 >= 0) {
            if (i10 < 0 && c6Var2.c < 0.01f) {
                c6Var.e(true, i7);
            }
            this.r = i7;
        }
        if (!z10) {
            int i11 = this.h;
            if (i11 < 0) {
                i11 = this.r;
            }
            c6Var.e(true, i11);
            c6Var2.e(true, this.h >= 0 ? 1.0f : 0.0f);
        }
        j0 j0Var = this.c;
        if (i7 >= 0 && i7 < j0Var.getChildCount()) {
            View childAt = j0Var.getChildAt(i7);
            if (childAt instanceof k0) {
                p9 p9Var = ((k0) childAt).h;
                if (p9Var.getAnimatedEmojiDrawable() != null) {
                    fi.s2 s2Var = p9Var.getAnimatedEmojiDrawable().k;
                    if (s2Var != null) {
                        s2Var.Q0(false);
                    }
                } else {
                    p9Var.getImageReceiver().Q0(false);
                }
            }
        }
        j0Var.invalidate();
    }

    public final void d(TL_aicompose.AiComposeTone aiComposeTone, boolean z10) {
        TL_aicompose.AiComposeTone aiComposeTone2;
        int i7 = 0;
        while (true) {
            j0 j0Var = this.c;
            if (i7 >= j0Var.getChildCount()) {
                return;
            }
            View childAt = j0Var.getChildAt(i7);
            if ((childAt instanceof k0) && (aiComposeTone2 = ((k0) childAt).e) != null && aiComposeTone2 == aiComposeTone) {
                c(i7, z10);
                return;
            }
            i7++;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.f) {
            Paint W0 = org.telegram.ui.ActionBar.n6.W0("paintDivider", this.b);
            if (W0 == null) {
                W0 = org.telegram.ui.ActionBar.n6.k0;
            }
            canvas.drawRect(org.telegram.messenger.g0.L(10.0f), getHeight() - 1, getWidth() - org.telegram.messenger.g0.L(10.0f), getHeight(), W0);
        }
    }

    public int getSelectedTab() {
        return this.h;
    }

    public TL_aicompose.AiComposeTone getSelectedTone() {
        int i7 = this.h;
        if (i7 < 0) {
            return null;
        }
        j0 j0Var = this.c;
        if (i7 >= j0Var.getChildCount()) {
            return null;
        }
        View childAt = j0Var.getChildAt(this.h);
        if (childAt instanceof k0) {
            return ((k0) childAt).e;
        }
        return null;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), TLObject.FLAG_30), i10);
    }

    public void setDivider(boolean z10) {
        this.f = z10;
    }

    @Override // android.view.View
    public final void setPadding(int i7, int i10, int i11, int i12) {
        this.c.setPadding(i7, i10, i11, i12);
    }

    public void setRoundRadius(int i7) {
        this.e = i7;
    }
}
