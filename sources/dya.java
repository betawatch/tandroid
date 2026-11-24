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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class dya extends View implements vlb {
    public PorterDuffColorFilter a;
    public int b;
    public final boolean c;
    public final ArrayList d;
    public final ArrayList e;
    public final Paint f;
    public final ln h;
    public float n;
    public cya r;
    public qac s;
    public final /* synthetic */ eya w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dya(eya eyaVar, Context context, boolean z) {
        super(context);
        this.w = eyaVar;
        this.d = new ArrayList();
        this.e = new ArrayList();
        Paint paint = new Paint(1);
        this.f = paint;
        this.h = new ln(this, 0L, 320L, d53.h);
        this.c = z;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setStrokeWidth(gm.L(3.0f));
        paint.setColor(cmb.v0(cmb.g5, eyaVar.l1));
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
            ((cya) arrayList2.get(i)).a(canvas);
            i++;
        }
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            ((cya) arrayList.get(i2)).a(canvas);
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
            ((cya) arrayList.get(i)).k.I();
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
            ((cya) arrayList.get(i)).k.K();
            i++;
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        cya cyaVar;
        qac qacVar;
        if (motionEvent.getAction() == 0) {
            cya cyaVar2 = this.r;
            if (cyaVar2 != null) {
                cyaVar2.q.c(false);
            }
            this.r = null;
            int i = 0;
            while (true) {
                ArrayList arrayList = this.d;
                if (i >= arrayList.size()) {
                    break;
                }
                if (((cya) arrayList.get(i)).b.contains(motionEvent.getX(), motionEvent.getY())) {
                    this.r = (cya) arrayList.get(i);
                    break;
                }
                i++;
            }
            cya cyaVar3 = this.r;
            if (cyaVar3 != null) {
                cyaVar3.q.c(true);
            }
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            if (motionEvent.getAction() == 1 && (cyaVar = this.r) != null && !cyaVar.p && cyaVar.b.contains(motionEvent.getX(), motionEvent.getY()) && (qacVar = this.s) != null) {
                qacVar.a(Long.valueOf(this.r.j));
            }
            cya cyaVar4 = this.r;
            if (cyaVar4 != null) {
                cyaVar4.q.c(false);
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
            cya cyaVar = (cya) arrayList.get(i);
            if (cyaVar.i) {
                cyaVar.b(j);
                return;
            }
            i++;
        }
    }

    public void setOnSenderClickListener(qac qacVar) {
        this.s = qacVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v3, types: [ln] */
    /* JADX WARN: Type inference failed for: r11v4, types: [ln] */
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
    /* JADX WARN: Type inference failed for: r9v5, types: [cya] */
    /* JADX WARN: Type inference failed for: r9v6, types: [cya, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v7, types: [cya, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v9, types: [cya] */
    public void setSenders(ArrayList<zxa> arrayList) {
        ArrayList arrayList2;
        pn2[] pn2VarArr;
        ?? r7;
        ?? r8;
        ?? r9;
        ?? r2;
        String s;
        ArrayList<zxa> arrayList3 = arrayList;
        int i = 0;
        while (true) {
            arrayList2 = this.d;
            int size = arrayList2.size();
            pn2VarArr = null;
            zxa zxaVar = null;
            r7 = this.e;
            r8 = 1;
            if (i >= size) {
                break;
            }
            cya cyaVar = (cya) arrayList2.get(i);
            for (int i2 = 0; i2 < arrayList3.size(); i2++) {
                zxa zxaVar2 = arrayList3.get(i2);
                boolean z = zxaVar2.b;
                if ((z && cyaVar.i) || (!cyaVar.i && !z && zxaVar2.c == cyaVar.j)) {
                    zxaVar = arrayList3.get(i2);
                    break;
                }
            }
            if (zxaVar == null) {
                cyaVar.k.K();
                arrayList2.remove(i);
                i--;
                cyaVar.a = -1;
                r7.add(cyaVar);
            }
            i++;
        }
        int i3 = 0;
        while (i3 < arrayList3.size()) {
            zxa zxaVar3 = arrayList3.get(i3);
            for (int i4 = 0; i4 < arrayList2.size(); i4++) {
                cya cyaVar2 = (cya) arrayList2.get(i4);
                if (!cyaVar2.i) {
                    if (!zxaVar3.b && cyaVar2.j == zxaVar3.c) {
                        r9 = (cya) arrayList2.get(i4);
                        break;
                    }
                } else {
                    if (zxaVar3.b) {
                        r9 = (cya) arrayList2.get(i4);
                        break;
                    }
                }
            }
            r9 = pn2VarArr;
            if (r9 == null) {
                for (int i5 = 0; i5 < r7.size(); i5++) {
                    cya cyaVar3 = (cya) r7.get(i5);
                    if (!cyaVar3.i) {
                        if (!zxaVar3.b && cyaVar3.j == zxaVar3.c) {
                            r9 = (cya) r7.get(i5);
                            break;
                        }
                    } else {
                        if (zxaVar3.b) {
                            r9 = (cya) r7.get(i5);
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
                r9 = new cya(this, zxaVar3.b, zxaVar3.c);
                r9.d.e(r8, 0.0f);
                arrayList2.add(r9);
                r9.c.e(r8, (arrayList3.size() - r8) - i3);
            }
            dya dyaVar = r9.w;
            eya eyaVar = dyaVar.w;
            r9.a = (arrayList3.size() - r8) - i3;
            long j = zxaVar3.d;
            Paint paint = r9.h;
            r9.o = new uib(nxa.U0("⭐️".concat(jb6.E(j, ',')), 0.85f, pn2VarArr), 12.0f, gm.n1("fonts/num.otf"));
            boolean z2 = dyaVar.c;
            int i6 = eyaVar.m1;
            if (z2) {
                int i7 = (int) j;
                r9.f = new LinearGradient(0.0f, 0.0f, 0.0f, gm.L(16.0f), new int[]{bg5.b(i6, i7, 4), bg5.b(i6, i7, 3)}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                r9.r = on2.f(0.5f, bg5.b(i6, i7, 4), bg5.b(i6, i7, 3));
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
                r9.u = new uib(String.valueOf(i8), 10.0f, gm.n1("fonts/num.otf"));
                if (i8 > 0 && r9.s == null) {
                    Drawable mutate = dyaVar.getContext().getResources().getDrawable(R.drawable.filled_stream_crown).mutate();
                    r9.s = mutate;
                    int i9 = r9.r;
                    PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                    mutate.setColorFilter(new PorterDuffColorFilter(i9, mode));
                    Drawable mutate2 = dyaVar.getContext().getResources().getDrawable(R.drawable.filled_stream_crown_outline).mutate();
                    r9.t = mutate2;
                    mutate2.setColorFilter(new PorterDuffColorFilter(cmb.v0(cmb.g5, eyaVar.l1), mode));
                }
            }
            if (zxaVar3.b) {
                r9.b(this.w.y1);
            } else {
                boolean z3 = zxaVar3.a;
                if (!r9.i && r9.p != z3) {
                    r9.p = z3;
                    if (z3) {
                        r2 = null;
                        s = jb6.M0(2131744737, null);
                    } else {
                        r2 = null;
                        s = pg3.s(r9.j);
                    }
                    r9.n = new uib(s, 12.0f, r2);
                    dyaVar.invalidate();
                    i3++;
                    arrayList3 = arrayList;
                    pn2VarArr = r2;
                    r8 = 1;
                }
            }
            r2 = null;
            i3++;
            arrayList3 = arrayList;
            pn2VarArr = r2;
            r8 = 1;
        }
        invalidate();
    }

    @Override // vlb
    public final void updateColors() {
        Drawable drawable;
        ArrayList arrayList = this.d;
        try {
            int v0 = cmb.v0(cmb.g5, this.w.l1);
            this.f.setColor(v0);
            if (this.a == null || v0 != this.b) {
                this.b = v0;
                this.a = new PorterDuffColorFilter(v0, PorterDuff.Mode.SRC_IN);
            }
            for (int i = 0; i < arrayList.size(); i++) {
                cya cyaVar = (cya) arrayList.get(i);
                if (cyaVar != null && (drawable = cyaVar.t) != null) {
                    ColorFilter colorFilter = drawable.getColorFilter();
                    PorterDuffColorFilter porterDuffColorFilter = this.a;
                    if (colorFilter != porterDuffColorFilter) {
                        cyaVar.t.setColorFilter(porterDuffColorFilter);
                    }
                }
            }
            invalidate();
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    @Override // vlb
    public final void addColorKeys(HashSet hashSet) {
    }
}
