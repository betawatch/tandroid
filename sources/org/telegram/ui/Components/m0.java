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

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class m0 extends FrameLayout {
    public final int a;
    public final org.telegram.ui.ActionBar.h6 b;
    public final k0 c;
    public final FrameLayout d;
    public int e;
    public boolean f;
    public int h;
    public final d6 n;
    public int r;
    public final d6 s;
    public hi.q4 w;

    public m0(Context context, int i7, int i10, boolean z10, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context);
        this.r = -1;
        this.a = i7;
        this.b = h6Var;
        k0 k0Var = new k0(this, context, h6Var);
        this.c = k0Var;
        k0Var.setOrientation(i10);
        nr nrVar = nr.h;
        this.n = new d6(k0Var, 0L, 320L, nrVar);
        this.s = new d6(k0Var, 0L, 320L, nrVar);
        if (!z10) {
            this.d = null;
            addView(k0Var, c8.ma.e(-1, -1, org.telegram.messenger.ls.E1));
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
        this.d.addView(k0Var);
        addView(this.d, c8.ma.e(-1, -1, org.telegram.messenger.ls.E1));
    }

    public final void a(int i7, String str, org.telegram.messenger.y10 y10Var) {
        k0 k0Var = this.c;
        int childCount = k0Var.getChildCount();
        l0 l0Var = new l0(this.a, getContext(), this.b);
        l0Var.c = this.e;
        l0Var.updateColors();
        l0Var.f = false;
        l0Var.h.setImageResource(i7);
        l0Var.n.setText(str);
        l0Var.setOnClickListener(new ci.q(y10Var, childCount, 9));
        k0Var.addView(l0Var, c8.ma.p(k0Var.getOrientation() == 0 ? 0 : -1, k0Var.getOrientation() != 1 ? -1 : 0, 1.0f, org.telegram.messenger.ls.E1));
    }

    public final void b(TL_aicompose.AiComposeTone aiComposeTone, org.telegram.messenger.y10 y10Var) {
        l0 l0Var = new l0(this.a, getContext(), this.b);
        l0Var.e = aiComposeTone;
        l0Var.c = this.e;
        l0Var.updateColors();
        TextView textView = l0Var.n;
        q9 q9Var = l0Var.h;
        if (aiComposeTone == null) {
            l0Var.d = false;
            l0Var.updateColors();
            String N0 = org.telegram.messenger.hd.N0(2131754975, null);
            l0Var.f = false;
            q9Var.setImageResource(R.drawable.tone_create);
            textView.setText(N0);
        } else if (aiComposeTone instanceof j0) {
            l0Var.d = false;
            l0Var.updateColors();
            String N02 = org.telegram.messenger.hd.N0(2131754973, null);
            l0Var.f = false;
            q9Var.setImageResource(R.drawable.iv_prompt);
            textView.setText(N02);
        } else {
            l0Var.a(null, aiComposeTone.title, Long.valueOf(aiComposeTone.emoji_id));
        }
        l0Var.setOnClickListener(new oi.i1(21, y10Var, aiComposeTone));
        l0Var.setOnLongClickListener(new fi.z1(1, this, l0Var));
        k0 k0Var = this.c;
        k0Var.addView(l0Var, c8.ma.p(k0Var.getOrientation() == 0 ? 0 : -1, k0Var.getOrientation() != 1 ? -1 : 0, 1.0f, org.telegram.messenger.ls.E1));
    }

    public final void c(int i7, boolean z10) {
        int i10 = this.h;
        if (i10 == i7) {
            return;
        }
        this.h = i7;
        d6 d6Var = this.n;
        d6 d6Var2 = this.s;
        if (i7 >= 0) {
            if (i10 < 0 && d6Var2.c < 0.01f) {
                d6Var.e(true, i7);
            }
            this.r = i7;
        }
        if (!z10) {
            int i11 = this.h;
            if (i11 < 0) {
                i11 = this.r;
            }
            d6Var.e(true, i11);
            d6Var2.e(true, this.h >= 0 ? 1.0f : 0.0f);
        }
        k0 k0Var = this.c;
        if (i7 >= 0 && i7 < k0Var.getChildCount()) {
            View childAt = k0Var.getChildAt(i7);
            if (childAt instanceof l0) {
                q9 q9Var = ((l0) childAt).h;
                if (q9Var.getAnimatedEmojiDrawable() != null) {
                    fi.s2 s2Var = q9Var.getAnimatedEmojiDrawable().k;
                    if (s2Var != null) {
                        s2Var.P0(false);
                    }
                } else {
                    q9Var.getImageReceiver().P0(false);
                }
            }
        }
        k0Var.invalidate();
    }

    public final void d(TL_aicompose.AiComposeTone aiComposeTone, boolean z10) {
        TL_aicompose.AiComposeTone aiComposeTone2;
        int i7 = 0;
        while (true) {
            k0 k0Var = this.c;
            if (i7 >= k0Var.getChildCount()) {
                return;
            }
            View childAt = k0Var.getChildAt(i7);
            if ((childAt instanceof l0) && (aiComposeTone2 = ((l0) childAt).e) != null && aiComposeTone2 == aiComposeTone) {
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
            Paint W0 = org.telegram.ui.ActionBar.m6.W0("paintDivider", this.b);
            if (W0 == null) {
                W0 = org.telegram.ui.ActionBar.m6.k0;
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
        k0 k0Var = this.c;
        if (i7 >= k0Var.getChildCount()) {
            return null;
        }
        View childAt = k0Var.getChildAt(this.h);
        if (childAt instanceof l0) {
            return ((l0) childAt).e;
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
