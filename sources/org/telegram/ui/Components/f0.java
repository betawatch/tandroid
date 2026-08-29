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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class f0 extends FrameLayout {
    public final int a;
    public final org.telegram.ui.ActionBar.c6 b;
    public final d0 c;
    public int d;
    public boolean e;
    public int f;
    public final d6 h;
    public nh.v4 n;

    public f0(int i10, Context context, org.telegram.ui.ActionBar.c6 c6Var, boolean z10) {
        super(context);
        this.a = i10;
        this.b = c6Var;
        d0 d0Var = new d0(this, context, c6Var);
        this.c = d0Var;
        d0Var.setOrientation(0);
        this.h = new d6(d0Var, 0L, 320L, jr.h);
        if (!z10) {
            addView(d0Var, i7.f6.e(-1, -1, 119));
            return;
        }
        HorizontalScrollView horizontalScrollView = new HorizontalScrollView(context);
        horizontalScrollView.setFillViewport(true);
        horizontalScrollView.addView(d0Var);
        addView(horizontalScrollView, i7.f6.e(-1, -1, 119));
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
        e0Var.setOnClickListener(new ih.e2(childCount, 1, callback));
        d0Var.addView(e0Var, i7.f6.o(0, -1, 1.0f, 119));
    }

    public final void b(TL_aicompose.AiComposeTone aiComposeTone, Utilities.Callback callback) {
        e0 e0Var = new e0(getContext(), this.a, this.b);
        e0Var.e = aiComposeTone;
        e0Var.c = this.d;
        e0Var.e();
        TextView textView = e0Var.n;
        t9 t9Var = e0Var.h;
        if (aiComposeTone == null) {
            e0Var.d = false;
            e0Var.e();
            int i10 = R.drawable.tone_create;
            String string = LocaleController.getString(R.string.AIEditorStyleNewCreate);
            e0Var.f = false;
            t9Var.setImageResource(i10);
            textView.setText(string);
        } else if (aiComposeTone instanceof c0) {
            e0Var.d = false;
            e0Var.e();
            int i11 = R.drawable.iv_prompt;
            String string2 = LocaleController.getString(R.string.AIEditorStylePrompt);
            e0Var.f = false;
            t9Var.setImageResource(i11);
            textView.setText(string2);
        } else {
            String str = aiComposeTone.title;
            long j10 = aiComposeTone.emoji_id;
            e0Var.f = true;
            t9Var.setColorFilter(null);
            t9Var.setImageDrawable(Emoji.getEmojiDrawable(null));
            textView.setText(str);
            int i12 = e0Var.a;
            if (ConnectionsManager.getInstance(i12).isTestBackend()) {
                for (int i13 = 0; i13 < 4 && (!UserConfig.getInstance(i13).isClientActivated() || ConnectionsManager.getInstance(i13).isTestBackend()); i13++) {
                }
            }
            t9Var.setAnimatedEmojiDrawable(new p5(9, i12, j10));
        }
        e0Var.setOnClickListener(new nh.r7(28, callback, aiComposeTone));
        e0Var.setOnLongClickListener(new lh.e2(1, this, e0Var));
        d0 d0Var = this.c;
        d0Var.addView(e0Var, i7.f6.o(d0Var.getOrientation() == 0 ? 0 : -1, d0Var.getOrientation() != 1 ? -1 : 0, 1.0f, 119));
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
                t9 t9Var = ((e0) childAt).h;
                if (t9Var.getAnimatedEmojiDrawable() != null) {
                    lh.x2 x2Var = t9Var.getAnimatedEmojiDrawable().k;
                    if (x2Var != null) {
                        x2Var.startAnimation();
                    }
                } else {
                    t9Var.getImageReceiver().startAnimation();
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
            Paint T0 = org.telegram.ui.ActionBar.g6.T0("paintDivider", this.b);
            if (T0 == null) {
                T0 = org.telegram.ui.ActionBar.g6.k0;
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
