package eg;

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
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.ba;
import org.telegram.ui.Components.fa;
import org.telegram.ui.Components.oq;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public abstract class a3 extends qh.d {
    public final fa e0;
    public final RectF f0;
    public int g0;
    public final o3 h0;
    public final g6 i0;
    public int j0;
    public boolean k0;

    public a3(o3 o3Var, ContextThemeWrapper contextThemeWrapper, g6 g6Var, ba baVar) {
        super(contextThemeWrapper, g6Var, false);
        this.f0 = new RectF();
        this.j0 = 8;
        this.i0 = g6Var;
        this.h0 = o3Var;
        this.e0 = new fa(baVar, this, 0, true);
        setWillNotDraw(false);
        setTextColor(-1);
        setFlickeringLoading(true);
        this.d.u(AndroidUtilities.bold());
        removeView(this.r);
        setForeground(k6.Y(k6.l1(0.08f, -1), 8, 8));
        setPadding(AndroidUtilities.dp(24.0f), 0, AndroidUtilities.dp(24.0f), 0);
    }

    @Override // qh.d, android.view.View
    public void onDraw(Canvas canvas) {
        boolean z4 = this.a0;
        RectF rectF = this.f0;
        if (z4) {
            float d = this.d.d() + getPaddingLeft() + getPaddingRight();
            rectF.set((getMeasuredWidth() - d) / 2.0f, 0.0f, (getMeasuredWidth() + d) / 2.0f, getMeasuredHeight());
        } else {
            rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        }
        super.onDraw(canvas);
    }

    @Override // qh.d, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        if (this.k0) {
            i10 = View.MeasureSpec.makeMeasureSpec(getPaddingRight() + getPaddingLeft() + ((int) this.d.d()), TLObject.FLAG_30);
        }
        super.onMeasure(i10, i11);
    }

    @Override // android.view.View
    public void setAlpha(float f10) {
        l3[] l3VarArr;
        o3 o3Var = this.h0;
        if (!o3Var.y || (l3VarArr = o3Var.E) == null || l3VarArr.length <= 0) {
            f10 = 0.0f;
        }
        super.setAlpha(f10);
    }

    public void setCancelState(boolean z4) {
        this.g0 = 2;
        g(LocaleController.getString(R.string.Cancel), z4, true);
    }

    public void setCutOutState(boolean z4) {
        this.g0 = 0;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("d");
        oq oqVar = new oq(R.drawable.media_magic_cut, 0);
        oqVar.setSize(AndroidUtilities.dp(22.0f));
        oqVar.setTranslateX(AndroidUtilities.dp(1.0f));
        oqVar.setTranslateY(AndroidUtilities.dp(2.0f));
        oqVar.spaceScaleX = 1.2f;
        spannableStringBuilder.setSpan(oqVar, 0, 1, 0);
        spannableStringBuilder.append((CharSequence) " ").append((CharSequence) LocaleController.getString(R.string.SegmentationCutObject));
        g(spannableStringBuilder, z4, true);
    }

    public void setEraseState(boolean z4) {
        this.g0 = 3;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("d");
        oq oqVar = new oq(R.drawable.media_button_erase, 0);
        oqVar.setSize(AndroidUtilities.dp(20.0f));
        oqVar.setTranslateX(AndroidUtilities.dp(-3.0f));
        spannableStringBuilder.setSpan(oqVar, 0, 1, 0);
        spannableStringBuilder.append((CharSequence) " ").append((CharSequence) LocaleController.getString(R.string.SegmentationErase));
        g(spannableStringBuilder, z4, true);
    }

    public void setOutlineState(boolean z4) {
        this.g0 = 6;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("d");
        oq oqVar = new oq(R.drawable.media_sticker_stroke, 0);
        oqVar.setSize(AndroidUtilities.dp(20.0f));
        oqVar.setTranslateX(AndroidUtilities.dp(-3.0f));
        spannableStringBuilder.setSpan(oqVar, 0, 1, 0);
        spannableStringBuilder.append((CharSequence) " ").append((CharSequence) LocaleController.getString(R.string.SegmentationOutline));
        g(spannableStringBuilder, z4, true);
    }

    public void setRad(int i10) {
        this.j0 = i10;
        setForeground(k6.Y(k6.v0(k6.i6, this.i0), i10, i10));
    }

    public void setRestoreState(boolean z4) {
        this.g0 = 4;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("d");
        oq oqVar = new oq(R.drawable.media_button_restore, 0);
        oqVar.setSize(AndroidUtilities.dp(20.0f));
        oqVar.setTranslateX(AndroidUtilities.dp(-3.0f));
        spannableStringBuilder.setSpan(oqVar, 0, 1, 0);
        spannableStringBuilder.append((CharSequence) " ").append((CharSequence) LocaleController.getString(R.string.SegmentationRestore));
        g(spannableStringBuilder, z4, true);
    }

    public void setUndoCutState(boolean z4) {
        this.g0 = 1;
    }

    public void setUndoState(boolean z4) {
        this.g0 = 5;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("d");
        oq oqVar = new oq(R.drawable.photo_undo2, 0);
        oqVar.setSize(AndroidUtilities.dp(20.0f));
        oqVar.setTranslateX(AndroidUtilities.dp(-3.0f));
        spannableStringBuilder.setSpan(oqVar, 0, 1, 0);
        spannableStringBuilder.append((CharSequence) " ").append((CharSequence) LocaleController.getString(R.string.SegmentationUndo));
        g(spannableStringBuilder, z4, true);
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
