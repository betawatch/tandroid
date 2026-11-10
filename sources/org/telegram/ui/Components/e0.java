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

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class e0 extends FrameLayout {
    public final int a;
    public final org.telegram.ui.ActionBar.h6 b;
    public final c0 c;
    public int d;
    public boolean e;
    public int f;
    public final v5 h;
    public fi.u4 n;

    public e0(int i7, Context context, org.telegram.ui.ActionBar.h6 h6Var, boolean z9) {
        super(context);
        this.a = i7;
        this.b = h6Var;
        c0 c0Var = new c0(this, context, h6Var);
        this.c = c0Var;
        c0Var.setOrientation(0);
        this.h = new v5(c0Var, 0L, 320L, wq.h);
        if (!z9) {
            addView(c0Var, c8.ha.e(-1, -1, org.telegram.messenger.qs.E1));
            return;
        }
        HorizontalScrollView horizontalScrollView = new HorizontalScrollView(context);
        horizontalScrollView.setFillViewport(true);
        horizontalScrollView.addView(c0Var);
        addView(horizontalScrollView, c8.ha.e(-1, -1, org.telegram.messenger.qs.E1));
    }

    public final void a(int i7, String str, org.telegram.messenger.c20 c20Var) {
        c0 c0Var = this.c;
        int childCount = c0Var.getChildCount();
        d0 d0Var = new d0(this.a, getContext(), this.b);
        d0Var.c = this.d;
        d0Var.updateColors();
        d0Var.f = false;
        d0Var.h.setImageResource(i7);
        d0Var.n.setText(str);
        d0Var.setOnClickListener(new b0(c20Var, childCount, 0));
        c0Var.addView(d0Var, c8.ha.p(0, -1, 1.0f, org.telegram.messenger.qs.E1));
    }

    public final void b(TL_aicompose.AiComposeTone aiComposeTone, org.telegram.messenger.c20 c20Var) {
        d0 d0Var = new d0(this.a, getContext(), this.b);
        d0Var.e = aiComposeTone;
        d0Var.c = this.d;
        d0Var.updateColors();
        int i7 = 1;
        TextView textView = d0Var.n;
        k9 k9Var = d0Var.h;
        if (aiComposeTone == null) {
            d0Var.d = false;
            d0Var.updateColors();
            String M0 = org.telegram.messenger.id.M0(2131754975, null);
            d0Var.f = false;
            k9Var.setImageResource(R.drawable.tone_create);
            textView.setText(M0);
        } else if (aiComposeTone instanceof a0) {
            d0Var.d = false;
            d0Var.updateColors();
            String M02 = org.telegram.messenger.id.M0(2131754973, null);
            d0Var.f = false;
            k9Var.setImageResource(R.drawable.iv_prompt);
            textView.setText(M02);
        } else {
            String str = aiComposeTone.title;
            long j3 = aiComposeTone.emoji_id;
            d0Var.f = true;
            k9Var.setColorFilter(null);
            k9Var.setImageDrawable(org.telegram.messenger.i6.g(null));
            textView.setText(str);
            int i10 = d0Var.a;
            if (ConnectionsManager.getInstance(i10).isTestBackend()) {
                for (int i11 = 0; i11 < 4 && (!org.telegram.messenger.p10.i(i11).p() || ConnectionsManager.getInstance(i11).isTestBackend()); i11++) {
                }
            }
            k9Var.setAnimatedEmojiDrawable(new h5(9, i10, j3));
        }
        d0Var.setOnClickListener(new org.telegram.ui.ActionBar.l1(19, c20Var, aiComposeTone));
        d0Var.setOnLongClickListener(new di.f2(i7, this, d0Var));
        c0 c0Var = this.c;
        c0Var.addView(d0Var, c8.ha.p(c0Var.getOrientation() == 0 ? 0 : -1, c0Var.getOrientation() != 1 ? -1 : 0, 1.0f, org.telegram.messenger.qs.E1));
    }

    public final void c(int i7) {
        if (this.f == i7) {
            return;
        }
        this.f = i7;
        c0 c0Var = this.c;
        if (i7 >= 0 && i7 < c0Var.getChildCount()) {
            View childAt = c0Var.getChildAt(i7);
            if (childAt instanceof d0) {
                k9 k9Var = ((d0) childAt).h;
                if (k9Var.getAnimatedEmojiDrawable() != null) {
                    di.z2 z2Var = k9Var.getAnimatedEmojiDrawable().k;
                    if (z2Var != null) {
                        z2Var.P0(false);
                    }
                } else {
                    k9Var.getImageReceiver().P0(false);
                }
            }
        }
        c0Var.invalidate();
    }

    public final void d(TL_aicompose.AiComposeTone aiComposeTone) {
        TL_aicompose.AiComposeTone aiComposeTone2;
        int i7 = 0;
        while (true) {
            c0 c0Var = this.c;
            if (i7 >= c0Var.getChildCount()) {
                return;
            }
            View childAt = c0Var.getChildAt(i7);
            if ((childAt instanceof d0) && (aiComposeTone2 = ((d0) childAt).e) != null && aiComposeTone2 == aiComposeTone) {
                c(i7);
                return;
            }
            i7++;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.e) {
            Paint W0 = org.telegram.ui.ActionBar.m6.W0("paintDivider", this.b);
            if (W0 == null) {
                W0 = org.telegram.ui.ActionBar.m6.k0;
            }
            canvas.drawRect(org.telegram.messenger.g0.L(10.0f), getHeight() - 1, getWidth() - org.telegram.messenger.g0.L(10.0f), getHeight(), W0);
        }
    }

    public int getSelectedTab() {
        return this.f;
    }

    public TL_aicompose.AiComposeTone getSelectedTone() {
        int i7 = this.f;
        if (i7 < 0) {
            return null;
        }
        c0 c0Var = this.c;
        if (i7 >= c0Var.getChildCount()) {
            return null;
        }
        View childAt = c0Var.getChildAt(this.f);
        if (childAt instanceof d0) {
            return ((d0) childAt).e;
        }
        return null;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), TLObject.FLAG_30), i10);
    }

    public void setDivider(boolean z9) {
        this.e = z9;
    }

    @Override // android.view.View
    public final void setPadding(int i7, int i10, int i11, int i12) {
        this.c.setPadding(i7, i10, i11, i12);
    }

    public void setRoundRadius(int i7) {
        this.d = i7;
    }
}
