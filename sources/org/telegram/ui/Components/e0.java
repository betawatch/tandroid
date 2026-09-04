package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_aicompose;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class e0 extends FrameLayout {
    public final int a;
    public final org.telegram.ui.ActionBar.f6 b;
    public final c0 c;
    public int d;
    public boolean e;
    public int f;
    public final e6 h;
    public di.p5 n;

    public e0(int i10, Context context, org.telegram.ui.ActionBar.f6 f6Var, boolean z10) {
        super(context);
        this.a = i10;
        this.b = f6Var;
        c0 c0Var = new c0(this, context, f6Var);
        this.c = c0Var;
        c0Var.setOrientation(0);
        this.h = new e6(c0Var, 0L, 320L, pr.h);
        if (!z10) {
            addView(c0Var, w7.x5.e(-1, -1, 119));
            return;
        }
        HorizontalScrollView horizontalScrollView = new HorizontalScrollView(context);
        horizontalScrollView.setFillViewport(true);
        horizontalScrollView.addView(c0Var);
        addView(horizontalScrollView, w7.x5.e(-1, -1, 119));
    }

    public final void a(int i10, String str, Utilities.Callback callback) {
        c0 c0Var = this.c;
        int childCount = c0Var.getChildCount();
        d0 d0Var = new d0(getContext(), this.a, this.b);
        d0Var.c = this.d;
        d0Var.d();
        d0Var.f = false;
        d0Var.h.setImageResource(i10);
        d0Var.n.setText(str);
        d0Var.setOnClickListener(new b0(childCount, 0, callback));
        c0Var.addView(d0Var, w7.x5.o(0, -1, 1.0f, 119));
    }

    public final void b(TL_aicompose.AiComposeTone aiComposeTone, Utilities.Callback callback) {
        d0 d0Var = new d0(getContext(), this.a, this.b);
        d0Var.e = aiComposeTone;
        d0Var.c = this.d;
        d0Var.d();
        TextView textView = d0Var.n;
        x9 x9Var = d0Var.h;
        if (aiComposeTone == null) {
            d0Var.d = false;
            d0Var.d();
            int i10 = R.drawable.tone_create;
            String string = LocaleController.getString(R.string.AIEditorStyleNewCreate);
            d0Var.f = false;
            x9Var.setImageResource(i10);
            textView.setText(string);
        } else if (aiComposeTone instanceof a0) {
            d0Var.d = false;
            d0Var.d();
            int i11 = R.drawable.iv_prompt;
            String string2 = LocaleController.getString(R.string.AIEditorStylePrompt);
            d0Var.f = false;
            x9Var.setImageResource(i11);
            textView.setText(string2);
        } else {
            String str = aiComposeTone.title;
            long j3 = aiComposeTone.emoji_id;
            d0Var.f = true;
            x9Var.setColorFilter(null);
            x9Var.setImageDrawable(Emoji.getEmojiDrawable(null));
            textView.setText(str);
            int i12 = d0Var.a;
            if (ConnectionsManager.getInstance(i12).isTestBackend()) {
                for (int i13 = 0; i13 < 4 && (!UserConfig.getInstance(i13).isClientActivated() || ConnectionsManager.getInstance(i13).isTestBackend()); i13++) {
                }
            }
            x9Var.setAnimatedEmojiDrawable(new q5(9, i12, j3));
        }
        d0Var.setOnClickListener(new org.telegram.ui.rf(10, callback, aiComposeTone));
        d0Var.setOnLongClickListener(new bi.d3(1, this, d0Var));
        c0 c0Var = this.c;
        c0Var.addView(d0Var, w7.x5.o(c0Var.getOrientation() == 0 ? 0 : -1, c0Var.getOrientation() != 1 ? -1 : 0, 1.0f, 119));
    }

    public final void c(int i10) {
        if (this.f == i10) {
            return;
        }
        this.f = i10;
        c0 c0Var = this.c;
        if (i10 >= 0 && i10 < c0Var.getChildCount()) {
            View childAt = c0Var.getChildAt(i10);
            if (childAt instanceof d0) {
                x9 x9Var = ((d0) childAt).h;
                if (x9Var.getAnimatedEmojiDrawable() != null) {
                    bi.y3 y3Var = x9Var.getAnimatedEmojiDrawable().k;
                    if (y3Var != null) {
                        y3Var.startAnimation();
                    }
                } else {
                    x9Var.getImageReceiver().startAnimation();
                }
            }
        }
        c0Var.invalidate();
    }

    public final void d(TL_aicompose.AiComposeTone aiComposeTone) {
        TL_aicompose.AiComposeTone aiComposeTone2;
        int i10 = 0;
        while (true) {
            c0 c0Var = this.c;
            if (i10 >= c0Var.getChildCount()) {
                return;
            }
            View childAt = c0Var.getChildAt(i10);
            if ((childAt instanceof d0) && (aiComposeTone2 = ((d0) childAt).e) != null && aiComposeTone2 == aiComposeTone) {
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
            Paint T0 = org.telegram.ui.ActionBar.j6.T0("paintDivider", this.b);
            if (T0 == null) {
                T0 = org.telegram.ui.ActionBar.j6.k0;
            }
            canvas.drawRect(AndroidUtilities.dp(10.0f), getHeight() - 1, getWidth() - AndroidUtilities.dp(10.0f), getHeight(), T0);
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
        c0 c0Var = this.c;
        if (i10 >= c0Var.getChildCount()) {
            return null;
        }
        View childAt = c0Var.getChildAt(this.f);
        if (childAt instanceof d0) {
            return ((d0) childAt).e;
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
