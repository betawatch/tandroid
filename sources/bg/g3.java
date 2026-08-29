package bg;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.os.Build;
import android.text.SpannableStringBuilder;
import android.view.ContextThemeWrapper;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.ga;
import org.telegram.ui.Components.iq;
import org.telegram.ui.Components.ka;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public abstract class g3 extends nh.d {
    public final ka d0;
    public final RectF e0;
    public int f0;
    public final u3 g0;
    public final c6 h0;
    public int i0;
    public boolean j0;

    public g3(u3 u3Var, ContextThemeWrapper contextThemeWrapper, c6 c6Var, ga gaVar) {
        super(contextThemeWrapper, c6Var, false);
        this.e0 = new RectF();
        this.i0 = 8;
        this.h0 = c6Var;
        this.g0 = u3Var;
        this.d0 = new ka(gaVar, this, 0, true);
        setWillNotDraw(false);
        setTextColor(-1);
        setFlickeringLoading(true);
        this.d.u(AndroidUtilities.bold());
        removeView(this.r);
        setForeground(g6.Y(g6.l1(0.08f, -1), 8, 8));
        setPadding(AndroidUtilities.dp(24.0f), 0, AndroidUtilities.dp(24.0f), 0);
    }

    @Override // nh.d, android.view.View
    public void onDraw(Canvas canvas) {
        boolean z10 = this.W;
        RectF rectF = this.e0;
        if (z10) {
            float d = this.d.d() + getPaddingLeft() + getPaddingRight();
            rectF.set((getMeasuredWidth() - d) / 2.0f, 0.0f, (getMeasuredWidth() + d) / 2.0f, getMeasuredHeight());
        } else {
            rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        }
        super.onDraw(canvas);
    }

    @Override // nh.d, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        if (this.j0) {
            i10 = View.MeasureSpec.makeMeasureSpec(getPaddingRight() + getPaddingLeft() + ((int) this.d.d()), TLObject.FLAG_30);
        }
        super.onMeasure(i10, i11);
    }

    @Override // android.view.View
    public void setAlpha(float f9) {
        r3[] r3VarArr;
        u3 u3Var = this.g0;
        if (!u3Var.y || (r3VarArr = u3Var.D) == null || r3VarArr.length <= 0) {
            f9 = 0.0f;
        }
        super.setAlpha(f9);
    }

    public void setCancelState(boolean z10) {
        this.f0 = 2;
        g(LocaleController.getString(R.string.Cancel), z10, true);
    }

    public void setCutOutState(boolean z10) {
        this.f0 = 0;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("d");
        iq iqVar = new iq(R.drawable.media_magic_cut, 0);
        iqVar.setSize(AndroidUtilities.dp(22.0f));
        iqVar.setTranslateX(AndroidUtilities.dp(1.0f));
        iqVar.setTranslateY(AndroidUtilities.dp(2.0f));
        iqVar.spaceScaleX = 1.2f;
        spannableStringBuilder.setSpan(iqVar, 0, 1, 0);
        spannableStringBuilder.append((CharSequence) " ").append((CharSequence) LocaleController.getString(R.string.SegmentationCutObject));
        g(spannableStringBuilder, z10, true);
    }

    public void setEraseState(boolean z10) {
        this.f0 = 3;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("d");
        iq iqVar = new iq(R.drawable.media_button_erase, 0);
        iqVar.setSize(AndroidUtilities.dp(20.0f));
        iqVar.setTranslateX(AndroidUtilities.dp(-3.0f));
        spannableStringBuilder.setSpan(iqVar, 0, 1, 0);
        spannableStringBuilder.append((CharSequence) " ").append((CharSequence) LocaleController.getString(R.string.SegmentationErase));
        g(spannableStringBuilder, z10, true);
    }

    public void setOutlineState(boolean z10) {
        this.f0 = 6;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("d");
        iq iqVar = new iq(R.drawable.media_sticker_stroke, 0);
        iqVar.setSize(AndroidUtilities.dp(20.0f));
        iqVar.setTranslateX(AndroidUtilities.dp(-3.0f));
        spannableStringBuilder.setSpan(iqVar, 0, 1, 0);
        spannableStringBuilder.append((CharSequence) " ").append((CharSequence) LocaleController.getString(R.string.SegmentationOutline));
        g(spannableStringBuilder, z10, true);
    }

    public void setRad(int i10) {
        this.i0 = i10;
        setForeground(g6.Y(g6.v0(g6.i6, this.h0), i10, i10));
    }

    public void setRestoreState(boolean z10) {
        this.f0 = 4;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("d");
        iq iqVar = new iq(R.drawable.media_button_restore, 0);
        iqVar.setSize(AndroidUtilities.dp(20.0f));
        iqVar.setTranslateX(AndroidUtilities.dp(-3.0f));
        spannableStringBuilder.setSpan(iqVar, 0, 1, 0);
        spannableStringBuilder.append((CharSequence) " ").append((CharSequence) LocaleController.getString(R.string.SegmentationRestore));
        g(spannableStringBuilder, z10, true);
    }

    public void setUndoCutState(boolean z10) {
        this.f0 = 1;
    }

    public void setUndoState(boolean z10) {
        this.f0 = 5;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("d");
        iq iqVar = new iq(R.drawable.photo_undo2, 0);
        iqVar.setSize(AndroidUtilities.dp(20.0f));
        iqVar.setTranslateX(AndroidUtilities.dp(-3.0f));
        spannableStringBuilder.setSpan(iqVar, 0, 1, 0);
        spannableStringBuilder.append((CharSequence) " ").append((CharSequence) LocaleController.getString(R.string.SegmentationUndo));
        g(spannableStringBuilder, z10, true);
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
