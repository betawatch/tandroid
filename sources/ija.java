// default package

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.widget.FrameLayout;
import java.util.Arrays;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class ija extends FrameLayout implements tjb {
    public final wjb a;
    public final hn b;
    public final hn c;
    public final hn d;
    public final ty0 e;
    public int f;
    public int h;
    public p8c n;
    public hja r;
    public CharSequence s;
    public float w;
    public float x;
    public ValueAnimator y;

    public ija(Context context, wjb wjbVar) {
        super(context);
        this.h = TLObject.FLAG_31;
        this.x = -1.0f;
        this.a = wjbVar;
        hn hnVar = new hn(context, true, true, true);
        this.b = hnVar;
        s33 s33Var = s33.h;
        hnVar.b(0.3f, 220L, s33Var);
        hnVar.setTextSize(gl.L(13.0f));
        int i = bkb.x6;
        zkb.U(hnVar, i, wjbVar);
        hnVar.setGravity(3);
        hnVar.setEmojiCacheType(19);
        hnVar.setEmojiColor(-1);
        hnVar.setImportantForAccessibility(2);
        addView(hnVar, nme.d(-1, 25.0f, 48, 22.0f, 13.0f, 22.0f, 0.0f));
        hn hnVar2 = new hn(context, false, true, true);
        this.c = hnVar2;
        hnVar2.b(0.3f, 220L, s33Var);
        hnVar2.setTextSize(gl.L(13.0f));
        hnVar2.setGravity(17);
        zkb.U(hnVar2, bkb.H6, wjbVar);
        hnVar2.setEmojiColor(-1);
        hnVar2.setEmojiCacheType(19);
        hnVar2.setImportantForAccessibility(2);
        addView(hnVar2, nme.d(-1, 25.0f, 48, 22.0f, 13.0f, 22.0f, 0.0f));
        hn hnVar3 = new hn(context, true, true, true);
        this.d = hnVar3;
        hnVar3.b(0.3f, 220L, s33Var);
        hnVar3.setTextSize(gl.L(13.0f));
        hnVar3.setGravity(5);
        hnVar3.setTextColor(bkb.v0(i, wjbVar));
        hnVar3.setEmojiColor(-1);
        hnVar3.setEmojiCacheType(19);
        hnVar3.setImportantForAccessibility(2);
        addView(hnVar3, nme.d(-1, 25.0f, 48, 22.0f, 13.0f, 22.0f, 0.0f));
        ty0 ty0Var = new ty0(context, false, wjbVar, (byte) 2);
        this.e = ty0Var;
        ty0Var.setReportChanges(true);
        ty0Var.setDelegate(new ln8((Object) this, (byte) 16));
        addView(ty0Var, nme.d(-1, 38.0f, 55, 6.0f, 30.0f, 6.0f, 0.0f));
    }

    public static int[] a(int[] iArr, int i) {
        boolean z = false;
        int i2 = 0;
        for (int i3 : iArr) {
            if (i3 <= i) {
                i2++;
                if (i3 == i) {
                    z = true;
                }
            }
        }
        if (!z) {
            i2++;
        }
        if (i2 == iArr.length) {
            return iArr;
        }
        int[] iArr2 = new int[i2];
        int i4 = 0;
        for (int i5 : iArr) {
            if (i5 <= i) {
                iArr2[i4] = i5;
                i4++;
            }
        }
        if (!z) {
            iArr2[i4] = i;
        }
        return iArr2;
    }

    public final float b(int i) {
        hja hjaVar = this.r;
        if (hjaVar.c != null) {
            int i2 = 1;
            while (true) {
                hja hjaVar2 = this.r;
                int[] iArr = hjaVar2.c;
                if (i2 >= iArr.length) {
                    hjaVar = hjaVar2;
                    break;
                }
                int i3 = iArr[i2 - 1];
                int i4 = iArr[i2];
                if (i >= i3 && i <= i4) {
                    return (1.0f / (iArr.length - 1)) * ((Math.round(((i - i3) / (i4 - i3)) * hjaVar2.d) / this.r.d) + r4);
                }
                i2++;
            }
        }
        return Utilities.l((i - hjaVar.b()) / (this.r.a() - this.r.b()));
    }

    public final int c(int i) {
        if (this.r.c != null) {
            int i2 = 1;
            while (true) {
                int[] iArr = this.r.c;
                if (i2 >= iArr.length) {
                    break;
                }
                int i3 = i2 - 1;
                int i4 = iArr[i3];
                int i5 = iArr[i2];
                if (i >= i4 && i <= i5) {
                    return i3;
                }
                i2++;
            }
        }
        return i;
    }

    public final void d(int i, hja hjaVar, p8c p8cVar) {
        this.f = i;
        this.r = hjaVar;
        this.n = p8cVar;
        this.e.e(false, b(i));
        e(i, false);
    }

    public final void e(int i, boolean z) {
        hja hjaVar = this.r;
        if (hjaVar == null || hjaVar.e == null) {
            return;
        }
        hn hnVar = this.b;
        hnVar.a();
        hn hnVar2 = this.d;
        hnVar2.a();
        hn hnVar3 = this.c;
        hnVar3.a();
        byte b = 0;
        hnVar3.c((CharSequence) this.r.e.g(0, Integer.valueOf(i)), z, true);
        hnVar.c((CharSequence) this.r.e.g(-1, Integer.valueOf(this.r.b())), z, true);
        hnVar2.c((CharSequence) this.r.e.g(1, Integer.valueOf(this.r.a())), z, true);
        hnVar2.c.v(bkb.v0(i >= this.r.a() ? bkb.H6 : bkb.x6, this.a), z);
        hnVar2.invalidate();
        float f = i >= this.r.a() ? 1.0f : 0.0f;
        if (Math.abs(this.x - f) >= 0.01f) {
            ValueAnimator valueAnimator = this.y;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.y = null;
            }
            this.x = f;
            if (z) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.w, f);
                this.y = ofFloat;
                ofFloat.addUpdateListener(new gja(this, b));
                this.y.addListener(new t7(this, f, (byte) 7));
                this.y.setDuration(240L);
                this.y.start();
                return;
            }
            ColorMatrix colorMatrix = new ColorMatrix();
            this.w = f;
            colorMatrix.setSaturation(f);
            if (bkb.I.o()) {
                gl.h(colorMatrix, (1.0f - this.w) * (-0.3f));
            }
            hnVar2.setEmojiColorFilter(new ColorMatrixColorFilter(colorMatrix));
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(gl.L(75.0f), TLObject.FLAG_30));
        if (Build.VERSION.SDK_INT >= 29) {
            setSystemGestureExclusionRects(Arrays.asList(new Rect(0, 0, gl.L(80.0f), getMeasuredHeight()), new Rect(getMeasuredWidth() - gl.L(80.0f), 0, getMeasuredWidth(), getMeasuredHeight())));
        }
    }

    public void setLabel(CharSequence charSequence) {
        this.s = charSequence;
    }

    public void setMinValueAllowed(int i) {
        this.h = i;
        if (this.f < i) {
            this.f = i;
        }
        if (this.r == null) {
            return;
        }
        this.e.setMinProgress(b(i));
        e(this.f, false);
        invalidate();
    }

    @Override // tjb
    public final void updateColors() {
        hn hnVar;
        try {
            hja hjaVar = this.r;
            if (hjaVar == null || (hnVar = this.d) == null) {
                return;
            }
            hnVar.c.v(bkb.v0(this.f >= hjaVar.a() ? bkb.H6 : bkb.x6, this.a), false);
            hnVar.invalidate();
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    @Override // tjb
    public final void addColorKeys(HashSet hashSet) {
    }
}
