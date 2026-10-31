package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.TextView;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_aicompose;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class f0 extends FrameLayout {
    public final int a;
    public final org.telegram.ui.ActionBar.p6 b;
    public final d0 c;
    public int d;
    public boolean e;
    public int f;
    public final t5 h;
    public i n;

    public f0(int i10, Context context, org.telegram.ui.ActionBar.p6 p6Var, boolean z10) {
        super(context);
        this.a = i10;
        this.b = p6Var;
        d0 d0Var = new d0(this, context, p6Var);
        this.c = d0Var;
        d0Var.setOrientation(0);
        this.h = new t5(d0Var, 0L, 320L, gr.h);
        if (!z10) {
            addView(d0Var, w7.b6.e(-1, -1, org.telegram.messenger.zs.E1));
            return;
        }
        HorizontalScrollView horizontalScrollView = new HorizontalScrollView(context);
        horizontalScrollView.setFillViewport(true);
        horizontalScrollView.addView(d0Var);
        addView(horizontalScrollView, w7.b6.e(-1, -1, org.telegram.messenger.zs.E1));
    }

    public final void a(int i10, String str, org.telegram.messenger.q20 q20Var) {
        d0 d0Var = this.c;
        int childCount = d0Var.getChildCount();
        e0 e0Var = new e0(this.a, getContext(), this.b);
        e0Var.c = this.d;
        e0Var.updateColors();
        e0Var.f = false;
        e0Var.h.setImageResource(i10);
        e0Var.n.setText(str);
        e0Var.setOnClickListener(new c0(childCount, 0, q20Var));
        d0Var.addView(e0Var, w7.b6.p(0, -1, 1.0f, org.telegram.messenger.zs.E1));
    }

    public final void b(TL_aicompose.AiComposeTone aiComposeTone, org.telegram.messenger.q20 q20Var) {
        e0 e0Var = new e0(this.a, getContext(), this.b);
        e0Var.e = aiComposeTone;
        e0Var.c = this.d;
        e0Var.updateColors();
        TextView textView = e0Var.n;
        g9 g9Var = e0Var.h;
        if (aiComposeTone == null) {
            e0Var.d = false;
            e0Var.updateColors();
            String L0 = org.telegram.messenger.cd.L0(2131754975, null);
            e0Var.f = false;
            g9Var.setImageResource(R.drawable.tone_create);
            textView.setText(L0);
        } else if (aiComposeTone instanceof a0) {
            e0Var.d = false;
            e0Var.updateColors();
            String L02 = org.telegram.messenger.cd.L0(2131754973, null);
            e0Var.f = false;
            g9Var.setImageResource(R.drawable.iv_prompt);
            textView.setText(L02);
        } else {
            String str = aiComposeTone.title;
            long j10 = aiComposeTone.emoji_id;
            e0Var.f = true;
            g9Var.setColorFilter(null);
            g9Var.setImageDrawable(org.telegram.messenger.k6.g(null));
            textView.setText(str);
            int i10 = e0Var.a;
            if (ConnectionsManager.getInstance(i10).isTestBackend()) {
                for (int i11 = 0; i11 < 4 && (!org.telegram.messenger.d20.i(i11).p() || ConnectionsManager.getInstance(i11).isTestBackend()); i11++) {
                }
            }
            g9Var.setAnimatedEmojiDrawable(new f5(9, i10, j10));
        }
        e0Var.setOnClickListener(new org.telegram.ui.ud(11, q20Var, aiComposeTone));
        e0Var.setOnLongClickListener(new b0(r3, this, e0Var));
        d0 d0Var = this.c;
        d0Var.addView(e0Var, w7.b6.p(d0Var.getOrientation() == 0 ? 0 : -1, d0Var.getOrientation() != 1 ? -1 : 0, 1.0f, org.telegram.messenger.zs.E1));
    }

    public final void c(int i10) {
        if (this.f == i10) {
            return;
        }
        this.f = i10;
        d0 d0Var = this.c;
        if (i10 >= 0 && i10 < d0Var.getChildCount()) {
            View childAt = d0Var.getChildAt(i10);
            if (childAt instanceof e0) {
                g9 g9Var = ((e0) childAt).h;
                if (g9Var.getAnimatedEmojiDrawable() != null) {
                    ag.c2 c2Var = g9Var.getAnimatedEmojiDrawable().k;
                    if (c2Var != null) {
                        c2Var.P0(false);
                    }
                } else {
                    g9Var.getImageReceiver().P0(false);
                }
            }
        }
        d0Var.invalidate();
    }

    public final void d(TL_aicompose.AiComposeTone aiComposeTone) {
        TL_aicompose.AiComposeTone aiComposeTone2;
        int i10 = 0;
        while (true) {
            d0 d0Var = this.c;
            if (i10 >= d0Var.getChildCount()) {
                return;
            }
            View childAt = d0Var.getChildAt(i10);
            if ((childAt instanceof e0) && (aiComposeTone2 = ((e0) childAt).e) != null && aiComposeTone2 == aiComposeTone) {
                c(i10);
                return;
            }
            i10++;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.e) {
            Paint W0 = org.telegram.ui.ActionBar.t6.W0("paintDivider", this.b);
            if (W0 == null) {
                W0 = org.telegram.ui.ActionBar.t6.k0;
            }
            canvas.drawRect(org.telegram.messenger.i0.L(10.0f), getHeight() - 1, getWidth() - org.telegram.messenger.i0.L(10.0f), getHeight(), W0);
        }
    }

    public int getSelectedTab() {
        return this.f;
    }

    public TL_aicompose.AiComposeTone getSelectedTone() {
        int i10 = this.f;
        if (i10 < 0) {
            return null;
        }
        d0 d0Var = this.c;
        if (i10 >= d0Var.getChildCount()) {
            return null;
        }
        View childAt = d0Var.getChildAt(this.f);
        if (childAt instanceof e0) {
            return ((e0) childAt).e;
        }
        return null;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), i11);
    }

    public void setDivider(boolean z10) {
        this.e = z10;
    }

    @Override // android.view.View
    public final void setPadding(int i10, int i11, int i12, int i13) {
        this.c.setPadding(i10, i11, i12, i13);
    }

    public void setRoundRadius(int i10) {
        this.d = i10;
    }
}
