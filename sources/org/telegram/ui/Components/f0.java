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

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class f0 extends FrameLayout {
    public final int a;
    public final org.telegram.ui.ActionBar.g6 b;
    public final d0 c;
    public int d;
    public boolean e;
    public int f;
    public final w5 h;
    public fi.u4 n;

    public f0(int i7, Context context, org.telegram.ui.ActionBar.g6 g6Var, boolean z9) {
        super(context);
        this.a = i7;
        this.b = g6Var;
        d0 d0Var = new d0(this, context, g6Var);
        this.c = d0Var;
        d0Var.setOrientation(0);
        this.h = new w5(d0Var, 0L, 320L, xq.h);
        if (!z9) {
            addView(d0Var, c8.ha.e(-1, -1, org.telegram.messenger.qs.E1));
            return;
        }
        HorizontalScrollView horizontalScrollView = new HorizontalScrollView(context);
        horizontalScrollView.setFillViewport(true);
        horizontalScrollView.addView(d0Var);
        addView(horizontalScrollView, c8.ha.e(-1, -1, org.telegram.messenger.qs.E1));
    }

    public final void a(int i7, String str, org.telegram.messenger.c20 c20Var) {
        d0 d0Var = this.c;
        int childCount = d0Var.getChildCount();
        e0 e0Var = new e0(this.a, getContext(), this.b);
        e0Var.c = this.d;
        e0Var.updateColors();
        e0Var.f = false;
        e0Var.h.setImageResource(i7);
        e0Var.n.setText(str);
        e0Var.setOnClickListener(new c0(c20Var, childCount, 0));
        d0Var.addView(e0Var, c8.ha.p(0, -1, 1.0f, org.telegram.messenger.qs.E1));
    }

    public final void b(TL_aicompose.AiComposeTone aiComposeTone, org.telegram.messenger.c20 c20Var) {
        e0 e0Var = new e0(this.a, getContext(), this.b);
        e0Var.e = aiComposeTone;
        e0Var.c = this.d;
        e0Var.updateColors();
        int i7 = 1;
        TextView textView = e0Var.n;
        l9 l9Var = e0Var.h;
        if (aiComposeTone == null) {
            e0Var.d = false;
            e0Var.updateColors();
            String M0 = org.telegram.messenger.id.M0(2131754975, null);
            e0Var.f = false;
            l9Var.setImageResource(R.drawable.tone_create);
            textView.setText(M0);
        } else if (aiComposeTone instanceof b0) {
            e0Var.d = false;
            e0Var.updateColors();
            String M02 = org.telegram.messenger.id.M0(2131754973, null);
            e0Var.f = false;
            l9Var.setImageResource(R.drawable.iv_prompt);
            textView.setText(M02);
        } else {
            String str = aiComposeTone.title;
            long j3 = aiComposeTone.emoji_id;
            e0Var.f = true;
            l9Var.setColorFilter(null);
            l9Var.setImageDrawable(org.telegram.messenger.i6.g(null));
            textView.setText(str);
            int i10 = e0Var.a;
            if (ConnectionsManager.getInstance(i10).isTestBackend()) {
                for (int i11 = 0; i11 < 4 && (!org.telegram.messenger.p10.i(i11).p() || ConnectionsManager.getInstance(i11).isTestBackend()); i11++) {
                }
            }
            l9Var.setAnimatedEmojiDrawable(new i5(9, i10, j3));
        }
        e0Var.setOnClickListener(new org.telegram.ui.ActionBar.l1(19, c20Var, aiComposeTone));
        e0Var.setOnLongClickListener(new di.f2(i7, this, e0Var));
        d0 d0Var = this.c;
        d0Var.addView(e0Var, c8.ha.p(d0Var.getOrientation() == 0 ? 0 : -1, d0Var.getOrientation() != 1 ? -1 : 0, 1.0f, org.telegram.messenger.qs.E1));
    }

    public final void c(int i7) {
        if (this.f == i7) {
            return;
        }
        this.f = i7;
        d0 d0Var = this.c;
        if (i7 >= 0 && i7 < d0Var.getChildCount()) {
            View childAt = d0Var.getChildAt(i7);
            if (childAt instanceof e0) {
                l9 l9Var = ((e0) childAt).h;
                if (l9Var.getAnimatedEmojiDrawable() != null) {
                    di.z2 z2Var = l9Var.getAnimatedEmojiDrawable().k;
                    if (z2Var != null) {
                        z2Var.P0(false);
                    }
                } else {
                    l9Var.getImageReceiver().P0(false);
                }
            }
        }
        d0Var.invalidate();
    }

    public final void d(TL_aicompose.AiComposeTone aiComposeTone) {
        TL_aicompose.AiComposeTone aiComposeTone2;
        int i7 = 0;
        while (true) {
            d0 d0Var = this.c;
            if (i7 >= d0Var.getChildCount()) {
                return;
            }
            View childAt = d0Var.getChildAt(i7);
            if ((childAt instanceof e0) && (aiComposeTone2 = ((e0) childAt).e) != null && aiComposeTone2 == aiComposeTone) {
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
            Paint W0 = org.telegram.ui.ActionBar.l6.W0("paintDivider", this.b);
            if (W0 == null) {
                W0 = org.telegram.ui.ActionBar.l6.k0;
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
        d0 d0Var = this.c;
        if (i7 >= d0Var.getChildCount()) {
            return null;
        }
        View childAt = d0Var.getChildAt(this.f);
        if (childAt instanceof e0) {
            return ((e0) childAt).e;
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
