// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class awa extends View implements tjb {
    public PorterDuffColorFilter a;
    public int b;
    public final boolean c;
    public final ArrayList d;
    public final ArrayList e;
    public final Paint f;
    public final lm h;
    public float n;
    public zva r;
    public p8c s;
    public final /* synthetic */ bwa w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public awa(bwa bwaVar, Context context, boolean z) {
        super(context);
        this.w = bwaVar;
        this.d = new ArrayList();
        this.e = new ArrayList();
        Paint paint = new Paint(1);
        this.f = paint;
        this.h = new lm(this, 0L, 320L, s33.h);
        this.c = z;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setStrokeWidth(gl.L(3.0f));
        paint.setColor(bkb.v0(bkb.g5, bwaVar.l1));
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        ArrayList arrayList = this.d;
        this.n = this.h.e(false, arrayList.size());
        int i = 0;
        while (true) {
            ArrayList arrayList2 = this.e;
            if (i >= arrayList2.size()) {
                break;
            }
            ((zva) arrayList2.get(i)).a(canvas);
            i++;
        }
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            ((zva) arrayList.get(i2)).a(canvas);
        }
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i = 0;
        while (true) {
            ArrayList arrayList = this.d;
            if (i >= arrayList.size()) {
                return;
            }
            ((zva) arrayList.get(i)).k.I();
            i++;
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i = 0;
        while (true) {
            ArrayList arrayList = this.d;
            if (i >= arrayList.size()) {
                return;
            }
            ((zva) arrayList.get(i)).k.K();
            i++;
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        zva zvaVar;
        p8c p8cVar;
        if (motionEvent.getAction() == 0) {
            zva zvaVar2 = this.r;
            if (zvaVar2 != null) {
                zvaVar2.q.c(false);
            }
            this.r = null;
            int i = 0;
            while (true) {
                ArrayList arrayList = this.d;
                if (i >= arrayList.size()) {
                    break;
                }
                if (((zva) arrayList.get(i)).b.contains(motionEvent.getX(), motionEvent.getY())) {
                    this.r = (zva) arrayList.get(i);
                    break;
                }
                i++;
            }
            zva zvaVar3 = this.r;
            if (zvaVar3 != null) {
                zvaVar3.q.c(true);
            }
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            if (motionEvent.getAction() == 1 && (zvaVar = this.r) != null && !zvaVar.p && zvaVar.b.contains(motionEvent.getX(), motionEvent.getY()) && (p8cVar = this.s) != null) {
                p8cVar.a(Long.valueOf(this.r.j));
            }
            zva zvaVar4 = this.r;
            if (zvaVar4 != null) {
                zvaVar4.q.c(false);
            }
            this.r = null;
        }
        return this.r != null;
    }

    public void setMyPrivacy(long j) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.d;
            if (i >= arrayList.size()) {
                return;
            }
            zva zvaVar = (zva) arrayList.get(i);
            if (zvaVar.i) {
                zvaVar.b(j);
                return;
            }
            i++;
        }
    }

    public void setOnSenderClickListener(p8c p8cVar) {
        this.s = p8cVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v3, types: [lm] */
    /* JADX WARN: Type inference failed for: r11v4, types: [lm] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8, types: [android.graphics.Typeface] */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5, types: [zva] */
    /* JADX WARN: Type inference failed for: r9v6, types: [java.lang.Object, zva] */
    /* JADX WARN: Type inference failed for: r9v7, types: [java.lang.Object, zva] */
    /* JADX WARN: Type inference failed for: r9v9, types: [zva] */
    public void setSenders(ArrayList<wva> arrayList) {
        ArrayList arrayList2;
        cm2[] cm2VarArr;
        ?? r7;
        ?? r8;
        ?? r9;
        ?? r2;
        String s;
        ArrayList<wva> arrayList3 = arrayList;
        int i = 0;
        while (true) {
            arrayList2 = this.d;
            int size = arrayList2.size();
            cm2VarArr = null;
            wva wvaVar = null;
            r7 = this.e;
            r8 = 1;
            if (i >= size) {
                break;
            }
            zva zvaVar = (zva) arrayList2.get(i);
            for (int i2 = 0; i2 < arrayList3.size(); i2++) {
                wva wvaVar2 = arrayList3.get(i2);
                boolean z = wvaVar2.b;
                if ((z && zvaVar.i) || (!zvaVar.i && !z && wvaVar2.c == zvaVar.j)) {
                    wvaVar = arrayList3.get(i2);
                    break;
                }
            }
            if (wvaVar == null) {
                zvaVar.k.K();
                arrayList2.remove(i);
                i--;
                zvaVar.a = -1;
                r7.add(zvaVar);
            }
            i++;
        }
        int i3 = 0;
        while (i3 < arrayList3.size()) {
            wva wvaVar3 = arrayList3.get(i3);
            for (int i4 = 0; i4 < arrayList2.size(); i4++) {
                zva zvaVar2 = (zva) arrayList2.get(i4);
                if (!zvaVar2.i) {
                    if (!wvaVar3.b && zvaVar2.j == wvaVar3.c) {
                        r9 = (zva) arrayList2.get(i4);
                        break;
                    }
                } else {
                    if (wvaVar3.b) {
                        r9 = (zva) arrayList2.get(i4);
                        break;
                    }
                }
            }
            r9 = cm2VarArr;
            if (r9 == null) {
                for (int i5 = 0; i5 < r7.size(); i5++) {
                    zva zvaVar3 = (zva) r7.get(i5);
                    if (!zvaVar3.i) {
                        if (!wvaVar3.b && zvaVar3.j == wvaVar3.c) {
                            r9 = (zva) r7.get(i5);
                            break;
                        }
                    } else {
                        if (wvaVar3.b) {
                            r9 = (zva) r7.get(i5);
                            break;
                        }
                    }
                }
                if (r9 != null) {
                    r7.remove(r9);
                    r9.k.I();
                    arrayList2.add(r9);
                }
            }
            if (r9 == null) {
                r9 = new zva(this, wvaVar3.b, wvaVar3.c);
                r9.d.e(r8, 0.0f);
                arrayList2.add(r9);
                r9.c.e(r8, (arrayList3.size() - r8) - i3);
            }
            awa awaVar = r9.w;
            bwa bwaVar = awaVar.w;
            r9.a = (arrayList3.size() - r8) - i3;
            long j = wvaVar3.d;
            Paint paint = r9.h;
            r9.o = new tgb(jva.T0("⭐️".concat(k96.E(j, ',')), 0.85f, cm2VarArr), 12.0f, gl.n1("fonts/num.otf"));
            boolean z2 = awaVar.c;
            int i6 = bwaVar.m1;
            if (z2) {
                int i7 = (int) j;
                r9.f = new LinearGradient(0.0f, 0.0f, 0.0f, gl.L(16.0f), new int[]{de5.b(i6, i7, 4), de5.b(i6, i7, 3)}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                r9.r = bm2.f(0.5f, de5.b(i6, i7, 4), de5.b(i6, i7, 3));
                paint.setShader(r9.f);
            } else {
                paint.setShader(null);
                r9.r = -1002750;
                paint.setColor(-1002750);
            }
            Drawable drawable = r9.s;
            if (drawable != null) {
                drawable.setColorFilter(new PorterDuffColorFilter(r9.r, PorterDuff.Mode.SRC_IN));
            }
            if (this.c) {
                int i8 = i3 + 1;
                r9.v = i8;
                r9.u = new tgb(String.valueOf(i8), 10.0f, gl.n1("fonts/num.otf"));
                if (i8 > 0 && r9.s == null) {
                    Drawable mutate = awaVar.getContext().getResources().getDrawable(R.drawable.filled_stream_crown).mutate();
                    r9.s = mutate;
                    int i9 = r9.r;
                    PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                    mutate.setColorFilter(new PorterDuffColorFilter(i9, mode));
                    Drawable mutate2 = awaVar.getContext().getResources().getDrawable(R.drawable.filled_stream_crown_outline).mutate();
                    r9.t = mutate2;
                    mutate2.setColorFilter(new PorterDuffColorFilter(bkb.v0(bkb.g5, bwaVar.l1), mode));
                }
            }
            if (wvaVar3.b) {
                r9.b(this.w.y1);
            } else {
                boolean z3 = wvaVar3.a;
                if (!r9.i && r9.p != z3) {
                    r9.p = z3;
                    if (z3) {
                        r2 = null;
                        s = k96.M0(2131744811, null);
                    } else {
                        r2 = null;
                        s = cf3.s(r9.j);
                    }
                    r9.n = new tgb(s, 12.0f, r2);
                    awaVar.invalidate();
                    i3++;
                    arrayList3 = arrayList;
                    cm2VarArr = r2;
                    r8 = 1;
                }
            }
            r2 = null;
            i3++;
            arrayList3 = arrayList;
            cm2VarArr = r2;
            r8 = 1;
        }
        invalidate();
    }

    @Override // tjb
    public final void updateColors() {
        Drawable drawable;
        ArrayList arrayList = this.d;
        try {
            int v0 = bkb.v0(bkb.g5, this.w.l1);
            this.f.setColor(v0);
            if (this.a == null || v0 != this.b) {
                this.b = v0;
                this.a = new PorterDuffColorFilter(v0, PorterDuff.Mode.SRC_IN);
            }
            for (int i = 0; i < arrayList.size(); i++) {
                zva zvaVar = (zva) arrayList.get(i);
                if (zvaVar != null && (drawable = zvaVar.t) != null) {
                    ColorFilter colorFilter = drawable.getColorFilter();
                    PorterDuffColorFilter porterDuffColorFilter = this.a;
                    if (colorFilter != porterDuffColorFilter) {
                        zvaVar.t.setColorFilter(porterDuffColorFilter);
                    }
                }
            }
            invalidate();
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    @Override // tjb
    public final void addColorKeys(HashSet hashSet) {
    }
}
