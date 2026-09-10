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

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class f0 extends FrameLayout {
    public final int a;
    public final org.telegram.ui.ActionBar.f6 b;
    public final d0 c;
    public int d;
    public boolean e;
    public int f;
    public final d6 h;
    public bi.n6 n;

    public f0(int i10, Context context, org.telegram.ui.ActionBar.f6 f6Var, boolean z10) {
        super(context);
        this.a = i10;
        this.b = f6Var;
        d0 d0Var = new d0(this, context, f6Var);
        this.c = d0Var;
        d0Var.setOrientation(0);
        this.h = new d6(d0Var, 0L, 320L, wr.h);
        if (!z10) {
            addView(d0Var, w7.a6.e(-1, -1, 119));
            return;
        }
        HorizontalScrollView horizontalScrollView = new HorizontalScrollView(context);
        horizontalScrollView.setFillViewport(true);
        horizontalScrollView.addView(d0Var);
        addView(horizontalScrollView, w7.a6.e(-1, -1, 119));
    }

    public final void a(int i10, String str, Utilities.Callback callback) {
        d0 d0Var = this.c;
        int childCount = d0Var.getChildCount();
        e0 e0Var = new e0(getContext(), this.a, this.b);
        e0Var.c = this.d;
        e0Var.e();
        e0Var.f = false;
        e0Var.h.setImageResource(i10);
        e0Var.n.setText(str);
        e0Var.setOnClickListener(new c0(childCount, 0, callback));
        d0Var.addView(e0Var, w7.a6.o(0, -1, 1.0f, 119));
    }

    public final void b(TL_aicompose.AiComposeTone aiComposeTone, Utilities.Callback callback) {
        e0 e0Var = new e0(getContext(), this.a, this.b);
        e0Var.e = aiComposeTone;
        e0Var.c = this.d;
        e0Var.e();
        TextView textView = e0Var.n;
        w9 w9Var = e0Var.h;
        if (aiComposeTone == null) {
            e0Var.d = false;
            e0Var.e();
            int i10 = R.drawable.tone_create;
            String string = LocaleController.getString(R.string.AIEditorStyleNewCreate);
            e0Var.f = false;
            w9Var.setImageResource(i10);
            textView.setText(string);
        } else if (aiComposeTone instanceof a0) {
            e0Var.d = false;
            e0Var.e();
            int i11 = R.drawable.iv_prompt;
            String string2 = LocaleController.getString(R.string.AIEditorStylePrompt);
            e0Var.f = false;
            w9Var.setImageResource(i11);
            textView.setText(string2);
        } else {
            String str = aiComposeTone.title;
            long j3 = aiComposeTone.emoji_id;
            e0Var.f = true;
            w9Var.setColorFilter(null);
            w9Var.setImageDrawable(Emoji.getEmojiDrawable(null));
            textView.setText(str);
            int i12 = e0Var.a;
            if (ConnectionsManager.getInstance(i12).isTestBackend()) {
                for (int i13 = 0; i13 < 4 && (!UserConfig.getInstance(i13).isClientActivated() || ConnectionsManager.getInstance(i13).isTestBackend()); i13++) {
                }
            }
            w9Var.setAnimatedEmojiDrawable(new p5(9, i12, j3));
        }
        e0Var.setOnClickListener(new org.telegram.ui.sh(7, callback, aiComposeTone));
        e0Var.setOnLongClickListener(new b0(0, this, e0Var));
        d0 d0Var = this.c;
        d0Var.addView(e0Var, w7.a6.o(d0Var.getOrientation() == 0 ? 0 : -1, d0Var.getOrientation() != 1 ? -1 : 0, 1.0f, 119));
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
                w9 w9Var = ((e0) childAt).h;
                if (w9Var.getAnimatedEmojiDrawable() != null) {
                    gg.h1 h1Var = w9Var.getAnimatedEmojiDrawable().k;
                    if (h1Var != null) {
                        h1Var.startAnimation();
                    }
                } else {
                    w9Var.getImageReceiver().startAnimation();
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
