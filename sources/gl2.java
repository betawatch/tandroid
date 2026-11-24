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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public abstract class gl2 extends EditTextBoldCursor {
    public static final ika d2;
    public static final ika e2;
    public static final ika f2;
    public static final ika g2;
    public float M1;
    public float N1;
    public float O1;
    public float P1;
    public zna Q1;
    public zna R1;
    public zna S1;
    public zna T1;
    public boolean U1;
    public float V1;
    public float W1;
    public boolean X1;
    public Bitmap Y1;
    public Canvas Z1;
    public ValueAnimator a2;
    public ValueAnimator b2;
    public boolean c2;

    static {
        ika ikaVar = new ika(new a32((byte) 11), new a32((byte) 12));
        ikaVar.c = 100.0f;
        d2 = ikaVar;
        ika ikaVar2 = new ika(new a32((byte) 13), new a32((byte) 14));
        ikaVar2.c = 100.0f;
        e2 = ikaVar2;
        ika ikaVar3 = new ika(new a32((byte) 15), new a32((byte) 16));
        ikaVar3.c = 100.0f;
        f2 = ikaVar3;
        ika ikaVar4 = new ika(new a32((byte) 17), new a32((byte) 18));
        ikaVar4.c = 100.0f;
        g2 = ikaVar4;
    }

    public static void C(zna znaVar, float f) {
        aoa aoaVar = znaVar.m;
        if (aoaVar == null || f != ((float) aoaVar.i)) {
            znaVar.d();
            aoa aoaVar2 = new aoa(f);
            aoaVar2.b(400.0f);
            aoaVar2.a(1.0f);
            aoaVar2.i = f;
            znaVar.m = aoaVar2;
            znaVar.h();
        }
    }

    public final void A(float f) {
        C(this.R1, f * 100.0f);
    }

    public final void B(float f) {
        C(this.Q1, f * 100.0f);
    }

    public final void D(float f) {
        C(this.S1, f * 100.0f);
        zna znaVar = this.T1;
        znaVar.d();
        if (f == 0.0f) {
            this.P1 = 1.0f;
            return;
        }
        aoa j = aq1.j(1.0f, 500.0f, 0.75f);
        j.i = 100.0d;
        znaVar.m = j;
        znaVar.b = 100.0f;
        znaVar.c = true;
        znaVar.a = 4000.0f;
        znaVar.h();
    }

    public final void E() {
        if (getMeasuredHeight() == 0 || getMeasuredWidth() == 0 || getLayout() == null) {
            return;
        }
        Bitmap bitmap = this.Y1;
        if (bitmap == null || bitmap.getHeight() != getMeasuredHeight() || this.Y1.getWidth() != getMeasuredWidth()) {
            Bitmap bitmap2 = this.Y1;
            if (bitmap2 != null) {
                bitmap2.recycle();
            }
            this.Y1 = Bitmap.createBitmap(getMeasuredWidth(), getMeasuredHeight(), Bitmap.Config.ARGB_8888);
            this.Z1 = new Canvas(this.Y1);
        }
        this.Y1.eraseColor(0);
        StaticLayout staticLayout = new StaticLayout(getTransformationMethod().getTransformation(getText(), this), getLayout().getPaint(), (int) Math.ceil(getLayout().getPaint().measureText(r4, 0, r4.length())), Layout.Alignment.ALIGN_NORMAL, getLineSpacingMultiplier(), getLineSpacingExtra(), getIncludeFontPadding());
        this.Z1.save();
        this.Z1.translate((getMeasuredWidth() - staticLayout.getWidth()) / 2.0f, (getMeasuredHeight() - staticLayout.getHeight()) / 2.0f);
        staticLayout.draw(this.Z1);
        this.Z1.restore();
        this.W1 = 0.0f;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.b2 = ofFloat;
        ofFloat.addUpdateListener(new et1(this, (byte) 12));
        this.b2.setDuration(220L);
        this.b2.start();
    }

    public float getErrorProgress() {
        return this.N1;
    }

    public float getFocusedProgress() {
        return this.M1;
    }

    public float getSuccessProgress() {
        return this.O1;
    }

    public float getSuccessScaleProgress() {
        return this.P1;
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, vu3, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.Q1.d();
        this.R1.d();
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
            this.c2 = true;
            motionEvent.getX();
            motionEvent.getY();
        }
        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            tk2 tk2Var = getParent() instanceof tk2 ? (tk2) getParent() : null;
            byte b = 0;
            if (motionEvent.getAction() == 1 && this.c2) {
                if (!isFocused() || tk2Var == null) {
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
                        startActionMode(new fl2(this, b));
                    }
                }
                setSelection(0);
                if (this.U1) {
                    gm.E3(this);
                }
            }
            this.c2 = false;
        }
        return this.c2;
    }

    @Override // android.view.View
    public final boolean requestFocus(int i, Rect rect) {
        ((ViewGroup) getParent()).invalidate();
        return super.requestFocus(i, rect);
    }

    public void setShowSoftInputOnFocusCompat(boolean z) {
        this.U1 = z;
        setShowSoftInputOnFocus(z);
    }
}
