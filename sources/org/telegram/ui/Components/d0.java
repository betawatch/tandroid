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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class d0 extends FrameLayout {
    public final int a;
    public final org.telegram.ui.ActionBar.b6 b;
    public final b0 c;
    public int d;
    public boolean e;
    public int f;
    public final y5 h;
    public kh.f5 n;

    public d0(int i9, Context context, org.telegram.ui.ActionBar.b6 b6Var, boolean z10) {
        super(context);
        this.a = i9;
        this.b = b6Var;
        b0 b0Var = new b0(this, context, b6Var);
        this.c = b0Var;
        b0Var.setOrientation(0);
        this.h = new y5(b0Var, 0L, 320L, gr.h);
        if (!z10) {
            addView(b0Var, g7.e6.e(-1, -1, 119));
            return;
        }
        HorizontalScrollView horizontalScrollView = new HorizontalScrollView(context);
        horizontalScrollView.setFillViewport(true);
        horizontalScrollView.addView(b0Var);
        addView(horizontalScrollView, g7.e6.e(-1, -1, 119));
    }

    public final void a(int i9, String str, Utilities.Callback callback) {
        b0 b0Var = this.c;
        int childCount = b0Var.getChildCount();
        c0 c0Var = new c0(getContext(), this.a, this.b);
        c0Var.c = this.d;
        c0Var.d();
        c0Var.f = false;
        c0Var.h.setImageResource(i9);
        c0Var.n.setText(str);
        c0Var.setOnClickListener(new fh.m2(childCount, 1, callback));
        b0Var.addView(c0Var, g7.e6.o(0, -1, 1.0f, 119));
    }

    public final void b(TL_aicompose.AiComposeTone aiComposeTone, Utilities.Callback callback) {
        c0 c0Var = new c0(getContext(), this.a, this.b);
        c0Var.e = aiComposeTone;
        c0Var.c = this.d;
        c0Var.d();
        TextView textView = c0Var.n;
        o9 o9Var = c0Var.h;
        if (aiComposeTone == null) {
            c0Var.d = false;
            c0Var.d();
            int i9 = R.drawable.tone_create;
            String string = LocaleController.getString(R.string.AIEditorStyleNewCreate);
            c0Var.f = false;
            o9Var.setImageResource(i9);
            textView.setText(string);
        } else if (aiComposeTone instanceof a0) {
            c0Var.d = false;
            c0Var.d();
            int i10 = R.drawable.iv_prompt;
            String string2 = LocaleController.getString(R.string.AIEditorStylePrompt);
            c0Var.f = false;
            o9Var.setImageResource(i10);
            textView.setText(string2);
        } else {
            String str = aiComposeTone.title;
            long j10 = aiComposeTone.emoji_id;
            c0Var.f = true;
            o9Var.setColorFilter(null);
            o9Var.setImageDrawable(Emoji.getEmojiDrawable(null));
            textView.setText(str);
            int i11 = c0Var.a;
            if (ConnectionsManager.getInstance(i11).isTestBackend()) {
                for (int i12 = 0; i12 < 4 && (!UserConfig.getInstance(i12).isClientActivated() || ConnectionsManager.getInstance(i12).isTestBackend()); i12++) {
                }
            }
            o9Var.setAnimatedEmojiDrawable(new k5(9, i11, j10));
        }
        c0Var.setOnClickListener(new mh.k3(27, callback, aiComposeTone));
        c0Var.setOnLongClickListener(new ih.g2(1, this, c0Var));
        b0 b0Var = this.c;
        b0Var.addView(c0Var, g7.e6.o(b0Var.getOrientation() == 0 ? 0 : -1, b0Var.getOrientation() != 1 ? -1 : 0, 1.0f, 119));
    }

    public final void c(int i9) {
        if (this.f == i9) {
            return;
        }
        this.f = i9;
        b0 b0Var = this.c;
        if (i9 >= 0 && i9 < b0Var.getChildCount()) {
            View childAt = b0Var.getChildAt(i9);
            if (childAt instanceof c0) {
                o9 o9Var = ((c0) childAt).h;
                if (o9Var.getAnimatedEmojiDrawable() != null) {
                    ih.z2 z2Var = o9Var.getAnimatedEmojiDrawable().k;
                    if (z2Var != null) {
                        z2Var.startAnimation();
                    }
                } else {
                    o9Var.getImageReceiver().startAnimation();
                }
            }
        }
        b0Var.invalidate();
    }

    public final void d(TL_aicompose.AiComposeTone aiComposeTone) {
        TL_aicompose.AiComposeTone aiComposeTone2;
        int i9 = 0;
        while (true) {
            b0 b0Var = this.c;
            if (i9 >= b0Var.getChildCount()) {
                return;
            }
            View childAt = b0Var.getChildAt(i9);
            if ((childAt instanceof c0) && (aiComposeTone2 = ((c0) childAt).e) != null && aiComposeTone2 == aiComposeTone) {
                c(i9);
                return;
            }
            i9++;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.e) {
            Paint T0 = org.telegram.ui.ActionBar.f6.T0("paintDivider", this.b);
            if (T0 == null) {
                T0 = org.telegram.ui.ActionBar.f6.k0;
            }
            canvas.drawRect(AndroidUtilities.dp(10.0f), getHeight() - 1, getWidth() - AndroidUtilities.dp(10.0f), getHeight(), T0);
        }
    }

    public int getSelectedTab() {
        return this.f;
    }

    public TL_aicompose.AiComposeTone getSelectedTone() {
        int i9 = this.f;
        if (i9 < 0) {
            return null;
        }
        b0 b0Var = this.c;
        if (i9 >= b0Var.getChildCount()) {
            return null;
        }
        View childAt = b0Var.getChildAt(this.f);
        if (childAt instanceof c0) {
            return ((c0) childAt).e;
        }
        return null;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i9), TLObject.FLAG_30), i10);
    }

    public void setDivider(boolean z10) {
        this.e = z10;
    }

    @Override // android.view.View
    public final void setPadding(int i9, int i10, int i11, int i12) {
        this.c.setPadding(i9, i10, i11, i12);
    }

    public void setRoundRadius(int i9) {
        this.d = i9;
    }
}
