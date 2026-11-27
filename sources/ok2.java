// default package

import android.animation.ValueAnimator;
import android.content.ClipData;
import android.content.ClipDescription;
import android.content.ClipboardManager;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.text.Layout;
import android.text.StaticLayout;
import android.view.MotionEvent;
import android.view.ViewGroup;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public abstract class ok2 extends EditTextBoldCursor {
    public static final bma e2;
    public static final bma f2;
    public static final bma g2;
    public static final bma h2;
    public float N1;
    public float O1;
    public float P1;
    public float Q1;
    public vpa R1;
    public vpa S1;
    public vpa T1;
    public vpa U1;
    public boolean V1;
    public float W1;
    public float X1;
    public boolean Y1;
    public Bitmap Z1;
    public Canvas a2;
    public ValueAnimator b2;
    public ValueAnimator c2;
    public boolean d2;

    static {
        bma bmaVar = new bma(new c22((byte) 15), new c22((byte) 16));
        bmaVar.c = 100.0f;
        e2 = bmaVar;
        bma bmaVar2 = new bma(new c22((byte) 17), new c22((byte) 18));
        bmaVar2.c = 100.0f;
        f2 = bmaVar2;
        bma bmaVar3 = new bma(new c22((byte) 19), new c22((byte) 20));
        bmaVar3.c = 100.0f;
        g2 = bmaVar3;
        bma bmaVar4 = new bma(new c22((byte) 21), new c22((byte) 22));
        bmaVar4.c = 100.0f;
        h2 = bmaVar4;
    }

    public static void C(vpa vpaVar, float f) {
        wpa wpaVar = vpaVar.m;
        if (wpaVar == null || f != ((float) wpaVar.i)) {
            vpaVar.d();
            wpa wpaVar2 = new wpa(f);
            wpaVar2.b(400.0f);
            wpaVar2.a(1.0f);
            wpaVar2.i = f;
            vpaVar.m = wpaVar2;
            vpaVar.h();
        }
    }

    public final void A(float f) {
        C(this.S1, f * 100.0f);
    }

    public final void B(float f) {
        C(this.R1, f * 100.0f);
    }

    public final void D(float f) {
        C(this.T1, f * 100.0f);
        vpa vpaVar = this.U1;
        vpaVar.d();
        if (f == 0.0f) {
            this.Q1 = 1.0f;
            return;
        }
        wpa j = bp1.j(1.0f, 500.0f, 0.75f);
        j.i = 100.0d;
        vpaVar.m = j;
        vpaVar.b = 100.0f;
        vpaVar.c = true;
        vpaVar.a = 4000.0f;
        vpaVar.h();
    }

    public final void E() {
        if (getMeasuredHeight() == 0 || getMeasuredWidth() == 0 || getLayout() == null) {
            return;
        }
        Bitmap bitmap = this.Z1;
        if (bitmap == null || bitmap.getHeight() != getMeasuredHeight() || this.Z1.getWidth() != getMeasuredWidth()) {
            Bitmap bitmap2 = this.Z1;
            if (bitmap2 != null) {
                bitmap2.recycle();
            }
            this.Z1 = Bitmap.createBitmap(getMeasuredWidth(), getMeasuredHeight(), Bitmap.Config.ARGB_8888);
            this.a2 = new Canvas(this.Z1);
        }
        this.Z1.eraseColor(0);
        StaticLayout staticLayout = new StaticLayout(getTransformationMethod().getTransformation(getText(), this), getLayout().getPaint(), (int) Math.ceil(getLayout().getPaint().measureText(r4, 0, r4.length())), Layout.Alignment.ALIGN_NORMAL, getLineSpacingMultiplier(), getLineSpacingExtra(), getIncludeFontPadding());
        this.a2.save();
        this.a2.translate((getMeasuredWidth() - staticLayout.getWidth()) / 2.0f, (getMeasuredHeight() - staticLayout.getHeight()) / 2.0f);
        staticLayout.draw(this.a2);
        this.a2.restore();
        this.X1 = 0.0f;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.c2 = ofFloat;
        ofFloat.addUpdateListener(new az1(this, (byte) 11));
        this.c2.setDuration(220L);
        this.c2.start();
    }

    public float getErrorProgress() {
        return this.O1;
    }

    public float getFocusedProgress() {
        return this.N1;
    }

    public float getSuccessProgress() {
        return this.P1;
    }

    public float getSuccessScaleProgress() {
        return this.Q1;
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, cu3, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.R1.d();
        this.S1.d();
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, android.widget.TextView, android.view.View
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        if (isFocused()) {
            return;
        }
        m();
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ClipDescription primaryClipDescription;
        int i;
        if (motionEvent.getAction() == 0) {
            this.d2 = true;
            motionEvent.getX();
            motionEvent.getY();
        }
        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            bk2 bk2Var = getParent() instanceof bk2 ? (bk2) getParent() : null;
            byte b = 0;
            if (motionEvent.getAction() == 1 && this.d2) {
                if (!isFocused() || bk2Var == null) {
                    requestFocus();
                } else {
                    ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService(ClipboardManager.class);
                    if (clipboardManager == null || clipboardManager.getPrimaryClipDescription() == null || (primaryClipDescription = clipboardManager.getPrimaryClipDescription()) == null) {
                        return false;
                    }
                    primaryClipDescription.hasMimeType("text/plain");
                    ClipData.Item itemAt = clipboardManager.getPrimaryClip().getItemAt(0);
                    try {
                        i = Integer.parseInt((itemAt == null || itemAt.getText() == null) ? "" : itemAt.getText().toString());
                    } catch (Exception unused) {
                        i = -1;
                    }
                    if (i > 0) {
                        startActionMode(new nk2(this, b));
                    }
                }
                setSelection(0);
                if (this.V1) {
                    hl.E3(this);
                }
            }
            this.d2 = false;
        }
        return this.d2;
    }

    @Override // android.view.View
    public final boolean requestFocus(int i, Rect rect) {
        ((ViewGroup) getParent()).invalidate();
        return super.requestFocus(i, rect);
    }

    public void setShowSoftInputOnFocusCompat(boolean z) {
        this.V1 = z;
        setShowSoftInputOnFocus(z);
    }
}
