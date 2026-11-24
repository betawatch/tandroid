// default package

import android.app.Activity;
import android.graphics.Canvas;
import android.text.Spannable;
import android.text.TextUtils;
import android.text.style.MetricAffectingSpan;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.o;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class cv extends View implements fkb, dx {
    public final ui5 a;
    public final ey b;
    public bx c;
    public int d;
    public final int e;
    public TL_iv.pageBlockAuthorDate f;

    public cv(Activity activity, ui5 ui5Var, ey eyVar) {
        super(activity);
        this.e = gm.L(8.0f);
        this.a = ui5Var;
        this.b = eyVar;
    }

    @Override // dx
    public int getBoundLeft() {
        bx bxVar = this.c;
        if (bxVar == null) {
            return -1;
        }
        return wi8.h(this.a, 18.0f, bxVar.k() + bxVar.s);
    }

    @Override // dx
    public int getBoundRight() {
        bx bxVar = this.c;
        if (bxVar == null) {
            return -1;
        }
        return wi8.C(this.a, 18.0f, bxVar.l() + bxVar.s);
    }

    @Override // dx
    public int getLastLineBoundRight() {
        bx bxVar = this.c;
        if (bxVar == null) {
            return -1;
        }
        return wi8.C(this.a, 18.0f, bxVar.m() + bxVar.s);
    }

    public /* bridge */ /* synthetic */ int getMinWidth() {
        return wi8.a(this);
    }

    @Override // fkb
    public final void k(ArrayList arrayList) {
        bx bxVar = this.c;
        if (bxVar != null) {
            arrayList.add(bxVar);
        }
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        bx bxVar = this.c;
        if (bxVar != null) {
            bxVar.i(this);
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        bx bxVar = this.c;
        if (bxVar != null) {
            bxVar.f(this);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.f == null || this.c == null) {
            return;
        }
        canvas.save();
        canvas.translate(this.d, this.e);
        o.s(this.a, canvas, this, 0);
        this.c.d(canvas, this);
        canvas.restore();
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.TextView");
        accessibilityNodeInfo.setEnabled(true);
        bx bxVar = this.c;
        if (bxVar == null) {
            return;
        }
        accessibilityNodeInfo.setText(o.g(this.a, this.b, bxVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11, types: [android.text.Spannable] */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v28 */
    /* JADX WARN: Type inference failed for: r4v29 */
    /* JADX WARN: Type inference failed for: r4v30 */
    /* JADX WARN: Type inference failed for: r4v9, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r5v5, types: [android.text.Spannable$Factory] */
    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        Spannable spannable;
        MetricAffectingSpan[] metricAffectingSpanArr;
        int indexOf;
        int L;
        int size = View.MeasureSpec.getSize(i);
        TL_iv.pageBlockAuthorDate pageblockauthordate = this.f;
        int i4 = 1;
        if (pageblockauthordate != null) {
            TL_iv.RichText richText = pageblockauthordate.author;
            HashSet hashSet = o.d1;
            ey eyVar = this.b;
            CharSequence z = o.z(this.a, eyVar != null ? eyVar.F : null, this, richText, richText, pageblockauthordate, size);
            i3 = size;
            if (z instanceof Spannable) {
                spannable = (Spannable) z;
                metricAffectingSpanArr = (MetricAffectingSpan[]) spannable.getSpans(0, z.length(), MetricAffectingSpan.class);
            } else {
                spannable = null;
                metricAffectingSpanArr = null;
            }
            CharSequence a0 = (this.f.published_date == 0 || TextUtils.isEmpty(z)) ? !TextUtils.isEmpty(z) ? jb6.a0(null, null, 2131754021, z) : jb6.D0().h0().format(this.f.published_date * 1000) : jb6.a0(null, null, 2131754005, jb6.D0().h0().format(this.f.published_date * 1000), z);
            if (metricAffectingSpanArr != null) {
                try {
                    if (metricAffectingSpanArr.length > 0 && (indexOf = TextUtils.indexOf((CharSequence) a0, z)) != -1) {
                        a0 = Spannable.Factory.getInstance().newSpannable(a0);
                        for (int i5 = 0; i5 < metricAffectingSpanArr.length; i5++) {
                            MetricAffectingSpan metricAffectingSpan = metricAffectingSpanArr[i5];
                            a0.setSpan(metricAffectingSpan, spannable.getSpanStart(metricAffectingSpan) + indexOf, spannable.getSpanEnd(metricAffectingSpanArr[i5]) + indexOf, 33);
                        }
                    }
                } catch (Exception e) {
                    fc4.g(e, true);
                }
            }
            bx m = o.m(this.a, this, a0, null, i3 - gm.L(36.0f), this.e, this.f, this.b);
            this.c = m;
            if (m != null) {
                int height = this.c.d.getHeight() + gm.L(16.0f);
                if (eyVar == null || !eyVar.H) {
                    L = gm.L(18.0f);
                    this.d = L;
                } else {
                    L = (int) Math.floor(((i3 - this.c.d.getLineLeft(0)) - this.c.d.getLineWidth(0)) - gm.L(16.0f));
                    this.d = L;
                }
                bx bxVar = this.c;
                bxVar.s = L;
                bxVar.w = this.e;
                i4 = height;
            } else {
                i4 = 0;
            }
        } else {
            i3 = size;
        }
        setMeasuredDimension(i3, i4);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return o.i(this.a, this.b, motionEvent, this, this.c, this.d, this.e) || super.onTouchEvent(motionEvent);
    }

    public void setBlock(TL_iv.pageBlockAuthorDate pageblockauthordate) {
        this.f = pageblockauthordate;
        requestLayout();
    }
}
