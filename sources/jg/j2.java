package jg;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.os.Build;
import android.text.SpannableStringBuilder;
import android.view.ContextThemeWrapper;
import android.view.View;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cd;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.dq;
import org.telegram.ui.Components.s9;
import org.telegram.ui.Components.w9;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public abstract class j2 extends vh.d {
    public final w9 k0;
    public final RectF l0;
    public int m0;
    public final v2 n0;
    public final p6 o0;
    public int p0;
    public boolean q0;

    public j2(v2 v2Var, ContextThemeWrapper contextThemeWrapper, p6 p6Var, s9 s9Var) {
        super(contextThemeWrapper, p6Var, false);
        this.l0 = new RectF();
        this.p0 = 8;
        this.o0 = p6Var;
        this.n0 = v2Var;
        this.k0 = new w9(s9Var, this, 0, true);
        setWillNotDraw(false);
        setTextColor(-1);
        setFlickeringLoading(true);
        this.d.x(org.telegram.messenger.i0.o());
        removeView(this.r);
        setForeground(t6.a0(t6.r1(0.08f, -1), 8, 8));
        setPadding(org.telegram.messenger.i0.L(24.0f), 0, org.telegram.messenger.i0.L(24.0f), 0);
    }

    @Override // vh.d, android.view.View
    public void onDraw(Canvas canvas) {
        boolean z10 = this.g0;
        RectF rectF = this.l0;
        if (z10) {
            float c10 = this.d.c() + getPaddingLeft() + getPaddingRight();
            rectF.set((getMeasuredWidth() - c10) / 2.0f, 0.0f, (getMeasuredWidth() + c10) / 2.0f, getMeasuredHeight());
        } else {
            rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        }
        super.onDraw(canvas);
    }

    @Override // vh.d, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        if (this.q0) {
            i10 = View.MeasureSpec.makeMeasureSpec(getPaddingRight() + getPaddingLeft() + ((int) this.d.c()), TLObject.FLAG_30);
        }
        super.onMeasure(i10, i11);
    }

    @Override // android.view.View
    public void setAlpha(float f7) {
        s2[] s2VarArr;
        v2 v2Var = this.n0;
        if (!v2Var.D || (s2VarArr = v2Var.H) == null || s2VarArr.length <= 0) {
            f7 = 0.0f;
        }
        super.setAlpha(f7);
    }

    public void setCancelState(boolean z10) {
        this.m0 = 2;
        i(cd.L0(2131752589, null), z10, true);
    }

    public void setCutOutState(boolean z10) {
        this.m0 = 0;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("d");
        dq dqVar = new dq(R.drawable.media_magic_cut, 0);
        dqVar.c(org.telegram.messenger.i0.L(22.0f));
        dqVar.r = org.telegram.messenger.i0.L(1.0f);
        dqVar.s = org.telegram.messenger.i0.L(2.0f);
        dqVar.G = 1.2f;
        spannableStringBuilder.setSpan(dqVar, 0, 1, 0);
        spannableStringBuilder.append((CharSequence) " ").append((CharSequence) cd.L0(2131745697, null));
        i(spannableStringBuilder, z10, true);
    }

    public void setEraseState(boolean z10) {
        this.m0 = 3;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("d");
        dq dqVar = new dq(R.drawable.media_button_erase, 0);
        dqVar.c(org.telegram.messenger.i0.L(20.0f));
        dqVar.r = org.telegram.messenger.i0.L(-3.0f);
        spannableStringBuilder.setSpan(dqVar, 0, 1, 0);
        spannableStringBuilder.append((CharSequence) " ").append((CharSequence) cd.L0(2131745695, null));
        i(spannableStringBuilder, z10, true);
    }

    public void setOutlineState(boolean z10) {
        this.m0 = 6;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("d");
        dq dqVar = new dq(R.drawable.media_sticker_stroke, 0);
        dqVar.c(org.telegram.messenger.i0.L(20.0f));
        dqVar.r = org.telegram.messenger.i0.L(-3.0f);
        spannableStringBuilder.setSpan(dqVar, 0, 1, 0);
        spannableStringBuilder.append((CharSequence) " ").append((CharSequence) cd.L0(2131745694, null));
        i(spannableStringBuilder, z10, true);
    }

    public void setRad(int i10) {
        this.p0 = i10;
        setForeground(t6.a0(t6.w0(t6.i6, this.o0), i10, i10));
    }

    public void setRestoreState(boolean z10) {
        this.m0 = 4;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("d");
        dq dqVar = new dq(R.drawable.media_button_restore, 0);
        dqVar.c(org.telegram.messenger.i0.L(20.0f));
        dqVar.r = org.telegram.messenger.i0.L(-3.0f);
        spannableStringBuilder.setSpan(dqVar, 0, 1, 0);
        spannableStringBuilder.append((CharSequence) " ").append((CharSequence) cd.L0(2131745693, null));
        i(spannableStringBuilder, z10, true);
    }

    public void setUndoCutState(boolean z10) {
        this.m0 = 1;
    }

    public void setUndoState(boolean z10) {
        this.m0 = 5;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("d");
        dq dqVar = new dq(R.drawable.photo_undo2, 0);
        dqVar.c(org.telegram.messenger.i0.L(20.0f));
        dqVar.r = org.telegram.messenger.i0.L(-3.0f);
        spannableStringBuilder.setSpan(dqVar, 0, 1, 0);
        spannableStringBuilder.append((CharSequence) " ").append((CharSequence) cd.L0(2131745691, null));
        i(spannableStringBuilder, z10, true);
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        if (Build.VERSION.SDK_INT < 24) {
            super.setVisibility(8);
        } else {
            super.setVisibility(i10);
        }
    }
}
