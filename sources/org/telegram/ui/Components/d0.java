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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class d0 extends FrameLayout {
    public final int a;
    public final org.telegram.ui.ActionBar.e6 b;
    public final b0 c;
    public int d;
    public boolean e;
    public int f;
    public final u5 h;
    public gi.s4 n;

    public d0(int i3, Context context, org.telegram.ui.ActionBar.e6 e6Var, boolean z10) {
        super(context);
        this.a = i3;
        this.b = e6Var;
        b0 b0Var = new b0(this, context, e6Var);
        this.c = b0Var;
        b0Var.setOrientation(0);
        this.h = new u5(b0Var, 0L, 320L, xq.h);
        if (!z10) {
            addView(b0Var, b8.mf.e(-1, -1, org.telegram.messenger.hs.E1));
            return;
        }
        HorizontalScrollView horizontalScrollView = new HorizontalScrollView(context);
        horizontalScrollView.setFillViewport(true);
        horizontalScrollView.addView(b0Var);
        addView(horizontalScrollView, b8.mf.e(-1, -1, org.telegram.messenger.hs.E1));
    }

    public final void a(int i3, String str, org.telegram.messenger.u10 u10Var) {
        b0 b0Var = this.c;
        int childCount = b0Var.getChildCount();
        c0 c0Var = new c0(this.a, getContext(), this.b);
        c0Var.c = this.d;
        c0Var.updateColors();
        c0Var.f = false;
        c0Var.h.setImageResource(i3);
        c0Var.n.setText(str);
        c0Var.setOnClickListener(new ai.y2(childCount, 1, u10Var));
        b0Var.addView(c0Var, b8.mf.p(0, -1, 1.0f, org.telegram.messenger.hs.E1));
    }

    public final void b(TL_aicompose.AiComposeTone aiComposeTone, org.telegram.messenger.u10 u10Var) {
        c0 c0Var = new c0(this.a, getContext(), this.b);
        c0Var.e = aiComposeTone;
        c0Var.c = this.d;
        c0Var.updateColors();
        int i3 = 1;
        TextView textView = c0Var.n;
        k9 k9Var = c0Var.h;
        if (aiComposeTone == null) {
            c0Var.d = false;
            c0Var.updateColors();
            String M0 = org.telegram.messenger.bd.M0(2131754975, null);
            c0Var.f = false;
            k9Var.setImageResource(R.drawable.tone_create);
            textView.setText(M0);
        } else if (aiComposeTone instanceof a0) {
            c0Var.d = false;
            c0Var.updateColors();
            String M02 = org.telegram.messenger.bd.M0(2131754973, null);
            c0Var.f = false;
            k9Var.setImageResource(R.drawable.iv_prompt);
            textView.setText(M02);
        } else {
            String str = aiComposeTone.title;
            long j10 = aiComposeTone.emoji_id;
            c0Var.f = true;
            k9Var.setColorFilter(null);
            k9Var.setImageDrawable(org.telegram.messenger.i6.g(null));
            textView.setText(str);
            int i10 = c0Var.a;
            if (ConnectionsManager.getInstance(i10).isTestBackend()) {
                for (int i11 = 0; i11 < 4 && (!org.telegram.messenger.h10.i(i11).p() || ConnectionsManager.getInstance(i11).isTestBackend()); i11++) {
                }
            }
            k9Var.setAnimatedEmojiDrawable(new g5(9, i10, j10));
        }
        c0Var.setOnClickListener(new org.telegram.messenger.video.g(25, u10Var, aiComposeTone));
        c0Var.setOnLongClickListener(new ei.j2(i3, this, c0Var));
        b0 b0Var = this.c;
        b0Var.addView(c0Var, b8.mf.p(b0Var.getOrientation() == 0 ? 0 : -1, b0Var.getOrientation() != 1 ? -1 : 0, 1.0f, org.telegram.messenger.hs.E1));
    }

    public final void c(int i3) {
        if (this.f == i3) {
            return;
        }
        this.f = i3;
        b0 b0Var = this.c;
        if (i3 >= 0 && i3 < b0Var.getChildCount()) {
            View childAt = b0Var.getChildAt(i3);
            if (childAt instanceof c0) {
                k9 k9Var = ((c0) childAt).h;
                if (k9Var.getAnimatedEmojiDrawable() != null) {
                    ei.c3 c3Var = k9Var.getAnimatedEmojiDrawable().k;
                    if (c3Var != null) {
                        c3Var.P0(false);
                    }
                } else {
                    k9Var.getImageReceiver().P0(false);
                }
            }
        }
        b0Var.invalidate();
    }

    public final void d(TL_aicompose.AiComposeTone aiComposeTone) {
        TL_aicompose.AiComposeTone aiComposeTone2;
        int i3 = 0;
        while (true) {
            b0 b0Var = this.c;
            if (i3 >= b0Var.getChildCount()) {
                return;
            }
            View childAt = b0Var.getChildAt(i3);
            if ((childAt instanceof c0) && (aiComposeTone2 = ((c0) childAt).e) != null && aiComposeTone2 == aiComposeTone) {
                c(i3);
                return;
            }
            i3++;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.e) {
            Paint W0 = org.telegram.ui.ActionBar.k6.W0("paintDivider", this.b);
            if (W0 == null) {
                W0 = org.telegram.ui.ActionBar.k6.k0;
            }
            canvas.drawRect(org.telegram.messenger.g0.L(10.0f), getHeight() - 1, getWidth() - org.telegram.messenger.g0.L(10.0f), getHeight(), W0);
        }
    }

    public int getSelectedTab() {
        return this.f;
    }

    public TL_aicompose.AiComposeTone getSelectedTone() {
        int i3 = this.f;
        if (i3 < 0) {
            return null;
        }
        b0 b0Var = this.c;
        if (i3 >= b0Var.getChildCount()) {
            return null;
        }
        View childAt = b0Var.getChildAt(this.f);
        if (childAt instanceof c0) {
            return ((c0) childAt).e;
        }
        return null;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), TLObject.FLAG_30), i10);
    }

    public void setDivider(boolean z10) {
        this.e = z10;
    }

    @Override // android.view.View
    public final void setPadding(int i3, int i10, int i11, int i12) {
        this.c.setPadding(i3, i10, i11, i12);
    }

    public void setRoundRadius(int i3) {
        this.d = i3;
    }
}
