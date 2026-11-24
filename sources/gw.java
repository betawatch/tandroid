// default package

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.SpannableString;
import android.text.StaticLayout;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.o;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class gw extends FrameLayout implements fkb, dx {
    public final ui5 a;
    public final ey b;
    public bx c;
    public final ew d;
    public final fw e;
    public TL_iv.pageBlockPreformatted f;
    public CharSequence h;
    public boolean n;
    public int r;
    public final Paint s;

    public gw(Activity activity, final ui5 ui5Var, ey eyVar) {
        super(activity);
        this.s = new Paint();
        this.a = ui5Var;
        this.b = eyVar;
        ew ewVar = new ew(this, activity, ui5Var);
        this.d = ewVar;
        ewVar.setPadding(0, gm.L(8.0f), 0, gm.L(8.0f));
        addView(ewVar, qoe.c(-2.0f, -1));
        fw fwVar = new fw(this, activity, ui5Var, eyVar);
        this.e = fwVar;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -1);
        int L = gm.L(16.0f);
        layoutParams.rightMargin = L;
        layoutParams.leftMargin = L;
        int L2 = gm.L(12.0f);
        layoutParams.bottomMargin = L2;
        layoutParams.topMargin = L2;
        nm7.i(fwVar);
        ewVar.addView(fwVar, layoutParams);
        ewVar.setOnScrollChangeListener(new View.OnScrollChangeListener() { // from class: dw
            @Override // android.view.View.OnScrollChangeListener
            public final void onScrollChange(View view, int i, int i2, int i3, int i4) {
                gkb gkbVar = ((o) ui5.this).Q0;
                if (gkbVar == null || !gkbVar.w()) {
                    return;
                }
                gkbVar.v();
            }
        });
        setWillNotDraw(false);
    }

    private static void setDiffMarkerSpans(SpannableString spannableString) {
        int i = 0;
        while (i <= spannableString.length()) {
            int indexOf = TextUtils.indexOf((CharSequence) spannableString, '\n', i);
            if (indexOf < 0) {
                indexOf = spannableString.length();
            }
            int e = al6.e(i, spannableString);
            if (e == 1) {
                spannableString.setSpan(new xk2(19), i, i + 1, 33);
            } else if (e == 2) {
                spannableString.setSpan(new xk2(20), i, i + 1, 33);
            } else if (e == 3 && indexOf > i) {
                spannableString.setSpan(new xk2(6), i, indexOf, 33);
            }
            i = indexOf + 1;
        }
    }

    public final SpannableString a(CharSequence charSequence, String str) {
        SpannableString spannableString = new SpannableString(charSequence);
        setDiffMarkerSpans(spannableString);
        Pattern pattern = al6.a;
        char[] cArr = new char[spannableString.length()];
        int i = 0;
        for (int i2 = 0; i2 <= spannableString.length(); i2++) {
            if (i2 >= spannableString.length() || spannableString.charAt(i2) == '\n') {
                int e = al6.e(i, spannableString);
                int i3 = i;
                while (i3 < i2) {
                    cArr[i3] = (e == 3 || i3 == i) ? ' ' : spannableString.charAt(i3);
                    i3++;
                }
                if (i2 < spannableString.length()) {
                    cArr[i2] = '\n';
                }
                i = i2 + 1;
            }
        }
        String str2 = new String(cArr);
        pf2 pf2Var = new pf2(this, spannableString, (byte) 28);
        ml8 ml8Var = el2.a;
        if (str2.length() == spannableString.length()) {
            String b = ml8.b(str);
            if (!b.isEmpty() && !str2.isEmpty()) {
                el2.a.d(str2, b, new x92((Object) spannableString, (Object) pf2Var, (byte) 6));
            }
        }
        return spannableString;
    }

    public final /* synthetic */ void b(SpannableString spannableString) {
        setDiffMarkerSpans(spannableString);
        if (this.h == spannableString) {
            this.e.requestLayout();
            invalidate();
        }
    }

    @Override // dx
    public int getBoundLeft() {
        if (this.c == null) {
            return -1;
        }
        return wi8.h(this.a, 18.0f, this.c.k() + gm.L(16.0f));
    }

    @Override // dx
    public int getBoundRight() {
        if (this.c == null) {
            return -1;
        }
        return wi8.C(this.a, 18.0f, this.c.l() + gm.L(16.0f));
    }

    @Override // dx
    public int getLastLineBoundRight() {
        if (this.c == null) {
            return -1;
        }
        return wi8.C(this.a, 18.0f, this.c.m() + gm.L(16.0f));
    }

    public /* bridge */ /* synthetic */ int getMinWidth() {
        return wi8.a(this);
    }

    @Override // android.view.View, nkb
    public final void invalidate() {
        this.e.invalidate();
        super.invalidate();
    }

    @Override // fkb
    public final void k(ArrayList arrayList) {
        bx bxVar = this.c;
        if (bxVar != null) {
            arrayList.add(bxVar);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        bx bxVar = this.c;
        if (bxVar != null) {
            bxVar.i(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        bx bxVar = this.c;
        if (bxVar != null) {
            bxVar.f(this);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        StaticLayout staticLayout;
        TL_iv.pageBlockPreformatted pageblockpreformatted = this.f;
        if (pageblockpreformatted != null) {
            if (!pageblockpreformatted.diff) {
                canvas.drawRect(0.0f, pageblockpreformatted.continuesPrev ? 0.0f : gm.L(8.0f), getMeasuredWidth(), getMeasuredHeight() - (this.f.continuesNext ? 0 : gm.L(8.0f)), o.r1);
                return;
            }
            bx bxVar = this.c;
            if (bxVar == null || (staticLayout = bxVar.d) == null) {
                return;
            }
            CharSequence text = staticLayout.getText();
            int top = this.e.getTop() + this.d.getTop();
            int lineCount = staticLayout.getLineCount();
            int i = 0;
            while (i < lineCount) {
                int e = al6.e(staticLayout.getLineStart(i), text);
                Paint paint = this.s;
                if (e == 1) {
                    paint.setColor(640993113);
                } else if (e == 2) {
                    paint.setColor(654261040);
                } else {
                    i++;
                }
                canvas.drawRect(0.0f, staticLayout.getLineTop(i) + top, getMeasuredWidth(), staticLayout.getLineBottom(i) + top + (i == lineCount + (-1) ? this.r : 0), paint);
                i++;
            }
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.TextView");
        accessibilityNodeInfo.setEnabled(true);
        accessibilityNodeInfo.setClickable(false);
        accessibilityNodeInfo.setLongClickable(false);
        bx bxVar = this.c;
        if (bxVar == null) {
            return;
        }
        accessibilityNodeInfo.setText(o.f(2131754870, o.g(this.a, this.b, bxVar)));
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30);
        ew ewVar = this.d;
        ewVar.measure(makeMeasureSpec, 0);
        setMeasuredDimension(size, ewVar.getMeasuredHeight());
    }

    public void setBlock(TL_iv.pageBlockPreformatted pageblockpreformatted) {
        ey eyVar;
        this.h = null;
        this.f = pageblockpreformatted;
        this.n = true;
        int i = (!pageblockpreformatted.diff || (eyVar = this.b) == null) ? 0 : eyVar.I;
        ew ewVar = this.d;
        ewVar.setScrollX(i);
        this.n = false;
        ewVar.setHorizontalScrollBarEnabled(!pageblockpreformatted.diff);
        ewVar.setPadding(0, pageblockpreformatted.continuesPrev ? 0 : gm.L(8.0f), 0, pageblockpreformatted.continuesNext ? 0 : gm.L(8.0f));
        fw fwVar = this.e;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) fwVar.getLayoutParams();
        marginLayoutParams.topMargin = pageblockpreformatted.continuesPrev ? 0 : gm.L(12.0f);
        marginLayoutParams.bottomMargin = pageblockpreformatted.continuesNext ? 0 : gm.L(12.0f);
        fwVar.requestLayout();
    }
}
