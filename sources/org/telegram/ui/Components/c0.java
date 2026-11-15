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

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class c0 extends FrameLayout {
    public final int a;
    public final org.telegram.ui.ActionBar.e6 b;
    public final a0 c;
    public int d;
    public boolean e;
    public int f;
    public final u5 h;
    public hi.s4 n;

    public c0(int i7, Context context, org.telegram.ui.ActionBar.e6 e6Var, boolean z10) {
        super(context);
        this.a = i7;
        this.b = e6Var;
        a0 a0Var = new a0(this, context, e6Var);
        this.c = a0Var;
        a0Var.setOrientation(0);
        this.h = new u5(a0Var, 0L, 320L, er.h);
        if (!z10) {
            addView(a0Var, c8.ja.e(-1, -1, org.telegram.messenger.ns.E1));
            return;
        }
        HorizontalScrollView horizontalScrollView = new HorizontalScrollView(context);
        horizontalScrollView.setFillViewport(true);
        horizontalScrollView.addView(a0Var);
        addView(horizontalScrollView, c8.ja.e(-1, -1, org.telegram.messenger.ns.E1));
    }

    public final void a(int i7, String str, org.telegram.messenger.z10 z10Var) {
        a0 a0Var = this.c;
        int childCount = a0Var.getChildCount();
        b0 b0Var = new b0(this.a, getContext(), this.b);
        b0Var.c = this.d;
        b0Var.updateColors();
        b0Var.f = false;
        b0Var.h.setImageResource(i7);
        b0Var.n.setText(str);
        b0Var.setOnClickListener(new bi.p2(z10Var, childCount, 1));
        a0Var.addView(b0Var, c8.ja.p(0, -1, 1.0f, org.telegram.messenger.ns.E1));
    }

    public final void b(TL_aicompose.AiComposeTone aiComposeTone, org.telegram.messenger.z10 z10Var) {
        b0 b0Var = new b0(this.a, getContext(), this.b);
        b0Var.e = aiComposeTone;
        b0Var.c = this.d;
        b0Var.updateColors();
        int i7 = 1;
        TextView textView = b0Var.n;
        i9 i9Var = b0Var.h;
        if (aiComposeTone == null) {
            b0Var.d = false;
            b0Var.updateColors();
            String M0 = org.telegram.messenger.hd.M0(2131754975, null);
            b0Var.f = false;
            i9Var.setImageResource(R.drawable.tone_create);
            textView.setText(M0);
        } else if (aiComposeTone instanceof z) {
            b0Var.d = false;
            b0Var.updateColors();
            String M02 = org.telegram.messenger.hd.M0(2131754973, null);
            b0Var.f = false;
            i9Var.setImageResource(R.drawable.iv_prompt);
            textView.setText(M02);
        } else {
            String str = aiComposeTone.title;
            long j3 = aiComposeTone.emoji_id;
            b0Var.f = true;
            i9Var.setColorFilter(null);
            i9Var.setImageDrawable(org.telegram.messenger.j6.g(null));
            textView.setText(str);
            int i10 = b0Var.a;
            if (ConnectionsManager.getInstance(i10).isTestBackend()) {
                for (int i11 = 0; i11 < 4 && (!org.telegram.messenger.m10.i(i11).p() || ConnectionsManager.getInstance(i11).isTestBackend()); i11++) {
                }
            }
            i9Var.setAnimatedEmojiDrawable(new g5(9, i10, j3));
        }
        b0Var.setOnClickListener(new org.telegram.messenger.video.e(26, z10Var, aiComposeTone));
        b0Var.setOnLongClickListener(new fi.b2(i7, this, b0Var));
        a0 a0Var = this.c;
        a0Var.addView(b0Var, c8.ja.p(a0Var.getOrientation() == 0 ? 0 : -1, a0Var.getOrientation() != 1 ? -1 : 0, 1.0f, org.telegram.messenger.ns.E1));
    }

    public final void c(int i7) {
        if (this.f == i7) {
            return;
        }
        this.f = i7;
        a0 a0Var = this.c;
        if (i7 >= 0 && i7 < a0Var.getChildCount()) {
            View childAt = a0Var.getChildAt(i7);
            if (childAt instanceof b0) {
                i9 i9Var = ((b0) childAt).h;
                if (i9Var.getAnimatedEmojiDrawable() != null) {
                    fi.u2 u2Var = i9Var.getAnimatedEmojiDrawable().k;
                    if (u2Var != null) {
                        u2Var.P0(false);
                    }
                } else {
                    i9Var.getImageReceiver().P0(false);
                }
            }
        }
        a0Var.invalidate();
    }

    public final void d(TL_aicompose.AiComposeTone aiComposeTone) {
        TL_aicompose.AiComposeTone aiComposeTone2;
        int i7 = 0;
        while (true) {
            a0 a0Var = this.c;
            if (i7 >= a0Var.getChildCount()) {
                return;
            }
            View childAt = a0Var.getChildAt(i7);
            if ((childAt instanceof b0) && (aiComposeTone2 = ((b0) childAt).e) != null && aiComposeTone2 == aiComposeTone) {
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
            Paint W0 = org.telegram.ui.ActionBar.j6.W0("paintDivider", this.b);
            if (W0 == null) {
                W0 = org.telegram.ui.ActionBar.j6.k0;
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
        a0 a0Var = this.c;
        if (i7 >= a0Var.getChildCount()) {
            return null;
        }
        View childAt = a0Var.getChildAt(this.f);
        if (childAt instanceof b0) {
            return ((b0) childAt).e;
        }
        return null;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), TLObject.FLAG_30), i10);
    }

    public void setDivider(boolean z10) {
        this.e = z10;
    }

    @Override // android.view.View
    public final void setPadding(int i7, int i10, int i11, int i12) {
        this.c.setPadding(i7, i10, i11, i12);
    }

    public void setRoundRadius(int i7) {
        this.d = i7;
    }
}
